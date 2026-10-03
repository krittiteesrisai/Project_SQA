package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

/**
 * Test suite for {@link PosixParser} targeting high branch/condition coverage
 * and boundary edge cases.
 */
public class PosixParserTest {

    private PosixParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new PosixParser();
        options = new Options();
    }

    /**
     * Edge case: Empty arguments list
     */
    @Test
    public void testFlattenEmptyArgs() {
        String[] args = new String[0];
        String[] result = parser.flatten(options, args, false);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    /**
     * Branch: token.startsWith("--") with and without '='
     */
    @Test
    public void testFlattenLongOptionWithAndWithoutEquals() {
        options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));
        options.addOption(OptionBuilder.withLongOpt("bar").hasArg().create('b'));
        options.addOption(OptionBuilder.withLongOpt("flag").create());

        String[] args = new String[] {
            "--foo=bar",
            "--bar=val1=val2", // Boundary: multiple '='
            "--flag",
            "--"               // Boundary: exact "--"
        };

        String[] result = parser.flatten(options, args, false);
        assertEquals(7, result.length);
        assertEquals("--foo", result[0]);
        assertEquals("bar", result[1]);
        assertEquals("--bar", result[2]);
        assertEquals("val1=val2", result[3]);
        assertEquals("--flag", result[4]);
        assertEquals("--", result[5]);
    }

    /**
     * Boundary: "--=" (starts with "--", contains '=' at index 2, empty key and value)
     */
    @Test
    public void testFlattenLongOptionEmptyKeyValue() {
        String[] args = new String[] { "--=" };
        String[] result = parser.flatten(options, args, false);
        assertEquals(2, result.length);
        assertEquals("--", result[0]);
        assertEquals("", result[1]);
    }

    /**
     * Branch: "-".equals(token) -> processSingleHyphen
     */
    @Test
    public void testFlattenSingleHyphen() {
        String[] args = new String[] { "-", "-" };
        String[] result = parser.flatten(options, args, false);
        assertEquals(2, result.length);
        assertEquals("-", result[0]);
        assertEquals("-", result[1]);
    }

    /**
     * Branch: token.startsWith("-") && tokenLength == 2
     * 1. Option exists
     * 2. Option does not exist, stopAtNonOption == false (ignored)
     * 3. Option does not exist, stopAtNonOption == true (eatTheRest = true)
     */
    @Test
    public void testFlattenTwoCharOptionToken() {
        options.addOption("a", false, "Option a");

        // Case 1 & 2: stopAtNonOption = false
        String[] args1 = new String[] { "-a", "-u", "extra" };
        String[] result1 = parser.flatten(options, args1, false);
        // -a is added, -u is unknown and ignored, extra is non-option so it's added
        assertEquals(2, result1.length);
        assertEquals("-a", result1[0]);
        assertEquals("extra", result1[1]);

        // Case 3: stopAtNonOption = true (unknown option triggers eatTheRest)
        String[] args2 = new String[] { "-u", "rest1", "rest2" };
        String[] result2 = parser.flatten(options, args2, true);
        // -u is ignored, eatTheRest is set, remaining tokens are gobbled
        assertEquals(2, result2.length);
        assertEquals("rest1", result2[0]);
        assertEquals("rest2", result2[1]);
    }

    /**
     * Branch: token.startsWith("-") && options.hasOption(token) (Multi-character short option, e.g., -foo)
     */
    @Test
    public void testFlattenOptionTokenLengthGreaterThanTwoExists() {
        options.addOption("foo", false, "Option foo");

        String[] args = new String[] { "-foo", "arg" };
        String[] result = parser.flatten(options, args, false);
        assertEquals(2, result.length);
        assertEquals("-foo", result[0]);
        assertEquals("arg", result[1]);
    }

    /**
     * Branch: burstToken with Option having argument mid-token or at the end
     */
    @Test
    public void testBurstTokenWithArgument() {
        options.addOption("a", false, "flag a");
        options.addOption("b", true, "option b with arg");

        // -abValue: 'a' is flag, 'b' has argument, remaining "Value" is consumed as argument
        String[] args = new String[] { "-abValue" };
        String[] result = parser.flatten(options, args, false);

        assertEquals(3, result.length);
        assertEquals("-a", result[0]);
        assertEquals("-b", result[1]);
        assertEquals("Value", result[2]);
    }

    /**
     * Branch: burstToken with Option having argument as the last character
     */
    @Test
    public void testBurstTokenWithArgAsLastCharacter() {
        options.addOption("a", false, "flag a");
        options.addOption("b", true, "option b with arg");

        String[] args = new String[] { "-ab", "valForB" };
        String[] result = parser.flatten(options, args, true);

        assertEquals(3, result.length);
        assertEquals("-a", result[0]);
        assertEquals("-b", result[1]);
        assertEquals("valForB", result[2]);
    }

    /**
     * Branch: burstToken when option does NOT exist
     * 1. stopAtNonOption == false: broken down into individual unrecognized chars
     * 2. stopAtNonOption == true: triggers process(remaining) and eatTheRest
     */
    @Test
    public void testBurstTokenUnknownOptions() {
        options.addOption("a", false, "flag a");

        // Case 1: stopAtNonOption == false
        String[] args1 = new String[] { "-axyz" };
        String[] result1 = parser.flatten(options, args1, false);
        assertEquals(4, result1.length);
        assertEquals("-a", result1[0]);
        assertEquals("-x", result1[1]);
        assertEquals("-y", result1[2]);
        assertEquals("-z", result1[3]);

        // Case 2: stopAtNonOption == true
        // 'a' is known, 'x' is unknown -> stops and treats "xyz" as non-option
        String[] args2 = new String[] { "-axyz", "after" };
        String[] result2 = parser.flatten(options, args2, true);
        assertEquals(4, result2.length);
        assertEquals("-a", result2[0]);
        assertEquals("--", result2[1]);
        assertEquals("xyz", result2[2]);
        assertEquals("after", result2[3]);
    }

    /**
     * Branch: Non-option tokens
     * 1. stopAtNonOption == false: added directly
     * 2. stopAtNonOption == true:
     *    a. currentOption != null && currentOption.hasArg(): consumes token as argument
     *    b. currentOption == null: triggers eatTheRest with "--"
     */
    @Test
    public void testFlattenNonOptionTokens() {
        options.addOption("o", true, "option with arg");

        // stopAtNonOption = false
        String[] args1 = new String[] { "nonOpt1", "nonOpt2" };
        String[] result1 = parser.flatten(options, args1, false);
        assertEquals(2, result1.length);
        assertEquals("nonOpt1", result1[0]);
        assertEquals("nonOpt2", result1[1]);

        // stopAtNonOption = true with previous option expecting argument
        String[] args2 = new String[] { "-o", "argVal", "remainder1", "remainder2" };
        String[] result2 = parser.flatten(options, args2, true);
        assertEquals(5, result2.length);
        assertEquals("-o", result2[0]);
        assertEquals("argVal", result2[1]);
        assertEquals("--", result2[2]);
        assertEquals("remainder1", result2[3]);
        assertEquals("remainder2", result2[4]);
    }

    /**
     * Boundary: Empty string token "" (neither starts with "-" nor is an option)
     */
    @Test
    public void testFlattenEmptyStringToken() {
        String[] args = new String[] { "", "other" };
        String[] result = parser.flatten(options, args, true);
        assertEquals(3, result.length);
        assertEquals("--", result[0]);
        assertEquals("", result[1]);
        assertEquals("other", result[2]);
    }

    /**
     * Edge case: Re-usability and init() state reset
     */
    @Test
    public void testParserReusability() {
        options.addOption("v", false, "verbose");
        String[] args1 = new String[] { "-v", "arg1" };
        String[] result1 = parser.flatten(options, args1, true);
        assertEquals(3, result1.length);

        // Run second time on same parser instance to verify init() clears state
        String[] args2 = new String[] { "-v" };
        String[] result2 = parser.flatten(options, args2, true);
        assertEquals(1, result2.length);
        assertEquals("-v", result2[0]);
    }

    /**
     * End-to-end integration with Parser.parse() verifying CommandLine output
     */
    @Test
    public void testParseEndToEnd() throws Exception {
        options.addOption("s", "silent", false, "silent mode");
        options.addOption("e", "email", true, "email recipient");

        String[] args = new String[] { "-s", "-e", "dev@example.com", "param1", "param2" };
        CommandLine cl = parser.parse(options, args, true);

        assertTrue(cl.hasOption('s'));
        assertTrue(cl.hasOption('e'));
        assertEquals("dev@example.com", cl.getOptionValue('e'));
        assertEquals(2, cl.getArgs().length);
        assertEquals("param1", cl.getArgs()[0]);
        assertEquals("param2", cl.getArgs()[1]);
    }

    /**
     * Boundary / Invalid state: Null arguments array causes NullPointerException
     */
    @Test(expected = NullPointerException.class)
    public void testFlattenNullArguments() {
        parser.flatten(options, null, false);
    }
}
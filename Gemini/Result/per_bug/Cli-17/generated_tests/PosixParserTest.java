package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PosixParserTest {

    private PosixParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new PosixParser();
        options = new Options();

        // Single-character options
        options.addOption("a", false, "Flag option without argument");
        options.addOption("b", true, "Option with an argument");
        options.addOption("c", false, "Another flag option");
        options.addOption("d", true, "Another option with an argument");

        // Multi-character option with single hyphen
        options.addOption("foo", false, "Multi-character option without argument");

        // Long option
        options.addOption("longOpt", "long-option", true, "Option with long opt and argument");
    }

    // Helper method to compare String[] results conveniently
    private void assertTokensEqual(String[] expected, String[] actual) {
        assertNotNull("Actual tokens should not be null", actual);
        List expectedList = Arrays.asList(expected);
        List actualList = Arrays.asList(actual);
        assertEquals(expectedList, actualList);
    }

    // -------------------------------------------------------------
    // 1. Boundary & Empty Arguments
    // -------------------------------------------------------------

    @Test
    public void testFlattenEmptyArguments() {
        String[] args = new String[0];
        String[] result = parser.flatten(options, args, false);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testFlattenEmptyStringToken() {
        // Non-option empty string ""
        String[] args = new String[] { "" };
        String[] result = parser.flatten(options, args, false);
        assertTokensEqual(new String[] { "" }, result);
    }

    // -------------------------------------------------------------
    // 2. Double-Hyphen Options ("--")
    // -------------------------------------------------------------

    @Test
    public void testFlattenLongOptionWithoutEqualSign() {
        String[] args = new String[] { "--long-option", "myValue" };
        String[] result = parser.flatten(options, args, false);
        assertTokensEqual(new String[] { "--long-option", "myValue" }, result);
    }

    @Test
    public void testFlattenLongOptionWithEqualSign() {
        String[] args = new String[] { "--long-option=myValue" };
        String[] result = parser.flatten(options, args, false);
        assertTokensEqual(new String[] { "--long-option", "myValue" }, result);
    }

    @Test
    public void testFlattenLongOptionWithEqualSignEmptyValue() {
        // Edge case: empty value after '='
        String[] args = new String[] { "--long-option=" };
        String[] result = parser.flatten(options, args, false);
        assertTokensEqual(new String[] { "--long-option", "" }, result);
    }

    @Test
    public void testFlattenLongOptionWithMultipleEquals() {
        // Edge case: value contains '='
        String[] args = new String[] { "--long-option=key=value" };
        String[] result = parser.flatten(options, args, false);
        assertTokensEqual(new String[] { "--long-option", "key=value" }, result);
    }

    @Test
    public void testFlattenDoubleHyphenAlone() {
        // Edge case: token is exactly "--"
        String[] args = new String[] { "--", "otherArg" };
        String[] result = parser.flatten(options, args, false);
        assertTokensEqual(new String[] { "--", "otherArg" }, result);
    }

    // -------------------------------------------------------------
    // 3. Single-Hyphen Token ("-")
    // -------------------------------------------------------------

    @Test
    public void testFlattenSingleHyphen() {
        String[] args = new String[] { "-" };
        String[] result = parser.flatten(options, args, false);
        assertTokensEqual(new String[] { "-" }, result);
    }

    // -------------------------------------------------------------
    // 4. Short Options (length == 2)
    // -------------------------------------------------------------

    @Test
    public void testFlattenShortOptionValid() {
        String[] args = new String[] { "-a", "-c" };
        String[] result = parser.flatten(options, args, false);
        assertTokensEqual(new String[] { "-a", "-c" }, result);
    }

    @Test
    public void testFlattenShortOptionInvalidNoStop() {
        // Unrecognized 2-char option "-z" with stopAtNonOption = false (should be ignored)
        String[] args = new String[] { "-z", "nextArg" };
        String[] result = parser.flatten(options, args, false);
        assertTokensEqual(new String[] { "nextArg" }, result);
    }

    @Test
    public void testFlattenShortOptionInvalidStopAtNonOption() {
        // Unrecognized 2-char option "-z" with stopAtNonOption = true
        // Sets eatTheRest = true; "-z" is ignored, remaining are gobbled
        String[] args = new String[] { "-z", "remain1", "remain2" };
        String[] result = parser.flatten(options, args, true);
        assertTokensEqual(new String[] { "remain1", "remain2" }, result);
    }

    // -------------------------------------------------------------
    // 5. Multi-char Option with Single Hyphen
    // -------------------------------------------------------------

    @Test
    public void testFlattenMultiCharOptionValid() {
        // "-foo" is a recognized option directly (length > 2 and options.hasOption("-foo") is true)
        String[] args = new String[] { "-foo" };
        String[] result = parser.flatten(options, args, false);
        assertTokensEqual(new String[] { "-foo" }, result);
    }

    // -------------------------------------------------------------
    // 6. Bursting Algorithm (`burstToken`)
    // -------------------------------------------------------------

    @Test
    public void testBurstTokenMultipleFlagsNoArg() {
        // -ac bursts into -a and -c
        String[] args = new String[] { "-ac" };
        String[] result = parser.flatten(options, args, false);
        assertTokensEqual(new String[] { "-a", "-c" }, result);
    }

    @Test
    public void testBurstTokenWithArgAttached() {
        // -b has argument; -abVALUE -> -a, -b, VALUE
        String[] args = new String[] { "-abVALUE" };
        String[] result = parser.flatten(options, args, false);
        assertTokensEqual(new String[] { "-a", "-b", "VALUE" }, result);
    }

    @Test
    public void testBurstTokenWithArgAtEnd() {
        // -b has argument and is the last character in the bundle: -ab followed by value
        String[] args = new String[] { "-ab", "myVal" };
        String[] result = parser.flatten(options, args, false);
        assertTokensEqual(new String[] { "-a", "-b", "myVal" }, result);
    }

    @Test
    public void testBurstTokenInvalidOptionNoStop() {
        // -xyz where 'x' is invalid and stopAtNonOption = false -> keeps -xyz as a single token
        String[] args = new String[] { "-xyz" };
        String[] result = parser.flatten(options, args, false);
        assertTokensEqual(new String[] { "-xyz" }, result);
    }

    @Test
    public void testBurstTokenInvalidOptionStopAtNonOptionFaultCli17() {
        // Edge Case targeting Defects4J Cli-17:
        // Bursting an unrecognized token with stopAtNonOption=true.
        // In Cli-17b, burstToken does not break on stopAtNonOption, invoking process()
        // repeatedly for each remaining substring.
        String[] args = new String[] { "-unknown", "extra" };
        String[] result = parser.flatten(options, args, true);

        // Demonstrates the fault behavior:
        // 1. eatTheRest gets set to true
        // 2. Special marker "--" is placed
        // 3. The original substring "unknown" is processed
        // 4. "extra" is gobbled at the end
        assertTrue(result.length >= 3);
        assertEquals("--", result[0]);
        assertEquals("unknown", result[1]);
        assertEquals("extra", result[result.length - 1]);
    }

    @Test
    public void testBurstTokenWithKnownOptionThenUnknownStopAtNonOption() {
        // -ax where 'a' is known (no arg) and 'x' is unknown with stopAtNonOption=true
        // 'a' is burst, then 'x' triggers process("x") where currentOption has no arg.
        String[] args = new String[] { "-ax", "after" };
        String[] result = parser.flatten(options, args, true);
        assertTokensEqual(new String[] { "-a", "--", "x", "after" }, result);
    }

    // -------------------------------------------------------------
    // 7. Non-option Tokens & `process()` Method
    // -------------------------------------------------------------

    @Test
    public void testFlattenNonOptionNoStop() {
        String[] args = new String[] { "nonOption1", "nonOption2" };
        String[] result = parser.flatten(options, args, false);
        assertTokensEqual(new String[] { "nonOption1", "nonOption2" }, result);
    }

    @Test
    public void testFlattenNonOptionStopAtNonOptionNoCurrentOption() {
        // Non-option token when currentOption == null and stopAtNonOption = true
        // Adds "--", then token, then gobbles rest
        String[] args = new String[] { "arg1", "arg2" };
        String[] result = parser.flatten(options, args, true);
        assertTokensEqual(new String[] { "--", "arg1", "arg2" }, result);
    }

    @Test
    public void testFlattenNonOptionFollowsOptionWithArg() {
        // -b has argument; next token "myValue" is treated as argument of -b
        String[] args = new String[] { "-b", "myValue", "nextNonOption" };
        String[] result = parser.flatten(options, args, true);
        // "myValue" consumes option b; "nextNonOption" triggers stopAtNonOption
        assertTokensEqual(new String[] { "-b", "myValue", "--", "nextNonOption" }, result);
    }

    @Test
    public void testFlattenNonOptionFollowsOptionWithoutArg() {
        // -a has NO argument; next token "unexpected" causes eatTheRest with "--"
        String[] args = new String[] { "-a", "unexpected", "tail" };
        String[] result = parser.flatten(options, args, true);
        assertTokensEqual(new String[] { "-a", "--", "unexpected", "tail" }, result);
    }

    // -------------------------------------------------------------
    // 8. Parser Reusability & `init()` Reset State
    // -------------------------------------------------------------

    @Test
    public void testInitResetsStateOnConsecutiveCalls() {
        // First call sets eatTheRest = true
        String[] args1 = new String[] { "stopHere", "ignored" };
        parser.flatten(options, args1, true);

        // Second call with normal args should not be affected by previous eatTheRest state
        String[] args2 = new String[] { "-a", "-c" };
        String[] result2 = parser.flatten(options, args2, false);
        assertTokensEqual(new String[] { "-a", "-c" }, result2);
    }

    // -------------------------------------------------------------
    // 9. End-to-End Integration with `CommandLineParser.parse`
    // -------------------------------------------------------------

    @Test
    public void testParseIntegration() throws ParseException {
        String[] args = new String[] { "-a", "-b", "hello", "--long-option=world", "standalone" };
        CommandLine cl = parser.parse(options, args);

        assertTrue("Flag -a should be present", cl.hasOption("a"));
        assertTrue("Option -b should be present", cl.hasOption("b"));
        assertEquals("Option -b value mismatch", "hello", cl.getOptionValue("b"));
        assertTrue("Option longOpt should be present", cl.hasOption("longOpt"));
        assertEquals("Option longOpt value mismatch", "world", cl.getOptionValue("longOpt"));
        assertEquals("Standalone argument count mismatch", 1, cl.getArgs().length);
        assertEquals("standalone", cl.getArgs()[0]);
    }
}
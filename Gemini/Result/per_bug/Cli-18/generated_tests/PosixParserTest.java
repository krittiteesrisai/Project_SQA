package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Test suite for {@link PosixParser} focusing on high branch/condition coverage
 * and edge cases in the flattening/bursting logic.
 */
public class PosixParserTest {

    private PosixParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new PosixParser();
        options = new Options();

        // Standard boolean flag options (no arg)
        options.addOption("a", false, "Flag A");
        options.addOption("b", false, "Flag B");
        options.addOption("c", false, "Flag C");

        // Single argument options
        options.addOption("f", true, "Option F with single arg");
        options.addOption("s", true, "Option S with single arg");

        // Multi-argument option
        Option multiOpt = new Option("m", "multi", true, "Multi-arg option");
        multiOpt.setArgs(2);
        options.addOption(multiOpt);

        // Long option with single dash defined in options
        options.addOption("-opt", false, "Option with leading dash in name");
    }

    /**
     * Boundary limit: Empty array of arguments.
     */
    @Test
    public void testFlattenEmptyArgs() {
        String[] args = new String[0];
        String[] result = parser.flatten(options, args, false);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    /**
     * Branch: token.startsWith("--") without '='
     */
    @Test
    public void testFlattenDoubleDashNoEquals() {
        String[] args = new String[]{"--verbose", "--"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--verbose", "--"}, result);
    }

    /**
     * Branch: token.startsWith("--") with '='
     * Covers normal value, empty value, and multiple '=' characters.
     */
    @Test
    public void testFlattenDoubleDashWithEquals() {
        String[] args = new String[]{
            "--foo=bar",
            "--empty=",
            "--key=val1=val2"
        };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{
            "--foo", "bar",
            "--empty", "",
            "--key", "val1=val2"
        }, result);
    }

    /**
     * Branch: "-".equals(token) -> processSingleHyphen
     */
    @Test
    public void testFlattenSingleHyphen() {
        String[] args = new String[]{"-", "filename", "-"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-", "filename", "-"}, result);
    }

    /**
     * Branch: token.length() == 2 && options.hasOption(token) == true
     * Also verifies non-option argument consuming when currentOption has an argument.
     */
    @Test
    public void testFlattenValidShortOptionWithAndWithoutArg() {
        String[] args = new String[]{"-a", "-f", "myFile.txt"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-a", "-f", "myFile.txt"}, result);
    }

    /**
     * Branch: token.length() == 2 && options.hasOption(token) == false
     * Condition: stopAtNonOption == true (eats remaining tokens)
     */
    @Test
    public void testFlattenInvalidShortOptionStopAtNonOptionTrue() {
        // -z is unrecognized; with stopAtNonOption=true, it sets eatTheRest=true
        // and gobbles the remaining tokens without adding -z.
        String[] args = new String[]{"-a", "-z", "remaining1", "remaining2"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-a", "remaining1", "remaining2"}, result);
    }

    /**
     * Branch: token.length() == 2 && options.hasOption(token) == false
     * Condition: stopAtNonOption == false (ignores unrecognized short option)
     */
    @Test
    public void testFlattenInvalidShortOptionStopAtNonOptionFalse() {
        String[] args = new String[]{"-a", "-z", "arg1"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "arg1"}, result);
    }

    /**
     * Branch: token.length() > 2 && options.hasOption(token) == true
     */
    @Test
    public void testFlattenLongOptionMatchingDirectly() {
        String[] args = new String[]{"--opt"};
        // "--opt" starts with "--", so test with single dash: "-opt"
        String[] argsSingleDash = new String[]{"-opt"};
        String[] result = parser.flatten(options, argsSingleDash, false);
        assertArrayEquals(new String[]{"-opt"}, result);
    }

    /**
     * Branch: burstToken with multiple clustered valid flags (no arguments).
     */
    @Test
    public void testBurstTokenClusteredFlags() {
        String[] args = new String[]{"-abc"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-b", "-c"}, result);
    }

    /**
     * Branch: burstToken with option taking an argument attached directly.
     * e.g., -fValue -> -f, Value
     */
    @Test
    public void testBurstTokenWithAttachedArgument() {
        String[] args = new String[]{"-fAttachedValue"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-f", "AttachedValue"}, result);
    }

    /**
     * Branch: burstToken with cluster followed by attached argument.
     * e.g., -abfValue -> -a, -b, -f, Value
     */
    @Test
    public void testBurstTokenClusterAndAttachedArgument() {
        String[] args = new String[]{"-abfAttachedValue"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-b", "-f", "AttachedValue"}, result);
    }

    /**
     * Branch: burstToken where option taking argument is the last character.
     * (token.length() == i + 1), so argument is NOT in the same token.
     */
    @Test
    public void testBurstTokenArgOptionAtEndFollowedBySeparateArg() {
        String[] args = new String[]{"-abf", "SeparateArg"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-a", "-b", "-f", "SeparateArg"}, result);
    }

    /**
     * Branch: burstToken with unrecognized character and stopAtNonOption == true.
     * Triggers process(token.substring(i)).
     */
    @Test
    public void testBurstTokenUnrecognizedStopAtNonOptionTrue() {
        // -az: 'a' is valid flag, 'z' is unrecognized.
        // Since 'a' has no arg, process("z") inserts "--", "z" and eats remaining.
        String[] args = new String[]{"-az", "moreArgs"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-a", "--", "z", "moreArgs"}, result);
    }

    /**
     * Branch: burstToken with unrecognized character and stopAtNonOption == false.
     * Adds the full token directly.
     */
    @Test
    public void testBurstTokenUnrecognizedStopAtNonOptionFalse() {
        // -ax where 'a' is valid, 'x' is not. When stopAtNonOption=false, adds original token.
        String[] args = new String[]{"-ax"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-ax"}, result);
    }

    /**
     * Branch: Non-option token when currentOption == null and stopAtNonOption == true.
     * Triggers eatTheRest, inserts "--" and gobbles remaining tokens.
     */
    @Test
    public void testNonOptionStopAtNonOptionTrueWithoutCurrentOption() {
        String[] args = new String[]{"nonOption1", "nonOption2"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"--", "nonOption1", "nonOption2"}, result);
    }

    /**
     * Branch: Non-option token when stopAtNonOption == false.
     * All non-options should simply be added to the token list.
     */
    @Test
    public void testNonOptionStopAtNonOptionFalse() {
        String[] args = new String[]{"arg1", "arg2"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"arg1", "arg2"}, result);
    }

    /**
     * Edge Case / Defects4J Fault Simulation:
     * Option with multiple arguments under stopAtNonOption == true.
     * In PosixParser#process(String), 'currentOption = null' is executed after the first argument,
     * causing subsequent arguments to trigger eatTheRest and "--".
     */
    @Test
    public void testMultipleArgumentsUnderStopAtNonOption() {
        String[] args = new String[]{"-m", "val1", "val2", "val3"};
        String[] result = parser.flatten(options, args, true);
        // After first arg "val1", currentOption is cleared to null.
        // Then "val2" triggers eatTheRest, inserting "--", "val2", and gobbling "val3".
        assertArrayEquals(new String[]{"-m", "val1", "--", "val2", "val3"}, result);
    }

    /**
     * State Integrity: Consecutive calls to flatten() on the same PosixParser instance.
     * Ensures init() correctly resets tokens, eatTheRest, and currentOption.
     */
    @Test
    public void testMultipleFlattenCallsReinitialization() {
        String[] args1 = new String[]{"-a", "stoppedArg", "gobbledArg"};
        String[] result1 = parser.flatten(options, args1, true);
        assertArrayEquals(new String[]{"-a", "--", "stoppedArg", "gobbledArg"}, result1);

        // Second run with clean options
        String[] args2 = new String[]{"-b"};
        String[] result2 = parser.flatten(options, args2, false);
        assertArrayEquals(new String[]{"-b"}, result2);
    }

    /**
     * Integration test: Full parse workflow using Parser#parse(Options, String[]).
     */
    @Test
    public void testFullParseIntegration() throws ParseException {
        String[] args = new String[]{"-a", "-f", "config.xml", "--", "file1.txt", "file2.txt"};
        CommandLine cl = parser.parse(options, args);

        assertTrue(cl.hasOption("a"));
        assertTrue(cl.hasOption("f"));
        assertEquals("config.xml", cl.getOptionValue("f"));
        assertFalse(cl.hasOption("b"));

        String[] extraArgs = cl.getArgs();
        assertArrayEquals(new String[]{"file1.txt", "file2.txt"}, extraArgs);
    }
}
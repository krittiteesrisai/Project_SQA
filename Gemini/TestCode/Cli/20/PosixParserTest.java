package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertArrayEquals;

/**
 * Test suite for {@link PosixParser} focusing on high branch coverage
 * and edge case detection for Defects4J Cli-20.
 */
public class PosixParserTest {

    private PosixParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new PosixParser();
        options = new Options();
    }

    @Test
    public void testEmptyArguments() {
        String[] args = new String[0];
        String[] result = parser.flatten(options, args, false);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testLongOptionWithEquals() {
        options.addOption(OptionBuilder.hasArg().create("foo"));
        String[] args = new String[]{"--foo=bar"};
        String[] expected = new String[]{"--foo", "bar"};

        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testLongOptionWithoutEquals() {
        options.addOption(OptionBuilder.hasArg().create("foo"));
        String[] args = new String[]{"--foo"};
        String[] expected = new String[]{"--foo"};

        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSingleHyphenToken() {
        String[] args = new String[]{"-"};
        String[] expected = new String[]{"-"};

        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testTwoCharOptionValidWithArgStopAtNonOption() {
        options.addOption(OptionBuilder.hasArg().create('a'));
        String[] args = new String[]{"-a", "value", "extra"};

        // 'value' should satisfy '-a' argument, then 'extra' triggers eatTheRest
        String[] expected = new String[]{"-a", "value", "--", "extra"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testTwoCharOptionInvalidStopAtNonOptionTrue() {
        // -z is not a valid option
        String[] args = new String[]{"-z", "remain1", "remain2"};
        String[] expected = new String[]{"-z", "remain1", "remain2"};

        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testTwoCharOptionInvalidStopAtNonOptionFalse() {
        // -z is not a valid option, stopAtNonOption=false -> should not eat the rest
        String[] args = new String[]{"-z", "item"};
        String[] expected = new String[]{"-z", "item"};

        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSingleHyphenLongOptionDefinedInOptions() {
        // e.g. "-foo" as a recognized single token
        options.addOption(OptionBuilder.create("foo"));
        String[] args = new String[]{"-foo"};
        String[] expected = new String[]{"-foo"};

        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testBurstingMultipleOptionsWithoutArg() {
        options.addOption("a", false, "opt a");
        options.addOption("b", false, "opt b");
        options.addOption("c", false, "opt c");

        String[] args = new String[]{"-abc"};
        String[] expected = new String[]{"-a", "-b", "-c"};

        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testBurstingOptionWithAppendedArg() {
        options.addOption("a", false, "opt a");
        options.addOption(OptionBuilder.hasArg().create('b'));

        // 'b' expects an argument, 'xyz' will be taken as argument to -b
        String[] args = new String[]{"-abxyz"};
        String[] expected = new String[]{"-a", "-b", "xyz"};

        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testBurstingInvalidOptionStopAtNonOptionTrue() {
        options.addOption("a", false, "opt a");
        // 'z' is not registered, stopAtNonOption=true triggers process("z123")
        String[] args = new String[]{"-az123", "subsequent"};
        String[] expected = new String[]{"-a", "--", "z123", "subsequent"};

        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testBurstingInvalidOptionStopAtNonOptionFalse() {
        options.addOption("a", false, "opt a");
        // 'z' is not registered, stopAtNonOption=false adds full token
        String[] args = new String[]{"-az123"};
        String[] expected = new String[]{"-a", "-az123"};

        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testNonOptionStopAtNonOptionFalse() {
        String[] args = new String[]{"nonOption1", "nonOption2"};
        String[] expected = new String[]{"nonOption1", "nonOption2"};

        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testNonOptionStopAtNonOptionTrueWithoutOption() {
        String[] args = new String[]{"param1", "param2"};
        String[] expected = new String[]{"--", "param1", "param2"};

        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testInitResetsStateBetweenCalls() {
        options.addOption(OptionBuilder.hasArg().create('a'));
        
        // 1st run: trigger eatTheRest and currentOption state
        String[] args1 = new String[]{"-a", "val", "rest1", "rest2"};
        parser.flatten(options, args1, true);

        // 2nd run: should be completely fresh without eatTheRest polluting
        String[] args2 = new String[]{"--test"};
        String[] expected2 = new String[]{"--test"};
        String[] result2 = parser.flatten(options, args2, false);

        assertArrayEquals(expected2, result2);
    }
}
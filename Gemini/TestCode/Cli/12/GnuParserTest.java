package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Test suite for GnuParser focusing on high branch coverage
 * and boundary/edge case detection (Cli-12).
 */
public class GnuParserTest {

    private GnuParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new GnuParser();
        options = new Options();

        // Setup standard options for testing
        options.addOption("a", "all", false, "toggle all");
        options.addOption("b", false, "short option only");
        options.addOption("D", "define", true, "property option");
        options.addOption(OptionBuilder.withLongOpt("foo")
                                       .hasArg()
                                       .create());
    }

    // -------------------------------------------------------------
    // Branch: Empty & Null inputs
    // -------------------------------------------------------------

    @Test
    public void testFlattenEmptyArguments() {
        String[] args = new String[0];
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[0], result);
    }

    @Test(expected = NullPointerException.class)
    public void testFlattenNullArgumentsArray() {
        parser.flatten(options, null, false);
    }

    @Test(expected = NullPointerException.class)
    public void testFlattenArgumentsContainingNull() {
        String[] args = new String[]{"-a", null};
        parser.flatten(options, args, false);
    }

    // -------------------------------------------------------------
    // Branch 1: "--".equals(arg) and eatTheRest behavior
    // -------------------------------------------------------------

    @Test
    public void testFlattenDoubleHyphenAlone() {
        String[] args = new String[]{"--"};
        String[] expected = new String[]{"--"};
        String[] actual = parser.flatten(options, args, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlattenDoubleHyphenConsumesRemaining() {
        String[] args = new String[]{"-a", "--", "-b", "extra", "--unknown"};
        String[] expected = new String[]{"-a", "--", "-b", "extra", "--unknown"};
        String[] actual = parser.flatten(options, args, false);
        assertArrayEquals(expected, actual);
    }

    // -------------------------------------------------------------
    // Branch 2: "-".equals(arg)
    // -------------------------------------------------------------

    @Test
    public void testFlattenSingleHyphenAlone() {
        String[] args = new String[]{"-"};
        String[] expected = new String[]{"-"};
        String[] actual = parser.flatten(options, args, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlattenSingleHyphenBetweenOptions() {
        String[] args = new String[]{"-a", "-", "-b"};
        String[] expected = new String[]{"-a", "-", "-b"};
        String[] actual = parser.flatten(options, args, false);
        assertArrayEquals(expected, actual);
    }

    // -------------------------------------------------------------
    // Branch 3.1: arg.startsWith("-") && options.hasOption(opt)
    // -------------------------------------------------------------

    @Test
    public void testFlattenRecognizedShortOption() {
        String[] args = new String[]{"-a"};
        String[] expected = new String[]{"-a"};
        String[] actual = parser.flatten(options, args, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlattenRecognizedLongOption() {
        String[] args = new String[]{"--all"};
        String[] expected = new String[]{"--all"};
        String[] actual = parser.flatten(options, args, false);
        assertArrayEquals(expected, actual);
    }

    // -------------------------------------------------------------
    // Branch 3.2.1: options.hasOption(arg.substring(0, 2)) (e.g., -Dprop=val)
    // -------------------------------------------------------------

    @Test
    public void testFlattenSpecialPropertyOption() {
        String[] args = new String[]{"-Dproperty=value"};
        String[] expected = new String[]{"-D", "property=value"};
        String[] actual = parser.flatten(options, args, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlattenSpecialPropertyOptionEmptyValue() {
        String[] args = new String[]{"-D="};
        String[] expected = new String[]{"-D", "="};
        String[] actual = parser.flatten(options, args, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlattenSpecialPropertyOptionJustOption() {
        // -D by itself is already recognized by hasOption("D")
        String[] args = new String[]{"-D"};
        String[] expected = new String[]{"-D"};
        String[] actual = parser.flatten(options, args, false);
        assertArrayEquals(expected, actual);
    }

    // -------------------------------------------------------------
    // Branch 3.2.2: Unknown Option with stopAtNonOption true/false
    // -------------------------------------------------------------

    @Test
    public void testFlattenUnrecognizedOptionStopAtNonOptionFalse() {
        String[] args = new String[]{"-unknown", "-a", "val"};
        String[] expected = new String[]{"-unknown", "-a", "val"};
        // stopAtNonOption = false -> does not eat the rest
        String[] actual = parser.flatten(options, args, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlattenUnrecognizedOptionStopAtNonOptionTrue() {
        String[] args = new String[]{"-unknown", "-a", "val"};
        String[] expected = new String[]{"-unknown", "-a", "val"};
        // stopAtNonOption = true -> triggers eatTheRest
        String[] actual = parser.flatten(options, args, true);
        assertArrayEquals(expected, actual);
    }

    // -------------------------------------------------------------
    // Branch 4: Non-option arguments (does not start with '-')
    // -------------------------------------------------------------

    @Test
    public void testFlattenNonOptionArguments() {
        String[] args = new String[]{"file1.txt", "file2.txt"};
        String[] expected = new String[]{"file1.txt", "file2.txt"};
        String[] actual = parser.flatten(options, args, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlattenEmptyStringArgument() {
        // Boundary case: Empty string arg ""
        String[] args = new String[]{""};
        String[] expected = new String[]{""};
        String[] actual = parser.flatten(options, args, false);
        assertArrayEquals(expected, actual);
    }

    // -------------------------------------------------------------
    // Defects4J Cli-12 Targeted Edge Cases: Long Option with '='
    // -------------------------------------------------------------

    @Test
    public void testFlattenLongOptionWithEqualSign() {
        // Edge case: --foo=bar when foo is an option taking an argument
        // In GnuParser (Cli-12), this reveals the lack of splitting for long options with '='
        String[] args = new String[]{"--foo=bar"};
        String[] actual = parser.flatten(options, args, false);
        // Checking behavior: GnuParser without fix will keep "--foo=bar" as one token
        assertEquals(1, actual.length);
        assertEquals("--foo=bar", actual[0]);
    }

    @Test
    public void testFlattenShortOptionWithEqualSign() {
        // Option 'b' exists, arg is -b=val -> substring(0, 2) is "-b", which matches option 'b'
        String[] args = new String[]{"-b=value"};
        String[] expected = new String[]{"-b", "=value"};
        String[] actual = parser.flatten(options, args, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlattenMultipleHyphens() {
        // Boundary case: "---" (3 hyphens)
        String[] args = new String[]{"---"};
        String[] expected = new String[]{"---"};
        String[] actual = parser.flatten(options, args, false);
        assertArrayEquals(expected, actual);
    }
}
package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import java.util.ListIterator;
import java.util.Properties;

import static org.junit.Assert.*;

/**
 * Test suite for {@link Parser} targeting high condition/branch coverage
 * and boundary edge cases in Apache Commons CLI (Defects4J Cli-9b).
 */
public class ParserTest {

    private TestableParser parser;
    private Options options;

    /**
     * Concrete implementation of the abstract Parser to allow unit testing.
     * Uses pass-through flatten to isolate Parser logic.
     */
    private static class TestableParser extends Parser {
        @Override
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) {
            return arguments != null ? arguments : new String[0];
        }
    }

    @Before
    public void setUp() {
        parser = new TestableParser();
        options = new Options();
    }

    // =========================================================================
    // Boundary & Null/Empty Argument Tests
    // =========================================================================

    @Test
    public void testParseNullArguments() throws Exception {
        CommandLine cmd = parser.parse(options, null);
        assertNotNull("CommandLine should not be null", cmd);
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void testParseEmptyArguments() throws Exception {
        CommandLine cmd = parser.parse(options, new String[0]);
        assertNotNull(cmd);
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void testPreviousOptionValuesAreCleared() throws Exception {
        Option opt = new Option("a", true, "option with arg");
        options.addOption(opt);

        // Run 1: sets value
        parser.parse(options, new String[]{"-a", "first"});
        assertEquals("first", opt.getValue());

        // Run 2: option not supplied, previously set value must be cleared
        parser.parse(options, new String[0]);
        assertNull("Option value should have been cleared", opt.getValue());
    }

    // =========================================================================
    // Double Dash (--) and Single Dash (-) Token Tests
    // =========================================================================

    @Test
    public void testDoubleDashStopsOptionParsingAndIgnoresSubsequentDoubleDash() throws Exception {
        options.addOption(new Option("a", false, "flag a"));

        String[] args = new String[]{"--", "-a", "--", "extraArg"};
        CommandLine cmd = parser.parse(options, args, false);

        assertFalse("Option -a should not be parsed after --", cmd.hasOption("a"));
        String[] extraArgs = cmd.getArgs();
        assertEquals(2, extraArgs.length);
        assertEquals("-a", extraArgs[0]);
        assertEquals("extraArg", extraArgs[1]); // Ensure second '--' was omitted
    }

    @Test
    public void testSingleDashWithoutStopAtNonOption() throws Exception {
        CommandLine cmd = parser.parse(options, new String[]{"-", "other"}, false);
        assertEquals(2, cmd.getArgs().length);
        assertEquals("-", cmd.getArgs()[0]);
        assertEquals("other", cmd.getArgs()[1]);
    }

    @Test
    public void testSingleDashWithStopAtNonOption() throws Exception {
        options.addOption(new Option("a", false, "flag a"));
        CommandLine cmd = parser.parse(options, new String[]{"-", "-a"}, true);

        // Single dash with stopAtNonOption triggers eatTheRest
        assertFalse(cmd.hasOption("a"));
        assertEquals(1, cmd.getArgs().length);
        assertEquals("-a", cmd.getArgs()[0]);
    }

    // =========================================================================
    // Option and Non-Option Arguments with stopAtNonOption
    // =========================================================================

    @Test
    public void testUnrecognizedOptionWithStopAtNonOptionEatsRemaining() throws Exception {
        options.addOption(new Option("a", false, "flag a"));

        String[] args = new String[]{"-unknown", "-a", "file.txt"};
        CommandLine cmd = parser.parse(options, args, true);

        assertFalse("Should not process subsequent options", cmd.hasOption("a"));
        String[] remaining = cmd.getArgs();
        assertEquals(3, remaining.length);
        assertEquals("-unknown", remaining[0]);
        assertEquals("-a", remaining[1]);
        assertEquals("file.txt", remaining[2]);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testUnrecognizedOptionWithoutStopAtNonOptionThrows() throws Exception {
        parser.parse(options, new String[]{"-invalid"}, false);
    }

    @Test
    public void testPlainArgumentWithStopAtNonOptionEatsRemaining() throws Exception {
        options.addOption(new Option("a", false, "flag a"));

        String[] args = new String[]{"arg1", "-a", "arg2"};
        CommandLine cmd = parser.parse(options, args, true);

        assertFalse("Option -a should not be parsed after non-option", cmd.hasOption("a"));
        assertEquals(3, cmd.getArgs().length);
        assertEquals("arg1", cmd.getArgs()[0]);
        assertEquals("-a", cmd.getArgs()[1]);
        assertEquals("arg2", cmd.getArgs()[2]);
    }

    @Test
    public void testPlainArgumentWithoutStopAtNonOptionContinuesParsing() throws Exception {
        options.addOption(new Option("a", false, "flag a"));

        String[] args = new String[]{"arg1", "-a", "arg2"};
        CommandLine cmd = parser.parse(options, args, false);

        assertTrue("Option -a should be parsed", cmd.hasOption("a"));
        assertEquals(2, cmd.getArgs().length);
        assertEquals("arg1", cmd.getArgs()[0]);
        assertEquals("arg2", cmd.getArgs()[1]);
    }

    // =========================================================================
    // Argument Processing & MissingArgumentException
    // =========================================================================

    @Test
    public void testOptionArgProcessingStopsAtNextOption() throws Exception {
        Option optA = new Option("a", true, "requires argument");
        optA.setArgs(2); // expects 2 arguments
        options.addOption(optA);
        options.addOption(new Option("b", false, "flag b"));

        CommandLine cmd = parser.parse(options, new String[]{"-a", "val1", "-b"});
        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("b"));
        assertEquals("val1", cmd.getOptionValue("a"));
    }

    @Test(expected = MissingArgumentException.class)
    public void testMissingArgumentThrowsException() throws Exception {
        options.addOption(new Option("a", true, "requires argument"));
        parser.parse(options, new String[]{"-a"});
    }

    @Test
    public void testOptionalArgumentMissingDoesNotThrow() throws Exception {
        Option optA = new Option("a", true, "optional arg");
        optA.setOptionalArg(true);
        options.addOption(optA);

        CommandLine cmd = parser.parse(options, new String[]{"-a"});
        assertTrue(cmd.hasOption("a"));
        assertNull(cmd.getOptionValue("a"));
    }

    @Test
    public void testProcessArgsWithQuotesStripped() throws Exception {
        options.addOption(new Option("f", true, "file"));
        CommandLine cmd = parser.parse(options, new String[]{"-f", "\"my file.txt\""});
        assertEquals("my file.txt", cmd.getOptionValue("f"));
    }

    // =========================================================================
    // Required Options & Defects4J Cli-9 Target Checks
    // =========================================================================

    @Test
    public void testRequiredOptionSupplied() throws Exception {
        Option req = new Option("r", "required", false, "required option");
        req.setRequired(true);
        options.addOption(req);

        CommandLine cmd = parser.parse(options, new String[]{"-r"});
        assertTrue(cmd.hasOption("r"));
    }

    @Test
    public void testSingleMissingRequiredOptionThrowsCorrectMessage() {
        Option req = new Option("r", "required", false, "required option");
        req.setRequired(true);
        options.addOption(req);

        try {
            parser.parse(options, new String[0]);
            fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            assertTrue("Message should indicate single missing option: " + e.getMessage(),
                    e.getMessage().startsWith("Missing required option: "));
            assertTrue(e.getMessage().contains("r"));
        }
    }

    @Test
    public void testMultipleMissingRequiredOptionsThrowsCorrectMessage() {
        Option req1 = new Option("a", false, "req a");
        req1.setRequired(true);
        Option req2 = new Option("b", false, "req b");
        req2.setRequired(true);
        options.addOption(req1);
        options.addOption(req2);

        try {
            parser.parse(options, new String[0]);
            fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            assertTrue("Message should indicate multiple missing options: " + e.getMessage(),
                    e.getMessage().startsWith("Missing required options: "));
        }
    }

    // =========================================================================
    // Option Groups
    // =========================================================================

    @Test
    public void testRequiredOptionGroupSatisfied() throws Exception {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option optA = new Option("a", false, "opt a");
        Option optB = new Option("b", false, "opt b");
        group.addOption(optA);
        group.addOption(optB);
        options.addOptionGroup(group);

        CommandLine cmd = parser.parse(options, new String[]{"-a"});
        assertTrue(cmd.hasOption("a"));
        assertFalse(cmd.hasOption("b"));
    }

    @Test(expected = AlreadySelectedException.class)
    public void testOptionGroupMultipleSelectedThrows() throws Exception {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", false, "opt a"));
        group.addOption(new Option("b", false, "opt b"));
        options.addOptionGroup(group);

        parser.parse(options, new String[]{"-a", "-b"});
    }

    // =========================================================================
    // Properties Processing Tests
    // =========================================================================

    @Test
    public void testProcessPropertiesNullSafe() throws Exception {
        CommandLine cmd = parser.parse(options, new String[0], (Properties) null);
        assertNotNull(cmd);
    }

    @Test
    public void testProcessPropertiesOptionAlreadySpecifiedOnCommandLineIgnored() throws Exception {
        options.addOption(new Option("p", true, "port"));
        Properties props = new Properties();
        props.setProperty("p", "8080");

        // Command line overrides property
        CommandLine cmd = parser.parse(options, new String[]{"-p", "9090"}, props);
        assertEquals("9090", cmd.getOptionValue("p"));
    }

    @Test
    public void testProcessPropertiesWithArgument() throws Exception {
        options.addOption(new Option("p", true, "port"));
        Properties props = new Properties();
        props.setProperty("p", "8080");

        CommandLine cmd = parser.parse(options, new String[0], props);
        assertTrue(cmd.hasOption("p"));
        assertEquals("8080", cmd.getOptionValue("p"));
    }

    @Test
    public void testProcessPropertiesBooleanFlags() throws Exception {
        options.addOption(new Option("v", false, "verbose"));
        options.addOption(new Option("d", false, "debug"));
        options.addOption(new Option("q", false, "quiet"));

        Properties props = new Properties();
        props.setProperty("v", "yes");
        props.setProperty("d", "true");
        props.setProperty("q", "1");

        CommandLine cmd = parser.parse(options, new String[0], props);
        assertTrue("yes should activate flag", cmd.hasOption("v"));
        assertTrue("true should activate flag", cmd.hasOption("d"));
        assertTrue("1 should activate flag", cmd.hasOption("q"));
    }

    @Test
    public void testProcessPropertiesInvalidFlagStopsProcessing() throws Exception {
        options.addOption(new Option("v", false, "verbose"));
        Properties props = new Properties();
        props.setProperty("v", "no"); // invalid flag value triggers break

        CommandLine cmd = parser.parse(options, new String[0], props);
        assertFalse("Property value 'no' should not enable flag", cmd.hasOption("v"));
    }

    // =========================================================================
    // Convenience Overload Methods
    // =========================================================================

    @Test
    public void testParseOverloads() throws Exception {
        options.addOption(new Option("a", false, "flag a"));

        CommandLine cmd1 = parser.parse(options, new String[]{"-a"});
        assertTrue(cmd1.hasOption("a"));

        CommandLine cmd2 = parser.parse(options, new String[]{"-a"}, true);
        assertTrue(cmd2.hasOption("a"));

        Properties props = new Properties();
        CommandLine cmd3 = parser.parse(options, new String[]{"-a"}, props);
        assertTrue(cmd3.hasOption("a"));
    }
}
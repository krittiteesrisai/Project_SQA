package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import java.util.ListIterator;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Test suite for {@link Parser} focusing on branch/condition coverage,
 * edge cases, and potential defect areas.
 */
public class ParserTest {

    private Parser parser;
    private Options options;

    /**
     * Concrete implementation of abstract Parser for testing.
     */
    private static class DummyParser extends Parser {
        @Override
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) {
            // Passthrough implementation
            return arguments != null ? arguments : new String[0];
        }
    }

    @Before
    public void setUp() {
        parser = new DummyParser();
        options = new Options();
    }

    // --- Boundary & Null Argument Tests ---

    @Test
    public void testParseWithNullArguments() throws Exception {
        CommandLine cmd = parser.parse(options, null);
        assertNotNull(cmd);
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void testParseWithEmptyArguments() throws Exception {
        CommandLine cmd = parser.parse(options, new String[0]);
        assertNotNull(cmd);
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void testParseOverloads() throws Exception {
        Option optA = new Option("a", "alpha", false, "Option A");
        options.addOption(optA);

        // Test parse(Options, String[])
        CommandLine cmd1 = parser.parse(options, new String[]{"-a"});
        assertTrue(cmd1.hasOption("a"));

        // Test parse(Options, String[], boolean)
        CommandLine cmd2 = parser.parse(options, new String[]{"-a", "extra"}, true);
        assertTrue(cmd2.hasOption("a"));
        assertEquals("extra", cmd2.getArgs()[0]);

        // Test parse(Options, String[], Properties)
        Properties props = new Properties();
        CommandLine cmd3 = parser.parse(options, new String[0], props);
        assertNotNull(cmd3);
    }

    // --- Double Dash (--) and Single Dash (-) Tests ---

    @Test
    public void testDoubleDashStopsParsingAndConsumesRest() throws Exception {
        options.addOption("a", false, "option a");
        options.addOption("b", false, "option b");

        String[] args = new String[]{"-a", "--", "-b", "arg1", "--", "arg2"};
        CommandLine cmd = parser.parse(options, args);

        assertTrue(cmd.hasOption("a"));
        assertFalse("Option -b should not be parsed after double-dash", cmd.hasOption("b"));

        // Extra double-dashes in eatTheRest are skipped
        String[] extraArgs = cmd.getArgs();
        assertEquals(3, extraArgs.length);
        assertEquals("-b", extraArgs[0]);
        assertEquals("arg1", extraArgs[1]);
        assertEquals("arg2", extraArgs[2]);
    }

    @Test
    public void testSingleDashWithStopAtNonOptionFalse() throws Exception {
        String[] args = new String[]{"-"};
        CommandLine cmd = parser.parse(options, args, false);
        assertEquals(1, cmd.getArgs().length);
        assertEquals("-", cmd.getArgs()[0]);
    }

    @Test
    public void testSingleDashWithStopAtNonOptionTrue() throws Exception {
        String[] args = new String[]{"-", "rest1", "rest2"};
        CommandLine cmd = parser.parse(options, args, true);
        String[] extra = cmd.getArgs();
        assertEquals(2, extra.length);
        assertEquals("rest1", extra[0]);
        assertEquals("rest2", extra[1]);
    }

    // --- Unknown Options & stopAtNonOption Tests ---

    @Test(expected = UnrecognizedOptionException.class)
    public void testUnrecognizedOptionThrowsException() throws Exception {
        String[] args = new String[]{"-unknown"};
        parser.parse(options, args, false);
    }

    @Test
    public void testUnrecognizedOptionWithStopAtNonOption() throws Exception {
        options.addOption("a", false, "option a");
        String[] args = new String[]{"-a", "-unknown", "extra"};
        CommandLine cmd = parser.parse(options, args, true);

        assertTrue(cmd.hasOption("a"));
        String[] extra = cmd.getArgs();
        assertEquals(2, extra.length);
        assertEquals("-unknown", extra[0]);
        assertEquals("extra", extra[1]);
    }

    @Test
    public void testPlainArgumentStopsAtNonOption() throws Exception {
        options.addOption("a", false, "option a");
        String[] args = new String[]{"nonOption", "-a"};
        CommandLine cmd = parser.parse(options, args, true);

        assertFalse(cmd.hasOption("a"));
        String[] extra = cmd.getArgs();
        assertEquals(2, extra.length);
        assertEquals("nonOption", extra[0]);
        assertEquals("-a", extra[1]);
    }

    // --- Argument Handling in Options (processArgs) ---

    @Test
    public void testOptionWithRequiredArgument() throws Exception {
        Option optF = OptionBuilder.hasArg().create('f');
        options.addOption(optF);

        CommandLine cmd = parser.parse(options, new String[]{"-f", "value1"});
        assertTrue(cmd.hasOption("f"));
        assertEquals("value1", cmd.getOptionValue("f"));
    }

    @Test
    public void testOptionWithQuotedArgumentStripped() throws Exception {
        Option optF = OptionBuilder.hasArg().create('f');
        options.addOption(optF);

        CommandLine cmd = parser.parse(options, new String[]{"-f", "\"quoted_value\""});
        assertEquals("quoted_value", cmd.getOptionValue("f"));
    }

    @Test(expected = MissingArgumentException.class)
    public void testMissingArgumentThrowsException() throws Exception {
        Option optF = OptionBuilder.hasArg().create('f');
        options.addOption(optF);

        // Missing argument token at the end
        parser.parse(options, new String[]{"-f"});
    }

    @Test(expected = MissingArgumentException.class)
    public void testMissingArgumentWhenNextTokenIsAnOption() throws Exception {
        Option optF = OptionBuilder.hasArg().create('f');
        Option optB = new Option("b", "beta");
        options.addOption(optF);
        options.addOption(optB);

        // Next token is "-b", which is recognized as an option, so 'f' has no argument
        parser.parse(options, new String[]{"-f", "-b"});
    }

    @Test
    public void testOptionWithOptionalArgumentProvidedOrOmitted() throws Exception {
        Option optO = OptionBuilder.hasOptionalArg().create('o');
        options.addOption(optO);

        // Case 1: Provided
        CommandLine cmd1 = parser.parse(options, new String[]{"-o", "optionalVal"});
        assertTrue(cmd1.hasOption("o"));
        assertEquals("optionalVal", cmd1.getOptionValue("o"));

        // Case 2: Omitted
        CommandLine cmd2 = parser.parse(options, new String[]{"-o"});
        assertTrue(cmd2.hasOption("o"));
        assertEquals(null, cmd2.getOptionValue("o"));
    }

    @Test
    public void testOptionArgumentLimitExceededBreaksArgumentLoop() throws Exception {
        // Option that accepts only 1 argument
        Option optM = OptionBuilder.hasArgs(1).create('m');
        options.addOption(optM);

        CommandLine cmd = parser.parse(options, new String[]{"-m", "val1", "val2"});
        assertTrue(cmd.hasOption("m"));
        assertEquals("val1", cmd.getOptionValue("m"));
        // "val2" is not consumed by -m, so it becomes a standard non-option argument
        assertEquals(1, cmd.getArgs().length);
        assertEquals("val2", cmd.getArgs()[0]);
    }

    // --- Required Options & Groups Tests ---

    @Test
    public void testRequiredOptionSatisfied() throws Exception {
        Option reqOpt = OptionBuilder.isRequired().create("req");
        options.addOption(reqOpt);

        CommandLine cmd = parser.parse(options, new String[]{"-req"});
        assertTrue(cmd.hasOption("req"));
    }

    @Test(expected = MissingOptionException.class)
    public void testRequiredOptionMissingThrowsException() throws Exception {
        Option reqOpt = OptionBuilder.isRequired().create("req");
        options.addOption(reqOpt);

        parser.parse(options, new String[0]);
    }

    @Test
    public void testRequiredOptionGroupSatisfied() throws Exception {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option opt1 = new Option("x", "option x");
        Option opt2 = new Option("y", "option y");
        group.addOption(opt1);
        group.addOption(opt2);
        options.addOptionGroup(group);

        CommandLine cmd = parser.parse(options, new String[]{"-x"});
        assertTrue(cmd.hasOption("x"));
        assertFalse(cmd.hasOption("y"));
    }

    @Test(expected = MissingOptionException.class)
    public void testRequiredOptionGroupMissingThrowsException() throws Exception {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(new Option("x", "option x"));
        options.addOptionGroup(group);

        parser.parse(options, new String[0]);
    }

    @Test(expected = AlreadySelectedException.class)
    public void testOptionGroupConflictThrowsException() throws Exception {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("x", "option x");
        Option opt2 = new Option("y", "option y");
        group.addOption(opt1);
        group.addOption(opt2);
        options.addOptionGroup(group);

        parser.parse(options, new String[]{"-x", "-y"});
    }

    // --- Properties Processing Tests ---

    @Test
    public void testProcessPropertiesWithFlagOptions() throws Exception {
        Option flag1 = new Option("f1", false, "flag 1");
        Option flag2 = new Option("f2", false, "flag 2");
        Option flag3 = new Option("f3", false, "flag 3");
        options.addOption(flag1);
        options.addOption(flag2);
        options.addOption(flag3);

        Properties props = new Properties();
        props.setProperty("f1", "true");
        props.setProperty("f2", "yes");
        props.setProperty("f3", "1");

        CommandLine cmd = parser.parse(options, new String[0], props);
        assertTrue(cmd.hasOption("f1"));
        assertTrue(cmd.hasOption("f2"));
        assertTrue(cmd.hasOption("f3"));
    }

    @Test
    public void testProcessPropertiesWithArgumentOptions() throws Exception {
        Option argOpt = OptionBuilder.hasArg().create("param");
        options.addOption(argOpt);

        Properties props = new Properties();
        props.setProperty("param", "myPropertyVal");

        CommandLine cmd = parser.parse(options, new String[0], props);
        assertTrue(cmd.hasOption("param"));
        assertEquals("myPropertyVal", cmd.getOptionValue("param"));
    }

    @Test
    public void testProcessPropertiesDoesNotOverrideCommandLineArg() throws Exception {
        Option argOpt = OptionBuilder.hasArg().create("param");
        options.addOption(argOpt);

        Properties props = new Properties();
        props.setProperty("param", "fromProp");

        CommandLine cmd = parser.parse(options, new String[]{"-param", "fromCmd"}, props);
        assertTrue(cmd.hasOption("param"));
        assertEquals("fromCmd", cmd.getOptionValue("param"));
    }

    @Test
    public void testOptionsDataClearedAcrossMultipleParses() throws Exception {
        Option opt = OptionBuilder.hasArg().create('s');
        options.addOption(opt);

        CommandLine cmd1 = parser.parse(options, new String[]{"-s", "val1"});
        assertEquals("val1", cmd1.getOptionValue('s'));

        // Re-parsing should clear previous values CLI-71
        CommandLine cmd2 = parser.parse(options, new String[]{"-s", "val2"});
        assertEquals("val2", cmd2.getOptionValue('s'));
        String[] values = cmd2.getOptionValues('s');
        assertEquals(1, values.length);
        assertEquals("val2", values[0]);
    }
}
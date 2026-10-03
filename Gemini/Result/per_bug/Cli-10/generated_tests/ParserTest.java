package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.*;

/**
 * Test suite for {@link Parser} targeting high branch/condition coverage
 * and boundary/fault edge cases.
 */
public class ParserTest {

    private TestParser parser;
    private Options options;

    /**
     * Concrete implementation of Parser for testing abstract behavior.
     */
    private static class TestParser extends Parser {
        @Override
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) {
            return arguments != null ? arguments : new String[0];
        }
    }

    @Before
    public void setUp() {
        parser = new TestParser();
        options = new Options();
    }

    // -------------------------------------------------------------------------
    // 1. Basic & Null / Empty Handling
    // -------------------------------------------------------------------------

    @Test
    public void testParseWithNullArguments() throws Exception {
        CommandLine cl = parser.parse(options, (String[]) null);
        assertNotNull("CommandLine should not be null", cl);
        assertEquals("Args list should be empty", 0, cl.getArgs().length);
    }

    @Test
    public void testParseWithEmptyArguments() throws Exception {
        CommandLine cl = parser.parse(options, new String[0]);
        assertNotNull(cl);
        assertEquals(0, cl.getArgs().length);
    }

    @Test
    public void testParseOverloads() throws Exception {
        Option optA = new Option("a", "alpha", false, "Option A");
        options.addOption(optA);

        // parse(Options, String[])
        CommandLine cl1 = parser.parse(options, new String[]{"-a"});
        assertTrue(cl1.hasOption("a"));

        // parse(Options, String[], Properties)
        Properties props = new Properties();
        CommandLine cl2 = parser.parse(options, new String[]{"-a"}, props);
        assertTrue(cl2.hasOption("a"));

        // parse(Options, String[], boolean)
        CommandLine cl3 = parser.parse(options, new String[]{"-a"}, true);
        assertTrue(cl3.hasOption("a"));
    }

    // -------------------------------------------------------------------------
    // 2. Token Processing & Branch Coverage in parse()
    // -------------------------------------------------------------------------

    @Test
    public void testDoubleDashTerminator() throws Exception {
        Option optA = new Option("a", false, "Option A");
        options.addOption(optA);

        // Tokens after "--" must be treated as arguments, and "--" itself should not be added
        String[] args = new String[]{"-a", "--", "arg1", "--", "arg2"};
        CommandLine cl = parser.parse(options, args);

        assertTrue(cl.hasOption("a"));
        String[] leftArgs = cl.getArgs();
        assertEquals(2, leftArgs.length);
        assertEquals("arg1", leftArgs[0]);
        assertEquals("arg2", leftArgs[1]);
    }

    @Test
    public void testSingleDashWithStopAtNonOptionFalse() throws Exception {
        String[] args = new String[]{"-"};
        CommandLine cl = parser.parse(options, args, false);
        assertEquals(1, cl.getArgs().length);
        assertEquals("-", cl.getArgs()[0]);
    }

    @Test
    public void testSingleDashWithStopAtNonOptionTrue() throws Exception {
        String[] args = new String[]{"-", "extra1", "--", "extra2"};
        CommandLine cl = parser.parse(options, args, true);
        // Single dash with stopAtNonOption=true triggers eatTheRest
        String[] leftArgs = cl.getArgs();
        assertEquals(2, leftArgs.length);
        assertEquals("extra1", leftArgs[0]);
        assertEquals("extra2", leftArgs[1]);
    }

    @Test
    public void testUnrecognizedOptionWithStopAtNonOptionTrue() throws Exception {
        Option optA = new Option("a", false, "Option A");
        options.addOption(optA);

        // -b is unknown option, stopAtNonOption=true -> should add -b and eat remaining
        String[] args = new String[]{"-a", "-b", "value", "--", "afterDoubleDash"};
        CommandLine cl = parser.parse(options, args, true);

        assertTrue(cl.hasOption("a"));
        assertFalse(cl.hasOption("b"));
        String[] leftArgs = cl.getArgs();
        assertEquals(2, leftArgs.length);
        assertEquals("-b", leftArgs[0]);
        assertEquals("value", leftArgs[1]);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testUnrecognizedOptionWithStopAtNonOptionFalse() throws Exception {
        String[] args = new String[]{"-unknown"};
        parser.parse(options, args, false);
    }

    @Test
    public void testNonOptionArgumentStopAtNonOptionFalse() throws Exception {
        Option optA = new Option("a", false, "Option A");
        options.addOption(optA);

        String[] args = new String[]{"nonOption1", "-a", "nonOption2"};
        CommandLine cl = parser.parse(options, args, false);

        assertTrue(cl.hasOption("a"));
        String[] leftArgs = cl.getArgs();
        assertEquals(2, leftArgs.length);
        assertEquals("nonOption1", leftArgs[0]);
        assertEquals("nonOption2", leftArgs[1]);
    }

    @Test
    public void testNonOptionArgumentStopAtNonOptionTrue() throws Exception {
        Option optA = new Option("a", false, "Option A");
        options.addOption(optA);

        String[] args = new String[]{"nonOption1", "-a", "nonOption2"};
        CommandLine cl = parser.parse(options, args, true);

        // Since "nonOption1" is encountered first, -a is not parsed as an option
        assertFalse(cl.hasOption("a"));
        String[] leftArgs = cl.getArgs();
        assertEquals(3, leftArgs.length);
        assertEquals("nonOption1", leftArgs[0]);
        assertEquals("-a", leftArgs[1]);
        assertEquals("nonOption2", leftArgs[2]);
    }

    // -------------------------------------------------------------------------
    // 3. Arguments Processing (processArgs)
    // -------------------------------------------------------------------------

    @Test
    public void testOptionWithArgumentsAndQuotes() throws Exception {
        Option optF = new Option("f", true, "File");
        options.addOption(optF);

        String[] args = new String[]{"-f", "\"quoted value\""};
        CommandLine cl = parser.parse(options, args);

        assertTrue(cl.hasOption("f"));
        assertEquals("quoted value", cl.getOptionValue("f"));
    }

    @Test
    public void testOptionStopsArgProcessingWhenNextTokenIsOption() throws Exception {
        Option optA = new Option("a", true, "Option A");
        Option optB = new Option("b", false, "Option B");
        options.addOption(optA);
        options.addOption(optB);

        // -a has arg, but next token is -b (another option) -> missing argument for -a
        String[] args = new String[]{"-a", "-b"};
        try {
            parser.parse(options, args);
            fail("Expected MissingArgumentException");
        } catch (MissingArgumentException e) {
            assertEquals("Missing argument for option:a", e.getMessage());
        }
    }

    @Test
    public void testOptionMaxArgsReached() throws Exception {
        Option optM = new Option("m", true, "Option with max 1 arg");
        optM.setArgs(1);
        options.addOption(optM);

        String[] args = new String[]{"-m", "val1", "val2"};
        CommandLine cl = parser.parse(options, args);

        assertTrue(cl.hasOption("m"));
        assertEquals("val1", cl.getOptionValue("m"));
        // val2 cannot be processed by optM, so it becomes a remaining arg
        assertEquals(1, cl.getArgs().length);
        assertEquals("val2", cl.getArgs()[0]);
    }

    @Test
    public void testOptionWithOptionalArgPresent() throws Exception {
        Option optO = new Option("o", true, "Optional arg");
        optO.setOptionalArg(true);
        options.addOption(optO);

        String[] args = new String[]{"-o", "optionalValue"};
        CommandLine cl = parser.parse(options, args);
        assertTrue(cl.hasOption("o"));
        assertEquals("optionalValue", cl.getOptionValue("o"));
    }

    @Test
    public void testOptionWithOptionalArgMissing() throws Exception {
        Option optO = new Option("o", true, "Optional arg");
        optO.setOptionalArg(true);
        Option optB = new Option("b", false, "Option B");
        options.addOption(optO);
        options.addOption(optB);

        String[] args = new String[]{"-o", "-b"};
        CommandLine cl = parser.parse(options, args);

        assertTrue(cl.hasOption("o"));
        assertTrue(cl.hasOption("b"));
        assertNull(cl.getOptionValue("o"));
    }

    // -------------------------------------------------------------------------
    // 4. Required Options & Option Groups (checkRequiredOptions)
    // -------------------------------------------------------------------------

    @Test
    public void testSingleMissingRequiredOption() {
        Option optR = new Option("r", false, "Required option");
        optR.setRequired(true);
        options.addOption(optR);

        try {
            parser.parse(options, new String[0]);
            fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            assertEquals("Missing required option: r", e.getMessage());
        } catch (ParseException e) {
            fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testMultipleMissingRequiredOptions() {
        Option optR1 = new Option("r", false, "Required 1");
        optR1.setRequired(true);
        Option optR2 = new Option("s", false, "Required 2");
        optR2.setRequired(true);
        options.addOption(optR1);
        options.addOption(optR2);

        try {
            parser.parse(options, new String[0]);
            fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            assertTrue("Should contain plural form", e.getMessage().startsWith("Missing required options: "));
            assertTrue(e.getMessage().contains("r"));
            assertTrue(e.getMessage().contains("s"));
        } catch (ParseException e) {
            fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testRequiredOptionGroupSatisfied() throws Exception {
        Option opt1 = new Option("a", false, "Group opt 1");
        Option opt2 = new Option("b", false, "Group opt 2");
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(opt1);
        group.addOption(opt2);
        options.addOptionGroup(group);

        CommandLine cl = parser.parse(options, new String[]{"-a"});
        assertTrue(cl.hasOption("a"));
        assertFalse(cl.hasOption("b"));
    }

    @Test(expected = MissingOptionException.class)
    public void testRequiredOptionGroupMissing() throws Exception {
        Option opt1 = new Option("a", false, "Group opt 1");
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(opt1);
        options.addOptionGroup(group);

        parser.parse(options, new String[0]);
    }

    @Test(expected = AlreadySelectedException.class)
    public void testOptionGroupMultipleSelectedThrows() throws Exception {
        Option opt1 = new Option("a", false, "Group opt 1");
        Option opt2 = new Option("b", false, "Group opt 2");
        OptionGroup group = new OptionGroup();
        group.addOption(opt1);
        group.addOption(opt2);
        options.addOptionGroup(group);

        parser.parse(options, new String[]{"-a", "-b"});
    }

    // -------------------------------------------------------------------------
    // 5. Properties Processing (processProperties)
    // -------------------------------------------------------------------------

    @Test
    public void testProcessPropertiesNull() throws Exception {
        CommandLine cl = parser.parse(options, new String[0], null, false);
        assertNotNull(cl);
    }

    @Test
    public void testPropertiesWithArgOption() throws Exception {
        Option optP = new Option("p", true, "Property option");
        options.addOption(optP);

        Properties props = new Properties();
        props.setProperty("p", "propValue");

        CommandLine cl = parser.parse(options, new String[0], props);
        assertTrue(cl.hasOption("p"));
        assertEquals("propValue", cl.getOptionValue("p"));
    }

    @Test
    public void testPropertiesDoesNotOverwriteCommandLineValue() throws Exception {
        Option optP = new Option("p", true, "Property option");
        options.addOption(optP);

        Properties props = new Properties();
        props.setProperty("p", "propValue");

        CommandLine cl = parser.parse(options, new String[]{"-p", "cliValue"}, props);
        assertTrue(cl.hasOption("p"));
        assertEquals("cliValue", cl.getOptionValue("p"));
    }

    @Test
    public void testPropertiesBooleanTrueValues() throws Exception {
        Option optA = new Option("a", false, "Flag A");
        Option optB = new Option("b", false, "Flag B");
        Option optC = new Option("c", false, "Flag C");
        options.addOption(optA);
        options.addOption(optB);
        options.addOption(optC);

        Properties props = new Properties();
        props.setProperty("a", "true");
        props.setProperty("b", "yes");
        props.setProperty("c", "1");

        CommandLine cl = parser.parse(options, new String[0], props);
        assertTrue(cl.hasOption("a"));
        assertTrue(cl.hasOption("b"));
        assertTrue(cl.hasOption("c"));
    }

    @Test
    public void testPropertiesBooleanFalseBreaksLoop() throws Exception {
        // If a flag option has property value other than yes/true/1, it breaks out of the loop
        Option optA = new Option("a", false, "Flag A");
        options.addOption(optA);

        Properties props = new Properties();
        props.setProperty("a", "no");

        CommandLine cl = parser.parse(options, new String[0], props);
        assertFalse(cl.hasOption("a"));
    }

    // -------------------------------------------------------------------------
    // 6. State Reset & Defects4J Cli-10 Boundary/Fault Test
    // -------------------------------------------------------------------------

    @Test
    public void testOptionsReuseClearsPreviousValues() throws Exception {
        Option optH = new Option("h", "help", true, "Help option");
        options.addOption(optH);

        CommandLine cl1 = parser.parse(options, new String[]{"-h", "val1"});
        assertEquals("val1", cl1.getOptionValue("h"));

        CommandLine cl2 = parser.parse(options, new String[]{"-h", "val2"});
        assertEquals("val2", cl2.getOptionValue("h"));
        String[] values = cl2.getOptionValues("h");
        assertEquals("Values must be reset and not accumulate", 1, values.length);
    }

    @Test
    public void testReusingOptionsWithRequiredOptions() throws Exception {
        // Defects4J Cli-10: modifying requiredOptions should not corrupt subsequent parses
        Option optR = new Option("r", false, "Required option");
        optR.setRequired(true);
        options.addOption(optR);

        // 1st parse: required option is provided -> success
        CommandLine cl1 = parser.parse(options, new String[]{"-r"});
        assertTrue(cl1.hasOption("r"));

        // 2nd parse: required option is missing -> must throw MissingOptionException
        try {
            parser.parse(options, new String[0]);
            fail("Expected MissingOptionException on reused Options instance");
        } catch (MissingOptionException e) {
            assertEquals("Missing required option: r", e.getMessage());
        }
    }
}
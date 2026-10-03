package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.Properties;

/**
 * Comprehensive test suite for Parser (Defects4J Cli-30b)
 * targeting high branch/condition coverage and edge cases.
 */
public class ParserTest extends TestCase {

    private ConcreteParser parser;
    private Options options;

    // Concrete implementation of abstract Parser class for testing purposes
    private static class ConcreteParser extends Parser {
        @Override
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) {
            // Simple flattening logic for testing: returns arguments as-is
            if (arguments == null) {
                return new String[0];
            }
            return arguments;
        }
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        parser = new ConcreteParser();
        options = new Options();
    }

    public void testParseNullArguments() throws ParseException {
        CommandLine cl = parser.parse(options, null);
        assertNotNull(cl);
        assertEquals(0, cl.getArgs().length);
    }

    public void testParseDoubleDashToken() throws ParseException {
        options.addOption(new Option("a", "alpha", false, "alpha option"));
        String[] args = new String[] { "--", "-a" };
        CommandLine cl = parser.parse(options, args);
        // "--" should trigger eatTheRest, so "-a" is treated as a plain argument, not an option
        assertTrue(cl.getArgs().length > 0);
        assertFalse(cl.hasOption("a"));
    }

    public void testParseSingleDashWithStopAtNonOption() throws ParseException {
        String[] args = new String[] { "-" };
        CommandLine cl = parser.parse(options, args, true);
        assertNotNull(cl);
        assertEquals(1, cl.getArgs().length);
        assertEquals("-", cl.getArgs()[0]);
    }

    public void testParseSingleDashWithoutStopAtNonOption() throws ParseException {
        String[] args = new String[] { "-" };
        CommandLine cl = parser.parse(options, args, false);
        assertNotNull(cl);
        assertEquals(1, cl.getArgs().length);
    }

    public void testParseUnrecognizedOptionWithStopAtNonOption() throws ParseException {
        String[] args = new String[] { "-unknown" };
        CommandLine cl = parser.parse(options, args, true);
        assertNotNull(cl);
        assertTrue(cl.hasList(cl.getArgs()));
        assertEquals("-unknown", cl.getArgs()[0]);
    }

    public void testParseUnrecognizedOptionThrowsException() {
        String[] args = new String[] { "-unknown" };
        try {
            parser.parse(options, args, false);
            fail("Expected UnrecognizedOptionException");
        } catch (UnrecognizedOptionException e) {
            assertEquals("-unknown", e.getOption());
        } catch (ParseException e) {
            fail("Unexpected ParseException type: " + e.getClass().getName());
        }
    }

    public void testParseArgumentWithStopAtNonOption() throws ParseException {
        options.addOption(new Option("b", "beta", true, "beta option"));
        String[] args = new String[] { "non-option", "-b", "val" };
        CommandLine cl = parser.parse(options, args, true);
        // Once a non-option is encountered with stopAtNonOption=true, eatTheRest is enabled
        assertNotNull(cl);
        assertTrue(cl.getArgs().length > 0);
    }

    public void testProcessPropertiesNull() {
        try {
            parser.setOptions(options);
            parser.processProperties(null);
            // Should return cleanly without exception
            assertTrue(true);
        } catch (ParseException e) {
            fail("Unexpected ParseException: " + e.getMessage());
        }
    }

    public void testProcessPropertiesValidValues() throws ParseException {
        Option optFlag = new Option("f", "flag", false, "flag option");
        Option optVal = new Option("v", "val", true, "value option");
        options.addOption(optFlag);
        options.addOption(optVal);

        parser.setOptions(options);
        parser.cmd = new CommandLine();

        Properties props = new Properties();
        props.setProperty("f", "true");
        props.setProperty("v", "customValue");
        // Invalid boolean string for flag should be ignored
        props.setProperty("invalidFlag", "invalid");

        parser.processProperties(props);

        assertTrue(parser.cmd.hasOption("f"));
        assertTrue(parser.cmd.hasOption("v"));
        assertEquals("customValue", parser.cmd.getOptionValue("v"));
    }

    public void testProcessPropertiesBooleanVariations() throws ParseException {
        options.addOption(new Option("y", "yes", false, ""));
        options.addOption(new Option("t", "true", false, ""));
        options.addOption(new Option("o", "one", false, ""));

        parser.setOptions(options);
        parser.cmd = new CommandLine();

        Properties props = new Properties();
        props.setProperty("y", "yes");
        props.setProperty("t", "TRUE");
        props.setProperty("o", "1");

        parser.processProperties(props);

        assertTrue(parser.cmd.hasOption("y"));
        assertTrue(parser.cmd.hasOption("t"));
        assertTrue(parser.cmd.hasOption("o"));
    }

    public void testCheckRequiredOptionsThrowsException() {
        Option reqOpt = new Option("r", "req", false, "required");
        reqOpt.setRequired(true);
        options.addOption(reqOpt);

        parser.setOptions(options);

        try {
            parser.checkRequiredOptions();
            fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            assertNotNull(e.getMessage());
        }
    }

    public void testProcessArgsMissingArgumentThrowsException() {
        Option opt = new Option("a", "arg", true, "requires arg");
        options.addOption(opt);
        parser.setOptions(options);

        String[] args = new String[] { "-a" };
        java.util.List tokenList = java.util.Arrays.asList(args);
        java.util.ListIterator iter = tokenList.listIterator();

        try {
            // Advance iterator past "-a"
            iter.next();
            parser.processArgs(opt, iter);
            fail("Expected MissingArgumentException");
        } catch (MissingArgumentException e) {
            assertEquals(opt, e.getOption());
        } catch (ParseException e) {
            fail("Unexpected exception: " + e.getClass().getName());
        }
    }

    public void testProcessArgsOptionInterruption() throws ParseException {
        Option opt1 = new Option("a", "arg1", true, "opt 1");
        Option opt2 = new Option("b", "arg2", false, "opt 2");
        options.addOption(opt1);
        options.addOption(opt2);
        parser.setOptions(options);

        // When processing args for opt1, if another option (-b) is encountered, it should push back and break
        String[] args = new String[] { "-a", "-b" };
        java.util.List tokenList = java.util.Arrays.asList(args);
        java.util.ListIterator iter = tokenList.listIterator();
        
        iter.next(); // skip -a
        try {
            parser.processArgs(opt1, iter);
            fail("Expected MissingArgumentException because -b is treated as option interruption");
        } catch (MissingArgumentException e) {
            // Expected behavior when option is interrupted without argument value
        }
    }
}
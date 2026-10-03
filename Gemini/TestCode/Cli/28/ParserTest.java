package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.Properties;

/**
 * JUnit 4 Test Suite for Parser (Defects4J Cli-28b)
 * Designed by Senior Java Test Automation Engineer.
 */
public class ParserTest extends TestCase {

    private Parser parser;
    private Options options;

    protected void setUp() throws Exception {
        super.setUp();
        // ใช้ PosixParser เป็น Concrete implementation ของ Parser
        parser = new PosixParser();
        options = new Options();
    }

    public void testParseNullArguments() throws Exception {
        CommandLine cl = parser.parse(options, null);
        assertNotNull(cl);
        assertEquals(0, cl.getArgs().length);
    }

    public void testParseDoubleDashAndEatTheRest() throws Exception {
        options.addOption("a", "alpha", false, "alpha option");
        String[] args = new QsBuilder().a("-a").a("--").a("extraArg").build();
        
        CommandLine cl = parser.parse(options, args);
        assertTrue(cl.hasOption("a"));
        assertEquals(1, cl.getArgs().length);
        assertEquals("extraArg", cl.getArgs()[0]);
    }

    public void testParseSingleDashStopAtNonOptionTrue() throws Exception {
        String[] args = new String[] { "-" };
        CommandLine cl = parser.parse(options, args, true);
        assertEquals(1, cl.getArgs().length);
        assertEquals("-", cl.getArgs()[0]);
    }

    public void testParseSingleDashStopAtNonOptionFalse() throws Exception {
        String[] args = new String[] { "-" };
        CommandLine cl = parser.parse(options, args, false);
        assertEquals(1, cl.getArgs().length);
        assertEquals("-", cl.getArgs()[0]);
    }

    public void testParseUnrecognizedOptionWithStopAtNonOption() throws Exception {
        String[] args = new String[] { "-unknown", "arg1" };
        CommandLine cl = parser.parse(options, args, true);
        assertEquals(2, cl.getArgs().length);
        assertEquals("-unknown", cl.getArgs()[0]);
        assertEquals("arg1", cl.getArgs()[1]);
    }

    public void testParseUnrecognizedOptionThrowsException() {
        String[] args = new String[] { "-unknown" };
        try {
            parser.parse(options, args, false);
            fail("Expected UnrecognizedOptionException");
        } catch (UnrecognizedOptionException e) {
            assertEquals("-unknown", e.getOption());
        } catch (ParseException e) {
            fail("Unexpected exception type: " + e.getClass());
        }
    }

    public void testProcessPropertiesNull() throws Exception {
        // ทดสอบกรณี properties เป็น null
        parser.parse(options, new String[0], null, false);
        assertNotNull(parser.getOptions());
    }

    public void testProcessPropertiesWithArguments() throws Exception {
        options.addOption(OptionBuilder.withLongOpt("file").hasArg().create('f'));
        Properties props = new Properties();
        props.setProperty("file", "test.txt");

        CommandLine cl = parser.parse(options, new String[0], props, false);
        assertTrue(cl.hasOption("file"));
        assertEquals("test.txt", cl.getOptionValue("file"));
    }

    public void testProcessPropertiesBooleanValid() throws Exception {
        options.addOption("v", "verbose", false, "verbose output");
        Properties props = new Properties();
        props.setProperty("v", "true");

        CommandLine cl = parser.parse(options, new String[0], props, false);
        assertTrue(cl.hasOption("v"));
    }

    public void testProcessPropertiesBooleanInvalidBreak() throws Exception {
        options.addOption("v", "verbose", false, "verbose output");
        options.addOption("x", "extra", false, "extra output");
        Properties props = new Properties();
        props.setProperty("v", "invalid_bool"); // จะทำให้เกิด break ไม่อ่าน option ถัดไปถ้าผิดเงื่อนไข
        props.setProperty("x", "true");

        CommandLine cl = parser.parse(options, new String[0], props, false);
        assertFalse(cl.hasOption("v"));
        assertFalse(cl.hasOption("x"));
    }

    public void testCheckRequiredOptionsThrowsException() {
        options.addOption(OptionBuilder.isRequired().create('r'));
        try {
            parser.parse(options, new String[0]);
            fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            assertTrue(e.getMessage().contains("r"));
        } catch (ParseException e) {
            fail("Unexpected exception type");
        }
    }

    public void testOptionGroupHandling() throws Exception {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha");
        Option opt2 = new Option("b", "beta");
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(true);
        options.addOptionGroup(group);

        String[] args = new String[] { "-a" };
        CommandLine cl = parser.parse(options, args);
        assertTrue(cl.hasOption("a"));
        assertFalse(cl.hasOption("b"));
    }

    public void testProcessArgsMissingArgument() {
        options.addOption(OptionBuilder.hasArg().create('b'));
        String[] args = new String[] { "-b" }; // ไม่มี argument ตามหลัง
        try {
            parser.parse(options, args);
            fail("Expected MissingArgumentException");
        } catch (MissingArgumentException e) {
            assertEquals("b", e.getOption().getOpt());
        } catch (ParseException e) {
            fail("Unexpected exception type");
        }
    }

    // Helper class เพื่อสร้างอาเรย์สะดวกขึ้นภายใน JUnit 3.8/4 (ไม่มี List.of)
    private static class QsBuilder {
        private final java.util.List<String> list = new java.util.ArrayList<String>();
        public QsBuilder a(String val) {
            list.add(val);
            return this;
        }
        public String[] build() {
            return list.toArray(new String[0]);
        }
    }
}
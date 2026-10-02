package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Properties;

public class ParserTest {

    /**
     * Concrete implementation ของ Parser สำหรับทดสอบ
     * flatten() คืน arguments แบบ identity (ไม่แปลงรูป)
     * เพื่อทดสอบ logic ของ parse() โดยตรง
     */
    private static class TestParser extends Parser {
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption)
                throws ParseException {
            if (arguments == null) {
                return new String[0];
            }
            return arguments;
        }
    }

    private TestParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new TestParser();
        options = new Options();
    }

    // ---------------------------------------------------------------
    // Overload: parse(Options, String[])
    // ---------------------------------------------------------------
    @Test
    public void testParseTwoArgsNoOptions() throws Exception {
        CommandLine cl = parser.parse(options, new String[] {});
        assertNotNull(cl);
        assertEquals(0, cl.getOptions().length);
    }

    @Test
    public void testParseNullArguments() throws Exception {
        // arguments == null -> ควรถูกแทนที่ด้วย new String[0]
        CommandLine cl = parser.parse(options, null);
        assertNotNull(cl);
        assertEquals(0, cl.getArgs().length);
    }

    // ---------------------------------------------------------------
    // Overload: parse(Options, String[], Properties)
    // ---------------------------------------------------------------
    @Test
    public void testParseWithPropertiesOverload() throws Exception {
        options.addOption("a", false, "a option");
        Properties props = new Properties();
        props.setProperty("a", "true");
        CommandLine cl = parser.parse(options, new String[] {}, props);
        assertTrue(cl.hasOption("a"));
    }

    // ---------------------------------------------------------------
    // Overload: parse(Options, String[], boolean)
    // ---------------------------------------------------------------
    @Test
    public void testParseWithStopAtNonOptionOverload() throws Exception {
        options.addOption("a", false, "a option");
        CommandLine cl = parser.parse(options, new String[] { "-a" }, true);
        assertTrue(cl.hasOption("a"));
    }

    // ---------------------------------------------------------------
    // Token: "--" (double dash)
    // ---------------------------------------------------------------
    @Test
    public void testDoubleDashEatsRest() throws Exception {
        options.addOption("a", false, "a option");
        String[] args = { "--", "-a", "foo" };
        CommandLine cl = parser.parse(options, args);
        assertFalse(cl.hasOption("a"));
        assertEquals(2, cl.getArgList().size());
        assertEquals("-a", cl.getArgList().get(0));
        assertEquals("foo", cl.getArgList().get(1));
    }

    @Test
    public void testDoubleDashOnlyOneAddedIfDuplicated() throws Exception {
        // ทดสอบเงื่อนไข "ensure only one double-dash is added"
        String[] args = { "--", "--", "foo" };
        CommandLine cl = parser.parse(options, args);
        assertEquals(1, cl.getArgList().size());
        assertEquals("foo", cl.getArgList().get(0));
    }

    // ---------------------------------------------------------------
    // Token: "-" (single dash)
    // ---------------------------------------------------------------
    @Test
    public void testSingleDashNotStopAtNonOption() throws Exception {
        String[] args = { "-" };
        CommandLine cl = parser.parse(options, args, false);
        assertEquals(1, cl.getArgList().size());
        assertEquals("-", cl.getArgList().get(0));
    }

    @Test
    public void testSingleDashStopAtNonOption() throws Exception {
        String[] args = { "-", "foo" };
        CommandLine cl = parser.parse(options, args, true);
        assertEquals(1, cl.getArgList().size());
        assertEquals("foo", cl.getArgList().get(0));
    }

    // ---------------------------------------------------------------
    // Token starts with "-" (option candidate)
    // ---------------------------------------------------------------
    @Test
    public void testUnrecognizedOptionThrowsException() throws Exception {
        String[] args = { "-x" };
        try {
            parser.parse(options, args, false);
            fail("Expected UnrecognizedOptionException");
        } catch (UnrecognizedOptionException e) {
            assertEquals("-x", e.getOption());
        }
    }

    @Test
    public void testUnrecognizedOptionStopAtNonOption() throws Exception {
        String[] args = { "-x", "foo" };
        CommandLine cl = parser.parse(options, args, true);
        assertEquals(2, cl.getArgList().size());
        assertEquals("-x", cl.getArgList().get(0));
        assertEquals("foo", cl.getArgList().get(1));
    }

    @Test
    public void testRecognizedOptionProcessed() throws Exception {
        options.addOption("a", false, "a option");
        String[] args = { "-a" };
        CommandLine cl = parser.parse(options, args, true);
        assertTrue(cl.hasOption("a"));
    }

    // ---------------------------------------------------------------
    // Token: plain argument (else branch)
    // ---------------------------------------------------------------
    @Test
    public void testPlainArgumentNoStop() throws Exception {
        String[] args = { "foo", "bar" };
        CommandLine cl = parser.parse(options, args, false);
        assertEquals(2, cl.getArgList().size());
    }

    @Test
    public void testPlainArgumentStopAtNonOption() throws Exception {
        options.addOption("a", false, "a option");
        String[] args = { "foo", "-a" };
        CommandLine cl = parser.parse(options, args, true);
        assertEquals(2, cl.getArgList().size());
        assertEquals("foo", cl.getArgList().get(0));
        assertEquals("-a", cl.getArgList().get(1));
        assertFalse(cl.hasOption("a"));
    }

    // ---------------------------------------------------------------
    // processOption / processArgs
    // ---------------------------------------------------------------
    @Test
    public void testOptionWithRequiredArgument() throws Exception {
        options.addOption("f", true, "file option");
        String[] args = { "-f", "file.txt" };
        CommandLine cl = parser.parse(options, args);
        assertTrue(cl.hasOption("f"));
        assertEquals("file.txt", cl.getOptionValue("f"));
    }

    @Test
    public void testOptionMissingRequiredArgumentThrows() throws Exception {
        options.addOption("f", true, "file option");
        String[] args = { "-f" };
        try {
            parser.parse(options, args);
            fail("Expected MissingArgumentException");
        } catch (MissingArgumentException e) {
            assertEquals("f", e.getOption().getOpt());
        }
    }

    @Test
    public void testProcessArgsStopsWhenNextTokenIsOption() throws Exception {
        options.addOption("f", true, "file option");
        options.addOption("v", false, "verbose");
        String[] args = { "-f", "-v" };
        try {
            parser.parse(options, args);
            fail("Expected MissingArgumentException for -f with no value before -v");
        } catch (MissingArgumentException e) {
            assertEquals("f", e.getOption().getOpt());
        }
    }

    @Test
    public void testOptionalArgNotProvidedDoesNotThrow() throws Exception {
        Option opt = new Option("o", "optional arg");
        opt.setArgs(1);
        opt.setOptionalArg(true);
        options.addOption(opt);
        String[] args = { "-o" };
        CommandLine cl = parser.parse(options, args);
        assertTrue(cl.hasOption("o"));
    }

    // ---------------------------------------------------------------
    // processProperties
    // ---------------------------------------------------------------
    @Test
    public void testProcessPropertiesNullDoesNothing() throws Exception {
        CommandLine cl = parser.parse(options, new String[] {}, (Properties) null);
        assertNotNull(cl);
    }

    @Test
    public void testProcessPropertiesOptionAlreadySetSkipped() throws Exception {
        options.addOption("a", false, "a option");
        Properties props = new Properties();
        props.setProperty("a", "true");
        String[] args = { "-a" };
        CommandLine cl = parser.parse(options, args, props);
        assertTrue(cl.hasOption("a"));
    }

    @Test
    public void testProcessPropertiesOptionHasArgAddsValue() throws Exception {
        options.addOption("f", true, "file option");
        Properties props = new Properties();
        props.setProperty("f", "value.txt");
        CommandLine cl = parser.parse(options, new String[] {}, props);
        assertTrue(cl.hasOption("f"));
        assertEquals("value.txt", cl.getOptionValue("f"));
    }

    @Test
    public void testProcessPropertiesOptionAlreadyHasValuesFromCli() throws Exception {
        options.addOption("f", true, "file option");
        String[] args = { "-f", "cli-value.txt" };
        Properties props = new Properties();
        props.setProperty("f", "prop-value.txt");
        CommandLine cl = parser.parse(options, args, props);
        // NOTE: เนื่องจาก cmd.hasOption("f") เป็น true จาก CLI แล้ว
        // branch ของ properties จะถูก skip ทั้งหมด (if (!cmd.hasOption(option)))
        assertEquals("cli-value.txt", cl.getOptionValue("f"));
    }

    @Test
    public void testProcessPropertiesBooleanOptionTrueValue() throws Exception {
        options.addOption("b", false, "bool option");
        Properties props = new Properties();
        props.setProperty("b", "true");
        CommandLine cl = parser.parse(options, new String[] {}, props);
        assertTrue(cl.hasOption("b"));
    }

    @Test
    public void testProcessPropertiesBooleanOptionYesValue() throws Exception {
        options.addOption("b", false, "bool option");
        Properties props = new Properties();
        props.setProperty("b", "yes");
        CommandLine cl = parser.parse(options, new String[] {}, props);
        assertTrue(cl.hasOption("b"));
    }

    @Test
    public void testProcessPropertiesBooleanOptionOneValue() throws Exception {
        options.addOption("b", false, "bool option");
        Properties props = new Properties();
        props.setProperty("b", "1");
        CommandLine cl = parser.parse(options, new String[] {}, props);
        assertTrue(cl.hasOption("b"));
    }

    @Test
    public void testProcessPropertiesBooleanOptionFalseValueSkipped() throws Exception {
        options.addOption("b", false, "bool option");
        Properties props = new Properties();
        props.setProperty("b", "false");
        CommandLine cl = parser.parse(options, new String[] {}, props);
        // "false" ไม่ตรง yes/true/1 -> continue (ไม่เพิ่ม option)
        assertFalse(cl.hasOption("b"));
    }

    // ---------------------------------------------------------------
    // checkRequiredOptions
    // ---------------------------------------------------------------
    @Test
    public void testRequiredOptionMissingThrowsException() throws Exception {
        options.addOption(createRequiredOption("r", "required option"));
        try {
            parser.parse(options, new String[] {});
            fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            assertTrue(e.getMissingOptions().contains("r"));
        }
    }

    @Test
    public void testRequiredOptionPresentDoesNotThrow() throws Exception {
        options.addOption(createRequiredOption("r", "required option"));
        CommandLine cl = parser.parse(options, new String[] { "-r" });
        assertTrue(cl.hasOption("r"));
    }

    private Option createRequiredOption(String opt, String desc) throws Exception {
        Option option = new Option(opt, desc);
        option.setRequired(true);
        return option;
    }

    // ---------------------------------------------------------------
    // updateRequiredOptions: OptionGroup handling
    // ---------------------------------------------------------------
    @Test
    public void testOptionGroupRequiredSatisfiedByOneOption() throws Exception {
        Option a = new Option("a", "option a");
        Option b = new Option("b", "option b");
        OptionGroup group = new OptionGroup();
        group.addOption(a);
        group.addOption(b);
        group.setRequired(true);
        options.addOptionGroup(group);

        CommandLine cl = parser.parse(options, new String[] { "-a" });
        assertTrue(cl.hasOption("a"));
        assertEquals("a", group.getSelected());
    }

    @Test
    public void testOptionGroupRequiredMissingThrows() throws Exception {
        Option a = new Option("a", "option a");
        Option b = new Option("b", "option b");
        OptionGroup group = new OptionGroup();
        group.addOption(a);
        group.addOption(b);
        group.setRequired(true);
        options.addOptionGroup(group);

        try {
            parser.parse(options, new String[] {});
            fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            // expected
        }
    }

    // ---------------------------------------------------------------
    // CLI-71: ล้างค่าเก่าตอน reuse Options ระหว่างการ parse หลายครั้ง
    // ---------------------------------------------------------------
    @Test
    public void testOptionValuesClearedBetweenParses() throws Exception {
        options.addOption("f", true, "file option");
        parser.parse(options, new String[] { "-f", "first.txt" });

        Options options2 = new Options();
        options2.addOption("f", true, "file option");
        CommandLine cl2 = parser.parse(options2, new String[] { "-f", "second.txt" });
        assertEquals("second.txt", cl2.getOptionValue("f"));
    }
}

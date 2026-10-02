package org.apache.commons.cli;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.Properties;

// ใช้ตามข้อกำหนด: JUnit 4 style, import คลาสเป้าหมาย (แม้จะอยู่ package เดียวกัน)
import org.apache.commons.cli.Parser;

public class ParserTest {

    /**
     * Concrete implementation ของ Parser (abstract) สำหรับทดสอบ
     * flatten() คืนค่า arguments เดิมตรง ๆ ไม่มี logic เพิ่มเติม
     * เพื่อ isolate การทดสอบไปที่ parse()/processArgs()/processOption()/
     * processProperties()/checkRequiredOptions()
     */
    private static class TestParser extends Parser {
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) {
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
    // parse(Options, String[]) / null & empty arguments (boundary)
    // ---------------------------------------------------------------

    @Test
    public void testParseNullArguments() throws Exception {
        CommandLine cmd = parser.parse(options, null);
        assertNotNull(cmd);
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void testParseEmptyArguments() throws Exception {
        CommandLine cmd = parser.parse(options, new String[0]);
        assertNotNull(cmd);
        assertEquals(0, cmd.getArgs().length);
    }

    // ---------------------------------------------------------------
    // token: "--" (double dash) branch
    // ---------------------------------------------------------------

    @Test
    public void testParseDoubleDashOnlyNoRemaining() throws Exception {
        CommandLine cmd = parser.parse(options, new String[] {"--"});
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void testParseDoubleDashEnsuresOnlyOneAdded() throws Exception {
        // eatTheRest loop ต้องไม่เพิ่ม "--" ตัวที่สองเข้า args
        CommandLine cmd = parser.parse(options, new String[] {"--", "--", "a"});
        assertEquals(1, cmd.getArgs().length);
        assertEquals("a", cmd.getArgs()[0]);
    }

    @Test
    public void testParseDoubleDashStopsOptionParsing() throws Exception {
        options.addOption("a", false, "option a");
        CommandLine cmd = parser.parse(options, new String[] {"--", "-a", "b"});
        assertFalse(cmd.hasOption("a"));
        assertEquals(2, cmd.getArgs().length);
        assertEquals("-a", cmd.getArgs()[0]);
        assertEquals("b", cmd.getArgs()[1]);
    }

    // ---------------------------------------------------------------
    // token: "-" (single dash) branch, ทั้ง stopAtNonOption true/false
    // ---------------------------------------------------------------

    @Test
    public void testParseSingleDashNotStopAtNonOption() throws Exception {
        CommandLine cmd = parser.parse(options, new String[] {"-"}, false);
        assertEquals(1, cmd.getArgs().length);
        assertEquals("-", cmd.getArgs()[0]);
    }

    @Test
    public void testParseSingleDashStopAtNonOption() throws Exception {
        CommandLine cmd = parser.parse(options, new String[] {"-", "arg1"}, true);
        // ตาม source: กรณี stopAtNonOption=true, "-" เองไม่ถูก add เป็น arg
        // (เข้า branch eatTheRest=true เฉย ๆ) แต่ token ถัดไปจะถูกกวาดเข้า args
        assertEquals(1, cmd.getArgs().length);
        assertEquals("arg1", cmd.getArgs()[0]);
    }

    // ---------------------------------------------------------------
    // token startsWith "-" : recognized / unrecognized option,
    // ร่วมกับ stopAtNonOption true/false
    // ---------------------------------------------------------------

    @Test
    public void testParseSimpleOption() throws Exception {
        options.addOption("a", false, "option a");
        CommandLine cmd = parser.parse(options, new String[] {"-a"});
        assertTrue(cmd.hasOption("a"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParseUnrecognizedOption() throws Exception {
        parser.parse(options, new String[] {"-x"});
    }

    @Test
    public void testParseUnknownOptionStopAtNonOption() throws Exception {
        options.addOption("a", false, "option a");
        CommandLine cmd = parser.parse(options, new String[] {"-x", "-a"}, true);
        assertFalse(cmd.hasOption("a"));
        assertEquals(2, cmd.getArgs().length);
        assertEquals("-x", cmd.getArgs()[0]);
        assertEquals("-a", cmd.getArgs()[1]);
    }

    // ---------------------------------------------------------------
    // token เป็น argument ธรรมดา (else branch) ทั้ง stopAtNonOption true/false
    // ---------------------------------------------------------------

    @Test
    public void testParseNonOptionNotStopAtNonOption() throws Exception {
        CommandLine cmd = parser.parse(options, new String[] {"foo"}, false);
        assertEquals(1, cmd.getArgs().length);
        assertEquals("foo", cmd.getArgs()[0]);
    }

    @Test
    public void testParseNonOptionStopAtNonOption() throws Exception {
        options.addOption("a", false, "option a");
        CommandLine cmd = parser.parse(options, new String[] {"foo", "-a"}, true);
        assertFalse(cmd.hasOption("a"));
        assertEquals(2, cmd.getArgs().length);
        assertEquals("foo", cmd.getArgs()[0]);
        assertEquals("-a", cmd.getArgs()[1]);
    }

    // ---------------------------------------------------------------
    // processArgs(): value / recognized-option-stop / RuntimeException /
    // MissingArgumentException / optional arg
    // ---------------------------------------------------------------

    @Test
    public void testParseOptionWithRequiredArg() throws Exception {
        options.addOption("b", true, "option b with arg");
        CommandLine cmd = parser.parse(options, new String[] {"-b", "value"});
        assertTrue(cmd.hasOption("b"));
        assertEquals("value", cmd.getOptionValue("b"));
    }

    @Test(expected = MissingArgumentException.class)
    public void testParseOptionMissingRequiredArg() throws Exception {
        options.addOption("b", true, "option b with arg");
        parser.parse(options, new String[] {"-b"});
    }

    @Test(expected = MissingArgumentException.class)
    public void testProcessArgsStopsAtRecognizedOption() throws Exception {
        // "-f" ต้องการ arg แต่ token ถัดไปคือ option ที่รู้จัก ("-g")
        // -> processArgs ต้อง iter.previous()/break แล้วโยน MissingArgumentException
        options.addOption("f", true, "option f with arg");
        options.addOption("g", false, "option g");
        parser.parse(options, new String[] {"-f", "-g"});
    }

    @Test
    public void testProcessArgsRuntimeExceptionOnExtraValue() throws Exception {
        // สมมติ (ตาม public API ของ Option) ว่า addValue() จะ throw RuntimeException
        // เมื่อจำนวนค่าที่เพิ่มเกิน numberOfArgs ที่กำหนดด้วย setArgs(1)
        // -> processArgs ต้อง catch แล้ว iter.previous()/break
        Option opt = new Option("h", true, "option h single arg");
        opt.setArgs(1);
        options.addOption(opt);

        CommandLine cmd = parser.parse(options, new String[] {"-h", "val1", "val2"});

        assertEquals("val1", cmd.getOptionValue("h"));
        // val2 ต้องถูกดันคืน iterator แล้วกลายเป็น argument ปกติในลูปหลัก
        assertEquals(1, cmd.getArgs().length);
        assertEquals("val2", cmd.getArgs()[0]);
    }

    @Test
    public void testProcessArgsOptionalArgNoValueProvided() throws Exception {
        // opt.hasOptionalArg() == true และไม่มี value ให้เลย
        // -> ต้องไม่โยน MissingArgumentException (เงื่อนไข !opt.hasOptionalArg() เป็น false)
        Option opt = new Option("j", "option j optional arg");
        opt.setArgs(1);
        opt.setOptionalArg(true);
        options.addOption(opt);

        CommandLine cmd = parser.parse(options, new String[] {"-j"});

        assertTrue(cmd.hasOption("j"));
        assertNull(cmd.getOptionValue("j"));
    }

    // ---------------------------------------------------------------
    // processOption(): required option / OptionGroup
    // ---------------------------------------------------------------

    @Test
    public void testParseRequiredOptionPresent() throws Exception {
        Option opt = new Option("r", false, "required option");
        opt.setRequired(true);
        options.addOption(opt);

        CommandLine cmd = parser.parse(options, new String[] {"-r"});
        assertTrue(cmd.hasOption("r"));
    }

    @Test(expected = MissingOptionException.class)
    public void testParseRequiredOptionMissing() throws Exception {
        Option opt = new Option("r", false, "required option");
        opt.setRequired(true);
        options.addOption(opt);

        parser.parse(options, new String[0]);
    }

    @Test
    public void testParseOptionGroupSelected() throws Exception {
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", false, "option a");
        Option optB = new Option("b", false, "option b");
        group.addOption(optA);
        group.addOption(optB);
        group.setRequired(true);
        options.addOptionGroup(group);

        CommandLine cmd = parser.parse(options, new String[] {"-a"});

        assertTrue(cmd.hasOption("a"));
        assertEquals("a", group.getSelected());
    }

    @Test(expected = MissingOptionException.class)
    public void testParseOptionGroupRequiredMissing() throws Exception {
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", false, "option a");
        Option optB = new Option("b", false, "option b");
        group.addOption(optA);
        group.addOption(optB);
        group.setRequired(true);
        options.addOptionGroup(group);

        parser.parse(options, new String[0]);
    }

    // ---------------------------------------------------------------
    // processProperties(): null properties / hasArg / no-arg + yes/true/1/false
    // / option already set from command line
    // ---------------------------------------------------------------

    @Test
    public void testParseWithPropertiesNullProperties() throws Exception {
        options.addOption("a", false, "option a");
        CommandLine cmd = parser.parse(options, new String[0], (Properties) null);
        assertFalse(cmd.hasOption("a"));
    }

    @Test
    public void testParseWithPropertiesOptionHasArgAndValueSet() throws Exception {
        options.addOption("d", true, "option d with arg");
        Properties props = new Properties();
        props.setProperty("d", "propValue");

        CommandLine cmd = parser.parse(options, new String[0], props);

        assertTrue(cmd.hasOption("d"));
        assertEquals("propValue", cmd.getOptionValue("d"));
    }

    @Test
    public void testParseWithPropertiesOptionAlreadySetFromCmdLine() throws Exception {
        // cmd.hasOption(option) == true ตั้งแต่ก่อนเข้า processProperties
        // -> ต้องไม่ override ด้วยค่าจาก properties
        options.addOption("d", true, "option d with arg");
        Properties props = new Properties();
        props.setProperty("d", "propValue");

        CommandLine cmd = parser.parse(options, new String[] {"-d", "cliValue"}, props);

        assertEquals("cliValue", cmd.getOptionValue("d"));
    }

    @Test
    public void testParseWithPropertiesNoArgTrueValue() throws Exception {
        options.addOption("e", false, "option e no arg");
        Properties props = new Properties();
        props.setProperty("e", "true");

        CommandLine cmd = parser.parse(options, new String[0], props);
        assertTrue(cmd.hasOption("e"));
    }

    @Test
    public void testParseWithPropertiesNoArgYesValue() throws Exception {
        options.addOption("e", false, "option e no arg");
        Properties props = new Properties();
        props.setProperty("e", "yes");

        CommandLine cmd = parser.parse(options, new String[0], props);
        assertTrue(cmd.hasOption("e"));
    }

    @Test
    public void testParseWithPropertiesNoArgOneValue() throws Exception {
        options.addOption("e", false, "option e no arg");
        Properties props = new Properties();
        props.setProperty("e", "1");

        CommandLine cmd = parser.parse(options, new String[0], props);
        assertTrue(cmd.hasOption("e"));
    }

    @Test
    public void testParseWithPropertiesNoArgFalseValue() throws Exception {
        options.addOption("e", false, "option e no arg");
        Properties props = new Properties();
        props.setProperty("e", "false");

        CommandLine cmd = parser.parse(options, new String[0], props);
        // value ไม่ใช่ yes/true/1 -> ต้องไม่ addOption (break ก่อน cmd.addOption(opt))
        assertFalse(cmd.hasOption("e"));
    }

    /**
     * ทดสอบดักจับ fault ที่ทราบกัน (Defects4J Cli-4b): ใน processProperties()
     * มีการใช้ "break" แทน "continue" เมื่อค่า property ไม่ใช่ yes/true/1
     * ทำให้ property ตัวถัดไปในลูป (Enumeration) ไม่ถูกประมวลผลเลย
     * ทั้งที่ควรจะ skip เฉพาะตัวที่ไม่ผ่านเงื่อนไขแล้วไปประมวลผลตัวถัดไปต่อ
     *
     * หมายเหตุ: ลำดับการ iterate ของ Properties (Hashtable) ไม่ได้ถูกการันตี
     * แต่ในทางปฏิบัติกับ key จำนวนน้อย ("e","f") มักจะได้ลำดับที่สอดคล้องกับ
     * รูปแบบที่ต้องการทดสอบ fault นี้ได้
     */
    @Test
    public void testProcessPropertiesBreakBug() throws Exception {
        options.addOption("e", false, "option e no arg");
        options.addOption("f", false, "option f no arg");

        Properties props = new Properties();
        props.setProperty("e", "false"); // ค่าไม่ผ่าน -> ไม่ควร add
        props.setProperty("f", "true");  // ค่าผ่าน -> ควร add แม้ e จะไม่ผ่านก่อนหน้า

        CommandLine cmd = parser.parse(options, new String[0], props);

        assertFalse("option e ต้องไม่ถูกตั้งค่าเพราะค่าเป็น false", cmd.hasOption("e"));
        assertTrue("option f ต้องถูกตั้งค่าแม้ e จะถูก skip ก่อนหน้า (ตรวจจับ break-bug)",
                   cmd.hasOption("f"));
    }
}

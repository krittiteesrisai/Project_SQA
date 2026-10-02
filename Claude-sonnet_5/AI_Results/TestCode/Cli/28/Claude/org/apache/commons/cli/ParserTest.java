package org.apache.commons.cli;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.Properties;

public class ParserTest
{
    /**
     * Concrete Parser ที่ไม่ทำการ flatten จริง (คืนค่า arguments ตรง ๆ)
     * ใช้เพื่อทดสอบ logic ของ Parser เอง แยกจาก logic การ flatten ของ subclass จริง
     * (GnuParser / PosixParser) ซึ่งไม่ได้อยู่ในซอร์สที่ให้มา
     */
    private static class SimpleParser extends Parser
    {
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption)
        {
            return arguments;
        }
    }

    private SimpleParser parser;
    private Options options;

    @Before
    public void setUp()
    {
        parser = new SimpleParser();
        options = new Options();
    }

    // ================= parse(Options, String[]) - arguments null/empty =================

    @Test
    public void testParseNullArguments() throws Exception
    {
        // arguments == null -> ถูกแปลงเป็น empty array ภายใน parse()
        CommandLine cmd = parser.parse(options, null);
        assertNotNull(cmd);
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void testParseEmptyArguments() throws Exception
    {
        CommandLine cmd = parser.parse(options, new String[0]);
        assertNotNull(cmd);
        assertEquals(0, cmd.getArgs().length);
    }

    // ================= token == "--" =================

    @Test
    public void testParseDoubleDash() throws Exception
    {
        // "--" -> eatTheRest = true, token "--" เองไม่ถูกเพิ่มเข้า args
        // และ "--" ตัวที่สองในลิสต์ก็ไม่ถูกเพิ่มซ้ำ (ensure only one double-dash)
        String[] args = {"--", "foo", "--", "bar"};
        CommandLine cmd = parser.parse(options, args);
        assertArrayEquals(new String[]{"foo", "bar"}, cmd.getArgs());
    }

    // ================= token == "-" =================

    @Test
    public void testParseSingleDashNotStopAtNonOption() throws Exception
    {
        // "-" กับ stopAtNonOption=false -> cmd.addArg("-")
        String[] args = {"-"};
        CommandLine cmd = parser.parse(options, args, false);
        assertArrayEquals(new String[]{"-"}, cmd.getArgs());
    }

    @Test
    public void testParseSingleDashStopAtNonOption() throws Exception
    {
        // "-" กับ stopAtNonOption=true -> eatTheRest=true, "-" เองไม่ถูก addArg
        String[] args = {"-", "foo"};
        CommandLine cmd = parser.parse(options, args, true);
        assertArrayEquals(new String[]{"foo"}, cmd.getArgs());
    }

    // ================= token startsWith("-") : unknown / known option =================

    @Test
    public void testParseUnknownOptionStopAtNonOption() throws Exception
    {
        // stopAtNonOption=true และ option ไม่ถูกรู้จัก -> eatTheRest=true, arg ถูกเก็บ
        String[] args = {"-x", "foo"};
        CommandLine cmd = parser.parse(options, args, true);
        assertArrayEquals(new String[]{"-x", "foo"}, cmd.getArgs());
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParseUnknownOptionNotStopAtNonOption() throws Exception
    {
        // stopAtNonOption=false และ option ไม่ถูกรู้จัก -> processOption() throw exception
        String[] args = {"-x"};
        parser.parse(options, args, false);
    }

    @Test
    public void testParseKnownOptionNoArg() throws Exception
    {
        options.addOption("a", false, "a option");
        String[] args = {"-a"};
        CommandLine cmd = parser.parse(options, args);
        assertTrue(cmd.hasOption("a"));
    }

    // ================= plain argument (else branch) =================

    @Test
    public void testParsePlainArgumentNotStopAtNonOption() throws Exception
    {
        String[] args = {"foo"};
        CommandLine cmd = parser.parse(options, args, false);
        assertArrayEquals(new String[]{"foo"}, cmd.getArgs());
    }

    @Test
    public void testParsePlainArgumentStopAtNonOption() throws Exception
    {
        // argument ปกติ + stopAtNonOption=true -> eatTheRest=true
        String[] args = {"foo", "bar"};
        CommandLine cmd = parser.parse(options, args, true);
        assertArrayEquals(new String[]{"foo", "bar"}, cmd.getArgs());
    }

    // ================= checkRequiredOptions =================

    @Test(expected = MissingOptionException.class)
    public void testParseMissingRequiredOption() throws Exception
    {
        options.addOption("r", false, "required option");
        options.getOption("r").setRequired(true);
        parser.parse(options, new String[]{});
    }

    @Test
    public void testParseRequiredOptionPresent() throws Exception
    {
        options.addOption("r", false, "required option");
        options.getOption("r").setRequired(true);
        CommandLine cmd = parser.parse(options, new String[]{"-r"});
        assertTrue(cmd.hasOption("r"));
    }

    // ================= CLI-71: clear values/groups จากการ parse ครั้งก่อน =================

    @Test
    public void testParseClearsPreviousValues() throws Exception
    {
        options.addOption("a", true, "a option with arg");
        CommandLine cmd1 = parser.parse(options, new String[]{"-a", "value1"});
        assertEquals("value1", cmd1.getOptionValue("a"));

        CommandLine cmd2 = parser.parse(options, new String[]{"-a", "value2"});
        assertEquals("value2", cmd2.getOptionValue("a"));
        assertEquals(1, cmd2.getOptionValues("a").length);
    }

    // ================= OptionGroup =================

    @Test
    public void testParseOptionGroupSelected() throws Exception
    {
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", "aOpt");
        Option optB = new Option("b", "bOpt");
        group.addOption(optA);
        group.addOption(optB);
        options.addOptionGroup(group);

        CommandLine cmd = parser.parse(options, new String[]{"-a"});
        assertTrue(cmd.hasOption("a"));
        assertEquals("a", group.getSelected());
    }

    @Test(expected = AlreadySelectedException.class)
    public void testParseOptionGroupConflict() throws Exception
    {
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", "aOpt");
        Option optB = new Option("b", "bOpt");
        group.addOption(optA);
        group.addOption(optB);
        options.addOptionGroup(group);

        parser.parse(options, new String[]{"-a", "-b"});
    }

    @Test
    public void testParseRequiredOptionGroupSatisfied() throws Exception
    {
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", "aOpt");
        group.addOption(optA);
        group.setRequired(true);
        options.addOptionGroup(group);

        CommandLine cmd = parser.parse(options, new String[]{"-a"});
        assertTrue(cmd.hasOption("a"));
    }

    // ================= processProperties =================

    @Test
    public void testProcessPropertiesNull() throws Exception
    {
        // properties == null -> return ทันที ไม่มีผลใด ๆ
        CommandLine cmd = parser.parse(options, new String[0], null, false);
        assertNotNull(cmd);
    }

    @Test
    public void testProcessPropertiesOptionAlreadySetByCLI() throws Exception
    {
        // cmd.hasOption(option) == true (มาจาก CLI แล้ว) -> ข้าม property นี้
        options.addOption("a", false, "a option");
        Properties props = new Properties();
        props.setProperty("a", "true");

        CommandLine cmd = parser.parse(options, new String[]{"-a"}, props, false);
        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testProcessPropertiesWithArgValueSet() throws Exception
    {
        // opt.hasArg()==true, opt.getValues()==null -> ใช้ค่าจาก properties
        options.addOption("a", true, "a option with arg");
        Properties props = new Properties();
        props.setProperty("a", "propValue");

        CommandLine cmd = parser.parse(options, new String[0], props, false);
        assertTrue(cmd.hasOption("a"));
        assertEquals("propValue", cmd.getOptionValue("a"));
    }

    @Test
    public void testProcessPropertiesWithArgValueAlreadySetByCLI() throws Exception
    {
        // opt.getValues() ไม่ null/ไม่ว่าง (มาจาก CLI แล้ว) -> ไม่ใช้ค่าจาก properties
        options.addOption("a", true, "a option with arg");
        Properties props = new Properties();
        props.setProperty("a", "propValue");

        CommandLine cmd = parser.parse(options, new String[]{"-a", "cliValue"}, props, false);
        assertEquals("cliValue", cmd.getOptionValue("a"));
    }

    @Test
    public void testProcessPropertiesNoArgTrueValue() throws Exception
    {
        options.addOption("a", false, "a option");
        Properties props = new Properties();
        props.setProperty("a", "true");

        CommandLine cmd = parser.parse(options, new String[0], props, false);
        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testProcessPropertiesNoArgYesValue() throws Exception
    {
        options.addOption("a", false, "a option");
        Properties props = new Properties();
        props.setProperty("a", "yes");

        CommandLine cmd = parser.parse(options, new String[0], props, false);
        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testProcessPropertiesNoArgOneValue() throws Exception
    {
        options.addOption("a", false, "a option");
        Properties props = new Properties();
        props.setProperty("a", "1");

        CommandLine cmd = parser.parse(options, new String[0], props, false);
        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testProcessPropertiesNoArgFalseValue() throws Exception
    {
        // opt.hasArg()==false และค่าไม่ใช่ yes/true/1 -> เข้า branch "break"
        // (ตรวจสอบเฉพาะ property เดียวเพื่อไม่ให้ผลลัพธ์ขึ้นกับลำดับ Enumeration
        //  ซึ่งไม่รับประกันลำดับใน Properties)
        options.addOption("a", false, "a option");
        Properties props = new Properties();
        props.setProperty("a", "false");

        CommandLine cmd = parser.parse(options, new String[0], props, false);
        assertFalse(cmd.hasOption("a"));
    }

    // ================= processArgs =================

    @Test
    public void testProcessArgsSingleValue() throws Exception
    {
        options.addOption("a", true, "a option with arg");
        CommandLine cmd = parser.parse(options, new String[]{"-a", "value1"});
        assertEquals("value1", cmd.getOptionValue("a"));
    }

    @Test
    public void testProcessArgsStopsAtNextOption() throws Exception
    {
        // processArgs หยุดเมื่อพบ token ที่เป็น option (getOptions().hasOption(str) && startsWith("-"))
        options.addOption("a", true, "a option with arg");
        options.addOption("b", false, "b option");
        CommandLine cmd = parser.parse(options, new String[]{"-a", "value1", "-b"});
        assertEquals("value1", cmd.getOptionValue("a"));
        assertTrue(cmd.hasOption("b"));
    }

    @Test(expected = MissingArgumentException.class)
    public void testProcessArgsMissingArgument() throws Exception
    {
        // opt.getValues()==null && !opt.hasOptionalArg() -> throw
        options.addOption("a", true, "a option with arg");
        parser.parse(options, new String[]{"-a"});
    }

    @Test
    public void testProcessArgsOptionalArgMissing() throws Exception
    {
        // opt.getValues()==null แต่ hasOptionalArg()==true -> ไม่ throw
        Option opt = new Option("a", "a option optional arg");
        opt.setArgs(1);
        opt.setOptionalArg(true);
        options.addOption(opt);

        CommandLine cmd = parser.parse(options, new String[]{"-a"});
        assertTrue(cmd.hasOption("a"));
        assertNull(cmd.getOptionValue("a"));
    }

    @Test
    public void testProcessArgsQuotedValueStripped() throws Exception
    {
        // Util.stripLeadingAndTrailingQuotes ใช้ตัดเครื่องหมายคำพูดออกจากค่า
        options.addOption("a", true, "a option with arg");
        CommandLine cmd = parser.parse(options, new String[]{"-a", "\"quoted\""});
        assertEquals("quoted", cmd.getOptionValue("a"));
    }

    @Test
    public void testProcessArgsRuntimeExceptionCatchBranch() throws Exception
    {
        // NOTE: สมมติฐานนี้อ้างอิงพฤติกรรมมาตรฐานของ Option.addValueForProcessing()
        // (ซึ่งไม่ได้แสดงในซอร์สที่ให้มา) ว่าจะ throw RuntimeException เมื่อจำนวนค่า
        // เกิน numberOfArgs ที่กำหนด (ในที่นี้ = 1) ทำให้เข้า catch(RuntimeException)
        // -> iter.previous() + break แล้วค่าที่เหลือ ("value2") จะถูกประมวลผล
        // เป็น argument ปกติในลูปหลักของ parse()
        options.addOption("a", true, "a option with arg"); // numberOfArgs = 1
        CommandLine cmd = parser.parse(options, new String[]{"-a", "value1", "value2"});
        assertEquals("value1", cmd.getOptionValue("a"));
        assertArrayEquals(new String[]{"value2"}, cmd.getArgs());
    }

    // ================= processOption (เรียกตรงผ่าน protected access ในแพ็กเกจเดียวกัน) =================

    @Test(expected = UnrecognizedOptionException.class)
    public void testProcessOptionUnrecognizedDirect() throws Exception
    {
        ListIterator iter = Arrays.asList(new String[]{"-z"}).listIterator();
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        parser.processOption("-z", iter);
    }

    @Test
    public void testProcessOptionNoArgAddsOptionDirect() throws Exception
    {
        options.addOption("a", false, "a option");
        ListIterator iter = Arrays.asList(new String[]{"-a"}).listIterator();
        iter.next();
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        parser.processOption("-a", iter);
        assertTrue(parser.cmd.hasOption("a"));
    }
}

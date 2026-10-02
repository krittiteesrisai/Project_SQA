# JUnit 4 Test Suite สำหรับ `Parser` (Defects4J Cli-9b)

## หมายเหตุก่อนเริ่ม

เนื่องจาก `Parser` เป็น **abstract class** (มี `flatten()` เป็น abstract method) จึงต้องสร้าง **stub subclass** ภายในไฟล์ทดสอบ เพื่อคุม input tokens ให้ตรงกับที่ต้องการทดสอบ logic ของ `parse()` โดยตรง (ไม่ปนกับ logic การ flatten ของ `PosixParser`/`GnuParser` ซึ่งไม่ได้อยู่ในซอร์สที่ให้มา)

การใช้ `Options`, `Option`, `CommandLine`, `OptionGroup` เป็นการใช้ public API มาตรฐานของ commons-cli ที่ compile ร่วมกับ `Parser` อยู่แล้วในโปรเจกต์ (ไม่ได้แสดง source ให้ แต่จำเป็นต้องใช้เพื่อ instantiate การทดสอบ) — จุดที่ผมไม่แน่ใจ 100% ว่ามีอยู่จริงหรือไม่ (เช่น `setOptionalArg`, ชื่อ constant `UNLIMITED_VALUES`, การ return ของ `OptionGroup.getSelected()`) จะ **คอมเมนต์กำกับไว้ในโค้ด**

```java
package org.apache.commons.cli;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;

public class ParserTest {

    /**
     * Stub subclass เพื่อ isolate การทดสอบ parse() logic ของ Parser
     * โดยไม่พึ่ง flatten() algorithm ของ subclass จริง (PosixParser/GnuParser)
     * เนื่องจาก flatten() เป็น abstract และ implementation ของมันไม่ได้อยู่ใน
     * ซอร์สโค้ดเป้าหมายที่ให้มา จึงทำ identity flatten (คืนค่า arguments เดิม)
     */
    private static class StubParser extends Parser {
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) {
            return arguments;
        }
    }

    private StubParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new StubParser();
        options = new Options();
    }

    // ================= parse(): boundary / null / empty =================

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

    // ================= parse(): token "--" =================

    @Test
    public void testParseDoubleDashStopsAndDeduplicates() throws Exception {
        String[] args = {"--", "--", "foo", "-x"};
        CommandLine cmd = parser.parse(options, args);
        List argList = cmd.getArgList();
        // มีแค่ "--" ตัวแรกที่ทำให้ eatTheRest=true, ตัวที่สองต้องไม่ถูกเพิ่มเข้า args
        assertEquals(2, argList.size());
        assertEquals("foo", argList.get(0));
        assertEquals("-x", argList.get(1));
    }

    // ================= parse(): token "-" =================

    @Test
    public void testSingleDashNotStopAtNonOptionAddedAsArg() throws Exception {
        CommandLine cmd = parser.parse(options, new String[]{"-"}, false);
        assertEquals(1, cmd.getArgList().size());
        assertEquals("-", cmd.getArgList().get(0));
    }

    @Test
    public void testSingleDashStopAtNonOptionEatsRest() throws Exception {
        CommandLine cmd = parser.parse(options, new String[]{"-", "foo", "bar"}, true);
        List argList = cmd.getArgList();
        assertEquals(2, argList.size());
        assertEquals("foo", argList.get(0));
        assertEquals("bar", argList.get(1));
    }

    // ================= parse(): token startsWith("-") =================

    @Test
    public void testUnknownOptionStopAtNonOptionTrueEatsRest() throws Exception {
        CommandLine cmd = parser.parse(options, new String[]{"-z", "foo", "bar"}, true);
        List argList = cmd.getArgList();
        assertEquals(3, argList.size());
        assertEquals("-z", argList.get(0));
        assertEquals("foo", argList.get(1));
        assertEquals("bar", argList.get(2));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testUnknownOptionStopAtNonOptionFalseThrows() throws Exception {
        parser.parse(options, new String[]{"-z"}, false);
    }

    // ================= parse(): plain argument (else branch) =================

    @Test
    public void testPlainArgumentStopAtNonOptionEatsRest() throws Exception {
        options.addOption("a", false, "opt a");
        CommandLine cmd = parser.parse(options, new String[]{"foo", "-a"}, true);
        List argList = cmd.getArgList();
        assertEquals(2, argList.size());
        assertEquals("foo", argList.get(0));
        assertEquals("-a", argList.get(1));
        assertFalse(cmd.hasOption("a"));
    }

    @Test
    public void testPlainArgumentNotStopAtNonOption() throws Exception {
        options.addOption("a", false, "opt a");
        CommandLine cmd = parser.parse(options, new String[]{"foo", "-a"}, false);
        assertEquals(1, cmd.getArgList().size());
        assertEquals("foo", cmd.getArgList().get(0));
        assertTrue(cmd.hasOption("a"));
    }

    // ================= processOption() =================

    @Test(expected = UnrecognizedOptionException.class)
    public void testProcessOptionUnrecognizedThrows() throws Exception {
        parser.parse(options, new String[]{"-x"});
    }

    @Test
    public void testProcessOptionRequiredRemovedFromRequiredList() throws Exception {
        Option opt = new Option("r", "required opt"); // สมมติ constructor (opt, description)
        opt.setRequired(true);
        options.addOption(opt);

        CommandLine cmd = parser.parse(options, new String[]{"-r"});
        assertTrue(cmd.hasOption("r"));
        // ถ้า required list ไม่ถูกล้าง จะเกิด MissingOptionException แทน
    }

    @Test
    public void testProcessOptionWithOptionGroupRequiredSelected() throws Exception {
        Option opt1 = new Option("x", "x desc");
        Option opt2 = new Option("y", "y desc");
        OptionGroup group = new OptionGroup();
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(true);
        options.addOptionGroup(group);

        CommandLine cmd = parser.parse(options, new String[]{"-x"});
        assertTrue(cmd.hasOption("x"));
        // สมมติว่า getSelected() คืนค่า key ของ option ที่ถูกเลือก
        assertEquals("x", group.getSelected());
    }

    @Test
    public void testProcessOptionHasArgCallsProcessArgs() throws Exception {
        Option opt = new Option("f", "file option");
        opt.setArgs(1);
        options.addOption(opt);

        CommandLine cmd = parser.parse(options, new String[]{"-f", "value.txt"});
        assertTrue(cmd.hasOption("f"));
        assertEquals("value.txt", cmd.getOptionValue("f"));
    }

    // ================= processArgs() =================

    @Test
    public void testProcessArgsStopsAtNextRecognizedOption() throws Exception {
        Option optA = new Option("a", "a desc");
        optA.setArgs(2);
        Option optB = new Option("b", "b desc");
        options.addOption(optA);
        options.addOption(optB);

        CommandLine cmd = parser.parse(options, new String[]{"-a", "v1", "v2", "-b"});
        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("b"));
        String[] values = cmd.getOptionValues("a");
        assertNotNull(values);
        assertEquals(2, values.length);
        assertEquals("v1", values[0]);
        assertEquals("v2", values[1]);
    }

    @Test(expected = MissingArgumentException.class)
    public void testProcessArgsMissingArgumentThrows() throws Exception {
        Option opt = new Option("f", "file option");
        opt.setArgs(1);
        options.addOption(opt);
        Option optG = new Option("g", "g desc");
        options.addOption(optG);

        // ไม่มี value ให้ -f และ token ต่อไปเป็น option ที่รู้จัก -> ไม่มีค่าถูกเติม
        parser.parse(options, new String[]{"-f", "-g"});
    }

    @Test
    public void testProcessArgsOptionalArgNoValuePresent() throws Exception {
        Option opt = new Option("o", "optional arg option");
        // หมายเหตุ: สมมติว่า Option มี setOptionalArg(boolean) ตาม standard commons-cli API
        opt.setOptionalArg(true);
        opt.setArgs(1);
        options.addOption(opt);

        CommandLine cmd = parser.parse(options, new String[]{"-o"});
        assertTrue(cmd.hasOption("o"));
        // ไม่ throw MissingArgumentException เพราะ hasOptionalArg() == true
    }

    // ================= processProperties() =================

    @Test
    public void testProcessPropertiesNullNoException() throws Exception {
        CommandLine cmd = parser.parse(options, new String[0], null, false);
        assertNotNull(cmd);
    }

    @Test
    public void testProcessPropertiesSkipWhenAlreadyOnCommandLine() throws Exception {
        Option opt = new Option("a", "a desc");
        opt.setArgs(1);
        options.addOption(opt);

        Properties props = new Properties();
        props.setProperty("a", "propvalue");

        CommandLine cmd = parser.parse(options, new String[]{"-a", "clivalue"}, props, false);
        // ค่าจาก CLI ต้องไม่ถูก override เพราะ cmd.hasOption("a") เป็น true อยู่แล้ว
        assertEquals("clivalue", cmd.getOptionValue("a"));
    }

    @Test
    public void testProcessPropertiesAddsValueForOptionWithArg() throws Exception {
        Option opt = new Option("a", "a desc");
        opt.setArgs(1);
        options.addOption(opt);

        Properties props = new Properties();
        props.setProperty("a", "propvalue");

        CommandLine cmd = parser.parse(options, new String[0], props, false);
        assertTrue(cmd.hasOption("a"));
        assertEquals("propvalue", cmd.getOptionValue("a"));
    }

    @Test
    public void testProcessPropertiesFlagOptionTrueValueAdded() throws Exception {
        Option opt = new Option("b", "b desc"); // ไม่มี arg
        options.addOption(opt);

        Properties props = new Properties();
        props.setProperty("b", "true");

        CommandLine cmd = parser.parse(options, new String[0], props, false);
        assertTrue(cmd.hasOption("b"));
    }

    @Test
    public void testProcessPropertiesFlagOptionYesValueAdded() throws Exception {
        Option opt = new Option("c", "c desc");
        options.addOption(opt);

        Properties props = new Properties();
        props.setProperty("c", "yes");

        CommandLine cmd = parser.parse(options, new String[0], props, false);
        assertTrue(cmd.hasOption("c"));
    }

    @Test
    public void testProcessPropertiesFlagOptionOneValueAdded() throws Exception {
        Option opt = new Option("d", "d desc");
        options.addOption(opt);

        Properties props = new Properties();
        props.setProperty("d", "1");

        CommandLine cmd = parser.parse(options, new String[0], props, false);
        assertTrue(cmd.hasOption("d"));
    }

    @Test
    public void testProcessPropertiesFlagOptionInvalidValueNotAdded() throws Exception {
        Option opt = new Option("e", "e desc");
        options.addOption(opt);

        Properties props = new Properties();
        props.setProperty("e", "no");

        CommandLine cmd = parser.parse(options, new String[0], props, false);
        assertFalse(cmd.hasOption("e"));
        // หมายเหตุ: ในซอร์สนี้ใช้ "break" แทน "continue" (known bug ของ CLI-13/Cli-9b)
        // การทดสอบผลกระทบข้าม property หลายตัวพร้อมกันไม่สามารถทำได้แน่นอน
        // เพราะ Properties (Hashtable) ไม่รับประกันลำดับการ enumerate — จึงไม่เขียนเทส
        // ที่อ้าง "ลำดับ" ของ property ตาม requirement ข้อ 4 (ห้ามเดา behavior)
    }

    // ================= checkRequiredOptions() =================

    @Test
    public void testCheckRequiredOptionsNoneRequiredNoException() throws Exception {
        Option opt = new Option("a", "a desc");
        options.addOption(opt);
        CommandLine cmd = parser.parse(options, new String[0]);
        assertNotNull(cmd);
    }

    @Test
    public void testCheckRequiredOptionsSingleMissingSingularMessage() throws Exception {
        Option opt = new Option("a", "a desc");
        opt.setRequired(true);
        options.addOption(opt);

        try {
            parser.parse(options, new String[0]);
            fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            assertTrue(e.getMessage().startsWith("Missing required option:"));
            assertFalse(e.getMessage().startsWith("Missing required options:"));
        }
    }

    @Test
    public void testCheckRequiredOptionsMultipleMissingPluralMessage() throws Exception {
        Option optA = new Option("a", "a desc");
        optA.setRequired(true);
        Option optB = new Option("b", "b desc");
        optB.setRequired(true);
        options.addOption(optA);
        options.addOption(optB);

        try {
            parser.parse(options, new String[0]);
            fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            assertTrue(e.getMessage().startsWith("Missing required options:"));
        }
    }

    // ================= overload delegation =================

    @Test
    public void testParseOverloadWithPropertiesOnly() throws Exception {
        Option opt = new Option("a", "a desc");
        options.addOption(opt);

        Properties props = new Properties();
        props.setProperty("a", "true");

        CommandLine cmd = parser.parse(options, new String[0], props);
        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParseOverloadStopAtNonOptionOnly() throws Exception {
        CommandLine cmd = parser.parse(options, new String[]{"foo"}, true);
        assertEquals(1, cmd.getArgList().size());
    }
}
```

## ตารางสรุป Test Method → Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testParseNullArguments` | `arguments == null` → `arguments = new String[0]`, loop ไม่ทำงาน |
| `testParseEmptyArguments` | boundary: array ว่าง, loop ไม่ทำงาน |
| `testParseDoubleDashStopsAndDeduplicates` | token `"--"` → `eatTheRest=true`; ภายใน eating loop เงื่อนไข `!"--".equals(str)` |
| `testSingleDashNotStopAtNonOptionAddedAsArg` | token `"-"`, `stopAtNonOption=false` → `cmd.addArg(t)` |
| `testSingleDashStopAtNonOptionEatsRest` | token `"-"`, `stopAtNonOption=true` → `eatTheRest=true` + eating loop |
| `testUnknownOptionStopAtNonOptionTrueEatsRest` | `t.startsWith("-")`, `stopAtNonOption && !hasOption(t)` = true |
| `testUnknownOptionStopAtNonOptionFalseThrows` | `t.startsWith("-")` else branch → `processOption` → unrecognized throw |
| `testPlainArgumentStopAtNonOptionEatsRest` | else (argument) branch + `stopAtNonOption=true` → eatTheRest |
| `testPlainArgumentNotStopAtNonOption` | else (argument) branch + `stopAtNonOption=false` |
| `testProcessOptionUnrecognizedThrows` | `processOption`: `!hasOption` → `UnrecognizedOptionException` |
| `testProcessOptionRequiredRemovedFromRequiredList` | `opt.isRequired()==true`; `checkRequiredOptions` size==0 (no exception) |
| `testProcessOptionWithOptionGroupRequiredSelected` | `getOptionGroup(opt) != null`; `group.isRequired()==true` |
| `testProcessOptionHasArgCallsProcessArgs` | `opt.hasArg()==true` → เรียก `processArgs` |
| `testProcessArgsStopsAtNextRecognizedOption` | `processArgs` loop: token matched option → `iter.previous(); break` |
| `testProcessArgsMissingArgumentThrows` | `opt.getValues()==null && !hasOptionalArg()` → `MissingArgumentException` |
| `testProcessArgsOptionalArgNoValuePresent` | `opt.getValues()==null && hasOptionalArg()==true` → ไม่ throw |
| `testProcessPropertiesNullNoException` | `properties == null` → return ทันที |
| `testProcessPropertiesSkipWhenAlreadyOnCommandLine` | `!cmd.hasOption(option)==false` → skip |
| `testProcessPropertiesAddsValueForOptionWithArg` | `opt.hasArg()==true`; `getValues()==null` → `addValueForProcessing` |
| `testProcessPropertiesFlagOptionTrueValueAdded` | `opt.hasArg()==false`; value=`"true"` |
| `testProcessPropertiesFlagOptionYesValueAdded` | value=`"yes"` |
| `testProcessPropertiesFlagOptionOneValueAdded` | value=`"1"` |
| `testProcessPropertiesFlagOptionInvalidValueNotAdded` | value ไม่ตรง → `break` branch (known CLI-13 fault) |
| `testCheckRequiredOptionsNoneRequiredNoException` | `requiredOptions.size() > 0` == false |
| `testCheckRequiredOptionsSingleMissingSingularMessage` | `size()==1` → ข้อความ singular |
| `testCheckRequiredOptionsMultipleMissingPluralMessage` | `size()>1` → ข้อความ plural + while loop >1 รอบ |
| `testParseOverloadWithPropertiesOnly` | overload `parse(options,args,properties)` |
| `testParseOverloadStopAtNonOptionOnly` | overload `parse(options,args,boolean)` |

**ข้อจำกัดที่ต้องระวัง:** การทดสอบ known bug `break` vs `continue` ใน `processProperties` (CLI-13/Cli-9b) แบบข้าม property หลายตัวไม่สามารถทำได้แน่นอนเพราะลำดับการ enumerate ของ `Properties`/`Hashtable` ไม่ได้ถูกการันตี จึงคงไว้เพียงการทดสอบแต่ละ branch เดี่ยว ๆ ตามที่ปรากฏในซอร์สโค้ดจริงเท่านั้น
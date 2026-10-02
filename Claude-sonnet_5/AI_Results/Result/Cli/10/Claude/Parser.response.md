# วิเคราะห์และแนวทางการทดสอบ

`Parser` เป็น abstract class จึงต้องสร้าง subclass เปล่า ๆ (`TestParser`) ที่ทำ `flatten()` แบบ identity (คืนค่า `arguments` ตรง ๆ) เพื่อแยกทดสอบ logic ของ `Parser` เองออกจาก logic ของ subclass จริง (เช่น `GnuParser`/`PosixParser`) ที่ไม่ได้อยู่ใน source ที่ให้มา

**หมายเหตุสำคัญ:**
- คลาสทดสอบอยู่ใน package เดียวกัน (`org.apache.commons.cli`) เพื่อเข้าถึง protected members (`setOptions`, `cmd`, `processOption`, `processProperties`, `checkRequiredOptions`) ได้โดยตรงสำหรับ white-box testing — จึงไม่จำเป็นต้องมี `import` แยกสำหรับ `Parser`
- คลาส `Options`, `Option`, `OptionGroup`, `CommandLine` ไม่ได้อยู่ใน source ที่ให้มา แต่จำเป็นต่อการ compile — ใช้ API มาตรฐานของ Apache Commons CLI ตามคอมเมนต์ในโค้ด และกำกับด้วยคอมเมนต์ตรงจุดที่ไม่แน่ใจ
- โจทย์ระบุ classpath เป็น `junit-3.8.1.jar` แต่ข้อ 2 ระบุให้ใช้ JUnit 4 (`@Test`) — ยึดตามข้อ 2 เป็นหลัก และตั้งข้อสังเกตไว้ ณ ที่นี้

```java
package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link Parser}.
 *
 * TestParser คือ minimal concrete subclass ที่ flatten() แบบ identity
 * เพื่อทดสอบ logic ของ Parser.parse()/processOption()/processArgs()/processProperties()
 * โดยตรง ไม่ปนกับ logic การ tokenize ของ subclass จริง (GnuParser/PosixParser)
 * ซึ่งไม่ได้อยู่ใน source ที่ให้มา
 */
public class ParserTest {

    private static class TestParser extends Parser {
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) {
            return arguments; // identity flatten
        }
    }

    private TestParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new TestParser();
        options = new Options();
    }

    // ---------- parse() overload / null & empty arguments ----------

    @Test
    public void testParseNullArguments() throws Exception {
        CommandLine cmd = parser.parse(options, null);
        assertNotNull(cmd);
        assertTrue(cmd.getArgList().isEmpty());
    }

    @Test
    public void testParseEmptyArguments() throws Exception {
        CommandLine cmd = parser.parse(options, new String[0]);
        assertNotNull(cmd);
        assertTrue(cmd.getArgList().isEmpty());
    }

    // ---------- "--" branch ----------

    @Test
    public void testDoubleDashStopsOptionProcessing() throws Exception {
        CommandLine cmd = parser.parse(options, new String[] { "--", "foo", "bar" });
        assertEquals(Arrays.asList("foo", "bar"), cmd.getArgList());
    }

    @Test
    public void testEatTheRestSkipsOnlyDoubleDashToken() throws Exception {
        CommandLine cmd = parser.parse(options, new String[] { "--", "a", "--", "b" });
        // ภายใน eatTheRest loop ต้อง skip เฉพาะ "--" ตัวที่ซ้ำ ไม่ใช่ token อื่น
        assertEquals(Arrays.asList("a", "b"), cmd.getArgList());
    }

    // ---------- "-" branch ----------

    @Test
    public void testSingleDashNotStopAtNonOption() throws Exception {
        CommandLine cmd = parser.parse(options, new String[] { "-" }, false);
        assertEquals(Arrays.asList("-"), cmd.getArgList());
    }

    @Test
    public void testSingleDashWithStopAtNonOption() throws Exception {
        // "-" เดี่ยว ๆ ไม่ถูก addArg เมื่อ stopAtNonOption=true (เข้า eatTheRest ทันที)
        CommandLine cmd = parser.parse(options, new String[] { "-", "x" }, true);
        assertEquals(Arrays.asList("x"), cmd.getArgList());
    }

    // ---------- unrecognized option branch ----------

    @Test(expected = UnrecognizedOptionException.class)
    public void testUnrecognizedOptionThrows() throws Exception {
        parser.parse(options, new String[] { "-x" });
    }

    @Test
    public void testUnrecognizedOptionWithStopAtNonOptionDoesNotThrow() throws Exception {
        CommandLine cmd = parser.parse(options, new String[] { "-x", "y", "z" }, true);
        assertEquals(Arrays.asList("-x", "y", "z"), cmd.getArgList());
    }

    // ---------- recognized option branch ----------

    @Test
    public void testRecognizedOptionIsProcessed() throws Exception {
        options.addOption(new Option("a", false, "opt a"));
        CommandLine cmd = parser.parse(options, new String[] { "-a" });
        assertTrue(cmd.hasOption("a"));
    }

    // ---------- plain argument branch ----------

    @Test
    public void testPlainArgumentNotStopAtNonOption() throws Exception {
        options.addOption(new Option("a", false, "opt a"));
        CommandLine cmd = parser.parse(options, new String[] { "foo", "-a" });
        assertEquals(Arrays.asList("foo"), cmd.getArgList());
        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testPlainArgumentWithStopAtNonOption() throws Exception {
        options.addOption(new Option("a", false, "opt a"));
        CommandLine cmd = parser.parse(options, new String[] { "foo", "-a", "bar" }, true);
        assertEquals(Arrays.asList("foo", "-a", "bar"), cmd.getArgList());
        assertFalse(cmd.hasOption("a"));
    }

    // ---------- required option (checkRequiredOptions) ----------

    @Test(expected = MissingOptionException.class)
    public void testMissingRequiredOptionThrows() throws Exception {
        Option req = new Option("r", false, "required opt");
        req.setRequired(true);
        options.addOption(req);
        parser.parse(options, new String[0]);
    }

    @Test
    public void testRequiredOptionSatisfiedDoesNotThrow() throws Exception {
        Option req = new Option("r", false, "required opt");
        req.setRequired(true);
        options.addOption(req);
        CommandLine cmd = parser.parse(options, new String[] { "-r" });
        assertTrue(cmd.hasOption("r"));
    }

    @Test
    public void testCheckRequiredOptionsMessageForSingleMissing() throws Exception {
        Option req = new Option("r", false, "required opt");
        req.setRequired(true);
        options.addOption(req);
        try {
            parser.parse(options, new String[0]);
            fail("expected MissingOptionException");
        } catch (MissingOptionException e) {
            assertFalse(e.getMessage().contains("options")); // size==1 -> ไม่มี "s"
        }
    }

    @Test
    public void testCheckRequiredOptionsMessageForMultipleMissing() throws Exception {
        Option r1 = new Option("r", false, "required 1");
        r1.setRequired(true);
        Option s1 = new Option("s", false, "required 2");
        s1.setRequired(true);
        options.addOption(r1);
        options.addOption(s1);
        try {
            parser.parse(options, new String[0]);
            fail("expected MissingOptionException");
        } catch (MissingOptionException e) {
            assertTrue(e.getMessage().contains("options")); // size>1 -> "s"
        }
    }

    // ---------- OptionGroup branch (assumption: standard Commons-CLI OptionGroup API) ----------

    @Test
    public void testRequiredOptionGroupSatisfiedDoesNotThrow() throws Exception {
        // หมายเหตุ: อ้างอิงพฤติกรรมมาตรฐานของ Options.addOptionGroup/OptionGroup
        // ซึ่งไม่ได้อยู่ใน source ของ Parser ที่ให้มา
        Option a = new Option("a", false, "opt a");
        Option b = new Option("b", false, "opt b");
        OptionGroup group = new OptionGroup();
        group.addOption(a);
        group.addOption(b);
        group.setRequired(true);
        options.addOptionGroup(group);

        CommandLine cmd = parser.parse(options, new String[] { "-a" });
        assertTrue(cmd.hasOption("a"));
    }

    @Test(expected = ParseException.class)
    public void testOptionGroupConflictThrows() throws Exception {
        // หมายเหตุ: คาดว่า OptionGroup.setSelected จะ throw AlreadySelectedException
        // (subclass ของ ParseException) เมื่อเลือก option ที่ 2 ในกลุ่มเดียวกัน
        Option a = new Option("a", false, "opt a");
        Option b = new Option("b", false, "opt b");
        OptionGroup group = new OptionGroup();
        group.addOption(a);
        group.addOption(b);
        options.addOptionGroup(group);

        parser.parse(options, new String[] { "-a", "-b" });
    }

    // ---------- option with argument (processOption hasArg branch true/false) ----------

    @Test
    public void testOptionWithArgumentValueIsParsed() throws Exception {
        options.addOption(new Option("f", true, "opt f with arg"));
        CommandLine cmd = parser.parse(options, new String[] { "-f", "file.txt" });
        assertEquals("file.txt", cmd.getOptionValue("f"));
    }

    @Test(expected = MissingArgumentException.class)
    public void testOptionRequiresArgumentButNoneProvidedThrows() throws Exception {
        options.addOption(new Option("f", true, "opt f with arg"));
        parser.parse(options, new String[] { "-f" });
    }

    // ---------- processProperties() white-box ----------

    @Test
    public void testProcessPropertiesNullDoesNothing() throws Exception {
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        parser.processProperties(null);
        assertTrue(parser.cmd.getArgList().isEmpty());
    }

    @Test
    public void testProcessPropertiesOptionAlreadySetIsSkipped() throws Exception {
        Option a = new Option("a", false, "opt a");
        options.addOption(a);
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        parser.cmd.addOption(a);

        Properties props = new Properties();
        props.setProperty("a", "true");

        parser.processProperties(props);
        assertTrue(parser.cmd.hasOption("a"));
    }

    @Test
    public void testProcessPropertiesHasArgAddsValue() throws Exception {
        Option a = new Option("a", true, "opt a with arg");
        options.addOption(a);
        parser.setOptions(options);
        parser.cmd = new CommandLine();

        Properties props = new Properties();
        props.setProperty("a", "value1");

        parser.processProperties(props);
        assertTrue(parser.cmd.hasOption("a"));
        assertEquals("value1", parser.cmd.getOptionValue("a"));
    }

    @Test
    public void testProcessPropertiesNoArgValidBooleanValueAddsOption() throws Exception {
        Option a = new Option("a", false, "opt a no arg");
        options.addOption(a);
        parser.setOptions(options);
        parser.cmd = new CommandLine();

        Properties props = new Properties();
        props.setProperty("a", "true");

        parser.processProperties(props);
        assertTrue(parser.cmd.hasOption("a"));
    }

    @Test
    public void testProcessPropertiesNoArgInvalidValueBreaksLoop() throws Exception {
        Option a = new Option("a", false, "opt a no arg");
        options.addOption(a);
        parser.setOptions(options);
        parser.cmd = new CommandLine();

        Properties props = new Properties();
        props.setProperty("a", "notabool"); // ไม่ตรง yes/true/1 -> break

        parser.processProperties(props);
        assertFalse(parser.cmd.hasOption("a"));
    }

    // ---------- processArgs() (public method) white-box ----------

    @Test(expected = MissingArgumentException.class)
    public void testProcessArgsMissingRequiredArgumentThrows() throws Exception {
        Option a = new Option("a", true, "opt a with required arg");
        List empty = Arrays.asList(new String[0]);
        ListIterator it = empty.listIterator();
        parser.processArgs(a, it);
    }

    @Test
    public void testProcessArgsOptionalArgNoValueDoesNotThrow() throws Exception {
        Option a = new Option("a", true, "opt a with optional arg");
        a.setOptionalArg(true);
        List empty = Arrays.asList(new String[0]);
        ListIterator it = empty.listIterator();
        parser.processArgs(a, it);
        assertNull(a.getValues());
    }

    @Test
    public void testProcessArgsAddsValueUntilNextOption() throws Exception {
        options.addOption(new Option("b", false, "opt b"));
        parser.setOptions(options);

        Option a = new Option("a", true, "opt a with arg");
        List tokens = Arrays.asList(new String[] { "val1", "-b" });
        ListIterator it = tokens.listIterator();

        parser.processArgs(a, it);
        assertEquals(1, a.getValues().length);
        assertEquals("val1", a.getValues()[0]);
        assertTrue(it.hasNext());
        assertEquals("-b", it.next()); // ต้องถูก previous() คืนกลับให้อ่านซ้ำได้
    }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| Test method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testParseNullArguments | `arguments == null` → สร้าง `new String[0]` |
| testParseEmptyArguments | loop ไม่ทำงานเลย (empty tokenList) |
| testDoubleDashStopsOptionProcessing | `"--".equals(t)` → eatTheRest=true |
| testEatTheRestSkipsOnlyDoubleDashToken | eatTheRest loop: `if (!"--".equals(str))` true/false |
| testSingleDashNotStopAtNonOption | `"-".equals(t)`, stopAtNonOption=false → addArg |
| testSingleDashWithStopAtNonOption | `"-".equals(t)`, stopAtNonOption=true → eatTheRest |
| testUnrecognizedOptionThrows | `!hasOption` ใน processOption → throw |
| testUnrecognizedOptionWithStopAtNonOptionDoesNotThrow | `stopAtNonOption && !hasOption(t)` true |
| testRecognizedOptionIsProcessed | `t.startsWith("-")` → else branch (processOption ปกติ), `opt.isRequired()`=false |
| testPlainArgumentNotStopAtNonOption | else (plain arg), `stopAtNonOption`=false |
| testPlainArgumentWithStopAtNonOption | else (plain arg), `stopAtNonOption`=true → eatTheRest |
| testMissingRequiredOptionThrows / testRequiredOptionSatisfiedDoesNotThrow | `checkRequiredOptions`: size>0 throw / size==0 ไม่ throw; `opt.isRequired()`=true remove |
| testCheckRequiredOptionsMessageForSingleMissing / ForMultipleMissing | ternary `size==1 ? "" : "s"` ทั้งสองสาขา |
| testRequiredOptionGroupSatisfiedDoesNotThrow | `getOptionGroup(opt)!=null`, `group.isRequired()`=true |
| testOptionGroupConflictThrows | `getOptionGroup(opt)!=null`, `group.isRequired()`=false, exception จาก setSelected |
| testOptionWithArgumentValueIsParsed / testOptionRequiresArgumentButNoneProvidedThrows | `opt.hasArg()`=true → processArgs (สำเร็จ/ล้มเหลว) |
| testProcessPropertiesNullDoesNothing | `properties == null` → return |
| testProcessPropertiesOptionAlreadySetIsSkipped | `cmd.hasOption(option)`=true → skip |
| testProcessPropertiesHasArgAddsValue | `opt.hasArg()`=true, `getValues()==null` → addValueForProcessing |
| testProcessPropertiesNoArgValidBooleanValueAddsOption | `opt.hasArg()`=false, value ตรง yes/true/1 → ไม่ break |
| testProcessPropertiesNoArgInvalidValueBreaksLoop | `opt.hasArg()`=false, value ไม่ตรง → break |
| testProcessArgsMissingRequiredArgumentThrows | `getValues()==null && !hasOptionalArg()` → throw |
| testProcessArgsOptionalArgNoValueDoesNotThrow | `hasOptionalArg()`=true → ไม่ throw |
| testProcessArgsAddsValueUntilNextOption | `hasOption(str) && str.startsWith("-")` → `iter.previous(); break` |

**ข้อจำกัด/ข้อสังเกต:** เนื่องจาก source ของ `Options`, `Option`, `OptionGroup`, `CommandLine` ไม่ได้ถูกให้มา ทดสอบบางเคส (เช่น OptionGroup, RuntimeException จาก `addValueForProcessing`) อ้างอิงพฤติกรรมมาตรฐานของ Apache Commons CLI และมีคอมเมนต์กำกับความไม่แน่ใจไว้ในโค้ดตามที่กำหนด
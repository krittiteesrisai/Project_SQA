# วิเคราะห์โครงสร้าง Branch ของ `PosixParser`

จากซอร์สโค้ด มี decision points หลักดังนี้:

- `flatten()`: `--` prefix (มี/ไม่มี `=`), `"-"` เดี่ยว, length==2 (`processOptionToken`), length>2 กับ `hasOption` ตรง/ไม่ตรง (`burstToken`), `stopAtNonOption` true/false กับ token ธรรมดา, `gobble`
- `processOptionToken()`: `hasOption` true/false ร่วมกับ `stopAtNonOption`
- `burstToken()`: loop กับ `hasOption` true (มี/ไม่มี `hasArg`+remainder), `hasOption` false กับ `stopAtNonOption` true/false
- `process()`: `currentOption != null && hasArg()` true/false → หมายเหตุ: branch `else if (currentOption.hasArgs())` เป็น **dead code** (unreachable) เพราะเงื่อนไขนอกเช็ค `hasArg()` ไปแล้ว หากเป็น false จะตกไป `else` ทันที ไม่มีทางเข้าเงื่อนไขนี้ได้ — **ไม่สามารถเขียนเทสให้ครอบคลุมได้จริง จึงกำกับคอมเมนต์ไว้ในโค้ด**
- `gobble()`: `eatTheRest` true/false

---

```java
package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test สำหรับ PosixParser (Defects4J Cli-19b)
 * วางไว้ใน package เดียวกับคลาสเป้าหมาย เพื่อเรียก protected method flatten()/burstToken() ได้ตรง
 */
public class PosixParserTest {

    private PosixParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new PosixParser();
        options = new Options();
    }

    // ---------- 1. Long option "--" ----------

    @Test
    public void testLongOptionWithoutEquals() {
        // branch: token.startsWith("--") == true, indexOf('=') == -1
        String[] result = parser.flatten(options, new String[]{"--verbose"}, false);
        assertArrayEquals(new String[]{"--verbose"}, result);
    }

    @Test
    public void testLongOptionWithEquals() {
        // branch: token.startsWith("--") == true, indexOf('=') != -1 -> split
        String[] result = parser.flatten(options, new String[]{"--foo=bar"}, false);
        assertArrayEquals(new String[]{"--foo", "bar"}, result);
    }

    @Test
    public void testDoubleHyphenAlone() {
        // boundary: token == "--" พอดี (ไม่มี '=') ต้องเข้า branch startsWith("--") ไม่ใช่ "-".equals()
        String[] result = parser.flatten(options, new String[]{"--"}, false);
        assertArrayEquals(new String[]{"--"}, result);
    }

    // ---------- 2. Single hyphen "-" ----------

    @Test
    public void testSingleHyphen() {
        // branch: "-".equals(token) == true
        String[] result = parser.flatten(options, new String[]{"-"}, false);
        assertArrayEquals(new String[]{"-"}, result);
    }

    // ---------- 3. Two-character option (processOptionToken) ----------

    @Test
    public void testShortOptionValid() {
        // branch: token.length()==2, options.hasOption(token)==true -> set currentOption, add token
        options.addOption("b", true, "b option");
        String[] result = parser.flatten(options, new String[]{"-b"}, false);
        assertArrayEquals(new String[]{"-b"}, result);
    }

    @Test
    public void testShortOptionInvalidStopFalse() {
        // branch: hasOption==false, stopAtNonOption==false -> ไม่ทำอะไร (token ไม่ถูกเก็บ)
        String[] result = parser.flatten(options, new String[]{"-z"}, false);
        assertArrayEquals(new String[]{}, result);
    }

    @Test
    public void testShortOptionInvalidStopTrue() {
        // branch: hasOption==false, stopAtNonOption==true -> eatTheRest=true, add token, gobble ที่เหลือ
        String[] result = parser.flatten(options, new String[]{"-z", "extra1", "extra2"}, true);
        assertArrayEquals(new String[]{"-z", "extra1", "extra2"}, result);
    }

    // ---------- 4. Length > 2 และ options.hasOption(token) ตรงทั้ง token ----------

    @Test
    public void testLongerRegisteredOption() {
        // branch: token.length()>2 และ options.hasOption(token)==true -> ไม่ burst, add ตรง
        options.addOption("foo", false, "foo option");
        String[] result = parser.flatten(options, new String[]{"-foo"}, false);
        assertArrayEquals(new String[]{"-foo"}, result);
    }

    // ---------- 5. burstToken branches ----------

    @Test
    public void testBurstTokenWithArgRemainder() {
        // branch: hasOption(ch)==true, currentOption.hasArg()==true และมี remainder -> add substring แล้ว break
        options.addOption("b", true, "b option");
        String[] result = parser.flatten(options, new String[]{"-bc"}, false);
        assertArrayEquals(new String[]{"-b", "c"}, result);
    }

    @Test
    public void testBurstTokenAllValidNoArg() {
        // branch: hasOption(ch)==true, hasArg()==false -> loop ต่อไปจนจบโดยไม่ break
        options.addOption("a", false, "a option");
        options.addOption("b", false, "b option");
        String[] result = parser.flatten(options, new String[]{"-ab"}, false);
        assertArrayEquals(new String[]{"-a", "-b"}, result);
    }

    @Test
    public void testBurstTokenInvalidCharStopTrue() {
        // branch: hasOption(ch)==false, stopAtNonOption==true -> process(substring) แล้ว break
        // เนื่องจาก currentOption ('a') hasArg()==false -> process() ตก else branch (eatTheRest, add "--", value)
        options.addOption("a", false, "a option, no arg");
        String[] result = parser.flatten(options, new String[]{"-ax"}, true);
        assertArrayEquals(new String[]{"-a", "--", "x"}, result);
    }

    @Test
    public void testBurstTokenInvalidCharStopFalse() {
        // branch: hasOption(ch)==false, stopAtNonOption==false -> add token เดิมทั้งตัว แล้ว break
        options.addOption("a", false, "a option, no arg");
        String[] result = parser.flatten(options, new String[]{"-ay"}, false);
        assertArrayEquals(new String[]{"-a", "-ay"}, result);
    }

    @Test
    public void testBurstTokenNoOptionsRegisteredStopFalse() {
        // boundary: options ว่างเปล่าทั้งหมด, char แรกก็ไม่ตรง option -> add token เดิม ทันทีที่ i=1
        String[] result = parser.flatten(options, new String[]{"-xyz"}, false);
        assertArrayEquals(new String[]{"-xyz"}, result);
    }

    // ---------- 6. Non-option token กับ stopAtNonOption ----------

    @Test
    public void testNonOptionTokenStopFalse() {
        // branch: stopAtNonOption==false -> tokens.add(token) ตรง ๆ
        String[] result = parser.flatten(options, new String[]{"value"}, false);
        assertArrayEquals(new String[]{"value"}, result);
    }

    @Test
    public void testNonOptionTokenStopTrueNoCurrentOption() {
        // branch: stopAtNonOption==true -> process(value); currentOption==null -> else branch (eatTheRest,"--",value)
        String[] result = parser.flatten(options, new String[]{"value"}, true);
        assertArrayEquals(new String[]{"--", "value"}, result);
    }

    @Test
    public void testNonOptionTokenStopTrueWithCurrentOptionHasArg() {
        // branch: currentOption!=null && hasArg()==true -> add value, currentOption=null
        // จากนั้น token ถัดไปไม่มี currentOption แล้ว -> ตก else (eatTheRest)
        // หมายเหตุ: branch "else if (currentOption.hasArgs())" ใน process() เป็น dead code
        // เพราะ if ชั้นนอกเช็ค hasArg() ไปแล้ว จึงไม่มีทางเข้าถึง branch นี้ได้จริงในซอร์สนี้
        options.addOption("b", true, "b option");
        String[] result = parser.flatten(options, new String[]{"-b", "value", "extra"}, true);
        assertArrayEquals(new String[]{"-b", "value", "--", "extra"}, result);
    }

    // ---------- 7. Boundary / Null / Empty ----------

    @Test
    public void testEmptyArguments() {
        // boundary: array ว่าง -> while loop ไม่รันเลย
        String[] result = parser.flatten(options, new String[]{}, false);
        assertArrayEquals(new String[]{}, result);
    }

    @Test
    public void testEmptyStringToken() {
        // boundary: token เป็น "" -> ไม่เข้า branch ใด ๆ ก่อนหน้า, stopAtNonOption==false -> add ตรง
        String[] result = parser.flatten(options, new String[]{""}, false);
        assertArrayEquals(new String[]{""}, result);
    }

    @Test(expected = NullPointerException.class)
    public void testNullArguments() {
        // fault-detection: Arrays.asList(null) ต้องโยน NPE
        parser.flatten(options, null, false);
    }

    @Test(expected = NullPointerException.class)
    public void testNullOptions() {
        // fault-detection: options==null แล้วเข้า processOptionToken -> options.hasOption() โยน NPE
        parser.flatten(null, new String[]{"-x"}, false);
    }

    // ---------- 8. Mixed scenario (integration-style, ครอบคลุมหลาย branch ต่อเนื่อง) ----------

    @Test
    public void testMultipleTokensMixed() {
        String[] result = parser.flatten(options,
                new String[]{"--alpha", "--beta=gamma", "-", "plain"}, false);
        assertArrayEquals(new String[]{"--alpha", "--beta", "gamma", "-", "plain"}, result);
    }
}
```

---

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testLongOptionWithoutEquals` | `startsWith("--")`==true, ไม่มี `=` |
| `testLongOptionWithEquals` | `startsWith("--")`==true, มี `=` → split |
| `testDoubleHyphenAlone` | token=="--" พอดี เข้า branch `--` (ไม่ใช่ `"-".equals`) |
| `testSingleHyphen` | `"-".equals(token)`==true |
| `testShortOptionValid` | length==2, `hasOption`==true (processOptionToken) |
| `testShortOptionInvalidStopFalse` | length==2, `hasOption`==false, `stopAtNonOption`==false |
| `testShortOptionInvalidStopTrue` | length==2, `hasOption`==false, `stopAtNonOption`==true + `gobble` |
| `testLongerRegisteredOption` | length>2, `options.hasOption(token)`==true (ไม่ burst) |
| `testBurstTokenWithArgRemainder` | burstToken: `hasOption`==true, `hasArg`==true + remainder → break |
| `testBurstTokenAllValidNoArg` | burstToken: `hasOption`==true, `hasArg`==false → loop ต่อจนจบ |
| `testBurstTokenInvalidCharStopTrue` | burstToken: `hasOption`==false, `stopAtNonOption`==true → `process()` else branch |
| `testBurstTokenInvalidCharStopFalse` | burstToken: `hasOption`==false, `stopAtNonOption`==false → add token เดิม |
| `testBurstTokenNoOptionsRegisteredStopFalse` | burstToken boundary: options ว่าง, char แรกไม่ตรง |
| `testNonOptionTokenStopFalse` | `stopAtNonOption`==false → add token ตรง |
| `testNonOptionTokenStopTrueNoCurrentOption` | `stopAtNonOption`==true, `process()`: currentOption==null → else branch |
| `testNonOptionTokenStopTrueWithCurrentOptionHasArg` | `process()`: currentOption!=null && hasArg()==true; หมายเหตุ dead-code branch `hasArgs()` |
| `testEmptyArguments` | boundary: while loop ไม่รัน (array ว่าง) |
| `testEmptyStringToken` | boundary: token=="" → ตก branch สุดท้าย (else tokens.add) |
| `testNullArguments` | null-input: NPE จาก `Arrays.asList(null)` |
| `testNullOptions` | null-input: NPE จาก `options.hasOption()` เมื่อ options==null |
| `testMultipleTokensMixed` | Integration: หลาย branch ทำงานต่อเนื่องในลูปเดียว |

**หมายเหตุสำคัญ:** branch `else if (currentOption.hasArgs())` ใน method `process()` เป็น **unreachable/dead code** เนื่องจาก if-ชั้นนอกตรวจสอบ `currentOption.hasArg()` ไปแล้ว หากเป็น `false` จะกระโดดไป `else` (eatTheRest) ทันที ไม่มีทางที่โค้ดจะไหลเข้า branch นี้ได้จากซอร์สที่ให้มา จึงไม่มีเทสเคสใดครอบคลุม branch นี้ได้จริง (ระบุเป็นข้อจำกัดของโค้ด ไม่ใช่ของชุดทดสอบ)
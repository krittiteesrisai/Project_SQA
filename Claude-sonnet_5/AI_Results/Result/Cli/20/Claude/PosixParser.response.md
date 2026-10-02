# วิเคราะห์และแผนการทดสอบ

จากการอ่านซอร์สโค้ด `PosixParser` พบ branch/condition หลักที่ต้องครอบคลุมดังนี้:

- `flatten()`: เงื่อนไข `--`, `--x=y`, `-` เดี่ยว, `-x` (length==2), multi-char option ที่รู้จัก, multi-char ที่ต้อง burst, `stopAtNonOption` true/false, default else
- `processOptionToken()`: hasOption true / false+stopAtNonOption true / false+stopAtNonOption false
- `burstToken()`: match+hasArg+มีเศษ, match+hasArg+ไม่มีเศษ, match+!hasArg, ไม่match+stopAtNonOption true, ไม่match+stopAtNonOption false
- `process()`: currentOption!=null&&hasArg true (ทาง if) / else (ทาง "--")  
  ⚠️ **หมายเหตุ**: บรานช์ `else if (currentOption.hasArgs())` เป็น dead code เพราะเงื่อนไขนอก (`currentOption.hasArg()`) กับเงื่อนไขในซ้ำกัน ถ้านอกเป็น true จะเข้า if ในเสมอ ไม่มีทางเข้า else-if นี้ได้จริง จึงไม่สามารถเขียนเทสให้ครอบคลุมบรานช์นี้ได้ (ไม่เดา behavior)
- `gobble()`: eatTheRest true/false
- boundary: array ว่าง, null arguments, null options, empty string token

หมายเหตุ: `flatten` เป็น `protected` จึงวาง TestClass ไว้ package เดียวกัน (`org.apache.commons.cli`) เพื่อเรียกได้โดยตรง

```java
package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * JUnit4 tests for {@link PosixParser}.
 * Placed in the same package to access the protected flatten() method.
 */
public class PosixParserTest
{
    private PosixParser parser;
    private Options options;

    @Before
    public void setUp()
    {
        parser = new PosixParser();
        options = new Options();
    }

    // ---------- long option "--" handling ----------

    @Test
    public void testLongOptionWithoutEquals()
    {
        String[] args = {"--foo"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"--foo"}, result);
    }

    @Test
    public void testLongOptionWithEquals()
    {
        String[] args = {"--foo=bar"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"--foo", "bar"}, result);
    }

    @Test
    public void testLongOptionWithMultipleEquals()
    {
        // indexOf('=') finds only the FIRST '=' -> ensure substring logic is correct
        String[] args = {"--foo=bar=baz"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"--foo", "bar=baz"}, result);
    }

    @Test
    public void testDoubleHyphenAloneToken()
    {
        // "--" itself: startsWith("--") true, indexOf('=') == -1 -> added as-is
        String[] args = {"--"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"--"}, result);
    }

    // ---------- single hyphen "-" ----------

    @Test
    public void testSingleHyphen()
    {
        String[] args = {"-"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"-"}, result);
    }

    // ---------- short option length == 2 -> processOptionToken ----------

    @Test
    public void testShortOptionKnown()
    {
        options.addOption("a", false, "a desc");
        String[] args = {"-a"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"-a"}, result);
    }

    @Test
    public void testShortOptionUnknownStopAtNonOptionTrue()
    {
        // unknown "-x" with stopAtNonOption=true -> eatTheRest=true -> gobble consumes remaining raw
        String[] args = {"-x", "extra1", "extra2"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] {"-x", "extra1", "extra2"}, result);
    }

    @Test
    public void testShortOptionUnknownStopAtNonOptionFalse()
    {
        // unknown "-x" with stopAtNonOption=false -> only token added, no eatTheRest
        String[] args = {"-x", "foo"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"-x", "foo"}, result);
    }

    // ---------- multi-char token that IS a registered option ----------

    @Test
    public void testMultiCharTokenKnownOption()
    {
        options.addOption("abc", false, "abc desc");
        String[] args = {"-abc"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"-abc"}, result);
    }

    // ---------- burstToken branches ----------

    @Test
    public void testBurstTokenHasArgWithRemainingChars()
    {
        options.addOption("b", true, "b desc"); // hasArg=true
        String[] args = {"-bvalue"};
        String[] result = parser.flatten(options, args, false);
        // i=1 'b' matched, hasArg true, remaining chars "value" -> substring added, break
        assertArrayEquals(new String[] {"-b", "value"}, result);
    }

    @Test
    public void testBurstTokenNoArgThenHasArgNoRemainingChars()
    {
        // First char matched but hasArg=false -> loop continues (no break)
        // Second char matched, hasArg=true, but is the LAST char -> no substring add
        options.addOption("a", false, "a desc");
        options.addOption("b", true, "b desc");
        String[] args = {"-ab"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"-a", "-b"}, result);
    }

    @Test
    public void testBurstTokenUnknownCharStopAtNonOptionTrue()
    {
        // 'x' unmatched, stopAtNonOption=true -> process(token.substring(i)); break
        String[] args = {"-xyz"};
        String[] result = parser.flatten(options, args, true);
        // process("xyz") with currentOption==null -> "--","xyz"
        assertArrayEquals(new String[] {"--", "xyz"}, result);
    }

    @Test
    public void testBurstTokenUnknownCharStopAtNonOptionFalse()
    {
        // 'x' unmatched, stopAtNonOption=false -> tokens.add(token) whole; break
        String[] args = {"-xyz"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"-xyz"}, result);
    }

    // ---------- process() via stopAtNonOption branch in flatten ----------

    @Test
    public void testProcessNonOptionNoCurrentOptionStopAtNonOptionTrue()
    {
        // token doesn't start with '-', stopAtNonOption=true, currentOption==null
        String[] args = {"foo"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] {"--", "foo"}, result);
    }

    @Test
    public void testProcessNonOptionWithCurrentOptionHasArg()
    {
        options.addOption("a", true, "a desc"); // hasArg=true
        String[] args = {"-a", "value"};
        String[] result = parser.flatten(options, args, true);
        // "-a" -> processOptionToken sets currentOption=a
        // "value" -> process(): currentOption!=null && hasArg()==true -> tokens.add("value"); currentOption=null
        assertArrayEquals(new String[] {"-a", "value"}, result);
    }

    @Test
    public void testBurstThenValueConsumedByProcess()
    {
        // Integration: currentOption set inside burstToken, then consumed by process()
        options.addOption("a", false, "a desc");
        options.addOption("b", true, "b desc");
        String[] args = {"-ab", "argValue"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] {"-a", "-b", "argValue"}, result);
    }

    // ---------- default else branch (plain token, stopAtNonOption=false) ----------

    @Test
    public void testPlainTokenStopAtNonOptionFalse()
    {
        String[] args = {"plain"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"plain"}, result);
    }

    @Test
    public void testEmptyStringToken()
    {
        // "" : ไม่เข้าเงื่อนไข "--", "-", startsWith("-") ใดๆ -> default else
        String[] args = {""};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {""}, result);
    }

    // ---------- boundary / null cases ----------

    @Test
    public void testEmptyArgumentsArray()
    {
        String[] args = {};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {}, result);
    }

    @Test(expected = NullPointerException.class)
    public void testNullArgumentsThrowsNPE()
    {
        // Arrays.asList(null).iterator().hasNext() -> NPE ที่ size()
        parser.flatten(options, null, false);
    }

    @Test(expected = NullPointerException.class)
    public void testNullOptionsThrowsNPE()
    {
        // "-a" length==2 -> processOptionToken เรียก options.hasOption() บน null -> NPE
        String[] args = {"-a"};
        parser.flatten(null, args, false);
    }
}
```

## สรุปตาราง Test Method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testLongOptionWithoutEquals | `startsWith("--")` & `indexOf('=')==-1` |
| testLongOptionWithEquals | `startsWith("--")` & `indexOf('=')!=-1` (basic split) |
| testLongOptionWithMultipleEquals | เดียวกันข้างบน แต่ตรวจ substring เมื่อมี `=` ซ้ำ (fault-detection) |
| testDoubleHyphenAloneToken | edge case token `"--"` เข้าทาง `startsWith("--")` + ไม่มี `=` |
| testSingleHyphen | `"-".equals(token)` |
| testShortOptionKnown | length==2 → `processOptionToken` → `hasOption==true` |
| testShortOptionUnknownStopAtNonOptionTrue | `hasOption==false` & `stopAtNonOption==true` → `eatTheRest=true` + `gobble()` true-branch |
| testShortOptionUnknownStopAtNonOptionFalse | `hasOption==false` & `stopAtNonOption==false`, `gobble()` false-branch, default else สำหรับ token ถัดไป |
| testMultiCharTokenKnownOption | length!=2 & `options.hasOption(token)==true` |
| testBurstTokenHasArgWithRemainingChars | burstToken: match+`hasArg()`+เศษเหลือ → add substring, break |
| testBurstTokenNoArgThenHasArgNoRemainingChars | burstToken: match+`!hasArg()` (continue) ตามด้วย match+`hasArg()`+ไม่มีเศษ (continue ไม่ break) |
| testBurstTokenUnknownCharStopAtNonOptionTrue | burstToken: ไม่ match & `stopAtNonOption==true` → `process()` else-branch |
| testBurstTokenUnknownCharStopAtNonOptionFalse | burstToken: ไม่ match & `stopAtNonOption==false` → add token ทั้งก้อน |
| testProcessNonOptionNoCurrentOptionStopAtNonOptionTrue | `process()`: `currentOption==null` → else-branch (`"--"`) |
| testProcessNonOptionWithCurrentOptionHasArg | `process()`: `currentOption!=null && hasArg()==true` → if-branch |
| testBurstThenValueConsumedByProcess | Integration burstToken + process() (fault-detection เชิงลึก) |
| testPlainTokenStopAtNonOptionFalse | default else ของ flatten (`stopAtNonOption==false`, token ไม่ใช่ option) |
| testEmptyStringToken | edge case token `""` เข้า default else |
| testEmptyArgumentsArray | boundary: loop 0 รอบ |
| testNullArgumentsThrowsNPE | null-input, NPE จาก `Arrays.asList(null)` |
| testNullOptionsThrowsNPE | null options, NPE จาก `options.hasOption()` |

**หมายเหตุสำคัญ**: branch `else if (currentOption.hasArgs())` ภายใน `process()` เป็น dead code ในซอร์สนี้ (เงื่อนไขนอกกับในซ้ำกันเป๊ะ) จึงไม่มี test ใดครอบคลุมบรานช์นี้โดยตรง — เป็นข้อจำกัดของโครงสร้างโค้ดเอง ไม่ใช่การมองข้ามของชุดทดสอบ
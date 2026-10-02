# JUnit 4 Test Suite สำหรับ `GnuParser`

## การวิเคราะห์ Branch/Condition ที่พบในซอร์สโค้ด

จากการวิเคราะห์ `flatten()` method พบ branch/condition หลักดังนี้:
- **B1**: `"--".equals(arg)` — true/false
- **B2**: `"-".equals(arg)` — true/false
- **B3**: `arg.startsWith("-")` — true/false
- **B4**: `options.hasOption(opt)` — true/false
- **B5**: `options.hasOption(arg.substring(0,2))` (nested else) — true/false
- **B6**: `eatTheRest = stopAtNonOption` — ค่าตาม parameter
- **B7**: `if (eatTheRest)` หลัง process แต่ละ token — true/false
- **B8**: inner `for` loop (กิน token ที่เหลือ) — 0 ครั้ง / หลายครั้ง
- **B9**: main `for` loop — 0 iteration (array ว่าง) / หลาย iteration

> **หมายเหตุ**: `Options.hasOption(String)` ไม่ได้แสดง source ในโจทย์ แต่จาก Javadoc ของ `flatten()` ที่ยกตัวอย่าง `-Dproperty=value` ชัดเจนว่า `hasOption` ต้อง normalize เครื่องหมาย `-` ก่อนเทียบ (ใช้ `Util.stripLeadingHyphens` ภายใน) — จึงอ้างอิง behavior นี้จาก spec ที่ให้มา ไม่ได้เดาเอง

```java
package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for {@link GnuParser#flatten(Options, String[], boolean)}.
 * ทดสอบครอบคลุมทุก branch ที่วิเคราะห์ได้จากซอร์สโค้ด (Cli-12b).
 */
public class GnuParserTest {

    private GnuParser parser;

    @Before
    public void setUp() {
        parser = new GnuParser();
    }

    // ---------- Boundary: empty array ----------
    @Test
    public void testEmptyArguments() {
        Options options = new Options();
        String[] args = new String[0];
        String[] result = parser.flatten(options, args, false);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    // ---------- "--" handling (B1 true) ----------
    @Test
    public void testDoubleHyphenStopsAndEatsRest() {
        Options options = new Options();
        String[] args = {"foo", "--", "-a", "bar"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"foo", "--", "-a", "bar"}, result);
    }

    @Test
    public void testDoubleHyphenAtEndNoRemaining() {
        // Boundary: eatTheRest ตั้งค่าแต่ inner loop ไม่มี element เหลือให้กิน (i+1 >= length)
        Options options = new Options();
        String[] args = {"foo", "--"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"foo", "--"}, result);
    }

    // ---------- "-" handling (B2 true) ----------
    @Test
    public void testSingleHyphenToken() {
        Options options = new Options();
        String[] args = {"-"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-"}, result);
    }

    // ---------- startsWith("-") + hasOption(opt) true (B3 true, B4 true) ----------
    @Test
    public void testExactOptionMatch() {
        Options options = new Options();
        options.addOption("a", false, "test option a");
        String[] args = {"-a"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a"}, result);
    }

    // ---------- hasOption(opt) false, hasOption(substring) true (B4 false, B5 true) ----------
    @Test
    public void testPropertyOptionSplit() {
        Options options = new Options();
        options.addOption("D", false, "property option");
        String[] args = {"-Dproperty=value"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-D", "property=value"}, result);
    }

    // ---------- hasOption(opt) false, hasOption(substring) false, stopAtNonOption=false (B4,B5 false, B6 false) ----------
    @Test
    public void testUnknownOptionNoStop() {
        Options options = new Options();
        String[] args = {"-x", "foo", "bar"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-x", "foo", "bar"}, result);
    }

    // ---------- stopAtNonOption=true -> eatTheRest true, กิน token ที่เหลือแบบ raw (B6 true, B7 true, B8 หลายครั้ง) ----------
    @Test
    public void testUnknownOptionStopsAndEatsRest() {
        Options options = new Options();
        String[] args = {"-x", "--", "-a", "plain"};
        String[] result = parser.flatten(options, args, true);
        // เมื่อ eatTheRest = true แล้ว ทุก token ถัดไปจะถูกเพิ่มแบบ raw
        // (ไม่ผ่าน logic ตรวจ "--" "-" หรือ hasOption ใด ๆ อีก)
        assertArrayEquals(new String[]{"-x", "--", "-a", "plain"}, result);
    }

    // ---------- final else: arg ไม่มี "-" นำหน้า ----------
    @Test
    public void testNonOptionArgument() {
        Options options = new Options();
        String[] args = {"plainArgument"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"plainArgument"}, result);
    }

    // ---------- Mixed known/unknown options, stopAtNonOption=false ----------
    @Test
    public void testMixedArgumentsWithKnownAndUnknownOptions() {
        Options options = new Options();
        options.addOption("a", false, "test option a");
        String[] args = {"-a", "-unknown", "value"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-unknown", "value"}, result);
    }

    // ---------- Boundary: arg length == 2 พอดี สำหรับ substring(0,2) ----------
    @Test
    public void testShortUnknownOptionTwoCharsNoMatch() {
        Options options = new Options();
        String[] args = {"-y"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-y"}, result);
    }

    // ---------- ยืนยันว่าเมื่อ eatTheRest=true แล้ว option ที่รู้จักก็ถูกเพิ่มแบบ raw ----------
    @Test
    public void testStopAtNonOptionWithKnownOptionAfterUnknown() {
        Options options = new Options();
        options.addOption("a", false, "test option a");
        String[] args = {"-b", "-a"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-b", "-a"}, result);
    }

    // ---------- "--foo" (double-hyphen แต่ไม่ใช่ "--" พอดี) -> B1 false, B3 true ----------
    @Test
    public void testLongOptionUnknownNoStop() {
        Options options = new Options();
        String[] args = {"--foo", "bar"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--foo", "bar"}, result);
    }

    // ---------- Multiple options registered + property split ในชุดเดียว ----------
    @Test
    public void testCombinationExactAndPropertySplit() {
        Options options = new Options();
        options.addOption("a", false, "test option a");
        options.addOption("D", false, "property option");
        String[] args = {"-a", "-Dfoo=bar", "value"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-D", "foo=bar", "value"}, result);
    }
}
```

## สรุปการครอบคลุม Branch/Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testEmptyArguments` | B9: main loop 0 iteration, boundary array ว่าง |
| `testDoubleHyphenStopsAndEatsRest` | B1=true, B7=true, B8 กินหลาย token |
| `testDoubleHyphenAtEndNoRemaining` | B1=true, B7=true, B8=0 iteration (boundary ท้าย array) |
| `testSingleHyphenToken` | B2=true, B7=false |
| `testExactOptionMatch` | B3=true, B4=true, B7=false |
| `testPropertyOptionSplit` | B3=true, B4=false, B5=true, B7=false |
| `testUnknownOptionNoStop` | B3=true, B4=false, B5=false, B6=false(B7=false), final-else (non-hyphen args) |
| `testUnknownOptionStopsAndEatsRest` | B3=true, B4=false, B5=false, B6=true(B7=true), B8 กินหลาย token แบบ raw (รวม `--`) |
| `testNonOptionArgument` | final else branch (arg ไม่มี `-` นำหน้า) |
| `testMixedArgumentsWithKnownAndUnknownOptions` | รวม B4=true และ B4/B5=false ในชุดเดียว, B6=false |
| `testShortUnknownOptionTwoCharsNoMatch` | Boundary: `arg.length()==2` พอดีสำหรับ `substring(0,2)`, B4=false, B5=false |
| `testStopAtNonOptionWithKnownOptionAfterUnknown` | ยืนยัน semantic: หลัง eatTheRest=true, token ที่ควรจะ match option ก็ไม่ถูกประมวลผล (B7=true bypass ทุก branch) |
| `testLongOptionUnknownNoStop` | B1=false (ไม่ตรง `"--"` เป๊ะ), B3=true, กรณี double-hyphen argument |
| `testCombinationExactAndPropertySplit` | รวม B4=true และ B4=false/B5=true ในชุดเดียว, ตรวจ order ของผลลัพธ์ |

**หมายเหตุเพิ่มเติม**: ไม่ได้ทดสอบกรณี `arg.length() < 2` ขณะ `arg.startsWith("-")` เป็น true เพราะจากการไล่ logic พบว่ากรณีนี้เป็นไปไม่ได้ในซอร์สที่ให้มา (มีเพียง `"-"` เท่านั้นที่ length=1 และ startsWith("-") true แต่ถูก branch `"-".equals(arg)` ดักไปก่อนแล้ว) — จึงไม่ทดสอบ behavior ที่ไม่มีทางเกิดขึ้นจริงตามข้อกำหนดที่ 4
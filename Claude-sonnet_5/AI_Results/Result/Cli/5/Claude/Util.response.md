# UtilTest.java — JUnit 4 Test Suite สำหรับคลาส `Util` (Defects4J: Cli-5b)

**หมายเหตุสำคัญ:** เนื่องจากคลาส `Util` และเมธอด `stripLeadingHyphens`/`stripLeadingAndTrailingQuotes` เป็น **package-private (default access)** จึงต้องวาง test class ไว้ใน package เดียวกันคือ `org.apache.commons.cli` เพื่อให้เรียกใช้ได้โดยไม่ต้องใช้ reflection

```java
package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for {@link Util}.
 * ครอบคลุม branch/condition ทุกเส้นทางที่วิเคราะห์ได้จาก source code
 */
public class UtilTest
{
    // =========================================================
    // ทดสอบ stripLeadingHyphens(String)
    // =========================================================

    /**
     * Branch: str.startsWith("--") == true
     * เคสปกติ: "--foo" -> ตัด "--" ออก เหลือ "foo"
     */
    @Test
    public void testStripLeadingHyphens_DoubleHyphenPrefix()
    {
        assertEquals("foo", Util.stripLeadingHyphens("--foo"));
    }

    /**
     * Branch: str.startsWith("--") == true, boundary case
     * "--" เท่ากับ string ที่มีแค่ hyphen สองตัว -> เหลือ ""
     */
    @Test
    public void testStripLeadingHyphens_ExactlyDoubleHyphen()
    {
        assertEquals("", Util.stripLeadingHyphens("--"));
    }

    /**
     * Branch: str.startsWith("--") == false, str.startsWith("-") == true
     * เคสปกติ: "-foo" -> ตัด "-" ออก เหลือ "foo"
     */
    @Test
    public void testStripLeadingHyphens_SingleHyphenPrefix()
    {
        assertEquals("foo", Util.stripLeadingHyphens("-foo"));
    }

    /**
     * Branch: str.startsWith("-") == true, boundary case
     * "-" เท่ากับ string ที่มี hyphen ตัวเดียว -> เหลือ ""
     */
    @Test
    public void testStripLeadingHyphens_ExactlySingleHyphen()
    {
        assertEquals("", Util.stripLeadingHyphens("-"));
    }

    /**
     * Branch: ทั้ง startsWith("--") และ startsWith("-") เป็น false
     * -> return str เดิม (ไม่มี hyphen)
     */
    @Test
    public void testStripLeadingHyphens_NoHyphen()
    {
        assertEquals("foo", Util.stripLeadingHyphens("foo"));
    }

    /**
     * Branch: ทั้งสองเงื่อนไข false, boundary case empty string
     */
    @Test
    public void testStripLeadingHyphens_EmptyString()
    {
        assertEquals("", Util.stripLeadingHyphens(""));
    }

    /**
     * Fault-detection case: "---foo" มี hyphen 3 ตัว
     * startsWith("--") = true -> substring(2) จะเหลือ "-foo"
     * (ทดสอบพฤติกรรมจริงของโค้ด ไม่ใช่ค่าที่ "ถูกต้องตามหลักภาษา CLI"
     *  แต่เป็นพฤติกรรมจริงตาม source ที่ให้มา)
     */
    @Test
    public void testStripLeadingHyphens_TripleHyphen()
    {
        assertEquals("-foo", Util.stripLeadingHyphens("---foo"));
    }

    /**
     * ค่า null: source ไม่มีการเช็ค null จึงคาดว่าจะเกิด NullPointerException
     * (ไม่ได้เดา behavior ใหม่ แต่เป็นผลลัพธ์ตรงจาก str.startsWith() บน null)
     */
    @Test(expected = NullPointerException.class)
    public void testStripLeadingHyphens_NullInput()
    {
        Util.stripLeadingHyphens(null);
    }

    // =========================================================
    // ทดสอบ stripLeadingAndTrailingQuotes(String)
    // =========================================================

    /**
     * Branch: startsWith("\"") = true, endsWith("\"") = true
     * เคสปกติตาม Javadoc: '"one two"' -> 'one two'
     */
    @Test
    public void testStripQuotes_LeadingAndTrailing()
    {
        assertEquals("one two", Util.stripLeadingAndTrailingQuotes("\"one two\""));
    }

    /**
     * Branch: startsWith("\"") = true, endsWith("\"") = false
     * '"one two' -> 'one two'
     */
    @Test
    public void testStripQuotes_LeadingOnly()
    {
        assertEquals("one two", Util.stripLeadingAndTrailingQuotes("\"one two"));
    }

    /**
     * Branch: startsWith("\"") = false, endsWith("\"") = true
     * 'one two"' -> 'one two'
     */
    @Test
    public void testStripQuotes_TrailingOnly()
    {
        assertEquals("one two", Util.stripLeadingAndTrailingQuotes("one two\""));
    }

    /**
     * Branch: startsWith("\"") = false, endsWith("\"") = false
     * ไม่มี quote เลย -> คืนค่าเดิม
     */
    @Test
    public void testStripQuotes_NoQuotes()
    {
        assertEquals("one two", Util.stripLeadingAndTrailingQuotes("one two"));
    }

    /**
     * Boundary: empty string -> ไม่ startsWith/endsWith ด้วย quote -> return ""
     */
    @Test
    public void testStripQuotes_EmptyString()
    {
        assertEquals("", Util.stripLeadingAndTrailingQuotes(""));
    }

    /**
     * Boundary: string ที่มี quote ตัวเดียว "\""
     * startsWith("\"") = true -> substring(1,1) = ""
     * จากนั้น endsWith("\"") บน "" -> false
     * ผลลัพธ์ที่คาดหวังตาม logic จริงของ source: ""
     */
    @Test
    public void testStripQuotes_SingleQuoteChar()
    {
        assertEquals("", Util.stripLeadingAndTrailingQuotes("\""));
    }

    /**
     * Boundary: string ที่มี quote สองตัวติดกัน "\"\""
     * startsWith true -> substring(1,2) = "\""
     * endsWith("\"") บนผลลัพธ์ = true -> substring(0,0) = ""
     */
    @Test
    public void testStripQuotes_DoubleQuoteChars()
    {
        assertEquals("", Util.stripLeadingAndTrailingQuotes("\"\""));
    }

    /**
     * ค่า null: source ไม่มีการเช็ค null จึงคาดว่าจะเกิด NullPointerException
     */
    @Test(expected = NullPointerException.class)
    public void testStripQuotes_NullInput()
    {
        Util.stripLeadingAndTrailingQuotes(null);
    }
}
```

---

## สรุปตาราง Branch/Condition Coverage

| Test Method | เมธอดที่ทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|---|
| `testStripLeadingHyphens_DoubleHyphenPrefix` | `stripLeadingHyphens` | `startsWith("--")` = true |
| `testStripLeadingHyphens_ExactlyDoubleHyphen` | `stripLeadingHyphens` | `startsWith("--")` = true, boundary (substring ได้ผลลัพธ์ว่าง) |
| `testStripLeadingHyphens_SingleHyphenPrefix` | `stripLeadingHyphens` | `startsWith("--")` = false, `startsWith("-")` = true |
| `testStripLeadingHyphens_ExactlySingleHyphen` | `stripLeadingHyphens` | `startsWith("-")` = true, boundary (substring ได้ผลลัพธ์ว่าง) |
| `testStripLeadingHyphens_NoHyphen` | `stripLeadingHyphens` | ทั้งสองเงื่อนไข false → return str เดิม |
| `testStripLeadingHyphens_EmptyString` | `stripLeadingHyphens` | ทั้งสองเงื่อนไข false, boundary empty string |
| `testStripLeadingHyphens_TripleHyphen` | `stripLeadingHyphens` | `startsWith("--")` = true, fault-detection edge case |
| `testStripLeadingHyphens_NullInput` | `stripLeadingHyphens` | null input → NPE (ไม่มีการป้องกันใน source) |
| `testStripQuotes_LeadingAndTrailing` | `stripLeadingAndTrailingQuotes` | `startsWith("\"")`=true, `endsWith("\"")`=true |
| `testStripQuotes_LeadingOnly` | `stripLeadingAndTrailingQuotes` | `startsWith("\"")`=true, `endsWith("\"")`=false |
| `testStripQuotes_TrailingOnly` | `stripLeadingAndTrailingQuotes` | `startsWith("\"")`=false, `endsWith("\"")`=true |
| `testStripQuotes_NoQuotes` | `stripLeadingAndTrailingQuotes` | `startsWith("\"")`=false, `endsWith("\"")`=false |
| `testStripQuotes_EmptyString` | `stripLeadingAndTrailingQuotes` | boundary: empty string, ทั้งสองเงื่อนไข false |
| `testStripQuotes_SingleQuoteChar` | `stripLeadingAndTrailingQuotes` | boundary: quote ตัวเดียว, ทดสอบ interaction ระหว่าง if แรกกับ endsWith หลัง mutate str |
| `testStripQuotes_DoubleQuoteChars` | `stripLeadingAndTrailingQuotes` | boundary: quote สองตัว, both conditions true พร้อม mutate string ระหว่างสอง if |
| `testStripQuotes_NullInput` | `stripLeadingAndTrailingQuotes` | null input → NPE (ไม่มีการป้องกันใน source) |

**หมายเหตุเพิ่มเติม:**
- ทดสอบ `testStripLeadingHyphens_TripleHyphen` ถูกออกแบบมาเพื่อดักจับพฤติกรรมจริงของโค้ด (ตัดแค่ 2 hyphen แรกเสมอเมื่อ `startsWith("--")`) ซึ่งอาจไม่ตรงกับความคาดหวังของผู้ใช้ทั่วไป แต่เป็นพฤติกรรมที่ตรงตาม source code ที่ให้มา
- ทุก branch หลักทั้งใน `stripLeadingHyphens` (3 branches) และ `stripLeadingAndTrailingQuotes` (2 independent if ทำให้มี 4 combinations) ถูกครอบคลุมครบถ้วน
- การทดสอบ null ไม่ได้เป็นการ "เดา" behavior ใหม่ แต่เป็นผลลัพธ์ตรงไปตรงมาจากการเรียก `String.startsWith()`/`endsWith()` บน null reference ซึ่งจะเกิด `NullPointerException` ตาม Java semantics
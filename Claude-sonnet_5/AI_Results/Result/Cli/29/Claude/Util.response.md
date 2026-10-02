# UtilTest.java

```java
package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * JUnit4 test suite for org.apache.commons.cli.Util
 * ครอบคลุมทั้งเมธอด stripLeadingHyphens และ stripLeadingAndTrailingQuotes
 *
 * หมายเหตุ: Util เป็น package-private class จึงต้องอยู่ package เดียวกัน
 * (org.apache.commons.cli) เพื่อให้เข้าถึงเมธอด static ที่เป็น package-private ได้
 */
public class UtilTest
{
    // =========================================================
    // stripLeadingHyphens
    // =========================================================

    /**
     * Branch: str == null -> return null
     */
    @Test
    public void testStripLeadingHyphens_NullInput()
    {
        assertNull(Util.stripLeadingHyphens(null));
    }

    /**
     * Branch: str.startsWith("--") -> substring(2, length)
     * กรณีปกติ มีคำหลัง "--"
     */
    @Test
    public void testStripLeadingHyphens_DoubleHyphenPrefix()
    {
        assertEquals("foo", Util.stripLeadingHyphens("--foo"));
    }

    /**
     * Boundary: str เป็น "--" พอดี (substring(2,2) = "")
     */
    @Test
    public void testStripLeadingHyphens_ExactlyDoubleHyphen()
    {
        assertEquals("", Util.stripLeadingHyphens("--"));
    }

    /**
     * Branch: else if str.startsWith("-") -> substring(1, length)
     */
    @Test
    public void testStripLeadingHyphens_SingleHyphenPrefix()
    {
        assertEquals("foo", Util.stripLeadingHyphens("-foo"));
    }

    /**
     * Boundary: str เป็น "-" พอดี (substring(1,1) = "")
     */
    @Test
    public void testStripLeadingHyphens_ExactlySingleHyphen()
    {
        assertEquals("", Util.stripLeadingHyphens("-"));
    }

    /**
     * Branch: return str (ไม่มี hyphen นำหน้าเลย)
     */
    @Test
    public void testStripLeadingHyphens_NoHyphenPrefix()
    {
        assertEquals("foo", Util.stripLeadingHyphens("foo"));
    }

    /**
     * Boundary: empty string -> ไม่ตรงเงื่อนไข "--" หรือ "-" -> return "" (ตัวเดิม)
     */
    @Test
    public void testStripLeadingHyphens_EmptyString()
    {
        assertEquals("", Util.stripLeadingHyphens(""));
    }

    /**
     * กรณี hyphen มากกว่า 2 ตัว ("---foo") -> ตัดแค่ 2 ตัวแรกเท่านั้น
     * (ทดสอบว่า logic ตัด "--" ไม่ตัดมากกว่าที่ควร)
     */
    @Test
    public void testStripLeadingHyphens_TripleHyphen()
    {
        assertEquals("-foo", Util.stripLeadingHyphens("---foo"));
    }

    // =========================================================
    // stripLeadingAndTrailingQuotes
    // =========================================================

    /**
     * ซอร์สไม่มีการเช็ค null -> คาดว่าจะเกิด NullPointerException
     * (ระบุพฤติกรรมจริงของโค้ดตามที่ให้มา ไม่ได้เดา behavior ใหม่)
     */
    @Test(expected = NullPointerException.class)
    public void testStripLeadingAndTrailingQuotes_NullInput()
    {
        Util.stripLeadingAndTrailingQuotes(null);
    }

    /**
     * Branch: ไม่ startsWith("\"") และไม่ endsWith("\"") -> return str เดิม
     */
    @Test
    public void testStripLeadingAndTrailingQuotes_NoQuotes()
    {
        assertEquals("foo", Util.stripLeadingAndTrailingQuotes("foo"));
    }

    /**
     * Branch: startsWith("\"") = true, endsWith("\"") = false (เฉพาะหน้า)
     */
    @Test
    public void testStripLeadingAndTrailingQuotes_LeadingQuoteOnly()
    {
        assertEquals("foo", Util.stripLeadingAndTrailingQuotes("\"foo"));
    }

    /**
     * Branch: startsWith("\"") = false, endsWith("\"") = true (เฉพาะหลัง)
     */
    @Test
    public void testStripLeadingAndTrailingQuotes_TrailingQuoteOnly()
    {
        assertEquals("foo", Util.stripLeadingAndTrailingQuotes("foo\""));
    }

    /**
     * Branch: startsWith("\"") = true และ endsWith("\"") = true (ทั้งสองฝั่ง)
     */
    @Test
    public void testStripLeadingAndTrailingQuotes_BothQuotes()
    {
        assertEquals("foo", Util.stripLeadingAndTrailingQuotes("\"foo\""));
    }

    /**
     * Boundary: empty string -> ไม่เข้าเงื่อนไขใดเลย -> return "" ตัวเดิม
     */
    @Test
    public void testStripLeadingAndTrailingQuotes_EmptyString()
    {
        assertEquals("", Util.stripLeadingAndTrailingQuotes(""));
    }

    /**
     * Boundary case สำคัญ: str มีความยาว 1 ตัวอักษรและเป็น quote เดียว ("\"")
     * ตรวจสอบว่าไม่เกิด StringIndexOutOfBoundsException (fault-detection case
     * ที่เกี่ยวข้องกับ known bug CLI-162 ในเวอร์ชันอื่นของ method นี้)
     */
    @Test
    public void testStripLeadingAndTrailingQuotes_OnlyQuoteChar()
    {
        assertEquals("", Util.stripLeadingAndTrailingQuotes("\""));
    }

    /**
     * Boundary: string ที่เป็น quote สองตัวติดกัน ("\"\"") -> ควรได้ผลลัพธ์เป็น ""
     */
    @Test
    public void testStripLeadingAndTrailingQuotes_TwoQuoteChars()
    {
        assertEquals("", Util.stripLeadingAndTrailingQuotes("\"\""));
    }

    /**
     * กรณี quote อยู่ตรงกลาง ไม่ใช่ต้น/ปลาย -> ไม่ตรงเงื่อนไขใดเลย -> คืนค่าเดิม
     */
    @Test
    public void testStripLeadingAndTrailingQuotes_QuoteInMiddle()
    {
        assertEquals("a\"b", Util.stripLeadingAndTrailingQuotes("a\"b"));
    }

    /**
     * ทดสอบ input ที่มีเนื้อหาข้างในเป็นวลี (สอดคล้อง Javadoc ตัวอย่าง)
     */
    @Test
    public void testStripLeadingAndTrailingQuotes_PhraseExample()
    {
        assertEquals("one two", Util.stripLeadingAndTrailingQuotes("\"one two\""));
    }
}
```

## ตารางสรุปความครอบคลุม (Branch/Condition Coverage)

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testStripLeadingHyphens_NullInput` | `str == null` → return null |
| `testStripLeadingHyphens_DoubleHyphenPrefix` | `startsWith("--")` = true, มีเนื้อหาหลัง prefix |
| `testStripLeadingHyphens_ExactlyDoubleHyphen` | `startsWith("--")` = true, boundary length = 2 (substring ได้ "") |
| `testStripLeadingHyphens_SingleHyphenPrefix` | `startsWith("--")` = false, `startsWith("-")` = true, มีเนื้อหา |
| `testStripLeadingHyphens_ExactlySingleHyphen` | `startsWith("-")` = true, boundary length = 1 (substring ได้ "") |
| `testStripLeadingHyphens_NoHyphenPrefix` | ทั้งสอง `startsWith` เป็น false → return str เดิม |
| `testStripLeadingHyphens_EmptyString` | empty string, boundary ทั้งสอง `startsWith` false |
| `testStripLeadingHyphens_TripleHyphen` | ยืนยัน logic ตัดแค่ "--" 2 ตัวแรก ไม่ตัดเกิน |
| `testStripLeadingAndTrailingQuotes_NullInput` | ไม่มี null-check ในซอร์ส → คาด NPE (ระบุ fault potential) |
| `testStripLeadingAndTrailingQuotes_NoQuotes` | ทั้งสอง if (`startsWith`, `endsWith`) เป็น false |
| `testStripLeadingAndTrailingQuotes_LeadingQuoteOnly` | if แรกจริง, if สอง (`endsWith`) เท็จ |
| `testStripLeadingAndTrailingQuotes_TrailingQuoteOnly` | if แรกเท็จ, if สองจริง |
| `testStripLeadingAndTrailingQuotes_BothQuotes` | if แรกจริง และ if สองจริง (ทั้งสองสาขา) |
| `testStripLeadingAndTrailingQuotes_EmptyString` | boundary empty string, ทั้งสอง if เท็จ |
| `testStripLeadingAndTrailingQuotes_OnlyQuoteChar` | boundary length=1 หลังตัด leading quote (`length=0`), ทดสอบไม่เกิด StringIndexOutOfBoundsException |
| `testStripLeadingAndTrailingQuotes_TwoQuoteChars` | boundary length=2 → ตัดทั้งสองข้างได้ "" |
| `testStripLeadingAndTrailingQuotes_QuoteInMiddle` | quote ไม่อยู่ต้น/ปลาย → ทั้งสอง if เท็จ, กรณี malformed input |
| `testStripLeadingAndTrailingQuotes_PhraseExample` | ตรวจสอบตัวอย่างจาก Javadoc (ทั้งสอง if จริง กับข้อมูลจริง) |

**หมายเหตุสำคัญ:** `stripLeadingAndTrailingQuotes` ไม่มีการตรวจสอบ `null` ในซอร์สโค้ดที่ให้มา ดังนั้น testcase `testStripLeadingAndTrailingQuotes_NullInput` เป็นการยืนยันพฤติกรรมจริง (NPE) ไม่ใช่การเดา behavior ใหม่ — หากต้องการพฤติกรรมอื่น (เช่น return null) จะต้องแก้ไขซอร์สโค้ดต้นทาง
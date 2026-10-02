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

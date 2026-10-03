package org.apache.commons.cli;

import junit.framework.TestCase;

/**
 * Test suite for {@link Util} covering all branches, boundary limits,
 * and edge cases (including Defects4J Cli-5 fault).
 * 
 * Compatible with JUnit 3.8.1 in classpath and runnable via JUnit 4 runner.
 */
public class UtilTest extends TestCase {

    /**
     * ทดสอบกรณี Constructor ของ Util เพื่อให้ครอบคลุม Class Code Coverage 100%
     */
    public void testConstructor() {
        Util util = new Util();
        assertNotNull(util);
    }

    // =========================================================================
    // Tests for stripLeadingHyphens(String str)
    // =========================================================================

    /**
     * ดักจับ Fault ใน Defects4J Cli-5:
     * เมื่อส่ง null เข้าไป เมธอดควรคืนค่า null ไม่ควรโยน NullPointerException
     */
    public void testStripLeadingHyphensNull() {
        assertNull("Passing null should return null safely without throwing NPE",
                Util.stripLeadingHyphens(null));
    }

    /**
     * ทดสอบสตริงว่าง (Empty String Boundary)
     */
    public void testStripLeadingHyphensEmpty() {
        assertEquals("", Util.stripLeadingHyphens(""));
    }

    /**
     * ทดสอบสตริงปกติที่ไม่มี Hyphen นำหน้า (Fallthrough branch)
     */
    public void testStripLeadingHyphensNoHyphen() {
        assertEquals("foo", Util.stripLeadingHyphens("foo"));
        assertEquals("foo-bar", Util.stripLeadingHyphens("foo-bar"));
    }

    /**
     * ทดสอบ Branch: str.startsWith("-") == true
     */
    public void testStripLeadingHyphensSingleHyphen() {
        assertEquals("f", Util.stripLeadingHyphens("-f"));
        assertEquals("foo", Util.stripLeadingHyphens("-foo"));
        assertEquals("foo-bar", Util.stripLeadingHyphens("-foo-bar"));
    }

    /**
     * ทดสอบ Boundary: สตริงที่มี Hyphen เดี่ยวเพียงตัวเดียว "-"
     */
    public void testStripLeadingHyphensSingleHyphenOnly() {
        assertEquals("", Util.stripLeadingHyphens("-"));
    }

    /**
     * ทดสอบ Branch: str.startsWith("--") == true
     */
    public void testStripLeadingHyphensDoubleHyphen() {
        assertEquals("foo", Util.stripLeadingHyphens("--foo"));
        assertEquals("foo-bar", Util.stripLeadingHyphens("--foo-bar"));
    }

    /**
     * ทดสอบ Boundary: สตริงที่มี Double Hyphen เท่านั้น "--"
     */
    public void testStripLeadingHyphensDoubleHyphenOnly() {
        assertEquals("", Util.stripLeadingHyphens("--"));
    }

    /**
     * ทดสอบ Boundary: สตริงที่มี Hyphen มากกว่า 2 ตัว ("---foo")
     * ตรวจสอบว่าตัดออกเพียง 2 ตัวแรกตาม if (str.startsWith("--"))
     */
    public void testStripLeadingHyphensTripleHyphen() {
        assertEquals("-foo", Util.stripLeadingHyphens("---foo"));
        assertEquals("--", Util.stripLeadingHyphens("----"));
    }

    // =========================================================================
    // Tests for stripLeadingAndTrailingQuotes(String str)
    // =========================================================================

    /**
     * ทดสอบทั้งสองเงื่อนไขเป็น True: มี Quotes ทั้งหน้าและหลัง
     */
    public void testStripLeadingAndTrailingQuotesBoth() {
        assertEquals("one two", Util.stripLeadingAndTrailingQuotes("\"one two\""));
        assertEquals("foo", Util.stripLeadingAndTrailingQuotes("\"foo\""));
    }

    /**
     * ทดสอบ Branch: startsWith("\"") == true แต่ endsWith("\"") == false
     */
    public void testStripLeadingAndTrailingQuotesLeadingOnly() {
        assertEquals("foo", Util.stripLeadingAndTrailingQuotes("\"foo"));
    }

    /**
     * ทดสอบ Branch: startsWith("\"") == false แต่ endsWith("\"") == true
     */
    public void testStripLeadingAndTrailingQuotesTrailingOnly() {
        assertEquals("foo", Util.stripLeadingAndTrailingQuotes("foo\""));
    }

    /**
     * ทดสอบทั้งสองเงื่อนไขเป็น False: ไม่มี Quotes เลย
     */
    public void testStripLeadingAndTrailingQuotesNone() {
        assertEquals("foo", Util.stripLeadingAndTrailingQuotes("foo"));
        assertEquals("foo bar", Util.stripLeadingAndTrailingQuotes("foo bar"));
    }

    /**
     * ทดสอบ Boundary: สตริงว่าง ("")
     */
    public void testStripLeadingAndTrailingQuotesEmpty() {
        assertEquals("", Util.stripLeadingAndTrailingQuotes(""));
    }

    /**
     * ทดสอบ Boundary Limit: Quote ตัวเดียว ("\"")
     */
    public void testStripLeadingAndTrailingQuotesSingleQuote() {
        assertEquals("", Util.stripLeadingAndTrailingQuotes("\""));
    }

    /**
     * ทดสอบ Boundary Limit: Double Quote ติดกันสองตัว ("\"\"")
     */
    public void testStripLeadingAndTrailingQuotesDoubleQuote() {
        assertEquals("", Util.stripLeadingAndTrailingQuotes("\"\""));
    }
}
package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

/**
 * Unit tests for {@link XmlDeclaration}.
 *
 * หมายเหตุสมมติฐาน (เนื่องจาก source บางส่วน เช่น Node/Attributes/Validate ไม่ได้ให้มาโดยตรง):
 * 1) Validate.notNull(name) คาดว่าจะ throw IllegalArgumentException เมื่อ name == null
 * 2) Attributes.get(key) ของ jsoup โดยทั่วไปคืนค่า "" (ไม่ใช่ null) เมื่อไม่พบ key -> อาจทำให้
 *    บางเทสเกี่ยวกับ version/encoding only fail บน buggy version (ตรงตาม fault ที่ Defects4J Jsoup-52b อ้างถึง)
 * 3) outerHtml() ของ node เดี่ยวที่ depth 0 ไม่เติม whitespace/indent เพิ่ม
 */
public class XmlDeclarationTest {

    // ---------------------- Constructor ----------------------

    @Test
    public void testConstructor_ValidArguments_CreatesInstance() {
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", false);
        assertNotNull(decl);
        assertEquals("xml", decl.name());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_NullName_ThrowsIllegalArgumentException() {
        new XmlDeclaration(null, "http://example.com", false);
    }

    // ---------------------- nodeName() ----------------------

    @Test
    public void testNodeName_ReturnsDeclarationConstant() {
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        assertEquals("#declaration", decl.nodeName());
    }

    // ---------------------- name() ----------------------

    @Test
    public void testName_ReturnsConstructorName() {
        XmlDeclaration decl = new XmlDeclaration("DOCTYPE", "", true);
        assertEquals("DOCTYPE", decl.name());
    }

    @Test
    public void testName_EmptyString_ReturnsEmptyString() {
        XmlDeclaration decl = new XmlDeclaration("", "", false);
        assertEquals("", decl.name());
    }

    // ---------------------- getWholeDeclaration() ----------------------

    @Test
    public void testGetWholeDeclaration_NameNotXml_ReturnsNameUnchanged() {
        XmlDeclaration decl = new XmlDeclaration("DOCTYPE", "", true);
        decl.attr("a", "1");
        decl.attr("b", "2");
        // name != "xml" -> ไม่เข้า if แม้ attributes.size() > 1
        assertEquals("DOCTYPE", decl.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclaration_NameCaseSensitive_XMLUppercase_ReturnsNameUnchanged() {
        XmlDeclaration decl = new XmlDeclaration("XML", "", false);
        decl.attr("version", "1.0");
        decl.attr("encoding", "UTF-8");
        // "xml".equals("XML") = false (case-sensitive) -> ไม่เข้า if แม้มี attribute >1
        assertEquals("XML", decl.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclaration_XmlNameNoAttributes_ReturnsNameUnchanged() {
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        // attributes.size() == 0 -> (0 > 1) เป็น false -> else branch
        assertEquals("xml", decl.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclaration_XmlNameOneAttribute_ReturnsNameUnchanged() {
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        decl.attr("version", "1.0");
        // attributes.size() == 1 -> (1 > 1) เป็น false -> else branch (boundary case)
        assertEquals("xml", decl.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclaration_XmlWithVersionAndEncoding_ReturnsBoth() {
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        decl.attr("version", "1.0");
        decl.attr("encoding", "UTF-8");
        // attributes.size() == 2 > 1 (boundary) -> เข้า if, ทั้ง version และ encoding != null
        String result = decl.getWholeDeclaration();
        assertEquals("xml version=\"1.0\" encoding=\"UTF-8\"", result);
    }

    @Test
    public void testGetWholeDeclaration_XmlWithVersionOnly_ReturnsVersionOnly() {
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        decl.attr("version", "1.0");
        decl.attr("standalone", "no"); // เพิ่มเพื่อให้ size() > 1 โดยไม่ใช่ encoding
        // คาดหวังตาม intent ของโค้ด: ไม่มี key "encoding" -> ไม่ควร append
        // หมายเหตุ: อาจ FAIL บน buggy implementation ที่ Attributes.get() คืน "" แทน null
        // -> ใช้ดักจับ fault ตาม Defects4J Jsoup-52b
        String result = decl.getWholeDeclaration();
        assertEquals("xml version=\"1.0\"", result);
    }

    @Test
    public void testGetWholeDeclaration_XmlWithEncodingOnly_ReturnsEncodingOnly() {
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        decl.attr("encoding", "UTF-8");
        decl.attr("standalone", "no");
        // คาดหวังตาม intent ของโค้ด: ไม่มี key "version" -> ไม่ควร append
        // หมายเหตุ: อาจ FAIL ด้วยเหตุผลเดียวกับเทสก่อนหน้า
        String result = decl.getWholeDeclaration();
        assertEquals("xml encoding=\"UTF-8\"", result);
    }

    @Test
    public void testGetWholeDeclaration_XmlWithNeitherVersionNorEncoding_ReturnsNameOnly() {
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        decl.attr("standalone", "no");
        decl.attr("foo", "bar");
        // attributes.size() == 2 > 1 -> เข้า if, แต่ไม่มี key "version"/"encoding"
        // คาดหวังตาม intent: ไม่มีการ append -> "xml"
        // หมายเหตุ: อาจ FAIL ด้วยเหตุผลเดียวกับ 2 เทสก่อนหน้า
        String result = decl.getWholeDeclaration();
        assertEquals("xml", result);
    }

    // ---------------------- outerHtmlHead()/outerHtmlTail() via toString() ----------------------

    @Test
    public void testToString_ProcessingInstructionTrue_UsesExclamationMark() {
        XmlDeclaration decl = new XmlDeclaration("DOCTYPE html", "", true);
        String result = decl.toString();
        assertTrue("ควรขึ้นต้นด้วย <!", result.startsWith("<!"));
        assertTrue(result.contains("DOCTYPE html"));
        assertTrue(result.endsWith(">"));
    }

    @Test
    public void testToString_ProcessingInstructionFalse_UsesQuestionMark() {
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        decl.attr("version", "1.0");
        decl.attr("encoding", "UTF-8");
        String result = decl.toString();
        assertTrue("ควรขึ้นต้นด้วย <?", result.startsWith("<?"));
        assertTrue(result.contains("version=\"1.0\""));
        assertTrue(result.endsWith(">"));
    }

    @Test
    public void testToString_SimpleXmlNoExtraAttributes_WrapsNameWithBrackets() {
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        // getWholeDeclaration() ใน case นี้คืน "xml" (else branch)
        // outerHtmlHead ต่อ "<" + "?" + "xml" + ">" และ outerHtmlTail ไม่เติมอะไร
        String result = decl.toString();
        assertEquals("<?xml>", result);
    }
}

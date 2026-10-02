package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for {@link DocumentType}
 * หมายเหตุ: ใส่ test class ใน package org.jsoup.nodes
 * เนื่องจาก outerHtmlHead/outerHtmlTail เป็น package-private methods
 */
public class DocumentTypeTest {

    // ---------- nodeName() ----------

    @Test
    public void testNodeNameReturnsDoctype() {
        DocumentType dt = new DocumentType("html", "pub", "sys", "base");
        assertEquals("#doctype", dt.nodeName());
    }

    @Test
    public void testNodeNameConstantRegardlessOfInput() {
        // ตรวจสอบว่า nodeName() คืนค่าคงที่เสมอ ไม่ขึ้นกับพารามิเตอร์
        DocumentType dt = new DocumentType("", "", "", "");
        assertEquals("#doctype", dt.nodeName());
    }

    // ---------- Constructor: attribute assignment ----------

    @Test
    public void testConstructorSetsAllAttributesCorrectly() {
        DocumentType dt = new DocumentType("html", "pub-id", "sys-id", "http://base");
        assertEquals("html", dt.attr("name"));
        assertEquals("pub-id", dt.attr("publicId"));
        assertEquals("sys-id", dt.attr("systemId"));
    }

    @Test
    public void testConstructorWithEmptyStrings() {
        DocumentType dt = new DocumentType("", "", "", "");
        assertEquals("", dt.attr("name"));
        assertEquals("", dt.attr("publicId"));
        assertEquals("", dt.attr("systemId"));
    }

    @Test
    public void testConstructorWithNullValues() {
        // หมายเหตุ: ไม่แน่ใจ behavior ของ attr() เมื่อรับค่า null
        // (อาจ throw NPE หรือเก็บเป็น null/empty string ขึ้นกับ implementation ของ Attributes)
        // จึงทดสอบเพียงว่า constructor ไม่ throw exception และ nodeName() ยังทำงานถูกต้อง
        DocumentType dt = new DocumentType(null, null, null, null);
        assertEquals("#doctype", dt.nodeName());
    }

    // ---------- outerHtmlHead(): Branch coverage ----------

    @Test
    public void testOuterHtmlHead_PublicIdNull_SystemIdNull() {
        // branch: both if-conditions FALSE (isBlank -> true สำหรับทั้งคู่)
        DocumentType dt = new DocumentType("html", null, null, "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("<!DOCTYPE html>", sb.toString());
    }

    @Test
    public void testOuterHtmlHead_PublicIdEmpty_SystemIdEmpty() {
        // branch: isBlank("") -> true สำหรับทั้งคู่ -> ทั้งสอง if FALSE
        DocumentType dt = new DocumentType("html", "", "", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("<!DOCTYPE html>", sb.toString());
    }

    @Test
    public void testOuterHtmlHead_PublicIdWhitespace_SystemIdWhitespace() {
        // boundary case: whitespace-only string ควรถูกมองว่า blank
        DocumentType dt = new DocumentType("html", "   ", "   ", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("<!DOCTYPE html>", sb.toString());
    }

    @Test
    public void testOuterHtmlHead_PublicIdOnly() {
        // branch: if(publicId) TRUE, if(systemId) FALSE
        DocumentType dt = new DocumentType("html", "foo-pub", null, "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("<!DOCTYPE html PUBLIC \"foo-pub\">", sb.toString());
    }

    @Test
    public void testOuterHtmlHead_SystemIdOnly() {
        // branch: if(publicId) FALSE, if(systemId) TRUE
        DocumentType dt = new DocumentType("html", null, "bar-sys", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("<!DOCTYPE html bar-sys\">", sb.toString());
    }

    @Test
    public void testOuterHtmlHead_BothPublicIdAndSystemIdPresent() {
        // branch: ทั้งสอง if TRUE
        DocumentType dt = new DocumentType("html", "foo-pub", "bar-sys", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("<!DOCTYPE html PUBLIC \"foo-pub\" bar-sys\">", sb.toString());
    }

    @Test
    public void testOuterHtmlHead_WithRealWorldDtdStrings() {
        // ทดสอบด้วยค่าจริงที่ใช้งานบ่อย (XHTML strict DTD)
        DocumentType dt = new DocumentType(
                "html",
                "-//W3C//DTD XHTML 1.0 Strict//EN",
                "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd",
                "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, new Document.OutputSettings());
        String expected = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\""
                + " http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">";
        assertEquals(expected, sb.toString());
    }

    @Test
    public void testOuterHtmlHead_AppendsToExistingContent() {
        // ตรวจสอบว่า method append ต่อจาก StringBuilder ที่มีข้อมูลอยู่แล้ว (ไม่ clear)
        DocumentType dt = new DocumentType("html", null, null, "");
        StringBuilder sb = new StringBuilder("PREFIX-");
        dt.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("PREFIX-<!DOCTYPE html>", sb.toString());
    }

    // ---------- outerHtmlTail(): No-op verification ----------

    @Test
    public void testOuterHtmlTail_DoesNotModifyStringBuilder() {
        // ตามซอร์สโค้ด outerHtmlTail ไม่มี logic ใดๆ (empty method body)
        DocumentType dt = new DocumentType("html", "foo", "bar", "");
        StringBuilder sb = new StringBuilder("unchanged-content");
        dt.outerHtmlTail(sb, 0, new Document.OutputSettings());
        assertEquals("unchanged-content", sb.toString());
    }

    @Test
    public void testOuterHtmlTail_WithEmptyStringBuilder() {
        DocumentType dt = new DocumentType("html", "foo", "bar", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlTail(sb, 0, new Document.OutputSettings());
        assertEquals("", sb.toString());
    }
}

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class XmlDeclarationTest {

    @Test
    public void testConstructorAndGettersNormal() {
        // ทดสอบการสร้างออบเจ็กต์และgetter พื้นฐาน
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", false);
        assertEquals("#declaration", decl.nodeName());
        assertEquals("xml", decl.name());
        assertEquals("xml", decl.getWholeDeclaration());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullNameThrowsException() {
        // Edge Case: ชื่อเป็น null ต้องเกิด Exception (Boundary/Null check)
        new XmlDeclaration(null, "http://example.com", true);
    }

    @Test
    public void testGetWholeDeclarationNonXmlName() {
        // Branch: decl.equals("xml") เป็น false (เช่น "mydecl")
        XmlDeclaration decl = new XmlDeclaration("mydecl", "", false);
        decl.attr("version", "1.0");
        decl.attr("encoding", "UTF-8");
        
        assertEquals("mydecl", decl.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclarationXmlWithSizeNotGreaterThanOne() {
        // Branch: decl.equals("xml") เป็น true แต่ attributes.size() <= 1
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        // ขนาด attributes เป็น 0 หรือ 1
        assertEquals("xml", decl.getWholeDeclaration());

        decl.attr("version", "1.0");
        // ขนาด attributes เป็น 1 (ไม่มากกว่า 1)
        assertEquals("xml", decl.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclarationXmlWithVersionAndEncoding() {
        // Branch: decl.equals("xml") และ attributes.size() > 1 พร้อมทั้งมีทั้ง version และ encoding
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        decl.attr("version", "1.0");
        decl.attr("encoding", "UTF-8");
        
        String whole = decl.getWholeDeclaration();
        assertTrue(whole.contains("version=\"1.0\""));
        assertTrue(whole.contains("encoding=\"UTF-8\""));
    }

    @Test
    public void testGetWholeDeclarationXmlWithOnlyVersion() {
        // Branch: มี version แต่ encoding เป็น null
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        decl.attr("version", "1.0");
        decl.attr("dummy", "value"); // ทำให้ size > 1
        
        String whole = decl.getWholeDeclaration();
        assertTrue(whole.contains("version=\"1.0\""));
        assertFalse(whole.contains("encoding="));
    }

    @Test
    public void testGetWholeDeclarationXmlWithOnlyEncoding() {
        // Branch: version เป็น null แต่มี encoding
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        decl.attr("encoding", "UTF-8");
        decl.attr("dummy", "value"); // ทำให้ size > 1
        
        String whole = decl.getWholeDeclaration();
        assertFalse(whole.contains("version="));
        assertTrue(whole.contains("encoding=\"UTF-8\""));
    }

    @Test
    public void testOuterHtmlHeadProcessingInstructionTrue() throws IOException {
        // Branch: isProcessingInstruction = true -> นำหน้าด้วย <!
        XmlDeclaration decl = new XmlDeclaration("xml", "", true);
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        
        decl.outerHtmlHead(accum, 0, out);
        assertTrue(accum.toString().startsWith("<!"));
        assertTrue(accum.toString().endsWith(">"));
    }

    @Test
    public void testOuterHtmlHeadProcessingInstructionFalse() throws IOException {
        // Branch: isProcessingInstruction = false -> นำหน้าด้วย ?
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        
        decl.outerHtmlHead(accum, 0, out);
        assertTrue(accum.toString().startsWith("<?"));
        assertTrue(accum.toString().endsWith(">"));
    }

    @Test
    public void testToStringAndTail() {
        // ทดสอบ toString() และ outerHtmlTail() ที่ไม่มีการทำงานพิเศษ (Coverage ให้ครบ 100%)
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        assertNotNull(decl.toString());
        
        StringBuilder accum = new StringBuilder();
        // outerHtmlTail ไม่ควรทำให้เกิด Exception หรือเปลี่ยนค่า accum
        decl.outerHtmlTail(accum, 0, new Document.OutputSettings());
        assertEquals("", accum.toString());
    }
}
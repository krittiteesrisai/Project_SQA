package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

public class DocumentTypeTest {

    @Test
    public void testNodeName() {
        DocumentType doctype = new DocumentType("html", "-//W3C//DTD XHTML 1.1//EN", "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd", "http://example.com");
        assertEquals("#doctype", doctype.nodeName());
    }

    @Test
    public void testOuterHtmlHeadMinimal() {
        // ไม่มีทั้ง publicId และ systemId
        DocumentType doctype = new DocumentType("html", "", "", "http://example.com");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        
        doctype.outerHtmlHead(accum, 0, out);
        assertEquals("<!DOCTYPE html>", accum.toString());
    }

    @Test
    public void testOuterHtmlHeadWithNullAttributes() {
        // ส่งค่า null เข้าไปใน publicId และ systemId
        DocumentType doctype = new DocumentType("html", null, null, "http://example.com");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        
        doctype.outerHtmlHead(accum, 0, out);
        assertEquals("<!DOCTYPE html>", accum.toString());
    }

    @Test
    public void testOuterHtmlHeadWithPublicIdOnly() {
        // มีเฉพาะ publicId
        DocumentType doctype = new DocumentType("html", "-//IETF//DTD HTML 2.0//EN", "", "http://example.com");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        
        doctype.outerHtmlHead(accum, 0, out);
        assertEquals("<!DOCTYPE html PUBLIC \"-//IETF//DTD HTML 2.0//EN\">", accum.toString());
    }

    @Test
    public void testOuterHtmlHeadWithSystemIdOnly() {
        // มีเฉพาะ systemId (Edge case ที่ระบบอาจพบได้)
        DocumentType doctype = new DocumentType("html", "", "about:legacy-compat", "http://example.com");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        
        doctype.outerHtmlHead(accum, 0, out);
        // หมายเหตุ: ตามโค้ดต้นฉบับจะเติม space และ systemId ตามด้วย quote ปิด
        assertEquals("<!DOCTYPE html about:legacy-compat\">", accum.toString());
    }

    @Test
    public void testOuterHtmlHeadWithBothIds() {
        // มีทั้ง publicId และ systemId ครบถ้วน
        DocumentType doctype = new DocumentType(
                "html", 
                "-//W3C//DTD HTML 4.01 Transitional//EN", 
                "http://www.w3.org/TR/html4/loose.dtd", 
                "http://example.com"
        );
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        
        doctype.outerHtmlHead(accum, 0, out);
        assertEquals("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" http://www.w3.org/TR/html4/loose.dtd\">", accum.toString());
    }

    @Test
    public void testOuterHtmlHeadWithBlankIds() {
        // publicId และ systemId เป็น whitespace เปล่าๆ
        DocumentType doctype = new DocumentType("html", "   ", "   ", "http://example.com");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        
        doctype.outerHtmlHead(accum, 0, out);
        assertEquals("<!DOCTYPE html>", accum.toString());
    }

    @Test
    public void testOuterHtmlTailDoesNothing() {
        DocumentType doctype = new DocumentType("html", "", "", "http://example.com");
        StringBuilder accum = new StringBuilder("initial");
        Document.OutputSettings out = new Document.OutputSettings();
        
        doctype.outerHtmlTail(accum, 0, out);
        // outerHtmlTail เป็น void เปล่าๆ สตริงต้องไม่เปลี่ยน
        assertEquals("initial", accum.toString());
    }
}
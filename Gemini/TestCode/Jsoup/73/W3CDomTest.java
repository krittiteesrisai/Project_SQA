package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.DocumentType;
import org.w3c.dom.DOMException;

import static org.junit.Assert.*;

public class W3CDomTest {

    @Test(expected = IllegalArgumentException.class)
    public void testFromJsoupNull() {
        W3CDom w3CDom = new W3CDom();
        w3CDom.fromJsoup(null);
    }

    @Test
    public void testFromJsoupWithLocationAndVariousNodes() {
        // สร้าง Jsoup Document พร้อม Location, Elements, Text, Comment, Data, Namespaces และ Attributes พิเศษ
        Document jsoupDoc = Document.createShell("http://example.com/test");
        jsoupDoc.location(); // set location
        
        Element body = jsoupDoc.body();
        body.attr("xmlns", "http://default.ns");
        body.attr("xmlns:svg", "http://www.w3.org/2000/svg");
        body.attr("invalid attr!", "value"); // ทดสอบการกรอง Attribute ที่ไม่valid
        body.attr("valid-attr", "123");

        // เพิ่ม Child Element ที่มี Prefix และไม่มี Prefix
        Element childDiv = body.appendElement("div");
        childDiv.text("Hello World");
        
        Element svgRect = body.appendElement("svg:rect");
        svgRect.appendChild(new Comment("This is a comment"));
        svgRect.appendChild(new DataNode("console.log('data');", "http://example.com"));
        
        // เพิ่ม Node ชนิดอื่นๆ เช่น DocumentType เพื่อครอบคลุม unhandled branch ใน head
        jsoupDoc.prependChild(new DocumentType("html", "", ""));

        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document w3cDoc = w3CDom.fromJsoup(jsoupDoc);

        assertNotNull(w3cDoc);
        assertEquals("http://example.com/test", w3cDoc.getDocumentURI());

        String xmlString = w3CDom.asString(w3cDoc);
        assertNotNull(xmlString);
        assertTrue(xmlString.contains("Hello World"));
        assertTrue(xmlString.contains("This is a comment"));
    }

    @Test
    public void testConvertWithoutLocation() {
        Document jsoupDoc = new Document(""); // Blank location
        jsoupDoc.appendElement("html").appendElement("body").text("No Location");

        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document w3cDoc = w3CDom.fromJsoup(jsoupDoc);

        assertNotNull(w3cDoc);
        // Location ว่าง DocumentURI ควรเป็นค่าเริ่มต้น (มักจะเป็น null หรือค่าว่าง)
        assertNull(w3cDoc.getDocumentURI());
    }

    @Test
    public void testW3CBuilderUnhandledNode() {
        // ทดสอบส่ง Node แปลกปลอม (เช่น DocumentType) เข้าไปยัง W3CBuilder โดยตรงผ่าน NodeTraversor หรือเรียก head/tail โดยตรง
        Document jsoupDoc = new Document("");
        DocumentType docType = new DocumentType("html", "pubId", "sysId");
        jsoupDoc.appendChild(docType);

        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document w3cDoc = w3CDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDoc);
    }

    @Test
    public void testAsStringExceptionHandling() {
        W3CDom w3CDom = new W3CDom();
        // ส่ง Document ที่ว่างเปล่าหรือ null ไปยัง asString อาจจะทำให้เกิด TransformerException หรือทำงานผ่านได้
        org.w3c.dom.Document w3cDoc = w3CDom.fromJsoup(Document.createShell(""));
        String result = w3CDom.asString(w3cDoc);
        assertNotNull(result);
    }
}
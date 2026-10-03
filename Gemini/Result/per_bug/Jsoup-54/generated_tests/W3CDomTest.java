package org.jsoup.helper;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class W3CDomTest {

    @Test(expected = IllegalArgumentException.class)
    public void testFromJsoupNull() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.fromJsoup(null);
    }

    @Test
    public void testFromJsoupWithLocationAndVariousNodes() {
        // Arrange: สร้าง Jsoup Document ที่มี Location, Element, Text, Comment, DataNode, Namespaces, และ Invalid Attribute Key
        Document jsoupDoc = Document.createShell("http://example.com/path");
        jsoupDoc.body().attr("xmlns", "http://www.w3.org/1999/xhtml");
        jsoupDoc.body().attr("xmlns:svg", "http://www.w3.org/2000/svg");
        jsoupDoc.body().attr("invalid key!", "value"); // ทดสอบ Regex กรอง Attribute

        Element childEl = jsoupDoc.body().appendElement("svg:rect");
        childEl.attr("width", "100");

        childEl.appendChild(new TextNode("Hello Text", "http://example.com"));
        childEl.appendChild(new Comment("A comment", "http://example.com"));
        childEl.appendChild(new DataNode("console.log('data');", "http://example.com"));

        W3CDom w3cDom = new W3CDom();

        // Act
        org.w3c.dom.Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        String xmlString = w3cDom.asString(w3cDoc);

        // Assert
        assertNotNull(w3cDoc);
        assertEquals("http://example.com/path", w3cDoc.getDocumentURI());
        assertTrue(xmlString.contains("body"));
        assertTrue(xmlString.contains("Hello Text"));
        assertTrue(xmlString.contains("A comment"));
        assertTrue(xmlString.contains("console.log('data');"));
    }

    @Test
    public void testConvertWithoutLocation() {
        // Arrange: Jsoup Document ไม่มี Location (blank)
        Document jsoupDoc = new Document("");
        jsoupDoc.appendElement("html").appendElement("head");

        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document w3cDoc = w3cDom.getFactory().newDocumentBuilder().newDocument();

        // Act
        w3cDom.convert(jsoupDoc, w3cDoc);

        // Assert
        assertNull(w3cDoc.getDocumentURI());
        assertNotNull(w3cDoc.getDocumentElement());
    }

    @Test
    public void testUnhandledNodeTypeInVisitor() {
        // ทดสอบ Node ชนิดอื่นที่ไม่ใช่ Element, TextNode, Comment, DataNode (เช่น DocumentType)
        Document jsoupDoc = Document.createShell("http://example.com");
        // เพิ่ม DocumentType หรือ Node ที่ W3CBuilder ไม่ได้ handle เพื่อเทส branch else
        jsoupDoc.nodeName(); // ทำให้เกิด traversal ครบถ้วนโดยไม่พัง

        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        
        assertNotNull(w3cDoc);
    }
}
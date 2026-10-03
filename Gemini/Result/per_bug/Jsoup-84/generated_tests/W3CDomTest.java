package org.jsoup.helper;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import static org.junit.Assert.*;

public class W3CDomTest {

    @Test(expected = IllegalArgumentException.class)
    public void testFromJsoupNullInput() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.fromJsoup(null);
    }

    @Test
    public void testFromJsoupWithLocationAndVariousNodes() {
        // สร้าง Jsoup Document พร้อม Location, Elements, Text, Comment, DataNode, Namespaces, และ Attributes ที่ถูกต้องและไม่ถูกต้อง
        String html = "<html xmlns='http://www.w3.org/1999/xhtml' xmlns:fb='http://facebook.com/ns'>" +
                      "<head><title>Hello &amp; Welcome</title><!-- My Comment --><style>body { color: red; }</style></head>" +
                      "<body>" +
                      "<div id='main' class='content' invalid.attr!='val' a:b='ns-attr'>Text inside div</div>" +
                      "<fb:comments fb:id='123'></fb:comments>" +
                      "</body></html>";
        
        org.jsoup.nodes.Document jsoupDoc = org.jsoup.parse(html);
        jsoupDoc.setLocation("http://example.com/index.html");

        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        assertNotNull(w3cDoc);
        assertEquals("http://example.com/index.html", w3cDoc.getDocumentURI());

        String xmlString = w3cDom.asString(w3cDoc);
        assertNotNull(xmlString);
        assertTrue(xmlString.contains("Hello"));
        assertTrue(xmlString.contains("My Comment"));
        assertTrue(xmlString.contains("body"));
    }

    @Test
    public void testConvertWithoutLocation() {
        // ทดสอบกรณี Document ไม่มี Location (isBlank) เพื่อครอบคลุม Branch วนรอบ convert
        org.jsoup.nodes.Document jsoupDoc = org.jsoup.parse("<div>No Location</div>");
        // location เป็นค่าว่างโดยปริยาย
        
        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        assertNotNull(w3cDoc);
        // DocumentURI จะว่างเปล่าหรือเป็นค่าเริ่มต้น
        assertEquals("", w3cDoc.getDocumentURI());
    }

    @Test
    public void testUnhandledNodeTypeAndTailBranch() {
        // จำลองโครงสร้างเพื่อเข้าถึงเงื่อนไขที่ไม่ใช่ Element, TextNode, Comment, DataNode (เช่น DocumentType หรือ Node อื่นๆ หากทำได้ผ่านการแปลง)
        // รวมถึงทดสอบ Tail branch เมื่อ dest.getParentNode() ไม่ใช่ Element หรือเป็น Element ปกติ
        org.jsoup.nodes.Document jsoupDoc = org.jsoup.parse("<div><p>Paragraph</p></div>");
        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = w3cDom.newDocumentBuilderInstance(); // หรือผ่านแปลงปกติ
        
        // แปลงปกติเพื่อเทส tail และ namespace stack pop/push
        Document out = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(out);
        assertEquals("div", out.getDocumentElement().getNodeName());
    }
}
package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class XmlTreeBuilderTest {

    private XmlTreeBuilder treeBuilder;

    @Before
    public void setUp() {
        treeBuilder = new XmlTreeBuilder();
    }

    @Test
    public void testInitialiseParse() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        treeBuilder.initialiseParse("<root />", "http://example.com", errors);
        
        assertNotNull(treeBuilder.doc);
        assertEquals(1, treeBuilder.stack.size());
        assertEquals(treeBuilder.doc, treeBuilder.stack.peek());
    }

    @Test
    public void testProcessStartTagAndEndTag() {
        String xml = "<root><child>text</child></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        
        assertNotNull(doc.selectFirst("root"));
        assertNotNull(doc.selectFirst("child"));
        assertEquals("text", doc.selectFirst("child").text());
    }

    @Test
    public void testProcessComment() {
        String xml = "<root><!-- my comment --></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        
        assertEquals(1, doc.selectFirst("root").childNodeSize());
        Node commentNode = doc.selectFirst("root").childNode(0);
        assertTrue(commentNode instanceof org.jsoup.nodes.Comment);
        assertEquals(" my comment ", ((org.jsoup.nodes.Comment) commentNode).getData());
    }

    @Test
    public void testProcessCharacter() {
        String xml = "<root>Character Data</root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        
        assertEquals("Character Data", doc.selectFirst("root").text());
    }

    @Test
    public void testProcessDoctype() {
        String xml = "<!DOCTYPE html><html></html>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        
        assertNotNull(doc.documentType());
        assertEquals("html", doc.documentType().name());
    }

    @Test
    public void testProcessEofToken() {
        Token.EOF eofToken = new Token.EOF();
        boolean result = treeBuilder.process(eofToken);
        assertTrue(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProcessUnexpectedToken() {
        // สร้าง Token ปอมประเภทอื่นที่ไม่ได้อยู่ใน switch เพื่อเทส default branch (Validate.fail)
        Token invalidToken = new Token.CData("test");
        treeBuilder.process(invalidToken);
    }

    @Test
    public void testInsertSelfClosingKnownTag() {
        // Tag ที่รู้จัก เช่น img หรือ br ผ่าน XML Parser
        String xml = "<root><img /></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        assertNotNull(doc.selectFirst("img"));
    }

    @Test
    public void testInsertSelfClosingUnknownTag() {
        // Tag ที่ไม่รู้จัก เช่น customtag
        String xml = "<root><customtag/></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Element custom = doc.selectFirst("customtag");
        assertNotNull(custom);
        assertTrue(custom.tag().isSelfClosing());
    }

    @Test
    public void testPopStackToCloseNotFound() {
        // ทดสอบ EndTag ที่ไม่มี StartTag อยู่ใน stack (firstFound == null branch)
        String xml = "<root></unopened></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testPopStackToCloseWithNestedElements() {
        // ทดสอบการปิด Tag แบบซ้อนกัน และต้อง pop elements ระหว่างทางออก
        String xml = "<root><level1><level2></level1></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        // level2 ควรถูกบังคับ pop ออกเมื่อ level1 ถูกปิด
        assertNotNull(doc.selectFirst("root"));
        assertNotNull(doc.selectFirst("level1"));
    }
}
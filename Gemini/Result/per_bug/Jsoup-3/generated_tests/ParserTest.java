package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void testParseBasicDocument() {
        String html = "<html><head><title>Test</title></head><body><p>Hello World</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
        assertEquals("Test", doc.title());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testParseBodyFragment() {
        String html = "<div>Fragment content</div>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com");
        assertNotNull(doc);
        assertEquals("Fragment content", doc.body().text());
    }

    @Test
    public void testParseComments() {
        // ทดสอบทั้งแบบจบด้วย --> และแบบลงท้ายด้วย - เดี่ยวๆ
        String html = "<div><!-- Comment 1 --><!-- Comment 2---></div>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com");
        assertNotNull(doc);
        assertEquals(2, doc.body().child(0.0 > 1 ? 0 : 0).childNodes().size()); // เข้าถึง child nodes ผ่าน DOM
    }

    @Test
    public void testParseCdata() {
        String html = "<div><![CDATA[ <notag>cdata text</notag> ]]></div>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com");
        assertNotNull(doc);
        assertTrue(doc.body().text().contains("cdata text"));
    }

    @Test
    public void testParseXmlDeclAndProcessingInstruction() {
        String html = "<?xml version=\"1.0\"?><!DOCTYPE html><div>Content</div>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
    }

    @Test
    public void testParseEndTagEdgeCases() {
        // ทดสอบ EndTag ปกติ และ EndTag ที่ไม่มีชื่อ (</>)
        String html = "<div><span>Text</span></></div>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com");
        assertNotNull(doc);
        assertEquals("Text", doc.body().text());
    }

    @Test
    public void testParseStartTagNotAStartTag() {
        // ทดสอบเมื่อเจอเครื่องหมาย < แต่ไม่ใช่ start tag (เช่น "< ")
        String html = "<div>1 < 2</div>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com");
        assertNotNull(doc);
        assertTrue(doc.body().text().contains("1"));
    }

    @Test
    public void testParseAttributesVariations() {
        // ทดสอบ Attribute แบบ SQ ('), DQ ("), ไม่มี quotes, และ Attribute ว่างเปล่า
        String html = "<div id='val1' class=\"val2\" data-test=val3 invalidattr></div>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com");
        Element div = doc.body().child(0);
        assertEquals("val1", div.attr("id"));
        assertEquals("val2", div.attr("class"));
        assertEquals("val3", div.attr("data-test"));
        assertTrue(div.hasAttr("invalidattr"));
    }

    @Test
    public void testParseSelfClosingAndEmptyElements() {
        // ทดสอบ self-closing tag และ empty element (เช่น img)
        String html = "<div><img src='test.jpg'/><br></div>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com");
        assertNotNull(doc);
        assertEquals("test.jpg", doc.body().select("img").attr("src"));
    }

    @Test
    public void testParseDataTagsTextareaAndScript() {
        // ทดสอบ textarea (ใช้ TextNode) และ script (ใช้ DataNode)
        String html = "<textarea>some textarea text</textarea><script>var a = \"test\";</script>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com");
        assertNotNull(doc);
        assertEquals("some textarea text", doc.body().select("textarea").text());
        assertTrue(doc.body().select("script").outerHtml().contains("var a = \"test\";"));
    }

    @Test
    public void testParseBaseTagUpdatesBaseUri() {
        // ทดสอบ tag <base href="..."> ว่ามีการอัปเดต baseUri หรือไม่
        String html = "<head><base href=\"http://newbase.com/path\"></head><body><a href=\"page.html\">link</a></body>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
        assertEquals("http://newbase.com/page.html", doc.body().select("a").first().absUrl("href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullHtmlValidation() {
        Parser.parse(null, "http://example.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullBaseUriValidation() {
        Parser.parse("<html></html>", null);
    }
}
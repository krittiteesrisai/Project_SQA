package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullHtml() {
        Parser.parse(null, "http://example.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullBaseUri() {
        Parser.parse("<html></html>", null);
    }

    @Test
    public void testParseStandardDocument() {
        String html = "<html><head><title>Test Title</title></head><body><div id='d1'>Hello World</div></body></html>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World", doc.getElementById("d1").text());
    }

    @Test
    public void testParseBodyFragment() {
        String html = "<p>Fragment text</p>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com");
        assertNotNull(doc);
        assertEquals("Fragment text", doc.body().text());
    }

    @Test
    public void testParseBodyFragmentRelaxed() {
        String html = "<b>Bold text without wrapper</b>";
        Document doc = Parser.parseBodyFragmentRelaxed(html, "http://example.com");
        assertNotNull(doc);
        assertTrue(doc.body().text().contains("Bold text"));
    }

    @Test
    public void testParseComments() {
        // Test normal comment and comment ending with '-'
        String html = "<div><!-- Normal Comment --><!-- Comment ending with dash---></div>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
        assertEquals("Normal Comment", doc.child(0).child(0).node(0).outerHtml());
    }

    @Test
    public void testParseXmlDeclarationAndProcessingInstruction() {
        String html = "<?xml version='1.0'?><!DOCTYPE html><html><body></body></html>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
    }

    @Test
    public void testParseCdata() {
        String html = "<div><![CDATA[ <p>This is raw cdata & unescaped</p> ]]></div>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
        assertTrue(doc.text().contains("This is raw cdata"));
    }

    @Test
    public void testParseEndTagEdgeCases() {
        // Valid end tag vs empty end tag </>
        String html = "<div><span>Text</span></></div>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
    }

    @Test
    public void testParseAttributesVariants() {
        // Single quotes, double quotes, unquoted, and invalid empty key attribute (=value)
        String html = "<div single='val1' double=\"val2\" unquoted=val3 =invalidKeyVal></div>";
        Document doc = Parser.parse(html, "http://example.com");
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals("val1", div.attr("single"));
        assertEquals("val2", div.attr("double"));
        assertEquals("val3", div.attr("unquoted"));
    }

    @Test
    public void testParseSelfClosingTags() {
        // Known self closing (img) and unknown self closing custom tag (<custom/>)
        String html = "<img src='test.jpg' /><customtag id='c1' />";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc.select("img").first());
        assertNotNull(doc.getElementById("c1"));
    }

    @Test
    public void testDataTagsContent() {
        // textarea, title, script handling
        String html = "<textarea>textarea content</textarea><title>title content</title><script>script content</script>";
        Document doc = Parser.parse(html, "http://example.com");
        assertEquals("textarea content", doc.select("textarea").first().text());
        assertEquals("title content", doc.title());
        assertTrue(doc.select("script").first().data().contains("script content"));
    }

    @Test
    public void testBaseTagHandling() {
        String html = "<html><head><base href='http://newbase.com/path/'></head><body><a href='page.html'>Link</a></body></html>";
        Document doc = Parser.parse(html, "http://example.com");
        assertEquals("http://newbase.com/path/", doc.baseUri());
    }

    @Test
    public void testParseTextNodeSpecialCharacter() {
        // Handling text with standalone '<' character
        String html = "<div>hello < there</div>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
        assertTrue(doc.body().text().contains("hello"));
    }

    @Test
    public void testImplicitParentCreation() {
        // Forcing invalid structure where implicit parent or head is required
        String html = "<body>Some body content without html/head wrapper structure</html>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
    }

    @Test
    public void testPopStackToCloseBoundaries() {
        String html = "<div><p>Paragraph 1<div>Paragraph 2</div>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
    }
}
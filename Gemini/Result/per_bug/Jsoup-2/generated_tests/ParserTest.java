package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void testParseBasicHtml() {
        String html = "<html><head><title>Test Title</title></head><body><p>Hello World</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testParseBodyFragment() {
        String fragment = "<div><span>Fragment Text</span></div>";
        Document doc = Parser.parseBodyFragment(fragment, "http://example.com");
        assertNotNull(doc);
        assertEquals("Fragment Text", doc.select("span").text());
        assertNotNull(doc.body());
    }

    @Test
    public void testParseCommentVariations() {
        // Test comment ending with '-' and normal comment
        String html = "<!-- Comment with dash---><!-- Normal comment -->";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
        // Verify comments are parsed without throwing exceptions
    }

    @Test
    public void testParseCdata() {
        String html = "<div><![CDATA[ <p>Raw CData Content</p> ]]></div>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
        assertTrue(doc.text().contains("Raw CData Content"));
    }

    @Test
    public void testParseXmlDeclaration() {
        String html = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root/>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
    }

    @Test
    public void testParseXmlDeclarationAlternate() {
        String html = "<!DOCTYPE html><root/>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
    }

    @Test
    public void testParseAttributesEdgeCases() {
        // Test single quotes, double quotes, no quotes, empty attribute key, and self-closing
        String html = "<div id='single' class=\"double\" unquoted=value invalidAttr></div><img src=\"foo.jpg\"/>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
        Element div = doc.select("div").first();
        assertEquals("single", div.id());
        assertEquals("double", div.className());
        assertEquals("value", div.attr("unquoted"));
    }

    @Test
    public void testParseStartTagWithZeroLengthName() {
        // Triggers: tagName.length() == 0 -> tq.addFirst("&lt;"); parseTextNode();
        String html = "< invalid";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
    }

    @Test
    public void testParseDataOnlyTags() {
        // Test textarea and script tags (DataNode vs TextNode creation)
        String html = "<textarea>Area Text</textarea><script>var x = \"test\";</script>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
        assertEquals("Area Text", doc.select("textarea").text());
        assertTrue(doc.select("script").outerHtml().contains("var x = \"test\";"));
    }

    @Test
    public void testBaseTagHandling() {
        String html = "<head><base href=\"http://newbase.com/path/\"></head><body><a href=\"relative.html\">Link</a></body>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
        Element a = doc.select("a").first();
        assertEquals("http://newbase.com/path/relative.html", a.absUrl("href"));
    }

    @Test
    public void testInvalidAncestorAndImplicitParentCreation() {
        // Placing a body tag or structural element where it violates valid parent hierarchy to trigger implicit parent & head creation
        String html = "<body><div>Some content</div></body>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

    @Test
    public void testParseEndTag() {
        String html = "<div><p>Paragraph</p></div>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
        assertEquals("Paragraph", doc.select("p").text());
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
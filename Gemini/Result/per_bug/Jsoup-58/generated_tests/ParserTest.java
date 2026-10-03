package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void testParserConstructorAndGettersSetters() {
        HtmlTreeBuilder htmlBuilder = new HtmlTreeBuilder();
        Parser parser = new Parser(htmlBuilder);
        
        assertSame(htmlBuilder, parser.getTreeBuilder());

        XmlTreeBuilder xmlBuilder = new XmlTreeBuilder();
        parser.setTreeBuilder(xmlBuilder);
        assertSame(xmlBuilder, parser.getTreeBuilder());

        ParseSettings customSettings = new ParseSettings(true, true);
        parser.settings(customSettings);
        assertSame(customSettings, parser.settings());
    }

    @Test
    public void testTrackErrorsBranchCoverage() {
        Parser parser = Parser.htmlParser();
        
        // Branch: maxErrors <= 0 (Default)
        assertFalse(parser.isTrackErrors());
        
        // Branch: maxErrors > 0
        parser.setTrackErrors(5);
        assertTrue(parser.isTrackErrors());
        
        // Parse input with error tracking enabled
        Document doc = parser.parseInput("<p>Test</p>", "http://example.com");
        assertNotNull(doc);
        assertNotNull(parser.getErrors());
    }

    @Test
    public void testStaticHtmlParse() {
        String html = "<html><head><title>First</title></head><body><p>Parsed Html</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
        assertEquals("First", doc.title());
        assertEquals("Parsed Html", doc.select("p").text());
    }

    @Test
    public void testStaticHtmlParseEdgeCases() {
        // Edge case: empty string
        Document docEmpty = Parser.parse("", "http://example.com");
        assertNotNull(docEmpty);

        // Edge case: null input check
        try {
            Parser.parse(null, "http://example.com");
            fail("Expected IllegalArgumentException or NullPointerException");
        } catch (Exception e) {
            // Expected behavior in robust parsers
            assertNotNull(e);
        }
    }

    @Test
    public void testParseFragment() {
        String fragment = "<span>Fragment</span>";
        Document doc = Document.createShell("http://example.com");
        List<Node> nodes = Parser.parseFragment(fragment, doc.body(), "http://example.com");
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

    @Test
    public void testParseXmlFragment() {
        String xmlFragment = "<root><child>Data</child></root>";
        List<Node> nodes = Parser.parseXmlFragment(xmlFragment, "http://example.com");
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

    @Test
    public void testParseBodyFragment() {
        String bodyHtml = "<div>Body Content</div>";
        Document doc = Parser.parseBodyFragment(bodyHtml, "http://example.com");
        assertNotNull(doc);
        assertEquals("Body Content", doc.body().select("div").text());
    }

    @Test
    public void testParseBodyFragmentRelaxed() {
        String bodyHtml = "<p>Relaxed Body</p>";
        Document doc = Parser.parseBodyFragmentRelaxed(bodyHtml, "http://example.com");
        assertNotNull(doc);
        assertEquals("Relaxed Body", doc.body().select("p").text());
    }

    @Test
    public void testUnescapeEntities() {
        String escaped = "&lt;p&gt;Hello &amp; Welcome&lt;/p&gt;";
        String unescaped = Parser.unescapeEntities(escaped, false);
        assertEquals("<p>Hello & Welcome</p>", unescaped);

        String attrEscaped = "Val&quot;ue";
        String attrUnescaped = Parser.unescapeEntities(attrEscaped, true);
        assertEquals("Val\"ue", attrUnescaped);
    }

    @Test
    public void testHtmlAndXmlParserBuilders() {
        Parser htmlP = Parser.htmlParser();
        assertNotNull(htmlP.getTreeBuilder());
        assertTrue(htmlP.getTreeBuilder() instanceof HtmlTreeBuilder);

        Parser xmlP = Parser.xmlParser();
        assertNotNull(xmlP.getTreeBuilder());
        assertTrue(xmlP.getTreeBuilder() instanceof XmlTreeBuilder);
    }
}
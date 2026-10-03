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
        TreeBuilder initialBuilder = new HtmlTreeBuilder();
        Parser parser = new Parser(initialBuilder);

        assertEquals(initialBuilder, parser.getTreeBuilder());

        TreeBuilder newBuilder = new XmlTreeBuilder();
        Parser chainedParser = parser.setTreeBuilder(newBuilder);
        
        assertEquals(newBuilder, parser.getTreeBuilder());
        assertEquals(parser, chainedParser);
    }

    @Test
    public void testTrackErrorsBranchFalse() {
        Parser parser = Parser.htmlParser();
        // Default maxErrors is 0 -> isTrackErrors() should be false
        assertFalse(parser.isTrackErrors());

        // Parse input with error tracking disabled
        Document doc = parser.parseInput("<html><head></head><body><p>Hello</p></body></html>", "http://example.com");
        assertNotNull(doc);
        assertNotNull(parser.getErrors());
        assertTrue(parser.getErrors().isEmpty());
    }

    @Test
    public void testTrackErrorsBranchTrue() {
        Parser parser = Parser.htmlParser();
        parser.setTrackErrors(3);
        assertTrue(parser.isTrackErrors());

        // Parse input with error tracking enabled (Boundary/Edge case with malformed HTML)
        Document doc = parser.parseInput("<html><head></head><body><p>Hello </p><div>Unclosed</div></body></html>", "http://example.com");
        assertNotNull(doc);
        assertNotNull(parser.getErrors());
    }

    @Test
    public void testStaticParseHtml() {
        String html = "<html><head><title>Test</title></head><body><p>Parsed HTML</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
        assertEquals("Test", doc.title());
        assertEquals("Parsed HTML", doc.body().text());
    }

    @Test
    public void testStaticParseFragment() {
        String fragment = "<span>Fragment</span>";
        Document contextDoc = Document.createShell("http://example.com");
        Element context = contextDoc.body();

        List<Node> nodes = Parser.parseFragment(fragment, context, "http://example.com");
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
        assertEquals("<span>Fragment</span>", nodes.get(0).outerHtml());
    }

    @Test
    public void testStaticParseBodyFragment() {
        String bodyHtml = "<div>Body Content</div>";
        Document doc = Parser.parseBodyFragment(bodyHtml, "http://example.com");
        assertNotNull(doc);
        assertEquals("Body Content", doc.body().child(0).text());
    }

    @Test
    public void testStaticParseBodyFragmentRelaxed() {
        String bodyHtml = "<p>Relaxed Body</p>";
        Document doc = Parser.parseBodyFragmentRelaxed(bodyHtml, "http://example.com");
        assertNotNull(doc);
        assertEquals("Relaxed Body", doc.body().text());
    }

    @Test
    public void testHtmlParserAndXmlParserBuilders() {
        Parser htmlParser = Parser.htmlParser();
        assertNotNull(htmlParser);
        assertTrue(htmlParser.getTreeBuilder() instanceof HtmlTreeBuilder);

        Parser xmlParser = Parser.xmlParser();
        assertNotNull(xmlParser);
        assertTrue(xmlParser.getTreeBuilder() instanceof XmlTreeBuilder);
    }

    @Test(expected = Exception.class)
    public void testParseInputWithNullHtml() {
        Parser parser = Parser.htmlParser();
        parser.parseInput(null, "http://example.com");
    }

    @Test
    public void testParseWithEmptyString() {
        Document doc = Parser.parse("", "http://example.com");
        assertNotNull(doc);
    }
}
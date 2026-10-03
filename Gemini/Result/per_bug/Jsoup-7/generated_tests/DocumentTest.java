package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.parser.Tag;

import java.nio.charset.Charset;

import static org.junit.Assert.*;

public class DocumentTest {

    @Test
    public void testCreateDocumentAndShell() {
        Document doc = new Document("http://example.com");
        assertEquals("http://example.com", doc.baseUri());
        assertEquals("#document", doc.nodeName());

        Document shell = Document.createShell("http://example.com/shell");
        assertNotNull(shell.head());
        assertNotNull(shell.body());
        assertNotNull(shell.findFirstElementByTagName("html", shell));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateShellNullBaseUri() {
        Document.createShell(null);
    }

    @Test
    public void testTitleOperations() {
        Document doc = Document.createShell("http://example.com");
        
        // Title when not set
        assertEquals("", doc.title());

        // Set title when not present (adds to head)
        doc.title("  A New Title  ");
        assertEquals("A New Title", doc.title());
        assertNotNull(doc.head().findFirstElementByTagName("title", doc.head()));

        // Update existing title
        doc.title("Updated Title");
        assertEquals("Updated Title", doc.title());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTitleNullValidation() {
        Document doc = new Document("http://example.com");
        doc.title(null);
    }

    @Test
    public void testCreateElement() {
        Document doc = new Document("http://example.com");
        Element div = doc.createElement("div");
        assertEquals("div", div.tagName());
        assertEquals("http://example.com", div.baseUri());
    }

    @Test
    public void testNormaliseMissingElementsAndTextNodes() {
        // Construct a messy document missing html/head/body and having loose text
        Document doc = new Document("http://example.com");
        doc.appendChild(new TextNode("Loose Root Text", ""));
        
        Element normaliseDoc = doc.normalise();
        assertNotNull(normaliseDoc.head());
        assertNotNull(normaliseDoc.body());
        
        // Check that non-blank text was moved to body
        assertTrue(normaliseDoc.body().text().contains("Loose Root Text"));
    }

    @Test
    public void testNormaliseBlankTextNodesIgnored() {
        Document doc = Document.createShell("http://example.com");
        doc.appendChild(new TextNode("   ", "")); // Blank text should be ignored
        
        doc.normalise();
        // Body should not contain the blank text node movement side-effects excessively
        assertFalse(doc.body().text().contains("   "));
    }

    @Test
    public void testTextMethodOverride() {
        Document doc = Document.createShell("http://example.com");
        doc.text("Body text content");
        assertEquals("Body text content", doc.body().text());
        assertEquals("Body text content", doc.text());
    }

    @Test
    public void testOuterHtml() {
        Document doc = Document.createShell("http://example.com");
        doc.body().text("Hello");
        String html = doc.outerHtml();
        assertTrue(html.contains("<html>"));
        assertTrue(html.contains("Hello"));
    }

    @Test
    public void testOutputSettingsConfiguration() {
        Document doc = new Document("http://example.com");
        Document.OutputSettings settings = doc.outputSettings();

        // EscapeMode
        settings.escapeMode(Entities.EscapeMode.extended);
        assertEquals(Entities.EscapeMode.extended, settings.escapeMode());

        // Charset by Charset object
        settings.charset(Charset.forName("ISO-8859-1"));
        assertEquals(Charset.forName("ISO-8859-1"), settings.charset());
        assertNotNull(settings.encoder());

        // Charset by String name
        settings.charset("US-ASCII");
        assertEquals(Charset.forName("US-ASCII"), settings.charset());

        // PrettyPrint
        settings.prettyPrint(false);
        assertFalse(settings.prettyPrint());

        // IndentAmount valid boundary (>= 0)
        settings.indentAmount(0);
        assertEquals(0, settings.indentAmount());
        
        settings.indentAmount(4);
        assertEquals(4, settings.indentAmount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIndentAmountInvalidBoundary() {
        Document doc = new Document("http://example.com");
        doc.outputSettings().indentAmount(-1);
    }
}
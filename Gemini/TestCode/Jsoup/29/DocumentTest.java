package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.parser.Tag;
import java.nio.charset.Charset;

import static org.junit.Assert.*;

public class DocumentTest {

    @Test
    public void testCreateShellAndBasicGetters() {
        Document doc = Document.createShell("http://example.com/");
        assertNotNull(doc);
        assertEquals("http://example.com/", doc.baseUri());
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        assertEquals("#document", doc.nodeName());
        assertEquals("", doc.title());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateShellNullBaseUri() {
        Document.createShell(null);
    }

    @Test
    public void testTitleHandling() {
        Document doc = new Document("http://example.com");
        
        // Title when not present
        assertEquals("", doc.title());

        // Set title when not present (should append to head)
        doc.title("  Test Title  ");
        assertEquals("Test Title", doc.title());
        assertNotNull(doc.head().getElementsByTag("title").first());

        // Update existing title
        doc.title("Updated Title");
        assertEquals("Updated Title", doc.title());
        assertEquals(1, doc.head().getElementsByTag("title").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNullTitle() {
        Document doc = new Document("http://example.com");
        doc.title(null);
    }

    @Test
    public void testCreateElement() {
        Document doc = new Document("http://example.com");
        Element el = doc.createElement("div");
        assertEquals("div", el.nodeName());
        assertEquals("http://example.com", el.baseUri());
    }

    @Test
    public void testNormaliseIncompleteDocument() {
        // Document missing html, head, body and containing loose text nodes
        Document doc = new Document("http://example.com");
        doc.appendChild(new TextNode("Loose Text", "http://example.com"));
        
        // Add duplicate head/body to test normaliseStructure
        Element extraHead = new Element(Tag.valueOf("head"), "http://example.com");
        extraHead.appendChild(new TextNode("Extra Head Text", ""));
        doc.appendChild(extraHead);

        Document normalised = doc.normalise();
        assertNotNull(normalised.head());
        assertNotNull(normalised.body());
        assertTrue(normalised.body().text().contains("Loose Text"));
    }

    @Test
    public void testNormaliseBlankTextNodesIgnored() {
        Document doc = Document.createShell("http://example.com");
        doc.appendChild(new TextNode("   ", "")); // Blank text node should be ignored
        doc.normalise();
        // Should not throw and blank text should not be moved to body
        assertEquals("", doc.body().text());
    }

    @Test
    public void testOuterHtmlAndText() {
        Document doc = Document.createShell("http://example.com");
        doc.text("Hello World");
        assertEquals("Hello World", doc.body().text());
        assertTrue(doc.outerHtml().contains("<html>"));
    }

    @Test
    public void testCloneAndOutputSettings() {
        Document doc = Document.createShell("http://example.com");
        doc.outputSettings().prettyPrint(false);
        doc.outputSettings().escapeMode(Entities.EscapeMode.extended);
        doc.outputSettings().charset("UTF-8");
        doc.outputSettings().indentAmount(4);
        doc.quirksMode(Document.QuirksMode.quirks);

        Document clone = doc.clone();
        assertNotSame(doc, clone);
        assertFalse(clone.outputSettings().prettyPrint());
        assertEquals(Entities.EscapeMode.extended, clone.outputSettings().escapeMode());
        assertEquals(Charset.forName("UTF-8"), clone.outputSettings().charset());
        assertEquals(4, clone.outputSettings().indentAmount());
        assertEquals(Document.QuirksMode.quirks, clone.quirksMode());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutputSettingsInvalidIndent() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.indentAmount(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNullOutputSettings() {
        Document doc = Document.createShell("http://example.com");
        doc.outputSettings(null);
    }
}
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

public class DocumentTest {

    @Test
    public void testConstructorAndNodeName() {
        Document doc = new Document("http://example.com");
        assertEquals("#document", doc.nodeName());
        assertEquals("http://example.com", doc.baseUri());
    }

    @Test
    public void testCreateShell() {
        Document doc = Document.createShell("http://example.com");
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        assertNotNull(doc.select("html").first());
        assertEquals("http://example.com", doc.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateShellNullBaseUri() {
        Document.createShell(null);
    }

    @Test
    public void testTitleEmpty() {
        Document doc = Document.createShell("http://example.com");
        assertEquals("", doc.title());
    }

    @Test
    public void testTitleSetAndGet() {
        Document doc = Document.createShell("http://example.com");
        doc.title("  Hello Jsoup  ");
        assertEquals("Hello Jsoup", doc.title());
        
        // Test updating existing title
        doc.title("Updated Title");
        assertEquals("Updated Title", doc.title());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTitleNull() {
        Document doc = Document.createShell("http://example.com");
        doc.title(null);
    }

    @Test
    public void testCreateElement() {
        Document doc = new Document("http://example.com");
        Element el = doc.createElement("div");
        assertEquals("div", el.tagName());
        assertEquals("http://example.com", el.baseUri());
    }

    @Test
    public void testNormaliseMissingStructure() {
        // Create an incomplete document to trigger missing html, head, body branches
        Document doc = new Document("http://example.com");
        // Remove default structures or build raw
        doc.normalise();
        
        assertNotNull(doc.select("html").first());
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

    @Test
    public void testNormaliseTextNodesMovement() {
        Document doc = Document.createShell("http://example.com");
        // Add text node directly to root or head to be normalised into body
        doc.head().appendChild(new TextNode("Move me", ""));
        doc.normalise();
        
        assertTrue(doc.head().getElementsByTag("title").isEmpty());
        // Verify text was moved to body
        assertTrue(doc.body().text().contains("Move me"));
    }

    @Test
    public void testOuterHtml() {
        Document doc = Document.createShell("http://example.com");
        doc.body().text("Test Body");
        String html = doc.outerHtml();
        assertTrue(html.contains("<body>Test Body</body>"));
    }

    @Test
    public void testDocumentText() {
        Document doc = Document.createShell("http://example.com");
        doc.text("Direct Body Text");
        assertEquals("Direct Body Text", doc.body().text());
    }
}
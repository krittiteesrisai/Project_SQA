package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for org.jsoup.nodes.Document (Defects4J Jsoup-1b)
 * ทดสอบเฉพาะ public/protected API ที่มีอยู่จริงในซอร์สโค้ดที่ให้มา
 */
public class DocumentTest {

    // ---------- Constructor ----------

    @Test
    public void testConstructor_basic() {
        Document doc = new Document("http://example.com/");
        assertEquals("#document", doc.nodeName());
        assertEquals("http://example.com/", doc.baseUri());
        assertEquals("#root", doc.tagName());
    }

    // ---------- createShell ----------

    @Test
    public void testCreateShell_validBaseUri() {
        Document doc = Document.createShell("http://example.com/");
        assertNotNull(doc);
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        assertEquals("html", doc.child(0).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateShell_nullBaseUri_throws() {
        // Validate.notNull(baseUri) -> IllegalArgumentException
        Document.createShell(null);
    }

    // ---------- head() ----------

    @Test
    public void testHead_whenPresent() {
        Document doc = Document.createShell("http://example.com/");
        assertNotNull(doc.head());
        assertEquals("head", doc.head().tagName());
    }

    @Test
    public void testHead_whenAbsent_returnsNull() {
        Document doc = new Document("http://example.com/");
        assertNull(doc.head());
    }

    // ---------- body() ----------

    @Test
    public void testBody_whenPresent() {
        Document doc = Document.createShell("http://example.com/");
        assertNotNull(doc.body());
        assertEquals("body", doc.body().tagName());
    }

    @Test
    public void testBody_whenAbsent_returnsNull() {
        Document doc = new Document("http://example.com/");
        assertNull(doc.body());
    }

    // ---------- title() getter ----------

    @Test
    public void testTitleGet_noTitleElement_returnsEmptyString() {
        Document doc = Document.createShell("http://example.com/");
        assertEquals("", doc.title());
    }

    @Test
    public void testTitleGet_withTitleElement_returnsTrimmedText() {
        Document doc = Document.createShell("http://example.com/");
        doc.head().appendElement("title").text("  Hello World  ");
        assertEquals("Hello World", doc.title());
    }

    @Test
    public void testTitleGet_withWhitespaceOnlyTitle_returnsEmptyAfterTrim() {
        Document doc = Document.createShell("http://example.com/");
        doc.head().appendElement("title").text("   ");
        assertEquals("", doc.title());
    }

    // ---------- title(String) setter ----------

    @Test(expected = IllegalArgumentException.class)
    public void testTitleSet_nullTitle_throws() {
        Document doc = Document.createShell("http://example.com/");
        doc.title(null);
    }

    @Test
    public void testTitleSet_noExistingTitleElement_addsToHead() {
        Document doc = Document.createShell("http://example.com/");
        doc.title("New Title");
        assertEquals("New Title", doc.title());
        assertNotNull(doc.head().getElementsByTag("title").first());
    }

    @Test
    public void testTitleSet_existingTitleElement_updatesInPlace() {
        Document doc = Document.createShell("http://example.com/");
        doc.head().appendElement("title").text("Old Title");
        doc.title("Updated Title");
        assertEquals("Updated Title", doc.title());
        // ต้องมี title เดียวเท่านั้น (ไม่ duplicate)
        assertEquals(1, doc.getElementsByTag("title").size());
    }

    @Test
    public void testTitleSet_emptyStringTitle_boundary() {
        Document doc = Document.createShell("http://example.com/");
        doc.title("");
        assertEquals("", doc.title());
    }

    @Test(expected = NullPointerException.class)
    public void testTitleSet_whenHeadMissing_throwsNPE() {
        // ตามโค้ด: ถ้า titleEl == null และ head() == null
        // จะเรียก head().appendElement(...) -> NullPointerException
        // (วิเคราะห์ตรงจากซอร์ส ไม่ใช่การเดา behavior)
        Document doc = new Document("http://example.com/");
        doc.title("Any Title");
    }

    // ---------- createElement ----------

    @Test
    public void testCreateElement_returnsDetachedElementWithBaseUri() {
        Document doc = new Document("http://example.com/");
        Element el = doc.createElement("div");
        assertEquals("div", el.tagName());
        assertEquals("http://example.com/", el.baseUri());
        // ไม่ถูกผูกเป็น child ของ document
        assertEquals(0, doc.children().size());
    }

    // ---------- normalise() ----------

    @Test
    public void testNormalise_addsHtmlIfMissing() {
        Document doc = new Document("http://example.com/");
        assertTrue(doc.select("html").isEmpty());
        doc.normalise();
        assertFalse(doc.select("html").isEmpty());
    }

    @Test
    public void testNormalise_addsHeadIfMissing() {
        Document doc = new Document("http://example.com/");
        doc.appendElement("html"); // มี html แต่ไม่มี head/body
        doc.normalise();
        assertNotNull(doc.head());
    }

    @Test
    public void testNormalise_addsBodyIfMissing() {
        Document doc = new Document("http://example.com/");
        doc.appendElement("html");
        doc.normalise();
        assertNotNull(doc.body());
    }

    @Test
    public void testNormalise_alreadyWellFormed_noDuplication() {
        Document doc = Document.createShell("http://example.com/");
        doc.normalise();
        assertEquals(1, doc.select("html").size());
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

    @Test
    public void testNormalise_movesStrayTextFromRootToBody() {
        Document doc = new Document("http://example.com/");
        doc.appendChild(new TextNode("stray text", ""));
        doc.normalise();
        assertTrue(doc.body().text().contains("stray text"));
    }

    @Test
    public void testNormalise_blankTextNodeNotMoved() {
        Document doc = new Document("http://example.com/");
        doc.appendChild(new TextNode("   ", ""));
        doc.normalise();
        assertEquals("", doc.body().text());
    }

    @Test
    public void testNormalise_mixedBlankAndNonBlankTextNodes() {
        Document doc = new Document("http://example.com/");
        doc.appendChild(new TextNode("   ", ""));     // blank -> ไม่ย้าย
        doc.appendChild(new TextNode("content", "")); // ไม่ blank -> ย้าย
        doc.normalise();
        assertTrue(doc.body().text().contains("content"));
    }

    @Test
    public void testNormalise_multipleStrayTextNodes_loopCoverage() {
        Document doc = new Document("http://example.com/");
        doc.appendChild(new TextNode("first", ""));
        doc.appendChild(new TextNode("second", ""));
        doc.normalise();
        String bodyText = doc.body().text();
        assertTrue(bodyText.contains("first"));
        assertTrue(bodyText.contains("second"));
    }

    @Test
    public void testNormalise_movesTextFromHeadToBody() {
        Document doc = Document.createShell("http://example.com/");
        doc.head().appendChild(new TextNode("stray head text", ""));
        doc.normalise();
        assertTrue(doc.body().text().contains("stray head text"));
    }

    @Test
    public void testNormalise_movesTextFromHtmlToBody() {
        Document doc = Document.createShell("http://example.com/");
        Element html = doc.select("html").first();
        html.appendChild(new TextNode("stray html text", ""));
        doc.normalise();
        assertTrue(doc.body().text().contains("stray html text"));
    }

    // ---------- outerHtml ----------

    @Test
    public void testOuterHtml_noRootWrapperTag() {
        Document doc = Document.createShell("http://example.com/");
        String outer = doc.outerHtml();
        assertFalse(outer.contains("#root"));
        assertTrue(outer.contains("<html>"));
    }

    // ---------- text(String) override ----------

    @Test
    public void testTextSet_setsBodyTextAndReturnsSelf() {
        Document doc = Document.createShell("http://example.com/");
        Element returned = doc.text("Hello Body");
        assertSame(doc, returned);
        assertEquals("Hello Body", doc.body().text());
    }

    // ---------- nodeName ----------

    @Test
    public void testNodeName_returnsDocumentConstant() {
        Document doc = new Document("http://example.com/");
        assertEquals("#document", doc.nodeName());
    }
}

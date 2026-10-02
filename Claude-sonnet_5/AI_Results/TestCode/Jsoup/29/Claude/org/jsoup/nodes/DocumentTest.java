package org.jsoup.nodes;

import org.junit.Test;
import java.nio.charset.Charset;

import static org.junit.Assert.*;

/**
 * Unit tests for org.jsoup.nodes.Document (Defects4J: Jsoup-29b)
 *
 * วางไว้ใน package เดียวกับคลาสเป้าหมาย (org.jsoup.nodes) เพื่อเข้าถึง
 * สมาชิกระดับ package-private บางตัว เช่น OutputSettings.encoder()
 */
public class DocumentTest {

    private static final String BASE_URI = "http://example.com/";

    // ---------- Constructor / createShell ----------

    @Test
    public void testConstructor_CreatesRootNode() {
        Document doc = new Document(BASE_URI);
        assertEquals("#document", doc.nodeName());
        assertEquals(BASE_URI, doc.baseUri());
    }

    @Test
    public void testCreateShell_ValidBaseUri() {
        Document doc = Document.createShell(BASE_URI);
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        assertEquals("html", doc.child(0).tagName());
    }

    // สมมติฐาน: Validate.notNull throws IllegalArgumentException เมื่อ obj == null
    @Test(expected = IllegalArgumentException.class)
    public void testCreateShell_NullBaseUri_Throws() {
        Document.createShell(null);
    }

    // ---------- head() / body() ----------

    @Test
    public void testHead_ReturnsNull_WhenNoHeadElement() {
        Document doc = new Document(BASE_URI);
        assertNull(doc.head());
    }

    @Test
    public void testHead_FindsNestedHeadElement_Recursively() {
        Document doc = new Document(BASE_URI);
        Element html = doc.appendElement("html");
        Element wrapper = html.appendElement("div");
        Element head = wrapper.appendElement("head");
        assertSame(head, doc.head());
    }

    @Test
    public void testBody_ReturnsNull_WhenNoBodyElement() {
        Document doc = new Document(BASE_URI);
        assertNull(doc.body());
    }

    @Test
    public void testBody_FoundAfterShellCreated() {
        Document doc = Document.createShell(BASE_URI);
        assertNotNull(doc.body());
        assertEquals("body", doc.body().tagName());
    }

    // ---------- title() getter ----------

    @Test
    public void testTitle_EmptyString_WhenNoTitleElement() {
        Document doc = Document.createShell(BASE_URI);
        assertEquals("", doc.title());
    }

    @Test
    public void testTitle_ReturnsTrimmedText_WhenTitleExists() {
        Document doc = Document.createShell(BASE_URI);
        doc.head().appendElement("title").text("  Hello World  ");
        assertEquals("Hello World", doc.title());
    }

    // ---------- title(String) setter ----------

    @Test(expected = IllegalArgumentException.class)
    public void testTitleSetter_NullThrows() {
        Document doc = Document.createShell(BASE_URI);
        doc.title(null);
    }

    @Test
    public void testTitleSetter_AddsNewTitle_WhenNotPresent() {
        Document doc = Document.createShell(BASE_URI);
        assertNull(doc.getElementsByTag("title").first());
        doc.title("My Title");
        assertEquals("My Title", doc.title());
        assertNotNull(doc.getElementsByTag("title").first());
    }

    @Test
    public void testTitleSetter_UpdatesExistingTitle() {
        Document doc = Document.createShell(BASE_URI);
        doc.title("First");
        doc.title("Second");
        assertEquals("Second", doc.title());
        assertEquals(1, doc.getElementsByTag("title").size());
    }

    // ---------- createElement ----------

    @Test
    public void testCreateElement_UsesDocumentBaseUri() {
        Document doc = new Document(BASE_URI);
        Element el = doc.createElement("div");
        assertEquals("div", el.tagName());
        assertEquals(BASE_URI, el.baseUri());
        assertNull(el.parent()); // ยังไม่ถูกผูกเข้ากับ document
    }

    // ---------- normalise() ----------

    @Test
    public void testNormalise_CreatesHtmlHeadBody_WhenAllMissing() {
        Document doc = new Document(BASE_URI);
        doc.normalise();
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        assertEquals(1, doc.getElementsByTag("html").size());
    }

    @Test
    public void testNormalise_CreatesHeadOnly_WhenHtmlExistsButHeadMissing() {
        Document doc = new Document(BASE_URI);
        doc.appendElement("html"); // html มีอยู่แล้ว, head/body ยังไม่มี
        doc.normalise();
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

    @Test
    public void testNormalise_MovesNonBlankTextNodes_IntoBody() {
        Document doc = Document.createShell(BASE_URI);
        doc.appendChild(new TextNode("Loose Text", BASE_URI));
        doc.normalise();
        assertTrue(doc.body().text().contains("Loose Text"));
    }

    @Test
    public void testNormalise_DoesNotMoveBlankTextNodes() {
        Document doc = Document.createShell(BASE_URI);
        doc.appendChild(new TextNode("   ", BASE_URI)); // blank text node
        doc.normalise();
        assertEquals("", doc.body().text());
    }

    @Test
    public void testNormalise_MergesDuplicateHeadElements() {
        Document doc = Document.createShell(BASE_URI);
        Element html = doc.child(0);
        Element extraHead = html.appendElement("head");
        extraHead.appendElement("meta");
        assertEquals(2, doc.getElementsByTag("head").size());

        doc.normalise();

        assertEquals(1, doc.getElementsByTag("head").size());
        assertNotNull(doc.getElementsByTag("meta").first());
    }

    @Test
    public void testNormalise_MergesDuplicateBodyElements() {
        Document doc = Document.createShell(BASE_URI);
        Element html = doc.child(0);
        Element extraBody = html.appendElement("body");
        extraBody.appendElement("p").text("dup content");
        assertEquals(2, doc.getElementsByTag("body").size());

        doc.normalise();

        assertEquals(1, doc.getElementsByTag("body").size());
        assertTrue(doc.body().text().contains("dup content"));
    }

    @Test
    public void testNormalise_ReparentsHead_WhenNotChildOfHtml() {
        Document doc = new Document(BASE_URI);
        Element html = doc.appendElement("html");
        doc.appendElement("head"); // sibling ของ html ไม่ใช่ลูก
        doc.normalise();
        assertSame(html, doc.head().parent());
    }

    @Test
    public void testNormalise_ReparentsBody_WhenNotChildOfHtml() {
        Document doc = new Document(BASE_URI);
        Element html = doc.appendElement("html");
        doc.appendElement("body"); // sibling ของ html ไม่ใช่ลูก
        doc.normalise();
        assertSame(html, doc.body().parent());
    }

    // ---------- outerHtml() ----------

    @Test
    public void testOuterHtml_NoOuterWrapperTag() {
        Document doc = Document.createShell(BASE_URI);
        String html = doc.outerHtml();
        assertTrue(html.contains("<html>"));
        assertTrue(html.contains("<head>"));
        assertTrue(html.contains("<body>"));
    }

    // ---------- text(String) ----------

    @Test
    public void testTextSetter_SetsBodyText_PreservesStructure() {
        Document doc = Document.createShell(BASE_URI);
        doc.text("Hello Body");
        assertEquals("Hello Body", doc.body().text());
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

    // ---------- nodeName() ----------

    @Test
    public void testNodeName() {
        Document doc = new Document(BASE_URI);
        assertEquals("#document", doc.nodeName());
    }

    // ---------- clone() ----------

    @Test
    public void testClone_ReturnsDocumentInstance_NotSameReference() {
        Document doc = Document.createShell(BASE_URI);
        Document clone = doc.clone();
        assertNotSame(doc, clone);
        assertTrue(clone instanceof Document);
    }

    @Test
    public void testClone_DeepCopiesOutputSettings() {
        Document doc = Document.createShell(BASE_URI);
        doc.outputSettings().charset("ISO-8859-1");
        Document clone = doc.clone();

        assertNotSame(doc.outputSettings(), clone.outputSettings());
        assertEquals(doc.outputSettings().charset(), clone.outputSettings().charset());

        clone.outputSettings().charset("UTF-8");
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
        assertEquals("UTF-8", clone.outputSettings().charset().name());
    }

    // ================= OutputSettings =================

    @Test
    public void testOutputSettings_Defaults() {
        Document.OutputSettings os = new Document.OutputSettings();
        assertEquals(Entities.EscapeMode.base, os.escapeMode());
        assertEquals(Charset.forName("UTF-8"), os.charset());
        assertTrue(os.prettyPrint());
        assertEquals(1, os.indentAmount());
    }

    @Test
    public void testOutputSettings_EscapeModeSetterGetter() {
        Document.OutputSettings os = new Document.OutputSettings();
        Document.OutputSettings returned = os.escapeMode(Entities.EscapeMode.extended);
        assertEquals(Entities.EscapeMode.extended, os.escapeMode());
        assertSame(os, returned);
    }

    @Test
    public void testOutputSettings_CharsetSetterGetter_ViaCharsetObject() {
        Document.OutputSettings os = new Document.OutputSettings();
        Charset iso = Charset.forName("ISO-8859-1");
        Document.OutputSettings returned = os.charset(iso);
        assertEquals(iso, os.charset());
        assertSame(os, returned);
        // package-private method ทดสอบได้เพราะอยู่ package เดียวกัน
        assertEquals(iso, os.encoder().charset());
    }

    @Test
    public void testOutputSettings_CharsetSetterGetter_ViaString() {
        Document.OutputSettings os = new Document.OutputSettings();
        Document.OutputSettings returned = os.charset("ISO-8859-1");
        assertEquals("ISO-8859-1", os.charset().name());
        assertSame(os, returned);
    }

    @Test
    public void testOutputSettings_PrettyPrintSetterGetter() {
        Document.OutputSettings os = new Document.OutputSettings();
        assertTrue(os.prettyPrint());
        Document.OutputSettings returned = os.prettyPrint(false);
        assertFalse(os.prettyPrint());
        assertSame(os, returned);
    }

    @Test
    public void testOutputSettings_IndentAmountSetterGetter_Valid() {
        Document.OutputSettings os = new Document.OutputSettings();
        Document.OutputSettings returned = os.indentAmount(4);
        assertEquals(4, os.indentAmount());
        assertSame(os, returned);
    }

    @Test
    public void testOutputSettings_IndentAmountSetter_ZeroIsValid() {
        // ค่าขอบเขต: indentAmount == 0 ต้องผ่าน (>= 0)
        Document.OutputSettings os = new Document.OutputSettings();
        os.indentAmount(0);
        assertEquals(0, os.indentAmount());
    }

    // สมมติฐาน: Validate.isTrue throws IllegalArgumentException เมื่อเงื่อนไขเป็น false
    @Test(expected = IllegalArgumentException.class)
    public void testOutputSettings_IndentAmountSetter_NegativeThrows() {
        Document.OutputSettings os = new Document.OutputSettings();
        os.indentAmount(-1);
    }

    @Test
    public void testOutputSettings_Clone_IsIndependentCopy() {
        Document.OutputSettings os = new Document.OutputSettings();
        os.charset("ISO-8859-1");
        os.escapeMode(Entities.EscapeMode.extended);
        os.prettyPrint(false);
        os.indentAmount(5);

        Document.OutputSettings clone = os.clone();

        assertNotSame(os, clone);
        assertEquals(os.charset(), clone.charset());
        assertEquals(os.escapeMode(), clone.escapeMode());
        assertEquals(os.prettyPrint(), clone.prettyPrint());
        assertEquals(os.indentAmount(), clone.indentAmount());

        clone.charset("UTF-8");
        clone.escapeMode(Entities.EscapeMode.base);
        assertEquals("ISO-8859-1", os.charset().name());
        assertEquals(Entities.EscapeMode.extended, os.escapeMode());
    }

    // ---------- Document.outputSettings() / outputSettings(OutputSettings) ----------

    @Test
    public void testDocumentOutputSettings_DefaultNotNull() {
        Document doc = new Document(BASE_URI);
        assertNotNull(doc.outputSettings());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDocumentOutputSettings_SetterNullThrows() {
        Document doc = new Document(BASE_URI);
        doc.outputSettings(null);
    }

    @Test
    public void testDocumentOutputSettings_SetterGetter() {
        Document doc = new Document(BASE_URI);
        Document.OutputSettings newSettings = new Document.OutputSettings();
        newSettings.prettyPrint(false);
        Document returned = doc.outputSettings(newSettings);
        assertSame(newSettings, doc.outputSettings());
        assertSame(doc, returned);
    }

    // ---------- quirksMode() / quirksMode(QuirksMode) ----------

    @Test
    public void testQuirksMode_DefaultIsNoQuirks() {
        Document doc = new Document(BASE_URI);
        assertEquals(Document.QuirksMode.noQuirks, doc.quirksMode());
    }

    @Test
    public void testQuirksMode_SetterGetter_Quirks() {
        Document doc = new Document(BASE_URI);
        Document returned = doc.quirksMode(Document.QuirksMode.quirks);
        assertEquals(Document.QuirksMode.quirks, doc.quirksMode());
        assertSame(doc, returned);
    }

    @Test
    public void testQuirksMode_SetterGetter_LimitedQuirks() {
        Document doc = new Document(BASE_URI);
        doc.quirksMode(Document.QuirksMode.limitedQuirks);
        assertEquals(Document.QuirksMode.limitedQuirks, doc.quirksMode());
    }
}

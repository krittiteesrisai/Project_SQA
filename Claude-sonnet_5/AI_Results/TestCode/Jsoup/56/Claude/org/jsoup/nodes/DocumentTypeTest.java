package org.jsoup.nodes;

import static org.junit.Assert.*;
import org.junit.Test;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Document.OutputSettings.Syntax;

public class DocumentTypeTest {

    // --- Helper methods to build OutputSettings for different syntax ---
    // Assumption: OutputSettings has public no-arg constructor + syntax(Syntax) setter + syntax() getter.
    private OutputSettings htmlSettings() {
        OutputSettings os = new OutputSettings();
        os.syntax(Syntax.html);
        return os;
    }

    private OutputSettings xmlSettings() {
        OutputSettings os = new OutputSettings();
        os.syntax(Syntax.xml);
        return os;
    }

    // ---------- nodeName() ----------
    @Test
    public void testNodeName() {
        DocumentType dt = new DocumentType("html", "", "", "");
        assertEquals("#doctype", dt.nodeName());
    }

    // ---------- Static constants ----------
    @Test
    public void testStaticConstants() {
        assertEquals("PUBLIC", DocumentType.PUBLIC_KEY);
        assertEquals("SYSTEM", DocumentType.SYSTEM_KEY);
    }

    // ---------- Constructor sets attributes correctly ----------
    @Test
    public void testConstructorSetsAttributes() {
        // Assumption: Node.attr(String) getter and baseUri() exist as public API.
        DocumentType dt = new DocumentType("html", "pub", "sys", "base");
        assertEquals("html", dt.attr("name"));
        assertEquals("pub", dt.attr("publicId"));
        assertEquals("sys", dt.attr("systemId"));
        assertEquals("base", dt.baseUri());
    }

    // ---------- Branch: html syntax + no publicId + no systemId + has name -> lowercase doctype ----------
    @Test
    public void testOuterHtmlHead_HtmlSyntax_NoPublicNoSystem_WithName() throws Exception {
        DocumentType dt = new DocumentType("html", "", "", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, htmlSettings());
        String result = sb.toString();
        assertEquals("<!doctype html>", result);
    }

    // ---------- Branch: name blank (empty) -> no name segment appended ----------
    @Test
    public void testOuterHtmlHead_HtmlSyntax_NoPublicNoSystem_NoName() throws Exception {
        DocumentType dt = new DocumentType("", "", "", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, htmlSettings());
        String result = sb.toString();
        assertEquals("<!doctype>", result);
    }

    // ---------- Boundary: name = null (uncertain underlying Attributes behavior) ----------
    @Test
    public void testOuterHtmlHead_NullName() throws Exception {
        // NOTE: Assuming attr() accepts null and treats it as blank/absent (similar to empty string).
        // If underlying Attributes/Attribute implementation throws NPE on null value,
        // this test's expected behavior is uncertain and documented here as an assumption.
        DocumentType dt = new DocumentType(null, null, null, "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, htmlSettings());
        String result = sb.toString();
        assertEquals("<!doctype>", result);
    }

    // ---------- Branch: has(PUBLIC_ID)=true -> breaks lowercase condition, uses uppercase DOCTYPE ----------
    @Test
    public void testOuterHtmlHead_HtmlSyntax_WithPublicId() throws Exception {
        DocumentType dt = new DocumentType("html", "-//W3C//DTD XHTML 1.0 Strict//EN", "", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, htmlSettings());
        String result = sb.toString();
        assertTrue(result.startsWith("<!DOCTYPE"));
        assertTrue(result.contains("PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\""));
        assertFalse(result.contains("\" \""));
    }

    // ---------- Branch: has(SYSTEM_ID)=true -> breaks lowercase condition, uses uppercase DOCTYPE ----------
    @Test
    public void testOuterHtmlHead_HtmlSyntax_WithSystemId() throws Exception {
        DocumentType dt = new DocumentType("html", "",
                "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, htmlSettings());
        String result = sb.toString();
        assertTrue(result.startsWith("<!DOCTYPE"));
        assertFalse(result.contains("PUBLIC"));
        assertTrue(result.contains("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\""));
    }

    // ---------- Branch: both publicId and systemId present ----------
    @Test
    public void testOuterHtmlHead_HtmlSyntax_WithPublicAndSystem() throws Exception {
        DocumentType dt = new DocumentType("html",
                "-//W3C//DTD XHTML 1.0 Strict//EN",
                "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd",
                "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, htmlSettings());
        String result = sb.toString();
        assertEquals(
            "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">",
            result);
    }

    // ---------- Branch: syntax == xml -> always uppercase DOCTYPE even without publicId/systemId ----------
    @Test
    public void testOuterHtmlHead_XmlSyntax_NoPublicNoSystem() throws Exception {
        DocumentType dt = new DocumentType("html", "", "", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, xmlSettings());
        String result = sb.toString();
        assertEquals("<!DOCTYPE html>", result);
    }

    // ---------- Branch: xml syntax with publicId & systemId ----------
    @Test
    public void testOuterHtmlHead_XmlSyntax_WithPublicAndSystem() throws Exception {
        DocumentType dt = new DocumentType("html", "pub", "sys", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, xmlSettings());
        String result = sb.toString();
        assertEquals("<!DOCTYPE html PUBLIC \"pub\" \"sys\">", result);
    }

    // ---------- Boundary: whitespace-only values are treated as blank by StringUtil.isBlank ----------
    @Test
    public void testOuterHtmlHead_WhitespaceOnlyValues() throws Exception {
        DocumentType dt = new DocumentType("   ", "   ", "   ", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, htmlSettings());
        String result = sb.toString();
        // All blank -> lowercase doctype, no name/public/system segments appended
        assertEquals("<!doctype>", result);
    }

    // ---------- outerHtmlTail should produce no output and not throw ----------
    @Test
    public void testOuterHtmlTail_NoOutput() throws Exception {
        DocumentType dt = new DocumentType("html", "", "", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlTail(sb, 0, htmlSettings());
        assertEquals("", sb.toString());
    }

    // ---------- Independent branch: has(NAME)=false while has(PUBLIC_ID)=true ----------
    @Test
    public void testOuterHtmlHead_NoName_WithPublicId() throws Exception {
        DocumentType dt = new DocumentType("", "pubid", "", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, htmlSettings());
        String result = sb.toString();
        assertEquals("<!DOCTYPE PUBLIC \"pubid\">", result);
    }

    // ---------- Malformed input: publicId containing embedded double-quote (no escaping in source) ----------
    @Test
    public void testOuterHtmlHead_PublicIdWithQuoteCharacter() throws Exception {
        // Documents current actual (unescaped) behavior of outerHtmlHead; not a guess,
        // directly derived from source which performs no escaping on attr values.
        DocumentType dt = new DocumentType("html", "pub\"id", "", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, htmlSettings());
        String result = sb.toString();
        assertTrue(result.contains("PUBLIC \"pub\"id\""));
    }

    // ---------- Only systemId blank among all three, with publicId present and name present ----------
    @Test
    public void testOuterHtmlHead_NameAndPublicId_NoSystemId() throws Exception {
        DocumentType dt = new DocumentType("html", "pubid", "", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, htmlSettings());
        String result = sb.toString();
        assertEquals("<!DOCTYPE html PUBLIC \"pubid\">", result);
    }
}

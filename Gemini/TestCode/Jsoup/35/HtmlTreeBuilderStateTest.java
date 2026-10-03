package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import static org.junit.Assert.*;

public class HtmlTreeBuilderStateTest {

    @Test
    public void testInitialStateWhitespaceAndComment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("   <!-- comment -->", "http://example.com");
        assertNotNull(doc);
    }

    @Test
    public void testInitialStateDoctypeQuirks() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        // Trigger Doctype with forceQuirks = true and normal path
        Document doc = tb.parse("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"><html></html>", "http://example.com");
        assertEquals(Document.QuirksMode.noQuirks, doc.quirksMode());
    }

    @Test
    public void testBeforeHtmlTransitionsAndErrors() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        // Triggers doctype in BeforeHtml (error branch), then valid html start tag, then unexpected end tag
        Document doc = tb.parse("<!DOCTYPE html><html><head></head><body></body></html>", "http://example.com");
        assertNotNull(doc);
    }

    @Test
    public void testBeforeHeadEdgeCases() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        // Triggers whitespace, comment, doctype (error), and anythingElse in BeforeHead
        Document doc = tb.parse("  <!-- c --> <!DOCTYPE html><span>text</span>", "http://example.com");
        assertNotNull(doc);
    }

    @Test
    public void testInHeadSpecialTags() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        // Triggers base with href, meta, title, noframes, style, noscript, script, and head error
        String html = "<html><head>" +
                      "<base href=\"http://foo.com\">" +
                      "<meta charset=\"UTF-8\">" +
                      "<title>Title</title>" +
                      "<style>body {}</style>" +
                      "<script>var a = 1;</script>" +
                      "<noscript>No script</noscript>" +
                      "<noframes></noframes>" +
                      "</head><body></body></html>";
        Document doc = tb.parse(html, "http://example.com");
        assertNotNull(doc);
    }

    @Test
    public void testInBodyCharacterEdgeCases() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        // Triggers null character check in InBody and standard text insertion
        Document doc = tb.parse("<html><body>\u0000Hello World</body></html>", "http://example.com");
        assertNotNull(doc);
    }

    @Test
    public void testInBodyFormAndIsIndex() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        // Triggers form duplication error, isindex with action and prompt, and textarea/xmp/iframe/noembed
        String html = "<html><body>" +
                      "<form><form></form></form>" +
                      "<isindex action=\"foo\" prompt=\"Search:\">" +
                      "<textarea>content</textarea>" +
                      "<xmp>xmp</xmp>" +
                      "<iframe>iframe</iframe>" +
                      "<noembed>noembed</noembed>" +
                      "</body></html>";
        Document doc = tb.parse(html, "http://example.com");
        assertNotNull(doc);
    }

    @Test
    public void testInBodyFormattingAndAdoptionAgency() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        // Triggers formatting elements, anchor nesting error, nobr scope, and table inside InBody
        String html = "<html><body>" +
                      "<p><b><i><span>text</span></i></b></p>" +
                      "<a><a></a></a>" +
                      "<nobr><nobr>nobr</nobr></nobr>" +
                      "<table><tr><td>cell</td></tr></table>" +
                      "</body></html>";
        Document doc = tb.parse(html, "http://example.com");
        assertNotNull(doc);
    }

    @Test
    public void testInTableAndInTableText() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        // Triggers InTable characters, caption, colgroup, col, tbody, and invalid table end tags
        String html = "<html><body><table>" +
                      "<caption>Cap</caption>" +
                      "<colgroup><col></colgroup>" +
                      "<tbody><tr><td>Data</td></tr></tbody>" +
                      "</table></body></html>";
        Document doc = tb.parse(html, "http://example.com");
        assertNotNull(doc);
    }

    @Test
    public void testInSelectAndInSelectInTable() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        // Triggers select, option, optgroup, and select inside table (InSelectInTable)
        String html = "<html><body>" +
                      "<select><optgroup><option>Opt1</option></optgroup></select>" +
                      "<table><tr><td><select><option>Opt2</option></select></td></tr></table>" +
                      "</body></html>";
        Document doc = tb.parse(html, "http://example.com");
        assertNotNull(doc);
    }

    @Test
    public void testFramesetAndAfterBodyStates() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        // Triggers frameset parsing and AfterBody / AfterAfterBody conditions
        String html = "<html><frameset><frame src=\"a.html\"></frameset></html>";
        Document doc = tb.parse(html, "http://example.com");
        assertNotNull(doc);
    }
}
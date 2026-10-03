package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class HtmlTreeBuilderStateTest {

    @Test
    public void testInitialStateWithDoctypeAndQuirks() {
        // Trigger Initial state: Doctype with force quirks, comments, whitespace, and regular tags
        String html = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> <!-- comment -->   <html><head></head><body></body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);
        assertEquals(Document.QuirksMode.quirks, doc.quirksMode());
    }

    @Test
    public void testInitialStateStandardDoctype() {
        // Trigger Initial state: Standard doctype without quirks
        String html = "<!DOCTYPE html><html><head></head><body></body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);
        assertEquals(Document.QuirksMode.noQuirks, doc.quirksMode());
    }

    @Test
    public void testBeforeHtmlEdgeCases() {
        // Trigger BeforeHtml state branches: unexpected doctype, end tags, comments, and non-html start tags
        String html = "<!DOCTYPE html><p>Hello World</p>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc.body().getElementsByTag("p").first());
    }

    @Test
    public void testBeforeHeadEdgeCases() {
        // Trigger BeforeHead state branches: html start tag, comments, whitespace, invalid end tags
        String html = "<html>   <!-- c --> <body></body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);
    }

    @Test
    public void testInHeadVariousElements() {
        // Trigger InHead branches: base, meta, title, style, noframes, noscript, script, invalid head end tag
        String html = "<html><head>" +
                      "<base href=\"http://example.com/\">" +
                      "<meta charset=\"UTF-8\">" +
                      "<title>Test Title</title>" +
                      "<style>body { color: red; }</style>" +
                      "<noframes>Frames required</noframes>" +
                      "<noscript>No script</noscript>" +
                      "<script>var x = 1;</script>" +
                      "</head><body></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals("Test Title", doc.title());
        assertNotNull(doc.select("base").first());
    }

    @Test
    public void testInBodyFormattingAndAdoptionAgency() {
        // Trigger InBody branches: formatting elements, paragraph closers, list items, anchor nesting edge cases
        String html = "<html><body><p><b><i><span>Test Span</span></i></b><a href=\"#\">Link1</a><a href=\"#\">Link2</a></p><ul><li>Item 1</li><li>Item 2</li></ul></body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc.body());
    }

    @Test
    public void testInBodyFormAndTableHandling() {
        // Trigger InBody branches: form element uniqueness check, table insertion, hr, image, isindex
        String html = "<html><body><form action=\"sub\"><input type=\"text\" name=\"t\"></form><table><tr><td>Cell</td></tr></table><hr><image></image></body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc.select("form").first());
        assertNotNull(doc.select("table").first());
    }

    @Test
    public void testInBodyTextareaAndSelect() {
        // Trigger InBody branches: textarea, select, optgroup, option handling
        String html = "<html><body><textarea>Some text</textarea><select><optgroup label=\"G1\"><option value=\"1\">Opt 1</option></optgroup></select></body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc.select("textarea").first());
        assertNotNull(doc.select("select").first());
    }

    @Test
    public void testInTableAndInCell() {
        // Trigger InTable, InCell, InTableText branches: whitespace text inside tables, captions, colgroups
        String html = "<html><body><table><caption>Cap</caption><colgroup><col></colgroup><thead><tr><th>Header</th></tr></thead><tbody><tr><td>Data</td></tr></tbody></table></body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc.select("table").first());
        assertNotNull(doc.select("caption").first());
    }

    @Test
    public void testInFramesetAndAfterBody() {
        // Trigger InFrameset and AfterBody states
        String html = "<html><frameset><frame src=\"a.html\"></frameset></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);
    }

    @Test
    public void testNullCharacterHandling() {
        // Trigger Edge Case: Null character handling in tokens
        String html = "<html><body>\u0000Text with null</body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);
    }
}
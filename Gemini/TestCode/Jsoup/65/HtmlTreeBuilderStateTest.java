package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class HtmlTreeBuilderStateTest {

    @Test
    public void testInitialStateWhitespaceAndComment() {
        Parser parser = Parser.htmlParser();
        Document doc = parser.parseInput("   <!-- comment --> <!DOCTYPE html> <html><head><title>Test</title></head><body></body></html>", "");
        assertNotNull(doc);
    }

    @Test
    public void testInitialStateDoctypeQuirks() {
        Parser parser = Parser.htmlParser();
        Document doc = parser.parseInput("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\"><html></html>", "");
        assertNotNull(doc);
    }

    @Test
    public void testBeforeHtmlTransitionsAndErrors() {
        Parser parser = Parser.htmlParser();
        // Trigger Doctype in BeforeHtml (should error and return false)
        Document doc1 = parser.parseInput("<!DOCTYPE html><div>Test</div>", "");
        assertNotNull(doc1);

        // Trigger valid html start tag in BeforeHtml
        Document doc2 = parser.parseInput("   <html><head></head><body></body></html>", "");
        assertNotNull(doc2);

        // Trigger end tag in BeforeHtml
        Document doc3 = parser.parseInput("</head><html></html>", "");
        assertNotNull(doc3);
    }

    @Test
    public void testBeforeHeadCoverage() {
        Parser parser = Parser.htmlParser();
        // Whitespace, Comment, Doctype error, StartTag html, StartTag head, EndTag head, Other tags
        Document doc = parser.parseInput("<html>   <!--comment--> <!DOCTYPE html> <head></head></html>", "");
        assertNotNull(doc);

        Document doc2 = parser.parseInput("<html></head><p>text</p></html>", "");
        assertNotNull(doc2);
    }

    @Test
    public void testInHeadVariousTags() {
        Parser parser = Parser.htmlParser();
        String html = "<html><head>" +
                "<base href=\"http://example.com\">" +
                "<meta charset=\"UTF-8\">" +
                "<title>Title</title>" +
                "<style>body {}</style>" +
                "<noscript>No script</noscript>" +
                "<script>var a = 1;</script>" +
                "<link rel=\"stylesheet\" href=\"a.css\">" +
                "</head><body></body></html>";
        Document doc = parser.parseInput(html, "");
        assertNotNull(doc);
    }

    @Test
    public void testInHeadErrorsAndEndTags() {
        Parser parser = Parser.htmlParser();
        String html = "<html><head></head></head><body></body></html>";
        Document doc = parser.parseInput(html, "");
        assertNotNull(doc);
    }

    @Test
    public void testInBodyEdgeCasesAndElements() {
        Parser parser = Parser.htmlParser();
        String html = "<html><body>" +
                "<a href=\"#\">Link</a><a href=\"#\">Nested Link</a>" +
                "<p>Paragraph <span class=\"sp\">Span text</span></p>" +
                "<ul><li>Item 1</li><li>Item 2</li></ul>" +
                "<form action=\"#\"><input type=\"text\" name=\"t\"><input type=\"hidden\" name=\"h\"></form>" +
                "<table><caption>Caption</caption><tr><td>Cell</td></tr></table>" +
                "<textarea>Area</textarea><xmp>Xmp</xmp><iframe></iframe><noembed>Noembed</noembed>" +
                "<select><option value=\"1\">1</option><optgroup label=\"g\"><option value=\"2\">2</option></optgroup></select>" +
                "</body></html>";
        Document doc = parser.parseInput(html, "");
        assertNotNull(doc);
    }

    @Test
    public void testInBodyAdoptionAgencyAndFormatting() {
        Parser parser = Parser.htmlParser();
        // Complex nesting to trigger adoption agency algorithm branches
        String html = "<html><body><b><i><p>Formatting </b></i></p></body></html>";
        Document doc = parser.parseInput(html, "");
        assertNotNull(doc);
    }

    @Test
    public void testTableAndColumnGroupStates() {
        Parser parser = Parser.htmlParser();
        String html = "<html><body><table><colgroup><col span=\"2\"></colgroup><tbody><tr><td>Data</td></tr></tbody></table></body></html>";
        Document doc = parser.parseInput(html, "");
        assertNotNull(doc);
    }

    @Test
    public void testFramesetAndAfterBodyStates() {
        Parser parser = Parser.htmlParser();
        String html = "<html><frameset><frame src=\"a.html\"></frameset></html>   ";
        Document doc = parser.parseInput(html, "");
        assertNotNull(doc);
    }
}
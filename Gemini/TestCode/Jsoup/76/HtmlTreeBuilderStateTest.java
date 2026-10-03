package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class HtmlTreeBuilderStateTest {

    @Test
    public void testInitialStateBranches() {
        // Trigger: Initial state with whitespace, comment, doctype (force quirks and normal), and other tags
        String htmlWhitespace = "   \n\t ";
        Document doc1 = Jsoup.parse(htmlWhitespace);
        assertNotNull(doc1);

        String htmlFull = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\"><!-- comment --><p>Hello</p>";
        Document doc2 = Jsoup.parse(htmlFull);
        assertNotNull(doc2);

        String htmlQuirks = "<!DOCTYPE html SYSTEM \"about:legacy-compat\"><p>Quirks</p>";
        Document doc3 = Jsoup.parse(htmlQuirks);
        assertNotNull(doc3);
    }

    @Test
    public void testBeforeHtmlStateBranches() {
        // Trigger: BeforeHtml with doctype (error branch), comments, whitespace, <html> start tag, invalid end tags, and anything else
        String html1 = "<!DOCTYPE html><html><head></head><body></body></html>";
        Document doc1 = Jsoup.parse(html1);
        assertNotNull(doc1);

        String html2 = "<!-- comment --><html><body></body></html>";
        Document doc2 = Jsoup.parse(html2);
        assertNotNull(doc2);

        String html3 = "   <!DOCTYPE html><html><body></body></html>"; // Doctype after whitespace triggers error in BeforeHtml
        Document doc3 = Jsoup.parse(html3);
        assertNotNull(doc3);

        String html4 = "</head><span>test</span>";
        Document doc4 = Jsoup.parse(html4);
        assertNotNull(doc4);

        String html5 = "</h1><span>test</span>";
        Document doc5 = Jsoup.parse(html5);
        assertNotNull(doc5);
    }

    @Test
    public void testBeforeHeadStateBranches() {
        // Trigger: BeforeHead with whitespace, comments, doctype error, html start tag, head start tag, valid/invalid end tags, anything else
        String html1 = "<html><!-- comment --><head><title>Test</title></head><body></body></html>";
        Document doc1 = Jsoup.parse(html1);
        assertNotNull(doc1);

        String html2 = "<html><!DOCTYPE html><head></head><body></body></html>";
        Document doc2 = Jsoup.parse(html2);
        assertNotNull(doc2);

        String html3 = "<html></head><head></head><body></body></html>";
        Document doc3 = Jsoup.parse(html3);
        assertNotNull(doc3);

        String html4 = "<html></p><body></body></html>";
        Document doc4 = Jsoup.parse(html4);
        assertNotNull(doc4);

        String html5 = "<html><p>Body content without head</p></html>";
        Document doc5 = Jsoup.parse(html5);
        assertNotNull(doc5);
    }

    @Test
    public void testInHeadStateBranches() {
        // Trigger: InHead special tags (base, meta, title, noframes, style, noscript, script, head error, unknown end/start tags)
        String html = "<html><head>" +
                "<base href=\"http://example.com/\">" +
                "<basefont>" +
                "<bgsound>" +
                "<command>" +
                "<link rel=\"stylesheet\" href=\"foo.css\">" +
                "<meta charset=\"UTF-8\">" +
                "<title>Title</title>" +
                "<noframes>No frames</noframes>" +
                "<style>body {}</style>" +
                "<noscript>Noscript</noscript>" +
                "<script>var a = 1;</script>" +
                "</head><body></body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);

        // Additional InHead error conditions
        String htmlError = "<html><head><head></head></head><body></body></html>";
        Document docError = Jsoup.parse(htmlError);
        assertNotNull(docError);

        String htmlEndError = "<html><head></head></html></body>";
        Document docEndError = Jsoup.parse(htmlEndError);
        assertNotNull(docEndError);
    }

    @Test
    public void testInHeadNoscriptBranches() {
        // Trigger: InHeadNoscript state transitions and anythingElse
        String html = "<html><head><noscript><link rel=\"stylesheet\" href=\"test.css\"></noscript></head><body></body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);

        String htmlNoscriptBr = "<html><head><noscript><br></noscript></head><body></body></html>";
        Document docBr = Jsoup.parse(htmlNoscriptBr);
        assertNotNull(docBr);

        String htmlNoscriptError = "<html><head><noscript><head></head></noscript></head><body></body></html>";
        Document docErr = Jsoup.parse(htmlNoscriptError);
        assertNotNull(docErr);
    }

    @Test
    public void testAfterHeadStateBranches() {
        // Trigger: AfterHead with whitespace, comments, doctype, html/body/frameset/head/other start tags, and end tags
        String html = "<html><head><title>Test</title></head>" +
                "<!-- comment -->" +
                "<body class=\"main\">" +
                "<base href=\"http://test.com\">" +
                "<head></head>" +
                "</body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);

        String htmlFrameset = "<html><head><title>Test</title></head><frameset><frame src=\"a.html\"></frameset></html>";
        Document docFrameset = Jsoup.parse(htmlFrameset);
        assertNotNull(docFrameset);

        String htmlEndTag = "<html><head><title>Test</title></head></span></html>";
        Document docEnd = Jsoup.parse(htmlEndTag);
        assertNotNull(docEnd);
    }

    @Test
    public void testInBodyCharacterAndEdgeCases() {
        // Trigger null character, whitespace with framesetOk, formatting elements, etc.
        String htmlNullChar = "<html><body>\u0000abc</body></html>";
        Document docNull = Jsoup.parse(htmlNullChar);
        assertNotNull(docNull);

        String htmlFormatting = "<html><body><a href=\"#\">Link</a><a href=\"#\">Nested Link</a>" +
                "<p>Paragraph close <p>Another P" +
                "<ul><li>Item 1<li>Item 2</ul>" +
                "<form action=\"/submit\"><form>Nested Form</form></form>" +
                "<dl><dt>Term<dd>Definition</dl>" +
                "<plaintext>Plain text content" +
                "<button>Button<button>Nested Button</button></button>" +
                "<nobr>No break<nobr>Nested nobr</nobr></nobr>" +
                "<applet></applet><marquee></marquee><object></object>" +
                "<input type=\"text\" name=\"user\">" +
                "<input type=\"hidden\" name=\"token\" value=\"123\">" +
                "<hr><image><isindex prompt=\"Search:\">" +
                "<textarea>Textarea</textarea>" +
                "<xmp>Xmp</xmp><iframe>Iframe</iframe><noembed>Noembed</noembed>" +
                "<select><option>Opt1</option><optgroup label=\"Grp\"><option>Opt2</option></optgroup></select>" +
                "<ruby><rt>Ruby text</rt></ruby>" +
                "<math></math><svg></svg>" +
                "<span>Span</span>" +
                "</body></html>";
        Document docForm = Jsoup.parse(htmlFormatting);
        assertNotNull(docForm);
    }

    @Test
    public void testInBodyAdoptionAgencyAndClosers() {
        // Trigger adoption agency algorithm branches and various end tag checks
        String html = "<html><body>" +
                "<b><i><u>Test</u></i></b>" +
                "<div><span><b>Block span formatting</b></span></div>" +
                "<s>Sarcasm</s>" +
                "<br>" +
                "</body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);
    }

    @Test
    public void testTableAndSelectStates() {
        // Trigger InTable, InTableText, InCaption, InColumnGroup, InTableBody, InRow, InCell, InSelect, InSelectInTable
        String html = "<html><body>" +
                "<table>" +
                "<caption>Caption text</caption>" +
                "<colgroup><col span=\"2\"></colgroup>" +
                "<thead><tr><th>Header</th></tr></thead>" +
                "<tbody><tr><td>Data 1</td><td>Data 2</td></tr>" +
                "<tr><td><select><option>1</option></select></td></tr>" +
                "</tbody>" +
                "<tfoot><tr><td>Footer</td></tr></tfoot>" +
                "</table>" +
                "</body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);

        String tableTextHtml = "<html><body><table>  Text outside cells  <tr><td>Cell</td></tr></table></body></html>";
        Document docTableText = Jsoup.parse(tableTextHtml);
        assertNotNull(docTableText);
    }

    @Test
    public void testFramesetAndAfterBodyStates() {
        // Trigger AfterBody, InFrameset, AfterFrameset, AfterAfterBody, AfterAfterFrameset
        String html = "<html><frameset><frame src=\"1.html\"></frameset><noframes>No frames</noframes></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);

        String htmlAfterBody = "<html><body>Body content</body></html>  <!-- trailing comment -->";
        Document docAfter = Jsoup.parse(htmlAfterBody);
        assertNotNull(docAfter);
    }
}
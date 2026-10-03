package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.*;

public class HtmlTreeBuilderStateTest {

    // --- Initial State Tests ---
    @Test
    public void testInitialStateWhitespace() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("   ", "");
        assertNotNull(doc);
    }

    @Test
    public void testInitialStateComment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<!-- comment --><html></html>", "");
        assertNotNull(doc);
    }

    @Test
    public void testInitialStateDoctype() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        // Force quirks doctype test
        Document doc = tb.parse("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"><html></html>", "");
        assertEquals(Document.QuirksMode.quirks, doc.quirksMode());
    }

    @Test
    public void testInitialStateOtherToken() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<span>text</span>", "");
        assertNotNull(doc);
    }

    // --- BeforeHtml State Tests ---
    @Test
    public void testBeforeHtmlDoctype() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        // Triggers error and returns false in BeforeHtml
        Document doc = tb.parse("<!DOCTYPE html><html></html>", "");
        assertNotNull(doc);
    }

    @Test
    public void testBeforeHtmlCommentAndWhitespace() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("  <!-- c -->  <html></html>", "");
        assertNotNull(doc);
    }

    @Test
    public void testBeforeHtmlEndTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("</head><html></html>", "");
        assertNotNull(doc);
    }

    @Test
    public void testBeforeHtmlAnythingElse() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<div>content</div>", "");
        assertNotNull(doc);
    }

    // --- BeforeHead State Tests ---
    @Test
    public void testBeforeHeadWhitespaceAndComment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<html>   <!-- c -->", "");
        assertNotNull(doc);
    }

    @Test
    public void testBeforeHeadDoctype() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<html><!DOCTYPE html>", "");
        assertNotNull(doc);
    }

    @Test
    public void testBeforeHeadHtmlTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<html><html>", "");
        assertNotNull(doc);
    }

    @Test
    public void testBeforeHeadHeadTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<html><head></head>", "");
        assertNotNull(doc);
    }

    @Test
    public void testBeforeHeadEndTagAndOthers() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<html></head><div></div>", "");
        assertNotNull(doc);
    }

    // --- InHead State Tests ---
    @Test
    public void testInHeadVariousElements() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<html><head>   " +
                "<base href=\"http://example.com\">" +
                "<basefont>" +
                "<bgsound>" +
                "<command>" +
                "<link rel=\"stylesheet\">" +
                "<meta charset=\"UTF-8\">" +
                "<title>Title</title>" +
                "<noframes></noframes>" +
                "<style></style>" +
                "<noscript></noscript>" +
                "<script>var a = 1;</script>" +
                "</head><body></body></html>", "");
        assertNotNull(doc);
    }

    @Test
    public void testInHeadErrorsAndEndTags() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<html><head><head></head></html>", "");
        assertNotNull(doc);
    }

    @Test
    public void testInHeadDoctypeAndInvalidEndTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<html><head><!DOCTYPE html></body></html>", "");
        assertNotNull(doc);
    }

    // --- InHeadNoscript State Tests ---
    @Test
    public void testInHeadNoscriptBranches() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<html><head><noscript><link></noscript></head><body></body></html>", "");
        assertNotNull(doc);
    }

    @Test
    public void testInHeadNoscriptErrors() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<html><head><noscript><head></head></noscript></head><body></body></html>", "");
        assertNotNull(doc);
    }

    // --- AfterHead State Tests ---
    @Test
    public void testAfterHeadBranches() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<html><head></head>   <!-- c -->" +
                "<body class=\"main\">" +
                "</body></html>", "");
        assertNotNull(doc);
    }

    @Test
    public void testAfterHeadFramesetAndHeadErrors() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        // Test frameset and invalid head tag in AfterHead
        Document doc = tb.parse("<html><head></head><frameset></frameset></html>", "");
        assertNotNull(doc);
    }

    // --- InBody State Tests ---
    @Test
    public void testInBodyCharacterNullAndWhitespace() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<html><body>\u0000   text </body></html>", "");
        assertNotNull(doc);
    }

    @Test
    public void testInBodyAnchorTagDuplicate() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        // Trigger active formatting element <a> duplication check
        Document doc = tb.parse("<html><body><a><a href='#'>link</a></a></body></html>", "");
        assertNotNull(doc);
    }

    @Test
    public void testInBodyListItemsAndHeadings() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<html><body><p>para</p><li>item 1</li><li>item 2</li><h1>h1</h1><h2>h2</h2><dt>dt</dt><dd>dd</dd></body></html>", "");
        assertNotNull(doc);
    }

    @Test
    public void testInBodyFormAndButtons() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<html><body><form><button>btn1<button>btn2</button></button></form></body></html>", "");
        assertNotNull(doc);
    }

    @Test
    public void testInBodyTableAndInputs() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<html><body><table id='t'><tr><td><input type='text'><input type='hidden'></td></tr></table></body></html>", "");
        assertNotNull(doc);
    }

    @Test
    public void testInBodyIsIndexAndSpecialTags() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<html><body><isindex action='search' prompt='Find:' /><textarea>area</textarea><xmp>xmp</xmp><iframe></iframe><noembed>no</noembed><select><option>1</option></select><math></math><svg></svg></body></html>", "");
        assertNotNull(doc);
    }

    @Test
    public void testInBodyAdoptionAgencyAndClosers() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        // Triggers adoption agency algorithm branches
        Document doc = tb.parse("<html><body><b><p>test<b>abc</b></p></b></body></html>", "");
        assertNotNull(doc);
    }

    @Test
    public void testInBodyScopeErrorsAndEdgeCases() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<html><body></p></form></sarcasm><br></body></html>", "");
        assertNotNull(doc);
    }

    // --- Table & Select States Tests ---
    @Test
    public void testInTableAndTextStates() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<html><body><table><caption>Cap</caption><colgroup><col></colgroup><tbody><tr><td>Cell</td></tr></tbody></table></body></html>", "");
        assertNotNull(doc);
    }

    @Test
    public void testInSelectStateBranches() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<html><body><select><optgroup><option>Opt1</option></optgroup></select></body></html>", "");
        assertNotNull(doc);
    }

    @Test
    public void testAfterBodyAndFramesetStates() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<html><frameset><frame></frameset></html>", "");
        assertNotNull(doc);
    }
}
package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * JUnit4 tests for {@link HtmlTreeBuilderState}.
 *
 * Because the enum and its process() method are package-private, this test class lives in the
 * same package (org.jsoup.parser) so it can reference HtmlTreeBuilderState directly, and drives
 * the state machine indirectly through the public Jsoup/Parser API with crafted HTML inputs.
 */
public class HtmlTreeBuilderStateTest {

    // ---------- helpers ----------

    private Document parse(String html) {
        return Jsoup.parse(html);
    }

    private List<ParseError> errorsFor(String html) {
        Parser parser = Parser.htmlParser().setTrackErrors(50);
        parser.parseInput(html, "");
        return parser.getErrors();
    }

    private Document parseTracking(String html, List<ParseError>[] errOut) {
        Parser parser = Parser.htmlParser().setTrackErrors(50);
        Document doc = parser.parseInput(html, "");
        errOut[0] = parser.getErrors();
        return doc;
    }

    private static boolean hasComment(Node node, String data) {
        if (node instanceof Comment && ((Comment) node).getData().equals(data)) return true;
        for (Node child : node.childNodes())
            if (hasComment(child, data)) return true;
        return false;
    }

    // =========================================================================================
    // Sanity: direct reference to the target enum
    // =========================================================================================

    @Test
    public void enumHasExpectedNumberOfStates() {
        assertEquals(23, HtmlTreeBuilderState.values().length);
    }

    @Test
    public void foreignContent_processAlwaysReturnsTrueRegardlessOfInputs() {
        // ForeignContent.process ignores both parameters and always returns true (per source "todo: implement").
        // Safe to call directly with nulls because the method body never dereferences them.
        assertTrue(HtmlTreeBuilderState.ForeignContent.process(null, null));
    }

    // =========================================================================================
    // Initial
    // =========================================================================================

    @Test
    public void initial_leadingWhitespace_ignored() {
        Document doc = parse("   \t\n<html><head></head><body>A</body></html>");
        assertEquals("A", doc.body().text());
    }

    @Test
    public void initial_leadingComment_insertedBeforeHtml() {
        Document doc = parse("<!-- top --><html><head></head><body></body></html>");
        assertTrue(hasComment(doc, " top "));
    }

    @Test
    public void initial_doctype_setsNameAndNoQuirks() {
        Document doc = parse("<!DOCTYPE html><html><head></head><body></body></html>");
        assertTrue(doc.childNode(0) instanceof DocumentType);
        assertEquals("html", ((DocumentType) doc.childNode(0)).attr("name"));
        assertEquals(Document.QuirksMode.noQuirks, doc.quirksMode());
    }

    @Test
    public void initial_malformedDoctype_forceQuirksSetsQuirksMode() {
        Document doc = parse("<!DOCTYPE><html><head></head><body></body></html>");
        assertEquals(Document.QuirksMode.quirks, doc.quirksMode());
    }

    @Test
    public void initial_elseBranch_reprocessChainCreatesBodyText() {
        // "foo" before <html> chains through Initial->BeforeHtml->BeforeHead->InHead->AfterHead else branches.
        Document doc = parse("foo<html><head></head><body> bar</body></html>");
        assertEquals("foo bar", doc.body().text());
    }

    // =========================================================================================
    // BeforeHtml
    // =========================================================================================

    @Test
    public void beforeHtml_unmatchedEndTag_errorAndIgnored() {
        List<ParseError> errors = errorsFor("</foo><html><head></head><body>x</body></html>");
        assertFalse(errors.isEmpty());
    }

    @Test
    public void beforeHtml_commentAfterUnmatchedEndTag_inserted() {
        Document doc = parse("</foo><!--hello--><html><head></head><body>ok</body></html>");
        assertTrue(hasComment(doc, "hello"));
        assertEquals("ok", doc.body().text());
    }

    @Test
    public void beforeHtml_endTagInSet_triggersAnythingElse() {
        Document doc = parse("</body><head><title>X</title></head><body>Y</body>");
        assertEquals("X", doc.title());
        assertTrue(doc.body().text().contains("Y"));
    }

    @Test
    public void beforeHtml_startTagHtml_normalFlow() {
        Document doc = parse("<html><head><title>T</title></head><body>B</body></html>");
        assertEquals("T", doc.title());
        assertEquals("B", doc.body().text());
    }

    // =========================================================================================
    // BeforeHead
    // =========================================================================================

    @Test
    public void beforeHead_startTagHtml_delegatesInBody_mergesAttributesWithoutOverwrite() {
        Document doc = parse("<html id=1><html id=2><head></head><body></body></html>");
        assertEquals("1", doc.child(0).attr("id"));
    }

    @Test
    public void beforeHead_startTagHead_setsHeadElement() {
        Document doc = parse("<html><head><title>H</title></head><body></body></html>");
        assertNotNull(doc.head());
        assertEquals("H", doc.title());
    }

    @Test
    public void beforeHead_endTagInSet_synthesizesHeadThenReprocesses() {
        Document doc = parse("<html></head><body>x</body></html>");
        assertNotNull(doc.head());
        assertEquals("x", doc.body().text());
    }

    @Test
    public void beforeHead_otherEndTag_errorIgnored() {
        List<ParseError>[] out = new List[1];
        Document doc = parseTracking("<html></foo><head></head><body></body></html>", out);
        assertNotNull(doc.head());
        assertFalse(out[0].isEmpty());
    }

    // =========================================================================================
    // InHead
    // =========================================================================================

    @Test
    public void inHead_whitespace_insertedAsCharacter() {
        Document doc = parse("<html><head>   </head><body>b</body></html>");
        assertEquals(1, doc.head().childNodeSize());
    }

    @Test
    public void inHead_comment_inserted() {
        Document doc = parse("<html><head><!--c--></head><body></body></html>");
        assertTrue(hasComment(doc.head(), "c"));
    }

    @Test
    public void inHead_doctype_errorIgnored() {
        List<ParseError> errors = errorsFor("<html><head><!DOCTYPE x></head><body></body></html>");
        assertFalse(errors.isEmpty());
    }

    @Test
    public void inHead_base_setsBaseUriWhenHrefPresent() {
        Document doc = Jsoup.parse(
                "<html><head><base href='http://example.com/sub/'></head>"
                        + "<body><a href='x'>l</a></body></html>", "http://orig.com/");
        assertEquals("http://example.com/sub/x", doc.select("a").first().absUrl("href"));
    }

    @Test
    public void inHead_title_handledAsRcdata() {
        Document doc = parse("<html><head><title>Hi &amp; Bye</title></head><body></body></html>");
        assertEquals("Hi & Bye", doc.title());
    }

    @Test
    public void inHead_style_handledAsRawtext() {
        Document doc = parse("<html><head><style>div{color:<div>}</style></head><body></body></html>");
        assertTrue(doc.head().select("style").first().data().contains("<div>"));
        assertEquals(0, doc.head().select("div").size());
    }

    @Test
    public void inHead_script_handledAsRawtext() {
        Document doc = parse("<html><head><script>if(1<2){}</script></head><body></body></html>");
        assertTrue(doc.head().select("script").first().data().contains("if(1<2){}"));
    }

    @Test
    public void inHead_headStartTag_errorIgnored() {
        List<ParseError> errors = errorsFor("<html><head><head></head></head><body></body></html>");
        assertFalse(errors.isEmpty());
    }

    @Test
    public void inHead_defaultNonWhitespaceCharacter_closesHeadAndBubblesToBody() {
        Document doc = parse("<html><head>hi</head><body>there</body></html>");
        assertEquals("hithere", doc.body().text());
    }

    // =========================================================================================
    // InHeadNoscript
    // =========================================================================================

    @Test
    public void inHeadNoscript_doctype_errorButContinues() {
        List<ParseError> errors = errorsFor("<html><head><noscript><!DOCTYPE x></noscript></head><body></body></html>");
        assertFalse(errors.isEmpty());
    }

    @Test
    public void inHeadNoscript_allowedStartTags_delegateToInHead() {
        Document doc = parse("<html><head><noscript><link rel='x' href='y'></noscript></head><body></body></html>");
        assertEquals(1, doc.select("noscript link").size());
    }

    @Test
    public void inHeadNoscript_disallowedStartTag_errorIgnored() {
        List<ParseError> errors = errorsFor("<html><head><noscript><noscript></noscript></noscript></head><body></body></html>");
        assertFalse(errors.isEmpty());
    }

    @Test
    public void inHeadNoscript_elseBranch_errorAndInsertsCharacterOfToString() {
        List<ParseError>[] out = new List[1];
        
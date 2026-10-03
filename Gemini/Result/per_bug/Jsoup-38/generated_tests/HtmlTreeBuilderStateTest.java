package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class HtmlTreeBuilderStateTest {

    @Test
    public void testInitialStateWhitespaceAndComment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("   <!-- comment -->", "");
        assertNotNull(doc);
    }

    @Test
    public void testInitialStateDoctypeQuirks() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        // Doctype with force quirks
        Document doc = tb.parse("<!DOCTYPE html SYSTEM \"about:legacy-compat\">", "");
        assertNotNull(doc);
    }

    @Test
    public void testBeforeHtmlDoctypeAndComments() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        // Doctype in BeforeHtml triggers error and returns false
        boolean result = HtmlTreeBuilderState.BeforeHtml.process(new Token.Doctype("html", "", "", true), tb);
        assertFalse(result);

        // Comment and whitespace
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(new Token.Comment(), tb));
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(new Token.Character("   "), tb));
    }

    @Test
    public void testBeforeHtmlStartAndEndTags() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("", "", new ParseErrorList(1));

        // StartTag "html"
        Token.StartTag htmlStart = new Token.StartTag("html");
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(htmlStart, tb));

        // EndTag in BeforeHtml (e.g. head, body, html, br)
        Token.EndTag headEnd = new Token.EndTag("head");
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(headEnd, tb));

        // Unknown EndTag triggers error
        Token.EndTag unknownEnd = new Token.EndTag("unknown");
        assertFalse(HtmlTreeBuilderState.BeforeHtml.process(unknownEnd, tb));
    }

    @Test
    public void testBeforeHeadStateBranches() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("", "", new ParseErrorList(1));

        // Whitespace & Comment
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(new Token.Character("\n"), tb));
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(new Token.Comment(), tb));

        // Doctype triggers error
        assertFalse(HtmlTreeBuilderState.BeforeHead.process(new Token.Doctype("a", "b", "c", false), tb));

        // StartTag "html"
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(new Token.StartTag("html"), tb));

        // StartTag "head"
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(new Token.StartTag("head"), tb));
    }

    @Test
    public void testInHeadStateBranches() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head></html>", "", new ParseErrorList(1));
        tb.transition(HtmlTreeBuilderState.InHead);

        // Whitespace in InHead
        assertTrue(HtmlTreeBuilderState.InHead.process(new Token.Character(" "), tb));
        // Comment
        assertTrue(HtmlTreeBuilderState.InHead.process(new Token.Comment(), tb));
        // Doctype error
        assertFalse(HtmlTreeBuilderState.InHead.process(new Token.Doctype("a", "", "", false), tb));

        // StartTag base, title, style, noscript, script, head
        assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("base"), tb));
        assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("title"), tb));
        assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("style"), tb));
        assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("noscript"), tb));
        assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("script"), tb));
        assertFalse(HtmlTreeBuilderState.InHead.process(new Token.StartTag("head"), tb));
    }

    @Test
    public void testInBodyCharacterEdges() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><body></body></html>", "", new ParseErrorList(1));
        tb.transition(HtmlTreeBuilderState.InBody);

        // Null character in body
        Token.Character nullChar = new Token.Character("\u0000");
        assertFalse(HtmlTreeBuilderState.InBody.process(nullChar, tb));

        // Normal text character
        Token.Character normalChar = new Token.Character("Hello World");
        assertTrue(HtmlTreeBuilderState.InBody.process(normalChar, tb));
    }

    @Test
    public void testInBodyStartTagsEdgeCases() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><body></body></html>", "", new ParseErrorList(1));
        tb.transition(HtmlTreeBuilderState.InBody);

        // Form tag handling
        Token.StartTag formTag = new Token.StartTag("form");
        assertTrue(HtmlTreeBuilderState.InBody.process(formTag, tb));

        // Duplicate form tag should error and return false
        assertFalse(HtmlTreeBuilderState.InBody.process(formTag, tb));

        // Image tag (converted to img)
        Token.StartTag imageTag = new Token.StartTag("image");
        assertTrue(HtmlTreeBuilderState.InBody.process(imageTag, tb));

        // Isindex tag
        Token.StartTag isindexTag = new Token.StartTag("isindex");
        assertTrue(HtmlTreeBuilderState.InBody.process(isindexTag, tb));
    }

    @Test
    public void testInBodyEndTagsEdgeCases() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><body><p>Text</p></body></html>", "", new ParseErrorList(1));
        tb.transition(HtmlTreeBuilderState.InBody);

        // Unscoped body end tag
        Token.EndTag bodyEnd = new Token.EndTag("body");
        // Pop stack state setup
        tb.popStackToClose("p");
        // Process end tags
        assertTrue(HtmlTreeBuilderState.InBody.process(new Token.EndTag("p"), tb));
    }

    @Test
    public void testInTableAndInTableTextStates() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><body><table></table></body></html>", "", new ParseErrorList(1));
        tb.transition(HtmlTreeBuilderState.InTable);

        // Character in table triggers InTableText
        assertTrue(HtmlTreeBuilderState.InTable.process(new Token.Character("   "), tb));
        // Comment in table
        assertTrue(HtmlTreeBuilderState.InTable.process(new Token.Comment(), tb));
        // Doctype in table
        assertFalse(HtmlTreeBuilderState.InTable.process(new Token.Doctype("a", "", "", false), tb));
    }

    @Test
    public void testAfterBodyStateBranches() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><body></body></html>", "", new ParseErrorList(1));
        tb.transition(HtmlTreeBuilderState.AfterBody);

        // Whitespace in AfterBody
        assertTrue(HtmlTreeBuilderState.AfterBody.process(new Token.Character(" \n"), tb));
        // Comment in AfterBody
        assertTrue(HtmlTreeBuilderState.AfterBody.process(new Token.Comment(), tb));
        // Doctype in AfterBody
        assertFalse(HtmlTreeBuilderState.AfterBody.process(new Token.Doctype("a", "", "", false), tb));
    }

    @Test
    public void testForeignContentAndDefaultStates() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        // Foreign content always returns true
        assertTrue(HtmlTreeBuilderState.ForeignContent.process(new Token.Comment(), tb));
    }
}
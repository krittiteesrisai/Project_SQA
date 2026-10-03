package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.*;

public class HtmlTreeBuilderStateTest {

    @Test
    public void testInitialStateWhitespaceAndCommentAndDoctype() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("   ", "", ParseSettings.defaultSettings);
        
        // Test Initial State - Whitespace
        Token.Character whitespaceToken = new Token.Character().data("   ");
        assertTrue(HtmlTreeBuilderState.Initial.process(whitespaceToken, tb));

        // Test Initial State - Comment
        Token.Comment commentToken = new Token.Comment().comment("test-comment");
        assertTrue(HtmlTreeBuilderState.Initial.process(commentToken, tb));

        // Test Initial State - Doctype with Force Quirks
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name("html");
        doctypeToken.forceQuirks(true);
        assertTrue(HtmlTreeBuilderState.Initial.process(doctypeToken, tb));
        assertEquals(Document.QuirksMode.quirks, tb.getDocument().quirksMode());
    }

    @Test
    public void testInitialStateDoctypeNoForceQuirksAndOtherToken() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("", "", ParseSettings.defaultSettings);

        // Doctype without force quirks
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name("html");
        doctypeToken.forceQuirks(false);
        assertTrue(HtmlTreeBuilderState.Initial.process(doctypeToken, tb));
        assertEquals(Document.QuirksMode.noQuirks, tb.getDocument().quirksMode());

        // Other token (re-process through BeforeHtml)
        tb.transition(HtmlTreeBuilderState.Initial);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("p");
        assertTrue(HtmlTreeBuilderState.Initial.process(startTag, tb));
    }

    @Test
    public void testBeforeHtmlStateBranches() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("", "", ParseSettings.defaultSettings);
        tb.transition(HtmlTreeBuilderState.BeforeHtml);

        // 1. Doctype (returns false)
        Token.Doctype doctype = new Token.Doctype();
        assertFalse(HtmlTreeBuilderState.BeforeHtml.process(doctype, tb));

        // 2. Comment
        Token.Comment comment = new Token.Comment().comment("c");
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(comment, tb));

        // 3. Whitespace
        Token.Character ws = new Token.Character().data("\n");
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(ws, tb));

        // 4. StartTag "html"
        Token.StartTag htmlStart = new Token.StartTag();
        htmlStart.name("html");
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(htmlStart, tb));

        // 5. EndTag matching head/body/html/br (anythingElse)
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.EndTag endTagValid = new Token.EndTag();
        endTagValid.name("br");
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(endTagValid, tb));

        // 6. Other EndTag (error, returns false)
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.EndTag endTagInvalid = new Token.EndTag();
        endTagInvalid.name("p");
        assertFalse(HtmlTreeBuilderState.BeforeHtml.process(endTagInvalid, tb));

        // 7. Anything else (e.g. regular start tag)
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.StartTag pStart = new Token.StartTag();
        pStart.name("p");
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(pStart, tb));
    }

    @Test
    public void testBeforeHeadStateBranches() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html>", "", ParseSettings.defaultSettings);
        tb.transition(HtmlTreeBuilderState.BeforeHead);

        // Whitespace
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(new Token.Character().data(" "), tb));
        // Comment
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(new Token.Comment(), tb));
        // Doctype -> false
        assertFalse(HtmlTreeBuilderState.BeforeHead.process(new Token.Doctype(), tb));

        // StartTag "html"
        Token.StartTag html = new Token.StartTag();
        html.name("html");
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(html, tb));

        // StartTag "head"
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        Token.StartTag head = new Token.StartTag();
        head.name("head");
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(head, tb));

        // EndTag valid (head, body, html, br)
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("head");
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(endTag, tb));

        // EndTag invalid
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        Token.EndTag invEnd = new Token.EndTag();
        invEnd.name("p");
        assertFalse(HtmlTreeBuilderState.BeforeHead.process(invEnd, tb));

        // Anything else
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        Token.StartTag p = new Token.StartTag();
        p.name("p");
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(p, tb));
    }

    @Test
    public void testInHeadStateBranches() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head>", "", ParseSettings.defaultSettings);
        tb.transition(HtmlTreeBuilderState.InHead);

        // Whitespace character
        assertTrue(HtmlTreeBuilderState.InHead.process(new Token.Character().data(" "), tb));
        
        // Comment
        assertTrue(HtmlTreeBuilderState.InHead.process(new Token.Comment(), tb));

        // Doctype -> false
        assertFalse(HtmlTreeBuilderState.InHead.process(new Token.Doctype(), tb));

        // StartTag variations: base with href, title, noscript, script, head (error), unknown
        Token.StartTag base = new Token.StartTag();
        base.name("base");
        base.attributes = new Attributes();
        base.attributes.put("href", "http://example.com");
        assertTrue(HtmlTreeBuilderState.InHead.process(base, tb));

        Token.StartTag title = new Token.StartTag();
        title.name("title");
        assertTrue(HtmlTreeBuilderState.InHead.process(title, tb));
        tb.transition(HtmlTreeBuilderState.InHead);

        Token.StartTag noscript = new Token.StartTag();
        noscript.name("noscript");
        assertTrue(HtmlTreeBuilderState.InHead.process(noscript, tb));

        Token.StartTag script = new Token.StartTag();
        script.name("script");
        assertTrue(HtmlTreeBuilderState.InHead.process(script, tb));
        tb.transition(HtmlTreeBuilderState.InHead);

        Token.StartTag headStart = new Token.StartTag();
        headStart.name("head");
        assertFalse(HtmlTreeBuilderState.InHead.process(headStart, tb));

        // EndTag head
        tb.transition(HtmlTreeBuilderState.InHead);
        Token.EndTag headEnd = new Token.EndTag();
        headEnd.name("head");
        assertTrue(HtmlTreeBuilderState.InHead.process(headEnd, tb));

        // EndTag invalid
        tb.transition(HtmlTreeBuilderState.InHead);
        Token.EndTag invalidEnd = new Token.EndTag();
        invalidEnd.name("p");
        assertFalse(HtmlTreeBuilderState.InHead.process(invalidEnd, tb));
    }

    @Test
    public void testInBodyCharacterNullAndWhitespace() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><body>", "", ParseSettings.defaultSettings);
        tb.transition(HtmlTreeBuilderState.InBody);

        // Null character -> false
        Token.Character nullChar = new Token.Character().data("\u0000");
        assertFalse(HtmlTreeBuilderState.InBody.process(nullChar, tb));

        // Whitespace character with framesetOk
        Token.Character wsChar = new Token.Character().data("   ");
        tb.framesetOk(true);
        assertTrue(HtmlTreeBuilderState.InBody.process(wsChar, tb));
    }

    @Test
    public void testInBodyStartTagsEdgeCases() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><body>", "", ParseSettings.defaultSettings);
        tb.transition(HtmlTreeBuilderState.InBody);

        // StartTag 'a' active formatting element check
        Token.StartTag aTag = new Token.StartTag();
        aTag.name("a");
        assertTrue(HtmlTreeBuilderState.InBody.process(aTag, tb));
        // Process 'a' again to trigger active formatting element removal branch
        assertTrue(HtmlTreeBuilderState.InBody.process(aTag, tb));

        // StartTag 'li'
        Token.StartTag liTag = new Token.StartTag();
        liTag.name("li");
        assertTrue(HtmlTreeBuilderState.InBody.process(liTag, tb));

        // StartTag 'form' when form element already exists
        Token.StartTag formTag = new Token.StartTag();
        formTag.name("form");
        assertTrue(HtmlTreeBuilderState.InBody.process(formTag, tb));
        // Second form tag should fail/ignore
        assertFalse(HtmlTreeBuilderState.InBody.process(formTag, tb));

        // StartTag 'isindex' with prompt and action
        Token.StartTag isindexTag = new Token.StartTag();
        isindexTag.name("isindex");
        isindexTag.attributes = new Attributes();
        isindexTag.attributes.put("prompt", "Search:");
        isindexTag.attributes.put("action", "/search");
        // Reset form element for isindex test
        tb.setFormElement(null);
        assertTrue(HtmlTreeBuilderState.InBody.process(isindexTag, tb));
    }

    @Test
    public void testAfterHeadAndTextAndTableStates() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html>", "", ParseSettings.defaultSettings);
        
        // AfterHead state with startTag body
        tb.transition(HtmlTreeBuilderState.AfterHead);
        Token.StartTag body = new Token.StartTag();
        body.name("body");
        assertTrue(HtmlTreeBuilderState.AfterHead.process(body, tb));

        // Text state with EOF
        tb.transition(HtmlTreeBuilderState.Text);
        Token.EOF eof = new Token.EOF();
        assertTrue(HtmlTreeBuilderState.Text.process(eof, tb));

        // InTable state with Doctype -> false
        tb.transition(HtmlTreeBuilderState.InTable);
        Token.Doctype dt = new Token.Doctype();
        assertFalse(HtmlTreeBuilderState.InTable.process(dt, tb));

        // InSelect state with EOF
        tb.transition(HtmlTreeBuilderState.InSelect);
        assertTrue(HtmlTreeBuilderState.InSelect.process(eof, tb));
    }
}
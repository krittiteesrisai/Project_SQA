package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;
import static org.junit.Assert.*;

public class TreeBuilderStateTest {

    @Test
    public void testInitialStateWhitespace() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("   ", "", ParseErrorList.noTracking());
        Token.Character t = new Token.Character("   ");
        boolean result = TreeBuilderState.Initial.process(t, tb);
        assertTrue(result);
    }

    @Test
    public void testInitialStateComment() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("<!-- comment -->", "", ParseErrorList.noTracking());
        Token.Comment t = new Token.Comment();
        t.data("comment");
        boolean result = TreeBuilderState.Initial.process(t, tb);
        assertTrue(result);
    }

    @Test
    public void testInitialStateDoctypeQuirks() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("<!DOCTYPE html>", "", ParseErrorList.noTracking());
        Token.Doctype t = new Token.Doctype();
        t.name("html");
        t.forceQuirks(true);
        boolean result = TreeBuilderState.Initial.process(t, tb);
        assertTrue(result);
        assertEquals(Document.QuirksMode.quirks, tb.getDocument().quirksMode());
    }

    @Test
    public void testInitialStateOtherToken() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("<span></span>", "", ParseErrorList.noTracking());
        Token.StartTag t = new Token.StartTag("span");
        boolean result = TreeBuilderState.Initial.process(t, tb);
        assertTrue(result);
    }

    @Test
    public void testBeforeHtmlDoctypeAndComment() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("", "", ParseErrorList.noTracking());
        Token.Doctype dt = new Token.Doctype();
        assertFalse(TreeBuilderState.BeforeHtml.process(dt, tb));

        Token.Comment c = new Token.Comment();
        assertTrue(TreeBuilderState.BeforeHtml.process(c, tb));

        Token.Character ws = new Token.Character(" \n\t");
        assertTrue(TreeBuilderState.BeforeHtml.process(ws, tb));
    }

    @Test
    public void testBeforeHtmlTags() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("", "", ParseErrorList.noTracking());
        Token.StartTag html = new Token.StartTag("html");
        assertTrue(TreeBuilderState.BeforeHtml.process(html, tb));

        Token.EndTag endHead = new Token.EndTag("head");
        assertTrue(TreeBuilderState.BeforeHtml.process(endHead, tb));

        Token.EndTag badEnd = new Token.EndTag("span");
        assertFalse(TreeBuilderState.BeforeHtml.process(badEnd, tb));

        Token.StartTag span = new Token.StartTag("span");
        assertTrue(TreeBuilderState.BeforeHtml.process(span, tb));
    }

    @Test
    public void testBeforeHeadProcess() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("<html>", "", ParseErrorList.noTracking());
        tb.process(new Token.StartTag("html"));

        assertTrue(TreeBuilderState.BeforeHead.process(new Token.Character(" "), tb));
        assertTrue(TreeBuilderState.BeforeHead.process(new Token.Comment(), tb));
        assertFalse(TreeBuilderState.BeforeHead.process(new Token.Doctype(), tb));

        assertTrue(TreeBuilderState.BeforeHead.process(new Token.StartTag("html"), tb));
        assertTrue(TreeBuilderState.BeforeHead.process(new Token.StartTag("head"), tb));

        assertTrue(TreeBuilderState.BeforeHead.process(new Token.EndTag("head"), tb));
        assertFalse(TreeBuilderState.BeforeHead.process(new Token.EndTag("span"), tb));
        assertTrue(TreeBuilderState.BeforeHead.process(new Token.StartTag("body"), tb));
    }

    @Test
    public void testInHeadProcessBranches() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("<html><head>", "", ParseErrorList.noTracking());
        tb.process(new Token.StartTag("html"));
        tb.process(new Token.StartTag("head"));

        // Whitespace
        assertTrue(TreeBuilderState.InHead.process(new Token.Character(" "), tb));
        // Comment
        assertTrue(TreeBuilderState.InHead.process(new Token.Comment(), tb));
        // Doctype
        assertFalse(TreeBuilderState.InHead.process(new Token.Doctype(), tb));

        // StartTags
        assertTrue(TreeBuilderState.InHead.process(new Token.StartTag("html"), tb));
        
        Token.StartTag base = new Token.StartTag("base");
        base.attributes.put("href", "http://example.com");
        assertTrue(TreeBuilderState.InHead.process(base, tb));

        assertTrue(TreeBuilderState.InHead.process(new Token.StartTag("meta"), tb));
        assertTrue(TreeBuilderState.InHead.process(new Token.StartTag("title"), tb));
        assertTrue(TreeBuilderState.InHead.process(new Token.StartTag("style"), tb));
        assertTrue(TreeBuilderState.InHead.process(new Token.StartTag("noscript"), tb));
        assertTrue(TreeBuilderState.InHead.process(new Token.StartTag("script"), tb));
        
        assertFalse(TreeBuilderState.InHead.process(new Token.StartTag("head"), tb));
        assertTrue(TreeBuilderState.InHead.process(new Token.StartTag("div"), tb));

        // EndTags
        assertTrue(TreeBuilderState.InHead.process(new Token.EndTag("body"), tb));
        assertFalse(TreeBuilderState.InHead.process(new Token.EndTag("span"), tb));
        
        // Head end tag
        assertTrue(TreeBuilderState.InHead.process(new Token.EndTag("head"), tb));
    }

    @Test
    public void testInHeadNoscriptProcess() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("<html><head><noscript>", "", ParseErrorList.noTracking());
        tb.process(new Token.StartTag("html"));
        tb.process(new Token.StartTag("head"));
        tb.process(new Token.StartTag("noscript"));

        assertFalse(TreeBuilderState.InHeadNoscript.process(new Token.Doctype(), tb));
        assertTrue(TreeBuilderState.InHeadNoscript.process(new Token.StartTag("html"), tb));
        assertTrue(TreeBuilderState.InHeadNoscript.process(new Token.Comment(), tb));
        assertTrue(TreeBuilderState.InHeadNoscript.process(new Token.EndTag("br"), tb));
        assertFalse(TreeBuilderState.InHeadNoscript.process(new Token.StartTag("head"), tb));
        assertTrue(TreeBuilderState.InHeadNoscript.process(new Token.StartTag("div"), tb));
        assertTrue(TreeBuilderState.InHeadNoscript.process(new Token.EndTag("noscript"), tb));
    }

    @Test
    public void testAfterHeadProcess() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("<html><head></head>", "", ParseErrorList.noTracking());
        tb.process(new Token.StartTag("html"));
        tb.process(new Token.StartTag("head"));
        tb.process(new Token.EndTag("head"));

        assertTrue(TreeBuilderState.AfterHead.process(new Token.Character(" "), tb));
        assertTrue(TreeBuilderState.AfterHead.process(new Token.Comment(), tb));
        assertTrue(TreeBuilderState.AfterHead.process(new Token.Doctype(), tb));

        assertTrue(TreeBuilderState.AfterHead.process(new Token.StartTag("html"), tb));
        assertTrue(TreeBuilderState.AfterHead.process(new Token.StartTag("body"), tb));
        assertTrue(TreeBuilderState.AfterHead.process(new Token.StartTag("frameset"), tb));

        // head sub-tags inside afterhead
        assertTrue(TreeBuilderState.AfterHead.process(new Token.StartTag("base"), tb));
        assertFalse(TreeBuilderState.AfterHead.process(new Token.StartTag("head"), tb));
        assertTrue(TreeBuilderState.AfterHead.process(new Token.StartTag("div"), tb));

        assertTrue(TreeBuilderState.AfterHead.process(new Token.EndTag("body"), tb));
        assertFalse(TreeBuilderState.AfterHead.process(new Token.EndTag("span"), tb));
        assertTrue(TreeBuilderState.AfterHead.process(new Token.Character("text"), tb));
    }

    @Test
    public void testInBodyCharacterEdges() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("<html><body>", "", ParseErrorList.noTracking());
        tb.process(new Token.StartTag("html"));
        tb.process(new Token.StartTag("body"));

        Token.Character nullChar = new Token.Character("\u0000");
        assertFalse(TreeBuilderState.InBody.process(nullChar, tb));

        Token.Character wsChar = new Token.Character(" ");
        assertTrue(TreeBuilderState.InBody.process(wsChar, tb));

        Token.Character normalChar = new Token.Character("Hello");
        assertTrue(TreeBuilderState.InBody.process(normalChar, tb));
        
        assertTrue(TreeBuilderState.InBody.process(new Token.Comment(), tb));
        assertFalse(TreeBuilderState.InBody.process(new Token.Doctype(), tb));
    }

    @Test
    public void testInBodyStartTagsCollection() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("<html><body>", "", ParseErrorList.noTracking());
        tb.process(new Token.StartTag("html"));
        tb.process(new Token.StartTag("body"));

        Token.StartTag htmlTag = new Token.StartTag("html");
        htmlTag.attributes.put("class", "root");
        assertTrue(TreeBuilderState.InBody.process(htmlTag, tb));

        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("meta"), tb));
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("body"), tb));
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("frameset"), tb));
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("div"), tb));
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("h1"), tb));
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("h1"), tb)); // duplicate heading
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("pre"), tb));
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("form"), tb));
        assertFalse(TreeBuilderState.InBody.process(new Token.StartTag("form"), tb)); // second form error
        
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("li"), tb));
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("dd"), tb));
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("dt"), tb));
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("plaintext"), tb));
    }

    @Test
    public void testInBodyFormattingAndSpecialTags() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("<html><body>", "", ParseErrorList.noTracking());
        tb.process(new Token.StartTag("html"));
        tb.process(new Token.StartTag("body"));

        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("button"), tb));
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("button"), tb)); // button in button scope

        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("a"), tb));
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("a"), tb)); // duplicate 'a'

        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("b"), tb));
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("nobr"), tb));
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("nobr"), tb));
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("applet"), tb));
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("table"), tb));
        
        // Back to InBody context via table or others
        tb.process(new Token.EndTag("table"));
        
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("img"), tb));
        
        Token.StartTag input = new Token.StartTag("input");
        input.attributes.put("type", "text");
        assertTrue(TreeBuilderState.InBody.process(input, tb));

        Token.StartTag hiddenInput = new Token.StartTag("input");
        hiddenInput.attributes.put("type", "hidden");
        assertTrue(TreeBuilderState.InBody.process(hiddenInput, tb));

        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("param"), tb));
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("hr"), tb));
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("image"), tb)); // converts to img

        Token.StartTag isindex = new Token.StartTag("isindex");
        isindex.attributes.put("action", "search");
        assertTrue(TreeBuilderState.InBody.process(isindex, tb));

        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("textarea"), tb));
        tb.process(new Token.EndTag("textarea"));

        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("xmp"), tb));
        tb.process(new Token.EndTag("xmp"));

        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("iframe"), tb));
        tb.process(new Token.EndTag("iframe"));

        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("noembed"), tb));
        tb.process(new Token.EndTag("noembed"));

        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("select"), tb));
        tb.process(new Token.EndTag("select"));

        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("option"), tb));
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("math"), tb));
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("svg"), tb));
        assertFalse(TreeBuilderState.InBody.process(new Token.StartTag("caption"), tb));
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("span"), tb));
    }

    @Test
    public void testInBodyEndTags() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("<html><body><div><p>text</p></div></body>", "", ParseErrorList.noTracking());
        tb.process(new Token.StartTag("html"));
        tb.process(new Token.StartTag("body"));
        tb.process(new Token.StartTag("div"));
        tb.process(new Token.StartTag("p"));

        assertTrue(TreeBuilderState.InBody.process(new Token.EndTag("p"), tb));
        assertTrue(TreeBuilderState.InBody.process(new Token.EndTag("div"), tb));
        assertTrue(TreeBuilderState.InBody.process(new Token.EndTag("body"), tb));
        assertTrue(TreeBuilderState.InBody.process(new Token.EndTag("html"), tb));

        // Error end tags
        assertFalse(TreeBuilderState.InBody.process(new Token.EndTag("body"), tb)); // not in scope
        assertFalse(TreeBuilderState.InBody.process(new Token.EndTag("li"), tb));
        assertFalse(TreeBuilderState.InBody.process(new Token.EndTag("dd"), tb));
        assertFalse(TreeBuilderState.InBody.process(new Token.EndTag("h1"), tb));
        
        assertTrue(TreeBuilderState.InBody.process(new Token.EndTag("sarcasm"), tb));
        assertFalse(TreeBuilderState.InBody.process(new Token.EndTag("br"), tb));
    }

    @Test
    public void testTextAndTableStates() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("<html><body><script>", "", ParseErrorList.noTracking());
        tb.process(new Token.StartTag("html"));
        tb.process(new Token.StartTag("body"));
        
        tb.transition(TreeBuilderState.Text);
        assertTrue(TreeBuilderState.Text.process(new Token.Character("code"), tb));
        assertTrue(TreeBuilderState.Text.process(new Token.EndTag("script"), tb));

        tb.transition(TreeBuilderState.InTable);
        assertTrue(TreeBuilderState.InTable.process(new Token.Character("text"), tb));
        assertTrue(TreeBuilderState.InTable.process(new Token.Comment(), tb));
        assertFalse(TreeBuilderState.InTable.process(new Token.Doctype(), tb));
        assertTrue(TreeBuilderState.InTable.process(new Token.StartTag("caption"), tb));
        assertTrue(TreeBuilderState.InTable.process(new Token.StartTag("colgroup"), tb));
        assertTrue(TreeBuilderState.InTable.process(new Token.StartTag("col"), tb));
        assertTrue(TreeBuilderState.InTable.process(new Token.StartTag("tbody"), tb));
        assertTrue(TreeBuilderState.InTable.process(new Token.StartTag("td"), tb));
    }

    @Test
    public void testAdditionalTableAndSelectStates() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("<html><body><table><caption>cap</caption>", "", ParseErrorList.noTracking());
        tb.process(new Token.StartTag("html"));
        tb.process(new Token.StartTag("body"));
        tb.process(new Token.StartTag("table"));
        
        // InCaption
        assertTrue(TreeBuilderState.InCaption.process(new Token.Character("abc"), tb));
        assertTrue(TreeBuilderState.InCaption.process(new Token.EndTag("caption"), tb));

        // InColumnGroup
        tb.transition(TreeBuilderState.InColumnGroup);
        assertTrue(TreeBuilderState.InColumnGroup.process(new Token.Character(" "), tb));
        assertTrue(TreeBuilderState.InColumnGroup.process(new Token.Comment(), tb));
        assertTrue(TreeBuilderState.InColumnGroup.process(new Token.StartTag("col"), tb));
        assertTrue(TreeBuilderState.InColumnGroup.process(new Token.EndTag("colgroup"), tb));

        // InSelect
        tb.transition(TreeBuilderState.InSelect);
        assertTrue(TreeBuilderState.InSelect.process(new Token.StartTag("option"), tb));
        assertTrue(TreeBuilderState.InSelect.process(new Token.StartTag("optgroup"), tb));
        assertTrue(TreeBuilderState.InSelect.process(new Token.EndTag("optgroup"), tb));
        assertTrue(TreeBuilderState.InSelect.process(new Token.EndTag("option"), tb));
    }

    @Test
    public void testAfterBodyAndFramesetStates() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("<html><body></body>", "", ParseErrorList.noTracking());
        tb.process(new Token.StartTag("html"));
        tb.process(new Token.StartTag("body"));
        tb.process(new Token.EndTag("body"));

        tb.transition(TreeBuilderState.AfterBody);
        assertTrue(TreeBuilderState.AfterBody.process(new Token.Character(" "), tb));
        assertTrue(TreeBuilderState.AfterBody.process(new Token.Comment(), tb));
        assertFalse(TreeBuilderState.AfterBody.process(new Token.Doctype(), tb));
        assertTrue(TreeBuilderState.AfterBody.process(new Token.StartTag("html"), tb));

        tb.transition(TreeBuilderState.InFrameset);
        assertTrue(TreeBuilderState.InFrameset.process(new Token.Character(" "), tb));
        assertTrue(TreeBuilderState.InFrameset.process(new Token.Comment(), tb));
        assertFalse(TreeBuilderState.InFrameset.process(new Token.Doctype(), tb));
        assertTrue(TreeBuilderState.InFrameset.process(new Token.StartTag("frame"), tb));
    }
}
package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeBuilderStateTest {

    @Test
    public void testInitialStateWhitespaceAndComment() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("   ", "", ParseErrorList.noTracking());
        
        // Whitespace test -> returns true, ignores
        boolean res1 = TreeBuilderState.Initial.process(new Token.Character("   "), tb);
        assertTrue(res1);

        // Comment test
        Token.Comment comment = new Token.Comment();
        comment.append("test comment");
        boolean res2 = TreeBuilderState.Initial.process(comment, tb);
        assertTrue(res2);
    }

    @Test
    public void testInitialStateDoctypeAndFallback() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("", "", ParseErrorList.noTracking());

        // Doctype with force quirks
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name.append("html");
        doctypeToken.forceQuirks = true;
        boolean resDoctype = TreeBuilderState.Initial.process(doctypeToken, tb);
        assertTrue(resDoctype);
        assertEquals(Document.QuirksMode.quirks, tb.getDocument().quirksMode());

        // Non-whitespace/non-comment/non-doctype fallback (re-process in BeforeHtml)
        TreeBuilder tb2 = new TreeBuilder();
        tb2.initialiseParse("<div></div>", "", ParseErrorList.noTracking());
        Token.StartTag startTag = new Token.StartTag("div");
        boolean resFallback = TreeBuilderState.Initial.process(startTag, tb2);
        assertTrue(resFallback);
    }

    @Test
    public void testBeforeHtmlStateBranches() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("", "", ParseErrorList.noTracking());

        // Doctype in BeforeHtml -> error, returns false
        Token.Doctype dt = new Token.Doctype();
        assertFalse(TreeBuilderState.BeforeHtml.process(dt, tb));

        // Comment and Whitespace
        assertTrue(TreeBuilderState.BeforeHtml.process(new Token.Comment(), tb));
        assertTrue(TreeBuilderState.BeforeHtml.process(new Token.Character(" \t\n"), tb));

        // StartTag "html"
        Token.StartTag htmlTag = new Token.StartTag("html");
        assertTrue(TreeBuilderState.BeforeHtml.process(htmlTag, tb));

        // EndTag matching head/body/html/br -> anythingElse
        TreeBuilder tbEnd = new TreeBuilder();
        tbEnd.initialiseParse("", "", ParseErrorList.noTracking());
        Token.EndTag headEnd = new Token.EndTag("head");
        assertTrue(TreeBuilderState.BeforeHtml.process(headEnd, tbEnd));

        // Invalid EndTag -> error, returns false
        TreeBuilder tbInvEnd = new TreeBuilder();
        tbInvEnd.initialiseParse("", "", ParseErrorList.noTracking());
        Token.EndTag invEnd = new Token.EndTag("div");
        assertFalse(TreeBuilderState.BeforeHtml.process(invEnd, tbInvEnd));
    }

    @Test
    public void testBeforeHeadStateBranches() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("", "", ParseErrorList.noTracking());

        assertTrue(TreeBuilderState.BeforeHead.process(new Token.Character(" "), tb));
        assertTrue(TreeBuilderState.BeforeHead.process(new Token.Comment(), tb));
        assertFalse(TreeBuilderState.BeforeHead.process(new Token.Doctype(), tb));

        // StartTag "html" -> delegates to InBody
        Token.StartTag htmlTag = new Token.StartTag("html");
        assertTrue(TreeBuilderState.BeforeHead.process(htmlTag, tb));

        // StartTag "head"
        TreeBuilder tbHead = new TreeBuilder();
        tbHead.initialiseParse("", "", ParseErrorList.noTracking());
        Token.StartTag headTag = new Token.StartTag("head");
        assertTrue(TreeBuilderState.BeforeHead.process(headTag, tbHead));

        // EndTag in head/body/html/br
        TreeBuilder tbEnd = new TreeBuilder();
        tbEnd.initialiseParse("", "", ParseErrorList.noTracking());
        assertTrue(TreeBuilderState.BeforeHead.process(new Token.EndTag("body"), tbEnd));

        // Invalid EndTag
        TreeBuilder tbInv = new TreeBuilder();
        tbInv.initialiseParse("", "", ParseErrorList.noTracking());
        assertFalse(TreeBuilderState.BeforeHead.process(new Token.EndTag("div"), tbInv));

        // Anything else in BeforeHead
        TreeBuilder tbElse = new TreeBuilder();
        tbElse.initialiseParse("", "", ParseErrorList.noTracking());
        assertTrue(TreeBuilderState.BeforeHead.process(new Token.StartTag("p"), tbElse));
    }

    @Test
    public void testInHeadStateBranches() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("<head></head>", "", ParseErrorList.noTracking());
        tb.transition(TreeBuilderState.InHead);

        // Whitespace character insertion
        assertTrue(TreeBuilderState.InHead.process(new Token.Character("  "), tb));
        
        // Doctype -> error, returns false
        assertFalse(TreeBuilderState.InHead.process(new Token.Doctype(), tb));

        // Base tag with href
        Token.StartTag baseTag = new Token.StartTag("base");
        baseTag.attributes.put("href", "http://example.com");
        assertTrue(TreeBuilderState.InHead.process(baseTag, tb));

        // Meta, Title, Style, Noscript, Script, Head error
        assertTrue(TreeBuilderState.InHead.process(new Token.StartTag("meta"), tb));
        assertTrue(TreeBuilderState.InHead.process(new Token.StartTag("title"), tb));
        assertTrue(TreeBuilderState.InHead.process(new Token.StartTag("style"), tb));
        assertTrue(TreeBuilderState.InHead.process(new Token.StartTag("noscript"), tb));
        assertTrue(TreeBuilderState.InHead.process(new Token.StartTag("script"), tb));
        assertFalse(TreeBuilderState.InHead.process(new Token.StartTag("head"), tb));

        // EndTag head
        assertTrue(TreeBuilderState.InHead.process(new Token.EndTag("head"), tb));
    }

    @Test
    public void testInBodyStateNullCharacterEdgeCase() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("<body></body>", "", ParseErrorList.noTracking());
        tb.transition(TreeBuilderState.InBody);

        // Trigger nullString character defect condition
        char nullChar = 0x0000;
        Token.Character nullToken = new Token.Character(String.valueOf(nullChar));
        boolean result = TreeBuilderState.InBody.process(nullToken, tb);
        assertFalse(result);
    }

    @Test
    public void testInBodyStateParagraphAndFormatting() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("<body><p>Text</p></body>", "", ParseErrorList.noTracking());
        tb.transition(TreeBuilderState.InBody);

        // StartTag formatting elements (e.g., <b>, <a>, <p>, <i>)
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("b"), tb));
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("a"), tb));
        // EndTag formatting elements & anyOtherEndTag
        assertTrue(TreeBuilderState.InBody.process(new Token.EndTag("b"), tb));
    }

    @Test
    public void testInTableAndInTableTextStates() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("<table></table>", "", ParseErrorList.noTracking());
        tb.transition(TreeBuilderState.InTable);

        // Character triggers InTableText transition
        Token.Character charToken = new Token.Character("Table text content");
        assertTrue(TreeBuilderState.InTable.process(charToken, tb));

        // Process in InTableText
        tb.transition(TreeBuilderState.InTableText);
        Token.EOF eof = new Token.EOF();
        assertTrue(TreeBuilderState.InTableText.process(eof, tb));
    }

    @Test
    public void testInSelectStateBranches() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("<select></select>", "", ParseErrorList.noTracking());
        tb.transition(TreeBuilderState.InSelect);

        // Null character in select
        char nullChar = 0x0000;
        assertFalse(TreeBuilderState.InSelect.process(new Token.Character(String.valueOf(nullChar)), tb));

        // StartTag option, optgroup
        assertTrue(TreeBuilderState.InSelect.process(new Token.StartTag("option"), tb));
        assertTrue(TreeBuilderState.InSelect.process(new Token.StartTag("optgroup"), tb));

        // EndTag select
        assertTrue(TreeBuilderState.InSelect.process(new Token.EndTag("select"), tb));
    }

    @Test
    public void testAfterBodyStateBranches() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("<html><body></body></html>", "", ParseErrorList.noTracking());
        tb.transition(TreeBuilderState.AfterBody);

        // Whitespace in AfterBody
        assertTrue(TreeBuilderState.AfterBody.process(new Token.Character("   "), tb));

        // Comment in AfterBody
        assertTrue(TreeBuilderState.AfterBody.process(new Token.Comment(), tb));

        // Doctype in AfterBody -> error, returns false
        assertFalse(TreeBuilderState.AfterBody.process(new Token.Doctype(), tb));

        // EndTag html (Non-fragment)
        assertTrue(TreeBuilderState.AfterBody.process(new Token.EndTag("html"), tb));
    }
}
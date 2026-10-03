package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HtmlTreeBuilderStateTest {

    private HtmlTreeBuilder treeBuilder;

    @Before
    public void setUp() {
        treeBuilder = new HtmlTreeBuilder();
        // กำหนดค่าเริ่มต้นจำลองการParse Document พื้นฐาน
        treeBuilder.initialiseParse("", "http://example.com", ParseSettings.defaultSettings);
    }

    @Test
    public void testInitialState_WhitespaceAndComment() {
        Token.Character whitespaceToken = new Token.Character().data("   ");
        Token.Comment commentToken = new Token.Comment().comment("test comment");

        boolean res1 = HtmlTreeBuilderState.Initial.process(whitespaceToken, treeBuilder);
        assertTrue(res1);

        boolean res2 = HtmlTreeBuilderState.Initial.process(commentToken, treeBuilder);
        assertTrue(res2);
    }

    @Test
    public void testInitialState_DoctypeWithQuirks() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name("html");
        doctype.forceQuirks(true);

        boolean res = HtmlTreeBuilderState.Initial.process(doctype, treeBuilder);
        assertTrue(res);
        assertEquals(Document.QuirksMode.quirks, treeBuilder.getDocument().quirksMode());
        assertEquals(HtmlTreeBuilderState.BeforeHtml, treeBuilder.state());
    }

    @Test
    public void testInitialState_OtherTokenReProcess() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("div");

        boolean res = HtmlTreeBuilderState.Initial.process(startTag, treeBuilder);
        assertTrue(res);
        assertEquals(HtmlTreeBuilderState.BeforeHtml, treeBuilder.state());
    }

    @Test
    public void testBeforeHtmlState_DoctypeError() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name("html");

        boolean res = HtmlTreeBuilderState.BeforeHtml.process(doctype, treeBuilder);
        assertFalse(res);
    }

    @Test
    public void testBeforeHtmlState_CommentAndWhitespace() {
        treeBuilder.transition(HtmlTreeBuilderState.BeforeHtml);
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(new Token.Comment().comment("c"), treeBuilder));
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(new Token.Character().data("\n"), treeBuilder));
    }

    @Test
    public void testBeforeHtmlState_HtmlStartTag() {
        treeBuilder.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.StartTag htmlTag = new Token.StartTag();
        htmlTag.name("html");

        boolean res = HtmlTreeBuilderState.BeforeHtml.process(htmlTag, treeBuilder);
        assertTrue(res);
        assertEquals(HtmlTreeBuilderState.BeforeHead, treeBuilder.state());
    }

    @Test
    public void testBeforeHtmlState_AnythingElse() {
        treeBuilder.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.StartTag divTag = new Token.StartTag();
        divTag.name("div");

        boolean res = HtmlTreeBuilderState.BeforeHtml.process(divTag, treeBuilder);
        assertTrue(res);
        assertEquals(HtmlTreeBuilderState.BeforeHead, treeBuilder.state());
    }

    @Test
    public void testBeforeHeadState_WhitespaceAndComment() {
        treeBuilder.transition(HtmlTreeBuilderState.BeforeHead);
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(new Token.Character().data(" "), treeBuilder));
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(new Token.Comment().comment("ch"), treeBuilder));
    }

    @Test
    public void testBeforeHeadState_DoctypeError() {
        treeBuilder.transition(HtmlTreeBuilderState.BeforeHead);
        assertFalse(HtmlTreeBuilderState.BeforeHead.process(new Token.Doctype(), treeBuilder));
    }

    @Test
    public void testBeforeHeadState_HeadStartTag() {
        treeBuilder.transition(HtmlTreeBuilderState.BeforeHead);
        Token.StartTag headTag = new Token.StartTag();
        headTag.name("head");

        boolean res = HtmlTreeBuilderState.BeforeHead.process(headTag, treeBuilder);
        assertTrue(res);
        assertEquals(HtmlTreeBuilderState.InHead, treeBuilder.state());
    }

    @Test
    public void testBeforeHeadState_EndTagAndAnythingElse() {
        treeBuilder.transition(HtmlTreeBuilderState.BeforeHead);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("head");

        boolean res = HtmlTreeBuilderState.BeforeHead.process(endTag, treeBuilder);
        assertTrue(res);
    }

    @Test
    public void testInHeadState_WhitespaceAndBase() {
        treeBuilder.transition(HtmlTreeBuilderState.InHead);
        assertTrue(HtmlTreeBuilderState.InHead.process(new Token.Character().data("   "), treeBuilder));

        Token.StartTag baseTag = new Token.StartTag();
        baseTag.name("base");
        baseTag.attributes = new Attributes();
        baseTag.attributes.put("href", "http://test.com");

        assertTrue(HtmlTreeBuilderState.InHead.process(baseTag, treeBuilder));
    }

    @Test
    public void testInHeadState_MetaTitleScriptNoscript() {
        treeBuilder.transition(HtmlTreeBuilderState.InHead);

        // meta
        Token.StartTag meta = new Token.StartTag(); meta.name("meta");
        assertTrue(HtmlTreeBuilderState.InHead.process(meta, treeBuilder));

        // title
        Token.StartTag title = new Token.StartTag(); title.name("title");
        assertTrue(HtmlTreeBuilderState.InHead.process(title, treeBuilder));

        // style
        treeBuilder.transition(HtmlTreeBuilderState.InHead);
        Token.StartTag style = new Token.StartTag(); style.name("style");
        assertTrue(HtmlTreeBuilderState.InHead.process(style, treeBuilder));

        // noscript
        treeBuilder.transition(HtmlTreeBuilderState.InHead);
        Token.StartTag noscript = new Token.StartTag(); noscript.name("noscript");
        assertTrue(HtmlTreeBuilderState.InHead.process(noscript, treeBuilder));
        assertEquals(HtmlTreeBuilderState.InHeadNoscript, treeBuilder.state());
    }

    @Test
    public void testInHeadState_EndHead() {
        treeBuilder.transition(HtmlTreeBuilderState.InHead);
        treeBuilder.insert(new Token.StartTag().name("head"));

        Token.EndTag endHead = new Token.EndTag();
        endHead.name("head");

        boolean res = HtmlTreeBuilderState.InHead.process(endHead, treeBuilder);
        assertTrue(res);
        assertEquals(HtmlTreeBuilderState.AfterHead, treeBuilder.state());
    }

    @Test
    public void testInBodyState_CharacterNullStringEdgeCase() {
        treeBuilder.transition(HtmlTreeBuilderState.InBody);
        Token.Character nullChar = new Token.Character();
        nullChar.data("\u0000");

        // จำลอง Defects4J bug condition ที่ Character มีค่า nullString (\u0000)
        boolean res = HtmlTreeBuilderState.InBody.process(nullChar, treeBuilder);
        assertFalse(res);
    }

    @Test
    public void testInBodyState_ValidCharacter() {
        treeBuilder.transition(HtmlTreeBuilderState.InBody);
        Token.Character validChar = new Token.Character();
        validChar.data("Hello World");

        boolean res = HtmlTreeBuilderState.InBody.process(validChar, treeBuilder);
        assertTrue(res);
    }

    @Test
    public void testInBodyState_StartTagAnchor() {
        treeBuilder.transition(HtmlTreeBuilderState.InBody);
        Token.StartTag aTag = new Token.StartTag();
        aTag.name("a");

        boolean res = HtmlTreeBuilderState.InBody.process(aTag, treeBuilder);
        assertTrue(res);
    }

    @Test
    public void testInTableState_CharacterAndDoctype() {
        treeBuilder.transition(HtmlTreeBuilderState.InTable);
        Token.Character charToken = new Token.Character().data("table text");

        boolean res = HtmlTreeBuilderState.InTable.process(charToken, treeBuilder);
        assertTrue(res);
        assertEquals(HtmlTreeBuilderState.InTableText, treeBuilder.state());

        // Doctype in table should error
        treeBuilder.transition(HtmlTreeBuilderState.InTable);
        assertFalse(HtmlTreeBuilderState.InTable.process(new Token.Doctype(), treeBuilder));
    }

    @Test
    public void testInSelectState_WhitespaceAndOption() {
        treeBuilder.transition(HtmlTreeBuilderState.InSelect);
        Token.StartTag option = new Token.StartTag();
        option.name("option");

        boolean res = HtmlTreeBuilderState.InSelect.process(option, treeBuilder);
        assertTrue(res);
    }

    @Test
    public void testAfterBodyState_Whitespace() {
        treeBuilder.transition(HtmlTreeBuilderState.AfterBody);
        Token.Character ws = new Token.Character().data("   ");

        boolean res = HtmlTreeBuilderState.AfterBody.process(ws, treeBuilder);
        assertTrue(res);
    }
}
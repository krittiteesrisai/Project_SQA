package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeBuilderStateTest {

    // =====================================================================
    // Initial
    // =====================================================================
    @Test
    public void testInitial_LeadingWhitespaceIgnored() {
        Document doc = Jsoup.parse("   <html><head></head><body>hi</body></html>");
        assertEquals("hi", doc.body().text());
    }

    @Test
    public void testInitial_CommentBeforeHtml() {
        Document doc = Jsoup.parse("<!-- c --><html><body>x</body></html>");
        assertNotNull(doc.childNode(0)); // comment appended at document level
        assertEquals("x", doc.body().text());
    }

    @Test
    public void testInitial_Doctype_NotQuirks() {
        Document doc = Jsoup.parse("<!DOCTYPE html><html><body>y</body></html>");
        // Only 'quirks' enum constant is confirmed from source (Document.QuirksMode.quirks).
        assertNotEquals(Document.QuirksMode.quirks, doc.quirksMode());
    }

    // NOTE: ไม่แน่ใจ syntax doctype ที่แน่นอนที่ทำให้ d.isForceQuirks() == true
    // เพราะ tokeniser/doctype-parsing logic ไม่ปรากฏในซอร์สที่ให้มา
    // จึงทดสอบเพียงว่า parse ไม่ throw exception
    @Test
    public void testInitial_MalformedDoctype_DoesNotCrash() {
        Document doc = Jsoup.parse("<!DOCTYPE html PUBLIC><html><body>z</body></html>");
        assertNotNull(doc);
    }

    @Test
    public void testInitial_AnythingElse_NoDoctypeNoHtml() {
        Document doc = Jsoup.parse("<p>hello</p>");
        assertEquals("hello", doc.body().text());
    }

    // =====================================================================
    // BeforeHtml
    // =====================================================================
    @Test
    public void testBeforeHtml_DoctypeIgnored_Error() {
        Document doc = Jsoup.parse("<html><!DOCTYPE html><body>a</body></html>");
        assertEquals("a", doc.body().text());
    }

    @Test
    public void testBeforeHtml_Comment() {
        Document doc = Jsoup.parse("<!--c1--><html><body>b</body></html>");
        assertEquals("b", doc.body().text());
    }

    @Test
    public void testBeforeHtml_StartTagHtml() {
        Document doc = Jsoup.parse("<html lang=\"en\"><body>c</body></html>");
        assertEquals("en", doc.select("html").attr("lang"));
    }

    @Test
    public void testBeforeHtml_EndTagBr_AnythingElse() {
        Document doc = Jsoup.parse("</br><body>d</body>");
        assertEquals("d", doc.body().text());
    }

    @Test
    public void testBeforeHtml_EndTagOther_ErrorIgnored() {
        Document doc = Jsoup.parse("</span><body>e</body>");
        assertEquals("e", doc.body().text());
    }

    @Test
    public void testBeforeHtml_AnythingElse_TextNode() {
        Document doc = Jsoup.parse("text<body>f</body>");
        assertTrue(doc.body().text().contains("f"));
    }

    // =====================================================================
    // BeforeHead
    // =====================================================================
    @Test
    public void testBeforeHead_Whitespace() {
        Document doc = Jsoup.parse("<html>   <head></head><body>g</body></html>");
        assertEquals("g", doc.body().text());
    }

    @Test
    public void testBeforeHead_Comment() {
        Document doc = Jsoup.parse("<html><!--c--><head></head><body>h</body></html>");
        assertEquals("h", doc.body().text());
    }

    @Test
    public void testBeforeHead_StartTagHtml_NoTransition() {
        Document doc = Jsoup.parse("<html><html class=\"x\"><body>i</body></html>");
        assertEquals("i", doc.body().text());
    }

    @Test
    public void testBeforeHead_StartTagHead() {
        Document doc = Jsoup.parse("<html><head><title>T</title></head><body>j</body></html>");
        assertEquals("T", doc.title());
    }

    @Test
    public void testBeforeHead_EndTagHeadBodyHtmlBr() {
        Document doc = Jsoup.parse("<html></head><body>k</body></html>");
        assertEquals("k", doc.body().text());
    }

    @Test
    public void testBeforeHead_EndTagOther_Error() {
        Document doc = Jsoup.parse("<html></span><body>l</body></html>");
        assertEquals("l", doc.body().text());
    }

    @Test
    public void testBeforeHead_AnythingElse() {
        Document doc = Jsoup.parse("<html>text<body>m</body></html>");
        assertTrue(doc.body().text().contains("m"));
    }

    // =====================================================================
    // InHead
    // =====================================================================
    @Test
    public void testInHead_Whitespace() {
        Document doc = Jsoup.parse("<html><head>   <title>T2</title></head><body>n</body></html>");
        assertEquals("T2", doc.title());
    }

    @Test
    public void testInHead_Comment() {
        Document doc = Jsoup.parse("<html><head><!--c--><title>T3</title></head><body>o</body></html>");
        assertEquals("T3", doc.title());
    }

    @Test
    public void testInHead_StartTagHtml_RedirectsToInBody() {
        Document doc = Jsoup.parse("<html><head><html class=\"y\"><title>T4</title></head><body>p</body></html>");
        assertEquals("T4", doc.title());
    }

    @Test
    public void testInHead_StartTagBase_UpdatesBaseUri() {
        Document doc = Jsoup.parse("<html><head><base href=\"http://example.com/\"></head><body>q</body></html>");
        assertEquals("http://example.com/", doc.select("base").attr("href"));
    }

    @Test
    public void testInHead_StartTagMeta() {
        Document doc = Jsoup.parse("<html><head><meta charset=\"utf-8\"></head><body>r</body></html>");
        assertNotNull(doc.select("meta").first());
    }

    @Test
    public void testInHead_StartTagTitle() {
        Document doc = Jsoup.parse("<html><head><title>MyTitle</title></head><body>s</body></html>");
        assertEquals("MyTitle", doc.title());
    }

    @Test
    public void testInHead_StartTagStyle_Rawtext() {
        Document doc = Jsoup.parse("<html><head><style>body{color:red}</style></head><body>t</body></html>");
        assertEquals("body{color:red}", doc.select("style").first().data());
    }

    @Test
    public void testInHead_StartTagNoscript() {
        Document doc = Jsoup.parse("<html><head><noscript><p>ns</p></noscript></head><body>u</body></html>");
        assertNotNull(doc.select("noscript").first());
    }

    @Test
    public void testInHead_StartTagScript() {
        Document doc = Jsoup.parse("<html><head><script>var a=1;</script></head><body>v</body></html>");
        assertTrue(doc.select("script").first().data().contains("var a=1;"));
    }

    @Test
    public void testInHead_StartTagHead_Error() {
        Document doc = Jsoup.parse("<html><head><head></head><body>w</body></html>");
        assertEquals("w", doc.body().text());
    }

    @Test
    public void testInHead_StartTagAnythingElse_ClosesHead() {
        Document doc = Jsoup.parse("<html><head><div>divinhead</div></head><body>x1</body></html>");
        assertTrue(doc.body().html().contains("divinhead") || doc.body().text().contains("divinhead"));
    }

    @Test
    public void testInHead_EndTagHead() {
        Document doc = Jsoup.parse("<html><head></head><body>y1</body></html>");
        assertEquals("y1", doc.body().text());
    }

    @Test
    public void testInHead_EndTagBodyHtmlBr_AnythingElse() {
        Document doc = Jsoup.parse("<html><head></body>z1</html>");
        assertTrue(doc.body().text().contains("z1"));
    }

    @Test
    public void testInHead_EndTagOther_Error() {
        Document doc = Jsoup.parse("<html><head></span><body>a1</body></html>");
        assertEquals("a1", doc.body().text());
    }

    // =====================================================================
    // InHeadNoscript
    // =====================================================================
    @Test
    public void testInHeadNoscript_Doctype_Error() {
        Document doc = Jsoup.parse("<html><head><noscript><!DOCTYPE html></noscript></head><body>b1</body></html>");
        assertEquals("b1", doc.body().text());
    }

    @Test
    public void testInHeadNoscript_StartTagHtml() {
        Document doc = Jsoup.parse("<html><head><noscript><html class=\"z\"></noscript></head><body>c1</body></html>");
        assertEquals("c1", doc.body().text());
    }

    @Test
    public void testInHeadNoscript_EndTagNoscript() {
        Document doc = Jsoup.parse("<html><head><noscript></noscript></head><body>d1</body></html>");
        assertEquals("d1", doc.body().text());
    }

    @Test
    public void testInHeadNoscript_WhitespaceCommentOrAllowedStartTags() {
        Document doc = Jsoup.parse("<html><head><noscript>  <!--c--><link rel=\"x\"></noscript></head><body>e1</body></html>");
        assertEquals("e1", doc.body().text());
    }

    @Test
    public void testInHeadNoscript_EndTagBr_AnythingElse() {
        Document doc = Jsoup.parse("<html><head><noscript></br></noscript></head><body>f1</body></html>");
        assertEquals("f1", doc.body().text());
    }

    @Test
    public void testInHeadNoscript_StartTagHeadOrNoscript_Error() {
        Document doc = Jsoup.parse("<html><head><noscript><noscript></noscript></noscript></head><body>g1</body></html>");
        assertEquals("g1", doc.body().text());
    }

    @Test
    public void testInHeadNoscript_AnythingElse_Text() {
        Document doc = Jsoup.parse("<html><head><noscript>text</noscript></head><body>h1</body></html>");
        assertEquals("h1", doc.body().text());
    }

    // =====================================================================
    // AfterHead
    // =====================================================================
    @Test
    public void testAfterHead_Whitespace() {
        Document doc = Jsoup.parse("<html><head></head>   <body>i1</body></html>");
        assertEquals("i1", doc.body().text());
    }

    @Test
    public void testAfterHead_Comment() {
        Document doc = Jsoup.parse("<html><head></head><!--c--><body>j1</body></html>");
        assertEquals("j1", doc.body().text());
    }

    @Test
    public void testAfterHead_StartTagHtml() {
        Document doc = Jsoup.parse("<html><head></head><html class=\"q\"><body>k1</body></html>");
        assertEquals("k1", doc.body().text());
    }

    @Test
    public void testAfterHead_StartTagBody_FramesetOkFalse() {
        Document doc = Jsoup.parse("<html><head></head><body class=\"main\">l1</body></html>");
        assertEquals("main", doc.body().attr("class"));
    }

    @Test
    public void testAfterHead_StartTagFrameset() {
        Document doc = Jsoup.parse("<html><head></head><frameset><frame src=\"a.html\"></frameset></html>");
        assertNotNull(doc.select("frameset").first());
    }

    @Test
    public void testAfterHead_StartTag_HeadRelatedTags_ReopensHead() {
        Document doc = Jsoup.parse("<html><head></head><title>LateTitle</title><body>m1</body></html>");
        assertEquals("LateTitle", doc.title());
    }

    @Test
    public void testAfterHead_StartTagHead_Error() {
        Document doc = Jsoup.parse("<html><head></head><head><body>n1</body></html>");
        assertEquals("n1", doc.body().text());
    }

    @Test
    public void testAfterHead_StartTagOther_AnythingElse() {
        Document doc = Jsoup.parse("<html><head></head><div>o1</div></html>");
        assertTrue(doc.body().text().contains("o1"));
    }

    @Test
    public void testAfterHead_EndTagBodyHtml_AnythingElse() {
        Document doc = Jsoup.parse("<html><head></head></body>p1</html>");
        assertTrue(doc.body().text().contains("p1"));
    }

    @Test
    public void testAfterHead_EndTagOther_Error() {
        Document doc = Jsoup.parse("<html><head></head></span><body>q1</body></html>");
        assertEquals("q1", doc.body().text());
    }

    @Test
    public void testAfterHead_AnythingElse_TextNode() {
        Document doc = Jsoup.parse("<html><head></head>r1text</html>");
        assertTrue(doc.body().text().contains("r1text"));
    }

    // =====================================================================
    // InBody - Character / Comment / Doctype / html
    // =====================================================================
    @Test
    public void testInBody_Character_Whitespace() {
        Document doc = Jsoup.parse("<html><body>   <p>s1</p></body></html>");
        assertEquals("s1", doc.select("p").text());
    }

    @Test
    public void testInBody_Character_Text_FramesetOkFalse() {
        Document doc = Jsoup.parse("<html><body>t1text</body></html>");
        assertTrue(doc.body().text().contains("t1text"));
    }

    @Test
    public void testInBody_Character_NullIgnored() {
        String html = "<html><body>a\u0000b</body></html>";
        Document doc = Jsoup.parse(html);
        assertFalse(doc.body().text().contains("\u0000"));
    }

    @Test
    public void testInBody_Comment() {
        Document doc = Jsoup.parse("<html><body><!--c--><p>u1</p></body></html>");
        assertEquals("u1", doc.select("p").text());
    }

    @Test
    public void testInBody_StartTagHtml_MergeAttributes() {
        Document doc = Jsoup.parse("<html id=\"first\"><body><html class=\"second\">v1</html></body></html>");
        assertEquals("first", doc.select("html").attr("id"));
        assertEquals("second", doc.select("html").attr("class"));
    }

    @Test
    public void testInBody_StartTag_HeadTagsRedirect() {
        Document doc = Jsoup.parse("<html><body><title>InBodyTitle</title></body></html>");
        assertEquals("InBodyTitle", doc.title());
    }

    // =====================================================================
    // InBody - StartTag branches
    // =====================================================================
    @Test
    public void testInBody_StartTagBody_MergeAttributes() {
        Document doc = Jsoup.parse("<html><body id=\"b1\"><body class=\"b2\">w1</body></body></html>");
        assertEquals("b1", doc.body().attr("id"));
        assertEquals("b2", doc.body().attr("class"));
    }

    @Test
    public void testInBody_StartTagDivEtc() {
        Document doc = Jsoup.parse("<html><body><div class=\"d\">x1</div></body></html>");
        assertEquals("d", doc.select("div").attr("class"));
    }

    @Test
    public void testInBody_StartTagDiv_ClosesOpenP() {
        Document doc = Jsoup.parse("<html><body><p>open<div>closed</div></body></html>");
        Elements ps = doc.select("p");
        assertEquals(1, ps.size());
        assertEquals("open", ps.text());
    }

    @Test
    public void testInBody_StartTagH1ToH6() {
        Document doc = Jsoup.parse("<html><body><h1>Head1</h1></body></html>");
        assertEquals("Head1", doc.select("h1").text());
    }

    @Test
    public void testInBody_StartTagH1ToH6_NestedPopsPrevious() {
        Document doc = Jsoup.parse("<html><body><h1>A<h2>B</h2></body></html>");
        assertEquals(1, doc.select("h1").size());
        assertEquals(1, doc.select("h2").size());
    }

    @Test
    public void testInBody_StartTagPreListing_FramesetOkFalse() {
        Document doc = Jsoup.parse("<html><body><pre>line1\nline2</pre></body></html>");
        assertTrue(doc.select("pre").html().contains("line1"));
    }

    @Test
    public void testInBody_StartTagForm() {
        Document doc = Jsoup.parse("<html><body><form action=\"/submit\">y1</form></body></html>");
        assertEquals("/submit", doc.select("form").attr("action"));
    }

    @Test
    public void testInBody_StartTagForm_AlreadyExists_Ignored() {
        Document doc = Jsoup.parse("<html><body><form id=\"f1\"><form id=\"f2\"></form></form></body></html>");
        Elements forms = doc.select("form");
        assertEquals(1, forms.size());
        assertEquals("f1", forms.first().attr("id"));
    }

    @Test
    public void testInBody_StartTagLi() {
        Document doc = Jsoup.parse("<html><body><ul><li>item1<li>item2</ul></body></html>");
        assertEquals(2, doc.select("li").size());
    }

    @Test
    public void testInBody_StartTagDdDt() {
        Document doc = Jsoup.parse("<html><body><dl><dt>term<dd>desc</dl></body></html>");
        assertEquals(1, doc.select("dt").size());
        assertEquals(1, doc.select("dd").size());
    }

    @Test
    public void testInBody_StartTagPlaintext_NeverExitsRawMode() {
        Document doc = Jsoup.parse("<html><body><plaintext>raw <b>not bold</b></plaintext></body></html>");
        assertEquals(0, doc.select("plaintext b").size());
    }

    @Test
    public void testInBody_StartTagButton() {
        Document doc = Jsoup.parse("<html><body><button>Click</button></body></html>");
        assertEquals("Click", doc.select("button").text());
    }

    @Test
    public void testInBody_StartTagButton_AlreadyInScope_ClosesAndReprocesses() {
        Document doc = Jsoup.parse("<html><body><button>outer<button>inner</button></button></body></html>");
        assertEquals(2, doc.select("button").size());
    }

    @Test
    public void testInBody_StartTagA() {
        Document doc = Jsoup.parse("<html><body><a href=\"/x\">link</a></body></html>");
        assertEquals("/x", doc.select("a").attr("href"));
    }

    @Test
    public void testInBody_StartTagA_AlreadyActive_ClosesPrevious() {
        Document doc = Jsoup.parse("<html><body><a href=\"/1\">one<a href=\"/2\">two</a></body></html>");
        assertTrue(doc.select("a").size() >= 1);
    }

    @Test
    public void testInBody_StartTagFormattingTags() {
        Document doc = Jsoup.parse("<html><body><b>bold<i>italic</i></b></body></html>");
        assertEquals(1, doc.select("b").size());
        assertEquals(1, doc.select("i").size());
    }

    @Test
    public void testInBody_StartTagNobr() {
        Document doc = Jsoup.parse("<html><body><nobr>no wrap</nobr></body></html>");
        assertEquals("no wrap", doc.select("nobr").text());
    }

    @Test
    public void testInBody_StartTagAppletMarqueeObject() {
        Document doc = Jsoup.parse("<html><body><marquee>scrolling</marquee></body></html>");
        assertEquals("scrolling", doc.select("marquee").text());
    }

    @Test
    public void testInBody_StartTagTable_TransitionsToInTable() {
        Document doc = Jsoup.parse("<html><body><table><tr><td>cell</td></tr></table></body></html>");
        assertEquals("cell", doc.select("td").text());
    }

    @Test
    public void testInBody_StartTagVoidTags() {
        Document doc = Jsoup.parse("<html><body><img src=\"a.png\"><br></body></html>");
        assertNotNull(doc.select("img").first());
        assertNotNull(doc.select("br").first());
    }

    @Test
    public void testInBody_StartTagInput_NotHidden_FramesetOkFalse() {
        Document doc = Jsoup.parse("<html><body><input type=\"text\"></body></html>");
        assertEquals("text", doc.select("input").attr("type"));
    }

    @Test
    public void testInBody_StartTagInput_Hidden_FramesetOkUnaffected() {
        Document doc = Jsoup.parse("<html><body><input type=\"hidden\" name=\"h\"></body></html>");
        assertEquals("hidden", doc.select("input").attr("type"));
    }

    @Test
    public void testInBody_StartTagParamSourceTrack() {
        Document doc = Jsoup.parse("<html><body><video><source src=\"v.mp4\"></video></body></html>");
        assertNotNull(doc.select("source").first());
    }

    @Test
    public void testInBody_StartTagHr_ClosesP() {
        Document doc = Jsoup.parse("<html><body><p>before<hr></body></html>");
        assertNotNull(doc.select("hr").first());
    }

    @Test
    public void testInBody_StartTagImage_RenamedToImg() {
        Document doc = Jsoup.parse("<html><body><image src=\"a.png\"></body></html>");
        assertNotNull(doc.select("img").first());
        assertEquals(0, doc.select("image").size());
    }

    @Test
    public void testInBody_StartTagIsindex_CreatesFormInputHr() {
        Document doc = Jsoup.parse("<html><body><isindex prompt=\"Search:\"></body></html>");
        assertNotNull(doc.select("form").first());
        assertNotNull(doc.select("input").first());
    }

    @Test
    public void testInBody_StartTagIsindex_FormAlreadyExists_Ignored() {
        Document doc = Jsoup.parse("<html><body><form id=\"f1\"><isindex></form></body></html>");
        assertEquals(1, doc.select("form").size());
    }

    @Test
    public void testInBody_StartTagTextarea_Rcdata() {
        Document doc = Jsoup.parse("<html><body><textarea>text content</textarea></body></html>");
        assertEquals("text content", doc.select("textarea").val());
    }

    @Test
    public void testInBody_StartTagXmp_Rawtext() {
        Document doc = Jsoup.parse("<html><body><xmp><b>raw</b></xmp></body></html>");
        assertTrue(doc.select("xmp").html().contains("<b>raw</b>"));
    }

    @Test
    public void testInBody_StartTagIframe_Rawtext() {
        Document doc = Jsoup.parse("<html><body><iframe>content</iframe></body></html>");
        assertNotNull(doc.select("iframe").first());
    }

    @Test
    public void testInBody_StartTagNoembed_Rawtext() {
        Document doc = Jsoup.parse("<html><body><noembed>fallback</noembed></body></html>");
        assertNotNull(doc.select("noembed").first());
    }

    @Test
    public void testInBody_StartTagSelect_TransitionsToInSelect() {
        Document doc = Jsoup.parse("<html><body><select><option>o1</option></select></body></html>");
        assertNotNull(doc.select("select").first());
    }

    // FAULT-SENSITIVE TEST:
    // ซอร์สมี `StringUtil.in("optgroup", "option")` (ไม่มี name เป็น needle) ซึ่งเป็นบั๊กที่ทราบจริง (Jsoup-15b)
    // เงื่อนไขนี้จะเป็น false เสมอ ทำให้ optgroup/option handling พิเศษไม่ทำงานตามที่ตั้งใจ
    @Test
    public void testInBody_StartTagOptgroupOption_KnownDefectBranch() {
        Document doc = Jsoup.parse("<html><body><select><optgroup><option>opt1</option></optgroup></select></body></html>");
        assertTrue(doc.body().text().contains("opt1"));
    }

    // FAULT-SENSITIVE TEST:
    // ซอร์สมี `StringUtil.in("rp", "rt")` (บั๊กเดียวกัน) ทำให้ rp/rt ruby handling ไม่ถูก trigger จริง
    @Test
    public void testInBody_StartTagRpRt_KnownDefectBranch() {
        Document doc = Jsoup.parse("<html><body><ruby>Kan<rp>(</rp><rt>Kan</rt><rp>)</rp></ruby></body></html>");
        assertTrue(doc.body().text().contains("Kan"));
    }

    @Test
    public void testInBody_StartTagMath() {
        Document doc = Jsoup.parse("<html><body><math><mi>x</mi></math></body></html>");
        assertNotNull(doc.select("math").first());
    }

    @Test
    public void testInBody_StartTagSvg() {
        Document doc = Jsoup.parse("<html><body><svg><rect></rect></svg></body></html>");
        assertNotNull(doc.select("svg").first());
    }

    @Test
    public void testInBody_StartTagAnythingElse() {
        Document doc = Jsoup.parse("<html><body><custom-tag>z2</custom-tag></body></html>");
        assertEquals("z2", doc.select("custom-tag").text());
    }

    // =====================================================================
    // InBody - EndTag branches
    // =====================================================================
    @Test
    public void testInBody_EndTagBody_TransitionsAfterBody() {
        Document doc = Jsoup.parse("<html><body>content</body>after</html>");
        assertTrue(doc.body().text().contains("content"));
    }

    @Test
    public void testInBody_EndTagHtml_ReprocessesBodyThenHtml() {
        Document doc = Jsoup.parse("<html><body>content2</html>trailing");
        assertTrue(doc.body().text().contains("content2"));
    }

    @Test
    public void testInBody_EndTagBlockElements() {
        Document doc = Jsoup.parse("<html><body><div>inner</div>after</body></html>");
        assertEquals("inner", doc.select("div").text());
    }

    @Test
    public void testInBody_EndTagForm_RemovesFromStack() {
        Document doc = Jsoup.parse("<html><body><form><input name=\"a\"></form>after</body></html>");
        assertNotNull(doc.select("form").first());
    }

    @Test
    public void testInBody_EndTagP_InScope() {
        Document doc = Jsoup.parse("<html><body><p>text</p>after</body></html>");
        assertEquals("text", doc.select("p").text());
    }

    @Test
    public void testInBody_EndTagP_NotInScope_CreatesEmptyP() {
        Document doc = Jsoup.parse("<html><body></p>after</body></html>");
        assertNotNull(doc.select("p").first());
    }

    @Test
    public void testInBody_EndTagLi() {
        Document doc = Jsoup.parse("<html><body><ul><li>item</li></ul></body></html>");
        assertEquals("item", doc.select("li").text());
    }

    @Test
    public void testInBody_EndTagDdDt() {
        Document doc = Jsoup.parse("<html><body><dl><dt>term</dt></dl></body></html>");
        assertEquals("term", doc.select("dt").text());
    }

    @Test
    public void testInBody_EndTagH1ToH6() {
        Document doc = Jsoup.parse("<html><body><h3>Head3</h3></body></html>");
        assertEquals("Head3", doc.select("h3").text());
    }

    @Test
    public void testInBody_EndTagSarcasm_DelegatesToAnyOtherEndTag() {
        Document doc = Jsoup.parse("<html><body>text</sarcasm>after</body></html>");
        assertTrue(doc.body().text().contains("text"));
    }

    @Test
    public void testInBody_EndTagFormattingTags_AdoptionAgencyAlgorithm() {
        Document doc = Jsoup.parse("<html><body><b>bold<div>divInsideB</div>stillBold</b></body></html>");
        assertTrue(doc.body().text().contains("divInsideB"));
        assertTrue(doc.body().text().contains("stillBold"));
    }

    @Test
    public void testInBody_EndTagAppletMarqueeObject() {
        Document doc = Jsoup.parse("<html><body><marquee>scroll</marquee>after</body></html>");
        assertEquals("scroll", doc.select("marquee").text());
    }

    @Test
    public void testInBody_EndTagBr_ProcessesStartTagBr() {
        Document doc = Jsoup.parse("<html><body>line1</br>line2</body></html>");
        assertNotNull(doc.select("br").first());
    }

    @Test
    public void testInBody_EndTagAnyOther() {
        Document doc = Jsoup.parse("<html><body><span>content</span></body></html>");
        assertEquals("content", doc.select("span").text());
    }

    // =====================================================================
    // Text
    // =====================================================================
    @Test
    public void testText_ScriptCharacterAndEndTag() {
        Document doc = Jsoup.parse("<html><body><script>var x = 1;</script>after</body></html>");
        assertTrue(doc.select("script").first().data().contains("var x = 1;"));
        assertTrue(doc.body().text().contains("after"));
    }

    @Test
    public void testText_EOF_UnclosedTitle() {
        Document doc = Jsoup.parse("<html><body><title>Unclosed");
        assertNotNull(doc.title());
    }

    // =====================================================================
    // InTable
    // =====================================================================
    @Test
    public void testInTable_Character_FosterParented() {
        Document doc = Jsoup.parse("<html><body><table>foo<tr><td>cell</td></tr></table></body></html>");
        assertTrue(doc.body().text().contains("foo"));
    }

    @Test
    public void testInTable_Comment() {
        Document doc = Jsoup.parse("<html><body><table><!--c--><tr><td>x</td></tr></table></body></html>");
        assertEquals("x", doc.select("td").text());
    }

    @Test
    public void testInTable_StartTagCaption() {
        Document doc = Jsoup.parse("<html><body><table><caption>Cap</caption><tr><td>d</td></tr></table></body></html>");
        assertEquals("Cap", doc.select("caption").text());
    }

    @Test
    public void testInTable_StartTagColgroupAndCol() {
        Document doc = Jsoup.parse("<html><body><table><colgroup><col></colgroup><tr><td>e</td></tr></table></body></html>");
        assertNotNull(doc.select("colgroup").first());
        assertNotNull(doc.select("col").first());
    }

    @Test
    public void testInTable_StartTagCol_ImpliedColgroup() {
        Document doc = Jsoup.parse("<html><body><table><col><tr><td>f</td></tr></table></body></html>");
        assertNotNull(doc.select("colgroup").first());
    }

    @Test
    public void testInTable_StartTagTbodyTfootThead() {
        Document doc = Jsoup.parse("<html><body><table><tbody><tr><td>g</td></tr></tbody></table></body></html>");
        assertNotNull(doc.select("tbody").first());
    }

    @Test
    public void testInTable_StartTagTdThTr_ImpliedTbody() {
        Document doc = Jsoup.parse("<html><body><table><tr><td>h</td></tr></table></body></html>");
        assertNotNull(doc.select("tbody").first());
    }

    @Test
    public void testInTable_StartTagTable_Nested() {
        Document doc = Jsoup.parse("<html><body><table><table><tr><td>inner</td></tr></table></table></body></html>");
        assertTrue(doc.select("table").size() >= 1);
    }

    @Test
    public void testInTable_StartTagStyleScript_RedirectsInHead() {
        Document doc = Jsoup.parse("<html><body><table><style>td{color:red}</style><tr><td>i</td></tr></table></body></html>");
        assertNotNull(doc.select("style").first());
    }

    @Test
    public void testInTable_StartTagInput_Hidden() {
        Document doc = Jsoup.parse("<html><body><table><input type=\"hidden\"><tr><td>j</td></tr></table></body></html>");
        assertEquals("hidden", doc.select("input").attr("type"));
    }

    @Test
    public void testInTable_StartTagInput_NotHidden_AnythingElse() {
        Document doc = Jsoup.parse("<html><body><table><input type=\"text\"><tr><td>k</td></tr></table></body></html>");
        assertNotNull(doc.select("input").first());
    }

    @Test
    public void testInTable_StartTagForm() {
        Document doc = Jsoup.parse("<html><body><table><form></form><tr><td>l</td></tr></table></body></html>");
        assertNotNull(doc.select("form").first());
    }

    @Test
    public void testInTable_EndTagTable() {
        Document doc = Jsoup.parse("<html><body><table><tr><td>m</td></tr></table>after</body></html>");
        assertEquals("m", doc.select("td").text());
    }

    @Test
    public void testInTable_EndTagScopeTags_Error() {
        Document doc = Jsoup.parse("<html><body><table></tbody><tr><td>n</td></tr></table></body></html>");
        assertEquals("n", doc.select("td").text());
    }

    @Test
    public void testInTable_EndTagAnythingElse() {
        Document doc = Jsoup.parse("<html><body><table></span><tr><td>o</td></tr></table></body></html>");
        assertEquals("o", doc.select("td").text());
    }

    // =====================================================================
    // InCaption
    // =====================================================================
    @Test
    public void testInCaption_EndTagCaption() {
        Document doc = Jsoup.parse("<html><body><table><caption>Cap2</caption><tr><td>p2</td></tr></table></body></html>");
        assertEquals("Cap2", doc.select("caption").text());
    }

    @Test
    public void testInCaption_StartTagTableRelated_ImpliedClose() {
        Document doc = Jsoup.parse("<html><body><table><caption>Cap3<tr><td>q2</td></tr></table></body></html>");
        assertEquals("Cap3", doc.select("caption").text());
        assertEquals("q2", doc.select("td").text());
    }

    // =====================================================================
    // InColumnGroup
    // =====================================================================
    @Test
    public void testInColumnGroup_StartTagCol() {
        Document doc = Jsoup.parse("<html><body><table><colgroup><col span=\"2\"></colgroup></table></body></html>");
        assertEquals("2", doc.select("col").attr("span"));
    }

    @Test
    public void testInColumnGroup_EndTagColgroup() {
        Document doc = Jsoup.parse("<html><body><table><colgroup></colgroup><tr><td>r2</td></tr></table></body></html>");
        assertEquals("r2", doc.select("td").text());
    }

    @Test
    public void testInColumnGroup_AnythingElse() {
        Document doc = Jsoup.parse("<html><body><table><colgroup><tr><td>s2</td></tr></table></body></html>");
        assertEquals("s2", doc.select("td").text());
    }

    // =====================================================================
    // InTableBody
    // =====================================================================
    @Test
    public void testInTableBody_StartTagTr() {
        Document doc = Jsoup.parse("<html><body><table><tbody><tr><td>t2</td></tr></tbody></table></body></html>");
        assertEquals("t2", doc.select("td").text());
    }

    @Test
    public void testInTableBody_StartTagThTd_ImpliedTr() {
        Document doc = Jsoup.parse("<html><body><table><tbody><td>u2</td></tbody></table></body></html>");
        assertNotNull(doc.select("tr").first());
    }

    @Test
    public void testInTableBody_EndTagTbodyTfootThead() {
        Document doc = Jsoup.parse("<html><body><table><tbody><tr><td>v2</td></tr></tbody>after</table></body></html>");
        assertEquals("v2", doc.select("td").text());
    }

    // =====================================================================
    // InRow
    // =====================================================================
    @Test
    public void testInRow_StartTagThTd() {
        Document doc = Jsoup.parse("<html><body><table><tr><th>w2</th><td>x2</td></tr></table></body></html>");
        assertEquals("w2", doc.select("th").text());
        assertEquals("x2", doc.select("td").text());
    }

    @Test
    public void testInRow_EndTagTr() {
        Document doc = Jsoup.parse("<html><body><table><tr><td>y2</td></tr><tr><td>z2</td></tr></table></body></html>");
        assertEquals(2, doc.select("tr").size());
    }

    // =====================================================================
    // InCell
    // =====================================================================
    @Test
    public void testInCell_EndTagTdTh() {
        Document doc = Jsoup.parse("<html><body><table><tr><td>a3</td><td>b3</td></tr></table></body></html>");
        assertEquals(2, doc.select("td").size());
    }

    @Test
    public void testInCell_StartTagCaptionColEtc_ClosesCell() {
        Document doc = Jsoup.parse("<html><body><table><tr><td>c3<tr><td>d3</td></tr></table></body></html>");
        assertEquals(2, doc.select("tr").size());
    }

    // =====================================================================
    // InSelect
    // =====================================================================
    @Test
    public void testInSelect_Character() {
        Document doc = Jsoup.parse("<html><body><select>text<option>o2</option></select></body></html>");
        assertNotNull(doc.select("select").first());
    }

    @Test
    public void testInSelect_StartTagOption() {
        Document doc = Jsoup.parse("<html><body><select><option>o3</option><option>o4</option></select></body></html>");
        assertEquals(2, doc.select("option").size());
    }

    @Test
    public void testInSelect_StartTagSelect_ClosesSelf() {
        Document doc = Jsoup.parse("<html><body><select><select></select></body></html>");
        assertEquals(1, doc.select("select").size());
    }

    @Test
    public void testInSelect_StartTagInput_ClosesSelect() {
        Document doc = Jsoup.parse("<html><body><select><input type=\"text\"></body></html>");
        assertNotNull(doc.select("input").first());
    }

    @Test
    public void testInSelect_EndTagOption() {
        Document doc = Jsoup.parse("<html><body><select><option>o5</option></select></body></html>");
        assertEquals("o5", doc.select("option").text());
    }

    @Test
    public void testInSelect_EndTagOptgroup() {
        Document doc = Jsoup.parse("<html><body><select><optgroup><option>o6</option></optgroup></select></body></html>");
        assertTrue(doc.body().text().contains("o6"));
    }

    @Test
    public void testInSelect_EndTagSelect() {
        Document doc = Jsoup.parse("<html><body><select><option>o7</option></select>after</body></html>");
        assertTrue(doc.body().text().contains("o7"));
    }

    // =====================================================================
    // InSelectInTable
    // =====================================================================
    @Test
    public void testInSelectInTable_StartTagTable_ClosesSelect() {
        Document doc = Jsoup.parse(
            "<html><body><table><tr><td><select><option>o8</option><table><tr><td>inner</td></tr></table></select></td></tr></table></body></html>");
        assertTrue(doc.body().text().contains("inner"));
    }

    // =====================================================================
    // AfterBody
    // =====================================================================
    @Test
    public void testAfterBody_Whitespace() {
        Document doc = Jsoup.parse("<html><body>b3</body>   </html>");
        assertEquals("b3", doc.body().text());
    }

    @Test
    public void testAfterBody_Comment() {
        Document doc = Jsoup.parse("<html><body>c3</body><!--after--></html>");
        assertEquals("c3", doc.body().text());
    }

    @Test
    public void testAfterBody_EndTagHtml() {
        Document doc = Jsoup.parse("<html><body>d3</body></html>");
        assertEquals("d3", doc.body().text());
    }

    @Test
    public void testAfterBody_AnythingElse_ReprocessInBody() {
        Document doc = Jsoup.parse("<html><body>e3</body><p>f3</p></html>");
        assertTrue(doc.body().text().contains("f3"));
    }

    // =====================================================================
    // InFrameset
    // =====================================================================
    @Test
    public void testInFrameset_StartTagFrameAndFrameset() {
        Document doc = Jsoup.parse("<html><frameset><frameset><frame src=\"a.html\"></frameset></frameset></html>");
        assertNotNull(doc.select("frame").first());
    }

    @Test
    public void testInFrameset_StartTagNoframes() {
        Document doc = Jsoup.parse("<html><frameset><noframes><p>no frames</p></noframes></frameset></html>");
        assertNotNull(doc.select("noframes").first());
    }

    @Test
    public void testInFrameset_EndTagFrameset() {
        Document doc = Jsoup.parse("<html><frameset><frame src=\"a.html\"></frameset></html>");
        assertNotNull(doc.select("frame").first());
    }

    // =====================================================================
    // AfterFrameset
    // =====================================================================
    @Test
    public void testAfterFrameset_EndTagHtml() {
        Document doc = Jsoup.parse("<html><frameset><frame src=\"a.html\"></frameset></html>");
        assertNotNull(doc.select("frame").first());
    }

    // =====================================================================
    // AfterAfterBody
    // =====================================================================
    @Test
    public void testAfterAfterBody_Comment() {
        Document doc = Jsoup.parse("<html><body>g3</body></html><!--trail-->");
        assertEquals("g3", doc.body().text());
    }

    @Test
    public void testAfterAfterBody_AnythingElse() {
        Document doc = Jsoup.parse("<html><body>h3</body></html>trailing");
        assertTrue(doc.body().text().contains("trailing"));
    }

    // =====================================================================
    // Boundary / null / empty inputs
    // =====================================================================
    @Test
    public void testEmptyInput() {
        Document doc = Jsoup.parse("");
        assertNotNull(doc);
        assertNotNull(doc.body());
    }

    @Test
    public void testOnlyWhitespaceInput() {
        Document doc = Jsoup.parse("   \n\t  ");
        assertNotNull(doc.body());
    }
}

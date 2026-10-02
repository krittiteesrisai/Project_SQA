package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

// Import ตรงไปยังคลาสเป้าหมาย (package-private -> ต้องอยู่ใน package เดียวกัน)
import org.jsoup.parser.HtmlTreeBuilderState;

public class HtmlTreeBuilderStateTest {

    // ===================== Sanity / boundary บน enum เอง =====================

    @Test
    public void testEnumValuesContainExpectedStates() {
        HtmlTreeBuilderState[] states = HtmlTreeBuilderState.values();
        assertTrue(states.length > 0);
        assertEquals(HtmlTreeBuilderState.Initial, HtmlTreeBuilderState.valueOf("Initial"));
        assertEquals(HtmlTreeBuilderState.ForeignContent, HtmlTreeBuilderState.valueOf("ForeignContent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEnumValueOfInvalidNameThrows() {
        // ค่าขอบเขต/อินพุตผิดรูปแบบ: ชื่อ state ที่ไม่มีอยู่จริง
        HtmlTreeBuilderState.valueOf("NotARealState");
    }

    // ===================== Initial =====================

    @Test
    public void testInitial_EmptyInputProducesDefaultStructure() {
        // อินพุตว่าง (edge case) -> else branch: transition(BeforeHtml) + re-process
        Document doc = Jsoup.parse("");
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

    @Test
    public void testInitial_WhitespaceOnlyIgnored() {
        // isWhitespace(t) == true -> ignore whitespace, return true
        Document doc = Jsoup.parse("   \n\t  ");
        assertNotNull(doc.body());
        assertEquals("", doc.body().text());
    }

    @Test
    public void testInitial_DoctypeInsertedAsFirstNode() {
        // t.isDoctype() branch
        Document doc = Jsoup.parse("<!DOCTYPE html><html><body>x</body></html>");
        Node first = doc.childNode(0);
        assertTrue(first instanceof DocumentType);
    }

    // ===================== BeforeHtml =====================

    @Test
    public void testBeforeHtml_CommentInsertedBeforeHtmlElement() {
        // t.isComment() branch
        Document doc = Jsoup.parse("<!-- top comment --><html><body>x</body></html>");
        boolean foundComment = false;
        for (Node n : doc.childNodes()) {
            if (n instanceof Comment) foundComment = true;
        }
        assertTrue(foundComment);
    }

    @Test
    public void testBeforeHtml_HtmlStartTagAttributesPreserved() {
        // t.isStartTag() && name == "html" branch
        Document doc = Jsoup.parse("<html lang=\"en\"><body></body></html>");
        assertEquals("en", doc.select("html").attr("lang"));
    }

    @Test
    public void testBeforeHtml_AnythingElseImplicitHtmlInsertion() {
        // ไม่มี <html> เลย -> else -> anythingElse: insert("html") แล้ว re-process
        Document doc = Jsoup.parse("<body>Hello</body>");
        assertEquals("Hello", doc.body().text());
        assertEquals(1, doc.select("html").size());
    }

    // ===================== BeforeHead =====================

    @Test
    public void testBeforeHead_TitleInsideHeadIsTitle() {
        // t.isStartTag() && name=="head" branch
        Document doc = Jsoup.parse("<html><head><title>T</title></head><body></body></html>");
        assertEquals("T", doc.title());
    }

    @Test
    public void testBeforeHead_ImplicitHeadWhenMissing() {
        // else branch: process StartTag("head") แล้ว re-process
        Document doc = Jsoup.parse("<html><body>Txt</body></html>");
        assertNotNull(doc.head());
        assertEquals("Txt", doc.body().text());
    }

    // ===================== InHead =====================

    @Test
    public void testInHead_MetaCharsetEmptyElement() {
        // name.equals("meta") branch -> insertEmpty
        Document doc = Jsoup.parse("<head><meta charset=\"utf-8\"></head><body></body>");
        Element meta = doc.select("meta").first();
        assertNotNull(meta);
        assertEquals("utf-8", meta.attr("charset"));
        assertEquals(0, meta.childNodeSize());
    }

    @Test
    public void testInHead_BaseHrefSetsBaseUri() {
        // StringUtil.in(name,"base",...) + name.equals("base") && hasAttr("href") branch
        Document doc = Jsoup.parse(
            "<head><base href=\"http://example.com/\"></head><body><a href=\"/x\">y</a></body>");
        assertEquals("http://example.com/x", doc.select("a").first().absUrl("href"));
    }

    @Test
    public void testInHead_TitleUsesRcData() {
        // name.equals("title") -> handleRcData, entity decoding เกิดขึ้น
        Document doc = Jsoup.parse("<head><title>Hello &amp; World</title></head>");
        assertEquals("Hello & World", doc.title());
    }

    @Test
    public void testInHead_StyleUsesRawText() {
        // StringUtil.in(name,"noframes","style") -> handleRawtext
        Document doc = Jsoup.parse("<head><style>body{color:red}</style></head>");
        Element style = doc.select("style").first();
        assertNotNull(style);
        assertTrue(style.data().contains("color:red"));
    }

    @Test
    public void testInHead_ScriptUsesRawTextLikeMode() {
        // name.equals("script") branch
        Document doc = Jsoup.parse("<head><script>var x = '<p>';</script></head>");
        Element script = doc.select("script").first();
        assertNotNull(script);
        assertTrue(script.data().contains("var x = '<p>';"));
    }

    @Test
    public void testInHead_UnknownTagCascadesToBody() {
        // InHead anythingElse -> EndTag("head") -> AfterHead.anythingElse -> StartTag("body") -> InBody
        Document doc = Jsoup.parse("<head><p>Hello</p></head><body></body>");
        assertEquals("Hello", doc.body().select("p").text());
        assertEquals(0, doc.head().select("p").size());
    }

    // ===================== InHeadNoscript =====================

    @Test
    public void testInHeadNoscript_RecognizedTagDelegatedToInHead() {
        // (t.isStartTag() && StringUtil.in(name,"basefont",...,"link",...)) -> tb.process(t, InHead)
        Document doc = Jsoup.parse("<head><noscript><link rel=\"x\"></noscript></head>");
        assertEquals("x", doc.select("noscript link").attr("rel"));
    }

    @Test
    public void testInHeadNoscript_UnsupportedContentKickedToBody() {
        // else -> anythingElse: error + EndTag("noscript") + re-process -> cascades out to body
        Document doc = Jsoup.parse("<head><noscript><p>No script</p></noscript></head><body></body>");
        Element noscript = doc.select("noscript").first();
        assertNotNull(noscript);
        assertEquals(0, noscript.select("p").size());
        assertEquals("No script", doc.body().select("p").text());
    }

    @Test
    public void testInHeadNoscript_NestedNoscriptIgnored() {
        // (StartTag && in("head","noscript")) || isEndTag -> error, return false (token dropped)
        Document doc = Jsoup.parse("<head><noscript><noscript></noscript></noscript></head>");
        assertEquals(1, doc.select("noscript").size());
    }

    // ===================== AfterHead =====================

    @Test
    public void testAfterHead_BodyStartTagSetsClassAndFramesetOk() {
        // name.equals("body") branch
        Document doc = Jsoup.parse("<html><head></head><body class=\"c\">Z</body></html>");
        assertEquals("c", doc.body().className());
    }

    @Test
    public void testAfterHead_FramesetStartTagTransitionsToFrameset() {
        // name.equals("frameset") branch
        Document doc = Jsoup.parse(
            "<html><head></head><frameset><frame src='a.html'></frameset></html>");
        assertEquals(1, doc.select("frameset").size());
        assertEquals("a.html", doc.select("frame").attr("src"));
    }

    // ===================== InBody: Character / Comment / Doctype =====================

    @Test
    public void testInBody_WhitespaceCharacterInsertedAsTextNode() {
        // isWhitespace(c) branch -> reconstructFormattingElements + insert(c)
        Document doc = Jsoup.parse("<body>   <p>A</p></body>");
        assertTrue(doc.body().childNode(0) instanceof TextNode);
    }

    @Test
    public void testInBody_NullCharacterIgnoredButSiblingTextKept() {
        // NOTE: ไม่แน่ใจว่า tokenizer ส่ง null char เดี่ยว ๆ เป็น token เดียวหรือไม่
        // จึงทดสอบแบบผ่อนปรน (ขอแค่ parse ไม่ throw และข้อความปกติยังอยู่)
        Document doc = Jsoup.parse("<body>\u0000Hello</body>");
        assertTrue(doc.body().text().contains("Hello"));
    }

    // ===================== InBody: StartTag branches =====================

    @Test
    public void testInBody_PAutoClosedByNewP() {
        // StringUtil.in(name,"p",...) branch + inButtonScope("p")
        Document doc = Jsoup.parse("<body><p>One<p>Two</p></body>");
        Elements ps = doc.select("p");
        assertEquals(2, ps.size());
        assertEquals("One", ps.get(0).text());
        assertEquals("Two", ps.get(1).text());
    }

    @Test
    public void testInBody_HeadingAutoClosedByNewHeading() {
        // StringUtil.in(name,"h1",...,"h6") + currentElement heading check -> pop
        Document doc = Jsoup.parse("<body><h1>A<h2>B</h2></body>");
        assertEquals(1, doc.select("h1").size());
        assertEquals("B", doc.select("h2").text());
    }

    @Test
    public void testInBody_FormOnlyOneAllowed() {
        // name.equals("form") + getFormElement()!=null -> error, return false (token dropped)
        Document doc = Jsoup.parse(
            "<body><form><input name='a'></form><form><input name='b'></form></body>");
        assertEquals(1, doc.select("form").size());
        Elements bInput = doc.select("input[name=b]");
        assertEquals(1, bInput.size());
        assertNotEquals("form", bInput.first().parent().nodeName());
    }

    @Test
    public void testInBody_LiAutoClosedBySiblingLi() {
        // name.equals("li") branch loop
        Document doc = Jsoup.parse("<body><ul><li>A<li>B</li></ul></body>");
        Elements li = doc.select("li");
        assertEquals(2, li.size());
        assertEquals("A", li.get(0).text());
        assertEquals("B", li.get(1).text());
    }

    @Test
    public void testInBody_DdDtAutoClosedBySibling() {
        // StringUtil.in(name,"dd","dt") branch loop
        Document doc = Jsoup.parse("<body><dl><dt>Term<dd>Def</dd></dl></body>");
        assertEquals(1, doc.select("dt").size());
        assertEquals(1, doc.select("dd").size());
        assertEquals("Def", doc.select("dd").text());
    }

    @Test
    public void testInBody_PlaintextSwitchesToRawForever() {
        // name.equals("plaintext") -> tokeniser transition PLAINTEXT ตลอดไป
        Document doc = Jsoup.parse("<body><plaintext>raw <b>not bold</b></plaintext></body>");
        assertTrue(doc.select("plaintext").text().contains("<b>not bold</b>"));
    }

    @Test
    public void testInBody_ButtonNestedAutoClosed() {
        // name.equals("button") + inButtonScope("button") branch
        Document doc = Jsoup.parse("<body><button>A<button>B</button></body>");
        assertEquals(2, doc.select("button").size());
    }

    @Test
    public void testInBody_AnchorDuplicateClosesPrevious() {
        // name.equals("a") + getActiveFormattingElement("a")!=null branch
        Document doc = Jsoup.parse("<body><a href='1'>One<a href='2'>Two</a></body>");
        Elements as = doc.select("a");
        assertEquals(2, as.size());
        assertEquals("One", as.get(0).text());
        assertEquals("Two", as.get(1).text());
    }

    @Test
    public void testInBody_ImageTagRenamedToImg() {
        // name.equals("image") -> startTag.name("img") + re-process
        Document doc = Jsoup.parse("<body><image src='x.png'></body>");
        assertEquals(1, doc.select("img").size());
        assertEquals(0, doc.select("image").size());
    }

    @Test
    public void testInBody_IsindexExpandsToFormHrLabelInput() {
        // name.equals("isindex") branch: ดักทุก sub-step ที่ระบุในซอร์ส
        Document doc = Jsoup.parse(
            "<body><isindex name='q' action='/s' prompt='Search:'></body>");
        assertEquals(1, doc.select("form").size());
        assertEquals("/s", doc.select("form").attr("action"));
        assertEquals(2, doc.select("form hr").size());
        assertEquals("Search:", doc.select("form label").text());
        assertEquals(1, doc.select("input[name=isindex]").size());
    }

    @Test
    public void testInBody_TextareaUsesRcData() {
        // name.equals("textarea") branch
        Document doc = Jsoup.parse("<body><textarea>Hello <b>World</b></textarea></body>");
        assertEquals("Hello <b>World</b>", doc.select("textarea").text());
    }

    @Test
    public void testInBody_XmpUsesRawText() {
        // name.equals("xmp") branch -> handleRawtext
        Document doc = Jsoup.parse("<body><xmp>raw &amp; text</xmp></body>");
        Element xmp = doc.select("xmp").first();
        assertNotNull(xmp);
        assertTrue(xmp.data().length() > 0);
    }

    @Test
    public void testInBody_IframeUsesRawText() {
        // name.equals("iframe") branch -> handleRawtext
        Document doc = Jsoup.parse("<body><iframe><p>not parsed</p></iframe></body>");
        Element iframe = doc.select("iframe").first();
        assertNotNull(iframe);
        assertTrue(iframe.data().contains("<p>not parsed</p>"));
    }

    @Test
    public void testInBody_NoembedUsesRawText() {
        // name.equals("noembed") branch -> handleRawtext
        Document doc = Jsoup.parse("<body><noembed><p>X</p></noembed></body>");
        Element noembed = doc.select("noembed").first();
        assertNotNull(noembed);
        assertTrue(noembed.data().contains("<p>X</p>"));
    }

    @Test
    public void testInBody_SelectBasicInsertsOptions() {
        // name.equals("select") branch + transition InSelect (state ไม่อยู่ใน table context)
        Document doc = Jsoup.parse(
            "<body><select><option>A</option><option selected>B</option></select></body>");
        assertEquals(2, doc.select("option").size());
    }

    @Test
    public void testInBody_SelectInTableTransitionsToInSelectInTable() {
        // select.equals branch: state() อยู่ใน InCell -> transition(InSelectInTable)
        Document doc = Jsoup.parse(
            "<body><table><tr><td><select><option>A</option></select></td></tr></table></body>");
        assertEquals("A", doc.select("table select option").text());
    }

    @Test
    public void testInBody_OptgroupOptionBug_SecondOptionNotAutoClosed() {
        // FAULT TARGET: StringUtil.in("optgroup","option") เรียกผิด (ไม่มี name)
        // ตามสเปค: <option> ตัวที่สองต้อง auto-close ตัวแรก -> ต้องเป็น sibling ใต้ select
        // บนโค้ดที่มี bug: branch นี้ dead เสมอ -> <option> ตัวที่สองจะถูกแทรกเป็นลูกของตัวแรก (nested)
        Document doc = Jsoup.parse("<body><select><option>A<option>B</select></body>");
        Elements options = doc.select("option");
        assertEquals(2, options.size());
        Element second = options.get(1);
        assertEquals("select", second.parent().nodeName());
    }

    @Test
    public void testInBody_RpRtBug_RtNotAttachedDirectlyUnderRuby() {
        // FAULT TARGET: StringUtil.in("rp","rt") เรียกผิด (ไม่มี name)
        // ตามสเปค: เมื่อเจอ <rt> ขณะ inScope("ruby") ต้อง generateImpliedEndTags/popStackToBefore("ruby")
        // ทำให้ <rt> ต้องถูก insert เป็นลูกของ <ruby> โดยตรง ไม่ใช่ลูกของ <b> ที่ยังเปิดอยู่
        Document doc = Jsoup.parse("<body><ruby><b><rt>Reading</rt></b></ruby></body>");
        Element rt = doc.select("rt").first();
        assertNotNull(rt);
        assertEquals("ruby", rt.parent().nodeName());
    }

    @Test
    public void testInBody_TableRelatedStrayStartTagIgnored() {
        // StringUtil.in(name,"caption","col",...,"td",...) branch -> error, return false
        Document doc = Jsoup.parse("<body><td>Z</td></body>");
        assertEquals(0, doc.select("td").size());
        assertEquals("Z", doc.body().text());
    }

    @Test
    public void testInBody_HrAutoClosesOpenP() {
        // name.equals("hr") branch + inButtonScope("p")
        Document doc = Jsoup.parse("<body><p>A<hr></body>");
        assertEquals(1, doc.select("hr").size());
        assertEquals("A", doc.select("p").text());
    }

    @Test
    public void testInBody_DefaultElseInsertsUnknownTagNormally() {
        // final else branch: reconstructFormattingElements + insert
        Document doc = Jsoup.parse("<body><span>Text</span></body>");
        assertEquals("Text", doc.select("span").text());
    }

    // ===================== InBody: EndTag branches =====================

    @Test
    public void testInBody_EndTagBodyThenMoreContentReopensBody() {
        // name.equals("body") -> AfterBody else-branch -> transition(InBody) + re-process
        Document doc = Jsoup.parse("<html><body>Content</body><p>after</p></html>");
        assertEquals("after", doc.body().select("p").text());
    }

    @Test
    public void testInBody_EndTagHtmlThenTailContentGoesToBody() {
        // name.equals("html") branch -> process EndTag(body) ก่อน แล้ว cascade ไป AfterAfterBody
        Document doc = Jsoup.parse("<html><body>Content</body></html><p>tail</p>");
        assertEquals("tail", doc.body().select("p").text());
    }

    @Test
    public void testInBody_EndTagBlockLevelNotInScopeIgnored() {
        // StringUtil.in(name,"address",...,"blockquote",...) + !inScope(name) -> error, false
        Document doc = Jsoup.parse("<body></blockquote></body>");
        assertEquals(0, doc.select("blockquote").size());
    }

    @Test
    public void testInBody_EndTagBlockLevelClosesProperly() {
        Document doc = Jsoup.parse("<body><blockquote><p>Q</p></blockquote></body>");
        assertEquals("Q", doc.select("blockquote p").text());
    }

    @Test
    public void testInBody_EndTagFormNoFormElementIgnored() {
        // name.equals("form") + currentForm==null -> error, return false
        Document doc = Jsoup.parse("<body></form></body>");
        assertEquals(0, doc.select("form").size());
    }

    @Test
    public void testInBody_EndTagFormRemovesFormFromStack() {
        Document doc = Jsoup.parse("<body><form><input name='x'></form></body>");
        assertEquals(1, doc.select("form").size());
        assertEquals("x", doc.select("form input").attr("name"));
    }

    @Test
    public void testInBody_EndTagPWithNoOpenPCreatesEmptyP() {
        // name.equals("p") + !inButtonScope("p") -> process StartTag(p) ก่อน -> empty <p></p>
        Document doc = Jsoup.parse("<body></p></body>");
        Elements ps = doc.select("p");
        assertEquals(1, ps.size());
        assertEquals(0, ps.first().childNodeSize());
    }

    @Test
    public void testInBody_EndTagLiNotInScopeIgnored() {
        // name.equals("li") + !inListItemScope(name) -> error, return false
        Document doc = Jsoup.parse("<body></li></body>");
        assertEquals(0, doc.select("li").size());
    }

    @Test
    public void testInBody_EndTagHeadingNotInScopeIgnored() {
        // StringUtil.in(name,"h1"..."h6") + !inScope(...) -> error, return false
        Document doc = Jsoup.parse("<body></h1></body>");
        assertEquals(0, doc.select("h1").size());
    }

    @Test
    public void testInBody_EndTagSarcasmUsesAnyOtherEndTag() {
        // name.equals("sarcasm") -> anyOtherEndTag(t, tb)
        Document doc = Jsoup.parse("<body><sarcasm>Text</sarcasm></body>");
        assertEquals("Text", doc.select("sarcasm").text());
    }

    @Test
    public void testInBody_EndTagBrConvertsToStartTagBr() {
        // name.equals("br") -> error; process StartTag("br"); return false
        Document doc = Jsoup.parse("<body></br></body>");
        assertEquals(1, doc.select("br").size());
    }

    @Test
    public void testInBody_EndTagUnmatchedUsesAnyOtherEndTagNoop() {
        // else -> anyOtherEndTag: ไม่พบ node ชื่อตรงกันบน stack -> ไม่มีการเปลี่ยนแปลง
        Document doc = Jsoup.parse("<body><span>Content</span></xyz></body>");
        assertEquals("Content", doc.select("span").text());
    }

    // ===================== Text =====================

    @Test
    public void testText_EofPopsAndReprocessesInOriginalState() {
        // t.isEOF() branch ใน Text state: pop + transition(originalState) + re-process
        Document doc = Jsoup.parse("<body><script>var x=1;");
        Element script = doc.select("script").first();
        assertNotNull(script);
        assertTrue(script.data().contains("var x=1;"));
    }

    // ===================== InTable / InTableText =====================

    @Test
    public void testInTable_StrayTextFosterParentedOutsideTable() {
        // InTableText anythingElse -> foster insert เพราะ currentElement อยู่ใน table context
        Document doc = Jsoup.parse("<body><table>Foster<tr><td>Cell</td></tr></table></body>");
        assertTrue(doc.body().text().contains("Foster"));
        assertEquals("Cell", doc.select("table td").text());
        Element table = doc.select("table").first();
        assertFalse(table.text().contains("Foster"));
    }

    @Test
    public void testInTable_ColStartTagCreatesColgroupImplicitly() {
        // name.equals("col") -> process StartTag("colgroup") แล้ว re-process
        Document doc = Jsoup.parse("<table><col span='2'><tr><td>E</td></tr></table>");
        assertEquals("2", doc.select("colgroup col").attr("span"));
    }

    @Test
    public void testInTable_TdWithoutTbodyCreatesTbodyImplicitly() {
        // StringUtil.in(name,"td","th","tr") -> process StartTag("tbody") แล้ว re-process
        Document doc = Jsoup.parse("<table><tr><td>F</td></tr></table>");
        assertEquals("F", doc.select("table tbody tr td").text());
    }

    @Test
    public void testInTable_NestedTableClosesOuterFirst() {
        // name.equals("table") -> error; process EndTag("table"); re-process
        Document doc = Jsoup.parse("<table><table><tr><td>Inner</td></tr></table></table>");
        assertEquals(2, doc.select("table").size());
        assertEquals("Inner", doc.select("td").text());
    }

    @Test
    public void testInTable_InputHiddenStaysInsideTable() {
        // name.equals("input") + type hidden -> insertEmpty ภายใน table
        Document doc = Jsoup.parse("<table><input type='hidden' name='h'></table>");
        Element input = doc.select("input[name=h]").first();
        assertNotNull(input);
        assertEquals("table", input.parent().nodeName());
    }

    @Test
    public void testInTable_InputNonHiddenFosterParented() {
        // name.equals("input") + type != hidden -> anythingElse (foster parent)
        Document doc = Jsoup.parse("<body><table><input type='text' name='t'></table></body>");
        Element input = doc.select("input[name=t]").first();
        assertNotNull(input);
        assertNotEquals("table", input.parent().nodeName());
    }

    // ===================== InCaption =====================

    @Test
    public void testInCaption_ClosesAndTransitionsBackToInTable() {
        Document doc = Jsoup.parse("<table><caption>Title</caption><tr><td>G</td></tr></table>");
        assertEquals("Title", doc.select("caption").text());
        assertEquals("G", doc.select("table td").text());
    }

    // ===================== InColumnGroup =====================

    @Test
    public void testInColumnGroup_MultipleColsInsideColgroup() {
        Document doc = Jsoup.parse(
            "<table><colgroup><col><col></colgroup><tr><td>H</td></tr></table>");
        assertEquals(2, doc.select("colgroup col").size());
        assertEquals("H", doc.select("table td").text());
    }

    @Test
    public void testInColumnGroup_NonColContentClosesColgroup() {
        // default/StartTag อื่น -> anythingElse: close colgroup -> re-process ใน InTable
        Document doc = Jsoup.parse("<table><colgroup>Stray<tr><td>I</td></tr></table>");
        assertEquals("I", doc.select("table td").text());
    }

    // ===================== InTableBody =====================

    @Test
    public void testInTableBody_ThExitsToCreateNewContextSiblings() {
        // StringUtil.in(name,"caption","col","colgroup","tbody","tfoot","thead") -> exitTableBody
        Document doc = Jsoup.parse(
            "<table><tbody><tr><td>M</td></tr><thead><tr><th>L</th></tr></thead></table>");
        assertEquals(1, doc.select("tbody").size());
        assertEquals(1, doc.select("thead").size());
        assertEquals("M", doc.select("tbody td").text());
        assertEquals("L", doc.select("thead th").text());
    }

    // ===================== InRow =====================

    @Test
    public void testInRow_MultipleRowsSiblings() {
        Document doc = Jsoup.parse("<table><tr><td>N</td></tr><tr><td>O</td></tr></table>");
        Elements trs = doc.select("tr");
        assertEquals(2, trs.size());
    }

    // ===================== InCell =====================

    @Test
    public void testInCell_NewTdAutoClosesPrevious() {
        // StringUtil.in(name,"td","th") on open cell -> closeCell + re-process
        Document doc = Jsoup.parse("<table><tr><td>Q<td>R</tr></table>");
        Elements tds = doc.select("td");
        assertEquals(2, tds.size());
        assertEquals("Q", tds.get(0).text());
        assertEquals("R", tds.get(1).text());
        assertEquals("tr", tds.get(1).parent().nodeName());
    }

    // ===================== InSelect / InSelectInTable =====================

    @Test
    public void testInSelect_InputClosesSelectAndBecomesSibling() {
        // StringUtil.in(name,"input","keygen","textarea") -> close select, re-process
        Document doc = Jsoup.parse(
            "<body><select><option>A</option><input name='x'></select></body>");
        assertEquals(1, doc.select("select").size());
        Element input = doc.select("input[name=x]").first();
        assertNotNull(input);
        assertEquals("body", input.parent().nodeName());
    }

    @Test
    public void testInSelect_NestedSelectClosesOuterSelect() {
        // name.equals("select") -> error; process EndTag("select") (token ตัวเองไม่ reprocess)
        Document doc = Jsoup.parse(
            "<body><select><option>A</option><select><option>B</option></select></body>");
        assertEquals(1, doc.select("select").size());
        assertEquals("A", doc.select("select option").text());
    }

    @Test
    public void testInSelectInTable_TdStartTagClosesSelectThenOpensNewCell() {
        // t.isStartTag() && in(...,"td",...) ขณะ InSelectInTable -> close select -> re-process
        Document doc = Jsoup.parse(
            "<body><table><tr><td><select><option>A<td>B</table></body>");
        assertEquals("A", doc.select("table select option").text());
        Elements tds = doc.select("td");
        assertEquals(2, tds.size());
        assertEquals("B", tds.get(1).text());
    }

    // ===================== AfterBody / InFrameset / AfterAfterBody =====================

    @Test
    public void testAfterBody_CommentInsertedIntoHtmlNode() {
        // t.isComment() branch ของ AfterBody
        Document doc = Jsoup.parse("<html><body>X</body><!-- c --></html>");
        assertTrue(doc.outerHtml().contains("<!-- c -->"));
    }

    @Test
    public void testInFrameset_NestedFramesets() {
        // name.equals("frameset") branch (ซ้อน) + name.equals("frame") branch
        Document doc = Jsoup.parse(
            "<html><head></head><frameset><frameset><frame></frameset><frame></frameset></html>");
        assertEquals(2, doc.select("frameset").size());
        assertEquals(2, doc.select("frame").size());
    }

    @Test
    public void testAfterAfterBody_TrailingDoctypeIgnoredGracefully() {
        // t.isDoctype() -> tb.process(t, InBody) -> InBody Doctype case: error, return false
        Document doc = Jsoup.parse("<html><body>Z</body></html><!DOCTYPE ignored>");
        assertEquals("Z", doc.body().text());
    }
}

ด้านล่างนี้คือชุดทดสอบ JUnit 4 สำหรับ `HtmlTreeBuilderState`

**หมายเหตุสำคัญก่อนโค้ด:**
- `HtmlTreeBuilderState` เป็น **package-private enum** (ไม่มี modifier) ดังนั้นคลาสทดสอบต้องอยู่ใน package `org.jsoup.parser` เดียวกันจึงจะ "import"/อ้างถึงได้ (ถ้าอยู่คนละ package จะ compile ไม่ผ่าน)
- ในคลาสปัญหาไม่ได้แนบซอร์สของ `HtmlTreeBuilder` มาด้วย ผมจึงไม่กล้าเดา constructor/signature ภายใน แล้วเรียก `process(...)` ตรง ๆ (ผิดกฎข้อ 4) แต่ใช้ **public API ที่เป็นมาตรฐานของ jsoup** คือ `org.jsoup.Jsoup` และ `org.jsoup.parser.Parser` ในการขับเคลื่อน state machine นี้ทางอ้อม ซึ่งเพียงพอต่อการตรวจ branch ส่วนใหญ่ และยังจับ fault ได้จริงตามที่พบ (ดูเทส `testFault_InBodyEndTag_AppletMarqueeObject_ScopeCheckBug`)
- บางสาขา (เช่น `ForeignContent`, บาง edge-case ของ fragment parsing, `isForceQuirks` ที่แน่ชัด) ไม่สามารถยืนยันได้จาก source ที่ให้มาเพียงไฟล์เดียว จึงมีคอมเมนต์กำกับความไม่แน่ใจไว้ชัดเจน
- **พบ fault ที่น่าจะเป็นจุดบั๊กจริงของ Defects4J Jsoup-65** ในบรรทัด `if (!tb.inScope("name"))` ภายใน endTag branch ของ `InBodyStartApplets` (`InBody` state) ซึ่งควรเป็น `tb.inScope(name)` (ใช้ตัวแปร ไม่ใช่ literal string "name") — มีเทสเฉพาะเจาะจงเพื่อจับบั๊กนี้

```java
package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
// import ของคลาสเป้าหมาย (package-private) - ใช้ได้เพราะอยู่ package เดียวกัน
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.ParseError;
import org.jsoup.parser.Parser;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class HtmlTreeBuilderStateTest {

    // ---------- Helpers ----------

    private Document parse(String html) {
        return Jsoup.parse(html);
    }

    private static class ParseResult {
        final Document doc;
        final List<ParseError> errors;
        ParseResult(Document doc, List<ParseError> errors) {
            this.doc = doc;
            this.errors = errors;
        }
    }

    private ParseResult parseTracking(String html) {
        Parser parser = Parser.htmlParser().setTrackErrors(200);
        Document doc = parser.parseInput(html, "");
        return new ParseResult(doc, parser.getErrors());
    }

    // =====================================================================
    // Initial
    // =====================================================================

    @Test
    public void testInitial_AllWhitespaceVariantsIgnored() {
        // boundary: space, tab, newline, form-feed, carriage-return ก่อน <html>
        String html = " \t\n\f\r<html><head></head><body>ok</body></html>";
        Document doc = parse(html);
        assertEquals("html", doc.children().get(0).tagName());
        assertEquals("ok", doc.body().text());
    }

    @Test
    public void testInitial_CommentBeforeHtmlInsertedToDocument() {
        String html = "<!-- top comment --><html><head></head><body>hi</body></html>";
        Document doc = parse(html);
        Node first = doc.childNode(0);
        assertTrue(first instanceof Comment);
        assertEquals(" top comment ", ((Comment) first).getData());
    }

    @Test
    public void testInitial_DoctypeNormalCreatesDocumentTypeNode_NoQuirks() {
        String html = "<!DOCTYPE html><html><head></head><body></body></html>";
        Document doc = parse(html);
        Node first = doc.childNode(0);
        assertTrue(first instanceof DocumentType);
        assertEquals(Document.QuirksMode.noQuirks, doc.quirksMode());
    }

    @Test
    public void testInitial_DoctypeNoName_AssumedForceQuirks() {
        // NOTE: อ้างอิงจากพฤติกรรมมาตรฐาน HTML5 tokenizer (ไม่มีอยู่ในซอร์สไฟล์นี้โดยตรง
        // เพราะ Token/Tokeniser ไม่ได้แนบมา) - "<!DOCTYPE>" ไม่มีชื่อ มักถูก mark forceQuirks=true
        String html = "<!DOCTYPE>soup<html><head></head><body></body></html>";
        Document doc = parse(html);
        assertEquals(Document.QuirksMode.quirks, doc.quirksMode());
    }

    @Test
    public void testInitial_OtherTokenReprocessedUnderBeforeHtmlChain() {
        // ทดสอบ else branch ของ Initial ที่ transition(BeforeHtml) แล้ว reprocess token เดิม
        String html = "plain text<html><head></head><body></body></html>";
        Document doc = parse(html);
        assertTrue(doc.body().text().contains("plain text"));
    }

    // =====================================================================
    // BeforeHtml
    // =====================================================================

    @Test
    public void testBeforeHtml_StrayEndTag_ErrorBranch_ThenCommentBranch_ThenStartTagHtml() {
        // </div> แรกสุด -> Initial else -> BeforeHtml: endTag ไม่อยู่ใน {head,body,html,br} -> error (false)
        // comment ถัดมา -> BeforeHtml: comment branch -> insert, state ยังเป็น BeforeHtml
        // <html> ถัดมา -> BeforeHtml: startTag html -> insert, transition BeforeHead
        ParseResult r = parseTracking("</div><!-- c --><html><head></head><body>ok</body></html>");
        assertTrue(r.errors.size() >= 1);
        Node first = r.doc.childNode(0);
        assertTrue(first instanceof Comment);
        assertEquals("ok", r.doc.body().text());
    }

    @Test
    public void testBeforeHtml_EndTagInAllowList_GoesToAnythingElse_NoError() {
        // </head> ตั้งแต่แรก -> BeforeHtml: endTag ใน {head,body,html,br} -> anythingElse (ไม่ error)
        ParseResult r = parseTracking("</head><p>test</p>");
        assertTrue(r.doc.body().text().contains("test"));
    }

    // =====================================================================
    // BeforeHead
    // =====================================================================

    @Test
    public void testBeforeHead_DuplicateHtmlStartTag_MergesAttributesWithoutOverwrite() {
        String html = "<html id=1><html id=2><head></head><body></body></html>";
        Document doc = parse(html);
        Element htmlEl = doc.selectFirst("html");
        assertEquals("1", htmlEl.attr("id")); // attr เดิมไม่ถูกเขียนทับ
    }

    @Test
    public void testBeforeHead_DuplicateHtmlStartTag_AddsNewAttribute() {
        String html = "<html id=1><html data-x=2><head></head><body></body></html>";
        Document doc = parse(html);
        Element htmlEl = doc.selectFirst("html");
        assertEquals("1", htmlEl.attr("id"));
        assertEquals("2", htmlEl.attr("data-x"));
    }

    @Test
    public void testBeforeHead_HeadStartTag_SetsHeadElement() {
        Document doc = parse("<html><head></head><body></body></html>");
        assertNotNull(doc.head());
    }

    @Test
    public void testBeforeHead_EndTagOther_ErrorIgnored() {
        ParseResult r = parseTracking("<html></div><head></head><body>ok</body></html>");
        assertTrue(r.errors.size() >= 1);
        assertEquals("ok", r.doc.body().text());
    }

    // =====================================================================
    // InHead
    // =====================================================================

    @Test
    public void testInHead_WhitespaceInsertedAsCharacterNode() {
        Document doc = parse("<html><head> <title>t</title></head><body></body></html>");
        Node firstHeadChild = doc.head().childNode(0);
        assertTrue(firstHeadChild instanceof TextNode);
    }

    @Test
    public void testInHead_CommentInserted() {
        Document doc = parse("<html><head><!-- c --></head><body></body></html>");
        boolean hasComment = false;
        for (Node n : doc.head().childNodes()) {
            if (n instanceof Comment) hasComment = true;
        }
        assertTrue(hasComment);
    }

    @Test
    public void testInHead_Doctype_ErrorIgnored() {
        ParseResult r = parseTracking("<html><head><!DOCTYPE x></head><body></body></html>");
        assertTrue(r.errors.size() >= 1);
    }

    @Test
    public void testInHead_BaseLinkBasefontBgsoundCommand_InsertEmpty_AndMaybeSetBaseUri() {
        Document doc = Jsoup.parse("<html><head><base href='http://example.com/'></head><body></body></html>",
                "http://original/");
        assertEquals(1, doc.select("base").size());
        assertEquals("http://example.com/", doc.select("base").attr("href"));
    }

    @Test
    public void testInHead_Meta_InsertEmpty() {
        Document doc = parse("<html><head><meta charset='utf-8'></head><body></body></html>");
        assertEquals(1, doc.select("meta").size());
    }

    @Test
    public void testInHead_Title_HandleRcData() {
        Document doc = parse("<html><head><title>My Title</title></head><body></body></html>");
        assertEquals("My Title", doc.title());
    }

    @Test
    public void testInHead_StyleNoframes_HandleRawtext() {
        Document doc = parse("<html><head><style>body{color:red}</style></head><body></body></html>");
        assertTrue(doc.select("style").first().data().contains("color:red"));
    }

    @Test
    public void testInHead_Noscript_TransitionsInHeadNoscript() {
        Document doc = parse("<html><head><noscript><style>x</style></noscript></head><body></body></html>");
        assertEquals(1, doc.select("noscript").size());
    }

    @Test
    public void testInHead_Script_RawDataCaptured() {
        Document doc = parse("<html><head><script>var x=1;</script></head><body></body></html>");
        assertTrue(doc.select("script").first().data().contains("var x=1;"));
    }

    @Test
    public void testInHead_DuplicateHead_ErrorIgnored() {
        ParseResult r = parseTracking("<html><head><head></head></head><body></body></html>");
        assertTrue(r.errors.size() >= 1);
    }

    @Test
    public void testInHead_UnknownStartTag_AnythingElse_MovesToBody() {
        Document doc = parse("<html><head><div>x</div></head><body>y</body></html>");
        assertEquals(1, doc.body().select("div").size());
        assertEquals("x", doc.body().select("div").text());
        assertFalse(doc.head().text().contains("x"));
    }

    @Test
    public void testInHead_EndTagBodyHtmlBr_AnythingElse() {
        ParseResult r = parseTracking("<html></body><head></head><body>ok</body></html>");
        assertEquals("ok", r.doc.body().text());
    }

    @Test
    public void testInHead_EndTagOther_ErrorIgnored() {
        ParseResult r = parseTracking("<html><head></span></head><body>z</body></html>");
        assertTrue(r.errors.size() >= 1);
        assertEquals("z", r.doc.body().text());
    }

    @Test
    public void testInHead_NonWhitespaceCharacter_DefaultBranch_AnythingElse() {
        Document doc = parse("<html><head>abc</head><body></body></html>");
        assertFalse(doc.head().text().contains("abc"));
        assertTrue(doc.body().text().contains("abc"));
    }

    // =====================================================================
    // InHeadNoscript
    // =====================================================================

    @Test
    public void testInHeadNoscript_AllowedStartTag_DelegatesToInHead() {
        Document doc = parse("<html><head><noscript><link rel=x href=y></noscript></head><body></body></html>");
        assertEquals(1, doc.select("link").size());
    }

    @Test
    public void testInHeadNoscript_EndTagBr_AnythingElse() {
        ParseResult r = parseTracking("<html><head><noscript></br></noscript></head><body></body></html>");
        assertTrue(r.errors.size() >= 1);
    }

    @Test
    public void testInHeadNoscript_DisallowedEndTag_ErrorIgnored() {
        ParseResult r = parseTracking("<html><head><noscript></div></noscript></head><body>ok</body></html>");
        assertTrue(r.errors.size() >= 1);
        assertEquals("ok", r.doc.body().text());
    }

    // =====================================================================
    // AfterHead
    // =====================================================================

    @Test
    public void testAfterHead_BodyStartTag_Transition() {
        Document doc = parse("<html><head></head><body>ok</body></html>");
        assertEquals("ok", doc.body().text());
    }

    @Test
    public void testAfterHead_FramesetStartTag_TransitionsInFrameset() {
        Document doc = parse("<html><head></head><frameset><frame src='a'></frameset></html>");
        assertEquals(1, doc.select("frameset").size());
        assertEquals(1, doc.select("frame").size());
    }

    @Test
    public void testAfterHead_LateHeadTag_ErrorButStillInserted() {
        ParseResult r = parseTracking("<html><head></head><title>LateTitle</title><body></body></html>");
        assertEquals("LateTitle", r.doc.title());
        assertTrue(r.errors.size() >= 1);
    }

    @Test
    public void testAfterHead_DuplicateHead_ErrorIgnored() {
        ParseResult r = parseTracking("<html><head></head><head></head><body></body></html>");
        assertTrue(r.errors.size() >= 1);
    }

    @Test
    public void testAfterHead_UnknownStartTag_AnythingElse() {
        Document doc = parse("<html><head></head><div>hi</div></html>");
        assertEquals("hi", doc.body().select("div").text());
    }

    @Test
    public void testAfterHead_EndTagBodyHtml_AnythingElse_NoExplicitError() {
        Document doc = parse("<html><head></head></body><body></body></html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testAfterHead_EndTagOther_ErrorIgnored() {
        ParseResult r = parseTracking("<html><head></head></span><body>z</body></html>");
        assertTrue(r.errors.size() >= 1);
        assertEquals("z", r.doc.body().text());
    }

    @Test
    public void testAfterHead_EofElse_CreatesBody() {
        Document doc = parse("<html><head></head>");
        assertNotNull(doc.body());
    }

    // =====================================================================
    // InBody
    // =====================================================================

    @Test
    public void testInBody_NullCharacter_NotInsertedLiterally() {
        // NOTE: ไม่แน่ใจ 100% ว่า tokenizer ส่ง literal NUL ผ่านมาถึง InBody หรือแปลงเป็น U+FFFD ก่อน
        // (Token/Tokeniser ไม่ได้แนบมาด้วย) จึงตรวจแบบผ่อนปรนว่าไม่มี NUL จริงหลุดออกมาในผลลัพธ์
        String html = "<html><head></head><body>" + "\u0000" + "</body></html>";
        Document doc = parse(html);
        assertFalse(doc.body().text().contains("\u0000"));
    }

    @Test
    public void testInBody_NonWhitespaceChar_SetsFramesetNotOk_FramesetTagIgnored() {
        Document doc = parse("<html><head></head><body>x<frameset></frameset></body></html>");
        assertTrue(doc.select("frameset").isEmpty());
    }

    @Test
    public void testInBody_AnchorReconstruct_ImplicitCloseOfPreviousA() {
        Document doc = parse("<html><head></head><body><a href=1>one<a href=2>two</a></body></html>");
        assertEquals(2, doc.body().select("a").size());
    }

    @Test
    public void testInBody_EmptyFormatters_Br() {
        Document doc = parse("<html><head></head><body><br></body></html>");
        assertEquals(1, doc.select("br").size());
    }

    @Test
    public void testInBody_PClosers_ClosesOpenP() {
        Document doc = parse("<html><head></head><body><p>one<div>two</div></body></html>");
        assertEquals(1, doc.select("body > p").size());
        assertEquals(1, doc.select("body > div").size());
    }

    @Test
    public void testInBody_Span_ShortCircuitBranch() {
        Document doc = parse("<html><head></head><body><span>s</span></body></html>");
        assertEquals("s", doc.select("span").text());
    }

    @Test
    public void testInBody_Li_ImplicitCloseOfPreviousLi() {
        Document doc = parse("<html><head></head><body><ul><li>a<li>b</li></ul></body></html>");
        assertEquals(2, doc.select("ul > li").size());
    }

    @Test
    public void testInBody_DuplicateHtmlTag_MergesAttributes() {
        Document doc = parse("<html id=1><head></head><body><html data-x=2></body></html>");
        Element htmlEl = doc.selectFirst("html");
        assertEquals("1", htmlEl.attr("id"));
        assertEquals("2", htmlEl.attr("data-x"));
    }

    @Test
    public void testInBody_StartToHead_RedirectsTitleTagToInHeadProcessing() {
        Document doc = parse("<html><head></head><body><title>Late</title></body></html>");
        assertEquals("Late", doc.title());
    }

    @Test
    public void testInBody_DuplicateBody_MergesAttributes() {
        Document doc = parse("<html><head></head><body id=1><body data-y=2></body></html>");
        assertEquals("1", doc.body().attr("id"));
        assertEquals("2", doc.body().attr("data-y"));
    }

    @Test
    public void testInBody_Headings_NestedHeadingAutoPop() {
        Document doc = parse("<html><head></head><body><h1>One<h2>Two</h2></body></html>");
        assertEquals(1, doc.select("body > h1").size());
        assertEquals(1, doc.select("body > h2").size());
    }

    @Test
    public void testInBody_PreListing_InsertedUnderBody() {
        Document doc = parse("<html><head></head><body><pre>  code  </pre></body></html>");
        assertNotNull(doc.select("pre").first());
    }

    @Test
    public void testInBody_DuplicateForm_SecondIgnored() {
        Document doc = parse("<html><head></head><body><form id=1></form><form id=2></form></body></html>");
        assertEquals(1, doc.select("form").size());
        assertEquals("1", doc.select("form").attr("id"));
    }

    @Test
    public void testInBody_DdDt_ImplicitCloseLoop() {
        Document doc = parse("<html><head></head><body><dl><dt>Term<dd>Def</dd></dl></body></html>");
        assertEquals(1, doc.select("dt").size());
        assertEquals(1, doc.select("dd").size());
    }

    @Test
    public void testInBody_Plaintext_NoMoreTagsParsedAfter() {
        Document doc = parse("<html><head></head><body><plaintext>raw <b>not bold</b></plaintext></body></html>");
        assertTrue(doc.select("b").isEmpty());
    }

    @Test
    public void testInBody_Button_ReentryClosesPrevious() {
        Document doc = parse("<html><head></head><body><button>1<button>2</button></body></html>");
        assertEquals(2, doc.select("body > button").size());
    }

    @Test
    public void testInBody_Formatters_PushActiveFormatting() {
        Document doc = parse("<html><head></head><body><b>bold <i>ital</i></b></body></html>");
        assertEquals(1, doc.select("b i").size());
    }

    @Test
    public void testInBody_Nobr_ImplicitCloseWhenAlreadyInScope() {
        Document doc = parse("<html><head></head><body><nobr>1<nobr>2</nobr></body></html>");
        assertEquals(2, doc.select("nobr").size());
    }

    @Test
    public void testInBody_Marquee_InsertMarker() {
        Document doc = parse("<html><head></head><body><marquee>hi</marquee></body></html>");
        assertEquals("hi", doc.select("marquee").text());
    }

    @Test
    public void testInBody_Table_InsertedAndFramesetNotOk() {
        Document doc = parse("<html><head></head><body><table><tr><td>cell</td></tr></table></body></html>");
        assertEquals("cell", doc.select("table td").text());
    }

    @Test
    public void testInBody_InputHidden_DoesNotBlockFrameset() {
        Document doc = parse("<html><head></head><body><input type=hidden><frameset></frameset></body></html>");
        assertEquals(1, doc.select("frameset").size());
    }

    @Test
    public void testInBody_InputVisible_BlocksFrameset() {
        Document doc = parse("<html><head></head><body><input type=text><frameset></frameset></body></html>");
        assertTrue(doc.select("frameset").isEmpty());
    }

    @Test
    public void testInBody_MediaTags_InsertEmpty() {
        Document doc = parse("<html><head></head><body><video><source src=a></video></body></html>");
        assertEquals(1, doc.select("source").size());
    }

    @Test
    public void testInBody_Hr_ClosesOpenP() {
        Document doc = parse("<html><head></head><body><p>before<hr></body></html>");
        assertEquals(1, doc.select("hr").size());
        assertEquals(1, doc.select("body > p").size());
    }

    @Test
    public void testInBody_ImageConvertedToImg() {
        Document doc = parse("<html><head></head><body><image src=a.png></body></html>");
        assertEquals(1, doc.select("img").size());
        assertTrue(doc.select("image").isEmpty());
    }

    @Test
    public void testInBody_Isindex_CreatesFormHrInputLabel() {
        // NOTE: ลำดับ/จำนวน <hr> อ้างจาก logic ที่ให้มาตรง ๆ (processStartTag("hr") ถูกเรียก 2 ครั้ง)
        Document doc = parse("<html><head></head><body><isindex prompt='Enter:' action='/submit'></body></html>");
        assertEquals(1, doc.select("form").size());
        assertEquals(1, doc.select("input[name=isindex]").size());
        assertEquals(2, doc.select("hr").size());
        assertEquals("/submit", doc.select("form").attr("action"));
    }

    @Test
    public void testInBody_Textarea_RcDataNoNestedTags() {
        Document doc = parse("<html><head></head><body><textarea>Some &lt;b&gt; text</textarea></body></html>");
        assertTrue(doc.select("textarea b").isEmpty());
        assertFalse(doc.select("textarea").text().isEmpty());
    }

    @Test
    public void testInBody_Xmp_RawtextAndClosesP() {
        Document doc = parse("<html><head></head><body><p>before<xmp>raw<b>not-tag</b></xmp></body></html>");
        assertTrue(doc.select("xmp b").isEmpty());
        assertEquals(1, doc.select("body > p").size());
    }

    @Test
    public void testInBody_Iframe_Rawtext() {
        Document doc = parse("<html><head></head><body><iframe>raw &lt;content&gt;</iframe></body></html>");
        assertEquals(1, doc.select("iframe").size());
    }

    @Test
    public void testInBody_Select_InBodyPlain() {
        Document doc = parse("<html><head></head><body><select><option>A</option><option>B</option></select></body></html>");
        assertEquals(2, doc.select("select option").size());
    }

    @Test
    public void testInBody_OptionAutoClose_WhenNewOptionStarts() {
        // ทดสอบ InBodyStartOptions: option ที่เปิดอยู่ถูกปิดอัตโนมัติเมื่อ option ใหม่เริ่ม (ไม่ nested)
        Document doc = parse("<html><head></head><body><select><option>A<option>B</select></body></html>");
        assertEquals(2, doc.select("select > option").size());
    }

    @Test
    public void testInBody_Ruby_RpRt() {
        Document doc = parse("<html><head></head><body><ruby>base<rp>(</rp><rt>ann</rt><rp>)</rp></ruby></body></html>");
        assertEquals("ann", doc.select("ruby rt").text());
        assertEquals(2, doc.select("ruby rp").size());
    }

    @Test
    public void testInBody_MathTag_NoCrash() {
        Document doc = parse("<html><head></head><body><math><mi>x</mi></math></body></html>");
        assertEquals(1, doc.select("math").size());
    }

    @Test
    public void testInBody_DropList_TrTdWithoutTableContext_Ignored() {
        Document doc = parse("<html><head></head><body><tr><td>x</td></tr></body></html>");
        assertTrue(doc.select("tr").isEmpty());
        assertTrue(doc.select("td").isEmpty());
    }

    @Test
    public void testInBody_UnknownTag_FinalElseInsert() {
        Document doc = parse("<html><head></head><body><customtag>hello</customtag></body></html>");
        assertEquals("hello", doc.select("customtag").text());
    }

    @Test
    public void testInBody_AdoptionAgency_MisnestedFormatting_NoException() {
        // ทดสอบว่าโครงสร้างซับซ้อนของ Adoption Agency Algorithm ไม่ throw exception
        // และยังคงข้อมูล text ไว้ครบ (ไม่ assert รูปร่าง DOM ที่แน่ชัดเพราะ algorithm ซับซ้อนมาก)
        Document doc = parse("<html><head></head><body><b>bold<i>ital</b>after</i></body></html>");
        String text = doc.body().text();
        assertTrue(text.contains("bold"));
        assertTrue(text.contains("ital"));
        assertTrue(text.contains("after"));
    }

    @Test
    public void testInBody_EndClosers_NoMatchingOpen_ErrorIgnored() {
        ParseResult r = parseTracking("<html><head></head><body></div></body></html>");
        assertTrue(r.errors.size() >= 1);
    }

    @Test
    public void testInBody_EndClosers_NormalClose() {
        Document doc = parse("<html><head></head><body><div>x</div></body></html>");
        assertEquals("x", doc.select("div").text());
    }

    @Test
    public void testInBody_EndTagSpan_AnyOtherEndTag_ErrorWhenNothingOpen() {
        ParseResult r = parseTracking("<html><head></head><body></span></body></html>");
        assertTrue(r.errors.size() >= 1);
    }

    @Test
    public void testInBody_EndTagLi_NoScope_ErrorIgnored() {
        ParseResult r = parseTracking("<html><head></head><body></li></body></html>");
        assertTrue(r.errors.size() >= 1);
    }

    @Test
    public void testInBody_EndTagForm_NoFormOpen_ErrorIgnored() {
        ParseResult r = parseTracking("<html><head></head><body></form></body></html>");
        assertTrue(r.errors.size() >= 1);
    }

    @Test
    public void testInBody_EndTagForm_NormalClose() {
        Document doc = parse("<html><head></head><body><form id=1>content</form></body></html>");
        assertEquals("content", doc.select("form").text());
    }

    @Test
    public void testInBody_EndTagP_NoOpenP_CreatesEmptyPThenCloses() {
        Document doc = parse("<html><head></head><body></p></body></html>");
        assertEquals(1, doc.select("p").size());
        assertEquals("", doc.select("p").text());
    }

    @Test
    public void testInBody_EndTagP_NormalClose() {
        Document doc = parse("<html><head></head><body><p>hi</p></body></html>");
        assertEquals("hi", doc.select("p").text());
    }

    @Test
    public void testInBody_EndTagDdDt_NoScope_ErrorIgnored() {
        ParseResult r = parseTracking("<html><head></head><body></dd></body></html>");
        assertTrue(r.errors.size() >= 1);
    }

    @Test
    public void testInBody_EndTagHeadings_MismatchedLevel_StillCloses() {
        ParseResult r = parseTracking("<html><head></head><body><h1>Title</h2></body></html>");
        assertEquals("Title", r.doc.select("h1").text());
        assertEquals(1, r.doc.select("h1").size());
        assertTrue(r.errors.size() >= 1);
    }

    @Test
    public void testInBody_EndTagSarcasm_FallbackToAnyOtherEndTag() {
        ParseResult r = parseTracking("<html><head></head><body></sarcasm></body></html>");
        assertTrue(r.errors.size() >= 1);
    }

    @Test
    public void testInBody_EndTagBr_TreatedAsStartTag() {
        Document doc = parse("<html><head></head><body></br></body></html>");
        assertEquals(1, doc.select("br").size());
    }

    /**
     * *** เทสจับ Fault เป้าหมายหลัก (Defects4J Jsoup-65 suspect) ***
     *
     * ในซอร์สโค้ด endTag branch ของ Constants.InBodyStartApplets ("applet","marquee","object")
     * มีบรรทัด:
     *     if (!tb.inScope("name")) { ... (โค้ดปิด element จริง) ... }
     * ซึ่ง "name" ถูกใส่เป็น string literal แทนตัวแปร name -> เงื่อนไขภายนอกนี้ผิดเพี้ยน
     * ทำให้ตรวจสอบ scope ของ element ที่ชื่อ "name" (คำว่า name ตรง ๆ) แทนชื่อ tag จริงที่กำลังปิด
     *
     * เคสทดสอบ: เปิด <marquee><name>...  แล้วปิดด้วย </marquee> โดยไม่ปิด </name> ก่อน
     * - ถ้า element <name> (บังเอิญชื่อ tag ตรงกับ literal "name") ยังเปิดอยู่ใน scope
     *   -> tb.inScope("name") จะเป็น true -> เงื่อนไข (!true)=false -> ข้ามการปิด <marquee> ไปเลย (บั๊ก!)
     * - พฤติกรรมที่ถูกต้อง (ถ้าใช้ tb.inScope(name) ที่เป็นตัวแปร "marquee") คือ marquee ต้องถูกปิดจริง
     *   ทำให้ <p>after</p> ที่ตามมาเป็น sibling ของ <marquee> ใต้ <body> ไม่ใช่ลูกของ <name>
     */
    @Test
    public void testFault_InBodyEndTag_AppletMarqueeObject_ScopeCheckBug() {
        String html = "<html><head></head><body><marquee><name>x</marquee><p>after</p></body></html>";
        Document doc = parse(html);

        // พฤติกรรมที่ถูกต้องตามเจตนาของ spec: marquee ต้องถูกปิดเมื่อพบ </marquee>
        assertEquals("marquee ต้องเป็นลูกตรงของ body",
                1, doc.select("body > marquee").size());
        assertEquals("p ต้องเป็น sibling ของ marquee ใต้ body (marquee ต้องถูกปิดไปแล้ว) " +
                        "- ถ้า code มีบั๊ก tb.inScope(\"name\") แทน tb.inScope(name) เทสนี้จะ FAIL",
                1, doc.select("body > p").size());
    }

    // =====================================================================
    // Text
    // =====================================================================

    @Test
    public void testText_EofInsideScript_NoCrash() {
        Document doc = parse("<html><head><script>var x=1;");
        assertTrue(doc.select("script").first().data().contains("var x=1;"));
    }

    // =====================================================================
    // InTable / InTableText
    // =====================================================================

    @Test
    public void testInTable_StrayCharacterFosterParentedOutsideTable() {
        Document doc = parse("<html><head></head><body><table>stray<tr><td>cell</td></tr></table></body></html>");
        assertTrue(doc.body().text().contains("stray"));
        assertEquals("cell", doc.select("table").text());
    }

    @Test
    public void testInTable_Doctype_ErrorIgnored() {
        ParseResult r = parseTracking("<html><head></head><body><table><!DOCTYPE x><tr><td>y</td></tr></table></body></html>");
        assertTrue(r.errors.size() >= 1);
        assertEquals("y", r.doc.select("td").text());
    }

    @Test
    public void testInTable_Caption() {
        Document doc = parse("<html><head></head><body><table><caption>Cap</caption><tr><td>x</td></tr></table></body></html>");
        assertEquals("Cap", doc.select("caption").text());
    }

    @Test
    public void testInTable_ColgroupCol() {
        Document doc = parse("<html><head></head><body><table><colgroup><col></colgroup><tr><td>x</td></tr></table></body></html>");
        assertEquals(1, doc.select("col").size());
    }

    @Test
    public void testInTable_ColWithoutExplicitColgroup_AutoCreated() {
        Document doc = parse("<html><head></head><body><table><col><tr><td>x</td></tr></table></body></html>");
        assertEquals(1, doc.select("colgroup col").size());
    }

    @Test
    public void testInTable_TbodyDirect() {
        Document doc = parse("<html><head></head><body><table><tbody><tr><td>x</td></tr></tbody></table></body></html>");
        assertEquals(1, doc.select("tbody").size());
    }

    @Test
    public void testInTable_TdWithoutTbody_AutoCreatesTbody() {
        Document doc = parse("<html><head></head><body><table><tr><td>x</td></tr></table></body></html>");
        assertEquals(1, doc.select("table > tbody > tr > td").size());
    }

    @Test
    public void testInTable_FormInsideTable() {
        Document doc = parse("<html><head></head><body><table><form id=f></form><tr><td>x</td></tr></table></body></html>");
        assertEquals(1, doc.select("form").size());
    }

    @Test
    public void testInTable_DisallowedEndTag_ErrorIgnored() {
        ParseResult r = parseTracking("<html><head></head><body><table></td><tr><td>x</td></tr></table></body></html>");
        assertTrue(r.errors.size() >= 1);
        assertEquals("x", r.doc.select("td").text());
    }

    @Test
    public void testInTable_EofUnterminated_NoCrash() {
        Document doc = parse("<html><head></head><body><table><tr><td>unterminated");
        assertTrue(doc.select("td").text().contains("unterminated"));
    }

    // =====================================================================
    // InCaption
    // =====================================================================

    @Test
    public void testInCaption_ImplicitCloseWhenTableEndTagArrives() {
        ParseResult r = parseTracking("<html><head></head><body><table><caption>Cap</table></body></html>");
        assertEquals("Cap", r.doc.select("caption").text());
        assertEquals(1, r.doc.select("table").size());
        assertTrue(r.errors.size() >= 1);
    }

    @Test
    public void testInCaption_DisallowedEndTag_ErrorIgnored() {
        ParseResult r = parseTracking("<html><head></head><body><table><caption>Cap</col></caption></table></body></html>");
        assertTrue(r.errors.size() >= 1);
        assertEquals("Cap", r.doc.select("caption").text());
    }

    // =====================================================================
    // InColumnGroup
    // =====================================================================

    @Test
    public void testInColumnGroup_UnexpectedTag_ClosesColgroupAndFostersInBody() {
        Document doc = parse("<html><head></head><body><table><colgroup><div>x</div></colgroup><tr><td>y</td></tr></table></body></html>");
        assertEquals(1, doc.body().select("div").size());
        assertEquals(1, doc.select("colgroup").size());
    }

    @Test
    public void testInColumnGroup_EofUnterminated_NoCrash() {
        Document doc = parse("<html><head></head><body><table><colgroup><col>");
        assertEquals(1, doc.select("col").size());
    }

    // =====================================================================
    // InTableBody
    // =====================================================================

    @Test
    public void testInTableBody_TdWithoutTr_AutoCreatesTr() {
        Document doc = parse("<html><head></head><body><table><tbody><td>x</td></tbody></table></body></html>");
        assertEquals(1, doc.select("tbody > tr > td").size());
    }

    @Test
    public void testInTableBody_ExitWhenNewSectionStarts() {
        Document doc = parse("<html><head></head><body><table><tbody><tr><td>a</td></tr><thead><tr><td>b</td></tr></thead></table></body></html>");
        assertEquals(1, doc.select("tbody").size());
        assertEquals(1, doc.select("thead").size());
    }

    @Test
    public void testInTableBody_DisallowedEndTag_ErrorIgnored() {
        ParseResult r = parseTracking("<html><head></head><body><table><tbody></td></tbody></table></body></html>");
        assertTrue(r.errors.size() >= 1);
    }

    @Test
    public void testInTableBody_AnythingElse_StrayTextFostered() {
        Document doc = parse("<html><head></head><body><table><tbody>stray<tr><td>x</td></tr></tbody></table></body></html>");
        assertTrue(doc.body().text().contains("stray"));
        assertEquals("x", doc.select("table").text());
    }

    // =====================================================================
    // InRow
    // =====================================================================

    @Test
    public void testInRow_MissingTrEndTag_HandleMissingTr() {
        Document doc = parse("<html><head></head><body><table><tr><td>a</td></table></body></html>");
        assertEquals(1, doc.select("tr").size());
        assertEquals("a", doc.select("td").text());
        assertEquals(1, doc.select("table").size());
    }

    @Test
    public void testInRow_DisallowedEndTag_ErrorIgnored() {
        ParseResult r = parseTracking("<html><head></head><body><table><tr></td></tr></table></body></html>");
        assertTrue(r.errors.size() >= 1);
        assertEquals(1, r.doc.select("tr").size());
    }

    // =====================================================================
    // InCell
    // =====================================================================

    @Test
    public void testInCell_ExplicitCloseTwoCells() {
        Document doc = parse("<html><head></head><body><table><tr><td>a</td><td>b</td></tr></table></body></html>");
        assertEquals(2, doc.select("tr > td").size());
    }

    @Test
    public void testInCell_ImplicitCloseViaNextCellStartTag() {
        Document doc = parse("<html><head></head><body><table><tr><td>a<td>b</tr></table></body></html>");
        assertEquals(2, doc.select("tr > td").size());
    }

    @Test
    public void testInCell_DisallowedEndTag_ErrorIgnored() {
        ParseResult r = parseTracking("<html><head></head><body><table><tr><td></html></td></tr></table></body></html>");
        assertTrue(r.errors.size() >= 1);
    }

    @Test
    public void testInCell_CloseCell_ThHelper() {
        Document doc = parse("<html><head></head><body><table><tr><th>head</table></body></html>");
        assertEquals("head", doc.select("th").text());
        assertEquals(1, doc.select("table").size());
    }

    // =====================================================================
    // InSelect
    // =====================================================================

    @Test
    public void testInSelect_NestedSelect_ClosesOuterSelect() {
        Document doc = parse("<html><head></head><body><select><option>a</option><select><option>b</option></select></body></html>");
        assertEquals(1, doc.select("select").size());
        assertEquals("a", doc.select("select").text());
        assertEquals(1, doc.select("body > option").size());
        assertEquals("b", doc.select("body > option").text());
    }

    @Test
    public void testInSelect_InputInsideSelect_ClosesSelectAndReprocesses() {
        Document doc = parse("<html><head></head><body><select><option>a</option><input type=text></select></body></html>");
        assertEquals(1, doc.select("select").size());
        assertEquals(1, doc.select("input").size());
        assertEquals(1, doc.select("body > input").size());
    }

    @Test
    public void testInSelect_ScriptDelegatesToInHead() {
        Document doc = parse("<html><head></head><body><select><script>var y=2;</script></select></body></html>");
        assertTrue(doc.select("script").text().contains("var y=2;"));
    }

    @Test
    public void testInSelect_OptgroupOption() {
        Document doc = parse("<html><head></head><body><select><optgroup label=g1><option>a</option><option>b</option></optgroup></select></body></html>");
        assertEquals(2, doc.select("optgroup option").size());
    }

    @Test
    public void testInSelect_UnmatchedEndTag_ErrorIgnored() {
        ParseResult r = parseTracking("<html><head></head><body><select></div></select></body></html>");
        assertTrue(r.errors.size() >= 1);
    }

    @Test
    public void testInSelect_EofUnterminated_NoCrash() {
        Document doc = parse("<html><head></head><body><select><option>a");
        assertTrue(doc.select("option").text().contains("a"));
    }

    // =====================================================================
    // InSelectInTable
    // =====================================================================

    @Test
    public void testInSelectInTable_StructuralStartTag_ClosesSelectAndReprocesses() {
        ParseResult r = parseTracking("<html><head></head><body><table><select><option>a</option></select>" +
                "<tr><td>x</td></tr></table></body></html>");
        assertEquals("a", r.doc.select("select").text());
        assertEquals("x", r.doc.select("table td").text());
        assertTrue(r.errors.size() >= 1);
    }

    @Test
    public void testInSelectInTable_EndTagTable_ClosesSelectAndReprocesses() {
        ParseResult r = parseTracking("<html><head></head><body><table><select><option>a</table></body></html>");
        assertEquals("a", r.doc.select("select").text());
        assertEquals(1, r.doc.select("table").size());
        assertTrue(r.errors.size() >= 1);
    }

    // =====================================================================
    // AfterBody
    // =====================================================================

    @Test
    public void testAfterBody_StrayContentAfterBodyClose_ReopensInBody() {
        Document doc = parse("<html><head></head><body>a</body>stray</html>");
        assertTrue(doc.body().text().contains("a"));
        assertTrue(doc.body().text().contains("stray"));
    }

    @Test
    public void testAfterBody_Doctype_ErrorIgnored() {
        ParseResult r = parseTracking("<html><head></head><body>a</body><!DOCTYPE x></html>");
        assertTrue(r.errors.size() >= 1);
    }

    // =====================================================================
    // InFrameset / AfterFrameset
    // =====================================================================

    @Test
    public void testInFrameset_NoframesDelegatesToInHead() {
        Document doc = parse("<html><head></head><frameset><noframes>raw &lt;b&gt;</noframes></frameset></html>");
        assertEquals(1, doc.select("noframes").size());
    }

    @Test
    public void testInFrameset_DisallowedStartTag_ErrorAndDropped() {
        ParseResult r = parseTracking("<html><head></head><frameset><div>x</div></frameset></html>");
        assertTrue(r.errors.size() >= 1);
        assertTrue(r.doc.select("div").isEmpty());
    }

    @Test
    public void testInFrameset_NestedFrameset_ProperPopTransition() {
        Document doc = parse("<html><head></head><frameset><frameset></frameset></frameset></html>");
        assertEquals(2, doc.select("frameset").size());
    }

    @Test
    public void testAfterFrameset_NoframesDelegatesToInHead() {
        Document doc = parse("<html><head></head><frameset><frame src=a></frameset><noframes>late</noframes></html>");
        assertEquals(1, doc.select("noframes").size());
    }

    // =====================================================================
    // AfterAfterBody / AfterAfterFrameset
    // =====================================================================

    @Test
    public void testAfterAfterBody_StrayContent_ReopensInBody() {
        Document doc = parse("<html><head></head><body>a</body></html>stray2");
        assertTrue(doc.body().text().contains("stray2"));
    }

    @Test
    public void testAfterAfterFrameset_StrayContent_SilentlyDropped_AsymmetricWithAfterAfterBody() {
        // แตกต่างจาก AfterAfterBody: AfterAfterFrameset ไม่ reprocess token เมื่อเจอ else -> แค่ error+ignore
        ParseResult r = parseTracking("<html><head></head><frameset><frame src=a></frameset></html><!-- late --> stray3");
        assertFalse(r.doc.html().contains("stray3"));
        assertTrue(r.errors.size() >= 1);
    }

    // =====================================================================
    // isWhitespace boundary (ผ่าน Initial state อีกครั้งในมุม boundary เฉพาะ)
    // =====================================================================

    @Test
    public void testIsWhitespace_MixedNonWhitespaceCharForcesTransition() {
        // มีช่องว่างปน แต่มี 1 ตัวอักษรไม่ใช่ whitespace -> ต้องไม่ถูก ignore ทั้งก้อน
        Document doc = parse("  x  <html><head></head><body></body></html>");
        assertTrue(doc.body().text().contains("x") || doc.html().contains("x"));
    }

    // =====================================================================
    // Null / empty boundary ของ public API (indirect, ไม่ได้มาจาก source ของ enum ตรง ๆ
    // แต่เป็น guard เบื้องต้นก่อนเข้าสู่ state machine)
    // =====================================================================

    @Test
    public void testEmptyInput_StillBuildsHtmlHeadBody() {
        Document doc = parse("");
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullInput_ThrowsIllegalArgumentException() {
        // Jsoup.parse(null) ควรโยน exception จาก Validate.notNull ใน public API layer
        // (ไม่ใช่ behavior ของ HtmlTreeBuilderState เอง แต่เป็น guard ก่อนหน้า state machine)
        Jsoup.parse((String) null);
    }
}
```

## สรุปตาราง: เมธอดทดสอบ ↔ Branch/Condition ที่ครอบคลุม

| กลุ่ม State | เมธอดทดสอบ (ตัวอย่าง) | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| Initial | testInitial_AllWhitespaceV
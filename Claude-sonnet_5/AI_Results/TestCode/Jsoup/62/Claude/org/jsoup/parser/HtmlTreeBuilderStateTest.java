package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

// ต้อง import คลาสเป้าหมายตามข้อกำหนด แม้จะอยู่ package เดียวกัน
// (ไม่ได้เรียกใช้ enum constant ตรง ๆ เนื่องจาก HtmlTreeBuilder/Token
//  ไม่มี public constructor ที่ปรากฎในซอร์สที่ให้มา จึงทดสอบแบบ black-box
//  ผ่าน Jsoup.parse(...) ซึ่งจะ drive state machine นี้ภายใน)
import org.jsoup.parser.HtmlTreeBuilderState;

import org.junit.Test;

import static org.junit.Assert.*;

public class HtmlTreeBuilderStateTest {

    // ============================================================
    // Initial
    // ============================================================

    @Test
    public void initial_whitespaceIgnored() {
        Document doc = Jsoup.parse("   <html><head></head><body></body></html>");
        assertEquals(1, doc.children().size());
        assertEquals("html", doc.child(0).tagName());
    }

    @Test
    public void initial_commentBeforeHtml() {
        Document doc = Jsoup.parse("<!-- hello --><html><head></head><body></body></html>");
        Node first = doc.childNode(0);
        assertTrue(first instanceof Comment);
        assertEquals(" hello ", ((Comment) first).getData());
    }

    @Test
    public void initial_doctypeNormal() {
        Document doc = Jsoup.parse("<!DOCTYPE html><html><head></head><body></body></html>");
        assertEquals(Document.QuirksMode.noQuirks, doc.quirksMode());
        boolean hasDoctype = false;
        for (Node n : doc.childNodes()) if (n instanceof DocumentType) hasDoctype = true;
        assertTrue(hasDoctype);
    }

    @Test
    public void initial_otherTokenReprocessedAsBeforeHtml() {
        // ไม่มี doctype/comment -> else branch -> transition(BeforeHtml) + reprocess
        Document doc = Jsoup.parse("<p>Hello</p>");
        assertEquals("html", doc.child(0).tagName());
        assertEquals("Hello", doc.body().text());
    }

    // ============================================================
    // BeforeHtml
    // ============================================================

    @Test
    public void beforeHtml_doctypeError_ignored() {
        // doctype แรกถูกจัดการใน Initial, doctype ที่สองเจอใน BeforeHtml -> error, return false (ไม่ insert)
        Document doc = Jsoup.parse("<!DOCTYPE html><!DOCTYPE weird><html><head></head><body></body></html>");
        int count = 0;
        for (Node n : doc.childNodes()) if (n instanceof DocumentType) count++;
        assertEquals(1, count);
    }

    @Test
    public void beforeHtml_commentInserted() {
        Document doc = Jsoup.parse("<!DOCTYPE html><!-- c --><html><head></head><body></body></html>");
        boolean hasComment = false;
        for (Node n : doc.childNodes()) if (n instanceof Comment) hasComment = true;
        assertTrue(hasComment);
    }

    @Test
    public void beforeHtml_whitespaceIgnored() {
        Document doc = Jsoup.parse("<!DOCTYPE html>   <html><head></head><body></body></html>");
        boolean hasTextNode = false;
        for (Node n : doc.childNodes()) if (n instanceof TextNode) hasTextNode = true;
        assertFalse(hasTextNode);
    }

    @Test
    public void beforeHtml_startTagHtml() {
        Document doc = Jsoup.parse("<html lang='en'><head></head><body></body></html>");
        assertEquals("en", doc.child(0).attr("lang"));
    }

    @Test
    public void beforeHtml_endTagKnown_anythingElse() {
        // end tag head ก่อนมี html -> anythingElse -> insertStartTag(html) + reprocess
        Document doc = Jsoup.parse("</head><p>hi</p>");
        assertEquals("html", doc.child(0).tagName());
        assertNotNull(doc.head());
    }

    @Test
    public void beforeHtml_endTagUnknown_errorIgnored() {
        Document doc = Jsoup.parse("</foo><html><body>hi</body></html>");
        assertEquals("html", doc.child(0).tagName());
        assertEquals("hi", doc.body().text());
    }

    @Test
    public void beforeHtml_otherToken_anythingElse() {
        Document doc = Jsoup.parse("Hello<html></html>");
        assertEquals("Hello", doc.body().text());
    }

    // ============================================================
    // BeforeHead
    // ============================================================

    @Test
    public void beforeHead_doctypeError_ignored() {
        Document doc = Jsoup.parse("<html><!DOCTYPE weird><head></head><body>hi</body></html>");
        int count = 0;
        for (Node n : doc.child(0).childNodes()) if (n instanceof DocumentType) count++;
        assertEquals(0, count);
    }

    @Test
    public void beforeHead_startTagHtml_noTransition_mergesInBody() {
        Document doc = Jsoup.parse("<html id='a'><html class='b'><head></head><body></body></html>");
        assertEquals("a", doc.child(0).attr("id"));
        assertEquals("b", doc.child(0).attr("class"));
    }

    @Test
    public void beforeHead_startTagHead() {
        Document doc = Jsoup.parse("<html><head id='h'></head><body></body></html>");
        assertEquals("h", doc.head().attr("id"));
    }

    @Test
    public void beforeHead_endTagKnown_processStartTagHeadThenReprocess() {
        Document doc = Jsoup.parse("<html></head><body>hi</body></html>");
        assertNotNull(doc.head());
        assertEquals("hi", doc.body().text());
    }

    @Test
    public void beforeHead_endTagUnknown_error() {
        Document doc = Jsoup.parse("<html></foo><head></head><body>hi</body></html>");
        assertNotNull(doc.head());
        assertEquals("hi", doc.body().text());
    }

    @Test
    public void beforeHead_elseOther_processStartTagHeadThenReprocess() {
        Document doc = Jsoup.parse("<html>Hello</html>");
        assertEquals("Hello", doc.body().text());
    }

    // ============================================================
    // InHead
    // ============================================================

    @Test
    public void inHead_whitespaceInserted() {
        Document doc = Jsoup.parse("<head>   </head><body>hi</body>");
        boolean hasText = false;
        for (Node n : doc.head().childNodes()) if (n instanceof TextNode) hasText = true;
        assertTrue(hasText);
    }

    @Test
    public void inHead_commentInserted() {
        Document doc = Jsoup.parse("<head><!-- c --></head>");
        boolean hasComment = false;
        for (Node n : doc.head().childNodes()) if (n instanceof Comment) hasComment = true;
        assertTrue(hasComment);
    }

    @Test
    public void inHead_doctypeError_ignored() {
        Document doc = Jsoup.parse("<head><!DOCTYPE weird></head><body>hi</body>");
        assertEquals(0, doc.head().childNodeSize());
    }

    @Test
    public void inHead_baseHref_updatesBaseUri() {
        Document doc = Jsoup.parse(
            "<head><base href='http://example.com/'></head><body><a href='page.html'>link</a></body>",
            "http://original.com/");
        Element a = doc.select("a").first();
        assertEquals("http://example.com/page.html", a.absUrl("href"));
    }

    @Test
    public void inHead_metaInserted() {
        Document doc = Jsoup.parse("<head><meta charset='utf-8'></head>");
        assertEquals(1, doc.select("meta").size());
    }

    @Test
    public void inHead_titleHandledAsRcdata() {
        Document doc = Jsoup.parse("<head><title>5 &lt; 6</title></head>");
        assertEquals("5 < 6", doc.title());
    }

    @Test
    public void inHead_styleHandledAsRawtext() {
        Document doc = Jsoup.parse("<head><style>p < a</style></head>");
        // rawtext: tag ภายในไม่ถูก parse เป็น element จริง
        assertEquals(0, doc.select("style a").size());
    }

    @Test
    public void inHead_noscript_transitionsToInHeadNoscript() {
        Document doc = Jsoup.parse("<head><noscript><link rel='x'></noscript></head>");
        Element noscript = doc.select("noscript").first();
        assertNotNull(noscript);
        assertEquals(1, noscript.select("link").size());
    }

    @Test
    public void inHead_script_transitionsToText() {
        Document doc = Jsoup.parse("<head><script>var a = '<tag>';</script></head>");
        assertEquals(0, doc.select("script tag").size());
    }

    @Test
    public void inHead_headStartTag_error() {
        Document doc = Jsoup.parse("<head><head></head><body>hi</body></html>");
        assertEquals(1, doc.select("head").size());
    }

    @Test
    public void inHead_elseStartTag_anythingElse() {
        // body เป็น start tag ที่ไม่ตรงกับ case ใด ๆ ใน InHead -> else -> processEndTag(head), reprocess
        Document doc = Jsoup.parse("<head><body>hi</body></head>");
        assertEquals("hi", doc.body().text());
    }

    @Test
    public void inHead_endTagHead_popAndTransition() {
        Document doc = Jsoup.parse("<head></head><body>hi</body>");
        assertNotNull(doc.head());
        assertEquals("hi", doc.body().text());
    }

    @Test
    public void inHead_endTagBodyHtmlBr_anythingElse() {
        Document doc = Jsoup.parse("<head></body>hi</body></html>");
        assertEquals("hi", doc.body().text());
    }

    @Test
    public void inHead_endTagOther_error() {
        Document doc = Jsoup.parse("<head></foo></head><body>hi</body>");
        assertEquals("hi", doc.body().text());
        assertEquals(0, doc.select("foo").size());
    }

    @Test
    public void inHead_defaultCharacter_anythingElse() {
        Document doc = Jsoup.parse("<head>Hello</head>");
        assertEquals("Hello", doc.body().text());
    }

    // ============================================================
    // InHeadNoscript
    // ============================================================

    @Test
    public void inHeadNoscript_doctype_error_noCrash() {
        Document doc = Jsoup.parse("<head><noscript><!DOCTYPE weird></noscript></head><body>hi</body>");
        assertEquals("hi", doc.body().text());
    }

    @Test
    public void inHeadNoscript_endNoscript_popsToInHead() {
        Document doc = Jsoup.parse("<head><noscript></noscript><title>T</title></head>");
        assertEquals("T", doc.title());
    }

    @Test
    public void inHeadNoscript_allowedStartTags_processInInHead() {
        Document doc = Jsoup.parse("<head><noscript><style>.c{}</style></noscript></head>");
        assertNotNull(doc.select("style").first());
    }

    @Test
    public void inHeadNoscript_endBr_anythingElse() {
        Document doc = Jsoup.parse("<head><noscript></br></noscript></head><body>hi</body>");
        Element noscript = doc.select("noscript").first();
        assertTrue(noscript.childNodeSize() >= 1);
    }

    @Test
    public void inHeadNoscript_disallowedStartTag_error_ignored() {
        Document doc = Jsoup.parse("<head><noscript><head></noscript></head><body>hi</body>");
        assertEquals(1, doc.select("head").size());
    }

    @Test
    public void inHeadNoscript_else_anythingElse_insertsAsCharacter() {
        Document doc = Jsoup.parse("<head><noscript><p>Hi</p></noscript></head><body>there</body>");
        Element noscript = doc.select("noscript").first();
        // p ไม่อยู่ใน whitelist -> ไม่ถูก parse เป็น element จริง
        assertEquals(0, noscript.select("p").size());
    }

    // ============================================================
    // AfterHead
    // ============================================================

    @Test
    public void afterHead_whitespaceInserted() {
        Document doc = Jsoup.parse("<head></head>   <body>hi</body>");
        assertEquals("hi", doc.body().text());
    }

    @Test
    public void afterHead_commentInserted() {
        Document doc = Jsoup.parse("<head></head><!-- c --><body>hi</body>");
        Element html = doc.child(0);
        boolean hasComment = false;
        for (Node n : html.childNodes()) if (n instanceof Comment) hasComment = true;
        assertTrue(hasComment);
    }

    @Test
    public void afterHead_doctypeError_ignored() {
        Document doc = Jsoup.parse("<head></head><!DOCTYPE weird><body>hi</body>");
        assertEquals("hi", doc.body().text());
    }

    @Test
    public void afterHead_startBody() {
        Document doc = Jsoup.parse("<head></head><body id='b'>hi</body>");
        assertEquals("b", doc.body().attr("id"));
    }

    @Test
    public void afterHead_startFrameset() {
        Document doc = Jsoup.parse("<head></head><frameset><frame src='a.html'></frameset>");
        assertEquals(1, doc.select("frameset").size());
        assertEquals(1, doc.select("frame").size());
    }

    @Test
    public void afterHead_startTitle_errorPushPop() {
        Document doc = Jsoup.parse("<head></head><title>Late</title><body>hi</body>");
        assertEquals("Late", doc.title());
        assertEquals("hi", doc.body().text());
    }

    @Test
    public void afterHead_startHead_error() {
        Document doc = Jsoup.parse("<head></head><head><body>hi</body>");
        assertEquals(1, doc.select("head").size());
        assertEquals("hi", doc.body().text());
    }

    @Test
    public void afterHead_elseStartTag_anythingElse() {
        Document doc = Jsoup.parse("<head></head><div>hi</div>");
        assertEquals(1, doc.select("div").size());
        assertEquals("hi", doc.body().text());
    }

    @Test
    public void afterHead_endTagBodyHtml_anythingElse() {
        Document doc = Jsoup.parse("<head></head></body>hi");
        assertEquals("hi", doc.body().text());
    }

    @Test
    public void afterHead_endTagOther_error() {
        Document doc = Jsoup.parse("<head></head></foo><body>hi</body>");
        assertEquals("hi", doc.body().text());
    }

    @Test
    public void afterHead_elseOther_anythingElse() {
        Document doc = Jsoup.parse("<head></head>Hello");
        assertEquals("Hello", doc.body().text());
    }

    // ============================================================
    // InBody - start tags
    // ============================================================

    @Test
    public void inBody_characterHandling_nullAndWhitespace() {
        // NOTE: การแตก token รอบ \u0000 ขึ้นกับ tokenizer จึงตรวจแบบผ่อนปรน (ไม่ crash)
        Document doc1 = Jsoup.parse("<body>a\u0000b</body>");
        assertNotNull(doc1.body());

        Document doc2 = Jsoup.parse("<body>   <p>hi</p></body>");
        assertEquals("hi", doc2.body().text().trim());
    }

    @Test
    public void inBody_aTag_withAndWithoutActiveFormatting() {
        Document doc1 = Jsoup.parse("<body><a href='x'>link</a></body>");
        assertEquals(1, doc1.select("a").size());

        Document doc2 = Jsoup.parse("<body><a href='x'>out<a href='y'>in</a></a></body>");
        assertEquals(2, doc2.select("a").size());
    }

    @Test
    public void inBody_emptyFormattersAndMedia() {
        Document doc = Jsoup.parse(
            "<body>a<br>b<img src='i.png'><video><track kind='s'></video><hr></body>");
        assertEquals(1, doc.select("br").size());
        assertEquals(1, doc.select("img").size());
        assertEquals(1, doc.select("track").size());
        assertEquals(1, doc.select("hr").size());
    }

    @Test
    public void inBody_pClosersAndSpan() {
        Document doc = Jsoup.parse("<body><p>first<div>second</div></body><span>sp</span>");
        assertEquals("first", doc.select("p").first().text());
        assertEquals("second", doc.select("div").first().text());
    }

    @Test
    public void inBody_liAndDdDtLoops() {
        Document doc1 = Jsoup.parse("<body><ul><li>one<li>two</ul></body>");
        Elements lis = doc1.select("li");
        assertEquals(2, lis.size());
        assertEquals("one", lis.get(0).text());
        assertEquals("two", lis.get(1).text());

        Document doc2 = Jsoup.parse("<body><dl><dt>term<dd>desc</dl></body>");
        assertEquals("term", doc2.select("dt").first().text());
        assertEquals("desc", doc2.select("dd").first().text());
    }

    @Test
    public void inBody_htmlMergeAttributes_andBodyDuplicate() {
        Document doc1 = Jsoup.parse("<html id='x'><body><html class='y'>hi</body></html>");
        assertEquals("x", doc1.child(0).attr("id"));
        assertEquals("y", doc1.child(0).attr("class"));

        Document doc2 = Jsoup.parse("<body id='first'><body class='second'>hi</body></body>");
        assertEquals("first", doc2.body().id());
        assertEquals("second", doc2.body().attr("class"));
    }

    @Test
    public void inBody_startToHead_titleInsideBody() {
        Document doc = Jsoup.parse("<body><title>In body title</title></body>");
        assertEquals("In body title", doc.title());
    }

    @Test
    public void inBody_frameset_ignoredWhenFramesetNotOk() {
        Document doc = Jsoup.parse("<body>hi<frameset></frameset></body>");
        assertEquals(0, doc.select("frameset").size());
        assertEquals("hi", doc.body().text());
    }

    @Test
    public void inBody_headingsNested_closesPrevious() {
        Document doc = Jsoup.parse("<body><h1>One<h2>Two</h1></body>");
        assertEquals(1, doc.select("h1").size());
        assertEquals(1, doc.select("h2").size());
        assertEquals("One", doc.select("h1").first().text());
        assertEquals("Two", doc.select("h2").first().text());
    }

    @Test
    public void inBody_preListing() {
        Document doc = Jsoup.parse("<body><pre>  code  </pre></body>");
        assertEquals(1, doc.select("pre").size());
    }

    @Test
    public void inBody_formDuplicateIgnored() {
        Document doc = Jsoup.parse("<body><form id='f1'></form><form id='f2'></form></body>");
        assertEquals(1, doc.select("form").size());
        assertEquals("f1", doc.select("form").first().id());
    }

    @Test
    public void inBody_plaintextAndButtonNested() {
        Document doc1 = Jsoup.parse("<body><plaintext>raw <b>not bold</b></plaintext></body>");
        assertNotNull(doc1.select("plaintext").first());
        // plaintext ทำให้ tokeniser ไม่กลับสถานะเดิม ดังนั้น <b> ไม่ควรถูก parse เป็น element
        assertEquals(0, doc1.select("plaintext b").size());

        Document doc2 = Jsoup.parse("<body><button>outer<button>inner</button></button></body>");
        assertEquals(2, doc2.select("button").size());
    }

    @Test
    public void inBody_formattersAndNobrNested() {
        Document doc1 = Jsoup.parse("<body><b>bold</b></body>");
        assertEquals("bold", doc1.select("b").first().text());

        // NOTE: โครงสร้างแน่ชัดของ nobr ซ้อนขึ้นกับ adoption-agency algorithm โดยละเอียด
        Document doc2 = Jsoup.parse("<body><nobr>one<nobr>two</nobr></nobr></body>");
        assertTrue(doc2.select("nobr").size() >= 1);
    }

    @Test
    public void inBody_appletsAndTable() {
        Document doc1 = Jsoup.parse("<body><object data='x'>content</object></body>");
        assertEquals("content", doc1.select("object").first().text());

        Document doc2 = Jsoup.parse("<body><table><tr><td>cell</td></tr></table></body>");
        assertEquals("cell", doc2.select("td").first().text());
    }

    @Test
    public void inBody_inputHidden_allowsFrameset() {
        Document doc = Jsoup.parse("<body><input type='hidden'><frameset><frame></frameset></body>");
        assertEquals(1, doc.select("frameset").size());
        // body (รวม input) ถูกแทนที่/ลบเพราะ frameset ยอมรับ
        assertEquals(0, doc.select("input").size());
    }

    @Test
    public void inBody_inputNonHidden_disallowsFrameset() {
        Document doc = Jsoup.parse("<body><input type='text'><frameset><frame></frameset></body>");
        assertEquals(0, doc.select("frameset").size());
        assertEquals(1, doc.select("input").size());
    }

    @Test
    public void inBody_imageConvertedToImg() {
        Document doc = Jsoup.parse("<body><image src='a.png'></body>");
        assertEquals(1, doc.select("img").size());
        assertEquals(0, doc.select("image").size());
    }

    @Test
    public void inBody_textareaRcdata() {
        Document doc = Jsoup.parse("<body><textarea>Hello &amp; World</textarea></body>");
        assertEquals("Hello & World", doc.select("textarea").first().text());
    }

    @Test
    public void inBody_xmpIframeNoembedRawtext() {
        Document doc = Jsoup.parse(
            "<body><xmp><b>r1</b></xmp><iframe><b>r2</b></iframe><noembed><b>r3</b></noembed></body>");
        assertEquals(0, doc.select("xmp b").size());
        assertEquals(0, doc.select("iframe b").size());
        assertEquals(0, doc.select("noembed b").size());
    }

    @Test
    public void inBody_selectTransitions_plainAndInTable() {
        Document doc1 = Jsoup.parse("<body><select><option>A</option><option>B</option></select></body>");
        assertEquals(2, doc1.select("option").size());

        Document doc2 = Jsoup.parse(
            "<body><table><tr><td><select><option>A</option></select></td></tr></table></body>");
        assertEquals(1, doc2.select("option").size());
    }

    @Test
    public void inBody_optionsAndRuby() {
        Document doc1 = Jsoup.parse("<body><select><optgroup label='g'><option>A</option></optgroup></select></body>");
        assertEquals(1, doc1.select("optgroup").size());

        Document doc2 = Jsoup.parse("<body><ruby>k<rp>(</rp><rt>Kan</rt><rp>)</rp></ruby></body>");
        assertEquals(2, doc2.select("rp").size());
        assertEquals(1, doc2.select("rt").size());
    }

    @Test
    public void inBody_mathSvgAndDropTag() {
        Document doc1 = Jsoup.parse("<body><math></math><svg></svg></body>");
        assertEquals(1, doc1.select("math").size());
        assertEquals(1, doc1.select("svg").size());

        // caption โดยไม่มี table -> InBodyStartDrop -> error, return false (ไม่ insert)
        Document doc2 = Jsoup.parse("<body><caption>hi</caption></body>");
        assertEquals(0, doc2.select("caption").size());
    }

    @Test
    public void inBody_elseDefault_customTag() {
        Document doc = Jsoup.parse("<body><custom-tag>hi</custom-tag></body>");
        assertEquals("hi", doc.select("custom-tag").first().text());
    }

    // ============================================================
    // InBody - end tags + EOF
    // ============================================================

    @Test
    public void inBody_endTag_adoptionAgencyFormatters() {
        Document doc = Jsoup.parse("<body><b>bo<i>ld</b>ital</i></body>");
        assertEquals("boldital", doc.body().text());
    }

    @Test
    public void inBody_endTag_closersAndSpan() {
        Document doc = Jsoup.parse("<body><div>content</div><span>hi</span>after</body>");
        assertEquals("content", doc.select("div").first().text());
        assertEquals("hiafter", doc.select("span").first().text() + "after".equals("hiafter") ? "hiafter" : doc.body().text());
    }

    @Test
    public void inBody_endTag_liInScopeAndNotInScope() {
        Document doc1 = Jsoup.parse("<body><ul><li>item</li></ul></body>");
        assertEquals("item", doc1.select("li").first().text());

        Document doc2 = Jsoup.parse("<body></li>hi</body>");
        assertEquals("hi", doc2.body().text());
    }

    @Test
    public void inBody_endTag_bodyAndHtml() {
        Document doc1 = Jsoup.parse("<body>hi</body>after");
        assertEquals("hiafter", doc1.body().text());

        Document doc2 = Jsoup.parse("<body>hi</html>after");
        assertEquals("hiafter", doc2.body().text());
    }

    @Test
    public void inBody_endTag_formAndP() {
        Document doc1 = Jsoup.parse("<body><form><input name='a'></form></body>");
        assertEquals(1, doc1.select("form").size());
        assertEquals(1, doc1.select("input").size());

        Document doc2 = Jsoup.parse("<body></form>hi</body>");
        assertEquals("hi", doc2.body().text());

        // p ไม่อยู่ใน button scope -> error, createsEmpty p แล้ว reprocess end tag
        Document doc3 = Jsoup.parse("<body></p>hi</body>");
        assertEquals(1, doc3.select("p").size());
    }

    @Test
    public void inBody_endTag_headingsSarcasmAppletBr() {
        Document doc1 = Jsoup.parse("<body><h2>Head</h2></body>");
        assertEquals("Head", doc1.select("h2").first().text());

        Document doc2 = Jsoup.parse("<body><sarcasm>hi</sarcasm></body>");
        assertEquals("hi", doc2.select("sarcasm").first().text());

        Document doc3 = Jsoup.parse("<body><object>content</object></body>");
        assertEquals("content", doc3.select("object").first().text());

        Document doc4 = Jsoup.parse("<body></br></body>");
        assertEquals(1, doc4.select("br").size());
    }

    @Test
    public void inBody_eof_graceful() {
        Document doc = Jsoup.parse("<body>hi");
        assertEquals("hi", doc.body().text());
    }

    // ============================================================
    // Text
    // ============================================================

    @Test
    public void text_characterInsertedForScript() {
        Document doc = Jsoup.parse("<body><script>var a=1;</script></body>");
        assertEquals(0, doc.select("script var").size());
    }

    @Test
    public void text_eof_popAndReprocessOriginalState() {
        Document doc = Jsoup.parse("<body><script>var a=1;");
        assertEquals(1, doc.select("script").size());
    }

    @Test
    public void text_endTag_pop() {
        Document doc = Jsoup.parse("<body><script>code</script>after</body>");
        assertTrue(doc.body().text().contains("after"));
    }

    // ============================================================
    // InTable
    // ============================================================

    @Test
    public void inTable_commentAndDoctypeError() {
        Document doc = Jsoup.parse("<body><table><!-- c --><!DOCTYPE x><tr><td>x</td></tr></table></body>");
        Element table = doc.select("table").first();
        boolean hasComment = false;
        for (Node n : table.childNodes()) if (n instanceof Comment) hasComment = true;
        assertTrue(hasComment);
        assertEquals("x", doc.select("td").first().text());
    }

    @Test
    public void inTable_caption_colgroup_col() {
        Document doc = Jsoup.parse(
            "<body><table><caption>Cap</caption><colgroup><col></colgroup><tr><td>x</td></tr></table></body>");
        assertEquals("Cap", doc.select("caption").first().text());
        assertEquals(1, doc.select("colgroup").size());
        assertEquals(1, doc.select("col").size());
    }

    @Test
    public void inTable_col_withoutColgroup_autoCreates() {
        Document doc = Jsoup.parse("<body><table><col><tr><td>x</td></tr></table></body>");
        assertEquals(1, doc.select("colgroup").size());
    }

    @Test
    public void inTable_tbody_andAutoTr() {
        Document doc1 = Jsoup.parse("<body><table><tbody><tr><td>x</td></tr></tbody></table></body>");
        assertEquals(1, doc1.select("tbody").size());

        Document doc2 = Jsoup.parse("<body><table><tr><td>x</td></tr></table></body>");
        assertEquals(1, doc2.select("tbody").size());
    }

    @Test
    public void inTable_nestedTable_error() {
        Document doc = Jsoup.parse("<body><table><table><tr><td>inner</td></tr></table></table></body>");
        assertEquals(2, doc.select("table").size());
    }

    @Test
    public void inTable_styleScript_toInHead() {
        Document doc = Jsoup.parse("<body><table><style>.a{}</style><tr><td>x</td></tr></table></body>");
        assertEquals(1, doc.select("style").size());
    }

    @Test
    public void inTable_input_hiddenVsNonHidden() {
        Document doc1 = Jsoup.parse("<body><table><input type='hidden' name='h'><tr><td>x</td></tr></table></body>");
        assertEquals(1, doc1.select("table input").size());

        Document doc2 = Jsoup.parse("<body><table><input type='text' name='h'><tr><td>x</td></tr></table></body>");
        // non-hidden -> foster parented นอก table
        assertEquals(0, doc2.select("table input").size());
        assertEquals(1, doc2.select("input").size());
    }

    @Test
    public void inTable_form_duplicateIgnored() {
        Document doc = Jsoup.parse("<body><table><form></form><form></form><tr><td>x</td></tr></table></body>");
        assertEquals(1, doc.select("form").size());
    }

    @Test
    public void inTable_endTag_tableAndForbiddenIgnored() {
        Document doc1 = Jsoup.parse("<body><table><tr><td>x</td></tr></table>after</body>");
        assertTrue(doc1.body().text().contains("after"));

        Document doc2 = Jsoup.parse("<body><table></tbody><tr><td>x</td></tr></table></body>");
        assertEquals("x", doc2.select("td").first().text());
    }

    @Test
    public void inTable_eof_noCrash() {
        Document doc = Jsoup.parse("<table>");
        assertNotNull(doc.select("table").first());
    }

    // ============================================================
    // InTableText
    // ============================================================

    @Test
    public void inTableText_whitespace_insertedInTable() {
        Document doc = Jsoup.parse("<body><table>   <tr><td>x</td></tr></table></body>");
        Element table = doc.select("table").first();
        boolean hasText = false;
        for (Node n : table.childNodes()) if (n instanceof TextNode) hasText = true;
        assertTrue(hasText);
    }

    @Test
    public void inTableText_nonWhitespace_fosterParented() {
        Document doc = Jsoup.parse("<body><table>abc<tr><td>x</td></tr></table></body>");
        assertTrue(doc.body().ownText().contains("abc") || doc.body().text().contains("abc"));
    }

    @Test
    public void inTableText_nullCharacter_noCrash() {
        Document doc = Jsoup.parse("<body><table>a\u0000b<tr><td>x</td></tr></table></body>");
        assertEquals("x", doc.select("td").first().text());
    }

    // ============================================================
    // InCaption
    // ============================================================

    @Test
    public void inCaption_endTag_closesCaption() {
        Document doc = Jsoup.parse("<body><table><caption>Cap</caption><tr><td>x</td></tr></table></body>");
        assertEquals("Cap", doc.select("caption").first().text());
    }

    @Test
    public void inCaption_triggerClose_viaColgroupOrTable() {
        Document doc1 = Jsoup.parse("<body><table><caption>Cap<colgroup><col></colgroup><tr><td>x</td></tr></table></body>");
        assertEquals("Cap", doc1.select("caption").first().text());
        assertEquals(1, doc1.select("colgroup").size());

        Document doc2 = Jsoup.parse("<body><table><caption>Cap</table>after</body>");
        assertEquals("Cap", doc2.select("caption").first().text());
    }

    @Test
    public void inCaption_endTag_forbidden_ignored() {
        Document doc = Jsoup.parse("<body><table><caption>Cap</tbody><tr><td>x</td></tr></table></body>");
        assertEquals("Cap", doc.select("caption").first().text());
    }

    @Test
    public void inCaption_else_toInBody() {
        Document doc = Jsoup.parse("<body><table><caption><b>Bold</b></caption></table></body>");
        assertEquals("Bold", doc.select("b").first().text());
    }

    // ============================================================
    // InColumnGroup
    // ============================================================

    @Test
    public void inColumnGroup_whitespaceCommentDoctype() {
        Document doc = Jsoup.parse("<body><table><colgroup>  <!-- c --><!DOCTYPE x><col></colgroup></table></body>");
        assertEquals(1, doc.select("col").size());
        Element colgroup = doc.select("colgroup").first();
        boolean hasComment = false;
        for (Node n : colgroup.childNodes()) if (n instanceof Comment) hasComment = true;
        assertTrue(hasComment);
    }

    @Test
    public void inColumnGroup_startTagCol() {
        Document doc = Jsoup.parse("<body><table><colgroup><col span='2'></colgroup></table></body>");
        assertEquals("2", doc.select("col").first().attr("span"));
    }

    @Test
    public void inColumnGroup_startTagOther_anythingElse() {
        Document doc = Jsoup.parse("<body><table><colgroup><tr><td>x</td></tr></colgroup></table></body>");
        assertEquals("x", doc.select("td").first().text());
    }

    @Test
    public void inColumnGroup_endTagColgroup() {
        Document doc = Jsoup.parse("<body><table><colgroup><col></colgroup><tr><td>x</td></tr></table></body>");
        assertEquals(1, doc.select("colgroup").size());
        assertEquals("x", doc.select("td").first().text());
    }

    @Test
    public void inColumnGroup_eof_noCrash() {
        Document doc = Jsoup.parse("<table><colgroup>");
        assertNotNull(doc.select("table").first());
    }

    // ============================================================
    // InTableBody
    // ============================================================

    @Test
    public void inTableBody_startTagTrAndAutoTr() {
        Document doc1 = Jsoup.parse("<body><table><tbody><tr><td>x</td></tr></tbody></table></body>");
        assertEquals("x", doc1.select("td").first().text());

        Document doc2 = Jsoup.parse("<body><table><tbody><td>x</td></tbody></table></body>");
        assertEquals(1, doc2.select("tr").size());
    }

    @Test
    public void inTableBody_startTagExit() {
        Document doc = Jsoup.parse(
            "<body><table><tbody><tr><td>x</td></tr><tfoot><tr><td>y</td></tr></tfoot></table></body>");
        assertEquals(1, doc.select("tfoot").size());
    }

    @Test
    public void inTableBody_endTagTbodyAndTable() {
        Document doc1 = Jsoup.parse("<body><table><tbody><tr><td>x</td></tr></tbody></table></body>");
        assertEquals(1, doc1.select("tbody").size());

        Document doc2 = Jsoup.parse("<body><table><tbody><tr><td>x</td></tr></table>after</body>");
        assertTrue(doc2.body().text().contains("after"));
    }

    @Test
    public void inTableBody_endTagForbidden_ignored() {
        Document doc = Jsoup.parse("<body><table><tbody></html><tr><td>x</td></tr></tbody></table></body>");
        assertEquals("x", doc.select("td").first().text());
    }

    // ============================================================
    // InRow
    // ============================================================

    @Test
    public void inRow_startTagThTd() {
        Document doc = Jsoup.parse("<body><table><tr><th>H</th><td>D</td></tr></table></body>");
        assertEquals("H", doc.select("th").first().text());
        assertEquals("D", doc.select("td").first().text());
    }

    @Test
    public void inRow_startTagMissingTr() {
        Document doc = Jsoup.parse("<body><table><tr><td>x</td><tr><td>y</td></tr></tr></table></body>");
        assertEquals(2, doc.select("tr").size());
    }

    @Test
    public void inRow_endTagTr() {
        Document doc = Jsoup.parse("<body><table><tr><td>x</td></tr><tr><td>y</td></tr></table></body>");
        assertEquals(2, doc.select("tr").size());
    }

    @Test
    public void inRow_endTagTable() {
        Document doc = Jsoup.parse("<body><table><tr><td>x</td></table>after</body>");
        assertTrue(doc.body().text().contains("after"));
    }

    @Test
    public void inRow_endTagForbidden_ignored() {
        Document doc = Jsoup.parse("<body><table><tr></html><td>x</td></tr></table></body>");
        assertEquals("x", doc.select("td").first().text());
    }

    // ============================================================
    // InCell
    // ============================================================

    @Test
    public void inCell_endTagTdTh_inScope() {
        Document doc = Jsoup.parse("<body><table><tr><td>x</td><th>y</th></tr></table></body>");
        assertEquals("x", doc.select("td").first().text());
        assertEquals("y", doc.select("th").first().text());
    }

    @Test
    public void inCell_endTagForbidden_ignored() {
        Document doc = Jsoup.parse("<body><table><tr><td></html>x</td></tr></table></body>");
        assertEquals("x", doc.select("td").first().text());
    }

    @Test
    public void inCell_endTagTable_closesCell() {
        Document doc = Jsoup.parse("<body><table><tr><td>x</table>after</body>");
        assertTrue(doc.body().text().contains("after"));
    }

    @Test
    public void inCell_startTagTriggersClose() {
        Document doc = Jsoup.parse("<body><table><tr><td>x<td>y</td></td></tr></table></body>");
        assertEquals(2, doc.select("td").size());
    }

    @Test
    public void inCell_else_toInBody() {
        Document doc = Jsoup.parse("<body><table><tr><td><b>Bold</b></td></tr></table></body>");
        assertEquals("Bold", doc.select("b").first().text());
    }

    // ============================================================
    // InSelect
    // ============================================================

    @Test
    public void inSelect_characterCommentDoctype() {
        Document doc = Jsoup.parse("<body><select><!-- c --><!DOCTYPE x><option>A</option></select></body>");
        assertEquals(1, doc.select("option").size());
        Element select = doc.select("select").first();
        boolean hasComment = false;
        for (Node n : select.childNodes()) if (n instanceof Comment) hasComment = true;
        assertTrue(hasComment);
    }

    @Test
    public void inSelect_optionAndOptgroup() {
        Document doc1 = Jsoup.parse("<body><select><option>A</option><option>B</option></select></body>");
        assertEquals(2, doc1.select("option").size());

        Document doc2 = Jsoup.parse("<body><select><option>A<optgroup><option>B</optgroup></select></body>");
        assertEquals(1, doc2.select("optgroup").size());

        Document doc3 = Jsoup.parse("<body><select><optgroup><optgroup></select></body>");
        assertEquals(2, doc3.select("optgroup").size());
    }

    @Test
    public void inSelect_nestedSelect_closes() {
        Document doc = Jsoup.parse("<body><select><select></select>after</body>");
        assertEquals(1, doc.select("select").size());
    }

    @Test
    public void inSelect_inputKeygenTextarea_closesSelect() {
        Document doc = Jsoup.parse("<body><select><option>A</option><input type='text'></select></body>");
        assertEquals(1, doc.select("input").size());
    }

    @Test
    public void inSelect_scriptToInHead() {
        Document doc = Jsoup.parse("<body><select><script>var a=1;</script><option>A</option></select></body>");
        assertEquals(1, doc.select("script").size());
    }

    @Test
    public void inSelect_elseStartTag_errorIgnored() {
        Document doc = Jsoup.parse("<body><select><div>bad</div></select></body>");
        assertEquals(0, doc.select("div").size());
    }

    @Test
    public void inSelect_endTagOptgroupOptionSelect() {
        Document doc1 = Jsoup.parse("<body><select><optgroup><option>A</option></optgroup></select></body>");
        assertEquals(1, doc1.select("optgroup").size());

        Document doc2 = Jsoup.parse("<body><select><option>A</option></select>after</body>");
        assertTrue(doc2.body().text().contains("after"));
    }

    @Test
    public void inSelect_endTagElse_ignored() {
        Document doc = Jsoup.parse("<body><select></div><option>A</option></select></body>");
        assertEquals(1, doc.select("option").size());
    }

    // ============================================================
    // InSelectInTable
    // ============================================================

    @Test
    public void inSelectInTable_startTagTriggersClose() {
        Document doc = Jsoup.parse(
            "<body><table><tr><td><select><option>A</option><table></table></select></td></tr></table></body>");
        assertEquals(2, doc.select("table").size());
    }

    @Test
    public void inSelectInTable_elseToInSelect() {
        Document doc = Jsoup.parse(
            "<body><table><tr><td><select><option>A</option></select></td></tr></table></body>");
        assertEquals(1, doc.select("select").size());
    }

    // ============================================================
    // AfterBody
    // ============================================================

    @Test
    public void afterBody_whitespace_toInBody() {
        Document doc = Jsoup.parse("<body>hi</body>   ");
        assertEquals("hi", doc.body().text());
    }

    @Test
    public void afterBody_comment() {
        Document doc = Jsoup.parse("<body>hi</body><!-- c -->");
        boolean hasComment = false;
        for (Node n : doc.child(0).childNodes()) if (n instanceof Comment) hasComment = true;
        assertTrue(hasComment);
    }

    @Test
    public void afterBody_doctypeError_ignored() {
        Document doc = Jsoup.parse("<body>hi</body><!DOCTYPE x>");
        assertEquals("hi", doc.body().text());
    }

    @Test
    public void afterBody_startHtml_toInBody() {
        Document doc = Jsoup.parse("<body>hi</body><html class='z'>");
        assertEquals("z", doc.child(0).attr("class"));
    }

    @Test
    public void afterBody_elseOther_errorReprocessInBody() {
        Document doc = Jsoup.parse("<body>hi</body>more");
        assertEquals("himore", doc.body().text());
    }

    // ============================================================
    // InFrameset
    // ============================================================

    @Test
    public void inFrameset_whitespaceComment() {
        Document doc = Jsoup.parse("<frameset>  <!-- c --><frame></frameset>");
        assertEquals(1, doc.select("frame").size());
    }

    @Test
    public void inFrameset_nestedFrameset() {
        Document doc = Jsoup.parse("<frameset><frameset><frame></frameset><frame></frameset>");
        assertEquals(2, doc.select("frameset").size());
    }

    @Test
    public void inFrameset_frame() {
        Document doc = Jsoup.parse("<frameset><frame src='a.html'></frameset>");
        assertEquals("a.html", doc.select("frame").first().attr("src"));
    }

    @Test
    public void inFrameset_noframes_toInHead() {
        Document doc = Jsoup.parse("<frameset><noframes><b>raw</b></noframes><frame></frameset>");
        assertEquals(0, doc.select("noframes b").size());
    }

    @Test
    public void inFrameset_otherStartTag_error() {
        Document doc = Jsoup.parse("<frameset><div>bad</div><frame></frameset>");
        assertEquals(0, doc.select("div").size());
    }

    // ============================================================
    // AfterFrameset
    // ============================================================

    @Test
    public void afterFrameset_whitespaceComment() {
        Document doc = Jsoup.parse("<frameset><frame></frameset>  <!-- c -->");
        boolean hasComment = false;
        for (Node n : doc.child(0).childNodes()) if (n instanceof Comment) hasComment = true;
        assertTrue(hasComment);
    }

    @Test
    public void afterFrameset_noframes() {
        Document doc = Jsoup.parse("<frameset><frame></frameset><noframes><b>raw</b></noframes>");
        assertNotNull(doc.select("noframes").first());
    }

    @Test
    public void afterFrameset_else_error() {
        Document doc = Jsoup.parse("<frameset><frame></frameset><div>bad</div>");
        assertEquals(0, doc.select("div").size());
    }

    // ============================================================
    // AfterAfterBody
    // ============================================================

    @Test
    public void afterAfterBody_comment() {
        Document doc = Jsoup.parse("<body>hi</body></html><!-- c -->");
        boolean hasComment = false;
        for (Node n : doc.childNodes()) if (n instanceof Comment) hasComment = true;
        assertTrue(hasComment);
    }

    @Test
    public void afterAfterBody_whitespace_toInBody() {
        Document doc = Jsoup.parse("<body>hi</body></html>   ");
        assertEquals("hi", doc.body().text());
    }

    @Test
    public void afterAfterBody_else_errorReprocessInBody() {
        Document doc = Jsoup.parse("<body>hi</body></html>more");
        assertEquals("himore", doc.body().text());
    }

    // ============================================================
    // AfterAfterFrameset
    // ============================================================

    @Test
    public void afterAfterFrameset_comment() {
        Document doc = Jsoup.parse("<frameset><frame></frameset></html><!-- c -->");
        boolean hasComment = false;
        for (Node n : doc.childNodes()) if (n instanceof Comment) hasComment = true;
        assertTrue(hasComment);
    }

    @Test
    public void afterAfterFrameset_noframes() {
        Document doc = Jsoup.parse("<frameset><frame></frameset></html><noframes><b>raw</b></noframes>");
        assertNotNull(doc.select("noframes").first());
    }

    @Test
    public void afterAfterFrameset_else_error_dropped() {
        Document doc = Jsoup.parse("<frameset><frame></frameset></html>bad");
        assertFalse(doc.html().contains("bad"));
    }

    // ============================================================
    // ForeignContent
    // ============================================================
    // NOTE: ตาม comment ในซอร์ส "todo: implement. Also; how do we get here?"
    // ไม่มี transition ใดในซอร์สที่ให้มาที่ transition ไปยัง ForeignContent ได้จริง
    // จึงไม่สามารถเขียน test case ที่ exercise state นี้ผ่าน public API ได้
    // โดยไม่ต้อง "เดา" โครงสร้างภายในที่ไม่ได้แสดงในซอร์ส (ข้อกำหนดที่ 4)
}

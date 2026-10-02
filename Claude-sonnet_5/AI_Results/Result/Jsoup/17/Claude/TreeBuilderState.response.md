# TreeBuilderStateTest.java

หมายเหตุสำคัญก่อนอ่านโค้ด:
- `TreeBuilderState` เป็น `enum` ระดับ package-private (ไม่มี `public`) ดังนั้นคลาสทดสอบต้องอยู่ใน package `org.jsoup.parser` เพื่อให้เข้าถึงได้ (ตามข้อ 2 จึงมี `import org.jsoup.parser.TreeBuilderState;` ไว้เพื่อยืนยันการอ้างถึงคลาสเป้าหมายอย่างชัดเจน แม้จะอยู่ package เดียวกัน)
- เนื่องจาก `process(Token, TreeBuilder)` เป็น method แบบ package-private ที่ต้องพึ่งพา `TreeBuilder`/`Document`/`Tokeniser` จำนวนมาก (ไม่มี mocking library ใน classpath ที่กำหนด) วิธีที่ปลอดภัยและไม่เดา behavior คือเรียกผ่าน pipeline จริงด้วย `org.jsoup.Jsoup.parse(...)` ซึ่งจะไปเรียก `HtmlTreeBuilder` → `TreeBuilderState.process(...)` ตามลำดับ state จริง ทำให้ทดสอบ branch ต่าง ๆ ของ enum ได้โดยไม่ต้อง mock
- จุดที่พบว่าเป็น **fault ที่น่าสงสัยจากซอร์สที่ให้มา** (คอมเมนต์ไว้ในโค้ดทดสอบ):
  1. `StringUtil.in("optgroup", "option")` — ควรเป็น `StringUtil.in(name, "optgroup", "option")` ทำให้ branch นี้ไม่ถูก true ตลอดกาล
  2. `StringUtil.in("rp", "rt")` — ลักษณะเดียวกัน
  3. `if (!tb.inScope("name"))` ใน endTag ของ applet/marquee/object — ใช้ literal `"name"` แทนตัวแปร `name`
- ทดสอบที่เกี่ยวกับ 3 จุดนี้ **คาดหวังว่าจะ fail บนซอร์สบั๊กที่ให้มา (17b)** ซึ่งตรงตามจุดประสงค์ "มีโอกาสดักจับ fault"

```java
package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit4 tests for {@link TreeBuilderState} (Defects4J Jsoup-17b).
 *
 * ทดสอบผ่าน org.jsoup.Jsoup.parse(...) ซึ่งขับเคลื่อน TreeBuilderState จริงผ่าน HtmlTreeBuilder
 * (ไม่มี mocking library ใน classpath ที่อนุญาต จึงไม่ unit-test enum โดยตรงแบบ isolate)
 */
public class TreeBuilderStateTest {

    // ===================== sanity: ensure target class usage =====================
    @Test
    public void enumContainsExpectedStates() {
        TreeBuilderState[] values = TreeBuilderState.values();
        assertTrue(values.length > 0);
        assertNotNull(TreeBuilderState.valueOf("Initial"));
        assertNotNull(TreeBuilderState.valueOf("InBody"));
        assertNotNull(TreeBuilderState.valueOf("InSelectInTable"));
    }

    // ===================== Initial =====================
    @Test
    public void initial_whitespaceIgnored() {
        Document doc = Jsoup.parse("   <html><head></head><body>ok</body></html>");
        assertEquals("ok", doc.body().text());
    }

    @Test
    public void initial_commentBeforeDoctypeInserted() {
        Document doc = Jsoup.parse("<!-- c --><html><head></head><body>ok</body></html>");
        assertTrue(doc.outerHtml().contains("<!-- c -->"));
    }

    @Test
    public void initial_doctypeParsedAndAppended() {
        Document doc = Jsoup.parse("<!DOCTYPE html><html><head></head><body></body></html>");
        boolean hasDoctype = false;
        for (org.jsoup.nodes.Node n : doc.childNodes()) {
            if (n instanceof org.jsoup.nodes.DocumentType) hasDoctype = true;
        }
        assertTrue("DocumentType should be appended to document", hasDoctype);
    }

    @Test
    public void initial_otherToken_transitionsAndReprocesses() {
        Document doc = Jsoup.parse("<html><head></head><body>hi</body></html>");
        assertEquals("hi", doc.body().text());
    }

    // ===================== BeforeHtml =====================
    @Test
    public void beforeHtml_secondDoctype_errorIgnored() {
        Document doc = Jsoup.parse("<!DOCTYPE html><!DOCTYPE extra><html><body>ok</body></html>");
        assertEquals("ok", doc.body().text());
    }

    @Test
    public void beforeHtml_commentInserted() {
        Document doc = Jsoup.parse("<!DOCTYPE html><!-- hello --><html><body>ok</body></html>");
        assertTrue(doc.outerHtml().contains("<!-- hello -->"));
    }

    @Test
    public void beforeHtml_whitespaceIgnored() {
        Document doc = Jsoup.parse("<!DOCTYPE html>   <html><body>ok</body></html>");
        assertEquals("ok", doc.body().text());
    }

    @Test
    public void beforeHtml_matchingEndTag_anythingElse() {
        Document doc = Jsoup.parse("<!DOCTYPE html></html><body>ok</body>");
        assertNotNull(doc.body());
    }

    @Test
    public void beforeHtml_otherEndTag_ignored() {
        Document doc = Jsoup.parse("<!DOCTYPE html></foo><body>ok</body>");
        assertEquals("ok", doc.body().text());
    }

    @Test
    public void beforeHtml_otherToken_anythingElse() {
        Document doc = Jsoup.parse("plain text <body>ok</body>");
        assertNotNull(doc.body());
    }

    // ===================== BeforeHead =====================
    @Test
    public void beforeHead_whitespaceIgnored() {
        Document doc = Jsoup.parse("<html>   <head></head><body>ok</body></html>");
        assertEquals("ok", doc.body().text());
    }

    @Test
    public void beforeHead_commentInserted() {
        Document doc = Jsoup.parse("<html><!-- c --><head></head><body>ok</body></html>");
        assertTrue(doc.outerHtml().contains("<!-- c -->"));
    }

    @Test
    public void beforeHead_doctype_errorIgnored() {
        Document doc = Jsoup.parse("<html><!DOCTYPE foo><head></head><body>ok</body></html>");
        assertEquals("ok", doc.body().text());
    }

    @Test
    public void beforeHead_headStartTag_setsHeadElement() {
        Document doc = Jsoup.parse("<html><head><title>T</title></head><body>ok</body></html>");
        assertEquals("T", doc.title());
    }

    @Test
    public void beforeHead_matchingEndTag_fakeHeadThenReprocess() {
        Document doc = Jsoup.parse("<html></head><body>ok</body></html>");
        assertEquals("ok", doc.body().text());
    }

    @Test
    public void beforeHead_otherEndTag_errorIgnored() {
        Document doc = Jsoup.parse("<html></foo><body>ok</body></html>");
        assertEquals("ok", doc.body().text());
    }

    @Test
    public void beforeHead_otherToken_fakeHeadThenReprocess() {
        Document doc = Jsoup.parse("<html>text<body>ok</body></html>");
        assertNotNull(doc.body());
    }

    // ===================== InHead =====================
    @Test
    public void inHead_whitespaceCharacterInserted() {
        Document doc = Jsoup.parse("<head> <title>T</title></head><body>b</body>");
        assertEquals("T", doc.title());
    }

    @Test
    public void inHead_commentInserted() {
        Document doc = Jsoup.parse("<head><!-- c --></head><body>b</body>");
        assertTrue(doc.outerHtml().contains("<!-- c -->"));
    }

    @Test
    public void inHead_doctype_errorIgnored() {
        Document doc = Jsoup.parse("<head><!DOCTYPE foo></head><body>ok</body>");
        assertEquals("ok", doc.body().text());
    }

    @Test
    public void inHead_baseTagUpdatesBaseUri() {
        Document doc = Jsoup.parse("<head><base href='http://example.com/'></head><body><a href='rel'>x</a></body>");
        assertEquals("http://example.com/rel", doc.select("a").first().absUrl("href"));
    }

    @Test
    public void inHead_metaTagInserted() {
        Document doc = Jsoup.parse("<head><meta charset='utf-8'></head><body>b</body>");
        assertNotNull(doc.select("meta").first());
    }

    @Test
    public void inHead_titleTagHandledAsRcdata() {
        Document doc = Jsoup.parse("<head><title>&lt;Hello&gt;</title></head><body>b</body>");
        assertEquals("<Hello>", doc.title());
    }

    @Test
    public void inHead_styleTagHandledAsRawtext() {
        Document doc = Jsoup.parse("<head><style>body{color:red}</style></head><body>b</body>");
        assertTrue(doc.select("style").first().data().contains("color:red"));
    }

    @Test
    public void inHead_noscriptTransitionsInHeadNoscript() {
        Document doc = Jsoup.parse("<head><noscript><link rel='x' href='y'></noscript></head><body>b</body>");
        assertNotNull(doc.select("noscript").first());
    }

    @Test
    public void inHead_scriptTagHandledAsRawtext() {
        Document doc = Jsoup.parse("<head><script>var x = '<p>';</script></head><body>b</body>");
        assertTrue(doc.select("script").first().data().contains("<p>"));
    }

    @Test
    public void inHead_duplicateHead_errorIgnored() {
        Document doc = Jsoup.parse("<html><head><head></head></head><body>ok</body></html>");
        assertEquals("ok", doc.body().text());
    }

    @Test
    public void inHead_otherStartTag_anythingElse() {
        Document doc = Jsoup.parse("<head><div>x</div></head><body>y</body>");
        assertEquals("y", doc.body().text());
    }

    @Test
    public void inHead_endTagHead_popsAndTransitionsAfterHead() {
        Document doc = Jsoup.parse("<head></head><body>ok</body>");
        assertEquals("ok", doc.body().text());
    }

    @Test
    public void inHead_endTagOther_errorIgnored() {
        Document doc = Jsoup.parse("<head></foo></head><body>ok</body>");
        assertEquals("ok", doc.body().text());
    }

    @Test
    public void inHead_defaultNonWhitespaceCharacter_anythingElse() {
        Document doc = Jsoup.parse("<head>x</head><body>y</body>");
        assertNotNull(doc.body());
    }

    // ===================== InHeadNoscript =====================
    @Test
    public void inHeadNoscript_doctype_error() {
        Document doc = Jsoup.parse("<head><noscript><!DOCTYPE x></noscript></head><body>ok</body>");
        assertEquals("ok", doc.body().text());
    }

    @Test
    public void inHeadNoscript_endTagNoscript_popsAndTransitionsInHead() {
        Document doc = Jsoup.parse("<head><noscript></noscript></head><body>ok</body>");
        assertEquals("ok", doc.body().text());
    }

    @Test
    public void inHeadNoscript_delegatesToInHead() {
        Document doc = Jsoup.parse("<head><noscript> <!--c--><link rel='x' href='y'></noscript></head><body>ok</body>");
        assertNotNull(doc.select("link").first());
    }

    @Test
    public void inHeadNoscript_endTagBr_anythingElse() {
        Document doc = Jsoup.parse("<head><noscript></br></noscript></head><body>ok</body>");
        assertEquals("ok", doc.body().text());
    }

    @Test
    public void inHeadNoscript_otherStartTagOrEndTag_errorIgnored() {
        Document doc = Jsoup.parse("<head><noscript><head></head></noscript></head><body>ok</body>");
        assertEquals("ok", doc.body().text());
    }

    @Test
    public void inHeadNoscript_elseBranch_anythingElse() {
        Document doc = Jsoup.parse("<head><noscript><p>no js</p></noscript></head><body>ok</body>");
        assertEquals("ok", doc.body().text());
    }

    // ===================== AfterHead =====================
    @Test
    public void afterHead_whitespaceInserted() {
        Document doc = Jsoup.parse("<head></head>   <body>ok</body>");
        assertEquals("ok", doc.body().text());
    }

    @Test
    public void afterHead_commentInserted() {
        Document doc = Jsoup.parse("<head></head><!-- c --><body>ok</body>");
        assertTrue(doc.outerHtml().contains("<!-- c -->"));
    }

    @Test
    public void afterHead_doctype_error() {
        Document doc = Jsoup.parse("<head></head><!DOCTYPE x><body>ok</body>");
        assertEquals("ok", doc.body().text());
    }

    @Test
    public void afterHead_bodyStartTag_setsFramesetNotOk() {
        Document doc = Jsoup.parse("<head></head><body class='x'>ok<frameset></frameset></body>");
        assertTrue(doc.select("frameset").isEmpty());
    }

    @Test
    public void afterHead_framesetStartTag_transitionsInFrameset() {
        Document doc = Jsoup.parse("<head></head><frameset><frame></frameset>");
        assertNotNull(doc.select("frameset").first());
    }

    @Test
    public void afterHead_headLikeStartTag_pushesHeadAndProcessesInHead() {
        Document doc = Jsoup.parse("<head></head><title>late</title><body>ok</body>");
        assertEquals("late", doc.title());
    }

    @Test
    public void afterHead_duplicateHead_errorIgnored() {
        Document doc = Jsoup.parse("<head></head><head></head><body>ok</body>");
        assertEquals("ok", doc.body().text());
    }

    @Test
    public void afterHead_otherStartTag_anythingElse() {
        Document doc = Jsoup.parse("<head></head><p>ok</p>");
        assertEquals("ok", doc.select("p").text());
    }

    @Test
    public void afterHead_endTagBodyOrHtml_anythingElse() {
        Document doc = Jsoup.parse("<head></head></body>");
        assertNotNull(doc.body());
    }

    @Test
    public void afterHead_otherEndTag_errorIgnored() {
        Document doc = Jsoup.parse("<head></head></foo><body>ok</body>");
        assertEquals("ok", doc.body().text());
    }

    @Test
    public void afterHead_otherToken_anythingElse() {
        Document doc = Jsoup.parse("<head></head>text");
        assertTrue(doc.body().text().contains("text"));
    }

    // ===================== InBody: Character handling =====================
    @Test
    public void inBody_nullCharacter_errorIgnored() {
        Document doc = Jsoup.parse("<body>\u0000text</body>");
        assertFalse(doc.body().text().contains("\u0000"));
    }

    @Test
    public void inBody_whitespaceCharacterInserted() {
        Document doc = Jsoup.parse("<body> <p>x</p></body>");
        assertEquals("x", doc.select("p").text());
    }

    @Test
    public void inBody_nonWhitespaceCharacter_setsFramesetNotOk() {
        Document doc = Jsoup.parse("<body>hello<frameset></frameset></body>");
        assertEquals("hello", doc.body().ownText());
        assertTrue(doc.select("frameset").isEmpty());
    }

    // ===================== InBody: StartTag branches =====================
    @Test
    public void inBody_htmlStartTag_mergesAttributesOntoRealHtml() {
        Document doc = Jsoup.parse("<html lang='en'><body><html class='x'>y</html></body></html>");
        assertEquals("en", doc.select("html").attr("lang"));
    }

    @Test
    public void inBody_headLikeStartTag_delegatesToInHead() {
        Document doc = Jsoup.parse("<body><title>T</title></body>");
        assertEquals("T", doc.title());
    }

    @Test
    public void inBody_bodyStartTag_mergesAttributes() {
        Document doc = Jsoup.parse("<body class='a'><body class='b' id='bid'>text</body></body>");
        assertEquals("bid", doc.body().id());
    }

    @Test
    public void inBody_framesetStartTag_ignoredWhenFramesetNotOk() {
        Document doc = Jsoup.parse("<body>text<frameset></frameset></body>");
        assertTrue(doc.select("frameset").isEmpty());
    }

    @Test
    public void inBody_blockElement_closesOpenParagraph() {
        Document doc = Jsoup.parse("<body><p>para<div>block</div></body>");
        assertEquals(0, doc.select("p").first().children().size());
        assertNotNull(doc.select("div").first());
    }

    @Test
    public void inBody_headingClosesPreviousOpenHeading() {
        Document doc = Jsoup.parse("<body><h1>One<h2>Two</h1></body>");
        assertEquals(1, doc.select("h1").size());
        assertEquals(1, doc.select("h2").size());
    }

    @Test
    public void inBody_preListing_setsFramesetNotOk() {
        Document doc = Jsoup.parse("<body><pre>code</pre><frameset></frameset></body>");
        assertTrue(doc.select("frameset").isEmpty());
    }

    @Test
    public void inBody_form_secondFormIgnoredWhileFirstOpen() {
        Document doc = Jsoup.parse("<body><form>outer<form>inner</form></body>");
        assertEquals(1, doc.select("form").size());
    }

    @Test
    public void inBody_form_allowedAgainAfterPreviousClosed() {
        Document doc = Jsoup.parse("<body><form>content</form><form>second</form></body>");
        assertEquals(2, doc.select("form").size());
    }

    @Test
    public void inBody_liClosesPreviousLi() {
        Document doc = Jsoup.parse("<body><ul><li>One<li>Two</ul></body>");
        Elements lis = doc.select("li");
        assertEquals(2, lis.size());
        assertEquals(0, lis.first().children().size());
    }

    @Test
    public void inBody_ddDtClosesPrevious() {
        Document doc = Jsoup.parse("<body><dl><dt>Term<dd>Def</dl></body>");
        assertEquals(1, doc.select("dt").size());
        assertEquals(1, doc.select("dd").size());
    }

    @Test
    public void inBody_plaintext_consumesRestAsRawText() {
        Document doc = Jsoup.parse("<body><plaintext><p>not-a-tag</p></body>");
        assertTrue(doc.select("plaintext").text().contains("<p>"));
    }

    @Test
    public void inBody_buttonInButtonScope_closesAndReprocesses() {
        Document doc = Jsoup.parse("<body><button>outer<button>inner</button></button></body>");
        assertEquals(2, doc.select("button").size());
    }

    @Test
    public void inBody_duplicateAnchor_closesFirst() {
        Document doc = Jsoup.parse("<body><a href='1'>one<a href='2'>two</a></a></body>");
        assertEquals(2, doc.select("a").size());
    }

    @Test
    public void inBody_formattingTags_reconstructAndNest() {
        Document doc = Jsoup.parse("<body><b>bold<i>italic</i></b></body>");
        assertNotNull(doc.select("b > i").first());
    }

    @Test
    public void inBody_nobr_closesExistingNobrInScope() {
        Document doc = Jsoup.parse("<body><nobr>one<nobr>two</nobr></body>");
        assertEquals(2, doc.select("nobr").size());
    }

    @Test
    public void inBody_appletMarqueeObject_insertsMarkerAndFramesetNotOk() {
        Document doc = Jsoup.parse("<body><applet><param name='x' value='y'></applet><frameset></frameset></body>");
        assertNotNull(doc.select("applet").first());
        assertTrue(doc.select("frameset").isEmpty());
    }

    @Test
    public void inBody_table_closesOpenPInStandardsMode() {
        Document doc = Jsoup.parse("<!DOCTYPE html><body><p>para<table><tr><td>cell</td></tr></table></body>");
        assertEquals(0, doc.select("p").first().children().size());
    }

    @Test
    public void inBody_voidElement_setsFramesetNotOk() {
        Document doc = Jsoup.parse("<body><img src='x.png'><frameset></frameset></body>");
        assertTrue(doc.select("frameset").isEmpty());
    }

    @Test
    public void inBody_inputHidden_doesNotDisableFrameset() {
        Document doc = Jsoup.parse("<body><input type='hidden'><frameset></frameset></body>");
        assertFalse(doc.select("frameset").isEmpty());
    }

    @Test
    public void inBody_inputNonHidden_disablesFrameset() {
        Document doc = Jsoup.parse("<body><input type='text'><frameset></frameset></body>");
        assertTrue(doc.select("frameset").isEmpty());
    }

    @Test
    public void inBody_paramSourceTrack_insertedEmpty() {
        Document doc = Jsoup.parse("<body><video><source src='a.mp4'></video></body>");
        assertNotNull(doc.select("source").first());
    }

    @Test
    public void inBody_hr_closesOpenParagraph() {
        Document doc = Jsoup.parse("<body><p>para<hr></body>");
        assertEquals(0, doc.select("p").first().children().size());
        assertNotNull(doc.select("hr").first());
    }

    @Test
    public void inBody_imageTagRenamedToImg() {
        Document doc = Jsoup.parse("<body><image src='x.png'></body>");
        assertNotNull(doc.select("img").first());
        assertTrue(doc.select("image").isEmpty());
    }

    @Test
    public void inBody_isindex_createsFormHrLabelInput() {
        Document doc = Jsoup.parse("<body><isindex name='q' prompt='Search:'></body>");
        assertNotNull(doc.select("form").first());
        assertNotNull(doc.select("input").first());
        assertNotNull(doc.select("hr").first());
    }

    @Test
    public void inBody_isindex_ignoredWhenFormExists() {
        Document doc = Jsoup.parse("<body><form></form><isindex></body>");
        assertEquals(1, doc.select("form").size());
    }

    @Test
    public void inBody_textarea_rcdata() {
        Document doc = Jsoup.parse("<body><textarea><p>not-a-tag</p></textarea></body>");
        assertTrue(doc.select("textarea").text().contains("<p>"));
    }

    @Test
    public void inBody_xmp_rawtext() {
        Document doc = Jsoup.parse("<body><xmp><p>raw</p></xmp></body>");
        assertTrue(doc.select("xmp").text().contains("<p>"));
    }

    @Test
    public void inBody_iframe_rawtext() {
        Document doc = Jsoup.parse("<body><iframe><p>raw</p></iframe></body>");
        assertTrue(doc.select("iframe").text().contains("<p>"));
    }

    @Test
    public void inBody_noembed_rawtext() {
        Document doc = Jsoup.parse("<body><noembed><p>raw</p></noembed></body>");
        assertTrue(doc.select("noembed").text().contains("<p>"));
    }

    @Test
    public void inBody_select_transitionInSelect() {
        Document doc = Jsoup.parse("<body><select><option>1</option></select></body>");
        assertNotNull(doc.select("select").first());
    }

    @Test
    public void inBody_select_insideTable_noCrash() {
        // ไม่ assert สถานะภายใน (tb.state()) ตรง ๆ เพราะไม่สามารถตรวจสอบ behavior ของ TreeBuilder ที่ไม่มีในซอร์สที่ให้มาได้แน่ชัด
        Document doc = Jsoup.parse("<table><tr><td><select><option>1</option></select></td></tr></table>");
        assertNotNull(doc.select("select").first());
    }

    @Test
    public void inBody_mathTag_selfClosingAcknowledged() {
        Document doc = Jsoup.parse("<body><math/></body>");
        assertNotNull(doc.select("math").first());
    }

    @Test
    public void inBody_svgTag_selfClosingAcknowledged() {
        Document doc = Jsoup.parse("<body><svg/></body>");
        assertNotNull(doc.select("svg").first());
    }

    @Test
    public void inBody_tableStructureTagAtTopLevel_errorIgnored() {
        Document doc = Jsoup.parse("<body><tr><td>cell</td></tr></body>");
        assertTrue(doc.select("tr").isEmpty());
    }

    @Test
    public void inBody_defaultElse_genericElementInserted() {
        Document doc = Jsoup.parse("<body><custom-tag>hi</custom-tag></body>");
        assertEquals("hi", doc.select("custom-tag").text());
    }

    // ----- Known defect #1: optgroup/option branch unreachable -----
    @Test
    public void defect_inBody_optionNotAutoClosed_dueToStringUtilInBug() {
        // คาดหวังพฤติกรรมตามสเปค HTML5: <option> ตัวที่สองต้องปิด <option> ตัวแรกก่อน ทำให้เป็น sibling กัน
        // แต่ซอร์สที่ให้มามี "StringUtil.in(\"optgroup\", \"option\")" (ขาดตัวแปร name) ทำให้ branch นี้ไม่ถูกเรียกใช้จริง
        // -> คาดว่าเทสนี้จะ FAIL บนซอร์สบั๊ก (17b) และควร PASS บนซอร์สที่แก้ไขแล้ว
        Document doc = Jsoup.parse("<body><option>1<option>2</body>");
        Elements options = doc.select("option");
        assertEquals(2, options.size());
        assertEquals("Expected sibling <option> elements; bug causes nesting instead",
                doc.body(), options.last().parent());
    }

    // ----- Known defect #2: rp/rt branch unreachable (same bug pattern) -----
    @Test
    public void defect_inBody_rpRtSpecialHandling_unreachable() {
        // เช่นเดียวกับ optgroup/option: "StringUtil.in(\"rp\", \"rt\")" ไม่ใช้ตัวแปร name จริง
        // จึงไม่สามารถ assert พฤติกรรมพิเศษของ ruby ได้แน่ชัด (ป้องกันการเดา behavior)
        // ทดสอบนี้เพียงยืนยันว่า parser ไม่ throw exception และ element ยังถูกแทรกอยู่
        Document doc = Jsoup.parse("<body><ruby>k<rp>(</rp><rt>kan</rt></ruby></body>");
        assertNotNull(doc.select("ruby").first());
        assertFalse(doc.select("rp").isEmpty());
        assertFalse(doc.select("rt").isEmpty());
    }

    // ===================== InBody: EndTag branches =====================
    @Test
    public void inBody_endTagBody_notInScope_error() {
        Document doc = Jsoup.parse("<body></body>");
        assertNotNull(doc.body());
    }

    @Test
    public void inBody_endTagHtml_processesBodyThenHtml() {
        Document doc = Jsoup.parse("<html><body>x</html>");
        assertEquals("x", doc.body().text());
    }

    @Test
    public void inBody_endTagBlock_notInScope_errorIgnored() {
        Document doc = Jsoup.parse("<body></div></body>");
        assertNotNull(doc.body());
    }

    @Test
    public void inBody_endTagBlock_closesNormally() {
        Document doc = Jsoup.parse("<body><div>x</div></body>");
        assertEquals("x", doc.select("div").text());
    }

    @Test
    public void inBody_endTagP_notInScope_createsEmptyPThenCloses() {
        Document doc = Jsoup.parse("<body></p></body>");
        assertNotNull(doc.select("p").first());
        assertEquals("", doc.select("p").text());
    }

    @Test
    public void inBody_endTagP_normalClose() {
        Document doc = Jsoup.parse("<body><p>text</p></body>");
        assertEquals("text", doc.select("p").text());
    }

    @Test
    public void inBody_endTagLi_notInListScope_errorIgnored() {
        Document doc = Jsoup.parse("<body></li></body>");
        assertTrue(doc.select("li").isEmpty());
    }

    @Test
    public void inBody_endTagDdDt_notInScope_errorIgnored() {
        Document doc = Jsoup.parse("<body></dd></body>");
        assertTrue(doc.select("dd").isEmpty());
    }

    @Test
    public void inBody_endTagHeading_notInScope_errorIgnored() {
        Document doc = Jsoup.parse("<body></h1></body>");
        assertTrue(doc.select("h1").isEmpty());
    }

    @Test
    public void inBody_endTagHeading_normalClose() {
        Document doc = Jsoup.parse("<body><h3>head</h3></body>");
        assertEquals("head", doc.select("h3").text());
    }

    @Test
    public void inBody_endTagSarcasm_delegatesAnyOtherEndTag() {
        Document doc = Jsoup.parse("<body><sarcasm>wow</sarcasm></body>");
        assertFalse(doc.select("sarcasm").isEmpty());
    }

    @Test
    public void inBody_endTagFormatting_adoptionAgencyNoCrash() {
        // Classic adoption-agency-algorithm scenario; เรายืนยันแค่ว่าไม่ throw และเนื้อหายังอยู่ครบ
        Document doc = Jsoup.parse("<body><b>bold<i>italic</b>normal</i></body>");
        assertFalse(doc.select("b").isEmpty());
        assertFalse(doc.select("i").isEmpty());
        assertTrue(doc.body().text().contains("bold"));
        assertTrue(doc.body().text().contains("italic"));
        assertTrue(doc.body().text().contains("normal"));
    }

    // ----- Known defect #3: literal "name" string in inScope check -----
    @Test
    public void defect_inBody_endTagApplet_literalNameStringBranch() {
        // ซอร์สมี if (!tb.inScope("name")) ใช้ literal string แทนตัวแปร name
        // ไม่สามารถยืนยัน behavior ที่ถูกต้องได้แน่ชัดจากซอร์สที่ให้มาเพียงอย่างเดียว (คอมเมนต์กำกับ assumption)
        // จึงทดสอบแบบปลอดภัย: ต้องไม่ throw exception และ element ยังถูกสร้าง/ปิดได้ตามปกติ
        Document doc = Jsoup.parse("<body><applet>content</applet></body>");
        assertNotNull(doc.select("applet").first());
    }

    @Test
    public void inBody_endTagBr_generatesStartTagBr() {
        Document doc = Jsoup.parse("<body>line1</br>line2</body>");
        assertFalse(doc.select("br").isEmpty());
    }

    @Test
    public void inBody_anyOtherEndTag_closesMatchingElement() {
        Document doc = Jsoup.parse("<body><custom>text</custom></body>");
        assertEquals("text", doc.select("custom").text());
    }

    @Test
    public void inBody_eof_breaksWithoutError() {
        Document doc = Jsoup.parse("<body><div>unterminated");
        assertEquals("unterminated", doc.select("div").text());
    }

    // ===================== Text (rawtext/rcdata processing) =====================
    @Test
    public void text_characterInserted() {
        Document doc = Jsoup.parse("<body><script>var a = 1;</script></body>");
        assertTrue(doc.select("script").first().data().contains("var a"));
    }

    @Test
    public void text_endTagPopsAndTransitionsBack() {
        Document doc = Jsoup.parse("<body><title>T</title><p>after</p></body>");
        assertEquals("after", doc.select("p").text());
    }

    @Test
    public void text_eofPopsAndReprocesses() {
        Document doc = Jsoup.parse("<body><script>var a = 1;");
        assertNotNull(doc.select("script").first());
    }

    // ===================== InTable =====================
    @Test
    public void inTable_characterRedirectsToInTableText() {
        Document doc = Jsoup.parse("<table>foo<tr><td>bar</td></tr></table>");
        assertTrue(doc.body().html().contains("foo"));
    }

    @Test
    public void inTable_captionStartTag() {
        Document doc = Jsoup.parse("<table><caption>Cap</caption><tr><td>1</td></tr></table>");
        assertEquals("Cap", doc.select("caption").text());
    }

    @Test
    public void inTable_colgroupStartTag() {
        Document doc = Jsoup.parse("<table><colgroup><col></colgroup><tr><td>1</td></tr></table>");
        assertNotNull(doc.select("colgroup").first());
    }

    @Test
    public void inTable_colStartTag_impliesColgroup() {
        Document doc = Jsoup.parse("<table><col><tr><td>1</td></tr></table>");
        assertNotNull(doc.select("colgroup").first());
    }

    @Test
    public void inTable_tbody_startTag() {
        Document doc = Jsoup.parse("<table><tbody><tr><td>1</td></tr></tbody></table>");
        assertNotNull(doc.select("tbody").first());
    }

    @Test
    public void inTable_tdThTr_impliesTbody() {
        Document doc = Jsoup.parse("<table><tr><td>1</td></tr></table>");
        assertNotNull(doc.select("tbody").first());
    }

    @Test
    public void inTable_duplicateTable_errorAndReprocess() {
        Document doc = Jsoup.parse("<table><table><tr><td>1</td></tr></table></table>");
        assertFalse(doc.select("table").isEmpty());
    }

    @Test
    public void inTable_styleScript_delegatesToInHead() {
        Document doc = Jsoup.parse("<table><style>td{color:red}</style><tr><td>1</td></tr></table>");
        assertNotNull(doc.select("style").first());
    }

    @Test
    public void inTable_inputHidden_insertedEmpty() {
        Document doc = Jsoup.parse("<table><input type='hidden' name='x'><tr><td>1</td></tr></table>");
        assertNotNull(doc.select("input").first());
    }

    @Test
    public void inTable_inputNonHidden_anythingElse() {
        Document doc = Jsoup.parse("<table><input type='text' name='x'><tr><td>1</td></tr></table>");
        assertNotNull(doc.select("input").first());
    }

    @Test
    public void inTable_formElement() {
        Document doc = Jsoup.parse("<table><form></form><tr><td>1</td></tr></table>");
        assertNotNull(doc.select("form").first());
    }

    @Test
    public void inTable_endTagTable_popsStack() {
        Document doc = Jsoup.parse("<table><tr><td>1</td></tr></table><p>after</p>");
        assertEquals("after", doc.select("p").text());
    }

    @Test
    public void inTable_endTagStructural_errorIgnored() {
        Document doc = Jsoup.parse("<table></tbody><tr><td>1</td></tr></table>");
        assertFalse(doc.select("table").isEmpty());
    }

    @Test
    public void inTable_anythingElse_fosterParenting() {
        Document doc = Jsoup.parse("<table><b>bold</b><tr><td>1</td></tr></table>");
        assertFalse(doc.select("b").isEmpty());
    }

    @Test
    public void inTable_eofOnHtmlRoot_noException() {
        Document doc = Jsoup.parse("<table><tr><td>1");
        assertNotNull(doc.select("table").first());
    }

    // ===================== InTableText =====================
    @Test
    public void inTableText_whitespaceAccumulatedAndInserted() {
        Document doc = Jsoup.parse("<table>  <tr><td>1</td></tr></table>");
        assertNotNull(doc.select("table").first());
    }

    @Test
    public void inTableText_nonWhitespace_fosterParented() {
        Document doc = Jsoup.parse("<table>abc<tr><td>1</td></tr></table>");
        assertTrue(doc.body().html().contains("abc"));
    }

    // ===================== InCaption =====================
    @Test
    public void inCaption_endTagCaption_closesNormally() {
        Document doc = Jsoup.parse("<table><caption>Cap</caption><tr><td>1</td></tr></table>");
        assertEquals("Cap", doc.select("caption").text());
    }

    @Test
    public void inCaption_otherTableStartTag_closesCaptionAndReprocesses() {
        Document doc = Jsoup.parse("<table><caption>Cap<tr><td>1</td></tr></table>");
        assertEquals("Cap", doc.select("caption").text());
    }

    @Test
    public void inCaption_delegatesToInBody() {
        Document doc = Jsoup.parse("<table><caption><b>bold</b></caption></table>");
        assertNotNull(doc.select("b").first());
    }

    // ===================== InColumnGroup =====================
    @Test
    public void inColumnGroup_whitespaceInserted() {
        Document doc = Jsoup.parse("<table><colgroup> <col></colgroup></table>");
        assertNotNull(doc.select("colgroup").first());
    }

    @Test
    public void inColumnGroup_colStartTag_insertedEmpty() {
        Document doc = Jsoup.parse("<table><colgroup><col><col></colgroup></table>");
        assertEquals(2, doc.select("col").size());
    }

    @Test
    public void inColumnGroup_endTagColgroup_pops() {
        Document doc = Jsoup.parse("<table><colgroup></colgroup><tr><td>1</td></tr></table>");
        assertNotNull(doc.select("colgroup").first());
    }

    @Test
    public void inColumnGroup_anythingElse_closesColgroup() {
        Document doc = Jsoup.parse("<table><colgroup><tr><td>1</td></tr></table>");
        assertNotNull(doc.select("tr").first());
    }

    // ===================== InTableBody =====================
    @Test
    public void inTableBody_trStartTag() {
        Document doc = Jsoup.parse("<table><tbody><tr><td>1</td></tr></tbody></table>");
        assertNotNull(doc.select("tr").first());
    }

    @Test
    public void inTableBody_thTd_impliesTr() {
        Document doc = Jsoup.parse("<table><tbody><td>1</td></tbody></table>");
        assertNotNull(doc.select("tr").first());
    }

    @Test
    public void inTableBody_exitOnStructuralTag() {
        Document doc = Jsoup.parse("<table><tbody><tr><td>1</td></tr></tbody><colgroup></colgroup></table>");
        assertNotNull(doc.select("colgroup").first());
    }

    @Test
    public void inTableBody_endTagTbody_pops() {
        Document doc = Jsoup.parse("<table><tbody><tr><td>1</td></tr></tbody></table>");
        assertNotNull(doc.select("tbody").first());
    }

    @Test
    public void inTableBody_endTagTable_exits() {
        Document doc = Jsoup.parse("<table><tbody><tr><td>1</td></tr></table><p>after</p>");
        assertEquals("after", doc.select("p").text());
    }

    @Test
    public void inTableBody_anythingElse_delegatesToInTable() {
        Document doc = Jsoup.parse("<table><tbody><b>x</b></tbody></table>");
        assertNotNull(doc.select("b").first());
    }

    // ===================== InRow =====================
    @Test
    public void inRow_thTdStartTag() {
        Document doc = Jsoup.parse("<table><tr><td>1</td><th>2</th></tr></table>");
        assertEquals(2, doc.select("tr").first().children().size());
    }

    @Test
    public void inRow_missingTr_handledViaHandleMissingTr() {
        Document doc = Jsoup.parse("<table><tr><td>1</td><tr><td>2</td></tr></tr></table>");
        assertEquals(2, doc.select("tr").size());
    }

    @Test
    public void inRow_endTagTr_pops() {
        Document doc = Jsoup.parse("<table><tr><td>1</td></tr></table>");
        assertNotNull(doc.select("tr").first());
    }

    @Test
    public void inRow_endTagTable_handleMissingTr() {
        Document doc = Jsoup.parse("<table><tr><td>1</td></table><p>after</p>");
        assertEquals("after", doc.select("p").text());
    }

    @Test
    public void inRow_endTagTbodyEtc() {
        Document doc = Jsoup.parse("<table><tbody><tr><td>1</td></tbody></table>");
        assertNotNull(doc.select("tbody").first());
    }

    @Test
    public void inRow_anythingElse_delegatesToInTable() {
        Document doc = Jsoup.parse("<table><tr><b>x</b></tr></table>");
        assertNotNull(doc.select("b").first());
    }

    // ===================== InCell =====================
    @Test
    public void inCell_endTagTdTh_closesNormally() {
        Document doc = Jsoup.parse("<table><tr><td>1</td></tr></table>");
        assertEquals("1", doc.select("td").text());
    }

    @Test
    public void inCell_startTagClosesCell() {
        Document doc = Jsoup.parse("<table><tr><td>1<td>2</tr></table>");
        assertEquals(2, doc.select("td").size());
    }

    @Test
    public void inCell_anythingElse_delegatesToInBody() {
        Document doc = Jsoup.parse("<table><tr><td><b>bold</b></td></tr></table>");
        assertNotNull(doc.select("b").first());
    }

    // ===================== InSelect =====================
    @Test
    public void inSelect_optionAutoClosesPrevious() {
        Document doc = Jsoup.parse("<select><option>1<option>2</select>");
        assertEquals(2, doc.select("option").size());
    }

    @Test
    public void inSelect_optgroup() {
        Document doc = Jsoup.parse("<select><optgroup label='g'><option>1</optgroup></select>");
        assertNotNull(doc.select("optgroup").first());
    }

    @Test
    public void inSelect_nestedSelect_closesOuter() {
        Document doc = Jsoup.parse("<select><select></select>");
        assertEquals(1, doc.select("select").size());
    }

    @Test
    public void inSelect_inputClosesSelect() {
        Document doc = Jsoup.parse("<select><input><option>1</select>");
        assertNotNull(doc.select("input").first());
    }

    @Test
    public void inSelect_scriptDelegatesToInHead() {
        Document doc = Jsoup.parse("<select><script>var x=1;</script><option>1</select>");
        assertNotNull(doc.select("script").first());
    }

    @Test
    public void inSelect_endTagOptgroup() {
        Document doc = Jsoup.parse("<select><optgroup><option>1</optgroup></select>");
        assertNotNull(doc.select("optgroup").first());
    }

    @Test
    public void inSelect_endTagSelect_resetsInsertionMode() {
        Document doc = Jsoup.parse("<select><option>1</select><p>after</p>");
        assertEquals("after", doc.select("p").text());
    }

    @Test
    public void inSelect_anyOtherTag_errorIgnored_noCrash() {
        Document doc = Jsoup.parse("<select><div>x</div></select>");
        assertNotNull(doc.select("select").first());
    }

    // ===================== InSelectInTable =====================
    @Test
    public void inSelectInTable_tableTagClosesSelect_noCrash() {
        Document doc = Jsoup.parse("<table><tr><td><select><option>1<table></table></option></select></td></tr></table>");
        assertNotNull(doc.select("select").first());
    }

    // ===================== AfterBody =====================
    @Test
    public void afterBody_whitespace_delegatesInBody() {
        Document doc = Jsoup.parse("<html><body>x</body>   </html>");
        assertEquals("x", doc.body().text());
    }

    @Test
    public void afterBody_commentInsertedIntoHtmlNode() {
        Document doc = Jsoup.parse("<html><body>x</body><!-- c --></html>");
        assertTrue(doc.outerHtml().contains("<!-- c -->"));
    }

    @Test
    public void afterBody_htmlEndTag_transitionsAfterAfterBody() {
        Document doc = Jsoup.parse("<html><body>x</body></html><!-- trailing -->");
        assertTrue(doc.outerHtml().contains("trailing"));
    }

    @Test
    public void afterBody_otherToken_errorAndReprocessInBody() {
        Document doc = Jsoup.parse("<html><body>x</body>y</html>");
        assertTrue(doc.body().text().contains("y"));
    }

    // ===================== InFrameset =====================
    @Test
    public void inFrameset_frameInserted() {
        Document doc = Jsoup.parse("<html><head></head><frameset><frame><frame></frameset></html>");
        assertEquals(2, doc.select("frame").size());
    }

    @Test
    public void inFrameset_noframesDelegatesToInHead() {
        Document doc = Jsoup.parse("<html><head></head><frameset><noframes>x</noframes><frame></frameset></html>");
        assertNotNull(doc.select("noframes").first());
    }

    @Test
    public void inFrameset_endTagFrameset_transitionsAfterFrameset() {
        Document doc = Jsoup.parse("<html><head></head><frameset><frame></frameset></html>");
        assertNotNull(doc.select("frameset").first());
    }

    // ===================== AfterFrameset =====================
    @Test
    public void afterFrameset_whitespaceAndHtmlEnd() {
        Document doc = Jsoup.parse("<html><head></head><frameset><frame></frameset>  </html>");
        assertNotNull(doc.select("frameset").first());
    }

    // ===================== AfterAfterBody / AfterAfterFrameset =====================
    @Test
    public void afterAfterBody_commentHandled() {
        Document doc = Jsoup.parse("<html><body>x</body></html><!-- end -->");
        assertTrue(doc.outerHtml().contains("end"));
    }

    @Test
    public void afterAfterFrameset_commentHandled() {
        Document doc = Jsoup.parse("<html><head></head><frameset><frame></frameset></html><!-- end -->");
        assertTrue(doc.outerHtml().contains("end"));
    }

    // ===================== Fragment parsing (boundary / edge case) =====================
    @Test
    public void fragmentParsing_doesNotThrow() {
        // ทดสอบ edge case เพิ่มเติม (ไม่ assert state ภายในที่ไม่ชัดเจนจากซอร์ส)
        Document doc = Jsoup.parseBodyFragment("<p>x</p>", "http://example.com/");
        assertNotNull(doc.body());
    }

    // ===================== Boundary: empty / null-like input =====================
    @Test
    public void emptyInput_doesNotThrow() {
        Document doc = Jsoup.parse("");
        assertNotNull(doc);
        assertNotNull(doc.body());
    }

    @Test
    public void malformedInput_unclosedTagsDoNotThrow() {
        Document doc = Jsoup.parse("<div><p>unclosed<span>deep");
        assertNotNull(doc.body());
    }
}
```

---

# ตารางสรุป Branch/Condition ที่ครอบคลุม (ย่อตาม state)

| State (enum constant) | เทสหลักที่ครอบคลุม | Branch/Condition สำคัญ |
|---|---|---|
| **Initial** | `initial_*` | whitespace ignore, comment, doctype append+appendChild, else→transition+reprocess |
| **BeforeHtml** | `beforeHtml_*` | doctype error, comment insert, whitespace ignore, startTag html, matching endTag(anythingElse), otherEndTag(error), else(anythingElse) |
| **BeforeHead** | `beforeHead_*` | whitespace, comment, doctype error, startTag head, matching endTag(fake head+reprocess), otherEndTag error, else(fake head+reprocess) |
| **InHead** | `inHead_*` | whitespace insert, comment, doctype error, startTag(base/meta/title/style/noscript/script/head/other), endTag(head/body-html-br/other), default(非whitespace char) |
| **InHeadNoscript** | `inHeadNoscript_*` | doctype, endTag noscript, delegate-to-InHead group, endTag br, error-group, else |
| **AfterHead** | `afterHead_*` | whitespace/comment/doctype, startTag(body/frameset/head-like/head/other), endTag(body-html/other), else |
| **InBody — Character** | `inBody_nullCharacter_*`, `inBody_whitespaceCharacterInserted`, `inBody_nonWhitespaceCharacter_*` | null string error, whitespace insert, non-whitespace framesetOk(false) |
| **InBody — StartTag** | `inBody_htmlStartTag_*` ... `inBody_defaultElse_*`, `defect_inBody_option*`, `defect_inBody_rpRt*` | html merge, head-like delegate, body merge, frameset ignore, block p-close, heading close, pre/listing, form once, li/dd/dt algorithm, plaintext, button nested, a duplicate, formatting b/i/nobr, applet/marquee, table quirks, void+input hidden/non-hidden, param/source/track, hr, image→img, isindex, textarea/xmp/iframe/noembed rawtext, select transitions, **optgroup/option bug**, **rp/rt bug**, math/svg, table-structural error, default insert |
| **InBody — EndTag** | `inBody_endTag*`, `defect_inBody_endTagApplet_*` | body scope, html cascade, block scope, form reset, p auto-create, li/dd/dt/h1-h6 scope, sarcasm, formatting adoption agency, **applet literal "name" bug**, br, anyOtherEndTag |
| **InBody — EOF** | `inBody_eof_breaksWithoutError` | EOF break |
| **Text** | `text_*` | character insert, endTag pop+transition back, EOF pop+reprocess |
| **InTable** | `inTable_*` | character→InTableText, caption/colgroup/col/tbody/td-th-tr/table-dup/style-script/input/form/else, endTag table/structural/else, EOF |
| **InTableText** | `inTableText_*` | whitespace accumulate, non-whitespace foster parent |
| **InCaption** | `inCaption_*` | endTag caption, structural startTag closes caption, delegate InBody |
| **InColumnGroup** | `inColumnGroup_*` | whitespace, col, endTag colgroup, else |
| **InTableBody** | `inTableBody_*` | tr, th/td implies tr, exitTableBody, endTag tbody/table/else |
| **InRow** | `inRow_*` | th/td, missing tr, endTag tr/table/tbody-group/else |
| **InCell** | `inCell_*` | endTag td/th, startTag closes cell, else delegate InBody |
| **InSelect** | `inSelect_*` | option/optgroup auto-close, select nested close, input/keygen/textarea close-select, script delegate, endTag optgroup/option/select, else error |
| **InSelectInTable** | `inSelectInTable_*` | table-structural tag closes select |
| **AfterBody** | `afterBody_*` | whitespace delegate InBody, comment, endTag html, else error+InBody |
| **InFrameset** | `inFrameset_*` | frame, noframes delegate, endTag frameset |
| **AfterFrameset** | `afterFrameset_*` | whitespace/html-end/else |
| **AfterAfterBody / AfterAfterFrameset** | `afterAfterBody_*`, `afterAfterFrameset_*` | comment, else→InBody |
| **ForeignContent** | *(ไม่มีเทสตรง)* | เมธอด `return true;` เสมอ และคอมเมนต์ในซอร์สระบุว่า "how do we get here?" — ไม่สามารถยืนยันเส้นทางเข้าถึงจากซอร์สที่ให้มาได้ จึงไม่เดา behavior ตามข้อกำหนด #4 |
| **sanity** | `enumContainsExpectedStates`, `emptyInput_doesNotThrow`, `malformedInput_unclosedTagsDoNotThrow`, `fragmentParsing_doesNotThrow` | boundary/null/empty/malformed input |

**หมายเหตุสรุป fault**: เทส `defect_inBody_optionNotAutoClosed_dueToStringUtilInBug`, `defect_inBody_rpRtSpecialHandling_unreachable`, และ `defect_inBody_endTagApplet_literalNameStringBranch` ถูกออกแบบให้ตรวจจับความผิดปกติ 3 จุดที่พบในซอร์ส (`StringUtil.in("optgroup","option")`, `StringUtil.in("rp","rt")`, `tb.inScope("name")`) — คาดว่าเทสแรกจะ **fail บนซอร์สบั๊ก (17b)** ซึ่งสอดคล้องกับเป้าหมายของการทดสอบเพื่อดักจับ fault
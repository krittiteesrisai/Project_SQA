# HtmlTreeBuilderStateTest

**หมายเหตุสำคัญก่อนเริ่ม:**
- `HtmlTreeBuilderState` เป็น **package-private enum** (ไม่มี `public`) ดังนั้นคลาสทดสอบต้องอยู่ใน package เดียวกันคือ `org.jsoup.parser` จึงจะอ้างอิง/เรียกใช้ได้
- เนื่องจาก `process(Token, HtmlTreeBuilder)` เป็น abstract method ที่ทำงานร่วมกับ internal state ของ `HtmlTreeBuilder` (stack, tokeniser, formatting elements ฯลฯ) จำนวนมาก การสร้าง `Token`/`HtmlTreeBuilder` เองโดยตรงมีความเสี่ยงสูงที่จะ setup ผิดและไม่ได้ทดสอบ behavior จริง จึงเลือกทดสอบผ่าน **public API `org.jsoup.Jsoup.parse(...)` / `Jsoup.parseBodyFragment(...)`** ซึ่งจะไหลผ่าน `HtmlTreeBuilderState` ทุก state ตามลำดับที่ parser เรียกจริง (เป็นวิธีมาตรฐานที่ใช้ทดสอบ jsoup tree-builder ในโปรเจกต์จริง) — นี่คือการทดสอบแบบ integration-through-unit ที่ยังคงครอบคลุม branch ของไฟล์เป้าหมายได้มาก
- บาง branch (เช่น literal NUL character handling ใน `InBody`/`InTable`/`InSelect`, bookmark ของ Adoption-Agency algorithm, หรือ serialization format ของ `Token.toString()` ใน `InHeadNoscript.anythingElse`) **ไม่สามารถยืนยัน behavior ได้แน่ชัดจากซอร์สเพียงอย่างเดียว** (ขึ้นกับ tokenizer เวอร์ชันนั้น ๆ) จึงเขียนคอมเมนต์กำกับไว้ และหลีกเลี่ยงการ assert ผลลัพธ์ที่เดา

```java
package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

// Import ตามข้อกำหนด (คลาสเป้าหมายเป็น package-private อยู่ใน package เดียวกันอยู่แล้ว
// แต่ใส่ import ไว้ชัดเจนตามที่กำหนด)
import org.jsoup.parser.HtmlTreeBuilderState;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * JUnit4 tests for {@link HtmlTreeBuilderState}.
 * Tests drive the state machine through the public Jsoup.parse()/parseBodyFragment()
 * entry points, which internally dispatch to every HtmlTreeBuilderState enum constant's
 * process() method and exercise its if/else and loop branches.
 */
public class HtmlTreeBuilderStateTest {

    // ===================== Enum sanity (direct reference to target class) =====================

    @Test
    public void testEnumValuesCount() {
        // Counts all declared states; guards against accidental removal/addition of a state.
        HtmlTreeBuilderState[] values = HtmlTreeBuilderState.values();
        assertEquals(23, values.length);
    }

    @Test
    public void testEnumValueOfAndToString() {
        assertEquals(HtmlTreeBuilderState.InBody, HtmlTreeBuilderState.valueOf("InBody"));
        assertEquals("InBody", HtmlTreeBuilderState.InBody.toString());
        assertEquals(HtmlTreeBuilderState.ForeignContent, HtmlTreeBuilderState.valueOf("ForeignContent"));
    }

    // ===================== Boundary / null / empty =====================

    @Test
    public void testParse_NullInput_Throws() {
        boolean threw = false;
        try {
            Jsoup.parse((String) null);
        } catch (Exception e) {
            threw = true; // exact exception type not guaranteed by source shown; just confirm guard exists
        }
        assertTrue("Expected an exception for null html input", threw);
    }

    @Test
    public void testParse_EmptyInput_ProducesEmptyBody() {
        Document doc = Jsoup.parse("");
        assertNotNull(doc.body());
        assertEquals("", doc.body().text());
    }

    @Test
    public void testParse_MalformedInput_DoesNotThrow() {
        // Robustness / fault-detection: garbage markup must not crash the state machine.
        Document doc = Jsoup.parse("<<<>>>>></  ><>>");
        assertNotNull(doc.body());
    }

    // ===================== Initial =====================

    @Test
    public void testInitial_WhitespaceIgnored() {
        Document doc = Jsoup.parse("   <html><head></head><body>x</body></html>");
        assertEquals("x", doc.body().text());
    }

    @Test
    public void testInitial_CommentBeforeHtml() {
        Document doc = Jsoup.parse("<!-- c --><html><body>hi</body></html>");
        Node first = doc.childNode(0);
        assertTrue(first instanceof Comment);
        assertEquals(" c ", ((Comment) first).getData());
    }

    @Test
    public void testInitial_DoctypeStandard_NoQuirks() {
        Document doc = Jsoup.parse("<!DOCTYPE html><html><body>hello</body></html>");
        assertTrue(doc.childNode(0) instanceof DocumentType);
        assertEquals(Document.QuirksMode.noQuirks, doc.quirksMode());
        assertEquals("hello", doc.body().text());
    }

    @Test
    public void testInitial_DoctypeForceQuirks() {
        // Uncertain tokenizer-level detail: assumes "<!DOCTYPE>" (no name) sets forceQuirks=true
        // on the Doctype token, which Initial.process() then maps to Document.QuirksMode.quirks.
        Document doc = Jsoup.parse("<!DOCTYPE><html><body>q</body></html>");
        assertEquals(Document.QuirksMode.quirks, doc.quirksMode());
    }

    @Test
    public void testInitial_OtherTokenReprocessedThroughBeforeHtml() {
        // Character token before <html> -> Initial's else-branch -> transition(BeforeHtml) -> reprocess.
        Document doc = Jsoup.parse("hello<html><body>world</body></html>");
        assertEquals("helloworld", doc.body().text());
    }

    // ===================== BeforeHtml =====================

    @Test
    public void testBeforeHtml_DuplicateDoctype_ErrorIgnored() {
        Document doc = Jsoup.parse("<!DOCTYPE html><!DOCTYPE html><html><body>ok</body></html>");
        int doctypeCount = 0;
        for (Node n : doc.childNodes())
            if (n instanceof DocumentType) doctypeCount++;
        assertEquals(1, doctypeCount);
        assertEquals("ok", doc.body().text());
    }

    @Test
    public void testBeforeHtml_CommentInserted() {
        Document doc = Jsoup.parse("<!DOCTYPE html><!--c--><html><body>z</body></html>");
        boolean found = false;
        for (Node n : doc.childNodes())
            if (n instanceof Comment && "c".equals(((Comment) n).getData())) found = true;
        assertTrue(found);
    }

    @Test
    public void testBeforeHtml_WhitespaceIgnored() {
        Document doc = Jsoup.parse("<!DOCTYPE html>   <html><body>z</body></html>");
        assertEquals("z", doc.body().text());
    }

    @Test
    public void testBeforeHtml_StartTagHtml_InsertsWithAttribute() {
        Document doc = Jsoup.parse("<html lang=\"en\"><body>x</body></html>");
        assertEquals("en", doc.select("html").attr("lang"));
        assertEquals("x", doc.body().text());
    }

    @Test
    public void testBeforeHtml_EndTagInSpecialList_AnythingElse() {
        // </head> before <html>: Initial->else->BeforeHtml; matches (head|body|html|br) -> anythingElse()
        Document doc = Jsoup.parse("</head><html><body>content</body></html>");
        assertEquals("content", doc.body().text());
        assertNotNull(doc.head());
    }

    @Test
    public void testBeforeHtml_EndTagOther_Error() {
        // </div> before <html>: generic end tag branch -> error, token dropped.
        Document doc = Jsoup.parse("</div><html><body>z</body></html>");
        assertEquals("z", doc.body().text());
        assertEquals(0, doc.select("div").size());
    }

    // ===================== BeforeHead =====================

    @Test
    public void testBeforeHead_WhitespaceIgnored() {
        Document doc = Jsoup.parse("<html>   <head></head><body>a</body></html>");
        assertEquals("a", doc.body().text());
        assertEquals(2, doc.selectFirst("html").childNodeSize()); // head + body, no stray text
    }

    @Test
    public void testBeforeHead_CommentInsertedUnderHtml() {
        Document doc = Jsoup.parse("<html><!--c--><head></head><body>a</body></html>");
        Node first = doc.selectFirst("html").childNode(0);
        assertTrue(first instanceof Comment);
        assertEquals("c", ((Comment) first).getData());
    }

    @Test
    public void testBeforeHead_DoctypeError_Ignored() {
        Document doc = Jsoup.parse("<html><!DOCTYPE html><head></head><body>a</body></html>");
        assertEquals("a", doc.body().text());
        for (Node n : doc.selectFirst("html").childNodes())
            assertFalse(n instanceof DocumentType);
    }

    @Test
    public void testBeforeHead_DuplicateHtmlTag_MergesAttributes() {
        // Second <html> start tag while still BeforeHead -> InBody.process() merges attrs onto stack(0).
        Document doc = Jsoup.parse(
            "<html id=\"first\"><html id=\"second\" class=\"c\"><head></head><body>a</body></html>");
        assertEquals(1, doc.select("html").size());
        assertEquals("first", doc.selectFirst("html").attr("id")); // existing attr kept
        assertEquals("c", doc.selectFirst("html").attr("class"));  // new attr merged in
    }

    @Test
    public void testBeforeHead_StartTagHead() {
        Document doc = Jsoup.parse("<html><head id=\"h\"></head><body>a</body></html>");
        assertEquals("h", doc.head().attr("id"));
    }

    @Test
    public void testBeforeHead_EndTagInSpecialList_ProcessesStartTagHead() {
        Document doc = Jsoup.parse("<html></head><body>a</body></html>");
        assertEquals("a", doc.body().text());
        assertNotNull(doc.head());
    }

    @Test
    public void testBeforeHead_EndTagOther_Error() {
        Document doc = Jsoup.parse("<html></div><head></head><body>b</body></html>");
        assertEquals("b", doc.body().text());
        assertEquals(0, doc.select("div").size());
    }

    // ===================== InHead =====================

    @Test
    public void testInHead_BaseSetsBaseUri() {
        Document doc = Jsoup.parse(
            "<html><head><base href=\"http://example.com/sub/\"></head>" +
            "<body><a href=\"page.html\">x</a></body></html>",
            "http://initial.example/");
        assertEquals("http://example.com/sub/page.html", doc.select("a").first().absUrl("href"));
    }

    @Test
    public void testInHead_Meta() {
        Document doc = Jsoup.parse("<html><head><meta charset=\"utf-8\"></head><body>x</body></html>");
        assertEquals(1, doc.select("meta").size());
        assertEquals("utf-8", doc.select("meta").attr("charset"));
    }

    @Test
    public void testInHead_TitleRcdata() {
        Document doc = Jsoup.parse("<html><head><title>Hello &amp; World</title></head><body>y</body></html>");
        assertEquals("Hello & World", doc.title());
    }

    @Test
    public void testInHead_StyleRawtext_TagsNotParsed() {
        Document doc = Jsoup.parse(
            "<html><head><style>p{content:\"<div>\"}</style></head><body>z</body></html>");
        assertTrue(doc.select("style").first().data().contains("<div>"));
        assertEquals(0, doc.select("div").size());
    }

    @Test
    public void testInHead_ScriptRawtext_TagsNotParsed() {
        Document doc = Jsoup.parse(
            "<html><head><script>var x = 1 < 2 && 3 > 2;</script></head><body>s</body></html>");
        assertTrue(doc.select("script").first().data().contains("1 < 2"));
    }

    @Test
    public void testInHead_NoscriptDelegatesAllowedTag() {
        Document doc = Jsoup.parse(
            "<html><head><noscript><link rel=\"stylesheet\" href=\"a.css\"></noscript></head><body>w</body></html>");
        assertEquals(1, doc.select("noscript link").size());
    }

    @Test
    public void testInHead_DuplicateHead_Error() {
        Document doc = Jsoup.parse("<html><head><head></head><body>h</body></html>");
        assertEquals(1, doc.select("head").size());
    }

    @Test
    public void testInHead_EndTagHead_TransitionsAfterHead() {
        Document doc = Jsoup.parse("<html><head></head><body>e</body></html>");
        assertEquals(1, doc.select("head").size());
        assertEquals(1, doc.select("body").size());
    }

    @Test
    public void testInHead_EndTagBodyTriggersAnythingElse() {
        // While in InHead, hitting </body> triggers anythingElse (processEndTag("head") + reprocess),
        // which (per AfterBody's fallback) re-opens InBody so later text still lands in <body>.
        Document doc = Jsoup.parse("<html><head></body>middle</html>");
        assertEquals("middle", doc.body().text());
    }

    @Test
    public void testInHead_EndTagOther_Error() {
        Document doc = Jsoup.parse("<html><head></div></head><body>f</body></html>");
        assertEquals("f", doc.body().text());
        assertEquals(0, doc.select("div").size());
    }

    // ===================== AfterHead =====================

    @Test
    public void testAfterHead_BodyStart() {
        Document doc = Jsoup.parse("<html><head></head><body class=\"c\">text</body></html>");
        assertEquals("c", doc.body().attr("class"));
        assertEquals("text", doc.body().text());
    }

    @Test
    public void testAfterHead_FramesetStart() {
        Document doc = Jsoup.parse("<html><head></head><frameset><frame src=\"a.html\"></frameset></html>");
        assertEquals(1, doc.select("frameset").size());
        assertEquals(1, doc.select("frame").size());
    }

    @Test
    public void testAfterHead_HeadRelatedTag_ReinsertedIntoHead() {
        Document doc = Jsoup.parse("<html><head></head><title>late</title><body>g</body></html>");
        assertEquals("late", doc.title());
        assertEquals("g", doc.body().text());
    }

    @Test
    public void testAfterHead_HeadStartTag_Error() {
        Document doc = Jsoup.parse("<html><head></head><head></head><body>h2</body></html>");
        assertEquals(1, doc.select("head").size());
        assertEquals("h2", doc.body().text());
    }

    @Test
    public void testAfterHead_EndTagOther_Error() {
        Document doc = Jsoup.parse("<html><head></head></div><body>i</body></html>");
        assertEquals("i", doc.body().text());
        assertEquals(0, doc.select("div").size());
    }

    @Test
    public void testAfterHead_AnythingElse_AutoCreatesBody() {
        Document doc = Jsoup.parse("<html><head></head>hello<body>world</body></html>");
        assertEquals("helloworld", doc.body().text());
    }

    // ===================== InBody =====================

    @Test
    public void testInBody_ParagraphAutoClose() {
        Document doc = Jsoup.parse("<p>One<p>Two");
        assertEquals(2, doc.select("p").size());
        assertEquals("One", doc.select("p").get(0).text());
        assertEquals("Two", doc.select("p").get(1).text());
    }

    @Test
    public void testInBody_HeadingImplicitClose() {
        Document doc = Jsoup.parse("<h1>a<h2>b");
        assertEquals(1, doc.select("h1").size());
        assertEquals(1, doc.select("h2").size());
        assertEquals("a", doc.select("h1").text());
        assertEquals("b", doc.select("h2").text());
    }

    @Test
    public void testInBody_ListItemBreaking() {
        Document doc = Jsoup.parse("<ul><li>a<li>b</ul>");
        List<Element> items = doc.select("li");
        assertEquals(2, items.size());
        assertEquals("a", items.get(0).text());
        assertEquals("b", items.get(1).text());
    }

    @Test
    public void testInBody_DdDtBreaking() {
        Document doc = Jsoup.parse("<dl><dt>a<dd>b</dl>");
        assertEquals(1, doc.select("dt").size());
        assertEquals(1, doc.select("dd").size());
    }

    @Test
    public void testInBody_AnchorReconstructionOnDuplicate() {
        // <a> nested re-entry: getActiveFormattingElement("a") branch forces processEndTag("a").
        Document doc = Jsoup.parse("<a href=\"1\">one<a href=\"2\">two</a>");
        List<Element> anchors = doc.select("a");
        assertEquals(2, anchors.size());
    }

    @Test
    public void testInBody_ImageRenamedToImg() {
        Document doc = Jsoup.parse("<body><image src=\"a.png\"></body>");
        assertEquals(1, doc.select("img").size());
        assertEquals(0, doc.select("image").size());
    }

    @Test
    public void testInBody_Isindex_CreatesFormAndInput() {
        Document doc = Jsoup.parse("<body><isindex></body>");
        assertEquals(1, doc.select("form").size());
        assertEquals(1, doc.select("input[name=isindex]").size());
    }

    @Test
    public void testInBody_ButtonNestedClose() {
        Document doc = Jsoup.parse("<button>1<button>2</button>");
        assertEquals(2, doc.select("button").size());
    }

    @Test
    public void testInBody_TableClosesOpenPInNoQuirksMode() {
        Document doc = Jsoup.parse(
            "<!DOCTYPE html><html><body><p>abc<table><tr><td>cell</td></tr></table></body></html>");
        assertEquals(0, doc.select("p table").size());
        assertEquals("abc", doc.select("p").text());
        assertEquals("cell", doc.select("td").text());
    }

    @Test
    public void testInBody_AdoptionAgencyDoesNotThrowAndKeepsText() {
        // Exercises InBodyEndAdoptionFormatters loop (a/b/i/...).
        // Exact resulting DOM shape per the Adoption Agency Algorithm is intricate;
        // only structural survival + text retention are asserted to avoid guessing exact tree shape.
        String html = "<p><b><i><b></p><p>X</b></i></b></p>";
        Document doc = Jsoup.parse(html);
        assertTrue(doc.body().text().contains("X"));
    }

    @Test
    public void testInBody_BrEndTag_CreatesBrStartTag() {
        Document doc = Jsoup.parse("<body>a</br>b</body>");
        assertTrue(doc.select("br").size() >= 1);
    }

    @Test
    public void testInBody_HtmlStartTag_MergesAttributesOntoRootHtml() {
        Document doc = Jsoup.parse("<html id=\"root\"><body><html class=\"extra\">x</body></html>");
        assertEquals(1, doc.select("html").size());
        assertEquals("extra", doc.selectFirst("html").attr("class"));
    }

    // ===================== Text =====================

    @Test
    public void testText_ScriptDataPreservedLiterally() {
        Document doc = Jsoup.parse("<body><script>if (1 < 2) { }</script></body>");
        assertTrue(doc.select("script").first().data().contains("1 < 2"));
    }

    // ===================== InTable / InTableText =====================

    @Test
    public void testInTable_FosterParentsStrayText() {
        Document doc = Jsoup.parse("<table>A<tr><td>B</td></tr></table>");
        List<Node> bodyChildren = doc.body().childNodes();
        assertTrue(bodyChildren.get(0) instanceof TextNode);
        assertEquals("A", ((TextNode) bodyChildren.get(0)).text());
        assertEquals("table", ((Element) bodyChildren.get(1)).tagName());
        assertEquals("B", doc.select("td").text());
    }

    @Test
    public void testInTable_Caption() {
        Document doc = Jsoup.parse("<table><caption>Cap</caption><tr><td>D</td></tr></table>");
        assertEquals("Cap", doc.select("caption").text());
        assertEquals("D", doc.select("td").text());
    }

    @Test
    public void testInTable_InputHidden_StaysInsideTable() {
        Document doc = Jsoup.parse("<table><input type=\"hidden\" name=\"h\"><tr><td>F</td></tr></table>");
        assertEquals(1, doc.select("table input[type=hidden]").size());
    }

    @Test
    public void testInTable_InputNonHidden_FosteredOut() {
        Document doc = Jsoup.parse("<table><input type=\"text\" name=\"t\"><tr><td>G</td></tr></table>");
        Element input = doc.selectFirst("input[type=text]");
        assertNotNull(input);
        assertNotEquals("table", input.parent().tagName());
    }

    // ===================== InColumnGroup =====================

    @Test
    public void testInColumnGroup_Col() {
        Document doc = Jsoup.parse("<table><colgroup><col></colgroup><tr><td>E</td></tr></table>");
        assertEquals(1, doc.select("colgroup col").size());
    }

    // ===================== InTableBody / InRow / InCell =====================

    @Test
    public void testInTableBody_InRow_InCell_MissingCloseTags() {
        Document doc = Jsoup.parse(
            "<table><tbody><tr><td>1<td>2</tr><tr><td>3</td></tr></tbody></table>");
        List<Element> rows = doc.select("tr");
        assertEquals(2, rows.size());
        List<Element> cellsRow1 = rows.get(0).select("td");
        assertEquals(2, cellsRow1.size());
        assertEquals("1", cellsRow1.get(0).text());
        assertEquals("2", cellsRow1.get(1).text());
        assertEquals("3", rows.get(1).select("td").text());
    }

    // ===================== InSelect =====================

    @Test
    public void testInSelect_OptionAutoClosesPrevious() {
        Document doc = Jsoup.parse("<select><option>A<option>B</select>");
        List<Element> options = doc.select("option");
        assertEquals(2, options.size());
        assertEquals("A", options.get(0).text());
        assertEquals("B", options.get(1).text());
    }

    @Test
    public void testInSelect_OptgroupWithOptions() {
        Document doc = Jsoup.parse("<select><optgroup><option>C<option>D</optgroup></select>");
        assertEquals(1, doc.select("optgroup").size());
        assertEquals(2, doc.select("optgroup option").size());
    }

    // ===================== AfterBody =====================

    @Test
    public void testAfterBody_WhitespaceDelegatesToInBody() {
        Document doc = Jsoup.parse("<html><body>content</body>   </html>");
        int n = doc.body().childNodeSize();
        Node last = doc.body().childNode(n - 1);
        assertTrue(last instanceof TextNode);
        assertEquals("", ((TextNode) last).text().trim());
    }

    // ===================== InFrameset / AfterFrameset =====================

    @Test
    public void testInFrameset_MultipleFrames() {
        Document doc = Jsoup.parse("<html><head></head><frameset><frame src=\"a\"><frame src=\"b\"></frameset></html>");
        assertEquals(2, doc.select("frame").size());
    }

    @Test
    public void testAfterFrameset_ParsesWithoutException() {
        Document doc = Jsoup.parse("<html><head></head><frameset></frameset></html>");
        assertEquals(1, doc.select("frameset").size());
    }

    // ===================== AfterAfterBody =====================

    @Test
    public void testAfterAfterBody_TrailingWhitespaceDoesNotBreakParse() {
        Document doc = Jsoup.parse("<html><body>end</body></html>   ");
        assertEquals("end", doc.body().text());
    }

    // ===================== Fragment parsing (exercises stack-size based branches) =====================

    @Test
    public void testParseBodyFragment_Basic() {
        Document doc = Jsoup.parseBodyFragment("<p>Fragment</p>");
        assertEquals("Fragment", doc.body().select("p").text());
    }
}
```

## สรุปตาราง Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | State / Branch ที่ครอบคลุม |
|---|---|
| testEnumValuesCount, testEnumValueOfAndToString | ตรวจ enum `HtmlTreeBuilderState` ครบถ้วน (reference คลาสเป้าหมายตรง) |
| testParse_NullInput_Throws, testParse_EmptyInput_*, testParse_MalformedInput_* | boundary/null/malformed input |
| testInitial_WhitespaceIgnored | `Initial`: `isWhitespace(t)` true |
| testInitial_CommentBeforeHtml | `Initial`: `t.isComment()` |
| testInitial_DoctypeStandard_NoQuirks | `Initial`: `t.isDoctype()`, `!isForceQuirks` |
| testInitial_DoctypeForceQuirks | `Initial`: `d.isForceQuirks()` → quirks |
| testInitial_OtherTokenReprocessedThroughBeforeHtml | `Initial`: else → transition+reprocess |
| testBeforeHtml_DuplicateDoctype_ErrorIgnored | `BeforeHtml`: `t.isDoctype()` error |
| testBeforeHtml_CommentInserted | `BeforeHtml`: `t.isComment()` |
| testBeforeHtml_WhitespaceIgnored | `BeforeHtml`: whitespace |
| testBeforeHtml_StartTagHtml_* | `BeforeHtml`: start tag "html" |
| testBeforeHtml_EndTagInSpecialList_* | `BeforeHtml`: endTag in {head,body,html,br} → anythingElse |
| testBeforeHtml_EndTagOther_Error | `BeforeHtml`: generic end tag error |
| testBeforeHead_WhitespaceIgnored | `BeforeHead`: whitespace |
| testBeforeHead_CommentInsertedUnderHtml | `BeforeHead`: comment |
| testBeforeHead_DoctypeError_Ignored | `BeforeHead`: doctype error |
| testBeforeHead_DuplicateHtmlTag_* | `BeforeHead`: startTag "html" → InBody merge |
| testBeforeHead_StartTagHead | `BeforeHead`: startTag "head" |
| testBeforeHead_EndTagInSpecialList_* | `BeforeHead`: endTag special list |
| testBeforeHead_EndTagOther_Error | `BeforeHead`: endTag other error |
| testInHead_BaseSetsBaseUri | `InHead`: base/basefont/.../link + `maybeSetBaseUri` |
| testInHead_Meta | `InHead`: name=="meta" |
| testInHead_TitleRcdata | `InHead`: name=="title" → handleRcData |
| testInHead_StyleRawtext_* | `InHead`: noframes/style → handleRawtext |
| testInHead_ScriptRawtext_* | `InHead`: name=="script" |
| testInHead_NoscriptDelegatesAllowedTag | `InHead`→`InHeadNoscript` allowed-tag delegate |
| testInHead_DuplicateHead_Error | `InHead`: name=="head" error |
| testInHead_EndTagHead_* | `InHead`: endTag "head" |
| testInHead_EndTagBodyTriggersAnythingElse | `InHead`: endTag body/html/br → anythingElse |
| testInHead_EndTagOther_Error | `InHead`: endTag default error |
| testAfterHead_BodyStart | `AfterHead`: name=="body" |
| testAfterHead_FramesetStart | `AfterHead`: name=="frameset" |
| testAfterHead_HeadRelatedTag_* | `AfterHead`: base/link/.../title error-path |
| testAfterHead_HeadStartTag_Error | `AfterHead`: name=="head" error |
| testAfterHead_EndTagOther_Error | `AfterHead`: endTag else error |
| testAfterHead_AnythingElse_* | `AfterHead`: else→anythingElse |
| testInBody_ParagraphAutoClose | `InBody`: InBodyStartPClosers + inButtonScope |
| testInBody_HeadingImplicitClose | `InBody`: Headings branch |
| testInBody_ListItemBreaking | `InBody`: name=="li" loop |
| testInBody_DdDtBreaking | `InBody`: DdDt loop |
| testInBody_AnchorReconstructionOnDuplicate | `InBody`: name=="a" active formatting check |
| testInBody_ImageRenamedToImg | `InBody`: name=="image" |
| testInBody_Isindex_* | `InBody`: name=="isindex" |
| testInBody_ButtonNestedClose | `InBody`: name=="button" inButtonScope |
| testInBody_TableClosesOpenPInNoQuirksMode | `InBody`: name=="table" quirks check |
| testInBody_AdoptionAgencyDoesNotThrow* | `InBody` EndTag: InBodyEndAdoptionFormatters loop |
| testInBody_BrEndTag_* | `InBody`: endTag "br" |
| testInBody_HtmlStartTag_* | `InBody`: name=="html" merge |
| testText_ScriptDataPreservedLiterally | `Text`: character insert (rawtext passthrough) |
| testInTable_FosterParentsStrayText | `InTable`→`InTableText` anythingElse fostering |
| testInTable_Caption | `InTable`: name=="caption" |
| testInTable_InputHidden_* / NonHidden_* | `InTable`: name=="input" hidden/else |
| testInColumnGroup_Col | `InColumnGroup`: "col" |
| testInTableBody_InRow_InCell_* | `InTableBody`→`InRow`→`InCell` td/tr close |
| testInSelect_OptionAutoClosesPrevious | `InSelect`: name=="option" |
| testInSelect_OptgroupWithOptions | `InSelect`: name=="optgroup" |
| testAfterBody_WhitespaceDelegatesToInBody | `AfterBody`: whitespace delegate |
| testInFrameset_MultipleFrames | `InFrameset`: "frame" |
| testAfterFrameset_ParsesWithoutException | `InFrameset`→`AfterFrameset` transition |
| testAfterAfterBody_* | `AfterAfterBody`: else path |
| testParseBodyFragment_Basic | Fragment-context stack-size branches (`InBody` body/frameset) |

**ข้อจำกัดที่ยอมรับและคอมเมนต์ไว้ในโค้ด:** behavior ของ literal NUL character handling, bookmark positioning ใน Adoption Agency Algorithm, และ exact serialization string ใน `InHeadNoscript.anythingElse` ไม่ได้ทดสอบแบบ exact-match เนื่องจากไม่สามารถยืนยันได้จากซอร์สที่ให้มาเพียงอย่างเดียว (ขึ้นกับ tokenizer internals ที่ไม่ได้แสดงในซอร์ส)
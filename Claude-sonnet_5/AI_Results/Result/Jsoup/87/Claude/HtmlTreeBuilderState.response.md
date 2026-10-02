# การวิเคราะห์และแนวทางการทดสอบ

คลาส `HtmlTreeBuilderState` เป็น **package-private enum** ใน package `org.jsoup.parser` ที่ทำงานร่วมกับ `HtmlTreeBuilder`, `Token`, `TreeBuilder` ซึ่งเป็นคลาสภายในที่ซับซ้อนมาก การสร้าง mock ของคลาสเหล่านี้โดยตรงเสี่ยงต่อการเดา behavior ที่ไม่มีในซอร์ส

ดังนั้นผมเลือกใช้แนวทาง **black-box ผ่าน public API ของ jsoup** (`Jsoup.parse(...)`, `Parser`) เพื่อ "ขับ" (drive) ให้ state machine เดินผ่านทุก branch ตามที่วิเคราะห์จากซอร์ส พร้อมทั้งคงไฟล์ทดสอบไว้ใน package เดียวกัน (`org.jsoup.parser`) เพื่อให้สามารถเข้าถึง `HtmlTreeBuilderState.Constants` (package-private) ได้โดยตรงสำหรับทดสอบความถูกต้องของ sorted array ที่ `StringUtil.inSorted` ต้องใช้ binary search

**หมายเหตุสำคัญ:** พบจุดที่ดูเหมือนเป็น **fault จริงในซอร์ส** ที่ `InBody` end-tag ของกลุ่ม `InBodyStartApplets`:
```java
if (!tb.inScope("name")) {   // <-- ใช้ literal "name" ไม่ใช่ตัวแปร name
```
ซึ่งควรจะเป็น `tb.inScope(name)` ผมเขียนเทสเคส `testInBody_AppletEndTagScopeBug` เพื่อดักจับพฤติกรรมนี้โดยเฉพาะ (คอมเมนต์กำกับความไม่แน่ใจไว้ในโค้ด)

```java
package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Black-box / white-box hybrid tests for HtmlTreeBuilderState.
 * ไฟล์นี้อยู่ใน package เดียวกับคลาสเป้าหมาย (org.jsoup.parser) เพื่อให้เข้าถึง
 * enum ที่เป็น package-private และ nested class Constants ได้โดยตรง
 *
 * แนวทาง: ขับ state machine ผ่าน public API (Jsoup.parse / Parser) เนื่องจากการ mock
 * HtmlTreeBuilder/Token โดยตรงมีความซับซ้อนสูงและเสี่ยงต่อการเดา behavior ที่ไม่มีในซอร์ส
 */
public class HtmlTreeBuilderStateTest {

    // ---------------------------------------------------------------
    // 0) ทดสอบความถูกต้องของ Constants arrays (ใช้ Arrays.binarySearch ใน StringUtil.inSorted)
    //    ถ้า array ใดไม่เรียงลำดับ จะทำให้หลาย branch ใน InBody/InCell ฯลฯ ทำงานผิด
    // ---------------------------------------------------------------
    @Test
    public void ensureConstantArraysAreSorted() throws IllegalAccessException {
        Class<?> constantsClass = HtmlTreeBuilderState.Constants.class;
        Field[] fields = constantsClass.getDeclaredFields();
        int checked = 0;
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers()) && field.getType().isArray()
                    && field.getType().getComponentType() == String.class) {
                field.setAccessible(true);
                String[] array = (String[]) field.get(null);
                String[] sortedCopy = Arrays.copyOf(array, array.length);
                Arrays.sort(sortedCopy);
                assertArrayEquals("Array " + field.getName() + " ต้องเรียงลำดับเพื่อให้ binarySearch ทำงานถูกต้อง",
                        sortedCopy, array);
                checked++;
            }
        }
        assertTrue("ควรพบ static String[] อย่างน้อย 1 ตัวใน Constants", checked > 0);
    }

    // ---------------------------------------------------------------
    // 1) Initial state
    // ---------------------------------------------------------------
    @Test
    public void testInitial_WhitespaceIgnored() {
        Document doc = Jsoup.parse("   <html><head></head><body>x</body></html>");
        assertEquals("x", doc.body().text());
    }

    @Test
    public void testInitial_CommentInserted() {
        Document doc = Jsoup.parse("<!-- hello --><html><head></head><body></body></html>");
        Node first = doc.childNode(0);
        assertTrue(first instanceof Comment);
        assertEquals(" hello ", ((Comment) first).getData());
    }

    @Test
    public void testInitial_DoctypeNoQuirks() {
        Document doc = Jsoup.parse("<!DOCTYPE html><html><head></head><body></body></html>");
        assertTrue(doc.childNode(0) instanceof DocumentType);
        assertEquals(Document.QuirksMode.noQuirks, doc.quirksMode());
    }

    @Test
    public void testInitial_NonCommentNonDoctype_TransitionsAndReprocesses() {
        // token แรกไม่ใช่ whitespace/comment/doctype -> transition BeforeHtml แล้ว reprocess
        Document doc = Jsoup.parse("hello<html><head></head><body></body></html>");
        assertTrue(doc.body().text().contains("hello"));
    }

    // ---------------------------------------------------------------
    // 2) BeforeHtml state
    // ---------------------------------------------------------------
    @Test
    public void testBeforeHtml_SecondDoctypeIgnored() {
        Document doc = Jsoup.parse("<!DOCTYPE html><!DOCTYPE root><html></html>");
        assertEquals(1, doc.childNodes().stream().filter(n -> n instanceof DocumentType).count());
    }

    @Test
    public void testBeforeHtml_CommentInserted() {
        Document doc = Jsoup.parse("<!DOCTYPE html><!--c--><html></html>");
        boolean found = false;
        for (Node n : doc.childNodes())
            if (n instanceof Comment && ((Comment) n).getData().equals("c")) found = true;
        assertTrue(found);
    }

    @Test
    public void testBeforeHtml_StartTagHtml() {
        Document doc = Jsoup.parse("<!DOCTYPE html><html class=\"x\"></html>");
        assertEquals(1, doc.getElementsByTag("html").size());
        assertEquals("x", doc.getElementsByTag("html").first().attr("class"));
    }

    @Test
    public void testBeforeHtml_EndTagInSpecialSet_CreatesImplicitHtml() {
        // endTag head/body/html/br ที่ BeforeHtml -> anythingElse -> สร้าง <html> implicit
        Document doc = Jsoup.parse("<!DOCTYPE html></head><html></html>");
        assertEquals(1, doc.getElementsByTag("html").size());
    }

    @Test
    public void testBeforeHtml_EndTagOther_Ignored() {
        // endTag ที่ไม่อยู่ใน set -> error, return false (ignored) ไม่ throw exception
        Document doc = Jsoup.parse("<!DOCTYPE html></div><html></html>");
        assertEquals(1, doc.getElementsByTag("html").size());
    }

    @Test
    public void testBeforeHtml_AnythingElse_TextBeforeHtml() {
        Document doc = Jsoup.parse("<!DOCTYPE html>text<html></html>");
        assertTrue(doc.body().text().contains("text"));
    }

    // ---------------------------------------------------------------
    // 3) BeforeHead state
    // ---------------------------------------------------------------
    @Test
    public void testBeforeHead_DuplicateHtmlMergesAttributes() {
        // startTag "html" ขณะอยู่ BeforeHead -> ประมวลผลผ่าน InBody.process ซึ่ง merge attribute
        Document doc = Jsoup.parse("<html class='a'><html id='b'><head></head><body></body></html>");
        Element html = doc.getElementsByTag("html").first();
        assertEquals(1, doc.getElementsByTag("html").size());
        assertEquals("a", html.attr("class"));
        assertEquals("b", html.attr("id"));
    }

    @Test
    public void testBeforeHead_HeadInserted() {
        Document doc = Jsoup.parse("<html><head><title>t</title></head><body></body></html>");
        assertEquals("t", doc.title());
    }

    @Test
    public void testBeforeHead_EndTagInSet_CreatesImplicitHead() {
        Document doc = Jsoup.parse("<html></body><head><title>t</title></head><body></body></html>");
        assertEquals(1, doc.getElementsByTag("head").size());
    }

    @Test
    public void testBeforeHead_ElseCreatesImplicitHead() {
        Document doc = Jsoup.parse("<html>text<body></body></html>");
        assertEquals(1, doc.getElementsByTag("head").size());
        assertTrue(doc.body().text().contains("text"));
    }

    // ---------------------------------------------------------------
    // 4) InHead state
    // ---------------------------------------------------------------
    @Test
    public void testInHead_BaseHrefSetsBaseUri() {
        Document doc = Jsoup.parse(
            "<html><head><base href='http://example.com/'></head><body><a href='foo'>l</a></body></html>");
        Element a = doc.select("a").first();
        assertEquals("http://example.com/foo", a.absUrl("href"));
    }

    @Test
    public void testInHead_MetaInsertedEmpty() {
        Document doc = Jsoup.parse("<html><head><meta charset='utf-8'></head><body></body></html>");
        assertEquals(1, doc.select("meta").size());
        assertEquals(0, doc.select("meta").first().childNodeSize());
    }

    @Test
    public void testInHead_TitleIsRcData() {
        Document doc = Jsoup.parse("<html><head><title><b>Not bold</b></title></head><body></body></html>");
        assertEquals("<b>Not bold</b>", doc.title());
    }

    @Test
    public void testInHead_StyleIsRawText() {
        Document doc = Jsoup.parse("<html><head><style>p {color: red}</style></head><body></body></html>");
        assertEquals("p {color: red}", doc.select("style").first().data());
    }

    @Test
    public void testInHead_ScriptIsRawText_ScriptData() {
        Document doc = Jsoup.parse("<html><head><script>var a = 1 < 2;</script></head><body></body></html>");
        assertTrue(doc.select("script").first().data().contains("1 < 2"));
    }

    @Test
    public void testInHead_NoscriptTransitions() {
        Document doc = Jsoup.parse("<html><head><noscript>hi</noscript><title>t</title></head><body></body></html>");
        assertEquals(1, doc.select("head noscript").size());
        assertEquals("t", doc.title());
    }

    @Test
    public void testInHead_DuplicateHeadIgnored() {
        Document doc = Jsoup.parse("<html><head><head><title>t</title></head></head><body></body></html>");
        assertEquals(1, doc.select("head").size());
    }

    @Test
    public void testInHead_UnknownStartTag_ClosesHeadAndMovesToBody() {
        Document doc = Jsoup.parse("<html><head><div>x</div></head><body></body></html>");
        assertTrue(doc.select("head div").isEmpty());
        assertEquals("x", doc.body().select("div").text());
    }

    // ---------------------------------------------------------------
    // 5) InHeadNoscript state
    // ---------------------------------------------------------------
    @Test
    public void testInHeadNoscript_EndTagClosesBackToInHead() {
        Document doc = Jsoup.parse(
            "<html><head><noscript>a</noscript><title>t</title></head><body></body></html>");
        assertEquals("t", doc.title());
        assertEquals(1, doc.select("noscript").size());
    }

    @Test
    public void testInHeadNoscript_AllowedStartTagsProcessedViaInHead() {
        Document doc = Jsoup.parse(
            "<html><head><noscript><link href='a.css' rel='stylesheet'></noscript></head><body></body></html>");
        assertEquals(1, doc.select("noscript link").size());
    }

    @Test
    public void testInHeadNoscript_NestedNoscriptIgnored() {
        // (startTag head/noscript) หรือ endTag ใด ๆ ขณะอยู่ InHeadNoscript -> error, false (ignored)
        Document doc = Jsoup.parse("<html><head><noscript><noscript>x</noscript></noscript></head><body></body></html>");
        assertNotNull(doc); // ไม่ throw exception
    }

    // ---------------------------------------------------------------
    // 6) AfterHead state
    // ---------------------------------------------------------------
    @Test
    public void testAfterHead_BodyTransition() {
        Document doc = Jsoup.parse("<html><head></head><body>x</body></html>");
        assertEquals("x", doc.body().text());
    }

    @Test
    public void testAfterHead_FramesetTransition() {
        Document doc = Jsoup.parse("<html><head></head><frameset><frame></frameset></html>");
        assertEquals(1, doc.select("frameset").size());
    }

    @Test
    public void testAfterHead_HeadRelatedTagAfterHeadClosed_GoesBackIntoHead() {
        Document doc = Jsoup.parse("<html><head></head><title>late</title><body></body></html>");
        assertEquals("late", doc.title());
    }

    @Test
    public void testAfterHead_DuplicateHeadIgnored() {
        Document doc = Jsoup.parse("<html><head></head><head></head><body></body></html>");
        assertEquals(1, doc.select("head").size());
    }

    @Test
    public void testAfterHead_UnknownStartTag_OpensBody() {
        Document doc = Jsoup.parse("<html><head></head><div>x</div></html>");
        assertEquals("x", doc.body().select("div").text());
    }

    // ---------------------------------------------------------------
    // 7) InBody state (startTag ส่วนใหญ่)
    // ---------------------------------------------------------------
    @Test
    public void testInBody_NestedAnchors_NotNested() {
        Document doc = Jsoup.parse("<body><a href='1'>1<a href='2'>2</a></body>");
        assertEquals(2, doc.select("a").size());
        Element a1 = doc.select("a").get(0);
        Element a2 = doc.select("a").get(1);
        assertEquals(a1.parent(), a2.parent());
    }

    @Test
    public void testInBody_PClosedByDiv() {
        Document doc = Jsoup.parse("<body><p>one<div>two</div>");
        assertEquals(2, doc.body().children().size());
        assertEquals("one", doc.body().child(0).text());
        assertEquals("two", doc.body().child(1).text());
    }

    @Test
    public void testInBody_LiAutoClose() {
        Document doc = Jsoup.parse("<ul><li>one<li>two</ul>");
        Element ul = doc.select("ul").first();
        assertEquals(2, ul.children().size());
        assertEquals("one", ul.child(0).text());
        assertEquals("two", ul.child(1).text());
    }

    @Test
    public void testInBody_DuplicateHtmlMergesAttributes() {
        Document doc = Jsoup.parse("<html class='x'><head></head><body><html id='y'></html></body></html>");
        assertEquals(1, doc.getElementsByTag("html").size());
        Element html = doc.getElementsByTag("html").first();
        assertEquals("x", html.attr("class"));
        assertEquals("y", html.attr("id"));
    }

    @Test
    public void testInBody_DuplicateBodyMergesAttributes() {
        Document doc = Jsoup.parse("<html><body class='a'><body id='b'>text</body></body></html>");
        assertEquals(1, doc.getElementsByTag("body").size());
        assertEquals("a", doc.body().attr("class"));
        assertEquals("b", doc.body().attr("id"));
    }

    @Test
    public void testInBody_HeadingsAutoClose() {
        Document doc = Jsoup.parse("<body><h1>One<h2>Two");
        assertEquals(2, doc.body().children().size());
        assertEquals("One", doc.body().child(0).text());
        assertEquals("Two", doc.body().child(1).text());
    }

    @Test
    public void testInBody_PreStripsLeadingNewline() {
        Document doc = Jsoup.parse("<body><pre>\nHello</pre>");
        assertEquals("Hello", doc.select("pre").text());
    }

    @Test
    public void testInBody_FormOnlyOneAllowed() {
        Document doc = Jsoup.parse("<body><form><form></form></form>");
        assertEquals(1, doc.select("form").size());
    }

    @Test
    public void testInBody_DdDtAutoClose() {
        Document doc = Jsoup.parse("<dl><dt>term<dd>desc</dl>");
        assertEquals("term", doc.select("dt").text());
        assertEquals("desc", doc.select("dd").text());
    }

    @Test
    public void testInBody_Plaintext_LiteralRest() {
        Document doc = Jsoup.parse("<body><plaintext>Hello <b>World</b>");
        assertTrue(doc.body().text().contains("Hello <b>World</b>"));
        assertEquals(0, doc.select("plaintext b").size());
    }

    @Test
    public void testInBody_ButtonAutoClose() {
        Document doc = Jsoup.parse("<body><button><button>in</button></button>");
        assertEquals(2, doc.body().children().size());
        assertEquals("in", doc.body().child(1).text());
    }

    @Test
    public void testInBody_TableClosesParagraph() {
        Document doc = Jsoup.parse("<body><p>txt<table><tr><td>1</td></tr></table></p>");
        Element p = doc.select("p").first();
        Element table = doc.select("table").first();
        assertNotEquals(p, table.parent());
        assertTrue(p.text().contains("txt"));
    }

    @Test
    public void testInBody_InputHiddenKeepsFramesetOk_NonHiddenDisables() {
        Document hidden = Jsoup.parse("<body><input type=hidden><frameset><frame></frameset></body>");
        assertEquals(1, hidden.select("frameset").size());

        Document visible = Jsoup.parse("<body><input type=text><frameset><frame></frameset></body>");
        assertTrue(visible.select("frameset").isEmpty());
    }

    @Test
    public void testInBody_ImageRenamedToImg_ExceptInsideSvg() {
        Document doc1 = Jsoup.parse("<body><image src='x.png'>");
        assertEquals(1, doc1.select("img").size());
        assertEquals(0, doc1.select("image").size());

        Document doc2 = Jsoup.parse("<body><svg><image href='x'></svg>");
        assertEquals(1, doc2.select("svg image").size());
        assertEquals(0, doc2.select("img").size());
    }

    @Test
    public void testInBody_Isindex_ExpandsToFormControls() {
        Document doc = Jsoup.parse("<body><isindex prompt='Enter:' name='x'>");
        assertEquals(1, doc.select("form").size());
        assertEquals(1, doc.select("input[name=isindex]").size());
        assertEquals(1, doc.select("label").size());
        assertEquals(2, doc.select("hr").size());
    }

    @Test
    public void testInBody_Isindex_IgnoredIfFormAlreadyOpen() {
        Document doc = Jsoup.parse("<body><form><isindex></form>");
        assertEquals(1, doc.select("form").size());
        assertTrue(doc.select("input").isEmpty());
        assertTrue(doc.select("hr").isEmpty());
    }

    @Test
    public void testInBody_Textarea_IsRcData() {
        Document doc = Jsoup.parse("<body><textarea><b>not bold</b></textarea>");
        assertTrue(doc.select("textarea").first().wholeText().contains("<b>not bold</b>"));
    }

    @Test
    public void testInBody_Xmp_IsRawTextAndClosesP() {
        Document doc = Jsoup.parse("<body><p>text<xmp>raw <b>data</b></xmp>");
        assertEquals("raw <b>data</b>", doc.select("xmp").first().data());
    }

    @Test
    public void testInBody_RubyRtDroppedWithoutRubyScope() {
        // rp/rt ถูกประมวลผลเฉพาะเมื่อ inScope("ruby") เป็น true เท่านั้น
        Document doc = Jsoup.parse("<body><rt>orphan</rt>");
        assertTrue(doc.select("rt").isEmpty());
        assertTrue(doc.body().text().contains("orphan"));
    }

    @Test
    public void testInBody_DropTagsIgnoredButTextKeeps() {
        // Constants.InBodyStartDrop เช่น "td" ที่ปรากฏตรงใน InBody (ไม่อยู่ในบริบทตาราง) -> error, false
        Document doc = Jsoup.parse("<body><td>stray</td>");
        assertTrue(doc.select("td").isEmpty());
        assertTrue(doc.body().text().contains("stray"));
    }

    @Test
    public void testInBody_UnknownEndTagNoCrash() {
        assertNotNull(Jsoup.parse("<body></li></body>"));
        assertNotNull(Jsoup.parse("<body></dd></body>"));
        assertNotNull(Jsoup.parse("<body></form></body>"));
        assertNotNull(Jsoup.parse("<body></sarcasm></body>"));
        assertNotNull(Jsoup.parse("<body></div></body>"));
    }

    @Test
    public void testInBody_PStrayEndTagCreatesEmptyP() {
        Document doc = Jsoup.parse("<body></p></body>");
        assertEquals(1, doc.select("p").size());
        assertEquals("", doc.select("p").text());
    }

    @Test
    public void testInBody_MismatchedHeadingEndTagClosesCurrentHeading() {
        Document doc = Jsoup.parse("<body><h1>text</h2>");
        assertEquals(1, doc.select("h1").size());
        assertTrue(doc.select("h2").isEmpty());
        assertEquals("text", doc.select("h1").text());
    }

    /**
     * ทดสอบจุดที่คาดว่าเป็น "fault" ในซอร์ส: ใน EndTag ของกลุ่ม InBodyStartApplets
     *   if (!tb.inScope("name")) { ... }
     * ใช้ literal string "name" แทนตัวแปร name (ชื่อแท็กจริง เช่น "applet")
     * ผลคือ ถ้ามี element ที่ชื่อ "name" (แท็กตามตัวอักษร) เปิดอยู่ใน scope จริง ๆ
     * (ancestor <name> ที่ยังไม่ปิด) เงื่อนไขนี้จะเป็น false และข้ามการปิด </applet> ไปทั้งหมด
     *
     * พฤติกรรมที่ถูกต้องตามสเปค: </applet> ควรปิด element <applet> (เพราะ "applet" อยู่ใน scope จริง)
     * ทำให้ "after" กลายเป็น text ที่อยู่หลัง </applet> (นอก applet)
     * แต่ถ้า bug เกิดขึ้น "after" จะถูกแทรกเข้าไปใน applet ต่อจาก "stuff" กลายเป็น "stuffafter"
     *
     * หมายเหตุ: นี่เป็นการวิเคราะห์จากซอร์สที่ให้มา ไม่ได้ทดสอบกับ fixed-version จริง
     * ถ้า assert ด้านล่าง fail แสดงว่าพฤติกรรม bug ตามที่วิเคราะห์เกิดขึ้นจริง
     */
    @Test
    public void testInBody_AppletEndTagScopeBug() {
        Document doc = Jsoup.parse("<body><name><applet>stuff</applet>after</name></body>");
        Element applet = doc.select("applet").first();
        assertNotNull(applet);
        assertEquals("stuff", applet.text());
    }

    @Test
    public void testInBody_BrEndTagInsertsBrElement() {
        Document doc = Jsoup.parse("<body></br></body>");
        assertEquals(1, doc.select("br").size());
    }

    @Test
    public void testInBody_NullCharacterReported() {
        // ไม่แน่ใจว่า tokenizer จะส่ง NUL character ผ่านมาถึง tree builder ในรูปแบบเดิมเสมอหรือไม่
        // จึงตรวจสอบแบบ smoke-test ว่า parser ไม่ throw exception เท่านั้น
        Parser parser = Parser.htmlParser().setTrackErrors(10);
        Document doc = parser.parseInput("<body>\u0000text</body>", "");
        assertNotNull(doc);
    }

    // ---------------------------------------------------------------
    // 8) Text state
    // ---------------------------------------------------------------
    @Test
    public void testText_ScriptEofHandledWithoutException() {
        Document doc = Jsoup.parse("<html><head><script>var x=1;");
        assertNotNull(doc.select("script").first());
    }

    @Test
    public void testText_ScriptEndTagPopsAndTransitions() {
        Document doc = Jsoup.parse("<html><body><script>code</script><p>after</p></body></html>");
        assertEquals("after", doc.select("p").text());
    }

    // ---------------------------------------------------------------
    // 9) InTable / InTableText
    // ---------------------------------------------------------------
    @Test
    public void testInTable_NonWhitespaceTextFosterParented() {
        Document doc = Jsoup.parse("<table>foo<tr><td>bar</td></tr></table>");
        assertTrue(doc.select("table").text().contains("bar"));
        assertFalse(doc.body().html().contains("<table>foo")); // foo ไม่อยู่ข้างในตาราง
        assertTrue(doc.body().text().contains("foo"));
    }

    @Test
    public void testInTable_WhitespaceTextKeptInsideTable() {
        Document doc = Jsoup.parse("<table> \n <tr><td>x</td></tr></table>");
        assertEquals("x", doc.select("td").text());
    }

    @Test
    public void testInTable_ColWithoutColgroupAutoWraps() {
        Document doc = Jsoup.parse("<table><col><tr><td>1</td></tr></table>");
        assertEquals(1, doc.select("table > colgroup > col").size());
    }

    @Test
    public void testInTable_TdTrWithoutTbodyAutoWraps() {
        Document doc = Jsoup.parse("<table><tr><td>1</td></tr></table>");
        assertEquals("1", doc.select("table tbody tr td").text());
    }

    @Test
    public void testInTable_NestedTableBecomesSibling() {
        Document doc = Jsoup.parse("<table><table><tr><td>inner</td></tr></table></table>");
        assertEquals(2, doc.select("table").size());
        Element outer = doc.select("table").get(0);
        Element inner = doc.select("table").get(1);
        assertFalse(outer.children().contains(inner));
    }

    @Test
    public void testInTable_StyleScriptRoutedToHead() {
        Document doc = Jsoup.parse("<table><style>.a{}</style><tr><td>1</td></tr></table>");
        assertEquals(".a{}", doc.select("style").first().data());
    }

    // ---------------------------------------------------------------
    // 10) InCaption
    // ---------------------------------------------------------------
    @Test
    public void testInCaption_BasicCaption() {
        Document doc = Jsoup.parse("<table><caption>Cap <b>Bold</b></caption><tr><td>1</td></tr></table>");
        assertEquals("Bold", doc.select("caption b").text());
    }

    @Test
    public void testInCaption_ImplicitCloseOnTr() {
        Document doc = Jsoup.parse("<table><caption>Cap<tr><td>1</td></tr></table>");
        assertEquals("Cap", doc.select("caption").text());
        assertEquals("1", doc.select("td").text());
    }

    // ---------------------------------------------------------------
    // 11) InColumnGroup
    // ---------------------------------------------------------------
    @Test
    public void testInColumnGroup_ColInserted() {
        Document doc = Jsoup.parse("<table><colgroup><col></colgroup><tr><td>1</td></tr></table>");
        assertEquals(1, doc.select("colgroup col").size());
    }

    @Test
    public void testInColumnGroup_UnknownStartTagClosesColgroup() {
        Document doc = Jsoup.parse("<table><colgroup><tr><td>1</td></tr></colgroup></table>");
        assertEquals("1", doc.select("td").text());
    }

    // ---------------------------------------------------------------
    // 12) InTableBody / InRow / InCell
    // ---------------------------------------------------------------
    @Test
    public void testInTableBody_AutoWrapsTr() {
        Document doc = Jsoup.parse("<table><tbody><td>1</td></tbody></table>");
        assertEquals("1", doc.select("table tbody tr td").text());
    }

    @Test
    public void testInRow_MissingTrHandledBetweenRows() {
        Document doc = Jsoup.parse("<table><tr><td>1</td><tr><td>2</td></tr></table>");
        assertEquals(2, doc.select("tr").size());
        assertEquals("1", doc.select("tr").get(0).text());
        assertEquals("2", doc.select("tr").get(1).text());
    }

    @Test
    public void testInCell_SecondTdClosesFirst() {
        Document doc = Jsoup.parse("<table><tr><td>1<td>2</td></tr></table>");
        assertEquals(2, doc.select("td").size());
        assertEquals("1", doc.select("td").get(0).text());
        assertEquals("2", doc.select("td").get(1).text());
    }

    @Test
    public void testInCell_TrEndTagClosesOpenCell() {
        Document doc = Jsoup.parse("<table><tbody><tr><td>1</tr></tbody></table>");
        assertEquals("1", doc.select("table tbody tr td").text());
        assertEquals(1, doc.select("tr").size());
    }

    // ---------------------------------------------------------------
    // 13) InSelect / InSelectInTable
    // ---------------------------------------------------------------
    @Test
    public void testInSelect_OptionAutoCloses() {
        Document doc = Jsoup.parse("<body><select><option>1<option>2</select>");
        assertEquals(2, doc.select("select option").size());
    }

    @Test
    public void testInSelect_OptgroupAutoCloses() {
        Document doc = Jsoup.parse("<body><select><optgroup><option>1</optgroup><optgroup><option>2</optgroup></select>");
        assertEquals(2, doc.select("select optgroup").size());
    }

    @Test
    public void testInSelect_InputClosesSelect() {
        Document doc = Jsoup.parse("<body><select><option>1</option><input type=text></select>");
        assertTrue(doc.select("select input").isEmpty());
        assertEquals(1, doc.select("input").size());
    }

    @Test
    public void testInSelect_UnknownStartTagDropped_TextStillInserted() {
        Document doc = Jsoup.parse("<body><select><div>ignored</div></select>");
        assertTrue(doc.select("select div").isEmpty());
        assertTrue(doc.select("select").text().contains("ignored"));
    }

    @Test
    public void testInSelect_ResetInsertionModeAfterClose() {
        Document doc = Jsoup.parse("<body><select><option>1</option></select><p>after</p>");
        assertEquals("after", doc.select("p").text());
    }

    @Test
    public void testInSelectInTable_TableInsideSelectInsideCell_NoCrash() {
        // กรณีซับซ้อน: select ที่เปิดขณะอยู่ในบริบท td จะเข้า InSelectInTable (ไม่ใช่ InSelect ปกติ)
        Document doc = Jsoup.parse(
            "<table><tr><td><select><option>1</option></select></td></tr></table>");
        assertEquals(1, doc.select("table").size());
        assertEquals("1", doc.select("select option").text());
    }

    // ---------------------------------------------------------------
    // 14) AfterBody / AfterAfterBody
    // ---------------------------------------------------------------
    @Test
    public void testAfterBody_WhitespaceAndCommentHandledAtHtmlLevel() {
        Document doc = Jsoup.parse("<html><body>x</body><!--after--></html>");
        boolean found = false;
        for (Node n : doc.select("html").first().childNodes())
            if (n instanceof Comment && ((Comment) n).getData().equals("after")) found = true;
        assertTrue(found);
        assertFalse(doc.body().childNodes().stream().anyMatch(n -> n instanceof Comment));
    }

    @Test
    public void testAfterBody_StrayContentReopensBody() {
        Document doc = Jsoup.parse("<html><body>x</body><p>y</p></html>");
        assertTrue(doc.body().text().contains("x"));
        assertEquals("y", doc.body().select("p").text());
    }

    @Test
    public void testAfterBody_HtmlEndTagLeadsToAfterAfterBody() {
        Document doc = Jsoup.parse("<html><body>x</body></html>");
        assertEquals("x", doc.body().text());
    }

    @Test
    public void testAfterAfterBody_TrailingContentReappendsToBody() {
        Document doc = Jsoup.parse("<html><body>x</body></html>trailing");
        assertTrue(doc.body().text().contains("trailing"));
    }

    @Test
    public void testAfterAfterBody_TrailingCommentAtDocumentLevel() {
        Document doc = Jsoup.parse("<html><body>x</body></html><!--tail-->");
        boolean found = doc.childNodes().stream()
                .anyMatch(n -> n instanceof Comment && ((Comment) n).getData().equals("tail"));
        assertTrue(found);
    }

    // ---------------------------------------------------------------
    // 15) InFrameset / AfterFrameset / AfterAfterFrameset
    // ---------------------------------------------------------------
    @Test
    public void testInFrameset_UnknownStartTagIgnored() {
        Document doc = Jsoup.parse("<html><head></head><frameset><div></div></frameset></html>");
        assertTrue(doc.select("div").isEmpty());
    }

    @Test
    public void testInFrameset_NestedFrameset() {
        Document doc = Jsoup.parse("<html><head></head><frameset><frameset><frame></frameset></frameset></html>");
        assertEquals(2, doc.select("frameset").size());
    }

    @Test
    public void testAfterFrameset_TrailingTextDropped_NotReprocessed() {
        // ต่างจาก AfterBody: AfterFrameset ที่พบ token อื่น ๆ จะ error+return false (ไม่ reprocess)
        Document doc = Jsoup.parse("<html><head></head><frameset><frame></frameset>stray</html>");
        assertFalse(doc.html().contains("stray"));
    }

    @Test
    public void testAfterFrameset_TrailingCommentCapturedAtAfterAfterFrameset() {
        Document doc = Jsoup.parse("<html><head></head><frameset><frame></frameset></html><!--tail-->");
        boolean found = doc.childNodes().stream()
                .anyMatch(n -> n instanceof Comment && ((Comment) n).getData().equals("tail"));
        assertTrue(found);
    }
}
```

> **หมายเหตุ:** บางเทสอิงการวิเคราะห์ flow ของ state machine อย่างละเอียด (เช่น `testInBody_AppletEndTagScopeBug`, `testInSelectInTable_*`, `testInHeadNoscript_*`) ซึ่งหากพฤติกรรมจริงของ jsoup เวอร์ชันที่ compile ต่างจากที่วิเคราะห์เล็กน้อย (เช่น `isSpecial()` list หรือ default attribute value) อาจต้องปรับ assertion ให้ตรงกับผลลัพธ์จริงที่สังเกตได้จาก golden run

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| กลุ่มเทส | State/Branch ที่ครอบคลุม |
|---|---|
| `ensureConstantArraysAreSorted` | ตรวจ `Constants.*` arrays ต้องเรียงลำดับ (ฐานของ `StringUtil.inSorted`) |
| `testInitial_*` | `Initial`: whitespace, comment, doctype (noQuirks), else-transition-reprocess |
| `testBeforeHtml_*` | `BeforeHtml`: doctype error, comment, startTag html, endTag ใน/นอกชุด, anythingElse |
| `testBeforeHead_*` | `BeforeHead`: html merge (ผ่าน InBody), head insert, endTag set, else |
| `testInHead_*` | `InHead`: base/meta/title/style/script/noscript/head-ซ้ำ/unknown startTag |
| `testInHeadNoscript_*` | `InHeadNoscript`: endTag noscript, allowed startTag ผ่าน InHead, nested noscript ignore |
| `testAfterHead_*` | `AfterHead`: body/frameset/head-related-tag/duplicate head/unknown startTag |
| `testInBody_*` (startTag) | a, pClosers(div), li, html/body merge, headings, pre, form, dd/dt, plaintext, button, table, input(hidden/non-hidden), image/svg, isindex(x2), textarea, xmp, ruby(rt), drop-tags |
| `testInBody_*` (endTag) | stray closers, p empty-create, heading mismatch, **applet scope bug**, br |
| `testInBody_NullCharacterReported` | Character == NUL branch (smoke test, uncertain) |
| `testText_*` | `Text`: EOF reprocess, endTag pop+transition |
| `testInTable_*` / `InTableText` | character foster-parenting (ws/non-ws), col/td auto-wrap, nested table, style/script→InHead |
| `testInCaption_*` | caption ปิดปกติ, implicit close เมื่อ `<tr>` |
| `testInColumnGroup_*` | col insert, unknown startTag ปิด colgroup |
| `testInTableBody_*` / `InRow` / `InCell` | auto-wrap tr, missing-tr handling, second-td close-first, tr end tag close cell |
| `testInSelect_*` / `InSelectInTable` | option/optgroup auto-close, input ปิด select, unknown tag drop, reset insertion mode, select ใน table context |
| `testAfterBody_*` / `AfterAfterBody` | comment ที่ html-level, stray content reopen body, trailing content/comment |
| `testInFrameset_*` / `AfterFrameset` / `AfterAfterFrameset` | unknown startTag ignore, nested frameset, trailing text dropped (ไม่ reprocess) vs trailing comment ที่ AfterAfterFrameset |
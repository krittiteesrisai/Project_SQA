package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link HtmlTreeBuilderState}.
 *
 * หมายเหตุ:
 * - คลาสเป้าหมายเป็น package-private enum จึงต้องวาง test ไว้ใน package org.jsoup.parser
 * - ใช้ public API ของ jsoup (Jsoup.parse / Parser) เพื่อ drive state machine จริง
 * - state ForeignContent ไม่มีทางใดใน source ที่ transition เข้าไปได้ (ตามคอมเมนต์ "how do we get here?")
 *   จึงไม่สามารถเขียน test ที่ trigger ได้โดยไม่เดา -> ข้ามไว้
 * - บางเงื่อนไข "not in scope" ของ InCell/InRow/InSelect ยากที่จะ trigger ผ่านเอกสาร HTML ปรกติ
 *   (เพราะการเข้า state นั้นมักแปลว่า element เกี่ยวข้องอยู่ใน scope แล้ว) จึงไม่ได้ทดสอบ
 */
public class HtmlTreeBuilderStateTest {

    private Document parse(String html) {
        return Jsoup.parse(html);
    }

    private Parser trackedParser() {
        Parser p = Parser.htmlParser();
        p.setTrackErrors(50);
        return p;
    }

    // ===================== Initial =====================

    @Test
    public void initial_doctype_withPublicId() {
        Document doc = parse("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\"><html><head></head><body></body></html>");
        Node first = doc.childNode(0);
        assertTrue(first instanceof DocumentType);
    }

    @Test
    public void initial_whitespace_ignored() {
        Document doc = parse("   <html><head></head><body>x</body></html>");
        assertEquals("x", doc.body().text());
    }

    @Test
    public void initial_comment_inserted() {
        Document doc = parse("<!--c--><html><head></head><body>x</body></html>");
        boolean hasComment = false;
        for (Node n : doc.childNodes()) if (n instanceof Comment) hasComment = true;
        assertTrue(hasComment);
    }

    @Test
    public void initial_otherToken_reprocessed_asBeforeHtml() {
        // ไม่มี doctype/comment -> else branch -> transition(BeforeHtml) + reprocess
        Document doc = parse("<html><head></head><body>ok</body></html>");
        assertEquals("ok", doc.body().text());
    }

    // ===================== BeforeHtml =====================

    @Test
    public void beforeHtml_secondDoctype_error_ignored() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<!DOCTYPE html><!DOCTYPE html><html><head></head><body>x</body></html>", "");
        assertFalse(p.getErrors().isEmpty());
        assertEquals("x", doc.body().text());
    }

    @Test
    public void beforeHtml_comment_noError() {
        Document doc = parse("<!DOCTYPE html><!--c--><html><head></head><body>x</body></html>");
        assertEquals("x", doc.body().text());
    }

    @Test
    public void beforeHtml_whitespace_ignored() {
        Document doc = parse("<!DOCTYPE html>   <html><head></head><body>x</body></html>");
        assertEquals("x", doc.body().text());
    }

    @Test
    public void beforeHtml_endTag_inWhitelist_anythingElse() {
        // </head> ก่อนมี <html> -> anythingElse -> insert html implicitly แล้ว reprocess
        Document doc = parse("<!DOCTYPE html></head><html><head></head><body>x</body></html>");
        assertNotNull(doc.selectFirst("html"));
        assertEquals("x", doc.body().text());
    }

    @Test
    public void beforeHtml_endTag_notInWhitelist_error_ignored() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<!DOCTYPE html></div><html><head></head><body>x</body></html>", "");
        assertFalse(p.getErrors().isEmpty());
        assertEquals("x", doc.body().text());
    }

    @Test
    public void beforeHtml_textToken_anythingElse() {
        Document doc = parse("<!DOCTYPE html>text<html><head></head><body></body></html>");
        assertTrue(doc.body().text().contains("text"));
    }

    // ===================== BeforeHead =====================

    @Test
    public void beforeHead_whitespace_ignored() {
        Document doc = parse("<html>   <head><title>t</title></head><body></body></html>");
        assertEquals("t", doc.title());
    }

    @Test
    public void beforeHead_comment_inserted() {
        Document doc = parse("<html><!--c--><head><title>t</title></head><body></body></html>");
        assertEquals("t", doc.title());
    }

    @Test
    public void beforeHead_doctype_error_ignored() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<html><!DOCTYPE html><head><title>t</title></head><body></body></html>", "");
        assertFalse(p.getErrors().isEmpty());
        assertEquals("t", doc.title());
    }

    @Test
    public void beforeHead_startTagHtml_mergesAttrs_noTransition() {
        Document doc = parse("<html id='a'><html data-x='b'><head></head><body></body></html>");
        Element root = doc.child(0);
        assertEquals("a", root.attr("id"));
        assertEquals("b", root.attr("data-x"));
    }

    @Test
    public void beforeHead_startTagHead_setsHeadElement() {
        Document doc = parse("<html><head id='h'></head><body></body></html>");
        assertEquals("h", doc.head().attr("id"));
    }

    @Test
    public void beforeHead_endTag_whitelist_autoInsertsHead() {
        Document doc = parse("<html></head><body>x</body></html>");
        assertNotNull(doc.head());
        assertEquals("x", doc.body().text());
    }

    @Test
    public void beforeHead_endTag_other_error_ignored() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<html></div><head></head><body>x</body></html>", "");
        assertFalse(p.getErrors().isEmpty());
        assertEquals("x", doc.body().text());
    }

    @Test
    public void beforeHead_anythingElse_autoInsertsHead() {
        Document doc = parse("<html>text<head></head><body></body></html>");
        assertNotNull(doc.head());
        assertTrue(doc.text().contains("text"));
    }

    // ===================== InHead =====================

    @Test
    public void inHead_title_rcdata_entitiesDecoded() {
        Document doc = parse("<head><title>Hello &amp; World</title></head><body></body>");
        assertEquals("Hello & World", doc.title());
    }

    @Test
    public void inHead_comment_inserted() {
        Document doc = parse("<head><!--c--><title>t</title></head><body></body>");
        assertEquals("t", doc.title());
    }

    @Test
    public void inHead_doctype_error_returnsFalse_ignored() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<head><!DOCTYPE html><title>t</title></head><body></body>", "");
        assertFalse(p.getErrors().isEmpty());
        assertEquals("t", doc.title());
    }

    @Test
    public void inHead_startTagHtml_mergesAttrs() {
        Document doc = parse("<head><html id='z'><title>t</title></head><body></body>");
        assertEquals("z", doc.child(0).attr("id"));
    }

    @Test
    public void inHead_base_setsBaseUri_usedForLinks() {
        Document doc = parse("<head><base href='http://example.com/'></head><body><a href='foo'>x</a></body>");
        Element a = doc.selectFirst("a");
        assertEquals("http://example.com/foo", a.absUrl("href"));
    }

    @Test
    public void inHead_meta_insertedEmpty() {
        Document doc = parse("<head><meta charset='utf-8'></head><body></body>");
        Elements metas = doc.head().select("meta");
        assertEquals(1, metas.size());
    }

    @Test
    public void inHead_style_rawtext_noEntityDecoding() {
        Document doc = parse("<head><style>a{color:red}&amp;</style></head><body></body>");
        Element style = doc.head().selectFirst("style");
        assertTrue(style.data().contains("&amp;")); // rawtext: entity ไม่ถูก decode
    }

    @Test
    public void inHead_noscript_notRawtext_literalTagInsertedAsText() {
        // ภายใน InHeadNoscript, <p> ไม่อยู่ใน whitelist -> anythingElse -> insert literal token string
        Document doc = parse("<head><noscript><p>x</p></noscript></head><body></body>");
        Element noscript = doc.head().selectFirst("noscript");
        assertNull(noscript.selectFirst("p")); // ไม่ได้ถูกสร้างเป็น element จริง
    }

    @Test
    public void inHead_script_rawtext_captured() {
        Document doc = parse("<head><script>var x=1;</script></head><body></body>");
        Element script = doc.head().selectFirst("script");
        assertEquals("var x=1;", script.data());
    }

    @Test
    public void inHead_nestedHead_error_ignored() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<head><head></head></head><body></body>", "");
        assertFalse(p.getErrors().isEmpty());
        assertEquals(0, doc.head().select("head").size());
    }

    @Test
    public void inHead_anythingElse_exitsToAfterHead() {
        Document doc = parse("<head><div>x</div></head><body></body>");
        assertNull(doc.head().selectFirst("div"));
        assertEquals("x", doc.body().text());
    }

    @Test
    public void inHead_endTagHead_normalClose() {
        Document doc = parse("<head><title>t</title></head><body>b</body>");
        assertNotNull(doc.head());
        assertEquals("b", doc.body().text());
    }

    @Test
    public void inHead_endTag_other_error_ignored() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<head></div></head><body>x</body>", "");
        assertFalse(p.getErrors().isEmpty());
        assertEquals("x", doc.body().text());
    }

    // ===================== InHeadNoscript =====================

    @Test
    public void inHeadNoscript_doctype_errorOnly_continues() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<head><noscript><!DOCTYPE html></noscript></head><body>x</body>", "");
        assertFalse(p.getErrors().isEmpty());
        assertEquals("x", doc.body().text());
    }

    @Test
    public void inHeadNoscript_startTagHtml_mergesAttrs() {
        Document doc = parse("<head><noscript><html id='q'></noscript></head><body></body>");
        assertEquals("q", doc.child(0).attr("id"));
    }

    @Test
    public void inHeadNoscript_endTagNoscript_popsAndTransitionsInHead() {
        Document doc = parse("<head><noscript></noscript><title>t</title></head><body></body>");
        assertNotNull(doc.head().selectFirst("noscript"));
        assertEquals("t", doc.title());
    }

    @Test
    public void inHeadNoscript_whitelistedStartTag_delegatesToInHead() {
        Document doc = parse("<head><noscript><link rel='x'></noscript></head><body></body>");
        Element noscript = doc.head().selectFirst("noscript");
        assertNotNull(noscript.selectFirst("link"));
    }

    @Test
    public void inHeadNoscript_endTagBr_anythingElse_insertsLiteral() {
        Document doc = parse("<head><noscript></br></noscript></head><body></body>");
        Element noscript = doc.head().selectFirst("noscript");
        assertTrue(noscript.childNodeSize() > 0);
    }

    @Test
    public void inHeadNoscript_nestedNoscriptStartTag_error_dropped() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<head><noscript><noscript></noscript></noscript></head><body>x</body>", "");
        assertFalse(p.getErrors().isEmpty());
        Element noscript = doc.head().selectFirst("noscript");
        assertEquals(0, noscript.children().size());
    }

    // ===================== AfterHead =====================

    @Test
    public void afterHead_doctype_error_continues() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<head></head><!DOCTYPE html><body>x</body>", "");
        assertFalse(p.getErrors().isEmpty());
        assertEquals("x", doc.body().text());
    }

    @Test
    public void afterHead_startTagHtml_mergesAttrs() {
        Document doc = parse("<head></head><html id='w'><body></body></html>");
        assertEquals("w", doc.child(0).attr("id"));
    }

    @Test
    public void afterHead_startTagBody_normalTransition() {
        Document doc = parse("<head></head><body id='b'>x</body>");
        assertEquals("b", doc.body().attr("id"));
        assertEquals("x", doc.body().text());
    }

    @Test
    public void afterHead_startTagFrameset_transitions() {
        Document doc = parse("<head></head><frameset><frame></frameset>");
        assertEquals(1, doc.select("frameset").size());
    }

    @Test
    public void afterHead_headRelatedStartTag_pushHeadProcessRemove() {
        // <title> หลัง head ปิดแล้ว -> error, push head กลับ, process ใน InHead, แล้ว removeFromStack(head)
        Document doc = parse("<head></head><title>late</title><body></body>");
        assertEquals("late", doc.title());
    }

    @Test
    public void afterHead_startTagHead_error_ignored() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<head></head><head></head><body>x</body>", "");
        assertFalse(p.getErrors().isEmpty());
        assertEquals("x", doc.body().text());
    }

    @Test
    public void afterHead_startTagAnythingElse_autoInsertsBody() {
        Document doc = parse("<head></head><div>x</div>");
        assertEquals("x", doc.body().text());
        assertNotNull(doc.body().selectFirst("div"));
    }

    @Test
    public void afterHead_endTagOther_error_ignored() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<head></head></div><body>x</body>", "");
        assertFalse(p.getErrors().isEmpty());
        assertEquals("x", doc.body().text());
    }

    @Test
    public void afterHead_default_anythingElse_autoInsertsBody() {
        Document doc = parse("<head></head>"); // EOF -> else branch -> processStartTag("body")
        assertNotNull(doc.body());
    }

    // ===================== InBody (start tags) =====================

    @Test
    public void inBody_nullCharacter_error_dropped() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<body>\u0000</body>", "");
        assertFalse(p.getErrors().isEmpty());
    }

    @Test
    public void inBody_tagA_reconstructsOnReentrantA() {
        Document doc = parse("<body><a id='a1'>text1<a id='a2'>text2</a></a></body>");
        Elements as = doc.body().select("a");
        assertEquals(2, as.size());
        assertEquals("a1", as.get(0).attr("id"));
        assertEquals("a2", as.get(1).attr("id"));
    }

    @Test
    public void inBody_emptyFormatters_voidElements() {
        Document doc = parse("<body><br><img src='x'></body>");
        assertEquals(2, doc.body().children().size());
    }

    @Test
    public void inBody_pCloser_closesOpenP() {
        Document doc = parse("<body><p>1<div>2</div></body>");
        assertEquals(2, doc.body().children().size());
        assertEquals("1", doc.body().children().get(0).text());
    }

    @Test
    public void inBody_li_autoClosesPriorLi() {
        Document doc = parse("<body><ul><li>1<li>2</li></ul></body>");
        Elements lis = doc.select("ul > li");
        assertEquals(2, lis.size());
    }

    @Test
    public void inBody_html_mergesAttrsOntoRoot() {
        Document doc = parse("<body><html data-extra='v'></body>");
        assertEquals("v", doc.child(0).attr("data-extra"));
    }

    @Test
    public void inBody_toHeadList_redirectsToInHead() {
        Document doc = parse("<body><title>late</title></body>");
        assertEquals("late", doc.title());
    }

    @Test
    public void inBody_body_mergesAttrs_ignoreDuplicate() {
        Document doc = parse("<body id='first'><body data-x='v'></body>");
        assertEquals("first", doc.body().attr("id"));
        assertEquals("v", doc.body().attr("data-x"));
    }

    @Test
    public void inBody_frameset_droppedWhenFramesetNotOk() {
        Document doc = parse("<body>abc<frameset></frameset></body>");
        assertTrue(doc.select("frameset").isEmpty());
        assertTrue(doc.body().text().contains("abc"));
    }

    @Test
    public void inBody_headings_autoClosesPriorHeading() {
        Document doc = parse("<body><h1>a<h2>b</h2></body>");
        Elements children = doc.body().children();
        assertEquals(2, children.size());
        assertEquals("h1", children.get(0).tagName());
        assertEquals("h2", children.get(1).tagName());
    }

    @Test
    public void inBody_form_onlyOneAllowed() {
        Document doc = parse("<body><form id='f1'></form><form id='f2'></form></body>");
        assertEquals(1, doc.select("form").size());
        assertEquals("f1", doc.selectFirst("form").attr("id"));
    }

    @Test
    public void inBody_plaintext_remainingTokensAreRawText() {
        Document doc = parse("<body><plaintext>raw <b>not bold</b></plaintext></body>");
        Element plaintext = doc.selectFirst("plaintext");
        assertTrue(plaintext.text().contains("<b>not bold</b>"));
    }

    @Test
    public void inBody_button_nested_closesAndReprocesses() {
        Document doc = parse("<body><button>1<button>2</button></button></body>");
        Elements buttons = doc.body().select("button");
        assertEquals(2, buttons.size());
    }

    @Test
    public void inBody_nobr_inScope_closesAndReinserts() {
        Document doc = parse("<body><nobr>1<nobr>2</nobr></nobr></body>");
        assertEquals(2, doc.select("nobr").size());
    }

    @Test
    public void inBody_table_closesOpenP_whenNotQuirks() {
        Document doc = parse("<body><p>1<table><tr><td>2</td></tr></table></body>");
        Elements children = doc.body().children();
        assertEquals("p", children.get(0).tagName());
        assertEquals("table", children.get(1).tagName());
    }

    @Test
    public void inBody_image_renamedToImg() {
        Document doc = parse("<body><image src='x.png'></body>");
        Element el = doc.body().children().first();
        assertEquals("img", el.tagName());
    }

    @Test
    public void inBody_isindex_triggersErrorAndCompositeInsert() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<body><isindex name='isindex' prompt='Q:'></body>", "");
        assertFalse(p.getErrors().isEmpty());
        assertNotNull(doc.selectFirst("input[name=isindex]"));
    }

    @Test
    public void inBody_textarea_rcdata() {
        Document doc = parse("<body><textarea>line1\nline2</textarea></body>");
        assertTrue(doc.selectFirst("textarea").text().contains("line2"));
    }

    @Test
    public void inBody_xmp_rawtext_noEntityDecode() {
        Document doc = parse("<body><xmp>&amp;raw</xmp></body>");
        assertTrue(doc.selectFirst("xmp").data().contains("&amp;raw"));
    }

    @Test
    public void inBody_iframe_rawtext() {
        Document doc = parse("<body><iframe>content</iframe></body>");
        assertEquals("content", doc.selectFirst("iframe").data());
    }

    @Test
    public void inBody_noembed_rawtext() {
        Document doc = parse("<body><noembed>abc</noembed></body>");
        assertEquals("abc", doc.selectFirst("noembed").data());
    }

    @Test
    public void inBody_select_withOption_basic() {
        Document doc = parse("<body><select><option>1</option></select></body>");
        assertEquals("1", doc.selectFirst("select option").text());
    }

    @Test
    public void inBody_options_autoClosePriorOption() {
        Document doc = parse("<body><select><option>1<option>2</option></select></body>");
        assertEquals(2, doc.select("select option").size());
    }

    @Test
    public void inBody_ruby_withRt() {
        Document doc = parse("<body><ruby>base<rt>ann</rt></ruby></body>");
        assertEquals("ann", doc.selectFirst("ruby rt").text());
    }

    @Test
    public void inBody_dropList_tdOutsideTable_errorDropped() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<body><td>oops</td></body>", "");
        assertFalse(p.getErrors().isEmpty());
        assertTrue(doc.select("td").isEmpty());
        assertTrue(doc.body().text().contains("oops"));
    }

    @Test
    public void inBody_defaultElse_genericTag() {
        Document doc = parse("<body><custom-tag>hi</custom-tag></body>");
        Element el = doc.body().selectFirst("custom-tag");
        assertNotNull(el);
        assertEquals("hi", el.text());
    }

    // ===================== InBody (end tags) =====================

    @Test
    public void inBody_adoptionAgency_classicCase() {
        // ตัวอย่าง classic จาก HTML5 adoption agency algorithm
        Document doc = parse("<body><a href='a'>1<p>2</a>3</p></body>");
        assertEquals("123", doc.body().text().replace(" ", ""));
        assertEquals(2, doc.select("a").size()); // ถูก clone เป็น adopter
    }

    @Test
    public void inBody_endTag_closersList_normalClose() {
        Document doc = parse("<body><div>1<address>2</address>3</div></body>");
        assertNotNull(doc.selectFirst("div address"));
    }

    @Test
    public void inBody_endTag_li_notInScope_error() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<body></li></body>", "");
        assertFalse(p.getErrors().isEmpty());
    }

    @Test
    public void inBody_endTag_html_processesBodyThenReenters() {
        Document doc = parse("<body>hi</html>trailing");
        assertTrue(doc.body().text().contains("hi"));
        assertTrue(doc.body().text().contains("trailing"));
    }

    @Test
    public void inBody_endTag_form_closesAndRemoves() {
        Document doc = parse("<body><form id='f'>stuff</form></body>");
        assertEquals(1, doc.select("form").size());
        assertTrue(doc.selectFirst("form").text().contains("stuff"));
    }

    @Test
    public void inBody_endTag_p_notInScope_autoCreatesEmptyP() {
        Document doc = parse("<body></p>after</body>");
        assertNotNull(doc.selectFirst("p"));
        assertTrue(doc.body().text().contains("after"));
    }

    @Test
    public void inBody_endTag_dddt_normalClose() {
        Document doc = parse("<body><dl><dt>t<dd>d</dd></dt></dl></body>");
        assertNotNull(doc.selectFirst("dl dt"));
        assertNotNull(doc.selectFirst("dl dd"));
    }

    @Test
    public void inBody_endTag_headings_notInScope_error() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<body></h1></body>", "");
        assertFalse(p.getErrors().isEmpty());
    }

    @Test
    public void inBody_endTag_applet_closesNormally() {
        // หมายเหตุ: source ตรวจ `tb.inScope("name")` เป็น literal string "name" (ดูเหมือน defect ที่ไม่ได้ใช้ตัวแปร name)
        // ทำให้เงื่อนไข !inScope("name") เป็น true แทบทุกกรณี และ fallback เข้า block ภายในเสมอ
        // ซึ่งภายใน block จะเช็ค inScope(name) (ตัวแปรจริง) อย่างถูกต้องอีกที จึงทำงานได้ถูกต้องในเคส "ปรกติ" นี้
        Document doc = parse("<body><applet>abc</applet></body>");
        assertEquals(1, doc.select("applet").size());
        assertEquals("abc", doc.selectFirst("applet").text());
    }

    @Test
    public void inBody_endTag_br_autoInsertsBr() {
        Document doc = parse("<body></br></body>");
        assertEquals(1, doc.select("br").size());
    }

    @Test
    public void inBody_endTag_anyOtherEndTag_closesGenericTag() {
        Document doc = parse("<body><custom>txt</custom></body>");
        assertEquals("txt", doc.selectFirst("custom").text());
    }

    @Test
    public void inBody_eof_unterminated_stillProcessesContent() {
        Document doc = parse("<body>hi");
        assertTrue(doc.body().text().contains("hi"));
    }

    // ===================== Text =====================

    @Test
    public void text_rawtextScript_withLessThan() {
        Document doc = parse("<body><script>1 < 2</script></body>");
        assertTrue(doc.selectFirst("script").data().contains("1 < 2"));
    }

    @Test
    public void text_eof_unterminatedScript_noException() {
        Document doc = parse("<script>abc");
        assertNotNull(doc);
    }

    @Test
    public void text_endTag_returnsToOriginalState_inBody() {
        Document doc = parse("<body><title>t</title>after</body>");
        assertEquals("t", doc.title());
        assertTrue(doc.body().text().contains("after"));
    }

    // ===================== InTable / InTableText =====================

    @Test
    public void inTable_whitespaceCharacter_handledViaTableText() {
        Document doc = parse("<body><table> <tr><td>1</td></tr></table></body>");
        assertEquals("1", doc.selectFirst("table td").text());
    }

    @Test
    public void inTable_nonWhitespaceCharacter_fosterParentedOutOfTable() {
        Document doc = parse("<body><table>stray<tr><td>1</td></tr></table></body>");
        assertFalse(doc.selectFirst("table").text().contains("stray"));
        assertTrue(doc.body().text().contains("stray"));
    }

    @Test
    public void inTable_comment_insertedDirectly() {
        Document doc = parse("<body><table><!--c--><tr><td>1</td></tr></table></body>");
        boolean has = false;
        for (Node n : doc.selectFirst("table").childNodes()) if (n instanceof Comment) has = true;
        assertTrue(has);
    }

    @Test
    public void inTable_doctype_error_ignored() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<body><table><!DOCTYPE html><tr><td>1</td></tr></table></body>", "");
        assertFalse(p.getErrors().isEmpty());
        assertEquals("1", doc.selectFirst("table td").text());
    }

    @Test
    public void inTable_caption_inserted() {
        Document doc = parse("<body><table><caption>Cap</caption><tr><td>1</td></tr></table></body>");
        assertEquals("Cap", doc.selectFirst("table caption").text());
    }

    @Test
    public void inTable_colWithoutColgroup_autoInsertsColgroup() {
        Document doc = parse("<body><table><col span='2'><tr><td>1</td></tr></table></body>");
        assertNotNull(doc.selectFirst("table colgroup col"));
    }

    @Test
    public void inTable_tdThTr_autoInsertsTbody() {
        Document doc = parse("<body><table><tr><td>1</td></tr></table></body>");
        assertEquals(1, doc.select("table > tbody").size());
    }

    @Test
    public void inTable_nestedTable_closesOuterFirst() {
        Document doc = parse("<body><table><table><tr><td>inner</td></tr></table></table></body>");
        assertTrue(doc.select("table table").isEmpty());
        assertEquals(2, doc.select("table").size());
    }

    @Test
    public void inTable_styleScript_redirectsToInHead() {
        Document doc = parse("<body><table><style>.a{}</style><tr><td>1</td></tr></table></body>");
        assertEquals(".a{}", doc.selectFirst("table style").data());
    }

    @Test
    public void inTable_input_hidden_insertedDirectly() {
        Document doc = parse("<body><table><input type='hidden' name='h'><tr><td>1</td></tr></table></body>");
        assertNotNull(doc.selectFirst("table > input"));
    }

    @Test
    public void inTable_input_nonHidden_fosterParented() {
        Document doc = parse("<body><table><input type='text'><tr><td>1</td></tr></table></body>");
        assertTrue(doc.select("table input").isEmpty());
    }

    @Test
    public void inTable_anythingElse_startTag_fosterParented() {
        Document doc = parse("<body><table><div>d</div><tr><td>1</td></tr></table></body>");
        assertTrue(doc.select("table div").isEmpty());
    }

    @Test
    public void inTable_endTagTable_resetsInsertionMode() {
        Document doc = parse("<body><table><tr><td>1</td></tr></table>after</body>");
        assertTrue(doc.body().text().contains("1"));
        assertTrue(doc.body().text().contains("after"));
    }

    @Test
    public void inTable_endTag_disallowedList_error_ignored() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<body><table></tbody></table></body>", "");
        assertFalse(p.getErrors().isEmpty());
        assertEquals(1, doc.select("table").size());
    }

    @Test
    public void inTableText_nullCharacter_dropped() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<body><table>\u0000<tr><td>1</td></tr></table></body>", "");
        assertFalse(p.getErrors().isEmpty());
        assertEquals("1", doc.selectFirst("table td").text());
    }

    // ===================== InCaption =====================

    @Test
    public void inCaption_elseDelegatesToInBody_nestedDiv() {
        Document doc = parse("<body><table><caption>Cap<div>d</div></caption><tr><td>1</td></tr></table></body>");
        Element caption = doc.selectFirst("table caption");
        assertNotNull(caption.selectFirst("div"));
    }

    @Test
    public void inCaption_implicitCloseOnTriggerStartTag() {
        Document doc = parse("<body><table><caption>Cap<tr><td>1</td></tr></table></body>");
        assertEquals(1, doc.select("table > caption").size());
        assertEquals("1", doc.selectFirst("table td").text());
    }

    @Test
    public void inCaption_disallowedEndTag_error_ignored() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<body><table><caption>Cap</thead></caption></table></body>", "");
        assertFalse(p.getErrors().isEmpty());
        assertEquals("Cap", doc.selectFirst("caption").text());
    }

    // ===================== InColumnGroup =====================

    @Test
    public void inColumnGroup_commentAndCol() {
        Document doc = parse("<body><table><colgroup><!--c--><col></colgroup><tr><td>1</td></tr></table></body>");
        Element colgroup = doc.selectFirst("table colgroup");
        assertNotNull(colgroup.selectFirst("col"));
    }

    @Test
    public void inColumnGroup_doctype_error_continues() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<body><table><colgroup><!DOCTYPE html><col></colgroup><tr><td>1</td></tr></table></body>", "");
        assertFalse(p.getErrors().isEmpty());
        assertEquals("1", doc.selectFirst("table td").text());
    }

    @Test
    public void inColumnGroup_startTagHtml_mergesAttrs() {
        Document doc = parse("<body><table><colgroup><html id='q'></colgroup><tr><td>1</td></tr></table></body>");
        assertEquals("q", doc.child(0).attr("id"));
    }

    @Test
    public void inColumnGroup_anythingElse_startTag_exitsAndReprocesses() {
        Document doc = parse("<body><table><colgroup><div>d</div></colgroup><tr><td>1</td></tr></table></body>");
        assertTrue(doc.select("table div").isEmpty());
    }

    @Test
    public void inColumnGroup_anythingElse_endTag_exitsAndReprocesses() {
        Document doc = parse("<body><table><colgroup><col></div><tr><td>1</td></tr></table></body>");
        assertEquals("1", doc.selectFirst("table td").text());
    }

    // ===================== InTableBody =====================

    @Test
    public void inTableBody_template_insertedDirectly() {
        Document doc = parse("<body><table><tbody><template>t</template><tr><td>1</td></tr></tbody></table></body>");
        assertNotNull(doc.selectFirst("tbody template"));
    }

    @Test
    public void inTableBody_thTd_autoInsertsTr() {
        Document doc = parse("<body><table><tbody><td>1</td></tbody></table></body>");
        assertEquals(1, doc.select("tbody > tr").size());
    }

    @Test
    public void inTableBody_captionColEtc_exitsTableBody() {
        Document doc = parse("<body><table><tbody><tr><td>1</td></tr><caption>Cap</caption></tbody></table></body>");
        assertEquals(1, doc.select("table > caption").size());
        assertEquals("1", doc.selectFirst("table td").text());
    }

    @Test
    public void inTableBody_anythingElse_fosterParented() {
        Document doc = parse("<body><table><tbody><div>d</div><tr><td>1</td></tr></tbody></table></body>");
        assertTrue(doc.select("table div").isEmpty());
    }

    @Test
    public void inTableBody_endTag_notInScope_error() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<body><table></tfoot></table></body>", "");
        assertFalse(p.getErrors().isEmpty());
        assertEquals(1, doc.select("table").size());
    }

    @Test
    public void inTableBody_endTag_disallowedList_error_ignored() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<body><table><tbody></html></tbody></table></body>", "");
        assertFalse(p.getErrors().isEmpty());
    }

    // ===================== InRow =====================

    @Test
    public void inRow_template_insertedDirectly() {
        Document doc = parse("<body><table><tr><template>t</template><td>1</td></tr></table></body>");
        assertNotNull(doc.selectFirst("tr template"));
    }

    @Test
    public void inRow_handleMissingTr_viaColMidRow() {
        Document doc = parse("<body><table><tr><td>1</td><col></tr></table></body>");
        assertEquals("1", doc.selectFirst("table td").text());
    }

    @Test
    public void inRow_anythingElse_fosterParented() {
        Document doc = parse("<body><table><tr><div>d</div><td>1</td></tr></table></body>");
        assertTrue(doc.select("table div").isEmpty());
    }

    @Test
    public void inRow_endTag_tr_notInScope_error() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<body><table></tr></table></body>", "");
        assertFalse(p.getErrors().isEmpty());
        assertEquals(1, doc.select("table").size());
    }

    @Test
    public void inRow_endTag_table_handlesMissingTrClose() {
        Document doc = parse("<body><table><tr><td>1</td></table></body>");
        assertEquals("1", doc.selectFirst("table td").text());
        assertEquals(1, doc.select("table").size());
    }

    @Test
    public void inRow_endTag_tbody_handlesMissingTrClose() {
        Document doc = parse("<body><table><tbody><tr><td>1</td></tbody></table></body>");
        assertEquals("1", doc.selectFirst("table td").text());
    }

    @Test
    public void inRow_default_characterToken_anythingElse() {
        Document doc = parse("<body><table><tr>text<td>1</td></tr></table></body>");
        assertFalse(doc.selectFirst("table").text().contains("text"));
        assertTrue(doc.body().text().contains("text"));
        assertEquals("1", doc.selectFirst("table td").text());
    }

    // ===================== InCell =====================

    @Test
    public void inCell_endTag_disallowedList_error_ignored() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<body><table><tr><td></html></td></tr></table></body>", "");
        assertFalse(p.getErrors().isEmpty());
    }

    @Test
    public void inCell_endTag_tableEtc_closesCellAndReprocesses() {
        Document doc = parse("<body><table><tbody><tr><td>1</tbody></table></body>");
        assertEquals("1", doc.selectFirst("table td").text());
        assertEquals(1, doc.select("table tbody").size());
    }

    @Test
    public void inCell_startTag_triggersCloseCellAndReprocess() {
        Document doc = parse("<body><table><tr><td>1<td>2</td></tr></table></body>");
        Elements tds = doc.select("tr > td");
        assertEquals(2, tds.size());
        assertEquals("1", tds.get(0).text());
        assertEquals("2", tds.get(1).text());
    }

    @Test
    public void inCell_anythingElse_delegatesToInBody() {
        Document doc = parse("<body><table><tr><td><b>bold</b></td></tr></table></body>");
        assertEquals("bold", doc.selectFirst("td b").text());
    }

    // ===================== InSelect =====================

    @Test
    public void inSelect_nullCharacter_error_dropped() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<body><select>\u0000</select></body>", "");
        assertFalse(p.getErrors().isEmpty());
    }

    @Test
    public void inSelect_normalCharacter_insertedAsTextChild() {
        Document doc = parse("<body><select>plain</select></body>");
        assertTrue(doc.selectFirst("select").text().contains("plain"));
    }

    @Test
    public void inSelect_doctype_error_ignored() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<body><select><!DOCTYPE html></select></body>", "");
        assertFalse(p.getErrors().isEmpty());
    }

    @Test
    public void inSelect_startTagHtml_mergesAttrs() {
        Document doc = parse("<body><select><html id='z'></select></body>");
        assertEquals("z", doc.child(0).attr("id"));
    }

    @Test
    public void inSelect_optgroup_doesNotCascadeClose_nestedOptgroup() {
        // เงื่อนไขปิด option/optgroup เป็น if/else-if เดี่ยว ไม่ loop -> เมื่อ option ไม่ถูกปิดก่อนเจอ optgroup ใหม่
        // จะได้ optgroup ซ้อนกันแทนที่จะเป็น sibling (ตาม logic ที่ coded มา)
        Document doc = parse("<body><select><optgroup label='g1'><option>1<optgroup label='g2'><option>2</option></optgroup></select></body>");
        Element select = doc.selectFirst("select");
        assertEquals(1, select.children().size());
        Element outerGroup = select.children().first();
        assertEquals("optgroup", outerGroup.tagName());
        assertNotNull(outerGroup.selectFirst("optgroup")); // nested, ไม่ใช่ sibling
    }

    @Test
    public void inSelect_select_selfClose_viaErrorAndEndTag() {
        Document doc = parse("<body><select><select></select></body>");
        assertEquals(1, doc.select("select").size());
    }

    @Test
    public void inSelect_inputTriggersSelectCloseAndReprocess() {
        Document doc = parse("<body><select><input type='text'></select></body>");
        assertTrue(doc.select("select input").isEmpty());
    }

    @Test
    public void inSelect_script_redirectsToInHead() {
        Document doc = parse("<body><select><script>1;</script></select></body>");
        assertEquals("1;", doc.selectFirst("select script").data());
    }

    @Test
    public void inSelect_anythingElse_startTag_dropped() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<body><select><div>d</div></select></body>", "");
        assertFalse(p.getErrors().isEmpty());
        assertTrue(doc.selectFirst("select").children().isEmpty());
    }

    @Test
    public void inSelect_endTag_optgroup_complexCondition_closesOptionAndOptgroup() {
        Document doc = parse("<body><select><optgroup><option>1</optgroup></select></body>");
        Element optgroup = doc.selectFirst("select optgroup");
        assertNotNull(optgroup);
        assertEquals("1", optgroup.selectFirst("option").text());
    }

    @Test
    public void inSelect_endTag_option_whenNotCurrent_error() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<body><select><optgroup></option></optgroup></select></body>", "");
        assertFalse(p.getErrors().isEmpty());
    }

    @Test
    public void inSelect_endTag_select_normalClose_resetsMode() {
        Document doc = parse("<body><select><option>1</option></select>after</body>");
        assertTrue(doc.body().text().contains("1"));
        assertTrue(doc.body().text().contains("after"));
    }

    @Test
    public void inSelect_endTag_anythingElse_dropped() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<body><select></div></select></body>", "");
        assertFalse(p.getErrors().isEmpty());
    }

    @Test
    public void inSelect_eof_currentNotHtml_error() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<select>", "");
        assertFalse(p.getErrors().isEmpty());
        assertNotNull(doc);
    }

    // ===================== InSelectInTable =====================

    @Test
    public void inSelectInTable_startTagTrigger_closesSelectAndReprocesses() {
        Document doc = parse("<table><tr><td><select><option>1<table><tr><td>2</td></tr></table></select></td></tr></table>");
        assertEquals(2, doc.select("table").size());
        assertTrue(doc.select("select table").isEmpty());
    }

    @Test
    public void inSelectInTable_endTagWithScope_closesSelectAndReprocesses() {
        Document doc = parse("<table><tr><td><select><option>1</td></tr></table>");
        Element td = doc.selectFirst("table td");
        assertNotNull(td.selectFirst("select"));
        assertTrue(td.select("select").first().text().contains("1"));
    }

    @Test
    public void inSelectInTable_else_delegatesToInSelect() {
        Document doc = parse("<table><tr><td><select><option>1</option></select></td></tr></table>");
        assertEquals("1", doc.selectFirst("table select option").text());
    }

    // ===================== AfterBody =====================

    @Test
    public void afterBody_whitespace_delegatesToInBody() {
        Document doc = parse("<body>hi</body>   ");
        assertEquals("hi", doc.body().text());
    }

    @Test
    public void afterBody_doctype_error_ignored() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<body>hi</body><!DOCTYPE html>", "");
        assertFalse(p.getErrors().isEmpty());
    }

    @Test
    public void afterBody_startTagHtml_mergesAttrs() {
        Document doc = parse("<body>hi</body><html id='z'>");
        assertEquals("z", doc.child(0).attr("id"));
    }

    @Test
    public void afterBody_endTagHtml_transitionsAndReenters() {
        Document doc = parse("<body>hi</body></html>trailing");
        assertTrue(doc.body().text().contains("hi"));
        assertTrue(doc.body().text().contains("trailing"));
    }

    @Test
    public void afterBody_eof_noop() {
        Document doc = parse("<body>hi</body>");
        assertEquals("hi", doc.body().text());
    }

    @Test
    public void afterBody_elseReentersInBody() {
        Document doc = parse("<body>hi</body>more");
        assertTrue(doc.body().text().contains("hi"));
        assertTrue(doc.body().text().contains("more"));
    }

    // ===================== InFrameset / AfterFrameset =====================

    @Test
    public void inFrameset_whitespaceCommentNoframes() {
        Document doc = parse("<frameset><!--c--> <noframes>fallback</noframes><frame></frameset>");
        assertEquals("fallback", doc.selectFirst("noframes").data());
        assertEquals(1, doc.select("frame").size());
    }

    @Test
    public void inFrameset_doctype_error_ignored() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<frameset><!DOCTYPE html><frame></frameset>", "");
        assertFalse(p.getErrors().isEmpty());
        assertEquals(1, doc.select("frame").size());
    }

    @Test
    public void inFrameset_startTagHtml_mergesAttrs() {
        Document doc = parse("<frameset><html id='z'><frame></frameset>");
        assertEquals("z", doc.child(0).attr("id"));
    }

    @Test
    public void inFrameset_nestedFrameset_insertedDirectly() {
        Document doc = parse("<frameset><frameset><frame></frameset></frameset>");
        assertEquals(1, doc.select("frameset frameset").size());
    }

    @Test
    public void inFrameset_default_startTag_error_dropped() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<frameset><div>d</div><frame></frameset>", "");
        assertFalse(p.getErrors().isEmpty());
        assertTrue(doc.select("frameset > div").isEmpty());
    }

    @Test
    public void inFrameset_endTag_nested_staysInFrameset() {
        Document doc = parse("<frameset><frameset><frame></frameset><frame></frameset>");
        assertEquals(2, doc.select("frame").size());
    }

    @Test
    public void inFrameset_endTag_top_transitionsAfterFrameset() {
        Document doc = parse("<frameset><frame></frameset>");
        assertEquals(1, doc.select("frameset").size());
        assertEquals(1, doc.select("frame").size());
    }

    @Test
    public void inFrameset_eof_currentNotHtml_error_stopsGracefully() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<frameset><frame>", "");
        assertFalse(p.getErrors().isEmpty());
        assertNotNull(doc.selectFirst("frame"));
    }

    @Test
    public void inFrameset_else_nonWhitespaceChar_dropped() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<frameset>text<frame></frameset>", "");
        assertFalse(p.getErrors().isEmpty());
        assertFalse(doc.selectFirst("frameset").text().contains("text"));
    }

    @Test
    public void afterFrameset_doctype_error_continues() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<frameset><frame></frameset><!DOCTYPE html>", "");
        assertFalse(p.getErrors().isEmpty());
    }

    @Test
    public void afterFrameset_startTagNoframes_redirectsToInHead() {
        Document doc = parse("<frameset><frame></frameset><noframes>fallback</noframes></html>");
        assertEquals("fallback", doc.selectFirst("noframes").data());
    }

    @Test
    public void afterFrameset_else_error_dropped() {
        Parser p = trackedParser();
        Document doc = p.parseInput("<frameset><frame></frameset>stray", "");
        assertFalse(p.getErrors().isEmpty());
    }

    // ===================== AfterAfterBody / AfterAfterFrameset =====================

    @Test
    public void afterAfterBody_comment_inserted() {
        Document doc = parse("<html><body>hi</body></html><!--c-->");
        boolean has = false;
        for (Node n : doc.childNodes()) if (n instanceof Comment) has = true;
        assertTrue(has);
    }

    
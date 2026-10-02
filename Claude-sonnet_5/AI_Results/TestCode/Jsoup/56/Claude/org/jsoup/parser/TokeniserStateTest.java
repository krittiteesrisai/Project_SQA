package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.TokeniserState; // self-import ตามข้อกำหนดให้ import คลาสเป้าหมาย (same package จึงไม่บังคับ แต่ใส่เพื่อความชัดเจน)
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests สำหรับ {@link TokeniserState}
 *
 * หมายเหตุสำคัญ: TokeniserState และ read() เป็น package-private และ Tokeniser/CharacterReader
 * ไม่มี accessor ที่เปิดเผยให้ดึง token ที่ emit ออกมาตรวจสอบได้โดยตรงจากซอร์สที่ให้มา
 * ดังนั้นการทดสอบนี้จึงขับเคลื่อน TokeniserState ผ่าน public API ระดับบน (Jsoup.parse)
 * แล้วตรวจผลลัพธ์ที่สังเกตได้จริง (text/attr/comment/doctype) โดยไล่ตาม logic
 * ของ switch/if-else ในแต่ละ state ด้วยการ trace มือก่อนกำหนด input ให้ตรงกับแต่ละ branch
 */
public class TokeniserStateTest {

    // ---------------------------------------------------------------
    // Sanity ของ enum เอง (boundary / ผิดรูปแบบ)
    // ---------------------------------------------------------------

    @Test
    public void testEnumValueOfKnownState() {
        assertSame(TokeniserState.Data, TokeniserState.valueOf("Data"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEnumValueOfUnknownStateThrows() {
        TokeniserState.valueOf("NotARealState");
    }

    // ---------------------------------------------------------------
    // Data state
    // ---------------------------------------------------------------

    @Test
    public void data_defaultText() {
        Document doc = Jsoup.parse("<p>hello world</p>");
        assertEquals("hello world", doc.select("p").text());
    }

    @Test
    public void data_ampersandTriggersCharacterReference() {
        Document doc = Jsoup.parse("<p>a&amp;b</p>");
        assertEquals("a&b", doc.select("p").text());
    }

    @Test
    public void data_nullCharKeptLiteralWithError() {
        // ตามคอมเมนต์ในซอร์ส "NOT replacement character (oddly?)" -> nullChar คงเดิม ไม่ถูกแทนที่
        Document doc = Jsoup.parse("<p>a\u0000b</p>");
        assertEquals("a\u0000b", doc.select("p").text());
    }

    @Test
    public void data_eofEmptyInputNoException() {
        Document doc = Jsoup.parse("");
        assertNotNull(doc);
        assertEquals("", doc.body().text());
    }

    // ---------------------------------------------------------------
    // CharacterReferenceInData
    // ---------------------------------------------------------------

    @Test
    public void charRefInData_invalidReferenceEmitsAmpersandLiterally() {
        Document doc = Jsoup.parse("<p>a&invalidEntityXYZ;b</p>");
        assertEquals("a&invalidEntityXYZ;b", doc.select("p").text());
    }

    // ---------------------------------------------------------------
    // Rcdata (title/textarea)
    // ---------------------------------------------------------------

    @Test
    public void rcdata_entityDecodedInTitle() {
        Document doc = Jsoup.parse("<title>A &amp; B</title>");
        assertEquals("A & B", doc.title());
    }

    @Test
    public void rcdata_lessThanNotLetterKeptLiteral() {
        Document doc = Jsoup.parse("<title>A < B</title>");
        assertEquals("A < B", doc.title());
    }

    @Test
    public void rcdata_nullCharReplaced() {
        Document doc = Jsoup.parse("<title>A\u0000B</title>");
        assertEquals("A\uFFFDB", doc.title());
    }

    @Test
    public void charRefInRcdata_invalidReferenceKeptLiteral() {
        Document doc = Jsoup.parse("<title>A &bogus; B</title>");
        assertEquals("A &bogus; B", doc.title());
    }

    // RcdataLessthanSign: กรณี '<' ตามด้วยตัวอักษร แต่ไม่มี "</title" เหลืออยู่ใน buffer
    // -> เกิด diverge branch: ปิด title ทันทีและ unconsume '<'
    @Test
    public void rcdataLessthanSign_divergeClosesTitleEarly() {
        Document doc = Jsoup.parse("<title>a<b");
        assertEquals("a", doc.title());
    }

    // ---------------------------------------------------------------
    // Rawtext (สมมติฐาน: <style> ใช้ Rawtext state ตามสเปก HTML5
    // เนื่องจากซอร์ส HtmlTreeBuilder ไม่ได้ให้มาด้วย จึงไม่สามารถยืนยัน 100% ได้)
    // ---------------------------------------------------------------

    @Test
    public void rawtext_plainContent() {
        Document doc = Jsoup.parse("<style>.a{color:red}</style>");
        assertEquals(".a{color:red}", doc.select("style").first().data());
    }

    @Test
    public void rawtext_nullCharReplaced() {
        Document doc = Jsoup.parse("<style>a\u0000b</style>");
        assertEquals("a\uFFFDb", doc.select("style").first().data());
    }

    @Test
    public void rawtext_lessThanNotSlashKeptLiteral() {
        Document doc = Jsoup.parse("<style>a<b</style>");
        assertEquals("a<b", doc.select("style").first().data());
    }

    @Test
    public void rawtextEndTagName_inappropriateEndTagTreatedAsText() {
        // </xyz> ไม่ตรงกับ lastStartTag "style" -> ไม่ใช่ appropriate end tag
        // -> ถูก emit เป็น literal text แล้ว re-scan ต่อ
        Document doc = Jsoup.parse("<style></xyz>real</style>");
        assertEquals("</xyz>real", doc.select("style").first().data());
    }

    // ---------------------------------------------------------------
    // ScriptData และ states ที่เกี่ยวข้อง (escape / double-escape)
    // ---------------------------------------------------------------

    @Test
    public void scriptData_plainContent() {
        Document doc = Jsoup.parse("<script>var a=1;</script>");
        assertEquals("var a=1;", doc.select("script").first().data());
    }

    @Test
    public void scriptData_nullCharReplaced() {
        Document doc = Jsoup.parse("<script>a\u0000b</script>");
        assertEquals("a\uFFFDb", doc.select("script").first().data());
    }

    @Test
    public void scriptData_lessThanNotBangNotSlashKeptLiteral() {
        Document doc = Jsoup.parse("<script>a < b</script>");
        assertEquals("a < b", doc.select("script").first().data());
    }

    @Test
    public void scriptDataEndTagName_inappropriateEndTagTreatedAsText() {
        Document doc = Jsoup.parse("<script></xyz>real</script>");
        assertEquals("</xyz>real", doc.select("script").first().data());
    }

    @Test
    public void scriptDataEscapedEndTagName_inappropriateEndTagTreatedAsTextInsideComment() {
        // ภายใน <!-- --> (ScriptDataEscaped*) แต่ </xyz> ไม่ใช่ appropriate end tag
        Document doc = Jsoup.parse("<script><!--</xyz>real--></script>");
        assertEquals("<!--</xyz>real-->", doc.select("script").first().data());
    }

    @Test
    public void scriptDataEscape_fullDoubleEscapeRoundTrip() {
        // ครอบคลุม ScriptDataLessthanSign('!'), ScriptDataEscapeStart, ScriptDataEscapeStartDash,
        // ScriptDataEscaped/Dash/DashDash, ScriptDataEscapedLessthanSign(letter),
        // ScriptDataDoubleEscapeStart(letter + '>' branch), ScriptDataDoubleEscaped/Dash/DashDash,
        // ScriptDataDoubleEscapedLessthanSign('/'), ScriptDataDoubleEscapeEnd
        String html = "<script><!--<script></script>--></script><p>end</p>";
        Document doc = Jsoup.parse(html);
        assertEquals("<!--<script></script>-->", doc.select("script").first().data());
        assertEquals("end", doc.select("p").text());
    }

    // ---------------------------------------------------------------
    // TagOpen
    // ---------------------------------------------------------------

    @Test
    public void tagOpen_bangStartsComment() {
        Document doc = Jsoup.parse("<!-- hello --><p>ok</p>");
        assertTrue(doc.html().contains("<!-- hello -->"));
        assertEquals("ok", doc.select("p").text());
    }

    @Test
    public void tagOpen_questionMarkStartsBogusComment() {
        Document doc = Jsoup.parse("<?xml version='1.0'?><p>hi</p>");
        assertTrue(doc.html().contains("<!--?xml version='1.0'?-->"));
        assertEquals("hi", doc.select("p").text());
    }

    @Test
    public void tagOpen_nonLetterAfterLessThanEmitsLiteral() {
        Document doc = Jsoup.parse("< oops>text");
        assertEquals("< oops>text", doc.body().text());
    }

    // ---------------------------------------------------------------
    // EndTagOpen
    // ---------------------------------------------------------------

    @Test
    public void endTagOpen_eofEmitsLiteralSlash() {
        Document doc = Jsoup.parse("<p>hi</");
        assertEquals("hi</", doc.body().text());
    }

    @Test
    public void endTagOpen_bareCloseAngleProducesNoTokenJustError() {
        // "</>" ไม่ emit token ใด ๆ (เฉพาะ error) จึงไม่มีช่องว่าง/อักขระเพิ่มระหว่าง a กับ b
        Document doc = Jsoup.parse("<p>a</>b</p>");
        assertEquals("ab", doc.select("p").text());
    }

    @Test
    public void endTagOpen_nonLetterNonCloseStartsBogusComment() {
        Document doc = Jsoup.parse("<p>x</1>y</p>");
        assertTrue(doc.body().html().contains("<!--1-->"));
        assertEquals("xy", doc.select("p").text());
    }

    // ---------------------------------------------------------------
    // TagName
    // ---------------------------------------------------------------

    @Test
    public void tagName_whitespaceTransitionsToAttributeParsing() {
        Document doc = Jsoup.parse("<p class=\"x\">hi</p>");
        assertEquals("x", doc.select("p").attr("class"));
        assertEquals("hi", doc.select("p").text());
    }

    @Test
    public void tagName_nullCharReplacedInName() {
        Document doc = Jsoup.parse("<p\u0000x>hi</p>");
        Element first = doc.body().child(0);
        assertEquals("p\uFFFDx", first.tagName());
    }

    @Test
    public void tagName_eofDropsPendingTag() {
        Document doc = Jsoup.parse("<p");
        assertNotNull(doc.body());
    }

    // ---------------------------------------------------------------
    // MarkupDeclarationOpen
    // ---------------------------------------------------------------

    @Test
    public void markupDeclarationOpen_cdataSectionEmittedAsPlainText() {
        Document doc = Jsoup.parse("<p><![CDATA[hello]]></p>");
        assertEquals("hello", doc.select("p").text());
    }

    @Test
    public void markupDeclarationOpen_unknownBangStartsBogusComment() {
        Document doc = Jsoup.parse("<![foo]><p>hi</p>");
        assertTrue(doc.html().contains("<!--[foo]-->"));
        assertEquals("hi", doc.select("p").text());
    }

    // ---------------------------------------------------------------
    // BeforeAttributeName / AttributeName / AfterAttributeName
    // ---------------------------------------------------------------

    @Test
    public void beforeAttributeName_quoteCharStartsAttributeNameWithError() {
        // '\'' ทันทีหลัง whitespace -> error + newAttribute + appendAttributeName(c) -> AttributeName
        Document doc = Jsoup.parse("<p 'x'='y'>hi</p>");
        assertFalse(doc.select("p").attributes().asList().isEmpty());
        assertEquals("hi", doc.select("p").text());
    }

    @Test
    public void attributeName_booleanAttributeEmptyValue() {
        Document doc = Jsoup.parse("<input disabled>");
        assertEquals("", doc.select("input").attr("disabled"));
    }

    @Test
    public void afterAttributeName_defaultLetterStartsNewAttribute() {
        Document doc = Jsoup.parse("<p a b>hi</p>");
        assertTrue(doc.select("p").hasAttr("a"));
        assertTrue(doc.select("p").hasAttr("b"));
    }

    // ---------------------------------------------------------------
    // BeforeAttributeValue / AttributeValue_*
    // ---------------------------------------------------------------

    @Test
    public void beforeAttributeValue_defaultElseGoesUnquoted() {
        Document doc = Jsoup.parse("<p id=foo>hi</p>");
        assertEquals("foo", doc.select("p").attr("id"));
    }

    @Test
    public void beforeAttributeValue_ampersandUnconsumesToUnquoted() {
        Document doc = Jsoup.parse("<a href=&amp;x>y</a>");
        assertEquals("&x", doc.select("a").attr("href"));
    }

    @Test
    public void beforeAttributeValue_backtickErrorAppendsLiteral() {
        Document doc = Jsoup.parse("<a href=`x>y</a>");
        assertEquals("`x", doc.select("a").attr("href"));
    }

    @Test
    public void attributeValueUnquoted_nullCharReplaced() {
        Document doc = Jsoup.parse("<p id=a\u0000b>hi</p>");
        assertEquals("a\uFFFDb", doc.select("p").attr("id"));
    }

    @Test
    public void attributeValueDoubleQuoted_entityDecoded() {
        Document doc = Jsoup.parse("<a href=\"a&amp;b\">x</a>");
        assertEquals("a&b", doc.select("a").attr("href"));
    }

    @Test
    public void attributeValueDoubleQuoted_invalidEntityKeepsAmpersandLiteral() {
        Document doc = Jsoup.parse("<a href=\"a&bogus;b\">x</a>");
        assertEquals("a&bogus;b", doc.select("a").attr("href"));
    }

    @Test
    public void attributeValueSingleQuoted_entityDecoded() {
        Document doc = Jsoup.parse("<a href='a&amp;b'>x</a>");
        assertEquals("a&b", doc.select("a").attr("href"));
    }

    // ---------------------------------------------------------------
    // AfterAttributeValue_quoted / SelfClosingStartTag
    // ---------------------------------------------------------------

    @Test
    public void afterAttributeValueQuoted_missingWhitespaceRecoversNewAttribute() {
        Document doc = Jsoup.parse("<a href=\"x\"id=\"y\">click</a>");
        assertEquals("x", doc.select("a").attr("href"));
        assertEquals("y", doc.select("a").attr("id"));
    }

    @Test
    public void selfClosingStartTag_unexpectedCharRecoversAsAttribute() {
        Document doc = Jsoup.parse("<hr/Dfoo>end");
        assertTrue(doc.select("hr").hasAttr("dfoo"));
        assertTrue(doc.body().text().contains("end"));
    }

    // ---------------------------------------------------------------
    // BogusComment (ผ่าน TagOpen '?')  ถูกทดสอบแล้วข้างบน
    // Comment / CommentStart* / CommentEnd*
    // ---------------------------------------------------------------

    @Test
    public void comment_plainContent() {
        Document doc = Jsoup.parse("<!-- hi there -->");
        assertTrue(doc.html().contains("<!-- hi there -->"));
    }

    @Test
    public void comment_nullCharReplaced() {
        Document doc = Jsoup.parse("<!--a\u0000b-->");
        assertTrue(doc.html().contains("<!--a\uFFFDb-->"));
    }

    @Test
    public void commentStartDash_emptyCommentViaImmediateCloseAngle() {
        Document doc = Jsoup.parse("<!--->");
        assertTrue(doc.html().contains("<!---->"));
    }

    @Test
    public void commentEndBang_dashCountingSequence() {
        Document doc = Jsoup.parse("<!--x--!-->");
        assertTrue(doc.html().contains("<!--x--!-->"));
    }

    // ---------------------------------------------------------------
    // Doctype family + quirks mode
    // (สมมติฐาน: Document.quirksMode()/QuirksMode เป็น public API ที่มีในเวอร์ชันนี้
    //  ใช้เพื่อยืนยัน forceQuirks flag โดยไม่ต้องเดา internal field)
    // ---------------------------------------------------------------

    @Test
    public void doctype_simpleHtml5() {
        Document doc = Jsoup.parse("<!DOCTYPE html><p>hi</p>");
        assertTrue(doc.html().toLowerCase().contains("<!doctype html>"));
        assertEquals(Document.QuirksMode.noQuirks, doc.quirksMode());
        assertEquals("hi", doc.select("p").text());
    }

    @Test
    public void doctype_publicAndSystemDoubleQuoted() {
        String html = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" "
                + "\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\"><p>hi</p>";
        Document doc = Jsoup.parse(html);
        String out = doc.html();
        assertTrue(out.contains("-//W3C//DTD XHTML 1.0 Strict//EN"));
        assertTrue(out.contains("xhtml1-strict.dtd"));
    }

    @Test
    public void doctype_publicAndSystemSingleQuoted() {
        String html = "<!DOCTYPE html PUBLIC 'pub-id' 'sys-id'><p>hi</p>";
        Document doc = Jsoup.parse(html);
        String out = doc.html();
        assertTrue(out.contains("pub-id"));
        assertTrue(out.contains("sys-id"));
    }

    @Test
    public void doctype_systemOnlyKeyword() {
        String html = "<!DOCTYPE html SYSTEM \"sys.dtd\"><p>hi</p>";
        Document doc = Jsoup.parse(html);
        assertTrue(doc.html().contains("sys.dtd"));
    }

    @Test
    public void doctype_malformedTriggersQuirksMode() {
        // AfterDoctypeName default-else -> forceQuirks=true -> BogusDoctype
        Document doc = Jsoup.parse("<!DOCTYPE html XYZ><p>hi</p>");
        assertEquals(Document.QuirksMode.quirks, doc.quirksMode());
        assertEquals("hi", doc.select("p").text());
    }

    @Test
    public void doctype_emptyTriggersQuirksMode() {
        Document doc = Jsoup.parse("<!DOCTYPE ><p>hi</p>");
        assertEquals(Document.QuirksMode.quirks, doc.quirksMode());
    }
}

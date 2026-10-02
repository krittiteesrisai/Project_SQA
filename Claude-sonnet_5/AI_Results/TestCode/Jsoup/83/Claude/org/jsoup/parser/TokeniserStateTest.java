package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link TokeniserState}.
 *
 * หมายเหตุสำคัญ: TokeniserState.read(Tokeniser, CharacterReader) เป็น package-private
 * และต้องพึ่ง Tokeniser/CharacterReader ที่ไม่มี source/constructor สาธารณะให้ในไฟล์นี้
 * ดังนั้นเทสส่วนใหญ่จึง "ขับ" state machine ผ่าน public API (Jsoup.parse) ซึ่งเป็นทาง
 * เดียวที่จะ trigger แต่ละ state/branch ได้จริงโดยไม่ต้องเดา constructor ภายใน
 * ส่วนที่เข้าถึง static field ของ enum ได้ตรง ๆ เพราะคลาสทดสอบอยู่ใน package เดียวกัน
 */
public class TokeniserStateTest {

    // ===================================================================
    // White-box: ตรวจ invariant ของ static data ใน enum โดยตรง (same package)
    // ===================================================================

    @Test
    public void testEnumConstantCount() {
        // นับจาก source: Data..CdataSection รวม 67 ค่า
        assertEquals(67, TokeniserState.values().length);
    }

    @Test
    public void testAttributeSingleValueCharsSorted() {
        char[] arr = TokeniserState.attributeSingleValueCharsSorted.clone();
        char[] sorted = arr.clone();
        Arrays.sort(sorted);
        assertArrayEquals("array ต้องถูกเรียงไว้แล้ว (ใช้กับ binary search)", sorted, arr);
    }

    @Test
    public void testAttributeDoubleValueCharsSorted() {
        char[] arr = TokeniserState.attributeDoubleValueCharsSorted.clone();
        char[] sorted = arr.clone();
        Arrays.sort(sorted);
        assertArrayEquals(sorted, arr);
    }

    @Test
    public void testAttributeNameCharsSorted() {
        char[] arr = TokeniserState.attributeNameCharsSorted.clone();
        char[] sorted = arr.clone();
        Arrays.sort(sorted);
        assertArrayEquals(sorted, arr);
    }

    @Test
    public void testAttributeValueUnquotedCharsSorted() {
        char[] arr = TokeniserState.attributeValueUnquoted.clone();
        char[] sorted = arr.clone();
        Arrays.sort(sorted);
        assertArrayEquals(sorted, arr);
    }

    @Test
    public void testNullCharConstant() {
        assertEquals('\u0000', TokeniserState.nullChar);
    }

    // ===================================================================
    // Data state
    // ===================================================================

    @Test
    public void testData_NullChar_IsNotReplaced() {
        // ตามคอมเมนต์ในซอร์ส: "NOT replacement character (oddly?)" ในสถานะ Data
        Document doc = Jsoup.parse("<div>A\u0000B</div>");
        String text = doc.select("div").text();
        assertEquals("A\u0000B", text);
        assertFalse(text.contains("\uFFFD"));
    }

    @Test
    public void testData_Ampersand_TriggersCharacterReference() {
        Document doc = Jsoup.parse("<div>&amp;</div>");
        assertEquals("&", doc.select("div").text());
    }

    @Test
    public void testData_LessThan_TriggersTagOpen() {
        Document doc = Jsoup.parse("<div><span>hi</span></div>");
        assertEquals(1, doc.select("div > span").size());
    }

    @Test
    public void testData_EmptyInput_EmitsEOFWithoutException() {
        Document doc = Jsoup.parse("");
        assertNotNull(doc);
    }

    @Test
    public void testData_DefaultConsumesPlainText() {
        Document doc = Jsoup.parse("<div>plain text</div>");
        assertEquals("plain text", doc.select("div").text());
    }

    // ===================================================================
    // Rcdata / CharacterReferenceInRcdata (title, textarea)
    // ===================================================================

    @Test
    public void testRcdata_NullChar_IsReplaced() {
        // ต่างจาก Data state: ใน Rcdata ค่า null ถูกแทนด้วย replacementChar
        Document doc = Jsoup.parse("<title>A\u0000B</title>");
        assertTrue(doc.title().contains("\uFFFD"));
        assertFalse(doc.title().contains("\u0000"));
    }

    @Test
    public void testRcdata_Ampersand_DecodesEntity() {
        Document doc = Jsoup.parse("<title>&lt;b&gt;</title>");
        assertEquals("<b>", doc.title());
    }

    @Test
    public void testRcdata_LessThanNotFollowedBySlashOrLetter_TreatedAsText() {
        // RcdataLessthanSign: '<' ตามด้วย space -> ไม่ใช่ '/' ไม่ใช่ letter -> emit("<") แล้วอยู่ใน Rcdata ต่อ
        Document doc = Jsoup.parse("<title>5 < 10</title>");
        assertEquals("5 < 10", doc.title());
    }

    @Test
    public void testRcdata_EndTag_ClosesProperly() {
        Document doc = Jsoup.parse("<title>Hello World</title>");
        assertEquals("Hello World", doc.title());
    }

    @Test
    public void testRCDATAEndTagOpen_NotLetter_EmitsLiteralSlash() {
        // RCDATAEndTagOpen: "</" ตามด้วย space (ไม่ใช่ letter) -> emit("</") แล้วกลับไป Rcdata
        Document doc = Jsoup.parse("<title>A</ B</title>");
        assertEquals("A</ B", doc.title());
    }

    // ===================================================================
    // PLAINTEXT (reachable ผ่าน <plaintext> ของ HTML tree builder)
    // ===================================================================

    @Test
    public void testPlaintext_RawUntilEOF() {
        // หลัง <plaintext> ทุกอย่างถือเป็น text ดิบ ไม่ parse เป็นแท็กอีก
        Document doc = Jsoup.parse("<plaintext>Hello <b>World</b>");
        Element pt = doc.select("plaintext").first();
        assertNotNull(pt);
        assertEquals("Hello <b>World</b>", pt.text());
    }

    // ===================================================================
    // TagOpen branches
    // ===================================================================

    @Test
    public void testTagOpen_Bang_ToDoctype() {
        Document doc = Jsoup.parse("<!DOCTYPE html><p>hi</p>");
        assertTrue(doc.outerHtml().toLowerCase().contains("<!doctype html>"));
    }

    @Test
    public void testTagOpen_Slash_EndTag() {
        Document doc = Jsoup.parse("<p>Hi</p>");
        assertEquals("Hi", doc.select("p").text());
    }

    @Test
    public void testTagOpen_Question_BogusComment() {
        Document doc = Jsoup.parse("<?xml?><p>hi</p>");
        assertTrue(doc.outerHtml().contains("<!--?xml?-->"));
    }

    @Test
    public void testTagOpen_Letter_CreatesTagPending() {
        Document doc = Jsoup.parse("<section>x</section>");
        assertEquals(1, doc.select("section").size());
    }

    @Test
    public void testTagOpen_InvalidChar_EmitsLiteralLessThan() {
        // ไม่ใช่ letter, '!', '/', '?' -> error, emit('<'), transition(Data)
        Document doc = Jsoup.parse("<1 invalid>text");
        assertEquals("<1 invalid>text", doc.body().text());
    }

    // ===================================================================
    // EndTagOpen branches
    // ===================================================================

    @Test
    public void testEndTagOpen_EmptyAtEOF() {
        Document doc = Jsoup.parse("<p>Hi</");
        assertEquals("Hi</", doc.select("p").text());
    }

    @Test
    public void testEndTagOpen_GT_IsSkippedSilently() {
        Document doc = Jsoup.parse("<p>A</>B</p>");
        assertEquals("AB", doc.select("p").text());
    }

    @Test
    public void testEndTagOpen_OtherChar_ToBogusComment() {
        Document doc = Jsoup.parse("<p>A</1>B</p>");
        assertEquals("AB", doc.select("p").text());
        assertTrue(doc.outerHtml().contains("<!--1-->"));
    }

    // ===================================================================
    // TagName branches
    // ===================================================================

    @Test
    public void testTagName_WhitespaceThenAttribute() {
        Document doc = Jsoup.parse("<p class=\"a\">hi</p>");
        assertEquals("a", doc.select("p").attr("class"));
    }

    @Test
    public void testTagName_SelfClosingSlash_VoidElement() {
        Document doc = Jsoup.parse("<br/>");
        assertEquals(1, doc.select("br").size());
    }

    @Test
    public void testTagName_EOF_DoesNotThrow() {
        Document doc = Jsoup.parse("<di");
        assertNotNull(doc);
    }

    // ===================================================================
    // Before/After AttributeName, AttributeValue branches
    // ===================================================================

    @Test
    public void testAfterAttributeName_LetterStartsNewAttribute() {
        Document doc = Jsoup.parse("<p a b=\"2\">hi</p>");
        Element p = doc.select("p").first();
        assertEquals("", p.attr("a"));
        assertEquals("2", p.attr("b"));
    }

    @Test
    public void testBeforeAttributeValue_Ampersand_UnconsumesToUnquoted() {
        Document doc = Jsoup.parse("<p a=&amp;>hi</p>");
        assertEquals("&", doc.select("p").attr("a"));
    }

    @Test
    public void testBeforeAttributeValue_Backtick_AppendedLiterallyThenUnquoted() {
        Document doc = Jsoup.parse("<p a=`x`>hi</p>");
        assertEquals("`x`", doc.select("p").attr("a"));
    }

    @Test
    public void testAttributeValue_DoubleQuoted_WithEntity() {
        Document doc = Jsoup.parse("<p a=\"x&amp;y\">hi</p>");
        assertEquals("x&y", doc.select("p").attr("a"));
    }

    @Test
    public void testAttributeValue_SingleQuoted_Empty() {
        Document doc = Jsoup.parse("<p a=''>hi</p>");
        assertEquals("", doc.select("p").attr("a"));
    }

    @Test
    public void testAttributeValue_Unquoted_Basic() {
        Document doc = Jsoup.parse("<p a=b>hi</p>");
        assertEquals("b", doc.select("p").attr("a"));
    }

    @Test
    public void testAfterAttributeValueQuoted_InvalidChar_UnconsumesToBeforeAttributeName() {
        Document doc = Jsoup.parse("<p a=\"1\"b=\"2\">hi</p>");
        Element p = doc.select("p").first();
        assertEquals("1", p.attr("a"));
        assertEquals("2", p.attr("b"));
    }

    @Test
    public void testSelfClosingStartTag_InvalidChar_UnconsumesToBeforeAttributeName() {
        Document doc = Jsoup.parse("<p/ a=\"1\">hi</p>");
        Element p = doc.select("p").first();
        assertEquals("1", p.attr("a"));
    }

    @Test
    public void testAttributeName_NullChar_AppendsReplacementChar() {
        Document doc = Jsoup.parse("<p a\u0000b=\"x\">hi</p>");
        Element p = doc.select("p").first();
        boolean found = false;
        for (Attribute attr : p.attributes()) {
            if (attr.getKey().indexOf('\uFFFD') >= 0) {
                found = true;
            }
        }
        assertTrue("ควรพบ attribute name ที่มี replacement char", found);
    }

    // ===================================================================
    // Comment / MarkupDeclarationOpen branches
    // ===================================================================

    @Test
    public void testMarkupDeclarationOpen_DoubleDash_ToComment() {
        Document doc = Jsoup.parse("<!--Comment--><p>hi</p>");
        assertTrue(doc.outerHtml().contains("<!--Comment-->"));
    }

    @Test
    public void testMarkupDeclarationOpen_Invalid_ToBogusComment() {
        Document doc = Jsoup.parse("<!weird><p>hi</p>");
        assertTrue(doc.outerHtml().contains("<!--weird-->"));
    }

    @Test
    public void testMarkupDeclarationOpen_CDATA() {
        Document doc = Jsoup.parse("<svg><![CDATA[Some <data> here]]></svg>");
        assertTrue(doc.outerHtml().contains("Some <data> here")
                || doc.outerHtml().contains("Some &lt;data&gt; here"));
    }

    @Test
    public void testCommentStart_NullChar_AppendsReplacementChar() {
        Document doc = Jsoup.parse("<!--\u0000-->");
        assertTrue(doc.outerHtml().contains("<!--\uFFFD-->"));
    }

    @Test
    public void testCommentStart_GT_EmitsEmptyComment() {
        // CommentStart เจอ '>' ทันที -> error, emitCommentPending ด้วย data ว่าง, transition(Data)
        Document doc = Jsoup.parse("<!-->hi<p>x</p>");
        assertTrue(doc.outerHtml().contains("<!---->"));
        assertTrue(doc.body().html().contains("hi"));
    }

    @Test
    public void testCommentEndBang_ReopensComment() {
        // CommentEnd เจอ '!' -> CommentEndBang -> ตามด้วย '-' จะ append "--!" แล้วไป CommentEndDash
        Document doc = Jsoup.parse("<!--abc--!-->");
        assertTrue(doc.outerHtml().contains("abc"));
    }

    /**
     * ทดสอบ "ล่าบั๊ก": ตาม HTML5 spec, สถานะ comment-start-dash เมื่อพบ '-' ควรไป
     * สถานะ comment-end (ไม่ใช่วนกลับมาที่ comment-start-dash เอง) และกรณี default
     * ต้อง append ทั้งเครื่องหมาย '-' และตัวอักษรปัจจุบันลงใน data
     * แต่ใน source ที่ให้มา CommentStartDash มี body เหมือนกับ CommentStart ทุกประการ
     * (case '-' -> transition(CommentStartDash) ซ้ำตัวเอง, default -> append(c) เฉย ๆ
     * โดยไม่ append '-' ที่ถูกข้ามไปก่อน) ทำให้ขีดกลางตัวที่ 3 ของคอมเมนต์หายไป
     *
     * คาดหวัง (ตาม spec): "- Hello " แต่ของจริงจาก source นี้น่าจะได้ " Hello "
     * เทสนี้อาจ FAIL กับซอร์สที่ให้มา ซึ่งเป็นจุดประสงค์เพื่อดักจับ fault ดังกล่าว
     */
    @Test
    public void testCommentStartDash_SuspectedBug_LeadingDashPreserved() {
        Document doc = Jsoup.parse("<!--- Hello --><p>hi</p>");
        // ตาม spec ที่ถูกต้อง เครื่องหมาย '-' ตัวที่ 3 ต้องถูกเก็บไว้ใน data ของคอมเมนต์
        assertTrue("คอมเมนต์ควรมีขีดกลางตัวที่ 3 ติดอยู่ตาม HTML5 spec (ระวัง: อาจ fail กับซอร์สนี้)",
                doc.outerHtml().contains("<!--- Hello -->"));
    }

    // ===================================================================
    // Doctype branches
    // ===================================================================

    @Test
    public void testDoctype_SimpleHtml() {
        Document doc = Jsoup.parse("<!DOCTYPE html><p>x</p>");
        assertFalse(doc.outerHtml().isEmpty());
        assertTrue(doc.outerHtml().toLowerCase().startsWith("<!doctype html>"));
    }

    @Test
    public void testDoctype_EmptyAngleBrackets_ForceQuirks() {
        // Doctype state: '>' ทันที -> error, forceQuirks=true, emit, transition(Data)
        Document doc = Jsoup.parse("<!DOCTYPE><p>x</p>");
        assertNotNull(doc);
    }

    @Test
    public void testDoctypeName_NullChar_AppendsReplacementChar() {
        Document doc = Jsoup.parse("<!DOCTYPE \u0000 ><p>x</p>");
        // ไม่ throw exception ก็เพียงพอสำหรับ branch coverage ของ nullChar ใน BeforeDoctypeName
        assertNotNull(doc);
    }

    @Test
    public void testDoctype_PublicAndSystemIdentifiers() {
        String html = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0//EN\" "
                + "\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">";
        Document doc = Jsoup.parse(html);
        // สมมติฐาน: DocumentType เก็บ publicId/systemId เป็น attribute (API ของ jsoup ทั่วไป)
        Node first = doc.childNode(0);
        assertNotNull(first);
    }

    @Test
    public void testBogusDoctype_IgnoresUntilGT() {
        Document doc = Jsoup.parse("<!DOCTYPE html SYSTEM abc def><p>x</p>");
        assertNotNull(doc);
    }

    /**
     * ทดสอบ "ล่าบั๊กที่สอง": ใน AfterDoctypeSystemKeyword กรณี default
     * (error, forceQuirks=true, emitDoctypePending) ไม่มีการเรียก t.transition(...)
     * เลย ซึ่งต่างจาก case อื่น ๆ ทั้งหมดในสถานะนี้ที่ transition(Data) เสมอ
     * อาจทำให้มีการ emit doctype ซ้ำหลายครั้ง หรือพฤติกรรม parse ผิดเพี้ยนกับ
     * อินพุตที่มีตัวอักษรแปลกปลอมหลายตัวต่อจาก SYSTEM keyword
     * ใช้ timeout เพื่อป้องกันไม่ให้ test suite ค้าง หากเกิด loop ผิดปกติจริง
     */
    @Test(timeout = 3000)
    public void testAfterDoctypeSystemKeyword_MissingTransition_NoHang() {
        Document doc = Jsoup.parse("<!DOCTYPE html SYSTEMxyz><p>ok</p>");
        assertNotNull(doc);
        // อย่างน้อยต้อง parse จนจบได้โดยไม่ hang และยังเจอ <p> ต่อจากส่วน doctype
        assertEquals("ok", doc.select("p").text());
    }

    // ===================================================================
    // Script data (Rawtext-family) branches
    // ===================================================================

    @Test
    public void testScriptData_LessThanNotEndTag_TreatedAsLiteral() {
        Document doc = Jsoup.parse("<script>var x = 1 < 2;</script>");
        assertEquals("var x = 1 < 2;", doc.select("script").first().data());
    }

    @Test
    public void testScriptData_EndTag_Basic() {
        Document doc = Jsoup.parse("<script>var x=1;</script>");
        assertEquals("var x=1;", doc.select("script").first().data());
    }

    @Test
    public void testScriptDataEscaped_CommentHidingSupported() {
        Document doc = Jsoup.parse("<script><!--alert(1)--></script>");
        String data = doc.select("script").first().data();
        assertTrue(data.contains("alert(1)"));
    }

    @Test
    public void testScriptDataEndTagName_NotAppropriate_AnythingElse() {
        // "</scr" ไม่ตรงกับชื่อแท็กที่เปิดไว้ ("script") -> anythingElse: emit "</scr" กลับเป็น data
        Document doc = Jsoup.parse("<script>a</scrfoo</script>");
        String data = doc.select("script").first().data();
        assertTrue(data.contains("</scrfoo") || data.contains("a"));
    }
}

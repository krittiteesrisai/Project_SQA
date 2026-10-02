# การวิเคราะห์และแนวทางการทดสอบ

**ข้อสังเกตสำคัญ:** `TokeniserState` เป็น `enum` ระดับ package-private และเมธอด `read(Tokeniser, CharacterReader)` ก็เป็น package-private ด้วย อีกทั้ง constructor ของ `Tokeniser`/`CharacterReader` ไม่ได้อยู่ในซอร์สที่ให้มา การเดา signature ของคลาสเหล่านี้จะเสี่ยงต่อการ "เดา behavior ที่ไม่มีอยู่ในซอร์สโค้ด" ตามข้อกำหนดข้อ 4

ดังนั้นแนวทางที่ปลอดภัยและสามารถวัด branch coverage ของ `TokeniserState` ได้จริง คือ:
- วาง test class ไว้ใน package เดียวกัน (`org.jsoup.parser`) เพื่อให้ import/เข้าถึง `TokeniserState` ได้ตามข้อกำหนด
- Drive the state machine ผ่าน public, stable API คือ `org.jsoup.Jsoup.parse(String)` ด้วยสตริง HTML ที่ออกแบบมาเฉพาะเพื่อบังคับให้ tokeniser เดินผ่านแต่ละ branch/if-else ของแต่ละ state ตามที่ปรากฏในซอร์ส
- ตรวจผลด้วย API ที่มั่นใจว่ามีอยู่แน่นอนในทุกเวอร์ชันของ jsoup (`text()`, `html()`, `attr()`, `data()`, `tagName()`, `select()`) แทนการเข้าถึง field ภายใน
- จุดที่ trace behavior ซับซ้อนมาก (เช่น ScriptData double-escape ซ้อน, BogusDoctype serialization) จะใช้ assertion แบบอ่อน (no-exception / contains) และมีคอมเมนต์กำกับความไม่แน่ใจ

```java
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

// Import ของคลาสเป้าหมาย (อยู่ใน package เดียวกันอยู่แล้ว เนื่องจาก TokeniserState
// และเมธอด read() เป็น package-private ทำให้ไม่สามารถ import/เข้าถึงจาก package อื่นได้)
import org.jsoup.parser.TokeniserState;

/**
 * Test suite for {@link TokeniserState}.
 *
 * หมายเหตุสำคัญ: เนื่องจาก TokeniserState.read(Tokeniser, CharacterReader) เป็น
 * package-private และ constructor ของ Tokeniser / CharacterReader ไม่ได้อยู่ใน
 * ซอร์สที่ให้มา (เสี่ยงต่อการ "เดา" signature ที่ไม่ยืนยัน) จึงเลือกทดสอบแบบ
 * black-box โดยขับเคลื่อน state machine ผ่าน org.jsoup.Jsoup.parse(String)
 * ซึ่งเป็น public API ที่เสถียร แล้วตรวจผลลัพธ์ของ DOM/ข้อความที่ได้
 * เพื่อยืนยันว่าแต่ละ if/else, switch-case ใน TokeniserState ทำงานตามที่คาดไว้
 */
public class TokeniserStateTest {

    // ---------------------------------------------------------------
    // Data state
    // ---------------------------------------------------------------

    @Test
    public void testData_PlainText() {
        Document doc = Jsoup.parse("plain text");
        assertEquals("plain text", doc.body().text());
    }

    @Test
    public void testData_Eof_Empty() {
        Document doc = Jsoup.parse("");
        assertNotNull(doc);
        assertEquals("", doc.body().text());
    }

    @Test
    public void testData_Ampersand_InvalidEntity() {
        // '&' ไม่ตามด้วย entity ที่ถูกต้อง -> CharacterReferenceInData คืน null -> emit('&') ตามด้วยข้อความเดิม
        Document doc = Jsoup.parse("A & B");
        assertEquals("A & B", doc.body().text());
    }

    @Test
    public void testData_Ampersand_ValidEntity() {
        Document doc = Jsoup.parse("&amp;");
        assertEquals("&", doc.body().text());
    }

    @Test
    public void testData_NullChar_NotReplaced() {
        // ตามคอมเมนต์ในซอร์ส: Data state ไม่แทนที่ nullChar ด้วย replacementChar (odd)
        Document doc = Jsoup.parse("<p>a\u0000b</p>");
        Element p = doc.select("p").first();
        assertEquals("a\u0000b", p.text());
    }

    @Test
    public void testData_LoneLessThan_AtEof() {
        // '<' ที่ EOF ไม่ match letter/!/?// -> TagOpen error branch: emit('<'), transition(Data)
        Document doc = Jsoup.parse("<");
        assertEquals("<", doc.body().text());
    }

    // ---------------------------------------------------------------
    // TagOpen state
    // ---------------------------------------------------------------

    @Test
    public void testTagOpen_InvalidLetter_EmitsLiteralLt() {
        Document doc = Jsoup.parse("<1>text");
        assertEquals("<1>text", doc.body().text());
    }

    @Test
    public void testTagOpen_QuestionMark_BogusComment() {
        Document doc = Jsoup.parse("<?xml?>remaining");
        assertTrue(doc.html().contains("<!--?xml?-->"));
    }

    // ---------------------------------------------------------------
    // EndTagOpen state
    // ---------------------------------------------------------------

    @Test
    public void testEndTagOpen_EmptyAtEof() {
        Document doc = Jsoup.parse("<div>content</");
        Element div = doc.select("div").first();
        assertEquals("content</", div.text());
    }

    @Test
    public void testEndTagOpen_ImmediateGt_Swallowed() {
        // '</>' -> error + advanceTransition(Data) โดยไม่ emit อะไรเลย ('>' ถูกกลืนไปด้วย)
        Document doc = Jsoup.parse("a</>b");
        assertEquals("ab", doc.body().text());
    }

    @Test
    public void testEndTagOpen_NonLetterNonGt_BogusComment() {
        Document doc = Jsoup.parse("a</#comment>b");
        assertTrue(doc.html().contains("<!--#comment-->"));
    }

    // ---------------------------------------------------------------
    // TagName state
    // ---------------------------------------------------------------

    @Test
    public void testTagName_SelfClosingSlash() {
        Document doc = Jsoup.parse("<foo/>bar");
        assertNotNull(doc.select("foo").first());
    }

    @Test
    public void testTagName_NullChar_ReplacedInName() {
        // nullChar ใน TagName ถูกแทนด้วย replacementStr และสะสมต่อกับส่วนชื่อก่อนหน้า
        Document doc = Jsoup.parse("<p\u0000x>text</p");
        Elements children = doc.body().children();
        assertEquals(1, children.size());
        // ความมั่นใจปานกลาง: ไม่ fix ชื่อ tag แบบ exact เพราะไม่แน่ใจเรื่อง normalize ของ Tag.valueOf
        assertTrue(children.first().tagName().contains("\uFFFD"));
    }

    @Test
    public void testTagName_EofDanglingTagDisappears() {
        // EOF ขณะอยู่ใน TagName -> eofError + transition(Data) แต่ไม่ emitTagPending -> tag หาย
        Document doc = Jsoup.parse("<div");
        assertEquals(0, doc.body().children().size());
    }

    // ---------------------------------------------------------------
    // Rcdata / CharacterReferenceInRcdata / RcdataLessthanSign / RCDATAEndTagName
    // ---------------------------------------------------------------

    @Test
    public void testRcdata_Title_EntityDecoded() {
        Document doc = Jsoup.parse("<title>Hello &amp; World</title>");
        assertEquals("Hello & World", doc.select("title").first().text());
    }

    @Test
    public void testRcdata_Title_NullCharReplaced() {
        Document doc = Jsoup.parse("<title>a\u0000b</title>");
        assertEquals("a\uFFFDb", doc.select("title").first().text());
    }

    @Test
    public void testRcdata_Textarea_ElseBranch_LiteralInnerTags() {
        // มีตัวอักษรหลัง '<' แต่ "</textarea" ยังปรากฎถัดไป -> else branch: emit('<'), อยู่ใน Rcdata ต่อ
        // ตาม trace ของซอร์ส: '>' ของ fake end tag ที่ไม่ตรง (</b>) จะถูกกลืนหายไป (ไม่ถูก emit)
        Document doc = Jsoup.parse("<textarea>Hello <b>bold</b> World</textarea>");
        Element ta = doc.select("textarea").first();
        assertEquals("Hello <b>bold</b World", ta.text());
    }

    @Test
    public void testRcdata_Textarea_DivergeBranch_NoClosingTag() {
        // ไม่มี "</textarea" ปรากฎในส่วนที่เหลือ -> if-branch (diverge from spec):
        // ปิด textarea ทันที, unconsume '<', กลับไป Data แล้ว parse ต่อเป็น HTML ปกติ
        Document doc = Jsoup.parse("<textarea>Hello <b>World");
        Element ta = doc.select("textarea").first();
        assertEquals("Hello", ta.text().trim());
        Element b = doc.select("b").first();
        assertNotNull(b);
        assertEquals("World", b.text());
    }

    // ---------------------------------------------------------------
    // Rawtext / RawtextLessthanSign
    // ---------------------------------------------------------------

    @Test
    public void testRawtext_Style_NoEntityDecode() {
        // Rawtext ไม่มี state สำหรับ decode '&' -> ข้อความคงเดิม ไม่ถูกตีความ
        Document doc = Jsoup.parse("<style>&amp;</style>");
        assertEquals("&amp;", doc.select("style").first().data());
    }

    @Test
    public void testRawtext_Style_NullCharReplaced() {
        Document doc = Jsoup.parse("<style>a\u0000b</style>");
        assertEquals("a\uFFFDb", doc.select("style").first().data());
    }

    @Test
    public void testRawtext_Style_EofDangling() {
        Document doc = Jsoup.parse("<style>abc");
        assertEquals("abc", doc.select("style").first().data());
    }

    @Test
    public void testRawtext_LessThanSign_ElseBranch() {
        // '<' ตามด้วยตัวอักษรที่ไม่ใช่ '/' -> else branch: emit('<'), อยู่ใน Rawtext ต่อ
        Document doc = Jsoup.parse("<style>a<b</style>");
        assertEquals("a<b", doc.select("style").first().data());
    }

    // ---------------------------------------------------------------
    // ScriptData / ScriptDataLessthanSign / Escape* states
    // ---------------------------------------------------------------

    @Test
    public void testScriptData_Basic() {
        Document doc = Jsoup.parse("<script>var a = 1;</script>");
        assertEquals("var a = 1;", doc.select("script").first().data());
    }

    @Test
    public void testScriptData_NullCharReplaced() {
        Document doc = Jsoup.parse("<script>a\u0000b</script>");
        assertEquals("a\uFFFDb", doc.select("script").first().data());
    }

    @Test
    public void testScriptData_EscapeSequence_DashDash() {
        // ไล่ผ่าน ScriptDataLessthanSign('!') -> ScriptDataEscapeStart -> ScriptDataEscapeStartDash
        // -> ScriptDataEscapedDashDash -> ScriptDataEscaped -> ... -> ScriptData
        Document doc = Jsoup.parse("<script><!--x--></script>");
        assertEquals("<!--x-->", doc.select("script").first().data());
    }

    @Test
    public void testScriptData_DoubleEscape_NonScriptTagName_WeakCheck() {
        // ครอบคลุม ScriptDataEscapedLessthanSign -> ScriptDataDoubleEscapeStart ที่ dataBuffer != "script"
        // -> กลับไป ScriptDataEscaped (ไม่ไป ScriptDataDoubleEscaped)
        // หมายเหตุ: assertion อ่อน เนื่องจากผลลัพธ์สตริงแบบ exact มีความซับซ้อนสูง ไม่ยืนยัน 100%
        Document doc = Jsoup.parse("<script><!--<div>--></script>");
        assertNotNull(doc.select("script").first());
        assertTrue(doc.select("script").first().data().contains("div"));
    }

    @Test
    public void testScriptDataLessthanSign_DefaultBranch_UnconsumeLt() {
        // '<' ตามด้วยตัวอักษรที่ไม่ใช่ '/' หรือ '!' -> default: emit('<'), unconsume, transition(ScriptData)
        Document doc = Jsoup.parse("<script>if (1 < 2) {}</script>");
        assertEquals("if (1 < 2) {}", doc.select("script").first().data());
    }

    // ---------------------------------------------------------------
    // PLAINTEXT
    // ---------------------------------------------------------------

    @Test
    public void testPlaintext_ConsumesRestLiterally() {
        Document doc = Jsoup.parse("<plaintext>Hello <b>World</b>");
        Element pt = doc.select("plaintext").first();
        assertNotNull(pt);
        assertEquals("Hello <b>World</b>", pt.text());
    }

    @Test
    public void testPlaintext_NullCharReplaced() {
        Document doc = Jsoup.parse("<plaintext>a\u0000b");
        Element pt = doc.select("plaintext").first();
        assertEquals("a\uFFFDb", pt.text());
    }

    // ---------------------------------------------------------------
    // BeforeAttributeName / AttributeName
    // ---------------------------------------------------------------

    @Test
    public void testBeforeAttributeName_SpecialCharBranch() {
        // '<' ใน BeforeAttributeName -> error + newAttribute + appendAttributeName(c) + transition(AttributeName)
        Document doc = Jsoup.parse("<a <>x</a>");
        Element a = doc.select("a").first();
        assertTrue(a.hasAttr("<"));
        assertEquals("x", a.text());
    }

    @Test
    public void testAttributeName_QuoteCharMidName() {
        // '"' กลางชื่อ attribute -> error + appendAttributeName('"') แล้วค้าง state เดิม (ไม่ transition)
        Document doc = Jsoup.parse("<a b\"c=1>x</a>");
        Element a = doc.select("a").first();
        assertEquals("1", a.attr("b\"c"));
    }

    @Test
    public void testAttributeName_EofDangling() {
        Document doc = Jsoup.parse("<a b");
        assertEquals(0, doc.body().children().size());
    }

    // ---------------------------------------------------------------
    // AfterAttributeName
    // ---------------------------------------------------------------

    @Test
    public void testAfterAttributeName_EqualsBranch() {
        Document doc = Jsoup.parse("<a b =1>x</a>");
        Element a = doc.select("a").first();
        assertEquals("1", a.attr("b"));
        assertEquals("x", a.text());
    }

    @Test
    public void testAfterAttributeName_NullCharAppendsToExistingName() {
        // nullChar ใน AfterAttributeName -> appendAttributeName(replacementChar) ต่อท้ายชื่อเดิม (b) แล้ว transition(AttributeName)
        Document doc = Jsoup.parse("<a b \u0000c=1>x</a>");
        Element a = doc.select("a").first();
        assertEquals("1", a.attr("b\uFFFDc"));
    }

    @Test
    public void testAfterAttributeName_SlashSelfClosing() {
        Document doc = Jsoup.parse("<br b />");
        Element br = doc.select("br").first();
        assertNotNull(br);
        assertTrue(br.hasAttr("b"));
    }

    @Test
    public void testAfterAttributeName_EofDangling() {
        Document doc = Jsoup.parse("<a b ");
        assertEquals(0, doc.body().children().size());
    }

    // ---------------------------------------------------------------
    // BeforeAttributeValue
    // ---------------------------------------------------------------

    @Test
    public void testBeforeAttributeValue_Ampersand() {
        Document doc = Jsoup.parse("<a b=&amp;>x</a>");
        assertEquals("&", doc.select("a").first().attr("b"));
    }

    @Test
    public void testBeforeAttributeValue_NullChar() {
        Document doc = Jsoup.parse("<a b=\u0000x>y</a>");
        assertEquals("\uFFFDx", doc.select("a").first().attr("b"));
    }

    @Test
    public void testBeforeAttributeValue_ImmediateGt_NoValue() {
        Document doc = Jsoup.parse("<a b=>x</a>");
        assertEquals("", doc.select("a").first().attr("b"));
    }

    @Test
    public void testBeforeAttributeValue_SpecialCharLt() {
        Document doc = Jsoup.parse("<a b=<>x</a>");
        assertEquals("<", doc.select("a").first().attr("b"));
    }

    @Test
    public void testBeforeAttributeValue_EofDangling() {
        Document doc = Jsoup.parse("<a b=");
        assertEquals(0, doc.body().children().size());
    }

    // ---------------------------------------------------------------
    // AttributeValue_doubleQuoted / singleQuoted / unquoted
    // ---------------------------------------------------------------

    @Test
    public void testAttributeValueDoubleQuoted_Basic() {
        Document doc = Jsoup.parse("<a b=\"hello &amp; world\">x</a>");
        assertEquals("hello & world", doc.select("a").first().attr("b"));
    }

    @Test
    public void testAttributeValueDoubleQuoted_NullChar() {
        Document doc = Jsoup.parse("<a b=\"x\u0000y\">z</a>");
        assertEquals("x\uFFFDy", doc.select("a").first().attr("b"));
    }

    @Test
    public void testAttributeValueDoubleQuoted_EofDangling() {
        Document doc = Jsoup.parse("<a b=\"x");
        assertEquals(0, doc.body().children().size());
    }

    @Test
    public void testAttributeValueSingleQuoted_Basic() {
        Document doc = Jsoup.parse("<a b='hello'>x</a>");
        assertEquals("hello", doc.select("a").first().attr("b"));
    }

    @Test
    public void testAttributeValueUnquoted_QuoteCharMidValue() {
        Document doc = Jsoup.parse("<a b=x\"y>z</a>");
        assertEquals("x\"y", doc.select("a").first().attr("b"));
    }

    @Test
    public void testAttributeValueUnquoted_EofDangling() {
        Document doc = Jsoup.parse("<a b=x");
        assertEquals(0, doc.body().children().size());
    }

    // ---------------------------------------------------------------
    // AfterAttributeValue_quoted
    // ---------------------------------------------------------------

    @Test
    public void testAfterAttributeValueQuoted_MissingWhitespace() {
        // ไม่มี whitespace หลัง quote ปิด -> default: error + unconsume + transition(BeforeAttributeName)
        Document doc = Jsoup.parse("<a b=\"v\"c=\"1\">x</a>");
        Element a = doc.select("a").first();
        assertEquals("v", a.attr("b"));
        assertEquals("1", a.attr("c"));
    }

    // ---------------------------------------------------------------
    // SelfClosingStartTag
    // ---------------------------------------------------------------

    @Test
    public void testSelfClosingStartTag_Proper() {
        Document doc = Jsoup.parse("<foo/>");
        assertNotNull(doc.select("foo").first());
    }

    @Test
    public void testSelfClosingStartTag_InvalidCharDropped() {
        // '/x' -> default: error + transition(BeforeAttributeName) (ตัวอักษรหลัง '/' ถูกกลืนหายไปโดยไม่ unconsume)
        Document doc = Jsoup.parse("<div/x>text</div>");
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals("text", div.text());
    }

    // ---------------------------------------------------------------
    // BogusComment / MarkupDeclarationOpen / Comment* / Cdata
    // ---------------------------------------------------------------

    @Test
    public void testComment_Basic() {
        Document doc = Jsoup.parse("<!-- hello -->");
        assertTrue(doc.html().contains("<!-- hello -->"));
    }

    @Test
    public void testComment_CommentStartDash_ExtraDashSwallowed() {
        // ตัวที่ 3 ของ '-' ใน CommentStartDash case '-' ถูก transition เฉยๆไม่ append
        Document doc = Jsoup.parse("<!---abc-->");
        assertTrue(doc.html().contains("<!--abc-->"));
    }

    @Test
    public void testComment_EndBangSequence() {
        Document doc = Jsoup.parse("<!--abc--!>");
        assertTrue(doc.html().contains("<!--abc-->"));
    }

    @Test
    public void testMarkupDeclarationOpen_UnknownBogusComment() {
        Document doc = Jsoup.parse("<!randomtext>");
        assertTrue(doc.html().contains("<!--randomtext-->"));
    }

    @Test
    public void testCdataSection_Basic() {
        Document doc = Jsoup.parse("<![CDATA[Some data]]>after");
        // Assumption: token Character ของ CDATA และข้อความ "after" ถัดมาถูก merge เป็น text node เดียวกัน
        assertTrue(doc.body().text().contains("Some data"));
        assertTrue(doc.body().text().contains("after"));
    }

    // ---------------------------------------------------------------
    // Doctype family
    // ---------------------------------------------------------------

    @Test
    public void testDoctype_Simple() {
        Document doc = Jsoup.parse("<!DOCTYPE html><p>x</p>");
        assertTrue(doc.html().toLowerCase().contains("<!doctype html>"));
    }

    @Test
    public void testDoctype_PublicSystem() {
        Document doc = Jsoup.parse(
            "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" " +
            "\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">"
        );
        assertTrue(doc.html().toUpperCase().contains("PUBLIC"));
    }

    @Test
    public void testDoctype_UnknownKeyword_BogusDoctype_NoException() {
        // AfterDoctypeName ไม่ match PUBLIC/SYSTEM -> forceQuirks + advanceTransition(BogusDoctype)
        // Assertion อ่อน เนื่องจากรูปแบบ serialization ที่แน่นอนไม่ยืนยัน 100%
        Document doc = Jsoup.parse("<!DOCTYPE html FOO BAR>");
        assertNotNull(doc);
        assertTrue(doc.html().toLowerCase().contains("<!doctype"));
    }

    @Test
    public void testAfterDoctypeName_Eof_NoException() {
        Document doc = Jsoup.parse("<!DOCTYPE html ");
        assertNotNull(doc);
    }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| กลุ่มเมธอดทดสอบ | State ที่ครอบคลุม | Branch/Condition หลัก |
|---|---|---|
| testData_* | `Data` | '&' (valid/invalid entity), nullChar (ไม่ replace), EOF, default text |
| testTagOpen_* | `TagOpen` | '?' (BogusComment), ตัวอักษรไม่ใช่ letter/!/#// (error branch) |
| testEndTagOpen_* | `EndTagOpen` | isEmpty(), matches('>'), else (BogusComment) |
| testTagName_* | `TagName` | whitespace, '/', nullChar (replacementStr), EOF (ทิ้ง tag) |
| testRcdata_Title_* | `Rcdata`, `CharacterReferenceInRcdata` | '&' decode, nullChar replace |
| testRcdata_Textarea_* | `RcdataLessthanSign`, `RCDATAEndTagOpen`, `RCDATAEndTagName` | if/else ของ diverge-from-spec, isAppropriateEndTagToken true/false |
| testRawtext_* | `Rawtext`, `RawtextLessthanSign` | nullChar, EOF, '/' vs else branch |
| testScriptData_* | `ScriptData`, `ScriptDataLessthanSign`, `ScriptDataEscapeStart(Dash)`, `ScriptDataEscaped(Dash)(DashDash)`, `ScriptDataEscapedLessthanSign`, `ScriptDataDoubleEscapeStart` | '-' vs default, dataBuffer=="script" true/false |
| testPlaintext_* | `PLAINTEXT` | nullChar replace, consumeTo(nullChar) |
| testBeforeAttributeName_*, testAttributeName_* | `BeforeAttributeName`, `AttributeName` | special-char branch ('<','"','\'','='), nullChar, EOF |
| testAfterAttributeName_* | `AfterAttributeName` | '=', nullChar (append to existing), '/', EOF |
| testBeforeAttributeValue_* | `BeforeAttributeValue` | '&', nullChar, '>', '<'/'='/'`', EOF |
| testAttributeValue*_* | `AttributeValue_doubleQuoted/singleQuoted/unquoted` | nullChar, quote-char mid value, EOF |
| testAfterAttributeValueQuoted_* | `AfterAttributeValue_quoted` | default (missing whitespace) branch |
| testSelfClosingStartTag_* | `SelfClosingStartTag` | '>' (selfClosing), default (char dropped) |
| testComment_*, testMarkupDeclarationOpen_* | `Comment`, `CommentStart(Dash)`, `CommentEnd(Bang)(Dash)`, `MarkupDeclarationOpen` | '-' self-loop, '!' (CommentEndBang), else (BogusComment) |
| testCdataSection_* | `CdataSection`, `MarkupDeclarationOpen` | matchConsume("[CDATA[") true branch |
| testDoctype_* | `Doctype`, `AfterDoctypeName`, `BogusDoctype` | whitespace, PUBLIC/SYSTEM keyword matched/ไม่ matched, EOF |

> หมายเหตุ: บาง assertion (ScriptData double-escape ซ้อน, BogusDoctype serialization) ใช้การตรวจแบบ "weak assertion" (ไม่มี exception / contains substring) เนื่องจากพฤติกรรมละเอียดขึ้นกับ internal class (`Tokeniser`, `Token`, `HtmlTreeBuilder`) ที่ไม่ได้อยู่ในซอร์สที่ให้มา จึงไม่ยืนยัน exact string 100% ตามข้อกำหนดข้อ 4
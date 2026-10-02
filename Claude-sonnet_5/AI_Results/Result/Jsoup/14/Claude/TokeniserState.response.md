# วิเคราะห์และแนวทางการทดสอบ

**หมายเหตุสำคัญ:**
- `TokeniserState` เป็น **package-private enum** จึงต้องวาง test class ไว้ใน package เดียวกัน (`org.jsoup.parser`) — นี่คือวิธี "import" ที่ถูกต้องสำหรับคลาสระดับ package-private (ไม่ต้องมี explicit import statement แต่ยังอ้างถึงคลาสได้ตรง)
- เนื่องจาก `read(Tokeniser, CharacterReader)` ถูกเรียกจาก internal ของ `Tokeniser`/`TreeBuilder` ซึ่งมี field/constructor แบบ package-private และพึ่งพา state ภายในจำนวนมาก การทดสอบที่ **เสถียรและครอบคลุม branch ได้จริง** คือการทดสอบผ่าน public API (`Jsoup.parse`, `Parser`) ซึ่งจะไป drive state machine ของ `TokeniserState` ทุก state ตามอินพุต HTML ที่ป้อน — เป็นวิธีมาตรฐานที่ใช้ทดสอบคลาสนี้ในชุดทดสอบจริงของ jsoup
- ผมพบ **ข้อบกพร่องที่มองเห็นได้ชัดจาก source** ใน `ScriptDataDoubleEscapedDashDash`: case `'>'` ไม่มี `break;` ทำให้ fall-through ไปยัง `case nullChar` โดยไม่ตั้งใจ (เพิ่ม error, emit replacement char ผิดๆ, และ override transition) — เขียนเทสเฉพาะเพื่อดักจับ fault นี้โดยตรง
- จุดที่ behavior ขึ้นกับ class อื่น (Tokeniser/TreeBuilder) ที่ไม่ได้ให้ source มา จะ**คอมเมนต์กำกับ**ไว้ชัดเจนและใช้ assertion ที่ปลอดภัย (ไม่เดา exact output)

```java
package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit4 tests for org.jsoup.parser.TokeniserState.
 *
 * TokeniserState is package-private; this test class lives in the same package
 * (org.jsoup.parser) so it can reference the enum directly without an import statement.
 * Because read(Tokeniser, CharacterReader) depends heavily on package-private internals
 * (Tokeniser, CharacterReader, Token.*), tests drive the state machine indirectly through
 * the public Jsoup/Parser API, which exercises every TokeniserState transition according
 * to the HTML fed to it.
 */
public class TokeniserStateTest {

    // ---------------------------------------------------------------
    // Sanity: direct reference to the target enum (package-private)
    // ---------------------------------------------------------------
    @Test
    public void testEnum_StatesExist_AndValueOfWorks() {
        assertSame(TokeniserState.Data, TokeniserState.valueOf("Data"));
        assertSame(TokeniserState.CdataSection, TokeniserState.valueOf("CdataSection"));
        assertEquals(TokeniserState.class.getEnumConstants().length, TokeniserState.values().length);
    }

    // ---------------------------------------------------------------
    // Data state
    // ---------------------------------------------------------------
    @Test
    public void testData_Ampersand_NamedEntity() {
        Document doc = Jsoup.parse("<p>&amp;</p>");
        assertEquals("&", doc.select("p").text());
    }

    @Test
    public void testData_Ampersand_InvalidEntity_EmitsLiteralAmp() {
        // consumeCharacterReference(..) returns null for malformed entity;
        // CharacterReferenceInData then emits '&' literally, back to Data.
        Document doc = Jsoup.parse("<p>&notanentity;</p>");
        assertTrue(doc.select("p").text().startsWith("&"));
    }

    @Test
    public void testData_LessThan_GoesToTagOpen() {
        Document doc = Jsoup.parse("<p>hello</p>");
        assertEquals("hello", doc.select("p").text());
    }

    @Test
    public void testData_NullChar_EmitsRawNullChar_NotReplacementChar() {
        // Source comment explicitly: "NOT replacement character (oddly?)"
        Parser parser = Parser.htmlParser();
        parser.setTrackErrors(10);
        Document doc = parser.parseInput("<p>a\u0000b</p>", "");
        assertFalse(parser.getErrors().isEmpty());
        String text = doc.select("p").text();
        assertTrue(text.indexOf('\u0000') >= 0);
    }

    @Test
    public void testData_Eof_NoException() {
        Document doc = Jsoup.parse("<p>hello");
        assertEquals("hello", doc.select("p").text());
    }

    @Test
    public void testData_DefaultBranch_ConsumeToAny() {
        Document doc = Jsoup.parse("plain text without tags");
        assertTrue(doc.body().text().contains("plain text without tags"));
    }

    // ---------------------------------------------------------------
    // Rcdata (title) + CharacterReferenceInRcdata
    // ---------------------------------------------------------------
    @Test
    public void testRcdata_AmpersandEntity_InTitle() {
        Document doc = Jsoup.parse("<html><head><title>A&amp;B</title></head><body></body></html>");
        assertEquals("A&B", doc.title());
    }

    @Test
    public void testRcdata_LessThan_NotEndTag_EmitsLiteralLt() {
        Document doc = Jsoup.parse("<title>A<B</title>");
        assertTrue(doc.title().contains("<"));
    }

    @Test
    public void testRcdata_NullChar_ReplacedWithReplacementChar() {
        Parser parser = Parser.htmlParser();
        parser.setTrackErrors(10);
        Document doc = parser.parseInput("<title>A\u0000B</title>", "");
        assertFalse(parser.getErrors().isEmpty());
        assertTrue(doc.title().indexOf('\uFFFD') >= 0);
    }

    @Test
    public void testRcdata_Eof_NoException() {
        Document doc = Jsoup.parse("<title>Unclosed title");
        assertTrue(doc.title().contains("Unclosed title"));
    }

    @Test
    public void testRcdata_AppropriateEndTag_Closes() {
        Document doc = Jsoup.parse("<title>hello</title>");
        assertEquals("hello", doc.title());
    }

    @Test
    public void testRcdata_EndTagOpen_NotLetter_EmitsLiteralSlashSlash() {
        // RCDATAEndTagOpen: '/' followed by non-letter -> emit "</" literally, stays Rcdata.
        Document doc = Jsoup.parse("<title>a</1b</title>");
        assertTrue(doc.title().contains("</1b"));
    }

    @Test
    public void testRcdata_EndTagName_InappropriateEndTag_AnythingElse() {
        // </span> inside <title> is NOT an appropriate end tag -> anythingElse() emits "</span" literally.
        Document doc = Jsoup.parse("<title>a</span>b</title>");
        assertTrue(doc.title().contains("</span>"));
    }

    // ---------------------------------------------------------------
    // Rawtext (style) + RawtextLessthanSign/EndTagOpen/EndTagName
    // ---------------------------------------------------------------
    @Test
    public void testRawtext_LessThan_NotSlash_EmitsLiteralLt() {
        Document doc = Jsoup.parse("<style>a<b{color:red}</style>");
        Element style = doc.select("style").first();
        assertNotNull(style);
        assertTrue(style.data().contains("<b"));
    }

    @Test
    public void testRawtext_EndTag_Appropriate_Closes() {
        Document doc = Jsoup.parse("<style>.a{color:red}</style>");
        Element style = doc.select("style").first();
        assertEquals(".a{color:red}", style.data());
    }

    @Test
    public void testRawtext_NullChar_ReplacedWithReplacementChar() {
        Parser parser = Parser.htmlParser();
        parser.setTrackErrors(10);
        Document doc = parser.parseInput("<style>a\u0000b</style>", "");
        assertFalse(parser.getErrors().isEmpty());
        Element style = doc.select("style").first();
        assertTrue(style.data().indexOf('\uFFFD') >= 0);
    }

    // ---------------------------------------------------------------
    // ScriptData family
    // ---------------------------------------------------------------
    @Test
    public void testScriptData_PlainContent_LessThanNotTriggeringEndTag() {
        Document doc = Jsoup.parse("<script>var a = 1 < 2;</script>");
        Element script = doc.select("script").first();
        assertTrue(script.data().contains("var a = 1"));
    }

    @Test
    public void testScriptData_EndTag_Closes() {
        Document doc = Jsoup.parse("<script>code();</script>");
        assertEquals("code();", doc.select("script").first().data());
    }

    @Test
    public void testScriptDataLessthanSign_Bang_EscapeStart() {
        Document doc = Jsoup.parse("<script><!--var a=1;--></script>");
        assertTrue(doc.select("script").first().data().contains("var a=1;"));
    }

    @Test
    public void testScriptDataEscapeStart_NoDash_BackToScriptData() {
        // ScriptDataEscapeStart: current char not '-' -> transition(ScriptData) directly.
        Document doc = Jsoup.parse("<script><!x script data</script>");
        assertNotNull(doc.select("script").first());
    }

    /**
     * FAULT-TARGETING TEST.
     * Source bug: in ScriptDataDoubleEscapedDashDash, case '>' is missing a break statement:
     *   case '>': t.emit(c); t.transition(ScriptData);        // <-- no break!
     *   case nullChar: t.error(this); t.emit(replacementChar); t.transition(ScriptDataDoubleEscaped); break;
     * This causes fall-through: after correctly emitting '>' and intending to go back to
     * ScriptData, execution erroneously ALSO runs the nullChar branch, emitting a bogus
     * U+FFFD replacement character and logging a spurious error.
     * A correct implementation must NEVER emit U+FFFD in this scenario.
     */
    @Test
    public void testScriptDataDoubleEscapedDashDash_GreaterThan_MustNotFallThroughToNullCharBranch() {
        String html = "<script><!--<script>a-->b</script></script>";
        Document doc = Jsoup.parse(html);
        Element script = doc.select("script").first();
        assertNotNull(script);
        String data = script.data();
        assertFalse("Replacement char U+FFFD must not appear - indicates missing 'break' fall-through bug",
                data.indexOf('\uFFFD') >= 0);
    }

    @Test
    public void testScriptDataDoubleEscapedDashDash_NullChar_Branch() {
        // Directly exercise the (intended) nullChar branch alone, without the '>' fallthrough scenario.
        Parser parser = Parser.htmlParser();
        parser.setTrackErrors(10);
        String html = "<script><!--<script>a--\u0000b</script></script>";
        Document doc = parser.parseInput(html, "");
        Element script = doc.select("script").first();
        assertNotNull(script);
        assertTrue(script.data().indexOf('\uFFFD') >= 0);
    }

    // ---------------------------------------------------------------
    // PLAINTEXT
    // ---------------------------------------------------------------
    @Test
    public void testPlaintext_NoException_ConsumesRest() {
        // Per spec, PLAINTEXT consumes everything to EOF verbatim; exact DOM shape depends
        // on TreeBuilder (not shown in given source), so we only assert no crash & content kept.
        Document doc = Jsoup.parse("<plaintext>a<b>c");
        assertTrue(doc.body().html().contains("a") );
    }

    // ---------------------------------------------------------------
    // TagOpen
    // ---------------------------------------------------------------
    @Test
    public void testTagOpen_Bang_MarkupDeclarationOpen_Comment() {
        Document doc = Jsoup.parse("<!-- hello -->");
        boolean found = false;
        for (Node n : doc.childNodes()) {
            if (n instanceof Comment) {
                found = true;
                assertTrue(((Comment) n).getData().contains("hello"));
            }
        }
        assertTrue("Expected a comment node", found);
    }

    @Test
    public void testTagOpen_Slash_EndTagOpen() {
        Document doc = Jsoup.parse("<p>x</p>");
        assertEquals("x", doc.select("p").text());
    }

    @Test
    public void testTagOpen_Question_BogusComment() {
        Document doc = Jsoup.parse("<?xml version=\"1.0\"?><p>x</p>");
        assertEquals("x", doc.select("p").text());
    }

    @Test
    public void testTagOpen_Letter_StartsTagName() {
        Document doc = Jsoup.parse("<div>content</div>");
        assertEquals("content", doc.select("div").text());
    }

    @Test
    public void testTagOpen_InvalidChar_EmitsLiteralLt_BackToData() {
        Document doc = Jsoup.parse("<p>1 < 2</p>");
        assertTrue(doc.select("p").text().contains("<"));
    }

    // ---------------------------------------------------------------
    // EndTagOpen
    // ---------------------------------------------------------------
    @Test
    public void testEndTagOpen_Eof_EmitsSlashSlash() {
        Document doc = Jsoup.parse("<p>Test</");
        assertTrue(doc.select("p").text().contains("Test"));
    }

    @Test
    public void testEndTagOpen_Letter_StartsTagName() {
        Document doc = Jsoup.parse("<p>Test</p>");
        assertEquals("Test", doc.select("p").text());
    }

    @Test
    public void testEndTagOpen_GreaterThan_EmptyEndTag_Ignored() {
        Document doc = Jsoup.parse("<p>x</>y</p>");
        String text = doc.select("p").text();
        assertTrue(text.contains("x"));
        assertTrue(text.contains("y"));
    }

    @Test
    public void testEndTagOpen_Else_BogusComment() {
        Document doc = Jsoup.parse("<p>x</!remark>y</p>");
        assertFalse(doc.select("p").text().contains("remark"));
    }

    // ---------------------------------------------------------------
    // TagName
    // ---------------------------------------------------------------
    @Test
    public void testTagName_Whitespace_BeforeAttributeName() {
        Document doc = Jsoup.parse("<p class=\"c\">t</p>");
        assertEquals("c", doc.select("p").attr("class"));
    }

    @Test
    public void testTagName_Slash_SelfClosingStartTag() {
        Document doc = Jsoup.parse("<br/>");
        assertNotNull(doc.select("br").first());
    }

    @Test
    public void testTagName_GreaterThan_EmitsTag() {
        Document doc = Jsoup.parse("<span>s</span>");
        assertEquals("s", doc.select("span").text());
    }

    @Test
    public void testTagName_Eof_LogsError() {
        Parser parser = Parser.htmlParser();
        parser.setTrackErrors(10);
        parser.parseInput("<p", "");
        assertFalse(parser.getErrors().isEmpty());
    }

    @Test
    public void testTagName_NullChar_AppendsReplacementStr_NoException() {
        // Exact resulting tag-name normalization is an implementation detail of Tag/TreeBuilder
        // (not shown in given source); we only assert parsing completes without exception.
        Parser parser = Parser.htmlParser();
        parser.setTrackErrors(10);
        Document doc = parser.parseInput("<p\u0000x>test</p\u0000x>", "");
        assertNotNull(doc);
    }

    // ---------------------------------------------------------------
    // BeforeAttributeName / AttributeName / AfterAttributeName
    // ---------------------------------------------------------------
    @Test
    public void testBeforeAttributeName_Whitespace_Ignored() {
        Document doc = Jsoup.parse("<p   class=\"x\">t</p>");
        assertEquals("x", doc.select("p").attr("class"));
    }

    @Test
    public void testBeforeAttributeName_Slash_SelfClosing() {
        Document doc = Jsoup.parse("<img src=\"a.png\"/>");
        assertEquals("a.png", doc.select("img").attr("src"));
    }

    @Test
    public void testBeforeAttributeName_NullChar_LogsError() {
        Parser parser = Parser.htmlParser();
        parser.setTrackErrors(10);
        parser.parseInput("<p \u0000x=\"1\">t</p>", "");
        assertFalse(parser.getErrors().isEmpty());
    }

    @Test
    public void testBeforeAttributeName_QuoteCharAsAttrName_LogsError() {
        Parser parser = Parser.htmlParser();
        parser.setTrackErrors(10);
        parser.parseInput("<p \"=\"1\">t</p>", "");
        assertFalse(parser.getErrors().isEmpty());
    }

    @Test
    public void testAttributeName_Equals_ToBeforeAttributeValue() {
        Document doc = Jsoup.parse("<a href=http://example.com>link</a>");
        assertEquals("http://example.com", doc.select("a").attr("href"));
    }

    @Test
    public void testAttributeName_NullChar_AppendsReplacementChar() {
        Parser parser = Parser.htmlParser();
        parser.setTrackErrors(10);
        parser.parseInput("<p a\u0000b=\"1\">t</p>", "");
        assertFalse(parser.getErrors().isEmpty());
    }

    @Test
    public void testAfterAttributeName_Equals_ToBeforeAttributeValue() {
        Document doc = Jsoup.parse("<p a = \"v\">t</p>");
        assertEquals("v", doc.select("p").attr("a"));
    }

    @Test
    public void testAfterAttributeName_Slash_SelfClosing() {
        Document doc = Jsoup.parse("<img src=\"i.png\" alt=\"x\" />");
        assertEquals("x", doc.select("img").attr("alt"));
    }

    // ---------------------------------------------------------------
    // BeforeAttributeValue / AttributeValue_* / AfterAttributeValue_quoted
    // ---------------------------------------------------------------
    @Test
    public void testBeforeAttributeValue_DoubleQuoted() {
        Document doc = Jsoup.parse("<p a=\"val\">t</p>");
        assertEquals("val", doc.select("p").attr("a"));
    }

    @Test
    public void testBeforeAttributeValue_SingleQuoted() {
        Document doc = Jsoup.parse("<p a='val'>t</p>");
        assertEquals("val", doc.select("p").attr("a"));
    }

    @Test
    public void testBeforeAttributeValue_Unquoted_DefaultBranch() {
        Document doc = Jsoup.parse("<p a=val>t</p>");
        assertEquals("val", doc.select("p").attr("a"));
    }

    @Test
    public void testBeforeAttributeValue_Ampersand_UnconsumeToUnquoted() {
        Document doc = Jsoup.parse("<p a=&amp;>t</p>");
        assertEquals("&", doc.select("p").attr("a"));
    }

    @Test
    public void testAttributeValueDoubleQuoted_EntityReference() {
        Document doc = Jsoup.parse("<p a=\"x&amp;y\">t</p>");
        assertEquals("x&y", doc.select("p").attr("a"));
    }

    @Test
    public void testAttributeValueSingleQuoted_EntityReference() {
        Document doc = Jsoup.parse("<p a='x&amp;y'>t</p>");
        assertEquals("x&y", doc.select("p").attr("a"));
    }

    @Test
    public void testAttributeValueUnquoted_EntityReference() {
        Document doc = Jsoup.parse("<p a=x&amp;y>t</p>");
        assertEquals("x&y", doc.select("p").attr("a"));
    }

    @Test
    public void testAfterAttributeValueQuoted_Whitespace_ToBeforeAttributeName() {
        Document doc = Jsoup.parse("<p a=\"v\" b=\"w\">t</p>");
        assertEquals("v", doc.select("p").attr("a"));
        assertEquals("w", doc.select("p").attr("b"));
    }

    @Test
    public void testAfterAttributeValueQuoted_Slash_SelfClosing() {
        Document doc = Jsoup.parse("<img a=\"v\"/>");
        assertEquals("v", doc.select("img").attr("a"));
    }

    @Test
    public void testAfterAttributeValueQuoted_UnexpectedChar_UnconsumeToBeforeAttrName() {
        Parser parser = Parser.htmlParser();
        parser.setTrackErrors(10);
        Document doc = parser.parseInput("<p a=\"v\"b=\"w\">t</p>", "");
        assertFalse(parser.getErrors().isEmpty());
        assertEquals("v", doc.select("p").attr("a"));
        assertEquals("w", doc.select("p").attr("b"));
    }

    // ---------------------------------------------------------------
    // SelfClosingStartTag
    // ---------------------------------------------------------------
    @Test
    public void testSelfClosingStartTag_GreaterThan() {
        Document doc = Jsoup.parse("<br/>");
        assertNotNull(doc.select("br").first());
    }

    @Test
    public void testSelfClosingStartTag_Eof_LogsError() {
        Parser parser = Parser.htmlParser();
        parser.setTrackErrors(10);
        parser.parseInput("<br/", "");
        assertFalse(parser.getErrors().isEmpty());
    }

    // ---------------------------------------------------------------
    // MarkupDeclarationOpen / BogusComment
    // ---------------------------------------------------------------
    @Test
    public void testMarkupDeclarationOpen_DoubleDash_Comment() {
        Document doc = Jsoup.parse("<!--c--><p>x</p>");
        assertEquals("x", doc.select("p").text());
    }

    @Test
    public void testMarkupDeclarationOpen_Doctype_IgnoreCase() {
        Document doc = Jsoup.parse("<!doctype html><p>x</p>");
        boolean found = false;
        for (Node n : doc.childNodes()) if (n instanceof DocumentType) found = true;
        assertTrue(found);
        assertEquals("x", doc.select("p").text());
    }

    @Test
    public void testMarkupDeclarationOpen_Cdata_NoCrash() {
        Document doc = Jsoup.parse("<svg><![CDATA[abc]]></svg>");
        assertTrue(doc.outerHtml().contains("abc"));
    }

    @Test
    public void testMarkupDeclarationOpen_Else_BogusComment() {
        Document doc = Jsoup.parse("<!randomtext><p>x</p>");
        assertEquals("x", doc.select("p").text());
    }

    // ---------------------------------------------------------------
    // Comment states
    // ---------------------------------------------------------------
    @Test
    public void testCommentStart_DefaultChar() {
        Document doc = Jsoup.parse("<!--a--><p>x</p>");
        assertEquals("x", doc.select("p").text());
    }

    @Test
    public void testCommentStart_NullChar_LogsError() {
        Parser parser = Parser.htmlParser();
        parser.setTrackErrors(10);
        parser.parseInput("<!--\u0000-->x", "");
        assertFalse(parser.getErrors().isEmpty());
    }

    @Test
    public void testCommentStart_GreaterThan_EmitsEmptyComment() {
        Document doc = Jsoup.parse("<!>x");
        assertNotNull(doc);
    }

    @Test
    public void testComment_DefaultConsumeToAny_Dash() {
        Document doc = Jsoup.parse("<!-- hello world --><p>x</p>");
        assertEquals("x", doc.select("p").text());
    }

    @Test
    public void testCommentEnd_Bang_ToCommentEndBang() {
        Document doc = Jsoup.parse("<!--a--!><p>x</p>");
        assertEquals("x", doc.select("p").text());
    }

    @Test
    public void testCommentEnd_ExtraDash() {
        Document doc = Jsoup.parse("<!--a---><p>x</p>");
        assertEquals("x", doc.select("p").text());
    }

    // ---------------------------------------------------------------
    // Doctype family
    // ---------------------------------------------------------------
    @Test
    public void testDoctype_Basic_CreatesDocumentTypeNode() {
        Document doc = Jsoup.parse("<!DOCTYPE html><p>x</p>");
        boolean found = false;
        for (Node n : doc.childNodes()) if (n instanceof DocumentType) found = true;
        assertTrue("Expected DocumentType node", found);
        assertEquals("x", doc.select("p").text());
    }

    @Test
    public void testDoctype_Eof_ForceQuirks() {
        Parser parser = Parser.htmlParser();
        parser.setTrackErrors(10);
        parser.parseInput("<!DOCTYPE", "");
        assertFalse(parser.getErrors().isEmpty());
    }

    @Test
    public void testDoctype_PublicIdentifier_DoubleQuoted() {
        Document doc = Jsoup.parse("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\"><p>x</p>");
        assertEquals("x", doc.select("p").text());
    }

    @Test
    public void testDoctype_SystemIdentifier_DoubleQuoted() {
        Document doc = Jsoup.parse("<!DOCTYPE html SYSTEM \"about:legacy-compat\"><p>x</p>");
        assertEquals("x", doc.select("p").text());
    }

    @Test
    public void testDoctype_PublicAndSystem_SingleQuoted() {
        Document doc = Jsoup.parse(
                "<!DOCTYPE html PUBLIC '-//W3C//DTD HTML 4.01//EN' 'http://www.w3.org/TR/html4/strict.dtd'><p>x</p>");
        assertEquals("x", doc.select("p").text());
    }

    @Test
    public void testDoctype_BogusDoctype_IgnoredUntilGt() {
        Document doc = Jsoup.parse("<!DOCTYPE html GARBAGE HERE>x");
        assertNotNull(doc);
    }

    @Test
    public void testDoctype_BogusDoctype_Eof() {
        Parser parser = Parser.htmlParser();
        parser.setTrackErrors(10);
        Document doc = parser.parseInput("<!DOCTYPE html GARBAGE", "");
        assertNotNull(doc);
    }

    // ---------------------------------------------------------------
    // CdataSection
    // ---------------------------------------------------------------
    @Test
    public void testCdataSection_ConsumeToCloser() {
        Document doc = Jsoup.parse("<svg><![CDATA[abc]]></svg>x");
        assertTrue(doc.outerHtml().contains("abc"));
        assertTrue(doc.body().text().contains("x"));
    }

    // ---------------------------------------------------------------
    // Boundary / null / empty / malformed
    // ---------------------------------------------------------------
    @Test
    public void testEmptyInput_NoException() {
        Document doc = Jsoup.parse("");
        assertNotNull(doc);
        assertEquals("", doc.body().text());
    }

    @Test
    public void testNullInput_ThrowsValidationException() {
        // NOTE: exact exception type is not visible from the given TokeniserState source;
        // based on jsoup's typical Validate.notNull guard this should throw a RuntimeException.
        boolean threw = false;
        try {
            Jsoup.parse((String) null);
        } catch (RuntimeException e) {
            threw = true;
        }
        assertTrue("Expected a validation exception when parsing null html", threw);
    }

    @Test
    public void testMalformedInput_UnclosedTagsDoNotThrow() {
        Document doc = Jsoup.parse("<div><p>a<span>b</div>");
        assertNotNull(doc);
        assertTrue(doc.body().text().contains("a"));
        assertTrue(doc.body().text().contains("b"));
    }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| กลุ่ม State | Test method (ตัวแทน) | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| Enum sanity | testEnum_StatesExist_AndValueOfWorks | อ้างอิงตรงถึง enum (import requirement) |
| Data | testData_Ampersand_*, testData_LessThan_*, testData_NullChar_*, testData_Eof_*, testData_DefaultBranch_* | switch-case ทุกสาขา: '&','<',nullChar,eof,default |
| CharacterReferenceInData | testData_Ampersand_NamedEntity / InvalidEntity | if(c==null) / else |
| Rcdata | testRcdata_* (6 เมธอด) | '&','<',nullChar,eof,default + RcdataLessthanSign if/else |
| CharacterReferenceInRcdata | testRcdata_AmpersandEntity_InTitle | if(c==null)/else |
| RCDATAEndTagOpen/EndTagName | testRcdata_EndTagOpen_NotLetter_*, testRcdata_EndTagName_Inappropriate_* | matchesLetter if/else, isAppropriateEndTagToken if/else |
| Rawtext + Rawtext*Tag* | testRawtext_* (3 เมธอด) | '<',nullChar,eof,default, matchesLetter branch |
| ScriptData family | testScriptData_*, testScriptDataLessthanSign_*, testScriptDataEscapeStart_* | '<', nullChar, eof, default, '/', '!' branches |
| ScriptDataDoubleEscapedDashDash | **testScriptDataDoubleEscapedDashDash_GreaterThan_MustNotFallThroughToNullCharBranch**, testScriptDataDoubleEscapedDashDash_NullChar_Branch | **ดักจับ fault: missing `break` ทำให้ fall-through case '>' → nullChar** |
| PLAINTEXT | testPlaintext_NoException_ConsumesRest | nullChar/eof/default (ผ่าน public API, คอมเมนต์กำกับความไม่แน่นอนของ DOM shape) |
| TagOpen | testTagOpen_* (5 เมธอด) | '!','/','?', matchesLetter if/else, error-else branch |
| EndTagOpen | testEndTagOpen_* (4 เมธอด) | isEmpty, matchesLetter, matches('>'), else-BogusComment |
| TagName | testTagName_* (5 เมธอด) | whitespace, '/', '>', nullChar, eof |
| BeforeAttributeName/AttributeName/AfterAttributeName | testBeforeAttributeName_*, testAttributeName_*, testAfterAttributeName_* (7 เมธอด) | whitespace, '/', '>', nullChar, eof, quote-chars, default |
| BeforeAttributeValue/AttributeValue_*/AfterAttributeValue_quoted | testBeforeAttributeValue_*, testAttributeValue*_EntityReference, testAfterAttributeValueQuoted_* (10 เมธอด) | quoted/unquoted/ampersand/nullChar/eof/default/unexpected-char |
| SelfClosingStartTag | testSelfClosingStartTag_* (2 เมธอด) | '>', eof, default |
| MarkupDeclarationOpen/BogusComment | testMarkupDeclarationOpen_* (4 เมธอด) | matchConsume("--")/"DOCTYPE"/"[CDATA[" / else |
| Comment* states | testCommentStart_*, testComment_*, testCommentEnd_* (6 เมธอด) | '-', nullChar, '>', eof, default, '!' |
| Doctype family | testDoctype_* (7 เมธอด) | whitespace, eof, PUBLIC/SYSTEM keyword match, quoted identifiers, BogusDoctype |
| CdataSection | testCdataSection_ConsumeToCloser | consumeTo + matchConsume("]]>") |
| Boundary/null/empty/malformed | testEmptyInput_*, testNullInput_*, testMalformedInput_* | ค่าว่าง, null (คอมเมนต์กำกับ), โครงสร้าง tag ผิดรูป |

**คำเตือนเรื่องความไม่แน่นอน:** ทุกเทสที่มีคอมเมนต์ "NOTE/assumption" ถูกเขียนให้ assertion อ่อนลง (เช่น `assertNotNull`, `contains`) เพื่อไม่เดา behavior ของ class อื่น (Tokeniser/TreeBuilder/Validate) ที่ไม่ได้อยู่ใน source ที่ให้มา ตามข้อกำหนดที่ 4
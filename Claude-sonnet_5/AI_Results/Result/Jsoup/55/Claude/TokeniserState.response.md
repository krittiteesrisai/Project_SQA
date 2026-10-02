# แนวทางการทดสอบ

เนื่องจาก `TokeniserState` เป็น `enum` ที่มี access modifier เป็น **package-private** (ไม่มี `public`) และ method `read(Tokeniser, CharacterReader)` ก็เป็น package-private เช่นกัน จึงต้องวางคลาสทดสอบไว้ใน package เดียวกัน (`org.jsoup.parser`) 

เนื่องจากซอร์สที่ให้มาไม่ได้แสดง internal API ของ `Tokeniser`/`CharacterReader` (field/constructor) อย่างครบถ้วน การเดา signature ภายในจะเสี่ยงต่อการ “เดา behavior ที่ไม่มีในซอร์ส” ผมจึงเลือกทดสอบแบบ **black-box ผ่าน public API** (`org.jsoup.Jsoup`, `org.jsoup.parser.Parser`) ซึ่งจะไป “ขับ” การทำงานของแต่ละ state/branch ใน `TokeniserState` โดยอ้างอิง logic ตรงจาก switch-case ที่ให้มาเท่านั้น จุดที่ behavior ไม่แน่นอน 100% (เช่น การพึ่งพา helper method ที่ไม่เห็น body เช่น `appropriateEndTagName()`, `isAppropriateEndTagToken()`) จะมีคอมเมนต์กำกับไว้ชัดเจน

```java
package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link TokeniserState}.
 *
 * Because TokeniserState / Tokeniser / CharacterReader are package-private and their
 * internal fields/constructors are not shown in the provided source, these tests drive the
 * state machine indirectly through the public org.jsoup.Jsoup / org.jsoup.parser.Parser API.
 * Each test is designed to steer the tokeniser through a specific state/branch described in
 * the given switch-case source.
 */
public class TokeniserStateTest {

    // ---------- helpers ----------

    private Document parseDoc(String html) {
        return Jsoup.parse(html);
    }

    /** Parses and returns the number of ParseErrors recorded (t.error()/t.eofError() calls). */
    private int errorCount(String html) {
        Parser parser = Parser.htmlParser().setTrackErrors(1000);
        parser.parseInput(html, "");
        List<ParseError> errors = parser.getErrors();
        return errors.size();
    }

    // ===================== Data state =====================

    @Test
    public void testData_consumesPlainText() {
        // default branch: consumeData
        Document doc = parseDoc("Hello World");
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testData_ampersandWithValidEntity() {
        // '&' -> CharacterReferenceInData -> readCharRef finds a valid ref
        Document doc = parseDoc("A &amp; B");
        assertEquals("A & B", doc.body().text());
    }

    @Test
    public void testData_ampersandWithInvalidEntity() {
        // '&' -> CharacterReferenceInData -> consumeCharacterReference returns null -> emit '&' literally
        Document doc = parseDoc("A &notareference B");
        assertTrue(doc.body().text().startsWith("A &notareference"));
    }

    @Test
    public void testData_nullCharRecordsErrorButDoesNotCrash() {
        // nullChar branch: t.error(this); t.emit(r.consume()) -- note: NOT replacement char per comment in source
        int errors = errorCount("a\u0000b");
        assertTrue(errors >= 1);
        assertNotNull(parseDoc("a\u0000b"));
    }

    @Test
    public void testData_eofProducesEmptyDocumentWithoutError() {
        // eof branch: t.emit(new Token.EOF())
        Document doc = parseDoc("");
        assertNotNull(doc);
        assertEquals("", doc.body().text());
    }

    // ===================== TagOpen state =====================

    @Test
    public void testTagOpen_bangStartsMarkupDeclaration() {
        Document doc = parseDoc("<!-- hello -->");
        assertTrue(doc.outerHtml().contains("hello"));
    }

    @Test
    public void testTagOpen_slashStartsEndTagOpen() {
        Document doc = parseDoc("<p>x</p>");
        assertEquals("x", doc.select("p").text());
    }

    @Test
    public void testTagOpen_questionMarkStartsBogusComment() {
        int errors = errorCount("<?xml version=\"1.0\"?><p>ok</p>");
        assertTrue(errors >= 1);
        Document doc = parseDoc("<?xml version=\"1.0\"?><p>ok</p>");
        assertEquals("ok", doc.select("p").text());
    }

    @Test
    public void testTagOpen_letterStartsTagName() {
        Document doc = parseDoc("<span>hi</span>");
        assertEquals("span", doc.select("span").tagName());
    }

    @Test
    public void testTagOpen_nonLetterElseBranchEmitsLiteralLessThan() {
        // default branch, r.matchesLetter() == false -> error + emit('<') + transition(Data)
        Document doc = parseDoc("< foo bar");
        assertEquals("< foo bar", doc.body().text());
        assertTrue(errorCount("< foo bar") >= 1);
    }

    // ===================== EndTagOpen state =====================

    @Test
    public void testEndTagOpen_eofTriggersError() {
        // isEmpty() branch -> eofError + emit("</") + transition(Data)
        assertTrue(errorCount("</") >= 1);
    }

    @Test
    public void testEndTagOpen_letterGoesToTagName() {
        Document doc = parseDoc("</p> ignored <p>y</p>".substring(5)); // just ensure normal end-tag path works
        assertNotNull(doc);
    }

    @Test
    public void testEndTagOpen_closingAngleIsErrorButDoesNotBreakParsing() {
        // matches('>') branch -> error + advanceTransition(Data), no tag emitted
        int errors = errorCount("<p></></p>");
        assertTrue(errors >= 1);
        Document doc = parseDoc("<p></></p>");
        assertEquals("p", doc.select("p").tagName());
    }

    @Test
    public void testEndTagOpen_nonLetterStartsBogusComment() {
        // else branch -> error + advanceTransition(BogusComment)
        int errors = errorCount("</1><p>ok</p>");
        assertTrue(errors >= 1);
        Document doc = parseDoc("</1><p>ok</p>");
        assertEquals("ok", doc.select("p").text());
    }

    // ===================== TagName state =====================

    @Test
    public void testTagName_whitespaceGoesToBeforeAttributeName() {
        Document doc = parseDoc("<div id=\"a\">x</div>");
        assertEquals("a", doc.select("div").attr("id"));
    }

    @Test
    public void testTagName_slashGoesToSelfClosingStartTag() {
        Document doc = parseDoc("<br/>");
        assertNotNull(doc.select("br").first());
    }

    @Test
    public void testTagName_gtEmitsTagAndGoesToData() {
        Document doc = parseDoc("<div>ok</div>");
        assertEquals("ok", doc.select("div").text());
    }

    @Test
    public void testTagName_nullCharAppendsReplacementToName() {
        // nullChar branch: t.tagPending.appendTagName(replacementStr) -- assumes replacementChar == U+FFFD
        Document doc = parseDoc("<di\u0000v>text</di\u0000v>");
        Element el = doc.body().children().first();
        assertNotNull(el);
        assertEquals("di\ufffdv", el.tagName());
    }

    @Test
    public void testTagName_eofBeforeCloseRecordsError() {
        // eof branch -> eofError + transition(Data); no tag pending emitted
        assertTrue(errorCount("<div") >= 1);
        assertNotNull(parseDoc("<div"));
    }

    // ===================== Attribute-related states =====================

    @Test
    public void testAttribute_doubleQuotedValue() {
        Document doc = parseDoc("<div id=\"main\">x</div>");
        assertEquals("main", doc.select("div").attr("id"));
    }

    @Test
    public void testAttribute_singleQuotedValue() {
        Document doc = parseDoc("<div id='main'>x</div>");
        assertEquals("main", doc.select("div").attr("id"));
    }

    @Test
    public void testAttribute_unquotedValue() {
        Document doc = parseDoc("<div id=main>x</div>");
        assertEquals("main", doc.select("div").attr("id"));
    }

    @Test
    public void testAttribute_booleanNoValue() {
        Document doc = parseDoc("<input disabled>");
        assertTrue(doc.select("input").hasAttr("disabled"));
        assertEquals("", doc.select("input").attr("disabled"));
    }

    @Test
    public void testAttribute_unquotedValueWithEntity() {
        // AttributeValue_unquoted '&' branch: consumeCharacterReference success
        Document doc = parseDoc("<a href=\"?a=1&amp;b=2\">x</a>");
        assertEquals("?a=1&b=2", doc.select("a").attr("href"));
    }

    @Test
    public void testAttribute_nullCharInValueRecordsError() {
        int errors = errorCount("<div id=\"a\u0000b\">x</div>");
        assertTrue(errors >= 1);
    }

    @Test
    public void testAttribute_equalsImmediatelyFollowedByGtIsError() {
        // BeforeAttributeValue '>' branch: error + emitTagPending + transition(Data)
        int errors = errorCount("<div a=>x</div>");
        assertTrue(errors >= 1);
        Document doc = parseDoc("<div a=>x</div>");
        assertEquals("div", doc.select("div").tagName());
    }

    @Test
    public void testAttribute_backtickInUnquotedValueIsError() {
        // BeforeAttributeValue default includes '`' -> error branch then AttributeValue_unquoted
        assertTrue(errorCount("<div a=`b`>x</div>") >= 1);
    }

    @Test
    public void testBeforeAttributeName_quoteCharStartsNewAttributeWithError() {
        // BeforeAttributeName: '"' / '\'' / '<' / '=' branch -> error + newAttribute + appendAttributeName(c)
        assertTrue(errorCount("<div \"=1>x</div>") >= 1);
    }

    @Test
    public void testAttributeName_nullCharAppendsReplacementAndErrors() {
        // AttributeName nullChar branch: error + appendAttributeName(replacementChar)
        assertTrue(errorCount("<div a\u0000b=\"1\">x</div>") >= 1);
    }

    @Test
    public void testAfterAttributeName_defaultLetterStartsNewAttribute() {
        Document doc = parseDoc("<div a b=\"2\">x</div>");
        Element el = doc.select("div").first();
        assertTrue(el.hasAttr("a"));
        assertEquals("2", el.attr("b"));
    }

    @Test
    public void testAfterAttributeValueQuoted_missingWhitespaceIsErrorButReparsed() {
        // AfterAttributeValue_quoted default branch: error + unconsume + transition(BeforeAttributeName)
        int errors = errorCount("<div a=\"x\"b=\"y\">z</div>");
        assertTrue(errors >= 1);
        Document doc = parseDoc("<div a=\"x\"b=\"y\">z</div>");
        Element el = doc.select("div").first();
        assertEquals("x", el.attr("a"));
        assertEquals("y", el.attr("b"));
    }

    @Test
    public void testSelfClosingStartTag_invalidCharAfterSlashIsError() {
        // SelfClosingStartTag default branch: error + transition(BeforeAttributeName)
        assertTrue(errorCount("<div/ x>y</div>") >= 1);
    }

    // ===================== MarkupDeclarationOpen / Comment / Doctype =====================

    @Test
    public void testMarkupDeclaration_commentStart() {
        Document doc = parseDoc("<!--c--><p>x</p>");
        assertTrue(doc.outerHtml().contains("c"));
        assertEquals("x", doc.select("p").text());
    }

    @Test
    public void testMarkupDeclaration_doctypeKeyword() {
        Document doc = parseDoc("<!DOCTYPE html><p>x</p>");
        assertTrue(doc.outerHtml().toLowerCase().contains("doctype"));
        assertEquals("x", doc.select("p").text());
    }

    @Test
    public void testMarkupDeclaration_cdataSection() {
        // Per code comment, CDATA handling is NOT namespace-checked, always goes to CdataSection
        Document doc = parseDoc("<svg><![CDATA[hello]]></svg>");
        assertNotNull(doc);
        assertTrue(doc.outerHtml().contains("hello"));
    }

    @Test
    public void testMarkupDeclaration_elseBranchBogusComment() {
        // Doesn't match "--", "DOCTYPE" or "[CDATA[" -> error + advanceTransition(BogusComment)
        int errors = errorCount("<![foo]><p>x</p>");
        assertTrue(errors >= 1);
        Document doc = parseDoc("<![foo]><p>x</p>");
        assertEquals("x", doc.select("p").text());
    }

    @Test
    public void testComment_basicContent() {
        Document doc = parseDoc("<!--hello world-->");
        assertTrue(doc.outerHtml().contains("hello world"));
    }

    @Test
    public void testComment_emptyCommentDoesNotCrash() {
        assertNotNull(parseDoc("<!---->"));
    }

    @Test
    public void testCommentStartDash_prematureGtIsError() {
        // CommentStart '-' -> CommentStartDash; CommentStartDash '>' -> error + emitCommentPending + Data
        assertTrue(errorCount("<!-->after") >= 1);
    }

    @Test
    public void testComment_nullCharRecordsError() {
        assertTrue(errorCount("<!-- a\u0000b -->") >= 1);
    }

    @Test
    public void testComment_unterminatedAtEofRecordsError() {
        assertTrue(errorCount("<!-- unterminated") >= 1);
    }

    @Test
    public void testCommentEnd_bangTransitionsToCommentEndBang() {
        // CommentEnd '!' branch -> error + transition(CommentEndBang)
        assertTrue(errorCount("<!--x--!-->after") >= 1);
    }

    @Test
    public void testCommentEnd_extraDashAppendsAndStaysInCommentEnd() {
        // CommentEnd '-' branch: error-free append '-' (no transition)
        Document doc = parseDoc("<!--x---->after");
        assertNotNull(doc);
    }

    @Test
    public void testDoctype_basicHtml5() {
        Document doc = parseDoc("<!DOCTYPE html><p>x</p>");
        assertTrue(doc.outerHtml().toLowerCase().contains("doctype"));
    }

    @Test
    public void testDoctype_emptyForcesQuirksAndErrors() {
        // Doctype '>' (empty) branch -> error + forceQuirks + emitDoctypePending
        int errors = errorCount("<!DOCTYPE><p>x</p>");
        assertTrue(errors >= 1);
        Document doc = parseDoc("<!DOCTYPE><p>x</p>");
        assertEquals("x", doc.select("p").text());
    }

    @Test
    public void testBeforeDoctypeName_nullCharRecordsErrorAndAppendsReplacement() {
        assertTrue(errorCount("<!DOCTYPE \u0000html><p>x</p>") >= 1);
    }

    @Test
    public void testDoctype_publicIdentifierBranch() {
        String html = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\" "
                + "\"http://www.w3.org/TR/html4/strict.dtd\"><p>x</p>";
        Document doc = parseDoc(html);
        assertEquals("x", doc.select("p").text());
    }

    @Test
    public void testDoctype_systemIdentifierBranch() {
        Document doc = parseDoc("<!DOCTYPE html SYSTEM \"about:legacy-compat\"><p>x</p>");
        assertEquals("x", doc.select("p").text());
    }

    @Test
    public void testAfterDoctypeName_bogusElseBranch() {
        // AfterDoctypeName else branch: not whitespace/'>'/PUBLIC/SYSTEM -> error + forceQuirks + BogusDoctype
        int errors = errorCount("<!DOCTYPE html bogus><p>x</p>");
        assertTrue(errors >= 1);
        Document doc = parseDoc("<!DOCTYPE html bogus><p>x</p>");
        assertEquals("x", doc.select("p").text());
    }

    // ===================== Rcdata / Rawtext / ScriptData / Plaintext =====================

    @Test
    public void testRcdata_title_normalAndEntity() {
        Document doc = parseDoc("<title>My &amp; Title</title>");
        assertEquals("My & Title", doc.title());
    }

    @Test
    public void testRcdataLessThanSign_elseBranchKeepsLiteralLessThan() {
        // '<' inside title not matching "</title" or a diverging start-tag case -> literal '<' kept
        Document doc = parseDoc("<title>a < b</title>");
        assertEquals("a < b", doc.title());
    }

    @Test
    public void testRcdata_nullCharRecordsError() {
        assertTrue(errorCount("<title>a\u0000b</title>") >= 1);
    }

    @Test
    public void testRCDATAEndTagOpen_nonLetterEmitsLiteralSlashes() {
        // RCDATAEndTagOpen else branch: emit("</") and stay in Rcdata
        Document doc = parseDoc("<title>a</1>b</title>");
        assertTrue(doc.title().contains("</1>"));
    }

    @Test
    public void testRCDATAEndTagName_notAppropriateFallsBackToAnythingElse() {
        // Closing tag name mismatches original start tag ("span" vs "title") -> anythingElse() path
        Document doc = parseDoc("<title>x</span>y</title>");
        assertTrue(doc.title().contains("</span>"));
    }

    @Test
    public void testRcdataLessThanSign_divergeBranchWhenNoMatchingCloseTagExists() {
        // Diverge-from-spec branch: start tag letter encountered with no later "</title" anywhere
        // -> implicit close of the pending RCDATA tag. (Best-effort interpretation; exact helper
        // semantics of appropriateEndTagName()/containsIgnoreCase() not shown in given source.)
        Document doc = parseDoc("<title>before<b>after");
        assertEquals("before", doc.title());
    }

    @Test
    public void testRawtext_style_basic() {
        Document doc = parseDoc("<style>.a{color:red}</style>");
        assertTrue(doc.select("style").html().contains("color:red"));
    }

    @Test
    public void testScriptData_basic() {
        Document doc = parseDoc("<script>var a = 1 < 2;</script>");
        assertTrue(doc.select("script").html().contains("var a = 1"));
    }

    @Test
    public void testScriptData_commentEscapeStates() {
        // ScriptDataEscapeStart / ScriptDataEscapeStartDash / ScriptDataEscaped paths
        Document doc = parseDoc("<script><!--alert(1)--></script>");
        assertTrue(doc.select("script").html().contains("alert(1)"));
    }

    @Test
    public void testScriptData_doubleEscapeWithScriptKeywordUsesPrimaryState() {
        // handleDataDoubleEscapeTag: dataBuffer == "script" -> primary (ScriptDataDoubleEscaped)
        Document doc = parseDoc("<script><!--<script>alert(1)</script>--></script>");
        assertTrue(doc.select("script").html().contains("alert(1)"));
    }

    @Test
    public void testScriptData_doubleEscapeFallbackForOtherTagName() {
        // handleDataDoubleEscapeTag: dataBuffer != "script" -> fallback (ScriptDataEscaped)
        Document doc = parseDoc("<script><!--<div>alert(1)</div>--></script>");
        assertTrue(doc.select("script").html().contains("alert(1)"));
    }

    @Test
    public void testPlaintext_consumesRemainderLiterally() {
        // PLAINTEXT default branch: consumeTo(nullChar), no further tag parsing happens
        Document doc = parseDoc("<plaintext>Hello <b>World</b>");
        assertTrue(doc.body().text().contains("<b>World</b>"));
    }
}
```

## สรุปการครอบคลุม Branch/Condition

| กลุ่ม Test method | State ที่ทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| `testData_*` | `Data` | `&`(valid/invalid ref), `<`, `nullChar`, `eof`, default (consumeData) |
| `testTagOpen_*` | `TagOpen` | `!`, `/`, `?`, letter→TagName, else(error+emit `<`) |
| `testEndTagOpen_*` | `EndTagOpen` | `isEmpty`, letter, `matches('>')`, else→BogusComment |
| `testTagName_*` | `TagName` | whitespace, `/`, `>`, `nullChar`, `eof` |
| `testAttribute_*`, `testBeforeAttributeName_*`, `testAttributeName_*`, `testAfterAttributeName_*`, `testAfterAttributeValueQuoted_*`, `testSelfClosingStartTag_*` | Before/After AttributeName, AttributeName, AttributeValue(double/single/unquoted), AfterAttributeValue_quoted, SelfClosingStartTag | whitespace/`/`/`=`/`>`/`nullChar`/`eof`/quote-chars/`` ` ``/entity(`&`)/default(reparse) |
| `testMarkupDeclaration_*` | `MarkupDeclarationOpen` | `--`→Comment, `DOCTYPE`, `[CDATA[`, else→BogusComment |
| `testComment_*`, `testCommentStartDash_*`, `testCommentEnd_*` | `CommentStart/StartDash/Comment/CommentEndDash/CommentEnd/CommentEndBang` | `-`, `nullChar`, `>` early close, `eof`, `!`→EndBang, extra `-` |
| `testDoctype_*`, `testBeforeDoctypeName_*`, `testAfterDoctypeName_*` | `Doctype/BeforeDoctypeName/DoctypeName/AfterDoctypeName` | whitespace, `nullChar`, `eof/>` empty, letter, PUBLIC/SYSTEM/else(bogus) |
| `testRcdata_*`, `testRCDATAEndTagOpen_*`, `testRCDATAEndTagName_*`, `testRcdataLessThanSign_*` | `Rcdata/RcdataLessthanSign/RCDATAEndTagOpen/RCDATAEndTagName` | `&`, `<`(diverge/else), `nullChar`, matchesLetter, appropriate/ไม่appropriate end tag |
| `testRawtext_style_basic` | `Rawtext` (via `readData`) | default consumeToAny path |
| `testScriptData_*` | `ScriptData*` family | plain, comment-escape (`ScriptDataEscapeStart*`), double-escape primary vs fallback (`handleDataDoubleEscapeTag`) |
| `testPlaintext_consumesRemainderLiterally` | `PLAINTEXT` | default branch (consumeTo nullChar) |

**หมายเหตุ/ข้อจำกัดที่ระบุไว้ในคอมเมนต์โค้ด:**
- บาง branch (เช่น `RcdataLessthanSign` diverge branch, `RCDATAEndTagName` ที่พึ่ง `isAppropriateEndTagToken()`/`appropriateEndTagName()`) อ้างอิง helper method ที่ไม่มี body ให้ในซอร์ส จึงทดสอบแบบ best-effort ตาม logic ที่อนุมานได้ และกำกับคอมเมนต์ไว้ชัดเจนว่าเป็นการตีความ
- การทดสอบ `nullChar` หลายจุดเลือกยืนยันแค่ `errorCount >= 1` (ไม่ assert ค่าผลลัพธ์ตัวอักษรที่แน่นอน) เพราะ behavior บางจุดในซอร์ส (เช่น `Data` ไม่แทนที่เป็น replacement char แต่ emit ตัว null ดิบ) อาจกระทบการ normalize ข้อความใน DOM ซึ่งไม่ได้ระบุไว้ในซอร์สที่ให้มา
package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

// import คลาสเป้าหมายตามข้อกำหนด (redundant เพราะอยู่ package เดียวกัน แต่ใส่ไว้ให้ตรงสเปค)
import org.jsoup.parser.TokeniserState;

import static org.junit.Assert.*;

public class TokeniserStateTest {

    // ---------------------------------------------------------------
    // Helper: ค้นหา Comment / DocumentType ที่ตำแหน่งใด ๆ ใน tree
    // (ไม่ fix ตำแหน่งเพราะ HTML5 tree-construction อาจวาง node เหล่านี้
    //  ต่างตำแหน่งกันได้ขึ้นกับ insertion mode)
    // ---------------------------------------------------------------
    private Comment findFirstComment(Node root) {
        if (root instanceof Comment) return (Comment) root;
        for (Node child : root.childNodes()) {
            Comment found = findFirstComment(child);
            if (found != null) return found;
        }
        return null;
    }

    private DocumentType findFirstDocType(Node root) {
        if (root instanceof DocumentType) return (DocumentType) root;
        for (Node child : root.childNodes()) {
            DocumentType found = findFirstDocType(child);
            if (found != null) return found;
        }
        return null;
    }

    // =================================================================
    // 0) Enum sanity (เพื่อยืนยันการ import คลาสเป้าหมายใช้งานได้จริง)
    // =================================================================
    @Test
    public void enum_valuesExistAndValueOfWorks() {
        assertEquals(TokeniserState.Data, TokeniserState.valueOf("Data"));
        assertEquals(TokeniserState.CdataSection, TokeniserState.valueOf("CdataSection"));
        assertTrue(TokeniserState.values().length > 30);
    }

    // =================================================================
    // 1) Data state
    // =================================================================
    @Test
    public void data_plainText_defaultBranch() {
        Document doc = Jsoup.parse("Hello World");
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void data_ampersand_validEntity() {
        Document doc = Jsoup.parse("A &amp; B");
        assertEquals("A & B", doc.body().text());
    }

    @Test
    public void data_ampersand_invalidEntity_keptLiteral() {
        Document doc = Jsoup.parse("A & B");
        assertEquals("A & B", doc.body().text());
    }

    @Test
    public void data_nullChar_notReplaced_perSpecComment() {
        // ตามคอมเมนต์ในซอร์ส: "NOT replacement character (oddly?)"
        Document doc = Jsoup.parse("A\u0000B");
        assertEquals("A\u0000B", doc.body().text());
    }

    @Test
    public void data_lessThan_startsTagOpen() {
        Document doc = Jsoup.parse("<p>Hi</p>");
        assertEquals("Hi", doc.select("p").text());
    }

    @Test
    public void data_emptyInput_eofBranch() {
        Document doc = Jsoup.parse("");
        assertNotNull(doc);
        assertEquals("", doc.body().text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void data_nullInput_throwsException() {
        // สมมติฐาน: Jsoup.parse ใช้ Validate.notNull() -> IllegalArgumentException
        Jsoup.parse((String) null);
    }

    // =================================================================
    // 2) Rcdata (title / textarea) + CharacterReferenceInRcdata
    // =================================================================
    @Test
    public void rcdata_title_defaultText() {
        Document doc = Jsoup.parse("<title>My Title</title>");
        assertEquals("My Title", doc.title());
    }

    @Test
    public void rcdata_entityDecoded() {
        Document doc = Jsoup.parse("<title>A &amp; B</title>");
        assertEquals("A & B", doc.title());
    }

    @Test
    public void rcdata_nullChar_replacedWithReplacementChar() {
        Document doc = Jsoup.parse("<title>A\u0000B</title>");
        assertEquals("A\uFFFDB", doc.title());
    }

    @Test
    public void rcdataLessthanSign_matchingEndTag_closesNormally() {
        Document doc = Jsoup.parse("<textarea>Some &lt;b&gt; text</textarea>");
        Element ta = doc.select("textarea").first();
        assertEquals("Some <b> text", ta.val());
    }

    @Test
    public void rcdataLessthanSign_nonMatchingStartTag_divergeFromSpecBranch() {
        // branch: r.matchesLetter() && !containsIgnoreCase("</title") -> emit end tag ทันที
        Document doc = Jsoup.parse("<title>before<divinside</title>");
        assertTrue(doc.title().startsWith("before"));
    }

    @Test
    public void rcdataEndTagOpen_nonLetter_emitsLiteralSlash() {
        Document doc = Jsoup.parse("<title>abc</1>def</title>");
        assertTrue(doc.title().contains("abc"));
        // NOT SURE: ตำแหน่ง/รูปแบบ literal "</1>" ที่แน่นอนขึ้นกับ RCDATAEndTagName
        assertTrue(doc.title().contains("def"));
    }

    // =================================================================
    // 3) Rawtext (style, xmp)
    // =================================================================
    @Test
    public void rawtext_defaultData() {
        Document doc = Jsoup.parse("<style>body{color:red}</style>");
        assertEquals("body{color:red}", doc.select("style").first().data());
    }

    @Test
    public void rawtext_nullChar_replaced() {
        Document doc = Jsoup.parse("<style>A\u0000B</style>");
        assertEquals("A\uFFFDB", doc.select("style").first().data());
    }

    @Test
    public void rawtextEndTagName_nonMatchingTag_treatedAsText() {
        Document doc = Jsoup.parse("<style>abc</div>stillInStyle</style>");
        assertTrue(doc.select("style").first().data().contains("</div>"));
    }

    // =================================================================
    // 4) ScriptData + Script escape / double-escape states
    // =================================================================
    @Test
    public void scriptData_defaultData() {
        Document doc = Jsoup.parse("<script>var a = 1;</script>");
        assertEquals("var a = 1;", doc.select("script").first().data());
    }

    @Test
    public void scriptData_nullChar_replaced() {
        Document doc = Jsoup.parse("<script>A\u0000B</script>");
        assertEquals("A\uFFFDB", doc.select("script").first().data());
    }

    @Test
    public void scriptDataEndTagName_nonMatchingTag_treatedAsText() {
        Document doc = Jsoup.parse("<script>var a=1;</div>stillInScript</script>");
        assertTrue(doc.select("script").first().data().contains("</div>"));
    }

    @Test
    public void scriptDataEscape_commentWrappedScript_parsesWithoutError() {
        Document doc = Jsoup.parse("<script><!--var a = '<p>';--></script>");
        assertTrue(doc.select("script").first().data().contains("var a"));
    }

    @Test
    public void scriptDataDoubleEscape_nestedScriptWord_smoke() {
        // NOT SURE: พฤติกรรมละเอียดของ double-escape เมื่อคำว่า "script" ปรากฏซ้ำ
        // ทดสอบเพียงว่า parse ผ่านได้โดยไม่ throw exception
        Document doc = Jsoup.parse("<script><!--<script>inner</script>--></script>");
        assertNotNull(doc.select("script").first());
    }

    // =================================================================
    // 5) PLAINTEXT
    // =================================================================
    @Test
    public void plaintext_consumesRestOfDocumentAsText() {
        Document doc = Jsoup.parse("<plaintext>Hello <b>World</b>");
        Element pt = doc.select("plaintext").first();
        assertTrue(pt.text().contains("<b>"));
    }

    @Test
    public void plaintext_nullChar_replaced() {
        Document doc = Jsoup.parse("<plaintext>\u0000Hello");
        Element pt = doc.select("plaintext").first();
        assertTrue(pt.text().startsWith("\uFFFD"));
    }

    // =================================================================
    // 6) TagOpen / EndTagOpen
    // =================================================================
    @Test
    public void tagOpen_bang_marksMarkupDeclaration_comment() {
        Document doc = Jsoup.parse("<!--hello-->");
        Comment c = findFirstComment(doc);
        assertNotNull(c);
        assertEquals("hello", c.getData());
    }

    @Test
    public void tagOpen_questionMark_bogusComment() {
        Document doc = Jsoup.parse("<?xml version=\"1.0\"?><p>ok</p>");
        assertEquals("ok", doc.select("p").text());
    }

    @Test
    public void tagOpen_invalidChar_emitsLiteralLessThan_andStaysInData() {
        Document doc = Jsoup.parse("1 < 2 and 3 > 1");
        assertEquals("1 < 2 and 3 > 1", doc.body().text());
    }

    @Test
    public void endTagOpen_validLetter_createsEndTag() {
        Document doc = Jsoup.parse("<div></div>");
        assertNotNull(doc.select("div").first());
    }

    @Test
    public void endTagOpen_emptyAfterSlash_eofBranch() {
        Document doc = Jsoup.parse("<div></");
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertTrue(div.text().contains("/"));
    }

    @Test
    public void endTagOpen_closingAngleOnly_bogusBranch_ignored() {
        Document doc = Jsoup.parse("<div></>low</div>");
        assertEquals("low", doc.select("div").text());
    }

    @Test
    public void endTagOpen_nonLetterNonAngle_bogusCommentBranch() {
        Document doc = Jsoup.parse("<div></1 bogus>after</div>");
        Comment c = findFirstComment(doc);
        assertNotNull(c);
        assertEquals("1 bogus", c.getData());
    }

    // =================================================================
    // 7) TagName
    // =================================================================
    @Test
    public void tagName_whitespaceBranch_toBeforeAttributeName() {
        Document doc = Jsoup.parse("<div class=\"a\">x</div>");
        assertEquals("a", doc.select("div").first().className());
    }

    @Test
    public void tagName_slashBranch_selfClosing() {
        Document doc = Jsoup.parse("<br/>");
        assertNotNull(doc.select("br").first());
    }

    @Test
    public void tagName_uppercase_lowercased() {
        Document doc = Jsoup.parse("<DIV>test</DIV>");
        assertEquals("test", doc.select("div").text());
    }

    // =================================================================
    // 8) BeforeAttributeName / AttributeName / AfterAttributeName
    // =================================================================
    @Test
    public void beforeAttributeName_defaultLetter_newAttribute() {
        Document doc = Jsoup.parse("<div foo=bar>x</div>");
        assertEquals("bar", doc.select("div").attr("foo"));
    }

    @Test
    public void beforeAttributeName_quoteChar_errorBranch() {
        Document doc = Jsoup.parse("<div \"foo\"=bar>x</div>");
        assertNotNull(doc.select("div").first());
    }

    @Test
    public void beforeAttributeName_nullChar_createsAttrWithReplacementName() {
        // วิเคราะห์จาก code trace: newAttribute() -> unconsume -> AttributeName
        // ทำให้ชื่อ attribute กลายเป็น replacementChar
        Document doc = Jsoup.parse("<div \u0000=val>x</div>");
        Element div = doc.select("div").first();
        assertTrue(div.hasAttr("\uFFFD"));
        assertEquals("val", div.attr("\uFFFD"));
    }

    @Test
    public void attributeName_doubleQuotedValue() {
        Document doc = Jsoup.parse("<div foo=\"bar\">x</div>");
        assertEquals("bar", doc.select("div").attr("foo"));
    }

    @Test
    public void attributeName_noValue_booleanAttribute() {
        Document doc = Jsoup.parse("<input disabled>");
        assertTrue(doc.select("input").first().hasAttr("disabled"));
    }

    @Test
    public void afterAttributeName_multipleBooleanAttributes_defaultBranchLoop() {
        Document doc = Jsoup.parse("<input a b c>");
        Element input = doc.select("input").first();
        assertTrue(input.hasAttr("a"));
        assertTrue(input.hasAttr("b"));
        assertTrue(input.hasAttr("c"));
    }

    @Test
    public void afterAttributeName_equalsBranch() {
        Document doc = Jsoup.parse("<div foo = bar>x</div>");
        assertEquals("bar", doc.select("div").attr("foo"));
    }

    @Test
    public void afterAttributeName_slashBranch_selfClosing_smoke() {
        Document doc = Jsoup.parse("<br foo />");
        assertNotNull(doc.select("br").first());
    }

    // =================================================================
    // 9) BeforeAttributeValue / AttributeValue_* / AfterAttributeValue_quoted
    // =================================================================
    @Test
    public void beforeAttributeValue_doubleQuote() {
        Document doc = Jsoup.parse("<div foo=\"bar\">x</div>");
        assertEquals("bar", doc.select("div").attr("foo"));
    }

    @Test
    public void beforeAttributeValue_singleQuote() {
        Document doc = Jsoup.parse("<div foo='bar'>x</div>");
        assertEquals("bar", doc.select("div").attr("foo"));
    }

    @Test
    public void beforeAttributeValue_ampersand_unconsumeBranch() {
        Document doc = Jsoup.parse("<div foo=&amp;>x</div>");
        assertEquals("&", doc.select("div").attr("foo"));
    }

    @Test
    public void beforeAttributeValue_closingAngle_emptyValue() {
        Document doc = Jsoup.parse("<div foo=>x</div>");
        Element div = doc.select("div").first();
        assertTrue(div.hasAttr("foo"));
        assertEquals("", div.attr("foo"));
    }

    @Test
    public void beforeAttributeValue_backtick_literalErrorBranch() {
        Document doc = Jsoup.parse("<div foo=`bar`>x</div>");
        assertEquals("`bar`", doc.select("div").attr("foo"));
    }

    @Test
    public void beforeAttributeValue_eof_noValue_smoke() {
        Document doc = Jsoup.parse("<div foo=");
        assertNotNull(doc);
    }

    @Test
    public void attributeValueDoubleQuoted_entityDecoded() {
        Document doc = Jsoup.parse("<div foo=\"a&amp;b\">x</div>");
        assertEquals("a&b", doc.select("div").attr("foo"));
    }

    @Test
    public void attributeValueDoubleQuoted_invalidEntity_keptLiteral() {
        Document doc = Jsoup.parse("<div foo=\"a&b\">x</div>");
        assertEquals("a&b", doc.select("div").attr("foo"));
    }

    @Test
    public void attributeValueDoubleQuoted_eofUnterminated() {
        Document doc = Jsoup.parse("<div foo=\"bar");
        assertEquals("bar", doc.select("div").attr("foo"));
    }

    @Test
    public void attributeValueSingleQuoted_nullCharReplaced() {
        Document doc = Jsoup.parse("<div foo='a\u0000b'>x</div>");
        assertEquals("a\uFFFDb", doc.select("div").attr("foo"));
    }

    @Test
    public void attributeValueUnquoted_basic() {
        Document doc = Jsoup.parse("<div foo=bar>x</div>");
        assertEquals("bar", doc.select("div").attr("foo"));
    }

    @Test
    public void attributeValueUnquoted_ampersandEntity() {
        Document doc = Jsoup.parse("<div foo=a&amp;b>x</div>");
        assertEquals("a&b", doc.select("div").attr("foo"));
    }

    @Test
    public void attributeValueUnquoted_equalsSignLiteralErrorBranch() {
        Document doc = Jsoup.parse("<div foo=a=b>x</div>");
        assertEquals("a=b", doc.select("div").attr("foo"));
    }

    @Test
    public void attributeValueUnquoted_multipleAttributes_whitespaceTransition() {
        Document doc = Jsoup.parse("<div foo=bar baz=qux>x</div>");
        assertEquals("bar", doc.select("div").attr("foo"));
        assertEquals("qux", doc.select("div").attr("baz"));
    }

    @Test
    public void afterAttributeValueQuoted_whitespaceBranch_multipleAttrs() {
        Document doc = Jsoup.parse("<div foo=\"bar\" baz=\"qux\">x</div>");
        assertEquals("bar", doc.select("div").attr("foo"));
        assertEquals("qux", doc.select("div").attr("baz"));
    }

    @Test
    public void afterAttributeValueQuoted_defaultBranch_noWhitespace() {
        Document doc = Jsoup.parse("<div foo=\"bar\"baz=\"qux\">x</div>");
        Element div = doc.select("div").first();
        assertEquals("bar", div.attr("foo"));
        assertEquals("qux", div.attr("baz"));
    }

    @Test
    public void afterAttributeValueQuoted_slashBranch_selfClosing() {
        Document doc = Jsoup.parse("<br foo=\"bar\"/>");
        assertEquals("bar", doc.select("br").attr("foo"));
    }

    @Test
    public void afterAttributeValueQuoted_eof_smoke() {
        Document doc = Jsoup.parse("<div foo=\"bar\"");
        assertNotNull(doc.select("div").first());
    }

    // =================================================================
    // 10) SelfClosingStartTag
    // =================================================================
    @Test
    public void selfClosingStartTag_closingAngle_setsSelfClosing() {
        Document doc = Jsoup.parse("<br/>after");
        assertNotNull(doc.select("br").first());
    }

    @Test
    public void selfClosingStartTag_invalidChar_defaultBranch_smoke() {
        Document doc = Jsoup.parse("<br/x>after");
        assertNotNull(doc.select("br").first());
    }

    // =================================================================
    // 11) MarkupDeclarationOpen / BogusComment / CdataSection
    // =================================================================
    @Test
    public void markupDeclarationOpen_unknown_bogusCommentBranch_smoke() {
        Document doc = Jsoup.parse("<!randomtext>after");
        assertNotNull(doc);
    }

    @Test
    public void cdataSection_consumedAsText() {
        Document doc = Jsoup.parse("<![CDATA[hello]]>");
        assertTrue(doc.body().text().contains("hello") || doc.html().contains("hello"));
    }

    // =================================================================
    // 12) CommentStart / CommentStartDash (**รวมจุดที่พบ fault จริง**)
    // =================================================================
    @Test
    public void commentStart_defaultChar_appendsAndTransitionsToComment() {
        Document doc = Jsoup.parse("<!--hello-->after");
        Comment c = findFirstComment(doc);
        assertNotNull(c);
        assertEquals("hello", c.getData());
    }

    @Test
    public void commentStart_nullChar_appendsReplacementChar() {
        Document doc = Jsoup.parse("<!--\u0000-->after");
        Comment c = findFirstComment(doc);
        assertNotNull(c);
        assertTrue(c.getData().startsWith("\uFFFD"));
    }

    @Test
    public void commentStart_closingAngle_emptyComment() {
        Document doc = Jsoup.parse("<!-->after");
        Comment c = findFirstComment(doc);
        assertNotNull(c);
        assertEquals("", c.getData());
    }

    @Test
    public void commentStart_eof_emitsCommentPending() {
        Document doc = Jsoup.parse("<!--");
        Comment c = findFirstComment(doc);
        assertNotNull(c);
        assertEquals("", c.getData());
    }

    @Test
    public void commentStartDash_defaultChar_appendsAndTransitionsToComment() {
        Document doc = Jsoup.parse("<!---X-->after");
        Comment c = findFirstComment(doc);
        assertNotNull(c);
        assertEquals("X", c.getData());
    }

    @Test
    public void commentStartDash_nullChar_appendsReplacementChar() {
        Document doc = Jsoup.parse("<!---\u0000-->after");
        Comment c = findFirstComment(doc);
        assertNotNull(c);
        assertTrue(c.getData().startsWith("\uFFFD"));
    }

    @Test
    public void commentStartDash_closingAngle_emptyComment() {
        Document doc = Jsoup.parse("<!--->after");
        Comment c = findFirstComment(doc);
        assertNotNull(c);
        assertEquals("", c.getData());
    }

    @Test
    public void commentStartDash_eof_emitsCommentPending() {
        Document doc = Jsoup.parse("<!---");
        Comment c = findFirstComment(doc);
        assertNotNull(c);
        assertEquals("", c.getData());
    }

    /**
     * *** FAULT-DETECTING TEST ***
     * วิเคราะห์ซอร์ส: CommentStartDash.case('-') -> t.transition(CommentStartDash)
     * ซึ่ง "ควร" จะเป็น t.transition(CommentEnd) ตาม HTML5 spec
     * ผลคือ เมื่อมีขีดกลางต่อเนื่องหลาย "-" ในช่วงเริ่มคอมเมนต์ ตัวอักษร '-'
     * บางตัวจะถูก "กลืน" ไปโดยไม่ถูก append เข้า comment data -> comment data ผิดพลาด
     *
     * "<!----->"  (5 dashes) ตาม HTML5 ควรได้ comment data = "-"
     * แต่ถ้ามี bug ตามซอร์สที่ให้มา จะได้ comment data = "" (ขีดกลางหาย)
     */
    @Test
    public void commentStartDash_consecutiveDashes_dataPreserved_FAULT_DETECTING() {
        Document doc = Jsoup.parse("<!----->after");
        Comment c = findFirstComment(doc);
        assertNotNull("ควรพบ comment node", c);
        assertEquals("-", c.getData());
    }

    @Test
    public void commentStartDash_minimalEmptyComment_boundary() {
        Document doc = Jsoup.parse("<!---->after");
        Comment c = findFirstComment(doc);
        assertNotNull(c);
        assertEquals("", c.getData());
    }

    // =================================================================
    // 13) Comment / CommentEndDash / CommentEnd / CommentEndBang
    // =================================================================
    @Test
    public void comment_nullChar_inBody_replaced() {
        Document doc = Jsoup.parse("<!--a\u0000b-->after");
        Comment c = findFirstComment(doc);
        assertNotNull(c);
        assertEquals("a\uFFFDb", c.getData());
    }

    @Test
    public void commentEnd_bangBranch_commentEndBangState() {
        Document doc = Jsoup.parse("<!--abc--!>after");
        Comment c = findFirstComment(doc);
        assertNotNull(c);
        // NOT SURE: เนื้อหาสุดท้ายขึ้นกับ transition ของ CommentEndBang -> smoke check
        assertTrue(c.getData().startsWith("abc"));
    }

    @Test
    public void commentEnd_extraDash_literalAppended() {
        Document doc = Jsoup.parse("<!--abc---->after");
        Comment c = findFirstComment(doc);
        assertNotNull(c);
        assertTrue(c.getData().startsWith("abc"));
    }

    // =================================================================
    // 14) Doctype states
    // =================================================================
    @Test
    public void doctype_simple_nameOnly() {
        Document doc = Jsoup.parse("<!DOCTYPE html><p>x</p>");
        DocumentType dt = findFirstDocType(doc);
        assertNotNull(dt);
        assertEquals("html", dt.attr("name"));
    }

    @Test
    public void doctype_publicAndSystemIdentifiers() {
        String html = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\" "
                + "\"http://www.w3.org/TR/html4/strict.dtd\">";
        Document doc = Jsoup.parse(html);
        DocumentType dt = findFirstDocType(doc);
        assertNotNull(dt);
        // NOT SURE 100%: key casing ("publicId"/"systemId") อ้างจากโครงสร้าง DocumentType ของ jsoup
        assertEquals("-//W3C//DTD HTML 4.01//EN", dt.attr("publicId"));
        assertEquals("http://www.w3.org/TR/html4/strict.dtd", dt.attr("systemId"));
    }

    @Test
    public void doctype_systemOnly() {
        String html = "<!DOCTYPE html SYSTEM \"http://example.com/dtd\">";
        Document doc = Jsoup.parse(html);
        DocumentType dt = findFirstDocType(doc);
        assertNotNull(dt);
        assertEquals("http://example.com/dtd", dt.attr("systemId"));
    }

    @Test
    public void doctype_malformed_bogusDoctypeBranch_smoke() {
        Document doc = Jsoup.parse("<!DOCTYPE html GARBAGE>after");
        assertNotNull(doc);
    }

    @Test
    public void doctype_eofRightAfterKeyword_forceQuirks_smoke() {
        Document doc = Jsoup.parse("<!DOCTYPE");
        assertNotNull(doc);
    }

    @Test
    public void doctype_nameWithNullChar_replaced() {
        Document doc = Jsoup.parse("<!DOCTYPE \u0000html>");
        DocumentType dt = findFirstDocType(doc);
        assertNotNull(dt);
        assertTrue(dt.attr("name").startsWith("\uFFFD"));
    }
}

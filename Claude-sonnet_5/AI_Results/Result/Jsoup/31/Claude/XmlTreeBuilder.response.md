# วิเคราะห์

`XmlTreeBuilder` เป็น package-private/protected class ที่ทำงานร่วมกับ `TreeBuilder` (parent class) ซึ่งไม่ได้ให้ซอร์สมา แต่มี method `parse(String input, String baseUri)` ที่สืบทอดมา (เป็น API มาตรฐานของ jsoup ในเวอร์ชันนี้) ซึ่งจำเป็นต้องใช้เพื่อเรียก `initialiseParse()` และ `process()` ผ่าน `runParser()` — **หมายเหตุ: ส่วนนี้ไม่ได้อยู่ในซอร์สที่ให้มา แต่เป็น entry point เดียวที่ทำให้ทดสอบ logic ภายในได้ จึงต้องอิงจาก jsoup public behavior ที่รู้จักทั่วไป**

เนื่องจาก test class ต้องเข้าถึง package-private members จึงต้องอยู่ใน package `org.jsoup.parser` เดียวกัน

```java
package org.jsoup.parser;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link XmlTreeBuilder}.
 *
 * หมายเหตุสำคัญ:
 * - XmlTreeBuilder ไม่มี public entry point ของตัวเอง การทดสอบ process()/insert() จึงต้องผ่าน
 *   method parse(String, String) ที่สืบทอดมาจาก TreeBuilder (ไม่ได้อยู่ในซอร์สที่ให้มา)
 *   แต่เป็น API มาตรฐานของ jsoup ที่จำเป็นต่อการ trigger initialiseParse()/runParser()/process()
 * - สมมติฐานเรื่อง exception type ของ Validate.notNull() คือ IllegalArgumentException
 *   ตาม behavior มาตรฐานของ jsoup Validate class (ไม่ได้ยืนยันจากซอร์สที่ให้มาโดยตรง)
 * - สมมติฐานเรื่อง DocumentType เก็บค่าผ่าน attr("name"/"publicId"/"systemId")
 *   ตาม jsoup DocumentType implementation ทั่วไป (ไม่ได้ยืนยันจากซอร์สที่ให้มาโดยตรง)
 * - switch-case "default" ใน process() ไม่สามารถทดสอบได้ด้วย input ปกติ เพราะ Token.TokenType
 *   enum (ไม่มีซอร์สให้) ไม่มีค่าอื่นเกินกว่า case ที่ระบุไว้แล้ว (dead code ตาม design)
 */
public class XmlTreeBuilderTest {

    private XmlTreeBuilder xmlTreeBuilder;

    @Before
    public void setUp() {
        xmlTreeBuilder = new XmlTreeBuilder();
    }

    // ---------- Null / Boundary ----------

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullInputThrows() {
        xmlTreeBuilder.parse(null, "http://example.com/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullBaseUriThrows() {
        xmlTreeBuilder.parse("<foo></foo>", null);
    }

    @Test
    public void testParseEmptyInputReturnsEmptyDocument() {
        Document doc = xmlTreeBuilder.parse("", "http://example.com/");
        assertNotNull(doc);
        assertEquals(0, doc.childNodes().size());
    }

    @Test
    public void testParseEmptyBaseUriDoesNotThrow() {
        // สมมติว่ามีเพียง notNull check ไม่มี notEmpty check สำหรับ baseUri
        Document doc = xmlTreeBuilder.parse("<foo/>", "");
        assertNotNull(doc);
    }

    @Test
    public void testParseWhitespaceOnlyCharacterData() {
        Document doc = xmlTreeBuilder.parse("   ", "http://example.com/");
        assertEquals(1, doc.childNodes().size());
        assertTrue(doc.childNode(0) instanceof TextNode);
    }

    // ---------- Basic element / text (StartTag, EndTag, Character) ----------

    @Test
    public void testParseSimpleElementWithText() {
        Document doc = xmlTreeBuilder.parse("<foo>Hello</foo>", "http://example.com/");
        assertEquals(1, doc.children().size());
        Element foo = doc.child(0);
        assertEquals("foo", foo.tagName());
        assertEquals("Hello", foo.text());
    }

    // ---------- insert(StartTag): isSelfClosing() true/false branch ----------

    @Test
    public void testSelfClosingTagNotPushedToStack() {
        // ถ้า isSelfClosing()==true -> ไม่ stack.add(el) -> sibling ถัดไปเป็น child ของ doc ไม่ใช่ของ tag นี้
        Document doc = xmlTreeBuilder.parse("<brx/>text", "http://example.com/");
        assertEquals(2, doc.childNodeSize());
    }

    @Test
    public void testNonSelfClosingTagPushedToStack() {
        // ถ้า isSelfClosing()==false -> stack.add(el) -> content ถัดไปเป็น child ของ tag นี้
        Document doc = xmlTreeBuilder.parse("<foo><bar></bar></foo>", "http://example.com/");
        Element foo = doc.child(0);
        assertEquals(1, foo.children().size());
        assertEquals("bar", foo.child(0).tagName());
    }

    // ---------- insert(StartTag): tag.isKnownTag() branch (setSelfClosing) ----------

    @Test
    public void testKnownNonEmptyTagSelfClosingDoesNotSetFlag() {
        // "div" เป็น known HTML tag ที่ไม่ใช่ empty/self-closing element โดย default
        // เมื่อ isKnownTag()==true จึงไม่ควรเรียก tag.setSelfClosing()
        Document doc = xmlTreeBuilder.parse("<div/>", "http://example.com/");
        Element el = doc.child(0);
        assertFalse(el.tag().isSelfClosing());
    }

    @Test
    public void testUnknownTagSelfClosingSetsFlag() {
        // tag ชื่อ unique ที่ไม่ใช่ known HTML tag -> isKnownTag()==false -> setSelfClosing() ถูกเรียก
        Document doc = xmlTreeBuilder.parse("<uniqueUnknownTagA/>", "http://example.com/");
        Element el = doc.child(0);
        assertTrue(el.tag().isSelfClosing());
    }

    @Test
    public void testUnknownTagNotSelfClosedFlagRemainsFalse() {
        Document doc = xmlTreeBuilder.parse("<uniqueUnknownTagB></uniqueUnknownTagB>", "http://example.com/");
        Element el = doc.child(0);
        assertFalse(el.tag().isSelfClosing());
    }

    // ---------- insert(Comment) ----------

    @Test
    public void testCommentContent() {
        Document doc = xmlTreeBuilder.parse("<!--hello-->", "http://example.com/");
        Node node = doc.childNode(0);
        assertTrue(node instanceof Comment);
        assertEquals("hello", ((Comment) node).getData());
    }

    // ---------- insert(Doctype) ----------

    @Test
    public void testDoctypeSimple() {
        Document doc = xmlTreeBuilder.parse("<!DOCTYPE html>", "http://example.com/");
        Node node = doc.childNode(0);
        assertTrue(node instanceof DocumentType);
    }

    @Test
    public void testDoctypeWithPublicAndSystemId() {
        String xml = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" "
                + "\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">";
        Document doc = xmlTreeBuilder.parse(xml, "http://example.com/");
        Node node = doc.childNode(0);
        assertTrue(node instanceof DocumentType);
        DocumentType dt = (DocumentType) node;
        // สมมติฐาน: DocumentType เก็บค่าผ่าน attr(...) ตาม jsoup implementation ทั่วไป
        assertEquals("html", dt.attr("name"));
        assertFalse(dt.attr("publicId").isEmpty());
        assertFalse(dt.attr("systemId").isEmpty());
    }

    // ---------- popStackToClose: not found / immediate match / multiple removal ----------

    @Test
    public void testPopStackToCloseNotFoundSkips() {
        // </bar> ไม่มี start tag คู่ -> ถูก skip โดยไม่ throw, การ parse ที่เหลือยังสมบูรณ์
        Document doc = xmlTreeBuilder.parse("<foo></bar></foo>", "http://example.com/");
        assertEquals(1, doc.childNodeSize());
        Element foo = doc.child(0);
        assertEquals("foo", foo.tagName());
        assertTrue(foo.childNodes().isEmpty());
    }

    @Test
    public void testPopStackToCloseImmediateMatch() {
        // </bar> ตรงกับ element บนสุดของ stack ทันที -> loop ที่สอง match ตั้งแต่รอบแรก (if-branch)
        Document doc = xmlTreeBuilder.parse("<foo><bar></bar></foo>", "http://example.com/");
        Element foo = doc.child(0);
        assertEquals(1, foo.children().size());
        assertEquals("bar", foo.child(0).tagName());
        assertTrue(foo.child(0).children().isEmpty());
    }

    @Test
    public void testPopStackToCloseMultipleRemoval() {
        // </foo> ปิดทั้ง baz, bar (ที่ไม่ได้ปิดเอง) และ foo เอง
        // ครอบคลุม else-branch ของ loop ที่สอง (it.remove() หลายรอบก่อนเจอ firstFound)
        Document doc = xmlTreeBuilder.parse("<foo><bar><baz></foo>", "http://example.com/");
        Element foo = doc.child(0);
        assertEquals("foo", foo.tagName());
        assertEquals(1, foo.children().size());
        Element bar = foo.child(0);
        assertEquals("bar", bar.tagName());
        assertEquals(1, bar.children().size());
        assertEquals("baz", bar.child(0).tagName());
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testParseNullInputThrows | `initialiseParse`: input == null → throw (ตามสมมติฐาน Validate.notNull) |
| testParseNullBaseUriThrows | `initialiseParse`: baseUri == null → throw |
| testParseEmptyInputReturnsEmptyDocument | input ว่าง → ไม่มี token นอกจาก EOF, `case EOF` ใน `process()` |
| testParseEmptyBaseUriDoesNotThrow | baseUri ว่าง ไม่ throw (boundary) |
| testParseWhitespaceOnlyCharacterData | `case Character` → `insert(Token.Character)` |
| testParseSimpleElementWithText | `case StartTag`/`case EndTag`/`case Character` ทำงานร่วมกัน |
| testSelfClosingTagNotPushedToStack | `insert(StartTag)`: `startTag.isSelfClosing() == true` → else branch (`stack.add`) ไม่ถูกเรียก |
| testNonSelfClosingTagPushedToStack | `insert(StartTag)`: `isSelfClosing() == false` → `stack.add(el)` ถูกเรียก |
| testKnownNonEmptyTagSelfClosingDoesNotSetFlag | `if (!tag.isKnownTag())` → false branch (ไม่เรียก setSelfClosing) |
| testUnknownTagSelfClosingSetsFlag | `if (!tag.isKnownTag())` → true branch (เรียก setSelfClosing) |
| testUnknownTagNotSelfClosedFlagRemainsFalse | baseline เปรียบเทียบ (ไม่ self-closing) |
| testCommentContent | `case Comment` → `insert(Token.Comment)` |
| testDoctypeSimple | `case Doctype` → `insert(Token.Doctype)` (ไม่มี public/system id) |
| testDoctypeWithPublicAndSystemId | `insert(Token.Doctype)` พร้อม publicId/systemId ไม่ null |
| testPopStackToCloseNotFoundSkips | `popStackToClose`: `firstFound == null` → return (skip) |
| testPopStackToCloseImmediateMatch | `popStackToClose`: loop ที่สอง match ทันที → if-branch, ไม่เข้า else |
| testPopStackToCloseMultipleRemoval | `popStackToClose`: loop ที่สอง เข้า else-branch (`it.remove()`) หลายรอบก่อนเจอ `firstFound` |

**หมายเหตุ:** case `default` ใน `process()` (Validate.fail) ไม่สามารถทดสอบได้ด้วย input XML ปกติ เนื่องจากไม่มีซอร์สของ `Token.TokenType` enum ยืนยันว่ามีค่าอื่นเกินกว่า case ที่ระบุไว้ — จึงถือเป็น dead code ที่ไม่ครอบคลุมในชุดทดสอบนี้
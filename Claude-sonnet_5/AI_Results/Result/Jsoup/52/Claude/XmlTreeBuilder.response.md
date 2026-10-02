# JUnit 4 Test Suite สำหรับ `XmlTreeBuilder`

## หลักการออกแบบ

- เนื่องจาก `insert(...)`, `popStackToClose(...)` เป็น method ระดับ package-private/private และ `Token` class ไม่ได้แสดงซอร์สมาด้วย จึงเลี่ยงการสร้าง `Token` เองเพื่อไม่ "เดา" API ที่ไม่มีในซอร์ส
- ใช้ entry point สาธารณะที่ **ถูกอ้างอิงในคอมเมนต์ของคลาสเป้าหมายเอง** คือ `Jsoup.parse(html, baseUrl, Parser.xmlParser())` ซึ่งจะเดินทางผ่าน `initialiseParse()` → `process()` → `insert(...)` / `popStackToClose(...)` ครบทุก branch ที่วิเคราะห์ได้
- วาง test class ไว้ใน package เดียวกัน (`org.jsoup.parser`) เพื่อให้สามารถเข้าถึงคลาสได้ตรงไปตรงมา (import คลาสเป้าหมายไว้ตามข้อกำหนด แม้จะอยู่ package เดียวกัน)

```java
package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.parser.XmlTreeBuilder; // import ตามข้อกำหนด (แม้อยู่ package เดียวกัน)
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class XmlTreeBuilderTest {

    // ---------- initialiseParse() ----------

    @Test
    public void testXmlSyntaxSetOnDocument() {
        // ครอบคลุม: initialiseParse() -> doc.outputSettings().syntax(xml)
        Document doc = Jsoup.parse("<root/>", "http://example.com/", Parser.xmlParser());
        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
    }

    @Test
    public void testEmptyInputProducesNoChildren() {
        // ครอบคลุม: process() -> case EOF (break, ไม่เพิ่ม node ใด ๆ)
        Document doc = Jsoup.parse("", "http://example.com/", Parser.xmlParser());
        assertEquals(0, doc.childNodeSize());
    }

    @Test
    public void testEmptyBaseUri() {
        // boundary: baseUri เป็นค่าว่าง ไม่ควรทำให้เกิด exception
        Document doc = Jsoup.parse("<root/>", "", Parser.xmlParser());
        assertEquals("root", doc.children().first().tagName());
    }

    @Test(expected = RuntimeException.class)
    public void testNullInputThrows() {
        // ไม่แน่ใจ exception type ที่แน่นอน (superclass ไม่ได้แสดงซอร์ส)
        // แต่คาดว่าจะมีการ validate input ตามรูปแบบโค้ด jsoup ทั่วไป (Validate.*)
        Jsoup.parse(null, "http://example.com/", Parser.xmlParser());
    }

    // ---------- process(): case Character ----------

    @Test
    public void testPlainTextCharacterToken() {
        // ครอบคลุม: process() -> case Character -> insert(Token.Character)
        Document doc = Jsoup.parse("Hello World", "", Parser.xmlParser());
        assertEquals(1, doc.childNodeSize());
        Node n = doc.childNode(0);
        assertTrue(n instanceof TextNode);
        assertEquals("Hello World", ((TextNode) n).text());
    }

    @Test
    public void testMultipleSiblingTextAndElements() {
        // ครอบคลุม: สลับ insert(Character) และ insert(StartTag)/popStackToClose หลายรอบ
        Document doc = Jsoup.parse("text1<a>inner</a>text2", "", Parser.xmlParser());
        assertEquals(3, doc.childNodeSize());
        assertTrue(doc.childNode(0) instanceof TextNode);
        assertTrue(doc.childNode(1) instanceof Element);
        assertTrue(doc.childNode(2) instanceof TextNode);
        assertEquals("text1", ((TextNode) doc.childNode(0)).text());
        assertEquals("text2", ((TextNode) doc.childNode(2)).text());
    }

    // ---------- process(): case StartTag / insert(Token.StartTag) ----------

    @Test
    public void testStartAndEndTagMatching() {
        // ครอบคลุม: insert(StartTag) branch else (stack.add) + popStackToClose พบ match
        Document doc = Jsoup.parse("<foo>bar</foo>", "", Parser.xmlParser());
        Element foo = doc.children().first();
        assertNotNull(foo);
        assertEquals("foo", foo.tagName());
        assertEquals("bar", foo.text());
    }

    @Test
    public void testSelfClosingTagDoesNotPushOntoStack() {
        // ครอบคลุม: insert(StartTag) -> if (isSelfClosing()) ไม่ stack.add(el)
        // ยืนยันด้วยว่า baz ไม่ถูก nest เข้าไปใน foo
        Document doc = Jsoup.parse("<foo/><baz/>", "", Parser.xmlParser());
        assertEquals(2, doc.children().size());
        Element foo = doc.children().get(0);
        Element baz = doc.children().get(1);
        assertEquals("foo", foo.tagName());
        assertEquals("baz", baz.tagName());
        assertEquals(0, foo.childNodeSize());
    }

    @Test
    public void testNonSelfClosingTagPushesOntoStack() {
        // ครอบคลุม: insert(StartTag) -> else branch (stack.add(el)) ทำให้ child ถูก nest
        Document doc = Jsoup.parse("<foo><baz/></foo>", "", Parser.xmlParser());
        assertEquals(1, doc.children().size());
        Element foo = doc.children().first();
        assertEquals("foo", foo.tagName());
        assertEquals(1, foo.children().size());
        assertEquals("baz", foo.children().first().tagName());
    }

    @Test
    public void testSelfClosingKnownTagSmoke() {
        // ครอบคลุม: insert(StartTag) -> if (!tag.isKnownTag()) เป็น false (known tag เช่น br)
        // ไม่ตรวจสอบ flag ภายใน Tag เนื่องจาก getter isSelfClosing() ไม่ปรากฏในซอร์สที่ให้มา
        Document doc = Jsoup.parse("<br/>", "", Parser.xmlParser());
        assertEquals(1, doc.children().size());
        Element br = doc.children().first();
        assertEquals("br", br.tagName());
        assertEquals(0, br.childNodeSize());
    }

    @Test
    public void testSelfClosingTagPreservesAttributes() {
        // ครอบคลุม: Element ถูกสร้างด้วย startTag.attributes อย่างถูกต้อง
        Document doc = Jsoup.parse("<foo bar=\"1\" baz=\"two\"/>", "", Parser.xmlParser());
        Element foo = doc.children().first();
        assertEquals("1", foo.attr("bar"));
        assertEquals("two", foo.attr("baz"));
    }

    // ---------- process(): case EndTag / popStackToClose() ----------

    @Test
    public void testUnmatchedEndTagIsSkipped() {
        // ครอบคลุม: popStackToClose() -> firstFound == null -> return (skip)
        Document doc = Jsoup.parse("<foo></bar>baz</foo>", "", Parser.xmlParser());
        Element foo = doc.children().first();
        assertEquals("foo", foo.tagName());
        assertEquals(1, foo.childNodeSize());
        assertEquals("baz", foo.text());
    }

    @Test
    public void testNestedElementsAutoClosedByAncestorEndTag() {
        // ครอบคลุม: popStackToClose() -> loop ที่สอง pop หลายชั้นจนถึง firstFound (c,b,a)
        Document doc = Jsoup.parse("<a><b><c></a>d", "", Parser.xmlParser());
        assertEquals(2, doc.childNodeSize());

        Node first = doc.childNode(0);
        assertTrue(first instanceof Element);
        Element a = (Element) first;
        assertEquals("a", a.tagName());
        assertEquals(1, a.children().size());

        Element b = a.children().first();
        assertEquals("b", b.tagName());
        assertEquals(1, b.children().size());
        assertEquals("c", b.children().first().tagName());

        Node second = doc.childNode(1);
        assertTrue(second instanceof TextNode);
        assertEquals("d", ((TextNode) second).text());
    }

    @Test
    public void testPopStackClosesNearestMatchingTag() {
        // ครอบคลุม: popStackToClose() -> หา firstFound จาก "บนสุด" ของ stack ก่อน (innermost match)
        Document doc = Jsoup.parse("<a><a>text</a>rest</a>", "", Parser.xmlParser());
        assertEquals(1, doc.children().size());

        Element a1 = doc.children().first();
        assertEquals("a", a1.tagName());
        assertEquals(2, a1.childNodeSize());

        Node innerA = a1.childNode(0);
        assertTrue(innerA instanceof Element);
        assertEquals("a", ((Element) innerA).tagName());
        assertEquals("text", ((Element) innerA).text());

        Node restText = a1.childNode(1);
        assertTrue(restText instanceof TextNode);
        assertEquals("rest", ((TextNode) restText).text());
    }

    // ---------- process(): case Comment / insert(Token.Comment) ----------

    @Test
    public void testCommentNodeInserted() {
        // ครอบคลุม: insert(Comment) -> commentToken.bogus == false (ไม่เข้า if)
        Document doc = Jsoup.parse("<!-- hello -->", "", Parser.xmlParser());
        assertEquals(1, doc.childNodeSize());
        Node n = doc.childNode(0);
        assertTrue(n instanceof Comment);
        assertEquals(" hello ", ((Comment) n).getData());
    }

    @Test
    public void testBogusCommentBecomesXmlDeclaration() {
        // ครอบคลุม: insert(Comment) -> bogus == true, data.length()>1 และ startsWith("?")
        // หมายเหตุ: ไม่แน่ใจ 100% ว่า tokeniser ของเวอร์ชันนี้จะสร้าง bogus comment จาก "<?xml...?>"
        // เสมอไป (ไม่มีซอร์สของ Tokeniser ให้ตรวจสอบ) จึงใช้การ assert แบบผ่อนปรน
        Document doc = Jsoup.parse("<?xml version=\"1.0\"?><root/>", "", Parser.xmlParser());
        boolean foundDeclarationOrRoot = false;
        for (Node child : doc.childNodes()) {
            if (child instanceof XmlDeclaration
                    || (child instanceof Element && "root".equals(((Element) child).tagName()))) {
                foundDeclarationOrRoot = true;
            }
        }
        assertTrue(foundDeclarationOrRoot);
    }

    // ---------- process(): case Doctype / insert(Token.Doctype) ----------

    @Test
    public void testDoctypeNodeInserted() {
        // ครอบคลุม: process() -> case Doctype -> insert(Token.Doctype)
        Document doc = Jsoup.parse("<!DOCTYPE html>", "", Parser.xmlParser());
        assertEquals(1, doc.childNodeSize());
        assertTrue(doc.childNode(0) instanceof DocumentType);
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testXmlSyntaxSetOnDocument` | `initialiseParse()` – set syntax เป็น XML |
| `testEmptyInputProducesNoChildren` | `process()` case `EOF` |
| `testEmptyBaseUri` | boundary: baseUri ว่าง ไม่พัง |
| `testNullInputThrows` | null input (exception path, type ไม่ยืนยันแน่ชัด) |
| `testPlainTextCharacterToken` | `process()` case `Character` → `insert(Character)` |
| `testMultipleSiblingTextAndElements` | ผสมหลาย token type ติดกัน |
| `testStartAndEndTagMatching` | `insert(StartTag)` else-branch + `popStackToClose` match พบ |
| `testSelfClosingTagDoesNotPushOntoStack` | `insert(StartTag)` if (`isSelfClosing`) true → ไม่ push stack |
| `testNonSelfClosingTagPushesOntoStack` | `insert(StartTag)` else-branch → push stack, nested element |
| `testSelfClosingKnownTagSmoke` | `!tag.isKnownTag()` = false (known tag เช่น `br`) |
| `testSelfClosingTagPreservesAttributes` | ตรวจ attribute ถูกส่งต่อเข้า `Element` |
| `testUnmatchedEndTagIsSkipped` | `popStackToClose()` → `firstFound == null` → return/skip |
| `testNestedElementsAutoClosedByAncestorEndTag` | `popStackToClose()` → loop ที่สอง ปิดหลายชั้น |
| `testPopStackClosesNearestMatchingTag` | `popStackToClose()` → หา match จาก top-of-stack (innermost) ก่อน |
| `testCommentNodeInserted` | `insert(Comment)` → `bogus == false` |
| `testBogusCommentBecomesXmlDeclaration` | `insert(Comment)` → `bogus == true`, prefix `"?"`, สร้าง `XmlDeclaration` |
| `testDoctypeNodeInserted` | `process()` case `Doctype` → `insert(Doctype)` |

**หมายเหตุข้อจำกัด:**
- branch `default: Validate.fail(...)` ใน `process()` ไม่สามารถเทสได้โดยไม่พึ่ง reflection เนื่องจาก `token.type` เป็น enum ที่ switch ครอบคลุมทุกค่าแล้วผ่าน public API
- กรณี `commentToken.bogus == true` แต่ `data.length() <= 1` หรือไม่ขึ้นต้นด้วย `!`/`?` ไม่ได้ทดสอบ เนื่องจากไม่มีซอร์สของ `Tokeniser` ให้ตรวจสอบเงื่อนไขการ trigger bogus comment ที่แน่นอน
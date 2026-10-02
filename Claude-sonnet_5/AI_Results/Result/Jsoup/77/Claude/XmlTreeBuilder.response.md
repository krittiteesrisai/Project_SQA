# JUnit 4 Test Suite: XmlTreeBuilderTest

ผมวิเคราะห์ซอร์สโค้ดแล้วออกแบบเทสให้ครอบคลุมทุกสาขาที่ตรวจพบได้ โดยใช้ประโยชน์จากข้อเท็จจริงที่ยืนยันได้จากซอร์สโค้ดเอง (เช่น field `stack`/`doc` ถูกเรียกแบบ unqualified ภายใน `XmlTreeBuilder` แสดงว่าต้องเป็น package-private/protected จึงเข้าถึงได้จาก test class ที่อยู่ package เดียวกัน, และ comment ใน javadoc ของ `popStackToClose` ที่ระบุ behavior "If not found, skips" ชัดเจน)

```java
package org.jsoup.parser;

import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link XmlTreeBuilder}.
 * Test class อยู่ใน package org.jsoup.parser เดียวกับคลาสเป้าหมาย
 * เพื่อให้สามารถเข้าถึง package-private / protected members
 * (parse(String,String), parse(Reader,String), initialiseParse, parseFragment, stack, doc)
 * ได้โดยตรงตามที่ถูกใช้แบบ unqualified ในซอร์สโค้ดต้นฉบับ
 */
public class XmlTreeBuilderTest {

    // ---------- 1. defaultSettings() ----------
    @Test
    public void testDefaultSettingsReturnsPreserveCase() {
        XmlTreeBuilder tb = new XmlTreeBuilder();
        assertSame(ParseSettings.preserveCase, tb.defaultSettings());
    }

    // ---------- 2. parse(String, String) ----------
    @Test
    public void testParseStringOverload() {
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse("<foo>bar</foo>", "http://example.com/");
        assertEquals("foo", doc.child(0).tagName());
        assertEquals("bar", doc.child(0).text());
        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
    }

    // ---------- 3. parse(Reader, String) ----------
    @Test
    public void testParseReaderOverload() {
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(new StringReader("<foo>bar</foo>"), "http://example.com/");
        assertEquals("foo", doc.child(0).tagName());
        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
    }

    // ---------- 4. initialiseParse: doc pushed on stack + syntax = xml ----------
    @Test
    public void testInitialiseParseAddsDocToStackAndSetsXmlSyntax() {
        XmlTreeBuilder tb = new XmlTreeBuilder();
        tb.initialiseParse(new StringReader("<a></a>"), "http://x/",
                ParseErrorList.noTracking(), ParseSettings.preserveCase);
        assertEquals(1, tb.stack.size());
        assertSame(tb.doc, tb.stack.get(0));
        assertEquals(Document.OutputSettings.Syntax.xml, tb.doc.outputSettings().syntax());
    }

    // ---------- 5. boundary: empty input ----------
    @Test
    public void testParseEmptyInput() {
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse("", "http://x/");
        assertEquals(0, doc.children().size());
    }

    // ---------- 6. process(StartTag) + non-self-closing -> pushed to stack (nesting works) ----------
    @Test
    public void testStartTagNonSelfClosingNested() {
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse("<a><b>text</b></a>", "http://x/");
        Element a = doc.child(0);
        assertEquals("a", a.tagName());
        Element b = a.child(0);
        assertEquals("b", b.tagName());
        assertEquals("text", b.text());
    }

    // ---------- 7. insert(StartTag): self-closing + known tag -> !isKnownTag() == false ----------
    @Test
    public void testSelfClosingKnownTag() {
        XmlTreeBuilder tb = new XmlTreeBuilder();
        // "br" เป็น known html tag ตาม default tag set ที่ Tag class โหลดไว้
        Document doc = tb.parse("<root><br/></root>", "http://x/");
        Element root = doc.child(0);
        Element br = root.child(0);
        assertEquals("br", br.tagName());
        assertEquals(0, br.children().size());
    }

    // ---------- 8. insert(StartTag): self-closing + UNKNOWN tag -> setSelfClosing() executed ----------
    @Test
    public void testSelfClosingUnknownTagSetsSelfClosingFlag() {
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse("<root><customtag123/></root>", "http://x/");
        Element custom = doc.child(0).child(0);
        assertEquals("customtag123", custom.tagName());
        assertTrue(custom.tag().isSelfClosing());
    }

    // ---------- 9. normalizeAttributes(preserveCase) ----------
    @Test
    public void testAttributesPreserveCase() {
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse("<a ID='1'></a>", "http://x/");
        assertEquals("1", doc.child(0).attr("ID"));
    }

    // ---------- 10. popStackToClose: found branch, proper close/break ----------
    @Test
    public void testPopStackToCloseFoundProperlyClosesElement() {
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse("<a><b></b><c>x</c></a>", "http://x/");
        Element a = doc.child(0);
        assertEquals(2, a.children().size());
        assertEquals("b", a.child(0).tagName());
        assertEquals("c", a.child(1).tagName());
        assertEquals("x", a.child(1).text());
    }

    // ---------- 11. popStackToClose: not-found branch -> skip (ตาม Javadoc "If not found, skips") ----------
    @Test
    public void testPopStackToCloseNotFoundSkips() {
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse("<a><c>text</d></c></a>", "http://x/");
        Element a = doc.child(0);
        assertEquals("a", a.tagName());
        Element c = a.child(0);
        assertEquals("c", c.tagName());
        assertEquals("text", c.text());
    }

    // ---------- 12. popStackToClose: loop ลบหลาย element พร้อมกันจนกว่าจะ break ----------
    @Test
    public void testPopStackToCloseRemovesMultipleStackLevels() {
        XmlTreeBuilder tb = new XmlTreeBuilder();
        // b, c ไม่ถูกปิดเอง -> </a> ต้อง pop c, b, a พร้อมกัน
        Document doc = tb.parse("<a><b><c>text</c></a>", "http://x/");
        assertEquals(1, tb.stack.size()); // เหลือแค่ doc
        assertSame(doc, tb.stack.get(0));

        Element a = doc.child(0);
        Element b = a.child(0);
        Element c = b.child(0);
        assertEquals("a", a.tagName());
        assertEquals("b", b.tagName());
        assertEquals("c", c.tagName());
        assertEquals("text", c.text());
    }

    // ---------- 13. end tag ที่ไม่มี start tag คู่กันเลย -> ไม่ throw, ไม่กระทบ document ----------
    @Test
    public void testEndTagWithoutMatchingStartTagNoCrash() {
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse("</a>", "http://x/");
        assertEquals(0, doc.children().size());
    }

    // ---------- 14. process(Comment): ordinary comment -> Comment node ----------
    @Test
    public void testOrdinaryCommentInserted() {
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse("<a><!--hi--></a>", "http://x/");
        Node node = doc.child(0).childNode(0);
        assertTrue(node instanceof Comment);
        assertEquals("hi", ((Comment) node).getData());
    }

    // ---------- 15. process(Comment): bogus comment startsWith("?") -> XmlDeclaration ----------
    // (อ้างอิงจาก comment ในซอร์ส: "xml declarations are emitted as bogus comments")
    @Test
    public void testBogusCommentXmlDeclarationParsedAsXmlDeclaration() {
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse("<?xml version=\"1.0\" encoding=\"UTF-8\"?><foo></foo>", "http://x/");
        Node first = doc.childNode(0);
        assertTrue(first instanceof XmlDeclaration);
        assertEquals("foo", doc.child(0).tagName());
    }

    // ---------- 16. process(Character): ปกติ -> TextNode ----------
    @Test
    public void testCharacterInsertsTextNode() {
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse("<a>hello</a>", "http://x/");
        Node node = doc.child(0).childNode(0);
        assertTrue(node instanceof TextNode);
        assertEquals("hello", ((TextNode) node).text());
    }

    // ---------- 17. process(Character): CDATA -> CDataNode ----------
    @Test
    public void testCDataInsertsCDataNode() {
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse("<a><![CDATA[raw data]]></a>", "http://x/");
        Node node = doc.child(0).childNode(0);
        assertTrue(node instanceof CDataNode);
        assertEquals("raw data", ((CDataNode) node).text());
    }

    // ---------- 18. process(Doctype): DocumentType node ----------
    @Test
    public void testDoctypeInsertsDocumentTypeNode() {
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse("<!DOCTYPE html><html></html>", "http://x/");
        Node first = doc.childNode(0);
        assertTrue(first instanceof DocumentType);
        // สมมติฐาน: DocumentType เก็บ name ผ่าน attributes (API มาตรฐานของ jsoup)
        assertEquals("html", ((DocumentType) first).attr("name"));
    }

    // ---------- 19. process(EOF): ไม่ throw / parse จบปกติ ----------
    @Test
    public void testEofHandledWithoutException() {
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse("<a></a>", "http://x/");
        assertNotNull(doc);
    }

    // ---------- 20. parseFragment() ----------
    @Test
    public void testParseFragmentReturnsChildNodes() {
        XmlTreeBuilder tb = new XmlTreeBuilder();
        List<Node> nodes = tb.parseFragment("<a>1</a><b>2</b>", "http://x/",
                ParseErrorList.noTracking(), ParseSettings.preserveCase);
        assertEquals(2, nodes.size());
        assertEquals("a", ((Element) nodes.get(0)).tagName());
        assertEquals("b", ((Element) nodes.get(1)).tagName());
    }

    // ---------- 21. Malformed/ผิดรูปแบบ -> ไม่ throw exception ----------
    @Test
    public void testMalformedInputDoesNotThrow() {
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse("<a><b></c>", "http://x/");
        assertNotNull(doc);
    }

    // หมายเหตุ: switch(token.type) ใน process() มี default -> Validate.fail(...)
    // ซึ่งไม่สามารถ trigger ได้ผ่าน public API เนื่องจาก Token.TokenType ที่ปรากฏใน
    // switch ครอบคลุมทุกค่า enum (StartTag, EndTag, Comment, Character, Doctype, EOF)
    // ตามซอร์สที่ให้มา จึงไม่เขียนเทสสำหรับ branch นี้เพื่อไม่ "เดา" พฤติกรรมที่ไม่สามารถพิสูจน์ได้
}
```

## ตารางสรุป Branch/Condition Coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testDefaultSettingsReturnsPreserveCase` | `defaultSettings()` return value |
| `testParseStringOverload` | `parse(String,String)` + syntax=xml setting |
| `testParseReaderOverload` | `parse(Reader,String)` overload |
| `testInitialiseParseAddsDocToStackAndSetsXmlSyntax` | `initialiseParse()`: `stack.add(doc)`, `doc.outputSettings().syntax(xml)` |
| `testParseEmptyInput` | boundary: empty input, no element children |
| `testStartTagNonSelfClosingNested` | `process(StartTag)` → `else { stack.add(el) }` branch |
| `testSelfClosingKnownTag` | `insert(StartTag)`: `isSelfClosing()==true`, `!tag.isKnownTag()==false` |
| `testSelfClosingUnknownTagSetsSelfClosingFlag` | `insert(StartTag)`: `isSelfClosing()==true`, `!tag.isKnownTag()==true` → `setSelfClosing()` |
| `testAttributesPreserveCase` | `settings.normalizeAttributes()` ผลจาก preserveCase |
| `testPopStackToCloseFoundProperlyClosesElement` | `popStackToClose`: found branch, inner loop `break` เมื่อ `next==firstFound` |
| `testPopStackToCloseNotFoundSkips` | `popStackToClose`: `firstFound==null` → `return` (skip) |
| `testPopStackToCloseRemovesMultipleStackLevels` | `popStackToClose`: loop ลบหลาย element ก่อน break |
| `testEndTagWithoutMatchingStartTagNoCrash` | `process(EndTag)` เมื่อ stack มีแค่ doc, ไม่ match |
| `testOrdinaryCommentInserted` | `insert(Comment)`: `commentToken.bogus==false` |
| `testBogusCommentXmlDeclarationParsedAsXmlDeclaration` | `insert(Comment)`: `bogus==true`, `startsWith("?")==true`, `data.length()>1` |
| `testCharacterInsertsTextNode` | `insert(Character)`: `isCData()==false` → `TextNode` |
| `testCDataInsertsCDataNode` | `insert(Character)`: `isCData()==true` → `CDataNode` |
| `testDoctypeInsertsDocumentTypeNode` | `insert(Doctype)` + `process(Doctype)` case |
| `testEofHandledWithoutException` | `process()`: `case EOF: break;` |
| `testParseFragmentReturnsChildNodes` | `parseFragment()` ทั้งหมด |
| `testMalformedInputDoesNotThrow` | mixed malformed tags, robustness ของ `process()`/`popStackToClose` |

**หมายเหตุสำคัญ:**
- Branch `default: Validate.fail(...)` ใน `process(Token)` ไม่ถูกทดสอบ เนื่องจาก enum `Token.TokenType` ที่ปรากฏใน switch ครอบคลุมครบทุกค่าตามซอร์สที่ให้มา ไม่มีทางเข้าถึง branch นี้ผ่าน public API ได้โดยไม่ reflection/mock ซึ่งจะเป็นการ "เดา" โครงสร้างภายในที่ไม่มีหลักฐานในซอร์ส
- Branch กรณี bogus comment ที่ `data.length() <= 1` ไม่ได้เขียนเทสเนื่องจากไม่มีข้อมูลพอที่จะยืนยัน behavior ของ Tokeniser (ไม่ได้ให้มาด้วย) ว่าจะสร้าง input แบบใดให้ตรงเงื่อนไขนี้ได้แน่นอน จึงเว้นไว้เพื่อไม่ขัดกับข้อกำหนดห้ามเดา
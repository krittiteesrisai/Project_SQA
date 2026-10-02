package org.jsoup.parser;

import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class XmlTreeBuilderTest {

    private static final String BASE_URI = "http://example.com/";

    // ---------- initialiseParse ----------

    @Test
    public void testXmlSyntaxSetAfterInitialiseParse() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<a>1</a>", BASE_URI);
        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
    }

    // ---------- boundary: empty / null ----------

    @Test
    public void testParseEmptyStringProducesEmptyDocument() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("", BASE_URI);
        assertTrue(doc.childNodes().isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void testParseNullInputThrowsNPE() {
        // StringReader(null) จะ throw NPE จาก s.length() ตาม JDK spec (ไม่ใช่ guess)
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.parse((String) null, BASE_URI);
    }

    // ---------- basic element / text (process: StartTag, Character, EndTag) ----------

    @Test
    public void testParseSimpleElementWithText() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<a>hello</a>", BASE_URI);
        Element a = doc.child(0);
        assertEquals("a", a.tagName());
        assertEquals("hello", a.text());
    }

    @Test
    public void testParseNestedElements() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<a><b>inner</b></a>", BASE_URI);
        Element a = doc.child(0);
        Element b = a.child(0);
        assertEquals("b", b.tagName());
        assertEquals("inner", b.text());
    }

    @Test
    public void testParseUnclosedTagStillInsertsContent() {
        // malformed input: ไม่มี end tag ปิด แต่ insertion เกิดทันทีตอนพบ start tag
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<a><b><c>text", BASE_URI);
        Element a = doc.child(0);
        Element b = a.child(0);
        Element c = b.child(0);
        assertEquals("text", c.text());
    }

    // ---------- self-closing tag: branch tag.isKnownTag() true/false ----------

    @Test
    public void testSelfClosingUnknownTagNotPushedToStack() {
        // unknown tag -> branch: !tag.isKnownTag() == true -> setSelfClosing() ถูกเรียก
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<customtag/><sibling>x</sibling>", BASE_URI);
        assertEquals(2, doc.children().size());
        assertEquals("customtag", doc.child(0).tagName());
        assertTrue(doc.child(0).children().isEmpty());
        assertEquals("sibling", doc.child(1).tagName()); // ไม่ได้ถูก nest ใน customtag
        assertEquals("x", doc.child(1).text());
    }

    @Test
    public void testSelfClosingKnownTagNotPushedToStack() {
        // known html tag เช่น "br" -> branch: !tag.isKnownTag() == false -> ข้าม setSelfClosing()
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<br/><sibling>x</sibling>", BASE_URI);
        assertEquals(2, doc.children().size());
        assertEquals("br", doc.child(0).tagName());
        assertTrue(doc.child(0).children().isEmpty());
        assertEquals("sibling", doc.child(1).tagName());
    }

    @Test
    public void testMultipleTopLevelSelfClosingSiblings() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<a/><b/><c>text</c>", BASE_URI);
        assertEquals(3, doc.children().size());
        assertEquals("a", doc.child(0).tagName());
        assertEquals("b", doc.child(1).tagName());
        assertEquals("c", doc.child(2).tagName());
        assertEquals("text", doc.child(2).text());
    }

    // ---------- popStackToClose: found / not found ----------

    @Test
    public void testEndTagProperlyClosesMatchingElement() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<a><b>in</b></a><after>out</after>", BASE_URI);
        // "after" ต้องเป็น sibling ของ a ไม่ใช่ลูกของ b/a (แสดงว่า pop ทำงานถูกต้อง)
        assertEquals(2, doc.children().size());
        assertEquals("after", doc.child(1).tagName());
        assertEquals("out", doc.child(1).text());
    }

    @Test
    public void testEndTagMismatchDoesNotCloseOpenElement() {
        // </b> ไม่มีใน stack ([doc,a]) -> firstFound == null -> return (ไม่ปิด a)
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<a></b><c>end</c>", BASE_URI);
        Element a = doc.child(0);
        assertEquals("a", a.tagName());
        // เนื่องจาก a ไม่ถูกปิด, c จึงถูกแทรกเป็นลูกของ a ไม่ใช่ลูกของ doc
        Element c = a.child(0);
        assertEquals("c", c.tagName());
        assertEquals("end", c.text());
    }

    @Test
    public void testEndTagNotFoundAtRootNoOp() {
        // stack มีแค่ doc, ไม่มี element ชื่อ "foo" -> loop หาไม่พบ -> return โดยไม่มีผลใด ๆ
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("</foo>", BASE_URI);
        assertTrue(doc.childNodes().isEmpty());
    }

    // ---------- Doctype ----------

    @Test
    public void testDoctypeNodeCreated() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<!DOCTYPE html>", BASE_URI);
        assertEquals(1, doc.childNodes().size());
        assertTrue(doc.childNode(0) instanceof DocumentType);
    }

    @Test
    public void testDoctypeWithPublicAndSystemIds() {
        String dt = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" " +
                "\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">";
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse(dt, BASE_URI);
        Node node = doc.childNode(0);
        assertTrue(node instanceof DocumentType);
        // ตรวจผ่าน outerHtml() เนื่องจากไม่มี key attribute ที่ชัดเจนในซอร์สที่ให้มา (สมมติ format การ render มาตรฐานของ jsoup)
        String html = node.outerHtml();
        assertTrue(html.contains("-//W3C//DTD XHTML 1.0 Strict//EN"));
        assertTrue(html.contains("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"));
    }

    // ---------- Comment: bogus/isXmlDeclaration combinations ----------

    @Test
    public void testNormalCommentCreatesCommentNode() {
        // bogus == false -> เงื่อนไข && สั้น circuit ไม่ถูกประเมินฝั่ง isXmlDeclaration เลย -> insert เป็น Comment ปกติ
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<!--hello world-->", BASE_URI);
        Node node = doc.childNode(0);
        assertTrue(node instanceof Comment);
        assertFalse(node instanceof XmlDeclaration);
        assertEquals("hello world", ((Comment) node).getData());
    }

    @Test
    public void testBogusNonXmlDeclarationCommentStaysAsComment() {
        // สมมติฐาน: tokenizer ของ jsoup จะ tokenize "<?...?>" เป็น bogus comment ตาม HTML5 spec
        // (ไม่ได้ระบุไว้ใน source ที่ให้มา - flag ไว้ตามข้อกำหนด)
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<?php echo 1; ?>", BASE_URI);
        Node node = doc.childNode(0);
        assertTrue(node instanceof Comment);
        assertFalse("ข้อมูลไม่ตรง pattern xml declaration ควรยังเป็น Comment ปกติ",
                node instanceof XmlDeclaration);
    }

    @Test
    public void testBogusXmlDeclarationBecomesXmlDeclarationNode() {
        // สมมติฐาน: "<?xml ...?>" ถูก tokenize เป็น bogus comment ที่ isXmlDeclaration() == true
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", BASE_URI);
        Node node = doc.childNode(0);
        assertTrue("ควรถูกแปลงเป็น XmlDeclaration ตาม logic ใน insert(Token.Comment)",
                node instanceof XmlDeclaration);
    }

    // ---------- Character / CDATA ----------

    @Test
    public void testTextNodeCreatedForPlainCharacterData() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<a>plain text</a>", BASE_URI);
        Node child = doc.child(0).childNode(0);
        assertTrue(child instanceof org.jsoup.nodes.TextNode);
        assertEquals("plain text", ((org.jsoup.nodes.TextNode) child).text());
    }

    @Test
    public void testCDataNodeCreated() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<a><![CDATA[Some data]]></a>", BASE_URI);
        Node child = doc.child(0).childNode(0);
        assertTrue(child instanceof CDataNode);
        assertEquals("Some data", ((CDataNode) child).text());
    }

    // ---------- defaultSettings(): preserveCase ----------

    @Test
    public void testTagAndAttributeCasePreserved() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<Foo BarAttr=\"1\"></Foo>", BASE_URI);
        Element foo = doc.child(0);
        assertEquals("Foo", foo.tagName());
        assertTrue(foo.attributes().hasKey("BarAttr"));
    }

    // ---------- parseFragment ----------

    @Test
    public void testParseFragmentReturnsTopLevelNodes() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Parser parser = new Parser(builder);
        List<Node> nodes = builder.parseFragment("<a>1</a><b>2</b>", BASE_URI, parser);
        assertEquals(2, nodes.size());
        assertEquals("a", ((Element) nodes.get(0)).tagName());
        assertEquals("b", ((Element) nodes.get(1)).tagName());
    }

    @Test
    public void testParseFragmentWithContextParamIgnored() {
        // overload (String, Element, String, Parser) เรียก parseFragment(input, baseUri, parser) โดยไม่ใช้ context
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Parser parser = new Parser(builder);
        List<Node> nodes = builder.parseFragment("<a>1</a><b>2</b>", null, BASE_URI, parser);
        assertEquals(2, nodes.size());
    }

    @Test
    public void testParseFragmentEmptyInput() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Parser parser = new Parser(builder);
        List<Node> nodes = builder.parseFragment("", BASE_URI, parser);
        assertTrue(nodes.isEmpty());
    }
}

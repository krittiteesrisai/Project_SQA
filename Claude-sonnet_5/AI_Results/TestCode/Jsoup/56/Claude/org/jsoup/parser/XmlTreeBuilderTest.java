package org.jsoup.parser;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * JUnit 4 test suite for {@link XmlTreeBuilder} (Defects4J Jsoup-56b)
 * วางไว้ใน package เดียวกับ class เป้าหมาย เพื่อให้เข้าถึง method package-private ได้
 */
public class XmlTreeBuilderTest {

    // ---------- 1. defaultSettings() ----------
    @Test
    public void testDefaultSettingsReturnsPreserveCase() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        ParseSettings settings = builder.defaultSettings();
        assertSame(ParseSettings.preserveCase, settings);
    }

    // ---------- 2. parse() พื้นฐาน + syntax ถูกตั้งเป็น xml ----------
    @Test
    public void testParseBasicXmlSetsXmlSyntax() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<root><child>text</child></root>", "http://example.com/");

        assertNotNull(doc);
        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());

        Element root = doc.child(0);
        assertEquals("root", root.tagName());
        Element child = root.child(0);
        assertEquals("child", child.tagName());
        assertEquals("text", child.text());
    }

    // ---------- 3. Empty string input (boundary) ----------
    @Test
    public void testParseEmptyInputProducesNoChildren() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("", "http://example.com/");
        assertNotNull(doc);
        assertEquals(0, doc.children().size());
    }

    // ---------- 4. Preserve case (ยืนยันผลจาก defaultSettings) ----------
    @Test
    public void testPreserveCaseTagNames() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<Root><Child/></Root>", "http://example.com/");
        Element root = doc.child(0);
        assertEquals("Root", root.tagName()); // case ต้องไม่ถูกแปลงเป็นตัวพิมพ์เล็ก
    }

    // ---------- 5. Self-closing tag + unknown tag -> setSelfClosing() ถูกเรียก ----------
    @Test
    public void testSelfClosingUnknownTagMarksSelfClosing() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<unknownfoo/>", "http://example.com/");
        Element el = doc.child(0);
        assertEquals("unknownfoo", el.tagName());
        assertTrue("unknown tag ที่ self-closing ต้อง mark selfClosing=true ตามเงื่อนไข !tag.isKnownTag()",
                el.tag().isSelfClosing());
    }

    // ---------- 6. Non self-closing tag -> ต้องถูก push บน stack (ลูกถูกแนบถูกที่) ----------
    @Test
    public void testNonSelfClosingTagPushedOnStack() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<foo>bar</foo>", "http://example.com/");
        Element foo = doc.child(0);
        assertEquals(1, foo.childNodeSize());
        assertTrue(foo.childNode(0) instanceof TextNode);
        assertEquals("bar", ((TextNode) foo.childNode(0)).text());
    }

    // ---------- 7. Comment ธรรมดา (ไม่ bogus) ----------
    @Test
    public void testNormalCommentIsCommentNode() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<root><!-- hello --></root>", "http://example.com/");
        Element root = doc.child(0);
        Node commentNode = root.childNode(0);
        assertTrue(commentNode instanceof Comment);
        assertEquals(" hello ", ((Comment) commentNode).getData());
    }

    // ---------- 8. Bogus comment ขึ้นต้นด้วย "?" -> แปลงเป็น XmlDeclaration ----------
    @Test
    public void testBogusCommentQuestionMarkBecomesXmlDeclaration() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<?xml version=\"1.0\"?><root></root>", "http://example.com/");
        Node first = doc.childNode(0);
        assertTrue("bogus comment ที่ data เริ่มด้วย ? ต้องถูกแปลงเป็น XmlDeclaration",
                first instanceof XmlDeclaration);
        XmlDeclaration decl = (XmlDeclaration) first;
        assertTrue(decl.hasAttr("version"));
        assertEquals("1.0", decl.attr("version"));
    }

    // ---------- 9. Bogus comment ที่สั้นเกินไป (data.length() <= 1) -> ไม่ถูกแปลงเป็น XmlDeclaration ----------
    // หมายเหตุ: อาศัยสมมติฐานว่า "<?>" ถูก tokenize เป็น bogus comment เช่นเดียวกับ <?xml...?>
    // (ไม่มี source ของ tokeniser ยืนยัน 100% แต่เป็นรูปแบบเดียวกับกรณี #8)
    @Test
    public void testBogusCommentTooShortStaysAsComment() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<?><root></root>", "http://example.com/");
        Node first = doc.childNode(0);
        assertTrue("data.length() <= 1 ต้องไม่ถูกแปลงเป็น XmlDeclaration (เข้า else ของ if ชั้นใน)",
                first instanceof Comment);
    }

    // ---------- 10. Doctype ----------
    @Test
    public void testDoctypeNodeCreated() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<!DOCTYPE note><note/>", "http://example.com/");
        Node first = doc.childNode(0);
        assertTrue(first instanceof DocumentType);
        DocumentType dt = (DocumentType) first;
        assertEquals("note", dt.attr("name"));
    }

    // ---------- 11. popStackToClose: ไม่พบ element ที่ตรงกัน (skip, firstFound == null) ----------
    @Test
    public void testPopStackToCloseEndTagNotFoundIsSkipped() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        // </b> ไม่มี start tag คู่กันเลย ควรถูกข้ามไปเฉย ๆ ไม่เกิด exception และไม่กระทบ stack
        Document doc = builder.parse("<root><a></b></root>", "http://example.com/");
        Element root = doc.child(0);
        assertEquals("root", root.tagName());
        Element a = root.child(0);
        assertEquals("a", a.tagName());
        // ไม่ควรมี element ชื่อ b ปรากฏในทรี
        assertEquals(0, doc.select("b").size());
    }

    // ---------- 12. popStackToClose: พบ element ที่ตรงกันและปิดถูกต้อง (loop break เมื่อ next == firstFound) ----------
    @Test
    public void testPopStackToCloseFoundClosesCorrectElement() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<root><a><b>x</b></a><c>y</c></root>", "http://example.com/");
        Element root = doc.child(0);
        Element a = root.child(0);
        Element b = a.child(0);
        assertEquals("b", b.tagName());
        assertEquals("x", b.text());

        Element c = root.child(1);
        assertEquals("c", c.tagName());
        assertEquals("y", c.text());
    }

    // ---------- 13. parseFragment() ----------
    @Test
    public void testParseFragmentReturnsChildNodes() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = builder.parseFragment(
                "<a>1</a><b>2</b>",
                "http://example.com/",
                ParseErrorList.noTracking(),
                ParseSettings.preserveCase);

        assertNotNull(nodes);
        assertEquals(2, nodes.size());
        assertEquals("a", ((Element) nodes.get(0)).tagName());
        assertEquals("b", ((Element) nodes.get(1)).tagName());
    }

    // ---------- 14. parseFragment() กับ input ว่าง (boundary) ----------
    @Test
    public void testParseFragmentEmptyInput() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = builder.parseFragment(
                "",
                "http://example.com/",
                ParseErrorList.noTracking(),
                ParseSettings.preserveCase);

        assertNotNull(nodes);
        assertEquals(0, nodes.size());
    }

    // ---------- 15. baseUri ถูกส่งต่อไปยัง element ที่ insert ----------
    @Test
    public void testBaseUriPropagatesToElements() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String baseUri = "http://example.com/base/";
        Document doc = builder.parse("<root/>", baseUri);
        Element root = doc.child(0);
        assertEquals(baseUri, root.baseUri());
    }

    // ---------- 16. Multiple character/text nodes และ mixed content ----------
    @Test
    public void testMixedContentCharacterAndElement() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<root>before<child/>after</root>", "http://example.com/");
        Element root = doc.child(0);
        assertEquals(3, root.childNodeSize());
        assertTrue(root.childNode(0) instanceof TextNode);
        assertEquals("before", ((TextNode) root.childNode(0)).text());
        assertTrue(root.childNode(1) instanceof Element);
        assertEquals("child", ((Element) root.childNode(1)).tagName());
        assertTrue(root.childNode(2) instanceof TextNode);
        assertEquals("after", ((TextNode) root.childNode(2)).text());
    }
}

# การวิเคราะห์และชุดทดสอบ JUnit 4 สำหรับ `W3CDom`

ประเด็นสำคัญที่ต้องระวัง:
- `Validate.notNull(in)` ไม่ได้ระบุชนิด exception ที่แน่ชัดในซอร์สที่ให้มา จึงจับแบบ `Exception` กว้าง ๆ (คอมเมนต์กำกับไว้)
- `Element.child(0)` ใน jsoup คืนค่าเฉพาะ **Element** child ตัวแรก (ข้าม DocumentType ที่เป็น sibling ของ `<html>`) ดังนั้นการทดสอบ branch "unhandled" ใน `head()` ต้องใช้ node ชนิดอื่นที่อยู่ *ภายใน* root element (เช่น `XmlDeclaration` จาก XML parser) ไม่ใช่ `DocumentType`
- `asString()` การทำให้ `TransformerException` เกิดขึ้นจริงต้องพึ่ง mocking ซึ่งไม่มี mocking framework ใน classpath ที่กำหนด จึงไม่ครอบคลุม branch นั้น (คอมเมนต์กำกับไว้)

```java
package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static org.junit.Assert.*;

public class W3CDomTest {

    private W3CDom w3c;

    @Before
    public void setUp() {
        w3c = new W3CDom();
    }

    // ---------------- fromJsoup ----------------

    @Test
    public void testFromJsoup_NullInput() {
        // Validate.notNull(in) ต้อง throw exception เมื่อ input เป็น null
        // ไม่แน่ใจชนิด exception ที่แน่ชัดจากซอร์สที่ให้มา จึงจับแบบกว้าง ๆ
        try {
            w3c.fromJsoup(null);
            fail("ควร throw exception เมื่อ input เป็น null");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testFromJsoup_Basic() {
        org.jsoup.nodes.Document jsoupDoc =
                Jsoup.parse("<html><head><title>t</title></head><body><p>Hello</p></body></html>");
        Document w3cDoc = w3c.fromJsoup(jsoupDoc);
        assertNotNull(w3cDoc);
        Element root = w3cDoc.getDocumentElement();
        assertNotNull(root);
        assertEquals("html", root.getTagName());
    }

    // ---------------- convert(): location branch ----------------

    @Test
    public void testConvert_WithLocation() {
        org.jsoup.nodes.Document jsoupDoc =
                Jsoup.parse("<html><body><p>a</p></body></html>", "http://example.com/");
        Document w3cDoc = w3c.fromJsoup(jsoupDoc);
        assertEquals("http://example.com/", w3cDoc.getDocumentURI());
    }

    @Test
    public void testConvert_WithoutLocation() {
        org.jsoup.nodes.Document jsoupDoc =
                Jsoup.parse("<html><body><p>a</p></body></html>"); // baseUri ว่าง
        Document w3cDoc = w3c.fromJsoup(jsoupDoc);
        // StringUtil.isBlank(location) == true -> ไม่ set documentURI
        assertNull(w3cDoc.getDocumentURI());
    }

    // ---------------- head(): instanceof branches ----------------

    @Test
    public void testHead_TextNode() {
        org.jsoup.nodes.Document jsoupDoc =
                Jsoup.parse("<html><body><p>Hello World</p></body></html>");
        Document w3cDoc = w3c.fromJsoup(jsoupDoc);
        assertTrue(domContainsText(w3cDoc.getDocumentElement(), "Hello World"));
    }

    @Test
    public void testHead_Comment() {
        org.jsoup.nodes.Document jsoupDoc =
                Jsoup.parse("<html><body><!-- a comment --><p>x</p></body></html>");
        Document w3cDoc = w3c.fromJsoup(jsoupDoc);
        assertTrue(domContainsComment(w3cDoc.getDocumentElement(), " a comment "));
    }

    @Test
    public void testHead_DataNode() {
        // เนื้อหาภายใน <script> ถูกแทนด้วย DataNode ใน jsoup
        org.jsoup.nodes.Document jsoupDoc =
                Jsoup.parse("<html><head><script>var a = 1;</script></head><body></body></html>");
        Document w3cDoc = w3c.fromJsoup(jsoupDoc);
        assertTrue(domContainsText(w3cDoc.getDocumentElement(), "var a = 1;"));
    }

    @Test
    public void testHead_UnhandledNode_DoesNotThrow() {
        // ใช้ XmlDeclaration (processing instruction) ที่อยู่ "ภายใน" root element
        // เพื่อให้ตก branch "unhandled" (else) ใน head() โดยไม่ throw exception
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(
                "<root><?xml-stylesheet type=\"text/css\" href=\"a.css\"?><child>x</child></root>",
                "", Parser.xmlParser());
        Document w3cDoc = w3c.fromJsoup(jsoupDoc);
        assertNotNull(w3cDoc);
        // ตรวจว่า child ยังถูกแปลงต่อได้ตามปกติหลังจากผ่าน node ที่ unhandled
        Element root = w3cDoc.getDocumentElement();
        assertEquals(1, root.getElementsByTagName("child").getLength());
    }

    // ---------------- tail(): undescend branch ----------------

    @Test
    public void testTail_NestedElements_Undescend() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(
                "<html><body><div><span>inner</span></div><p>sibling</p></body></html>");
        Document w3cDoc = w3c.fromJsoup(jsoupDoc);
        Element root = w3cDoc.getDocumentElement();
        Element body = (Element) root.getElementsByTagName("body").item(0);
        // ถ้า tail() undescend ถูกต้อง <div> และ <p> ต้องเป็น element child ของ body ทั้งคู่ (ระดับเดียวกัน)
        assertEquals(2, countElementChildren(body));
    }

    // ---------------- copyAttributes() ----------------

    @Test
    public void testCopyAttributes_InvalidCharsRemoved() {
        org.jsoup.nodes.Document jsoupDoc =
                Jsoup.parse("<html><body><p data-foo!@='bar'>x</p></body></html>");
        Document w3cDoc = w3c.fromJsoup(jsoupDoc);
        Element p = (Element) w3cDoc.getDocumentElement().getElementsByTagName("p").item(0);
        // อักขระที่ไม่ตรงกับ [-a-zA-Z0-9_:.] จะถูกลบออกจาก attribute key
        assertEquals("bar", p.getAttribute("data-foo"));
        assertFalse(p.hasAttribute("data-foo!@"));
    }

    @Test
    public void testCopyAttributes_NoAttributes() {
        org.jsoup.nodes.Document jsoupDoc =
                Jsoup.parse("<html><body><p>x</p></body></html>");
        Document w3cDoc = w3c.fromJsoup(jsoupDoc);
        Element p = (Element) w3cDoc.getDocumentElement().getElementsByTagName("p").item(0);
        // ไม่มี attribute -> loop ไม่ execute เลย (0 iterations)
        assertEquals(0, p.getAttributes().getLength());
    }

    // ---------------- updateNamespaces() ----------------

    @Test
    public void testUpdateNamespaces_DefaultXmlns() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(
                "<html xmlns='urn:test'><body><p>x</p></body></html>", "", Parser.xmlParser());
        Document w3cDoc = w3c.fromJsoup(jsoupDoc);
        Element root = w3cDoc.getDocumentElement();
        // key.equals(xmlnsKey) -> prefix = ""
        assertEquals("urn:test", root.getNamespaceURI());
    }

    @Test
    public void testUpdateNamespaces_PrefixedXmlns() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(
                "<root xmlns:foo='urn:foo'><foo:child>x</foo:child></root>", "", Parser.xmlParser());
        Document w3cDoc = w3c.fromJsoup(jsoupDoc);
        Element root = w3cDoc.getDocumentElement();
        Element child = firstElementChild(root);
        assertNotNull(child);
        // key.startsWith(xmlnsPrefix) -> prefix = "foo"; pos > 0 ของ tagName "foo:child"
        assertEquals("urn:foo", child.getNamespaceURI());
    }

    @Test
    public void testUpdateNamespaces_NoPrefix_NoNamespace() {
        org.jsoup.nodes.Document jsoupDoc =
                Jsoup.parse("<html><body><p>x</p></body></html>");
        Document w3cDoc = w3c.fromJsoup(jsoupDoc);
        Element root = w3cDoc.getDocumentElement();
        // ไม่มี xmlns ใด ๆ ประกาศ และ tagName ไม่มี ':' -> pos <= 0 -> prefix = "" -> namespace = null
        assertNull(root.getNamespaceURI());
    }

    @Test
    public void testUpdateNamespaces_NonXmlnsAttributeIgnored() {
        // attribute ปกติ (ไม่ใช่ xmlns) ต้องตก branch else { continue; } โดยไม่กระทบ namespace
        org.jsoup.nodes.Document jsoupDoc =
                Jsoup.parse("<html><body><p class='c'>x</p></body></html>");
        Document w3cDoc = w3c.fromJsoup(jsoupDoc);
        Element p = (Element) w3cDoc.getDocumentElement().getElementsByTagName("p").item(0);
        assertNull(p.getNamespaceURI());
        assertEquals("c", p.getAttribute("class"));
    }

    // ---------------- asString() ----------------

    @Test
    public void testAsString_Basic() {
        org.jsoup.nodes.Document jsoupDoc =
                Jsoup.parse("<html><body><p>Hello</p></body></html>");
        Document w3cDoc = w3c.fromJsoup(jsoupDoc);
        String out = w3c.asString(w3cDoc);
        assertNotNull(out);
        assertTrue(out.contains("Hello"));
    }

    // หมายเหตุ: ไม่มี mocking framework ใน classpath ที่กำหนด จึงไม่สามารถ force ให้
    // TransformerException เกิดขึ้นได้เพื่อทดสอบ catch block ใน asString() ได้อย่างปลอดภัย
    // โดยไม่เดา behavior เพิ่มเติม

    // ---------------- Helper methods ----------------

    private boolean domContainsText(Node node, String text) {
        if (node.getNodeType() == Node.TEXT_NODE && node.getNodeValue() != null
                && node.getNodeValue().contains(text)) {
            return true;
        }
        NodeList children = node.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            if (domContainsText(children.item(i), text)) return true;
        }
        return false;
    }

    private boolean domContainsComment(Node node, String data) {
        if (node.getNodeType() == Node.COMMENT_NODE && data.equals(node.getNodeValue())) {
            return true;
        }
        NodeList children = node.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            if (domContainsComment(children.item(i), data)) return true;
        }
        return false;
    }

    private int countElementChildren(Element el) {
        int count = 0;
        NodeList children = el.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            if (children.item(i) instanceof Element) count++;
        }
        return count;
    }

    private Element firstElementChild(Element el) {
        NodeList children = el.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            if (children.item(i) instanceof Element) return (Element) children.item(i);
        }
        return null;
    }
}
```

## สรุป Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testFromJsoup_NullInput` | `Validate.notNull(in)` — path เมื่อ `in == null` |
| `testFromJsoup_Basic` | `fromJsoup()` path ปกติ (ไม่ throw `ParserConfigurationException`) |
| `testConvert_WithLocation` | `convert()`: `!StringUtil.isBlank(in.location())` == `true` |
| `testConvert_WithoutLocation` | `convert()`: `!StringUtil.isBlank(in.location())` == `false` |
| `testHead_TextNode` | `head()`: `source instanceof TextNode` == `true` |
| `testHead_Comment` | `head()`: `source instanceof Comment` == `true` |
| `testHead_DataNode` | `head()`: `source instanceof DataNode` == `true` |
| `testHead_UnhandledNode_DoesNotThrow` | `head()`: else (unhandled) branch |
| `testTail_NestedElements_Undescend` | `tail()`: `dest.getParentNode() instanceof Element` == `true` (undescend) และ `head()` ของ `Element` เมื่อ `dest == null` (root) กับ `dest != null` (non-root) |
| `testCopyAttributes_InvalidCharsRemoved` | `copyAttributes()`: loop อักขระถูก regex ลบออก |
| `testCopyAttributes_NoAttributes` | `copyAttributes()`: loop 0 iteration |
| `testUpdateNamespaces_DefaultXmlns` | `updateNamespaces()`: `key.equals(xmlnsKey)` == `true`, `pos > 0` == `false` (root ไม่มี `:`) |
| `testUpdateNamespaces_PrefixedXmlns` | `updateNamespaces()`: `key.startsWith(xmlnsPrefix)` == `true`, `pos > 0` == `true` |
| `testUpdateNamespaces_NoPrefix_NoNamespace` | `updateNamespaces()`: ไม่มี xmlns, `pos > 0` == `false` |
| `testUpdateNamespaces_NonXmlnsAttributeIgnored` | `updateNamespaces()`: attribute อื่น ๆ ตก `else { continue; }` |
| `testAsString_Basic` | `asString()`: path ปกติ (ไม่ throw `TransformerException`) |

**หมายเหตุ:** branch `catch (ParserConfigurationException e)` ใน `fromJsoup()` และ `catch (TransformerException e)` ใน `asString()` ไม่ได้ถูกทดสอบ เนื่องจากต้องพึ่ง mocking framework (ไม่มีใน classpath ที่กำหนด) เพื่อ force ให้เกิด exception เหล่านี้ได้อย่างปลอดภัยโดยไม่เดา behavior เพิ่มเติม
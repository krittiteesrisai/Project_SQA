# W3CDomTest.java

```java
package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

/**
 * JUnit 4 test suite for org.jsoup.helper.W3CDom
 * (Defects4J: Jsoup-73b)
 *
 * หมายเหตุ: บางพฤติกรรม (เช่น ชนิด exception ที่ Validate.notNull throw)
 * อ้างอิงจาก jsoup source ปกติ (IllegalArgumentException) — หากเวอร์ชันที่ใช้จริง
 * แตกต่าง ให้ปรับ expected exception ตามจริง
 */
public class W3CDomTest {

    // ---------- fromJsoup(null) : Validate.notNull branch ----------
    @Test(expected = IllegalArgumentException.class)
    public void testFromJsoup_NullInput_ThrowsException() {
        // Assumption: Validate.notNull throws IllegalArgumentException
        W3CDom w3c = new W3CDom();
        w3c.fromJsoup(null);
    }

    // ---------- fromJsoup basic conversion + namespace null branch ----------
    @Test
    public void testFromJsoup_BasicConversion_RootTagAndNullNamespace() {
        org.jsoup.nodes.Document jdoc =
                Jsoup.parse("<html><head></head><body><p>Hello</p></body></html>");
        W3CDom w3c = new W3CDom();
        Document out = w3c.fromJsoup(jdoc);

        assertNotNull(out);
        Element root = out.getDocumentElement();
        assertNotNull(root);
        assertEquals("html", root.getTagName());
        assertNull(root.getNamespaceURI()); // ไม่มี xmlns ประกาศ -> namespace = null
    }

    // ---------- convert(): location not blank -> setDocumentURI ----------
    @Test
    public void testConvert_SetsDocumentURI_WhenLocationNotBlank() {
        org.jsoup.nodes.Document jdoc =
                Jsoup.parse("<html><body><p>hi</p></body></html>", "http://example.com/");
        W3CDom w3c = new W3CDom();
        Document out = w3c.fromJsoup(jdoc);

        assertEquals("http://example.com/", out.getDocumentURI());
    }

    // ---------- convert(): location blank (empty string) -> no setDocumentURI ----------
    @Test
    public void testConvert_DoesNotSetDocumentURI_WhenLocationEmpty() {
        org.jsoup.nodes.Document jdoc =
                Jsoup.parse("<html><body><p>hi</p></body></html>"); // baseUri เป็น "" -> blank
        W3CDom w3c = new W3CDom();
        Document out = w3c.fromJsoup(jdoc);

        assertNull(out.getDocumentURI());
    }

    // ---------- convert(): location blank (whitespace only) -> no setDocumentURI ----------
    @Test
    public void testConvert_DoesNotSetDocumentURI_WhenLocationWhitespace() {
        org.jsoup.nodes.Document jdoc =
                Jsoup.parse("<html><body><p>hi</p></body></html>", "   ");
        W3CDom w3c = new W3CDom();
        Document out = w3c.fromJsoup(jdoc);

        assertNull(out.getDocumentURI());
    }

    // ---------- convert() เรียกตรงผ่าน DocumentBuilder เอง ----------
    @Test
    public void testConvert_DirectUsageWithExternalBuilder() throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder builder = dbf.newDocumentBuilder();
        Document out = builder.newDocument();

        org.jsoup.nodes.Document jdoc =
                Jsoup.parse("<html><body><p>hi</p></body></html>", "http://x.com/");
        W3CDom w3c = new W3CDom();
        w3c.convert(jdoc, out);

        assertEquals("http://x.com/", out.getDocumentURI());
        assertEquals("html", out.getDocumentElement().getTagName());
    }

    // ---------- head(): TextNode branch ----------
    @Test
    public void testHead_TextNodeConversion() {
        org.jsoup.nodes.Document jdoc =
                Jsoup.parse("<html><body><p>Hello World</p></body></html>");
        W3CDom w3c = new W3CDom();
        Document out = w3c.fromJsoup(jdoc);

        NodeList pNodes = out.getElementsByTagName("p");
        assertEquals(1, pNodes.getLength());
        assertEquals("Hello World", pNodes.item(0).getTextContent());
    }

    // ---------- head(): Comment branch ----------
    @Test
    public void testHead_CommentConversion() {
        org.jsoup.nodes.Document jdoc =
                Jsoup.parse("<html><body><!--a comment--><p>x</p></body></html>");
        W3CDom w3c = new W3CDom();
        Document out = w3c.fromJsoup(jdoc);

        Element body = (Element) out.getElementsByTagName("body").item(0);
        Node first = body.getFirstChild();
        assertEquals(Node.COMMENT_NODE, first.getNodeType());
        assertEquals("a comment", first.getTextContent());
    }

    // ---------- head(): DataNode branch (เช่น <script>) ----------
    @Test
    public void testHead_DataNodeConversion() {
        org.jsoup.nodes.Document jdoc =
                Jsoup.parse("<html><body><script>var a = 1;</script></body></html>");
        W3CDom w3c = new W3CDom();
        Document out = w3c.fromJsoup(jdoc);

        Element script = (Element) out.getElementsByTagName("script").item(0);
        assertEquals("var a = 1;", script.getTextContent());
    }

    // ---------- tail(): undescend ถูกต้องเมื่อมี sibling หลายตัว ----------
    @Test
    public void testTail_UndescendsCorrectlyForSiblings() {
        org.jsoup.nodes.Document jdoc =
                Jsoup.parse("<html><body><div><p>A</p><span>B</span></div></body></html>");
        W3CDom w3c = new W3CDom();
        Document out = w3c.fromJsoup(jdoc);

        Element div = (Element) out.getElementsByTagName("div").item(0);
        assertEquals(2, div.getChildNodes().getLength());
        assertEquals("p", div.getChildNodes().item(0).getNodeName());
        assertEquals("span", div.getChildNodes().item(1).getNodeName());
    }

    // ---------- copyAttributes(): regex ลบ char แปลกปลอม + ตรวจ pattern ----------
    @Test
    public void testCopyAttributes_FiltersAndSanitizesAttributeNames() {
        org.jsoup.nodes.Document jdoc = org.jsoup.nodes.Document.createShell("");
        Element body = jdoc.body();
        Element div = new Element(Tag.valueOf("div"), "");
        div.attr("good-attr", "v1");  // ชื่อถูกต้องตั้งแต่แรก -> คงอยู่
        div.attr("1invalid", "v2");   // ขึ้นต้นด้วยเลข -> ไม่ผ่าน pattern -> ถูกตัดออก
        div.attr("bad name!", "v3");  // regex ลบ space/! -> "badname" ผ่าน pattern -> คงอยู่
        body.appendChild(div);

        W3CDom w3c = new W3CDom();
        Document out = w3c.fromJsoup(jdoc);
        Element outDiv = (Element) out.getElementsByTagName("div").item(0);

        assertEquals("v1", outDiv.getAttribute("good-attr"));
        assertFalse(outDiv.hasAttribute("1invalid"));
        assertTrue(outDiv.hasAttribute("badname"));
        assertEquals("v3", outDiv.getAttribute("badname"));
    }

    // ---------- updateNamespaces(): xmlns (key.equals(xmlnsKey)) ----------
    @Test
    public void testUpdateNamespaces_DefaultXmlnsAttribute() {
        org.jsoup.nodes.Document jdoc = org.jsoup.nodes.Document.createShell("");
        Element body = jdoc.body();
        Element div = new Element(Tag.valueOf("div"), "");
        div.attr("xmlns", "http://example.com/ns");
        body.appendChild(div);

        W3CDom w3c = new W3CDom();
        Document out = w3c.fromJsoup(jdoc);
        Element outDiv = (Element) out.getElementsByTagName("div").item(0);

        assertEquals("http://example.com/ns", outDiv.getNamespaceURI());
    }

    // ---------- updateNamespaces(): xmlns:prefix (key.startsWith(xmlnsPrefix)) + tagName prefix ----------
    @Test
    public void testUpdateNamespaces_PrefixedXmlnsAttribute() {
        org.jsoup.nodes.Document jdoc = org.jsoup.nodes.Document.createShell("");
        Element body = jdoc.body();
        Element nsEl = new Element(Tag.valueOf("ns:tag"), "");
        nsEl.attr("xmlns:ns", "http://example.com/nsprefix");
        body.appendChild(nsEl);

        W3CDom w3c = new W3CDom();
        Document out = w3c.fromJsoup(jdoc);
        Element outEl = (Element) out.getElementsByTagName("ns:tag").item(0);

        assertNotNull(outEl);
        assertEquals("http://example.com/nsprefix", outEl.getNamespaceURI());
    }

    // ---------- updateNamespaces(): attribute อื่นที่ไม่ตรง xmlns/xmlns: -> continue branch ----------
    @Test
    public void testUpdateNamespaces_NonXmlnsAttribute_IsIgnoredForNamespace() {
        org.jsoup.nodes.Document jdoc = org.jsoup.nodes.Document.createShell("");
        Element body = jdoc.body();
        Element div = new Element(Tag.valueOf("div"), "");
        div.attr("class", "myclass"); // ไม่เกี่ยวกับ xmlns -> continue
        body.appendChild(div);

        W3CDom w3c = new W3CDom();
        Document out = w3c.fromJsoup(jdoc);
        Element outDiv = (Element) out.getElementsByTagName("div").item(0);

        assertNull(outDiv.getNamespaceURI()); // ไม่มี namespace ถูกกำหนด
        assertEquals("myclass", outDiv.getAttribute("class"));
    }

    // ---------- Boundary: jsoup Document ที่ไม่มี child -> in.child(0) ควร throw ----------
    @Test(expected = IndexOutOfBoundsException.class)
    public void testConvert_EmptyDocument_NoRootChild_ThrowsException() {
        org.jsoup.nodes.Document emptyDoc = new org.jsoup.nodes.Document("");
        // ไม่ append child ใด ๆ -> in.child(0) จะ throw IndexOutOfBoundsException
        W3CDom w3c = new W3CDom();
        w3c.fromJsoup(emptyDoc);
    }

    // ---------- asString(): serialize สำเร็จ ----------
    @Test
    public void testAsString_SerializesDocumentCorrectly() {
        org.jsoup.nodes.Document jdoc =
                Jsoup.parse("<html><body><p>Hello</p></body></html>");
        W3CDom w3c = new W3CDom();
        Document out = w3c.fromJsoup(jdoc);
        String xml = w3c.asString(out);

        assertNotNull(xml);
        assertTrue(xml.contains("Hello"));
    }
}
```

---

## ตารางสรุป Branch/Condition ที่แต่ละ Test ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testFromJsoup_NullInput_ThrowsException` | `Validate.notNull(in)` -> throw เมื่อ `in == null` |
| `testFromJsoup_BasicConversion_RootTagAndNullNamespace` | `head()` สร้าง root element (`dest == null` branch), `updateNamespaces` กรณีไม่มี prefix (`pos <= 0`), namespace = null |
| `testConvert_SetsDocumentURI_WhenLocationNotBlank` | `convert()` : `!StringUtil.isBlank(location)` = true -> `setDocumentURI` ถูกเรียก |
| `testConvert_DoesNotSetDocumentURI_WhenLocationEmpty` | `convert()` : location เป็น `""` -> isBlank = true -> ไม่เรียก `setDocumentURI` |
| `testConvert_DoesNotSetDocumentURI_WhenLocationWhitespace` | `convert()` : location เป็น whitespace -> isBlank = true (boundary เพิ่มเติม) |
| `testConvert_DirectUsageWithExternalBuilder` | เรียก `convert()` ตรง (ไม่ผ่าน `fromJsoup`) พร้อม location not blank |
| `testHead_TextNodeConversion` | `head()` : `source instanceof TextNode` branch |
| `testHead_CommentConversion` | `head()` : `source instanceof Comment` branch |
| `testHead_DataNodeConversion` | `head()` : `source instanceof DataNode` branch |
| `testTail_UndescendsCorrectlyForSiblings` | `tail()` : `dest.getParentNode() instanceof Element` -> undescend ถูกต้องสำหรับ sibling หลายตัว |
| `testCopyAttributes_FiltersAndSanitizesAttributeNames` | `copyAttributes()` : regex ลบอักขระ + `key.matches(...)` ทั้ง true/false branch |
| `testUpdateNamespaces_DefaultXmlnsAttribute` | `updateNamespaces()` : `key.equals(xmlnsKey)` branch |
| `testUpdateNamespaces_PrefixedXmlnsAttribute` | `updateNamespaces()` : `key.startsWith(xmlnsPrefix)` branch + tagName มี `:` (`pos > 0`) |
| `testUpdateNamespaces_NonXmlnsAttribute_IsIgnoredForNamespace` | `updateNamespaces()` : else -> `continue` branch |
| `testConvert_EmptyDocument_NoRootChild_ThrowsException` | Boundary: `in.child(0)` เมื่อไม่มี child (ดักจับ fault ที่อาจเกิดจาก assumption ว่ามี child เสมอ) |
| `testAsString_SerializesDocumentCorrectly` | `asString()` : เส้นทางปกติไม่เกิด `TransformerException` |

**หมายเหตุ:** branch `else { // unhandled }` ใน `head()` (กรณี Node ไม่ตรงกับ Element/TextNode/Comment/DataNode เช่น `XmlDeclaration`) ไม่สามารถ trigger ได้ง่ายผ่าน public API ของ `NodeTraversor` ที่เริ่มจาก root element ปกติ จึงไม่ได้เขียนเทสสำหรับ branch นี้ — หากต้องการ coverage เพิ่มเติม ควรพิจารณาการสร้าง custom `Node` subclass เพื่อ inject เข้า tree โดยตรง
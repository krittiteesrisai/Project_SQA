# การวิเคราะห์และออกแบบ Test Cases

จากการอ่านซอร์สโค้ด `W3CDom` พบจุดที่ต้องทดสอบ (branch/condition) ดังนี้:
- `fromJsoup`: null check (Validate.notNull), try/catch ParserConfigurationException (ไม่สามารถ trigger ได้ตรงๆ จึงข้าม)
- `convert`: if (!StringUtil.isBlank(location)) true/false
- `W3CBuilder.head`: if-else chain (Element / TextNode / Comment / DataNode / unhandled-else), และ dest==null (root) vs dest!=null
- `W3CBuilder.tail`: instanceof Element && parent instanceof Element (true/false)
- `copyAttributes`: regex match true/false (attribute ถูกเก็บ/ถูกตัด)
- `updateNamespaces`: key.equals(xmlnsKey) / key.startsWith(xmlnsPrefix) / else continue, และ pos>0 ? prefix : ""
- `asString`: การแปลงปกติ

**หมายเหตุสำคัญ:** บางเงื่อนไข (เช่น branch `else { // unhandled }` ใน `head()`) ต้องใช้ Node subtype พิเศษ (เช่น `DocumentType`) ซึ่งพฤติกรรมการ parse ของ jsoup (เช่น ลำดับ child ของ `#root` เมื่อมี `<!DOCTYPE>`) **ไม่ได้ระบุอยู่ในซอร์สของคลาสเป้าหมาย** จึงไม่ขอเดาและไม่เขียนเทสสำหรับ branch นี้ตามข้อกำหนดที่ 4 (คอมเมนต์กำกับไว้ในโค้ด)

```java
package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.helper.W3CDom; // explicit import ตามข้อกำหนด (same package)

import org.junit.Before;
import org.junit.Test;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import static org.junit.Assert.*;

/**
 * Unit tests สำหรับ org.jsoup.helper.W3CDom (Defects4J Jsoup-84b)
 *
 * NOTE:
 * - ใช้ org.jsoup.nodes.Document / Element แบบ fully-qualified บางจุด
 *   เพื่อหลีกเลี่ยงชื่อชนกับ org.w3c.dom.Document / Element
 * - Branch "else { // unhandled }" ใน W3CBuilder.head() ไม่ได้ทดสอบ
 *   เพราะต้องพึ่งพาพฤติกรรมภายในของ jsoup HTML parser (ลำดับ child ของ #root
 *   เมื่อมี DocumentType) ซึ่งไม่ได้ระบุไว้ในซอร์สของคลาสเป้าหมายนี้
 */
public class W3CDomTest {

    private W3CDom w3c;

    @Before
    public void setUp() {
        w3c = new W3CDom();
    }

    private org.w3c.dom.Document newEmptyW3cDoc() throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        return db.newDocument();
    }

    // ---------- fromJsoup ----------

    @Test(expected = IllegalArgumentException.class)
    public void fromJsoup_NullInput_ThrowsException() {
        // Validate.notNull(in) ของ jsoup throw IllegalArgumentException เมื่อ obj == null
        w3c.fromJsoup(null);
    }

    @Test
    public void fromJsoup_BasicConversion_ReturnsRootElement() {
        org.jsoup.nodes.Document jdoc = Jsoup.parse("<html><head></head><body><p>Hello</p></body></html>");
        org.w3c.dom.Document wdoc = w3c.fromJsoup(jdoc);

        assertNotNull(wdoc);
        assertNotNull(wdoc.getDocumentElement());
        assertEquals("html", wdoc.getDocumentElement().getTagName());
    }

    @Test
    public void fromJsoup_EmptyHtmlInput_StillProducesHtmlRoot() {
        // jsoup จะเติมโครงสร้าง html>head,body ให้เสมอ แม้ input ว่าง (พฤติกรรมมาตรฐานของ jsoup parser)
        org.jsoup.nodes.Document jdoc = Jsoup.parse("");
        org.w3c.dom.Document wdoc = w3c.fromJsoup(jdoc);

        assertNotNull(wdoc.getDocumentElement());
        assertEquals("html", wdoc.getDocumentElement().getTagName());
    }

    // ---------- convert: location / documentURI branch ----------

    @Test
    public void convert_BlankLocation_DocumentURINotSet() throws Exception {
        // Jsoup.parse(html) ไม่ระบุ baseUri -> location() = "" -> StringUtil.isBlank == true -> ไม่ set URI
        org.jsoup.nodes.Document jdoc = Jsoup.parse("<html><body><p>x</p></body></html>");
        org.w3c.dom.Document out = newEmptyW3cDoc();

        w3c.convert(jdoc, out);

        assertNull(out.getDocumentURI());
    }

    @Test
    public void convert_NonBlankLocation_DocumentURIIsSet() throws Exception {
        String baseUri = "http://example.com/";
        org.jsoup.nodes.Document jdoc = Jsoup.parse("<html><body><p>x</p></body></html>", baseUri);
        org.w3c.dom.Document out = newEmptyW3cDoc();

        w3c.convert(jdoc, out);

        assertEquals(baseUri, out.getDocumentURI());
    }

    // ---------- head(): TextNode / Comment / DataNode branches ----------

    @Test
    public void head_TextNodeBranch_CopiesTextContent() {
        org.jsoup.nodes.Document jdoc = Jsoup.parse("<html><body><p>Hello World</p></body></html>");
        org.w3c.dom.Document wdoc = w3c.fromJsoup(jdoc);

        org.w3c.dom.Element p = (org.w3c.dom.Element) wdoc.getElementsByTagName("p").item(0);
        assertEquals("Hello World", p.getTextContent());
    }

    @Test
    public void head_CommentBranch_CopiesCommentData() {
        org.jsoup.nodes.Document jdoc = Jsoup.parse("<html><body><div><!-- a comment --></div></body></html>");
        org.w3c.dom.Document wdoc = w3c.fromJsoup(jdoc);

        org.w3c.dom.Element div = (org.w3c.dom.Element) wdoc.getElementsByTagName("div").item(0);
        org.w3c.dom.Node child = div.getFirstChild();

        assertNotNull(child);
        assertEquals(org.w3c.dom.Node.COMMENT_NODE, child.getNodeType());
        assertTrue(((org.w3c.dom.Comment) child).getData().contains("a comment"));
    }

    @Test
    public void head_DataNodeBranch_CopiesScriptContent() {
        org.jsoup.nodes.Document jdoc = Jsoup.parse("<html><body><script>var a = 1;</script></body></html>");
        org.w3c.dom.Document wdoc = w3c.fromJsoup(jdoc);

        org.w3c.dom.Element script = (org.w3c.dom.Element) wdoc.getElementsByTagName("script").item(0);
        assertEquals("var a = 1;", script.getTextContent());
    }

    // ---------- head(): dest == null (root) vs dest != null (nested) + tail() undescend ----------

    @Test
    public void headTail_MultipleSiblings_CorrectNestingAfterUndescend() {
        org.jsoup.nodes.Document jdoc = Jsoup.parse(
            "<html><body><div id=\"outer\"><span>A</span><span>B</span></div></body></html>");
        org.w3c.dom.Document wdoc = w3c.fromJsoup(jdoc);

        org.w3c.dom.Element outer = (org.w3c.dom.Element) wdoc.getElementsByTagName("div").item(0);
        org.w3c.dom.NodeList spans = outer.getChildNodes();

        // ถ้า tail() ไม่ pop dest กลับไปที่ outer หลังปิด span แรก
        // span ที่สองจะถูก append ผิดที่ (ซ้อนอยู่ใน span แรก) แทนที่จะเป็น sibling ของ div
        assertEquals(2, spans.getLength());
        assertEquals("A", spans.item(0).getTextContent());
        assertEquals("B", spans.item(1).getTextContent());
    }

    // ---------- copyAttributes(): regex match true/false branches ----------

    @Test
    public void copyAttributes_ValidInvalidAndDigitLeadingKeys() {
        org.jsoup.nodes.Document jdoc = Jsoup.parse("<html><body></body></html>");

        org.jsoup.nodes.Element div = new org.jsoup.nodes.Element(Tag.valueOf("div"), "");
        div.attr("id", "ok");               // valid key -> คงไว้
        div.attr("bad!attr", "y");          // '!' ถูก strip -> "badattr" -> valid -> คงไว้ (value เดิม)
        div.attr("1start", "z");            // ขึ้นต้นด้วยตัวเลข -> ไม่ match regex -> ถูกตัดทิ้ง
        div.attr("!!!", "z2");              // sanitize แล้วเหลือ "" -> ไม่ match -> ถูกตัดทิ้ง
        jdoc.body().appendChild(div);

        org.w3c.dom.Document wdoc = w3c.fromJsoup(jdoc);
        org.w3c.dom.Element wDiv = (org.w3c.dom.Element) wdoc.getElementsByTagName("div").item(0);

        assertEquals("ok", wDiv.getAttribute("id"));
        assertEquals("y", wDiv.getAttribute("badattr"));
        assertFalse(wDiv.hasAttribute("1start"));
        assertEquals(2, wDiv.getAttributes().getLength());
    }

    // ---------- updateNamespaces(): xmlns / xmlns: / else-continue / prefix pos>0 ----------

    @Test
    public void updateNamespaces_DefaultXmlnsAttribute_SetsNamespaceURI() {
        org.jsoup.nodes.Document jdoc = Jsoup.parse("<html><body></body></html>");

        org.jsoup.nodes.Element div = new org.jsoup.nodes.Element(Tag.valueOf("div"), "");
        div.attr("xmlns", "urn:test");
        jdoc.body().appendChild(div);

        org.w3c.dom.Document wdoc = w3c.fromJsoup(jdoc);
        org.w3c.dom.Element wDiv = (org.w3c.dom.Element) wdoc.getElementsByTagName("div").item(0);

        assertEquals("urn:test", wDiv.getNamespaceURI());
    }

    @Test
    public void updateNamespaces_PrefixedXmlnsAttribute_SetsNamespaceForPrefixedTag() {
        org.jsoup.nodes.Document jdoc = Jsoup.parse("<html><body></body></html>");

        org.jsoup.nodes.Element el = new org.jsoup.nodes.Element(Tag.valueOf("xyz:foo"), "");
        el.attr("xmlns:xyz", "urn:xyz");
        jdoc.body().appendChild(el);

        org.w3c.dom.Document wdoc = w3c.fromJsoup(jdoc);
        org.w3c.dom.Element wEl = (org.w3c.dom.Element) wdoc.getElementsByTagName("xyz:foo").item(0);

        assertNotNull(wEl);
        assertEquals("urn:xyz", wEl.getNamespaceURI());
    }

    @Test
    public void updateNamespaces_NonXmlnsAttribute_IsSkippedForNamespaceMap() {
        org.jsoup.nodes.Document jdoc = Jsoup.parse("<html><body></body></html>");

        org.jsoup.nodes.Element div = new org.jsoup.nodes.Element(Tag.valueOf("div"), "");
        div.attr("class", "foo"); // ไม่ใช่ xmlns* -> เข้า else -> continue, ไม่กระทบ namespace
        jdoc.body().appendChild(div);

        org.w3c.dom.Document wdoc = w3c.fromJsoup(jdoc);
        org.w3c.dom.Element wDiv = (org.w3c.dom.Element) wdoc.getElementsByTagName("div").item(0);

        assertNull(wDiv.getNamespaceURI());
        assertEquals("foo", wDiv.getAttribute("class"));
    }

    @Test
    public void updateNamespaces_NoPrefixInTagName_PrefixIsEmptyString() {
        // tagName ไม่มี ':' -> pos == -1 -> prefix = ""
        org.jsoup.nodes.Document jdoc = Jsoup.parse("<html><body><div></div></body></html>");
        org.w3c.dom.Document wdoc = w3c.fromJsoup(jdoc);

        org.w3c.dom.Element wDiv = (org.w3c.dom.Element) wdoc.getElementsByTagName("div").item(0);
        // ไม่มี xmlns ใดๆ ใน ancestor -> namespace สำหรับ prefix "" เป็น null
        assertNull(wDiv.getNamespaceURI());
    }

    // ---------- asString ----------

    @Test
    public void asString_SerializesDocumentToNonEmptyString() {
        org.jsoup.nodes.Document jdoc = Jsoup.parse("<html><body><p>Hi</p></body></html>");
        org.w3c.dom.Document wdoc = w3c.fromJsoup(jdoc);

        String result = w3c.asString(wdoc);

        assertNotNull(result);
        assertTrue(result.length() > 0);
        assertTrue(result.contains("Hi"));
        assertTrue(result.contains("p"));
    }
}
```

## สรุปการครอบคลุม Branch/Condition

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `fromJsoup_NullInput_ThrowsException` | `Validate.notNull(in)` — null branch |
| `fromJsoup_BasicConversion_ReturnsRootElement` | `fromJsoup` happy path, สร้าง root element (`dest==null` ครั้งแรกใน `head()`) |
| `fromJsoup_EmptyHtmlInput_StillProducesHtmlRoot` | boundary: input ว่าง, ยังมี root ให้ convert |
| `convert_BlankLocation_DocumentURINotSet` | `convert()`: `StringUtil.isBlank(location)` == true (ไม่ set URI) |
| `convert_NonBlankLocation_DocumentURIIsSet` | `convert()`: `StringUtil.isBlank(location)` == false (set URI) |
| `head_TextNodeBranch_CopiesTextContent` | `head()`: `instanceof TextNode` branch |
| `head_CommentBranch_CopiesCommentData` | `head()`: `instanceof Comment` branch |
| `head_DataNodeBranch_CopiesScriptContent` | `head()`: `instanceof DataNode` branch |
| `headTail_MultipleSiblings_CorrectNestingAfterUndescend` | `head()`: `dest!=null` (append to parent), `tail()`: `instanceof Element && parent instanceof Element` == true, pop/undescend ถูกต้อง |
| `copyAttributes_ValidInvalidAndDigitLeadingKeys` | `copyAttributes()`: regex match true (เก็บ attr), false (ตัดทิ้ง), key ว่างหลัง sanitize |
| `updateNamespaces_DefaultXmlnsAttribute_SetsNamespaceURI` | `updateNamespaces()`: `key.equals("xmlns")` == true |
| `updateNamespaces_PrefixedXmlnsAttribute_SetsNamespaceForPrefixedTag` | `updateNamespaces()`: `key.startsWith("xmlns:")` == true, `pos>0` prefix extraction |
| `updateNamespaces_NonXmlnsAttribute_IsSkippedForNamespaceMap` | `updateNamespaces()`: else → `continue` branch |
| `updateNamespaces_NoPrefixInTagName_PrefixIsEmptyString` | `updateNamespaces()`: `pos > 0` == false → prefix = `""` |
| `asString_SerializesDocumentToNonEmptyString` | `asString()`: happy path serialization (try branch, ไม่ throw) |

**หมายเหตุ:** branch `else { // unhandled }` ใน `head()` (สำหรับ Node ที่ไม่ใช่ Element/TextNode/Comment/DataNode เช่น `DocumentType`) และ branch catch `ParserConfigurationException`/`TransformerException` ไม่ได้ถูกทดสอบ เนื่องจากต้องพึ่งพาเงื่อนไขภายในของไลบรารี jsoup/JAXP ที่ไม่ได้ระบุในซอร์สของคลาสเป้าหมาย จึงไม่เขียนเทสเพื่อป้องกันการเดา behavior ตามข้อกำหนดที่ 4
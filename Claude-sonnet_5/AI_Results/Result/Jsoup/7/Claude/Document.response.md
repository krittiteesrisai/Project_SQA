# วิเคราะห์โค้ดและแนวทางการทดสอบ

จากการวิเคราะห์ `Document` class พบ branch/condition หลักที่ต้องครอบคลุม:
- `createShell()`: `Validate.notNull(baseUri)` (null/not-null)
- `head()`/`body()`/`findFirstElementByTagName`: พบ element / ไม่พบ (recursive, return null)
- `title()`: titleEl null / not null
- `title(String)`: `Validate.notNull(title)`, titleEl null (เพิ่มเข้า head) / not null (แก้ไข text เดิม)
- `normalise()`: htmlEl null/not null, head() null/not null, body() null/not null
- `normaliseTextNodes()`: text node isBlank() true/false (ย้าย/ไม่ย้าย)
- `OutputSettings.indentAmount(int)`: `Validate.isTrue(indentAmount >= 0)` (boundary 0, negative)
- getter/setter อื่น ๆ ของ `OutputSettings`

```java
package org.jsoup.nodes;

import org.junit.Test;
import java.nio.charset.Charset;

import static org.junit.Assert.*;

public class DocumentTest {

    // ---------- Constructor / nodeName ----------

    @Test
    public void testConstructor_SetsBaseUriAndNodeName() {
        Document doc = new Document("http://example.com/");
        assertEquals("http://example.com/", doc.baseUri());
        assertEquals("#document", doc.nodeName());
    }

    // ---------- createShell ----------

    @Test
    public void testCreateShell_CreatesHtmlHeadBody() {
        Document doc = Document.createShell("http://example.com/");
        assertEquals(1, doc.getElementsByTag("html").size());
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateShell_NullBaseUri_ThrowsException() {
        Document.createShell(null);
    }

    @Test
    public void testCreateShell_EmptyBaseUri_DoesNotThrow() {
        // empty string ไม่ใช่ null -> Validate.notNull ผ่าน
        Document doc = Document.createShell("");
        assertNotNull(doc);
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

    // ---------- head() / body() ----------

    @Test
    public void testHead_NoHeadPresent_ReturnsNull() {
        Document doc = new Document("http://example.com/");
        assertNull(doc.head());
    }

    @Test
    public void testBody_NoBodyPresent_ReturnsNull() {
        Document doc = new Document("http://example.com/");
        assertNull(doc.body());
    }

    @Test
    public void testHeadBody_WhenShellCreated_NotNull() {
        Document doc = Document.createShell("http://example.com/");
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

    // ---------- title() getter ----------

    @Test
    public void testTitle_NoTitleElement_ReturnsEmptyString() {
        Document doc = Document.createShell("http://example.com/");
        assertEquals("", doc.title());
    }

    @Test
    public void testTitle_WithTitleElement_ReturnsTrimmedText() {
        Document doc = Document.createShell("http://example.com/");
        doc.head().appendElement("title").text("  My Title  ");
        assertEquals("My Title", doc.title());
    }

    // ---------- title(String) setter ----------

    @Test
    public void testSetTitle_WhenNoTitleElement_AddsToHead() {
        Document doc = Document.createShell("http://example.com/");
        doc.title("New Title");
        assertEquals("New Title", doc.title());
        assertEquals(1, doc.head().getElementsByTag("title").size());
    }

    @Test
    public void testSetTitle_WhenTitleElementExists_UpdatesText() {
        Document doc = Document.createShell("http://example.com/");
        doc.head().appendElement("title").text("Old");
        doc.title("Updated");
        assertEquals("Updated", doc.title());
        // ต้องไม่มีการสร้าง title ซ้ำ
        assertEquals(1, doc.head().getElementsByTag("title").size());
    }

    @Test
    public void testSetTitle_EmptyString_DoesNotThrow() {
        Document doc = Document.createShell("http://example.com/");
        doc.title("");
        assertEquals("", doc.title());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetTitle_Null_ThrowsException() {
        Document doc = Document.createShell("http://example.com/");
        doc.title(null);
    }

    // ---------- createElement ----------

    @Test
    public void testCreateElement_CreatesDetachedElementWithBaseUri() {
        Document doc = new Document("http://example.com/");
        Element el = doc.createElement("div");
        assertEquals("div", el.tagName());
        assertEquals(doc.baseUri(), el.baseUri());
        assertNull(el.parent()); // ยังไม่ถูกผูกเป็นลูกของ document
    }

    // ---------- normalise() ----------

    @Test
    public void testNormalise_EmptyDocument_CreatesHtmlHeadBody() {
        Document doc = new Document("http://example.com/");
        doc.normalise();
        assertEquals(1, doc.getElementsByTag("html").size());
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

    @Test
    public void testNormalise_HtmlExists_HeadMissing_AddsHeadAsFirstChild() {
        Document doc = new Document("http://example.com/");
        Element html = doc.appendElement("html");
        html.appendElement("body");
        doc.normalise();
        assertNotNull(doc.head());
        // head ควรถูก prepend เป็นลูกแรกของ html
        assertEquals("head", html.child(0).tagName());
    }

    @Test
    public void testNormalise_HtmlExists_BodyMissing_AddsBody() {
        Document doc = new Document("http://example.com/");
        Element html = doc.appendElement("html");
        html.appendElement("head");
        doc.normalise();
        assertNotNull(doc.body());
    }

    @Test
    public void testNormalise_AllPresent_NoDuplicateAdded() {
        Document doc = Document.createShell("http://example.com/");
        doc.normalise();
        assertEquals(1, doc.getElementsByTag("html").size());
        assertEquals(1, doc.getElementsByTag("head").size());
        assertEquals(1, doc.getElementsByTag("body").size());
    }

    @Test
    public void testNormalise_MovesNonBlankTextNodeFromRootToBody() {
        Document doc = Document.createShell("http://example.com/");
        doc.appendChild(new TextNode("Hello", ""));
        doc.normalise();
        String bodyText = doc.body().text();
        assertTrue("ข้อความ 'Hello' ควรถูกย้ายไปที่ body",
                bodyText.contains("Hello"));
    }

    @Test
    public void testNormalise_SkipsBlankTextNode() {
        Document doc = Document.createShell("http://example.com/");
        doc.appendChild(new TextNode("   ", "")); // blank text node
        doc.normalise();
        // blank text node ไม่ควรถูกย้าย (isBlank() == true -> ไม่อยู่ใน toMove)
        assertEquals("", doc.body().text().trim());
    }

    // ---------- outerHtml() ----------

    @Test
    public void testOuterHtml_NoOuterWrapperTag() {
        Document doc = Document.createShell("http://example.com/");
        String outer = doc.outerHtml();
        assertTrue(outer.contains("<html>"));
        assertFalse(outer.contains("#document"));
    }

    // ---------- text(String) ----------

    @Test
    public void testTextSetter_SetsBodyText() {
        Document doc = Document.createShell("http://example.com/");
        Element returned = doc.text("Hello World");
        assertEquals("Hello World", doc.body().text());
        assertSame(doc, returned); // ควร return this
    }

    // ---------- OutputSettings ----------

    @Test
    public void testOutputSettings_DefaultEscapeModeIsBase() {
        Document doc = new Document("http://example.com/");
        assertEquals(Entities.EscapeMode.base, doc.outputSettings().escapeMode());
    }

    @Test
    public void testOutputSettings_SetEscapeMode() {
        Document doc = new Document("http://example.com/");
        Document.OutputSettings os = doc.outputSettings();
        Document.OutputSettings returned = os.escapeMode(Entities.EscapeMode.extended);
        assertEquals(Entities.EscapeMode.extended, os.escapeMode());
        assertSame(os, returned);
    }

    @Test
    public void testOutputSettings_DefaultCharsetIsUTF8() {
        Document doc = new Document("http://example.com/");
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void testOutputSettings_SetCharsetObject_UpdatesCharsetAndEncoder() {
        Document doc = new Document("http://example.com/");
        Document.OutputSettings os = doc.outputSettings();
        os.charset(Charset.forName("ISO-8859-1"));
        assertEquals("ISO-8859-1", os.charset().name());
        assertEquals("ISO-8859-1", os.encoder().charset().name());
    }

    @Test
    public void testOutputSettings_SetCharsetByName() {
        Document doc = new Document("http://example.com/");
        Document.OutputSettings os = doc.outputSettings();
        os.charset("ISO-8859-1");
        assertEquals("ISO-8859-1", os.charset().name());
    }

    @Test
    public void testOutputSettings_DefaultPrettyPrintTrue() {
        Document doc = new Document("http://example.com/");
        assertTrue(doc.outputSettings().prettyPrint());
    }

    @Test
    public void testOutputSettings_SetPrettyPrintFalse() {
        Document doc = new Document("http://example.com/");
        Document.OutputSettings os = doc.outputSettings();
        os.prettyPrint(false);
        assertFalse(os.prettyPrint());
    }

    @Test
    public void testOutputSettings_DefaultIndentAmountIsOne() {
        Document doc = new Document("http://example.com/");
        assertEquals(1, doc.outputSettings().indentAmount());
    }

    @Test
    public void testOutputSettings_SetIndentAmount_BoundaryZero() {
        Document doc = new Document("http://example.com/");
        Document.OutputSettings os = doc.outputSettings();
        os.indentAmount(0); // boundary: 0 ยังถูกต้อง (>=0)
        assertEquals(0, os.indentAmount());
    }

    @Test
    public void testOutputSettings_SetIndentAmount_PositiveValue() {
        Document doc = new Document("http://example.com/");
        Document.OutputSettings os = doc.outputSettings();
        os.indentAmount(4);
        assertEquals(4, os.indentAmount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutputSettings_SetIndentAmount_Negative_ThrowsException() {
        Document doc = new Document("http://example.com/");
        doc.outputSettings().indentAmount(-1);
    }
}
```

## ตารางสรุป Test Case กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testConstructor_SetsBaseUriAndNodeName | constructor, `nodeName()` |
| testCreateShell_CreatesHtmlHeadBody | `createShell`, `Validate.notNull` (ผ่าน) |
| testCreateShell_NullBaseUri_ThrowsException | `Validate.notNull` (baseUri == null) |
| testCreateShell_EmptyBaseUri_DoesNotThrow | boundary: empty string ไม่ใช่ null |
| testHead_NoHeadPresent_ReturnsNull | `findFirstElementByTagName` ไม่พบ -> null |
| testBody_NoBodyPresent_ReturnsNull | เช่นเดียวกันสำหรับ body |
| testHeadBody_WhenShellCreated_NotNull | `findFirstElementByTagName` พบ element (recursive match) |
| testTitle_NoTitleElement_ReturnsEmptyString | `title()`: titleEl == null branch |
| testTitle_WithTitleElement_ReturnsTrimmedText | `title()`: titleEl != null branch |
| testSetTitle_WhenNoTitleElement_AddsToHead | `title(String)`: titleEl == null branch |
| testSetTitle_WhenTitleElementExists_UpdatesText | `title(String)`: else branch |
| testSetTitle_EmptyString_DoesNotThrow | boundary ค่าว่าง (ไม่ null) |
| testSetTitle_Null_ThrowsException | `Validate.notNull(title)` |
| testCreateElement_CreatesDetachedElementWithBaseUri | `createElement` |
| testNormalise_EmptyDocument_CreatesHtmlHeadBody | `normalise()`: htmlEl==null, head()==null, body()==null (ทุกเงื่อนไข true) |
| testNormalise_HtmlExists_HeadMissing_AddsHeadAsFirstChild | htmlEl!=null, head()==null, body()!=null |
| testNormalise_HtmlExists_BodyMissing_AddsBody | htmlEl!=null, head()!=null, body()==null |
| testNormalise_AllPresent_NoDuplicateAdded | htmlEl!=null, head()!=null, body()!=null (ทุกเงื่อนไข false) |
| testNormalise_MovesNonBlankTextNodeFromRootToBody | `normaliseTextNodes`: `tn.isBlank()==false` -> moved |
| testNormalise_SkipsBlankTextNode | `normaliseTextNodes`: `tn.isBlank()==true` -> skip |
| testOuterHtml_NoOuterWrapperTag | `outerHtml()` |
| testTextSetter_SetsBodyText | `text(String)` override |
| testOutputSettings_DefaultEscapeModeIsBase | `OutputSettings.escapeMode()` default |
| testOutputSettings_SetEscapeMode | `escapeMode(EscapeMode)` setter + chaining |
| testOutputSettings_DefaultCharsetIsUTF8 | `charset()` default |
| testOutputSettings_SetCharsetObject_UpdatesCharsetAndEncoder | `charset(Charset)`, `encoder()` |
| testOutputSettings_SetCharsetByName | `charset(String)` |
| testOutputSettings_DefaultPrettyPrintTrue | `prettyPrint()` default |
| testOutputSettings_SetPrettyPrintFalse | `prettyPrint(boolean)` setter |
| testOutputSettings_DefaultIndentAmountIsOne | `indentAmount()` default |
| testOutputSettings_SetIndentAmount_BoundaryZero | `Validate.isTrue(indentAmount>=0)` boundary 0 |
| testOutputSettings_SetIndentAmount_PositiveValue | ค่า indent ปกติ |
| testOutputSettings_SetIndentAmount_Negative_ThrowsException | `Validate.isTrue` (false branch -> exception) |

**หมายเหตุ:** พฤติกรรมเรื่องลำดับการจัดเรียง node ภายใน `normaliseTextNodes` (เช่นตำแหน่ง TextNode(" ","") ที่ถูกแทรก) ไม่ได้ถูกตรวจสอบแบบละเอียด เนื่องจากซอร์สโค้ดไม่ได้ระบุผลลัพธ์ที่แน่นอนของลำดับ จึงทดสอบเพียงว่าข้อความที่ไม่ blank ถูกย้ายไปยัง body จริง และข้อความ blank ไม่ถูกย้าย เพื่อไม่ guess behavior ที่ไม่มีหลักฐานชัดเจนในซอร์ส
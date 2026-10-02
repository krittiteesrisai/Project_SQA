# การวิเคราะห์

จากซอร์สโค้ด `Comment` มี branch/condition หลักที่ต้องทดสอบ:

1. **`isXmlDeclaration()`**: `data.length() > 1 && (startsWith("!") || startsWith("?"))`
   - length == 0 → false (short-circuit)
   - length == 1 → false (short-circuit)
   - length > 1 && startsWith("!") → true
   - length > 1 && startsWith("?") → true
   - length > 1 && ไม่ตรงทั้งคู่ → false

2. **`asXmlDeclaration()`**: `if (doc.childNodeSize() > 0)`
   - true → สร้าง `XmlDeclaration` คืนค่า
   - false → คืนค่า `null`
   - กรณี data สั้นเกินไป (`substring(1, length-1)` กับ length ≤ 1) → เกิด `StringIndexOutOfBoundsException` (edge case ที่อาจเป็น fault)

3. **`outerHtmlHead()`**: `if (out.prettyPrint())` → true/false branch

4. Constructor ทั้งสอง, `nodeName()`, `getData()`, `toString()`

```java
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

public class CommentTest {

    // ---------- Basic constructor / nodeName / getData ----------

    @Test
    public void testConstructorAndGetData() {
        Comment c = new Comment("a comment");
        assertEquals("a comment", c.getData());
    }

    @Test
    public void testNodeName() {
        Comment c = new Comment("x");
        assertEquals("#comment", c.nodeName());
    }

    @Test
    public void testDeprecatedConstructorDelegatesToMainConstructor() {
        // ตาม source: Comment(data, baseUri) เรียก this(data) เท่านั้น ไม่ได้ใช้ baseUri
        Comment c = new Comment("deprecated-data", "http://example.com/");
        assertEquals("deprecated-data", c.getData());
    }

    @Test
    public void testGetDataEmptyString() {
        Comment c = new Comment("");
        assertEquals("", c.getData());
    }

    // ---------- isXmlDeclaration() branch coverage ----------

    @Test
    public void testIsXmlDeclaration_EmptyString_LengthZero() {
        // length == 0 -> false (short-circuit, ไม่ถึง startsWith)
        Comment c = new Comment("");
        assertFalse(c.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclaration_SingleChar_LengthOne() {
        // length == 1 แม้ขึ้นต้นด้วย '!' ก็ต้องเป็น false เพราะเงื่อนไข length > 1 ไม่ผ่าน
        Comment c = new Comment("!");
        assertFalse(c.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclaration_StartsWithExclamation_True() {
        // length > 1 และ startsWith("!") -> true (minimal boundary length=2)
        Comment c = new Comment("!a");
        assertTrue(c.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclaration_StartsWithQuestion_True() {
        // length > 1 และ startsWith("?") -> true (minimal boundary length=2)
        Comment c = new Comment("?a");
        assertTrue(c.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclaration_NoMatch_False() {
        // length > 1 แต่ไม่ตรงทั้ง "!" และ "?" -> false
        Comment c = new Comment("ab");
        assertFalse(c.isXmlDeclaration());
    }

    // ---------- asXmlDeclaration() branch coverage ----------

    @Test
    public void testAsXmlDeclaration_ValidXml_ReturnsNonNull_StartsWithQuestion() {
        // data ที่ substring(1, len-1) ได้ fragment XML ที่ valid -> childNodeSize() > 0
        Comment c = new Comment("?xml version=\"1.0\"?");
        XmlDeclaration decl = c.asXmlDeclaration();
        assertNotNull(decl);
        // ใช้ attr() ซึ่งเป็น public API มาตรฐานของ Node เพื่อยืนยันว่า attribute ถูกคัดลอกมาจริง
        assertEquals("1.0", decl.attr("version"));
    }

    @Test
    public void testAsXmlDeclaration_ValidXml_ReturnsNonNull_StartsWithExclamation() {
        // ตรวจสาขา startsWith("!") แยกจากกรณี "?" ข้างบน
        Comment c = new Comment("!root");
        XmlDeclaration decl = c.asXmlDeclaration();
        assertNotNull(decl);
    }

    @Test
    public void testAsXmlDeclaration_NoChildNode_ReturnsNull() {
        // หมายเหตุ/ข้อสังเกต: data length = 2 -> substring(1,1) = "" -> wrapped เป็น "<>"
        // ซึ่งไม่สามารถ parse เป็น element ได้ (ไม่มีชื่อ tag) จึงคาดว่า childNodeSize() == 0
        // Assumption นี้อิงพฤติกรรมของ Jsoup XML parser ซึ่งเป็น external behavior
        // ไม่ใช่ logic ภายในคลาส Comment เอง
        Comment c = new Comment("!!");
        XmlDeclaration decl = c.asXmlDeclaration();
        assertNull(decl);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAsXmlDeclaration_EmptyData_ThrowsException() {
        // boundary case: data.length() == 0 -> substring(1, -1) ต้อง throw
        // สะท้อนว่า asXmlDeclaration() ไม่ได้ guard กรณีนี้เอง (อาจเป็นช่องโหว่/fault ที่ควร
        // เรียก isXmlDeclaration() ตรวจก่อนเสมอ)
        Comment c = new Comment("");
        c.asXmlDeclaration();
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAsXmlDeclaration_SingleCharData_ThrowsException() {
        // boundary case: data.length() == 1 -> substring(1, 0) ต้อง throw
        Comment c = new Comment("!");
        c.asXmlDeclaration();
    }

    // ---------- toString() / outerHtmlHead() prettyPrint branch ----------

    @Test
    public void testToString_ContainsCommentMarkers() {
        Comment c = new Comment("hello");
        String html = c.toString();
        // ไม่ assert ตำแหน่ง/การขึ้นบรรทัดใหม่ของ indent() เพราะไม่ได้อยู่ใน source ที่ให้มา
        assertTrue(html.contains("<!--"));
        assertTrue(html.contains("hello"));
        assertTrue(html.contains("-->"));
    }

    @Test
    public void testOuterHtml_PrettyPrintFalse_ExactOutput() {
        // แนบ Comment เข้า Document แล้วปิด prettyPrint เพื่อบังคับ branch
        // if (out.prettyPrint()) เป็น false -> ไม่มีการเรียก indent() เลย
        // ดังนั้นผลลัพธ์ควรเท่ากับ "<!--" + data + "-->" พอดี (deterministic)
        Document doc = Document.createShell("");
        doc.outputSettings().prettyPrint(false);
        Comment c = new Comment("x");
        doc.body().appendChild(c);
        assertEquals("<!--x-->", c.outerHtml());
    }

    @Test
    public void testOuterHtml_PrettyPrintTrue_BranchExecuted() {
        // บังคับ branch if (out.prettyPrint()) เป็น true
        // ไม่ assert รูปแบบ indent() ที่แน่นอน เพราะ logic ของ indent() ไม่ได้อยู่ใน source ที่ให้มา
        Document doc = Document.createShell("");
        doc.outputSettings().prettyPrint(true);
        Comment c = new Comment("y");
        doc.body().appendChild(c);
        String html = c.outerHtml();
        assertTrue(html.contains("<!--y-->"));
    }

    @Test
    public void testOuterHtmlTail_DoesNotThrow_NoAdditionalOutput() {
        // outerHtmlTail() เป็น empty method -> ตรวจว่า outerHtml() ไม่มีข้อมูลเกินจากที่ outerHtmlHead สร้าง
        Document doc = Document.createShell("");
        doc.outputSettings().prettyPrint(false);
        Comment c = new Comment("z");
        doc.body().appendChild(c);
        assertEquals("<!--z-->", c.outerHtml());
    }
}
```

## สรุป Branch/Condition Coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testConstructorAndGetData` | Constructor หลัก + `getData()` baseline |
| `testNodeName` | `nodeName()` คืนค่า `#comment` |
| `testDeprecatedConstructorDelegatesToMainConstructor` | Constructor สองพารามิเตอร์ (deprecated) delegate ไปยัง constructor หลัก |
| `testGetDataEmptyString` | `getData()` กับ string ว่าง |
| `testIsXmlDeclaration_EmptyString_LengthZero` | `isXmlDeclaration()`: length==0 → false (short-circuit) |
| `testIsXmlDeclaration_SingleChar_LengthOne` | `isXmlDeclaration()`: length==1 → false (boundary) |
| `testIsXmlDeclaration_StartsWithExclamation_True` | length>1 && startsWith("!") → true |
| `testIsXmlDeclaration_StartsWithQuestion_True` | length>1 && startsWith("?") → true |
| `testIsXmlDeclaration_NoMatch_False` | length>1 && ไม่ตรงทั้งคู่ → false |
| `testAsXmlDeclaration_ValidXml_ReturnsNonNull_StartsWithQuestion` | `asXmlDeclaration()`: `childNodeSize()>0` → true, "?" prefix |
| `testAsXmlDeclaration_ValidXml_ReturnsNonNull_StartsWithExclamation` | `childNodeSize()>0` → true, "!" prefix |
| `testAsXmlDeclaration_NoChildNode_ReturnsNull` | `childNodeSize()>0` → false (คืน null) |
| `testAsXmlDeclaration_EmptyData_ThrowsException` | boundary: data length=0 → exception (fault-finding) |
| `testAsXmlDeclaration_SingleCharData_ThrowsException` | boundary: data length=1 → exception (fault-finding) |
| `testToString_ContainsCommentMarkers` | `toString()` → `outerHtml()` → `outerHtmlHead()`/`outerHtmlTail()` ถูกเรียก |
| `testOuterHtml_PrettyPrintFalse_ExactOutput` | `outerHtmlHead()`: `if (out.prettyPrint())` → false branch |
| `testOuterHtml_PrettyPrintTrue_BranchExecuted` | `outerHtmlHead()`: `if (out.prettyPrint())` → true branch |
| `testOuterHtmlTail_DoesNotThrow_NoAdditionalOutput` | `outerHtmlTail()` (empty method) ไม่เพิ่ม output |

**หมายเหตุสำคัญ:** เคส `testAsXmlDeclaration_NoChildNode_ReturnsNull` อิงพฤติกรรมของ `Jsoup.parse` กับ XML parser ภายนอก (ไม่ได้อยู่ใน source ของ `Comment`) — หากพฤติกรรม parser เปลี่ยนไป อาจต้องปรับ test data ใหม่
# JUnit 4 Test Suite สำหรับ DocumentType

## การวิเคราะห์ Source Code

จากการวิเคราะห์ `DocumentType` class พบ branch ที่ต้องทดสอบ:
1. **Constructor**: เซ็ต attr 3 ค่า (name, publicId, systemId) — ไม่มี branch แต่ต้องทดสอบ boundary (null/empty)
2. **nodeName()**: คืนค่าคงที่ "#doctype" — ไม่มี branch
3. **outerHtmlHead()**: มี 2 if-conditions ที่ตรวจสอบ `StringUtil.isBlank()` → แต่ละ if มี 2 branches (true/false) = รวม 4 combinations
4. **outerHtmlTail()**: ไม่มี logic (no-op) — ทดสอบว่าไม่แก้ไข StringBuilder

**หมายเหตุสำคัญ**: `outerHtmlHead()` และ `outerHtmlTail()` เป็น package-private (no modifier) ดังนั้น test class ต้องอยู่ใน package เดียวกัน (`org.jsoup.nodes`) เพื่อเรียกใช้ได้โดยตรง

```java
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for {@link DocumentType}
 * หมายเหตุ: ใส่ test class ใน package org.jsoup.nodes
 * เนื่องจาก outerHtmlHead/outerHtmlTail เป็น package-private methods
 */
public class DocumentTypeTest {

    // ---------- nodeName() ----------

    @Test
    public void testNodeNameReturnsDoctype() {
        DocumentType dt = new DocumentType("html", "pub", "sys", "base");
        assertEquals("#doctype", dt.nodeName());
    }

    @Test
    public void testNodeNameConstantRegardlessOfInput() {
        // ตรวจสอบว่า nodeName() คืนค่าคงที่เสมอ ไม่ขึ้นกับพารามิเตอร์
        DocumentType dt = new DocumentType("", "", "", "");
        assertEquals("#doctype", dt.nodeName());
    }

    // ---------- Constructor: attribute assignment ----------

    @Test
    public void testConstructorSetsAllAttributesCorrectly() {
        DocumentType dt = new DocumentType("html", "pub-id", "sys-id", "http://base");
        assertEquals("html", dt.attr("name"));
        assertEquals("pub-id", dt.attr("publicId"));
        assertEquals("sys-id", dt.attr("systemId"));
    }

    @Test
    public void testConstructorWithEmptyStrings() {
        DocumentType dt = new DocumentType("", "", "", "");
        assertEquals("", dt.attr("name"));
        assertEquals("", dt.attr("publicId"));
        assertEquals("", dt.attr("systemId"));
    }

    @Test
    public void testConstructorWithNullValues() {
        // หมายเหตุ: ไม่แน่ใจ behavior ของ attr() เมื่อรับค่า null
        // (อาจ throw NPE หรือเก็บเป็น null/empty string ขึ้นกับ implementation ของ Attributes)
        // จึงทดสอบเพียงว่า constructor ไม่ throw exception และ nodeName() ยังทำงานถูกต้อง
        DocumentType dt = new DocumentType(null, null, null, null);
        assertEquals("#doctype", dt.nodeName());
    }

    // ---------- outerHtmlHead(): Branch coverage ----------

    @Test
    public void testOuterHtmlHead_PublicIdNull_SystemIdNull() {
        // branch: both if-conditions FALSE (isBlank -> true สำหรับทั้งคู่)
        DocumentType dt = new DocumentType("html", null, null, "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("<!DOCTYPE html>", sb.toString());
    }

    @Test
    public void testOuterHtmlHead_PublicIdEmpty_SystemIdEmpty() {
        // branch: isBlank("") -> true สำหรับทั้งคู่ -> ทั้งสอง if FALSE
        DocumentType dt = new DocumentType("html", "", "", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("<!DOCTYPE html>", sb.toString());
    }

    @Test
    public void testOuterHtmlHead_PublicIdWhitespace_SystemIdWhitespace() {
        // boundary case: whitespace-only string ควรถูกมองว่า blank
        DocumentType dt = new DocumentType("html", "   ", "   ", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("<!DOCTYPE html>", sb.toString());
    }

    @Test
    public void testOuterHtmlHead_PublicIdOnly() {
        // branch: if(publicId) TRUE, if(systemId) FALSE
        DocumentType dt = new DocumentType("html", "foo-pub", null, "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("<!DOCTYPE html PUBLIC \"foo-pub\">", sb.toString());
    }

    @Test
    public void testOuterHtmlHead_SystemIdOnly() {
        // branch: if(publicId) FALSE, if(systemId) TRUE
        DocumentType dt = new DocumentType("html", null, "bar-sys", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("<!DOCTYPE html bar-sys\">", sb.toString());
    }

    @Test
    public void testOuterHtmlHead_BothPublicIdAndSystemIdPresent() {
        // branch: ทั้งสอง if TRUE
        DocumentType dt = new DocumentType("html", "foo-pub", "bar-sys", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("<!DOCTYPE html PUBLIC \"foo-pub\" bar-sys\">", sb.toString());
    }

    @Test
    public void testOuterHtmlHead_WithRealWorldDtdStrings() {
        // ทดสอบด้วยค่าจริงที่ใช้งานบ่อย (XHTML strict DTD)
        DocumentType dt = new DocumentType(
                "html",
                "-//W3C//DTD XHTML 1.0 Strict//EN",
                "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd",
                "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, new Document.OutputSettings());
        String expected = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\""
                + " http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">";
        assertEquals(expected, sb.toString());
    }

    @Test
    public void testOuterHtmlHead_AppendsToExistingContent() {
        // ตรวจสอบว่า method append ต่อจาก StringBuilder ที่มีข้อมูลอยู่แล้ว (ไม่ clear)
        DocumentType dt = new DocumentType("html", null, null, "");
        StringBuilder sb = new StringBuilder("PREFIX-");
        dt.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("PREFIX-<!DOCTYPE html>", sb.toString());
    }

    // ---------- outerHtmlTail(): No-op verification ----------

    @Test
    public void testOuterHtmlTail_DoesNotModifyStringBuilder() {
        // ตามซอร์สโค้ด outerHtmlTail ไม่มี logic ใดๆ (empty method body)
        DocumentType dt = new DocumentType("html", "foo", "bar", "");
        StringBuilder sb = new StringBuilder("unchanged-content");
        dt.outerHtmlTail(sb, 0, new Document.OutputSettings());
        assertEquals("unchanged-content", sb.toString());
    }

    @Test
    public void testOuterHtmlTail_WithEmptyStringBuilder() {
        DocumentType dt = new DocumentType("html", "foo", "bar", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlTail(sb, 0, new Document.OutputSettings());
        assertEquals("", sb.toString());
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testNodeNameReturnsDoctype` | nodeName() คืนค่าคงที่ (basic case) |
| `testNodeNameConstantRegardlessOfInput` | nodeName() ไม่ขึ้นกับ constructor params |
| `testConstructorSetsAllAttributesCorrectly` | Constructor: attr assignment ปกติ |
| `testConstructorWithEmptyStrings` | Constructor boundary: empty string values |
| `testConstructorWithNullValues` | Constructor boundary: null values (fault-detection potential) |
| `testOuterHtmlHead_PublicIdNull_SystemIdNull` | if(publicId)=**FALSE**, if(systemId)=**FALSE** |
| `testOuterHtmlHead_PublicIdEmpty_SystemIdEmpty` | isBlank("")=true → ทั้งสอง if **FALSE** |
| `testOuterHtmlHead_PublicIdWhitespace_SystemIdWhitespace` | Boundary: whitespace treated as blank → ทั้งสอง if **FALSE** |
| `testOuterHtmlHead_PublicIdOnly` | if(publicId)=**TRUE**, if(systemId)=**FALSE** |
| `testOuterHtmlHead_SystemIdOnly` | if(publicId)=**FALSE**, if(systemId)=**TRUE** |
| `testOuterHtmlHead_BothPublicIdAndSystemIdPresent` | if(publicId)=**TRUE**, if(systemId)=**TRUE** |
| `testOuterHtmlHead_WithRealWorldDtdStrings` | TRUE/TRUE branch ด้วย realistic data (fault detection) |
| `testOuterHtmlHead_AppendsToExistingContent` | ยืนยันว่า method append (ไม่ clear) StringBuilder |
| `testOuterHtmlTail_DoesNotModifyStringBuilder` | outerHtmlTail เป็น no-op (มี content) |
| `testOuterHtmlTail_WithEmptyStringBuilder` | outerHtmlTail เป็น no-op (empty) |

### Branch Coverage Summary สำหรับ `outerHtmlHead()`:
- **4/4 combinations** ของ 2 if-conditions ถูกครอบคลุมครบ (TRUE-TRUE, TRUE-FALSE, FALSE-TRUE, FALSE-FALSE)
- **Boundary cases**: null, empty string, whitespace-only string ถูกทดสอบเพื่อยืนยัน `StringUtil.isBlank()` behavior

### ข้อจำกัดที่ระบุไว้ (ตามข้อกำหนดที่ 4):
- `testConstructorWithNullValues`: ไม่ assert ค่า attr เนื่องจากไม่มีซอร์สโค้ดของ `Attributes`/`attr()` method ให้ตรวจสอบว่า null value จะถูกจัดการอย่างไร (อาจ throw NPE หรือเก็บเป็นค่า default)
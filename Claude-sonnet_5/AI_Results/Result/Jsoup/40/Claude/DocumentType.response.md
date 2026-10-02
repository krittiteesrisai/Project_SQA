# คำตอบ: JUnit 4 Test สำหรับ `DocumentType` (Jsoup-40b)

## หมายเหตุสำคัญก่อนดูโค้ด

1. **ตำแหน่ง package ของ test class**: วางไว้ใน `org.jsoup.nodes` (package เดียวกับคลาสเป้าหมาย) เพื่อให้สามารถเรียก `outerHtmlHead()` และ `outerHtmlTail()` ที่เป็น **package-private** ได้ตรง ๆ ซึ่งทำให้ควบคุม branch ได้แม่นยำกว่าการพึ่งพา `outerHtml()` (public) ที่สืบทอดมาจาก `Node` (ไม่ได้แสดงใน source ที่ให้มา)
2. ตาม requirement ข้อ 2 จะยังคงมี `import org.jsoup.nodes.DocumentType;` ไว้ (ถึงจะ redundant เพราะ class อยู่ package เดียวกัน แต่ Java compile ผ่านได้ปกติ ไม่ error)
3. สมมติฐานที่ไม่ปรากฏตรงใน source ที่ให้มา (ทำเครื่องหมาย comment ไว้ในโค้ด):
   - `Validate.notEmpty(String)` throw `IllegalArgumentException` เมื่อ `null`/`""` (เป็น public utility ที่ใช้ทั่วไปใน jsoup แต่ไม่ได้แสดง source)
   - `Node.attr(String key, String value)` เป็น public method (ใช้ภายใน constructor ของ DocumentType เอง จึงอนุมานได้ว่า accessible)
   - `Document.OutputSettings` มี public no-arg constructor

## โค้ดทดสอบ

```java
package org.jsoup.nodes;

// ตามข้อกำหนด ให้ import คลาสเป้าหมาย (แม้จะ redundant เนื่องจากอยู่ package เดียวกัน)
import org.jsoup.nodes.DocumentType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DocumentTypeTest {

    private Document.OutputSettings out;

    @Before
    public void setUp() {
        // สมมติฐาน: Document.OutputSettings มี public no-arg constructor (ใช้ตาม API มาตรฐานของ jsoup)
        out = new Document.OutputSettings();
    }

    // =========================================================
    // Constructor: Validate.notEmpty(name)
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_NullName_ThrowsException() {
        // name == null -> Validate.notEmpty ควร throw IllegalArgumentException
        new DocumentType(null, "pub", "sys", "base");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_EmptyName_ThrowsException() {
        // name == "" -> Validate.notEmpty ควร throw IllegalArgumentException
        new DocumentType("", "pub", "sys", "base");
    }

    @Test
    public void testConstructor_ValidName_NoExceptionAndAttrStored() {
        DocumentType dt = new DocumentType("html", "", "", "");
        assertEquals("html", dt.attr("name"));
    }

    @Test
    public void testConstructor_WhitespaceOnlyName_PassesValidateButBlankInOutput() {
        // Validate.notEmpty เช็คแค่ null/length==0 จึงไม่ throw เมื่อ name=" "
        // แต่ StringUtil.isBlank(" ") = true ทำให้ outerHtmlHead ไม่พิมพ์ name
        DocumentType dt = new DocumentType(" ", "", "", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, out);
        assertEquals("<!DOCTYPE>", sb.toString());
    }

    @Test
    public void testConstructor_NullPublicIdAndSystemId_TreatedAsBlank() {
        // ส่ง publicId/systemId = null เข้า constructor โดยตรง
        DocumentType dt = new DocumentType("html", null, null, "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, out);
        assertEquals("<!DOCTYPE html>", sb.toString());
    }

    // =========================================================
    // nodeName()
    // =========================================================

    @Test
    public void testNodeName_ReturnsDoctype() {
        DocumentType dt = new DocumentType("html", "", "", "");
        assertEquals("#doctype", dt.nodeName());
    }

    // =========================================================
    // outerHtmlHead(): 3 independent if-branches -> ครอบคลุม combination สำคัญ
    // =========================================================

    @Test
    public void testOuterHtmlHead_AllBlank_NoNamePublicSystem() {
        DocumentType dt = new DocumentType("html", "", "", "");
        dt.attr("name", ""); // บังคับ override ให้ name blank (เพื่อ cover branch name=false)
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, out);
        assertEquals("<!DOCTYPE>", sb.toString());
    }

    @Test
    public void testOuterHtmlHead_NameOnly() {
        DocumentType dt = new DocumentType("html", "", "", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, out);
        assertEquals("<!DOCTYPE html>", sb.toString());
    }

    @Test
    public void testOuterHtmlHead_NameAndPublicId_NoSystemId() {
        DocumentType dt = new DocumentType("html", "-//W3C//DTD HTML 4.01//EN", "", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, out);
        assertEquals("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\">", sb.toString());
    }

    @Test
    public void testOuterHtmlHead_NameAndSystemId_NoPublicId() {
        // หมายเหตุ: source ไม่ใส่คำว่า "SYSTEM" ก่อน systemId
        // อาจเป็นจุดที่ Defects4J ต้องการให้ตรวจพบ fault/พฤติกรรมผิดจาก spec จริงของ DOCTYPE
        DocumentType dt = new DocumentType("html", "", "http://example.com/some.dtd", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, out);
        assertEquals("<!DOCTYPE html \"http://example.com/some.dtd\">", sb.toString());
    }

    @Test
    public void testOuterHtmlHead_NamePublicIdSystemId_AllPresent() {
        DocumentType dt = new DocumentType("html",
                "-//W3C//DTD HTML 4.01//EN",
                "http://www.w3.org/TR/html4/strict.dtd", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, out);
        assertEquals(
                "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">",
                sb.toString());
    }

    @Test
    public void testOuterHtmlHead_BlankNameWithPublicIdAndSystemId() {
        DocumentType dt = new DocumentType("html",
                "-//W3C//DTD HTML 4.01//EN",
                "http://www.w3.org/TR/html4/strict.dtd", "");
        dt.attr("name", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, out);
        assertEquals(
                "<!DOCTYPE PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">",
                sb.toString());
    }

    @Test
    public void testOuterHtmlHead_BlankNameWithPublicIdOnly() {
        DocumentType dt = new DocumentType("html", "-//W3C//DTD HTML 4.01//EN", "", "");
        dt.attr("name", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, out);
        assertEquals("<!DOCTYPE PUBLIC \"-//W3C//DTD HTML 4.01//EN\">", sb.toString());
    }

    @Test
    public void testOuterHtmlHead_BlankNameWithSystemIdOnly() {
        DocumentType dt = new DocumentType("html", "", "http://example.com/some.dtd", "");
        dt.attr("name", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, out);
        assertEquals("<!DOCTYPE \"http://example.com/some.dtd\">", sb.toString());
    }

    @Test
    public void testOuterHtmlHead_AllBlank_NullValues() {
        DocumentType dt = new DocumentType("html", null, null, "");
        dt.attr("name", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, out);
        assertEquals("<!DOCTYPE>", sb.toString());
    }

    @Test
    public void testOuterHtmlHead_WhitespaceOnlyPublicIdAndSystemId_TreatedAsBlank() {
        // StringUtil.isBlank ถือว่า string ที่มีแต่ whitespace เป็น blank เช่นกัน
        DocumentType dt = new DocumentType("html", "   ", "   ", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, out);
        assertEquals("<!DOCTYPE html>", sb.toString());
    }

    // =========================================================
    // outerHtmlTail(): ไม่มี branch, ต้อง verify ว่าไม่แก้ไข accum
    // =========================================================

    @Test
    public void testOuterHtmlTail_DoesNotModifyAccum() {
        DocumentType dt = new DocumentType("html", "", "", "");
        StringBuilder sb = new StringBuilder("existing");
        dt.outerHtmlTail(sb, 0, out);
        assertEquals("existing", sb.toString());
    }
}
```

## สรุป Coverage Mapping

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_NullName_ThrowsException` | Constructor: `Validate.notEmpty(name)` → name=null → throw |
| `testConstructor_EmptyName_ThrowsException` | Constructor: `Validate.notEmpty(name)` → name="" → throw |
| `testConstructor_ValidName_NoExceptionAndAttrStored` | Constructor: name valid → ไม่ throw, `attr("name")` เก็บค่าถูกต้อง |
| `testConstructor_WhitespaceOnlyName_PassesValidateButBlankInOutput` | Boundary: name=" " ผ่าน `notEmpty` แต่ `isBlank`=true ใน `outerHtmlHead` |
| `testConstructor_NullPublicIdAndSystemId_TreatedAsBlank` | publicId/systemId=null ตรง constructor → isBlank=true ทั้งสอง if |
| `testNodeName_ReturnsDoctype` | `nodeName()` return ค่าคงที่ |
| `testOuterHtmlHead_AllBlank_NoNamePublicSystem` | if(name)=false, if(publicId)=false, if(systemId)=false |
| `testOuterHtmlHead_NameOnly` | if(name)=true, if(publicId)=false, if(systemId)=false |
| `testOuterHtmlHead_NameAndPublicId_NoSystemId` | if(name)=true, if(publicId)=true, if(systemId)=false |
| `testOuterHtmlHead_NameAndSystemId_NoPublicId` | if(name)=true, if(publicId)=false, if(systemId)=true |
| `testOuterHtmlHead_NamePublicIdSystemId_AllPresent` | if(name)=true, if(publicId)=true, if(systemId)=true |
| `testOuterHtmlHead_BlankNameWithPublicIdAndSystemId` | if(name)=false, if(publicId)=true, if(systemId)=true |
| `testOuterHtmlHead_BlankNameWithPublicIdOnly` | if(name)=false, if(publicId)=true, if(systemId)=false |
| `testOuterHtmlHead_BlankNameWithSystemIdOnly` | if(name)=false, if(publicId)=false, if(systemId)=true |
| `testOuterHtmlHead_AllBlank_NullValues` | isBlank(null) สำหรับทั้ง publicId/systemId ร่วมกับ name blank |
| `testOuterHtmlHead_WhitespaceOnlyPublicIdAndSystemId_TreatedAsBlank` | isBlank(whitespace-only) → false branch ของ publicId/systemId |
| `testOuterHtmlTail_DoesNotModifyAccum` | ตรวจสอบ method ว่างไม่มี side-effect (no branch แต่ verify behavior) |

**หมายเหตุสรุป**: Test ครอบคลุม branch ทั้ง 2 สาขา (true/false) ของทั้ง 3 เงื่อนไข `if` ใน `outerHtmlHead` รวม 8/8 combination รวมถึง boundary ของ `Validate.notEmpty` vs `StringUtil.isBlank` และ null/empty/whitespace สำหรับทุกพารามิเตอร์หลัก
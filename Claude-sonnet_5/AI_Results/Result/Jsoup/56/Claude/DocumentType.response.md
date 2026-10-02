# DocumentTypeTest.java

ด้านล่างคือชุดทดสอบ JUnit 4 ที่ครอบคลุม branch/condition ต่าง ๆ ของ `DocumentType` โดยเน้นที่ method `outerHtmlHead` ซึ่งมี logic ซับซ้อนที่สุด (if/else สำหรับ syntax, has(NAME), has(PUBLIC_ID), has(SYSTEM_ID))

> **หมายเหตุสำคัญ (assumptions ที่จำเป็นต่อการเขียนเทส แต่ไม่มีอยู่ในซอร์สที่ให้มา):**
> - สมมติว่า `Document.OutputSettings` มี public no-arg constructor และมี method `syntax(Syntax)` (setter) คู่กับ `syntax()` (getter) ที่ถูกเรียกใช้ในซอร์ส — เป็น public API มาตรฐานของ jsoup ที่จำเป็นต่อการสร้าง test fixture
> - สมมติว่า `Node` (superclass) มี public method `attr(String key)` (getter) และ `baseUri()` ตามที่ใช้ตรวจสอบผลลัพธ์ของ constructor — ใช้เพื่อยืนยันว่า constructor เซ็ตค่าตามที่คาด
> - พฤติกรรมของ `attr(key, null)` (ค่า null) ไม่สามารถยืนยันได้จากซอร์สที่ให้มา (ขึ้นกับ class `Attributes`/`Attribute` ที่ไม่ได้แสดง) — จึงเขียนคอมเมนต์กำกับไว้ว่าเป็น assumption

```java
package org.jsoup.nodes;

import static org.junit.Assert.*;
import org.junit.Test;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Document.OutputSettings.Syntax;

public class DocumentTypeTest {

    // --- Helper methods to build OutputSettings for different syntax ---
    // Assumption: OutputSettings has public no-arg constructor + syntax(Syntax) setter + syntax() getter.
    private OutputSettings htmlSettings() {
        OutputSettings os = new OutputSettings();
        os.syntax(Syntax.html);
        return os;
    }

    private OutputSettings xmlSettings() {
        OutputSettings os = new OutputSettings();
        os.syntax(Syntax.xml);
        return os;
    }

    // ---------- nodeName() ----------
    @Test
    public void testNodeName() {
        DocumentType dt = new DocumentType("html", "", "", "");
        assertEquals("#doctype", dt.nodeName());
    }

    // ---------- Static constants ----------
    @Test
    public void testStaticConstants() {
        assertEquals("PUBLIC", DocumentType.PUBLIC_KEY);
        assertEquals("SYSTEM", DocumentType.SYSTEM_KEY);
    }

    // ---------- Constructor sets attributes correctly ----------
    @Test
    public void testConstructorSetsAttributes() {
        // Assumption: Node.attr(String) getter and baseUri() exist as public API.
        DocumentType dt = new DocumentType("html", "pub", "sys", "base");
        assertEquals("html", dt.attr("name"));
        assertEquals("pub", dt.attr("publicId"));
        assertEquals("sys", dt.attr("systemId"));
        assertEquals("base", dt.baseUri());
    }

    // ---------- Branch: html syntax + no publicId + no systemId + has name -> lowercase doctype ----------
    @Test
    public void testOuterHtmlHead_HtmlSyntax_NoPublicNoSystem_WithName() throws Exception {
        DocumentType dt = new DocumentType("html", "", "", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, htmlSettings());
        String result = sb.toString();
        assertEquals("<!doctype html>", result);
    }

    // ---------- Branch: name blank (empty) -> no name segment appended ----------
    @Test
    public void testOuterHtmlHead_HtmlSyntax_NoPublicNoSystem_NoName() throws Exception {
        DocumentType dt = new DocumentType("", "", "", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, htmlSettings());
        String result = sb.toString();
        assertEquals("<!doctype>", result);
    }

    // ---------- Boundary: name = null (uncertain underlying Attributes behavior) ----------
    @Test
    public void testOuterHtmlHead_NullName() throws Exception {
        // NOTE: Assuming attr() accepts null and treats it as blank/absent (similar to empty string).
        // If underlying Attributes/Attribute implementation throws NPE on null value,
        // this test's expected behavior is uncertain and documented here as an assumption.
        DocumentType dt = new DocumentType(null, null, null, "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, htmlSettings());
        String result = sb.toString();
        assertEquals("<!doctype>", result);
    }

    // ---------- Branch: has(PUBLIC_ID)=true -> breaks lowercase condition, uses uppercase DOCTYPE ----------
    @Test
    public void testOuterHtmlHead_HtmlSyntax_WithPublicId() throws Exception {
        DocumentType dt = new DocumentType("html", "-//W3C//DTD XHTML 1.0 Strict//EN", "", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, htmlSettings());
        String result = sb.toString();
        assertTrue(result.startsWith("<!DOCTYPE"));
        assertTrue(result.contains("PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\""));
        assertFalse(result.contains("\" \""));
    }

    // ---------- Branch: has(SYSTEM_ID)=true -> breaks lowercase condition, uses uppercase DOCTYPE ----------
    @Test
    public void testOuterHtmlHead_HtmlSyntax_WithSystemId() throws Exception {
        DocumentType dt = new DocumentType("html", "",
                "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, htmlSettings());
        String result = sb.toString();
        assertTrue(result.startsWith("<!DOCTYPE"));
        assertFalse(result.contains("PUBLIC"));
        assertTrue(result.contains("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\""));
    }

    // ---------- Branch: both publicId and systemId present ----------
    @Test
    public void testOuterHtmlHead_HtmlSyntax_WithPublicAndSystem() throws Exception {
        DocumentType dt = new DocumentType("html",
                "-//W3C//DTD XHTML 1.0 Strict//EN",
                "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd",
                "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, htmlSettings());
        String result = sb.toString();
        assertEquals(
            "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">",
            result);
    }

    // ---------- Branch: syntax == xml -> always uppercase DOCTYPE even without publicId/systemId ----------
    @Test
    public void testOuterHtmlHead_XmlSyntax_NoPublicNoSystem() throws Exception {
        DocumentType dt = new DocumentType("html", "", "", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, xmlSettings());
        String result = sb.toString();
        assertEquals("<!DOCTYPE html>", result);
    }

    // ---------- Branch: xml syntax with publicId & systemId ----------
    @Test
    public void testOuterHtmlHead_XmlSyntax_WithPublicAndSystem() throws Exception {
        DocumentType dt = new DocumentType("html", "pub", "sys", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, xmlSettings());
        String result = sb.toString();
        assertEquals("<!DOCTYPE html PUBLIC \"pub\" \"sys\">", result);
    }

    // ---------- Boundary: whitespace-only values are treated as blank by StringUtil.isBlank ----------
    @Test
    public void testOuterHtmlHead_WhitespaceOnlyValues() throws Exception {
        DocumentType dt = new DocumentType("   ", "   ", "   ", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, htmlSettings());
        String result = sb.toString();
        // All blank -> lowercase doctype, no name/public/system segments appended
        assertEquals("<!doctype>", result);
    }

    // ---------- outerHtmlTail should produce no output and not throw ----------
    @Test
    public void testOuterHtmlTail_NoOutput() throws Exception {
        DocumentType dt = new DocumentType("html", "", "", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlTail(sb, 0, htmlSettings());
        assertEquals("", sb.toString());
    }

    // ---------- Independent branch: has(NAME)=false while has(PUBLIC_ID)=true ----------
    @Test
    public void testOuterHtmlHead_NoName_WithPublicId() throws Exception {
        DocumentType dt = new DocumentType("", "pubid", "", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, htmlSettings());
        String result = sb.toString();
        assertEquals("<!DOCTYPE PUBLIC \"pubid\">", result);
    }

    // ---------- Malformed input: publicId containing embedded double-quote (no escaping in source) ----------
    @Test
    public void testOuterHtmlHead_PublicIdWithQuoteCharacter() throws Exception {
        // Documents current actual (unescaped) behavior of outerHtmlHead; not a guess,
        // directly derived from source which performs no escaping on attr values.
        DocumentType dt = new DocumentType("html", "pub\"id", "", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, htmlSettings());
        String result = sb.toString();
        assertTrue(result.contains("PUBLIC \"pub\"id\""));
    }

    // ---------- Only systemId blank among all three, with publicId present and name present ----------
    @Test
    public void testOuterHtmlHead_NameAndPublicId_NoSystemId() throws Exception {
        DocumentType dt = new DocumentType("html", "pubid", "", "");
        StringBuilder sb = new StringBuilder();
        dt.outerHtmlHead(sb, 0, htmlSettings());
        String result = sb.toString();
        assertEquals("<!DOCTYPE html PUBLIC \"pubid\">", result);
    }
}
```

---

## สรุปการครอบคลุม Branch/Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testNodeName` | ตรวจค่า return ของ `nodeName()` |
| `testStaticConstants` | ตรวจค่าคงที่ `PUBLIC_KEY`, `SYSTEM_KEY` |
| `testConstructorSetsAttributes` | ตรวจว่า constructor เรียก `attr()` ถูกต้องสำหรับ name/publicId/systemId/baseUri |
| `testOuterHtmlHead_HtmlSyntax_NoPublicNoSystem_WithName` | เงื่อนไข `syntax==html && !has(PUBLIC_ID) && !has(SYSTEM_ID)` = true → lowercase `<!doctype`; `has(NAME)`=true |
| `testOuterHtmlHead_HtmlSyntax_NoPublicNoSystem_NoName` | เงื่อนไขเดียวกัน = true; `has(NAME)`=false (blank name) |
| `testOuterHtmlHead_NullName` | Boundary: name=null (เอกสารกำกับ assumption เรื่อง behavior ของ `attr()` กับ null) |
| `testOuterHtmlHead_HtmlSyntax_WithPublicId` | `has(PUBLIC_ID)`=true → เงื่อนไข lowercase เป็น false → uppercase `<!DOCTYPE`; branch `has(PUBLIC_ID)`=true ภายใน |
| `testOuterHtmlHead_HtmlSyntax_WithSystemId` | `has(SYSTEM_ID)`=true → uppercase DOCTYPE; branch `has(SYSTEM_ID)`=true, `has(PUBLIC_ID)`=false |
| `testOuterHtmlHead_HtmlSyntax_WithPublicAndSystem` | ทั้ง `has(PUBLIC_ID)` และ `has(SYSTEM_ID)` = true พร้อมกัน |
| `testOuterHtmlHead_XmlSyntax_NoPublicNoSystem` | เงื่อนไข `syntax==html` = false (syntax=xml) → uppercase DOCTYPE แม้ publicId/systemId blank |
| `testOuterHtmlHead_XmlSyntax_WithPublicAndSystem` | syntax=xml ร่วมกับ publicId/systemId ที่ไม่ blank |
| `testOuterHtmlHead_WhitespaceOnlyValues` | Boundary: ค่า whitespace-only ถูกตีความเป็น blank โดย `StringUtil.isBlank` ผ่าน `has()` |
| `testOuterHtmlTail_NoOutput` | ครอบคลุม method `outerHtmlTail` (ไม่มี logic แต่ต้องไม่ throw/ไม่มี output) |
| `testOuterHtmlHead_NoName_WithPublicId` | `has(NAME)`=false, `has(PUBLIC_ID)`=true, `has(SYSTEM_ID)`=false — แยก branch ของ NAME ออกจาก PUBLIC/SYSTEM |
| `testOuterHtmlHead_PublicIdWithQuoteCharacter` | Malformed input: มี `"` อยู่ในค่า publicId (ตรวจพฤติกรรมจริงที่ไม่มีการ escape) |
| `testOuterHtmlHead_NameAndPublicId_NoSystemId` | ยืนยัน branch `has(SYSTEM_ID)`=false ร่วมกับ `has(NAME)`=true และ `has(PUBLIC_ID)`=true |

### Branch coverage ที่ได้ครอบคลุมใน `outerHtmlHead`:
- เงื่อนไข `if (out.syntax() == Syntax.html && !has(PUBLIC_ID) && !has(SYSTEM_ID))` — ทั้ง true/false (ครบทุก sub-condition combination ที่ทำให้ผลลัพธ์ต่างกัน)
- `if (has(NAME))` — true/false
- `if (has(PUBLIC_ID))` — true/false
- `if (has(SYSTEM_ID))` — true/false
- `outerHtmlTail` — ครอบคลุม method ที่ไม่มี branch (statement coverage)
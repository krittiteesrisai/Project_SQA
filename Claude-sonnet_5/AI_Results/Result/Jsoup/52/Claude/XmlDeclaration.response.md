# วิเคราะห์โค้ดและออกแบบเทส

ก่อนเขียนเทส ขอสรุปจุดที่ต้อง cover และสมมติฐาน (assumption) ที่อ้างอิงจาก API ของ jsoup ที่ `XmlDeclaration` ใช้งาน (เนื่องจาก source ของ `Node`, `Attributes`, `Validate` ไม่ได้ให้มาโดยตรง):

- `Validate.notNull(name)` → คาดว่า throw `IllegalArgumentException` เมื่อ `name == null` (พฤติกรรมมาตรฐานของ `org.jsoup.helper.Validate` แต่ไม่ได้อยู่ใน source ที่ให้มาตรงๆ)
- `attributes.get(key)` → ตาม jsoup ส่วนใหญ่จะ **คืนค่า `""` (empty string) ไม่ใช่ `null`** เมื่อไม่พบ key — นี่คือจุดที่อาจทำให้โค้ด `if (version != null)` / `if (encoding != null)` ทำงานผิดจาก intent (เป็น fault ที่ต้องการดักจับ)
- `Node.outerHtml()` สำหรับ node เดี่ยวที่ depth 0 ไม่ควรมีการเติม indentation/whitespace เพิ่ม

```java
import static org.junit.Assert.*;

import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

/**
 * Unit tests for {@link XmlDeclaration}.
 *
 * หมายเหตุสมมติฐาน (เนื่องจาก source บางส่วน เช่น Node/Attributes/Validate ไม่ได้ให้มาโดยตรง):
 * 1) Validate.notNull(name) คาดว่าจะ throw IllegalArgumentException เมื่อ name == null
 * 2) Attributes.get(key) ของ jsoup โดยทั่วไปคืนค่า "" (ไม่ใช่ null) เมื่อไม่พบ key -> อาจทำให้
 *    บางเทสเกี่ยวกับ version/encoding only fail บน buggy version (ตรงตาม fault ที่ Defects4J Jsoup-52b อ้างถึง)
 * 3) outerHtml() ของ node เดี่ยวที่ depth 0 ไม่เติม whitespace/indent เพิ่ม
 */
public class XmlDeclarationTest {

    // ---------------------- Constructor ----------------------

    @Test
    public void testConstructor_ValidArguments_CreatesInstance() {
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", false);
        assertNotNull(decl);
        assertEquals("xml", decl.name());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_NullName_ThrowsIllegalArgumentException() {
        new XmlDeclaration(null, "http://example.com", false);
    }

    // ---------------------- nodeName() ----------------------

    @Test
    public void testNodeName_ReturnsDeclarationConstant() {
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        assertEquals("#declaration", decl.nodeName());
    }

    // ---------------------- name() ----------------------

    @Test
    public void testName_ReturnsConstructorName() {
        XmlDeclaration decl = new XmlDeclaration("DOCTYPE", "", true);
        assertEquals("DOCTYPE", decl.name());
    }

    @Test
    public void testName_EmptyString_ReturnsEmptyString() {
        XmlDeclaration decl = new XmlDeclaration("", "", false);
        assertEquals("", decl.name());
    }

    // ---------------------- getWholeDeclaration() ----------------------

    @Test
    public void testGetWholeDeclaration_NameNotXml_ReturnsNameUnchanged() {
        XmlDeclaration decl = new XmlDeclaration("DOCTYPE", "", true);
        decl.attr("a", "1");
        decl.attr("b", "2");
        // name != "xml" -> ไม่เข้า if แม้ attributes.size() > 1
        assertEquals("DOCTYPE", decl.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclaration_NameCaseSensitive_XMLUppercase_ReturnsNameUnchanged() {
        XmlDeclaration decl = new XmlDeclaration("XML", "", false);
        decl.attr("version", "1.0");
        decl.attr("encoding", "UTF-8");
        // "xml".equals("XML") = false (case-sensitive) -> ไม่เข้า if แม้มี attribute >1
        assertEquals("XML", decl.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclaration_XmlNameNoAttributes_ReturnsNameUnchanged() {
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        // attributes.size() == 0 -> (0 > 1) เป็น false -> else branch
        assertEquals("xml", decl.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclaration_XmlNameOneAttribute_ReturnsNameUnchanged() {
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        decl.attr("version", "1.0");
        // attributes.size() == 1 -> (1 > 1) เป็น false -> else branch (boundary case)
        assertEquals("xml", decl.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclaration_XmlWithVersionAndEncoding_ReturnsBoth() {
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        decl.attr("version", "1.0");
        decl.attr("encoding", "UTF-8");
        // attributes.size() == 2 > 1 (boundary) -> เข้า if, ทั้ง version และ encoding != null
        String result = decl.getWholeDeclaration();
        assertEquals("xml version=\"1.0\" encoding=\"UTF-8\"", result);
    }

    @Test
    public void testGetWholeDeclaration_XmlWithVersionOnly_ReturnsVersionOnly() {
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        decl.attr("version", "1.0");
        decl.attr("standalone", "no"); // เพิ่มเพื่อให้ size() > 1 โดยไม่ใช่ encoding
        // คาดหวังตาม intent ของโค้ด: ไม่มี key "encoding" -> ไม่ควร append
        // หมายเหตุ: อาจ FAIL บน buggy implementation ที่ Attributes.get() คืน "" แทน null
        // -> ใช้ดักจับ fault ตาม Defects4J Jsoup-52b
        String result = decl.getWholeDeclaration();
        assertEquals("xml version=\"1.0\"", result);
    }

    @Test
    public void testGetWholeDeclaration_XmlWithEncodingOnly_ReturnsEncodingOnly() {
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        decl.attr("encoding", "UTF-8");
        decl.attr("standalone", "no");
        // คาดหวังตาม intent ของโค้ด: ไม่มี key "version" -> ไม่ควร append
        // หมายเหตุ: อาจ FAIL ด้วยเหตุผลเดียวกับเทสก่อนหน้า
        String result = decl.getWholeDeclaration();
        assertEquals("xml encoding=\"UTF-8\"", result);
    }

    @Test
    public void testGetWholeDeclaration_XmlWithNeitherVersionNorEncoding_ReturnsNameOnly() {
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        decl.attr("standalone", "no");
        decl.attr("foo", "bar");
        // attributes.size() == 2 > 1 -> เข้า if, แต่ไม่มี key "version"/"encoding"
        // คาดหวังตาม intent: ไม่มีการ append -> "xml"
        // หมายเหตุ: อาจ FAIL ด้วยเหตุผลเดียวกับ 2 เทสก่อนหน้า
        String result = decl.getWholeDeclaration();
        assertEquals("xml", result);
    }

    // ---------------------- outerHtmlHead()/outerHtmlTail() via toString() ----------------------

    @Test
    public void testToString_ProcessingInstructionTrue_UsesExclamationMark() {
        XmlDeclaration decl = new XmlDeclaration("DOCTYPE html", "", true);
        String result = decl.toString();
        assertTrue("ควรขึ้นต้นด้วย <!", result.startsWith("<!"));
        assertTrue(result.contains("DOCTYPE html"));
        assertTrue(result.endsWith(">"));
    }

    @Test
    public void testToString_ProcessingInstructionFalse_UsesQuestionMark() {
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        decl.attr("version", "1.0");
        decl.attr("encoding", "UTF-8");
        String result = decl.toString();
        assertTrue("ควรขึ้นต้นด้วย <?", result.startsWith("<?"));
        assertTrue(result.contains("version=\"1.0\""));
        assertTrue(result.endsWith(">"));
    }

    @Test
    public void testToString_SimpleXmlNoExtraAttributes_WrapsNameWithBrackets() {
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        // getWholeDeclaration() ใน case นี้คืน "xml" (else branch)
        // outerHtmlHead ต่อ "<" + "?" + "xml" + ">" และ outerHtmlTail ไม่เติมอะไร
        String result = decl.toString();
        assertEquals("<?xml>", result);
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| เมธอดเทส | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_ValidArguments_CreatesInstance` | Constructor ปกติ, `Validate.notNull` ผ่าน (name != null) |
| `testConstructor_NullName_ThrowsIllegalArgumentException` | Constructor, `Validate.notNull(name)` กรณี name == null → throw |
| `testNodeName_ReturnsDeclarationConstant` | `nodeName()` — ไม่มี branch, ตรวจค่าคงที่ |
| `testName_ReturnsConstructorName` | `name()` getter — ค่าทั่วไป |
| `testName_EmptyString_ReturnsEmptyString` | `name()` getter — ค่า boundary (empty string) |
| `testGetWholeDeclaration_NameNotXml_ReturnsNameUnchanged` | `decl.equals("xml")` = false → else branch (attributes.size() > 1 แต่ไม่เข้า if) |
| `testGetWholeDeclaration_NameCaseSensitive_XMLUppercase_ReturnsNameUnchanged` | `decl.equals("xml")` = false (case-sensitive) → else branch |
| `testGetWholeDeclaration_XmlNameNoAttributes_ReturnsNameUnchanged` | `attributes.size() > 1` = false (size=0) → else branch, boundary |
| `testGetWholeDeclaration_XmlNameOneAttribute_ReturnsNameUnchanged` | `attributes.size() > 1` = false (size=1) → else branch, boundary |
| `testGetWholeDeclaration_XmlWithVersionAndEncoding_ReturnsBoth` | if branch เข้า (size=2), `version != null` = true, `encoding != null` = true |
| `testGetWholeDeclaration_XmlWithVersionOnly_ReturnsVersionOnly` | if branch เข้า, `version != null` = true, `encoding != null` = false (ตาม intent) — ดักจับ fault ที่อาจเกิด |
| `testGetWholeDeclaration_XmlWithEncodingOnly_ReturnsEncodingOnly` | if branch เข้า, `version != null` = false (ตาม intent), `encoding != null` = true — ดักจับ fault ที่อาจเกิด |
| `testGetWholeDeclaration_XmlWithNeitherVersionNorEncoding_ReturnsNameOnly` | if branch เข้า, ทั้ง `version != null` และ `encoding != null` = false (ตาม intent) — ดักจับ fault ที่อาจเกิด |
| `testToString_ProcessingInstructionTrue_UsesExclamationMark` | `outerHtmlHead`: `isProcessingInstruction ? "!" : "?"` → true branch ("!") |
| `testToString_ProcessingInstructionFalse_UsesQuestionMark` | `outerHtmlHead`: ternary → false branch ("?"), รวมกับ getWholeDeclaration if-branch |
| `testToString_SimpleXmlNoExtraAttributes_WrapsNameWithBrackets` | `outerHtmlHead`/`outerHtmlTail` end-to-end พร้อม getWholeDeclaration else-branch, ตรวจ exact string (ไม่มี extra output จาก tail) |

**ข้อสังเกตสำคัญ:** เทส 3 ตัว (`...VersionOnly`, `...EncodingOnly`, `...NeitherVersionNorEncoding`) เขียนขึ้นตาม **intent** ของโค้ด (`if (xxx != null)`) ซึ่งหากการ implement จริงของ `Attributes.get()` คืนค่า `""` แทน `null` เมื่อไม่พบ key (ซึ่งเป็นพฤติกรรมที่ทราบกันในบางเวอร์ชันของ jsoup และตรงกับ known defect ของ Defects4J **Jsoup-52b**) เทสเหล่านี้จะ **fail** บน buggy version และ **pass** บน fixed version — ตรงตามเป้าหมายข้อ 3 ที่ต้องการให้มีโอกาสดักจับ fault ได้จริง
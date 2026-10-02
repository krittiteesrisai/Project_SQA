# JUnit 4 Test Suite สำหรับ `org.jsoup.safety.Cleaner`

## หมายเหตุสำคัญก่อนเริ่ม

- `Validate.notNull()` ในซอร์ส jsoup รุ่นนี้ throw `IllegalArgumentException` (พฤติกรรมมาตรฐานของ jsoup ทุกเวอร์ชันที่เกี่ยวข้อง) — ใช้สมมติฐานนี้พร้อมคอมเมนต์กำกับ
- เมธอด `NodeTraversor.traverse()` **ไม่ได้อยู่ในซอร์สที่ให้มา** จึงไม่สามารถเดาพฤติกรรมตอน root เป็น `null` ได้ (ตามข้อกำหนดที่ 4) — จึงทดสอบเฉพาะ branch `if (dirtyDocument.body() != null)` ใน `clean()` ซึ่งเป็น branch ที่อยู่ในซอร์สจริงของ `Cleaner` เท่านั้น ส่วน `isValid()` ไม่มี guard นี้ แต่จะไม่ไปเดาผลลัพธ์ของการ traverse ด้วย null root

```java
package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class CleanerTest {

    // ================= Constructor =================

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullWhitelistThrows() {
        // สมมติฐาน: Validate.notNull throw IllegalArgumentException (แบบแผน jsoup)
        new Cleaner(null);
    }

    @Test
    public void testConstructorValidWhitelistOk() {
        Cleaner cleaner = new Cleaner(Whitelist.none());
        assertNotNull(cleaner);
    }

    // ================= clean(Document) =================

    @Test(expected = IllegalArgumentException.class)
    public void testCleanNullDocumentThrows() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        cleaner.clean(null);
    }

    @Test
    public void testCleanDocumentWithoutBody_SkipsCopy() {
        // Document(baseUri) ไม่สร้าง html/head/body ให้ -> body() คืน null
        // ครอบคลุม branch false ของ "if (dirtyDocument.body() != null)"
        Document dirty = new Document("http://example.com/");
        assertNull(dirty.body());

        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);

        assertNotNull(clean.body()); // clean doc สร้างผ่าน createShell เสมอมี body
        assertEquals(0, clean.body().children().size());
        assertEquals("", clean.body().text());
    }

    @Test
    public void testCleanNormalDocument_BodyNotNull_SafeTagKept() {
        // ครอบคลุม branch true ของ "if (dirtyDocument.body() != null)"
        String html = "<body><p>Hello</p></body>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);

        assertEquals(1, clean.body().children().size());
        Element p = clean.body().child(0);
        assertEquals("p", p.tagName());
        assertEquals("Hello", p.text());
    }

    @Test
    public void testCleanEmptyInputProducesEmptyBody() {
        // boundary: อินพุตว่าง
        Document dirty = Jsoup.parse("");
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);

        assertEquals("", clean.body().text());
        assertEquals(0, clean.body().children().size());
    }

    // ================= isValid(Document) =================

    @Test(expected = IllegalArgumentException.class)
    public void testIsValidNullDocumentThrows() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        cleaner.isValid(null);
    }

    @Test
    public void testIsValidTrueForCleanInput() {
        // numDiscarded == 0 -> true
        String html = "<body><p>Hello</p></body>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        assertTrue(cleaner.isValid(dirty));
    }

    @Test
    public void testIsValidFalseForDirtyInput() {
        // numDiscarded > 0 -> false
        String html = "<body><script>alert(1)</script><p>Hello</p></body>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        assertFalse(cleaner.isValid(dirty));
    }

    // ================= CleaningVisitor.head(): Element branch =================

    @Test
    public void testSafeTagAttributesFilteredAndEnforcedAttributeAdded() {
        // ครอบคลุม loop ของ attribute: isSafeAttribute true/false
        // และ enforced attribute ที่ถูกเติมเสมอ
        Whitelist whitelist = Whitelist.none()
                .addTags("a")
                .addAttributes("a", "href")
                .addEnforcedAttribute("a", "rel", "nofollow");

        String html = "<body><a href=\"http://example.com\" onclick=\"bad()\">link</a></body>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(whitelist);
        Document clean = cleaner.clean(dirty);

        Element a = clean.body().child(0);
        assertEquals("a", a.tagName());
        assertEquals("http://example.com", a.attr("href")); // safe attr เก็บไว้
        assertFalse(a.hasAttr("onclick"));                   // unsafe attr ถูกตัด
        assertEquals("nofollow", a.attr("rel"));             // enforced attr ถูกเติม

        assertFalse(cleaner.isValid(dirty)); // onclick ทำให้ไม่ valid
    }

    @Test
    public void testUnsafeNonRootElementDiscardedButChildTextStillCopied() {
        // ครอบคลุม branch "else if (source != root)" (unsafe, non-root -> numDiscarded++)
        // และยืนยันว่า TextNode ของ element ที่ไม่ปลอดภัยยังถูกเก็บ (ตาม logic จริงของ head())
        Whitelist whitelist = Whitelist.none().addTags("p");

        String html = "<body><p>Hello <b>World</b></p></body>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(whitelist);
        Document clean = cleaner.clean(dirty);

        assertEquals("Hello World", clean.body().text());
        assertEquals(0, clean.body().getElementsByTag("b").size());
        assertFalse(cleaner.isValid(dirty));
    }

    @Test
    public void testRootElementBypassesDiscardCount() {
        // ครอบคลุม branch "source == root" (ไม่ถูกนับ discard แม้ tag ของ root
        // ไม่อยู่ใน whitelist เช่น "body")
        Whitelist whitelist = Whitelist.none().addTags("p");

        String html = "<body><p>Hello</p></body>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(whitelist);

        assertTrue(cleaner.isValid(dirty)); // ถ้า root ถูกนับ discard ผลจะเป็น false
    }

    // ================= CleaningVisitor.head(): TextNode branch =================

    @Test
    public void testTextNodeAlwaysCopiedRegardlessOfWhitelist() {
        Whitelist whitelist = Whitelist.none().addTags("p");
        Document dirty = Jsoup.parse("<body><p>Just text</p></body>");
        Cleaner cleaner = new Cleaner(whitelist);
        Document clean = cleaner.clean(dirty);

        assertEquals("Just text", clean.body().text());
    }

    @Test
    public void testPlainTextOnlyBody_NoElementsAtAll() {
        // boundary: ไม่มี element ใดๆ เลย มีแต่ TextNode ตรงใต้ body (root)
        Document dirty = Jsoup.parse("<body>just text</body>");
        Cleaner cleaner = new Cleaner(Whitelist.none());
        Document clean = cleaner.clean(dirty);

        assertEquals("just text", clean.body().text());
        assertTrue(cleaner.isValid(dirty));
    }

    // ================= CleaningVisitor.head(): DataNode branches =================

    @Test
    public void testDataNodeUnderSafeTagIsCopied() {
        // ครอบคลุม branch true: source instanceof DataNode && isSafeTag(parent) == true
        Whitelist whitelist = Whitelist.none().addTags("style");
        Document dirty = Jsoup.parse("<body><style>.cls{color:red}</style></body>");
        Cleaner cleaner = new Cleaner(whitelist);
        Document clean = cleaner.clean(dirty);

        assertTrue(clean.body().html().contains(".cls{color:red}"));
    }

    @Test
    public void testDataNodeUnderUnsafeTagIsDiscarded() {
        // ครอบคลุม branch false: DataNode แต่ parent (script) ไม่ safe
        // -> ตกไปที่ else สุดท้าย (numDiscarded++)
        Whitelist whitelist = Whitelist.none().addTags("p");
        Document dirty = Jsoup.parse("<body><script>alert('xss')</script><p>Hello</p></body>");
        Cleaner cleaner = new Cleaner(whitelist);
        Document clean = cleaner.clean(dirty);

        assertFalse(clean.body().html().contains("alert"));
        assertEquals("Hello", clean.body().text());
        assertFalse(cleaner.isValid(dirty));
    }

    // ================= CleaningVisitor.head(): final else branch (comments etc.) =================

    @Test
    public void testCommentNodeDiscarded() {
        Whitelist whitelist = Whitelist.none().addTags("p");
        Document dirty = Jsoup.parse("<body><!-- a comment --><p>Hello</p></body>");
        Cleaner cleaner = new Cleaner(whitelist);
        Document clean = cleaner.clean(dirty);

        assertFalse(clean.body().html().contains("comment"));
        assertFalse(cleaner.isValid(dirty));
    }

    // ================= CleaningVisitor.tail(): stack pop behavior =================

    @Test
    public void testNestedSafeElementsPreserveHierarchy() {
        // ครอบคลุม tail() branch true (pop destination) ซ้อนกันหลายระดับ
        Whitelist whitelist = Whitelist.none().addTags("div", "p");
        Document dirty = Jsoup.parse("<body><div><p>Hello</p></div></body>");
        Cleaner cleaner = new Cleaner(whitelist);
        Document clean = cleaner.clean(dirty);

        assertEquals(1, clean.body().children().size());
        Element div = clean.body().child(0);
        assertEquals("div", div.tagName());
        assertEquals(1, div.children().size());

        Element p = div.child(0);
        assertEquals("p", p.tagName());
        assertEquals("Hello", p.text());

        assertTrue(cleaner.isValid(dirty));
    }

    @Test
    public void testUnsafeElementDoesNotAffectDestinationStackOnTail() {
        // ครอบคลุม tail() branch false: element ไม่ safe -> ไม่ pop destination
        // (เพราะไม่เคย push ตั้งแต่ head())
        Whitelist whitelist = Whitelist.none().addTags("p");
        Document dirty = Jsoup.parse("<body><p>A<b>B</b>C</p></body>");
        Cleaner cleaner = new Cleaner(whitelist);
        Document clean = cleaner.clean(dirty);

        // ถ้า destination stack เพี้ยน ข้อความ "C" จะหายหรือไปอยู่ผิดที่
        assertEquals("ABC", clean.body().text());
    }
}
```

## สรุปการครอบคลุม Branch/Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructorNullWhitelistThrows` | `Validate.notNull(whitelist)` → throw (null) |
| `testConstructorValidWhitelistOk` | `Validate.notNull(whitelist)` → ผ่าน (not null) |
| `testCleanNullDocumentThrows` | `clean()`: `Validate.notNull(dirtyDocument)` → throw |
| `testCleanDocumentWithoutBody_SkipsCopy` | `clean()`: `if (dirtyDocument.body() != null)` → **false** |
| `testCleanNormalDocument_BodyNotNull_SafeTagKept` | `clean()`: `if (dirtyDocument.body() != null)` → **true** |
| `testCleanEmptyInputProducesEmptyBody` | boundary: input ว่าง, ผ่าน body!=null path |
| `testIsValidNullDocumentThrows` | `isValid()`: `Validate.notNull(dirtyDocument)` → throw |
| `testIsValidTrueForCleanInput` | `isValid()`: `numDiscarded == 0` → **true** |
| `testIsValidFalseForDirtyInput` | `isValid()`: `numDiscarded == 0` → **false** |
| `testSafeTagAttributesFilteredAndEnforcedAttributeAdded` | `createSafeElement`: loop attribute, `isSafeAttribute` true/false, enforced attrs เพิ่มเสมอ |
| `testUnsafeNonRootElementDiscardedButChildTextStillCopied` | `head()`: `isSafeTag` false + `source != root` → `numDiscarded++`; `TextNode` branch |
| `testRootElementBypassesDiscardCount` | `head()`: `source == root` (ไม่เพิ่ม discard) |
| `testTextNodeAlwaysCopiedRegardlessOfWhitelist` | `head()`: `source instanceof TextNode` branch |
| `testPlainTextOnlyBody_NoElementsAtAll` | boundary: ไม่มี Element เลย, มีแต่ TextNode ใต้ root |
| `testDataNodeUnderSafeTagIsCopied` | `head()`: `DataNode && isSafeTag(parent)` → **true** |
| `testDataNodeUnderUnsafeTagIsDiscarded` | `head()`: `DataNode && isSafeTag(parent)` → **false** (ตกไป else) |
| `testCommentNodeDiscarded` | `head()`: final `else` (comment ฯลฯ) → `numDiscarded++` |
| `testNestedSafeElementsPreserveHierarchy` | `tail()`: `isSafeTag` true → pop destination (ซ้อนหลายชั้น) |
| `testUnsafeElementDoesNotAffectDestinationStackOnTail` | `tail()`: `isSafeTag` false → ไม่ pop destination |

**หมายเหตุ:** ไม่ได้เขียนทดสอบกรณี `isValid()` กับเอกสารที่ไม่มี `body()` (เช่น frameset) เพราะพฤติกรรมของ `NodeTraversor.traverse(null)` ไม่ได้อยู่ในซอร์สโค้ดที่ให้มา การเดาผลลัพธ์จะขัดกับข้อกำหนดที่ 4
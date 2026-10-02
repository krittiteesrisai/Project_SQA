# ชุดทดสอบ JUnit 4 สำหรับคลาส `Cleaner`

```java
package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CleanerTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    // ========== Constructor ==========

    @Test
    public void constructorThrowsOnNullWhitelist() {
        // Validate.notNull ใน jsoup คาดว่า throw IllegalArgumentException
        // ไม่สามารถยืนยัน exact type จาก source ที่ให้มา -> ใช้ Exception.class เพื่อความปลอดภัย
        thrown.expect(Exception.class);
        new Cleaner(null);
    }

    @Test
    public void constructorAcceptsValidWhitelist() {
        Cleaner cleaner = new Cleaner(Whitelist.none());
        assertNotNull(cleaner);
    }

    // ========== clean() ==========

    @Test
    public void cleanThrowsOnNullDocument() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        thrown.expect(Exception.class);
        cleaner.clean(null);
    }

    @Test
    public void cleanRemovesUnsafeTagsButKeepsText() {
        // <script> ไม่ใช่ safe tag -> ถูกลบ, แต่ text child ของมันควรถูกลบไปด้วย
        // (เพราะ script content ไม่ใช่ TextNode ปรกติใน DOM parse ของ jsoup มันจะเป็น data node)
        String html = "<script>alert('xss')</script><p>Hello <b>world</b></p>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);

        String cleanHtml = clean.body().html();
        assertFalse(cleanHtml.contains("script"));
        assertTrue(cleanHtml.contains("Hello"));
        assertTrue(cleanHtml.contains("world"));
    }

    @Test
    public void cleanWithNoneWhitelistStripsAllTagsKeepsText() {
        // Whitelist.none() ไม่มี tag ที่ปลอดภัยเลย -> ทุก element ถูกแทนด้วย text content
        String html = "<p>Hello <b>world</b></p>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.none());
        Document clean = cleaner.clean(dirty);

        assertEquals("Hello world", clean.body().text());
        assertFalse(clean.body().html().contains("<p>"));
        assertFalse(clean.body().html().contains("<b>"));
    }

    @Test
    public void cleanKeepsTextNodes() {
        String html = "<div>Some text here</div>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.relaxed());
        Document clean = cleaner.clean(dirty);
        assertTrue(clean.body().text().contains("Some text here"));
    }

    @Test
    public void cleanIgnoresComments() {
        // Comment ไม่ใช่ Element หรือ TextNode -> ไม่ถูก copy (branch "else, we don't care")
        String html = "<div><!-- a comment --> visible text</div>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.relaxed());
        Document clean = cleaner.clean(dirty);
        String cleanHtml = clean.body().html();
        assertFalse(cleanHtml.contains("a comment"));
        assertTrue(clean.body().text().contains("visible text"));
    }

    @Test
    public void cleanRecursesIntoUnsafeTagWithSafeChildren() {
        // <span> ไม่อยู่ใน Whitelist.basic() -> unsafe tag, แต่ copySafeNodes ต้อง recurse
        // เข้าไปหา child <b> ซึ่งปลอดภัย และถูก append เข้า dest เดิม (ไม่ใช่ destChild)
        String html = "<span><b>bold text</b></span>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);
        assertFalse(clean.body().html().contains("span"));
        assertTrue(clean.body().html().contains("<b>"));
    }

    @Test
    public void cleanDiscardsUnsafeAttributes() {
        // "onclick" ไม่อยู่ใน allowed attributes ของ <a> ใน Whitelist.basic() ("href","title")
        String html = "<a href=\"http://example.com\" onclick=\"alert(1)\">link</a>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);
        String cleanHtml = clean.body().html();
        assertTrue(cleanHtml.contains("href"));
        assertFalse(cleanHtml.contains("onclick"));
    }

    @Test
    public void cleanAppliesEnforcedAttributes() {
        // Whitelist.basic() enforce rel="nofollow" บน <a> -> ทดสอบ destAttrs.addAll(enforcedAttrs)
        String html = "<a href=\"http://example.com\">link</a>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);
        String cleanHtml = clean.body().html();
        assertTrue(cleanHtml.contains("rel=\"nofollow\""));
    }

    @Test
    public void cleanEmptyBodyReturnsEmptyCleanDocument() {
        // boundary case: ไม่มี children เลย -> loop ใน copySafeNodes ไม่ execute (0 iteration)
        Document dirty = Jsoup.parse("");
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);
        assertNotNull(clean);
        assertEquals("", clean.body().text());
    }

    // ========== isValid() ==========

    @Test
    public void isValidThrowsOnNullDocument() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        thrown.expect(Exception.class);
        cleaner.isValid(null);
    }

    @Test
    public void isValidReturnsTrueWhenNothingDiscarded() {
        // ทุก tag/attribute ปลอดภัย -> numDiscarded == 0
        String html = "<p>Hello <b>world</b></p>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        assertTrue(cleaner.isValid(dirty));
    }

    @Test
    public void isValidReturnsFalseWhenUnsafeTagDiscarded() {
        // <script> unsafe -> numDiscarded++ -> isValid เป็น false
        String html = "<script>alert(1)</script><p>Hello</p>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        assertFalse(cleaner.isValid(dirty));
    }

    @Test
    public void isValidReturnsFalseWhenUnsafeAttributeDiscarded() {
        // attribute "onclick" unsafe -> numAttribsDiscarded > 0 -> isValid false
        String html = "<a href=\"http://example.com\" onclick=\"alert(1)\">link</a>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        assertFalse(cleaner.isValid(dirty));
    }

    @Test
    public void isValidReturnsTrueForEmptyBody() {
        // boundary case: ไม่มี node ให้ลบเลย -> numDiscarded == 0 -> true
        Document dirty = Jsoup.parse("");
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        assertTrue(cleaner.isValid(dirty));
    }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `constructorThrowsOnNullWhitelist` | `Validate.notNull(whitelist)` ใน constructor เมื่อ whitelist เป็น null |
| `constructorAcceptsValidWhitelist` | Constructor กรณี whitelist ไม่ null |
| `cleanThrowsOnNullDocument` | `Validate.notNull(dirtyDocument)` ใน `clean()` เมื่อ document เป็น null |
| `cleanRemovesUnsafeTagsButKeepsText` | `copySafeNodes`: branch `sourceChild instanceof Element` → `isSafeTag == false` → `numDiscarded++` + recurse |
| `cleanWithNoneWhitelistStripsAllTagsKeepsText` | ครอบคลุม recursion ลึกเมื่อไม่มี tag ใดปลอดภัยเลย (ทุก element ถูก unwrap) |
| `cleanKeepsTextNodes` | branch `sourceChild instanceof TextNode` → สร้าง `TextNode` ใหม่และ append |
| `cleanIgnoresComments` | branch `else` (ไม่ใช่ Element/TextNode) → ไม่ทำอะไร (comment ถูกข้าม) |
| `cleanRecursesIntoUnsafeTagWithSafeChildren` | branch `isSafeTag == false` ที่มี child ปลอดภัย → recurse เข้า `dest` เดิม (ไม่ใช่ destChild) |
| `cleanDiscardsUnsafeAttributes` | `createSafeElement`: loop attribute, branch `isSafeAttribute == false` → `numDiscarded++` |
| `cleanAppliesEnforcedAttributes` | `createSafeElement`: `destAttrs.addAll(enforcedAttrs)` สำหรับ enforced attribute |
| `cleanEmptyBodyReturnsEmptyCleanDocument` | boundary: loop ใน `copySafeNodes` ไม่ execute เลย (childNodes ว่าง) |
| `isValidThrowsOnNullDocument` | `Validate.notNull(dirtyDocument)` ใน `isValid()` |
| `isValidReturnsTrueWhenNothingDiscarded` | `isValid()`: `numDiscarded == 0` → return true |
| `isValidReturnsFalseWhenUnsafeTagDiscarded` | `isValid()`: unsafe tag เพิ่ม numDiscarded → return false |
| `isValidReturnsFalseWhenUnsafeAttributeDiscarded` | `isValid()`: unsafe attribute เพิ่ม numDiscarded → return false |
| `isValidReturnsTrueForEmptyBody` | boundary: body ว่าง → numDiscarded == 0 → true |

**หมายเหตุ:** exception type จาก `Validate.notNull` ไม่ได้ระบุชัดในซอร์สที่ให้มา จึงใช้ `Exception.class` แบบกว้างเพื่อไม่เดา behavior ที่ไม่มีอยู่ในซอร์ส
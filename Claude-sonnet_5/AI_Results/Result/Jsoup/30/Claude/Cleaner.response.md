# JUnit 4 Test Suite สำหรับ `org.jsoup.safety.Cleaner`

## หมายเหตุก่อนเริ่ม

- คลาส `Cleaner` ใช้งาน `Whitelist` เป็น dependency หลัก (เรียก `isSafeTag`, `isSafeAttribute`, `getEnforcedAttributes` ตามซอร์สที่ให้มา) จึงจำเป็นต้องใช้ API สาธารณะของ `Whitelist` (constructor, `addTags`, `addAttributes`, `addEnforcedAttribute`) ซึ่งเป็น API มาตรฐานของ jsoup เพื่อสร้างสถานการณ์ทดสอบที่ควบคุมได้ — ไม่ได้เดาพฤติกรรมของ `Cleaner` เอง
- จุดที่ไม่แน่ใจ 100% ถูกกำกับด้วยคอมเมนต์ `// NOTE:` ในโค้ด (เช่น พฤติกรรมของ `Document.body()` เมื่อไม่มี body)
- Test บางเคส (`isValid_documentWithoutBody_throwsNPE`) เขียนขึ้นจากการไล่อ่าน flow ของ `copySafeNodes` ตรง ๆ (ไม่มีการเช็ค null ก่อนเรียก `root.childNodes()`) ซึ่งตรงกับช่องโหว่ที่ทราบว่าเป็นข้อบกพร่องของ `isValid()` เทียบกับ `clean()` ที่มีการเช็ค `!= null` ก่อน

```java
package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class CleanerTest {

    // ---------- Constructor / null-guard tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void constructor_nullWhitelist_throwsException() {
        new Cleaner(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void clean_nullDocument_throwsException() {
        Cleaner cleaner = new Cleaner(new Whitelist());
        cleaner.clean(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isValid_nullDocument_throwsException() {
        Cleaner cleaner = new Cleaner(new Whitelist());
        cleaner.isValid(null);
    }

    // ---------- clean(): safe tag kept, unsafe tag discarded ----------

    @Test
    public void clean_withAllowedAndDisallowedTags_keepsOnlySafeContent() {
        Whitelist whitelist = new Whitelist().addTags("p", "b").addAttributes("p", "class");
        Document dirty = Jsoup.parse(
                "<div><p class='c1' onclick='evil()'>Hello <b>World</b></p><script>bad()</script></div>");
        Cleaner cleaner = new Cleaner(whitelist);

        Document clean = cleaner.clean(dirty);

        Element p = clean.body().select("p").first();
        assertNotNull("ควรเก็บ tag <p> ที่อยู่ใน whitelist", p);
        assertEquals(1, clean.body().select("b").size());
        assertEquals(0, clean.body().select("script").size()); // isSafeTag == false branch
    }

    // ---------- createSafeElement(): mixed safe/unsafe attributes (for-loop ทั้ง 2 สาขา) ----------

    @Test
    public void clean_mixedSafeAndUnsafeAttributes_keepsOnlySafeAttributes() {
        Whitelist whitelist = new Whitelist().addTags("p").addAttributes("p", "class");
        Document dirty = Jsoup.parse("<p class='c1' id='i1' onclick='x()'>Text</p>");
        Cleaner cleaner = new Cleaner(whitelist);

        Document clean = cleaner.clean(dirty);
        Element p = clean.body().select("p").first();

        assertNotNull(p);
        assertEquals("c1", p.attr("class"));   // isSafeAttribute == true branch
        assertFalse(p.hasAttr("id"));          // isSafeAttribute == false branch
        assertFalse(p.hasAttr("onclick"));     // isSafeAttribute == false branch
    }

    // ---------- copySafeNodes(): else-branch (unsafe tag) ยังต้อง recurse เข้าหา destination เดิม ----------

    @Test
    public void clean_unsafeParentWithSafeChild_discardsParentButKeepsChild() {
        Whitelist whitelist = new Whitelist().addTags("b");
        Document dirty = Jsoup.parse("<div><font><b>Bold</b></font></div>"); // font ไม่อยู่ใน whitelist
        Cleaner cleaner = new Cleaner(whitelist);

        Document clean = cleaner.clean(dirty);

        assertEquals(0, clean.body().select("font").size());
        assertEquals(1, clean.body().select("b").size());
        assertEquals("Bold", clean.body().select("b").first().text());
    }

    // ---------- enforced attribute ถูกเติมเข้า destAttrs เสมอ ----------

    @Test
    public void clean_enforcedAttribute_isAddedToOutput() {
        Whitelist whitelist = new Whitelist()
                .addTags("a")
                .addAttributes("a", "href")
                .addEnforcedAttribute("a", "rel", "nofollow");
        Document dirty = Jsoup.parse("<a href='http://example.com'>link</a>");
        Cleaner cleaner = new Cleaner(whitelist);

        Document clean = cleaner.clean(dirty);
        Element a = clean.body().select("a").first();

        assertNotNull(a);
        assertEquals("http://example.com", a.attr("href"));
        assertEquals("nofollow", a.attr("rel"));
    }

    // ---------- TextNode branch ----------

    @Test
    public void clean_textNodeIsCopiedAsIs() {
        Whitelist whitelist = new Whitelist().addTags("p");
        Document dirty = Jsoup.parse("<p>Hello World</p>");
        Cleaner cleaner = new Cleaner(whitelist);

        Document clean = cleaner.clean(dirty);
        assertEquals("Hello World", clean.body().text());
    }

    // ---------- isValid(): numDiscarded == 0 -> true ----------

    @Test
    public void isValid_allSafeContent_returnsTrue() {
        Whitelist whitelist = new Whitelist().addTags("p", "b");
        Document dirty = Jsoup.parse("<p>Hello <b>World</b></p>");
        Cleaner cleaner = new Cleaner(whitelist);

        assertTrue(cleaner.isValid(dirty));
    }

    // ---------- isValid(): unsafe tag -> numDiscarded > 0 -> false ----------

    @Test
    public void isValid_withUnsafeTag_returnsFalse() {
        Whitelist whitelist = new Whitelist().addTags("p");
        Document dirty = Jsoup.parse("<div><p>Hello</p><script>bad()</script></div>");
        Cleaner cleaner = new Cleaner(whitelist);

        assertFalse(cleaner.isValid(dirty));
    }

    // ---------- isValid(): unsafe attribute -> numDiscarded > 0 -> false ----------

    @Test
    public void isValid_withDisallowedAttribute_returnsFalse() {
        Whitelist whitelist = new Whitelist().addTags("p"); // ไม่อนุญาต attribute ใดๆ
        Document dirty = Jsoup.parse("<p class='c'>Hi</p>");
        Cleaner cleaner = new Cleaner(whitelist);

        assertFalse(cleaner.isValid(dirty));
    }

    // ---------- boundary: whitelist ว่างเปล่า -> ทุก tag ถูกคัดออก ----------

    @Test
    public void clean_emptyWhitelist_discardsAllTags() {
        Whitelist emptyWhitelist = new Whitelist();
        Document dirty = Jsoup.parse("<p>Hello</p>");
        Cleaner cleaner = new Cleaner(emptyWhitelist);

        Document clean = cleaner.clean(dirty);

        assertEquals("", clean.body().html());
        assertFalse(cleaner.isValid(dirty));
    }

    // ---------- boundary: body ไม่มี child node เลย (for-loop วนศูนย์ครั้ง) ----------

    @Test
    public void clean_emptyBodyDocument_resultsInEmptyCleanBody() {
        Document dirty = Jsoup.parse(""); // body มีอยู่แต่ไม่มี children
        Cleaner cleaner = new Cleaner(new Whitelist());

        assertTrue(cleaner.isValid(dirty)); // numDiscarded ต้องเป็น 0 เพราะไม่มี node ให้ลูปเลย
        Document clean = cleaner.clean(dirty);
        assertEquals("", clean.body().html());
    }

    // ---------- clean(): dirtyDocument.body() == null -> ข้าม copySafeNodes ----------

    @Test
    public void clean_documentWithoutBody_skipsCopy() {
        // NOTE: Document ที่สร้างด้วย new Document(baseUri) โดยไม่ parse เนื้อหา
        // จะไม่มี <html>/<body> จน normalise() ถูกเรียก ดังนั้น body() ควรเป็น null
        // ซึ่งทำให้เข้าสาขา false ของ "if (dirtyDocument.body() != null)" ใน clean()
        Document dirty = new Document("");
        Cleaner cleaner = new Cleaner(new Whitelist());

        Document clean = cleaner.clean(dirty);

        assertNotNull(clean.body()); // clean doc ถูกสร้างผ่าน Document.createShell() จึงมี body เสมอ
        assertEquals("", clean.body().html());
    }

    // ---------- isValid(): ไม่มีการเช็ค null body เหมือน clean() -> อาจเกิด NPE (บั๊กที่คาดว่าเป็นช่องโหว่) ----------

    @Test(expected = NullPointerException.class)
    public void isValid_documentWithoutBody_throwsNPE() {
        // NOTE: ต่างจาก clean() ตรงที่ isValid() ไม่มีการเช็ค dirtyDocument.body() != null
        // ก่อนส่งเข้า copySafeNodes(root, destination) ซึ่งจะเรียก root.childNodes()
        // ถ้า root (body) เป็น null จะทำให้เกิด NullPointerException
        // นี่คือจุดที่คาดว่าอาจเป็น fault ของคลาสนี้ตามที่วิเคราะห์จากซอร์สโค้ดที่ให้มา
        Document dirty = new Document("");
        Cleaner cleaner = new Cleaner(new Whitelist());

        cleaner.isValid(dirty);
    }
}
```

## สรุป Branch/Condition Coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `constructor_nullWhitelist_throwsException` | `Validate.notNull(whitelist)` ใน constructor — กรณี null |
| `clean_nullDocument_throwsException` | `Validate.notNull(dirtyDocument)` ใน `clean()` — กรณี null |
| `isValid_nullDocument_throwsException` | `Validate.notNull(dirtyDocument)` ใน `isValid()` — กรณี null |
| `clean_withAllowedAndDisallowedTags_keepsOnlySafeContent` | `isSafeTag == true` (if-branch) และ `isSafeTag == false` (else-branch) ใน `copySafeNodes` |
| `clean_mixedSafeAndUnsafeAttributes_keepsOnlySafeAttributes` | for-loop ของ attribute ใน `createSafeElement`, ทั้ง `isSafeAttribute == true` และ `== false` |
| `clean_unsafeParentWithSafeChild_discardsParentButKeepsChild` | else-branch ของ `copySafeNodes` + การ recurse `copySafeNodes(sourceEl, destination)` (ของเดิม ไม่ใช่ destChild) |
| `clean_enforcedAttribute_isAddedToOutput` | `destAttrs.addAll(enforcedAttrs)` ใน `createSafeElement` |
| `clean_textNodeIsCopiedAsIs` | branch `source instanceof TextNode` ใน `copySafeNodes` |
| `isValid_allSafeContent_returnsTrue` | `numDiscarded == 0` → `true` ใน `isValid` |
| `isValid_withUnsafeTag_returnsFalse` | `numDiscarded != 0` (จาก unsafe tag) → `false` ใน `isValid` |
| `isValid_withDisallowedAttribute_returnsFalse` | `numDiscarded != 0` (จาก unsafe attribute) → `false` ใน `isValid` |
| `clean_emptyWhitelist_discardsAllTags` | boundary: ทุก tag ถูกคัดออก (isSafeTag ตลอดเป็น false) |
| `clean_emptyBodyDocument_resultsInEmptyCleanBody` | boundary: for-loop ใน `copySafeNodes` วนศูนย์ครั้ง (ไม่มี child nodes) |
| `clean_documentWithoutBody_skipsCopy` | `if (dirtyDocument.body() != null)` — สาขา **false** ใน `clean()` |
| `isValid_documentWithoutBody_throwsNPE` | เส้นทางที่ `isValid()` ไม่มีการเช็ค null body (เปิดเผยพฤติกรรม/ช่องโหว่ที่อาจเป็น fault) |
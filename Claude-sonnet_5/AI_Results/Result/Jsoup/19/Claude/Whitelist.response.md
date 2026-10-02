# JUnit 4 Test Suite สำหรับ `Whitelist` (Jsoup-19b)

**หมายเหตุสำคัญก่อนโค้ด:**
- คลาส `Whitelist` และ nested class อยู่ใน package `org.jsoup.safety` และเมธอด `isSafeTag`, `isSafeAttribute`, `getEnforcedAttributes` เป็น package-private จึงต้องวาง test class ไว้ใน package เดียวกัน
- `testValidProtocol(...)` เป็น `private` จึงทดสอบทางอ้อมผ่าน `isSafeAttribute(...)`
- สมมติฐาน (ไม่มีซอร์สของ `org.jsoup.helper.Validate` ให้) — ผมอ้างอิงพฤติกรรมมาตรฐานของ jsoup ที่ `Validate.notNull`/`Validate.notEmpty` throw `IllegalArgumentException` — **คอมเมนต์กำกับไว้ในโค้ดแล้ว** เนื่องจากไม่มีซอร์สให้ยืนยัน 100%
- `Element.absUrl(key)` และ `Attribute`/`Attributes` ใช้ตาม public API ของ jsoup ที่มาพร้อมกับ source-under-test (Defects4J module)

```java
package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class WhitelistTest {

    // ---------- Static factory methods ----------

    @Test
    public void testNoneAllowsNoTags() {
        Whitelist wl = Whitelist.none();
        assertFalse(wl.isSafeTag("p"));
        assertFalse(wl.isSafeTag("a"));
        assertFalse(wl.isSafeTag("b"));
    }

    @Test
    public void testSimpleTextAllowsOnlySimpleTags() {
        Whitelist wl = Whitelist.simpleText();
        assertTrue(wl.isSafeTag("b"));
        assertTrue(wl.isSafeTag("em"));
        assertTrue(wl.isSafeTag("i"));
        assertTrue(wl.isSafeTag("strong"));
        assertTrue(wl.isSafeTag("u"));
        assertFalse(wl.isSafeTag("p"));
        assertFalse(wl.isSafeTag("a"));
    }

    @Test
    public void testBasicAllowsExpectedTagsAndAttributes() {
        Whitelist wl = Whitelist.basic();
        assertTrue(wl.isSafeTag("a"));
        assertTrue(wl.isSafeTag("blockquote"));
        assertFalse(wl.isSafeTag("img")); // basic() must NOT allow img

        // enforced attribute rel=nofollow on <a>
        Attributes enforced = wl.getEnforcedAttributes("a");
        assertEquals("nofollow", enforced.get("rel"));

        // valid protocol branch -> true
        Element el = new Element(Tag.valueOf("a"), "http://example.com/");
        el.attr("href", "http://example.com/page");
        Attribute attr = new Attribute("href", "http://example.com/page");
        assertTrue(wl.isSafeAttribute("a", el, attr));
    }

    @Test
    public void testBasicWithImagesAddsImgTag() {
        Whitelist wl = Whitelist.basicWithImages();
        assertTrue(wl.isSafeTag("img"));
        assertTrue(wl.isSafeTag("a")); // inherited from basic()

        Element el = new Element(Tag.valueOf("img"), "http://example.com/");
        el.attr("src", "http://example.com/img.png");
        Attribute attr = new Attribute("src", "http://example.com/img.png");
        assertTrue(wl.isSafeAttribute("img", el, attr));
    }

    @Test
    public void testRelaxedAllowsStructuralTags() {
        Whitelist wl = Whitelist.relaxed();
        assertTrue(wl.isSafeTag("table"));
        assertTrue(wl.isSafeTag("div"));
        assertTrue(wl.isSafeTag("h1"));
        assertFalse(wl.isSafeTag("script"));
    }

    // ---------- addTags ----------

    @Test(expected = IllegalArgumentException.class) // assumption: Validate.notNull throws IAE
    public void testAddTagsNullArrayThrows() {
        Whitelist wl = new Whitelist();
        wl.addTags((String[]) null);
    }

    @Test(expected = IllegalArgumentException.class) // assumption: Validate.notEmpty throws IAE
    public void testAddTagsEmptyStringThrows() {
        Whitelist wl = new Whitelist();
        wl.addTags("p", "");
    }

    @Test
    public void testAddTagsReturnsThisForChaining() {
        Whitelist wl = new Whitelist();
        assertSame(wl, wl.addTags("p"));
    }

    // ---------- addAttributes ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAddAttributesEmptyTagThrows() {
        Whitelist wl = new Whitelist();
        wl.addAttributes("", "href");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAttributesNullKeysThrows() {
        Whitelist wl = new Whitelist();
        wl.addAttributes("a", (String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAttributesEmptyKeyThrows() {
        Whitelist wl = new Whitelist();
        wl.addAttributes("a", "");
    }

    @Test
    public void testAddAttributesMergesIntoExistingTagSet() {
        // covers branch: attributes.containsKey(tagName) == true -> merge
        Whitelist wl = new Whitelist();
        wl.addTags("a");
        wl.addAttributes("a", "href");
        wl.addAttributes("a", "title"); // merge branch

        Element el = new Element(Tag.valueOf("a"), "");
        Attribute hrefAttr = new Attribute("href", "http://x.com");
        Attribute titleAttr = new Attribute("title", "hello");

        assertTrue(wl.isSafeAttribute("a", el, hrefAttr));
        assertTrue(wl.isSafeAttribute("a", el, titleAttr));
    }

    // ---------- addEnforcedAttribute ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAddEnforcedAttributeEmptyTagThrows() {
        Whitelist wl = new Whitelist();
        wl.addEnforcedAttribute("", "rel", "nofollow");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddEnforcedAttributeEmptyKeyThrows() {
        Whitelist wl = new Whitelist();
        wl.addEnforcedAttribute("a", "", "nofollow");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddEnforcedAttributeEmptyValueThrows() {
        Whitelist wl = new Whitelist();
        wl.addEnforcedAttribute("a", "rel", "");
    }

    @Test
    public void testAddEnforcedAttributeNewTagBranch() {
        // covers branch: enforcedAttributes.containsKey(tagName) == false -> new map
        Whitelist wl = new Whitelist();
        wl.addEnforcedAttribute("a", "rel", "nofollow");
        Attributes attrs = wl.getEnforcedAttributes("a");
        assertEquals("nofollow", attrs.get("rel"));
    }

    @Test
    public void testAddEnforcedAttributeOverridesExistingTagBranch() {
        // covers branch: enforcedAttributes.containsKey(tagName) == true -> override value
        Whitelist wl = new Whitelist();
        wl.addEnforcedAttribute("a", "rel", "nofollow");
        wl.addEnforcedAttribute("a", "rel", "noopener"); // same tag+key, should override
        Attributes attrs = wl.getEnforcedAttributes("a");
        assertEquals("noopener", attrs.get("rel"));
    }

    // ---------- addProtocols ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAddProtocolsEmptyTagThrows() {
        Whitelist wl = new Whitelist();
        wl.addProtocols("", "href", "http");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddProtocolsEmptyKeyThrows() {
        Whitelist wl = new Whitelist();
        wl.addProtocols("a", "", "http");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddProtocolsNullProtocolsArrayThrows() {
        Whitelist wl = new Whitelist();
        wl.addProtocols("a", "href", (String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddProtocolsEmptyProtocolStringThrows() {
        Whitelist wl = new Whitelist();
        wl.addProtocols("a", "href", "");
    }

    @Test
    public void testAddProtocolsMergeSameTagSameKey() {
        // covers branch: protocols.containsKey(tag)==true && attrMap.containsKey(key)==true -> merge set
        Whitelist wl = new Whitelist();
        wl.addTags("a");
        wl.addAttributes("a", "href");
        wl.addProtocols("a", "href", "http");
        wl.addProtocols("a", "href", "https"); // merge into same set

        Element el = new Element(Tag.valueOf("a"), "http://example.com/");
        el.attr("href", "https://example.com/page");
        Attribute attr = new Attribute("href", "https://example.com/page");
        assertTrue(wl.isSafeAttribute("a", el, attr));
    }

    @Test
    public void testAddProtocolsNewKeyForExistingTag() {
        // covers branch: protocols.containsKey(tag)==true but attrMap.containsKey(key)==false -> new set
        Whitelist wl = new Whitelist();
        wl.addTags("a");
        wl.addAttributes("a", "href", "cite");
        wl.addProtocols("a", "href", "http");
        wl.addProtocols("a", "cite", "https"); // same tag, different key

        Element el = new Element(Tag.valueOf("a"), "http://example.com/");
        el.attr("href", "http://example.com/page");
        el.attr("cite", "https://example.com/cite");

        Attribute hrefAttr = new Attribute("href", "http://example.com/page");
        Attribute citeAttr = new Attribute("cite", "https://example.com/cite");

        assertTrue(wl.isSafeAttribute("a", el, hrefAttr));
        assertTrue(wl.isSafeAttribute("a", el, citeAttr));
    }

    // ---------- isSafeTag ----------

    @Test
    public void testIsSafeTagTrueAndFalse() {
        Whitelist wl = new Whitelist();
        wl.addTags("p");
        assertTrue(wl.isSafeTag("p"));
        assertFalse(wl.isSafeTag("div"));
    }

    // ---------- isSafeAttribute branches ----------

    @Test
    public void testIsSafeAttributeKeyNotAllowedReturnsFalse() {
        // attributes.containsKey(tag)==true, but attributes.get(tag).contains(key)==false
        // -> falls through to final "return false"
        Whitelist wl = new Whitelist();
        wl.addTags("div");
        wl.addAttributes("div", "class");

        Element el = new Element(Tag.valueOf("div"), "");
        Attribute attr = new Attribute("style", "color:red"); // not allowed
        assertFalse(wl.isSafeAttribute("div", el, attr));
    }

    @Test
    public void testIsSafeAttributeNoProtocolsDefinedForTagReturnsTrue() {
        // attributes.containsKey(tag)==true, contains key==true,
        // protocols.containsKey(tag)==false -> "attribute found, no protocols defined, so OK"
        Whitelist wl = new Whitelist();
        wl.addTags("div");
        wl.addAttributes("div", "class");

        Element el = new Element(Tag.valueOf("div"), "");
        Attribute attr = new Attribute("class", "my-class");
        assertTrue(wl.isSafeAttribute("div", el, attr));
    }

    @Test
    public void testIsSafeAttributeProtocolsForTagButNotKeyReturnsTrue() {
        // protocols.containsKey(tag)==true but attrProts.containsKey(key)==false -> true
        Whitelist wl = new Whitelist();
        wl.addTags("div");
        wl.addAttributes("div", "class", "data-x");
        wl.addProtocols("div", "data-x", "http"); // protocols defined only for data-x

        Element el = new Element(Tag.valueOf("div"), "");
        Attribute attr = new Attribute("class", "my-class"); // different key, no protocol restriction
        assertTrue(wl.isSafeAttribute("div", el, attr));
    }

    @Test
    public void testIsSafeAttributeProtocolMismatchReturnsFalse() {
        // attrProts.containsKey(key)==true -> testValidProtocol() -> no matching protocol -> false
        Whitelist wl = new Whitelist();
        wl.addTags("a");
        wl.addAttributes("a", "href");
        wl.addProtocols("a", "href", "mailto"); // only mailto allowed

        Element el = new Element(Tag.valueOf("a"), "http://example.com/");
        el.attr("href", "http://example.com/page");
        Attribute attr = new Attribute("href", "http://example.com/page");
        assertFalse(wl.isSafeAttribute("a", el, attr));
    }

    @Test
    public void testIsSafeAttributeNoAttributesDefinedFallsBackToAllTagFalse() {
        // attributes.containsKey(tag)==false, tagName != ":all"
        // -> recursive call isSafeAttribute(":all",...) which also fails -> overall false
        Whitelist wl = new Whitelist();
        wl.addTags("div"); // no addAttributes for div

        Element el = new Element(Tag.valueOf("div"), "");
        Attribute attr = new Attribute("class", "x");
        assertFalse(wl.isSafeAttribute("div", el, attr));
    }

    @Test
    public void testIsSafeAttributeAllTagAllowsAttributeGlobally() {
        // attributes.containsKey(tag)==false, recursive call to ":all"
        // which DOES contain key -> true
        Whitelist wl = new Whitelist();
        wl.addTags("div");
        wl.addAttributes(":all", "class");

        Element el = new Element(Tag.valueOf("div"), "");
        Attribute attr = new Attribute("class", "x");
        assertTrue(wl.isSafeAttribute("div", el, attr));
    }

    @Test
    public void testIsSafeAttributeCalledDirectlyWithAllTagAndNoMatchReturnsFalse() {
        // directly covers: tagName.equals(":all") == true branch -> short-circuit false
        Whitelist wl = new Whitelist();
        Element el = new Element(Tag.valueOf("div"), "");
        Attribute attr = new Attribute("class", "x");
        assertFalse(wl.isSafeAttribute(":all", el, attr));
    }

    // ---------- testValidProtocol (tested indirectly) & preserveRelativeLinks ----------

    @Test
    public void testPreserveRelativeLinksDefaultFalseOverwritesAttributeValue() {
        // default preserveRelativeLinks == false -> attr.setValue(absUrl) is called
        Whitelist wl = new Whitelist();
        wl.addTags("a");
        wl.addAttributes("a", "href");
        wl.addProtocols("a", "href", "http", "https");

        Element el = new Element(Tag.valueOf("a"), "http://example.com/");
        el.attr("href", "/relative");
        Attribute attr = new Attribute("href", "/relative");

        boolean safe = wl.isSafeAttribute("a", el, attr);
        assertTrue(safe);
        assertEquals("http://example.com/relative", attr.getValue()); // overwritten to absolute
    }

    @Test
    public void testPreserveRelativeLinksTrueKeepsOriginalAttributeValue() {
        // preserveRelativeLinks == true -> attr.setValue() NOT called
        Whitelist wl = new Whitelist();
        wl.addTags("a");
        wl.addAttributes("a", "href");
        wl.addProtocols("a", "href", "http", "https");
        wl.preserveRelativeLinks(true);

        Element el = new Element(Tag.valueOf("a"), "http://example.com/");
        el.attr("href", "/relative");
        Attribute attr = new Attribute("href", "/relative");

        boolean safe = wl.isSafeAttribute("a", el, attr);
        assertTrue(safe); // resolved via el.absUrl() internally, regardless of attr mutation
        assertEquals("/relative", attr.getValue()); // unchanged
    }

    @Test
    public void testPreserveRelativeLinksReturnsThisForChaining() {
        Whitelist wl = new Whitelist();
        assertSame(wl, wl.preserveRelativeLinks(false));
    }

    @Test
    public void testTestValidProtocolLoopFindsMatchAmongMultipleProtocols() {
        // covers the for-loop in testValidProtocol iterating multiple protocols until match found
        Whitelist wl = new Whitelist();
        wl.addTags("a");
        wl.addAttributes("a", "href");
        wl.addProtocols("a", "href", "ftp", "http", "https", "mailto");

        Element el = new Element(Tag.valueOf("a"), "http://example.com/");
        el.attr("href", "mailto:test@example.com");
        Attribute attr = new Attribute("href", "mailto:test@example.com");

        assertTrue(wl.isSafeAttribute("a", el, attr));
    }

    // ---------- getEnforcedAttributes ----------

    @Test
    public void testGetEnforcedAttributesNoEntryReturnsEmpty() {
        // enforcedAttributes.containsKey(tag)==false -> returns empty Attributes
        Whitelist wl = new Whitelist();
        Attributes attrs = wl.getEnforcedAttributes("a");
        assertEquals(0, attrs.size());
    }

    @Test
    public void testGetEnforcedAttributesWithEntryReturnsValues() {
        // enforcedAttributes.containsKey(tag)==true -> populates Attributes
        Whitelist wl = new Whitelist();
        wl.addEnforcedAttribute("a", "rel", "nofollow");
        Attributes attrs = wl.getEnforcedAttributes("a");
        assertEquals(1, attrs.size());
        assertEquals("nofollow", attrs.get("rel"));
    }
}
```

## สรุปตาราง Test ↔ Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testNoneAllowsNoTags` | `none()` factory — tagNames ว่าง, `isSafeTag` false ทุกกรณี |
| `testSimpleTextAllowsOnlySimpleTags` | `simpleText()` — tag อยู่/ไม่อยู่ใน whitelist |
| `testBasicAllowsExpectedTagsAndAttributes` | `basic()` — tag allowed/not allowed, enforced attribute, protocol match → true |
| `testBasicWithImagesAddsImgTag` | `basicWithImages()` — เพิ่ม tag/attr/protocol จาก base |
| `testRelaxedAllowsStructuralTags` | `relaxed()` — tag allowed/not allowed |
| `testAddTagsNullArrayThrows` | `addTags` — `Validate.notNull(tags)` throw |
| `testAddTagsEmptyStringThrows` | `addTags` — `Validate.notEmpty(tagName)` throw |
| `testAddTagsReturnsThisForChaining` | `addTags` — return value chaining |
| `testAddAttributesEmptyTagThrows` | `addAttributes` — tag empty throw |
| `testAddAttributesNullKeysThrows` | `addAttributes` — keys null throw |
| `testAddAttributesEmptyKeyThrows` | `addAttributes` — key empty throw |
| `testAddAttributesMergesIntoExistingTagSet` | `addAttributes` — `attributes.containsKey(tagName)==true` merge branch |
| `testAddEnforcedAttributeEmptyTagThrows/EmptyKeyThrows/EmptyValueThrows` | `addEnforcedAttribute` — validate throws 3 เงื่อนไข |
| `testAddEnforcedAttributeNewTagBranch` | `enforcedAttributes.containsKey==false` → new map branch |
| `testAddEnforcedAttributeOverridesExistingTagBranch` | `enforcedAttributes.containsKey==true` → override branch |
| `testAddProtocolsEmptyTagThrows/EmptyKeyThrows/NullProtocolsArrayThrows/EmptyProtocolStringThrows` | `addProtocols` validate throws 4 เงื่อนไข |
| `testAddProtocolsMergeSameTagSameKey` | `protocols.containsKey(tag)==true && attrMap.containsKey(key)==true` merge |
| `testAddProtocolsNewKeyForExistingTag` | `protocols.containsKey(tag)==true && attrMap.containsKey(key)==false` new set |
| `testIsSafeTagTrueAndFalse` | `isSafeTag` — true/false branch |
| `testIsSafeAttributeKeyNotAllowedReturnsFalse` | `attributes.containsKey(tag)==true`, key ไม่พบ → fallthrough false |
| `testIsSafeAttributeNoProtocolsDefinedForTagReturnsTrue` | key พบ, `protocols.containsKey(tag)==false` → true |
| `testIsSafeAttributeProtocolsForTagButNotKeyReturnsTrue` | `protocols.containsKey(tag)==true`, `attrProts.containsKey(key)==false` → true |
| `testIsSafeAttributeProtocolMismatchReturnsFalse` | `attrProts.containsKey(key)==true` → `testValidProtocol` → false |
| `testIsSafeAttributeNoAttributesDefinedFallsBackToAllTagFalse` | `attributes.containsKey(tag)==false`, recursive `:all` → false |
| `testIsSafeAttributeAllTagAllowsAttributeGlobally` | recursive `:all` branch → true |
| `testIsSafeAttributeCalledDirectlyWithAllTagAndNoMatchReturnsFalse` | `tagName.equals(":all")==true` short-circuit false |
| `testPreserveRelativeLinksDefaultFalseOverwritesAttributeValue` | `preserveRelativeLinks==false` → `attr.setValue()` ถูกเรียก |
| `testPreserveRelativeLinksTrueKeepsOriginalAttributeValue` | `preserveRelativeLinks==true` → ไม่เรียก `setValue()` |
| `testPreserveRelativeLinksReturnsThisForChaining` | return `this` chaining |
| `testTestValidProtocolLoopFindsMatchAmongMultipleProtocols` | for-loop ใน `testValidProtocol` วนหลาย protocol จนพบ match |
| `testGetEnforcedAttributesNoEntryReturnsEmpty` | `enforcedAttributes.containsKey(tag)==false` → empty Attributes |
| `testGetEnforcedAttributesWithEntryReturnsValues` | `enforcedAttributes.containsKey(tag)==true` → loop entrySet เติมค่า |
# TagTest.java

```java
package org.jsoup.parser;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

/**
 * JUnit4 test suite for org.jsoup.parser.Tag (Defects4J Jsoup-87b)
 *
 * หมายเหตุ (ASSUMPTIONS):
 * - ParseSettings.htmlDefault / ParseSettings.preserveCase ไม่ได้แสดง source มาด้วย
 *   แต่เป็น public static field ที่จำเป็นต้องใช้เพื่อเรียก Tag.valueOf(String, ParseSettings)
 *   สมมติฐาน (ตาม public API/Javadoc ของ jsoup ที่เป็นที่รู้จัก):
 *     * htmlDefault.normalizeTag(...)  -> lower-case ชื่อแท็ก
 *     * preserveCase.normalizeTag(...) -> คงตัวพิมพ์เดิม (trim เท่านั้น)
 * - org.jsoup.helper.Validate.notNull / notEmpty สมมติว่าโยน IllegalArgumentException
 *   (ตาม behavior มาตรฐานของ jsoup Validate class)
 * - ใช้ reflection เพื่อปรับ private boolean field ของ Tag เพื่อ isolate แต่ละ branch
 *   ใน equals() เท่านั้น (ไม่ใช่การเดา behavior แต่เป็นเทคนิคช่วย coverage)
 */
public class TagTest {

    // ---------- Helper ----------
    private void setPrivateBooleanField(Tag tag, String fieldName, boolean value) throws Exception {
        Field f = Tag.class.getDeclaredField(fieldName);
        f.setAccessible(true);
        f.set(tag, value);
    }

    // ---------- valueOf(String, ParseSettings) branch tests ----------

    @Test
    public void testValueOf_DirectMatch_KnownTag() {
        // tagName ตรงกับ key ใน map โดยตรง -> ไม่ต้อง normalize
        Tag div1 = Tag.valueOf("div", ParseSettings.preserveCase);
        Tag div2 = Tag.valueOf("div", ParseSettings.preserveCase);
        assertSame("known tag ต้องเป็น instance เดียวกัน (==)", div1, div2);
        assertEquals("div", div1.getName());
        assertTrue(div1.isKnownTag());
    }

    @Test
    public void testValueOf_NotFoundThenNormalizedMatch_HtmlDefault() {
        // ไม่พบตรง ๆ ("DIV" ไม่มีใน map) -> normalize (lower-case ตาม htmlDefault) -> พบ "div"
        Tag tag = Tag.valueOf("DIV", ParseSettings.htmlDefault);
        Tag divRef = Tag.valueOf("div", ParseSettings.htmlDefault);
        assertSame("หลัง normalize ต้องได้ instance เดียวกับ known tag 'div'", divRef, tag);
        assertTrue(tag.isBlock());
    }

    @Test
    public void testValueOf_NotFoundAfterNormalization_CreatesGenericTag() {
        // ไม่พบทั้งก่อนและหลัง normalize -> สร้าง tag ใหม่ที่ isBlock=false
        Tag tag = Tag.valueOf("zzzUnknownCustomTag", ParseSettings.htmlDefault);
        assertFalse("unknown tag ต้อง isBlock=false", tag.isBlock());
        assertFalse(tag.isKnownTag());
        // ค่า default อื่น ๆ ต้องไม่ถูกแก้ไข
        assertTrue(tag.formatAsBlock());
        assertFalse(tag.isEmpty());
        assertFalse(tag.isSelfClosing());
        assertFalse(tag.preserveWhitespace());
        assertFalse(tag.isFormListed());
        assertFalse(tag.isFormSubmittable());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_NullTagName_ThrowsException() {
        Tag.valueOf(null, ParseSettings.preserveCase);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_EmptyTagNameAfterNormalization_ThrowsException() {
        // "" ไม่พบใน map (ตรง ๆ) -> normalize("") ยังเป็น "" -> Validate.notEmpty ต้องโยน exception
        Tag.valueOf("", ParseSettings.htmlDefault);
    }

    @Test
    public void testValueOf_SingleArgOverload_UsesPreserveCase() {
        // overload 1 arg ใช้ ParseSettings.preserveCase ซึ่งไม่ lower-case ชื่อ
        // "DIV" ไม่พบตรง ๆ, normalize (preserveCase) ยังเป็น "DIV", ไม่พบใน map (key เป็น lower-case)
        // -> ต้องสร้าง generic tag ใหม่ชื่อ "DIV" ที่ isBlock=false
        Tag tag = Tag.valueOf("DIV");
        assertEquals("DIV", tag.getName());
        assertFalse(tag.isBlock());
        assertFalse(tag.isKnownTag());
    }

    @Test
    public void testValueOf_SingleArgOverload_KnownLowerCaseDirectMatch() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.isKnownTag());
        assertEquals("p", tag.getName());
    }

    // ---------- Getter / flag combination tests ----------

    @Test
    public void testDivTag_BlockDefaultProperties() {
        Tag div = Tag.valueOf("div");
        assertTrue(div.isBlock());
        assertFalse(div.isInline());
        assertTrue(div.formatAsBlock());
        assertTrue(div.canContainBlock()); // deprecated, == isBlock()
        assertFalse(div.isEmpty());
        assertFalse(div.isSelfClosing());
        assertFalse(div.isData()); // canContainInline=true -> isData() false
        assertFalse(div.preserveWhitespace());
        assertFalse(div.isFormListed());
        assertFalse(div.isFormSubmittable());
        assertTrue(div.isKnownTag());
        assertEquals("div", div.toString());
    }

    @Test
    public void testPTag_FormatAsBlockFalse() {
        // "p" อยู่ใน formatAsInlineTags -> formatAsBlock=false แม้เป็น block tag
        Tag p = Tag.valueOf("p");
        assertTrue(p.isBlock());
        assertFalse(p.formatAsBlock());
    }

    @Test
    public void testMetaTag_EmptyAndSelfClosing() {
        // "meta" อยู่ใน blockTags และ emptyTags
        Tag meta = Tag.valueOf("meta");
        assertTrue(meta.isBlock());
        assertTrue(meta.isEmpty());
        assertTrue(meta.isSelfClosing()); // empty || selfClosing
        // canContainInline=false แต่ empty=true -> isData() ต้องเป็น false
        assertFalse(meta.isData());
        // meta ไม่อยู่ใน formatAsInlineTags -> formatAsBlock ยังคงจริง
        assertTrue(meta.formatAsBlock());
    }

    @Test
    public void testImgTag_InlineAndEmpty() {
        // "img" อยู่ใน inlineTags และ emptyTags
        Tag img = Tag.valueOf("img");
        assertFalse(img.isBlock());
        assertTrue(img.isInline());
        assertFalse(img.formatAsBlock()); // inline tag ตั้ง formatAsBlock=false
        assertTrue(img.isEmpty());
        assertTrue(img.isSelfClosing());
        assertFalse(img.isData());
    }

    @Test
    public void testPreTag_PreserveWhitespaceAndFormatAsInline() {
        Tag pre = Tag.valueOf("pre");
        assertTrue(pre.isBlock());
        assertFalse(pre.formatAsBlock()); // pre อยู่ใน formatAsInlineTags
        assertTrue(pre.preserveWhitespace());
        assertFalse(pre.isEmpty());
    }

    @Test
    public void testTextareaTag_FormListAndSubmitAndPreserveWhitespace() {
        Tag textarea = Tag.valueOf("textarea");
        assertFalse(textarea.isBlock()); // อยู่ใน inlineTags
        assertTrue(textarea.isFormListed());
        assertTrue(textarea.isFormSubmittable());
        assertTrue(textarea.preserveWhitespace());
    }

    @Test
    public void testButtonTag_FormListedButNotSubmittable() {
        // "button" อยู่ใน formListedTags แต่ไม่อยู่ใน formSubmitTags
        Tag button = Tag.valueOf("button");
        assertTrue(button.isFormListed());
        assertFalse(button.isFormSubmittable());
    }

    @Test
    public void testUnknownTag_Defaults() {
        Tag unknown = Tag.valueOf("zzzNotRealTag999");
        assertFalse(unknown.isBlock());
        assertTrue(unknown.isInline());
        assertTrue(unknown.formatAsBlock());
        assertFalse(unknown.isEmpty());
        assertFalse(unknown.isSelfClosing());
        assertFalse(unknown.isData());
        assertFalse(unknown.preserveWhitespace());
        assertFalse(unknown.isFormListed());
        assertFalse(unknown.isFormSubmittable());
        assertFalse(unknown.isKnownTag());
    }

    // ---------- isKnownTag (static) ----------

    @Test
    public void testIsKnownTag_Static_True() {
        assertTrue(Tag.isKnownTag("div"));
    }

    @Test
    public void testIsKnownTag_Static_False() {
        assertFalse(Tag.isKnownTag("zzzNotRealTag999"));
    }

    // ---------- setSelfClosing (package-private, same package) ----------

    @Test
    public void testSetSelfClosing_ChangesStateAndReturnsThis() {
        Tag tag = Tag.valueOf("zzzSelfClose1");
        assertFalse(tag.isSelfClosing());
        Tag returned = tag.setSelfClosing();
        assertSame("setSelfClosing ต้อง return this", tag, returned);
        assertTrue(tag.isSelfClosing());
    }

    // ---------- equals() branch coverage ----------

    @Test
    public void testEquals_SameReference_True() {
        Tag div = Tag.valueOf("div");
        assertTrue(div.equals(div));
    }

    @Test
    public void testEquals_NotInstanceOfTag_False() {
        Tag div = Tag.valueOf("div");
        assertFalse(div.equals("div"));
        assertFalse(div.equals(null));
    }

    @Test
    public void testEquals_DifferentTagName_False() {
        Tag div = Tag.valueOf("div");
        Tag p = Tag.valueOf("p");
        assertFalse(div.equals(p));
    }

    @Test
    public void testEquals_SameTagNameSameFlags_True() {
        // unknown tag สองตัวชื่อเดียวกัน ค่า default เหมือนกันทุก field -> equals ต้อง true
        Tag a = Tag.valueOf("zzzEqA");
        Tag b = Tag.valueOf("zzzEqA");
        assertNotSame(a, b); // unknown tag ไม่ cache/ไม่ ==
        assertTrue(a.equals(b));
        assertTrue(b.equals(a));
    }

    @Test
    public void testEquals_DifferentCanContainInline_False() throws Exception {
        Tag a = Tag.valueOf("zzzEqB1");
        Tag b = Tag.valueOf("zzzEqB1");
        setPrivateBooleanField(b, "canContainInline", !isCanContainInline(b));
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_DifferentEmpty_False() throws Exception {
        Tag a = Tag.valueOf("zzzEqB2");
        Tag b = Tag.valueOf("zzzEqB2");
        setPrivateBooleanField(b, "empty", true);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_DifferentFormatAsBlock_False() throws Exception {
        Tag a = Tag.valueOf("zzzEqB3");
        Tag b = Tag.valueOf("zzzEqB3");
        setPrivateBooleanField(b, "formatAsBlock", false);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_DifferentIsBlock_False() throws Exception {
        Tag a = Tag.valueOf("zzzEqB4");
        Tag b = Tag.valueOf("zzzEqB4");
        setPrivateBooleanField(b, "isBlock", true);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_DifferentPreserveWhitespace_False() throws Exception {
        Tag a = Tag.valueOf("zzzEqB5");
        Tag b = Tag.valueOf("zzzEqB5");
        setPrivateBooleanField(b, "preserveWhitespace", true);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_DifferentSelfClosing_False() {
        Tag a = Tag.valueOf("zzzEqB6");
        Tag b = Tag.valueOf("zzzEqB6");
        b.setSelfClosing(); // selfClosing = true เฉพาะ b
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_DifferentFormList_False() throws Exception {
        Tag a = Tag.valueOf("zzzEqB7");
        Tag b = Tag.valueOf("zzzEqB7");
        setPrivateBooleanField(b, "formList", true);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_DifferentFormSubmit_FinalReturnFalse() throws Exception {
        Tag a = Tag.valueOf("zzzEqB8");
        Tag b = Tag.valueOf("zzzEqB8");
        setPrivateBooleanField(b, "formSubmit", true);
        assertFalse(a.equals(b)); // ตกไปถึง return formSubmit == tag.formSubmit; ได้ false
    }

    // helper เพื่ออ่านค่า private field (ใช้ประกอบ test ด้านบนเท่านั้น)
    private boolean isCanContainInline(Tag tag) throws Exception {
        Field f = Tag.class.getDeclaredField("canContainInline");
        f.setAccessible(true);
        return f.getBoolean(tag);
    }

    // ---------- hashCode / toString ----------

    @Test
    public void testHashCode_ConsistentForEqualObjects() {
        Tag a = Tag.valueOf("zzzHash1");
        Tag b = Tag.valueOf("zzzHash1");
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testHashCode_Deterministic() {
        Tag div = Tag.valueOf("div");
        int h1 = div.hashCode();
        int h2 = div.hashCode();
        assertEquals(h1, h2);
    }

    @Test
    public void testToString_ReturnsTagName() {
        Tag div = Tag.valueOf("div");
        assertEquals("div", div.toString());
        Tag unknown = Tag.valueOf("zzzToString1");
        assertEquals("zzzToString1", unknown.toString());
    }

    // ---------- getName ----------

    @Test
    public void testGetName_ReturnsExactStoredName() {
        Tag tag = Tag.valueOf("DIV"); // preserveCase, ไม่พบ -> เก็บชื่อตามที่ส่งมา
        assertEquals("DIV", tag.getName());
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testValueOf_DirectMatch_KnownTag | `valueOf`: `tag == null` → false (พบตรง ๆ), ไม่เข้า normalize |
| testValueOf_NotFoundThenNormalizedMatch_HtmlDefault | `tag==null`→true, normalize แล้วพบ (`tag==null` รอบสอง → false) |
| testValueOf_NotFoundAfterNormalization_CreatesGenericTag | ทั้งสองรอบ `tag==null`→true, สร้าง Tag ใหม่, `isBlock=false` |
| testValueOf_NullTagName_ThrowsException | `Validate.notNull(tagName)` เส้นทาง throw |
| testValueOf_EmptyTagNameAfterNormalization_ThrowsException | `Validate.notEmpty(tagName)` เส้นทาง throw |
| testValueOf_SingleArgOverload_UsesPreserveCase | overload `valueOf(String)` → `preserveCase`, สร้าง generic tag |
| testValueOf_SingleArgOverload_KnownLowerCaseDirectMatch | overload 1-arg, direct match |
| testDivTag_BlockDefaultProperties | isBlock/isInline/formatAsBlock/canContainBlock/isEmpty/isSelfClosing/isData/preserveWhitespace/isFormListed/isFormSubmittable/isKnownTag/toString (all-default branch) |
| testPTag_FormatAsBlockFalse | formatAsInlineTags loop ผล: `formatAsBlock=false` |
| testMetaTag_EmptyAndSelfClosing | emptyTags loop: `empty=true`, `isSelfClosing` (`empty||selfClosing`) true-branch จาก empty, `isData` false เพราะ `empty` |
| testImgTag_InlineAndEmpty | inlineTags loop (`isBlock=false, formatAsBlock=false`) + emptyTags loop ร่วมกัน |
| testPreTag_PreserveWhitespaceAndFormatAsInline | preserveWhitespaceTags loop + formatAsInlineTags loop |
| testTextareaTag_FormListAndSubmitAndPreserveWhitespace | formListedTags + formSubmitTags loop (ทั้งสอง true) |
| testButtonTag_FormListedButNotSubmittable | formListedTags true, formSubmitTags false (แยก branch) |
| testUnknownTag_Defaults | เส้นทาง unknown tag ค่า default ทั้งหมด |
| testIsKnownTag_Static_True / False | `tags.containsKey` true/false branch (static) |
| testSetSelfClosing_ChangesStateAndReturnsThis | `setSelfClosing()` เปลี่ยนค่า + `isSelfClosing` (`selfClosing` true-branch) |
| testEquals_SameReference_True | `this == o` → true shortcut |
| testEquals_NotInstanceOfTag_False | `!(o instanceof Tag)` → true (false result) |
| testEquals_DifferentTagName_False | `!tagName.equals(...)` → true (false result) |
| testEquals_SameTagNameSameFlags_True | ผ่านทุกเงื่อนไขจนถึง `return formSubmit==formSubmit` → true |
| testEquals_DifferentCanContainInline_False | branch `canContainInline != tag.canContainInline` |
| testEquals_DifferentEmpty_False | branch `empty != tag.empty` |
| testEquals_DifferentFormatAsBlock_False | branch `formatAsBlock != tag.formatAsBlock` |
| testEquals_DifferentIsBlock_False | branch `isBlock != tag.isBlock` |
| testEquals_DifferentPreserveWhitespace_False | branch `preserveWhitespace != tag.preserveWhitespace` |
| testEquals_DifferentSelfClosing_False | branch `selfClosing != tag.selfClosing` |
| testEquals_DifferentFormList_False | branch `formList != tag.formList` |
| testEquals_DifferentFormSubmit_FinalReturnFalse | final `return formSubmit == tag.formSubmit` → false-outcome |
| testHashCode_ConsistentForEqualObjects / Deterministic | hashCode คำนวณถูกต้อง/สม่ำเสมอ |
| testToString_ReturnsTagName | `toString()` คืน tagName |
| testGetName_ReturnsExactStoredName | `getName()` คืนชื่อตามที่สร้าง (ไม่ normalize ซ้ำ) |

**หมายเหตุสำคัญ:** การทดสอบที่ใช้ `ParseSettings.htmlDefault`/`preserveCase` และพฤติกรรม `normalizeTag` (lower-case/trim) เป็นไปตาม public API ที่เป็นที่รู้จักของ jsoup แต่ **ไม่มี source ของ `ParseSettings` ให้มาโดยตรง** จึงกำกับเป็นสมมติฐานไว้ในคอมเมนต์ต้นไฟล์ หากพฤติกรรมจริงต่างไป อาจต้องปรับ assertion ในส่วน `testValueOf_*` ที่เกี่ยวข้อง
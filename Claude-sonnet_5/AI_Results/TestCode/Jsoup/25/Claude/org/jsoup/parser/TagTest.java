package org.jsoup.parser;

import org.jsoup.parser.Tag; // redundant แต่เขียนไว้ตามข้อกำหนดให้ import คลาสเป้าหมายอย่างชัดเจน

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * หมายเหตุสำคัญ:
 * 1) ไม่มีแหล่งที่มาของ org.jsoup.helper.Validate ให้ดู จึงต้อง "สมมติ" ว่า
 *    Validate.notNull / Validate.notEmpty throw IllegalArgumentException
 *    ตามรูปแบบมาตรฐานของ jsoup ในยุคนั้น (คอมเมนต์กำกับไว้ที่ test ที่เกี่ยวข้อง)
 * 2) คลาสทดสอบนี้ถูกวางไว้ใน package เดียวกับ Tag (org.jsoup.parser)
 *    เพื่อให้สามารถเรียก package-private method setSelfClosing() ได้โดยตรง
 * 3) ใช้ reflection เพื่อเข้าถึง private constructor และ private field ของ Tag
 *    สำหรับสร้างกรณีทดสอบ equals()/hashCode() แบบควบคุมค่าได้ครบทุก branch
 */
public class TagTest {

    // ---------- Reflection helpers ----------

    private Tag newTagViaReflection(String name) throws Exception {
        Constructor<Tag> ctor = Tag.class.getDeclaredConstructor(String.class);
        ctor.setAccessible(true);
        return ctor.newInstance(name);
    }

    private void setBooleanField(Tag tag, String fieldName, boolean value) throws Exception {
        Field f = Tag.class.getDeclaredField(fieldName);
        f.setAccessible(true);
        f.setBoolean(tag, value);
    }

    private Tag buildTag(String name,
                          boolean isBlock,
                          boolean formatAsBlock,
                          boolean canContainBlock,
                          boolean canContainInline,
                          boolean empty,
                          boolean selfClosing,
                          boolean preserveWhitespace) throws Exception {
        Tag t = newTagViaReflection(name);
        setBooleanField(t, "isBlock", isBlock);
        setBooleanField(t, "formatAsBlock", formatAsBlock);
        setBooleanField(t, "canContainBlock", canContainBlock);
        setBooleanField(t, "canContainInline", canContainInline);
        setBooleanField(t, "empty", empty);
        setBooleanField(t, "selfClosing", selfClosing);
        setBooleanField(t, "preserveWhitespace", preserveWhitespace);
        return t;
    }

    // ---------- valueOf() ----------

    @Test(expected = IllegalArgumentException.class)
    public void valueOf_nullTagName_throws() {
        Tag.valueOf(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void valueOf_emptyAfterTrim_throws() {
        Tag.valueOf("   "); // trim -> "" -> notEmpty ควร throw
    }

    @Test
    public void valueOf_trimsAndLowercases_andReturnsCachedInstance() {
        Tag a = Tag.valueOf("div");
        Tag b = Tag.valueOf("  DIV  ");
        assertSame("known tag ต้องถูก cache (==)", a, b);
        assertEquals("div", b.getName());
    }

    @Test
    public void valueOf_knownTag_sameReferenceOnRepeatedCalls() {
        Tag p1 = Tag.valueOf("p");
        Tag p2 = Tag.valueOf("p");
        assertSame(p1, p2);
    }

    @Test
    public void valueOf_unknownTag_notCached_butEqual() {
        Tag u1 = Tag.valueOf("customUnknownTag1");
        Tag u2 = Tag.valueOf("customUnknownTag1");
        assertNotSame("unknown tag ไม่ถูก register/cache", u1, u2);
        assertEquals("แต่ควร .equals() กันได้", u1, u2);
        assertFalse(u1.isBlock());
        assertTrue(u1.canContainBlock());
        assertFalse(u1.isKnownTag());
    }

    // ---------- getName ----------

    @Test
    public void getName_returnsLowercasedTrimmedName() {
        Tag t = Tag.valueOf(" DIV ");
        assertEquals("div", t.getName());
    }

    // ---------- isBlock / isInline ----------

    @Test
    public void isBlock_trueForBlockTag() {
        assertTrue(Tag.valueOf("div").isBlock());
    }

    @Test
    public void isBlock_falseForInlineTag() {
        assertFalse(Tag.valueOf("span").isBlock());
    }

    @Test
    public void isInline_isNegationOfIsBlock() {
        assertFalse(Tag.valueOf("div").isInline());
        assertTrue(Tag.valueOf("span").isInline());
    }

    // ---------- formatAsBlock ----------

    @Test
    public void formatAsBlock_trueForOrdinaryBlockTag() {
        assertTrue(Tag.valueOf("div").formatAsBlock());
    }

    @Test
    public void formatAsBlock_falseForBlockTagInFormatAsInlineList() {
        assertFalse(Tag.valueOf("p").formatAsBlock());      // block แต่ override เป็น inline-format
        assertFalse(Tag.valueOf("script").formatAsBlock());
    }

    @Test
    public void formatAsBlock_falseForInlineTag() {
        assertFalse(Tag.valueOf("span").formatAsBlock());
    }

    // ---------- canContainBlock ----------

    @Test
    public void canContainBlock_trueForBlockTag() {
        assertTrue(Tag.valueOf("div").canContainBlock());
    }

    @Test
    public void canContainBlock_falseForInlineTag() {
        assertFalse(Tag.valueOf("span").canContainBlock());
    }

    @Test
    public void canContainBlock_falseForEmptyTag() {
        assertFalse(Tag.valueOf("img").canContainBlock());
    }

    @Test
    public void canContainBlock_trueForUnknownTag() {
        assertTrue(Tag.valueOf("unknownTagXYZ").canContainBlock());
    }

    // ---------- isData() ----------
    // หมายเหตุ: จากซอร์สโค้ดจริง canContainInline ถูกตั้งเป็น false เฉพาะ tag ใน
    // emptyTags[] ซึ่ง tag เหล่านั้น empty=true เสมอ ดังนั้น
    // (!canContainInline && !isEmpty()) ไม่สามารถเป็น true ได้เลยด้วยข้อมูล static
    // ปัจจุบัน -- เราทดสอบ "พฤติกรรมจริง" ตามซอร์ส ไม่ได้เดาว่าควรเป็น true

    @Test
    public void isData_falseForOrdinaryBlockTag() {
        assertFalse(Tag.valueOf("div").isData());
    }

    @Test
    public void isData_falseForEmptyTag() {
        assertFalse(Tag.valueOf("img").isData());
    }

    @Test
    public void isData_falseForUnknownTag() {
        assertFalse(Tag.valueOf("unknownTagABC").isData());
    }

    // ---------- isEmpty ----------

    @Test
    public void isEmpty_trueForEmptyTag() {
        assertTrue(Tag.valueOf("img").isEmpty());
    }

    @Test
    public void isEmpty_falseForNonEmptyTag() {
        assertFalse(Tag.valueOf("div").isEmpty());
    }

    // ---------- isSelfClosing ----------

    @Test
    public void isSelfClosing_trueBecauseEmpty() {
        assertTrue(Tag.valueOf("img").isSelfClosing());
    }

    @Test
    public void isSelfClosing_falseByDefaultForOrdinaryTag() {
        assertFalse(Tag.valueOf("div").isSelfClosing());
    }

    @Test
    public void isSelfClosing_trueAfterSetSelfClosing() {
        Tag t = Tag.valueOf("unknownTagSelfClose");
        assertFalse(t.isEmpty());
        assertFalse(t.isSelfClosing());
        Tag same = t.setSelfClosing(); // package-private method, เรียกได้เพราะ test อยู่ใน package เดียวกัน
        assertSame(t, same);
        assertTrue(t.isSelfClosing());
    }

    // ---------- isKnownTag (instance & static) ----------

    @Test
    public void isKnownTag_instance_trueForRegisteredTag() {
        assertTrue(Tag.valueOf("div").isKnownTag());
    }

    @Test
    public void isKnownTag_instance_falseForUnknownTag() {
        assertFalse(Tag.valueOf("notARealTag123").isKnownTag());
    }

    @Test
    public void isKnownTag_static_trueForRegisteredLowercaseName() {
        assertTrue(Tag.isKnownTag("div"));
    }

    @Test
    public void isKnownTag_static_falseForUnknownName() {
        assertFalse(Tag.isKnownTag("notARealTag123"));
    }

    @Test
    public void isKnownTag_static_isCaseSensitive_potentialFault() {
        // static isKnownTag ไม่ normalize case (ต่างจาก valueOf ที่ lowercase ก่อน)
        // เป็นจุดที่อาจเป็น fault/inconsistency ในซอร์สจริง
        assertFalse(Tag.isKnownTag("DIV"));
        assertTrue(Tag.isKnownTag("div"));
    }

    // ---------- preserveWhitespace ----------

    @Test
    public void preserveWhitespace_trueForPreTag() {
        assertTrue(Tag.valueOf("pre").preserveWhitespace());
    }

    @Test
    public void preserveWhitespace_falseForOrdinaryTag() {
        assertFalse(Tag.valueOf("div").preserveWhitespace());
    }

    // ---------- equals() ----------

    @Test
    public void equals_sameReference_true() {
        Tag t = Tag.valueOf("div");
        assertTrue(t.equals(t));
    }

    @Test
    public void equals_null_false() {
        assertFalse(Tag.valueOf("div").equals(null));
    }

    @Test
    public void equals_differentType_false() {
        assertFalse(Tag.valueOf("div").equals("div"));
    }

    @Test
    public void equals_unknownTagsWithSameName_true() {
        Tag u1 = Tag.valueOf("sameUnknown1");
        Tag u2 = Tag.valueOf("sameUnknown1");
        assertNotSame(u1, u2);
        assertTrue(u1.equals(u2));
    }

    @Test
    public void equals_allFieldsIdentical_true() throws Exception {
        Tag a = buildTag("base", true, true, true, true, false, false, false);
        Tag b = buildTag("base", true, true, true, true, false, false, false);
        assertTrue(a.equals(b));
    }

    @Test
    public void equals_differentCanContainBlock_false() throws Exception {
        Tag a = buildTag("base", true, true, true, true, false, false, false);
        Tag b = buildTag("base", true, true, false, true, false, false, false);
        assertFalse(a.equals(b));
    }

    @Test
    public void equals_differentCanContainInline_false() throws Exception {
        Tag a = buildTag("base", true, true, true, true, false, false, false);
        Tag b = buildTag("base", true, true, true, false, false, false, false);
        assertFalse(a.equals(b));
    }

    @Test
    public void equals_differentEmpty_false() throws Exception {
        Tag a = buildTag("base", true, true, true, true, false, false, false);
        Tag b = buildTag("base", true, true, true, true, true, false, false);
        assertFalse(a.equals(b));
    }

    @Test
    public void equals_differentFormatAsBlock_false() throws Exception {
        Tag a = buildTag("base", true, true, true, true, false, false, false);
        Tag b = buildTag("base", true, false, true, true, false, false, false);
        assertFalse(a.equals(b));
    }

    @Test
    public void equals_differentIsBlock_false() throws Exception {
        Tag a = buildTag("base", true, true, true, true, false, false, false);
        Tag b = buildTag("base", false, true, true, true, false, false, false);
        assertFalse(a.equals(b));
    }

    @Test
    public void equals_differentPreserveWhitespace_false() throws Exception {
        Tag a = buildTag("base", true, true, true, true, false, false, false);
        Tag b = buildTag("base", true, true, true, true, false, false, true);
        assertFalse(a.equals(b));
    }

    @Test
    public void equals_differentSelfClosing_false() throws Exception {
        Tag a = buildTag("base", true, true, true, true, false, false, false);
        Tag b = buildTag("base", true, true, true, true, false, true, false);
        assertFalse(a.equals(b));
    }

    @Test
    public void equals_differentTagName_false() throws Exception {
        Tag a = buildTag("base1", true, true, true, true, false, false, false);
        Tag b = buildTag("base2", true, true, true, true, false, false, false);
        assertFalse(a.equals(b));
    }

    // ---------- hashCode() ----------

    @Test
    public void hashCode_equalObjectsHaveEqualHashCode() throws Exception {
        Tag a = buildTag("base", true, true, true, true, false, false, false);
        Tag b = buildTag("base", true, true, true, true, false, false, false);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void hashCode_consistentAcrossCalls() {
        Tag t = Tag.valueOf("div");
        assertEquals(t.hashCode(), t.hashCode());
    }

    // ---------- toString() ----------

    @Test
    public void toString_returnsTagName() {
        assertEquals("div", Tag.valueOf("div").toString());
    }

    @Test
    public void toString_forUnknownTag_returnsNormalizedName() {
        assertEquals("weirdtag", Tag.valueOf("  WeirdTag  ").toString());
    }
}

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TagTest {

    // --- Tests for valueOf(String, ParseSettings) & valueOf(String) ---

    @Test(expected = IllegalArgumentException.class)
    public void testValueOfNullTagName() {
        Tag.valueOf(null);
    }

    @Test
    public void testValueOfKnownTagPredefined() {
        // ดึงแท็กที่มีอยู่แล้วใน Map (เช่น "p") -> tag != null ตั้งแต่แรก
        Tag p1 = Tag.valueOf("p");
        Tag p2 = Tag.valueOf("P", ParseSettings.preserveCase);
        assertNotNull(p1);
        assertEquals("p", p1.getName());
        // Pre-defined tags จะต้องอ้างอิงถึงออบเจ็กต์เดียวกัน (==)
        assertSame(p1, p2);
        assertTrue(p1.isKnownTag());
    }

    @Test
    public void testValueOfUnknownTagPreserveCase() {
        // แท็กที่ไม่รู้จักและรักษากลุ่มตัวอักษรเดิม
        String customName = "CustomTag";
        Tag tag = Tag.valueOf(customName, ParseSettings.preserveCase);
        assertNotNull(tag);
        assertEquals(customName, tag.getName());
        assertFalse(tag.isKnownTag());
        assertFalse(tag.isBlock()); // Unknown tag ถูกเซ็ต isBlock = false
    }

    @Test
    public void testValueOfUnknownTagNormalizeCase() {
        // แท็กที่ไม่รู้จักแต่ต้อง normalize เป็น lowercase
        Tag tag = Tag.valueOf("MY-CUSTOM-TAG", ParseSettings.htmlDefault);
        assertNotNull(tag);
        assertEquals("my-custom-tag", tag.getName());
        assertFalse(tag.isKnownTag());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOfEmptyTagNameAfterNormalize() {
        // กรณี normalize แล้วได้ค่าว่างเปล่า จะต้องโยน Exception ออกมา
        Tag.valueOf("   ", ParseSettings.htmlDefault);
    }

    // --- Tests for Tag Attributes and States (Edge Cases & Coverage) ---

    @Test
    public void testBlockAndInlineTags() {
        Tag div = Tag.valueOf("div");
        assertTrue(div.isBlock());
        assertTrue(div.formatAsBlock());
        assertTrue(div.canContainBlock());
        assertFalse(div.isInline());

        Tag span = Tag.valueOf("span");
        assertFalse(span.isBlock());
        assertFalse(span.formatAsBlock());
        assertFalse(span.canContainBlock());
        assertTrue(span.isInline());
    }

    @Test
    public void testEmptyAndSelfClosingTags() {
        Tag img = Tag.valueOf("img");
        assertTrue(img.isEmpty());
        assertTrue(img.isSelfClosing());
        assertFalse(img.isData());

        Tag custom = Tag.valueOf("my-tag");
        assertFalse(custom.isEmpty());
        assertFalse(custom.isSelfClosing());
        
        // ทดสอบเซ็ต selfClosing เพิ่มเติม
        custom.setSelfClosing();
        assertTrue(custom.isSelfClosing());
    }

    @Test
    public void testDataTags() {
        // script หรือ style มักจะทดสอบพฤติกรรมข้อมูล
        Tag script = Tag.valueOf("script");
        assertTrue(script.isBlock());
    }

    @Test
    public void testPreserveWhitespaceTags() {
        Tag pre = Tag.valueOf("pre");
        assertTrue(pre.preserveWhitespace());

        Tag div = Tag.valueOf("div");
        assertFalse(div.preserveWhitespace());
    }

    @Test
    public void testFormListedAndSubmittable() {
        Tag input = Tag.valueOf("input");
        assertTrue(input.isFormListed());
        assertTrue(input.isFormSubmittable());

        Tag div = Tag.valueOf("div");
        assertFalse(div.isFormListed());
        assertFalse(div.isFormSubmittable());
    }

    @Test
    public void testIsKnownTagStatic() {
        assertTrue(Tag.isKnownTag("div"));
        assertFalse(Tag.isKnownTag("non-existent-tag-12345"));
        assertFalse(Tag.isKnownTag(null));
    }

    // --- Tests for equals, hashCode, and toString ---

    @Test
    public void testEqualsAndHashCode() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("div");
        Tag tag3 = Tag.valueOf("span");

        // Reflexive
        assertEquals(tag1, tag1);
        assertEquals(tag1.hashCode(), tag1.hashCode());

        // Symmetric
        assertEquals(tag1, tag2);
        assertEquals(tag1.hashCode(), tag2.hashCode());

        // Different tags
        assertNotEquals(tag1, tag3);
        assertNotEquals(tag1, null);
        assertNotEquals(tag1, "String Object");

        // Unknown tags equality
        Tag custom1 = Tag.valueOf("custom", ParseSettings.preserveCase);
        Tag custom2 = Tag.valueOf("custom", ParseSettings.preserveCase);
        assertEquals(custom1, custom2);
        assertEquals(custom1.hashCode(), custom2.hashCode());
    }

    @Test
    public void testToString() {
        Tag tag = Tag.valueOf("div");
        assertEquals("div", tag.toString());
    }
}
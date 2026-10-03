package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TagTest {

    @Test(expected = IllegalArgumentException.class)
    public void testValueOfNull() {
        Tag.valueOf(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOfEmpty() {
        Tag.valueOf("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOfBlank() {
        Tag.valueOf("   ");
    }

    @Test
    public void testValueOfKnownTagLowercase() {
        Tag p1 = Tag.valueOf("p");
        Tag p2 = Tag.valueOf("p");
        assertNotNull(p1);
        assertEquals("p", p1.getName());
        assertSame("Predefined tags should be singleton instances", p1, p2);
        assertTrue(p1.isKnownTag());
        assertTrue(Tag.isKnownTag("p"));
    }

    @Test
    public void testValueOfKnownTagMixedCaseAndPadding() {
        Tag div = Tag.valueOf("  DiV  ");
        assertNotNull(div);
        assertEquals("div", div.getName());
        assertTrue(div.isKnownTag());
        assertTrue(div.isBlock());
        assertTrue(div.formatAsBlock());
    }

    @Test
    public void testValueOfUnknownTag() {
        Tag custom1 = Tag.valueOf("mycustomtag");
        Tag custom2 = Tag.valueOf("MYCUSTOMTAG");
        
        assertNotNull(custom1);
        assertEquals("mycustomtag", custom1.getName());
        assertFalse("Unknown tag should not be a known tag", custom1.isKnownTag());
        assertFalse(Tag.isKnownTag("mycustomtag"));
        
        // Unknown tags are not registered, so they are equal by properties/name but not reference (or are they new instances?)
        // Let's check equals and characteristics of unknown tags (isBlock=false, canContainBlock=true)
        assertFalse(custom1.isBlock());
        assertTrue(custom1.canContainBlock());
        assertTrue(custom1.isInline());
        assertEquals(custom1, custom2);
    }

    @Test
    public void testInlineTagCharacteristics() {
        Tag span = Tag.valueOf("span");
        assertFalse(span.isBlock());
        assertTrue(span.isInline());
        assertFalse(span.canContainBlock());
    }

    @Test
    public void testEmptyAndSelfClosingTags() {
        Tag img = Tag.valueOf("img");
        assertTrue(img.isEmpty());
        assertTrue(img.isSelfClosing());
        assertFalse(img.canContainBlock());
        assertFalse(img.canContainInline());
        
        Tag unknown = Tag.valueOf("unknown-self-close");
        assertFalse(unknown.isEmpty());
        assertFalse(unknown.isSelfClosing());
        
        unknown.setSelfClosing();
        assertTrue(unknown.isSelfClosing());
    }

    @Test
    public void testIsData() {
        // isData = !canContainInline && !isEmpty()
        // img is empty -> isData should be false
        Tag img = Tag.valueOf("img");
        assertFalse(img.isData());

        // Let's find or verify a tag where canContainInline is false and empty is false, or test via custom/known logic
        Tag script = Tag.valueOf("script");
        // script is block, formatAsBlock=false, preserveWhitespace=true
        // Check script isData status or similar tags
        assertNotNull(script);
    }

    @Test
    public void testPreserveWhitespace() {
        Tag pre = Tag.valueOf("pre");
        assertTrue(pre.preserveWhitespace());

        Tag div = Tag.valueOf("div");
        assertFalse(div.preserveWhitespace());
    }

    @Test
    public void testEqualsAndHashCode() {
        Tag p1 = Tag.valueOf("p");
        Tag p2 = Tag.valueOf("p");
        Tag div = Tag.valueOf("div");

        assertTrue(p1.equals(p1)); // self
        assertTrue(p1.equals(p2)); // equivalent known
        assertFalse(p1.equals(div)); // different tag
        assertFalse(p1.equals(null)); // null check
        assertFalse(p1.equals("some string")); // different class check

        assertEquals(p1.hashCode(), p2.hashCode());
        assertNotEquals(p1.hashCode(), div.hashCode());

        Tag unknown1 = Tag.valueOf("foo");
        Tag unknown2 = Tag.valueOf("foo");
        assertEquals(unknown1, unknown2);
        assertEquals(unknown1.hashCode(), unknown2.hashCode());
    }

    @Test
    public void testToString() {
        Tag tag = Tag.valueOf("h1");
        assertEquals("h1", tag.toString());
    }
}
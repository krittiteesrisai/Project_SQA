package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TagTest {

    // --- Tests for valueOf & basic properties ---

    @Test
    public void testValueOfValidPredefinedTag() {
        Tag div = Tag.valueOf("DIV");
        assertNotNull(div);
        assertEquals("div", div.getName());
        assertTrue(div.isBlock());
        assertTrue(div.isInline() == false);
    }

    @Test
    public void testValueOfCaseInsensitiveAndTrim() {
        Tag pTag = Tag.valueOf("  P ");
        assertNotNull(pTag);
        assertEquals("p", pTag.getName());
    }

    @Test
    public void testValueOfUnknownTagCreatesGeneric() {
        Tag unknown = Tag.valueOf("custom-tag");
        assertNotNull(unknown);
        assertEquals("custom-tag", unknown.getName());
        assertFalse(unknown.isBlock());
        assertTrue(unknown.canContainBlock());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOfNullThrowsException() {
        Tag.valueOf(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOfEmptyStringThrowsException() {
        Tag.valueOf("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOfBlankStringThrowsException() {
        Tag.valueOf("   ");
    }

    // --- Tests for canContain ---

    @Test(expected = IllegalArgumentException.class)
    public void testCanContainNullChild() {
        Tag div = Tag.valueOf("div");
        div.canContain(null);
    }

    @Test
    public void testBlockTagCannotContainBlockWhenRestricted() {
        // <p> is a block tag with canContainBlock = false (canContainInlineOnly)
        Tag p = Tag.valueOf("p");
        Tag div = Tag.valueOf("div"); // block tag
        assertFalse(p.canContain(div));
    }

    @Test
    public void testInlineTagCannotContainInlineWhenRestricted() {
        // <img> is an empty tag (canContainInline = false)
        Tag img = Tag.valueOf("img");
        Tag span = Tag.valueOf("span"); // inline tag
        assertFalse(img.canContain(span));
    }

    @Test
    public void testOptionalClosingSelfContainment() {
        // <a> has optionalClosing = true
        Tag a1 = Tag.valueOf("a");
        Tag a2 = Tag.valueOf("a");
        assertFalse(a1.canContain(a2));
    }

    @Test
    public void testEmptyOrDataTagCannotContainChildren() {
        Tag img = Tag.valueOf("img"); // empty tag
        Tag span = Tag.valueOf("span");
        assertFalse(img.canContain(span));

        Tag script = Tag.valueOf("script"); // data only tag
        assertFalse(script.canContain(span));
    }

    @Test
    public void testHeadTagAllowedAndDisallowedChildren() {
        Tag head = Tag.valueOf("head");
        Tag title = Tag.valueOf("title");
        Tag div = Tag.valueOf("div");

        assertTrue(head.canContain(title));
        assertFalse(head.canContain(div));
    }

    @Test
    public void testDtDdMutualExclusion() {
        Tag dt = Tag.valueOf("dt");
        Tag dd = Tag.valueOf("dd");

        assertFalse(dt.canContain(dd));
        assertFalse(dd.canContain(dt));
    }

    @Test
    public void testDefaultCanContainTrue() {
        Tag div = Tag.valueOf("div");
        Tag span = Tag.valueOf("span");
        assertTrue(div.canContain(span));
    }

    // --- Tests for Getters, Implicit Parent & Valid Parent ---

    @Test
    public void testGetImplicitParent() {
        Tag li = Tag.valueOf("li");
        assertNotNull(li.getImplicitParent());
        assertEquals("ul", li.getImplicitParent().getName());

        Tag html = Tag.valueOf("html");
        // html has empty ancestors list based on implementation
        // Let's verify via a tag with empty ancestors if possible, or test gracefully
        Tag custom = Tag.valueOf("unknown-custom");
        // custom gets defaultAncestor ("body") set in valueOf
        assertNotNull(custom.getImplicitParent());
    }

    @Test
    public void testIsValidParent() {
        Tag li = Tag.valueOf("li"); // ancestors: ul, ol
        Tag ul = Tag.valueOf("ul");
        Tag div = Tag.valueOf("div");

        assertTrue(li.isValidParent(ul));
        assertFalse(li.isValidParent(div));

        Tag html = Tag.valueOf("html");
        // If ancestors is empty
        assertTrue(ul.isValidParent(html)); // HTML has empty ancestors in its creation definition
    }

    // --- Tests for Equals and HashCode ---

    @Test
    public void testEqualsAndHashCodeEdgeCases() {
        Tag div1 = Tag.valueOf("div");
        Tag div2 = Tag.valueOf("div");
        Tag span = Tag.valueOf("span");
        Tag custom1 = Tag.valueOf("custom-a");
        Tag custom2 = Tag.valueOf("custom-b");

        assertTrue(div1.equals(div1)); // self
        assertTrue(div1.equals(div2)); // identical predefined
        assertFalse(div1.equals(span)); // different tags
        assertFalse(div1.equals(null)); // null comparison
        assertFalse(div1.equals("Some String")); // different class

        assertEquals(div1.hashCode(), div2.hashCode());
        assertNotEquals(div1.hashCode(), custom1.hashCode());
        
        // Test custom tags equality branch where tagName might differ or match
        assertFalse(custom1.equals(custom2));
    }

    @Test
    public void testToString() {
        Tag div = Tag.valueOf("div");
        assertEquals("div", div.toString());
    }
    
    @Test
    public void testIsDataAndWhitespace() {
        Tag script = Tag.valueOf("script");
        assertTrue(script.isData());
        assertTrue(script.preserveWhitespace());

        Tag div = Tag.valueOf("div");
        assertFalse(div.isData());
    }
}
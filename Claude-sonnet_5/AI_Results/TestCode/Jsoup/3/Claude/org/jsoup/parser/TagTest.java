package org.jsoup.parser;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

/**
 * JUnit 4 test suite for org.jsoup.parser.Tag (Defects4J: Jsoup-3b)
 * Placed in the same package (org.jsoup.parser) to access package-private
 * methods: canContain, getImplicitParent, isValidParent.
 */
public class TagTest {

    // ---------------------------------------------------------------
    // valueOf(String) tests
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void valueOf_nullThrows() {
        Tag.valueOf(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void valueOf_emptyThrows() {
        Tag.valueOf("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void valueOf_whitespaceOnlyThrows() {
        // trims to empty -> Validate.notEmpty throws
        Tag.valueOf("    ");
    }

    @Test
    public void valueOf_trimsAndLowercases() {
        Tag tag = Tag.valueOf("  DIV  ");
        assertEquals("div", tag.getName());
    }

    @Test
    public void valueOf_knownTagsAreCachedSameInstance() {
        Tag t1 = Tag.valueOf("p");
        Tag t2 = Tag.valueOf("P"); // case-insensitive, should hit same cached entry
        assertSame(t1, t2);
    }

    @Test
    public void valueOf_unknownTagCreatesGenericNotCachedButEqual() {
        Tag u1 = Tag.valueOf("customtag");
        Tag u2 = Tag.valueOf("customtag");
        // Not registered into the static map -> different instances each call
        assertNotSame(u1, u2);
        // But logically equal via equals()
        assertEquals(u1, u2);
        // Generic tag characteristics set in valueOf's null-branch
        assertFalse(u1.isBlock());
        assertTrue(u1.canContainBlock());
    }

    // ---------------------------------------------------------------
    // canContain(Tag) tests - branch by branch
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void canContain_nullChildThrows() {
        Tag div = Tag.valueOf("div");
        div.canContain(null);
    }

    @Test
    public void canContain_branch1_childBlock_parentCannotContainBlock() {
        // pre: canContainBlock=false (setContainInlineOnly), child div is block
        Tag pre = Tag.valueOf("pre");
        Tag div = Tag.valueOf("div");
        assertFalse(pre.canContain(div));
    }

    @Test
    public void canContain_branch2_childInline_parentCannotContainInline() {
        // script: canContainInline=false (setContainDataOnly), child span is inline
        // child.isBlock is false here so branch1 is false, isolating branch2
        Tag script = Tag.valueOf("script");
        Tag span = Tag.valueOf("span");
        assertFalse(script.canContain(span));
    }

    @Test
    public void canContain_branch3_optionalClosing_andEqualsChild() {
        // a: optionalClosing=true, a.equals(a) -> true -> cannot contain itself
        Tag a1 = Tag.valueOf("a");
        Tag a2 = Tag.valueOf("a");
        assertFalse(a1.canContain(a2));
    }

    @Test
    public void canContain_branch4_emptyTrue_viaReflection() {
        // Unknown tag from valueOf has canContainBlock=true, canContainInline=true,
        // empty=false by default. We force empty=true to hit the "this.empty" disjunct
        // of branch4 directly (this specific field combo is not reachable via the
        // public tag-definition API because setEmpty() always disables both
        // canContainBlock and canContainInline together, which would trip
        // branch1/branch2 first). Using reflection purely for white-box branch coverage.
        Tag custom = Tag.valueOf("emptybranchtag");
        setBooleanField(custom, "empty", true);

        Tag child = Tag.valueOf("p");
        assertFalse(custom.canContain(child));
    }

    @Test
    public void canContain_branch4_isDataTrue_viaReflection() {
        // Force canContainInline=false while keeping canContainBlock=true and empty=false,
        // so isData() == true becomes the deciding disjunct of branch4, while branch1/2
        // are avoided by using a block child (child.isBlock=true keeps branch2's
        // first operand false; canContainBlock stays true keeps branch1 false).
        Tag custom = Tag.valueOf("databranchtag");
        setBooleanField(custom, "canContainInline", false);

        Tag child = Tag.valueOf("div"); // block child
        assertFalse(custom.canContain(child));
    }

    @Test
    public void canContain_headSpecial_allowedChildReturnsTrue() {
        Tag head = Tag.valueOf("head");
        Tag script = Tag.valueOf("script");
        assertTrue(head.canContain(script));
    }

    @Test
    public void canContain_headSpecial_disallowedChildReturnsFalse() {
        Tag head = Tag.valueOf("head");
        Tag div = Tag.valueOf("div");
        assertFalse(head.canContain(div));
    }

    @Test
    public void canContain_dtCannotContainDd() {
        Tag dt = Tag.valueOf("dt");
        Tag dd = Tag.valueOf("dd");
        assertFalse(dt.canContain(dd));
    }

    @Test
    public void canContain_ddCannotContainDt() {
        Tag dd = Tag.valueOf("dd");
        Tag dt = Tag.valueOf("dt");
        assertFalse(dd.canContain(dt));
    }

    @Test
    public void canContain_fallbackTrue() {
        // All guarding branches are false -> falls through to final "return true"
        Tag div = Tag.valueOf("div");
        Tag p = Tag.valueOf("p");
        assertTrue(div.canContain(p));
    }

    // ---------------------------------------------------------------
    // Simple boolean accessor tests
    // ---------------------------------------------------------------

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
        Tag div = Tag.valueOf("div");
        Tag span = Tag.valueOf("span");
        assertFalse(div.isInline());
        assertTrue(span.isInline());
    }

    @Test
    public void canContainBlock_trueAndFalseCases() {
        assertTrue(Tag.valueOf("div").canContainBlock());
        assertFalse(Tag.valueOf("pre").canContainBlock());
    }

    @Test
    public void isData_trueForDataOnlyTag() {
        assertTrue(Tag.valueOf("script").isData());
    }

    @Test
    public void isData_falseForNormalBlockTag() {
        assertFalse(Tag.valueOf("div").isData());
    }

    @Test
    public void isData_falseWhenEmptyEvenIfCanContainInlineFalse() {
        // img: canContainInline=false AND empty=true -> isData must be false
        // because isData = !canContainInline && !isEmpty
        Tag img = Tag.valueOf("img");
        assertTrue(img.isEmpty());
        assertFalse(img.isData());
    }

    @Test
    public void isEmpty_trueAndFalseCases() {
        assertTrue(Tag.valueOf("img").isEmpty());
        assertFalse(Tag.valueOf("div").isEmpty());
    }

    @Test
    public void preserveWhitespace_trueAndFalseCases() {
        assertTrue(Tag.valueOf("pre").preserveWhitespace());
        assertFalse(Tag.valueOf("div").preserveWhitespace());
    }

    // ---------------------------------------------------------------
    // getImplicitParent() tests
    // ---------------------------------------------------------------

    @Test
    public void getImplicitParent_returnsFirstAncestorWhenPresent() {
        Tag li = Tag.valueOf("li"); // ancestors = [ul, ol]
        Tag parent = li.getImplicitParent();
        assertNotNull(parent);
        assertEquals("ul", parent.getName());
    }

    @Test
    public void getImplicitParent_returnsNullWhenAncestorsEmpty() {
        Tag html = Tag.valueOf("html"); // setAncestor(new String[0]) -> empty list
        assertNull(html.getImplicitParent());
    }

    // ---------------------------------------------------------------
    // isValidParent(Tag) tests
    // ---------------------------------------------------------------

    @Test
    public void isValidParent_trueWhenChildAncestorsEmpty() {
        Tag any = Tag.valueOf("div");
        Tag html = Tag.valueOf("html"); // ancestors empty -> always valid parent
        assertTrue(any.isValidParent(html));
    }

    @Test
    public void isValidParent_trueWhenThisMatchesAncestor() {
        Tag ul = Tag.valueOf("ul");
        Tag li = Tag.valueOf("li"); // ancestors = [ul, ol]
        assertTrue(ul.isValidParent(li));
    }

    @Test
    public void isValidParent_falseWhenNoAncestorMatches() {
        Tag div = Tag.valueOf("div");
        Tag li = Tag.valueOf("li"); // ancestors = [ul, ol]
        assertFalse(div.isValidParent(li));
    }

    // ---------------------------------------------------------------
    // equals() / hashCode() / toString() / getName() tests
    // ---------------------------------------------------------------

    @Test
    public void equals_sameInstanceTrue() {
        Tag div = Tag.valueOf("div");
        assertTrue(div.equals(div));
    }

    @Test
    public void equals_nullFalse() {
        Tag div = Tag.valueOf("div");
        assertFalse(div.equals(null));
    }

    @Test
    public void equals_differentClassFalse() {
        Tag div = Tag.valueOf("div");
        assertFalse(div.equals("div"));
    }

    @Test
    public void equals_differentTagNameFalse() {
        Tag div = Tag.valueOf("div");
        Tag span = Tag.valueOf("span");
        assertFalse(div.equals(span));
    }

    @Test
    public void equals_sameFieldsTrueForUnknownTagInstances() {
        Tag u1 = Tag.valueOf("sometag");
        Tag u2 = Tag.valueOf("sometag");
        assertNotSame(u1, u2);
        assertTrue(u1.equals(u2));
    }

    @Test
    public void hashCode_consistentForEqualObjects() {
        Tag u1 = Tag.valueOf("anothertag");
        Tag u2 = Tag.valueOf("anothertag");
        assertEquals(u1, u2);
        assertEquals(u1.hashCode(), u2.hashCode());
    }

    @Test
    public void toString_returnsTagName() {
        Tag div = Tag.valueOf("DIV");
        assertEquals("div", div.toString());
    }

    @Test
    public void getName_returnsLowercaseTagName() {
        Tag span = Tag.valueOf("SpAn");
        assertEquals("span", span.getName());
    }

    // ---------------------------------------------------------------
    // reflection helper (white-box testing utility only)
    // ---------------------------------------------------------------

    private static void setBooleanField(Tag tag, String fieldName, boolean value) {
        try {
            Field f = Tag.class.getDeclaredField(fieldName);
            f.setAccessible(true);
            f.setBoolean(tag, value);
        } catch (Exception e) {
            throw new RuntimeException("Reflection failed for field " + fieldName, e);
        }
    }
}

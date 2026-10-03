package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class WhitelistTest {

    @Test
    public void testFactoryDefaults() {
        assertNotNull(Whitelist.none());
        assertNotNull(Whitelist.simpleText());
        assertNotNull(Whitelist.basic());
        assertNotNull(Whitelist.basicWithImages());
        assertNotNull(Whitelist.relaxed());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddTagsNullValidation() {
        Whitelist w = new Whitelist();
        w.addTags((String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddTagsEmptyStringValidation() {
        Whitelist w = new Whitelist();
        w.addTags("");
    }

    @Test
    public void testAddAttributesBranchingAndMerging() {
        Whitelist w = new Whitelist();
        // First addition (creates new entry in attributes map)
        w.addAttributes("p", "class");
        // Second addition to same tag (merges into existing Set)
        w.addAttributes("p", "id", "class"); // duplicate 'class' tests set uniqueness
        
        Element el = new Element(Tag.valueOf("p"), "");
        assertTrue(w.isSafeAttribute("p", el, new Attribute("class", "foo")));
        assertTrue(w.isSafeAttribute("p", el, new Attribute("id", "bar")));
        assertFalse(w.isSafeAttribute("p", el, new Attribute("style", "color:red;")));
    }

    @Test
    public void testAddEnforcedAttributeBranching() {
        Whitelist w = new Whitelist();
        // First time adding for tag
        w.addEnforcedAttribute("a", "rel", "nofollow");
        // Second time adding another enforced attribute for the same tag (hits existing map branch)
        w.addEnforcedAttribute("a", "target", "_blank");

        Attributes attrs = w.getEnforcedAttributes("a");
        assertEquals("nofollow", attrs.get("rel"));
        assertEquals("_blank", attrs.get("target"));

        // Test non-existent tag enforced attributes
        Attributes emptyAttrs = w.getEnforcedAttributes("div");
        assertTrue(emptyAttrs.asList().isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddEnforcedAttributeValidation() {
        Whitelist w = new Whitelist();
        w.addEnforcedAttribute("", "rel", "nofollow");
    }

    @Test
    public void testAddProtocolsComplexBranching() {
        Whitelist w = new Whitelist();
        // Adds tag, attribute, and multiple protocols (testing nested maps initialization)
        w.addProtocols("a", "href", "http", "https");
        // Add protocol to an existing tag but new attribute
        w.addProtocols("a", "cite", "http");
        // Add protocol to an existing tag and existing attribute (merging protocol set)
        w.addProtocols("a", "href", "ftp");

        Element el = new Element(Tag.valueOf("a"), "http://example.com");
        assertTrue(w.isSafeAttribute("a", el, new Attribute("href", "https://jsoup.org")));
        assertTrue(w.isSafeAttribute("a", el, new Attribute("href", "ftp://ftp.jsoup.org")));
        assertFalse(w.isSafeAttribute("a", el, new Attribute("href", "javascript:alert(1)")));
    }

    @Test
    public void testIsSafeAttributeWithAllPseudoTag() {
        Whitelist w = new Whitelist();
        w.addAttributes(":all", "class", "style");

        Element el = new Element(Tag.valueOf("div"), "");
        // Should fallback to ":all" since "div" has no explicit attributes defined
        assertTrue(w.isSafeAttribute("div", el, new Attribute("class", "container")));
        assertTrue(w.isSafeAttribute("div", el, new Attribute("style", "margin:0;")));
        assertFalse(w.isSafeAttribute("div", el, new Attribute("id", "main")));
    }

    @Test
    public void testIsSafeAttributeNoProtocolsDefined() {
        Whitelist w = new Whitelist();
        w.addAttributes("span", "title");
        // Attribute allowed, but no protocols defined -> should return true directly without protocol validation
        Element el = new Element(Tag.valueOf("span"), "");
        assertTrue(w.isSafeAttribute("span", el, new Attribute("title", "hello")));
    }

    @Test
    public void testPreserveRelativeLinksConfig() {
        Whitelist w = Whitelist.basic(); // allows 'a' href with http, https, ftp, mailto
        w.preserveRelativeLinks(true);

        Element el = new Element(Tag.valueOf("a"), "http://example.com/");
        Attribute attr = new Attribute("href", "sub/page.html");
        
        // With preserveRelativeLinks = true, relative link should pass if resolvable
        assertTrue(w.isSafeAttribute("a", el, attr));
    }

    @Test
    public void testTestValidProtocolWithAbsoluteAndRelative() {
        Whitelist w = Whitelist.basic();
        // preserveRelativeLinks = false (default)
        Element el = new Element(Tag.valueOf("a"), "http://example.com/");
        Attribute attr = new Attribute("href", "relative-path");

        // Should resolve to absolute URL (http://example.com/relative-path) and match 'http' protocol
        assertTrue(w.isSafeAttribute("a", el, attr));
        assertEquals("http://example.com/relative-path", attr.getValue());
    }

    @Test
    public void testIsSafeTagEdgeCases() {
        Whitelist w = Whitelist.simpleText();
        assertTrue(w.isSafeTag("b"));
        assertFalse(w.isSafeTag("script"));
    }

    @Test
    public void testTypedValueEqualsAndHashCodeEdges() {
        Whitelist.TagName t1 = Whitelist.TagName.valueOf("p");
        Whitelist.TagName t2 = Whitelist.TagName.valueOf("p");
        Whitelist.TagName t3 = Whitelist.TagName.valueOf("div");

        assertEquals(t1, t2);
        assertEquals(t1.hashCode(), t2.hashCode());
        assertNotEquals(t1, t3);
        assertNotEquals(t1, null);
        assertNotEquals(t1, "p"); // Different class check
        assertEquals("p", t1.toString());
    }
}
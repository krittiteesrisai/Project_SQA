package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParseSettingsTest {

    @Test
    public void testHtmlDefaultConstants() {
        assertTrue(ParseSettings.htmlDefault != null);
        assertFalse(ParseSettings.htmlDefault.preserveTagCase());
    }

    @Test
    public void testPreserveCaseConstants() {
        assertTrue(ParseSettings.preserveCase != null);
        assertTrue(ParseSettings.preserveCase.preserveTagCase());
    }

    @Test
    public void testNormalizeTag_preserveTagCaseTrue() {
        ParseSettings settings = new ParseSettings(true, false);
        String input = "  DivTag  ";
        String result = settings.normalizeTag(input);
        assertEquals("DivTag", result);
    }

    @Test
    public void testNormalizeTag_preserveTagCaseFalse() {
        ParseSettings settings = new ParseSettings(false, false);
        String input = "  DivTag  ";
        String result = settings.normalizeTag(input);
        assertEquals("divtag", result);
    }

    @Test
    public void testNormalizeTag_emptyAndWhitespace() {
        ParseSettings settings = new ParseSettings(false, false);
        assertEquals("", settings.normalizeTag("   "));
        assertEquals("", settings.normalizeTag(""));
    }

    @Test
    public void testNormalizeAttribute_preserveAttributeCaseTrue() {
        ParseSettings settings = new ParseSettings(false, true);
        String input = "  AttrKey  ";
        String result = settings.normalizeAttribute(input);
        assertEquals("AttrKey", result);
    }

    @Test
    public void testNormalizeAttribute_preserveAttributeCaseFalse() {
        ParseSettings settings = new ParseSettings(false, false);
        String input = "  AttrKey  ";
        String result = settings.normalizeAttribute(input);
        assertEquals("attrkey", result);
    }

    @Test
    public void testNormalizeAttribute_emptyAndWhitespace() {
        ParseSettings settings = new ParseSettings(true, true);
        assertEquals("", settings.normalizeAttribute("   "));
        assertEquals("", settings.normalizeAttribute(""));
    }

    @Test
    public void testNormalizeAttributes_preserveCaseFalse() {
        ParseSettings settings = new ParseSettings(false, false);
        Attributes attributes = new Attributes();
        attributes.put("TEST-ATTR", "Value");

        Attributes result = settings.normalizeAttributes(attributes);
        assertNotNull(result);
        // เมื่อ preserveAttributeCase เป็น false จะต้องเรียก attributes.normalize()
        assertTrue(attributes.hasKey("test-attr"));
    }

    @Test
    public void testNormalizeAttributes_preserveCaseTrue() {
        ParseSettings settings = new ParseSettings(false, true);
        Attributes attributes = new Attributes();
        attributes.put("TEST-ATTR", "Value");

        Attributes result = settings.normalizeAttributes(attributes);
        assertNotNull(result);
        // เมื่อ preserveAttributeCase เป็น true จะไม่แปลงเป็น lowercase
        assertTrue(attributes.hasKey("TEST-ATTR"));
        assertFalse(attributes.hasKey("test-attr"));
    }
}
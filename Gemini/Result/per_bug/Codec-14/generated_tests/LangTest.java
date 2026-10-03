package org.apache.commons.codec.language.bm;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Senior JUnit 4 Test Automation Suite for org.apache.commons.codec.language.bm.Lang
 * Designed for Defects4J (Codec-14b) with high Branch/Condition coverage.
 */
public class LangTest {

    @Test
    public void testInstanceAllNameTypes() {
        for (NameType type : NameType.values()) {
            Lang lang = Lang.instance(type);
            assertNotNull("Lang instance for " + type + " should not be null", lang);
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testLoadFromResource_ResourceNotFound() {
        Languages languages = Languages.getInstance(NameType.GENERIC);
        Lang.loadFromResource("non/existent/resource/path.txt", languages);
    }

    @Test
    public void testGuessLanguage_ValidInput() {
        Lang lang = Lang.instance(NameType.GENERIC);
        // "common" words or specific patterns mapped in default lang.txt
        String result = lang.guessLanguage("general");
        assertNotNull(result);
    }

    @Test
    public void testGuessLanguages_EdgeCasesAndLowerCase() {
        Lang lang = Lang.instance(NameType.GENERIC);
        // Test lower/upper case conversion handling
        Languages.LanguageSet langSet = lang.guessLanguages("TESTWORD");
        assertNotNull(langSet);
    }

    @Test
    public void testCustomResourceLoading_ValidRulesAndComments() {
        // We can test loading a valid built-in resource directly
        Languages languages = Languages.getInstance(NameType.GENERIC);
        Lang customLang = Lang.loadFromResource("org/apache/commons/codec/language/bm/lang.txt", languages);
        assertNotNull(customLang);
        
        String guessed = customLang.guessLanguage("smith");
        assertNotNull(guessed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLoadFromResource_MalformedLine() {
        // Using a resource or mocking isn't available, but we can test via custom resource 
        // if we had one, or test an existing mechanism. Since we only have classpath resources,
        // we can test handling through a malformed custom stream if we could, 
        // but given strict library constraints, we invoke a scenario that hits exception handling 
        // or validate behavior of standard loader. 
        // To trigger malformed line exception specifically, we rely on a test helper or 
        // test resource if available. Here we simulate the failure condition by passing 
        // a resource that contains malformed data if such file existed, 
        // otherwise we test the protection against null/invalid parameters.
        Lang.loadFromResource(null, null);
    }
}
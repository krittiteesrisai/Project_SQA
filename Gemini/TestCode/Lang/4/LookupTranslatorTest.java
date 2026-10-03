package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import java.io.StringWriter;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class LookupTranslatorTest {

    @Test
    public void testConstructorWithNullLookup() {
        // Trigger: lookup == null branch
        LookupTranslator translator = new LookupTranslator((CharSequence[][]) null);
        StringWriter writer = new StringWriter();
        try {
            int consumed = translator.translate("test", 0, writer);
            assertEquals(0, consumed);
            assertEquals("", writer.toString());
        } catch (IOException e) {
            org.junit.Assert.fail("IOException should not be thrown");
        }
    }

    @Test
    public void testConstructorWithEmptyLookup() {
        // Trigger: lookup != null but empty array
        LookupTranslator translator = new LookupTranslator(new CharSequence[0][0]);
        StringWriter writer = new StringWriter();
        try {
            int consumed = translator.translate("test", 0, writer);
            assertEquals(0, consumed);
            assertEquals("", writer.toString());
        } catch (IOException e) {
            org.junit.Assert.fail("IOException should not be thrown");
        }
    }

    @Test
    public void testBasicTranslation() throws IOException {
        // Trigger: Normal match, greedy algorithm check (longest match first)
        CharSequence[][] lookup = {
            {"cat", "dog"},
            {"c", "single"}
        };
        LookupTranslator translator = new LookupTranslator(lookup);
        StringWriter writer = new StringWriter();
        
        int consumed = translator.translate("cat", 0, writer);
        
        assertEquals(3, consumed); // "cat" length is 3, should match "cat" -> "dog" over "c" -> "single"
        assertEquals("dog", writer.toString());
    }

    @Test
    public void testTranslationNoMatch() throws IOException {
        // Trigger: result == null (returns 0)
        CharSequence[][] lookup = {
            {"cat", "dog"}
        };
        LookupTranslator translator = new LookupTranslator(lookup);
        StringWriter writer = new StringWriter();
        
        int consumed = translator.translate("bird", 0, writer);
        
        assertEquals(0, consumed);
        assertEquals("", writer.toString());
    }

    @Test
    public void testIndexPlusLongestExceedsInputLength() throws IOException {
        // Trigger: index + longest > input.length() branch
        CharSequence[][] lookup = {
            {"abcd", "efgh"} // longest = 4
        };
        LookupTranslator translator = new LookupTranslator(lookup);
        StringWriter writer = new StringWriter();
        
        // input length is 2 ("ab"), index = 0. index + longest (0 + 4) > 2
        int consumed = translator.translate("ab", 0, writer);
        
        assertEquals(0, consumed);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslationWithOffsetIndex() throws IOException {
        // Trigger: translating from a non-zero index
        CharSequence[][] lookup = {
            {"is", "was"}
        };
        LookupTranslator translator = new LookupTranslator(lookup);
        StringWriter writer = new StringWriter();
        
        int consumed = translator.translate("this", 2, writer);
        
        assertEquals(2, consumed); // matches "is" at index 2
        assertEquals("was", writer.toString());
    }

    @Test
    public void testShortestAndLongestBoundary() throws IOException {
        // Trigger: loop boundaries (i from max down to shortest)
        CharSequence[][] lookup = {
            {"a", "1"},
            {"abc", "3"}
        };
        LookupTranslator translator = new LookupTranslator(lookup);
        StringWriter writer = new StringWriter();
        
        // "ab" -> max = 2, shortest = 1. Tries "ab" (no match), then "a" (matches "1")
        int consumed = translator.translate("ab", 0, writer);
        
        assertEquals(1, consumed);
        assertEquals("1", writer.toString());
    }
}
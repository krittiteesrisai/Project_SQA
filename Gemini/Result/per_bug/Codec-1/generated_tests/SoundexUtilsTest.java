package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * High-coverage JUnit 4 test suite for SoundexUtils (Defects4J Codec-1b).
 */
public class SoundexUtilsTest {

    // --- Tests for clean(String) ---

    @Test
    public void testClean_Null() {
        assertNull(SoundexUtils.clean(null));
    }

    @Test
    public void testClean_Empty() {
        assertEquals("", SoundexUtils.clean(""));
    }

    @Test
    public void testClean_AllLettersAlreadyUppercase() {
        assertEquals("ABC", SoundexUtils.clean("ABC"));
    }

    @Test
    public void testClean_MixedCaseLetters() {
        assertEquals("ABC", SoundexUtils.clean("aBc"));
    }

    @Test
    public void testClean_WithNonLetters() {
        // Contains digits and symbols which should be filtered out, count != len branch
        assertEquals("AB", SoundexUtils.clean("A1b#"));
    }

    @Test
    public void testClean_OnlyNonLetters() {
        // count == 0, returns empty string
        assertEquals("", SoundexUtils.clean("123!@#"));
    }

    // --- Tests for differenceEncoded(String, String) ---

    @Test
    public void testDifferenceEncoded_BothNull() {
        assertEquals(0, SoundexUtils.differenceEncoded(null, null));
    }

    @Test
    public void testDifferenceEncoded_FirstNull() {
        assertEquals(0, SoundexUtils.differenceEncoded(null, "A123"));
    }

    @Test
    public void testDifferenceEncoded_SecondNull() {
        assertEquals(0, SoundexUtils.differenceEncoded("A123", null));
    }

    @Test
    public void testDifferenceEncoded_IdenticalStrings() {
        assertEquals(4, SoundexUtils.differenceEncoded("A123", "A123"));
    }

    @Test
    public void testDifferenceEncoded_PartialMatch() {
        // 'A' matches 'A', '1' matches '1', '2' != '3', length differs
        assertEquals(2, SoundexUtils.differenceEncoded("A123", "A1345"));
    }

    @Test
    public void testDifferenceEncoded_NoMatch() {
        assertEquals(0, SoundexUtils.differenceEncoded("A123", "B456"));
    }

    @Test
    public void testDifferenceEncoded_DifferentLengths() {
        // Min length is used, es2 is shorter
        assertEquals(1, SoundexUtils.differenceEncoded("ABCD", "A"));
    }

    // --- Tests for difference(StringEncoder, String, String) ---

    @Test
    public void testDifference_SuccessfulEncoding() throws EncoderException {
        // Using a stub implementation of StringEncoder since Mockito is not allowed
        StringEncoder dummyEncoder = new StringEncoder() {
            @Override
            public Object encode(Object source) throws EncoderException {
                return source; // simple pass-through for testing
            }

            @Override
            public String encode(String source) throws EncoderException {
                return source;
            }
        };

        int diff = SoundexUtils.difference(dummyEncoder, "A123", "A134");
        assertEquals(2, diff);
    }

    @Test(expected = EncoderException.class)
    public void testDifference_EncoderException() throws EncoderException {
        StringEncoder faultyEncoder = new StringEncoder() {
            @Override
            public Object encode(Object source) throws EncoderException {
                throw new EncoderException("Encoding failed");
            }

            @Override
            public String encode(String source) throws EncoderException {
                throw new EncoderException("Encoding failed");
            }
        };

        SoundexUtils.difference(faultyEncoder, "Test1", "Test2");
    }
}
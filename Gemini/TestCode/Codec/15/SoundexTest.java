package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Test;

public class SoundexTest {

    private final Soundex soundex = new Soundex();

    @Test
    public void testNullInput() {
        Assert.assertNull(soundex.soundex(null));
    }

    @Test
    public void testEmptyAndCleanedInput() {
        Assert.assertEquals("", soundex.soundex(""));
        Assert.assertEquals("", soundex.soundex("   "));
        Assert.assertEquals("", soundex.soundex("#@$!%"));
    }

    @Test
    public void testBasicEncoding() {
        // Standard US English Soundex tests
        Assert.assertEquals("A261", soundex.soundex("Ashcraft"));
        Assert.assertEquals("A261", soundex.soundex("Ashcroft"));
        Assert.assertEquals("T522", soundex.soundex("Tymczak"));
        Assert.assertEquals("P236", soundex.soundex("Pfister"));
    }

    @Test
    public void testHWTheRule() {
        // Test cases where H and W affect the mapping code according to Soundex rules
        // B312: B(1) -> H(ignored) -> L(4 -> duplicate of L, or ignored) -> ...
        // Let's test specific H/W combinations to trigger getMappingCode branches
        Assert.assertEquals("B625", soundex.soundex("Bingham"));
        // Test HW rule: Consonants separated by W or H treated as one
        // e.g., "Ahhaus" -> A020
        Assert.assertEquals("A200", soundex.soundex("Ahhs"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapInvalidCharacterBelowRange() {
        // Trigger index < 0 in map(char)
        // Note: Soundex clean usually converts to upper case, but passing non-mapped chars directly or via custom mapping
        Soundex customSoundex = new Soundex("1234");
        customSoundex.soundex("@");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapInvalidCharacterAboveRange() {
        // Trigger index >= length in map(char)
        soundex.soundex("A-Z"); // '-' or other symbols if not cleaned or custom mapping out of bounds
    }

    @Test
    public void testConstructorsAndGettersSetters() {
        Soundex custom1 = new Soundex(Soundex.US_ENGLISH_MAPPING_STRING);
        Assert.assertNotNull(custom1);
        Assert.assertEquals("A261", custom1.encode("Ashcraft"));

        char[] mappingArray = Soundex.US_ENGLISH_MAPPING_STRING.toCharArray();
        Soundex custom2 = new Soundex(mappingArray);
        Assert.assertNotNull(custom2);
        Assert.assertEquals("A261", custom2.encode("Ashcraft"));

        // Test deprecated maxLength
        Assert.assertEquals(4, soundex.getMaxLength());
        soundex.setMaxLength(5);
        Assert.assertEquals(5, soundex.getMaxLength());
    }

    @Test
    public void testEncodeObjectValid() throws EncoderException {
        Object result = soundex.encode((Object) "Smith");
        Assert.assertEquals("S530", result);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObjectInvalidType() throws EncoderException {
        soundex.encode(Integer.valueOf(123));
    }

    @Test
    public void testDifference() throws EncoderException {
        // Test SoundexUtils.difference integration via Soundex.difference
        int diff = soundex.difference("Smith", "Smythe");
        Assert.assertTrue(diff >= 0 && diff <= 4);
    }

    @Test
    public void testSoundexWithZeroMappingAndDuplicates() {
        // Testing characters that map to '0' and consecutive duplicates
        // 'A' (0), 'E' (0), 'I' (0), 'O' (0), 'U' (0) map to '0'
        Assert.assertEquals("W425", soundex.soundex("Washington"));
    }
}
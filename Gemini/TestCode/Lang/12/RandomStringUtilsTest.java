package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;
import java.util.Random;
import org.junit.Test;

public class RandomStringUtilsTest {

    @Test
    public void testConstructor() {
        assertNotNull(new RandomStringUtils());
        assertTrue(Modifier.isPublic(RandomStringUtils.class.getModifiers()));
    }

    // --- Boundary & Invalid Length Tests ---

    @Test
    public void testRandomCountZero() {
        assertEquals("", RandomStringUtils.random(0));
        assertEquals("", RandomStringUtils.random(0, true, true));
        assertEquals("", RandomStringUtils.random(0, 0, 10, true, true));
        assertEquals("", RandomStringUtils.random(0, "abc"));
        assertEquals("", RandomStringUtils.random(0, new char[]{'a', 'b'}));
        assertEquals("", RandomStringUtils.random(0, 0, 0, false, false, null, new Random()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomNegativeCountThrowsException() {
        RandomStringUtils.random(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomNegativeCountWithCharsThrowsException() {
        RandomStringUtils.random(-5, new char[]{'a', 'b', 'c'});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomNegativeCountWithCustomRandomThrowsException() {
        RandomStringUtils.random(-1, 0, 0, false, false, null, new Random());
    }

    // --- Helper / Overloaded Method Tests ---

    @Test
    public void testRandomAscii() {
        int length = 50;
        String result = RandomStringUtils.randomAscii(length);
        assertEquals(length, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Char should be ASCII printable [32, 126]", c >= 32 && c <= 126);
        }
    }

    @Test
    public void testRandomAlphabetic() {
        int length = 50;
        String result = RandomStringUtils.randomAlphabetic(length);
        assertEquals(length, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Char should be alphabetic", Character.isLetter(c));
        }
    }

    @Test
    public void testRandomNumeric() {
        int length = 50;
        String result = RandomStringUtils.randomNumeric(length);
        assertEquals(length, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Char should be numeric", Character.isDigit(c));
        }
    }

    @Test
    public void testRandomAlphanumeric() {
        int length = 50;
        String result = RandomStringUtils.randomAlphanumeric(length);
        assertEquals(length, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Char should be letter or digit", Character.isLetterOrDigit(c));
        }
    }

    @Test
    public void testRandomWithLettersAndNumbersBooleans() {
        int length = 30;
        String lettersOnly = RandomStringUtils.random(length, true, false);
        assertEquals(length, lettersOnly.length());
        for (char c : lettersOnly.toCharArray()) {
            assertTrue(Character.isLetter(c));
        }

        String numbersOnly = RandomStringUtils.random(length, false, true);
        assertEquals(length, numbersOnly.length());
        for (char c : numbersOnly.toCharArray()) {
            assertTrue(Character.isDigit(c));
        }

        String anyChars = RandomStringUtils.random(length, false, false);
        assertEquals(length, anyChars.length());
    }

    // --- Custom Character Set and Range Tests ---

    @Test
    public void testRandomWithCustomCharArray() {
        char[] chars = new char[]{'x', 'y', 'z'};
        int length = 20;
        String result = RandomStringUtils.random(length, chars);
        assertEquals(length, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(c == 'x' || c == 'y' || c == 'z');
        }
    }

    @Test
    public void testRandomWithNullCharArray() {
        char[] chars = null;
        String result = RandomStringUtils.random(10, chars);
        assertEquals(10, result.length());
    }

    @Test
    public void testRandomWithCustomStringChars() {
        String allowed = "AEIOUaeiou";
        int length = 25;
        String result = RandomStringUtils.random(length, allowed);
        assertEquals(length, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(allowed.indexOf(c) >= 0);
        }
    }

    @Test
    public void testRandomWithNullStringChars() {
        String allowed = null;
        String result = RandomStringUtils.random(10, allowed);
        assertEquals(10, result.length());
    }

    @Test
    public void testRandomExplicitRange() {
        int length = 20;
        String result = RandomStringUtils.random(length, 'a', 'g' + 1, false, false);
        assertEquals(length, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Char should be between 'a' and 'g'", c >= 'a' && c <= 'g');
        }
    }

    @Test
    public void testRandomSeededDeterminism() {
        long seed = 123456789L;
        String first = RandomStringUtils.random(15, 0, 0, true, true, null, new Random(seed));
        String second = RandomStringUtils.random(15, 0, 0, true, true, null, new Random(seed));
        assertEquals(first, second);
    }

    // --- Surrogate Character Handling Tests ---

    @Test
    public void testRandomWithLowSurrogates() {
        // Range within low surrogates: 56320 (0xDC00) - 57343 (0xDFFF)
        char[] chars = new char[]{(char) 56320, (char) 56400, (char) 57343};
        int length = 4;
        String result = RandomStringUtils.random(length, 0, chars.length, false, false, chars, new Random(42L));
        assertEquals(length, result.length());
    }

    @Test
    public void testRandomWithHighSurrogates() {
        // Range within standard high surrogates: 55296 (0xD800) - 56191 (0xDB7F)
        char[] chars = new char[]{(char) 55296, (char) 55500, (char) 56191};
        int length = 4;
        String result = RandomStringUtils.random(length, 0, chars.length, false, false, chars, new Random(42L));
        assertEquals(length, result.length());
    }

    @Test
    public void testRandomWithPrivateHighSurrogatesAndFallback() {
        // Private high surrogates: 56192 (0xDB80) - 56319 (0xDBFF) are skipped
        // Mixed with a normal character to allow the loop to eventually complete
        char[] chars = new char[]{(char) 56192, (char) 56250, 'A'};
        int length = 5;
        String result = RandomStringUtils.random(length, 0, chars.length, false, false, chars, new Random(42L));
        assertEquals(length, result.length());
        for (char c : result.toCharArray()) {
            assertEquals('A', c);
        }
    }

    @Test
    public void testRandomSurrogateAtCountZeroBoundary() {
        // Testing count == 0 branch when a surrogate is chosen (e.g. length is odd like 1)
        char[] chars = new char[]{(char) 55296, 'B'};
        int length = 1;
        String result = RandomStringUtils.random(length, 0, chars.length, false, false, chars, new Random(1L));
        assertEquals(length, result.length());
    }
}
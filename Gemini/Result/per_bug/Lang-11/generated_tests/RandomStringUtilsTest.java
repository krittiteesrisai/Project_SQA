package org.apache.commons.lang3;

import static org.junit.Assert.*;

import java.util.Random;
import org.junit.Test;

public class RandomStringUtilsTest {

    @Test
    public void testConstructor() {
        assertNotNull(new RandomStringUtils());
    }

    @Test
    public void testCountZero() {
        assertEquals("", RandomStringUtils.random(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCountNegative() {
        RandomStringUtils.random(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCharsEmpty() {
        RandomStringUtils.random(5, 0, 10, false, false, new char[0], new Random());
    }

    @Test
    public void testRandomBasicVariations() {
        // Test standard wrappers
        assertNotNull(RandomStringUtils.randomAscii(5));
        assertNotNull(RandomStringUtils.randomAlphabetic(5));
        assertNotNull(RandomStringUtils.randomAlphanumeric(5));
        assertNotNull(RandomStringUtils.randomNumeric(5));
        assertNotNull(RandomStringUtils.random(5, true, true));
        assertNotNull(RandomStringUtils.random(5, "abc"));
        assertNotNull(RandomStringUtils.random(5, new char[]{'a', 'b', 'c'}));
        assertNotNull(RandomStringUtils.random(5, (String) null));
        assertNotNull(RandomStringUtils.random(5, (char[]) null));
    }

    @Test
    public void testStartEndAutoAssignmentWithChars() {
        // chars != null, start=0, end=0 -> end = chars.length
        String result = RandomStringUtils.random(3, 0, 0, false, false, new char[]{'a', 'b', 'c'}, new Random(1L));
        assertEquals(3, result.length());
    }

    @Test
    public void testStartEndAutoAssignmentAllChars() {
        // chars == null, letters=false, numbers=false -> end = Integer.MAX_VALUE
        String result = RandomStringUtils.random(2, 0, 0, false, false, null, new Random(1L));
        assertEquals(2, result.length());
    }

    @Test
    public void testStartEndAutoAssignmentLettersNumbers() {
        // chars == null, letters=true -> start=' ', end='z'+1
        String result = RandomStringUtils.random(2, 0, 0, true, false, null, new Random(1L));
        assertEquals(2, result.length());
    }

    @Test
    public void testWithProvidedCharsArray() {
        char[] set = new char[]{'x', 'y', 'z'};
        String result = RandomStringUtils.random(4, 0, 3, false, false, set, new Random(1L));
        assertEquals(4, result.length());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testInvalidRangeBounds() {
        // gap calculation will fail if range exceeds chars array
        RandomStringUtils.random(5, 0, 10, false, false, new char[]{'a'}, new Random());
    }

    @Test
    public void testSurrogatePairsAndFiltering() {
        // Use a mock/predictable Random or specific seed to force surrogate branches and filtering logic
        // We supply a custom Random that returns values falling into surrogate ranges or filtering mismatches.
        Random customRandom = new Random() {
            private int callCount = 0;
            @Override
            public int nextInt(int bound) {
                callCount++;
                if (callCount == 1) return 56320; // Low surrogate
                if (callCount == 2) return 55296; // High surrogate
                if (callCount == 3) return 56192; // Private high surrogate
                if (callCount == 4) return 65;    // 'A' (Letter)
                return 0;
            }
        };

        // Test with letters=true, numbers=false, start=0, end=70000
        String result = RandomStringUtils.random(2, 0, 70000, true, false, null, customRandom);
        assertNotNull(result);
    }
    
    @Test
    public void testSurrogateAtCountZero() {
        // Force surrogate when count is exactly 1 (decrements to 0 inside surrogate block)
        Random customRandom = new Random() {
            private int index = 0;
            private int[] values = {56320, 65}; // Low surrogate first when count=1
            @Override
            public int nextInt(int bound) {
                if (index < values.length) {
                    return values[index++];
                }
                return 65;
            }
        };
        
        String result = RandomStringUtils.random(1, 0, 70000, false, false, null, customRandom);
        assertNotNull(result);
    }

    @Test
    public void testHighSurrogateAtCountZero() {
        Random customRandom = new Random() {
            private int index = 0;
            private int[] values = {55296, 65}; // High surrogate when count=1
            @Override
            public int nextInt(int bound) {
                if (index < values.length) {
                    return values[index++];
                }
                return 65;
            }
        };
        
        String result = RandomStringUtils.random(1, 0, 70000, false, false, null, customRandom);
        assertNotNull(result);
    }
}
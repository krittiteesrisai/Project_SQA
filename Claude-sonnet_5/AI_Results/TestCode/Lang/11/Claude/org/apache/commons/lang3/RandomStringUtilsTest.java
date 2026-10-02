package org.apache.commons.lang3;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

public class RandomStringUtilsTest {

    // ---------- Helper: ควบคุมค่า nextInt(int) ตามลำดับที่กำหนด ----------
    private static class FixedRandom extends Random {
        private final int[] values;
        private int idx = 0;
        FixedRandom(int... values) { this.values = values; }
        @Override
        public int nextInt(int bound) {
            return values[idx++];
        }
    }

    // ===================== 1. count == 0 / count < 0 =====================

    @Test
    public void testRandom_CountZero_ReturnsEmptyString() {
        assertEquals("", RandomStringUtils.random(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandom_CountNegative_ThrowsException() {
        RandomStringUtils.random(-5);
    }

    @Test
    public void testCoreRandom_CountZero_ReturnsEmptyString() {
        assertEquals("", RandomStringUtils.random(0, 0, 0, false, false, null, new Random()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCoreRandom_CountNegative_ThrowsException() {
        RandomStringUtils.random(-1, 0, 0, false, false, null, new Random());
    }

    // ========== 2. ลำดับการตรวจสอบ (count==0 ต้องมาก่อน chars-empty check) ==========

    @Test
    public void testCoreRandom_EmptyCharsArray_CountZero_ReturnsEmptyString() {
        // count==0 ต้อง return "" ก่อนที่จะไปเช็ค chars.length==0
        assertEquals("", RandomStringUtils.random(0, new char[0]));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCoreRandom_EmptyCharsArray_CountPositive_ThrowsException() {
        RandomStringUtils.random(5, new char[0]);
    }

    @Test
    public void testCoreRandom_NegativeCount_PrecedesCharsCheck_MessageCheck() {
        // count<0 ต้อง throw ด้วย message เกี่ยวกับ length < 0 ไม่ใช่ chars empty
        try {
            RandomStringUtils.random(-1, new char[0]);
            fail("ควร throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("less than 0"));
        }
    }

    // ===================== 3. random(count, char[]) / random(count, String) =====================

    @Test
    public void testRandomCharArray_Null_UsesAllChars_LengthCorrect() {
        String result = RandomStringUtils.random(10, (char[]) null);
        assertEquals(10, result.length());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomCharArray_Empty_ThrowsException() {
        RandomStringUtils.random(5, new char[0]);
    }

    @Test
    public void testRandomString_Null_UsesAllChars_LengthCorrect() {
        String result = RandomStringUtils.random(10, (String) null);
        assertEquals(10, result.length());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomString_Empty_ThrowsException() {
        RandomStringUtils.random(5, "");
    }

    // ===================== 4. randomAscii / randomAlphabetic / randomAlphanumeric / randomNumeric =====================

    @Test
    public void testRandomAscii_RangeCorrect() {
        String s = RandomStringUtils.randomAscii(1000);
        assertEquals(1000, s.length());
        for (char c : s.toCharArray()) {
            assertTrue("char=" + (int) c, c >= 32 && c <= 126);
        }
    }

    @Test
    public void testRandomAlphabetic_AllLetters() {
        String s = RandomStringUtils.randomAlphabetic(1000);
        assertEquals(1000, s.length());
        for (char c : s.toCharArray()) {
            assertTrue(Character.isLetter(c));
        }
    }

    @Test
    public void testRandomAlphanumeric_AllLettersOrDigits() {
        String s = RandomStringUtils.randomAlphanumeric(1000);
        assertEquals(1000, s.length());
        for (char c : s.toCharArray()) {
            assertTrue(Character.isLetter(c) || Character.isDigit(c));
        }
    }

    @Test
    public void testRandomNumeric_AllDigits() {
        String s = RandomStringUtils.randomNumeric(1000);
        assertEquals(1000, s.length());
        for (char c : s.toCharArray()) {
            assertTrue(Character.isDigit(c));
        }
    }

    @Test
    public void testRandomDefault_LengthCorrect_MultipleRuns() {
        for (int i = 0; i < 20; i++) {
            String s = RandomStringUtils.random(50);
            assertEquals(50, s.length());
        }
    }

    // ===================== 5. start==0 && end==0 branch: chars != null =====================

    @Test
    public void testCoreRandom_StartEndZero_CharsNotNull_UsesCharsLength() {
        char[] set = {'p', 'q', 'r', 's'};
        String result = RandomStringUtils.random(20, 0, 0, false, false, set, new Random());
        assertEquals(20, result.length());
        for (char c : result.toCharArray()) {
            boolean found = false;
            for (char allowed : set) {
                if (c == allowed) { found = true; break; }
            }
            assertTrue("char นอกเซ็ตที่กำหนด: " + c, found);
        }
    }

    // ===================== 6. วิธี vararg (6-arg) ที่ chars เป็น empty array ชัดเจน =====================

    @Test(expected = IllegalArgumentException.class)
    public void testVarargsRandom_EmptyCharsExplicit_Throws() {
        // เมื่อส่ง char... แบบ explicit ว่าง -> chars = new char[0] (ไม่ใช่ null)
        RandomStringUtils.random(5, 0, 0, false, false, new char[0]);
    }

    @Test
    public void testVarargsRandom_WithChars_UsesOnlyGivenChars() {
        String result = RandomStringUtils.random(15, 0, 3, false, false, 'a', 'b', 'c');
        assertEquals(15, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(c == 'a' || c == 'b' || c == 'c');
        }
    }

    // ===================== 7. Surrogate handling branches (ใช้ FixedRandom) =====================

    @Test
    public void testLowSurrogate_SkipAtEdge() {
        // count==1: ch=low surrogate ตรง edge (count==0) -> skip แล้วสุ่มใหม่เป็น 'A'
        FixedRandom fr = new FixedRandom(56320, 65);
        String result = RandomStringUtils.random(1, 0, 70000, false, false, null, fr);
        assertEquals("A", result);
    }

    @Test
    public void testLowSurrogate_NormalInsertion() {
        // count==2: ch=low surrogate ไม่ติด edge -> แทรก high surrogate คู่กัน
        FixedRandom fr = new FixedRandom(56320, 5);
        String result = RandomStringUtils.random(2, 0, 70000, false, false, null, fr);
        assertEquals(2, result.length());
        assertEquals((char) (55296 + 5), result.charAt(0)); // high surrogate ที่สุ่มเพิ่ม
        assertEquals((char) 56320, result.charAt(1));        // low surrogate เดิม
    }

    @Test
    public void testHighSurrogate_SkipAtEdge() {
        FixedRandom fr = new FixedRandom(55296, 65);
        String result = RandomStringUtils.random(1, 0, 70000, false, false, null, fr);
        assertEquals("A", result);
    }

    @Test
    public void testHighSurrogate_NormalInsertion() {
        FixedRandom fr = new FixedRandom(55296, 5);
        String result = RandomStringUtils.random(2, 0, 70000, false, false, null, fr);
        assertEquals(2, result.length());
        assertEquals((char) 55296, result.charAt(0));          // high surrogate เดิม
        assertEquals((char) (56320 + 5), result.charAt(1));    // low surrogate ที่สุ่มเพิ่ม
    }

    @Test
    public void testPrivateHighSurrogate_Skipped() {
        // ช่วง 56192-56319 ต้องถูก skip เสมอ (ไม่สน count)
        FixedRandom fr = new FixedRandom(56200, 65);
        String result = RandomStringUtils.random(1, 0, 70000, false, false, null, fr);
        assertEquals("A", result);
    }

    // ===================== 8. letters/numbers filter -> retry branch (count++) =====================

    @Test
    public void testLettersFilter_RetryOnNonLetter() {
        // ตัวแรกเป็นเลข (ไม่ผ่าน letters filter) -> retry -> ตัวที่สองเป็นตัวอักษร
        FixedRandom fr = new FixedRandom('5', 'A');
        String result = RandomStringUtils.random(1, 0, 128, true, false, null, fr);
        assertEquals("A", result);
    }

    @Test
    public void testNumbersFilter_RetryOnNonDigit() {
        FixedRandom fr = new FixedRandom('A', '5');
        String result = RandomStringUtils.random(1, 0, 128, false, true, null, fr);
        assertEquals("5", result);
    }

    // ===================== 9. chars != null : เลือกตาม index =====================

    @Test
    public void testCharsArray_SelectionByIndex() {
        char[] set = {'x', 'y', 'z'};
        FixedRandom fr = new FixedRandom(1); // index=1 -> 'y'
        String result = RandomStringUtils.random(1, 0, 3, false, false, set, fr);
        assertEquals("y", result);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testCharsArray_InsufficientRange_ThrowsArrayIndexOutOfBounds() {
        // gap(end-start)=5 แต่ chars มีแค่ 3 ตัว -> index=4 เกินขอบ array
        char[] set = {'a', 'b', 'c'};
        FixedRandom fr = new FixedRandom(4);
        RandomStringUtils.random(1, 0, 5, false, false, set, fr);
    }

    // ===================== 10. ตัวห่อ (wrapper) อื่น ๆ (sanity, ใช้ Random จริง) =====================

    @Test
    public void test5ArgWrapper_DelegatesCorrectly() {
        String result = RandomStringUtils.random(10, 0, 0, false, false);
        assertEquals(10, result.length());
    }

    @Test
    public void test6ArgWrapper_WithExplicitStartEnd() {
        String result = RandomStringUtils.random(10, 'a', 'c' + 1, false, false, (char[]) null);
        assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(c >= 'a' && c <= 'c');
        }
    }

    @Test
    public void testRandomLettersNumbers_Overload() {
        String result = RandomStringUtils.random(10, true, true);
        assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(Character.isLetterOrDigit(c));
        }
    }
}

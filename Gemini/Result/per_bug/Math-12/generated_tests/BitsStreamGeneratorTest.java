package org.apache.commons.math3.random;

import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class BitsStreamGeneratorTest {

    /**
     * คลาสจำลอง BitsStreamGenerator เพื่อควบคุมค่าบิตที่ส่งกลับมาได้ตามต้องการ
     */
    private static class MockBitsStreamGenerator extends BitsStreamGenerator {
        private static final long serialVersionUID = 1L;
        private final Queue<Integer> bitSequence = new ArrayDeque<Integer>();
        private int fallbackValue = 0;

        public void setSequence(Integer... values) {
            bitSequence.clear();
            bitSequence.addAll(Arrays.asList(values));
        }

        public void setFallbackValue(int value) {
            this.fallbackValue = value;
        }

        @Override
        public void setSeed(int seed) {}

        @Override
        public void setSeed(int[] seed) {}

        @Override
        public void setSeed(long seed) {}

        @Override
        protected int next(int bits) {
            if (!bitSequence.isEmpty()) {
                int val = bitSequence.poll();
                // Mask ค่าให้อยู่ในขนาด bits ที่ร้องขอ
                if (bits == 32) {
                    return val;
                }
                return val & ((1 << bits) - 1);
            }
            if (bits == 32) {
                return fallbackValue;
            }
            return fallbackValue & ((1 << bits) - 1);
        }
    }

    private MockBitsStreamGenerator generator;

    @Before
    public void setUp() {
        generator = new MockBitsStreamGenerator();
    }

    @Test
    public void testNextBooleanTrueAndFalse() {
        generator.setSequence(1, 0, 3, 2);
        Assert.assertTrue(generator.nextBoolean());  // 1 & 1 != 0 -> true
        Assert.assertFalse(generator.nextBoolean()); // 0 & 1 == 0 -> false
        Assert.assertTrue(generator.nextBoolean());  // 3 & 1 != 0 -> true
        Assert.assertFalse(generator.nextBoolean()); // 2 & 1 == 0 -> false
    }

    @Test(expected = NullPointerException.class)
    public void testNextBytesNull() {
        generator.nextBytes(null);
    }

    @Test
    public void testNextBytesEmpty() {
        byte[] bytes = new byte[0];
        generator.nextBytes(bytes);
        Assert.assertEquals(0, bytes.length);
    }

    @Test
    public void testNextBytesLength1to3() {
        // ทดสอบความยาว 1, 2, 3 ไบต์ (iEnd < 0 จะข้าม loop แรกไปยัง loop เก็บตก)
        for (int len = 1; len <= 3; len++) {
            generator.setSequence(0x04030201);
            byte[] bytes = new byte[len];
            generator.nextBytes(bytes);
            for (int i = 0; i < len; i++) {
                Assert.assertEquals((byte) (i + 1), bytes[i]);
            }
        }
    }

    @Test
    public void testNextBytesExactMultipleOfFour() {
        // ความยาว 4 และ 8 ไบต์ (วน loop แรกครบพอดี loop หลังไม่ทำงาน)
        generator.setSequence(0x04030201, 0x08070605);
        byte[] bytes = new byte[8];
        generator.nextBytes(bytes);
        for (int i = 0; i < 8; i++) {
            Assert.assertEquals((byte) (i + 1), bytes[i]);
        }
    }

    @Test
    public void testNextBytesNonMultipleOfFour() {
        // ความยาว 7 ไบต์ (Loop แรก 4 ไบต์, Loop หลังเก็บตก 3 ไบต์)
        generator.setSequence(0x04030201, 0x070605);
        byte[] bytes = new byte[7];
        generator.nextBytes(bytes);
        for (int i = 0; i < 7; i++) {
            Assert.assertEquals((byte) (i + 1), bytes[i]);
        }
    }

    @Test
    public void testNextDoubleRangeAndLimits() {
        // ทดสอบค่าต่ำสุด (0)
        generator.setSequence(0, 0);
        Assert.assertEquals(0.0, generator.nextDouble(), 1e-15);

        // ทดสอบค่าสูงสุด (26 bits = 0x3FFFFFF)
        generator.setSequence(0x3FFFFFF, 0x3FFFFFF);
        double maxDouble = generator.nextDouble();
        Assert.assertTrue(maxDouble < 1.0);
        Assert.assertTrue(maxDouble >= 0.0);
    }

    @Test
    public void testNextFloatRangeAndLimits() {
        // ทดสอบ 0
        generator.setSequence(0);
        Assert.assertEquals(0.0f, generator.nextFloat(), 1e-7f);

        // ทดสอบ 23 bits = 0x7FFFFF
        generator.setSequence(0x7FFFFF);
        float maxFloat = generator.nextFloat();
        Assert.assertTrue(maxFloat < 1.0f);
        Assert.assertTrue(maxFloat >= 0.0f);
    }

    @Test
    public void testNextGaussianPairAndCaching() {
        generator.setSequence(
            0x1000000, 0x2000000, // ค่า double x, y สำหรับการคำนวณคู่แรก
            0x0500000, 0x0600000  // สำหรับการคำนวณรอบใหม่
        );

        // ครั้งแรก: nextGaussian เป็น NaN -> คำนวณคู่ใหม่ คืนค่าแรก เก็บค่าที่สอง
        double first = generator.nextGaussian();

        // ครั้งที่สอง: nextGaussian มีค่าแคชอยู่ -> ดึงค่าแคชมาใช้ และรีเซ็ตเป็น NaN
        double second = generator.nextGaussian();

        Assert.assertNotEquals(first, second, 1e-15);

        // ครั้งที่สาม: nextGaussian กลับมาเป็น NaN -> คำนวณคู่ใหม่อีกครั้ง
        double third = generator.nextGaussian();
        Assert.assertNotEquals(first, third, 1e-15);
        Assert.assertNotEquals(second, third, 1e-15);
    }

    @Test
    public void testClearResetsGaussianCache() {
        generator.setSequence(
            0x1000000, 0x2000000,
            0x1000000, 0x2000000
        );

        double val1 = generator.nextGaussian();
        generator.clear(); // ล้างแคช -> รอบถัดไปต้องคำนวณใหม่แทนการใช้ค่าแคช
        double val2 = generator.nextGaussian();

        // เมื่อใช้อินพุตชุดเดียวกัน ผลลัพธ์จากการคำนวณใหม่ต้องเท่ากับรอบแรก
        Assert.assertEquals(val1, val2, 1e-15);
    }

    @Test
    public void testNextIntNoParam() {
        generator.setSequence(0, -1, 123456789, Integer.MIN_VALUE, Integer.MAX_VALUE);
        Assert.assertEquals(0, generator.nextInt());
        Assert.assertEquals(-1, generator.nextInt());
        Assert.assertEquals(123456789, generator.nextInt());
        Assert.assertEquals(Integer.MIN_VALUE, generator.nextInt());
        Assert.assertEquals(Integer.MAX_VALUE, generator.nextInt());
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testNextIntBoundedZero() {
        generator.nextInt(0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testNextIntBoundedNegative() {
        generator.nextInt(-5);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testNextIntBoundedMinInteger() {
        generator.nextInt(Integer.MIN_VALUE);
    }

    @Test
    public void testNextIntBoundedPowerOfTwo() {
        // ทดสอบ Branch: (n & -n) == n
        int[] powersOfTwo = {1, 2, 4, 8, 16, 32, 64, 1024, 1 << 30};

        for (int n : powersOfTwo) {
            generator.setSequence(0);
            Assert.assertEquals(0, generator.nextInt(n));

            // กรณีสุ่มได้บิตสูงสุด 31 บิต (0x7FFFFFFF)
            generator.setSequence(0x7FFFFFFF);
            int res = generator.nextInt(n);
            Assert.assertTrue(res >= 0 && res < n);
        }
    }

    @Test
    public void testNextIntBoundedNonPowerOfTwoDirectAccept() {
        // ทดสอบ Branch: (n & -n) != n ที่ไม่ต้อง Loop ซ้ำ (bits - val + (n - 1) >= 0)
        generator.setSequence(100);
        int val = generator.nextInt(7);
        Assert.assertEquals(100 % 7, val);
    }

    @Test
    public void testNextIntBoundedNonPowerOfTwoWithRejectionSampling() {
        /*
         * จำลองกรณี bits - val + (n - 1) < 0 (Overflow ใน Signed 32-bit Int)
         * กำหนด n = 3; Integer.MAX_VALUE = 2147483647 (2147483647 % 3 = 1)
         * bits = 2147483647
         * bits - val + (n - 1) = 2147483647 - 1 + 2 = 2147483648 (เกิด signed overflow เป็น -2147483648 < 0)
         * จะทำให้เกิดการ Reject และวน Do-While ซ้ำรอบสอง
         */
        int n = 3;
        generator.setSequence(Integer.MAX_VALUE, 10);
        int result = generator.nextInt(n);

        // ผลลัพธ์ต้องมาจากรอบที่ 2 (10 % 3 = 1)
        Assert.assertEquals(10 % n, result);
    }

    @Test
    public void testNextLong() {
        // ทดสอบการรวมบิต High และ Low
        generator.setSequence(0x12345678, 0x9ABCDEF0);
        long result = generator.nextLong();
        Assert.assertEquals(0x123456789ABCDEF0L, result);

        // ทดสอบกรณีค่าติดลบเมื่อ High Bit ถูก Set
        generator.setSequence(0xFFFFFFFF, 0xFFFFFFFF);
        Assert.assertEquals(-1L, generator.nextLong());
    }
}
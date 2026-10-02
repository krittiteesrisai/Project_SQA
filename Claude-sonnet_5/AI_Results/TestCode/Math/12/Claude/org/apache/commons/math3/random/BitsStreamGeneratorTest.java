package org.apache.commons.math3.random;

import static org.junit.Assert.*;

import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.junit.Test;

public class BitsStreamGeneratorTest {

    /**
     * Stub generator: คืนค่า next(bits) ตามลำดับที่กำหนดไว้ล่วงหน้า
     * ไม่สน bits parameter (เพราะ production code ไม่ validate ค่านี้)
     * ถ้าเรียกเกินจำนวนที่กำหนดไว้ -> throw เพื่อจับการเรียกเกินที่ไม่คาดคิด
     */
    private static class SequenceGenerator extends BitsStreamGenerator {
        private final int[] seq;
        private int idx = 0;
        private int callCount = 0;

        SequenceGenerator(int... seq) {
            this.seq = seq;
        }

        @Override public void setSeed(int seed) { /* not used in tests */ }
        @Override public void setSeed(int[] seed) { /* not used in tests */ }
        @Override public void setSeed(long seed) { /* not used in tests */ }

        @Override
        protected int next(int bits) {
            callCount++;
            if (idx >= seq.length) {
                throw new IllegalStateException(
                    "Unexpected extra call to next(): idx=" + idx);
            }
            return seq[idx++];
        }

        int getCallCount() {
            return callCount;
        }
    }

    // ---------------------------------------------------------------
    // nextBoolean()
    // ---------------------------------------------------------------

    @Test
    public void testNextBoolean_zeroIsFalse() {
        SequenceGenerator g = new SequenceGenerator(0);
        assertFalse(g.nextBoolean());
    }

    @Test
    public void testNextBoolean_nonZeroIsTrue() {
        SequenceGenerator g = new SequenceGenerator(-1); // != 0
        assertTrue(g.nextBoolean());
    }

    @Test
    public void testNextBoolean_oneIsTrue() {
        SequenceGenerator g = new SequenceGenerator(1);
        assertTrue(g.nextBoolean());
    }

    // ---------------------------------------------------------------
    // nextBytes(byte[])
    // ---------------------------------------------------------------

    @Test
    public void testNextBytes_emptyArray_noCalls() {
        SequenceGenerator g = new SequenceGenerator(); // ไม่มีค่าเลย
        byte[] bytes = new byte[0];
        g.nextBytes(bytes);
        assertEquals(0, g.getCallCount());
        assertArrayEquals(new byte[0], bytes);
    }

    @Test
    public void testNextBytes_lengthLessThan4_remainderOnly() {
        final int RAND1 = 0x12345678;
        SequenceGenerator g = new SequenceGenerator(RAND1);
        byte[] bytes = new byte[3];
        g.nextBytes(bytes);
        // first while ไม่รัน (iEnd=0), second while รัน 3 ครั้งโดยใช้ next(32) ครั้งเดียว
        assertEquals(1, g.getCallCount());
        assertArrayEquals(
            new byte[] { (byte) 0x78, (byte) 0x56, (byte) 0x34 },
            bytes);
    }

    @Test
    public void testNextBytes_lengthExactMultipleOf4() {
        final int RAND1 = 0x12345678;
        final int RAND2 = 0xAABBCCDD; // ค่านี้ถูกเรียกแต่ไม่ถูกใช้ (ตามบั๊ก/พฤติกรรมจริงของ source)
        SequenceGenerator g = new SequenceGenerator(RAND1, RAND2);
        byte[] bytes = new byte[4];
        g.nextBytes(bytes);
        // first while รัน 1 ครั้ง (ใช้ RAND1) แล้ว code เรียก next(32) อีกครั้งเสมอ (RAND2) แต่ไม่ถูกใช้
        assertEquals(2, g.getCallCount());
        assertArrayEquals(
            new byte[] { (byte) 0x78, (byte) 0x56, (byte) 0x34, (byte) 0x12 },
            bytes);
    }

    @Test
    public void testNextBytes_lengthNotMultipleOf4_withRemainder() {
        final int RAND1 = 0x12345678;
        final int RAND2 = 0xAABBCCDD;
        SequenceGenerator g = new SequenceGenerator(RAND1, RAND2);
        byte[] bytes = new byte[7];
        g.nextBytes(bytes);
        // first while รัน 1 ครั้ง (RAND1), แล้ว remainder loop ใช้ RAND2 (3 bytes)
        assertEquals(2, g.getCallCount());
        assertArrayEquals(
            new byte[] {
                (byte) 0x78, (byte) 0x56, (byte) 0x34, (byte) 0x12,
                (byte) 0xDD, (byte) 0xCC, (byte) 0xBB
            },
            bytes);
    }

    @Test
    public void testNextBytes_lengthMultipleOf4_twoFullBlocks() {
        final int RAND1 = 0x12345678;
        final int RAND2 = 0xAABBCCDD;
        final int RAND3 = 0x11223344; // ถูกเรียกแต่ไม่ถูกใช้
        SequenceGenerator g = new SequenceGenerator(RAND1, RAND2, RAND3);
        byte[] bytes = new byte[8];
        g.nextBytes(bytes);
        // first while รัน 2 ครั้ง (RAND1, RAND2) แล้วเรียก next(32) อีกครั้ง (RAND3) ที่ไม่ใช้
        assertEquals(3, g.getCallCount());
        assertArrayEquals(
            new byte[] {
                (byte) 0x78, (byte) 0x56, (byte) 0x34, (byte) 0x12,
                (byte) 0xDD, (byte) 0xCC, (byte) 0xBB, (byte) 0xAA
            },
            bytes);
    }

    @Test
    public void testNextBytes_lengthOne() {
        final int RAND1 = 0x000000FF;
        SequenceGenerator g = new SequenceGenerator(RAND1);
        byte[] bytes = new byte[1];
        g.nextBytes(bytes);
        assertEquals(1, g.getCallCount());
        assertArrayEquals(new byte[] { (byte) 0xFF }, bytes);
    }

    @Test
    public void testNextBytes_lengthTwo() {
        final int RAND1 = 0x0000ABCD;
        SequenceGenerator g = new SequenceGenerator(RAND1);
        byte[] bytes = new byte[2];
        g.nextBytes(bytes);
        assertEquals(1, g.getCallCount());
        assertArrayEquals(new byte[] { (byte) 0xCD, (byte) 0xAB }, bytes);
    }

    // ---------------------------------------------------------------
    // nextDouble()
    // ---------------------------------------------------------------

    @Test
    public void testNextDouble_zero() {
        SequenceGenerator g = new SequenceGenerator(0, 0);
        double d = g.nextDouble();
        assertEquals(0.0, d, 0.0);
    }

    @Test
    public void testNextDouble_maxBoundary() {
        final int MAX26 = (1 << 26) - 1; // 67108863
        SequenceGenerator g = new SequenceGenerator(MAX26, MAX26);
        double d = g.nextDouble();
        double expected = (((long) MAX26) << 26 | MAX26) * 0x1.0p-52d;
        assertEquals(expected, d, 0.0);
        assertTrue(d < 1.0d); // ต้องอยู่ในช่วง [0,1)
        assertTrue(d >= 0.0d);
    }

    // ---------------------------------------------------------------
    // nextFloat()
    // ---------------------------------------------------------------

    @Test
    public void testNextFloat_zero() {
        SequenceGenerator g = new SequenceGenerator(0);
        float f = g.nextFloat();
        assertEquals(0.0f, f, 0.0f);
    }

    @Test
    public void testNextFloat_maxBoundary() {
        final int MAX23 = (1 << 23) - 1; // 8388607
        SequenceGenerator g = new SequenceGenerator(MAX23);
        float f = g.nextFloat();
        float expected = MAX23 * 0x1.0p-23f;
        assertEquals(expected, f, 0.0f);
        assertTrue(f < 1.0f);
    }

    // ---------------------------------------------------------------
    // nextInt()
    // ---------------------------------------------------------------

    @Test
    public void testNextInt_passThroughPositive() {
        SequenceGenerator g = new SequenceGenerator(123456);
        assertEquals(123456, g.nextInt());
    }

    @Test
    public void testNextInt_passThroughNegative() {
        SequenceGenerator g = new SequenceGenerator(-999);
        assertEquals(-999, g.nextInt());
    }

    // ---------------------------------------------------------------
    // nextInt(int n)
    // ---------------------------------------------------------------

    @Test(expected = NotStrictlyPositiveException.class)
    public void testNextIntN_zero_throws() {
        SequenceGenerator g = new SequenceGenerator();
        g.nextInt(0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testNextIntN_negative_throws() {
        SequenceGenerator g = new SequenceGenerator();
        g.nextInt(-5);
    }

    @Test
    public void testNextIntN_powerOfTwo() {
        final int n = 16; // power of two
        final int bits = 1 << 30;
        SequenceGenerator g = new SequenceGenerator(bits);
        int result = g.nextInt(n);
        long expected = (n * (long) bits) >> 31;
        assertEquals((int) expected, result);
        assertEquals(1, g.getCallCount());
    }

    @Test
    public void testNextIntN_nonPowerOfTwo_noRejection() {
        final int n = 5;
        final int bits = 7; // val = 7%5=2 ; bits-val+(n-1)=7-2+4=9 >=0 -> ไม่ reject
        SequenceGenerator g = new SequenceGenerator(bits);
        int result = g.nextInt(n);
        assertEquals(2, result);
        assertEquals(1, g.getCallCount()); // loop วิ่งแค่รอบเดียว
    }

    @Test
    public void testNextIntN_nonPowerOfTwo_withRejectionLoop() {
        // เลือกค่าให้เกิด integer overflow ใน (bits - val + (n-1)) < 0
        final int n = 1000000007; // ไม่ใช่ power of two
        final int bits1 = Integer.MAX_VALUE; // ทำให้เกิด overflow -> reject
        final int bits2 = 0;                 // รอบถัดไปผ่าน -> val=0
        SequenceGenerator g = new SequenceGenerator(bits1, bits2);
        int result = g.nextInt(n);
        assertEquals(0, result);
        assertEquals(2, g.getCallCount()); // ต้องวน 2 รอบ (reject 1 ครั้ง)
    }

    // ---------------------------------------------------------------
    // nextLong()
    // ---------------------------------------------------------------

    @Test
    public void testNextLong_combinesHighLow() {
        final int high = 1;
        final int low = -1; // ทดสอบ masking 0xffffffffL
        SequenceGenerator g = new SequenceGenerator(high, low);
        long result = g.nextLong();
        long expected = (((long) high) << 32) | (((long) low) & 0xffffffffL);
        assertEquals(expected, result);
    }

    @Test
    public void testNextLong_zero() {
        SequenceGenerator g = new SequenceGenerator(0, 0);
        assertEquals(0L, g.nextLong());
    }

    // ---------------------------------------------------------------
    // nextGaussian() + clear()  (if/else branch + cache behaviour)
    // ---------------------------------------------------------------

    @Test
    public void testNextGaussian_cacheThenClear() {
        final int v = 1 << 25; // ค่าปานกลางที่ปลอดภัย (ไม่ทำให้ log()/sqrt() เป็น NaN/Infinite)
        // ต้องมี 8 ค่า: 4 ค่าสำหรับรอบแรก (if-branch) + 4 ค่าสำหรับรอบหลัง clear()
        SequenceGenerator g = new SequenceGenerator(v, v, v, v, v, v, v, v);

        // รอบแรก: nextGaussian is NaN -> เข้า if-branch, ต้องสร้างคู่ใหม่ (เรียก next() 4 ครั้ง)
        double first = g.nextGaussian();
        assertFalse(Double.isNaN(first));
        assertEquals(4, g.getCallCount());

        // รอบสอง: ใช้ค่า cache -> เข้า else-branch, ไม่เรียก next() เพิ่ม
        double second = g.nextGaussian();
        assertFalse(Double.isNaN(second));
        assertEquals(4, g.getCallCount()); // callCount ไม่เปลี่ยน -> พิสูจน์ branch else ถูกใช้จริง

        // เคลียร์ cache
        g.clear();

        // รอบสาม (หลัง clear): ต้องกลับไปเข้า if-branch อีกครั้ง -> next() ถูกเรียกเพิ่มอีก 4 ครั้ง
        double third = g.nextGaussian();
        assertFalse(Double.isNaN(third));
        assertEquals(8, g.getCallCount());
    }

    @Test
    public void testClear_resetsNextGaussianField() {
        // ทดสอบ clear() แยก: หลังสร้าง cache แล้ว clear แล้วเรียกใหม่ต้องไม่ throw/ ทำงานได้ปกติ
        final int v = 1 << 24;
        SequenceGenerator g = new SequenceGenerator(v, v, v, v, v, v, v, v);
        g.nextGaussian(); // สร้าง cache
        g.clear();
        double afterClear = g.nextGaussian(); // ต้องสร้างใหม่ ไม่ throw NaN cache error
        assertFalse(Double.isNaN(afterClear));
    }
}

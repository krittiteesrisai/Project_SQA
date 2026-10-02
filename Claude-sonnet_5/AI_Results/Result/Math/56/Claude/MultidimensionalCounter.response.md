## MultidimensionalCounterTest.java

```java
package org.apache.commons.math.util;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.junit.Test;

/**
 * Unit tests for {@link MultidimensionalCounter}.
 * Target: Defects4J Math-56b
 */
public class MultidimensionalCounterTest {

    // ---------------------------------------------------------------
    // Constructor tests
    // ---------------------------------------------------------------

    @Test
    public void testConstructorValidMultiDimension() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 4, 3);
        assertEquals(3, c.getDimension());
        assertEquals(24, c.getSize());
        assertArrayEquals(new int[]{2, 4, 3}, c.getSizes());
    }

    @Test
    public void testConstructorSingleDimension() {
        MultidimensionalCounter c = new MultidimensionalCounter(5);
        assertEquals(1, c.getDimension());
        assertEquals(5, c.getSize());
    }

    @Test
    public void testConstructorSingleDimensionSizeOne() {
        // boundary: minimal valid size = 1
        MultidimensionalCounter c = new MultidimensionalCounter(1);
        assertEquals(1, c.getSize());
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorZeroSizeFirstDimensionThrows() {
        new MultidimensionalCounter(0, 3);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorNegativeSizeFirstDimensionThrows() {
        new MultidimensionalCounter(-1, 3);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorNegativeSizeLastDimensionThrows() {
        // negative value located in the "last" dimension branch
        new MultidimensionalCounter(3, -1);
    }

    @Test
    public void testConstructorEmptySizeArrayThrows() {
        // ตามซอร์ส: last = -1 -> size[last] จะทำให้เกิด ArrayIndexOutOfBoundsException
        // (พฤติกรรมนี้อ่านได้ตรงจากซอร์ส ไม่ใช่การเดา)
        try {
            new MultidimensionalCounter();
            fail("Expected ArrayIndexOutOfBoundsException due to last = -1");
        } catch (ArrayIndexOutOfBoundsException expected) {
            // ok
        }
    }

    // ---------------------------------------------------------------
    // getCounts(int index) tests
    // ---------------------------------------------------------------

    @Test
    public void testGetCountsKnownMappingFromJavadoc() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 4, 3);
        assertArrayEquals(new int[]{0, 0, 0}, c.getCounts(0));
        assertArrayEquals(new int[]{0, 0, 1}, c.getCounts(1));
        assertArrayEquals(new int[]{0, 0, 2}, c.getCounts(2));
        assertArrayEquals(new int[]{0, 1, 0}, c.getCounts(3));
        assertArrayEquals(new int[]{1, 0, 0}, c.getCounts(12));
        assertArrayEquals(new int[]{1, 3, 2}, c.getCounts(23));
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCountsNegativeIndexThrows() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 4, 3);
        c.getCounts(-1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCountsIndexEqualsTotalSizeThrows() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 4, 3);
        // totalSize = 24, hợp lệ range la [0,23]
        c.getCounts(24);
    }

    @Test
    public void testGetCountsBoundaryLastValidIndex() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 4, 3);
        // index = totalSize -1 phải hợp lệ
        int[] result = c.getCounts(23);
        assertArrayEquals(new int[]{1, 3, 2}, result);
    }

    // ---------------------------------------------------------------
    // getCount(int...) tests
    // ---------------------------------------------------------------

    @Test
    public void testGetCountRoundTripAllIndices() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 4, 3);
        for (int index = 0; index < c.getSize(); index++) {
            int[] counts = c.getCounts(index);
            int back = c.getCount(counts);
            assertEquals("Round trip failed at index " + index, index, back);
        }
    }

    @Test(expected = DimensionMismatchException.class)
    public void testGetCountDimensionMismatchThrows() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 4, 3);
        c.getCount(0, 0); // length 2 != dimension 3
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCountNegativeIndexInFirstDimensionThrows() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 4, 3);
        c.getCount(-1, 0, 0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCountIndexTooLargeInFirstDimensionThrows() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 4, 3);
        // size[0] = 2 -> valid range [0,1]
        c.getCount(2, 0, 0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCountIndexTooLargeInLastDimensionThrows() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 4, 3);
        // size[2] = 3 -> valid range [0,2]
        c.getCount(0, 0, 3);
    }

    @Test
    public void testGetCountValidBoundaryValues() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 4, 3);
        assertEquals(0, c.getCount(0, 0, 0));
        assertEquals(23, c.getCount(1, 3, 2));
    }

    // ---------------------------------------------------------------
    // getSizes() / getSize() / getDimension()
    // ---------------------------------------------------------------

    @Test
    public void testGetSizesReturnsDefensiveCopy() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 3);
        int[] sizes1 = c.getSizes();
        sizes1[0] = 999; // mutate returned array
        int[] sizes2 = c.getSizes();
        assertEquals(2, sizes2[0]); // internal state unaffected
        assertArrayEquals(new int[]{2, 3}, sizes2);
    }

    @Test
    public void testGetSize() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 3, 4);
        assertEquals(24, c.getSize());
    }

    @Test
    public void testGetDimension() {
        MultidimensionalCounter c = new MultidimensionalCounter(5, 6, 7, 8);
        assertEquals(4, c.getDimension());
    }

    // ---------------------------------------------------------------
    // toString() -- known defect area (Math-56b)
    // ---------------------------------------------------------------

    @Test
    public void testToStringSingleDimensionWorks() {
        // dimension == 1 -> getCount(i) ภายใน toString() เรียกด้วย array ความยาว 1
        // ซึ่งตรงกับ dimension=1 พอดี จึงไม่ throw
        MultidimensionalCounter c = new MultidimensionalCounter(5);
        String s = c.toString();
        // loop รันที่ i=0 เท่านั้น (dimension=1) -> getCount(0) ตามโค้ดคือ outer getCount(int...){0}
        assertEquals("[0]", s);
    }

    @Test
    public void testToStringMultiDimensionThrowsDimensionMismatch() {
        // สำคัญ: toString() ของคลาสนอก เรียก getCount(i) ซึ่ง resolve เป็น
        // getCount(int... c) ของคลาสเดียวกัน (ไม่ใช่ Iterator.getCount(dim))
        // เมื่อ dimension > 1 จะทำให้ c.length(1) != dimension -> DimensionMismatchException
        // นี่คือพฤติกรรม (fault) ที่อ่านได้จากซอร์สโดยตรง
        MultidimensionalCounter c = new MultidimensionalCounter(2, 3);
        try {
            c.toString();
            fail("Expected DimensionMismatchException due to toString() calling wrong getCount overload");
        } catch (DimensionMismatchException expected) {
            // ok - fault confirmed
        }
    }

    // ---------------------------------------------------------------
    // Iterator tests
    // ---------------------------------------------------------------

    @Test
    public void testIteratorFullCycleTwoDimensions() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 3);
        MultidimensionalCounter.Iterator it = c.iterator();

        int[][] expectedCounters = {
            {0, 0}, {0, 1}, {0, 2}, {1, 0}, {1, 1}, {1, 2}
        };

        int idx = 0;
        while (it.hasNext()) {
            int unidim = it.next();
            assertEquals(idx, unidim);
            assertEquals(idx, it.getCount());
            assertArrayEquals(expectedCounters[idx], it.getCounts());
            assertEquals(expectedCounters[idx][0], it.getCount(0));
            assertEquals(expectedCounters[idx][1], it.getCount(1));
            idx++;
        }
        assertEquals(6, idx); // totalSize = 2*3 = 6
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorSingleDimensionSizeOne() {
        // boundary: dimension=1, size=1 -> ควรมีแค่หนึ่งค่า
        MultidimensionalCounter c = new MultidimensionalCounter(1);
        MultidimensionalCounter.Iterator it = c.iterator();
        assertTrue(it.hasNext());
        int v = it.next();
        assertEquals(0, v);
        assertFalse(it.hasNext());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIteratorRemoveThrowsUnsupported() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 2);
        MultidimensionalCounter.Iterator it = c.iterator();
        it.remove();
    }

    @Test
    public void testIteratorWrapsAroundAfterExhaustion() {
        // พฤติกรรมจริงตามซอร์ส: next() ไม่มีการตรวจสอบ hasNext()
        // เมื่อเรียกต่อหลัง exhausted จะ wrap กลับไปค่าเริ่มต้น (ไม่ throw NoSuchElementException)
        // บันทึกไว้เป็นพฤติกรรมที่อ่านได้จากซอร์สจริง ไม่ใช่การเดา
        MultidimensionalCounter c = new MultidimensionalCounter(2, 2);
        MultidimensionalCounter.Iterator it = c.iterator();
        int last = -1;
        while (it.hasNext()) {
            last = it.next();
        }
        assertEquals(3, last); // totalSize-1 = 3

        // Exhausted, hasNext() == false, but calling next() again still "works" per source
        int wrapped = it.next();
        assertEquals(4, wrapped); // count keeps incrementing
        assertArrayEquals(new int[]{0, 0}, it.getCounts()); // counter wrapped back to zero
    }

    @Test
    public void testIteratorGetCountDimensionIndexOutOfBoundsThrows() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 2);
        MultidimensionalCounter.Iterator it = c.iterator();
        it.next();
        try {
            it.getCount(5); // invalid dimension index
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            // ok, matches documented behaviour
        }
    }

    @Test
    public void testMultipleIteratorsAreIndependent() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 2);
        MultidimensionalCounter.Iterator it1 = c.iterator();
        MultidimensionalCounter.Iterator it2 = c.iterator();

        it1.next();
        it1.next();

        // it2 should remain unaffected / independent
        assertEquals(-1, it2.getCount());
        it2.next();
        assertEquals(0, it2.getCount());
    }
}
```

## สรุปตาราง Test Coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testConstructorValidMultiDimension | constructor path ปกติ (loop คำนวณ `uniCounterOffset`, `tS>0`) |
| testConstructorSingleDimension | constructor กรณี `dimension==1` (loop `i<last` ไม่ execute) |
| testConstructorSingleDimensionSizeOne | boundary `size=1`, `tS>0` ขั้นต่ำ |
| testConstructorZeroSizeFirstDimensionThrows | branch `tS<=0` → throw (size=0) |
| testConstructorNegativeSizeFirstDimensionThrows | branch `tS<=0` → throw (size ติดลบตำแหน่งแรก) |
| testConstructorNegativeSizeLastDimensionThrows | branch `tS<=0` → throw (size ติดลบตำแหน่งสุดท้าย) |
| testConstructorEmptySizeArrayThrows | edge case `size.length==0` → `last=-1` → AIOOBE (ไม่ใช่ NotStrictlyPositiveException) |
| testGetCountsKnownMappingFromJavadoc | `getCounts()` loop `for i<last` + loop `while(count<index)` หลาย index |
| testGetCountsNegativeIndexThrows | branch `index<0` → OutOfRangeException |
| testGetCountsIndexEqualsTotalSizeThrows | branch `index>=totalSize` → OutOfRangeException |
| testGetCountsBoundaryLastValidIndex | boundary `index = totalSize-1` valid |
| testGetCountRoundTripAllIndices | ครอบคลุม loop ทุก index ↔ `getCount()` reverse mapping |
| testGetCountDimensionMismatchThrows | branch `c.length != dimension` → DimensionMismatchException |
| testGetCountNegativeIndexInFirstDimensionThrows | branch `index<0` ใน loop `getCount` |
| testGetCountIndexTooLargeInFirstDimensionThrows | branch `index>=size[i]` (first dim) |
| testGetCountIndexTooLargeInLastDimensionThrows | branch `index>=size[i]` (last dim) |
| testGetCountValidBoundaryValues | boundary ค่า min/max ของ valid mapping |
| testGetSizesReturnsDefensiveCopy | ตรวจสอบ `MathUtils.copyOf` ไม่ leak internal state |
| testGetSize / testGetDimension | getter พื้นฐาน |
| testToStringSingleDimensionWorks | toString กรณี `dimension==1` ไม่ throw |
| testToStringMultiDimensionThrowsDimensionMismatch | **ตรวจจับ fault**: toString() เรียก `getCount(i)` ผิด overload เมื่อ `dimension>1` |
| testIteratorFullCycleTwoDimensions | `hasNext()`/`next()` loop ทุก branch (`counter[i]==size[i]-1` ทั้ง true/false), `getCount()`, `getCounts()`, `getCount(dim)` |
| testIteratorSingleDimensionSizeOne | boundary iterator กรณี slot เดียว |
| testIteratorRemoveThrowsUnsupported | branch `remove()` throw UnsupportedOperationException |
| testIteratorWrapsAroundAfterExhaustion | พฤติกรรมจริงของ `next()` หลัง exhausted (ไม่มี guard) |
| testIteratorGetCountDimensionIndexOutOfBoundsThrows | branch array index invalid ใน `getCount(dim)` |
| testMultipleIteratorsAreIndependent | ตรวจสอบ instance state ของ inner class แยกกันต่อ iterator |

**หมายเหตุสำคัญ:** เทส `testToStringMultiDimensionThrowsDimensionMismatch` และ `testConstructorEmptySizeArrayThrows` เขียนขึ้นจากการอ่านซอร์สโค้ดตรง ๆ (ไม่ได้เดา) เพื่อยืนยัน fault ที่มีอยู่จริงในคลาสเป้าหมาย (Math-56b) — คือ `toString()` เรียก `getCount(int... c)` ผิด semantic แทนที่จะเรียก `Iterator.getCount(int dim)`
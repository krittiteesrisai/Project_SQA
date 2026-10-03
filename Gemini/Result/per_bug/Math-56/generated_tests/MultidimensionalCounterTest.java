package org.apache.commons.math.util;

import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

public class MultidimensionalCounterTest {

    @Test
    public void testConstructorAndGetters() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 3, 4);
        Assert.assertEquals(3, c.getDimension());
        Assert.assertEquals(24, c.getSize());

        int[] sizes = c.getSizes();
        Assert.assertArrayEquals(new int[]{2, 3, 4}, sizes);

        // ตรวจสอบ Immutability ของ getSizes
        sizes[0] = 99;
        Assert.assertEquals(2, c.getSizes()[0]);
    }

    @Test
    public void test1DConstructor() {
        MultidimensionalCounter c = new MultidimensionalCounter(5);
        Assert.assertEquals(1, c.getDimension());
        Assert.assertEquals(5, c.getSize());
        Assert.assertArrayEquals(new int[]{5}, c.getSizes());
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorWithZeroSize() {
        new MultidimensionalCounter(2, 0, 4);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorWithNegativeSize() {
        new MultidimensionalCounter(2, -1, 4);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testConstructorWithEmptySize() {
        new MultidimensionalCounter(new int[]{});
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullSize() {
        new MultidimensionalCounter((int[]) null);
    }

    @Test
    public void testGetCountValidMultiDim() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 4, 3);
        Assert.assertEquals(0, c.getCount(0, 0, 0));
        Assert.assertEquals(1, c.getCount(0, 0, 1));
        Assert.assertEquals(2, c.getCount(0, 0, 2));
        Assert.assertEquals(3, c.getCount(0, 1, 0));
        Assert.assertEquals(12, c.getCount(1, 0, 0));
        Assert.assertEquals(23, c.getCount(1, 3, 2));
    }

    @Test(expected = DimensionMismatchException.class)
    public void testGetCountDimensionMismatchUnder() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 4, 3);
        c.getCount(0, 0);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testGetCountDimensionMismatchOver() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 4, 3);
        c.getCount(0, 0, 0, 0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCountNegativeIndex() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 4, 3);
        c.getCount(0, -1, 0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCountIndexTooHigh() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 4, 3);
        c.getCount(0, 4, 0); // size[1] is 4, max valid is 3
    }

    @Test
    public void testGetCountsValidMultiDim() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 4, 3);
        Assert.assertArrayEquals(new int[]{0, 0, 0}, c.getCounts(0));
        Assert.assertArrayEquals(new int[]{0, 0, 1}, c.getCounts(1));
        Assert.assertArrayEquals(new int[]{0, 0, 2}, c.getCounts(2));
        Assert.assertArrayEquals(new int[]{0, 1, 0}, c.getCounts(3));
        Assert.assertArrayEquals(new int[]{1, 0, 0}, c.getCounts(12));
        Assert.assertArrayEquals(new int[]{1, 3, 2}, c.getCounts(23));
    }

    @Test
    public void testGetCountsRoundTripAll() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 3, 4);
        for (int i = 0; i < c.getSize(); i++) {
            int[] multidimensional = c.getCounts(i);
            int uni = c.getCount(multidimensional);
            Assert.assertEquals(i, uni);
        }
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCountsNegativeIndex() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 4, 3);
        c.getCounts(-1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCountsIndexEqualToTotalSize() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 4, 3);
        c.getCounts(24);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCountsIndexOverTotalSize() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 4, 3);
        c.getCounts(25);
    }

    @Test
    public void testIteratorCompleteIteration() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 3);
        MultidimensionalCounter.Iterator iter = c.iterator();

        Assert.assertTrue(iter.hasNext());
        Assert.assertEquals(-1, iter.getCount());

        int expectedUniCount = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                Assert.assertTrue(iter.hasNext());
                Integer nextVal = iter.next();
                Assert.assertEquals(Integer.valueOf(expectedUniCount), nextVal);
                Assert.assertEquals(expectedUniCount, iter.getCount());
                Assert.assertEquals(i, iter.getCount(0));
                Assert.assertEquals(j, iter.getCount(1));
                Assert.assertArrayEquals(new int[]{i, j}, iter.getCounts());
                expectedUniCount++;
            }
        }

        Assert.assertFalse(iter.hasNext());
        Assert.assertEquals(6, expectedUniCount);
    }

    @Test
    public void testIteratorGetCountsImmutability() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 2);
        MultidimensionalCounter.Iterator iter = c.iterator();
        iter.next();

        int[] counts = iter.getCounts();
        counts[0] = 999;
        Assert.assertEquals(0, iter.getCount(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIteratorGetCountInvalidDimension() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 2);
        MultidimensionalCounter.Iterator iter = c.iterator();
        iter.getCount(2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIteratorRemove() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 2);
        c.iterator().remove();
    }

    @Test
    public void testToString() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 3);
        MultidimensionalCounter.Iterator iter = c.iterator();
        iter.next(); // counter = [0, 0]
        Assert.assertEquals("[0][0]", c.toString());
    }
}
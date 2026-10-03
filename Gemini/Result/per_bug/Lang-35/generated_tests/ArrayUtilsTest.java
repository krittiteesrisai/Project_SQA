package org.apache.commons.lang3;

import org.junit.Test;

import java.util.AbstractMap;
import java.util.Date;
import java.util.Map;

import static org.junit.Assert.*;

public class ArrayUtilsTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ArrayUtils());
    }

    // -----------------------------------------------------------------------
    // toString & isEquals
    // -----------------------------------------------------------------------
    @Test
    public void testToString() {
        assertEquals("{}", ArrayUtils.toString(null));
        assertEquals("default", ArrayUtils.toString(null, "default"));
        assertEquals("{1,2}", ArrayUtils.toString(new int[]{1, 2}));
        assertEquals("{}", ArrayUtils.toString(new int[]{}));
    }

    @Test
    public void testIsEquals() {
        assertTrue(ArrayUtils.isEquals(null, null));
        assertFalse(ArrayUtils.isEquals(null, new int[]{1}));
        assertFalse(ArrayUtils.isEquals(new int[]{1}, null));
        assertTrue(ArrayUtils.isEquals(new int[]{1, 2}, new int[]{1, 2}));
        assertFalse(ArrayUtils.isEquals(new int[]{1, 2}, new int[]{1, 3}));
    }

    // -----------------------------------------------------------------------
    // toMap
    // -----------------------------------------------------------------------
    @Test
    public void testToMap() {
        assertNull(ArrayUtils.toMap(null));

        Map<Object, Object> map = ArrayUtils.toMap(new String[][]{
                {"RED", "#FF0000"},
                {"GREEN", "#00FF00"}
        });
        assertEquals(2, map.size());
        assertEquals("#FF0000", map.get("RED"));
        assertEquals("#00FF00", map.get("GREEN"));

        Map.Entry<String, String> entry1 = new AbstractMap.SimpleEntry<String, String>("K1", "V1");
        Map.Entry<String, String> entry2 = new AbstractMap.SimpleEntry<String, String>("K2", "V2");
        Map<Object, Object> mapFromEntry = ArrayUtils.toMap(new Object[]{entry1, entry2});
        assertEquals(2, mapFromEntry.size());
        assertEquals("V1", mapFromEntry.get("K1"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToMapElementTooShort() {
        ArrayUtils.toMap(new Object[]{new String[]{"ONLY_ONE"}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToMapInvalidType() {
        ArrayUtils.toMap(new Object[]{"INVALID_STRING_OBJECT"});
    }

    // -----------------------------------------------------------------------
    // toArray & clone
    // -----------------------------------------------------------------------
    @Test
    public void testToArray() {
        String[] array = ArrayUtils.toArray("a", "b", "c");
        assertArrayEquals(new String[]{"a", "b", "c"}, array);
    }

    @Test
    public void testClone() {
        assertNull(ArrayUtils.clone((String[]) null));
        assertArrayEquals(new String[]{"a"}, ArrayUtils.clone(new String[]{"a"}));

        assertNull(ArrayUtils.clone((long[]) null));
        assertArrayEquals(new long[]{1L}, ArrayUtils.clone(new long[]{1L}));

        assertNull(ArrayUtils.clone((int[]) null));
        assertArrayEquals(new int[]{1}, ArrayUtils.clone(new int[]{1}));

        assertNull(ArrayUtils.clone((short[]) null));
        assertArrayEquals(new short[]{1}, ArrayUtils.clone(new short[]{1}));

        assertNull(ArrayUtils.clone((char[]) null));
        assertArrayEquals(new char[]{'a'}, ArrayUtils.clone(new char[]{'a'}));

        assertNull(ArrayUtils.clone((byte[]) null));
        assertArrayEquals(new byte[]{1}, ArrayUtils.clone(new byte[]{1}));

        assertNull(ArrayUtils.clone((double[]) null));
        assertArrayEquals(new double[]{1.0}, ArrayUtils.clone(new double[]{1.0}), 0.0);

        assertNull(ArrayUtils.clone((float[]) null));
        assertArrayEquals(new float[]{1.0f}, ArrayUtils.clone(new float[]{1.0f}), 0.0f);

        assertNull(ArrayUtils.clone((boolean[]) null));
        assertArrayEquals(new boolean[]{true}, ArrayUtils.clone(new boolean[]{true}));
    }

    // -----------------------------------------------------------------------
    // subarray
    // -----------------------------------------------------------------------
    @Test
    public void testSubarrayObject() {
        assertNull(ArrayUtils.subarray((Object[]) null, 0, 1));
        String[] array = new String[]{"a", "b", "c", "d"};
        assertArrayEquals(new String[]{"a", "b"}, ArrayUtils.subarray(array, -1, 2));
        assertArrayEquals(new String[]{"c", "d"}, ArrayUtils.subarray(array, 2, 10));
        assertArrayEquals(new String[]{}, ArrayUtils.subarray(array, 3, 2));
        assertEquals(String[].class, ArrayUtils.subarray(array, 3, 2).getClass());
    }

    @Test
    public void testSubarrayPrimitives() {
        assertNull(ArrayUtils.subarray((long[]) null, 0, 1));
        assertArrayEquals(new long[]{2L, 3L}, ArrayUtils.subarray(new long[]{1L, 2L, 3L, 4L}, 1, 3));
        assertArrayEquals(new long[]{}, ArrayUtils.subarray(new long[]{1L}, 2, 1));

        assertNull(ArrayUtils.subarray((int[]) null, 0, 1));
        assertArrayEquals(new int[]{2, 3}, ArrayUtils.subarray(new int[]{1, 2, 3, 4}, 1, 3));
        assertArrayEquals(new int[]{}, ArrayUtils.subarray(new int[]{1}, 2, 1));

        assertNull(ArrayUtils.subarray((short[]) null, 0, 1));
        assertArrayEquals(new short[]{2, 3}, ArrayUtils.subarray(new short[]{1, 2, 3, 4}, 1, 3));
        assertArrayEquals(new short[]{}, ArrayUtils.subarray(new short[]{1}, 2, 1));

        assertNull(ArrayUtils.subarray((char[]) null, 0, 1));
        assertArrayEquals(new char[]{'b', 'c'}, ArrayUtils.subarray(new char[]{'a', 'b', 'c', 'd'}, 1, 3));
        assertArrayEquals(new char[]{}, ArrayUtils.subarray(new char[]{'a'}, 2, 1));

        assertNull(ArrayUtils.subarray((byte[]) null, 0, 1));
        assertArrayEquals(new byte[]{2, 3}, ArrayUtils.subarray(new byte[]{1, 2, 3, 4}, 1, 3));
        assertArrayEquals(new byte[]{}, ArrayUtils.subarray(new byte[]{1}, 2, 1));

        assertNull(ArrayUtils.subarray((double[]) null, 0, 1));
        assertArrayEquals(new double[]{2.0, 3.0}, ArrayUtils.subarray(new double[]{1.0, 2.0, 3.0, 4.0}, 1, 3), 0.0);
        assertArrayEquals(new double[]{}, ArrayUtils.subarray(new double[]{1.0}, 2, 1), 0.0);

        assertNull(ArrayUtils.subarray((float[]) null, 0, 1));
        assertArrayEquals(new float[]{2.0f, 3.0f}, ArrayUtils.subarray(new float[]{1.0f, 2.0f, 3.0f, 4.0f}, 1, 3), 0.0f);
        assertArrayEquals(new float[]{}, ArrayUtils.subarray(new float[]{1.0f}, 2, 1), 0.0f);

        assertNull(ArrayUtils.subarray((boolean[]) null, 0, 1));
        assertArrayEquals(new boolean[]{true, false}, ArrayUtils.subarray(new boolean[]{false, true, false, true}, 1, 3));
        assertArrayEquals(new boolean[]{}, ArrayUtils.subarray(new boolean[]{true}, 2, 1));
    }

    // -----------------------------------------------------------------------
    // isSameLength, getLength & isSameType
    // -----------------------------------------------------------------------
    @Test
    public void testIsSameLength() {
        assertTrue(ArrayUtils.isSameLength((Object[]) null, (Object[]) null));
        assertTrue(ArrayUtils.isSameLength(new Object[0], (Object[]) null));
        assertTrue(ArrayUtils.isSameLength((Object[]) null, new Object[0]));
        assertFalse(ArrayUtils.isSameLength(new Object[1], (Object[]) null));
        assertFalse(ArrayUtils.isSameLength((Object[]) null, new Object[1]));
        assertFalse(ArrayUtils.isSameLength(new Object[1], new Object[2]));
        assertTrue(ArrayUtils.isSameLength(new Object[2], new Object[2]));

        assertTrue(ArrayUtils.isSameLength((long[]) null, (long[]) null));
        assertFalse(ArrayUtils.isSameLength(new long[1], (long[]) null));
        assertFalse(ArrayUtils.isSameLength((long[]) null, new long[1]));
        assertFalse(ArrayUtils.isSameLength(new long[1], new long[2]));
        assertTrue(ArrayUtils.isSameLength(new long[2], new long[2]));

        assertTrue(ArrayUtils.isSameLength((int[]) null, (int[]) null));
        assertFalse(ArrayUtils.isSameLength(new int[1], (int[]) null));
        assertFalse(ArrayUtils.isSameLength((int[]) null, new int[1]));
        assertFalse(ArrayUtils.isSameLength(new int[1], new int[2]));

        assertTrue(ArrayUtils.isSameLength((short[]) null, (short[]) null));
        assertFalse(ArrayUtils.isSameLength(new short[1], (short[]) null));
        assertFalse(ArrayUtils.isSameLength((short[]) null, new short[1]));
        assertFalse(ArrayUtils.isSameLength(new short[1], new short[2]));

        assertTrue(ArrayUtils.isSameLength((char[]) null, (char[]) null));
        assertFalse(ArrayUtils.isSameLength(new char[1], (char[]) null));
        assertFalse(ArrayUtils.isSameLength((char[]) null, new char[1]));
        assertFalse(ArrayUtils.isSameLength(new char[1], new char[2]));

        assertTrue(ArrayUtils.isSameLength((byte[]) null, (byte[]) null));
        assertFalse(ArrayUtils.isSameLength(new byte[1], (byte[]) null));
        assertFalse(ArrayUtils.isSameLength((byte[]) null, new byte[1]));
        assertFalse(ArrayUtils.isSameLength(new byte[1], new byte[2]));

        assertTrue(ArrayUtils.isSameLength((double[]) null, (double[]) null));
        assertFalse(ArrayUtils.isSameLength(new double[1], (double[]) null));
        assertFalse(ArrayUtils.isSameLength((double[]) null, new double[1]));
        assertFalse(ArrayUtils.isSameLength(new double[1], new double[2]));

        assertTrue(ArrayUtils.isSameLength((float[]) null, (float[]) null));
        assertFalse(ArrayUtils.isSameLength(new float[1], (float[]) null));
        assertFalse(ArrayUtils.isSameLength((float[]) null, new float[1]));
        assertFalse(ArrayUtils.isSameLength(new float[1], new float[2]));

        assertTrue(ArrayUtils.isSameLength((boolean[]) null, (boolean[]) null));
        assertFalse(ArrayUtils.isSameLength(new boolean[1], (boolean[]) null));
        assertFalse(ArrayUtils.isSameLength((boolean[]) null, new boolean[1]));
        assertFalse(ArrayUtils.isSameLength(new boolean[1], new boolean[2]));
    }

    @Test
    public void testGetLength() {
        assertEquals(0, ArrayUtils.getLength(null));
        assertEquals(2, ArrayUtils.getLength(new String[]{"a", "b"}));
        assertEquals(3, ArrayUtils.getLength(new int[]{1, 2, 3}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLengthNotAnArray() {
        ArrayUtils.getLength("NOT_AN_ARRAY");
    }

    @Test
    public void testIsSameType() {
        assertTrue(ArrayUtils.isSameType(new String[0], new String[1]));
        assertFalse(ArrayUtils.isSameType(new String[0], new Integer[0]));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameTypeNullFirst() {
        ArrayUtils.isSameType(null, new String[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameTypeNullSecond() {
        ArrayUtils.isSameType(new String[0], null);
    }

    // -----------------------------------------------------------------------
    // reverse
    // -----------------------------------------------------------------------
    @Test
    public void testReverse() {
        ArrayUtils.reverse((Object[]) null);
        String[] strArr = new String[]{"a", "b", "c"};
        ArrayUtils.reverse(strArr);
        assertArrayEquals(new String[]{"c", "b", "a"}, strArr);

        long[] longArr = new long[]{1L, 2L};
        ArrayUtils.reverse(longArr);
        assertArrayEquals(new long[]{2L, 1L}, longArr);

        int[] intArr = new int[]{1, 2, 3, 4};
        ArrayUtils.reverse(intArr);
        assertArrayEquals(new int[]{4, 3, 2, 1}, intArr);

        short[] shortArr = new short[]{1, 2};
        ArrayUtils.reverse(shortArr);
        assertArrayEquals(new short[]{2, 1}, shortArr);

        char[] charArr = new char[]{'a', 'b'};
        ArrayUtils.reverse(charArr);
        assertArrayEquals(new char[]{'b', 'a'}, charArr);

        byte[] byteArr = new byte[]{1, 2};
        ArrayUtils.reverse(byteArr);
        assertArrayEquals(new byte[]{2, 1}, byteArr);

        double[] doubleArr = new double[]{1.0, 2.0};
        ArrayUtils.reverse(doubleArr);
        assertArrayEquals(new double[]{2.0, 1.0}, doubleArr, 0.0);

        float[] floatArr = new float[]{1.0f, 2.0f};
        ArrayUtils.reverse(floatArr);
        assertArrayEquals(new float[]{2.0f, 1.0f}, floatArr, 0.0f);

        boolean[] boolArr = new boolean[]{true, false};
        ArrayUtils.reverse(boolArr);
        assertArrayEquals(new boolean[]{false, true}, boolArr);
    }

    // -----------------------------------------------------------------------
    // indexOf, lastIndexOf & contains
    // -----------------------------------------------------------------------
    @Test
    public void testIndexOfObject() {
        String[] array = new String[]{"a", "b", null, "d", "b"};
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((Object[]) null, "a"));
        assertEquals(0, ArrayUtils.indexOf(array, "a", -1));
        assertEquals(1, ArrayUtils.indexOf(array, "b"));
        assertEquals(4, ArrayUtils.indexOf(array, "b", 2));
        assertEquals(2, ArrayUtils.indexOf(array, null));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(array, "x"));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(array, 123)); // incompatible type

        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((Object[]) null, "a"));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(array, "a", -1));
        assertEquals(4, ArrayUtils.lastIndexOf(array, "b"));
        assertEquals(1, ArrayUtils.lastIndexOf(array, "b", 3));
        assertEquals(2, ArrayUtils.lastIndexOf(array, null));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(array, "x"));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(array, 123));

        assertTrue(ArrayUtils.contains(array, "a"));
        assertFalse(ArrayUtils.contains(array, "z"));
        assertFalse(ArrayUtils.contains((Object[]) null, "a"));
    }

    @Test
    public void testIndexOfPrimitives() {
        // long
        long[] lArray = new long[]{1L, 2L, 3L, 2L};
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((long[]) null, 1L));
        assertEquals(1, ArrayUtils.indexOf(lArray, 2L, -1));
        assertEquals(3, ArrayUtils.indexOf(lArray, 2L, 2));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(lArray, 9L));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((long[]) null, 1L));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(lArray, 1L, -1));
        assertEquals(3, ArrayUtils.lastIndexOf(lArray, 2L, 10));
        assertEquals(1, ArrayUtils.lastIndexOf(lArray, 2L, 2));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(lArray, 9L));
        assertTrue(ArrayUtils.contains(lArray, 1L));
        assertFalse(ArrayUtils.contains((long[]) null, 1L));

        // int
        int[] iArray = new int[]{1, 2, 3, 2};
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((int[]) null, 1));
        assertEquals(1, ArrayUtils.indexOf(iArray, 2, -1));
        assertEquals(3, ArrayUtils.indexOf(iArray, 2, 2));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(iArray, 9));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((int[]) null, 1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(iArray, 1, -1));
        assertEquals(3, ArrayUtils.lastIndexOf(iArray, 2, 10));
        assertEquals(1, ArrayUtils.lastIndexOf(iArray, 2, 2));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(iArray, 9));
        assertTrue(ArrayUtils.contains(iArray, 1));
        assertFalse(ArrayUtils.contains((int[]) null, 1));

        // short
        short[] sArray = new short[]{1, 2, 3, 2};
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((short[]) null, (short) 1));
        assertEquals(1, ArrayUtils.indexOf(sArray, (short) 2, -1));
        assertEquals(3, ArrayUtils.indexOf(sArray, (short) 2, 2));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(sArray, (short) 9));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((short[]) null, (short) 1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(sArray, (short) 1, -1));
        assertEquals(3, ArrayUtils.lastIndexOf(sArray, (short) 2, 10));
        assertEquals(1, ArrayUtils.lastIndexOf(sArray, (short) 2, 2));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(sArray, (short) 9));
        assertTrue(ArrayUtils.contains(sArray, (short) 1));
        assertFalse(ArrayUtils.contains((short[]) null, (short) 1));

        // char
        char[] cArray = new char[]{'a', 'b', 'c', 'b'};
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((char[]) null, 'a'));
        assertEquals(1, ArrayUtils.indexOf(cArray, 'b', -1));
        assertEquals(3, ArrayUtils.indexOf(cArray, 'b', 2));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(cArray, 'z'));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((char[]) null, 'a'));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(cArray, 'a', -1));
        assertEquals(3, ArrayUtils.lastIndexOf(cArray, 'b', 10));
        assertEquals(1, ArrayUtils.lastIndexOf(cArray, 'b', 2));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(cArray, 'z'));
        assertTrue(ArrayUtils.contains(cArray, 'a'));
        assertFalse(ArrayUtils.contains((char[]) null, 'a'));

        // byte
        byte[] bArray = new byte[]{1, 2, 3, 2};
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((byte[]) null, (byte) 1));
        assertEquals(1, ArrayUtils.indexOf(bArray, (byte) 2, -1));
        assertEquals(3, ArrayUtils.indexOf(bArray, (byte) 2, 2));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(bArray, (byte) 9));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((byte[]) null, (byte) 1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(bArray, (byte) 1, -1));
        assertEquals(3, ArrayUtils.lastIndexOf(bArray, (byte) 2, 10));
        assertEquals(1, ArrayUtils.lastIndexOf(bArray, (byte) 2, 2));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(bArray, (byte) 9));
        assertTrue(ArrayUtils.contains(bArray, (byte) 1));
        assertFalse(ArrayUtils.contains((byte[]) null, (byte) 1));

        // double
        double[] dArray = new double[]{1.0, 2.0, 3.0, 2.0};
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((double[]) null, 1.0));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new double[]{}, 1.0));
        assertEquals(1, ArrayUtils.indexOf(dArray, 2.0, -1));
        assertEquals(3, ArrayUtils.indexOf(dArray, 2.0, 2));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(dArray, 9.0));
        assertEquals(1, ArrayUtils.indexOf(dArray, 1.95, 0.1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(dArray, 9.0, 0, 0.1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((double[]) null, 1.0));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new double[]{}, 1.0));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(dArray, 1.0, -1));
        assertEquals(3, ArrayUtils.lastIndexOf(dArray, 2.0, 10));
        assertEquals(1, ArrayUtils.lastIndexOf(dArray, 2.0, 2));
        assertEquals(3, ArrayUtils.lastIndexOf(dArray, 2.05, 10, 0.1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(dArray, 9.0));
        assertTrue(ArrayUtils.contains(dArray, 1.0));
        assertTrue(ArrayUtils.contains(dArray, 1.05, 0.1));
        assertFalse(ArrayUtils.contains((double[]) null, 1.0));
        assertFalse(ArrayUtils.contains((double[]) null, 1.0, 0.1));

        // float
        float[] fArray = new float[]{1.0f, 2.0f, 3.0f, 2.0f};
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((float[]) null, 1.0f));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new float[]{}, 1.0f));
        assertEquals(1, ArrayUtils.indexOf(fArray, 2.0f, -1));
        assertEquals(3, ArrayUtils.indexOf(fArray, 2.0f, 2));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(fArray, 9.0f));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((float[]) null, 1.0f));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new float[]{}, 1.0f));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(fArray, 1.0f, -1));
        assertEquals(3, ArrayUtils.lastIndexOf(fArray, 2.0f, 10));
        assertEquals(1, ArrayUtils.lastIndexOf(fArray, 2.0f, 2));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(fArray, 9.0f));
        assertTrue(ArrayUtils.contains(fArray, 1.0f));
        assertFalse(ArrayUtils.contains((float[]) null, 1.0f));

        // boolean
        boolean[] boolArray = new boolean[]{true, false, true};
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((boolean[]) null, true));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new boolean[]{}, true));
        assertEquals(0, ArrayUtils.indexOf(boolArray, true, -1));
        assertEquals(2, ArrayUtils.indexOf(boolArray, true, 1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new boolean[]{false}, true));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((boolean[]) null, true));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new boolean[]{}, true));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(boolArray, true, -1));
        assertEquals(2, ArrayUtils.lastIndexOf(boolArray, true, 10));
        assertEquals(0, ArrayUtils.lastIndexOf(boolArray, true, 1));
        assertTrue(ArrayUtils.contains(boolArray, false));
        assertFalse(ArrayUtils.contains((boolean[]) null, false));
    }

    // -----------------------------------------------------------------------
    // toPrimitive & toObject
    // -----------------------------------------------------------------------
    @Test
    public void testToPrimitiveAndToObject() {
        // Character
        assertNull(ArrayUtils.toPrimitive((Character[]) null));
        assertArrayEquals(new char[]{}, ArrayUtils.toPrimitive(new Character[]{}));
        assertArrayEquals(new char[]{'a', 'b'}, ArrayUtils.toPrimitive(new Character[]{'a', 'b'}));
        assertArrayEquals(new char[]{'a', 'x'}, ArrayUtils.toPrimitive(new Character[]{'a', null}, 'x'));
        assertNull(ArrayUtils.toPrimitive((Character[]) null, 'x'));
        assertArrayEquals(new char[]{}, ArrayUtils.toPrimitive(new Character[]{}, 'x'));
        assertNull(ArrayUtils.toObject((char[]) null));
        assertArrayEquals(new Character[]{}, ArrayUtils.toObject(new char[]{}));
        assertArrayEquals(new Character[]{'a'}, ArrayUtils.toObject(new char[]{'a'}));

        // Long
        assertNull(ArrayUtils.toPrimitive((Long[]) null));
        assertArrayEquals(new long[]{}, ArrayUtils.toPrimitive(new Long[]{}));
        assertArrayEquals(new long[]{1L}, ArrayUtils.toPrimitive(new Long[]{1L}));
        assertArrayEquals(new long[]{1L, 0L}, ArrayUtils.toPrimitive(new Long[]{1L, null}, 0L));
        assertNull(ArrayUtils.toPrimitive((Long[]) null, 0L));
        assertArrayEquals(new long[]{}, ArrayUtils.toPrimitive(new Long[]{}, 0L));
        assertNull(ArrayUtils.toObject((long[]) null));
        assertArrayEquals(new Long[]{}, ArrayUtils.toObject(new long[]{}));
        assertArrayEquals(new Long[]{1L}, ArrayUtils.toObject(new long[]{1L}));

        // Integer
        assertNull(ArrayUtils.toPrimitive((Integer[]) null));
        assertArrayEquals(new int[]{}, ArrayUtils.toPrimitive(new Integer[]{}));
        assertArrayEquals(new int[]{1}, ArrayUtils.toPrimitive(new Integer[]{1}));
        assertArrayEquals(new int[]{1, 0}, ArrayUtils.toPrimitive(new Integer[]{1, null}, 0));
        assertNull(ArrayUtils.toPrimitive((Integer[]) null, 0));
        assertArrayEquals(new int[]{}, ArrayUtils.toPrimitive(new Integer[]{}, 0));
        assertNull(ArrayUtils.toObject((int[]) null));
        assertArrayEquals(new Integer[]{}, ArrayUtils.toObject(new int[]{}));
        assertArrayEquals(new Integer[]{1}, ArrayUtils.toObject(new int[]{1}));

        // Short
        assertNull(ArrayUtils.toPrimitive((Short[]) null));
        assertArrayEquals(new short[]{}, ArrayUtils.toPrimitive(new Short[]{}));
        assertArrayEquals(new short[]{1}, ArrayUtils.toPrimitive(new Short[]{1}));
        assertArrayEquals(new short[]{1, 0}, ArrayUtils.toPrimitive(new Short[]{1, null}, (short) 0));
        assertNull(ArrayUtils.toPrimitive((Short[]) null, (short) 0));
        assertArrayEquals(new short[]{}, ArrayUtils.toPrimitive(new Short[]{}, (short) 0));
        assertNull(ArrayUtils.toObject((short[]) null));
        assertArrayEquals(new Short[]{}, ArrayUtils.toObject(new short[]{}));
        assertArrayEquals(new Short[]{1}, ArrayUtils.toObject(new short[]{1}));

        // Byte
        assertNull(ArrayUtils.toPrimitive((Byte[]) null));
        assertArrayEquals(new byte[]{}, ArrayUtils.toPrimitive(new Byte[]{}));
        assertArrayEquals(new byte[]{1}, ArrayUtils.toPrimitive(new Byte[]{1}));
        assertArrayEquals(new byte[]{1, 0}, ArrayUtils.toPrimitive(new Byte[]{1, null}, (byte) 0));
        assertNull(ArrayUtils.toPrimitive((Byte[]) null, (byte) 0));
        assertArrayEquals(new byte[]{}, ArrayUtils.toPrimitive(new Byte[]{}, (byte) 0));
        assertNull(ArrayUtils.toObject((byte[]) null));
        assertArrayEquals(new Byte[]{}, ArrayUtils.toObject(new byte[]{}));
        assertArrayEquals(new Byte[]{1}, ArrayUtils.toObject(new byte[]{1}));

        // Double
        assertNull(ArrayUtils.toPrimitive((Double[]) null));
        assertArrayEquals(new double[]{}, ArrayUtils.toPrimitive(new Double[]{}), 0.0);
        assertArrayEquals(new double[]{1.0}, ArrayUtils.toPrimitive(new Double[]{1.0}), 0.0);
        assertArrayEquals(new double[]{1.0, 0.0}, ArrayUtils.toPrimitive(new Double[]{1.0, null}, 0.0), 0.0);
        assertNull(ArrayUtils.toPrimitive((Double[]) null, 0.0));
        assertArrayEquals(new double[]{}, ArrayUtils.toPrimitive(new Double[]{}, 0.0), 0.0);
        assertNull(ArrayUtils.toObject((double[]) null));
        assertArrayEquals(new Double[]{}, ArrayUtils.toObject(new double[]{}));
        assertArrayEquals(new Double[]{1.0}, ArrayUtils.toObject(new double[]{1.0}));

        // Float
        assertNull(ArrayUtils.toPrimitive((Float[]) null));
        assertArrayEquals(new float[]{}, ArrayUtils.toPrimitive(new Float[]{}), 0.0f);
        assertArrayEquals(new float[]{1.0f}, ArrayUtils.toPrimitive(new Float[]{1.0f}), 0.0f);
        assertArrayEquals(new float[]{1.0f, 0.0f}, ArrayUtils.toPrimitive(new Float[]{1.0f, null}, 0.0f), 0.0f);
        assertNull(ArrayUtils.toPrimitive((Float[]) null, 0.0f));
        assertArrayEquals(new float[]{}, ArrayUtils.toPrimitive(new Float[]{}, 0.0f), 0.0f);
        assertNull(ArrayUtils.toObject((float[]) null));
        assertArrayEquals(new Float[]{}, ArrayUtils.toObject(new float[]{}));
        assertArrayEquals(new Float[]{1.0f}, ArrayUtils.toObject(new float[]{1.0f}));

        // Boolean
        assertNull(ArrayUtils.toPrimitive((Boolean[]) null));
        assertArrayEquals(new boolean[]{}, ArrayUtils.toPrimitive(new Boolean[]{}));
        assertArrayEquals(new boolean[]{true}, ArrayUtils.toPrimitive(new Boolean[]{Boolean.TRUE}));
        assertArrayEquals(new boolean[]{true, false}, ArrayUtils.toPrimitive(new Boolean[]{Boolean.TRUE, null}, false));
        assertNull(ArrayUtils.toPrimitive((Boolean[]) null, false));
        assertArrayEquals(new boolean[]{}, ArrayUtils.toPrimitive(new Boolean[]{}, false));
        assertNull(ArrayUtils.toObject((boolean[]) null));
        assertArrayEquals(new Boolean[]{}, ArrayUtils.toObject(new boolean[]{}));
        assertArrayEquals(new Boolean[]{Boolean.TRUE, Boolean.FALSE}, ArrayUtils.toObject(new boolean[]{true, false}));
    }

    @Test(expected = NullPointerException.class)
    public void testToPrimitiveNullElementThrowsNPE() {
        ArrayUtils.toPrimitive(new Integer[]{null});
    }

    // -----------------------------------------------------------------------
    // isEmpty
    // -----------------------------------------------------------------------
    @Test
    public void testIsEmpty() {
        assertTrue(ArrayUtils.isEmpty((Object[]) null));
        assertTrue(ArrayUtils.isEmpty(new Object[0]));
        assertFalse(ArrayUtils.isEmpty(new Object[1]));

        assertTrue(ArrayUtils.isEmpty((long[]) null));
        assertTrue(ArrayUtils.isEmpty(new long[0]));
        assertFalse(ArrayUtils.isEmpty(new long[1]));

        assertTrue(ArrayUtils.isEmpty((int[]) null));
        assertTrue(ArrayUtils.isEmpty(new int[0]));
        assertFalse(ArrayUtils.isEmpty(new int[1]));

        assertTrue(ArrayUtils.isEmpty((short[]) null));
        assertTrue(ArrayUtils.isEmpty(new short[0]));
        assertFalse(ArrayUtils.isEmpty(new short[1]));

        assertTrue(ArrayUtils.isEmpty((char[]) null));
        assertTrue(ArrayUtils.isEmpty(new char[0]));
        assertFalse(ArrayUtils.isEmpty(new char[1]));

        assertTrue(ArrayUtils.isEmpty((byte[]) null));
        assertTrue(ArrayUtils.isEmpty(new byte[0]));
        assertFalse(ArrayUtils.isEmpty(new byte[1]));

        assertTrue(ArrayUtils.isEmpty((double[]) null));
        assertTrue(ArrayUtils.isEmpty(new double[0]));
        assertFalse(ArrayUtils.isEmpty(new double[1]));

        assertTrue(ArrayUtils.isEmpty((float[]) null));
        assertTrue(ArrayUtils.isEmpty(new float[0]));
        assertFalse(ArrayUtils.isEmpty(new float[1]));

        assertTrue(ArrayUtils.isEmpty((boolean[]) null));
        assertTrue(ArrayUtils.isEmpty(new boolean[0]));
        assertFalse(ArrayUtils.isEmpty(new boolean[1]));
    }

    // -----------------------------------------------------------------------
    // addAll
    // -----------------------------------------------------------------------
    @Test
    public void testAddAll() {
        assertNull(ArrayUtils.addAll((String[]) null, (String[]) null));
        assertArrayEquals(new String[]{"a"}, ArrayUtils.addAll(new String[]{"a"}, (String[]) null));
        assertArrayEquals(new String[]{"b"}, ArrayUtils.addAll((String[]) null, new String[]{"b"}));
        assertArrayEquals(new String[]{"a", "b"}, ArrayUtils.addAll(new String[]{"a"}, new String[]{"b"}));

        assertArrayEquals(new boolean[]{true, false}, ArrayUtils.addAll(new boolean[]{true}, new boolean[]{false}));
        assertArrayEquals(new boolean[]{true}, ArrayUtils.addAll(new boolean[]{true}, (boolean[]) null));
        assertArrayEquals(new boolean[]{false}, ArrayUtils.addAll((boolean[]) null, new boolean[]{false}));

        assertArrayEquals(new char[]{'a', 'b'}, ArrayUtils.addAll(new char[]{'a'}, new char[]{'b'}));
        assertArrayEquals(new char[]{'a'}, ArrayUtils.addAll(new char[]{'a'}, (char[]) null));
        assertArrayEquals(new char[]{'b'}, ArrayUtils.addAll((char[]) null, new char[]{'b'}));

        assertArrayEquals(new byte[]{1, 2}, ArrayUtils.addAll(new byte[]{1}, new byte[]{2}));
        assertArrayEquals(new byte[]{1}, ArrayUtils.addAll(new byte[]{1}, (byte[]) null));
        assertArrayEquals(new byte[]{2}, ArrayUtils.addAll((byte[]) null, new byte[]{2}));

        assertArrayEquals(new short[]{1, 2}, ArrayUtils.addAll(new short[]{1}, new short[]{2}));
        assertArrayEquals(new short[]{1}, ArrayUtils.addAll(new short[]{1}, (short[]) null));
        assertArrayEquals(new short[]{2}, ArrayUtils.addAll((short[]) null, new short[]{2}));

        assertArrayEquals(new int[]{1, 2}, ArrayUtils.addAll(new int[]{1}, new int[]{2}));
        assertArrayEquals(new int[]{1}, ArrayUtils.addAll(new int[]{1}, (int[]) null));
        assertArrayEquals(new int[]{2}, ArrayUtils.addAll((int[]) null, new int[]{2}));

        assertArrayEquals(new long[]{1L, 2L}, ArrayUtils.addAll(new long[]{1L}, new long[]{2L}));
        assertArrayEquals(new long[]{1L}, ArrayUtils.addAll(new long[]{1L}, (long[]) null));
        assertArrayEquals(new long[]{2L}, ArrayUtils.addAll((long[]) null, new long[]{2L}));

        assertArrayEquals(new float[]{1.0f, 2.0f}, ArrayUtils.addAll(new float[]{1.0f}, new float[]{2.0f}), 0.0f);
        assertArrayEquals(new float[]{1.0f}, ArrayUtils.addAll(new float[]{1.0f}, (float[]) null), 0.0f);
        assertArrayEquals(new float[]{2.0f}, ArrayUtils.addAll((float[]) null, new float[]{2.0f}), 0.0f);

        assertArrayEquals(new double[]{1.0, 2.0}, ArrayUtils.addAll(new double[]{1.0}, new double[]{2.0}), 0.0);
        assertArrayEquals(new double[]{1.0}, ArrayUtils.addAll(new double[]{1.0}, (double[]) null), 0.0);
        assertArrayEquals(new double[]{2.0}, ArrayUtils.addAll((double[]) null, new double[]{2.0}), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAllIncompatibleTypes() {
        String[] strArr = new String[]{"a"};
        Integer[] intArr = new Integer[]{1};
        ArrayUtils.addAll((Object[]) strArr, (Object[]) intArr);
    }

    // -----------------------------------------------------------------------
    // add & Lang-35 Bug reproduction
    // -----------------------------------------------------------------------
    @Test
    public void testAddObject() {
        String[] nullArray = null;
        String[] res1 = ArrayUtils.add(nullArray, "a");
        assertArrayEquals(new String[]{"a"}, res1);
        assertEquals(String[].class, res1.getClass());

        String[] res2 = ArrayUtils.add(new String[]{"a"}, "b");
        assertArrayEquals(new String[]{"a", "b"}, res2);

        String[] res3 = ArrayUtils.add(new String[]{"a"}, null);
        assertArrayEquals(new String[]{"a", null}, res3);
        assertEquals(String[].class, res3.getClass());

        Object[] res4 = ArrayUtils.add((Object[]) null, (Object) null);
        assertArrayEquals(new Object[]{null}, res4);
    }

    @Test
    public void testAddObjectAtIndex() {
        assertArrayEquals(new String[]{"a"}, ArrayUtils.add((String[]) null, 0, "a"));
        assertArrayEquals(new String[]{"a", "b"}, ArrayUtils.add(new String[]{"b"}, 0, "a"));
        assertArrayEquals(new String[]{"a", "b"}, ArrayUtils.add(new String[]{"a"}, 1, "b"));
        assertArrayEquals(new String[]{"a", "x", "b"}, ArrayUtils.add(new String[]{"a", "b"}, 1, "x"));
        assertArrayEquals(new Object[]{null}, ArrayUtils.add((Object[]) null, 0, (Object) null));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddObjectAtIndexOutOfBoundsNullArray() {
        ArrayUtils.add((String[]) null, 1, "a");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddObjectAtIndexNegative() {
        ArrayUtils.add(new String[]{"a"}, -1, "b");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddObjectAtIndexTooHigh() {
        ArrayUtils.add(new String[]{"a"}, 2, "b");
    }

    @Test
    public void testAddPrimitives() {
        assertArrayEquals(new boolean[]{true}, ArrayUtils.add((boolean[]) null, true));
        assertArrayEquals(new boolean[]{true, false}, ArrayUtils.add(new boolean[]{true}, false));
        assertArrayEquals(new boolean[]{false, true}, ArrayUtils.add(new boolean[]{true}, 0, false));

        assertArrayEquals(new byte[]{1}, ArrayUtils.add((byte[]) null, (byte) 1));
        assertArrayEquals(new byte[]{1, 2}, ArrayUtils.add(new byte[]{1}, (byte) 2));
        assertArrayEquals(new byte[]{2, 1}, ArrayUtils.add(new byte[]{1}, 0, (byte) 2));

        assertArrayEquals(new char[]{'a'}, ArrayUtils.add((char[]) null, 'a'));
        assertArrayEquals(new char[]{'a', 'b'}, ArrayUtils.add(new char[]{'a'}, 'b'));
        assertArrayEquals(new char[]{'b', 'a'}, ArrayUtils.add(new char[]{'a'}, 0, 'b'));

        assertArrayEquals(new double[]{1.0}, ArrayUtils.add((double[]) null, 1.0), 0.0);
        assertArrayEquals(new double[]{1.0, 2.0}, ArrayUtils.add(new double[]{1.0}, 2.0), 0.0);
        assertArrayEquals(new double[]{2.0, 1.0}, ArrayUtils.add(new double[]{1.0}, 0, 2.0), 0.0);

        assertArrayEquals(new float[]{1.0f}, ArrayUtils.add((float[]) null, 1.0f), 0.0f);
        assertArrayEquals(new float[]{1.0f, 2.0f}, ArrayUtils.add(new float[]{1.0f}, 2.0f), 0.0f);
        assertArrayEquals(new float[]{2.0f, 1.0f}, ArrayUtils.add(new float[]{1.0f}, 0, 2.0f), 0.0f);

        assertArrayEquals(new int[]{1}, ArrayUtils.add((int[]) null, 1));
        assertArrayEquals(new int[]{1, 2}, ArrayUtils.add(new int[]{1}, 2));
        assertArrayEquals(new int[]{2, 1}, ArrayUtils.add(new int[]{1}, 0, 2));

        assertArrayEquals(new long[]{1L}, ArrayUtils.add((long[]) null, 1L));
        assertArrayEquals(new long[]{1L, 2L}, ArrayUtils.add(new long[]{1L}, 2L));
        assertArrayEquals(new long[]{2L, 1L}, ArrayUtils.add(new long[]{1L}, 0, 2L));

        assertArrayEquals(new short[]{1}, ArrayUtils.add((short[]) null, (short) 1));
        assertArrayEquals(new short[]{1, 2}, ArrayUtils.add(new short[]{1}, (short) 2));
        assertArrayEquals(new short[]{2, 1}, ArrayUtils.add(new short[]{1}, 0, (short) 2));
    }

    // -----------------------------------------------------------------------
    // remove & removeElement
    // -----------------------------------------------------------------------
    @Test
    public void testRemoveObject() {
        String[] array = new String[]{"a", "b", "c"};
        assertArrayEquals(new String[]{"b", "c"}, ArrayUtils.remove(array, 0));
        assertArrayEquals(new String[]{"a", "c"}, ArrayUtils.remove(array, 1));
        assertArrayEquals(new String[]{"a", "b"}, ArrayUtils.remove(array, 2));

        assertNull(ArrayUtils.removeElement((String[]) null, "a"));
        assertArrayEquals(new String[]{"a", "b", "c"}, ArrayUtils.removeElement(array, "x"));
        assertArrayEquals(new String[]{"b", "c"}, ArrayUtils.removeElement(array, "a"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveNullArray() {
        ArrayUtils.remove((String[]) null, 0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveNegativeIndex() {
        ArrayUtils.remove(new String[]{"a"}, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveIndexEqualsLength() {
        ArrayUtils.remove(new String[]{"a"}, 1);
    }

    @Test
    public void testRemovePrimitives() {
        // boolean
        boolean[] boolArr = new boolean[]{true, false, true};
        assertArrayEquals(new boolean[]{false, true}, ArrayUtils.remove(boolArr, 0));
        assertNull(ArrayUtils.removeElement((boolean[]) null, true));
        assertArrayEquals(new boolean[]{false, true}, ArrayUtils.removeElement(boolArr, true));
        assertArrayEquals(new boolean[]{true, true}, ArrayUtils.removeElement(new boolean[]{true, true}, false));

        // byte
        byte[] byteArr = new byte[]{1, 2, 3};
        assertArrayEquals(new byte[]{2, 3}, ArrayUtils.remove(byteArr, 0));
        assertNull(ArrayUtils.removeElement((byte[]) null, (byte) 1));
        assertArrayEquals(new byte[]{2, 3}, ArrayUtils.removeElement(byteArr, (byte) 1));
        assertArrayEquals(new byte[]{1, 2, 3}, ArrayUtils.removeElement(byteArr, (byte) 9));

        // char
        char[] charArr = new char[]{'a', 'b', 'c'};
        assertArrayEquals(new char[]{'b', 'c'}, ArrayUtils.remove(charArr, 0));
        assertNull(ArrayUtils.removeElement((char[]) null, 'a'));
        assertArrayEquals(new char[]{'b', 'c'}, ArrayUtils.removeElement(charArr, 'a'));
        assertArrayEquals(new char[]{'a', 'b', 'c'}, ArrayUtils.removeElement(charArr, 'z'));

        // double
        double[] doubleArr = new double[]{1.0, 2.0, 3.0};
        assertArrayEquals(new double[]{2.0, 3.0}, ArrayUtils.remove(doubleArr, 0), 0.0);
        assertNull(ArrayUtils.removeElement((double[]) null, 1.0));
        assertArrayEquals(new double[]{2.0, 3.0}, ArrayUtils.removeElement(doubleArr, 1.0), 0.0);
        assertArrayEquals(new double[]{1.0, 2.0, 3.0}, ArrayUtils.removeElement(doubleArr, 9.0), 0.0);

        // float
        float[] floatArr = new float[]{1.0f, 2.0f, 3.0f};
        assertArrayEquals(new float[]{2.0f, 3.0f}, ArrayUtils.remove(floatArr, 0), 0.0f);
        assertNull(ArrayUtils.removeElement((float[]) null, 1.0f));
        assertArrayEquals(new float[]{2.0f, 3.0f}, ArrayUtils.removeElement(floatArr, 1.0f), 0.0f);
        assertArrayEquals(new float[]{1.0f, 2.0f, 3.0f}, ArrayUtils.removeElement(floatArr, 9.0f), 0.0f);

        // int
        int[] intArr = new int[]{1, 2, 3};
        assertArrayEquals(new int[]{2, 3}, ArrayUtils.remove(intArr, 0));
        assertNull(ArrayUtils.removeElement((int[]) null, 1));
        assertArrayEquals(new int[]{2, 3}, ArrayUtils.removeElement(intArr, 1));
        assertArrayEquals(new int[]{1, 2, 3}, ArrayUtils.removeElement(intArr, 9));

        // long
        long[] longArr = new long[]{1L, 2L, 3L};
        assertArrayEquals(new long[]{2L, 3L}, ArrayUtils.remove(longArr, 0));
        assertNull(ArrayUtils.removeElement((long[]) null, 1L));
        assertArrayEquals(new long[]{2L, 3L}, ArrayUtils.removeElement(longArr, 1L));
        assertArrayEquals(new long[]{1L, 2L, 3L}, ArrayUtils.removeElement(longArr, 9L));

        // short
        short[] shortArr = new short[]{1, 2, 3};
        assertArrayEquals(new short[]{2, 3}, ArrayUtils.remove(shortArr, 0));
        assertNull(ArrayUtils.removeElement((short[]) null, (short) 1));
        assertArrayEquals(new short[]{2, 3}, ArrayUtils.removeElement(shortArr, (short) 1));
        assertArrayEquals(new short[]{1, 2, 3}, ArrayUtils.removeElement(shortArr, (short) 9));
    }
}
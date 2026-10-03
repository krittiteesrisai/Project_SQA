package org.apache.commons.lang3;

import org.junit.Test;

import java.util.AbstractMap;
import java.util.Date;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * High coverage JUnit 4 test suite for {@link ArrayUtils}.
 */
public class ArrayUtilsTest {

    // -----------------------------------------------------------------------
    // Constructor & toString & isEquals & getLength & isSameType
    // -----------------------------------------------------------------------

    @Test
    public void testConstructor() {
        assertNotNull(new ArrayUtils());
    }

    @Test
    public void testToString() {
        assertEquals("{}", ArrayUtils.toString(null));
        assertEquals("default", ArrayUtils.toString(null, "default"));
        assertEquals("{1,2}", ArrayUtils.toString(new int[]{1, 2}));
        assertEquals("{a,b}", ArrayUtils.toString(new String[]{"a", "b"}, "default"));
    }

    @Test
    public void testIsEquals() {
        assertTrue(ArrayUtils.isEquals(null, null));
        assertFalse(ArrayUtils.isEquals(new int[]{1}, null));
        assertFalse(ArrayUtils.isEquals(null, new int[]{1}));
        assertTrue(ArrayUtils.isEquals(new int[]{1, 2}, new int[]{1, 2}));
        assertFalse(ArrayUtils.isEquals(new int[]{1, 2}, new int[]{1, 3}));
        assertTrue(ArrayUtils.isEquals(new String[][]{{"a"}, {"b"}}, new String[][]{{"a"}, {"b"}}));
    }

    @Test
    public void testGetLength() {
        assertEquals(0, ArrayUtils.getLength(null));
        assertEquals(0, ArrayUtils.getLength(new Object[0]));
        assertEquals(2, ArrayUtils.getLength(new int[]{1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLength_NotArray() {
        ArrayUtils.getLength("Not an array");
    }

    @Test
    public void testIsSameType() {
        assertTrue(ArrayUtils.isSameType(new int[]{1}, new int[]{2}));
        assertFalse(ArrayUtils.isSameType(new int[]{1}, new long[]{2}));
        assertTrue(ArrayUtils.isSameType(new String[]{"a"}, new String[]{"b"}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameType_NullFirst() {
        ArrayUtils.isSameType(null, new int[]{1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameType_NullSecond() {
        ArrayUtils.isSameType(new int[]{1}, null);
    }

    // -----------------------------------------------------------------------
    // toMap
    // -----------------------------------------------------------------------

    @Test
    public void testToMap_Success() {
        assertNull(ArrayUtils.toMap(null));
        
        Map.Entry<String, String> entry = new AbstractMap.SimpleEntry<String, String>("k1", "v1");
        Object[] input = new Object[]{
                entry,
                new Object[]{"k2", "v2"}
        };
        Map<Object, Object> map = ArrayUtils.toMap(input);
        assertNotNull(map);
        assertEquals("v1", map.get("k1"));
        assertEquals("v2", map.get("k2"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToMap_ShortSubArray() {
        ArrayUtils.toMap(new Object[]{new Object[]{"onlyKey"}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToMap_InvalidElementType() {
        ArrayUtils.toMap(new Object[]{"InvalidStringElement"});
    }

    // -----------------------------------------------------------------------
    // clone
    // -----------------------------------------------------------------------

    @Test
    public void testClone_AllTypes() {
        assertNull(ArrayUtils.clone((Object[]) null));
        String[] strArr = new String[]{"a", "b"};
        assertArrayEquals(strArr, ArrayUtils.clone(strArr));
        assertNotSame(strArr, ArrayUtils.clone(strArr));

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
    public void testSubarray_Object() {
        assertNull(ArrayUtils.subarray((String[]) null, 0, 1));
        String[] array = new String[]{"a", "b", "c", "d"};
        
        assertArrayEquals(new String[]{"b", "c"}, ArrayUtils.subarray(array, 1, 3));
        assertArrayEquals(new String[]{"a", "b"}, ArrayUtils.subarray(array, -1, 2));
        assertArrayEquals(new String[]{"c", "d"}, ArrayUtils.subarray(array, 2, 10));
        assertArrayEquals(new String[0], ArrayUtils.subarray(array, 3, 2));
        assertArrayEquals(new String[0], ArrayUtils.subarray(array, 5, 6));
    }

    @Test
    public void testSubarray_Primitives() {
        assertNull(ArrayUtils.subarray((long[]) null, 0, 1));
        assertArrayEquals(new long[]{2L}, ArrayUtils.subarray(new long[]{1L, 2L, 3L}, 1, 2));
        assertArrayEquals(new long[0], ArrayUtils.subarray(new long[]{1L, 2L}, 2, 1));
        assertArrayEquals(new long[]{1L, 2L}, ArrayUtils.subarray(new long[]{1L, 2L}, -1, 5));

        assertNull(ArrayUtils.subarray((int[]) null, 0, 1));
        assertArrayEquals(new int[]{2}, ArrayUtils.subarray(new int[]{1, 2, 3}, 1, 2));
        assertArrayEquals(new int[0], ArrayUtils.subarray(new int[]{1, 2}, 2, 1));

        assertNull(ArrayUtils.subarray((short[]) null, 0, 1));
        assertArrayEquals(new short[]{2}, ArrayUtils.subarray(new short[]{1, 2, 3}, 1, 2));
        assertArrayEquals(new short[0], ArrayUtils.subarray(new short[]{1, 2}, 2, 1));

        assertNull(ArrayUtils.subarray((char[]) null, 0, 1));
        assertArrayEquals(new char[]{'b'}, ArrayUtils.subarray(new char[]{'a', 'b', 'c'}, 1, 2));
        assertArrayEquals(new char[0], ArrayUtils.subarray(new char[]{'a', 'b'}, 2, 1));

        assertNull(ArrayUtils.subarray((byte[]) null, 0, 1));
        assertArrayEquals(new byte[]{2}, ArrayUtils.subarray(new byte[]{1, 2, 3}, 1, 2));
        assertArrayEquals(new byte[0], ArrayUtils.subarray(new byte[]{1, 2}, 2, 1));

        assertNull(ArrayUtils.subarray((double[]) null, 0, 1));
        assertArrayEquals(new double[]{2.0}, ArrayUtils.subarray(new double[]{1.0, 2.0, 3.0}, 1, 2), 0.0);
        assertArrayEquals(new double[0], ArrayUtils.subarray(new double[]{1.0, 2.0}, 2, 1), 0.0);

        assertNull(ArrayUtils.subarray((float[]) null, 0, 1));
        assertArrayEquals(new float[]{2.0f}, ArrayUtils.subarray(new float[]{1.0f, 2.0f, 3.0f}, 1, 2), 0.0f);
        assertArrayEquals(new float[0], ArrayUtils.subarray(new float[]{1.0f, 2.0f}, 2, 1), 0.0f);

        assertNull(ArrayUtils.subarray((boolean[]) null, 0, 1));
        assertArrayEquals(new boolean[]{false}, ArrayUtils.subarray(new boolean[]{true, false, true}, 1, 2));
        assertArrayEquals(new boolean[0], ArrayUtils.subarray(new boolean[]{true, false}, 2, 1));
    }

    // -----------------------------------------------------------------------
    // isSameLength
    // -----------------------------------------------------------------------

    @Test
    public void testIsSameLength() {
        assertTrue(ArrayUtils.isSameLength((Object[]) null, (Object[]) null));
        assertTrue(ArrayUtils.isSameLength(new Object[0], (Object[]) null));
        assertTrue(ArrayUtils.isSameLength((Object[]) null, new Object[0]));
        assertFalse(ArrayUtils.isSameLength(new Object[]{1}, (Object[]) null));
        assertFalse(ArrayUtils.isSameLength((Object[]) null, new Object[]{1}));
        assertTrue(ArrayUtils.isSameLength(new Object[]{1}, new Object[]{2}));
        assertFalse(ArrayUtils.isSameLength(new Object[]{1}, new Object[]{1, 2}));

        assertTrue(ArrayUtils.isSameLength((long[]) null, (long[]) null));
        assertFalse(ArrayUtils.isSameLength(new long[]{1L}, (long[]) null));
        assertFalse(ArrayUtils.isSameLength((long[]) null, new long[]{1L}));
        assertTrue(ArrayUtils.isSameLength(new long[]{1L}, new long[]{2L}));
        assertFalse(ArrayUtils.isSameLength(new long[]{1L}, new long[]{1L, 2L}));

        assertTrue(ArrayUtils.isSameLength((int[]) null, (int[]) null));
        assertFalse(ArrayUtils.isSameLength(new int[]{1}, (int[]) null));
        assertFalse(ArrayUtils.isSameLength((int[]) null, new int[]{1}));
        assertTrue(ArrayUtils.isSameLength(new int[]{1}, new int[]{2}));

        assertTrue(ArrayUtils.isSameLength((short[]) null, (short[]) null));
        assertFalse(ArrayUtils.isSameLength(new short[]{1}, (short[]) null));
        assertFalse(ArrayUtils.isSameLength((short[]) null, new short[]{1}));
        assertTrue(ArrayUtils.isSameLength(new short[]{1}, new short[]{2}));

        assertTrue(ArrayUtils.isSameLength((char[]) null, (char[]) null));
        assertFalse(ArrayUtils.isSameLength(new char[]{'a'}, (char[]) null));
        assertFalse(ArrayUtils.isSameLength((char[]) null, new char[]{'a'}));
        assertTrue(ArrayUtils.isSameLength(new char[]{'a'}, new char[]{'b'}));

        assertTrue(ArrayUtils.isSameLength((byte[]) null, (byte[]) null));
        assertFalse(ArrayUtils.isSameLength(new byte[]{1}, (byte[]) null));
        assertFalse(ArrayUtils.isSameLength((byte[]) null, new byte[]{1}));
        assertTrue(ArrayUtils.isSameLength(new byte[]{1}, new byte[]{2}));

        assertTrue(ArrayUtils.isSameLength((double[]) null, (double[]) null));
        assertFalse(ArrayUtils.isSameLength(new double[]{1.0}, (double[]) null));
        assertFalse(ArrayUtils.isSameLength((double[]) null, new double[]{1.0}));
        assertTrue(ArrayUtils.isSameLength(new double[]{1.0}, new double[]{2.0}));

        assertTrue(ArrayUtils.isSameLength((float[]) null, (float[]) null));
        assertFalse(ArrayUtils.isSameLength(new float[]{1.0f}, (float[]) null));
        assertFalse(ArrayUtils.isSameLength((float[]) null, new float[]{1.0f}));
        assertTrue(ArrayUtils.isSameLength(new float[]{1.0f}, new float[]{2.0f}));

        assertTrue(ArrayUtils.isSameLength((boolean[]) null, (boolean[]) null));
        assertFalse(ArrayUtils.isSameLength(new boolean[]{true}, (boolean[]) null));
        assertFalse(ArrayUtils.isSameLength((boolean[]) null, new boolean[]{true}));
        assertTrue(ArrayUtils.isSameLength(new boolean[]{true}, new boolean[]{false}));
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

        ArrayUtils.reverse((long[]) null);
        long[] longArr = new long[]{1L, 2L};
        ArrayUtils.reverse(longArr);
        assertArrayEquals(new long[]{2L, 1L}, longArr);

        ArrayUtils.reverse((int[]) null);
        int[] intArr = new int[]{1, 2, 3};
        ArrayUtils.reverse(intArr);
        assertArrayEquals(new int[]{3, 2, 1}, intArr);

        ArrayUtils.reverse((short[]) null);
        short[] shortArr = new short[]{1, 2};
        ArrayUtils.reverse(shortArr);
        assertArrayEquals(new short[]{2, 1}, shortArr);

        ArrayUtils.reverse((char[]) null);
        char[] charArr = new char[]{'a', 'b'};
        ArrayUtils.reverse(charArr);
        assertArrayEquals(new char[]{'b', 'a'}, charArr);

        ArrayUtils.reverse((byte[]) null);
        byte[] byteArr = new byte[]{1, 2};
        ArrayUtils.reverse(byteArr);
        assertArrayEquals(new byte[]{2, 1}, byteArr);

        ArrayUtils.reverse((double[]) null);
        double[] doubleArr = new double[]{1.0, 2.0};
        ArrayUtils.reverse(doubleArr);
        assertArrayEquals(new double[]{2.0, 1.0}, doubleArr, 0.0);

        ArrayUtils.reverse((float[]) null);
        float[] floatArr = new float[]{1.0f, 2.0f};
        ArrayUtils.reverse(floatArr);
        assertArrayEquals(new float[]{2.0f, 1.0f}, floatArr, 0.0f);

        ArrayUtils.reverse((boolean[]) null);
        boolean[] boolArr = new boolean[]{true, false};
        ArrayUtils.reverse(boolArr);
        assertArrayEquals(new boolean[]{false, true}, boolArr);
    }

    // -----------------------------------------------------------------------
    // indexOf, lastIndexOf, contains
    // -----------------------------------------------------------------------

    @Test
    public void testIndexOf_Object() {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((Object[]) null, "a"));
        String[] arr = new String[]{"a", null, "b", "a"};
        
        assertEquals(0, ArrayUtils.indexOf(arr, "a"));
        assertEquals(1, ArrayUtils.indexOf(arr, null));
        assertEquals(3, ArrayUtils.indexOf(arr, "a", 1));
        assertEquals(0, ArrayUtils.indexOf(arr, "a", -10));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(arr, "c"));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(arr, Integer.valueOf(1))); // Component type mismatch
        
        assertEquals(3, ArrayUtils.lastIndexOf(arr, "a"));
        assertEquals(1, ArrayUtils.lastIndexOf(arr, null));
        assertEquals(0, ArrayUtils.lastIndexOf(arr, "a", 2));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(arr, "a", -1));
        assertEquals(3, ArrayUtils.lastIndexOf(arr, "a", 10));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(arr, "c"));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(arr, Integer.valueOf(1)));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((Object[]) null, "a"));

        assertTrue(ArrayUtils.contains(arr, "b"));
        assertFalse(ArrayUtils.contains(arr, "z"));
        assertFalse(ArrayUtils.contains((Object[]) null, "a"));
    }

    @Test
    public void testIndexOf_DoubleWithTolerance() {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((double[]) null, 1.0, 0.1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new double[0], 1.0, 0.1));
        
        double[] arr = new double[]{1.0, 2.0, 3.0, 2.0};
        assertEquals(1, ArrayUtils.indexOf(arr, 2.05, 0.1));
        assertEquals(1, ArrayUtils.indexOf(arr, 2.05, -1, 0.1));
        assertEquals(3, ArrayUtils.indexOf(arr, 2.05, 2, 0.1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(arr, 5.0, 0.1));

        assertEquals(3, ArrayUtils.lastIndexOf(arr, 2.05, 0.1));
        assertEquals(1, ArrayUtils.lastIndexOf(arr, 2.05, 2, 0.1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(arr, 2.05, -1, 0.1));
        assertEquals(3, ArrayUtils.lastIndexOf(arr, 2.05, 10, 0.1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((double[]) null, 1.0, 0.1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new double[0], 1.0, 0.1));

        assertTrue(ArrayUtils.contains(arr, 2.05, 0.1));
        assertFalse(ArrayUtils.contains(arr, 5.0, 0.1));
        assertFalse(ArrayUtils.contains((double[]) null, 1.0, 0.1));
    }

    @Test
    public void testIndexOf_Primitives() {
        long[] longArr = new long[]{10L, 20L, 10L};
        assertEquals(0, ArrayUtils.indexOf(longArr, 10L, -1));
        assertEquals(2, ArrayUtils.lastIndexOf(longArr, 10L, 5));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(longArr, 10L, -1));
        assertTrue(ArrayUtils.contains(longArr, 20L));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((long[]) null, 1L));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((long[]) null, 1L));

        int[] intArr = new int[]{10, 20, 10};
        assertEquals(0, ArrayUtils.indexOf(intArr, 10, -1));
        assertEquals(2, ArrayUtils.lastIndexOf(intArr, 10, 5));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(intArr, 10, -1));
        assertTrue(ArrayUtils.contains(intArr, 20));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((int[]) null, 1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((int[]) null, 1));

        short[] shortArr = new short[]{10, 20, 10};
        assertEquals(0, ArrayUtils.indexOf(shortArr, (short) 10, -1));
        assertEquals(2, ArrayUtils.lastIndexOf(shortArr, (short) 10, 5));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(shortArr, (short) 10, -1));
        assertTrue(ArrayUtils.contains(shortArr, (short) 20));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((short[]) null, (short) 1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((short[]) null, (short) 1));

        char[] charArr = new char[]{'a', 'b', 'a'};
        assertEquals(0, ArrayUtils.indexOf(charArr, 'a', -1));
        assertEquals(2, ArrayUtils.lastIndexOf(charArr, 'a', 5));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(charArr, 'a', -1));
        assertTrue(ArrayUtils.contains(charArr, 'b'));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((char[]) null, 'a'));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((char[]) null, 'a'));

        byte[] byteArr = new byte[]{1, 2, 1};
        assertEquals(0, ArrayUtils.indexOf(byteArr, (byte) 1, -1));
        assertEquals(2, ArrayUtils.lastIndexOf(byteArr, (byte) 1, 5));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(byteArr, (byte) 1, -1));
        assertTrue(ArrayUtils.contains(byteArr, (byte) 2));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((byte[]) null, (byte) 1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((byte[]) null, (byte) 1));

        double[] doubleArr = new double[]{1.0, 2.0, 1.0};
        assertEquals(0, ArrayUtils.indexOf(doubleArr, 1.0, -1));
        assertEquals(2, ArrayUtils.lastIndexOf(doubleArr, 1.0, 5));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(doubleArr, 1.0, -1));
        assertTrue(ArrayUtils.contains(doubleArr, 2.0));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((double[]) null, 1.0));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((double[]) null, 1.0));

        float[] floatArr = new float[]{1.0f, 2.0f, 1.0f};
        assertEquals(0, ArrayUtils.indexOf(floatArr, 1.0f, -1));
        assertEquals(2, ArrayUtils.lastIndexOf(floatArr, 1.0f, 5));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(floatArr, 1.0f, -1));
        assertTrue(ArrayUtils.contains(floatArr, 2.0f));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((float[]) null, 1.0f));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((float[]) null, 1.0f));

        boolean[] boolArr = new boolean[]{true, false, true};
        assertEquals(0, ArrayUtils.indexOf(boolArr, true, -1));
        assertEquals(2, ArrayUtils.lastIndexOf(boolArr, true, 5));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(boolArr, true, -1));
        assertTrue(ArrayUtils.contains(boolArr, false));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((boolean[]) null, true));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((boolean[]) null, true));
    }

    // -----------------------------------------------------------------------
    // toPrimitive & toObject
    // -----------------------------------------------------------------------

    @Test
    public void testToPrimitiveAndToObject_Character() {
        assertNull(ArrayUtils.toPrimitive((Character[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_CHAR_ARRAY, ArrayUtils.toPrimitive(new Character[0]));
        assertArrayEquals(new char[]{'a', 'b'}, ArrayUtils.toPrimitive(new Character[]{Character.valueOf('a'), Character.valueOf('b')}));
        
        assertNull(ArrayUtils.toPrimitive((Character[]) null, 'd'));
        assertArrayEquals(ArrayUtils.EMPTY_CHAR_ARRAY, ArrayUtils.toPrimitive(new Character[0], 'd'));
        assertArrayEquals(new char[]{'a', 'd'}, ArrayUtils.toPrimitive(new Character[]{Character.valueOf('a'), null}, 'd'));

        assertNull(ArrayUtils.toObject((char[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY, ArrayUtils.toObject(new char[0]));
        assertArrayEquals(new Character[]{Character.valueOf('a')}, ArrayUtils.toObject(new char[]{'a'}));
    }

    @Test(expected = NullPointerException.class)
    public void testToPrimitive_Character_NPE() {
        ArrayUtils.toPrimitive(new Character[]{null});
    }

    @Test
    public void testToPrimitiveAndToObject_Others() {
        // Long
        assertNull(ArrayUtils.toPrimitive((Long[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_LONG_ARRAY, ArrayUtils.toPrimitive(new Long[0]));
        assertArrayEquals(new long[]{1L, 0L}, ArrayUtils.toPrimitive(new Long[]{1L, null}, 0L));
        assertNull(ArrayUtils.toObject((long[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_LONG_OBJECT_ARRAY, ArrayUtils.toObject(new long[0]));
        assertArrayEquals(new Long[]{1L}, ArrayUtils.toObject(new long[]{1L}));

        // Integer
        assertNull(ArrayUtils.toPrimitive((Integer[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_INT_ARRAY, ArrayUtils.toPrimitive(new Integer[0]));
        assertArrayEquals(new int[]{1, 0}, ArrayUtils.toPrimitive(new Integer[]{1, null}, 0));
        assertNull(ArrayUtils.toObject((int[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY, ArrayUtils.toObject(new int[0]));
        assertArrayEquals(new Integer[]{1}, ArrayUtils.toObject(new int[]{1}));

        // Short
        assertNull(ArrayUtils.toPrimitive((Short[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_SHORT_ARRAY, ArrayUtils.toPrimitive(new Short[0]));
        assertArrayEquals(new short[]{1, 0}, ArrayUtils.toPrimitive(new Short[]{(short) 1, null}, (short) 0));
        assertNull(ArrayUtils.toObject((short[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY, ArrayUtils.toObject(new short[0]));
        assertArrayEquals(new Short[]{(short) 1}, ArrayUtils.toObject(new short[]{1}));

        // Byte
        assertNull(ArrayUtils.toPrimitive((Byte[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_BYTE_ARRAY, ArrayUtils.toPrimitive(new Byte[0]));
        assertArrayEquals(new byte[]{1, 0}, ArrayUtils.toPrimitive(new Byte[]{(byte) 1, null}, (byte) 0));
        assertNull(ArrayUtils.toObject((byte[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY, ArrayUtils.toObject(new byte[0]));
        assertArrayEquals(new Byte[]{(byte) 1}, ArrayUtils.toObject(new byte[]{1}));

        // Double
        assertNull(ArrayUtils.toPrimitive((Double[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_DOUBLE_ARRAY, ArrayUtils.toPrimitive(new Double[0]));
        assertArrayEquals(new double[]{1.0, 0.0}, ArrayUtils.toPrimitive(new Double[]{1.0, null}, 0.0), 0.0);
        assertNull(ArrayUtils.toObject((double[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY, ArrayUtils.toObject(new double[0]));
        assertArrayEquals(new Double[]{1.0}, ArrayUtils.toObject(new double[]{1.0}));

        // Float
        assertNull(ArrayUtils.toPrimitive((Float[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_FLOAT_ARRAY, ArrayUtils.toPrimitive(new Float[0]));
        assertArrayEquals(new float[]{1.0f, 0.0f}, ArrayUtils.toPrimitive(new Float[]{1.0f, null}, 0.0f), 0.0f);
        assertNull(ArrayUtils.toObject((float[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY, ArrayUtils.toObject(new float[0]));
        assertArrayEquals(new Float[]{1.0f}, ArrayUtils.toObject(new float[]{1.0f}));

        // Boolean
        assertNull(ArrayUtils.toPrimitive((Boolean[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, ArrayUtils.toPrimitive(new Boolean[0]));
        assertArrayEquals(new boolean[]{true, false}, ArrayUtils.toPrimitive(new Boolean[]{Boolean.TRUE, null}, false));
        assertNull(ArrayUtils.toObject((boolean[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY, ArrayUtils.toObject(new boolean[0]));
        assertArrayEquals(new Boolean[]{Boolean.TRUE, Boolean.FALSE}, ArrayUtils.toObject(new boolean[]{true, false}));
    }

    // -----------------------------------------------------------------------
    // isEmpty
    // -----------------------------------------------------------------------

    @Test
    public void testIsEmpty() {
        assertTrue(ArrayUtils.isEmpty((Object[]) null));
        assertTrue(ArrayUtils.isEmpty(new Object[0]));
        assertFalse(ArrayUtils.isEmpty(new Object[]{1}));

        assertTrue(ArrayUtils.isEmpty((long[]) null));
        assertTrue(ArrayUtils.isEmpty(new long[0]));
        assertFalse(ArrayUtils.isEmpty(new long[]{1L}));

        assertTrue(ArrayUtils.isEmpty((int[]) null));
        assertTrue(ArrayUtils.isEmpty(new int[0]));
        assertFalse(ArrayUtils.isEmpty(new int[]{1}));

        assertTrue(ArrayUtils.isEmpty((short[]) null));
        assertTrue(ArrayUtils.isEmpty(new short[0]));
        assertFalse(ArrayUtils.isEmpty(new short[]{1}));

        assertTrue(ArrayUtils.isEmpty((char[]) null));
        assertTrue(ArrayUtils.isEmpty(new char[0]));
        assertFalse(ArrayUtils.isEmpty(new char[]{'a'}));

        assertTrue(ArrayUtils.isEmpty((byte[]) null));
        assertTrue(ArrayUtils.isEmpty(new byte[0]));
        assertFalse(ArrayUtils.isEmpty(new byte[]{1}));

        assertTrue(ArrayUtils.isEmpty((double[]) null));
        assertTrue(ArrayUtils.isEmpty(new double[0]));
        assertFalse(ArrayUtils.isEmpty(new double[]{1.0}));

        assertTrue(ArrayUtils.isEmpty((float[]) null));
        assertTrue(ArrayUtils.isEmpty(new float[0]));
        assertFalse(ArrayUtils.isEmpty(new float[]{1.0f}));

        assertTrue(ArrayUtils.isEmpty((boolean[]) null));
        assertTrue(ArrayUtils.isEmpty(new boolean[0]));
        assertFalse(ArrayUtils.isEmpty(new boolean[]{true}));
    }

    // -----------------------------------------------------------------------
    // addAll (Defects4J Lang-37 context)
    // -----------------------------------------------------------------------

    @Test
    public void testAddAll_Object() {
        assertNull(ArrayUtils.addAll((Object[]) null, (Object[]) null));
        assertArrayEquals(new String[]{"a"}, ArrayUtils.addAll(null, new String[]{"a"}));
        assertArrayEquals(new String[]{"a"}, ArrayUtils.addAll(new String[]{"a"}, (String[]) null));
        assertArrayEquals(new String[]{"a", "b"}, ArrayUtils.addAll(new String[]{"a"}, new String[]{"b"}));
    }

    /**
     * Edge case / Bug test for Defects4J Lang-37:
     * Adding an array of subtype (or incompatible type) into array of supertype
     */
    @Test
    public void testAddAll_Lang37BugCheck() {
        Number[] numbers = new Number[]{Integer.valueOf(1)};
        Long[] longs = new Long[]{Long.valueOf(2L)};
        
        // When joining Number[] and Long[], the result should be Number[] containing [1, 2L]
        Number[] result = ArrayUtils.addAll(numbers, longs);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals(Integer.valueOf(1), result[0]);
        assertEquals(Long.valueOf(2L), result[1]);
        assertEquals(Number.class, result.getClass().getComponentType());
    }

    @Test
    public void testAddAll_Primitives() {
        assertArrayEquals(new boolean[]{true, false}, ArrayUtils.addAll(new boolean[]{true}, new boolean[]{false}));
        assertArrayEquals(new boolean[]{true}, ArrayUtils.addAll(null, new boolean[]{true}));
        assertArrayEquals(new boolean[]{true}, ArrayUtils.addAll(new boolean[]{true}, (boolean[]) null));

        assertArrayEquals(new char[]{'a', 'b'}, ArrayUtils.addAll(new char[]{'a'}, new char[]{'b'}));
        assertArrayEquals(new char[]{'a'}, ArrayUtils.addAll(null, new char[]{'a'}));
        assertArrayEquals(new char[]{'a'}, ArrayUtils.addAll(new char[]{'a'}, (char[]) null));

        assertArrayEquals(new byte[]{1, 2}, ArrayUtils.addAll(new byte[]{1}, new byte[]{2}));
        assertArrayEquals(new byte[]{1}, ArrayUtils.addAll(null, new byte[]{1}));
        assertArrayEquals(new byte[]{1}, ArrayUtils.addAll(new byte[]{1}, (byte[]) null));

        assertArrayEquals(new short[]{1, 2}, ArrayUtils.addAll(new short[]{1}, new short[]{2}));
        assertArrayEquals(new short[]{1}, ArrayUtils.addAll(null, new short[]{1}));
        assertArrayEquals(new short[]{1}, ArrayUtils.addAll(new short[]{1}, (short[]) null));

        assertArrayEquals(new int[]{1, 2}, ArrayUtils.addAll(new int[]{1}, new int[]{2}));
        assertArrayEquals(new int[]{1}, ArrayUtils.addAll(null, new int[]{1}));
        assertArrayEquals(new int[]{1}, ArrayUtils.addAll(new int[]{1}, (int[]) null));

        assertArrayEquals(new long[]{1L, 2L}, ArrayUtils.addAll(new long[]{1L}, new long[]{2L}));
        assertArrayEquals(new long[]{1L}, ArrayUtils.addAll(null, new long[]{1L}));
        assertArrayEquals(new long[]{1L}, ArrayUtils.addAll(new long[]{1L}, (long[]) null));

        assertArrayEquals(new float[]{1.0f, 2.0f}, ArrayUtils.addAll(new float[]{1.0f}, new float[]{2.0f}), 0.0f);
        assertArrayEquals(new float[]{1.0f}, ArrayUtils.addAll(null, new float[]{1.0f}), 0.0f);
        assertArrayEquals(new float[]{1.0f}, ArrayUtils.addAll(new float[]{1.0f}, (float[]) null), 0.0f);

        assertArrayEquals(new double[]{1.0, 2.0}, ArrayUtils.addAll(new double[]{1.0}, new double[]{2.0}), 0.0);
        assertArrayEquals(new double[]{1.0}, ArrayUtils.addAll(null, new double[]{1.0}), 0.0);
        assertArrayEquals(new double[]{1.0}, ArrayUtils.addAll(new double[]{1.0}, (double[]) null), 0.0);
    }

    // -----------------------------------------------------------------------
    // add
    // -----------------------------------------------------------------------

    @Test
    public void testAdd_Object() {
        assertArrayEquals(new String[]{null}, ArrayUtils.add((String[]) null, (String) null));
        assertArrayEquals(new String[]{"a"}, ArrayUtils.add((String[]) null, "a"));
        assertArrayEquals(new String[]{"a", "b"}, ArrayUtils.add(new String[]{"a"}, "b"));

        assertArrayEquals(new String[]{null}, ArrayUtils.add((String[]) null, 0, (String) null));
        assertArrayEquals(new String[]{"a"}, ArrayUtils.add((String[]) null, 0, "a"));
        assertArrayEquals(new String[]{"a", "b", "c"}, ArrayUtils.add(new String[]{"a", "c"}, 1, "b"));
        assertArrayEquals(new String[]{"a", "b"}, ArrayUtils.add(new String[]{"b"}, 0, "a"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAdd_Object_NullArray_InvalidIndex() {
        ArrayUtils.add((String[]) null, 1, "a");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAdd_Object_OutOfBounds() {
        ArrayUtils.add(new String[]{"a"}, 3, "b");
    }

    @Test
    public void testAdd_Primitives() {
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
    public void testRemove_Object() {
        String[] arr = new String[]{"a", "b", "c"};
        assertArrayEquals(new String[]{"b", "c"}, ArrayUtils.remove(arr, 0));
        assertArrayEquals(new String[]{"a", "c"}, ArrayUtils.remove(arr, 1));
        assertArrayEquals(new String[]{"a", "b"}, ArrayUtils.remove(arr, 2));
        
        assertNull(ArrayUtils.removeElement((String[]) null, "a"));
        assertArrayEquals(new String[]{"a", "b", "c"}, ArrayUtils.removeElement(arr, "nonExisting"));
        assertArrayEquals(new String[]{"b", "c"}, ArrayUtils.removeElement(arr, "a"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_Object_NullArray() {
        ArrayUtils.remove((Object[]) null, 0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_Object_IndexNegative() {
        ArrayUtils.remove(new String[]{"a"}, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_Object_IndexTooLarge() {
        ArrayUtils.remove(new String[]{"a"}, 1);
    }

    @Test
    public void testRemove_Primitives() {
        assertArrayEquals(new boolean[]{false}, ArrayUtils.remove(new boolean[]{true, false}, 0));
        assertArrayEquals(new boolean[]{true}, ArrayUtils.removeElement(new boolean[]{true, false}, false));
        assertNull(ArrayUtils.removeElement((boolean[]) null, true));

        assertArrayEquals(new byte[]{2}, ArrayUtils.remove(new byte[]{1, 2}, 0));
        assertArrayEquals(new byte[]{1}, ArrayUtils.removeElement(new byte[]{1, 2}, (byte) 2));
        assertNull(ArrayUtils.removeElement((byte[]) null, (byte) 1));

        assertArrayEquals(new char[]{'b'}, ArrayUtils.remove(new char[]{'a', 'b'}, 0));
        assertArrayEquals(new char[]{'a'}, ArrayUtils.removeElement(new char[]{'a', 'b'}, 'b'));
        assertNull(ArrayUtils.removeElement((char[]) null, 'a'));

        assertArrayEquals(new double[]{2.0}, ArrayUtils.remove(new double[]{1.0, 2.0}, 0), 0.0);
        assertArrayEquals(new double[]{1.0}, ArrayUtils.removeElement(new double[]{1.0, 2.0}, 2.0), 0.0);
        assertNull(ArrayUtils.removeElement((double[]) null, 1.0));

        assertArrayEquals(new float[]{2.0f}, ArrayUtils.remove(new float[]{1.0f, 2.0f}, 0), 0.0f);
        assertArrayEquals(new float[]{1.0f}, ArrayUtils.removeElement(new float[]{1.0f, 2.0f}, 2.0f), 0.0f);
        assertNull(ArrayUtils.removeElement((float[]) null, 1.0f));

        assertArrayEquals(new int[]{2}, ArrayUtils.remove(new int[]{1, 2}, 0));
        assertArrayEquals(new int[]{1}, ArrayUtils.removeElement(new int[]{1, 2}, 2));
        assertNull(ArrayUtils.removeElement((int[]) null, 1));

        assertArrayEquals(new long[]{2L}, ArrayUtils.remove(new long[]{1L, 2L}, 0));
        assertArrayEquals(new long[]{1L}, ArrayUtils.removeElement(new long[]{1L, 2L}, 2L));
        assertNull(ArrayUtils.removeElement((long[]) null, 1L));

        assertArrayEquals(new short[]{2}, ArrayUtils.remove(new short[]{1, 2}, 0));
        assertArrayEquals(new short[]{1}, ArrayUtils.removeElement(new short[]{1, 2}, (short) 2));
        assertNull(ArrayUtils.removeElement((short[]) null, (short) 1));
    }
}
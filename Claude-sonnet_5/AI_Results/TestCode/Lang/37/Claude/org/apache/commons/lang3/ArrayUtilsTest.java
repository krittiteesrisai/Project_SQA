package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils; // target class (ซ้ำกับ package ปัจจุบัน แต่ใส่ตามข้อกำหนด)

/**
 * JUnit4 test suite สำหรับ {@link ArrayUtils} (Defects4J: Lang-37b)
 *
 * เน้น branch coverage และพยายามดักจับ fault ที่อาจซ่อนอยู่ โดยเฉพาะอย่างยิ่ง
 * เมธอด add(T[] array, int index, T element) ซึ่งมี branch ที่น่าสงสัย:
 * เมื่อ array == null และ element == null จะ return ทันทีโดยไม่ตรวจสอบ index
 * (ดูเทส testAdd_Indexed_NullArray_NullElement_NonZeroIndex_DetectsLang37Defect)
 */
public class ArrayUtilsTest {

    // =====================================================================
    // toString / isEquals
    // =====================================================================

    @Test
    public void testToString_nullArray_returnsEmptyBraces() {
        assertEquals("{}", ArrayUtils.toString(null));
    }

    @Test
    public void testToString_nonNullArray() {
        // สมมติฐานอ้างอิงจาก Javadoc ของคลาส: รูปแบบคือ Java source code เช่น {a,b}
        assertEquals("{1,2,3}", ArrayUtils.toString(new int[] {1, 2, 3}));
    }

    @Test
    public void testToStringWithDefault_nullArray_returnsStringIfNull() {
        assertEquals("NULL", ArrayUtils.toString(null, "NULL"));
    }

    @Test
    public void testToStringWithDefault_nonNullArray_ignoresDefault() {
        assertEquals("{1,2}", ArrayUtils.toString(new int[] {1, 2}, "NULL"));
    }

    @Test
    public void testIsEquals_bothNull_true() {
        assertTrue(ArrayUtils.isEquals(null, null));
    }

    @Test
    public void testIsEquals_equalArrays_true() {
        assertTrue(ArrayUtils.isEquals(new int[] {1, 2}, new int[] {1, 2}));
    }

    @Test
    public void testIsEquals_differentArrays_false() {
        assertFalse(ArrayUtils.isEquals(new int[] {1, 2}, new int[] {1, 3}));
    }

    // =====================================================================
    // toMap
    // =====================================================================

    @Test
    public void testToMap_nullArray_returnsNull() {
        assertNull(ArrayUtils.toMap(null));
    }

    @Test
    public void testToMap_withMapEntry() {
        Object[] array = { new AbstractMap.SimpleEntry<String, String>("k", "v") };
        Map<Object, Object> map = ArrayUtils.toMap(array);
        assertEquals("v", map.get("k"));
    }

    @Test
    public void testToMap_withObjectArrayEntry() {
        Object[] array = { new String[] {"k2", "v2"} };
        Map<Object, Object> map = ArrayUtils.toMap(array);
        assertEquals("v2", map.get("k2"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToMap_withObjectArrayEntryLengthLessThan2_throws() {
        Object[] array = { new String[] {"onlyOne"} };
        ArrayUtils.toMap(array);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToMap_withInvalidElementType_throws() {
        Object[] array = { "invalidElement" };
        ArrayUtils.toMap(array);
    }

    // =====================================================================
    // clone
    // =====================================================================

    @Test
    public void testClone_ObjectArray_nullAndNonNull() {
        String[] nullArr = null;
        assertNull(ArrayUtils.clone(nullArr));

        String[] arr = {"a", "b"};
        String[] cloned = ArrayUtils.clone(arr);
        assertArrayEquals(arr, cloned);
        assertNotSame(arr, cloned);
    }

    @Test
    public void testClone_PrimitiveArrays_nullAndNonNull() {
        assertNull(ArrayUtils.clone((long[]) null));
        long[] la = {1L, 2L};
        assertArrayEquals(la, ArrayUtils.clone(la));
        assertNotSame(la, ArrayUtils.clone(la));

        assertNull(ArrayUtils.clone((int[]) null));
        int[] ia = {1, 2};
        assertArrayEquals(ia, ArrayUtils.clone(ia));

        assertNull(ArrayUtils.clone((short[]) null));
        short[] sa = {1, 2};
        assertArrayEquals(sa, ArrayUtils.clone(sa));

        assertNull(ArrayUtils.clone((char[]) null));
        char[] ca = {'a', 'b'};
        assertArrayEquals(ca, ArrayUtils.clone(ca));

        assertNull(ArrayUtils.clone((byte[]) null));
        byte[] ba = {1, 2};
        assertArrayEquals(ba, ArrayUtils.clone(ba));

        assertNull(ArrayUtils.clone((double[]) null));
        double[] da = {1.0, 2.0};
        assertArrayEquals(da, ArrayUtils.clone(da), 0.0001);

        assertNull(ArrayUtils.clone((float[]) null));
        float[] fa = {1f, 2f};
        assertArrayEquals(fa, ArrayUtils.clone(fa), 0.0001f);

        assertNull(ArrayUtils.clone((boolean[]) null));
        boolean[] boa = {true, false};
        assertArrayEquals(boa, ArrayUtils.clone(boa));
    }

    // =====================================================================
    // subarray
    // =====================================================================

    @Test
    public void testSubarray_ObjectArray_allBranches() {
        String[] nullArr = null;
        assertNull(ArrayUtils.subarray(nullArr, 0, 1));

        String[] arr = {"a", "b", "c", "d", "e"};
        assertArrayEquals(new String[] {"b", "c"}, ArrayUtils.subarray(arr, 1, 3));
        assertArrayEquals(new String[] {"a", "b", "c"}, ArrayUtils.subarray(arr, -2, 3)); // start<0
        assertArrayEquals(new String[] {"c", "d", "e"}, ArrayUtils.subarray(arr, 2, 10)); // end>length
        assertArrayEquals(new String[0], ArrayUtils.subarray(arr, 3, 2)); // newSize<=0
    }

    @Test
    public void testSubarray_IntArray_allBranches() {
        assertNull(ArrayUtils.subarray((int[]) null, 0, 1));

        int[] arr = {1, 2, 3, 4, 5};
        assertArrayEquals(new int[] {2, 3}, ArrayUtils.subarray(arr, 1, 3));
        assertArrayEquals(new int[] {1, 2, 3}, ArrayUtils.subarray(arr, -2, 3));
        assertArrayEquals(new int[] {3, 4, 5}, ArrayUtils.subarray(arr, 2, 10));
        assertArrayEquals(ArrayUtils.EMPTY_INT_ARRAY, ArrayUtils.subarray(arr, 3, 2));
    }

    @Test
    public void testSubarray_OtherPrimitives_smoke() {
        long[] larr = {1L, 2L, 3L};
        assertNull(ArrayUtils.subarray((long[]) null, 0, 1));
        assertArrayEquals(new long[] {2L, 3L}, ArrayUtils.subarray(larr, 1, 5));
        assertArrayEquals(ArrayUtils.EMPTY_LONG_ARRAY, ArrayUtils.subarray(larr, 3, 1));

        short[] sarr = {1, 2, 3};
        assertArrayEquals(ArrayUtils.EMPTY_SHORT_ARRAY, ArrayUtils.subarray(sarr, 5, 1));

        char[] carr = {'a', 'b', 'c'};
        assertArrayEquals(new char[] {'a', 'b', 'c'}, ArrayUtils.subarray(carr, -1, 10));

        byte[] barr = {1, 2, 3};
        assertArrayEquals(ArrayUtils.EMPTY_BYTE_ARRAY, ArrayUtils.subarray(barr, 2, 1));

        double[] darr = {1.0, 2.0, 3.0};
        assertArrayEquals(new double[] {1.0, 2.0, 3.0}, ArrayUtils.subarray(darr, -5, 10), 0.0001);

        float[] farr = {1f, 2f, 3f};
        assertArrayEquals(ArrayUtils.EMPTY_FLOAT_ARRAY, ArrayUtils.subarray(farr, 5, 1), 0.0001f);

        boolean[] boolArr = {true, false, true};
        assertArrayEquals(new boolean[] {false, true}, ArrayUtils.subarray(boolArr, 1, 10));
    }

    // =====================================================================
    // isSameLength
    // =====================================================================

    @Test
    public void testIsSameLength_ObjectArray_allBranches() {
        assertTrue(ArrayUtils.isSameLength((Object[]) null, (Object[]) null));
        assertTrue(ArrayUtils.isSameLength((Object[]) null, new Object[0]));
        assertFalse(ArrayUtils.isSameLength((Object[]) null, new Object[] {"a"}));
        assertFalse(ArrayUtils.isSameLength(new Object[] {"a"}, (Object[]) null));
        assertTrue(ArrayUtils.isSameLength(new Object[] {"a", "b"}, new Object[] {"c", "d"}));
        assertFalse(ArrayUtils.isSameLength(new Object[] {"a"}, new Object[] {"b", "c"}));
    }

    @Test
    public void testIsSameLength_PrimitiveOverloads_smoke() {
        assertTrue(ArrayUtils.isSameLength((long[]) null, (long[]) null));
        assertFalse(ArrayUtils.isSameLength(new long[] {1L}, (long[]) null));
        assertTrue(ArrayUtils.isSameLength(new int[] {1, 2}, new int[] {3, 4}));
        assertFalse(ArrayUtils.isSameLength(new int[] {1}, new int[] {3, 4}));
        assertTrue(ArrayUtils.isSameLength(new short[] {1}, new short[] {2}));
        assertTrue(ArrayUtils.isSameLength(new char[] {'a'}, new char[] {'b'}));
        assertTrue(ArrayUtils.isSameLength(new byte[] {1}, new byte[] {2}));
        assertTrue(ArrayUtils.isSameLength(new double[] {1.0}, new double[] {2.0}));
        assertTrue(ArrayUtils.isSameLength(new float[] {1f}, new float[] {2f}));
        assertTrue(ArrayUtils.isSameLength(new boolean[] {true}, new boolean[] {false}));
    }

    // =====================================================================
    // getLength / isSameType
    // =====================================================================

    @Test
    public void testGetLength_null_returnsZero() {
        assertEquals(0, ArrayUtils.getLength(null));
    }

    @Test
    public void testGetLength_array_returnsLength() {
        assertEquals(3, ArrayUtils.getLength(new int[] {1, 2, 3}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLength_notArray_throws() {
        ArrayUtils.getLength("not an array");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameType_array1Null_throws() {
        ArrayUtils.isSameType(null, new int[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameType_array2Null_throws() {
        ArrayUtils.isSameType(new int[0], null);
    }

    @Test
    public void testIsSameType_sameType_true() {
        assertTrue(ArrayUtils.isSameType(new int[0], new int[0]));
    }

    @Test
    public void testIsSameType_differentType_false() {
        assertFalse(ArrayUtils.isSameType(new int[0], new String[0]));
    }

    // =====================================================================
    // reverse
    // =====================================================================

    @Test
    public void testReverse_ObjectArray_allBranches() {
        Object[] nullArr = null;
        ArrayUtils.reverse(nullArr); // ไม่ throw

        Object[] empty = {};
        ArrayUtils.reverse(empty);
        assertArrayEquals(new Object[] {}, empty);

        Object[] single = {"a"};
        ArrayUtils.reverse(single);
        assertArrayEquals(new Object[] {"a"}, single);

        Object[] even = {"a", "b", "c", "d"};
        ArrayUtils.reverse(even);
        assertArrayEquals(new Object[] {"d", "c", "b", "a"}, even);

        Object[] odd = {"a", "b", "c"};
        ArrayUtils.reverse(odd);
        assertArrayEquals(new Object[] {"c", "b", "a"}, odd);
    }

    @Test
    public void testReverse_PrimitiveArrays_smoke() {
        int[] iarr = {1, 2, 3};
        ArrayUtils.reverse(iarr);
        assertArrayEquals(new int[] {3, 2, 1}, iarr);

        ArrayUtils.reverse((int[]) null); // ไม่ throw

        long[] larr = {1L, 2L};
        ArrayUtils.reverse(larr);
        assertArrayEquals(new long[] {2L, 1L}, larr);

        boolean[] boolArr = {true, false, false};
        ArrayUtils.reverse(boolArr);
        assertArrayEquals(new boolean[] {false, false, true}, boolArr);
    }

    // =====================================================================
    // indexOf / lastIndexOf / contains - Object[]
    // =====================================================================

    @Test
    public void testIndexOf_ObjectArray_allBranches() {
        assertEquals(-1, ArrayUtils.indexOf((Object[]) null, "a"));

        Object[] arr = {"a", null, "b", "a"};
        assertEquals(0, ArrayUtils.indexOf(arr, "a", -5)); // startIndex<0 -> 0
        assertEquals(1, ArrayUtils.indexOf(arr, null));    // objectToFind null -> found
        assertEquals(-1, ArrayUtils.indexOf(new Object[] {"x", "y"}, null)); // null not found
        assertEquals(-1, ArrayUtils.indexOf(arr, Integer.valueOf(5))); // not instance of component type
        assertEquals(3, ArrayUtils.indexOf(arr, "a", 1)); // startIndex>0 skip first match
        assertEquals(-1, ArrayUtils.indexOf(arr, "z"));   // not found
    }

    @Test
    public void testLastIndexOf_ObjectArray_allBranches() {
        assertEquals(-1, ArrayUtils.lastIndexOf((Object[]) null, "a"));

        Object[] arr = {"a", null, "b", "a"};
        assertEquals(3, ArrayUtils.lastIndexOf(arr, "a"));          // default start = MAX clamp
        assertEquals(-1, ArrayUtils.lastIndexOf(arr, "a", -1));     // startIndex<0
        assertEquals(3, ArrayUtils.lastIndexOf(arr, "a", 10));      // startIndex>=length clamp
        assertEquals(1, ArrayUtils.lastIndexOf(arr, null));         // null branch found
        assertEquals(-1, ArrayUtils.lastIndexOf(arr, Integer.valueOf(5))); // not instance
    }

    @Test
    public void testContains_ObjectArray() {
        Object[] arr = {"a", "b"};
        assertTrue(ArrayUtils.contains(arr, "a"));
        assertFalse(ArrayUtils.contains(arr, "z"));
    }

    // =====================================================================
    // indexOf / lastIndexOf / contains - long[]
    // =====================================================================

    @Test
    public void testIndexOfLastIndexOfContains_LongArray_allBranches() {
        long[] larr = {10L, 20L, 30L, 20L};

        assertEquals(-1, ArrayUtils.indexOf((long[]) null, 10L));
        assertEquals(1, ArrayUtils.indexOf(larr, 20L, -3)); // startIndex<0 clamp
        assertEquals(-1, ArrayUtils.indexOf(larr, 99L));

        assertEquals(-1, ArrayUtils.lastIndexOf((long[]) null, 10L));
        assertEquals(3, ArrayUtils.lastIndexOf(larr, 20L));
        assertEquals(-1, ArrayUtils.lastIndexOf(larr, 20L, -1)); // startIndex<0
        assertEquals(3, ArrayUtils.lastIndexOf(larr, 20L, 100)); // startIndex>=length clamp

        assertTrue(ArrayUtils.contains(larr, 30L));
        assertFalse(ArrayUtils.contains(larr, 99L));
    }

    // =====================================================================
    // indexOf / lastIndexOf / contains - int[], short[], char[], byte[]
    // =====================================================================

    @Test
    public void testIndexOfLastIndexOfContains_IntShortCharByte_smoke() {
        int[] iArr = {5, 10, 15, 10};
        assertEquals(-1, ArrayUtils.indexOf((int[]) null, 10));
        assertEquals(1, ArrayUtils.indexOf(iArr, 10));
        assertEquals(-1, ArrayUtils.indexOf(iArr, 99));
        assertEquals(1, ArrayUtils.indexOf(iArr, 10, -5));
        assertEquals(3, ArrayUtils.lastIndexOf(iArr, 10));
        assertEquals(-1, ArrayUtils.lastIndexOf(iArr, 10, -1));
        assertEquals(3, ArrayUtils.lastIndexOf(iArr, 10, 100));
        assertTrue(ArrayUtils.contains(iArr, 15));
        assertFalse(ArrayUtils.contains(iArr, 99));

        short[] sArr = {5, 10, 15, 10};
        assertEquals(-1, ArrayUtils.indexOf((short[]) null, (short) 10));
        assertEquals(1, ArrayUtils.indexOf(sArr, (short) 10));
        assertEquals(3, ArrayUtils.lastIndexOf(sArr, (short) 10));
        assertEquals(-1, ArrayUtils.lastIndexOf(sArr, (short) 10, -1));
        assertTrue(ArrayUtils.contains(sArr, (short) 15));
        assertFalse(ArrayUtils.contains(sArr, (short) 99));

        char[] cArr = {'a', 'b', 'c', 'b'};
        assertEquals(-1, ArrayUtils.indexOf((char[]) null, 'b'));
        assertEquals(1, ArrayUtils.indexOf(cArr, 'b'));
        assertEquals(3, ArrayUtils.lastIndexOf(cArr, 'b'));
        assertEquals(-1, ArrayUtils.lastIndexOf(cArr, 'b', -1));
        assertTrue(ArrayUtils.contains(cArr, 'c'));
        assertFalse(ArrayUtils.contains(cArr, 'z'));

        byte[] bArr = {1, 2, 3, 2};
        assertEquals(-1, ArrayUtils.indexOf((byte[]) null, (byte) 2));
        assertEquals(1, ArrayUtils.indexOf(bArr, (byte) 2));
        assertEquals(3, ArrayUtils.lastIndexOf(bArr, (byte) 2));
        assertEquals(-1, ArrayUtils.lastIndexOf(bArr, (byte) 2, -1));
        assertTrue(ArrayUtils.contains(bArr, (byte) 3));
        assertFalse(ArrayUtils.contains(bArr, (byte) 99));
    }

    // =====================================================================
    // indexOf / lastIndexOf / contains - double[] (ใช้ isEmpty + tolerance)
    // =====================================================================

    @Test
    public void testIndexOf_DoubleArray_allBranches() {
        double[] arr = {1.0, 2.0, 3.0};

        assertEquals(-1, ArrayUtils.indexOf((double[]) null, 1.0)); // isEmpty: null
        assertEquals(-1, ArrayUtils.indexOf(new double[0], 1.0));   // isEmpty: length0
        assertEquals(1, ArrayUtils.indexOf(arr, 2.0));
        assertEquals(1, ArrayUtils.indexOf(arr, 2.0, -5));          // startIndex<0 clamp

        assertEquals(1, ArrayUtils.indexOf(arr, 2.05, 0.1));        // tolerance found
        assertEquals(-1, ArrayUtils.indexOf(arr, 2.5, 0.1));        // tolerance not found
        assertEquals(1, ArrayUtils.indexOf(arr, 2.05, -5, 0.1));    // startIndex<0 + tolerance
    }

    @Test
    public void testLastIndexOf_DoubleArray_allBranches() {
        double[] arr = {1.0, 2.0, 3.0};

        assertEquals(-1, ArrayUtils.lastIndexOf((double[]) null, 2.0)); // isEmpty null
        assertEquals(-1, ArrayUtils.lastIndexOf(new double[0], 2.0));   // isEmpty empty
        assertEquals(1, ArrayUtils.lastIndexOf(arr, 2.0));
        assertEquals(-1, ArrayUtils.lastIndexOf(arr, 2.0, -1));         // startIndex<0
        assertEquals(1, ArrayUtils.lastIndexOf(arr, 2.0, 100));         // startIndex>=length clamp

        assertEquals(1, ArrayUtils.lastIndexOf(arr, 2.05, 0.1));        // tolerance (default start)
        assertEquals(-1, ArrayUtils.lastIndexOf(arr, 2.05, -1, 0.1));   // tolerance + startIndex<0
        assertEquals(1, ArrayUtils.lastIndexOf(arr, 2.05, 100, 0.1));   // tolerance + clamp
    }

    @Test
    public void testContains_DoubleArray() {
        double[] arr = {1.0, 2.0, 3.0};
        assertTrue(ArrayUtils.contains(arr, 2.0));
        assertFalse(ArrayUtils.contains(arr, 99.0));
        assertTrue(ArrayUtils.contains(arr, 2.05, 0.1));
        assertFalse(ArrayUtils.contains(arr, 99.0, 0.1));
    }

    // =====================================================================
    // indexOf / lastIndexOf / contains - float[] / boolean[] (isEmpty branch)
    // =====================================================================

    @Test
    public void testIndexOfLastIndexOfContains_FloatArray_smoke() {
        float[] farr = {1f, 2f, 3f};
        assertEquals(-1, ArrayUtils.indexOf((float[]) null, 1f));
        assertEquals(-1, ArrayUtils.indexOf(new float[0], 1f));
        assertEquals(1, ArrayUtils.indexOf(farr, 2f, -5));
        assertEquals(1, ArrayUtils.lastIndexOf(farr, 2f));
        assertEquals(-1, ArrayUtils.lastIndexOf(farr, 2f, -1));
        assertEquals(1, ArrayUtils.lastIndexOf(farr, 2f, 100));
        assertTrue(ArrayUtils.contains(farr, 3f));
        assertFalse(ArrayUtils.contains(farr, 99f));
    }

    @Test
    public void testIndexOfLastIndexOfContains_BooleanArray_smoke() {
        boolean[] barr = {true, false, true};
        assertEquals(-1, ArrayUtils.indexOf((boolean[]) null, true));
        assertEquals(-1, ArrayUtils.indexOf(new boolean[0], true));
        assertEquals(1, ArrayUtils.indexOf(barr, false, -5));
        assertEquals(2, ArrayUtils.lastIndexOf(barr, true));
        assertEquals(-1, ArrayUtils.lastIndexOf(barr, true, -1));
        assertEquals(2, ArrayUtils.lastIndexOf(barr, true, 100));
        assertTrue(ArrayUtils.contains(barr, false));
        assertFalse(ArrayUtils.contains(new boolean[] {true, true}, false));
    }

    // =====================================================================
    // toPrimitive / toObject - Character
    // =====================================================================

    @Test
    public void testToPrimitiveToObject_Character() {
        assertNull(ArrayUtils.toPrimitive((Character[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_CHAR_ARRAY, ArrayUtils.toPrimitive(new Character[0]));
        assertArrayEquals(new char[] {'a', 'b'}, ArrayUtils.toPrimitive(new Character[] {'a', 'b'}));

        try {
            ArrayUtils.toPrimitive(new Character[] {'a', null});
            fail("Expected NullPointerException");
        } catch (NullPointerException e) { /* expected */ }

        assertArrayEquals(new char[] {'a', 'z'},
                ArrayUtils.toPrimitive(new Character[] {'a', null}, 'z'));

        assertNull(ArrayUtils.toObject((char[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY, ArrayUtils.toObject(new char[0]));
        assertArrayEquals(new Character[] {'a', 'b'}, ArrayUtils.toObject(new char[] {'a', 'b'}));
    }

    // =====================================================================
    // toPrimitive / toObject - Long
    // =====================================================================

    @Test
    public void testToPrimitiveToObject_Long() {
        assertNull(ArrayUtils.toPrimitive((Long[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_LONG_ARRAY, ArrayUtils.toPrimitive(new Long[0]));
        assertArrayEquals(new long[] {1L, 2L}, ArrayUtils.toPrimitive(new Long[] {1L, 2L}));

        try {
            ArrayUtils.toPrimitive(new Long[] {1L, null});
            fail("Expected NullPointerException");
        } catch (NullPointerException e) { /* expected */ }

        assertArrayEquals(new long[] {1L, 9L}, ArrayUtils.toPrimitive(new Long[] {1L, null}, 9L));

        assertNull(ArrayUtils.toObject((long[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_LONG_OBJECT_ARRAY, ArrayUtils.toObject(new long[0]));
        assertArrayEquals(new Long[] {1L, 2L}, ArrayUtils.toObject(new long[] {1L, 2L}));
    }

    // =====================================================================
    // toPrimitive / toObject - Integer
    // =====================================================================

    @Test
    public void testToPrimitiveToObject_Integer() {
        assertNull(ArrayUtils.toPrimitive((Integer[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_INT_ARRAY, ArrayUtils.toPrimitive(new Integer[0]));
        assertArrayEquals(new int[] {1, 2}, ArrayUtils.toPrimitive(new Integer[] {1, 2}));

        try {
            ArrayUtils.toPrimitive(new Integer[] {1, null});
            fail("Expected NullPointerException");
        } catch (NullPointerException e) { /* expected */ }

        assertArrayEquals(new int[] {1, 9}, ArrayUtils.toPrimitive(new Integer[] {1, null}, 9));

        assertNull(ArrayUtils.toObject((int[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY, ArrayUtils.toObject(new int[0]));
        assertArrayEquals(new Integer[] {1, 2}, ArrayUtils.toObject(new int[] {1, 2}));
    }

    // =====================================================================
    // toPrimitive / toObject - Short
    // =====================================================================

    @Test
    public void testToPrimitiveToObject_Short() {
        assertNull(ArrayUtils.toPrimitive((Short[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_SHORT_ARRAY, ArrayUtils.toPrimitive(new Short[0]));
        assertArrayEquals(new short[] {1, 2}, ArrayUtils.toPrimitive(new Short[] {1, 2}));

        try {
            ArrayUtils.toPrimitive(new Short[] {1, null});
            fail("Expected NullPointerException");
        } catch (NullPointerException e) { /* expected */ }

        assertArrayEquals(new short[] {1, 9}, ArrayUtils.toPrimitive(new Short[] {1, null}, (short) 9));

        assertNull(ArrayUtils.toObject((short[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY, ArrayUtils.toObject(new short[0]));
        assertArrayEquals(new Short[] {1, 2}, ArrayUtils.toObject(new short[] {1, 2}));
    }

    // =====================================================================
    // toPrimitive / toObject - Byte
    // =====================================================================

    @Test
    public void testToPrimitiveToObject_Byte() {
        assertNull(ArrayUtils.toPrimitive((Byte[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_BYTE_ARRAY, ArrayUtils.toPrimitive(new Byte[0]));
        assertArrayEquals(new byte[] {1, 2}, ArrayUtils.toPrimitive(new Byte[] {1, 2}));

        try {
            ArrayUtils.toPrimitive(new Byte[] {1, null});
            fail("Expected NullPointerException");
        } catch (NullPointerException e) { /* expected */ }

        assertArrayEquals(new byte[] {1, 9}, ArrayUtils.toPrimitive(new Byte[] {1, null}, (byte) 9));

        assertNull(ArrayUtils.toObject((byte[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY, ArrayUtils.toObject(new byte[0]));
        assertArrayEquals(new Byte[] {1, 2}, ArrayUtils.toObject(new byte[] {1, 2}));
    }

    // =====================================================================
    // toPrimitive / toObject - Double
    // =====================================================================

    @Test
    public void testToPrimitiveToObject_Double() {
        assertNull(ArrayUtils.toPrimitive((Double[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_DOUBLE_ARRAY, ArrayUtils.toPrimitive(new Double[0]), 0.0001);
        assertArrayEquals(new double[] {1.0, 2.0}, ArrayUtils.toPrimitive(new Double[] {1.0, 2.0}), 0.0001);

        try {
            ArrayUtils.toPrimitive(new Double[] {1.0, null});
            fail("Expected NullPointerException");
        } catch (NullPointerException e) { /* expected */ }

        assertArrayEquals(new double[] {1.0, 9.0},
                ArrayUtils.toPrimitive(new Double[] {1.0, null}, 9.0), 0.0001);

        assertNull(ArrayUtils.toObject((double[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY, ArrayUtils.toObject(new double[0]));
        assertArrayEquals(new Double[] {1.0, 2.0}, ArrayUtils.toObject(new double[] {1.0, 2.0}));
    }

    // =====================================================================
    // toPrimitive / toObject - Float
    // =====================================================================

    @Test
    public void testToPrimitiveToObject_Float() {
        assertNull(ArrayUtils.toPrimitive((Float[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_FLOAT_ARRAY, ArrayUtils.toPrimitive(new Float[0]), 0.0001f);
        assertArrayEquals(new float[] {1f, 2f}, ArrayUtils.toPrimitive(new Float[] {1f, 2f}), 0.0001f);

        try {
            ArrayUtils.toPrimitive(new Float[] {1f, null});
            fail("Expected NullPointerException");
        } catch (NullPointerException e) { /* expected */ }

        assertArrayEquals(new float[] {1f, 9f},
                ArrayUtils.toPrimitive(new Float[] {1f, null}, 9f), 0.0001f);

        assertNull(ArrayUtils.toObject((float[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY, ArrayUtils.toObject(new float[0]));
        assertArrayEquals(new Float[] {1f, 2f}, ArrayUtils.toObject(new float[] {1f, 2f}));
    }

    // =====================================================================
    // toPrimitive / toObject - Boolean
    // =====================================================================

    @Test
    public void testToPrimitiveToObject_Boolean() {
        assertNull(ArrayUtils.toPrimitive((Boolean[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, ArrayUtils.toPrimitive(new Boolean[0]));
        assertArrayEquals(new boolean[] {true, false}, ArrayUtils.toPrimitive(new Boolean[] {true, false}));

        try {
            ArrayUtils.toPrimitive(new Boolean[] {true, null});
            fail("Expected NullPointerException");
        } catch (NullPointerException e) { /* expected */ }

        assertArrayEquals(new boolean[] {true, true},
                ArrayUtils.toPrimitive(new Boolean[] {true, null}, true));

        assertNull(ArrayUtils.toObject((boolean[]) null));
        assertArrayEquals(ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY, ArrayUtils.toObject(new boolean[0]));
        assertArrayEquals(new Boolean[] {Boolean.TRUE, Boolean.FALSE},
                ArrayUtils.toObject(new boolean[] {true, false}));
    }

    // =====================================================================
    // isEmpty
    // =====================================================================

    @Test
    public void testIsEmpty_allTypes() {
        assertTrue(ArrayUtils.isEmpty((Object[]) null));
        assertTrue(ArrayUtils.isEmpty(new Object[0]));
        assertFalse(ArrayUtils.isEmpty(new Object[] {"a"}));

        assertTrue(ArrayUtils.isEmpty((long[]) null));
        assertTrue(ArrayUtils.isEmpty(new long[0]));
        assertFalse(ArrayUtils.isEmpty(new long[] {1L}));

        assertTrue(ArrayUtils.isEmpty((int[]) null));
        assertTrue(ArrayUtils.isEmpty(new int[0]));
        assertFalse(ArrayUtils.isEmpty(new int[] {1}));

        assertTrue(ArrayUtils.isEmpty((short[]) null));
        assertTrue(ArrayUtils.isEmpty(new short[0]));
        assertFalse(ArrayUtils.isEmpty(new short[] {1}));

        assertTrue(ArrayUtils.isEmpty((char[]) null));
        assertTrue(ArrayUtils.isEmpty(new char[0]));
        assertFalse(ArrayUtils.isEmpty(new char[] {'a'}));

        assertTrue(ArrayUtils.isEmpty((byte[]) null));
        assertTrue(ArrayUtils.isEmpty(new byte[0]));
        assertFalse(ArrayUtils.isEmpty(new byte[] {1}));

        assertTrue(ArrayUtils.isEmpty((double[]) null));
        assertTrue(ArrayUtils.isEmpty(new double[0]));
        assertFalse(ArrayUtils.isEmpty(new double[] {1.0}));

        assertTrue(ArrayUtils.isEmpty((float[]) null));
        assertTrue(ArrayUtils.isEmpty(new float[0]));
        assertFalse(ArrayUtils.isEmpty(new float[] {1f}));

        assertTrue(ArrayUtils.isEmpty((boolean[]) null));
        assertTrue(ArrayUtils.isEmpty(new boolean[0]));
        assertFalse(ArrayUtils.isEmpty(new boolean[] {true}));
    }

    // =====================================================================
    // addAll
    // =====================================================================

    @Test
    public void testAddAll_ObjectArray_allBranches() {
        String[] nullArr = null;
        assertNull(ArrayUtils.addAll(nullArr, nullArr));

        String[] a1 = {"a", "b"};
        assertArrayEquals(a1, ArrayUtils.addAll(a1, nullArr));
        assertNotSame(a1, ArrayUtils.addAll(a1, nullArr));

        String[] a2 = {"c", "d"};
        assertArrayEquals(a2, ArrayUtils.addAll(nullArr, a2));

        assertArrayEquals(new String[] {"a", "b", "c", "d"}, ArrayUtils.addAll(a1, a2));
    }

    @Test
    public void testAddAll_PrimitiveArrays_smoke() {
        assertNull(ArrayUtils.addAll((boolean[]) null, (boolean[]) null));
        assertArrayEquals(new boolean[] {true, false},
                ArrayUtils.addAll(new boolean[] {true}, new boolean[] {false}));

        assertNull(ArrayUtils.addAll((char[]) null, (char[]) null));
        assertArrayEquals(new char[] {'a', 'b'}, ArrayUtils.addAll(new char[] {'a'}, new char[] {'b'}));

        assertNull(ArrayUtils.addAll((byte[]) null, (byte[]) null));
        assertArrayEquals(new byte[] {1, 2}, ArrayUtils.addAll(new byte[] {1}, new byte[] {2}));

        assertNull(ArrayUtils.addAll((short[]) null, (short[]) null));
        assertArrayEquals(new short[] {1, 2}, ArrayUtils.addAll(new short[] {1}, new short[] {2}));

        assertNull(ArrayUtils.addAll((int[]) null, (int[]) null));
        assertArrayEquals(new int[] {1, 2}, ArrayUtils.addAll(new int[] {1}, new int[] {2}));

        assertNull(ArrayUtils.addAll((long[]) null, (long[]) null));
        assertArrayEquals(new long[] {1L, 2L}, ArrayUtils.addAll(new long[] {1L}, new long[] {2L}));

        assertNull(ArrayUtils.addAll((float[]) null, (float[]) null));
        assertArrayEquals(new float[] {1f, 2f}, ArrayUtils.addAll(new float[] {1f}, new float[] {2f}), 0.0001f);

        assertNull(ArrayUtils.addAll((double[]) null, (double[]) null));
        assertArrayEquals(new double[] {1.0, 2.0}, ArrayUtils.addAll(new double[] {1.0}, new double[] {2.0}), 0.0001);
    }

    // =====================================================================
    // add(array, element) - single element (copyArrayGrow1 branches)
    // =====================================================================

    @Test
    public void testAdd_SingleElement_ObjectArray() {
        Object[] res = ArrayUtils.add((Object[]) null, (Object) null);
        assertEquals(1, res.length);
        assertNull(res[0]);

        Object[] res2 = ArrayUtils.add((Object[]) null, "x");
        assertEquals(1, res2.length);
        assertEquals("x", res2[0]);

        String[] arr = {"a", "b"};
        assertArrayEquals(new String[] {"a", "b", "c"}, ArrayUtils.add(arr, "c"));
    }

    @Test
    public void testAdd_SingleElement_PrimitiveArrays_smoke() {
        assertArrayEquals(new boolean[] {true}, ArrayUtils.add((boolean[]) null, true));
        assertArrayEquals(new boolean[] {true, false}, ArrayUtils.add(new boolean[] {true}, false));

        assertArrayEquals(new byte[] {5}, ArrayUtils.add((byte[]) null, (byte) 5));
        assertArrayEquals(new byte[] {5, 6}, ArrayUtils.add(new byte[] {5}, (byte) 6));

        assertArrayEquals(new char[] {'a'}, ArrayUtils.add((char[]) null, 'a'));
        assertArrayEquals(new char[] {'a', 'b'}, ArrayUtils.add(new char[] {'a'}, 'b'));

        assertArrayEquals(new double[] {1.0}, ArrayUtils.add((double[]) null, 1.0), 0.0001);
        assertArrayEquals(new double[] {1.0, 2.0}, ArrayUtils.add(new double[] {1.0}, 2.0), 0.0001);

        assertArrayEquals(new float[] {1f}, ArrayUtils.add((float[]) null, 1f), 0.0001f);
        assertArrayEquals(new float[] {1f, 2f}, ArrayUtils.add(new float[] {1f}, 2f), 0.0001f);

        assertArrayEquals(new int[] {1}, ArrayUtils.add((int[]) null, 1));
        assertArrayEquals(new int[] {1, 2}, ArrayUtils.add(new int[] {1}, 2));

        assertArrayEquals(new long[] {1L}, ArrayUtils.add((long[]) null, 1L));
        assertArrayEquals(new long[] {1L, 2L}, ArrayUtils.add(new long[] {1L}, 2L));

        assertArrayEquals(new short[] {1}, ArrayUtils.add((short[]) null, (short) 1));
        assertArrayEquals(new short[] {1, 2}, ArrayUtils.add(new short[] {1}, (short) 2));
    }

    // =====================================================================
    // add(array, index, element) - รวมเทส defect-detecting
    // =====================================================================

    @Test
    public void testAdd_Indexed_ObjectArray_normal() {
        String[] arr = {"a", "b"};
        assertArrayEquals(new String[] {"c", "a", "b"}, ArrayUtils.add(arr, 0, "c"));
        assertArrayEquals(new String[] {"a", "b", "c"}, ArrayUtils.add(arr, 2, "c")); // index == length
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAdd_Indexed_ObjectArray_negativeIndex_throws() {
        String[] arr = {"a", "b"};
        ArrayUtils.add(arr, -1, "c");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAdd_Indexed_ObjectArray_indexBeyondLength_throws() {
        String[] arr = {"a", "b"};
        ArrayUtils.add(arr, 3, "c");
    }

    @Test
    public void testAdd_Indexed_NullArray_NonNullElement_indexZero_works() {
        String[] nullArr = null;
        assertArrayEquals(new String[] {"x"}, ArrayUtils.add(nullArr, 0, "x"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAdd_Indexed_NullArray_NonNullElement_nonZeroIndex_throws() {
        String[] nullArr = null;
        ArrayUtils.add(nullArr, 1, "x");
    }

    @Test
    public void testAdd_Indexed_NullArray_NullElement_indexZero_works() {
        Object[] nullArr = null;
        Object[] result = ArrayUtils.add(nullArr, 0, null);
        assertEquals(1, result.length);
        assertNull(result[0]);
    }

    /**
     * *** FAULT-DETECTING TEST (เป้าหมายดักจับข้อบกพร่อง Defects4J Lang-37) ***
     *
     * จากซอร์สโค้ด public add(T[] array, int index, T element):
     *   if (array != null) { ... }
     *   else if (element != null) { ... }
     *   else { return (T[]) new Object[] { null }; }   // <-- ไม่ตรวจสอบ index เลย!
     *
     * เมื่อ array == null และ element == null เมธอดจะ return ทันที
     * โดยไม่ผ่าน private add(...) ซึ่งเป็นที่ตรวจสอบ IndexOutOfBoundsException
     * ดังนั้นแม้ index จะไม่ใช่ 0 (ค่าที่ถูกต้องเดียวที่ยอมรับได้เมื่อ array เป็น null)
     * ก็จะไม่ throw exception ซึ่งขัดกับ contract ที่ประกาศไว้ใน Javadoc
     * (throws IndexOutOfBoundsException if index < 0 || index > array.length)
     *
     * เทสนี้จะ FAIL บนโค้ดเวอร์ชันที่มี fault และ PASS บนเวอร์ชันที่แก้ไขแล้ว
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testAdd_Indexed_NullArray_NullElement_nonZeroIndex_DetectsLang37Defect() {
        Object[] nullArr = null;
        ArrayUtils.add(nullArr, 1, null);
    }

    @Test
    public void testAdd_Indexed_PrimitiveArrays_smoke() {
        assertArrayEquals(new int[] {9, 1, 2}, ArrayUtils.add(new int[] {1, 2}, 0, 9));
        assertArrayEquals(new int[] {1, 2, 9}, ArrayUtils.add(new int[] {1, 2}, 2, 9));
        try {
            ArrayUtils.add(new int[] {1, 2}, 5, 9);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) { /* expected */ }

        assertArrayEquals(new boolean[] {true, false}, ArrayUtils.add(new boolean[] {false}, 0, true));
        assertArrayEquals(new char[] {'x', 'a'}, ArrayUtils.add(new char[] {'a'}, 0, 'x'));
        assertArrayEquals(new byte[] {9, 1}, ArrayUtils.add(new byte[] {1}, 0, (byte) 9));
        assertArrayEquals(new short[] {9, 1}, ArrayUtils.add(new short[] {1}, 0, (short) 9));
        assertArrayEquals(new long[] {9L, 1L}, ArrayUtils.add(new long[] {1L}, 0, 9L));
        assertArrayEquals(new float[] {9f, 1f}, ArrayUtils.add(new float[] {1f}, 0, 9f), 0.0001f);
        assertArrayEquals(new double[] {9.0, 1.0}, ArrayUtils.add(new double[] {1.0}, 0, 9.0), 0.0001);
    }

    // =====================================================================
    // remove(array, index)
    // =====================================================================

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_ObjectArray_nullArray_throws() {
        String[] nullArr = null;
        ArrayUtils.remove(nullArr, 0);
    }

    @Test
    public void testRemove_ObjectArray_normal() {
        String[] arr = {"a", "b", "c"};
        assertArrayEquals(new String[] {"b", "c"}, ArrayUtils.remove(arr, 0));
        assertArrayEquals(new String[] {"a", "c"}, ArrayUtils.remove(arr, 1));
        assertArrayEquals(new String[] {"a", "b"}, ArrayUtils.remove(arr, 2)); // index == length-1
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_ObjectArray_negativeIndex_throws() {
        String[] arr = {"a", "b"};
        ArrayUtils.remove(arr, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_ObjectArray_indexEqualsLength_throws() {
        String[] arr = {"a", "b"};
        ArrayUtils.remove(arr, 2);
    }

    @Test
    public void testRemove_PrimitiveArrays_smoke() {
        assertArrayEquals(new int[] {2, 3}, ArrayUtils.remove(new int[] {1, 2, 3}, 0));
        assertArrayEquals(new double[] {1.0, 3.0}, ArrayUtils.remove(new double[] {1.0, 2.0, 3.0}, 1), 0.0001);
        assertArrayEquals(new boolean[] {false}, ArrayUtils.remove(new boolean[] {true, false}, 0));
        assertArrayEquals(new char[] {'a'}, ArrayUtils.remove(new char[] {'a', 'b'}, 1));
        assertArrayEquals(new byte[] {2}, ArrayUtils.remove(new byte[] {1, 2}, 0));
        assertArrayEquals(new short[] {1}, ArrayUtils.remove(new short[] {1, 2}, 1));
        assertArrayEquals(new long[] {2L}, ArrayUtils.remove(new long[] {1L, 2L}, 0));
        assertArrayEquals(new float[] {1f}, ArrayUtils.remove(new float[] {1f, 2f}, 1), 0.0001f);
    }

    // =====================================================================
    // removeElement(array, element)
    // =====================================================================

    @Test
    public void testRemoveElement_ObjectArray() {
        String[] nullArr = null;
        assertNull(ArrayUtils.removeElement(nullArr, "a"));

        String[] arr = {"a", "b", "a"};
        assertArrayEquals(new String[] {"a", "b", "a"}, ArrayUtils.removeElement(arr, "z")); // not found -> clone
        assertArrayEquals(new String[] {"b", "a"}, ArrayUtils.removeElement(arr, "a"));      // found first occurrence
    }

    @Test
    public void testRemoveElement_PrimitiveArrays_smoke() {
        assertArrayEquals(new int[] {1, 3}, ArrayUtils.removeElement(new int[] {1, 2, 3}, 2));
        assertArrayEquals(new int[] {1, 2, 3}, ArrayUtils.removeElement(new int[] {1, 2, 3}, 99));
        assertArrayEquals(new boolean[] {false}, ArrayUtils.removeElement(new boolean[] {true, false}, true));
        assertArrayEquals(new char[] {'b'}, ArrayUtils.removeElement(new char[] {'a', 'b'}, 'a'));
        assertArrayEquals(new byte[] {2}, ArrayUtils.removeElement(new byte[] {1, 2}, (byte) 1));
        assertArrayEquals(new short[] {2}, ArrayUtils.removeElement(new short[] {1, 2}, (short) 1));
        assertArrayEquals(new long[] {2L}, ArrayUtils.removeElement(new long[] {1L, 2L}, 1L));
        assertArrayEquals(new float[] {2f}, ArrayUtils.removeElement(new float[] {1f, 2f}, 1f), 0.0001f);
        assertArrayEquals(new double[] {2.0}, ArrayUtils.removeElement(new double[] {1.0, 2.0}, 1.0), 0.0001);
    }
}

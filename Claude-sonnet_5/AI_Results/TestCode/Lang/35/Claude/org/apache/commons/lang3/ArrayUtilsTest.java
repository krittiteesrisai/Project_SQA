package org.apache.commons.lang3;

import static org.junit.Assert.*;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ArrayUtilsTest {

    // =====================================================================
    // toString(Object) / toString(Object, String)
    // =====================================================================

    @Test
    public void testToString_NullArray_DefaultStringIfNull() {
        assertEquals("{}", ArrayUtils.toString(null));
    }

    @Test
    public void testToString_NullArray_CustomStringIfNull() {
        assertEquals("EMPTY", ArrayUtils.toString(null, "EMPTY"));
    }

    @Test
    public void testToString_NonNullArray() {
        int[] array = {1, 2, 3};
        String result = ArrayUtils.toString(array);
        assertNotNull(result);
        assertTrue(result.contains("1"));
        assertTrue(result.contains("2"));
        assertTrue(result.contains("3"));
    }

    // =====================================================================
    // isEquals
    // =====================================================================

    @Test
    public void testIsEquals_EqualArrays() {
        assertTrue(ArrayUtils.isEquals(new int[]{1, 2}, new int[]{1, 2}));
    }

    @Test
    public void testIsEquals_DifferentArrays() {
        assertFalse(ArrayUtils.isEquals(new int[]{1, 2}, new int[]{1, 3}));
    }

    @Test
    public void testIsEquals_BothNull() {
        assertTrue(ArrayUtils.isEquals(null, null));
    }

    // =====================================================================
    // toMap
    // =====================================================================

    @Test
    public void testToMap_NullInput_ReturnsNull() {
        assertNull(ArrayUtils.toMap(null));
    }

    @Test
    public void testToMap_WithMapEntry() {
        Map.Entry<String, String> entry = new AbstractMap.SimpleEntry<String, String>("k", "v");
        Map<Object, Object> map = ArrayUtils.toMap(new Object[]{entry});
        assertEquals("v", map.get("k"));
    }

    @Test
    public void testToMap_WithObjectArrayPair() {
        Object[][] data = {{"RED", "#F00"}, {"GREEN", "#0F0"}};
        Map<Object, Object> map = ArrayUtils.toMap(data);
        assertEquals("#F00", map.get("RED"));
        assertEquals("#0F0", map.get("GREEN"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToMap_ObjectArrayTooShort_Throws() {
        Object[] data = { new Object[]{"onlyOne"} };
        ArrayUtils.toMap(data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToMap_InvalidElementType_Throws() {
        Object[] data = { "not a Map.Entry nor an Array" };
        ArrayUtils.toMap(data);
    }

    // =====================================================================
    // toArray (varargs generic)
    // =====================================================================

    @Test
    public void testToArray_WithItems() {
        String[] result = ArrayUtils.toArray("1", "2");
        assertArrayEquals(new String[]{"1", "2"}, result);
    }

    @Test
    public void testToArray_Empty() {
        String[] result = ArrayUtils.<String>toArray();
        assertEquals(0, result.length);
    }

    // =====================================================================
    // clone - representative: T[], int[], long[]
    // =====================================================================

    @Test
    public void testClone_ObjectArray_Null() {
        assertNull(ArrayUtils.clone((String[]) null));
    }

    @Test
    public void testClone_ObjectArray_NonNull() {
        String[] array = {"a", "b"};
        String[] cloned = ArrayUtils.clone(array);
        assertNotSame(array, cloned);
        assertArrayEquals(array, cloned);
    }

    @Test
    public void testClone_IntArray_NullAndNonNull() {
        assertNull(ArrayUtils.clone((int[]) null));
        int[] array = {1, 2, 3};
        int[] cloned = ArrayUtils.clone(array);
        assertNotSame(array, cloned);
        assertArrayEquals(array, cloned);
    }

    @Test
    public void testClone_LongArray_NullAndNonNull() {
        assertNull(ArrayUtils.clone((long[]) null));
        long[] array = {1L, 2L};
        long[] cloned = ArrayUtils.clone(array);
        assertNotSame(array, cloned);
        assertArrayEquals(array, cloned);
    }
    // หมายเหตุ: clone(short[]), clone(char[]), clone(byte[]), clone(double[]),
    // clone(float[]), clone(boolean[]) มี logic เดียวกันทุกประการ (if null return null; else array.clone())

    // =====================================================================
    // subarray - representative: Object[], int[], long[]
    // =====================================================================

    @Test
    public void testSubarray_ObjectArray_Null() {
        assertNull(ArrayUtils.subarray((String[]) null, 0, 1));
    }

    @Test
    public void testSubarray_ObjectArray_NegativeStartPromotedToZero() {
        String[] array = {"a", "b", "c"};
        String[] result = ArrayUtils.subarray(array, -2, 2);
        assertArrayEquals(new String[]{"a", "b"}, result);
    }

    @Test
    public void testSubarray_ObjectArray_EndExceedsLengthDemoted() {
        String[] array = {"a", "b", "c"};
        String[] result = ArrayUtils.subarray(array, 1, 100);
        assertArrayEquals(new String[]{"b", "c"}, result);
    }

    @Test
    public void testSubarray_ObjectArray_NewSizeZeroOrNegative_ReturnsEmpty() {
        String[] array = {"a", "b", "c"};
        String[] result1 = ArrayUtils.subarray(array, 2, 2); // newSize == 0
        assertEquals(0, result1.length);
        String[] result2 = ArrayUtils.subarray(array, 5, 2); // newSize < 0
        assertEquals(0, result2.length);
    }

    @Test
    public void testSubarray_ObjectArray_NormalRange() {
        String[] array = {"a", "b", "c", "d"};
        String[] result = ArrayUtils.subarray(array, 1, 3);
        assertArrayEquals(new String[]{"b", "c"}, result);
    }

    @Test
    public void testSubarray_IntArray_AllBranches() {
        assertNull(ArrayUtils.subarray((int[]) null, 0, 1));
        int[] array = {1, 2, 3, 4};
        assertArrayEquals(new int[]{1, 2}, ArrayUtils.subarray(array, -1, 2));
        assertArrayEquals(new int[]{3, 4}, ArrayUtils.subarray(array, 2, 10));
        assertArrayEquals(new int[]{}, ArrayUtils.subarray(array, 3, 1));
        assertArrayEquals(new int[]{2, 3}, ArrayUtils.subarray(array, 1, 3));
    }

    @Test
    public void testSubarray_LongArray_AllBranches() {
        assertNull(ArrayUtils.subarray((long[]) null, 0, 1));
        long[] array = {1L, 2L, 3L};
        assertArrayEquals(new long[]{1L, 2L, 3L}, ArrayUtils.subarray(array, -1, 10));
        assertArrayEquals(new long[]{}, ArrayUtils.subarray(array, 3, 0));
    }
    // หมายเหตุ: subarray(short[]/char[]/byte[]/double[]/float[]/boolean[]) ใช้ logic เดียวกัน

    // =====================================================================
    // isSameLength - representative: Object[], int[]
    // =====================================================================

    @Test
    public void testIsSameLength_ObjectArray_AllBranches() {
        assertTrue(ArrayUtils.isSameLength((Object[]) null, (Object[]) null));
        assertTrue(ArrayUtils.isSameLength((Object[]) null, new Object[0]));
        assertFalse(ArrayUtils.isSameLength((Object[]) null, new Object[]{"a"}));
        assertFalse(ArrayUtils.isSameLength(new Object[]{"a"}, (Object[]) null));
        assertTrue(ArrayUtils.isSameLength(new Object[]{"a"}, new Object[]{"b"}));
        assertFalse(ArrayUtils.isSameLength(new Object[]{"a"}, new Object[]{"b", "c"}));
    }

    @Test
    public void testIsSameLength_IntArray_AllBranches() {
        assertTrue(ArrayUtils.isSameLength((int[]) null, (int[]) null));
        assertTrue(ArrayUtils.isSameLength((int[]) null, new int[0]));
        assertFalse(ArrayUtils.isSameLength((int[]) null, new int[]{1}));
        assertFalse(ArrayUtils.isSameLength(new int[]{1}, (int[]) null));
        assertTrue(ArrayUtils.isSameLength(new int[]{1}, new int[]{2}));
        assertFalse(ArrayUtils.isSameLength(new int[]{1}, new int[]{2, 3}));
    }
    // หมายเหตุ: isSameLength(long[]/short[]/char[]/byte[]/double[]/float[]/boolean[]) logic เดียวกัน

    // =====================================================================
    // getLength / isSameType
    // =====================================================================

    @Test
    public void testGetLength_Null() {
        assertEquals(0, ArrayUtils.getLength(null));
    }

    @Test
    public void testGetLength_ObjectArray() {
        assertEquals(3, ArrayUtils.getLength(new int[]{1, 2, 3}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLength_NotAnArray_Throws() {
        ArrayUtils.getLength("not an array");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameType_FirstNull_Throws() {
        ArrayUtils.isSameType(null, new int[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameType_SecondNull_Throws() {
        ArrayUtils.isSameType(new int[0], null);
    }

    @Test
    public void testIsSameType_SameType() {
        assertTrue(ArrayUtils.isSameType(new int[0], new int[5]));
    }

    @Test
    public void testIsSameType_DifferentType() {
        assertFalse(ArrayUtils.isSameType(new int[0], new String[0]));
    }

    // =====================================================================
    // reverse - representative: Object[], int[]
    // =====================================================================

    @Test
    public void testReverse_ObjectArray_Null_NoException() {
        ArrayUtils.reverse((Object[]) null); // ไม่ควร throw
    }

    @Test
    public void testReverse_ObjectArray_Empty() {
        Object[] array = {};
        ArrayUtils.reverse(array);
        assertEquals(0, array.length);
    }

    @Test
    public void testReverse_ObjectArray_SingleElement() {
        String[] array = {"a"};
        ArrayUtils.reverse(array);
        assertArrayEquals(new String[]{"a"}, array);
    }

    @Test
    public void testReverse_ObjectArray_EvenLength() {
        String[] array = {"a", "b", "c", "d"};
        ArrayUtils.reverse(array);
        assertArrayEquals(new String[]{"d", "c", "b", "a"}, array);
    }

    @Test
    public void testReverse_ObjectArray_OddLength() {
        String[] array = {"a", "b", "c"};
        ArrayUtils.reverse(array);
        assertArrayEquals(new String[]{"c", "b", "a"}, array);
    }

    @Test
    public void testReverse_IntArray_NullAndNormal() {
        ArrayUtils.reverse((int[]) null); // ไม่ควร throw
        int[] array = {1, 2, 3};
        ArrayUtils.reverse(array);
        assertArrayEquals(new int[]{3, 2, 1}, array);
    }
    // หมายเหตุ: reverse(long[]/short[]/char[]/byte[]/double[]/float[]/boolean[]) logic เดียวกัน

    // =====================================================================
    // indexOf / lastIndexOf / contains (Object[])
    // =====================================================================

    @Test
    public void testIndexOfObject_NullArray() {
        assertEquals(-1, ArrayUtils.indexOf((Object[]) null, "a"));
    }

    @Test
    public void testIndexOfObject_NullObjectToFind_Found() {
        Object[] array = {"a", null, "c"};
        assertEquals(1, ArrayUtils.indexOf(array, null));
    }

    @Test
    public void testIndexOfObject_Found() {
        String[] array = {"a", "b", "c"};
        assertEquals(1, ArrayUtils.indexOf(array, "b"));
    }

    @Test
    public void testIndexOfObject_NotFound() {
        String[] array = {"a", "b", "c"};
        assertEquals(-1, ArrayUtils.indexOf(array, "z"));
    }

    @Test
    public void testIndexOfObject_ComponentTypeMismatch_ReturnsNotFound() {
        // objectToFind ไม่ใช่ instance ของ componentType -> ข้าม loop -> คืน -1
        Integer[] array = {1, 2, 3};
        assertEquals(-1, ArrayUtils.indexOf(array, "not an integer"));
    }

    @Test
    public void testIndexOfObject_NegativeStartIndexPromotedToZero() {
        String[] array = {"a", "b", "c"};
        assertEquals(0, ArrayUtils.indexOf(array, "a", -5));
    }

    @Test
    public void testIndexOfObject_StartIndexBeyondLength() {
        String[] array = {"a", "b"};
        assertEquals(-1, ArrayUtils.indexOf(array, "a", 10));
    }

    @Test
    public void testLastIndexOfObject_NullArray() {
        assertEquals(-1, ArrayUtils.lastIndexOf((Object[]) null, "a"));
    }

    @Test
    public void testLastIndexOfObject_NegativeStartIndex() {
        String[] array = {"a", "b"};
        assertEquals(-1, ArrayUtils.lastIndexOf(array, "a", -1));
    }

    @Test
    public void testLastIndexOfObject_StartIndexBeyondLengthDemoted() {
        String[] array = {"a", "b", "a"};
        assertEquals(2, ArrayUtils.lastIndexOf(array, "a", 100));
    }

    @Test
    public void testLastIndexOfObject_NullObjectToFind_Found() {
        Object[] array = {"a", null, "c", null};
        assertEquals(3, ArrayUtils.lastIndexOf(array, null));
    }

    @Test
    public void testLastIndexOfObject_ComponentTypeMismatch() {
        Integer[] array = {1, 2, 3};
        assertEquals(-1, ArrayUtils.lastIndexOf(array, "x"));
    }

    @Test
    public void testContainsObject_NullArray_False() {
        assertFalse(ArrayUtils.contains((Object[]) null, "a"));
    }

    @Test
    public void testContainsObject_FoundAndNotFound() {
        String[] array = {"a", "b"};
        assertTrue(ArrayUtils.contains(array, "a"));
        assertFalse(ArrayUtils.contains(array, "z"));
    }

    // =====================================================================
    // indexOf / lastIndexOf / contains (int[]) - representative primitive
    // =====================================================================

    @Test
    public void testIndexOfInt_NullArray() {
        assertEquals(-1, ArrayUtils.indexOf((int[]) null, 1));
    }

    @Test
    public void testIndexOfInt_NegativeStartPromoted() {
        int[] array = {5, 6, 7};
        assertEquals(0, ArrayUtils.indexOf(array, 5, -3));
    }

    @Test
    public void testIndexOfInt_FoundAndNotFound() {
        int[] array = {5, 6, 7};
        assertEquals(2, ArrayUtils.indexOf(array, 7));
        assertEquals(-1, ArrayUtils.indexOf(array, 99));
    }

    @Test
    public void testLastIndexOfInt_NullArray() {
        assertEquals(-1, ArrayUtils.lastIndexOf((int[]) null, 1));
    }

    @Test
    public void testLastIndexOfInt_NegativeStartIndex() {
        int[] array = {1, 2};
        assertEquals(-1, ArrayUtils.lastIndexOf(array, 1, -1));
    }

    @Test
    public void testLastIndexOfInt_StartBeyondLengthDemoted() {
        int[] array = {1, 2, 1};
        assertEquals(2, ArrayUtils.lastIndexOf(array, 1, 999));
    }

    @Test
    public void testContainsInt_NullArray_False() {
        assertFalse(ArrayUtils.contains((int[]) null, 1));
    }

    @Test
    public void testContainsInt_FoundAndNotFound() {
        int[] array = {1, 2, 3};
        assertTrue(ArrayUtils.contains(array, 2));
        assertFalse(ArrayUtils.contains(array, 9));
    }
    // หมายเหตุ: indexOf/lastIndexOf/contains ของ long[]/short[]/char[]/byte[] logic เดียวกัน

    // =====================================================================
    // double[] indexOf / lastIndexOf (ใช้ isEmpty + tolerance) - สำคัญเพราะ logic ต่างจาก int
    // =====================================================================

    @Test
    public void testIndexOfDouble_NullOrEmptyArray() {
        assertEquals(-1, ArrayUtils.indexOf((double[]) null, 1.0));
        assertEquals(-1, ArrayUtils.indexOf(new double[0], 1.0));
    }

    @Test
    public void testIndexOfDouble_NegativeStartPromoted() {
        double[] array = {1.0, 2.0};
        assertEquals(0, ArrayUtils.indexOf(array, 1.0, -5));
    }

    @Test
    public void testIndexOfDouble_FoundAndNotFound() {
        double[] array = {1.0, 2.0, 3.0};
        assertEquals(1, ArrayUtils.indexOf(array, 2.0));
        assertEquals(-1, ArrayUtils.indexOf(array, 9.0));
    }

    @Test
    public void testIndexOfDoubleWithTolerance_WithinAndOutsideRange() {
        double[] array = {1.0, 5.0, 10.0};
        assertEquals(1, ArrayUtils.indexOf(array, 5.2, 0.5)); // within [4.7,5.7]
        assertEquals(-1, ArrayUtils.indexOf(array, 5.9, 0.5)); // outside tolerance
    }

    @Test
    public void testIndexOfDoubleWithTolerance_NullOrEmptyArray() {
        assertEquals(-1, ArrayUtils.indexOf((double[]) null, 1.0, 0.1));
        assertEquals(-1, ArrayUtils.indexOf(new double[0], 1.0, 0.1));
    }

    @Test
    public void testLastIndexOfDouble_NullOrEmptyArray() {
        assertEquals(-1, ArrayUtils.lastIndexOf((double[]) null, 1.0));
        assertEquals(-1, ArrayUtils.lastIndexOf(new double[0], 1.0));
    }

    @Test
    public void testLastIndexOfDouble_NegativeStartIndex() {
        double[] array = {1.0, 2.0};
        assertEquals(-1, ArrayUtils.lastIndexOf(array, 1.0, -1));
    }

    @Test
    public void testLastIndexOfDouble_StartBeyondLengthDemoted() {
        double[] array = {1.0, 2.0, 1.0};
        assertEquals(2, ArrayUtils.lastIndexOf(array, 1.0, 999));
    }

    @Test
    public void testLastIndexOfDoubleWithTolerance_WithinAndOutsideRange() {
        double[] array = {1.0, 5.0, 10.0};
        assertEquals(1, ArrayUtils.lastIndexOf(array, 5.3, 0.5));
        assertEquals(-1, ArrayUtils.lastIndexOf(array, 20.0, 0.5));
    }

    @Test
    public void testContainsDouble_Basic() {
        double[] array = {1.0, 2.0};
        assertTrue(ArrayUtils.contains(array, 1.0));
        assertFalse(ArrayUtils.contains(array, 9.0));
    }

    @Test
    public void testContainsDoubleWithTolerance() {
        double[] array = {1.0, 5.0};
        assertTrue(ArrayUtils.contains(array, 5.3, 0.5));
        assertFalse(ArrayUtils.contains(array, 100.0, 0.5));
    }
    // หมายเหตุ: float[]/boolean[] indexOf ใช้ ArrayUtils.isEmpty() เช่นกัน (logic เดียวกับ double ไม่รวม tolerance)

    @Test
    public void testIndexOfFloat_NullOrEmpty() {
        assertEquals(-1, ArrayUtils.indexOf((float[]) null, 1.0f));
        assertEquals(-1, ArrayUtils.indexOf(new float[0], 1.0f));
    }

    @Test
    public void testIndexOfBoolean_NullOrEmpty() {
        assertEquals(-1, ArrayUtils.indexOf((boolean[]) null, true));
        assertEquals(-1, ArrayUtils.indexOf(new boolean[0], true));
    }

    @Test
    public void testIndexOfBoolean_FoundAndNotFound() {
        boolean[] array = {false, true};
        assertEquals(1, ArrayUtils.indexOf(array, true));
        boolean[] arrayAllFalse = {false, false};
        assertEquals(-1, ArrayUtils.indexOf(arrayAllFalse, true));
    }

    // =====================================================================
    // toPrimitive / toObject - representative: Character, Integer, Boolean
    // =====================================================================

    @Test
    public void testToPrimitiveCharacter_Null() {
        assertNull(ArrayUtils.toPrimitive((Character[]) null));
    }

    @Test
    public void testToPrimitiveCharacter_Empty() {
        assertArrayEquals(new char[0], ArrayUtils.toPrimitive(new Character[0]));
    }

    @Test
    public void testToPrimitiveCharacter_Normal() {
        Character[] array = {'a', 'b'};
        assertArrayEquals(new char[]{'a', 'b'}, ArrayUtils.toPrimitive(array));
    }

    @Test(expected = NullPointerException.class)
    public void testToPrimitiveCharacter_NullElement_Throws() {
        Character[] array = {'a', null};
        ArrayUtils.toPrimitive(array);
    }

    @Test
    public void testToPrimitiveCharacterWithDefault_NullElementReplaced() {
        Character[] array = {'a', null};
        char[] result = ArrayUtils.toPrimitive(array, 'z');
        assertArrayEquals(new char[]{'a', 'z'}, result);
    }

    @Test
    public void testToPrimitiveCharacterWithDefault_NullAndEmptyArray() {
        assertNull(ArrayUtils.toPrimitive((Character[]) null, 'z'));
        assertArrayEquals(new char[0], ArrayUtils.toPrimitive(new Character[0], 'z'));
    }

    @Test
    public void testToObjectChar_NullEmptyNormal() {
        assertNull(ArrayUtils.toObject((char[]) null));
        assertArrayEquals(new Character[0], ArrayUtils.toObject(new char[0]));
        assertArrayEquals(new Character[]{'a', 'b'}, ArrayUtils.toObject(new char[]{'a', 'b'}));
    }

    @Test
    public void testToPrimitiveInteger_NullEmptyNormal() {
        assertNull(ArrayUtils.toPrimitive((Integer[]) null));
        assertArrayEquals(new int[0], ArrayUtils.toPrimitive(new Integer[0]));
        assertArrayEquals(new int[]{1, 2}, ArrayUtils.toPrimitive(new Integer[]{1, 2}));
    }

    @Test(expected = NullPointerException.class)
    public void testToPrimitiveInteger_NullElement_Throws() {
        ArrayUtils.toPrimitive(new Integer[]{1, null});
    }

    @Test
    public void testToPrimitiveIntegerWithDefault_NullReplaced() {
        int[] result = ArrayUtils.toPrimitive(new Integer[]{1, null}, -1);
        assertArrayEquals(new int[]{1, -1}, result);
    }

    @Test
    public void testToObjectInt_NullEmptyNormal() {
        assertNull(ArrayUtils.toObject((int[]) null));
        assertArrayEquals(new Integer[0], ArrayUtils.toObject(new int[0]));
        assertArrayEquals(new Integer[]{1, 2}, ArrayUtils.toObject(new int[]{1, 2}));
    }

    @Test
    public void testToPrimitiveBoolean_NullEmptyNormal() {
        assertNull(ArrayUtils.toPrimitive((Boolean[]) null));
        assertArrayEquals(new boolean[0], ArrayUtils.toPrimitive(new Boolean[0]));
        assertArrayEquals(new boolean[]{true, false}, ArrayUtils.toPrimitive(new Boolean[]{true, false}));
    }

    @Test(expected = NullPointerException.class)
    public void testToPrimitiveBoolean_NullElement_Throws() {
        ArrayUtils.toPrimitive(new Boolean[]{true, null});
    }

    @Test
    public void testToPrimitiveBooleanWithDefault_NullReplaced() {
        boolean[] result = ArrayUtils.toPrimitive(new Boolean[]{null, true}, true);
        assertArrayEquals(new boolean[]{true, true}, result);
    }

    @Test
    public void testToObjectBoolean_NullEmptyNormal() {
        assertNull(ArrayUtils.toObject((boolean[]) null));
        assertArrayEquals(new Boolean[0], ArrayUtils.toObject(new boolean[0]));
        assertArrayEquals(new Boolean[]{Boolean.TRUE, Boolean.FALSE}, ArrayUtils.toObject(new boolean[]{true, false}));
    }
    // หมายเหตุ: toPrimitive/toObject ของ Long/Short/Byte/Double/Float มี logic เดียวกันกับ Integer

    // =====================================================================
    // isEmpty - representative: T[], int[], double[]
    // =====================================================================

    @Test
    public void testIsEmptyObjectArray_AllBranches() {
        assertTrue(ArrayUtils.isEmpty((String[]) null));
        assertTrue(ArrayUtils.isEmpty(new String[0]));
        assertFalse(ArrayUtils.isEmpty(new String[]{"a"}));
    }

    @Test
    public void testIsEmptyIntArray_AllBranches() {
        assertTrue(ArrayUtils.isEmpty((int[]) null));
        assertTrue(ArrayUtils.isEmpty(new int[0]));
        assertFalse(ArrayUtils.isEmpty(new int[]{1}));
    }

    @Test
    public void testIsEmptyDoubleArray_AllBranches() {
        assertTrue(ArrayUtils.isEmpty((double[]) null));
        assertTrue(ArrayUtils.isEmpty(new double[0]));
        assertFalse(ArrayUtils.isEmpty(new double[]{1.0}));
    }
    // หมายเหตุ: isEmpty ของ long[]/short[]/char[]/byte[]/float[]/boolean[] logic เดียวกัน

    // =====================================================================
    // addAll - generic T[] (รวมกรณี ArrayStoreException -> IllegalArgumentException)
    // =====================================================================

    @Test
    public void testAddAllObject_BothNull() {
        assertNull(ArrayUtils.addAll((String[]) null, (String[]) null));
    }

    @Test
    public void testAddAllObject_Array2Null_ClonesArray1() {
        String[] array1 = {"a"};
        String[] result = ArrayUtils.addAll(array1, (String[]) null);
        assertArrayEquals(array1, result);
        assertNotSame(array1, result);
    }

    @Test
    public void testAddAllObject_Array1Null_ClonesArray2() {
        String[] array2 = {"b"};
        String[] result = ArrayUtils.addAll((String[]) null, array2);
        assertArrayEquals(array2, result);
        assertNotSame(array2, result);
    }

    @Test
    public void testAddAllObject_NormalJoin() {
        String[] array1 = {"a", "b"};
        String[] result = ArrayUtils.addAll(array1, "c", "d");
        assertArrayEquals(new String[]{"a", "b", "c", "d"}, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAllObject_IncompatibleTypes_ThrowsIllegalArgument() {
        String[] array1 = {"a", "b"};
        Object[] array2 = {Integer.valueOf(1)};
        ArrayUtils.addAll(array1, array2);
    }

    @Test
    public void testAddAllInt_AllBranches() {
        assertNull(ArrayUtils.addAll((int[]) null, (int[]) null));
        assertArrayEquals(new int[]{1}, ArrayUtils.addAll(new int[]{1}, (int[]) null));
        assertArrayEquals(new int[]{2}, ArrayUtils.addAll((int[]) null, new int[]{2}));
        assertArrayEquals(new int[]{1, 2, 3}, ArrayUtils.addAll(new int[]{1}, 2, 3));
    }

    @Test
    public void testAddAllBoolean_AllBranches() {
        assertNull(ArrayUtils.addAll((boolean[]) null, (boolean[]) null));
        assertArrayEquals(new boolean[]{true}, ArrayUtils.addAll(new boolean[]{true}, (boolean[]) null));
        assertArrayEquals(new boolean[]{false}, ArrayUtils.addAll((boolean[]) null, new boolean[]{false}));
        assertArrayEquals(new boolean[]{true, false}, ArrayUtils.addAll(new boolean[]{true}, false));
    }
    // หมายเหตุ: addAll ของ char/byte/short/long/float/double มี logic เดียวกับ int (ไม่มี ArrayStoreException check)

    // =====================================================================
    // add(T[], T) - ครอบคลุม 3 branch ของการเลือก type
    // =====================================================================

    @Test
    public void testAddObjectElement_ArrayNonNull() {
        String[] array = {"a", "b"};
        String[] result = ArrayUtils.add(array, "c");
        assertArrayEquals(new String[]{"a", "b", "c"}, result);
    }

    @Test
    public void testAddObjectElement_ArrayNull_ElementNonNull() {
        String[] result = ArrayUtils.add((String[]) null, "a");
        assertArrayEquals(new String[]{"a"}, result);
    }

    @Test
    public void testAddObjectElement_ArrayNullElementNull() {
        Object[] result = ArrayUtils.add((Object[]) null, (Object) null);
        assertEquals(1, result.length);
        assertNull(result[0]);
    }

    @Test
    public void testAddBoolean_Basic() {
        boolean[] result = ArrayUtils.add(new boolean[]{true}, false);
        assertArrayEquals(new boolean[]{true, false}, result);
    }
    // หมายเหตุ: add(byte/char/double/float/int/long/short, element) ใช้ copyArrayGrow1 เหมือนกันทุกตัว

    // =====================================================================
    // add(T[], index, element) / private add(Object,int,Object,Class)
    // =====================================================================

    @Test
    public void testAddGenericWithIndex_ArrayNullElementNull_IgnoresIndex() {
        // กรณีพิเศษ: array==null && element==null -> คืน [null] เสมอ
        // โดยไม่ตรวจสอบ index เลย (ไม่ throw แม้ index ผิดช่วง) - อาจเป็นจุดบกพร่องที่ควรดัก
        Object[] result = ArrayUtils.add((Object[]) null, 99, null);
        assertEquals(1, result.length);
        assertNull(result[0]);
    }

    @Test
    public void testAddGenericWithIndex_ArrayNullElementNonNull_IndexZero() {
        String[] result = ArrayUtils.add((String[]) null, 0, "a");
        assertArrayEquals(new String[]{"a"}, result);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddGenericWithIndex_ArrayNullElementNonNull_IndexNotZero_Throws() {
        ArrayUtils.add((String[]) null, 1, "a");
    }

    @Test
    public void testAddGenericWithIndex_NormalInsertMiddle() {
        String[] array = {"a", "b", "c"};
        String[] result = ArrayUtils.add(array, 1, "x");
        assertArrayEquals(new String[]{"a", "x", "b", "c"}, result);
    }

    @Test
    public void testAddGenericWithIndex_InsertAtEnd() {
        String[] array = {"a", "b"};
        String[] result = ArrayUtils.add(array, 2, "c");
        assertArrayEquals(new String[]{"a", "b", "c"}, result);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddGenericWithIndex_NegativeIndex_Throws() {
        String[] array = {"a"};
        ArrayUtils.add(array, -1, "x");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddGenericWithIndex_IndexGreaterThanLength_Throws() {
        String[] array = {"a"};
        ArrayUtils.add(array, 5, "x");
    }

    @Test
    public void testAddIntWithIndex_ArrayNull_IndexZero() {
        int[] result = ArrayUtils.add((int[]) null, 0, 5);
        assertArrayEquals(new int[]{5}, result);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddIntWithIndex_ArrayNull_IndexNotZero_Throws() {
        // ต่างจาก generic add(T[],index,element) เพราะ int[] ไม่ผ่าน short-circuit ของ (array==null && element==null)
        ArrayUtils.add((int[]) null, 1, 5);
    }

    @Test
    public void testAddIntWithIndex_NormalInsert() {
        int[] array = {1, 2, 3};
        assertArrayEquals(new int[]{9, 1, 2, 3}, ArrayUtils.add(array, 0, 9));
        assertArrayEquals(new int[]{1, 2, 3, 9}, ArrayUtils.add(array, 3, 9));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddIntWithIndex_OutOfBounds_Throws() {
        int[] array = {1, 2};
        ArrayUtils.add(array, 10, 9);
    }

    // =====================================================================
    // remove(T[], index) / remove(int[], index) / private remove
    // =====================================================================

    @Test
    public void testRemoveGeneric_ValidIndex() {
        String[] array = {"a", "b", "c"};
        assertArrayEquals(new String[]{"a", "c"}, ArrayUtils.remove(array, 1));
    }

    @Test
    public void testRemoveGeneric_LastIndex_NoSecondArraycopy() {
        String[] array = {"a", "b"};
        assertArrayEquals(new String[]{"a"}, ArrayUtils.remove(array, 1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveGeneric_NegativeIndex_Throws() {
        ArrayUtils.remove(new String[]{"a"}, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveGeneric_IndexEqualsLength_Throws() {
        ArrayUtils.remove(new String[]{"a"}, 1);
    }

    @Test
    public void testRemoveInt_ValidIndex() {
        int[] array = {1, 2, 3};
        assertArrayEquals(new int[]{1, 3}, ArrayUtils.remove(array, 1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveInt_OutOfBounds_Throws() {
        ArrayUtils.remove(new int[]{1}, 5);
    }

    // =====================================================================
    // removeElement - representative: T[], int[]
    // =====================================================================

    @Test
    public void testRemoveElementGeneric_NullArray() {
        assertNull(ArrayUtils.removeElement((String[]) null, "a"));
    }

    @Test
    public void testRemoveElementGeneric_NotFound_ReturnsClone() {
        String[] array = {"a", "b"};
        String[] result = ArrayUtils.removeElement(array, "z");
        assertArrayEquals(array, result);
        assertNotSame(array, result);
    }

    @Test
    public void testRemoveElementGeneric_Found_RemovesFirstOccurrence() {
        String[] array = {"a", "b", "a"};
        String[] result = ArrayUtils.removeElement(array, "a");
        assertArrayEquals(new String[]{"b", "a"}, result);
    }

    @Test
    public void testRemoveElementInt_NotFoundAndFound() {
        int[] array = {1, 3, 1};
        assertArrayEquals(new int[]{1, 3, 1}, ArrayUtils.removeElement(array, 9));
        assertArrayEquals(new int[]{3, 1}, ArrayUtils.removeElement(array, 1));
    }
}

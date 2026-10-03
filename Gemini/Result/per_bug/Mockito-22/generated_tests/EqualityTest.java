package org.mockito.internal.matchers;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

public class EqualityTest {

    // -------------------------------------------------------------------------
    // 1. Constructor Coverage
    // -------------------------------------------------------------------------
    @Test
    public void testConstructorInstantiation() {
        Equality equality = new Equality();
        assertNotNull(equality);
    }

    // -------------------------------------------------------------------------
    // 2. Null Checks
    // -------------------------------------------------------------------------
    @Test
    public void testBothNull() {
        assertTrue(Equality.areEqual(null, null));
    }

    @Test
    public void testFirstNullSecondNotNull() {
        assertFalse(Equality.areEqual(null, "someObject"));
        assertFalse(Equality.areEqual(null, new int[]{1, 2, 3}));
    }

    @Test
    public void testFirstNotNullSecondNull() {
        assertFalse(Equality.areEqual("someObject", null));
        assertFalse(Equality.areEqual(new int[]{1, 2, 3}, null));
    }

    // -------------------------------------------------------------------------
    // 3. Standard Non-Array Objects
    // -------------------------------------------------------------------------
    @Test
    public void testNonArrayObjectsEqual() {
        assertTrue(Equality.areEqual("mockito", new String("mockito")));
        assertTrue(Equality.areEqual(100, Integer.valueOf(100)));
    }

    @Test
    public void testNonArrayObjectsNotEqual() {
        assertFalse(Equality.areEqual("mockito", "junit"));
        assertFalse(Equality.areEqual(100, 200));
        assertFalse(Equality.areEqual(100, "100"));
    }

    // -------------------------------------------------------------------------
    // 4. Mixed Array and Non-Array
    // -------------------------------------------------------------------------
    @Test
    public void testFirstIsArraySecondIsNotArray() {
        assertFalse(Equality.areEqual(new int[]{1, 2}, "not an array"));
        assertFalse(Equality.areEqual(new Object[]{"a"}, 123));
    }

    @Test
    public void testFirstIsNotArraySecondIsArray() {
        assertFalse(Equality.areEqual("not an array", new int[]{1, 2}));
        assertFalse(Equality.areEqual(123, new Object[]{"a"}));
    }

    // -------------------------------------------------------------------------
    // 5. Empty Arrays Boundary
    // -------------------------------------------------------------------------
    @Test
    public void testEmptyArraysEqual() {
        assertTrue(Equality.areEqual(new int[]{}, new int[]{}));
        assertTrue(Equality.areEqual(new String[]{}, new String[]{}));
        assertTrue(Equality.areEqual(new Object[]{}, new Object[]{}));
    }

    @Test
    public void testEmptyArraysOfDifferentTypes() {
        // Empty primitive vs Empty Object or different primitive types
        assertTrue(Equality.areEqual(new int[]{}, new long[]{}));
        assertTrue(Equality.areEqual(new int[]{}, new Object[]{}));
    }

    // -------------------------------------------------------------------------
    // 6. Primitive Arrays Equality (All Primitive Types)
    // -------------------------------------------------------------------------
    @Test
    public void testPrimitiveArraysEqual() {
        assertTrue(Equality.areEqual(new boolean[]{true, false}, new boolean[]{true, false}));
        assertTrue(Equality.areEqual(new byte[]{1, 2, 3}, new byte[]{1, 2, 3}));
        assertTrue(Equality.areEqual(new char[]{'a', 'b'}, new char[]{'a', 'b'}));
        assertTrue(Equality.areEqual(new short[]{10, 20}, new short[]{10, 20}));
        assertTrue(Equality.areEqual(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        assertTrue(Equality.areEqual(new long[]{100L, 200L}, new long[]{100L, 200L}));
        assertTrue(Equality.areEqual(new float[]{1.0f, 2.5f}, new float[]{1.0f, 2.5f}));
        assertTrue(Equality.areEqual(new double[]{1.1, 2.2}, new double[]{1.1, 2.2}));
    }

    @Test
    public void testPrimitiveArraysDifferentValues() {
        assertFalse(Equality.areEqual(new boolean[]{true, false}, new boolean[]{false, true}));
        assertFalse(Equality.areEqual(new byte[]{1, 2}, new byte[]{1, 3}));
        assertFalse(Equality.areEqual(new char[]{'a', 'b'}, new char[]{'a', 'c'}));
        assertFalse(Equality.areEqual(new short[]{1, 2}, new short[]{1, 5}));
        assertFalse(Equality.areEqual(new int[]{1, 2, 3}, new int[]{1, 2, 4}));
        assertFalse(Equality.areEqual(new long[]{100L}, new long[]{200L}));
        assertFalse(Equality.areEqual(new float[]{1.0f}, new float[]{2.0f}));
        assertFalse(Equality.areEqual(new double[]{1.1}, new double[]{1.2}));
    }

    @Test
    public void testPrimitiveArraysDifferentLengths() {
        assertFalse(Equality.areEqual(new int[]{1, 2, 3}, new int[]{1, 2}));
        assertFalse(Equality.areEqual(new boolean[]{true}, new boolean[]{true, false}));
        assertFalse(Equality.areEqual(new byte[]{1, 2}, new byte[]{1}));
        assertFalse(Equality.areEqual(new char[]{'a'}, new char[]{'a', 'b'}));
    }

    @Test
    public void testDifferentPrimitiveArrayTypesWithSameElements() {
        // int[] vs long[]: Array.get autoboxes to Integer vs Long -> equals returns false
        assertFalse(Equality.areEqual(new int[]{1, 2}, new long[]{1L, 2L}));
        assertFalse(Equality.areEqual(new int[]{1}, new double[]{1.0}));
    }

    // -------------------------------------------------------------------------
    // 7. Object Arrays Equality
    // -------------------------------------------------------------------------
    @Test
    public void testObjectArraysEqual() {
        String[] s1 = new String[]{"apple", "banana"};
        String[] s2 = new String[]{"apple", "banana"};
        assertTrue(Equality.areEqual(s1, s2));

        Object[] o1 = new Object[]{"test", 123, true};
        Object[] o2 = new Object[]{"test", 123, true};
        assertTrue(Equality.areEqual(o1, o2));
    }

    @Test
    public void testObjectArraysNotEqual() {
        String[] s1 = new String[]{"apple", "banana"};
        String[] s2 = new String[]{"apple", "orange"};
        assertFalse(Equality.areEqual(s1, s2));

        Object[] o1 = new Object[]{"test", 123};
        Object[] o2 = new Object[]{"test", 124};
        assertFalse(Equality.areEqual(o1, o2));
    }

    @Test
    public void testObjectArraysWithNullElements() {
        Object[] o1 = new Object[]{"a", null, "b"};
        Object[] o2 = new Object[]{"a", null, "b"};
        assertTrue(Equality.areEqual(o1, o2));

        Object[] o3 = new Object[]{"a", "notNull", "b"};
        assertFalse(Equality.areEqual(o1, o3));
    }

    // -------------------------------------------------------------------------
    // 8. Multi-dimensional and Nested Arrays
    // -------------------------------------------------------------------------
    @Test
    public void testMultiDimensionalPrimitiveArraysEqual() {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{1, 2}, {3, 4}};
        assertTrue(Equality.areEqual(matrix1, matrix2));
    }

    @Test
    public void testMultiDimensionalPrimitiveArraysNotEqual() {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{1, 2}, {3, 5}};
        assertFalse(Equality.areEqual(matrix1, matrix2));

        int[][] matrix3 = {{1, 2}, {3}};
        assertFalse(Equality.areEqual(matrix1, matrix3));
    }

    @Test
    public void testDeepNestedObjectArrays() {
        Object[] nested1 = new Object[]{new Object[]{new int[]{1, 2}}, "text"};
        Object[] nested2 = new Object[]{new Object[]{new int[]{1, 2}}, "text"};
        assertTrue(Equality.areEqual(nested1, nested2));

        Object[] nested3 = new Object[]{new Object[]{new int[]{1, 3}}, "text"};
        assertFalse(Equality.areEqual(nested1, nested3));
    }
}
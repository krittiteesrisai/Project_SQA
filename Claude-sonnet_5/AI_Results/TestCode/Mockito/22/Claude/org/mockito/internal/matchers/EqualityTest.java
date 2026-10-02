package org.mockito.internal.matchers;

import org.junit.Test;
import static org.junit.Assert.*;

public class EqualityTest {

    // ---------- areEqual : null handling ----------

    @Test
    public void testAreEqual_bothNull() {
        // o1 == null || o2 == null -> true, then o1==null && o2==null -> true
        assertTrue(Equality.areEqual(null, null));
    }

    @Test
    public void testAreEqual_firstNullSecondNotNull() {
        // o1 == null branch true (short-circuit), o2==null false -> overall false
        assertFalse(Equality.areEqual(null, "abc"));
    }

    @Test
    public void testAreEqual_firstNotNullSecondNull() {
        // o1 == null false, o2 == null true -> overall false
        assertFalse(Equality.areEqual("abc", null));
    }

    // ---------- areEqual : non-null, non-array branch ----------

    @Test
    public void testAreEqual_nonArrayEqualObjects() {
        // isArray(o1) false -> fall to else : o1.equals(o2) -> true
        assertTrue(Equality.areEqual("hello", "hello"));
    }

    @Test
    public void testAreEqual_nonArrayDifferentObjects() {
        // isArray(o1) false -> o1.equals(o2) -> false
        assertFalse(Equality.areEqual("hello", "world"));
    }

    @Test
    public void testAreEqual_nonArrayDifferentTypes() {
        // o1 not array, equals() returns false due to type mismatch
        assertFalse(Equality.areEqual(Integer.valueOf(1), "1"));
    }

    // ---------- areEqual : array branch ----------

    @Test
    public void testAreEqual_firstArraySecondNotArray() {
        // isArray(o1) true, isArray(o2) false -> overall false
        int[] arr = {1, 2, 3};
        assertFalse(Equality.areEqual(arr, "not an array"));
    }

    @Test
    public void testAreEqual_bothArraysEqualContent() {
        // isArray(o1) true, isArray(o2) true -> areArraysEqual -> true
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3};
        assertTrue(Equality.areEqual(a1, a2));
    }

    @Test
    public void testAreEqual_bothArraysDifferentContent() {
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 4};
        assertFalse(Equality.areEqual(a1, a2));
    }

    @Test
    public void testAreEqual_bothArraysDifferentLength() {
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2};
        assertFalse(Equality.areEqual(a1, a2));
    }

    @Test
    public void testAreEqual_bothArraysEmpty() {
        int[] a1 = {};
        int[] a2 = {};
        assertTrue(Equality.areEqual(a1, a2));
    }

    @Test
    public void testAreEqual_nestedArrays() {
        // recursive call areEqual within areArrayElementsEqual -> isArray(element) true
        int[][] a1 = {{1, 2}, {3, 4}};
        int[][] a2 = {{1, 2}, {3, 4}};
        assertTrue(Equality.areEqual(a1, a2));
    }

    @Test
    public void testAreEqual_nestedArraysDifferent() {
        int[][] a1 = {{1, 2}, {3, 4}};
        int[][] a2 = {{1, 2}, {3, 5}};
        assertFalse(Equality.areEqual(a1, a2));
    }

    @Test
    public void testAreEqual_objectArraysContainingNulls() {
        // element-wise areEqual called with null elements -> covers null branch inside recursion
        Object[] a1 = {null, "x"};
        Object[] a2 = {null, "x"};
        assertTrue(Equality.areEqual(a1, a2));
    }

    @Test
    public void testAreEqual_objectArraysContainingNullMismatch() {
        Object[] a1 = {null, "x"};
        Object[] a2 = {"y", "x"};
        assertFalse(Equality.areEqual(a1, a2));
    }

    // ---------- areArraysEqual (package-private) ----------

    @Test
    public void testAreArraysEqual_lengthsDifferentShortCircuits() {
        // areArrayLengthsEqual false -> should short-circuit without checking elements
        int[] a1 = {1};
        int[] a2 = {1, 2};
        assertFalse(Equality.areArraysEqual(a1, a2));
    }

    @Test
    public void testAreArraysEqual_lengthsEqualElementsEqual() {
        int[] a1 = {5, 6};
        int[] a2 = {5, 6};
        assertTrue(Equality.areArraysEqual(a1, a2));
    }

    @Test
    public void testAreArraysEqual_lengthsEqualElementsDifferent() {
        int[] a1 = {5, 6};
        int[] a2 = {5, 7};
        assertFalse(Equality.areArraysEqual(a1, a2));
    }

    // ---------- areArrayLengthsEqual (package-private) ----------

    @Test
    public void testAreArrayLengthsEqual_equal() {
        int[] a1 = {1, 2, 3};
        int[] a2 = {9, 8, 7};
        assertTrue(Equality.areArrayLengthsEqual(a1, a2));
    }

    @Test
    public void testAreArrayLengthsEqual_notEqual() {
        int[] a1 = {1, 2, 3};
        int[] a2 = {9, 8};
        assertFalse(Equality.areArrayLengthsEqual(a1, a2));
    }

    @Test
    public void testAreArrayLengthsEqual_bothEmpty() {
        int[] a1 = {};
        int[] a2 = {};
        assertTrue(Equality.areArrayLengthsEqual(a1, a2));
    }

    // ---------- areArrayElementsEqual (package-private) : loop branches ----------

    @Test
    public void testAreArrayElementsEqual_emptyArray_loopNeverRuns() {
        // loop condition false immediately -> returns true
        int[] a1 = {};
        int[] a2 = {};
        assertTrue(Equality.areArrayElementsEqual(a1, a2));
    }

    @Test
    public void testAreArrayElementsEqual_allElementsEqual_loopCompletes() {
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3};
        assertTrue(Equality.areArrayElementsEqual(a1, a2));
    }

    @Test
    public void testAreArrayElementsEqual_firstElementDifferent_earlyReturn() {
        // if branch true at i=0 -> immediate false
        int[] a1 = {1, 2, 3};
        int[] a2 = {9, 2, 3};
        assertFalse(Equality.areArrayElementsEqual(a1, a2));
    }

    @Test
    public void testAreArrayElementsEqual_lastElementDifferent() {
        // loop iterates through earlier equal elements, fails on the last one
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 9};
        assertFalse(Equality.areArrayElementsEqual(a1, a2));
    }

    // ---------- isArray (package-private) ----------

    @Test
    public void testIsArray_true() {
        int[] arr = {1, 2};
        assertTrue(Equality.isArray(arr));
    }

    @Test
    public void testIsArray_false() {
        assertFalse(Equality.isArray("not array"));
    }

    @Test(expected = NullPointerException.class)
    public void testIsArray_nullThrowsNPE() {
        // isArray calls o.getClass() directly; null input is not guarded here.
        // Note: in areEqual this path is never reached with null because of the
        // earlier null-check short-circuit, but isArray itself has no null guard.
        Equality.isArray(null);
    }
}

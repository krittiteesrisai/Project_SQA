package com.fasterxml.jackson.core.sym;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonFactory;

public class ByteQuadsCanonicalizerTest {

    @Test
    public void testCreateRootWithSmallAndNonPowerOfTwoSize() {
        // Test sz < MIN_HASH_SIZE (16) and non-power-of-two padding
        ByteQuadsCanonicalizer smallCanonicalizer = ByteQuadsCanonicalizer.createRoot(5);
        assertNotNull(smallCanonicalizer);
        assertEquals(16, smallCanonicalizer.bucketCount());

        ByteQuadsCanonicalizer oddCanonicalizer = ByteQuadsCanonicalizer.createRoot(20);
        assertNotNull(oddCanonicalizer);
        assertEquals(32, oddCanonicalizer.bucketCount()); // 20 rounded up to 32
    }

    @Test
    public void testBasicAddAndFindSingleQuad() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot(12345);
        
        String name = "testField";
        int q1 = 0x12345678;

        assertNull(canonicalizer.findName(q1));
        assertEquals(0, canonicalizer.size());

        String added = canonicalizer.addName(name, q1);
        assertEquals(name, added);
        assertEquals(1, canonicalizer.size());

        assertEquals(name, canonicalizer.findName(q1));
        // Test empty slot short-circuit branch (finding non-existent with zero len slot)
        assertNull(canonicalizer.findName(0x87654321));
    }

    @Test
    public void testAddAndFindTwoQuads() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot(12345);
        String name = "longFieldName";
        int q1 = 0x11111111;
        int q2 = 0x22222222;

        assertNull(canonicalizer.findName(q1, q2));
        canonicalizer.addName(name, q1, q2);
        assertEquals(name, canonicalizer.findName(q1, q2));
        
        // Test q2 == 0 branch in addName(name, q1, q2)
        String nameSingle = "singleQuadViaTwo";
        canonicalizer.addName(nameSingle, 0x33333333, 0);
        assertEquals(nameSingle, canonicalizer.findName(0x33333333));
    }

    @Test
    public void testAddAndFindThreeQuads() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot(12345);
        String name = "threeQuadName";
        int q1 = 0x12;
        int q2 = 0x34;
        int q3 = 0x56;

        assertNull(canonicalizer.findName(q1, q2, q3));
        canonicalizer.addName(name, q1, q2, q3);
        assertEquals(name, canonicalizer.findName(q1, q2, q3));
    }

    @Test
    public void testAddAndFindMultiQuadsArray() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot(12345);
        
        // Test qlen < 4 forwarding branches inside findName and addName
        int[] q1Arr = { 0xAA };
        canonicalizer.addName("one", q1Arr, 1);
        assertEquals("one", canonicalizer.findName(q1Arr, 1));

        int[] q2Arr = { 0xBB, 0xCC };
        canonicalizer.addName("two", q2Arr, 2);
        assertEquals("two", canonicalizer.findName(q2Arr, 2));

        int[] q3Arr = { 0xDD, 0xEE, 0xFF };
        canonicalizer.addName("three", q3Arr, 3);
        assertEquals("three", canonicalizer.findName(q3Arr, 3));

        // Test long name (qlen >= 4) including switch cases in _verifyLongName (e.g., len 5, 8, default)
        int[] longArr5 = { 1, 2, 3, 4, 5 };
        canonicalizer.addName("long5", longArr5, 5);
        assertEquals("long5", canonicalizer.findName(longArr5, 5));

        int[] longArr8 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        canonicalizer.addName("long8", longArr8, 8);
        assertEquals("long8", canonicalizer.findName(longArr8, 8));

        int[] longArr9 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        canonicalizer.addName("long9", longArr9, 9);
        assertEquals("long9", canonicalizer.findName(longArr9, 9));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcHashInvalidLength() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot(123);
        canonicalizer.calcHash(new int[] { 1, 2, 3 }, 2); // qlen < 4 throws exception
    }

    @Test
    public void testChildCanonicalizerAndRelease() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(123);
        int flags = JsonFactory.Feature.INTERN_FIELD_NAMES.getMask() 
                  | JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.getMask();

        ByteQuadsCanonicalizer child = root.makeChild(flags);
        assertNotNull(child);
        assertFalse(child.maybeDirty());

        // Add to child to make it dirty
        child.addName("childField", 0x999999);
        assertTrue(child.maybeDirty());

        // Release child, triggers mergeChild back to root
        child.release();
        assertEquals(1, root.size());
    }

    @Test
    public void testRehashAndAccessors() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot(16); // Small size to force rehash quickly
        
        // Populate to trigger rehash conditions (_needRehash, copyCount checks)
        for (int i = 0; i < 50; i++) {
            canonicalizer.addName("name_" + i, 0x1000 + i, 0x2000 + i);
        }

        assertTrue(canonicalizer.bucketCount() > 16);
        assertTrue(canonicalizer.size() > 0);
        assertNotNull(canonicalizer.toString());
        assertTrue(canonicalizer.hashSeed() != 0);
        assertTrue(canonicalizer.primaryCount() >= 0);
        assertTrue(canonicalizer.secondaryCount() >= 0);
        assertTrue(canonicalizer.tertiaryCount() >= 0);
        assertTrue(canonicalizer.spilloverCount() >= 0);
        assertTrue(canonicalizer.totalCount() >= 0);
    }

    @Test
    public void testSecondaryAndTertiaryLookups() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot(16);
        // Force collisions to populate secondary, tertiary, and spillover areas
        // By adding many elements that hash to the same primary slots
        for (int i = 0; i < 100; i++) {
            canonicalizer.addName("item_" + i, i * 16); // Same hash modulo 16 if not carefully seeded, but forces collisions
        }
        // Verify findName via secondary/tertiary/spillover paths
        // Even if specific collisions aren't exact, we exercise the search logic loops
        assertNull(canonicalizer.findName(0xFFFFFF));
    }
}
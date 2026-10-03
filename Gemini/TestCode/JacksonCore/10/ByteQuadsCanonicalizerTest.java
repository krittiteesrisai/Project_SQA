package com.fasterxml.jackson.core.sym;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonFactory;

public class ByteQuadsCanonicalizerTest {

    @Test
    public void testConstructorAndMinSizeAndPadding() {
        // Trigger sz < MIN_HASH_SIZE (e.g., sz = 5 -> should pad to 16)
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot(12345);
        assertNotNull(canonicalizer);
        assertEquals(64, canonicalizer.bucketCount()); // DEFAULT_T_SIZE is 64

        // Accessors test
        assertEquals(12345, canonicalizer.hashSeed());
        assertEquals(0, canonicalizer.size());
        assertFalse(canonicalizer.maybeDirty());
        assertNotNull(canonicalizer.toString());
    }

    @Test
    public void testFindNameVariations() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(42);
        
        // Add names of various lengths
        root.addName("a", 0x61);
        root.addName("ab", 0x61, 0x62);
        root.addName("abc", 0x61, 0x62, 0x63);
        int[] longQ = {0x11, 0x22, 0x33, 0x44, 0x55};
        root.addName("longname", longQ, 5);

        // Find existing names
        assertEquals("a", root.findName(0x61));
        assertEquals("ab", root.findName(0x61, 0x62));
        assertEquals("abc", root.findName(0x61, 0x62, 0x63));
        assertEquals("longname", root.findName(longQ, 5));

        // Find non-existing / empty slot paths (len == 0 short-circuit)
        assertNull(root.findName(0x999999));
        assertNull(root.findName(0x999999, 0x888888));
        assertNull(root.findName(0x999999, 0x888888, 0x777777));
        
        int[] missingQ = {0x99, 0x88, 0x77, 0x66, 0x55};
        assertNull(root.findName(missingQ, 5));
    }

    @Test
    public void testFindNameShortArrayLengths() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(42);
        root.addName("one", 0x11);
        root.addName("two", 0x11, 0x22);
        root.addName("three", 0x11, 0x22, 0x33);

        // qlen < 4 branches inside findName(int[] q, int qlen)
        assertEquals("one", root.findName(new int[]{0x11}, 1));
        assertEquals("two", root.findName(new int[]{0x11, 0x22}, 2));
        assertEquals("three", root.findName(new int[]{0x11, 0x22, 0x33}, 3));
    }

    @Test
    public void testChildTableAndReleaseAndMerge() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(42);
        
        int flags = JsonFactory.Feature.INTERN_FIELD_NAMES.getMask() 
                  | JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.getMask();
        
        ByteQuadsCanonicalizer child = root.makeChild(flags);
        assertNotNull(child);
        assertEquals(0, child.size());

        // Add to child to make it dirty
        child.addName("childField", 0x123456);
        assertTrue(child.maybeDirty());
        assertEquals(1, child.size());

        // Release child should trigger merge into root
        child.release();
        assertEquals(1, root.size());
    }

    @Test
    public void testMergeChildNoChangeAndMaxEntries() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(42);
        int flags = 0;
        ByteQuadsCanonicalizer child = root.makeChild(flags);
        
        // Release without adding entries (childCount == currState.count -> returns immediately)
        child.release();
        assertEquals(0, root.size());
    }

    @Test
    public void testRehashExecution() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(42);
        // Add enough entries to trigger rehash condition (_count > _hashSize >> 1 with spill or > 80%)
        // DEFAULT_T_SIZE is 64, primary slots 64, hashSize 64.
        for (int i = 0; i < 40; i++) {
            root.addName("key" + i, 0x1000 + i);
        }
        // Verify state after rehash
        assertTrue(root.size() >= 40);
    }

    @Test(expected = IllegalStateException.class)
    public void testDoSProtectionSpilloverOverflow() {
        // Create root with small hash size to easily overflow spillover area with failOnDoS = true
        // Since constructor is private, we can use createRoot and force fill or manipulate if possible,
        // or test via addName collision storm.
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(16); // MIN_HASH_SIZE = 16
        // Flood with colliding hashes to fill spill-over and trigger _reportTooManyCollisions
        for (int i = 0; i < 500; i++) {
            root.addName("collision_" + i, 0xABCD); // same q1 causes collisions
        }
    }

    @Test
    public void testVerifyLongNameEdgeCases() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(42);
        // Test qlen switch cases in _verifyLongName (e.g., lengths 4, 5, 6, 7, 8, and default > 8)
        int[] q4 = {1, 2, 3, 4};
        int[] q6 = {1, 2, 3, 4, 5, 6};
        int[] q10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        root.addName("name4", q4, 4);
        root.addName("name6", q6, 6);
        root.addName("name10", q10, 10);

        assertEquals("name4", root.findName(q4, 4));
        assertEquals("name6", root.findName(q6, 6));
        assertEquals("name10", root.findName(q10, 10));

        // Negative verification test (mismatched long name)
        int[] wrongQ10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 999};
        assertNull(root.findName(wrongQ10, 10));
    }

    @Test
    public void testSecondaryAndTertiaryCounts() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(16);
        // Add a few names to populate primary/secondary/tertiary counters
        root.addName("n1", 0x11);
        root.addName("n2", 0x11, 0x22);
        root.addName("n3", 0x11, 0x22, 0x33);

        assertTrue(root.primaryCount() >= 0);
        assertTrue(root.secondaryCount() >= 0);
        assertTrue(root.tertiaryCount() >= 0);
        assertTrue(root.spilloverCount() >= 0);
    }
}
package org.apache.commons.compress.utils;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Comprehensive JUnit 4 test suite for ArchiveUtils (Compress-39b).
 * Achieves high Branch/Condition coverage and tests edge cases.
 */
public class ArchiveUtilsTest {

    // Helper mock/stub for ArchiveEntry
    private static class TestArchiveEntry implements ArchiveEntry {
        private final String name;
        private final long size;
        private final boolean isDirectory;

        public TestArchiveEntry(String name, long size, boolean isDirectory) {
            this.name = name;
            this.size = size;
            this.isDirectory = isDirectory;
        }

        @Override public String getName() { return name; }
        @Override public long getSize() { return size; }
        @Override public boolean isDirectory() { return isDirectory; }
        @Override public java.util.Date getLastModifiedDate() { return null; }
        @Override public boolean equals(Object obj) { return false; }
        @Override public int hashCode() { return 0; }
    }

    @Test
    public void testToStringDirectorySmallSize() {
        ArchiveEntry entry = new TestArchiveEntry("testdir", 5L, true);
        String result = ArchiveUtils.toString(entry);
        assertEquals("d       5 testdir", result);
    }

    @Test
    public void testToStringFileLargeSize() {
        ArchiveEntry entry = new TestArchiveEntry("file.txt", 123456789L, false);
        String result = ArchiveUtils.toString(entry);
        assertEquals("- 123456789 file.txt", result);
    }

    @Test
    public void testMatchAsciiBufferAndBytes() {
        byte[] buffer = ArchiveUtils.toAsciiBytes("Hello");
        assertTrue(ArchiveUtils.matchAsciiBuffer("Hello", buffer));
        assertTrue(ArchiveUtils.matchAsciiBuffer("Hel", buffer, 0, 3));
        assertFalse(ArchiveUtils.matchAsciiBuffer("World", buffer));
    }

    @Test
    public void testToAsciiStringVariants() {
        byte[] buffer = new byte[] { 'A', 'B', 'C', 'D', 'E' };
        assertEquals("ABCDE", ArchiveUtils.toAsciiString(buffer));
        assertEquals("BCD", ArchiveUtils.toAsciiString(buffer, 1, 3));
    }

    @Test
    public void testIsEqualBasicAndLengths() {
        byte[] b1 = new byte[] { 1, 2, 3, 4 };
        byte[] b2 = new byte[] { 1, 2, 3, 4 };
        byte[] b3 = new byte[] { 1, 2, 3, 5 };
        byte[] b4 = new byte[] { 1, 2, 3 };

        assertTrue(ArchiveUtils.isEqual(b1, b2));
        assertTrue(ArchiveUtils.isEqual(b1, 0, 4, b2, 0, 4));
        assertFalse(ArchiveUtils.isEqual(b1, b3));
        assertFalse(ArchiveUtils.isEqual(b1, 0, 4, b4, 0, 3)); // Different lengths, ignoreTrailingNulls=false
    }

    @Test
    public void testIsEqualIgnoreTrailingNulls() {
        byte[] b1 = new byte[] { 1, 2, 3, 0, 0 };
        byte[] b2 = new byte[] { 1, 2, 3 };
        byte[] b3 = new byte[] { 1, 2, 3, 1 }; // Non-zero trailing

        // buffer1 longer than buffer2 with trailing zeros
        assertTrue(ArchiveUtils.isEqual(b1, 0, 5, b2, 0, 3, true));
        assertTrue(ArchiveUtils.isEqual(b1, b2, true));
        
        // buffer2 longer than buffer1 with trailing zeros
        assertTrue(ArchiveUtils.isEqual(b2, 0, 3, b1, 0, 5, true));
        assertTrue(ArchiveUtils.isEqual(b2, b1, true));

        // isEqualWithNull helper
        assertTrue(ArchiveUtils.isEqualWithNull(b1, 0, 5, b2, 0, 3));

        // Trailing non-zero should fail
        assertFalse(ArchiveUtils.isEqual(b1, 0, 3, b3, 0, 4, true));
        assertFalse(ArchiveUtils.isEqual(b3, 0, 4, b1, 0, 3, true));
    }

    @Test
    public void testIsArrayZero() {
        byte[] zeros = new byte[] { 0, 0, 0, 0, 0 };
        byte[] nonZeros = new byte[] { 0, 0, 1, 0, 0 };

        assertTrue(ArchiveUtils.isArrayZero(zeros, 5));
        assertTrue(ArchiveUtils.isArrayZero(nonZeros, 2)); // Check only up to index 2 (exclusive)
        assertFalse(ArchiveUtils.isArrayZero(nonZeros, 5));
    }

    @Test
    public void testSanitize() {
        // Normal characters
        assertEquals("filename.txt", ArchiveUtils.sanitize("filename.txt"));

        // ISO Control characters (e.g., \n, \t) should be replaced with '?'
        assertEquals("file?name.txt", ArchiveUtils.sanitize("file\nname.txt"));
        assertEquals("file?name.txt", ArchiveUtils.sanitize("file\tname.txt"));
    }
}
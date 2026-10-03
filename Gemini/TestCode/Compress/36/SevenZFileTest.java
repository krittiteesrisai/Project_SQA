package org.apache.commons.compress.archivers.sevenz;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

public class SevenZFileTest {

    @Test
    public void testMatchesWithNullOrShortSignature() {
        // Edge Case: length less than signature length -> returns false
        byte[] shortSig = new byte[] { '7', 'z', (byte)0xBC };
        assertFalse(SevenZFile.matches(shortSig, shortSig.length));
        
        // Edge Case: length parameter smaller than array length even if array is long enough
        assertFalse(SevenZFile.matches(SevenZFile.sevenZSignature, 2));
    }

    @Test
    public void testMatchesWithInvalidSignatureBytes() {
        // Edge Case: Correct length, but wrong signature bytes
        byte[] invalidSig = new byte[] { 'F', 'a', 'k', 'e', 'S', 'i' };
        assertFalse(SevenZFile.matches(invalidSig, invalidSig.length));
        
        // Partial mismatch in the middle
        byte[] partialMismatch = Arrays.copyOf(SevenZFile.sevenZSignature, SevenZFile.sevenZSignature.length);
        partialMismatch[2] = 0x00;
        assertFalse(SevenZFile.matches(partialMismatch, partialMismatch.length));
    }

    @Test
    public void testMatchesWithValidSignature() {
        // Happy Path: exact match
        assertTrue(SevenZFile.matches(SevenZFile.sevenZSignature, SevenZFile.sevenZSignature.length));
        
        // Length greater than signature length
        byte[] longSig = new byte[10];
        System.arraycopy(SevenZFile.sevenZSignature, 0, longSig, 0, SevenZFile.sevenZSignature.length);
        assertTrue(SevenZFile.matches(longSig, longSig.length));
    }

    @Test(expected = IOException.class)
    public void testConstructorWithNonExistentFile() throws IOException {
        // Invalid State: File does not exist, should throw IOException and trigger cleanup in finally
        File nonExistent = new File("non_existent_archive_12345.7z");
        new SevenZFile(nonExistent);
    }

    @Test(expected = IOException.class)
    public void testConstructorWithEmptyFile() throws IOException {
        // Boundary/Edge Case: Empty file (0 bytes), signature check will fail
        File emptyFile = File.createTempFile("empty", ".7z");
        emptyFile.deleteOnExit();
        try {
            new SevenZFile(emptyFile);
        } finally {
            emptyFile.delete();
        }
    }

    @Test
    public void testConstructorWithPasswordHandling() throws Exception {
        // Edge Case: Testing password initialization branch (password != null vs password == null)
        // Since we can't easily spin up a valid encrypted 7z without heavy mocking or files,
        // we can test invalid file with password to ensure the password branch is exercised before failure.
        File dummyFile = File.createTempFile("dummy", ".7z");
        dummyFile.deleteOnExit();
        byte[] password = "testPassword".getBytes("UTF-16LE");
        try {
            new SevenZFile(dummyFile, password);
            fail("Expected IOException due to invalid 7z structure");
        } catch (IOException e) {
            // Expected exception because dummyFile is not a valid 7z archive
        } finally {
            dummyFile.delete();
        }
    }
}
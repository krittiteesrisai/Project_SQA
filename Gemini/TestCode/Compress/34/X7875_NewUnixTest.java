package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import java.util.zip.ZipException;

import static org.junit.Assert.*;

public class X7875_NewUnixTest {

    @Test
    public void testGetHeaderId() {
        X7875_NewUnix x = new X7875_NewUnix();
        assertEquals(new ZipShort(0x7875), x.getHeaderId());
    }

    @Test
    public void testDefaultConstructorAndGettersSetters() {
        X7875_NewUnix x = new X7875_NewUnix();
        assertEquals(1000L, x.getUID());
        assertEquals(1000L, x.getGID());

        x.setUID(12345L);
        x.setGID(67890L);
        assertEquals(12345L, x.getUID());
        assertEquals(67890L, x.getGID());
    }

    @Test
    public void testGetLocalAndCentralDataLength() {
        X7875_NewUnix x = new X7875_NewUnix();
        x.setUID(0L); // 0 translates to min length 1 byte after trim
        x.setGID(1000L);

        ZipShort localLen = x.getLocalFileDataLength();
        ZipShort centralLen = x.getCentralDirectoryLength();

        assertEquals(localLen, centralLen);
        assertTrue(localLen.getValue() > 0);
    }

    @Test
    public void testGetCentralDirectoryData() {
        X7875_NewUnix x = new X7875_NewUnix();
        byte[] centralData = x.getCentralDirectoryData();
        assertNotNull(centralData);
        assertEquals(0, centralData.length);
    }

    @Test
    public void testRoundTripLocalFileData() throws ZipException {
        X7875_NewUnix original = new X7875_NewUnix();
        original.setUID(5000L);
        original.setGID(6000L);

        byte[] data = original.getLocalFileDataData();
        assertNotNull(data);

        X7875_NewUnix parsed = new X7875_NewUnix();
        parsed.parseFromLocalFileData(data, 0, data.length);

        assertEquals(original.getUID(), parsed.getUID());
        assertEquals(original.getGID(), parsed.getGID());
    }

    @Test
    public void testParseFromCentralDirectoryDataDoesNothing() throws ZipException {
        X7875_NewUnix x = new X7875_NewUnix();
        x.parseFromCentralDirectoryData(new byte[10], 0, 10);
        // Should execute without exception and retain default values
        assertEquals(1000L, x.getUID());
    }

    @Test
    public void testTrimLeadingZeroesForceMinLengthEdgeCases() {
        // Branch: array == null
        assertNull(X7875_NewUnix.trimLeadingZeroesForceMinLength(null));

        // Branch: all zeros / empty
        byte[] empty = new byte[0];
        byte[] trimmedEmpty = X7875_NewUnix.trimLeadingZeroesForceMinLength(empty);
        assertNotNull(trimmedEmpty);
        assertEquals(1, trimmedEmpty.length);
        assertEquals(0, trimmedEmpty[0]);

        byte[] allZeros = new byte[] {0, 0, 0};
        byte[] trimmedZeros = X7875_NewUnix.trimLeadingZeroesForceMinLength(allZeros);
        assertNotNull(trimmedZeros);
        assertEquals(1, trimmedZeros.length);
        assertEquals(0, trimmedZeros[0]);

        // Branch: normal array with leading zeros
        byte[] normal = new byte[] {0, 0, 5, 6};
        byte[] trimmedNormal = X7875_NewUnix.trimLeadingZeroesForceMinLength(normal);
        assertNotNull(trimmedNormal);
        assertEquals(2, trimmedNormal.length);
        assertEquals(5, trimmedNormal[0]);
        assertEquals(6, trimmedNormal[1]);
    }

    @Test
    public void testEqualsAndHashCode() throws CloneNotSupportedException {
        X7875_NewUnix x1 = new X7875_NewUnix();
        x1.setUID(100L);
        x1.setGID(200L);

        X7875_NewUnix x2 = new X7875_NewUnix();
        x2.setUID(100L);
        x2.setGID(200L);

        X7875_NewUnix x3 = new X7875_NewUnix();
        x3.setUID(300L);
        x3.setGID(200L);

        // Reflexive, Symmetric, Consistent
        assertEquals(x1, x1);
        assertEquals(x1, x2);
        assertEquals(x2, x1);
        assertEquals(x1.hashCode(), x2.hashCode());

        // Inequality checks
        assertNotEquals(x1, x3);
        assertNotEquals(x1.hashCode(), x3.hashCode());
        assertNotEquals(x1, null);
        assertNotEquals(x1, "Some String");

        // Clone test
        Object clone = x1.clone();
        assertEquals(x1, clone);
    }

    @Test
    public void testToString() {
        X7875_NewUnix x = new X7875_NewUnix();
        x.setUID(1000L);
        x.setGID(1000L);
        String str = x.toString();
        assertNotNull(str);
        assertTrue(str.contains("0x7875 Zip Extra Field"));
        assertTrue(str.contains("UID=1000"));
        assertTrue(str.contains("GID=1000"));
    }
}
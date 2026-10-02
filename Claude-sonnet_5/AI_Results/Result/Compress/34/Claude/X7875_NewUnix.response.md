# JUnit 4 Test Suite: X7875_NewUnixTest

## หมายเหตุสำคัญก่อนเริ่ม

1. เมธอด `trimLeadingZeroesForceMinLength()` เป็น `static` **package-private** จึงต้องวาง test class ไว้ใน package เดียวกัน (`org.apache.commons.compress.archivers.zip`) เพื่อให้ทดสอบเมธอดนี้ได้โดยตรง — ไม่ต้อง `import` คลาสเป้าหมายเพราะอยู่ package เดียวกันอยู่แล้ว (ตาม requirement ข้อ 2 หากใช้ package ต่างกันจะไม่สามารถเข้าถึงเมธอดนี้ได้เลย)
2. Behavior ของ `ZipUtil.longToBig()` / `ZipUtil.bigToLong()` สำหรับค่า **negative** ไม่ปรากฏใน source ที่ให้มา จึงไม่ทดสอบกรณี negative UID/GID เพื่อไม่เดา behavior (ตามข้อกำหนด 4)
3. `parseFromCentralDirectoryData()` มี body ว่าง จึงทดสอบเพียงว่าค่าเดิมไม่เปลี่ยน
4. `clone()` ไม่มีทางเข้า branch throw `CloneNotSupportedException` เพราะ implements `Cloneable` จึงทดสอบเฉพาะ success path

```java
package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.zip.ZipException;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link X7875_NewUnix} (Defects4J Compress-34b).
 * Test class placed in the same package to access package-private
 * static helper trimLeadingZeroesForceMinLength().
 */
public class X7875_NewUnixTest {

    private X7875_NewUnix xf;

    @Before
    public void setUp() {
        xf = new X7875_NewUnix();
    }

    // ---------------------------------------------------------------
    // Constructor / reset()
    // ---------------------------------------------------------------
    @Test
    public void testDefaultConstructorSetsDefaultUidGid() {
        // reset() sets uid=gid=1000 (typical first non-root user)
        assertEquals(1000L, xf.getUID());
        assertEquals(1000L, xf.getGID());
    }

    // ---------------------------------------------------------------
    // getHeaderId()
    // ---------------------------------------------------------------
    @Test
    public void testGetHeaderId() {
        assertEquals(new ZipShort(0x7875), xf.getHeaderId());
    }

    // ---------------------------------------------------------------
    // setUID / getUID
    // ---------------------------------------------------------------
    @Test
    public void testSetGetUIDNormal() {
        xf.setUID(12345L);
        assertEquals(12345L, xf.getUID());
    }

    @Test
    public void testSetGetUIDZero() {
        xf.setUID(0L);
        assertEquals(0L, xf.getUID());
    }

    @Test
    public void testSetGetUIDMaxUnsigned32() {
        long big = 0xFFFFFFFFL; // 4294967295 - max unsigned 32-bit value
        xf.setUID(big);
        assertEquals(big, xf.getUID());
    }

    // ---------------------------------------------------------------
    // setGID / getGID
    // ---------------------------------------------------------------
    @Test
    public void testSetGetGIDNormal() {
        xf.setGID(6789L);
        assertEquals(6789L, xf.getGID());
    }

    @Test
    public void testSetGetGIDZero() {
        xf.setGID(0L);
        assertEquals(0L, xf.getGID());
    }

    // ---------------------------------------------------------------
    // getLocalFileDataLength() / getCentralDirectoryLength()
    // ---------------------------------------------------------------
    @Test
    public void testGetLocalFileDataLengthDefault() {
        ZipShort len = xf.getLocalFileDataLength();
        int uidLen = X7875_NewUnix
                .trimLeadingZeroesForceMinLength(BigInteger.valueOf(1000).toByteArray()).length;
        int gidLen = uidLen; // same default value
        assertEquals(3 + uidLen + gidLen, len.getValue());
    }

    @Test
    public void testGetCentralDirectoryLengthEqualsLocalFileDataLength() {
        assertEquals(xf.getLocalFileDataLength().getValue(),
                     xf.getCentralDirectoryLength().getValue());
    }

    @Test
    public void testGetLocalFileDataLengthWithZeroUidGid() {
        xf.setUID(0L);
        xf.setGID(0L);
        // BigInteger.ZERO.toByteArray() = [0]; MIN_LENGTH forces length=1 each
        assertEquals(3 + 1 + 1, xf.getLocalFileDataLength().getValue());
    }

    // ---------------------------------------------------------------
    // getCentralDirectoryData()
    // ---------------------------------------------------------------
    @Test
    public void testGetCentralDirectoryDataIsEmpty() {
        byte[] data = xf.getCentralDirectoryData();
        assertNotNull(data);
        assertEquals(0, data.length);
    }

    // ---------------------------------------------------------------
    // getLocalFileDataData()
    // ---------------------------------------------------------------
    @Test
    public void testGetLocalFileDataDataStructureDefault() {
        byte[] data = xf.getLocalFileDataData();
        assertEquals(1, data[0]); // version byte
        int uidSize = data[1] & 0xFF;
        assertTrue(uidSize >= 1);
        assertEquals(xf.getLocalFileDataLength().getValue(), data.length);
    }

    @Test
    public void testGetLocalFileDataDataZeroUidGid() {
        xf.setUID(0L);
        xf.setGID(0L);
        byte[] data = xf.getLocalFileDataData();
        // version=1, uidSize=1, uidByte=0, gidSize=1, gidByte=0
        assertEquals(5, data.length);
        assertEquals(1, data[0]);
        assertEquals(1, data[1]);
        assertEquals(0, data[2]);
        assertEquals(1, data[3]);
        assertEquals(0, data[4]);
    }

    // ---------------------------------------------------------------
    // parseFromLocalFileData()
    // ---------------------------------------------------------------
    @Test
    public void testParseFromLocalFileDataRoundTrip() throws ZipException {
        xf.setUID(123456789L);
        xf.setGID(987654321L);
        byte[] data = xf.getLocalFileDataData();

        X7875_NewUnix parsed = new X7875_NewUnix();
        parsed.parseFromLocalFileData(data, 0, data.length);

        assertEquals(xf.getUID(), parsed.getUID());
        assertEquals(xf.getGID(), parsed.getGID());
    }

    @Test
    public void testParseFromLocalFileDataResetsBeforeParsing() throws ZipException {
        xf.setUID(9999L);
        xf.setGID(9999L);

        X7875_NewUnix zeroXf = new X7875_NewUnix();
        zeroXf.setUID(0L);
        zeroXf.setGID(0L);
        byte[] zeroData = zeroXf.getLocalFileDataData();

        xf.parseFromLocalFileData(zeroData, 0, zeroData.length);
        assertEquals(0L, xf.getUID());
        assertEquals(0L, xf.getGID());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testParseFromLocalFileDataMalformedShortArray() throws ZipException {
        // claims uidSize=4 but data array too short -> should raise index exception
        byte[] malformed = new byte[] {1, 4};
        xf.parseFromLocalFileData(malformed, 0, malformed.length);
    }

    @Test
    public void testParseFromLocalFileDataWithOffset() throws ZipException {
        X7875_NewUnix src = new X7875_NewUnix();
        src.setUID(42L);
        src.setGID(24L);
        byte[] core = src.getLocalFileDataData();

        byte[] buffer = new byte[core.length + 2];
        buffer[0] = (byte) 0xAB;
        buffer[1] = (byte) 0xCD;
        System.arraycopy(core, 0, buffer, 2, core.length);

        X7875_NewUnix parsed = new X7875_NewUnix();
        parsed.parseFromLocalFileData(buffer, 2, core.length);

        assertEquals(42L, parsed.getUID());
        assertEquals(24L, parsed.getGID());
    }

    // ---------------------------------------------------------------
    // parseFromCentralDirectoryData() -- empty body
    // ---------------------------------------------------------------
    @Test
    public void testParseFromCentralDirectoryDataDoesNothing() throws ZipException {
        xf.setUID(555L);
        xf.setGID(777L);
        byte[] dummy = new byte[] {1, 2, 3};
        xf.parseFromCentralDirectoryData(dummy, 0, dummy.length);
        assertEquals(555L, xf.getUID());
        assertEquals(777L, xf.getGID());
    }

    // ---------------------------------------------------------------
    // toString()
    // ---------------------------------------------------------------
    @Test
    public void testToStringContainsUidGid() {
        xf.setUID(11L);
        xf.setGID(22L);
        String s = xf.toString();
        assertTrue(s.contains("UID=11"));
        assertTrue(s.contains("GID=22"));
        assertTrue(s.startsWith("0x7875 Zip Extra Field:"));
    }

    // ---------------------------------------------------------------
    // clone()
    // ---------------------------------------------------------------
    @Test
    public void testCloneProducesEqualButDistinctObject() throws CloneNotSupportedException {
        xf.setUID(100L);
        xf.setGID(200L);
        Object clone = xf.clone();
        assertNotSame(xf, clone);
        assertTrue(clone instanceof X7875_NewUnix);
        X7875_NewUnix cloned = (X7875_NewUnix) clone;
        assertEquals(xf.getUID(), cloned.getUID());
        assertEquals(xf.getGID(), cloned.getGID());
        assertEquals(xf, cloned);
    }

    // ---------------------------------------------------------------
    // equals()
    // ---------------------------------------------------------------
    @Test
    public void testEqualsSameValues() {
        X7875_NewUnix a = new X7875_NewUnix();
        X7875_NewUnix b = new X7875_NewUnix();
        a.setUID(1L); a.setGID(2L);
        b.setUID(1L); b.setGID(2L);
        assertTrue(a.equals(b));
        assertTrue(b.equals(a));
    }

    @Test
    public void testEqualsDifferentUID() {
        X7875_NewUnix a = new X7875_NewUnix();
        X7875_NewUnix b = new X7875_NewUnix();
        a.setUID(1L); a.setGID(2L);
        b.setUID(999L); b.setGID(2L);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsDifferentGID() {
        X7875_NewUnix a = new X7875_NewUnix();
        X7875_NewUnix b = new X7875_NewUnix();
        a.setUID(1L); a.setGID(2L);
        b.setUID(1L); b.setGID(999L);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsDifferentVersionViaParse() throws ZipException {
        X7875_NewUnix a = new X7875_NewUnix();
        a.setUID(5L);
        a.setGID(6L);
        byte[] data = a.getLocalFileDataData();

        byte[] modified = data.clone();
        modified[0] = 2; // change version field 1 -> 2

        X7875_NewUnix b = new X7875_NewUnix();
        b.parseFromLocalFileData(modified, 0, modified.length);

        X7875_NewUnix aParsed = new X7875_NewUnix();
        aParsed.parseFromLocalFileData(data, 0, data.length);

        assertFalse(aParsed.equals(b));
    }

    @Test
    public void testEqualsWithNull() {
        assertFalse(xf.equals(null));
    }

    @Test
    public void testEqualsWithDifferentClass() {
        assertFalse(xf.equals("not an X7875_NewUnix"));
    }

    @Test
    public void testEqualsSameReference() {
        assertTrue(xf.equals(xf));
    }

    // ---------------------------------------------------------------
    // hashCode()
    // ---------------------------------------------------------------
    @Test
    public void testHashCodeConsistentForEqualObjects() {
        X7875_NewUnix a = new X7875_NewUnix();
        X7875_NewUnix b = new X7875_NewUnix();
        a.setUID(10L); a.setGID(20L);
        b.setUID(10L); b.setGID(20L);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testHashCodeDifferentForDifferentUid() {
        X7875_NewUnix a = new X7875_NewUnix();
        X7875_NewUnix b = new X7875_NewUnix();
        a.setUID(10L); a.setGID(20L);
        b.setUID(999999L); b.setGID(20L);
        // Collision theoretically possible but unlikely for these values
        assertNotEquals(a.hashCode(), b.hashCode());
    }

    // ---------------------------------------------------------------
    // trimLeadingZeroesForceMinLength() -- package-private static helper
    // ---------------------------------------------------------------
    @Test
    public void testTrimLeadingZeroes_NullInput() {
        assertNull(X7875_NewUnix.trimLeadingZeroesForceMinLength(null));
    }

    @Test
    public void testTrimLeadingZeroes_EmptyArray() {
        // loop doesn't execute (pos=0); Math.max(1, 0-0)=1
        byte[] result = X7875_NewUnix.trimLeadingZeroesForceMinLength(new byte[0]);
        assertEquals(1, result.length);
        assertEquals(0, result[0]);
    }

    @Test
    public void testTrimLeadingZeroes_AllZeroes() {
        // pos=3 (all zero); Math.max(1, 3-3=0)=1
        byte[] input = new byte[] {0, 0, 0};
        byte[] result = X7875_NewUnix.trimLeadingZeroesForceMinLength(input);
        assertEquals(1, result.length);
        assertEquals(0, result[0]);
    }

    @Test
    public void testTrimLeadingZeroes_NoLeadingZero() {
        // pos=0; Math.max(1, 3-0=3)=3 -> no trimming, identical content
        byte[] input = new byte[] {5, 10, 15};
        byte[] result = X7875_NewUnix.trimLeadingZeroesForceMinLength(input);
        assertArrayEquals(input, result);
    }

    @Test
    public void testTrimLeadingZeroes_SomeLeadingZeroes() {
        // pos=2; Math.max(1, 4-2=2)=2 -> trimmed to {7,8}
        byte[] input = new byte[] {0, 0, 7, 8};
        byte[] result = X7875_NewUnix.trimLeadingZeroesForceMinLength(input);
        assertArrayEquals(new byte[] {7, 8}, result);
    }

    @Test
    public void testTrimLeadingZeroes_SingleZeroByte() {
        // pos=1 (whole array consumed); Math.max(1, 1-1=0)=1
        byte[] input = new byte[] {0};
        byte[] result = X7875_NewUnix.trimLeadingZeroesForceMinLength(input);
        assertEquals(1, result.length);
        assertEquals(0, result[0]);
    }

    @Test
    public void testTrimLeadingZeroes_MinLengthPaddingBranch() {
        // array.length-pos(=0) < MIN_LENGTH(1) forces startPos>0 branch
        byte[] input = new byte[] {0, 0};
        byte[] result = X7875_NewUnix.trimLeadingZeroesForceMinLength(input);
        assertEquals(1, result.length);
        assertEquals(0, result[0]);
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testDefaultConstructorSetsDefaultUidGid` | `reset()` ตั้งค่า default uid/gid=1000 |
| `testGetHeaderId` | ค่าคงที่ `HEADER_ID` |
| `testSetGetUIDNormal/Zero/MaxUnsigned32` | `setUID`/`getUID` boundary: ค่าปกติ, 0, max unsigned32 |
| `testSetGetGIDNormal/Zero` | `setGID`/`getGID` boundary |
| `testGetLocalFileDataLengthDefault` | `getLocalFileDataLength()` เส้นทางปกติ |
| `testGetCentralDirectoryLengthEqualsLocalFileDataLength` | ยืนยัน `getCentralDirectoryLength()` delegate ถูก |
| `testGetLocalFileDataLengthWithZeroUidGid` | boundary uid/gid=0 (single zero byte case) |
| `testGetCentralDirectoryDataIsEmpty` | `getCentralDirectoryData()` return empty array |
| `testGetLocalFileDataDataStructureDefault/ZeroUidGid` | โครงสร้าง byte[] ปกติ และกรณี uid/gid=0 |
| `testParseFromLocalFileDataRoundTrip` | parse ค่าปกติ (loop/if version, uidSize, gidSize) |
| `testParseFromLocalFileDataResetsBeforeParsing` | ยืนยัน `reset()` ถูกเรียกก่อน parse |
| `testParseFromLocalFileDataMalformedShortArray` | อินพุตผิดรูปแบบ/สั้นเกินไป → exception |
| `testParseFromLocalFileDataWithOffset` | ทดสอบ parameter `offset` ที่ไม่ใช่ 0 |
| `testParseFromCentralDirectoryDataDoesNothing` | method body ว่าง ไม่เปลี่ยนสถานะ |
| `testToStringContainsUidGid` | `toString()` |
| `testCloneProducesEqualButDistinctObject` | `clone()` success path |
| `testEqualsSameValues/DifferentUID/DifferentGID/DifferentVersionViaParse` | `equals()`: version/uid/gid mismatch branch |
| `testEqualsWithNull/DifferentClass/SameReference` | `equals()`: instanceof-false, null, same-ref |
| `testHashCodeConsistentForEqualObjects/DifferentForDifferentUid` | `hashCode()` consistency |
| `testTrimLeadingZeroes_NullInput` | if `array == null` → return null |
| `testTrimLeadingZeroes_EmptyArray` | loop 0 iteration, Math.max MIN_LENGTH branch |
| `testTrimLeadingZeroes_AllZeroes` | loop ครบทุกตัว (all zero), MIN_LENGTH branch |
| `testTrimLeadingZeroes_NoLeadingZero` | loop break ทันที (pos=0), array.length-pos branch |
| `testTrimLeadingZeroes_SomeLeadingZeroes` | loop บาง iteration ก่อน break |
| `testTrimLeadingZeroes_SingleZeroByte` | edge case array.length=1 |
| `testTrimLeadingZeroes_MinLengthPaddingBranch` | startPos>0 (padding) branch ของ arraycopy |
# JUnit 4 Test Suite: Zip64ExtendedInformationExtraFieldTest

```java
package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.*;
import static org.apache.commons.compress.archivers.zip.ZipConstants.DWORD;
import static org.apache.commons.compress.archivers.zip.ZipConstants.WORD;

import java.util.zip.ZipException;

import org.junit.Test;

/**
 * Unit tests for {@link Zip64ExtendedInformationExtraField}.
 *
 * หมายเหตุ: ทดสอบตาม behavior ที่ปรากฏในซอร์สโค้ดเท่านั้น
 * ไม่ได้เดา behavior เพิ่มเติมนอกจากที่ระบุไว้ใน source ที่ให้มา
 */
public class Zip64ExtendedInformationExtraFieldTest {

    // ---------- Helper methods ----------

    private byte[] concat(byte[]... arrays) {
        int total = 0;
        for (byte[] a : arrays) {
            total += a.length;
        }
        byte[] result = new byte[total];
        int pos = 0;
        for (byte[] a : arrays) {
            System.arraycopy(a, 0, result, pos, a.length);
            pos += a.length;
        }
        return result;
    }

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructorAllFieldsNull() {
        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        assertNull(f.getSize());
        assertNull(f.getCompressedSize());
        assertNull(f.getRelativeHeaderOffset());
        assertNull(f.getDiskStartNumber());
    }

    @Test
    public void testTwoArgConstructor() {
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger csize = new ZipEightByteInteger(50L);
        Zip64ExtendedInformationExtraField f =
            new Zip64ExtendedInformationExtraField(size, csize);
        assertEquals(size, f.getSize());
        assertEquals(csize, f.getCompressedSize());
        assertNull(f.getRelativeHeaderOffset());
        assertNull(f.getDiskStartNumber());
    }

    @Test
    public void testFourArgConstructor() {
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger csize = new ZipEightByteInteger(50L);
        ZipEightByteInteger rho = new ZipEightByteInteger(200L);
        ZipLong diskStart = new ZipLong(3L);
        Zip64ExtendedInformationExtraField f =
            new Zip64ExtendedInformationExtraField(size, csize, rho, diskStart);
        assertEquals(size, f.getSize());
        assertEquals(csize, f.getCompressedSize());
        assertEquals(rho, f.getRelativeHeaderOffset());
        assertEquals(diskStart, f.getDiskStartNumber());
    }

    // ---------- getHeaderId ----------

    @Test
    public void testGetHeaderId() {
        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        assertEquals(new ZipShort(0x0001), f.getHeaderId());
    }

    // ---------- getLocalFileDataLength ----------

    @Test
    public void testGetLocalFileDataLength_sizeNull() {
        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        assertEquals(new ZipShort(0), f.getLocalFileDataLength());
    }

    @Test
    public void testGetLocalFileDataLength_sizeNotNull() {
        Zip64ExtendedInformationExtraField f =
            new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(1L),
                                                    new ZipEightByteInteger(1L));
        assertEquals(new ZipShort(2 * DWORD), f.getLocalFileDataLength());
    }

    // ---------- getCentralDirectoryLength ----------

    @Test
    public void testGetCentralDirectoryLength_allNull() {
        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        assertEquals(new ZipShort(0), f.getCentralDirectoryLength());
    }

    @Test
    public void testGetCentralDirectoryLength_allSet() {
        Zip64ExtendedInformationExtraField f =
            new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(1L),
                                                    new ZipEightByteInteger(1L),
                                                    new ZipEightByteInteger(1L),
                                                    new ZipLong(1L));
        assertEquals(new ZipShort(3 * DWORD + WORD), f.getCentralDirectoryLength());
    }

    @Test
    public void testGetCentralDirectoryLength_onlySizeSet() {
        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        f.setSize(new ZipEightByteInteger(1L));
        assertEquals(new ZipShort(DWORD), f.getCentralDirectoryLength());
    }

    @Test
    public void testGetCentralDirectoryLength_onlyCompressedSizeSet() {
        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        f.setCompressedSize(new ZipEightByteInteger(1L));
        assertEquals(new ZipShort(DWORD), f.getCentralDirectoryLength());
    }

    @Test
    public void testGetCentralDirectoryLength_onlyRelativeHeaderOffsetSet() {
        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        f.setRelativeHeaderOffset(new ZipEightByteInteger(1L));
        assertEquals(new ZipShort(DWORD), f.getCentralDirectoryLength());
    }

    @Test
    public void testGetCentralDirectoryLength_onlyDiskStartSet() {
        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        f.setDiskStartNumber(new ZipLong(1L));
        assertEquals(new ZipShort(WORD), f.getCentralDirectoryLength());
    }

    // ---------- getLocalFileDataData ----------

    @Test
    public void testGetLocalFileDataData_bothNull_returnsEmpty() {
        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        byte[] data = f.getLocalFileDataData();
        assertEquals(0, data.length);
    }

    @Test
    public void testGetLocalFileDataData_bothSet() {
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger csize = new ZipEightByteInteger(50L);
        Zip64ExtendedInformationExtraField f =
            new Zip64ExtendedInformationExtraField(size, csize);
        byte[] data = f.getLocalFileDataData();
        assertEquals(2 * DWORD, data.length);

        byte[] expected = concat(size.getBytes(), csize.getBytes());
        assertArrayEquals(expected, data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLocalFileDataData_onlySizeSet_throws() {
        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        f.setSize(new ZipEightByteInteger(1L));
        f.getLocalFileDataData();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLocalFileDataData_onlyCompressedSizeSet_throws() {
        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        f.setCompressedSize(new ZipEightByteInteger(1L));
        f.getLocalFileDataData();
    }

    // ---------- getCentralDirectoryData ----------

    @Test
    public void testGetCentralDirectoryData_allSet() {
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger csize = new ZipEightByteInteger(50L);
        ZipEightByteInteger rho = new ZipEightByteInteger(200L);
        ZipLong diskStart = new ZipLong(3L);
        Zip64ExtendedInformationExtraField f =
            new Zip64ExtendedInformationExtraField(size, csize, rho, diskStart);

        byte[] data = f.getCentralDirectoryData();
        byte[] expected = concat(size.getBytes(), csize.getBytes(),
                                  rho.getBytes(), diskStart.getBytes());
        assertArrayEquals(expected, data);
    }

    @Test
    public void testGetCentralDirectoryData_onlySizes() {
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger csize = new ZipEightByteInteger(50L);
        Zip64ExtendedInformationExtraField f =
            new Zip64ExtendedInformationExtraField(size, csize);
        byte[] data = f.getCentralDirectoryData();
        byte[] expected = concat(size.getBytes(), csize.getBytes());
        assertArrayEquals(expected, data);
    }

    @Test
    public void testGetCentralDirectoryData_sizesPlusRelativeHeaderOffsetOnly() {
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger csize = new ZipEightByteInteger(50L);
        ZipEightByteInteger rho = new ZipEightByteInteger(200L);
        Zip64ExtendedInformationExtraField f =
            new Zip64ExtendedInformationExtraField(size, csize, rho, null);
        byte[] data = f.getCentralDirectoryData();
        byte[] expected = concat(size.getBytes(), csize.getBytes(), rho.getBytes());
        assertArrayEquals(expected, data);
    }

    @Test
    public void testGetCentralDirectoryData_allNull_returnsEmptyArray() {
        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        byte[] data = f.getCentralDirectoryData();
        assertEquals(0, data.length);
    }

    // ---------- parseFromLocalFileData ----------

    @Test
    public void testParseFromLocalFileData_lengthZero_noException_fieldsRemainNull()
            throws ZipException {
        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        f.parseFromLocalFileData(new byte[0], 0, 0);
        assertNull(f.getSize());
        assertNull(f.getCompressedSize());
    }

    @Test(expected = ZipException.class)
    public void testParseFromLocalFileData_lengthTooSmall_throws() throws ZipException {
        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        byte[] buffer = new byte[DWORD]; // length < 2*DWORD
        f.parseFromLocalFileData(buffer, 0, DWORD);
    }

    @Test
    public void testParseFromLocalFileData_exactlyTwoSizes_noOffsetNoDiskStart()
            throws ZipException {
        ZipEightByteInteger size = new ZipEightByteInteger(111L);
        ZipEightByteInteger csize = new ZipEightByteInteger(222L);
        byte[] buffer = concat(size.getBytes(), csize.getBytes());

        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        f.parseFromLocalFileData(buffer, 0, buffer.length);

        assertEquals(size, f.getSize());
        assertEquals(csize, f.getCompressedSize());
        assertNull(f.getRelativeHeaderOffset());
        assertNull(f.getDiskStartNumber());
    }

    @Test
    public void testParseFromLocalFileData_withRelativeHeaderOffsetOnly_noDiskStart()
            throws ZipException {
        // remaining after sizes = DWORD -> relativeHeaderOffset parsed,
        // remaining afterwards = 0, less than WORD -> diskStart NOT parsed
        ZipEightByteInteger size = new ZipEightByteInteger(1L);
        ZipEightByteInteger csize = new ZipEightByteInteger(2L);
        ZipEightByteInteger rho = new ZipEightByteInteger(3L);
        byte[] buffer = concat(size.getBytes(), csize.getBytes(), rho.getBytes());

        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        f.parseFromLocalFileData(buffer, 0, buffer.length);

        assertEquals(size, f.getSize());
        assertEquals(csize, f.getCompressedSize());
        assertEquals(rho, f.getRelativeHeaderOffset());
        assertNull(f.getDiskStartNumber());
    }

    @Test
    public void testParseFromLocalFileData_withDiskStartOnly_noRelativeHeaderOffset()
            throws ZipException {
        // remaining after sizes = WORD (< DWORD) -> relativeHeaderOffset NOT parsed
        // remaining >= WORD -> diskStart parsed
        ZipEightByteInteger size = new ZipEightByteInteger(1L);
        ZipEightByteInteger csize = new ZipEightByteInteger(2L);
        ZipLong diskStart = new ZipLong(9L);
        byte[] buffer = concat(size.getBytes(), csize.getBytes(), diskStart.getBytes());

        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        f.parseFromLocalFileData(buffer, 0, buffer.length);

        assertEquals(size, f.getSize());
        assertEquals(csize, f.getCompressedSize());
        assertNull(f.getRelativeHeaderOffset());
        assertEquals(diskStart, f.getDiskStartNumber());
    }

    @Test
    public void testParseFromLocalFileData_allFourFields() throws ZipException {
        ZipEightByteInteger size = new ZipEightByteInteger(1L);
        ZipEightByteInteger csize = new ZipEightByteInteger(2L);
        ZipEightByteInteger rho = new ZipEightByteInteger(3L);
        ZipLong diskStart = new ZipLong(4L);
        byte[] buffer = concat(size.getBytes(), csize.getBytes(),
                                rho.getBytes(), diskStart.getBytes());

        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        f.parseFromLocalFileData(buffer, 0, buffer.length);

        assertEquals(size, f.getSize());
        assertEquals(csize, f.getCompressedSize());
        assertEquals(rho, f.getRelativeHeaderOffset());
        assertEquals(diskStart, f.getDiskStartNumber());
    }

    @Test
    public void testParseFromLocalFileData_withNonZeroOffset() throws ZipException {
        // ตรวจว่า offset ที่ไม่ใช่ 0 ทำงานถูกต้อง (fault-detection)
        ZipEightByteInteger size = new ZipEightByteInteger(11L);
        ZipEightByteInteger csize = new ZipEightByteInteger(22L);
        byte[] payload = concat(size.getBytes(), csize.getBytes());
        byte[] buffer = concat(new byte[5], payload); // prefix 5 junk bytes

        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        f.parseFromLocalFileData(buffer, 5, payload.length);

        assertEquals(size, f.getSize());
        assertEquals(csize, f.getCompressedSize());
    }

    // ---------- parseFromCentralDirectoryData ----------

    @Test
    public void testParseFromCentralDirectoryData_fullLength_delegatesToLocalFileData()
            throws ZipException {
        ZipEightByteInteger size = new ZipEightByteInteger(1L);
        ZipEightByteInteger csize = new ZipEightByteInteger(2L);
        ZipEightByteInteger rho = new ZipEightByteInteger(3L);
        ZipLong diskStart = new ZipLong(4L);
        byte[] buffer = concat(size.getBytes(), csize.getBytes(),
                                rho.getBytes(), diskStart.getBytes());
        assertEquals(3 * DWORD + WORD, buffer.length);

        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        f.parseFromCentralDirectoryData(buffer, 0, buffer.length);

        assertEquals(size, f.getSize());
        assertEquals(csize, f.getCompressedSize());
        assertEquals(rho, f.getRelativeHeaderOffset());
        assertEquals(diskStart, f.getDiskStartNumber());
    }

    @Test
    public void testParseFromCentralDirectoryData_lengthLongerThanMinimum_stillDelegates()
            throws ZipException {
        // length > 3*DWORD+WORD also falls into the first branch (>=)
        ZipEightByteInteger size = new ZipEightByteInteger(1L);
        ZipEightByteInteger csize = new ZipEightByteInteger(2L);
        ZipEightByteInteger rho = new ZipEightByteInteger(3L);
        ZipLong diskStart = new ZipLong(4L);
        byte[] extra = new byte[]{0, 0}; // extra junk, not consumed but length used
        byte[] buffer = concat(size.getBytes(), csize.getBytes(),
                                rho.getBytes(), diskStart.getBytes(), extra);

        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        // NOTE: parseFromLocalFileData would try to read exactly what's needed;
        // extra bytes are simply ignored per algorithm since remaining checks stop.
        f.parseFromCentralDirectoryData(buffer, 0, buffer.length);

        assertEquals(size, f.getSize());
        assertEquals(csize, f.getCompressedSize());
        assertEquals(rho, f.getRelativeHeaderOffset());
        assertEquals(diskStart, f.getDiskStartNumber());
    }

    @Test
    public void testParseFromCentralDirectoryData_exactlyThreeDwords_sizesAndOffset()
            throws ZipException {
        ZipEightByteInteger size = new ZipEightByteInteger(1L);
        ZipEightByteInteger csize = new ZipEightByteInteger(2L);
        ZipEightByteInteger rho = new ZipEightByteInteger(3L);
        byte[] buffer = concat(size.getBytes(), csize.getBytes(), rho.getBytes());
        assertEquals(3 * DWORD, buffer.length);

        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        f.parseFromCentralDirectoryData(buffer, 0, buffer.length);

        assertEquals(size, f.getSize());
        assertEquals(csize, f.getCompressedSize());
        assertEquals(rho, f.getRelativeHeaderOffset());
        assertNull(f.getDiskStartNumber());
    }

    @Test
    public void testParseFromCentralDirectoryData_lengthModDwordEqualsWord_diskStartOnly()
            throws ZipException {
        // length = WORD (4) -> 4 % 8 == 4 -> diskStart parsed from tail
        ZipLong diskStart = new ZipLong(99L);
        byte[] buffer = diskStart.getBytes();
        assertEquals(WORD, buffer.length);
        assertEquals(WORD, buffer.length % DWORD);

        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        f.parseFromCentralDirectoryData(buffer, 0, buffer.length);

        assertNull(f.getSize());
        assertNull(f.getCompressedSize());
        assertNull(f.getRelativeHeaderOffset());
        assertEquals(diskStart, f.getDiskStartNumber());
    }

    @Test
    public void testParseFromCentralDirectoryData_lengthMatchesNoBranch_noFieldsParsed()
            throws ZipException {
        // length == DWORD (8): not >=28, not ==24, 8 % 8 == 0 != 4 -> else branch (no-op)
        byte[] buffer = new byte[DWORD];
        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        f.parseFromCentralDirectoryData(buffer, 0, buffer.length);

        assertNull(f.getSize());
        assertNull(f.getCompressedSize());
        assertNull(f.getRelativeHeaderOffset());
        assertNull(f.getDiskStartNumber());
    }

    @Test
    public void testParseFromCentralDirectoryData_lengthZero_noFieldsParsed()
            throws ZipException {
        byte[] buffer = new byte[0];
        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        f.parseFromCentralDirectoryData(buffer, 0, 0);

        assertNull(f.getSize());
        assertNull(f.getCompressedSize());
        assertNull(f.getRelativeHeaderOffset());
        assertNull(f.getDiskStartNumber());
    }

    // ---------- reparseCentralDirectoryData ----------

    @Test
    public void testReparseCentralDirectoryData_rawDataNull_noException_noOp()
            throws ZipException {
        // ยังไม่เคยเรียก parseFromCentralDirectoryData -> rawCentralDirectoryData == null
        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        f.reparseCentralDirectoryData(true, true, true, true);
        assertNull(f.getSize());
        assertNull(f.getCompressedSize());
        assertNull(f.getRelativeHeaderOffset());
        assertNull(f.getDiskStartNumber());
    }

    @Test(expected = ZipException.class)
    public void testReparseCentralDirectoryData_lengthMismatch_throws() throws ZipException {
        byte[] raw = new byte[DWORD]; // length 8
        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        // populate rawCentralDirectoryData via parseFromCentralDirectoryData
        f.parseFromCentralDirectoryData(raw, 0, raw.length);
        // now expect all 4 flags true -> expectedLength = 2*DWORD+WORD = 20 != 8
        f.reparseCentralDirectoryData(true, true, true, true);
    }

    @Test
    public void testReparseCentralDirectoryData_allFlagsTrue_correctLength()
            throws ZipException {
        ZipEightByteInteger size = new ZipEightByteInteger(1L);
        ZipEightByteInteger csize = new ZipEightByteInteger(2L);
        ZipEightByteInteger rho = new ZipEightByteInteger(3L);
        ZipLong diskStart = new ZipLong(4L);
        byte[] raw = concat(size.getBytes(), csize.getBytes(),
                             rho.getBytes(), diskStart.getBytes());

        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        // seed rawCentralDirectoryData with matching content and length
        f.parseFromCentralDirectoryData(raw, 0, raw.length);

        // reset fields to verify reparse actually re-populates them
        f.setSize(null);
        f.setCompressedSize(null);
        f.setRelativeHeaderOffset(null);
        f.setDiskStartNumber(null);

        f.reparseCentralDirectoryData(true, true, true, true);

        assertEquals(size, f.getSize());
        assertEquals(csize, f.getCompressedSize());
        assertEquals(rho, f.getRelativeHeaderOffset());
        assertEquals(diskStart, f.getDiskStartNumber());
    }

    @Test
    public void testReparseCentralDirectoryData_onlyUncompressedSizeFlag()
            throws ZipException {
        ZipEightByteInteger size = new ZipEightByteInteger(77L);
        byte[] raw = size.getBytes(); // length DWORD

        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        f.parseFromCentralDirectoryData(raw, 0, raw.length);
        f.setSize(null);

        f.reparseCentralDirectoryData(true, false, false, false);

        assertEquals(size, f.getSize());
        assertNull(f.getCompressedSize());
        assertNull(f.getRelativeHeaderOffset());
        assertNull(f.getDiskStartNumber());
    }

    @Test
    public void testReparseCentralDirectoryData_onlyCompressedSizeFlag()
            throws ZipException {
        ZipEightByteInteger csize = new ZipEightByteInteger(88L);
        byte[] raw = csize.getBytes();

        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        f.parseFromCentralDirectoryData(raw, 0, raw.length);

        f.reparseCentralDirectoryData(false, true, false, false);

        assertNull(f.getSize());
        assertEquals(csize, f.getCompressedSize());
        assertNull(f.getRelativeHeaderOffset());
        assertNull(f.getDiskStartNumber());
    }

    @Test
    public void testReparseCentralDirectoryData_onlyRelativeHeaderOffsetFlag()
            throws ZipException {
        ZipEightByteInteger rho = new ZipEightByteInteger(99L);
        byte[] raw = rho.getBytes();

        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        f.parseFromCentralDirectoryData(raw, 0, raw.length);

        f.reparseCentralDirectoryData(false, false, true, false);

        assertNull(f.getSize());
        assertNull(f.getCompressedSize());
        assertEquals(rho, f.getRelativeHeaderOffset());
        assertNull(f.getDiskStartNumber());
    }

    @Test
    public void testReparseCentralDirectoryData_onlyDiskStartFlag() throws ZipException {
        ZipLong diskStart = new ZipLong(55L);
        byte[] raw = diskStart.getBytes(); // length WORD

        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        f.parseFromCentralDirectoryData(raw, 0, raw.length);

        f.reparseCentralDirectoryData(false, false, false, true);

        assertNull(f.getSize());
        assertNull(f.getCompressedSize());
        assertNull(f.getRelativeHeaderOffset());
        assertEquals(diskStart, f.getDiskStartNumber());
    }

    @Test
    public void testReparseCentralDirectoryData_allFlagsFalse_expectedLengthZero()
            throws ZipException {
        byte[] raw = new byte[0];
        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        f.parseFromCentralDirectoryData(raw, 0, 0);

        f.reparseCentralDirectoryData(false, false, false, false);

        assertNull(f.getSize());
        assertNull(f.getCompressedSize());
        assertNull(f.getRelativeHeaderOffset());
        assertNull(f.getDiskStartNumber());
    }

    // ---------- getters/setters (simple, still worth covering) ----------

    @Test
    public void testSettersAndGetters() {
        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger size = new ZipEightByteInteger(1L);
        ZipEightByteInteger csize = new ZipEightByteInteger(2L);
        ZipEightByteInteger rho = new ZipEightByteInteger(3L);
        ZipLong diskStart = new ZipLong(4L);

        f.setSize(size);
        f.setCompressedSize(csize);
        f.setRelativeHeaderOffset(rho);
        f.setDiskStartNumber(diskStart);

        assertEquals(size, f.getSize());
        assertEquals(csize, f.getCompressedSize());
        assertEquals(rho, f.getRelativeHeaderOffset());
        assertEquals(diskStart, f.getDiskStartNumber());
    }
}
```

---

## สรุปตาราง Test Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testDefaultConstructorAllFieldsNull` | Constructor เปล่า, ตรวจ field เริ่มต้นเป็น null |
| `testTwoArgConstructor` | Constructor 2 args เรียก 4 args ด้วย null offset/diskStart |
| `testFourArgConstructor` | Constructor 4 args, ทุก field ถูกกำหนดค่า |
| `testGetHeaderId` | ค่าคงที่ HEADER_ID |
| `testGetLocalFileDataLength_sizeNull` | `size != null` = false |
| `testGetLocalFileDataLength_sizeNotNull` | `size != null` = true |
| `testGetCentralDirectoryLength_allNull` | ทุก ternary = false |
| `testGetCentralDirectoryLength_allSet` | ทุก ternary = true |
| `testGetCentralDirectoryLength_only*Set` (4 ตัว) | แต่ละ ternary condition แยก true ทีละตัว |
| `testGetLocalFileDataData_bothNull_returnsEmpty` | `size!=null||compressedSize!=null` = false → return EMPTY |
| `testGetLocalFileDataData_bothSet` | เงื่อนไข true, `size==null||compressedSize==null` false → คำนวณ data |
| `testGetLocalFileDataData_onlySizeSet_throws` | เงื่อนไขแรก true, เงื่อนไขสอง true (compressedSize null) → throw |
| `testGetLocalFileDataData_onlyCompressedSizeSet_throws` | เงื่อนไขสอง true (size null) → throw |
| `testGetCentralDirectoryData_allSet` | addSizes ทั้งสอง if true, relativeHeaderOffset!=null true, diskStart!=null true |
| `testGetCentralDirectoryData_onlySizes` | relativeHeaderOffset/diskStart != null = false ทั้งคู่ |
| `testGetCentralDirectoryData_sizesPlusRelativeHeaderOffsetOnly` | relativeHeaderOffset!=null true, diskStart!=null false |
| `testGetCentralDirectoryData_allNull_returnsEmptyArray` | addSizes ทั้งสอง if false, ผลลัพธ์ length 0 |
| `testParseFromLocalFileData_lengthZero_...` | `length == 0` = true → return ทันที |
| `testParseFromLocalFileData_lengthTooSmall_throws` | `length < 2*DWORD` = true → throw ZipException |
| `testParseFromLocalFileData_exactlyTwoSizes_...` | `remaining >= DWORD` false, `remaining >= WORD` false |
| `testParseFromLocalFileData_withRelativeHeaderOffsetOnly_...` | `remaining>=DWORD` true, หลังจากนั้น `remaining>=WORD` false |
| `testParseFromLocalFileData_withDiskStartOnly_...` | `remaining>=DWORD` false, `remaining>=WORD` true |
| `testParseFromLocalFileData_allFourFields` | ทั้งสอง if เป็น true |
| `testParseFromLocalFileData_withNonZeroOffset` | ตรวจ offset handling (fault-detection) |
| `testParseFromCentralDirectoryData_fullLength_...` | `length >= 3*DWORD+WORD` = true (delegate) |
| `testParseFromCentralDirectoryData_lengthLongerThanMinimum_...` | เงื่อนไขแรก true กรณี length มากกว่า minimum |
| `testParseFromCentralDirectoryData_exactlyThreeDwords_...` | เงื่อนไขแรก false, `length == 3*DWORD` = true |
| `testParseFromCentralDirectoryData_lengthModDwordEqualsWord_...` | เงื่อนไข 1,2 false, `length % DWORD == WORD` = true |
| `testParseFromCentralDirectoryData_lengthMatchesNoBranch_...` | ทุกเงื่อนไขเป็น false (else ไม่มี action) |
| `testParseFromCentralDirectoryData_lengthZero_...` | length=0 ผ่าน else branch เดียวกัน |
| `testReparseCentralDirectoryData_rawDataNull_...` | `rawCentralDirectoryData != null` = false |
| `testReparseCentralDirectoryData_lengthMismatch_throws` | `rawCentralDirectoryData.length != expectedLength` = true → throw |
| `testReparseCentralDirectoryData_allFlagsTrue_...` | ทุก flag true, length ตรง |
| `testReparseCentralDirectoryData_only*Flag` (4 ตัว) | แต่ละ if(flag) แยก true ทีละตัว |
| `testReparseCentralDirectoryData_allFlagsFalse_...` | ทุก flag false, expectedLength=0 |
| `testSettersAndGetters` | Getter/Setter ทั้งหมด (ไม่มี branch แต่ช่วยยืนยัน state) |

**หมายเหตุสำคัญ:**
- ใช้ `DWORD`/`WORD` จาก `ZipConstants` ตรงตาม source (import static เดียวกัน) เนื่องจาก test class อยู่ package เดียวกัน
- ไม่ได้ทดสอบทุก combination ของ 4 boolean flags ใน `getCentralDirectoryLength()`/`reparseCentralDirectoryData()` แบบ exhaustive (16 combos) แต่ครอบคลุมทุกเงื่อนไข true/false อย่างน้อยหนึ่งครั้งต่อ branch ตามหลัก branch coverage
- Fault-detection: กรณี `getLocalFileDataData()` เมื่อมีเพียง size หรือ compressedSize อย่างเดียว ควร throw `IllegalArgumentException` ตาม logic เดิม — หากมี mutant ที่เปลี่ยนเงื่อนไขนี้จะถูกจับได้
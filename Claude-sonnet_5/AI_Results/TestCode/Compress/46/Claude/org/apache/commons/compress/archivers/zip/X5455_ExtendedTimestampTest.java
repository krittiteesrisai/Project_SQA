package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.zip.ZipException;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit4 test suite for X5455_ExtendedTimestamp (Defects4J Compress-46b)
 * เน้นให้ครอบคลุม branch/condition มากที่สุดเท่าที่วิเคราะห์ได้จาก source
 */
public class X5455_ExtendedTimestampTest {

    private X5455_ExtendedTimestamp xf;

    @Before
    public void setUp() {
        xf = new X5455_ExtendedTimestamp();
    }

    // ---------- Basic / header ----------

    @Test
    public void testGetHeaderId() {
        assertEquals(0x5455, xf.getHeaderId().getValue());
    }

    // ---------- setFlags / isBitX_xxxPresent ----------

    @Test
    public void testSetFlags_noBits() {
        xf.setFlags((byte) 0);
        assertFalse(xf.isBit0_modifyTimePresent());
        assertFalse(xf.isBit1_accessTimePresent());
        assertFalse(xf.isBit2_createTimePresent());
        assertEquals(0, xf.getFlags());
    }

    @Test
    public void testSetFlags_allBits() {
        byte all = (byte) (X5455_ExtendedTimestamp.MODIFY_TIME_BIT
                | X5455_ExtendedTimestamp.ACCESS_TIME_BIT
                | X5455_ExtendedTimestamp.CREATE_TIME_BIT);
        xf.setFlags(all);
        assertTrue(xf.isBit0_modifyTimePresent());
        assertTrue(xf.isBit1_accessTimePresent());
        assertTrue(xf.isBit2_createTimePresent());
    }

    @Test
    public void testSetFlags_onlyBit1() {
        xf.setFlags(X5455_ExtendedTimestamp.ACCESS_TIME_BIT);
        assertFalse(xf.isBit0_modifyTimePresent());
        assertTrue(xf.isBit1_accessTimePresent());
        assertFalse(xf.isBit2_createTimePresent());
    }

    @Test
    public void testSetFlags_onlyBit2() {
        xf.setFlags(X5455_ExtendedTimestamp.CREATE_TIME_BIT);
        assertFalse(xf.isBit0_modifyTimePresent());
        assertFalse(xf.isBit1_accessTimePresent());
        assertTrue(xf.isBit2_createTimePresent());
    }

    // ---------- getLocalFileDataLength ----------

    @Test
    public void testGetLocalFileDataLength_none() {
        // flags=0, all time null -> length = 1
        assertEquals(1, xf.getLocalFileDataLength().getValue());
    }

    @Test
    public void testGetLocalFileDataLength_modifyOnly() {
        xf.setModifyTime(new ZipLong(100L));
        assertEquals(1 + 4, xf.getLocalFileDataLength().getValue());
    }

    @Test
    public void testGetLocalFileDataLength_allThree() {
        xf.setModifyTime(new ZipLong(1L));
        xf.setAccessTime(new ZipLong(2L));
        xf.setCreateTime(new ZipLong(3L));
        assertEquals(1 + 4 + 4 + 4, xf.getLocalFileDataLength().getValue());
    }

    @Test
    public void testGetLocalFileDataLength_bit1SetButAccessTimeNull() {
        // bit1 true via setFlags directly, but accessTime field remains null
        xf.setFlags(X5455_ExtendedTimestamp.ACCESS_TIME_BIT);
        // exercises: bit1_accessTimePresent && accessTime != null -> false branch (accessTime null)
        assertEquals(1, xf.getLocalFileDataLength().getValue());
    }

    @Test
    public void testGetLocalFileDataLength_bit2SetButCreateTimeNull() {
        xf.setFlags(X5455_ExtendedTimestamp.CREATE_TIME_BIT);
        assertEquals(1, xf.getLocalFileDataLength().getValue());
    }

    @Test
    public void testGetLocalFileDataLength_accessTimeSetButBitCleared() {
        // decoupled scenario: accessTime non-null but flags cleared afterward
        xf.setAccessTime(new ZipLong(5L));
        xf.setFlags((byte) 0);
        // bit1_accessTimePresent == false -> false branch even though accessTime != null
        assertEquals(1, xf.getLocalFileDataLength().getValue());
    }

    // ---------- getCentralDirectoryLength ----------

    @Test
    public void testGetCentralDirectoryLength_modifyNotSet() {
        assertEquals(1, xf.getCentralDirectoryLength().getValue());
    }

    @Test
    public void testGetCentralDirectoryLength_modifySet() {
        xf.setModifyTime(new ZipLong(10L));
        assertEquals(1 + 4, xf.getCentralDirectoryLength().getValue());
    }

    // ---------- getLocalFileDataData ----------

    @Test
    public void testGetLocalFileDataData_none() {
        byte[] data = xf.getLocalFileDataData();
        assertEquals(1, data.length);
        assertEquals(0, data[0]);
    }

    @Test
    public void testGetLocalFileDataData_modifyOnly() {
        xf.setModifyTime(new ZipLong(123456789L));
        byte[] data = xf.getLocalFileDataData();
        assertEquals(5, data.length);
        assertEquals(X5455_ExtendedTimestamp.MODIFY_TIME_BIT, data[0]);
    }

    @Test
    public void testGetLocalFileDataData_allThree() {
        xf.setModifyTime(new ZipLong(1L));
        xf.setAccessTime(new ZipLong(2L));
        xf.setCreateTime(new ZipLong(3L));
        byte[] data = xf.getLocalFileDataData();
        assertEquals(13, data.length);
        int expectedFlag = X5455_ExtendedTimestamp.MODIFY_TIME_BIT
                | X5455_ExtendedTimestamp.ACCESS_TIME_BIT
                | X5455_ExtendedTimestamp.CREATE_TIME_BIT;
        assertEquals(expectedFlag, data[0]);
    }

    @Test
    public void testGetLocalFileDataData_bitSetButTimeNull_skipsWrite() {
        // bit1/bit2 set directly via setFlags, but times remain null -> should NOT write those 4 bytes
        xf.setModifyTime(new ZipLong(9L));
        xf.setFlags((byte) (X5455_ExtendedTimestamp.MODIFY_TIME_BIT
                | X5455_ExtendedTimestamp.ACCESS_TIME_BIT
                | X5455_ExtendedTimestamp.CREATE_TIME_BIT));
        // modifyTime field still holds value 9 from earlier call; access/create are null
        byte[] data = xf.getLocalFileDataData();
        // length is computed by getLocalFileDataLength, which also skips null access/create
        assertEquals(5, data.length);
    }

    // ---------- getCentralDirectoryData ----------

    @Test
    public void testGetCentralDirectoryData_truncatesAccessCreate() {
        xf.setModifyTime(new ZipLong(1L));
        xf.setAccessTime(new ZipLong(2L));
        xf.setCreateTime(new ZipLong(3L));
        byte[] central = xf.getCentralDirectoryData();
        assertEquals(5, central.length);
        assertEquals(X5455_ExtendedTimestamp.MODIFY_TIME_BIT, central[0]);
    }

    @Test
    public void testGetCentralDirectoryData_noModify() {
        byte[] central = xf.getCentralDirectoryData();
        assertEquals(1, central.length);
        assertEquals(0, central[0]);
    }

    // ---------- parseFromLocalFileData ----------

    @Test
    public void testParseFromLocalFileData_full() throws ZipException {
        byte flags = (byte) (X5455_ExtendedTimestamp.MODIFY_TIME_BIT
                | X5455_ExtendedTimestamp.ACCESS_TIME_BIT
                | X5455_ExtendedTimestamp.CREATE_TIME_BIT);
        byte[] data = new byte[13];
        data[0] = flags;
        System.arraycopy(new ZipLong(100L).getBytes(), 0, data, 1, 4);
        System.arraycopy(new ZipLong(200L).getBytes(), 0, data, 5, 4);
        System.arraycopy(new ZipLong(300L).getBytes(), 0, data, 9, 4);

        xf.parseFromLocalFileData(data, 0, data.length);

        assertTrue(xf.isBit0_modifyTimePresent());
        assertTrue(xf.isBit1_accessTimePresent());
        assertTrue(xf.isBit2_createTimePresent());
        assertEquals(100L, xf.getModifyTime().getValue());
        assertEquals(200L, xf.getAccessTime().getValue());
        assertEquals(300L, xf.getCreateTime().getValue());
    }

    @Test
    public void testParseFromLocalFileData_modifyOnly() throws ZipException {
        byte[] data = new byte[5];
        data[0] = X5455_ExtendedTimestamp.MODIFY_TIME_BIT;
        System.arraycopy(new ZipLong(42L).getBytes(), 0, data, 1, 4);

        xf.parseFromLocalFileData(data, 0, data.length);

        assertTrue(xf.isBit0_modifyTimePresent());
        assertFalse(xf.isBit1_accessTimePresent());
        assertFalse(xf.isBit2_createTimePresent());
        assertEquals(42L, xf.getModifyTime().getValue());
        assertNull(xf.getAccessTime());
        assertNull(xf.getCreateTime());
    }

    @Test
    public void testParseFromLocalFileData_centralStyle_shortLength() throws ZipException {
        // Simulate "central" style data: flags say access+create present,
        // but actual length only large enough for modify time.
        // -> exercises false branch of (offset + 4 <= len) for access & create
        byte flags = (byte) (X5455_ExtendedTimestamp.MODIFY_TIME_BIT
                | X5455_ExtendedTimestamp.ACCESS_TIME_BIT
                | X5455_ExtendedTimestamp.CREATE_TIME_BIT);
        byte[] data = new byte[5]; // only room for modify time
        data[0] = flags;
        System.arraycopy(new ZipLong(77L).getBytes(), 0, data, 1, 4);

        xf.parseFromLocalFileData(data, 0, data.length);

        assertTrue(xf.isBit0_modifyTimePresent());
        assertTrue(xf.isBit1_accessTimePresent()); // flag bit still set...
        assertTrue(xf.isBit2_createTimePresent());
        assertEquals(77L, xf.getModifyTime().getValue());
        assertNull(xf.getAccessTime()); // ...but value not parsed due to length check
        assertNull(xf.getCreateTime());
    }

    @Test
    public void testParseFromLocalFileData_noModifyBit_accessCreatePresent() throws ZipException {
        // bit0=0 (skip modify parse), bit1/bit2=1
        byte flags = (byte) (X5455_ExtendedTimestamp.ACCESS_TIME_BIT
                | X5455_ExtendedTimestamp.CREATE_TIME_BIT);
        byte[] data = new byte[9];
        data[0] = flags;
        System.arraycopy(new ZipLong(11L).getBytes(), 0, data, 1, 4);
        System.arraycopy(new ZipLong(22L).getBytes(), 0, data, 5, 4);

        xf.parseFromLocalFileData(data, 0, data.length);

        assertFalse(xf.isBit0_modifyTimePresent());
        assertNull(xf.getModifyTime());
        assertTrue(xf.isBit1_accessTimePresent());
        assertEquals(11L, xf.getAccessTime().getValue());
        assertTrue(xf.isBit2_createTimePresent());
        assertEquals(22L, xf.getCreateTime().getValue());
    }

    @Test
    public void testParseFromLocalFileData_zeroFlags() throws ZipException {
        byte[] data = new byte[]{0};
        xf.parseFromLocalFileData(data, 0, data.length);
        assertFalse(xf.isBit0_modifyTimePresent());
        assertFalse(xf.isBit1_accessTimePresent());
        assertFalse(xf.isBit2_createTimePresent());
        assertNull(xf.getModifyTime());
        assertNull(xf.getAccessTime());
        assertNull(xf.getCreateTime());
    }

    @Test
    public void testParseFromLocalFileData_withNonZeroOffset() throws ZipException {
        byte[] raw = new byte[]{
                (byte) 0xFF, // padding before real data (offset)
                X5455_ExtendedTimestamp.MODIFY_TIME_BIT,
                0, 0, 0, 55
        };
        xf.parseFromLocalFileData(raw, 1, raw.length - 1);
        assertTrue(xf.isBit0_modifyTimePresent());
        assertEquals(0x37000000, xf.getModifyTime().getValue() & 0xFF000000); // sanity that bytes were used from offset
    }

    /*
     * หมายเหตุ: หากข้อมูลสั้นเกินไปสำหรับ modify-time (บิต0 set แต่ไม่มีการตรวจความยาว)
     * โค้ดต้นทางไม่มีการป้องกัน -> คาดว่าจะเกิด ArrayIndexOutOfBoundsException
     * (พฤติกรรมนี้อนุมานจากโค้ดจริง ไม่ใช่การเดา)
     */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testParseFromLocalFileData_insufficientDataForModify_throws() throws ZipException {
        byte[] data = new byte[]{X5455_ExtendedTimestamp.MODIFY_TIME_BIT, 1, 2}; // too short for 4-byte long
        xf.parseFromLocalFileData(data, 0, data.length);
    }

    // ---------- parseFromCentralDirectoryData ----------

    @Test
    public void testParseFromCentralDirectoryData_delegatesAndResets() throws ZipException {
        // pre-populate then parse should reset state first
        xf.setCreateTime(new ZipLong(999L));
        byte[] data = new byte[]{X5455_ExtendedTimestamp.MODIFY_TIME_BIT, 0, 0, 0, 5};
        xf.parseFromCentralDirectoryData(data, 0, data.length);
        assertTrue(xf.isBit0_modifyTimePresent());
        assertEquals(5L, xf.getModifyTime().getValue());
        assertFalse(xf.isBit2_createTimePresent());
        assertNull(xf.getCreateTime()); // reset() cleared old value
    }

    // ---------- getModifyJavaTime / getAccessJavaTime / getCreateJavaTime ----------

    @Test
    public void testGetJavaTimeMethods_null() {
        assertNull(xf.getModifyJavaTime());
        assertNull(xf.getAccessJavaTime());
        assertNull(xf.getCreateJavaTime());
    }

    @Test
    public void testGetJavaTimeMethods_nonNull() {
        xf.setModifyTime(new ZipLong(100L));
        xf.setAccessTime(new ZipLong(200L));
        xf.setCreateTime(new ZipLong(300L));

        assertEquals(new Date(100L * 1000L), xf.getModifyJavaTime());
        assertEquals(new Date(200L * 1000L), xf.getAccessJavaTime());
        assertEquals(new Date(300L * 1000L), xf.getCreateJavaTime());
    }

    // ---------- setModifyTime / setAccessTime / setCreateTime (null vs non-null) ----------

    @Test
    public void testSetModifyTime_nonNull_setsBitAndFlag() {
        xf.setModifyTime(new ZipLong(1L));
        assertTrue(xf.isBit0_modifyTimePresent());
        assertEquals(X5455_ExtendedTimestamp.MODIFY_TIME_BIT, xf.getFlags());
    }

    @Test
    public void testSetModifyTime_null_clearsBitAndFlag() {
        xf.setModifyTime(new ZipLong(1L));
        xf.setModifyTime(null);
        assertFalse(xf.isBit0_modifyTimePresent());
        assertEquals(0, xf.getFlags());
        assertNull(xf.getModifyTime());
    }

    @Test
    public void testSetAccessTime_nonNull_setsBitAndFlag() {
        xf.setAccessTime(new ZipLong(2L));
        assertTrue(xf.isBit1_accessTimePresent());
        assertEquals(X5455_ExtendedTimestamp.ACCESS_TIME_BIT, xf.getFlags());
    }

    @Test
    public void testSetAccessTime_null_clearsBitAndFlag() {
        xf.setAccessTime(new ZipLong(2L));
        xf.setAccessTime(null);
        assertFalse(xf.isBit1_accessTimePresent());
        assertEquals(0, xf.getFlags());
        assertNull(xf.getAccessTime());
    }

    @Test
    public void testSetCreateTime_nonNull_setsBitAndFlag() {
        xf.setCreateTime(new ZipLong(3L));
        assertTrue(xf.isBit2_createTimePresent());
        assertEquals(X5455_ExtendedTimestamp.CREATE_TIME_BIT, xf.getFlags());
    }

    @Test
    public void testSetCreateTime_null_clearsBitAndFlag() {
        xf.setCreateTime(new ZipLong(3L));
        xf.setCreateTime(null);
        assertFalse(xf.isBit2_createTimePresent());
        assertEquals(0, xf.getFlags());
        assertNull(xf.getCreateTime());
    }

    // ---------- setModifyJavaTime / setAccessJavaTime / setCreateJavaTime ----------

    @Test
    public void testSetModifyJavaTime_null() {
        xf.setModifyJavaTime(null);
        assertFalse(xf.isBit0_modifyTimePresent());
        assertNull(xf.getModifyTime());
    }

    @Test
    public void testSetModifyJavaTime_nonNull_truncatesMillis() {
        Date d = new Date(123456L * 1000L + 999L); // has millis
        xf.setModifyJavaTime(d);
        assertTrue(xf.isBit0_modifyTimePresent());
        assertEquals(123456L, xf.getModifyTime().getValue());
    }

    @Test
    public void testSetAccessJavaTime_nonNull() {
        Date d = new Date(500L * 1000L);
        xf.setAccessJavaTime(d);
        assertEquals(500L, xf.getAccessTime().getValue());
    }

    @Test
    public void testSetCreateJavaTime_nonNull() {
        Date d = new Date(600L * 1000L);
        xf.setCreateJavaTime(d);
        assertEquals(600L, xf.getCreateTime().getValue());
    }

    // ---------- dateToZipLong / unixTimeToZipLong boundary ----------

    @Test
    public void testSetModifyJavaTime_boundaryJustBelowLimit_noException() {
        long TWO_TO_32 = 0x100000000L;
        Date d = new Date((TWO_TO_32 - 1) * 1000L);
        xf.setModifyJavaTime(d); // should not throw
        assertEquals(TWO_TO_32 - 1, xf.getModifyTime().getValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetModifyJavaTime_atLimit_throwsIllegalArgumentException() {
        long TWO_TO_32 = 0x100000000L;
        Date d = new Date(TWO_TO_32 * 1000L);
        xf.setModifyJavaTime(d); // should throw since l >= TWO_TO_32
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAccessJavaTime_overLimit_throws() {
        long TWO_TO_32 = 0x100000000L;
        Date d = new Date((TWO_TO_32 + 10) * 1000L);
        xf.setAccessJavaTime(d);
    }

    // ---------- toString ----------

    @Test
    public void testToString_noneSet() {
        String s = xf.toString();
        assertTrue(s.contains("0x5455 Zip Extra Field: Flags="));
        assertFalse(s.contains("Modify:"));
        assertFalse(s.contains("Access:"));
        assertFalse(s.contains("Create:"));
    }

    @Test
    public void testToString_allSet() {
        xf.setModifyTime(new ZipLong(1L));
        xf.setAccessTime(new ZipLong(2L));
        xf.setCreateTime(new ZipLong(3L));
        String s = xf.toString();
        assertTrue(s.contains("Modify:"));
        assertTrue(s.contains("Access:"));
        assertTrue(s.contains("Create:"));
    }

    @Test
    public void testToString_bitSetButTimeNull_notPrinted() {
        // exercises false-branch: bit1_accessTimePresent true but accessTime == null
        xf.setFlags((byte) (X5455_ExtendedTimestamp.ACCESS_TIME_BIT
                | X5455_ExtendedTimestamp.CREATE_TIME_BIT));
        String s = xf.toString();
        assertFalse(s.contains("Access:"));
        assertFalse(s.contains("Create:"));
    }

    // ---------- equals ----------

    @Test
    public void testEquals_null() {
        assertFalse(xf.equals(null));
    }

    @Test
    public void testEquals_differentClass() {
        assertFalse(xf.equals("not-an-extra-field"));
    }

    @Test
    public void testEquals_sameInstance() {
        assertTrue(xf.equals(xf));
    }

    @Test
    public void testEquals_bothEmpty() {
        X5455_ExtendedTimestamp other = new X5455_ExtendedTimestamp();
        assertTrue(xf.equals(other));
    }

    @Test
    public void testEquals_sameValues() {
        xf.setModifyTime(new ZipLong(1L));
        xf.setAccessTime(new ZipLong(2L));
        xf.setCreateTime(new ZipLong(3L));

        X5455_ExtendedTimestamp other = new X5455_ExtendedTimestamp();
        other.setModifyTime(new ZipLong(1L));
        other.setAccessTime(new ZipLong(2L));
        other.setCreateTime(new ZipLong(3L));

        assertTrue(xf.equals(other));
    }

    @Test
    public void testEquals_differentFlags() {
        xf.setFlags(X5455_ExtendedTimestamp.MODIFY_TIME_BIT);
        X5455_ExtendedTimestamp other = new X5455_ExtendedTimestamp();
        other.setFlags(X5455_ExtendedTimestamp.ACCESS_TIME_BIT);
        assertFalse(xf.equals(other));
    }

    @Test
    public void testEquals_ignoresExtraBitsBeyondBit2() {
        xf.setFlags((byte) (X5455_ExtendedTimestamp.MODIFY_TIME_BIT | 0x08)); // extra bit set
        X5455_ExtendedTimestamp other = new X5455_ExtendedTimestamp();
        other.setFlags(X5455_ExtendedTimestamp.MODIFY_TIME_BIT);
        assertTrue(xf.equals(other)); // only low 3 bits matter
    }

    @Test
    public void testEquals_oneNullOneNonNullModifyTime() {
        xf.setModifyTime(new ZipLong(1L));
        X5455_ExtendedTimestamp other = new X5455_ExtendedTimestamp();
        // other.modifyTime stays null, but to keep flags identical set flags same as xf without touching time
        other.setFlags(xf.getFlags());
        assertFalse(xf.equals(other));
    }

    @Test
    public void testEquals_differentModifyTimeValue() {
        xf.setModifyTime(new ZipLong(1L));
        X5455_ExtendedTimestamp other = new X5455_ExtendedTimestamp();
        other.setModifyTime(new ZipLong(2L));
        assertFalse(xf.equals(other));
    }

    @Test
    public void testEquals_differentAccessTimeValue() {
        xf.setAccessTime(new ZipLong(10L));
        X5455_ExtendedTimestamp other = new X5455_ExtendedTimestamp();
        other.setAccessTime(new ZipLong(20L));
        assertFalse(xf.equals(other));
    }

    @Test
    public void testEquals_differentCreateTimeValue() {
        xf.setCreateTime(new ZipLong(10L));
        X5455_ExtendedTimestamp other = new X5455_ExtendedTimestamp();
        other.setCreateTime(new ZipLong(20L));
        assertFalse(xf.equals(other));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_emptyIsZero() {
        assertEquals(0, xf.hashCode());
    }

    @Test
    public void testHashCode_withModifyOnly() {
        xf.setModifyTime(new ZipLong(5L));
        int expected = (-123 * (xf.getFlags() & 0x07)) ^ new ZipLong(5L).hashCode();
        assertEquals(expected, xf.hashCode());
    }

    @Test
    public void testHashCode_withAllThreeFields() {
        xf.setModifyTime(new ZipLong(1L));
        xf.setAccessTime(new ZipLong(2L));
        xf.setCreateTime(new ZipLong(3L));
        // just ensure no exception & consistent across calls
        int h1 = xf.hashCode();
        int h2 = xf.hashCode();
        assertEquals(h1, h2);
    }

    @Test
    public void testHashCode_equalObjectsHaveSameHashCode() {
        xf.setModifyTime(new ZipLong(7L));
        X5455_ExtendedTimestamp other = new X5455_ExtendedTimestamp();
        other.setModifyTime(new ZipLong(7L));
        assertEquals(xf.hashCode(), other.hashCode());
    }

    // ---------- clone ----------

    @Test
    public void testClone_producesEqualButDistinctInstance() throws CloneNotSupportedException {
        xf.setModifyTime(new ZipLong(1L));
        xf.setAccessTime(new ZipLong(2L));
        xf.setCreateTime(new ZipLong(3L));

        Object clone = xf.clone();
        assertNotSame(xf, clone);
        assertTrue(clone instanceof X5455_ExtendedTimestamp);
        assertEquals(xf, clone);
        assertEquals(xf.hashCode(), clone.hashCode());
    }

    @Test
    public void testClone_emptyInstance() throws CloneNotSupportedException {
        Object clone = xf.clone();
        assertEquals(xf, clone);
    }
}

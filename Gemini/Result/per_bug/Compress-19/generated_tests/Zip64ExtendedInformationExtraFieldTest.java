package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import java.util.zip.ZipException;

import static org.junit.Assert.*;

public class Zip64ExtendedInformationExtraFieldTest {

    private static final ZipEightByteInteger DUMMY_SIZE = new ZipEightByteInteger(100);
    private static final ZipEightByteInteger DUMMY_COMPRESSED = new ZipEightByteInteger(50);
    private static final ZipEightByteInteger DUMMY_OFFSET = new ZipEightByteInteger(10);
    private static final ZipLong DUMMY_DISK = new ZipLong(1);

    @Test
    public void testHeaderId() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        assertEquals(new ZipShort(0x0001), field.getHeaderId());
    }

    @Test
    public void testGettersAndSetters() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.setSize(DUMMY_SIZE);
        field.setCompressedSize(DUMMY_COMPRESSED);
        field.setRelativeHeaderOffset(DUMMY_OFFSET);
        field.setDiskStartNumber(DUMMY_DISK);

        assertEquals(DUMMY_SIZE, field.getSize());
        assertEquals(DUMMY_COMPRESSED, field.getCompressedSize());
        assertEquals(DUMMY_OFFSET, field.getRelativeHeaderOffset());
        assertEquals(DUMMY_DISK, field.getDiskStartNumber());
    }

    @Test
    public void testGetLocalFileDataLengthWhenNull() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        assertEquals(0, field.getLocalFileDataLength().getValue());
    }

    @Test
    public void testGetLocalFileDataLengthWhenNotNull() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(DUMMY_SIZE, DUMMY_COMPRESSED);
        assertEquals(16, field.getLocalFileDataLength().getValue()); // 2 * DWORD (8 bytes each)
    }

    @Test
    public void testGetCentralDirectoryLengthVariants() {
        // All null
        Zip64ExtendedInformationExtraField field1 = new Zip64ExtendedInformationExtraField();
        assertEquals(0, field1.getCentralDirectoryLength().getValue());

        // Partial and full
        Zip64ExtendedInformationExtraField field2 = new Zip64ExtendedInformationExtraField(
            DUMMY_SIZE, DUMMY_COMPRESSED, DUMMY_OFFSET, DUMMY_DISK
        );
        // DWORD + DWORD + DWORD + WORD = 8 + 8 + 8 + 4 = 28
        assertEquals(28, field2.getCentralDirectoryLength().getValue());
    }

    @Test
    public void testGetLocalFileDataDataEmpty() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        byte[] data = field.getLocalFileDataData();
        assertNotNull(data);
        assertEquals(0, data.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLocalFileDataDataMissingCompressedSize() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(DUMMY_SIZE, null);
        field.getLocalFileDataData();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLocalFileDataDataMissingSize() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(null, DUMMY_COMPRESSED);
        field.getLocalFileDataData();
    }

    @Test
    public void testGetLocalFileDataDataSuccess() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(DUMMY_SIZE, DUMMY_COMPRESSED);
        byte[] data = field.getLocalFileDataData();
        assertEquals(16, data.length);
    }

    @Test
    public void testGetCentralDirectoryDataSuccess() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(
            DUMMY_SIZE, DUMMY_COMPRESSED, DUMMY_OFFSET, DUMMY_DISK
        );
        byte[] data = field.getCentralDirectoryData();
        assertEquals(28, data.length);
    }

    @Test
    public void testParseFromLocalFileDataZeroLength() throws ZipException {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromLocalFileData(new byte[0], 0, 0);
        assertNull(field.getSize());
    }

    @Test(expected = ZipException.class)
    public void testParseFromLocalFileDataInvalidLength() throws ZipException {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromLocalFileData(new byte[5], 0, 5); // Less than 2 * DWORD (16)
    }

    @Test
    public void testParseFromLocalFileDataWithOptions() throws ZipException {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        // 16 bytes sizes + 8 bytes offset + 4 bytes disk = 28 bytes
        byte[] buffer = new byte[28];
        field.parseFromLocalFileData(buffer, 0, 28);
        assertNotNull(field.getSize());
        assertNotNull(field.getCompressedSize());
        assertNotNull(field.getRelativeHeaderOffset());
        assertNotNull(field.getDiskStartNumber());
    }

    @Test
    public void testParseFromCentralDirectoryDataBranch1() throws ZipException {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        byte[] buffer = new byte[28]; // >= 3 * DWORD + WORD (28)
        field.parseFromCentralDirectoryData(buffer, 0, 28);
        assertNotNull(field.getSize());
    }

    @Test
    public void testParseFromCentralDirectoryDataBranch2() throws ZipException {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        byte[] buffer = new byte[24]; // == 3 * DWORD
        field.parseFromCentralDirectoryData(buffer, 0, 24);
        assertNotNull(field.getRelativeHeaderOffset());
    }

    @Test
    public void testParseFromCentralDirectoryDataBranch3() throws ZipException {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        byte[] buffer = new byte[4]; // length % DWORD == WORD (4 % 8 = 4)
        field.parseFromCentralDirectoryData(buffer, 0, 4);
        assertNotNull(field.getDiskStartNumber());
    }

    @Test
    public void testReparseCentralDirectoryDataNullRaw() throws ZipException {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.reparseCentralDirectoryData(true, true, true, true);
        assertNull(field.getSize());
    }

    @Test(expected = ZipException.class)
    public void testReparseCentralDirectoryDataLengthMismatch() throws ZipException {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        byte[] buffer = new byte[8];
        field.parseFromCentralDirectoryData(buffer, 0, 8);
        // Expected length will be 8 (1 flag) but raw size is 8? Let's force mismatch:
        // Expected: uncompressed(8) + compressed(8) = 16, but buffer is 8.
        field.reparseCentralDirectoryData(true, true, false, false);
    }

    @Test
    public void testReparseCentralDirectoryDataSuccess() throws ZipException {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        byte[] buffer = new byte[28];
        field.parseFromCentralDirectoryData(buffer, 0, 28);
        
        Zip64ExtendedInformationExtraField field2 = new Zip64ExtendedInformationExtraField();
        field2.parseFromCentralDirectoryData(buffer, 0, 28);
        field2.reparseCentralDirectoryData(true, true, true, true);
        assertNotNull(field2.getSize());
        assertNotNull(field2.getCompressedSize());
        assertNotNull(field2.getRelativeHeaderOffset());
        assertNotNull(field2.getDiskStartNumber());
    }
}
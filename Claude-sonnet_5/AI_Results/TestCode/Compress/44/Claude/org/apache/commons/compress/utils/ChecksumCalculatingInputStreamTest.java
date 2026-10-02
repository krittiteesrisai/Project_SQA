package org.apache.commons.compress.utils;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

import org.junit.Test;
import org.mockito.Mockito;

public class ChecksumCalculatingInputStreamTest {

    // ---------------------------------------------------------------
    // read() : ret >= 0  == true  (มีข้อมูล)
    // ---------------------------------------------------------------
    @Test
    public void testRead_SingleByte_NormalData_UpdatesChecksum() throws IOException {
        byte[] data = { 65 }; // 'A'
        CRC32 crc = new CRC32();
        crc.update(data); // ค่าที่คาดหวัง (คำนวณล่วงหน้าด้วย checksum แยก)
        long expected = crc.getValue();

        CRC32 crcUnderTest = new CRC32();
        ChecksumCalculatingInputStream cis =
                new ChecksumCalculatingInputStream(crcUnderTest, new ByteArrayInputStream(data));

        int b = cis.read();
        assertEquals(65, b);
        assertEquals(expected, cis.getValue());
    }

    // ---------------------------------------------------------------
    // read() : ret >= 0 == false (EOF) -> checksum ไม่ถูก update
    // ---------------------------------------------------------------
    @Test
    public void testRead_SingleByte_EOF_DoesNotUpdateChecksum() throws IOException {
        Checksum mockChecksum = mock(Checksum.class);
        InputStream empty = new ByteArrayInputStream(new byte[0]);
        ChecksumCalculatingInputStream cis =
                new ChecksumCalculatingInputStream(mockChecksum, empty);

        int b = cis.read();
        assertEquals(-1, b);
        verify(mockChecksum, never()).update(anyInt());
    }

    // ---------------------------------------------------------------
    // read(byte[]) -> delegate ไปที่ read(b, 0, b.length)
    // ---------------------------------------------------------------
    @Test
    public void testReadByteArray_NormalData() throws IOException {
        byte[] data = { 1, 2, 3, 4 };
        CRC32 crc = new CRC32();
        ChecksumCalculatingInputStream cis =
                new ChecksumCalculatingInputStream(crc, new ByteArrayInputStream(data));

        byte[] buf = new byte[4];
        int n = cis.read(buf);

        assertEquals(4, n);
        assertArrayEquals(data, buf);

        CRC32 expectedCrc = new CRC32();
        expectedCrc.update(data);
        assertEquals(expectedCrc.getValue(), cis.getValue());
    }

    @Test
    public void testReadByteArray_EOF_ReturnsMinusOne() throws IOException {
        Checksum mockChecksum = mock(Checksum.class);
        InputStream empty = new ByteArrayInputStream(new byte[0]);
        ChecksumCalculatingInputStream cis =
                new ChecksumCalculatingInputStream(mockChecksum, empty);

        byte[] buf = new byte[4];
        int n = cis.read(buf);

        assertEquals(-1, n);
        verify(mockChecksum, never()).update(any(byte[].class), anyInt(), anyInt());
    }

    // NPE เพราะ read(byte[]) เรียก b.length โดยไม่ validate null (พฤติกรรม default ของ Java)
    @Test(expected = NullPointerException.class)
    public void testReadByteArray_NullArray_ThrowsNPE() throws IOException {
        CRC32 crc = new CRC32();
        ChecksumCalculatingInputStream cis =
                new ChecksumCalculatingInputStream(crc, new ByteArrayInputStream(new byte[]{1}));
        cis.read((byte[]) null);
    }

    // ---------------------------------------------------------------
    // read(byte[], off, len) : ret >= 0 == true (มีข้อมูลเต็ม)
    // ---------------------------------------------------------------
    @Test
    public void testReadByteArrayOffsetLen_NormalData() throws IOException {
        byte[] data = { 10, 20, 30, 40, 50 };
        CRC32 crc = new CRC32();
        ChecksumCalculatingInputStream cis =
                new ChecksumCalculatingInputStream(crc, new ByteArrayInputStream(data));

        byte[] buf = new byte[5];
        int n = cis.read(buf, 1, 3); // อ่านเข้าตำแหน่ง off=1, len=3

        assertEquals(3, n);
        assertArrayEquals(new byte[]{10, 20, 30}, new byte[]{buf[1], buf[2], buf[3]});

        CRC32 expectedCrc = new CRC32();
        expectedCrc.update(data, 0, 3); // เทียบเฉพาะ 3 ไบต์ที่อ่านจริง
        assertEquals(expectedCrc.getValue(), cis.getValue());
    }

    // ---------------------------------------------------------------
    // read(byte[], off, len) : ret >= 0 == false (EOF)
    // ---------------------------------------------------------------
    @Test
    public void testReadByteArrayOffsetLen_EOF_DoesNotUpdate() throws IOException {
        Checksum mockChecksum = mock(Checksum.class);
        InputStream empty = new ByteArrayInputStream(new byte[0]);
        ChecksumCalculatingInputStream cis =
                new ChecksumCalculatingInputStream(mockChecksum, empty);

        byte[] buf = new byte[5];
        int n = cis.read(buf, 0, 5);

        assertEquals(-1, n);
        verify(mockChecksum, never()).update(any(byte[].class), anyInt(), anyInt());
    }

    // Boundary case: len = 0 -> ret มักเป็น 0 (>=0 == true) แต่ update ด้วยความยาว 0
    @Test
    public void testReadByteArrayOffsetLen_LenZero_UpdateCalledWithZeroLength() throws IOException {
        Checksum mockChecksum = mock(Checksum.class);
        byte[] data = { 1, 2, 3 };
        ChecksumCalculatingInputStream cis =
                new ChecksumCalculatingInputStream(mockChecksum, new ByteArrayInputStream(data));

        byte[] buf = new byte[3];
        int n = cis.read(buf, 0, 0);

        assertEquals(0, n);
        // ret >= 0 เป็น true (0 >= 0) ดังนั้นควรมีการเรียก update ด้วย len 0
        verify(mockChecksum, times(1)).update(buf, 0, 0);
    }

    // ---------------------------------------------------------------
    // Partial read (ret > 0 แต่น้อยกว่า len ที่ขอ)
    // ---------------------------------------------------------------
    @Test
    public void testReadByteArrayOffsetLen_PartialRead() throws IOException {
        InputStream mockIn = mock(InputStream.class);
        Checksum mockChecksum = mock(Checksum.class);

        // จำลองว่า in.read คืนค่าน้อยกว่า len ที่ขอ (partial read)
        when(mockIn.read(any(byte[].class), eq(0), eq(10))).thenReturn(4);

        ChecksumCalculatingInputStream cis =
                new ChecksumCalculatingInputStream(mockChecksum, mockIn);

        byte[] buf = new byte[10];
        int n = cis.read(buf, 0, 10);

        assertEquals(4, n);
        verify(mockChecksum, times(1)).update(buf, 0, 4);
    }

    // ---------------------------------------------------------------
    // skip() : read() >= 0 == true -> return 1
    // ---------------------------------------------------------------
    @Test
    public void testSkip_WhenDataAvailable_Returns1() throws IOException {
        byte[] data = { 99 };
        CRC32 crc = new CRC32();
        ChecksumCalculatingInputStream cis =
                new ChecksumCalculatingInputStream(crc, new ByteArrayInputStream(data));

        long skipped = cis.skip(5); // ค่า n ไม่ถูกใช้จริงในโค้ด (ตามซอร์ส)
        assertEquals(1L, skipped);

        // ตรวจว่า checksum ถูก update จาก byte ที่ read() อ่านไปแล้วจริง
        CRC32 expectedCrc = new CRC32();
        expectedCrc.update(99);
        assertEquals(expectedCrc.getValue(), cis.getValue());
    }

    // ---------------------------------------------------------------
    // skip() : read() >= 0 == false (EOF) -> return 0
    // ---------------------------------------------------------------
    @Test
    public void testSkip_WhenEOF_Returns0() throws IOException {
        Checksum mockChecksum = mock(Checksum.class);
        InputStream empty = new ByteArrayInputStream(new byte[0]);
        ChecksumCalculatingInputStream cis =
                new ChecksumCalculatingInputStream(mockChecksum, empty);

        long skipped = cis.skip(3);
        assertEquals(0L, skipped);
        verify(mockChecksum, never()).update(anyInt());
    }

    // ---------------------------------------------------------------
    // getValue() : ค่าเริ่มต้น (ยังไม่มีการอ่าน)
    // ---------------------------------------------------------------
    @Test
    public void testGetValue_InitialStateIsZero() {
        CRC32 crc = new CRC32();
        ChecksumCalculatingInputStream cis =
                new ChecksumCalculatingInputStream(crc, new ByteArrayInputStream(new byte[0]));

        // CRC32 ค่าเริ่มต้นคือ 0 ตาม java.util.zip.CRC32 spec
        assertEquals(0L, cis.getValue());
    }

    // ---------------------------------------------------------------
    // getValue() : หลังจากอ่านข้อมูลแล้ว ค่าต้องตรงกับ checksum โดยตรง
    // ---------------------------------------------------------------
    @Test
    public void testGetValue_AfterReadingMatchesChecksumDirectly() throws IOException {
        byte[] data = "HelloWorld".getBytes();
        CRC32 crc = new CRC32();
        ChecksumCalculatingInputStream cis =
                new ChecksumCalculatingInputStream(crc, new ByteArrayInputStream(data));

        byte[] buf = new byte[data.length];
        cis.read(buf);

        CRC32 direct = new CRC32();
        direct.update(data);

        assertEquals(direct.getValue(), cis.getValue());
    }

    // ---------------------------------------------------------------
    // การ propagate IOException จาก underlying InputStream
    // ---------------------------------------------------------------
    @Test(expected = IOException.class)
    public void testRead_PropagatesIOExceptionFromUnderlyingStream() throws IOException {
        InputStream mockIn = mock(InputStream.class);
        when(mockIn.read()).thenThrow(new IOException("boom"));
        Checksum crc = new CRC32();

        ChecksumCalculatingInputStream cis =
                new ChecksumCalculatingInputStream(crc, mockIn);
        cis.read();
    }

    @Test(expected = IOException.class)
    public void testReadByteArrayOffsetLen_PropagatesIOException() throws IOException {
        InputStream mockIn = mock(InputStream.class);
        when(mockIn.read(any(byte[].class), anyInt(), anyInt()))
                .thenThrow(new IOException("boom"));
        Checksum crc = new CRC32();

        ChecksumCalculatingInputStream cis =
                new ChecksumCalculatingInputStream(crc, mockIn);
        cis.read(new byte[10], 0, 10);
    }

    // ---------------------------------------------------------------
    // Constructor: null Checksum -> ยังไม่มี validation ในซอร์ส
    // คาดว่าจะเกิด NPE เมื่อมีการเรียก checksum.update() จริง (ยังไม่ระบุ behavior ชัดเจนใน spec)
    // ---------------------------------------------------------------
    @Test(expected = NullPointerException.class)
    public void testConstructor_NullChecksum_ThrowsNPEOnUpdate() throws IOException {
        byte[] data = { 1 };
        ChecksumCalculatingInputStream cis =
                new ChecksumCalculatingInputStream(null, new ByteArrayInputStream(data));
        cis.read(); // ret >= 0 -> พยายามเรียก null.update() -> NPE
    }

    // Constructor: null InputStream -> NPE เมื่อเรียก in.read()
    @Test(expected = NullPointerException.class)
    public void testConstructor_NullInputStream_ThrowsNPEOnRead() throws IOException {
        CRC32 crc = new CRC32();
        ChecksumCalculatingInputStream cis =
                new ChecksumCalculatingInputStream(crc, null);
        cis.read();
    }
}

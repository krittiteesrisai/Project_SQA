package org.apache.commons.compress.archivers;

import org.junit.Test;
import org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.utils.CountingOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import java.util.zip.Inflater;
import java.util.zip.CRC32;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_compress_archivers_ArchiveStreamFactoryTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveOutputStream
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createArchiveOutputStream(java.lang.String, java.io.OutputStream)
    
    /**
    @utbot.classUnderTest {@link ArchiveStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ArchiveStreamFactory#createArchiveOutputStream(java.lang.String,java.io.OutputStream)}
 * @utbot.executesCondition {@code (archiverName == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: archiverName == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStream_ThrowIllegalArgumentException() throws ArchiveException  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        
        archiveStreamFactory.createArchiveOutputStream(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ArchiveStreamFactory#createArchiveOutputStream(java.lang.String,java.io.OutputStream)}
 * @utbot.executesCondition {@code (archiverName == null): False}
 * @utbot.executesCondition {@code (out == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: out == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStream_ThrowIllegalArgumentException_1() throws ArchiveException  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        String string = "";
        
        archiveStreamFactory.createArchiveOutputStream(string, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createArchiveOutputStream(java.lang.String, java.io.OutputStream)
    
    @Test
    public void testCreateArchiveOutputStream1() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        String string = "Tar";
        Pack200CompressorOutputStream pack200CompressorOutputStream = ((Pack200CompressorOutputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream"));
        
        TarArchiveOutputStream actual = ((TarArchiveOutputStream) archiveStreamFactory.createArchiveOutputStream(string, pack200CompressorOutputStream));
        
        TarArchiveOutputStream expected = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(expected, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", 0L);
        setField(expected, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", 0L);
        byte[] recordBuf = new byte[512];
        setField(expected, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        byte[] assemBuf = new byte[512];
        setField(expected, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        Object buffer = createInstance("org.apache.commons.compress.archivers.tar.TarBuffer");
        CountingOutputStream outStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.utils.CountingOutputStream"));
        setField(outStream, "org.apache.commons.compress.utils.CountingOutputStream", "bytesWritten", 0L);
        setField(outStream, "java.io.FilterOutputStream", "out", pack200CompressorOutputStream);
        Object closeLock = createInstance("java.lang.Object");
        setField(outStream, "java.io.FilterOutputStream", "closeLock", closeLock);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = new byte[10240];
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 10240);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 512);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 20);
        setField(expected, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(expected, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", outStream);
        byte[] oneByte = {(byte) 0};
        setField(expected, "org.apache.commons.compress.archivers.ArchiveOutputStream", "oneByte", oneByte);
        setField(expected, "org.apache.commons.compress.archivers.ArchiveOutputStream", "bytesWritten", 0L);
        
        long expectedCurrSize = ((Long) getFieldValue(expected, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize"));
        long actualCurrSize = ((Long) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize"));
        assertEquals(expectedCurrSize, actualCurrSize);
        
        String actualCurrName = ((String) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currName"));
        assertNull(actualCurrName);
        
        long expectedCurrBytes = ((Long) getFieldValue(expected, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes"));
        long actualCurrBytes = ((Long) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes"));
        assertEquals(expectedCurrBytes, actualCurrBytes);
        
        byte[] expectedRecordBuf = ((byte[]) getFieldValue(expected, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf"));
        byte[] actualRecordBuf = ((byte[]) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf"));
        int expectedRecordBufSize = expectedRecordBuf.length;
        assertEquals(expectedRecordBufSize, actualRecordBuf.length);
        assertArrayEquals(expectedRecordBuf, actualRecordBuf);
        
        int expectedAssemLen = ((Integer) getFieldValue(expected, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen"));
        int actualAssemLen = ((Integer) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen"));
        assertEquals(expectedAssemLen, actualAssemLen);
        
        byte[] expectedAssemBuf = ((byte[]) getFieldValue(expected, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf"));
        byte[] actualAssemBuf = ((byte[]) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf"));
        int expectedAssemBufSize = expectedAssemBuf.length;
        assertEquals(expectedAssemBufSize, actualAssemBuf.length);
        assertArrayEquals(expectedAssemBuf, actualAssemBuf);
        
        Object expectedBuffer = getFieldValue(expected, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer");
        Object actualBuffer = getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer");
        InputStream actualBufferInStream = ((InputStream) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream"));
        assertNull(actualBufferInStream);
        
        OutputStream expectedBufferOutStream = ((OutputStream) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream"));
        OutputStream actualBufferOutStream = ((OutputStream) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream"));
        long expectedBufferOutStreamBytesWritten = (((CountingOutputStream) expectedBufferOutStream)).getBytesWritten();
        long actualBufferOutStreamBytesWritten = (((CountingOutputStream) actualBufferOutStream)).getBytesWritten();
        assertEquals(expectedBufferOutStreamBytesWritten, actualBufferOutStreamBytesWritten);
        
        OutputStream expectedBufferOutStreamOut = ((OutputStream) getFieldValue(expectedBufferOutStream, "java.io.FilterOutputStream", "out"));
        OutputStream actualBufferOutStreamOut = ((OutputStream) getFieldValue(actualBufferOutStream, "java.io.FilterOutputStream", "out"));
        boolean actualBufferOutStreamOutFinished = ((Boolean) getFieldValue(actualBufferOutStreamOut, "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream", "finished"));
        assertFalse(actualBufferOutStreamOutFinished);
        
        OutputStream actualBufferOutStreamOutOriginalOutput = ((OutputStream) getFieldValue(actualBufferOutStreamOut, "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream", "originalOutput"));
        assertNull(actualBufferOutStreamOutOriginalOutput);
        
        Object actualBufferOutStreamOutStreamBridge = getFieldValue(actualBufferOutStreamOut, "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream", "streamBridge");
        assertNull(actualBufferOutStreamOutStreamBridge);
        
        Map actualBufferOutStreamOutProperties = ((Map) getFieldValue(actualBufferOutStreamOut, "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream", "properties"));
        assertNull(actualBufferOutStreamOutProperties);
        
        boolean actualBufferOutStreamClosed = ((Boolean) getFieldValue(actualBufferOutStream, "java.io.FilterOutputStream", "closed"));
        assertFalse(actualBufferOutStreamClosed);
        
        Object expectedBufferOutStreamCloseLock = getFieldValue(expectedBufferOutStream, "java.io.FilterOutputStream", "closeLock");
        Object actualBufferOutStreamCloseLock = getFieldValue(actualBufferOutStream, "java.io.FilterOutputStream", "closeLock");
        
        byte[] expectedBufferBlockBuffer = ((byte[]) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer"));
        byte[] actualBufferBlockBuffer = ((byte[]) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer"));
        int expectedBufferBlockBufferSize = expectedBufferBlockBuffer.length;
        assertEquals(expectedBufferBlockBufferSize, actualBufferBlockBuffer.length);
        assertArrayEquals(expectedBufferBlockBuffer, actualBufferBlockBuffer);
        
        int expectedBufferCurrBlkIdx = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currBlkIdx"));
        int actualBufferCurrBlkIdx = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currBlkIdx"));
        assertEquals(expectedBufferCurrBlkIdx, actualBufferCurrBlkIdx);
        
        int expectedBufferCurrRecIdx = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        int actualBufferCurrRecIdx = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        assertEquals(expectedBufferCurrRecIdx, actualBufferCurrRecIdx);
        
        int expectedBufferBlockSize = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize"));
        int actualBufferBlockSize = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize"));
        assertEquals(expectedBufferBlockSize, actualBufferBlockSize);
        
        int expectedBufferRecordSize = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize"));
        int actualBufferRecordSize = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize"));
        assertEquals(expectedBufferRecordSize, actualBufferRecordSize);
        
        int expectedBufferRecsPerBlock = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock"));
        int actualBufferRecsPerBlock = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock"));
        assertEquals(expectedBufferRecsPerBlock, actualBufferRecsPerBlock);
        
        int expectedLongFileMode = ((Integer) getFieldValue(expected, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "longFileMode"));
        int actualLongFileMode = ((Integer) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "longFileMode"));
        assertEquals(expectedLongFileMode, actualLongFileMode);
        
        int expectedBigFileMode = ((Integer) getFieldValue(expected, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "bigFileMode"));
        int actualBigFileMode = ((Integer) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "bigFileMode"));
        assertEquals(expectedBigFileMode, actualBigFileMode);
        
        boolean actualClosed = ((Boolean) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closed"));
        assertFalse(actualClosed);
        
        boolean actualHaveUnclosedEntry = ((Boolean) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry"));
        assertFalse(actualHaveUnclosedEntry);
        
        boolean actualFinished = ((Boolean) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished"));
        assertFalse(actualFinished);
        
        OutputStream expectedOut = ((OutputStream) getFieldValue(expected, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out"));
        OutputStream actualOut = ((OutputStream) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out"));
        assertTrue(deepEquals(expectedOut, actualOut));
        assertTrue(deepEquals(expectedOut, actualOut));
        assertTrue(deepEquals(expectedOut, actualOut));
        assertTrue(deepEquals(expectedOut, actualOut));
        
        byte[] expectedOneByte = ((byte[]) getFieldValue(expected, "org.apache.commons.compress.archivers.ArchiveOutputStream", "oneByte"));
        byte[] actualOneByte = ((byte[]) getFieldValue(actual, "org.apache.commons.compress.archivers.ArchiveOutputStream", "oneByte"));
        int expectedOneByteSize = expectedOneByte.length;
        assertEquals(expectedOneByteSize, actualOneByte.length);
        assertArrayEquals(expectedOneByte, actualOneByte);
        
        long expectedBytesWritten = expected.getBytesWritten();
        long actualBytesWritten = actual.getBytesWritten();
        assertEquals(expectedBytesWritten, actualBytesWritten);
        
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method createArchiveOutputStream(java.lang.String, java.io.OutputStream)
    
    @Test(expected = ArchiveException.class)
    public void testCreateArchiveOutputStream2() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        String string = "A\u0000";
        Pack200CompressorOutputStream pack200CompressorOutputStream = ((Pack200CompressorOutputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream"));
        
        archiveStreamFactory.createArchiveOutputStream(string, pack200CompressorOutputStream);
    }
    ///endregion
    
    ///region Errors report for createArchiveOutputStream
    
    public void testCreateArchiveOutputStream_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createArchiveInputStream(java.lang.String, java.io.InputStream)
    
    /**
    @utbot.classUnderTest {@link ArchiveStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ArchiveStreamFactory#createArchiveInputStream(java.lang.String,java.io.InputStream)}
 * @utbot.executesCondition {@code (archiverName == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: archiverName == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStream_ThrowIllegalArgumentException() throws ArchiveException  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        
        archiveStreamFactory.createArchiveInputStream(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ArchiveStreamFactory#createArchiveInputStream(java.lang.String,java.io.InputStream)}
 * @utbot.executesCondition {@code (archiverName == null): False}
 * @utbot.executesCondition {@code (in == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: in == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStream_ThrowIllegalArgumentException_1() throws ArchiveException  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        String string = "";
        
        archiveStreamFactory.createArchiveInputStream(string, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createArchiveInputStream(java.lang.String, java.io.InputStream)
    
    @Test
    public void testCreateArchiveInputStream1() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        String string = "Tar";
        GzipCompressorInputStream gzipCompressorInputStream = ((GzipCompressorInputStream) createInstance("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        
        TarArchiveInputStream actual = ((TarArchiveInputStream) archiveStreamFactory.createArchiveInputStream(string, gzipCompressorInputStream));
        
        TarArchiveInputStream expected = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(expected, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 0L);
        setField(expected, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", 0L);
        Object buffer = createInstance("org.apache.commons.compress.archivers.tar.TarBuffer");
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", gzipCompressorInputStream);
        byte[] blockBuffer = new byte[10240];
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currBlkIdx", -1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 20);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 10240);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 512);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 20);
        setField(expected, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        byte[] single = {(byte) 0};
        setField(expected, "org.apache.commons.compress.archivers.ArchiveInputStream", "SINGLE", single);
        setField(expected, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        boolean actualHasHitEOF = ((Boolean) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        assertFalse(actualHasHitEOF);
        
        long expectedEntrySize = ((Long) getFieldValue(expected, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize"));
        long actualEntrySize = ((Long) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize"));
        assertEquals(expectedEntrySize, actualEntrySize);
        
        long expectedEntryOffset = ((Long) getFieldValue(expected, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset"));
        long actualEntryOffset = ((Long) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset"));
        assertEquals(expectedEntryOffset, actualEntryOffset);
        
        byte[] actualReadBuf = ((byte[]) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readBuf"));
        assertNull(actualReadBuf);
        
        Object expectedBuffer = getFieldValue(expected, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer");
        Object actualBuffer = getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer");
        InputStream expectedBufferInStream = ((InputStream) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream"));
        InputStream actualBufferInStream = ((InputStream) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream"));
        InputStream actualBufferInStreamIn = ((InputStream) getFieldValue(actualBufferInStream, "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream", "in"));
        assertNull(actualBufferInStreamIn);
        
        boolean actualBufferInStreamDecompressConcatenated = ((Boolean) getFieldValue(actualBufferInStream, "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream", "decompressConcatenated"));
        assertFalse(actualBufferInStreamDecompressConcatenated);
        
        byte[] actualBufferInStreamBuf = ((byte[]) getFieldValue(actualBufferInStream, "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream", "buf"));
        assertNull(actualBufferInStreamBuf);
        
        int expectedBufferInStreamBufUsed = ((Integer) getFieldValue(expectedBufferInStream, "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream", "bufUsed"));
        int actualBufferInStreamBufUsed = ((Integer) getFieldValue(actualBufferInStream, "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream", "bufUsed"));
        assertEquals(expectedBufferInStreamBufUsed, actualBufferInStreamBufUsed);
        
        Inflater actualBufferInStreamInf = ((Inflater) getFieldValue(actualBufferInStream, "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream", "inf"));
        assertNull(actualBufferInStreamInf);
        
        CRC32 actualBufferInStreamCrc = ((CRC32) getFieldValue(actualBufferInStream, "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream", "crc"));
        assertNull(actualBufferInStreamCrc);
        
        int expectedBufferInStreamMemberSize = ((Integer) getFieldValue(expectedBufferInStream, "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream", "memberSize"));
        int actualBufferInStreamMemberSize = ((Integer) getFieldValue(actualBufferInStream, "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream", "memberSize"));
        assertEquals(expectedBufferInStreamMemberSize, actualBufferInStreamMemberSize);
        
        boolean actualBufferInStreamEndReached = ((Boolean) getFieldValue(actualBufferInStream, "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream", "endReached"));
        assertFalse(actualBufferInStreamEndReached);
        
        long expectedBufferInStreamBytesRead = (((CompressorInputStream) expectedBufferInStream)).getBytesRead();
        long actualBufferInStreamBytesRead = (((CompressorInputStream) actualBufferInStream)).getBytesRead();
        assertEquals(expectedBufferInStreamBytesRead, actualBufferInStreamBytesRead);
        
        OutputStream actualBufferOutStream = ((OutputStream) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream"));
        assertNull(actualBufferOutStream);
        
        byte[] expectedBufferBlockBuffer = ((byte[]) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer"));
        byte[] actualBufferBlockBuffer = ((byte[]) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer"));
        int expectedBufferBlockBufferSize = expectedBufferBlockBuffer.length;
        assertEquals(expectedBufferBlockBufferSize, actualBufferBlockBuffer.length);
        assertArrayEquals(expectedBufferBlockBuffer, actualBufferBlockBuffer);
        
        int expectedBufferCurrBlkIdx = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currBlkIdx"));
        int actualBufferCurrBlkIdx = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currBlkIdx"));
        assertEquals(expectedBufferCurrBlkIdx, actualBufferCurrBlkIdx);
        
        int expectedBufferCurrRecIdx = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        int actualBufferCurrRecIdx = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        assertEquals(expectedBufferCurrRecIdx, actualBufferCurrRecIdx);
        
        int expectedBufferBlockSize = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize"));
        int actualBufferBlockSize = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize"));
        assertEquals(expectedBufferBlockSize, actualBufferBlockSize);
        
        int expectedBufferRecordSize = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize"));
        int actualBufferRecordSize = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize"));
        assertEquals(expectedBufferRecordSize, actualBufferRecordSize);
        
        int expectedBufferRecsPerBlock = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock"));
        int actualBufferRecsPerBlock = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock"));
        assertEquals(expectedBufferRecsPerBlock, actualBufferRecsPerBlock);
        
        TarArchiveEntry actualCurrEntry = ((TarArchiveEntry) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry"));
        assertNull(actualCurrEntry);
        
        byte[] expectedSINGLE = ((byte[]) getFieldValue(expected, "org.apache.commons.compress.archivers.ArchiveInputStream", "SINGLE"));
        byte[] actualSINGLE = ((byte[]) getFieldValue(actual, "org.apache.commons.compress.archivers.ArchiveInputStream", "SINGLE"));
        int expectedSINGLESize = expectedSINGLE.length;
        assertEquals(expectedSINGLESize, actualSINGLE.length);
        assertArrayEquals(expectedSINGLE, actualSINGLE);
        
        long expectedBytesRead = expected.getBytesRead();
        long actualBytesRead = actual.getBytesRead();
        assertEquals(expectedBytesRead, actualBytesRead);
        
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method createArchiveInputStream(java.lang.String, java.io.InputStream)
    
    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStream2() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        String string = "\u0000\u0000";
        GzipCompressorInputStream gzipCompressorInputStream = ((GzipCompressorInputStream) createInstance("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        
        archiveStreamFactory.createArchiveInputStream(string, gzipCompressorInputStream);
    }
    ///endregion
    
    ///region Errors report for createArchiveInputStream
    
    public void testCreateArchiveInputStream_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createArchiveInputStream(java.io.InputStream)
    
    /**
    @utbot.classUnderTest {@link ArchiveStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ArchiveStreamFactory#createArchiveInputStream(java.io.InputStream)}
 * @utbot.executesCondition {@code (in == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: in == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStream_ThrowIllegalArgumentException1() throws ArchiveException  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        
        archiveStreamFactory.createArchiveInputStream(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createArchiveInputStream(java.io.InputStream)
    
    @Test
    public void testCreateArchiveInputStream3() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        ByteArrayInputStream byteArrayInputStream = ((ByteArrayInputStream) createInstance("java.io.ByteArrayInputStream"));
        
        TarArchiveInputStream actual = ((TarArchiveInputStream) archiveStreamFactory.createArchiveInputStream(byteArrayInputStream));
        
        TarArchiveInputStream expected = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(expected, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 0L);
        setField(expected, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", 0L);
        Object buffer = createInstance("org.apache.commons.compress.archivers.tar.TarBuffer");
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", byteArrayInputStream);
        byte[] blockBuffer = new byte[10240];
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currBlkIdx", -1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 20);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 10240);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 512);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 20);
        setField(expected, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        byte[] single = {(byte) 0};
        setField(expected, "org.apache.commons.compress.archivers.ArchiveInputStream", "SINGLE", single);
        setField(expected, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        boolean actualHasHitEOF = ((Boolean) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        assertFalse(actualHasHitEOF);
        
        long expectedEntrySize = ((Long) getFieldValue(expected, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize"));
        long actualEntrySize = ((Long) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize"));
        assertEquals(expectedEntrySize, actualEntrySize);
        
        long expectedEntryOffset = ((Long) getFieldValue(expected, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset"));
        long actualEntryOffset = ((Long) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset"));
        assertEquals(expectedEntryOffset, actualEntryOffset);
        
        byte[] actualReadBuf = ((byte[]) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readBuf"));
        assertNull(actualReadBuf);
        
        Object expectedBuffer = getFieldValue(expected, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer");
        Object actualBuffer = getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer");
        InputStream expectedBufferInStream = ((InputStream) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream"));
        InputStream actualBufferInStream = ((InputStream) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream"));
        byte[] actualBufferInStreamBuf = ((byte[]) getFieldValue(actualBufferInStream, "java.io.ByteArrayInputStream", "buf"));
        assertNull(actualBufferInStreamBuf);
        
        int expectedBufferInStreamPos = ((Integer) getFieldValue(expectedBufferInStream, "java.io.ByteArrayInputStream", "pos"));
        int actualBufferInStreamPos = ((Integer) getFieldValue(actualBufferInStream, "java.io.ByteArrayInputStream", "pos"));
        assertEquals(expectedBufferInStreamPos, actualBufferInStreamPos);
        
        int expectedBufferInStreamMark = ((Integer) getFieldValue(expectedBufferInStream, "java.io.ByteArrayInputStream", "mark"));
        int actualBufferInStreamMark = ((Integer) getFieldValue(actualBufferInStream, "java.io.ByteArrayInputStream", "mark"));
        assertEquals(expectedBufferInStreamMark, actualBufferInStreamMark);
        
        int expectedBufferInStreamCount = ((Integer) getFieldValue(expectedBufferInStream, "java.io.ByteArrayInputStream", "count"));
        int actualBufferInStreamCount = ((Integer) getFieldValue(actualBufferInStream, "java.io.ByteArrayInputStream", "count"));
        assertEquals(expectedBufferInStreamCount, actualBufferInStreamCount);
        
        OutputStream actualBufferOutStream = ((OutputStream) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream"));
        assertNull(actualBufferOutStream);
        
        byte[] expectedBufferBlockBuffer = ((byte[]) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer"));
        byte[] actualBufferBlockBuffer = ((byte[]) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer"));
        int expectedBufferBlockBufferSize = expectedBufferBlockBuffer.length;
        assertEquals(expectedBufferBlockBufferSize, actualBufferBlockBuffer.length);
        assertArrayEquals(expectedBufferBlockBuffer, actualBufferBlockBuffer);
        
        int expectedBufferCurrBlkIdx = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currBlkIdx"));
        int actualBufferCurrBlkIdx = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currBlkIdx"));
        assertEquals(expectedBufferCurrBlkIdx, actualBufferCurrBlkIdx);
        
        int expectedBufferCurrRecIdx = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        int actualBufferCurrRecIdx = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        assertEquals(expectedBufferCurrRecIdx, actualBufferCurrRecIdx);
        
        int expectedBufferBlockSize = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize"));
        int actualBufferBlockSize = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize"));
        assertEquals(expectedBufferBlockSize, actualBufferBlockSize);
        
        int expectedBufferRecordSize = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize"));
        int actualBufferRecordSize = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize"));
        assertEquals(expectedBufferRecordSize, actualBufferRecordSize);
        
        int expectedBufferRecsPerBlock = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock"));
        int actualBufferRecsPerBlock = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock"));
        assertEquals(expectedBufferRecsPerBlock, actualBufferRecsPerBlock);
        
        TarArchiveEntry actualCurrEntry = ((TarArchiveEntry) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry"));
        assertNull(actualCurrEntry);
        
        byte[] expectedSINGLE = ((byte[]) getFieldValue(expected, "org.apache.commons.compress.archivers.ArchiveInputStream", "SINGLE"));
        byte[] actualSINGLE = ((byte[]) getFieldValue(actual, "org.apache.commons.compress.archivers.ArchiveInputStream", "SINGLE"));
        int expectedSINGLESize = expectedSINGLE.length;
        assertEquals(expectedSINGLESize, actualSINGLE.length);
        assertArrayEquals(expectedSINGLE, actualSINGLE);
        
        long expectedBytesRead = expected.getBytesRead();
        long actualBytesRead = actual.getBytesRead();
        assertEquals(expectedBytesRead, actualBytesRead);
        
    }
    
    @Test
    public void testCreateArchiveInputStream4() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        Object unclosableInputStream = createInstance("sun.security.provider.FileInputStreamPool$UnclosableInputStream");
        ByteArrayInputStream in = ((ByteArrayInputStream) createInstance("java.io.ByteArrayInputStream"));
        setField(unclosableInputStream, "java.io.FilterInputStream", "in", in);
        
        Class archiveStreamFactoryClazz = Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory");
        Class unclosableInputStreamType = Class.forName("java.io.InputStream");
        Method createArchiveInputStreamMethod = archiveStreamFactoryClazz.getDeclaredMethod("createArchiveInputStream", unclosableInputStreamType);
        createArchiveInputStreamMethod.setAccessible(true);
        java.lang.Object[] createArchiveInputStreamMethodArguments = new java.lang.Object[1];
        createArchiveInputStreamMethodArguments[0] = unclosableInputStream;
        TarArchiveInputStream actual = ((TarArchiveInputStream) createArchiveInputStreamMethod.invoke(archiveStreamFactory, createArchiveInputStreamMethodArguments));
        
        TarArchiveInputStream expected = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(expected, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 0L);
        setField(expected, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", 0L);
        Object buffer = createInstance("org.apache.commons.compress.archivers.tar.TarBuffer");
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", unclosableInputStream);
        byte[] blockBuffer = new byte[10240];
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currBlkIdx", -1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 20);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 10240);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 512);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 20);
        setField(expected, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        byte[] single = {(byte) 0};
        setField(expected, "org.apache.commons.compress.archivers.ArchiveInputStream", "SINGLE", single);
        setField(expected, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        boolean actualHasHitEOF = ((Boolean) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        assertFalse(actualHasHitEOF);
        
        long expectedEntrySize = ((Long) getFieldValue(expected, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize"));
        long actualEntrySize = ((Long) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize"));
        assertEquals(expectedEntrySize, actualEntrySize);
        
        long expectedEntryOffset = ((Long) getFieldValue(expected, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset"));
        long actualEntryOffset = ((Long) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset"));
        assertEquals(expectedEntryOffset, actualEntryOffset);
        
        byte[] actualReadBuf = ((byte[]) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readBuf"));
        assertNull(actualReadBuf);
        
        Object expectedBuffer = getFieldValue(expected, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer");
        Object actualBuffer = getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer");
        InputStream expectedBufferInStream = ((InputStream) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream"));
        InputStream actualBufferInStream = ((InputStream) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream"));
        InputStream expectedBufferInStreamIn = ((InputStream) getFieldValue(expectedBufferInStream, "java.io.FilterInputStream", "in"));
        InputStream actualBufferInStreamIn = ((InputStream) getFieldValue(actualBufferInStream, "java.io.FilterInputStream", "in"));
        byte[] actualBufferInStreamInBuf = ((byte[]) getFieldValue(actualBufferInStreamIn, "java.io.ByteArrayInputStream", "buf"));
        assertNull(actualBufferInStreamInBuf);
        
        int expectedBufferInStreamInPos = ((Integer) getFieldValue(expectedBufferInStreamIn, "java.io.ByteArrayInputStream", "pos"));
        int actualBufferInStreamInPos = ((Integer) getFieldValue(actualBufferInStreamIn, "java.io.ByteArrayInputStream", "pos"));
        assertEquals(expectedBufferInStreamInPos, actualBufferInStreamInPos);
        
        int expectedBufferInStreamInMark = ((Integer) getFieldValue(expectedBufferInStreamIn, "java.io.ByteArrayInputStream", "mark"));
        int actualBufferInStreamInMark = ((Integer) getFieldValue(actualBufferInStreamIn, "java.io.ByteArrayInputStream", "mark"));
        assertEquals(expectedBufferInStreamInMark, actualBufferInStreamInMark);
        
        int expectedBufferInStreamInCount = ((Integer) getFieldValue(expectedBufferInStreamIn, "java.io.ByteArrayInputStream", "count"));
        int actualBufferInStreamInCount = ((Integer) getFieldValue(actualBufferInStreamIn, "java.io.ByteArrayInputStream", "count"));
        assertEquals(expectedBufferInStreamInCount, actualBufferInStreamInCount);
        
        OutputStream actualBufferOutStream = ((OutputStream) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream"));
        assertNull(actualBufferOutStream);
        
        byte[] expectedBufferBlockBuffer = ((byte[]) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer"));
        byte[] actualBufferBlockBuffer = ((byte[]) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer"));
        int expectedBufferBlockBufferSize = expectedBufferBlockBuffer.length;
        assertEquals(expectedBufferBlockBufferSize, actualBufferBlockBuffer.length);
        assertArrayEquals(expectedBufferBlockBuffer, actualBufferBlockBuffer);
        
        int expectedBufferCurrBlkIdx = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currBlkIdx"));
        int actualBufferCurrBlkIdx = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currBlkIdx"));
        assertEquals(expectedBufferCurrBlkIdx, actualBufferCurrBlkIdx);
        
        int expectedBufferCurrRecIdx = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        int actualBufferCurrRecIdx = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        assertEquals(expectedBufferCurrRecIdx, actualBufferCurrRecIdx);
        
        int expectedBufferBlockSize = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize"));
        int actualBufferBlockSize = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize"));
        assertEquals(expectedBufferBlockSize, actualBufferBlockSize);
        
        int expectedBufferRecordSize = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize"));
        int actualBufferRecordSize = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize"));
        assertEquals(expectedBufferRecordSize, actualBufferRecordSize);
        
        int expectedBufferRecsPerBlock = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock"));
        int actualBufferRecsPerBlock = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock"));
        assertEquals(expectedBufferRecsPerBlock, actualBufferRecsPerBlock);
        
        TarArchiveEntry actualCurrEntry = ((TarArchiveEntry) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry"));
        assertNull(actualCurrEntry);
        
        byte[] expectedSINGLE = ((byte[]) getFieldValue(expected, "org.apache.commons.compress.archivers.ArchiveInputStream", "SINGLE"));
        byte[] actualSINGLE = ((byte[]) getFieldValue(actual, "org.apache.commons.compress.archivers.ArchiveInputStream", "SINGLE"));
        int expectedSINGLESize = expectedSINGLE.length;
        assertEquals(expectedSINGLESize, actualSINGLE.length);
        assertArrayEquals(expectedSINGLE, actualSINGLE);
        
        long expectedBytesRead = expected.getBytesRead();
        long actualBytesRead = actual.getBytesRead();
        assertEquals(expectedBytesRead, actualBytesRead);
        
    }
    
    @Test
    public void testCreateArchiveInputStream5() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        Object countingInputStream = createInstance("org.tukaani.xz.CountingInputStream");
        FilterInputStream in = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in1 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in2 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in3 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        ByteArrayInputStream in4 = ((ByteArrayInputStream) createInstance("java.io.ByteArrayInputStream"));
        setField(in3, "java.io.FilterInputStream", "in", in4);
        setField(in2, "java.io.FilterInputStream", "in", in3);
        setField(in1, "java.io.FilterInputStream", "in", in2);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(countingInputStream, "java.io.FilterInputStream", "in", in);
        
        Class archiveStreamFactoryClazz = Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory");
        Class countingInputStreamType = Class.forName("java.io.InputStream");
        Method createArchiveInputStreamMethod = archiveStreamFactoryClazz.getDeclaredMethod("createArchiveInputStream", countingInputStreamType);
        createArchiveInputStreamMethod.setAccessible(true);
        java.lang.Object[] createArchiveInputStreamMethodArguments = new java.lang.Object[1];
        createArchiveInputStreamMethodArguments[0] = countingInputStream;
        TarArchiveInputStream actual = ((TarArchiveInputStream) createArchiveInputStreamMethod.invoke(archiveStreamFactory, createArchiveInputStreamMethodArguments));
        
        TarArchiveInputStream expected = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(expected, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 0L);
        setField(expected, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", 0L);
        Object buffer = createInstance("org.apache.commons.compress.archivers.tar.TarBuffer");
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", countingInputStream);
        byte[] blockBuffer = new byte[10240];
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currBlkIdx", -1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 20);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 10240);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 512);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 20);
        setField(expected, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        byte[] single = {(byte) 0};
        setField(expected, "org.apache.commons.compress.archivers.ArchiveInputStream", "SINGLE", single);
        setField(expected, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        boolean actualHasHitEOF = ((Boolean) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        assertFalse(actualHasHitEOF);
        
        long expectedEntrySize = ((Long) getFieldValue(expected, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize"));
        long actualEntrySize = ((Long) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize"));
        assertEquals(expectedEntrySize, actualEntrySize);
        
        long expectedEntryOffset = ((Long) getFieldValue(expected, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset"));
        long actualEntryOffset = ((Long) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset"));
        assertEquals(expectedEntryOffset, actualEntryOffset);
        
        byte[] actualReadBuf = ((byte[]) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readBuf"));
        assertNull(actualReadBuf);
        
        Object expectedBuffer = getFieldValue(expected, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer");
        Object actualBuffer = getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer");
        InputStream expectedBufferInStream = ((InputStream) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream"));
        InputStream actualBufferInStream = ((InputStream) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream"));
        long expectedBufferInStreamSize = ((Long) getFieldValue(expectedBufferInStream, "org.tukaani.xz.CountingInputStream", "size"));
        long actualBufferInStreamSize = ((Long) getFieldValue(actualBufferInStream, "org.tukaani.xz.CountingInputStream", "size"));
        assertEquals(expectedBufferInStreamSize, actualBufferInStreamSize);
        
        InputStream expectedBufferInStreamIn = ((InputStream) getFieldValue(expectedBufferInStream, "java.io.FilterInputStream", "in"));
        InputStream actualBufferInStreamIn = ((InputStream) getFieldValue(actualBufferInStream, "java.io.FilterInputStream", "in"));
        InputStream expectedBufferInStreamInIn = ((InputStream) getFieldValue(expectedBufferInStreamIn, "java.io.FilterInputStream", "in"));
        InputStream actualBufferInStreamInIn = ((InputStream) getFieldValue(actualBufferInStreamIn, "java.io.FilterInputStream", "in"));
        InputStream expectedBufferInStreamInInIn = ((InputStream) getFieldValue(expectedBufferInStreamInIn, "java.io.FilterInputStream", "in"));
        InputStream actualBufferInStreamInInIn = ((InputStream) getFieldValue(actualBufferInStreamInIn, "java.io.FilterInputStream", "in"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedBufferInStreamInInIn, actualBufferInStreamInInIn));
        
        OutputStream actualBufferOutStream = ((OutputStream) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream"));
        assertNull(actualBufferOutStream);
        
        byte[] expectedBufferBlockBuffer = ((byte[]) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer"));
        byte[] actualBufferBlockBuffer = ((byte[]) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer"));
        int expectedBufferBlockBufferSize = expectedBufferBlockBuffer.length;
        assertEquals(expectedBufferBlockBufferSize, actualBufferBlockBuffer.length);
        assertArrayEquals(expectedBufferBlockBuffer, actualBufferBlockBuffer);
        
        int expectedBufferCurrBlkIdx = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currBlkIdx"));
        int actualBufferCurrBlkIdx = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currBlkIdx"));
        assertEquals(expectedBufferCurrBlkIdx, actualBufferCurrBlkIdx);
        
        int expectedBufferCurrRecIdx = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        int actualBufferCurrRecIdx = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        assertEquals(expectedBufferCurrRecIdx, actualBufferCurrRecIdx);
        
        int expectedBufferBlockSize = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize"));
        int actualBufferBlockSize = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize"));
        assertEquals(expectedBufferBlockSize, actualBufferBlockSize);
        
        int expectedBufferRecordSize = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize"));
        int actualBufferRecordSize = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize"));
        assertEquals(expectedBufferRecordSize, actualBufferRecordSize);
        
        int expectedBufferRecsPerBlock = ((Integer) getFieldValue(expectedBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock"));
        int actualBufferRecsPerBlock = ((Integer) getFieldValue(actualBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock"));
        assertEquals(expectedBufferRecsPerBlock, actualBufferRecsPerBlock);
        
        TarArchiveEntry actualCurrEntry = ((TarArchiveEntry) getFieldValue(actual, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry"));
        assertNull(actualCurrEntry);
        
        byte[] expectedSINGLE = ((byte[]) getFieldValue(expected, "org.apache.commons.compress.archivers.ArchiveInputStream", "SINGLE"));
        byte[] actualSINGLE = ((byte[]) getFieldValue(actual, "org.apache.commons.compress.archivers.ArchiveInputStream", "SINGLE"));
        int expectedSINGLESize = expectedSINGLE.length;
        assertEquals(expectedSINGLESize, actualSINGLE.length);
        assertArrayEquals(expectedSINGLE, actualSINGLE);
        
        long expectedBytesRead = expected.getBytesRead();
        long actualBytesRead = actual.getBytesRead();
        assertEquals(expectedBytesRead, actualBytesRead);
        
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createArchiveInputStream(java.io.InputStream)
    
    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStream6() throws Throwable  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        Object extObjectInputStream = createInstance("javax.crypto.extObjectInputStream");
        
        Class archiveStreamFactoryClazz = Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory");
        Class extObjectInputStreamType = Class.forName("java.io.InputStream");
        Method createArchiveInputStreamMethod = archiveStreamFactoryClazz.getDeclaredMethod("createArchiveInputStream", extObjectInputStreamType);
        createArchiveInputStreamMethod.setAccessible(true);
        java.lang.Object[] createArchiveInputStreamMethodArguments = new java.lang.Object[1];
        createArchiveInputStreamMethodArguments[0] = extObjectInputStream;
        try {
            createArchiveInputStreamMethod.invoke(archiveStreamFactory, createArchiveInputStreamMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method createArchiveInputStream(java.io.InputStream)
    
    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStream7() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        BufferedInputStream bufferedInputStream = ((BufferedInputStream) createInstance("java.io.BufferedInputStream"));
        
        archiveStreamFactory.createArchiveInputStream(bufferedInputStream);
    }
    
    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStream8() throws Throwable  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        Object countingInputStream = createInstance("org.tukaani.xz.CountingInputStream");
        FilterInputStream in = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in1 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in2 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in3 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        BufferedInputStream in4 = ((BufferedInputStream) createInstance("java.io.BufferedInputStream"));
        setField(in3, "java.io.FilterInputStream", "in", in4);
        setField(in2, "java.io.FilterInputStream", "in", in3);
        setField(in1, "java.io.FilterInputStream", "in", in2);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(countingInputStream, "java.io.FilterInputStream", "in", in);
        
        Class archiveStreamFactoryClazz = Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory");
        Class countingInputStreamType = Class.forName("java.io.InputStream");
        Method createArchiveInputStreamMethod = archiveStreamFactoryClazz.getDeclaredMethod("createArchiveInputStream", countingInputStreamType);
        createArchiveInputStreamMethod.setAccessible(true);
        java.lang.Object[] createArchiveInputStreamMethodArguments = new java.lang.Object[1];
        createArchiveInputStreamMethodArguments[0] = countingInputStream;
        try {
            createArchiveInputStreamMethod.invoke(archiveStreamFactory, createArchiveInputStreamMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createArchiveInputStream(java.io.InputStream)
    
    @Test(expected = StackOverflowError.class)
    public void testCreateArchiveInputStream9() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        FilterInputStream filterInputStream = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        setField(filterInputStream, "java.io.FilterInputStream", "in", filterInputStream);
        DataInputStream dataInputStream = new DataInputStream(filterInputStream);
        
        archiveStreamFactory.createArchiveInputStream(dataInputStream);
    }
    
    @Test
    public void testCreateArchiveInputStream10() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        FilterInputStream anonymousFilterInputStream = ((FilterInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream$1"));
        FilterInputStream in = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        DataInputStream in1 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        Object in2 = createInstance("sun.security.provider.FileInputStreamPool$UnclosableInputStream");
        FilterInputStream in3 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        DataInputStream in4 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        FilterInputStream in5 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        Object in6 = createInstance("sun.net.www.protocol.http.HttpURLConnection$HttpInputStream");
        Object in7 = createInstance("java.util.jar.Manifest$FastInputStream");
        Object in8 = createInstance("java.util.jar.Manifest$FastInputStream");
        FilterInputStream in9 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in10 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in11 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in12 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in13 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        DataInputStream in14 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        FilterInputStream in15 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in16 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in17 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in18 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in19 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in20 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        BufferedInputStream in21 = ((BufferedInputStream) createInstance("java.io.BufferedInputStream"));
        setField(in20, "java.io.FilterInputStream", "in", in21);
        setField(in19, "java.io.FilterInputStream", "in", in20);
        setField(in18, "java.io.FilterInputStream", "in", in19);
        setField(in17, "java.io.FilterInputStream", "in", in18);
        setField(in16, "java.io.FilterInputStream", "in", in17);
        setField(in15, "java.io.FilterInputStream", "in", in16);
        setField(in14, "java.io.FilterInputStream", "in", in15);
        setField(in13, "java.io.FilterInputStream", "in", in14);
        setField(in12, "java.io.FilterInputStream", "in", in13);
        setField(in11, "java.io.FilterInputStream", "in", in12);
        setField(in10, "java.io.FilterInputStream", "in", in11);
        setField(in9, "java.io.FilterInputStream", "in", in10);
        setField(in8, "java.io.FilterInputStream", "in", in9);
        setField(in7, "java.io.FilterInputStream", "in", in8);
        setField(in6, "java.io.FilterInputStream", "in", in7);
        setField(in5, "java.io.FilterInputStream", "in", in6);
        setField(in4, "java.io.FilterInputStream", "in", in5);
        setField(in3, "java.io.FilterInputStream", "in", in4);
        setField(in2, "java.io.FilterInputStream", "in", in3);
        setField(in1, "java.io.FilterInputStream", "in", in2);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(anonymousFilterInputStream, "java.io.FilterInputStream", "in", in);
        
        /* This test fails because method [org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream] produces [java.lang.NullPointerException]
            java.base/java.util.jar.Manifest$FastInputStream.read(Manifest.java:436)
            java.base/java.io.FilterInputStream.read(FilterInputStream.java:132)
            java.base/sun.net.www.protocol.http.HttpURLConnection$HttpInputStream.read(HttpURLConnection.java:3716)
            java.base/java.io.FilterInputStream.read(FilterInputStream.java:132)
            java.base/java.io.DataInputStream.read(DataInputStream.java:151)
            java.base/java.io.FilterInputStream.read(FilterInputStream.java:132)
            java.base/java.io.FilterInputStream.read(FilterInputStream.java:132)
            java.base/java.io.DataInputStream.read(DataInputStream.java:151)
            java.base/java.io.FilterInputStream.read(FilterInputStream.java:132)
            java.base/java.io.FilterInputStream.read(FilterInputStream.java:132)
            java.base/java.io.FilterInputStream.read(FilterInputStream.java:106)
            org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream(ArchiveStreamFactory.java:210) */
        archiveStreamFactory.createArchiveInputStream(anonymousFilterInputStream);
    }
    ///endregion
    
    ///region Errors report for createArchiveInputStream
    
    public void testCreateArchiveInputStream_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 109 occurrences of:
        // Concrete execution failed
        
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields970052503388900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields970052503388900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass970052503394200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields970052503388900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass970052503394200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields970052503820400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields970052503820400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass970052503821600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields970052503820400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass970052503821600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return java.util.Objects.equals(o1, that.o1) && java.util.Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return java.util.Objects.hash(o1, o2);
        }
    }
    
    private static boolean deepEquals(Object o1, Object o2) {
        return deepEquals(o1, o2, new java.util.HashSet<>());
    }
    
    private static boolean deepEquals(Object o1, Object o2, java.util.Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
        
        if (o1 instanceof java.util.stream.BaseStream) {
            if (!(o2 instanceof java.util.stream.BaseStream)) {
                return false;
            }
    
            return streamsDeepEquals((java.util.stream.BaseStream<?, ?>) o1, (java.util.stream.BaseStream<?, ?>) o2, visited);
        }
    
        if (o2 instanceof java.util.stream.BaseStream) {
            return false;
        }
    
        if (o1 instanceof java.util.Map) {
            if (!(o2 instanceof java.util.Map)) {
                return false;
            }
    
            return mapsDeepEquals((java.util.Map<?, ?>) o1, (java.util.Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof java.util.Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // check if class has custom equals method (including wrappers and strings)
        // It is very important to check it here but not earlier because iterables and maps also have custom equals 
        // based on elements equals 
        if (hasCustomEquals(firstClass)) {
            return o1.equals(o2);
        }
    
        // common classes without custom equals, use comparison by fields
        final java.util.List<java.lang.reflect.Field> fields = new java.util.ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(java.util.Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean arraysDeepEquals(Object arr1, Object arr2, java.util.Set<FieldsPair> visited) {
        final int length = java.lang.reflect.Array.getLength(arr1);
        if (length != java.lang.reflect.Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(java.lang.reflect.Array.get(arr1, i), java.lang.reflect.Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, java.util.Set<FieldsPair> visited) {
        final java.util.Iterator<?> firstIterator = i1.iterator();
        final java.util.Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean streamsDeepEquals(
        java.util.stream.BaseStream<?, ?> s1, 
        java.util.stream.BaseStream<?, ?> s2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<?> firstIterator = s1.iterator();
        final java.util.Iterator<?> secondIterator = s2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean mapsDeepEquals(
        java.util.Map<?, ?> m1, 
        java.util.Map<?, ?> m2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final java.util.Map.Entry<?, ?> firstEntry = firstIterator.next();
            final java.util.Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}


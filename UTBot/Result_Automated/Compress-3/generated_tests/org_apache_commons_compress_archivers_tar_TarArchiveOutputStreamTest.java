package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import java.io.ByteArrayOutputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.io.ObjectOutputStream;
import java.util.zip.CRC32;
import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import org.junit.Ignore;
import java.lang.reflect.Method;
import org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_compress_archivers_tar_TarArchiveOutputStreamTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.flush
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method flush()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#flush()}
 * @utbot.invokes {@link java.io.OutputStream#flush()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.flush();
 *  */
    @Test
    public void testFlush_ThrowNullPointerException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.flush] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.flush(TarArchiveOutputStream.java:312) */
        tarArchiveOutputStream.flush();
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method flush()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#flush()}
     */
    @Test(timeout = 1000L)
    public void testFlush() throws IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        TarArchiveOutputStream tarArchiveOutputStream = new TarArchiveOutputStream(filterOutputStream);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tarArchiveOutputStream.flush();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method flush()
    
    @Test
    public void testFlush1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.flush();
    }
    
    @Test
    public void testFlush2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        ZipArchiveOutputStream out = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.flush();
    }
    ///endregion
    
    ///region Errors report for flush
    
    public void testFlush_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 51 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 *  */
    @Test
    public void testWrite_AssemLenLessOrEqualZero() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -255L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -255L);
        
        tarArchiveOutputStream.write(null, -255, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.iterates iterate the loop {@code while(numToWrite > 0)} once
 *  */
    @Test
    public void testWrite_NumToWriteLessThanRecordBufLength() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -253L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -254L);
        byte[] recordBuf = {(byte) 0, (byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        byte[] assemBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        byte[] byteArray = {(byte) -127};
        
        tarArchiveOutputStream.write(byteArray, 0, 1);
        
        int finalTarArchiveOutputStreamAssemLen = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen"));
        byte[] tarArchiveOutputStreamAssemBuf = ((byte[]) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf"));
        byte finalTarArchiveOutputStreamAssemBuf0 = ((Byte) get(tarArchiveOutputStreamAssemBuf, 0));
        
        assertEquals(1, finalTarArchiveOutputStreamAssemLen);
        
        assertEquals((byte) -127, finalTarArchiveOutputStreamAssemBuf0);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code ((assemLen + numToWrite) >= recordBuf.length): False}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 *  */
    @Test
    public void testWrite_AssemLenPlusNumToWriteLessThanRecordBufLength() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -255L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -255L);
        byte[] recordBuf = {(byte) -127, (byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.iterates iterate the loop {@code while(numToWrite > 0)} once
 *  */
    @Test
    public void testWrite_NumToWriteGreaterOrEqualRecordBufLength() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -187L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -188L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ByteArrayOutputStream outStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {(byte) 1};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -223);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -222);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 0, 1);
        
        long finalTarArchiveOutputStreamCurrBytes = ((Long) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes"));
        TarBuffer tarBuffer = tarArchiveOutputStream.buffer;
        int finalTarArchiveOutputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        
        assertEquals(-187L, finalTarArchiveOutputStreamCurrBytes);
        
        assertEquals(-222, finalTarArchiveOutputStreamBufferCurrRecIdx);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code ((currBytes + numToWrite) > currSize): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.io.IOException} when: (currBytes + numToWrite) > currSize
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", 0L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -127L);
        
        tarArchiveOutputStream.write(null, -255, 130);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code ((currBytes + numToWrite) > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.iterates iterate the loop {@code while(numToWrite > 0)} once
 * @utbot.throwsException {@link java.io.IOException} in: buffer.writeRecord(wBuf, wOffset);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -189L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -190L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        BZip2CompressorOutputStream outStream = ((BZip2CompressorOutputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -128);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 129, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code ((currBytes + numToWrite) > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code ((assemLen + numToWrite) >= recordBuf.length): True}
 * @utbot.throwsException {@link java.io.IOException} in: buffer.writeRecord(recordBuf);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_7() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -255L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -255L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        BZip2CompressorOutputStream outStream = ((BZip2CompressorOutputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -2);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code ((currBytes + numToWrite) > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code ((assemLen + numToWrite) >= recordBuf.length): True}
 * @utbot.throwsException {@link java.io.IOException} in: buffer.writeRecord(recordBuf);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_6() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -255L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -255L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        TarArchiveInputStream inStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code ((currBytes + numToWrite) > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code ((assemLen + numToWrite) >= recordBuf.length): True}
 * @utbot.throwsException {@link java.io.IOException} in: buffer.writeRecord(recordBuf);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_8() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -255L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -255L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code ((currBytes + numToWrite) > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.iterates iterate the loop {@code while(numToWrite > 0)} once
 * @utbot.throwsException {@link java.io.IOException} in: buffer.writeRecord(wBuf, wOffset);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -253L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -254L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.write(null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code ((currBytes + numToWrite) > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.iterates iterate the loop {@code while(numToWrite > 0)} once
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -131L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -132L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GZIPOutputStream outStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -128);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        byte[] byteArray = {(byte) -127};
        
        tarArchiveOutputStream.write(byteArray, 129, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code ((currBytes + numToWrite) > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.iterates iterate the loop {@code while(numToWrite > 0)} once
 * @utbot.throwsException {@link java.io.IOException} in: buffer.writeRecord(wBuf, wOffset);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -131L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -132L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        DeflaterOutputStream outStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -128);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        byte[] byteArray = {(byte) -127};
        
        tarArchiveOutputStream.write(byteArray, 129, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code ((currBytes + numToWrite) > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code ((assemLen + numToWrite) >= recordBuf.length): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_5() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -254L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -254L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GZIPOutputStream outStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 2785280);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 2785280);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 0, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code ((assemLen + numToWrite) >= recordBuf.length): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(wBuf, wOffset, assemBuf, assemLen, numToWrite);
 *  */
    @Test
    public void testWrite_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -255L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -254L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:264) */
        tarArchiveOutputStream.write(byteArray, -1, -1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.iterates iterate the loop {@code while(numToWrite > 0)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(wBuf, wOffset, assemBuf, assemLen, numToWrite);
 *  */
    @Test
    public void testWrite_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -173L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -174L);
        byte[] recordBuf = {(byte) 0, (byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        byte[] assemBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:280) */
        tarArchiveOutputStream.write(byteArray, -1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code ((assemLen + numToWrite) >= recordBuf.length): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(assemBuf, 0, recordBuf, 0, assemLen);
 *  */
    @Test
    public void testWrite_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -255L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -254L);
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:253) */
        tarArchiveOutputStream.write(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.iterates iterate the loop {@code while(numToWrite > 0)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer.writeRecord(wBuf, wOffset);
 *  */
    @Test
    public void testWrite_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -189L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -190L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ObjectOutputStream outStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", recordBuf);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(TarBuffer.java:356)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:288) */
        tarArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.iterates iterate the loop {@code while(numToWrite > 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: numToWrite < recordBuf.length
 *  */
    @Test
    public void testWrite_ThrowNullPointerException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -253L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -254L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:279) */
        tarArchiveOutputStream.write(null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (assemLen + numToWrite) >= recordBuf.length
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -255L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -192L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:250) */
        tarArchiveOutputStream.write(null, -255, -63);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code ((assemLen + numToWrite) >= recordBuf.length): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(wBuf, wOffset, assemBuf, assemLen, numToWrite);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -255L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -254L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:264) */
        tarArchiveOutputStream.write(byteArray, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.iterates iterate the loop {@code while(numToWrite > 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(wBuf, wOffset, assemBuf, assemLen, numToWrite);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -253L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -254L);
        byte[] recordBuf = {(byte) 0, (byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:280) */
        tarArchiveOutputStream.write(byteArray, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code ((assemLen + numToWrite) >= recordBuf.length): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.writeRecord(recordBuf);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_6() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -255L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -255L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:257) */
        tarArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.iterates iterate the loop {@code while(numToWrite > 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.writeRecord(wBuf, wOffset);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -253L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -254L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:288) */
        tarArchiveOutputStream.write(null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code ((assemLen + numToWrite) >= recordBuf.length): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(assemBuf, 0, recordBuf, 0, assemLen);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_5() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -255L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -254L);
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:253) */
        tarArchiveOutputStream.write(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code ((assemLen + numToWrite) >= recordBuf.length): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarBuffer#writeRecord(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.writeRecord(recordBuf);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_7() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -255L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -255L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        FilterOutputStream outStream = ((FilterOutputStream) createInstance("java.io.FilterOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1073741823);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 1073741824);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(TarBuffer.java:321)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:257) */
        tarArchiveOutputStream.write(byteArray, 0, 0);
    }
    ///endregion
    
    ///region Errors report for write
    
    public void testWrite_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 55 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!closed): False}
 *  */
    @Test
    public void testClose_Closed() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closed", true);
        
        tarArchiveOutputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: finish();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:303)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:112)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:124) */
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: finish();
 *  */
    @Test
    public void testClose_ThrowNullPointerException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:307)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:112)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:124) */
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: finish();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:307)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:112)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:124) */
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: finish();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ObjectOutputStream outStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 256);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(TarBuffer.java:321)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:307)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:112)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:124) */
        tarArchiveOutputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.throwsException {@link java.io.IOException} in: finish();
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ObjectOutputStream outStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.throwsException {@link java.io.IOException} in: finish();
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object inStream = createInstance("java.lang.ProcessBuilder$NullInputStream");
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.throwsException {@link java.io.IOException} in: finish();
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GZIPOutputStream outStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {(byte) -127};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 256);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException_4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GZIPOutputStream outStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: finish();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testClose_ThrowIndexOutOfBoundsException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        DeflaterOutputStream outStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", recordBuf);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -3);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.close();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method close()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
     */
    @Test
    public void testCloseThrowsNPE() throws IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        TarArchiveOutputStream tarArchiveOutputStream = new TarArchiveOutputStream(filterOutputStream);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:137)
            org.apache.commons.compress.archivers.tar.TarBuffer.writeBlock(TarBuffer.java:371)
            org.apache.commons.compress.archivers.tar.TarBuffer.flushBlock(TarBuffer.java:387)
            org.apache.commons.compress.archivers.tar.TarBuffer.close(TarBuffer.java:398)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:125) */
        tarArchiveOutputStream.close();
    }
    ///endregion
    
    ///region Errors report for close
    
    public void testClose_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 69 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method finish()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeEOFRecord();
 *  */
    @Test
    public void testFinish_ThrowNullPointerException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:303)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:112) */
        tarArchiveOutputStream.finish();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeEOFRecord();
 *  */
    @Test
    public void testFinish_ThrowNullPointerException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:307)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:112) */
        tarArchiveOutputStream.finish();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeEOFRecord();
 *  */
    @Test
    public void testFinish_ThrowNullPointerException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:307)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:112) */
        tarArchiveOutputStream.finish();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeEOFRecord();
 *  */
    @Test
    public void testFinish_ThrowNullPointerException_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ObjectOutputStream outStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 256);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(TarBuffer.java:321)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:307)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:112) */
        tarArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method finish()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.throwsException {@link java.io.IOException} in: writeEOFRecord();
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ObjectOutputStream outStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.finish();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.throwsException {@link java.io.IOException} in: writeEOFRecord();
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object inStream = createInstance("java.lang.ProcessBuilder$NullInputStream");
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.finish();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.throwsException {@link java.io.IOException} in: writeEOFRecord();
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.finish();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()
 * @utbot.throwsException {@link java.io.IOException} in: writeEOFRecord();
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GZIPOutputStream outStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {(byte) -127};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 256);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.finish();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.throwsException {@link java.io.IOException} in: writeEOFRecord();
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException_4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GZIPOutputStream outStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.finish();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.throwsException {@link java.io.IOException} in: writeEOFRecord();
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException_5() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        DeflaterOutputStream outStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method finish()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
     */
    @Test
    public void testFinish() throws IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        TarArchiveOutputStream tarArchiveOutputStream = new TarArchiveOutputStream(filterOutputStream);
        
        tarArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method finish()
    
    @Test
    public void testFinish1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ObjectOutputStream outStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {(byte) -127};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(TarBuffer.java:321)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:307)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:112) */
        tarArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method finish()
    
    @Test(expected = IOException.class)
    public void testFinish2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ObjectOutputStream outStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -2);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.finish();
    }
    
    @Test(expected = IOException.class)
    public void testFinish3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object inStream = createInstance("java.lang.Process$PipeInputStream");
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.finish();
    }
    
    @Test(expected = IOException.class)
    public void testFinish4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region Errors report for finish
    
    public void testFinish_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 65 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 *  */
    @Test
    public void testCloseArchiveEntry_AssemLenLessOrEqualZero() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -171L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -171L);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarBuffer#writeRecord(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 *  */
    @Test
    public void testCloseArchiveEntry_AssemLenGreaterThanZero() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", 0L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -32L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 32);
        byte[] assemBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipArchiveOutputStream outStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -225);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -224);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.closeArchiveEntry();
        
        long finalTarArchiveOutputStreamCurrBytes = ((Long) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes"));
        int finalTarArchiveOutputStreamAssemLen = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen"));
        TarBuffer tarBuffer = tarArchiveOutputStream.buffer;
        int finalTarArchiveOutputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        
        assertEquals(0L, finalTarArchiveOutputStreamCurrBytes);
        
        assertEquals(0, finalTarArchiveOutputStreamAssemLen);
        
        assertEquals(-224, finalTarArchiveOutputStreamBufferCurrRecIdx);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: buffer.writeRecord(assemBuf);
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowIndexOutOfBoundsException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GZIPOutputStream outStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(outStream, "java.util.zip.GZIPOutputStream", "crc", crc);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        FilterOutputStream out1 = ((FilterOutputStream) createInstance("java.io.FilterOutputStream"));
        FilterOutputStream out2 = ((FilterOutputStream) createInstance("java.io.FilterOutputStream"));
        ObjectOutputStream out3 = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 256);
        setField(out3, "java.io.ObjectOutputStream", "bout", bout);
        setField(out2, "java.io.FilterOutputStream", "out", out3);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -252);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -252);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = assemLen; i < assemBuf.length; ++i)
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowNullPointerException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry(TarArchiveOutputStream.java:201) */
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.writeRecord(assemBuf);
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowNullPointerException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry(TarArchiveOutputStream.java:205) */
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.writeRecord(assemBuf);
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowNullPointerException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127, (byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry(TarArchiveOutputStream.java:205) */
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.writeRecord(assemBuf);
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowNullPointerException_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GzipCompressorOutputStream outStream = ((GzipCompressorOutputStream) createInstance("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 256);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(TarBuffer.java:321)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry(TarArchiveOutputStream.java:205) */
        tarArchiveOutputStream.closeArchiveEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.executesCondition {@code (currBytes < currSize): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.io.IOException} when: currBytes < currSize
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -174L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -189L);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.io.IOException} in: buffer.writeRecord(assemBuf);
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GzipCompressorOutputStream outStream = ((GzipCompressorOutputStream) createInstance("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -2);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.io.IOException} in: buffer.writeRecord(assemBuf);
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.io.IOException} in: buffer.writeRecord(assemBuf);
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GZIPOutputStream outStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.io.IOException} in: buffer.writeRecord(assemBuf);
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        DeflaterOutputStream outStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    ///endregion
    
    ///region Errors report for closeArchiveEntry
    
    public void testCloseArchiveEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 60 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getRecordSize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRecordSize()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#getRecordSize()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarBuffer#getRecordSize()}
 * @utbot.returnsFrom {@code return buffer.getRecordSize();}
 *  */
    @Test
    public void testGetRecordSize_TarBufferGetRecordSize() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        int actual = tarArchiveOutputStream.getRecordSize();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRecordSize()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#getRecordSize()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarBuffer#getRecordSize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return buffer.getRecordSize();
 *  */
    @Test
    public void testGetRecordSize_ThrowNullPointerException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getRecordSize] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getRecordSize(TarArchiveOutputStream.java:137) */
        tarArchiveOutputStream.getRecordSize();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setLongFileMode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLongFileMode(int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#setLongFileMode(int)}
 *  */
    @Test
    public void testSetLongFileMode() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        tarArchiveOutputStream.setLongFileMode(-255);
        
        tarArchiveOutputStream.setLongFileMode(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.createArchiveEntry
    
    ///region OTHER: SECURITY for method createArchiveEntry(java.io.File, java.lang.String)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testCreateArchiveEntry1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.createArchiveEntry] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "user.name" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:952)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:150)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:222)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.createArchiveEntry(TarArchiveOutputStream.java:317) */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeEOFRecord()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarBuffer#writeRecord(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < recordBuf.length; ++i)} once
 *  */
    @Test
    public void testWriteEOFRecord_TarBufferWriteRecord() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ObjectOutputStream outStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {(byte) -127};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 256);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method writeEOFRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeEOFRecord");
        writeEOFRecordMethod.setAccessible(true);
        java.lang.Object[] writeEOFRecordMethodArguments = new java.lang.Object[0];
        writeEOFRecordMethod.invoke(tarArchiveOutputStream, writeEOFRecordMethodArguments);
        
        TarBuffer tarBuffer = tarArchiveOutputStream.buffer;
        int finalTarArchiveOutputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        
        assertEquals(256, finalTarArchiveOutputStreamBufferCurrRecIdx);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeEOFRecord()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < recordBuf.length; ++i)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteEOFRecord_ThrowIndexOutOfBoundsException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GZIPOutputStream outStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(outStream, "java.util.zip.GZIPOutputStream", "crc", crc);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", recordBuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 255);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method writeEOFRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeEOFRecord");
        writeEOFRecordMethod.setAccessible(true);
        java.lang.Object[] writeEOFRecordMethodArguments = new java.lang.Object[0];
        try {
            writeEOFRecordMethod.invoke(tarArchiveOutputStream, writeEOFRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < recordBuf.length; ++i)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteEOFRecord_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GZIPOutputStream outStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(outStream, "java.util.zip.GZIPOutputStream", "crc", crc);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", recordBuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 256);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method writeEOFRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeEOFRecord");
        writeEOFRecordMethod.setAccessible(true);
        java.lang.Object[] writeEOFRecordMethodArguments = new java.lang.Object[0];
        try {
            writeEOFRecordMethod.invoke(tarArchiveOutputStream, writeEOFRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < recordBuf.length; ++i)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteEOFRecord_ThrowIndexOutOfBoundsException_2() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GZIPOutputStream outStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(outStream, "java.util.zip.GZIPOutputStream", "crc", crc);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 256);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method writeEOFRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeEOFRecord");
        writeEOFRecordMethod.setAccessible(true);
        java.lang.Object[] writeEOFRecordMethodArguments = new java.lang.Object[0];
        try {
            writeEOFRecordMethod.invoke(tarArchiveOutputStream, writeEOFRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < recordBuf.length; ++i)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteEOFRecord_ThrowIndexOutOfBoundsException_3() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GZIPOutputStream outStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(outStream, "java.util.zip.GZIPOutputStream", "crc", crc);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 255);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method writeEOFRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeEOFRecord");
        writeEOFRecordMethod.setAccessible(true);
        java.lang.Object[] writeEOFRecordMethodArguments = new java.lang.Object[0];
        try {
            writeEOFRecordMethod.invoke(tarArchiveOutputStream, writeEOFRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < recordBuf.length; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < recordBuf.length; ++i)
 *  */
    @Test
    public void testWriteEOFRecord_ThrowNullPointerException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:303) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method writeEOFRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeEOFRecord");
        writeEOFRecordMethod.setAccessible(true);
        java.lang.Object[] writeEOFRecordMethodArguments = new java.lang.Object[0];
        try {
            writeEOFRecordMethod.invoke(tarArchiveOutputStream, writeEOFRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < recordBuf.length; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.writeRecord(recordBuf);
 *  */
    @Test
    public void testWriteEOFRecord_ThrowNullPointerException_1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:307) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method writeEOFRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeEOFRecord");
        writeEOFRecordMethod.setAccessible(true);
        java.lang.Object[] writeEOFRecordMethodArguments = new java.lang.Object[0];
        try {
            writeEOFRecordMethod.invoke(tarArchiveOutputStream, writeEOFRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < recordBuf.length; ++i)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.writeRecord(recordBuf);
 *  */
    @Test
    public void testWriteEOFRecord_ThrowNullPointerException_3() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:307) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method writeEOFRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeEOFRecord");
        writeEOFRecordMethod.setAccessible(true);
        java.lang.Object[] writeEOFRecordMethodArguments = new java.lang.Object[0];
        try {
            writeEOFRecordMethod.invoke(tarArchiveOutputStream, writeEOFRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < recordBuf.length; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.writeRecord(recordBuf);
 *  */
    @Test
    public void testWriteEOFRecord_ThrowNullPointerException_2() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ObjectOutputStream outStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 256);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(TarBuffer.java:321)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:307) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method writeEOFRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeEOFRecord");
        writeEOFRecordMethod.setAccessible(true);
        java.lang.Object[] writeEOFRecordMethodArguments = new java.lang.Object[0];
        try {
            writeEOFRecordMethod.invoke(tarArchiveOutputStream, writeEOFRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeEOFRecord()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < recordBuf.length; ++i)} once
 * @utbot.throwsException {@link java.io.IOException} in: buffer.writeRecord(recordBuf);
 *  */
    @Test(expected = IOException.class)
    public void testWriteEOFRecord_ThrowIOException_1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ObjectOutputStream outStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method writeEOFRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeEOFRecord");
        writeEOFRecordMethod.setAccessible(true);
        java.lang.Object[] writeEOFRecordMethodArguments = new java.lang.Object[0];
        try {
            writeEOFRecordMethod.invoke(tarArchiveOutputStream, writeEOFRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < recordBuf.length; ++i)} once
 * @utbot.throwsException {@link java.io.IOException} in: buffer.writeRecord(recordBuf);
 *  */
    @Test(expected = IOException.class)
    public void testWriteEOFRecord_ThrowIOException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        CpioArchiveInputStream inStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method writeEOFRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeEOFRecord");
        writeEOFRecordMethod.setAccessible(true);
        java.lang.Object[] writeEOFRecordMethodArguments = new java.lang.Object[0];
        try {
            writeEOFRecordMethod.invoke(tarArchiveOutputStream, writeEOFRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < recordBuf.length; ++i)} once
 * @utbot.throwsException {@link java.io.IOException} in: buffer.writeRecord(recordBuf);
 *  */
    @Test(expected = IOException.class)
    public void testWriteEOFRecord_ThrowIOException_2() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method writeEOFRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeEOFRecord");
        writeEOFRecordMethod.setAccessible(true);
        java.lang.Object[] writeEOFRecordMethodArguments = new java.lang.Object[0];
        try {
            writeEOFRecordMethod.invoke(tarArchiveOutputStream, writeEOFRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < recordBuf.length; ++i)} once
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteEOFRecord_ThrowIOException_3() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GZIPOutputStream outStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method writeEOFRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeEOFRecord");
        writeEOFRecordMethod.setAccessible(true);
        java.lang.Object[] writeEOFRecordMethodArguments = new java.lang.Object[0];
        try {
            writeEOFRecordMethod.invoke(tarArchiveOutputStream, writeEOFRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < recordBuf.length; ++i)} twice
 * @utbot.throwsException {@link java.io.IOException} in: buffer.writeRecord(recordBuf);
 *  */
    @Test(expected = IOException.class)
    public void testWriteEOFRecord_ThrowIOException_4() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        DeflaterOutputStream outStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method writeEOFRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeEOFRecord");
        writeEOFRecordMethod.setAccessible(true);
        java.lang.Object[] writeEOFRecordMethodArguments = new java.lang.Object[0];
        try {
            writeEOFRecordMethod.invoke(tarArchiveOutputStream, writeEOFRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method writeEOFRecord()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()}
     */
    @Test
    public void testWriteEOFRecord() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        TarArchiveOutputStream tarArchiveOutputStream = new TarArchiveOutputStream(filterOutputStream);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method writeEOFRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeEOFRecord");
        writeEOFRecordMethod.setAccessible(true);
        java.lang.Object[] writeEOFRecordMethodArguments = new java.lang.Object[0];
        writeEOFRecordMethod.invoke(tarArchiveOutputStream, writeEOFRecordMethodArguments);
    }
    ///endregion
    
    ///region Errors report for writeEOFRecord
    
    public void testWriteEOFRecord_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 67 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: TarArchiveEntry entry = (TarArchiveEntry) archiveEntry;
 *  */
    @Test
    public void testPutArchiveEntry_ThrowClassCastException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry(null, 0L, 0, 0, 0, 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry] produces [java.lang.ClassCastException: class org.apache.commons.compress.archivers.ar.ArArchiveEntry cannot be cast to class org.apache.commons.compress.archivers.tar.TarArchiveEntry (org.apache.commons.compress.archivers.ar.ArArchiveEntry and org.apache.commons.compress.archivers.tar.TarArchiveEntry are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5a1d61ba)]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(TarArchiveOutputStream.java:154) */
        tarArchiveOutputStream.putArchiveEntry(arArchiveEntry);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (entry.getName().length() >= TarConstants.NAMELEN): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: entry.writeEntryHeader(recordBuf);
 *  */
    @Test
    public void testPutArchiveEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = "";
        tarArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:129)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(TarArchiveEntry.java:568)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(TarArchiveOutputStream.java:176) */
        tarArchiveOutputStream.putArchiveEntry(tarArchiveEntry);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (entry.getName().length() >= TarConstants.NAMELEN): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: entry.writeEntryHeader(recordBuf);
 *  */
    @Test
    public void testPutArchiveEntry_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = "";
        tarArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:129)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(TarArchiveEntry.java:568)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(TarArchiveOutputStream.java:176) */
        tarArchiveOutputStream.putArchiveEntry(tarArchiveEntry);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (entry.getName().length() >= TarConstants.NAMELEN): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: entry.writeEntryHeader(recordBuf);
 *  */
    @Test
    public void testPutArchiveEntry_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = "\u0000";
        tarArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:124)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(TarArchiveEntry.java:568)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(TarArchiveOutputStream.java:176) */
        tarArchiveOutputStream.putArchiveEntry(tarArchiveEntry);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: entry.getName().length() >= TarConstants.NAMELEN
 *  */
    @Test
    public void testPutArchiveEntry_ThrowNullPointerException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(TarArchiveOutputStream.java:155) */
        tarArchiveOutputStream.putArchiveEntry(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    @Test
    public void testPutArchiveEntry1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = new byte[39];
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        tarArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39]
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:129)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(TarArchiveEntry.java:568)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(TarArchiveOutputStream.java:176) */
        tarArchiveOutputStream.putArchiveEntry(tarArchiveEntry);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields968480784446000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields968480784446000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass968480784456000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields968480784446000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass968480784456000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields968480784848000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields968480784848000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass968480784854100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields968480784848000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass968480784854100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}


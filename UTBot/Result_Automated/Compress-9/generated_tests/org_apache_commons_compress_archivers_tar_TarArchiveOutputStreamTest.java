package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.zip.ZipOutputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import java.util.jar.JarOutputStream;
import java.util.jar.JarEntry;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.DeflaterOutputStream;
import java.io.OutputStream;
import java.io.BufferedInputStream;
import java.util.zip.ZipInputStream;
import java.util.zip.GZIPInputStream;
import java.util.jar.JarInputStream;
import org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream;
import java.util.zip.Inflater;
import java.io.ObjectOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.junit.Ignore;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.flush(TarArchiveOutputStream.java:347) */
        tarArchiveOutputStream.flush();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method flush()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#flush()}
     */
    @Test
    public void testFlushThrowsNPE() throws IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        TarArchiveOutputStream tarArchiveOutputStream = new TarArchiveOutputStream(filterOutputStream);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.flush] produces [java.lang.NullPointerException]
            java.base/java.io.FilterOutputStream.flush(FilterOutputStream.java:153)
            java.base/java.io.FilterOutputStream.flush(FilterOutputStream.java:153)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.flush(TarArchiveOutputStream.java:347) */
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
    ///endregion
    
    ///region Errors report for flush
    
    public void testFlush_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 53 occurrences of:
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -254L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -254L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.ArchiveOutputStream", "bytesWritten", 0L);
        
        tarArchiveOutputStream.write(null, -255, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 *  */
    @Test
    public void testWrite_AssemLenLessOrEqualZero_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", 63L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", 64L);
        
        tarArchiveOutputStream.write(null, -255, -1);
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
        byte[] assemBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.ArchiveOutputStream", "bytesWritten", 0L);
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
    public void testWrite_NumToWriteLessThanRecordBufLength() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -253L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -254L);
        byte[] recordBuf = {(byte) 0, (byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.ArchiveOutputStream", "bytesWritten", 0L);
        byte[] byteArray = {(byte) -127};
        
        tarArchiveOutputStream.write(byteArray, 0, 1);
        
        int finalTarArchiveOutputStreamAssemLen = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen"));
        long finalTarArchiveOutputStreamBytesWritten = ((Long) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.ArchiveOutputStream", "bytesWritten"));
        
        assertEquals(1, finalTarArchiveOutputStreamAssemLen);
        
        assertEquals(1L, finalTarArchiveOutputStreamBytesWritten);
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
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -54L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -55L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(outStream, "java.util.zip.ZipOutputStream", "closed", true);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -254);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -133);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -254);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 133, 1);
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
    public void testWrite_ThrowIOException_4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -63L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -63L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(outStream, "java.util.zip.ZipOutputStream", "closed", true);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
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
    public void testWrite_ThrowIOException_10() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -235L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -235L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GzipCompressorInputStream inStream = ((GzipCompressorInputStream) createInstance("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -233L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -234L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GzipCompressorInputStream inStream = ((GzipCompressorInputStream) createInstance("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
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
    public void testWrite_ThrowIOException_5() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -254L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -255L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarOutputStream outStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setSize(1531575717026857082L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(outStream, "java.util.zip.ZipOutputStream", "written", 1459166279268040704L);
        setField(outStream, "java.util.zip.ZipOutputStream", "locoff", -72409437758816377L);
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", recordBuf);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -248);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -130);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -248);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 130, 1);
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
    public void testWrite_ThrowIOException_9() throws Exception  {
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
    public void testWrite_ThrowIOException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -237L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -238L);
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
    public void testWrite_ThrowIOException_6() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -254L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -255L);
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
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -133);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 133, 1);
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
    public void testWrite_ThrowIOException_7() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -158L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -159L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", recordBuf);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -4);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        byte[] byteArray = {(byte) -127};
        
        tarArchiveOutputStream.write(byteArray, 5, 1);
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
    public void testWrite_ThrowIOException_8() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -254L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -255L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setSize(8589934594L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(outStream, "java.util.zip.ZipOutputStream", "written", 8589934592L);
        setField(outStream, "java.util.zip.ZipOutputStream", "locoff", -1L);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", recordBuf);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -222);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -145);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -222);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 145, 1);
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
    public void testWrite_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -255L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -254L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:298) */
        tarArchiveOutputStream.write(byteArray, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.iterates iterate the loop {@code while(numToWrite > 0)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(wBuf, wOffset, assemBuf, assemLen, numToWrite);
 *  */
    @Test
    public void testWrite_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -237L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -238L);
        byte[] recordBuf = {(byte) 0, (byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", -256);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -256 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:314) */
        tarArchiveOutputStream.write(byteArray, 0, 1);
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:287) */
        tarArchiveOutputStream.write(null, -255, -1);
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:313) */
        tarArchiveOutputStream.write(null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (assemLen + numToWrite) >= recordBuf.length
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -255L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -196L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:284) */
        tarArchiveOutputStream.write(null, -255, -59);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.iterates iterate the loop {@code while(numToWrite > 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(wBuf, wOffset, assemBuf, assemLen, numToWrite);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -253L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -254L);
        byte[] recordBuf = {(byte) 0, (byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:314) */
        tarArchiveOutputStream.write(byteArray, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code ((assemLen + numToWrite) >= recordBuf.length): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(wBuf, wOffset, assemBuf, assemLen, numToWrite);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -255L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -254L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:298) */
        tarArchiveOutputStream.write(byteArray, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code ((assemLen + numToWrite) >= recordBuf.length): True}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarBuffer#writeRecord(byte[])}
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:291) */
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
    public void testWrite_ThrowNullPointerException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -253L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -254L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:322) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:287) */
        tarArchiveOutputStream.write(null, -255, -1);
    }
    ///endregion
    
    ///region Errors report for write
    
    public void testWrite_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 53 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!closed): True}
 *  */
    @Test
    public void testClose_NotClosed() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        setField(out, "java.util.zip.DeflaterOutputStream", "closed", true);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.close();
        
        boolean finalTarArchiveOutputStreamClosed = ((Boolean) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closed"));
        
        assertTrue(finalTarArchiveOutputStreamClosed);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!closed): True}
 *  */
    @Test
    public void testClose_NotClosed_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.close();
        
        boolean finalTarArchiveOutputStreamClosed = ((Boolean) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closed"));
        
        assertTrue(finalTarArchiveOutputStreamClosed);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!closed): True}
 *  */
    @Test
    public void testClose_NotClosed_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.close();
        
        boolean finalTarArchiveOutputStreamClosed = ((Boolean) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closed"));
        OutputStream tarArchiveOutputStreamOut = ((OutputStream) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out"));
        boolean finalTarArchiveOutputStreamOutClosed = ((Boolean) getFieldValue(tarArchiveOutputStreamOut, "java.util.zip.DeflaterOutputStream", "closed"));
        
        assertTrue(finalTarArchiveOutputStreamClosed);
        
        assertTrue(finalTarArchiveOutputStreamOutClosed);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!closed): True}
 *  */
    @Test
    public void testClose_NotClosed_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.close();
        
        boolean finalTarArchiveOutputStreamClosed = ((Boolean) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closed"));
        OutputStream tarArchiveOutputStreamOut = ((OutputStream) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out"));
        boolean finalTarArchiveOutputStreamOutClosed = ((Boolean) getFieldValue(tarArchiveOutputStreamOut, "java.util.zip.DeflaterOutputStream", "closed"));
        
        assertTrue(finalTarArchiveOutputStreamClosed);
        
        assertTrue(finalTarArchiveOutputStreamOutClosed);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!closed): True}
 *  */
    @Test
    public void testClose_NotClosed_4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.close();
        
        boolean finalTarArchiveOutputStreamClosed = ((Boolean) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closed"));
        OutputStream tarArchiveOutputStreamOut = ((OutputStream) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out"));
        boolean finalTarArchiveOutputStreamOutClosed = ((Boolean) getFieldValue(tarArchiveOutputStreamOut, "java.util.zip.DeflaterOutputStream", "closed"));
        OutputStream tarArchiveOutputStreamOut1 = ((OutputStream) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out"));
        OutputStream tarArchiveOutputStreamOut1OutOut = ((OutputStream) getFieldValue(tarArchiveOutputStreamOut1, "java.io.FilterOutputStream", "out"));
        boolean finalTarArchiveOutputStreamOutOutClosed = ((Boolean) getFieldValue(tarArchiveOutputStreamOut1OutOut, "java.util.zip.ZipOutputStream", "closed"));
        
        assertTrue(finalTarArchiveOutputStreamClosed);
        
        assertTrue(finalTarArchiveOutputStreamOutClosed);
        
        assertTrue(finalTarArchiveOutputStreamOutOutClosed);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!closed): True}
 *  */
    @Test
    public void testClose_NotClosed_5() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.close();
        
        boolean finalTarArchiveOutputStreamClosed = ((Boolean) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closed"));
        OutputStream tarArchiveOutputStreamOut = ((OutputStream) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out"));
        boolean finalTarArchiveOutputStreamOutClosed = ((Boolean) getFieldValue(tarArchiveOutputStreamOut, "java.util.zip.DeflaterOutputStream", "closed"));
        
        assertTrue(finalTarArchiveOutputStreamClosed);
        
        assertTrue(finalTarArchiveOutputStreamOutClosed);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:145) */
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: finish();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_14() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:338)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:128)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:141) */
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: finish();
 *  */
    @Test
    public void testClose_ThrowNullPointerException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:342)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:128)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:141) */
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: finish();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_5() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:342)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:128)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:141) */
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_6() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        DeflaterOutputStream outStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        setField(outStream, "java.util.zip.DeflaterOutputStream", "closed", true);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException] */
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_7() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(outStream, "java.util.zip.ZipOutputStream", "closed", true);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException] */
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_13() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            java.base/java.io.PrintStream.close(PrintStream.java:445)
            org.apache.commons.compress.archivers.tar.TarBuffer.close(TarBuffer.java:399)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:145) */
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: finish();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        TarArchiveOutputStream outStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1073741823);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 1073741824);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(TarBuffer.java:317)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:342)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:128)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:141) */
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        BufferedInputStream inStream = ((BufferedInputStream) createInstance("java.io.BufferedInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:146) */
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_8() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipInputStream inStream = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(inStream, "java.util.zip.ZipInputStream", "closed", true);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException] */
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_9() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipInputStream inStream = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(inStream, "java.util.zip.InflaterInputStream", "closed", true);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException] */
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:146) */
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_10() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipInputStream inStream = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        GZIPInputStream in = ((GZIPInputStream) createInstance("java.util.zip.GZIPInputStream"));
        setField(in, "java.util.zip.GZIPInputStream", "closed", true);
        setField(inStream, "java.io.FilterInputStream", "in", in);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException] */
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_11() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipInputStream in = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(inStream, "java.io.FilterInputStream", "in", in);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException] */
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_12() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipInputStream inStream = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        GZIPInputStream in = ((GZIPInputStream) createInstance("java.util.zip.GZIPInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(inStream, "java.io.FilterInputStream", "in", in);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException] */
        tarArchiveOutputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): True}
 * @utbot.throwsException {@link java.io.IOException} in: finish();
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): True}
 * @utbot.throwsException {@link java.io.IOException} in: finish();
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        TarArchiveOutputStream outStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): True}
 * @utbot.throwsException {@link java.io.IOException} in: finish();
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Pack200CompressorInputStream inStream = ((Pack200CompressorInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException_4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(outStream, "java.util.zip.ZipOutputStream", "closed", true);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): True}
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
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException_5() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setSize(2L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(outStream, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(outStream, "java.util.zip.ZipOutputStream", "locoff", 0L);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {(byte) 0, (byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 2);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.throwsException {@link java.io.IOException} in: buffer.close();
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException_6() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GZIPOutputStream outStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException_7() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException_8() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setSize(2L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(outStream, "java.util.zip.ZipOutputStream", "written", -4611686018427387904L);
        setField(outStream, "java.util.zip.ZipOutputStream", "locoff", -4611686018427387905L);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.throwsException {@link java.io.IOException} in: buffer.close();
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException_9() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setSize(2L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(outStream, "java.util.zip.ZipOutputStream", "written", -4611686018427387904L);
        setField(outStream, "java.util.zip.ZipOutputStream", "locoff", -4611686018427387905L);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        tarArchiveOutputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: buffer.close();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testClose_ThrowIndexOutOfBoundsException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 253);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testClose_ThrowNullPointerException_15() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipInputStream inStream = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        Object cleanable = createInstance("java.net.SocketCleanable");
        Object next = createInstance("java.net.SocketCleanable");
        setField(cleanable, "jdk.internal.ref.PhantomCleanable", "next", next);
        setField(zsRef, "java.util.zip.Inflater$InflaterZStreamRef", "cleanable", cleanable);
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(inStream, "java.util.zip.InflaterInputStream", "inf", inf);
        setField(inStream, "java.util.zip.InflaterInputStream", "usesDefaultInflater", true);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.invokes {@link java.io.OutputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.close();
 *  */
    @Test(expected = NullPointerException.class)
    public void testClose_ThrowNullPointerException_16() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        Object cleanable = createInstance("java.net.SocketCleanable");
        Object next = createInstance("java.net.SocketCleanable");
        setField(cleanable, "jdk.internal.ref.PhantomCleanable", "next", next);
        setField(zsRef, "java.util.zip.Deflater$DeflaterZStreamRef", "cleanable", cleanable);
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.util.zip.DeflaterOutputStream", "usesDefaultDeflater", true);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
            org.apache.commons.compress.utils.CountingOutputStream.write(CountingOutputStream.java:49)
            org.apache.commons.compress.archivers.tar.TarBuffer.writeBlock(TarBuffer.java:367)
            org.apache.commons.compress.archivers.tar.TarBuffer.flushBlock(TarBuffer.java:384)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:130)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:141) */
        tarArchiveOutputStream.close();
    }
    ///endregion
    
    ///region Errors report for close
    
    public void testClose_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 43 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 24 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        /* Unable to make field private static final java.util.concurrent.atomic.AtomicInteger sun.net.ResourceManager.numSockets accessible:
        module java.base does not "opens sun.net" to unnamed module @4fcd19b3 */
        
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:338)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:128) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:342)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:128) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:342)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:128) */
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
            org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(TarBuffer.java:317)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:342)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:128) */
        tarArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method finish()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.executesCondition {@code (finished): True}
 * @utbot.throwsException {@link java.io.IOException} when: finished
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        tarArchiveOutputStream.finish();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (haveUnclosedEntry): True}
 * @utbot.throwsException {@link java.io.IOException} when: haveUnclosedEntry
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        tarArchiveOutputStream.finish();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (haveUnclosedEntry): False}
 * @utbot.throwsException {@link java.io.IOException} in: writeEOFRecord();
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException_3() throws Exception  {
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
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (haveUnclosedEntry): False}
 * @utbot.throwsException {@link java.io.IOException} in: writeEOFRecord();
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.finish();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (haveUnclosedEntry): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException_4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setSize(4294967744L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(outStream, "java.util.zip.ZipOutputStream", "written", -2111607683097046848L);
        setField(outStream, "java.util.zip.ZipOutputStream", "locoff", -2111607687392014590L);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {(byte) 0, (byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 2);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.finish();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (haveUnclosedEntry): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException_5() throws Exception  {
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
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (haveUnclosedEntry): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException_6() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarOutputStream outStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.finish();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (haveUnclosedEntry): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException_7() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarOutputStream outStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setSize(17592186048578L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(outStream, "java.util.zip.ZipOutputStream", "written", 1649267499074L);
        setField(outStream, "java.util.zip.ZipOutputStream", "locoff", -15942918549503L);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method finish()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testFinish_ThrowIndexOutOfBoundsException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1610596349);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.finish();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testFinish_ThrowIndexOutOfBoundsException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method finish()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
     */
    @Test
    public void testFinishThrowsNPE() throws IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        TarArchiveOutputStream tarArchiveOutputStream = new TarArchiveOutputStream(filterOutputStream);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:137)
            org.apache.commons.compress.utils.CountingOutputStream.write(CountingOutputStream.java:49)
            org.apache.commons.compress.archivers.tar.TarBuffer.writeBlock(TarBuffer.java:367)
            org.apache.commons.compress.archivers.tar.TarBuffer.flushBlock(TarBuffer.java:384)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:130) */
        tarArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region Errors report for finish
    
    public void testFinish_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 66 occurrences of:
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getRecordSize(TarArchiveOutputStream.java:157) */
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (finished): True}
 * @utbot.throwsException {@link java.io.IOException} when: finished
 *  */
    @Test(expected = IOException.class)
    public void testPutArchiveEntry_ThrowIOException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        tarArchiveOutputStream.putArchiveEntry(null);
    }
    ///endregion
    
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
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry] produces [java.lang.ClassCastException: class org.apache.commons.compress.archivers.ar.ArArchiveEntry cannot be cast to class org.apache.commons.compress.archivers.tar.TarArchiveEntry (org.apache.commons.compress.archivers.ar.ArArchiveEntry and org.apache.commons.compress.archivers.tar.TarArchiveEntry are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @1b559a1)]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(TarArchiveOutputStream.java:178) */
        tarArchiveOutputStream.putArchiveEntry(arArchiveEntry);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:182)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(TarArchiveEntry.java:745)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(TarArchiveOutputStream.java:200) */
        tarArchiveOutputStream.putArchiveEntry(tarArchiveEntry);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:182)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(TarArchiveEntry.java:745)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(TarArchiveOutputStream.java:200) */
        tarArchiveOutputStream.putArchiveEntry(tarArchiveEntry);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:177)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(TarArchiveEntry.java:745)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(TarArchiveOutputStream.java:200) */
        tarArchiveOutputStream.putArchiveEntry(tarArchiveEntry);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: entry.getName().length() >= TarConstants.NAMELEN
 *  */
    @Test
    public void testPutArchiveEntry_ThrowNullPointerException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(TarArchiveOutputStream.java:179) */
        tarArchiveOutputStream.putArchiveEntry(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    @Test
    public void testPutArchiveEntry1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) 0, (byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = "\u0000";
        tarArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:182)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(TarArchiveEntry.java:745)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(TarArchiveOutputStream.java:200) */
        tarArchiveOutputStream.putArchiveEntry(tarArchiveEntry);
    }
    
    @Test
    public void testPutArchiveEntry2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = new byte[31];
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        tarArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 31 out of bounds for length 31]
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:177)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(TarArchiveEntry.java:745)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(TarArchiveOutputStream.java:200) */
        tarArchiveOutputStream.putArchiveEntry(tarArchiveEntry);
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -255L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -255L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        tarArchiveOutputStream.closeArchiveEntry();
        
        boolean finalTarArchiveOutputStreamHaveUnclosedEntry = ((Boolean) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry"));
        
        assertFalse(finalTarArchiveOutputStreamHaveUnclosedEntry);
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -5L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 5);
        byte[] assemBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object outStream = createInstance("org.apache.commons.compress.compressors.pack200.TempFileCachingStreamBridge");
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {(byte) -127, (byte) -127};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 256);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        tarArchiveOutputStream.closeArchiveEntry();
        
        long finalTarArchiveOutputStreamCurrBytes = ((Long) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes"));
        int finalTarArchiveOutputStreamAssemLen = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen"));
        TarBuffer tarBuffer = tarArchiveOutputStream.buffer;
        int finalTarArchiveOutputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        boolean finalTarArchiveOutputStreamHaveUnclosedEntry = ((Boolean) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry"));
        
        assertEquals(0L, finalTarArchiveOutputStreamCurrBytes);
        
        assertEquals(0, finalTarArchiveOutputStreamAssemLen);
        
        assertEquals(256, finalTarArchiveOutputStreamBufferCurrRecIdx);
        
        assertFalse(finalTarArchiveOutputStreamHaveUnclosedEntry);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): True}
 * @utbot.throwsException {@link java.io.IOException} when: !haveUnclosedEntry
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): True}
 * @utbot.throwsException {@link java.io.IOException} when: finished
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): False}
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
    public void testCloseArchiveEntry_ThrowIOException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -254L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -255L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): False}
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
        GzipCompressorInputStream inStream = ((GzipCompressorInputStream) createInstance("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.io.IOException} in: buffer.writeRecord(assemBuf);
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_5() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(outStream, "java.util.zip.ZipOutputStream", "closed", true);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): False}
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.io.IOException} in: buffer.writeRecord(assemBuf);
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_6() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarOutputStream outStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setSize(335518172666926148L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(outStream, "java.util.zip.ZipOutputStream", "written", -2163988416616721343L);
        setField(outStream, "java.util.zip.ZipOutputStream", "locoff", -2499506589283647490L);
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.io.IOException} in: buffer.writeRecord(assemBuf);
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_7() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.io.IOException} in: buffer.writeRecord(assemBuf);
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_8() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarOutputStream outStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setSize(0L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(outStream, "java.util.zip.ZipOutputStream", "written", 1207052661065252478L);
        setField(outStream, "java.util.zip.ZipOutputStream", "locoff", 1207052661065252479L);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -124);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -124);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarBuffer#writeRecord(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: buffer.writeRecord(assemBuf);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testCloseArchiveEntry_ThrowIndexOutOfBoundsException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GZIPOutputStream outStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {(byte) 0, (byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarBuffer#writeRecord(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: buffer.writeRecord(assemBuf);
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowIndexOutOfBoundsException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        FilterOutputStream out = ((FilterOutputStream) createInstance("java.io.FilterOutputStream"));
        Object out1 = createInstance("org.apache.commons.compress.compressors.pack200.TempFileCachingStreamBridge");
        ObjectOutputStream out2 = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 256);
        setField(out2, "java.io.ObjectOutputStream", "bout", bout);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", hbuf);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -224);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -224);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry(TarArchiveOutputStream.java:233) */
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry(TarArchiveOutputStream.java:237) */
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry(TarArchiveOutputStream.java:237) */
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
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.createArchiveEntry
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method createArchiveEntry(java.io.File, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#createArchiveEntry(java.io.File,java.lang.String)}
 * @utbot.executesCondition {@code (finished): True}
 * @utbot.throwsException {@link java.io.IOException} when: finished
 *  */
    @Test(expected = IOException.class)
    public void testCreateArchiveEntry_ThrowIOException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        tarArchiveOutputStream.createArchiveEntry(null, null);
    }
    ///endregion
    
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
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:181)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:271)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.createArchiveEntry(TarArchiveOutputStream.java:357) */
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
        Object outStream = createInstance("java.net.SocketOutputStream");
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < recordBuf.length; ++i)
 *  */
    @Test
    public void testWriteEOFRecord_ThrowNullPointerException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:338) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:342) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:342) */
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
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarBuffer#writeRecord(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < recordBuf.length; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.writeRecord(recordBuf);
 *  */
    @Test
    public void testWriteEOFRecord_ThrowNullPointerException_2() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object outStream = createInstance("java.net.SocketOutputStream");
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 256);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(TarBuffer.java:317)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:342) */
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
    public void testWriteEOFRecord_ThrowIOException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object outStream = createInstance("java.net.SocketOutputStream");
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
    public void testWriteEOFRecord_ThrowIOException_1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GzipCompressorInputStream inStream = ((GzipCompressorInputStream) createInstance("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
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
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteEOFRecord_ThrowIOException_3() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarOutputStream outStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(outStream, "java.util.zip.ZipOutputStream", "closed", true);
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
    public void testWriteEOFRecord_ThrowIOException_4() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setSize(36028797018964226L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(outStream, "java.util.zip.ZipOutputStream", "written", 101L);
        setField(outStream, "java.util.zip.ZipOutputStream", "locoff", -36028797018964124L);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -254);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -254);
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
    public void testWriteEOFRecord_ThrowIOException_5() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {(byte) 0, (byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 2);
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
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < recordBuf.length; ++i)} once
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteEOFRecord_ThrowIOException_6() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setSize(275L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(outStream, "java.util.zip.ZipOutputStream", "written", -289297866886797184L);
        setField(outStream, "java.util.zip.ZipOutputStream", "locoff", -289297866886797458L);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeEOFRecord()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarBuffer#writeRecord(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < recordBuf.length; ++i)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteEOFRecord_ThrowIndexOutOfBoundsException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GZIPOutputStream outStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", recordBuf);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -3);
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
    
    ///region OTHER: ERROR SUITE for method writeEOFRecord()
    
    @Test
    public void testWriteEOFRecord1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:342) */
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
    
    ///region OTHER: CHECKED EXCEPTIONS for method writeEOFRecord()
    
    @Test(expected = IOException.class)
    public void testWriteEOFRecord2() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) 0};
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
    ///endregion
    
    ///region Errors report for writeEOFRecord
    
    public void testWriteEOFRecord_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 63 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields969721111901600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields969721111901600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass969721111906500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields969721111901600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass969721111906500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields969721112142900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields969721112142900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass969721112144600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields969721112142900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass969721112144600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


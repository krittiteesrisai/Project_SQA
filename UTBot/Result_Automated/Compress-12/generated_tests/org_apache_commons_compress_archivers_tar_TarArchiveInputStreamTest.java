package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import java.io.FileInputStream;
import org.apache.commons.compress.utils.CountingOutputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;
import java.util.jar.JarInputStream;
import java.util.jar.JarEntry;
import sun.security.util.ManifestEntryVerifier;
import java.util.zip.ZipException;
import java.util.Properties;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.zip.DeflaterOutputStream;
import java.io.OutputStream;
import java.util.zip.ZipOutputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Deflater;
import java.io.PrintStream;
import java.util.zip.Inflater;
import java.util.jar.JarOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileReader;
import sun.nio.cs.StreamDecoder;
import java.lang.reflect.Method;
import org.apache.commons.compress.compressors.xz.XZCompressorInputStream;
import java.security.CodeSigner;
import java.security.cert.Certificate;
import java.util.Hashtable;
import java.util.HashMap;
import org.tukaani.xz.XZOutputStream;
import org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream;
import java.io.DataInputStream;
import java.io.BufferedOutputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import java.io.ByteArrayInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.junit.Ignore;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_compress_archivers_tar_TarArchiveInputStreamTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matches([B, int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN): True}
 *  */
    @Test
    public void testMatches_LengthLessThanTarConstantsVERSION_OFFSETPlusTarConstantsVERSIONLEN() {
        boolean actual = TarArchiveInputStream.matches(null, 0);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method matches([B, int)
    
    @Test
    public void testMatches1() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:151)
            org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(ArchiveUtils.java:74)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(TarArchiveInputStream.java:523) */
        TarArchiveInputStream.matches(null, 265);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (entryOffset >= entrySize): True}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testRead_EntryOffsetGreaterOrEqualEntrySize() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 1L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", 1L);
        
        int actual = tarArchiveInputStream.read(null, -255, -255);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (entryOffset >= entrySize): False}
 * @utbot.executesCondition {@code ((numToRead + entryOffset) > entrySize): False}
 * @utbot.executesCondition {@code (readBuf != null): False}
 * @utbot.returnsFrom {@code return totalRead;}
 *  */
    @Test
    public void testRead_ReadBufEqualsNull() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 4611686018427387904L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", 113L);
        
        int actual = tarArchiveInputStream.read(null, -255, -226);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code ((numToRead + entryOffset) > entrySize): False}
 * @utbot.executesCondition {@code (readBuf != null): True}
 * @utbot.executesCondition {@code ((numToRead > readBuf.length)): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(readBuf, 0, buf, offset, sz);
 *  */
    @Test
    public void testRead_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 10L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", 9L);
        byte[] readBuf = {(byte) -127};
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readBuf", readBuf);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(TarArchiveInputStream.java:427) */
        tarArchiveInputStream.read(byteArray, -1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code ((numToRead + entryOffset) > entrySize): True}
 * @utbot.executesCondition {@code (readBuf != null): True}
 * @utbot.executesCondition {@code ((numToRead > readBuf.length)): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(readBuf, 0, buf, offset, sz);
 *  */
    @Test
    public void testRead_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -127L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -128L);
        byte[] readBuf = {(byte) 0};
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readBuf", readBuf);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(TarArchiveInputStream.java:427) */
        tarArchiveInputStream.read(byteArray, -1, 166);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code ((numToRead + entryOffset) > entrySize): True}
 * @utbot.executesCondition {@code (readBuf != null): True}
 * @utbot.executesCondition {@code ((numToRead > readBuf.length)): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(readBuf, 0, buf, offset, sz);
 *  */
    @Test
    public void testRead_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -247L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -248L);
        byte[] readBuf = {};
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readBuf", readBuf);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(TarArchiveInputStream.java:427) */
        tarArchiveInputStream.read(byteArray, -1, 22);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code ((numToRead + entryOffset) > entrySize): False}
 * @utbot.executesCondition {@code (readBuf != null): True}
 * @utbot.executesCondition {@code ((numToRead > readBuf.length)): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(readBuf, 0, buf, offset, sz);
 *  */
    @Test
    public void testRead_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 1L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", 0L);
        byte[] readBuf = {};
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readBuf", readBuf);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[2]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(TarArchiveInputStream.java:427) */
        tarArchiveInputStream.read(byteArray, -1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code ((numToRead + entryOffset) > entrySize): True}
 * @utbot.executesCondition {@code (readBuf != null): False}
 * @utbot.iterates iterate the loop {@code while(numToRead > 0)} once
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: byte[] rec = buffer.readRecord();
 *  */
    @Test
    public void testRead_ThrowNegativeArraySizeException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -2L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -3L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        FileInputStream inStream = ((FileInputStream) createInstance("java.io.FileInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1509949714);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", Integer.MIN_VALUE);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 1509949714);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:201)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(TarArchiveInputStream.java:446) */
        tarArchiveInputStream.read(null, -255, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code ((numToRead + entryOffset) > entrySize): False}
 * @utbot.executesCondition {@code (readBuf != null): True}
 * @utbot.executesCondition {@code ((numToRead > readBuf.length)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(readBuf, 0, buf, offset, sz);
 *  */
    @Test
    public void testRead_ThrowNullPointerException_2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 0L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -1L);
        byte[] readBuf = {(byte) -127};
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readBuf", readBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(TarArchiveInputStream.java:427) */
        tarArchiveInputStream.read(null, 1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code ((numToRead + entryOffset) > entrySize): True}
 * @utbot.executesCondition {@code (readBuf != null): True}
 * @utbot.executesCondition {@code ((numToRead > readBuf.length)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(readBuf, 0, buf, offset, sz);
 *  */
    @Test
    public void testRead_ThrowNullPointerException_3() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -126L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -128L);
        byte[] readBuf = {(byte) 0, (byte) 0};
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readBuf", readBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(TarArchiveInputStream.java:427) */
        tarArchiveInputStream.read(null, -255, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code ((numToRead + entryOffset) > entrySize): True}
 * @utbot.executesCondition {@code (readBuf != null): True}
 * @utbot.executesCondition {@code ((numToRead > readBuf.length)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(readBuf, 0, buf, offset, sz);
 *  */
    @Test
    public void testRead_ThrowNullPointerException_4() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -127L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -128L);
        byte[] readBuf = {};
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readBuf", readBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(TarArchiveInputStream.java:427) */
        tarArchiveInputStream.read(null, -255, 208);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code ((numToRead + entryOffset) > entrySize): False}
 * @utbot.executesCondition {@code (readBuf != null): True}
 * @utbot.executesCondition {@code ((numToRead > readBuf.length)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(readBuf, 0, buf, offset, sz);
 *  */
    @Test
    public void testRead_ThrowNullPointerException_5() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 0L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -1L);
        byte[] readBuf = {};
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readBuf", readBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(TarArchiveInputStream.java:427) */
        tarArchiveInputStream.read(null, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code ((numToRead + entryOffset) > entrySize): False}
 * @utbot.executesCondition {@code (readBuf != null): True}
 * @utbot.executesCondition {@code ((numToRead > readBuf.length)): True}
 * @utbot.executesCondition {@code (sz >= readBuf.length): True}
 * @utbot.iterates iterate the loop {@code while(numToRead > 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte[] rec = buffer.readRecord();
 *  */
    @Test
    public void testRead_ThrowNullPointerException_6() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -253L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -254L);
        byte[] readBuf = {};
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readBuf", readBuf);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(TarArchiveInputStream.java:446) */
        tarArchiveInputStream.read(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code ((numToRead + entryOffset) > entrySize): False}
 * @utbot.executesCondition {@code (readBuf != null): False}
 * @utbot.iterates iterate the loop {@code while(numToRead > 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte[] rec = buffer.readRecord();
 *  */
    @Test
    public void testRead_ThrowNullPointerException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -248L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -249L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(TarArchiveInputStream.java:446) */
        tarArchiveInputStream.read(null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code ((numToRead + entryOffset) > entrySize): True}
 * @utbot.executesCondition {@code (readBuf != null): False}
 * @utbot.iterates iterate the loop {@code while(numToRead > 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte[] rec = buffer.readRecord();
 *  */
    @Test
    public void testRead_ThrowNullPointerException_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -2L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -3L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(TarArchiveInputStream.java:446) */
        tarArchiveInputStream.read(null, 2, 114);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code ((numToRead + entryOffset) > entrySize): True}
 * @utbot.iterates iterate the loop {@code while(numToRead > 0)} once
 * @utbot.throwsException {@link java.io.IOException} in: byte[] rec = buffer.readRecord();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -2L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -3L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        CountingOutputStream outStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.utils.CountingOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.read(null, 2, 114);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code ((numToRead + entryOffset) > entrySize): False}
 * @utbot.iterates iterate the loop {@code while(numToRead > 0)} once
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -251L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -252L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        InflaterInputStream inStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(inStream, "java.util.zip.InflaterInputStream", "closed", true);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.read(null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code ((numToRead + entryOffset) > entrySize): True}
 * @utbot.iterates iterate the loop {@code while(numToRead > 0)} once
 * @utbot.throwsException {@link java.io.IOException} in: byte[] rec = buffer.readRecord();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -2L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -3L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.read(null, 2, 114);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code ((numToRead + entryOffset) > entrySize): True}
 * @utbot.iterates iterate the loop {@code while(numToRead > 0)} once
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_3() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -2L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -3L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(inStream, "java.util.zip.ZipInputStream", "closed", true);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.read(null, -254, 114);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code ((numToRead + entryOffset) > entrySize): True}
 * @utbot.iterates iterate the loop {@code while(numToRead > 0)} once
 * @utbot.throwsException {@link java.io.IOException} in: " bytes unread. Occured at byte: "
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_4() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -2L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -3L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(inStream, "java.util.jar.JarInputStream", "first", first);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1476395012);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 1476395012);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.read(null, -254, 114);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code ((numToRead + entryOffset) > entrySize): True}
 * @utbot.iterates iterate the loop {@code while(numToRead > 0)} once
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_5() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -2L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -3L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(inStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(inStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(inStream, "java.io.FilterInputStream", "in", in);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) 0, (byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 8650912);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 2);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 8650912);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.read(null, 1, 114);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code ((numToRead + entryOffset) > entrySize): True}
 * @utbot.iterates iterate the loop {@code while(numToRead > 0)} once
 * @utbot.throwsException {@link java.io.IOException} in: " bytes unread. Occured at byte: "
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_6() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -2L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -3L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(inStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(inStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(inStream, "java.util.jar.JarInputStream", "mev", mev);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.read(null, -255, 114);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code ((numToRead + entryOffset) > entrySize): True}
 * @utbot.iterates iterate the loop {@code while(numToRead > 0)} once
 * @utbot.throwsException {@link java.io.IOException} in: " bytes unread. Occured at byte: "
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_7() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -2L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -3L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.read(null, -254, 114);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code ((numToRead + entryOffset) > entrySize): True}
 * @utbot.iterates iterate the loop {@code while(numToRead > 0)} once
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testRead_ThrowZipException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -2L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -3L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(inStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(inStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.jar.JarInputStream", "first", entry);
        setField(inStream, "java.io.FilterInputStream", "in", in);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) 0, (byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 69222432);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 2);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 69222432);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.read(null, 4, 114);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code ((numToRead + entryOffset) > entrySize): True}
 * @utbot.iterates iterate the loop {@code while(numToRead > 0)} once
 * @utbot.throwsException {@link java.io.IOException} in: " bytes unread. Occured at byte: "
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_8() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -2L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -3L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(inStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(inStream, "java.util.jar.JarInputStream", "mev", mev);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.read(null, -255, 114);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (entryOffset >= entrySize): False}
 * @utbot.executesCondition {@code ((numToRead + entryOffset) > entrySize): True}
 * @utbot.executesCondition {@code (readBuf != null): False}
 * @utbot.iterates iterate the loop {@code while(numToRead > 0)} once
 * @utbot.throwsException {@link java.lang.SecurityException} 
 *  */
    @Test(expected = SecurityException.class)
    public void testRead_ThrowSecurityException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -2L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -3L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", verifiedSigners);
        setField(inStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(inStream, "java.util.jar.JarInputStream", "mev", mev);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 83968);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 83968);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.read(null, 2, 114);
    }
    ///endregion
    
    ///region Errors report for read
    
    public void testRead_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Default concrete execution failed
        
        // 4 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        DeflaterOutputStream outStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        setField(outStream, "java.util.zip.DeflaterOutputStream", "closed", true);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.close();
        
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        OutputStream finalTarArchiveInputStreamBufferOutStream = ((OutputStream) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream"));
        
        assertNull(finalTarArchiveInputStreamBufferOutStream);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_3() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(outStream, "java.util.zip.ZipOutputStream", "closed", true);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.close();
        
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        OutputStream finalTarArchiveInputStreamBufferOutStream = ((OutputStream) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream"));
        
        assertNull(finalTarArchiveInputStreamBufferOutStream);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_4() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(outStream, "java.util.zip.DeflaterOutputStream", "closed", true);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.close();
        
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        OutputStream finalTarArchiveInputStreamBufferOutStream = ((OutputStream) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream"));
        
        assertNull(finalTarArchiveInputStreamBufferOutStream);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        BufferedInputStream inStream = ((BufferedInputStream) createInstance("java.io.BufferedInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.close();
        
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        InputStream finalTarArchiveInputStreamBufferInStream = ((InputStream) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream"));
        
        assertNull(finalTarArchiveInputStreamBufferInStream);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_5() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipInputStream inStream = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(inStream, "java.util.zip.InflaterInputStream", "closed", true);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.close();
        
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        InputStream finalTarArchiveInputStreamBufferInStream = ((InputStream) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream"));
        
        assertNull(finalTarArchiveInputStreamBufferInStream);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 *  */
    @Test
    public void testClose() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_6() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        InflaterInputStream inStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        ZipInputStream in = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(inStream, "java.io.FilterInputStream", "in", in);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.close();
        
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        InputStream finalTarArchiveInputStreamBufferInStream = ((InputStream) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream"));
        
        assertNull(finalTarArchiveInputStreamBufferInStream);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_7() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        InflaterInputStream inStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(inStream, "java.io.FilterInputStream", "in", in);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.close();
        
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        InputStream finalTarArchiveInputStreamBufferInStream = ((InputStream) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream"));
        
        assertNull(finalTarArchiveInputStreamBufferInStream);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_8() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GZIPOutputStream outStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        setField(out, "java.util.zip.DeflaterOutputStream", "closed", true);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.close();
        
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        OutputStream finalTarArchiveInputStreamBufferOutStream = ((OutputStream) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream"));
        
        assertNull(finalTarArchiveInputStreamBufferOutStream);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_9() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        DeflaterOutputStream outStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        setField(out, "java.util.zip.DeflaterOutputStream", "closed", true);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.close();
        
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        OutputStream finalTarArchiveInputStreamBufferOutStream = ((OutputStream) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream"));
        
        assertNull(finalTarArchiveInputStreamBufferOutStream);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_10() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        DeflaterOutputStream outStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.close();
        
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        OutputStream finalTarArchiveInputStreamBufferOutStream = ((OutputStream) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream"));
        
        assertNull(finalTarArchiveInputStreamBufferOutStream);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.close(TarArchiveInputStream.java:91) */
        tarArchiveInputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarBuffer#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testClose_ThrowNullPointerException_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.close] produces [java.lang.NullPointerException]
            java.base/java.io.PrintStream.close(PrintStream.java:445)
            org.apache.commons.compress.archivers.tar.TarBuffer.close(TarBuffer.java:399)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.close(TarArchiveInputStream.java:91) */
        tarArchiveInputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: buffer.close();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testClose_ThrowIndexOutOfBoundsException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -1);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: buffer.close();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testClose_ThrowIndexOutOfBoundsException_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GZIPOutputStream outStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -3);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testClose_ThrowNullPointerException_2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        DeflaterOutputStream outStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        Object cleanable = createInstance("java.net.SocketCleanable");
        Object next = createInstance("java.net.SocketCleanable");
        setField(cleanable, "jdk.internal.ref.PhantomCleanable", "next", next);
        setField(zsRef, "java.util.zip.Deflater$DeflaterZStreamRef", "cleanable", cleanable);
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "usesDefaultDeflater", true);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testClose_ThrowNullPointerException_3() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipInputStream inStream = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        Object cleanable = createInstance("java.net.SocketCleanable");
        setField(zsRef, "java.util.zip.Inflater$InflaterZStreamRef", "cleanable", cleanable);
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(inStream, "java.util.zip.InflaterInputStream", "inf", inf);
        setField(inStream, "java.util.zip.InflaterInputStream", "usesDefaultInflater", true);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarOutputStream outStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setSize(17592186044418L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(outStream, "java.util.zip.ZipOutputStream", "written", 15393162788866L);
        setField(outStream, "java.util.zip.ZipOutputStream", "locoff", -2199023255550L);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {(byte) -127, (byte) -127};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 2);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 * @utbot.throwsException {@link java.io.IOException} in: buffer.close();
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
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
        byte[] blockBuffer = {(byte) -127, (byte) -127};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 2);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException_2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setSize(51642370L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(outStream, "java.util.zip.ZipOutputStream", "written", 37748736L);
        setField(outStream, "java.util.zip.ZipOutputStream", "locoff", -13893633L);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        byte[] blockBuffer = {(byte) -127};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.close();
    }
    ///endregion
    
    ///region Errors report for close
    
    public void testClose_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 59 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 23 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 5 occurrences of:
        /* Unable to make field private static final java.util.concurrent.atomic.AtomicInteger sun.net.ResourceManager.numSockets accessible:
        module java.base does not "opens sun.net" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.available
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method available()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#available()}
 * @utbot.executesCondition {@code (entrySize - entryOffset > Integer.MAX_VALUE): True}
 * @utbot.returnsFrom {@code return Integer.MAX_VALUE;}
 *  */
    @Test
    public void testAvailable_EntrySizeMinusEntryOffsetGreaterThanIntegerMAX_VALUE() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 6755401588541443L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", 0L);
        
        int actual = tarArchiveInputStream.available();
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#available()}
 * @utbot.executesCondition {@code (entrySize - entryOffset > Integer.MAX_VALUE): False}
 * @utbot.returnsFrom {@code return (int) (entrySize - entryOffset);}
 *  */
    @Test
    public void testAvailable_EntrySizeMinusEntryOffsetLessOrEqualIntegerMAX_VALUE() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 259L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", 268435456L);
        
        int actual = tarArchiveInputStream.available();
        
        assertEquals(-268435197, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.reset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reset()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#reset()}
 *  */
    @Test
    public void testReset() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        tarArchiveInputStream.reset();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecordSize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRecordSize()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecordSize()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarBuffer#getRecordSize()}
 * @utbot.returnsFrom {@code return buffer.getRecordSize();}
 *  */
    @Test
    public void testGetRecordSize_TarBufferGetRecordSize() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -255);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        int actual = tarArchiveInputStream.getRecordSize();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRecordSize()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecordSize()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarBuffer#getRecordSize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return buffer.getRecordSize();
 *  */
    @Test
    public void testGetRecordSize_ThrowNullPointerException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecordSize] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecordSize(TarArchiveInputStream.java:100) */
        tarArchiveInputStream.getRecordSize();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.canReadEntryData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (ae instanceof TarArchiveEntry): True}
 * @utbot.returnsFrom {@code return !te.isGNUSparse();}
 *  */
    @Test
    public void testCanReadEntryData_NotTeIsGNUSparse() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 83);
        
        boolean actual = tarArchiveInputStream.canReadEntryData(tarArchiveEntry);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (ae instanceof TarArchiveEntry): True}
 * @utbot.returnsFrom {@code return !te.isGNUSparse();}
 *  */
    @Test
    public void testCanReadEntryData_NotTeIsGNUSparse_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", java.lang.Byte.MIN_VALUE);
        
        boolean actual = tarArchiveInputStream.canReadEntryData(tarArchiveEntry);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (ae instanceof TarArchiveEntry): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCanReadEntryData_NotAeNotInstanceOfTarArchiveEntry() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        boolean actual = tarArchiveInputStream.canReadEntryData(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parsePaxHeaders(java.io.Reader)
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#parsePaxHeaders(java.io.Reader)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while((ch = br.read()) != -1)
 *  */
    @Test
    public void testParsePaxHeaders_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        BufferedReader bufferedReader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream$1"));
        setField(bufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = new char[32];
        setField(bufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(bufferedReader, "java.io.BufferedReader", "nChars", 1442840418);
        setField(bufferedReader, "java.io.BufferedReader", "nextChar", 1442840418);
        setField(bufferedReader, "java.io.BufferedReader", "markedChar", 1442840387);
        setField(bufferedReader, "java.io.BufferedReader", "readAheadLimit", 32);
        Object lock = createInstance("java.lang.Object");
        setField(bufferedReader, "java.io.Reader", "lock", lock);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1442840418 out of bounds for char[32]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:145)
            java.base/java.io.BufferedReader.read(BufferedReader.java:183)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders(TarArchiveInputStream.java:294) */
        tarArchiveInputStream.parsePaxHeaders(bufferedReader);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#parsePaxHeaders(java.io.Reader)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while((ch = br.read()) != -1)
 *  */
    @Test
    public void testParsePaxHeaders_ThrowNullPointerException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders(TarArchiveInputStream.java:294) */
        tarArchiveInputStream.parsePaxHeaders(null);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#parsePaxHeaders(java.io.Reader)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while((ch = br.read()) != -1)
 *  */
    @Test
    public void testParsePaxHeaders_ThrowNullPointerException_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        BufferedReader bufferedReader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream$1"));
        setField(bufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(bufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(bufferedReader, "java.io.BufferedReader", "nextChar", -1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.read(BufferedReader.java:179)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders(TarArchiveInputStream.java:294) */
        tarArchiveInputStream.parsePaxHeaders(bufferedReader);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method parsePaxHeaders(java.io.Reader)
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#parsePaxHeaders(java.io.Reader)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testParsePaxHeaders_ThrowIOException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        FileReader fileReader = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(fileReader, "java.io.InputStreamReader", "sd", sd);
        
        tarArchiveInputStream.parsePaxHeaders(fileReader);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#parsePaxHeaders(java.io.Reader)}
 * @utbot.throwsException {@link java.io.IOException} in: while((ch = br.read()) != -1)
 *  */
    @Test(expected = IOException.class)
    public void testParsePaxHeaders_ThrowIOException_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        BufferedReader bufferedReader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(bufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\n'};
        setField(bufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(bufferedReader, "java.io.BufferedReader", "nChars", 1);
        setField(bufferedReader, "java.io.BufferedReader", "markedChar", -1);
        setField(bufferedReader, "java.io.BufferedReader", "skipLF", true);
        
        tarArchiveInputStream.parsePaxHeaders(bufferedReader);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parsePaxHeaders(java.io.Reader)
    
    @Test
    public void testParsePaxHeaders1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        BufferedReader bufferedReader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in1 = ((InputStreamReader) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream$1"));
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = new char[36];
        cb[0] = '\n';
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", 1073741840);
        setField(in, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(in, "java.io.Reader", "lock", lock);
        setField(bufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb1 = new char[28];
        setField(bufferedReader, "java.io.BufferedReader", "cb", cb1);
        setField(bufferedReader, "java.io.BufferedReader", "nChars", -1073741822);
        setField(bufferedReader, "java.io.BufferedReader", "nextChar", 1);
        setField(bufferedReader, "java.io.BufferedReader", "markedChar", 1073741824);
        setField(bufferedReader, "java.io.BufferedReader", "readAheadLimit", -2147483644);
        setField(bufferedReader, "java.io.BufferedReader", "skipLF", true);
        Object lock1 = createInstance("java.lang.Object");
        setField(bufferedReader, "java.io.Reader", "lock", lock1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 57 out of bounds for char[36]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.BufferedReader.read1(BufferedReader.java:227)
            java.base/java.io.BufferedReader.read(BufferedReader.java:287)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.read(BufferedReader.java:183)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders(TarArchiveInputStream.java:294) */
        tarArchiveInputStream.parsePaxHeaders(bufferedReader);
    }
    
    @Test
    public void testParsePaxHeaders2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        BufferedReader bufferedReader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream$1"));
        setField(bufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {
            ' ', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(bufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(bufferedReader, "java.io.BufferedReader", "nChars", 1);
        setField(bufferedReader, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(bufferedReader, "java.io.Reader", "lock", lock);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders] produces [java.lang.NullPointerException]
            java.base/java.io.InputStreamReader.read(InputStreamReader.java:177)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.read(BufferedReader.java:183)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders(TarArchiveInputStream.java:299) */
        tarArchiveInputStream.parsePaxHeaders(bufferedReader);
    }
    
    @Test
    public void testParsePaxHeaders3() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        BufferedReader bufferedReader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in1 = ((InputStreamReader) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream$1"));
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = new char[40];
        cb[37] = '\n';
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", 38);
        setField(in, "java.io.BufferedReader", "nextChar", 37);
        setField(in, "java.io.BufferedReader", "readAheadLimit", 39);
        setField(in, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(in, "java.io.Reader", "lock", lock);
        setField(bufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb1 = {
            '\n', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(bufferedReader, "java.io.BufferedReader", "cb", cb1);
        setField(bufferedReader, "java.io.BufferedReader", "nChars", 1);
        setField(bufferedReader, "java.io.BufferedReader", "markedChar", Integer.MIN_VALUE);
        setField(bufferedReader, "java.io.BufferedReader", "skipLF", true);
        Object lock1 = createInstance("java.lang.Object");
        setField(bufferedReader, "java.io.Reader", "lock", lock1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders] produces [java.lang.NullPointerException]
            java.base/java.io.InputStreamReader.read(InputStreamReader.java:177)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.read1(BufferedReader.java:221)
            java.base/java.io.BufferedReader.read(BufferedReader.java:287)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.read(BufferedReader.java:183)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders(TarArchiveInputStream.java:294) */
        tarArchiveInputStream.parsePaxHeaders(bufferedReader);
    }
    
    @Test
    public void testParsePaxHeaders4() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        BufferedReader bufferedReader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in1 = ((InputStreamReader) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream$1"));
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", -2147483647);
        setField(in, "java.io.BufferedReader", "readAheadLimit", 9);
        setField(bufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb1 = {'\n'};
        setField(bufferedReader, "java.io.BufferedReader", "cb", cb1);
        setField(bufferedReader, "java.io.BufferedReader", "nChars", 1);
        setField(bufferedReader, "java.io.BufferedReader", "markedChar", Integer.MIN_VALUE);
        setField(bufferedReader, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(bufferedReader, "java.io.Reader", "lock", lock);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.read(BufferedReader.java:280)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.read(BufferedReader.java:183)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders(TarArchiveInputStream.java:294) */
        tarArchiveInputStream.parsePaxHeaders(bufferedReader);
    }
    ///endregion
    
    ///region Errors report for parsePaxHeaders
    
    public void testParsePaxHeaders_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 41 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGNUSparse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readGNUSparse()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readGNUSparse()}
 *  */
    @Test
    public void testReadGNUSparse() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGNUSparse");
        readGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readGNUSparseMethodArguments = new java.lang.Object[0];
        readGNUSparseMethod.invoke(tarArchiveInputStream, readGNUSparseMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readGNUSparse()}
 * @utbot.executesCondition {@code (hasHitEOF): True}
 *  */
    @Test
    public void testReadGNUSparse_HasHitEOF() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF", true);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGNUSparse");
        readGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readGNUSparseMethodArguments = new java.lang.Object[0];
        readGNUSparseMethod.invoke(tarArchiveInputStream, readGNUSparseMethodArguments);
        
        TarArchiveEntry finalTarArchiveInputStreamCurrEntry = ((TarArchiveEntry) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry"));
        
        assertNull(finalTarArchiveInputStreamCurrEntry);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readGNUSparse()}
 * @utbot.executesCondition {@code (hasHitEOF): True}
 *  */
    @Test
    public void testReadGNUSparse_HasHitEOF_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        XZCompressorInputStream inStream = ((XZCompressorInputStream) createInstance("org.apache.commons.compress.compressors.xz.XZCompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 256);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGNUSparse");
        readGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readGNUSparseMethodArguments = new java.lang.Object[0];
        readGNUSparseMethod.invoke(tarArchiveInputStream, readGNUSparseMethodArguments);
        
        boolean finalTarArchiveInputStreamHasHitEOF = ((Boolean) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        int finalTarArchiveInputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        TarArchiveEntry finalTarArchiveInputStreamCurrEntry = ((TarArchiveEntry) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry"));
        
        assertTrue(finalTarArchiveInputStreamHasHitEOF);
        
        assertEquals(256, finalTarArchiveInputStreamBufferCurrRecIdx);
        
        assertNull(finalTarArchiveInputStreamCurrEntry);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readGNUSparse()}
 * @utbot.executesCondition {@code (hasHitEOF): True}
 *  */
    @Test
    public void testReadGNUSparse_HasHitEOF_2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        XZCompressorInputStream inStream = ((XZCompressorInputStream) createInstance("org.apache.commons.compress.compressors.xz.XZCompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 1);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGNUSparse");
        readGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readGNUSparseMethodArguments = new java.lang.Object[0];
        readGNUSparseMethod.invoke(tarArchiveInputStream, readGNUSparseMethodArguments);
        
        boolean finalTarArchiveInputStreamHasHitEOF = ((Boolean) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        int finalTarArchiveInputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        TarArchiveEntry finalTarArchiveInputStreamCurrEntry = ((TarArchiveEntry) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry"));
        
        assertTrue(finalTarArchiveInputStreamHasHitEOF);
        
        assertEquals(1, finalTarArchiveInputStreamBufferCurrRecIdx);
        
        assertNull(finalTarArchiveInputStreamCurrEntry);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readGNUSparse()}
 * @utbot.executesCondition {@code (hasHitEOF): True}
 *  */
    @Test
    public void testReadGNUSparse_HasHitEOF_3() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(inStream, "java.util.jar.JarInputStream", "first", first);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGNUSparse");
        readGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readGNUSparseMethodArguments = new java.lang.Object[0];
        readGNUSparseMethod.invoke(tarArchiveInputStream, readGNUSparseMethodArguments);
        
        boolean finalTarArchiveInputStreamHasHitEOF = ((Boolean) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        int finalTarArchiveInputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        TarArchiveEntry finalTarArchiveInputStreamCurrEntry = ((TarArchiveEntry) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry"));
        
        assertTrue(finalTarArchiveInputStreamHasHitEOF);
        
        assertEquals(0, finalTarArchiveInputStreamBufferCurrRecIdx);
        
        assertNull(finalTarArchiveInputStreamCurrEntry);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readGNUSparse()}
 * @utbot.executesCondition {@code (hasHitEOF): True}
 *  */
    @Test
    public void testReadGNUSparse_HasHitEOF_4() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGNUSparse");
        readGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readGNUSparseMethodArguments = new java.lang.Object[0];
        readGNUSparseMethod.invoke(tarArchiveInputStream, readGNUSparseMethodArguments);
        
        boolean finalTarArchiveInputStreamHasHitEOF = ((Boolean) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        int finalTarArchiveInputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        TarArchiveEntry finalTarArchiveInputStreamCurrEntry = ((TarArchiveEntry) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry"));
        
        assertTrue(finalTarArchiveInputStreamHasHitEOF);
        
        assertEquals(0, finalTarArchiveInputStreamBufferCurrRecIdx);
        
        assertNull(finalTarArchiveInputStreamCurrEntry);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readGNUSparse()}
 * @utbot.executesCondition {@code (hasHitEOF): True}
 *  */
    @Test
    public void testReadGNUSparse_HasHitEOF_5() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(inStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(inStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        java.security.CodeSigner[] signers = {null};
        setField(entry, "java.util.jar.JarEntry", "signers", signers);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(inStream, "java.util.jar.JarInputStream", "mev", mev);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -254);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -254);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGNUSparse");
        readGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readGNUSparseMethodArguments = new java.lang.Object[0];
        readGNUSparseMethod.invoke(tarArchiveInputStream, readGNUSparseMethodArguments);
        
        boolean finalTarArchiveInputStreamHasHitEOF = ((Boolean) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        int finalTarArchiveInputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        TarArchiveEntry finalTarArchiveInputStreamCurrEntry = ((TarArchiveEntry) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry"));
        
        assertTrue(finalTarArchiveInputStreamHasHitEOF);
        
        assertEquals(0, finalTarArchiveInputStreamBufferCurrRecIdx);
        
        assertNull(finalTarArchiveInputStreamCurrEntry);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readGNUSparse()}
 * @utbot.executesCondition {@code (hasHitEOF): True}
 *  */
    @Test
    public void testReadGNUSparse_HasHitEOF_6() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(inStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(inStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(inStream, "java.util.jar.JarInputStream", "mev", mev);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -252);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -252);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGNUSparse");
        readGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readGNUSparseMethodArguments = new java.lang.Object[0];
        readGNUSparseMethod.invoke(tarArchiveInputStream, readGNUSparseMethodArguments);
        
        boolean finalTarArchiveInputStreamHasHitEOF = ((Boolean) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        int finalTarArchiveInputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        TarArchiveEntry finalTarArchiveInputStreamCurrEntry = ((TarArchiveEntry) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry"));
        
        assertTrue(finalTarArchiveInputStreamHasHitEOF);
        
        assertEquals(0, finalTarArchiveInputStreamBufferCurrRecIdx);
        
        assertNull(finalTarArchiveInputStreamCurrEntry);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readGNUSparse()}
 * @utbot.executesCondition {@code (hasHitEOF): True}
 *  */
    @Test
    public void testReadGNUSparse_HasHitEOF_7() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(inStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(inStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        java.security.cert.Certificate[] certs = {null};
        setField(entry, "java.util.jar.JarEntry", "certs", certs);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        java.security.CodeSigner[] signers = {};
        setField(mev, "sun.security.util.ManifestEntryVerifier", "signers", signers);
        setField(inStream, "java.util.jar.JarInputStream", "mev", mev);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        InputStream tarBufferBufferInStream = ((InputStream) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream"));
        ManifestEntryVerifier tarBufferBufferInStreamBufferInStreamMev = ((ManifestEntryVerifier) getFieldValue(tarBufferBufferInStream, "java.util.jar.JarInputStream", "mev"));
        JarEntry tarBufferBufferInStreamBufferInStreamMevBufferInStreamMevEntry = ((JarEntry) getFieldValue(tarBufferBufferInStreamBufferInStreamMev, "sun.security.util.ManifestEntryVerifier", "entry"));
        java.security.cert.Certificate[] initialTarArchiveInputStreamBufferInStreamMevEntryCerts = ((java.security.cert.Certificate[]) getFieldValue(tarBufferBufferInStreamBufferInStreamMevBufferInStreamMevEntry, "java.util.jar.JarEntry", "certs"));
        TarBuffer tarBuffer1 = tarArchiveInputStream.buffer;
        InputStream tarBuffer1BufferInStream = ((InputStream) getFieldValue(tarBuffer1, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream"));
        ManifestEntryVerifier tarBuffer1BufferInStreamBufferInStreamMev = ((ManifestEntryVerifier) getFieldValue(tarBuffer1BufferInStream, "java.util.jar.JarInputStream", "mev"));
        JarEntry tarBuffer1BufferInStreamBufferInStreamMevBufferInStreamMevEntry = ((JarEntry) getFieldValue(tarBuffer1BufferInStreamBufferInStreamMev, "sun.security.util.ManifestEntryVerifier", "entry"));
        java.security.CodeSigner[] initialTarArchiveInputStreamBufferInStreamMevEntrySigners = ((java.security.CodeSigner[]) getFieldValue(tarBuffer1BufferInStreamBufferInStreamMevBufferInStreamMevEntry, "java.util.jar.JarEntry", "signers"));
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGNUSparse");
        readGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readGNUSparseMethodArguments = new java.lang.Object[0];
        readGNUSparseMethod.invoke(tarArchiveInputStream, readGNUSparseMethodArguments);
        
        boolean finalTarArchiveInputStreamHasHitEOF = ((Boolean) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        TarBuffer tarBuffer2 = tarArchiveInputStream.buffer;
        InputStream tarBuffer2BufferInStream = ((InputStream) getFieldValue(tarBuffer2, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream"));
        ManifestEntryVerifier tarBuffer2BufferInStreamBufferInStreamMev = ((ManifestEntryVerifier) getFieldValue(tarBuffer2BufferInStream, "java.util.jar.JarInputStream", "mev"));
        JarEntry tarBuffer2BufferInStreamBufferInStreamMevBufferInStreamMevEntry = ((JarEntry) getFieldValue(tarBuffer2BufferInStreamBufferInStreamMev, "sun.security.util.ManifestEntryVerifier", "entry"));
        java.security.cert.Certificate[] finalTarArchiveInputStreamBufferInStreamMevEntryCerts = ((java.security.cert.Certificate[]) getFieldValue(tarBuffer2BufferInStreamBufferInStreamMevBufferInStreamMevEntry, "java.util.jar.JarEntry", "certs"));
        TarBuffer tarBuffer3 = tarArchiveInputStream.buffer;
        InputStream tarBuffer3BufferInStream = ((InputStream) getFieldValue(tarBuffer3, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream"));
        ManifestEntryVerifier tarBuffer3BufferInStreamBufferInStreamMev = ((ManifestEntryVerifier) getFieldValue(tarBuffer3BufferInStream, "java.util.jar.JarInputStream", "mev"));
        JarEntry tarBuffer3BufferInStreamBufferInStreamMevBufferInStreamMevEntry = ((JarEntry) getFieldValue(tarBuffer3BufferInStreamBufferInStreamMev, "sun.security.util.ManifestEntryVerifier", "entry"));
        java.security.CodeSigner[] finalTarArchiveInputStreamBufferInStreamMevEntrySigners = ((java.security.CodeSigner[]) getFieldValue(tarBuffer3BufferInStreamBufferInStreamMevBufferInStreamMevEntry, "java.util.jar.JarEntry", "signers"));
        TarBuffer tarBuffer4 = tarArchiveInputStream.buffer;
        int finalTarArchiveInputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer4, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        TarArchiveEntry finalTarArchiveInputStreamCurrEntry = ((TarArchiveEntry) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry"));
        
        assertFalse(initialTarArchiveInputStreamBufferInStreamMevEntryCerts == finalTarArchiveInputStreamBufferInStreamMevEntryCerts);
        
        assertFalse(initialTarArchiveInputStreamBufferInStreamMevEntrySigners == finalTarArchiveInputStreamBufferInStreamMevEntrySigners);
        
        assertTrue(finalTarArchiveInputStreamHasHitEOF);
        
        assertEquals(0, finalTarArchiveInputStreamBufferCurrRecIdx);
        
        assertNull(finalTarArchiveInputStreamCurrEntry);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readGNUSparse()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readGNUSparse()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: byte[] headerBuf = getRecord();
 *  */
    @Test
    public void testReadGNUSparse_ThrowNegativeArraySizeException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        XZCompressorInputStream inStream = ((XZCompressorInputStream) createInstance("org.apache.commons.compress.compressors.xz.XZCompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -256);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 256);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGNUSparse] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:201)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGNUSparse(TarArchiveInputStream.java:380) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGNUSparse");
        readGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readGNUSparseMethodArguments = new java.lang.Object[0];
        try {
            readGNUSparseMethod.invoke(tarArchiveInputStream, readGNUSparseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readGNUSparse()}
 * @utbot.executesCondition {@code (hasHitEOF): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: entry = new TarArchiveSparseEntry(headerBuf);
 *  */
    @Test
    public void testReadGNUSparse_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        XZCompressorInputStream inStream = ((XZCompressorInputStream) createInstance("org.apache.commons.compress.compressors.xz.XZCompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) -127};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 1);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGNUSparse] produces [java.lang.ArrayIndexOutOfBoundsException: Index 504 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(TarUtils.java:156)
            org.apache.commons.compress.archivers.tar.TarArchiveSparseEntry.<init>(TarArchiveSparseEntry.java:57)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGNUSparse(TarArchiveInputStream.java:385) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGNUSparse");
        readGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readGNUSparseMethodArguments = new java.lang.Object[0];
        try {
            readGNUSparseMethod.invoke(tarArchiveInputStream, readGNUSparseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readGNUSparse()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: byte[] headerBuf = getRecord();
 *  */
    @Test
    public void testReadGNUSparse_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        XZCompressorInputStream inStream = ((XZCompressorInputStream) createInstance("org.apache.commons.compress.compressors.xz.XZCompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currBlkIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGNUSparse] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:203)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGNUSparse(TarArchiveInputStream.java:380) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGNUSparse");
        readGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readGNUSparseMethodArguments = new java.lang.Object[0];
        try {
            readGNUSparseMethod.invoke(tarArchiveInputStream, readGNUSparseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readGNUSparse()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} 
 *  */
    @Test
    public void testReadGNUSparse_ThrowArithmeticException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(inStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        Hashtable sigFileSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(sigFileSigners, "java.util.Hashtable", "table", table);
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
        setField(inStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        String name = "";
        setField(mev, "sun.security.util.ManifestEntryVerifier", "name", name);
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(inStream, "java.util.jar.JarInputStream", "mev", mev);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -254);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -254);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGNUSparse] produces [java.lang.ArithmeticException: / by zero] */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGNUSparse");
        readGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readGNUSparseMethodArguments = new java.lang.Object[0];
        try {
            readGNUSparseMethod.invoke(tarArchiveInputStream, readGNUSparseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readGNUSparse()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testReadGNUSparse_ThrowClassCastException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(inStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties sigFileSigners = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        Object object = createInstance("java.lang.Object");
        map.put(null, object);
        setField(sigFileSigners, "java.util.Properties", "map", map);
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
        setField(inStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(inStream, "java.util.jar.JarInputStream", "mev", mev);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -254);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -254);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGNUSparse] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.security.CodeSigner[]] */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGNUSparse");
        readGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readGNUSparseMethodArguments = new java.lang.Object[0];
        try {
            readGNUSparseMethod.invoke(tarArchiveInputStream, readGNUSparseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readGNUSparse()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: currEntry.isExtended()
 *  */
    @Test
    public void testReadGNUSparse_ThrowNullPointerException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGNUSparse] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGNUSparse(TarArchiveInputStream.java:377) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGNUSparse");
        readGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readGNUSparseMethodArguments = new java.lang.Object[0];
        try {
            readGNUSparseMethod.invoke(tarArchiveInputStream, readGNUSparseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readGNUSparse()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte[] headerBuf = getRecord();
 *  */
    @Test
    public void testReadGNUSparse_ThrowNullPointerException_1() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGNUSparse] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGNUSparse(TarArchiveInputStream.java:380) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGNUSparse");
        readGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readGNUSparseMethodArguments = new java.lang.Object[0];
        try {
            readGNUSparseMethod.invoke(tarArchiveInputStream, readGNUSparseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readGNUSparse()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte[] headerBuf = getRecord();
 *  */
    @Test
    public void testReadGNUSparse_ThrowNullPointerException_2() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        XZCompressorInputStream inStream = ((XZCompressorInputStream) createInstance("org.apache.commons.compress.compressors.xz.XZCompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 256);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGNUSparse] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:203)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGNUSparse(TarArchiveInputStream.java:380) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGNUSparse");
        readGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readGNUSparseMethodArguments = new java.lang.Object[0];
        try {
            readGNUSparseMethod.invoke(tarArchiveInputStream, readGNUSparseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readGNUSparse()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readGNUSparse()}
 * @utbot.throwsException {@link java.io.IOException} in: byte[] headerBuf = getRecord();
 *  */
    @Test(expected = IOException.class)
    public void testReadGNUSparse_ThrowIOException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        XZOutputStream outStream = ((XZOutputStream) createInstance("org.tukaani.xz.XZOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGNUSparse");
        readGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readGNUSparseMethodArguments = new java.lang.Object[0];
        try {
            readGNUSparseMethod.invoke(tarArchiveInputStream, readGNUSparseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readGNUSparse()}
 * @utbot.throwsException {@link java.io.IOException} in: byte[] headerBuf = getRecord();
 *  */
    @Test(expected = IOException.class)
    public void testReadGNUSparse_ThrowIOException_1() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGNUSparse");
        readGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readGNUSparseMethodArguments = new java.lang.Object[0];
        try {
            readGNUSparseMethod.invoke(tarArchiveInputStream, readGNUSparseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readGNUSparse()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadGNUSparse_ThrowIOException_2() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(inStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(inStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        InflaterInputStream in = ((InflaterInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipFile$1"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(inStream, "java.io.FilterInputStream", "in", in);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) 0, (byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -254);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 2);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -254);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGNUSparse");
        readGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readGNUSparseMethodArguments = new java.lang.Object[0];
        try {
            readGNUSparseMethod.invoke(tarArchiveInputStream, readGNUSparseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readGNUSparse()}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: byte[] headerBuf = getRecord();
 *  */
    @Test(expected = ZipException.class)
    public void testReadGNUSparse_ThrowZipException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(inStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(inStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(inStream, "java.io.FilterInputStream", "in", in);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -254);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -254);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGNUSparse");
        readGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readGNUSparseMethodArguments = new java.lang.Object[0];
        try {
            readGNUSparseMethod.invoke(tarArchiveInputStream, readGNUSparseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readGNUSparse()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readGNUSparse()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: byte[] headerBuf = getRecord();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadGNUSparse_ThrowIndexOutOfBoundsException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        InflaterInputStream inStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGNUSparse");
        readGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readGNUSparseMethodArguments = new java.lang.Object[0];
        try {
            readGNUSparseMethod.invoke(tarArchiveInputStream, readGNUSparseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readGNUSparse()}
 * @utbot.throwsException {@link java.lang.SecurityException} 
 *  */
    @Test(expected = SecurityException.class)
    public void testReadGNUSparse_ThrowSecurityException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(inStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", verifiedSigners);
        setField(inStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(inStream, "java.util.jar.JarInputStream", "mev", mev);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -254);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -254);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGNUSparse");
        readGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readGNUSparseMethodArguments = new java.lang.Object[0];
        try {
            readGNUSparseMethod.invoke(tarArchiveInputStream, readGNUSparseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readGNUSparse
    
    public void testReadGNUSparse_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNextTarEntry()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getNextTarEntry()}
 * @utbot.executesCondition {@code (hasHitEOF): True}
 *  */
    @Test
    public void testGetNextTarEntry_HasHitEOF() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF", true);
        
        TarArchiveEntry actual = tarArchiveInputStream.getNextTarEntry();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getNextTarEntry()}
 * @utbot.executesCondition {@code (hasHitEOF): False}
 * @utbot.executesCondition {@code (currEntry != null): False}
 * @utbot.executesCondition {@code (hasHitEOF): True}
 *  */
    @Test
    public void testGetNextTarEntry_HasHitEOF_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Pack200CompressorInputStream inStream = ((Pack200CompressorInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 256);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        TarArchiveEntry actual = tarArchiveInputStream.getNextTarEntry();
        
        assertNull(actual);
        
        boolean finalTarArchiveInputStreamHasHitEOF = ((Boolean) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        int finalTarArchiveInputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        
        assertTrue(finalTarArchiveInputStreamHasHitEOF);
        
        assertEquals(256, finalTarArchiveInputStreamBufferCurrRecIdx);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getNextTarEntry()}
 * @utbot.executesCondition {@code (hasHitEOF): False}
 * @utbot.executesCondition {@code (currEntry != null): False}
 * @utbot.executesCondition {@code (hasHitEOF): True}
 *  */
    @Test
    public void testGetNextTarEntry_HasHitEOF_2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Pack200CompressorInputStream inStream = ((Pack200CompressorInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 1);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        TarArchiveEntry actual = tarArchiveInputStream.getNextTarEntry();
        
        assertNull(actual);
        
        boolean finalTarArchiveInputStreamHasHitEOF = ((Boolean) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        int finalTarArchiveInputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        
        assertTrue(finalTarArchiveInputStreamHasHitEOF);
        
        assertEquals(1, finalTarArchiveInputStreamBufferCurrRecIdx);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNextTarEntry()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getNextTarEntry()}
 * @utbot.executesCondition {@code (currEntry != null): True}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: byte[] headerBuf = getRecord();
 *  */
    @Test
    public void testGetNextTarEntry_ThrowNegativeArraySizeException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -243L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -243L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Pack200CompressorInputStream inStream = ((Pack200CompressorInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1073741823);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", Integer.MIN_VALUE);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 1073741824);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:201)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:191) */
        tarArchiveInputStream.getNextTarEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getNextTarEntry()}
 * @utbot.executesCondition {@code (currEntry != null): True}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: byte[] headerBuf = getRecord();
 *  */
    @Test
    public void testGetNextTarEntry_ThrowNegativeArraySizeException_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -255L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -255L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Pack200CompressorInputStream inStream = ((Pack200CompressorInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 6);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", Integer.MIN_VALUE);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 6);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:201)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:191) */
        tarArchiveInputStream.getNextTarEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getNextTarEntry()}
 * @utbot.executesCondition {@code (currEntry != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte[] headerBuf = getRecord();
 *  */
    @Test
    public void testGetNextTarEntry_ThrowNullPointerException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:191) */
        tarArchiveInputStream.getNextTarEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getNextTarEntry()}
 * @utbot.executesCondition {@code (currEntry != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte[] headerBuf = getRecord();
 *  */
    @Test
    public void testGetNextTarEntry_ThrowNullPointerException_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -99L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -99L);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:191) */
        tarArchiveInputStream.getNextTarEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method getNextTarEntry()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getNextTarEntry()}
 * @utbot.executesCondition {@code (currEntry != null): False}
 * @utbot.throwsException {@link java.io.IOException} in: byte[] headerBuf = getRecord();
 *  */
    @Test(expected = IOException.class)
    public void testGetNextTarEntry_ThrowIOException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object outStream = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.getNextTarEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getNextTarEntry()}
 * @utbot.executesCondition {@code (currEntry != null): True}
 * @utbot.throwsException {@link java.io.IOException} in: byte[] headerBuf = getRecord();
 *  */
    @Test(expected = IOException.class)
    public void testGetNextTarEntry_ThrowIOException_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -2L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -2L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        tarArchiveInputStream.getNextTarEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getNextTarEntry()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getNextTarEntry()}
 * @utbot.executesCondition {@code (hasHitEOF): False}
 * @utbot.executesCondition {@code (currEntry != null): True}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecord()
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: byte[] headerBuf = getRecord();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNextTarEntry_ThrowIndexOutOfBoundsException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 0L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", 0L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        InflaterInputStream inStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 16);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 16);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        tarArchiveInputStream.getNextTarEntry();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getNextTarEntry()
    
    @Test
    public void testGetNextTarEntry1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -9223371691109908480L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -3L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Pack200CompressorInputStream inStream = ((Pack200CompressorInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = new byte[40];
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -2147483647);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -2147483647);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        TarArchiveEntry actual = tarArchiveInputStream.getNextTarEntry();
        
        assertNull(actual);
        
        boolean finalTarArchiveInputStreamHasHitEOF = ((Boolean) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        int finalTarArchiveInputStreamBufferCurrBlkIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currBlkIdx"));
        TarBuffer tarBuffer1 = tarArchiveInputStream.buffer;
        int finalTarArchiveInputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer1, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        TarArchiveEntry finalTarArchiveInputStreamCurrEntry = ((TarArchiveEntry) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry"));
        
        assertTrue(finalTarArchiveInputStreamHasHitEOF);
        
        assertEquals(1, finalTarArchiveInputStreamBufferCurrBlkIdx);
        
        assertEquals(1, finalTarArchiveInputStreamBufferCurrRecIdx);
        
        assertNull(finalTarArchiveInputStreamCurrEntry);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getNextTarEntry()
    
    @Test
    public void testGetNextTarEntry2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Pack200CompressorInputStream inStream = ((Pack200CompressorInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = new byte[40];
        blockBuffer[0] = java.lang.Byte.MIN_VALUE;
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1024);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 1);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1024 out of bounds for byte[40]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:203)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:191) */
        tarArchiveInputStream.getNextTarEntry();
    }
    
    @Test
    public void testGetNextTarEntry3() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 396898417989713924L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", 6773413839565225984L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        DataInputStream inStream = ((DataInputStream) createInstance("java.io.DataInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = new byte[40];
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -2140751723);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 319);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 6731928);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 746 out of bounds for byte[40]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:203)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:191) */
        tarArchiveInputStream.getNextTarEntry();
    }
    
    @Test
    public void testGetNextTarEntry4() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Pack200CompressorInputStream inStream = ((Pack200CompressorInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 1);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:203)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:191) */
        tarArchiveInputStream.getNextTarEntry();
    }
    
    @Test
    public void testGetNextTarEntry5() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Pack200CompressorInputStream inStream = ((Pack200CompressorInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -2147483647);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -2147483647);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:203)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:191) */
        tarArchiveInputStream.getNextTarEntry();
    }
    
    @Test
    public void testGetNextTarEntry6() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -8646910938806484992L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -2849934139195395L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Pack200CompressorInputStream inStream = ((Pack200CompressorInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 1);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:203)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:191) */
        tarArchiveInputStream.getNextTarEntry();
    }
    
    @Test
    public void testGetNextTarEntry7() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -2017612630109192192L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -481036337159L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object inStream = createInstance("java.net.SocketInputStream");
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -2147483647);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -2147483647);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:203)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:191) */
        tarArchiveInputStream.getNextTarEntry();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getNextTarEntry()
    
    @Test(expected = IOException.class)
    public void testGetNextTarEntry8() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -9223372036854775805L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -399835136L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        BufferedOutputStream outStream = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        tarArchiveInputStream.getNextTarEntry();
    }
    
    @Test(expected = IOException.class)
    public void testGetNextTarEntry9() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.getNextTarEntry();
    }
    ///endregion
    
    ///region Errors report for getNextTarEntry
    
    public void testGetNextTarEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNextEntry()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getNextEntry()}
 * @utbot.returnsFrom {@code return getNextTarEntry();}
 *  */
    @Test
    public void testGetNextEntry_ReturnGetNextTarEntry() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF", true);
        
        ArchiveEntry actual = tarArchiveInputStream.getNextEntry();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getNextEntry()}
 * @utbot.returnsFrom {@code return getNextTarEntry();}
 *  */
    @Test
    public void testGetNextEntry_ReturnGetNextTarEntry_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 10L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", 10L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Pack200CompressorInputStream inStream = ((Pack200CompressorInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1073741823);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 1073741824);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        ArchiveEntry actual = tarArchiveInputStream.getNextEntry();
        
        assertNull(actual);
        
        boolean finalTarArchiveInputStreamHasHitEOF = ((Boolean) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        int finalTarArchiveInputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        TarArchiveEntry finalTarArchiveInputStreamCurrEntry = ((TarArchiveEntry) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry"));
        
        assertTrue(finalTarArchiveInputStreamHasHitEOF);
        
        assertEquals(1073741824, finalTarArchiveInputStreamBufferCurrRecIdx);
        
        assertNull(finalTarArchiveInputStreamCurrEntry);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getNextEntry()}
 * @utbot.returnsFrom {@code return getNextTarEntry();}
 *  */
    @Test
    public void testGetNextEntry_ReturnGetNextTarEntry_2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -238L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -238L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Pack200CompressorInputStream inStream = ((Pack200CompressorInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 1);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        ArchiveEntry actual = tarArchiveInputStream.getNextEntry();
        
        assertNull(actual);
        
        boolean finalTarArchiveInputStreamHasHitEOF = ((Boolean) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        int finalTarArchiveInputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        TarArchiveEntry finalTarArchiveInputStreamCurrEntry = ((TarArchiveEntry) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry"));
        
        assertTrue(finalTarArchiveInputStreamHasHitEOF);
        
        assertEquals(1, finalTarArchiveInputStreamBufferCurrRecIdx);
        
        assertNull(finalTarArchiveInputStreamCurrEntry);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNextEntry()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return getNextTarEntry();
 *  */
    @Test
    public void testGetNextEntry_ThrowNegativeArraySizeException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Pack200CompressorInputStream inStream = ((Pack200CompressorInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -256);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 256);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:201)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:191)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:395) */
        tarArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getNextTarEntry();
 *  */
    @Test
    public void testGetNextEntry_ThrowNullPointerException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:191)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:395) */
        tarArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getNextTarEntry();
 *  */
    @Test
    public void testGetNextEntry_ThrowNullPointerException_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -99L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -99L);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:191)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:395) */
        tarArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getNextTarEntry();
 *  */
    @Test
    public void testGetNextEntry_ThrowNullPointerException_2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -251L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -251L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Pack200CompressorInputStream inStream = ((Pack200CompressorInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1073741823);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 1073741824);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:203)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:191)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:395) */
        tarArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getNextTarEntry();
 *  */
    @Test
    public void testGetNextEntry_ThrowNullPointerException_3() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -4L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -4L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Pack200CompressorInputStream inStream = ((Pack200CompressorInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:203)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:191)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:395) */
        tarArchiveInputStream.getNextEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method getNextEntry()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.io.IOException} in: return getNextTarEntry();
 *  */
    @Test(expected = IOException.class)
    public void testGetNextEntry_ThrowIOException_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        XZOutputStream outStream = ((XZOutputStream) createInstance("org.tukaani.xz.XZOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testGetNextEntry_ThrowIOException_2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        InflaterInputStream inStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(inStream, "java.util.zip.InflaterInputStream", "closed", true);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.io.IOException} in: return getNextTarEntry();
 *  */
    @Test(expected = IOException.class)
    public void testGetNextEntry_ThrowIOException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        tarArchiveInputStream.getNextEntry();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getNextEntry()
    
    @Test
    public void testGetNextEntry1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object inStream = createInstance("java.net.SocketInputStream");
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = new byte[40];
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -2147483647);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 2);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -2147483647);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        ArchiveEntry actual = tarArchiveInputStream.getNextEntry();
        
        assertNull(actual);
        
        boolean finalTarArchiveInputStreamHasHitEOF = ((Boolean) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        int finalTarArchiveInputStreamBufferCurrBlkIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currBlkIdx"));
        TarBuffer tarBuffer1 = tarArchiveInputStream.buffer;
        int finalTarArchiveInputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer1, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        
        assertTrue(finalTarArchiveInputStreamHasHitEOF);
        
        assertEquals(1, finalTarArchiveInputStreamBufferCurrBlkIdx);
        
        assertEquals(1, finalTarArchiveInputStreamBufferCurrRecIdx);
    }
    
    @Test
    public void testGetNextEntry2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -9223371691109908480L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -3L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Pack200CompressorInputStream inStream = ((Pack200CompressorInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = new byte[40];
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -2147483647);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -2147483647);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        ArchiveEntry actual = tarArchiveInputStream.getNextEntry();
        
        assertNull(actual);
        
        boolean finalTarArchiveInputStreamHasHitEOF = ((Boolean) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        int finalTarArchiveInputStreamBufferCurrBlkIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currBlkIdx"));
        TarBuffer tarBuffer1 = tarArchiveInputStream.buffer;
        int finalTarArchiveInputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer1, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        TarArchiveEntry finalTarArchiveInputStreamCurrEntry = ((TarArchiveEntry) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry"));
        
        assertTrue(finalTarArchiveInputStreamHasHitEOF);
        
        assertEquals(1, finalTarArchiveInputStreamBufferCurrBlkIdx);
        
        assertEquals(1, finalTarArchiveInputStreamBufferCurrRecIdx);
        
        assertNull(finalTarArchiveInputStreamCurrEntry);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getNextEntry()
    
    @Test
    public void testGetNextEntry3() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Pack200CompressorInputStream inStream = ((Pack200CompressorInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -2147483647);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", Integer.MIN_VALUE);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -2147483647);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:201)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:191)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:395) */
        tarArchiveInputStream.getNextEntry();
    }
    
    @Test
    public void testGetNextEntry4() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Pack200CompressorInputStream inStream = ((Pack200CompressorInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = new byte[40];
        blockBuffer[1] = (byte) 1;
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 511);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 1);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 511 out of bounds for byte[40]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:203)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:191)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:395) */
        tarArchiveInputStream.getNextEntry();
    }
    
    @Test
    public void testGetNextEntry5() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Pack200CompressorInputStream inStream = ((Pack200CompressorInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) 0, (byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -2147483647);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 3);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -2147483647);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 3 out of bounds for byte[2]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:203)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:191)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:395) */
        tarArchiveInputStream.getNextEntry();
    }
    
    @Test
    public void testGetNextEntry6() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -9223371691109908480L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -1236801047666622467L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Pack200CompressorInputStream inStream = ((Pack200CompressorInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -2147483647);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", Integer.MIN_VALUE);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -2147483647);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:201)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:191)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:395) */
        tarArchiveInputStream.getNextEntry();
    }
    
    @Test
    public void testGetNextEntry7() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -9187343237688328192L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -18139467957141507L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Pack200CompressorInputStream inStream = ((Pack200CompressorInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", Integer.MIN_VALUE);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 1);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:201)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:191)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:395) */
        tarArchiveInputStream.getNextEntry();
    }
    
    @Test
    public void testGetNextEntry8() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", java.lang.Long.MIN_VALUE);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", java.lang.Long.MIN_VALUE);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        FileInputStream inStream = ((FileInputStream) createInstance("org.apache.commons.compress.compressors.pack200.TempFileCachingStreamBridge$1"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = new byte[40];
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1113231454);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 571);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 1146916959);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 997 out of bounds for byte[40]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:203)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:191)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:395) */
        tarArchiveInputStream.getNextEntry();
    }
    
    @Test
    public void testGetNextEntry9() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -9223371691109908480L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -3L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Pack200CompressorInputStream inStream = ((Pack200CompressorInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) 0, (byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -2147483647);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 3);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -2147483647);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 3 out of bounds for byte[2]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:203)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:191)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:395) */
        tarArchiveInputStream.getNextEntry();
    }
    
    @Test
    public void testGetNextEntry10() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Pack200CompressorInputStream inStream = ((Pack200CompressorInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -2147483647);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -2147483647);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:203)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:191)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:395) */
        tarArchiveInputStream.getNextEntry();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getNextEntry()
    
    @Test(expected = IOException.class)
    public void testGetNextEntry11() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", java.lang.Long.MIN_VALUE);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -3L);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        tarArchiveInputStream.getNextEntry();
    }
    ///endregion
    
    ///region Errors report for getNextEntry
    
    public void testGetNextEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.paxHeaders
    
    ///region Errors report for paxHeaders
    
    public void testPaxHeaders_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRecord()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecord()}
 * @utbot.executesCondition {@code (hasHitEOF): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetRecord_HasHitEOF() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF", true);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method getRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("getRecord");
        getRecordMethod.setAccessible(true);
        java.lang.Object[] getRecordMethodArguments = new java.lang.Object[0];
        byte[] actual = ((byte[]) getRecordMethod.invoke(tarArchiveInputStream, getRecordMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecord()}
 * @utbot.executesCondition {@code (hasHitEOF): False}
 * @utbot.executesCondition {@code (hasHitEOF): False}
 * @utbot.returnsFrom {@code return hasHitEOF ? null : headerBuf;}
 *  */
    @Test
    public void testGetRecord_NotHasHitEOF() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GzipCompressorInputStream inStream = ((GzipCompressorInputStream) createInstance("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) -127};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 1);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method getRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("getRecord");
        getRecordMethod.setAccessible(true);
        java.lang.Object[] getRecordMethodArguments = new java.lang.Object[0];
        byte[] actual = ((byte[]) getRecordMethod.invoke(tarArchiveInputStream, getRecordMethodArguments));
        
        byte[] expected = {(byte) -127};
        
        assertArrayEquals(expected, actual);
        
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        int finalTarArchiveInputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        
        assertEquals(1, finalTarArchiveInputStreamBufferCurrRecIdx);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecord()}
 * @utbot.executesCondition {@code (hasHitEOF): False}
 * @utbot.executesCondition {@code (hasHitEOF): True}
 * @utbot.returnsFrom {@code return hasHitEOF ? null : headerBuf;}
 *  */
    @Test
    public void testGetRecord_HasHitEOF_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GzipCompressorInputStream inStream = ((GzipCompressorInputStream) createInstance("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 256);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method getRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("getRecord");
        getRecordMethod.setAccessible(true);
        java.lang.Object[] getRecordMethodArguments = new java.lang.Object[0];
        byte[] actual = ((byte[]) getRecordMethod.invoke(tarArchiveInputStream, getRecordMethodArguments));
        
        assertNull(actual);
        
        boolean finalTarArchiveInputStreamHasHitEOF = ((Boolean) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        int finalTarArchiveInputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        
        assertTrue(finalTarArchiveInputStreamHasHitEOF);
        
        assertEquals(256, finalTarArchiveInputStreamBufferCurrRecIdx);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecord()}
 * @utbot.executesCondition {@code (hasHitEOF): False}
 * @utbot.executesCondition {@code (hasHitEOF): True}
 * @utbot.returnsFrom {@code return hasHitEOF ? null : headerBuf;}
 *  */
    @Test
    public void testGetRecord_HasHitEOF_2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GzipCompressorInputStream inStream = ((GzipCompressorInputStream) createInstance("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 1);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method getRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("getRecord");
        getRecordMethod.setAccessible(true);
        java.lang.Object[] getRecordMethodArguments = new java.lang.Object[0];
        byte[] actual = ((byte[]) getRecordMethod.invoke(tarArchiveInputStream, getRecordMethodArguments));
        
        assertNull(actual);
        
        boolean finalTarArchiveInputStreamHasHitEOF = ((Boolean) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        int finalTarArchiveInputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        
        assertTrue(finalTarArchiveInputStreamHasHitEOF);
        
        assertEquals(1, finalTarArchiveInputStreamBufferCurrRecIdx);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecord()}
 * @utbot.executesCondition {@code (hasHitEOF): False}
 * @utbot.executesCondition {@code (hasHitEOF): True}
 * @utbot.returnsFrom {@code return hasHitEOF ? null : headerBuf;}
 *  */
    @Test
    public void testGetRecord_HasHitEOF_3() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(inStream, "java.util.jar.JarInputStream", "first", first);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method getRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("getRecord");
        getRecordMethod.setAccessible(true);
        java.lang.Object[] getRecordMethodArguments = new java.lang.Object[0];
        byte[] actual = ((byte[]) getRecordMethod.invoke(tarArchiveInputStream, getRecordMethodArguments));
        
        assertNull(actual);
        
        boolean finalTarArchiveInputStreamHasHitEOF = ((Boolean) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        int finalTarArchiveInputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        
        assertTrue(finalTarArchiveInputStreamHasHitEOF);
        
        assertEquals(0, finalTarArchiveInputStreamBufferCurrRecIdx);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecord()}
 * @utbot.executesCondition {@code (hasHitEOF): False}
 * @utbot.executesCondition {@code (hasHitEOF): True}
 * @utbot.returnsFrom {@code return hasHitEOF ? null : headerBuf;}
 *  */
    @Test
    public void testGetRecord_HasHitEOF_4() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(inStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(inStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(inStream, "java.util.jar.JarInputStream", "mev", mev);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -254);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -254);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method getRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("getRecord");
        getRecordMethod.setAccessible(true);
        java.lang.Object[] getRecordMethodArguments = new java.lang.Object[0];
        byte[] actual = ((byte[]) getRecordMethod.invoke(tarArchiveInputStream, getRecordMethodArguments));
        
        assertNull(actual);
        
        boolean finalTarArchiveInputStreamHasHitEOF = ((Boolean) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        int finalTarArchiveInputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        
        assertTrue(finalTarArchiveInputStreamHasHitEOF);
        
        assertEquals(0, finalTarArchiveInputStreamBufferCurrRecIdx);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecord()}
 * @utbot.executesCondition {@code (hasHitEOF): False}
 * @utbot.executesCondition {@code (hasHitEOF): True}
 * @utbot.returnsFrom {@code return hasHitEOF ? null : headerBuf;}
 *  */
    @Test
    public void testGetRecord_HasHitEOF_5() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(inStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(inStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(inStream, "java.util.jar.JarInputStream", "mev", mev);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -254);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -254);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method getRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("getRecord");
        getRecordMethod.setAccessible(true);
        java.lang.Object[] getRecordMethodArguments = new java.lang.Object[0];
        byte[] actual = ((byte[]) getRecordMethod.invoke(tarArchiveInputStream, getRecordMethodArguments));
        
        assertNull(actual);
        
        boolean finalTarArchiveInputStreamHasHitEOF = ((Boolean) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        TarBuffer tarBuffer = tarArchiveInputStream.buffer;
        int finalTarArchiveInputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        
        assertTrue(finalTarArchiveInputStreamHasHitEOF);
        
        assertEquals(0, finalTarArchiveInputStreamBufferCurrRecIdx);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRecord()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecord()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: byte[] headerBuf = buffer.readRecord();
 *  */
    @Test
    public void testGetRecord_ThrowNegativeArraySizeException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GzipCompressorInputStream inStream = ((GzipCompressorInputStream) createInstance("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -256);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 256);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:201)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method getRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("getRecord");
        getRecordMethod.setAccessible(true);
        java.lang.Object[] getRecordMethodArguments = new java.lang.Object[0];
        try {
            getRecordMethod.invoke(tarArchiveInputStream, getRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecord()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: byte[] headerBuf = buffer.readRecord();
 *  */
    @Test
    public void testGetRecord_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GzipCompressorInputStream inStream = ((GzipCompressorInputStream) createInstance("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) -127};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:203)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method getRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("getRecord");
        getRecordMethod.setAccessible(true);
        java.lang.Object[] getRecordMethodArguments = new java.lang.Object[0];
        try {
            getRecordMethod.invoke(tarArchiveInputStream, getRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecord()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} 
 *  */
    @Test
    public void testGetRecord_ThrowArithmeticException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(inStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        Hashtable sigFileSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(sigFileSigners, "java.util.Hashtable", "table", table);
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
        setField(inStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        digests.add(null);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        String name = "";
        setField(mev, "sun.security.util.ManifestEntryVerifier", "name", name);
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(inStream, "java.util.jar.JarInputStream", "mev", mev);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) 0, (byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -252);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -252);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord] produces [java.lang.ArithmeticException: / by zero] */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method getRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("getRecord");
        getRecordMethod.setAccessible(true);
        java.lang.Object[] getRecordMethodArguments = new java.lang.Object[0];
        try {
            getRecordMethod.invoke(tarArchiveInputStream, getRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecord()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte[] headerBuf = buffer.readRecord();
 *  */
    @Test
    public void testGetRecord_ThrowNullPointerException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method getRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("getRecord");
        getRecordMethod.setAccessible(true);
        java.lang.Object[] getRecordMethodArguments = new java.lang.Object[0];
        try {
            getRecordMethod.invoke(tarArchiveInputStream, getRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecord()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte[] headerBuf = buffer.readRecord();
 *  */
    @Test
    public void testGetRecord_ThrowNullPointerException_1() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ByteArrayInputStream inStream = ((ByteArrayInputStream) createInstance("java.io.ByteArrayInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currBlkIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.readRecord(TarBuffer.java:203)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:257) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method getRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("getRecord");
        getRecordMethod.setAccessible(true);
        java.lang.Object[] getRecordMethodArguments = new java.lang.Object[0];
        try {
            getRecordMethod.invoke(tarArchiveInputStream, getRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method getRecord()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecord()}
 * @utbot.throwsException {@link java.io.IOException} in: byte[] headerBuf = buffer.readRecord();
 *  */
    @Test(expected = IOException.class)
    public void testGetRecord_ThrowIOException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object outStream = createInstance("org.tukaani.xz.UncompressedLZMA2OutputStream");
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method getRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("getRecord");
        getRecordMethod.setAccessible(true);
        java.lang.Object[] getRecordMethodArguments = new java.lang.Object[0];
        try {
            getRecordMethod.invoke(tarArchiveInputStream, getRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecord()}
 * @utbot.throwsException {@link java.io.IOException} in: byte[] headerBuf = buffer.readRecord();
 *  */
    @Test(expected = IOException.class)
    public void testGetRecord_ThrowIOException_1() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method getRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("getRecord");
        getRecordMethod.setAccessible(true);
        java.lang.Object[] getRecordMethodArguments = new java.lang.Object[0];
        try {
            getRecordMethod.invoke(tarArchiveInputStream, getRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecord()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testGetRecord_ThrowIOException_2() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(inStream, "java.util.zip.ZipInputStream", "closed", true);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method getRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("getRecord");
        getRecordMethod.setAccessible(true);
        java.lang.Object[] getRecordMethodArguments = new java.lang.Object[0];
        try {
            getRecordMethod.invoke(tarArchiveInputStream, getRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecord()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testGetRecord_ThrowIOException_3() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(inStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(inStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(inStream, "java.io.FilterInputStream", "in", in);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method getRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("getRecord");
        getRecordMethod.setAccessible(true);
        java.lang.Object[] getRecordMethodArguments = new java.lang.Object[0];
        try {
            getRecordMethod.invoke(tarArchiveInputStream, getRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecord()}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testGetRecord_ThrowZipException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(inStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(inStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(inStream, "java.io.FilterInputStream", "in", in);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method getRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("getRecord");
        getRecordMethod.setAccessible(true);
        java.lang.Object[] getRecordMethodArguments = new java.lang.Object[0];
        try {
            getRecordMethod.invoke(tarArchiveInputStream, getRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRecord()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecord()}
 * @utbot.throwsException {@link java.lang.SecurityException} 
 *  */
    @Test(expected = SecurityException.class)
    public void testGetRecord_ThrowSecurityException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarInputStream inStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(inStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties sigFileSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
        setField(inStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(inStream, "java.util.jar.JarInputStream", "mev", mev);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -247);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -247);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method getRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("getRecord");
        getRecordMethod.setAccessible(true);
        java.lang.Object[] getRecordMethodArguments = new java.lang.Object[0];
        try {
            getRecordMethod.invoke(tarArchiveInputStream, getRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecord()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte[] headerBuf = buffer.readRecord();
 *  */
    @Test(expected = NullPointerException.class)
    public void testGetRecord_ThrowNullPointerException_2() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        InflaterInputStream inStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "buffer", buffer);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method getRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("getRecord");
        getRecordMethod.setAccessible(true);
        java.lang.Object[] getRecordMethodArguments = new java.lang.Object[0];
        try {
            getRecordMethod.invoke(tarArchiveInputStream, getRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getRecord
    
    public void testGetRecord_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isAtEOF
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isAtEOF()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#isAtEOF()}
 * @utbot.returnsFrom {@code return hasHitEOF;}
 *  */
    @Test
    public void testIsAtEOF_ReturnHasHitEOF() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        boolean actual = tarArchiveInputStream.isAtEOF();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getCurrentEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentEntry()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getCurrentEntry()}
 * @utbot.returnsFrom {@code return currEntry;}
 *  */
    @Test
    public void testGetCurrentEntry_ReturnCurrEntry() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        TarArchiveEntry actual = tarArchiveInputStream.getCurrentEntry();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.setAtEOF
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setAtEOF(boolean)
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#setAtEOF(boolean)}
 *  */
    @Test
    public void testSetAtEOF() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        tarArchiveInputStream.setAtEOF(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.setCurrentEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCurrentEntry(org.apache.commons.compress.archivers.tar.TarArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#setCurrentEntry(org.apache.commons.compress.archivers.tar.TarArchiveEntry)}
 *  */
    @Test
    public void testSetCurrentEntry() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        tarArchiveInputStream.setCurrentEntry(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.applyPaxHeadersToCurrentEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method applyPaxHeadersToCurrentEntry(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#applyPaxHeadersToCurrentEntry(java.util.Map)}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 *  */
    @Test
    public void testApplyPaxHeadersToCurrentEntry_SetIterator() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Method applyPaxHeadersToCurrentEntryMethod = tarArchiveInputStreamClazz.getDeclaredMethod("applyPaxHeadersToCurrentEntry", linkedHashMapType);
        applyPaxHeadersToCurrentEntryMethod.setAccessible(true);
        java.lang.Object[] applyPaxHeadersToCurrentEntryMethodArguments = new java.lang.Object[1];
        applyPaxHeadersToCurrentEntryMethodArguments[0] = linkedHashMap;
        applyPaxHeadersToCurrentEntryMethod.invoke(tarArchiveInputStream, applyPaxHeadersToCurrentEntryMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method applyPaxHeadersToCurrentEntry(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#applyPaxHeadersToCurrentEntry(java.util.Map)}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Entry<String, String> ent: headers.entrySet())
 *  */
    @Test
    public void testApplyPaxHeadersToCurrentEntry_ThrowNullPointerException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.applyPaxHeadersToCurrentEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.applyPaxHeadersToCurrentEntry(TarArchiveInputStream.java:343) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class mapType = Class.forName("java.util.Map");
        Method applyPaxHeadersToCurrentEntryMethod = tarArchiveInputStreamClazz.getDeclaredMethod("applyPaxHeadersToCurrentEntry", mapType);
        applyPaxHeadersToCurrentEntryMethod.setAccessible(true);
        java.lang.Object[] applyPaxHeadersToCurrentEntryMethodArguments = new java.lang.Object[1];
        applyPaxHeadersToCurrentEntryMethodArguments[0] = ((Object) null);
        try {
            applyPaxHeadersToCurrentEntryMethod.invoke(tarArchiveInputStream, applyPaxHeadersToCurrentEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#applyPaxHeadersToCurrentEntry(java.util.Map)}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.iterates iterate the loop {@code for(Entry<String, String> ent: headers.entrySet())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: currEntry.setName(val);
 *  */
    @Test
    public void testApplyPaxHeadersToCurrentEntry_ThrowNullPointerException_1() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "path";
        linkedHashMap.put(string, null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.applyPaxHeadersToCurrentEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.applyPaxHeadersToCurrentEntry(TarArchiveInputStream.java:347) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Method applyPaxHeadersToCurrentEntryMethod = tarArchiveInputStreamClazz.getDeclaredMethod("applyPaxHeadersToCurrentEntry", linkedHashMapType);
        applyPaxHeadersToCurrentEntryMethod.setAccessible(true);
        java.lang.Object[] applyPaxHeadersToCurrentEntryMethodArguments = new java.lang.Object[1];
        applyPaxHeadersToCurrentEntryMethodArguments[0] = linkedHashMap;
        try {
            applyPaxHeadersToCurrentEntryMethod.invoke(tarArchiveInputStream, applyPaxHeadersToCurrentEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method applyPaxHeadersToCurrentEntry(java.util.Map)
    
    @Test
    public void testApplyPaxHeadersToCurrentEntry1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "lin\u0000\u0000\u0000\u0000\u0000";
        linkedHashMap.put(string, null);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Method applyPaxHeadersToCurrentEntryMethod = tarArchiveInputStreamClazz.getDeclaredMethod("applyPaxHeadersToCurrentEntry", linkedHashMapType);
        applyPaxHeadersToCurrentEntryMethod.setAccessible(true);
        java.lang.Object[] applyPaxHeadersToCurrentEntryMethodArguments = new java.lang.Object[1];
        applyPaxHeadersToCurrentEntryMethodArguments[0] = linkedHashMap;
        applyPaxHeadersToCurrentEntryMethod.invoke(tarArchiveInputStream, applyPaxHeadersToCurrentEntryMethodArguments);
    }
    
    @Test
    public void testApplyPaxHeadersToCurrentEntry2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        linkedHashMap.put(string, string1);
        linkedHashMap.put(string1, string1);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Method applyPaxHeadersToCurrentEntryMethod = tarArchiveInputStreamClazz.getDeclaredMethod("applyPaxHeadersToCurrentEntry", linkedHashMapType);
        applyPaxHeadersToCurrentEntryMethod.setAccessible(true);
        java.lang.Object[] applyPaxHeadersToCurrentEntryMethodArguments = new java.lang.Object[1];
        applyPaxHeadersToCurrentEntryMethodArguments[0] = linkedHashMap;
        applyPaxHeadersToCurrentEntryMethod.invoke(tarArchiveInputStream, applyPaxHeadersToCurrentEntryMethodArguments);
    }
    ///endregion
    
    ///region OTHER: SECURITY for method applyPaxHeadersToCurrentEntry(java.util.Map)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testApplyPaxHeadersToCurrentEntry3() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "path";
        linkedHashMap.put(string, null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.applyPaxHeadersToCurrentEntry] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "os.name" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:916)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.normalizeFileName(TarArchiveEntry.java:874)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.setName(TarArchiveEntry.java:380)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.applyPaxHeadersToCurrentEntry(TarArchiveInputStream.java:347) */
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
        
                java.lang.reflect.Method methodForGetDeclaredFields970229656950300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields970229656950300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass970229656955900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields970229656950300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass970229656955900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields970229657312300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields970229657312300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass970229657314100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields970229657312300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass970229657314100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}


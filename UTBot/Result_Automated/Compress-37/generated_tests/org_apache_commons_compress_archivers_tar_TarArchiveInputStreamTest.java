package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import java.io.File;
import java.util.jar.JarInputStream;
import java.io.InputStream;
import java.util.zip.InflaterInputStream;
import java.util.zip.Inflater;
import jdk.internal.ref.CleanerImpl.PhantomCleanableRef;
import jdk.internal.ref.CleanerImpl;
import java.lang.reflect.Method;
import java.io.IOException;
import sun.security.util.ManifestEntryVerifier;
import java.util.jar.JarEntry;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import sun.security.provider.Sun;
import java.util.ArrayList;
import java.io.DataInputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import java.util.zip.CheckedInputStream;
import java.util.HashMap;
import java.security.CodeSigner;
import org.junit.Ignore;
import java.util.Properties;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
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
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:154)
            org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(ArchiveUtils.java:77)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(TarArchiveInputStream.java:731) */
        TarArchiveInputStream.matches(null, 265);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (hasHitEOF || isDirectory()): False}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testRead_HasHitEOFOrIsDirectory() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF", true);
        
        int actual = tarArchiveInputStream.read(null, -255, -255);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (hasHitEOF || isDirectory()): True}
 * @utbot.executesCondition {@code (entryOffset >= entrySize): True}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testRead_HasHitEOFOrIsDirectoryOrEntryOffsetGreaterOrEqualEntrySize() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -255L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -255L);
        
        int actual = tarArchiveInputStream.read(null, -255, -255);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (hasHitEOF || isDirectory()): True}
 * @utbot.executesCondition {@code (entryOffset >= entrySize): False}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testRead_EntryOffsetLessThanEntrySize() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 53);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        int actual = tarArchiveInputStream.read(null, -255, -255);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (hasHitEOF || isDirectory()): True}
 * @utbot.executesCondition {@code (entryOffset >= entrySize): True}
 * @utbot.executesCondition {@code (currEntry == null): True}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveInputStream#isDirectory()
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: currEntry == null
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRead_ThrowIllegalStateException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -126L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -253L);
        
        tarArchiveInputStream.read(null, -255, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method read([B, int, int)
    
    @Test
    public void testRead1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = "";
        currEntry.setName(name);
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", java.lang.Byte.MIN_VALUE);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        int actual = tarArchiveInputStream.read(byteArray, 0, 0);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method read([B, int, int)
    
    @Test
    public void testRead2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        File file = ((File) createInstance("java.io.File"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "file", file);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.File.isDirectory(File.java:860)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory(TarArchiveEntry.java:852)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isDirectory(TarArchiveInputStream.java:586)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(TarArchiveInputStream.java:644) */
        tarArchiveInputStream.read(byteArray, 0, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method close()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 *  */
    @Test
    public void testClose() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(is, "java.util.zip.ZipInputStream", "closed", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        
        tarArchiveInputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(is, "java.util.zip.InflaterInputStream", "closed", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        
        tarArchiveInputStream.close();
        
        InputStream tarArchiveInputStreamIs = ((InputStream) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is"));
        boolean finalTarArchiveInputStreamIsClosed = ((Boolean) getFieldValue(tarArchiveInputStreamIs, "java.util.zip.ZipInputStream", "closed"));
        
        assertTrue(finalTarArchiveInputStreamIsClosed);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(is, "java.io.FilterInputStream", "in", in);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        
        tarArchiveInputStream.close();
        
        InputStream tarArchiveInputStreamIs = ((InputStream) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is"));
        boolean finalTarArchiveInputStreamIsClosed = ((Boolean) getFieldValue(tarArchiveInputStreamIs, "java.util.zip.ZipInputStream", "closed"));
        InputStream tarArchiveInputStreamIs1 = ((InputStream) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is"));
        boolean finalTarArchiveInputStreamIsClosed1 = ((Boolean) getFieldValue(tarArchiveInputStreamIs1, "java.util.zip.InflaterInputStream", "closed"));
        
        assertTrue(finalTarArchiveInputStreamIsClosed);
        
        assertTrue(finalTarArchiveInputStreamIsClosed1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method close()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_3() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        InflaterInputStream is = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(is, "java.util.zip.InflaterInputStream", "closed", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        
        tarArchiveInputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_4() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        InflaterInputStream is = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(is, "java.io.FilterInputStream", "in", in);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        
        tarArchiveInputStream.close();
        
        InputStream tarArchiveInputStreamIs = ((InputStream) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is"));
        boolean finalTarArchiveInputStreamIsClosed = ((Boolean) getFieldValue(tarArchiveInputStreamIs, "java.util.zip.InflaterInputStream", "closed"));
        
        assertTrue(finalTarArchiveInputStreamIsClosed);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 * @utbot.invokes {@link java.io.InputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: is.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.close(TarArchiveInputStream.java:158) */
        tarArchiveInputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#close()}
 * @utbot.invokes {@link java.io.InputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testClose_ThrowNullPointerException_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        Object cleanable = createInstance("java.io.FileCleanable");
        CleanerImpl.PhantomCleanableRef next = ((CleanerImpl.PhantomCleanableRef) createInstance("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        setField(cleanable, "jdk.internal.ref.PhantomCleanable", "next", next);
        setField(zsRef, "java.util.zip.Inflater$InflaterZStreamRef", "cleanable", cleanable);
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(is, "java.util.zip.InflaterInputStream", "inf", inf);
        setField(is, "java.util.zip.InflaterInputStream", "usesDefaultInflater", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        
        tarArchiveInputStream.close();
    }
    ///endregion
    
    ///region Errors report for close
    
    public void testClose_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 17 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        /* Unable to make field private static final java.util.concurrent.atomic.AtomicInteger sun.net.ResourceManager.numSockets accessible:
        module java.base does not "opens sun.net" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.mark
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mark(int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#mark(int)}
 *  */
    @Test
    public void testMark() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        tarArchiveInputStream.mark(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skip
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method skip(long)
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#skip(long)}
 * @utbot.executesCondition {@code (n <= 0): True}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testSkip_NLessOrEqualZero() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        long actual = tarArchiveInputStream.skip(0L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#skip(long)}
 * @utbot.executesCondition {@code (n <= 0): False}
 * @utbot.executesCondition {@code (isDirectory()): True}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveInputStream#isDirectory()
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testSkip_IsDirectory() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 53);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        long actual = tarArchiveInputStream.skip(1L);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method skip(long)
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#skip(long)}
 * @utbot.executesCondition {@code (n <= 0): False}
 * @utbot.executesCondition {@code (isDirectory()): False}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveInputStream#isDirectory()
 * @utbot.invokes {@link java.lang.Math#min(long,long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final long skipped = is.skip(Math.min(n, available));
 *  */
    @Test
    public void testSkip_ThrowNullPointerException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", -126L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -130L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skip] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skip(TarArchiveInputStream.java:217) */
        tarArchiveInputStream.skip(5L);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method skip(long)
    
    @Test
    public void testSkip1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        File file = ((File) createInstance("java.io.File"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "file", file);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skip] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.File.isDirectory(File.java:860)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory(TarArchiveEntry.java:852)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isDirectory(TarArchiveInputStream.java:586)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skip(TarArchiveInputStream.java:212) */
        tarArchiveInputStream.skip(1L);
    }
    
    @Test
    public void testSkip2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = "";
        currEntry.setName(name);
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", java.lang.Byte.MIN_VALUE);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skip] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skip(TarArchiveInputStream.java:217) */
        tarArchiveInputStream.skip(1L);
    }
    ///endregion
    
    ///region Errors report for skip
    
    public void testSkip_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.available
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method available()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#available()}
 * @utbot.executesCondition {@code (isDirectory()): False}
 * @utbot.executesCondition {@code (entrySize - entryOffset > Integer.MAX_VALUE): True}
 * @utbot.returnsFrom {@code return Integer.MAX_VALUE;}
 *  */
    @Test
    public void testAvailable_EntrySizeMinusEntryOffsetGreaterThanIntegerMAX_VALUE() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 2164261123L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -9223301665434615808L);
        
        int actual = tarArchiveInputStream.available();
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#available()}
 * @utbot.executesCondition {@code (isDirectory()): False}
 * @utbot.executesCondition {@code (entrySize - entryOffset > Integer.MAX_VALUE): False}
 * @utbot.returnsFrom {@code return (int) (entrySize - entryOffset);}
 *  */
    @Test
    public void testAvailable_EntrySizeMinusEntryOffsetLessOrEqualIntegerMAX_VALUE() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 34049L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", 268959486L);
        
        int actual = tarArchiveInputStream.available();
        
        assertEquals(-268925437, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#available()}
 * @utbot.executesCondition {@code (isDirectory()): True}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testAvailable_IsDirectory() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 53);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        int actual = tarArchiveInputStream.available();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method available()
    
    @Test
    public void testAvailable1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = "";
        currEntry.setName(name);
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", java.lang.Byte.MIN_VALUE);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        int actual = tarArchiveInputStream.available();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method available()
    
    @Test
    public void testAvailable2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        File file = ((File) createInstance("java.io.File"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "file", file);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.available] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.File.isDirectory(File.java:860)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory(TarArchiveEntry.java:852)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isDirectory(TarArchiveInputStream.java:586)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.available(TarArchiveInputStream.java:184) */
        tarArchiveInputStream.available();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.markSupported
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method markSupported()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#markSupported()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMarkSupported_ReturnFalse() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        boolean actual = tarArchiveInputStream.markSupported();
        
        assertFalse(actual);
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isDirectory
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDirectory()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#isDirectory()}
 * @utbot.returnsFrom {@code return currEntry != null && currEntry.isDirectory();}
 *  */
    @Test
    public void testIsDirectory_CurrEntryEqualsNullAndCurrEntryIsDirectory() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method isDirectoryMethod = tarArchiveInputStreamClazz.getDeclaredMethod("isDirectory");
        isDirectoryMethod.setAccessible(true);
        java.lang.Object[] isDirectoryMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) isDirectoryMethod.invoke(tarArchiveInputStream, isDirectoryMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#isDirectory()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isDirectory()}
 * @utbot.returnsFrom {@code return currEntry != null && currEntry.isDirectory();}
 *  */
    @Test
    public void testIsDirectory_CurrEntryNotEqualsNullAndCurrEntryIsDirectory() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 53);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method isDirectoryMethod = tarArchiveInputStreamClazz.getDeclaredMethod("isDirectory");
        isDirectoryMethod.setAccessible(true);
        java.lang.Object[] isDirectoryMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) isDirectoryMethod.invoke(tarArchiveInputStream, isDirectoryMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isDirectory()
    
    @Test
    public void testIsDirectory1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = "";
        currEntry.setName(name);
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", java.lang.Byte.MIN_VALUE);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method isDirectoryMethod = tarArchiveInputStreamClazz.getDeclaredMethod("isDirectory");
        isDirectoryMethod.setAccessible(true);
        java.lang.Object[] isDirectoryMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) isDirectoryMethod.invoke(tarArchiveInputStream, isDirectoryMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isDirectory()
    
    @Test
    public void testIsDirectory2() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        File file = ((File) createInstance("java.io.File"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "file", file);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isDirectory] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.File.isDirectory(File.java:860)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory(TarArchiveEntry.java:852)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isDirectory(TarArchiveInputStream.java:586) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method isDirectoryMethod = tarArchiveInputStreamClazz.getDeclaredMethod("isDirectory");
        isDirectoryMethod.setAccessible(true);
        java.lang.Object[] isDirectoryMethodArguments = new java.lang.Object[0];
        try {
            isDirectoryMethod.invoke(tarArchiveInputStream, isDirectoryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecordSize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRecordSize()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecordSize()}
 * @utbot.returnsFrom {@code return recordSize;}
 *  */
    @Test
    public void testGetRecordSize_ReturnRecordSize() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", -255);
        
        int actual = tarArchiveInputStream.getRecordSize();
        
        assertEquals(-255, actual);
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNextTarEntry()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getNextTarEntry()}
 * @utbot.executesCondition {@code (hasHitEOF): False}
 * @utbot.executesCondition {@code (currEntry != null): False}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecord()
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final byte[] headerBuf = getRecord();
 *  */
    @Test
    public void testGetNextTarEntry_ThrowNegativeArraySizeException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", -256);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readRecord(TarArchiveInputStream.java:427)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:398)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:275) */
        tarArchiveInputStream.getNextTarEntry();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getNextTarEntry()
    
    @Test
    public void testGetNextTarEntry1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        File file = ((File) createInstance("java.io.File"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "file", file);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.File.isDirectory(File.java:860)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory(TarArchiveEntry.java:852)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isDirectory(TarArchiveInputStream.java:586)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skip(TarArchiveInputStream.java:212)
            org.apache.commons.compress.utils.IOUtils.skip(IOUtils.java:103)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:269) */
        tarArchiveInputStream.getNextTarEntry();
    }
    
    @Test
    public void testGetNextTarEntry2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.tryToConsumeSecondEOFRecord(TarArchiveInputStream.java:613)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:401)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:275) */
        tarArchiveInputStream.getNextTarEntry();
    }
    
    @Test
    public void testGetNextTarEntry3() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = "";
        currEntry.setName(name);
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", java.lang.Byte.MIN_VALUE);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skip(TarArchiveInputStream.java:217)
            org.apache.commons.compress.utils.IOUtils.skip(IOUtils.java:103)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:269) */
        tarArchiveInputStream.getNextTarEntry();
    }
    ///endregion
    
    ///region Errors report for getNextTarEntry
    
    public void testGetNextTarEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skipRecordPadding
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method skipRecordPadding()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#skipRecordPadding()}
 * @utbot.executesCondition {@code (!isDirectory()): True}
 * @utbot.executesCondition {@code (this.entrySize > 0): False}
 *  */
    @Test
    public void testSkipRecordPadding_ThisEntrySizeLessOrEqualZero() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 0L);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method skipRecordPaddingMethod = tarArchiveInputStreamClazz.getDeclaredMethod("skipRecordPadding");
        skipRecordPaddingMethod.setAccessible(true);
        java.lang.Object[] skipRecordPaddingMethodArguments = new java.lang.Object[0];
        skipRecordPaddingMethod.invoke(tarArchiveInputStream, skipRecordPaddingMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#skipRecordPadding()}
 * @utbot.executesCondition {@code (!isDirectory()): True}
 * @utbot.executesCondition {@code (this.entrySize > 0): True}
 * @utbot.executesCondition {@code (this.entrySize % this.recordSize != 0): False}
 *  */
    @Test
    public void testSkipRecordPadding_ThisEntrySizeRemainderOfThisRecordSizeEqualsZero() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", -1);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 1L);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method skipRecordPaddingMethod = tarArchiveInputStreamClazz.getDeclaredMethod("skipRecordPadding");
        skipRecordPaddingMethod.setAccessible(true);
        java.lang.Object[] skipRecordPaddingMethodArguments = new java.lang.Object[0];
        skipRecordPaddingMethod.invoke(tarArchiveInputStream, skipRecordPaddingMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#skipRecordPadding()}
 * @utbot.executesCondition {@code (!isDirectory()): False}
 *  */
    @Test
    public void testSkipRecordPadding_IsDirectory() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 53);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method skipRecordPaddingMethod = tarArchiveInputStreamClazz.getDeclaredMethod("skipRecordPadding");
        skipRecordPaddingMethod.setAccessible(true);
        java.lang.Object[] skipRecordPaddingMethodArguments = new java.lang.Object[0];
        skipRecordPaddingMethod.invoke(tarArchiveInputStream, skipRecordPaddingMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method skipRecordPadding()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#skipRecordPadding()}
 * @utbot.executesCondition {@code (!isDirectory()): True}
 * @utbot.executesCondition {@code (this.entrySize > 0): True}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveInputStream#isDirectory()
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: !isDirectory() && this.entrySize > 0 && this.entrySize % this.recordSize != 0
 *  */
    @Test
    public void testSkipRecordPadding_ThrowArithmeticException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 1L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skipRecordPadding] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skipRecordPadding(TarArchiveInputStream.java:342) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method skipRecordPaddingMethod = tarArchiveInputStreamClazz.getDeclaredMethod("skipRecordPadding");
        skipRecordPaddingMethod.setAccessible(true);
        java.lang.Object[] skipRecordPaddingMethodArguments = new java.lang.Object[0];
        try {
            skipRecordPaddingMethod.invoke(tarArchiveInputStream, skipRecordPaddingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method skipRecordPadding()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#skipRecordPadding()}
 * @utbot.executesCondition {@code (!isDirectory()): True}
 * @utbot.executesCondition {@code (this.entrySize > 0): True}
 * @utbot.executesCondition {@code (this.entrySize % this.recordSize != 0): True}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveInputStream#isDirectory()
 * @utbot.invokes {@link org.apache.commons.compress.utils.IOUtils#skip(java.io.InputStream,long)}
 * @utbot.throwsException {@link java.io.IOException} in: final long skipped = IOUtils.skip(is, padding);
 *  */
    @Test(expected = IOException.class)
    public void testSkipRecordPadding_ThrowIOException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 2);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 1L);
        InflaterInputStream is = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(is, "java.util.zip.InflaterInputStream", "closed", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method skipRecordPaddingMethod = tarArchiveInputStreamClazz.getDeclaredMethod("skipRecordPadding");
        skipRecordPaddingMethod.setAccessible(true);
        java.lang.Object[] skipRecordPaddingMethodArguments = new java.lang.Object[0];
        try {
            skipRecordPaddingMethod.invoke(tarArchiveInputStream, skipRecordPaddingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method skipRecordPadding()
    
    @Test
    public void testSkipRecordPadding1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = "";
        currEntry.setName(name);
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", java.lang.Byte.MIN_VALUE);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method skipRecordPaddingMethod = tarArchiveInputStreamClazz.getDeclaredMethod("skipRecordPadding");
        skipRecordPaddingMethod.setAccessible(true);
        java.lang.Object[] skipRecordPaddingMethodArguments = new java.lang.Object[0];
        skipRecordPaddingMethod.invoke(tarArchiveInputStream, skipRecordPaddingMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method skipRecordPadding()
    
    @Test
    public void testSkipRecordPadding2() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        File file = ((File) createInstance("java.io.File"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "file", file);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skipRecordPadding] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.File.isDirectory(File.java:860)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory(TarArchiveEntry.java:852)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isDirectory(TarArchiveInputStream.java:586)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skipRecordPadding(TarArchiveInputStream.java:342) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method skipRecordPaddingMethod = tarArchiveInputStreamClazz.getDeclaredMethod("skipRecordPadding");
        skipRecordPaddingMethod.setAccessible(true);
        java.lang.Object[] skipRecordPaddingMethodArguments = new java.lang.Object[0];
        try {
            skipRecordPaddingMethod.invoke(tarArchiveInputStream, skipRecordPaddingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readOldGNUSparse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readOldGNUSparse()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readOldGNUSparse()}
 *  */
    @Test
    public void testReadOldGNUSparse() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readOldGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readOldGNUSparse");
        readOldGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readOldGNUSparseMethodArguments = new java.lang.Object[0];
        readOldGNUSparseMethod.invoke(tarArchiveInputStream, readOldGNUSparseMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readOldGNUSparse()}
 *  */
    @Test
    public void testReadOldGNUSparse_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readOldGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readOldGNUSparse");
        readOldGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readOldGNUSparseMethodArguments = new java.lang.Object[0];
        readOldGNUSparseMethod.invoke(tarArchiveInputStream, readOldGNUSparseMethodArguments);
        
        boolean finalTarArchiveInputStreamHasHitEOF = ((Boolean) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        TarArchiveEntry finalTarArchiveInputStreamCurrEntry = ((TarArchiveEntry) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry"));
        
        assertTrue(finalTarArchiveInputStreamHasHitEOF);
        
        assertNull(finalTarArchiveInputStreamCurrEntry);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readOldGNUSparse()}
 *  */
    @Test
    public void testReadOldGNUSparse_2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(is, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(is, "java.util.jar.JarInputStream", "mev", mev);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readOldGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readOldGNUSparse");
        readOldGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readOldGNUSparseMethodArguments = new java.lang.Object[0];
        readOldGNUSparseMethod.invoke(tarArchiveInputStream, readOldGNUSparseMethodArguments);
        
        boolean finalTarArchiveInputStreamHasHitEOF = ((Boolean) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        TarArchiveEntry finalTarArchiveInputStreamCurrEntry = ((TarArchiveEntry) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry"));
        
        assertTrue(finalTarArchiveInputStreamHasHitEOF);
        
        assertNull(finalTarArchiveInputStreamCurrEntry);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readOldGNUSparse()}
 *  */
    @Test
    public void testReadOldGNUSparse_3() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(is, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Hashtable verifiedSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(is, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(is, "java.util.jar.JarInputStream", "mev", mev);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readOldGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readOldGNUSparse");
        readOldGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readOldGNUSparseMethodArguments = new java.lang.Object[0];
        readOldGNUSparseMethod.invoke(tarArchiveInputStream, readOldGNUSparseMethodArguments);
        
        boolean finalTarArchiveInputStreamHasHitEOF = ((Boolean) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        TarArchiveEntry finalTarArchiveInputStreamCurrEntry = ((TarArchiveEntry) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry"));
        
        assertTrue(finalTarArchiveInputStreamHasHitEOF);
        
        assertNull(finalTarArchiveInputStreamCurrEntry);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readOldGNUSparse()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readOldGNUSparse()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final byte[] headerBuf = getRecord();
 *  */
    @Test
    public void testReadOldGNUSparse_ThrowNegativeArraySizeException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", -256);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readOldGNUSparse] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readRecord(TarArchiveInputStream.java:427)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:398)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readOldGNUSparse(TarArchiveInputStream.java:572) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readOldGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readOldGNUSparse");
        readOldGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readOldGNUSparseMethodArguments = new java.lang.Object[0];
        try {
            readOldGNUSparseMethod.invoke(tarArchiveInputStream, readOldGNUSparseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readOldGNUSparse()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: currEntry.isExtended()
 *  */
    @Test
    public void testReadOldGNUSparse_ThrowNullPointerException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readOldGNUSparse] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readOldGNUSparse(TarArchiveInputStream.java:569) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readOldGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readOldGNUSparse");
        readOldGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readOldGNUSparseMethodArguments = new java.lang.Object[0];
        try {
            readOldGNUSparseMethod.invoke(tarArchiveInputStream, readOldGNUSparseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readOldGNUSparse()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final byte[] headerBuf = getRecord();
 *  */
    @Test
    public void testReadOldGNUSparse_ThrowNullPointerException_1() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readOldGNUSparse] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.tryToConsumeSecondEOFRecord(TarArchiveInputStream.java:613)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:401)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readOldGNUSparse(TarArchiveInputStream.java:572) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readOldGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readOldGNUSparse");
        readOldGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readOldGNUSparseMethodArguments = new java.lang.Object[0];
        try {
            readOldGNUSparseMethod.invoke(tarArchiveInputStream, readOldGNUSparseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readOldGNUSparse()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readOldGNUSparse()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadOldGNUSparse_ThrowIOException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        InflaterInputStream is = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(is, "java.util.zip.InflaterInputStream", "closed", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readOldGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readOldGNUSparse");
        readOldGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readOldGNUSparseMethodArguments = new java.lang.Object[0];
        try {
            readOldGNUSparseMethod.invoke(tarArchiveInputStream, readOldGNUSparseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readOldGNUSparse()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadOldGNUSparse_ThrowIOException_1() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(is, "java.util.zip.ZipInputStream", "closed", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readOldGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readOldGNUSparse");
        readOldGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readOldGNUSparseMethodArguments = new java.lang.Object[0];
        try {
            readOldGNUSparseMethod.invoke(tarArchiveInputStream, readOldGNUSparseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readOldGNUSparse()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadOldGNUSparse_ThrowIOException_2() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 2);
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(is, "java.util.zip.ZipInputStream", "entry", entry);
        setField(is, "java.util.zip.ZipInputStream", "remaining", 1L);
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(is, "java.io.FilterInputStream", "in", in);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "isExtended", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readOldGNUSparseMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readOldGNUSparse");
        readOldGNUSparseMethod.setAccessible(true);
        java.lang.Object[] readOldGNUSparseMethodArguments = new java.lang.Object[0];
        try {
            readOldGNUSparseMethod.invoke(tarArchiveInputStream, readOldGNUSparseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readOldGNUSparse
    
    public void testReadOldGNUSparse_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isEOFRecord
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEOFRecord([B)
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#isEOFRecord(byte[])}
 * @utbot.returnsFrom {@code return record == null || ArchiveUtils.isArrayZero(record, recordSize);}
 *  */
    @Test
    public void testIsEOFRecord_RecordEqualsNullOrArchiveUtilsIsArrayZero_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        byte[] byteArray = {(byte) -127};
        
        boolean actual = tarArchiveInputStream.isEOFRecord(byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#isEOFRecord(byte[])}
 * @utbot.returnsFrom {@code return record == null || ArchiveUtils.isArrayZero(record, recordSize);}
 *  */
    @Test
    public void testIsEOFRecord_RecordNotEqualsNullOrArchiveUtilsIsArrayZero() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] byteArray = {(byte) -127};
        
        boolean actual = tarArchiveInputStream.isEOFRecord(byteArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#isEOFRecord(byte[])}
 * @utbot.returnsFrom {@code return record == null || ArchiveUtils.isArrayZero(record, recordSize);}
 *  */
    @Test
    public void testIsEOFRecord_RecordNotEqualsNullOrArchiveUtilsIsArrayZero_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        byte[] byteArray = {(byte) 0};
        
        boolean actual = tarArchiveInputStream.isEOFRecord(byteArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#isEOFRecord(byte[])}
 * @utbot.returnsFrom {@code return record == null || ArchiveUtils.isArrayZero(record, recordSize);}
 *  */
    @Test
    public void testIsEOFRecord_RecordEqualsNullOrArchiveUtilsIsArrayZero() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        boolean actual = tarArchiveInputStream.isEOFRecord(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEOFRecord([B)
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#isEOFRecord(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.utils.ArchiveUtils#isArrayZero(byte[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return record == null || ArchiveUtils.isArrayZero(record, recordSize);
 *  */
    @Test
    public void testIsEOFRecord_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isEOFRecord] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(ArchiveUtils.java:248)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isEOFRecord(TarArchiveInputStream.java:416) */
        tarArchiveInputStream.isEOFRecord(byteArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRecord()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecord()}
 * @utbot.returnsFrom {@code return headerBuf;}
 *  */
    @Test
    public void testGetRecord_ReturnHeaderBuf() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(is, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(is, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(is, "java.util.jar.JarInputStream", "mev", mev);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method getRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("getRecord");
        getRecordMethod.setAccessible(true);
        java.lang.Object[] getRecordMethodArguments = new java.lang.Object[0];
        byte[] actual = ((byte[]) getRecordMethod.invoke(tarArchiveInputStream, getRecordMethodArguments));
        
        assertNull(actual);
        
        boolean finalTarArchiveInputStreamHasHitEOF = ((Boolean) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        
        assertTrue(finalTarArchiveInputStreamHasHitEOF);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecord()}
 * @utbot.returnsFrom {@code return headerBuf;}
 *  */
    @Test
    public void testGetRecord_ReturnHeaderBuf_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method getRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("getRecord");
        getRecordMethod.setAccessible(true);
        java.lang.Object[] getRecordMethodArguments = new java.lang.Object[0];
        byte[] actual = ((byte[]) getRecordMethod.invoke(tarArchiveInputStream, getRecordMethodArguments));
        
        assertNull(actual);
        
        boolean finalTarArchiveInputStreamHasHitEOF = ((Boolean) getFieldValue(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF"));
        
        assertTrue(finalTarArchiveInputStreamHasHitEOF);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRecord()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getRecord()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: byte[] headerBuf = readRecord();
 *  */
    @Test
    public void testGetRecord_ThrowNegativeArraySizeException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", -256);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readRecord(TarArchiveInputStream.java:427)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:398) */
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
 * @utbot.executesCondition {@code (hasHitEOF): True}
 * @utbot.executesCondition {@code (headerBuf != null): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#isEOFRecord(byte[])}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveInputStream#tryToConsumeSecondEOFRecord()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tryToConsumeSecondEOFRecord();
 *  */
    @Test
    public void testGetRecord_ThrowNullPointerException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.tryToConsumeSecondEOFRecord(TarArchiveInputStream.java:613)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:401) */
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
 * @utbot.throwsException {@link java.io.IOException} in: byte[] headerBuf = readRecord();
 *  */
    @Test(expected = IOException.class)
    public void testGetRecord_ThrowIOException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        InflaterInputStream is = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(is, "java.util.zip.InflaterInputStream", "closed", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        
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
 * @utbot.throwsException {@link java.util.zip.ZipException} in: byte[] headerBuf = readRecord();
 *  */
    @Test(expected = ZipException.class)
    public void testGetRecord_ThrowZipException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(is, "java.util.zip.ZipInputStream", "entry", entry);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        
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
    public void testGetRecord_ThrowIOException_1() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 2);
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(is, "java.util.zip.ZipInputStream", "entry", entry);
        setField(is, "java.util.zip.ZipInputStream", "remaining", 1L);
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(is, "java.io.FilterInputStream", "in", in);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        
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
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readRecord()}
 * @utbot.throwsException {@link java.lang.SecurityException} 
 *  */
    @Test(expected = SecurityException.class)
    public void testGetRecord_ThrowSecurityException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(is, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Sun verifiedSigners = ((Sun) createInstance("sun.security.provider.Sun"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", verifiedSigners);
        setField(is, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(is, "java.util.jar.JarInputStream", "mev", mev);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        
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
    
    ///region OTHER: ERROR SUITE for method getRecord()
    
    @Test(expected = StackOverflowError.class)
    public void testGetRecord1() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        DataInputStream is = ((DataInputStream) createInstance("java.io.DataInputStream"));
        setField(is, "java.io.FilterInputStream", "in", is);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
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
        // 4 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNextEntry()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getNextEntry()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getNextTarEntry()}
 * @utbot.returnsFrom {@code return getNextTarEntry();}
 *  */
    @Test
    public void testGetNextEntry_TarArchiveInputStreamGetNextTarEntry() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF", true);
        
        ArchiveEntry actual = tarArchiveInputStream.getNextEntry();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getNextEntry()
    
    @Test
    public void testGetNextEntry1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readRecord(TarArchiveInputStream.java:427)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:398)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:275)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:598) */
        tarArchiveInputStream.getNextEntry();
    }
    
    @Test
    public void testGetNextEntry2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        File file = ((File) createInstance("java.io.File"));
        Class pathStatusClazz = Class.forName("java.io.File$PathStatus");
        Object status = getEnumConstantByName(pathStatusClazz, "CHECKED");
        setField(file, "java.io.File", "status", status);
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "file", file);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.File.isDirectory(File.java:860)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory(TarArchiveEntry.java:852)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isDirectory(TarArchiveInputStream.java:586)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skip(TarArchiveInputStream.java:212)
            org.apache.commons.compress.utils.IOUtils.skip(IOUtils.java:103)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:269)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:598) */
        tarArchiveInputStream.getNextEntry();
    }
    
    @Test
    public void testGetNextEntry3() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 53);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.tryToConsumeSecondEOFRecord(TarArchiveInputStream.java:613)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:401)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:275)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:598) */
        tarArchiveInputStream.getNextEntry();
    }
    
    @Test
    public void testGetNextEntry4() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.tryToConsumeSecondEOFRecord(TarArchiveInputStream.java:613)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:401)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:275)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:598) */
        tarArchiveInputStream.getNextEntry();
    }
    
    @Test
    public void testGetNextEntry5() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = "";
        currEntry.setName(name);
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", java.lang.Byte.MIN_VALUE);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skip(TarArchiveInputStream.java:217)
            org.apache.commons.compress.utils.IOUtils.skip(IOUtils.java:103)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:269)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:598) */
        tarArchiveInputStream.getNextEntry();
    }
    ///endregion
    
    ///region Errors report for getNextEntry
    
    public void testGetNextEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parsePaxHeaders(java.io.InputStream)
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#parsePaxHeaders(java.io.InputStream)}
 * @utbot.returnsFrom {@code return headers;}
 *  */
    @Test
    public void testParsePaxHeaders_ReturnHeaders() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        LinkedHashMap globalPaxHeaders = new LinkedHashMap();
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "globalPaxHeaders", globalPaxHeaders);
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        CheckedInputStream checkedInputStream = new CheckedInputStream(jarInputStream, null);
        
        HashMap actual = ((HashMap) tarArchiveInputStream.parsePaxHeaders(checkedInputStream));
        
        assertTrue(deepEquals(globalPaxHeaders, actual));
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#parsePaxHeaders(java.io.InputStream)}
 * @utbot.returnsFrom {@code return headers;}
 *  */
    @Test
    public void testParsePaxHeaders_ReturnHeaders_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        LinkedHashMap globalPaxHeaders = new LinkedHashMap();
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "globalPaxHeaders", globalPaxHeaders);
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        java.security.CodeSigner[] signers = {null};
        setField(first, "java.util.jar.JarEntry", "signers", signers);
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        byte[] singleByteBuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        CheckedInputStream checkedInputStream = new CheckedInputStream(jarInputStream, null);
        
        HashMap actual = ((HashMap) tarArchiveInputStream.parsePaxHeaders(checkedInputStream));
        
        assertTrue(deepEquals(globalPaxHeaders, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parsePaxHeaders(java.io.InputStream)
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#parsePaxHeaders(java.io.InputStream)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Map<String, String> headers = new HashMap<String, String>(globalPaxHeaders);
 *  */
    @Test
    public void testParsePaxHeaders_ThrowNullPointerException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders] produces [java.lang.NullPointerException]
            java.base/java.util.HashMap.putMapEntries(HashMap.java:495)
            java.base/java.util.HashMap.<init>(HashMap.java:484)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders(TarArchiveInputStream.java:454) */
        tarArchiveInputStream.parsePaxHeaders(null);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#parsePaxHeaders(java.io.InputStream)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while((ch = i.read()) != -1)
 *  */
    @Test
    public void testParsePaxHeaders_ThrowNullPointerException_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        LinkedHashMap globalPaxHeaders = new LinkedHashMap();
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "globalPaxHeaders", globalPaxHeaders);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders(TarArchiveInputStream.java:460) */
        tarArchiveInputStream.parsePaxHeaders(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method parsePaxHeaders(java.io.InputStream)
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#parsePaxHeaders(java.io.InputStream)}
 * @utbot.throwsException {@link java.io.IOException} in: while((ch = i.read()) != -1)
 *  */
    @Test(expected = IOException.class)
    public void testParsePaxHeaders_ThrowIOException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        LinkedHashMap globalPaxHeaders = new LinkedHashMap();
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "globalPaxHeaders", globalPaxHeaders);
        InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(inflaterInputStream, "java.util.zip.InflaterInputStream", "closed", true);
        
        tarArchiveInputStream.parsePaxHeaders(inflaterInputStream);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#parsePaxHeaders(java.io.InputStream)}
 * @utbot.throwsException {@link java.io.IOException} in: while((ch = i.read()) != -1)
 *  */
    @Test(expected = IOException.class)
    public void testParsePaxHeaders_ThrowIOException_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        LinkedHashMap globalPaxHeaders = new LinkedHashMap();
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "globalPaxHeaders", globalPaxHeaders);
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "closed", true);
        CheckedInputStream checkedInputStream = new CheckedInputStream(jarInputStream, null);
        
        tarArchiveInputStream.parsePaxHeaders(checkedInputStream);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parsePaxHeaders(java.io.InputStream)
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#parsePaxHeaders(java.io.InputStream)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: while((ch = i.read()) != -1)
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testParsePaxHeaders_ThrowIndexOutOfBoundsException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        LinkedHashMap globalPaxHeaders = new LinkedHashMap();
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "globalPaxHeaders", globalPaxHeaders);
        InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        byte[] singleByteBuf = {};
        setField(inflaterInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        
        tarArchiveInputStream.parsePaxHeaders(inflaterInputStream);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#parsePaxHeaders(java.io.InputStream)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testParsePaxHeaders_ThrowIndexOutOfBoundsException_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        LinkedHashMap globalPaxHeaders = new LinkedHashMap();
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "globalPaxHeaders", globalPaxHeaders);
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        byte[] singleByteBuf = {};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        CheckedInputStream checkedInputStream = new CheckedInputStream(jarInputStream, null);
        
        tarArchiveInputStream.parsePaxHeaders(checkedInputStream);
    }
    ///endregion
    
    ///region Errors report for parsePaxHeaders
    
    public void testParsePaxHeaders_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getLongNameData
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getLongNameData()
    
    @Test
    public void testGetLongNameData1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] smallBuf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "SMALL_BUF", smallBuf);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF", true);
        
        byte[] actual = tarArchiveInputStream.getLongNameData();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getLongNameData()
    
    @Test
    public void testGetLongNameData2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] smallBuf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "SMALL_BUF", smallBuf);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        File file = ((File) createInstance("java.io.File"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "file", file);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getLongNameData] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.File.isDirectory(File.java:860)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory(TarArchiveEntry.java:852)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isDirectory(TarArchiveInputStream.java:586)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(TarArchiveInputStream.java:644)
            java.base/java.io.InputStream.read(InputStream.java:218)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getLongNameData(TarArchiveInputStream.java:360) */
        tarArchiveInputStream.getLongNameData();
    }
    
    @Test
    public void testGetLongNameData3() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] smallBuf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "SMALL_BUF", smallBuf);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 0L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getLongNameData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.tryToConsumeSecondEOFRecord(TarArchiveInputStream.java:613)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:401)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:275)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:598)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getLongNameData(TarArchiveInputStream.java:363) */
        tarArchiveInputStream.getLongNameData();
    }
    
    @Test
    public void testGetLongNameData4() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] smallBuf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "SMALL_BUF", smallBuf);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 53);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getLongNameData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.tryToConsumeSecondEOFRecord(TarArchiveInputStream.java:613)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:401)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:275)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:598)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getLongNameData(TarArchiveInputStream.java:363) */
        tarArchiveInputStream.getLongNameData();
    }
    
    @Test
    public void testGetLongNameData5() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] smallBuf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "SMALL_BUF", smallBuf);
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = "";
        currEntry.setName(name);
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", java.lang.Byte.MIN_VALUE);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getLongNameData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skip(TarArchiveInputStream.java:217)
            org.apache.commons.compress.utils.IOUtils.skip(IOUtils.java:103)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:269)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:598)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getLongNameData(TarArchiveInputStream.java:363) */
        tarArchiveInputStream.getLongNameData();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getLongNameData()
    
    @Test(expected = IllegalStateException.class)
    public void testGetLongNameData6() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] smallBuf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "SMALL_BUF", smallBuf);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 0L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -9223372036854775807L);
        
        tarArchiveInputStream.getLongNameData();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.canReadEntryData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (ae instanceof TarArchiveEntry): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isSparse()}
 * @utbot.returnsFrom {@code return !te.isSparse();}
 *  */
    @Test
    public void testCanReadEntryData_AeInstanceOfTarArchiveEntry() throws Exception  {
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (ae instanceof TarArchiveEntry): True}
    /// invoke:
    ///     {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isSparse()} twice
    /// return from: {@code return !te.isSparse();}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.returnsFrom {@code return !te.isSparse();}
 *  */
    @Test
    public void testCanReadEntryData_ReturnNotTeIsSparse() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", java.lang.Byte.MIN_VALUE);
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "paxGNUSparse", true);
        
        boolean actual = tarArchiveInputStream.canReadEntryData(tarArchiveEntry);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.returnsFrom {@code return !te.isSparse();}
 *  */
    @Test
    public void testCanReadEntryData_ReturnNotTeIsSparse_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 83);
        
        boolean actual = tarArchiveInputStream.canReadEntryData(tarArchiveEntry);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.returnsFrom {@code return !te.isSparse();}
 *  */
    @Test
    public void testCanReadEntryData_ReturnNotTeIsSparse_2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", java.lang.Byte.MIN_VALUE);
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "starSparse", true);
        
        boolean actual = tarArchiveInputStream.canReadEntryData(tarArchiveEntry);
        
        assertFalse(actual);
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.paxHeaders
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method paxHeaders()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#paxHeaders()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#parsePaxHeaders(java.io.InputStream)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Map<String, String> headers = parsePaxHeaders(this);
 *  */
    @Test
    public void testPaxHeaders_ThrowNullPointerException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.paxHeaders] produces [java.lang.NullPointerException]
            java.base/java.util.HashMap.putMapEntries(HashMap.java:495)
            java.base/java.util.HashMap.<init>(HashMap.java:484)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders(TarArchiveInputStream.java:454)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.paxHeaders(TarArchiveInputStream.java:444) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method paxHeadersMethod = tarArchiveInputStreamClazz.getDeclaredMethod("paxHeaders");
        paxHeadersMethod.setAccessible(true);
        java.lang.Object[] paxHeadersMethodArguments = new java.lang.Object[0];
        try {
            paxHeadersMethod.invoke(tarArchiveInputStream, paxHeadersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method paxHeaders()
    
    @Test
    public void testPaxHeaders1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF", true);
        LinkedHashMap globalPaxHeaders = new LinkedHashMap();
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "globalPaxHeaders", globalPaxHeaders);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method paxHeadersMethod = tarArchiveInputStreamClazz.getDeclaredMethod("paxHeaders");
        paxHeadersMethod.setAccessible(true);
        java.lang.Object[] paxHeadersMethodArguments = new java.lang.Object[0];
        paxHeadersMethod.invoke(tarArchiveInputStream, paxHeadersMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method paxHeaders()
    
    @Test
    public void testPaxHeaders2() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        File file = ((File) createInstance("java.io.File"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "file", file);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        LinkedHashMap globalPaxHeaders = new LinkedHashMap();
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "globalPaxHeaders", globalPaxHeaders);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.paxHeaders] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.File.isDirectory(File.java:860)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory(TarArchiveEntry.java:852)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isDirectory(TarArchiveInputStream.java:586)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(TarArchiveInputStream.java:644)
            org.apache.commons.compress.archivers.ArchiveInputStream.read(ArchiveInputStream.java:81)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders(TarArchiveInputStream.java:460)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.paxHeaders(TarArchiveInputStream.java:444) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method paxHeadersMethod = tarArchiveInputStreamClazz.getDeclaredMethod("paxHeaders");
        paxHeadersMethod.setAccessible(true);
        java.lang.Object[] paxHeadersMethodArguments = new java.lang.Object[0];
        try {
            paxHeadersMethod.invoke(tarArchiveInputStream, paxHeadersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPaxHeaders3() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        LinkedHashMap globalPaxHeaders = new LinkedHashMap();
        String string = "";
        Object object = createInstance("java.lang.Object");
        globalPaxHeaders.put(string, object);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "globalPaxHeaders", globalPaxHeaders);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.paxHeaders] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.tryToConsumeSecondEOFRecord(TarArchiveInputStream.java:613)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:401)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:275)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:598)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.paxHeaders(TarArchiveInputStream.java:445) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method paxHeadersMethod = tarArchiveInputStreamClazz.getDeclaredMethod("paxHeaders");
        paxHeadersMethod.setAccessible(true);
        java.lang.Object[] paxHeadersMethodArguments = new java.lang.Object[0];
        try {
            paxHeadersMethod.invoke(tarArchiveInputStream, paxHeadersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPaxHeaders4() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 53);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        LinkedHashMap globalPaxHeaders = new LinkedHashMap();
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "globalPaxHeaders", globalPaxHeaders);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.paxHeaders] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.tryToConsumeSecondEOFRecord(TarArchiveInputStream.java:613)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:401)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:275)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:598)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.paxHeaders(TarArchiveInputStream.java:445) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method paxHeadersMethod = tarArchiveInputStreamClazz.getDeclaredMethod("paxHeaders");
        paxHeadersMethod.setAccessible(true);
        java.lang.Object[] paxHeadersMethodArguments = new java.lang.Object[0];
        try {
            paxHeadersMethod.invoke(tarArchiveInputStream, paxHeadersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPaxHeaders5() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 0);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        LinkedHashMap globalPaxHeaders = new LinkedHashMap();
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "globalPaxHeaders", globalPaxHeaders);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.paxHeaders] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory(TarArchiveEntry.java:859)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isDirectory(TarArchiveInputStream.java:586)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(TarArchiveInputStream.java:644)
            org.apache.commons.compress.archivers.ArchiveInputStream.read(ArchiveInputStream.java:81)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders(TarArchiveInputStream.java:460)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.paxHeaders(TarArchiveInputStream.java:444) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method paxHeadersMethod = tarArchiveInputStreamClazz.getDeclaredMethod("paxHeaders");
        paxHeadersMethod.setAccessible(true);
        java.lang.Object[] paxHeadersMethodArguments = new java.lang.Object[0];
        try {
            paxHeadersMethod.invoke(tarArchiveInputStream, paxHeadersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPaxHeaders6() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = "";
        currEntry.setName(name);
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", java.lang.Byte.MIN_VALUE);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        LinkedHashMap globalPaxHeaders = new LinkedHashMap();
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "globalPaxHeaders", globalPaxHeaders);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.paxHeaders] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skip(TarArchiveInputStream.java:217)
            org.apache.commons.compress.utils.IOUtils.skip(IOUtils.java:103)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:269)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:598)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.paxHeaders(TarArchiveInputStream.java:445) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method paxHeadersMethod = tarArchiveInputStreamClazz.getDeclaredMethod("paxHeaders");
        paxHeadersMethod.setAccessible(true);
        java.lang.Object[] paxHeadersMethodArguments = new java.lang.Object[0];
        try {
            paxHeadersMethod.invoke(tarArchiveInputStream, paxHeadersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method paxHeaders()
    
    @Test(expected = IllegalStateException.class)
    public void testPaxHeaders7() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 0L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -9223372036854775807L);
        LinkedHashMap globalPaxHeaders = new LinkedHashMap();
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "globalPaxHeaders", globalPaxHeaders);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method paxHeadersMethod = tarArchiveInputStreamClazz.getDeclaredMethod("paxHeaders");
        paxHeadersMethod.setAccessible(true);
        java.lang.Object[] paxHeadersMethodArguments = new java.lang.Object[0];
        try {
            paxHeadersMethod.invoke(tarArchiveInputStream, paxHeadersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGlobalPaxHeaders
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readGlobalPaxHeaders()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readGlobalPaxHeaders()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#parsePaxHeaders(java.io.InputStream)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: globalPaxHeaders = parsePaxHeaders(this);
 *  */
    @Test
    public void testReadGlobalPaxHeaders_ThrowNullPointerException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGlobalPaxHeaders] produces [java.lang.NullPointerException]
            java.base/java.util.HashMap.putMapEntries(HashMap.java:495)
            java.base/java.util.HashMap.<init>(HashMap.java:484)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders(TarArchiveInputStream.java:454)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGlobalPaxHeaders(TarArchiveInputStream.java:439) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGlobalPaxHeadersMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGlobalPaxHeaders");
        readGlobalPaxHeadersMethod.setAccessible(true);
        java.lang.Object[] readGlobalPaxHeadersMethodArguments = new java.lang.Object[0];
        try {
            readGlobalPaxHeadersMethod.invoke(tarArchiveInputStream, readGlobalPaxHeadersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method readGlobalPaxHeaders()
    
    @Test
    public void testReadGlobalPaxHeaders1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "hasHitEOF", true);
        LinkedHashMap globalPaxHeaders = new LinkedHashMap();
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "globalPaxHeaders", globalPaxHeaders);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGlobalPaxHeadersMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGlobalPaxHeaders");
        readGlobalPaxHeadersMethod.setAccessible(true);
        java.lang.Object[] readGlobalPaxHeadersMethodArguments = new java.lang.Object[0];
        readGlobalPaxHeadersMethod.invoke(tarArchiveInputStream, readGlobalPaxHeadersMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method readGlobalPaxHeaders()
    
    @Test
    public void testReadGlobalPaxHeaders2() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        LinkedHashMap globalPaxHeaders = new LinkedHashMap();
        String string = "";
        Object object = createInstance("java.lang.Object");
        globalPaxHeaders.put(string, object);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "globalPaxHeaders", globalPaxHeaders);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGlobalPaxHeaders] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.tryToConsumeSecondEOFRecord(TarArchiveInputStream.java:613)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:401)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:275)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:598)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGlobalPaxHeaders(TarArchiveInputStream.java:440) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGlobalPaxHeadersMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGlobalPaxHeaders");
        readGlobalPaxHeadersMethod.setAccessible(true);
        java.lang.Object[] readGlobalPaxHeadersMethodArguments = new java.lang.Object[0];
        try {
            readGlobalPaxHeadersMethod.invoke(tarArchiveInputStream, readGlobalPaxHeadersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testReadGlobalPaxHeaders3() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        File file = ((File) createInstance("java.io.File"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "file", file);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        LinkedHashMap globalPaxHeaders = new LinkedHashMap();
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "globalPaxHeaders", globalPaxHeaders);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGlobalPaxHeaders] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.File.isDirectory(File.java:860)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory(TarArchiveEntry.java:852)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isDirectory(TarArchiveInputStream.java:586)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(TarArchiveInputStream.java:644)
            org.apache.commons.compress.archivers.ArchiveInputStream.read(ArchiveInputStream.java:81)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders(TarArchiveInputStream.java:460)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGlobalPaxHeaders(TarArchiveInputStream.java:439) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGlobalPaxHeadersMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGlobalPaxHeaders");
        readGlobalPaxHeadersMethod.setAccessible(true);
        java.lang.Object[] readGlobalPaxHeadersMethodArguments = new java.lang.Object[0];
        try {
            readGlobalPaxHeadersMethod.invoke(tarArchiveInputStream, readGlobalPaxHeadersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testReadGlobalPaxHeaders4() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 53);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        LinkedHashMap globalPaxHeaders = new LinkedHashMap();
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "globalPaxHeaders", globalPaxHeaders);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGlobalPaxHeaders] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.tryToConsumeSecondEOFRecord(TarArchiveInputStream.java:613)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord(TarArchiveInputStream.java:401)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:275)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:598)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGlobalPaxHeaders(TarArchiveInputStream.java:440) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGlobalPaxHeadersMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGlobalPaxHeaders");
        readGlobalPaxHeadersMethod.setAccessible(true);
        java.lang.Object[] readGlobalPaxHeadersMethodArguments = new java.lang.Object[0];
        try {
            readGlobalPaxHeadersMethod.invoke(tarArchiveInputStream, readGlobalPaxHeadersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testReadGlobalPaxHeaders5() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        TarArchiveEntry currEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = "";
        currEntry.setName(name);
        setField(currEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", java.lang.Byte.MIN_VALUE);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "currEntry", currEntry);
        LinkedHashMap globalPaxHeaders = new LinkedHashMap();
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "globalPaxHeaders", globalPaxHeaders);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGlobalPaxHeaders] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skip(TarArchiveInputStream.java:217)
            org.apache.commons.compress.utils.IOUtils.skip(IOUtils.java:103)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry(TarArchiveInputStream.java:269)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry(TarArchiveInputStream.java:598)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGlobalPaxHeaders(TarArchiveInputStream.java:440) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGlobalPaxHeadersMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGlobalPaxHeaders");
        readGlobalPaxHeadersMethod.setAccessible(true);
        java.lang.Object[] readGlobalPaxHeadersMethodArguments = new java.lang.Object[0];
        try {
            readGlobalPaxHeadersMethod.invoke(tarArchiveInputStream, readGlobalPaxHeadersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readGlobalPaxHeaders()
    
    @Test(expected = IllegalStateException.class)
    public void testReadGlobalPaxHeaders6() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entrySize", 0L);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "entryOffset", -9223372036854775807L);
        LinkedHashMap globalPaxHeaders = new LinkedHashMap();
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "globalPaxHeaders", globalPaxHeaders);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method readGlobalPaxHeadersMethod = tarArchiveInputStreamClazz.getDeclaredMethod("readGlobalPaxHeaders");
        readGlobalPaxHeadersMethod.setAccessible(true);
        java.lang.Object[] readGlobalPaxHeadersMethodArguments = new java.lang.Object[0];
        try {
            readGlobalPaxHeadersMethod.invoke(tarArchiveInputStream, readGlobalPaxHeadersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Entry<String, String> ent: headers.entrySet())
 *  */
    @Test
    public void testApplyPaxHeadersToCurrentEntry_ThrowNullPointerException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.applyPaxHeadersToCurrentEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.applyPaxHeadersToCurrentEntry(TarArchiveInputStream.java:523) */
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
 * @utbot.iterates iterate the loop {@code for(final Entry<String, String> ent: headers.entrySet())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: currEntry.setName(val);
 *  */
    @Test
    public void testApplyPaxHeadersToCurrentEntry_ThrowNullPointerException_1() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "path";
        linkedHashMap.put(string, null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.applyPaxHeadersToCurrentEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.applyPaxHeadersToCurrentEntry(TarArchiveInputStream.java:527) */
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
        String string = "pa\u0000\u0000";
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
        String string = "\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000";
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
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
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.normalizeFileName(TarArchiveEntry.java:1174)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.setName(TarArchiveEntry.java:435)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.applyPaxHeadersToCurrentEntry(TarArchiveInputStream.java:527) */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.tryToConsumeSecondEOFRecord
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryToConsumeSecondEOFRecord()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#tryToConsumeSecondEOFRecord()}
 *  */
    @Test
    public void testTryToConsumeSecondEOFRecord() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(is, "java.util.jar.JarInputStream", "first", first);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method tryToConsumeSecondEOFRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("tryToConsumeSecondEOFRecord");
        tryToConsumeSecondEOFRecordMethod.setAccessible(true);
        java.lang.Object[] tryToConsumeSecondEOFRecordMethodArguments = new java.lang.Object[0];
        tryToConsumeSecondEOFRecordMethod.invoke(tarArchiveInputStream, tryToConsumeSecondEOFRecordMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#tryToConsumeSecondEOFRecord()}
 *  */
    @Test
    public void testTryToConsumeSecondEOFRecord_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(is, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        java.security.CodeSigner[] signers = {null};
        setField(entry, "java.util.jar.JarEntry", "signers", signers);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(is, "java.util.jar.JarInputStream", "mev", mev);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method tryToConsumeSecondEOFRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("tryToConsumeSecondEOFRecord");
        tryToConsumeSecondEOFRecordMethod.setAccessible(true);
        java.lang.Object[] tryToConsumeSecondEOFRecordMethodArguments = new java.lang.Object[0];
        tryToConsumeSecondEOFRecordMethod.invoke(tarArchiveInputStream, tryToConsumeSecondEOFRecordMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#tryToConsumeSecondEOFRecord()}
 *  */
    @Test
    public void testTryToConsumeSecondEOFRecord_2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        Sun verifiedSigners = ((Sun) createInstance("sun.security.provider.Sun"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(is, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(is, "java.util.jar.JarInputStream", "mev", mev);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method tryToConsumeSecondEOFRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("tryToConsumeSecondEOFRecord");
        tryToConsumeSecondEOFRecordMethod.setAccessible(true);
        java.lang.Object[] tryToConsumeSecondEOFRecordMethodArguments = new java.lang.Object[0];
        tryToConsumeSecondEOFRecordMethod.invoke(tarArchiveInputStream, tryToConsumeSecondEOFRecordMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryToConsumeSecondEOFRecord()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#tryToConsumeSecondEOFRecord()}
 * @utbot.invokes {@link java.io.InputStream#markSupported()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean marked = is.markSupported();
 *  */
    @Test
    public void testTryToConsumeSecondEOFRecord_ThrowNullPointerException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.tryToConsumeSecondEOFRecord] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.tryToConsumeSecondEOFRecord(TarArchiveInputStream.java:613) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method tryToConsumeSecondEOFRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("tryToConsumeSecondEOFRecord");
        tryToConsumeSecondEOFRecordMethod.setAccessible(true);
        java.lang.Object[] tryToConsumeSecondEOFRecordMethodArguments = new java.lang.Object[0];
        try {
            tryToConsumeSecondEOFRecordMethod.invoke(tarArchiveInputStream, tryToConsumeSecondEOFRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method tryToConsumeSecondEOFRecord()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#tryToConsumeSecondEOFRecord()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testTryToConsumeSecondEOFRecord_ThrowIOException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        InflaterInputStream is = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(is, "java.util.zip.InflaterInputStream", "closed", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method tryToConsumeSecondEOFRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("tryToConsumeSecondEOFRecord");
        tryToConsumeSecondEOFRecordMethod.setAccessible(true);
        java.lang.Object[] tryToConsumeSecondEOFRecordMethodArguments = new java.lang.Object[0];
        try {
            tryToConsumeSecondEOFRecordMethod.invoke(tarArchiveInputStream, tryToConsumeSecondEOFRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#tryToConsumeSecondEOFRecord()}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testTryToConsumeSecondEOFRecord_ThrowZipException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(is, "java.util.zip.ZipInputStream", "entry", entry);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method tryToConsumeSecondEOFRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("tryToConsumeSecondEOFRecord");
        tryToConsumeSecondEOFRecordMethod.setAccessible(true);
        java.lang.Object[] tryToConsumeSecondEOFRecordMethodArguments = new java.lang.Object[0];
        try {
            tryToConsumeSecondEOFRecordMethod.invoke(tarArchiveInputStream, tryToConsumeSecondEOFRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#tryToConsumeSecondEOFRecord()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testTryToConsumeSecondEOFRecord_ThrowIOException_1() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(is, "java.util.zip.ZipInputStream", "entry", entry);
        setField(is, "java.util.zip.ZipInputStream", "remaining", 1L);
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(is, "java.io.FilterInputStream", "in", in);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method tryToConsumeSecondEOFRecordMethod = tarArchiveInputStreamClazz.getDeclaredMethod("tryToConsumeSecondEOFRecord");
        tryToConsumeSecondEOFRecordMethod.setAccessible(true);
        java.lang.Object[] tryToConsumeSecondEOFRecordMethodArguments = new java.lang.Object[0];
        try {
            tryToConsumeSecondEOFRecordMethod.invoke(tarArchiveInputStream, tryToConsumeSecondEOFRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for tryToConsumeSecondEOFRecord
    
    public void testTryToConsumeSecondEOFRecord_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        // Default concrete execution failed
        
        // 3 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.consumeRemainderOfLastBlock
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeRemainderOfLastBlock()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#consumeRemainderOfLastBlock()}
 * @utbot.executesCondition {@code (bytesReadOfLastBlock > 0): False}
 *  */
    @Test
    public void testConsumeRemainderOfLastBlock_BytesReadOfLastBlockLessOrEqualZero() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "blockSize", 1);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 288234636759269376L);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method consumeRemainderOfLastBlockMethod = tarArchiveInputStreamClazz.getDeclaredMethod("consumeRemainderOfLastBlock");
        consumeRemainderOfLastBlockMethod.setAccessible(true);
        java.lang.Object[] consumeRemainderOfLastBlockMethodArguments = new java.lang.Object[0];
        consumeRemainderOfLastBlockMethod.invoke(tarArchiveInputStream, consumeRemainderOfLastBlockMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#consumeRemainderOfLastBlock()}
 * @utbot.executesCondition {@code (bytesReadOfLastBlock > 0): True}
 * @utbot.invokes {@link org.apache.commons.compress.utils.IOUtils#skip(java.io.InputStream,long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#count(long)}
 *  */
    @Test
    public void testConsumeRemainderOfLastBlock_BytesReadOfLastBlockGreaterThanZero() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "blockSize", -2);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 8157L);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method consumeRemainderOfLastBlockMethod = tarArchiveInputStreamClazz.getDeclaredMethod("consumeRemainderOfLastBlock");
        consumeRemainderOfLastBlockMethod.setAccessible(true);
        java.lang.Object[] consumeRemainderOfLastBlockMethodArguments = new java.lang.Object[0];
        consumeRemainderOfLastBlockMethod.invoke(tarArchiveInputStream, consumeRemainderOfLastBlockMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeRemainderOfLastBlock()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#consumeRemainderOfLastBlock()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#getBytesRead()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: final long bytesReadOfLastBlock = getBytesRead() % blockSize;
 *  */
    @Test
    public void testConsumeRemainderOfLastBlock_ThrowArithmeticException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.consumeRemainderOfLastBlock] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.consumeRemainderOfLastBlock(TarArchiveInputStream.java:710) */
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method consumeRemainderOfLastBlockMethod = tarArchiveInputStreamClazz.getDeclaredMethod("consumeRemainderOfLastBlock");
        consumeRemainderOfLastBlockMethod.setAccessible(true);
        java.lang.Object[] consumeRemainderOfLastBlockMethodArguments = new java.lang.Object[0];
        try {
            consumeRemainderOfLastBlockMethod.invoke(tarArchiveInputStream, consumeRemainderOfLastBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method consumeRemainderOfLastBlock()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#consumeRemainderOfLastBlock()}
 * @utbot.throwsException {@link java.io.IOException} in: final long skipped = IOUtils.skip(is, blockSize - bytesReadOfLastBlock);
 *  */
    @Test(expected = IOException.class)
    public void testConsumeRemainderOfLastBlock_ThrowIOException() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "blockSize", 4);
        InflaterInputStream is = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(is, "java.util.zip.InflaterInputStream", "closed", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 68719476737L);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method consumeRemainderOfLastBlockMethod = tarArchiveInputStreamClazz.getDeclaredMethod("consumeRemainderOfLastBlock");
        consumeRemainderOfLastBlockMethod.setAccessible(true);
        java.lang.Object[] consumeRemainderOfLastBlockMethodArguments = new java.lang.Object[0];
        try {
            consumeRemainderOfLastBlockMethod.invoke(tarArchiveInputStream, consumeRemainderOfLastBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#consumeRemainderOfLastBlock()}
 * @utbot.throwsException {@link java.io.IOException} in: final long skipped = IOUtils.skip(is, blockSize - bytesReadOfLastBlock);
 *  */
    @Test(expected = IOException.class)
    public void testConsumeRemainderOfLastBlock_ThrowIOException_1() throws Throwable  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "blockSize", 128);
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(is, "java.util.zip.ZipInputStream", "closed", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 2314885667718430846L);
        
        Class tarArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Method consumeRemainderOfLastBlockMethod = tarArchiveInputStreamClazz.getDeclaredMethod("consumeRemainderOfLastBlock");
        consumeRemainderOfLastBlockMethod.setAccessible(true);
        java.lang.Object[] consumeRemainderOfLastBlockMethodArguments = new java.lang.Object[0];
        try {
            consumeRemainderOfLastBlockMethod.invoke(tarArchiveInputStream, consumeRemainderOfLastBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for consumeRemainderOfLastBlock
    
    public void testConsumeRemainderOfLastBlock_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readRecord
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readRecord()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readRecord()}
 * @utbot.executesCondition {@code (readNow != recordSize): False}
 * @utbot.returnsFrom {@code return record;}
 *  */
    @Test
    public void testReadRecord_ReadNowEqualsRecordSize() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        byte[] actual = tarArchiveInputStream.readRecord();
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readRecord()}
 * @utbot.executesCondition {@code (readNow != recordSize): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testReadRecord_ReadNowNotEqualsRecordSize() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(is, "java.util.jar.JarInputStream", "first", first);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        byte[] actual = tarArchiveInputStream.readRecord();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readRecord()}
 * @utbot.executesCondition {@code (readNow != recordSize): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testReadRecord_ReadNowNotEqualsRecordSize_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(is, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(is, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(is, "java.util.jar.JarInputStream", "mev", mev);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        byte[] actual = tarArchiveInputStream.readRecord();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readRecord()}
 * @utbot.executesCondition {@code (readNow != recordSize): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testReadRecord_ReadNowNotEqualsRecordSize_2() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(is, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(is, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(is, "java.util.jar.JarInputStream", "mev", mev);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        byte[] actual = tarArchiveInputStream.readRecord();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readRecord()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readRecord()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final byte[] record = new byte[recordSize];
 *  */
    @Test
    public void testReadRecord_ThrowNegativeArraySizeException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", -256);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readRecord] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readRecord(TarArchiveInputStream.java:427) */
        tarArchiveInputStream.readRecord();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readRecord()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readRecord()}
 * @utbot.throwsException {@link java.io.IOException} in: final int readNow = IOUtils.readFully(is, record);
 *  */
    @Test(expected = IOException.class)
    public void testReadRecord_ThrowIOException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        InflaterInputStream is = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(is, "java.util.zip.InflaterInputStream", "closed", true);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        
        tarArchiveInputStream.readRecord();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readRecord()}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: final int readNow = IOUtils.readFully(is, record);
 *  */
    @Test(expected = ZipException.class)
    public void testReadRecord_ThrowZipException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(is, "java.util.zip.ZipInputStream", "entry", entry);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        
        tarArchiveInputStream.readRecord();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readRecord()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadRecord_ThrowIOException_1() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(is, "java.util.zip.ZipInputStream", "entry", entry);
        setField(is, "java.util.zip.ZipInputStream", "remaining", 1L);
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(is, "java.io.FilterInputStream", "in", in);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        
        tarArchiveInputStream.readRecord();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readRecord()
    
    /**
    @utbot.classUnderTest {@link TarArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveInputStream#readRecord()}
 * @utbot.invokes {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[])}
 * @utbot.throwsException {@link java.lang.SecurityException} 
 *  */
    @Test(expected = SecurityException.class)
    public void testReadRecord_ThrowSecurityException() throws Exception  {
        TarArchiveInputStream tarArchiveInputStream = ((TarArchiveInputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "recordSize", 1);
        JarInputStream is = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(is, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Hashtable sigFileSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
        setField(is, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(is, "java.util.jar.JarInputStream", "mev", mev);
        setField(tarArchiveInputStream, "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "is", is);
        
        tarArchiveInputStream.readRecord();
    }
    ///endregion
    
    ///region Errors report for readRecord
    
    public void testReadRecord_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields975829866286300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields975829866286300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass975829866291600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields975829866286300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass975829866291600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields975829866742700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields975829866742700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass975829866743800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields975829866742700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass975829866743800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getEnumConstantByName(Class<?> enumClass, String name) throws IllegalAccessException {
        java.lang.reflect.Field[] fields = enumClass.getDeclaredFields();
        for (java.lang.reflect.Field field : fields) {
            String fieldName = field.getName();
            if (field.isEnumConstant() && fieldName.equals(name)) {
                field.setAccessible(true);
                
                return field.get(null);
            }
        }
        
        return null;
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


package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.io.IOException;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.junit.Ignore;
import java.io.FilterOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.io.ObjectOutputStream;
import org.tukaani.xz.LZMA2InputStream;
import java.util.jar.JarOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.util.zip.Deflater;
import java.util.zip.GZIPOutputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import java.io.FileInputStream;
import java.io.PrintStream;
import org.tukaani.xz.XZOutputStream;
import org.apache.commons.compress.compressors.xz.XZCompressorOutputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import java.util.zip.ZipInputStream;
import java.util.zip.InflaterInputStream;
import java.util.jar.JarEntry;
import java.util.zip.Inflater;
import org.apache.commons.compress.utils.CountingOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_compress_archivers_tar_TarArchiveOutputStreamTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeadersForBigNumbers
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addPaxHeadersForBigNumbers(java.util.Map, org.apache.commons.compress.archivers.tar.TarArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#addPaxHeadersForBigNumbers(java.util.Map,org.apache.commons.compress.archivers.tar.TarArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getSize()}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#addPaxHeaderForBigNumber(java.util.Map,java.lang.String,long,long)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addPaxHeaderForBigNumber(paxHeaders, "size", entry.getSize(), TarConstants.MAXSIZE);
 *  */
    @Test
    public void testAddPaxHeadersForBigNumbers_ThrowNullPointerException_1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setSize(java.lang.Long.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeadersForBigNumbers] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeaderForBigNumber(TarArchiveOutputStream.java:556)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeadersForBigNumbers(TarArchiveOutputStream.java:534) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class mapType = Class.forName("java.util.Map");
        Class tarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Method addPaxHeadersForBigNumbersMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("addPaxHeadersForBigNumbers", mapType, tarArchiveEntryType);
        addPaxHeadersForBigNumbersMethod.setAccessible(true);
        java.lang.Object[] addPaxHeadersForBigNumbersMethodArguments = new java.lang.Object[2];
        addPaxHeadersForBigNumbersMethodArguments[0] = ((Object) null);
        addPaxHeadersForBigNumbersMethodArguments[1] = tarArchiveEntry;
        try {
            addPaxHeadersForBigNumbersMethod.invoke(tarArchiveOutputStream, addPaxHeadersForBigNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#addPaxHeadersForBigNumbers(java.util.Map,org.apache.commons.compress.archivers.tar.TarArchiveEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addPaxHeaderForBigNumber(paxHeaders, "size", entry.getSize(), TarConstants.MAXSIZE);
 *  */
    @Test
    public void testAddPaxHeadersForBigNumbers_ThrowNullPointerException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeadersForBigNumbers] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeadersForBigNumbers(TarArchiveOutputStream.java:534) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class mapType = Class.forName("java.util.Map");
        Class tarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Method addPaxHeadersForBigNumbersMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("addPaxHeadersForBigNumbers", mapType, tarArchiveEntryType);
        addPaxHeadersForBigNumbersMethod.setAccessible(true);
        java.lang.Object[] addPaxHeadersForBigNumbersMethodArguments = new java.lang.Object[2];
        addPaxHeadersForBigNumbersMethodArguments[0] = ((Object) null);
        addPaxHeadersForBigNumbersMethodArguments[1] = ((Object) null);
        try {
            addPaxHeadersForBigNumbersMethod.invoke(tarArchiveOutputStream, addPaxHeadersForBigNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addPaxHeadersForBigNumbers(java.util.Map, org.apache.commons.compress.archivers.tar.TarArchiveEntry)
    
    @Test
    public void testAddPaxHeadersForBigNumbers1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setGroupId(-468);
        tarArchiveEntry.setSize(java.lang.Long.MIN_VALUE);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class tarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Method addPaxHeadersForBigNumbersMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("addPaxHeadersForBigNumbers", linkedHashMapType, tarArchiveEntryType);
        addPaxHeadersForBigNumbersMethod.setAccessible(true);
        java.lang.Object[] addPaxHeadersForBigNumbersMethodArguments = new java.lang.Object[2];
        addPaxHeadersForBigNumbersMethodArguments[0] = linkedHashMap;
        addPaxHeadersForBigNumbersMethodArguments[1] = tarArchiveEntry;
        addPaxHeadersForBigNumbersMethod.invoke(tarArchiveOutputStream, addPaxHeadersForBigNumbersMethodArguments);
    }
    
    @Test
    public void testAddPaxHeadersForBigNumbers2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setGroupId(1);
        tarArchiveEntry.setSize(java.lang.Long.MIN_VALUE);
        tarArchiveEntry.setModTime(74349926248259520L);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class tarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Method addPaxHeadersForBigNumbersMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("addPaxHeadersForBigNumbers", linkedHashMapType, tarArchiveEntryType);
        addPaxHeadersForBigNumbersMethod.setAccessible(true);
        java.lang.Object[] addPaxHeadersForBigNumbersMethodArguments = new java.lang.Object[2];
        addPaxHeadersForBigNumbersMethodArguments[0] = linkedHashMap;
        addPaxHeadersForBigNumbersMethodArguments[1] = tarArchiveEntry;
        addPaxHeadersForBigNumbersMethod.invoke(tarArchiveOutputStream, addPaxHeadersForBigNumbersMethodArguments);
    }
    
    @Test
    public void testAddPaxHeadersForBigNumbers3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setGroupId(536870912);
        tarArchiveEntry.setSize(java.lang.Long.MIN_VALUE);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class tarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Method addPaxHeadersForBigNumbersMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("addPaxHeadersForBigNumbers", linkedHashMapType, tarArchiveEntryType);
        addPaxHeadersForBigNumbersMethod.setAccessible(true);
        java.lang.Object[] addPaxHeadersForBigNumbersMethodArguments = new java.lang.Object[2];
        addPaxHeadersForBigNumbersMethodArguments[0] = linkedHashMap;
        addPaxHeadersForBigNumbersMethodArguments[1] = tarArchiveEntry;
        addPaxHeadersForBigNumbersMethod.invoke(tarArchiveOutputStream, addPaxHeadersForBigNumbersMethodArguments);
    }
    
    @Test
    public void testAddPaxHeadersForBigNumbers4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setGroupId(1);
        tarArchiveEntry.setSize(2L);
        tarArchiveEntry.setModTime(1586419995590290048L);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class tarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Method addPaxHeadersForBigNumbersMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("addPaxHeadersForBigNumbers", linkedHashMapType, tarArchiveEntryType);
        addPaxHeadersForBigNumbersMethod.setAccessible(true);
        java.lang.Object[] addPaxHeadersForBigNumbersMethodArguments = new java.lang.Object[2];
        addPaxHeadersForBigNumbersMethodArguments[0] = linkedHashMap;
        addPaxHeadersForBigNumbersMethodArguments[1] = tarArchiveEntry;
        addPaxHeadersForBigNumbersMethod.invoke(tarArchiveOutputStream, addPaxHeadersForBigNumbersMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addPaxHeadersForBigNumbers(java.util.Map, org.apache.commons.compress.archivers.tar.TarArchiveEntry)
    
    @Test
    public void testAddPaxHeadersForBigNumbers5() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setUserId(4194305);
        tarArchiveEntry.setGroupId(1);
        tarArchiveEntry.setSize(1L);
        tarArchiveEntry.setModTime(258254417031955149L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeadersForBigNumbers] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeaderForBigNumber(TarArchiveOutputStream.java:556)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeadersForBigNumbers(TarArchiveOutputStream.java:541) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class mapType = Class.forName("java.util.Map");
        Class tarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Method addPaxHeadersForBigNumbersMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("addPaxHeadersForBigNumbers", mapType, tarArchiveEntryType);
        addPaxHeadersForBigNumbersMethod.setAccessible(true);
        java.lang.Object[] addPaxHeadersForBigNumbersMethodArguments = new java.lang.Object[2];
        addPaxHeadersForBigNumbersMethodArguments[0] = ((Object) null);
        addPaxHeadersForBigNumbersMethodArguments[1] = tarArchiveEntry;
        try {
            addPaxHeadersForBigNumbersMethod.invoke(tarArchiveOutputStream, addPaxHeadersForBigNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddPaxHeadersForBigNumbers6() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setGroupId(2);
        tarArchiveEntry.setSize(8589934591L);
        tarArchiveEntry.setModTime(276701161105643266L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeadersForBigNumbers] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeaderForBigNumber(TarArchiveOutputStream.java:556)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeadersForBigNumbers(TarArchiveOutputStream.java:538) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class mapType = Class.forName("java.util.Map");
        Class tarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Method addPaxHeadersForBigNumbersMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("addPaxHeadersForBigNumbers", mapType, tarArchiveEntryType);
        addPaxHeadersForBigNumbersMethod.setAccessible(true);
        java.lang.Object[] addPaxHeadersForBigNumbersMethodArguments = new java.lang.Object[2];
        addPaxHeadersForBigNumbersMethodArguments[0] = ((Object) null);
        addPaxHeadersForBigNumbersMethodArguments[1] = tarArchiveEntry;
        try {
            addPaxHeadersForBigNumbersMethod.invoke(tarArchiveOutputStream, addPaxHeadersForBigNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddPaxHeadersForBigNumbers7() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setSize(4611686018427387905L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeadersForBigNumbers] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeaderForBigNumber(TarArchiveOutputStream.java:556)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeadersForBigNumbers(TarArchiveOutputStream.java:534) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class mapType = Class.forName("java.util.Map");
        Class tarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Method addPaxHeadersForBigNumbersMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("addPaxHeadersForBigNumbers", mapType, tarArchiveEntryType);
        addPaxHeadersForBigNumbersMethod.setAccessible(true);
        java.lang.Object[] addPaxHeadersForBigNumbersMethodArguments = new java.lang.Object[2];
        addPaxHeadersForBigNumbersMethodArguments[0] = ((Object) null);
        addPaxHeadersForBigNumbersMethodArguments[1] = tarArchiveEntry;
        try {
            addPaxHeadersForBigNumbersMethod.invoke(tarArchiveOutputStream, addPaxHeadersForBigNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setAddPaxHeadersForNonAsciiNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setAddPaxHeadersForNonAsciiNames(boolean)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#setAddPaxHeadersForNonAsciiNames(boolean)}
 *  */
    @Test
    public void testSetAddPaxHeadersForNonAsciiNames() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        tarArchiveOutputStream.setAddPaxHeadersForNonAsciiNames(false);
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
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry] produces [java.lang.ClassCastException: class org.apache.commons.compress.archivers.ar.ArArchiveEntry cannot be cast to class org.apache.commons.compress.archivers.tar.TarArchiveEntry (org.apache.commons.compress.archivers.ar.ArArchiveEntry and org.apache.commons.compress.archivers.tar.TarArchiveEntry are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @76774c2c)]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(TarArchiveOutputStream.java:267) */
        tarArchiveOutputStream.putArchiveEntry(arArchiveEntry);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String entryName = entry.getName();
 *  */
    @Test
    public void testPutArchiveEntry_ThrowNullPointerException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(TarArchiveOutputStream.java:269) */
        tarArchiveOutputStream.putArchiveEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getName()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipEncoding#encode(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final ByteBuffer encodedName = encoding.encode(entryName);
 *  */
    @Test
    public void testPutArchiveEntry_ThrowNullPointerException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = "";
        tarArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(TarArchiveOutputStream.java:270) */
        tarArchiveOutputStream.putArchiveEntry(tarArchiveEntry);
    }
    ///endregion
    
    ///region OTHER: SECURITY for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    @Test(expected = ExceptionInInitializerError.class)
    @Ignore(value = "Disabled due to sandbox")
    public void testPutArchiveEntry1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object encoding = createInstance("org.apache.commons.compress.archivers.zip.FallbackZipEncoding");
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "encoding", encoding);
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = "";
        tarArchiveEntry.setName(name);
        
        tarArchiveOutputStream.putArchiveEntry(tarArchiveEntry);
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setBigNumberMode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setBigNumberMode(int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#setBigNumberMode(int)}
 *  */
    @Test
    public void testSetBigNumberMode() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        tarArchiveOutputStream.setBigNumberMode(-255);
        
        tarArchiveOutputStream.setBigNumberMode(-255);
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getRecordSize(TarArchiveOutputStream.java:246) */
        tarArchiveOutputStream.getRecordSize();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.stripTo7Bits
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method stripTo7Bits(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#stripTo7Bits(java.lang.String)}
 * @utbot.returnsFrom {@code return result.toString();}
 *  */
    @Test
    public void testStripTo7Bits_ReturnResultToString() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        String string = "";
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class stringType = Class.forName("java.lang.String");
        Method stripTo7BitsMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("stripTo7Bits", stringType);
        stripTo7BitsMethod.setAccessible(true);
        java.lang.Object[] stripTo7BitsMethodArguments = new java.lang.Object[1];
        stripTo7BitsMethodArguments[0] = string;
        String actual = ((String) stripTo7BitsMethod.invoke(tarArchiveOutputStream, stripTo7BitsMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#stripTo7Bits(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.returnsFrom {@code return result.toString();}
 *  */
    @Test
    public void testStripTo7Bits_StrippedEqualsZero() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        String string = "\u0000";
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class stringType = Class.forName("java.lang.String");
        Method stripTo7BitsMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("stripTo7Bits", stringType);
        stripTo7BitsMethod.setAccessible(true);
        java.lang.Object[] stripTo7BitsMethodArguments = new java.lang.Object[1];
        stripTo7BitsMethodArguments[0] = string;
        String actual = ((String) stripTo7BitsMethod.invoke(tarArchiveOutputStream, stripTo7BitsMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#stripTo7Bits(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.returnsFrom {@code return result.toString();}
 *  */
    @Test
    public void testStripTo7Bits_StrippedNotEqualsZero() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        String string = " ";
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class stringType = Class.forName("java.lang.String");
        Method stripTo7BitsMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("stripTo7Bits", stringType);
        stripTo7BitsMethod.setAccessible(true);
        java.lang.Object[] stripTo7BitsMethodArguments = new java.lang.Object[1];
        stripTo7BitsMethodArguments[0] = string;
        String actual = ((String) stripTo7BitsMethod.invoke(tarArchiveOutputStream, stripTo7BitsMethodArguments));
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method stripTo7Bits(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#stripTo7Bits(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int length = name.length();
 *  */
    @Test
    public void testStripTo7Bits_ThrowNullPointerException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.stripTo7Bits] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.stripTo7Bits(TarArchiveOutputStream.java:494) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class stringType = Class.forName("java.lang.String");
        Method stripTo7BitsMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("stripTo7Bits", stringType);
        stripTo7BitsMethod.setAccessible(true);
        java.lang.Object[] stripTo7BitsMethodArguments = new java.lang.Object[1];
        stripTo7BitsMethodArguments[0] = ((Object) null);
        try {
            stripTo7BitsMethod.invoke(tarArchiveOutputStream, stripTo7BitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method stripTo7Bits(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#stripTo7Bits(java.lang.String)}
     */
    @Test
    public void testStripTo7BitsWithBlankString() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        TarArchiveOutputStream tarArchiveOutputStream = new TarArchiveOutputStream(filterOutputStream, 0, 1, "10");
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class stringType = Class.forName("java.lang.String");
        Method stripTo7BitsMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("stripTo7Bits", stringType);
        stripTo7BitsMethod.setAccessible(true);
        java.lang.Object[] stripTo7BitsMethodArguments = new java.lang.Object[1];
        stripTo7BitsMethodArguments[0] = "\n\r";
        String actual = ((String) stripTo7BitsMethod.invoke(tarArchiveOutputStream, stripTo7BitsMethodArguments));
        
        String expected = "\n\r";
        
        assertEquals(expected, actual);
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
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 256);
        byte[] blockBuffer = {(byte) -127};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 255);
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:510) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:514) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:514) */
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
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 256);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(TarBuffer.java:315)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:514) */
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
        LZMA2InputStream inStream = ((LZMA2InputStream) createInstance("org.tukaani.xz.LZMA2InputStream"));
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
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
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
        JarOutputStream outStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(2L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(outStream, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(outStream, "java.util.zip.ZipOutputStream", "locoff", -1L);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
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
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 2);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 98);
        byte[] blockBuffer = {(byte) 0, (byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 98);
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
        JarOutputStream outStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(3578109905372580351L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(outStream, "java.util.zip.ZipOutputStream", "written", -9221120236695505409L);
        setField(outStream, "java.util.zip.ZipOutputStream", "locoff", 5647513931641465857L);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -242);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -242);
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
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -3);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        byte[] blockBuffer = {};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
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
        // 50 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writePaxHeaders(java.lang.String, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writePaxHeaders(java.lang.String,java.util.Map)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#stripTo7Bits(java.lang.String)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = "./PaxHeaders.X/" + stripTo7Bits(entryName);
 *  */
    @Test
    public void testWritePaxHeaders_ThrowNullPointerException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.stripTo7Bits(TarArchiveOutputStream.java:494)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(TarArchiveOutputStream.java:456) */
        tarArchiveOutputStream.writePaxHeaders(null, null);
    }
    ///endregion
    
    ///region OTHER: SECURITY for method writePaxHeaders(java.lang.String, java.util.Map)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testWritePaxHeaders1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        String string = "\u0001";
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "user.name" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:952)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:191)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:225)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:211)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:251)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(TarArchiveOutputStream.java:462) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testWritePaxHeaders2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        String string = "\u0000\u0000\u0000\u0000\u0001";
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "user.name" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:952)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:191)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:225)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:211)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:251)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(TarArchiveOutputStream.java:462) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testWritePaxHeaders3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        String string = "\u0000\u0001\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "user.name" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:952)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:191)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:225)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:211)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:251)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(TarArchiveOutputStream.java:462) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testWritePaxHeaders4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        String string = "\u0001\u0001\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "user.name" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:952)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:191)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:225)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:211)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:251)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(TarArchiveOutputStream.java:462) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testWritePaxHeaders5() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        String string = "\u0001\u0000\u0001";
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "user.name" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:952)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:191)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:225)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:211)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:251)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(TarArchiveOutputStream.java:462) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testWritePaxHeaders6() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "user.name" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:952)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:191)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:225)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:211)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:251)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(TarArchiveOutputStream.java:462) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:191)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:278)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.createArchiveEntry(TarArchiveOutputStream.java:529) */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): False}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.executesCondition {@code (currBytes < currSize): False}
 *  */
    @Test
    public void testCloseArchiveEntry_CurrBytesGreaterOrEqualCurrSize() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -255L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -255L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        tarArchiveOutputStream.closeArchiveEntry();
        
        boolean finalTarArchiveOutputStreamHaveUnclosedEntry = ((Boolean) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry"));
        
        assertFalse(finalTarArchiveOutputStreamHaveUnclosedEntry);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): True}
 * @utbot.throwsException {@link java.io.IOException} when: finished
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): True}
 * @utbot.throwsException {@link java.io.IOException} when: !haveUnclosedEntry
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -14L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -29L);
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
        ArArchiveOutputStream outStream = ((ArArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -2);
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
        FileInputStream inStream = ((FileInputStream) createInstance("org.apache.commons.compress.compressors.pack200.TempFileCachingStreamBridge$1"));
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
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_6() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(outStream, "java.util.zip.ZipOutputStream", "closed", true);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
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
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_7() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarOutputStream outStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(108121575428980736L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(outStream, "java.util.zip.ZipOutputStream", "written", -9151303413264678916L);
        setField(outStream, "java.util.zip.ZipOutputStream", "locoff", 9187319085015891965L);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
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
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_8() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
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
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_9() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarOutputStream outStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(20L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(outStream, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(outStream, "java.util.zip.ZipOutputStream", "locoff", -18L);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 2);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        byte[] blockBuffer = {(byte) 0, (byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
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
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
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
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -3);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        byte[] blockBuffer = {};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
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
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer.writeRecord(assemBuf);
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ArArchiveOutputStream outStream = ((ArArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", assemBuf);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(TarBuffer.java:315)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry(TarArchiveOutputStream.java:355) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry(TarArchiveOutputStream.java:351) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry(TarArchiveOutputStream.java:355) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry(TarArchiveOutputStream.java:355) */
        tarArchiveOutputStream.closeArchiveEntry();
    }
    ///endregion
    
    ///region Errors report for closeArchiveEntry
    
    public void testCloseArchiveEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 43 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method failForBigNumber(java.lang.String, long, long)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumber(java.lang.String,long,long)}
 * @utbot.executesCondition {@code (value < 0): False}
 * @utbot.executesCondition {@code (value > maxValue): False}
 *  */
    @Test
    public void testFailForBigNumber_ValueLessOrEqualMaxValue() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class stringType = Class.forName("java.lang.String");
        Class longType = long.class;
        Method failForBigNumberMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("failForBigNumber", stringType, longType, longType);
        failForBigNumberMethod.setAccessible(true);
        java.lang.Object[] failForBigNumberMethodArguments = new java.lang.Object[3];
        failForBigNumberMethodArguments[0] = ((Object) null);
        failForBigNumberMethodArguments[1] = 0L;
        failForBigNumberMethodArguments[2] = 0L;
        failForBigNumberMethod.invoke(tarArchiveOutputStream, failForBigNumberMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method failForBigNumber(java.lang.String, long, long)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumber(java.lang.String,long,long)}
 * @utbot.executesCondition {@code (value < 0): True}
 * @utbot.throwsException {@link java.lang.RuntimeException} when: value < 0 || value > maxValue
 *  */
    @Test(expected = RuntimeException.class)
    public void testFailForBigNumber_ThrowRuntimeException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class stringType = Class.forName("java.lang.String");
        Class longType = long.class;
        Method failForBigNumberMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("failForBigNumber", stringType, longType, longType);
        failForBigNumberMethod.setAccessible(true);
        java.lang.Object[] failForBigNumberMethodArguments = new java.lang.Object[3];
        failForBigNumberMethodArguments[0] = ((Object) null);
        failForBigNumberMethodArguments[1] = -255L;
        failForBigNumberMethodArguments[2] = -255L;
        try {
            failForBigNumberMethod.invoke(tarArchiveOutputStream, failForBigNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumber(java.lang.String,long,long)}
 * @utbot.executesCondition {@code (value < 0): False}
 * @utbot.executesCondition {@code (value > maxValue): True}
 * @utbot.throwsException {@link java.lang.RuntimeException} when: value < 0 || value > maxValue
 *  */
    @Test(expected = RuntimeException.class)
    public void testFailForBigNumber_ThrowRuntimeException_1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class stringType = Class.forName("java.lang.String");
        Class longType = long.class;
        Method failForBigNumberMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("failForBigNumber", stringType, longType, longType);
        failForBigNumberMethod.setAccessible(true);
        java.lang.Object[] failForBigNumberMethodArguments = new java.lang.Object[3];
        failForBigNumberMethodArguments[0] = ((Object) null);
        failForBigNumberMethodArguments[1] = 0L;
        failForBigNumberMethodArguments[2] = -255L;
        try {
            failForBigNumberMethod.invoke(tarArchiveOutputStream, failForBigNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumbers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method failForBigNumbers(org.apache.commons.compress.archivers.tar.TarArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumbers(org.apache.commons.compress.archivers.tar.TarArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getSize()}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumber(java.lang.String,long,long)
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getGroupId()}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumber(java.lang.String,long,long)
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getModTime()}
 * @utbot.invokes {@link java.util.Date#getTime()}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumber(java.lang.String,long,long)
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getUserId()}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumber(java.lang.String,long,long)
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getMode()}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumber(java.lang.String,long,long)
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getDevMajor()}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumber(java.lang.String,long,long)
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getDevMinor()}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumber(java.lang.String,long,long)
 *  */
    @Test
    public void testFailForBigNumbers_TarArchiveOutputStreamFailForBigNumber() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setMode(1);
        tarArchiveEntry.setUserId(1);
        tarArchiveEntry.setGroupId(16);
        tarArchiveEntry.setSize(0L);
        tarArchiveEntry.setModTime(1L);
        tarArchiveEntry.setDevMajor(1);
        tarArchiveEntry.setDevMinor(1);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class tarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Method failForBigNumbersMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("failForBigNumbers", tarArchiveEntryType);
        failForBigNumbersMethod.setAccessible(true);
        java.lang.Object[] failForBigNumbersMethodArguments = new java.lang.Object[1];
        failForBigNumbersMethodArguments[0] = tarArchiveEntry;
        failForBigNumbersMethod.invoke(tarArchiveOutputStream, failForBigNumbersMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method failForBigNumbers(org.apache.commons.compress.archivers.tar.TarArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumbers(org.apache.commons.compress.archivers.tar.TarArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getSize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: failForBigNumber("entry size", entry.getSize(), TarConstants.MAXSIZE);
 *  */
    @Test
    public void testFailForBigNumbers_ThrowNullPointerException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumbers] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumbers(TarArchiveOutputStream.java:561) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class tarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Method failForBigNumbersMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("failForBigNumbers", tarArchiveEntryType);
        failForBigNumbersMethod.setAccessible(true);
        java.lang.Object[] failForBigNumbersMethodArguments = new java.lang.Object[1];
        failForBigNumbersMethodArguments[0] = ((Object) null);
        try {
            failForBigNumbersMethod.invoke(tarArchiveOutputStream, failForBigNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method failForBigNumbers(org.apache.commons.compress.archivers.tar.TarArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumbers(org.apache.commons.compress.archivers.tar.TarArchiveEntry)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: failForBigNumber("entry size", entry.getSize(), TarConstants.MAXSIZE);
 *  */
    @Test(expected = RuntimeException.class)
    public void testFailForBigNumbers_ThrowRuntimeException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setSize(17179869185L);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class tarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Method failForBigNumbersMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("failForBigNumbers", tarArchiveEntryType);
        failForBigNumbersMethod.setAccessible(true);
        java.lang.Object[] failForBigNumbersMethodArguments = new java.lang.Object[1];
        failForBigNumbersMethodArguments[0] = tarArchiveEntry;
        try {
            failForBigNumbersMethod.invoke(tarArchiveOutputStream, failForBigNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumbers(org.apache.commons.compress.archivers.tar.TarArchiveEntry)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: failForBigNumber("entry size", entry.getSize(), TarConstants.MAXSIZE);
 *  */
    @Test(expected = RuntimeException.class)
    public void testFailForBigNumbers_ThrowRuntimeException_1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setSize(-255L);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class tarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Method failForBigNumbersMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("failForBigNumbers", tarArchiveEntryType);
        failForBigNumbersMethod.setAccessible(true);
        java.lang.Object[] failForBigNumbersMethodArguments = new java.lang.Object[1];
        failForBigNumbersMethodArguments[0] = tarArchiveEntry;
        try {
            failForBigNumbersMethod.invoke(tarArchiveOutputStream, failForBigNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumbers(org.apache.commons.compress.archivers.tar.TarArchiveEntry)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: failForBigNumber("group id", entry.getGroupId(), TarConstants.MAXID);
 *  */
    @Test(expected = RuntimeException.class)
    public void testFailForBigNumbers_ThrowRuntimeException_2() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setGroupId(-255);
        tarArchiveEntry.setSize(1L);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class tarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Method failForBigNumbersMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("failForBigNumbers", tarArchiveEntryType);
        failForBigNumbersMethod.setAccessible(true);
        java.lang.Object[] failForBigNumbersMethodArguments = new java.lang.Object[1];
        failForBigNumbersMethodArguments[0] = tarArchiveEntry;
        try {
            failForBigNumbersMethod.invoke(tarArchiveOutputStream, failForBigNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumbers(org.apache.commons.compress.archivers.tar.TarArchiveEntry)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: failForBigNumber("user id", entry.getUserId(), TarConstants.MAXID);
 *  */
    @Test(expected = RuntimeException.class)
    public void testFailForBigNumbers_ThrowRuntimeException_3() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setUserId(4194305);
        tarArchiveEntry.setGroupId(1);
        tarArchiveEntry.setSize(2L);
        tarArchiveEntry.setModTime(1L);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class tarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Method failForBigNumbersMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("failForBigNumbers", tarArchiveEntryType);
        failForBigNumbersMethod.setAccessible(true);
        java.lang.Object[] failForBigNumbersMethodArguments = new java.lang.Object[1];
        failForBigNumbersMethodArguments[0] = tarArchiveEntry;
        try {
            failForBigNumbersMethod.invoke(tarArchiveOutputStream, failForBigNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumbers(org.apache.commons.compress.archivers.tar.TarArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getMode()}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumber(java.lang.String,long,long)
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getDevMajor()}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumber(java.lang.String,long,long)
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getDevMinor()}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumber(java.lang.String,long,long)
 * @utbot.throwsException {@link java.lang.RuntimeException} in: failForBigNumber("minor device number", entry.getDevMinor(), TarConstants.MAXID);
 *  */
    @Test(expected = RuntimeException.class)
    public void testFailForBigNumbers_ThrowRuntimeException_4() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setMode(1);
        tarArchiveEntry.setUserId(1);
        tarArchiveEntry.setGroupId(1);
        tarArchiveEntry.setSize(2L);
        tarArchiveEntry.setModTime(129L);
        tarArchiveEntry.setDevMajor(1);
        tarArchiveEntry.setDevMinor(-255);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class tarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Method failForBigNumbersMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("failForBigNumbers", tarArchiveEntryType);
        failForBigNumbersMethod.setAccessible(true);
        java.lang.Object[] failForBigNumbersMethodArguments = new java.lang.Object[1];
        failForBigNumbersMethodArguments[0] = tarArchiveEntry;
        try {
            failForBigNumbersMethod.invoke(tarArchiveOutputStream, failForBigNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeaderForBigNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addPaxHeaderForBigNumber(java.util.Map, java.lang.String, long, long)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#addPaxHeaderForBigNumber(java.util.Map,java.lang.String,long,long)}
 * @utbot.executesCondition {@code (value > maxValue): False}
 *  */
    @Test
    public void testAddPaxHeaderForBigNumber_ValueLessOrEqualMaxValue() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class mapType = Class.forName("java.util.Map");
        Class stringType = Class.forName("java.lang.String");
        Class longType = long.class;
        Method addPaxHeaderForBigNumberMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("addPaxHeaderForBigNumber", mapType, stringType, longType, longType);
        addPaxHeaderForBigNumberMethod.setAccessible(true);
        java.lang.Object[] addPaxHeaderForBigNumberMethodArguments = new java.lang.Object[4];
        addPaxHeaderForBigNumberMethodArguments[0] = ((Object) null);
        addPaxHeaderForBigNumberMethodArguments[1] = ((Object) null);
        addPaxHeaderForBigNumberMethodArguments[2] = 0L;
        addPaxHeaderForBigNumberMethodArguments[3] = 0L;
        addPaxHeaderForBigNumberMethod.invoke(tarArchiveOutputStream, addPaxHeaderForBigNumberMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#addPaxHeaderForBigNumber(java.util.Map,java.lang.String,long,long)}
 * @utbot.executesCondition {@code (value > maxValue): True}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testAddPaxHeaderForBigNumber_ValueGreaterThanMaxValue() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "";
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringType = Class.forName("java.lang.String");
        Class longType = long.class;
        Method addPaxHeaderForBigNumberMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("addPaxHeaderForBigNumber", linkedHashMapType, stringType, longType, longType);
        addPaxHeaderForBigNumberMethod.setAccessible(true);
        java.lang.Object[] addPaxHeaderForBigNumberMethodArguments = new java.lang.Object[4];
        addPaxHeaderForBigNumberMethodArguments[0] = linkedHashMap;
        addPaxHeaderForBigNumberMethodArguments[1] = string;
        addPaxHeaderForBigNumberMethodArguments[2] = 0L;
        addPaxHeaderForBigNumberMethodArguments[3] = -255L;
        addPaxHeaderForBigNumberMethod.invoke(tarArchiveOutputStream, addPaxHeaderForBigNumberMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addPaxHeaderForBigNumber(java.util.Map, java.lang.String, long, long)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#addPaxHeaderForBigNumber(java.util.Map,java.lang.String,long,long)}
 * @utbot.executesCondition {@code (value < 0): False}
 * @utbot.executesCondition {@code (value > maxValue): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: paxHeaders.put(header, String.valueOf(value));
 *  */
    @Test
    public void testAddPaxHeaderForBigNumber_ThrowNullPointerException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeaderForBigNumber] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeaderForBigNumber(TarArchiveOutputStream.java:556) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class mapType = Class.forName("java.util.Map");
        Class stringType = Class.forName("java.lang.String");
        Class longType = long.class;
        Method addPaxHeaderForBigNumberMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("addPaxHeaderForBigNumber", mapType, stringType, longType, longType);
        addPaxHeaderForBigNumberMethod.setAccessible(true);
        java.lang.Object[] addPaxHeaderForBigNumberMethodArguments = new java.lang.Object[4];
        addPaxHeaderForBigNumberMethodArguments[0] = ((Object) null);
        addPaxHeaderForBigNumberMethodArguments[1] = ((Object) null);
        addPaxHeaderForBigNumberMethodArguments[2] = 0L;
        addPaxHeaderForBigNumberMethodArguments[3] = -255L;
        try {
            addPaxHeaderForBigNumberMethod.invoke(tarArchiveOutputStream, addPaxHeaderForBigNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#addPaxHeaderForBigNumber(java.util.Map,java.lang.String,long,long)}
 * @utbot.executesCondition {@code (value < 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: paxHeaders.put(header, String.valueOf(value));
 *  */
    @Test
    public void testAddPaxHeaderForBigNumber_ThrowNullPointerException_1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeaderForBigNumber] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeaderForBigNumber(TarArchiveOutputStream.java:556) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class mapType = Class.forName("java.util.Map");
        Class stringType = Class.forName("java.lang.String");
        Class longType = long.class;
        Method addPaxHeaderForBigNumberMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("addPaxHeaderForBigNumber", mapType, stringType, longType, longType);
        addPaxHeaderForBigNumberMethod.setAccessible(true);
        java.lang.Object[] addPaxHeaderForBigNumberMethodArguments = new java.lang.Object[4];
        addPaxHeaderForBigNumberMethodArguments[0] = ((Object) null);
        addPaxHeaderForBigNumberMethodArguments[1] = ((Object) null);
        addPaxHeaderForBigNumberMethodArguments[2] = java.lang.Long.MIN_VALUE;
        addPaxHeaderForBigNumberMethodArguments[3] = -255L;
        try {
            addPaxHeaderForBigNumberMethod.invoke(tarArchiveOutputStream, addPaxHeaderForBigNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.flush(TarArchiveOutputStream.java:519) */
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
        
        // 3 occurrences of:
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -69L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -70L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        XZOutputStream outStream = ((XZOutputStream) createInstance("org.tukaani.xz.XZOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        byte[] blockBuffer = {(byte) -127};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -256);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 0, 1);
        
        long finalTarArchiveOutputStreamCurrBytes = ((Long) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes"));
        TarBuffer tarBuffer = tarArchiveOutputStream.buffer;
        int finalTarArchiveOutputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        
        assertEquals(-69L, finalTarArchiveOutputStreamCurrBytes);
        
        assertEquals(-255, finalTarArchiveOutputStreamBufferCurrRecIdx);
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
    public void testWrite_ThrowIOException_7() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -189L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -190L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        XZCompressorOutputStream outStream = ((XZCompressorOutputStream) createInstance("org.apache.commons.compress.compressors.xz.XZCompressorOutputStream"));
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
    public void testWrite_ThrowIOException_9() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -247L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -247L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        TarArchiveOutputStream outStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
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
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.iterates iterate the loop {@code while(numToWrite > 0)} once
 * @utbot.throwsException {@link java.io.IOException} in: buffer.writeRecord(wBuf, wOffset);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -249L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -250L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object inStream = createInstance("java.lang.ProcessBuilder$NullInputStream");
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.write(null, -255, 1);
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
    public void testWrite_ThrowIOException_2() throws Exception  {
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -110L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -111L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(2L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(outStream, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(outStream, "java.util.zip.ZipOutputStream", "locoff", -1L);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -128);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -254);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -254);
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
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -253L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -254L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GZIPOutputStream outStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -254);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 254, 1);
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -125L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -126L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 2);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -119);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        byte[] blockBuffer = {(byte) 0, (byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 119, 1);
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -251L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -252L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarOutputStream outStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(0L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(outStream, "java.util.zip.ZipOutputStream", "written", -35184372088836L);
        setField(outStream, "java.util.zip.ZipOutputStream", "locoff", -35184372088835L);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -128);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -254);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", recordBuf);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -254);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        tarArchiveOutputStream.write(byteArray, 130, 1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code ((currBytes + numToWrite) > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.iterates iterate the loop {@code while(numToWrite > 0)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: buffer.writeRecord(wBuf, wOffset);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_ThrowIndexOutOfBoundsException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -141L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -142L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        byte[] byteArray = {(byte) -127};
        
        tarArchiveOutputStream.write(byteArray, 256, 1);
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:416) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:432) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:405) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:431) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:402) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:416) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:432) */
        tarArchiveOutputStream.write(byteArray, -255, 1);
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:440) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:405) */
        tarArchiveOutputStream.write(null, -255, -1);
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -254L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -254L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:409) */
        tarArchiveOutputStream.write(byteArray, 0, 0);
    }
    ///endregion
    
    ///region Errors report for write
    
    public void testWrite_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 39 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
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
        BufferedInputStream inStream = ((BufferedInputStream) createInstance("java.io.BufferedInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.close();
        
        TarBuffer tarBuffer = tarArchiveOutputStream.buffer;
        InputStream finalTarArchiveOutputStreamBufferInStream = ((InputStream) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream"));
        boolean finalTarArchiveOutputStreamClosed = ((Boolean) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closed"));
        
        assertNull(finalTarArchiveOutputStreamBufferInStream);
        
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
        BufferedInputStream inStream = ((BufferedInputStream) createInstance("java.io.BufferedInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.DeflaterOutputStream", "closed", true);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.close();
        
        TarBuffer tarBuffer = tarArchiveOutputStream.buffer;
        InputStream finalTarArchiveOutputStreamBufferInStream = ((InputStream) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream"));
        boolean finalTarArchiveOutputStreamClosed = ((Boolean) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closed"));
        OutputStream tarArchiveOutputStreamOut = ((OutputStream) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out"));
        boolean finalTarArchiveOutputStreamOutClosed = ((Boolean) getFieldValue(tarArchiveOutputStreamOut, "java.util.zip.ZipOutputStream", "closed"));
        
        assertNull(finalTarArchiveOutputStreamBufferInStream);
        
        assertTrue(finalTarArchiveOutputStreamClosed);
        
        assertTrue(finalTarArchiveOutputStreamOutClosed);
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
    public void testClose_NotClosed_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        BufferedInputStream inStream = ((BufferedInputStream) createInstance("java.io.BufferedInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.close();
        
        TarBuffer tarBuffer = tarArchiveOutputStream.buffer;
        InputStream finalTarArchiveOutputStreamBufferInStream = ((InputStream) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream"));
        boolean finalTarArchiveOutputStreamClosed = ((Boolean) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closed"));
        OutputStream tarArchiveOutputStreamOut = ((OutputStream) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out"));
        boolean finalTarArchiveOutputStreamOutClosed = ((Boolean) getFieldValue(tarArchiveOutputStreamOut, "java.util.zip.DeflaterOutputStream", "closed"));
        
        assertNull(finalTarArchiveOutputStreamBufferInStream);
        
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
        JarOutputStream out1 = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
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
    public void testClose_NotClosed_5() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
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
    public void testClose_ThrowNullPointerException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:234) */
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: finish();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_12() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:510)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:217)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:230) */
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: finish();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:514)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:217)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:230) */
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
    public void testClose_ThrowNullPointerException_5() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
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
    public void testClose_ThrowNullPointerException_11() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            java.base/java.io.PrintStream.close(PrintStream.java:445)
            org.apache.commons.compress.archivers.tar.TarBuffer.close(TarBuffer.java:397)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:234) */
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: finish();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_13() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipArchiveOutputStream outStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 256);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(TarBuffer.java:315)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:514)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:217)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:230) */
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
    public void testClose_ThrowNullPointerException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        BufferedInputStream inStream = ((BufferedInputStream) createInstance("java.io.BufferedInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:235) */
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
    public void testClose_ThrowNullPointerException_7() throws Exception  {
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
    public void testClose_ThrowNullPointerException_8() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        InflaterInputStream inStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
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
    public void testClose_ThrowNullPointerException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:235) */
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
        InflaterInputStream inStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        ZipInputStream in = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
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
    public void testClose_ThrowNullPointerException_10() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipInputStream inStream = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
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
        XZCompressorOutputStream outStream = ((XZCompressorOutputStream) createInstance("org.apache.commons.compress.compressors.xz.XZCompressorOutputStream"));
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
    public void testClose_ThrowIOException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        FileInputStream inStream = ((FileInputStream) createInstance("java.io.FileInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
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
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        FileInputStream inStream = ((FileInputStream) createInstance("java.io.FileInputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
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
    public void testClose_ThrowIOException_4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
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
        entry.setSize(-9223372036854775806L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(outStream, "java.util.zip.ZipOutputStream", "written", java.lang.Long.MIN_VALUE);
        setField(outStream, "java.util.zip.ZipOutputStream", "locoff", 0L);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 2);
        byte[] blockBuffer = {(byte) 0, (byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1);
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
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
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
    public void testClose_ThrowIOException_7() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setSize(2L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(outStream, "java.util.zip.ZipOutputStream", "written", -9223372036854775806L);
        setField(outStream, "java.util.zip.ZipOutputStream", "locoff", -9223372036854775807L);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1);
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
    public void testClose_ThrowIOException_8() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarOutputStream outStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setSize(1808L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(outStream, "java.util.zip.ZipOutputStream", "written", 654L);
        setField(outStream, "java.util.zip.ZipOutputStream", "locoff", -1152L);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 2);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        byte[] blockBuffer = {(byte) 0, (byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: buffer.close();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testClose_ThrowIndexOutOfBoundsException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 253);
        byte[] blockBuffer = {};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: finish();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testClose_ThrowIndexOutOfBoundsException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: buffer.close();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testClose_ThrowIndexOutOfBoundsException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GZIPOutputStream outStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -3);
        byte[] blockBuffer = {};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testClose_ThrowNullPointerException_14() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        InflaterInputStream inStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
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
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.invokes {@link java.io.OutputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.close();
 *  */
    @Test(expected = NullPointerException.class)
    public void testClose_ThrowNullPointerException_15() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        Object cleanable = createInstance("java.net.SocketCleanable");
        setField(zsRef, "java.util.zip.Deflater$DeflaterZStreamRef", "cleanable", cleanable);
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.util.zip.DeflaterOutputStream", "usesDefaultDeflater", true);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.close();
    }
    ///endregion
    
    ///region Errors report for close
    
    public void testClose_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 29 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 18 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field private static final java.util.concurrent.atomic.AtomicInteger sun.net.ResourceManager.numSockets accessible:
        module java.base does not "opens sun.net" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish
    
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
    public void testFinish_ThrowIOException_4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        FileInputStream inStream = ((FileInputStream) createInstance("org.apache.commons.compress.compressors.pack200.TempFileCachingStreamBridge$1"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "inStream", inStream);
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
    public void testFinish_ThrowIOException_5() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        JarOutputStream outStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(50L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(outStream, "java.util.zip.ZipOutputStream", "written", 17L);
        setField(outStream, "java.util.zip.ZipOutputStream", "locoff", -32L);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -254);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -254);
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
    public void testFinish_ThrowIOException_6() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        GZIPOutputStream outStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
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
    public void testFinish_ThrowIOException_7() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(outStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 24);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 24);
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
    public void testFinish_ThrowIOException_8() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(131074L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(outStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(outStream, "java.util.zip.ZipOutputStream", "written", 1729382256910377984L);
        setField(outStream, "java.util.zip.ZipOutputStream", "locoff", 1729382256910246911L);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(outStream, "java.io.FilterOutputStream", "out", out);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        byte[] blockBuffer = {(byte) 0};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method finish()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: writeEOFRecord();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testFinish_ThrowIndexOutOfBoundsException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", 2030043133);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        byte[] blockBuffer = {};
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -256);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.finish();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: writeEOFRecord();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testFinish_ThrowIndexOutOfBoundsException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ZipOutputStream outStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockSize", -1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", -255);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.finish();
    }
    ///endregion
    
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:510)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:217) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:514)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:217) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:514)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:217) */
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
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", 256);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(TarBuffer.java:315)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:514)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:217) */
        tarArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method finish()
    
    @Test
    public void testFinish1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ObjectOutputStream outStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", Integer.MAX_VALUE);
        byte[] blockBuffer = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", -3);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        tarArchiveOutputStream.finish();
        
        TarBuffer tarBuffer = tarArchiveOutputStream.buffer;
        int finalTarArchiveOutputStreamBufferCurrRecIdx = ((Integer) getFieldValue(tarBuffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx"));
        boolean finalTarArchiveOutputStreamFinished = ((Boolean) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished"));
        
        assertEquals(-1, finalTarArchiveOutputStreamBufferCurrRecIdx);
        
        assertTrue(finalTarArchiveOutputStreamFinished);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method finish()
    
    @Test
    public void testFinish2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ObjectOutputStream outStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 1);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recsPerBlock", Integer.MAX_VALUE);
        byte[] blockBuffer = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "blockBuffer", blockBuffer);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "currRecIdx", 2147483646);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 2147483647 out of bounds for byte[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(TarBuffer.java:315)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:514)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:217) */
        tarArchiveOutputStream.finish();
    }
    
    @Test
    public void testFinish3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:514)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:217) */
        tarArchiveOutputStream.finish();
    }
    
    @Test
    public void testFinish4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) 0, (byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        TarBuffer buffer = ((TarBuffer) createInstance("org.apache.commons.compress.archivers.tar.TarBuffer"));
        ObjectOutputStream outStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "outStream", outStream);
        setField(buffer, "org.apache.commons.compress.archivers.tar.TarBuffer", "recordSize", 2);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "buffer", buffer);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:712)
            org.apache.commons.compress.archivers.tar.TarBuffer.writeBlock(TarBuffer.java:365)
            org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(TarBuffer.java:312)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:514)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:217) */
        tarArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region Errors report for finish
    
    public void testFinish_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 42 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCount()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#getCount()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#getBytesWritten()}
 * @utbot.returnsFrom {@code return (int) getBytesWritten();}
 *  */
    @Test
    public void testGetCount_TarArchiveOutputStreamGetBytesWritten() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        CountingOutputStream out = ((CountingOutputStream) createInstance("org.apache.commons.compress.utils.CountingOutputStream"));
        setField(out, "org.apache.commons.compress.utils.CountingOutputStream", "bytesWritten", 0L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        int actual = tarArchiveOutputStream.getCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region Errors report for getCount
    
    public void testGetCount_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getBytesWritten
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBytesWritten()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#getBytesWritten()}
 * @utbot.invokes {@link org.apache.commons.compress.utils.CountingOutputStream#getBytesWritten()}
 * @utbot.returnsFrom {@code return ((CountingOutputStream) out).getBytesWritten();}
 *  */
    @Test
    public void testGetBytesWritten_CountingOutputStreamGetBytesWritten() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        CountingOutputStream out = ((CountingOutputStream) createInstance("org.apache.commons.compress.utils.CountingOutputStream"));
        setField(out, "org.apache.commons.compress.utils.CountingOutputStream", "bytesWritten", 0L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        long actual = tarArchiveOutputStream.getBytesWritten();
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBytesWritten()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#getBytesWritten()}
 * @utbot.invokes {@link org.apache.commons.compress.utils.CountingOutputStream#getBytesWritten()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ((CountingOutputStream) out).getBytesWritten();
 *  */
    @Test
    public void testGetBytesWritten_ThrowNullPointerException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getBytesWritten] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getBytesWritten(TarArchiveOutputStream.java:196) */
        tarArchiveOutputStream.getBytesWritten();
    }
    ///endregion
    
    ///region Errors report for getBytesWritten
    
    public void testGetBytesWritten_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
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
        
                java.lang.reflect.Method methodForGetDeclaredFields971233482494600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields971233482494600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass971233482520100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields971233482494600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass971233482520100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields971233482988900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields971233482988900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass971233482990500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields971233482988900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass971233482990500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


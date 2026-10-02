package org.apache.commons.compress.archivers.cpio;

import org.junit.Test;
import java.lang.reflect.Method;
import java.io.IOException;
import java.util.zip.ZipOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Deflater;
import java.io.ObjectOutputStream;
import java.util.jar.JarOutputStream;
import java.util.HashMap;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.zip.CheckedOutputStream;
import java.io.FileOutputStream;
import java.io.FileDescriptor;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.io.PrintStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.jar.JarEntry;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_compress_archivers_cpio_CpioArchiveOutputStreamTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getFormat()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(e.getFormat())
 *  */
    @Test
    public void testWriteHeader_ThrowNullPointerException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:247) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeHeaderMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeHeader", cpioArchiveEntryType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = ((Object) null);
        try {
            writeHeaderMethod.invoke(cpioArchiveOutputStream, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getFormat()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getFormat()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.activatesSwitch {@code switch(e.getFormat()) case: default}
 * @utbot.throwsException {@link java.io.IOException} when: switch(e.getFormat()) case: default
 *  */
    @Test(expected = IOException.class)
    public void testWriteHeader_ThrowIOException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 3);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeHeaderMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeHeader", cpioArchiveEntryType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = cpioArchiveEntry;
        try {
            writeHeaderMethod.invoke(cpioArchiveOutputStream, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    @Test
    public void testWriteHeader1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 8);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:265) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeHeaderMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeHeader", cpioArchiveEntryType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = cpioArchiveEntry;
        try {
            writeHeaderMethod.invoke(cpioArchiveOutputStream, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteHeader2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 4);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:259) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeHeaderMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeHeader", cpioArchiveEntryType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = cpioArchiveEntry;
        try {
            writeHeaderMethod.invoke(cpioArchiveOutputStream, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteHeader3() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:249) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeHeaderMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeHeader", cpioArchiveEntryType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = cpioArchiveEntry;
        try {
            writeHeaderMethod.invoke(cpioArchiveOutputStream, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteHeader4() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:254) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeHeaderMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeHeader", cpioArchiveEntryType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = cpioArchiveEntry;
        try {
            writeHeaderMethod.invoke(cpioArchiveOutputStream, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeNewEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeNewEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getInode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: long inode = entry.getInode();
 *  */
    @Test
    public void testWriteNewEntry_ThrowNullPointerException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(CpioArchiveOutputStream.java:274) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeNewEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeNewEntry", cpioArchiveEntryType);
        writeNewEntryMethod.setAccessible(true);
        java.lang.Object[] writeNewEntryMethodArguments = new java.lang.Object[1];
        writeNewEntryMethodArguments[0] = ((Object) null);
        try {
            writeNewEntryMethod.invoke(cpioArchiveOutputStream, writeNewEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeNewEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeNewEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getInode()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getDeviceMin()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: long devMin = entry.getDeviceMin();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteNewEntry_ThrowUnsupportedOperationException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -252);
        cpioArchiveEntry.setInode(-255L);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeNewEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeNewEntry", cpioArchiveEntryType);
        writeNewEntryMethod.setAccessible(true);
        java.lang.Object[] writeNewEntryMethodArguments = new java.lang.Object[1];
        writeNewEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeNewEntryMethod.invoke(cpioArchiveOutputStream, writeNewEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeNewEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    @Test
    public void testWriteNewEntry1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "nextArtificalDeviceAndInode", 576460752303423488L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 1);
        cpioArchiveEntry.setInode(0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:529)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(CpioArchiveOutputStream.java:289) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeNewEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeNewEntry", cpioArchiveEntryType);
        writeNewEntryMethod.setAccessible(true);
        java.lang.Object[] writeNewEntryMethodArguments = new java.lang.Object[1];
        writeNewEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeNewEntryMethod.invoke(cpioArchiveOutputStream, writeNewEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteNewEntry2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "nextArtificalDeviceAndInode", -9223372032559808511L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -255);
        cpioArchiveEntry.setInode(0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 1L);
        String name = " ";
        cpioArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:529)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(CpioArchiveOutputStream.java:289) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeNewEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeNewEntry", cpioArchiveEntryType);
        writeNewEntryMethod.setAccessible(true);
        java.lang.Object[] writeNewEntryMethodArguments = new java.lang.Object[1];
        writeNewEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeNewEntryMethod.invoke(cpioArchiveOutputStream, writeNewEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteNewEntry3() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "nextArtificalDeviceAndInode", 2097152L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 1);
        cpioArchiveEntry.setInode(0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:529)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(CpioArchiveOutputStream.java:289) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeNewEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeNewEntry", cpioArchiveEntryType);
        writeNewEntryMethod.setAccessible(true);
        java.lang.Object[] writeNewEntryMethodArguments = new java.lang.Object[1];
        writeNewEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeNewEntryMethod.invoke(cpioArchiveOutputStream, writeNewEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteNewEntry4() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "nextArtificalDeviceAndInode", -9223372032559808479L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 1);
        cpioArchiveEntry.setInode(32L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 0L);
        String name = " ";
        cpioArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:529)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(CpioArchiveOutputStream.java:289) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeNewEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeNewEntry", cpioArchiveEntryType);
        writeNewEntryMethod.setAccessible(true);
        java.lang.Object[] writeNewEntryMethodArguments = new java.lang.Object[1];
        writeNewEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeNewEntryMethod.invoke(cpioArchiveOutputStream, writeNewEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteNewEntry5() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "nextArtificalDeviceAndInode", 2147483648L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 1);
        cpioArchiveEntry.setInode(2147483648L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:529)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(CpioArchiveOutputStream.java:289) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeNewEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeNewEntry", cpioArchiveEntryType);
        writeNewEntryMethod.setAccessible(true);
        java.lang.Object[] writeNewEntryMethodArguments = new java.lang.Object[1];
        writeNewEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeNewEntryMethod.invoke(cpioArchiveOutputStream, writeNewEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteNewEntry6() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "nextArtificalDeviceAndInode", 0L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 1);
        cpioArchiveEntry.setInode(4294967296L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 4294967295L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:529)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(CpioArchiveOutputStream.java:289) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeNewEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeNewEntry", cpioArchiveEntryType);
        writeNewEntryMethod.setAccessible(true);
        java.lang.Object[] writeNewEntryMethodArguments = new java.lang.Object[1];
        writeNewEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeNewEntryMethod.invoke(cpioArchiveOutputStream, writeNewEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 *  */
    @Test
    public void testCloseArchiveEntry() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -255);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", -8);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 250L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 250L);
        
        cpioArchiveOutputStream.closeArchiveEntry();
        
        CpioArchiveEntry finalCpioArchiveOutputStreamEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry"));
        long finalCpioArchiveOutputStreamWritten = ((Long) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written"));
        
        assertNull(finalCpioArchiveOutputStreamEntry);
        
        assertEquals(0L, finalCpioArchiveOutputStreamWritten);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 *  */
    @Test
    public void testCloseArchiveEntry_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", java.lang.Short.MIN_VALUE);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", -1);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -128L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -128L);
        
        cpioArchiveOutputStream.closeArchiveEntry();
        
        CpioArchiveEntry finalCpioArchiveOutputStreamEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry"));
        long finalCpioArchiveOutputStreamWritten = ((Long) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written"));
        
        assertNull(finalCpioArchiveOutputStreamEntry);
        
        assertEquals(0L, finalCpioArchiveOutputStreamWritten);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.crc != this.entry.getChksum()): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getChksum()}
 *  */
    @Test
    public void testCloseArchiveEntry_ThisCrcEqualsThisEntryGetChksum() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", -2);
        entry.setChksum(-255L);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 17L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", -255L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 17L);
        
        cpioArchiveOutputStream.closeArchiveEntry();
        
        CpioArchiveEntry finalCpioArchiveOutputStreamEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry"));
        long finalCpioArchiveOutputStreamCrc = ((Long) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc"));
        long finalCpioArchiveOutputStreamWritten = ((Long) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written"));
        
        assertNull(finalCpioArchiveOutputStreamEntry);
        
        assertEquals(0L, finalCpioArchiveOutputStreamCrc);
        
        assertEquals(0L, finalCpioArchiveOutputStreamWritten);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 *  */
    @Test
    public void testCloseArchiveEntry_2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", java.lang.Short.MIN_VALUE);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -255L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -255L);
        
        cpioArchiveOutputStream.closeArchiveEntry();
        
        CpioArchiveEntry finalCpioArchiveOutputStreamEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry"));
        long finalCpioArchiveOutputStreamWritten = ((Long) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written"));
        
        assertNull(finalCpioArchiveOutputStreamEntry);
        
        assertEquals(0L, finalCpioArchiveOutputStreamWritten);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): True}
 * @utbot.throwsException {@link java.io.IOException} when: finished
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finished", true);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.throwsException {@link java.io.IOException} in: ensureOpen();
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closed", true);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (entry == null): False}
 * @utbot.executesCondition {@code (this.entry.getSize() != this.written): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getSize()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.io.IOException} in: this.entry.getSize()
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -253L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -254L);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (entry == null): False}
 * @utbot.executesCondition {@code (this.entry.getSize() != this.written): False}
 * @utbot.executesCondition {@code (this.crc != this.entry.getChksum()): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getFormat()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getChksum()}
 * @utbot.throwsException {@link java.io.IOException} when: this.entry.getFormat() == FORMAT_NEW_CRC && this.crc != this.entry.getChksum()
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_4() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", -2);
        entry.setChksum(2L);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", 3L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (entry == null): True}
 * @utbot.throwsException {@link java.io.IOException} when: entry == null
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (entry == null): False}
 * @utbot.executesCondition {@code (this.entry.getSize() != this.written): False}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: pad(this.entry.getDataPadCount());
 *  */
    @Test(expected = ZipException.class)
    public void testCloseArchiveEntry_ThrowZipException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry1 = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        (((ZipEntry) entry1)).setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry1);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (entry == null): False}
 * @utbot.executesCondition {@code (this.entry.getSize() != this.written): False}
 * @utbot.throwsException {@link java.io.IOException} in: pad(this.entry.getDataPadCount());
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_5() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (entry == null): False}
 * @utbot.executesCondition {@code (this.entry.getSize() != this.written): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_6() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry1 = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        (((ZipEntry) entry1)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry1);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (entry == null): False}
 * @utbot.executesCondition {@code (this.entry.getSize() != this.written): False}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#ensureOpen()
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getSize()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getDataPadCount()}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pad(this.entry.getDataPadCount());
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowNullPointerException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:495)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry(CpioArchiveOutputStream.java:390) */
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method closeArchiveEntry()
    
    @Test
    public void testCloseArchiveEntry1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 1);
        entry.setChksum(0L);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", java.lang.Long.MIN_VALUE);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", java.lang.Long.MIN_VALUE);
        
        cpioArchiveOutputStream.closeArchiveEntry();
        
        CpioArchiveEntry finalCpioArchiveOutputStreamEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry"));
        long finalCpioArchiveOutputStreamWritten = ((Long) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written"));
        
        assertNull(finalCpioArchiveOutputStreamEntry);
        
        assertEquals(0L, finalCpioArchiveOutputStreamWritten);
    }
    
    @Test
    public void testCloseArchiveEntry2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 0L);
        
        cpioArchiveOutputStream.closeArchiveEntry();
        
        CpioArchiveEntry finalCpioArchiveOutputStreamEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry"));
        
        assertNull(finalCpioArchiveOutputStreamEntry);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method closeArchiveEntry()
    
    @Test
    public void testCloseArchiveEntry3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 1048578);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1048576L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1048576L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1023);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 1024 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:495)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry(CpioArchiveOutputStream.java:390) */
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    @Test
    public void testCloseArchiveEntry4() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 536889408);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 536889397L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 536889397L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1073741824);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:495)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry(CpioArchiveOutputStream.java:390) */
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    ///endregion
    
    ///region Errors report for closeArchiveEntry
    
    public void testCloseArchiveEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeOldAsciiEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldAsciiEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getInode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: long inode = entry.getInode();
 *  */
    @Test
    public void testWriteOldAsciiEntry_ThrowNullPointerException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(CpioArchiveOutputStream.java:308) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeOldAsciiEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldAsciiEntry", cpioArchiveEntryType);
        writeOldAsciiEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldAsciiEntryMethodArguments = new java.lang.Object[1];
        writeOldAsciiEntryMethodArguments[0] = ((Object) null);
        try {
            writeOldAsciiEntryMethod.invoke(cpioArchiveOutputStream, writeOldAsciiEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeOldAsciiEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldAsciiEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getInode()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getDevice()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: long device = entry.getDevice();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteOldAsciiEntry_ThrowUnsupportedOperationException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -255);
        cpioArchiveEntry.setInode(-255L);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeOldAsciiEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldAsciiEntry", cpioArchiveEntryType);
        writeOldAsciiEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldAsciiEntryMethodArguments = new java.lang.Object[1];
        writeOldAsciiEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeOldAsciiEntryMethod.invoke(cpioArchiveOutputStream, writeOldAsciiEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeOldAsciiEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    @Test
    public void testWriteOldAsciiEntry1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "nextArtificalDeviceAndInode", -9222246136947933183L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 4);
        cpioArchiveEntry.setInode(0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -9223372032559808512L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:529)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(CpioArchiveOutputStream.java:323) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeOldAsciiEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldAsciiEntry", cpioArchiveEntryType);
        writeOldAsciiEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldAsciiEntryMethodArguments = new java.lang.Object[1];
        writeOldAsciiEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeOldAsciiEntryMethod.invoke(cpioArchiveOutputStream, writeOldAsciiEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteOldAsciiEntry2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 4);
        cpioArchiveEntry.setInode(0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 0L);
        String name = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        cpioArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:529)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(CpioArchiveOutputStream.java:323) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeOldAsciiEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldAsciiEntry", cpioArchiveEntryType);
        writeOldAsciiEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldAsciiEntryMethodArguments = new java.lang.Object[1];
        writeOldAsciiEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeOldAsciiEntryMethod.invoke(cpioArchiveOutputStream, writeOldAsciiEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteOldAsciiEntry3() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "nextArtificalDeviceAndInode", -9223372036854513535L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -250);
        cpioArchiveEntry.setInode(128L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 1L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:529)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(CpioArchiveOutputStream.java:323) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeOldAsciiEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldAsciiEntry", cpioArchiveEntryType);
        writeOldAsciiEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldAsciiEntryMethodArguments = new java.lang.Object[1];
        writeOldAsciiEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeOldAsciiEntryMethod.invoke(cpioArchiveOutputStream, writeOldAsciiEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteOldAsciiEntry4() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "nextArtificalDeviceAndInode", 524288L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 4);
        cpioArchiveEntry.setInode(0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 2L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:529)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(CpioArchiveOutputStream.java:323) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeOldAsciiEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldAsciiEntry", cpioArchiveEntryType);
        writeOldAsciiEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldAsciiEntryMethodArguments = new java.lang.Object[1];
        writeOldAsciiEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeOldAsciiEntryMethod.invoke(cpioArchiveOutputStream, writeOldAsciiEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteOldAsciiEntry5() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "nextArtificalDeviceAndInode", 6917529027641081859L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 4);
        cpioArchiveEntry.setInode(2305842871775002625L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 524288L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:529)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(CpioArchiveOutputStream.java:323) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeOldAsciiEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldAsciiEntry", cpioArchiveEntryType);
        writeOldAsciiEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldAsciiEntryMethodArguments = new java.lang.Object[1];
        writeOldAsciiEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeOldAsciiEntryMethod.invoke(cpioArchiveOutputStream, writeOldAsciiEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteOldAsciiEntry6() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "nextArtificalDeviceAndInode", -9223372028264579071L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 4);
        cpioArchiveEntry.setInode(262144L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 32768L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:529)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(CpioArchiveOutputStream.java:323) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeOldAsciiEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldAsciiEntry", cpioArchiveEntryType);
        writeOldAsciiEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldAsciiEntryMethodArguments = new java.lang.Object[1];
        writeOldAsciiEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeOldAsciiEntryMethod.invoke(cpioArchiveOutputStream, writeOldAsciiEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (finished): True}
 * @utbot.throwsException {@link java.io.IOException} when: finished
 *  */
    @Test(expected = IOException.class)
    public void testPutArchiveEntry_ThrowIOException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finished", true);
        
        cpioArchiveOutputStream.putArchiveEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.throwsException {@link java.io.IOException} in: ensureOpen();
 *  */
    @Test(expected = IOException.class)
    public void testPutArchiveEntry_ThrowIOException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closed", true);
        
        cpioArchiveOutputStream.putArchiveEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (this.entry != null): False}
 * @utbot.executesCondition {@code (e.getTime() == -1): True}
 * @utbot.executesCondition {@code (format != this.entryFormat): True}
 * @utbot.invokes {@link java.lang.System#currentTimeMillis()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#setTime(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.io.IOException} when: format != this.entryFormat
 *  */
    @Test(expected = IOException.class)
    public void testPutArchiveEntry_ThrowIOException_2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 0);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", java.lang.Short.MIN_VALUE);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (this.entry != null): True}
 * @utbot.throwsException {@link java.io.IOException} in: closeArchiveEntry();
 *  */
    @Test(expected = IOException.class)
    public void testPutArchiveEntry_ThrowIOException_4() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -253L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -254L);
        
        cpioArchiveOutputStream.putArchiveEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (this.entry != null): True}
 * @utbot.throwsException {@link java.io.IOException} in: closeArchiveEntry();
 *  */
    @Test(expected = IOException.class)
    public void testPutArchiveEntry_ThrowIOException_5() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        entry.setChksum(-254L);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -255L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", -253L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -255L);
        
        cpioArchiveOutputStream.putArchiveEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (this.entry != null): True}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testPutArchiveEntry_ThrowZipException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.putArchiveEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (this.entry != null): False}
 * @utbot.executesCondition {@code (e.getTime() == -1): False}
 * @utbot.executesCondition {@code (format != this.entryFormat): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getName()}
 * @utbot.invokes {@link java.util.HashMap#put(java.lang.Object,java.lang.Object)}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
 * @utbot.throwsException {@link java.io.IOException} in: writeHeader(e);
 *  */
    @Test(expected = IOException.class)
    public void testPutArchiveEntry_ThrowIOException_3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 5);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 5);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (this.entry != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: e.getTime() == -1
 *  */
    @Test
    public void testPutArchiveEntry_ThrowNullPointerException_2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -255);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -255L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -255L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:228) */
        cpioArchiveOutputStream.putArchiveEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (this.entry != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: e.getTime() == -1
 *  */
    @Test
    public void testPutArchiveEntry_ThrowNullPointerException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:228) */
        cpioArchiveOutputStream.putArchiveEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (this.entry != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: closeArchiveEntry();
 *  */
    @Test
    public void testPutArchiveEntry_ThrowNullPointerException_3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:495)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry(CpioArchiveOutputStream.java:390)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:226) */
        cpioArchiveOutputStream.putArchiveEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (this.entry != null): False}
 * @utbot.executesCondition {@code (e.getTime() == -1): False}
 * @utbot.executesCondition {@code (format != this.entryFormat): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getTime()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getFormat()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getName()}
 * @utbot.invokes {@link java.util.HashMap#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.names.put(e.getName(), e) != null
 *  */
    @Test
    public void testPutArchiveEntry_ThrowNullPointerException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) -255);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -255);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:237) */
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    @Test(expected = IOException.class)
    public void testPutArchiveEntry1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 2);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveOutputStream out = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    @Test(expected = IOException.class)
    public void testPutArchiveEntry2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 0);
        HashMap names = new HashMap();
        String string = "";
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        names.put(string, cpioArchiveEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry1 = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry1, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 0);
        setField(cpioArchiveEntry1, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        String name = "";
        cpioArchiveEntry1.setName(name);
        
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    @Test
    public void testPutArchiveEntry3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        entry.setChksum(0L);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 0L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 0);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:237) */
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutArchiveEntry4() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", java.lang.Short.MIN_VALUE);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 4);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -17179869442L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -17179869442L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:237) */
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutArchiveEntry5() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 2142110209);
        entry.setChksum(0L);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -24927744711700489L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -24927744711700489L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:228) */
        cpioArchiveOutputStream.putArchiveEntry(null);
    }
    
    @Test
    public void testPutArchiveEntry6() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 8);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 8);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:265)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:241) */
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutArchiveEntry7() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 1);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:249)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:241) */
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutArchiveEntry8() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 4);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 4);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:259)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:241) */
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    ///endregion
    
    ///region Errors report for putArchiveEntry
    
    public void testPutArchiveEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeCString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeCString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeCString(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipEncoding#encode(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ByteBuffer buf = zipEncoding.encode(str);
 *  */
    @Test
    public void testWriteCString_ThrowNullPointerException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeCString] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeCString(CpioArchiveOutputStream.java:539) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class stringType = Class.forName("java.lang.String");
        Method writeCStringMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeCString", stringType);
        writeCStringMethod.setAccessible(true);
        java.lang.Object[] writeCStringMethodArguments = new java.lang.Object[1];
        writeCStringMethodArguments[0] = ((Object) null);
        try {
            writeCStringMethod.invoke(cpioArchiveOutputStream, writeCStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: CHECKED EXCEPTIONS for method writeCString(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeCString(java.lang.String)}
     */
    @Test(expected = UnsupportedEncodingException.class)
    public void testWriteCStringThrowsUEEWithNonEmptyString() throws Throwable  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        CpioArchiveOutputStream cpioArchiveOutputStream = new CpioArchiveOutputStream(((OutputStream) filterOutputStream), "XZ");
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class stringType = Class.forName("java.lang.String");
        Method writeCStringMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeCString", stringType);
        writeCStringMethod.setAccessible(true);
        java.lang.Object[] writeCStringMethodArguments = new java.lang.Object[1];
        writeCStringMethodArguments[0] = "-3";
        try {
            writeCStringMethod.invoke(cpioArchiveOutputStream, writeCStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeCString(java.lang.String)
    
    @Test
    public void testWriteCString1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object zipEncoding = createInstance("org.apache.commons.compress.archivers.zip.FallbackZipEncoding");
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "zipEncoding", zipEncoding);
        String string = "";
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeCString] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeCString(CpioArchiveOutputStream.java:541) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class stringType = Class.forName("java.lang.String");
        Method writeCStringMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeCString", stringType);
        writeCStringMethod.setAccessible(true);
        java.lang.Object[] writeCStringMethodArguments = new java.lang.Object[1];
        writeCStringMethodArguments[0] = string;
        try {
            writeCStringMethod.invoke(cpioArchiveOutputStream, writeCStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method writeAsciiLong(long, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeAsciiLong(long,int,int)}
     */
    @Test
    public void testWriteAsciiLongWithCornerCases() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        CpioArchiveOutputStream cpioArchiveOutputStream = new CpioArchiveOutputStream(((OutputStream) filterOutputStream), "abc");
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method writeAsciiLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeAsciiLong", longType, intType, intType);
        writeAsciiLongMethod.setAccessible(true);
        java.lang.Object[] writeAsciiLongMethodArguments = new java.lang.Object[3];
        writeAsciiLongMethodArguments[0] = 0L;
        writeAsciiLongMethodArguments[1] = 0;
        writeAsciiLongMethodArguments[2] = -2147483647;
        writeAsciiLongMethod.invoke(cpioArchiveOutputStream, writeAsciiLongMethodArguments);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method writeAsciiLong(long, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeAsciiLong(long,int,int)}
     */
    @Test
    public void testWriteAsciiLongThrowsSIOOBEWithCornerCases() throws Throwable  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        CpioArchiveOutputStream cpioArchiveOutputStream = new CpioArchiveOutputStream(((OutputStream) filterOutputStream), "abc");
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong] produces [java.lang.StringIndexOutOfBoundsException: start -2147483647, end 1, length 1]
            java.base/java.lang.AbstractStringBuilder.checkRangeSIOOBE(AbstractStringBuilder.java:1810)
            java.base/java.lang.AbstractStringBuilder.substring(AbstractStringBuilder.java:1070)
            java.base/java.lang.StringBuilder.substring(StringBuilder.java:91)
            java.base/java.lang.AbstractStringBuilder.substring(AbstractStringBuilder.java:1022)
            java.base/java.lang.StringBuilder.substring(StringBuilder.java:91)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:526) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method writeAsciiLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeAsciiLong", longType, intType, intType);
        writeAsciiLongMethod.setAccessible(true);
        java.lang.Object[] writeAsciiLongMethodArguments = new java.lang.Object[3];
        writeAsciiLongMethodArguments[0] = 0L;
        writeAsciiLongMethodArguments[1] = Integer.MIN_VALUE;
        writeAsciiLongMethodArguments[2] = -2147483647;
        try {
            writeAsciiLongMethod.invoke(cpioArchiveOutputStream, writeAsciiLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeAsciiLong(long, int, int)
    
    @Test
    public void testWriteAsciiLong1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong] produces [java.lang.StringIndexOutOfBoundsException: start 256, end 1, length 1]
            java.base/java.lang.AbstractStringBuilder.checkRangeSIOOBE(AbstractStringBuilder.java:1810)
            java.base/java.lang.AbstractStringBuilder.substring(AbstractStringBuilder.java:1070)
            java.base/java.lang.StringBuilder.substring(StringBuilder.java:91)
            java.base/java.lang.AbstractStringBuilder.substring(AbstractStringBuilder.java:1022)
            java.base/java.lang.StringBuilder.substring(StringBuilder.java:91)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:526) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method writeAsciiLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeAsciiLong", longType, intType, intType);
        writeAsciiLongMethod.setAccessible(true);
        java.lang.Object[] writeAsciiLongMethodArguments = new java.lang.Object[3];
        writeAsciiLongMethodArguments[0] = 3L;
        writeAsciiLongMethodArguments[1] = -255;
        writeAsciiLongMethodArguments[2] = 16;
        try {
            writeAsciiLongMethod.invoke(cpioArchiveOutputStream, writeAsciiLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteAsciiLong2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong] produces [java.lang.StringIndexOutOfBoundsException: start 272, end 17, length 17]
            java.base/java.lang.AbstractStringBuilder.checkRangeSIOOBE(AbstractStringBuilder.java:1810)
            java.base/java.lang.AbstractStringBuilder.substring(AbstractStringBuilder.java:1070)
            java.base/java.lang.StringBuilder.substring(StringBuilder.java:91)
            java.base/java.lang.AbstractStringBuilder.substring(AbstractStringBuilder.java:1022)
            java.base/java.lang.StringBuilder.substring(StringBuilder.java:91)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:526) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method writeAsciiLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeAsciiLong", longType, intType, intType);
        writeAsciiLongMethod.setAccessible(true);
        java.lang.Object[] writeAsciiLongMethodArguments = new java.lang.Object[3];
        writeAsciiLongMethodArguments[0] = 1125899906842624L;
        writeAsciiLongMethodArguments[1] = -255;
        writeAsciiLongMethodArguments[2] = 8;
        try {
            writeAsciiLongMethod.invoke(cpioArchiveOutputStream, writeAsciiLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteAsciiLong3() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:529) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method writeAsciiLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeAsciiLong", longType, intType, intType);
        writeAsciiLongMethod.setAccessible(true);
        java.lang.Object[] writeAsciiLongMethodArguments = new java.lang.Object[3];
        writeAsciiLongMethodArguments[0] = 17L;
        writeAsciiLongMethodArguments[1] = 0;
        writeAsciiLongMethodArguments[2] = 0;
        try {
            writeAsciiLongMethod.invoke(cpioArchiveOutputStream, writeAsciiLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteAsciiLong4() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:529) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method writeAsciiLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeAsciiLong", longType, intType, intType);
        writeAsciiLongMethod.setAccessible(true);
        java.lang.Object[] writeAsciiLongMethodArguments = new java.lang.Object[3];
        writeAsciiLongMethodArguments[0] = 4294967296L;
        writeAsciiLongMethodArguments[1] = 0;
        writeAsciiLongMethodArguments[2] = 16;
        try {
            writeAsciiLongMethod.invoke(cpioArchiveOutputStream, writeAsciiLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteAsciiLong5() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:529) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method writeAsciiLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeAsciiLong", longType, intType, intType);
        writeAsciiLongMethod.setAccessible(true);
        java.lang.Object[] writeAsciiLongMethodArguments = new java.lang.Object[3];
        writeAsciiLongMethodArguments[0] = 144115188075855872L;
        writeAsciiLongMethodArguments[1] = 0;
        writeAsciiLongMethodArguments[2] = 8;
        try {
            writeAsciiLongMethod.invoke(cpioArchiveOutputStream, writeAsciiLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeBinaryLong(long, int, boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: byte[] tmp = CpioUtil.long2byteArray(number, length, swapHalfWord);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteBinaryLong_ThrowUnsupportedOperationException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 1;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: byte[] tmp = CpioUtil.long2byteArray(number, length, swapHalfWord);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteBinaryLong_ThrowUnsupportedOperationException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 0;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.invokes {@link java.io.OutputStream#write(byte[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: out.write(tmp);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteBinaryLong_ThrowIndexOutOfBoundsException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeBinaryLong(long, int, boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(tmp);
 *  */
    @Test(expected = IOException.class)
    public void testWriteBinaryLong_ThrowIOException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CheckedOutputStream out = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#count(int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteBinaryLong_ThrowIOException_10() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        FileOutputStream out = ((FileOutputStream) createInstance("java.io.FileOutputStream"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(out, "java.io.FileOutputStream", "fd", fd);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.ArchiveOutputStream", "bytesWritten", 0L);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: out.write(tmp);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteBinaryLong_ThrowZipException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(tmp);
 *  */
    @Test(expected = IOException.class)
    public void testWriteBinaryLong_ThrowIOException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(2L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", -2296695072470597632L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -2296695072470597632L);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(tmp);
 *  */
    @Test(expected = IOException.class)
    public void testWriteBinaryLong_ThrowIOException_2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: out.write(tmp);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteBinaryLong_ThrowZipException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: out.write(tmp);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteBinaryLong_ThrowZipException_2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.util.zip.ZipOutputStream", "written", -8L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", -2L);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: out.write(tmp);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteBinaryLong_ThrowZipException_3() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out2 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out2, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(tmp);
 *  */
    @Test(expected = IOException.class)
    public void testWriteBinaryLong_ThrowIOException_3() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(tmp);
 *  */
    @Test(expected = IOException.class)
    public void testWriteBinaryLong_ThrowIOException_4() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(tmp);
 *  */
    @Test(expected = IOException.class)
    public void testWriteBinaryLong_ThrowIOException_5() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setSize(-9223372036854775807L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 2097152L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -9223372036852678655L);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(tmp);
 *  */
    @Test(expected = IOException.class)
    public void testWriteBinaryLong_ThrowIOException_6() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(tmp);
 *  */
    @Test(expected = IOException.class)
    public void testWriteBinaryLong_ThrowIOException_7() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        DeflaterOutputStream out2 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out2, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(tmp);
 *  */
    @Test(expected = IOException.class)
    public void testWriteBinaryLong_ThrowIOException_8() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteBinaryLong_ThrowIOException_9() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setSize(8194L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.util.zip.ZipOutputStream", "written", 8192L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", -1L);
        CheckedOutputStream out2 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        DeflaterOutputStream out3 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out3, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out2, "java.io.FilterOutputStream", "out", out3);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeBinaryLong(long, int, boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: byte[] tmp = CpioUtil.long2byteArray(number, length, swapHalfWord);
 *  */
    @Test
    public void testWriteBinaryLong_ThrowNegativeArraySizeException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.compress.archivers.cpio.CpioUtil.long2byteArray(CpioUtil.java:89)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:502) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = -256;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.write(tmp);
 *  */
    @Test
    public void testWriteBinaryLong_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#count(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteBinaryLong_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1022);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.ArchiveOutputStream", "bytesWritten", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 1024 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteBinaryLong_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(tmp);
 *  */
    @Test
    public void testWriteBinaryLong_ThrowNullPointerException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(tmp);
 *  */
    @Test
    public void testWriteBinaryLong_ThrowNullPointerException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1023);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeBinaryLong(long, int, boolean)
    
    @Test
    public void testWriteBinaryLong1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 6;
        writeBinaryLongMethodArguments[2] = false;
        writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
    }
    
    @Test
    public void testWriteBinaryLong2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 4;
        writeBinaryLongMethodArguments[2] = true;
        writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
    }
    
    @Test
    public void testWriteBinaryLong3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeBinaryLong(long, int, boolean)
    
    @Test
    public void testWriteBinaryLong4() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1073740801);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1073740801 out of bounds for byte[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = 0L;
        writeBinaryLongMethodArguments[1] = 4;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteBinaryLong5() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedOutputStream.write(BufferedOutputStream.java:118)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteBinaryLong6() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object out = createInstance("java.net.SocketOutputStream");
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NullPointerException]
            java.base/java.net.SocketOutputStream.socketWrite(SocketOutputStream.java:105)
            java.base/java.net.SocketOutputStream.write(SocketOutputStream.java:135)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteBinaryLong7() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object out = createInstance("org.apache.commons.compress.compressors.pack200.TempFileCachingStreamBridge");
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NullPointerException]
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:137)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteBinaryLong8() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object out = createInstance("java.net.SocketOutputStream");
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NullPointerException]
            java.base/java.net.SocketOutputStream.socketWrite(SocketOutputStream.java:105)
            java.base/java.net.SocketOutputStream.write(SocketOutputStream.java:135)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 6;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteBinaryLong9() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedOutputStream.write(BufferedOutputStream.java:118)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 4;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteBinaryLong10() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object out = createInstance("org.apache.commons.compress.compressors.pack200.TempFileCachingStreamBridge");
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NullPointerException]
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:137)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 4;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteBinaryLong11() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ByteArrayOutputStream out1 = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NullPointerException]
            java.base/java.io.ByteArrayOutputStream.ensureCapacity(ByteArrayOutputStream.java:97)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:130)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1861)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteBinaryLong12() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ByteArrayOutputStream out1 = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NullPointerException]
            java.base/java.io.ByteArrayOutputStream.ensureCapacity(ByteArrayOutputStream.java:97)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:130)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1861)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 4;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteBinaryLong13() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        ByteArrayOutputStream out1 = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NullPointerException] */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteBinaryLong14() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        ByteArrayOutputStream out1 = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NullPointerException]
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:129)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1860)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 4;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteBinaryLong15() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        FilterOutputStream out1 = ((FilterOutputStream) createInstance("org.apache.commons.compress.archivers.sevenz.Coders$BCJDecoder$1"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NullPointerException]
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:133)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1860)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 4;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteBinaryLong16() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        ByteArrayOutputStream out1 = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NullPointerException] */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 4;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeBinaryLong
    
    public void testWriteBinaryLong_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 55 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 10 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.createArchiveEntry
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method createArchiveEntry(java.io.File, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#createArchiveEntry(java.io.File,java.lang.String)}
 * @utbot.executesCondition {@code (finished): True}
 * @utbot.throwsException {@link java.io.IOException} when: finished
 *  */
    @Test(expected = IOException.class)
    public void testCreateArchiveEntry_ThrowIOException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finished", true);
        
        cpioArchiveOutputStream.createArchiveEntry(null, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method createArchiveEntry(java.io.File, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#createArchiveEntry(java.io.File,java.lang.String)}
     */
    @Test
    public void testCreateArchiveEntryThrowsNPEWithNonEmptyString() throws IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        CpioArchiveOutputStream cpioArchiveOutputStream = new CpioArchiveOutputStream(((OutputStream) filterOutputStream), "abc");
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.createArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.<init>(CpioArchiveEntry.java:339)
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.<init>(CpioArchiveEntry.java:313)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.createArchiveEntry(CpioArchiveOutputStream.java:557) */
        cpioArchiveOutputStream.createArchiveEntry(null, "acb");
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createArchiveEntry(java.io.File, java.lang.String)
    
    @Test
    public void testCreateArchiveEntry1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        File file = ((File) createInstance("java.io.File"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.createArchiveEntry] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.File.isFile(File.java:893)
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.<init>(CpioArchiveEntry.java:339)
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.<init>(CpioArchiveEntry.java:313)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.createArchiveEntry(CpioArchiveOutputStream.java:557) */
        cpioArchiveOutputStream.createArchiveEntry(file, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry, boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteOldBinaryEntry_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        cpioArchiveEntry.setInode(-255L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(CpioArchiveOutputStream.java:353) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = true;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.executesCondition {@code (inode == 0): True}
 * @utbot.executesCondition {@code (device == 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteOldBinaryEntry_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "nextArtificalDeviceAndInode", -16711680L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        cpioArchiveEntry.setInode(0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(CpioArchiveOutputStream.java:353) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = true;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: long inode = entry.getInode();
 *  */
    @Test
    public void testWriteOldBinaryEntry_ThrowNullPointerException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(CpioArchiveOutputStream.java:338) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = ((Object) null);
        writeOldBinaryEntryMethodArguments[1] = false;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeBinaryLong(device, 2, swapHalfWord);
 *  */
    @Test
    public void testWriteOldBinaryEntry_ThrowNullPointerException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        cpioArchiveEntry.setInode(-255L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(CpioArchiveOutputStream.java:353) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = false;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.executesCondition {@code (inode == 0): True}
 * @utbot.executesCondition {@code (device == 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeBinaryLong(device, 2, swapHalfWord);
 *  */
    @Test
    public void testWriteOldBinaryEntry_ThrowNullPointerException_2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "nextArtificalDeviceAndInode", 0L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        cpioArchiveEntry.setInode(0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(CpioArchiveOutputStream.java:353) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = true;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.executesCondition {@code (inode == 0): True}
 * @utbot.executesCondition {@code (device == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeBinaryLong(device, 2, swapHalfWord);
 *  */
    @Test
    public void testWriteOldBinaryEntry_ThrowNullPointerException_3() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "nextArtificalDeviceAndInode", -4611686018444099583L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        cpioArchiveEntry.setInode(0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(CpioArchiveOutputStream.java:353) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = true;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.executesCondition {@code (inode == 0): True}
 * @utbot.executesCondition {@code (device == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testWriteOldBinaryEntry_ThrowNullPointerException_4() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1073740801);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "nextArtificalDeviceAndInode", -16711680L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -250);
        cpioArchiveEntry.setInode(0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(CpioArchiveOutputStream.java:353) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = true;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry, boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: long device = entry.getDevice();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteOldBinaryEntry_ThrowUnsupportedOperationException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -255);
        cpioArchiveEntry.setInode(-255L);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = false;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.executesCondition {@code (inode == 0): True}
 * @utbot.executesCondition {@code (device == 0): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getName()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link java.lang.Math#max(long,long)}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteOldBinaryEntry_ThrowIndexOutOfBoundsException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        JarOutputStream out1 = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "nextArtificalDeviceAndInode", -16711680L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -247);
        cpioArchiveEntry.setInode(0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = true;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry, boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: writeBinaryLong(device, 2, swapHalfWord);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteOldBinaryEntry_ThrowZipException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        cpioArchiveEntry.setInode(-255L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = true;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.executesCondition {@code (inode == 0): True}
 * @utbot.executesCondition {@code (device == 0): True}
 * @utbot.throwsException {@link java.io.IOException} in: writeBinaryLong(device, 2, swapHalfWord);
 *  */
    @Test(expected = IOException.class)
    public void testWriteOldBinaryEntry_ThrowIOException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "nextArtificalDeviceAndInode", 0L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        cpioArchiveEntry.setInode(0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 0L);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = false;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testWriteOldBinaryEntry_ThrowZipException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        JarOutputStream out1 = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setSize(java.lang.Long.MIN_VALUE);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.util.zip.ZipOutputStream", "written", -8L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", -1L);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        cpioArchiveEntry.setInode(-255L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = true;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteOldBinaryEntry_ThrowIOException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        cpioArchiveEntry.setInode(-255L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = true;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.executesCondition {@code (inode == 0): False}
 * @utbot.invokes {@link java.lang.Math#max(long,long)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteOldBinaryEntry_ThrowIOException_2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "nextArtificalDeviceAndInode", -255L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        cpioArchiveEntry.setInode(256L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 128L);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = true;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeOldBinaryEntry
    
    public void testWriteOldBinaryEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off < 0): False}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): True}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#ensureOpen()
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testWrite_LenEqualsZero() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        byte[] byteArray = {};
        
        cpioArchiveOutputStream.write(byteArray, 0, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off < 0): False}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: off < 0 || len < 0 || off > b.length - len
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_ThrowIndexOutOfBoundsException_2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 3, 0);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off < 0): False}
 * @utbot.executesCondition {@code (len < 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: off < 0 || len < 0 || off > b.length - len
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_ThrowIndexOutOfBoundsException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        cpioArchiveOutputStream.write(null, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off < 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: off < 0 || len < 0 || off > b.length - len
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_ThrowIndexOutOfBoundsException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        cpioArchiveOutputStream.write(null, -1, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off < 0): False}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): True}
 * @utbot.throwsException {@link java.io.IOException} when: this.written + len > this.entry.getSize()
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -254L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -255L);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: ensureOpen();
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closed", true);
        
        cpioArchiveOutputStream.write(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off < 0): False}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): True}
 * @utbot.throwsException {@link java.io.IOException} when: this.entry == null
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off < 0): False}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(b, off, len);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -255L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -256L);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off < 0): False}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(b, off, len);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_4() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -254L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -255L);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setSize(2L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry1);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -1L);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off < 0): False}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(b, off, len);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_5() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -255L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -256L);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off < 0): False}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: out.write(b, off, len);
 *  */
    @Test(expected = ZipException.class)
    public void testWrite_ThrowZipException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -125L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -126L);
        CheckedOutputStream out = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setSize(0L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry1);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.util.zip.ZipOutputStream", "written", 144115189149597824L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", -2L);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off < 0): False}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(b, off, len);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_6() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 256L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 255L);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry1);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off < 0): False}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(b, off, len);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_7() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -254L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -255L);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setSize(4295229443L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry1);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 3481757505136099328L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", 3481757500840869886L);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off < 0): False}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(b, off, len);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_8() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -254L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -255L);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setSize(-13510798881980413L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry1);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 4503599627370495L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", 18014398509350909L);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current1 = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry2 = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry2.setSize(0L);
        setField(current1, "java.util.zip.ZipOutputStream$XEntry", "entry", entry2);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current1);
        setField(out1, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", 1L);
        CheckedOutputStream out2 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out3 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out3, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out2, "java.io.FilterOutputStream", "out", out3);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off < 0): False}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(b, off, len);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_9() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -2L);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setSize(849381359091714L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry1);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 849379209510910L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -2149580802L);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current1 = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry2 = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry2.setSize(1L);
        setField(current1, "java.util.zip.ZipOutputStream$XEntry", "entry", entry2);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current1);
        setField(out1, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", 1L);
        CheckedOutputStream out2 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        DeflaterOutputStream out3 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out3, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out2, "java.io.FilterOutputStream", "out", out3);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 2);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: off < 0 || len < 0 || off > b.length - len
 *  */
    @Test
    public void testWrite_ThrowNullPointerException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:418) */
        cpioArchiveOutputStream.write(null, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getSize()}
 * @utbot.invokes {@link java.io.OutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(b, off, len);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -255L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -256L);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:430) */
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    ///endregion
    
    ///region Errors report for write
    
    public void testWrite_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 32 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!this.closed): False}
 *  */
    @Test
    public void testClose_ThisClosed() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closed", true);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finished", true);
        
        cpioArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!this.closed): True}
 *  */
    @Test
    public void testClose_NotThisClosed() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finished", true);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.DeflaterOutputStream", "closed", true);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.close();
        
        boolean finalCpioArchiveOutputStreamClosed = ((Boolean) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closed"));
        OutputStream cpioArchiveOutputStreamOut = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        boolean finalCpioArchiveOutputStreamOutClosed = ((Boolean) getFieldValue(cpioArchiveOutputStreamOut, "java.util.zip.ZipOutputStream", "closed"));
        
        assertTrue(finalCpioArchiveOutputStreamClosed);
        
        assertTrue(finalCpioArchiveOutputStreamOutClosed);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!this.closed): True}
 *  */
    @Test
    public void testClose_NotThisClosed_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finished", true);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "finished", true);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.close();
        
        boolean finalCpioArchiveOutputStreamClosed = ((Boolean) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closed"));
        OutputStream cpioArchiveOutputStreamOut = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        boolean finalCpioArchiveOutputStreamOutClosed = ((Boolean) getFieldValue(cpioArchiveOutputStreamOut, "java.util.zip.ZipOutputStream", "closed"));
        OutputStream cpioArchiveOutputStreamOut1 = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        boolean finalCpioArchiveOutputStreamOutClosed1 = ((Boolean) getFieldValue(cpioArchiveOutputStreamOut1, "java.util.zip.DeflaterOutputStream", "closed"));
        
        assertTrue(finalCpioArchiveOutputStreamClosed);
        
        assertTrue(finalCpioArchiveOutputStreamOutClosed);
        
        assertTrue(finalCpioArchiveOutputStreamOutClosed1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!this.closed): True}
 * @utbot.invokes {@link java.io.OutputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finished", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close(CpioArchiveOutputStream.java:487) */
        cpioArchiveOutputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#close()}
 * @utbot.throwsException {@link java.io.IOException} in: finish();
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closed", true);
        
        cpioArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#close()}
 * @utbot.throwsException {@link java.io.IOException} in: finish();
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        
        cpioArchiveOutputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#finish()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: finish();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testClose_ThrowIllegalArgumentException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 5);
        
        cpioArchiveOutputStream.close();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method close()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#close()}
     */
    @Test
    public void testCloseThrowsNPE() throws IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        CpioArchiveOutputStream cpioArchiveOutputStream = new CpioArchiveOutputStream(((OutputStream) filterOutputStream), "ZX");
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close] produces [java.lang.NullPointerException]
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:137)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:249)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish(CpioArchiveOutputStream.java:462)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close(CpioArchiveOutputStream.java:483) */
        cpioArchiveOutputStream.close();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method close()
    
    @Test
    public void testClose1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 8);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:265)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish(CpioArchiveOutputStream.java:462)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close(CpioArchiveOutputStream.java:483) */
        cpioArchiveOutputStream.close();
    }
    
    @Test
    public void testClose2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:249)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish(CpioArchiveOutputStream.java:462)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close(CpioArchiveOutputStream.java:483) */
        cpioArchiveOutputStream.close();
    }
    
    @Test
    public void testClose3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 4);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:259)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish(CpioArchiveOutputStream.java:462)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close(CpioArchiveOutputStream.java:483) */
        cpioArchiveOutputStream.close();
    }
    
    @Test
    public void testClose4() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 2);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:254)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish(CpioArchiveOutputStream.java:462)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close(CpioArchiveOutputStream.java:483) */
        cpioArchiveOutputStream.close();
    }
    ///endregion
    
    ///region Errors report for close
    
    public void testClose_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.ensureOpen
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ensureOpen()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#ensureOpen()}
 * @utbot.executesCondition {@code (this.closed): False}
 *  */
    @Test
    public void testEnsureOpen_NotThisClosed() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Method ensureOpenMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("ensureOpen");
        ensureOpenMethod.setAccessible(true);
        java.lang.Object[] ensureOpenMethodArguments = new java.lang.Object[0];
        ensureOpenMethod.invoke(cpioArchiveOutputStream, ensureOpenMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method ensureOpen()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#ensureOpen()}
 * @utbot.executesCondition {@code (this.closed): True}
 * @utbot.throwsException {@link java.io.IOException} when: this.closed
 *  */
    @Test(expected = IOException.class)
    public void testEnsureOpen_ThrowIOException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closed", true);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Method ensureOpenMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("ensureOpen");
        ensureOpenMethod.setAccessible(true);
        java.lang.Object[] ensureOpenMethodArguments = new java.lang.Object[0];
        try {
            ensureOpenMethod.invoke(cpioArchiveOutputStream, ensureOpenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method finish()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#finish()}
 * @utbot.executesCondition {@code (finished): True}
 * @utbot.throwsException {@link java.io.IOException} when: finished
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finished", true);
        
        cpioArchiveOutputStream.finish();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#finish()}
 * @utbot.throwsException {@link java.io.IOException} in: ensureOpen();
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException_2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closed", true);
        
        cpioArchiveOutputStream.finish();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#finish()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (this.entry != null): True}
 * @utbot.throwsException {@link java.io.IOException} when: this.entry != null
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        
        cpioArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method finish()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#finish()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (this.entry != null): False}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#ensureOpen()
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: this.entry = new CpioArchiveEntry(this.entryFormat);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFinish_ThrowIllegalArgumentException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 5);
        
        cpioArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method finish()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#finish()}
     */
    @Test
    public void testFinishThrowsNPE() throws IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        CpioArchiveOutputStream cpioArchiveOutputStream = new CpioArchiveOutputStream(((OutputStream) filterOutputStream), "acb");
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:137)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:249)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish(CpioArchiveOutputStream.java:462) */
        cpioArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method finish()
    
    @Test
    public void testFinish1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 8);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:503)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:265)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish(CpioArchiveOutputStream.java:462) */
        cpioArchiveOutputStream.finish();
    }
    
    @Test
    public void testFinish2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:249)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish(CpioArchiveOutputStream.java:462) */
        cpioArchiveOutputStream.finish();
    }
    
    @Test
    public void testFinish3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 4);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:259)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish(CpioArchiveOutputStream.java:462) */
        cpioArchiveOutputStream.finish();
    }
    
    @Test
    public void testFinish4() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 2);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:254)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish(CpioArchiveOutputStream.java:462) */
        cpioArchiveOutputStream.finish();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method pad(int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.executesCondition {@code (count > 0): False}
 *  */
    @Test
    public void testPad_CountLessOrEqualZero() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 0;
        padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method pad(int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.write(buff);
 *  */
    @Test
    public void testPad_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:495) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.write(buff);
 *  */
    @Test
    public void testPad_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1073740800);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1073740800 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:495) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testPad_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:495) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(buff);
 *  */
    @Test
    public void testPad_ThrowNullPointerException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:495) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method pad(int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: out.write(buff);
 *  */
    @Test(expected = ZipException.class)
    public void testPad_ThrowZipException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(buff);
 *  */
    @Test(expected = IOException.class)
    public void testPad_ThrowIOException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setSize(2L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", -8071026818116757504L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -8071026818116757505L);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(buff);
 *  */
    @Test(expected = IOException.class)
    public void testPad_ThrowIOException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testPad_ThrowIOException_2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: out.write(buff);
 *  */
    @Test(expected = ZipException.class)
    public void testPad_ThrowZipException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: out.write(buff);
 *  */
    @Test(expected = ZipException.class)
    public void testPad_ThrowZipException_2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out2 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out2, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(buff);
 *  */
    @Test(expected = IOException.class)
    public void testPad_ThrowIOException_3() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(buff);
 *  */
    @Test(expected = IOException.class)
    public void testPad_ThrowIOException_4() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(buff);
 *  */
    @Test(expected = IOException.class)
    public void testPad_ThrowIOException_5() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testPad_ThrowIOException_6() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setSize(0L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.util.zip.ZipOutputStream", "written", 4092L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", 4093L);
        CheckedOutputStream out2 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        JarOutputStream out3 = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(out3, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out2, "java.io.FilterOutputStream", "out", out3);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(buff);
 *  */
    @Test(expected = IOException.class)
    public void testPad_ThrowIOException_7() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(buff);
 *  */
    @Test(expected = IOException.class)
    public void testPad_ThrowIOException_8() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(0L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.util.zip.ZipOutputStream", "written", 4092L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", 4093L);
        DeflaterOutputStream out2 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out2, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(buff);
 *  */
    @Test(expected = IOException.class)
    public void testPad_ThrowIOException_9() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(2L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", -1L);
        CheckedOutputStream out2 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        DeflaterOutputStream out3 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out3, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out2, "java.io.FilterOutputStream", "out", out3);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method pad(int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.executesCondition {@code (count > 0): True}
 * @utbot.invokes {@link java.io.OutputStream#write(byte[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: out.write(buff);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testPad_ThrowIndexOutOfBoundsException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method pad(int)
    
    @Test
    public void testPad1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method pad(int)
    
    @Test
    public void testPad2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object out = createInstance("java.net.SocketOutputStream");
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad] produces [java.lang.NullPointerException]
            java.base/java.net.SocketOutputStream.socketWrite(SocketOutputStream.java:105)
            java.base/java.net.SocketOutputStream.write(SocketOutputStream.java:135)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:495) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPad3() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedOutputStream.write(BufferedOutputStream.java:118)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:495) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPad4() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        FilterOutputStream out = ((FilterOutputStream) createInstance("java.io.FilterOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad] produces [java.lang.NullPointerException]
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:137)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:495) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPad5() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ByteArrayOutputStream out1 = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad] produces [java.lang.NullPointerException]
            java.base/java.io.ByteArrayOutputStream.ensureCapacity(ByteArrayOutputStream.java:97)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:130)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1861)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:495) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPad6() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -2147482626);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:495) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 11;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPad7() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        ByteArrayOutputStream out1 = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad] produces [java.lang.NullPointerException] */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for pad
    
    public void testPad_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 55 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Concrete execution failed
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields973570768566600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields973570768566600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass973570768570400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields973570768566600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass973570768570400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields973570769572100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields973570769572100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass973570769573400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields973570769572100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass973570769573400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


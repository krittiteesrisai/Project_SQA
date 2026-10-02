package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.zip.ZipOutputStream;
import java.io.ObjectOutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Deflater;
import java.io.IOException;
import java.util.jar.JarOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.util.zip.ZipEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.io.UnsupportedEncodingException;
import org.junit.Ignore;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileDescriptor;
import java.util.zip.CRC32;
import java.io.FilterOutputStream;
import org.apache.commons.compress.utils.CountingOutputStream;
import java.io.PrintStream;
import java.io.OutputStream;
import java.util.jar.JarEntry;
import java.util.Vector;
import java.util.NoSuchElementException;
import java.io.BufferedOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;

public final class org_apache_commons_compress_archivers_tar_TarArchiveOutputStreamTest {
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeaderForBigNumber(TarArchiveOutputStream.java:605) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeaderForBigNumber(TarArchiveOutputStream.java:605) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeaderForBigNumber(TarArchiveOutputStream.java:605)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeadersForBigNumbers(TarArchiveOutputStream.java:583) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeadersForBigNumbers(TarArchiveOutputStream.java:583) */
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
        tarArchiveEntry.setGroupId(4);
        tarArchiveEntry.setSize(8589934591L);
        tarArchiveEntry.setModTime(682529530727253314L);
        
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
        tarArchiveEntry.setGroupId(-4);
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
    public void testAddPaxHeadersForBigNumbers3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "";
        linkedHashMap.put(string, string);
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
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
        String string = "";
        linkedHashMap.put(null, string);
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setGroupId(1073741824);
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addPaxHeadersForBigNumbers(java.util.Map, org.apache.commons.compress.archivers.tar.TarArchiveEntry)
    
    @Test
    public void testAddPaxHeadersForBigNumbers5() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setUserId(-2147483647);
        tarArchiveEntry.setSize(536870913L);
        tarArchiveEntry.setModTime(2066035336255469782L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeadersForBigNumbers] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeaderForBigNumber(TarArchiveOutputStream.java:605)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeadersForBigNumbers(TarArchiveOutputStream.java:590) */
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumberWithPosixMessage
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method failForBigNumberWithPosixMessage(java.lang.String, long, long)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumberWithPosixMessage(java.lang.String,long,long)}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumber(java.lang.String,long,long,java.lang.String)
 *  */
    @Test
    public void testFailForBigNumberWithPosixMessage_TarArchiveOutputStreamFailForBigNumber() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class stringType = Class.forName("java.lang.String");
        Class longType = long.class;
        Method failForBigNumberWithPosixMessageMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("failForBigNumberWithPosixMessage", stringType, longType, longType);
        failForBigNumberWithPosixMessageMethod.setAccessible(true);
        java.lang.Object[] failForBigNumberWithPosixMessageMethodArguments = new java.lang.Object[3];
        failForBigNumberWithPosixMessageMethodArguments[0] = ((Object) null);
        failForBigNumberWithPosixMessageMethodArguments[1] = 0L;
        failForBigNumberWithPosixMessageMethodArguments[2] = 0L;
        failForBigNumberWithPosixMessageMethod.invoke(tarArchiveOutputStream, failForBigNumberWithPosixMessageMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method failForBigNumberWithPosixMessage(java.lang.String, long, long)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumberWithPosixMessage(java.lang.String,long,long)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: failForBigNumber(field, value, maxValue, " Use STAR or POSIX extensions to overcome this limit");
 *  */
    @Test(expected = RuntimeException.class)
    public void testFailForBigNumberWithPosixMessage_ThrowRuntimeException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class stringType = Class.forName("java.lang.String");
        Class longType = long.class;
        Method failForBigNumberWithPosixMessageMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("failForBigNumberWithPosixMessage", stringType, longType, longType);
        failForBigNumberWithPosixMessageMethod.setAccessible(true);
        java.lang.Object[] failForBigNumberWithPosixMessageMethodArguments = new java.lang.Object[3];
        failForBigNumberWithPosixMessageMethodArguments[0] = ((Object) null);
        failForBigNumberWithPosixMessageMethodArguments[1] = -255L;
        failForBigNumberWithPosixMessageMethodArguments[2] = -255L;
        try {
            failForBigNumberWithPosixMessageMethod.invoke(tarArchiveOutputStream, failForBigNumberWithPosixMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumberWithPosixMessage(java.lang.String,long,long)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: failForBigNumber(field, value, maxValue, " Use STAR or POSIX extensions to overcome this limit");
 *  */
    @Test(expected = RuntimeException.class)
    public void testFailForBigNumberWithPosixMessage_ThrowRuntimeException_1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class stringType = Class.forName("java.lang.String");
        Class longType = long.class;
        Method failForBigNumberWithPosixMessageMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("failForBigNumberWithPosixMessage", stringType, longType, longType);
        failForBigNumberWithPosixMessageMethod.setAccessible(true);
        java.lang.Object[] failForBigNumberWithPosixMessageMethodArguments = new java.lang.Object[3];
        failForBigNumberWithPosixMessageMethodArguments[0] = ((Object) null);
        failForBigNumberWithPosixMessageMethodArguments[1] = 0L;
        failForBigNumberWithPosixMessageMethodArguments[2] = -255L;
        try {
            failForBigNumberWithPosixMessageMethod.invoke(tarArchiveOutputStream, failForBigNumberWithPosixMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.padAsNeeded
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method padAsNeeded()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#padAsNeeded()}
 * @utbot.executesCondition {@code (start != 0): False}
 *  */
    @Test
    public void testPadAsNeeded_StartEqualsZero() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsPerBlock", -1);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method padAsNeededMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("padAsNeeded");
        padAsNeededMethod.setAccessible(true);
        java.lang.Object[] padAsNeededMethodArguments = new java.lang.Object[0];
        padAsNeededMethod.invoke(tarArchiveOutputStream, padAsNeededMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#padAsNeeded()}
 * @utbot.executesCondition {@code (start != 0): True}
 *  */
    @Test
    public void testPadAsNeeded_StartNotEqualsZero() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", 1124211056);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsPerBlock", -67117185);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method padAsNeededMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("padAsNeeded");
        padAsNeededMethod.setAccessible(true);
        java.lang.Object[] padAsNeededMethodArguments = new java.lang.Object[0];
        padAsNeededMethod.invoke(tarArchiveOutputStream, padAsNeededMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#padAsNeeded()}
 * @utbot.executesCondition {@code (start != 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < recordsPerBlock; i++)} once
 *  */
    @Test
    public void testPadAsNeeded_StartNotEqualsZero_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", 2);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsPerBlock", 3);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method padAsNeededMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("padAsNeeded");
        padAsNeededMethod.setAccessible(true);
        java.lang.Object[] padAsNeededMethodArguments = new java.lang.Object[0];
        padAsNeededMethod.invoke(tarArchiveOutputStream, padAsNeededMethodArguments);
        
        int finalTarArchiveOutputStreamRecordsWritten = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten"));
        
        assertEquals(3, finalTarArchiveOutputStreamRecordsWritten);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#padAsNeeded()}
 * @utbot.executesCondition {@code (start != 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < recordsPerBlock; i++)} once
 *  */
    @Test
    public void testPadAsNeeded_StartNotEqualsZero_4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsPerBlock", 2);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method padAsNeededMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("padAsNeeded");
        padAsNeededMethod.setAccessible(true);
        java.lang.Object[] padAsNeededMethodArguments = new java.lang.Object[0];
        padAsNeededMethod.invoke(tarArchiveOutputStream, padAsNeededMethodArguments);
        
        int finalTarArchiveOutputStreamRecordsWritten = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten"));
        
        assertEquals(2, finalTarArchiveOutputStreamRecordsWritten);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#padAsNeeded()}
 * @utbot.executesCondition {@code (start != 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < recordsPerBlock; i++)} once
 *  */
    @Test
    public void testPadAsNeeded_StartNotEqualsZero_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsPerBlock", 2);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method padAsNeededMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("padAsNeeded");
        padAsNeededMethod.setAccessible(true);
        java.lang.Object[] padAsNeededMethodArguments = new java.lang.Object[0];
        padAsNeededMethod.invoke(tarArchiveOutputStream, padAsNeededMethodArguments);
        
        int finalTarArchiveOutputStreamRecordsWritten = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten"));
        
        assertEquals(2, finalTarArchiveOutputStreamRecordsWritten);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#padAsNeeded()}
 * @utbot.executesCondition {@code (start != 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < recordsPerBlock; i++)} once
 *  */
    @Test
    public void testPadAsNeeded_StartNotEqualsZero_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", 130);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsPerBlock", 131);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method padAsNeededMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("padAsNeeded");
        padAsNeededMethod.setAccessible(true);
        java.lang.Object[] padAsNeededMethodArguments = new java.lang.Object[0];
        padAsNeededMethod.invoke(tarArchiveOutputStream, padAsNeededMethodArguments);
        
        int finalTarArchiveOutputStreamRecordsWritten = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten"));
        
        assertEquals(131, finalTarArchiveOutputStreamRecordsWritten);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method padAsNeeded()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#padAsNeeded()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int start = recordsWritten % recordsPerBlock;
 *  */
    @Test
    public void testPadAsNeeded_ThrowArithmeticException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", -255);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.padAsNeeded] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.padAsNeeded(TarArchiveOutputStream.java:573) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method padAsNeededMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("padAsNeeded");
        padAsNeededMethod.setAccessible(true);
        java.lang.Object[] padAsNeededMethodArguments = new java.lang.Object[0];
        try {
            padAsNeededMethod.invoke(tarArchiveOutputStream, padAsNeededMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#padAsNeeded()}
 * @utbot.executesCondition {@code (start != 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < recordsPerBlock; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testPadAsNeeded_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", 255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsPerBlock", 256);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.padAsNeeded] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 2]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:515)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.padAsNeeded(TarArchiveOutputStream.java:576) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method padAsNeededMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("padAsNeeded");
        padAsNeededMethod.setAccessible(true);
        java.lang.Object[] padAsNeededMethodArguments = new java.lang.Object[0];
        try {
            padAsNeededMethod.invoke(tarArchiveOutputStream, padAsNeededMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#padAsNeeded()}
 * @utbot.executesCondition {@code (start != 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < recordsPerBlock; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testPadAsNeeded_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", 255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsPerBlock", 256);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.padAsNeeded] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:515)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.padAsNeeded(TarArchiveOutputStream.java:576) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method padAsNeededMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("padAsNeeded");
        padAsNeededMethod.setAccessible(true);
        java.lang.Object[] padAsNeededMethodArguments = new java.lang.Object[0];
        try {
            padAsNeededMethod.invoke(tarArchiveOutputStream, padAsNeededMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#padAsNeeded()}
 * @utbot.executesCondition {@code (start != 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < recordsPerBlock; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeEOFRecord();
 *  */
    @Test
    public void testPadAsNeeded_ThrowNullPointerException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", 255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsPerBlock", 256);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.padAsNeeded] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:515)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.padAsNeeded(TarArchiveOutputStream.java:576) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method padAsNeededMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("padAsNeeded");
        padAsNeededMethod.setAccessible(true);
        java.lang.Object[] padAsNeededMethodArguments = new java.lang.Object[0];
        try {
            padAsNeededMethod.invoke(tarArchiveOutputStream, padAsNeededMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#padAsNeeded()}
 * @utbot.executesCondition {@code (start != 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < recordsPerBlock; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeEOFRecord();
 *  */
    @Test
    public void testPadAsNeeded_ThrowNullPointerException_1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", 255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsPerBlock", 256);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1023);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.padAsNeeded] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:515)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.padAsNeeded(TarArchiveOutputStream.java:576) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method padAsNeededMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("padAsNeeded");
        padAsNeededMethod.setAccessible(true);
        java.lang.Object[] padAsNeededMethodArguments = new java.lang.Object[0];
        try {
            padAsNeededMethod.invoke(tarArchiveOutputStream, padAsNeededMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method padAsNeeded()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#padAsNeeded()}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < recordsPerBlock; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: writeEOFRecord();
 *  */
    @Test(expected = IOException.class)
    public void testPadAsNeeded_ThrowIOException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", 255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsPerBlock", 256);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", -254);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method padAsNeededMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("padAsNeeded");
        padAsNeededMethod.setAccessible(true);
        java.lang.Object[] padAsNeededMethodArguments = new java.lang.Object[0];
        try {
            padAsNeededMethod.invoke(tarArchiveOutputStream, padAsNeededMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#padAsNeeded()}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < recordsPerBlock; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: writeEOFRecord();
 *  */
    @Test(expected = IOException.class)
    public void testPadAsNeeded_ThrowIOException_1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", 255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsPerBlock", 256);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method padAsNeededMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("padAsNeeded");
        padAsNeededMethod.setAccessible(true);
        java.lang.Object[] padAsNeededMethodArguments = new java.lang.Object[0];
        try {
            padAsNeededMethod.invoke(tarArchiveOutputStream, padAsNeededMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#padAsNeeded()}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < recordsPerBlock; i++)} once
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testPadAsNeeded_ThrowIOException_2() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", 128);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsPerBlock", 129);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method padAsNeededMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("padAsNeeded");
        padAsNeededMethod.setAccessible(true);
        java.lang.Object[] padAsNeededMethodArguments = new java.lang.Object[0];
        try {
            padAsNeededMethod.invoke(tarArchiveOutputStream, padAsNeededMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#padAsNeeded()}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < recordsPerBlock; i++)} once
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testPadAsNeeded_ThrowIOException_3() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", 255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsPerBlock", 256);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        JarOutputStream out1 = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setSize(-9143358989556553379L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.util.zip.ZipOutputStream", "written", 1585561748420268698L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", -7717823335732729538L);
        ZipOutputStream out2 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out2, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method padAsNeededMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("padAsNeeded");
        padAsNeededMethod.setAccessible(true);
        java.lang.Object[] padAsNeededMethodArguments = new java.lang.Object[0];
        try {
            padAsNeededMethod.invoke(tarArchiveOutputStream, padAsNeededMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#padAsNeeded()}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < recordsPerBlock; i++)} once
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testPadAsNeeded_ThrowIOException_4() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", 255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsPerBlock", 256);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        DeflaterOutputStream out2 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out2, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method padAsNeededMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("padAsNeeded");
        padAsNeededMethod.setAccessible(true);
        java.lang.Object[] padAsNeededMethodArguments = new java.lang.Object[0];
        try {
            padAsNeededMethod.invoke(tarArchiveOutputStream, padAsNeededMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#padAsNeeded()}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < recordsPerBlock; i++)} once
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testPadAsNeeded_ThrowZipException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", 255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsPerBlock", 256);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method padAsNeededMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("padAsNeeded");
        padAsNeededMethod.setAccessible(true);
        java.lang.Object[] padAsNeededMethodArguments = new java.lang.Object[0];
        try {
            padAsNeededMethod.invoke(tarArchiveOutputStream, padAsNeededMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#padAsNeeded()}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < recordsPerBlock; i++)} once
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testPadAsNeeded_ThrowZipException_1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", 255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsPerBlock", 256);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry.setSize(12L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.util.zip.ZipOutputStream", "written", 469641823275483200L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", -8105331624605606505L);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method padAsNeededMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("padAsNeeded");
        padAsNeededMethod.setAccessible(true);
        java.lang.Object[] padAsNeededMethodArguments = new java.lang.Object[0];
        try {
            padAsNeededMethod.invoke(tarArchiveOutputStream, padAsNeededMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#padAsNeeded()}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < recordsPerBlock; i++)} once
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testPadAsNeeded_ThrowZipException_2() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", 255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsPerBlock", 256);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        JarOutputStream out2 = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setSize(java.lang.Long.MIN_VALUE);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out2, "java.util.zip.ZipOutputStream", "current", current);
        setField(out2, "java.util.zip.ZipOutputStream", "written", 623751573679931395L);
        setField(out2, "java.util.zip.ZipOutputStream", "locoff", 1625237822376966650L);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method padAsNeededMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("padAsNeeded");
        padAsNeededMethod.setAccessible(true);
        java.lang.Object[] padAsNeededMethodArguments = new java.lang.Object[0];
        try {
            padAsNeededMethod.invoke(tarArchiveOutputStream, padAsNeededMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#padAsNeeded()}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < recordsPerBlock; i++)} once
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testPadAsNeeded_ThrowIOException_5() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", 255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsPerBlock", 256);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", recordBuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        JarOutputStream out1 = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setSize(222266894034151728L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.util.zip.ZipOutputStream", "written", 4615072684312658986L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", 4392805790278507259L);
        DeflaterOutputStream out2 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out2, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method padAsNeededMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("padAsNeeded");
        padAsNeededMethod.setAccessible(true);
        java.lang.Object[] padAsNeededMethodArguments = new java.lang.Object[0];
        try {
            padAsNeededMethod.invoke(tarArchiveOutputStream, padAsNeededMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#padAsNeeded()}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < recordsPerBlock; i++)} once
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testPadAsNeeded_ThrowIOException_6() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", 159);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsPerBlock", 32);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        JarOutputStream out1 = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method padAsNeededMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("padAsNeeded");
        padAsNeededMethod.setAccessible(true);
        java.lang.Object[] padAsNeededMethodArguments = new java.lang.Object[0];
        try {
            padAsNeededMethod.invoke(tarArchiveOutputStream, padAsNeededMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method padAsNeeded()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#padAsNeeded()}
 * @utbot.executesCondition {@code (start != 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < recordsPerBlock; i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testPadAsNeeded_ThrowIndexOutOfBoundsException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", 255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsPerBlock", 256);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -255222602);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method padAsNeededMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("padAsNeeded");
        padAsNeededMethod.setAccessible(true);
        java.lang.Object[] padAsNeededMethodArguments = new java.lang.Object[0];
        try {
            padAsNeededMethod.invoke(tarArchiveOutputStream, padAsNeededMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for padAsNeeded
    
    public void testPadAsNeeded_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 13 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
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
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry] produces [java.lang.ClassCastException: class org.apache.commons.compress.archivers.ar.ArArchiveEntry cannot be cast to class org.apache.commons.compress.archivers.tar.TarArchiveEntry (org.apache.commons.compress.archivers.ar.ArArchiveEntry and org.apache.commons.compress.archivers.tar.TarArchiveEntry are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(TarArchiveOutputStream.java:274) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(TarArchiveOutputStream.java:276) */
        tarArchiveOutputStream.putArchiveEntry(null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    @Test(expected = UnsupportedEncodingException.class)
    public void testPutArchiveEntry1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object zipEncoding = createInstance("org.apache.commons.compress.archivers.zip.FallbackZipEncoding");
        String charsetName = "";
        setField(zipEncoding, "org.apache.commons.compress.archivers.zip.FallbackZipEncoding", "charsetName", charsetName);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "zipEncoding", zipEncoding);
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = "";
        tarArchiveEntry.setName(name);
        
        tarArchiveOutputStream.putArchiveEntry(tarArchiveEntry);
    }
    ///endregion
    
    ///region OTHER: SECURITY for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    @Test(expected = ExceptionInInitializerError.class)
    @Ignore(value = "Disabled due to sandbox")
    public void testPutArchiveEntry2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object zipEncoding = createInstance("org.apache.commons.compress.archivers.zip.FallbackZipEncoding");
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "zipEncoding", zipEncoding);
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writePaxHeaders(org.apache.commons.compress.archivers.tar.TarArchiveEntry, java.lang.String, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writePaxHeaders(org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#stripTo7Bits(java.lang.String)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = "./PaxHeaders.X/" + stripTo7Bits(entryName);
 *  */
    @Test
    public void testWritePaxHeaders_ThrowNullPointerException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.stripTo7Bits(TarArchiveOutputStream.java:486)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(TarArchiveOutputStream.java:449) */
        tarArchiveOutputStream.writePaxHeaders(null, null, null);
    }
    ///endregion
    
    ///region OTHER: SECURITY for method writePaxHeaders(org.apache.commons.compress.archivers.tar.TarArchiveEntry, java.lang.String, java.util.Map)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testWritePaxHeaders1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "user.name" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:952)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:186)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:217)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:250)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:236)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(TarArchiveOutputStream.java:453) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testWritePaxHeaders2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        String string = "\\\u0001\u0000";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "user.name" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:952)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:186)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:217)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:250)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:236)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(TarArchiveOutputStream.java:453) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testWritePaxHeaders3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        String string = "\\/";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "user.name" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:952)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:186)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:217)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:250)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:236)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(TarArchiveOutputStream.java:453) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testWritePaxHeaders4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        String string = "\u0001\u0001\u0000";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "user.name" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:952)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:186)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:217)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:250)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:236)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(TarArchiveOutputStream.java:453) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testWritePaxHeaders5() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        String string = "\u0001/\\";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "user.name" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:952)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:186)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:217)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:250)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:236)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(TarArchiveOutputStream.java:453) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testWritePaxHeaders6() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        String string = "/\u0001\u0000";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "user.name" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:952)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:186)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:217)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:250)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:236)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(TarArchiveOutputStream.java:453) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testWritePaxHeaders7() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        String string = "/\\";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "user.name" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:952)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:186)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:217)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:250)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:236)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(TarArchiveOutputStream.java:453) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testWritePaxHeaders8() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        String string = "\u0000\u0001/";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "user.name" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:952)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:186)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:217)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:250)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:236)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(TarArchiveOutputStream.java:453) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testWritePaxHeaders9() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        String string = "\u0000\\";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "user.name" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:952)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:186)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:217)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:250)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:236)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(TarArchiveOutputStream.java:453) */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.shouldBeReplaced
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method shouldBeReplaced(char)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#shouldBeReplaced(char)}
 * @utbot.returnsFrom {@code return c == 0 || c == '/' || c == '\\';}
 *  */
    @Test
    public void testShouldBeReplaced_CEqualsZeroOrCEqualsCharOrCEqualsChar() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class charType = char.class;
        Method shouldBeReplacedMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("shouldBeReplaced", charType);
        shouldBeReplacedMethod.setAccessible(true);
        java.lang.Object[] shouldBeReplacedMethodArguments = new java.lang.Object[1];
        shouldBeReplacedMethodArguments[0] = '\u0000';
        boolean actual = ((Boolean) shouldBeReplacedMethod.invoke(tarArchiveOutputStream, shouldBeReplacedMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#shouldBeReplaced(char)}
 * @utbot.returnsFrom {@code return c == 0 || c == '/' || c == '\\';}
 *  */
    @Test
    public void testShouldBeReplaced_CNotEqualsZeroOrCNotEqualsCharOrCNotEqualsChar() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class charType = char.class;
        Method shouldBeReplacedMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("shouldBeReplaced", charType);
        shouldBeReplacedMethod.setAccessible(true);
        java.lang.Object[] shouldBeReplacedMethodArguments = new java.lang.Object[1];
        shouldBeReplacedMethodArguments[0] = ' ';
        boolean actual = ((Boolean) shouldBeReplacedMethod.invoke(tarArchiveOutputStream, shouldBeReplacedMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#shouldBeReplaced(char)}
 * @utbot.returnsFrom {@code return c == 0 || c == '/' || c == '\\';}
 *  */
    @Test
    public void testShouldBeReplaced_CEqualsZeroOrCEqualsCharOrCEqualsChar_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class charType = char.class;
        Method shouldBeReplacedMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("shouldBeReplaced", charType);
        shouldBeReplacedMethod.setAccessible(true);
        java.lang.Object[] shouldBeReplacedMethodArguments = new java.lang.Object[1];
        shouldBeReplacedMethodArguments[0] = '/';
        boolean actual = ((Boolean) shouldBeReplacedMethod.invoke(tarArchiveOutputStream, shouldBeReplacedMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#shouldBeReplaced(char)}
 * @utbot.returnsFrom {@code return c == 0 || c == '/' || c == '\\';}
 *  */
    @Test
    public void testShouldBeReplaced_CEqualsZeroOrCEqualsCharOrCEqualsChar_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class charType = char.class;
        Method shouldBeReplacedMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("shouldBeReplaced", charType);
        shouldBeReplacedMethod.setAccessible(true);
        java.lang.Object[] shouldBeReplacedMethodArguments = new java.lang.Object[1];
        shouldBeReplacedMethodArguments[0] = '\\';
        boolean actual = ((Boolean) shouldBeReplacedMethod.invoke(tarArchiveOutputStream, shouldBeReplacedMethodArguments));
        
        assertTrue(actual);
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
    
    ///region OTHER: ERROR SUITE for method createArchiveEntry(java.io.File, java.lang.String)
    
    @Test
    public void testCreateArchiveEntry1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        File file = ((File) createInstance("java.io.File"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.createArchiveEntry] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.File.isDirectory(File.java:860)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:279)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.createArchiveEntry(TarArchiveOutputStream.java:529) */
        tarArchiveOutputStream.createArchiveEntry(file, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeRecord([B)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])}
 *  */
    @Test
    public void testWriteRecord() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", -255);
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[1];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        
        int finalTarArchiveOutputStreamRecordsWritten = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten"));
        
        assertEquals(-254, finalTarArchiveOutputStreamRecordsWritten);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])}
 *  */
    @Test
    public void testWriteRecord_4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[1];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        
        int finalTarArchiveOutputStreamRecordsWritten = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten"));
        
        assertEquals(1, finalTarArchiveOutputStreamRecordsWritten);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])}
 *  */
    @Test
    public void testWriteRecord_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[1];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        
        int finalTarArchiveOutputStreamRecordsWritten = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten"));
        
        assertEquals(1, finalTarArchiveOutputStreamRecordsWritten);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])}
 *  */
    @Test
    public void testWriteRecord_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[1];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        
        int finalTarArchiveOutputStreamRecordsWritten = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten"));
        
        assertEquals(1, finalTarArchiveOutputStreamRecordsWritten);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])}
 *  */
    @Test
    public void testWriteRecord_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[1];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        
        int finalTarArchiveOutputStreamRecordsWritten = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten"));
        
        assertEquals(1, finalTarArchiveOutputStreamRecordsWritten);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeRecord([B)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])}
 * @utbot.executesCondition {@code (record.length != recordSize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteRecord_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1023);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 1024 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[1];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])}
 * @utbot.executesCondition {@code (record.length != recordSize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.write(record);
 *  */
    @Test
    public void testWriteRecord_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[1];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])}
 * @utbot.executesCondition {@code (record.length != recordSize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteRecord_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[1];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: record.length != recordSize
 *  */
    @Test
    public void testWriteRecord_ThrowNullPointerException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:539) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[1];
        writeRecordMethodArguments[0] = ((Object) null);
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])}
 * @utbot.executesCondition {@code (record.length != recordSize): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(record);
 *  */
    @Test
    public void testWriteRecord_ThrowNullPointerException_1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[1];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeRecord([B)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])}
 * @utbot.executesCondition {@code (record.length != recordSize): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.io.IOException} when: record.length != recordSize
 *  */
    @Test(expected = IOException.class)
    public void testWriteRecord_ThrowIOException_1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] byteArray = {(byte) -127};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[1];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])}
 * @utbot.executesCondition {@code (record.length != recordSize): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteRecord_ThrowIOException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        FileOutputStream out = ((FileOutputStream) createInstance("java.io.FileOutputStream"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(out, "java.io.FileOutputStream", "fd", fd);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[1];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])}
 * @utbot.executesCondition {@code (record.length != recordSize): False}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: out.write(record);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteRecord_ThrowZipException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        (((ZipEntry) entry)).setSize(0L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -2L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[1];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])}
 * @utbot.executesCondition {@code (record.length != recordSize): False}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: out.write(record);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteRecord_ThrowZipException_1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(2L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 8823303735972200447L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", 8823303735972200446L);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[1];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])}
 * @utbot.executesCondition {@code (record.length != recordSize): False}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: out.write(record);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteRecord_ThrowZipException_2() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        (((ZipEntry) entry)).setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[1];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])}
 * @utbot.executesCondition {@code (record.length != recordSize): False}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(record);
 *  */
    @Test(expected = IOException.class)
    public void testWriteRecord_ThrowIOException_2() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        (((ZipEntry) entry)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[1];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])}
 * @utbot.executesCondition {@code (record.length != recordSize): False}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(record);
 *  */
    @Test(expected = IOException.class)
    public void testWriteRecord_ThrowIOException_3() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[1];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])}
 * @utbot.executesCondition {@code (record.length != recordSize): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteRecord_ThrowIOException_4() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 2);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        JarOutputStream out1 = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(17592187240450L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.util.zip.ZipOutputStream", "written", 1769494167552L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", -15822693072896L);
        CheckedOutputStream out2 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out3 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out3, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out2, "java.io.FilterOutputStream", "out", out3);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[1];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])}
 * @utbot.executesCondition {@code (record.length != recordSize): False}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(record);
 *  */
    @Test(expected = IOException.class)
    public void testWriteRecord_ThrowIOException_5() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 2);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        (((ZipEntry) entry)).setSize(844424930132226L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.util.zip.ZipOutputStream", "written", 812676515893568L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", -31748414238656L);
        DeflaterOutputStream out2 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out2, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[1];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])}
 * @utbot.executesCondition {@code (record.length != recordSize): False}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(record);
 *  */
    @Test(expected = IOException.class)
    public void testWriteRecord_ThrowIOException_6() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        JarOutputStream out1 = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setSize(973081602L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.util.zip.ZipOutputStream", "written", 9223333683492029323L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", 9223333682518947722L);
        CheckedOutputStream out2 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        DeflaterOutputStream out3 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out3, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out2, "java.io.FilterOutputStream", "out", out3);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[1];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeRecord([B)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: out.write(record);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteRecord_ThrowIndexOutOfBoundsException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[1];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: out.write(record);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteRecord_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out2 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[1];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: out.write(record);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteRecord_ThrowIndexOutOfBoundsException_2() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -2);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[1];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeRecord
    
    public void testWriteRecord_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 37 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeRecord([B, int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[],int)}
 * @utbot.executesCondition {@code (offset + recordSize > buf.length): False}
 * @utbot.invokes {@link java.io.OutputStream#write(byte[],int,int)}
 *  */
    @Test
    public void testWriteRecord_OffsetPlusRecordSizeLessOrEqualBufLength() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", -255);
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType, intType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[2];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        writeRecordMethodArguments[1] = 0;
        writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        
        int finalTarArchiveOutputStreamRecordsWritten = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten"));
        
        assertEquals(-254, finalTarArchiveOutputStreamRecordsWritten);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeRecord([B, int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: offset + recordSize > buf.length
 *  */
    @Test
    public void testWriteRecord_ThrowNullPointerException1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", -255);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:561) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType, intType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[2];
        writeRecordMethodArguments[0] = ((Object) null);
        writeRecordMethodArguments[1] = -255;
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[],int)}
 * @utbot.executesCondition {@code (offset + recordSize > buf.length): False}
 * @utbot.invokes {@link java.io.OutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(buf, offset, recordSize);
 *  */
    @Test
    public void testWriteRecord_ThrowNullPointerException_11() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", -128);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:568) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType, intType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[2];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        writeRecordMethodArguments[1] = 129;
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeRecord([B, int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[],int)}
 * @utbot.executesCondition {@code (offset + recordSize > buf.length): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.io.IOException} when: offset + recordSize > buf.length
 *  */
    @Test(expected = IOException.class)
    public void testWriteRecord_ThrowIOException1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", -128);
        byte[] byteArray = {};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType, intType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[2];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        writeRecordMethodArguments[1] = 129;
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[],int)}
 * @utbot.executesCondition {@code (offset + recordSize > buf.length): False}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: out.write(buf, offset, recordSize);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteRecord_ThrowZipException1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType, intType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[2];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        writeRecordMethodArguments[1] = 0;
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[],int)}
 * @utbot.executesCondition {@code (offset + recordSize > buf.length): False}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(buf, offset, recordSize);
 *  */
    @Test(expected = IOException.class)
    public void testWriteRecord_ThrowIOException_11() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", -135);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType, intType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[2];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        writeRecordMethodArguments[1] = 135;
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[],int)}
 * @utbot.executesCondition {@code (offset + recordSize > buf.length): False}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(buf, offset, recordSize);
 *  */
    @Test(expected = IOException.class)
    public void testWriteRecord_ThrowIOException_21() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        (((ZipEntry) entry)).setSize(9223363240761753602L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 9223371968135299072L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", 8727373545471L);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType, intType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[2];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        writeRecordMethodArguments[1] = 0;
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[],int)}
 * @utbot.executesCondition {@code (offset + recordSize > buf.length): False}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(buf, offset, recordSize);
 *  */
    @Test(expected = IOException.class)
    public void testWriteRecord_ThrowIOException_31() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        (((ZipEntry) entry)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType, intType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[2];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        writeRecordMethodArguments[1] = 0;
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[],int)}
 * @utbot.executesCondition {@code (offset + recordSize > buf.length): False}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(buf, offset, recordSize);
 *  */
    @Test(expected = IOException.class)
    public void testWriteRecord_ThrowIOException_41() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        (((ZipEntry) entry)).setSize(562949953552386L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 6476813059072L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -556473140493313L);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType, intType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[2];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        writeRecordMethodArguments[1] = 0;
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[],int)}
 * @utbot.executesCondition {@code (offset + recordSize > buf.length): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteRecord_ThrowIOException_51() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        (((ZipEntry) entry)).setSize(2179232314688034L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 71981727735611520L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", 69802495420923487L);
        JarOutputStream out1 = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current1 = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarArchiveEntry entry1 = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry1.setSize(3L);
        setField(current1, "java.util.zip.ZipOutputStream$XEntry", "entry", entry1);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current1);
        setField(out1, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", -2L);
        CheckedOutputStream out2 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out3 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out3, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out2, "java.io.FilterOutputStream", "out", out3);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType, intType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[2];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        writeRecordMethodArguments[1] = 0;
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[],int)}
 * @utbot.executesCondition {@code (offset + recordSize > buf.length): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteRecord_ThrowIOException_61() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 2);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(-6917529027638818818L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", 6917529027638818820L);
        JarOutputStream out1 = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current1 = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry1 = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry1)).setSize(1073741824L);
        setField(current1, "java.util.zip.ZipOutputStream$XEntry", "entry", entry1);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current1);
        setField(out1, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", -1073741822L);
        CheckedOutputStream out2 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        DeflaterOutputStream out3 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out3, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out2, "java.io.FilterOutputStream", "out", out3);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method writeRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeRecord", byteArrayType, intType);
        writeRecordMethod.setAccessible(true);
        java.lang.Object[] writeRecordMethodArguments = new java.lang.Object[2];
        writeRecordMethodArguments[0] = ((Object) byteArray);
        writeRecordMethodArguments[1] = 0;
        try {
            writeRecordMethod.invoke(tarArchiveOutputStream, writeRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeRecord
    
    public void testWriteRecord_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 25 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.stripTo7Bits
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method stripTo7Bits(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#stripTo7Bits(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return result.toString();}
 *  */
    @Test
    public void testStripTo7Bits_StringBuilderToString() throws Exception  {
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method stripTo7Bits(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link java.lang.String#length()} once,
    ///     {@link java.lang.String#charAt(int)} once,
    ///     org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#shouldBeReplaced(char) once,
    ///     {@link java.lang.StringBuilder#toString()} once
    /// return from: {@code return result.toString();}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#stripTo7Bits(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.returnsFrom {@code return result.toString();}
 *  */
    @Test
    public void testStripTo7Bits_NotShouldBeReplaced() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#stripTo7Bits(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.returnsFrom {@code return result.toString();}
 *  */
    @Test
    public void testStripTo7Bits_ShouldBeReplaced() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        String string = "/";
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class stringType = Class.forName("java.lang.String");
        Method stripTo7BitsMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("stripTo7Bits", stringType);
        stripTo7BitsMethod.setAccessible(true);
        java.lang.Object[] stripTo7BitsMethodArguments = new java.lang.Object[1];
        stripTo7BitsMethodArguments[0] = string;
        String actual = ((String) stripTo7BitsMethod.invoke(tarArchiveOutputStream, stripTo7BitsMethodArguments));
        
        String expected = "_";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#stripTo7Bits(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.returnsFrom {@code return result.toString();}
 *  */
    @Test
    public void testStripTo7Bits_ShouldBeReplaced_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        String string = "\u0000";
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class stringType = Class.forName("java.lang.String");
        Method stripTo7BitsMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("stripTo7Bits", stringType);
        stripTo7BitsMethod.setAccessible(true);
        java.lang.Object[] stripTo7BitsMethodArguments = new java.lang.Object[1];
        stripTo7BitsMethodArguments[0] = string;
        String actual = ((String) stripTo7BitsMethod.invoke(tarArchiveOutputStream, stripTo7BitsMethodArguments));
        
        String expected = "_";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#stripTo7Bits(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.returnsFrom {@code return result.toString();}
 *  */
    @Test
    public void testStripTo7Bits_ShouldBeReplaced_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        String string = "\\";
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class stringType = Class.forName("java.lang.String");
        Method stripTo7BitsMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("stripTo7Bits", stringType);
        stripTo7BitsMethod.setAccessible(true);
        java.lang.Object[] stripTo7BitsMethodArguments = new java.lang.Object[1];
        stripTo7BitsMethodArguments[0] = string;
        String actual = ((String) stripTo7BitsMethod.invoke(tarArchiveOutputStream, stripTo7BitsMethodArguments));
        
        String expected = "_";
        
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.stripTo7Bits(TarArchiveOutputStream.java:486) */
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeEOFRecord()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()}
 *  */
    @Test
    public void testWriteEOFRecord() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", -255);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method writeEOFRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeEOFRecord");
        writeEOFRecordMethod.setAccessible(true);
        java.lang.Object[] writeEOFRecordMethodArguments = new java.lang.Object[0];
        writeEOFRecordMethod.invoke(tarArchiveOutputStream, writeEOFRecordMethodArguments);
        
        int finalTarArchiveOutputStreamRecordsWritten = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten"));
        
        assertEquals(-254, finalTarArchiveOutputStreamRecordsWritten);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()}
 *  */
    @Test
    public void testWriteEOFRecord_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method writeEOFRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeEOFRecord");
        writeEOFRecordMethod.setAccessible(true);
        java.lang.Object[] writeEOFRecordMethodArguments = new java.lang.Object[0];
        writeEOFRecordMethod.invoke(tarArchiveOutputStream, writeEOFRecordMethodArguments);
        
        int finalTarArchiveOutputStreamRecordsWritten = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten"));
        
        assertEquals(1, finalTarArchiveOutputStreamRecordsWritten);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()}
 *  */
    @Test
    public void testWriteEOFRecord_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        CRC32 cksum = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(out1, "java.util.zip.CheckedOutputStream", "cksum", cksum);
        ZipOutputStream out2 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method writeEOFRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeEOFRecord");
        writeEOFRecordMethod.setAccessible(true);
        java.lang.Object[] writeEOFRecordMethodArguments = new java.lang.Object[0];
        writeEOFRecordMethod.invoke(tarArchiveOutputStream, writeEOFRecordMethodArguments);
        
        int finalTarArchiveOutputStreamRecordsWritten = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten"));
        
        assertEquals(1, finalTarArchiveOutputStreamRecordsWritten);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()}
 *  */
    @Test
    public void testWriteEOFRecord_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        Object cksum = createInstance("org.apache.commons.compress.compressors.snappy.PureJavaCrc32C");
        setField(out1, "java.util.zip.CheckedOutputStream", "cksum", cksum);
        DeflaterOutputStream out2 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out2, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Method writeEOFRecordMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("writeEOFRecord");
        writeEOFRecordMethod.setAccessible(true);
        java.lang.Object[] writeEOFRecordMethodArguments = new java.lang.Object[0];
        writeEOFRecordMethod.invoke(tarArchiveOutputStream, writeEOFRecordMethodArguments);
        
        int finalTarArchiveOutputStreamRecordsWritten = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten"));
        
        assertEquals(1, finalTarArchiveOutputStreamRecordsWritten);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeEOFRecord()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()}
 * @utbot.throwsException {@link java.io.IOException} in: writeRecord(recordBuf);
 *  */
    @Test(expected = IOException.class)
    public void testWriteEOFRecord_ThrowIOException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", -2);
        
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
 * @utbot.throwsException {@link java.io.IOException} in: writeRecord(recordBuf);
 *  */
    @Test(expected = IOException.class)
    public void testWriteEOFRecord_ThrowIOException_1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteEOFRecord_ThrowIOException_11() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127, (byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 2);
        FileOutputStream out = ((FileOutputStream) createInstance("java.io.FileOutputStream"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(out, "java.io.FileOutputStream", "fd", fd);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteEOFRecord_ThrowIOException_2() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        CheckedOutputStream out = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out2 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out2, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
 * @utbot.throwsException {@link java.io.IOException} in: writeRecord(recordBuf);
 *  */
    @Test(expected = IOException.class)
    public void testWriteEOFRecord_ThrowIOException_3() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
 * @utbot.throwsException {@link java.io.IOException} in: writeRecord(recordBuf);
 *  */
    @Test(expected = IOException.class)
    public void testWriteEOFRecord_ThrowIOException_4() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        (((ZipEntry) entry)).setSize(612564047694397442L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 612564047694397441L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", 0L);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteEOFRecord_ThrowIOException_5() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out2 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out2, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
 * @utbot.throwsException {@link java.util.zip.ZipException} in: writeRecord(recordBuf);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteEOFRecord_ThrowZipException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        CheckedOutputStream out = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
 * @utbot.throwsException {@link java.io.IOException} in: writeRecord(recordBuf);
 *  */
    @Test(expected = IOException.class)
    public void testWriteEOFRecord_ThrowIOException_6() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        (((ZipEntry) entry)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
 * @utbot.throwsException {@link java.io.IOException} in: writeRecord(recordBuf);
 *  */
    @Test(expected = IOException.class)
    public void testWriteEOFRecord_ThrowIOException_7() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteEOFRecord_ThrowIOException_8() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out2 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out2, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
 * @utbot.throwsException {@link java.io.IOException} in: writeRecord(recordBuf);
 *  */
    @Test(expected = IOException.class)
    public void testWriteEOFRecord_ThrowIOException_9() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        (((ZipEntry) entry)).setSize(612580540368814082L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 12925720854529L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -612567614647959552L);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteEOFRecord_ThrowIOException_10() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setSize(2425681599732909254L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.util.zip.ZipOutputStream", "written", 2377866038064186412L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", -47815561668722841L);
        CheckedOutputStream out2 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out3 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out3, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out2, "java.io.FilterOutputStream", "out", out3);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testWriteEOFRecord_ThrowZipException_1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        FilterOutputStream out2 = ((FilterOutputStream) createInstance("java.io.FilterOutputStream"));
        ZipOutputStream out3 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out3, "java.util.zip.ZipOutputStream", "current", current);
        setField(out2, "java.io.FilterOutputStream", "out", out3);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testWriteEOFRecord_ThrowZipException_2() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        FilterOutputStream out2 = ((FilterOutputStream) createInstance("java.io.FilterOutputStream"));
        CheckedOutputStream out3 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out4 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out4, "java.util.zip.ZipOutputStream", "current", current);
        setField(out3, "java.io.FilterOutputStream", "out", out4);
        setField(out2, "java.io.FilterOutputStream", "out", out3);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: writeRecord(recordBuf);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteEOFRecord_ThrowIndexOutOfBoundsException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: writeRecord(recordBuf);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteEOFRecord_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -2);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeEOFRecord()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()}
 * @utbot.invokes {@link java.util.Arrays#fill(byte[],byte)}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeRecord(recordBuf);
 *  */
    @Test
    public void testWriteEOFRecord_ThrowNullPointerException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:515) */
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
        // 24 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
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
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumberWithPosixMessage(java.lang.String,long,long)
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
        tarArchiveEntry.setGroupId(9);
        tarArchiveEntry.setSize(1L);
        tarArchiveEntry.setModTime(251L);
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumbers(TarArchiveOutputStream.java:610) */
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
 * @utbot.throwsException {@link java.lang.RuntimeException} in: failForBigNumber("major device number", entry.getDevMajor(), TarConstants.MAXID);
 *  */
    @Test(expected = RuntimeException.class)
    public void testFailForBigNumbers_ThrowRuntimeException_2() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setMode(1);
        tarArchiveEntry.setUserId(2);
        tarArchiveEntry.setGroupId(4);
        tarArchiveEntry.setSize(2L);
        tarArchiveEntry.setModTime(129L);
        tarArchiveEntry.setDevMajor(4194305);
        
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
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getDevMinor()}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumber(java.lang.String,long,long)
 * @utbot.throwsException {@link java.lang.RuntimeException} in: failForBigNumber("minor device number", entry.getDevMinor(), TarConstants.MAXID);
 *  */
    @Test(expected = RuntimeException.class)
    public void testFailForBigNumbers_ThrowRuntimeException_3() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setMode(1);
        tarArchiveEntry.setUserId(1);
        tarArchiveEntry.setGroupId(1);
        tarArchiveEntry.setSize(0L);
        tarArchiveEntry.setModTime(2L);
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
 * @utbot.returnsFrom {@code return this.recordSize;}
 *  */
    @Test
    public void testGetRecordSize_ReturnThisRecordSize() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", -255);
        
        int actual = tarArchiveOutputStream.getRecordSize();
        
        assertEquals(-255, actual);
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
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 *  */
    @Test
    public void testCloseArchiveEntry_AssemLenGreaterThanZero() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", 9007199291533492712L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", 9007199291533492711L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        JarOutputStream out1 = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.closeArchiveEntry();
        
        long finalTarArchiveOutputStreamCurrBytes = ((Long) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes"));
        int finalTarArchiveOutputStreamAssemLen = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen"));
        int finalTarArchiveOutputStreamRecordsWritten = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten"));
        boolean finalTarArchiveOutputStreamHaveUnclosedEntry = ((Boolean) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry"));
        
        assertEquals(9007199291533492712L, finalTarArchiveOutputStreamCurrBytes);
        
        assertEquals(0, finalTarArchiveOutputStreamAssemLen);
        
        assertEquals(1, finalTarArchiveOutputStreamRecordsWritten);
        
        assertFalse(finalTarArchiveOutputStreamHaveUnclosedEntry);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 *  */
    @Test
    public void testCloseArchiveEntry_AssemLenGreaterThanZero_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", 9016206453995732992L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", 9016206453995732991L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.closeArchiveEntry();
        
        long finalTarArchiveOutputStreamCurrBytes = ((Long) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes"));
        int finalTarArchiveOutputStreamAssemLen = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen"));
        int finalTarArchiveOutputStreamRecordsWritten = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten"));
        boolean finalTarArchiveOutputStreamHaveUnclosedEntry = ((Boolean) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry"));
        
        assertEquals(9016206453995732992L, finalTarArchiveOutputStreamCurrBytes);
        
        assertEquals(0, finalTarArchiveOutputStreamAssemLen);
        
        assertEquals(1, finalTarArchiveOutputStreamRecordsWritten);
        
        assertFalse(finalTarArchiveOutputStreamHaveUnclosedEntry);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 *  */
    @Test
    public void testCloseArchiveEntry_AssemLenGreaterThanZero_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", 1L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", 0L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        Object cksum = createInstance("org.apache.commons.compress.compressors.snappy.PureJavaCrc32C");
        setField(out1, "java.util.zip.CheckedOutputStream", "cksum", cksum);
        DeflaterOutputStream out2 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out2, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.closeArchiveEntry();
        
        long finalTarArchiveOutputStreamCurrBytes = ((Long) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes"));
        int finalTarArchiveOutputStreamAssemLen = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen"));
        int finalTarArchiveOutputStreamRecordsWritten = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten"));
        boolean finalTarArchiveOutputStreamHaveUnclosedEntry = ((Boolean) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry"));
        
        assertEquals(1L, finalTarArchiveOutputStreamCurrBytes);
        
        assertEquals(0, finalTarArchiveOutputStreamAssemLen);
        
        assertEquals(1, finalTarArchiveOutputStreamRecordsWritten);
        
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
 * @utbot.throwsException {@link java.io.IOException} when: currBytes < currSize
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -1L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -2L);
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
 * @utbot.throwsException {@link java.io.IOException} in: writeRecord(assemBuf);
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", -2);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} twice
 * @utbot.throwsException {@link java.io.IOException} in: writeRecord(assemBuf);
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_5() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127, (byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", -3);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code (currBytes < currSize): True}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.io.IOException} when: currBytes < currSize
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", 0L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -134217728000L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} twice
 * @utbot.throwsException {@link java.io.IOException} in: writeRecord(assemBuf);
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_6() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127, (byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 2);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        CheckedOutputStream out = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code (currBytes < currSize): False}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_16() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", 9016206490788167680L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", 9016206490788167679L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        FileOutputStream out = ((FileOutputStream) createInstance("java.io.FileOutputStream"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(out, "java.io.FileOutputStream", "fd", fd);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.util.zip.ZipException} in: writeRecord(assemBuf);
 *  */
    @Test(expected = ZipException.class)
    public void testCloseArchiveEntry_ThrowZipException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} twice
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_7() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127, (byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 2);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        CheckedOutputStream out = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        JarOutputStream out2 = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(out2, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.io.IOException} in: writeRecord(assemBuf);
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_8() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.io.IOException} in: writeRecord(assemBuf);
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_9() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(180143985111597059L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 652837137152L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -180143332274459906L);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code (currBytes < currSize): True}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.io.IOException} when: currBytes < currSize
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_10() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", 0L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", java.lang.Long.MIN_VALUE);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        CRC32 cksum = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(out1, "java.util.zip.CheckedOutputStream", "cksum", cksum);
        ZipOutputStream out2 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.util.zip.ZipException} in: writeRecord(assemBuf);
 *  */
    @Test(expected = ZipException.class)
    public void testCloseArchiveEntry_ThrowZipException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        (((ZipEntry) entry)).setSize(0L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", -2L);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testCloseArchiveEntry_ThrowZipException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        (((ZipEntry) entry)).setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.util.zip.ZipOutputStream", "written", -8L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", -2L);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.io.IOException} in: writeRecord(assemBuf);
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_11() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        (((ZipEntry) entry)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
    public void testCloseArchiveEntry_ThrowIOException_12() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out2 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out2, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testCloseArchiveEntry_ThrowZipException_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out2 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        (((ZipEntry) entry)).setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out2, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
    public void testCloseArchiveEntry_ThrowIOException_13() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setSize(8389250L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.util.zip.ZipOutputStream", "written", 4611686018429370881L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", 4611686018420981632L);
        CheckedOutputStream out2 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out3 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out3, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out2, "java.io.FilterOutputStream", "out", out3);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
    public void testCloseArchiveEntry_ThrowIOException_14() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 256);
        byte[] assemBuf = new byte[33];
        assemBuf[0] = (byte) -127;
        assemBuf[1] = (byte) -127;
        assemBuf[2] = (byte) -127;
        assemBuf[3] = (byte) -127;
        assemBuf[4] = (byte) -127;
        assemBuf[5] = (byte) -127;
        assemBuf[6] = (byte) -127;
        assemBuf[7] = (byte) -127;
        assemBuf[8] = (byte) -127;
        assemBuf[9] = (byte) -127;
        assemBuf[10] = (byte) -127;
        assemBuf[11] = (byte) -127;
        assemBuf[12] = (byte) -127;
        assemBuf[13] = (byte) -127;
        assemBuf[14] = (byte) -127;
        assemBuf[15] = (byte) -127;
        assemBuf[16] = (byte) -127;
        assemBuf[17] = (byte) -127;
        assemBuf[18] = (byte) -127;
        assemBuf[19] = (byte) -127;
        assemBuf[20] = (byte) -127;
        assemBuf[21] = (byte) -127;
        assemBuf[22] = (byte) -127;
        assemBuf[23] = (byte) -127;
        assemBuf[24] = (byte) -127;
        assemBuf[25] = (byte) -127;
        assemBuf[26] = (byte) -127;
        assemBuf[27] = (byte) -127;
        assemBuf[28] = (byte) -127;
        assemBuf[29] = (byte) -127;
        assemBuf[30] = (byte) -127;
        assemBuf[31] = (byte) -127;
        assemBuf[32] = (byte) -127;
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 33);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 992);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
    public void testCloseArchiveEntry_ThrowIOException_15() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(562949958860803L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.util.zip.ZipOutputStream", "written", 4611686054969737216L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", 4611123105010876414L);
        FilterOutputStream out2 = ((FilterOutputStream) createInstance("java.io.FilterOutputStream"));
        CheckedOutputStream out3 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        JarOutputStream out4 = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(out4, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out3, "java.io.FilterOutputStream", "out", out4);
        setField(out2, "java.io.FilterOutputStream", "out", out3);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeRecord(byte[])
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: writeRecord(assemBuf);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testCloseArchiveEntry_ThrowIndexOutOfBoundsException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", assemBuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -131074);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.closeArchiveEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", assemBuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry(TarArchiveOutputStream.java:344) */
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry(TarArchiveOutputStream.java:344) */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry(TarArchiveOutputStream.java:340) */
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeRecord(assemBuf);
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowNullPointerException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry(TarArchiveOutputStream.java:344) */
        tarArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#closeArchiveEntry()}
 * @utbot.iterates iterate the loop {@code for(int i = assemLen; i < assemBuf.length; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeRecord(assemBuf);
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowNullPointerException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 256);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -2147482624);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry(TarArchiveOutputStream.java:344) */
        tarArchiveOutputStream.closeArchiveEntry();
    }
    ///endregion
    
    ///region Errors report for closeArchiveEntry
    
    public void testCloseArchiveEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 27 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.transferModTime
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method transferModTime(org.apache.commons.compress.archivers.tar.TarArchiveEntry, org.apache.commons.compress.archivers.tar.TarArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#transferModTime(org.apache.commons.compress.archivers.tar.TarArchiveEntry,org.apache.commons.compress.archivers.tar.TarArchiveEntry)}
 * @utbot.executesCondition {@code (fromModTimeSeconds < 0): False}
 * @utbot.executesCondition {@code (fromModTimeSeconds > TarConstants.MAXSIZE): False}
 *  */
    @Test
    public void testTransferModTime_FromModTimeSecondsLessOrEqualTarConstantsMAXSIZE() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setModTime(0L);
        TarArchiveEntry tarArchiveEntry1 = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry1.setModTime(-255L);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class tarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Method transferModTimeMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("transferModTime", tarArchiveEntryType, tarArchiveEntryType);
        transferModTimeMethod.setAccessible(true);
        java.lang.Object[] transferModTimeMethodArguments = new java.lang.Object[2];
        transferModTimeMethodArguments[0] = tarArchiveEntry;
        transferModTimeMethodArguments[1] = tarArchiveEntry1;
        transferModTimeMethod.invoke(tarArchiveOutputStream, transferModTimeMethodArguments);
        
        long finalTarArchiveEntry1ModTime = ((Long) getFieldValue(tarArchiveEntry1, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "modTime"));
        
        assertEquals(0L, finalTarArchiveEntry1ModTime);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#transferModTime(org.apache.commons.compress.archivers.tar.TarArchiveEntry,org.apache.commons.compress.archivers.tar.TarArchiveEntry)}
 * @utbot.executesCondition {@code (fromModTimeSeconds < 0): False}
 * @utbot.executesCondition {@code (fromModTimeSeconds > TarConstants.MAXSIZE): True}
 *  */
    @Test
    public void testTransferModTime_FromModTimeSecondsGreaterThanTarConstantsMAXSIZE() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setModTime(9007203549708288L);
        TarArchiveEntry tarArchiveEntry1 = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry1.setModTime(0L);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class tarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Method transferModTimeMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("transferModTime", tarArchiveEntryType, tarArchiveEntryType);
        transferModTimeMethod.setAccessible(true);
        java.lang.Object[] transferModTimeMethodArguments = new java.lang.Object[2];
        transferModTimeMethodArguments[0] = tarArchiveEntry;
        transferModTimeMethodArguments[1] = tarArchiveEntry1;
        transferModTimeMethod.invoke(tarArchiveOutputStream, transferModTimeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#transferModTime(org.apache.commons.compress.archivers.tar.TarArchiveEntry,org.apache.commons.compress.archivers.tar.TarArchiveEntry)}
 * @utbot.executesCondition {@code (fromModTimeSeconds < 0): True}
 *  */
    @Test
    public void testTransferModTime_FromModTimeSecondsLessThanZero() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setModTime(-256L);
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class tarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Method transferModTimeMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("transferModTime", tarArchiveEntryType, tarArchiveEntryType);
        transferModTimeMethod.setAccessible(true);
        java.lang.Object[] transferModTimeMethodArguments = new java.lang.Object[2];
        transferModTimeMethodArguments[0] = tarArchiveEntry;
        transferModTimeMethodArguments[1] = tarArchiveEntry;
        transferModTimeMethod.invoke(tarArchiveOutputStream, transferModTimeMethodArguments);
        
        long finalTarArchiveEntryModTime = ((Long) getFieldValue(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "modTime"));
        
        long finalTarArchiveEntryModTime1 = ((Long) getFieldValue(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "modTime"));
        
        assertEquals(0L, finalTarArchiveEntryModTime);
        
        assertEquals(0L, finalTarArchiveEntryModTime1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method transferModTime(org.apache.commons.compress.archivers.tar.TarArchiveEntry, org.apache.commons.compress.archivers.tar.TarArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#transferModTime(org.apache.commons.compress.archivers.tar.TarArchiveEntry,org.apache.commons.compress.archivers.tar.TarArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getModTime()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Date fromModTime = from.getModTime();
 *  */
    @Test
    public void testTransferModTime_ThrowNullPointerException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.transferModTime] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.transferModTime(TarArchiveOutputStream.java:693) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class tarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Method transferModTimeMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("transferModTime", tarArchiveEntryType, tarArchiveEntryType);
        transferModTimeMethod.setAccessible(true);
        java.lang.Object[] transferModTimeMethodArguments = new java.lang.Object[2];
        transferModTimeMethodArguments[0] = ((Object) null);
        transferModTimeMethodArguments[1] = ((Object) null);
        try {
            transferModTimeMethod.invoke(tarArchiveOutputStream, transferModTimeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method failForBigNumber(java.lang.String, long, long)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumber(java.lang.String,long,long)}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumber(java.lang.String,long,long,java.lang.String)
 *  */
    @Test
    public void testFailForBigNumber_TarArchiveOutputStreamFailForBigNumber() throws Exception  {
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
 * @utbot.throwsException {@link java.lang.RuntimeException} in: failForBigNumber(field, value, maxValue, "");
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
 * @utbot.throwsException {@link java.lang.RuntimeException} in: failForBigNumber(field, value, maxValue, "");
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method failForBigNumber(java.lang.String, long, long, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumber(java.lang.String,long,long,java.lang.String)}
 * @utbot.executesCondition {@code (value < 0): False}
 * @utbot.executesCondition {@code (value > maxValue): False}
 *  */
    @Test
    public void testFailForBigNumber_ValueLessOrEqualMaxValue() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class stringType = Class.forName("java.lang.String");
        Class longType = long.class;
        Method failForBigNumberMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("failForBigNumber", stringType, longType, longType, stringType);
        failForBigNumberMethod.setAccessible(true);
        java.lang.Object[] failForBigNumberMethodArguments = new java.lang.Object[4];
        failForBigNumberMethodArguments[0] = ((Object) null);
        failForBigNumberMethodArguments[1] = 0L;
        failForBigNumberMethodArguments[2] = 0L;
        failForBigNumberMethodArguments[3] = ((Object) null);
        failForBigNumberMethod.invoke(tarArchiveOutputStream, failForBigNumberMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method failForBigNumber(java.lang.String, long, long, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumber(java.lang.String,long,long,java.lang.String)}
 * @utbot.executesCondition {@code (value < 0): True}
 * @utbot.throwsException {@link java.lang.RuntimeException} when: value < 0 || value > maxValue
 *  */
    @Test(expected = RuntimeException.class)
    public void testFailForBigNumber_ThrowRuntimeException1() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class stringType = Class.forName("java.lang.String");
        Class longType = long.class;
        Method failForBigNumberMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("failForBigNumber", stringType, longType, longType, stringType);
        failForBigNumberMethod.setAccessible(true);
        java.lang.Object[] failForBigNumberMethodArguments = new java.lang.Object[4];
        failForBigNumberMethodArguments[0] = ((Object) null);
        failForBigNumberMethodArguments[1] = -255L;
        failForBigNumberMethodArguments[2] = -255L;
        failForBigNumberMethodArguments[3] = ((Object) null);
        try {
            failForBigNumberMethod.invoke(tarArchiveOutputStream, failForBigNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#failForBigNumber(java.lang.String,long,long,java.lang.String)}
 * @utbot.executesCondition {@code (value < 0): False}
 * @utbot.executesCondition {@code (value > maxValue): True}
 * @utbot.throwsException {@link java.lang.RuntimeException} when: value < 0 || value > maxValue
 *  */
    @Test(expected = RuntimeException.class)
    public void testFailForBigNumber_ThrowRuntimeException_11() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class stringType = Class.forName("java.lang.String");
        Class longType = long.class;
        Method failForBigNumberMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("failForBigNumber", stringType, longType, longType, stringType);
        failForBigNumberMethod.setAccessible(true);
        java.lang.Object[] failForBigNumberMethodArguments = new java.lang.Object[4];
        failForBigNumberMethodArguments[0] = ((Object) null);
        failForBigNumberMethodArguments[1] = 0L;
        failForBigNumberMethodArguments[2] = -255L;
        failForBigNumberMethodArguments[3] = ((Object) null);
        try {
            failForBigNumberMethod.invoke(tarArchiveOutputStream, failForBigNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.handleLongName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleLongName(org.apache.commons.compress.archivers.tar.TarArchiveEntry, java.lang.String, java.util.Map, java.lang.String, byte, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#handleLongName(org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map,java.lang.String,byte,java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipEncoding#encode(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final ByteBuffer encodedName = zipEncoding.encode(name);
 *  */
    @Test
    public void testHandleLongName_ThrowNullPointerException() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.handleLongName] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.handleLongName(TarArchiveOutputStream.java:665) */
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class tarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class stringType = Class.forName("java.lang.String");
        Class mapType = Class.forName("java.util.Map");
        Class byteType = byte.class;
        Method handleLongNameMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("handleLongName", tarArchiveEntryType, stringType, mapType, stringType, byteType, stringType);
        handleLongNameMethod.setAccessible(true);
        java.lang.Object[] handleLongNameMethodArguments = new java.lang.Object[6];
        handleLongNameMethodArguments[0] = ((Object) null);
        handleLongNameMethodArguments[1] = ((Object) null);
        handleLongNameMethodArguments[2] = ((Object) null);
        handleLongNameMethodArguments[3] = ((Object) null);
        handleLongNameMethodArguments[4] = (byte) -127;
        handleLongNameMethodArguments[5] = ((Object) null);
        try {
            handleLongNameMethod.invoke(tarArchiveOutputStream, handleLongNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleLongName(org.apache.commons.compress.archivers.tar.TarArchiveEntry, java.lang.String, java.util.Map, java.lang.String, byte, java.lang.String)
    
    @Test
    public void testHandleLongName1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object zipEncoding = createInstance("org.apache.commons.compress.archivers.zip.FallbackZipEncoding");
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "zipEncoding", zipEncoding);
        String string = "";
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class tarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class stringType = Class.forName("java.lang.String");
        Class mapType = Class.forName("java.util.Map");
        Class byteType = byte.class;
        Method handleLongNameMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("handleLongName", tarArchiveEntryType, stringType, mapType, stringType, byteType, stringType);
        handleLongNameMethod.setAccessible(true);
        java.lang.Object[] handleLongNameMethodArguments = new java.lang.Object[6];
        handleLongNameMethodArguments[0] = ((Object) null);
        handleLongNameMethodArguments[1] = string;
        handleLongNameMethodArguments[2] = ((Object) null);
        handleLongNameMethodArguments[3] = ((Object) null);
        handleLongNameMethodArguments[4] = (byte) 0;
        handleLongNameMethodArguments[5] = ((Object) null);
        boolean actual = ((Boolean) handleLongNameMethod.invoke(tarArchiveOutputStream, handleLongNameMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method handleLongName(org.apache.commons.compress.archivers.tar.TarArchiveEntry, java.lang.String, java.util.Map, java.lang.String, byte, java.lang.String)
    
    @Test(expected = UnsupportedEncodingException.class)
    public void testHandleLongName2() throws Throwable  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object zipEncoding = createInstance("org.apache.commons.compress.archivers.zip.FallbackZipEncoding");
        String charsetName = "";
        setField(zipEncoding, "org.apache.commons.compress.archivers.zip.FallbackZipEncoding", "charsetName", charsetName);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "zipEncoding", zipEncoding);
        String string = "";
        
        Class tarArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class tarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class stringType = Class.forName("java.lang.String");
        Class mapType = Class.forName("java.util.Map");
        Class byteType = byte.class;
        Method handleLongNameMethod = tarArchiveOutputStreamClazz.getDeclaredMethod("handleLongName", tarArchiveEntryType, stringType, mapType, stringType, byteType, stringType);
        handleLongNameMethod.setAccessible(true);
        java.lang.Object[] handleLongNameMethodArguments = new java.lang.Object[6];
        handleLongNameMethodArguments[0] = ((Object) null);
        handleLongNameMethodArguments[1] = string;
        handleLongNameMethodArguments[2] = ((Object) null);
        handleLongNameMethodArguments[3] = ((Object) null);
        handleLongNameMethodArguments[4] = (byte) 0;
        handleLongNameMethodArguments[5] = ((Object) null);
        try {
            handleLongNameMethod.invoke(tarArchiveOutputStream, handleLongNameMethodArguments);
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.flush(TarArchiveOutputStream.java:520) */
        tarArchiveOutputStream.flush();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method flush()
    
    @Test
    public void testFlush1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        CountingOutputStream out = ((CountingOutputStream) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile$1"));
        CountingOutputStream out1 = ((CountingOutputStream) createInstance("org.apache.commons.compress.utils.CountingOutputStream"));
        Object out2 = createInstance("java.util.Base64$EncOutputStream");
        PrintStream out3 = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(out2, "java.io.FilterOutputStream", "out", out3);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(out, "java.io.FilterOutputStream", "out", out1);
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -250L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -250L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        tarArchiveOutputStream.write(null, -255, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code (assemLen + numToWrite >= recordBuf.length): False}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 *  */
    @Test
    public void testWrite_AssemLenPlusNumToWriteLessThanRecordBufLength() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -250L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -250L);
        byte[] recordBuf = {(byte) -127, (byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", 256L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", 255L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 0, 1);
        
        long finalTarArchiveOutputStreamCurrBytes = ((Long) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes"));
        int finalTarArchiveOutputStreamRecordsWritten = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordsWritten"));
        
        assertEquals(256L, finalTarArchiveOutputStreamCurrBytes);
        
        assertEquals(-254, finalTarArchiveOutputStreamRecordsWritten);
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -251L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -252L);
        byte[] recordBuf = {(byte) 0, (byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        byte[] assemBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        byte[] byteArray = {(byte) -127};
        
        tarArchiveOutputStream.write(byteArray, 0, 1);
        
        int finalTarArchiveOutputStreamAssemLen = ((Integer) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen"));
        byte[] tarArchiveOutputStreamAssemBuf = ((byte[]) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf"));
        byte finalTarArchiveOutputStreamAssemBuf0 = ((Byte) get(tarArchiveOutputStreamAssemBuf, 0));
        
        assertEquals(1, finalTarArchiveOutputStreamAssemLen);
        
        assertEquals((byte) -127, finalTarArchiveOutputStreamAssemBuf0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: !haveUnclosedEntry
 *  */
    @Test(expected = IllegalStateException.class)
    public void testWrite_ThrowIllegalStateException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        tarArchiveOutputStream.write(null, -255, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): False}
 * @utbot.executesCondition {@code (currBytes + numToWrite > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code (assemLen + numToWrite >= recordBuf.length): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_ThrowIndexOutOfBoundsException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -235L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -235L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        JarOutputStream out1 = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (!haveUnclosedEntry): False}
 * @utbot.executesCondition {@code (currBytes + numToWrite > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code (assemLen + numToWrite >= recordBuf.length): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_ThrowIndexOutOfBoundsException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -250L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -250L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1073741825);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 0, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (currBytes + numToWrite > currSize): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.io.IOException} when: currBytes + numToWrite > currSize
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", 0L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", 34L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        tarArchiveOutputStream.write(null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (currBytes + numToWrite > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.iterates iterate the loop {@code while(numToWrite > 0)} once
 * @utbot.throwsException {@link java.io.IOException} in: writeRecord(wBuf, wOffset);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -250L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -251L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", -128);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 129, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (currBytes + numToWrite > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code (assemLen + numToWrite >= recordBuf.length): True}
 * @utbot.throwsException {@link java.io.IOException} in: writeRecord(recordBuf);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_12() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -250L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -250L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", -2);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (currBytes + numToWrite > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code (assemLen + numToWrite >= recordBuf.length): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -249L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -249L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (currBytes + numToWrite > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.iterates iterate the loop {@code while(numToWrite > 0)} once
 * @utbot.throwsException {@link java.io.IOException} in: writeRecord(wBuf, wOffset);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -237L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -238L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", -199);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 199, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (currBytes + numToWrite > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code (assemLen + numToWrite >= recordBuf.length): True}
 * @utbot.throwsException {@link java.io.IOException} in: writeRecord(recordBuf);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -250L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -250L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (currBytes + numToWrite > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code (assemLen + numToWrite >= recordBuf.length): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_5() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -250L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -250L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        JarOutputStream out2 = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(out2, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (currBytes + numToWrite > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code (assemLen + numToWrite >= recordBuf.length): True}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testWrite_ThrowZipException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -250L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -250L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        JarOutputStream out1 = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        (((ZipEntry) entry)).setSize(0L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.util.zip.ZipOutputStream", "written", 77309476866L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", -8796697006660L);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (currBytes + numToWrite > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.iterates iterate the loop {@code while(numToWrite > 0)} once
 * @utbot.throwsException {@link java.io.IOException} in: writeRecord(wBuf, wOffset);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_6() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -224L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -225L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        (((ZipEntry) entry)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        tarArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (currBytes + numToWrite > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code (assemLen + numToWrite >= recordBuf.length): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_7() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -250L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -250L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (currBytes + numToWrite > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.iterates iterate the loop {@code while(numToWrite > 0)} once
 * @utbot.throwsException {@link java.util.zip.ZipException} in: writeRecord(wBuf, wOffset);
 *  */
    @Test(expected = ZipException.class)
    public void testWrite_ThrowZipException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -253L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -254L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 2);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        (((ZipEntry) entry)).setSize(256L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 230L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -24L);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current1 = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarArchiveEntry entry1 = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry1.setMethod(1);
        setField(current1, "java.util.zip.ZipOutputStream$XEntry", "entry", entry1);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current1);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        tarArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (currBytes + numToWrite > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.iterates iterate the loop {@code while(numToWrite > 0)} once
 * @utbot.throwsException {@link java.io.IOException} in: writeRecord(wBuf, wOffset);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_8() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -255L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -256L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(2L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -1L);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        tarArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (currBytes + numToWrite > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code (assemLen + numToWrite >= recordBuf.length): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_9() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -250L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -250L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (currBytes + numToWrite > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code (assemLen + numToWrite >= recordBuf.length): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_10() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -254L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -254L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        DeflaterOutputStream out2 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out2, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (currBytes + numToWrite > currSize): False}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code (assemLen + numToWrite >= recordBuf.length): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_11() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", 7L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", 7L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        JarOutputStream out1 = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        (((ZipEntry) entry)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        tarArchiveOutputStream.write(byteArray, 0, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code (assemLen + numToWrite >= recordBuf.length): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(wBuf, wOffset, assemBuf, assemLen, numToWrite);
 *  */
    @Test
    public void testWrite_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -251L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -250L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:408) */
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -251L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -252L);
        byte[] recordBuf = {(byte) 0, (byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        byte[] assemBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:424) */
        tarArchiveOutputStream.write(byteArray, -1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code (assemLen + numToWrite >= recordBuf.length): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(assemBuf, 0, recordBuf, 0, assemLen);
 *  */
    @Test
    public void testWrite_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -250L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -249L);
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:397) */
        tarArchiveOutputStream.write(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code (assemLen + numToWrite >= recordBuf.length): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWrite_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -250L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -250L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", recordBuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:401) */
        tarArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code (assemLen + numToWrite >= recordBuf.length): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWrite_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -250L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -250L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:401) */
        tarArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.iterates iterate the loop {@code while(numToWrite > 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeRecord(wBuf, wOffset);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_6() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -250L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -251L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", -255);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:561)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:432) */
        tarArchiveOutputStream.write(null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: assemLen + numToWrite >= recordBuf.length
 *  */
    @Test
    public void testWrite_ThrowNullPointerException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -250L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -123L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:394) */
        tarArchiveOutputStream.write(null, -255, -127);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.iterates iterate the loop {@code while(numToWrite > 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: numToWrite < recordBuf.length
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -250L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -251L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:423) */
        tarArchiveOutputStream.write(null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code (assemLen + numToWrite >= recordBuf.length): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(wBuf, wOffset, assemBuf, assemLen, numToWrite);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -251L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -250L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:408) */
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
    public void testWrite_ThrowNullPointerException_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -250L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -251L);
        byte[] recordBuf = {(byte) 0, (byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:424) */
        tarArchiveOutputStream.write(byteArray, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): False}
 * @utbot.iterates iterate the loop {@code while(numToWrite > 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeRecord(wBuf, wOffset);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -250L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -251L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", -128);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:568)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:432) */
        tarArchiveOutputStream.write(byteArray, 129, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code (assemLen + numToWrite >= recordBuf.length): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeRecord(recordBuf);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_7() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -250L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -250L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:401) */
        tarArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code (assemLen + numToWrite >= recordBuf.length): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(assemBuf, 0, recordBuf, 0, assemLen);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_5() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -250L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -249L);
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:397) */
        tarArchiveOutputStream.write(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (assemLen > 0): True}
 * @utbot.executesCondition {@code (assemLen + numToWrite >= recordBuf.length): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_8() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", -250L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -250L);
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1023);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:401) */
        tarArchiveOutputStream.write(byteArray, 0, 0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method write([B, int, int)
    
    @Test
    public void testWrite1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", 0L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", -9223372036854775807L);
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = new byte[32];
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = new byte[34];
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 10 out of bounds for byte[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:568)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:432) */
        tarArchiveOutputStream.write(byteArray, 3, 8702);
    }
    
    @Test
    public void testWrite2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currSize", 0L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "currBytes", 9223372035781033984L);
        byte[] recordBuf = {(byte) 0, (byte) 0, (byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemLen", 1);
        byte[] assemBuf = new byte[16];
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "assemBuf", assemBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 3);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "haveUnclosedEntry", true);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1022);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2147483649 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(TarArchiveOutputStream.java:399) */
        tarArchiveOutputStream.write(byteArray, Integer.MAX_VALUE, 1073741825);
    }
    ///endregion
    
    ///region Errors report for write
    
    public void testWrite_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 14 occurrences of:
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
    public void testClose_NotClosed_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.DeflaterOutputStream", "closed", true);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.close();
        
        boolean finalTarArchiveOutputStreamClosed = ((Boolean) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closed"));
        OutputStream tarArchiveOutputStreamOut = ((OutputStream) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out"));
        boolean finalTarArchiveOutputStreamOutClosed = ((Boolean) getFieldValue(tarArchiveOutputStreamOut, "java.util.zip.ZipOutputStream", "closed"));
        
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "finished", true);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.close();
        
        boolean finalTarArchiveOutputStreamClosed = ((Boolean) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closed"));
        OutputStream tarArchiveOutputStreamOut = ((OutputStream) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out"));
        boolean finalTarArchiveOutputStreamOutClosed = ((Boolean) getFieldValue(tarArchiveOutputStreamOut, "java.util.zip.ZipOutputStream", "closed"));
        OutputStream tarArchiveOutputStreamOut1 = ((OutputStream) getFieldValue(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out"));
        boolean finalTarArchiveOutputStreamOutClosed1 = ((Boolean) getFieldValue(tarArchiveOutputStreamOut1, "java.util.zip.DeflaterOutputStream", "closed"));
        
        assertTrue(finalTarArchiveOutputStreamClosed);
        
        assertTrue(finalTarArchiveOutputStreamOutClosed);
        
        assertTrue(finalTarArchiveOutputStreamOutClosed1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testClose_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:515)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:224)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:238) */
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
    @Test
    public void testClose_ThrowNullPointerException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:242) */
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
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:515)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:224)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:238) */
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testClose_ThrowNullPointerException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1023);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:515)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:224)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:238) */
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", -255);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: out.close();
 *  */
    @Test(expected = ZipException.class)
    public void testClose_ThrowZipException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setSize(3L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -2L);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finish", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): True}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testClose_ThrowZipException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setSize(0L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", -2L);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: out.close();
 *  */
    @Test(expected = ZipException.class)
    public void testClose_ThrowZipException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setCrc(1L);
        entry.setSize(3L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(out, "java.util.zip.ZipOutputStream", "crc", crc);
        setField(out, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -3L);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): True}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testClose_ThrowZipException_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
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
        setField(out1, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", 6L);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: out.close();
 *  */
    @Test(expected = NoSuchElementException.class)
    public void testClose_ThrowNoSuchElementException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Vector xentries = ((Vector) createInstance("java.util.Vector"));
        setField(xentries, "java.util.Vector", "elementCount", -2147483647);
        setField(out, "java.util.zip.ZipOutputStream", "xentries", xentries);
        setField(out, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: out.close();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testClose_ThrowIndexOutOfBoundsException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Vector xentries = ((Vector) createInstance("java.util.Vector"));
        java.lang.Object[] elementData = {};
        setField(xentries, "java.util.Vector", "elementData", elementData);
        setField(xentries, "java.util.Vector", "elementCount", 1);
        setField(out, "java.util.zip.ZipOutputStream", "xentries", xentries);
        setField(out, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: out.close();
 *  */
    @Test(expected = ClassCastException.class)
    public void testClose_ThrowClassCastException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Vector xentries = ((Vector) createInstance("java.util.Vector"));
        java.lang.Object[] elementData = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        elementData[0] = object;
        setField(xentries, "java.util.Vector", "elementData", elementData);
        setField(xentries, "java.util.Vector", "elementCount", 1);
        setField(out, "java.util.zip.ZipOutputStream", "xentries", xentries);
        setField(out, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testClose_ThrowIndexOutOfBoundsException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
    public void testClose_ThrowNullPointerException_3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "finished", true);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        Object cleanable = createInstance("java.io.FileCleanable");
        Object next = createInstance("java.io.FileCleanable");
        setField(cleanable, "jdk.internal.ref.PhantomCleanable", "next", next);
        setField(zsRef, "java.util.zip.Deflater$DeflaterZStreamRef", "cleanable", cleanable);
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.util.zip.DeflaterOutputStream", "usesDefaultDeflater", true);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
    public void testClose_ThrowNullPointerException_4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finished", true);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        Object cleanable = createInstance("java.io.FileCleanable");
        setField(zsRef, "java.util.zip.Deflater$DeflaterZStreamRef", "cleanable", cleanable);
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.util.zip.DeflaterOutputStream", "usesDefaultDeflater", true);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.close();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method close()
    
    @Test
    public void testClose1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", recordBuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1073741824);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:515)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:224)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:238) */
        tarArchiveOutputStream.close();
    }
    
    @Test
    public void testClose2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -2147482624);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2147482624 out of bounds for byte[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:515)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:224)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:238) */
        tarArchiveOutputStream.close();
    }
    
    @Test
    public void testClose3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.padAsNeeded(TarArchiveOutputStream.java:573)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:226)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:238) */
        tarArchiveOutputStream.close();
    }
    
    @Test
    public void testClose4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:515)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:224)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:238) */
        tarArchiveOutputStream.close();
    }
    
    @Test
    public void testClose5() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedOutputStream.write(BufferedOutputStream.java:118)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:515)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:224)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close(TarArchiveOutputStream.java:238) */
        tarArchiveOutputStream.close();
    }
    ///endregion
    
    ///region Errors report for close
    
    public void testClose_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 16 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
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
    public void testFinish_ThrowIOException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", -255);
        
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
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
        byte[] recordBuf = {(byte) -127, (byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 2);
        CheckedOutputStream out = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        JarOutputStream out1 = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.finish();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (haveUnclosedEntry): False}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testFinish_ThrowZipException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.finish();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (haveUnclosedEntry): False}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testFinish_ThrowZipException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.util.zip.ZipOutputStream", "written", -68719476744L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", -68719476738L);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.finish();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (haveUnclosedEntry): False}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testFinish_ThrowZipException_2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out2 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
    public void testFinish_ThrowIOException_9() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setSize(1910725545118148106L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.util.zip.ZipOutputStream", "written", -9222172733741718486L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", 7313845794849685025L);
        ZipOutputStream out2 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out2, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
    public void testFinish_ThrowIOException_10() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
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
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
    public void testFinish_ThrowIOException_11() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
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
    public void testFinish_ThrowIOException_12() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        tarArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method finish()
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testFinish_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", recordBuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:515)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:224) */
        tarArchiveOutputStream.finish();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testFinish_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) -127};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:515)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:224) */
        tarArchiveOutputStream.finish();
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#finish()}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#writeEOFRecord()
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveOutputStream#padAsNeeded()
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: padAsNeeded();
 *  */
    @Test
    public void testFinish_ThrowArithmeticException() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish] produces [java.lang.ArithmeticException: / by zero] */
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:515)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:224) */
        tarArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method finish()
    
    @Test
    public void testFinish1() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.padAsNeeded(TarArchiveOutputStream.java:573)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:226) */
        tarArchiveOutputStream.finish();
    }
    
    @Test
    public void testFinish2() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 1);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -2147482624);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2147482624 out of bounds for byte[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:515)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:224) */
        tarArchiveOutputStream.finish();
    }
    
    @Test
    public void testFinish3() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) 0, (byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 2);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:515)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:224) */
        tarArchiveOutputStream.finish();
    }
    
    @Test
    public void testFinish4() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 5);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1861)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:515)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:224) */
        tarArchiveOutputStream.finish();
    }
    
    @Test
    public void testFinish5() throws Exception  {
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] recordBuf = {(byte) 0, (byte) 0};
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordBuf", recordBuf);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "recordSize", 2);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1073741824);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(tarArchiveOutputStream, "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(TarArchiveOutputStream.java:546)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord(TarArchiveOutputStream.java:515)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish(TarArchiveOutputStream.java:224) */
        tarArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region Errors report for finish
    
    public void testFinish_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 17 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 6 occurrences of:
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getBytesWritten(TarArchiveOutputStream.java:203) */
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
        
                java.lang.reflect.Method methodForGetDeclaredFields974025910769600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields974025910769600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass974025910773900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields974025910769600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass974025910773900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields974025911063100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields974025911063100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass974025911064800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields974025911063100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass974025911064800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


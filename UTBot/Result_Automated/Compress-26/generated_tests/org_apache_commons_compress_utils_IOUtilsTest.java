package org.apache.commons.compress.utils;

import org.junit.Test;
import java.util.jar.JarInputStream;
import java.lang.reflect.Method;
import java.util.jar.JarOutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.ZipOutputStream;
import java.util.Vector;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.util.zip.Deflater;
import java.util.zip.CRC32;
import java.util.Stack;
import java.util.NoSuchElementException;
import java.util.zip.Inflater;
import jdk.internal.ref.CleanerImpl.PhantomCleanableRef;
import jdk.internal.ref.CleanerImpl;
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.zip.ZipInputStream;
import java.util.jar.JarEntry;
import java.security.CodeSigner;
import sun.security.util.ManifestEntryVerifier;
import sun.security.provider.Sun;
import java.util.LinkedHashMap;
import java.io.IOException;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;
import java.util.zip.ZipEntry;
import sun.net.www.http.PosterOutputStream;
import java.io.ByteArrayOutputStream;
import java.util.Properties;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_compress_utils_IOUtilsTest {
    ///region Test suites for executable org.apache.commons.compress.utils.IOUtils.closeQuietly
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method closeQuietly(java.io.Closeable)
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#closeQuietly(java.io.Closeable)}
 * @utbot.executesCondition {@code (c != null): True}
 *  */
    @Test
    public void testCloseQuietly_CNotEqualsNull() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "closed", true);
        
        Class iOUtilsClazz = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class jarInputStreamType = Class.forName("java.io.Closeable");
        Method closeQuietlyMethod = iOUtilsClazz.getDeclaredMethod("closeQuietly", jarInputStreamType);
        closeQuietlyMethod.setAccessible(true);
        java.lang.Object[] closeQuietlyMethodArguments = new java.lang.Object[1];
        closeQuietlyMethodArguments[0] = jarInputStream;
        closeQuietlyMethod.invoke(null, closeQuietlyMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#closeQuietly(java.io.Closeable)}
 * @utbot.executesCondition {@code (c != null): True}
 *  */
    @Test
    public void testCloseQuietly_CNotEqualsNull_1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "closed", true);
        
        Class iOUtilsClazz = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class jarInputStreamType = Class.forName("java.io.Closeable");
        Method closeQuietlyMethod = iOUtilsClazz.getDeclaredMethod("closeQuietly", jarInputStreamType);
        closeQuietlyMethod.setAccessible(true);
        java.lang.Object[] closeQuietlyMethodArguments = new java.lang.Object[1];
        closeQuietlyMethodArguments[0] = jarInputStream;
        closeQuietlyMethod.invoke(null, closeQuietlyMethodArguments);
        
        boolean finalJarInputStreamClosed = ((Boolean) getFieldValue(jarInputStream, "java.util.zip.ZipInputStream", "closed"));
        
        assertTrue(finalJarInputStreamClosed);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#closeQuietly(java.io.Closeable)}
 * @utbot.executesCondition {@code (c != null): True}
 *  */
    @Test
    public void testCloseQuietly_CNotEqualsNull_2() throws Exception  {
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "closed", true);
        
        Class iOUtilsClazz = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class jarOutputStreamType = Class.forName("java.io.Closeable");
        Method closeQuietlyMethod = iOUtilsClazz.getDeclaredMethod("closeQuietly", jarOutputStreamType);
        closeQuietlyMethod.setAccessible(true);
        java.lang.Object[] closeQuietlyMethodArguments = new java.lang.Object[1];
        closeQuietlyMethodArguments[0] = jarOutputStream;
        closeQuietlyMethod.invoke(null, closeQuietlyMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#closeQuietly(java.io.Closeable)}
 * @utbot.executesCondition {@code (c != null): True}
 *  */
    @Test
    public void testCloseQuietly_CNotEqualsNull_3() throws Exception  {
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(jarOutputStream, "java.util.zip.DeflaterOutputStream", "closed", true);
        
        Class iOUtilsClazz = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class jarOutputStreamType = Class.forName("java.io.Closeable");
        Method closeQuietlyMethod = iOUtilsClazz.getDeclaredMethod("closeQuietly", jarOutputStreamType);
        closeQuietlyMethod.setAccessible(true);
        java.lang.Object[] closeQuietlyMethodArguments = new java.lang.Object[1];
        closeQuietlyMethodArguments[0] = jarOutputStream;
        closeQuietlyMethod.invoke(null, closeQuietlyMethodArguments);
        
        boolean finalJarOutputStreamClosed = ((Boolean) getFieldValue(jarOutputStream, "java.util.zip.ZipOutputStream", "closed"));
        
        assertTrue(finalJarOutputStreamClosed);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#closeQuietly(java.io.Closeable)}
 * @utbot.executesCondition {@code (c != null): False}
 *  */
    @Test
    public void testCloseQuietly_CEqualsNull() {
        IOUtils.closeQuietly(null);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#closeQuietly(java.io.Closeable)}
 * @utbot.executesCondition {@code (c != null): True}
 *  */
    @Test
    public void testCloseQuietly_CNotEqualsNull_4() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        
        Class iOUtilsClazz = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class jarInputStreamType = Class.forName("java.io.Closeable");
        Method closeQuietlyMethod = iOUtilsClazz.getDeclaredMethod("closeQuietly", jarInputStreamType);
        closeQuietlyMethod.setAccessible(true);
        java.lang.Object[] closeQuietlyMethodArguments = new java.lang.Object[1];
        closeQuietlyMethodArguments[0] = jarInputStream;
        closeQuietlyMethod.invoke(null, closeQuietlyMethodArguments);
        
        boolean finalJarInputStreamClosed = ((Boolean) getFieldValue(jarInputStream, "java.util.zip.ZipInputStream", "closed"));
        boolean finalJarInputStreamClosed1 = ((Boolean) getFieldValue(jarInputStream, "java.util.zip.InflaterInputStream", "closed"));
        
        assertTrue(finalJarInputStreamClosed);
        
        assertTrue(finalJarInputStreamClosed1);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#closeQuietly(java.io.Closeable)}
 * @utbot.executesCondition {@code (c != null): True}
 *  */
    @Test
    public void testCloseQuietly_CNotEqualsNull_5() throws Exception  {
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "finished", true);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        setField(out, "java.util.zip.DeflaterOutputStream", "closed", true);
        setField(jarOutputStream, "java.io.FilterOutputStream", "out", out);
        
        Class iOUtilsClazz = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class jarOutputStreamType = Class.forName("java.io.Closeable");
        Method closeQuietlyMethod = iOUtilsClazz.getDeclaredMethod("closeQuietly", jarOutputStreamType);
        closeQuietlyMethod.setAccessible(true);
        java.lang.Object[] closeQuietlyMethodArguments = new java.lang.Object[1];
        closeQuietlyMethodArguments[0] = jarOutputStream;
        closeQuietlyMethod.invoke(null, closeQuietlyMethodArguments);
        
        boolean finalJarOutputStreamClosed = ((Boolean) getFieldValue(jarOutputStream, "java.util.zip.ZipOutputStream", "closed"));
        boolean finalJarOutputStreamClosed1 = ((Boolean) getFieldValue(jarOutputStream, "java.util.zip.DeflaterOutputStream", "closed"));
        
        assertTrue(finalJarOutputStreamClosed);
        
        assertTrue(finalJarOutputStreamClosed1);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#closeQuietly(java.io.Closeable)}
 * @utbot.executesCondition {@code (c != null): True}
 *  */
    @Test
    public void testCloseQuietly_CNotEqualsNull_6() throws Exception  {
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "finished", true);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(jarOutputStream, "java.io.FilterOutputStream", "out", out);
        
        Class iOUtilsClazz = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class jarOutputStreamType = Class.forName("java.io.Closeable");
        Method closeQuietlyMethod = iOUtilsClazz.getDeclaredMethod("closeQuietly", jarOutputStreamType);
        closeQuietlyMethod.setAccessible(true);
        java.lang.Object[] closeQuietlyMethodArguments = new java.lang.Object[1];
        closeQuietlyMethodArguments[0] = jarOutputStream;
        closeQuietlyMethod.invoke(null, closeQuietlyMethodArguments);
        
        boolean finalJarOutputStreamClosed = ((Boolean) getFieldValue(jarOutputStream, "java.util.zip.ZipOutputStream", "closed"));
        boolean finalJarOutputStreamClosed1 = ((Boolean) getFieldValue(jarOutputStream, "java.util.zip.DeflaterOutputStream", "closed"));
        
        assertTrue(finalJarOutputStreamClosed);
        
        assertTrue(finalJarOutputStreamClosed1);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#closeQuietly(java.io.Closeable)}
 * @utbot.executesCondition {@code (c != null): True}
 *  */
    @Test
    public void testCloseQuietly_CNotEqualsNull_7() throws Exception  {
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Vector xentries = ((Vector) createInstance("java.util.Vector"));
        java.lang.Object[] elementData = new java.lang.Object[1];
        Object xEntry = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry.setMethod(1);
        setField(xEntry, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        elementData[0] = xEntry;
        setField(xentries, "java.util.Vector", "elementData", elementData);
        setField(xentries, "java.util.Vector", "elementCount", 1);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "xentries", xentries);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "written", 0L);
        
        Class iOUtilsClazz = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class jarOutputStreamType = Class.forName("java.io.Closeable");
        Method closeQuietlyMethod = iOUtilsClazz.getDeclaredMethod("closeQuietly", jarOutputStreamType);
        closeQuietlyMethod.setAccessible(true);
        java.lang.Object[] closeQuietlyMethodArguments = new java.lang.Object[1];
        closeQuietlyMethodArguments[0] = jarOutputStream;
        closeQuietlyMethod.invoke(null, closeQuietlyMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#closeQuietly(java.io.Closeable)}
 * @utbot.executesCondition {@code (c != null): True}
 *  */
    @Test
    public void testCloseQuietly_CNotEqualsNull_8() throws Exception  {
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry.setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finish", true);
        setField(jarOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        
        Class iOUtilsClazz = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class jarOutputStreamType = Class.forName("java.io.Closeable");
        Method closeQuietlyMethod = iOUtilsClazz.getDeclaredMethod("closeQuietly", jarOutputStreamType);
        closeQuietlyMethod.setAccessible(true);
        java.lang.Object[] closeQuietlyMethodArguments = new java.lang.Object[1];
        closeQuietlyMethodArguments[0] = jarOutputStream;
        closeQuietlyMethod.invoke(null, closeQuietlyMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#closeQuietly(java.io.Closeable)}
 * @utbot.executesCondition {@code (c != null): True}
 *  */
    @Test
    public void testCloseQuietly_CNotEqualsNull_9() throws Exception  {
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry.setCrc(1L);
        entry.setSize(1307310548966197251L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "crc", crc);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "written", -7916061487888578560L);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "locoff", 9223372036854775805L);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finish", true);
        setField(zipOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        
        Class iOUtilsClazz = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class zipOutputStreamType = Class.forName("java.io.Closeable");
        Method closeQuietlyMethod = iOUtilsClazz.getDeclaredMethod("closeQuietly", zipOutputStreamType);
        closeQuietlyMethod.setAccessible(true);
        java.lang.Object[] closeQuietlyMethodArguments = new java.lang.Object[1];
        closeQuietlyMethodArguments[0] = zipOutputStream;
        closeQuietlyMethod.invoke(null, closeQuietlyMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method closeQuietly(java.io.Closeable)
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#closeQuietly(java.io.Closeable)}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: c.close();
 *  */
    @Test(expected = NoSuchElementException.class)
    public void testCloseQuietly_ThrowNoSuchElementException() throws Throwable  {
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Stack xentries = ((Stack) createInstance("java.util.Stack"));
        setField(xentries, "java.util.Vector", "elementCount", -2147483647);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "xentries", xentries);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "written", 0L);
        
        Class iOUtilsClazz = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class jarOutputStreamType = Class.forName("java.io.Closeable");
        Method closeQuietlyMethod = iOUtilsClazz.getDeclaredMethod("closeQuietly", jarOutputStreamType);
        closeQuietlyMethod.setAccessible(true);
        java.lang.Object[] closeQuietlyMethodArguments = new java.lang.Object[1];
        closeQuietlyMethodArguments[0] = jarOutputStream;
        try {
            closeQuietlyMethod.invoke(null, closeQuietlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#closeQuietly(java.io.Closeable)}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: c.close();
 *  */
    @Test(expected = NoSuchElementException.class)
    public void testCloseQuietly_ThrowNoSuchElementException_1() throws Throwable  {
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry.setCrc(0L);
        entry.setSize(1307310548966197251L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        Stack xentries = ((Stack) createInstance("java.util.Stack"));
        setField(xentries, "java.util.Vector", "elementCount", -2147483647);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "xentries", xentries);
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "crc", crc);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "written", -7916061487888578560L);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "locoff", 9223372036854775805L);
        
        Class iOUtilsClazz = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class zipOutputStreamType = Class.forName("java.io.Closeable");
        Method closeQuietlyMethod = iOUtilsClazz.getDeclaredMethod("closeQuietly", zipOutputStreamType);
        closeQuietlyMethod.setAccessible(true);
        java.lang.Object[] closeQuietlyMethodArguments = new java.lang.Object[1];
        closeQuietlyMethodArguments[0] = zipOutputStream;
        try {
            closeQuietlyMethod.invoke(null, closeQuietlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#closeQuietly(java.io.Closeable)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: c.close();
 *  */
    @Test(expected = ClassCastException.class)
    public void testCloseQuietly_ThrowClassCastException() throws Throwable  {
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Stack xentries = ((Stack) createInstance("java.util.Stack"));
        java.lang.Object[] elementData = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        elementData[0] = object;
        setField(xentries, "java.util.Vector", "elementData", elementData);
        setField(xentries, "java.util.Vector", "elementCount", 1);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "xentries", xentries);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "written", 0L);
        
        Class iOUtilsClazz = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class jarOutputStreamType = Class.forName("java.io.Closeable");
        Method closeQuietlyMethod = iOUtilsClazz.getDeclaredMethod("closeQuietly", jarOutputStreamType);
        closeQuietlyMethod.setAccessible(true);
        java.lang.Object[] closeQuietlyMethodArguments = new java.lang.Object[1];
        closeQuietlyMethodArguments[0] = jarOutputStream;
        try {
            closeQuietlyMethod.invoke(null, closeQuietlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#closeQuietly(java.io.Closeable)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: c.close();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testCloseQuietly_ThrowIndexOutOfBoundsException() throws Throwable  {
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Stack xentries = ((Stack) createInstance("java.util.Stack"));
        java.lang.Object[] elementData = {};
        setField(xentries, "java.util.Vector", "elementData", elementData);
        setField(xentries, "java.util.Vector", "elementCount", 1);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "xentries", xentries);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "written", 0L);
        
        Class iOUtilsClazz = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class zipOutputStreamType = Class.forName("java.io.Closeable");
        Method closeQuietlyMethod = iOUtilsClazz.getDeclaredMethod("closeQuietly", zipOutputStreamType);
        closeQuietlyMethod.setAccessible(true);
        java.lang.Object[] closeQuietlyMethodArguments = new java.lang.Object[1];
        closeQuietlyMethodArguments[0] = zipOutputStream;
        try {
            closeQuietlyMethod.invoke(null, closeQuietlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#closeQuietly(java.io.Closeable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: c.close();
 *  */
    @Test(expected = NullPointerException.class)
    public void testCloseQuietly_ThrowNullPointerException() throws Throwable  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        CleanerImpl.PhantomCleanableRef cleanable = ((CleanerImpl.PhantomCleanableRef) createInstance("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        setField(zsRef, "java.util.zip.Inflater$InflaterZStreamRef", "cleanable", cleanable);
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "inf", inf);
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "usesDefaultInflater", true);
        
        Class iOUtilsClazz = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class jarInputStreamType = Class.forName("java.io.Closeable");
        Method closeQuietlyMethod = iOUtilsClazz.getDeclaredMethod("closeQuietly", jarInputStreamType);
        closeQuietlyMethod.setAccessible(true);
        java.lang.Object[] closeQuietlyMethodArguments = new java.lang.Object[1];
        closeQuietlyMethodArguments[0] = jarInputStream;
        try {
            closeQuietlyMethod.invoke(null, closeQuietlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#closeQuietly(java.io.Closeable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: c.close();
 *  */
    @Test(expected = NullPointerException.class)
    public void testCloseQuietly_ThrowNullPointerException_1() throws Throwable  {
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "finished", true);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        CleanerImpl.PhantomCleanableRef cleanable = ((CleanerImpl.PhantomCleanableRef) createInstance("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object next = createInstance("java.net.SocketCleanable");
        setField(cleanable, "jdk.internal.ref.PhantomCleanable", "next", next);
        setField(zsRef, "java.util.zip.Deflater$DeflaterZStreamRef", "cleanable", cleanable);
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(jarOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(jarOutputStream, "java.util.zip.DeflaterOutputStream", "usesDefaultDeflater", true);
        
        Class iOUtilsClazz = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class jarOutputStreamType = Class.forName("java.io.Closeable");
        Method closeQuietlyMethod = iOUtilsClazz.getDeclaredMethod("closeQuietly", jarOutputStreamType);
        closeQuietlyMethod.setAccessible(true);
        java.lang.Object[] closeQuietlyMethodArguments = new java.lang.Object[1];
        closeQuietlyMethodArguments[0] = jarOutputStream;
        try {
            closeQuietlyMethod.invoke(null, closeQuietlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#closeQuietly(java.io.Closeable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: c.close();
 *  */
    @Test(expected = NullPointerException.class)
    public void testCloseQuietly_ThrowNullPointerException_2() throws Throwable  {
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry.setSize(1307310548966197251L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "written", -7916061487888578560L);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "locoff", 9223372036854775806L);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        CleanerImpl.PhantomCleanableRef cleanable = ((CleanerImpl.PhantomCleanableRef) createInstance("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object next = createInstance("java.net.SocketCleanable");
        setField(cleanable, "jdk.internal.ref.PhantomCleanable", "next", next);
        setField(zsRef, "java.util.zip.Deflater$DeflaterZStreamRef", "cleanable", cleanable);
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finish", true);
        setField(zipOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(zipOutputStream, "java.util.zip.DeflaterOutputStream", "usesDefaultDeflater", true);
        
        Class iOUtilsClazz = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class zipOutputStreamType = Class.forName("java.io.Closeable");
        Method closeQuietlyMethod = iOUtilsClazz.getDeclaredMethod("closeQuietly", zipOutputStreamType);
        closeQuietlyMethod.setAccessible(true);
        java.lang.Object[] closeQuietlyMethodArguments = new java.lang.Object[1];
        closeQuietlyMethodArguments[0] = zipOutputStream;
        try {
            closeQuietlyMethod.invoke(null, closeQuietlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method closeQuietly(java.io.Closeable)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.utils.IOUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#closeQuietly(java.io.Closeable)}
     */
    @Test
    public void testCloseQuietly() {
        BoundedInputStream boundedInputStream = new BoundedInputStream(null, -9223372036720558080L);
        Scanner scanner = new Scanner(boundedInputStream);
        
        IOUtils.closeQuietly(scanner);
    }
    ///endregion
    
    ///region Errors report for closeQuietly
    
    public void testCloseQuietly_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 25 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field private static final java.util.concurrent.atomic.AtomicInteger sun.net.ResourceManager.numSockets accessible:
        module java.base does not "opens sun.net" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.utils.IOUtils.copy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copy(java.io.InputStream, java.io.OutputStream, int)
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#copy(java.io.InputStream,java.io.OutputStream,int)}
 * @utbot.iterates iterate the loop {@code while(-1 != (n = input.read(buffer)))} twice
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testCopy_OutputStreamWrite() throws Exception  {
        FileInputStream anonymousFileInputStream = ((FileInputStream) createInstance("org.apache.commons.compress.compressors.pack200.TempFileCachingStreamBridge$1"));
        DeflaterOutputStream deflaterOutputStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(deflaterOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        
        long actual = IOUtils.copy(anonymousFileInputStream, deflaterOutputStream, 0);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#copy(java.io.InputStream,java.io.OutputStream,int)}
 * @utbot.iterates iterate the loop {@code while(-1 != (n = input.read(buffer)))} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testCopy_IterateWhileLoop() throws Exception  {
        ZipInputStream zipInputStream = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        
        long actual = IOUtils.copy(zipInputStream, null, 1);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#copy(java.io.InputStream,java.io.OutputStream,int)}
 * @utbot.iterates iterate the loop {@code while(-1 != (n = input.read(buffer)))} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testCopy_IterateWhileLoop_1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        
        long actual = IOUtils.copy(jarInputStream, null, 1);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#copy(java.io.InputStream,java.io.OutputStream,int)}
 * @utbot.iterates iterate the loop {@code while(-1 != (n = input.read(buffer)))} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testCopy_IterateWhileLoop_2() throws Exception  {
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
        
        long actual = IOUtils.copy(jarInputStream, null, 1);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#copy(java.io.InputStream,java.io.OutputStream,int)}
 * @utbot.iterates iterate the loop {@code while(-1 != (n = input.read(buffer)))} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testCopy_IterateWhileLoop_3() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Sun verifiedSigners = ((Sun) createInstance("sun.security.provider.Sun"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        
        long actual = IOUtils.copy(jarInputStream, null, 1);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copy(java.io.InputStream, java.io.OutputStream, int)
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#copy(java.io.InputStream,java.io.OutputStream,int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final byte[] buffer = new byte[buffersize];
 *  */
    @Test
    public void testCopy_ThrowNegativeArraySizeException() throws IOException  {
        /* This test fails because method [org.apache.commons.compress.utils.IOUtils.copy] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.compress.utils.IOUtils.copy(IOUtils.java:68) */
        IOUtils.copy(null, null, -256);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#copy(java.io.InputStream,java.io.OutputStream,int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} 
 *  */
    @Test
    public void testCopy_ThrowArithmeticException() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Sun verifiedSigners = ((Sun) createInstance("sun.security.provider.Sun"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        Hashtable sigFileSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(sigFileSigners, "java.util.Hashtable", "table", table);
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
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
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        
        /* This test fails because method [org.apache.commons.compress.utils.IOUtils.copy] produces [java.lang.ArithmeticException: / by zero] */
        IOUtils.copy(jarInputStream, null, 1);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#copy(java.io.InputStream,java.io.OutputStream,int)}
 * @utbot.iterates iterate the loop {@code while(-1 != (n = input.read(buffer)))} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: output.write(buffer, 0, n);
 *  */
    @Test
    public void testCopy_ThrowNullPointerException_1() throws Exception  {
        InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.utils.IOUtils.copy] produces [java.lang.NullPointerException] */
        IOUtils.copy(inflaterInputStream, null, 0);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#copy(java.io.InputStream,java.io.OutputStream,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(-1 != (n = input.read(buffer)))
 *  */
    @Test
    public void testCopy_ThrowNullPointerException() throws IOException  {
        /* This test fails because method [org.apache.commons.compress.utils.IOUtils.copy] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.IOUtils.copy(IOUtils.java:71) */
        IOUtils.copy(null, null, 1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method copy(java.io.InputStream, java.io.OutputStream, int)
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#copy(java.io.InputStream,java.io.OutputStream,int)}
 * @utbot.iterates iterate the loop {@code while(-1 != (n = input.read(buffer)))} once
 * @utbot.returnsFrom {@code return count;}
 * @utbot.throwsException {@link java.io.IOException} in: return count;
 *  */
    @Test(expected = IOException.class)
    public void testCopy_ThrowIOException() throws Throwable  {
        Object pipeInputStream = createInstance("java.lang.Process$PipeInputStream");
        
        Class iOUtilsClazz = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class pipeInputStreamType = Class.forName("java.io.InputStream");
        Class outputStreamType = Class.forName("java.io.OutputStream");
        Class intType = int.class;
        Method copyMethod = iOUtilsClazz.getDeclaredMethod("copy", pipeInputStreamType, outputStreamType, intType);
        copyMethod.setAccessible(true);
        java.lang.Object[] copyMethodArguments = new java.lang.Object[3];
        copyMethodArguments[0] = pipeInputStream;
        copyMethodArguments[1] = ((Object) null);
        copyMethodArguments[2] = 1;
        try {
            copyMethod.invoke(null, copyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#copy(java.io.InputStream,java.io.OutputStream,int)}
 * @utbot.throwsException {@link java.io.IOException} in: while(-1 != (n = input.read(buffer)))
 *  */
    @Test(expected = IOException.class)
    public void testCopy_ThrowIOException_1() throws Exception  {
        InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(inflaterInputStream, "java.util.zip.InflaterInputStream", "closed", true);
        
        IOUtils.copy(inflaterInputStream, null, 1);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#copy(java.io.InputStream,java.io.OutputStream,int)}
 * @utbot.iterates iterate the loop {@code while(-1 != (n = input.read(buffer)))} once
 * @utbot.throwsException {@link java.util.zip.ZipException} in: output.write(buffer, 0, n);
 *  */
    @Test(expected = ZipException.class)
    public void testCopy_ThrowZipException() throws Exception  {
        FileInputStream anonymousFileInputStream = ((FileInputStream) createInstance("org.apache.commons.compress.compressors.pack200.TempFileCachingStreamBridge$1"));
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        
        IOUtils.copy(anonymousFileInputStream, jarOutputStream, 1);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#copy(java.io.InputStream,java.io.OutputStream,int)}
 * @utbot.iterates iterate the loop {@code while(-1 != (n = input.read(buffer)))} once
 * @utbot.throwsException {@link java.io.IOException} in: output.write(buffer, 0, n);
 *  */
    @Test(expected = IOException.class)
    public void testCopy_ThrowIOException_2() throws Throwable  {
        Object pipeInputStream = createInstance("java.lang.Process$PipeInputStream");
        DeflaterOutputStream deflaterOutputStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(deflaterOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        
        Class iOUtilsClazz = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class pipeInputStreamType = Class.forName("java.io.InputStream");
        Class deflaterOutputStreamType = Class.forName("java.io.OutputStream");
        Class intType = int.class;
        Method copyMethod = iOUtilsClazz.getDeclaredMethod("copy", pipeInputStreamType, deflaterOutputStreamType, intType);
        copyMethod.setAccessible(true);
        java.lang.Object[] copyMethodArguments = new java.lang.Object[3];
        copyMethodArguments[0] = pipeInputStream;
        copyMethodArguments[1] = deflaterOutputStream;
        copyMethodArguments[2] = 1;
        try {
            copyMethod.invoke(null, copyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#copy(java.io.InputStream,java.io.OutputStream,int)}
 * @utbot.iterates iterate the loop {@code while(-1 != (n = input.read(buffer)))} once
 * @utbot.throwsException {@link java.io.IOException} in: output.write(buffer, 0, n);
 *  */
    @Test(expected = IOException.class)
    public void testCopy_ThrowIOException_3() throws Exception  {
        FileInputStream anonymousFileInputStream = ((FileInputStream) createInstance("org.apache.commons.compress.compressors.pack200.TempFileCachingStreamBridge$1"));
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry.setSize(2L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "locoff", -1L);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(jarOutputStream, "java.io.FilterOutputStream", "out", out);
        
        IOUtils.copy(anonymousFileInputStream, jarOutputStream, 1);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#copy(java.io.InputStream,java.io.OutputStream,int)}
 * @utbot.throwsException {@link java.io.IOException} in: while(-1 != (n = input.read(buffer)))
 *  */
    @Test(expected = IOException.class)
    public void testCopy_ThrowIOException_4() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "closed", true);
        
        IOUtils.copy(jarInputStream, null, 1);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#copy(java.io.InputStream,java.io.OutputStream,int)}
 * @utbot.iterates iterate the loop {@code while(-1 != (n = input.read(buffer)))} once
 * @utbot.throwsException {@link java.io.IOException} in: output.write(buffer, 0, n);
 *  */
    @Test(expected = IOException.class)
    public void testCopy_ThrowIOException_5() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "closed", true);
        
        IOUtils.copy(jarInputStream, jarOutputStream, 0);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#copy(java.io.InputStream,java.io.OutputStream,int)}
 * @utbot.iterates iterate the loop {@code while(-1 != (n = input.read(buffer)))} once
 * @utbot.throwsException {@link java.io.IOException} in: output.write(buffer, 0, n);
 *  */
    @Test(expected = IOException.class)
    public void testCopy_ThrowIOException_6() throws Exception  {
        FileInputStream anonymousFileInputStream = ((FileInputStream) createInstance("org.apache.commons.compress.compressors.pack200.TempFileCachingStreamBridge$1"));
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(jarOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        
        IOUtils.copy(anonymousFileInputStream, jarOutputStream, 2);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#copy(java.io.InputStream,java.io.OutputStream,int)}
 * @utbot.throwsException {@link java.io.IOException} in: while(-1 != (n = input.read(buffer)))
 *  */
    @Test(expected = IOException.class)
    public void testCopy_ThrowIOException_7() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        
        IOUtils.copy(jarInputStream, null, 2);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#copy(java.io.InputStream,java.io.OutputStream,int)}
 * @utbot.iterates iterate the loop {@code while(-1 != (n = input.read(buffer)))} once
 * @utbot.throwsException {@link java.io.IOException} in: output.write(buffer, 0, n);
 *  */
    @Test(expected = IOException.class)
    public void testCopy_ThrowIOException_8() throws Throwable  {
        Object pipeInputStream = createInstance("java.lang.Process$PipeInputStream");
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry.setSize(2L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "locoff", -1L);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(jarOutputStream, "java.io.FilterOutputStream", "out", out);
        
        Class iOUtilsClazz = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class pipeInputStreamType = Class.forName("java.io.InputStream");
        Class jarOutputStreamType = Class.forName("java.io.OutputStream");
        Class intType = int.class;
        Method copyMethod = iOUtilsClazz.getDeclaredMethod("copy", pipeInputStreamType, jarOutputStreamType, intType);
        copyMethod.setAccessible(true);
        java.lang.Object[] copyMethodArguments = new java.lang.Object[3];
        copyMethodArguments[0] = pipeInputStream;
        copyMethodArguments[1] = jarOutputStream;
        copyMethodArguments[2] = 1;
        try {
            copyMethod.invoke(null, copyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#copy(java.io.InputStream,java.io.OutputStream,int)}
 * @utbot.iterates iterate the loop {@code while(-1 != (n = input.read(buffer)))} once
 * @utbot.throwsException {@link java.io.IOException} in: output.write(buffer, 0, n);
 *  */
    @Test(expected = IOException.class)
    public void testCopy_ThrowIOException_9() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        PosterOutputStream baos = ((PosterOutputStream) createInstance("sun.net.www.http.PosterOutputStream"));
        setField(baos, "sun.net.www.http.PosterOutputStream", "closed", true);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "closed", true);
        
        IOUtils.copy(jarInputStream, jarOutputStream, 0);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#copy(java.io.InputStream,java.io.OutputStream,int)}
 * @utbot.iterates iterate the loop {@code while(-1 != (n = input.read(buffer)))} once
 * @utbot.throwsException {@link java.io.IOException} in: output.write(buffer, 0, n);
 *  */
    @Test(expected = IOException.class)
    public void testCopy_ThrowIOException_10() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "closed", true);
        
        IOUtils.copy(jarInputStream, jarOutputStream, 0);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#copy(java.io.InputStream,java.io.OutputStream,int)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: while(-1 != (n = input.read(buffer)))
 *  */
    @Test(expected = ZipException.class)
    public void testCopy_ThrowZipException_1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        
        IOUtils.copy(jarInputStream, null, 2);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method copy(java.io.InputStream, java.io.OutputStream, int)
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#copy(java.io.InputStream,java.io.OutputStream,int)}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} 
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testCopy_ThrowOutOfMemoryError() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        ByteArrayOutputStream baos = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[32];
        setField(baos, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(baos, "java.io.ByteArrayOutputStream", "count", -2147483645);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        
        IOUtils.copy(jarInputStream, null, 0);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#copy(java.io.InputStream,java.io.OutputStream,int)}
 * @utbot.throwsException {@link java.lang.SecurityException} in: while(-1 != (n = input.read(buffer)))
 *  */
    @Test(expected = SecurityException.class)
    public void testCopy_ThrowSecurityException() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties sigFileSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        
        IOUtils.copy(jarInputStream, null, 1);
    }
    ///endregion
    
    ///region Errors report for copy
    
    public void testCopy_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.utils.IOUtils.skip
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method skip(java.io.InputStream, long)
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#skip(java.io.InputStream,long)}
 * @utbot.returnsFrom {@code return available - numToSkip;}
 *  */
    @Test
    public void testSkip_NumToSkipLessOrEqualZero() throws IOException  {
        long actual = IOUtils.skip(null, 0L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#skip(java.io.InputStream,long)}
 * @utbot.iterates iterate the loop {@code while(numToSkip > 0)} once
 * @utbot.returnsFrom {@code return available - numToSkip;}
 *  */
    @Test
    public void testSkip_SkippedEqualsZero() throws Exception  {
        ZipInputStream zipInputStream = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        byte[] tmpbuf = {(byte) 0};
        setField(zipInputStream, "java.util.zip.ZipInputStream", "tmpbuf", tmpbuf);
        
        long actual = IOUtils.skip(zipInputStream, 1L);
        
        assertEquals(0L, actual);
        
        boolean finalZipInputStreamEntryEOF = ((Boolean) getFieldValue(zipInputStream, "java.util.zip.ZipInputStream", "entryEOF"));
        
        assertTrue(finalZipInputStreamEntryEOF);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#skip(java.io.InputStream,long)}
 * @utbot.iterates iterate the loop {@code while(numToSkip > 0)} once
 * @utbot.returnsFrom {@code return available - numToSkip;}
 *  */
    @Test
    public void testSkip_SkippedEqualsZero_1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        byte[] tmpbuf = {};
        setField(jarInputStream, "java.util.zip.ZipInputStream", "tmpbuf", tmpbuf);
        
        long actual = IOUtils.skip(jarInputStream, 1L);
        
        assertEquals(0L, actual);
        
        boolean finalJarInputStreamEntryEOF = ((Boolean) getFieldValue(jarInputStream, "java.util.zip.ZipInputStream", "entryEOF"));
        
        assertTrue(finalJarInputStreamEntryEOF);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#skip(java.io.InputStream,long)}
 * @utbot.iterates iterate the loop {@code while(numToSkip > 0)} once
 * @utbot.returnsFrom {@code return available - numToSkip;}
 *  */
    @Test
    public void testSkip_SkippedEqualsZero_2() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        byte[] tmpbuf = {};
        setField(jarInputStream, "java.util.zip.ZipInputStream", "tmpbuf", tmpbuf);
        
        long actual = IOUtils.skip(jarInputStream, 1L);
        
        assertEquals(0L, actual);
        
        boolean finalJarInputStreamEntryEOF = ((Boolean) getFieldValue(jarInputStream, "java.util.zip.ZipInputStream", "entryEOF"));
        
        assertTrue(finalJarInputStreamEntryEOF);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#skip(java.io.InputStream,long)}
 * @utbot.iterates iterate the loop {@code while(numToSkip > 0)} once
 * @utbot.returnsFrom {@code return available - numToSkip;}
 *  */
    @Test
    public void testSkip_SkippedEqualsZero_3() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 0L);
        byte[] tmpbuf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(jarInputStream, "java.util.zip.ZipInputStream", "tmpbuf", tmpbuf);
        
        long actual = IOUtils.skip(jarInputStream, 11L);
        
        assertEquals(0L, actual);
        
        ZipEntry finalJarInputStreamEntry = ((ZipEntry) getFieldValue(jarInputStream, "java.util.zip.ZipInputStream", "entry"));
        boolean finalJarInputStreamEntryEOF = ((Boolean) getFieldValue(jarInputStream, "java.util.zip.ZipInputStream", "entryEOF"));
        
        assertNull(finalJarInputStreamEntry);
        
        assertTrue(finalJarInputStreamEntryEOF);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#skip(java.io.InputStream,long)}
 * @utbot.iterates iterate the loop {@code while(numToSkip > 0)} once
 * @utbot.returnsFrom {@code return available - numToSkip;}
 *  */
    @Test
    public void testSkip_SkippedEqualsZero_4() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Sun verifiedSigners = ((Sun) createInstance("sun.security.provider.Sun"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        byte[] tmpbuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.ZipInputStream", "tmpbuf", tmpbuf);
        
        long actual = IOUtils.skip(jarInputStream, 1L);
        
        assertEquals(0L, actual);
        
        boolean finalJarInputStreamEntryEOF = ((Boolean) getFieldValue(jarInputStream, "java.util.zip.ZipInputStream", "entryEOF"));
        
        assertTrue(finalJarInputStreamEntryEOF);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method skip(java.io.InputStream, long)
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#skip(java.io.InputStream,long)}
 * @utbot.iterates iterate the loop {@code while(numToSkip > 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: long skipped = input.skip(numToSkip);
 *  */
    @Test
    public void testSkip_ThrowNullPointerException() throws IOException  {
        /* This test fails because method [org.apache.commons.compress.utils.IOUtils.skip] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.IOUtils.skip(IOUtils.java:97) */
        IOUtils.skip(null, 1L);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method skip(java.io.InputStream, long)
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#skip(java.io.InputStream,long)}
 * @utbot.iterates iterate the loop {@code while(numToSkip > 0)} once
 * @utbot.throwsException {@link java.io.IOException} in: long skipped = input.skip(numToSkip);
 *  */
    @Test(expected = IOException.class)
    public void testSkip_ThrowIOException() throws Exception  {
        InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(inflaterInputStream, "java.util.zip.InflaterInputStream", "closed", true);
        
        IOUtils.skip(inflaterInputStream, 1L);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#skip(java.io.InputStream,long)}
 * @utbot.iterates iterate the loop {@code while(numToSkip > 0)} once
 * @utbot.throwsException {@link java.io.IOException} in: long skipped = input.skip(numToSkip);
 *  */
    @Test(expected = IOException.class)
    public void testSkip_ThrowIOException_1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "closed", true);
        
        IOUtils.skip(jarInputStream, 1L);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#skip(java.io.InputStream,long)}
 * @utbot.iterates iterate the loop {@code while(numToSkip > 0)} once
 * @utbot.throwsException {@link java.util.zip.ZipException} in: long skipped = input.skip(numToSkip);
 *  */
    @Test(expected = ZipException.class)
    public void testSkip_ThrowZipException() throws Exception  {
        ZipInputStream zipInputStream = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry.setMethod(1);
        setField(zipInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        byte[] tmpbuf = {(byte) 0};
        setField(zipInputStream, "java.util.zip.ZipInputStream", "tmpbuf", tmpbuf);
        
        IOUtils.skip(zipInputStream, 1L);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#skip(java.io.InputStream,long)}
 * @utbot.iterates iterate the loop {@code while(numToSkip > 0)} once
 * @utbot.throwsException {@link java.util.zip.ZipException} in: long skipped = input.skip(numToSkip);
 *  */
    @Test(expected = ZipException.class)
    public void testSkip_ThrowZipException_1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry.setMethod(1);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        byte[] tmpbuf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(jarInputStream, "java.util.zip.ZipInputStream", "tmpbuf", tmpbuf);
        
        IOUtils.skip(jarInputStream, 11L);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#skip(java.io.InputStream,long)}
 * @utbot.iterates iterate the loop {@code while(numToSkip > 0)} once
 * @utbot.throwsException {@link java.io.IOException} in: long skipped = input.skip(numToSkip);
 *  */
    @Test(expected = IOException.class)
    public void testSkip_ThrowIOException_2() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 2L);
        byte[] tmpbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(jarInputStream, "java.util.zip.ZipInputStream", "tmpbuf", tmpbuf);
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        
        IOUtils.skip(jarInputStream, 7L);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#skip(java.io.InputStream,long)}
 * @utbot.iterates iterate the loop {@code while(numToSkip > 0)} once
 * @utbot.throwsException {@link java.util.zip.ZipException} in: long skipped = input.skip(numToSkip);
 *  */
    @Test(expected = ZipException.class)
    public void testSkip_ThrowZipException_2() throws Exception  {
        ZipInputStream zipInputStream = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(zipInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(zipInputStream, "java.util.zip.ZipInputStream", "remaining", 2L);
        byte[] tmpbuf = new byte[39];
        setField(zipInputStream, "java.util.zip.ZipInputStream", "tmpbuf", tmpbuf);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(zipInputStream, "java.io.FilterInputStream", "in", in);
        
        IOUtils.skip(zipInputStream, 39L);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method skip(java.io.InputStream, long)
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#skip(java.io.InputStream,long)}
 * @utbot.iterates iterate the loop {@code while(numToSkip > 0)} once
 * @utbot.throwsException {@link java.lang.SecurityException} in: long skipped = input.skip(numToSkip);
 *  */
    @Test(expected = SecurityException.class)
    public void testSkip_ThrowSecurityException() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Sun sigFileSigners = ((Sun) createInstance("sun.security.provider.Sun"));
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        byte[] tmpbuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.ZipInputStream", "tmpbuf", tmpbuf);
        
        IOUtils.skip(jarInputStream, 1L);
    }
    ///endregion
    
    ///region Errors report for skip
    
    public void testSkip_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 9 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.utils.IOUtils.readFully
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readFully(java.io.InputStream, [B)
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[])}
 * @utbot.returnsFrom {@code return readFully(input, b, 0, b.length);}
 *  */
    @Test
    public void testReadFully_ReturnReadFully() throws IOException  {
        byte[] byteArray = {};
        
        int actual = IOUtils.readFully(null, byteArray);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[])}
 * @utbot.returnsFrom {@code return readFully(input, b, 0, b.length);}
 *  */
    @Test
    public void testReadFully_ReturnReadFully_1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        byte[] byteArray = {(byte) -127};
        
        int actual = IOUtils.readFully(jarInputStream, byteArray);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[])}
 * @utbot.returnsFrom {@code return readFully(input, b, 0, b.length);}
 *  */
    @Test
    public void testReadFully_ReturnReadFully_2() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        java.security.CodeSigner[] signers = {null};
        setField(entry, "java.util.jar.JarEntry", "signers", signers);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        byte[] byteArray = {(byte) -127};
        
        int actual = IOUtils.readFully(jarInputStream, byteArray);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[])}
 * @utbot.returnsFrom {@code return readFully(input, b, 0, b.length);}
 *  */
    @Test
    public void testReadFully_ReturnReadFully_3() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        Sun verifiedSigners = ((Sun) createInstance("sun.security.provider.Sun"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        Object entry1 = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry1);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 0L);
        byte[] byteArray = {(byte) -127};
        
        int actual = IOUtils.readFully(jarInputStream, byteArray);
        
        assertEquals(0, actual);
        
        ZipEntry finalJarInputStreamEntry = ((ZipEntry) getFieldValue(jarInputStream, "java.util.zip.ZipInputStream", "entry"));
        boolean finalJarInputStreamEntryEOF = ((Boolean) getFieldValue(jarInputStream, "java.util.zip.ZipInputStream", "entryEOF"));
        
        assertNull(finalJarInputStreamEntry);
        
        assertTrue(finalJarInputStreamEntryEOF);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readFully(java.io.InputStream, [B)
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} 
 *  */
    @Test
    public void testReadFully_ThrowArithmeticException() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        Sun verifiedSigners = ((Sun) createInstance("sun.security.provider.Sun"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        Hashtable sigFileSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(sigFileSigners, "java.util.Hashtable", "table", table);
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
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
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.utils.IOUtils.readFully] produces [java.lang.ArithmeticException: / by zero] */
        IOUtils.readFully(jarInputStream, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return readFully(input, b, 0, b.length);
 *  */
    @Test
    public void testReadFully_ThrowNullPointerException() throws IOException  {
        /* This test fails because method [org.apache.commons.compress.utils.IOUtils.readFully] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.IOUtils.readFully(IOUtils.java:120) */
        IOUtils.readFully(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readFully(java.io.InputStream, [B)
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: return readFully(input, b, 0, b.length);
 *  */
    @Test(expected = IOException.class)
    public void testReadFully_ThrowIOException() throws Exception  {
        InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(inflaterInputStream, "java.util.zip.InflaterInputStream", "closed", true);
        byte[] byteArray = {(byte) -127};
        
        IOUtils.readFully(inflaterInputStream, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[])}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: return readFully(input, b, 0, b.length);
 *  */
    @Test(expected = ZipException.class)
    public void testReadFully_ThrowZipException() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        byte[] byteArray = {(byte) -127};
        
        IOUtils.readFully(jarInputStream, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: return readFully(input, b, 0, b.length);
 *  */
    @Test(expected = IOException.class)
    public void testReadFully_ThrowIOException_1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        byte[] byteArray = {(byte) -127};
        
        IOUtils.readFully(jarInputStream, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[])}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: return readFully(input, b, 0, b.length);
 *  */
    @Test(expected = ZipException.class)
    public void testReadFully_ThrowZipException_1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        byte[] byteArray = {(byte) -127};
        
        IOUtils.readFully(jarInputStream, byteArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readFully(java.io.InputStream, [B)
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.SecurityException} in: return readFully(input, b, 0, b.length);
 *  */
    @Test(expected = SecurityException.class)
    public void testReadFully_ThrowSecurityException() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        Hashtable sigFileSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        byte[] byteArray = {(byte) -127};
        
        IOUtils.readFully(jarInputStream, byteArray);
    }
    ///endregion
    
    ///region Errors report for readFully
    
    public void testReadFully_errors()
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
    
    ///region Test suites for executable org.apache.commons.compress.utils.IOUtils.readFully
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readFully(java.io.InputStream, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[],int,int)}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testReadFully_ReturnCount() throws IOException  {
        byte[] byteArray = {};
        
        int actual = IOUtils.readFully(null, byteArray, 0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[],int,int)}
 * @utbot.iterates iterate the loop {@code while(count != len)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testReadFully_IterateWhileLoop() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        int actual = IOUtils.readFully(jarInputStream, byteArray, 0, 2);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[],int,int)}
 * @utbot.iterates iterate the loop {@code while(count != len)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testReadFully_IterateWhileLoop_1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        int actual = IOUtils.readFully(jarInputStream, byteArray, 0, 2);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[],int,int)}
 * @utbot.iterates iterate the loop {@code while(count != len)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testReadFully_IterateWhileLoop_2() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        int actual = IOUtils.readFully(jarInputStream, byteArray, 0, 2);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[],int,int)}
 * @utbot.iterates iterate the loop {@code while(count != len)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testReadFully_IterateWhileLoop_3() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Hashtable verifiedSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        int actual = IOUtils.readFully(jarInputStream, byteArray, 0, 2);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readFully(java.io.InputStream, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (offset < 0): False}
 * @utbot.executesCondition {@code (len + offset > b.length): False}
 * @utbot.iterates iterate the loop {@code while(count != len)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: x = input.read(b, offset + count, len - count);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFully_ThrowIndexOutOfBoundsException_3() throws Exception  {
        InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        byte[] byteArray = {};
        
        IOUtils.readFully(inflaterInputStream, byteArray, 2147483646, 3);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (offset < 0): False}
 * @utbot.executesCondition {@code (len + offset > b.length): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: len < 0 || offset < 0 || len + offset > b.length
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFully_ThrowIndexOutOfBoundsException_1() throws IOException  {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        IOUtils.readFully(null, byteArray, 0, 286335523);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (offset < 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: len < 0 || offset < 0 || len + offset > b.length
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFully_ThrowIndexOutOfBoundsException() throws IOException  {
        IOUtils.readFully(null, null, -1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: len < 0 || offset < 0 || len + offset > b.length
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFully_ThrowIndexOutOfBoundsException_2() throws IOException  {
        IOUtils.readFully(null, null, 4, -1);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (offset < 0): False}
 * @utbot.executesCondition {@code (len + offset > b.length): False}
 * @utbot.iterates iterate the loop {@code while(count != len)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: x = input.read(b, offset + count, len - count);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFully_ThrowIndexOutOfBoundsException_4() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        byte[] byteArray = new byte[12];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        
        IOUtils.readFully(jarInputStream, byteArray, 1073741833, 1090521046);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (offset < 0): False}
 * @utbot.executesCondition {@code (len + offset > b.length): False}
 * @utbot.iterates iterate the loop {@code while(count != len)} once
 * @utbot.throwsException {@link java.lang.SecurityException} 
 *  */
    @Test(expected = SecurityException.class)
    public void testReadFully_ThrowSecurityException1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        Hashtable sigFileSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        IOUtils.readFully(jarInputStream, byteArray, 0, 2);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readFully(java.io.InputStream, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[],int,int)}
 * @utbot.iterates iterate the loop {@code while(count != len)} once
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadFully_ThrowIOException1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        byte[] byteArray = {(byte) -127};
        
        IOUtils.readFully(jarInputStream, byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[],int,int)}
 * @utbot.iterates iterate the loop {@code while(count != len)} once
 * @utbot.throwsException {@link java.util.zip.ZipException} in: x = input.read(b, offset + count, len - count);
 *  */
    @Test(expected = ZipException.class)
    public void testReadFully_ThrowZipException1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.jar.JarInputStream", "first", entry);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        byte[] byteArray = {(byte) -127};
        
        IOUtils.readFully(jarInputStream, byteArray, 0, 1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readFully(java.io.InputStream, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[],int,int)}
 * @utbot.executesCondition {@code (len + offset > b.length): False}
 * @utbot.iterates iterate the loop {@code while(count != len)} once
 * @utbot.throwsException {@link java.lang.ArithmeticException} 
 *  */
    @Test
    public void testReadFully_ThrowArithmeticException1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        Hashtable verifiedSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(verifiedSigners, "java.util.Hashtable", "table", table);
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", verifiedSigners);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
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
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.utils.IOUtils.readFully] produces [java.lang.ArithmeticException: / by zero] */
        IOUtils.readFully(jarInputStream, byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[],int,int)}
 * @utbot.executesCondition {@code (len + offset > b.length): False}
 * @utbot.iterates iterate the loop {@code while(count != len)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: x = input.read(b, offset + count, len - count);
 *  */
    @Test
    public void testReadFully_ThrowNullPointerException_1() throws IOException  {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.utils.IOUtils.readFully] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.IOUtils.readFully(IOUtils.java:146) */
        IOUtils.readFully(null, byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link IOUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: len < 0 || offset < 0 || len + offset > b.length
 *  */
    @Test
    public void testReadFully_ThrowNullPointerException1() throws IOException  {
        /* This test fails because method [org.apache.commons.compress.utils.IOUtils.readFully] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.IOUtils.readFully(IOUtils.java:141) */
        IOUtils.readFully(null, null, 0, 0);
    }
    ///endregion
    
    ///region Errors report for readFully
    
    public void testReadFully_errors1()
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
        
                java.lang.reflect.Method methodForGetDeclaredFields972721588856900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields972721588856900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass972721588863400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields972721588856900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass972721588863400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields972721590230500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields972721590230500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass972721590233200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields972721590230500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass972721590233200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


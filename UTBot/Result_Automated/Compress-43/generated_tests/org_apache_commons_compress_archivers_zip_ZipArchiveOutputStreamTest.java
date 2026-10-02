package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import java.lang.reflect.Method;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.util.zip.ZipOutputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import sun.nio.ch.FileChannelImpl;
import org.apache.commons.compress.utils.SeekableInMemoryByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.nio.channels.SeekableByteChannel;
import java.io.FileDescriptor;
import java.util.zip.Deflater;
import java.util.zip.ZipException;
import java.util.zip.CRC32;
import java.util.Stack;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.io.DataOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy;
import java.util.ArrayList;
import java.nio.channels.ClosedChannelException;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.nio.file.attribute.FileTime;
import java.util.concurrent.TimeUnit;
import java.time.Instant;
import java.util.zip.ZipEntry;
import java.util.jar.JarOutputStream;
import java.io.DataOutput;
import java.util.jar.JarEntry;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_compress_archivers_zip_ZipArchiveOutputStreamTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getName(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#getName(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getEntryEncoding(ze).encode(ze.getName());
 *  */
    @Test
    public void testGetName_ThrowNullPointerException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getName] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEntryEncoding(ZipArchiveOutputStream.java:1582)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getName(ZipArchiveOutputStream.java:1588) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Method getNameMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("getName", zipArchiveEntryType);
        getNameMethod.setAccessible(true);
        java.lang.Object[] getNameMethodArguments = new java.lang.Object[1];
        getNameMethodArguments[0] = ((Object) null);
        try {
            getNameMethod.invoke(zipArchiveOutputStream, getNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#getName(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getEntryEncoding(ze).encode(ze.getName());
 *  */
    @Test
    public void testGetName_ThrowNullPointerException_1() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        String name = "";
        setField(jarArchiveEntry, "java.util.zip.ZipEntry", "name", name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getName] produces [java.lang.NullPointerException] */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class jarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Method getNameMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("getName", jarArchiveEntryType);
        getNameMethod.setAccessible(true);
        java.lang.Object[] getNameMethodArguments = new java.lang.Object[1];
        getNameMethodArguments[0] = jarArchiveEntry;
        try {
            getNameMethod.invoke(zipArchiveOutputStream, getNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getName
    
    public void testGetName_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flush
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method flush()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#flush()}
 * @utbot.executesCondition {@code (out != null): False}
 *  */
    @Test
    public void testFlush_OutEqualsNull() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        zipArchiveOutputStream.flush();
    }
    ///endregion
    
    ///region Errors report for flush
    
    public void testFlush_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 20 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (entry == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: entry == null
 *  */
    @Test(expected = IllegalStateException.class)
    public void testWrite_ThrowIllegalStateException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        zipArchiveOutputStream.write(null, -255, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.destroy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method destroy()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#destroy()}
 * @utbot.executesCondition {@code (channel != null): False}
 * @utbot.executesCondition {@code (out != null): True}
 *  */
    @Test
    public void testDestroy_OutNotEqualsNull() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        zipArchiveOutputStream.destroy();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#destroy()}
 * @utbot.executesCondition {@code (channel != null): False}
 * @utbot.executesCondition {@code (out != null): True}
 *  */
    @Test
    public void testDestroy_OutNotEqualsNull_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.DeflaterOutputStream", "closed", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        zipArchiveOutputStream.destroy();
        
        OutputStream zipArchiveOutputStreamOut = ((OutputStream) getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out"));
        boolean finalZipArchiveOutputStreamOutClosed = ((Boolean) getFieldValue(zipArchiveOutputStreamOut, "java.util.zip.ZipOutputStream", "closed"));
        
        assertTrue(finalZipArchiveOutputStreamOutClosed);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#destroy()}
 * @utbot.executesCondition {@code (channel != null): False}
 * @utbot.executesCondition {@code (out != null): True}
 *  */
    @Test
    public void testDestroy_OutNotEqualsNull_2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        setField(out, "java.util.zip.DeflaterOutputStream", "closed", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        zipArchiveOutputStream.destroy();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#destroy()}
 * @utbot.executesCondition {@code (channel != null): False}
 * @utbot.executesCondition {@code (out != null): False}
 *  */
    @Test
    public void testDestroy_OutEqualsNull() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        zipArchiveOutputStream.destroy();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#destroy()}
 * @utbot.executesCondition {@code (channel != null): False}
 * @utbot.executesCondition {@code (out != null): True}
 *  */
    @Test
    public void testDestroy_OutNotEqualsNull_3() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "finished", true);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        zipArchiveOutputStream.destroy();
        
        OutputStream zipArchiveOutputStreamOut = ((OutputStream) getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out"));
        boolean finalZipArchiveOutputStreamOutClosed = ((Boolean) getFieldValue(zipArchiveOutputStreamOut, "java.util.zip.ZipOutputStream", "closed"));
        OutputStream zipArchiveOutputStreamOut1 = ((OutputStream) getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out"));
        boolean finalZipArchiveOutputStreamOutClosed1 = ((Boolean) getFieldValue(zipArchiveOutputStreamOut1, "java.util.zip.DeflaterOutputStream", "closed"));
        
        assertTrue(finalZipArchiveOutputStreamOutClosed);
        
        assertTrue(finalZipArchiveOutputStreamOutClosed1);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#destroy()}
 * @utbot.executesCondition {@code (channel != null): True}
 * @utbot.executesCondition {@code (out != null): False}
 *  */
    @Test
    public void testDestroy_OutEqualsNull_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        FileChannelImpl channel = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        Object closeLock = createInstance("java.lang.Object");
        setField(channel, "java.nio.channels.spi.AbstractInterruptibleChannel", "closeLock", closeLock);
        setField(channel, "java.nio.channels.spi.AbstractInterruptibleChannel", "closed", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        
        zipArchiveOutputStream.destroy();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#destroy()}
 * @utbot.executesCondition {@code (channel != null): True}
 * @utbot.executesCondition {@code (out != null): False}
 *  */
    @Test
    public void testDestroy_OutEqualsNull_3() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        AtomicBoolean closed = ((AtomicBoolean) createInstance("java.util.concurrent.atomic.AtomicBoolean"));
        setField(channel, "org.apache.commons.compress.utils.SeekableInMemoryByteChannel", "closed", closed);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        
        zipArchiveOutputStream.destroy();
        
        SeekableByteChannel zipArchiveOutputStreamChannel = ((SeekableByteChannel) getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel"));
        AtomicBoolean zipArchiveOutputStreamChannelChannelClosed = ((AtomicBoolean) getFieldValue(zipArchiveOutputStreamChannel, "org.apache.commons.compress.utils.SeekableInMemoryByteChannel", "closed"));
        int finalZipArchiveOutputStreamChannelClosedValue = ((Integer) getFieldValue(zipArchiveOutputStreamChannelChannelClosed, "java.util.concurrent.atomic.AtomicBoolean", "value"));
        
        assertEquals(1, finalZipArchiveOutputStreamChannelClosedValue);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#destroy()}
 * @utbot.executesCondition {@code (channel != null): True}
 * @utbot.executesCondition {@code (out != null): False}
 *  */
    @Test
    public void testDestroy_OutEqualsNull_2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        FileChannelImpl channel = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(fd, "java.io.FileDescriptor", "fd", -1);
        setField(fd, "java.io.FileDescriptor", "handle", -1L);
        setField(channel, "sun.nio.ch.FileChannelImpl", "fd", fd);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        
        zipArchiveOutputStream.destroy();
        
        SeekableByteChannel zipArchiveOutputStreamChannel = ((SeekableByteChannel) getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel"));
        boolean finalZipArchiveOutputStreamChannelClosed = ((Boolean) getFieldValue(zipArchiveOutputStreamChannel, "java.nio.channels.spi.AbstractInterruptibleChannel", "closed"));
        
        assertTrue(finalZipArchiveOutputStreamChannelClosed);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method destroy()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#destroy()}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: out.close();
 *  */
    @Test(expected = ZipException.class)
    public void testDestroy_ThrowZipException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry.setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finish", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        zipArchiveOutputStream.destroy();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#destroy()}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: out.close();
 *  */
    @Test(expected = ZipException.class)
    public void testDestroy_ThrowZipException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry.setCrc(1L);
        entry.setSize(3L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(out, "java.util.zip.ZipOutputStream", "crc", crc);
        setField(out, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -3L);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finish", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        zipArchiveOutputStream.destroy();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method destroy()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#destroy()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: out.close();
 *  */
    @Test(expected = ClassCastException.class)
    public void testDestroy_ThrowClassCastException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Stack xentries = ((Stack) createInstance("java.util.Stack"));
        java.lang.Object[] elementData = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        elementData[0] = object;
        setField(xentries, "java.util.Vector", "elementData", elementData);
        setField(xentries, "java.util.Vector", "elementCount", 1);
        setField(out, "java.util.zip.ZipOutputStream", "xentries", xentries);
        setField(out, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        zipArchiveOutputStream.destroy();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#destroy()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testDestroy_ThrowNullPointerException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "finished", true);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        Object cleanable = createInstance("java.net.SocketCleanable");
        setField(zsRef, "java.util.zip.Deflater$DeflaterZStreamRef", "cleanable", cleanable);
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.util.zip.DeflaterOutputStream", "usesDefaultDeflater", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        zipArchiveOutputStream.destroy();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method destroy()
    
    @Test
    public void testDestroy1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        AtomicBoolean closed = ((AtomicBoolean) createInstance("java.util.concurrent.atomic.AtomicBoolean"));
        setField(channel, "org.apache.commons.compress.utils.SeekableInMemoryByteChannel", "closed", closed);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.destroy] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectOutputStream.flush(ObjectOutputStream.java:728)
            java.base/java.io.ObjectOutputStream.close(ObjectOutputStream.java:749)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.destroy(ZipArchiveOutputStream.java:1603) */
        zipArchiveOutputStream.destroy();
    }
    
    @Test
    public void testDestroy2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.destroy] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectOutputStream.flush(ObjectOutputStream.java:728)
            java.base/java.io.ObjectOutputStream.close(ObjectOutputStream.java:749)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.destroy(ZipArchiveOutputStream.java:1603) */
        zipArchiveOutputStream.destroy();
    }
    ///endregion
    
    ///region Errors report for destroy
    
    public void testDestroy_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field private static final jdk.internal.access.JavaIOFileDescriptorAccess sun.nio.ch.FileChannelImpl.fdAccess accessible:
        module java.base does not "opens sun.nio.ch" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field private static java.util.concurrent.ConcurrentHashMap sun.nio.ch.FileLockTable.lockMap accessible: module
        java.base does not "opens sun.nio.ch" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method close()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#close()}
 *  */
    @Test
    public void testClose_2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        zipArchiveOutputStream.finished = true;
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        AtomicBoolean closed = ((AtomicBoolean) createInstance("java.util.concurrent.atomic.AtomicBoolean"));
        setField(channel, "org.apache.commons.compress.utils.SeekableInMemoryByteChannel", "closed", closed);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        setField(out, "java.util.zip.DeflaterOutputStream", "closed", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        zipArchiveOutputStream.close();
        
        SeekableByteChannel zipArchiveOutputStreamChannel = ((SeekableByteChannel) getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel"));
        AtomicBoolean zipArchiveOutputStreamChannelChannelClosed = ((AtomicBoolean) getFieldValue(zipArchiveOutputStreamChannel, "org.apache.commons.compress.utils.SeekableInMemoryByteChannel", "closed"));
        int finalZipArchiveOutputStreamChannelClosedValue = ((Integer) getFieldValue(zipArchiveOutputStreamChannelChannelClosed, "java.util.concurrent.atomic.AtomicBoolean", "value"));
        
        assertEquals(1, finalZipArchiveOutputStreamChannelClosedValue);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#close()}
 *  */
    @Test
    public void testClose() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        zipArchiveOutputStream.finished = true;
        
        zipArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#close()}
 *  */
    @Test
    public void testClose_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        zipArchiveOutputStream.finished = true;
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        AtomicBoolean closed = ((AtomicBoolean) createInstance("java.util.concurrent.atomic.AtomicBoolean"));
        setField(channel, "org.apache.commons.compress.utils.SeekableInMemoryByteChannel", "closed", closed);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        
        zipArchiveOutputStream.close();
        
        SeekableByteChannel zipArchiveOutputStreamChannel = ((SeekableByteChannel) getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel"));
        AtomicBoolean zipArchiveOutputStreamChannelChannelClosed = ((AtomicBoolean) getFieldValue(zipArchiveOutputStreamChannel, "org.apache.commons.compress.utils.SeekableInMemoryByteChannel", "closed"));
        int finalZipArchiveOutputStreamChannelClosedValue = ((Integer) getFieldValue(zipArchiveOutputStreamChannelChannelClosed, "java.util.concurrent.atomic.AtomicBoolean", "value"));
        
        assertEquals(1, finalZipArchiveOutputStreamChannelClosedValue);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#close()}
 *  */
    @Test
    public void testClose_3() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        zipArchiveOutputStream.finished = true;
        FileChannelImpl channel = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        setField(channel, "java.nio.channels.spi.AbstractInterruptibleChannel", "closed", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        
        zipArchiveOutputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method close()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False},
    ///     {@code (null): True}
    /// invoke:
    ///     {@link java.io.OutputStream#close()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#close()}
 *  */
    @Test
    public void testClose_4() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        zipArchiveOutputStream.finished = true;
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        zipArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#close()}
 *  */
    @Test
    public void testClose_5() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        zipArchiveOutputStream.finished = true;
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.DeflaterOutputStream", "closed", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        zipArchiveOutputStream.close();
        
        OutputStream zipArchiveOutputStreamOut = ((OutputStream) getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out"));
        boolean finalZipArchiveOutputStreamOutClosed = ((Boolean) getFieldValue(zipArchiveOutputStreamOut, "java.util.zip.ZipOutputStream", "closed"));
        
        assertTrue(finalZipArchiveOutputStreamOutClosed);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#close()}
 *  */
    @Test
    public void testClose_6() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        zipArchiveOutputStream.finished = true;
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "finished", true);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        zipArchiveOutputStream.close();
        
        OutputStream zipArchiveOutputStreamOut = ((OutputStream) getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out"));
        boolean finalZipArchiveOutputStreamOutClosed = ((Boolean) getFieldValue(zipArchiveOutputStreamOut, "java.util.zip.ZipOutputStream", "closed"));
        OutputStream zipArchiveOutputStreamOut1 = ((OutputStream) getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out"));
        boolean finalZipArchiveOutputStreamOutClosed1 = ((Boolean) getFieldValue(zipArchiveOutputStreamOut1, "java.util.zip.DeflaterOutputStream", "closed"));
        
        assertTrue(finalZipArchiveOutputStreamOutClosed);
        
        assertTrue(finalZipArchiveOutputStreamOutClosed1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#finish()}
 * @utbot.throwsException {@link java.io.IOException} in: finish();
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        zipArchiveOutputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!finished): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#destroy()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testClose_ThrowNullPointerException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        zipArchiveOutputStream.finished = true;
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "finished", true);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        Object cleanable = createInstance("java.io.FileCleanable");
        setField(zsRef, "java.util.zip.Deflater$DeflaterZStreamRef", "cleanable", cleanable);
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.util.zip.DeflaterOutputStream", "usesDefaultDeflater", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        zipArchiveOutputStream.close();
    }
    ///endregion
    
    ///region Errors report for close
    
    public void testClose_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 5 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field private static final java.util.concurrent.atomic.AtomicInteger sun.net.ResourceManager.numSockets accessible:
        module java.base does not "opens sun.net" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEncoding
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEncoding()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#getEncoding()}
 * @utbot.returnsFrom {@code return encoding;}
 *  */
    @Test
    public void testGetEncoding_ReturnEncoding() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        String actual = zipArchiveOutputStream.getEncoding();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method finish()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#finish()}
 * @utbot.executesCondition {@code (finished): True}
 * @utbot.throwsException {@link java.io.IOException} when: finished
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        zipArchiveOutputStream.finished = true;
        
        zipArchiveOutputStream.finish();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#finish()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (entry != null): True}
 * @utbot.throwsException {@link java.io.IOException} when: entry != null
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        zipArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method finish()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#finish()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (entry != null): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.StreamCompressor#getTotalBytesWritten()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cdOffset = streamCompressor.getTotalBytesWritten();
 *  */
    @Test
    public void testFinish_ThrowNullPointerException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish(ZipArchiveOutputStream.java:470) */
        zipArchiveOutputStream.finish();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setMethod
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMethod(int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#setMethod(int)}
 *  */
    @Test
    public void testSetMethod() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        zipArchiveOutputStream.setMethod(-255);
        
        zipArchiveOutputStream.setMethod(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setComment
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setComment(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#setComment(java.lang.String)}
 *  */
    @Test
    public void testSetComment() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        zipArchiveOutputStream.setComment(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setLevel
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLevel(int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#setLevel(int)}
 * @utbot.executesCondition {@code (hasCompressionLevelChanged = (this.level != level);): False}
 *  */
    @Test
    public void testSetLevel() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        zipArchiveOutputStream.setLevel(-1);
        
        zipArchiveOutputStream.setLevel(-1);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#setLevel(int)}
 * @utbot.executesCondition {@code (hasCompressionLevelChanged = (this.level != level);): True}
 *  */
    @Test
    public void testSetLevel_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        zipArchiveOutputStream.setLevel(-10);
        
        zipArchiveOutputStream.setLevel(9);
        
        int finalZipArchiveOutputStreamLevel = ((Integer) getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "level"));
        boolean finalZipArchiveOutputStreamHasCompressionLevelChanged = ((Boolean) getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "hasCompressionLevelChanged"));
        
        assertEquals(9, finalZipArchiveOutputStreamLevel);
        
        assertTrue(finalZipArchiveOutputStreamHasCompressionLevelChanged);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setLevel(int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#setLevel(int)}
 * @utbot.executesCondition {@code (level < Deflater.DEFAULT_COMPRESSION): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: level < Deflater.DEFAULT_COMPRESSION || level > Deflater.BEST_COMPRESSION
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetLevel_ThrowIllegalArgumentException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        zipArchiveOutputStream.setLevel(-2);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#setLevel(int)}
 * @utbot.executesCondition {@code (level < Deflater.DEFAULT_COMPRESSION): False}
 * @utbot.executesCondition {@code (level > Deflater.BEST_COMPRESSION): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: level < Deflater.DEFAULT_COMPRESSION || level > Deflater.BEST_COMPRESSION
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetLevel_ThrowIllegalArgumentException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        zipArchiveOutputStream.setLevel(10);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.preClose
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method preClose()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#preClose()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (entry == null): False}
 * @utbot.executesCondition {@code (!entry.hasWritten): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$300(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 *  */
    @Test
    public void testPreClose_EntryHasWritten() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "hasWritten", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Method preCloseMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("preClose");
        preCloseMethod.setAccessible(true);
        java.lang.Object[] preCloseMethodArguments = new java.lang.Object[0];
        preCloseMethod.invoke(zipArchiveOutputStream, preCloseMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method preClose()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#preClose()}
 * @utbot.executesCondition {@code (finished): True}
 * @utbot.throwsException {@link java.io.IOException} when: finished
 *  */
    @Test(expected = IOException.class)
    public void testPreClose_ThrowIOException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        zipArchiveOutputStream.finished = true;
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Method preCloseMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("preClose");
        preCloseMethod.setAccessible(true);
        java.lang.Object[] preCloseMethodArguments = new java.lang.Object[0];
        try {
            preCloseMethod.invoke(zipArchiveOutputStream, preCloseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#preClose()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.executesCondition {@code (entry == null): True}
 * @utbot.throwsException {@link java.io.IOException} when: entry == null
 *  */
    @Test(expected = IOException.class)
    public void testPreClose_ThrowIOException_1() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Method preCloseMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("preClose");
        preCloseMethod.setAccessible(true);
        java.lang.Object[] preCloseMethodArguments = new java.lang.Object[0];
        try {
            preCloseMethod.invoke(zipArchiveOutputStream, preCloseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createCentralFileHeader
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final EntryMetaData entryMetaData = metaData.get(ze);
 *  */
    @Test
    public void testCreateCentralFileHeader_ThrowNullPointerException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createCentralFileHeader] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createCentralFileHeader(ZipArchiveOutputStream.java:1200) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Method createCentralFileHeaderMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("createCentralFileHeader", zipArchiveEntryType);
        createCentralFileHeaderMethod.setAccessible(true);
        java.lang.Object[] createCentralFileHeaderMethodArguments = new java.lang.Object[1];
        createCentralFileHeaderMethodArguments[0] = ((Object) null);
        try {
            createCentralFileHeaderMethod.invoke(zipArchiveOutputStream, createCentralFileHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#hasZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean needsZip64Extra = hasZip64Extra(ze) || ze.getCompressedSize() >= ZIP64_MAGIC || ze.getSize() >= ZIP64_MAGIC || entryMetaData.offset >= ZIP64_MAGIC || zip64Mode == Zip64Mode.Always;
 *  */
    @Test
    public void testCreateCentralFileHeader_ThrowNullPointerException_1() throws Throwable  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            LinkedHashMap metaData = new LinkedHashMap();
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "metaData", metaData);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createCentralFileHeader] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.hasZip64Extra(ZipArchiveOutputStream.java:1559)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createCentralFileHeader(ZipArchiveOutputStream.java:1201) */
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Method createCentralFileHeaderMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("createCentralFileHeader", zipArchiveEntryType);
            createCentralFileHeaderMethod.setAccessible(true);
            java.lang.Object[] createCentralFileHeaderMethodArguments = new java.lang.Object[1];
            createCentralFileHeaderMethodArguments[0] = ((Object) null);
            try {
                createCentralFileHeaderMethod.invoke(zipArchiveOutputStream, createCentralFileHeaderMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (ze.getCompressedSize() >= ZIP64_MAGIC): False}
 * @utbot.executesCondition {@code (ze.getSize() >= ZIP64_MAGIC): True}
 * @utbot.throwsException {@link org.apache.commons.compress.archivers.zip.Zip64RequiredException} when: needsZip64Extra && zip64Mode == Zip64Mode.Never
 *  */
    @Test(expected = Zip64RequiredException.class)
    public void testCreateCentralFileHeader_ThrowZip64RequiredException() throws Throwable  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            LinkedHashMap metaData = new LinkedHashMap();
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "metaData", metaData);
            Zip64Mode zip64Mode = Zip64Mode.Never;
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            zipArchiveEntry.setSize(4294967295L);
            org.apache.commons.compress.archivers.zip.ZipExtraField[] extraFields = {};
            zipArchiveEntry.setExtraFields(extraFields);
            setField(zipArchiveEntry, "java.util.zip.ZipEntry", "csize", -9223372032559808512L);
            
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Method createCentralFileHeaderMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("createCentralFileHeader", zipArchiveEntryType);
            createCentralFileHeaderMethod.setAccessible(true);
            java.lang.Object[] createCentralFileHeaderMethodArguments = new java.lang.Object[1];
            createCentralFileHeaderMethodArguments[0] = zipArchiveEntry;
            try {
                createCentralFileHeaderMethod.invoke(zipArchiveOutputStream, createCentralFileHeaderMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (ze.getCompressedSize() >= ZIP64_MAGIC): True}
 * @utbot.throwsException {@link org.apache.commons.compress.archivers.zip.Zip64RequiredException} when: needsZip64Extra && zip64Mode == Zip64Mode.Never
 *  */
    @Test(expected = Zip64RequiredException.class)
    public void testCreateCentralFileHeader_ThrowZip64RequiredException_1() throws Throwable  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            LinkedHashMap metaData = new LinkedHashMap();
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "metaData", metaData);
            Zip64Mode zip64Mode = Zip64Mode.Never;
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
            Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
            setField(entry, "java.util.zip.ZipEntry", "csize", 4294967295L);
            
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class entryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Method createCentralFileHeaderMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("createCentralFileHeader", entryType);
            createCentralFileHeaderMethod.setAccessible(true);
            java.lang.Object[] createCentralFileHeaderMethodArguments = new java.lang.Object[1];
            createCentralFileHeaderMethodArguments[0] = entry;
            try {
                createCentralFileHeaderMethod.invoke(zipArchiveOutputStream, createCentralFileHeaderMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (ze.getCompressedSize() >= ZIP64_MAGIC): False}
 * @utbot.executesCondition {@code (ze.getSize() >= ZIP64_MAGIC): True}
 * @utbot.throwsException {@link org.apache.commons.compress.archivers.zip.Zip64RequiredException} when: needsZip64Extra && zip64Mode == Zip64Mode.Never
 *  */
    @Test(expected = Zip64RequiredException.class)
    public void testCreateCentralFileHeader_ThrowZip64RequiredException_2() throws Throwable  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            LinkedHashMap metaData = new LinkedHashMap();
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "metaData", metaData);
            Zip64Mode zip64Mode = Zip64Mode.Never;
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
            Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
            (((ZipArchiveEntry) entry)).setSize(6442450944L);
            setField(entry, "java.util.zip.ZipEntry", "csize", -9223372032559808512L);
            
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class entryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Method createCentralFileHeaderMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("createCentralFileHeader", entryType);
            createCentralFileHeaderMethod.setAccessible(true);
            java.lang.Object[] createCentralFileHeaderMethodArguments = new java.lang.Object[1];
            createCentralFileHeaderMethodArguments[0] = entry;
            try {
                createCentralFileHeaderMethod.invoke(zipArchiveOutputStream, createCentralFileHeaderMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    ///endregion
    
    ///region Errors report for createCentralFileHeader
    
    public void testCreateCentralFileHeader_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createCentralFileHeader
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.nio.ByteBuffer, org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$EntryMetaData, boolean)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,java.nio.ByteBuffer,org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EntryMetaData,boolean)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getCentralDirectoryExtra()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final byte[] extra = ze.getCentralDirectoryExtra();
 *  */
    @Test
    public void testCreateCentralFileHeader_ThrowNullPointerException1() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createCentralFileHeader] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createCentralFileHeader(ZipArchiveOutputStream.java:1231) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class byteBufferType = Class.forName("java.nio.ByteBuffer");
        Class entryMetaDataType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$EntryMetaData");
        Class booleanType = boolean.class;
        Method createCentralFileHeaderMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("createCentralFileHeader", zipArchiveEntryType, byteBufferType, entryMetaDataType, booleanType);
        createCentralFileHeaderMethod.setAccessible(true);
        java.lang.Object[] createCentralFileHeaderMethodArguments = new java.lang.Object[4];
        createCentralFileHeaderMethodArguments[0] = ((Object) null);
        createCentralFileHeaderMethodArguments[1] = ((Object) null);
        createCentralFileHeaderMethodArguments[2] = ((Object) null);
        createCentralFileHeaderMethodArguments[3] = false;
        try {
            createCentralFileHeaderMethod.invoke(zipArchiveOutputStream, createCentralFileHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,java.nio.ByteBuffer,org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EntryMetaData,boolean)}
 * @utbot.executesCondition {@code (comm == null): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getCentralDirectoryExtra()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getComment()}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#getEntryEncoding(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final ByteBuffer commentB = getEntryEncoding(ze).encode(comm);
 *  */
    @Test
    public void testCreateCentralFileHeader_ThrowNullPointerException_11() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        org.apache.commons.compress.archivers.zip.ZipExtraField[] extraFields = {};
        jarArchiveEntry.setExtraFields(extraFields);
        String name = "";
        jarArchiveEntry.setName(name);
        jarArchiveEntry.setComment(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createCentralFileHeader] produces [java.lang.NullPointerException] */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class jarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class byteBufferType = Class.forName("java.nio.ByteBuffer");
        Class entryMetaDataType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$EntryMetaData");
        Class booleanType = boolean.class;
        Method createCentralFileHeaderMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("createCentralFileHeader", jarArchiveEntryType, byteBufferType, entryMetaDataType, booleanType);
        createCentralFileHeaderMethod.setAccessible(true);
        java.lang.Object[] createCentralFileHeaderMethodArguments = new java.lang.Object[4];
        createCentralFileHeaderMethodArguments[0] = jarArchiveEntry;
        createCentralFileHeaderMethodArguments[1] = ((Object) null);
        createCentralFileHeaderMethodArguments[2] = ((Object) null);
        createCentralFileHeaderMethodArguments[3] = false;
        try {
            createCentralFileHeaderMethod.invoke(zipArchiveOutputStream, createCentralFileHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for createCentralFileHeader
    
    public void testCreateCentralFileHeader_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setUseLanguageEncodingFlag
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setUseLanguageEncodingFlag(boolean)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#setUseLanguageEncodingFlag(boolean)}
 * @utbot.executesCondition {@code (useUTF8Flag = b && ZipEncodingHelper.isUTF8(encoding);): False}
 *  */
    @Test
    public void testSetUseLanguageEncodingFlag() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        zipArchiveOutputStream.setUseLanguageEncodingFlag(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeCentralDirectoryEnd()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCentralDirectoryEnd()}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCounted(byte[])
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.StreamCompressor#writeCounted(byte[])}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCounted(byte[])
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeCounted(EOCD_SIG);
 *  */
    @Test
    public void testWriteCentralDirectoryEnd_ThrowNullPointerException() throws Exception  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted(ZipArchiveOutputStream.java:932)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd(ZipArchiveOutputStream.java:1348) */
            zipArchiveOutputStream.writeCentralDirectoryEnd();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeCentralDirectoryEnd()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCentralDirectoryEnd()}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCounted(byte[])
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.StreamCompressor#writeCounted(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.StreamCompressor#writeCounted(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: writeCounted(EOCD_SIG);
 *  */
    @Test(expected = IOException.class)
    public void testWriteCentralDirectoryEnd_ThrowIOException() throws Exception  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
            DataOutputStream raf = ((DataOutputStream) createInstance("java.io.DataOutputStream"));
            ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
            setField(out, "java.util.zip.ZipOutputStream", "closed", true);
            setField(raf, "java.io.FilterOutputStream", "out", out);
            setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
            
            zipArchiveOutputStream.writeCentralDirectoryEnd();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeCentralDirectoryEnd()
    
    @Test
    public void testWriteCentralDirectoryEnd1() throws Exception  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
            ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
            Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
            byte[] buf = {
                (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
                (byte) 0
            };
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1021);
            setField(raf, "java.io.ObjectOutputStream", "bout", bout);
            setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 1024 out of bounds for byte[9]]
                java.base/java.lang.System.arraycopy(Native Method)
                java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
                java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
                org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor.writeOut(StreamCompressor.java:321)
                org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(StreamCompressor.java:273)
                org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(StreamCompressor.java:269)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted(ZipArchiveOutputStream.java:932)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd(ZipArchiveOutputStream.java:1348) */
            zipArchiveOutputStream.writeCentralDirectoryEnd();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
        }
    }
    
    @Test
    public void testWriteCentralDirectoryEnd2() throws Exception  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
            ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
            Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
            byte[] hbuf = {(byte) 0};
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1073741824);
            setField(raf, "java.io.ObjectOutputStream", "bout", bout);
            setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
                java.base/java.io.Bits.putInt(Bits.java:99)
                java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
                java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
                java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
                java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
                org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor.writeOut(StreamCompressor.java:321)
                org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(StreamCompressor.java:273)
                org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(StreamCompressor.java:269)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted(ZipArchiveOutputStream.java:932)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd(ZipArchiveOutputStream.java:1348) */
            zipArchiveOutputStream.writeCentralDirectoryEnd();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
        }
    }
    
    @Test
    public void testWriteCentralDirectoryEnd3() throws Exception  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
            ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
            Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
            byte[] hbuf = {};
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1073741824);
            setField(raf, "java.io.ObjectOutputStream", "bout", bout);
            setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
                java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
                java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
                java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
                org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor.writeOut(StreamCompressor.java:321)
                org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(StreamCompressor.java:273)
                org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(StreamCompressor.java:269)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted(ZipArchiveOutputStream.java:932)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd(ZipArchiveOutputStream.java:1348) */
            zipArchiveOutputStream.writeCentralDirectoryEnd();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
        }
    }
    
    @Test
    public void testWriteCentralDirectoryEnd4() throws Exception  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$ScatterGatherBackingStoreCompressor");
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.StreamCompressor$ScatterGatherBackingStoreCompressor.writeOut(StreamCompressor.java:291)
                org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(StreamCompressor.java:273)
                org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(StreamCompressor.java:269)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted(ZipArchiveOutputStream.java:932)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd(ZipArchiveOutputStream.java:1348) */
            zipArchiveOutputStream.writeCentralDirectoryEnd();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
        }
    }
    
    @Test
    public void testWriteCentralDirectoryEnd5() throws Exception  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor.writeOut(StreamCompressor.java:337)
                org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(StreamCompressor.java:273)
                org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(StreamCompressor.java:269)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted(ZipArchiveOutputStream.java:932)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd(ZipArchiveOutputStream.java:1348) */
            zipArchiveOutputStream.writeCentralDirectoryEnd();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
        }
    }
    
    @Test
    public void testWriteCentralDirectoryEnd6() throws Exception  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
            ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
            Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
            byte[] buf = {
                (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
                (byte) 0
            };
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
            setField(raf, "java.io.ObjectOutputStream", "bout", bout);
            setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd(ZipArchiveOutputStream.java:1355) */
            zipArchiveOutputStream.writeCentralDirectoryEnd();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
        }
    }
    
    @Test
    public void testWriteCentralDirectoryEnd7() throws Exception  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
            ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
            Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1073740803);
            setField(raf, "java.io.ObjectOutputStream", "bout", bout);
            setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd] produces [java.lang.NullPointerException]
                java.base/java.lang.System.arraycopy(Native Method)
                java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
                java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
                org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor.writeOut(StreamCompressor.java:321)
                org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(StreamCompressor.java:273)
                org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(StreamCompressor.java:269)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted(ZipArchiveOutputStream.java:932)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd(ZipArchiveOutputStream.java:1348) */
            zipArchiveOutputStream.writeCentralDirectoryEnd();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.validateSizeInformation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method validateSizeInformation(org.apache.commons.compress.archivers.zip.Zip64Mode)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#validateSizeInformation(org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.executesCondition {@code (entry.entry.getCompressedSize() >= ZIP64_MAGIC): False}
 *  */
    @Test
    public void testValidateSizeInformation_EntryEntryGetCompressedSizeLessThanZIP64_MAGIC() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setSize(-9223372032559808512L);
        setField(entry1, "java.util.zip.ZipEntry", "csize", -9223372032559808512L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method validateSizeInformationMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("validateSizeInformation", zip64ModeType);
        validateSizeInformationMethod.setAccessible(true);
        java.lang.Object[] validateSizeInformationMethodArguments = new java.lang.Object[1];
        validateSizeInformationMethodArguments[0] = ((Object) null);
        validateSizeInformationMethod.invoke(zipArchiveOutputStream, validateSizeInformationMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#validateSizeInformation(org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.executesCondition {@code (entry.entry.getCompressedSize() >= ZIP64_MAGIC): True}
 * @utbot.executesCondition {@code (entry.entry.getCompressedSize() >= ZIP64_MAGIC): False}
 *  */
    @Test
    public void testValidateSizeInformation_EntryEntryGetCompressedSizeGreaterOrEqualZIP64_MAGIC() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setSize(-9223372032559808512L);
        setField(entry1, "java.util.zip.ZipEntry", "csize", 4294967295L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method validateSizeInformationMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("validateSizeInformation", zip64ModeType);
        validateSizeInformationMethod.setAccessible(true);
        java.lang.Object[] validateSizeInformationMethodArguments = new java.lang.Object[1];
        validateSizeInformationMethodArguments[0] = ((Object) null);
        validateSizeInformationMethod.invoke(zipArchiveOutputStream, validateSizeInformationMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method validateSizeInformation(org.apache.commons.compress.archivers.zip.Zip64Mode)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#validateSizeInformation(org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: entry.entry.getMethod() == STORED && channel == null
 *  */
    @Test
    public void testValidateSizeInformation_ThrowNullPointerException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.validateSizeInformation] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.validateSizeInformation(ZipArchiveOutputStream.java:812) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method validateSizeInformationMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("validateSizeInformation", zip64ModeType);
        validateSizeInformationMethod.setAccessible(true);
        java.lang.Object[] validateSizeInformationMethodArguments = new java.lang.Object[1];
        validateSizeInformationMethodArguments[0] = ((Object) null);
        try {
            validateSizeInformationMethod.invoke(zipArchiveOutputStream, validateSizeInformationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method validateSizeInformation(org.apache.commons.compress.archivers.zip.Zip64Mode)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#validateSizeInformation(org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.executesCondition {@code (entry.entry.getCrc() == ZipArchiveEntry.CRC_UNKNOWN): False}
 * @utbot.executesCondition {@code (entry.entry.getSize() >= ZIP64_MAGIC): True}
 * @utbot.executesCondition {@code (entry.entry.getCompressedSize() >= ZIP64_MAGIC): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getSize()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setCompressedSize(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getSize()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.Zip64RequiredException#getEntryTooBigMessage(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.throwsException {@link org.apache.commons.compress.archivers.zip.Zip64RequiredException} in: getEntryTooBigMessage
 *  */
    @Test(expected = Zip64RequiredException.class)
    public void testValidateSizeInformation_ThrowZip64RequiredException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setSize(4294967295L);
        entry1.setCrc(0L);
        setField(entry1, "java.util.zip.ZipEntry", "csize", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Zip64Mode zip64Mode = Zip64Mode.Never;
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method validateSizeInformationMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("validateSizeInformation", zip64ModeType);
        validateSizeInformationMethod.setAccessible(true);
        java.lang.Object[] validateSizeInformationMethodArguments = new java.lang.Object[1];
        validateSizeInformationMethodArguments[0] = zip64Mode;
        try {
            validateSizeInformationMethod.invoke(zipArchiveOutputStream, validateSizeInformationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#validateSizeInformation(org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.executesCondition {@code (entry.entry.getCrc() == ZipArchiveEntry.CRC_UNKNOWN): True}
 * @utbot.throwsException {@link java.util.zip.ZipException} when: entry.entry.getCrc() == ZipArchiveEntry.CRC_UNKNOWN
 *  */
    @Test(expected = ZipException.class)
    public void testValidateSizeInformation_ThrowZipException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setSize(0L);
        entry1.setCrc(-1L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method validateSizeInformationMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("validateSizeInformation", zip64ModeType);
        validateSizeInformationMethod.setAccessible(true);
        java.lang.Object[] validateSizeInformationMethodArguments = new java.lang.Object[1];
        validateSizeInformationMethodArguments[0] = ((Object) null);
        try {
            validateSizeInformationMethod.invoke(zipArchiveOutputStream, validateSizeInformationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for validateSizeInformation
    
    public void testValidateSizeInformation_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getGeneralPurposeBits
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGeneralPurposeBits(boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#getGeneralPurposeBits(boolean,boolean)}
 * @utbot.executesCondition {@code (b.useUTF8ForNames(useUTF8Flag || utfFallback);): False}
 * @utbot.executesCondition {@code (usesDataDescriptor): False}
 * @utbot.returnsFrom {@code return b;}
 *  */
    @Test
    public void testGetGeneralPurposeBits_BUseUTF8ForNames() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "useUTF8Flag", true);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method getGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("getGeneralPurposeBits", booleanType, booleanType);
        getGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] getGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        getGeneralPurposeBitsMethodArguments[0] = false;
        getGeneralPurposeBitsMethodArguments[1] = false;
        GeneralPurposeBit actual = ((GeneralPurposeBit) getGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, getGeneralPurposeBitsMethodArguments));
        
        GeneralPurposeBit expected = ((GeneralPurposeBit) createInstance("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        setField(expected, "org.apache.commons.compress.archivers.zip.GeneralPurposeBit", "languageEncodingFlag", true);
        
        // org.apache.commons.compress.archivers.zip.GeneralPurposeBit has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#getGeneralPurposeBits(boolean,boolean)}
 * @utbot.executesCondition {@code (b.useUTF8ForNames(useUTF8Flag || utfFallback);): True}
 * @utbot.executesCondition {@code (b.useUTF8ForNames(useUTF8Flag || utfFallback);): False}
 * @utbot.executesCondition {@code (usesDataDescriptor): False}
 * @utbot.returnsFrom {@code return b;}
 *  */
    @Test
    public void testGetGeneralPurposeBits_NotUsesDataDescriptor() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method getGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("getGeneralPurposeBits", booleanType, booleanType);
        getGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] getGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        getGeneralPurposeBitsMethodArguments[0] = false;
        getGeneralPurposeBitsMethodArguments[1] = false;
        GeneralPurposeBit actual = ((GeneralPurposeBit) getGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, getGeneralPurposeBitsMethodArguments));
        
        GeneralPurposeBit expected = ((GeneralPurposeBit) createInstance("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        
        // org.apache.commons.compress.archivers.zip.GeneralPurposeBit has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#getGeneralPurposeBits(boolean,boolean)}
 * @utbot.executesCondition {@code (b.useUTF8ForNames(useUTF8Flag || utfFallback);): True}
 * @utbot.executesCondition {@code (b.useUTF8ForNames(useUTF8Flag || utfFallback);): True}
 * @utbot.executesCondition {@code (usesDataDescriptor): False}
 * @utbot.returnsFrom {@code return b;}
 *  */
    @Test
    public void testGetGeneralPurposeBits_BUseUTF8ForNames_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method getGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("getGeneralPurposeBits", booleanType, booleanType);
        getGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] getGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        getGeneralPurposeBitsMethodArguments[0] = true;
        getGeneralPurposeBitsMethodArguments[1] = false;
        GeneralPurposeBit actual = ((GeneralPurposeBit) getGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, getGeneralPurposeBitsMethodArguments));
        
        GeneralPurposeBit expected = ((GeneralPurposeBit) createInstance("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        setField(expected, "org.apache.commons.compress.archivers.zip.GeneralPurposeBit", "languageEncodingFlag", true);
        
        // org.apache.commons.compress.archivers.zip.GeneralPurposeBit has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#getGeneralPurposeBits(boolean,boolean)}
 * @utbot.executesCondition {@code (b.useUTF8ForNames(useUTF8Flag || utfFallback);): True}
 * @utbot.executesCondition {@code (b.useUTF8ForNames(useUTF8Flag || utfFallback);): False}
 * @utbot.executesCondition {@code (usesDataDescriptor): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.GeneralPurposeBit#useDataDescriptor(boolean)}
 * @utbot.returnsFrom {@code return b;}
 *  */
    @Test
    public void testGetGeneralPurposeBits_UsesDataDescriptor() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method getGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("getGeneralPurposeBits", booleanType, booleanType);
        getGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] getGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        getGeneralPurposeBitsMethodArguments[0] = false;
        getGeneralPurposeBitsMethodArguments[1] = true;
        GeneralPurposeBit actual = ((GeneralPurposeBit) getGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, getGeneralPurposeBitsMethodArguments));
        
        GeneralPurposeBit expected = ((GeneralPurposeBit) createInstance("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        setField(expected, "org.apache.commons.compress.archivers.zip.GeneralPurposeBit", "dataDescriptorFlag", true);
        
        // org.apache.commons.compress.archivers.zip.GeneralPurposeBit has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEffectiveZip64Mode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEffectiveZip64Mode(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#getEffectiveZip64Mode(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (zip64Mode != Zip64Mode.AsNeeded): False}
 * @utbot.executesCondition {@code (channel != null): True}
 * @utbot.returnsFrom {@code return zip64Mode;}
 *  */
    @Test
    public void testGetEffectiveZip64Mode_ChannelNotEqualsNull() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        Zip64Mode zip64Mode = Zip64Mode.AsNeeded;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Method getEffectiveZip64ModeMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("getEffectiveZip64Mode", zipArchiveEntryType);
        getEffectiveZip64ModeMethod.setAccessible(true);
        java.lang.Object[] getEffectiveZip64ModeMethodArguments = new java.lang.Object[1];
        getEffectiveZip64ModeMethodArguments[0] = ((Object) null);
        Zip64Mode actual = ((Zip64Mode) getEffectiveZip64ModeMethod.invoke(zipArchiveOutputStream, getEffectiveZip64ModeMethodArguments));
        
        assertEquals(zip64Mode, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEffectiveZip64Mode(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#getEffectiveZip64Mode(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (zip64Mode != Zip64Mode.AsNeeded): True}
 * @utbot.returnsFrom {@code return zip64Mode;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return zip64Mode;
 *  */
    @Test
    public void testGetEffectiveZip64Mode_ThrowNullPointerException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Zip64Mode zip64Mode = Zip64Mode.AsNeeded;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEffectiveZip64Mode] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEffectiveZip64Mode(ZipArchiveOutputStream.java:1574) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Method getEffectiveZip64ModeMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("getEffectiveZip64Mode", zipArchiveEntryType);
        getEffectiveZip64ModeMethod.setAccessible(true);
        java.lang.Object[] getEffectiveZip64ModeMethodArguments = new java.lang.Object[1];
        getEffectiveZip64ModeMethodArguments[0] = ((Object) null);
        try {
            getEffectiveZip64ModeMethod.invoke(zipArchiveOutputStream, getEffectiveZip64ModeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getEffectiveZip64Mode
    
    public void testGetEffectiveZip64Mode_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.copyFromZipInputStream
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method copyFromZipInputStream(java.io.InputStream)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#copyFromZipInputStream(java.io.InputStream)}
 * @utbot.executesCondition {@code (entry == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: entry == null
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCopyFromZipInputStream_ThrowIllegalStateException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class inputStreamType = Class.forName("java.io.InputStream");
        Method copyFromZipInputStreamMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("copyFromZipInputStream", inputStreamType);
        copyFromZipInputStreamMethod.setAccessible(true);
        java.lang.Object[] copyFromZipInputStreamMethodArguments = new java.lang.Object[1];
        copyFromZipInputStreamMethodArguments[0] = ((Object) null);
        try {
            copyFromZipInputStreamMethod.invoke(zipArchiveOutputStream, copyFromZipInputStreamMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createLocalFileHeader
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.nio.ByteBuffer, boolean, boolean, long)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#createLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,java.nio.ByteBuffer,boolean,boolean,long)}
 * @utbot.executesCondition {@code (oldAlignmentEx != null): False}
 * @utbot.executesCondition {@code (alignment <= 0): True}
 * @utbot.executesCondition {@code (oldAlignmentEx != null): False}
 * @utbot.executesCondition {@code (alignment > 1): False}
 * @utbot.executesCondition {@code (oldAlignmentEx != null): False}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final byte[] buf = new byte[len];
 *  */
    @Test
    public void testCreateLocalFileHeader_ThrowNegativeArraySizeException() throws Throwable  {
        ZipShort prevID = ResourceAlignmentExtraField.ID;
        try {
            ZipShort id = new ZipShort(41246);
            Class resourceAlignmentExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField");
            setStaticField(resourceAlignmentExtraFieldClazz, "ID", id);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
            byte[] extra = {};
            jarArchiveEntry.setExtra(extra);
            Object directByteBufferR = createInstance("java.nio.DirectByteBufferR");
            setField(directByteBufferR, "java.nio.Buffer", "position", 2147483616);
            setField(directByteBufferR, "java.nio.Buffer", "limit", 2147483584);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createLocalFileHeader] produces [java.lang.NegativeArraySizeException: Less than zero] */
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class jarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Class directByteBufferRType = Class.forName("java.nio.ByteBuffer");
            Class booleanType = boolean.class;
            Class longType = long.class;
            Method createLocalFileHeaderMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("createLocalFileHeader", jarArchiveEntryType, directByteBufferRType, booleanType, booleanType, longType);
            createLocalFileHeaderMethod.setAccessible(true);
            java.lang.Object[] createLocalFileHeaderMethodArguments = new java.lang.Object[5];
            createLocalFileHeaderMethodArguments[0] = jarArchiveEntry;
            createLocalFileHeaderMethodArguments[1] = directByteBufferR;
            createLocalFileHeaderMethodArguments[2] = false;
            createLocalFileHeaderMethodArguments[3] = false;
            createLocalFileHeaderMethodArguments[4] = -255L;
            try {
                createLocalFileHeaderMethod.invoke(zipArchiveOutputStream, createLocalFileHeaderMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ResourceAlignmentExtraField.class, "ID", prevID);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#createLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,java.nio.ByteBuffer,boolean,boolean,long)}
 * @utbot.executesCondition {@code (oldAlignmentEx != null): False}
 * @utbot.executesCondition {@code (alignment <= 0): False}
 * @utbot.executesCondition {@code (alignment > 1): False}
 * @utbot.executesCondition {@code (oldAlignmentEx != null): False}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final byte[] buf = new byte[len];
 *  */
    @Test
    public void testCreateLocalFileHeader_ThrowNegativeArraySizeException_1() throws Throwable  {
        ZipShort prevID = ResourceAlignmentExtraField.ID;
        Class zipArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        byte[] prevEMPTY = ((byte[]) getStaticFieldValue(zipArchiveEntryClazz, "EMPTY"));
        try {
            ZipShort id = new ZipShort(41246);
            Class resourceAlignmentExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField");
            setStaticField(resourceAlignmentExtraFieldClazz, "ID", id);
            byte[] empty = {};
            setStaticField(zipArchiveEntryClazz, "EMPTY", empty);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
            jarArchiveEntry.setAlignment(1);
            org.apache.commons.compress.archivers.zip.ZipExtraField[] extraFields = {};
            jarArchiveEntry.setExtraFields(extraFields);
            Object directByteBufferR = createInstance("java.nio.DirectByteBufferR");
            setField(directByteBufferR, "java.nio.Buffer", "position", 8223);
            setField(directByteBufferR, "java.nio.Buffer", "limit", -2147475454);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createLocalFileHeader] produces [java.lang.NegativeArraySizeException: Less than zero] */
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class directByteBufferRType = Class.forName("java.nio.ByteBuffer");
            Class booleanType = boolean.class;
            Class longType = long.class;
            Method createLocalFileHeaderMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("createLocalFileHeader", zipArchiveEntryClazz, directByteBufferRType, booleanType, booleanType, longType);
            createLocalFileHeaderMethod.setAccessible(true);
            java.lang.Object[] createLocalFileHeaderMethodArguments = new java.lang.Object[5];
            createLocalFileHeaderMethodArguments[0] = jarArchiveEntry;
            createLocalFileHeaderMethodArguments[1] = directByteBufferR;
            createLocalFileHeaderMethodArguments[2] = false;
            createLocalFileHeaderMethodArguments[3] = false;
            createLocalFileHeaderMethodArguments[4] = -255L;
            try {
                createLocalFileHeaderMethod.invoke(zipArchiveOutputStream, createLocalFileHeaderMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ResourceAlignmentExtraField.class, "ID", prevID);
            setStaticField(ZipArchiveEntry.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#createLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,java.nio.ByteBuffer,boolean,boolean,long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getExtraField(org.apache.commons.compress.archivers.zip.ZipShort)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (ResourceAlignmentExtraField) ze.getExtraField(ResourceAlignmentExtraField.ID)
 *  */
    @Test
    public void testCreateLocalFileHeader_ThrowNullPointerException() throws Throwable  {
        ZipShort prevID = ResourceAlignmentExtraField.ID;
        try {
            ZipShort id = new ZipShort(41246);
            Class resourceAlignmentExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField");
            setStaticField(resourceAlignmentExtraFieldClazz, "ID", id);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createLocalFileHeader] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createLocalFileHeader(ZipArchiveOutputStream.java:1044) */
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Class byteBufferType = Class.forName("java.nio.ByteBuffer");
            Class booleanType = boolean.class;
            Class longType = long.class;
            Method createLocalFileHeaderMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("createLocalFileHeader", zipArchiveEntryType, byteBufferType, booleanType, booleanType, longType);
            createLocalFileHeaderMethod.setAccessible(true);
            java.lang.Object[] createLocalFileHeaderMethodArguments = new java.lang.Object[5];
            createLocalFileHeaderMethodArguments[0] = ((Object) null);
            createLocalFileHeaderMethodArguments[1] = ((Object) null);
            createLocalFileHeaderMethodArguments[2] = false;
            createLocalFileHeaderMethodArguments[3] = false;
            createLocalFileHeaderMethodArguments[4] = -255L;
            try {
                createLocalFileHeaderMethod.invoke(zipArchiveOutputStream, createLocalFileHeaderMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ResourceAlignmentExtraField.class, "ID", prevID);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#createLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,java.nio.ByteBuffer,boolean,boolean,long)}
 * @utbot.executesCondition {@code (oldAlignmentEx != null): False}
 * @utbot.executesCondition {@code (alignment <= 0): True}
 * @utbot.executesCondition {@code (oldAlignmentEx != null): False}
 * @utbot.executesCondition {@code (alignment > 1): False}
 * @utbot.executesCondition {@code (oldAlignmentEx != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int nameLen = name.limit() - name.position();
 *  */
    @Test
    public void testCreateLocalFileHeader_ThrowNullPointerException_1() throws Throwable  {
        ZipShort prevID = ResourceAlignmentExtraField.ID;
        try {
            ZipShort id = new ZipShort(41246);
            Class resourceAlignmentExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField");
            setStaticField(resourceAlignmentExtraFieldClazz, "ID", id);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            byte[] extra = {(byte) 0};
            zipArchiveEntry.setExtra(extra);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createLocalFileHeader] produces [java.lang.NullPointerException] */
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Class byteBufferType = Class.forName("java.nio.ByteBuffer");
            Class booleanType = boolean.class;
            Class longType = long.class;
            Method createLocalFileHeaderMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("createLocalFileHeader", zipArchiveEntryType, byteBufferType, booleanType, booleanType, longType);
            createLocalFileHeaderMethod.setAccessible(true);
            java.lang.Object[] createLocalFileHeaderMethodArguments = new java.lang.Object[5];
            createLocalFileHeaderMethodArguments[0] = zipArchiveEntry;
            createLocalFileHeaderMethodArguments[1] = ((Object) null);
            createLocalFileHeaderMethodArguments[2] = false;
            createLocalFileHeaderMethodArguments[3] = false;
            createLocalFileHeaderMethodArguments[4] = -255L;
            try {
                createLocalFileHeaderMethod.invoke(zipArchiveOutputStream, createLocalFileHeaderMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ResourceAlignmentExtraField.class, "ID", prevID);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.nio.ByteBuffer, boolean, boolean, long)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#createLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,java.nio.ByteBuffer,boolean,boolean,long)}
 * @utbot.executesCondition {@code (oldAlignmentEx != null): False}
 * @utbot.executesCondition {@code (alignment <= 0): False}
 * @utbot.executesCondition {@code (alignment > 1): True}
 * @utbot.executesCondition {@code (ze.addExtraField(new ResourceAlignmentExtraField(alignment, oldAlignmentEx != null && oldAlignmentEx.allowMethodChange(), padding));): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getExtraField(org.apache.commons.compress.archivers.zip.ZipShort)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getAlignment()}
 * @utbot.invokes {@link java.nio.ByteBuffer#limit()}
 * @utbot.invokes {@link java.nio.ByteBuffer#position()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getLocalFileDataExtra()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: ze.addExtraField(new ResourceAlignmentExtraField(alignment, oldAlignmentEx != null && oldAlignmentEx.allowMethodChange(), padding));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateLocalFileHeader_ThrowIllegalArgumentException() throws Throwable  {
        ZipShort prevID = ResourceAlignmentExtraField.ID;
        try {
            ZipShort id = new ZipShort(41246);
            Class resourceAlignmentExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField");
            setStaticField(resourceAlignmentExtraFieldClazz, "ID", id);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
            jarArchiveEntry.setAlignment(32768);
            byte[] extra = {(byte) 0};
            jarArchiveEntry.setExtra(extra);
            Object directByteBufferR = createInstance("java.nio.DirectByteBufferR");
            
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class jarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Class directByteBufferRType = Class.forName("java.nio.ByteBuffer");
            Class booleanType = boolean.class;
            Class longType = long.class;
            Method createLocalFileHeaderMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("createLocalFileHeader", jarArchiveEntryType, directByteBufferRType, booleanType, booleanType, longType);
            createLocalFileHeaderMethod.setAccessible(true);
            java.lang.Object[] createLocalFileHeaderMethodArguments = new java.lang.Object[5];
            createLocalFileHeaderMethodArguments[0] = jarArchiveEntry;
            createLocalFileHeaderMethodArguments[1] = directByteBufferR;
            createLocalFileHeaderMethodArguments[2] = false;
            createLocalFileHeaderMethodArguments[3] = false;
            createLocalFileHeaderMethodArguments[4] = -255L;
            try {
                createLocalFileHeaderMethod.invoke(zipArchiveOutputStream, createLocalFileHeaderMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ResourceAlignmentExtraField.class, "ID", prevID);
        }
    }
    ///endregion
    
    ///region Errors report for createLocalFileHeader
    
    public void testCreateLocalFileHeader_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Concrete execution failed
        
        // 4 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.versionNeededToExtractMethod
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method versionNeededToExtractMethod(int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#versionNeededToExtractMethod(int)}
 * @utbot.executesCondition {@code (zipMethod == DEFLATED): False}
 * @utbot.returnsFrom {@code return zipMethod == DEFLATED ? DEFLATE_MIN_VERSION : INITIAL_VERSION;}
 *  */
    @Test
    public void testVersionNeededToExtractMethod_ZipMethodNotEqualsDEFLATED() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Method versionNeededToExtractMethodMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("versionNeededToExtractMethod", intType);
        versionNeededToExtractMethodMethod.setAccessible(true);
        java.lang.Object[] versionNeededToExtractMethodMethodArguments = new java.lang.Object[1];
        versionNeededToExtractMethodMethodArguments[0] = -254;
        int actual = ((Integer) versionNeededToExtractMethodMethod.invoke(zipArchiveOutputStream, versionNeededToExtractMethodMethodArguments));
        
        assertEquals(10, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#versionNeededToExtractMethod(int)}
 * @utbot.executesCondition {@code (zipMethod == DEFLATED): True}
 * @utbot.returnsFrom {@code return zipMethod == DEFLATED ? DEFLATE_MIN_VERSION : INITIAL_VERSION;}
 *  */
    @Test
    public void testVersionNeededToExtractMethod_ZipMethodEqualsDEFLATED() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Method versionNeededToExtractMethodMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("versionNeededToExtractMethod", intType);
        versionNeededToExtractMethodMethod.setAccessible(true);
        java.lang.Object[] versionNeededToExtractMethodMethodArguments = new java.lang.Object[1];
        versionNeededToExtractMethodMethodArguments[0] = 8;
        int actual = ((Integer) versionNeededToExtractMethodMethod.invoke(zipArchiveOutputStream, versionNeededToExtractMethodMethodArguments));
        
        assertEquals(20, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.addUnicodeExtraFields
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, boolean, java.nio.ByteBuffer)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#addUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,boolean,java.nio.ByteBuffer)}
 *  */
    @Test
    public void testAddUnicodeExtraFields() throws Exception  {
        ZipArchiveOutputStream.UnicodeExtraFieldPolicy prevALWAYS = ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        try {
            ZipArchiveOutputStream.UnicodeExtraFieldPolicy always = ((ZipArchiveOutputStream.UnicodeExtraFieldPolicy) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"));
            String name = "always";
            setField(always, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "name", name);
            Class unicodeExtraFieldPolicyClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy");
            setStaticField(unicodeExtraFieldPolicyClazz, "ALWAYS", always);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Class booleanType = boolean.class;
            Class byteBufferType = Class.forName("java.nio.ByteBuffer");
            Method addUnicodeExtraFieldsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("addUnicodeExtraFields", zipArchiveEntryType, booleanType, byteBufferType);
            addUnicodeExtraFieldsMethod.setAccessible(true);
            java.lang.Object[] addUnicodeExtraFieldsMethodArguments = new java.lang.Object[3];
            addUnicodeExtraFieldsMethodArguments[0] = zipArchiveEntry;
            addUnicodeExtraFieldsMethodArguments[1] = true;
            addUnicodeExtraFieldsMethodArguments[2] = ((Object) null);
            addUnicodeExtraFieldsMethod.invoke(zipArchiveOutputStream, addUnicodeExtraFieldsMethodArguments);
        } finally {
            setStaticField(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.class, "ALWAYS", prevALWAYS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#addUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,boolean,java.nio.ByteBuffer)}
 *  */
    @Test
    public void testAddUnicodeExtraFields_1() throws Exception  {
        ZipArchiveOutputStream.UnicodeExtraFieldPolicy prevALWAYS = ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        try {
            ZipArchiveOutputStream.UnicodeExtraFieldPolicy always = ((ZipArchiveOutputStream.UnicodeExtraFieldPolicy) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"));
            String name = "always";
            setField(always, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "name", name);
            Class unicodeExtraFieldPolicyClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy");
            setStaticField(unicodeExtraFieldPolicyClazz, "ALWAYS", always);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            String comment = "";
            zipArchiveEntry.setComment(comment);
            
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Class booleanType = boolean.class;
            Class byteBufferType = Class.forName("java.nio.ByteBuffer");
            Method addUnicodeExtraFieldsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("addUnicodeExtraFields", zipArchiveEntryType, booleanType, byteBufferType);
            addUnicodeExtraFieldsMethod.setAccessible(true);
            java.lang.Object[] addUnicodeExtraFieldsMethodArguments = new java.lang.Object[3];
            addUnicodeExtraFieldsMethodArguments[0] = zipArchiveEntry;
            addUnicodeExtraFieldsMethodArguments[1] = true;
            addUnicodeExtraFieldsMethodArguments[2] = ((Object) null);
            addUnicodeExtraFieldsMethod.invoke(zipArchiveOutputStream, addUnicodeExtraFieldsMethodArguments);
        } finally {
            setStaticField(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.class, "ALWAYS", prevALWAYS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#addUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,boolean,java.nio.ByteBuffer)}
 * @utbot.executesCondition {@code (createUnicodeExtraFields == UnicodeExtraFieldPolicy.ALWAYS): False}
 * @utbot.executesCondition {@code (!commentEncodable): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipEncoding#canEncode(java.lang.String)}
 *  */
    @Test
    public void testAddUnicodeExtraFields_CommentEncodable() throws Exception  {
        ZipArchiveOutputStream.UnicodeExtraFieldPolicy prevALWAYS = ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        try {
            ZipArchiveOutputStream.UnicodeExtraFieldPolicy always = ((ZipArchiveOutputStream.UnicodeExtraFieldPolicy) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"));
            String name = "always";
            setField(always, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "name", name);
            Class unicodeExtraFieldPolicyClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy");
            setStaticField(unicodeExtraFieldPolicyClazz, "ALWAYS", always);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            FallbackZipEncoding zipEncoding = ((FallbackZipEncoding) createInstance("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zipEncoding", zipEncoding);
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            String comment = "";
            zipArchiveEntry.setComment(comment);
            
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Class booleanType = boolean.class;
            Class byteBufferType = Class.forName("java.nio.ByteBuffer");
            Method addUnicodeExtraFieldsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("addUnicodeExtraFields", zipArchiveEntryType, booleanType, byteBufferType);
            addUnicodeExtraFieldsMethod.setAccessible(true);
            java.lang.Object[] addUnicodeExtraFieldsMethodArguments = new java.lang.Object[3];
            addUnicodeExtraFieldsMethodArguments[0] = zipArchiveEntry;
            addUnicodeExtraFieldsMethodArguments[1] = true;
            addUnicodeExtraFieldsMethodArguments[2] = ((Object) null);
            addUnicodeExtraFieldsMethod.invoke(zipArchiveOutputStream, addUnicodeExtraFieldsMethodArguments);
        } finally {
            setStaticField(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.class, "ALWAYS", prevALWAYS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, boolean, java.nio.ByteBuffer)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#addUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,boolean,java.nio.ByteBuffer)}
 * @utbot.executesCondition {@code (createUnicodeExtraFields == UnicodeExtraFieldPolicy.ALWAYS): False}
 * @utbot.executesCondition {@code (!encodable): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getComment()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String comm = ze.getComment();
 *  */
    @Test
    public void testAddUnicodeExtraFields_ThrowNullPointerException() throws Throwable  {
        ZipArchiveOutputStream.UnicodeExtraFieldPolicy prevALWAYS = ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        try {
            ZipArchiveOutputStream.UnicodeExtraFieldPolicy always = ((ZipArchiveOutputStream.UnicodeExtraFieldPolicy) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"));
            String name = "always";
            setField(always, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "name", name);
            Class unicodeExtraFieldPolicyClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy");
            setStaticField(unicodeExtraFieldPolicyClazz, "ALWAYS", always);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.addUnicodeExtraFields] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.addUnicodeExtraFields(ZipArchiveOutputStream.java:1147) */
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Class booleanType = boolean.class;
            Class byteBufferType = Class.forName("java.nio.ByteBuffer");
            Method addUnicodeExtraFieldsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("addUnicodeExtraFields", zipArchiveEntryType, booleanType, byteBufferType);
            addUnicodeExtraFieldsMethod.setAccessible(true);
            java.lang.Object[] addUnicodeExtraFieldsMethodArguments = new java.lang.Object[3];
            addUnicodeExtraFieldsMethodArguments[0] = ((Object) null);
            addUnicodeExtraFieldsMethodArguments[1] = true;
            addUnicodeExtraFieldsMethodArguments[2] = ((Object) null);
            try {
                addUnicodeExtraFieldsMethod.invoke(zipArchiveOutputStream, addUnicodeExtraFieldsMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.class, "ALWAYS", prevALWAYS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#addUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,boolean,java.nio.ByteBuffer)}
 * @utbot.executesCondition {@code (createUnicodeExtraFields == UnicodeExtraFieldPolicy.ALWAYS): False}
 * @utbot.executesCondition {@code (!encodable): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ze.addExtraField(new UnicodePathExtraField(ze.getName(), name.array(), name.arrayOffset(), name.limit() - name.position()));
 *  */
    @Test
    public void testAddUnicodeExtraFields_ThrowNullPointerException_2() throws Throwable  {
        ZipArchiveOutputStream.UnicodeExtraFieldPolicy prevALWAYS = ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        try {
            ZipArchiveOutputStream.UnicodeExtraFieldPolicy always = ((ZipArchiveOutputStream.UnicodeExtraFieldPolicy) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"));
            String name = "always";
            setField(always, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "name", name);
            Class unicodeExtraFieldPolicyClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy");
            setStaticField(unicodeExtraFieldPolicyClazz, "ALWAYS", always);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.addUnicodeExtraFields] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.addUnicodeExtraFields(ZipArchiveOutputStream.java:1140) */
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Class booleanType = boolean.class;
            Class byteBufferType = Class.forName("java.nio.ByteBuffer");
            Method addUnicodeExtraFieldsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("addUnicodeExtraFields", zipArchiveEntryType, booleanType, byteBufferType);
            addUnicodeExtraFieldsMethod.setAccessible(true);
            java.lang.Object[] addUnicodeExtraFieldsMethodArguments = new java.lang.Object[3];
            addUnicodeExtraFieldsMethodArguments[0] = ((Object) null);
            addUnicodeExtraFieldsMethodArguments[1] = false;
            addUnicodeExtraFieldsMethodArguments[2] = ((Object) null);
            try {
                addUnicodeExtraFieldsMethod.invoke(zipArchiveOutputStream, addUnicodeExtraFieldsMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.class, "ALWAYS", prevALWAYS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#addUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,boolean,java.nio.ByteBuffer)}
 * @utbot.executesCondition {@code (createUnicodeExtraFields == UnicodeExtraFieldPolicy.ALWAYS): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ze.addExtraField(new UnicodePathExtraField(ze.getName(), name.array(), name.arrayOffset(), name.limit() - name.position()));
 *  */
    @Test
    public void testAddUnicodeExtraFields_ThrowNullPointerException_1() throws Throwable  {
        ZipArchiveOutputStream.UnicodeExtraFieldPolicy prevALWAYS = ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        try {
            ZipArchiveOutputStream.UnicodeExtraFieldPolicy always = ((ZipArchiveOutputStream.UnicodeExtraFieldPolicy) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"));
            String name = "";
            setField(always, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "name", name);
            Class unicodeExtraFieldPolicyClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy");
            setStaticField(unicodeExtraFieldPolicyClazz, "ALWAYS", always);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            zipArchiveOutputStream.setCreateUnicodeExtraFields(always);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.addUnicodeExtraFields] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.addUnicodeExtraFields(ZipArchiveOutputStream.java:1140) */
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Class booleanType = boolean.class;
            Class byteBufferType = Class.forName("java.nio.ByteBuffer");
            Method addUnicodeExtraFieldsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("addUnicodeExtraFields", zipArchiveEntryType, booleanType, byteBufferType);
            addUnicodeExtraFieldsMethod.setAccessible(true);
            java.lang.Object[] addUnicodeExtraFieldsMethodArguments = new java.lang.Object[3];
            addUnicodeExtraFieldsMethodArguments[0] = ((Object) null);
            addUnicodeExtraFieldsMethodArguments[1] = false;
            addUnicodeExtraFieldsMethodArguments[2] = ((Object) null);
            try {
                addUnicodeExtraFieldsMethod.invoke(zipArchiveOutputStream, addUnicodeExtraFieldsMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.class, "ALWAYS", prevALWAYS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#addUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,boolean,java.nio.ByteBuffer)}
 * @utbot.executesCondition {@code (createUnicodeExtraFields == UnicodeExtraFieldPolicy.ALWAYS): False}
 * @utbot.executesCondition {@code (!encodable): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: name.array()
 *  */
    @Test
    public void testAddUnicodeExtraFields_ThrowNullPointerException_3() throws Throwable  {
        ZipArchiveOutputStream.UnicodeExtraFieldPolicy prevALWAYS = ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        try {
            ZipArchiveOutputStream.UnicodeExtraFieldPolicy always = ((ZipArchiveOutputStream.UnicodeExtraFieldPolicy) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"));
            String name = "always";
            setField(always, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "name", name);
            Class unicodeExtraFieldPolicyClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy");
            setStaticField(unicodeExtraFieldPolicyClazz, "ALWAYS", always);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            String name1 = "";
            setField(zipArchiveEntry, "java.util.zip.ZipEntry", "name", name1);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.addUnicodeExtraFields] produces [java.lang.NullPointerException] */
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Class booleanType = boolean.class;
            Class byteBufferType = Class.forName("java.nio.ByteBuffer");
            Method addUnicodeExtraFieldsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("addUnicodeExtraFields", zipArchiveEntryType, booleanType, byteBufferType);
            addUnicodeExtraFieldsMethod.setAccessible(true);
            java.lang.Object[] addUnicodeExtraFieldsMethodArguments = new java.lang.Object[3];
            addUnicodeExtraFieldsMethodArguments[0] = zipArchiveEntry;
            addUnicodeExtraFieldsMethodArguments[1] = false;
            addUnicodeExtraFieldsMethodArguments[2] = ((Object) null);
            try {
                addUnicodeExtraFieldsMethod.invoke(zipArchiveOutputStream, addUnicodeExtraFieldsMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.class, "ALWAYS", prevALWAYS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#addUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,boolean,java.nio.ByteBuffer)}
 * @utbot.executesCondition {@code (createUnicodeExtraFields == UnicodeExtraFieldPolicy.ALWAYS): False}
 * @utbot.executesCondition {@code (!encodable): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getComment()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipEncoding#canEncode(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean commentEncodable = zipEncoding.canEncode(comm);
 *  */
    @Test
    public void testAddUnicodeExtraFields_ThrowNullPointerException_4() throws Throwable  {
        ZipArchiveOutputStream.UnicodeExtraFieldPolicy prevALWAYS = ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        try {
            ZipArchiveOutputStream.UnicodeExtraFieldPolicy always = ((ZipArchiveOutputStream.UnicodeExtraFieldPolicy) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"));
            String name = "always";
            setField(always, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "name", name);
            Class unicodeExtraFieldPolicyClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy");
            setStaticField(unicodeExtraFieldPolicyClazz, "ALWAYS", always);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            String comment = "";
            zipArchiveEntry.setComment(comment);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.addUnicodeExtraFields] produces [java.lang.NullPointerException] */
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Class booleanType = boolean.class;
            Class byteBufferType = Class.forName("java.nio.ByteBuffer");
            Method addUnicodeExtraFieldsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("addUnicodeExtraFields", zipArchiveEntryType, booleanType, byteBufferType);
            addUnicodeExtraFieldsMethod.setAccessible(true);
            java.lang.Object[] addUnicodeExtraFieldsMethodArguments = new java.lang.Object[3];
            addUnicodeExtraFieldsMethodArguments[0] = zipArchiveEntry;
            addUnicodeExtraFieldsMethodArguments[1] = true;
            addUnicodeExtraFieldsMethodArguments[2] = ((Object) null);
            try {
                addUnicodeExtraFieldsMethod.invoke(zipArchiveOutputStream, addUnicodeExtraFieldsMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.class, "ALWAYS", prevALWAYS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, boolean, java.nio.ByteBuffer)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#addUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,boolean,java.nio.ByteBuffer)}
 * @utbot.executesCondition {@code (createUnicodeExtraFields == UnicodeExtraFieldPolicy.ALWAYS): False}
 * @utbot.executesCondition {@code (!encodable): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getName()}
 * @utbot.invokes {@link java.nio.ByteBuffer#array()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: name.array()
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testAddUnicodeExtraFields_ThrowUnsupportedOperationException() throws Throwable  {
        ZipArchiveOutputStream.UnicodeExtraFieldPolicy prevALWAYS = ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        try {
            ZipArchiveOutputStream.UnicodeExtraFieldPolicy always = ((ZipArchiveOutputStream.UnicodeExtraFieldPolicy) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"));
            String name = "always";
            setField(always, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "name", name);
            Class unicodeExtraFieldPolicyClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy");
            setStaticField(unicodeExtraFieldPolicyClazz, "ALWAYS", always);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            Object directByteBufferR = createInstance("java.nio.DirectByteBufferR");
            
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Class booleanType = boolean.class;
            Class directByteBufferRType = Class.forName("java.nio.ByteBuffer");
            Method addUnicodeExtraFieldsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("addUnicodeExtraFields", zipArchiveEntryType, booleanType, directByteBufferRType);
            addUnicodeExtraFieldsMethod.setAccessible(true);
            java.lang.Object[] addUnicodeExtraFieldsMethodArguments = new java.lang.Object[3];
            addUnicodeExtraFieldsMethodArguments[0] = zipArchiveEntry;
            addUnicodeExtraFieldsMethodArguments[1] = false;
            addUnicodeExtraFieldsMethodArguments[2] = directByteBufferR;
            try {
                addUnicodeExtraFieldsMethod.invoke(zipArchiveOutputStream, addUnicodeExtraFieldsMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.class, "ALWAYS", prevALWAYS);
        }
    }
    ///endregion
    
    ///region Errors report for addUnicodeExtraFields
    
    public void testAddUnicodeExtraFields_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Concrete execution failed
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setCreateUnicodeExtraFields
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCreateUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#setCreateUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy)}
 *  */
    @Test
    public void testSetCreateUnicodeExtraFields() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        zipArchiveOutputStream.setCreateUnicodeExtraFields(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final byte[] centralFileHeader = createCentralFileHeader(ze);
 *  */
    @Test
    public void testWriteCentralFileHeader_ThrowNullPointerException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createCentralFileHeader(ZipArchiveOutputStream.java:1200)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader(ZipArchiveOutputStream.java:1194) */
        zipArchiveOutputStream.writeCentralFileHeader(null);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#hasZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final byte[] centralFileHeader = createCentralFileHeader(ze);
 *  */
    @Test
    public void testWriteCentralFileHeader_ThrowNullPointerException_1() throws Exception  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            LinkedHashMap metaData = new LinkedHashMap();
            metaData.put(null, null);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "metaData", metaData);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.hasZip64Extra(ZipArchiveOutputStream.java:1559)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createCentralFileHeader(ZipArchiveOutputStream.java:1201)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader(ZipArchiveOutputStream.java:1194) */
            zipArchiveOutputStream.writeCentralFileHeader(null);
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link org.apache.commons.compress.archivers.zip.Zip64RequiredException} in: final byte[] centralFileHeader = createCentralFileHeader(ze);
 *  */
    @Test(expected = Zip64RequiredException.class)
    public void testWriteCentralFileHeader_ThrowZip64RequiredException() throws Exception  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            LinkedHashMap metaData = new LinkedHashMap();
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "metaData", metaData);
            Zip64Mode zip64Mode = Zip64Mode.Never;
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
            JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
            jarArchiveEntry.setSize(4294967295L);
            org.apache.commons.compress.archivers.zip.ZipExtraField[] extraFields = {};
            jarArchiveEntry.setExtraFields(extraFields);
            setField(jarArchiveEntry, "java.util.zip.ZipEntry", "csize", -9223372032559808512L);
            
            zipArchiveOutputStream.writeCentralFileHeader(jarArchiveEntry);
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link org.apache.commons.compress.archivers.zip.Zip64RequiredException} in: final byte[] centralFileHeader = createCentralFileHeader(ze);
 *  */
    @Test(expected = Zip64RequiredException.class)
    public void testWriteCentralFileHeader_ThrowZip64RequiredException_1() throws Throwable  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            LinkedHashMap metaData = new LinkedHashMap();
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "metaData", metaData);
            Zip64Mode zip64Mode = Zip64Mode.Never;
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
            Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
            (((ZipArchiveEntry) entry)).setSize(4294967296L);
            setField(entry, "java.util.zip.ZipEntry", "csize", -9223372032559808512L);
            
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class entryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Method writeCentralFileHeaderMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeCentralFileHeader", entryType);
            writeCentralFileHeaderMethod.setAccessible(true);
            java.lang.Object[] writeCentralFileHeaderMethodArguments = new java.lang.Object[1];
            writeCentralFileHeaderMethodArguments[0] = entry;
            try {
                writeCentralFileHeaderMethod.invoke(zipArchiveOutputStream, writeCentralFileHeaderMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link org.apache.commons.compress.archivers.zip.Zip64RequiredException} in: final byte[] centralFileHeader = createCentralFileHeader(ze);
 *  */
    @Test(expected = Zip64RequiredException.class)
    public void testWriteCentralFileHeader_ThrowZip64RequiredException_2() throws Exception  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            LinkedHashMap metaData = new LinkedHashMap();
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "metaData", metaData);
            Zip64Mode zip64Mode = Zip64Mode.Never;
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
            JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
            setField(jarArchiveEntry, "java.util.zip.ZipEntry", "csize", 4294967295L);
            
            zipArchiveOutputStream.writeCentralFileHeader(jarArchiveEntry);
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    ///endregion
    
    ///region Errors report for writeCentralFileHeader
    
    public void testWriteCentralFileHeader_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 16 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.shouldAddZip64Extra
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method shouldAddZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.Zip64Mode)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#shouldAddZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.returnsFrom {@code return mode == Zip64Mode.Always || entry.getSize() >= ZIP64_MAGIC || entry.getCompressedSize() >= ZIP64_MAGIC || (entry.getSize() == ArchiveEntry.SIZE_UNKNOWN && channel != null && mode != Zip64Mode.Never);}
 *  */
    @Test
    public void testShouldAddZip64Extra_ModeEqualsZip64ModeAlwaysOrEntryGetSizeLessThanZIP64_MAGICOrEntryGetCompressedSizeLessThanZIP64_MAGICOrEntryGetSizeEqualsArchiveEntrySIZE_UNKNOWNAndChannelEqualsNullAndModeEqualsZip64ModeNever() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Zip64Mode zip64Mode = Zip64Mode.Always;
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method shouldAddZip64ExtraMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("shouldAddZip64Extra", zipArchiveEntryType, zip64ModeType);
        shouldAddZip64ExtraMethod.setAccessible(true);
        java.lang.Object[] shouldAddZip64ExtraMethodArguments = new java.lang.Object[2];
        shouldAddZip64ExtraMethodArguments[0] = ((Object) null);
        shouldAddZip64ExtraMethodArguments[1] = zip64Mode;
        boolean actual = ((Boolean) shouldAddZip64ExtraMethod.invoke(zipArchiveOutputStream, shouldAddZip64ExtraMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#shouldAddZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.executesCondition {@code (entry.getSize() >= ZIP64_MAGIC): False}
 * @utbot.executesCondition {@code (entry.getCompressedSize() >= ZIP64_MAGIC): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getSize()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getCompressedSize()}
 * @utbot.returnsFrom {@code return mode == Zip64Mode.Always || entry.getSize() >= ZIP64_MAGIC || entry.getCompressedSize() >= ZIP64_MAGIC || (entry.getSize() == ArchiveEntry.SIZE_UNKNOWN && channel != null && mode != Zip64Mode.Never);}
 *  */
    @Test
    public void testShouldAddZip64Extra_EntryGetCompressedSizeGreaterOrEqualZIP64_MAGIC() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        (((ZipArchiveEntry) entry)).setSize(0L);
        setField(entry, "java.util.zip.ZipEntry", "csize", 4294967295L);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class entryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method shouldAddZip64ExtraMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("shouldAddZip64Extra", entryType, zip64ModeType);
        shouldAddZip64ExtraMethod.setAccessible(true);
        java.lang.Object[] shouldAddZip64ExtraMethodArguments = new java.lang.Object[2];
        shouldAddZip64ExtraMethodArguments[0] = entry;
        shouldAddZip64ExtraMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) shouldAddZip64ExtraMethod.invoke(zipArchiveOutputStream, shouldAddZip64ExtraMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method shouldAddZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.Zip64Mode)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getSize()} once
    /// execute conditions:
    ///     {@code (entry.getSize() >= ZIP64_MAGIC): False}
    /// invoke:
    ///     {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getCompressedSize()} once
    /// execute conditions:
    ///     {@code (entry.getCompressedSize() >= ZIP64_MAGIC): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#shouldAddZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.executesCondition {@code ((entry.getSize() == ArchiveEntry.SIZE_UNKNOWN && channel != null && mode != Zip64Mode.Never)): False}
 * @utbot.returnsFrom {@code return mode == Zip64Mode.Always || entry.getSize() >= ZIP64_MAGIC || entry.getCompressedSize() >= ZIP64_MAGIC || (entry.getSize() == ArchiveEntry.SIZE_UNKNOWN && channel != null && mode != Zip64Mode.Never);}
 *  */
    @Test
    public void testShouldAddZip64Extra_EntryGetSizeNotEqualsArchiveEntrySIZE_UNKNOWNAndChannelNotEqualsNullAndModeNotEqualsZip64ModeNever() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        jarArchiveEntry.setSize(-255L);
        setField(jarArchiveEntry, "java.util.zip.ZipEntry", "csize", -9223372032559808512L);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class jarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method shouldAddZip64ExtraMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("shouldAddZip64Extra", jarArchiveEntryType, zip64ModeType);
        shouldAddZip64ExtraMethod.setAccessible(true);
        java.lang.Object[] shouldAddZip64ExtraMethodArguments = new java.lang.Object[2];
        shouldAddZip64ExtraMethodArguments[0] = jarArchiveEntry;
        shouldAddZip64ExtraMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) shouldAddZip64ExtraMethod.invoke(zipArchiveOutputStream, shouldAddZip64ExtraMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#shouldAddZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.executesCondition {@code ((entry.getSize() == ArchiveEntry.SIZE_UNKNOWN && channel != null && mode != Zip64Mode.Never)): True}
 * @utbot.executesCondition {@code ((entry.getSize() == ArchiveEntry.SIZE_UNKNOWN && channel != null && mode != Zip64Mode.Never)): True}
 * @utbot.executesCondition {@code ((entry.getSize() == ArchiveEntry.SIZE_UNKNOWN && channel != null && mode != Zip64Mode.Never)): False}
 * @utbot.returnsFrom {@code return mode == Zip64Mode.Always || entry.getSize() >= ZIP64_MAGIC || entry.getCompressedSize() >= ZIP64_MAGIC || (entry.getSize() == ArchiveEntry.SIZE_UNKNOWN && channel != null && mode != Zip64Mode.Never);}
 *  */
    @Test
    public void testShouldAddZip64Extra_EntryGetSizeEqualsArchiveEntrySIZE_UNKNOWNAndChannelEqualsNullAndModeEqualsZip64ModeNever() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        jarArchiveEntry.setSize(-1L);
        setField(jarArchiveEntry, "java.util.zip.ZipEntry", "csize", -9223372032559808512L);
        Zip64Mode zip64Mode = Zip64Mode.Never;
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class jarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method shouldAddZip64ExtraMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("shouldAddZip64Extra", jarArchiveEntryType, zip64ModeType);
        shouldAddZip64ExtraMethod.setAccessible(true);
        java.lang.Object[] shouldAddZip64ExtraMethodArguments = new java.lang.Object[2];
        shouldAddZip64ExtraMethodArguments[0] = jarArchiveEntry;
        shouldAddZip64ExtraMethodArguments[1] = zip64Mode;
        boolean actual = ((Boolean) shouldAddZip64ExtraMethod.invoke(zipArchiveOutputStream, shouldAddZip64ExtraMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#shouldAddZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.executesCondition {@code ((entry.getSize() == ArchiveEntry.SIZE_UNKNOWN && channel != null && mode != Zip64Mode.Never)): True}
 * @utbot.executesCondition {@code ((entry.getSize() == ArchiveEntry.SIZE_UNKNOWN && channel != null && mode != Zip64Mode.Never)): True}
 * @utbot.executesCondition {@code ((entry.getSize() == ArchiveEntry.SIZE_UNKNOWN && channel != null && mode != Zip64Mode.Never)): True}
 * @utbot.returnsFrom {@code return mode == Zip64Mode.Always || entry.getSize() >= ZIP64_MAGIC || entry.getCompressedSize() >= ZIP64_MAGIC || (entry.getSize() == ArchiveEntry.SIZE_UNKNOWN && channel != null && mode != Zip64Mode.Never);}
 *  */
    @Test
    public void testShouldAddZip64Extra_EntryGetSizeNotEqualsArchiveEntrySIZE_UNKNOWNAndChannelNotEqualsNullAndModeNotEqualsZip64ModeNever_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        jarArchiveEntry.setSize(-1L);
        setField(jarArchiveEntry, "java.util.zip.ZipEntry", "csize", -9223372032559808512L);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class jarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method shouldAddZip64ExtraMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("shouldAddZip64Extra", jarArchiveEntryType, zip64ModeType);
        shouldAddZip64ExtraMethod.setAccessible(true);
        java.lang.Object[] shouldAddZip64ExtraMethodArguments = new java.lang.Object[2];
        shouldAddZip64ExtraMethodArguments[0] = jarArchiveEntry;
        shouldAddZip64ExtraMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) shouldAddZip64ExtraMethod.invoke(zipArchiveOutputStream, shouldAddZip64ExtraMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#shouldAddZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.executesCondition {@code ((entry.getSize() == ArchiveEntry.SIZE_UNKNOWN && channel != null && mode != Zip64Mode.Never)): True}
 * @utbot.executesCondition {@code ((entry.getSize() == ArchiveEntry.SIZE_UNKNOWN && channel != null && mode != Zip64Mode.Never)): False}
 * @utbot.returnsFrom {@code return mode == Zip64Mode.Always || entry.getSize() >= ZIP64_MAGIC || entry.getCompressedSize() >= ZIP64_MAGIC || (entry.getSize() == ArchiveEntry.SIZE_UNKNOWN && channel != null && mode != Zip64Mode.Never);}
 *  */
    @Test
    public void testShouldAddZip64Extra_EntryGetSizeEqualsArchiveEntrySIZE_UNKNOWNAndChannelEqualsNullAndModeEqualsZip64ModeNever_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        jarArchiveEntry.setSize(-1L);
        setField(jarArchiveEntry, "java.util.zip.ZipEntry", "csize", -9223372032559808512L);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class jarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method shouldAddZip64ExtraMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("shouldAddZip64Extra", jarArchiveEntryType, zip64ModeType);
        shouldAddZip64ExtraMethod.setAccessible(true);
        java.lang.Object[] shouldAddZip64ExtraMethodArguments = new java.lang.Object[2];
        shouldAddZip64ExtraMethodArguments[0] = jarArchiveEntry;
        shouldAddZip64ExtraMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) shouldAddZip64ExtraMethod.invoke(zipArchiveOutputStream, shouldAddZip64ExtraMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method shouldAddZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.Zip64Mode)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#shouldAddZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getSize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entry.getSize() >= ZIP64_MAGIC
 *  */
    @Test
    public void testShouldAddZip64Extra_ThrowNullPointerException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.shouldAddZip64Extra] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.shouldAddZip64Extra(ZipArchiveOutputStream.java:849) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method shouldAddZip64ExtraMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("shouldAddZip64Extra", zipArchiveEntryType, zip64ModeType);
        shouldAddZip64ExtraMethod.setAccessible(true);
        java.lang.Object[] shouldAddZip64ExtraMethodArguments = new java.lang.Object[2];
        shouldAddZip64ExtraMethodArguments[0] = ((Object) null);
        shouldAddZip64ExtraMethodArguments[1] = ((Object) null);
        try {
            shouldAddZip64ExtraMethod.invoke(zipArchiveOutputStream, shouldAddZip64ExtraMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for shouldAddZip64Extra
    
    public void testShouldAddZip64Extra_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, boolean)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,boolean)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean encodable = zipEncoding.canEncode(ze.getName());
 *  */
    @Test
    public void testWriteLocalFileHeader_ThrowNullPointerException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader(ZipArchiveOutputStream.java:1025) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class booleanType = boolean.class;
        Method writeLocalFileHeaderMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeLocalFileHeader", zipArchiveEntryType, booleanType);
        writeLocalFileHeaderMethod.setAccessible(true);
        java.lang.Object[] writeLocalFileHeaderMethodArguments = new java.lang.Object[2];
        writeLocalFileHeaderMethodArguments[0] = ((Object) null);
        writeLocalFileHeaderMethodArguments[1] = false;
        try {
            writeLocalFileHeaderMethod.invoke(zipArchiveOutputStream, writeLocalFileHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,boolean)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean encodable = zipEncoding.canEncode(ze.getName());
 *  */
    @Test
    public void testWriteLocalFileHeader_ThrowNullPointerException_1() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        String name = "";
        setField(jarArchiveEntry, "java.util.zip.ZipEntry", "name", name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader] produces [java.lang.NullPointerException] */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class jarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class booleanType = boolean.class;
        Method writeLocalFileHeaderMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeLocalFileHeader", jarArchiveEntryType, booleanType);
        writeLocalFileHeaderMethod.setAccessible(true);
        java.lang.Object[] writeLocalFileHeaderMethodArguments = new java.lang.Object[2];
        writeLocalFileHeaderMethodArguments[0] = jarArchiveEntry;
        writeLocalFileHeaderMethodArguments[1] = false;
        try {
            writeLocalFileHeaderMethod.invoke(zipArchiveOutputStream, writeLocalFileHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeLocalFileHeader
    
    public void testWriteLocalFileHeader_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeLocalFileHeader(ze, false);
 *  */
    @Test
    public void testWriteLocalFileHeader_ThrowNullPointerException1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader(ZipArchiveOutputStream.java:1025)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader(ZipArchiveOutputStream.java:1021) */
        zipArchiveOutputStream.writeLocalFileHeader(null);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeLocalFileHeader(ze, false);
 *  */
    @Test
    public void testWriteLocalFileHeader_ThrowNullPointerException_11() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        String name = "";
        setField(jarArchiveEntry, "java.util.zip.ZipEntry", "name", name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader] produces [java.lang.NullPointerException] */
        zipArchiveOutputStream.writeLocalFileHeader(jarArchiveEntry);
    }
    ///endregion
    
    ///region Errors report for writeLocalFileHeader
    
    public void testWriteLocalFileHeader_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeDataDescriptor
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getMethod()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ze.getMethod() != DEFLATED || channel != null
 *  */
    @Test
    public void testWriteDataDescriptor_ThrowNullPointerException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeDataDescriptor] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeDataDescriptor(ZipArchiveOutputStream.java:1171) */
        zipArchiveOutputStream.writeDataDescriptor(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (ze.getMethod() != DEFLATED): False}
 * @utbot.executesCondition {@code (channel != null): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getMethod()}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCounted(byte[])
 * @utbot.throwsException {@link java.util.zip.ZipException} in: writeCounted(DD_SIG);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteDataDescriptor_ThrowZipException() throws Exception  {
        byte[] prevDD_SIG = ZipArchiveOutputStream.DD_SIG;
        try {
            byte[] ddSig = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "DD_SIG", ddSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
            DataOutputStream raf = ((DataOutputStream) createInstance("java.io.DataOutputStream"));
            ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
            setField(raf, "java.io.FilterOutputStream", "out", out);
            setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
            JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
            jarArchiveEntry.setMethod(8);
            
            zipArchiveOutputStream.writeDataDescriptor(jarArchiveEntry);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "DD_SIG", prevDD_SIG);
        }
    }
    ///endregion
    
    ///region Errors report for writeDataDescriptor
    
    public void testWriteDataDescriptor_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Concrete execution failed
        
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.versionNeededToExtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method versionNeededToExtract(int, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#versionNeededToExtract(int,boolean,boolean)}
 * @utbot.executesCondition {@code (zip64): True}
 * @utbot.returnsFrom {@code return ZIP64_MIN_VERSION;}
 *  */
    @Test
    public void testVersionNeededToExtract_Zip64() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method versionNeededToExtractMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("versionNeededToExtract", intType, booleanType, booleanType);
        versionNeededToExtractMethod.setAccessible(true);
        java.lang.Object[] versionNeededToExtractMethodArguments = new java.lang.Object[3];
        versionNeededToExtractMethodArguments[0] = -255;
        versionNeededToExtractMethodArguments[1] = true;
        versionNeededToExtractMethodArguments[2] = false;
        int actual = ((Integer) versionNeededToExtractMethod.invoke(zipArchiveOutputStream, versionNeededToExtractMethodArguments));
        
        assertEquals(45, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#versionNeededToExtract(int,boolean,boolean)}
 * @utbot.executesCondition {@code (zip64): False}
 * @utbot.executesCondition {@code (usedDataDescriptor): True}
 * @utbot.returnsFrom {@code return DATA_DESCRIPTOR_MIN_VERSION;}
 *  */
    @Test
    public void testVersionNeededToExtract_UsedDataDescriptor() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method versionNeededToExtractMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("versionNeededToExtract", intType, booleanType, booleanType);
        versionNeededToExtractMethod.setAccessible(true);
        java.lang.Object[] versionNeededToExtractMethodArguments = new java.lang.Object[3];
        versionNeededToExtractMethodArguments[0] = -255;
        versionNeededToExtractMethodArguments[1] = false;
        versionNeededToExtractMethodArguments[2] = true;
        int actual = ((Integer) versionNeededToExtractMethod.invoke(zipArchiveOutputStream, versionNeededToExtractMethodArguments));
        
        assertEquals(20, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#versionNeededToExtract(int,boolean,boolean)}
 * @utbot.executesCondition {@code (zip64): False}
 * @utbot.executesCondition {@code (usedDataDescriptor): False}
 * @utbot.returnsFrom {@code return versionNeededToExtractMethod(zipMethod);}
 *  */
    @Test
    public void testVersionNeededToExtract_NotUsedDataDescriptor() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method versionNeededToExtractMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("versionNeededToExtract", intType, booleanType, booleanType);
        versionNeededToExtractMethod.setAccessible(true);
        java.lang.Object[] versionNeededToExtractMethodArguments = new java.lang.Object[3];
        versionNeededToExtractMethodArguments[0] = 8;
        versionNeededToExtractMethodArguments[1] = false;
        versionNeededToExtractMethodArguments[2] = false;
        int actual = ((Integer) versionNeededToExtractMethod.invoke(zipArchiveOutputStream, versionNeededToExtractMethodArguments));
        
        assertEquals(20, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#versionNeededToExtract(int,boolean,boolean)}
 * @utbot.executesCondition {@code (zip64): False}
 * @utbot.executesCondition {@code (usedDataDescriptor): False}
 * @utbot.returnsFrom {@code return versionNeededToExtractMethod(zipMethod);}
 *  */
    @Test
    public void testVersionNeededToExtract_NotUsedDataDescriptor_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method versionNeededToExtractMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("versionNeededToExtract", intType, booleanType, booleanType);
        versionNeededToExtractMethod.setAccessible(true);
        java.lang.Object[] versionNeededToExtractMethodArguments = new java.lang.Object[3];
        versionNeededToExtractMethodArguments[0] = -255;
        versionNeededToExtractMethodArguments[1] = false;
        versionNeededToExtractMethodArguments[2] = false;
        int actual = ((Integer) versionNeededToExtractMethod.invoke(zipArchiveOutputStream, versionNeededToExtractMethodArguments));
        
        assertEquals(10, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeZip64CentralDirectory()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeZip64CentralDirectory()}
 * @utbot.executesCondition {@code (zip64Mode == Zip64Mode.Never): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testWriteZip64CentralDirectory_Zip64ModeEqualsZip64ModeNever() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Zip64Mode zip64Mode = Zip64Mode.Never;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        zipArchiveOutputStream.writeZip64CentralDirectory();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeZip64CentralDirectory()}
 * @utbot.executesCondition {@code (zip64Mode == Zip64Mode.Never): False}
 * @utbot.executesCondition {@code (!hasUsedZip64): True}
 * @utbot.executesCondition {@code (cdOffset >= ZIP64_MAGIC): False}
 * @utbot.executesCondition {@code (cdLength >= ZIP64_MAGIC): False}
 * @utbot.executesCondition {@code (entries.size() >= ZIP64_MAGIC_SHORT): False}
 * @utbot.executesCondition {@code (!hasUsedZip64): True}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testWriteZip64CentralDirectory_NotHasUsedZip64() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ArrayList entries = new ArrayList();
        entries.add(null);
        entries.add(null);
        entries.add(null);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", -255L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdLength", -255L);
        Zip64Mode zip64Mode = Zip64Mode.Always;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        zipArchiveOutputStream.writeZip64CentralDirectory();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeZip64CentralDirectory()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeZip64CentralDirectory()}
 * @utbot.executesCondition {@code (!hasUsedZip64): True}
 * @utbot.executesCondition {@code (cdOffset >= ZIP64_MAGIC): True}
 * @utbot.executesCondition {@code (!hasUsedZip64): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final long offset = streamCompressor.getTotalBytesWritten();
 *  */
    @Test
    public void testWriteZip64CentralDirectory_ThrowNullPointerException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", 4294967296L);
        Zip64Mode zip64Mode = Zip64Mode.Always;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory(ZipArchiveOutputStream.java:1404) */
        zipArchiveOutputStream.writeZip64CentralDirectory();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeZip64CentralDirectory()}
 * @utbot.executesCondition {@code (!hasUsedZip64): True}
 * @utbot.executesCondition {@code (cdOffset >= ZIP64_MAGIC): False}
 * @utbot.executesCondition {@code (cdLength >= ZIP64_MAGIC): False}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entries.size() >= ZIP64_MAGIC_SHORT
 *  */
    @Test
    public void testWriteZip64CentralDirectory_ThrowNullPointerException_2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", -255L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdLength", -255L);
        Zip64Mode zip64Mode = Zip64Mode.Always;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory(ZipArchiveOutputStream.java:1395) */
        zipArchiveOutputStream.writeZip64CentralDirectory();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeZip64CentralDirectory()}
 * @utbot.executesCondition {@code (!hasUsedZip64): True}
 * @utbot.executesCondition {@code (cdOffset >= ZIP64_MAGIC): False}
 * @utbot.executesCondition {@code (cdLength >= ZIP64_MAGIC): True}
 * @utbot.executesCondition {@code (!hasUsedZip64): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final long offset = streamCompressor.getTotalBytesWritten();
 *  */
    @Test
    public void testWriteZip64CentralDirectory_ThrowNullPointerException_3() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", -255L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdLength", 4294967296L);
        Zip64Mode zip64Mode = Zip64Mode.AsNeeded;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory(ZipArchiveOutputStream.java:1404) */
        zipArchiveOutputStream.writeZip64CentralDirectory();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeZip64CentralDirectory()}
 * @utbot.executesCondition {@code (!hasUsedZip64): False}
 * @utbot.executesCondition {@code (!hasUsedZip64): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final long offset = streamCompressor.getTotalBytesWritten();
 *  */
    @Test
    public void testWriteZip64CentralDirectory_ThrowNullPointerException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "hasUsedZip64", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory(ZipArchiveOutputStream.java:1404) */
        zipArchiveOutputStream.writeZip64CentralDirectory();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeZip64CentralDirectory()
    
    @Test
    public void testWriteZip64CentralDirectory1() throws Exception  {
        byte[] prevZIP64_EOCD_SIG = ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        try {
            byte[] zip64EocdSig = {(byte) 80, (byte) 75, (byte) 6, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "ZIP64_EOCD_SIG", zip64EocdSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
            ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
            Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
            byte[] buf = {
                (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
                (byte) 0
            };
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1021);
            setField(raf, "java.io.ObjectOutputStream", "bout", bout);
            setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
            setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "totalWrittenToOutputStream", 0L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "hasUsedZip64", true);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 1024 out of bounds for byte[9]]
                java.base/java.lang.System.arraycopy(Native Method)
                java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
                java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
                org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor.writeOut(StreamCompressor.java:321)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:1456)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory(ZipArchiveOutputStream.java:1406) */
            zipArchiveOutputStream.writeZip64CentralDirectory();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "ZIP64_EOCD_SIG", prevZIP64_EOCD_SIG);
        }
    }
    
    @Test
    public void testWriteZip64CentralDirectory2() throws Exception  {
        byte[] prevZIP64_EOCD_SIG = ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        try {
            byte[] zip64EocdSig = {(byte) 80, (byte) 75, (byte) 6, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "ZIP64_EOCD_SIG", zip64EocdSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
            ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
            Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
            byte[] buf = {
                (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
                (byte) 0
            };
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
            setField(raf, "java.io.ObjectOutputStream", "bout", bout);
            setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
            setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "totalWrittenToOutputStream", 0L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "hasUsedZip64", true);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 12 out of bounds for byte[9]]
                java.base/java.lang.System.arraycopy(Native Method)
                java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
                java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
                org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor.writeOut(StreamCompressor.java:321)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:1456)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory(ZipArchiveOutputStream.java:1409) */
            zipArchiveOutputStream.writeZip64CentralDirectory();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "ZIP64_EOCD_SIG", prevZIP64_EOCD_SIG);
        }
    }
    
    @Test
    public void testWriteZip64CentralDirectory3() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "totalWrittenToOutputStream", 0L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", -9223372032559808512L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdLength", 4294967295L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor.writeOut(StreamCompressor.java:337)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:1456)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory(ZipArchiveOutputStream.java:1406) */
        zipArchiveOutputStream.writeZip64CentralDirectory();
    }
    
    @Test
    public void testWriteZip64CentralDirectory4() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "totalWrittenToOutputStream", 0L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", 4294967295L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor.writeOut(StreamCompressor.java:337)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:1456)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory(ZipArchiveOutputStream.java:1406) */
        zipArchiveOutputStream.writeZip64CentralDirectory();
    }
    
    @Test
    public void testWriteZip64CentralDirectory5() throws Exception  {
        byte[] prevZIP64_EOCD_SIG = ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        try {
            byte[] zip64EocdSig = {(byte) 80, (byte) 75, (byte) 6, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "ZIP64_EOCD_SIG", zip64EocdSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
            setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "totalWrittenToOutputStream", 0L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "hasUsedZip64", true);
            Zip64Mode zip64Mode = Zip64Mode.Always;
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor.writeOut(StreamCompressor.java:337)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:1456)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory(ZipArchiveOutputStream.java:1406) */
            zipArchiveOutputStream.writeZip64CentralDirectory();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "ZIP64_EOCD_SIG", prevZIP64_EOCD_SIG);
        }
    }
    
    @Test
    public void testWriteZip64CentralDirectory6() throws Exception  {
        byte[] prevZIP64_EOCD_SIG = ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        try {
            byte[] zip64EocdSig = {(byte) 80, (byte) 75, (byte) 6, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "ZIP64_EOCD_SIG", zip64EocdSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
            ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
            Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
            byte[] hbuf = {
                (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
                (byte) 0
            };
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1073741824);
            setField(raf, "java.io.ObjectOutputStream", "bout", bout);
            setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
            setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "totalWrittenToOutputStream", 0L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "hasUsedZip64", true);
            Zip64Mode zip64Mode = Zip64Mode.AsNeeded;
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory] produces [java.lang.NullPointerException]
                java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1913)
                java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
                java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
                java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
                org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor.writeOut(StreamCompressor.java:321)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:1456)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory(ZipArchiveOutputStream.java:1406) */
            zipArchiveOutputStream.writeZip64CentralDirectory();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "ZIP64_EOCD_SIG", prevZIP64_EOCD_SIG);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setFallbackToUTF8
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setFallbackToUTF8(boolean)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#setFallbackToUTF8(boolean)}
 *  */
    @Test
    public void testSetFallbackToUTF8() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        zipArchiveOutputStream.setFallbackToUTF8(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isSeekable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSeekable()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#isSeekable()}
 * @utbot.returnsFrom {@code return channel != null;}
 *  */
    @Test
    public void testIsSeekable_ChannelNotEqualsNull() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        
        boolean actual = zipArchiveOutputStream.isSeekable();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#isSeekable()}
 * @utbot.returnsFrom {@code return channel != null;}
 *  */
    @Test
    public void testIsSeekable_ChannelEqualsNull() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        boolean actual = zipArchiveOutputStream.isSeekable();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setUseZip64
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setUseZip64(org.apache.commons.compress.archivers.zip.Zip64Mode)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#setUseZip64(org.apache.commons.compress.archivers.zip.Zip64Mode)}
 *  */
    @Test
    public void testSetUseZip64() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        zipArchiveOutputStream.setUseZip64(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeArchiveEntry
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeArchiveEntry()}
 * @utbot.throwsException {@link java.io.IOException} in: preClose();
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        zipArchiveOutputStream.finished = true;
        
        zipArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeArchiveEntry()}
 * @utbot.throwsException {@link java.io.IOException} in: preClose();
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        zipArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeArchiveEntry()}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: final boolean actuallyNeedsZip64 = handleSizesAndCrc(bytesWritten, realCrc, effectiveMode);
 *  */
    @Test(expected = ZipException.class)
    public void testCloseArchiveEntry_ThrowZipException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setMethod(-255);
        entry1.setCrc(4294967043L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "dataStart", -255L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", -255L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "hasWritten", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(crc, "java.util.zip.CRC32", "crc", -254);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "crc", crc);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "sourcePayloadLength", -255L);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "totalWrittenToOutputStream", -255L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        Zip64Mode zip64Mode = Zip64Mode.AsNeeded;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        zipArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeArchiveEntry()}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: final boolean actuallyNeedsZip64 = handleSizesAndCrc(bytesWritten, realCrc, effectiveMode);
 *  */
    @Test(expected = ZipException.class)
    public void testCloseArchiveEntry_ThrowZipException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setMethod(-255);
        entry1.setSize(3L);
        entry1.setCrc(4294967041L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "dataStart", -32L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", -255L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "hasWritten", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(crc, "java.util.zip.CRC32", "crc", -255);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "crc", crc);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "sourcePayloadLength", -255L);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "totalWrittenToOutputStream", -30L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        Zip64Mode zip64Mode = Zip64Mode.AsNeeded;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        zipArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeArchiveEntry()}
 * @utbot.throwsException {@link org.apache.commons.compress.archivers.zip.Zip64RequiredException} in: final boolean actuallyNeedsZip64 = handleSizesAndCrc(bytesWritten, realCrc, effectiveMode);
 *  */
    @Test(expected = Zip64RequiredException.class)
    public void testCloseArchiveEntry_ThrowZip64RequiredException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setMethod(8);
        entry1.setSize(0L);
        entry1.setCrc(0L);
        setField(entry1, "java.util.zip.ZipEntry", "csize", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "dataStart", -4294967296L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "hasWritten", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "def", def);
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "crc", crc);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "sourcePayloadLength", 0L);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "totalWrittenToOutputStream", -1L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        Zip64Mode zip64Mode = Zip64Mode.Never;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        zipArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeArchiveEntry()}
 * @utbot.throwsException {@link org.apache.commons.compress.archivers.zip.Zip64RequiredException} in: final boolean actuallyNeedsZip64 = handleSizesAndCrc(bytesWritten, realCrc, effectiveMode);
 *  */
    @Test(expected = Zip64RequiredException.class)
    public void testCloseArchiveEntry_ThrowZip64RequiredException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setMethod(8);
        entry1.setSize(0L);
        entry1.setCrc(0L);
        setField(entry1, "java.util.zip.ZipEntry", "csize", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "dataStart", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "hasWritten", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "def", def);
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "crc", crc);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "sourcePayloadLength", 4294967295L);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "totalWrittenToOutputStream", 0L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        Zip64Mode zip64Mode = Zip64Mode.Never;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        zipArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeArchiveEntry()}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeEntry(boolean,boolean)
 * @utbot.throwsException {@link java.nio.channels.ClosedChannelException} 
 *  */
    @Test(expected = ClosedChannelException.class)
    public void testCloseArchiveEntry_ThrowClosedChannelException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setMethod(8);
        entry1.setSize(0L);
        entry1.setCrc(0L);
        setField(entry1, "java.util.zip.ZipEntry", "csize", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "dataStart", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "hasWritten", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "def", def);
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "crc", crc);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "sourcePayloadLength", 0L);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "totalWrittenToOutputStream", 0L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        FileChannelImpl channel = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        setField(channel, "java.nio.channels.spi.AbstractInterruptibleChannel", "closed", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        Zip64Mode zip64Mode = Zip64Mode.Always;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        zipArchiveOutputStream.closeArchiveEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeArchiveEntry()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: final boolean actuallyNeedsZip64 = handleSizesAndCrc(bytesWritten, realCrc, effectiveMode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCloseArchiveEntry_ThrowIllegalArgumentException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setMethod(-255);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "dataStart", -1L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", -255L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "hasWritten", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(crc, "java.util.zip.CRC32", "crc", -255);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "crc", crc);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "sourcePayloadLength", -255L);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "totalWrittenToOutputStream", -254L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        Zip64Mode zip64Mode = Zip64Mode.Always;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        zipArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeArchiveEntry()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: final boolean actuallyNeedsZip64 = handleSizesAndCrc(bytesWritten, realCrc, effectiveMode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCloseArchiveEntry_ThrowIllegalArgumentException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setMethod(8);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "dataStart", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "hasWritten", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "def", def);
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "crc", crc);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "sourcePayloadLength", -9223372036854775807L);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "totalWrittenToOutputStream", 0L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        Zip64Mode zip64Mode = Zip64Mode.Always;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        zipArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeArchiveEntry()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: final boolean actuallyNeedsZip64 = handleSizesAndCrc(bytesWritten, realCrc, effectiveMode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCloseArchiveEntry_ThrowIllegalArgumentException_2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setMethod(8);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "dataStart", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "hasWritten", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "def", def);
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "crc", crc);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "sourcePayloadLength", -9223372036854775807L);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "totalWrittenToOutputStream", 0L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        Zip64Mode zip64Mode = Zip64Mode.AsNeeded;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        zipArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeArchiveEntry()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: final boolean actuallyNeedsZip64 = handleSizesAndCrc(bytesWritten, realCrc, effectiveMode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCloseArchiveEntry_ThrowIllegalArgumentException_3() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setMethod(8);
        entry1.setSize(-1L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "dataStart", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "hasWritten", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$OutputStreamCompressor");
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "def", def);
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "crc", crc);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "sourcePayloadLength", -9223372036854775807L);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "totalWrittenToOutputStream", 0L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        Zip64Mode zip64Mode = Zip64Mode.AsNeeded;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        zipArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeArchiveEntry()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: final boolean actuallyNeedsZip64 = handleSizesAndCrc(bytesWritten, realCrc, effectiveMode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCloseArchiveEntry_ThrowIllegalArgumentException_4() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        JarArchiveEntry entry1 = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry1.setMethod(8);
        entry1.setSize(-255L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "dataStart", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "hasWritten", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$OutputStreamCompressor");
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "def", def);
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "crc", crc);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "sourcePayloadLength", -9223372036854775807L);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "totalWrittenToOutputStream", 0L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        Zip64Mode zip64Mode = Zip64Mode.AsNeeded;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        zipArchiveOutputStream.closeArchiveEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeArchiveEntry()}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#preClose()
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#flushDeflater()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: flushDeflater();
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowNullPointerException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "hasWritten", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flushDeflater(ZipArchiveOutputStream.java:596)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeArchiveEntry(ZipArchiveOutputStream.java:508) */
        zipArchiveOutputStream.closeArchiveEntry();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method closeArchiveEntry()
    
    @Test
    public void testCloseArchiveEntry1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipUtil.supportsEncryptionOf(ZipUtil.java:319)
            org.apache.commons.compress.archivers.zip.ZipUtil.checkRequestedFeatures(ZipUtil.java:342)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write(ZipArchiveOutputStream.java:921)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.preClose(ZipArchiveOutputStream.java:558)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeArchiveEntry(ZipArchiveOutputStream.java:506) */
        zipArchiveOutputStream.closeArchiveEntry();
    }
    ///endregion
    
    ///region Errors report for closeArchiveEntry
    
    public void testCloseArchiveEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.checkIfNeedsZip64
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkIfNeedsZip64(org.apache.commons.compress.archivers.zip.Zip64Mode)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#checkIfNeedsZip64(org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.executesCondition {@code (actuallyNeedsZip64): True}
 * @utbot.executesCondition {@code (effectiveMode == Zip64Mode.Never): False}
 * @utbot.returnsFrom {@code return actuallyNeedsZip64;}
 *  */
    @Test
    public void testCheckIfNeedsZip64_EffectiveModeNotEqualsZip64ModeNever() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Zip64Mode zip64Mode = Zip64Mode.Always;
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method checkIfNeedsZip64Method = zipArchiveOutputStreamClazz.getDeclaredMethod("checkIfNeedsZip64", zip64ModeType);
        checkIfNeedsZip64Method.setAccessible(true);
        java.lang.Object[] checkIfNeedsZip64MethodArguments = new java.lang.Object[1];
        checkIfNeedsZip64MethodArguments[0] = zip64Mode;
        boolean actual = ((Boolean) checkIfNeedsZip64Method.invoke(zipArchiveOutputStream, checkIfNeedsZip64MethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#checkIfNeedsZip64(org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.executesCondition {@code (actuallyNeedsZip64): True}
 * @utbot.executesCondition {@code (effectiveMode == Zip64Mode.Never): False}
 * @utbot.returnsFrom {@code return actuallyNeedsZip64;}
 *  */
    @Test
    public void testCheckIfNeedsZip64_EffectiveModeNotEqualsZip64ModeNever_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setSize(0L);
        setField(entry1, "java.util.zip.ZipEntry", "csize", 4294967295L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method checkIfNeedsZip64Method = zipArchiveOutputStreamClazz.getDeclaredMethod("checkIfNeedsZip64", zip64ModeType);
        checkIfNeedsZip64Method.setAccessible(true);
        java.lang.Object[] checkIfNeedsZip64MethodArguments = new java.lang.Object[1];
        checkIfNeedsZip64MethodArguments[0] = ((Object) null);
        boolean actual = ((Boolean) checkIfNeedsZip64Method.invoke(zipArchiveOutputStream, checkIfNeedsZip64MethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#checkIfNeedsZip64(org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.executesCondition {@code (actuallyNeedsZip64): False}
 * @utbot.returnsFrom {@code return actuallyNeedsZip64;}
 *  */
    @Test
    public void testCheckIfNeedsZip64_NotActuallyNeedsZip64() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setSize(-255L);
        setField(entry1, "java.util.zip.ZipEntry", "csize", -9223372032559808512L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method checkIfNeedsZip64Method = zipArchiveOutputStreamClazz.getDeclaredMethod("checkIfNeedsZip64", zip64ModeType);
        checkIfNeedsZip64Method.setAccessible(true);
        java.lang.Object[] checkIfNeedsZip64MethodArguments = new java.lang.Object[1];
        checkIfNeedsZip64MethodArguments[0] = ((Object) null);
        boolean actual = ((Boolean) checkIfNeedsZip64Method.invoke(zipArchiveOutputStream, checkIfNeedsZip64MethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkIfNeedsZip64(org.apache.commons.compress.archivers.zip.Zip64Mode)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#checkIfNeedsZip64(org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#isZip64Required(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,org.apache.commons.compress.archivers.zip.Zip64Mode)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean actuallyNeedsZip64 = isZip64Required(entry.entry, effectiveMode);
 *  */
    @Test
    public void testCheckIfNeedsZip64_ThrowNullPointerException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.checkIfNeedsZip64] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isTooLageForZip32(ZipArchiveOutputStream.java:663)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isZip64Required(ZipArchiveOutputStream.java:659)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.checkIfNeedsZip64(ZipArchiveOutputStream.java:651) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method checkIfNeedsZip64Method = zipArchiveOutputStreamClazz.getDeclaredMethod("checkIfNeedsZip64", zip64ModeType);
        checkIfNeedsZip64Method.setAccessible(true);
        java.lang.Object[] checkIfNeedsZip64MethodArguments = new java.lang.Object[1];
        checkIfNeedsZip64MethodArguments[0] = ((Object) null);
        try {
            checkIfNeedsZip64Method.invoke(zipArchiveOutputStream, checkIfNeedsZip64MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for checkIfNeedsZip64
    
    public void testCheckIfNeedsZip64_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.rewriteSizesAndCrc
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method rewriteSizesAndCrc(boolean)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#rewriteSizesAndCrc(boolean)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testRewriteSizesAndCrc_ThrowIndexOutOfBoundsException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        JarArchiveEntry entry1 = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry1.setCrc(0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "localDataStart", 1L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(raf, "java.io.ObjectOutputStream", "bout", bout);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        AtomicBoolean closed = ((AtomicBoolean) createInstance("java.util.concurrent.atomic.AtomicBoolean"));
        setField(channel, "org.apache.commons.compress.utils.SeekableInMemoryByteChannel", "closed", closed);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.rewriteSizesAndCrc] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method rewriteSizesAndCrcMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("rewriteSizesAndCrc", booleanType);
        rewriteSizesAndCrcMethod.setAccessible(true);
        java.lang.Object[] rewriteSizesAndCrcMethodArguments = new java.lang.Object[1];
        rewriteSizesAndCrcMethodArguments[0] = false;
        try {
            rewriteSizesAndCrcMethod.invoke(zipArchiveOutputStream, rewriteSizesAndCrcMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#rewriteSizesAndCrc(boolean)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testRewriteSizesAndCrc_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        JarArchiveEntry entry1 = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry1.setCrc(0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "localDataStart", 1L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(raf, "java.io.ObjectOutputStream", "bout", bout);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        AtomicBoolean closed = ((AtomicBoolean) createInstance("java.util.concurrent.atomic.AtomicBoolean"));
        setField(channel, "org.apache.commons.compress.utils.SeekableInMemoryByteChannel", "closed", closed);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.rewriteSizesAndCrc] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method rewriteSizesAndCrcMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("rewriteSizesAndCrc", booleanType);
        rewriteSizesAndCrcMethod.setAccessible(true);
        java.lang.Object[] rewriteSizesAndCrcMethodArguments = new java.lang.Object[1];
        rewriteSizesAndCrcMethodArguments[0] = false;
        try {
            rewriteSizesAndCrcMethod.invoke(zipArchiveOutputStream, rewriteSizesAndCrcMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#rewriteSizesAndCrc(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final long save = channel.position();
 *  */
    @Test
    public void testRewriteSizesAndCrc_ThrowNullPointerException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.rewriteSizesAndCrc] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.rewriteSizesAndCrc(ZipArchiveOutputStream.java:673) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method rewriteSizesAndCrcMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("rewriteSizesAndCrc", booleanType);
        rewriteSizesAndCrcMethod.setAccessible(true);
        java.lang.Object[] rewriteSizesAndCrcMethodArguments = new java.lang.Object[1];
        rewriteSizesAndCrcMethodArguments[0] = false;
        try {
            rewriteSizesAndCrcMethod.invoke(zipArchiveOutputStream, rewriteSizesAndCrcMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#rewriteSizesAndCrc(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeOut(ZipLong.getBytes(entry.entry.getCrc()));
 *  */
    @Test
    public void testRewriteSizesAndCrc_ThrowNullPointerException_1() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "localDataStart", 1L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        AtomicBoolean closed = ((AtomicBoolean) createInstance("java.util.concurrent.atomic.AtomicBoolean"));
        setField(channel, "org.apache.commons.compress.utils.SeekableInMemoryByteChannel", "closed", closed);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.rewriteSizesAndCrc] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.rewriteSizesAndCrc(ZipArchiveOutputStream.java:676) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method rewriteSizesAndCrcMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("rewriteSizesAndCrc", booleanType);
        rewriteSizesAndCrcMethod.setAccessible(true);
        java.lang.Object[] rewriteSizesAndCrcMethodArguments = new java.lang.Object[1];
        rewriteSizesAndCrcMethodArguments[0] = false;
        try {
            rewriteSizesAndCrcMethod.invoke(zipArchiveOutputStream, rewriteSizesAndCrcMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method rewriteSizesAndCrc(boolean)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#rewriteSizesAndCrc(boolean)}
 * @utbot.throwsException {@link java.nio.channels.ClosedChannelException} in: final long save = channel.position();
 *  */
    @Test(expected = ClosedChannelException.class)
    public void testRewriteSizesAndCrc_ThrowClosedChannelException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        FileChannelImpl channel = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        setField(channel, "java.nio.channels.spi.AbstractInterruptibleChannel", "closed", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method rewriteSizesAndCrcMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("rewriteSizesAndCrc", booleanType);
        rewriteSizesAndCrcMethod.setAccessible(true);
        java.lang.Object[] rewriteSizesAndCrcMethodArguments = new java.lang.Object[1];
        rewriteSizesAndCrcMethodArguments[0] = false;
        try {
            rewriteSizesAndCrcMethod.invoke(zipArchiveOutputStream, rewriteSizesAndCrcMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#rewriteSizesAndCrc(boolean)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$400(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link java.nio.channels.SeekableByteChannel#position(long)}
 * @utbot.throwsException {@link java.nio.channels.ClosedChannelException} in: channel.position(entry.localDataStart);
 *  */
    @Test(expected = ClosedChannelException.class)
    public void testRewriteSizesAndCrc_ThrowClosedChannelException_1() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "localDataStart", -255L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        AtomicBoolean closed = ((AtomicBoolean) createInstance("java.util.concurrent.atomic.AtomicBoolean"));
        setField(closed, "java.util.concurrent.atomic.AtomicBoolean", "value", 1);
        setField(channel, "org.apache.commons.compress.utils.SeekableInMemoryByteChannel", "closed", closed);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method rewriteSizesAndCrcMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("rewriteSizesAndCrc", booleanType);
        rewriteSizesAndCrcMethod.setAccessible(true);
        java.lang.Object[] rewriteSizesAndCrcMethodArguments = new java.lang.Object[1];
        rewriteSizesAndCrcMethodArguments[0] = false;
        try {
            rewriteSizesAndCrcMethod.invoke(zipArchiveOutputStream, rewriteSizesAndCrcMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method rewriteSizesAndCrc(boolean)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#rewriteSizesAndCrc(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: channel.position(entry.localDataStart);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRewriteSizesAndCrc_ThrowIllegalArgumentException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "localDataStart", 4294967297L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        AtomicBoolean closed = ((AtomicBoolean) createInstance("java.util.concurrent.atomic.AtomicBoolean"));
        setField(channel, "org.apache.commons.compress.utils.SeekableInMemoryByteChannel", "closed", closed);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method rewriteSizesAndCrcMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("rewriteSizesAndCrc", booleanType);
        rewriteSizesAndCrcMethod.setAccessible(true);
        java.lang.Object[] rewriteSizesAndCrcMethodArguments = new java.lang.Object[1];
        rewriteSizesAndCrcMethodArguments[0] = false;
        try {
            rewriteSizesAndCrcMethod.invoke(zipArchiveOutputStream, rewriteSizesAndCrcMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#rewriteSizesAndCrc(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: channel.position(entry.localDataStart);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRewriteSizesAndCrc_ThrowIllegalArgumentException_1() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "localDataStart", -255L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        AtomicBoolean closed = ((AtomicBoolean) createInstance("java.util.concurrent.atomic.AtomicBoolean"));
        setField(channel, "org.apache.commons.compress.utils.SeekableInMemoryByteChannel", "closed", closed);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method rewriteSizesAndCrcMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("rewriteSizesAndCrc", booleanType);
        rewriteSizesAndCrcMethod.setAccessible(true);
        java.lang.Object[] rewriteSizesAndCrcMethodArguments = new java.lang.Object[1];
        rewriteSizesAndCrcMethodArguments[0] = false;
        try {
            rewriteSizesAndCrcMethod.invoke(zipArchiveOutputStream, rewriteSizesAndCrcMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#rewriteSizesAndCrc(boolean)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getCrc()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#getBytes(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testRewriteSizesAndCrc_ThrowNullPointerException_2() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        JarArchiveEntry entry1 = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry1.setCrc(0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "localDataStart", 1L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -2147482627);
        setField(raf, "java.io.ObjectOutputStream", "bout", bout);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        AtomicBoolean closed = ((AtomicBoolean) createInstance("java.util.concurrent.atomic.AtomicBoolean"));
        setField(channel, "org.apache.commons.compress.utils.SeekableInMemoryByteChannel", "closed", closed);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method rewriteSizesAndCrcMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("rewriteSizesAndCrc", booleanType);
        rewriteSizesAndCrcMethod.setAccessible(true);
        java.lang.Object[] rewriteSizesAndCrcMethodArguments = new java.lang.Object[1];
        rewriteSizesAndCrcMethodArguments[0] = false;
        try {
            rewriteSizesAndCrcMethod.invoke(zipArchiveOutputStream, rewriteSizesAndCrcMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for rewriteSizesAndCrc
    
    public void testRewriteSizesAndCrc_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        /* Unable to make field static final boolean sun.nio.ch.NativeThreadSet.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.ch" to unnamed module @4fcd19b3 */
        
        // 6 occurrences of:
        /* Unable to make field private static final jdk.internal.access.JavaIOFileDescriptorAccess sun.nio.ch.FileChannelImpl.fdAccess accessible:
        module java.base does not "opens sun.nio.ch" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // No such field java.lang.Object blockerLock found in org.utbot.engine.overrides.threads.UtThread
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry,boolean)
 * @utbot.throwsException {@link java.io.IOException} in: putArchiveEntry(archiveEntry, false);
 *  */
    @Test(expected = IOException.class)
    public void testPutArchiveEntry_ThrowIOException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        zipArchiveOutputStream.finished = true;
        
        zipArchiveOutputStream.putArchiveEntry(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: putArchiveEntry(archiveEntry, false);
 *  */
    @Test
    public void testPutArchiveEntry_ThrowClassCastException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry] produces [java.lang.ClassCastException: class org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to class org.apache.commons.compress.archivers.zip.ZipArchiveEntry (org.apache.commons.compress.archivers.tar.TarArchiveEntry and org.apache.commons.compress.archivers.zip.ZipArchiveEntry are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @38d4a3e)]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(ZipArchiveOutputStream.java:751)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(ZipArchiveOutputStream.java:727) */
        zipArchiveOutputStream.putArchiveEntry(tarArchiveEntry);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testPutArchiveEntry_ThrowNullPointerException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "hasWritten", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flushDeflater(ZipArchiveOutputStream.java:596)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeArchiveEntry(ZipArchiveOutputStream.java:508)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(ZipArchiveOutputStream.java:748)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(ZipArchiveOutputStream.java:727) */
        zipArchiveOutputStream.putArchiveEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: putArchiveEntry(archiveEntry, false);
 *  */
    @Test
    public void testPutArchiveEntry_ThrowNullPointerException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(ZipArchiveOutputStream.java:752)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(ZipArchiveOutputStream.java:727) */
        zipArchiveOutputStream.putArchiveEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: putArchiveEntry(archiveEntry, false);
 *  */
    @Test
    public void testPutArchiveEntry_ThrowNullPointerException_2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ArrayList entries = new ArrayList();
        entries.add(null);
        entries.add(null);
        entries.add(null);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setDefaults(ZipArchiveOutputStream.java:794)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(ZipArchiveOutputStream.java:754)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(ZipArchiveOutputStream.java:727) */
        zipArchiveOutputStream.putArchiveEntry(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    @Test
    public void testPutArchiveEntry1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipUtil.supportsEncryptionOf(ZipUtil.java:319)
            org.apache.commons.compress.archivers.zip.ZipUtil.checkRequestedFeatures(ZipUtil.java:342)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write(ZipArchiveOutputStream.java:921)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.preClose(ZipArchiveOutputStream.java:558)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeArchiveEntry(ZipArchiveOutputStream.java:506)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(ZipArchiveOutputStream.java:748)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(ZipArchiveOutputStream.java:727) */
        zipArchiveOutputStream.putArchiveEntry(null);
    }
    ///endregion
    
    ///region Errors report for putArchiveEntry
    
    public void testPutArchiveEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private final java.lang.String java.time.temporal.ChronoUnit.name accessible: module
        java.base does not "opens java.time.temporal" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry, boolean)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry,boolean)}
 * @utbot.executesCondition {@code (entry != null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: entry = new CurrentEntry((ZipArchiveEntry) archiveEntry);
 *  */
    @Test
    public void testPutArchiveEntry_ThrowClassCastException1() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry] produces [java.lang.ClassCastException: class org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to class org.apache.commons.compress.archivers.zip.ZipArchiveEntry (org.apache.commons.compress.archivers.tar.TarArchiveEntry and org.apache.commons.compress.archivers.zip.ZipArchiveEntry are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @38d4a3e)]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(ZipArchiveOutputStream.java:751) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class tarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Class booleanType = boolean.class;
        Method putArchiveEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("putArchiveEntry", tarArchiveEntryType, booleanType);
        putArchiveEntryMethod.setAccessible(true);
        java.lang.Object[] putArchiveEntryMethodArguments = new java.lang.Object[2];
        putArchiveEntryMethodArguments[0] = tarArchiveEntry;
        putArchiveEntryMethodArguments[1] = false;
        try {
            putArchiveEntryMethod.invoke(zipArchiveOutputStream, putArchiveEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry,boolean)}
 * @utbot.executesCondition {@code (entry != null): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeArchiveEntry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: closeArchiveEntry();
 *  */
    @Test
    public void testPutArchiveEntry_ThrowNullPointerException_11() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "hasWritten", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flushDeflater(ZipArchiveOutputStream.java:596)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeArchiveEntry(ZipArchiveOutputStream.java:508)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(ZipArchiveOutputStream.java:748) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class archiveEntryType = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Class booleanType = boolean.class;
        Method putArchiveEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("putArchiveEntry", archiveEntryType, booleanType);
        putArchiveEntryMethod.setAccessible(true);
        java.lang.Object[] putArchiveEntryMethodArguments = new java.lang.Object[2];
        putArchiveEntryMethodArguments[0] = ((Object) null);
        putArchiveEntryMethodArguments[1] = false;
        try {
            putArchiveEntryMethod.invoke(zipArchiveOutputStream, putArchiveEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry,boolean)}
 * @utbot.executesCondition {@code (entry != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entries.add(entry.entry);
 *  */
    @Test
    public void testPutArchiveEntry_ThrowNullPointerException1() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(ZipArchiveOutputStream.java:752) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class archiveEntryType = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Class booleanType = boolean.class;
        Method putArchiveEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("putArchiveEntry", archiveEntryType, booleanType);
        putArchiveEntryMethod.setAccessible(true);
        java.lang.Object[] putArchiveEntryMethodArguments = new java.lang.Object[2];
        putArchiveEntryMethodArguments[0] = ((Object) null);
        putArchiveEntryMethodArguments[1] = false;
        try {
            putArchiveEntryMethod.invoke(zipArchiveOutputStream, putArchiveEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry,boolean)}
 * @utbot.executesCondition {@code (entry != null): False}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#setDefaults(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setDefaults(entry.entry);
 *  */
    @Test
    public void testPutArchiveEntry_ThrowNullPointerException_21() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ArrayList entries = new ArrayList();
        entries.add(null);
        entries.add(null);
        entries.add(null);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setDefaults(ZipArchiveOutputStream.java:794)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(ZipArchiveOutputStream.java:754) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class archiveEntryType = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Class booleanType = boolean.class;
        Method putArchiveEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("putArchiveEntry", archiveEntryType, booleanType);
        putArchiveEntryMethod.setAccessible(true);
        java.lang.Object[] putArchiveEntryMethodArguments = new java.lang.Object[2];
        putArchiveEntryMethodArguments[0] = ((Object) null);
        putArchiveEntryMethodArguments[1] = false;
        try {
            putArchiveEntryMethod.invoke(zipArchiveOutputStream, putArchiveEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry, boolean)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry,boolean)}
 * @utbot.executesCondition {@code (finished): True}
 * @utbot.throwsException {@link java.io.IOException} when: finished
 *  */
    @Test(expected = IOException.class)
    public void testPutArchiveEntry_ThrowIOException1() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        zipArchiveOutputStream.finished = true;
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class archiveEntryType = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Class booleanType = boolean.class;
        Method putArchiveEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("putArchiveEntry", archiveEntryType, booleanType);
        putArchiveEntryMethod.setAccessible(true);
        java.lang.Object[] putArchiveEntryMethodArguments = new java.lang.Object[2];
        putArchiveEntryMethodArguments[0] = ((Object) null);
        putArchiveEntryMethodArguments[1] = false;
        try {
            putArchiveEntryMethod.invoke(zipArchiveOutputStream, putArchiveEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry, boolean)
    
    @Test
    public void testPutArchiveEntry2() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipUtil.supportsEncryptionOf(ZipUtil.java:319)
            org.apache.commons.compress.archivers.zip.ZipUtil.checkRequestedFeatures(ZipUtil.java:342)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write(ZipArchiveOutputStream.java:921)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.preClose(ZipArchiveOutputStream.java:558)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeArchiveEntry(ZipArchiveOutputStream.java:506)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(ZipArchiveOutputStream.java:748) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class archiveEntryType = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Class booleanType = boolean.class;
        Method putArchiveEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("putArchiveEntry", archiveEntryType, booleanType);
        putArchiveEntryMethod.setAccessible(true);
        java.lang.Object[] putArchiveEntryMethodArguments = new java.lang.Object[2];
        putArchiveEntryMethodArguments[0] = ((Object) null);
        putArchiveEntryMethodArguments[1] = false;
        try {
            putArchiveEntryMethod.invoke(zipArchiveOutputStream, putArchiveEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for putArchiveEntry
    
    public void testPutArchiveEntry_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private final java.lang.String java.time.temporal.ChronoUnit.name accessible: module
        java.base does not "opens java.time.temporal" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeCopiedEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method closeCopiedEntry(boolean)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True},
    ///     {@code (null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeCopiedEntry(boolean)}
 *  */
    @Test
    public void testCloseCopiedEntry() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setSize(-255L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", -255L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "hasWritten", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Zip64Mode zip64Mode = Zip64Mode.Always;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method closeCopiedEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("closeCopiedEntry", booleanType);
        closeCopiedEntryMethod.setAccessible(true);
        java.lang.Object[] closeCopiedEntryMethodArguments = new java.lang.Object[1];
        closeCopiedEntryMethodArguments[0] = true;
        closeCopiedEntryMethod.invoke(zipArchiveOutputStream, closeCopiedEntryMethodArguments);
        
        Object finalZipArchiveOutputStreamEntry = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        
        assertNull(finalZipArchiveOutputStreamEntry);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeCopiedEntry(boolean)}
 *  */
    @Test
    public void testCloseCopiedEntry_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setMethod(-255);
        entry1.setSize(-255L);
        setField(entry1, "java.util.zip.ZipEntry", "csize", 4294967295L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", -255L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "hasWritten", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Zip64Mode zip64Mode = Zip64Mode.AsNeeded;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method closeCopiedEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("closeCopiedEntry", booleanType);
        closeCopiedEntryMethod.setAccessible(true);
        java.lang.Object[] closeCopiedEntryMethodArguments = new java.lang.Object[1];
        closeCopiedEntryMethodArguments[0] = false;
        closeCopiedEntryMethod.invoke(zipArchiveOutputStream, closeCopiedEntryMethodArguments);
        
        Object finalZipArchiveOutputStreamEntry = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        
        assertNull(finalZipArchiveOutputStreamEntry);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeCopiedEntry(boolean)}
 *  */
    @Test
    public void testCloseCopiedEntry_2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setMethod(8);
        entry1.setSize(4294967296L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", -255L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "hasWritten", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Zip64Mode zip64Mode = Zip64Mode.AsNeeded;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method closeCopiedEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("closeCopiedEntry", booleanType);
        closeCopiedEntryMethod.setAccessible(true);
        java.lang.Object[] closeCopiedEntryMethodArguments = new java.lang.Object[1];
        closeCopiedEntryMethodArguments[0] = true;
        closeCopiedEntryMethod.invoke(zipArchiveOutputStream, closeCopiedEntryMethodArguments);
        
        Object finalZipArchiveOutputStreamEntry = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        
        assertNull(finalZipArchiveOutputStreamEntry);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method closeCopiedEntry(boolean)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True},
    ///     {@code (null): False},
    ///     {@code (null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeCopiedEntry(boolean)}
 *  */
    @Test
    public void testCloseCopiedEntry_3() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setSize(-255L);
        setField(entry1, "java.util.zip.ZipEntry", "csize", -9223372032559808512L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", -255L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "hasWritten", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        Zip64Mode zip64Mode = Zip64Mode.AsNeeded;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method closeCopiedEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("closeCopiedEntry", booleanType);
        closeCopiedEntryMethod.setAccessible(true);
        java.lang.Object[] closeCopiedEntryMethodArguments = new java.lang.Object[1];
        closeCopiedEntryMethodArguments[0] = true;
        closeCopiedEntryMethod.invoke(zipArchiveOutputStream, closeCopiedEntryMethodArguments);
        
        Object finalZipArchiveOutputStreamEntry = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        
        assertNull(finalZipArchiveOutputStreamEntry);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeCopiedEntry(boolean)}
 *  */
    @Test
    public void testCloseCopiedEntry_4() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setMethod(-255);
        entry1.setSize(-255L);
        setField(entry1, "java.util.zip.ZipEntry", "csize", -9223372032559808512L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", -255L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "hasWritten", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Zip64Mode zip64Mode = Zip64Mode.AsNeeded;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method closeCopiedEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("closeCopiedEntry", booleanType);
        closeCopiedEntryMethod.setAccessible(true);
        java.lang.Object[] closeCopiedEntryMethodArguments = new java.lang.Object[1];
        closeCopiedEntryMethodArguments[0] = true;
        closeCopiedEntryMethod.invoke(zipArchiveOutputStream, closeCopiedEntryMethodArguments);
        
        Object finalZipArchiveOutputStreamEntry = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        
        assertNull(finalZipArchiveOutputStreamEntry);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeCopiedEntry(boolean)}
 *  */
    @Test
    public void testCloseCopiedEntry_5() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setMethod(-255);
        entry1.setSize(-255L);
        setField(entry1, "java.util.zip.ZipEntry", "csize", 4294967295L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", -255L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "hasWritten", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Zip64Mode zip64Mode = Zip64Mode.AsNeeded;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method closeCopiedEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("closeCopiedEntry", booleanType);
        closeCopiedEntryMethod.setAccessible(true);
        java.lang.Object[] closeCopiedEntryMethodArguments = new java.lang.Object[1];
        closeCopiedEntryMethodArguments[0] = true;
        closeCopiedEntryMethod.invoke(zipArchiveOutputStream, closeCopiedEntryMethodArguments);
        
        Object finalZipArchiveOutputStreamEntry = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        
        assertNull(finalZipArchiveOutputStreamEntry);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method closeCopiedEntry(boolean)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeCopiedEntry(boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: preClose();
 *  */
    @Test(expected = IOException.class)
    public void testCloseCopiedEntry_ThrowIOException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        zipArchiveOutputStream.finished = true;
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method closeCopiedEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("closeCopiedEntry", booleanType);
        closeCopiedEntryMethod.setAccessible(true);
        java.lang.Object[] closeCopiedEntryMethodArguments = new java.lang.Object[1];
        closeCopiedEntryMethodArguments[0] = false;
        try {
            closeCopiedEntryMethod.invoke(zipArchiveOutputStream, closeCopiedEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeCopiedEntry(boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: preClose();
 *  */
    @Test(expected = IOException.class)
    public void testCloseCopiedEntry_ThrowIOException_1() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method closeCopiedEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("closeCopiedEntry", booleanType);
        closeCopiedEntryMethod.setAccessible(true);
        java.lang.Object[] closeCopiedEntryMethodArguments = new java.lang.Object[1];
        closeCopiedEntryMethodArguments[0] = false;
        try {
            closeCopiedEntryMethod.invoke(zipArchiveOutputStream, closeCopiedEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeCopiedEntry(boolean)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getSize()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$102(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry,long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#getEffectiveZip64Mode(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#checkIfNeedsZip64(org.apache.commons.compress.archivers.zip.Zip64Mode)
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeEntry(boolean,boolean)
 * @utbot.throwsException {@link java.nio.channels.ClosedChannelException} 
 *  */
    @Test(expected = ClosedChannelException.class)
    public void testCloseCopiedEntry_ThrowClosedChannelException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setSize(-255L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", -255L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "hasWritten", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        FileChannelImpl channel = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        setField(channel, "java.nio.channels.spi.AbstractInterruptibleChannel", "closed", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        Zip64Mode zip64Mode = Zip64Mode.Always;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method closeCopiedEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("closeCopiedEntry", booleanType);
        closeCopiedEntryMethod.setAccessible(true);
        java.lang.Object[] closeCopiedEntryMethodArguments = new java.lang.Object[1];
        closeCopiedEntryMethodArguments[0] = false;
        try {
            closeCopiedEntryMethod.invoke(zipArchiveOutputStream, closeCopiedEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method closeCopiedEntry(boolean)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeCopiedEntry(boolean)}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#preClose()
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getSize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entry.bytesRead = entry.entry.getSize();
 *  */
    @Test
    public void testCloseCopiedEntry_ThrowNullPointerException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "hasWritten", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeCopiedEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeCopiedEntry(ZipArchiveOutputStream.java:531) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method closeCopiedEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("closeCopiedEntry", booleanType);
        closeCopiedEntryMethod.setAccessible(true);
        java.lang.Object[] closeCopiedEntryMethodArguments = new java.lang.Object[1];
        closeCopiedEntryMethodArguments[0] = false;
        try {
            closeCopiedEntryMethod.invoke(zipArchiveOutputStream, closeCopiedEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method closeCopiedEntry(boolean)
    
    @Test
    public void testCloseCopiedEntry1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setSize(4294967295L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "hasWritten", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Zip64Mode zip64Mode = Zip64Mode.AsNeeded;
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zip64Mode", zip64Mode);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method closeCopiedEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("closeCopiedEntry", booleanType);
        closeCopiedEntryMethod.setAccessible(true);
        java.lang.Object[] closeCopiedEntryMethodArguments = new java.lang.Object[1];
        closeCopiedEntryMethodArguments[0] = false;
        closeCopiedEntryMethod.invoke(zipArchiveOutputStream, closeCopiedEntryMethodArguments);
        
        Object finalZipArchiveOutputStreamEntry = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        
        assertNull(finalZipArchiveOutputStreamEntry);
    }
    
    @Test
    public void testCloseCopiedEntry2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setSize(4294967295L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "hasWritten", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method closeCopiedEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("closeCopiedEntry", booleanType);
        closeCopiedEntryMethod.setAccessible(true);
        java.lang.Object[] closeCopiedEntryMethodArguments = new java.lang.Object[1];
        closeCopiedEntryMethodArguments[0] = false;
        closeCopiedEntryMethod.invoke(zipArchiveOutputStream, closeCopiedEntryMethodArguments);
        
        Object finalZipArchiveOutputStreamEntry = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        
        assertNull(finalZipArchiveOutputStreamEntry);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method closeCopiedEntry(boolean)
    
    @Test
    public void testCloseCopiedEntry3() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeCopiedEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipUtil.supportsEncryptionOf(ZipUtil.java:319)
            org.apache.commons.compress.archivers.zip.ZipUtil.checkRequestedFeatures(ZipUtil.java:342)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write(ZipArchiveOutputStream.java:921)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.preClose(ZipArchiveOutputStream.java:558)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeCopiedEntry(ZipArchiveOutputStream.java:530) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method closeCopiedEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("closeCopiedEntry", booleanType);
        closeCopiedEntryMethod.setAccessible(true);
        java.lang.Object[] closeCopiedEntryMethodArguments = new java.lang.Object[1];
        closeCopiedEntryMethodArguments[0] = false;
        try {
            closeCopiedEntryMethod.invoke(zipArchiveOutputStream, closeCopiedEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for closeCopiedEntry
    
    public void testCloseCopiedEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field static final boolean sun.nio.ch.NativeThreadSet.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.ch" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method closeEntry(boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeEntry(boolean,boolean)}
 * @utbot.executesCondition {@code (!phased): False}
 * @utbot.executesCondition {@code (!phased): False}
 *  */
    @Test
    public void testCloseEntry_Phased() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method closeEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("closeEntry", booleanType, booleanType);
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[2];
        closeEntryMethodArguments[0] = false;
        closeEntryMethodArguments[1] = true;
        closeEntryMethod.invoke(zipArchiveOutputStream, closeEntryMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeEntry(boolean,boolean)}
 * @utbot.executesCondition {@code (!phased): True}
 * @utbot.executesCondition {@code (channel != null): False}
 * @utbot.executesCondition {@code (!phased): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 *  */
    @Test
    public void testCloseEntry_NotPhased() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setMethod(-255);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method closeEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("closeEntry", booleanType, booleanType);
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[2];
        closeEntryMethodArguments[0] = false;
        closeEntryMethodArguments[1] = false;
        closeEntryMethod.invoke(zipArchiveOutputStream, closeEntryMethodArguments);
        
        Object finalZipArchiveOutputStreamEntry = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        
        assertNull(finalZipArchiveOutputStreamEntry);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method closeEntry(boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeEntry(boolean,boolean)}
 * @utbot.throwsException {@link java.nio.channels.ClosedChannelException} in: rewriteSizesAndCrc(actuallyNeedsZip64);
 *  */
    @Test(expected = ClosedChannelException.class)
    public void testCloseEntry_ThrowClosedChannelException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        FileChannelImpl channel = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        setField(channel, "java.nio.channels.spi.AbstractInterruptibleChannel", "closed", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method closeEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("closeEntry", booleanType, booleanType);
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[2];
        closeEntryMethodArguments[0] = false;
        closeEntryMethodArguments[1] = false;
        try {
            closeEntryMethod.invoke(zipArchiveOutputStream, closeEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeEntry(boolean,boolean)}
 * @utbot.throwsException {@link java.nio.channels.ClosedChannelException} in: rewriteSizesAndCrc(actuallyNeedsZip64);
 *  */
    @Test(expected = ClosedChannelException.class)
    public void testCloseEntry_ThrowClosedChannelException_1() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "localDataStart", -255L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        AtomicBoolean closed = ((AtomicBoolean) createInstance("java.util.concurrent.atomic.AtomicBoolean"));
        setField(closed, "java.util.concurrent.atomic.AtomicBoolean", "value", 1);
        setField(channel, "org.apache.commons.compress.utils.SeekableInMemoryByteChannel", "closed", closed);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method closeEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("closeEntry", booleanType, booleanType);
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[2];
        closeEntryMethodArguments[0] = false;
        closeEntryMethodArguments[1] = false;
        try {
            closeEntryMethod.invoke(zipArchiveOutputStream, closeEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method closeEntry(boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeEntry(boolean,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: rewriteSizesAndCrc(actuallyNeedsZip64);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCloseEntry_ThrowIllegalArgumentException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "localDataStart", 4294967297L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        AtomicBoolean closed = ((AtomicBoolean) createInstance("java.util.concurrent.atomic.AtomicBoolean"));
        setField(channel, "org.apache.commons.compress.utils.SeekableInMemoryByteChannel", "closed", closed);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method closeEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("closeEntry", booleanType, booleanType);
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[2];
        closeEntryMethodArguments[0] = false;
        closeEntryMethodArguments[1] = false;
        try {
            closeEntryMethod.invoke(zipArchiveOutputStream, closeEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeEntry(boolean,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: rewriteSizesAndCrc(actuallyNeedsZip64);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCloseEntry_ThrowIllegalArgumentException_1() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "localDataStart", -255L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        AtomicBoolean closed = ((AtomicBoolean) createInstance("java.util.concurrent.atomic.AtomicBoolean"));
        setField(channel, "org.apache.commons.compress.utils.SeekableInMemoryByteChannel", "closed", closed);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method closeEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("closeEntry", booleanType, booleanType);
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[2];
        closeEntryMethodArguments[0] = false;
        closeEntryMethodArguments[1] = false;
        try {
            closeEntryMethod.invoke(zipArchiveOutputStream, closeEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method closeEntry(boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeEntry(boolean,boolean)}
 * @utbot.executesCondition {@code (!phased): True}
 * @utbot.executesCondition {@code (channel != null): True}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#rewriteSizesAndCrc(boolean)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: rewriteSizesAndCrc(actuallyNeedsZip64);
 *  */
    @Test
    public void testCloseEntry_ThrowNullPointerException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "localDataStart", 1L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        AtomicBoolean closed = ((AtomicBoolean) createInstance("java.util.concurrent.atomic.AtomicBoolean"));
        setField(channel, "org.apache.commons.compress.utils.SeekableInMemoryByteChannel", "closed", closed);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.rewriteSizesAndCrc(ZipArchiveOutputStream.java:676)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeEntry(ZipArchiveOutputStream.java:539) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class booleanType = boolean.class;
        Method closeEntryMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("closeEntry", booleanType, booleanType);
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[2];
        closeEntryMethodArguments[0] = false;
        closeEntryMethodArguments[1] = false;
        try {
            closeEntryMethod.invoke(zipArchiveOutputStream, closeEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for closeEntry
    
    public void testCloseEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        /* Unable to make field static final boolean sun.nio.ch.NativeThreadSet.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.ch" to unnamed module @4fcd19b3 */
        
        // 7 occurrences of:
        /* Unable to make field private static final jdk.internal.access.JavaIOFileDescriptorAccess sun.nio.ch.FileChannelImpl.fdAccess accessible:
        module java.base does not "opens sun.nio.ch" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // No such field java.lang.Object blockerLock found in org.utbot.engine.overrides.threads.UtThread
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isZip64Required
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isZip64Required(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.Zip64Mode)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#isZip64Required(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.returnsFrom {@code return requestedMode == Zip64Mode.Always || isTooLageForZip32(entry1);}
 *  */
    @Test
    public void testIsZip64Required_RequestedModeEqualsZip64ModeAlwaysOrIsTooLageForZip32() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Zip64Mode zip64Mode = Zip64Mode.Always;
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method isZip64RequiredMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("isZip64Required", zipArchiveEntryType, zip64ModeType);
        isZip64RequiredMethod.setAccessible(true);
        java.lang.Object[] isZip64RequiredMethodArguments = new java.lang.Object[2];
        isZip64RequiredMethodArguments[0] = ((Object) null);
        isZip64RequiredMethodArguments[1] = zip64Mode;
        boolean actual = ((Boolean) isZip64RequiredMethod.invoke(zipArchiveOutputStream, isZip64RequiredMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#isZip64Required(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.returnsFrom {@code return requestedMode == Zip64Mode.Always || isTooLageForZip32(entry1);}
 *  */
    @Test
    public void testIsZip64Required_RequestedModeEqualsZip64ModeAlwaysOrIsTooLageForZip32_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        jarArchiveEntry.setSize(-255L);
        setField(jarArchiveEntry, "java.util.zip.ZipEntry", "csize", -9223372032559808512L);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class jarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method isZip64RequiredMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("isZip64Required", jarArchiveEntryType, zip64ModeType);
        isZip64RequiredMethod.setAccessible(true);
        java.lang.Object[] isZip64RequiredMethodArguments = new java.lang.Object[2];
        isZip64RequiredMethodArguments[0] = jarArchiveEntry;
        isZip64RequiredMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) isZip64RequiredMethod.invoke(zipArchiveOutputStream, isZip64RequiredMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#isZip64Required(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.returnsFrom {@code return requestedMode == Zip64Mode.Always || isTooLageForZip32(entry1);}
 *  */
    @Test
    public void testIsZip64Required_RequestedModeNotEqualsZip64ModeAlwaysOrIsTooLageForZip32() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        jarArchiveEntry.setSize(-255L);
        setField(jarArchiveEntry, "java.util.zip.ZipEntry", "csize", 4294967295L);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class jarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method isZip64RequiredMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("isZip64Required", jarArchiveEntryType, zip64ModeType);
        isZip64RequiredMethod.setAccessible(true);
        java.lang.Object[] isZip64RequiredMethodArguments = new java.lang.Object[2];
        isZip64RequiredMethodArguments[0] = jarArchiveEntry;
        isZip64RequiredMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) isZip64RequiredMethod.invoke(zipArchiveOutputStream, isZip64RequiredMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isZip64Required(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.Zip64Mode)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#isZip64Required(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#isTooLageForZip32(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return requestedMode == Zip64Mode.Always || isTooLageForZip32(entry1);
 *  */
    @Test
    public void testIsZip64Required_ThrowNullPointerException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isZip64Required] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isTooLageForZip32(ZipArchiveOutputStream.java:663)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isZip64Required(ZipArchiveOutputStream.java:659) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method isZip64RequiredMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("isZip64Required", zipArchiveEntryType, zip64ModeType);
        isZip64RequiredMethod.setAccessible(true);
        java.lang.Object[] isZip64RequiredMethodArguments = new java.lang.Object[2];
        isZip64RequiredMethodArguments[0] = ((Object) null);
        isZip64RequiredMethodArguments[1] = ((Object) null);
        try {
            isZip64RequiredMethod.invoke(zipArchiveOutputStream, isZip64RequiredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for isZip64Required
    
    public void testIsZip64Required_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setDefaults
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDefaults(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#setDefaults(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (entry.getMethod() == -1): False}
 *  */
    @Test
    public void testSetDefaults_EntryGetMethodNotEqualsNegative1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        jarArchiveEntry.setMethod(-255);
        FileTime mtime = ((FileTime) createInstance("java.nio.file.attribute.FileTime"));
        TimeUnit unit = TimeUnit.NANOSECONDS;
        setField(mtime, "java.nio.file.attribute.FileTime", "unit", unit);
        setField(mtime, "java.nio.file.attribute.FileTime", "value", 1L);
        setField(jarArchiveEntry, "java.util.zip.ZipEntry", "mtime", mtime);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class jarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Method setDefaultsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("setDefaults", jarArchiveEntryType);
        setDefaultsMethod.setAccessible(true);
        java.lang.Object[] setDefaultsMethodArguments = new java.lang.Object[1];
        setDefaultsMethodArguments[0] = jarArchiveEntry;
        setDefaultsMethod.invoke(zipArchiveOutputStream, setDefaultsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#setDefaults(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (entry.getMethod() == -1): False}
 *  */
    @Test
    public void testSetDefaults_EntryGetMethodNotEqualsNegative1_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        jarArchiveEntry.setMethod(-255);
        FileTime mtime = ((FileTime) createInstance("java.nio.file.attribute.FileTime"));
        Instant instant = ((Instant) createInstance("java.time.Instant"));
        setField(instant, "java.time.Instant", "seconds", -378494056L);
        setField(instant, "java.time.Instant", "nanos", 512491520);
        setField(mtime, "java.nio.file.attribute.FileTime", "instant", instant);
        setField(jarArchiveEntry, "java.util.zip.ZipEntry", "mtime", mtime);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class jarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Method setDefaultsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("setDefaults", jarArchiveEntryType);
        setDefaultsMethod.setAccessible(true);
        java.lang.Object[] setDefaultsMethodArguments = new java.lang.Object[1];
        setDefaultsMethodArguments[0] = jarArchiveEntry;
        setDefaultsMethod.invoke(zipArchiveOutputStream, setDefaultsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#setDefaults(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (entry.getMethod() == -1): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setMethod(int)}
 *  */
    @Test
    public void testSetDefaults_EntryGetMethodEqualsNegative1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        jarArchiveEntry.setMethod(-1);
        FileTime mtime = ((FileTime) createInstance("java.nio.file.attribute.FileTime"));
        Instant instant = ((Instant) createInstance("java.time.Instant"));
        setField(instant, "java.time.Instant", "seconds", 0L);
        setField(instant, "java.time.Instant", "nanos", -960913727);
        setField(mtime, "java.nio.file.attribute.FileTime", "instant", instant);
        setField(jarArchiveEntry, "java.util.zip.ZipEntry", "mtime", mtime);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class jarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Method setDefaultsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("setDefaults", jarArchiveEntryType);
        setDefaultsMethod.setAccessible(true);
        java.lang.Object[] setDefaultsMethodArguments = new java.lang.Object[1];
        setDefaultsMethodArguments[0] = jarArchiveEntry;
        setDefaultsMethod.invoke(zipArchiveOutputStream, setDefaultsMethodArguments);
        
        int finalJarArchiveEntryMethod = ((Integer) getFieldValue(jarArchiveEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "method"));
        
        assertEquals(0, finalJarArchiveEntryMethod);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDefaults(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#setDefaults(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (entry.getMethod() == -1): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getMethod()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getTime()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: entry.getTime() == -1
 *  */
    @Test
    public void testSetDefaults_ThrowArithmeticException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        jarArchiveEntry.setMethod(-255);
        FileTime mtime = ((FileTime) createInstance("java.nio.file.attribute.FileTime"));
        TimeUnit unit = TimeUnit.NANOSECONDS;
        setField(mtime, "java.nio.file.attribute.FileTime", "unit", unit);
        setField(mtime, "java.nio.file.attribute.FileTime", "value", 0L);
        setField(jarArchiveEntry, "java.util.zip.ZipEntry", "mtime", mtime);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setDefaults] produces [java.lang.ArithmeticException: / by zero] */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class jarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Method setDefaultsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("setDefaults", jarArchiveEntryType);
        setDefaultsMethod.setAccessible(true);
        java.lang.Object[] setDefaultsMethodArguments = new java.lang.Object[1];
        setDefaultsMethodArguments[0] = jarArchiveEntry;
        try {
            setDefaultsMethod.invoke(zipArchiveOutputStream, setDefaultsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#setDefaults(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getMethod()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: entry.getMethod() == -1
 *  */
    @Test
    public void testSetDefaults_ThrowNullPointerException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setDefaults] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setDefaults(ZipArchiveOutputStream.java:794) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Method setDefaultsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("setDefaults", zipArchiveEntryType);
        setDefaultsMethod.setAccessible(true);
        java.lang.Object[] setDefaultsMethodArguments = new java.lang.Object[1];
        setDefaultsMethodArguments[0] = ((Object) null);
        try {
            setDefaultsMethod.invoke(zipArchiveOutputStream, setDefaultsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for setDefaults
    
    public void testSetDefaults_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private final java.lang.String java.time.temporal.ChronoUnit.name accessible: module
        java.base does not "opens java.time.temporal" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flushDeflater
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method flushDeflater()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#flushDeflater()}
 * @utbot.executesCondition {@code (entry.entry.getMethod() == DEFLATED): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getMethod()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.StreamCompressor#flushDeflater()}
 *  */
    @Test
    public void testFlushDeflater_EntryEntryGetMethodEqualsDEFLATED() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        JarArchiveEntry entry1 = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry1.setMethod(8);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$OutputStreamCompressor");
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "def", def);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Method flushDeflaterMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("flushDeflater");
        flushDeflaterMethod.setAccessible(true);
        java.lang.Object[] flushDeflaterMethodArguments = new java.lang.Object[0];
        flushDeflaterMethod.invoke(zipArchiveOutputStream, flushDeflaterMethodArguments);
        
        StreamCompressor zipArchiveOutputStreamStreamCompressor = ((StreamCompressor) getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor"));
        Deflater zipArchiveOutputStreamStreamCompressorStreamCompressorDef = ((Deflater) getFieldValue(zipArchiveOutputStreamStreamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "def"));
        boolean finalZipArchiveOutputStreamStreamCompressorDefFinish = ((Boolean) getFieldValue(zipArchiveOutputStreamStreamCompressorStreamCompressorDef, "java.util.zip.Deflater", "finish"));
        
        assertTrue(finalZipArchiveOutputStreamStreamCompressorDefFinish);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method flushDeflater()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#flushDeflater()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: entry.entry.getMethod() == DEFLATED
 *  */
    @Test
    public void testFlushDeflater_ThrowNullPointerException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flushDeflater] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flushDeflater(ZipArchiveOutputStream.java:596) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Method flushDeflaterMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("flushDeflater");
        flushDeflaterMethod.setAccessible(true);
        java.lang.Object[] flushDeflaterMethodArguments = new java.lang.Object[0];
        try {
            flushDeflaterMethod.invoke(zipArchiveOutputStream, flushDeflaterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for flushDeflater
    
    public void testFlushDeflater_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isTooLageForZip32
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isTooLageForZip32(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#isTooLageForZip32(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.returnsFrom {@code return zipArchiveEntry.getSize() >= ZIP64_MAGIC || zipArchiveEntry.getCompressedSize() >= ZIP64_MAGIC;}
 *  */
    @Test
    public void testIsTooLageForZip32_ZipArchiveEntryGetSizeLessThanZIP64_MAGICOrZipArchiveEntryGetCompressedSizeLessThanZIP64_MAGIC() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        jarArchiveEntry.setSize(-255L);
        setField(jarArchiveEntry, "java.util.zip.ZipEntry", "csize", -9223372032559808512L);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class jarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Method isTooLageForZip32Method = zipArchiveOutputStreamClazz.getDeclaredMethod("isTooLageForZip32", jarArchiveEntryType);
        isTooLageForZip32Method.setAccessible(true);
        java.lang.Object[] isTooLageForZip32MethodArguments = new java.lang.Object[1];
        isTooLageForZip32MethodArguments[0] = jarArchiveEntry;
        boolean actual = ((Boolean) isTooLageForZip32Method.invoke(zipArchiveOutputStream, isTooLageForZip32MethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#isTooLageForZip32(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.returnsFrom {@code return zipArchiveEntry.getSize() >= ZIP64_MAGIC || zipArchiveEntry.getCompressedSize() >= ZIP64_MAGIC;}
 *  */
    @Test
    public void testIsTooLageForZip32_ZipArchiveEntryGetSizeGreaterOrEqualZIP64_MAGICOrZipArchiveEntryGetCompressedSizeGreaterOrEqualZIP64_MAGIC() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        jarArchiveEntry.setSize(-255L);
        setField(jarArchiveEntry, "java.util.zip.ZipEntry", "csize", 4294967295L);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class jarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Method isTooLageForZip32Method = zipArchiveOutputStreamClazz.getDeclaredMethod("isTooLageForZip32", jarArchiveEntryType);
        isTooLageForZip32Method.setAccessible(true);
        java.lang.Object[] isTooLageForZip32MethodArguments = new java.lang.Object[1];
        isTooLageForZip32MethodArguments[0] = jarArchiveEntry;
        boolean actual = ((Boolean) isTooLageForZip32Method.invoke(zipArchiveOutputStream, isTooLageForZip32MethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isTooLageForZip32(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#isTooLageForZip32(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getSize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return zipArchiveEntry.getSize() >= ZIP64_MAGIC || zipArchiveEntry.getCompressedSize() >= ZIP64_MAGIC;
 *  */
    @Test
    public void testIsTooLageForZip32_ThrowNullPointerException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isTooLageForZip32] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isTooLageForZip32(ZipArchiveOutputStream.java:663) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Method isTooLageForZip32Method = zipArchiveOutputStreamClazz.getDeclaredMethod("isTooLageForZip32", zipArchiveEntryType);
        isTooLageForZip32Method.setAccessible(true);
        java.lang.Object[] isTooLageForZip32MethodArguments = new java.lang.Object[1];
        isTooLageForZip32MethodArguments[0] = ((Object) null);
        try {
            isTooLageForZip32Method.invoke(zipArchiveOutputStream, isTooLageForZip32MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for isTooLageForZip32
    
    public void testIsTooLageForZip32_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleSizesAndCrc
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleSizesAndCrc(long, long, org.apache.commons.compress.archivers.zip.Zip64Mode)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#handleSizesAndCrc(long,long,org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.executesCondition {@code (entry.entry.getMethod() == DEFLATED): True}
 * @utbot.returnsFrom {@code return checkIfNeedsZip64(effectiveMode);}
 *  */
    @Test
    public void testHandleSizesAndCrc_EntryEntryGetMethodEqualsDEFLATED() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        Object entry1 = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        (((ZipArchiveEntry) entry1)).setMethod(8);
        (((ZipArchiveEntry) entry1)).setSize(-255L);
        (((ZipEntry) entry1)).setCrc(0L);
        setField(entry1, "java.util.zip.ZipEntry", "csize", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", 0L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Zip64Mode zip64Mode = Zip64Mode.Always;
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class longType = long.class;
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method handleSizesAndCrcMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("handleSizesAndCrc", longType, longType, zip64ModeType);
        handleSizesAndCrcMethod.setAccessible(true);
        java.lang.Object[] handleSizesAndCrcMethodArguments = new java.lang.Object[3];
        handleSizesAndCrcMethodArguments[0] = -255L;
        handleSizesAndCrcMethodArguments[1] = 1L;
        handleSizesAndCrcMethodArguments[2] = zip64Mode;
        boolean actual = ((Boolean) handleSizesAndCrcMethod.invoke(zipArchiveOutputStream, handleSizesAndCrcMethodArguments));
        
        assertTrue(actual);
        
        Object zipArchiveOutputStreamEntry = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        ZipArchiveEntry zipArchiveOutputStreamEntryEntryEntry = ((ZipArchiveEntry) getFieldValue(zipArchiveOutputStreamEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry"));
        long finalZipArchiveOutputStreamEntryEntrySize = ((Long) getFieldValue(zipArchiveOutputStreamEntryEntryEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "size"));
        Object zipArchiveOutputStreamEntry1 = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        ZipArchiveEntry zipArchiveOutputStreamEntry1EntryEntry = ((ZipArchiveEntry) getFieldValue(zipArchiveOutputStreamEntry1, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry"));
        long finalZipArchiveOutputStreamEntryEntryCrc = ((Long) getFieldValue(zipArchiveOutputStreamEntry1EntryEntry, "java.util.zip.ZipEntry", "crc"));
        Object zipArchiveOutputStreamEntry2 = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        ZipArchiveEntry zipArchiveOutputStreamEntry2EntryEntry = ((ZipArchiveEntry) getFieldValue(zipArchiveOutputStreamEntry2, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry"));
        long finalZipArchiveOutputStreamEntryEntryCsize = ((Long) getFieldValue(zipArchiveOutputStreamEntry2EntryEntry, "java.util.zip.ZipEntry", "csize"));
        Object zipArchiveOutputStreamEntry3 = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        ZipArchiveEntry zipArchiveOutputStreamEntry3EntryEntry = ((ZipArchiveEntry) getFieldValue(zipArchiveOutputStreamEntry3, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry"));
        boolean finalZipArchiveOutputStreamEntryEntryCsizeSet = ((Boolean) getFieldValue(zipArchiveOutputStreamEntry3EntryEntry, "java.util.zip.ZipEntry", "csizeSet"));
        
        assertEquals(0L, finalZipArchiveOutputStreamEntryEntrySize);
        
        assertEquals(1L, finalZipArchiveOutputStreamEntryEntryCrc);
        
        assertEquals(-255L, finalZipArchiveOutputStreamEntryEntryCsize);
        
        assertTrue(finalZipArchiveOutputStreamEntryEntryCsizeSet);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#handleSizesAndCrc(long,long,org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.executesCondition {@code (entry.entry.getMethod() == DEFLATED): True}
 * @utbot.returnsFrom {@code return checkIfNeedsZip64(effectiveMode);}
 *  */
    @Test
    public void testHandleSizesAndCrc_EntryEntryGetMethodEqualsDEFLATED_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        JarArchiveEntry entry1 = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry1.setMethod(8);
        entry1.setSize(0L);
        entry1.setCrc(0L);
        setField(entry1, "java.util.zip.ZipEntry", "csize", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", 8589934593L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class longType = long.class;
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method handleSizesAndCrcMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("handleSizesAndCrc", longType, longType, zip64ModeType);
        handleSizesAndCrcMethod.setAccessible(true);
        java.lang.Object[] handleSizesAndCrcMethodArguments = new java.lang.Object[3];
        handleSizesAndCrcMethodArguments[0] = -255L;
        handleSizesAndCrcMethodArguments[1] = 1L;
        handleSizesAndCrcMethodArguments[2] = ((Object) null);
        boolean actual = ((Boolean) handleSizesAndCrcMethod.invoke(zipArchiveOutputStream, handleSizesAndCrcMethodArguments));
        
        assertTrue(actual);
        
        Object zipArchiveOutputStreamEntry = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        ZipArchiveEntry zipArchiveOutputStreamEntryEntryEntry = ((ZipArchiveEntry) getFieldValue(zipArchiveOutputStreamEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry"));
        long finalZipArchiveOutputStreamEntryEntrySize = ((Long) getFieldValue(zipArchiveOutputStreamEntryEntryEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "size"));
        Object zipArchiveOutputStreamEntry1 = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        ZipArchiveEntry zipArchiveOutputStreamEntry1EntryEntry = ((ZipArchiveEntry) getFieldValue(zipArchiveOutputStreamEntry1, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry"));
        long finalZipArchiveOutputStreamEntryEntryCrc = ((Long) getFieldValue(zipArchiveOutputStreamEntry1EntryEntry, "java.util.zip.ZipEntry", "crc"));
        Object zipArchiveOutputStreamEntry2 = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        ZipArchiveEntry zipArchiveOutputStreamEntry2EntryEntry = ((ZipArchiveEntry) getFieldValue(zipArchiveOutputStreamEntry2, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry"));
        long finalZipArchiveOutputStreamEntryEntryCsize = ((Long) getFieldValue(zipArchiveOutputStreamEntry2EntryEntry, "java.util.zip.ZipEntry", "csize"));
        Object zipArchiveOutputStreamEntry3 = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        ZipArchiveEntry zipArchiveOutputStreamEntry3EntryEntry = ((ZipArchiveEntry) getFieldValue(zipArchiveOutputStreamEntry3, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry"));
        boolean finalZipArchiveOutputStreamEntryEntryCsizeSet = ((Boolean) getFieldValue(zipArchiveOutputStreamEntry3EntryEntry, "java.util.zip.ZipEntry", "csizeSet"));
        
        assertEquals(8589934593L, finalZipArchiveOutputStreamEntryEntrySize);
        
        assertEquals(1L, finalZipArchiveOutputStreamEntryEntryCrc);
        
        assertEquals(-255L, finalZipArchiveOutputStreamEntryEntryCsize);
        
        assertTrue(finalZipArchiveOutputStreamEntryEntryCsizeSet);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#handleSizesAndCrc(long,long,org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.executesCondition {@code (entry.entry.getMethod() == DEFLATED): True}
 * @utbot.returnsFrom {@code return checkIfNeedsZip64(effectiveMode);}
 *  */
    @Test
    public void testHandleSizesAndCrc_EntryEntryGetMethodEqualsDEFLATED_2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setMethod(8);
        entry1.setSize(-255L);
        entry1.setCrc(0L);
        setField(entry1, "java.util.zip.ZipEntry", "csize", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", 0L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class longType = long.class;
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method handleSizesAndCrcMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("handleSizesAndCrc", longType, longType, zip64ModeType);
        handleSizesAndCrcMethod.setAccessible(true);
        java.lang.Object[] handleSizesAndCrcMethodArguments = new java.lang.Object[3];
        handleSizesAndCrcMethodArguments[0] = -255L;
        handleSizesAndCrcMethodArguments[1] = 1L;
        handleSizesAndCrcMethodArguments[2] = ((Object) null);
        boolean actual = ((Boolean) handleSizesAndCrcMethod.invoke(zipArchiveOutputStream, handleSizesAndCrcMethodArguments));
        
        assertFalse(actual);
        
        Object zipArchiveOutputStreamEntry = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        ZipArchiveEntry zipArchiveOutputStreamEntryEntryEntry = ((ZipArchiveEntry) getFieldValue(zipArchiveOutputStreamEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry"));
        long finalZipArchiveOutputStreamEntryEntrySize = ((Long) getFieldValue(zipArchiveOutputStreamEntryEntryEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "size"));
        Object zipArchiveOutputStreamEntry1 = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        ZipArchiveEntry zipArchiveOutputStreamEntry1EntryEntry = ((ZipArchiveEntry) getFieldValue(zipArchiveOutputStreamEntry1, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry"));
        long finalZipArchiveOutputStreamEntryEntryCrc = ((Long) getFieldValue(zipArchiveOutputStreamEntry1EntryEntry, "java.util.zip.ZipEntry", "crc"));
        Object zipArchiveOutputStreamEntry2 = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        ZipArchiveEntry zipArchiveOutputStreamEntry2EntryEntry = ((ZipArchiveEntry) getFieldValue(zipArchiveOutputStreamEntry2, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry"));
        long finalZipArchiveOutputStreamEntryEntryCsize = ((Long) getFieldValue(zipArchiveOutputStreamEntry2EntryEntry, "java.util.zip.ZipEntry", "csize"));
        Object zipArchiveOutputStreamEntry3 = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        ZipArchiveEntry zipArchiveOutputStreamEntry3EntryEntry = ((ZipArchiveEntry) getFieldValue(zipArchiveOutputStreamEntry3, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry"));
        boolean finalZipArchiveOutputStreamEntryEntryCsizeSet = ((Boolean) getFieldValue(zipArchiveOutputStreamEntry3EntryEntry, "java.util.zip.ZipEntry", "csizeSet"));
        
        assertEquals(0L, finalZipArchiveOutputStreamEntryEntrySize);
        
        assertEquals(1L, finalZipArchiveOutputStreamEntryEntryCrc);
        
        assertEquals(-255L, finalZipArchiveOutputStreamEntryEntryCsize);
        
        assertTrue(finalZipArchiveOutputStreamEntryEntryCsizeSet);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#handleSizesAndCrc(long,long,org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.executesCondition {@code (entry.entry.getMethod() == DEFLATED): True}
 * @utbot.returnsFrom {@code return checkIfNeedsZip64(effectiveMode);}
 *  */
    @Test
    public void testHandleSizesAndCrc_EntryEntryGetMethodEqualsDEFLATED_3() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        JarArchiveEntry entry1 = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry1.setMethod(8);
        entry1.setSize(-255L);
        entry1.setCrc(0L);
        setField(entry1, "java.util.zip.ZipEntry", "csize", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", 0L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class longType = long.class;
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method handleSizesAndCrcMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("handleSizesAndCrc", longType, longType, zip64ModeType);
        handleSizesAndCrcMethod.setAccessible(true);
        java.lang.Object[] handleSizesAndCrcMethodArguments = new java.lang.Object[3];
        handleSizesAndCrcMethodArguments[0] = 4294967296L;
        handleSizesAndCrcMethodArguments[1] = 1L;
        handleSizesAndCrcMethodArguments[2] = ((Object) null);
        boolean actual = ((Boolean) handleSizesAndCrcMethod.invoke(zipArchiveOutputStream, handleSizesAndCrcMethodArguments));
        
        assertTrue(actual);
        
        Object zipArchiveOutputStreamEntry = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        ZipArchiveEntry zipArchiveOutputStreamEntryEntryEntry = ((ZipArchiveEntry) getFieldValue(zipArchiveOutputStreamEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry"));
        long finalZipArchiveOutputStreamEntryEntrySize = ((Long) getFieldValue(zipArchiveOutputStreamEntryEntryEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "size"));
        Object zipArchiveOutputStreamEntry1 = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        ZipArchiveEntry zipArchiveOutputStreamEntry1EntryEntry = ((ZipArchiveEntry) getFieldValue(zipArchiveOutputStreamEntry1, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry"));
        long finalZipArchiveOutputStreamEntryEntryCrc = ((Long) getFieldValue(zipArchiveOutputStreamEntry1EntryEntry, "java.util.zip.ZipEntry", "crc"));
        Object zipArchiveOutputStreamEntry2 = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        ZipArchiveEntry zipArchiveOutputStreamEntry2EntryEntry = ((ZipArchiveEntry) getFieldValue(zipArchiveOutputStreamEntry2, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry"));
        long finalZipArchiveOutputStreamEntryEntryCsize = ((Long) getFieldValue(zipArchiveOutputStreamEntry2EntryEntry, "java.util.zip.ZipEntry", "csize"));
        Object zipArchiveOutputStreamEntry3 = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        ZipArchiveEntry zipArchiveOutputStreamEntry3EntryEntry = ((ZipArchiveEntry) getFieldValue(zipArchiveOutputStreamEntry3, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry"));
        boolean finalZipArchiveOutputStreamEntryEntryCsizeSet = ((Boolean) getFieldValue(zipArchiveOutputStreamEntry3EntryEntry, "java.util.zip.ZipEntry", "csizeSet"));
        
        assertEquals(0L, finalZipArchiveOutputStreamEntryEntrySize);
        
        assertEquals(1L, finalZipArchiveOutputStreamEntryEntryCrc);
        
        assertEquals(4294967296L, finalZipArchiveOutputStreamEntryEntryCsize);
        
        assertTrue(finalZipArchiveOutputStreamEntryEntryCsizeSet);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#handleSizesAndCrc(long,long,org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.executesCondition {@code (entry.entry.getMethod() == DEFLATED): False}
 * @utbot.executesCondition {@code (channel == null): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setSize(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setCompressedSize(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setCrc(long)}
 * @utbot.returnsFrom {@code return checkIfNeedsZip64(effectiveMode);}
 *  */
    @Test
    public void testHandleSizesAndCrc_ChannelNotEqualsNull() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        JarArchiveEntry entry1 = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry1.setMethod(-255);
        entry1.setSize(0L);
        entry1.setCrc(0L);
        setField(entry1, "java.util.zip.ZipEntry", "csize", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        Zip64Mode zip64Mode = Zip64Mode.Always;
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class longType = long.class;
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method handleSizesAndCrcMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("handleSizesAndCrc", longType, longType, zip64ModeType);
        handleSizesAndCrcMethod.setAccessible(true);
        java.lang.Object[] handleSizesAndCrcMethodArguments = new java.lang.Object[3];
        handleSizesAndCrcMethodArguments[0] = 0L;
        handleSizesAndCrcMethodArguments[1] = 1L;
        handleSizesAndCrcMethodArguments[2] = zip64Mode;
        boolean actual = ((Boolean) handleSizesAndCrcMethod.invoke(zipArchiveOutputStream, handleSizesAndCrcMethodArguments));
        
        assertTrue(actual);
        
        Object zipArchiveOutputStreamEntry = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        ZipArchiveEntry zipArchiveOutputStreamEntryEntryEntry = ((ZipArchiveEntry) getFieldValue(zipArchiveOutputStreamEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry"));
        long finalZipArchiveOutputStreamEntryEntryCrc = ((Long) getFieldValue(zipArchiveOutputStreamEntryEntryEntry, "java.util.zip.ZipEntry", "crc"));
        Object zipArchiveOutputStreamEntry1 = getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry");
        ZipArchiveEntry zipArchiveOutputStreamEntry1EntryEntry = ((ZipArchiveEntry) getFieldValue(zipArchiveOutputStreamEntry1, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry"));
        boolean finalZipArchiveOutputStreamEntryEntryCsizeSet = ((Boolean) getFieldValue(zipArchiveOutputStreamEntry1EntryEntry, "java.util.zip.ZipEntry", "csizeSet"));
        
        assertEquals(1L, finalZipArchiveOutputStreamEntryEntryCrc);
        
        assertTrue(finalZipArchiveOutputStreamEntryEntryCsizeSet);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#handleSizesAndCrc(long,long,org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.executesCondition {@code (entry.entry.getMethod() == DEFLATED): False}
 * @utbot.executesCondition {@code (channel == null): True}
 * @utbot.executesCondition {@code (entry.entry.getCrc() != crc): False}
 * @utbot.executesCondition {@code (entry.entry.getSize() != bytesWritten): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getCrc()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getSize()}
 * @utbot.returnsFrom {@code return checkIfNeedsZip64(effectiveMode);}
 *  */
    @Test
    public void testHandleSizesAndCrc_EntryEntryGetSizeEqualsBytesWritten() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setMethod(-256);
        entry1.setSize(-255L);
        entry1.setCrc(-255L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Zip64Mode zip64Mode = Zip64Mode.Always;
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class longType = long.class;
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method handleSizesAndCrcMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("handleSizesAndCrc", longType, longType, zip64ModeType);
        handleSizesAndCrcMethod.setAccessible(true);
        java.lang.Object[] handleSizesAndCrcMethodArguments = new java.lang.Object[3];
        handleSizesAndCrcMethodArguments[0] = -255L;
        handleSizesAndCrcMethodArguments[1] = -255L;
        handleSizesAndCrcMethodArguments[2] = zip64Mode;
        boolean actual = ((Boolean) handleSizesAndCrcMethod.invoke(zipArchiveOutputStream, handleSizesAndCrcMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleSizesAndCrc(long, long, org.apache.commons.compress.archivers.zip.Zip64Mode)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#handleSizesAndCrc(long,long,org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: entry.entry.getMethod() == DEFLATED
 *  */
    @Test
    public void testHandleSizesAndCrc_ThrowNullPointerException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleSizesAndCrc] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleSizesAndCrc(ZipArchiveOutputStream.java:610) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class longType = long.class;
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method handleSizesAndCrcMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("handleSizesAndCrc", longType, longType, zip64ModeType);
        handleSizesAndCrcMethod.setAccessible(true);
        java.lang.Object[] handleSizesAndCrcMethodArguments = new java.lang.Object[3];
        handleSizesAndCrcMethodArguments[0] = -255L;
        handleSizesAndCrcMethodArguments[1] = -255L;
        handleSizesAndCrcMethodArguments[2] = ((Object) null);
        try {
            handleSizesAndCrcMethod.invoke(zipArchiveOutputStream, handleSizesAndCrcMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method handleSizesAndCrc(long, long, org.apache.commons.compress.archivers.zip.Zip64Mode)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#handleSizesAndCrc(long,long,org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.executesCondition {@code (entry.entry.getMethod() == DEFLATED): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$100(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setSize(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setCompressedSize(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setCrc(long)}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#checkIfNeedsZip64(org.apache.commons.compress.archivers.zip.Zip64Mode)
 * @utbot.throwsException {@link org.apache.commons.compress.archivers.zip.Zip64RequiredException} in: return checkIfNeedsZip64(effectiveMode);
 *  */
    @Test(expected = Zip64RequiredException.class)
    public void testHandleSizesAndCrc_ThrowZip64RequiredException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setMethod(8);
        entry1.setSize(0L);
        entry1.setCrc(0L);
        setField(entry1, "java.util.zip.ZipEntry", "csize", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", 8589934593L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Zip64Mode zip64Mode = Zip64Mode.Never;
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class longType = long.class;
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method handleSizesAndCrcMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("handleSizesAndCrc", longType, longType, zip64ModeType);
        handleSizesAndCrcMethod.setAccessible(true);
        java.lang.Object[] handleSizesAndCrcMethodArguments = new java.lang.Object[3];
        handleSizesAndCrcMethodArguments[0] = -255L;
        handleSizesAndCrcMethodArguments[1] = 1L;
        handleSizesAndCrcMethodArguments[2] = zip64Mode;
        try {
            handleSizesAndCrcMethod.invoke(zipArchiveOutputStream, handleSizesAndCrcMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#handleSizesAndCrc(long,long,org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.executesCondition {@code (entry.entry.getMethod() == DEFLATED): False}
 * @utbot.executesCondition {@code (channel == null): True}
 * @utbot.executesCondition {@code (entry.entry.getCrc() != crc): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getCrc()}
 * @utbot.invokes {@link java.lang.Long#toHexString(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Long#toHexString(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: Long.toHexString(crc)
 *  */
    @Test(expected = ZipException.class)
    public void testHandleSizesAndCrc_ThrowZipException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setCrc(1L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class longType = long.class;
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method handleSizesAndCrcMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("handleSizesAndCrc", longType, longType, zip64ModeType);
        handleSizesAndCrcMethod.setAccessible(true);
        java.lang.Object[] handleSizesAndCrcMethodArguments = new java.lang.Object[3];
        handleSizesAndCrcMethodArguments[0] = -255L;
        handleSizesAndCrcMethodArguments[1] = 0L;
        handleSizesAndCrcMethodArguments[2] = ((Object) null);
        try {
            handleSizesAndCrcMethod.invoke(zipArchiveOutputStream, handleSizesAndCrcMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#handleSizesAndCrc(long,long,org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.executesCondition {@code (entry.entry.getMethod() == DEFLATED): False}
 * @utbot.executesCondition {@code (channel == null): True}
 * @utbot.executesCondition {@code (entry.entry.getCrc() != crc): False}
 * @utbot.executesCondition {@code (entry.entry.getSize() != bytesWritten): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getSize()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getSize()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: entry.entry.getSize()
 *  */
    @Test(expected = ZipException.class)
    public void testHandleSizesAndCrc_ThrowZipException_1() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setSize(9223372036854775555L);
        entry1.setCrc(0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class longType = long.class;
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method handleSizesAndCrcMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("handleSizesAndCrc", longType, longType, zip64ModeType);
        handleSizesAndCrcMethod.setAccessible(true);
        java.lang.Object[] handleSizesAndCrcMethodArguments = new java.lang.Object[3];
        handleSizesAndCrcMethodArguments[0] = -254L;
        handleSizesAndCrcMethodArguments[1] = 0L;
        handleSizesAndCrcMethodArguments[2] = ((Object) null);
        try {
            handleSizesAndCrcMethod.invoke(zipArchiveOutputStream, handleSizesAndCrcMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method handleSizesAndCrc(long, long, org.apache.commons.compress.archivers.zip.Zip64Mode)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#handleSizesAndCrc(long,long,org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.executesCondition {@code (entry.entry.getMethod() == DEFLATED): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$100(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setSize(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setCompressedSize(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setCrc(long)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: entry.entry.setCrc(crc);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHandleSizesAndCrc_ThrowIllegalArgumentException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setMethod(8);
        entry1.setSize(-255L);
        setField(entry1, "java.util.zip.ZipEntry", "csize", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "bytesRead", 0L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class longType = long.class;
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method handleSizesAndCrcMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("handleSizesAndCrc", longType, longType, zip64ModeType);
        handleSizesAndCrcMethod.setAccessible(true);
        java.lang.Object[] handleSizesAndCrcMethodArguments = new java.lang.Object[3];
        handleSizesAndCrcMethodArguments[0] = -255L;
        handleSizesAndCrcMethodArguments[1] = 8589934593L;
        handleSizesAndCrcMethodArguments[2] = ((Object) null);
        try {
            handleSizesAndCrcMethod.invoke(zipArchiveOutputStream, handleSizesAndCrcMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#handleSizesAndCrc(long,long,org.apache.commons.compress.archivers.zip.Zip64Mode)}
 * @utbot.executesCondition {@code (entry.entry.getMethod() == DEFLATED): False}
 * @utbot.executesCondition {@code (channel == null): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setSize(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setCompressedSize(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setCrc(long)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: entry.entry.setCrc(crc);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHandleSizesAndCrc_ThrowIllegalArgumentException_1() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setMethod(256);
        entry1.setSize(0L);
        setField(entry1, "java.util.zip.ZipEntry", "csize", 0L);
        setField(entry, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry", "entry", entry1);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class longType = long.class;
        Class zip64ModeType = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Method handleSizesAndCrcMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("handleSizesAndCrc", longType, longType, zip64ModeType);
        handleSizesAndCrcMethod.setAccessible(true);
        java.lang.Object[] handleSizesAndCrcMethodArguments = new java.lang.Object[3];
        handleSizesAndCrcMethodArguments[0] = 0L;
        handleSizesAndCrcMethodArguments[1] = 8589934593L;
        handleSizesAndCrcMethodArguments[2] = ((Object) null);
        try {
            handleSizesAndCrcMethod.invoke(zipArchiveOutputStream, handleSizesAndCrcMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for handleSizesAndCrc
    
    public void testHandleSizesAndCrc_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.canWriteEntryData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canWriteEntryData(org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#canWriteEntryData(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (ae instanceof ZipArchiveEntry): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCanWriteEntryData_NotAeNotInstanceOfZipArchiveEntry() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        boolean actual = zipArchiveOutputStream.canWriteEntryData(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region Errors report for canWriteEntryData
    
    public void testCanWriteEntryData_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.addRawArchiveEntry
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addRawArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.io.InputStream)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#addRawArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,java.io.InputStream)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAddRawArchiveEntry_ThrowNullPointerException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.addRawArchiveEntry] produces [java.lang.NullPointerException: entry]
            java.base/java.util.Objects.requireNonNull(Objects.java:233)
            java.base/java.util.zip.ZipEntry.<init>(ZipEntry.java:123)
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry.<init>(ZipArchiveEntry.java:123)
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry.<init>(ZipArchiveEntry.java:148)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.addRawArchiveEntry(ZipArchiveOutputStream.java:577) */
        zipArchiveOutputStream.addRawArchiveEntry(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addRawArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.io.InputStream)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#addRawArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,java.io.InputStream)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: final ZipArchiveEntry ae = new ZipArchiveEntry(entry);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddRawArchiveEntry_ThrowIllegalArgumentException() throws Exception  {
        Class zipArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] prevNoExtraFields = ((org.apache.commons.compress.archivers.zip.ZipExtraField[]) getStaticFieldValue(zipArchiveEntryClazz, "noExtraFields"));
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField[] noExtraFields = {};
            setStaticField(zipArchiveEntryClazz, "noExtraFields", noExtraFields);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
            jarArchiveEntry.setMethod(-1);
            setField(jarArchiveEntry, "java.util.zip.ZipEntry", "xdostime", -255L);
            jarArchiveEntry.setCrc(-255L);
            jarArchiveEntry.setSize(-255L);
            setField(jarArchiveEntry, "java.util.zip.ZipEntry", "csize", -255L);
            jarArchiveEntry.setMethod(-255);
            setField(jarArchiveEntry, "java.util.zip.ZipEntry", "flag", -255);
            setField(jarArchiveEntry, "java.util.zip.ZipEntry", "extraAttributes", -255);
            
            zipArchiveOutputStream.addRawArchiveEntry(jarArchiveEntry, null);
        } finally {
            setStaticField(ZipArchiveEntry.class, "noExtraFields", prevNoExtraFields);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeCounted([B)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCounted(byte[])}
 *  */
    @Test
    public void testWriteCounted() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(raf, "java.io.ObjectOutputStream", "bout", bout);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "writtenToOutputStreamForLastEntry", -255L);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "totalWrittenToOutputStream", -255L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = {};
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeCountedMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeCounted", byteArrayType);
        writeCountedMethod.setAccessible(true);
        java.lang.Object[] writeCountedMethodArguments = new java.lang.Object[1];
        writeCountedMethodArguments[0] = ((Object) byteArray);
        writeCountedMethod.invoke(zipArchiveOutputStream, writeCountedMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCounted(byte[])}
 *  */
    @Test
    public void testWriteCounted_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(raf, "java.io.ObjectOutputStream", "bout", bout);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "writtenToOutputStreamForLastEntry", 0L);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor", "totalWrittenToOutputStream", 0L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = {};
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeCountedMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeCounted", byteArrayType);
        writeCountedMethod.setAccessible(true);
        java.lang.Object[] writeCountedMethodArguments = new java.lang.Object[1];
        writeCountedMethodArguments[0] = ((Object) byteArray);
        writeCountedMethod.invoke(zipArchiveOutputStream, writeCountedMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeCounted([B)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCounted(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.StreamCompressor#writeCounted(byte[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteCounted_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(raf, "java.io.ObjectOutputStream", "bout", bout);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor.writeOut(StreamCompressor.java:321)
            org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(StreamCompressor.java:273)
            org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(StreamCompressor.java:269)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted(ZipArchiveOutputStream.java:932) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeCountedMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeCounted", byteArrayType);
        writeCountedMethod.setAccessible(true);
        java.lang.Object[] writeCountedMethodArguments = new java.lang.Object[1];
        writeCountedMethodArguments[0] = ((Object) byteArray);
        try {
            writeCountedMethod.invoke(zipArchiveOutputStream, writeCountedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCounted(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.StreamCompressor#writeCounted(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: streamCompressor.writeCounted(data);
 *  */
    @Test
    public void testWriteCounted_ThrowNullPointerException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted(ZipArchiveOutputStream.java:932) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeCountedMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeCounted", byteArrayType);
        writeCountedMethod.setAccessible(true);
        java.lang.Object[] writeCountedMethodArguments = new java.lang.Object[1];
        writeCountedMethodArguments[0] = ((Object) null);
        try {
            writeCountedMethod.invoke(zipArchiveOutputStream, writeCountedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeCounted([B)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCounted(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.StreamCompressor#writeCounted(byte[])}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testWriteCounted_ThrowZipException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(raf, "java.io.ObjectOutputStream", "bout", bout);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = {};
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeCountedMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeCounted", byteArrayType);
        writeCountedMethod.setAccessible(true);
        java.lang.Object[] writeCountedMethodArguments = new java.lang.Object[1];
        writeCountedMethodArguments[0] = ((Object) byteArray);
        try {
            writeCountedMethod.invoke(zipArchiveOutputStream, writeCountedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeCounted([B)
    
    @Test
    public void testWriteCounted1() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1073740802);
        setField(raf, "java.io.ObjectOutputStream", "bout", bout);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = new byte[11];
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1073740802 out of bounds for byte[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor.writeOut(StreamCompressor.java:321)
            org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(StreamCompressor.java:273)
            org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(StreamCompressor.java:269)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted(ZipArchiveOutputStream.java:932) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeCountedMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeCounted", byteArrayType);
        writeCountedMethod.setAccessible(true);
        java.lang.Object[] writeCountedMethodArguments = new java.lang.Object[1];
        writeCountedMethodArguments[0] = ((Object) byteArray);
        try {
            writeCountedMethod.invoke(zipArchiveOutputStream, writeCountedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteCounted2() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1073741824);
        setField(raf, "java.io.ObjectOutputStream", "bout", bout);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor.writeOut(StreamCompressor.java:321)
            org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(StreamCompressor.java:273)
            org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(StreamCompressor.java:269)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted(ZipArchiveOutputStream.java:932) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeCountedMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeCounted", byteArrayType);
        writeCountedMethod.setAccessible(true);
        java.lang.Object[] writeCountedMethodArguments = new java.lang.Object[1];
        writeCountedMethodArguments[0] = ((Object) byteArray);
        try {
            writeCountedMethod.invoke(zipArchiveOutputStream, writeCountedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteCounted3() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        AtomicBoolean closed = ((AtomicBoolean) createInstance("java.util.concurrent.atomic.AtomicBoolean"));
        setField(channel, "org.apache.commons.compress.utils.SeekableInMemoryByteChannel", "closed", closed);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor", "channel", channel);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.SeekableInMemoryByteChannel.resize(SeekableInMemoryByteChannel.java:169)
            org.apache.commons.compress.utils.SeekableInMemoryByteChannel.write(SeekableInMemoryByteChannel.java:144)
            org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor.writeOut(StreamCompressor.java:337)
            org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(StreamCompressor.java:273)
            org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(StreamCompressor.java:269)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted(ZipArchiveOutputStream.java:932) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeCountedMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeCounted", byteArrayType);
        writeCountedMethod.setAccessible(true);
        java.lang.Object[] writeCountedMethodArguments = new java.lang.Object[1];
        writeCountedMethodArguments[0] = ((Object) byteArray);
        try {
            writeCountedMethod.invoke(zipArchiveOutputStream, writeCountedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteCounted4() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -2147482626);
        setField(raf, "java.io.ObjectOutputStream", "bout", bout);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = new byte[11];
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor.writeOut(StreamCompressor.java:321)
            org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(StreamCompressor.java:273)
            org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(StreamCompressor.java:269)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted(ZipArchiveOutputStream.java:932) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class byteArrayType = Class.forName("[B");
        Method writeCountedMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeCounted", byteArrayType);
        writeCountedMethod.setAccessible(true);
        java.lang.Object[] writeCountedMethodArguments = new java.lang.Object[1];
        writeCountedMethodArguments[0] = ((Object) byteArray);
        try {
            writeCountedMethod.invoke(zipArchiveOutputStream, writeCountedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeCounted
    
    public void testWriteCounted_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleZip64Extra
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, long, boolean)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#handleZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,long,boolean)}
 * @utbot.executesCondition {@code (needsZip64Extra): False}
 *  */
    @Test
    public void testHandleZip64Extra_NotNeedsZip64Extra() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class longType = long.class;
        Class booleanType = boolean.class;
        Method handleZip64ExtraMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("handleZip64Extra", zipArchiveEntryType, longType, booleanType);
        handleZip64ExtraMethod.setAccessible(true);
        java.lang.Object[] handleZip64ExtraMethodArguments = new java.lang.Object[3];
        handleZip64ExtraMethodArguments[0] = ((Object) null);
        handleZip64ExtraMethodArguments[1] = -255L;
        handleZip64ExtraMethodArguments[2] = false;
        handleZip64ExtraMethod.invoke(zipArchiveOutputStream, handleZip64ExtraMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, long, boolean)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#handleZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,long,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Zip64ExtendedInformationExtraField z64 = getZip64Extra(ze);
 *  */
    @Test
    public void testHandleZip64Extra_ThrowNullPointerException_1() throws Throwable  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "hasUsedZip64", true);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleZip64Extra] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getZip64Extra(ZipArchiveOutputStream.java:1534)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleZip64Extra(ZipArchiveOutputStream.java:1322) */
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Class longType = long.class;
            Class booleanType = boolean.class;
            Method handleZip64ExtraMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("handleZip64Extra", zipArchiveEntryType, longType, booleanType);
            handleZip64ExtraMethod.setAccessible(true);
            java.lang.Object[] handleZip64ExtraMethodArguments = new java.lang.Object[3];
            handleZip64ExtraMethodArguments[0] = ((Object) null);
            handleZip64ExtraMethodArguments[1] = -255L;
            handleZip64ExtraMethodArguments[2] = true;
            try {
                handleZip64ExtraMethod.invoke(zipArchiveOutputStream, handleZip64ExtraMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#handleZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,long,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Zip64ExtendedInformationExtraField z64 = getZip64Extra(ze);
 *  */
    @Test
    public void testHandleZip64Extra_ThrowNullPointerException_2() throws Throwable  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleZip64Extra] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getZip64Extra(ZipArchiveOutputStream.java:1534)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleZip64Extra(ZipArchiveOutputStream.java:1322) */
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Class longType = long.class;
            Class booleanType = boolean.class;
            Method handleZip64ExtraMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("handleZip64Extra", zipArchiveEntryType, longType, booleanType);
            handleZip64ExtraMethod.setAccessible(true);
            java.lang.Object[] handleZip64ExtraMethodArguments = new java.lang.Object[3];
            handleZip64ExtraMethodArguments[0] = ((Object) null);
            handleZip64ExtraMethodArguments[1] = -255L;
            handleZip64ExtraMethodArguments[2] = true;
            try {
                handleZip64ExtraMethod.invoke(zipArchiveOutputStream, handleZip64ExtraMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#handleZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,long,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Zip64ExtendedInformationExtraField z64 = getZip64Extra(ze);
 *  */
    @Test
    public void testHandleZip64Extra_ThrowNullPointerException() throws Throwable  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleZip64Extra] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getZip64Extra(ZipArchiveOutputStream.java:1534)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleZip64Extra(ZipArchiveOutputStream.java:1322) */
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Class longType = long.class;
            Class booleanType = boolean.class;
            Method handleZip64ExtraMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("handleZip64Extra", zipArchiveEntryType, longType, booleanType);
            handleZip64ExtraMethod.setAccessible(true);
            java.lang.Object[] handleZip64ExtraMethodArguments = new java.lang.Object[3];
            handleZip64ExtraMethodArguments[0] = ((Object) null);
            handleZip64ExtraMethodArguments[1] = -255L;
            handleZip64ExtraMethodArguments[2] = true;
            try {
                handleZip64ExtraMethod.invoke(zipArchiveOutputStream, handleZip64ExtraMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    ///endregion
    
    ///region Errors report for handleZip64Extra
    
    public void testHandleZip64Extra_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 19 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deflate()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#deflate()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.StreamCompressor#deflate()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: streamCompressor.deflate();
 *  */
    @Test
    public void testDeflate_ThrowNullPointerException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflate] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflate(ZipArchiveOutputStream.java:1012) */
        zipArchiveOutputStream.deflate();
    }
    ///endregion
    
    ///region Errors report for deflate
    
    public void testDeflate_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeOut([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.StreamCompressor#writeOut(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: streamCompressor.writeOut(data, offset, length);
 *  */
    @Test
    public void testWriteOut_ThrowIndexOutOfBoundsException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.IndexOutOfBoundsException]
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:716)
            org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor.writeOut(StreamCompressor.java:321)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:1469) */
        zipArchiveOutputStream.writeOut(byteArray, 134222081, 2013265936);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: streamCompressor.writeOut(data, offset, length);
 *  */
    @Test
    public void testWriteOut_ThrowNullPointerException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:1469) */
        zipArchiveOutputStream.writeOut(null, -255, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeOut([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.StreamCompressor#writeOut(byte[],int,int)}
 * @utbot.throwsException {@link java.nio.channels.ClosedChannelException} in: streamCompressor.writeOut(data, offset, length);
 *  */
    @Test(expected = ClosedChannelException.class)
    public void testWriteOut_ThrowClosedChannelException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
        FileChannelImpl channel = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        setField(channel, "java.nio.channels.spi.AbstractInterruptibleChannel", "closed", true);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor", "channel", channel);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.writeOut(byteArray, 0, 0);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeOut([B, int, int)
    
    @Test
    public void testWriteOut1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(raf, "java.io.ObjectOutputStream", "bout", bout);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = new byte[32];
        
        zipArchiveOutputStream.writeOut(byteArray, 1, 0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeOut([B, int, int)
    
    @Test
    public void testWriteOut2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor", "channel", channel);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = new byte[12];
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.IndexOutOfBoundsException]
            java.base/java.nio.ByteBuffer.wrap(ByteBuffer.java:410)
            org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor.writeOut(StreamCompressor.java:337)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:1469) */
        zipArchiveOutputStream.writeOut(byteArray, Integer.MIN_VALUE, -3);
    }
    
    @Test
    public void testWriteOut3() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1073741824);
        setField(raf, "java.io.ObjectOutputStream", "bout", bout);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = new byte[34];
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor.writeOut(StreamCompressor.java:321)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:1469) */
        zipArchiveOutputStream.writeOut(byteArray, 1, 18);
    }
    
    @Test
    public void testWriteOut4() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor", "channel", channel);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = new byte[28];
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.SeekableInMemoryByteChannel.isOpen(SeekableInMemoryByteChannel.java:130)
            org.apache.commons.compress.utils.SeekableInMemoryByteChannel.ensureOpen(SeekableInMemoryByteChannel.java:184)
            org.apache.commons.compress.utils.SeekableInMemoryByteChannel.write(SeekableInMemoryByteChannel.java:135)
            org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor.writeOut(StreamCompressor.java:337)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:1469) */
        zipArchiveOutputStream.writeOut(byteArray, 12, 11);
    }
    
    @Test
    public void testWriteOut5() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:712)
            org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor.writeOut(StreamCompressor.java:321)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:1469) */
        zipArchiveOutputStream.writeOut(null, 0, 0);
    }
    ///endregion
    
    ///region Errors report for writeOut
    
    public void testWriteOut_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeOut([B)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 *  */
    @Test
    public void testWriteOut() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(raf, "java.io.ObjectOutputStream", "bout", bout);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.writeOut(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 *  */
    @Test
    public void testWriteOut_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        DataOutputStream raf = ((DataOutputStream) createInstance("java.io.DataOutputStream"));
        setField(raf, "java.io.DataOutputStream", "written", -1);
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(raf, "java.io.FilterOutputStream", "out", out);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.writeOut(byteArray);
        
        StreamCompressor zipArchiveOutputStreamStreamCompressor = ((StreamCompressor) getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor"));
        DataOutput zipArchiveOutputStreamStreamCompressorStreamCompressorRaf = ((DataOutput) getFieldValue(zipArchiveOutputStreamStreamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf"));
        int finalZipArchiveOutputStreamStreamCompressorRafWritten = ((Integer) getFieldValue(zipArchiveOutputStreamStreamCompressorStreamCompressorRaf, "java.io.DataOutputStream", "written"));
        
        assertEquals(Integer.MAX_VALUE, finalZipArchiveOutputStreamStreamCompressorRafWritten);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 *  */
    @Test
    public void testWriteOut_2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(raf, "java.io.ObjectOutputStream", "bout", bout);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.writeOut(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 *  */
    @Test
    public void testWriteOut_3() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(raf, "java.io.ObjectOutputStream", "bout", bout);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.writeOut(byteArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeOut([B)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteOut_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(raf, "java.io.ObjectOutputStream", "bout", bout);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor.writeOut(StreamCompressor.java:321)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:1456) */
        zipArchiveOutputStream.writeOut(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteOut_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(raf, "java.io.ObjectOutputStream", "bout", bout);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor.writeOut(StreamCompressor.java:321)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:1456) */
        zipArchiveOutputStream.writeOut(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: streamCompressor.writeOut(data, 0, data.length);
 *  */
    @Test
    public void testWriteOut_ThrowNullPointerException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:1456) */
        zipArchiveOutputStream.writeOut(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: streamCompressor.writeOut(data, 0, data.length);
 *  */
    @Test
    public void testWriteOut_ThrowNullPointerException1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:1456) */
        zipArchiveOutputStream.writeOut(null);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: streamCompressor.writeOut(data, 0, data.length);
 *  */
    @Test
    public void testWriteOut_ThrowNullPointerException_2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1023);
        setField(raf, "java.io.ObjectOutputStream", "bout", bout);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor.writeOut(StreamCompressor.java:321)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:1456) */
        zipArchiveOutputStream.writeOut(byteArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeOut([B)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.StreamCompressor#writeOut(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: streamCompressor.writeOut(data, 0, data.length);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteOut_ThrowIndexOutOfBoundsException1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1);
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(raf, "java.io.ObjectOutputStream", "bout", bout);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.writeOut(byteArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeOut([B)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.nio.channels.ClosedChannelException} in: streamCompressor.writeOut(data, 0, data.length);
 *  */
    @Test(expected = ClosedChannelException.class)
    public void testWriteOut_ThrowClosedChannelException1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
        FileChannelImpl channel = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        setField(channel, "java.nio.channels.spi.AbstractInterruptibleChannel", "closed", true);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor", "channel", channel);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.writeOut(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testWriteOut_ThrowZipException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(raf, "java.io.ObjectOutputStream", "bout", bout);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = {(byte) -127};
        
        zipArchiveOutputStream.writeOut(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: streamCompressor.writeOut(data, 0, data.length);
 *  */
    @Test(expected = IOException.class)
    public void testWriteOut_ThrowIOException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(raf, "java.io.ObjectOutputStream", "bout", bout);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = {(byte) -127};
        
        zipArchiveOutputStream.writeOut(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteOut_ThrowIOException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setSize(391585187495938L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", -4143452785377034303L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -4143844370564530240L);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(raf, "java.io.ObjectOutputStream", "bout", bout);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.writeOut(byteArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeOut([B)
    
    @Test
    public void testWriteOut6() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor");
        ObjectOutputStream raf = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1021);
        setField(raf, "java.io.ObjectOutputStream", "bout", bout);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", "raf", raf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = new byte[32];
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 1024 out of bounds for byte[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor.writeOut(StreamCompressor.java:321)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:1456) */
        zipArchiveOutputStream.writeOut(byteArray);
    }
    
    @Test
    public void testWriteOut7() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        AtomicBoolean closed = ((AtomicBoolean) createInstance("java.util.concurrent.atomic.AtomicBoolean"));
        setField(channel, "org.apache.commons.compress.utils.SeekableInMemoryByteChannel", "closed", closed);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor", "channel", channel);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.NullPointerException]
            java.base/java.nio.HeapByteBuffer.get(HeapByteBuffer.java:180)
            org.apache.commons.compress.utils.SeekableInMemoryByteChannel.write(SeekableInMemoryByteChannel.java:147)
            org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor.writeOut(StreamCompressor.java:337)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:1456) */
        zipArchiveOutputStream.writeOut(byteArray);
    }
    
    @Test
    public void testWriteOut8() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        AtomicBoolean closed = ((AtomicBoolean) createInstance("java.util.concurrent.atomic.AtomicBoolean"));
        setField(channel, "org.apache.commons.compress.utils.SeekableInMemoryByteChannel", "closed", closed);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor", "channel", channel);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.SeekableInMemoryByteChannel.resize(SeekableInMemoryByteChannel.java:169)
            org.apache.commons.compress.utils.SeekableInMemoryByteChannel.write(SeekableInMemoryByteChannel.java:144)
            org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor.writeOut(StreamCompressor.java:337)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:1456) */
        zipArchiveOutputStream.writeOut(byteArray);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method writeOut([B)
    
    @Test(expected = ClosedChannelException.class)
    public void testWriteOut9() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object streamCompressor = createInstance("org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        AtomicBoolean closed = ((AtomicBoolean) createInstance("java.util.concurrent.atomic.AtomicBoolean"));
        setField(closed, "java.util.concurrent.atomic.AtomicBoolean", "value", 1);
        setField(channel, "org.apache.commons.compress.utils.SeekableInMemoryByteChannel", "closed", closed);
        setField(streamCompressor, "org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor", "channel", channel);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "streamCompressor", streamCompressor);
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        zipArchiveOutputStream.writeOut(byteArray);
    }
    ///endregion
    
    ///region Errors report for writeOut
    
    public void testWriteOut_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createArchiveEntry
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method createArchiveEntry(java.io.File, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#createArchiveEntry(java.io.File,java.lang.String)}
 * @utbot.executesCondition {@code (finished): True}
 * @utbot.throwsException {@link java.io.IOException} when: finished
 *  */
    @Test(expected = IOException.class)
    public void testCreateArchiveEntry_ThrowIOException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        zipArchiveOutputStream.finished = true;
        
        zipArchiveOutputStream.createArchiveEntry(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createArchiveEntry(java.io.File, java.lang.String)
    
    @Test
    public void testCreateArchiveEntry1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        File file = ((File) createInstance("java.io.File"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createArchiveEntry] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.File.isDirectory(File.java:860)
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry.<init>(ZipArchiveEntry.java:176)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createArchiveEntry(ZipArchiveOutputStream.java:1517) */
        zipArchiveOutputStream.createArchiveEntry(file, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getZip64Extra
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#getZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (entry != null): True}
 * @utbot.executesCondition {@code (entry.causedUseOfZip64 = !hasUsedZip64;): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ze.getExtraField(Zip64ExtendedInformationExtraField.HEADER_ID)
 *  */
    @Test
    public void testGetZip64Extra_ThrowNullPointerException_1() throws Throwable  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "hasUsedZip64", true);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getZip64Extra] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getZip64Extra(ZipArchiveOutputStream.java:1534) */
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Method getZip64ExtraMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("getZip64Extra", zipArchiveEntryType);
            getZip64ExtraMethod.setAccessible(true);
            java.lang.Object[] getZip64ExtraMethodArguments = new java.lang.Object[1];
            getZip64ExtraMethodArguments[0] = ((Object) null);
            try {
                getZip64ExtraMethod.invoke(zipArchiveOutputStream, getZip64ExtraMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#getZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (entry != null): True}
 * @utbot.executesCondition {@code (entry.causedUseOfZip64 = !hasUsedZip64;): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ze.getExtraField(Zip64ExtendedInformationExtraField.HEADER_ID)
 *  */
    @Test
    public void testGetZip64Extra_ThrowNullPointerException_2() throws Throwable  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry");
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getZip64Extra] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getZip64Extra(ZipArchiveOutputStream.java:1534) */
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Method getZip64ExtraMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("getZip64Extra", zipArchiveEntryType);
            getZip64ExtraMethod.setAccessible(true);
            java.lang.Object[] getZip64ExtraMethodArguments = new java.lang.Object[1];
            getZip64ExtraMethodArguments[0] = ((Object) null);
            try {
                getZip64ExtraMethod.invoke(zipArchiveOutputStream, getZip64ExtraMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#getZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (entry != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ze.getExtraField(Zip64ExtendedInformationExtraField.HEADER_ID)
 *  */
    @Test
    public void testGetZip64Extra_ThrowNullPointerException() throws Throwable  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getZip64Extra] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getZip64Extra(ZipArchiveOutputStream.java:1534) */
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Method getZip64ExtraMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("getZip64Extra", zipArchiveEntryType);
            getZip64ExtraMethod.setAccessible(true);
            java.lang.Object[] getZip64ExtraMethodArguments = new java.lang.Object[1];
            getZip64ExtraMethodArguments[0] = ((Object) null);
            try {
                getZip64ExtraMethod.invoke(zipArchiveOutputStream, getZip64ExtraMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    ///endregion
    
    ///region Errors report for getZip64Extra
    
    public void testGetZip64Extra_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 21 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEntryEncoding
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEntryEncoding(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#getEntryEncoding(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (!encodable && fallbackToUTF8): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getName()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipEncoding#canEncode(java.lang.String)}
 * @utbot.returnsFrom {@code return !encodable && fallbackToUTF8 ? ZipEncodingHelper.UTF8_ZIP_ENCODING : zipEncoding;}
 *  */
    @Test
    public void testGetEntryEncoding_NotEncodableAndFallbackToUTF8() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        FallbackZipEncoding zipEncoding = ((FallbackZipEncoding) createInstance("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zipEncoding", zipEncoding);
        JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class jarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Method getEntryEncodingMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("getEntryEncoding", jarArchiveEntryType);
        getEntryEncodingMethod.setAccessible(true);
        java.lang.Object[] getEntryEncodingMethodArguments = new java.lang.Object[1];
        getEntryEncodingMethodArguments[0] = jarArchiveEntry;
        FallbackZipEncoding actual = ((FallbackZipEncoding) getEntryEncodingMethod.invoke(zipArchiveOutputStream, getEntryEncodingMethodArguments));
        
        FallbackZipEncoding expected = new FallbackZipEncoding();
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEntryEncoding(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#getEntryEncoding(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean encodable = zipEncoding.canEncode(ze.getName());
 *  */
    @Test
    public void testGetEntryEncoding_ThrowNullPointerException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEntryEncoding] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEntryEncoding(ZipArchiveOutputStream.java:1582) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Method getEntryEncodingMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("getEntryEncoding", zipArchiveEntryType);
        getEntryEncodingMethod.setAccessible(true);
        java.lang.Object[] getEntryEncodingMethodArguments = new java.lang.Object[1];
        getEntryEncodingMethodArguments[0] = ((Object) null);
        try {
            getEntryEncodingMethod.invoke(zipArchiveOutputStream, getEntryEncodingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#getEntryEncoding(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean encodable = zipEncoding.canEncode(ze.getName());
 *  */
    @Test
    public void testGetEntryEncoding_ThrowNullPointerException_1() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        String name = "";
        setField(jarArchiveEntry, "java.util.zip.ZipEntry", "name", name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEntryEncoding] produces [java.lang.NullPointerException] */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class jarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Method getEntryEncodingMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("getEntryEncoding", jarArchiveEntryType);
        getEntryEncodingMethod.setAccessible(true);
        java.lang.Object[] getEntryEncodingMethodArguments = new java.lang.Object[1];
        getEntryEncodingMethodArguments[0] = jarArchiveEntry;
        try {
            getEntryEncodingMethod.invoke(zipArchiveOutputStream, getEntryEncodingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getEntryEncoding
    
    public void testGetEntryEncoding_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 19 occurrences of:
        // Concrete execution failed
        
        // 9 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.usesDataDescriptor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method usesDataDescriptor(int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#usesDataDescriptor(int)}
 * @utbot.returnsFrom {@code return zipMethod == DEFLATED && channel == null;}
 *  */
    @Test
    public void testUsesDataDescriptor_ZipMethodNotEqualsDEFLATEDAndChannelNotEqualsNull() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Method usesDataDescriptorMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("usesDataDescriptor", intType);
        usesDataDescriptorMethod.setAccessible(true);
        java.lang.Object[] usesDataDescriptorMethodArguments = new java.lang.Object[1];
        usesDataDescriptorMethodArguments[0] = -254;
        boolean actual = ((Boolean) usesDataDescriptorMethod.invoke(zipArchiveOutputStream, usesDataDescriptorMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#usesDataDescriptor(int)}
 * @utbot.returnsFrom {@code return zipMethod == DEFLATED && channel == null;}
 *  */
    @Test
    public void testUsesDataDescriptor_ZipMethodNotEqualsDEFLATEDAndChannelNotEqualsNull_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        SeekableInMemoryByteChannel channel = ((SeekableInMemoryByteChannel) createInstance("org.apache.commons.compress.utils.SeekableInMemoryByteChannel"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "channel", channel);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Method usesDataDescriptorMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("usesDataDescriptor", intType);
        usesDataDescriptorMethod.setAccessible(true);
        java.lang.Object[] usesDataDescriptorMethodArguments = new java.lang.Object[1];
        usesDataDescriptorMethodArguments[0] = 8;
        boolean actual = ((Boolean) usesDataDescriptorMethod.invoke(zipArchiveOutputStream, usesDataDescriptorMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#usesDataDescriptor(int)}
 * @utbot.returnsFrom {@code return zipMethod == DEFLATED && channel == null;}
 *  */
    @Test
    public void testUsesDataDescriptor_ZipMethodEqualsDEFLATEDAndChannelEqualsNull() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Method usesDataDescriptorMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("usesDataDescriptor", intType);
        usesDataDescriptorMethod.setAccessible(true);
        java.lang.Object[] usesDataDescriptorMethodArguments = new java.lang.Object[1];
        usesDataDescriptorMethodArguments[0] = 8;
        boolean actual = ((Boolean) usesDataDescriptorMethod.invoke(zipArchiveOutputStream, usesDataDescriptorMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.hasZip64Extra
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#hasZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getExtraField(org.apache.commons.compress.archivers.zip.ZipShort)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ze.getExtraField(Zip64ExtendedInformationExtraField.HEADER_ID) != null;
 *  */
    @Test
    public void testHasZip64Extra_ThrowNullPointerException() throws Throwable  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.hasZip64Extra] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.hasZip64Extra(ZipArchiveOutputStream.java:1559) */
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Method hasZip64ExtraMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("hasZip64Extra", zipArchiveEntryType);
            hasZip64ExtraMethod.setAccessible(true);
            java.lang.Object[] hasZip64ExtraMethodArguments = new java.lang.Object[1];
            hasZip64ExtraMethodArguments[0] = ((Object) null);
            try {
                hasZip64ExtraMethod.invoke(zipArchiveOutputStream, hasZip64ExtraMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    ///endregion
    
    ///region Errors report for hasZip64Extra
    
    public void testHasZip64Extra_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 16 occurrences of:
        // Concrete execution failed
        
        // 5 occurrences of:
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
        
                java.lang.reflect.Method methodForGetDeclaredFields976904049492100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields976904049492100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass976904049506400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields976904049492100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass976904049506400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields976904050096900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields976904050096900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass976904050099100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields976904050096900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass976904050099100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields976904050448600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields976904050448600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass976904050450100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields976904050448600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass976904050450100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields976904050886600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields976904050886600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass976904050887600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields976904050886600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass976904050887600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}


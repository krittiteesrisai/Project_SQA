package org.apache.commons.compress.archivers.sevenz;

import org.junit.Test;
import org.apache.commons.compress.utils.CountingOutputStream;
import java.util.zip.ZipOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Deflater;
import java.util.jar.JarEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.jar.JarOutputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.apache.commons.compress.archivers.sevenz.Coders.CoderId;
import java.io.RandomAccessFile;
import java.io.FileDescriptor;
import sun.nio.ch.FileChannelImpl;
import java.nio.channels.FileChannel;
import java.util.jar.JarInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.util.ArrayList;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.io.File;
import java.util.zip.CRC32;
import java.util.BitSet;
import java.lang.reflect.Constructor;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_compress_archivers_sevenz_SevenZOutputFileTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method write(int)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(int)}
 * @utbot.throwsException {@link java.io.IOException} in: getCurrentOutputStream().write(b);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.utils.CountingOutputStream"));
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        
        sevenZOutputFile.write(-255);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(int)}
 * @utbot.throwsException {@link java.io.IOException} in: getCurrentOutputStream().write(b);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_1() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile$1"));
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        
        sevenZOutputFile.write(-255);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(int)}
 * @utbot.throwsException {@link java.io.IOException} in: getCurrentOutputStream().write(b);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_2() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.utils.CountingOutputStream"));
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(java.lang.Long.MIN_VALUE);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 9223369837563084796L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -2199291691011L);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        
        sevenZOutputFile.write(-255);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(int)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: getCurrentOutputStream().write(b);
 *  */
    @Test(expected = ZipException.class)
    public void testWrite_ThrowZipException() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.utils.CountingOutputStream"));
        CheckedOutputStream out = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        
        sevenZOutputFile.write(-255);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(int)}
 * @utbot.throwsException {@link java.io.IOException} in: getCurrentOutputStream().write(b);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_3() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.utils.CountingOutputStream"));
        CheckedOutputStream out = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        
        sevenZOutputFile.write(-255);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(int)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: getCurrentOutputStream().write(b);
 *  */
    @Test(expected = ZipException.class)
    public void testWrite_ThrowZipException_1() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.utils.CountingOutputStream"));
        CheckedOutputStream out = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out2 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        
        sevenZOutputFile.write(-255);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(int)}
 * @utbot.throwsException {@link java.io.IOException} in: getCurrentOutputStream().write(b);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_4() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.utils.CountingOutputStream"));
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        
        sevenZOutputFile.write(-255);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(int)}
 * @utbot.throwsException {@link java.io.IOException} in: getCurrentOutputStream().write(b);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_5() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.utils.CountingOutputStream"));
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(java.lang.Long.MIN_VALUE);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 9223372036854775804L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -3L);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        
        sevenZOutputFile.write(-255);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(int)}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testWrite_ThrowZipException_2() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile$1"));
        CheckedOutputStream out = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        CheckedOutputStream out2 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        Object out3 = createInstance("org.apache.commons.compress.compressors.pack200.InMemoryCachingStreamBridge");
        ZipOutputStream out4 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out4, "java.util.zip.ZipOutputStream", "current", current);
        setField(out3, "java.io.FilterOutputStream", "out", out4);
        setField(out2, "java.io.FilterOutputStream", "out", out3);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        
        sevenZOutputFile.write(-255);
    }
    ///endregion
    
    ///region Errors report for write
    
    public void testWrite_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 15 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len > 0): False}
 *  */
    @Test
    public void testWrite_LenLessOrEqualZero() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        sevenZOutputFile.write(null, -255, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: getCurrentOutputStream().write(b, off, len);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException1() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.utils.CountingOutputStream"));
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        
        sevenZOutputFile.write(null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(byte[],int,int)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: getCurrentOutputStream().write(b, off, len);
 *  */
    @Test(expected = ZipException.class)
    public void testWrite_ThrowZipException1() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile$1"));
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        byte[] byteArray = {(byte) -127};
        
        sevenZOutputFile.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: getCurrentOutputStream().write(b, off, len);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_11() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile$1"));
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setSize(614891469685129216L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", -8608480567236756256L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", 9223372036787666145L);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        byte[] byteArray = {(byte) -127};
        
        sevenZOutputFile.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(byte[],int,int)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: getCurrentOutputStream().write(b, off, len);
 *  */
    @Test(expected = ZipException.class)
    public void testWrite_ThrowZipException_11() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile$1"));
        CheckedOutputStream out = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        byte[] byteArray = {(byte) -127};
        
        sevenZOutputFile.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: getCurrentOutputStream().write(b, off, len);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_21() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.utils.CountingOutputStream"));
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        
        sevenZOutputFile.write(null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: getCurrentOutputStream().write(b, off, len);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_31() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.utils.CountingOutputStream"));
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        byte[] byteArray = {(byte) -127};
        
        sevenZOutputFile.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: getCurrentOutputStream().write(b, off, len);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_41() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile$1"));
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setSize(3026433580399132674L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", -9223366204154904576L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", 6196944289155514367L);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        byte[] byteArray = {(byte) -127};
        
        sevenZOutputFile.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_51() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile$1"));
        CheckedOutputStream out = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setSize(4755802272200916992L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current);
        setField(out1, "java.util.zip.ZipOutputStream", "written", 5242896L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", -4755802272195674095L);
        ZipOutputStream out2 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current1 = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry1.setSize(0L);
        setField(current1, "java.util.zip.ZipOutputStream$XEntry", "entry", entry1);
        setField(out2, "java.util.zip.ZipOutputStream", "current", current1);
        setField(out2, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(out2, "java.util.zip.ZipOutputStream", "locoff", 1L);
        CheckedOutputStream out3 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        DeflaterOutputStream out4 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out4, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out3, "java.io.FilterOutputStream", "out", out4);
        setField(out2, "java.io.FilterOutputStream", "out", out3);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        byte[] byteArray = {(byte) -127};
        
        sevenZOutputFile.write(byteArray, 0, 1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len > 0): True}
 * @utbot.invokes org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#getCurrentOutputStream()
 * @utbot.invokes {@link java.io.OutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: getCurrentOutputStream().write(b, off, len);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_ThrowIndexOutOfBoundsException() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile$1"));
        CheckedOutputStream out = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        byte[] byteArray = {};
        
        sevenZOutputFile.write(byteArray, -1, 1);
    }
    ///endregion
    
    ///region Errors report for write
    
    public void testWrite_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 14 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method write([B)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(byte[],int,int)}
 *  */
    @Test
    public void testWrite_SevenZOutputFileWrite() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        byte[] byteArray = {};
        
        sevenZOutputFile.write(byteArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method write([B)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: write(b, 0, b.length);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write(SevenZOutputFile.java:164) */
        sevenZOutputFile.write(((byte[]) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method write([B)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: write(b, 0, b.length);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException2() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.utils.CountingOutputStream"));
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        byte[] byteArray = {(byte) -127};
        
        sevenZOutputFile.write(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(byte[])}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: write(b, 0, b.length);
 *  */
    @Test(expected = ZipException.class)
    public void testWrite_ThrowZipException2() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile$1"));
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        byte[] byteArray = {(byte) -127};
        
        sevenZOutputFile.write(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: write(b, 0, b.length);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_12() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.utils.CountingOutputStream"));
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        byte[] byteArray = {(byte) -127};
        
        sevenZOutputFile.write(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(byte[])}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_22() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile$1"));
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry.setSize(2L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", -9007096519123271678L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -9007096519123271679L);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        byte[] byteArray = {(byte) -127};
        
        sevenZOutputFile.write(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: write(b, 0, b.length);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_6() throws Exception  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = {};
            Coders.coderTable = coderTable;
            SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
            byte[] byteArray = {(byte) -127};
            
            sevenZOutputFile.write(byteArray);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: write(b, 0, b.length);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_7() throws Exception  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.AES256SHA256;
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, null);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
            byte[] byteArray = {(byte) -127};
            
            sevenZOutputFile.write(byteArray);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: write(b, 0, b.length);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_32() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.utils.CountingOutputStream"));
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        byte[] byteArray = {(byte) -127};
        
        sevenZOutputFile.write(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: write(b, 0, b.length);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_42() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile$1"));
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setSize(549755813890L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", -9223234134044835840L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -9223234683800649729L);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        byte[] byteArray = {(byte) -127};
        
        sevenZOutputFile.write(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#write(byte[])}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_52() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.utils.CountingOutputStream"));
        JarOutputStream out = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setSize(9957177301139455L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", -9223336852482686977L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", 9213450043925725185L);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current1 = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry1 = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry1)).setSize(9625731818033154L);
        setField(current1, "java.util.zip.ZipOutputStream$XEntry", "entry", entry1);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current1);
        setField(out1, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", -9625731818033153L);
        ZipOutputStream out2 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current2 = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry2 = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry2)).setSize(25734855006355456L);
        setField(current2, "java.util.zip.ZipOutputStream$XEntry", "entry", entry2);
        setField(out2, "java.util.zip.ZipOutputStream", "current", current2);
        setField(out2, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(out2, "java.util.zip.ZipOutputStream", "locoff", -25734855006355455L);
        CheckedOutputStream out3 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        DeflaterOutputStream out4 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out4, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out3, "java.io.FilterOutputStream", "out", out4);
        setField(out2, "java.io.FilterOutputStream", "out", out3);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(currentOutputStream, "java.io.FilterOutputStream", "out", out);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        byte[] byteArray = {(byte) -127};
        
        sevenZOutputFile.write(byteArray);
    }
    ///endregion
    
    ///region Errors report for write
    
    public void testWrite_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 14 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#close()}
 *  */
    @Test
    public void testClose() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        RandomAccessFile file = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        setField(file, "java.io.RandomAccessFile", "closed", true);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "file", file);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finished", true);
        
        sevenZOutputFile.close();
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#close()}
 *  */
    @Test
    public void testClose_1() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        RandomAccessFile file = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(fd, "java.io.FileDescriptor", "closed", true);
        setField(file, "java.io.RandomAccessFile", "fd", fd);
        FileChannelImpl channel = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        setField(channel, "java.nio.channels.spi.AbstractInterruptibleChannel", "closed", true);
        setField(file, "java.io.RandomAccessFile", "channel", channel);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "file", file);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finished", true);
        
        sevenZOutputFile.close();
        
        RandomAccessFile sevenZOutputFileFile = ((RandomAccessFile) getFieldValue(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "file"));
        boolean finalSevenZOutputFileFileClosed = ((Boolean) getFieldValue(sevenZOutputFileFile, "java.io.RandomAccessFile", "closed"));
        
        assertTrue(finalSevenZOutputFileFileClosed);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#close()}
 *  */
    @Test
    public void testClose_2() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        RandomAccessFile file = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(fd, "java.io.FileDescriptor", "fd", -1);
        setField(fd, "java.io.FileDescriptor", "handle", -1L);
        setField(fd, "java.io.FileDescriptor", "closed", true);
        setField(file, "java.io.RandomAccessFile", "fd", fd);
        FileChannelImpl channel = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        setField(channel, "sun.nio.ch.FileChannelImpl", "fd", fd);
        setField(file, "java.io.RandomAccessFile", "channel", channel);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "file", file);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finished", true);
        
        sevenZOutputFile.close();
        
        RandomAccessFile sevenZOutputFileFile = ((RandomAccessFile) getFieldValue(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "file"));
        FileChannel sevenZOutputFileFileFileChannel = ((FileChannel) getFieldValue(sevenZOutputFileFile, "java.io.RandomAccessFile", "channel"));
        boolean finalSevenZOutputFileFileChannelClosed = ((Boolean) getFieldValue(sevenZOutputFileFileFileChannel, "java.nio.channels.spi.AbstractInterruptibleChannel", "closed"));
        RandomAccessFile sevenZOutputFileFile1 = ((RandomAccessFile) getFieldValue(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "file"));
        boolean finalSevenZOutputFileFileClosed = ((Boolean) getFieldValue(sevenZOutputFileFile1, "java.io.RandomAccessFile", "closed"));
        
        assertTrue(finalSevenZOutputFileFileChannelClosed);
        
        assertTrue(finalSevenZOutputFileFileClosed);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#close()}
 *  */
    @Test
    public void testClose_3() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        RandomAccessFile file = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(fd, "java.io.FileDescriptor", "handle", -1L);
        setField(fd, "java.io.FileDescriptor", "closed", true);
        setField(file, "java.io.RandomAccessFile", "fd", fd);
        FileChannelImpl channel = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        setField(channel, "sun.nio.ch.FileChannelImpl", "fd", fd);
        JarInputStream parent = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(parent, "java.util.zip.InflaterInputStream", "closed", true);
        setField(channel, "sun.nio.ch.FileChannelImpl", "parent", parent);
        Object threads = createInstance("sun.nio.ch.NativeThreadSet");
        setField(channel, "sun.nio.ch.FileChannelImpl", "threads", threads);
        setField(file, "java.io.RandomAccessFile", "channel", channel);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "file", file);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finished", true);
        
        sevenZOutputFile.close();
        
        RandomAccessFile sevenZOutputFileFile = ((RandomAccessFile) getFieldValue(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "file"));
        FileChannel sevenZOutputFileFileFileChannel = ((FileChannel) getFieldValue(sevenZOutputFileFile, "java.io.RandomAccessFile", "channel"));
        Object sevenZOutputFileFileFileChannelFileChannelParent = getFieldValue(sevenZOutputFileFileFileChannel, "sun.nio.ch.FileChannelImpl", "parent");
        boolean finalSevenZOutputFileFileChannelParentClosed = ((Boolean) getFieldValue(sevenZOutputFileFileFileChannelFileChannelParent, "java.util.zip.ZipInputStream", "closed"));
        RandomAccessFile sevenZOutputFileFile1 = ((RandomAccessFile) getFieldValue(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "file"));
        FileChannel sevenZOutputFileFile1FileChannel = ((FileChannel) getFieldValue(sevenZOutputFileFile1, "java.io.RandomAccessFile", "channel"));
        boolean finalSevenZOutputFileFileChannelClosed = ((Boolean) getFieldValue(sevenZOutputFileFile1FileChannel, "java.nio.channels.spi.AbstractInterruptibleChannel", "closed"));
        RandomAccessFile sevenZOutputFileFile2 = ((RandomAccessFile) getFieldValue(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "file"));
        boolean finalSevenZOutputFileFileClosed = ((Boolean) getFieldValue(sevenZOutputFileFile2, "java.io.RandomAccessFile", "closed"));
        
        assertTrue(finalSevenZOutputFileFileChannelParentClosed);
        
        assertTrue(finalSevenZOutputFileFileChannelClosed);
        
        assertTrue(finalSevenZOutputFileFileClosed);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: file.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finished", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.close(SevenZOutputFile.java:83) */
        sevenZOutputFile.close();
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#close()}
 * @utbot.invokes {@link java.io.RandomAccessFile#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testClose_ThrowNullPointerException_1() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        RandomAccessFile file = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(fd, "java.io.FileDescriptor", "closed", true);
        setField(file, "java.io.RandomAccessFile", "fd", fd);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "file", file);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finished", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.close] produces [java.lang.NullPointerException]
            java.base/java.io.RandomAccessFile.close(RandomAccessFile.java:642)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.close(SevenZOutputFile.java:83) */
        sevenZOutputFile.close();
    }
    ///endregion
    
    ///region Errors report for close
    
    public void testClose_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final jdk.internal.access.JavaIOFileDescriptorAccess sun.nio.ch.FileChannelImpl.fdAccess accessible:
        module java.base does not "opens sun.nio.ch" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field private static java.util.concurrent.ConcurrentHashMap sun.nio.ch.FileLockTable.lockMap accessible: module
        java.base does not "opens sun.nio.ch" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.finish
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method finish()
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#finish()}
 * @utbot.executesCondition {@code (finished): True}
 * @utbot.throwsException {@link java.io.IOException} when: finished
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finished", true);
        
        sevenZOutputFile.finish();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method finish()
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#finish()}
 * @utbot.executesCondition {@code (finished): False}
 * @utbot.invokes {@link java.io.RandomAccessFile#getFilePointer()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final long headerPosition = file.getFilePointer();
 *  */
    @Test
    public void testFinish_ThrowNullPointerException() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.finish] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.finish(SevenZOutputFile.java:191) */
        sevenZOutputFile.finish();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method finish()
    
    @Test(expected = IOException.class)
    public void testFinish1() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        RandomAccessFile file = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "file", file);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "numNonEmptyStreams", 16384);
        
        sevenZOutputFile.finish();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeHeader(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeHeader(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kHeader);
 *  */
    @Test
    public void testWriteHeader_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", Integer.MIN_VALUE);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader(SevenZOutputFile.java:266) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeHeaderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeHeader", objectOutputStreamType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = objectOutputStream;
        try {
            writeHeaderMethod.invoke(sevenZOutputFile, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeHeader(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteHeader_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader(SevenZOutputFile.java:266) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeHeaderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeHeader", objectOutputStreamType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = objectOutputStream;
        try {
            writeHeaderMethod.invoke(sevenZOutputFile, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeHeader(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kHeader);
 *  */
    @Test
    public void testWriteHeader_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader(SevenZOutputFile.java:266) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeHeaderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeHeader", objectOutputStreamType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = objectOutputStream;
        try {
            writeHeaderMethod.invoke(sevenZOutputFile, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeHeader(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kMainStreamsInfo);
 *  */
    @Test
    public void testWriteHeader_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader(SevenZOutputFile.java:268) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeHeaderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeHeader", objectOutputStreamType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = objectOutputStream;
        try {
            writeHeaderMethod.invoke(sevenZOutputFile, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeHeader(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeStreamsInfo(header);
 *  */
    @Test
    public void testWriteHeader_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "numNonEmptyStreams", 1);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 4);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader] produces [java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo(SevenZOutputFile.java:286)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo(SevenZOutputFile.java:276)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader(SevenZOutputFile.java:269) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeHeaderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeHeader", objectOutputStreamType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = objectOutputStream;
        try {
            writeHeaderMethod.invoke(sevenZOutputFile, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeHeader(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeStreamsInfo(header);
 *  */
    @Test
    public void testWriteHeader_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 4);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader] produces [java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSubStreamsInfo(SevenZOutputFile.java:357)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo(SevenZOutputFile.java:280)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader(SevenZOutputFile.java:269) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeHeaderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeHeader", objectOutputStreamType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = objectOutputStream;
        try {
            writeHeaderMethod.invoke(sevenZOutputFile, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeHeader(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeStreamsInfo(header);
 *  */
    @Test
    public void testWriteHeader_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 4);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSubStreamsInfo(SevenZOutputFile.java:367)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo(SevenZOutputFile.java:280)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader(SevenZOutputFile.java:269) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeHeaderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeHeader", objectOutputStreamType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = objectOutputStream;
        try {
            writeHeaderMethod.invoke(sevenZOutputFile, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeHeader(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: header.write(NID.kHeader);
 *  */
    @Test
    public void testWriteHeader_ThrowNullPointerException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader(SevenZOutputFile.java:266) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeHeaderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeHeader", dataOutputType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = ((Object) null);
        try {
            writeHeaderMethod.invoke(sevenZOutputFile, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeHeader(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeHeader(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kHeader);
 *  */
    @Test(expected = IOException.class)
    public void testWriteHeader_ThrowIOException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeHeaderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeHeader", objectOutputStreamType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = objectOutputStream;
        try {
            writeHeaderMethod.invoke(sevenZOutputFile, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeHeader(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteHeader_ThrowIOException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        CheckedOutputStream out = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeHeaderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeHeader", objectOutputStreamType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = objectOutputStream;
        try {
            writeHeaderMethod.invoke(sevenZOutputFile, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeHeader(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(NID.kHeader);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteHeader_ThrowZipException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        DataOutputStream dataOutputStream = new DataOutputStream(zipOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeHeaderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeHeader", dataOutputStreamType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = dataOutputStream;
        try {
            writeHeaderMethod.invoke(sevenZOutputFile, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeHeader(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kHeader);
 *  */
    @Test(expected = IOException.class)
    public void testWriteHeader_ThrowIOException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        DeflaterOutputStream deflaterOutputStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(deflaterOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        DataOutputStream dataOutputStream = new DataOutputStream(deflaterOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeHeaderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeHeader", dataOutputStreamType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = dataOutputStream;
        try {
            writeHeaderMethod.invoke(sevenZOutputFile, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeHeader(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(NID.kHeader);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteHeader_ThrowZipException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeHeaderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeHeader", objectOutputStreamType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = objectOutputStream;
        try {
            writeHeaderMethod.invoke(sevenZOutputFile, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeHeader(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteHeader_ThrowIOException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 9223372036854775804L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -3L);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeHeaderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeHeader", objectOutputStreamType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = objectOutputStream;
        try {
            writeHeaderMethod.invoke(sevenZOutputFile, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeHeader(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kHeader);
 *  */
    @Test(expected = IOException.class)
    public void testWriteHeader_ThrowIOException_4() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeHeaderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeHeader", objectOutputStreamType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = objectOutputStream;
        try {
            writeHeaderMethod.invoke(sevenZOutputFile, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeHeader(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kHeader);
 *  */
    @Test(expected = IOException.class)
    public void testWriteHeader_ThrowIOException_5() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeHeaderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeHeader", objectOutputStreamType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = objectOutputStream;
        try {
            writeHeaderMethod.invoke(sevenZOutputFile, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeHeader(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteHeader_ThrowIOException_6() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeHeaderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeHeader", objectOutputStreamType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = objectOutputStream;
        try {
            writeHeaderMethod.invoke(sevenZOutputFile, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeHeader(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(NID.kHeader);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteHeader_ThrowZipException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(zipOutputStream, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeHeaderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeHeader", dataOutputStreamType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = dataOutputStream;
        try {
            writeHeaderMethod.invoke(sevenZOutputFile, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeHeader(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteHeader_ThrowIOException_7() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 9223372036854775804L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -3L);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeHeaderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeHeader", objectOutputStreamType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = objectOutputStream;
        try {
            writeHeaderMethod.invoke(sevenZOutputFile, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeHeader(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(NID.kHeader);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteHeader_ThrowZipException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(jarOutputStream, null);
        CheckedOutputStream checkedOutputStream1 = new CheckedOutputStream(checkedOutputStream, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream1);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeHeaderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeHeader", dataOutputStreamType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = dataOutputStream;
        try {
            writeHeaderMethod.invoke(sevenZOutputFile, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeHeader(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteHeader_ThrowIOException_8() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "closed", true);
        FilterOutputStream filterOutputStream = new FilterOutputStream(zipOutputStream);
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(filterOutputStream, null);
        CheckedOutputStream checkedOutputStream1 = new CheckedOutputStream(checkedOutputStream, null);
        CheckedOutputStream checkedOutputStream2 = new CheckedOutputStream(checkedOutputStream1, null);
        CheckedOutputStream checkedOutputStream3 = new CheckedOutputStream(checkedOutputStream2, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream3);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeHeaderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeHeader", dataOutputStreamType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = dataOutputStream;
        try {
            writeHeaderMethod.invoke(sevenZOutputFile, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeHeader
    
    public void testWriteHeader_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 17 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.putArchiveEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 *  */
    @Test
    public void testPutArchiveEntry_ListAdd() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        files.add(null);
        files.add(null);
        files.add(null);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        sevenZOutputFile.putArchiveEntry(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final SevenZArchiveEntry entry = (SevenZArchiveEntry) archiveEntry;
 *  */
    @Test
    public void testPutArchiveEntry_ThrowClassCastException() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry(null, 0L, 0, 0, 0, 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.putArchiveEntry] produces [java.lang.ClassCastException: class org.apache.commons.compress.archivers.ar.ArArchiveEntry cannot be cast to class org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry (org.apache.commons.compress.archivers.ar.ArArchiveEntry and org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @34b4af47)]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.putArchiveEntry(SevenZOutputFile.java:114) */
        sevenZOutputFile.putArchiveEntry(arArchiveEntry);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: files.add(entry);
 *  */
    @Test
    public void testPutArchiveEntry_ThrowNullPointerException() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.putArchiveEntry(SevenZOutputFile.java:115) */
        sevenZOutputFile.putArchiveEntry(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeUnpackInfo(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUnpackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kUnpackInfo);
 *  */
    @Test
    public void testWriteUnpackInfo_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", Integer.MIN_VALUE);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo(SevenZOutputFile.java:310) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeUnpackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeUnpackInfo", objectOutputStreamType);
        writeUnpackInfoMethod.setAccessible(true);
        java.lang.Object[] writeUnpackInfoMethodArguments = new java.lang.Object[1];
        writeUnpackInfoMethodArguments[0] = objectOutputStream;
        try {
            writeUnpackInfoMethod.invoke(sevenZOutputFile, writeUnpackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUnpackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteUnpackInfo_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo(SevenZOutputFile.java:310) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeUnpackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeUnpackInfo", objectOutputStreamType);
        writeUnpackInfoMethod.setAccessible(true);
        java.lang.Object[] writeUnpackInfoMethodArguments = new java.lang.Object[1];
        writeUnpackInfoMethodArguments[0] = objectOutputStream;
        try {
            writeUnpackInfoMethod.invoke(sevenZOutputFile, writeUnpackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUnpackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kUnpackInfo);
 *  */
    @Test
    public void testWriteUnpackInfo_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo(SevenZOutputFile.java:310) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeUnpackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeUnpackInfo", objectOutputStreamType);
        writeUnpackInfoMethod.setAccessible(true);
        java.lang.Object[] writeUnpackInfoMethodArguments = new java.lang.Object[1];
        writeUnpackInfoMethodArguments[0] = objectOutputStream;
        try {
            writeUnpackInfoMethod.invoke(sevenZOutputFile, writeUnpackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUnpackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kFolder);
 *  */
    @Test
    public void testWriteUnpackInfo_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo(SevenZOutputFile.java:312) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeUnpackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeUnpackInfo", objectOutputStreamType);
        writeUnpackInfoMethod.setAccessible(true);
        java.lang.Object[] writeUnpackInfoMethodArguments = new java.lang.Object[1];
        writeUnpackInfoMethodArguments[0] = objectOutputStream;
        try {
            writeUnpackInfoMethod.invoke(sevenZOutputFile, writeUnpackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUnpackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeUint64(header, numNonEmptyStreams);
 *  */
    @Test
    public void testWriteUnpackInfo_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "numNonEmptyStreams", -127);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 4);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(SevenZOutputFile.java:627)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo(SevenZOutputFile.java:313) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeUnpackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeUnpackInfo", objectOutputStreamType);
        writeUnpackInfoMethod.setAccessible(true);
        java.lang.Object[] writeUnpackInfoMethodArguments = new java.lang.Object[1];
        writeUnpackInfoMethodArguments[0] = objectOutputStream;
        try {
            writeUnpackInfoMethod.invoke(sevenZOutputFile, writeUnpackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUnpackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeUint64(header, numNonEmptyStreams);
 *  */
    @Test
    public void testWriteUnpackInfo_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "numNonEmptyStreams", 16513);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 4);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(SevenZOutputFile.java:627)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo(SevenZOutputFile.java:313) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeUnpackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeUnpackInfo", objectOutputStreamType);
        writeUnpackInfoMethod.setAccessible(true);
        java.lang.Object[] writeUnpackInfoMethodArguments = new java.lang.Object[1];
        writeUnpackInfoMethodArguments[0] = objectOutputStream;
        try {
            writeUnpackInfoMethod.invoke(sevenZOutputFile, writeUnpackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUnpackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: header.write(NID.kUnpackInfo);
 *  */
    @Test
    public void testWriteUnpackInfo_ThrowNullPointerException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo(SevenZOutputFile.java:310) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeUnpackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeUnpackInfo", dataOutputType);
        writeUnpackInfoMethod.setAccessible(true);
        java.lang.Object[] writeUnpackInfoMethodArguments = new java.lang.Object[1];
        writeUnpackInfoMethodArguments[0] = ((Object) null);
        try {
            writeUnpackInfoMethod.invoke(sevenZOutputFile, writeUnpackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeUnpackInfo(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUnpackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kUnpackInfo);
 *  */
    @Test(expected = IOException.class)
    public void testWriteUnpackInfo_ThrowIOException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeUnpackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeUnpackInfo", objectOutputStreamType);
        writeUnpackInfoMethod.setAccessible(true);
        java.lang.Object[] writeUnpackInfoMethodArguments = new java.lang.Object[1];
        writeUnpackInfoMethodArguments[0] = objectOutputStream;
        try {
            writeUnpackInfoMethod.invoke(sevenZOutputFile, writeUnpackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUnpackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(NID.kUnpackInfo);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteUnpackInfo_ThrowZipException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        DataOutputStream dataOutputStream = new DataOutputStream(zipOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeUnpackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeUnpackInfo", dataOutputStreamType);
        writeUnpackInfoMethod.setAccessible(true);
        java.lang.Object[] writeUnpackInfoMethodArguments = new java.lang.Object[1];
        writeUnpackInfoMethodArguments[0] = dataOutputStream;
        try {
            writeUnpackInfoMethod.invoke(sevenZOutputFile, writeUnpackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUnpackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kUnpackInfo);
 *  */
    @Test(expected = IOException.class)
    public void testWriteUnpackInfo_ThrowIOException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        DeflaterOutputStream deflaterOutputStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(deflaterOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        DataOutputStream dataOutputStream = new DataOutputStream(deflaterOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeUnpackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeUnpackInfo", dataOutputStreamType);
        writeUnpackInfoMethod.setAccessible(true);
        java.lang.Object[] writeUnpackInfoMethodArguments = new java.lang.Object[1];
        writeUnpackInfoMethodArguments[0] = dataOutputStream;
        try {
            writeUnpackInfoMethod.invoke(sevenZOutputFile, writeUnpackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUnpackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(NID.kUnpackInfo);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteUnpackInfo_ThrowZipException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeUnpackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeUnpackInfo", objectOutputStreamType);
        writeUnpackInfoMethod.setAccessible(true);
        java.lang.Object[] writeUnpackInfoMethodArguments = new java.lang.Object[1];
        writeUnpackInfoMethodArguments[0] = objectOutputStream;
        try {
            writeUnpackInfoMethod.invoke(sevenZOutputFile, writeUnpackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUnpackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteUnpackInfo_ThrowIOException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 9223372036854775804L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -3L);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeUnpackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeUnpackInfo", objectOutputStreamType);
        writeUnpackInfoMethod.setAccessible(true);
        java.lang.Object[] writeUnpackInfoMethodArguments = new java.lang.Object[1];
        writeUnpackInfoMethodArguments[0] = objectOutputStream;
        try {
            writeUnpackInfoMethod.invoke(sevenZOutputFile, writeUnpackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUnpackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kUnpackInfo);
 *  */
    @Test(expected = IOException.class)
    public void testWriteUnpackInfo_ThrowIOException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeUnpackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeUnpackInfo", objectOutputStreamType);
        writeUnpackInfoMethod.setAccessible(true);
        java.lang.Object[] writeUnpackInfoMethodArguments = new java.lang.Object[1];
        writeUnpackInfoMethodArguments[0] = objectOutputStream;
        try {
            writeUnpackInfoMethod.invoke(sevenZOutputFile, writeUnpackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUnpackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteUnpackInfo_ThrowIOException_4() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeUnpackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeUnpackInfo", objectOutputStreamType);
        writeUnpackInfoMethod.setAccessible(true);
        java.lang.Object[] writeUnpackInfoMethodArguments = new java.lang.Object[1];
        writeUnpackInfoMethodArguments[0] = objectOutputStream;
        try {
            writeUnpackInfoMethod.invoke(sevenZOutputFile, writeUnpackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUnpackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(NID.kUnpackInfo);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteUnpackInfo_ThrowZipException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(zipOutputStream, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeUnpackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeUnpackInfo", dataOutputStreamType);
        writeUnpackInfoMethod.setAccessible(true);
        java.lang.Object[] writeUnpackInfoMethodArguments = new java.lang.Object[1];
        writeUnpackInfoMethodArguments[0] = dataOutputStream;
        try {
            writeUnpackInfoMethod.invoke(sevenZOutputFile, writeUnpackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUnpackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteUnpackInfo_ThrowIOException_5() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 9223372036854775804L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -3L);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeUnpackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeUnpackInfo", objectOutputStreamType);
        writeUnpackInfoMethod.setAccessible(true);
        java.lang.Object[] writeUnpackInfoMethodArguments = new java.lang.Object[1];
        writeUnpackInfoMethodArguments[0] = objectOutputStream;
        try {
            writeUnpackInfoMethod.invoke(sevenZOutputFile, writeUnpackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUnpackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteUnpackInfo_ThrowIOException_6() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "closed", true);
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(zipOutputStream, null);
        CheckedOutputStream checkedOutputStream1 = new CheckedOutputStream(checkedOutputStream, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream1);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeUnpackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeUnpackInfo", dataOutputStreamType);
        writeUnpackInfoMethod.setAccessible(true);
        java.lang.Object[] writeUnpackInfoMethodArguments = new java.lang.Object[1];
        writeUnpackInfoMethodArguments[0] = dataOutputStream;
        try {
            writeUnpackInfoMethod.invoke(sevenZOutputFile, writeUnpackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeUnpackInfo(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUnpackInfo(java.io.DataOutput)}
 * @utbot.invokes {@link java.io.DataOutput#write(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: header.write(NID.kUnpackInfo);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteUnpackInfo_ThrowIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 805306621);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeUnpackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeUnpackInfo", objectOutputStreamType);
        writeUnpackInfoMethod.setAccessible(true);
        java.lang.Object[] writeUnpackInfoMethodArguments = new java.lang.Object[1];
        writeUnpackInfoMethodArguments[0] = objectOutputStream;
        try {
            writeUnpackInfoMethod.invoke(sevenZOutputFile, writeUnpackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeUnpackInfo(java.io.DataOutput)
    
    @Test
    public void testWriteUnpackInfo1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "numNonEmptyStreams", 16513);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = new byte[13];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 10);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(SevenZOutputFile.java:629)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo(SevenZOutputFile.java:313) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeUnpackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeUnpackInfo", objectOutputStreamType);
        writeUnpackInfoMethod.setAccessible(true);
        java.lang.Object[] writeUnpackInfoMethodArguments = new java.lang.Object[1];
        writeUnpackInfoMethodArguments[0] = objectOutputStream;
        try {
            writeUnpackInfoMethod.invoke(sevenZOutputFile, writeUnpackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteUnpackInfo2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "numNonEmptyStreams", 129);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = new byte[13];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 10);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(SevenZOutputFile.java:629)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo(SevenZOutputFile.java:313) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeUnpackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeUnpackInfo", objectOutputStreamType);
        writeUnpackInfoMethod.setAccessible(true);
        java.lang.Object[] writeUnpackInfoMethodArguments = new java.lang.Object[1];
        writeUnpackInfoMethodArguments[0] = objectOutputStream;
        try {
            writeUnpackInfoMethod.invoke(sevenZOutputFile, writeUnpackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteUnpackInfo3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo(SevenZOutputFile.java:320) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeUnpackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeUnpackInfo", objectOutputStreamType);
        writeUnpackInfoMethod.setAccessible(true);
        java.lang.Object[] writeUnpackInfoMethodArguments = new java.lang.Object[1];
        writeUnpackInfoMethodArguments[0] = objectOutputStream;
        try {
            writeUnpackInfoMethod.invoke(sevenZOutputFile, writeUnpackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeUnpackInfo
    
    public void testWriteUnpackInfo_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.createArchiveEntry
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createArchiveEntry(java.io.File, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#createArchiveEntry(java.io.File,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entry.setDirectory(inputFile.isDirectory());
 *  */
    @Test
    public void testCreateArchiveEntry_ThrowNullPointerException() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.createArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.createArchiveEntry(SevenZOutputFile.java:98) */
        sevenZOutputFile.createArchiveEntry(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createArchiveEntry(java.io.File, java.lang.String)
    
    @Test
    public void testCreateArchiveEntry1() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        File file = ((File) createInstance("java.io.File"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.createArchiveEntry] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.File.isDirectory(File.java:860)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.createArchiveEntry(SevenZOutputFile.java:98) */
        sevenZOutputFile.createArchiveEntry(file, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileAntiItems
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeFileAntiItems(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileAntiItems(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} once
 *  */
    @Test
    public void testWriteFileAntiItems_IterateForLoop() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileAntiItemsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileAntiItems", dataOutputType);
        writeFileAntiItemsMethod.setAccessible(true);
        java.lang.Object[] writeFileAntiItemsMethodArguments = new java.lang.Object[1];
        writeFileAntiItemsMethodArguments[0] = ((Object) null);
        writeFileAntiItemsMethod.invoke(sevenZOutputFile, writeFileAntiItemsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileAntiItems(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} twice
 *  */
    @Test
    public void testWriteFileAntiItems_IterateForLoop_1() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasStream(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileAntiItemsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileAntiItems", dataOutputType);
        writeFileAntiItemsMethod.setAccessible(true);
        java.lang.Object[] writeFileAntiItemsMethodArguments = new java.lang.Object[1];
        writeFileAntiItemsMethodArguments[0] = ((Object) null);
        writeFileAntiItemsMethod.invoke(sevenZOutputFile, writeFileAntiItemsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileAntiItems(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} twice
 *  */
    @Test
    public void testWriteFileAntiItems_BitSetSet() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileAntiItemsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileAntiItems", dataOutputType);
        writeFileAntiItemsMethod.setAccessible(true);
        java.lang.Object[] writeFileAntiItemsMethodArguments = new java.lang.Object[1];
        writeFileAntiItemsMethodArguments[0] = ((Object) null);
        writeFileAntiItemsMethod.invoke(sevenZOutputFile, writeFileAntiItemsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeFileAntiItems(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileAntiItems(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kAnti);
 *  */
    @Test
    public void testWriteFileAntiItems_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(sevenZArchiveEntry, "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", "isAntiItem", true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", Integer.MIN_VALUE);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileAntiItems] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileAntiItems(SevenZOutputFile.java:445) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileAntiItemsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileAntiItems", objectOutputStreamType);
        writeFileAntiItemsMethod.setAccessible(true);
        java.lang.Object[] writeFileAntiItemsMethodArguments = new java.lang.Object[1];
        writeFileAntiItemsMethodArguments[0] = objectOutputStream;
        try {
            writeFileAntiItemsMethod.invoke(sevenZOutputFile, writeFileAntiItemsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileAntiItems(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kAnti);
 *  */
    @Test
    public void testWriteFileAntiItems_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(sevenZArchiveEntry, "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", "isAntiItem", true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileAntiItems] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileAntiItems(SevenZOutputFile.java:445) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileAntiItemsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileAntiItems", objectOutputStreamType);
        writeFileAntiItemsMethod.setAccessible(true);
        java.lang.Object[] writeFileAntiItemsMethodArguments = new java.lang.Object[1];
        writeFileAntiItemsMethodArguments[0] = objectOutputStream;
        try {
            writeFileAntiItemsMethod.invoke(sevenZOutputFile, writeFileAntiItemsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileAntiItems(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteFileAntiItems_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(sevenZArchiveEntry, "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", "isAntiItem", true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileAntiItems] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileAntiItems(SevenZOutputFile.java:445) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileAntiItemsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileAntiItems", objectOutputStreamType);
        writeFileAntiItemsMethod.setAccessible(true);
        java.lang.Object[] writeFileAntiItemsMethodArguments = new java.lang.Object[1];
        writeFileAntiItemsMethodArguments[0] = objectOutputStream;
        try {
            writeFileAntiItemsMethod.invoke(sevenZOutputFile, writeFileAntiItemsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeFileAntiItems(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileAntiItems(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} twice
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileAntiItems_ThrowIOException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(sevenZArchiveEntry, "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", "isAntiItem", true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileAntiItemsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileAntiItems", objectOutputStreamType);
        writeFileAntiItemsMethod.setAccessible(true);
        java.lang.Object[] writeFileAntiItemsMethodArguments = new java.lang.Object[1];
        writeFileAntiItemsMethodArguments[0] = objectOutputStream;
        try {
            writeFileAntiItemsMethod.invoke(sevenZOutputFile, writeFileAntiItemsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileAntiItems(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} twice
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kAnti);
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileAntiItems_ThrowIOException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(sevenZArchiveEntry, "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", "isAntiItem", true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        DeflaterOutputStream deflaterOutputStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(deflaterOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        DataOutputStream dataOutputStream = new DataOutputStream(deflaterOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileAntiItemsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileAntiItems", dataOutputStreamType);
        writeFileAntiItemsMethod.setAccessible(true);
        java.lang.Object[] writeFileAntiItemsMethodArguments = new java.lang.Object[1];
        writeFileAntiItemsMethodArguments[0] = dataOutputStream;
        try {
            writeFileAntiItemsMethod.invoke(sevenZOutputFile, writeFileAntiItemsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileAntiItems(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} twice
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(NID.kAnti);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteFileAntiItems_ThrowZipException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(sevenZArchiveEntry, "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", "isAntiItem", true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        DataOutputStream dataOutputStream = new DataOutputStream(zipOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileAntiItemsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileAntiItems", dataOutputStreamType);
        writeFileAntiItemsMethod.setAccessible(true);
        java.lang.Object[] writeFileAntiItemsMethodArguments = new java.lang.Object[1];
        writeFileAntiItemsMethodArguments[0] = dataOutputStream;
        try {
            writeFileAntiItemsMethod.invoke(sevenZOutputFile, writeFileAntiItemsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileAntiItems(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} twice
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kAnti);
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileAntiItems_ThrowIOException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(sevenZArchiveEntry, "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", "isAntiItem", true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileAntiItemsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileAntiItems", objectOutputStreamType);
        writeFileAntiItemsMethod.setAccessible(true);
        java.lang.Object[] writeFileAntiItemsMethodArguments = new java.lang.Object[1];
        writeFileAntiItemsMethodArguments[0] = objectOutputStream;
        try {
            writeFileAntiItemsMethod.invoke(sevenZOutputFile, writeFileAntiItemsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileAntiItems(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} twice
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileAntiItems_ThrowIOException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(sevenZArchiveEntry, "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", "isAntiItem", true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileAntiItemsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileAntiItems", objectOutputStreamType);
        writeFileAntiItemsMethod.setAccessible(true);
        java.lang.Object[] writeFileAntiItemsMethodArguments = new java.lang.Object[1];
        writeFileAntiItemsMethodArguments[0] = objectOutputStream;
        try {
            writeFileAntiItemsMethod.invoke(sevenZOutputFile, writeFileAntiItemsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileAntiItems(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} twice
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileAntiItems_ThrowIOException_4() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(sevenZArchiveEntry, "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", "isAntiItem", true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 9223372036854775804L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -3L);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileAntiItemsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileAntiItems", objectOutputStreamType);
        writeFileAntiItemsMethod.setAccessible(true);
        java.lang.Object[] writeFileAntiItemsMethodArguments = new java.lang.Object[1];
        writeFileAntiItemsMethodArguments[0] = objectOutputStream;
        try {
            writeFileAntiItemsMethod.invoke(sevenZOutputFile, writeFileAntiItemsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeFileAntiItems(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileAntiItems(java.io.DataOutput)}
 * @utbot.executesCondition {@code (hasAntiItems): True}
 * @utbot.invokes {@link java.io.DataOutput#write(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} twice
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: header.write(NID.kAnti);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteFileAntiItems_ThrowIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(sevenZArchiveEntry, "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", "isAntiItem", true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", Integer.MAX_VALUE);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileAntiItemsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileAntiItems", objectOutputStreamType);
        writeFileAntiItemsMethod.setAccessible(true);
        java.lang.Object[] writeFileAntiItemsMethodArguments = new java.lang.Object[1];
        writeFileAntiItemsMethodArguments[0] = objectOutputStream;
        try {
            writeFileAntiItemsMethod.invoke(sevenZOutputFile, writeFileAntiItemsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeFileAntiItems(java.io.DataOutput)
    
    @Test
    public void testWriteFileAntiItems1() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasStream(true);
        files.add(sevenZArchiveEntry);
        files.add(sevenZArchiveEntry);
        SevenZArchiveEntry sevenZArchiveEntry1 = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry1);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileAntiItemsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileAntiItems", dataOutputType);
        writeFileAntiItemsMethod.setAccessible(true);
        java.lang.Object[] writeFileAntiItemsMethodArguments = new java.lang.Object[1];
        writeFileAntiItemsMethodArguments[0] = ((Object) null);
        writeFileAntiItemsMethod.invoke(sevenZOutputFile, writeFileAntiItemsMethodArguments);
    }
    
    @Test
    public void testWriteFileAntiItems2() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        SevenZArchiveEntry sevenZArchiveEntry1 = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry1);
        files.add(sevenZArchiveEntry1);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileAntiItemsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileAntiItems", dataOutputType);
        writeFileAntiItemsMethod.setAccessible(true);
        java.lang.Object[] writeFileAntiItemsMethodArguments = new java.lang.Object[1];
        writeFileAntiItemsMethodArguments[0] = ((Object) null);
        writeFileAntiItemsMethod.invoke(sevenZOutputFile, writeFileAntiItemsMethodArguments);
    }
    
    @Test
    public void testWriteFileAntiItems3() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasStream(true);
        files.add(sevenZArchiveEntry);
        SevenZArchiveEntry sevenZArchiveEntry1 = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry1);
        SevenZArchiveEntry sevenZArchiveEntry2 = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry2);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileAntiItemsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileAntiItems", dataOutputType);
        writeFileAntiItemsMethod.setAccessible(true);
        java.lang.Object[] writeFileAntiItemsMethodArguments = new java.lang.Object[1];
        writeFileAntiItemsMethodArguments[0] = ((Object) null);
        writeFileAntiItemsMethod.invoke(sevenZOutputFile, writeFileAntiItemsMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeFileAntiItems(java.io.DataOutput)
    
    @Test
    public void testWriteFileAntiItems4() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(sevenZArchiveEntry, "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", "isAntiItem", true);
        files.add(sevenZArchiveEntry);
        SevenZArchiveEntry sevenZArchiveEntry1 = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry1);
        files.add(sevenZArchiveEntry1);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileAntiItems] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileAntiItems(SevenZOutputFile.java:445) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileAntiItemsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileAntiItems", dataOutputType);
        writeFileAntiItemsMethod.setAccessible(true);
        java.lang.Object[] writeFileAntiItemsMethodArguments = new java.lang.Object[1];
        writeFileAntiItemsMethodArguments[0] = ((Object) null);
        try {
            writeFileAntiItemsMethod.invoke(sevenZOutputFile, writeFileAntiItemsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeFileAntiItems
    
    public void testWriteFileAntiItems_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFolder
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeFolder(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFolder(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteFolder_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFolder] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(SevenZOutputFile.java:627)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFolder(SevenZOutputFile.java:339) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFolderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFolder", objectOutputStreamType);
        writeFolderMethod.setAccessible(true);
        java.lang.Object[] writeFolderMethodArguments = new java.lang.Object[1];
        writeFolderMethodArguments[0] = objectOutputStream;
        try {
            writeFolderMethod.invoke(sevenZOutputFile, writeFolderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFolder(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeUint64(header, 1);
 *  */
    @Test
    public void testWriteFolder_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1023);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFolder] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1023 out of bounds for length 2]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(SevenZOutputFile.java:627)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFolder(SevenZOutputFile.java:339) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFolderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFolder", objectOutputStreamType);
        writeFolderMethod.setAccessible(true);
        java.lang.Object[] writeFolderMethodArguments = new java.lang.Object[1];
        writeFolderMethodArguments[0] = objectOutputStream;
        try {
            writeFolderMethod.invoke(sevenZOutputFile, writeFolderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFolder(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteFolder_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFolder] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(SevenZOutputFile.java:627)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFolder(SevenZOutputFile.java:339) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFolderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFolder", objectOutputStreamType);
        writeFolderMethod.setAccessible(true);
        java.lang.Object[] writeFolderMethodArguments = new java.lang.Object[1];
        writeFolderMethodArguments[0] = objectOutputStream;
        try {
            writeFolderMethod.invoke(sevenZOutputFile, writeFolderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFolder(java.io.DataOutput)}
 * @utbot.executesCondition {@code (properties.length > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(codecFlags);
 *  */
    @Test
    public void testWriteFolder_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        SevenZMethod contentCompression = SevenZMethod.COPY;
        sevenZOutputFile.setContentCompression(contentCompression);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFolder] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFolder(SevenZOutputFile.java:347) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFolderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFolder", objectOutputStreamType);
        writeFolderMethod.setAccessible(true);
        java.lang.Object[] writeFolderMethodArguments = new java.lang.Object[1];
        writeFolderMethodArguments[0] = objectOutputStream;
        try {
            writeFolderMethod.invoke(sevenZOutputFile, writeFolderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFolder(java.io.DataOutput)}
 * @utbot.executesCondition {@code (properties.length > 0): False}
 * @utbot.executesCondition {@code (properties.length > 0): False}
 * @utbot.invokes {@link java.io.DataOutput#write(byte[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteFolder_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        SevenZMethod contentCompression = SevenZMethod.COPY;
        sevenZOutputFile.setContentCompression(contentCompression);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFolder] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 3 out of bounds for byte[2]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFolder(SevenZOutputFile.java:348) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFolderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFolder", objectOutputStreamType);
        writeFolderMethod.setAccessible(true);
        java.lang.Object[] writeFolderMethodArguments = new java.lang.Object[1];
        writeFolderMethodArguments[0] = objectOutputStream;
        try {
            writeFolderMethod.invoke(sevenZOutputFile, writeFolderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFolder(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeUint64(header, 1);
 *  */
    @Test
    public void testWriteFolder_ThrowNullPointerException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFolder] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(SevenZOutputFile.java:627)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFolder(SevenZOutputFile.java:339) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFolderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFolder", dataOutputType);
        writeFolderMethod.setAccessible(true);
        java.lang.Object[] writeFolderMethodArguments = new java.lang.Object[1];
        writeFolderMethodArguments[0] = ((Object) null);
        try {
            writeFolderMethod.invoke(sevenZOutputFile, writeFolderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFolder(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte[] id = contentCompression.getId();
 *  */
    @Test
    public void testWriteFolder_ThrowNullPointerException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFolder] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFolder(SevenZOutputFile.java:340) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFolderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFolder", objectOutputStreamType);
        writeFolderMethod.setAccessible(true);
        java.lang.Object[] writeFolderMethodArguments = new java.lang.Object[1];
        writeFolderMethodArguments[0] = objectOutputStream;
        try {
            writeFolderMethod.invoke(sevenZOutputFile, writeFolderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeFolder(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFolder(java.io.DataOutput)}
 * @utbot.invokes org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUint64(java.io.DataOutput,long)
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: writeUint64(header, 1);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteFolder_ThrowIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 2147483646);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFolderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFolder", objectOutputStreamType);
        writeFolderMethod.setAccessible(true);
        java.lang.Object[] writeFolderMethodArguments = new java.lang.Object[1];
        writeFolderMethodArguments[0] = objectOutputStream;
        try {
            writeFolderMethod.invoke(sevenZOutputFile, writeFolderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeFolder(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFolder(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: writeUint64(header, 1);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteFolder_ThrowZipException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        DataOutputStream dataOutputStream = new DataOutputStream(zipOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFolderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFolder", dataOutputStreamType);
        writeFolderMethod.setAccessible(true);
        java.lang.Object[] writeFolderMethodArguments = new java.lang.Object[1];
        writeFolderMethodArguments[0] = dataOutputStream;
        try {
            writeFolderMethod.invoke(sevenZOutputFile, writeFolderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFolder(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: writeUint64(header, 1);
 *  */
    @Test(expected = IOException.class)
    public void testWriteFolder_ThrowIOException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        DeflaterOutputStream deflaterOutputStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(deflaterOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        DataOutputStream dataOutputStream = new DataOutputStream(deflaterOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFolderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFolder", dataOutputStreamType);
        writeFolderMethod.setAccessible(true);
        java.lang.Object[] writeFolderMethodArguments = new java.lang.Object[1];
        writeFolderMethodArguments[0] = dataOutputStream;
        try {
            writeFolderMethod.invoke(sevenZOutputFile, writeFolderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFolder(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testWriteFolder_ThrowZipException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        (((ZipEntry) entry)).setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", -8L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -2L);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFolderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFolder", objectOutputStreamType);
        writeFolderMethod.setAccessible(true);
        java.lang.Object[] writeFolderMethodArguments = new java.lang.Object[1];
        writeFolderMethodArguments[0] = objectOutputStream;
        try {
            writeFolderMethod.invoke(sevenZOutputFile, writeFolderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFolder(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFolder_ThrowIOException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFolderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFolder", objectOutputStreamType);
        writeFolderMethod.setAccessible(true);
        java.lang.Object[] writeFolderMethodArguments = new java.lang.Object[1];
        writeFolderMethodArguments[0] = objectOutputStream;
        try {
            writeFolderMethod.invoke(sevenZOutputFile, writeFolderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFolder(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFolder_ThrowIOException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        (((ZipEntry) entry)).setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 9223372036854775804L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -3L);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFolderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFolder", objectOutputStreamType);
        writeFolderMethod.setAccessible(true);
        java.lang.Object[] writeFolderMethodArguments = new java.lang.Object[1];
        writeFolderMethodArguments[0] = objectOutputStream;
        try {
            writeFolderMethod.invoke(sevenZOutputFile, writeFolderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFolder(java.io.DataOutput)}
 * @utbot.executesCondition {@code (properties.length > 0): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.sevenz.SevenZMethod#getId()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.sevenz.SevenZMethod#getProperties()}
 * @utbot.invokes {@link java.io.DataOutput#write(int)}
 * @utbot.invokes {@link java.io.DataOutput#write(byte[])}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(id);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteFolder_ThrowZipException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        SevenZMethod contentCompression = SevenZMethod.COPY;
        sevenZOutputFile.setContentCompression(contentCompression);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFolderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFolder", objectOutputStreamType);
        writeFolderMethod.setAccessible(true);
        java.lang.Object[] writeFolderMethodArguments = new java.lang.Object[1];
        writeFolderMethodArguments[0] = objectOutputStream;
        try {
            writeFolderMethod.invoke(sevenZOutputFile, writeFolderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFolder(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: writeUint64(header, 1);
 *  */
    @Test(expected = IOException.class)
    public void testWriteFolder_ThrowIOException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFolderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFolder", objectOutputStreamType);
        writeFolderMethod.setAccessible(true);
        java.lang.Object[] writeFolderMethodArguments = new java.lang.Object[1];
        writeFolderMethodArguments[0] = objectOutputStream;
        try {
            writeFolderMethod.invoke(sevenZOutputFile, writeFolderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFolder(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFolder_ThrowIOException_4() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        (((ZipEntry) entry)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFolderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFolder", objectOutputStreamType);
        writeFolderMethod.setAccessible(true);
        java.lang.Object[] writeFolderMethodArguments = new java.lang.Object[1];
        writeFolderMethodArguments[0] = objectOutputStream;
        try {
            writeFolderMethod.invoke(sevenZOutputFile, writeFolderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFolder(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: writeUint64(header, 1);
 *  */
    @Test(expected = IOException.class)
    public void testWriteFolder_ThrowIOException_5() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(java.lang.Long.MIN_VALUE);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "written", 9223372036854775804L);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "locoff", -3L);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(zipOutputStream, "java.io.FilterOutputStream", "out", out);
        DataOutputStream dataOutputStream = new DataOutputStream(zipOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFolderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFolder", dataOutputStreamType);
        writeFolderMethod.setAccessible(true);
        java.lang.Object[] writeFolderMethodArguments = new java.lang.Object[1];
        writeFolderMethodArguments[0] = dataOutputStream;
        try {
            writeFolderMethod.invoke(sevenZOutputFile, writeFolderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFolder(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: writeUint64(header, 1);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteFolder_ThrowZipException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(zipOutputStream, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFolderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFolder", dataOutputStreamType);
        writeFolderMethod.setAccessible(true);
        java.lang.Object[] writeFolderMethodArguments = new java.lang.Object[1];
        writeFolderMethodArguments[0] = dataOutputStream;
        try {
            writeFolderMethod.invoke(sevenZOutputFile, writeFolderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFolder(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFolder_ThrowIOException_6() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(zipOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(zipOutputStream, null);
        CheckedOutputStream checkedOutputStream1 = new CheckedOutputStream(checkedOutputStream, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream1);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFolderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFolder", dataOutputStreamType);
        writeFolderMethod.setAccessible(true);
        java.lang.Object[] writeFolderMethodArguments = new java.lang.Object[1];
        writeFolderMethodArguments[0] = dataOutputStream;
        try {
            writeFolderMethod.invoke(sevenZOutputFile, writeFolderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeFolder(java.io.DataOutput)
    
    @Test
    public void testWriteFolder1() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        SevenZMethod contentCompression = SevenZMethod.COPY;
        sevenZOutputFile.setContentCompression(contentCompression);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = new byte[11];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFolderMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFolder", objectOutputStreamType);
        writeFolderMethod.setAccessible(true);
        java.lang.Object[] writeFolderMethodArguments = new java.lang.Object[1];
        writeFolderMethodArguments[0] = objectOutputStream;
        writeFolderMethod.invoke(sevenZOutputFile, writeFolderMethodArguments);
        
        Object objectOutputStreamBout = getFieldValue(objectOutputStream, "java.io.ObjectOutputStream", "bout");
        byte[] objectOutputStreamBoutBoutBuf = ((byte[]) getFieldValue(objectOutputStreamBout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf"));
        byte finalObjectOutputStreamBoutBuf0 = ((Byte) get(objectOutputStreamBoutBoutBuf, 0));
        Object objectOutputStreamBout1 = getFieldValue(objectOutputStream, "java.io.ObjectOutputStream", "bout");
        byte[] objectOutputStreamBout1BoutBuf = ((byte[]) getFieldValue(objectOutputStreamBout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf"));
        byte finalObjectOutputStreamBoutBuf1 = ((Byte) get(objectOutputStreamBout1BoutBuf, 1));
        Object objectOutputStreamBout2 = getFieldValue(objectOutputStream, "java.io.ObjectOutputStream", "bout");
        int finalObjectOutputStreamBoutPos = ((Integer) getFieldValue(objectOutputStreamBout2, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos"));
        
        assertEquals((byte) 1, finalObjectOutputStreamBoutBuf0);
        
        assertEquals((byte) 1, finalObjectOutputStreamBoutBuf1);
        
        assertEquals(3, finalObjectOutputStreamBoutPos);
    }
    ///endregion
    
    ///region Errors report for writeFolder
    
    public void testWriteFolder_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writePackInfo(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writePackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kPackInfo);
 *  */
    @Test
    public void testWritePackInfo_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", Integer.MIN_VALUE);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo(SevenZOutputFile.java:286) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writePackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writePackInfo", objectOutputStreamType);
        writePackInfoMethod.setAccessible(true);
        java.lang.Object[] writePackInfoMethodArguments = new java.lang.Object[1];
        writePackInfoMethodArguments[0] = objectOutputStream;
        try {
            writePackInfoMethod.invoke(sevenZOutputFile, writePackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writePackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kPackInfo);
 *  */
    @Test
    public void testWritePackInfo_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo(SevenZOutputFile.java:286) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writePackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writePackInfo", objectOutputStreamType);
        writePackInfoMethod.setAccessible(true);
        java.lang.Object[] writePackInfoMethodArguments = new java.lang.Object[1];
        writePackInfoMethodArguments[0] = objectOutputStream;
        try {
            writePackInfoMethod.invoke(sevenZOutputFile, writePackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writePackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWritePackInfo_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo(SevenZOutputFile.java:286) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writePackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writePackInfo", objectOutputStreamType);
        writePackInfoMethod.setAccessible(true);
        java.lang.Object[] writePackInfoMethodArguments = new java.lang.Object[1];
        writePackInfoMethodArguments[0] = objectOutputStream;
        try {
            writePackInfoMethod.invoke(sevenZOutputFile, writePackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writePackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeUint64(header, 0);
 *  */
    @Test
    public void testWritePackInfo_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(SevenZOutputFile.java:627)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo(SevenZOutputFile.java:288) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writePackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writePackInfo", objectOutputStreamType);
        writePackInfoMethod.setAccessible(true);
        java.lang.Object[] writePackInfoMethodArguments = new java.lang.Object[1];
        writePackInfoMethodArguments[0] = objectOutputStream;
        try {
            writePackInfoMethod.invoke(sevenZOutputFile, writePackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writePackInfo(java.io.DataOutput)}
 * @utbot.invokes org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUint64(java.io.DataOutput,long)
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeUint64(header, 0xffffFFFFL & numNonEmptyStreams);
 *  */
    @Test
    public void testWritePackInfo_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "numNonEmptyStreams", 1);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 4);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(SevenZOutputFile.java:627)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo(SevenZOutputFile.java:289) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writePackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writePackInfo", objectOutputStreamType);
        writePackInfoMethod.setAccessible(true);
        java.lang.Object[] writePackInfoMethodArguments = new java.lang.Object[1];
        writePackInfoMethodArguments[0] = objectOutputStream;
        try {
            writePackInfoMethod.invoke(sevenZOutputFile, writePackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writePackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: header.write(NID.kPackInfo);
 *  */
    @Test
    public void testWritePackInfo_ThrowNullPointerException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo(SevenZOutputFile.java:286) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writePackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writePackInfo", dataOutputType);
        writePackInfoMethod.setAccessible(true);
        java.lang.Object[] writePackInfoMethodArguments = new java.lang.Object[1];
        writePackInfoMethodArguments[0] = ((Object) null);
        try {
            writePackInfoMethod.invoke(sevenZOutputFile, writePackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writePackInfo(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writePackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: header.write(NID.kPackInfo);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWritePackInfo_ThrowIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 2147483646);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writePackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writePackInfo", objectOutputStreamType);
        writePackInfoMethod.setAccessible(true);
        java.lang.Object[] writePackInfoMethodArguments = new java.lang.Object[1];
        writePackInfoMethodArguments[0] = objectOutputStream;
        try {
            writePackInfoMethod.invoke(sevenZOutputFile, writePackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writePackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: header.write(NID.kPackInfo);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWritePackInfo_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 805306871);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writePackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writePackInfo", objectOutputStreamType);
        writePackInfoMethod.setAccessible(true);
        java.lang.Object[] writePackInfoMethodArguments = new java.lang.Object[1];
        writePackInfoMethodArguments[0] = objectOutputStream;
        try {
            writePackInfoMethod.invoke(sevenZOutputFile, writePackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writePackInfo(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writePackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kPackInfo);
 *  */
    @Test(expected = IOException.class)
    public void testWritePackInfo_ThrowIOException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "closed", true);
        DataOutputStream dataOutputStream = new DataOutputStream(zipOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writePackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writePackInfo", dataOutputStreamType);
        writePackInfoMethod.setAccessible(true);
        java.lang.Object[] writePackInfoMethodArguments = new java.lang.Object[1];
        writePackInfoMethodArguments[0] = dataOutputStream;
        try {
            writePackInfoMethod.invoke(sevenZOutputFile, writePackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writePackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kPackInfo);
 *  */
    @Test(expected = IOException.class)
    public void testWritePackInfo_ThrowIOException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        DeflaterOutputStream deflaterOutputStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(deflaterOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        DataOutputStream dataOutputStream = new DataOutputStream(deflaterOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writePackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writePackInfo", dataOutputStreamType);
        writePackInfoMethod.setAccessible(true);
        java.lang.Object[] writePackInfoMethodArguments = new java.lang.Object[1];
        writePackInfoMethodArguments[0] = dataOutputStream;
        try {
            writePackInfoMethod.invoke(sevenZOutputFile, writePackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writePackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kPackInfo);
 *  */
    @Test(expected = IOException.class)
    public void testWritePackInfo_ThrowIOException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "closed", true);
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(jarOutputStream, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writePackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writePackInfo", dataOutputStreamType);
        writePackInfoMethod.setAccessible(true);
        java.lang.Object[] writePackInfoMethodArguments = new java.lang.Object[1];
        writePackInfoMethodArguments[0] = dataOutputStream;
        try {
            writePackInfoMethod.invoke(sevenZOutputFile, writePackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writePackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWritePackInfo_ThrowIOException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", -9223372036587913218L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", 266862591L);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writePackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writePackInfo", objectOutputStreamType);
        writePackInfoMethod.setAccessible(true);
        java.lang.Object[] writePackInfoMethodArguments = new java.lang.Object[1];
        writePackInfoMethodArguments[0] = objectOutputStream;
        try {
            writePackInfoMethod.invoke(sevenZOutputFile, writePackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writePackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kPackInfo);
 *  */
    @Test(expected = IOException.class)
    public void testWritePackInfo_ThrowIOException_4() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writePackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writePackInfo", objectOutputStreamType);
        writePackInfoMethod.setAccessible(true);
        java.lang.Object[] writePackInfoMethodArguments = new java.lang.Object[1];
        writePackInfoMethodArguments[0] = objectOutputStream;
        try {
            writePackInfoMethod.invoke(sevenZOutputFile, writePackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writePackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWritePackInfo_ThrowIOException_5() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writePackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writePackInfo", objectOutputStreamType);
        writePackInfoMethod.setAccessible(true);
        java.lang.Object[] writePackInfoMethodArguments = new java.lang.Object[1];
        writePackInfoMethodArguments[0] = objectOutputStream;
        try {
            writePackInfoMethod.invoke(sevenZOutputFile, writePackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writePackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWritePackInfo_ThrowIOException_6() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 9223372036854775804L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -3L);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writePackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writePackInfo", objectOutputStreamType);
        writePackInfoMethod.setAccessible(true);
        java.lang.Object[] writePackInfoMethodArguments = new java.lang.Object[1];
        writePackInfoMethodArguments[0] = objectOutputStream;
        try {
            writePackInfoMethod.invoke(sevenZOutputFile, writePackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writePackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWritePackInfo_ThrowIOException_7() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "closed", true);
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(zipOutputStream, null);
        CheckedOutputStream checkedOutputStream1 = new CheckedOutputStream(checkedOutputStream, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream1);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writePackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writePackInfo", dataOutputStreamType);
        writePackInfoMethod.setAccessible(true);
        java.lang.Object[] writePackInfoMethodArguments = new java.lang.Object[1];
        writePackInfoMethodArguments[0] = dataOutputStream;
        try {
            writePackInfoMethod.invoke(sevenZOutputFile, writePackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writePackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWritePackInfo_ThrowIOException_8() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(java.lang.Long.MIN_VALUE);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "written", 6917529027607527420L);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "locoff", -2305843009247248387L);
        CheckedOutputStream out = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(jarOutputStream, "java.io.FilterOutputStream", "out", out);
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(jarOutputStream, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writePackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writePackInfo", dataOutputStreamType);
        writePackInfoMethod.setAccessible(true);
        java.lang.Object[] writePackInfoMethodArguments = new java.lang.Object[1];
        writePackInfoMethodArguments[0] = dataOutputStream;
        try {
            writePackInfoMethod.invoke(sevenZOutputFile, writePackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writePackInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWritePackInfo_ThrowIOException_9() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(java.lang.Long.MIN_VALUE);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "written", 9223372036854775804L);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "locoff", -3L);
        CheckedOutputStream out = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(zipOutputStream, "java.io.FilterOutputStream", "out", out);
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(zipOutputStream, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writePackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writePackInfo", dataOutputStreamType);
        writePackInfoMethod.setAccessible(true);
        java.lang.Object[] writePackInfoMethodArguments = new java.lang.Object[1];
        writePackInfoMethodArguments[0] = dataOutputStream;
        try {
            writePackInfoMethod.invoke(sevenZOutputFile, writePackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writePackInfo(java.io.DataOutput)
    
    @Test
    public void testWritePackInfo1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "numNonEmptyStreams", 128);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = new byte[13];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 10);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(SevenZOutputFile.java:629)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo(SevenZOutputFile.java:289) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writePackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writePackInfo", objectOutputStreamType);
        writePackInfoMethod.setAccessible(true);
        java.lang.Object[] writePackInfoMethodArguments = new java.lang.Object[1];
        writePackInfoMethodArguments[0] = objectOutputStream;
        try {
            writePackInfoMethod.invoke(sevenZOutputFile, writePackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWritePackInfo2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo(SevenZOutputFile.java:292) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writePackInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writePackInfo", objectOutputStreamType);
        writePackInfoMethod.setAccessible(true);
        java.lang.Object[] writePackInfoMethodArguments = new java.lang.Object[1];
        writePackInfoMethodArguments[0] = objectOutputStream;
        try {
            writePackInfoMethod.invoke(sevenZOutputFile, writePackInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writePackInfo
    
    public void testWritePackInfo_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeStreamsInfo(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeStreamsInfo(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numNonEmptyStreams > 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeSubStreamsInfo(header);
 *  */
    @Test
    public void testWriteStreamsInfo_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", Integer.MIN_VALUE);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSubStreamsInfo(SevenZOutputFile.java:357)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo(SevenZOutputFile.java:280) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeStreamsInfo", objectOutputStreamType);
        writeStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeStreamsInfoMethodArguments = new java.lang.Object[1];
        writeStreamsInfoMethodArguments[0] = objectOutputStream;
        try {
            writeStreamsInfoMethod.invoke(sevenZOutputFile, writeStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeStreamsInfo(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numNonEmptyStreams > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writePackInfo(header);
 *  */
    @Test
    public void testWriteStreamsInfo_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "numNonEmptyStreams", 1);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", Integer.MIN_VALUE);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo(SevenZOutputFile.java:286)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo(SevenZOutputFile.java:276) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeStreamsInfo", objectOutputStreamType);
        writeStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeStreamsInfoMethodArguments = new java.lang.Object[1];
        writeStreamsInfoMethodArguments[0] = objectOutputStream;
        try {
            writeStreamsInfoMethod.invoke(sevenZOutputFile, writeStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeStreamsInfo(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numNonEmptyStreams > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteStreamsInfo_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "numNonEmptyStreams", 1);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo(SevenZOutputFile.java:286)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo(SevenZOutputFile.java:276) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeStreamsInfo", objectOutputStreamType);
        writeStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeStreamsInfoMethodArguments = new java.lang.Object[1];
        writeStreamsInfoMethodArguments[0] = objectOutputStream;
        try {
            writeStreamsInfoMethod.invoke(sevenZOutputFile, writeStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeStreamsInfo(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numNonEmptyStreams > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteStreamsInfo_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "numNonEmptyStreams", 1);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo(SevenZOutputFile.java:286)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo(SevenZOutputFile.java:276) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeStreamsInfo", objectOutputStreamType);
        writeStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeStreamsInfoMethodArguments = new java.lang.Object[1];
        writeStreamsInfoMethodArguments[0] = objectOutputStream;
        try {
            writeStreamsInfoMethod.invoke(sevenZOutputFile, writeStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeStreamsInfo(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numNonEmptyStreams > 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeSubStreamsInfo(header);
 *  */
    @Test
    public void testWriteStreamsInfo_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSubStreamsInfo(SevenZOutputFile.java:367)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo(SevenZOutputFile.java:280) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeStreamsInfo", objectOutputStreamType);
        writeStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeStreamsInfoMethodArguments = new java.lang.Object[1];
        writeStreamsInfoMethodArguments[0] = objectOutputStream;
        try {
            writeStreamsInfoMethod.invoke(sevenZOutputFile, writeStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeStreamsInfo(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numNonEmptyStreams > 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeSubStreamsInfo(header);
 *  */
    @Test
    public void testWriteStreamsInfo_ThrowNullPointerException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSubStreamsInfo(SevenZOutputFile.java:357)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo(SevenZOutputFile.java:280) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeStreamsInfo", dataOutputType);
        writeStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeStreamsInfoMethodArguments = new java.lang.Object[1];
        writeStreamsInfoMethodArguments[0] = ((Object) null);
        try {
            writeStreamsInfoMethod.invoke(sevenZOutputFile, writeStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeStreamsInfo(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numNonEmptyStreams > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writePackInfo(header);
 *  */
    @Test
    public void testWriteStreamsInfo_ThrowNullPointerException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "numNonEmptyStreams", 1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo(SevenZOutputFile.java:286)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo(SevenZOutputFile.java:276) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeStreamsInfo", dataOutputType);
        writeStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeStreamsInfoMethodArguments = new java.lang.Object[1];
        writeStreamsInfoMethodArguments[0] = ((Object) null);
        try {
            writeStreamsInfoMethod.invoke(sevenZOutputFile, writeStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeStreamsInfo(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeStreamsInfo(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numNonEmptyStreams > 0): False}
 * @utbot.invokes org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeSubStreamsInfo(java.io.DataOutput)
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: writeSubStreamsInfo(header);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteStreamsInfo_ThrowIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 2147483646);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeStreamsInfo", objectOutputStreamType);
        writeStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeStreamsInfoMethodArguments = new java.lang.Object[1];
        writeStreamsInfoMethodArguments[0] = objectOutputStream;
        try {
            writeStreamsInfoMethod.invoke(sevenZOutputFile, writeStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeStreamsInfo(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeStreamsInfo(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numNonEmptyStreams > 0): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteStreamsInfo_ThrowIOException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "numNonEmptyStreams", 1);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeStreamsInfo", objectOutputStreamType);
        writeStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeStreamsInfoMethodArguments = new java.lang.Object[1];
        writeStreamsInfoMethodArguments[0] = objectOutputStream;
        try {
            writeStreamsInfoMethod.invoke(sevenZOutputFile, writeStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeStreamsInfo(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numNonEmptyStreams > 0): True}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: writePackInfo(header);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteStreamsInfo_ThrowZipException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "numNonEmptyStreams", 1);
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setSize(java.lang.Long.MIN_VALUE);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "written", -4L);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "locoff", -2L);
        DataOutputStream dataOutputStream = new DataOutputStream(zipOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeStreamsInfo", dataOutputStreamType);
        writeStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeStreamsInfoMethodArguments = new java.lang.Object[1];
        writeStreamsInfoMethodArguments[0] = dataOutputStream;
        try {
            writeStreamsInfoMethod.invoke(sevenZOutputFile, writeStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeStreamsInfo(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numNonEmptyStreams > 0): False}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: writeSubStreamsInfo(header);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteStreamsInfo_ThrowZipException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setSize(java.lang.Long.MIN_VALUE);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "written", -4L);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "locoff", -2L);
        DataOutputStream dataOutputStream = new DataOutputStream(zipOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeStreamsInfo", dataOutputStreamType);
        writeStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeStreamsInfoMethodArguments = new java.lang.Object[1];
        writeStreamsInfoMethodArguments[0] = dataOutputStream;
        try {
            writeStreamsInfoMethod.invoke(sevenZOutputFile, writeStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeStreamsInfo(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numNonEmptyStreams > 0): False}
 * @utbot.throwsException {@link java.io.IOException} in: writeSubStreamsInfo(header);
 *  */
    @Test(expected = IOException.class)
    public void testWriteStreamsInfo_ThrowIOException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        DeflaterOutputStream deflaterOutputStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(deflaterOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        DataOutputStream dataOutputStream = new DataOutputStream(deflaterOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeStreamsInfo", dataOutputStreamType);
        writeStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeStreamsInfoMethodArguments = new java.lang.Object[1];
        writeStreamsInfoMethodArguments[0] = dataOutputStream;
        try {
            writeStreamsInfoMethod.invoke(sevenZOutputFile, writeStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeStreamsInfo(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numNonEmptyStreams > 0): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteStreamsInfo_ThrowIOException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "numNonEmptyStreams", 1);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeStreamsInfo", objectOutputStreamType);
        writeStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeStreamsInfoMethodArguments = new java.lang.Object[1];
        writeStreamsInfoMethodArguments[0] = objectOutputStream;
        try {
            writeStreamsInfoMethod.invoke(sevenZOutputFile, writeStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeStreamsInfo(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numNonEmptyStreams > 0): False}
 * @utbot.throwsException {@link java.io.IOException} in: writeSubStreamsInfo(header);
 *  */
    @Test(expected = IOException.class)
    public void testWriteStreamsInfo_ThrowIOException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeStreamsInfo", objectOutputStreamType);
        writeStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeStreamsInfoMethodArguments = new java.lang.Object[1];
        writeStreamsInfoMethodArguments[0] = objectOutputStream;
        try {
            writeStreamsInfoMethod.invoke(sevenZOutputFile, writeStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeStreamsInfo(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numNonEmptyStreams > 0): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteStreamsInfo_ThrowIOException_4() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "numNonEmptyStreams", 1);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeStreamsInfo", objectOutputStreamType);
        writeStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeStreamsInfoMethodArguments = new java.lang.Object[1];
        writeStreamsInfoMethodArguments[0] = objectOutputStream;
        try {
            writeStreamsInfoMethod.invoke(sevenZOutputFile, writeStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeStreamsInfo(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numNonEmptyStreams > 0): True}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: writePackInfo(header);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteStreamsInfo_ThrowZipException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "numNonEmptyStreams", 1);
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(jarOutputStream, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeStreamsInfo", dataOutputStreamType);
        writeStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeStreamsInfoMethodArguments = new java.lang.Object[1];
        writeStreamsInfoMethodArguments[0] = dataOutputStream;
        try {
            writeStreamsInfoMethod.invoke(sevenZOutputFile, writeStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeStreamsInfo(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numNonEmptyStreams > 0): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteStreamsInfo_ThrowIOException_5() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 9223372036854775804L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -3L);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeStreamsInfo", objectOutputStreamType);
        writeStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeStreamsInfoMethodArguments = new java.lang.Object[1];
        writeStreamsInfoMethodArguments[0] = objectOutputStream;
        try {
            writeStreamsInfoMethod.invoke(sevenZOutputFile, writeStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeStreamsInfo(java.io.DataOutput)
    
    @Test
    public void testWriteStreamsInfo1() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "numNonEmptyStreams", -2147483647);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeStreamsInfo", objectOutputStreamType);
        writeStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeStreamsInfoMethodArguments = new java.lang.Object[1];
        writeStreamsInfoMethodArguments[0] = objectOutputStream;
        writeStreamsInfoMethod.invoke(sevenZOutputFile, writeStreamsInfoMethodArguments);
        
        Object objectOutputStreamBout = getFieldValue(objectOutputStream, "java.io.ObjectOutputStream", "bout");
        byte[] objectOutputStreamBoutBoutBuf = ((byte[]) getFieldValue(objectOutputStreamBout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf"));
        byte finalObjectOutputStreamBoutBuf0 = ((Byte) get(objectOutputStreamBoutBoutBuf, 0));
        Object objectOutputStreamBout1 = getFieldValue(objectOutputStream, "java.io.ObjectOutputStream", "bout");
        int finalObjectOutputStreamBoutPos = ((Integer) getFieldValue(objectOutputStreamBout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos"));
        
        assertEquals((byte) 8, finalObjectOutputStreamBoutBuf0);
        
        assertEquals(3, finalObjectOutputStreamBoutPos);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeStreamsInfo(java.io.DataOutput)
    
    @Test
    public void testWriteStreamsInfo2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "numNonEmptyStreams", -2147483647);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1073741824);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSubStreamsInfo(SevenZOutputFile.java:357)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo(SevenZOutputFile.java:280) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeStreamsInfo", objectOutputStreamType);
        writeStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeStreamsInfoMethodArguments = new java.lang.Object[1];
        writeStreamsInfoMethodArguments[0] = objectOutputStream;
        try {
            writeStreamsInfoMethod.invoke(sevenZOutputFile, writeStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteStreamsInfo3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "numNonEmptyStreams", 1);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(SevenZOutputFile.java:627)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo(SevenZOutputFile.java:288)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo(SevenZOutputFile.java:276) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeStreamsInfo", objectOutputStreamType);
        writeStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeStreamsInfoMethodArguments = new java.lang.Object[1];
        writeStreamsInfoMethodArguments[0] = objectOutputStream;
        try {
            writeStreamsInfoMethod.invoke(sevenZOutputFile, writeStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteStreamsInfo4() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "numNonEmptyStreams", 1);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo(SevenZOutputFile.java:292)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo(SevenZOutputFile.java:276) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeStreamsInfo", objectOutputStreamType);
        writeStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeStreamsInfoMethodArguments = new java.lang.Object[1];
        writeStreamsInfoMethodArguments[0] = objectOutputStream;
        try {
            writeStreamsInfoMethod.invoke(sevenZOutputFile, writeStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method writeStreamsInfo(java.io.DataOutput)
    
    @Test(expected = IOException.class)
    public void testWriteStreamsInfo5() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "numNonEmptyStreams", -2147483647);
        RandomAccessFile randomAccessFile = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class randomAccessFileType = Class.forName("java.io.DataOutput");
        Method writeStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeStreamsInfo", randomAccessFileType);
        writeStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeStreamsInfoMethodArguments = new java.lang.Object[1];
        writeStreamsInfoMethodArguments[0] = randomAccessFile;
        try {
            writeStreamsInfoMethod.invoke(sevenZOutputFile, writeStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeStreamsInfo
    
    public void testWriteStreamsInfo_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Concrete execution failed
        
        // 2 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.closeArchiveEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#closeArchiveEntry()}
 * @utbot.executesCondition {@code (currentOutputStream != null): False}
 * @utbot.executesCondition {@code (fileBytesWritten > 0): False}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry#setHasStream(boolean)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry#setSize(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry#setCompressedSize(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry#setHasCrc(boolean)}
 * @utbot.invokes {@link java.util.zip.CRC32#reset()}
 * @utbot.invokes {@link java.util.zip.CRC32#reset()}
 *  */
    @Test
    public void testCloseArchiveEntry_FileBytesWrittenLessOrEqualZero() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setSize(0L);
        sevenZArchiveEntry.setCompressedSize(0L);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        CRC32 crc32 = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(crc32, "java.util.zip.CRC32", "crc", -255);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "crc32", crc32);
        CRC32 compressedCrc32 = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(compressedCrc32, "java.util.zip.CRC32", "crc", -255);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "compressedCrc32", compressedCrc32);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "fileBytesWritten", 0L);
        
        sevenZOutputFile.closeArchiveEntry();
        
        CRC32 sevenZOutputFileCrc32 = ((CRC32) getFieldValue(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "crc32"));
        int finalSevenZOutputFileCrc32Crc = ((Integer) getFieldValue(sevenZOutputFileCrc32, "java.util.zip.CRC32", "crc"));
        CRC32 sevenZOutputFileCompressedCrc32 = ((CRC32) getFieldValue(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "compressedCrc32"));
        int finalSevenZOutputFileCompressedCrc32Crc = ((Integer) getFieldValue(sevenZOutputFileCompressedCrc32, "java.util.zip.CRC32", "crc"));
        
        assertEquals(0, finalSevenZOutputFileCrc32Crc);
        
        assertEquals(0, finalSevenZOutputFileCompressedCrc32Crc);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#closeArchiveEntry()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final SevenZArchiveEntry entry = files.get(files.size() - 1);
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowIndexOutOfBoundsException() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.closeArchiveEntry] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.closeArchiveEntry(SevenZOutputFile.java:128) */
        sevenZOutputFile.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#closeArchiveEntry()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final SevenZArchiveEntry entry = files.get(files.size() - 1);
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowNullPointerException() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.closeArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.closeArchiveEntry(SevenZOutputFile.java:128) */
        sevenZOutputFile.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#closeArchiveEntry()}
 * @utbot.executesCondition {@code (fileBytesWritten > 0): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry#setHasStream(boolean)}
 * @utbot.invokes {@link org.apache.commons.compress.utils.CountingOutputStream#getBytesWritten()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entry.setSize(currentOutputStream.getBytesWritten());
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowNullPointerException_3() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "numNonEmptyStreams", -255);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "fileBytesWritten", 1L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.closeArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.closeArchiveEntry(SevenZOutputFile.java:132) */
        sevenZOutputFile.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#closeArchiveEntry()}
 * @utbot.executesCondition {@code (fileBytesWritten > 0): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry#setHasStream(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entry.setHasStream(false);
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowNullPointerException_1() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        files.add(null);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "fileBytesWritten", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.closeArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.closeArchiveEntry(SevenZOutputFile.java:138) */
        sevenZOutputFile.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#closeArchiveEntry()}
 * @utbot.executesCondition {@code (fileBytesWritten > 0): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry#setHasStream(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entry.setHasStream(true);
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowNullPointerException_2() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        files.add(null);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "fileBytesWritten", 1L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.closeArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.closeArchiveEntry(SevenZOutputFile.java:130) */
        sevenZOutputFile.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#closeArchiveEntry()}
 * @utbot.executesCondition {@code (fileBytesWritten > 0): False}
 * @utbot.invokes {@link java.util.zip.CRC32#reset()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: crc32.reset();
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowNullPointerException_4() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setSize(0L);
        sevenZArchiveEntry.setCompressedSize(0L);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "fileBytesWritten", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.closeArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.closeArchiveEntry(SevenZOutputFile.java:144) */
        sevenZOutputFile.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#closeArchiveEntry()}
 * @utbot.executesCondition {@code (fileBytesWritten > 0): False}
 * @utbot.invokes {@link java.util.zip.CRC32#reset()}
 * @utbot.invokes {@link java.util.zip.CRC32#reset()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compressedCrc32.reset();
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowNullPointerException_5() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setSize(0L);
        sevenZArchiveEntry.setCompressedSize(0L);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        CRC32 crc32 = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(crc32, "java.util.zip.CRC32", "crc", -255);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "crc32", crc32);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "fileBytesWritten", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.closeArchiveEntry] produces [java.lang.NullPointerException] */
        sevenZOutputFile.closeArchiveEntry();
    }
    ///endregion
    
    ///region Errors report for closeArchiveEntry
    
    public void testCloseArchiveEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 20 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeFilesInfo(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFilesInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kFilesInfo);
 *  */
    @Test
    public void testWriteFilesInfo_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", Integer.MIN_VALUE);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo(SevenZOutputFile.java:371) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFilesInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFilesInfo", objectOutputStreamType);
        writeFilesInfoMethod.setAccessible(true);
        java.lang.Object[] writeFilesInfoMethodArguments = new java.lang.Object[1];
        writeFilesInfoMethodArguments[0] = objectOutputStream;
        try {
            writeFilesInfoMethod.invoke(sevenZOutputFile, writeFilesInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFilesInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kFilesInfo);
 *  */
    @Test
    public void testWriteFilesInfo_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo(SevenZOutputFile.java:371) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFilesInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFilesInfo", objectOutputStreamType);
        writeFilesInfoMethod.setAccessible(true);
        java.lang.Object[] writeFilesInfoMethodArguments = new java.lang.Object[1];
        writeFilesInfoMethodArguments[0] = objectOutputStream;
        try {
            writeFilesInfoMethod.invoke(sevenZOutputFile, writeFilesInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFilesInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteFilesInfo_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo(SevenZOutputFile.java:371) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFilesInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFilesInfo", objectOutputStreamType);
        writeFilesInfoMethod.setAccessible(true);
        java.lang.Object[] writeFilesInfoMethodArguments = new java.lang.Object[1];
        writeFilesInfoMethodArguments[0] = objectOutputStream;
        try {
            writeFilesInfoMethod.invoke(sevenZOutputFile, writeFilesInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFilesInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeUint64(header, files.size());
 *  */
    @Test
    public void testWriteFilesInfo_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        files.add(null);
        files.add(null);
        files.add(null);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(SevenZOutputFile.java:627)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo(SevenZOutputFile.java:373) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFilesInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFilesInfo", objectOutputStreamType);
        writeFilesInfoMethod.setAccessible(true);
        java.lang.Object[] writeFilesInfoMethodArguments = new java.lang.Object[1];
        writeFilesInfoMethodArguments[0] = objectOutputStream;
        try {
            writeFilesInfoMethod.invoke(sevenZOutputFile, writeFilesInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFilesInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: header.write(NID.kFilesInfo);
 *  */
    @Test
    public void testWriteFilesInfo_ThrowNullPointerException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo(SevenZOutputFile.java:371) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFilesInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFilesInfo", dataOutputType);
        writeFilesInfoMethod.setAccessible(true);
        java.lang.Object[] writeFilesInfoMethodArguments = new java.lang.Object[1];
        writeFilesInfoMethodArguments[0] = ((Object) null);
        try {
            writeFilesInfoMethod.invoke(sevenZOutputFile, writeFilesInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFilesInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeUint64(header, files.size());
 *  */
    @Test
    public void testWriteFilesInfo_ThrowNullPointerException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo(SevenZOutputFile.java:373) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFilesInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFilesInfo", objectOutputStreamType);
        writeFilesInfoMethod.setAccessible(true);
        java.lang.Object[] writeFilesInfoMethodArguments = new java.lang.Object[1];
        writeFilesInfoMethodArguments[0] = objectOutputStream;
        try {
            writeFilesInfoMethod.invoke(sevenZOutputFile, writeFilesInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFilesInfo(java.io.DataOutput)}
 * @utbot.invokes org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyStreams(java.io.DataOutput)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeFileEmptyStreams(header);
 *  */
    @Test
    public void testWriteFilesInfo_ThrowNullPointerException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyStreams(SevenZOutputFile.java:389)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo(SevenZOutputFile.java:375) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFilesInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFilesInfo", objectOutputStreamType);
        writeFilesInfoMethod.setAccessible(true);
        java.lang.Object[] writeFilesInfoMethodArguments = new java.lang.Object[1];
        writeFilesInfoMethodArguments[0] = objectOutputStream;
        try {
            writeFilesInfoMethod.invoke(sevenZOutputFile, writeFilesInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeFilesInfo(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFilesInfo(java.io.DataOutput)}
 * @utbot.invokes {@link java.io.DataOutput#write(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: header.write(NID.kFilesInfo);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteFilesInfo_ThrowIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 2147483646);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFilesInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFilesInfo", objectOutputStreamType);
        writeFilesInfoMethod.setAccessible(true);
        java.lang.Object[] writeFilesInfoMethodArguments = new java.lang.Object[1];
        writeFilesInfoMethodArguments[0] = objectOutputStream;
        try {
            writeFilesInfoMethod.invoke(sevenZOutputFile, writeFilesInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeFilesInfo(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFilesInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kFilesInfo);
 *  */
    @Test(expected = IOException.class)
    public void testWriteFilesInfo_ThrowIOException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "closed", true);
        DataOutputStream dataOutputStream = new DataOutputStream(zipOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFilesInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFilesInfo", dataOutputStreamType);
        writeFilesInfoMethod.setAccessible(true);
        java.lang.Object[] writeFilesInfoMethodArguments = new java.lang.Object[1];
        writeFilesInfoMethodArguments[0] = dataOutputStream;
        try {
            writeFilesInfoMethod.invoke(sevenZOutputFile, writeFilesInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFilesInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(NID.kFilesInfo);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteFilesInfo_ThrowZipException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", -8L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -2L);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFilesInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFilesInfo", objectOutputStreamType);
        writeFilesInfoMethod.setAccessible(true);
        java.lang.Object[] writeFilesInfoMethodArguments = new java.lang.Object[1];
        writeFilesInfoMethodArguments[0] = objectOutputStream;
        try {
            writeFilesInfoMethod.invoke(sevenZOutputFile, writeFilesInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFilesInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kFilesInfo);
 *  */
    @Test(expected = IOException.class)
    public void testWriteFilesInfo_ThrowIOException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFilesInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFilesInfo", objectOutputStreamType);
        writeFilesInfoMethod.setAccessible(true);
        java.lang.Object[] writeFilesInfoMethodArguments = new java.lang.Object[1];
        writeFilesInfoMethodArguments[0] = objectOutputStream;
        try {
            writeFilesInfoMethod.invoke(sevenZOutputFile, writeFilesInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFilesInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFilesInfo_ThrowIOException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 9223372036854775804L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -3L);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFilesInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFilesInfo", objectOutputStreamType);
        writeFilesInfoMethod.setAccessible(true);
        java.lang.Object[] writeFilesInfoMethodArguments = new java.lang.Object[1];
        writeFilesInfoMethodArguments[0] = objectOutputStream;
        try {
            writeFilesInfoMethod.invoke(sevenZOutputFile, writeFilesInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFilesInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kFilesInfo);
 *  */
    @Test(expected = IOException.class)
    public void testWriteFilesInfo_ThrowIOException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFilesInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFilesInfo", objectOutputStreamType);
        writeFilesInfoMethod.setAccessible(true);
        java.lang.Object[] writeFilesInfoMethodArguments = new java.lang.Object[1];
        writeFilesInfoMethodArguments[0] = objectOutputStream;
        try {
            writeFilesInfoMethod.invoke(sevenZOutputFile, writeFilesInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFilesInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFilesInfo_ThrowIOException_4() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 9223372036854775804L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -3L);
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        ZipOutputStream out2 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out2, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFilesInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFilesInfo", objectOutputStreamType);
        writeFilesInfoMethod.setAccessible(true);
        java.lang.Object[] writeFilesInfoMethodArguments = new java.lang.Object[1];
        writeFilesInfoMethodArguments[0] = objectOutputStream;
        try {
            writeFilesInfoMethod.invoke(sevenZOutputFile, writeFilesInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFilesInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFilesInfo_ThrowIOException_5() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFilesInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFilesInfo", objectOutputStreamType);
        writeFilesInfoMethod.setAccessible(true);
        java.lang.Object[] writeFilesInfoMethodArguments = new java.lang.Object[1];
        writeFilesInfoMethodArguments[0] = objectOutputStream;
        try {
            writeFilesInfoMethod.invoke(sevenZOutputFile, writeFilesInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFilesInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFilesInfo_ThrowIOException_6() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 9223372036854775804L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -3L);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFilesInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFilesInfo", objectOutputStreamType);
        writeFilesInfoMethod.setAccessible(true);
        java.lang.Object[] writeFilesInfoMethodArguments = new java.lang.Object[1];
        writeFilesInfoMethodArguments[0] = objectOutputStream;
        try {
            writeFilesInfoMethod.invoke(sevenZOutputFile, writeFilesInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFilesInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kFilesInfo);
 *  */
    @Test(expected = IOException.class)
    public void testWriteFilesInfo_ThrowIOException_7() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        DeflaterOutputStream deflaterOutputStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(deflaterOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(deflaterOutputStream, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFilesInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFilesInfo", dataOutputStreamType);
        writeFilesInfoMethod.setAccessible(true);
        java.lang.Object[] writeFilesInfoMethodArguments = new java.lang.Object[1];
        writeFilesInfoMethodArguments[0] = dataOutputStream;
        try {
            writeFilesInfoMethod.invoke(sevenZOutputFile, writeFilesInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFilesInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFilesInfo_ThrowIOException_8() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 9223372036854775804L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -3L);
        CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
        DeflaterOutputStream out2 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out2, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFilesInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFilesInfo", objectOutputStreamType);
        writeFilesInfoMethod.setAccessible(true);
        java.lang.Object[] writeFilesInfoMethodArguments = new java.lang.Object[1];
        writeFilesInfoMethodArguments[0] = objectOutputStream;
        try {
            writeFilesInfoMethod.invoke(sevenZOutputFile, writeFilesInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFilesInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(NID.kFilesInfo);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteFilesInfo_ThrowZipException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(zipOutputStream, null);
        CheckedOutputStream checkedOutputStream1 = new CheckedOutputStream(checkedOutputStream, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream1);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFilesInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFilesInfo", dataOutputStreamType);
        writeFilesInfoMethod.setAccessible(true);
        java.lang.Object[] writeFilesInfoMethodArguments = new java.lang.Object[1];
        writeFilesInfoMethodArguments[0] = dataOutputStream;
        try {
            writeFilesInfoMethod.invoke(sevenZOutputFile, writeFilesInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeFilesInfo(java.io.DataOutput)
    
    @Test
    public void testWriteFilesInfo1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = new byte[39];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 37);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileNames(SevenZOutputFile.java:457)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo(SevenZOutputFile.java:378) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFilesInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFilesInfo", objectOutputStreamType);
        writeFilesInfoMethod.setAccessible(true);
        java.lang.Object[] writeFilesInfoMethodArguments = new java.lang.Object[1];
        writeFilesInfoMethodArguments[0] = objectOutputStream;
        try {
            writeFilesInfoMethod.invoke(sevenZOutputFile, writeFilesInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteFilesInfo2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        SevenZArchiveEntry sevenZArchiveEntry1 = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry1);
        files.add(sevenZArchiveEntry1);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = new byte[39];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 37);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyStreams(SevenZOutputFile.java:395)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo(SevenZOutputFile.java:375) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFilesInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFilesInfo", objectOutputStreamType);
        writeFilesInfoMethod.setAccessible(true);
        java.lang.Object[] writeFilesInfoMethodArguments = new java.lang.Object[1];
        writeFilesInfoMethodArguments[0] = objectOutputStream;
        try {
            writeFilesInfoMethod.invoke(sevenZOutputFile, writeFilesInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeFilesInfo
    
    public void testWriteFilesInfo_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 11 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeUint64(java.io.DataOutput, long)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUint64(java.io.DataOutput,long)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < 8; i++)} once
 *  */
    @Test
    public void testWriteUint64_IterateForLoop() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Class longType = long.class;
        Method writeUint64Method = sevenZOutputFileClazz.getDeclaredMethod("writeUint64", objectOutputStreamType, longType);
        writeUint64Method.setAccessible(true);
        java.lang.Object[] writeUint64MethodArguments = new java.lang.Object[2];
        writeUint64MethodArguments[0] = objectOutputStream;
        writeUint64MethodArguments[1] = -127L;
        writeUint64Method.invoke(sevenZOutputFile, writeUint64MethodArguments);
        
        Object objectOutputStreamBout = getFieldValue(objectOutputStream, "java.io.ObjectOutputStream", "bout");
        byte[] objectOutputStreamBoutBoutBuf = ((byte[]) getFieldValue(objectOutputStreamBout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf"));
        byte finalObjectOutputStreamBoutBuf0 = ((Byte) get(objectOutputStreamBoutBoutBuf, 0));
        Object objectOutputStreamBout1 = getFieldValue(objectOutputStream, "java.io.ObjectOutputStream", "bout");
        int finalObjectOutputStreamBoutPos = ((Integer) getFieldValue(objectOutputStreamBout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos"));
        
        assertEquals((byte) -127, finalObjectOutputStreamBoutBuf0);
        
        assertEquals(1, finalObjectOutputStreamBoutPos);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUint64(java.io.DataOutput,long)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < 8; i++)} twice
 *  */
    @Test
    public void testWriteUint64_ValueGreaterOrEqual1LLeftShift7MultiplyIPlus1() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Class longType = long.class;
        Method writeUint64Method = sevenZOutputFileClazz.getDeclaredMethod("writeUint64", objectOutputStreamType, longType);
        writeUint64Method.setAccessible(true);
        java.lang.Object[] writeUint64MethodArguments = new java.lang.Object[2];
        writeUint64MethodArguments[0] = objectOutputStream;
        writeUint64MethodArguments[1] = 128L;
        writeUint64Method.invoke(sevenZOutputFile, writeUint64MethodArguments);
        
        Object objectOutputStreamBout = getFieldValue(objectOutputStream, "java.io.ObjectOutputStream", "bout");
        byte[] objectOutputStreamBoutBoutBuf = ((byte[]) getFieldValue(objectOutputStreamBout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf"));
        byte finalObjectOutputStreamBoutBuf0 = ((Byte) get(objectOutputStreamBoutBoutBuf, 0));
        Object objectOutputStreamBout1 = getFieldValue(objectOutputStream, "java.io.ObjectOutputStream", "bout");
        byte[] objectOutputStreamBout1BoutBuf = ((byte[]) getFieldValue(objectOutputStreamBout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf"));
        byte finalObjectOutputStreamBoutBuf1 = ((Byte) get(objectOutputStreamBout1BoutBuf, 1));
        Object objectOutputStreamBout2 = getFieldValue(objectOutputStream, "java.io.ObjectOutputStream", "bout");
        int finalObjectOutputStreamBoutPos = ((Integer) getFieldValue(objectOutputStreamBout2, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos"));
        
        assertEquals(java.lang.Byte.MIN_VALUE, finalObjectOutputStreamBoutBuf0);
        
        assertEquals(java.lang.Byte.MIN_VALUE, finalObjectOutputStreamBoutBuf1);
        
        assertEquals(2, finalObjectOutputStreamBoutPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeUint64(java.io.DataOutput, long)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUint64(java.io.DataOutput,long)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < 8; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(firstByte);
 *  */
    @Test
    public void testWriteUint64_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", Integer.MIN_VALUE);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(SevenZOutputFile.java:627) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Class longType = long.class;
        Method writeUint64Method = sevenZOutputFileClazz.getDeclaredMethod("writeUint64", objectOutputStreamType, longType);
        writeUint64Method.setAccessible(true);
        java.lang.Object[] writeUint64MethodArguments = new java.lang.Object[2];
        writeUint64MethodArguments[0] = objectOutputStream;
        writeUint64MethodArguments[1] = -127L;
        try {
            writeUint64Method.invoke(sevenZOutputFile, writeUint64MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUint64(java.io.DataOutput,long)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < 8; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(firstByte);
 *  */
    @Test
    public void testWriteUint64_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(SevenZOutputFile.java:627) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Class longType = long.class;
        Method writeUint64Method = sevenZOutputFileClazz.getDeclaredMethod("writeUint64", objectOutputStreamType, longType);
        writeUint64Method.setAccessible(true);
        java.lang.Object[] writeUint64MethodArguments = new java.lang.Object[2];
        writeUint64MethodArguments[0] = objectOutputStream;
        writeUint64MethodArguments[1] = -127L;
        try {
            writeUint64Method.invoke(sevenZOutputFile, writeUint64MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUint64(java.io.DataOutput,long)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < 8; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteUint64_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(SevenZOutputFile.java:627) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Class longType = long.class;
        Method writeUint64Method = sevenZOutputFileClazz.getDeclaredMethod("writeUint64", objectOutputStreamType, longType);
        writeUint64Method.setAccessible(true);
        java.lang.Object[] writeUint64MethodArguments = new java.lang.Object[2];
        writeUint64MethodArguments[0] = objectOutputStream;
        writeUint64MethodArguments[1] = -127L;
        try {
            writeUint64Method.invoke(sevenZOutputFile, writeUint64MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUint64(java.io.DataOutput,long)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < 8; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: header.write(firstByte);
 *  */
    @Test
    public void testWriteUint64_ThrowNullPointerException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(SevenZOutputFile.java:627) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Class longType = long.class;
        Method writeUint64Method = sevenZOutputFileClazz.getDeclaredMethod("writeUint64", dataOutputType, longType);
        writeUint64Method.setAccessible(true);
        java.lang.Object[] writeUint64MethodArguments = new java.lang.Object[2];
        writeUint64MethodArguments[0] = ((Object) null);
        writeUint64MethodArguments[1] = -127L;
        try {
            writeUint64Method.invoke(sevenZOutputFile, writeUint64MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUint64(java.io.DataOutput,long)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < 8; i++)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: header.write(firstByte);
 *  */
    @Test
    public void testWriteUint64_ThrowNullPointerException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(SevenZOutputFile.java:627) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Class longType = long.class;
        Method writeUint64Method = sevenZOutputFileClazz.getDeclaredMethod("writeUint64", dataOutputType, longType);
        writeUint64Method.setAccessible(true);
        java.lang.Object[] writeUint64MethodArguments = new java.lang.Object[2];
        writeUint64MethodArguments[0] = ((Object) null);
        writeUint64MethodArguments[1] = 128L;
        try {
            writeUint64Method.invoke(sevenZOutputFile, writeUint64MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeUint64(java.io.DataOutput, long)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUint64(java.io.DataOutput,long)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < 8; i++)} once
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteUint64_ThrowIOException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Class longType = long.class;
        Method writeUint64Method = sevenZOutputFileClazz.getDeclaredMethod("writeUint64", objectOutputStreamType, longType);
        writeUint64Method.setAccessible(true);
        java.lang.Object[] writeUint64MethodArguments = new java.lang.Object[2];
        writeUint64MethodArguments[0] = objectOutputStream;
        writeUint64MethodArguments[1] = -127L;
        try {
            writeUint64Method.invoke(sevenZOutputFile, writeUint64MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUint64(java.io.DataOutput,long)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < 8; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: header.write(firstByte);
 *  */
    @Test(expected = IOException.class)
    public void testWriteUint64_ThrowIOException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Class longType = long.class;
        Method writeUint64Method = sevenZOutputFileClazz.getDeclaredMethod("writeUint64", objectOutputStreamType, longType);
        writeUint64Method.setAccessible(true);
        java.lang.Object[] writeUint64MethodArguments = new java.lang.Object[2];
        writeUint64MethodArguments[0] = objectOutputStream;
        writeUint64MethodArguments[1] = -127L;
        try {
            writeUint64Method.invoke(sevenZOutputFile, writeUint64MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUint64(java.io.DataOutput,long)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < 8; i++)} once
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(firstByte);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteUint64_ThrowZipException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        DataOutputStream dataOutputStream = new DataOutputStream(zipOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Class longType = long.class;
        Method writeUint64Method = sevenZOutputFileClazz.getDeclaredMethod("writeUint64", dataOutputStreamType, longType);
        writeUint64Method.setAccessible(true);
        java.lang.Object[] writeUint64MethodArguments = new java.lang.Object[2];
        writeUint64MethodArguments[0] = dataOutputStream;
        writeUint64MethodArguments[1] = -127L;
        try {
            writeUint64Method.invoke(sevenZOutputFile, writeUint64MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUint64(java.io.DataOutput,long)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < 8; i++)} twice
 * @utbot.throwsException {@link java.io.IOException} in: header.write(firstByte);
 *  */
    @Test(expected = IOException.class)
    public void testWriteUint64_ThrowIOException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        DeflaterOutputStream deflaterOutputStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(deflaterOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        DataOutputStream dataOutputStream = new DataOutputStream(deflaterOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Class longType = long.class;
        Method writeUint64Method = sevenZOutputFileClazz.getDeclaredMethod("writeUint64", dataOutputStreamType, longType);
        writeUint64Method.setAccessible(true);
        java.lang.Object[] writeUint64MethodArguments = new java.lang.Object[2];
        writeUint64MethodArguments[0] = dataOutputStream;
        writeUint64MethodArguments[1] = 128L;
        try {
            writeUint64Method.invoke(sevenZOutputFile, writeUint64MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUint64(java.io.DataOutput,long)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < 8; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: header.write(firstByte);
 *  */
    @Test(expected = IOException.class)
    public void testWriteUint64_ThrowIOException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Class longType = long.class;
        Method writeUint64Method = sevenZOutputFileClazz.getDeclaredMethod("writeUint64", objectOutputStreamType, longType);
        writeUint64Method.setAccessible(true);
        java.lang.Object[] writeUint64MethodArguments = new java.lang.Object[2];
        writeUint64MethodArguments[0] = objectOutputStream;
        writeUint64MethodArguments[1] = -127L;
        try {
            writeUint64Method.invoke(sevenZOutputFile, writeUint64MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUint64(java.io.DataOutput,long)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < 8; i++)} once
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteUint64_ThrowIOException_4() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 9223372036854775804L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -3L);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Class longType = long.class;
        Method writeUint64Method = sevenZOutputFileClazz.getDeclaredMethod("writeUint64", objectOutputStreamType, longType);
        writeUint64Method.setAccessible(true);
        java.lang.Object[] writeUint64MethodArguments = new java.lang.Object[2];
        writeUint64MethodArguments[0] = objectOutputStream;
        writeUint64MethodArguments[1] = -255L;
        try {
            writeUint64Method.invoke(sevenZOutputFile, writeUint64MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUint64(java.io.DataOutput,long)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < 8; i++)} once
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteUint64_ThrowIOException_5() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Class longType = long.class;
        Method writeUint64Method = sevenZOutputFileClazz.getDeclaredMethod("writeUint64", objectOutputStreamType, longType);
        writeUint64Method.setAccessible(true);
        java.lang.Object[] writeUint64MethodArguments = new java.lang.Object[2];
        writeUint64MethodArguments[0] = objectOutputStream;
        writeUint64MethodArguments[1] = -255L;
        try {
            writeUint64Method.invoke(sevenZOutputFile, writeUint64MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUint64(java.io.DataOutput,long)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < 8; i++)} once
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(firstByte);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteUint64_ThrowZipException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(zipOutputStream, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Class longType = long.class;
        Method writeUint64Method = sevenZOutputFileClazz.getDeclaredMethod("writeUint64", dataOutputStreamType, longType);
        writeUint64Method.setAccessible(true);
        java.lang.Object[] writeUint64MethodArguments = new java.lang.Object[2];
        writeUint64MethodArguments[0] = dataOutputStream;
        writeUint64MethodArguments[1] = -127L;
        try {
            writeUint64Method.invoke(sevenZOutputFile, writeUint64MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUint64(java.io.DataOutput,long)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < 8; i++)} once
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteUint64_ThrowIOException_6() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 9223372036854775804L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -3L);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Class longType = long.class;
        Method writeUint64Method = sevenZOutputFileClazz.getDeclaredMethod("writeUint64", objectOutputStreamType, longType);
        writeUint64Method.setAccessible(true);
        java.lang.Object[] writeUint64MethodArguments = new java.lang.Object[2];
        writeUint64MethodArguments[0] = objectOutputStream;
        writeUint64MethodArguments[1] = -255L;
        try {
            writeUint64Method.invoke(sevenZOutputFile, writeUint64MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeUint64(java.io.DataOutput, long)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeUint64(java.io.DataOutput,long)}
 * @utbot.invokes {@link java.io.DataOutput#write(int)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < 8; i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: header.write(firstByte);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteUint64_ThrowIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1879049213);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Class longType = long.class;
        Method writeUint64Method = sevenZOutputFileClazz.getDeclaredMethod("writeUint64", objectOutputStreamType, longType);
        writeUint64Method.setAccessible(true);
        java.lang.Object[] writeUint64MethodArguments = new java.lang.Object[2];
        writeUint64MethodArguments[0] = objectOutputStream;
        writeUint64MethodArguments[1] = -127L;
        try {
            writeUint64Method.invoke(sevenZOutputFile, writeUint64MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeUint64(java.io.DataOutput, long)
    
    @Test
    public void testWriteUint641() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1073741824);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(SevenZOutputFile.java:627) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Class longType = long.class;
        Method writeUint64Method = sevenZOutputFileClazz.getDeclaredMethod("writeUint64", objectOutputStreamType, longType);
        writeUint64Method.setAccessible(true);
        java.lang.Object[] writeUint64MethodArguments = new java.lang.Object[2];
        writeUint64MethodArguments[0] = objectOutputStream;
        writeUint64MethodArguments[1] = 16513L;
        try {
            writeUint64Method.invoke(sevenZOutputFile, writeUint64MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteUint642() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(SevenZOutputFile.java:627) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Class longType = long.class;
        Method writeUint64Method = sevenZOutputFileClazz.getDeclaredMethod("writeUint64", dataOutputType, longType);
        writeUint64Method.setAccessible(true);
        java.lang.Object[] writeUint64MethodArguments = new java.lang.Object[2];
        writeUint64MethodArguments[0] = ((Object) null);
        writeUint64MethodArguments[1] = 2097152L;
        try {
            writeUint64Method.invoke(sevenZOutputFile, writeUint64MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteUint643() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1073741824);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1913)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(SevenZOutputFile.java:627) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Class longType = long.class;
        Method writeUint64Method = sevenZOutputFileClazz.getDeclaredMethod("writeUint64", objectOutputStreamType, longType);
        writeUint64Method.setAccessible(true);
        java.lang.Object[] writeUint64MethodArguments = new java.lang.Object[2];
        writeUint64MethodArguments[0] = objectOutputStream;
        writeUint64MethodArguments[1] = 129L;
        try {
            writeUint64Method.invoke(sevenZOutputFile, writeUint64MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeUint64
    
    public void testWriteUint64_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Concrete execution failed
        
        // 8 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeFileCTimes(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileCTimes(java.io.DataOutput)}
 *  */
    @Test
    public void testWriteFileCTimes() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileCTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileCTimes", dataOutputType);
        writeFileCTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileCTimesMethodArguments = new java.lang.Object[1];
        writeFileCTimesMethodArguments[0] = ((Object) null);
        writeFileCTimesMethod.invoke(sevenZOutputFile, writeFileCTimesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileCTimes(java.io.DataOutput)}
 *  */
    @Test
    public void testWriteFileCTimes_1() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileCTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileCTimes", dataOutputType);
        writeFileCTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileCTimesMethodArguments = new java.lang.Object[1];
        writeFileCTimesMethodArguments[0] = ((Object) null);
        writeFileCTimesMethod.invoke(sevenZOutputFile, writeFileCTimesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeFileCTimes(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileCTimes(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numCreationDates > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kCTime);
 *  */
    @Test
    public void testWriteFileCTimes_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasCreationDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1023);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1023 out of bounds for length 2]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes(SevenZOutputFile.java:480) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileCTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileCTimes", objectOutputStreamType);
        writeFileCTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileCTimesMethodArguments = new java.lang.Object[1];
        writeFileCTimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileCTimesMethod.invoke(sevenZOutputFile, writeFileCTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileCTimes(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numCreationDates > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kCTime);
 *  */
    @Test
    public void testWriteFileCTimes_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasCreationDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes(SevenZOutputFile.java:480) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileCTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileCTimes", objectOutputStreamType);
        writeFileCTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileCTimesMethodArguments = new java.lang.Object[1];
        writeFileCTimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileCTimesMethod.invoke(sevenZOutputFile, writeFileCTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileCTimes(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numCreationDates > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteFileCTimes_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasCreationDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes(SevenZOutputFile.java:480) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileCTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileCTimes", objectOutputStreamType);
        writeFileCTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileCTimesMethodArguments = new java.lang.Object[1];
        writeFileCTimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileCTimesMethod.invoke(sevenZOutputFile, writeFileCTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileCTimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final SevenZArchiveEntry entry: files)
 *  */
    @Test
    public void testWriteFileCTimes_ThrowNullPointerException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes(SevenZOutputFile.java:474) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileCTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileCTimes", dataOutputType);
        writeFileCTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileCTimesMethodArguments = new java.lang.Object[1];
        writeFileCTimesMethodArguments[0] = ((Object) null);
        try {
            writeFileCTimesMethod.invoke(sevenZOutputFile, writeFileCTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileCTimes(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numCreationDates > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: header.write(NID.kCTime);
 *  */
    @Test
    public void testWriteFileCTimes_ThrowNullPointerException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasCreationDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes(SevenZOutputFile.java:480) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileCTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileCTimes", dataOutputType);
        writeFileCTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileCTimesMethodArguments = new java.lang.Object[1];
        writeFileCTimesMethodArguments[0] = ((Object) null);
        try {
            writeFileCTimesMethod.invoke(sevenZOutputFile, writeFileCTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileCTimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: entry.getHasCreationDate()
 *  */
    @Test
    public void testWriteFileCTimes_ThrowNullPointerException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes(SevenZOutputFile.java:475) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileCTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileCTimes", dataOutputType);
        writeFileCTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileCTimesMethodArguments = new java.lang.Object[1];
        writeFileCTimesMethodArguments[0] = ((Object) null);
        try {
            writeFileCTimesMethod.invoke(sevenZOutputFile, writeFileCTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeFileCTimes(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileCTimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kCTime);
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileCTimes_ThrowIOException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasCreationDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileCTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileCTimes", objectOutputStreamType);
        writeFileCTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileCTimesMethodArguments = new java.lang.Object[1];
        writeFileCTimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileCTimesMethod.invoke(sevenZOutputFile, writeFileCTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileCTimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileCTimes_ThrowIOException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasCreationDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileCTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileCTimes", objectOutputStreamType);
        writeFileCTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileCTimesMethodArguments = new java.lang.Object[1];
        writeFileCTimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileCTimesMethod.invoke(sevenZOutputFile, writeFileCTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileCTimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kCTime);
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileCTimes_ThrowIOException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasCreationDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        DeflaterOutputStream deflaterOutputStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(deflaterOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        DataOutputStream dataOutputStream = new DataOutputStream(deflaterOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileCTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileCTimes", dataOutputStreamType);
        writeFileCTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileCTimesMethodArguments = new java.lang.Object[1];
        writeFileCTimesMethodArguments[0] = dataOutputStream;
        try {
            writeFileCTimesMethod.invoke(sevenZOutputFile, writeFileCTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileCTimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(NID.kCTime);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteFileCTimes_ThrowZipException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasCreationDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        DataOutputStream dataOutputStream = new DataOutputStream(jarOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileCTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileCTimes", dataOutputStreamType);
        writeFileCTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileCTimesMethodArguments = new java.lang.Object[1];
        writeFileCTimesMethodArguments[0] = dataOutputStream;
        try {
            writeFileCTimesMethod.invoke(sevenZOutputFile, writeFileCTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileCTimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kCTime);
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileCTimes_ThrowIOException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasCreationDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileCTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileCTimes", objectOutputStreamType);
        writeFileCTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileCTimesMethodArguments = new java.lang.Object[1];
        writeFileCTimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileCTimesMethod.invoke(sevenZOutputFile, writeFileCTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileCTimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kCTime);
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileCTimes_ThrowIOException_4() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasCreationDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileCTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileCTimes", objectOutputStreamType);
        writeFileCTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileCTimesMethodArguments = new java.lang.Object[1];
        writeFileCTimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileCTimesMethod.invoke(sevenZOutputFile, writeFileCTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileCTimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileCTimes_ThrowIOException_5() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasCreationDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileCTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileCTimes", objectOutputStreamType);
        writeFileCTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileCTimesMethodArguments = new java.lang.Object[1];
        writeFileCTimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileCTimesMethod.invoke(sevenZOutputFile, writeFileCTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileCTimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileCTimes_ThrowIOException_6() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasCreationDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 1123700883587072L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -9222248335971188735L);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileCTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileCTimes", objectOutputStreamType);
        writeFileCTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileCTimesMethodArguments = new java.lang.Object[1];
        writeFileCTimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileCTimesMethod.invoke(sevenZOutputFile, writeFileCTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileCTimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(NID.kCTime);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteFileCTimes_ThrowZipException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasCreationDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(jarOutputStream, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileCTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileCTimes", dataOutputStreamType);
        writeFileCTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileCTimesMethodArguments = new java.lang.Object[1];
        writeFileCTimesMethodArguments[0] = dataOutputStream;
        try {
            writeFileCTimesMethod.invoke(sevenZOutputFile, writeFileCTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeFileCTimes(java.io.DataOutput)
    
    @Test
    public void testWriteFileCTimes1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasCreationDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1860)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes(SevenZOutputFile.java:504) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileCTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileCTimes", objectOutputStreamType);
        writeFileCTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileCTimesMethodArguments = new java.lang.Object[1];
        writeFileCTimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileCTimesMethod.invoke(sevenZOutputFile, writeFileCTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteFileCTimes2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasCreationDate(true);
        files.add(sevenZArchiveEntry);
        files.add(null);
        files.add(null);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        DataOutputStream dataOutputStream = new DataOutputStream(null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes(SevenZOutputFile.java:475) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileCTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileCTimes", dataOutputStreamType);
        writeFileCTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileCTimesMethodArguments = new java.lang.Object[1];
        writeFileCTimesMethodArguments[0] = dataOutputStream;
        try {
            writeFileCTimesMethod.invoke(sevenZOutputFile, writeFileCTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeFileCTimes
    
    public void testWriteFileCTimes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeFileMTimes(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileMTimes(java.io.DataOutput)}
 *  */
    @Test
    public void testWriteFileMTimes() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileMTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileMTimes", dataOutputType);
        writeFileMTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileMTimesMethodArguments = new java.lang.Object[1];
        writeFileMTimesMethodArguments[0] = ((Object) null);
        writeFileMTimesMethod.invoke(sevenZOutputFile, writeFileMTimesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileMTimes(java.io.DataOutput)}
 *  */
    @Test
    public void testWriteFileMTimes_1() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileMTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileMTimes", dataOutputType);
        writeFileMTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileMTimesMethodArguments = new java.lang.Object[1];
        writeFileMTimesMethodArguments[0] = ((Object) null);
        writeFileMTimesMethod.invoke(sevenZOutputFile, writeFileMTimesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeFileMTimes(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileMTimes(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numLastModifiedDates > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kMTime);
 *  */
    @Test
    public void testWriteFileMTimes_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasLastModifiedDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1023);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1023 out of bounds for length 2]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes(SevenZOutputFile.java:552) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileMTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileMTimes", objectOutputStreamType);
        writeFileMTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileMTimesMethodArguments = new java.lang.Object[1];
        writeFileMTimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileMTimesMethod.invoke(sevenZOutputFile, writeFileMTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileMTimes(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numLastModifiedDates > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kMTime);
 *  */
    @Test
    public void testWriteFileMTimes_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasLastModifiedDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes(SevenZOutputFile.java:552) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileMTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileMTimes", objectOutputStreamType);
        writeFileMTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileMTimesMethodArguments = new java.lang.Object[1];
        writeFileMTimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileMTimesMethod.invoke(sevenZOutputFile, writeFileMTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileMTimes(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numLastModifiedDates > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteFileMTimes_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasLastModifiedDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes(SevenZOutputFile.java:552) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileMTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileMTimes", objectOutputStreamType);
        writeFileMTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileMTimesMethodArguments = new java.lang.Object[1];
        writeFileMTimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileMTimesMethod.invoke(sevenZOutputFile, writeFileMTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileMTimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final SevenZArchiveEntry entry: files)
 *  */
    @Test
    public void testWriteFileMTimes_ThrowNullPointerException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes(SevenZOutputFile.java:546) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileMTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileMTimes", dataOutputType);
        writeFileMTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileMTimesMethodArguments = new java.lang.Object[1];
        writeFileMTimesMethodArguments[0] = ((Object) null);
        try {
            writeFileMTimesMethod.invoke(sevenZOutputFile, writeFileMTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileMTimes(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numLastModifiedDates > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: header.write(NID.kMTime);
 *  */
    @Test
    public void testWriteFileMTimes_ThrowNullPointerException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasLastModifiedDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes(SevenZOutputFile.java:552) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileMTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileMTimes", dataOutputType);
        writeFileMTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileMTimesMethodArguments = new java.lang.Object[1];
        writeFileMTimesMethodArguments[0] = ((Object) null);
        try {
            writeFileMTimesMethod.invoke(sevenZOutputFile, writeFileMTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileMTimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: entry.getHasLastModifiedDate()
 *  */
    @Test
    public void testWriteFileMTimes_ThrowNullPointerException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes(SevenZOutputFile.java:547) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileMTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileMTimes", dataOutputType);
        writeFileMTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileMTimesMethodArguments = new java.lang.Object[1];
        writeFileMTimesMethodArguments[0] = ((Object) null);
        try {
            writeFileMTimesMethod.invoke(sevenZOutputFile, writeFileMTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeFileMTimes(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileMTimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kMTime);
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileMTimes_ThrowIOException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasLastModifiedDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileMTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileMTimes", objectOutputStreamType);
        writeFileMTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileMTimesMethodArguments = new java.lang.Object[1];
        writeFileMTimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileMTimesMethod.invoke(sevenZOutputFile, writeFileMTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileMTimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileMTimes_ThrowIOException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasLastModifiedDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileMTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileMTimes", objectOutputStreamType);
        writeFileMTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileMTimesMethodArguments = new java.lang.Object[1];
        writeFileMTimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileMTimesMethod.invoke(sevenZOutputFile, writeFileMTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileMTimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(NID.kMTime);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteFileMTimes_ThrowZipException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasLastModifiedDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        DataOutputStream dataOutputStream = new DataOutputStream(zipOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileMTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileMTimes", dataOutputStreamType);
        writeFileMTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileMTimesMethodArguments = new java.lang.Object[1];
        writeFileMTimesMethodArguments[0] = dataOutputStream;
        try {
            writeFileMTimesMethod.invoke(sevenZOutputFile, writeFileMTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileMTimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kMTime);
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileMTimes_ThrowIOException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasLastModifiedDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileMTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileMTimes", objectOutputStreamType);
        writeFileMTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileMTimesMethodArguments = new java.lang.Object[1];
        writeFileMTimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileMTimesMethod.invoke(sevenZOutputFile, writeFileMTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileMTimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kMTime);
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileMTimes_ThrowIOException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasLastModifiedDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileMTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileMTimes", objectOutputStreamType);
        writeFileMTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileMTimesMethodArguments = new java.lang.Object[1];
        writeFileMTimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileMTimesMethod.invoke(sevenZOutputFile, writeFileMTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileMTimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileMTimes_ThrowIOException_4() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasLastModifiedDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileMTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileMTimes", objectOutputStreamType);
        writeFileMTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileMTimesMethodArguments = new java.lang.Object[1];
        writeFileMTimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileMTimesMethod.invoke(sevenZOutputFile, writeFileMTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileMTimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(NID.kMTime);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteFileMTimes_ThrowZipException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasLastModifiedDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(zipOutputStream, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileMTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileMTimes", dataOutputStreamType);
        writeFileMTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileMTimesMethodArguments = new java.lang.Object[1];
        writeFileMTimesMethodArguments[0] = dataOutputStream;
        try {
            writeFileMTimesMethod.invoke(sevenZOutputFile, writeFileMTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeFileMTimes(java.io.DataOutput)
    
    @Test
    public void testWriteFileMTimes1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasLastModifiedDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1860)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes(SevenZOutputFile.java:576) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileMTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileMTimes", objectOutputStreamType);
        writeFileMTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileMTimesMethodArguments = new java.lang.Object[1];
        writeFileMTimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileMTimesMethod.invoke(sevenZOutputFile, writeFileMTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteFileMTimes2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        files.add(null);
        files.add(null);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        Object blockDataOutputStream = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes(SevenZOutputFile.java:547) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class blockDataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileMTimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileMTimes", blockDataOutputStreamType);
        writeFileMTimesMethod.setAccessible(true);
        java.lang.Object[] writeFileMTimesMethodArguments = new java.lang.Object[1];
        writeFileMTimesMethodArguments[0] = blockDataOutputStream;
        try {
            writeFileMTimesMethod.invoke(sevenZOutputFile, writeFileMTimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeFileMTimes
    
    public void testWriteFileMTimes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeBits(java.io.DataOutput, java.util.BitSet, int)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeBits(java.io.DataOutput,java.util.BitSet,int)}
 * @utbot.executesCondition {@code (length > 0): False}
 *  */
    @Test
    public void testWriteBits_LengthLessOrEqualZero() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Class bitSetType = Class.forName("java.util.BitSet");
        Class intType = int.class;
        Method writeBitsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeBits", dataOutputType, bitSetType, intType);
        writeBitsMethod.setAccessible(true);
        java.lang.Object[] writeBitsMethodArguments = new java.lang.Object[3];
        writeBitsMethodArguments[0] = ((Object) null);
        writeBitsMethodArguments[1] = ((Object) null);
        writeBitsMethodArguments[2] = 0;
        writeBitsMethod.invoke(sevenZOutputFile, writeBitsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeBits(java.io.DataOutput,java.util.BitSet,int)}
 * @utbot.executesCondition {@code (length > 0): True}
 * @utbot.executesCondition {@code (shift > 0): True}
 * @utbot.invokes {@link java.io.DataOutput#write(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 *  */
    @Test
    public void testWriteBits_ShiftGreaterThanZero() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        BitSet bitSet = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-255L};
        setField(bitSet, "java.util.BitSet", "words", words);
        setField(bitSet, "java.util.BitSet", "wordsInUse", 1);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Class bitSetType = Class.forName("java.util.BitSet");
        Class intType = int.class;
        Method writeBitsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeBits", objectOutputStreamType, bitSetType, intType);
        writeBitsMethod.setAccessible(true);
        java.lang.Object[] writeBitsMethodArguments = new java.lang.Object[3];
        writeBitsMethodArguments[0] = objectOutputStream;
        writeBitsMethodArguments[1] = bitSet;
        writeBitsMethodArguments[2] = 1;
        writeBitsMethod.invoke(sevenZOutputFile, writeBitsMethodArguments);
        
        Object objectOutputStreamBout = getFieldValue(objectOutputStream, "java.io.ObjectOutputStream", "bout");
        byte[] objectOutputStreamBoutBoutBuf = ((byte[]) getFieldValue(objectOutputStreamBout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf"));
        byte finalObjectOutputStreamBoutBuf0 = ((Byte) get(objectOutputStreamBoutBoutBuf, 0));
        Object objectOutputStreamBout1 = getFieldValue(objectOutputStream, "java.io.ObjectOutputStream", "bout");
        int finalObjectOutputStreamBoutPos = ((Integer) getFieldValue(objectOutputStreamBout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos"));
        
        assertEquals(java.lang.Byte.MIN_VALUE, finalObjectOutputStreamBoutBuf0);
        
        assertEquals(1, finalObjectOutputStreamBoutPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeBits(java.io.DataOutput, java.util.BitSet, int)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeBits(java.io.DataOutput,java.util.BitSet,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: bits.get(i)
 *  */
    @Test
    public void testWriteBits_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        BitSet bitSet = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {};
        setField(bitSet, "java.util.BitSet", "words", words);
        setField(bitSet, "java.util.BitSet", "wordsInUse", 1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.util.BitSet.get(BitSet.java:631)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits(SevenZOutputFile.java:638) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Class bitSetType = Class.forName("java.util.BitSet");
        Class intType = int.class;
        Method writeBitsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeBits", dataOutputType, bitSetType, intType);
        writeBitsMethod.setAccessible(true);
        java.lang.Object[] writeBitsMethodArguments = new java.lang.Object[3];
        writeBitsMethodArguments[0] = ((Object) null);
        writeBitsMethodArguments[1] = bitSet;
        writeBitsMethodArguments[2] = 1;
        try {
            writeBitsMethod.invoke(sevenZOutputFile, writeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeBits(java.io.DataOutput,java.util.BitSet,int)}
 * @utbot.executesCondition {@code (length > 0): True}
 * @utbot.executesCondition {@code (shift > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(cache);
 *  */
    @Test
    public void testWriteBits_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        BitSet bitSet = ((BitSet) createInstance("java.util.BitSet"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits(SevenZOutputFile.java:647) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Class bitSetType = Class.forName("java.util.BitSet");
        Class intType = int.class;
        Method writeBitsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeBits", objectOutputStreamType, bitSetType, intType);
        writeBitsMethod.setAccessible(true);
        java.lang.Object[] writeBitsMethodArguments = new java.lang.Object[3];
        writeBitsMethodArguments[0] = objectOutputStream;
        writeBitsMethodArguments[1] = bitSet;
        writeBitsMethodArguments[2] = 1;
        try {
            writeBitsMethod.invoke(sevenZOutputFile, writeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeBits(java.io.DataOutput,java.util.BitSet,int)}
 * @utbot.executesCondition {@code (length > 0): True}
 * @utbot.executesCondition {@code (shift > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteBits_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        BitSet bitSet = ((BitSet) createInstance("java.util.BitSet"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits(SevenZOutputFile.java:647) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Class bitSetType = Class.forName("java.util.BitSet");
        Class intType = int.class;
        Method writeBitsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeBits", objectOutputStreamType, bitSetType, intType);
        writeBitsMethod.setAccessible(true);
        java.lang.Object[] writeBitsMethodArguments = new java.lang.Object[3];
        writeBitsMethodArguments[0] = objectOutputStream;
        writeBitsMethodArguments[1] = bitSet;
        writeBitsMethodArguments[2] = 1;
        try {
            writeBitsMethod.invoke(sevenZOutputFile, writeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeBits(java.io.DataOutput,java.util.BitSet,int)}
 * @utbot.executesCondition {@code (length > 0): True}
 * @utbot.executesCondition {@code (shift > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(cache);
 *  */
    @Test
    public void testWriteBits_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", Integer.MIN_VALUE);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        BitSet bitSet = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-255L};
        setField(bitSet, "java.util.BitSet", "words", words);
        setField(bitSet, "java.util.BitSet", "wordsInUse", 1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits(SevenZOutputFile.java:647) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Class bitSetType = Class.forName("java.util.BitSet");
        Class intType = int.class;
        Method writeBitsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeBits", objectOutputStreamType, bitSetType, intType);
        writeBitsMethod.setAccessible(true);
        java.lang.Object[] writeBitsMethodArguments = new java.lang.Object[3];
        writeBitsMethodArguments[0] = objectOutputStream;
        writeBitsMethodArguments[1] = bitSet;
        writeBitsMethodArguments[2] = 1;
        try {
            writeBitsMethod.invoke(sevenZOutputFile, writeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeBits(java.io.DataOutput,java.util.BitSet,int)}
 * @utbot.executesCondition {@code (length > 0): True}
 * @utbot.executesCondition {@code (shift > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(cache);
 *  */
    @Test
    public void testWriteBits_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1023);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        BitSet bitSet = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-254L};
        setField(bitSet, "java.util.BitSet", "words", words);
        setField(bitSet, "java.util.BitSet", "wordsInUse", 1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1023 out of bounds for length 2]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits(SevenZOutputFile.java:647) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Class bitSetType = Class.forName("java.util.BitSet");
        Class intType = int.class;
        Method writeBitsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeBits", objectOutputStreamType, bitSetType, intType);
        writeBitsMethod.setAccessible(true);
        java.lang.Object[] writeBitsMethodArguments = new java.lang.Object[3];
        writeBitsMethodArguments[0] = objectOutputStream;
        writeBitsMethodArguments[1] = bitSet;
        writeBitsMethodArguments[2] = 1;
        try {
            writeBitsMethod.invoke(sevenZOutputFile, writeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeBits(java.io.DataOutput,java.util.BitSet,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bits.get(i)
 *  */
    @Test
    public void testWriteBits_ThrowNullPointerException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits(SevenZOutputFile.java:638) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Class bitSetType = Class.forName("java.util.BitSet");
        Class intType = int.class;
        Method writeBitsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeBits", dataOutputType, bitSetType, intType);
        writeBitsMethod.setAccessible(true);
        java.lang.Object[] writeBitsMethodArguments = new java.lang.Object[3];
        writeBitsMethodArguments[0] = ((Object) null);
        writeBitsMethodArguments[1] = ((Object) null);
        writeBitsMethodArguments[2] = 1;
        try {
            writeBitsMethod.invoke(sevenZOutputFile, writeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeBits(java.io.DataOutput,java.util.BitSet,int)}
 * @utbot.executesCondition {@code (length > 0): True}
 * @utbot.executesCondition {@code (shift > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: header.write(cache);
 *  */
    @Test
    public void testWriteBits_ThrowNullPointerException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        BitSet bitSet = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-255L};
        setField(bitSet, "java.util.BitSet", "words", words);
        setField(bitSet, "java.util.BitSet", "wordsInUse", 1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits(SevenZOutputFile.java:647) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Class bitSetType = Class.forName("java.util.BitSet");
        Class intType = int.class;
        Method writeBitsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeBits", dataOutputType, bitSetType, intType);
        writeBitsMethod.setAccessible(true);
        java.lang.Object[] writeBitsMethodArguments = new java.lang.Object[3];
        writeBitsMethodArguments[0] = ((Object) null);
        writeBitsMethodArguments[1] = bitSet;
        writeBitsMethodArguments[2] = 1;
        try {
            writeBitsMethod.invoke(sevenZOutputFile, writeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeBits(java.io.DataOutput,java.util.BitSet,int)}
 * @utbot.executesCondition {@code (length > 0): True}
 * @utbot.executesCondition {@code (shift > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: header.write(cache);
 *  */
    @Test
    public void testWriteBits_ThrowNullPointerException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        BitSet bitSet = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-254L};
        setField(bitSet, "java.util.BitSet", "words", words);
        setField(bitSet, "java.util.BitSet", "wordsInUse", 1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits(SevenZOutputFile.java:647) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Class bitSetType = Class.forName("java.util.BitSet");
        Class intType = int.class;
        Method writeBitsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeBits", dataOutputType, bitSetType, intType);
        writeBitsMethod.setAccessible(true);
        java.lang.Object[] writeBitsMethodArguments = new java.lang.Object[3];
        writeBitsMethodArguments[0] = ((Object) null);
        writeBitsMethodArguments[1] = bitSet;
        writeBitsMethodArguments[2] = 1;
        try {
            writeBitsMethod.invoke(sevenZOutputFile, writeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeBits(java.io.DataOutput, java.util.BitSet, int)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeBits(java.io.DataOutput,java.util.BitSet,int)}
 * @utbot.executesCondition {@code (length > 0): True}
 * @utbot.executesCondition {@code (shift > 0): True}
 * @utbot.invokes {@link java.io.DataOutput#write(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: header.write(cache);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteBits_ThrowIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 2147483646);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        BitSet bitSet = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-255L};
        setField(bitSet, "java.util.BitSet", "words", words);
        setField(bitSet, "java.util.BitSet", "wordsInUse", 1);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Class bitSetType = Class.forName("java.util.BitSet");
        Class intType = int.class;
        Method writeBitsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeBits", objectOutputStreamType, bitSetType, intType);
        writeBitsMethod.setAccessible(true);
        java.lang.Object[] writeBitsMethodArguments = new java.lang.Object[3];
        writeBitsMethodArguments[0] = objectOutputStream;
        writeBitsMethodArguments[1] = bitSet;
        writeBitsMethodArguments[2] = 1;
        try {
            writeBitsMethod.invoke(sevenZOutputFile, writeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeBits(java.io.DataOutput, java.util.BitSet, int)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeBits(java.io.DataOutput,java.util.BitSet,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: header.write(cache);
 *  */
    @Test(expected = IOException.class)
    public void testWriteBits_ThrowIOException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "closed", true);
        DataOutputStream dataOutputStream = new DataOutputStream(zipOutputStream);
        BitSet bitSet = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-254L};
        setField(bitSet, "java.util.BitSet", "words", words);
        setField(bitSet, "java.util.BitSet", "wordsInUse", 1);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Class bitSetType = Class.forName("java.util.BitSet");
        Class intType = int.class;
        Method writeBitsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeBits", dataOutputStreamType, bitSetType, intType);
        writeBitsMethod.setAccessible(true);
        java.lang.Object[] writeBitsMethodArguments = new java.lang.Object[3];
        writeBitsMethodArguments[0] = dataOutputStream;
        writeBitsMethodArguments[1] = bitSet;
        writeBitsMethodArguments[2] = 1;
        try {
            writeBitsMethod.invoke(sevenZOutputFile, writeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeBits(java.io.DataOutput,java.util.BitSet,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: header.write(cache);
 *  */
    @Test(expected = IOException.class)
    public void testWriteBits_ThrowIOException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        BitSet bitSet = ((BitSet) createInstance("java.util.BitSet"));
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Class bitSetType = Class.forName("java.util.BitSet");
        Class intType = int.class;
        Method writeBitsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeBits", objectOutputStreamType, bitSetType, intType);
        writeBitsMethod.setAccessible(true);
        java.lang.Object[] writeBitsMethodArguments = new java.lang.Object[3];
        writeBitsMethodArguments[0] = objectOutputStream;
        writeBitsMethodArguments[1] = bitSet;
        writeBitsMethodArguments[2] = 1;
        try {
            writeBitsMethod.invoke(sevenZOutputFile, writeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeBits(java.io.DataOutput,java.util.BitSet,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(cache);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteBits_ThrowZipException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        BitSet bitSet = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-254L};
        setField(bitSet, "java.util.BitSet", "words", words);
        setField(bitSet, "java.util.BitSet", "wordsInUse", 1);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Class bitSetType = Class.forName("java.util.BitSet");
        Class intType = int.class;
        Method writeBitsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeBits", objectOutputStreamType, bitSetType, intType);
        writeBitsMethod.setAccessible(true);
        java.lang.Object[] writeBitsMethodArguments = new java.lang.Object[3];
        writeBitsMethodArguments[0] = objectOutputStream;
        writeBitsMethodArguments[1] = bitSet;
        writeBitsMethodArguments[2] = 1;
        try {
            writeBitsMethod.invoke(sevenZOutputFile, writeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeBits(java.io.DataOutput,java.util.BitSet,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: header.write(cache);
 *  */
    @Test(expected = IOException.class)
    public void testWriteBits_ThrowIOException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "closed", true);
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(zipOutputStream, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream);
        BitSet bitSet = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {2L};
        setField(bitSet, "java.util.BitSet", "words", words);
        setField(bitSet, "java.util.BitSet", "wordsInUse", 1);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Class bitSetType = Class.forName("java.util.BitSet");
        Class intType = int.class;
        Method writeBitsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeBits", dataOutputStreamType, bitSetType, intType);
        writeBitsMethod.setAccessible(true);
        java.lang.Object[] writeBitsMethodArguments = new java.lang.Object[3];
        writeBitsMethodArguments[0] = dataOutputStream;
        writeBitsMethodArguments[1] = bitSet;
        writeBitsMethodArguments[2] = 1;
        try {
            writeBitsMethod.invoke(sevenZOutputFile, writeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeBits(java.io.DataOutput,java.util.BitSet,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: header.write(cache);
 *  */
    @Test(expected = IOException.class)
    public void testWriteBits_ThrowIOException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        BitSet bitSet = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-254L};
        setField(bitSet, "java.util.BitSet", "words", words);
        setField(bitSet, "java.util.BitSet", "wordsInUse", 1);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Class bitSetType = Class.forName("java.util.BitSet");
        Class intType = int.class;
        Method writeBitsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeBits", objectOutputStreamType, bitSetType, intType);
        writeBitsMethod.setAccessible(true);
        java.lang.Object[] writeBitsMethodArguments = new java.lang.Object[3];
        writeBitsMethodArguments[0] = objectOutputStream;
        writeBitsMethodArguments[1] = bitSet;
        writeBitsMethodArguments[2] = 1;
        try {
            writeBitsMethod.invoke(sevenZOutputFile, writeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeBits(java.io.DataOutput,java.util.BitSet,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: header.write(cache);
 *  */
    @Test(expected = IOException.class)
    public void testWriteBits_ThrowIOException_4() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(zipOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        DataOutputStream dataOutputStream = new DataOutputStream(zipOutputStream);
        BitSet bitSet = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-254L};
        setField(bitSet, "java.util.BitSet", "words", words);
        setField(bitSet, "java.util.BitSet", "wordsInUse", 1);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Class bitSetType = Class.forName("java.util.BitSet");
        Class intType = int.class;
        Method writeBitsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeBits", dataOutputStreamType, bitSetType, intType);
        writeBitsMethod.setAccessible(true);
        java.lang.Object[] writeBitsMethodArguments = new java.lang.Object[3];
        writeBitsMethodArguments[0] = dataOutputStream;
        writeBitsMethodArguments[1] = bitSet;
        writeBitsMethodArguments[2] = 1;
        try {
            writeBitsMethod.invoke(sevenZOutputFile, writeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeBits(java.io.DataOutput, java.util.BitSet, int)
    
    @Test
    public void testWriteBits1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1073741824);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        BitSet bitSet = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {
            1L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        setField(bitSet, "java.util.BitSet", "words", words);
        setField(bitSet, "java.util.BitSet", "wordsInUse", 1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits(SevenZOutputFile.java:647) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Class bitSetType = Class.forName("java.util.BitSet");
        Class intType = int.class;
        Method writeBitsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeBits", objectOutputStreamType, bitSetType, intType);
        writeBitsMethod.setAccessible(true);
        java.lang.Object[] writeBitsMethodArguments = new java.lang.Object[3];
        writeBitsMethodArguments[0] = objectOutputStream;
        writeBitsMethodArguments[1] = bitSet;
        writeBitsMethodArguments[2] = 1;
        try {
            writeBitsMethod.invoke(sevenZOutputFile, writeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteBits2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        BitSet bitSet = ((BitSet) createInstance("java.util.BitSet"));
        setField(bitSet, "java.util.BitSet", "wordsInUse", -2147483647);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits(SevenZOutputFile.java:647) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Class bitSetType = Class.forName("java.util.BitSet");
        Class intType = int.class;
        Method writeBitsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeBits", dataOutputType, bitSetType, intType);
        writeBitsMethod.setAccessible(true);
        java.lang.Object[] writeBitsMethodArguments = new java.lang.Object[3];
        writeBitsMethodArguments[0] = ((Object) null);
        writeBitsMethodArguments[1] = bitSet;
        writeBitsMethodArguments[2] = 2;
        try {
            writeBitsMethod.invoke(sevenZOutputFile, writeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteBits3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        BitSet bitSet = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {
            1L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        setField(bitSet, "java.util.BitSet", "words", words);
        setField(bitSet, "java.util.BitSet", "wordsInUse", 1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits(SevenZOutputFile.java:647) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Class bitSetType = Class.forName("java.util.BitSet");
        Class intType = int.class;
        Method writeBitsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeBits", dataOutputType, bitSetType, intType);
        writeBitsMethod.setAccessible(true);
        java.lang.Object[] writeBitsMethodArguments = new java.lang.Object[3];
        writeBitsMethodArguments[0] = ((Object) null);
        writeBitsMethodArguments[1] = bitSet;
        writeBitsMethodArguments[2] = 2;
        try {
            writeBitsMethod.invoke(sevenZOutputFile, writeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeBits
    
    public void testWriteBits_errors()
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileNames
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeFileNames(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileNames(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kName);
 *  */
    @Test
    public void testWriteFileNames_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", Integer.MIN_VALUE);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileNames] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileNames(SevenZOutputFile.java:457) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileNamesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileNames", objectOutputStreamType);
        writeFileNamesMethod.setAccessible(true);
        java.lang.Object[] writeFileNamesMethodArguments = new java.lang.Object[1];
        writeFileNamesMethodArguments[0] = objectOutputStream;
        try {
            writeFileNamesMethod.invoke(sevenZOutputFile, writeFileNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileNames(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kName);
 *  */
    @Test
    public void testWriteFileNames_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileNames] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileNames(SevenZOutputFile.java:457) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileNamesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileNames", objectOutputStreamType);
        writeFileNamesMethod.setAccessible(true);
        java.lang.Object[] writeFileNamesMethodArguments = new java.lang.Object[1];
        writeFileNamesMethodArguments[0] = objectOutputStream;
        try {
            writeFileNamesMethod.invoke(sevenZOutputFile, writeFileNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileNames(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteFileNames_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileNames] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileNames(SevenZOutputFile.java:457) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileNamesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileNames", objectOutputStreamType);
        writeFileNamesMethod.setAccessible(true);
        java.lang.Object[] writeFileNamesMethodArguments = new java.lang.Object[1];
        writeFileNamesMethodArguments[0] = objectOutputStream;
        try {
            writeFileNamesMethod.invoke(sevenZOutputFile, writeFileNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileNames(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: header.write(NID.kName);
 *  */
    @Test
    public void testWriteFileNames_ThrowNullPointerException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileNames] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileNames(SevenZOutputFile.java:457) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileNamesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileNames", dataOutputType);
        writeFileNamesMethod.setAccessible(true);
        java.lang.Object[] writeFileNamesMethodArguments = new java.lang.Object[1];
        writeFileNamesMethodArguments[0] = ((Object) null);
        try {
            writeFileNamesMethod.invoke(sevenZOutputFile, writeFileNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeFileNames(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileNames(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: header.write(NID.kName);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteFileNames_ThrowIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 2147483646);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileNamesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileNames", objectOutputStreamType);
        writeFileNamesMethod.setAccessible(true);
        java.lang.Object[] writeFileNamesMethodArguments = new java.lang.Object[1];
        writeFileNamesMethodArguments[0] = objectOutputStream;
        try {
            writeFileNamesMethod.invoke(sevenZOutputFile, writeFileNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileNames(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: header.write(NID.kName);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteFileNames_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 805306621);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileNamesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileNames", objectOutputStreamType);
        writeFileNamesMethod.setAccessible(true);
        java.lang.Object[] writeFileNamesMethodArguments = new java.lang.Object[1];
        writeFileNamesMethodArguments[0] = objectOutputStream;
        try {
            writeFileNamesMethod.invoke(sevenZOutputFile, writeFileNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeFileNames(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileNames(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(NID.kName);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteFileNames_ThrowZipException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        DataOutputStream dataOutputStream = new DataOutputStream(zipOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileNamesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileNames", dataOutputStreamType);
        writeFileNamesMethod.setAccessible(true);
        java.lang.Object[] writeFileNamesMethodArguments = new java.lang.Object[1];
        writeFileNamesMethodArguments[0] = dataOutputStream;
        try {
            writeFileNamesMethod.invoke(sevenZOutputFile, writeFileNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileNames(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(NID.kName);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteFileNames_ThrowZipException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileNamesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileNames", objectOutputStreamType);
        writeFileNamesMethod.setAccessible(true);
        java.lang.Object[] writeFileNamesMethodArguments = new java.lang.Object[1];
        writeFileNamesMethodArguments[0] = objectOutputStream;
        try {
            writeFileNamesMethod.invoke(sevenZOutputFile, writeFileNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileNames(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kName);
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileNames_ThrowIOException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        DeflaterOutputStream deflaterOutputStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(deflaterOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        DataOutputStream dataOutputStream = new DataOutputStream(deflaterOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileNamesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileNames", dataOutputStreamType);
        writeFileNamesMethod.setAccessible(true);
        java.lang.Object[] writeFileNamesMethodArguments = new java.lang.Object[1];
        writeFileNamesMethodArguments[0] = dataOutputStream;
        try {
            writeFileNamesMethod.invoke(sevenZOutputFile, writeFileNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileNames(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileNames_ThrowIOException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 9223372036854775804L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -3L);
        JarOutputStream out1 = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileNamesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileNames", objectOutputStreamType);
        writeFileNamesMethod.setAccessible(true);
        java.lang.Object[] writeFileNamesMethodArguments = new java.lang.Object[1];
        writeFileNamesMethodArguments[0] = objectOutputStream;
        try {
            writeFileNamesMethod.invoke(sevenZOutputFile, writeFileNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileNames(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kName);
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileNames_ThrowIOException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileNamesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileNames", objectOutputStreamType);
        writeFileNamesMethod.setAccessible(true);
        java.lang.Object[] writeFileNamesMethodArguments = new java.lang.Object[1];
        writeFileNamesMethodArguments[0] = objectOutputStream;
        try {
            writeFileNamesMethod.invoke(sevenZOutputFile, writeFileNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileNames(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(NID.kName);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteFileNames_ThrowZipException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(java.lang.Long.MIN_VALUE);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "written", -4L);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "locoff", -2L);
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(zipOutputStream, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileNamesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileNames", dataOutputStreamType);
        writeFileNamesMethod.setAccessible(true);
        java.lang.Object[] writeFileNamesMethodArguments = new java.lang.Object[1];
        writeFileNamesMethodArguments[0] = dataOutputStream;
        try {
            writeFileNamesMethod.invoke(sevenZOutputFile, writeFileNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileNames(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileNames_ThrowIOException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileNamesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileNames", objectOutputStreamType);
        writeFileNamesMethod.setAccessible(true);
        java.lang.Object[] writeFileNamesMethodArguments = new java.lang.Object[1];
        writeFileNamesMethodArguments[0] = objectOutputStream;
        try {
            writeFileNamesMethod.invoke(sevenZOutputFile, writeFileNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileNames(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileNames_ThrowIOException_4() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", -9223354444668731394L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", 17592186044415L);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileNamesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileNames", objectOutputStreamType);
        writeFileNamesMethod.setAccessible(true);
        java.lang.Object[] writeFileNamesMethodArguments = new java.lang.Object[1];
        writeFileNamesMethodArguments[0] = objectOutputStream;
        try {
            writeFileNamesMethod.invoke(sevenZOutputFile, writeFileNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileNames(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileNames_ThrowIOException_5() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "closed", true);
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(zipOutputStream, null);
        CheckedOutputStream checkedOutputStream1 = new CheckedOutputStream(checkedOutputStream, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream1);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileNamesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileNames", dataOutputStreamType);
        writeFileNamesMethod.setAccessible(true);
        java.lang.Object[] writeFileNamesMethodArguments = new java.lang.Object[1];
        writeFileNamesMethodArguments[0] = dataOutputStream;
        try {
            writeFileNamesMethod.invoke(sevenZOutputFile, writeFileNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileNames(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testWriteFileNames_ThrowZipException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        FilterOutputStream filterOutputStream = new FilterOutputStream(jarOutputStream);
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(filterOutputStream, null);
        CheckedOutputStream checkedOutputStream1 = new CheckedOutputStream(checkedOutputStream, null);
        CheckedOutputStream checkedOutputStream2 = new CheckedOutputStream(checkedOutputStream1, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream2);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileNamesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileNames", dataOutputStreamType);
        writeFileNamesMethod.setAccessible(true);
        java.lang.Object[] writeFileNamesMethodArguments = new java.lang.Object[1];
        writeFileNamesMethodArguments[0] = dataOutputStream;
        try {
            writeFileNamesMethod.invoke(sevenZOutputFile, writeFileNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeFileNames
    
    public void testWriteFileNames_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 11 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileATimes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeFileATimes(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileATimes(java.io.DataOutput)}
 *  */
    @Test
    public void testWriteFileATimes() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileATimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileATimes", dataOutputType);
        writeFileATimesMethod.setAccessible(true);
        java.lang.Object[] writeFileATimesMethodArguments = new java.lang.Object[1];
        writeFileATimesMethodArguments[0] = ((Object) null);
        writeFileATimesMethod.invoke(sevenZOutputFile, writeFileATimesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileATimes(java.io.DataOutput)}
 *  */
    @Test
    public void testWriteFileATimes_1() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileATimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileATimes", dataOutputType);
        writeFileATimesMethod.setAccessible(true);
        java.lang.Object[] writeFileATimesMethodArguments = new java.lang.Object[1];
        writeFileATimesMethodArguments[0] = ((Object) null);
        writeFileATimesMethod.invoke(sevenZOutputFile, writeFileATimesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeFileATimes(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileATimes(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numAccessDates > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kATime);
 *  */
    @Test
    public void testWriteFileATimes_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasAccessDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1023);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileATimes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1023 out of bounds for length 2]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileATimes(SevenZOutputFile.java:516) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileATimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileATimes", objectOutputStreamType);
        writeFileATimesMethod.setAccessible(true);
        java.lang.Object[] writeFileATimesMethodArguments = new java.lang.Object[1];
        writeFileATimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileATimesMethod.invoke(sevenZOutputFile, writeFileATimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileATimes(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numAccessDates > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteFileATimes_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasAccessDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileATimes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileATimes(SevenZOutputFile.java:516) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileATimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileATimes", objectOutputStreamType);
        writeFileATimesMethod.setAccessible(true);
        java.lang.Object[] writeFileATimesMethodArguments = new java.lang.Object[1];
        writeFileATimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileATimesMethod.invoke(sevenZOutputFile, writeFileATimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileATimes(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numAccessDates > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteFileATimes_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasAccessDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileATimes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileATimes(SevenZOutputFile.java:516) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileATimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileATimes", objectOutputStreamType);
        writeFileATimesMethod.setAccessible(true);
        java.lang.Object[] writeFileATimesMethodArguments = new java.lang.Object[1];
        writeFileATimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileATimesMethod.invoke(sevenZOutputFile, writeFileATimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileATimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final SevenZArchiveEntry entry: files)
 *  */
    @Test
    public void testWriteFileATimes_ThrowNullPointerException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileATimes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileATimes(SevenZOutputFile.java:510) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileATimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileATimes", dataOutputType);
        writeFileATimesMethod.setAccessible(true);
        java.lang.Object[] writeFileATimesMethodArguments = new java.lang.Object[1];
        writeFileATimesMethodArguments[0] = ((Object) null);
        try {
            writeFileATimesMethod.invoke(sevenZOutputFile, writeFileATimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileATimes(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numAccessDates > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: header.write(NID.kATime);
 *  */
    @Test
    public void testWriteFileATimes_ThrowNullPointerException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasAccessDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileATimes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileATimes(SevenZOutputFile.java:516) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileATimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileATimes", dataOutputType);
        writeFileATimesMethod.setAccessible(true);
        java.lang.Object[] writeFileATimesMethodArguments = new java.lang.Object[1];
        writeFileATimesMethodArguments[0] = ((Object) null);
        try {
            writeFileATimesMethod.invoke(sevenZOutputFile, writeFileATimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileATimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: entry.getHasAccessDate()
 *  */
    @Test
    public void testWriteFileATimes_ThrowNullPointerException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileATimes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileATimes(SevenZOutputFile.java:511) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileATimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileATimes", dataOutputType);
        writeFileATimesMethod.setAccessible(true);
        java.lang.Object[] writeFileATimesMethodArguments = new java.lang.Object[1];
        writeFileATimesMethodArguments[0] = ((Object) null);
        try {
            writeFileATimesMethod.invoke(sevenZOutputFile, writeFileATimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeFileATimes(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileATimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileATimes_ThrowIOException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasAccessDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileATimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileATimes", objectOutputStreamType);
        writeFileATimesMethod.setAccessible(true);
        java.lang.Object[] writeFileATimesMethodArguments = new java.lang.Object[1];
        writeFileATimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileATimesMethod.invoke(sevenZOutputFile, writeFileATimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileATimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileATimes_ThrowIOException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasAccessDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileATimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileATimes", objectOutputStreamType);
        writeFileATimesMethod.setAccessible(true);
        java.lang.Object[] writeFileATimesMethodArguments = new java.lang.Object[1];
        writeFileATimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileATimesMethod.invoke(sevenZOutputFile, writeFileATimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileATimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(NID.kATime);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteFileATimes_ThrowZipException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasAccessDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        DataOutputStream dataOutputStream = new DataOutputStream(jarOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileATimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileATimes", dataOutputStreamType);
        writeFileATimesMethod.setAccessible(true);
        java.lang.Object[] writeFileATimesMethodArguments = new java.lang.Object[1];
        writeFileATimesMethodArguments[0] = dataOutputStream;
        try {
            writeFileATimesMethod.invoke(sevenZOutputFile, writeFileATimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileATimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileATimes_ThrowIOException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasAccessDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileATimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileATimes", objectOutputStreamType);
        writeFileATimesMethod.setAccessible(true);
        java.lang.Object[] writeFileATimesMethodArguments = new java.lang.Object[1];
        writeFileATimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileATimesMethod.invoke(sevenZOutputFile, writeFileATimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileATimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileATimes_ThrowIOException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasAccessDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileATimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileATimes", objectOutputStreamType);
        writeFileATimesMethod.setAccessible(true);
        java.lang.Object[] writeFileATimesMethodArguments = new java.lang.Object[1];
        writeFileATimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileATimesMethod.invoke(sevenZOutputFile, writeFileATimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileATimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileATimes_ThrowIOException_4() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasAccessDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileATimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileATimes", objectOutputStreamType);
        writeFileATimesMethod.setAccessible(true);
        java.lang.Object[] writeFileATimesMethodArguments = new java.lang.Object[1];
        writeFileATimesMethodArguments[0] = objectOutputStream;
        try {
            writeFileATimesMethod.invoke(sevenZOutputFile, writeFileATimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileATimes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testWriteFileATimes_ThrowZipException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasAccessDate(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(jarOutputStream, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileATimesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileATimes", dataOutputStreamType);
        writeFileATimesMethod.setAccessible(true);
        java.lang.Object[] writeFileATimesMethodArguments = new java.lang.Object[1];
        writeFileATimesMethodArguments[0] = dataOutputStream;
        try {
            writeFileATimesMethod.invoke(sevenZOutputFile, writeFileATimesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeFileATimes
    
    public void testWriteFileATimes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.setupFileOutputStream
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method setupFileOutputStream()
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#setupFileOutputStream()}
 * @utbot.throwsException {@link java.io.IOException} in: addEncoder
 *  */
    @Test(expected = IOException.class)
    public void testSetupFileOutputStream_ThrowIOException_1() throws Throwable  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.AES256SHA256;
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, null);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
            SevenZMethod contentCompression = SevenZMethod.COPY;
            sevenZOutputFile.setContentCompression(contentCompression);
            
            Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
            Method setupFileOutputStreamMethod = sevenZOutputFileClazz.getDeclaredMethod("setupFileOutputStream");
            setupFileOutputStreamMethod.setAccessible(true);
            java.lang.Object[] setupFileOutputStreamMethodArguments = new java.lang.Object[0];
            try {
                setupFileOutputStreamMethod.invoke(sevenZOutputFile, setupFileOutputStreamMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#setupFileOutputStream()}
 * @utbot.throwsException {@link java.io.IOException} in: addEncoder
 *  */
    @Test(expected = IOException.class)
    public void testSetupFileOutputStream_ThrowIOException() throws Throwable  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = {};
            Coders.coderTable = coderTable;
            SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
            
            Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
            Method setupFileOutputStreamMethod = sevenZOutputFileClazz.getDeclaredMethod("setupFileOutputStream");
            setupFileOutputStreamMethod.setAccessible(true);
            java.lang.Object[] setupFileOutputStreamMethodArguments = new java.lang.Object[0];
            try {
                setupFileOutputStreamMethod.invoke(sevenZOutputFile, setupFileOutputStreamMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.setContentCompression
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setContentCompression(org.apache.commons.compress.archivers.sevenz.SevenZMethod)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#setContentCompression(org.apache.commons.compress.archivers.sevenz.SevenZMethod)}
 *  */
    @Test
    public void testSetContentCompression() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        sevenZOutputFile.setContentCompression(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSubStreamsInfo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeSubStreamsInfo(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeSubStreamsInfo(java.io.DataOutput)}
 * @utbot.invokes {@link java.io.DataOutput#write(int)}
 * @utbot.invokes {@link java.io.DataOutput#write(int)}
 *  */
    @Test
    public void testWriteSubStreamsInfo_DataOutputWrite() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeSubStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeSubStreamsInfo", objectOutputStreamType);
        writeSubStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeSubStreamsInfoMethodArguments = new java.lang.Object[1];
        writeSubStreamsInfoMethodArguments[0] = objectOutputStream;
        writeSubStreamsInfoMethod.invoke(sevenZOutputFile, writeSubStreamsInfoMethodArguments);
        
        Object objectOutputStreamBout = getFieldValue(objectOutputStream, "java.io.ObjectOutputStream", "bout");
        byte[] objectOutputStreamBoutBoutBuf = ((byte[]) getFieldValue(objectOutputStreamBout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf"));
        byte finalObjectOutputStreamBoutBuf0 = ((Byte) get(objectOutputStreamBoutBoutBuf, 0));
        Object objectOutputStreamBout1 = getFieldValue(objectOutputStream, "java.io.ObjectOutputStream", "bout");
        int finalObjectOutputStreamBoutPos = ((Integer) getFieldValue(objectOutputStreamBout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos"));
        
        assertEquals((byte) 8, finalObjectOutputStreamBoutBuf0);
        
        assertEquals(2, finalObjectOutputStreamBoutPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeSubStreamsInfo(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeSubStreamsInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kSubStreamsInfo);
 *  */
    @Test
    public void testWriteSubStreamsInfo_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", Integer.MIN_VALUE);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSubStreamsInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSubStreamsInfo(SevenZOutputFile.java:357) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeSubStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeSubStreamsInfo", objectOutputStreamType);
        writeSubStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeSubStreamsInfoMethodArguments = new java.lang.Object[1];
        writeSubStreamsInfoMethodArguments[0] = objectOutputStream;
        try {
            writeSubStreamsInfoMethod.invoke(sevenZOutputFile, writeSubStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeSubStreamsInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteSubStreamsInfo_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSubStreamsInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSubStreamsInfo(SevenZOutputFile.java:357) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeSubStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeSubStreamsInfo", objectOutputStreamType);
        writeSubStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeSubStreamsInfoMethodArguments = new java.lang.Object[1];
        writeSubStreamsInfoMethodArguments[0] = objectOutputStream;
        try {
            writeSubStreamsInfoMethod.invoke(sevenZOutputFile, writeSubStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeSubStreamsInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kSubStreamsInfo);
 *  */
    @Test
    public void testWriteSubStreamsInfo_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSubStreamsInfo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSubStreamsInfo(SevenZOutputFile.java:357) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeSubStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeSubStreamsInfo", objectOutputStreamType);
        writeSubStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeSubStreamsInfoMethodArguments = new java.lang.Object[1];
        writeSubStreamsInfoMethodArguments[0] = objectOutputStream;
        try {
            writeSubStreamsInfoMethod.invoke(sevenZOutputFile, writeSubStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeSubStreamsInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: header.write(NID.kSubStreamsInfo);
 *  */
    @Test
    public void testWriteSubStreamsInfo_ThrowNullPointerException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSubStreamsInfo] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSubStreamsInfo(SevenZOutputFile.java:357) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeSubStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeSubStreamsInfo", dataOutputType);
        writeSubStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeSubStreamsInfoMethodArguments = new java.lang.Object[1];
        writeSubStreamsInfoMethodArguments[0] = ((Object) null);
        try {
            writeSubStreamsInfoMethod.invoke(sevenZOutputFile, writeSubStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeSubStreamsInfo(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeSubStreamsInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kSubStreamsInfo);
 *  */
    @Test(expected = IOException.class)
    public void testWriteSubStreamsInfo_ThrowIOException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeSubStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeSubStreamsInfo", objectOutputStreamType);
        writeSubStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeSubStreamsInfoMethodArguments = new java.lang.Object[1];
        writeSubStreamsInfoMethodArguments[0] = objectOutputStream;
        try {
            writeSubStreamsInfoMethod.invoke(sevenZOutputFile, writeSubStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeSubStreamsInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(NID.kSubStreamsInfo);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteSubStreamsInfo_ThrowZipException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        DataOutputStream dataOutputStream = new DataOutputStream(zipOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeSubStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeSubStreamsInfo", dataOutputStreamType);
        writeSubStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeSubStreamsInfoMethodArguments = new java.lang.Object[1];
        writeSubStreamsInfoMethodArguments[0] = dataOutputStream;
        try {
            writeSubStreamsInfoMethod.invoke(sevenZOutputFile, writeSubStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeSubStreamsInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kSubStreamsInfo);
 *  */
    @Test(expected = IOException.class)
    public void testWriteSubStreamsInfo_ThrowIOException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        DeflaterOutputStream deflaterOutputStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(deflaterOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        DataOutputStream dataOutputStream = new DataOutputStream(deflaterOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeSubStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeSubStreamsInfo", dataOutputStreamType);
        writeSubStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeSubStreamsInfoMethodArguments = new java.lang.Object[1];
        writeSubStreamsInfoMethodArguments[0] = dataOutputStream;
        try {
            writeSubStreamsInfoMethod.invoke(sevenZOutputFile, writeSubStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeSubStreamsInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(NID.kSubStreamsInfo);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteSubStreamsInfo_ThrowZipException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeSubStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeSubStreamsInfo", objectOutputStreamType);
        writeSubStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeSubStreamsInfoMethodArguments = new java.lang.Object[1];
        writeSubStreamsInfoMethodArguments[0] = objectOutputStream;
        try {
            writeSubStreamsInfoMethod.invoke(sevenZOutputFile, writeSubStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeSubStreamsInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteSubStreamsInfo_ThrowIOException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 9223372036518412286L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -336363521L);
        ZipOutputStream out1 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out1, "java.util.zip.ZipOutputStream", "closed", true);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeSubStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeSubStreamsInfo", objectOutputStreamType);
        writeSubStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeSubStreamsInfoMethodArguments = new java.lang.Object[1];
        writeSubStreamsInfoMethodArguments[0] = objectOutputStream;
        try {
            writeSubStreamsInfoMethod.invoke(sevenZOutputFile, writeSubStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeSubStreamsInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kSubStreamsInfo);
 *  */
    @Test(expected = IOException.class)
    public void testWriteSubStreamsInfo_ThrowIOException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeSubStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeSubStreamsInfo", objectOutputStreamType);
        writeSubStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeSubStreamsInfoMethodArguments = new java.lang.Object[1];
        writeSubStreamsInfoMethodArguments[0] = objectOutputStream;
        try {
            writeSubStreamsInfoMethod.invoke(sevenZOutputFile, writeSubStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeSubStreamsInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kSubStreamsInfo);
 *  */
    @Test(expected = IOException.class)
    public void testWriteSubStreamsInfo_ThrowIOException_4() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "closed", true);
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(zipOutputStream, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeSubStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeSubStreamsInfo", dataOutputStreamType);
        writeSubStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeSubStreamsInfoMethodArguments = new java.lang.Object[1];
        writeSubStreamsInfoMethodArguments[0] = dataOutputStream;
        try {
            writeSubStreamsInfoMethod.invoke(sevenZOutputFile, writeSubStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeSubStreamsInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteSubStreamsInfo_ThrowIOException_5() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeSubStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeSubStreamsInfo", objectOutputStreamType);
        writeSubStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeSubStreamsInfoMethodArguments = new java.lang.Object[1];
        writeSubStreamsInfoMethodArguments[0] = objectOutputStream;
        try {
            writeSubStreamsInfoMethod.invoke(sevenZOutputFile, writeSubStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeSubStreamsInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteSubStreamsInfo_ThrowIOException_6() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 9223372036518412286L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -336363521L);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeSubStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeSubStreamsInfo", objectOutputStreamType);
        writeSubStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeSubStreamsInfoMethodArguments = new java.lang.Object[1];
        writeSubStreamsInfoMethodArguments[0] = objectOutputStream;
        try {
            writeSubStreamsInfoMethod.invoke(sevenZOutputFile, writeSubStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeSubStreamsInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteSubStreamsInfo_ThrowIOException_7() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "closed", true);
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(zipOutputStream, null);
        CheckedOutputStream checkedOutputStream1 = new CheckedOutputStream(checkedOutputStream, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream1);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeSubStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeSubStreamsInfo", dataOutputStreamType);
        writeSubStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeSubStreamsInfoMethodArguments = new java.lang.Object[1];
        writeSubStreamsInfoMethodArguments[0] = dataOutputStream;
        try {
            writeSubStreamsInfoMethod.invoke(sevenZOutputFile, writeSubStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeSubStreamsInfo(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testWriteSubStreamsInfo_ThrowZipException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        Object inMemoryCachingStreamBridge = createInstance("org.apache.commons.compress.compressors.pack200.InMemoryCachingStreamBridge");
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(inMemoryCachingStreamBridge, "java.io.FilterOutputStream", "out", out);
        Class checkedOutputStreamClazz = Class.forName("java.util.zip.CheckedOutputStream");
        Class inMemoryCachingStreamBridgeType = Class.forName("java.io.OutputStream");
        Class checksumType = Class.forName("java.util.zip.Checksum");
        Constructor checkedOutputStreamConstructor = checkedOutputStreamClazz.getDeclaredConstructor(inMemoryCachingStreamBridgeType, checksumType);
        checkedOutputStreamConstructor.setAccessible(true);
        java.lang.Object[] checkedOutputStreamConstructorArguments = new java.lang.Object[2];
        checkedOutputStreamConstructorArguments[0] = inMemoryCachingStreamBridge;
        checkedOutputStreamConstructorArguments[1] = ((Object) null);
        CheckedOutputStream checkedOutputStream = ((CheckedOutputStream) checkedOutputStreamConstructor.newInstance(checkedOutputStreamConstructorArguments));
        CheckedOutputStream checkedOutputStream1 = new CheckedOutputStream(checkedOutputStream, null);
        CheckedOutputStream checkedOutputStream2 = new CheckedOutputStream(checkedOutputStream1, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream2);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeSubStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeSubStreamsInfo", dataOutputStreamType);
        writeSubStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeSubStreamsInfoMethodArguments = new java.lang.Object[1];
        writeSubStreamsInfoMethodArguments[0] = dataOutputStream;
        try {
            writeSubStreamsInfoMethod.invoke(sevenZOutputFile, writeSubStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeSubStreamsInfo(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeSubStreamsInfo(java.io.DataOutput)}
 * @utbot.invokes {@link java.io.DataOutput#write(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: header.write(NID.kSubStreamsInfo);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteSubStreamsInfo_ThrowIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 805306621);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeSubStreamsInfoMethod = sevenZOutputFileClazz.getDeclaredMethod("writeSubStreamsInfo", objectOutputStreamType);
        writeSubStreamsInfoMethod.setAccessible(true);
        java.lang.Object[] writeSubStreamsInfoMethodArguments = new java.lang.Object[1];
        writeSubStreamsInfoMethodArguments[0] = objectOutputStream;
        try {
            writeSubStreamsInfoMethod.invoke(sevenZOutputFile, writeSubStreamsInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeSubStreamsInfo
    
    public void testWriteSubStreamsInfo_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 14 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.getCurrentOutputStream
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentOutputStream()
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#getCurrentOutputStream()}
 * @utbot.executesCondition {@code (currentOutputStream == null): False}
 * @utbot.returnsFrom {@code return currentOutputStream;}
 *  */
    @Test
    public void testGetCurrentOutputStream_CurrentOutputStreamNotEqualsNull() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        CountingOutputStream currentOutputStream = ((CountingOutputStream) createInstance("org.apache.commons.compress.utils.CountingOutputStream"));
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "currentOutputStream", currentOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Method getCurrentOutputStreamMethod = sevenZOutputFileClazz.getDeclaredMethod("getCurrentOutputStream");
        getCurrentOutputStreamMethod.setAccessible(true);
        java.lang.Object[] getCurrentOutputStreamMethodArguments = new java.lang.Object[0];
        CountingOutputStream actual = ((CountingOutputStream) getCurrentOutputStreamMethod.invoke(sevenZOutputFile, getCurrentOutputStreamMethodArguments));
        
        long currentOutputStreamBytesWritten = currentOutputStream.getBytesWritten();
        long actualBytesWritten = actual.getBytesWritten();
        assertEquals(currentOutputStreamBytesWritten, actualBytesWritten);
        
        OutputStream actualOut = ((OutputStream) getFieldValue(actual, "java.io.FilterOutputStream", "out"));
        assertNull(actualOut);
        
        boolean actualClosed = ((Boolean) getFieldValue(actual, "java.io.FilterOutputStream", "closed"));
        assertFalse(actualClosed);
        
        Object actualCloseLock = getFieldValue(actual, "java.io.FilterOutputStream", "closeLock");
        assertNull(actualCloseLock);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method getCurrentOutputStream()
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#getCurrentOutputStream()}
 * @utbot.throwsException {@link java.io.IOException} in: currentOutputStream = setupFileOutputStream();
 *  */
    @Test(expected = IOException.class)
    public void testGetCurrentOutputStream_ThrowIOException_1() throws Throwable  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.AES256SHA256;
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, null);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
            SevenZMethod contentCompression = SevenZMethod.BZIP2;
            sevenZOutputFile.setContentCompression(contentCompression);
            
            Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
            Method getCurrentOutputStreamMethod = sevenZOutputFileClazz.getDeclaredMethod("getCurrentOutputStream");
            getCurrentOutputStreamMethod.setAccessible(true);
            java.lang.Object[] getCurrentOutputStreamMethodArguments = new java.lang.Object[0];
            try {
                getCurrentOutputStreamMethod.invoke(sevenZOutputFile, getCurrentOutputStreamMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#getCurrentOutputStream()}
 * @utbot.throwsException {@link java.io.IOException} in: currentOutputStream = setupFileOutputStream();
 *  */
    @Test(expected = IOException.class)
    public void testGetCurrentOutputStream_ThrowIOException() throws Throwable  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = {};
            Coders.coderTable = coderTable;
            SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
            
            Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
            Method getCurrentOutputStreamMethod = sevenZOutputFileClazz.getDeclaredMethod("getCurrentOutputStream");
            getCurrentOutputStreamMethod.setAccessible(true);
            java.lang.Object[] getCurrentOutputStreamMethodArguments = new java.lang.Object[0];
            try {
                getCurrentOutputStreamMethod.invoke(sevenZOutputFile, getCurrentOutputStreamMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyStreams
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeFileEmptyStreams(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyStreams(java.io.DataOutput)}
 * @utbot.executesCondition {@code (hasEmptyStreams): False}
 * @utbot.invokes {@link java.util.List#iterator()}
 *  */
    @Test
    public void testWriteFileEmptyStreams_NotHasEmptyStreams() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyStreamsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyStreams", dataOutputType);
        writeFileEmptyStreamsMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyStreamsMethodArguments = new java.lang.Object[1];
        writeFileEmptyStreamsMethodArguments[0] = ((Object) null);
        writeFileEmptyStreamsMethod.invoke(sevenZOutputFile, writeFileEmptyStreamsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeFileEmptyStreams(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyStreams(java.io.DataOutput)}
 * @utbot.executesCondition {@code (hasEmptyStreams): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kEmptyStream);
 *  */
    @Test
    public void testWriteFileEmptyStreams_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", Integer.MIN_VALUE);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyStreams] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyStreams(SevenZOutputFile.java:395) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyStreamsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyStreams", objectOutputStreamType);
        writeFileEmptyStreamsMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyStreamsMethodArguments = new java.lang.Object[1];
        writeFileEmptyStreamsMethodArguments[0] = objectOutputStream;
        try {
            writeFileEmptyStreamsMethod.invoke(sevenZOutputFile, writeFileEmptyStreamsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyStreams(java.io.DataOutput)}
 * @utbot.executesCondition {@code (hasEmptyStreams): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteFileEmptyStreams_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyStreams] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyStreams(SevenZOutputFile.java:395) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyStreamsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyStreams", objectOutputStreamType);
        writeFileEmptyStreamsMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyStreamsMethodArguments = new java.lang.Object[1];
        writeFileEmptyStreamsMethodArguments[0] = objectOutputStream;
        try {
            writeFileEmptyStreamsMethod.invoke(sevenZOutputFile, writeFileEmptyStreamsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyStreams(java.io.DataOutput)}
 * @utbot.executesCondition {@code (hasEmptyStreams): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kEmptyStream);
 *  */
    @Test
    public void testWriteFileEmptyStreams_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyStreams] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyStreams(SevenZOutputFile.java:395) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyStreamsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyStreams", objectOutputStreamType);
        writeFileEmptyStreamsMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyStreamsMethodArguments = new java.lang.Object[1];
        writeFileEmptyStreamsMethodArguments[0] = objectOutputStream;
        try {
            writeFileEmptyStreamsMethod.invoke(sevenZOutputFile, writeFileEmptyStreamsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyStreams(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final SevenZArchiveEntry entry: files)
 *  */
    @Test
    public void testWriteFileEmptyStreams_ThrowNullPointerException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyStreams] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyStreams(SevenZOutputFile.java:388) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyStreamsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyStreams", dataOutputType);
        writeFileEmptyStreamsMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyStreamsMethodArguments = new java.lang.Object[1];
        writeFileEmptyStreamsMethodArguments[0] = ((Object) null);
        try {
            writeFileEmptyStreamsMethod.invoke(sevenZOutputFile, writeFileEmptyStreamsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyStreams(java.io.DataOutput)}
 * @utbot.executesCondition {@code (hasEmptyStreams): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: header.write(NID.kEmptyStream);
 *  */
    @Test
    public void testWriteFileEmptyStreams_ThrowNullPointerException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyStreams] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyStreams(SevenZOutputFile.java:395) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyStreamsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyStreams", dataOutputType);
        writeFileEmptyStreamsMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyStreamsMethodArguments = new java.lang.Object[1];
        writeFileEmptyStreamsMethodArguments[0] = ((Object) null);
        try {
            writeFileEmptyStreamsMethod.invoke(sevenZOutputFile, writeFileEmptyStreamsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyStreams(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !entry.hasStream()
 *  */
    @Test
    public void testWriteFileEmptyStreams_ThrowNullPointerException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyStreams] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyStreams(SevenZOutputFile.java:389) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyStreamsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyStreams", dataOutputType);
        writeFileEmptyStreamsMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyStreamsMethodArguments = new java.lang.Object[1];
        writeFileEmptyStreamsMethodArguments[0] = ((Object) null);
        try {
            writeFileEmptyStreamsMethod.invoke(sevenZOutputFile, writeFileEmptyStreamsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeFileEmptyStreams(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyStreams(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileEmptyStreams_ThrowIOException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyStreamsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyStreams", objectOutputStreamType);
        writeFileEmptyStreamsMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyStreamsMethodArguments = new java.lang.Object[1];
        writeFileEmptyStreamsMethodArguments[0] = objectOutputStream;
        try {
            writeFileEmptyStreamsMethod.invoke(sevenZOutputFile, writeFileEmptyStreamsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyStreams(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(NID.kEmptyStream);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteFileEmptyStreams_ThrowZipException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        DataOutputStream dataOutputStream = new DataOutputStream(zipOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyStreamsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyStreams", dataOutputStreamType);
        writeFileEmptyStreamsMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyStreamsMethodArguments = new java.lang.Object[1];
        writeFileEmptyStreamsMethodArguments[0] = dataOutputStream;
        try {
            writeFileEmptyStreamsMethod.invoke(sevenZOutputFile, writeFileEmptyStreamsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyStreams(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kEmptyStream);
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileEmptyStreams_ThrowIOException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(zipOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        DataOutputStream dataOutputStream = new DataOutputStream(zipOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyStreamsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyStreams", dataOutputStreamType);
        writeFileEmptyStreamsMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyStreamsMethodArguments = new java.lang.Object[1];
        writeFileEmptyStreamsMethodArguments[0] = dataOutputStream;
        try {
            writeFileEmptyStreamsMethod.invoke(sevenZOutputFile, writeFileEmptyStreamsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyStreams(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kEmptyStream);
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileEmptyStreams_ThrowIOException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "closed", true);
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(zipOutputStream, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyStreamsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyStreams", dataOutputStreamType);
        writeFileEmptyStreamsMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyStreamsMethodArguments = new java.lang.Object[1];
        writeFileEmptyStreamsMethodArguments[0] = dataOutputStream;
        try {
            writeFileEmptyStreamsMethod.invoke(sevenZOutputFile, writeFileEmptyStreamsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyStreams(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kEmptyStream);
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileEmptyStreams_ThrowIOException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setSize(java.lang.Long.MIN_VALUE);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "written", 9223362935551151628L);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "locoff", -9101303624179L);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(zipOutputStream, "java.io.FilterOutputStream", "out", out);
        DataOutputStream dataOutputStream = new DataOutputStream(zipOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyStreamsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyStreams", dataOutputStreamType);
        writeFileEmptyStreamsMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyStreamsMethodArguments = new java.lang.Object[1];
        writeFileEmptyStreamsMethodArguments[0] = dataOutputStream;
        try {
            writeFileEmptyStreamsMethod.invoke(sevenZOutputFile, writeFileEmptyStreamsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeFileEmptyStreams(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyStreams(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: header.write(NID.kEmptyStream);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteFileEmptyStreams_ThrowIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = new byte[18];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", Integer.MAX_VALUE);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyStreamsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyStreams", objectOutputStreamType);
        writeFileEmptyStreamsMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyStreamsMethodArguments = new java.lang.Object[1];
        writeFileEmptyStreamsMethodArguments[0] = objectOutputStream;
        try {
            writeFileEmptyStreamsMethod.invoke(sevenZOutputFile, writeFileEmptyStreamsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyStreams(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: header.write(NID.kEmptyStream);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteFileEmptyStreams_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 805306623);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyStreamsMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyStreams", objectOutputStreamType);
        writeFileEmptyStreamsMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyStreamsMethodArguments = new java.lang.Object[1];
        writeFileEmptyStreamsMethodArguments[0] = objectOutputStream;
        try {
            writeFileEmptyStreamsMethod.invoke(sevenZOutputFile, writeFileEmptyStreamsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeFileEmptyStreams
    
    public void testWriteFileEmptyStreams_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileWindowsAttributes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeFileWindowsAttributes(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileWindowsAttributes(java.io.DataOutput)}
 *  */
    @Test
    public void testWriteFileWindowsAttributes() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileWindowsAttributesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileWindowsAttributes", dataOutputType);
        writeFileWindowsAttributesMethod.setAccessible(true);
        java.lang.Object[] writeFileWindowsAttributesMethodArguments = new java.lang.Object[1];
        writeFileWindowsAttributesMethodArguments[0] = ((Object) null);
        writeFileWindowsAttributesMethod.invoke(sevenZOutputFile, writeFileWindowsAttributesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileWindowsAttributes(java.io.DataOutput)}
 *  */
    @Test
    public void testWriteFileWindowsAttributes_1() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileWindowsAttributesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileWindowsAttributes", dataOutputType);
        writeFileWindowsAttributesMethod.setAccessible(true);
        java.lang.Object[] writeFileWindowsAttributesMethodArguments = new java.lang.Object[1];
        writeFileWindowsAttributesMethodArguments[0] = ((Object) null);
        writeFileWindowsAttributesMethod.invoke(sevenZOutputFile, writeFileWindowsAttributesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeFileWindowsAttributes(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileWindowsAttributes(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numWindowsAttributes > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kWinAttributes);
 *  */
    @Test
    public void testWriteFileWindowsAttributes_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasWindowsAttributes(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1023);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileWindowsAttributes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1023 out of bounds for length 2]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileWindowsAttributes(SevenZOutputFile.java:588) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileWindowsAttributesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileWindowsAttributes", objectOutputStreamType);
        writeFileWindowsAttributesMethod.setAccessible(true);
        java.lang.Object[] writeFileWindowsAttributesMethodArguments = new java.lang.Object[1];
        writeFileWindowsAttributesMethodArguments[0] = objectOutputStream;
        try {
            writeFileWindowsAttributesMethod.invoke(sevenZOutputFile, writeFileWindowsAttributesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileWindowsAttributes(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numWindowsAttributes > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteFileWindowsAttributes_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasWindowsAttributes(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileWindowsAttributes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileWindowsAttributes(SevenZOutputFile.java:588) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileWindowsAttributesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileWindowsAttributes", objectOutputStreamType);
        writeFileWindowsAttributesMethod.setAccessible(true);
        java.lang.Object[] writeFileWindowsAttributesMethodArguments = new java.lang.Object[1];
        writeFileWindowsAttributesMethodArguments[0] = objectOutputStream;
        try {
            writeFileWindowsAttributesMethod.invoke(sevenZOutputFile, writeFileWindowsAttributesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileWindowsAttributes(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numWindowsAttributes > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteFileWindowsAttributes_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasWindowsAttributes(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileWindowsAttributes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileWindowsAttributes(SevenZOutputFile.java:588) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileWindowsAttributesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileWindowsAttributes", objectOutputStreamType);
        writeFileWindowsAttributesMethod.setAccessible(true);
        java.lang.Object[] writeFileWindowsAttributesMethodArguments = new java.lang.Object[1];
        writeFileWindowsAttributesMethodArguments[0] = objectOutputStream;
        try {
            writeFileWindowsAttributesMethod.invoke(sevenZOutputFile, writeFileWindowsAttributesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileWindowsAttributes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final SevenZArchiveEntry entry: files)
 *  */
    @Test
    public void testWriteFileWindowsAttributes_ThrowNullPointerException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileWindowsAttributes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileWindowsAttributes(SevenZOutputFile.java:582) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileWindowsAttributesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileWindowsAttributes", dataOutputType);
        writeFileWindowsAttributesMethod.setAccessible(true);
        java.lang.Object[] writeFileWindowsAttributesMethodArguments = new java.lang.Object[1];
        writeFileWindowsAttributesMethodArguments[0] = ((Object) null);
        try {
            writeFileWindowsAttributesMethod.invoke(sevenZOutputFile, writeFileWindowsAttributesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileWindowsAttributes(java.io.DataOutput)}
 * @utbot.executesCondition {@code (numWindowsAttributes > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: header.write(NID.kWinAttributes);
 *  */
    @Test
    public void testWriteFileWindowsAttributes_ThrowNullPointerException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasWindowsAttributes(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileWindowsAttributes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileWindowsAttributes(SevenZOutputFile.java:588) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileWindowsAttributesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileWindowsAttributes", dataOutputType);
        writeFileWindowsAttributesMethod.setAccessible(true);
        java.lang.Object[] writeFileWindowsAttributesMethodArguments = new java.lang.Object[1];
        writeFileWindowsAttributesMethodArguments[0] = ((Object) null);
        try {
            writeFileWindowsAttributesMethod.invoke(sevenZOutputFile, writeFileWindowsAttributesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileWindowsAttributes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: entry.getHasWindowsAttributes()
 *  */
    @Test
    public void testWriteFileWindowsAttributes_ThrowNullPointerException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        files.add(null);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileWindowsAttributes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileWindowsAttributes(SevenZOutputFile.java:583) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileWindowsAttributesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileWindowsAttributes", dataOutputType);
        writeFileWindowsAttributesMethod.setAccessible(true);
        java.lang.Object[] writeFileWindowsAttributesMethodArguments = new java.lang.Object[1];
        writeFileWindowsAttributesMethodArguments[0] = ((Object) null);
        try {
            writeFileWindowsAttributesMethod.invoke(sevenZOutputFile, writeFileWindowsAttributesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeFileWindowsAttributes(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileWindowsAttributes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileWindowsAttributes_ThrowIOException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasWindowsAttributes(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileWindowsAttributesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileWindowsAttributes", objectOutputStreamType);
        writeFileWindowsAttributesMethod.setAccessible(true);
        java.lang.Object[] writeFileWindowsAttributesMethodArguments = new java.lang.Object[1];
        writeFileWindowsAttributesMethodArguments[0] = objectOutputStream;
        try {
            writeFileWindowsAttributesMethod.invoke(sevenZOutputFile, writeFileWindowsAttributesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileWindowsAttributes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileWindowsAttributes_ThrowIOException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasWindowsAttributes(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileWindowsAttributesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileWindowsAttributes", objectOutputStreamType);
        writeFileWindowsAttributesMethod.setAccessible(true);
        java.lang.Object[] writeFileWindowsAttributesMethodArguments = new java.lang.Object[1];
        writeFileWindowsAttributesMethodArguments[0] = objectOutputStream;
        try {
            writeFileWindowsAttributesMethod.invoke(sevenZOutputFile, writeFileWindowsAttributesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileWindowsAttributes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(NID.kWinAttributes);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteFileWindowsAttributes_ThrowZipException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasWindowsAttributes(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        DataOutputStream dataOutputStream = new DataOutputStream(jarOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileWindowsAttributesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileWindowsAttributes", dataOutputStreamType);
        writeFileWindowsAttributesMethod.setAccessible(true);
        java.lang.Object[] writeFileWindowsAttributesMethodArguments = new java.lang.Object[1];
        writeFileWindowsAttributesMethodArguments[0] = dataOutputStream;
        try {
            writeFileWindowsAttributesMethod.invoke(sevenZOutputFile, writeFileWindowsAttributesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileWindowsAttributes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileWindowsAttributes_ThrowIOException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasWindowsAttributes(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileWindowsAttributesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileWindowsAttributes", objectOutputStreamType);
        writeFileWindowsAttributesMethod.setAccessible(true);
        java.lang.Object[] writeFileWindowsAttributesMethodArguments = new java.lang.Object[1];
        writeFileWindowsAttributesMethodArguments[0] = objectOutputStream;
        try {
            writeFileWindowsAttributesMethod.invoke(sevenZOutputFile, writeFileWindowsAttributesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileWindowsAttributes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileWindowsAttributes_ThrowIOException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasWindowsAttributes(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileWindowsAttributesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileWindowsAttributes", objectOutputStreamType);
        writeFileWindowsAttributesMethod.setAccessible(true);
        java.lang.Object[] writeFileWindowsAttributesMethodArguments = new java.lang.Object[1];
        writeFileWindowsAttributesMethodArguments[0] = objectOutputStream;
        try {
            writeFileWindowsAttributesMethod.invoke(sevenZOutputFile, writeFileWindowsAttributesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileWindowsAttributes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileWindowsAttributes_ThrowIOException_4() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasWindowsAttributes(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileWindowsAttributesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileWindowsAttributes", objectOutputStreamType);
        writeFileWindowsAttributesMethod.setAccessible(true);
        java.lang.Object[] writeFileWindowsAttributesMethodArguments = new java.lang.Object[1];
        writeFileWindowsAttributesMethodArguments[0] = objectOutputStream;
        try {
            writeFileWindowsAttributesMethod.invoke(sevenZOutputFile, writeFileWindowsAttributesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileWindowsAttributes(java.io.DataOutput)}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testWriteFileWindowsAttributes_ThrowZipException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasWindowsAttributes(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(zipOutputStream, null);
        DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileWindowsAttributesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileWindowsAttributes", dataOutputStreamType);
        writeFileWindowsAttributesMethod.setAccessible(true);
        java.lang.Object[] writeFileWindowsAttributesMethodArguments = new java.lang.Object[1];
        writeFileWindowsAttributesMethodArguments[0] = dataOutputStream;
        try {
            writeFileWindowsAttributesMethod.invoke(sevenZOutputFile, writeFileWindowsAttributesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeFileWindowsAttributes
    
    public void testWriteFileWindowsAttributes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyFiles
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeFileEmptyFiles(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyFiles(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} once
 *  */
    @Test
    public void testWriteFileEmptyFiles_IterateForLoop() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyFilesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyFiles", dataOutputType);
        writeFileEmptyFilesMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyFilesMethodArguments = new java.lang.Object[1];
        writeFileEmptyFilesMethodArguments[0] = ((Object) null);
        writeFileEmptyFilesMethod.invoke(sevenZOutputFile, writeFileEmptyFilesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyFiles(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} twice
 *  */
    @Test
    public void testWriteFileEmptyFiles_IterateForLoop_1() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        sevenZArchiveEntry.setHasStream(true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyFilesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyFiles", dataOutputType);
        writeFileEmptyFilesMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyFilesMethodArguments = new java.lang.Object[1];
        writeFileEmptyFilesMethodArguments[0] = ((Object) null);
        writeFileEmptyFilesMethod.invoke(sevenZOutputFile, writeFileEmptyFilesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyFiles(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} twice
 *  */
    @Test
    public void testWriteFileEmptyFiles_EmptyFilesSet() throws Exception  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(sevenZArchiveEntry, "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", "isDirectory", true);
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyFilesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyFiles", dataOutputType);
        writeFileEmptyFilesMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyFilesMethodArguments = new java.lang.Object[1];
        writeFileEmptyFilesMethodArguments[0] = ((Object) null);
        writeFileEmptyFilesMethod.invoke(sevenZOutputFile, writeFileEmptyFilesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeFileEmptyFiles(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyFiles(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kEmptyFile);
 *  */
    @Test
    public void testWriteFileEmptyFiles_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", Integer.MIN_VALUE);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyFiles] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyFiles(SevenZOutputFile.java:422) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyFilesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyFiles", objectOutputStreamType);
        writeFileEmptyFilesMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyFilesMethodArguments = new java.lang.Object[1];
        writeFileEmptyFilesMethodArguments[0] = objectOutputStream;
        try {
            writeFileEmptyFilesMethod.invoke(sevenZOutputFile, writeFileEmptyFilesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyFiles(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: header.write(NID.kEmptyFile);
 *  */
    @Test
    public void testWriteFileEmptyFiles_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyFiles] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyFiles(SevenZOutputFile.java:422) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyFilesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyFiles", objectOutputStreamType);
        writeFileEmptyFilesMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyFilesMethodArguments = new java.lang.Object[1];
        writeFileEmptyFilesMethodArguments[0] = objectOutputStream;
        try {
            writeFileEmptyFilesMethod.invoke(sevenZOutputFile, writeFileEmptyFilesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyFiles(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteFileEmptyFiles_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyFiles] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyFiles(SevenZOutputFile.java:422) */
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyFilesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyFiles", objectOutputStreamType);
        writeFileEmptyFilesMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyFilesMethodArguments = new java.lang.Object[1];
        writeFileEmptyFilesMethodArguments[0] = objectOutputStream;
        try {
            writeFileEmptyFilesMethod.invoke(sevenZOutputFile, writeFileEmptyFilesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeFileEmptyFiles(java.io.DataOutput)
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyFiles(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} twice
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kEmptyFile);
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileEmptyFiles_ThrowIOException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyFilesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyFiles", objectOutputStreamType);
        writeFileEmptyFilesMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyFilesMethodArguments = new java.lang.Object[1];
        writeFileEmptyFilesMethodArguments[0] = objectOutputStream;
        try {
            writeFileEmptyFilesMethod.invoke(sevenZOutputFile, writeFileEmptyFilesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyFiles(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} twice
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(NID.kEmptyFile);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteFileEmptyFiles_ThrowZipException() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setSize(java.lang.Long.MIN_VALUE);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "written", -4L);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "locoff", -2L);
        DataOutputStream dataOutputStream = new DataOutputStream(zipOutputStream);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class dataOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyFilesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyFiles", dataOutputStreamType);
        writeFileEmptyFilesMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyFilesMethodArguments = new java.lang.Object[1];
        writeFileEmptyFilesMethodArguments[0] = dataOutputStream;
        try {
            writeFileEmptyFilesMethod.invoke(sevenZOutputFile, writeFileEmptyFilesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyFiles(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} twice
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kEmptyFile);
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileEmptyFiles_ThrowIOException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyFilesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyFiles", objectOutputStreamType);
        writeFileEmptyFilesMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyFilesMethodArguments = new java.lang.Object[1];
        writeFileEmptyFilesMethodArguments[0] = objectOutputStream;
        try {
            writeFileEmptyFilesMethod.invoke(sevenZOutputFile, writeFileEmptyFilesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyFiles(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} twice
 * @utbot.throwsException {@link java.io.IOException} in: header.write(NID.kEmptyFile);
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileEmptyFiles_ThrowIOException_2() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyFilesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyFiles", objectOutputStreamType);
        writeFileEmptyFilesMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyFilesMethodArguments = new java.lang.Object[1];
        writeFileEmptyFilesMethodArguments[0] = objectOutputStream;
        try {
            writeFileEmptyFilesMethod.invoke(sevenZOutputFile, writeFileEmptyFilesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyFiles(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} twice
 * @utbot.throwsException {@link java.util.zip.ZipException} in: header.write(NID.kEmptyFile);
 *  */
    @Test(expected = ZipException.class)
    public void testWriteFileEmptyFiles_ThrowZipException_1() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyFilesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyFiles", objectOutputStreamType);
        writeFileEmptyFilesMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyFilesMethodArguments = new java.lang.Object[1];
        writeFileEmptyFilesMethodArguments[0] = objectOutputStream;
        try {
            writeFileEmptyFilesMethod.invoke(sevenZOutputFile, writeFileEmptyFilesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyFiles(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} twice
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileEmptyFiles_ThrowIOException_3() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyFilesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyFiles", objectOutputStreamType);
        writeFileEmptyFilesMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyFilesMethodArguments = new java.lang.Object[1];
        writeFileEmptyFilesMethodArguments[0] = objectOutputStream;
        try {
            writeFileEmptyFilesMethod.invoke(sevenZOutputFile, writeFileEmptyFilesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SevenZOutputFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.SevenZOutputFile#writeFileEmptyFiles(java.io.DataOutput)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.size(); i++)} twice
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteFileEmptyFiles_ThrowIOException_4() throws Throwable  {
        SevenZOutputFile sevenZOutputFile = ((SevenZOutputFile) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        ArrayList files = new ArrayList();
        SevenZArchiveEntry sevenZArchiveEntry = ((SevenZArchiveEntry) createInstance("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        files.add(sevenZArchiveEntry);
        setField(sevenZOutputFile, "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "files", files);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setSize(-9223372036854775804L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", 9223372036849541138L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -5234669L);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        Class sevenZOutputFileClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class objectOutputStreamType = Class.forName("java.io.DataOutput");
        Method writeFileEmptyFilesMethod = sevenZOutputFileClazz.getDeclaredMethod("writeFileEmptyFiles", objectOutputStreamType);
        writeFileEmptyFilesMethod.setAccessible(true);
        java.lang.Object[] writeFileEmptyFilesMethodArguments = new java.lang.Object[1];
        writeFileEmptyFilesMethodArguments[0] = objectOutputStream;
        try {
            writeFileEmptyFilesMethod.invoke(sevenZOutputFile, writeFileEmptyFilesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeFileEmptyFiles
    
    public void testWriteFileEmptyFiles_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
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
        
                java.lang.reflect.Method methodForGetDeclaredFields971750685452500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields971750685452500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass971750685456800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields971750685452500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass971750685456800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields971750685866000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields971750685866000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass971750685867600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields971750685866000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass971750685867600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


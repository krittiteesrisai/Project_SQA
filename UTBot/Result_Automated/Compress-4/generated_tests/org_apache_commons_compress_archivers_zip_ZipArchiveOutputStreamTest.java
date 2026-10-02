package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Deflater;
import java.io.ObjectOutputStream;
import java.util.zip.CRC32;
import java.io.RandomAccessFile;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import sun.security.util.DerOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FilterOutputStream;
import java.io.File;
import java.util.zip.ZipException;
import java.io.FileOutputStream;
import java.io.FileDescriptor;
import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.nio.file.attribute.FileTime;
import java.util.concurrent.TimeUnit;
import java.lang.reflect.Method;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;

public final class org_apache_commons_compress_archivers_zip_ZipArchiveOutputStreamTest {
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method flush()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#flush()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testFlush_ThrowIndexOutOfBoundsException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.util.zip.DeflaterOutputStream", "syncFlush", true);
        Object out1 = createInstance("java.util.Base64$EncOutputStream");
        ObjectOutputStream out2 = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 255);
        setField(out2, "java.io.ObjectOutputStream", "bout", bout);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flush] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        zipArchiveOutputStream.flush();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#flush()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testFlush_ThrowIndexOutOfBoundsException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.util.zip.DeflaterOutputStream", "syncFlush", true);
        Object out1 = createInstance("java.util.Base64$EncOutputStream");
        ObjectOutputStream out2 = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 255);
        setField(out2, "java.io.ObjectOutputStream", "bout", bout);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flush] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        zipArchiveOutputStream.flush();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#flush()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testFlush_ThrowIndexOutOfBoundsException_2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.util.zip.DeflaterOutputStream", "syncFlush", true);
        Object out1 = createInstance("java.util.Base64$EncOutputStream");
        ObjectOutputStream out2 = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 256);
        setField(out2, "java.io.ObjectOutputStream", "bout", bout);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flush] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        zipArchiveOutputStream.flush();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#flush()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testFlush_ThrowIndexOutOfBoundsException_3() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.util.zip.DeflaterOutputStream", "syncFlush", true);
        Object out1 = createInstance("java.util.Base64$EncOutputStream");
        ObjectOutputStream out2 = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 256);
        setField(out2, "java.io.ObjectOutputStream", "bout", bout);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flush] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        zipArchiveOutputStream.flush();
    }
    ///endregion
    
    ///region Errors report for flush
    
    public void testFlush_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 50 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (length > 0): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getMethod()}
 * @utbot.invokes {@link java.util.zip.CRC32#update(byte[],int,int)}
 *  */
    @Test
    public void testWrite_LengthLessOrEqualZero() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setMethod(8);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Object crc = createInstance("sun.util.calendar.ZoneInfoFile$Checksum");
        setField(crc, "java.util.zip.CRC32", "crc", -255);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "crc", crc);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.write(byteArray, 0, 0);
        
        CRC32 zipArchiveOutputStreamCrc = ((CRC32) getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "crc"));
        int finalZipArchiveOutputStreamCrcCrc = ((Integer) getFieldValue(zipArchiveOutputStreamCrc, "java.util.zip.CRC32", "crc"));
        
        assertEquals(0, finalZipArchiveOutputStreamCrcCrc);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testWrite_ThrowIndexOutOfBoundsException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        zipArchiveOutputStream.write(byteArray, 1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testWrite_ThrowIndexOutOfBoundsException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        zipArchiveOutputStream.write(byteArray, 1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: entry.getMethod() == DEFLATED
 *  */
    @Test
    public void testWrite_ThrowNullPointerException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write(ZipArchiveOutputStream.java:495) */
        zipArchiveOutputStream.write(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (length > 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: crc.update(b, offset, length);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setMethod(8);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write] produces [java.lang.NullPointerException] */
        zipArchiveOutputStream.write(null, -255, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (length > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !def.finished()
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setMethod(8);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write] produces [java.lang.NullPointerException] */
        zipArchiveOutputStream.write(null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: crc.update(b, offset, length);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_3() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -255L);
        RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write] produces [java.lang.NullPointerException] */
        zipArchiveOutputStream.write(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (length > 0): True}
 * @utbot.invokes {@link java.util.zip.Deflater#finished()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: crc.update(b, offset, length);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_4() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setMethod(8);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "def", def);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write] produces [java.lang.NullPointerException] */
        zipArchiveOutputStream.write(null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: crc.update(b, offset, length);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_5() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", 0L);
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {};
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write] produces [java.lang.NullPointerException] */
        zipArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: crc.update(b, offset, length);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_6() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", 0L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write] produces [java.lang.NullPointerException] */
        zipArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: crc.update(b, offset, length);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_7() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", 0L);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Object crc = createInstance("sun.util.calendar.ZoneInfoFile$Checksum");
        setField(out, "java.util.zip.GZIPOutputStream", "crc", crc);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write] produces [java.lang.NullPointerException] */
        zipArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: crc.update(b, offset, length);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_8() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", 0L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ObjectOutputStream out1 = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout1 = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(out1, "java.io.ObjectOutputStream", "bout", bout1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write] produces [java.lang.NullPointerException] */
        zipArchiveOutputStream.write(byteArray, 0, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (length > 0): False}
 * @utbot.invokes {@link java.util.zip.CRC32#update(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: crc.update(b, offset, length);
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testWrite_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setMethod(8);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Object crc = createInstance("sun.util.calendar.ZoneInfoFile$Checksum");
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "crc", crc);
        byte[] byteArray = {(byte) -127};
        
        zipArchiveOutputStream.write(byteArray, 0, -256);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: writeOut(b, offset, length);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_ThrowIndexOutOfBoundsException_2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.write(byteArray, 1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (length > 0): True}
 * @utbot.executesCondition {@code (length <= DEFLATER_BLOCK_SIZE): True}
 * @utbot.invokes {@link java.util.zip.Deflater#setInput(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: def.setInput(b, offset, length);
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testWrite_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setMethod(8);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "def", def);
        
        zipArchiveOutputStream.write(null, -1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (length > 0): True}
 * @utbot.executesCondition {@code (length <= DEFLATER_BLOCK_SIZE): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < fullblocks; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: def.setInput(b, offset + i * DEFLATER_BLOCK_SIZE, DEFLATER_BLOCK_SIZE);
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testWrite_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setMethod(8);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "def", def);
        
        zipArchiveOutputStream.write(null, -1, 8193);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} in: writeOut(b, offset, length);
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testWrite_ThrowOutOfMemoryError() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0};
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.ByteArrayOutputStream", "count", Integer.MAX_VALUE);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        zipArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: writeOut(b, offset, length);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_ThrowIndexOutOfBoundsException_3() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.write(byteArray, -6, -57);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: writeOut(b, offset, length);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_ThrowIndexOutOfBoundsException_4() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 2);
        DerOutputStream out1 = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf1 = {(byte) 0};
        setField(out1, "java.io.ByteArrayOutputStream", "buf", buf1);
        setField(out1, "java.io.ByteArrayOutputStream", "count", Integer.MAX_VALUE);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_ThrowIndexOutOfBoundsException_5() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DerOutputStream out1 = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0};
        setField(out1, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out1, "java.io.ByteArrayOutputStream", "count", -2);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        zipArchiveOutputStream.write(byteArray, 1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} 
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testWrite_ThrowOutOfMemoryError_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = new byte[18];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 8);
        DerOutputStream out1 = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf1 = new byte[29];
        setField(out1, "java.io.ByteArrayOutputStream", "buf", buf1);
        setField(out1, "java.io.ByteArrayOutputStream", "count", -2147483647);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeOut(b, offset, length);
 *  */
    @Test(expected = NullPointerException.class)
    public void testWrite_ThrowNullPointerException_9() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1023);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        zipArchiveOutputStream.write(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeOut(b, offset, length);
 *  */
    @Test(expected = NullPointerException.class)
    public void testWrite_ThrowNullPointerException_10() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.write(byteArray, 0, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: writeOut(b, offset, length);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        zipArchiveOutputStream.write(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: writeOut(b, offset, length);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: writeOut(b, offset, length);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_3() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        zipArchiveOutputStream.write(byteArray, 1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_4() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
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
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        zipArchiveOutputStream.write(byteArray, 1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_5() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: writeOut(b, offset, length);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_6() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.write(byteArray, 0, 0);
    }
    ///endregion
    
    ///region Errors report for write
    
    public void testWrite_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        // $r7 not found in the locals
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.close
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#close()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#finish()}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} 
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testClose_ThrowOutOfMemoryError() throws Exception  {
        byte[] prevCFH_SIG = ZipArchiveOutputStream.CFH_SIG;
        try {
            byte[] cfhSig = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "CFH_SIG", cfhSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ArrayList entries = new ArrayList();
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -255L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", -255L);
            ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
            byte[] buf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
            setField(out, "java.io.ByteArrayOutputStream", "count", -2147483645);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            
            zipArchiveOutputStream.close();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "CFH_SIG", prevCFH_SIG);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#close()}
 * @utbot.throwsException {@link java.io.IOException} in: finish();
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException_1() throws Exception  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ArrayList entries = new ArrayList();
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -255L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", -255L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdLength", -255L);
            GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
            Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
            Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
            setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
            setField(def, "java.util.zip.Deflater", "finished", true);
            setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            
            zipArchiveOutputStream.close();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#close()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCentralDirectoryEnd()}
 * @utbot.throwsException {@link java.io.IOException} in: finish();
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException_2() throws Exception  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ArrayList entries = new ArrayList();
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -255L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", -255L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdLength", -255L);
            DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
            Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
            Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
            setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
            setField(def, "java.util.zip.Deflater", "finished", true);
            setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            
            zipArchiveOutputStream.close();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#close()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getPlatform()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipShort#getBytes(int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getMethod()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getName()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipEncoding#canEncode(java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: finish();
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException() throws Exception  {
        byte[] prevCFH_SIG = ZipArchiveOutputStream.CFH_SIG;
        try {
            byte[] cfhSig = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "CFH_SIG", cfhSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ArrayList entries = new ArrayList();
            JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
            String name = "\u8000";
            jarArchiveEntry.setName(name);
            entries.add(jarArchiveEntry);
            entries.add(null);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", 1L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", -255L);
            Simple8BitZipEncoding zipEncoding = ((Simple8BitZipEncoding) createInstance("org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding"));
            setField(zipEncoding, "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding", "reverseMapping", entries);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zipEncoding", zipEncoding);
            RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
            
            zipArchiveOutputStream.close();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "CFH_SIG", prevCFH_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#close()}
 * @utbot.throwsException {@link java.io.IOException} in: finish();
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException_3() throws Exception  {
        byte[] prevCFH_SIG = ZipArchiveOutputStream.CFH_SIG;
        try {
            byte[] cfhSig = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "CFH_SIG", cfhSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ArrayList entries = new ArrayList();
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -255L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", -255L);
            GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
            Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
            Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
            setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
            setField(def, "java.util.zip.Deflater", "finished", true);
            setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            
            zipArchiveOutputStream.close();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "CFH_SIG", prevCFH_SIG);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method close()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#close()}
     */
    @Test
    public void testCloseThrowsNPE() throws IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(filterOutputStream);
        zipArchiveOutputStream.setEncoding("#$\\\"'");
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.close] produces [java.lang.NullPointerException]
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:137)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:834)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd(ZipArchiveOutputStream.java:807)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish(ZipArchiveOutputStream.java:344)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.close(ZipArchiveOutputStream.java:530) */
        zipArchiveOutputStream.close();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method close()
    
    @Test
    public void testClose1() throws Exception  {
        byte[] prevCFH_SIG = ZipArchiveOutputStream.CFH_SIG;
        try {
            byte[] cfhSig = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "CFH_SIG", cfhSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ArrayList entries = new ArrayList();
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            String name = "\u0A03";
            zipArchiveEntry.setName(name);
            zipArchiveEntry.setMethod(8);
            entries.add(zipArchiveEntry);
            Object simple8BitChar = createInstance("org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding$Simple8BitChar");
            setField(simple8BitChar, "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding$Simple8BitChar", "unicode", '\u0000');
            entries.add(simple8BitChar);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", 0L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", 0L);
            Simple8BitZipEncoding zipEncoding = ((Simple8BitZipEncoding) createInstance("org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding"));
            setField(zipEncoding, "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding", "reverseMapping", entries);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zipEncoding", zipEncoding);
            RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "useEFS", true);
            zipArchiveOutputStream.setFallbackToUTF8(true);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.close] produces [java.lang.ClassCastException: class org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding$Simple8BitChar cannot be cast to class org.apache.commons.compress.archivers.zip.ZipArchiveEntry (org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding$Simple8BitChar and org.apache.commons.compress.archivers.zip.ZipArchiveEntry are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @75fe4551)]
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish(ZipArchiveOutputStream.java:341)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.close(ZipArchiveOutputStream.java:530) */
            zipArchiveOutputStream.close();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "CFH_SIG", prevCFH_SIG);
        }
    }
    
    @Test
    public void testClose2() throws Exception  {
        byte[] prevCFH_SIG = ZipArchiveOutputStream.CFH_SIG;
        try {
            byte[] cfhSig = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "CFH_SIG", cfhSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ArrayList entries = new ArrayList();
            JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
            entries.add(jarArchiveEntry);
            entries.add(null);
            entries.add(null);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", 0L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", 0L);
            ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
            byte[] buf = {};
            setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
            setField(out, "java.io.ByteArrayOutputStream", "count", Integer.MAX_VALUE);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.close] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 2147483651 out of bounds for byte[0]]
                java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:834)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader(ZipArchiveOutputStream.java:710)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish(ZipArchiveOutputStream.java:341)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.close(ZipArchiveOutputStream.java:530) */
            zipArchiveOutputStream.close();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "CFH_SIG", prevCFH_SIG);
        }
    }
    
    @Test
    public void testClose3() throws Exception  {
        byte[] prevCFH_SIG = ZipArchiveOutputStream.CFH_SIG;
        try {
            byte[] cfhSig = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "CFH_SIG", cfhSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ArrayList entries = new ArrayList();
            JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
            entries.add(jarArchiveEntry);
            entries.add(null);
            entries.add(null);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", 0L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", 0L);
            ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
            byte[] buf = {};
            setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.close] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader(ZipArchiveOutputStream.java:719)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish(ZipArchiveOutputStream.java:341)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.close(ZipArchiveOutputStream.java:530) */
            zipArchiveOutputStream.close();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "CFH_SIG", prevCFH_SIG);
        }
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method close()
    
    @Test(expected = IOException.class)
    public void testClose4() throws Exception  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        byte[] prevZERO = ((byte[]) getStaticFieldValue(zipArchiveOutputStreamClazz, "ZERO"));
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            byte[] zero = {(byte) 0, (byte) 0};
            setStaticField(zipArchiveOutputStreamClazz, "ZERO", zero);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ArrayList entries = new ArrayList();
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", 0L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", 0L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdLength", 0L);
            RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
            
            zipArchiveOutputStream.close();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
            setStaticField(ZipArchiveOutputStream.class, "ZERO", prevZERO);
        }
    }
    ///endregion
    
    ///region Errors report for close
    
    public void testClose_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method finish()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#finish()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} in: writeCentralFileHeader((ZipArchiveEntry) i.next());
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testFinish_ThrowOutOfMemoryError() throws Exception  {
        byte[] prevCFH_SIG = ZipArchiveOutputStream.CFH_SIG;
        try {
            byte[] cfhSig = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "CFH_SIG", cfhSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ArrayList entries = new ArrayList();
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -255L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", -255L);
            ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
            byte[] buf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
            setField(out, "java.io.ByteArrayOutputStream", "count", -2147483645);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            
            zipArchiveOutputStream.finish();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "CFH_SIG", prevCFH_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#finish()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Iterator i = entries.iterator(); i.hasNext(); )
 *  */
    @Test
    public void testFinish_ThrowNullPointerException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -255L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", -255L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish(ZipArchiveOutputStream.java:340) */
        zipArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method finish()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#finish()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: writeCentralDirectoryEnd();
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException_1() throws Exception  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ArrayList entries = new ArrayList();
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -255L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", -255L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdLength", -255L);
            GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
            Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
            Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
            setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
            setField(def, "java.util.zip.Deflater", "finished", true);
            setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            
            zipArchiveOutputStream.finish();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#finish()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: writeCentralDirectoryEnd();
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException_2() throws Exception  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ArrayList entries = new ArrayList();
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -255L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", -255L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdLength", -255L);
            DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
            Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
            Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
            setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
            setField(def, "java.util.zip.Deflater", "finished", true);
            setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            
            zipArchiveOutputStream.finish();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#finish()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getPlatform()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getPlatform()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipShort#getBytes(int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipShort#getBytes(int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getMethod()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getMethod()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getName()}
 * @utbot.invokes {@link java.util.zip.ZipEntry#getName()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getName()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipEncoding#canEncode(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding#canEncodeChar(char)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipEncoding#canEncode(java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: writeCentralFileHeader((ZipArchiveEntry) i.next());
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException() throws Exception  {
        byte[] prevCFH_SIG = ZipArchiveOutputStream.CFH_SIG;
        try {
            byte[] cfhSig = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "CFH_SIG", cfhSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ArrayList entries = new ArrayList();
            JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
            String name = "\u8000";
            setField(jarArchiveEntry, "java.util.zip.ZipEntry", "name", name);
            entries.add(jarArchiveEntry);
            entries.add(null);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -255L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", -255L);
            Simple8BitZipEncoding zipEncoding = ((Simple8BitZipEncoding) createInstance("org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding"));
            setField(zipEncoding, "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding", "reverseMapping", entries);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zipEncoding", zipEncoding);
            RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
            
            zipArchiveOutputStream.finish();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "CFH_SIG", prevCFH_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#finish()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: writeCentralFileHeader((ZipArchiveEntry) i.next());
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException_3() throws Exception  {
        byte[] prevCFH_SIG = ZipArchiveOutputStream.CFH_SIG;
        try {
            byte[] cfhSig = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "CFH_SIG", cfhSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ArrayList entries = new ArrayList();
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            entries.add(null);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -255L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", -255L);
            GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
            Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
            Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
            setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
            setField(def, "java.util.zip.Deflater", "finished", true);
            setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            
            zipArchiveOutputStream.finish();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "CFH_SIG", prevCFH_SIG);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method finish()
    
    @Test
    public void testFinish1() throws Exception  {
        byte[] prevCFH_SIG = ZipArchiveOutputStream.CFH_SIG;
        try {
            byte[] cfhSig = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "CFH_SIG", cfhSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ArrayList entries = new ArrayList();
            JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
            String name = "\u7FFF";
            jarArchiveEntry.setName(name);
            entries.add(jarArchiveEntry);
            Object simple8BitChar = createInstance("org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding$Simple8BitChar");
            setField(simple8BitChar, "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding$Simple8BitChar", "unicode", '\u8000');
            entries.add(simple8BitChar);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", 0L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", 0L);
            Simple8BitZipEncoding zipEncoding = ((Simple8BitZipEncoding) createInstance("org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding"));
            setField(zipEncoding, "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding", "reverseMapping", entries);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zipEncoding", zipEncoding);
            RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish] produces [java.lang.ClassCastException: class org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding$Simple8BitChar cannot be cast to class org.apache.commons.compress.archivers.zip.ZipArchiveEntry (org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding$Simple8BitChar and org.apache.commons.compress.archivers.zip.ZipArchiveEntry are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @75fe4551)]
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish(ZipArchiveOutputStream.java:341) */
            zipArchiveOutputStream.finish();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "CFH_SIG", prevCFH_SIG);
        }
    }
    
    @Test
    public void testFinish2() throws Exception  {
        byte[] prevCFH_SIG = ZipArchiveOutputStream.CFH_SIG;
        try {
            byte[] cfhSig = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "CFH_SIG", cfhSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ArrayList entries = new ArrayList();
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            entries.add(zipArchiveEntry);
            ArrayList arrayList = new ArrayList();
            entries.add(arrayList);
            entries.add(arrayList);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", 0L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", 0L);
            ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
            byte[] buf = {};
            setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
            setField(out, "java.io.ByteArrayOutputStream", "count", -3);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -3 out of bounds for byte[1]]
                java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:834)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader(ZipArchiveOutputStream.java:710)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish(ZipArchiveOutputStream.java:341) */
            zipArchiveOutputStream.finish();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "CFH_SIG", prevCFH_SIG);
        }
    }
    
    @Test
    public void testFinish3() throws Exception  {
        byte[] prevCFH_SIG = ZipArchiveOutputStream.CFH_SIG;
        try {
            byte[] cfhSig = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "CFH_SIG", cfhSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ArrayList entries = new ArrayList();
            JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
            entries.add(jarArchiveEntry);
            java.lang.Object[] objectArray = new java.lang.Object[3];
            objectArray[0] = ((Object) jarArchiveEntry);
            objectArray[1] = objectArray;
            objectArray[2] = objectArray;
            entries.add(objectArray);
            entries.add(objectArray);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", 0L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", 0L);
            ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
            byte[] buf = new byte[16];
            setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
            setField(out, "java.io.ByteArrayOutputStream", "count", 7);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader(ZipArchiveOutputStream.java:719)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish(ZipArchiveOutputStream.java:341) */
            zipArchiveOutputStream.finish();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "CFH_SIG", prevCFH_SIG);
        }
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method finish()
    
    @Test(expected = IOException.class)
    public void testFinish4() throws Exception  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        byte[] prevZERO = ((byte[]) getStaticFieldValue(zipArchiveOutputStreamClazz, "ZERO"));
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            byte[] zero = {(byte) 0, (byte) 0};
            setStaticField(zipArchiveOutputStreamClazz, "ZERO", zero);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ArrayList entries = new ArrayList();
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", 0L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdOffset", 0L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "cdLength", 0L);
            RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
            
            zipArchiveOutputStream.finish();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
            setStaticField(ZipArchiveOutputStream.class, "ZERO", prevZERO);
        }
    }
    ///endregion
    
    ///region Errors report for finish
    
    public void testFinish_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createArchiveEntry
    
    ///region OTHER: ERROR SUITE for method createArchiveEntry(java.io.File, java.lang.String)
    
    @Test
    public void testCreateArchiveEntry1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createArchiveEntry] produces [java.lang.NullPointerException: name]
            java.base/java.util.Objects.requireNonNull(Objects.java:233)
            java.base/java.util.zip.ZipEntry.<init>(ZipEntry.java:106)
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry.<init>(ZipArchiveEntry.java:50)
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry.<init>(ZipArchiveEntry.java:89)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createArchiveEntry(ZipArchiveOutputStream.java:916) */
        zipArchiveOutputStream.createArchiveEntry(null, null);
    }
    
    @Test
    public void testCreateArchiveEntry2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        File file = ((File) createInstance("java.io.File"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createArchiveEntry] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.File.isFile(File.java:893)
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry.<init>(ZipArchiveEntry.java:90)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createArchiveEntry(ZipArchiveOutputStream.java:916) */
        zipArchiveOutputStream.createArchiveEntry(file, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeArchiveEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (entry == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testCloseArchiveEntry_EntryEqualsNull() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        zipArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (entry == null): False}
 * @utbot.executesCondition {@code (entry.getMethod() == DEFLATED): False}
 * @utbot.executesCondition {@code (raf == null): True}
 * @utbot.executesCondition {@code (entry.getCrc() != realCrc): False}
 * @utbot.executesCondition {@code (entry.getSize() != written - dataStart): False}
 * @utbot.executesCondition {@code (raf != null): False}
 * @utbot.invokes {@link java.util.zip.CRC32#getValue()}
 * @utbot.invokes {@link java.util.zip.CRC32#reset()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getMethod()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getCrc()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getSize()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 *  */
    @Test
    public void testCloseArchiveEntry_RafEqualsNull() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry.setCrc(4294967041L);
        entry.setSize(3L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(crc, "java.util.zip.CRC32", "crc", -255);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "crc", crc);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", 0L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "dataStart", -3L);
        
        zipArchiveOutputStream.closeArchiveEntry();
        
        ZipArchiveEntry finalZipArchiveOutputStreamEntry = ((ZipArchiveEntry) getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry"));
        CRC32 zipArchiveOutputStreamCrc = ((CRC32) getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "crc"));
        int finalZipArchiveOutputStreamCrcCrc = ((Integer) getFieldValue(zipArchiveOutputStreamCrc, "java.util.zip.CRC32", "crc"));
        
        assertNull(finalZipArchiveOutputStreamEntry);
        
        assertEquals(0, finalZipArchiveOutputStreamCrcCrc);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (entry == null): False}
 * @utbot.executesCondition {@code (entry.getMethod() == DEFLATED): True}
 * @utbot.invokes {@link java.util.zip.CRC32#getValue()}
 * @utbot.invokes {@link java.util.zip.CRC32#reset()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getMethod()}
 * @utbot.invokes {@link java.util.zip.Deflater#finish()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: def.finish();
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowNullPointerException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setMethod(8);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(crc, "java.util.zip.CRC32", "crc", -255);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "crc", crc);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeArchiveEntry] produces [java.lang.NullPointerException] */
        zipArchiveOutputStream.closeArchiveEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (raf == null): False}
 * @utbot.executesCondition {@code (raf != null): True}
 * @utbot.throwsException {@link java.io.IOException} in: raf.seek(localDataStart);
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry.setCrc(0L);
        entry.setSize(0L);
        setField(entry, "java.util.zip.ZipEntry", "csize", 0L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(crc, "java.util.zip.CRC32", "crc", -255);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "crc", crc);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -3L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "dataStart", -3L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "localDataStart", -255L);
        RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
        
        zipArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (raf == null): False}
 * @utbot.executesCondition {@code (raf != null): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getCrc()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#getBytes(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getCompressedSize()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#getBytes(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getSize()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#getBytes(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.invokes {@link java.io.RandomAccessFile#seek(long)}
 * @utbot.throwsException {@link java.io.IOException} in: raf.seek(save);
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry.setCrc(0L);
        entry.setSize(0L);
        setField(entry, "java.util.zip.ZipEntry", "csize", 0L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        Object crc = createInstance("sun.util.calendar.ZoneInfoFile$Checksum");
        setField(crc, "java.util.zip.CRC32", "crc", -255);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "crc", crc);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -3L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "dataStart", -3L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "localDataStart", 0L);
        RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
        
        zipArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (raf == null): True}
 * @utbot.executesCondition {@code (entry.getCrc() != realCrc): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getCrc()}
 * @utbot.invokes {@link java.lang.Long#toHexString(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Long#toHexString(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: Long.toHexString(realCrc)
 *  */
    @Test(expected = ZipException.class)
    public void testCloseArchiveEntry_ThrowZipException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setCrc(1L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "crc", crc);
        
        zipArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (raf == null): True}
 * @utbot.executesCondition {@code (entry.getCrc() != realCrc): False}
 * @utbot.executesCondition {@code (entry.getSize() != written - dataStart): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getSize()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getSize()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: entry.getSize()
 *  */
    @Test(expected = ZipException.class)
    public void testCloseArchiveEntry_ThrowZipException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setCrc(4294967040L);
        entry.setSize(3L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(crc, "java.util.zip.CRC32", "crc", -256);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "crc", crc);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", 0L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "dataStart", -2L);
        
        zipArchiveOutputStream.closeArchiveEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (entry == null): False}
 * @utbot.executesCondition {@code (entry.getMethod() == DEFLATED): False}
 * @utbot.executesCondition {@code (raf == null): False}
 * @utbot.invokes {@link java.util.zip.CRC32#getValue()}
 * @utbot.invokes {@link java.util.zip.CRC32#reset()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getMethod()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setSize(long)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: entry.setSize(size);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCloseArchiveEntry_ThrowIllegalArgumentException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(crc, "java.util.zip.CRC32", "crc", -255);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "crc", crc);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -255L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "dataStart", -2L);
        RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
        
        zipArchiveOutputStream.closeArchiveEntry();
    }
    ///endregion
    
    ///region Errors report for closeArchiveEntry
    
    public void testCloseArchiveEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
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
    public void testWriteOut_4() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {};
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.writeOut(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 *  */
    @Test
    public void testWriteOut() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
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
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(out, "java.util.zip.GZIPOutputStream", "crc", crc);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.writeOut(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 *  */
    @Test
    public void testWriteOut_2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
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
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(out1, "java.util.zip.GZIPOutputStream", "crc", crc);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.writeOut(byteArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeOut([B)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeOut(data, 0, data.length);
 *  */
    @Test
    public void testWriteOut_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        DerOutputStream out = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf = new byte[12];
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.ByteArrayOutputStream", "count", -8);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = new byte[26];
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
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        byteArray[14] = (byte) -127;
        byteArray[15] = (byte) -127;
        byteArray[16] = (byte) -127;
        byteArray[17] = (byte) -127;
        byteArray[18] = (byte) -127;
        byteArray[19] = (byte) -127;
        byteArray[20] = (byte) -127;
        byteArray[21] = (byte) -127;
        byteArray[22] = (byte) -127;
        byteArray[23] = (byte) -127;
        byteArray[24] = (byte) -127;
        byteArray[25] = (byte) -127;
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -8 out of bounds for byte[24]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:834) */
        zipArchiveOutputStream.writeOut(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} in: writeOut(data, 0, data.length);
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testWriteOut_ThrowOutOfMemoryError() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[33];
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.ByteArrayOutputStream", "count", 2147483616);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = new byte[34];
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
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        byteArray[14] = (byte) -127;
        byteArray[15] = (byte) -127;
        byteArray[16] = (byte) -127;
        byteArray[17] = (byte) -127;
        byteArray[18] = (byte) -127;
        byteArray[19] = (byte) -127;
        byteArray[20] = (byte) -127;
        byteArray[21] = (byte) -127;
        byteArray[22] = (byte) -124;
        byteArray[23] = (byte) -64;
        byteArray[24] = (byte) -127;
        byteArray[25] = (byte) 2;
        byteArray[26] = (byte) 2;
        byteArray[27] = (byte) -127;
        byteArray[28] = (byte) -126;
        byteArray[29] = (byte) -124;
        byteArray[30] = (byte) -127;
        byteArray[31] = (byte) -127;
        byteArray[32] = (byte) -126;
        byteArray[33] = (byte) -127;
        
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
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:834) */
        zipArchiveOutputStream.writeOut(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteOut_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:834) */
        zipArchiveOutputStream.writeOut(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteOut_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 2);
        ByteArrayOutputStream out1 = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf1 = {(byte) 0};
        setField(out1, "java.io.ByteArrayOutputStream", "buf", buf1);
        setField(out1, "java.io.ByteArrayOutputStream", "count", -1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[1]]
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1860)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:834) */
        zipArchiveOutputStream.writeOut(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeOut(data, 0, data.length);
 *  */
    @Test
    public void testWriteOut_ThrowNullPointerException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:834) */
        zipArchiveOutputStream.writeOut(null);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeOut(data, 0, data.length);
 *  */
    @Test
    public void testWriteOut_ThrowNullPointerException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -2147482624);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:834) */
        zipArchiveOutputStream.writeOut(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testWriteOut_ThrowNullPointerException_2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ObjectOutputStream out1 = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout1 = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out1, "java.io.ObjectOutputStream", "bout", bout1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:712)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1860)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1913)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:834) */
        zipArchiveOutputStream.writeOut(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testWriteOut_ThrowNullPointerException_3() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ObjectOutputStream out1 = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout1 = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        FileOutputStream out2 = ((FileOutputStream) createInstance("java.io.FileOutputStream"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(out2, "java.io.FileOutputStream", "fd", fd);
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out2);
        setField(out1, "java.io.ObjectOutputStream", "bout", bout1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.NullPointerException]
            java.base/java.io.FileOutputStream.writeBytes(Native Method)
            java.base/java.io.FileOutputStream.write(FileOutputStream.java:349)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1860)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1861)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:834) */
        zipArchiveOutputStream.writeOut(byteArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeOut([B)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteOut_ThrowIOException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
        byte[] byteArray = {(byte) -127};
        
        zipArchiveOutputStream.writeOut(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: writeOut(data, 0, data.length);
 *  */
    @Test(expected = IOException.class)
    public void testWriteOut_ThrowIOException_2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        zipArchiveOutputStream.writeOut(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: writeOut(data, 0, data.length);
 *  */
    @Test(expected = IOException.class)
    public void testWriteOut_ThrowIOException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        FileOutputStream out1 = ((FileOutputStream) createInstance("java.io.FileOutputStream"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(out1, "java.io.FileOutputStream", "fd", fd);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        zipArchiveOutputStream.writeOut(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteOut_ThrowIOException_3() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        zipArchiveOutputStream.writeOut(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteOut_ThrowIOException_4() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
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
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        zipArchiveOutputStream.writeOut(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteOut_ThrowIOException_5() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.writeOut(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: writeOut(data, 0, data.length);
 *  */
    @Test(expected = IOException.class)
    public void testWriteOut_ThrowIOException_6() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.writeOut(byteArray);
    }
    ///endregion
    
    ///region Errors report for writeOut
    
    public void testWriteOut_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 14 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // $r7 not found in the locals
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeOut([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 *  */
    @Test
    public void testWriteOut_31() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        DerOutputStream out = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf = {};
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.writeOut(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 *  */
    @Test
    public void testWriteOut1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.writeOut(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 *  */
    @Test
    public void testWriteOut_11() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Object crc = createInstance("sun.util.calendar.ZoneInfoFile$Checksum");
        setField(out, "java.util.zip.GZIPOutputStream", "crc", crc);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.writeOut(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 *  */
    @Test
    public void testWriteOut_21() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.writeOut(byteArray, 0, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeOut([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.executesCondition {@code (raf != null): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: out.write(data, offset, length);
 *  */
    @Test
    public void testWriteOut_ThrowIndexOutOfBoundsException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.IndexOutOfBoundsException]
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:716)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849) */
        zipArchiveOutputStream.writeOut(byteArray, -1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.executesCondition {@code (raf != null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.write(data, offset, length);
 *  */
    @Test
    public void testWriteOut_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        DerOutputStream out = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf = {};
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.ByteArrayOutputStream", "count", -1);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[1]]
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849) */
        zipArchiveOutputStream.writeOut(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.executesCondition {@code (raf != null): False}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} 
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testWriteOut_ThrowOutOfMemoryError1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[18];
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.ByteArrayOutputStream", "count", -2147483634);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        zipArchiveOutputStream.writeOut(byteArray, 2, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.executesCondition {@code (raf != null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.write(data, offset, length);
 *  */
    @Test
    public void testWriteOut_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", Integer.MIN_VALUE);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2147483648 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849) */
        zipArchiveOutputStream.writeOut(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.executesCondition {@code (raf != null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteOut_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849) */
        zipArchiveOutputStream.writeOut(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.executesCondition {@code (raf != null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteOut_ThrowArrayIndexOutOfBoundsException_31() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849) */
        zipArchiveOutputStream.writeOut(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.executesCondition {@code (raf != null): True}
 * @utbot.invokes {@link java.io.RandomAccessFile#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testWriteOut_ThrowNullPointerException_11() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.NullPointerException]
            java.base/java.io.RandomAccessFile.writeBytes(Native Method)
            java.base/java.io.RandomAccessFile.write(RandomAccessFile.java:558)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:847) */
        zipArchiveOutputStream.writeOut(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.executesCondition {@code (raf != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(data, offset, length);
 *  */
    @Test
    public void testWriteOut_ThrowNullPointerException1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849) */
        zipArchiveOutputStream.writeOut(null, -255, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeOut([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.executesCondition {@code (raf != null): False}
 * @utbot.invokes {@link java.io.OutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: out.write(data, offset, length);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteOut_ThrowIndexOutOfBoundsException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.writeOut(byteArray, -133, -199);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeOut([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteOut_ThrowIOException1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.writeOut(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteOut_ThrowIOException_11() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
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
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        zipArchiveOutputStream.writeOut(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteOut_ThrowIOException_21() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        zipArchiveOutputStream.writeOut(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteOut_ThrowIOException_31() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.writeOut(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteOut_ThrowIOException_41() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = {};
        
        zipArchiveOutputStream.writeOut(byteArray, 0, 0);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method writeOut([B, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
     */
    @Test
    public void testWriteOutThrowsIOOBEWithNonEmptyPrimitiveArray() throws IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(filterOutputStream);
        zipArchiveOutputStream.setEncoding("XZ");
        byte[] byteArray = {java.lang.Byte.MIN_VALUE, (byte) 1};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.IndexOutOfBoundsException]
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:134)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849) */
        zipArchiveOutputStream.writeOut(byteArray, -1610612736, 1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeOut([B, int, int)
    
    @Test(expected = StackOverflowError.class)
    public void testWriteOut2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1073741824);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = new byte[32];
        
        zipArchiveOutputStream.writeOut(byteArray, 0, 1);
    }
    
    @Test
    public void testWriteOut3() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1073740802);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = new byte[34];
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849) */
        zipArchiveOutputStream.writeOut(byteArray, 0, 3);
    }
    
    @Test
    public void testWriteOut4() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[36];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1073741824);
        ObjectOutputStream out1 = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout1 = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(out1, "java.io.ObjectOutputStream", "bout", bout1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        byte[] byteArray = new byte[34];
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:712)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849) */
        zipArchiveOutputStream.writeOut(byteArray, 2, 1);
    }
    ///endregion
    
    ///region Errors report for writeOut
    
    public void testWriteOut_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 6 occurrences of:
        // $r7 not found in the locals
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isSeekable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSeekable()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#isSeekable()}
 * @utbot.returnsFrom {@code return raf != null;}
 *  */
    @Test
    public void testIsSeekable_RafNotEqualsNull() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
        
        boolean actual = zipArchiveOutputStream.isSeekable();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#isSeekable()}
 * @utbot.returnsFrom {@code return raf != null;}
 *  */
    @Test
    public void testIsSeekable_RafEqualsNull() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        boolean actual = zipArchiveOutputStream.isSeekable();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deflate()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#deflate()}
 * @utbot.invokes {@link java.util.zip.Deflater#deflate(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int len = def.deflate(buf, 0, buf.length);
 *  */
    @Test
    public void testDeflate_ThrowNullPointerException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        byte[] buf = {(byte) -127};
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "buf", buf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflate] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflate(ZipArchiveOutputStream.java:576) */
        zipArchiveOutputStream.deflate();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#deflate()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int len = def.deflate(buf, 0, buf.length);
 *  */
    @Test
    public void testDeflate_ThrowNullPointerException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflate] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflate(ZipArchiveOutputStream.java:576) */
        zipArchiveOutputStream.deflate();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method deflate()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#deflate()}
     */
    @Test
    public void testDeflate() throws IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(filterOutputStream);
        zipArchiveOutputStream.setEncoding("#$\\\"'");
        
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: entry = ((ZipArchiveEntry) archiveEntry);
 *  */
    @Test
    public void testPutArchiveEntry_ThrowClassCastException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setCrc(4L);
        entry.setSize(2570798045364371L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(crc, "java.util.zip.CRC32", "crc", 4);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "crc", crc);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", 318998231646226L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "dataStart", -2251799813718145L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry] produces [java.lang.ClassCastException: The object with type org.apache.commons.compress.archivers.ArchiveEntry can not be casted to org.apache.commons.compress.archivers.zip.ZipArchiveEntry] */
        zipArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: entry = ((ZipArchiveEntry) archiveEntry);
 *  */
    @Test
    public void testPutArchiveEntry_ThrowClassCastException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry(null, 0L, 0, 0, 0, 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry] produces [java.lang.ClassCastException: class org.apache.commons.compress.archivers.ar.ArArchiveEntry cannot be cast to class org.apache.commons.compress.archivers.zip.ZipArchiveEntry (org.apache.commons.compress.archivers.ar.ArArchiveEntry and org.apache.commons.compress.archivers.zip.ZipArchiveEntry are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @75fe4551)]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(ZipArchiveOutputStream.java:419) */
        zipArchiveOutputStream.putArchiveEntry(arArchiveEntry);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (entry.getMethod() == -1): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getMethod()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getTime()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: entry.getTime() == -1
 *  */
    @Test
    public void testPutArchiveEntry_ThrowArithmeticException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ArrayList entries = new ArrayList();
        entries.add(null);
        entries.add(null);
        entries.add(null);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        FileTime mtime = ((FileTime) createInstance("java.nio.file.attribute.FileTime"));
        TimeUnit unit = TimeUnit.NANOSECONDS;
        setField(mtime, "java.nio.file.attribute.FileTime", "unit", unit);
        setField(mtime, "java.nio.file.attribute.FileTime", "value", 0L);
        setField(zipArchiveEntry, "java.util.zip.ZipEntry", "mtime", mtime);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry] produces [java.lang.ArithmeticException: / by zero] */
        zipArchiveOutputStream.putArchiveEntry(zipArchiveEntry);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entries.add(entry);
 *  */
    @Test
    public void testPutArchiveEntry_ThrowNullPointerException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(ZipArchiveOutputStream.java:420) */
        zipArchiveOutputStream.putArchiveEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getMethod()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: entry.getMethod() == -1
 *  */
    @Test
    public void testPutArchiveEntry_ThrowNullPointerException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ArrayList entries = new ArrayList();
        entries.add(null);
        entries.add(null);
        entries.add(null);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(ZipArchiveOutputStream.java:422) */
        zipArchiveOutputStream.putArchiveEntry(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: closeArchiveEntry();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPutArchiveEntry_ThrowIllegalArgumentException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(crc, "java.util.zip.CRC32", "crc", -255);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "crc", crc);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -255L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "dataStart", -2L);
        RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
        
        zipArchiveOutputStream.putArchiveEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (entry.getMethod() == -1): True}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getMethod()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setMethod(int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: entry.setMethod(method);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPutArchiveEntry_ThrowIllegalArgumentException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        zipArchiveOutputStream.setMethod(1);
        ArrayList entries = new ArrayList();
        entries.add(null);
        entries.add(null);
        entries.add(null);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        zipArchiveEntry.setMethod(-1);
        
        zipArchiveOutputStream.putArchiveEntry(zipArchiveEntry);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.io.IOException} in: closeArchiveEntry();
 *  */
    @Test(expected = IOException.class)
    public void testPutArchiveEntry_ThrowIOException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setCrc(0L);
        entry.setSize(0L);
        setField(entry, "java.util.zip.ZipEntry", "csize", 0L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(crc, "java.util.zip.CRC32", "crc", -255);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "crc", crc);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -46L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "dataStart", -46L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "localDataStart", -255L);
        RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
        
        zipArchiveOutputStream.putArchiveEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: closeArchiveEntry();
 *  */
    @Test(expected = ZipException.class)
    public void testPutArchiveEntry_ThrowZipException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setCrc(4294967043L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(crc, "java.util.zip.CRC32", "crc", -254);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "crc", crc);
        
        zipArchiveOutputStream.putArchiveEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: closeArchiveEntry();
 *  */
    @Test(expected = ZipException.class)
    public void testPutArchiveEntry_ThrowZipException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry.setCrc(4294967041L);
        entry.setSize(2570798045364371L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(crc, "java.util.zip.CRC32", "crc", -255);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "crc", crc);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", 318998231646210L);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "dataStart", -2251799813718160L);
        
        zipArchiveOutputStream.putArchiveEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (entry.getMethod() == -1): True}
 * @utbot.executesCondition {@code (entry.getTime() == -1): False}
 * @utbot.executesCondition {@code (entry.getMethod() == STORED): True}
 * @utbot.executesCondition {@code (raf == null): True}
 * @utbot.executesCondition {@code (entry.getSize() == -1): True}
 * @utbot.throwsException {@link java.util.zip.ZipException} when: entry.getSize() == -1
 *  */
    @Test(expected = ZipException.class)
    public void testPutArchiveEntry_ThrowZipException_2() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ArrayList entries = new ArrayList();
        entries.add(null);
        entries.add(null);
        entries.add(null);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        FileTime mtime = ((FileTime) createInstance("java.nio.file.attribute.FileTime"));
        TimeUnit unit = TimeUnit.NANOSECONDS;
        setField(mtime, "java.nio.file.attribute.FileTime", "unit", unit);
        setField(mtime, "java.nio.file.attribute.FileTime", "value", 2147483648L);
        setField(zipArchiveEntry, "java.util.zip.ZipEntry", "mtime", mtime);
        zipArchiveEntry.setSize(-1L);
        zipArchiveEntry.setMethod(-1);
        
        zipArchiveOutputStream.putArchiveEntry(zipArchiveEntry);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (entry.getMethod() == -1): True}
 * @utbot.executesCondition {@code (entry.getTime() == -1): False}
 * @utbot.executesCondition {@code (entry.getMethod() == STORED): True}
 * @utbot.executesCondition {@code (raf == null): True}
 * @utbot.executesCondition {@code (entry.getSize() == -1): False}
 * @utbot.executesCondition {@code (entry.getCrc() == -1): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getCrc()}
 * @utbot.throwsException {@link java.util.zip.ZipException} when: entry.getCrc() == -1
 *  */
    @Test(expected = ZipException.class)
    public void testPutArchiveEntry_ThrowZipException_3() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ArrayList entries = new ArrayList();
        entries.add(null);
        entries.add(null);
        entries.add(null);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entries", entries);
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        FileTime mtime = ((FileTime) createInstance("java.nio.file.attribute.FileTime"));
        TimeUnit unit = TimeUnit.NANOSECONDS;
        setField(mtime, "java.nio.file.attribute.FileTime", "unit", unit);
        setField(mtime, "java.nio.file.attribute.FileTime", "value", -1073741824L);
        setField(zipArchiveEntry, "java.util.zip.ZipEntry", "mtime", mtime);
        zipArchiveEntry.setCrc(-1L);
        zipArchiveEntry.setSize(0L);
        zipArchiveEntry.setMethod(-1);
        
        zipArchiveOutputStream.putArchiveEntry(zipArchiveEntry);
    }
    ///endregion
    
    ///region Errors report for putArchiveEntry
    
    public void testPutArchiveEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field private final java.lang.String java.time.temporal.ChronoUnit.name accessible: module
        java.base does not "opens java.time.temporal" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeVersionNeededToExtractAndGeneralPurposeBits
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeVersionNeededToExtractAndGeneralPurposeBits(int, boolean)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeVersionNeededToExtractAndGeneralPurposeBits(int,boolean)}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): True}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): False}
 * @utbot.executesCondition {@code (zipMethod == DEFLATED): True}
 * @utbot.executesCondition {@code (raf == null): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipShort#getBytes(int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipShort#getBytes(int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 *  */
    @Test
    public void testWriteVersionNeededToExtractAndGeneralPurposeBits_RafEqualsNull() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        DerOutputStream out = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf = new byte[30];
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.ByteArrayOutputStream", "count", 1);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeVersionNeededToExtractAndGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeVersionNeededToExtractAndGeneralPurposeBits", intType, booleanType);
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[0] = 8;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[1] = false;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments);
        
        OutputStream zipArchiveOutputStreamOut = ((OutputStream) getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out"));
        byte[] zipArchiveOutputStreamOutOutBuf = ((byte[]) getFieldValue(zipArchiveOutputStreamOut, "java.io.ByteArrayOutputStream", "buf"));
        byte finalZipArchiveOutputStreamOutBuf1 = ((Byte) get(zipArchiveOutputStreamOutOutBuf, 1));
        OutputStream zipArchiveOutputStreamOut1 = ((OutputStream) getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out"));
        byte[] zipArchiveOutputStreamOut1OutBuf = ((byte[]) getFieldValue(zipArchiveOutputStreamOut1, "java.io.ByteArrayOutputStream", "buf"));
        byte finalZipArchiveOutputStreamOutBuf3 = ((Byte) get(zipArchiveOutputStreamOut1OutBuf, 3));
        OutputStream zipArchiveOutputStreamOut2 = ((OutputStream) getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out"));
        int finalZipArchiveOutputStreamOutCount = ((Integer) getFieldValue(zipArchiveOutputStreamOut2, "java.io.ByteArrayOutputStream", "count"));
        
        assertEquals((byte) 20, finalZipArchiveOutputStreamOutBuf1);
        
        assertEquals((byte) 8, finalZipArchiveOutputStreamOutBuf3);
        
        assertEquals(5, finalZipArchiveOutputStreamOutCount);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeVersionNeededToExtractAndGeneralPurposeBits(int, boolean)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeVersionNeededToExtractAndGeneralPurposeBits(int,boolean)}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): True}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): False}
 * @utbot.executesCondition {@code (zipMethod == DEFLATED): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteVersionNeededToExtractAndGeneralPurposeBits_ThrowIOException_8() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeVersionNeededToExtractAndGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeVersionNeededToExtractAndGeneralPurposeBits", intType, booleanType);
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[0] = -255;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[1] = false;
        try {
            writeVersionNeededToExtractAndGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeVersionNeededToExtractAndGeneralPurposeBits(int,boolean)}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): True}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): True}
 * @utbot.executesCondition {@code (zipMethod == DEFLATED): True}
 * @utbot.executesCondition {@code (raf == null): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteVersionNeededToExtractAndGeneralPurposeBits_ThrowIOException_9() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeVersionNeededToExtractAndGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeVersionNeededToExtractAndGeneralPurposeBits", intType, booleanType);
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[0] = 8;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[1] = true;
        try {
            writeVersionNeededToExtractAndGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeVersionNeededToExtractAndGeneralPurposeBits(int,boolean)}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): True}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): True}
 * @utbot.executesCondition {@code (zipMethod == DEFLATED): False}
 * @utbot.throwsException {@link java.io.IOException} in: writeOut(ZipShort.getBytes(versionNeededToExtract));
 *  */
    @Test(expected = IOException.class)
    public void testWriteVersionNeededToExtractAndGeneralPurposeBits_ThrowIOException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeVersionNeededToExtractAndGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeVersionNeededToExtractAndGeneralPurposeBits", intType, booleanType);
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[0] = -255;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[1] = true;
        try {
            writeVersionNeededToExtractAndGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeVersionNeededToExtractAndGeneralPurposeBits(int,boolean)}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): True}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): False}
 * @utbot.executesCondition {@code (zipMethod == DEFLATED): False}
 * @utbot.throwsException {@link java.io.IOException} in: writeOut(ZipShort.getBytes(versionNeededToExtract));
 *  */
    @Test(expected = IOException.class)
    public void testWriteVersionNeededToExtractAndGeneralPurposeBits_ThrowIOException_1() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeVersionNeededToExtractAndGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeVersionNeededToExtractAndGeneralPurposeBits", intType, booleanType);
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[0] = -255;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[1] = false;
        try {
            writeVersionNeededToExtractAndGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeVersionNeededToExtractAndGeneralPurposeBits(int,boolean)}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): False}
 * @utbot.executesCondition {@code (zipMethod == DEFLATED): True}
 * @utbot.executesCondition {@code (raf == null): True}
 * @utbot.throwsException {@link java.io.IOException} in: writeOut(ZipShort.getBytes(versionNeededToExtract));
 *  */
    @Test(expected = IOException.class)
    public void testWriteVersionNeededToExtractAndGeneralPurposeBits_ThrowIOException_2() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "useEFS", true);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeVersionNeededToExtractAndGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeVersionNeededToExtractAndGeneralPurposeBits", intType, booleanType);
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[0] = 8;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[1] = false;
        try {
            writeVersionNeededToExtractAndGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeVersionNeededToExtractAndGeneralPurposeBits(int,boolean)}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): True}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): True}
 * @utbot.executesCondition {@code (zipMethod == DEFLATED): False}
 * @utbot.throwsException {@link java.io.IOException} in: writeOut(ZipShort.getBytes(versionNeededToExtract));
 *  */
    @Test(expected = IOException.class)
    public void testWriteVersionNeededToExtractAndGeneralPurposeBits_ThrowIOException_3() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeVersionNeededToExtractAndGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeVersionNeededToExtractAndGeneralPurposeBits", intType, booleanType);
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[0] = -255;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[1] = true;
        try {
            writeVersionNeededToExtractAndGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeVersionNeededToExtractAndGeneralPurposeBits(int,boolean)}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): False}
 * @utbot.executesCondition {@code (zipMethod == DEFLATED): True}
 * @utbot.executesCondition {@code (raf == null): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteVersionNeededToExtractAndGeneralPurposeBits_ThrowIOException_4() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "useEFS", true);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeVersionNeededToExtractAndGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeVersionNeededToExtractAndGeneralPurposeBits", intType, booleanType);
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[0] = 8;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[1] = false;
        try {
            writeVersionNeededToExtractAndGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeVersionNeededToExtractAndGeneralPurposeBits(int,boolean)}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): False}
 * @utbot.executesCondition {@code (zipMethod == DEFLATED): True}
 * @utbot.executesCondition {@code (raf == null): True}
 * @utbot.throwsException {@link java.io.IOException} in: writeOut(ZipShort.getBytes(versionNeededToExtract));
 *  */
    @Test(expected = IOException.class)
    public void testWriteVersionNeededToExtractAndGeneralPurposeBits_ThrowIOException_5() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "useEFS", true);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeVersionNeededToExtractAndGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeVersionNeededToExtractAndGeneralPurposeBits", intType, booleanType);
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[0] = 8;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[1] = false;
        try {
            writeVersionNeededToExtractAndGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeVersionNeededToExtractAndGeneralPurposeBits(int,boolean)}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): False}
 * @utbot.executesCondition {@code (zipMethod == DEFLATED): True}
 * @utbot.executesCondition {@code (raf == null): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteVersionNeededToExtractAndGeneralPurposeBits_ThrowIOException_6() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "useEFS", true);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeVersionNeededToExtractAndGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeVersionNeededToExtractAndGeneralPurposeBits", intType, booleanType);
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[0] = 8;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[1] = false;
        try {
            writeVersionNeededToExtractAndGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeVersionNeededToExtractAndGeneralPurposeBits(int,boolean)}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): False}
 * @utbot.executesCondition {@code (zipMethod == DEFLATED): True}
 * @utbot.executesCondition {@code (raf == null): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteVersionNeededToExtractAndGeneralPurposeBits_ThrowIOException_7() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1023);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "useEFS", true);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeVersionNeededToExtractAndGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeVersionNeededToExtractAndGeneralPurposeBits", intType, booleanType);
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[0] = 8;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[1] = false;
        try {
            writeVersionNeededToExtractAndGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeVersionNeededToExtractAndGeneralPurposeBits(int, boolean)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeVersionNeededToExtractAndGeneralPurposeBits(int,boolean)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteVersionNeededToExtractAndGeneralPurposeBits_ThrowIndexOutOfBoundsException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1073741825);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "useEFS", true);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeVersionNeededToExtractAndGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeVersionNeededToExtractAndGeneralPurposeBits", intType, booleanType);
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[0] = 8;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[1] = false;
        try {
            writeVersionNeededToExtractAndGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeVersionNeededToExtractAndGeneralPurposeBits(int,boolean)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteVersionNeededToExtractAndGeneralPurposeBits_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
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
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "useEFS", true);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeVersionNeededToExtractAndGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeVersionNeededToExtractAndGeneralPurposeBits", intType, booleanType);
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[0] = 8;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[1] = false;
        try {
            writeVersionNeededToExtractAndGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeVersionNeededToExtractAndGeneralPurposeBits(int, boolean)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeVersionNeededToExtractAndGeneralPurposeBits(int,boolean)}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): True}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeOut(ZipShort.getBytes(versionNeededToExtract));
 *  */
    @Test
    public void testWriteVersionNeededToExtractAndGeneralPurposeBits_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {};
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.ByteArrayOutputStream", "count", -1);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeVersionNeededToExtractAndGeneralPurposeBits] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[1]]
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:834)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeVersionNeededToExtractAndGeneralPurposeBits(ZipArchiveOutputStream.java:878) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeVersionNeededToExtractAndGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeVersionNeededToExtractAndGeneralPurposeBits", intType, booleanType);
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[0] = 8;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[1] = false;
        try {
            writeVersionNeededToExtractAndGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeVersionNeededToExtractAndGeneralPurposeBits(int,boolean)}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): True}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): False}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} 
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testWriteVersionNeededToExtractAndGeneralPurposeBits_ThrowOutOfMemoryError() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        DerOutputStream out = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0, (byte) 0};
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.ByteArrayOutputStream", "count", Integer.MIN_VALUE);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeVersionNeededToExtractAndGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeVersionNeededToExtractAndGeneralPurposeBits", intType, booleanType);
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[0] = 8;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[1] = false;
        try {
            writeVersionNeededToExtractAndGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeVersionNeededToExtractAndGeneralPurposeBits(int,boolean)}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteVersionNeededToExtractAndGeneralPurposeBits_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "useEFS", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeVersionNeededToExtractAndGeneralPurposeBits] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:834)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeVersionNeededToExtractAndGeneralPurposeBits(ZipArchiveOutputStream.java:878) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeVersionNeededToExtractAndGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeVersionNeededToExtractAndGeneralPurposeBits", intType, booleanType);
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[0] = 8;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[1] = false;
        try {
            writeVersionNeededToExtractAndGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeVersionNeededToExtractAndGeneralPurposeBits(int,boolean)}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteVersionNeededToExtractAndGeneralPurposeBits_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "useEFS", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeVersionNeededToExtractAndGeneralPurposeBits] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:834)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeVersionNeededToExtractAndGeneralPurposeBits(ZipArchiveOutputStream.java:878) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeVersionNeededToExtractAndGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeVersionNeededToExtractAndGeneralPurposeBits", intType, booleanType);
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[0] = 8;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[1] = false;
        try {
            writeVersionNeededToExtractAndGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeVersionNeededToExtractAndGeneralPurposeBits(int,boolean)}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteVersionNeededToExtractAndGeneralPurposeBits_ThrowIndexOutOfBoundsException_2() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "useEFS", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeVersionNeededToExtractAndGeneralPurposeBits] produces [java.lang.IndexOutOfBoundsException]
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:716)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1860)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:834)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeVersionNeededToExtractAndGeneralPurposeBits(ZipArchiveOutputStream.java:878) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeVersionNeededToExtractAndGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeVersionNeededToExtractAndGeneralPurposeBits", intType, booleanType);
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[0] = 8;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[1] = false;
        try {
            writeVersionNeededToExtractAndGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeVersionNeededToExtractAndGeneralPurposeBits(int,boolean)}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteVersionNeededToExtractAndGeneralPurposeBits_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 3);
        DerOutputStream out1 = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf1 = {(byte) 0, (byte) 0};
        setField(out1, "java.io.ByteArrayOutputStream", "buf", buf1);
        setField(out1, "java.io.ByteArrayOutputStream", "count", -1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "useEFS", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeVersionNeededToExtractAndGeneralPurposeBits] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[2]]
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1860)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:834)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeVersionNeededToExtractAndGeneralPurposeBits(ZipArchiveOutputStream.java:878) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeVersionNeededToExtractAndGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeVersionNeededToExtractAndGeneralPurposeBits", intType, booleanType);
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[0] = 8;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[1] = false;
        try {
            writeVersionNeededToExtractAndGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeVersionNeededToExtractAndGeneralPurposeBits(int,boolean)}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteVersionNeededToExtractAndGeneralPurposeBits_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1023);
        DerOutputStream out1 = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf1 = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(out1, "java.io.ByteArrayOutputStream", "buf", buf1);
        setField(out1, "java.io.ByteArrayOutputStream", "count", Integer.MIN_VALUE);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "useEFS", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeVersionNeededToExtractAndGeneralPurposeBits] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 1024 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:834)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeVersionNeededToExtractAndGeneralPurposeBits(ZipArchiveOutputStream.java:878) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeVersionNeededToExtractAndGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeVersionNeededToExtractAndGeneralPurposeBits", intType, booleanType);
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[0] = 8;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[1] = false;
        try {
            writeVersionNeededToExtractAndGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeVersionNeededToExtractAndGeneralPurposeBits(int,boolean)}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeOut(ZipShort.getBytes(versionNeededToExtract));
 *  */
    @Test
    public void testWriteVersionNeededToExtractAndGeneralPurposeBits_ThrowNullPointerException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1073740801);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "useEFS", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeVersionNeededToExtractAndGeneralPurposeBits] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:834)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeVersionNeededToExtractAndGeneralPurposeBits(ZipArchiveOutputStream.java:878) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeVersionNeededToExtractAndGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeVersionNeededToExtractAndGeneralPurposeBits", intType, booleanType);
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[0] = 8;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[1] = false;
        try {
            writeVersionNeededToExtractAndGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeVersionNeededToExtractAndGeneralPurposeBits(int,boolean)}
 * @utbot.executesCondition {@code ((useEFS || utfFallback)): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipShort#getBytes(int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testWriteVersionNeededToExtractAndGeneralPurposeBits_ThrowNullPointerException_1() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        FileOutputStream out1 = ((FileOutputStream) createInstance("java.io.FileOutputStream"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(out1, "java.io.FileOutputStream", "fd", fd);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "useEFS", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeVersionNeededToExtractAndGeneralPurposeBits] produces [java.lang.NullPointerException]
            java.base/java.io.FileOutputStream.writeBytes(Native Method)
            java.base/java.io.FileOutputStream.write(FileOutputStream.java:349)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1860)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:834)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeVersionNeededToExtractAndGeneralPurposeBits(ZipArchiveOutputStream.java:878) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeVersionNeededToExtractAndGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeVersionNeededToExtractAndGeneralPurposeBits", intType, booleanType);
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[0] = 8;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[1] = false;
        try {
            writeVersionNeededToExtractAndGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method writeVersionNeededToExtractAndGeneralPurposeBits(int, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeVersionNeededToExtractAndGeneralPurposeBits(int,boolean)}
     */
    @Test
    public void testWriteVersionNeededToExtractAndGeneralPurposeBitsWithCornerCase() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, IOException  {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(byteArrayOutputStream);
        zipArchiveOutputStream.setEncoding("01");
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeVersionNeededToExtractAndGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeVersionNeededToExtractAndGeneralPurposeBits", intType, booleanType);
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[0] = Integer.MAX_VALUE;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[1] = false;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeVersionNeededToExtractAndGeneralPurposeBits(int,boolean)}
     */
    @Test
    public void testWriteVersionNeededToExtractAndGeneralPurposeBitsWithCornerCase1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, IOException  {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(byteArrayOutputStream);
        zipArchiveOutputStream.setEncoding("01");
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeVersionNeededToExtractAndGeneralPurposeBitsMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("writeVersionNeededToExtractAndGeneralPurposeBits", intType, booleanType);
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.setAccessible(true);
        java.lang.Object[] writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments = new java.lang.Object[2];
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[0] = Integer.MAX_VALUE;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments[1] = true;
        writeVersionNeededToExtractAndGeneralPurposeBitsMethod.invoke(zipArchiveOutputStream, writeVersionNeededToExtractAndGeneralPurposeBitsMethodArguments);
    }
    ///endregion
    
    ///region Errors report for writeVersionNeededToExtractAndGeneralPurposeBits
    
    public void testWriteVersionNeededToExtractAndGeneralPurposeBits_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 26 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // $r7 not found in the locals
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean encodable = zipEncoding.canEncode(ze.getName());
 *  */
    @Test
    public void testWriteLocalFileHeader_ThrowNullPointerException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader(ZipArchiveOutputStream.java:589) */
        zipArchiveOutputStream.writeLocalFileHeader(null);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean encodable = zipEncoding.canEncode(ze.getName());
 *  */
    @Test
    public void testWriteLocalFileHeader_ThrowNullPointerException_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        String name = "";
        setField(zipArchiveEntry, "java.util.zip.ZipEntry", "name", name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader] produces [java.lang.NullPointerException] */
        zipArchiveOutputStream.writeLocalFileHeader(zipArchiveEntry);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
     */
    @Test
    public void testWriteLocalFileHeader() throws IOException  {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(byteArrayOutputStream);
        zipArchiveOutputStream.setEncoding("-3");
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry("10");
        zipArchiveEntry.setMethod(1);
        zipArchiveEntry.setExternalAttributes(16777225L);
        zipArchiveEntry.setCrc(0L);
        zipArchiveEntry.setInternalAttributes(0);
        zipArchiveEntry.setSize(8L);
        byte[] byteArray = {(byte) -1, (byte) 12, (byte) 1, (byte) 2, (byte) 1};
        zipArchiveEntry.setExtra(byteArray);
        zipArchiveEntry.setComment("#$\\\"'");
        
        zipArchiveOutputStream.writeLocalFileHeader(zipArchiveEntry);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
     */
    @Test
    public void testWriteLocalFileHeader1() throws IOException  {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(byteArrayOutputStream);
        zipArchiveOutputStream.setEncoding("-3");
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry("1");
        zipArchiveEntry.setMethod(1);
        zipArchiveEntry.setExternalAttributes(16777225L);
        zipArchiveEntry.setCrc(0L);
        zipArchiveEntry.setInternalAttributes(0);
        zipArchiveEntry.setSize(8L);
        byte[] byteArray = {(byte) -1, (byte) 12, (byte) 1, (byte) 2, (byte) 1};
        zipArchiveEntry.setExtra(byteArray);
        zipArchiveEntry.setComment("#$\\\"'");
        
        zipArchiveOutputStream.writeLocalFileHeader(zipArchiveEntry);
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setUseLanguageEncodingFlag
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setUseLanguageEncodingFlag(boolean)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#setUseLanguageEncodingFlag(boolean)}
 * @utbot.executesCondition {@code (useEFS = b && ZipEncodingHelper.isUTF8(encoding);): False}
 *  */
    @Test
    public void testSetUseLanguageEncodingFlag() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        zipArchiveOutputStream.setUseLanguageEncodingFlag(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflateUntilInputIsNeeded
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deflateUntilInputIsNeeded()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#deflateUntilInputIsNeeded()}
 * @utbot.iterates iterate the loop {@code while(!def.needsInput())} once
 *  */
    @Test
    public void testDeflateUntilInputIsNeeded_IterateWhileLoop() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object input = createInstance("java.nio.HeapByteBufferR");
        Class deflaterClazz = Class.forName("java.util.zip.Deflater");
        Class inputType = Class.forName("java.nio.ByteBuffer");
        Method setInputMethod = deflaterClazz.getDeclaredMethod("setInput", inputType);
        setInputMethod.setAccessible(true);
        java.lang.Object[] setInputMethodArguments = new java.lang.Object[1];
        setInputMethodArguments[0] = input;
        setInputMethod.invoke(def, setInputMethodArguments);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "def", def);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Method deflateUntilInputIsNeededMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("deflateUntilInputIsNeeded");
        deflateUntilInputIsNeededMethod.setAccessible(true);
        java.lang.Object[] deflateUntilInputIsNeededMethodArguments = new java.lang.Object[0];
        deflateUntilInputIsNeededMethod.invoke(zipArchiveOutputStream, deflateUntilInputIsNeededMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#deflateUntilInputIsNeeded()}
 * @utbot.iterates iterate the loop {@code while(!def.needsInput())} once
 *  */
    @Test
    public void testDeflateUntilInputIsNeeded_IterateWhileLoop_1() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "inputPos", -255);
        setField(def, "java.util.zip.Deflater", "inputLim", -255);
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "def", def);
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Method deflateUntilInputIsNeededMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("deflateUntilInputIsNeeded");
        deflateUntilInputIsNeededMethod.setAccessible(true);
        java.lang.Object[] deflateUntilInputIsNeededMethodArguments = new java.lang.Object[0];
        deflateUntilInputIsNeededMethod.invoke(zipArchiveOutputStream, deflateUntilInputIsNeededMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deflateUntilInputIsNeeded()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#deflateUntilInputIsNeeded()}
 * @utbot.iterates iterate the loop {@code while(!def.needsInput())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(!def.needsInput())
 *  */
    @Test
    public void testDeflateUntilInputIsNeeded_ThrowNullPointerException() throws Throwable  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflateUntilInputIsNeeded] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflateUntilInputIsNeeded(ZipArchiveOutputStream.java:854) */
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Method deflateUntilInputIsNeededMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("deflateUntilInputIsNeeded");
        deflateUntilInputIsNeededMethod.setAccessible(true);
        java.lang.Object[] deflateUntilInputIsNeededMethodArguments = new java.lang.Object[0];
        try {
            deflateUntilInputIsNeededMethod.invoke(zipArchiveOutputStream, deflateUntilInputIsNeededMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method deflateUntilInputIsNeeded()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#deflateUntilInputIsNeeded()}
     */
    @Test
    public void testDeflateUntilInputIsNeeded() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(filterOutputStream);
        zipArchiveOutputStream.setEncoding("#$\\\"'");
        
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Method deflateUntilInputIsNeededMethod = zipArchiveOutputStreamClazz.getDeclaredMethod("deflateUntilInputIsNeeded");
        deflateUntilInputIsNeededMethod.setAccessible(true);
        java.lang.Object[] deflateUntilInputIsNeededMethodArguments = new java.lang.Object[0];
        deflateUntilInputIsNeededMethod.invoke(zipArchiveOutputStream, deflateUntilInputIsNeededMethodArguments);
    }
    ///endregion
    
    ///region Errors report for deflateUntilInputIsNeeded
    
    public void testDeflateUntilInputIsNeeded_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeDataDescriptor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testWriteDataDescriptor_Return() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        
        zipArchiveOutputStream.writeDataDescriptor(zipArchiveEntry);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (raf != null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testWriteDataDescriptor_RafNotEqualsNull() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        zipArchiveEntry.setMethod(8);
        
        zipArchiveOutputStream.writeDataDescriptor(zipArchiveEntry);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (raf != null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.invokes {@link java.io.OutputStream#write(byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getCrc()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getCrc()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#getBytes(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#getBytes(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getCompressedSize()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getCompressedSize()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#getBytes(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#getBytes(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getSize()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getSize()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#getBytes(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#getBytes(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 *  */
    @Test
    public void testWriteDataDescriptor_RafEqualsNull() throws Exception  {
        byte[] prevDD_SIG = ZipArchiveOutputStream.DD_SIG;
        try {
            byte[] ddSig = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "DD_SIG", ddSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            entry.setCrc(0L);
            entry.setSize(0L);
            setField(entry, "java.util.zip.ZipEntry", "csize", 0L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -255L);
            ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
            byte[] buf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
            setField(out, "java.io.ByteArrayOutputStream", "count", 16);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
            jarArchiveEntry.setMethod(8);
            
            OutputStream zipArchiveOutputStreamOut = ((OutputStream) getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out"));
            byte[] initialZipArchiveOutputStreamOutBuf = ((byte[]) getFieldValue(zipArchiveOutputStreamOut, "java.io.ByteArrayOutputStream", "buf"));
            
            zipArchiveOutputStream.writeDataDescriptor(jarArchiveEntry);
            
            long finalZipArchiveOutputStreamWritten = ((Long) getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written"));
            OutputStream zipArchiveOutputStreamOut1 = ((OutputStream) getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out"));
            byte[] finalZipArchiveOutputStreamOutBuf = ((byte[]) getFieldValue(zipArchiveOutputStreamOut1, "java.io.ByteArrayOutputStream", "buf"));
            OutputStream zipArchiveOutputStreamOut2 = ((OutputStream) getFieldValue(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out"));
            int finalZipArchiveOutputStreamOutCount = ((Integer) getFieldValue(zipArchiveOutputStreamOut2, "java.io.ByteArrayOutputStream", "count"));
            
            assertFalse(initialZipArchiveOutputStreamOutBuf == finalZipArchiveOutputStreamOutBuf);
            
            assertEquals(-239L, finalZipArchiveOutputStreamWritten);
            
            assertEquals(32, finalZipArchiveOutputStreamOutCount);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "DD_SIG", prevDD_SIG);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (raf != null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: writeOut(DD_SIG);
 *  */
    @Test
    public void testWriteDataDescriptor_ThrowIndexOutOfBoundsException() throws Exception  {
        byte[] prevDD_SIG = ZipArchiveOutputStream.DD_SIG;
        try {
            byte[] ddSig = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "DD_SIG", ddSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
            Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
            byte[] hbuf = {};
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
            setField(out, "java.io.ObjectOutputStream", "bout", bout);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            zipArchiveEntry.setMethod(8);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeDataDescriptor] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            zipArchiveOutputStream.writeDataDescriptor(zipArchiveEntry);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "DD_SIG", prevDD_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (raf != null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteDataDescriptor_ThrowIndexOutOfBoundsException_1() throws Exception  {
        byte[] prevDD_SIG = ZipArchiveOutputStream.DD_SIG;
        try {
            byte[] ddSig = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "DD_SIG", ddSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
            Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
            byte[] hbuf = {(byte) 0};
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
            setField(out, "java.io.ObjectOutputStream", "bout", bout);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            zipArchiveEntry.setMethod(8);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeDataDescriptor] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            zipArchiveOutputStream.writeDataDescriptor(zipArchiveEntry);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "DD_SIG", prevDD_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ze.getMethod() != DEFLATED || raf != null
 *  */
    @Test
    public void testWriteDataDescriptor_ThrowNullPointerException() throws Exception  {
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeDataDescriptor] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeDataDescriptor(ZipArchiveOutputStream.java:692) */
        zipArchiveOutputStream.writeDataDescriptor(null);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (raf != null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getCrc()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeOut(ZipLong.getBytes(entry.getCrc()));
 *  */
    @Test
    public void testWriteDataDescriptor_ThrowNullPointerException_1() throws Exception  {
        byte[] prevDD_SIG = ZipArchiveOutputStream.DD_SIG;
        try {
            byte[] ddSig = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "DD_SIG", ddSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
            byte[] buf = {
                (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
                (byte) 0
            };
            setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            zipArchiveEntry.setMethod(8);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeDataDescriptor] produces [java.lang.NullPointerException] */
            zipArchiveOutputStream.writeDataDescriptor(zipArchiveEntry);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "DD_SIG", prevDD_SIG);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.invokes {@link java.io.OutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: writeOut(DD_SIG);
 *  */
    @Test(expected = IOException.class)
    public void testWriteDataDescriptor_ThrowIOException() throws Exception  {
        byte[] prevDD_SIG = ZipArchiveOutputStream.DD_SIG;
        try {
            byte[] ddSig = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "DD_SIG", ddSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
            Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
            setField(def, "java.util.zip.Deflater", "finished", true);
            setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            zipArchiveEntry.setMethod(8);
            
            zipArchiveOutputStream.writeDataDescriptor(zipArchiveEntry);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "DD_SIG", prevDD_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.throwsException {@link java.io.IOException} in: writeOut(DD_SIG);
 *  */
    @Test(expected = IOException.class)
    public void testWriteDataDescriptor_ThrowIOException_1() throws Exception  {
        byte[] prevDD_SIG = ZipArchiveOutputStream.DD_SIG;
        try {
            byte[] ddSig = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "DD_SIG", ddSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
            Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
            setField(def, "java.util.zip.Deflater", "finished", true);
            setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            zipArchiveEntry.setMethod(8);
            
            zipArchiveOutputStream.writeDataDescriptor(zipArchiveEntry);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "DD_SIG", prevDD_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.throwsException {@link java.io.IOException} in: writeOut(DD_SIG);
 *  */
    @Test(expected = IOException.class)
    public void testWriteDataDescriptor_ThrowIOException_2() throws Exception  {
        byte[] prevDD_SIG = ZipArchiveOutputStream.DD_SIG;
        try {
            byte[] ddSig = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "DD_SIG", ddSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
            Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
            GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
            Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
            setField(def, "java.util.zip.Deflater", "finished", true);
            setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
            setField(out, "java.io.ObjectOutputStream", "bout", bout);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
            jarArchiveEntry.setMethod(8);
            
            zipArchiveOutputStream.writeDataDescriptor(jarArchiveEntry);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "DD_SIG", prevDD_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.throwsException {@link java.io.IOException} in: writeOut(DD_SIG);
 *  */
    @Test(expected = IOException.class)
    public void testWriteDataDescriptor_ThrowIOException_3() throws Exception  {
        byte[] prevDD_SIG = ZipArchiveOutputStream.DD_SIG;
        try {
            byte[] ddSig = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "DD_SIG", ddSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
            Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
            DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
            Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
            setField(def, "java.util.zip.Deflater", "finished", true);
            setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
            setField(out, "java.io.ObjectOutputStream", "bout", bout);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
            jarArchiveEntry.setMethod(8);
            
            zipArchiveOutputStream.writeDataDescriptor(jarArchiveEntry);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "DD_SIG", prevDD_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.throwsException {@link java.io.IOException} in: writeOut(DD_SIG);
 *  */
    @Test(expected = IOException.class)
    public void testWriteDataDescriptor_ThrowIOException_4() throws Exception  {
        byte[] prevDD_SIG = ZipArchiveOutputStream.DD_SIG;
        try {
            byte[] ddSig = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "DD_SIG", ddSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
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
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
            jarArchiveEntry.setMethod(8);
            
            zipArchiveOutputStream.writeDataDescriptor(jarArchiveEntry);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "DD_SIG", prevDD_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteDataDescriptor_ThrowIOException_5() throws Exception  {
        byte[] prevDD_SIG = ZipArchiveOutputStream.DD_SIG;
        try {
            byte[] ddSig = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "DD_SIG", ddSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
            Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
            byte[] hbuf = new byte[15];
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
            GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
            Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
            setField(def, "java.util.zip.Deflater", "finished", true);
            setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
            setField(out, "java.io.ObjectOutputStream", "bout", bout);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
            jarArchiveEntry.setMethod(8);
            
            zipArchiveOutputStream.writeDataDescriptor(jarArchiveEntry);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "DD_SIG", prevDD_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.throwsException {@link java.io.IOException} in: writeOut(DD_SIG);
 *  */
    @Test(expected = IOException.class)
    public void testWriteDataDescriptor_ThrowIOException_6() throws Exception  {
        byte[] prevDD_SIG = ZipArchiveOutputStream.DD_SIG;
        try {
            byte[] ddSig = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "DD_SIG", ddSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
            Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
            DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
            Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
            setField(def, "java.util.zip.Deflater", "finished", true);
            setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
            setField(out, "java.io.ObjectOutputStream", "bout", bout);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            zipArchiveEntry.setMethod(8);
            
            zipArchiveOutputStream.writeDataDescriptor(zipArchiveEntry);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "DD_SIG", prevDD_SIG);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: writeOut(DD_SIG);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteDataDescriptor_ThrowIndexOutOfBoundsException_2() throws Exception  {
        byte[] prevDD_SIG = ZipArchiveOutputStream.DD_SIG;
        try {
            byte[] ddSig = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "DD_SIG", ddSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
            byte[] buf = {(byte) 0, (byte) 0};
            setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
            setField(out, "java.io.ByteArrayOutputStream", "count", -1);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            zipArchiveEntry.setMethod(8);
            
            zipArchiveOutputStream.writeDataDescriptor(zipArchiveEntry);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "DD_SIG", prevDD_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} in: writeOut(DD_SIG);
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testWriteDataDescriptor_ThrowOutOfMemoryError() throws Exception  {
        byte[] prevDD_SIG = ZipArchiveOutputStream.DD_SIG;
        try {
            byte[] ddSig = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "DD_SIG", ddSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
            byte[] buf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
            setField(out, "java.io.ByteArrayOutputStream", "count", -2147483647);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
            jarArchiveEntry.setMethod(8);
            
            zipArchiveOutputStream.writeDataDescriptor(jarArchiveEntry);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "DD_SIG", prevDD_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getCrc()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getCrc()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#getBytes(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#getBytes(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: writeOut(ZipLong.getBytes(entry.getCrc()));
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteDataDescriptor_ThrowIndexOutOfBoundsException_3() throws Exception  {
        byte[] prevDD_SIG = ZipArchiveOutputStream.DD_SIG;
        try {
            byte[] ddSig = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "DD_SIG", ddSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            entry.setCrc(0L);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "entry", entry);
            ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
            byte[] buf = {};
            setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
            setField(out, "java.io.ByteArrayOutputStream", "count", Integer.MAX_VALUE);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
            jarArchiveEntry.setMethod(8);
            
            zipArchiveOutputStream.writeDataDescriptor(jarArchiveEntry);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "DD_SIG", prevDD_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: writeOut(DD_SIG);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteDataDescriptor_ThrowIndexOutOfBoundsException_4() throws Exception  {
        byte[] prevDD_SIG = ZipArchiveOutputStream.DD_SIG;
        try {
            byte[] ddSig = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "DD_SIG", ddSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
            Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
            byte[] buf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 6);
            ByteArrayOutputStream out1 = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
            byte[] buf1 = {(byte) 0, (byte) 0, (byte) 0, (byte) 0};
            setField(out1, "java.io.ByteArrayOutputStream", "buf", buf1);
            setField(out1, "java.io.ByteArrayOutputStream", "count", -1);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
            setField(out, "java.io.ObjectOutputStream", "bout", bout);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
            jarArchiveEntry.setMethod(8);
            
            zipArchiveOutputStream.writeDataDescriptor(jarArchiveEntry);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "DD_SIG", prevDD_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: writeOut(DD_SIG);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteDataDescriptor_ThrowIndexOutOfBoundsException_5() throws Exception  {
        byte[] prevDD_SIG = ZipArchiveOutputStream.DD_SIG;
        try {
            byte[] ddSig = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "DD_SIG", ddSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
            Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
            byte[] buf = {(byte) 0, (byte) 0};
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1);
            GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
            Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
            setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
            setField(out, "java.io.ObjectOutputStream", "bout", bout);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            zipArchiveEntry.setMethod(8);
            
            zipArchiveOutputStream.writeDataDescriptor(zipArchiveEntry);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "DD_SIG", prevDD_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeOut(DD_SIG);
 *  */
    @Test(expected = NullPointerException.class)
    public void testWriteDataDescriptor_ThrowNullPointerException_2() throws Exception  {
        byte[] prevDD_SIG = ZipArchiveOutputStream.DD_SIG;
        try {
            byte[] ddSig = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "DD_SIG", ddSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
            Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
            setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1073740803);
            setField(out, "java.io.ObjectOutputStream", "bout", bout);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            zipArchiveEntry.setMethod(8);
            
            zipArchiveOutputStream.writeDataDescriptor(zipArchiveEntry);
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
        // 8 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // $r7 not found in the locals
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link java.io.RandomAccessFile#write(byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getPlatform()}
 * @utbot.throwsException {@link java.io.IOException} in: writeOut(ZipShort.getBytes((ze.getPlatform() << 8) | 20));
 *  */
    @Test(expected = IOException.class)
    public void testWriteCentralFileHeader_ThrowIOException() throws Exception  {
        byte[] prevCFH_SIG = ZipArchiveOutputStream.CFH_SIG;
        try {
            byte[] cfhSig = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "CFH_SIG", cfhSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -255L);
            RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
            
            zipArchiveOutputStream.writeCentralFileHeader(null);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "CFH_SIG", prevCFH_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link java.io.OutputStream#write(byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: writeOut(CFH_SIG);
 *  */
    @Test(expected = IOException.class)
    public void testWriteCentralFileHeader_ThrowIOException_1() throws Exception  {
        byte[] prevCFH_SIG = ZipArchiveOutputStream.CFH_SIG;
        try {
            byte[] cfhSig = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "CFH_SIG", cfhSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
            Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
            setField(def, "java.util.zip.Deflater", "finished", true);
            setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            
            zipArchiveOutputStream.writeCentralFileHeader(null);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "CFH_SIG", prevCFH_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link java.io.OutputStream#write(byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: writeOut(CFH_SIG);
 *  */
    @Test(expected = IOException.class)
    public void testWriteCentralFileHeader_ThrowIOException_2() throws Exception  {
        byte[] prevCFH_SIG = ZipArchiveOutputStream.CFH_SIG;
        try {
            byte[] cfhSig = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "CFH_SIG", cfhSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
            Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
            setField(def, "java.util.zip.Deflater", "finished", true);
            setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            
            zipArchiveOutputStream.writeCentralFileHeader(null);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "CFH_SIG", prevCFH_SIG);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final boolean encodable = zipEncoding.canEncode(ze.getName());
 *  */
    @Test
    public void testWriteCentralFileHeader_ThrowClassCastException() throws Exception  {
        byte[] prevCFH_SIG = ZipArchiveOutputStream.CFH_SIG;
        try {
            byte[] cfhSig = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "CFH_SIG", cfhSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -255L);
            Simple8BitZipEncoding zipEncoding = ((Simple8BitZipEncoding) createInstance("org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding"));
            ArrayList reverseMapping = new ArrayList();
            Object object = createInstance("java.lang.Object");
            reverseMapping.add(object);
            setField(zipEncoding, "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding", "reverseMapping", reverseMapping);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zipEncoding", zipEncoding);
            RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            zipArchiveEntry.setPlatform(-255);
            String name = "\u8000";
            setField(zipArchiveEntry, "java.util.zip.ZipEntry", "name", name);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding$Simple8BitChar] */
            zipArchiveOutputStream.writeCentralFileHeader(zipArchiveEntry);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "CFH_SIG", prevCFH_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final boolean encodable = zipEncoding.canEncode(ze.getName());
 *  */
    @Test
    public void testWriteCentralFileHeader_ThrowClassCastException_1() throws Exception  {
        byte[] prevCFH_SIG = ZipArchiveOutputStream.CFH_SIG;
        try {
            byte[] cfhSig = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "CFH_SIG", cfhSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -255L);
            Simple8BitZipEncoding zipEncoding = ((Simple8BitZipEncoding) createInstance("org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding"));
            ArrayList reverseMapping = new ArrayList();
            Object object = createInstance("java.lang.Object");
            reverseMapping.add(object);
            Object simple8BitChar = createInstance("org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding$Simple8BitChar");
            setField(simple8BitChar, "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding$Simple8BitChar", "unicode", '\uFFE0');
            reverseMapping.add(simple8BitChar);
            reverseMapping.add(null);
            setField(zipEncoding, "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding", "reverseMapping", reverseMapping);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zipEncoding", zipEncoding);
            RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
            JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
            jarArchiveEntry.setPlatform(-255);
            String name = "\u801F";
            setField(jarArchiveEntry, "java.util.zip.ZipEntry", "name", name);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding$Simple8BitChar] */
            zipArchiveOutputStream.writeCentralFileHeader(jarArchiveEntry);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "CFH_SIG", prevCFH_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean encodable = zipEncoding.canEncode(ze.getName());
 *  */
    @Test
    public void testWriteCentralFileHeader_ThrowNullPointerException() throws Exception  {
        byte[] prevCFH_SIG = ZipArchiveOutputStream.CFH_SIG;
        try {
            byte[] cfhSig = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "CFH_SIG", cfhSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -255L);
            RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            zipArchiveEntry.setPlatform(-255);
            String name = "";
            zipArchiveEntry.setName(name);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader] produces [java.lang.NullPointerException] */
            zipArchiveOutputStream.writeCentralFileHeader(zipArchiveEntry);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "CFH_SIG", prevCFH_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding#canEncodeChar(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean encodable = zipEncoding.canEncode(ze.getName());
 *  */
    @Test
    public void testWriteCentralFileHeader_ThrowNullPointerException_1() throws Exception  {
        byte[] prevCFH_SIG = ZipArchiveOutputStream.CFH_SIG;
        try {
            byte[] cfhSig = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "CFH_SIG", cfhSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -255L);
            Simple8BitZipEncoding zipEncoding = ((Simple8BitZipEncoding) createInstance("org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zipEncoding", zipEncoding);
            RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            zipArchiveEntry.setPlatform(-255);
            String name = "\u0000\u8000";
            zipArchiveEntry.setName(name);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader] produces [java.lang.NullPointerException] */
            zipArchiveOutputStream.writeCentralFileHeader(zipArchiveEntry);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "CFH_SIG", prevCFH_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean encodable = zipEncoding.canEncode(ze.getName());
 *  */
    @Test
    public void testWriteCentralFileHeader_ThrowNullPointerException_2() throws Exception  {
        byte[] prevCFH_SIG = ZipArchiveOutputStream.CFH_SIG;
        try {
            byte[] cfhSig = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "CFH_SIG", cfhSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -255L);
            RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
            JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
            jarArchiveEntry.setPlatform(-255);
            String name = "";
            setField(jarArchiveEntry, "java.util.zip.ZipEntry", "name", name);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader] produces [java.lang.NullPointerException] */
            zipArchiveOutputStream.writeCentralFileHeader(jarArchiveEntry);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "CFH_SIG", prevCFH_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean encodable = zipEncoding.canEncode(ze.getName());
 *  */
    @Test
    public void testWriteCentralFileHeader_ThrowNullPointerException_3() throws Exception  {
        byte[] prevCFH_SIG = ZipArchiveOutputStream.CFH_SIG;
        try {
            byte[] cfhSig = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "CFH_SIG", cfhSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -255L);
            Simple8BitZipEncoding zipEncoding = ((Simple8BitZipEncoding) createInstance("org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zipEncoding", zipEncoding);
            RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
            JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
            jarArchiveEntry.setPlatform(-255);
            String name = "\u8000";
            setField(jarArchiveEntry, "java.util.zip.ZipEntry", "name", name);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader] produces [java.lang.NullPointerException] */
            zipArchiveOutputStream.writeCentralFileHeader(jarArchiveEntry);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "CFH_SIG", prevCFH_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean encodable = zipEncoding.canEncode(ze.getName());
 *  */
    @Test
    public void testWriteCentralFileHeader_ThrowNullPointerException_4() throws Exception  {
        byte[] prevCFH_SIG = ZipArchiveOutputStream.CFH_SIG;
        try {
            byte[] cfhSig = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "CFH_SIG", cfhSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "written", -255L);
            Simple8BitZipEncoding zipEncoding = ((Simple8BitZipEncoding) createInstance("org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding"));
            ArrayList reverseMapping = new ArrayList();
            reverseMapping.add(null);
            setField(zipEncoding, "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding", "reverseMapping", reverseMapping);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "zipEncoding", zipEncoding);
            RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            zipArchiveEntry.setPlatform(-255);
            String name = "\u8000";
            setField(zipArchiveEntry, "java.util.zip.ZipEntry", "name", name);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader] produces [java.lang.NullPointerException] */
            zipArchiveOutputStream.writeCentralFileHeader(zipArchiveEntry);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "CFH_SIG", prevCFH_SIG);
        }
    }
    ///endregion
    
    ///region Errors report for writeCentralFileHeader
    
    public void testWriteCentralFileHeader_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeCentralDirectoryEnd()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCentralDirectoryEnd()}
 * @utbot.invokes {@link java.io.OutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeOut(EOCD_SIG);
 *  */
    @Test
    public void testWriteCentralDirectoryEnd_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
            byte[] buf = {};
            setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
            setField(out, "java.io.ByteArrayOutputStream", "count", -9);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -9 out of bounds for byte[0]]
                java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:834)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd(ZipArchiveOutputStream.java:807) */
            zipArchiveOutputStream.writeCentralDirectoryEnd();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCentralDirectoryEnd()}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} in: writeOut(EOCD_SIG);
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testWriteCentralDirectoryEnd_ThrowOutOfMemoryError() throws Exception  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
            byte[] buf = new byte[16];
            setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
            setField(out, "java.io.ByteArrayOutputStream", "count", -2147483645);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            
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
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link java.io.RandomAccessFile#write(byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[])}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.io.IOException} in: byte[] num = ZipShort.getBytes(entries.size());
 *  */
    @Test(expected = IOException.class)
    public void testWriteCentralDirectoryEnd_ThrowIOException() throws Exception  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        byte[] prevZERO = ((byte[]) getStaticFieldValue(zipArchiveOutputStreamClazz, "ZERO"));
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            byte[] zero = {(byte) 0, (byte) 0};
            setStaticField(zipArchiveOutputStreamClazz, "ZERO", zero);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            RandomAccessFile raf = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "raf", raf);
            
            zipArchiveOutputStream.writeCentralDirectoryEnd();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
            setStaticField(ZipArchiveOutputStream.class, "ZERO", prevZERO);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCentralDirectoryEnd()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link java.io.OutputStream#write(byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: writeOut(EOCD_SIG);
 *  */
    @Test(expected = IOException.class)
    public void testWriteCentralDirectoryEnd_ThrowIOException_1() throws Exception  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
            Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
            setField(def, "java.util.zip.Deflater", "finished", true);
            setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            
            zipArchiveOutputStream.writeCentralDirectoryEnd();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCentralDirectoryEnd()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link java.io.OutputStream#write(byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeOut(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: writeOut(EOCD_SIG);
 *  */
    @Test(expected = IOException.class)
    public void testWriteCentralDirectoryEnd_ThrowIOException_2() throws Exception  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
            Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
            setField(def, "java.util.zip.Deflater", "finished", true);
            setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            
            zipArchiveOutputStream.writeCentralDirectoryEnd();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method writeCentralDirectoryEnd()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream#writeCentralDirectoryEnd()}
     */
    @Test
    public void testWriteCentralDirectoryEndThrowsNPE() throws IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(filterOutputStream);
        zipArchiveOutputStream.setEncoding("#$\\\"'");
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd] produces [java.lang.NullPointerException]
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:137)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:849)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(ZipArchiveOutputStream.java:834)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd(ZipArchiveOutputStream.java:807) */
        zipArchiveOutputStream.writeCentralDirectoryEnd();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeCentralDirectoryEnd()
    
    @Test
    public void testWriteCentralDirectoryEnd1() throws Exception  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        byte[] prevZERO = ((byte[]) getStaticFieldValue(zipArchiveOutputStreamClazz, "ZERO"));
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            byte[] zero = {(byte) 0, (byte) 0};
            setStaticField(zipArchiveOutputStreamClazz, "ZERO", zero);
            ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
            ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
            byte[] buf = {
                (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
                (byte) 0
            };
            setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
            setField(zipArchiveOutputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "out", out);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd(ZipArchiveOutputStream.java:814) */
            zipArchiveOutputStream.writeCentralDirectoryEnd();
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
            setStaticField(ZipArchiveOutputStream.class, "ZERO", prevZERO);
        }
    }
    ///endregion
    
    ///region Errors report for writeCentralDirectoryEnd
    
    public void testWriteCentralDirectoryEnd_errors()
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
        
                java.lang.reflect.Method methodForGetDeclaredFields968968498493100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields968968498493100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass968968498497400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields968968498493100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass968968498497400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields968968499132700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields968968499132700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass968968499134100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields968968499132700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass968968499134100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields968968499390500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields968968499390500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass968968499391600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields968968499390500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass968968499391600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields968968499780700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields968968499780700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass968968499781600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields968968499780700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass968968499781600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


package org.apache.commons.compress.archivers.cpio;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Deflater;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.io.FilterOutputStream;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_compress_archivers_cpio_CpioArchiveOutputStreamTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method write(int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(int)}
 * @utbot.invokes {@link java.io.OutputStream#write(int)}
 *  */
    @Test
    public void testWrite_OutputStreamWrite() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0};
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.write(-255);
        
        OutputStream cpioArchiveOutputStreamOut = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        byte[] cpioArchiveOutputStreamOutOutBuf = ((byte[]) getFieldValue(cpioArchiveOutputStreamOut, "java.io.ByteArrayOutputStream", "buf"));
        byte finalCpioArchiveOutputStreamOutBuf0 = ((Byte) get(cpioArchiveOutputStreamOutOutBuf, 0));
        OutputStream cpioArchiveOutputStreamOut1 = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        int finalCpioArchiveOutputStreamOutCount = ((Integer) getFieldValue(cpioArchiveOutputStreamOut1, "java.io.ByteArrayOutputStream", "count"));
        
        assertEquals((byte) 1, finalCpioArchiveOutputStreamOutBuf0);
        
        assertEquals(1, finalCpioArchiveOutputStreamOutCount);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method write(int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.write(b);
 *  */
    @Test
    public void testWrite_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {};
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.ByteArrayOutputStream", "count", Integer.MAX_VALUE);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483647 out of bounds for length 0]
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:112)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:411) */
        cpioArchiveOutputStream.write(1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(int)}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} in: out.write(b);
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testWrite_ThrowOutOfMemoryError() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[29];
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.ByteArrayOutputStream", "count", Integer.MIN_VALUE);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.write(-255);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.write(b);
 *  */
    @Test
    public void testWrite_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", Integer.MIN_VALUE);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1829)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:411) */
        cpioArchiveOutputStream.write(-255);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.write(b);
 *  */
    @Test
    public void testWrite_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:411) */
        cpioArchiveOutputStream.write(-255);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWrite_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:411) */
        cpioArchiveOutputStream.write(-255);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWrite_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ByteArrayOutputStream out1 = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {};
        setField(out1, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out1, "java.io.ByteArrayOutputStream", "count", -6);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -6 out of bounds for byte[0]]
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1913)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:411) */
        cpioArchiveOutputStream.write(-255);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWrite_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ObjectOutputStream out1 = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout1 = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1);
        setField(out1, "java.io.ObjectOutputStream", "bout", bout1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1913)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1827)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:411) */
        cpioArchiveOutputStream.write(-255);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(b);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:411) */
        cpioArchiveOutputStream.write(-255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method write(int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(int)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(b);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.write(-255);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(int)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(b);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.write(-255);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
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
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.write(-255);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(int)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(b);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_3() throws Exception  {
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
        
        cpioArchiveOutputStream.write(-255);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_4() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ObjectOutputStream out1 = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout1 = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        GZIPOutputStream out2 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out2, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out2);
        setField(out1, "java.io.ObjectOutputStream", "bout", bout1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.write(-255);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_5() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ObjectOutputStream out1 = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout1 = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        DeflaterOutputStream out2 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out2, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out2);
        setField(out1, "java.io.ObjectOutputStream", "bout", bout1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.write(-255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method write(int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: out.write(b);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_ThrowIndexOutOfBoundsException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 805306752);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.write(-255);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: out.write(b);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_ThrowIndexOutOfBoundsException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 805306752);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.write(-255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method write(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(int)}
     */
    @Test
    public void testWriteThrowsNPEWithCornerCase() throws IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        CpioArchiveOutputStream cpioArchiveOutputStream = new CpioArchiveOutputStream(filterOutputStream);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.NullPointerException]
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:411) */
        cpioArchiveOutputStream.write(0);
    }
    ///endregion
    
    ///region Errors report for write
    
    public void testWrite_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 9 occurrences of:
        // $r7 not found in the locals
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len == 0): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testWrite_LenEqualsZero() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        byte[] byteArray = {};
        
        cpioArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.cpioEntry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.cpioEntry.getSize()): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_CRC) == FORMAT_NEW_CRC): False}
 *  */
    @Test
    public void testWrite_ThisCpioEntryGetFormatBitwiseOrFORMAT_NEW_CRCNotEqualsFORMAT_NEW_CRC() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -255);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -245L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -246L);
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0};
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 1);
        
        long finalCpioArchiveOutputStreamWritten = ((Long) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written"));
        OutputStream cpioArchiveOutputStreamOut = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        byte[] cpioArchiveOutputStreamOutOutBuf = ((byte[]) getFieldValue(cpioArchiveOutputStreamOut, "java.io.ByteArrayOutputStream", "buf"));
        byte finalCpioArchiveOutputStreamOutBuf0 = ((Byte) get(cpioArchiveOutputStreamOutOutBuf, 0));
        OutputStream cpioArchiveOutputStreamOut1 = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        int finalCpioArchiveOutputStreamOutCount = ((Integer) getFieldValue(cpioArchiveOutputStreamOut1, "java.io.ByteArrayOutputStream", "count"));
        
        assertEquals(-245L, finalCpioArchiveOutputStreamWritten);
        
        assertEquals((byte) -127, finalCpioArchiveOutputStreamOutBuf0);
        
        assertEquals(1, finalCpioArchiveOutputStreamOutCount);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.cpioEntry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.cpioEntry.getSize()): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_CRC) == FORMAT_NEW_CRC): True}
 * @utbot.iterates iterate the loop {@code for(int pos = 0; pos < len; pos++)} once
 *  */
    @Test
    public void testWrite_ThisCpioEntryGetFormatBitwiseOrFORMAT_NEW_CRCEqualsFORMAT_NEW_CRC() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -205L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -206L);
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0};
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 1);
        
        long finalCpioArchiveOutputStreamCrc = ((Long) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc"));
        long finalCpioArchiveOutputStreamWritten = ((Long) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written"));
        OutputStream cpioArchiveOutputStreamOut = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        byte[] cpioArchiveOutputStreamOutOutBuf = ((byte[]) getFieldValue(cpioArchiveOutputStreamOut, "java.io.ByteArrayOutputStream", "buf"));
        byte finalCpioArchiveOutputStreamOutBuf0 = ((Byte) get(cpioArchiveOutputStreamOutOutBuf, 0));
        OutputStream cpioArchiveOutputStreamOut1 = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        int finalCpioArchiveOutputStreamOutCount = ((Integer) getFieldValue(cpioArchiveOutputStreamOut1, "java.io.ByteArrayOutputStream", "count"));
        
        assertEquals(129L, finalCpioArchiveOutputStreamCrc);
        
        assertEquals(-205L, finalCpioArchiveOutputStreamWritten);
        
        assertEquals((byte) -127, finalCpioArchiveOutputStreamOutBuf0);
        
        assertEquals(1, finalCpioArchiveOutputStreamOutCount);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: off < 0 || len < 0 || off > b.length - len
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_ThrowIndexOutOfBoundsException1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 3, 0);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: off < 0 || len < 0 || off > b.length - len
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_ThrowIndexOutOfBoundsException_11() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        cpioArchiveOutputStream.write(null, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: off < 0 || len < 0 || off > b.length - len
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_ThrowIndexOutOfBoundsException_2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        cpioArchiveOutputStream.write(null, -1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.cpioEntry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.cpioEntry.getSize()): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_ThrowIndexOutOfBoundsException_3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -254L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -255L);
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
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.cpioEntry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.cpioEntry.getSize()): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_ThrowIndexOutOfBoundsException_4() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -254L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -255L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.cpioEntry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.cpioEntry.getSize()): True}
 * @utbot.throwsException {@link java.io.IOException} when: this.written + len > this.cpioEntry.getSize()
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_11() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -254L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
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
    public void testWrite_ThrowIOException_21() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closed", true);
        
        cpioArchiveOutputStream.write(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.cpioEntry == null): True}
 * @utbot.throwsException {@link java.io.IOException} when: this.cpioEntry == null
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.cpioEntry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.cpioEntry.getSize()): False}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(b, off, len);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_31() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -253L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -254L);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
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
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.cpioEntry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.cpioEntry.getSize()): False}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(b, off, len);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_41() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -253L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -254L);
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
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.cpioEntry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.cpioEntry.getSize()): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_51() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -255L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -256L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.cpioEntry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.cpioEntry.getSize()): False}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(b, off, len);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_6() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -255L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -256L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.cpioEntry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.cpioEntry.getSize()): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_7() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -2L);
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
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.cpioEntry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.cpioEntry.getSize()): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_8() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -2L);
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
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 2);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.cpioEntry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.cpioEntry.getSize()): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.write(b, off, len);
 *  */
    @Test
    public void testWrite_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -253L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -255L);
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0};
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.ByteArrayOutputStream", "count", -1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:302) */
        cpioArchiveOutputStream.write(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.cpioEntry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.cpioEntry.getSize()): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.write(b, off, len);
 *  */
    @Test
    public void testWrite_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -223L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -255L);
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[13];
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.ByteArrayOutputStream", "count", -12);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = new byte[40];
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
        byteArray[26] = (byte) -127;
        byteArray[27] = (byte) -127;
        byteArray[28] = (byte) -127;
        byteArray[29] = (byte) -127;
        byteArray[30] = (byte) -127;
        byteArray[31] = (byte) -127;
        byteArray[32] = (byte) -127;
        byteArray[33] = (byte) -127;
        byteArray[34] = (byte) -127;
        byteArray[35] = (byte) -127;
        byteArray[36] = (byte) -127;
        byteArray[37] = (byte) -127;
        byteArray[38] = (byte) -127;
        byteArray[39] = (byte) -127;
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -12 out of bounds for byte[26]]
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:302) */
        cpioArchiveOutputStream.write(byteArray, 8, 32);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.cpioEntry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.cpioEntry.getSize()): False}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} 
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testWrite_ThrowOutOfMemoryError1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -254L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -256L);
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0};
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.ByteArrayOutputStream", "count", 2147483646);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = new byte[35];
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
        byteArray[25] = (byte) -126;
        byteArray[26] = (byte) -127;
        byteArray[27] = (byte) -126;
        byteArray[28] = (byte) -124;
        byteArray[29] = (byte) -124;
        byteArray[30] = (byte) -127;
        byteArray[31] = (byte) -127;
        byteArray[32] = (byte) -127;
        byteArray[33] = (byte) -124;
        byteArray[34] = (byte) -126;
        
        cpioArchiveOutputStream.write(byteArray, 2, 2);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.cpioEntry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.cpioEntry.getSize()): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWrite_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -251L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -252L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:302) */
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.cpioEntry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.cpioEntry.getSize()): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWrite_ThrowArrayIndexOutOfBoundsException_31() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -244L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -245L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:302) */
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: off < 0 || len < 0 || off > b.length - len
 *  */
    @Test
    public void testWrite_ThrowNullPointerException1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:290) */
        cpioArchiveOutputStream.write(null, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.cpioEntry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.cpioEntry.getSize()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(b, off, len);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -127L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -129L);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:302) */
        cpioArchiveOutputStream.write(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.cpioEntry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.cpioEntry.getSize()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(b, off, len);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -1L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1023);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:302) */
        cpioArchiveOutputStream.write(byteArray, 0, 2);
    }
    ///endregion
    
    ///region Errors report for write
    
    public void testWrite_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 7 occurrences of:
        // $r7 not found in the locals
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!this.closed): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.ArchiveOutputStream#close()}
 *  */
    @Test
    public void testClose_NotThisClosed() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        cpioArchiveOutputStream.close();
        
        boolean finalCpioArchiveOutputStreamClosed = ((Boolean) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closed"));
        
        assertTrue(finalCpioArchiveOutputStreamClosed);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!this.closed): False}
 *  */
    @Test
    public void testClose_ThisClosed() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closed", true);
        
        cpioArchiveOutputStream.close();
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method finish()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#finish()}
 * @utbot.executesCondition {@code (this.finished): True}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#ensureOpen()
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testFinish_ThisFinished() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finished", true);
        
        cpioArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method finish()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#finish()}
 * @utbot.executesCondition {@code (this.finished): False}
 * @utbot.executesCondition {@code (this.cpioEntry != null): False}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#ensureOpen()
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: this.cpioEntry = new CpioArchiveEntry(this.entryFormat);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFinish_ThrowIllegalArgumentException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 7);
        
        cpioArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method finish()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#finish()}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#ensureOpen()
 * @utbot.throwsException {@link java.io.IOException} in: ensureOpen();
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closed", true);
        
        cpioArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method finish()
    
    @Test(expected = UnsupportedOperationException.class)
    public void testFinish1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        
        cpioArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method finish()
    
    @Test
    public void testFinish2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 4);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:184)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish(CpioArchiveOutputStream.java:333) */
        cpioArchiveOutputStream.finish();
    }
    
    @Test
    public void testFinish3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 2);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:180)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish(CpioArchiveOutputStream.java:333) */
        cpioArchiveOutputStream.finish();
    }
    
    @Test
    public void testFinish4() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 8);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:362)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:189)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish(CpioArchiveOutputStream.java:333) */
        cpioArchiveOutputStream.finish();
    }
    
    @Test
    public void testFinish5() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:176)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish(CpioArchiveOutputStream.java:333) */
        cpioArchiveOutputStream.finish();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method pad(long, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(long,int)}
 * @utbot.executesCondition {@code (skip > 0): False}
 *  */
    @Test
    public void testPad_SkipLessOrEqualZero() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", longType, intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[2];
        padMethodArguments[0] = 0L;
        padMethodArguments[1] = 1;
        padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method pad(long, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(long,int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: long skip = count % border;
 *  */
    @Test
    public void testPad_ThrowArithmeticException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:352) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", longType, intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[2];
        padMethodArguments[0] = 1L;
        padMethodArguments[1] = 0;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(long,int)}
 * @utbot.executesCondition {@code (skip > 0): True}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: byte[] tmp = new byte[(int) (border - skip)];
 *  */
    @Test
    public void testPad_ThrowNegativeArraySizeException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad] produces [java.lang.NegativeArraySizeException: -5]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:354) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", longType, intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[2];
        padMethodArguments[0] = 62L;
        padMethodArguments[1] = -3;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(long,int)}
 * @utbot.executesCondition {@code (skip > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testPad_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
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
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:355) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", longType, intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[2];
        padMethodArguments[0] = 20L;
        padMethodArguments[1] = 3;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(long,int)}
 * @utbot.executesCondition {@code (skip > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testPad_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
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
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:355) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", longType, intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[2];
        padMethodArguments[0] = 20L;
        padMethodArguments[1] = 3;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(long,int)}
 * @utbot.executesCondition {@code (skip > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(tmp);
 *  */
    @Test
    public void testPad_ThrowNullPointerException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:355) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", longType, intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[2];
        padMethodArguments[0] = 175L;
        padMethodArguments[1] = 22;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(long,int)}
 * @utbot.executesCondition {@code (skip > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(tmp);
 *  */
    @Test
    public void testPad_ThrowNullPointerException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -2147482624);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:355) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", longType, intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[2];
        padMethodArguments[0] = 130L;
        padMethodArguments[1] = 131;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method pad(long, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(long,int)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(tmp);
 *  */
    @Test(expected = IOException.class)
    public void testPad_ThrowIOException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", longType, intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[2];
        padMethodArguments[0] = 249L;
        padMethodArguments[1] = 2;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(long,int)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(tmp);
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
        Class longType = long.class;
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", longType, intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[2];
        padMethodArguments[0] = 249L;
        padMethodArguments[1] = 2;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(long,int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testPad_ThrowIOException_2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", longType, intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[2];
        padMethodArguments[0] = 62L;
        padMethodArguments[1] = 4;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(long,int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testPad_ThrowIOException_3() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", longType, intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[2];
        padMethodArguments[0] = 69L;
        padMethodArguments[1] = 2;
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
        // 2 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.setFormat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setFormat(short)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#setFormat(short)}
 * @utbot.activatesSwitch {@code switch(format) case: FORMAT_OLD_BINARY}
 *  */
    @Test
    public void testSetFormat_SwitchFormatCaseFORMAT_OLD_BINARY() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 0);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class shortType = short.class;
        Method setFormatMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("setFormat", shortType);
        setFormatMethod.setAccessible(true);
        java.lang.Object[] setFormatMethodArguments = new java.lang.Object[1];
        setFormatMethodArguments[0] = (short) 2;
        setFormatMethod.invoke(cpioArchiveOutputStream, setFormatMethodArguments);
        
        short finalCpioArchiveOutputStreamEntryFormat = ((Short) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat"));
        
        assertEquals((short) 2, finalCpioArchiveOutputStreamEntryFormat);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setFormat(short)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#setFormat(short)}
 * @utbot.activatesSwitch {@code switch(format) case: default}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: switch(format) case: default
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetFormat_ThrowIllegalArgumentException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class shortType = short.class;
        Method setFormatMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("setFormat", shortType);
        setFormatMethod.setAccessible(true);
        java.lang.Object[] setFormatMethodArguments = new java.lang.Object[1];
        setFormatMethodArguments[0] = (short) 3;
        try {
            setFormatMethod.invoke(cpioArchiveOutputStream, setFormatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getFormat()}
 * @utbot.activatesSwitch {@code switch(e.getFormat())}
 *  */
    @Test
    public void testWriteHeader_CpioArchiveEntryGetFormat() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -246);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeHeaderMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeHeader", cpioArchiveEntryType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = cpioArchiveEntry;
        writeHeaderMethod.invoke(cpioArchiveOutputStream, writeHeaderMethodArguments);
    }
    ///endregion
    
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
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:174) */
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
    
    ///region FUZZER: ERROR SUITE for method writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
     */
    @Test
    public void testWriteHeaderThrowsNPE() throws Throwable  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        CpioArchiveOutputStream cpioArchiveOutputStream = new CpioArchiveOutputStream(filterOutputStream, (short) 4);
        CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry("070701", 6L);
        cpioArchiveEntry.setChksum(1L);
        cpioArchiveEntry.setName("#$\\\"'");
        cpioArchiveEntry.setInode(1L);
        cpioArchiveEntry.setMode(16385L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader] produces [java.lang.NullPointerException]
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:137)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:176) */
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
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:362)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:189) */
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
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:176) */
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
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:180) */
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
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 4);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:184) */
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method putNextEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putNextEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: e.getTime() == -1
 *  */
    @Test
    public void testPutNextEntry_ThrowNullPointerException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry(CpioArchiveOutputStream.java:154) */
        cpioArchiveOutputStream.putNextEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putNextEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
 * @utbot.executesCondition {@code (e.getTime() == -1): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#setFormat(short)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.names.put(e.getName(), e) != null
 *  */
    @Test
    public void testPutNextEntry_ThrowNullPointerException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 4);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -255L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry(CpioArchiveOutputStream.java:164) */
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putNextEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
 * @utbot.executesCondition {@code (e.getTime() == -1): True}
 * @utbot.invokes {@link java.lang.System#currentTimeMillis()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#setTime(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.names.put(e.getName(), e) != null
 *  */
    @Test
    public void testPutNextEntry_ThrowNullPointerException_2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 0);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry(CpioArchiveOutputStream.java:164) */
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method putNextEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putNextEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
 * @utbot.throwsException {@link java.io.IOException} in: ensureOpen();
 *  */
    @Test(expected = IOException.class)
    public void testPutNextEntry_ThrowIOException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closed", true);
        
        cpioArchiveOutputStream.putNextEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putNextEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
 * @utbot.executesCondition {@code (this.cpioEntry != null): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.throwsException {@link java.io.IOException} in: closeArchiveEntry();
 *  */
    @Test(expected = IOException.class)
    public void testPutNextEntry_ThrowIOException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -253L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -254L);
        
        cpioArchiveOutputStream.putNextEntry(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method putNextEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putNextEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
 * @utbot.executesCondition {@code (e.getTime() == -1): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: e.setFormat(this.entryFormat);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPutNextEntry_ThrowIllegalArgumentException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 7);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -255L);
        
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putNextEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
 * @utbot.executesCondition {@code (e.getTime() == -1): True}
 * @utbot.invokes {@link java.lang.System#currentTimeMillis()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#setTime(long)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: e.setFormat(this.entryFormat);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPutNextEntry_ThrowIllegalArgumentException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 7);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method putNextEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    @Test
    public void testPutNextEntry1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 0);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        CpioArchiveEntry initialCpioArchiveOutputStreamCpioEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry"));
        
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
        
        CpioArchiveEntry finalCpioArchiveOutputStreamCpioEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry"));
        
        long finalCpioArchiveEntryMtime = ((Long) getFieldValue(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime"));
        
        assertFalse(initialCpioArchiveOutputStreamCpioEntry == finalCpioArchiveOutputStreamCpioEntry);
        
        assertEquals(1790707202948L, finalCpioArchiveEntryMtime);
    }
    
    @Test
    public void testPutNextEntry2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 0);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        CpioArchiveEntry initialCpioArchiveOutputStreamCpioEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry"));
        
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
        
        CpioArchiveEntry finalCpioArchiveOutputStreamCpioEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry"));
        
        assertFalse(initialCpioArchiveOutputStreamCpioEntry == finalCpioArchiveOutputStreamCpioEntry);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method putNextEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    @Test
    public void testPutNextEntry3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", java.lang.Short.MIN_VALUE);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 0L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry(CpioArchiveOutputStream.java:164) */
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutNextEntry4() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 8);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:362)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:189)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry(CpioArchiveOutputStream.java:168) */
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutNextEntry5() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 2);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:180)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry(CpioArchiveOutputStream.java:168) */
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutNextEntry6() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 1);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:176)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry(CpioArchiveOutputStream.java:168) */
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutNextEntry7() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 4);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:184)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry(CpioArchiveOutputStream.java:168) */
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutNextEntry8() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 8);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:362)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:189)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry(CpioArchiveOutputStream.java:168) */
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutNextEntry9() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 4);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:184)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry(CpioArchiveOutputStream.java:168) */
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutNextEntry10() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 2);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:180)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry(CpioArchiveOutputStream.java:168) */
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutNextEntry11() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 1);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:176)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry(CpioArchiveOutputStream.java:168) */
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method putNextEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    @Test(expected = IOException.class)
    public void testPutNextEntry12() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        HashMap names = new HashMap();
        Object object = createInstance("java.lang.Object");
        names.put(null, object);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 0);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
    }
    
    @Test(expected = IOException.class)
    public void testPutNextEntry13() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 1);
        HashMap names = new HashMap();
        Object object = createInstance("java.lang.Object");
        names.put(null, object);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
    }
    
    @Test(expected = IOException.class)
    public void testPutNextEntry14() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 2);
        HashMap names = new HashMap();
        Object object = createInstance("java.lang.Object");
        names.put(null, object);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
    }
    
    @Test(expected = IOException.class)
    public void testPutNextEntry15() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 4);
        HashMap names = new HashMap();
        Object object = createInstance("java.lang.Object");
        names.put(null, object);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
    }
    
    @Test(expected = IOException.class)
    public void testPutNextEntry16() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        HashMap names = new HashMap();
        Object object = createInstance("java.lang.Object");
        names.put(null, object);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 0);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
    }
    
    @Test(expected = IOException.class)
    public void testPutNextEntry17() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 8);
        HashMap names = new HashMap();
        Object object = createInstance("java.lang.Object");
        names.put(null, object);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
    }
    
    @Test(expected = IOException.class)
    public void testPutNextEntry18() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 4);
        HashMap names = new HashMap();
        Object object = createInstance("java.lang.Object");
        names.put(null, object);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
    }
    
    @Test(expected = IOException.class)
    public void testPutNextEntry19() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 2);
        HashMap names = new HashMap();
        Object object = createInstance("java.lang.Object");
        names.put(null, object);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
    }
    
    @Test(expected = IOException.class)
    public void testPutNextEntry20() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 1);
        HashMap names = new HashMap();
        Object object = createInstance("java.lang.Object");
        names.put(null, object);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
    }
    
    @Test(expected = IOException.class)
    public void testPutNextEntry21() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 8);
        HashMap names = new HashMap();
        Object object = createInstance("java.lang.Object");
        names.put(null, object);
        Object object1 = createInstance("java.lang.Object");
        names.put(object1, null);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        
        cpioArchiveOutputStream.putNextEntry(cpioArchiveEntry);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method putNextEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testPutNextEntry22() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 0);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 0L);
        
        cpioArchiveOutputStream.putNextEntry(null);
    }
    ///endregion
    
    ///region Errors report for putNextEntry
    
    public void testPutNextEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeNewEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeNewEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getInode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeAsciiLong(entry.getInode(), 8, 16);
 *  */
    @Test
    public void testWriteNewEntry_ThrowNullPointerException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(CpioArchiveOutputStream.java:196) */
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
    
    ///region OTHER: ERROR SUITE for method writeNewEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    @Test
    public void testWriteNewEntry1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        cpioArchiveEntry.setInode(576460752303423488L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:386)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(CpioArchiveOutputStream.java:196) */
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
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        cpioArchiveEntry.setInode(256L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:386)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(CpioArchiveOutputStream.java:196) */
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
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        cpioArchiveEntry.setInode(1073741824L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:386)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(CpioArchiveOutputStream.java:196) */
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
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        cpioArchiveEntry.setInode(134217728L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:386)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(CpioArchiveOutputStream.java:196) */
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeCString
    
    ///region OTHER: ERROR SUITE for method writeCString(java.lang.String)
    
    @Test
    public void testWriteCString1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeCString] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeCString(CpioArchiveOutputStream.java:390) */
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeOldAsciiEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldAsciiEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getDevice()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: writeAsciiLong(entry.getDevice(), 6, 8);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteOldAsciiEntry_ThrowUnsupportedOperationException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -255);
        
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeOldAsciiEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldAsciiEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getDevice()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeAsciiLong(entry.getDevice(), 6, 8);
 *  */
    @Test
    public void testWriteOldAsciiEntry_ThrowNullPointerException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(CpioArchiveOutputStream.java:215) */
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
    
    ///region OTHER: ERROR SUITE for method writeOldAsciiEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    @Test
    public void testWriteOldAsciiEntry1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 4);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 32L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:386)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(CpioArchiveOutputStream.java:215) */
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
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 131072L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:386)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(CpioArchiveOutputStream.java:215) */
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
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 4);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 536870912L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:386)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(CpioArchiveOutputStream.java:215) */
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
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 4);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 4096L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:386)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(CpioArchiveOutputStream.java:215) */
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong
    
    ///region FUZZER: ERROR SUITE for method writeAsciiLong(long, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeAsciiLong(long,int,int)}
     */
    @Test
    public void testWriteAsciiLongThrowsSIOOBEWithCornerCase() throws Throwable  {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1);
        CpioArchiveOutputStream cpioArchiveOutputStream = new CpioArchiveOutputStream(byteArrayOutputStream);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong] produces [java.lang.StringIndexOutOfBoundsException: start -2147483648, end 1, length 1]
            java.base/java.lang.AbstractStringBuilder.checkRangeSIOOBE(AbstractStringBuilder.java:1810)
            java.base/java.lang.AbstractStringBuilder.substring(AbstractStringBuilder.java:1070)
            java.base/java.lang.StringBuffer.substring(StringBuffer.java:525)
            java.base/java.lang.StringBuffer.substring(StringBuffer.java:507)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:384) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method writeAsciiLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeAsciiLong", longType, intType, intType);
        writeAsciiLongMethod.setAccessible(true);
        java.lang.Object[] writeAsciiLongMethodArguments = new java.lang.Object[3];
        writeAsciiLongMethodArguments[0] = 0L;
        writeAsciiLongMethodArguments[1] = -2147483647;
        writeAsciiLongMethodArguments[2] = -1;
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
            java.base/java.lang.StringBuffer.substring(StringBuffer.java:525)
            java.base/java.lang.StringBuffer.substring(StringBuffer.java:507)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:384) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method writeAsciiLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeAsciiLong", longType, intType, intType);
        writeAsciiLongMethod.setAccessible(true);
        java.lang.Object[] writeAsciiLongMethodArguments = new java.lang.Object[3];
        writeAsciiLongMethodArguments[0] = 0L;
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
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:386) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method writeAsciiLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeAsciiLong", longType, intType, intType);
        writeAsciiLongMethod.setAccessible(true);
        java.lang.Object[] writeAsciiLongMethodArguments = new java.lang.Object[3];
        writeAsciiLongMethodArguments[0] = 536870912L;
        writeAsciiLongMethodArguments[1] = 0;
        writeAsciiLongMethodArguments[2] = 16;
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
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:386) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method writeAsciiLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeAsciiLong", longType, intType, intType);
        writeAsciiLongMethod.setAccessible(true);
        java.lang.Object[] writeAsciiLongMethodArguments = new java.lang.Object[3];
        writeAsciiLongMethodArguments[0] = 137438953472L;
        writeAsciiLongMethodArguments[1] = 0;
        writeAsciiLongMethodArguments[2] = 8;
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
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:386) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method writeAsciiLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeAsciiLong", longType, intType, intType);
        writeAsciiLongMethod.setAccessible(true);
        java.lang.Object[] writeAsciiLongMethodArguments = new java.lang.Object[3];
        writeAsciiLongMethodArguments[0] = 0L;
        writeAsciiLongMethodArguments[1] = 0;
        writeAsciiLongMethodArguments[2] = 0;
        try {
            writeAsciiLongMethod.invoke(cpioArchiveOutputStream, writeAsciiLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: this.putNextEntry((CpioArchiveEntry) entry);
 *  */
    @Test
    public void testPutArchiveEntry_ThrowClassCastException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.ClassCastException: class org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to class org.apache.commons.compress.archivers.cpio.CpioArchiveEntry (org.apache.commons.compress.archivers.tar.TarArchiveEntry and org.apache.commons.compress.archivers.cpio.CpioArchiveEntry are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:402) */
        cpioArchiveOutputStream.putArchiveEntry(tarArchiveEntry);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.io.IOException} in: this.putNextEntry((CpioArchiveEntry) entry);
 *  */
    @Test(expected = IOException.class)
    public void testPutArchiveEntry_ThrowIOException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closed", true);
        
        cpioArchiveOutputStream.putArchiveEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.io.IOException} in: this.putNextEntry((CpioArchiveEntry) entry);
 *  */
    @Test(expected = IOException.class)
    public void testPutArchiveEntry_ThrowIOException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -253L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -254L);
        
        cpioArchiveOutputStream.putArchiveEntry(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: this.putNextEntry((CpioArchiveEntry) entry);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPutArchiveEntry_ThrowIllegalArgumentException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 5);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: this.putNextEntry((CpioArchiveEntry) entry);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPutArchiveEntry_ThrowIllegalArgumentException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 10);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    @Test
    public void testPutArchiveEntry1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 0);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        CpioArchiveEntry initialCpioArchiveOutputStreamCpioEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry"));
        
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
        
        CpioArchiveEntry finalCpioArchiveOutputStreamCpioEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry"));
        
        assertFalse(initialCpioArchiveOutputStreamCpioEntry == finalCpioArchiveOutputStreamCpioEntry);
    }
    
    @Test
    public void testPutArchiveEntry2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 0);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        CpioArchiveEntry initialCpioArchiveOutputStreamCpioEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry"));
        
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
        
        CpioArchiveEntry finalCpioArchiveOutputStreamCpioEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry"));
        
        long finalCpioArchiveEntryMtime = ((Long) getFieldValue(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime"));
        
        assertFalse(initialCpioArchiveOutputStreamCpioEntry == finalCpioArchiveOutputStreamCpioEntry);
        
        assertEquals(1790707181788L, finalCpioArchiveEntryMtime);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    @Test
    public void testPutArchiveEntry3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 1);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:176)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry(CpioArchiveOutputStream.java:168)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:402) */
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutArchiveEntry4() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 8);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:362)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:189)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry(CpioArchiveOutputStream.java:168)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:402) */
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutArchiveEntry5() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 4);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:184)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry(CpioArchiveOutputStream.java:168)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:402) */
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutArchiveEntry6() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 2);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:180)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry(CpioArchiveOutputStream.java:168)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:402) */
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutArchiveEntry7() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 1);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:176)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry(CpioArchiveOutputStream.java:168)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:402) */
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutArchiveEntry8() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 4);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:184)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry(CpioArchiveOutputStream.java:168)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:402) */
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutArchiveEntry9() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 8);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:362)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:189)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry(CpioArchiveOutputStream.java:168)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:402) */
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutArchiveEntry10() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 2);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:180)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry(CpioArchiveOutputStream.java:168)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:402) */
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutArchiveEntry11() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 8);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:362)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:189)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry(CpioArchiveOutputStream.java:168)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:402) */
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutArchiveEntry12() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 4);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:184)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry(CpioArchiveOutputStream.java:168)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:402) */
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    @Test(expected = IOException.class)
    public void testPutArchiveEntry13() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 4);
        HashMap names = new HashMap();
        Object object = createInstance("java.lang.Object");
        names.put(null, object);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    @Test(expected = IOException.class)
    public void testPutArchiveEntry14() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 2);
        HashMap names = new HashMap();
        Object object = createInstance("java.lang.Object");
        names.put(null, object);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    @Test(expected = IOException.class)
    public void testPutArchiveEntry15() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 8);
        HashMap names = new HashMap();
        Object object = createInstance("java.lang.Object");
        names.put(null, object);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    @Test(expected = IOException.class)
    public void testPutArchiveEntry16() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 4);
        HashMap names = new HashMap();
        Object object = createInstance("java.lang.Object");
        names.put(null, object);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    @Test(expected = IOException.class)
    public void testPutArchiveEntry17() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 1);
        HashMap names = new HashMap();
        Object object = createInstance("java.lang.Object");
        names.put(null, object);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "headerSize", 0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeBinaryLong(long, int, boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioUtil#long2byteArray(long,int,boolean)}
 * @utbot.invokes {@link java.io.OutputStream#write(byte[])}
 *  */
    @Test
    public void testWriteBinaryLong_OutputStreamWrite() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = new byte[40];
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        setField(out, "java.io.BufferedOutputStream", "count", 7);
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
        
        OutputStream cpioArchiveOutputStreamOut = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        byte[] cpioArchiveOutputStreamOutOutBuf = ((byte[]) getFieldValue(cpioArchiveOutputStreamOut, "java.io.BufferedOutputStream", "buf"));
        byte finalCpioArchiveOutputStreamOutBuf7 = ((Byte) get(cpioArchiveOutputStreamOutOutBuf, 7));
        OutputStream cpioArchiveOutputStreamOut1 = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        byte[] cpioArchiveOutputStreamOut1OutBuf = ((byte[]) getFieldValue(cpioArchiveOutputStreamOut1, "java.io.BufferedOutputStream", "buf"));
        byte finalCpioArchiveOutputStreamOutBuf8 = ((Byte) get(cpioArchiveOutputStreamOut1OutBuf, 8));
        OutputStream cpioArchiveOutputStreamOut2 = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        int finalCpioArchiveOutputStreamOutCount = ((Integer) getFieldValue(cpioArchiveOutputStreamOut2, "java.io.BufferedOutputStream", "count"));
        
        assertEquals((byte) -1, finalCpioArchiveOutputStreamOutBuf7);
        
        assertEquals((byte) 1, finalCpioArchiveOutputStreamOutBuf8);
        
        assertEquals(9, finalCpioArchiveOutputStreamOutCount);
    }
    ///endregion
    
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
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: out.write(tmp);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteBinaryLong_ThrowIndexOutOfBoundsException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        setField(out, "java.io.BufferedOutputStream", "count", 536870912);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
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
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: out.write(tmp);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteBinaryLong_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
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
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: out.write(tmp);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteBinaryLong_ThrowIndexOutOfBoundsException_2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
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
        writeBinaryLongMethodArguments[2] = false;
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
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
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
 * @utbot.throwsException {@link java.io.IOException} in: out.write(tmp);
 *  */
    @Test(expected = IOException.class)
    public void testWriteBinaryLong_ThrowIOException_1() throws Throwable  {
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
 * @utbot.throwsException {@link java.io.IOException} in: out.write(tmp);
 *  */
    @Test(expected = IOException.class)
    public void testWriteBinaryLong_ThrowIOException_2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
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
    public void testWriteBinaryLong_ThrowIOException_3() throws Throwable  {
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
    public void testWriteBinaryLong_ThrowIOException_4() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        setField(out, "java.io.BufferedOutputStream", "count", 1);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
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
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
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
    public void testWriteBinaryLong_ThrowIOException_6() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
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
    public void testWriteBinaryLong_ThrowIOException_7() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
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
            org.apache.commons.compress.archivers.cpio.CpioUtil.long2byteArray(CpioUtil.java:73)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:361) */
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
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:362) */
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
    public void testWriteBinaryLong_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 2 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:362) */
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
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:362) */
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
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} 
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testWriteBinaryLong_ThrowOutOfMemoryError() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ByteArrayOutputStream out1 = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[21];
        setField(out1, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out1, "java.io.ByteArrayOutputStream", "count", -2147483642);
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(tmp);
 *  */
    @Test
    public void testWriteBinaryLong_ThrowNullPointerException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:362) */
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
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1073740801);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:362) */
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
    
    ///region FUZZER: TIMEOUTS for method writeBinaryLong(long, int, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
     */
    @Test(timeout = 1000L)
    public void testWriteBinaryLong() throws Throwable  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        CpioArchiveOutputStream cpioArchiveOutputStream = new CpioArchiveOutputStream(filterOutputStream);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = 1L;
        writeBinaryLongMethodArguments[1] = 67108864;
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
        // 39 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // $r7 not found in the locals
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): True}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_CRC) == FORMAT_NEW_CRC): False}
 *  */
    @Test
    public void testCloseArchiveEntry_ThisCpioEntryGetFormatBitwiseOrFORMAT_NEW_CRCNotEqualsFORMAT_NEW_CRC() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 1);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -252L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -252L);
        
        cpioArchiveOutputStream.closeArchiveEntry();
        
        CpioArchiveEntry finalCpioArchiveOutputStreamCpioEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry"));
        long finalCpioArchiveOutputStreamWritten = ((Long) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written"));
        
        assertNull(finalCpioArchiveOutputStreamCpioEntry);
        
        assertEquals(0L, finalCpioArchiveOutputStreamWritten);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): True}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_CRC) == FORMAT_NEW_CRC): True}
 * @utbot.executesCondition {@code (this.crc != this.cpioEntry.getChksum()): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getChksum()}
 *  */
    @Test
    public void testCloseArchiveEntry_ThisCrcEqualsThisCpioEntryGetChksum() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        cpioEntry.setChksum(-255L);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -252L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", -255L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -252L);
        
        cpioArchiveOutputStream.closeArchiveEntry();
        
        CpioArchiveEntry finalCpioArchiveOutputStreamCpioEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry"));
        long finalCpioArchiveOutputStreamCrc = ((Long) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc"));
        long finalCpioArchiveOutputStreamWritten = ((Long) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written"));
        
        assertNull(finalCpioArchiveOutputStreamCpioEntry);
        
        assertEquals(0L, finalCpioArchiveOutputStreamCrc);
        
        assertEquals(0L, finalCpioArchiveOutputStreamWritten);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_OLD_BINARY) == FORMAT_OLD_BINARY): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_CRC) == FORMAT_NEW_CRC): False}
 *  */
    @Test
    public void testCloseArchiveEntry_ThisCpioEntryGetFormatBitwiseOrFORMAT_OLD_BINARYNotEqualsFORMAT_OLD_BINARY() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -255);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -255L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -255L);
        
        cpioArchiveOutputStream.closeArchiveEntry();
        
        CpioArchiveEntry finalCpioArchiveOutputStreamCpioEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry"));
        long finalCpioArchiveOutputStreamWritten = ((Long) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written"));
        
        assertNull(finalCpioArchiveOutputStreamCpioEntry);
        
        assertEquals(0L, finalCpioArchiveOutputStreamWritten);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_OLD_BINARY) == FORMAT_OLD_BINARY): True}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_CRC) == FORMAT_NEW_CRC): False}
 *  */
    @Test
    public void testCloseArchiveEntry_ThisCpioEntryGetFormatBitwiseOrFORMAT_NEW_CRCNotEqualsFORMAT_NEW_CRC_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 8);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -254L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -254L);
        
        cpioArchiveOutputStream.closeArchiveEntry();
        
        CpioArchiveEntry finalCpioArchiveOutputStreamCpioEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry"));
        long finalCpioArchiveOutputStreamWritten = ((Long) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written"));
        
        assertNull(finalCpioArchiveOutputStreamCpioEntry);
        
        assertEquals(0L, finalCpioArchiveOutputStreamWritten);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_OLD_BINARY) == FORMAT_OLD_BINARY): True}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_CRC) == FORMAT_NEW_CRC): False}
 *  */
    @Test
    public void testCloseArchiveEntry_ThisCpioEntryGetFormatBitwiseOrFORMAT_NEW_CRCNotEqualsFORMAT_NEW_CRC_2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 8);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ByteArrayOutputStream out1 = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0};
        setField(out1, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.closeArchiveEntry();
        
        CpioArchiveEntry finalCpioArchiveOutputStreamCpioEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry"));
        long finalCpioArchiveOutputStreamWritten = ((Long) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written"));
        OutputStream cpioArchiveOutputStreamOut = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        Object cpioArchiveOutputStreamOutOutBout = getFieldValue(cpioArchiveOutputStreamOut, "java.io.ObjectOutputStream", "bout");
        OutputStream cpioArchiveOutputStreamOutOutBoutOutBoutOut = ((OutputStream) getFieldValue(cpioArchiveOutputStreamOutOutBout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out"));
        int finalCpioArchiveOutputStreamOutBoutOutCount = ((Integer) getFieldValue(cpioArchiveOutputStreamOutOutBoutOutBoutOut, "java.io.ByteArrayOutputStream", "count"));
        
        assertNull(finalCpioArchiveOutputStreamCpioEntry);
        
        assertEquals(0L, finalCpioArchiveOutputStreamWritten);
        
        assertEquals(1, finalCpioArchiveOutputStreamOutBoutOutCount);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.cpioEntry.getSize() != this.written): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pad(this.cpioEntry.getSize(), 4);
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 1);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 2L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 2L);
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = new byte[32];
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        setField(out, "java.io.BufferedOutputStream", "count", -1073741793);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1073741793 out of bounds for byte[32]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.BufferedOutputStream.write(BufferedOutputStream.java:129)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:355)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry(CpioArchiveOutputStream.java:259) */
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.cpioEntry.getSize() != this.written): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: pad(this.cpioEntry.getSize(), 4);
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowIndexOutOfBoundsException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 1);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 2L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 2L);
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        setField(out, "java.io.BufferedOutputStream", "count", 1);
        ObjectOutputStream out1 = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry] produces [java.lang.IndexOutOfBoundsException]
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:716)
            java.base/java.io.BufferedOutputStream.flushBuffer(BufferedOutputStream.java:81)
            java.base/java.io.BufferedOutputStream.write(BufferedOutputStream.java:122)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:355)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry(CpioArchiveOutputStream.java:259) */
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.cpioEntry.getSize() != this.written): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_OLD_BINARY) == FORMAT_OLD_BINARY): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pad(this.cpioEntry.getSize(), 2);
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 8);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1073740800);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1073740800 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:355)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry(CpioArchiveOutputStream.java:261) */
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.cpioEntry.getSize() != this.written): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_OLD_BINARY) == FORMAT_OLD_BINARY): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 8);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:355)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry(CpioArchiveOutputStream.java:261) */
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.cpioEntry.getSize() != this.written): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_OLD_BINARY) == FORMAT_OLD_BINARY): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 8);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:355)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry(CpioArchiveOutputStream.java:261) */
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.cpioEntry.getSize() != this.written): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_OLD_BINARY) == FORMAT_OLD_BINARY): True}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} 
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testCloseArchiveEntry_ThrowOutOfMemoryError() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 8);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ByteArrayOutputStream out1 = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(out1, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out1, "java.io.ByteArrayOutputStream", "count", 2147483644);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.cpioEntry.getSize() != this.written): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_OLD_BINARY) == FORMAT_OLD_BINARY): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 8);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 4);
        ByteArrayOutputStream out1 = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf1 = {(byte) 0, (byte) 0};
        setField(out1, "java.io.ByteArrayOutputStream", "buf", buf1);
        setField(out1, "java.io.ByteArrayOutputStream", "count", -1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[4]]
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1860)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:355)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry(CpioArchiveOutputStream.java:261) */
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.cpioEntry.getSize() != this.written
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowNullPointerException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry(CpioArchiveOutputStream.java:253) */
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.cpioEntry.getSize() != this.written): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pad(this.cpioEntry.getSize(), 4);
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowNullPointerException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 0);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 2L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 2L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:355)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry(CpioArchiveOutputStream.java:259) */
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.cpioEntry.getSize() != this.written): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_OLD_BINARY) == FORMAT_OLD_BINARY): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pad(this.cpioEntry.getSize(), 2);
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowNullPointerException_2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 8);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:355)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry(CpioArchiveOutputStream.java:261) */
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.throwsException {@link java.io.IOException} in: ensureOpen();
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closed", true);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.cpioEntry.getSize() != this.written): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getSize()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.io.IOException} in: this.cpioEntry.getSize()
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -253L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -254L);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.cpioEntry.getSize() != this.written): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): True}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_CRC) == FORMAT_NEW_CRC): True}
 * @utbot.executesCondition {@code (this.crc != this.cpioEntry.getChksum()): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getChksum()}
 * @utbot.throwsException {@link java.io.IOException} when: this.crc != this.cpioEntry.getChksum()
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        cpioEntry.setChksum(-254L);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -252L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", -253L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -252L);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.cpioEntry.getSize() != this.written): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_OLD_BINARY) == FORMAT_OLD_BINARY): True}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_CRC) == FORMAT_NEW_CRC): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 8);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        FileOutputStream out = ((FileOutputStream) createInstance("java.io.FileOutputStream"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(out, "java.io.FileOutputStream", "fd", fd);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.cpioEntry.getSize() != this.written): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): True}
 * @utbot.throwsException {@link java.io.IOException} in: pad(this.cpioEntry.getSize(), 4);
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_4() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 0);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 2L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 2L);
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
 * @utbot.executesCondition {@code (this.cpioEntry.getSize() != this.written): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): True}
 * @utbot.throwsException {@link java.io.IOException} in: pad(this.cpioEntry.getSize(), 4);
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_5() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 0);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 2L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 2L);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.cpioEntry.getSize() != this.written): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_OLD_BINARY) == FORMAT_OLD_BINARY): True}
 * @utbot.throwsException {@link java.io.IOException} in: pad(this.cpioEntry.getSize(), 2);
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_6() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 8);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.cpioEntry.getSize() != this.written): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_OLD_BINARY) == FORMAT_OLD_BINARY): True}
 * @utbot.throwsException {@link java.io.IOException} in: pad(this.cpioEntry.getSize(), 2);
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_7() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 8);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.cpioEntry.getSize() != this.written): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): True}
 * @utbot.throwsException {@link java.io.IOException} in: pad(this.cpioEntry.getSize(), 4);
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_8() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 0);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 2L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 2L);
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.cpioEntry.getSize() != this.written): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_9() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 1);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 3L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 3L);
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = new byte[32];
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        setField(out, "java.io.BufferedOutputStream", "count", 34);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.cpioEntry.getSize() != this.written): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): True}
 * @utbot.throwsException {@link java.io.IOException} in: pad(this.cpioEntry.getSize(), 4);
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_10() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 1);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 3L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 3L);
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = new byte[32];
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        setField(out, "java.io.BufferedOutputStream", "count", 34);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.cpioEntry.getSize() != this.written): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): True}
 * @utbot.throwsException {@link java.io.IOException} in: pad(this.cpioEntry.getSize(), 4);
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_11() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 0);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 2L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 2L);
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.cpioEntry.getSize() != this.written): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_OLD_BINARY) == FORMAT_OLD_BINARY): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_12() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 8);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
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
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.cpioEntry.getSize() != this.written): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_OLD_BINARY) == FORMAT_OLD_BINARY): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_13() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 8);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
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
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.cpioEntry.getSize() != this.written): False}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_MASK) == FORMAT_NEW_MASK): True}
 * @utbot.executesCondition {@code ((this.cpioEntry.getFormat() | FORMAT_NEW_CRC) == FORMAT_NEW_CRC): True}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#ensureOpen()
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getSize()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getFormat()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getSize()}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(long,int)
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getFormat()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getChksum()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: this.crc != this.cpioEntry.getChksum()
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCloseArchiveEntry_ThrowUnsupportedOperationException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 0);
        setField(cpioEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -252L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "cpioEntry", cpioEntry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", -255L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -252L);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    ///endregion
    
    ///region Errors report for closeArchiveEntry
    
    public void testCloseArchiveEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 15 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        // $r7 not found in the locals
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry, boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: writeBinaryLong(entry.getDevice(), 2, swapHalfWord);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteOldBinaryEntry_ThrowUnsupportedOperationException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -255);
        
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
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteOldBinaryEntry_ThrowIndexOutOfBoundsException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        setField(out, "java.io.BufferedOutputStream", "count", 1610612736);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
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
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: writeBinaryLong(entry.getDevice(), 2, swapHalfWord);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteOldBinaryEntry_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry, boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: writeBinaryLong(entry.getDevice(), 2, swapHalfWord);
 *  */
    @Test(expected = IOException.class)
    public void testWriteOldBinaryEntry_ThrowIOException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
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
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: writeBinaryLong(entry.getDevice(), 2, swapHalfWord);
 *  */
    @Test(expected = IOException.class)
    public void testWriteOldBinaryEntry_ThrowIOException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
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
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: writeBinaryLong(entry.getDevice(), 2, swapHalfWord);
 *  */
    @Test(expected = IOException.class)
    public void testWriteOldBinaryEntry_ThrowIOException_2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
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
 * @utbot.throwsException {@link java.io.IOException} in: writeBinaryLong(entry.getDevice(), 2, swapHalfWord);
 *  */
    @Test(expected = IOException.class)
    public void testWriteOldBinaryEntry_ThrowIOException_3() throws Throwable  {
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
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
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
 * @utbot.throwsException {@link java.io.IOException} in: writeBinaryLong(entry.getDevice(), 2, swapHalfWord);
 *  */
    @Test(expected = IOException.class)
    public void testWriteOldBinaryEntry_ThrowIOException_4() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
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
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: writeBinaryLong(entry.getDevice(), 2, swapHalfWord);
 *  */
    @Test(expected = IOException.class)
    public void testWriteOldBinaryEntry_ThrowIOException_5() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
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
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: writeBinaryLong(entry.getDevice(), 2, swapHalfWord);
 *  */
    @Test(expected = IOException.class)
    public void testWriteOldBinaryEntry_ThrowIOException_6() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = new byte[32];
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        setField(out, "java.io.BufferedOutputStream", "count", 31);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
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
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteOldBinaryEntry_ThrowIOException_7() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
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
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
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
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteOldBinaryEntry_ThrowIOException_8() throws Throwable  {
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
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
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
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteOldBinaryEntry_ThrowIOException_9() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry, boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeBinaryLong(entry.getDevice(), 2, swapHalfWord);
 *  */
    @Test
    public void testWriteOldBinaryEntry_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -2147482625);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2147482625 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:362)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(CpioArchiveOutputStream.java:230) */
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
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:362)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(CpioArchiveOutputStream.java:230) */
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
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteOldBinaryEntry_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
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
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:362)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(CpioArchiveOutputStream.java:230) */
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
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} 
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testWriteOldBinaryEntry_ThrowOutOfMemoryError() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ByteArrayOutputStream out1 = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[34];
        setField(out1, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out1, "java.io.ByteArrayOutputStream", "count", -2147483644);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -246);
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
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeBinaryLong(entry.getDevice(), 2, swapHalfWord);
 *  */
    @Test
    public void testWriteOldBinaryEntry_ThrowNullPointerException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(CpioArchiveOutputStream.java:230) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeBinaryLong(entry.getDevice(), 2, swapHalfWord);
 *  */
    @Test
    public void testWriteOldBinaryEntry_ThrowNullPointerException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:362)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(CpioArchiveOutputStream.java:230) */
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
        // 34 occurrences of:
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
        
                java.lang.reflect.Method methodForGetDeclaredFields968078887613900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields968078887613900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass968078887617900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields968078887613900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass968078887617900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields968078888063000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields968078888063000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass968078888064400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields968078888063000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass968078888064400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


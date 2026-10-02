package org.apache.commons.compress.compressors.deflate;

import org.junit.Test;
import java.util.jar.JarInputStream;
import sun.security.util.ManifestEntryVerifier;
import sun.net.www.http.PosterOutputStream;
import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.LinkedHashMap;
import java.util.jar.JarEntry;
import java.util.Hashtable;
import java.io.IOException;
import java.security.CodeSigner;
import java.util.zip.ZipException;
import org.apache.commons.compress.utils.BoundedInputStream;
import java.security.cert.Certificate;
import java.util.HashMap;
import java.util.zip.InflaterInputStream;
import java.util.zip.CheckedInputStream;
import java.util.zip.Inflater;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipEntry;
import java.io.DataInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_compress_compressors_deflate_DeflateCompressorInputStreamTest {
    ///region Test suites for executable org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.read
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.CompressorInputStream", "bytesRead", 0L);
        byte[] byteArray = {};
        
        int actual = deflateCompressorInputStream.read(byteArray, 0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_1() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        int actual = deflateCompressorInputStream.read(null, -255, -255);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_2() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.CompressorInputStream", "bytesRead", 0L);
        byte[] byteArray = {};
        
        int actual = deflateCompressorInputStream.read(byteArray, 0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_3() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        PosterOutputStream baos = ((PosterOutputStream) createInstance("sun.net.www.http.PosterOutputStream"));
        setField(baos, "sun.net.www.http.PosterOutputStream", "closed", true);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.CompressorInputStream", "bytesRead", 0L);
        byte[] byteArray = {};
        
        int actual = deflateCompressorInputStream.read(byteArray, 0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_4() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        int actual = deflateCompressorInputStream.read(null, -255, -255);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_5() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.CompressorInputStream", "bytesRead", 0L);
        byte[] byteArray = {};
        
        int actual = deflateCompressorInputStream.read(byteArray, 0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_6() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        ByteArrayOutputStream baos = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[13];
        setField(baos, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(baos, "java.io.ByteArrayOutputStream", "count", 17);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.CompressorInputStream", "bytesRead", 0L);
        byte[] byteArray = {};
        
        InputStream deflateCompressorInputStreamIn = ((InputStream) getFieldValue(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in"));
        Object deflateCompressorInputStreamInInJv = getFieldValue(deflateCompressorInputStreamIn, "java.util.jar.JarInputStream", "jv");
        ByteArrayOutputStream deflateCompressorInputStreamInInJvInJvBaos = ((ByteArrayOutputStream) getFieldValue(deflateCompressorInputStreamInInJv, "java.util.jar.JarVerifier", "baos"));
        byte[] initialDeflateCompressorInputStreamInJvBaosBuf = ((byte[]) getFieldValue(deflateCompressorInputStreamInInJvInJvBaos, "java.io.ByteArrayOutputStream", "buf"));
        
        int actual = deflateCompressorInputStream.read(byteArray, 0, 0);
        
        assertEquals(0, actual);
        
        InputStream deflateCompressorInputStreamIn1 = ((InputStream) getFieldValue(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in"));
        Object deflateCompressorInputStreamIn1InJv = getFieldValue(deflateCompressorInputStreamIn1, "java.util.jar.JarInputStream", "jv");
        ByteArrayOutputStream deflateCompressorInputStreamIn1InJvInJvBaos = ((ByteArrayOutputStream) getFieldValue(deflateCompressorInputStreamIn1InJv, "java.util.jar.JarVerifier", "baos"));
        byte[] finalDeflateCompressorInputStreamInJvBaosBuf = ((byte[]) getFieldValue(deflateCompressorInputStreamIn1InJvInJvBaos, "java.io.ByteArrayOutputStream", "buf"));
        
        assertFalse(initialDeflateCompressorInputStreamInJvBaosBuf == finalDeflateCompressorInputStreamInJvBaosBuf);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_7() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        int actual = deflateCompressorInputStream.read(null, -255, -255);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read(byte[],int,int)}
 * @utbot.invokes {@link java.io.InputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} 
 *  */
    @Test
    public void testRead_ThrowArithmeticException() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        Hashtable sigFileSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(sigFileSigners, "java.util.Hashtable", "table", table);
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
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
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        /* This test fails because method [org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.read] produces [java.lang.ArithmeticException: / by zero] */
        deflateCompressorInputStream.read(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read(byte[],int,int)}
 * @utbot.invokes {@link java.io.InputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int ret = in.read(buf, off, len);
 *  */
    @Test
    public void testRead_ThrowNullPointerException() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.read] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.read(DeflateCompressorInputStream.java:70) */
        deflateCompressorInputStream.read(null, -255, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: int ret = in.read(buf, off, len);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        byte[] byteArray = {(byte) -127};
        
        deflateCompressorInputStream.read(byteArray, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} 
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testRead_ThrowOutOfMemoryError() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        ByteArrayOutputStream baos = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[32];
        setField(baos, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(baos, "java.io.ByteArrayOutputStream", "count", -2147483645);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        byte[] byteArray = {};
        
        deflateCompressorInputStream.read(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.SecurityException} 
 *  */
    @Test(expected = SecurityException.class)
    public void testRead_ThrowSecurityException() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        Hashtable sigFileSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.read(null, -255, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: int ret = in.read(buf, off, len);
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.read(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_1() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 1L);
        Object in1 = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        deflateCompressorInputStream.read(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: int ret = in.read(buf, off, len);
 *  */
    @Test(expected = ZipException.class)
    public void testRead_ThrowZipException() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 1L);
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in1, "java.util.jar.JarInputStream", "first", entry);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in1, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        Object entry1 = createInstance("java.util.jar.JarFile$JarFileEntry");
        java.security.CodeSigner[] signers = {null};
        setField(entry1, "java.util.jar.JarEntry", "signers", signers);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry1);
        setField(in1, "java.util.jar.JarInputStream", "mev", mev);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        byte[] byteArray = {(byte) -127};
        
        deflateCompressorInputStream.read(byteArray, 0, 1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method read([B, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read(byte[],int,int)}
     */
    @Test
    public void testReadThrowsIOOBEWithNonEmptyPrimitiveArrayAndCornerCase() throws IOException  {
        BoundedInputStream boundedInputStream = new BoundedInputStream(null, 1L);
        DeflateParameters deflateParameters = new DeflateParameters();
        deflateParameters.setCompressionLevel(Integer.MAX_VALUE);
        DeflateCompressorInputStream deflateCompressorInputStream = new DeflateCompressorInputStream(boundedInputStream, deflateParameters);
        byte[] byteArray = {(byte) 1, java.lang.Byte.MAX_VALUE};
        
        /* This test fails because method [org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.read] produces [java.lang.IndexOutOfBoundsException]
            java.base/java.util.zip.InflaterInputStream.read(InflaterInputStream.java:146)
            org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.read(DeflateCompressorInputStream.java:70) */
        deflateCompressorInputStream.read(byteArray, Integer.MAX_VALUE, 1);
    }
    ///endregion
    
    ///region Errors report for read
    
    public void testRead_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.read
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method read()
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet1() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.CompressorInputStream", "bytesRead", 0L);
        
        int actual = deflateCompressorInputStream.read();
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_11() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.CompressorInputStream", "bytesRead", 0L);
        
        int actual = deflateCompressorInputStream.read();
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_21() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.CompressorInputStream", "bytesRead", 0L);
        
        int actual = deflateCompressorInputStream.read();
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_31() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        java.security.cert.Certificate[] certs = {null};
        setField(first, "java.util.jar.JarEntry", "certs", certs);
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
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
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        java.security.CodeSigner[] signers = {};
        setField(mev, "sun.security.util.ManifestEntryVerifier", "signers", signers);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        byte[] singleByteBuf = {(byte) 0};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.CompressorInputStream", "bytesRead", 0L);
        
        InputStream deflateCompressorInputStreamIn = ((InputStream) getFieldValue(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in"));
        JarEntry deflateCompressorInputStreamInInFirst = ((JarEntry) getFieldValue(deflateCompressorInputStreamIn, "java.util.jar.JarInputStream", "first"));
        java.security.cert.Certificate[] initialDeflateCompressorInputStreamInFirstCerts = ((java.security.cert.Certificate[]) getFieldValue(deflateCompressorInputStreamInInFirst, "java.util.jar.JarEntry", "certs"));
        InputStream deflateCompressorInputStreamIn1 = ((InputStream) getFieldValue(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in"));
        JarEntry deflateCompressorInputStreamIn1InFirst = ((JarEntry) getFieldValue(deflateCompressorInputStreamIn1, "java.util.jar.JarInputStream", "first"));
        java.security.CodeSigner[] initialDeflateCompressorInputStreamInFirstSigners = ((java.security.CodeSigner[]) getFieldValue(deflateCompressorInputStreamIn1InFirst, "java.util.jar.JarEntry", "signers"));
        
        int actual = deflateCompressorInputStream.read();
        
        assertEquals(-1, actual);
        
        InputStream deflateCompressorInputStreamIn2 = ((InputStream) getFieldValue(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in"));
        JarEntry deflateCompressorInputStreamIn2InFirst = ((JarEntry) getFieldValue(deflateCompressorInputStreamIn2, "java.util.jar.JarInputStream", "first"));
        java.security.cert.Certificate[] finalDeflateCompressorInputStreamInFirstCerts = ((java.security.cert.Certificate[]) getFieldValue(deflateCompressorInputStreamIn2InFirst, "java.util.jar.JarEntry", "certs"));
        InputStream deflateCompressorInputStreamIn3 = ((InputStream) getFieldValue(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in"));
        JarEntry deflateCompressorInputStreamIn3InFirst = ((JarEntry) getFieldValue(deflateCompressorInputStreamIn3, "java.util.jar.JarInputStream", "first"));
        java.security.CodeSigner[] finalDeflateCompressorInputStreamInFirstSigners = ((java.security.CodeSigner[]) getFieldValue(deflateCompressorInputStreamIn3InFirst, "java.util.jar.JarEntry", "signers"));
        
        assertFalse(initialDeflateCompressorInputStreamInFirstCerts == finalDeflateCompressorInputStreamInFirstCerts);
        
        assertFalse(initialDeflateCompressorInputStreamInFirstSigners == finalDeflateCompressorInputStreamInFirstSigners);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read()
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} 
 *  */
    @Test
    public void testRead_ThrowArithmeticException1() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        Hashtable sigFileSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(sigFileSigners, "java.util.Hashtable", "table", table);
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
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
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        byte[] singleByteBuf = {(byte) 0};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        /* This test fails because method [org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.read] produces [java.lang.ArithmeticException: / by zero] */
        deflateCompressorInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testRead_ThrowClassCastException() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        Object object = createInstance("java.lang.Object");
        map.put(null, object);
        setField(verifiedSigners, "java.util.Properties", "map", map);
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", verifiedSigners);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
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
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        byte[] singleByteBuf = {(byte) 0};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        /* This test fails because method [org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.read] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.security.CodeSigner[]] */
        deflateCompressorInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read()}
 * @utbot.invokes {@link java.io.InputStream#read()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int ret = in.read();
 *  */
    @Test
    public void testRead_ThrowNullPointerException1() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.read] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.read(DeflateCompressorInputStream.java:62) */
        deflateCompressorInputStream.read();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method read()
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read()}
 * @utbot.throwsException {@link java.io.IOException} in: int ret = in.read();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException1() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read()}
 * @utbot.throwsException {@link java.io.IOException} in: int ret = in.read();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_11() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read()}
 * @utbot.throwsException {@link java.io.IOException} in: int ret = in.read();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_2() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        CheckedInputStream in = ((CheckedInputStream) createInstance("java.util.zip.CheckedInputStream"));
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read()}
 * @utbot.throwsException {@link java.io.IOException} in: int ret = in.read();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_3() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        CheckedInputStream in = ((CheckedInputStream) createInstance("java.util.zip.CheckedInputStream"));
        CheckedInputStream in1 = ((CheckedInputStream) createInstance("java.util.zip.CheckedInputStream"));
        InflaterInputStream in2 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in2, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in1, "java.io.FilterInputStream", "in", in2);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read()}
 * @utbot.throwsException {@link java.io.IOException} in: int ret = in.read();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_4() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 1L);
        byte[] singleByteBuf = {(byte) 0};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        Object in1 = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read()}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: int ret = in.read();
 *  */
    @Test(expected = ZipException.class)
    public void testRead_ThrowZipException1() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 1L);
        byte[] singleByteBuf = {(byte) 0};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in1, "java.util.jar.JarInputStream", "first", first);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.read();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method read()
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: int ret = in.read();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException1() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        byte[] singleByteBuf = {};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read()}
 * @utbot.throwsException {@link java.lang.SecurityException} in: int ret = in.read();
 *  */
    @Test(expected = SecurityException.class)
    public void testRead_ThrowSecurityException1() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Hashtable sigFileSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        byte[] singleByteBuf = {(byte) 0};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int ret = in.read();
 *  */
    @Test(expected = NullPointerException.class)
    public void testRead_ThrowNullPointerException_1() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        CheckedInputStream in = ((CheckedInputStream) createInstance("java.util.zip.CheckedInputStream"));
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.read();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method read()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#read()}
     */
    @Test
    public void testReadThrowsNPE() throws IOException  {
        BoundedInputStream boundedInputStream = new BoundedInputStream(null, java.lang.Long.MIN_VALUE);
        DeflateParameters deflateParameters = new DeflateParameters();
        deflateParameters.setCompressionLevel(0);
        DeflateCompressorInputStream deflateCompressorInputStream = new DeflateCompressorInputStream(boundedInputStream, deflateParameters);
        
        /* This test fails because method [org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.read] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.BoundedInputStream.read(BoundedInputStream.java:62)
            java.base/java.util.zip.InflaterInputStream.fill(InflaterInputStream.java:242)
            java.base/java.util.zip.InflaterInputStream.read(InflaterInputStream.java:158)
            java.base/java.util.zip.InflaterInputStream.read(InflaterInputStream.java:122)
            org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.read(DeflateCompressorInputStream.java:62) */
        deflateCompressorInputStream.read();
    }
    ///endregion
    
    ///region Errors report for read
    
    public void testRead_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 5 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method close()
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#close()}
 *  */
    @Test
    public void testClose() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#close()}
 *  */
    @Test
    public void testClose_1() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.close();
        
        InputStream deflateCompressorInputStreamIn = ((InputStream) getFieldValue(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in"));
        boolean finalDeflateCompressorInputStreamInClosed = ((Boolean) getFieldValue(deflateCompressorInputStreamIn, "java.util.zip.ZipInputStream", "closed"));
        
        assertTrue(finalDeflateCompressorInputStreamInClosed);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#close()}
 *  */
    @Test
    public void testClose_2() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in1, "java.util.zip.ZipInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.close();
        
        InputStream deflateCompressorInputStreamIn = ((InputStream) getFieldValue(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in"));
        boolean finalDeflateCompressorInputStreamInClosed = ((Boolean) getFieldValue(deflateCompressorInputStreamIn, "java.util.zip.ZipInputStream", "closed"));
        InputStream deflateCompressorInputStreamIn1 = ((InputStream) getFieldValue(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in"));
        boolean finalDeflateCompressorInputStreamInClosed1 = ((Boolean) getFieldValue(deflateCompressorInputStreamIn1, "java.util.zip.InflaterInputStream", "closed"));
        
        assertTrue(finalDeflateCompressorInputStreamInClosed);
        
        assertTrue(finalDeflateCompressorInputStreamInClosed1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method close()
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#close()}
 *  */
    @Test
    public void testClose_3() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#close()}
 *  */
    @Test
    public void testClose_4() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.close();
        
        InputStream deflateCompressorInputStreamIn = ((InputStream) getFieldValue(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in"));
        boolean finalDeflateCompressorInputStreamInClosed = ((Boolean) getFieldValue(deflateCompressorInputStreamIn, "java.util.zip.InflaterInputStream", "closed"));
        
        assertTrue(finalDeflateCompressorInputStreamInClosed);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#close()}
 * @utbot.invokes {@link java.io.InputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: in.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.close(DeflateCompressorInputStream.java:90) */
        deflateCompressorInputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#close()}
 * @utbot.invokes {@link java.io.InputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testClose_ThrowNullPointerException_1() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        Object cleanable = createInstance("java.io.FileCleanable");
        Object next = createInstance("java.net.SocketCleanable");
        setField(cleanable, "jdk.internal.ref.PhantomCleanable", "next", next);
        setField(zsRef, "java.util.zip.Inflater$InflaterZStreamRef", "cleanable", cleanable);
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(in, "java.util.zip.InflaterInputStream", "inf", inf);
        setField(in, "java.util.zip.InflaterInputStream", "usesDefaultInflater", true);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.close();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method close()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#close()}
     */
    @Test
    public void testClose1() throws IOException  {
        BoundedInputStream boundedInputStream = new BoundedInputStream(null, 1L);
        DeflateParameters deflateParameters = new DeflateParameters();
        deflateParameters.setCompressionLevel(Integer.MAX_VALUE);
        DeflateCompressorInputStream deflateCompressorInputStream = new DeflateCompressorInputStream(boundedInputStream, deflateParameters);
        
        deflateCompressorInputStream.close();
    }
    ///endregion
    
    ///region Errors report for close
    
    public void testClose_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 35 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 7 occurrences of:
        /* Unable to make field private static final java.util.concurrent.atomic.AtomicInteger sun.net.ResourceManager.numSockets accessible:
        module java.base does not "opens sun.net" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.skip
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method skip(long)
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#skip(long)}
 * @utbot.returnsFrom {@code return in.skip(n);}
 *  */
    @Test
    public void testSkip_ReturnInSkip() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        long actual = deflateCompressorInputStream.skip(0L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#skip(long)}
 * @utbot.returnsFrom {@code return in.skip(n);}
 *  */
    @Test
    public void testSkip_ReturnInSkip_1() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        long actual = deflateCompressorInputStream.skip(0L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#skip(long)}
 * @utbot.returnsFrom {@code return in.skip(n);}
 *  */
    @Test
    public void testSkip_ReturnInSkip_2() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        ZipInputStream in = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        byte[] tmpbuf = {(byte) 0};
        setField(in, "java.util.zip.ZipInputStream", "tmpbuf", tmpbuf);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        long actual = deflateCompressorInputStream.skip(1L);
        
        assertEquals(0L, actual);
        
        InputStream deflateCompressorInputStreamIn = ((InputStream) getFieldValue(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in"));
        boolean finalDeflateCompressorInputStreamInEntryEOF = ((Boolean) getFieldValue(deflateCompressorInputStreamIn, "java.util.zip.ZipInputStream", "entryEOF"));
        
        assertTrue(finalDeflateCompressorInputStreamInEntryEOF);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#skip(long)}
 * @utbot.returnsFrom {@code return in.skip(n);}
 *  */
    @Test
    public void testSkip_ReturnInSkip_3() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        byte[] tmpbuf = {(byte) 0};
        setField(in, "java.util.zip.ZipInputStream", "tmpbuf", tmpbuf);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        long actual = deflateCompressorInputStream.skip(1L);
        
        assertEquals(0L, actual);
        
        InputStream deflateCompressorInputStreamIn = ((InputStream) getFieldValue(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in"));
        boolean finalDeflateCompressorInputStreamInEntryEOF = ((Boolean) getFieldValue(deflateCompressorInputStreamIn, "java.util.zip.ZipInputStream", "entryEOF"));
        
        assertTrue(finalDeflateCompressorInputStreamInEntryEOF);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#skip(long)}
 * @utbot.returnsFrom {@code return in.skip(n);}
 *  */
    @Test
    public void testSkip_ReturnInSkip_4() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 0L);
        byte[] tmpbuf = {(byte) 0};
        setField(in, "java.util.zip.ZipInputStream", "tmpbuf", tmpbuf);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        long actual = deflateCompressorInputStream.skip(1L);
        
        assertEquals(0L, actual);
        
        InputStream deflateCompressorInputStreamIn = ((InputStream) getFieldValue(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in"));
        ZipEntry finalDeflateCompressorInputStreamInEntry = ((ZipEntry) getFieldValue(deflateCompressorInputStreamIn, "java.util.zip.ZipInputStream", "entry"));
        InputStream deflateCompressorInputStreamIn1 = ((InputStream) getFieldValue(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in"));
        boolean finalDeflateCompressorInputStreamInEntryEOF = ((Boolean) getFieldValue(deflateCompressorInputStreamIn1, "java.util.zip.ZipInputStream", "entryEOF"));
        
        assertNull(finalDeflateCompressorInputStreamInEntry);
        
        assertTrue(finalDeflateCompressorInputStreamInEntryEOF);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#skip(long)}
 * @utbot.returnsFrom {@code return in.skip(n);}
 *  */
    @Test
    public void testSkip_ReturnInSkip_5() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        byte[] tmpbuf = {(byte) 0};
        setField(in, "java.util.zip.ZipInputStream", "tmpbuf", tmpbuf);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        long actual = deflateCompressorInputStream.skip(2L);
        
        assertEquals(0L, actual);
        
        InputStream deflateCompressorInputStreamIn = ((InputStream) getFieldValue(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in"));
        boolean finalDeflateCompressorInputStreamInEntryEOF = ((Boolean) getFieldValue(deflateCompressorInputStreamIn, "java.util.zip.ZipInputStream", "entryEOF"));
        
        assertTrue(finalDeflateCompressorInputStreamInEntryEOF);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#skip(long)}
 * @utbot.returnsFrom {@code return in.skip(n);}
 *  */
    @Test
    public void testSkip_ReturnInSkip_6() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        Hashtable verifiedSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        JarEntry entry1 = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.zip.ZipInputStream", "entry", entry1);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 0L);
        byte[] tmpbuf = {(byte) 0};
        setField(in, "java.util.zip.ZipInputStream", "tmpbuf", tmpbuf);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        long actual = deflateCompressorInputStream.skip(1L);
        
        assertEquals(0L, actual);
        
        InputStream deflateCompressorInputStreamIn = ((InputStream) getFieldValue(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in"));
        ZipEntry finalDeflateCompressorInputStreamInEntry = ((ZipEntry) getFieldValue(deflateCompressorInputStreamIn, "java.util.zip.ZipInputStream", "entry"));
        InputStream deflateCompressorInputStreamIn1 = ((InputStream) getFieldValue(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in"));
        boolean finalDeflateCompressorInputStreamInEntryEOF = ((Boolean) getFieldValue(deflateCompressorInputStreamIn1, "java.util.zip.ZipInputStream", "entryEOF"));
        
        assertNull(finalDeflateCompressorInputStreamInEntry);
        
        assertTrue(finalDeflateCompressorInputStreamInEntryEOF);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method skip(long)
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#skip(long)}
 * @utbot.invokes {@link java.io.InputStream#skip(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return in.skip(n);
 *  */
    @Test
    public void testSkip_ThrowNullPointerException() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.skip] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.skip(DeflateCompressorInputStream.java:78) */
        deflateCompressorInputStream.skip(-255L);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method skip(long)
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#skip(long)}
 * @utbot.throwsException {@link java.io.IOException} in: return in.skip(n);
 *  */
    @Test(expected = IOException.class)
    public void testSkip_ThrowIOException() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.skip(0L);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#skip(long)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: return in.skip(n);
 *  */
    @Test(expected = ZipException.class)
    public void testSkip_ThrowZipException() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setMethod(1);
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        byte[] tmpbuf = {(byte) 0};
        setField(in, "java.util.zip.ZipInputStream", "tmpbuf", tmpbuf);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.skip(1L);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#skip(long)}
 * @utbot.throwsException {@link java.io.IOException} in: return in.skip(n);
 *  */
    @Test(expected = IOException.class)
    public void testSkip_ThrowIOException_1() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 1L);
        byte[] tmpbuf = {(byte) 0};
        setField(in, "java.util.zip.ZipInputStream", "tmpbuf", tmpbuf);
        Object in1 = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.skip(1L);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#skip(long)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: return in.skip(n);
 *  */
    @Test(expected = ZipException.class)
    public void testSkip_ThrowZipException_1() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 1L);
        byte[] tmpbuf = {(byte) 0};
        setField(in, "java.util.zip.ZipInputStream", "tmpbuf", tmpbuf);
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in1, "java.util.jar.JarInputStream", "first", first);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.skip(1L);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method skip(long)
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#skip(long)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return in.skip(n);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSkip_ThrowIndexOutOfBoundsException() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        ByteArrayOutputStream baos = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {};
        setField(baos, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(baos, "java.io.ByteArrayOutputStream", "count", -1);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        setField(in, "java.util.zip.ZipInputStream", "tmpbuf", buf);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.skip(1L);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#skip(long)}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} 
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testSkip_ThrowOutOfMemoryError() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        ByteArrayOutputStream baos = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[32];
        setField(baos, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(baos, "java.io.ByteArrayOutputStream", "count", -2147483645);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        byte[] tmpbuf = {};
        setField(in, "java.util.zip.ZipInputStream", "tmpbuf", tmpbuf);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.skip(1L);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#skip(long)}
 * @utbot.throwsException {@link java.lang.SecurityException} in: return in.skip(n);
 *  */
    @Test(expected = SecurityException.class)
    public void testSkip_ThrowSecurityException() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties sigFileSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        byte[] tmpbuf = {};
        setField(in, "java.util.zip.ZipInputStream", "tmpbuf", tmpbuf);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.skip(1L);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method skip(long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#skip(long)}
     */
    @Test
    public void testSkipThrowsNPE() throws IOException  {
        BoundedInputStream boundedInputStream = new BoundedInputStream(null, 1L);
        DeflateParameters deflateParameters = new DeflateParameters();
        deflateParameters.setCompressionLevel(Integer.MAX_VALUE);
        DeflateCompressorInputStream deflateCompressorInputStream = new DeflateCompressorInputStream(boundedInputStream, deflateParameters);
        
        /* This test fails because method [org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.skip] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.BoundedInputStream.read(BoundedInputStream.java:62)
            java.base/java.util.zip.InflaterInputStream.fill(InflaterInputStream.java:242)
            java.base/java.util.zip.InflaterInputStream.read(InflaterInputStream.java:158)
            java.base/java.util.zip.InflaterInputStream.skip(InflaterInputStream.java:212)
            org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.skip(DeflateCompressorInputStream.java:78) */
        deflateCompressorInputStream.skip(1073741825L);
    }
    ///endregion
    
    ///region Errors report for skip
    
    public void testSkip_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 7 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.available
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method available()
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#available()}
 * @utbot.returnsFrom {@code return in.available();}
 *  */
    @Test
    public void testAvailable_ReturnInAvailable() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "entryEOF", true);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        int actual = deflateCompressorInputStream.available();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#available()}
 * @utbot.returnsFrom {@code return in.available();}
 *  */
    @Test
    public void testAvailable_ReturnInAvailable_1() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        DataInputStream in = ((DataInputStream) createInstance("java.io.DataInputStream"));
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        int actual = deflateCompressorInputStream.available();
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#available()}
 * @utbot.returnsFrom {@code return in.available();}
 *  */
    @Test
    public void testAvailable_ReturnInAvailable_2() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        DataInputStream in = ((DataInputStream) createInstance("java.io.DataInputStream"));
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipFile$1"));
        setField(in1, "java.util.zip.InflaterInputStream", "reachEOF", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        int actual = deflateCompressorInputStream.available();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#available()}
 * @utbot.returnsFrom {@code return in.available();}
 *  */
    @Test
    public void testAvailable_ReturnInAvailable_3() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        DataInputStream in = ((DataInputStream) createInstance("java.io.DataInputStream"));
        DataInputStream in1 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        JarInputStream in2 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in2, "java.util.zip.ZipInputStream", "entryEOF", true);
        setField(in1, "java.io.FilterInputStream", "in", in2);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        int actual = deflateCompressorInputStream.available();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#available()}
 * @utbot.returnsFrom {@code return in.available();}
 *  */
    @Test
    public void testAvailable_ReturnInAvailable_4() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipFile$1"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "finished", true);
        setField(in, "java.util.zip.InflaterInputStream", "inf", inf);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        int actual = deflateCompressorInputStream.available();
        
        assertEquals(0, actual);
        
        InputStream deflateCompressorInputStreamIn = ((InputStream) getFieldValue(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in"));
        boolean finalDeflateCompressorInputStreamInReachEOF = ((Boolean) getFieldValue(deflateCompressorInputStreamIn, "java.util.zip.InflaterInputStream", "reachEOF"));
        
        assertTrue(finalDeflateCompressorInputStreamInReachEOF);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method available()
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#available()}
 * @utbot.invokes {@link java.io.InputStream#available()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return in.available();
 *  */
    @Test
    public void testAvailable_ThrowNullPointerException() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.available] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.available(DeflateCompressorInputStream.java:84) */
        deflateCompressorInputStream.available();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method available()
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#available()}
 * @utbot.throwsException {@link java.io.IOException} in: return in.available();
 *  */
    @Test(expected = IOException.class)
    public void testAvailable_ThrowIOException() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.available();
    }
    
    /**
    @utbot.classUnderTest {@link DeflateCompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#available()}
 * @utbot.throwsException {@link java.io.IOException} in: return in.available();
 *  */
    @Test(expected = IOException.class)
    public void testAvailable_ThrowIOException_1() throws Exception  {
        DeflateCompressorInputStream deflateCompressorInputStream = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        DataInputStream in = ((DataInputStream) createInstance("java.io.DataInputStream"));
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in1, "java.util.zip.ZipInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(deflateCompressorInputStream, "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "in", in);
        
        deflateCompressorInputStream.available();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method available()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream#available()}
     */
    @Test
    public void testAvailableReturnsOne() throws IOException  {
        BoundedInputStream boundedInputStream = new BoundedInputStream(null, 1L);
        DeflateParameters deflateParameters = new DeflateParameters();
        deflateParameters.setCompressionLevel(Integer.MAX_VALUE);
        DeflateCompressorInputStream deflateCompressorInputStream = new DeflateCompressorInputStream(boundedInputStream, deflateParameters);
        
        int actual = deflateCompressorInputStream.available();
        
        assertEquals(1, actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields975110192264700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields975110192264700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass975110192275400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields975110192264700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass975110192275400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields975110192586400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields975110192586400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass975110192589800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields975110192586400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass975110192589800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


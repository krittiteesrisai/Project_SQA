package org.apache.commons.compress.utils;

import org.junit.Test;
import java.lang.reflect.Constructor;
import org.apache.commons.compress.compressors.lz4.XXHash32;
import java.util.zip.CRC32;
import java.util.jar.JarInputStream;
import sun.security.util.ManifestEntryVerifier;
import sun.net.www.http.PosterOutputStream;
import java.util.jar.JarEntry;
import java.security.CodeSigner;
import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.security.cert.Certificate;
import java.io.InputStream;
import java.util.Properties;
import java.util.HashMap;
import java.io.IOException;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.util.zip.ZipException;
import java.io.ByteArrayInputStream;
import java.util.zip.InflaterInputStream;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import sun.security.provider.Sun;
import java.io.DataInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_compress_utils_ChecksumCalculatingInputStreamTest {
    ///region Test suites for executable org.apache.commons.compress.utils.ChecksumCalculatingInputStream.getValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValue()
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#getValue()}
 * @utbot.returnsFrom {@code return checksum.getValue();}
 *  */
    @Test
    public void testGetValue_ReturnChecksumGetValue_2() throws Exception  {
        Object pureJavaCrc32C = createInstance("org.apache.commons.compress.compressors.snappy.PureJavaCrc32C");
        Class checksumCalculatingInputStreamClazz = Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream");
        Class pureJavaCrc32CType = Class.forName("java.util.zip.Checksum");
        Class inputStreamType = Class.forName("java.io.InputStream");
        Constructor checksumCalculatingInputStreamConstructor = checksumCalculatingInputStreamClazz.getDeclaredConstructor(pureJavaCrc32CType, inputStreamType);
        checksumCalculatingInputStreamConstructor.setAccessible(true);
        java.lang.Object[] checksumCalculatingInputStreamConstructorArguments = new java.lang.Object[2];
        checksumCalculatingInputStreamConstructorArguments[0] = pureJavaCrc32C;
        checksumCalculatingInputStreamConstructorArguments[1] = ((Object) null);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = ((ChecksumCalculatingInputStream) checksumCalculatingInputStreamConstructor.newInstance(checksumCalculatingInputStreamConstructorArguments));
        
        long actual = checksumCalculatingInputStream.getValue();
        
        assertEquals(4294967295L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#getValue()}
 * @utbot.returnsFrom {@code return checksum.getValue();}
 *  */
    @Test
    public void testGetValue_ReturnChecksumGetValue() throws Exception  {
        XXHash32 xXHash32 = ((XXHash32) createInstance("org.apache.commons.compress.compressors.lz4.XXHash32"));
        int[] state = new int[11];
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "state", state);
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "totalLen", 16);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(xXHash32, null);
        
        long actual = checksumCalculatingInputStream.getValue();
        
        assertEquals(2726224449L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#getValue()}
 * @utbot.returnsFrom {@code return checksum.getValue();}
 *  */
    @Test
    public void testGetValue_ReturnChecksumGetValue_1() throws Exception  {
        XXHash32 xXHash32 = ((XXHash32) createInstance("org.apache.commons.compress.compressors.lz4.XXHash32"));
        int[] state = new int[11];
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "state", state);
        byte[] buffer = {(byte) 0};
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "buffer", buffer);
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "totalLen", 16);
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "pos", 1);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(xXHash32, null);
        
        long actual = checksumCalculatingInputStream.getValue();
        
        assertEquals(134951316L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValue()
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#getValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return checksum.getValue();
 *  */
    @Test
    public void testGetValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        XXHash32 xXHash32 = ((XXHash32) createInstance("org.apache.commons.compress.compressors.lz4.XXHash32"));
        int[] state = {};
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "state", state);
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "totalLen", 17);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(xXHash32, null);
        
        /* This test fails because method [org.apache.commons.compress.utils.ChecksumCalculatingInputStream.getValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.compressors.lz4.XXHash32.getValue(XXHash32.java:122)
            org.apache.commons.compress.utils.ChecksumCalculatingInputStream.getValue(ChecksumCalculatingInputStream.java:96) */
        checksumCalculatingInputStream.getValue();
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#getValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return checksum.getValue();
 *  */
    @Test
    public void testGetValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        XXHash32 xXHash32 = ((XXHash32) createInstance("org.apache.commons.compress.compressors.lz4.XXHash32"));
        int[] state = {};
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "state", state);
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "totalLen", 16);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(xXHash32, null);
        
        /* This test fails because method [org.apache.commons.compress.utils.ChecksumCalculatingInputStream.getValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            org.apache.commons.compress.compressors.lz4.XXHash32.getValue(XXHash32.java:128)
            org.apache.commons.compress.utils.ChecksumCalculatingInputStream.getValue(ChecksumCalculatingInputStream.java:96) */
        checksumCalculatingInputStream.getValue();
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#getValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return checksum.getValue();
 *  */
    @Test
    public void testGetValue_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        XXHash32 xXHash32 = ((XXHash32) createInstance("org.apache.commons.compress.compressors.lz4.XXHash32"));
        int[] state = {0};
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "state", state);
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "totalLen", 17);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(xXHash32, null);
        
        /* This test fails because method [org.apache.commons.compress.utils.ChecksumCalculatingInputStream.getValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.compressors.lz4.XXHash32.getValue(XXHash32.java:123)
            org.apache.commons.compress.utils.ChecksumCalculatingInputStream.getValue(ChecksumCalculatingInputStream.java:96) */
        checksumCalculatingInputStream.getValue();
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#getValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return checksum.getValue();
 *  */
    @Test
    public void testGetValue_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        XXHash32 xXHash32 = ((XXHash32) createInstance("org.apache.commons.compress.compressors.lz4.XXHash32"));
        int[] state = {0, 0};
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "state", state);
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "totalLen", 17);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(xXHash32, null);
        
        /* This test fails because method [org.apache.commons.compress.utils.ChecksumCalculatingInputStream.getValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.compress.compressors.lz4.XXHash32.getValue(XXHash32.java:124)
            org.apache.commons.compress.utils.ChecksumCalculatingInputStream.getValue(ChecksumCalculatingInputStream.java:96) */
        checksumCalculatingInputStream.getValue();
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#getValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return checksum.getValue();
 *  */
    @Test
    public void testGetValue_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        XXHash32 xXHash32 = ((XXHash32) createInstance("org.apache.commons.compress.compressors.lz4.XXHash32"));
        int[] state = {0, 0, 0};
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "state", state);
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "totalLen", 17);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(xXHash32, null);
        
        /* This test fails because method [org.apache.commons.compress.utils.ChecksumCalculatingInputStream.getValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            org.apache.commons.compress.compressors.lz4.XXHash32.getValue(XXHash32.java:125)
            org.apache.commons.compress.utils.ChecksumCalculatingInputStream.getValue(ChecksumCalculatingInputStream.java:96) */
        checksumCalculatingInputStream.getValue();
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#getValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return checksum.getValue();
 *  */
    @Test
    public void testGetValue_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        XXHash32 xXHash32 = ((XXHash32) createInstance("org.apache.commons.compress.compressors.lz4.XXHash32"));
        int[] state = new int[11];
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "state", state);
        byte[] buffer = {};
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "buffer", buffer);
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "totalLen", 16);
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "pos", 1);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(xXHash32, null);
        
        /* This test fails because method [org.apache.commons.compress.utils.ChecksumCalculatingInputStream.getValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.compressors.lz4.XXHash32.getValue(XXHash32.java:138)
            org.apache.commons.compress.utils.ChecksumCalculatingInputStream.getValue(ChecksumCalculatingInputStream.java:96) */
        checksumCalculatingInputStream.getValue();
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#getValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetValue_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        XXHash32 xXHash32 = ((XXHash32) createInstance("org.apache.commons.compress.compressors.lz4.XXHash32"));
        int[] state = new int[11];
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "state", state);
        byte[] buffer = {};
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "buffer", buffer);
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "totalLen", 16);
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "pos", 4);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(xXHash32, null);
        
        /* This test fails because method [org.apache.commons.compress.utils.ChecksumCalculatingInputStream.getValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(ByteUtils.java:83)
            org.apache.commons.compress.compressors.lz4.XXHash32.getInt(XXHash32.java:150)
            org.apache.commons.compress.compressors.lz4.XXHash32.getValue(XXHash32.java:135)
            org.apache.commons.compress.utils.ChecksumCalculatingInputStream.getValue(ChecksumCalculatingInputStream.java:96) */
        checksumCalculatingInputStream.getValue();
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#getValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return checksum.getValue();
 *  */
    @Test
    public void testGetValue_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        XXHash32 xXHash32 = ((XXHash32) createInstance("org.apache.commons.compress.compressors.lz4.XXHash32"));
        int[] state = new int[11];
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "state", state);
        byte[] buffer = {(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "buffer", buffer);
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "totalLen", 16);
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "pos", 5);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(xXHash32, null);
        
        /* This test fails because method [org.apache.commons.compress.utils.ChecksumCalculatingInputStream.getValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            org.apache.commons.compress.compressors.lz4.XXHash32.getValue(XXHash32.java:138)
            org.apache.commons.compress.utils.ChecksumCalculatingInputStream.getValue(ChecksumCalculatingInputStream.java:96) */
        checksumCalculatingInputStream.getValue();
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#getValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return checksum.getValue();
 *  */
    @Test
    public void testGetValue_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        XXHash32 xXHash32 = ((XXHash32) createInstance("org.apache.commons.compress.compressors.lz4.XXHash32"));
        int[] state = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "state", state);
        byte[] buffer = {};
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "buffer", buffer);
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "totalLen", 17);
        setField(xXHash32, "org.apache.commons.compress.compressors.lz4.XXHash32", "pos", 1);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(xXHash32, null);
        
        /* This test fails because method [org.apache.commons.compress.utils.ChecksumCalculatingInputStream.getValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.compressors.lz4.XXHash32.getValue(XXHash32.java:138)
            org.apache.commons.compress.utils.ChecksumCalculatingInputStream.getValue(ChecksumCalculatingInputStream.java:96) */
        checksumCalculatingInputStream.getValue();
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#getValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return checksum.getValue();
 *  */
    @Test
    public void testGetValue_ThrowNullPointerException() {
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, null);
        
        /* This test fails because method [org.apache.commons.compress.utils.ChecksumCalculatingInputStream.getValue] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.ChecksumCalculatingInputStream.getValue(ChecksumCalculatingInputStream.java:96) */
        checksumCalculatingInputStream.getValue();
    }
    ///endregion
    
    ///region Errors report for getValue
    
    public void testGetValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet() throws Exception  {
        XXHash32 xXHash32 = ((XXHash32) createInstance("org.apache.commons.compress.compressors.lz4.XXHash32"));
        Object zipFileInflaterInputStream = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        Class checksumCalculatingInputStreamClazz = Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream");
        Class xXHash32Type = Class.forName("java.util.zip.Checksum");
        Class zipFileInflaterInputStreamType = Class.forName("java.io.InputStream");
        Constructor checksumCalculatingInputStreamConstructor = checksumCalculatingInputStreamClazz.getDeclaredConstructor(xXHash32Type, zipFileInflaterInputStreamType);
        checksumCalculatingInputStreamConstructor.setAccessible(true);
        java.lang.Object[] checksumCalculatingInputStreamConstructorArguments = new java.lang.Object[2];
        checksumCalculatingInputStreamConstructorArguments[0] = xXHash32;
        checksumCalculatingInputStreamConstructorArguments[1] = zipFileInflaterInputStream;
        ChecksumCalculatingInputStream checksumCalculatingInputStream = ((ChecksumCalculatingInputStream) checksumCalculatingInputStreamConstructor.newInstance(checksumCalculatingInputStreamConstructorArguments));
        byte[] byteArray = {};
        
        int actual = checksumCalculatingInputStream.read(byteArray, 0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_1() throws Exception  {
        CRC32 crc32 = new CRC32();
        Object zipFileInflaterInputStream = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        Class checksumCalculatingInputStreamClazz = Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream");
        Class crc32Type = Class.forName("java.util.zip.Checksum");
        Class zipFileInflaterInputStreamType = Class.forName("java.io.InputStream");
        Constructor checksumCalculatingInputStreamConstructor = checksumCalculatingInputStreamClazz.getDeclaredConstructor(crc32Type, zipFileInflaterInputStreamType);
        checksumCalculatingInputStreamConstructor.setAccessible(true);
        java.lang.Object[] checksumCalculatingInputStreamConstructorArguments = new java.lang.Object[2];
        checksumCalculatingInputStreamConstructorArguments[0] = crc32;
        checksumCalculatingInputStreamConstructorArguments[1] = zipFileInflaterInputStream;
        ChecksumCalculatingInputStream checksumCalculatingInputStream = ((ChecksumCalculatingInputStream) checksumCalculatingInputStreamConstructor.newInstance(checksumCalculatingInputStreamConstructorArguments));
        byte[] byteArray = {};
        
        int actual = checksumCalculatingInputStream.read(byteArray, 0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_2() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        int actual = checksumCalculatingInputStream.read(null, -255, -255);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_3() throws Exception  {
        CRC32 crc32 = new CRC32();
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(crc32, jarInputStream);
        byte[] byteArray = {};
        
        int actual = checksumCalculatingInputStream.read(byteArray, 0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_4() throws Exception  {
        CRC32 crc32 = new CRC32();
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        PosterOutputStream baos = ((PosterOutputStream) createInstance("sun.net.www.http.PosterOutputStream"));
        setField(baos, "sun.net.www.http.PosterOutputStream", "closed", true);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(crc32, jarInputStream);
        byte[] byteArray = {};
        
        int actual = checksumCalculatingInputStream.read(byteArray, 0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_5() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        java.security.CodeSigner[] signers = {null};
        setField(entry, "java.util.jar.JarEntry", "signers", signers);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        int actual = checksumCalculatingInputStream.read(null, -255, -255);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_6() throws Exception  {
        CRC32 crc32 = new CRC32();
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(crc32, jarInputStream);
        byte[] byteArray = {};
        
        int actual = checksumCalculatingInputStream.read(byteArray, 0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_7() throws Exception  {
        CRC32 crc32 = new CRC32();
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        ByteArrayOutputStream baos = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {};
        setField(baos, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(crc32, jarInputStream);
        byte[] byteArray = {};
        
        int actual = checksumCalculatingInputStream.read(byteArray, 0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_8() throws Exception  {
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
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        int actual = checksumCalculatingInputStream.read(null, -255, -255);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_9() throws Exception  {
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
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        java.security.cert.Certificate[] certs = {null};
        setField(entry, "java.util.jar.JarEntry", "certs", certs);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        java.security.CodeSigner[] signers = {};
        setField(mev, "sun.security.util.ManifestEntryVerifier", "signers", signers);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        InputStream checksumCalculatingInputStreamIn = ((InputStream) getFieldValue(checksumCalculatingInputStream, "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "in"));
        ManifestEntryVerifier checksumCalculatingInputStreamInInMev = ((ManifestEntryVerifier) getFieldValue(checksumCalculatingInputStreamIn, "java.util.jar.JarInputStream", "mev"));
        JarEntry checksumCalculatingInputStreamInInMevInMevEntry = ((JarEntry) getFieldValue(checksumCalculatingInputStreamInInMev, "sun.security.util.ManifestEntryVerifier", "entry"));
        java.security.cert.Certificate[] initialChecksumCalculatingInputStreamInMevEntryCerts = ((java.security.cert.Certificate[]) getFieldValue(checksumCalculatingInputStreamInInMevInMevEntry, "java.util.jar.JarEntry", "certs"));
        InputStream checksumCalculatingInputStreamIn1 = ((InputStream) getFieldValue(checksumCalculatingInputStream, "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "in"));
        ManifestEntryVerifier checksumCalculatingInputStreamIn1InMev = ((ManifestEntryVerifier) getFieldValue(checksumCalculatingInputStreamIn1, "java.util.jar.JarInputStream", "mev"));
        JarEntry checksumCalculatingInputStreamIn1InMevInMevEntry = ((JarEntry) getFieldValue(checksumCalculatingInputStreamIn1InMev, "sun.security.util.ManifestEntryVerifier", "entry"));
        java.security.CodeSigner[] initialChecksumCalculatingInputStreamInMevEntrySigners = ((java.security.CodeSigner[]) getFieldValue(checksumCalculatingInputStreamIn1InMevInMevEntry, "java.util.jar.JarEntry", "signers"));
        
        int actual = checksumCalculatingInputStream.read(null, -255, -255);
        
        assertEquals(-1, actual);
        
        InputStream checksumCalculatingInputStreamIn2 = ((InputStream) getFieldValue(checksumCalculatingInputStream, "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "in"));
        ManifestEntryVerifier checksumCalculatingInputStreamIn2InMev = ((ManifestEntryVerifier) getFieldValue(checksumCalculatingInputStreamIn2, "java.util.jar.JarInputStream", "mev"));
        JarEntry checksumCalculatingInputStreamIn2InMevInMevEntry = ((JarEntry) getFieldValue(checksumCalculatingInputStreamIn2InMev, "sun.security.util.ManifestEntryVerifier", "entry"));
        java.security.cert.Certificate[] finalChecksumCalculatingInputStreamInMevEntryCerts = ((java.security.cert.Certificate[]) getFieldValue(checksumCalculatingInputStreamIn2InMevInMevEntry, "java.util.jar.JarEntry", "certs"));
        InputStream checksumCalculatingInputStreamIn3 = ((InputStream) getFieldValue(checksumCalculatingInputStream, "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "in"));
        ManifestEntryVerifier checksumCalculatingInputStreamIn3InMev = ((ManifestEntryVerifier) getFieldValue(checksumCalculatingInputStreamIn3, "java.util.jar.JarInputStream", "mev"));
        JarEntry checksumCalculatingInputStreamIn3InMevInMevEntry = ((JarEntry) getFieldValue(checksumCalculatingInputStreamIn3InMev, "sun.security.util.ManifestEntryVerifier", "entry"));
        java.security.CodeSigner[] finalChecksumCalculatingInputStreamInMevEntrySigners = ((java.security.CodeSigner[]) getFieldValue(checksumCalculatingInputStreamIn3InMevInMevEntry, "java.util.jar.JarEntry", "signers"));
        
        assertFalse(initialChecksumCalculatingInputStreamInMevEntryCerts == finalChecksumCalculatingInputStreamInMevEntryCerts);
        
        assertFalse(initialChecksumCalculatingInputStreamInMevEntrySigners == finalChecksumCalculatingInputStreamInMevEntrySigners);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} 
 *  */
    @Test
    public void testRead_ThrowArithmeticException() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
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
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        /* This test fails because method [org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read] produces [java.lang.ArithmeticException: / by zero] */
        checksumCalculatingInputStream.read(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final int ret = in.read(b, off, len);
 *  */
    @Test
    public void testRead_ThrowClassCastException() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Hashtable verifiedSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        Properties sigFileSigners = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        Object object = createInstance("java.lang.Object");
        map.put(null, object);
        setField(sigFileSigners, "java.util.Properties", "map", map);
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
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        /* This test fails because method [org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.security.CodeSigner[]] */
        checksumCalculatingInputStream.read(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[],int,int)}
 * @utbot.invokes {@link java.util.zip.Checksum#update(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checksum.update(b, off, ret);
 *  */
    @Test
    public void testRead_ThrowNullPointerException_1() throws Exception  {
        Object zipFileInflaterInputStream = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        Class checksumCalculatingInputStreamClazz = Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream");
        Class checksumType = Class.forName("java.util.zip.Checksum");
        Class zipFileInflaterInputStreamType = Class.forName("java.io.InputStream");
        Constructor checksumCalculatingInputStreamConstructor = checksumCalculatingInputStreamClazz.getDeclaredConstructor(checksumType, zipFileInflaterInputStreamType);
        checksumCalculatingInputStreamConstructor.setAccessible(true);
        java.lang.Object[] checksumCalculatingInputStreamConstructorArguments = new java.lang.Object[2];
        checksumCalculatingInputStreamConstructorArguments[0] = ((Object) null);
        checksumCalculatingInputStreamConstructorArguments[1] = zipFileInflaterInputStream;
        ChecksumCalculatingInputStream checksumCalculatingInputStream = ((ChecksumCalculatingInputStream) checksumCalculatingInputStreamConstructor.newInstance(checksumCalculatingInputStreamConstructorArguments));
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read] produces [java.lang.NullPointerException] */
        checksumCalculatingInputStream.read(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int ret = in.read(b, off, len);
 *  */
    @Test
    public void testRead_ThrowNullPointerException() throws IOException  {
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, null);
        
        /* This test fails because method [org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read(ChecksumCalculatingInputStream.java:75) */
        checksumCalculatingInputStream.read(null, -255, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final int ret = in.read(b, off, len);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException() throws Exception  {
        Object zipFileInflaterInputStream = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        Class checksumCalculatingInputStreamClazz = Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream");
        Class checksumType = Class.forName("java.util.zip.Checksum");
        Class zipFileInflaterInputStreamType = Class.forName("java.io.InputStream");
        Constructor checksumCalculatingInputStreamConstructor = checksumCalculatingInputStreamClazz.getDeclaredConstructor(checksumType, zipFileInflaterInputStreamType);
        checksumCalculatingInputStreamConstructor.setAccessible(true);
        java.lang.Object[] checksumCalculatingInputStreamConstructorArguments = new java.lang.Object[2];
        checksumCalculatingInputStreamConstructorArguments[0] = ((Object) null);
        checksumCalculatingInputStreamConstructorArguments[1] = zipFileInflaterInputStream;
        ChecksumCalculatingInputStream checksumCalculatingInputStream = ((ChecksumCalculatingInputStream) checksumCalculatingInputStreamConstructor.newInstance(checksumCalculatingInputStreamConstructorArguments));
        byte[] byteArray = {(byte) -127};
        
        checksumCalculatingInputStream.read(byteArray, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final int ret = in.read(b, off, len);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        checksumCalculatingInputStream.read(byteArray, 3, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final int ret = in.read(b, off, len);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_2() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        PosterOutputStream baos = ((PosterOutputStream) createInstance("sun.net.www.http.PosterOutputStream"));
        byte[] buf = {};
        setField(baos, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(baos, "java.io.ByteArrayOutputStream", "count", -1);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        byte[] byteArray = {};
        
        checksumCalculatingInputStream.read(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} 
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testRead_ThrowOutOfMemoryError() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        ByteArrayOutputStream baos = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[32];
        setField(baos, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(baos, "java.io.ByteArrayOutputStream", "count", -2147483645);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        byte[] byteArray = {};
        
        checksumCalculatingInputStream.read(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.SecurityException} in: final int ret = in.read(b, off, len);
 *  */
    @Test(expected = SecurityException.class)
    public void testRead_ThrowSecurityException() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Hashtable verifiedSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", verifiedSigners);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        checksumCalculatingInputStream.read(null, -255, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: final int ret = in.read(b, off, len);
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        checksumCalculatingInputStream.read(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: final int ret = in.read(b, off, len);
 *  */
    @Test(expected = ZipException.class)
    public void testRead_ThrowZipException() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        byte[] byteArray = {(byte) -127};
        
        checksumCalculatingInputStream.read(byteArray, 0, 1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method read([B, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[],int,int)}
     */
    @Test
    public void testReadThrowsIOOBEWithNonEmptyPrimitiveArrayAndCornerCase() throws IOException  {
        XXHash32 xXHash32 = new XXHash32(0);
        byte[] byteArray = {(byte) 1, (byte) 0, java.lang.Byte.MAX_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(xXHash32, byteArrayInputStream);
        byte[] byteArray1 = {(byte) -1};
        
        /* This test fails because method [org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read] produces [java.lang.IndexOutOfBoundsException: Range [0, 0 + -2) out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckFromIndexSize(Preconditions.java:82)
            java.base/jdk.internal.util.Preconditions.checkFromIndexSize(Preconditions.java:361)
            java.base/java.util.Objects.checkFromIndexSize(Objects.java:411)
            java.base/java.io.ByteArrayInputStream.read(ByteArrayInputStream.java:177)
            org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read(ChecksumCalculatingInputStream.java:75) */
        checksumCalculatingInputStream.read(byteArray1, 0, -2);
    }
    ///endregion
    
    ///region Errors report for read
    
    public void testRead_errors()
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
    
    ///region Test suites for executable org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method read()
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        int actual = checksumCalculatingInputStream.read();
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_11() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        byte[] singleByteBuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        int actual = checksumCalculatingInputStream.read();
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_21() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        int actual = checksumCalculatingInputStream.read();
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_31() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        java.security.cert.Certificate[] certs = {null};
        setField(first, "java.util.jar.JarEntry", "certs", certs);
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
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
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        java.security.CodeSigner[] signers = {};
        setField(mev, "sun.security.util.ManifestEntryVerifier", "signers", signers);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        byte[] singleByteBuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        InputStream checksumCalculatingInputStreamIn = ((InputStream) getFieldValue(checksumCalculatingInputStream, "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "in"));
        JarEntry checksumCalculatingInputStreamInInFirst = ((JarEntry) getFieldValue(checksumCalculatingInputStreamIn, "java.util.jar.JarInputStream", "first"));
        java.security.cert.Certificate[] initialChecksumCalculatingInputStreamInFirstCerts = ((java.security.cert.Certificate[]) getFieldValue(checksumCalculatingInputStreamInInFirst, "java.util.jar.JarEntry", "certs"));
        InputStream checksumCalculatingInputStreamIn1 = ((InputStream) getFieldValue(checksumCalculatingInputStream, "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "in"));
        JarEntry checksumCalculatingInputStreamIn1InFirst = ((JarEntry) getFieldValue(checksumCalculatingInputStreamIn1, "java.util.jar.JarInputStream", "first"));
        java.security.CodeSigner[] initialChecksumCalculatingInputStreamInFirstSigners = ((java.security.CodeSigner[]) getFieldValue(checksumCalculatingInputStreamIn1InFirst, "java.util.jar.JarEntry", "signers"));
        
        int actual = checksumCalculatingInputStream.read();
        
        assertEquals(-1, actual);
        
        InputStream checksumCalculatingInputStreamIn2 = ((InputStream) getFieldValue(checksumCalculatingInputStream, "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "in"));
        JarEntry checksumCalculatingInputStreamIn2InFirst = ((JarEntry) getFieldValue(checksumCalculatingInputStreamIn2, "java.util.jar.JarInputStream", "first"));
        java.security.cert.Certificate[] finalChecksumCalculatingInputStreamInFirstCerts = ((java.security.cert.Certificate[]) getFieldValue(checksumCalculatingInputStreamIn2InFirst, "java.util.jar.JarEntry", "certs"));
        InputStream checksumCalculatingInputStreamIn3 = ((InputStream) getFieldValue(checksumCalculatingInputStream, "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "in"));
        JarEntry checksumCalculatingInputStreamIn3InFirst = ((JarEntry) getFieldValue(checksumCalculatingInputStreamIn3, "java.util.jar.JarInputStream", "first"));
        java.security.CodeSigner[] finalChecksumCalculatingInputStreamInFirstSigners = ((java.security.CodeSigner[]) getFieldValue(checksumCalculatingInputStreamIn3InFirst, "java.util.jar.JarEntry", "signers"));
        
        assertFalse(initialChecksumCalculatingInputStreamInFirstCerts == finalChecksumCalculatingInputStreamInFirstCerts);
        
        assertFalse(initialChecksumCalculatingInputStreamInFirstSigners == finalChecksumCalculatingInputStreamInFirstSigners);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read()
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} 
 *  */
    @Test
    public void testRead_ThrowArithmeticException1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
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
        byte[] singleByteBuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        /* This test fails because method [org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read] produces [java.lang.ArithmeticException: / by zero] */
        checksumCalculatingInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testRead_ThrowClassCastException1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        Object object = createInstance("java.lang.Object");
        map.put(null, object);
        setField(verifiedSigners, "java.util.Properties", "map", map);
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
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        byte[] singleByteBuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        /* This test fails because method [org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.security.CodeSigner[]] */
        checksumCalculatingInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read()}
 * @utbot.invokes {@link java.io.InputStream#read()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int ret = in.read();
 *  */
    @Test
    public void testRead_ThrowNullPointerException1() throws IOException  {
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, null);
        
        /* This test fails because method [org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read(ChecksumCalculatingInputStream.java:49) */
        checksumCalculatingInputStream.read();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method read()
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read()}
 * @utbot.throwsException {@link java.io.IOException} in: final int ret = in.read();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException1() throws Exception  {
        InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(inflaterInputStream, "java.util.zip.InflaterInputStream", "closed", true);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, inflaterInputStream);
        
        checksumCalculatingInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read()}
 * @utbot.throwsException {@link java.io.IOException} in: final int ret = in.read();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "closed", true);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        checksumCalculatingInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read()}
 * @utbot.throwsException {@link java.io.IOException} in: final int ret = in.read();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_2() throws Exception  {
        InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(inflaterInputStream, "java.util.zip.InflaterInputStream", "closed", true);
        CheckedInputStream checkedInputStream = new CheckedInputStream(inflaterInputStream, null);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, checkedInputStream);
        
        checksumCalculatingInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read()}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: final int ret = in.read();
 *  */
    @Test(expected = ZipException.class)
    public void testRead_ThrowZipException1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setMethod(1);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        byte[] singleByteBuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        checksumCalculatingInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read()}
 * @utbot.throwsException {@link java.io.IOException} in: final int ret = in.read();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_3() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        byte[] singleByteBuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        checksumCalculatingInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read()}
 * @utbot.throwsException {@link java.io.IOException} in: final int ret = in.read();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_4() throws Exception  {
        InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(inflaterInputStream, "java.util.zip.InflaterInputStream", "closed", true);
        CheckedInputStream checkedInputStream = new CheckedInputStream(inflaterInputStream, null);
        CheckedInputStream checkedInputStream1 = new CheckedInputStream(checkedInputStream, null);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, checkedInputStream1);
        
        checksumCalculatingInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read()}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: final int ret = in.read();
 *  */
    @Test(expected = ZipException.class)
    public void testRead_ThrowZipException_1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        byte[] singleByteBuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        checksumCalculatingInputStream.read();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method read()
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final int ret = in.read();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException1() throws Exception  {
        InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        byte[] singleByteBuf = {};
        setField(inflaterInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, inflaterInputStream);
        
        checksumCalculatingInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read()}
 * @utbot.throwsException {@link java.lang.SecurityException} in: final int ret = in.read();
 *  */
    @Test(expected = SecurityException.class)
    public void testRead_ThrowSecurityException1() throws Exception  {
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
        byte[] singleByteBuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        checksumCalculatingInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRead_ThrowIllegalStateException() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        Sun sigFileSigners = ((Sun) createInstance("sun.security.provider.Sun"));
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
        byte[] singleByteBuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        checksumCalculatingInputStream.read();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method read()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read()}
     */
    @Test
    public void testReadReturnsOne() throws IOException  {
        XXHash32 xXHash32 = new XXHash32(524288);
        byte[] byteArray = {(byte) 1, (byte) 0, java.lang.Byte.MAX_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(xXHash32, byteArrayInputStream);
        
        int actual = checksumCalculatingInputStream.read();
        
        assertEquals(1, actual);
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
    
    ///region Test suites for executable org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method read([B)
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[])}
 * @utbot.returnsFrom {@code return read(b, 0, b.length);}
 *  */
    @Test
    public void testRead_ReturnRead() throws Exception  {
        XXHash32 xXHash32 = ((XXHash32) createInstance("org.apache.commons.compress.compressors.lz4.XXHash32"));
        Object zipFileInflaterInputStream = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        Class checksumCalculatingInputStreamClazz = Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream");
        Class xXHash32Type = Class.forName("java.util.zip.Checksum");
        Class zipFileInflaterInputStreamType = Class.forName("java.io.InputStream");
        Constructor checksumCalculatingInputStreamConstructor = checksumCalculatingInputStreamClazz.getDeclaredConstructor(xXHash32Type, zipFileInflaterInputStreamType);
        checksumCalculatingInputStreamConstructor.setAccessible(true);
        java.lang.Object[] checksumCalculatingInputStreamConstructorArguments = new java.lang.Object[2];
        checksumCalculatingInputStreamConstructorArguments[0] = xXHash32;
        checksumCalculatingInputStreamConstructorArguments[1] = zipFileInflaterInputStream;
        ChecksumCalculatingInputStream checksumCalculatingInputStream = ((ChecksumCalculatingInputStream) checksumCalculatingInputStreamConstructor.newInstance(checksumCalculatingInputStreamConstructorArguments));
        byte[] byteArray = {};
        
        int actual = checksumCalculatingInputStream.read(byteArray);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[])}
 * @utbot.returnsFrom {@code return read(b, 0, b.length);}
 *  */
    @Test
    public void testRead_ReturnRead_1() throws Exception  {
        CRC32 crc32 = new CRC32();
        Object zipFileInflaterInputStream = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        Class checksumCalculatingInputStreamClazz = Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream");
        Class crc32Type = Class.forName("java.util.zip.Checksum");
        Class zipFileInflaterInputStreamType = Class.forName("java.io.InputStream");
        Constructor checksumCalculatingInputStreamConstructor = checksumCalculatingInputStreamClazz.getDeclaredConstructor(crc32Type, zipFileInflaterInputStreamType);
        checksumCalculatingInputStreamConstructor.setAccessible(true);
        java.lang.Object[] checksumCalculatingInputStreamConstructorArguments = new java.lang.Object[2];
        checksumCalculatingInputStreamConstructorArguments[0] = crc32;
        checksumCalculatingInputStreamConstructorArguments[1] = zipFileInflaterInputStream;
        ChecksumCalculatingInputStream checksumCalculatingInputStream = ((ChecksumCalculatingInputStream) checksumCalculatingInputStreamConstructor.newInstance(checksumCalculatingInputStreamConstructorArguments));
        byte[] byteArray = {};
        
        int actual = checksumCalculatingInputStream.read(byteArray);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[])}
 * @utbot.returnsFrom {@code return read(b, 0, b.length);}
 *  */
    @Test
    public void testRead_ReturnRead_2() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        byte[] byteArray = {(byte) -127};
        
        int actual = checksumCalculatingInputStream.read(byteArray);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[])}
 * @utbot.returnsFrom {@code return read(b, 0, b.length);}
 *  */
    @Test
    public void testRead_ReturnRead_3() throws Exception  {
        Object pureJavaCrc32C = createInstance("org.apache.commons.compress.compressors.snappy.PureJavaCrc32C");
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Class checksumCalculatingInputStreamClazz = Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream");
        Class pureJavaCrc32CType = Class.forName("java.util.zip.Checksum");
        Class jarInputStreamType = Class.forName("java.io.InputStream");
        Constructor checksumCalculatingInputStreamConstructor = checksumCalculatingInputStreamClazz.getDeclaredConstructor(pureJavaCrc32CType, jarInputStreamType);
        checksumCalculatingInputStreamConstructor.setAccessible(true);
        java.lang.Object[] checksumCalculatingInputStreamConstructorArguments = new java.lang.Object[2];
        checksumCalculatingInputStreamConstructorArguments[0] = pureJavaCrc32C;
        checksumCalculatingInputStreamConstructorArguments[1] = jarInputStream;
        ChecksumCalculatingInputStream checksumCalculatingInputStream = ((ChecksumCalculatingInputStream) checksumCalculatingInputStreamConstructor.newInstance(checksumCalculatingInputStreamConstructorArguments));
        byte[] byteArray = {};
        
        int actual = checksumCalculatingInputStream.read(byteArray);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[])}
 * @utbot.returnsFrom {@code return read(b, 0, b.length);}
 *  */
    @Test
    public void testRead_ReturnRead_4() throws Exception  {
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
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        byte[] byteArray = {(byte) -127};
        
        int actual = checksumCalculatingInputStream.read(byteArray);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[])}
 * @utbot.returnsFrom {@code return read(b, 0, b.length);}
 *  */
    @Test
    public void testRead_ReturnRead_5() throws Exception  {
        CRC32 crc32 = new CRC32();
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(crc32, jarInputStream);
        byte[] byteArray = {};
        
        int actual = checksumCalculatingInputStream.read(byteArray);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[])}
 * @utbot.returnsFrom {@code return read(b, 0, b.length);}
 *  */
    @Test
    public void testRead_ReturnRead_6() throws Exception  {
        XXHash32 xXHash32 = ((XXHash32) createInstance("org.apache.commons.compress.compressors.lz4.XXHash32"));
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(xXHash32, jarInputStream);
        byte[] byteArray = {};
        
        int actual = checksumCalculatingInputStream.read(byteArray);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[])}
 * @utbot.returnsFrom {@code return read(b, 0, b.length);}
 *  */
    @Test
    public void testRead_ReturnRead_7() throws Exception  {
        XXHash32 xXHash32 = ((XXHash32) createInstance("org.apache.commons.compress.compressors.lz4.XXHash32"));
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        PosterOutputStream baos = ((PosterOutputStream) createInstance("sun.net.www.http.PosterOutputStream"));
        setField(baos, "sun.net.www.http.PosterOutputStream", "closed", true);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(xXHash32, jarInputStream);
        byte[] byteArray = {};
        
        int actual = checksumCalculatingInputStream.read(byteArray);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[])}
 * @utbot.returnsFrom {@code return read(b, 0, b.length);}
 *  */
    @Test
    public void testRead_ReturnRead_8() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        byte[] byteArray = {(byte) -127};
        
        int actual = checksumCalculatingInputStream.read(byteArray);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[])}
 * @utbot.returnsFrom {@code return read(b, 0, b.length);}
 *  */
    @Test
    public void testRead_ReturnRead_9() throws Exception  {
        CRC32 crc32 = new CRC32();
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        ByteArrayOutputStream baos = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {};
        setField(baos, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(baos, "java.io.ByteArrayOutputStream", "count", 1);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(crc32, jarInputStream);
        byte[] byteArray = {};
        
        InputStream checksumCalculatingInputStreamIn = ((InputStream) getFieldValue(checksumCalculatingInputStream, "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "in"));
        Object checksumCalculatingInputStreamInInJv = getFieldValue(checksumCalculatingInputStreamIn, "java.util.jar.JarInputStream", "jv");
        ByteArrayOutputStream checksumCalculatingInputStreamInInJvInJvBaos = ((ByteArrayOutputStream) getFieldValue(checksumCalculatingInputStreamInInJv, "java.util.jar.JarVerifier", "baos"));
        byte[] initialChecksumCalculatingInputStreamInJvBaosBuf = ((byte[]) getFieldValue(checksumCalculatingInputStreamInInJvInJvBaos, "java.io.ByteArrayOutputStream", "buf"));
        
        int actual = checksumCalculatingInputStream.read(byteArray);
        
        assertEquals(0, actual);
        
        InputStream checksumCalculatingInputStreamIn1 = ((InputStream) getFieldValue(checksumCalculatingInputStream, "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "in"));
        Object checksumCalculatingInputStreamIn1InJv = getFieldValue(checksumCalculatingInputStreamIn1, "java.util.jar.JarInputStream", "jv");
        ByteArrayOutputStream checksumCalculatingInputStreamIn1InJvInJvBaos = ((ByteArrayOutputStream) getFieldValue(checksumCalculatingInputStreamIn1InJv, "java.util.jar.JarVerifier", "baos"));
        byte[] finalChecksumCalculatingInputStreamInJvBaosBuf = ((byte[]) getFieldValue(checksumCalculatingInputStreamIn1InJvInJvBaos, "java.io.ByteArrayOutputStream", "buf"));
        
        assertFalse(initialChecksumCalculatingInputStreamInJvBaosBuf == finalChecksumCalculatingInputStreamInJvBaosBuf);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read([B)
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[])}
 * @utbot.throwsException {@link java.lang.ArithmeticException} 
 *  */
    @Test
    public void testRead_ThrowArithmeticException2() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
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
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read] produces [java.lang.ArithmeticException: / by zero] */
        checksumCalculatingInputStream.read(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[])}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testRead_ThrowClassCastException2() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        Object object = createInstance("java.lang.Object");
        map.put(null, object);
        setField(verifiedSigners, "java.util.Properties", "map", map);
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
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.security.CodeSigner[]] */
        checksumCalculatingInputStream.read(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return read(b, 0, b.length);
 *  */
    @Test
    public void testRead_ThrowNullPointerException2() throws IOException  {
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, null);
        
        /* This test fails because method [org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read(ChecksumCalculatingInputStream.java:64) */
        checksumCalculatingInputStream.read(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method read([B)
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: return read(b, 0, b.length);
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException2() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "closed", true);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        byte[] byteArray = {(byte) -127};
        
        checksumCalculatingInputStream.read(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: return read(b, 0, b.length);
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_11() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        byte[] byteArray = {(byte) -127};
        
        checksumCalculatingInputStream.read(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[])}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: return read(b, 0, b.length);
 *  */
    @Test(expected = ZipException.class)
    public void testRead_ThrowZipException2() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        byte[] byteArray = {(byte) -127};
        
        checksumCalculatingInputStream.read(byteArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method read([B)
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return read(b, 0, b.length);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException2() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        ByteArrayOutputStream baos = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {};
        setField(baos, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(baos, "java.io.ByteArrayOutputStream", "count", -1);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        byte[] byteArray = {};
        
        checksumCalculatingInputStream.read(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_11() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        PosterOutputStream baos = ((PosterOutputStream) createInstance("sun.net.www.http.PosterOutputStream"));
        byte[] buf = {};
        setField(baos, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(baos, "java.io.ByteArrayOutputStream", "count", -1);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        byte[] byteArray = {};
        
        checksumCalculatingInputStream.read(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[])}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} 
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testRead_ThrowOutOfMemoryError1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        ByteArrayOutputStream baos = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[32];
        setField(baos, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(baos, "java.io.ByteArrayOutputStream", "count", -2147483647);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        byte[] byteArray = {};
        
        checksumCalculatingInputStream.read(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[])}
 * @utbot.throwsException {@link java.lang.SecurityException} in: return read(b, 0, b.length);
 *  */
    @Test(expected = SecurityException.class)
    public void testRead_ThrowSecurityException2() throws Exception  {
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
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        byte[] byteArray = {(byte) -127};
        
        checksumCalculatingInputStream.read(byteArray);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method read([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#read(byte[])}
     */
    @Test
    public void testReadReturnsOneWithNonEmptyPrimitiveArray() throws IOException  {
        XXHash32 xXHash32 = new XXHash32(0);
        byte[] byteArray = {java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, (byte) -1, java.lang.Byte.MAX_VALUE};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(xXHash32, byteArrayInputStream);
        byte[] byteArray1 = {(byte) 0};
        
        int actual = checksumCalculatingInputStream.read(byteArray1);
        
        assertEquals(1, actual);
        
        byte finalByteArray10 = byteArray1[0];
        
        assertEquals(java.lang.Byte.MIN_VALUE, finalByteArray10);
    }
    ///endregion
    
    ///region Errors report for read
    
    public void testRead_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.utils.ChecksumCalculatingInputStream.skip
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method skip(long)
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#skip(long)}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testSkip_ReturnZero() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        long actual = checksumCalculatingInputStream.skip(-255L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#skip(long)}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testSkip_ReturnZero_1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        long actual = checksumCalculatingInputStream.skip(-255L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#skip(long)}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testSkip_ReturnZero_2() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Hashtable verifiedSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        long actual = checksumCalculatingInputStream.skip(-255L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#skip(long)}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testSkip_ReturnZero_3() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        java.security.cert.Certificate[] certs = {null};
        setField(first, "java.util.jar.JarEntry", "certs", certs);
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Hashtable verifiedSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
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
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        java.security.CodeSigner[] signers = {};
        setField(mev, "sun.security.util.ManifestEntryVerifier", "signers", signers);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        byte[] singleByteBuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        InputStream checksumCalculatingInputStreamIn = ((InputStream) getFieldValue(checksumCalculatingInputStream, "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "in"));
        JarEntry checksumCalculatingInputStreamInInFirst = ((JarEntry) getFieldValue(checksumCalculatingInputStreamIn, "java.util.jar.JarInputStream", "first"));
        java.security.cert.Certificate[] initialChecksumCalculatingInputStreamInFirstCerts = ((java.security.cert.Certificate[]) getFieldValue(checksumCalculatingInputStreamInInFirst, "java.util.jar.JarEntry", "certs"));
        InputStream checksumCalculatingInputStreamIn1 = ((InputStream) getFieldValue(checksumCalculatingInputStream, "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "in"));
        JarEntry checksumCalculatingInputStreamIn1InFirst = ((JarEntry) getFieldValue(checksumCalculatingInputStreamIn1, "java.util.jar.JarInputStream", "first"));
        java.security.CodeSigner[] initialChecksumCalculatingInputStreamInFirstSigners = ((java.security.CodeSigner[]) getFieldValue(checksumCalculatingInputStreamIn1InFirst, "java.util.jar.JarEntry", "signers"));
        
        long actual = checksumCalculatingInputStream.skip(-255L);
        
        assertEquals(0L, actual);
        
        InputStream checksumCalculatingInputStreamIn2 = ((InputStream) getFieldValue(checksumCalculatingInputStream, "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "in"));
        JarEntry checksumCalculatingInputStreamIn2InFirst = ((JarEntry) getFieldValue(checksumCalculatingInputStreamIn2, "java.util.jar.JarInputStream", "first"));
        java.security.cert.Certificate[] finalChecksumCalculatingInputStreamInFirstCerts = ((java.security.cert.Certificate[]) getFieldValue(checksumCalculatingInputStreamIn2InFirst, "java.util.jar.JarEntry", "certs"));
        InputStream checksumCalculatingInputStreamIn3 = ((InputStream) getFieldValue(checksumCalculatingInputStream, "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "in"));
        JarEntry checksumCalculatingInputStreamIn3InFirst = ((JarEntry) getFieldValue(checksumCalculatingInputStreamIn3, "java.util.jar.JarInputStream", "first"));
        java.security.CodeSigner[] finalChecksumCalculatingInputStreamInFirstSigners = ((java.security.CodeSigner[]) getFieldValue(checksumCalculatingInputStreamIn3InFirst, "java.util.jar.JarEntry", "signers"));
        
        assertFalse(initialChecksumCalculatingInputStreamInFirstCerts == finalChecksumCalculatingInputStreamInFirstCerts);
        
        assertFalse(initialChecksumCalculatingInputStreamInFirstSigners == finalChecksumCalculatingInputStreamInFirstSigners);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method skip(long)
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#skip(long)}
 * @utbot.throwsException {@link java.io.IOException} when: read() >= 0
 *  */
    @Test(expected = IOException.class)
    public void testSkip_ThrowIOException() throws Exception  {
        InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(inflaterInputStream, "java.util.zip.InflaterInputStream", "closed", true);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, inflaterInputStream);
        
        checksumCalculatingInputStream.skip(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#skip(long)}
 * @utbot.throwsException {@link java.io.IOException} when: read() >= 0
 *  */
    @Test(expected = IOException.class)
    public void testSkip_ThrowIOException_1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "closed", true);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        checksumCalculatingInputStream.skip(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#skip(long)}
 * @utbot.throwsException {@link java.io.IOException} when: read() >= 0
 *  */
    @Test(expected = IOException.class)
    public void testSkip_ThrowIOException_2() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "closed", true);
        CheckedInputStream checkedInputStream = new CheckedInputStream(jarInputStream, null);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, checkedInputStream);
        
        checksumCalculatingInputStream.skip(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#skip(long)}
 * @utbot.throwsException {@link java.util.zip.ZipException} when: read() >= 0
 *  */
    @Test(expected = ZipException.class)
    public void testSkip_ThrowZipException() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setMethod(1);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        byte[] singleByteBuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        checksumCalculatingInputStream.skip(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#skip(long)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testSkip_ThrowIOException_3() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        byte[] singleByteBuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        checksumCalculatingInputStream.skip(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#skip(long)}
 * @utbot.throwsException {@link java.io.IOException} when: read() >= 0
 *  */
    @Test(expected = IOException.class)
    public void testSkip_ThrowIOException_4() throws Exception  {
        InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(inflaterInputStream, "java.util.zip.InflaterInputStream", "closed", true);
        DataInputStream dataInputStream = new DataInputStream(inflaterInputStream);
        CheckedInputStream checkedInputStream = new CheckedInputStream(dataInputStream, null);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, checkedInputStream);
        
        checksumCalculatingInputStream.skip(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#skip(long)}
 * @utbot.throwsException {@link java.util.zip.ZipException} when: read() >= 0
 *  */
    @Test(expected = ZipException.class)
    public void testSkip_ThrowZipException_1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        byte[] singleByteBuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        checksumCalculatingInputStream.skip(-255L);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method skip(long)
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#skip(long)}
 * @utbot.throwsException {@link java.lang.SecurityException} 
 *  */
    @Test(expected = SecurityException.class)
    public void testSkip_ThrowSecurityException() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Hashtable verifiedSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        Properties sigFileSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        byte[] singleByteBuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        checksumCalculatingInputStream.skip(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#skip(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: read() >= 0
 *  */
    @Test(expected = NullPointerException.class)
    public void testSkip_ThrowNullPointerException() throws Exception  {
        InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, inflaterInputStream);
        
        checksumCalculatingInputStream.skip(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#skip(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: read() >= 0
 *  */
    @Test(expected = NullPointerException.class)
    public void testSkip_ThrowNullPointerException_1() throws Exception  {
        InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        CheckedInputStream checkedInputStream = new CheckedInputStream(inflaterInputStream, null);
        CheckedInputStream checkedInputStream1 = new CheckedInputStream(checkedInputStream, null);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, checkedInputStream1);
        
        checksumCalculatingInputStream.skip(-255L);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method skip(long)
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#skip(long)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} 
 *  */
    @Test
    public void testSkip_ThrowArithmeticException() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
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
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        byte[] singleByteBuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        /* This test fails because method [org.apache.commons.compress.utils.ChecksumCalculatingInputStream.skip] produces [java.lang.ArithmeticException: / by zero] */
        checksumCalculatingInputStream.skip(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link ChecksumCalculatingInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#skip(long)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testSkip_ThrowClassCastException() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Hashtable verifiedSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        Properties sigFileSigners = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        Object object = createInstance("java.lang.Object");
        map.put(null, object);
        setField(sigFileSigners, "java.util.Properties", "map", map);
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
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        byte[] singleByteBuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(null, jarInputStream);
        
        /* This test fails because method [org.apache.commons.compress.utils.ChecksumCalculatingInputStream.skip] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.security.CodeSigner[]] */
        checksumCalculatingInputStream.skip(-255L);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method skip(long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ChecksumCalculatingInputStream#skip(long)}
     */
    @Test
    public void testSkipReturnsOne() throws IOException  {
        XXHash32 xXHash32 = new XXHash32(0);
        byte[] byteArray = {(byte) 1, (byte) 0, java.lang.Byte.MAX_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(xXHash32, byteArrayInputStream);
        
        long actual = checksumCalculatingInputStream.skip(1L);
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///region Errors report for skip
    
    public void testSkip_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
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
        
                java.lang.reflect.Method methodForGetDeclaredFields977084760795400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields977084760795400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass977084760801200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields977084760795400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass977084760801200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields977084761270800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields977084761270800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass977084761274100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields977084761270800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass977084761274100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


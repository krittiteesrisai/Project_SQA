package org.apache.commons.compress.archivers.ar;

import org.junit.Test;
import java.util.zip.InflaterInputStream;
import java.util.jar.JarInputStream;
import java.util.jar.JarEntry;
import sun.security.util.ManifestEntryVerifier;
import java.util.ArrayList;
import sun.net.www.http.PosterOutputStream;
import java.io.ByteArrayOutputStream;
import sun.security.provider.SHAKE256;
import java.util.Hashtable;
import java.util.Properties;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.io.IOException;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.util.zip.ZipException;
import java.util.zip.CheckedInputStream;
import java.security.cert.Certificate;
import java.security.CodeSigner;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.io.DataInputStream;
import java.util.zip.ZipInputStream;
import java.lang.reflect.Constructor;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import sun.security.util.DerOutputStream;
import sun.security.provider.Sun;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_compress_archivers_ar_ArArchiveInputStreamTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matches([B, int)
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 8): False}
 * @utbot.executesCondition {@code (signature[0] != 0x21): True}
 *  */
    @Test
    public void testMatches_0OfSignatureNotEquals0x21() {
        byte[] byteArray = {(byte) -127};
        
        boolean actual = ArArchiveInputStream.matches(byteArray, 8);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 8): False}
 * @utbot.executesCondition {@code (signature[0] != 0x21): False}
 * @utbot.executesCondition {@code (signature[1] != 0x3c): True}
 *  */
    @Test
    public void testMatches_1OfSignatureNotEquals0x3c() {
        byte[] byteArray = {(byte) 33, (byte) -127};
        
        boolean actual = ArArchiveInputStream.matches(byteArray, 8);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 8): False}
 * @utbot.executesCondition {@code (signature[0] != 0x21): False}
 * @utbot.executesCondition {@code (signature[1] != 0x3c): False}
 * @utbot.executesCondition {@code (signature[2] != 0x61): True}
 *  */
    @Test
    public void testMatches_2OfSignatureNotEquals0x61() {
        byte[] byteArray = new byte[11];
        byteArray[0] = (byte) 33;
        byteArray[1] = (byte) 60;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        
        boolean actual = ArArchiveInputStream.matches(byteArray, 8);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 8): False}
 * @utbot.executesCondition {@code (signature[0] != 0x21): False}
 * @utbot.executesCondition {@code (signature[1] != 0x3c): False}
 * @utbot.executesCondition {@code (signature[2] != 0x61): False}
 * @utbot.executesCondition {@code (signature[3] != 0x72): False}
 * @utbot.executesCondition {@code (signature[4] != 0x63): True}
 *  */
    @Test
    public void testMatches_4OfSignatureNotEquals0x63() {
        byte[] byteArray = new byte[13];
        byteArray[0] = (byte) 33;
        byteArray[1] = (byte) 60;
        byteArray[2] = (byte) 97;
        byteArray[3] = (byte) 114;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        
        boolean actual = ArArchiveInputStream.matches(byteArray, 8);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 8): False}
 * @utbot.executesCondition {@code (signature[0] != 0x21): False}
 * @utbot.executesCondition {@code (signature[1] != 0x3c): False}
 * @utbot.executesCondition {@code (signature[2] != 0x61): False}
 * @utbot.executesCondition {@code (signature[3] != 0x72): True}
 *  */
    @Test
    public void testMatches_3OfSignatureNotEquals0x72() {
        byte[] byteArray = {
            (byte) 33, (byte) 60, (byte) 97, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127,
            (byte) -127
        };
        
        boolean actual = ArArchiveInputStream.matches(byteArray, 8);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 8): False}
 * @utbot.executesCondition {@code (signature[0] != 0x21): False}
 * @utbot.executesCondition {@code (signature[1] != 0x3c): False}
 * @utbot.executesCondition {@code (signature[2] != 0x61): False}
 * @utbot.executesCondition {@code (signature[3] != 0x72): False}
 * @utbot.executesCondition {@code (signature[4] != 0x63): False}
 * @utbot.executesCondition {@code (signature[5] != 0x68): True}
 *  */
    @Test
    public void testMatches_5OfSignatureNotEquals0x68() {
        byte[] byteArray = new byte[14];
        byteArray[0] = (byte) 33;
        byteArray[1] = (byte) 60;
        byteArray[2] = (byte) 97;
        byteArray[3] = (byte) 114;
        byteArray[4] = (byte) 99;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        
        boolean actual = ArArchiveInputStream.matches(byteArray, 8);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 8): False}
 * @utbot.executesCondition {@code (signature[0] != 0x21): False}
 * @utbot.executesCondition {@code (signature[1] != 0x3c): False}
 * @utbot.executesCondition {@code (signature[2] != 0x61): False}
 * @utbot.executesCondition {@code (signature[3] != 0x72): False}
 * @utbot.executesCondition {@code (signature[4] != 0x63): False}
 * @utbot.executesCondition {@code (signature[5] != 0x68): False}
 * @utbot.executesCondition {@code (signature[6] != 0x3e): False}
 * @utbot.executesCondition {@code (signature[7] != 0x0a): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testMatches_7OfSignatureEquals0x0a() {
        byte[] byteArray = {
            (byte) 33, (byte) 60, (byte) 97, (byte) 114, (byte) 99, (byte) 104, (byte) 62, (byte) 10,
            (byte) -127
        };
        
        boolean actual = ArArchiveInputStream.matches(byteArray, 8);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 8): False}
 * @utbot.executesCondition {@code (signature[0] != 0x21): False}
 * @utbot.executesCondition {@code (signature[1] != 0x3c): False}
 * @utbot.executesCondition {@code (signature[2] != 0x61): False}
 * @utbot.executesCondition {@code (signature[3] != 0x72): False}
 * @utbot.executesCondition {@code (signature[4] != 0x63): False}
 * @utbot.executesCondition {@code (signature[5] != 0x68): False}
 * @utbot.executesCondition {@code (signature[6] != 0x3e): False}
 * @utbot.executesCondition {@code (signature[7] != 0x0a): True}
 *  */
    @Test
    public void testMatches_7OfSignatureNotEquals0x0a() {
        byte[] byteArray = {
            (byte) 33, (byte) 60, (byte) 97, (byte) 114, (byte) 99, (byte) 104, (byte) 62, (byte) -127,
            (byte) -127
        };
        
        boolean actual = ArArchiveInputStream.matches(byteArray, 8);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 8): False}
 * @utbot.executesCondition {@code (signature[0] != 0x21): False}
 * @utbot.executesCondition {@code (signature[1] != 0x3c): False}
 * @utbot.executesCondition {@code (signature[2] != 0x61): False}
 * @utbot.executesCondition {@code (signature[3] != 0x72): False}
 * @utbot.executesCondition {@code (signature[4] != 0x63): False}
 * @utbot.executesCondition {@code (signature[5] != 0x68): False}
 * @utbot.executesCondition {@code (signature[6] != 0x3e): True}
 *  */
    @Test
    public void testMatches_6OfSignatureNotEquals0x3e() {
        byte[] byteArray = new byte[15];
        byteArray[0] = (byte) 33;
        byteArray[1] = (byte) 60;
        byteArray[2] = (byte) 97;
        byteArray[3] = (byte) 114;
        byteArray[4] = (byte) 99;
        byteArray[5] = (byte) 104;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        byteArray[14] = (byte) -127;
        
        boolean actual = ArArchiveInputStream.matches(byteArray, 8);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 8): True}
 *  */
    @Test
    public void testMatches_LengthLessThan8() {
        boolean actual = ArArchiveInputStream.matches(null, 7);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matches([B, int)
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#matches(byte[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: signature[0] != 0x21
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(ArArchiveInputStream.java:154) */
        ArArchiveInputStream.matches(byteArray, 8);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (signature[0] != 0x21): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: signature[1] != 0x3c
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException_1() {
        byte[] byteArray = {(byte) 33};
        
        /* This test fails because method [org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(ArArchiveInputStream.java:157) */
        ArArchiveInputStream.matches(byteArray, 8);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (signature[0] != 0x21): False}
 * @utbot.executesCondition {@code (signature[1] != 0x3c): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: signature[2] != 0x61
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException_2() {
        byte[] byteArray = {(byte) 33, (byte) 60};
        
        /* This test fails because method [org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(ArArchiveInputStream.java:160) */
        ArArchiveInputStream.matches(byteArray, 8);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (signature[0] != 0x21): False}
 * @utbot.executesCondition {@code (signature[1] != 0x3c): False}
 * @utbot.executesCondition {@code (signature[2] != 0x61): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: signature[3] != 0x72
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException_3() {
        byte[] byteArray = {(byte) 33, (byte) 60, (byte) 97};
        
        /* This test fails because method [org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(ArArchiveInputStream.java:163) */
        ArArchiveInputStream.matches(byteArray, 8);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (signature[0] != 0x21): False}
 * @utbot.executesCondition {@code (signature[1] != 0x3c): False}
 * @utbot.executesCondition {@code (signature[2] != 0x61): False}
 * @utbot.executesCondition {@code (signature[3] != 0x72): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: signature[4] != 0x63
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException_4() {
        byte[] byteArray = {(byte) 33, (byte) 60, (byte) 97, (byte) 114};
        
        /* This test fails because method [org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(ArArchiveInputStream.java:166) */
        ArArchiveInputStream.matches(byteArray, 8);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (signature[0] != 0x21): False}
 * @utbot.executesCondition {@code (signature[1] != 0x3c): False}
 * @utbot.executesCondition {@code (signature[2] != 0x61): False}
 * @utbot.executesCondition {@code (signature[3] != 0x72): False}
 * @utbot.executesCondition {@code (signature[4] != 0x63): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: signature[5] != 0x68
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException_5() {
        byte[] byteArray = {(byte) 33, (byte) 60, (byte) 97, (byte) 114, (byte) 99};
        
        /* This test fails because method [org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5]
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(ArArchiveInputStream.java:169) */
        ArArchiveInputStream.matches(byteArray, 8);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (signature[0] != 0x21): False}
 * @utbot.executesCondition {@code (signature[1] != 0x3c): False}
 * @utbot.executesCondition {@code (signature[2] != 0x61): False}
 * @utbot.executesCondition {@code (signature[3] != 0x72): False}
 * @utbot.executesCondition {@code (signature[4] != 0x63): False}
 * @utbot.executesCondition {@code (signature[5] != 0x68): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: signature[6] != 0x3e
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException_6() {
        byte[] byteArray = {(byte) 33, (byte) 60, (byte) 97, (byte) 114, (byte) 99, (byte) 104};
        
        /* This test fails because method [org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6]
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(ArArchiveInputStream.java:172) */
        ArArchiveInputStream.matches(byteArray, 8);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (signature[0] != 0x21): False}
 * @utbot.executesCondition {@code (signature[1] != 0x3c): False}
 * @utbot.executesCondition {@code (signature[2] != 0x61): False}
 * @utbot.executesCondition {@code (signature[3] != 0x72): False}
 * @utbot.executesCondition {@code (signature[4] != 0x63): False}
 * @utbot.executesCondition {@code (signature[5] != 0x68): False}
 * @utbot.executesCondition {@code (signature[6] != 0x3e): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: signature[7] != 0x0a
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException_7() {
        byte[] byteArray = {(byte) 33, (byte) 60, (byte) 97, (byte) 114, (byte) 99, (byte) 104, (byte) 62};
        
        /* This test fails because method [org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7]
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(ArArchiveInputStream.java:175) */
        ArArchiveInputStream.matches(byteArray, 8);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#matches(byte[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: signature[0] != 0x21
 *  */
    @Test
    public void testMatches_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(ArArchiveInputStream.java:154) */
        ArArchiveInputStream.matches(null, 8);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        InflaterInputStream input = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", -255L);
        byte[] byteArray = {};
        
        int actual = arArchiveInputStream.read(byteArray, 0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_1() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(input, "java.util.jar.JarInputStream", "first", first);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        
        int actual = arArchiveInputStream.read(null, -255, -255);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_2() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        byte[] byteArray = {};
        
        int actual = arArchiveInputStream.read(byteArray, 0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_3() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(input, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        setField(input, "java.util.jar.JarInputStream", "mev", mev);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        byte[] byteArray = {};
        
        int actual = arArchiveInputStream.read(byteArray, 0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_4() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(input, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(input, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(input, "java.util.jar.JarInputStream", "mev", mev);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        
        int actual = arArchiveInputStream.read(null, -255, -255);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_5() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(input, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        setField(input, "java.util.jar.JarInputStream", "mev", mev);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        byte[] byteArray = {};
        
        int actual = arArchiveInputStream.read(byteArray, 0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_6() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        PosterOutputStream baos = ((PosterOutputStream) createInstance("sun.net.www.http.PosterOutputStream"));
        setField(baos, "sun.net.www.http.PosterOutputStream", "closed", true);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(input, "java.util.jar.JarInputStream", "jv", jv);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        byte[] byteArray = {};
        
        int actual = arArchiveInputStream.read(byteArray, 0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_7() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        PosterOutputStream baos = ((PosterOutputStream) createInstance("sun.net.www.http.PosterOutputStream"));
        byte[] buf = {};
        setField(baos, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(input, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(input, "java.util.jar.JarInputStream", "mev", mev);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        byte[] byteArray = {};
        
        int actual = arArchiveInputStream.read(byteArray, 0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_8() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        ByteArrayOutputStream baos = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {};
        setField(baos, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(input, "java.util.jar.JarInputStream", "jv", jv);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        byte[] byteArray = {};
        
        int actual = arArchiveInputStream.read(byteArray, 0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_9() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(input, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        Object cloneableDelegate = createInstance("java.security.MessageDigest$Delegate$CloneableDelegate");
        SHAKE256 digestSpi = ((SHAKE256) createInstance("sun.security.provider.SHAKE256"));
        setField(cloneableDelegate, "java.security.MessageDigest$Delegate", "digestSpi", digestSpi);
        digests.add(cloneableDelegate);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        setField(input, "java.util.jar.JarInputStream", "mev", mev);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        byte[] byteArray = {};
        
        int actual = arArchiveInputStream.read(byteArray, 0, 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} 
 *  */
    @Test
    public void testRead_ThrowArithmeticException() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
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
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(jarInputStream);
        
        /* This test fails because method [org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read] produces [java.lang.ArithmeticException: / by zero] */
        arArchiveInputStream.read(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final int ret = this.input.read(b, off, toRead);
 *  */
    @Test
    public void testRead_ThrowClassCastException() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
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
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(jarInputStream);
        
        /* This test fails because method [org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.security.CodeSigner[]] */
        arArchiveInputStream.read(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final int ret = this.input.read(b, off, toRead);
 *  */
    @Test
    public void testRead_ThrowClassCastException_1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties sigFileSigners = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        Object object = createInstance("java.lang.Object");
        map.put(null, object);
        Integer integer = 0;
        map.put(integer, object);
        setField(sigFileSigners, "java.util.Properties", "map", map);
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
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
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(jarInputStream);
        
        /* This test fails because method [org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.security.CodeSigner[]] */
        arArchiveInputStream.read(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int ret = this.input.read(b, off, toRead);
 *  */
    @Test
    public void testRead_ThrowNullPointerException() throws IOException  {
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read(ArArchiveInputStream.java:143) */
        arArchiveInputStream.read(null, -255, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final int ret = this.input.read(b, off, toRead);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException() throws Exception  {
        InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(inflaterInputStream);
        byte[] byteArray = {(byte) -127};
        
        arArchiveInputStream.read(byteArray, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final int ret = this.input.read(b, off, toRead);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(jarInputStream);
        
        arArchiveInputStream.read(null, -1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[],int,int)}
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
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(jarInputStream);
        byte[] byteArray = {};
        
        arArchiveInputStream.read(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.SecurityException} in: final int ret = this.input.read(b, off, toRead);
 *  */
    @Test(expected = SecurityException.class)
    public void testRead_ThrowSecurityException() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Hashtable verifiedSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(jarInputStream);
        
        arArchiveInputStream.read(null, -255, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: final int ret = this.input.read(b, off, toRead);
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 2L);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(jarInputStream);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        arArchiveInputStream.read(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: final int ret = this.input.read(b, off, toRead);
 *  */
    @Test(expected = ZipException.class)
    public void testRead_ThrowZipException() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 2L);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(jarInputStream);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        arArchiveInputStream.read(byteArray, 0, 2);
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method read()
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet1() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(input, "java.util.jar.JarInputStream", "first", first);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", -255L);
        
        int actual = arArchiveInputStream.read();
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_11() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        CheckedInputStream input = ((CheckedInputStream) createInstance("java.util.zip.CheckedInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(input, "java.io.FilterInputStream", "in", in);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        
        int actual = arArchiveInputStream.read();
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_21() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(input, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(input, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(input, "java.util.jar.JarInputStream", "mev", mev);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        
        int actual = arArchiveInputStream.read();
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_31() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(input, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(input, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(input, "java.util.jar.JarInputStream", "mev", mev);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        
        int actual = arArchiveInputStream.read();
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRead_ReturnRet_41() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        java.security.cert.Certificate[] certs = {null};
        setField(first, "java.util.jar.JarEntry", "certs", certs);
        setField(input, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(input, "java.util.jar.JarInputStream", "jv", jv);
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
        setField(input, "java.util.jar.JarInputStream", "mev", mev);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        
        InputStream arArchiveInputStreamInput = ((InputStream) getFieldValue(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input"));
        JarEntry arArchiveInputStreamInputInputFirst = ((JarEntry) getFieldValue(arArchiveInputStreamInput, "java.util.jar.JarInputStream", "first"));
        java.security.cert.Certificate[] initialArArchiveInputStreamInputFirstCerts = ((java.security.cert.Certificate[]) getFieldValue(arArchiveInputStreamInputInputFirst, "java.util.jar.JarEntry", "certs"));
        InputStream arArchiveInputStreamInput1 = ((InputStream) getFieldValue(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input"));
        JarEntry arArchiveInputStreamInput1InputFirst = ((JarEntry) getFieldValue(arArchiveInputStreamInput1, "java.util.jar.JarInputStream", "first"));
        java.security.CodeSigner[] initialArArchiveInputStreamInputFirstSigners = ((java.security.CodeSigner[]) getFieldValue(arArchiveInputStreamInput1InputFirst, "java.util.jar.JarEntry", "signers"));
        
        int actual = arArchiveInputStream.read();
        
        assertEquals(-1, actual);
        
        InputStream arArchiveInputStreamInput2 = ((InputStream) getFieldValue(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input"));
        JarEntry arArchiveInputStreamInput2InputFirst = ((JarEntry) getFieldValue(arArchiveInputStreamInput2, "java.util.jar.JarInputStream", "first"));
        java.security.cert.Certificate[] finalArArchiveInputStreamInputFirstCerts = ((java.security.cert.Certificate[]) getFieldValue(arArchiveInputStreamInput2InputFirst, "java.util.jar.JarEntry", "certs"));
        InputStream arArchiveInputStreamInput3 = ((InputStream) getFieldValue(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input"));
        JarEntry arArchiveInputStreamInput3InputFirst = ((JarEntry) getFieldValue(arArchiveInputStreamInput3, "java.util.jar.JarInputStream", "first"));
        java.security.CodeSigner[] finalArArchiveInputStreamInputFirstSigners = ((java.security.CodeSigner[]) getFieldValue(arArchiveInputStreamInput3InputFirst, "java.util.jar.JarEntry", "signers"));
        
        assertFalse(initialArArchiveInputStreamInputFirstCerts == finalArArchiveInputStreamInputFirstCerts);
        
        assertFalse(initialArArchiveInputStreamInputFirstSigners == finalArArchiveInputStreamInputFirstSigners);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read()
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read()}
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
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        byte[] singleByteBuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(jarInputStream);
        
        /* This test fails because method [org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read] produces [java.lang.ArithmeticException: / by zero] */
        arArchiveInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testRead_ThrowClassCastException1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties sigFileSigners = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        Object object = createInstance("java.lang.Object");
        map.put(null, object);
        setField(sigFileSigners, "java.util.Properties", "map", map);
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
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
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        byte[] singleByteBuf = {};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(jarInputStream);
        
        /* This test fails because method [org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.security.CodeSigner[]] */
        arArchiveInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testRead_ThrowClassCastException_11() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties sigFileSigners = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        Object object = createInstance("java.lang.Object");
        map.put(null, object);
        Integer integer = 0;
        map.put(integer, object);
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
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(jarInputStream);
        
        /* This test fails because method [org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.security.CodeSigner[]] */
        arArchiveInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read()}
 * @utbot.invokes {@link java.io.InputStream#read()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int ret = input.read();
 *  */
    @Test
    public void testRead_ThrowNullPointerException1() throws IOException  {
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read(ArArchiveInputStream.java:132) */
        arArchiveInputStream.read();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method read()
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read()}
 * @utbot.throwsException {@link java.io.IOException} in: final int ret = input.read();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "closed", true);
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(jarInputStream);
        
        arArchiveInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read()}
 * @utbot.throwsException {@link java.io.IOException} in: final int ret = input.read();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_1() throws Exception  {
        InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(inflaterInputStream, "java.util.zip.InflaterInputStream", "closed", true);
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(inflaterInputStream);
        
        arArchiveInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read()}
 * @utbot.throwsException {@link java.io.IOException} in: final int ret = input.read();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_2() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "closed", true);
        CheckedInputStream checkedInputStream = new CheckedInputStream(jarInputStream, null);
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(checkedInputStream);
        
        arArchiveInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read()}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: final int ret = input.read();
 *  */
    @Test(expected = ZipException.class)
    public void testRead_ThrowZipException1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        byte[] singleByteBuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(jarInputStream);
        
        arArchiveInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read()}
 * @utbot.throwsException {@link java.io.IOException} in: final int ret = input.read();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_3() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        byte[] singleByteBuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(jarInputStream);
        
        arArchiveInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read()}
 * @utbot.throwsException {@link java.io.IOException} in: final int ret = input.read();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_4() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "closed", true);
        DataInputStream dataInputStream = new DataInputStream(jarInputStream);
        CheckedInputStream checkedInputStream = new CheckedInputStream(dataInputStream, null);
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(checkedInputStream);
        
        arArchiveInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read()}
 * @utbot.throwsException {@link java.io.IOException} in: final int ret = input.read();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_5() throws Exception  {
        InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(inflaterInputStream, "java.util.zip.InflaterInputStream", "closed", true);
        CheckedInputStream checkedInputStream = new CheckedInputStream(inflaterInputStream, null);
        CheckedInputStream checkedInputStream1 = new CheckedInputStream(checkedInputStream, null);
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(checkedInputStream1);
        
        arArchiveInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read()}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: final int ret = input.read();
 *  */
    @Test(expected = ZipException.class)
    public void testRead_ThrowZipException_1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        byte[] singleByteBuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(jarInputStream);
        
        arArchiveInputStream.read();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method read()
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final int ret = input.read();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException1() throws Exception  {
        ZipInputStream zipInputStream = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        byte[] singleByteBuf = {};
        setField(zipInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(zipInputStream);
        
        arArchiveInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read()}
 * @utbot.throwsException {@link java.lang.SecurityException} in: final int ret = input.read();
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
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        byte[] singleByteBuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(jarInputStream);
        
        arArchiveInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int ret = input.read();
 *  */
    @Test(expected = NullPointerException.class)
    public void testRead_ThrowNullPointerException_1() throws Exception  {
        InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(inflaterInputStream);
        
        arArchiveInputStream.read();
    }
    ///endregion
    
    ///region Errors report for read
    
    public void testRead_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 7 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method read([B)
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[])}
 * @utbot.returnsFrom {@code return read(b, 0, b.length);}
 *  */
    @Test
    public void testRead_ReturnRead() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object input = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", -255L);
        byte[] byteArray = {};
        
        int actual = arArchiveInputStream.read(byteArray);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[])}
 * @utbot.returnsFrom {@code return read(b, 0, b.length);}
 *  */
    @Test
    public void testRead_ReturnRead_1() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(input, "java.util.jar.JarInputStream", "first", first);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        byte[] byteArray = {(byte) -127};
        
        int actual = arArchiveInputStream.read(byteArray);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[])}
 * @utbot.returnsFrom {@code return read(b, 0, b.length);}
 *  */
    @Test
    public void testRead_ReturnRead_2() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        byte[] byteArray = {};
        
        int actual = arArchiveInputStream.read(byteArray);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[])}
 * @utbot.returnsFrom {@code return read(b, 0, b.length);}
 *  */
    @Test
    public void testRead_ReturnRead_3() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(input, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        setField(input, "java.util.jar.JarInputStream", "mev", mev);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        byte[] byteArray = {};
        
        int actual = arArchiveInputStream.read(byteArray);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[])}
 * @utbot.returnsFrom {@code return read(b, 0, b.length);}
 *  */
    @Test
    public void testRead_ReturnRead_4() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(input, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(input, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(input, "java.util.jar.JarInputStream", "mev", mev);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        byte[] byteArray = {(byte) -127};
        
        int actual = arArchiveInputStream.read(byteArray);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[])}
 * @utbot.returnsFrom {@code return read(b, 0, b.length);}
 *  */
    @Test
    public void testRead_ReturnRead_5() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(input, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        setField(input, "java.util.jar.JarInputStream", "mev", mev);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        byte[] byteArray = {};
        
        int actual = arArchiveInputStream.read(byteArray);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[])}
 * @utbot.returnsFrom {@code return read(b, 0, b.length);}
 *  */
    @Test
    public void testRead_ReturnRead_6() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        PosterOutputStream baos = ((PosterOutputStream) createInstance("sun.net.www.http.PosterOutputStream"));
        setField(baos, "sun.net.www.http.PosterOutputStream", "closed", true);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(input, "java.util.jar.JarInputStream", "jv", jv);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        byte[] byteArray = {};
        
        int actual = arArchiveInputStream.read(byteArray);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[])}
 * @utbot.returnsFrom {@code return read(b, 0, b.length);}
 *  */
    @Test
    public void testRead_ReturnRead_7() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        PosterOutputStream baos = ((PosterOutputStream) createInstance("sun.net.www.http.PosterOutputStream"));
        byte[] buf = {};
        setField(baos, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(baos, "java.io.ByteArrayOutputStream", "count", 1);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(input, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(input, "java.util.jar.JarInputStream", "mev", mev);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        byte[] byteArray = {};
        
        InputStream arArchiveInputStreamInput = ((InputStream) getFieldValue(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input"));
        Object arArchiveInputStreamInputInputJv = getFieldValue(arArchiveInputStreamInput, "java.util.jar.JarInputStream", "jv");
        ByteArrayOutputStream arArchiveInputStreamInputInputJvInputJvBaos = ((ByteArrayOutputStream) getFieldValue(arArchiveInputStreamInputInputJv, "java.util.jar.JarVerifier", "baos"));
        byte[] initialArArchiveInputStreamInputJvBaosBuf = ((byte[]) getFieldValue(arArchiveInputStreamInputInputJvInputJvBaos, "java.io.ByteArrayOutputStream", "buf"));
        
        int actual = arArchiveInputStream.read(byteArray);
        
        assertEquals(0, actual);
        
        InputStream arArchiveInputStreamInput1 = ((InputStream) getFieldValue(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input"));
        Object arArchiveInputStreamInput1InputJv = getFieldValue(arArchiveInputStreamInput1, "java.util.jar.JarInputStream", "jv");
        ByteArrayOutputStream arArchiveInputStreamInput1InputJvInputJvBaos = ((ByteArrayOutputStream) getFieldValue(arArchiveInputStreamInput1InputJv, "java.util.jar.JarVerifier", "baos"));
        byte[] finalArArchiveInputStreamInputJvBaosBuf = ((byte[]) getFieldValue(arArchiveInputStreamInput1InputJvInputJvBaos, "java.io.ByteArrayOutputStream", "buf"));
        
        assertFalse(initialArArchiveInputStreamInputJvBaosBuf == finalArArchiveInputStreamInputJvBaosBuf);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[])}
 * @utbot.returnsFrom {@code return read(b, 0, b.length);}
 *  */
    @Test
    public void testRead_ReturnRead_8() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        ByteArrayOutputStream baos = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0};
        setField(baos, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(baos, "java.io.ByteArrayOutputStream", "count", 3);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(input, "java.util.jar.JarInputStream", "jv", jv);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        byte[] byteArray = {};
        
        InputStream arArchiveInputStreamInput = ((InputStream) getFieldValue(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input"));
        Object arArchiveInputStreamInputInputJv = getFieldValue(arArchiveInputStreamInput, "java.util.jar.JarInputStream", "jv");
        ByteArrayOutputStream arArchiveInputStreamInputInputJvInputJvBaos = ((ByteArrayOutputStream) getFieldValue(arArchiveInputStreamInputInputJv, "java.util.jar.JarVerifier", "baos"));
        byte[] initialArArchiveInputStreamInputJvBaosBuf = ((byte[]) getFieldValue(arArchiveInputStreamInputInputJvInputJvBaos, "java.io.ByteArrayOutputStream", "buf"));
        
        int actual = arArchiveInputStream.read(byteArray);
        
        assertEquals(0, actual);
        
        InputStream arArchiveInputStreamInput1 = ((InputStream) getFieldValue(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input"));
        Object arArchiveInputStreamInput1InputJv = getFieldValue(arArchiveInputStreamInput1, "java.util.jar.JarInputStream", "jv");
        ByteArrayOutputStream arArchiveInputStreamInput1InputJvInputJvBaos = ((ByteArrayOutputStream) getFieldValue(arArchiveInputStreamInput1InputJv, "java.util.jar.JarVerifier", "baos"));
        byte[] finalArArchiveInputStreamInputJvBaosBuf = ((byte[]) getFieldValue(arArchiveInputStreamInput1InputJvInputJvBaos, "java.io.ByteArrayOutputStream", "buf"));
        
        assertFalse(initialArArchiveInputStreamInputJvBaosBuf == finalArArchiveInputStreamInputJvBaosBuf);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[])}
 * @utbot.returnsFrom {@code return read(b, 0, b.length);}
 *  */
    @Test
    public void testRead_ReturnRead_9() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(input, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        Object cloneableDelegate = createInstance("java.security.MessageDigest$Delegate$CloneableDelegate");
        SHAKE256 digestSpi = ((SHAKE256) createInstance("sun.security.provider.SHAKE256"));
        setField(cloneableDelegate, "java.security.MessageDigest$Delegate", "digestSpi", digestSpi);
        digests.add(cloneableDelegate);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        setField(input, "java.util.jar.JarInputStream", "mev", mev);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        byte[] byteArray = {};
        
        int actual = arArchiveInputStream.read(byteArray);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read([B)
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[])}
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
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(jarInputStream);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read] produces [java.lang.ArithmeticException: / by zero] */
        arArchiveInputStream.read(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[])}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testRead_ThrowClassCastException2() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties sigFileSigners = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        Object object = createInstance("java.lang.Object");
        map.put(null, object);
        setField(sigFileSigners, "java.util.Properties", "map", map);
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
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
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(jarInputStream);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.security.CodeSigner[]] */
        arArchiveInputStream.read(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return read(b, 0, b.length);
 *  */
    @Test
    public void testRead_ThrowNullPointerException2() throws IOException  {
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read(ArArchiveInputStream.java:138) */
        arArchiveInputStream.read(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method read([B)
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: return read(b, 0, b.length);
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException2() throws Exception  {
        Object zipFileInflaterInputStream = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(zipFileInflaterInputStream, "java.util.zip.InflaterInputStream", "closed", true);
        Class arArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream");
        Class zipFileInflaterInputStreamType = Class.forName("java.io.InputStream");
        Constructor arArchiveInputStreamConstructor = arArchiveInputStreamClazz.getDeclaredConstructor(zipFileInflaterInputStreamType);
        arArchiveInputStreamConstructor.setAccessible(true);
        java.lang.Object[] arArchiveInputStreamConstructorArguments = new java.lang.Object[1];
        arArchiveInputStreamConstructorArguments[0] = zipFileInflaterInputStream;
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) arArchiveInputStreamConstructor.newInstance(arArchiveInputStreamConstructorArguments));
        byte[] byteArray = {(byte) -127};
        
        arArchiveInputStream.read(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: return read(b, 0, b.length);
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_11() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "closed", true);
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(jarInputStream);
        byte[] byteArray = {(byte) -127};
        
        arArchiveInputStream.read(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: return read(b, 0, b.length);
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_21() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(jarInputStream);
        byte[] byteArray = {(byte) -127};
        
        arArchiveInputStream.read(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[])}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: return read(b, 0, b.length);
 *  */
    @Test(expected = ZipException.class)
    public void testRead_ThrowZipException2() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(jarInputStream);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        arArchiveInputStream.read(byteArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method read([B)
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[])}
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
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(jarInputStream);
        byte[] byteArray = {};
        
        arArchiveInputStream.read(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[])}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} 
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testRead_ThrowOutOfMemoryError1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        DerOutputStream baos = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf = new byte[32];
        setField(baos, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(baos, "java.io.ByteArrayOutputStream", "count", -2147483647);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(jarInputStream);
        byte[] byteArray = {};
        
        arArchiveInputStream.read(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#read(byte[])}
 * @utbot.throwsException {@link java.lang.SecurityException} in: return read(b, 0, b.length);
 *  */
    @Test(expected = SecurityException.class)
    public void testRead_ThrowSecurityException2() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Sun sigFileSigners = ((Sun) createInstance("sun.security.provider.Sun"));
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(jarInputStream);
        byte[] byteArray = {(byte) -127};
        
        arArchiveInputStream.read(byteArray);
    }
    ///endregion
    
    ///region Errors report for read
    
    public void testRead_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.ar.ArArchiveInputStream.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method close()
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#close()}
 * @utbot.executesCondition {@code (!closed): False}
 *  */
    @Test
    public void testClose_Closed() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "closed", true);
        
        arArchiveInputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#close()}
 * @utbot.executesCondition {@code (!closed): True}
 *  */
    @Test
    public void testClose_NotClosed() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        GZIPInputStream input = ((GZIPInputStream) createInstance("java.util.zip.GZIPInputStream"));
        setField(input, "java.util.zip.GZIPInputStream", "closed", true);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        
        arArchiveInputStream.close();
        
        boolean finalArArchiveInputStreamClosed = ((Boolean) getFieldValue(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "closed"));
        
        assertTrue(finalArArchiveInputStreamClosed);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#close()}
 * @utbot.executesCondition {@code (!closed): True}
 *  */
    @Test
    public void testClose_NotClosed_1() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        GZIPInputStream input = ((GZIPInputStream) createInstance("java.util.zip.GZIPInputStream"));
        setField(input, "java.util.zip.InflaterInputStream", "closed", true);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        
        arArchiveInputStream.close();
        
        InputStream arArchiveInputStreamInput = ((InputStream) getFieldValue(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input"));
        boolean finalArArchiveInputStreamInputEos = ((Boolean) getFieldValue(arArchiveInputStreamInput, "java.util.zip.GZIPInputStream", "eos"));
        InputStream arArchiveInputStreamInput1 = ((InputStream) getFieldValue(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input"));
        boolean finalArArchiveInputStreamInputClosed = ((Boolean) getFieldValue(arArchiveInputStreamInput1, "java.util.zip.GZIPInputStream", "closed"));
        boolean finalArArchiveInputStreamClosed = ((Boolean) getFieldValue(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "closed"));
        
        assertTrue(finalArArchiveInputStreamInputEos);
        
        assertTrue(finalArArchiveInputStreamInputClosed);
        
        assertTrue(finalArArchiveInputStreamClosed);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method close()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (!closed): True}
    /// invoke:
    ///     {@link java.io.InputStream#close()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#close()}
 *  */
    @Test
    public void testClose() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(input, "java.util.zip.ZipInputStream", "closed", true);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        
        arArchiveInputStream.close();
        
        boolean finalArArchiveInputStreamClosed = ((Boolean) getFieldValue(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "closed"));
        
        assertTrue(finalArArchiveInputStreamClosed);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_1() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(input, "java.util.zip.InflaterInputStream", "closed", true);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        
        arArchiveInputStream.close();
        
        InputStream arArchiveInputStreamInput = ((InputStream) getFieldValue(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input"));
        boolean finalArArchiveInputStreamInputClosed = ((Boolean) getFieldValue(arArchiveInputStreamInput, "java.util.zip.ZipInputStream", "closed"));
        boolean finalArArchiveInputStreamClosed = ((Boolean) getFieldValue(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "closed"));
        
        assertTrue(finalArArchiveInputStreamInputClosed);
        
        assertTrue(finalArArchiveInputStreamClosed);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_2() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(input, "java.io.FilterInputStream", "in", in);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        
        arArchiveInputStream.close();
        
        InputStream arArchiveInputStreamInput = ((InputStream) getFieldValue(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input"));
        boolean finalArArchiveInputStreamInputClosed = ((Boolean) getFieldValue(arArchiveInputStreamInput, "java.util.zip.ZipInputStream", "closed"));
        InputStream arArchiveInputStreamInput1 = ((InputStream) getFieldValue(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input"));
        boolean finalArArchiveInputStreamInputClosed1 = ((Boolean) getFieldValue(arArchiveInputStreamInput1, "java.util.zip.InflaterInputStream", "closed"));
        InputStream arArchiveInputStreamInput2 = ((InputStream) getFieldValue(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input"));
        InputStream arArchiveInputStreamInput2InputIn = ((InputStream) getFieldValue(arArchiveInputStreamInput2, "java.io.FilterInputStream", "in"));
        boolean finalArArchiveInputStreamInputInClosed = ((Boolean) getFieldValue(arArchiveInputStreamInput2InputIn, "java.util.zip.ZipInputStream", "closed"));
        boolean finalArArchiveInputStreamClosed = ((Boolean) getFieldValue(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "closed"));
        
        assertTrue(finalArArchiveInputStreamInputClosed);
        
        assertTrue(finalArArchiveInputStreamInputClosed1);
        
        assertTrue(finalArArchiveInputStreamInputInClosed);
        
        assertTrue(finalArArchiveInputStreamClosed);
    }
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_3() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        GZIPInputStream in = ((GZIPInputStream) createInstance("java.util.zip.GZIPInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(input, "java.io.FilterInputStream", "in", in);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        
        arArchiveInputStream.close();
        
        InputStream arArchiveInputStreamInput = ((InputStream) getFieldValue(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input"));
        boolean finalArArchiveInputStreamInputClosed = ((Boolean) getFieldValue(arArchiveInputStreamInput, "java.util.zip.ZipInputStream", "closed"));
        InputStream arArchiveInputStreamInput1 = ((InputStream) getFieldValue(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input"));
        boolean finalArArchiveInputStreamInputClosed1 = ((Boolean) getFieldValue(arArchiveInputStreamInput1, "java.util.zip.InflaterInputStream", "closed"));
        InputStream arArchiveInputStreamInput2 = ((InputStream) getFieldValue(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input"));
        InputStream arArchiveInputStreamInput2InputIn = ((InputStream) getFieldValue(arArchiveInputStreamInput2, "java.io.FilterInputStream", "in"));
        boolean finalArArchiveInputStreamInputInEos = ((Boolean) getFieldValue(arArchiveInputStreamInput2InputIn, "java.util.zip.GZIPInputStream", "eos"));
        InputStream arArchiveInputStreamInput3 = ((InputStream) getFieldValue(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input"));
        InputStream arArchiveInputStreamInput3InputIn = ((InputStream) getFieldValue(arArchiveInputStreamInput3, "java.io.FilterInputStream", "in"));
        boolean finalArArchiveInputStreamInputInClosed = ((Boolean) getFieldValue(arArchiveInputStreamInput3InputIn, "java.util.zip.GZIPInputStream", "closed"));
        boolean finalArArchiveInputStreamClosed = ((Boolean) getFieldValue(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "closed"));
        
        assertTrue(finalArArchiveInputStreamInputClosed);
        
        assertTrue(finalArArchiveInputStreamInputClosed1);
        
        assertTrue(finalArArchiveInputStreamInputInEos);
        
        assertTrue(finalArArchiveInputStreamInputInClosed);
        
        assertTrue(finalArArchiveInputStreamClosed);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#close()}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.invokes {@link java.io.InputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: input.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.ar.ArArchiveInputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.close(ArArchiveInputStream.java:127) */
        arArchiveInputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#close()}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.invokes {@link java.io.InputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testClose_ThrowNullPointerException_1() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        JarInputStream input = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        Object cleanable = createInstance("java.io.FileCleanable");
        setField(zsRef, "java.util.zip.Inflater$InflaterZStreamRef", "cleanable", cleanable);
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(input, "java.util.zip.InflaterInputStream", "inf", inf);
        setField(input, "java.util.zip.InflaterInputStream", "usesDefaultInflater", true);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "input", input);
        
        arArchiveInputStream.close();
    }
    ///endregion
    
    ///region Errors report for close
    
    public void testClose_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 19 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        /* Unable to make field private static final java.util.concurrent.atomic.AtomicInteger sun.net.ResourceManager.numSockets accessible:
        module java.base does not "opens sun.net" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextArEntry
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNextArEntry()
    
    /**
    @utbot.classUnderTest {@link ArArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ar.ArArchiveInputStream#getNextArEntry()}
 * @utbot.executesCondition {@code (offset == 0): False}
 * @utbot.invokes {@link java.io.InputStream#available()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: input.available() == 0
 *  */
    @Test
    public void testGetNextArEntry_ThrowNullPointerException() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", -255L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextArEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextArEntry(ArArchiveInputStream.java:79) */
        arArchiveInputStream.getNextArEntry();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getNextArEntry()
    
    @Test
    public void testGetNextArEntry1() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextArEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read(ArArchiveInputStream.java:143)
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read(ArArchiveInputStream.java:138)
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextArEntry(ArArchiveInputStream.java:66) */
        arArchiveInputStream.getNextArEntry();
    }
    ///endregion
    
    ///region Errors report for getNextArEntry
    
    public void testGetNextArEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextEntry
    
    ///region OTHER: ERROR SUITE for method getNextEntry()
    
    @Test
    public void testGetNextEntry1() throws Exception  {
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read(ArArchiveInputStream.java:143)
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read(ArArchiveInputStream.java:138)
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextArEntry(ArArchiveInputStream.java:66)
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextEntry(ArArchiveInputStream.java:121) */
        arArchiveInputStream.getNextEntry();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields968262070534900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields968262070534900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass968262070542300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields968262070534900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass968262070542300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields968262070997800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields968262070997800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass968262071003300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields968262070997800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass968262071003300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


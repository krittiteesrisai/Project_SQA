package org.apache.commons.compress.archivers.cpio;

import org.junit.Test;
import java.io.IOException;
import java.util.zip.InflaterInputStream;
import java.io.InputStream;
import java.util.jar.JarInputStream;
import java.util.zip.Inflater;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.Hashtable;
import java.util.Properties;
import sun.security.util.ManifestEntryVerifier;
import java.util.ArrayList;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.io.EOFException;
import java.util.LinkedHashMap;
import java.lang.reflect.Constructor;
import java.util.jar.JarEntry;
import java.util.zip.ZipException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_compress_archivers_cpio_CpioArchiveInputStreamTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method matches([B, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (length < 6): False},
    ///     {@code (signature[0] != 0x30): True}
    /// return from: {@code return false;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (signature[0] == 0x71): False}
 * @utbot.executesCondition {@code (signature[1] == 0x71): False}
 *  */
    @Test
    public void testMatches_1OfSignatureNotEquals0x71() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        boolean actual = CpioArchiveInputStream.matches(byteArray, 6);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (signature[0] == 0x71): False}
 * @utbot.executesCondition {@code (signature[1] == 0x71): True}
 * @utbot.executesCondition {@code ((signature[0] & 0xFF) == 0xc7): False}
 *  */
    @Test
    public void testMatches_0OfSignatureBitwiseAnd0xFFNotEquals0xc7() {
        byte[] byteArray = {(byte) -127, (byte) 113};
        
        boolean actual = CpioArchiveInputStream.matches(byteArray, 6);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (signature[0] == 0x71): True}
 * @utbot.executesCondition {@code ((signature[1] & 0xFF) == 0xc7): False}
 * @utbot.executesCondition {@code (signature[1] == 0x71): False}
 *  */
    @Test
    public void testMatches_1OfSignatureBitwiseAnd0xFFNotEquals0xc7() {
        byte[] byteArray = {(byte) 113, (byte) -127};
        
        boolean actual = CpioArchiveInputStream.matches(byteArray, 6);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method matches([B, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 6): False}
 * @utbot.executesCondition {@code (signature[0] == 0x71): False}
 * @utbot.executesCondition {@code (signature[1] == 0x71): True}
 * @utbot.executesCondition {@code ((signature[0] & 0xFF) == 0xc7): True}
 *  */
    @Test
    public void testMatches_0OfSignatureBitwiseAnd0xFFEquals0xc7() {
        byte[] byteArray = {(byte) -57, (byte) 113};
        
        boolean actual = CpioArchiveInputStream.matches(byteArray, 6);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 6): False}
 * @utbot.executesCondition {@code (signature[0] == 0x71): False}
 * @utbot.executesCondition {@code (signature[1] == 0x71): False}
 * @utbot.executesCondition {@code (signature[0] != 0x30): False}
 * @utbot.executesCondition {@code (signature[1] != 0x37): True}
 *  */
    @Test
    public void testMatches_1OfSignatureNotEquals0x37() {
        byte[] byteArray = {(byte) 48, (byte) -127};
        
        boolean actual = CpioArchiveInputStream.matches(byteArray, 6);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 6): False}
 * @utbot.executesCondition {@code (signature[0] == 0x71): False}
 * @utbot.executesCondition {@code (signature[1] == 0x71): False}
 * @utbot.executesCondition {@code (signature[0] != 0x30): False}
 * @utbot.executesCondition {@code (signature[1] != 0x37): False}
 * @utbot.executesCondition {@code (signature[2] != 0x30): True}
 *  */
    @Test
    public void testMatches_2OfSignatureNotEquals0x30() {
        byte[] byteArray = new byte[11];
        byteArray[0] = (byte) 48;
        byteArray[1] = (byte) 55;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        
        boolean actual = CpioArchiveInputStream.matches(byteArray, 6);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 6): False}
 * @utbot.executesCondition {@code (signature[0] == 0x71): False}
 * @utbot.executesCondition {@code (signature[1] == 0x71): False}
 * @utbot.executesCondition {@code (signature[0] != 0x30): False}
 * @utbot.executesCondition {@code (signature[1] != 0x37): False}
 * @utbot.executesCondition {@code (signature[2] != 0x30): False}
 * @utbot.executesCondition {@code (signature[3] != 0x37): True}
 *  */
    @Test
    public void testMatches_3OfSignatureNotEquals0x37() {
        byte[] byteArray = {
            (byte) 48, (byte) 55, (byte) 48, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127,
            (byte) -127
        };
        
        boolean actual = CpioArchiveInputStream.matches(byteArray, 6);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 6): False}
 * @utbot.executesCondition {@code (signature[0] == 0x71): False}
 * @utbot.executesCondition {@code (signature[1] == 0x71): False}
 * @utbot.executesCondition {@code (signature[0] != 0x30): False}
 * @utbot.executesCondition {@code (signature[1] != 0x37): False}
 * @utbot.executesCondition {@code (signature[2] != 0x30): False}
 * @utbot.executesCondition {@code (signature[3] != 0x37): False}
 * @utbot.executesCondition {@code (signature[4] != 0x30): False}
 * @utbot.executesCondition {@code (signature[5] == 0x31): True}
 *  */
    @Test
    public void testMatches_5OfSignatureEquals0x31() {
        byte[] byteArray = new byte[14];
        byteArray[0] = (byte) 48;
        byteArray[1] = (byte) 55;
        byteArray[2] = (byte) 48;
        byteArray[3] = (byte) 55;
        byteArray[4] = (byte) 48;
        byteArray[5] = (byte) 49;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        
        boolean actual = CpioArchiveInputStream.matches(byteArray, 6);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 6): False}
 * @utbot.executesCondition {@code (signature[0] == 0x71): False}
 * @utbot.executesCondition {@code (signature[1] == 0x71): False}
 * @utbot.executesCondition {@code (signature[0] != 0x30): False}
 * @utbot.executesCondition {@code (signature[1] != 0x37): False}
 * @utbot.executesCondition {@code (signature[2] != 0x30): False}
 * @utbot.executesCondition {@code (signature[3] != 0x37): False}
 * @utbot.executesCondition {@code (signature[4] != 0x30): True}
 *  */
    @Test
    public void testMatches_4OfSignatureNotEquals0x30() {
        byte[] byteArray = new byte[13];
        byteArray[0] = (byte) 48;
        byteArray[1] = (byte) 55;
        byteArray[2] = (byte) 48;
        byteArray[3] = (byte) 55;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        
        boolean actual = CpioArchiveInputStream.matches(byteArray, 6);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 6): False}
 * @utbot.executesCondition {@code (signature[0] == 0x71): False}
 * @utbot.executesCondition {@code (signature[1] == 0x71): False}
 * @utbot.executesCondition {@code (signature[0] != 0x30): False}
 * @utbot.executesCondition {@code (signature[1] != 0x37): False}
 * @utbot.executesCondition {@code (signature[2] != 0x30): False}
 * @utbot.executesCondition {@code (signature[3] != 0x37): False}
 * @utbot.executesCondition {@code (signature[4] != 0x30): False}
 * @utbot.executesCondition {@code (signature[5] == 0x31): False}
 * @utbot.executesCondition {@code (signature[5] == 0x32): True}
 *  */
    @Test
    public void testMatches_5OfSignatureEquals0x32() {
        byte[] byteArray = new byte[14];
        byteArray[0] = (byte) 48;
        byteArray[1] = (byte) 55;
        byteArray[2] = (byte) 48;
        byteArray[3] = (byte) 55;
        byteArray[4] = (byte) 48;
        byteArray[5] = (byte) 50;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        
        boolean actual = CpioArchiveInputStream.matches(byteArray, 6);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 6): False}
 * @utbot.executesCondition {@code (signature[0] == 0x71): False}
 * @utbot.executesCondition {@code (signature[1] == 0x71): False}
 * @utbot.executesCondition {@code (signature[0] != 0x30): False}
 * @utbot.executesCondition {@code (signature[1] != 0x37): False}
 * @utbot.executesCondition {@code (signature[2] != 0x30): False}
 * @utbot.executesCondition {@code (signature[3] != 0x37): False}
 * @utbot.executesCondition {@code (signature[4] != 0x30): False}
 * @utbot.executesCondition {@code (signature[5] == 0x31): False}
 * @utbot.executesCondition {@code (signature[5] == 0x32): False}
 * @utbot.executesCondition {@code (signature[5] == 0x37): False}
 *  */
    @Test
    public void testMatches_5OfSignatureNotEquals0x37() {
        byte[] byteArray = new byte[14];
        byteArray[0] = (byte) 48;
        byteArray[1] = (byte) 55;
        byteArray[2] = (byte) 48;
        byteArray[3] = (byte) 55;
        byteArray[4] = (byte) 48;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        
        boolean actual = CpioArchiveInputStream.matches(byteArray, 6);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 6): False}
 * @utbot.executesCondition {@code (signature[0] == 0x71): False}
 * @utbot.executesCondition {@code (signature[1] == 0x71): False}
 * @utbot.executesCondition {@code (signature[0] != 0x30): False}
 * @utbot.executesCondition {@code (signature[1] != 0x37): False}
 * @utbot.executesCondition {@code (signature[2] != 0x30): False}
 * @utbot.executesCondition {@code (signature[3] != 0x37): False}
 * @utbot.executesCondition {@code (signature[4] != 0x30): False}
 * @utbot.executesCondition {@code (signature[5] == 0x31): False}
 * @utbot.executesCondition {@code (signature[5] == 0x32): False}
 * @utbot.executesCondition {@code (signature[5] == 0x37): True}
 *  */
    @Test
    public void testMatches_5OfSignatureEquals0x37() {
        byte[] byteArray = new byte[14];
        byteArray[0] = (byte) 48;
        byteArray[1] = (byte) 55;
        byteArray[2] = (byte) 48;
        byteArray[3] = (byte) 55;
        byteArray[4] = (byte) 48;
        byteArray[5] = (byte) 55;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        
        boolean actual = CpioArchiveInputStream.matches(byteArray, 6);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 6): False}
 * @utbot.executesCondition {@code (signature[0] == 0x71): True}
 * @utbot.executesCondition {@code ((signature[1] & 0xFF) == 0xc7): True}
 *  */
    @Test
    public void testMatches_1OfSignatureBitwiseAnd0xFFEquals0xc7() {
        byte[] byteArray = {(byte) 113, (byte) -57};
        
        boolean actual = CpioArchiveInputStream.matches(byteArray, 6);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 6): True}
 *  */
    @Test
    public void testMatches_LengthLessThan6() {
        boolean actual = CpioArchiveInputStream.matches(null, 5);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matches([B, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#matches(byte[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: signature[0] == 0x71 && (signature[1] & 0xFF) == 0xc7
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(CpioArchiveInputStream.java:488) */
        CpioArchiveInputStream.matches(byteArray, 6);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (signature[0] == 0x71): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: signature[0] == 0x71 && (signature[1] & 0xFF) == 0xc7
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException_1() {
        byte[] byteArray = {(byte) 113};
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(CpioArchiveInputStream.java:488) */
        CpioArchiveInputStream.matches(byteArray, 6);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (signature[0] == 0x71): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: signature[1] == 0x71 && (signature[0] & 0xFF) == 0xc7
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException_2() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(CpioArchiveInputStream.java:491) */
        CpioArchiveInputStream.matches(byteArray, 6);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (signature[0] == 0x71): False}
 * @utbot.executesCondition {@code (signature[1] == 0x71): False}
 * @utbot.executesCondition {@code (signature[0] != 0x30): False}
 * @utbot.executesCondition {@code (signature[1] != 0x37): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: signature[2] != 0x30
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException_3() {
        byte[] byteArray = {(byte) 48, (byte) 55};
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(CpioArchiveInputStream.java:503) */
        CpioArchiveInputStream.matches(byteArray, 6);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (signature[0] == 0x71): False}
 * @utbot.executesCondition {@code (signature[1] == 0x71): False}
 * @utbot.executesCondition {@code (signature[0] != 0x30): False}
 * @utbot.executesCondition {@code (signature[1] != 0x37): False}
 * @utbot.executesCondition {@code (signature[2] != 0x30): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: signature[3] != 0x37
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException_4() {
        byte[] byteArray = {(byte) 48, (byte) 55, (byte) 48};
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(CpioArchiveInputStream.java:506) */
        CpioArchiveInputStream.matches(byteArray, 6);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (signature[0] == 0x71): False}
 * @utbot.executesCondition {@code (signature[1] == 0x71): False}
 * @utbot.executesCondition {@code (signature[0] != 0x30): False}
 * @utbot.executesCondition {@code (signature[1] != 0x37): False}
 * @utbot.executesCondition {@code (signature[2] != 0x30): False}
 * @utbot.executesCondition {@code (signature[3] != 0x37): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: signature[4] != 0x30
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException_5() {
        byte[] byteArray = {(byte) 48, (byte) 55, (byte) 48, (byte) 55};
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(CpioArchiveInputStream.java:509) */
        CpioArchiveInputStream.matches(byteArray, 6);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (signature[0] == 0x71): False}
 * @utbot.executesCondition {@code (signature[1] == 0x71): False}
 * @utbot.executesCondition {@code (signature[0] != 0x30): False}
 * @utbot.executesCondition {@code (signature[1] != 0x37): False}
 * @utbot.executesCondition {@code (signature[2] != 0x30): False}
 * @utbot.executesCondition {@code (signature[3] != 0x37): False}
 * @utbot.executesCondition {@code (signature[4] != 0x30): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: signature[5] == 0x31
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException_6() {
        byte[] byteArray = {(byte) 48, (byte) 55, (byte) 48, (byte) 55, (byte) 48};
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(CpioArchiveInputStream.java:513) */
        CpioArchiveInputStream.matches(byteArray, 6);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#matches(byte[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: signature[0] == 0x71 && (signature[1] & 0xFF) == 0xc7
 *  */
    @Test
    public void testMatches_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(CpioArchiveInputStream.java:488) */
        CpioArchiveInputStream.matches(null, 6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.read
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len == 0): True}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testRead_LenEqualsZero() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        byte[] byteArray = {};
        
        int actual = cpioArchiveInputStream.read(byteArray, 0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.entryEOF): True}
 *  */
    @Test
    public void testRead_ThisEntryEOF() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF", true);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        int actual = cpioArchiveInputStream.read(byteArray, 0, 2);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.entryEOF): False}
 * @utbot.executesCondition {@code (this.entryBytesRead == this.entry.getSize()): True}
 * @utbot.executesCondition {@code (this.entry.getFormat() == FORMAT_NEW_CRC): False}
 *  */
    @Test
    public void testRead_ThisEntryGetFormatNotEqualsFORMAT_NEW_CRC() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -255);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", -1);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -128L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", -128L);
        byte[] byteArray = {(byte) -127};
        
        int actual = cpioArchiveInputStream.read(byteArray, 0, 1);
        
        assertEquals(-1, actual);
        
        boolean finalCpioArchiveInputStreamEntryEOF = ((Boolean) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF"));
        
        assertTrue(finalCpioArchiveInputStreamEntryEOF);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.entryEOF): False}
 * @utbot.executesCondition {@code (this.entryBytesRead == this.entry.getSize()): True}
 * @utbot.executesCondition {@code (this.entry.getFormat() == FORMAT_NEW_CRC): False}
 *  */
    @Test
    public void testRead_ThisEntryGetFormatNotEqualsFORMAT_NEW_CRC_1() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", java.lang.Short.MIN_VALUE);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -255L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", -255L);
        byte[] byteArray = {(byte) -127};
        
        int actual = cpioArchiveInputStream.read(byteArray, 0, 1);
        
        assertEquals(-1, actual);
        
        boolean finalCpioArchiveInputStreamEntryEOF = ((Boolean) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF"));
        
        assertTrue(finalCpioArchiveInputStreamEntryEOF);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.entryEOF): False}
 * @utbot.executesCondition {@code (this.entryBytesRead == this.entry.getSize()): True}
 * @utbot.executesCondition {@code (this.entry.getFormat() == FORMAT_NEW_CRC): True}
 * @utbot.executesCondition {@code (this.crc != this.entry.getChksum()): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getChksum()}
 *  */
    @Test
    public void testRead_ThisCrcEqualsThisEntryGetChksum() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", -2);
        entry.setChksum(0L);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 1L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "crc", 0L);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        int actual = cpioArchiveInputStream.read(byteArray, 0, 2);
        
        assertEquals(-1, actual);
        
        boolean finalCpioArchiveInputStreamEntryEOF = ((Boolean) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF"));
        
        assertTrue(finalCpioArchiveInputStreamEntryEOF);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.entryEOF): False}
 * @utbot.executesCondition {@code (this.entryBytesRead == this.entry.getSize()): False}
 * @utbot.executesCondition {@code (tmplength < 0): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getSize()}
 * @utbot.invokes {@link java.lang.Math#min(long,long)}
 *  */
    @Test
    public void testRead_TmplengthLessThanZero() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 255L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 256L);
        byte[] byteArray = {(byte) -127};
        
        int actual = cpioArchiveInputStream.read(byteArray, 0, 1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): True}
 *  */
    @Test
    public void testRead_ThisEntryEqualsNull() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        byte[] byteArray = {(byte) -127};
        
        int actual = cpioArchiveInputStream.read(byteArray, 0, 1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (off < 0): False}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: off < 0 || len < 0 || off > b.length - len
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_2() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
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
        byteArray[25] = (byte) -127;
        byteArray[26] = (byte) -127;
        byteArray[27] = (byte) -127;
        byteArray[28] = (byte) -127;
        byteArray[29] = (byte) -127;
        byteArray[30] = (byte) -127;
        byteArray[31] = (byte) 1;
        byteArray[32] = (byte) -127;
        byteArray[33] = (byte) -127;
        byteArray[34] = (byte) -127;
        
        cpioArchiveInputStream.read(byteArray, 6, 30);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (off < 0): False}
 * @utbot.executesCondition {@code (len < 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: off < 0 || len < 0 || off > b.length - len
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        
        cpioArchiveInputStream.read(null, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (off < 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: off < 0 || len < 0 || off > b.length - len
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_1() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        
        cpioArchiveInputStream.read(null, -1, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: ensureOpen();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "closed", true);
        
        cpioArchiveInputStream.read(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (off < 0): False}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.entryEOF): False}
 * @utbot.executesCondition {@code (this.entryBytesRead == this.entry.getSize()): True}
 * @utbot.executesCondition {@code (this.entry.getFormat() == FORMAT_NEW_CRC): True}
 * @utbot.executesCondition {@code (this.crc != this.entry.getChksum()): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getSize()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getDataPadCount()}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(int)
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getFormat()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getChksum()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getBytesRead()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.io.IOException} in: getBytesRead()
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_1() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", -65);
        entry.setChksum(0L);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 1L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "crc", 1L);
        byte[] byteArray = {(byte) -126, (byte) -126};
        
        cpioArchiveInputStream.read(byteArray, 0, 2);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (off < 0): False}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#ensureOpen()
 * @utbot.throwsException {@link java.lang.NullPointerException} when: off < 0 || len < 0 || off > b.length - len
 *  */
    @Test
    public void testRead_ThrowNullPointerException() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.read] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.read(CpioArchiveInputStream.java:253) */
        cpioArchiveInputStream.read(null, 0, 0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method read([B, int, int)
    
    @Test
    public void testRead1() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 0L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", -2L);
        byte[] byteArray = new byte[37];
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.read] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(CpioArchiveInputStream.java:296)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.read(CpioArchiveInputStream.java:278) */
        cpioArchiveInputStream.read(byteArray, 3, 3);
    }
    
    @Test
    public void testRead2() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 899);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 15630955331469493L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 15630955331469493L);
        byte[] byteArray = new byte[40];
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.read] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(CpioArchiveInputStream.java:296)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(CpioArchiveInputStream.java:229)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.read(CpioArchiveInputStream.java:263) */
        cpioArchiveInputStream.read(byteArray, 37, 2);
    }
    ///endregion
    
    ///region Errors report for read
    
    public void testRead_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method close()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#close()}
 * @utbot.executesCondition {@code (!this.closed): False}
 *  */
    @Test
    public void testClose_ThisClosed() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "closed", true);
        
        cpioArchiveInputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#close()}
 * @utbot.executesCondition {@code (!this.closed): True}
 *  */
    @Test
    public void testClose_NotThisClosed() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
        cpioArchiveInputStream.close();
        
        boolean finalCpioArchiveInputStreamClosed = ((Boolean) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "closed"));
        
        assertTrue(finalCpioArchiveInputStreamClosed);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#close()}
 * @utbot.executesCondition {@code (!this.closed): True}
 *  */
    @Test
    public void testClose_NotThisClosed_1() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
        cpioArchiveInputStream.close();
        
        boolean finalCpioArchiveInputStreamClosed = ((Boolean) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "closed"));
        InputStream cpioArchiveInputStreamIn = ((InputStream) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in"));
        boolean finalCpioArchiveInputStreamInClosed = ((Boolean) getFieldValue(cpioArchiveInputStreamIn, "java.util.zip.InflaterInputStream", "closed"));
        
        assertTrue(finalCpioArchiveInputStreamClosed);
        
        assertTrue(finalCpioArchiveInputStreamInClosed);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method close()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (!this.closed): True}
    /// invoke:
    ///     {@link java.io.InputStream#close()} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#close()}
 *  */
    @Test
    public void testClose() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
        cpioArchiveInputStream.close();
        
        boolean finalCpioArchiveInputStreamClosed = ((Boolean) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "closed"));
        
        assertTrue(finalCpioArchiveInputStreamClosed);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_1() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
        cpioArchiveInputStream.close();
        
        boolean finalCpioArchiveInputStreamClosed = ((Boolean) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "closed"));
        InputStream cpioArchiveInputStreamIn = ((InputStream) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in"));
        boolean finalCpioArchiveInputStreamInClosed = ((Boolean) getFieldValue(cpioArchiveInputStreamIn, "java.util.zip.ZipInputStream", "closed"));
        
        assertTrue(finalCpioArchiveInputStreamClosed);
        
        assertTrue(finalCpioArchiveInputStreamInClosed);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_2() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in1, "java.util.zip.ZipInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
        cpioArchiveInputStream.close();
        
        boolean finalCpioArchiveInputStreamClosed = ((Boolean) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "closed"));
        InputStream cpioArchiveInputStreamIn = ((InputStream) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in"));
        boolean finalCpioArchiveInputStreamInClosed = ((Boolean) getFieldValue(cpioArchiveInputStreamIn, "java.util.zip.ZipInputStream", "closed"));
        InputStream cpioArchiveInputStreamIn1 = ((InputStream) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in"));
        boolean finalCpioArchiveInputStreamInClosed1 = ((Boolean) getFieldValue(cpioArchiveInputStreamIn1, "java.util.zip.InflaterInputStream", "closed"));
        
        assertTrue(finalCpioArchiveInputStreamClosed);
        
        assertTrue(finalCpioArchiveInputStreamInClosed);
        
        assertTrue(finalCpioArchiveInputStreamInClosed1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#close()}
 * @utbot.executesCondition {@code (!this.closed): True}
 * @utbot.invokes {@link java.io.InputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: in.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.close(CpioArchiveInputStream.java:143) */
        cpioArchiveInputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#close()}
 * @utbot.executesCondition {@code (!this.closed): True}
 * @utbot.invokes {@link java.io.InputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testClose_ThrowNullPointerException_1() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        Object cleanable = createInstance("java.net.SocketCleanable");
        setField(zsRef, "java.util.zip.Inflater$InflaterZStreamRef", "cleanable", cleanable);
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(in, "java.util.zip.InflaterInputStream", "inf", inf);
        setField(in, "java.util.zip.InflaterInputStream", "usesDefaultInflater", true);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
        cpioArchiveInputStream.close();
    }
    ///endregion
    
    ///region Errors report for close
    
    public void testClose_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 21 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 5 occurrences of:
        /* Unable to make field private static final java.util.concurrent.atomic.AtomicInteger sun.net.ResourceManager.numSockets accessible:
        module java.base does not "opens sun.net" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method skip(long)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(long)}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testSkip_ReturnTotal() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        
        long actual = cpioArchiveInputStream.skip(0L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(long)}
 * @utbot.iterates iterate the loop {@code while(total < max)} once
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testSkip_LenGreaterThanThisTmpbufLength() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", java.lang.Short.MIN_VALUE);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 1);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 193L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 193L);
        byte[] tmpbuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        long actual = cpioArchiveInputStream.skip(2L);
        
        assertEquals(0L, actual);
        
        boolean finalCpioArchiveInputStreamEntryEOF = ((Boolean) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF"));
        
        assertTrue(finalCpioArchiveInputStreamEntryEOF);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(long)}
 * @utbot.iterates iterate the loop {@code while(total < max)} once
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testSkip_LenGreaterThanThisTmpbufLength_1() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", java.lang.Short.MIN_VALUE);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -255L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", -255L);
        byte[] tmpbuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        long actual = cpioArchiveInputStream.skip(2L);
        
        assertEquals(0L, actual);
        
        boolean finalCpioArchiveInputStreamEntryEOF = ((Boolean) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF"));
        
        assertTrue(finalCpioArchiveInputStreamEntryEOF);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(long)}
 * @utbot.iterates iterate the loop {@code while(total < max)} once
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testSkip_LenGreaterThanThisTmpbufLength_2() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", -8);
        entry.setChksum(0L);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 4L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 4L);
        byte[] tmpbuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "crc", 0L);
        
        long actual = cpioArchiveInputStream.skip(2L);
        
        assertEquals(0L, actual);
        
        boolean finalCpioArchiveInputStreamEntryEOF = ((Boolean) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF"));
        
        assertTrue(finalCpioArchiveInputStreamEntryEOF);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(long)}
 * @utbot.iterates iterate the loop {@code while(total < max)} once
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testSkip_LenGreaterThanThisTmpbufLength_3() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 255L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 256L);
        byte[] tmpbuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        long actual = cpioArchiveInputStream.skip(2L);
        
        assertEquals(0L, actual);
        
        boolean finalCpioArchiveInputStreamEntryEOF = ((Boolean) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF"));
        
        assertTrue(finalCpioArchiveInputStreamEntryEOF);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method skip(long)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#read(byte[],int,int)} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(long)}
 * @utbot.iterates iterate the loop {@code while(total < max)} once
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testSkip_LenLessOrEqualThisTmpbufLength_1() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF", true);
        byte[] tmpbuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        long actual = cpioArchiveInputStream.skip(1L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(long)}
 * @utbot.iterates iterate the loop {@code while(total < max)} once
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testSkip_LenGreaterThanThisTmpbufLength_4() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        byte[] tmpbuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        long actual = cpioArchiveInputStream.skip(2L);
        
        assertEquals(0L, actual);
        
        boolean finalCpioArchiveInputStreamEntryEOF = ((Boolean) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF"));
        
        assertTrue(finalCpioArchiveInputStreamEntryEOF);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(long)}
 * @utbot.iterates iterate the loop {@code while(total < max)} once
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testSkip_LenLessOrEqualThisTmpbufLength() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        byte[] tmpbuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        long actual = cpioArchiveInputStream.skip(1L);
        
        assertEquals(0L, actual);
        
        boolean finalCpioArchiveInputStreamEntryEOF = ((Boolean) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF"));
        
        assertTrue(finalCpioArchiveInputStreamEntryEOF);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method skip(long)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(long)}
 * @utbot.executesCondition {@code (n < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: n < 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSkip_ThrowIllegalArgumentException() throws IOException  {
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(null);
        
        cpioArchiveInputStream.skip(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(long)}
 * @utbot.executesCondition {@code (n < 0): False}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#ensureOpen()
 * @utbot.invokes {@link java.lang.Math#min(long,long)}
 * @utbot.iterates iterate the loop {@code while(total < max)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testSkip_ThrowNullPointerException() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 1L);
        byte[] tmpbuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
        cpioArchiveInputStream.skip(2L);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method skip(long)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(long)}
 * @utbot.throwsException {@link java.io.IOException} in: ensureOpen();
 *  */
    @Test(expected = IOException.class)
    public void testSkip_ThrowIOException() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "closed", true);
        
        cpioArchiveInputStream.skip(0L);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(long)}
 * @utbot.invokes {@link java.lang.Math#min(long,long)}
 * @utbot.iterates iterate the loop {@code while(total < max)} once
 * @utbot.throwsException {@link java.io.IOException} in: len = read(this.tmpbuf, 0, len);
 *  */
    @Test(expected = IOException.class)
    public void testSkip_ThrowIOException_1() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", -5);
        entry.setChksum(0L);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 79L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 79L);
        byte[] tmpbuf = {(byte) -126, (byte) 2};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "crc", 1L);
        
        cpioArchiveInputStream.skip(3L);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method skip(long)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(long)}
 * @utbot.iterates iterate the loop {@code while(total < max)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: len > this.tmpbuf.length
 *  */
    @Test
    public void testSkip_ThrowNullPointerException_1() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(CpioArchiveInputStream.java:435) */
        cpioArchiveInputStream.skip(1L);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(long)}
 * @utbot.iterates iterate the loop {@code while(total < max)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: len = read(this.tmpbuf, 0, len);
 *  */
    @Test
    public void testSkip_ThrowNullPointerException_3() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 0L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", -1L);
        byte[] tmpbuf = {(byte) -127, (byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(CpioArchiveInputStream.java:296)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.read(CpioArchiveInputStream.java:278)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(CpioArchiveInputStream.java:438) */
        cpioArchiveInputStream.skip(3L);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(long)}
 * @utbot.iterates iterate the loop {@code while(total < max)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSkip_ThrowNullPointerException_2() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 1L);
        byte[] tmpbuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(CpioArchiveInputStream.java:296)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(CpioArchiveInputStream.java:229)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.read(CpioArchiveInputStream.java:263)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(CpioArchiveInputStream.java:438) */
        cpioArchiveInputStream.skip(2L);
    }
    ///endregion
    
    ///region Errors report for skip
    
    public void testSkip_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method skip(int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(int)}
 * @utbot.executesCondition {@code (bytes > 0): False}
 *  */
    @Test
    public void testSkip_BytesLessOrEqualZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, IOException  {
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(null);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method skipMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("skip", intType);
        skipMethod.setAccessible(true);
        java.lang.Object[] skipMethodArguments = new java.lang.Object[1];
        skipMethodArguments[0] = 0;
        skipMethod.invoke(cpioArchiveInputStream, skipMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method skip(int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(int)}
 * @utbot.executesCondition {@code (bytes > 0): True}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readFully(byte[],int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: readFully(FOUR_BYTES_BUF, 0, bytes);
 *  */
    @Test
    public void testSkip_ThrowNullPointerException1() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        byte[] fourBytesBuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "FOUR_BYTES_BUF", fourBytesBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(CpioArchiveInputStream.java:296)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(CpioArchiveInputStream.java:229) */
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method skipMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("skip", intType);
        skipMethod.setAccessible(true);
        java.lang.Object[] skipMethodArguments = new java.lang.Object[1];
        skipMethodArguments[0] = 1;
        try {
            skipMethod.invoke(cpioArchiveInputStream, skipMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method skip(int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(int)}
 * @utbot.throwsException {@link java.lang.SecurityException} in: readFully(FOUR_BYTES_BUF, 0, bytes);
 *  */
    @Test(expected = SecurityException.class)
    public void testSkip_ThrowSecurityException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Hashtable verifiedSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        Properties sigFileSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] fourBytesBuf = {};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "FOUR_BYTES_BUF", fourBytesBuf);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method skipMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("skip", intType);
        skipMethod.setAccessible(true);
        java.lang.Object[] skipMethodArguments = new java.lang.Object[1];
        skipMethodArguments[0] = 1;
        try {
            skipMethod.invoke(cpioArchiveInputStream, skipMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: readFully(FOUR_BYTES_BUF, 0, bytes);
 *  */
    @Test(expected = NullPointerException.class)
    public void testSkip_ThrowNullPointerException_11() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method skipMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("skip", intType);
        skipMethod.setAccessible(true);
        java.lang.Object[] skipMethodArguments = new java.lang.Object[1];
        skipMethodArguments[0] = 1;
        try {
            skipMethod.invoke(cpioArchiveInputStream, skipMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method skip(int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(int)}
 * @utbot.throwsException {@link java.io.IOException} in: readFully(FOUR_BYTES_BUF, 0, bytes);
 *  */
    @Test(expected = IOException.class)
    public void testSkip_ThrowIOException1() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] fourBytesBuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "FOUR_BYTES_BUF", fourBytesBuf);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method skipMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("skip", intType);
        skipMethod.setAccessible(true);
        java.lang.Object[] skipMethodArguments = new java.lang.Object[1];
        skipMethodArguments[0] = 1;
        try {
            skipMethod.invoke(cpioArchiveInputStream, skipMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(int)}
 * @utbot.throwsException {@link java.io.IOException} in: readFully(FOUR_BYTES_BUF, 0, bytes);
 *  */
    @Test(expected = IOException.class)
    public void testSkip_ThrowIOException_11() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 1L);
        Object in1 = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] fourBytesBuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "FOUR_BYTES_BUF", fourBytesBuf);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method skipMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("skip", intType);
        skipMethod.setAccessible(true);
        java.lang.Object[] skipMethodArguments = new java.lang.Object[1];
        skipMethodArguments[0] = 1;
        try {
            skipMethod.invoke(cpioArchiveInputStream, skipMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(int)}
 * @utbot.throwsException {@link java.io.EOFException} in: readFully(FOUR_BYTES_BUF, 0, bytes);
 *  */
    @Test(expected = EOFException.class)
    public void testSkip_ThrowEOFException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method skipMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("skip", intType);
        skipMethod.setAccessible(true);
        java.lang.Object[] skipMethodArguments = new java.lang.Object[1];
        skipMethodArguments[0] = 1;
        try {
            skipMethod.invoke(cpioArchiveInputStream, skipMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(int)}
 * @utbot.throwsException {@link java.io.EOFException} in: readFully(FOUR_BYTES_BUF, 0, bytes);
 *  */
    @Test(expected = EOFException.class)
    public void testSkip_ThrowEOFException_1() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method skipMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("skip", intType);
        skipMethod.setAccessible(true);
        java.lang.Object[] skipMethodArguments = new java.lang.Object[1];
        skipMethodArguments[0] = 1;
        try {
            skipMethod.invoke(cpioArchiveInputStream, skipMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(int)}
 * @utbot.throwsException {@link java.io.EOFException} in: readFully(FOUR_BYTES_BUF, 0, bytes);
 *  */
    @Test(expected = EOFException.class)
    public void testSkip_ThrowEOFException_2() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Hashtable verifiedSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] fourBytesBuf = {};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "FOUR_BYTES_BUF", fourBytesBuf);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method skipMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("skip", intType);
        skipMethod.setAccessible(true);
        java.lang.Object[] skipMethodArguments = new java.lang.Object[1];
        skipMethodArguments[0] = 1;
        try {
            skipMethod.invoke(cpioArchiveInputStream, skipMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for skip
    
    public void testSkip_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.available
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method available()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#available()}
 * @utbot.executesCondition {@code (this.entryEOF): False}
 * @utbot.returnsFrom {@code return 1;}
 *  */
    @Test
    public void testAvailable_NotThisEntryEOF() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        
        int actual = cpioArchiveInputStream.available();
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#available()}
 * @utbot.executesCondition {@code (this.entryEOF): True}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testAvailable_ThisEntryEOF() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF", true);
        
        int actual = cpioArchiveInputStream.available();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method available()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#available()}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#ensureOpen()
 * @utbot.throwsException {@link java.io.IOException} in: ensureOpen();
 *  */
    @Test(expected = IOException.class)
    public void testAvailable_ThrowIOException() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "closed", true);
        
        cpioArchiveInputStream.available();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.ensureOpen
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ensureOpen()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#ensureOpen()}
 * @utbot.executesCondition {@code (this.closed): False}
 *  */
    @Test
    public void testEnsureOpen_NotThisClosed() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method ensureOpenMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("ensureOpen");
        ensureOpenMethod.setAccessible(true);
        java.lang.Object[] ensureOpenMethodArguments = new java.lang.Object[0];
        ensureOpenMethod.invoke(cpioArchiveInputStream, ensureOpenMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method ensureOpen()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#ensureOpen()}
 * @utbot.executesCondition {@code (this.closed): True}
 * @utbot.throwsException {@link java.io.IOException} when: this.closed
 *  */
    @Test(expected = IOException.class)
    public void testEnsureOpen_ThrowIOException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "closed", true);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method ensureOpenMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("ensureOpen");
        ensureOpenMethod.setAccessible(true);
        java.lang.Object[] ensureOpenMethodArguments = new java.lang.Object[0];
        try {
            ensureOpenMethod.invoke(cpioArchiveInputStream, ensureOpenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readFully([B, int, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readFully(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testReadFully_LenGreaterOrEqualZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, IOException  {
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(null);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFullyMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readFully", byteArrayType, intType, intType);
        readFullyMethod.setAccessible(true);
        java.lang.Object[] readFullyMethodArguments = new java.lang.Object[3];
        readFullyMethodArguments[0] = ((Object) null);
        readFullyMethodArguments[1] = -255;
        readFullyMethodArguments[2] = 0;
        int actual = ((Integer) readFullyMethod.invoke(cpioArchiveInputStream, readFullyMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readFully([B, int, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readFully(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: len < 0
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFully_ThrowIndexOutOfBoundsException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(null);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFullyMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readFully", byteArrayType, intType, intType);
        readFullyMethod.setAccessible(true);
        java.lang.Object[] readFullyMethodArguments = new java.lang.Object[3];
        readFullyMethodArguments[0] = ((Object) null);
        readFullyMethodArguments[1] = 0;
        readFullyMethodArguments[2] = -1;
        try {
            readFullyMethod.invoke(cpioArchiveInputStream, readFullyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readFully(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.iterates iterate the loop {@code while(n < len)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: int count = this.in.read(b, off + n, len - n);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFully_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(jarInputStream, 0);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFullyMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readFully", byteArrayType, intType, intType);
        readFullyMethod.setAccessible(true);
        java.lang.Object[] readFullyMethodArguments = new java.lang.Object[3];
        readFullyMethodArguments[0] = ((Object) null);
        readFullyMethodArguments[1] = -1;
        readFullyMethodArguments[2] = 1;
        try {
            readFullyMethod.invoke(cpioArchiveInputStream, readFullyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readFully(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.iterates iterate the loop {@code while(n < len)} once
 * @utbot.throwsException {@link java.lang.SecurityException} 
 *  */
    @Test(expected = SecurityException.class)
    public void testReadFully_ThrowSecurityException() throws Throwable  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties sigFileSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(jarInputStream, 0);
        byte[] byteArray = {(byte) -127};
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFullyMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readFully", byteArrayType, intType, intType);
        readFullyMethod.setAccessible(true);
        java.lang.Object[] readFullyMethodArguments = new java.lang.Object[3];
        readFullyMethodArguments[0] = ((Object) byteArray);
        readFullyMethodArguments[1] = 0;
        readFullyMethodArguments[2] = 1;
        try {
            readFullyMethod.invoke(cpioArchiveInputStream, readFullyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readFully(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.iterates iterate the loop {@code while(n < len)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int count = this.in.read(b, off + n, len - n);
 *  */
    @Test(expected = NullPointerException.class)
    public void testReadFully_ThrowNullPointerException() throws Throwable  {
        Object zipFileInflaterInputStream = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class zipFileInflaterInputStreamType = Class.forName("java.io.InputStream");
        Class intType = int.class;
        Constructor cpioArchiveInputStreamConstructor = cpioArchiveInputStreamClazz.getDeclaredConstructor(zipFileInflaterInputStreamType, intType);
        cpioArchiveInputStreamConstructor.setAccessible(true);
        java.lang.Object[] cpioArchiveInputStreamConstructorArguments = new java.lang.Object[2];
        cpioArchiveInputStreamConstructorArguments[0] = zipFileInflaterInputStream;
        cpioArchiveInputStreamConstructorArguments[1] = 0;
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) cpioArchiveInputStreamConstructor.newInstance(cpioArchiveInputStreamConstructorArguments));
        
        Class byteArrayType = Class.forName("[B");
        Method readFullyMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readFully", byteArrayType, intType, intType);
        readFullyMethod.setAccessible(true);
        java.lang.Object[] readFullyMethodArguments = new java.lang.Object[3];
        readFullyMethodArguments[0] = ((Object) null);
        readFullyMethodArguments[1] = -255;
        readFullyMethodArguments[2] = 1;
        try {
            readFullyMethod.invoke(cpioArchiveInputStream, readFullyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readFully([B, int, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readFully(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code while(n < len)} once
 * @utbot.throwsException {@link java.io.EOFException} when: count < 0
 *  */
    @Test(expected = EOFException.class)
    public void testReadFully_ThrowEOFException() throws Throwable  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(jarInputStream, 0);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFullyMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readFully", byteArrayType, intType, intType);
        readFullyMethod.setAccessible(true);
        java.lang.Object[] readFullyMethodArguments = new java.lang.Object[3];
        readFullyMethodArguments[0] = ((Object) null);
        readFullyMethodArguments[1] = -255;
        readFullyMethodArguments[2] = 1;
        try {
            readFullyMethod.invoke(cpioArchiveInputStream, readFullyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readFully(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code while(n < len)} once
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadFully_ThrowIOException() throws Throwable  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(jarInputStream, 0);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFullyMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readFully", byteArrayType, intType, intType);
        readFullyMethod.setAccessible(true);
        java.lang.Object[] readFullyMethodArguments = new java.lang.Object[3];
        readFullyMethodArguments[0] = ((Object) byteArray);
        readFullyMethodArguments[1] = 0;
        readFullyMethodArguments[2] = 2;
        try {
            readFullyMethod.invoke(cpioArchiveInputStream, readFullyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readFully(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code while(n < len)} once
 * @utbot.throwsException {@link java.io.EOFException} when: count < 0
 *  */
    @Test(expected = EOFException.class)
    public void testReadFully_ThrowEOFException_1() throws Throwable  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(jarInputStream, 0);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFullyMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readFully", byteArrayType, intType, intType);
        readFullyMethod.setAccessible(true);
        java.lang.Object[] readFullyMethodArguments = new java.lang.Object[3];
        readFullyMethodArguments[0] = ((Object) null);
        readFullyMethodArguments[1] = -255;
        readFullyMethodArguments[2] = 1;
        try {
            readFullyMethod.invoke(cpioArchiveInputStream, readFullyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readFully(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code while(n < len)} once
 * @utbot.throwsException {@link java.util.zip.ZipException} in: int count = this.in.read(b, off + n, len - n);
 *  */
    @Test(expected = ZipException.class)
    public void testReadFully_ThrowZipException() throws Throwable  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 1L);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.jar.JarInputStream", "first", entry);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(jarInputStream, 0);
        byte[] byteArray = {(byte) -127};
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFullyMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readFully", byteArrayType, intType, intType);
        readFullyMethod.setAccessible(true);
        java.lang.Object[] readFullyMethodArguments = new java.lang.Object[3];
        readFullyMethodArguments[0] = ((Object) byteArray);
        readFullyMethodArguments[1] = 0;
        readFullyMethodArguments[2] = 1;
        try {
            readFullyMethod.invoke(cpioArchiveInputStream, readFullyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readFully(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code while(n < len)} once
 * @utbot.throwsException {@link java.io.EOFException} when: count < 0
 *  */
    @Test(expected = EOFException.class)
    public void testReadFully_ThrowEOFException_2() throws Throwable  {
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
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(jarInputStream, 0);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFullyMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readFully", byteArrayType, intType, intType);
        readFullyMethod.setAccessible(true);
        java.lang.Object[] readFullyMethodArguments = new java.lang.Object[3];
        readFullyMethodArguments[0] = ((Object) null);
        readFullyMethodArguments[1] = -255;
        readFullyMethodArguments[2] = 1;
        try {
            readFullyMethod.invoke(cpioArchiveInputStream, readFullyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readFully([B, int, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readFully(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.iterates iterate the loop {@code while(n < len)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int count = this.in.read(b, off + n, len - n);
 *  */
    @Test
    public void testReadFully_ThrowNullPointerException_1() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(null, 0);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(CpioArchiveInputStream.java:296) */
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFullyMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readFully", byteArrayType, intType, intType);
        readFullyMethod.setAccessible(true);
        java.lang.Object[] readFullyMethodArguments = new java.lang.Object[3];
        readFullyMethodArguments[0] = ((Object) null);
        readFullyMethodArguments[1] = -255;
        readFullyMethodArguments[2] = 1;
        try {
            readFullyMethod.invoke(cpioArchiveInputStream, readFullyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skipRemainderOfLastBlock
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method skipRemainderOfLastBlock()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skipRemainderOfLastBlock()}
 * @utbot.executesCondition {@code (readFromLastBlock == 0): False}
 *  */
    @Test
    public void testSkipRemainderOfLastBlock_RemainingBytesLessOrEqualZero() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "blockSize", -67);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", -4465600389651103687L);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method skipRemainderOfLastBlockMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("skipRemainderOfLastBlock");
        skipRemainderOfLastBlockMethod.setAccessible(true);
        java.lang.Object[] skipRemainderOfLastBlockMethodArguments = new java.lang.Object[0];
        skipRemainderOfLastBlockMethod.invoke(cpioArchiveInputStream, skipRemainderOfLastBlockMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skipRemainderOfLastBlock()}
 * @utbot.executesCondition {@code (readFromLastBlock == 0): True}
 *  */
    @Test
    public void testSkipRemainderOfLastBlock_ReadFromLastBlockEqualsZero() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "blockSize", -8);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 67649929216L);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method skipRemainderOfLastBlockMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("skipRemainderOfLastBlock");
        skipRemainderOfLastBlockMethod.setAccessible(true);
        java.lang.Object[] skipRemainderOfLastBlockMethodArguments = new java.lang.Object[0];
        skipRemainderOfLastBlockMethod.invoke(cpioArchiveInputStream, skipRemainderOfLastBlockMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skipRemainderOfLastBlock()}
 * @utbot.executesCondition {@code (readFromLastBlock == 0): False}
 * @utbot.iterates iterate the loop {@code while(remainingBytes > 0)} once
 *  */
    @Test
    public void testSkipRemainderOfLastBlock_SkippedLessOrEqualZero_1() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF", true);
        byte[] tmpbuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "blockSize", 2);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 1L);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method skipRemainderOfLastBlockMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("skipRemainderOfLastBlock");
        skipRemainderOfLastBlockMethod.setAccessible(true);
        java.lang.Object[] skipRemainderOfLastBlockMethodArguments = new java.lang.Object[0];
        skipRemainderOfLastBlockMethod.invoke(cpioArchiveInputStream, skipRemainderOfLastBlockMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skipRemainderOfLastBlock()}
 * @utbot.executesCondition {@code (readFromLastBlock == 0): False}
 * @utbot.iterates iterate the loop {@code while(remainingBytes > 0)} once
 *  */
    @Test
    public void testSkipRemainderOfLastBlock_SkippedLessOrEqualZero_2() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF", true);
        byte[] tmpbuf = {(byte) -127, (byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "blockSize", 4);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 651494999195649L);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method skipRemainderOfLastBlockMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("skipRemainderOfLastBlock");
        skipRemainderOfLastBlockMethod.setAccessible(true);
        java.lang.Object[] skipRemainderOfLastBlockMethodArguments = new java.lang.Object[0];
        skipRemainderOfLastBlockMethod.invoke(cpioArchiveInputStream, skipRemainderOfLastBlockMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skipRemainderOfLastBlock()}
 * @utbot.executesCondition {@code (readFromLastBlock == 0): False}
 * @utbot.iterates iterate the loop {@code while(remainingBytes > 0)} once
 *  */
    @Test
    public void testSkipRemainderOfLastBlock_SkippedLessOrEqualZero() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        byte[] tmpbuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "blockSize", 9);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 5266827882944004104L);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method skipRemainderOfLastBlockMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("skipRemainderOfLastBlock");
        skipRemainderOfLastBlockMethod.setAccessible(true);
        java.lang.Object[] skipRemainderOfLastBlockMethodArguments = new java.lang.Object[0];
        skipRemainderOfLastBlockMethod.invoke(cpioArchiveInputStream, skipRemainderOfLastBlockMethodArguments);
        
        boolean finalCpioArchiveInputStreamEntryEOF = ((Boolean) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF"));
        
        assertTrue(finalCpioArchiveInputStreamEntryEOF);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method skipRemainderOfLastBlock()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skipRemainderOfLastBlock()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getBytesRead()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: long readFromLastBlock = getBytesRead() % blockSize;
 *  */
    @Test
    public void testSkipRemainderOfLastBlock_ThrowArithmeticException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skipRemainderOfLastBlock] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skipRemainderOfLastBlock(CpioArchiveInputStream.java:457) */
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method skipRemainderOfLastBlockMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("skipRemainderOfLastBlock");
        skipRemainderOfLastBlockMethod.setAccessible(true);
        java.lang.Object[] skipRemainderOfLastBlockMethodArguments = new java.lang.Object[0];
        try {
            skipRemainderOfLastBlockMethod.invoke(cpioArchiveInputStream, skipRemainderOfLastBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method skipRemainderOfLastBlock()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skipRemainderOfLastBlock()}
 * @utbot.executesCondition {@code (readFromLastBlock == 0): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getBytesRead()}
 * @utbot.iterates iterate the loop {@code while(remainingBytes > 0)} once
 * @utbot.throwsException {@link java.io.IOException} in: long skipped = skip(blockSize - readFromLastBlock);
 *  */
    @Test(expected = IOException.class)
    public void testSkipRemainderOfLastBlock_ThrowIOException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "closed", true);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "blockSize", 209);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 811361755758878L);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method skipRemainderOfLastBlockMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("skipRemainderOfLastBlock");
        skipRemainderOfLastBlockMethod.setAccessible(true);
        java.lang.Object[] skipRemainderOfLastBlockMethodArguments = new java.lang.Object[0];
        try {
            skipRemainderOfLastBlockMethod.invoke(cpioArchiveInputStream, skipRemainderOfLastBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNextCPIOEntry()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextCPIOEntry()}
 * @utbot.executesCondition {@code (this.entry != null): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioUtil#byteArray2long(byte[],boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: CpioUtil.byteArray2long(TWO_BYTES_BUF, false) == MAGIC_OLD_BINARY
 *  */
    @Test
    public void testGetNextCPIOEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        byte[] twoBytesBuf = {};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "TWO_BYTES_BUF", twoBytesBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(CpioUtil.java:65)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry(CpioArchiveInputStream.java:192) */
        cpioArchiveInputStream.getNextCPIOEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextCPIOEntry()}
 * @utbot.executesCondition {@code (this.entry != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: closeEntry();
 *  */
    @Test
    public void testGetNextCPIOEntry_ThrowNullPointerException_2() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.closeEntry(CpioArchiveInputStream.java:158)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry(CpioArchiveInputStream.java:189) */
        cpioArchiveInputStream.getNextCPIOEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextCPIOEntry()}
 * @utbot.executesCondition {@code (this.entry != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: readFully(TWO_BYTES_BUF, 0, TWO_BYTES_BUF.length);
 *  */
    @Test
    public void testGetNextCPIOEntry_ThrowNullPointerException() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry(CpioArchiveInputStream.java:191) */
        cpioArchiveInputStream.getNextCPIOEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextCPIOEntry()}
 * @utbot.executesCondition {@code (this.entry != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: readFully(TWO_BYTES_BUF, 0, TWO_BYTES_BUF.length);
 *  */
    @Test
    public void testGetNextCPIOEntry_ThrowNullPointerException_3() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF", true);
        byte[] tmpbuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry(CpioArchiveInputStream.java:191) */
        cpioArchiveInputStream.getNextCPIOEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextCPIOEntry()}
 * @utbot.executesCondition {@code (this.entry != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: readFully(TWO_BYTES_BUF, 0, TWO_BYTES_BUF.length);
 *  */
    @Test
    public void testGetNextCPIOEntry_ThrowNullPointerException_4() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -255);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", -3);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 5L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 5L);
        byte[] tmpbuf = {(byte) -126};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry(CpioArchiveInputStream.java:191) */
        cpioArchiveInputStream.getNextCPIOEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextCPIOEntry()}
 * @utbot.executesCondition {@code (this.entry != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: readFully(TWO_BYTES_BUF, 0, TWO_BYTES_BUF.length);
 *  */
    @Test
    public void testGetNextCPIOEntry_ThrowNullPointerException_1() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        byte[] twoBytesBuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "TWO_BYTES_BUF", twoBytesBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(CpioArchiveInputStream.java:296)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry(CpioArchiveInputStream.java:191) */
        cpioArchiveInputStream.getNextCPIOEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method getNextCPIOEntry()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextCPIOEntry()}
 * @utbot.throwsException {@link java.io.IOException} in: ensureOpen();
 *  */
    @Test(expected = IOException.class)
    public void testGetNextCPIOEntry_ThrowIOException() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "closed", true);
        
        cpioArchiveInputStream.getNextCPIOEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextCPIOEntry()}
 * @utbot.executesCondition {@code (this.entry != null): False}
 * @utbot.throwsException {@link java.io.IOException} in: readFully(TWO_BYTES_BUF, 0, TWO_BYTES_BUF.length);
 *  */
    @Test(expected = IOException.class)
    public void testGetNextCPIOEntry_ThrowIOException_1() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] twoBytesBuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "TWO_BYTES_BUF", twoBytesBuf);
        
        cpioArchiveInputStream.getNextCPIOEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextCPIOEntry()}
 * @utbot.executesCondition {@code (this.entry != null): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testGetNextCPIOEntry_ThrowIOException_2() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] twoBytesBuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "TWO_BYTES_BUF", twoBytesBuf);
        
        cpioArchiveInputStream.getNextCPIOEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextCPIOEntry()}
 * @utbot.executesCondition {@code (this.entry != null): False}
 * @utbot.throwsException {@link java.io.EOFException} in: readFully(TWO_BYTES_BUF, 0, TWO_BYTES_BUF.length);
 *  */
    @Test(expected = EOFException.class)
    public void testGetNextCPIOEntry_ThrowEOFException() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] twoBytesBuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "TWO_BYTES_BUF", twoBytesBuf);
        
        cpioArchiveInputStream.getNextCPIOEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextCPIOEntry()}
 * @utbot.executesCondition {@code (this.entry != null): False}
 * @utbot.throwsException {@link java.io.EOFException} in: readFully(TWO_BYTES_BUF, 0, TWO_BYTES_BUF.length);
 *  */
    @Test(expected = EOFException.class)
    public void testGetNextCPIOEntry_ThrowEOFException_1() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] twoBytesBuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "TWO_BYTES_BUF", twoBytesBuf);
        
        cpioArchiveInputStream.getNextCPIOEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextCPIOEntry()}
 * @utbot.executesCondition {@code (this.entry != null): False}
 * @utbot.throwsException {@link java.io.EOFException} in: readFully(TWO_BYTES_BUF, 0, TWO_BYTES_BUF.length);
 *  */
    @Test(expected = EOFException.class)
    public void testGetNextCPIOEntry_ThrowEOFException_2() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Hashtable verifiedSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] twoBytesBuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "TWO_BYTES_BUF", twoBytesBuf);
        
        cpioArchiveInputStream.getNextCPIOEntry();
    }
    ///endregion
    
    ///region Errors report for getNextCPIOEntry
    
    public void testGetNextCPIOEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readAsciiLong
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readAsciiLong(int, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readAsciiLong(int,int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: byte[] tmpBuffer = new byte[length];
 *  */
    @Test
    public void testReadAsciiLong_ThrowNegativeArraySizeException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readAsciiLong] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readAsciiLong(CpioArchiveInputStream.java:315) */
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method readAsciiLongMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readAsciiLong", intType, intType);
        readAsciiLongMethod.setAccessible(true);
        java.lang.Object[] readAsciiLongMethodArguments = new java.lang.Object[2];
        readAsciiLongMethodArguments[0] = -256;
        readAsciiLongMethodArguments[1] = 1;
        try {
            readAsciiLongMethod.invoke(cpioArchiveInputStream, readAsciiLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readAsciiLong(int,int)}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readFully(byte[],int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: readFully(tmpBuffer, 0, tmpBuffer.length);
 *  */
    @Test
    public void testReadAsciiLong_ThrowNullPointerException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(null, 0);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readAsciiLong] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(CpioArchiveInputStream.java:296)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readAsciiLong(CpioArchiveInputStream.java:316) */
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method readAsciiLongMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readAsciiLong", intType, intType);
        readAsciiLongMethod.setAccessible(true);
        java.lang.Object[] readAsciiLongMethodArguments = new java.lang.Object[2];
        readAsciiLongMethodArguments[0] = 1;
        readAsciiLongMethodArguments[1] = -255;
        try {
            readAsciiLongMethod.invoke(cpioArchiveInputStream, readAsciiLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method readAsciiLong(int, int)
    
    @Test
    public void testReadAsciiLong1() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readAsciiLong] produces [java.lang.NumberFormatException: radix -255 less than Character.MIN_RADIX]
            java.base/java.lang.Long.parseLong(Long.java:678)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readAsciiLong(CpioArchiveInputStream.java:317) */
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method readAsciiLongMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readAsciiLong", intType, intType);
        readAsciiLongMethod.setAccessible(true);
        java.lang.Object[] readAsciiLongMethodArguments = new java.lang.Object[2];
        readAsciiLongMethodArguments[0] = 0;
        readAsciiLongMethodArguments[1] = -255;
        try {
            readAsciiLongMethod.invoke(cpioArchiveInputStream, readAsciiLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.closeEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method closeEntry()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#closeEntry()}
 *  */
    @Test
    public void testCloseEntry_1() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF", true);
        byte[] tmpbuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method closeEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("closeEntry");
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[0];
        closeEntryMethod.invoke(cpioArchiveInputStream, closeEntryMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#closeEntry()}
 *  */
    @Test
    public void testCloseEntry_2() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        entry.setChksum(-255L);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -255L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", -255L);
        byte[] tmpbuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "crc", -255L);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method closeEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("closeEntry");
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[0];
        closeEntryMethod.invoke(cpioArchiveInputStream, closeEntryMethodArguments);
        
        boolean finalCpioArchiveInputStreamEntryEOF = ((Boolean) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF"));
        
        assertTrue(finalCpioArchiveInputStreamEntryEOF);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#closeEntry()}
 *  */
    @Test
    public void testCloseEntry_3() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 255L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 256L);
        byte[] tmpbuf = {(byte) -127, (byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method closeEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("closeEntry");
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[0];
        closeEntryMethod.invoke(cpioArchiveInputStream, closeEntryMethodArguments);
        
        boolean finalCpioArchiveInputStreamEntryEOF = ((Boolean) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF"));
        
        assertTrue(finalCpioArchiveInputStreamEntryEOF);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#closeEntry()}
 *  */
    @Test
    public void testCloseEntry_4() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", java.lang.Short.MIN_VALUE);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", -1);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -128L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", -128L);
        byte[] tmpbuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method closeEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("closeEntry");
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[0];
        closeEntryMethod.invoke(cpioArchiveInputStream, closeEntryMethodArguments);
        
        boolean finalCpioArchiveInputStreamEntryEOF = ((Boolean) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF"));
        
        assertTrue(finalCpioArchiveInputStreamEntryEOF);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#closeEntry()}
 *  */
    @Test
    public void testCloseEntry_5() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", java.lang.Short.MIN_VALUE);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", -2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 1L);
        byte[] tmpbuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method closeEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("closeEntry");
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[0];
        closeEntryMethod.invoke(cpioArchiveInputStream, closeEntryMethodArguments);
        
        boolean finalCpioArchiveInputStreamEntryEOF = ((Boolean) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF"));
        
        assertTrue(finalCpioArchiveInputStreamEntryEOF);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#closeEntry()}
 *  */
    @Test
    public void testCloseEntry() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        byte[] tmpbuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method closeEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("closeEntry");
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[0];
        closeEntryMethod.invoke(cpioArchiveInputStream, closeEntryMethodArguments);
        
        boolean finalCpioArchiveInputStreamEntryEOF = ((Boolean) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF"));
        
        assertTrue(finalCpioArchiveInputStreamEntryEOF);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method closeEntry()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#closeEntry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(read(this.tmpbuf, 0, this.tmpbuf.length) != -1)
 *  */
    @Test
    public void testCloseEntry_ThrowNullPointerException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.closeEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.closeEntry(CpioArchiveInputStream.java:158) */
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method closeEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("closeEntry");
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[0];
        try {
            closeEntryMethod.invoke(cpioArchiveInputStream, closeEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#closeEntry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(read(this.tmpbuf, 0, this.tmpbuf.length) != -1)
 *  */
    @Test
    public void testCloseEntry_ThrowNullPointerException_1() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -2L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", -3L);
        byte[] tmpbuf = {(byte) -127, (byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.closeEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(CpioArchiveInputStream.java:296)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.read(CpioArchiveInputStream.java:278)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.closeEntry(CpioArchiveInputStream.java:158) */
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method closeEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("closeEntry");
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[0];
        try {
            closeEntryMethod.invoke(cpioArchiveInputStream, closeEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method closeEntry()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#closeEntry()}
 * @utbot.throwsException {@link java.io.IOException} in: ensureOpen();
 *  */
    @Test(expected = IOException.class)
    public void testCloseEntry_ThrowIOException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "closed", true);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method closeEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("closeEntry");
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[0];
        try {
            closeEntryMethod.invoke(cpioArchiveInputStream, closeEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#closeEntry()}
 * @utbot.throwsException {@link java.io.IOException} in: while(read(this.tmpbuf, 0, this.tmpbuf.length) != -1)
 *  */
    @Test(expected = IOException.class)
    public void testCloseEntry_ThrowIOException_1() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        entry.setChksum(-254L);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -255L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", -255L);
        byte[] tmpbuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "crc", -253L);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method closeEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("closeEntry");
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[0];
        try {
            closeEntryMethod.invoke(cpioArchiveInputStream, closeEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#closeEntry()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testCloseEntry_ThrowIOException_2() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 1L);
        byte[] tmpbuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method closeEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("closeEntry");
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[0];
        try {
            closeEntryMethod.invoke(cpioArchiveInputStream, closeEntryMethodArguments);
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
        // 3 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readNewEntry
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readNewEntry(boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readNewEntry(boolean)}
 * @utbot.executesCondition {@code (hasCrc): True}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readAsciiLong(int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ret.setInode(readAsciiLong(8, 16));
 *  */
    @Test
    public void testReadNewEntry_ThrowNullPointerException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(null, 0);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readNewEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(CpioArchiveInputStream.java:296)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readAsciiLong(CpioArchiveInputStream.java:316)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readNewEntry(CpioArchiveInputStream.java:329) */
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class booleanType = boolean.class;
        Method readNewEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readNewEntry", booleanType);
        readNewEntryMethod.setAccessible(true);
        java.lang.Object[] readNewEntryMethodArguments = new java.lang.Object[1];
        readNewEntryMethodArguments[0] = true;
        try {
            readNewEntryMethod.invoke(cpioArchiveInputStream, readNewEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readNewEntry(boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readNewEntry(boolean)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadNewEntry_ThrowIOException() throws Throwable  {
        Object zipFileInflaterInputStream = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(zipFileInflaterInputStream, "java.util.zip.InflaterInputStream", "closed", true);
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class zipFileInflaterInputStreamType = Class.forName("java.io.InputStream");
        Class intType = int.class;
        Constructor cpioArchiveInputStreamConstructor = cpioArchiveInputStreamClazz.getDeclaredConstructor(zipFileInflaterInputStreamType, intType);
        cpioArchiveInputStreamConstructor.setAccessible(true);
        java.lang.Object[] cpioArchiveInputStreamConstructorArguments = new java.lang.Object[2];
        cpioArchiveInputStreamConstructorArguments[0] = zipFileInflaterInputStream;
        cpioArchiveInputStreamConstructorArguments[1] = 0;
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) cpioArchiveInputStreamConstructor.newInstance(cpioArchiveInputStreamConstructorArguments));
        
        Class booleanType = boolean.class;
        Method readNewEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readNewEntry", booleanType);
        readNewEntryMethod.setAccessible(true);
        java.lang.Object[] readNewEntryMethodArguments = new java.lang.Object[1];
        readNewEntryMethodArguments[0] = false;
        try {
            readNewEntryMethod.invoke(cpioArchiveInputStream, readNewEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readNewEntry(boolean)}
 * @utbot.throwsException {@link java.io.EOFException} in: ret.setInode(readAsciiLong(8, 16));
 *  */
    @Test(expected = EOFException.class)
    public void testReadNewEntry_ThrowEOFException() throws Throwable  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(jarInputStream, 0);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class booleanType = boolean.class;
        Method readNewEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readNewEntry", booleanType);
        readNewEntryMethod.setAccessible(true);
        java.lang.Object[] readNewEntryMethodArguments = new java.lang.Object[1];
        readNewEntryMethodArguments[0] = false;
        try {
            readNewEntryMethod.invoke(cpioArchiveInputStream, readNewEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readNewEntry
    
    public void testReadNewEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 6 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readBinaryLong(int, boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readBinaryLong(int,boolean)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: byte[] tmp = new byte[length];
 *  */
    @Test
    public void testReadBinaryLong_ThrowNegativeArraySizeException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong(CpioArchiveInputStream.java:308) */
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method readBinaryLongMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readBinaryLong", intType, booleanType);
        readBinaryLongMethod.setAccessible(true);
        java.lang.Object[] readBinaryLongMethodArguments = new java.lang.Object[2];
        readBinaryLongMethodArguments[0] = -256;
        readBinaryLongMethodArguments[1] = false;
        try {
            readBinaryLongMethod.invoke(cpioArchiveInputStream, readBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readBinaryLong(int,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return CpioUtil.byteArray2long(tmp, swapHalfWord);
 *  */
    @Test
    public void testReadBinaryLong_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(CpioUtil.java:65)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong(CpioArchiveInputStream.java:310) */
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method readBinaryLongMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readBinaryLong", intType, booleanType);
        readBinaryLongMethod.setAccessible(true);
        java.lang.Object[] readBinaryLongMethodArguments = new java.lang.Object[2];
        readBinaryLongMethodArguments[0] = 0;
        readBinaryLongMethodArguments[1] = true;
        try {
            readBinaryLongMethod.invoke(cpioArchiveInputStream, readBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readBinaryLong(int,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return CpioUtil.byteArray2long(tmp, swapHalfWord);
 *  */
    @Test
    public void testReadBinaryLong_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(CpioUtil.java:65)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong(CpioArchiveInputStream.java:310) */
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method readBinaryLongMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readBinaryLong", intType, booleanType);
        readBinaryLongMethod.setAccessible(true);
        java.lang.Object[] readBinaryLongMethodArguments = new java.lang.Object[2];
        readBinaryLongMethodArguments[0] = 0;
        readBinaryLongMethodArguments[1] = false;
        try {
            readBinaryLongMethod.invoke(cpioArchiveInputStream, readBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readBinaryLong(int,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: readFully(tmp, 0, tmp.length);
 *  */
    @Test
    public void testReadBinaryLong_ThrowNullPointerException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(null, 0);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(CpioArchiveInputStream.java:296)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong(CpioArchiveInputStream.java:309) */
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method readBinaryLongMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readBinaryLong", intType, booleanType);
        readBinaryLongMethod.setAccessible(true);
        java.lang.Object[] readBinaryLongMethodArguments = new java.lang.Object[2];
        readBinaryLongMethodArguments[0] = 1;
        readBinaryLongMethodArguments[1] = false;
        try {
            readBinaryLongMethod.invoke(cpioArchiveInputStream, readBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readBinaryLong(int, boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readBinaryLong(int,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: readFully(tmp, 0, tmp.length);
 *  */
    @Test(expected = IOException.class)
    public void testReadBinaryLong_ThrowIOException() throws Throwable  {
        Object zipFileInflaterInputStream = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(zipFileInflaterInputStream, "java.util.zip.InflaterInputStream", "closed", true);
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class zipFileInflaterInputStreamType = Class.forName("java.io.InputStream");
        Class intType = int.class;
        Constructor cpioArchiveInputStreamConstructor = cpioArchiveInputStreamClazz.getDeclaredConstructor(zipFileInflaterInputStreamType, intType);
        cpioArchiveInputStreamConstructor.setAccessible(true);
        java.lang.Object[] cpioArchiveInputStreamConstructorArguments = new java.lang.Object[2];
        cpioArchiveInputStreamConstructorArguments[0] = zipFileInflaterInputStream;
        cpioArchiveInputStreamConstructorArguments[1] = 0;
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) cpioArchiveInputStreamConstructor.newInstance(cpioArchiveInputStreamConstructorArguments));
        
        Class booleanType = boolean.class;
        Method readBinaryLongMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readBinaryLong", intType, booleanType);
        readBinaryLongMethod.setAccessible(true);
        java.lang.Object[] readBinaryLongMethodArguments = new java.lang.Object[2];
        readBinaryLongMethodArguments[0] = 1;
        readBinaryLongMethodArguments[1] = false;
        try {
            readBinaryLongMethod.invoke(cpioArchiveInputStream, readBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readBinaryLong(int,boolean)}
 * @utbot.throwsException {@link java.io.EOFException} in: readFully(tmp, 0, tmp.length);
 *  */
    @Test(expected = EOFException.class)
    public void testReadBinaryLong_ThrowEOFException() throws Throwable  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(jarInputStream, 0);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method readBinaryLongMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readBinaryLong", intType, booleanType);
        readBinaryLongMethod.setAccessible(true);
        java.lang.Object[] readBinaryLongMethodArguments = new java.lang.Object[2];
        readBinaryLongMethodArguments[0] = 1;
        readBinaryLongMethodArguments[1] = false;
        try {
            readBinaryLongMethod.invoke(cpioArchiveInputStream, readBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readBinaryLong(int,boolean)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: readFully(tmp, 0, tmp.length);
 *  */
    @Test(expected = ZipException.class)
    public void testReadBinaryLong_ThrowZipException() throws Throwable  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry.setMethod(1);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(jarInputStream, 0);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method readBinaryLongMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readBinaryLong", intType, booleanType);
        readBinaryLongMethod.setAccessible(true);
        java.lang.Object[] readBinaryLongMethodArguments = new java.lang.Object[2];
        readBinaryLongMethodArguments[0] = 1;
        readBinaryLongMethodArguments[1] = false;
        try {
            readBinaryLongMethod.invoke(cpioArchiveInputStream, readBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readBinaryLong(int,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: readFully(tmp, 0, tmp.length);
 *  */
    @Test(expected = IOException.class)
    public void testReadBinaryLong_ThrowIOException_1() throws Throwable  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 2L);
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(jarInputStream, 0);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method readBinaryLongMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readBinaryLong", intType, booleanType);
        readBinaryLongMethod.setAccessible(true);
        java.lang.Object[] readBinaryLongMethodArguments = new java.lang.Object[2];
        readBinaryLongMethodArguments[0] = 11;
        readBinaryLongMethodArguments[1] = false;
        try {
            readBinaryLongMethod.invoke(cpioArchiveInputStream, readBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readBinaryLong(int,boolean)}
 * @utbot.throwsException {@link java.io.EOFException} in: readFully(tmp, 0, tmp.length);
 *  */
    @Test(expected = EOFException.class)
    public void testReadBinaryLong_ThrowEOFException_1() throws Throwable  {
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
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(jarInputStream, 0);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method readBinaryLongMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readBinaryLong", intType, booleanType);
        readBinaryLongMethod.setAccessible(true);
        java.lang.Object[] readBinaryLongMethodArguments = new java.lang.Object[2];
        readBinaryLongMethodArguments[0] = 1;
        readBinaryLongMethodArguments[1] = false;
        try {
            readBinaryLongMethod.invoke(cpioArchiveInputStream, readBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readBinaryLong(int, boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readBinaryLong(int,boolean)}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readFully(byte[],int,int)
 * @utbot.throwsException {@link java.lang.SecurityException} in: readFully(tmp, 0, tmp.length);
 *  */
    @Test(expected = SecurityException.class)
    public void testReadBinaryLong_ThrowSecurityException() throws Throwable  {
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
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(jarInputStream, 0);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method readBinaryLongMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readBinaryLong", intType, booleanType);
        readBinaryLongMethod.setAccessible(true);
        java.lang.Object[] readBinaryLongMethodArguments = new java.lang.Object[2];
        readBinaryLongMethodArguments[0] = 1;
        readBinaryLongMethodArguments[1] = false;
        try {
            readBinaryLongMethod.invoke(cpioArchiveInputStream, readBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readBinaryLong
    
    public void testReadBinaryLong_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method getNextEntry()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.io.IOException} in: return getNextCPIOEntry();
 *  */
    @Test(expected = IOException.class)
    public void testGetNextEntry_ThrowIOException() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "closed", true);
        
        cpioArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.io.IOException} in: return getNextCPIOEntry();
 *  */
    @Test(expected = IOException.class)
    public void testGetNextEntry_ThrowIOException_1() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] twoBytesBuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "TWO_BYTES_BUF", twoBytesBuf);
        
        cpioArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.io.IOException} in: return getNextCPIOEntry();
 *  */
    @Test(expected = IOException.class)
    public void testGetNextEntry_ThrowIOException_2() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] twoBytesBuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "TWO_BYTES_BUF", twoBytesBuf);
        
        cpioArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.io.EOFException} in: return getNextCPIOEntry();
 *  */
    @Test(expected = EOFException.class)
    public void testGetNextEntry_ThrowEOFException() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] twoBytesBuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "TWO_BYTES_BUF", twoBytesBuf);
        
        cpioArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.io.EOFException} in: return getNextCPIOEntry();
 *  */
    @Test(expected = EOFException.class)
    public void testGetNextEntry_ThrowEOFException_1() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 0L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] twoBytesBuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "TWO_BYTES_BUF", twoBytesBuf);
        
        cpioArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.io.EOFException} in: return getNextCPIOEntry();
 *  */
    @Test(expected = EOFException.class)
    public void testGetNextEntry_ThrowEOFException_2() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] twoBytesBuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "TWO_BYTES_BUF", twoBytesBuf);
        
        cpioArchiveInputStream.getNextEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNextEntry()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getNextCPIOEntry();
 *  */
    @Test
    public void testGetNextEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        byte[] twoBytesBuf = {};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "TWO_BYTES_BUF", twoBytesBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(CpioUtil.java:65)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry(CpioArchiveInputStream.java:192)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry(CpioArchiveInputStream.java:450) */
        cpioArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getNextCPIOEntry();
 *  */
    @Test
    public void testGetNextEntry_ThrowNullPointerException_1() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.closeEntry(CpioArchiveInputStream.java:158)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry(CpioArchiveInputStream.java:189)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry(CpioArchiveInputStream.java:450) */
        cpioArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getNextCPIOEntry();
 *  */
    @Test
    public void testGetNextEntry_ThrowNullPointerException() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        byte[] twoBytesBuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "TWO_BYTES_BUF", twoBytesBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(CpioArchiveInputStream.java:296)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry(CpioArchiveInputStream.java:191)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry(CpioArchiveInputStream.java:450) */
        cpioArchiveInputStream.getNextEntry();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getNextEntry()
    
    @Test
    public void testGetNextEntry1() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 1);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 0L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 0L);
        byte[] tmpbuf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry(CpioArchiveInputStream.java:191)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry(CpioArchiveInputStream.java:450) */
        cpioArchiveInputStream.getNextEntry();
    }
    
    @Test
    public void testGetNextEntry2() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", -6);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 18433L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 18433L);
        byte[] tmpbuf = new byte[17];
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry(CpioArchiveInputStream.java:191)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry(CpioArchiveInputStream.java:450) */
        cpioArchiveInputStream.getNextEntry();
    }
    
    @Test
    public void testGetNextEntry3() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 0L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 0L);
        byte[] tmpbuf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry(CpioArchiveInputStream.java:191)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry(CpioArchiveInputStream.java:450) */
        cpioArchiveInputStream.getNextEntry();
    }
    
    @Test
    public void testGetNextEntry4() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 0L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 1L);
        byte[] tmpbuf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry(CpioArchiveInputStream.java:191)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry(CpioArchiveInputStream.java:450) */
        cpioArchiveInputStream.getNextEntry();
    }
    
    @Test
    public void testGetNextEntry5() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF", true);
        byte[] tmpbuf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "TWO_BYTES_BUF", tmpbuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(CpioArchiveInputStream.java:296)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry(CpioArchiveInputStream.java:191)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry(CpioArchiveInputStream.java:450) */
        cpioArchiveInputStream.getNextEntry();
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getNextEntry()
    
    @Test(timeout = 1000L)
    public void testGetNextEntry6() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        byte[] tmpbuf = {};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        cpioArchiveInputStream.getNextEntry();
    }
    ///endregion
    
    ///region Errors report for getNextEntry
    
    public void testGetNextEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldBinaryEntry
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readOldBinaryEntry(boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readOldBinaryEntry(boolean)}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readBinaryLong(int,boolean)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ret.setDevice(readBinaryLong(2, swapHalfWord));
 *  */
    @Test
    public void testReadOldBinaryEntry_ThrowNullPointerException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(null, 0);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldBinaryEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(CpioArchiveInputStream.java:296)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong(CpioArchiveInputStream.java:309)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldBinaryEntry(CpioArchiveInputStream.java:384) */
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class booleanType = boolean.class;
        Method readOldBinaryEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readOldBinaryEntry", booleanType);
        readOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] readOldBinaryEntryMethodArguments = new java.lang.Object[1];
        readOldBinaryEntryMethodArguments[0] = false;
        try {
            readOldBinaryEntryMethod.invoke(cpioArchiveInputStream, readOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readOldBinaryEntry(boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readOldBinaryEntry(boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: ret.setDevice(readBinaryLong(2, swapHalfWord));
 *  */
    @Test(expected = IOException.class)
    public void testReadOldBinaryEntry_ThrowIOException() throws Throwable  {
        Object zipFileInflaterInputStream = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(zipFileInflaterInputStream, "java.util.zip.InflaterInputStream", "closed", true);
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class zipFileInflaterInputStreamType = Class.forName("java.io.InputStream");
        Class intType = int.class;
        Constructor cpioArchiveInputStreamConstructor = cpioArchiveInputStreamClazz.getDeclaredConstructor(zipFileInflaterInputStreamType, intType);
        cpioArchiveInputStreamConstructor.setAccessible(true);
        java.lang.Object[] cpioArchiveInputStreamConstructorArguments = new java.lang.Object[2];
        cpioArchiveInputStreamConstructorArguments[0] = zipFileInflaterInputStream;
        cpioArchiveInputStreamConstructorArguments[1] = 0;
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) cpioArchiveInputStreamConstructor.newInstance(cpioArchiveInputStreamConstructorArguments));
        
        Class booleanType = boolean.class;
        Method readOldBinaryEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readOldBinaryEntry", booleanType);
        readOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] readOldBinaryEntryMethodArguments = new java.lang.Object[1];
        readOldBinaryEntryMethodArguments[0] = false;
        try {
            readOldBinaryEntryMethod.invoke(cpioArchiveInputStream, readOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readOldBinaryEntry(boolean)}
 * @utbot.throwsException {@link java.io.EOFException} in: ret.setDevice(readBinaryLong(2, swapHalfWord));
 *  */
    @Test(expected = EOFException.class)
    public void testReadOldBinaryEntry_ThrowEOFException() throws Throwable  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(jarInputStream, 0);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class booleanType = boolean.class;
        Method readOldBinaryEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readOldBinaryEntry", booleanType);
        readOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] readOldBinaryEntryMethodArguments = new java.lang.Object[1];
        readOldBinaryEntryMethodArguments[0] = false;
        try {
            readOldBinaryEntryMethod.invoke(cpioArchiveInputStream, readOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readOldBinaryEntry(boolean)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadOldBinaryEntry_ThrowIOException_1() throws Throwable  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 2L);
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(jarInputStream, 0);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class booleanType = boolean.class;
        Method readOldBinaryEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readOldBinaryEntry", booleanType);
        readOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] readOldBinaryEntryMethodArguments = new java.lang.Object[1];
        readOldBinaryEntryMethodArguments[0] = false;
        try {
            readOldBinaryEntryMethod.invoke(cpioArchiveInputStream, readOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readOldBinaryEntry(boolean)}
 * @utbot.throwsException {@link java.io.EOFException} in: ret.setDevice(readBinaryLong(2, swapHalfWord));
 *  */
    @Test(expected = EOFException.class)
    public void testReadOldBinaryEntry_ThrowEOFException_1() throws Throwable  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(jarInputStream, 0);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class booleanType = boolean.class;
        Method readOldBinaryEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readOldBinaryEntry", booleanType);
        readOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] readOldBinaryEntryMethodArguments = new java.lang.Object[1];
        readOldBinaryEntryMethodArguments[0] = false;
        try {
            readOldBinaryEntryMethod.invoke(cpioArchiveInputStream, readOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readOldBinaryEntry(boolean)}
 * @utbot.throwsException {@link java.io.EOFException} in: ret.setDevice(readBinaryLong(2, swapHalfWord));
 *  */
    @Test(expected = EOFException.class)
    public void testReadOldBinaryEntry_ThrowEOFException_2() throws Throwable  {
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
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(jarInputStream, 0);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class booleanType = boolean.class;
        Method readOldBinaryEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readOldBinaryEntry", booleanType);
        readOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] readOldBinaryEntryMethodArguments = new java.lang.Object[1];
        readOldBinaryEntryMethodArguments[0] = false;
        try {
            readOldBinaryEntryMethod.invoke(cpioArchiveInputStream, readOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readOldBinaryEntry
    
    public void testReadOldBinaryEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldAsciiEntry
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readOldAsciiEntry()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readOldAsciiEntry()}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readAsciiLong(int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ret.setDevice(readAsciiLong(6, 8));
 *  */
    @Test
    public void testReadOldAsciiEntry_ThrowNullPointerException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(null, 0);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldAsciiEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(CpioArchiveInputStream.java:296)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readAsciiLong(CpioArchiveInputStream.java:316)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldAsciiEntry(CpioArchiveInputStream.java:358) */
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method readOldAsciiEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readOldAsciiEntry");
        readOldAsciiEntryMethod.setAccessible(true);
        java.lang.Object[] readOldAsciiEntryMethodArguments = new java.lang.Object[0];
        try {
            readOldAsciiEntryMethod.invoke(cpioArchiveInputStream, readOldAsciiEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readOldAsciiEntry()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readOldAsciiEntry()}
 * @utbot.throwsException {@link java.io.IOException} in: ret.setDevice(readAsciiLong(6, 8));
 *  */
    @Test(expected = IOException.class)
    public void testReadOldAsciiEntry_ThrowIOException() throws Throwable  {
        Object zipFileInflaterInputStream = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(zipFileInflaterInputStream, "java.util.zip.InflaterInputStream", "closed", true);
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class zipFileInflaterInputStreamType = Class.forName("java.io.InputStream");
        Class intType = int.class;
        Constructor cpioArchiveInputStreamConstructor = cpioArchiveInputStreamClazz.getDeclaredConstructor(zipFileInflaterInputStreamType, intType);
        cpioArchiveInputStreamConstructor.setAccessible(true);
        java.lang.Object[] cpioArchiveInputStreamConstructorArguments = new java.lang.Object[2];
        cpioArchiveInputStreamConstructorArguments[0] = zipFileInflaterInputStream;
        cpioArchiveInputStreamConstructorArguments[1] = 0;
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) cpioArchiveInputStreamConstructor.newInstance(cpioArchiveInputStreamConstructorArguments));
        
        Method readOldAsciiEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readOldAsciiEntry");
        readOldAsciiEntryMethod.setAccessible(true);
        java.lang.Object[] readOldAsciiEntryMethodArguments = new java.lang.Object[0];
        try {
            readOldAsciiEntryMethod.invoke(cpioArchiveInputStream, readOldAsciiEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readOldAsciiEntry()}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: ret.setDevice(readAsciiLong(6, 8));
 *  */
    @Test(expected = ZipException.class)
    public void testReadOldAsciiEntry_ThrowZipException() throws Throwable  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry.setMethod(1);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(jarInputStream, 0);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method readOldAsciiEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readOldAsciiEntry");
        readOldAsciiEntryMethod.setAccessible(true);
        java.lang.Object[] readOldAsciiEntryMethodArguments = new java.lang.Object[0];
        try {
            readOldAsciiEntryMethod.invoke(cpioArchiveInputStream, readOldAsciiEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readOldAsciiEntry()}
 * @utbot.throwsException {@link java.io.EOFException} in: ret.setDevice(readAsciiLong(6, 8));
 *  */
    @Test(expected = EOFException.class)
    public void testReadOldAsciiEntry_ThrowEOFException() throws Throwable  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(jarInputStream, 0);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method readOldAsciiEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readOldAsciiEntry");
        readOldAsciiEntryMethod.setAccessible(true);
        java.lang.Object[] readOldAsciiEntryMethodArguments = new java.lang.Object[0];
        try {
            readOldAsciiEntryMethod.invoke(cpioArchiveInputStream, readOldAsciiEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readOldAsciiEntry()}
 * @utbot.throwsException {@link java.io.EOFException} in: ret.setDevice(readAsciiLong(6, 8));
 *  */
    @Test(expected = EOFException.class)
    public void testReadOldAsciiEntry_ThrowEOFException_1() throws Throwable  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(jarInputStream, 0);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method readOldAsciiEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readOldAsciiEntry");
        readOldAsciiEntryMethod.setAccessible(true);
        java.lang.Object[] readOldAsciiEntryMethodArguments = new java.lang.Object[0];
        try {
            readOldAsciiEntryMethod.invoke(cpioArchiveInputStream, readOldAsciiEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readOldAsciiEntry
    
    public void testReadOldAsciiEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readCString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readCString(int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readCString(int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: byte[] tmpBuffer = new byte[length];
 *  */
    @Test
    public void testReadCString_ThrowNegativeArraySizeException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readCString] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readCString(CpioArchiveInputStream.java:408) */
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method readCStringMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readCString", intType);
        readCStringMethod.setAccessible(true);
        java.lang.Object[] readCStringMethodArguments = new java.lang.Object[1];
        readCStringMethodArguments[0] = -256;
        try {
            readCStringMethod.invoke(cpioArchiveInputStream, readCStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method readCString(int)
    
    @Test
    public void testReadCString1() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readCString] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count -1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.<init>(String.java:523)
            java.base/java.lang.String.<init>(String.java:1419)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readCString(CpioArchiveInputStream.java:410) */
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method readCStringMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readCString", intType);
        readCStringMethod.setAccessible(true);
        java.lang.Object[] readCStringMethodArguments = new java.lang.Object[1];
        readCStringMethodArguments[0] = 0;
        try {
            readCStringMethod.invoke(cpioArchiveInputStream, readCStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testReadCString2() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(null, 0);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readCString] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(CpioArchiveInputStream.java:296)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readCString(CpioArchiveInputStream.java:409) */
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method readCStringMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readCString", intType);
        readCStringMethod.setAccessible(true);
        java.lang.Object[] readCStringMethodArguments = new java.lang.Object[1];
        readCStringMethodArguments[0] = 9;
        try {
            readCStringMethod.invoke(cpioArchiveInputStream, readCStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        
                java.lang.reflect.Method methodForGetDeclaredFields971569381823400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields971569381823400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass971569381828400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields971569381823400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass971569381828400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields971569382666500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields971569382666500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass971569382667400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields971569382666500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass971569382667400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


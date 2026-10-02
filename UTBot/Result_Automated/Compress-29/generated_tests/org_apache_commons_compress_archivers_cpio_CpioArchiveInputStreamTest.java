package org.apache.commons.compress.archivers.cpio;

import org.junit.Test;
import java.io.IOException;
import java.util.zip.InflaterInputStream;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import java.util.jar.JarInputStream;
import java.util.zip.Inflater;
import jdk.internal.ref.CleanerImpl.PhantomCleanableRef;
import jdk.internal.ref.CleanerImpl;
import java.lang.reflect.Method;
import java.util.jar.JarEntry;
import java.util.zip.ZipException;
import java.io.EOFException;
import sun.security.util.ManifestEntryVerifier;
import java.util.Properties;
import java.util.LinkedHashMap;
import java.security.CodeSigner;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import sun.security.provider.Sun;
import org.apache.commons.compress.utils.BoundedInputStream;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
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
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(CpioArchiveInputStream.java:527) */
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
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(CpioArchiveInputStream.java:527) */
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
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(CpioArchiveInputStream.java:530) */
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
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(CpioArchiveInputStream.java:542) */
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
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(CpioArchiveInputStream.java:545) */
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
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(CpioArchiveInputStream.java:548) */
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
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(CpioArchiveInputStream.java:552) */
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
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(CpioArchiveInputStream.java:527) */
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
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", java.lang.Short.MIN_VALUE);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", -2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 25L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 25L);
        byte[] byteArray = {(byte) -126};
        
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
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", -33);
        entry.setChksum(-255L);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -132L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", -132L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "crc", -255L);
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
    public void testRead_ThrowIndexOutOfBoundsException() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        cpioArchiveInputStream.read(byteArray, 3, 0);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (off < 0): False}
 * @utbot.executesCondition {@code (len < 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: off < 0 || len < 0 || off > b.length - len
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_1() throws Exception  {
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
    public void testRead_ThrowIndexOutOfBoundsException_2() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        
        cpioArchiveInputStream.read(null, -1, 0);
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
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getSize()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getDataPadCount()}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(int)
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: skip(entry.getDataPadCount());
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_3() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 1L);
        byte[] fourBytesBuf = {};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "FOUR_BYTES_BUF", fourBytesBuf);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        cpioArchiveInputStream.read(byteArray, 0, 2);
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
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 128);
        entry.setChksum(8L);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 0L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 0L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "crc", 9L);
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveInputStream.read(byteArray, 0, 1);
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
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.read(CpioArchiveInputStream.java:297) */
        cpioArchiveInputStream.read(null, 0, 0);
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
        ZipInputStream in = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
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
        ZipInputStream in = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
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
        ZipInputStream in = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
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
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.close(CpioArchiveInputStream.java:188) */
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
        CleanerImpl.PhantomCleanableRef cleanable = ((CleanerImpl.PhantomCleanableRef) createInstance("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
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
    public void testSkip_LenGreaterThanThisTmpbufLength() throws Exception  {
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method skip(long)
    
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
    public void testSkip_LenGreaterThanThisTmpbufLength_1() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -255);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", -2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 1L);
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
    public void testSkip_LenGreaterThanThisTmpbufLength_3() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 16);
        entry.setChksum(-255L);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 256L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 256L);
        byte[] tmpbuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "crc", -255L);
        
        long actual = cpioArchiveInputStream.skip(2L);
        
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
    public void testSkip_ThrowIllegalArgumentException() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        
        cpioArchiveInputStream.skip(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(long)}
 * @utbot.executesCondition {@code (n < 0): False}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#ensureOpen()
 * @utbot.invokes {@link java.lang.Math#min(long,long)}
 * @utbot.iterates iterate the loop {@code while(total < max)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSkip_ThrowIndexOutOfBoundsException() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 1L);
        byte[] tmpbuf = {(byte) -126};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        byte[] fourBytesBuf = {};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "FOUR_BYTES_BUF", fourBytesBuf);
        
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
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", -231);
        entry.setChksum(2L);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 44L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 44L);
        byte[] tmpbuf = {(byte) -126};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "crc", 9223372036854775555L);
        
        cpioArchiveInputStream.skip(2L);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method skip(long)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(long)}
 * @utbot.executesCondition {@code (n < 0): False}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#ensureOpen()
 * @utbot.invokes {@link java.lang.Math#min(long,long)}
 * @utbot.iterates iterate the loop {@code while(total < max)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: len > this.tmpbuf.length
 *  */
    @Test
    public void testSkip_ThrowNullPointerException() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(CpioArchiveInputStream.java:474) */
        cpioArchiveInputStream.skip(1L);
    }
    ///endregion
    
    ///region Errors report for skip
    
    public void testSkip_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
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
    public void testSkip_BytesLessOrEqualZero() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method skipMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("skip", intType);
        skipMethod.setAccessible(true);
        java.lang.Object[] skipMethodArguments = new java.lang.Object[1];
        skipMethodArguments[0] = 0;
        skipMethod.invoke(cpioArchiveInputStream, skipMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method skip(int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(int)}
 * @utbot.executesCondition {@code (bytes > 0): True}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readFully(byte[],int,int)
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: readFully(FOUR_BYTES_BUF, 0, bytes);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSkip_ThrowIndexOutOfBoundsException1() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
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
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method skip(int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#skip(int)}
 * @utbot.throwsException {@link java.io.IOException} in: readFully(FOUR_BYTES_BUF, 0, bytes);
 *  */
    @Test(expected = IOException.class)
    public void testSkip_ThrowIOException1() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
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
 * @utbot.throwsException {@link java.util.zip.ZipException} in: readFully(FOUR_BYTES_BUF, 0, bytes);
 *  */
    @Test(expected = ZipException.class)
    public void testSkip_ThrowZipException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setMethod(1);
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
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
        byte[] fourBytesBuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "FOUR_BYTES_BUF", fourBytesBuf);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
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
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testSkip_ThrowIOException_11() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 2L);
        Object in1 = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] fourBytesBuf = new byte[39];
        fourBytesBuf[0] = (byte) -127;
        fourBytesBuf[1] = (byte) -127;
        fourBytesBuf[2] = (byte) -127;
        fourBytesBuf[3] = (byte) -127;
        fourBytesBuf[4] = (byte) -127;
        fourBytesBuf[5] = (byte) -127;
        fourBytesBuf[6] = (byte) -127;
        fourBytesBuf[7] = (byte) -127;
        fourBytesBuf[8] = (byte) -127;
        fourBytesBuf[9] = (byte) -127;
        fourBytesBuf[10] = (byte) -127;
        fourBytesBuf[11] = (byte) -127;
        fourBytesBuf[12] = (byte) -127;
        fourBytesBuf[13] = (byte) -127;
        fourBytesBuf[14] = (byte) -127;
        fourBytesBuf[15] = (byte) -127;
        fourBytesBuf[16] = (byte) -127;
        fourBytesBuf[17] = (byte) -127;
        fourBytesBuf[18] = (byte) -127;
        fourBytesBuf[19] = (byte) -127;
        fourBytesBuf[20] = (byte) -127;
        fourBytesBuf[21] = (byte) -127;
        fourBytesBuf[22] = (byte) -127;
        fourBytesBuf[23] = (byte) -127;
        fourBytesBuf[24] = (byte) -127;
        fourBytesBuf[25] = (byte) -127;
        fourBytesBuf[26] = (byte) -127;
        fourBytesBuf[27] = (byte) -127;
        fourBytesBuf[28] = (byte) -127;
        fourBytesBuf[29] = (byte) -127;
        fourBytesBuf[30] = (byte) -127;
        fourBytesBuf[31] = (byte) -127;
        fourBytesBuf[32] = (byte) -127;
        fourBytesBuf[33] = (byte) -127;
        fourBytesBuf[34] = (byte) -127;
        fourBytesBuf[35] = (byte) -127;
        fourBytesBuf[36] = (byte) -127;
        fourBytesBuf[37] = (byte) -127;
        fourBytesBuf[38] = (byte) -127;
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "FOUR_BYTES_BUF", fourBytesBuf);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method skipMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("skip", intType);
        skipMethod.setAccessible(true);
        java.lang.Object[] skipMethodArguments = new java.lang.Object[1];
        skipMethodArguments[0] = 39;
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
        byte[] fourBytesBuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "FOUR_BYTES_BUF", fourBytesBuf);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
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
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] fourBytesBuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "FOUR_BYTES_BUF", fourBytesBuf);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
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
        
        // 4 occurrences of:
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
 * @utbot.invokes {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#count(int)}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testReadFully_CpioArchiveInputStreamCount() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        byte[] byteArray = {};
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFullyMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readFully", byteArrayType, intType, intType);
        readFullyMethod.setAccessible(true);
        java.lang.Object[] readFullyMethodArguments = new java.lang.Object[3];
        readFullyMethodArguments[0] = ((Object) byteArray);
        readFullyMethodArguments[1] = 0;
        readFullyMethodArguments[2] = 0;
        int actual = ((Integer) readFullyMethod.invoke(cpioArchiveInputStream, readFullyMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readFully([B, int, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readFully(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: int count = IOUtils.readFully(in, b, off, len);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFully_ThrowIndexOutOfBoundsException_3() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] byteArray = {};
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFullyMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readFully", byteArrayType, intType, intType);
        readFullyMethod.setAccessible(true);
        java.lang.Object[] readFullyMethodArguments = new java.lang.Object[3];
        readFullyMethodArguments[0] = ((Object) byteArray);
        readFullyMethodArguments[1] = 1073741840;
        readFullyMethodArguments[2] = 1073741825;
        try {
            readFullyMethod.invoke(cpioArchiveInputStream, readFullyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readFully(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: int count = IOUtils.readFully(in, b, off, len);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFully_ThrowIndexOutOfBoundsException_2() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        byte[] byteArray = {};
        
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
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: int count = IOUtils.readFully(in, b, off, len);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFully_ThrowIndexOutOfBoundsException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFullyMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readFully", byteArrayType, intType, intType);
        readFullyMethod.setAccessible(true);
        java.lang.Object[] readFullyMethodArguments = new java.lang.Object[3];
        readFullyMethodArguments[0] = ((Object) null);
        readFullyMethodArguments[1] = -255;
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
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: int count = IOUtils.readFully(in, b, off, len);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFully_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFullyMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readFully", byteArrayType, intType, intType);
        readFullyMethod.setAccessible(true);
        java.lang.Object[] readFullyMethodArguments = new java.lang.Object[3];
        readFullyMethodArguments[0] = ((Object) null);
        readFullyMethodArguments[1] = -1;
        readFullyMethodArguments[2] = 0;
        try {
            readFullyMethod.invoke(cpioArchiveInputStream, readFullyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readFully(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: int count = IOUtils.readFully(in, b, off, len);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFully_ThrowIndexOutOfBoundsException_4() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] byteArray = new byte[24];
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
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFullyMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readFully", byteArrayType, intType, intType);
        readFullyMethod.setAccessible(true);
        java.lang.Object[] readFullyMethodArguments = new java.lang.Object[3];
        readFullyMethodArguments[0] = ((Object) byteArray);
        readFullyMethodArguments[1] = 1082130481;
        readFullyMethodArguments[2] = 1073741840;
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
 * @utbot.throwsException {@link java.io.EOFException} when: count < len
 *  */
    @Test(expected = EOFException.class)
    public void testReadFully_ThrowEOFException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
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
 * @utbot.throwsException {@link java.io.EOFException} when: count < len
 *  */
    @Test(expected = EOFException.class)
    public void testReadFully_ThrowEOFException_1() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        java.security.CodeSigner[] signers = {null};
        setField(first, "java.util.jar.JarEntry", "signers", signers);
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
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
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadFully_ThrowIOException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 1L);
        Object in1 = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
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
 * @utbot.throwsException {@link java.io.EOFException} when: count < len
 *  */
    @Test(expected = EOFException.class)
    public void testReadFully_ThrowEOFException_2() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
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
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
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
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "blockSize", -1348003037);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 1344299777L);
        
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
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "blockSize", -1);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
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
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "blockSize", 2097153);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 1152922054366855169L);
        
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
        byte[] tmpbuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "blockSize", 2097154);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 274880266240L);
        
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
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "blockSize", 129);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 8510219998986626L);
        
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
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skipRemainderOfLastBlock(CpioArchiveInputStream.java:496) */
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
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "blockSize", 2);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 17592186044417L);
        
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldAsciiEntry
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readOldAsciiEntry()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readOldAsciiEntry()}
 * @utbot.throwsException {@link java.io.IOException} in: ret.setDevice(readAsciiLong(6, 8));
 *  */
    @Test(expected = IOException.class)
    public void testReadOldAsciiEntry_ThrowIOException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
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
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
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
 * @utbot.throwsException {@link java.util.zip.ZipException} in: ret.setDevice(readAsciiLong(6, 8));
 *  */
    @Test(expected = ZipException.class)
    public void testReadOldAsciiEntry_ThrowZipException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setMethod(1);
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
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
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadOldAsciiEntry_ThrowIOException_1() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 1L);
        Object in1 = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
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
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        java.security.CodeSigner[] signers = {null};
        setField(first, "java.util.jar.JarEntry", "signers", signers);
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
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
    public void testReadOldAsciiEntry_ThrowEOFException_2() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        Hashtable verifiedSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 0L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readOldAsciiEntry()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readOldAsciiEntry()}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readAsciiLong(int,int)
 * @utbot.throwsException {@link java.lang.SecurityException} 
 *  */
    @Test(expected = SecurityException.class)
    public void testReadOldAsciiEntry_ThrowSecurityException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Hashtable verifiedSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", verifiedSigners);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
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
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] twoBytesBuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "TWO_BYTES_BUF", twoBytesBuf);
        
        cpioArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.io.IOException} 
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
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testGetNextEntry_ThrowIOException_3() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 1L);
        Object in1 = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] twoBytesBuf = {(byte) -127, (byte) -127};
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
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] twoBytesBuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "TWO_BYTES_BUF", twoBytesBuf);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
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
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] twoBytesBuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "TWO_BYTES_BUF", twoBytesBuf);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        cpioArchiveInputStream.getNextEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNextEntry()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextEntry()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextCPIOEntry()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getNextCPIOEntry();
 *  */
    @Test
    public void testGetNextEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        byte[] twoBytesBuf = {};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "TWO_BYTES_BUF", twoBytesBuf);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(CpioUtil.java:65)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry(CpioArchiveInputStream.java:236)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry(CpioArchiveInputStream.java:489) */
        cpioArchiveInputStream.getNextEntry();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getNextEntry()
    
    @Test
    public void testGetNextEntry1() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        byte[] tmpbuf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry(CpioArchiveInputStream.java:235)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry(CpioArchiveInputStream.java:489) */
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readCString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readCString(int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readCString(int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: byte[] tmpBuffer = new byte[length - 1];
 *  */
    @Test
    public void testReadCString_ThrowNegativeArraySizeException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readCString] produces [java.lang.NegativeArraySizeException: -255]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readCString(CpioArchiveInputStream.java:446) */
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method readCStringMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readCString", intType);
        readCStringMethod.setAccessible(true);
        java.lang.Object[] readCStringMethodArguments = new java.lang.Object[1];
        readCStringMethodArguments[0] = -254;
        try {
            readCStringMethod.invoke(cpioArchiveInputStream, readCStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readCString(int)}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readFully(byte[],int,int)
 * @utbot.invokes {@link java.io.InputStream#read()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.in.read();
 *  */
    @Test
    public void testReadCString_ThrowNullPointerException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readCString] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readCString(CpioArchiveInputStream.java:448) */
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method readCStringMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readCString", intType);
        readCStringMethod.setAccessible(true);
        java.lang.Object[] readCStringMethodArguments = new java.lang.Object[1];
        readCStringMethodArguments[0] = 1;
        try {
            readCStringMethod.invoke(cpioArchiveInputStream, readCStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readCString(int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readCString(int)}
 * @utbot.throwsException {@link java.io.IOException} in: this.in.read();
 *  */
    @Test(expected = IOException.class)
    public void testReadCString_ThrowIOException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method readCStringMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readCString", intType);
        readCStringMethod.setAccessible(true);
        java.lang.Object[] readCStringMethodArguments = new java.lang.Object[1];
        readCStringMethodArguments[0] = 1;
        try {
            readCStringMethod.invoke(cpioArchiveInputStream, readCStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readCString(int)}
 * @utbot.throwsException {@link java.io.IOException} in: readFully(tmpBuffer, 0, tmpBuffer.length);
 *  */
    @Test(expected = IOException.class)
    public void testReadCString_ThrowIOException_1() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method readCStringMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readCString", intType);
        readCStringMethod.setAccessible(true);
        java.lang.Object[] readCStringMethodArguments = new java.lang.Object[1];
        readCStringMethodArguments[0] = 2;
        try {
            readCStringMethod.invoke(cpioArchiveInputStream, readCStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readCString(int)}
 * @utbot.throwsException {@link java.io.IOException} in: this.in.read();
 *  */
    @Test(expected = IOException.class)
    public void testReadCString_ThrowIOException_2() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method readCStringMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readCString", intType);
        readCStringMethod.setAccessible(true);
        java.lang.Object[] readCStringMethodArguments = new java.lang.Object[1];
        readCStringMethodArguments[0] = 1;
        try {
            readCStringMethod.invoke(cpioArchiveInputStream, readCStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readCString(int)}
 * @utbot.throwsException {@link java.io.IOException} in: readFully(tmpBuffer, 0, tmpBuffer.length);
 *  */
    @Test(expected = IOException.class)
    public void testReadCString_ThrowIOException_3() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method readCStringMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readCString", intType);
        readCStringMethod.setAccessible(true);
        java.lang.Object[] readCStringMethodArguments = new java.lang.Object[1];
        readCStringMethodArguments[0] = 2;
        try {
            readCStringMethod.invoke(cpioArchiveInputStream, readCStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readCString(int)}
 * @utbot.throwsException {@link java.io.EOFException} in: readFully(tmpBuffer, 0, tmpBuffer.length);
 *  */
    @Test(expected = EOFException.class)
    public void testReadCString_ThrowEOFException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method readCStringMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readCString", intType);
        readCStringMethod.setAccessible(true);
        java.lang.Object[] readCStringMethodArguments = new java.lang.Object[1];
        readCStringMethodArguments[0] = 2;
        try {
            readCStringMethod.invoke(cpioArchiveInputStream, readCStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readCString(int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadCString_ThrowIOException_4() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 1L);
        Object in1 = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method readCStringMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readCString", intType);
        readCStringMethod.setAccessible(true);
        java.lang.Object[] readCStringMethodArguments = new java.lang.Object[1];
        readCStringMethodArguments[0] = 3;
        try {
            readCStringMethod.invoke(cpioArchiveInputStream, readCStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readCString(int)}
 * @utbot.throwsException {@link java.io.EOFException} in: readFully(tmpBuffer, 0, tmpBuffer.length);
 *  */
    @Test(expected = EOFException.class)
    public void testReadCString_ThrowEOFException_1() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method readCStringMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readCString", intType);
        readCStringMethod.setAccessible(true);
        java.lang.Object[] readCStringMethodArguments = new java.lang.Object[1];
        readCStringMethodArguments[0] = 2;
        try {
            readCStringMethod.invoke(cpioArchiveInputStream, readCStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readCString(int)}
 * @utbot.throwsException {@link java.io.EOFException} in: readFully(tmpBuffer, 0, tmpBuffer.length);
 *  */
    @Test(expected = EOFException.class)
    public void testReadCString_ThrowEOFException_2() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Sun verifiedSigners = ((Sun) createInstance("sun.security.provider.Sun"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method readCStringMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readCString", intType);
        readCStringMethod.setAccessible(true);
        java.lang.Object[] readCStringMethodArguments = new java.lang.Object[1];
        readCStringMethodArguments[0] = 2;
        try {
            readCStringMethod.invoke(cpioArchiveInputStream, readCStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readCString(int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readCString(int)}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readFully(byte[],int,int)
 * @utbot.invokes {@link java.io.InputStream#read()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: this.in.read();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadCString_ThrowIndexOutOfBoundsException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        byte[] singleByteBuf = {};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Method readCStringMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readCString", intType);
        readCStringMethod.setAccessible(true);
        java.lang.Object[] readCStringMethodArguments = new java.lang.Object[1];
        readCStringMethodArguments[0] = 1;
        try {
            readCStringMethod.invoke(cpioArchiveInputStream, readCStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readCString
    
    public void testReadCString_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldBinaryEntry
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readOldBinaryEntry(boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readOldBinaryEntry(boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: ret.setDevice(readBinaryLong(2, swapHalfWord));
 *  */
    @Test(expected = IOException.class)
    public void testReadOldBinaryEntry_ThrowIOException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
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
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 2L);
        Object in1 = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
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
    public void testReadOldBinaryEntry_ThrowEOFException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
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
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 0L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
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
    
    ///region FUZZER: CHECKED EXCEPTIONS for method readOldBinaryEntry(boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readOldBinaryEntry(boolean)}
     */
    @Test(expected = EOFException.class)
    public void testReadOldBinaryEntryThrowsEOFE() throws Throwable  {
        BoundedInputStream boundedInputStream = new BoundedInputStream(null, 0L);
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(((InputStream) boundedInputStream), 0);
        
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
        // 4 occurrences of:
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
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readAsciiLong] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readAsciiLong(CpioArchiveInputStream.java:352) */
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method readAsciiLong(int, int)
    
    @Test
    public void testReadAsciiLong1() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readAsciiLong] produces [java.lang.NumberFormatException: radix -255 less than Character.MIN_RADIX]
            java.base/java.lang.Long.parseLong(Long.java:678)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readAsciiLong(CpioArchiveInputStream.java:354) */
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
 * @utbot.iterates iterate the loop {@code while(skip((long) Integer.MAX_VALUE) == Integer.MAX_VALUE)} once
 *  */
    @Test
    public void testCloseEntry_IterateWhileLoop_1() throws Exception  {
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
 * @utbot.iterates iterate the loop {@code while(skip((long) Integer.MAX_VALUE) == Integer.MAX_VALUE)} once
 *  */
    @Test
    public void testCloseEntry_IterateWhileLoop_2() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", java.lang.Short.MIN_VALUE);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", -131);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -131L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", -131L);
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
 * @utbot.iterates iterate the loop {@code while(skip((long) Integer.MAX_VALUE) == Integer.MAX_VALUE)} once
 *  */
    @Test
    public void testCloseEntry_IterateWhileLoop_3() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", java.lang.Short.MIN_VALUE);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -255L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", -255L);
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
 * @utbot.iterates iterate the loop {@code while(skip((long) Integer.MAX_VALUE) == Integer.MAX_VALUE)} once
 *  */
    @Test
    public void testCloseEntry_IterateWhileLoop_4() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", -2);
        entry.setChksum(-255L);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 1L);
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
 * @utbot.iterates iterate the loop {@code while(skip((long) Integer.MAX_VALUE) == Integer.MAX_VALUE)} once
 *  */
    @Test
    public void testCloseEntry_IterateWhileLoop() throws Exception  {
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
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method closeEntry()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#closeEntry()}
 * @utbot.throwsException {@link java.io.IOException} in: while(skip((long) Integer.MAX_VALUE) == Integer.MAX_VALUE)
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
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method closeEntry()
    
    @Test
    public void testCloseEntry1() throws Exception  {
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
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Method closeEntryMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("closeEntry");
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[0];
        closeEntryMethod.invoke(cpioArchiveInputStream, closeEntryMethodArguments);
        
        boolean finalCpioArchiveInputStreamEntryEOF = ((Boolean) getFieldValue(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF"));
        
        assertTrue(finalCpioArchiveInputStreamEntryEOF);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method closeEntry()
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testCloseEntry2() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 4971974160415719461L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 4971974160415719461L);
        byte[] tmpbuf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        byte[] fourBytesBuf = {};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "FOUR_BYTES_BUF", fourBytesBuf);
        
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
    
    ///region OTHER: CHECKED EXCEPTIONS for method closeEntry()
    
    @Test(expected = IOException.class)
    public void testCloseEntry3() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        entry.setChksum(0L);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 0L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", 0L);
        byte[] tmpbuf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "crc", 1L);
        
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
    
    ///region OTHER: ERROR SUITE for method closeEntry()
    
    @Test
    public void testCloseEntry4() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -4611686018427387899L);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryBytesRead", java.lang.Long.MAX_VALUE);
        byte[] tmpbuf = new byte[23];
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.closeEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.IOUtils.readFully(IOUtils.java:158)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(CpioArchiveInputStream.java:335)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.read(CpioArchiveInputStream.java:322)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(CpioArchiveInputStream.java:477)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.closeEntry(CpioArchiveInputStream.java:204) */
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
    
    ///region OTHER: TIMEOUTS for method closeEntry()
    
    @Test(timeout = 1000L)
    public void testCloseEntry5() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        byte[] tmpbuf = {};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
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
        // 1 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNextCPIOEntry()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextCPIOEntry()}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readFully(byte[],int,int)
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioUtil#byteArray2long(byte[],boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: CpioUtil.byteArray2long(TWO_BYTES_BUF, false) == MAGIC_OLD_BINARY
 *  */
    @Test
    public void testGetNextCPIOEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        byte[] twoBytesBuf = {};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "TWO_BYTES_BUF", twoBytesBuf);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(CpioUtil.java:65)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry(CpioArchiveInputStream.java:236) */
        cpioArchiveInputStream.getNextCPIOEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextCPIOEntry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: readFully(TWO_BYTES_BUF, 0, TWO_BYTES_BUF.length);
 *  */
    @Test
    public void testGetNextCPIOEntry_ThrowNullPointerException() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry(CpioArchiveInputStream.java:235) */
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
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
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
 * @utbot.throwsException {@link java.io.EOFException} in: readFully(TWO_BYTES_BUF, 0, TWO_BYTES_BUF.length);
 *  */
    @Test(expected = EOFException.class)
    public void testGetNextCPIOEntry_ThrowEOFException() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] twoBytesBuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "TWO_BYTES_BUF", twoBytesBuf);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        cpioArchiveInputStream.getNextCPIOEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#getNextCPIOEntry()}
 * @utbot.executesCondition {@code (this.entry != null): False}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: readFully(TWO_BYTES_BUF, 0, TWO_BYTES_BUF.length);
 *  */
    @Test(expected = ZipException.class)
    public void testGetNextCPIOEntry_ThrowZipException() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry.setMethod(1);
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
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
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 1L);
        Object in1 = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
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
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] twoBytesBuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "TWO_BYTES_BUF", twoBytesBuf);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
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
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        byte[] twoBytesBuf = {(byte) -127};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "TWO_BYTES_BUF", twoBytesBuf);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        cpioArchiveInputStream.getNextCPIOEntry();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getNextCPIOEntry()
    
    @Test
    public void testGetNextCPIOEntry1() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entryEOF", true);
        byte[] tmpbuf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry(CpioArchiveInputStream.java:235) */
        cpioArchiveInputStream.getNextCPIOEntry();
    }
    
    @Test
    public void testGetNextCPIOEntry2() throws Exception  {
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
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry(CpioArchiveInputStream.java:235) */
        cpioArchiveInputStream.getNextCPIOEntry();
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getNextCPIOEntry()
    
    @Test(timeout = 1000L)
    public void testGetNextCPIOEntry3() throws Exception  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "entry", entry);
        byte[] tmpbuf = {};
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "tmpbuf", tmpbuf);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readBinaryLong(int, boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readBinaryLong(int,boolean)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: byte[] tmp = new byte[length];
 *  */
    @Test
    public void testReadBinaryLong_ThrowNegativeArraySizeException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong(CpioArchiveInputStream.java:345) */
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
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(CpioUtil.java:65)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong(CpioArchiveInputStream.java:347) */
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
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return CpioUtil.byteArray2long(tmp, swapHalfWord);
 *  */
    @Test
    public void testReadBinaryLong_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(CpioUtil.java:65)
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong(CpioArchiveInputStream.java:347) */
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readBinaryLong(int, boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readBinaryLong(int,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: readFully(tmp, 0, tmp.length);
 *  */
    @Test(expected = IOException.class)
    public void testReadBinaryLong_ThrowIOException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
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
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
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
 * @utbot.throwsException {@link java.io.EOFException} in: readFully(tmp, 0, tmp.length);
 *  */
    @Test(expected = EOFException.class)
    public void testReadBinaryLong_ThrowEOFException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
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
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadBinaryLong_ThrowIOException_2() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 1L);
        Object in1 = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
        Class cpioArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method readBinaryLongMethod = cpioArchiveInputStreamClazz.getDeclaredMethod("readBinaryLong", intType, booleanType);
        readBinaryLongMethod.setAccessible(true);
        java.lang.Object[] readBinaryLongMethodArguments = new java.lang.Object[2];
        readBinaryLongMethodArguments[0] = 2;
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
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
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
 * @utbot.throwsException {@link java.io.EOFException} in: readFully(tmp, 0, tmp.length);
 *  */
    @Test(expected = EOFException.class)
    public void testReadBinaryLong_ThrowEOFException_2() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
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
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
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
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readNewEntry
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readNewEntry(boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readNewEntry(boolean)}
 * @utbot.executesCondition {@code (hasCrc): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadNewEntry_ThrowIOException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
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
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readNewEntry(boolean)}
 * @utbot.executesCondition {@code (hasCrc): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadNewEntry_ThrowIOException_1() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        
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
    
    /**
    @utbot.classUnderTest {@link CpioArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readNewEntry(boolean)}
 * @utbot.executesCondition {@code (hasCrc): True}
 * @utbot.throwsException {@link java.io.EOFException} in: ret.setInode(readAsciiLong(8, 16));
 *  */
    @Test(expected = EOFException.class)
    public void testReadNewEntry_ThrowEOFException() throws Throwable  {
        CpioArchiveInputStream cpioArchiveInputStream = ((CpioArchiveInputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "in", in);
        setField(cpioArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
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
    
    ///region FUZZER: CHECKED EXCEPTIONS for method readNewEntry(boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream#readNewEntry(boolean)}
     */
    @Test(expected = EOFException.class)
    public void testReadNewEntryThrowsEOFE() throws Throwable  {
        BoundedInputStream boundedInputStream = new BoundedInputStream(null, 0L);
        CpioArchiveInputStream cpioArchiveInputStream = new CpioArchiveInputStream(((InputStream) boundedInputStream), 8);
        
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
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
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
        
                java.lang.reflect.Method methodForGetDeclaredFields973433296851900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields973433296851900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass973433296857100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields973433296851900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass973433296857100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields973433297232900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields973433297232900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass973433297234700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields973433297232900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass973433297234700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import java.util.zip.InflaterInputStream;
import java.lang.reflect.Method;
import java.util.jar.JarInputStream;
import java.util.jar.JarEntry;
import java.security.CodeSigner;
import sun.security.util.ManifestEntryVerifier;
import java.io.IOException;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;
import java.util.zip.Inflater;
import jdk.internal.ref.CleanerImpl.PhantomCleanableRef;
import jdk.internal.ref.CleanerImpl;
import java.io.EOFException;
import java.io.ByteArrayInputStream;
import java.util.zip.ZipEntry;
import java.nio.ReadOnlyBufferException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.apache.commons.compress.archivers.ArchiveEntry;
import java.io.PushbackInputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream;
import org.apache.commons.compress.compressors.z.ZCompressorInputStream;
import java.io.ByteArrayOutputStream;
import sun.security.provider.Sun;
import java.util.zip.CheckedInputStream;
import java.io.InputStream;
import sun.security.util.DerOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_compress_archivers_zip_ZipArchiveInputStreamTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method matches([B, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < ZipArchiveOutputStream.LFH_SIG.length): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMatches_LengthLessThanZipArchiveOutputStreamLFH_SIGLength() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevLFH_SIG = ZipArchiveOutputStream.LFH_SIG;
        try {
            byte[] lfhSig = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "LFH_SIG", lfhSig);
            
            boolean actual = ZipArchiveInputStream.matches(null, 3);
            
            assertFalse(actual);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "LFH_SIG", prevLFH_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < ZipArchiveOutputStream.LFH_SIG.length): False}
 * @utbot.returnsFrom {@code return checksig(signature, ZipArchiveOutputStream.LFH_SIG) || checksig(signature, ZipArchiveOutputStream.EOCD_SIG) || checksig(signature, ZipArchiveOutputStream.DD_SIG) || checksig(signature, ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes());}
 *  */
    @Test
    public void testMatches_LengthGreaterOrEqualZipArchiveOutputStreamLFH_SIGLength() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevLFH_SIG = ZipArchiveOutputStream.LFH_SIG;
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        byte[] prevDD_SIG = ZipArchiveOutputStream.DD_SIG;
        ZipLong prevSINGLE_SEGMENT_SPLIT_MARKER = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        try {
            byte[] lfhSig = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "LFH_SIG", lfhSig);
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            byte[] ddSig = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            setStaticField(zipArchiveOutputStreamClazz, "DD_SIG", ddSig);
            ZipLong singleSegmentSplitMarker = new ZipLong(808471376L);
            Class zipLongClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipLong");
            setStaticField(zipLongClazz, "SINGLE_SEGMENT_SPLIT_MARKER", singleSegmentSplitMarker);
            byte[] byteArray = new byte[13];
            byteArray[0] = (byte) 80;
            byteArray[1] = (byte) 75;
            byteArray[2] = (byte) 48;
            byteArray[3] = (byte) 48;
            byteArray[4] = (byte) -127;
            byteArray[5] = (byte) -127;
            byteArray[6] = (byte) -127;
            byteArray[7] = (byte) -127;
            byteArray[8] = (byte) -127;
            byteArray[9] = (byte) -127;
            byteArray[10] = (byte) -127;
            byteArray[11] = (byte) -127;
            byteArray[12] = (byte) -127;
            
            boolean actual = ZipArchiveInputStream.matches(byteArray, 4);
            
            assertTrue(actual);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "LFH_SIG", prevLFH_SIG);
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
            setStaticField(ZipArchiveOutputStream.class, "DD_SIG", prevDD_SIG);
            setStaticField(ZipLong.class, "SINGLE_SEGMENT_SPLIT_MARKER", prevSINGLE_SEGMENT_SPLIT_MARKER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < ZipArchiveOutputStream.LFH_SIG.length): False}
 * @utbot.returnsFrom {@code return checksig(signature, ZipArchiveOutputStream.LFH_SIG) || checksig(signature, ZipArchiveOutputStream.EOCD_SIG) || checksig(signature, ZipArchiveOutputStream.DD_SIG) || checksig(signature, ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes());}
 *  */
    @Test
    public void testMatches_LengthGreaterOrEqualZipArchiveOutputStreamLFH_SIGLength_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevLFH_SIG = ZipArchiveOutputStream.LFH_SIG;
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        byte[] prevDD_SIG = ZipArchiveOutputStream.DD_SIG;
        ZipLong prevSINGLE_SEGMENT_SPLIT_MARKER = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        try {
            byte[] lfhSig = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "LFH_SIG", lfhSig);
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            byte[] ddSig = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            setStaticField(zipArchiveOutputStreamClazz, "DD_SIG", ddSig);
            ZipLong singleSegmentSplitMarker = new ZipLong(808471376L);
            Class zipLongClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipLong");
            setStaticField(zipLongClazz, "SINGLE_SEGMENT_SPLIT_MARKER", singleSegmentSplitMarker);
            byte[] byteArray = {(byte) -126, (byte) -127};
            
            boolean actual = ZipArchiveInputStream.matches(byteArray, 4);
            
            assertFalse(actual);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "LFH_SIG", prevLFH_SIG);
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
            setStaticField(ZipArchiveOutputStream.class, "DD_SIG", prevDD_SIG);
            setStaticField(ZipLong.class, "SINGLE_SEGMENT_SPLIT_MARKER", prevSINGLE_SEGMENT_SPLIT_MARKER);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method matches([B, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (length < ZipArchiveOutputStream.LFH_SIG.length): False}
    /// invoke:
    ///     org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#checksig(byte[],byte[]) once
    /// return from: {@code return checksig(signature, ZipArchiveOutputStream.LFH_SIG) || checksig(signature, ZipArchiveOutputStream.EOCD_SIG) || checksig(signature, ZipArchiveOutputStream.DD_SIG) || checksig(signature, ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes());}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#matches(byte[],int)}
 * @utbot.returnsFrom {@code return checksig(signature, ZipArchiveOutputStream.LFH_SIG) || checksig(signature, ZipArchiveOutputStream.EOCD_SIG) || checksig(signature, ZipArchiveOutputStream.DD_SIG) || checksig(signature, ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes());}
 *  */
    @Test
    public void testMatches_ReturnChecksigOrChecksigOrChecksigOrChecksig() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevLFH_SIG = ZipArchiveOutputStream.LFH_SIG;
        try {
            byte[] lfhSig = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "LFH_SIG", lfhSig);
            
            boolean actual = ZipArchiveInputStream.matches(lfhSig, 4);
            
            assertTrue(actual);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "LFH_SIG", prevLFH_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#matches(byte[],int)}
 * @utbot.returnsFrom {@code return checksig(signature, ZipArchiveOutputStream.LFH_SIG) || checksig(signature, ZipArchiveOutputStream.EOCD_SIG) || checksig(signature, ZipArchiveOutputStream.DD_SIG) || checksig(signature, ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes());}
 *  */
    @Test
    public void testMatches_ReturnChecksigOrChecksigOrChecksigOrChecksig_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevLFH_SIG = ZipArchiveOutputStream.LFH_SIG;
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        try {
            byte[] lfhSig = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "LFH_SIG", lfhSig);
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            
            boolean actual = ZipArchiveInputStream.matches(eocdSig, 4);
            
            assertTrue(actual);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "LFH_SIG", prevLFH_SIG);
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#matches(byte[],int)}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#checksig(byte[],byte[])
 * @utbot.returnsFrom {@code return checksig(signature, ZipArchiveOutputStream.LFH_SIG) || checksig(signature, ZipArchiveOutputStream.EOCD_SIG) || checksig(signature, ZipArchiveOutputStream.DD_SIG) || checksig(signature, ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes());}
 *  */
    @Test
    public void testMatches_ZipArchiveInputStreamChecksig() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevLFH_SIG = ZipArchiveOutputStream.LFH_SIG;
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        byte[] prevDD_SIG = ZipArchiveOutputStream.DD_SIG;
        try {
            byte[] lfhSig = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "LFH_SIG", lfhSig);
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            byte[] ddSig = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            setStaticField(zipArchiveOutputStreamClazz, "DD_SIG", ddSig);
            byte[] byteArray = new byte[29];
            byteArray[0] = (byte) 80;
            byteArray[1] = (byte) 75;
            byteArray[2] = (byte) 7;
            byteArray[3] = (byte) 8;
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
            
            boolean actual = ZipArchiveInputStream.matches(byteArray, 4);
            
            assertTrue(actual);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "LFH_SIG", prevLFH_SIG);
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
            setStaticField(ZipArchiveOutputStream.class, "DD_SIG", prevDD_SIG);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matches([B, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#matches(byte[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return checksig(signature, ZipArchiveOutputStream.LFH_SIG) || checksig(signature, ZipArchiveOutputStream.EOCD_SIG) || checksig(signature, ZipArchiveOutputStream.DD_SIG) || checksig(signature, ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes());
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevLFH_SIG = ZipArchiveOutputStream.LFH_SIG;
        try {
            byte[] lfhSig = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "LFH_SIG", lfhSig);
            byte[] byteArray = {};
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(ZipArchiveInputStream.java:585)
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(ZipArchiveInputStream.java:577) */
            ZipArchiveInputStream.matches(byteArray, 4);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "LFH_SIG", prevLFH_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#matches(byte[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return checksig(signature, ZipArchiveOutputStream.LFH_SIG) || checksig(signature, ZipArchiveOutputStream.EOCD_SIG) || checksig(signature, ZipArchiveOutputStream.DD_SIG) || checksig(signature, ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes());
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevLFH_SIG = ZipArchiveOutputStream.LFH_SIG;
        try {
            byte[] lfhSig = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "LFH_SIG", lfhSig);
            byte[] byteArray = {(byte) 80};
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(ZipArchiveInputStream.java:585)
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(ZipArchiveInputStream.java:577) */
            ZipArchiveInputStream.matches(byteArray, 4);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "LFH_SIG", prevLFH_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#matches(byte[],int)}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#checksig(byte[],byte[])
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#checksig(byte[],byte[])
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checksig(signature, ZipArchiveOutputStream.DD_SIG)
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevLFH_SIG = ZipArchiveOutputStream.LFH_SIG;
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        byte[] prevDD_SIG = ZipArchiveOutputStream.DD_SIG;
        try {
            byte[] lfhSig = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "LFH_SIG", lfhSig);
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            byte[] ddSig = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            setStaticField(zipArchiveOutputStreamClazz, "DD_SIG", ddSig);
            byte[] byteArray = {(byte) 80, (byte) 75, (byte) 7};
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(ZipArchiveInputStream.java:585)
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(ZipArchiveInputStream.java:579) */
            ZipArchiveInputStream.matches(byteArray, 4);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "LFH_SIG", prevLFH_SIG);
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
            setStaticField(ZipArchiveOutputStream.class, "DD_SIG", prevDD_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#matches(byte[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return checksig(signature, ZipArchiveOutputStream.LFH_SIG) || checksig(signature, ZipArchiveOutputStream.EOCD_SIG) || checksig(signature, ZipArchiveOutputStream.DD_SIG) || checksig(signature, ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes());
 *  */
    @Test
    public void testMatches_ThrowNullPointerException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevLFH_SIG = ZipArchiveOutputStream.LFH_SIG;
        try {
            byte[] lfhSig = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "LFH_SIG", lfhSig);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(ZipArchiveInputStream.java:585)
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(ZipArchiveInputStream.java:577) */
            ZipArchiveInputStream.matches(null, 4);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "LFH_SIG", prevLFH_SIG);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method matches([B, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#matches(byte[],int)}
     */
    @Test
    public void testMatchesReturnsFalseWithNonEmptyPrimitiveArrayAndCornerCase() {
        byte[] byteArray = {(byte) 0, (byte) -1, java.lang.Byte.MAX_VALUE};
        
        boolean actual = ZipArchiveInputStream.matches(byteArray, 0);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.fill
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method fill()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#fill()}
 * @utbot.returnsFrom {@code return length;}
 *  */
    @Test
    public void testFill_ReturnLength() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method fillMethod = zipArchiveInputStreamClazz.getDeclaredMethod("fill");
        fillMethod.setAccessible(true);
        java.lang.Object[] fillMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) fillMethod.invoke(zipArchiveInputStream, fillMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#fill()}
 * @utbot.returnsFrom {@code return length;}
 *  */
    @Test
    public void testFill_ReturnLength_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method fillMethod = zipArchiveInputStreamClazz.getDeclaredMethod("fill");
        fillMethod.setAccessible(true);
        java.lang.Object[] fillMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) fillMethod.invoke(zipArchiveInputStream, fillMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#fill()}
 * @utbot.returnsFrom {@code return length;}
 *  */
    @Test
    public void testFill_ReturnLength_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method fillMethod = zipArchiveInputStreamClazz.getDeclaredMethod("fill");
        fillMethod.setAccessible(true);
        java.lang.Object[] fillMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) fillMethod.invoke(zipArchiveInputStream, fillMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#fill()}
 * @utbot.returnsFrom {@code return length;}
 *  */
    @Test
    public void testFill_ReturnLength_3() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
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
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method fillMethod = zipArchiveInputStreamClazz.getDeclaredMethod("fill");
        fillMethod.setAccessible(true);
        java.lang.Object[] fillMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) fillMethod.invoke(zipArchiveInputStream, fillMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method fill()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#fill()}
 * @utbot.executesCondition {@code (closed): True}
 * @utbot.throwsException {@link java.io.IOException} when: closed
 *  */
    @Test(expected = IOException.class)
    public void testFill_ThrowIOException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "closed", true);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method fillMethod = zipArchiveInputStreamClazz.getDeclaredMethod("fill");
        fillMethod.setAccessible(true);
        java.lang.Object[] fillMethodArguments = new java.lang.Object[0];
        try {
            fillMethod.invoke(zipArchiveInputStream, fillMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#fill()}
 * @utbot.executesCondition {@code (closed): False}
 * @utbot.throwsException {@link java.io.IOException} in: final int length = in.read(buf.array());
 *  */
    @Test(expected = IOException.class)
    public void testFill_ThrowIOException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method fillMethod = zipArchiveInputStreamClazz.getDeclaredMethod("fill");
        fillMethod.setAccessible(true);
        java.lang.Object[] fillMethodArguments = new java.lang.Object[0];
        try {
            fillMethod.invoke(zipArchiveInputStream, fillMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#fill()}
 * @utbot.executesCondition {@code (closed): False}
 * @utbot.returnsFrom {@code return length;}
 * @utbot.throwsException {@link java.io.IOException} in: return length;
 *  */
    @Test(expected = IOException.class)
    public void testFill_ThrowIOException_2() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object in = createInstance("java.lang.Process$PipeInputStream");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method fillMethod = zipArchiveInputStreamClazz.getDeclaredMethod("fill");
        fillMethod.setAccessible(true);
        java.lang.Object[] fillMethodArguments = new java.lang.Object[0];
        try {
            fillMethod.invoke(zipArchiveInputStream, fillMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#fill()}
 * @utbot.executesCondition {@code (closed): False}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: final int length = in.read(buf.array());
 *  */
    @Test(expected = ZipException.class)
    public void testFill_ThrowZipException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry.setMethod(1);
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method fillMethod = zipArchiveInputStreamClazz.getDeclaredMethod("fill");
        fillMethod.setAccessible(true);
        java.lang.Object[] fillMethodArguments = new java.lang.Object[0];
        try {
            fillMethod.invoke(zipArchiveInputStream, fillMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method fill()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#fill()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int length = in.read(buf.array());
 *  */
    @Test
    public void testFill_ThrowNullPointerException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.fill] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.fill(ZipArchiveInputStream.java:711) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method fillMethod = zipArchiveInputStreamClazz.getDeclaredMethod("fill");
        fillMethod.setAccessible(true);
        java.lang.Object[] fillMethodArguments = new java.lang.Object[0];
        try {
            fillMethod.invoke(zipArchiveInputStream, fillMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#fill()}
 * @utbot.invokes {@link java.nio.ByteBuffer#array()}
 * @utbot.invokes {@link java.io.InputStream#read(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int length = in.read(buf.array());
 *  */
    @Test
    public void testFill_ThrowNullPointerException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object buf = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.fill] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.fill(ZipArchiveInputStream.java:711) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method fillMethod = zipArchiveInputStreamClazz.getDeclaredMethod("fill");
        fillMethod.setAccessible(true);
        java.lang.Object[] fillMethodArguments = new java.lang.Object[0];
        try {
            fillMethod.invoke(zipArchiveInputStream, fillMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for fill
    
    public void testFill_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.read
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (closed): False}
 * @utbot.executesCondition {@code (current == null): True}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testRead_CurrentEqualsNull() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        int actual = zipArchiveInputStream.read(null, -255, -255);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (closed): True}
 * @utbot.throwsException {@link java.io.IOException} when: closed
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "closed", true);
        
        zipArchiveInputStream.read(null, -255, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (offset > buffer.length): False}
 * @utbot.executesCondition {@code (length < 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: offset > buffer.length || length < 0 || offset < 0 || buffer.length - offset < length
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        byte[] byteArray = {};
        
        zipArchiveInputStream.read(byteArray, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (offset > buffer.length): False}
 * @utbot.executesCondition {@code (length < 0): False}
 * @utbot.executesCondition {@code (offset < 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: offset > buffer.length || length < 0 || offset < 0 || buffer.length - offset < length
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        byte[] byteArray = {};
        
        zipArchiveInputStream.read(byteArray, -1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (offset > buffer.length): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: offset > buffer.length || length < 0 || offset < 0 || buffer.length - offset < length
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        byte[] byteArray = {};
        
        zipArchiveInputStream.read(byteArray, 1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (offset > buffer.length): False}
 * @utbot.executesCondition {@code (length < 0): False}
 * @utbot.executesCondition {@code (offset < 0): False}
 * @utbot.executesCondition {@code (buffer.length - offset < length): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: offset > buffer.length || length < 0 || offset < 0 || buffer.length - offset < length
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        zipArchiveInputStream.read(byteArray, 0, 3);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (closed): False}
 * @utbot.executesCondition {@code (current == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: offset > buffer.length || length < 0 || offset < 0 || buffer.length - offset < length
 *  */
    @Test
    public void testRead_ThrowNullPointerException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.read] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.read(ZipArchiveInputStream.java:404) */
        zipArchiveInputStream.read(null, -255, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#close()}
 * @utbot.executesCondition {@code (!closed): False}
 *  */
    @Test
    public void testClose_Closed() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "closed", true);
        
        zipArchiveInputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: inf.end();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        ZipInputStream in = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.close] produces [java.lang.NullPointerException] */
        zipArchiveInputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: inf.end();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        ZipInputStream in = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.close] produces [java.lang.NullPointerException] */
        zipArchiveInputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: inf.end();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_3() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.close] produces [java.lang.NullPointerException] */
        zipArchiveInputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#close()}
 * @utbot.invokes {@link java.io.InputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: inf.end();
 *  */
    @Test
    public void testClose_ThrowNullPointerException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.close(ZipArchiveInputStream.java:526) */
        zipArchiveInputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: inf.end();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_4() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        ZipInputStream in = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in1, "java.util.zip.ZipInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.close] produces [java.lang.NullPointerException] */
        zipArchiveInputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: inf.end();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_5() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        ZipInputStream in = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.close] produces [java.lang.NullPointerException] */
        zipArchiveInputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: inf.end();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_6() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        CleanerImpl.PhantomCleanableRef cleanable = ((CleanerImpl.PhantomCleanableRef) createInstance("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        setField(zsRef, "java.util.zip.Inflater$InflaterZStreamRef", "cleanable", cleanable);
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(in, "java.util.zip.InflaterInputStream", "inf", inf);
        setField(in, "java.util.zip.InflaterInputStream", "usesDefaultInflater", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.close] produces [java.lang.NullPointerException] */
        zipArchiveInputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#close()}
 * @utbot.invokes {@link java.io.InputStream#close()}
 * @utbot.invokes {@link java.util.zip.Inflater#end()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: inf.end();
 *  */
    @Test(expected = NullPointerException.class)
    public void testClose_ThrowNullPointerException_7() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        CleanerImpl.PhantomCleanableRef cleanable = ((CleanerImpl.PhantomCleanableRef) createInstance("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        setField(zsRef, "java.util.zip.Inflater$InflaterZStreamRef", "cleanable", cleanable);
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        
        zipArchiveInputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#close()}
 * @utbot.invokes {@link java.io.InputStream#close()}
 * @utbot.invokes {@link java.util.zip.Inflater#end()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: inf.end();
 *  */
    @Test(expected = NullPointerException.class)
    public void testClose_ThrowNullPointerException_8() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        CleanerImpl.PhantomCleanableRef cleanable = ((CleanerImpl.PhantomCleanableRef) createInstance("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        setField(zsRef, "java.util.zip.Inflater$InflaterZStreamRef", "cleanable", cleanable);
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        
        zipArchiveInputStream.close();
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skip
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method skip(long)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
 *  */
    @Test
    public void testSkip_SkippedGreaterOrEqualValue() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        long actual = zipArchiveInputStream.skip(0L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
 * @utbot.iterates iterate the loop {@code while(skipped < value)} once
 *  */
    @Test
    public void testSkip_SKIP_BUFLengthGreaterThanRem() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        byte[] skipBuf = {(byte) -127, (byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "SKIP_BUF", skipBuf);
        
        long actual = zipArchiveInputStream.skip(1L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
 * @utbot.iterates iterate the loop {@code while(skipped < value)} once
 *  */
    @Test
    public void testSkip_SKIP_BUFLengthLessOrEqualRem() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        byte[] skipBuf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "SKIP_BUF", skipBuf);
        
        long actual = zipArchiveInputStream.skip(1L);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method skip(long)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
 * @utbot.executesCondition {@code (value >= 0): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSkip_ThrowIllegalArgumentException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        zipArchiveInputStream.skip(-256L);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method skip(long)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
 * @utbot.executesCondition {@code (value >= 0): True}
 * @utbot.iterates iterate the loop {@code while(skipped < value)} once
 * @utbot.throwsException {@link java.io.IOException} in: final int x = read(SKIP_BUF, 0, (int) (SKIP_BUF.length > rem ? rem : SKIP_BUF.length));
 *  */
    @Test(expected = IOException.class)
    public void testSkip_ThrowIOException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "closed", true);
        byte[] skipBuf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "SKIP_BUF", skipBuf);
        
        zipArchiveInputStream.skip(1L);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method skip(long)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
 * @utbot.executesCondition {@code (value >= 0): True}
 * @utbot.iterates iterate the loop {@code while(skipped < value)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SKIP_BUF.length > rem
 *  */
    @Test
    public void testSkip_ThrowNullPointerException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skip] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skip(ZipArchiveInputStream.java:552) */
        zipArchiveInputStream.skip(1L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFully
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readFully([B)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFully(byte[])}
 * @utbot.executesCondition {@code (count < b.length): False}
 * @utbot.invokes {@link org.apache.commons.compress.utils.IOUtils#readFully(java.io.InputStream,byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#count(int)}
 *  */
    @Test
    public void testReadFully_CountGreaterOrEqualBLength() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        byte[] byteArray = {};
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Method readFullyMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readFully", byteArrayType);
        readFullyMethod.setAccessible(true);
        java.lang.Object[] readFullyMethodArguments = new java.lang.Object[1];
        readFullyMethodArguments[0] = ((Object) byteArray);
        readFullyMethod.invoke(zipArchiveInputStream, readFullyMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readFully([B)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFully(byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: final int count = IOUtils.readFully(in, b);
 *  */
    @Test(expected = IOException.class)
    public void testReadFully_ThrowIOException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] byteArray = {(byte) -127};
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Method readFullyMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readFully", byteArrayType);
        readFullyMethod.setAccessible(true);
        java.lang.Object[] readFullyMethodArguments = new java.lang.Object[1];
        readFullyMethodArguments[0] = ((Object) byteArray);
        try {
            readFullyMethod.invoke(zipArchiveInputStream, readFullyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFully(byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: final int count = IOUtils.readFully(in, b);
 *  */
    @Test(expected = IOException.class)
    public void testReadFully_ThrowIOException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] byteArray = {(byte) -127};
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Method readFullyMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readFully", byteArrayType);
        readFullyMethod.setAccessible(true);
        java.lang.Object[] readFullyMethodArguments = new java.lang.Object[1];
        readFullyMethodArguments[0] = ((Object) byteArray);
        try {
            readFullyMethod.invoke(zipArchiveInputStream, readFullyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFully(byte[])}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadFully_ThrowIOException_2() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 2L);
        Object in1 = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Method readFullyMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readFully", byteArrayType);
        readFullyMethod.setAccessible(true);
        java.lang.Object[] readFullyMethodArguments = new java.lang.Object[1];
        readFullyMethodArguments[0] = ((Object) byteArray);
        try {
            readFullyMethod.invoke(zipArchiveInputStream, readFullyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFully(byte[])}
 * @utbot.executesCondition {@code (count < b.length): True}
 * @utbot.throwsException {@link java.io.EOFException} when: count < b.length
 *  */
    @Test(expected = EOFException.class)
    public void testReadFully_ThrowEOFException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
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
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        byte[] byteArray = {(byte) -127};
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Method readFullyMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readFully", byteArrayType);
        readFullyMethod.setAccessible(true);
        java.lang.Object[] readFullyMethodArguments = new java.lang.Object[1];
        readFullyMethodArguments[0] = ((Object) byteArray);
        try {
            readFullyMethod.invoke(zipArchiveInputStream, readFullyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFully(byte[])}
 * @utbot.executesCondition {@code (count < b.length): True}
 * @utbot.throwsException {@link java.io.EOFException} when: count < b.length
 *  */
    @Test(expected = EOFException.class)
    public void testReadFully_ThrowEOFException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 0L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        byte[] byteArray = {(byte) -127};
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Method readFullyMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readFully", byteArrayType);
        readFullyMethod.setAccessible(true);
        java.lang.Object[] readFullyMethodArguments = new java.lang.Object[1];
        readFullyMethodArguments[0] = ((Object) byteArray);
        try {
            readFullyMethod.invoke(zipArchiveInputStream, readFullyMethodArguments);
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
        
        // 3 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNextZipEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.executesCondition {@code (closed || hitCentralDirectory): False}
 *  */
    @Test
    public void testGetNextZipEntry_ClosedOrHitCentralDirectory() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "closed", true);
        
        ZipArchiveEntry actual = zipArchiveInputStream.getNextZipEntry();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.executesCondition {@code (closed || hitCentralDirectory): True}
 *  */
    @Test
    public void testGetNextZipEntry_ClosedOrHitCentralDirectory_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "hitCentralDirectory", true);
        
        ZipArchiveEntry actual = zipArchiveInputStream.getNextZipEntry();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.executesCondition {@code (closed || hitCentralDirectory): True}
 * @utbot.executesCondition {@code (current != null): False}
 * @utbot.executesCondition {@code (firstEntry): True}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFirstLocalFileHeader(byte[])
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFirstLocalFileHeader(byte[])
 * @utbot.caughtException {@code final EOFException e}
 *  */
    @Test
    public void testGetNextZipEntry_CatchEOFException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] lfhBuf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "LFH_BUF", lfhBuf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        ZipArchiveEntry actual = zipArchiveInputStream.getNextZipEntry();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNextZipEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.executesCondition {@code (current != null): False}
 * @utbot.executesCondition {@code (firstEntry): True}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFirstLocalFileHeader(byte[])
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetNextZipEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        byte[] lfhBuf = {};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "LFH_BUF", lfhBuf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 0]
            org.apache.commons.compress.archivers.zip.ZipLong.getValue(ZipLong.java:168)
            org.apache.commons.compress.archivers.zip.ZipLong.<init>(ZipLong.java:111)
            org.apache.commons.compress.archivers.zip.ZipLong.<init>(ZipLong.java:102)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFirstLocalFileHeader(ZipArchiveInputStream.java:333)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry(ZipArchiveInputStream.java:235) */
        zipArchiveInputStream.getNextZipEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.executesCondition {@code (current != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: closeEntry();
 *  */
    @Test
    public void testGetNextZipEntry_ThrowNullPointerException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", -255L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.currentEntryHasOutstandingBytes(ZipArchiveInputStream.java:661)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.closeEntry(ZipArchiveInputStream.java:619)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry(ZipArchiveInputStream.java:225) */
        zipArchiveInputStream.getNextZipEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.executesCondition {@code (current != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: closeEntry();
 *  */
    @Test
    public void testGetNextZipEntry_ThrowNullPointerException_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        setField(entry, "java.util.zip.ZipEntry", "csize", -22L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", -22L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        ByteArrayInputStream lastStoredEntry = ((ByteArrayInputStream) createInstance("java.io.ByteArrayInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lastStoredEntry", lastStoredEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry] produces [java.lang.NullPointerException] */
        zipArchiveInputStream.getNextZipEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.executesCondition {@code (current != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: closeEntry();
 *  */
    @Test
    public void testGetNextZipEntry_ThrowNullPointerException_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        setField(entry, "java.util.zip.ZipEntry", "csize", 129L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", 126L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry] produces [java.lang.NullPointerException] */
        zipArchiveInputStream.getNextZipEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method getNextZipEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testGetNextZipEntry_ThrowIOException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] lfhBuf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "LFH_BUF", lfhBuf);
        
        zipArchiveInputStream.getNextZipEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testGetNextZipEntry_ThrowIOException_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] lfhBuf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "LFH_BUF", lfhBuf);
        
        zipArchiveInputStream.getNextZipEntry();
    }
    ///endregion
    
    ///region Errors report for getNextZipEntry
    
    public void testGetNextZipEntry_errors()
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.closeEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method closeEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#closeEntry()}
 * @utbot.executesCondition {@code (closed): False}
 * @utbot.executesCondition {@code (current == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testCloseEntry_CurrentEqualsNull() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method closeEntryMethod = zipArchiveInputStreamClazz.getDeclaredMethod("closeEntry");
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[0];
        closeEntryMethod.invoke(zipArchiveInputStream, closeEntryMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method closeEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#closeEntry()}
 * @utbot.executesCondition {@code (closed): True}
 * @utbot.throwsException {@link java.io.IOException} when: closed
 *  */
    @Test(expected = IOException.class)
    public void testCloseEntry_ThrowIOException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "closed", true);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method closeEntryMethod = zipArchiveInputStreamClazz.getDeclaredMethod("closeEntry");
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[0];
        try {
            closeEntryMethod.invoke(zipArchiveInputStream, closeEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#closeEntry()}
 * @utbot.executesCondition {@code (closed): False}
 * @utbot.executesCondition {@code (current == null): False}
 * @utbot.throwsException {@link java.io.EOFException} in: drainCurrentEntryData();
 *  */
    @Test(expected = EOFException.class)
    public void testCloseEntry_ThrowEOFException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(buf, "java.nio.Buffer", "capacity", -65664);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(entry, "java.util.zip.ZipEntry", "csize", 4611686018427453677L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", 2147615216L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method closeEntryMethod = zipArchiveInputStreamClazz.getDeclaredMethod("closeEntry");
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[0];
        try {
            closeEntryMethod.invoke(zipArchiveInputStream, closeEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#closeEntry()}
 * @utbot.executesCondition {@code (closed): False}
 * @utbot.executesCondition {@code (current == null): False}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: drainCurrentEntryData();
 *  */
    @Test(expected = ZipException.class)
    public void testCloseEntry_ThrowZipException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setMethod(1);
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = new byte[12];
        hb[0] = (byte) -127;
        hb[1] = (byte) -127;
        hb[2] = (byte) -127;
        hb[3] = (byte) -127;
        hb[4] = (byte) -127;
        hb[5] = (byte) -127;
        hb[6] = (byte) -127;
        hb[7] = (byte) -127;
        hb[8] = (byte) -127;
        hb[9] = (byte) -127;
        hb[10] = (byte) -127;
        hb[11] = (byte) -127;
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(buf, "java.nio.Buffer", "capacity", 4);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        ZipArchiveEntry entry1 = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(entry1, "java.util.zip.ZipEntry", "csize", 576460752303423237L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry1);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", -252L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method closeEntryMethod = zipArchiveInputStreamClazz.getDeclaredMethod("closeEntry");
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[0];
        try {
            closeEntryMethod.invoke(zipArchiveInputStream, closeEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#closeEntry()}
 * @utbot.executesCondition {@code (closed): False}
 * @utbot.executesCondition {@code (current == null): False}
 * @utbot.throwsException {@link java.io.EOFException} in: drainCurrentEntryData();
 *  */
    @Test(expected = EOFException.class)
    public void testCloseEntry_ThrowEOFException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = new byte[36];
        hb[0] = (byte) -127;
        hb[1] = (byte) -127;
        hb[2] = (byte) -127;
        hb[3] = (byte) -127;
        hb[4] = (byte) -127;
        hb[5] = (byte) -127;
        hb[6] = (byte) -127;
        hb[7] = (byte) -127;
        hb[8] = (byte) -127;
        hb[9] = (byte) -127;
        hb[10] = (byte) -127;
        hb[11] = (byte) -127;
        hb[12] = (byte) -127;
        hb[13] = (byte) -127;
        hb[14] = (byte) -127;
        hb[15] = (byte) -127;
        hb[16] = (byte) -127;
        hb[17] = (byte) -127;
        hb[18] = (byte) -127;
        hb[19] = (byte) -127;
        hb[20] = (byte) -127;
        hb[21] = (byte) -127;
        hb[22] = (byte) -127;
        hb[23] = (byte) -127;
        hb[24] = (byte) -127;
        hb[25] = (byte) -127;
        hb[26] = (byte) -127;
        hb[27] = (byte) -127;
        hb[28] = (byte) -127;
        hb[29] = (byte) -127;
        hb[30] = (byte) -127;
        hb[31] = (byte) -127;
        hb[32] = (byte) -127;
        hb[33] = (byte) -127;
        hb[34] = (byte) -127;
        hb[35] = (byte) -127;
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(buf, "java.nio.Buffer", "capacity", 32);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(entry, "java.util.zip.ZipEntry", "csize", 18014398442373121L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", 256L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method closeEntryMethod = zipArchiveInputStreamClazz.getDeclaredMethod("closeEntry");
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[0];
        try {
            closeEntryMethod.invoke(zipArchiveInputStream, closeEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method closeEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#closeEntry()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: drainCurrentEntryData();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testCloseEntry_ThrowIndexOutOfBoundsException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(buf, "java.nio.Buffer", "capacity", -1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(entry, "java.util.zip.ZipEntry", "csize", 4611686018427387936L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", 237L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method closeEntryMethod = zipArchiveInputStreamClazz.getDeclaredMethod("closeEntry");
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[0];
        try {
            closeEntryMethod.invoke(zipArchiveInputStream, closeEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#closeEntry()}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: drainCurrentEntryData();
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testCloseEntry_ThrowReadOnlyBufferException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(buf, "java.nio.ByteBuffer", "isReadOnly", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        setField(entry, "java.util.zip.ZipEntry", "csize", 7566132036646209849L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", 6934109658960887611L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method closeEntryMethod = zipArchiveInputStreamClazz.getDeclaredMethod("closeEntry");
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[0];
        try {
            closeEntryMethod.invoke(zipArchiveInputStream, closeEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method closeEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#closeEntry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: currentEntryHasOutstandingBytes()
 *  */
    @Test
    public void testCloseEntry_ThrowNullPointerException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", -255L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.closeEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.currentEntryHasOutstandingBytes(ZipArchiveInputStream.java:661)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.closeEntry(ZipArchiveInputStream.java:619) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method closeEntryMethod = zipArchiveInputStreamClazz.getDeclaredMethod("closeEntry");
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[0];
        try {
            closeEntryMethod.invoke(zipArchiveInputStream, closeEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#closeEntry()}
 * @utbot.executesCondition {@code (lastStoredEntry == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: inf.reset();
 *  */
    @Test
    public void testCloseEntry_ThrowNullPointerException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(entry, "java.util.zip.ZipEntry", "csize", 0L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", 0L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        ByteArrayInputStream lastStoredEntry = ((ByteArrayInputStream) createInstance("java.io.ByteArrayInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lastStoredEntry", lastStoredEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.closeEntry] produces [java.lang.NullPointerException] */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method closeEntryMethod = zipArchiveInputStreamClazz.getDeclaredMethod("closeEntry");
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[0];
        try {
            closeEntryMethod.invoke(zipArchiveInputStream, closeEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#closeEntry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: drainCurrentEntryData();
 *  */
    @Test
    public void testCloseEntry_ThrowNullPointerException_2() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(entry, "java.util.zip.ZipEntry", "csize", 4611686018427388012L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", 72057594037928046L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.closeEntry] produces [java.lang.NullPointerException] */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method closeEntryMethod = zipArchiveInputStreamClazz.getDeclaredMethod("closeEntry");
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[0];
        try {
            closeEntryMethod.invoke(zipArchiveInputStream, closeEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#closeEntry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: drainCurrentEntryData();
 *  */
    @Test
    public void testCloseEntry_ThrowNullPointerException_3() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(buf, "java.nio.Buffer", "capacity", -2080375008);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(entry, "java.util.zip.ZipEntry", "csize", 2147483861L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", 478L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.closeEntry] produces [java.lang.NullPointerException] */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method closeEntryMethod = zipArchiveInputStreamClazz.getDeclaredMethod("closeEntry");
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[0];
        try {
            closeEntryMethod.invoke(zipArchiveInputStream, closeEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#closeEntry()}
 * @utbot.executesCondition {@code (lastStoredEntry == null): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: inf.reset();
 *  */
    @Test
    public void testCloseEntry_ThrowNullPointerException_4() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(entry, "java.util.zip.ZipEntry", "csize", -243L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", -243L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.closeEntry] produces [java.lang.NullPointerException] */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method closeEntryMethod = zipArchiveInputStreamClazz.getDeclaredMethod("closeEntry");
        closeEntryMethod.setAccessible(true);
        java.lang.Object[] closeEntryMethodArguments = new java.lang.Object[0];
        try {
            closeEntryMethod.invoke(zipArchiveInputStream, closeEntryMethodArguments);
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
        
        // 3 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFromInflater
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readFromInflater([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFromInflater(byte[],int,int)}
 * @utbot.executesCondition {@code (l == -1): False}
 * @utbot.returnsFrom {@code return read;}
 *  */
    @Test
    public void testReadFromInflater_LNotEqualsNegative1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object input = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {};
        setField(input, "java.nio.ByteBuffer", "hb", hb);
        Class inflaterClazz = Class.forName("java.util.zip.Inflater");
        Class inputType = Class.forName("java.nio.ByteBuffer");
        Method setInputMethod = inflaterClazz.getDeclaredMethod("setInput", inputType);
        setInputMethod.setAccessible(true);
        java.lang.Object[] setInputMethodArguments = new java.lang.Object[1];
        setInputMethodArguments[0] = input;
        setInputMethod.invoke(inf, setInputMethodArguments);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", input);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFromInflaterMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readFromInflater", byteArrayType, intType, intType);
        readFromInflaterMethod.setAccessible(true);
        java.lang.Object[] readFromInflaterMethodArguments = new java.lang.Object[3];
        readFromInflaterMethodArguments[0] = ((Object) null);
        readFromInflaterMethodArguments[1] = -255;
        readFromInflaterMethodArguments[2] = -255;
        int actual = ((Integer) readFromInflaterMethod.invoke(zipArchiveInputStream, readFromInflaterMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFromInflater(byte[],int,int)}
 * @utbot.executesCondition {@code (l == -1): True}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testReadFromInflater_LEqualsNegative1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object input = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) 0};
        setField(input, "java.nio.ByteBuffer", "hb", hb);
        Class inflaterClazz = Class.forName("java.util.zip.Inflater");
        Class inputType = Class.forName("java.nio.ByteBuffer");
        Method setInputMethod = inflaterClazz.getDeclaredMethod("setInput", inputType);
        setInputMethod.setAccessible(true);
        java.lang.Object[] setInputMethodArguments = new java.lang.Object[1];
        setInputMethodArguments[0] = input;
        setInputMethod.invoke(inf, setInputMethodArguments);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", input);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFromInflaterMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readFromInflater", byteArrayType, intType, intType);
        readFromInflaterMethod.setAccessible(true);
        java.lang.Object[] readFromInflaterMethodArguments = new java.lang.Object[3];
        readFromInflaterMethodArguments[0] = ((Object) null);
        readFromInflaterMethodArguments[1] = -255;
        readFromInflaterMethodArguments[2] = -255;
        int actual = ((Integer) readFromInflaterMethod.invoke(zipArchiveInputStream, readFromInflaterMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFromInflater(byte[],int,int)}
 * @utbot.executesCondition {@code (l == -1): False}
 * @utbot.returnsFrom {@code return read;}
 *  */
    @Test
    public void testReadFromInflater_LNotEqualsNegative1_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object input = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {};
        setField(input, "java.nio.ByteBuffer", "hb", hb);
        Class inflaterClazz = Class.forName("java.util.zip.Inflater");
        Class inputType = Class.forName("java.nio.ByteBuffer");
        Method setInputMethod = inflaterClazz.getDeclaredMethod("setInput", inputType);
        setInputMethod.setAccessible(true);
        java.lang.Object[] setInputMethodArguments = new java.lang.Object[1];
        setInputMethodArguments[0] = input;
        setInputMethod.invoke(inf, setInputMethodArguments);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", input);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFromInflaterMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readFromInflater", byteArrayType, intType, intType);
        readFromInflaterMethod.setAccessible(true);
        java.lang.Object[] readFromInflaterMethodArguments = new java.lang.Object[3];
        readFromInflaterMethodArguments[0] = ((Object) null);
        readFromInflaterMethodArguments[1] = -255;
        readFromInflaterMethodArguments[2] = -255;
        int actual = ((Integer) readFromInflaterMethod.invoke(zipArchiveInputStream, readFromInflaterMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFromInflater(byte[],int,int)}
 * @utbot.executesCondition {@code (l == -1): False}
 * @utbot.returnsFrom {@code return read;}
 *  */
    @Test
    public void testReadFromInflater_LNotEqualsNegative1_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object input = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {};
        setField(input, "java.nio.ByteBuffer", "hb", hb);
        Class inflaterClazz = Class.forName("java.util.zip.Inflater");
        Class inputType = Class.forName("java.nio.ByteBuffer");
        Method setInputMethod = inflaterClazz.getDeclaredMethod("setInput", inputType);
        setInputMethod.setAccessible(true);
        java.lang.Object[] setInputMethodArguments = new java.lang.Object[1];
        setInputMethodArguments[0] = input;
        setInputMethod.invoke(inf, setInputMethodArguments);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", input);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFromInflaterMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readFromInflater", byteArrayType, intType, intType);
        readFromInflaterMethod.setAccessible(true);
        java.lang.Object[] readFromInflaterMethodArguments = new java.lang.Object[3];
        readFromInflaterMethodArguments[0] = ((Object) null);
        readFromInflaterMethodArguments[1] = -255;
        readFromInflaterMethodArguments[2] = -255;
        int actual = ((Integer) readFromInflaterMethod.invoke(zipArchiveInputStream, readFromInflaterMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFromInflater(byte[],int,int)}
 * @utbot.executesCondition {@code (l == -1): True}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testReadFromInflater_LEqualsNegative1_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object input = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) 0};
        setField(input, "java.nio.ByteBuffer", "hb", hb);
        Class inflaterClazz = Class.forName("java.util.zip.Inflater");
        Class inputType = Class.forName("java.nio.ByteBuffer");
        Method setInputMethod = inflaterClazz.getDeclaredMethod("setInput", inputType);
        setInputMethod.setAccessible(true);
        java.lang.Object[] setInputMethodArguments = new java.lang.Object[1];
        setInputMethodArguments[0] = input;
        setInputMethod.invoke(inf, setInputMethodArguments);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", input);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFromInflaterMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readFromInflater", byteArrayType, intType, intType);
        readFromInflaterMethod.setAccessible(true);
        java.lang.Object[] readFromInflaterMethodArguments = new java.lang.Object[3];
        readFromInflaterMethodArguments[0] = ((Object) null);
        readFromInflaterMethodArguments[1] = -255;
        readFromInflaterMethodArguments[2] = -255;
        int actual = ((Integer) readFromInflaterMethod.invoke(zipArchiveInputStream, readFromInflaterMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readFromInflater([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFromInflater(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: inf.needsInput()
 *  */
    @Test
    public void testReadFromInflater_ThrowNullPointerException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFromInflater] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFromInflater(ZipArchiveInputStream.java:500) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFromInflaterMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readFromInflater", byteArrayType, intType, intType);
        readFromInflaterMethod.setAccessible(true);
        java.lang.Object[] readFromInflaterMethodArguments = new java.lang.Object[3];
        readFromInflaterMethodArguments[0] = ((Object) null);
        readFromInflaterMethodArguments[1] = -255;
        readFromInflaterMethodArguments[2] = -255;
        try {
            readFromInflaterMethod.invoke(zipArchiveInputStream, readFromInflaterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFromInflater(byte[],int,int)}
 * @utbot.invokes {@link java.util.zip.Inflater#needsInput()}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#fill()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int l = fill();
 *  */
    @Test
    public void testReadFromInflater_ThrowNullPointerException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        Object input = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) 0};
        setField(input, "java.nio.ByteBuffer", "hb", hb);
        Class inflaterClazz = Class.forName("java.util.zip.Inflater");
        Class inputType = Class.forName("java.nio.ByteBuffer");
        Method setInputMethod = inflaterClazz.getDeclaredMethod("setInput", inputType);
        setInputMethod.setAccessible(true);
        java.lang.Object[] setInputMethodArguments = new java.lang.Object[1];
        setInputMethodArguments[0] = input;
        setInputMethod.invoke(inf, setInputMethodArguments);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", input);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFromInflater] produces [java.lang.NullPointerException] */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFromInflaterMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readFromInflater", byteArrayType, intType, intType);
        readFromInflaterMethod.setAccessible(true);
        java.lang.Object[] readFromInflaterMethodArguments = new java.lang.Object[3];
        readFromInflaterMethodArguments[0] = ((Object) null);
        readFromInflaterMethodArguments[1] = -255;
        readFromInflaterMethodArguments[2] = -255;
        try {
            readFromInflaterMethod.invoke(zipArchiveInputStream, readFromInflaterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readFromInflater([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFromInflater(byte[],int,int)}
 * @utbot.invokes {@link java.util.zip.Inflater#inflate(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: read = inf.inflate(buffer, offset, length);
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testReadFromInflater_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "inputPos", -255);
        setField(inf, "java.util.zip.Inflater", "inputLim", -2);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFromInflaterMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readFromInflater", byteArrayType, intType, intType);
        readFromInflaterMethod.setAccessible(true);
        java.lang.Object[] readFromInflaterMethodArguments = new java.lang.Object[3];
        readFromInflaterMethodArguments[0] = ((Object) null);
        readFromInflaterMethodArguments[1] = 0;
        readFromInflaterMethodArguments[2] = -1;
        try {
            readFromInflaterMethod.invoke(zipArchiveInputStream, readFromInflaterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFromInflater(byte[],int,int)}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#fill()
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: final int l = fill();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testReadFromInflater_ThrowUnsupportedOperationException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "inputPos", -255);
        setField(inf, "java.util.zip.Inflater", "inputLim", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        Object buf = createInstance("java.nio.HeapByteBuffer");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFromInflaterMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readFromInflater", byteArrayType, intType, intType);
        readFromInflaterMethod.setAccessible(true);
        java.lang.Object[] readFromInflaterMethodArguments = new java.lang.Object[3];
        readFromInflaterMethodArguments[0] = ((Object) null);
        readFromInflaterMethodArguments[1] = -255;
        readFromInflaterMethodArguments[2] = -255;
        try {
            readFromInflaterMethod.invoke(zipArchiveInputStream, readFromInflaterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readFromInflater([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFromInflater(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: final int l = fill();
 *  */
    @Test(expected = IOException.class)
    public void testReadFromInflater_ThrowIOException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "inputPos", -255);
        setField(inf, "java.util.zip.Inflater", "inputLim", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "closed", true);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFromInflaterMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readFromInflater", byteArrayType, intType, intType);
        readFromInflaterMethod.setAccessible(true);
        java.lang.Object[] readFromInflaterMethodArguments = new java.lang.Object[3];
        readFromInflaterMethodArguments[0] = ((Object) null);
        readFromInflaterMethodArguments[1] = -255;
        readFromInflaterMethodArguments[2] = -255;
        try {
            readFromInflaterMethod.invoke(zipArchiveInputStream, readFromInflaterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFromInflater(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadFromInflater_ThrowIOException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "inputPos", -255);
        setField(inf, "java.util.zip.Inflater", "inputLim", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        Object buf = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFromInflaterMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readFromInflater", byteArrayType, intType, intType);
        readFromInflaterMethod.setAccessible(true);
        java.lang.Object[] readFromInflaterMethodArguments = new java.lang.Object[3];
        readFromInflaterMethodArguments[0] = ((Object) null);
        readFromInflaterMethodArguments[1] = -255;
        readFromInflaterMethodArguments[2] = -255;
        try {
            readFromInflaterMethod.invoke(zipArchiveInputStream, readFromInflaterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFromInflater(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadFromInflater_ThrowIOException_2() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object input = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) 0};
        setField(input, "java.nio.ByteBuffer", "hb", hb);
        setField(input, "java.nio.Buffer", "position", 2);
        setField(input, "java.nio.Buffer", "limit", 2);
        Class inflaterClazz = Class.forName("java.util.zip.Inflater");
        Class inputType = Class.forName("java.nio.ByteBuffer");
        Method setInputMethod = inflaterClazz.getDeclaredMethod("setInput", inputType);
        setInputMethod.setAccessible(true);
        java.lang.Object[] setInputMethodArguments = new java.lang.Object[1];
        setInputMethodArguments[0] = input;
        setInputMethod.invoke(inf, setInputMethodArguments);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", input);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readFromInflaterMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readFromInflater", byteArrayType, intType, intType);
        readFromInflaterMethod.setAccessible(true);
        java.lang.Object[] readFromInflaterMethodArguments = new java.lang.Object[3];
        readFromInflaterMethodArguments[0] = ((Object) null);
        readFromInflaterMethodArguments[1] = -255;
        readFromInflaterMethodArguments[2] = -255;
        try {
            readFromInflaterMethod.invoke(zipArchiveInputStream, readFromInflaterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readFromInflater
    
    public void testReadFromInflater_errors()
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.processZip64Extra
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method processZip64Extra(org.apache.commons.compress.archivers.zip.ZipLong, org.apache.commons.compress.archivers.zip.ZipLong)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#processZip64Extra(org.apache.commons.compress.archivers.zip.ZipLong,org.apache.commons.compress.archivers.zip.ZipLong)}
 * @utbot.executesCondition {@code (current.usesZip64 = z64 != null;): False}
 * @utbot.executesCondition {@code (z64 != null): False}
 *  */
    @Test
    public void testProcessZip64Extra_Z64EqualsNull() throws Exception  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
            ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            entry.setSize(-255L);
            setField(entry, "java.util.zip.ZipEntry", "csize", 0L);
            setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
            ZipLong zipLong = new ZipLong(0L);
            ZipLong zipLong1 = new ZipLong(-255L);
            
            Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
            Class zipLongType = Class.forName("org.apache.commons.compress.archivers.zip.ZipLong");
            Method processZip64ExtraMethod = zipArchiveInputStreamClazz.getDeclaredMethod("processZip64Extra", zipLongType, zipLongType);
            processZip64ExtraMethod.setAccessible(true);
            java.lang.Object[] processZip64ExtraMethodArguments = new java.lang.Object[2];
            processZip64ExtraMethodArguments[0] = zipLong;
            processZip64ExtraMethodArguments[1] = zipLong1;
            processZip64ExtraMethod.invoke(zipArchiveInputStream, processZip64ExtraMethodArguments);
            
            Object zipArchiveInputStreamCurrent = getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current");
            ZipArchiveEntry zipArchiveInputStreamCurrentCurrentEntry = ((ZipArchiveEntry) getFieldValue(zipArchiveInputStreamCurrent, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry"));
            long finalZipArchiveInputStreamCurrentEntrySize = ((Long) getFieldValue(zipArchiveInputStreamCurrentCurrentEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "size"));
            Object zipArchiveInputStreamCurrent1 = getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current");
            ZipArchiveEntry zipArchiveInputStreamCurrent1CurrentEntry = ((ZipArchiveEntry) getFieldValue(zipArchiveInputStreamCurrent1, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry"));
            long finalZipArchiveInputStreamCurrentEntryCsize = ((Long) getFieldValue(zipArchiveInputStreamCurrent1CurrentEntry, "java.util.zip.ZipEntry", "csize"));
            Object zipArchiveInputStreamCurrent2 = getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current");
            ZipArchiveEntry zipArchiveInputStreamCurrent2CurrentEntry = ((ZipArchiveEntry) getFieldValue(zipArchiveInputStreamCurrent2, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry"));
            boolean finalZipArchiveInputStreamCurrentEntryCsizeSet = ((Boolean) getFieldValue(zipArchiveInputStreamCurrent2CurrentEntry, "java.util.zip.ZipEntry", "csizeSet"));
            
            assertEquals(0L, finalZipArchiveInputStreamCurrentEntrySize);
            
            assertEquals(-255L, finalZipArchiveInputStreamCurrentEntryCsize);
            
            assertTrue(finalZipArchiveInputStreamCurrentEntryCsizeSet);
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#processZip64Extra(org.apache.commons.compress.archivers.zip.ZipLong,org.apache.commons.compress.archivers.zip.ZipLong)}
 * @utbot.executesCondition {@code (current.usesZip64 = z64 != null;): True}
 * @utbot.executesCondition {@code (z64 != null): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#equals(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#equals(java.lang.Object)}
 *  */
    @Test
    public void testProcessZip64Extra_Z64NotEqualsNull() throws Exception  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        ZipLong prevZIP64_MAGIC = ZipLong.ZIP64_MAGIC;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipLong zip64Magic = new ZipLong(4294967295L);
            Class zipLongClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipLong");
            setStaticField(zipLongClazz, "ZIP64_MAGIC", zip64Magic);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
            ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            entry.setSize(0L);
            org.apache.commons.compress.archivers.zip.ZipExtraField[] extraFields = new org.apache.commons.compress.archivers.zip.ZipExtraField[1];
            Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
            extraFields[0] = ((ZipExtraField) zip64ExtendedInformationExtraField);
            entry.setExtraFields(extraFields);
            setField(entry, "java.util.zip.ZipEntry", "csize", 0L);
            setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
            ZipLong zipLong = new ZipLong(0L);
            ZipLong zipLong1 = new ZipLong(8589934592L);
            
            Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
            Method processZip64ExtraMethod = zipArchiveInputStreamClazz.getDeclaredMethod("processZip64Extra", zipLongClazz, zipLongClazz);
            processZip64ExtraMethod.setAccessible(true);
            java.lang.Object[] processZip64ExtraMethodArguments = new java.lang.Object[2];
            processZip64ExtraMethodArguments[0] = zipLong;
            processZip64ExtraMethodArguments[1] = zipLong1;
            processZip64ExtraMethod.invoke(zipArchiveInputStream, processZip64ExtraMethodArguments);
            
            Object zipArchiveInputStreamCurrent = getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current");
            ZipArchiveEntry zipArchiveInputStreamCurrentCurrentEntry = ((ZipArchiveEntry) getFieldValue(zipArchiveInputStreamCurrent, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry"));
            long finalZipArchiveInputStreamCurrentEntryCsize = ((Long) getFieldValue(zipArchiveInputStreamCurrentCurrentEntry, "java.util.zip.ZipEntry", "csize"));
            Object zipArchiveInputStreamCurrent1 = getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current");
            ZipArchiveEntry zipArchiveInputStreamCurrent1CurrentEntry = ((ZipArchiveEntry) getFieldValue(zipArchiveInputStreamCurrent1, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry"));
            boolean finalZipArchiveInputStreamCurrentEntryCsizeSet = ((Boolean) getFieldValue(zipArchiveInputStreamCurrent1CurrentEntry, "java.util.zip.ZipEntry", "csizeSet"));
            Object zipArchiveInputStreamCurrent2 = getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current");
            boolean finalZipArchiveInputStreamCurrentUsesZip64 = ((Boolean) getFieldValue(zipArchiveInputStreamCurrent2, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "usesZip64"));
            
            assertEquals(8589934592L, finalZipArchiveInputStreamCurrentEntryCsize);
            
            assertTrue(finalZipArchiveInputStreamCurrentEntryCsizeSet);
            
            assertTrue(finalZipArchiveInputStreamCurrentUsesZip64);
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
            setStaticField(ZipLong.class, "ZIP64_MAGIC", prevZIP64_MAGIC);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processZip64Extra(org.apache.commons.compress.archivers.zip.ZipLong, org.apache.commons.compress.archivers.zip.ZipLong)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#processZip64Extra(org.apache.commons.compress.archivers.zip.ZipLong,org.apache.commons.compress.archivers.zip.ZipLong)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getExtraField(org.apache.commons.compress.archivers.zip.ZipShort)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: current.entry.getExtraField(Zip64ExtendedInformationExtraField.HEADER_ID)
 *  */
    @Test
    public void testProcessZip64Extra_ThrowNullPointerException() throws Throwable  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.processZip64Extra] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.processZip64Extra(ZipArchiveInputStream.java:356) */
            Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
            Class zipLongType = Class.forName("org.apache.commons.compress.archivers.zip.ZipLong");
            Method processZip64ExtraMethod = zipArchiveInputStreamClazz.getDeclaredMethod("processZip64Extra", zipLongType, zipLongType);
            processZip64ExtraMethod.setAccessible(true);
            java.lang.Object[] processZip64ExtraMethodArguments = new java.lang.Object[2];
            processZip64ExtraMethodArguments[0] = ((Object) null);
            processZip64ExtraMethodArguments[1] = ((Object) null);
            try {
                processZip64ExtraMethod.invoke(zipArchiveInputStream, processZip64ExtraMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#processZip64Extra(org.apache.commons.compress.archivers.zip.ZipLong,org.apache.commons.compress.archivers.zip.ZipLong)}
 * @utbot.executesCondition {@code (current.usesZip64 = z64 != null;): False}
 * @utbot.executesCondition {@code (z64 != null): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry#access$100(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#getValue()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setCompressedSize(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry#access$100(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: current.entry.setSize(size.getValue());
 *  */
    @Test
    public void testProcessZip64Extra_ThrowNullPointerException_1() throws Throwable  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
            ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            setField(entry, "java.util.zip.ZipEntry", "csize", 0L);
            setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
            ZipLong zipLong = new ZipLong(-255L);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.processZip64Extra] produces [java.lang.NullPointerException] */
            Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
            Class zipLongType = Class.forName("org.apache.commons.compress.archivers.zip.ZipLong");
            Method processZip64ExtraMethod = zipArchiveInputStreamClazz.getDeclaredMethod("processZip64Extra", zipLongType, zipLongType);
            processZip64ExtraMethod.setAccessible(true);
            java.lang.Object[] processZip64ExtraMethodArguments = new java.lang.Object[2];
            processZip64ExtraMethodArguments[0] = ((Object) null);
            processZip64ExtraMethodArguments[1] = zipLong;
            try {
                processZip64ExtraMethod.invoke(zipArchiveInputStream, processZip64ExtraMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#processZip64Extra(org.apache.commons.compress.archivers.zip.ZipLong,org.apache.commons.compress.archivers.zip.ZipLong)}
 * @utbot.executesCondition {@code (current.usesZip64 = z64 != null;): True}
 * @utbot.executesCondition {@code (z64 != null): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#equals(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry#access$100(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#getCompressedSize()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipEightByteInteger#getLongValue()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setCompressedSize(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry#access$100(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#getSize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: current.entry.setSize(z64.getSize().getLongValue());
 *  */
    @Test
    public void testProcessZip64Extra_ThrowNullPointerException_2() throws Throwable  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        ZipLong prevZIP64_MAGIC = ZipLong.ZIP64_MAGIC;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipLong zip64Magic = new ZipLong(4294967295L);
            Class zipLongClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipLong");
            setStaticField(zipLongClazz, "ZIP64_MAGIC", zip64Magic);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
            ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            org.apache.commons.compress.archivers.zip.ZipExtraField[] extraFields = new org.apache.commons.compress.archivers.zip.ZipExtraField[1];
            Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
            ZipEightByteInteger compressedSize = ((ZipEightByteInteger) createInstance("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
            BigInteger value = ((BigInteger) createInstance("java.math.BigInteger"));
            setField(value, "java.math.BigInteger", "signum", -1);
            int[] mag = {0};
            setField(value, "java.math.BigInteger", "mag", mag);
            setField(value, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo", 1);
            setField(compressedSize, "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "value", value);
            zip64ExtendedInformationExtraField.setCompressedSize(compressedSize);
            extraFields[0] = ((ZipExtraField) zip64ExtendedInformationExtraField);
            entry.setExtraFields(extraFields);
            setField(entry, "java.util.zip.ZipEntry", "csize", 0L);
            setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
            ZipLong zipLong = new ZipLong(4294967295L);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.processZip64Extra] produces [java.lang.NullPointerException] */
            Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
            Method processZip64ExtraMethod = zipArchiveInputStreamClazz.getDeclaredMethod("processZip64Extra", zipLongClazz, zipLongClazz);
            processZip64ExtraMethod.setAccessible(true);
            java.lang.Object[] processZip64ExtraMethodArguments = new java.lang.Object[2];
            processZip64ExtraMethodArguments[0] = ((Object) null);
            processZip64ExtraMethodArguments[1] = zipLong;
            try {
                processZip64ExtraMethod.invoke(zipArchiveInputStream, processZip64ExtraMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
            setStaticField(ZipLong.class, "ZIP64_MAGIC", prevZIP64_MAGIC);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method processZip64Extra(org.apache.commons.compress.archivers.zip.ZipLong, org.apache.commons.compress.archivers.zip.ZipLong)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#processZip64Extra(org.apache.commons.compress.archivers.zip.ZipLong,org.apache.commons.compress.archivers.zip.ZipLong)}
 * @utbot.executesCondition {@code (current.usesZip64 = z64 != null;): False}
 * @utbot.executesCondition {@code (z64 != null): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry#access$100(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getExtraField(org.apache.commons.compress.archivers.zip.ZipShort)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry#access$402(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry,boolean)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry#access$100(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#getValue()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setCompressedSize(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry#access$100(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#getValue()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setSize(long)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: current.entry.setSize(size.getValue());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProcessZip64Extra_ThrowIllegalArgumentException() throws Throwable  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
            ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            setField(entry, "java.util.zip.ZipEntry", "csize", 0L);
            setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
            ZipLong zipLong = new ZipLong(-255L);
            ZipLong zipLong1 = new ZipLong(-255L);
            
            Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
            Class zipLongType = Class.forName("org.apache.commons.compress.archivers.zip.ZipLong");
            Method processZip64ExtraMethod = zipArchiveInputStreamClazz.getDeclaredMethod("processZip64Extra", zipLongType, zipLongType);
            processZip64ExtraMethod.setAccessible(true);
            java.lang.Object[] processZip64ExtraMethodArguments = new java.lang.Object[2];
            processZip64ExtraMethodArguments[0] = zipLong;
            processZip64ExtraMethodArguments[1] = zipLong1;
            try {
                processZip64ExtraMethod.invoke(zipArchiveInputStream, processZip64ExtraMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    ///endregion
    
    ///region Errors report for processZip64Extra
    
    public void testProcessZip64Extra_errors()
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.canReadEntryData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (ae instanceof ZipArchiveEntry): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCanReadEntryData_NotAeNotInstanceOfZipArchiveEntry() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        boolean actual = zipArchiveInputStream.canReadEntryData(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDeflated
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method readDeflated([B, int, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFromInflater(byte[],int,int) twice,
    ///     {@link java.util.zip.Inflater#finished()} twice
    /// return from: {@code return -1;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readDeflated(byte[],int,int)}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testReadDeflated_ReturnNegative1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object in = createInstance("java.lang.Process$PipeInputStream");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        Object input = createInstance("java.nio.HeapByteBuffer");
        setField(input, "java.nio.Buffer", "position", -537902080);
        setField(input, "java.nio.Buffer", "limit", -537902080);
        Class inflaterClazz = Class.forName("java.util.zip.Inflater");
        Class inputType = Class.forName("java.nio.ByteBuffer");
        Method setInputMethod = inflaterClazz.getDeclaredMethod("setInput", inputType);
        setInputMethod.setAccessible(true);
        java.lang.Object[] setInputMethodArguments = new java.lang.Object[1];
        setInputMethodArguments[0] = input;
        setInputMethod.invoke(inf, setInputMethodArguments);
        setField(inf, "java.util.zip.Inflater", "finished", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        Object buf = createInstance("java.nio.HeapByteBufferR");
        byte[] hb = {(byte) 0};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readDeflatedMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readDeflated", byteArrayType, intType, intType);
        readDeflatedMethod.setAccessible(true);
        java.lang.Object[] readDeflatedMethodArguments = new java.lang.Object[3];
        readDeflatedMethodArguments[0] = ((Object) null);
        readDeflatedMethodArguments[1] = 2;
        readDeflatedMethodArguments[2] = 2;
        int actual = ((Integer) readDeflatedMethod.invoke(zipArchiveInputStream, readDeflatedMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readDeflated(byte[],int,int)}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testReadDeflated_ReturnNegative1_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object in = createInstance("java.lang.Process$PipeInputStream");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object input = createInstance("java.nio.HeapByteBuffer");
        Class inflaterClazz = Class.forName("java.util.zip.Inflater");
        Class inputType = Class.forName("java.nio.ByteBuffer");
        Method setInputMethod = inflaterClazz.getDeclaredMethod("setInput", inputType);
        setInputMethod.setAccessible(true);
        java.lang.Object[] setInputMethodArguments = new java.lang.Object[1];
        setInputMethodArguments[0] = input;
        setInputMethod.invoke(inf, setInputMethodArguments);
        setField(inf, "java.util.zip.Inflater", "finished", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        Object buf = createInstance("java.nio.HeapByteBufferR");
        byte[] hb = {(byte) 0};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readDeflatedMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readDeflated", byteArrayType, intType, intType);
        readDeflatedMethod.setAccessible(true);
        java.lang.Object[] readDeflatedMethodArguments = new java.lang.Object[3];
        readDeflatedMethodArguments[0] = ((Object) null);
        readDeflatedMethodArguments[1] = 0;
        readDeflatedMethodArguments[2] = 2;
        int actual = ((Integer) readDeflatedMethod.invoke(zipArchiveInputStream, readDeflatedMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readDeflated(byte[],int,int)}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testReadDeflated_ReturnNegative1_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "inputPos", -255);
        setField(inf, "java.util.zip.Inflater", "inputLim", -255);
        setField(inf, "java.util.zip.Inflater", "finished", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        Object buf = createInstance("java.nio.HeapByteBufferR");
        byte[] hb = {};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readDeflatedMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readDeflated", byteArrayType, intType, intType);
        readDeflatedMethod.setAccessible(true);
        java.lang.Object[] readDeflatedMethodArguments = new java.lang.Object[3];
        readDeflatedMethodArguments[0] = ((Object) null);
        readDeflatedMethodArguments[1] = -255;
        readDeflatedMethodArguments[2] = -255;
        int actual = ((Integer) readDeflatedMethod.invoke(zipArchiveInputStream, readDeflatedMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method readDeflated([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readDeflated(byte[],int,int)}
 * @utbot.executesCondition {@code (read == -1): False}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFromInflater(byte[],int,int)
 * @utbot.invokes {@link java.util.zip.Inflater#finished()}
 * @utbot.invokes {@link java.util.zip.Inflater#needsDictionary()}
 * @utbot.returnsFrom {@code return read;}
 *  */
    @Test
    public void testReadDeflated_ReadNotEqualsNegative1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "inputPos", -255);
        setField(inf, "java.util.zip.Inflater", "inputLim", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        Object buf = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readDeflatedMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readDeflated", byteArrayType, intType, intType);
        readDeflatedMethod.setAccessible(true);
        java.lang.Object[] readDeflatedMethodArguments = new java.lang.Object[3];
        readDeflatedMethodArguments[0] = ((Object) null);
        readDeflatedMethodArguments[1] = -255;
        readDeflatedMethodArguments[2] = -255;
        int actual = ((Integer) readDeflatedMethod.invoke(zipArchiveInputStream, readDeflatedMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readDeflated([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readDeflated(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int read = readFromInflater(buffer, offset, length);
 *  */
    @Test
    public void testReadDeflated_ThrowNullPointerException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDeflated] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFromInflater(ZipArchiveInputStream.java:500)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDeflated(ZipArchiveInputStream.java:478) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readDeflatedMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readDeflated", byteArrayType, intType, intType);
        readDeflatedMethod.setAccessible(true);
        java.lang.Object[] readDeflatedMethodArguments = new java.lang.Object[3];
        readDeflatedMethodArguments[0] = ((Object) null);
        readDeflatedMethodArguments[1] = -255;
        readDeflatedMethodArguments[2] = -255;
        try {
            readDeflatedMethod.invoke(zipArchiveInputStream, readDeflatedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readDeflated(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int read = readFromInflater(buffer, offset, length);
 *  */
    @Test
    public void testReadDeflated_ThrowNullPointerException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        Object input = createInstance("java.nio.DirectByteBufferR");
        Class inflaterClazz = Class.forName("java.util.zip.Inflater");
        Class inputType = Class.forName("java.nio.ByteBuffer");
        Method setInputMethod = inflaterClazz.getDeclaredMethod("setInput", inputType);
        setInputMethod.setAccessible(true);
        java.lang.Object[] setInputMethodArguments = new java.lang.Object[1];
        setInputMethodArguments[0] = input;
        setInputMethod.invoke(inf, setInputMethodArguments);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDeflated] produces [java.lang.NullPointerException] */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readDeflatedMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readDeflated", byteArrayType, intType, intType);
        readDeflatedMethod.setAccessible(true);
        java.lang.Object[] readDeflatedMethodArguments = new java.lang.Object[3];
        readDeflatedMethodArguments[0] = ((Object) null);
        readDeflatedMethodArguments[1] = -255;
        readDeflatedMethodArguments[2] = -255;
        try {
            readDeflatedMethod.invoke(zipArchiveInputStream, readDeflatedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readDeflated(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int read = readFromInflater(buffer, offset, length);
 *  */
    @Test
    public void testReadDeflated_ThrowNullPointerException_2() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        Object input = createInstance("java.nio.DirectByteBufferR");
        Class inflaterClazz = Class.forName("java.util.zip.Inflater");
        Class inputType = Class.forName("java.nio.ByteBuffer");
        Method setInputMethod = inflaterClazz.getDeclaredMethod("setInput", inputType);
        setInputMethod.setAccessible(true);
        java.lang.Object[] setInputMethodArguments = new java.lang.Object[1];
        setInputMethodArguments[0] = input;
        setInputMethod.invoke(inf, setInputMethodArguments);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        Object buf = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) 0};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDeflated] produces [java.lang.NullPointerException] */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readDeflatedMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readDeflated", byteArrayType, intType, intType);
        readDeflatedMethod.setAccessible(true);
        java.lang.Object[] readDeflatedMethodArguments = new java.lang.Object[3];
        readDeflatedMethodArguments[0] = ((Object) null);
        readDeflatedMethodArguments[1] = -255;
        readDeflatedMethodArguments[2] = -255;
        try {
            readDeflatedMethod.invoke(zipArchiveInputStream, readDeflatedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readDeflated([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readDeflated(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: final int read = readFromInflater(buffer, offset, length);
 *  */
    @Test(expected = IOException.class)
    public void testReadDeflated_ThrowIOException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "inputPos", -255);
        setField(inf, "java.util.zip.Inflater", "inputLim", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "closed", true);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readDeflatedMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readDeflated", byteArrayType, intType, intType);
        readDeflatedMethod.setAccessible(true);
        java.lang.Object[] readDeflatedMethodArguments = new java.lang.Object[3];
        readDeflatedMethodArguments[0] = ((Object) null);
        readDeflatedMethodArguments[1] = -255;
        readDeflatedMethodArguments[2] = -255;
        try {
            readDeflatedMethod.invoke(zipArchiveInputStream, readDeflatedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readDeflated(byte[],int,int)}
 * @utbot.executesCondition {@code (read == -1): True}
 * @utbot.throwsException {@link java.io.IOException} when: read == -1
 *  */
    @Test(expected = IOException.class)
    public void testReadDeflated_ThrowIOException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object in = createInstance("java.lang.Process$PipeInputStream");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object input = createInstance("java.nio.DirectByteBufferR");
        Class inflaterClazz = Class.forName("java.util.zip.Inflater");
        Class inputType = Class.forName("java.nio.ByteBuffer");
        Method setInputMethod = inflaterClazz.getDeclaredMethod("setInput", inputType);
        setInputMethod.setAccessible(true);
        java.lang.Object[] setInputMethodArguments = new java.lang.Object[1];
        setInputMethodArguments[0] = input;
        setInputMethod.invoke(inf, setInputMethodArguments);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        Object buf = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) 0};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readDeflatedMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readDeflated", byteArrayType, intType, intType);
        readDeflatedMethod.setAccessible(true);
        java.lang.Object[] readDeflatedMethodArguments = new java.lang.Object[3];
        readDeflatedMethodArguments[0] = ((Object) null);
        readDeflatedMethodArguments[1] = -255;
        readDeflatedMethodArguments[2] = -255;
        try {
            readDeflatedMethod.invoke(zipArchiveInputStream, readDeflatedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readDeflated(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadDeflated_ThrowIOException_2() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "inputPos", -255);
        setField(inf, "java.util.zip.Inflater", "inputLim", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        Object buf = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readDeflatedMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readDeflated", byteArrayType, intType, intType);
        readDeflatedMethod.setAccessible(true);
        java.lang.Object[] readDeflatedMethodArguments = new java.lang.Object[3];
        readDeflatedMethodArguments[0] = ((Object) null);
        readDeflatedMethodArguments[1] = -255;
        readDeflatedMethodArguments[2] = -255;
        try {
            readDeflatedMethod.invoke(zipArchiveInputStream, readDeflatedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readDeflated(byte[],int,int)}
 * @utbot.throwsException {@link java.util.zip.ZipException} when: inf.needsDictionary()
 *  */
    @Test(expected = ZipException.class)
    public void testReadDeflated_ThrowZipException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "inputPos", -255);
        setField(inf, "java.util.zip.Inflater", "inputLim", -255);
        setField(inf, "java.util.zip.Inflater", "needDict", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        Object buf = createInstance("java.nio.HeapByteBufferR");
        byte[] hb = {};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readDeflatedMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readDeflated", byteArrayType, intType, intType);
        readDeflatedMethod.setAccessible(true);
        java.lang.Object[] readDeflatedMethodArguments = new java.lang.Object[3];
        readDeflatedMethodArguments[0] = ((Object) null);
        readDeflatedMethodArguments[1] = -255;
        readDeflatedMethodArguments[2] = -255;
        try {
            readDeflatedMethod.invoke(zipArchiveInputStream, readDeflatedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readDeflated([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readDeflated(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int read = readFromInflater(buffer, offset, length);
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testReadDeflated_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "inputPos", -255);
        setField(inf, "java.util.zip.Inflater", "inputLim", -2);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readDeflatedMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readDeflated", byteArrayType, intType, intType);
        readDeflatedMethod.setAccessible(true);
        java.lang.Object[] readDeflatedMethodArguments = new java.lang.Object[3];
        readDeflatedMethodArguments[0] = ((Object) null);
        readDeflatedMethodArguments[1] = 0;
        readDeflatedMethodArguments[2] = -1;
        try {
            readDeflatedMethod.invoke(zipArchiveInputStream, readDeflatedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readDeflated(byte[],int,int)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: final int read = readFromInflater(buffer, offset, length);
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testReadDeflated_ThrowReadOnlyBufferException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object input = createInstance("java.nio.DirectByteBufferR");
        Class inflaterClazz = Class.forName("java.util.zip.Inflater");
        Class inputType = Class.forName("java.nio.ByteBuffer");
        Method setInputMethod = inflaterClazz.getDeclaredMethod("setInput", inputType);
        setInputMethod.setAccessible(true);
        java.lang.Object[] setInputMethodArguments = new java.lang.Object[1];
        setInputMethodArguments[0] = input;
        setInputMethod.invoke(inf, setInputMethodArguments);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        Object buf = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) 0};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(buf, "java.nio.ByteBuffer", "isReadOnly", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readDeflatedMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readDeflated", byteArrayType, intType, intType);
        readDeflatedMethod.setAccessible(true);
        java.lang.Object[] readDeflatedMethodArguments = new java.lang.Object[3];
        readDeflatedMethodArguments[0] = ((Object) null);
        readDeflatedMethodArguments[1] = -255;
        readDeflatedMethodArguments[2] = -255;
        try {
            readDeflatedMethod.invoke(zipArchiveInputStream, readDeflatedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readDeflated
    
    public void testReadDeflated_errors()
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStored
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readStored([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readStored(byte[],int,int)}
 * @utbot.executesCondition {@code (lastStoredEntry == null): False}
 * @utbot.invokes {@link java.io.ByteArrayInputStream#read(byte[],int,int)}
 * @utbot.returnsFrom {@code return lastStoredEntry.read(buffer, offset, length);}
 *  */
    @Test
    public void testReadStored_LastStoredEntryNotEqualsNull() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "hasDataDescriptor", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        ByteArrayInputStream lastStoredEntry = ((ByteArrayInputStream) createInstance("java.io.ByteArrayInputStream"));
        setField(lastStoredEntry, "java.io.ByteArrayInputStream", "pos", -254);
        setField(lastStoredEntry, "java.io.ByteArrayInputStream", "count", -254);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lastStoredEntry", lastStoredEntry);
        byte[] byteArray = {};
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readStoredMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readStored", byteArrayType, intType, intType);
        readStoredMethod.setAccessible(true);
        java.lang.Object[] readStoredMethodArguments = new java.lang.Object[3];
        readStoredMethodArguments[0] = ((Object) byteArray);
        readStoredMethodArguments[1] = 0;
        readStoredMethodArguments[2] = 0;
        int actual = ((Integer) readStoredMethod.invoke(zipArchiveInputStream, readStoredMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readStored(byte[],int,int)}
 * @utbot.executesCondition {@code (current.bytesRead >= csize): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry#access$100(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getSize()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry#access$600(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry)}
 * @utbot.invokes {@link java.nio.ByteBuffer#position()}
 * @utbot.invokes {@link java.nio.ByteBuffer#limit()}
 * @utbot.invokes {@link java.nio.ByteBuffer#position(int)}
 * @utbot.invokes {@link java.nio.ByteBuffer#array()}
 * @utbot.invokes {@link java.io.InputStream#read(byte[])}
 *  */
    @Test
    public void testReadStored_CurrentBytesReadLessThanCsize() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.HeapByteBufferR");
        byte[] hb = {(byte) 0};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(buf, "java.nio.Buffer", "mark", 1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        entry.setSize(-126L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesRead", -253L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readStoredMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readStored", byteArrayType, intType, intType);
        readStoredMethod.setAccessible(true);
        java.lang.Object[] readStoredMethodArguments = new java.lang.Object[3];
        readStoredMethodArguments[0] = ((Object) null);
        readStoredMethodArguments[1] = -255;
        readStoredMethodArguments[2] = -255;
        int actual = ((Integer) readStoredMethod.invoke(zipArchiveInputStream, readStoredMethodArguments));
        
        assertEquals(-1, actual);
        
        ByteBuffer zipArchiveInputStreamBuf = ((ByteBuffer) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf"));
        int finalZipArchiveInputStreamBufMark = ((Integer) getFieldValue(zipArchiveInputStreamBuf, "java.nio.Buffer", "mark"));
        
        assertEquals(-1, finalZipArchiveInputStreamBufMark);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readStored([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readStored(byte[],int,int)}
 * @utbot.executesCondition {@code (lastStoredEntry == null): True}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: readStoredEntry();
 *  */
    @Test
    public void testReadStored_ThrowReadOnlyBufferException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(buf, "java.nio.ByteBuffer", "isReadOnly", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "hasDataDescriptor", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStored] produces [java.nio.ReadOnlyBufferException]
            java.base/java.nio.ByteBuffer.array(ByteBuffer.java:1473)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStoredEntry(ZipArchiveInputStream.java:801)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStored(ZipArchiveInputStream.java:442) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readStoredMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readStored", byteArrayType, intType, intType);
        readStoredMethod.setAccessible(true);
        java.lang.Object[] readStoredMethodArguments = new java.lang.Object[3];
        readStoredMethodArguments[0] = ((Object) null);
        readStoredMethodArguments[1] = -255;
        readStoredMethodArguments[2] = -255;
        try {
            readStoredMethod.invoke(zipArchiveInputStream, readStoredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readStored(byte[],int,int)}
 * @utbot.executesCondition {@code (lastStoredEntry == null): True}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: readStoredEntry();
 *  */
    @Test
    public void testReadStored_ThrowUnsupportedOperationException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object buf = createInstance("java.nio.DirectByteBufferR");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "hasDataDescriptor", true);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "usesZip64", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStored] produces [java.lang.UnsupportedOperationException]
            java.base/java.nio.ByteBuffer.array(ByteBuffer.java:1471)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStoredEntry(ZipArchiveInputStream.java:801)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStored(ZipArchiveInputStream.java:442) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readStoredMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readStored", byteArrayType, intType, intType);
        readStoredMethod.setAccessible(true);
        java.lang.Object[] readStoredMethodArguments = new java.lang.Object[3];
        readStoredMethodArguments[0] = ((Object) null);
        readStoredMethodArguments[1] = -255;
        readStoredMethodArguments[2] = -255;
        try {
            readStoredMethod.invoke(zipArchiveInputStream, readStoredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readStored(byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry#access$100(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getSize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final long csize = current.entry.getSize();
 *  */
    @Test
    public void testReadStored_ThrowNullPointerException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStored] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStored(ZipArchiveInputStream.java:447) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readStoredMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readStored", byteArrayType, intType, intType);
        readStoredMethod.setAccessible(true);
        java.lang.Object[] readStoredMethodArguments = new java.lang.Object[3];
        readStoredMethodArguments[0] = ((Object) null);
        readStoredMethodArguments[1] = -255;
        readStoredMethodArguments[2] = -255;
        try {
            readStoredMethod.invoke(zipArchiveInputStream, readStoredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readStored([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readStored(byte[],int,int)}
 * @utbot.executesCondition {@code (current.bytesRead >= csize): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry#access$100(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getSize()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry#access$600(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry)}
 * @utbot.invokes {@link java.nio.ByteBuffer#position()}
 * @utbot.invokes {@link java.nio.ByteBuffer#limit()}
 * @utbot.invokes {@link java.nio.ByteBuffer#position(int)}
 * @utbot.invokes {@link java.nio.ByteBuffer#array()}
 * @utbot.invokes {@link java.io.InputStream#read(byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: final int l = in.read(buf.array());
 *  */
    @Test(expected = IOException.class)
    public void testReadStored_ThrowIOException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) 0};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(buf, "java.nio.Buffer", "mark", 1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        (((ZipArchiveEntry) entry)).setSize(-126L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesRead", -253L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readStoredMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readStored", byteArrayType, intType, intType);
        readStoredMethod.setAccessible(true);
        java.lang.Object[] readStoredMethodArguments = new java.lang.Object[3];
        readStoredMethodArguments[0] = ((Object) null);
        readStoredMethodArguments[1] = -255;
        readStoredMethodArguments[2] = -255;
        try {
            readStoredMethod.invoke(zipArchiveInputStream, readStoredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readStored(byte[],int,int)}
 * @utbot.executesCondition {@code (lastStoredEntry == null): True}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readStoredEntry()
 * @utbot.throwsException {@link java.io.IOException} in: readStoredEntry();
 *  */
    @Test(expected = IOException.class)
    public void testReadStored_ThrowIOException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "hasDataDescriptor", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readStoredMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readStored", byteArrayType, intType, intType);
        readStoredMethod.setAccessible(true);
        java.lang.Object[] readStoredMethodArguments = new java.lang.Object[3];
        readStoredMethodArguments[0] = ((Object) null);
        readStoredMethodArguments[1] = -255;
        readStoredMethodArguments[2] = -255;
        try {
            readStoredMethod.invoke(zipArchiveInputStream, readStoredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readStored([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readStored(byte[],int,int)}
 * @utbot.executesCondition {@code (lastStoredEntry == null): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry#access$200(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry)}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readStoredEntry()
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: readStoredEntry();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadStored_ThrowIndexOutOfBoundsException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "hasDataDescriptor", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readStoredMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readStored", byteArrayType, intType, intType);
        readStoredMethod.setAccessible(true);
        java.lang.Object[] readStoredMethodArguments = new java.lang.Object[3];
        readStoredMethodArguments[0] = ((Object) null);
        readStoredMethodArguments[1] = -255;
        readStoredMethodArguments[2] = -255;
        try {
            readStoredMethod.invoke(zipArchiveInputStream, readStoredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method readStored([B, int, int)
    
    @Test
    public void testReadStored1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "hasDataDescriptor", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        ByteArrayInputStream lastStoredEntry = ((ByteArrayInputStream) createInstance("java.io.ByteArrayInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lastStoredEntry", lastStoredEntry);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStored] produces [java.lang.IndexOutOfBoundsException: Range [0, 0 + -2147483648) out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckFromIndexSize(Preconditions.java:82)
            java.base/jdk.internal.util.Preconditions.checkFromIndexSize(Preconditions.java:361)
            java.base/java.util.Objects.checkFromIndexSize(Objects.java:411)
            java.base/java.io.ByteArrayInputStream.read(ByteArrayInputStream.java:177)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStored(ZipArchiveInputStream.java:444) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readStoredMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readStored", byteArrayType, intType, intType);
        readStoredMethod.setAccessible(true);
        java.lang.Object[] readStoredMethodArguments = new java.lang.Object[3];
        readStoredMethodArguments[0] = ((Object) byteArray);
        readStoredMethodArguments[1] = 0;
        readStoredMethodArguments[2] = Integer.MIN_VALUE;
        try {
            readStoredMethod.invoke(zipArchiveInputStream, readStoredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testReadStored2() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "hasDataDescriptor", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        ByteArrayInputStream lastStoredEntry = ((ByteArrayInputStream) createInstance("java.io.ByteArrayInputStream"));
        setField(lastStoredEntry, "java.io.ByteArrayInputStream", "count", 1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lastStoredEntry", lastStoredEntry);
        byte[] byteArray = new byte[40];
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStored] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ByteArrayInputStream.read(ByteArrayInputStream.java:190)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStored(ZipArchiveInputStream.java:444) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method readStoredMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readStored", byteArrayType, intType, intType);
        readStoredMethod.setAccessible(true);
        java.lang.Object[] readStoredMethodArguments = new java.lang.Object[3];
        readStoredMethodArguments[0] = ((Object) byteArray);
        readStoredMethodArguments[1] = 6;
        readStoredMethodArguments[2] = 3;
        try {
            readStoredMethod.invoke(zipArchiveInputStream, readStoredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readStored
    
    public void testReadStored_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 15 occurrences of:
        // Concrete execution failed
        
        // 5 occurrences of:
        // Default concrete execution failed
        
        // 2 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checksig([B, [B)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#checksig(byte[],byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < expected.length; i++)} once
 *  */
    @Test
    public void testChecksig_IOfSignatureNotEqualsIOfExpected() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {(byte) -126};
        byte[] byteArray1 = {(byte) -127};
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Method checksigMethod = zipArchiveInputStreamClazz.getDeclaredMethod("checksig", byteArrayType, byteArrayType);
        checksigMethod.setAccessible(true);
        java.lang.Object[] checksigMethodArguments = new java.lang.Object[2];
        checksigMethodArguments[0] = ((Object) byteArray);
        checksigMethodArguments[1] = ((Object) byteArray1);
        boolean actual = ((Boolean) checksigMethod.invoke(null, checksigMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#checksig(byte[],byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < expected.length; i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testChecksig_IOfSignatureEqualsIOfExpected() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {(byte) -127};
        byte[] byteArray1 = {(byte) -127};
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Method checksigMethod = zipArchiveInputStreamClazz.getDeclaredMethod("checksig", byteArrayType, byteArrayType);
        checksigMethod.setAccessible(true);
        java.lang.Object[] checksigMethodArguments = new java.lang.Object[2];
        checksigMethodArguments[0] = ((Object) byteArray);
        checksigMethodArguments[1] = ((Object) byteArray1);
        boolean actual = ((Boolean) checksigMethod.invoke(null, checksigMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#checksig(byte[],byte[])}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testChecksig_ReturnTrue() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {};
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Method checksigMethod = zipArchiveInputStreamClazz.getDeclaredMethod("checksig", byteArrayType, byteArrayType);
        checksigMethod.setAccessible(true);
        java.lang.Object[] checksigMethodArguments = new java.lang.Object[2];
        checksigMethodArguments[0] = ((Object) null);
        checksigMethodArguments[1] = ((Object) byteArray);
        boolean actual = ((Boolean) checksigMethod.invoke(null, checksigMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checksig([B, [B)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#checksig(byte[],byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < expected.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: signature[i] != expected[i]
 *  */
    @Test
    public void testChecksig_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        byte[] byteArray = {};
        byte[] byteArray1 = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(ZipArchiveInputStream.java:585) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Method checksigMethod = zipArchiveInputStreamClazz.getDeclaredMethod("checksig", byteArrayType, byteArrayType);
        checksigMethod.setAccessible(true);
        java.lang.Object[] checksigMethodArguments = new java.lang.Object[2];
        checksigMethodArguments[0] = ((Object) byteArray);
        checksigMethodArguments[1] = ((Object) byteArray1);
        try {
            checksigMethod.invoke(null, checksigMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#checksig(byte[],byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < expected.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: signature[i] != expected[i]
 *  */
    @Test
    public void testChecksig_ThrowNullPointerException_1() throws Throwable  {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(ZipArchiveInputStream.java:585) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Method checksigMethod = zipArchiveInputStreamClazz.getDeclaredMethod("checksig", byteArrayType, byteArrayType);
        checksigMethod.setAccessible(true);
        java.lang.Object[] checksigMethodArguments = new java.lang.Object[2];
        checksigMethodArguments[0] = ((Object) null);
        checksigMethodArguments[1] = ((Object) byteArray);
        try {
            checksigMethod.invoke(null, checksigMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#checksig(byte[],byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < expected.length; i++)
 *  */
    @Test
    public void testChecksig_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(ZipArchiveInputStream.java:584) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Method checksigMethod = zipArchiveInputStreamClazz.getDeclaredMethod("checksig", byteArrayType, byteArrayType);
        checksigMethod.setAccessible(true);
        java.lang.Object[] checksigMethodArguments = new java.lang.Object[2];
        checksigMethodArguments[0] = ((Object) null);
        checksigMethodArguments[1] = ((Object) null);
        try {
            checksigMethod.invoke(null, checksigMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getBytesInflated
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBytesInflated()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getBytesInflated()}
 * @utbot.invokes {@link java.util.zip.Inflater#getBytesRead()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: long inB = inf.getBytesRead();
 *  */
    @Test
    public void testGetBytesInflated_ThrowNullPointerException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getBytesInflated] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getBytesInflated(ZipArchiveInputStream.java:698) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method getBytesInflatedMethod = zipArchiveInputStreamClazz.getDeclaredMethod("getBytesInflated");
        getBytesInflatedMethod.setAccessible(true);
        java.lang.Object[] getBytesInflatedMethodArguments = new java.lang.Object[0];
        try {
            getBytesInflatedMethod.invoke(zipArchiveInputStream, getBytesInflatedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getBytesInflated
    
    public void testGetBytesInflated_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDataDescriptor
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readDataDescriptor()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readDataDescriptor()}
 * @utbot.throwsException {@link java.io.IOException} in: readFully(WORD_BUF);
 *  */
    @Test(expected = IOException.class)
    public void testReadDataDescriptor_ThrowIOException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] wordBuf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "WORD_BUF", wordBuf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readDataDescriptorMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readDataDescriptor");
        readDataDescriptorMethod.setAccessible(true);
        java.lang.Object[] readDataDescriptorMethodArguments = new java.lang.Object[0];
        try {
            readDataDescriptorMethod.invoke(zipArchiveInputStream, readDataDescriptorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readDataDescriptor()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadDataDescriptor_ThrowIOException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] wordBuf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "WORD_BUF", wordBuf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readDataDescriptorMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readDataDescriptor");
        readDataDescriptorMethod.setAccessible(true);
        java.lang.Object[] readDataDescriptorMethodArguments = new java.lang.Object[0];
        try {
            readDataDescriptorMethod.invoke(zipArchiveInputStream, readDataDescriptorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readDataDescriptor()}
 * @utbot.throwsException {@link java.io.EOFException} in: readFully(WORD_BUF);
 *  */
    @Test(expected = EOFException.class)
    public void testReadDataDescriptor_ThrowEOFException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] wordBuf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "WORD_BUF", wordBuf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readDataDescriptorMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readDataDescriptor");
        readDataDescriptorMethod.setAccessible(true);
        java.lang.Object[] readDataDescriptorMethodArguments = new java.lang.Object[0];
        try {
            readDataDescriptorMethod.invoke(zipArchiveInputStream, readDataDescriptorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readDataDescriptor()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadDataDescriptor_ThrowIOException_2() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 2L);
        Object in1 = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] wordBuf = {(byte) -127, (byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "WORD_BUF", wordBuf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readDataDescriptorMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readDataDescriptor");
        readDataDescriptorMethod.setAccessible(true);
        java.lang.Object[] readDataDescriptorMethodArguments = new java.lang.Object[0];
        try {
            readDataDescriptorMethod.invoke(zipArchiveInputStream, readDataDescriptorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readDataDescriptor()}
 * @utbot.throwsException {@link java.io.EOFException} in: readFully(WORD_BUF);
 *  */
    @Test(expected = EOFException.class)
    public void testReadDataDescriptor_ThrowEOFException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 0L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] wordBuf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "WORD_BUF", wordBuf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readDataDescriptorMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readDataDescriptor");
        readDataDescriptorMethod.setAccessible(true);
        java.lang.Object[] readDataDescriptorMethodArguments = new java.lang.Object[0];
        try {
            readDataDescriptorMethod.invoke(zipArchiveInputStream, readDataDescriptorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readDataDescriptor()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readDataDescriptor()}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFully(byte[])
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ZipLong val = new ZipLong(WORD_BUF);
 *  */
    @Test
    public void testReadDataDescriptor_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        byte[] wordBuf = {};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "WORD_BUF", wordBuf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDataDescriptor] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 0]
            org.apache.commons.compress.archivers.zip.ZipLong.getValue(ZipLong.java:168)
            org.apache.commons.compress.archivers.zip.ZipLong.<init>(ZipLong.java:111)
            org.apache.commons.compress.archivers.zip.ZipLong.<init>(ZipLong.java:102)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDataDescriptor(ZipArchiveInputStream.java:730) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readDataDescriptorMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readDataDescriptor");
        readDataDescriptorMethod.setAccessible(true);
        java.lang.Object[] readDataDescriptorMethodArguments = new java.lang.Object[0];
        try {
            readDataDescriptorMethod.invoke(zipArchiveInputStream, readDataDescriptorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readDataDescriptor
    
    public void testReadDataDescriptor_errors()
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStoredEntry
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readStoredEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readStoredEntry()}
 * @utbot.iterates iterate the loop {@code while(!done)} once
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: final int r = in.read(buf.array(), off, ZipArchiveOutputStream.BUFFER_SIZE - off);
 *  */
    @Test
    public void testReadStoredEntry_ThrowReadOnlyBufferException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(buf, "java.nio.ByteBuffer", "isReadOnly", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "usesZip64", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStoredEntry] produces [java.nio.ReadOnlyBufferException]
            java.base/java.nio.ByteBuffer.array(ByteBuffer.java:1473)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStoredEntry(ZipArchiveInputStream.java:801) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readStoredEntryMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readStoredEntry");
        readStoredEntryMethod.setAccessible(true);
        java.lang.Object[] readStoredEntryMethodArguments = new java.lang.Object[0];
        try {
            readStoredEntryMethod.invoke(zipArchiveInputStream, readStoredEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readStoredEntry()}
 * @utbot.iterates iterate the loop {@code while(!done)} once
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: final int r = in.read(buf.array(), off, ZipArchiveOutputStream.BUFFER_SIZE - off);
 *  */
    @Test
    public void testReadStoredEntry_ThrowUnsupportedOperationException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object buf = createInstance("java.nio.DirectByteBufferR");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStoredEntry] produces [java.lang.UnsupportedOperationException]
            java.base/java.nio.ByteBuffer.array(ByteBuffer.java:1471)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStoredEntry(ZipArchiveInputStream.java:801) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readStoredEntryMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readStoredEntry");
        readStoredEntryMethod.setAccessible(true);
        java.lang.Object[] readStoredEntryMethodArguments = new java.lang.Object[0];
        try {
            readStoredEntryMethod.invoke(zipArchiveInputStream, readStoredEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readStoredEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readStoredEntry()}
 * @utbot.iterates iterate the loop {@code while(!done)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final int r = in.read(buf.array(), off, ZipArchiveOutputStream.BUFFER_SIZE - off);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadStoredEntry_ThrowIndexOutOfBoundsException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "usesZip64", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readStoredEntryMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readStoredEntry");
        readStoredEntryMethod.setAccessible(true);
        java.lang.Object[] readStoredEntryMethodArguments = new java.lang.Object[0];
        try {
            readStoredEntryMethod.invoke(zipArchiveInputStream, readStoredEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readStoredEntry()}
 * @utbot.iterates iterate the loop {@code while(!done)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final int r = in.read(buf.array(), off, ZipArchiveOutputStream.BUFFER_SIZE - off);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadStoredEntry_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {(byte) 0};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readStoredEntryMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readStoredEntry");
        readStoredEntryMethod.setAccessible(true);
        java.lang.Object[] readStoredEntryMethodArguments = new java.lang.Object[0];
        try {
            readStoredEntryMethod.invoke(zipArchiveInputStream, readStoredEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readStoredEntry()}
 * @utbot.iterates iterate the loop {@code while(!done)} once
 * @utbot.throwsException {@link java.lang.SecurityException} 
 *  */
    @Test(expected = SecurityException.class)
    public void testReadStoredEntry_ThrowSecurityException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties verifiedSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", verifiedSigners);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {(byte) 0};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readStoredEntryMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readStoredEntry");
        readStoredEntryMethod.setAccessible(true);
        java.lang.Object[] readStoredEntryMethodArguments = new java.lang.Object[0];
        try {
            readStoredEntryMethod.invoke(zipArchiveInputStream, readStoredEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readStoredEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readStoredEntry()}
 * @utbot.iterates iterate the loop {@code while(!done)} once
 * @utbot.throwsException {@link java.io.IOException} when: r <= 0
 *  */
    @Test(expected = IOException.class)
    public void testReadStoredEntry_ThrowIOException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {(byte) 0};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readStoredEntryMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readStoredEntry");
        readStoredEntryMethod.setAccessible(true);
        java.lang.Object[] readStoredEntryMethodArguments = new java.lang.Object[0];
        try {
            readStoredEntryMethod.invoke(zipArchiveInputStream, readStoredEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readStoredEntry()}
 * @utbot.iterates iterate the loop {@code while(!done)} once
 * @utbot.throwsException {@link java.io.IOException} when: r <= 0
 *  */
    @Test(expected = IOException.class)
    public void testReadStoredEntry_ThrowIOException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {(byte) 0};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readStoredEntryMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readStoredEntry");
        readStoredEntryMethod.setAccessible(true);
        java.lang.Object[] readStoredEntryMethodArguments = new java.lang.Object[0];
        try {
            readStoredEntryMethod.invoke(zipArchiveInputStream, readStoredEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readStoredEntry()}
 * @utbot.iterates iterate the loop {@code while(!done)} once
 * @utbot.throwsException {@link java.io.IOException} when: r <= 0
 *  */
    @Test(expected = IOException.class)
    public void testReadStoredEntry_ThrowIOException_2() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
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
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {(byte) 0};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readStoredEntryMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readStoredEntry");
        readStoredEntryMethod.setAccessible(true);
        java.lang.Object[] readStoredEntryMethodArguments = new java.lang.Object[0];
        try {
            readStoredEntryMethod.invoke(zipArchiveInputStream, readStoredEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readStoredEntry
    
    public void testReadStoredEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNextEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextEntry()}
 * @utbot.returnsFrom {@code return getNextZipEntry();}
 *  */
    @Test
    public void testGetNextEntry_ReturnGetNextZipEntry() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "closed", true);
        
        ArchiveEntry actual = zipArchiveInputStream.getNextEntry();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextEntry()}
 * @utbot.returnsFrom {@code return getNextZipEntry();}
 *  */
    @Test
    public void testGetNextEntry_ReturnGetNextZipEntry_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "hitCentralDirectory", true);
        
        ArchiveEntry actual = zipArchiveInputStream.getNextEntry();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNextEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetNextEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        byte[] lfhBuf = {};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "LFH_BUF", lfhBuf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 0]
            org.apache.commons.compress.archivers.zip.ZipLong.getValue(ZipLong.java:168)
            org.apache.commons.compress.archivers.zip.ZipLong.<init>(ZipLong.java:111)
            org.apache.commons.compress.archivers.zip.ZipLong.<init>(ZipLong.java:102)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFirstLocalFileHeader(ZipArchiveInputStream.java:333)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry(ZipArchiveInputStream.java:235)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry(ZipArchiveInputStream.java:372) */
        zipArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getNextZipEntry();
 *  */
    @Test
    public void testGetNextEntry_ThrowNullPointerException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", -255L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.currentEntryHasOutstandingBytes(ZipArchiveInputStream.java:661)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.closeEntry(ZipArchiveInputStream.java:619)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry(ZipArchiveInputStream.java:225)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry(ZipArchiveInputStream.java:372) */
        zipArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getNextZipEntry();
 *  */
    @Test
    public void testGetNextEntry_ThrowNullPointerException_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        setField(entry, "java.util.zip.ZipEntry", "csize", -54L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", -54L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        ByteArrayInputStream lastStoredEntry = ((ByteArrayInputStream) createInstance("java.io.ByteArrayInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lastStoredEntry", lastStoredEntry);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException] */
        zipArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getNextZipEntry();
 *  */
    @Test
    public void testGetNextEntry_ThrowNullPointerException_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        setField(entry, "java.util.zip.ZipEntry", "csize", 128L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", 126L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException] */
        zipArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getNextZipEntry();
 *  */
    @Test
    public void testGetNextEntry_ThrowNullPointerException_3() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        setField(entry, "java.util.zip.ZipEntry", "csize", -54L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", -54L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException] */
        zipArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getNextZipEntry();
 *  */
    @Test
    public void testGetNextEntry_ThrowNullPointerException_4() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(buf, "java.nio.Buffer", "capacity", 1073741574);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(entry, "java.util.zip.ZipEntry", "csize", 1073741825L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", 254L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException] */
        zipArchiveInputStream.getNextEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method getNextEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextEntry()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testGetNextEntry_ThrowIOException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] lfhBuf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "LFH_BUF", lfhBuf);
        
        zipArchiveInputStream.getNextEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getNextEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextEntry()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return getNextZipEntry();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetNextEntry_ThrowUnsupportedOperationException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object buf = createInstance("java.nio.DirectByteBufferR");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        setField(entry, "java.util.zip.ZipEntry", "csize", 512L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", 254L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        zipArchiveInputStream.getNextEntry();
    }
    ///endregion
    
    ///region Errors report for getNextEntry
    
    public void testGetNextEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.pushback
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method pushback([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#pushback(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ((PushbackInputStream) in).unread(buf, offset, length);
 *  */
    @Test
    public void testPushback_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        PushbackInputStream in = ((PushbackInputStream) createInstance("java.io.PushbackInputStream"));
        byte[] buf = {(byte) 0};
        setField(in, "java.io.PushbackInputStream", "buf", buf);
        setField(in, "java.io.PushbackInputStream", "pos", -255);
        DeflateCompressorInputStream in1 = ((DeflateCompressorInputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.pushback] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for byte[2]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.PushbackInputStream.unread(PushbackInputStream.java:232)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.pushback(ZipArchiveInputStream.java:889) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method pushbackMethod = zipArchiveInputStreamClazz.getDeclaredMethod("pushback", byteArrayType, intType, intType);
        pushbackMethod.setAccessible(true);
        java.lang.Object[] pushbackMethodArguments = new java.lang.Object[3];
        pushbackMethodArguments[0] = ((Object) byteArray);
        pushbackMethodArguments[1] = -1;
        pushbackMethodArguments[2] = -255;
        try {
            pushbackMethod.invoke(zipArchiveInputStream, pushbackMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#pushback(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ((PushbackInputStream) in).unread(buf, offset, length);
 *  */
    @Test
    public void testPushback_ThrowNullPointerException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.pushback] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.pushback(ZipArchiveInputStream.java:889) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method pushbackMethod = zipArchiveInputStreamClazz.getDeclaredMethod("pushback", byteArrayType, intType, intType);
        pushbackMethod.setAccessible(true);
        java.lang.Object[] pushbackMethodArguments = new java.lang.Object[3];
        pushbackMethodArguments[0] = ((Object) null);
        pushbackMethodArguments[1] = -255;
        pushbackMethodArguments[2] = -255;
        try {
            pushbackMethod.invoke(zipArchiveInputStream, pushbackMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#pushback(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ((PushbackInputStream) in).unread(buf, offset, length);
 *  */
    @Test
    public void testPushback_ThrowNullPointerException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        PushbackInputStream in = ((PushbackInputStream) createInstance("java.io.PushbackInputStream"));
        setField(in, "java.io.PushbackInputStream", "pos", -255);
        Object in1 = createInstance("java.lang.Process$PipeInputStream");
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.pushback] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.PushbackInputStream.unread(PushbackInputStream.java:232)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.pushback(ZipArchiveInputStream.java:889) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method pushbackMethod = zipArchiveInputStreamClazz.getDeclaredMethod("pushback", byteArrayType, intType, intType);
        pushbackMethod.setAccessible(true);
        java.lang.Object[] pushbackMethodArguments = new java.lang.Object[3];
        pushbackMethodArguments[0] = ((Object) null);
        pushbackMethodArguments[1] = -255;
        pushbackMethodArguments[2] = -255;
        try {
            pushbackMethod.invoke(zipArchiveInputStream, pushbackMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method pushback([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#pushback(byte[],int,int)}
 * @utbot.invokes {@link java.io.PushbackInputStream#unread(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: ((PushbackInputStream) in).unread(buf, offset, length);
 *  */
    @Test(expected = IOException.class)
    public void testPushback_ThrowIOException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        PushbackInputStream in = ((PushbackInputStream) createInstance("java.io.PushbackInputStream"));
        setField(in, "java.io.PushbackInputStream", "pos", -2);
        ZCompressorInputStream in1 = ((ZCompressorInputStream) createInstance("org.apache.commons.compress.compressors.z.ZCompressorInputStream"));
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method pushbackMethod = zipArchiveInputStreamClazz.getDeclaredMethod("pushback", byteArrayType, intType, intType);
        pushbackMethod.setAccessible(true);
        java.lang.Object[] pushbackMethodArguments = new java.lang.Object[3];
        pushbackMethodArguments[0] = ((Object) null);
        pushbackMethodArguments[1] = -255;
        pushbackMethodArguments[2] = -1;
        try {
            pushbackMethod.invoke(zipArchiveInputStream, pushbackMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for pushback
    
    public void testPushback_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.cacheBytesRead
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method cacheBytesRead(java.io.ByteArrayOutputStream, int, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#cacheBytesRead(java.io.ByteArrayOutputStream,int,int,int)}
 * @utbot.executesCondition {@code (cacheable > 0): False}
 * @utbot.returnsFrom {@code return offset;}
 *  */
    @Test
    public void testCacheBytesRead_CacheableLessOrEqualZero() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
        Class intType = int.class;
        Method cacheBytesReadMethod = zipArchiveInputStreamClazz.getDeclaredMethod("cacheBytesRead", byteArrayOutputStreamType, intType, intType, intType);
        cacheBytesReadMethod.setAccessible(true);
        java.lang.Object[] cacheBytesReadMethodArguments = new java.lang.Object[4];
        cacheBytesReadMethodArguments[0] = ((Object) null);
        cacheBytesReadMethodArguments[1] = 241;
        cacheBytesReadMethodArguments[2] = -196;
        cacheBytesReadMethodArguments[3] = 42;
        int actual = ((Integer) cacheBytesReadMethod.invoke(zipArchiveInputStream, cacheBytesReadMethodArguments));
        
        assertEquals(45, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method cacheBytesRead(java.io.ByteArrayOutputStream, int, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#cacheBytesRead(java.io.ByteArrayOutputStream,int,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: bos.write(buf.array(), 0, cacheable);
 *  */
    @Test
    public void testCacheBytesRead_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ByteArrayOutputStream byteArrayOutputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf1 = {};
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "buf", buf1);
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "count", -1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.cacheBytesRead] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.cacheBytesRead(ZipArchiveInputStream.java:879) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
        Class intType = int.class;
        Method cacheBytesReadMethod = zipArchiveInputStreamClazz.getDeclaredMethod("cacheBytesRead", byteArrayOutputStreamType, intType, intType, intType);
        cacheBytesReadMethod.setAccessible(true);
        java.lang.Object[] cacheBytesReadMethodArguments = new java.lang.Object[4];
        cacheBytesReadMethodArguments[0] = byteArrayOutputStream;
        cacheBytesReadMethodArguments[1] = -127;
        cacheBytesReadMethodArguments[2] = 130;
        cacheBytesReadMethodArguments[3] = -1;
        try {
            cacheBytesReadMethod.invoke(zipArchiveInputStream, cacheBytesReadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#cacheBytesRead(java.io.ByteArrayOutputStream,int,int,int)}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} in: bos.write(buf.array(), 0, cacheable);
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testCacheBytesRead_ThrowOutOfMemoryError() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object buf = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = new byte[35];
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ByteArrayOutputStream byteArrayOutputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf1 = new byte[40];
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "buf", buf1);
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "count", 2147483616);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
        Class intType = int.class;
        Method cacheBytesReadMethod = zipArchiveInputStreamClazz.getDeclaredMethod("cacheBytesRead", byteArrayOutputStreamType, intType, intType, intType);
        cacheBytesReadMethod.setAccessible(true);
        java.lang.Object[] cacheBytesReadMethodArguments = new java.lang.Object[4];
        cacheBytesReadMethodArguments[0] = byteArrayOutputStream;
        cacheBytesReadMethodArguments[1] = 0;
        cacheBytesReadMethodArguments[2] = 536870913;
        cacheBytesReadMethodArguments[3] = 536870878;
        try {
            cacheBytesReadMethod.invoke(zipArchiveInputStream, cacheBytesReadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#cacheBytesRead(java.io.ByteArrayOutputStream,int,int,int)}
 * @utbot.invokes {@link java.nio.ByteBuffer#array()}
 * @utbot.invokes {@link java.nio.ByteBuffer#array()}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(buf.array(), cacheable, buf.array(), 0, expecteDDLen + 3);
 *  */
    @Test
    public void testCacheBytesRead_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {(byte) -127, (byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ByteArrayOutputStream byteArrayOutputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "buf", hb);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.cacheBytesRead] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.cacheBytesRead(ZipArchiveInputStream.java:880) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
        Class intType = int.class;
        Method cacheBytesReadMethod = zipArchiveInputStreamClazz.getDeclaredMethod("cacheBytesRead", byteArrayOutputStreamType, intType, intType, intType);
        cacheBytesReadMethod.setAccessible(true);
        java.lang.Object[] cacheBytesReadMethodArguments = new java.lang.Object[4];
        cacheBytesReadMethodArguments[0] = byteArrayOutputStream;
        cacheBytesReadMethodArguments[1] = -253;
        cacheBytesReadMethodArguments[2] = 254;
        cacheBytesReadMethodArguments[3] = -4;
        try {
            cacheBytesReadMethod.invoke(zipArchiveInputStream, cacheBytesReadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#cacheBytesRead(java.io.ByteArrayOutputStream,int,int,int)}
 * @utbot.invokes {@link java.nio.ByteBuffer#array()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bos.write(buf.array(), 0, cacheable);
 *  */
    @Test
    public void testCacheBytesRead_ThrowNullPointerException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.cacheBytesRead] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.cacheBytesRead(ZipArchiveInputStream.java:879) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
        Class intType = int.class;
        Method cacheBytesReadMethod = zipArchiveInputStreamClazz.getDeclaredMethod("cacheBytesRead", byteArrayOutputStreamType, intType, intType, intType);
        cacheBytesReadMethod.setAccessible(true);
        java.lang.Object[] cacheBytesReadMethodArguments = new java.lang.Object[4];
        cacheBytesReadMethodArguments[0] = ((Object) null);
        cacheBytesReadMethodArguments[1] = -6;
        cacheBytesReadMethodArguments[2] = -1;
        cacheBytesReadMethodArguments[3] = -11;
        try {
            cacheBytesReadMethod.invoke(zipArchiveInputStream, cacheBytesReadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#cacheBytesRead(java.io.ByteArrayOutputStream,int,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bos.write(buf.array(), 0, cacheable);
 *  */
    @Test
    public void testCacheBytesRead_ThrowNullPointerException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.cacheBytesRead] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.cacheBytesRead(ZipArchiveInputStream.java:879) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
        Class intType = int.class;
        Method cacheBytesReadMethod = zipArchiveInputStreamClazz.getDeclaredMethod("cacheBytesRead", byteArrayOutputStreamType, intType, intType, intType);
        cacheBytesReadMethod.setAccessible(true);
        java.lang.Object[] cacheBytesReadMethodArguments = new java.lang.Object[4];
        cacheBytesReadMethodArguments[0] = ((Object) null);
        cacheBytesReadMethodArguments[1] = -2;
        cacheBytesReadMethodArguments[2] = 252;
        cacheBytesReadMethodArguments[3] = 246;
        try {
            cacheBytesReadMethod.invoke(zipArchiveInputStream, cacheBytesReadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.realSkip
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method realSkip(long)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#realSkip(long)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testRealSkip_SkippedGreaterOrEqualValue() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class longType = long.class;
        Method realSkipMethod = zipArchiveInputStreamClazz.getDeclaredMethod("realSkip", longType);
        realSkipMethod.setAccessible(true);
        java.lang.Object[] realSkipMethodArguments = new java.lang.Object[1];
        realSkipMethodArguments[0] = 0L;
        realSkipMethod.invoke(zipArchiveInputStream, realSkipMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#realSkip(long)}
 * @utbot.iterates iterate the loop {@code while(skipped < value)} once
 *  */
    @Test
    public void testRealSkip_SKIP_BUFLengthLessOrEqualRem() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] skipBuf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "SKIP_BUF", skipBuf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class longType = long.class;
        Method realSkipMethod = zipArchiveInputStreamClazz.getDeclaredMethod("realSkip", longType);
        realSkipMethod.setAccessible(true);
        java.lang.Object[] realSkipMethodArguments = new java.lang.Object[1];
        realSkipMethodArguments[0] = 1L;
        realSkipMethod.invoke(zipArchiveInputStream, realSkipMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#realSkip(long)}
 * @utbot.iterates iterate the loop {@code while(skipped < value)} once
 *  */
    @Test
    public void testRealSkip_SKIP_BUFLengthLessOrEqualRem_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        java.security.CodeSigner[] signers = {null};
        setField(entry, "java.util.jar.JarEntry", "signers", signers);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] skipBuf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "SKIP_BUF", skipBuf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class longType = long.class;
        Method realSkipMethod = zipArchiveInputStreamClazz.getDeclaredMethod("realSkip", longType);
        realSkipMethod.setAccessible(true);
        java.lang.Object[] realSkipMethodArguments = new java.lang.Object[1];
        realSkipMethodArguments[0] = 1L;
        realSkipMethod.invoke(zipArchiveInputStream, realSkipMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#realSkip(long)}
 * @utbot.iterates iterate the loop {@code while(skipped < value)} once
 *  */
    @Test
    public void testRealSkip_SKIP_BUFLengthLessOrEqualRem_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
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
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] skipBuf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "SKIP_BUF", skipBuf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class longType = long.class;
        Method realSkipMethod = zipArchiveInputStreamClazz.getDeclaredMethod("realSkip", longType);
        realSkipMethod.setAccessible(true);
        java.lang.Object[] realSkipMethodArguments = new java.lang.Object[1];
        realSkipMethodArguments[0] = 1L;
        realSkipMethod.invoke(zipArchiveInputStream, realSkipMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method realSkip(long)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#realSkip(long)}
 * @utbot.executesCondition {@code (value >= 0): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRealSkip_ThrowIllegalArgumentException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class longType = long.class;
        Method realSkipMethod = zipArchiveInputStreamClazz.getDeclaredMethod("realSkip", longType);
        realSkipMethod.setAccessible(true);
        java.lang.Object[] realSkipMethodArguments = new java.lang.Object[1];
        realSkipMethodArguments[0] = -256L;
        try {
            realSkipMethod.invoke(zipArchiveInputStream, realSkipMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method realSkip(long)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#realSkip(long)}
 * @utbot.iterates iterate the loop {@code while(skipped < value)} once
 * @utbot.throwsException {@link java.io.IOException} in: final int x = in.read(SKIP_BUF, 0, (int) (SKIP_BUF.length > rem ? rem : SKIP_BUF.length));
 *  */
    @Test(expected = IOException.class)
    public void testRealSkip_ThrowIOException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] skipBuf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "SKIP_BUF", skipBuf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class longType = long.class;
        Method realSkipMethod = zipArchiveInputStreamClazz.getDeclaredMethod("realSkip", longType);
        realSkipMethod.setAccessible(true);
        java.lang.Object[] realSkipMethodArguments = new java.lang.Object[1];
        realSkipMethodArguments[0] = 1L;
        try {
            realSkipMethod.invoke(zipArchiveInputStream, realSkipMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#realSkip(long)}
 * @utbot.iterates iterate the loop {@code while(skipped < value)} once
 * @utbot.throwsException {@link java.io.IOException} in: final int x = in.read(SKIP_BUF, 0, (int) (SKIP_BUF.length > rem ? rem : SKIP_BUF.length));
 *  */
    @Test(expected = IOException.class)
    public void testRealSkip_ThrowIOException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] skipBuf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "SKIP_BUF", skipBuf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class longType = long.class;
        Method realSkipMethod = zipArchiveInputStreamClazz.getDeclaredMethod("realSkip", longType);
        realSkipMethod.setAccessible(true);
        java.lang.Object[] realSkipMethodArguments = new java.lang.Object[1];
        realSkipMethodArguments[0] = 1L;
        try {
            realSkipMethod.invoke(zipArchiveInputStream, realSkipMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#realSkip(long)}
 * @utbot.iterates iterate the loop {@code while(skipped < value)} once
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testRealSkip_ThrowIOException_2() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 1L);
        Object in1 = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] skipBuf = {(byte) -127, (byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "SKIP_BUF", skipBuf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class longType = long.class;
        Method realSkipMethod = zipArchiveInputStreamClazz.getDeclaredMethod("realSkip", longType);
        realSkipMethod.setAccessible(true);
        java.lang.Object[] realSkipMethodArguments = new java.lang.Object[1];
        realSkipMethodArguments[0] = 2L;
        try {
            realSkipMethod.invoke(zipArchiveInputStream, realSkipMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method realSkip(long)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#realSkip(long)}
 * @utbot.iterates iterate the loop {@code while(skipped < value)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int x = in.read(SKIP_BUF, 0, (int) (SKIP_BUF.length > rem ? rem : SKIP_BUF.length));
 *  */
    @Test
    public void testRealSkip_ThrowNullPointerException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        byte[] skipBuf = {(byte) -127, (byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "SKIP_BUF", skipBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.realSkip] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.realSkip(ZipArchiveInputStream.java:975) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class longType = long.class;
        Method realSkipMethod = zipArchiveInputStreamClazz.getDeclaredMethod("realSkip", longType);
        realSkipMethod.setAccessible(true);
        java.lang.Object[] realSkipMethodArguments = new java.lang.Object[1];
        realSkipMethodArguments[0] = 1L;
        try {
            realSkipMethod.invoke(zipArchiveInputStream, realSkipMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#realSkip(long)}
 * @utbot.iterates iterate the loop {@code while(skipped < value)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int x = in.read(SKIP_BUF, 0, (int) (SKIP_BUF.length > rem ? rem : SKIP_BUF.length));
 *  */
    @Test
    public void testRealSkip_ThrowNullPointerException_2() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        byte[] skipBuf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "SKIP_BUF", skipBuf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.realSkip] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.realSkip(ZipArchiveInputStream.java:975) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class longType = long.class;
        Method realSkipMethod = zipArchiveInputStreamClazz.getDeclaredMethod("realSkip", longType);
        realSkipMethod.setAccessible(true);
        java.lang.Object[] realSkipMethodArguments = new java.lang.Object[1];
        realSkipMethodArguments[0] = 1L;
        try {
            realSkipMethod.invoke(zipArchiveInputStream, realSkipMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#realSkip(long)}
 * @utbot.iterates iterate the loop {@code while(skipped < value)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SKIP_BUF.length > rem
 *  */
    @Test
    public void testRealSkip_ThrowNullPointerException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.realSkip] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.realSkip(ZipArchiveInputStream.java:975) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class longType = long.class;
        Method realSkipMethod = zipArchiveInputStreamClazz.getDeclaredMethod("realSkip", longType);
        realSkipMethod.setAccessible(true);
        java.lang.Object[] realSkipMethodArguments = new java.lang.Object[1];
        realSkipMethodArguments[0] = 1L;
        try {
            realSkipMethod.invoke(zipArchiveInputStream, realSkipMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for realSkip
    
    public void testRealSkip_errors()
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readOneByte
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readOneByte()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readOneByte()}
 * @utbot.returnsFrom {@code return b;}
 *  */
    @Test
    public void testReadOneByte_ReturnB() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readOneByteMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readOneByte");
        readOneByteMethod.setAccessible(true);
        java.lang.Object[] readOneByteMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) readOneByteMethod.invoke(zipArchiveInputStream, readOneByteMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readOneByte()}
 * @utbot.returnsFrom {@code return b;}
 *  */
    @Test
    public void testReadOneByte_ReturnB_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        byte[] singleByteBuf = {(byte) 0};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readOneByteMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readOneByte");
        readOneByteMethod.setAccessible(true);
        java.lang.Object[] readOneByteMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) readOneByteMethod.invoke(zipArchiveInputStream, readOneByteMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readOneByte()}
 * @utbot.returnsFrom {@code return b;}
 *  */
    @Test
    public void testReadOneByte_ReturnB_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Sun verifiedSigners = ((Sun) createInstance("sun.security.provider.Sun"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readOneByteMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readOneByte");
        readOneByteMethod.setAccessible(true);
        java.lang.Object[] readOneByteMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) readOneByteMethod.invoke(zipArchiveInputStream, readOneByteMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readOneByte()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readOneByte()}
 * @utbot.invokes {@link java.io.InputStream#read()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int b = in.read();
 *  */
    @Test
    public void testReadOneByte_ThrowNullPointerException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readOneByte] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readOneByte(ZipArchiveInputStream.java:994) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readOneByteMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readOneByte");
        readOneByteMethod.setAccessible(true);
        java.lang.Object[] readOneByteMethodArguments = new java.lang.Object[0];
        try {
            readOneByteMethod.invoke(zipArchiveInputStream, readOneByteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readOneByte()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readOneByte()}
 * @utbot.throwsException {@link java.io.IOException} in: final int b = in.read();
 *  */
    @Test(expected = IOException.class)
    public void testReadOneByte_ThrowIOException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readOneByteMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readOneByte");
        readOneByteMethod.setAccessible(true);
        java.lang.Object[] readOneByteMethodArguments = new java.lang.Object[0];
        try {
            readOneByteMethod.invoke(zipArchiveInputStream, readOneByteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readOneByte()}
 * @utbot.throwsException {@link java.io.IOException} in: final int b = in.read();
 *  */
    @Test(expected = IOException.class)
    public void testReadOneByte_ThrowIOException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readOneByteMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readOneByte");
        readOneByteMethod.setAccessible(true);
        java.lang.Object[] readOneByteMethodArguments = new java.lang.Object[0];
        try {
            readOneByteMethod.invoke(zipArchiveInputStream, readOneByteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readOneByte()}
 * @utbot.throwsException {@link java.io.IOException} in: final int b = in.read();
 *  */
    @Test(expected = IOException.class)
    public void testReadOneByte_ThrowIOException_2() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        CheckedInputStream in = ((CheckedInputStream) createInstance("java.util.zip.CheckedInputStream"));
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readOneByteMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readOneByte");
        readOneByteMethod.setAccessible(true);
        java.lang.Object[] readOneByteMethodArguments = new java.lang.Object[0];
        try {
            readOneByteMethod.invoke(zipArchiveInputStream, readOneByteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readOneByte()}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: final int b = in.read();
 *  */
    @Test(expected = ZipException.class)
    public void testReadOneByte_ThrowZipException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setMethod(1);
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        byte[] singleByteBuf = {(byte) 0};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readOneByteMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readOneByte");
        readOneByteMethod.setAccessible(true);
        java.lang.Object[] readOneByteMethodArguments = new java.lang.Object[0];
        try {
            readOneByteMethod.invoke(zipArchiveInputStream, readOneByteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readOneByte()}
 * @utbot.throwsException {@link java.io.IOException} in: final int b = in.read();
 *  */
    @Test(expected = IOException.class)
    public void testReadOneByte_ThrowIOException_3() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 1L);
        byte[] singleByteBuf = {(byte) 0};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        Object in1 = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readOneByteMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readOneByte");
        readOneByteMethod.setAccessible(true);
        java.lang.Object[] readOneByteMethodArguments = new java.lang.Object[0];
        try {
            readOneByteMethod.invoke(zipArchiveInputStream, readOneByteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readOneByte()}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: final int b = in.read();
 *  */
    @Test(expected = ZipException.class)
    public void testReadOneByte_ThrowZipException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 1L);
        byte[] singleByteBuf = {(byte) 0};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in1, "java.util.jar.JarInputStream", "first", first);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readOneByteMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readOneByte");
        readOneByteMethod.setAccessible(true);
        java.lang.Object[] readOneByteMethodArguments = new java.lang.Object[0];
        try {
            readOneByteMethod.invoke(zipArchiveInputStream, readOneByteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readOneByte()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readOneByte()}
 * @utbot.invokes {@link java.io.InputStream#read()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final int b = in.read();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadOneByte_ThrowIndexOutOfBoundsException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        byte[] singleByteBuf = {};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method readOneByteMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readOneByte");
        readOneByteMethod.setAccessible(true);
        java.lang.Object[] readOneByteMethodArguments = new java.lang.Object[0];
        try {
            readOneByteMethod.invoke(zipArchiveInputStream, readOneByteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readOneByte
    
    public void testReadOneByte_errors()
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.findEocdRecord
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findEocdRecord()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#findEocdRecord()}
 * @utbot.iterates iterate the loop {@code while(skipReadCall || (currentByte = readOneByte()) > -1)} once
 *  */
    @Test
    public void testFindEocdRecord_IterateWhileLoop() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 0L);
        byte[] singleByteBuf = {(byte) 0};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method findEocdRecordMethod = zipArchiveInputStreamClazz.getDeclaredMethod("findEocdRecord");
        findEocdRecordMethod.setAccessible(true);
        java.lang.Object[] findEocdRecordMethodArguments = new java.lang.Object[0];
        findEocdRecordMethod.invoke(zipArchiveInputStream, findEocdRecordMethodArguments);
        
        InputStream zipArchiveInputStreamIn = ((InputStream) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in"));
        ZipEntry finalZipArchiveInputStreamInEntry = ((ZipEntry) getFieldValue(zipArchiveInputStreamIn, "java.util.zip.ZipInputStream", "entry"));
        InputStream zipArchiveInputStreamIn1 = ((InputStream) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in"));
        boolean finalZipArchiveInputStreamInEntryEOF = ((Boolean) getFieldValue(zipArchiveInputStreamIn1, "java.util.zip.ZipInputStream", "entryEOF"));
        
        assertNull(finalZipArchiveInputStreamInEntry);
        
        assertTrue(finalZipArchiveInputStreamInEntryEOF);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#findEocdRecord()}
 * @utbot.iterates iterate the loop {@code while(skipReadCall || (currentByte = readOneByte()) > -1)} once
 *  */
    @Test
    public void testFindEocdRecord_IterateWhileLoop_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method findEocdRecordMethod = zipArchiveInputStreamClazz.getDeclaredMethod("findEocdRecord");
        findEocdRecordMethod.setAccessible(true);
        java.lang.Object[] findEocdRecordMethodArguments = new java.lang.Object[0];
        findEocdRecordMethod.invoke(zipArchiveInputStream, findEocdRecordMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findEocdRecord()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#findEocdRecord()}
 * @utbot.iterates iterate the loop {@code while(skipReadCall || (currentByte = readOneByte()) > -1)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(skipReadCall || (currentByte = readOneByte()) > -1)
 *  */
    @Test
    public void testFindEocdRecord_ThrowNullPointerException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.findEocdRecord] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readOneByte(ZipArchiveInputStream.java:994)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.findEocdRecord(ZipArchiveInputStream.java:933) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method findEocdRecordMethod = zipArchiveInputStreamClazz.getDeclaredMethod("findEocdRecord");
        findEocdRecordMethod.setAccessible(true);
        java.lang.Object[] findEocdRecordMethodArguments = new java.lang.Object[0];
        try {
            findEocdRecordMethod.invoke(zipArchiveInputStream, findEocdRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method findEocdRecord()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#findEocdRecord()}
 * @utbot.iterates iterate the loop {@code while(skipReadCall || (currentByte = readOneByte()) > -1)} once
 * @utbot.throwsException {@link java.io.IOException} in: while(skipReadCall || (currentByte = readOneByte()) > -1)
 *  */
    @Test(expected = IOException.class)
    public void testFindEocdRecord_ThrowIOException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method findEocdRecordMethod = zipArchiveInputStreamClazz.getDeclaredMethod("findEocdRecord");
        findEocdRecordMethod.setAccessible(true);
        java.lang.Object[] findEocdRecordMethodArguments = new java.lang.Object[0];
        try {
            findEocdRecordMethod.invoke(zipArchiveInputStream, findEocdRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#findEocdRecord()}
 * @utbot.iterates iterate the loop {@code while(skipReadCall || (currentByte = readOneByte()) > -1)} once
 * @utbot.throwsException {@link java.io.IOException} in: while(skipReadCall || (currentByte = readOneByte()) > -1)
 *  */
    @Test(expected = IOException.class)
    public void testFindEocdRecord_ThrowIOException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method findEocdRecordMethod = zipArchiveInputStreamClazz.getDeclaredMethod("findEocdRecord");
        findEocdRecordMethod.setAccessible(true);
        java.lang.Object[] findEocdRecordMethodArguments = new java.lang.Object[0];
        try {
            findEocdRecordMethod.invoke(zipArchiveInputStream, findEocdRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#findEocdRecord()}
 * @utbot.iterates iterate the loop {@code while(skipReadCall || (currentByte = readOneByte()) > -1)} once
 * @utbot.throwsException {@link java.io.IOException} in: while(skipReadCall || (currentByte = readOneByte()) > -1)
 *  */
    @Test(expected = IOException.class)
    public void testFindEocdRecord_ThrowIOException_2() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        CheckedInputStream in = ((CheckedInputStream) createInstance("java.util.zip.CheckedInputStream"));
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method findEocdRecordMethod = zipArchiveInputStreamClazz.getDeclaredMethod("findEocdRecord");
        findEocdRecordMethod.setAccessible(true);
        java.lang.Object[] findEocdRecordMethodArguments = new java.lang.Object[0];
        try {
            findEocdRecordMethod.invoke(zipArchiveInputStream, findEocdRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findEocdRecord()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#findEocdRecord()}
 * @utbot.iterates iterate the loop {@code while(skipReadCall || (currentByte = readOneByte()) > -1)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(skipReadCall || (currentByte = readOneByte()) > -1)
 *  */
    @Test(expected = NullPointerException.class)
    public void testFindEocdRecord_ThrowNullPointerException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method findEocdRecordMethod = zipArchiveInputStreamClazz.getDeclaredMethod("findEocdRecord");
        findEocdRecordMethod.setAccessible(true);
        java.lang.Object[] findEocdRecordMethodArguments = new java.lang.Object[0];
        try {
            findEocdRecordMethod.invoke(zipArchiveInputStream, findEocdRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for findEocdRecord
    
    public void testFindEocdRecord_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.drainCurrentEntryData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method drainCurrentEntryData()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#drainCurrentEntryData()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry#access$100(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getCompressedSize()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry#access$700(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry)}
 *  */
    @Test
    public void testDrainCurrentEntryData_RemainingLessOrEqualZero() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        setField(entry, "java.util.zip.ZipEntry", "csize", -16L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", -16L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method drainCurrentEntryDataMethod = zipArchiveInputStreamClazz.getDeclaredMethod("drainCurrentEntryData");
        drainCurrentEntryDataMethod.setAccessible(true);
        java.lang.Object[] drainCurrentEntryDataMethodArguments = new java.lang.Object[0];
        drainCurrentEntryDataMethod.invoke(zipArchiveInputStream, drainCurrentEntryDataMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drainCurrentEntryData()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#drainCurrentEntryData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: long remaining = current.entry.getCompressedSize() - current.bytesReadFromStream;
 *  */
    @Test
    public void testDrainCurrentEntryData_ThrowNullPointerException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.drainCurrentEntryData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.drainCurrentEntryData(ZipArchiveInputStream.java:670) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method drainCurrentEntryDataMethod = zipArchiveInputStreamClazz.getDeclaredMethod("drainCurrentEntryData");
        drainCurrentEntryDataMethod.setAccessible(true);
        java.lang.Object[] drainCurrentEntryDataMethodArguments = new java.lang.Object[0];
        try {
            drainCurrentEntryDataMethod.invoke(zipArchiveInputStream, drainCurrentEntryDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#drainCurrentEntryData()}
 * @utbot.iterates iterate the loop {@code while(remaining > 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final long n = in.read(buf.array(), 0, (int) Math.min(buf.capacity(), remaining));
 *  */
    @Test
    public void testDrainCurrentEntryData_ThrowNullPointerException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        setField(entry, "java.util.zip.ZipEntry", "csize", 10050223472643L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", 0L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.drainCurrentEntryData] produces [java.lang.NullPointerException] */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method drainCurrentEntryDataMethod = zipArchiveInputStreamClazz.getDeclaredMethod("drainCurrentEntryData");
        drainCurrentEntryDataMethod.setAccessible(true);
        java.lang.Object[] drainCurrentEntryDataMethodArguments = new java.lang.Object[0];
        try {
            drainCurrentEntryDataMethod.invoke(zipArchiveInputStream, drainCurrentEntryDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#drainCurrentEntryData()}
 * @utbot.iterates iterate the loop {@code while(remaining > 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final long n = in.read(buf.array(), 0, (int) Math.min(buf.capacity(), remaining));
 *  */
    @Test
    public void testDrainCurrentEntryData_ThrowNullPointerException_2() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(buf, "java.nio.Buffer", "capacity", 1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(entry, "java.util.zip.ZipEntry", "csize", 193L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", 192L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.drainCurrentEntryData] produces [java.lang.NullPointerException] */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method drainCurrentEntryDataMethod = zipArchiveInputStreamClazz.getDeclaredMethod("drainCurrentEntryData");
        drainCurrentEntryDataMethod.setAccessible(true);
        java.lang.Object[] drainCurrentEntryDataMethodArguments = new java.lang.Object[0];
        try {
            drainCurrentEntryDataMethod.invoke(zipArchiveInputStream, drainCurrentEntryDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method drainCurrentEntryData()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#drainCurrentEntryData()}
 * @utbot.iterates iterate the loop {@code while(remaining > 0)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final long n = in.read(buf.array(), 0, (int) Math.min(buf.capacity(), remaining));
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testDrainCurrentEntryData_ThrowIndexOutOfBoundsException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(buf, "java.nio.Buffer", "capacity", 1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        setField(entry, "java.util.zip.ZipEntry", "csize", 0L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", -1L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method drainCurrentEntryDataMethod = zipArchiveInputStreamClazz.getDeclaredMethod("drainCurrentEntryData");
        drainCurrentEntryDataMethod.setAccessible(true);
        java.lang.Object[] drainCurrentEntryDataMethodArguments = new java.lang.Object[0];
        try {
            drainCurrentEntryDataMethod.invoke(zipArchiveInputStream, drainCurrentEntryDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#drainCurrentEntryData()}
 * @utbot.iterates iterate the loop {@code while(remaining > 0)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final long n = in.read(buf.array(), 0, (int) Math.min(buf.capacity(), remaining));
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testDrainCurrentEntryData_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(buf, "java.nio.Buffer", "capacity", 2147483645);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        setField(entry, "java.util.zip.ZipEntry", "csize", 2147483392L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", -253L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method drainCurrentEntryDataMethod = zipArchiveInputStreamClazz.getDeclaredMethod("drainCurrentEntryData");
        drainCurrentEntryDataMethod.setAccessible(true);
        java.lang.Object[] drainCurrentEntryDataMethodArguments = new java.lang.Object[0];
        try {
            drainCurrentEntryDataMethod.invoke(zipArchiveInputStream, drainCurrentEntryDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method drainCurrentEntryData()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#drainCurrentEntryData()}
 * @utbot.iterates iterate the loop {@code while(remaining > 0)} once
 * @utbot.throwsException {@link java.io.EOFException} in: ArchiveUtils.sanitize(current.entry.getName())
 *  */
    @Test(expected = EOFException.class)
    public void testDrainCurrentEntryData_ThrowEOFException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(buf, "java.nio.Buffer", "capacity", 1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        setField(entry, "java.util.zip.ZipEntry", "csize", -96L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", -97L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method drainCurrentEntryDataMethod = zipArchiveInputStreamClazz.getDeclaredMethod("drainCurrentEntryData");
        drainCurrentEntryDataMethod.setAccessible(true);
        java.lang.Object[] drainCurrentEntryDataMethodArguments = new java.lang.Object[0];
        try {
            drainCurrentEntryDataMethod.invoke(zipArchiveInputStream, drainCurrentEntryDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#drainCurrentEntryData()}
 * @utbot.iterates iterate the loop {@code while(remaining > 0)} once
 * @utbot.throwsException {@link java.io.EOFException} in: ArchiveUtils.sanitize(current.entry.getName())
 *  */
    @Test(expected = EOFException.class)
    public void testDrainCurrentEntryData_ThrowEOFException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(buf, "java.nio.Buffer", "capacity", 1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        setField(entry, "java.util.zip.ZipEntry", "csize", 0L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", -1L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method drainCurrentEntryDataMethod = zipArchiveInputStreamClazz.getDeclaredMethod("drainCurrentEntryData");
        drainCurrentEntryDataMethod.setAccessible(true);
        java.lang.Object[] drainCurrentEntryDataMethodArguments = new java.lang.Object[0];
        try {
            drainCurrentEntryDataMethod.invoke(zipArchiveInputStream, drainCurrentEntryDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#drainCurrentEntryData()}
 * @utbot.iterates iterate the loop {@code while(remaining > 0)} once
 * @utbot.throwsException {@link java.io.EOFException} in: ArchiveUtils.sanitize(current.entry.getName())
 *  */
    @Test(expected = EOFException.class)
    public void testDrainCurrentEntryData_ThrowEOFException_2() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(buf, "java.nio.Buffer", "capacity", 1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        setField(entry, "java.util.zip.ZipEntry", "csize", 0L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", -1L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method drainCurrentEntryDataMethod = zipArchiveInputStreamClazz.getDeclaredMethod("drainCurrentEntryData");
        drainCurrentEntryDataMethod.setAccessible(true);
        java.lang.Object[] drainCurrentEntryDataMethodArguments = new java.lang.Object[0];
        try {
            drainCurrentEntryDataMethod.invoke(zipArchiveInputStream, drainCurrentEntryDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for drainCurrentEntryData
    
    public void testDrainCurrentEntryData_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.supportsDataDescriptorFor
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method supportsDataDescriptorFor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#supportsDataDescriptorFor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getGeneralPurposeBit()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !entry.getGeneralPurposeBit().usesDataDescriptor() || (allowStoredEntriesWithDataDescriptor && entry.getMethod() == ZipEntry.STORED) || entry.getMethod() == ZipEntry.DEFLATED;
 *  */
    @Test
    public void testSupportsDataDescriptorFor_ThrowNullPointerException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.supportsDataDescriptorFor] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.supportsDataDescriptorFor(ZipArchiveInputStream.java:769) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Method supportsDataDescriptorForMethod = zipArchiveInputStreamClazz.getDeclaredMethod("supportsDataDescriptorFor", zipArchiveEntryType);
        supportsDataDescriptorForMethod.setAccessible(true);
        java.lang.Object[] supportsDataDescriptorForMethodArguments = new java.lang.Object[1];
        supportsDataDescriptorForMethodArguments[0] = ((Object) null);
        try {
            supportsDataDescriptorForMethod.invoke(zipArchiveInputStream, supportsDataDescriptorForMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for supportsDataDescriptorFor
    
    public void testSupportsDataDescriptorFor_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFirstLocalFileHeader
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readFirstLocalFileHeader([B)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFirstLocalFileHeader(byte[])}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadFirstLocalFileHeader_ThrowIOException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] byteArray = {(byte) -127};
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Method readFirstLocalFileHeaderMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readFirstLocalFileHeader", byteArrayType);
        readFirstLocalFileHeaderMethod.setAccessible(true);
        java.lang.Object[] readFirstLocalFileHeaderMethodArguments = new java.lang.Object[1];
        readFirstLocalFileHeaderMethodArguments[0] = ((Object) byteArray);
        try {
            readFirstLocalFileHeaderMethod.invoke(zipArchiveInputStream, readFirstLocalFileHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFirstLocalFileHeader(byte[])}
 * @utbot.throwsException {@link java.io.EOFException} in: readFully(lfh);
 *  */
    @Test(expected = EOFException.class)
    public void testReadFirstLocalFileHeader_ThrowEOFException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        byte[] byteArray = {(byte) -127};
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Method readFirstLocalFileHeaderMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readFirstLocalFileHeader", byteArrayType);
        readFirstLocalFileHeaderMethod.setAccessible(true);
        java.lang.Object[] readFirstLocalFileHeaderMethodArguments = new java.lang.Object[1];
        readFirstLocalFileHeaderMethodArguments[0] = ((Object) byteArray);
        try {
            readFirstLocalFileHeaderMethod.invoke(zipArchiveInputStream, readFirstLocalFileHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFirstLocalFileHeader(byte[])}
 * @utbot.throwsException {@link java.io.EOFException} in: readFully(lfh);
 *  */
    @Test(expected = EOFException.class)
    public void testReadFirstLocalFileHeader_ThrowEOFException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 0L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        byte[] byteArray = {(byte) -127};
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Method readFirstLocalFileHeaderMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readFirstLocalFileHeader", byteArrayType);
        readFirstLocalFileHeaderMethod.setAccessible(true);
        java.lang.Object[] readFirstLocalFileHeaderMethodArguments = new java.lang.Object[1];
        readFirstLocalFileHeaderMethodArguments[0] = ((Object) byteArray);
        try {
            readFirstLocalFileHeaderMethod.invoke(zipArchiveInputStream, readFirstLocalFileHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readFirstLocalFileHeader([B)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFirstLocalFileHeader(byte[])}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFully(byte[])
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testReadFirstLocalFileHeader_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.ArchiveInputStream", "bytesRead", 0L);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFirstLocalFileHeader] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 0]
            org.apache.commons.compress.archivers.zip.ZipLong.getValue(ZipLong.java:168)
            org.apache.commons.compress.archivers.zip.ZipLong.<init>(ZipLong.java:111)
            org.apache.commons.compress.archivers.zip.ZipLong.<init>(ZipLong.java:102)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFirstLocalFileHeader(ZipArchiveInputStream.java:333) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Method readFirstLocalFileHeaderMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readFirstLocalFileHeader", byteArrayType);
        readFirstLocalFileHeaderMethod.setAccessible(true);
        java.lang.Object[] readFirstLocalFileHeaderMethodArguments = new java.lang.Object[1];
        readFirstLocalFileHeaderMethodArguments[0] = ((Object) byteArray);
        try {
            readFirstLocalFileHeaderMethod.invoke(zipArchiveInputStream, readFirstLocalFileHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readFirstLocalFileHeader
    
    public void testReadFirstLocalFileHeader_errors()
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skipRemainderOfArchive
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method skipRemainderOfArchive()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skipRemainderOfArchive()}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#findEocdRecord()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findEocdRecord();
 *  */
    @Test
    public void testSkipRemainderOfArchive_ThrowNullPointerException_3() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "entriesRead", 840319689);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skipRemainderOfArchive] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readOneByte(ZipArchiveInputStream.java:994)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.findEocdRecord(ZipArchiveInputStream.java:933)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skipRemainderOfArchive(ZipArchiveInputStream.java:919) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method skipRemainderOfArchiveMethod = zipArchiveInputStreamClazz.getDeclaredMethod("skipRemainderOfArchive");
        skipRemainderOfArchiveMethod.setAccessible(true);
        java.lang.Object[] skipRemainderOfArchiveMethodArguments = new java.lang.Object[0];
        try {
            skipRemainderOfArchiveMethod.invoke(zipArchiveInputStream, skipRemainderOfArchiveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skipRemainderOfArchive()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: realSkip(entriesRead * CFH_LEN - LFH_LEN);
 *  */
    @Test
    public void testSkipRemainderOfArchive_ThrowNullPointerException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        byte[] skipBuf = new byte[36];
        skipBuf[0] = (byte) -127;
        skipBuf[1] = (byte) -127;
        skipBuf[2] = (byte) -127;
        skipBuf[3] = (byte) -127;
        skipBuf[4] = (byte) -127;
        skipBuf[5] = (byte) -127;
        skipBuf[6] = (byte) -127;
        skipBuf[7] = (byte) -127;
        skipBuf[8] = (byte) -127;
        skipBuf[9] = (byte) -127;
        skipBuf[10] = (byte) -127;
        skipBuf[11] = (byte) -127;
        skipBuf[12] = (byte) -127;
        skipBuf[13] = (byte) -127;
        skipBuf[14] = (byte) -127;
        skipBuf[15] = (byte) -127;
        skipBuf[16] = (byte) -127;
        skipBuf[17] = (byte) -127;
        skipBuf[18] = (byte) -127;
        skipBuf[19] = (byte) -127;
        skipBuf[20] = (byte) -127;
        skipBuf[21] = (byte) -127;
        skipBuf[22] = (byte) -127;
        skipBuf[23] = (byte) -127;
        skipBuf[24] = (byte) -127;
        skipBuf[25] = (byte) -127;
        skipBuf[26] = (byte) -127;
        skipBuf[27] = (byte) -127;
        skipBuf[28] = (byte) -127;
        skipBuf[29] = (byte) -127;
        skipBuf[30] = (byte) -127;
        skipBuf[31] = (byte) -127;
        skipBuf[32] = (byte) -127;
        skipBuf[33] = (byte) -127;
        skipBuf[34] = (byte) -127;
        skipBuf[35] = (byte) -127;
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "SKIP_BUF", skipBuf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "entriesRead", 1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skipRemainderOfArchive] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.realSkip(ZipArchiveInputStream.java:975)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skipRemainderOfArchive(ZipArchiveInputStream.java:918) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method skipRemainderOfArchiveMethod = zipArchiveInputStreamClazz.getDeclaredMethod("skipRemainderOfArchive");
        skipRemainderOfArchiveMethod.setAccessible(true);
        java.lang.Object[] skipRemainderOfArchiveMethodArguments = new java.lang.Object[0];
        try {
            skipRemainderOfArchiveMethod.invoke(zipArchiveInputStream, skipRemainderOfArchiveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skipRemainderOfArchive()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: realSkip(entriesRead * CFH_LEN - LFH_LEN);
 *  */
    @Test
    public void testSkipRemainderOfArchive_ThrowNullPointerException_2() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        byte[] skipBuf = new byte[31];
        skipBuf[0] = (byte) -126;
        skipBuf[1] = (byte) -127;
        skipBuf[2] = (byte) -127;
        skipBuf[3] = (byte) -127;
        skipBuf[4] = (byte) -127;
        skipBuf[5] = (byte) -127;
        skipBuf[6] = (byte) -127;
        skipBuf[7] = (byte) -127;
        skipBuf[8] = (byte) -127;
        skipBuf[9] = (byte) -127;
        skipBuf[10] = (byte) -127;
        skipBuf[11] = (byte) -127;
        skipBuf[12] = (byte) -127;
        skipBuf[13] = (byte) -127;
        skipBuf[14] = (byte) -127;
        skipBuf[15] = (byte) -127;
        skipBuf[16] = (byte) -127;
        skipBuf[17] = (byte) -127;
        skipBuf[18] = (byte) -127;
        skipBuf[19] = (byte) -127;
        skipBuf[20] = (byte) -127;
        skipBuf[21] = (byte) -127;
        skipBuf[22] = (byte) -127;
        skipBuf[23] = (byte) -127;
        skipBuf[24] = (byte) -127;
        skipBuf[25] = (byte) -127;
        skipBuf[26] = (byte) -127;
        skipBuf[27] = (byte) -127;
        skipBuf[28] = (byte) -127;
        skipBuf[29] = (byte) -127;
        skipBuf[30] = (byte) -127;
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "SKIP_BUF", skipBuf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "entriesRead", 280167986);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skipRemainderOfArchive] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.realSkip(ZipArchiveInputStream.java:975)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skipRemainderOfArchive(ZipArchiveInputStream.java:918) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method skipRemainderOfArchiveMethod = zipArchiveInputStreamClazz.getDeclaredMethod("skipRemainderOfArchive");
        skipRemainderOfArchiveMethod.setAccessible(true);
        java.lang.Object[] skipRemainderOfArchiveMethodArguments = new java.lang.Object[0];
        try {
            skipRemainderOfArchiveMethod.invoke(zipArchiveInputStream, skipRemainderOfArchiveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skipRemainderOfArchive()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: realSkip(entriesRead * CFH_LEN - LFH_LEN);
 *  */
    @Test
    public void testSkipRemainderOfArchive_ThrowNullPointerException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "entriesRead", 227);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skipRemainderOfArchive] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.realSkip(ZipArchiveInputStream.java:975)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skipRemainderOfArchive(ZipArchiveInputStream.java:918) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method skipRemainderOfArchiveMethod = zipArchiveInputStreamClazz.getDeclaredMethod("skipRemainderOfArchive");
        skipRemainderOfArchiveMethod.setAccessible(true);
        java.lang.Object[] skipRemainderOfArchiveMethodArguments = new java.lang.Object[0];
        try {
            skipRemainderOfArchiveMethod.invoke(zipArchiveInputStream, skipRemainderOfArchiveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method skipRemainderOfArchive()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skipRemainderOfArchive()}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#realSkip(long)
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: realSkip(entriesRead * CFH_LEN - LFH_LEN);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSkipRemainderOfArchive_ThrowIllegalArgumentException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "entriesRead", -200);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method skipRemainderOfArchiveMethod = zipArchiveInputStreamClazz.getDeclaredMethod("skipRemainderOfArchive");
        skipRemainderOfArchiveMethod.setAccessible(true);
        java.lang.Object[] skipRemainderOfArchiveMethodArguments = new java.lang.Object[0];
        try {
            skipRemainderOfArchiveMethod.invoke(zipArchiveInputStream, skipRemainderOfArchiveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method skipRemainderOfArchive()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skipRemainderOfArchive()}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#findEocdRecord()
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testSkipRemainderOfArchive_ThrowIOException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "entriesRead", 840319689);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method skipRemainderOfArchiveMethod = zipArchiveInputStreamClazz.getDeclaredMethod("skipRemainderOfArchive");
        skipRemainderOfArchiveMethod.setAccessible(true);
        java.lang.Object[] skipRemainderOfArchiveMethodArguments = new java.lang.Object[0];
        try {
            skipRemainderOfArchiveMethod.invoke(zipArchiveInputStream, skipRemainderOfArchiveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skipRemainderOfArchive()}
 * @utbot.throwsException {@link java.io.IOException} in: realSkip(entriesRead * CFH_LEN - LFH_LEN);
 *  */
    @Test(expected = IOException.class)
    public void testSkipRemainderOfArchive_ThrowIOException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] skipBuf = new byte[27];
        skipBuf[0] = (byte) -127;
        skipBuf[1] = (byte) -127;
        skipBuf[2] = (byte) -127;
        skipBuf[3] = (byte) -127;
        skipBuf[4] = (byte) -127;
        skipBuf[5] = (byte) -127;
        skipBuf[6] = (byte) -127;
        skipBuf[7] = (byte) -127;
        skipBuf[8] = (byte) -127;
        skipBuf[9] = (byte) -127;
        skipBuf[10] = (byte) -127;
        skipBuf[11] = (byte) -127;
        skipBuf[12] = (byte) -127;
        skipBuf[13] = (byte) -127;
        skipBuf[14] = (byte) -127;
        skipBuf[15] = (byte) -127;
        skipBuf[16] = (byte) -127;
        skipBuf[17] = (byte) -127;
        skipBuf[18] = (byte) -127;
        skipBuf[19] = (byte) -127;
        skipBuf[20] = (byte) -127;
        skipBuf[21] = (byte) -127;
        skipBuf[22] = (byte) -127;
        skipBuf[23] = (byte) -127;
        skipBuf[24] = (byte) -127;
        skipBuf[25] = (byte) -127;
        skipBuf[26] = (byte) -127;
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "SKIP_BUF", skipBuf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "entriesRead", 953060500);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method skipRemainderOfArchiveMethod = zipArchiveInputStreamClazz.getDeclaredMethod("skipRemainderOfArchive");
        skipRemainderOfArchiveMethod.setAccessible(true);
        java.lang.Object[] skipRemainderOfArchiveMethodArguments = new java.lang.Object[0];
        try {
            skipRemainderOfArchiveMethod.invoke(zipArchiveInputStream, skipRemainderOfArchiveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skipRemainderOfArchive()}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: realSkip(entriesRead * CFH_LEN - LFH_LEN);
 *  */
    @Test(expected = ZipException.class)
    public void testSkipRemainderOfArchive_ThrowZipException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry.setMethod(1);
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] skipBuf = new byte[30];
        skipBuf[0] = (byte) -127;
        skipBuf[1] = (byte) -127;
        skipBuf[2] = (byte) -127;
        skipBuf[3] = (byte) -127;
        skipBuf[4] = (byte) -127;
        skipBuf[5] = (byte) -127;
        skipBuf[6] = (byte) -127;
        skipBuf[7] = (byte) -127;
        skipBuf[8] = (byte) -127;
        skipBuf[9] = (byte) -127;
        skipBuf[10] = (byte) -127;
        skipBuf[11] = (byte) -127;
        skipBuf[12] = (byte) -127;
        skipBuf[13] = (byte) -127;
        skipBuf[14] = (byte) -127;
        skipBuf[15] = (byte) -127;
        skipBuf[16] = (byte) -127;
        skipBuf[17] = (byte) -127;
        skipBuf[18] = (byte) -127;
        skipBuf[19] = (byte) -127;
        skipBuf[20] = (byte) -127;
        skipBuf[21] = (byte) -127;
        skipBuf[22] = (byte) -127;
        skipBuf[23] = (byte) -127;
        skipBuf[24] = (byte) -127;
        skipBuf[25] = (byte) -127;
        skipBuf[26] = (byte) -127;
        skipBuf[27] = (byte) -127;
        skipBuf[28] = (byte) -127;
        skipBuf[29] = (byte) -127;
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "SKIP_BUF", skipBuf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "entriesRead", 1);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method skipRemainderOfArchiveMethod = zipArchiveInputStreamClazz.getDeclaredMethod("skipRemainderOfArchive");
        skipRemainderOfArchiveMethod.setAccessible(true);
        java.lang.Object[] skipRemainderOfArchiveMethodArguments = new java.lang.Object[0];
        try {
            skipRemainderOfArchiveMethod.invoke(zipArchiveInputStream, skipRemainderOfArchiveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for skipRemainderOfArchive
    
    public void testSkipRemainderOfArchive_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.isFirstByteOfEocdSig
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isFirstByteOfEocdSig(int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#isFirstByteOfEocdSig(int)}
 * @utbot.returnsFrom {@code return b == ZipArchiveOutputStream.EOCD_SIG[0];}
 *  */
    @Test
    public void testIsFirstByteOfEocdSig_BNotEquals0OfZipArchiveOutputStreamEOCD_SIG() throws Exception  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            
            Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
            Class intType = int.class;
            Method isFirstByteOfEocdSigMethod = zipArchiveInputStreamClazz.getDeclaredMethod("isFirstByteOfEocdSig", intType);
            isFirstByteOfEocdSigMethod.setAccessible(true);
            java.lang.Object[] isFirstByteOfEocdSigMethodArguments = new java.lang.Object[1];
            isFirstByteOfEocdSigMethodArguments[0] = -255;
            boolean actual = ((Boolean) isFirstByteOfEocdSigMethod.invoke(zipArchiveInputStream, isFirstByteOfEocdSigMethodArguments));
            
            assertFalse(actual);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#isFirstByteOfEocdSig(int)}
 * @utbot.returnsFrom {@code return b == ZipArchiveOutputStream.EOCD_SIG[0];}
 *  */
    @Test
    public void testIsFirstByteOfEocdSig_BEquals0OfZipArchiveOutputStreamEOCD_SIG() throws Exception  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            
            Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
            Class intType = int.class;
            Method isFirstByteOfEocdSigMethod = zipArchiveInputStreamClazz.getDeclaredMethod("isFirstByteOfEocdSig", intType);
            isFirstByteOfEocdSigMethod.setAccessible(true);
            java.lang.Object[] isFirstByteOfEocdSigMethodArguments = new java.lang.Object[1];
            isFirstByteOfEocdSigMethodArguments[0] = 80;
            boolean actual = ((Boolean) isFirstByteOfEocdSigMethod.invoke(zipArchiveInputStream, isFirstByteOfEocdSigMethodArguments));
            
            assertTrue(actual);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method bufferContainsSignature(java.io.ByteArrayOutputStream, int, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#bufferContainsSignature(java.io.ByteArrayOutputStream,int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; !done && i < lastRead - 4; i++)} once
 * @utbot.returnsFrom {@code return done;}
 *  */
    @Test
    public void testBufferContainsSignature_IterateForLoop() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
        Class intType = int.class;
        Method bufferContainsSignatureMethod = zipArchiveInputStreamClazz.getDeclaredMethod("bufferContainsSignature", byteArrayOutputStreamType, intType, intType, intType);
        bufferContainsSignatureMethod.setAccessible(true);
        java.lang.Object[] bufferContainsSignatureMethodArguments = new java.lang.Object[4];
        bufferContainsSignatureMethodArguments[0] = ((Object) null);
        bufferContainsSignatureMethodArguments[1] = -255;
        bufferContainsSignatureMethodArguments[2] = 4;
        bufferContainsSignatureMethodArguments[3] = -255;
        boolean actual = ((Boolean) bufferContainsSignatureMethod.invoke(zipArchiveInputStream, bufferContainsSignatureMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#bufferContainsSignature(java.io.ByteArrayOutputStream,int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; !done && i < lastRead - 4; i++)} twice
 * @utbot.returnsFrom {@code return done;}
 *  */
    @Test
    public void testBufferContainsSignature_IOfBufArrayNotEquals0OfLFH() throws Exception  {
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        byte[] prevLFH = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "LFH"));
        try {
            byte[] lfh = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            setStaticField(zipArchiveInputStreamClazz, "LFH", lfh);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            Object buf = createInstance("java.nio.HeapByteBuffer");
            byte[] hb = {(byte) -127};
            setField(buf, "java.nio.ByteBuffer", "hb", hb);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
            
            Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
            Class intType = int.class;
            Method bufferContainsSignatureMethod = zipArchiveInputStreamClazz.getDeclaredMethod("bufferContainsSignature", byteArrayOutputStreamType, intType, intType, intType);
            bufferContainsSignatureMethod.setAccessible(true);
            java.lang.Object[] bufferContainsSignatureMethodArguments = new java.lang.Object[4];
            bufferContainsSignatureMethodArguments[0] = ((Object) null);
            bufferContainsSignatureMethodArguments[1] = -255;
            bufferContainsSignatureMethodArguments[2] = 5;
            bufferContainsSignatureMethodArguments[3] = -255;
            boolean actual = ((Boolean) bufferContainsSignatureMethod.invoke(zipArchiveInputStream, bufferContainsSignatureMethodArguments));
            
            assertFalse(actual);
        } finally {
            setStaticField(ZipArchiveInputStream.class, "LFH", prevLFH);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#bufferContainsSignature(java.io.ByteArrayOutputStream,int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; !done && i < lastRead - 4; i++)} twice
 * @utbot.returnsFrom {@code return done;}
 *  */
    @Test
    public void testBufferContainsSignature_I1OfBufArrayNotEquals1OfLFH() throws Exception  {
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        byte[] prevLFH = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "LFH"));
        try {
            byte[] lfh = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            setStaticField(zipArchiveInputStreamClazz, "LFH", lfh);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            Object buf = createInstance("java.nio.HeapByteBuffer");
            byte[] hb = {(byte) 80, (byte) -126};
            setField(buf, "java.nio.ByteBuffer", "hb", hb);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
            
            Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
            Class intType = int.class;
            Method bufferContainsSignatureMethod = zipArchiveInputStreamClazz.getDeclaredMethod("bufferContainsSignature", byteArrayOutputStreamType, intType, intType, intType);
            bufferContainsSignatureMethod.setAccessible(true);
            java.lang.Object[] bufferContainsSignatureMethodArguments = new java.lang.Object[4];
            bufferContainsSignatureMethodArguments[0] = ((Object) null);
            bufferContainsSignatureMethodArguments[1] = -255;
            bufferContainsSignatureMethodArguments[2] = 5;
            bufferContainsSignatureMethodArguments[3] = -255;
            boolean actual = ((Boolean) bufferContainsSignatureMethod.invoke(zipArchiveInputStream, bufferContainsSignatureMethodArguments));
            
            assertFalse(actual);
        } finally {
            setStaticField(ZipArchiveInputStream.class, "LFH", prevLFH);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#bufferContainsSignature(java.io.ByteArrayOutputStream,int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; !done && i < lastRead - 4; i++)} twice
 * @utbot.returnsFrom {@code return done;}
 *  */
    @Test
    public void testBufferContainsSignature_I2OfBufArrayNotEquals2OfLFH() throws Exception  {
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        byte[] prevDD = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "DD"));
        byte[] prevLFH = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "LFH"));
        byte[] prevCFH = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "CFH"));
        try {
            byte[] dd = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            setStaticField(zipArchiveInputStreamClazz, "DD", dd);
            byte[] lfh = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            setStaticField(zipArchiveInputStreamClazz, "LFH", lfh);
            byte[] cfh = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            setStaticField(zipArchiveInputStreamClazz, "CFH", cfh);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            Object buf = createInstance("java.nio.HeapByteBuffer");
            byte[] hb = new byte[11];
            hb[0] = (byte) 80;
            hb[1] = (byte) 75;
            hb[2] = (byte) -127;
            hb[3] = (byte) -127;
            hb[4] = (byte) -127;
            hb[5] = (byte) -127;
            hb[6] = (byte) -127;
            hb[7] = (byte) -127;
            hb[8] = (byte) -127;
            hb[9] = (byte) -127;
            hb[10] = (byte) -127;
            setField(buf, "java.nio.ByteBuffer", "hb", hb);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
            
            Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
            Class intType = int.class;
            Method bufferContainsSignatureMethod = zipArchiveInputStreamClazz.getDeclaredMethod("bufferContainsSignature", byteArrayOutputStreamType, intType, intType, intType);
            bufferContainsSignatureMethod.setAccessible(true);
            java.lang.Object[] bufferContainsSignatureMethodArguments = new java.lang.Object[4];
            bufferContainsSignatureMethodArguments[0] = ((Object) null);
            bufferContainsSignatureMethodArguments[1] = 1;
            bufferContainsSignatureMethodArguments[2] = 5;
            bufferContainsSignatureMethodArguments[3] = -255;
            boolean actual = ((Boolean) bufferContainsSignatureMethod.invoke(zipArchiveInputStream, bufferContainsSignatureMethodArguments));
            
            assertFalse(actual);
        } finally {
            setStaticField(ZipArchiveInputStream.class, "DD", prevDD);
            setStaticField(ZipArchiveInputStream.class, "LFH", prevLFH);
            setStaticField(ZipArchiveInputStream.class, "CFH", prevCFH);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#bufferContainsSignature(java.io.ByteArrayOutputStream,int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; !done && i < lastRead - 4; i++)} twice
 * @utbot.returnsFrom {@code return done;}
 *  */
    @Test
    public void testBufferContainsSignature_I3OfBufArrayNotEquals3OfLFH() throws Exception  {
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        byte[] prevDD = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "DD"));
        byte[] prevLFH = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "LFH"));
        byte[] prevCFH = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "CFH"));
        try {
            byte[] dd = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            setStaticField(zipArchiveInputStreamClazz, "DD", dd);
            byte[] lfh = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            setStaticField(zipArchiveInputStreamClazz, "LFH", lfh);
            byte[] cfh = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            setStaticField(zipArchiveInputStreamClazz, "CFH", cfh);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            Object buf = createInstance("java.nio.HeapByteBuffer");
            byte[] hb = new byte[11];
            hb[0] = (byte) 80;
            hb[1] = (byte) 75;
            hb[2] = (byte) 3;
            hb[3] = (byte) -127;
            hb[4] = (byte) -127;
            hb[5] = (byte) -127;
            hb[6] = (byte) -127;
            hb[7] = (byte) -127;
            hb[8] = (byte) -127;
            hb[9] = (byte) -127;
            hb[10] = (byte) -127;
            setField(buf, "java.nio.ByteBuffer", "hb", hb);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
            
            Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
            Class intType = int.class;
            Method bufferContainsSignatureMethod = zipArchiveInputStreamClazz.getDeclaredMethod("bufferContainsSignature", byteArrayOutputStreamType, intType, intType, intType);
            bufferContainsSignatureMethod.setAccessible(true);
            java.lang.Object[] bufferContainsSignatureMethodArguments = new java.lang.Object[4];
            bufferContainsSignatureMethodArguments[0] = ((Object) null);
            bufferContainsSignatureMethodArguments[1] = -255;
            bufferContainsSignatureMethodArguments[2] = 5;
            bufferContainsSignatureMethodArguments[3] = -255;
            boolean actual = ((Boolean) bufferContainsSignatureMethod.invoke(zipArchiveInputStream, bufferContainsSignatureMethodArguments));
            
            assertFalse(actual);
        } finally {
            setStaticField(ZipArchiveInputStream.class, "DD", prevDD);
            setStaticField(ZipArchiveInputStream.class, "LFH", prevLFH);
            setStaticField(ZipArchiveInputStream.class, "CFH", prevCFH);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method bufferContainsSignature(java.io.ByteArrayOutputStream, int, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#bufferContainsSignature(java.io.ByteArrayOutputStream,int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; !done && i < lastRead - 4; i++)} once
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} when: buf.array()[i] == LFH[0] && buf.array()[i + 1] == LFH[1]
 *  */
    @Test
    public void testBufferContainsSignature_ThrowReadOnlyBufferException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object buf = createInstance("java.nio.DirectByteBufferR");
        byte[] hb = {(byte) -127};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(buf, "java.nio.ByteBuffer", "isReadOnly", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature] produces [java.nio.ReadOnlyBufferException]
            java.base/java.nio.ByteBuffer.array(ByteBuffer.java:1473)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(ZipArchiveInputStream.java:841) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
        Class intType = int.class;
        Method bufferContainsSignatureMethod = zipArchiveInputStreamClazz.getDeclaredMethod("bufferContainsSignature", byteArrayOutputStreamType, intType, intType, intType);
        bufferContainsSignatureMethod.setAccessible(true);
        java.lang.Object[] bufferContainsSignatureMethodArguments = new java.lang.Object[4];
        bufferContainsSignatureMethodArguments[0] = ((Object) null);
        bufferContainsSignatureMethodArguments[1] = -255;
        bufferContainsSignatureMethodArguments[2] = 5;
        bufferContainsSignatureMethodArguments[3] = -255;
        try {
            bufferContainsSignatureMethod.invoke(zipArchiveInputStream, bufferContainsSignatureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#bufferContainsSignature(java.io.ByteArrayOutputStream,int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; !done && i < lastRead - 4; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buf.array()[i] == LFH[0] && buf.array()[i + 1] == LFH[1]
 *  */
    @Test
    public void testBufferContainsSignature_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object buf = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {};
        setField(buf, "java.nio.ByteBuffer", "hb", hb);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(ZipArchiveInputStream.java:841) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
        Class intType = int.class;
        Method bufferContainsSignatureMethod = zipArchiveInputStreamClazz.getDeclaredMethod("bufferContainsSignature", byteArrayOutputStreamType, intType, intType, intType);
        bufferContainsSignatureMethod.setAccessible(true);
        java.lang.Object[] bufferContainsSignatureMethodArguments = new java.lang.Object[4];
        bufferContainsSignatureMethodArguments[0] = ((Object) null);
        bufferContainsSignatureMethodArguments[1] = 1;
        bufferContainsSignatureMethodArguments[2] = 5;
        bufferContainsSignatureMethodArguments[3] = -255;
        try {
            bufferContainsSignatureMethod.invoke(zipArchiveInputStream, bufferContainsSignatureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#bufferContainsSignature(java.io.ByteArrayOutputStream,int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; !done && i < lastRead - 4; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buf.array()[i] == LFH[0] && buf.array()[i + 1] == LFH[1]
 *  */
    @Test
    public void testBufferContainsSignature_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        byte[] prevLFH = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "LFH"));
        try {
            byte[] lfh = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            setStaticField(zipArchiveInputStreamClazz, "LFH", lfh);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            Object buf = createInstance("java.nio.HeapByteBufferR");
            byte[] hb = {(byte) 80};
            setField(buf, "java.nio.ByteBuffer", "hb", hb);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(ZipArchiveInputStream.java:841) */
            Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
            Class intType = int.class;
            Method bufferContainsSignatureMethod = zipArchiveInputStreamClazz.getDeclaredMethod("bufferContainsSignature", byteArrayOutputStreamType, intType, intType, intType);
            bufferContainsSignatureMethod.setAccessible(true);
            java.lang.Object[] bufferContainsSignatureMethodArguments = new java.lang.Object[4];
            bufferContainsSignatureMethodArguments[0] = ((Object) null);
            bufferContainsSignatureMethodArguments[1] = -255;
            bufferContainsSignatureMethodArguments[2] = 5;
            bufferContainsSignatureMethodArguments[3] = -255;
            try {
                bufferContainsSignatureMethod.invoke(zipArchiveInputStream, bufferContainsSignatureMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveInputStream.class, "LFH", prevLFH);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#bufferContainsSignature(java.io.ByteArrayOutputStream,int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; !done && i < lastRead - 4; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: (buf.array()[i + 2] == LFH[2] && buf.array()[i + 3] == LFH[3]) || (buf.array()[i] == CFH[2] && buf.array()[i + 3] == CFH[3])
 *  */
    @Test
    public void testBufferContainsSignature_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        byte[] prevLFH = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "LFH"));
        try {
            byte[] lfh = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            setStaticField(zipArchiveInputStreamClazz, "LFH", lfh);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            Object buf = createInstance("java.nio.DirectByteBufferR");
            byte[] hb = {(byte) 80, (byte) 75};
            setField(buf, "java.nio.ByteBuffer", "hb", hb);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(ZipArchiveInputStream.java:842) */
            Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
            Class intType = int.class;
            Method bufferContainsSignatureMethod = zipArchiveInputStreamClazz.getDeclaredMethod("bufferContainsSignature", byteArrayOutputStreamType, intType, intType, intType);
            bufferContainsSignatureMethod.setAccessible(true);
            java.lang.Object[] bufferContainsSignatureMethodArguments = new java.lang.Object[4];
            bufferContainsSignatureMethodArguments[0] = ((Object) null);
            bufferContainsSignatureMethodArguments[1] = -255;
            bufferContainsSignatureMethodArguments[2] = 5;
            bufferContainsSignatureMethodArguments[3] = -255;
            try {
                bufferContainsSignatureMethod.invoke(zipArchiveInputStream, bufferContainsSignatureMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveInputStream.class, "LFH", prevLFH);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#bufferContainsSignature(java.io.ByteArrayOutputStream,int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; !done && i < lastRead - 4; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: (buf.array()[i + 2] == LFH[2] && buf.array()[i + 3] == LFH[3]) || (buf.array()[i] == CFH[2] && buf.array()[i + 3] == CFH[3])
 *  */
    @Test
    public void testBufferContainsSignature_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        byte[] prevLFH = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "LFH"));
        try {
            byte[] lfh = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            setStaticField(zipArchiveInputStreamClazz, "LFH", lfh);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            Object buf = createInstance("java.nio.DirectByteBufferR");
            byte[] hb = {(byte) 80, (byte) 75, (byte) 3};
            setField(buf, "java.nio.ByteBuffer", "hb", hb);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(ZipArchiveInputStream.java:842) */
            Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
            Class intType = int.class;
            Method bufferContainsSignatureMethod = zipArchiveInputStreamClazz.getDeclaredMethod("bufferContainsSignature", byteArrayOutputStreamType, intType, intType, intType);
            bufferContainsSignatureMethod.setAccessible(true);
            java.lang.Object[] bufferContainsSignatureMethodArguments = new java.lang.Object[4];
            bufferContainsSignatureMethodArguments[0] = ((Object) null);
            bufferContainsSignatureMethodArguments[1] = -255;
            bufferContainsSignatureMethodArguments[2] = 5;
            bufferContainsSignatureMethodArguments[3] = -255;
            try {
                bufferContainsSignatureMethod.invoke(zipArchiveInputStream, bufferContainsSignatureMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveInputStream.class, "LFH", prevLFH);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#bufferContainsSignature(java.io.ByteArrayOutputStream,int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; !done && i < lastRead - 4; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pushback(buf.array(), offset + lastRead - readTooMuch, readTooMuch);
 *  */
    @Test
    public void testBufferContainsSignature_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        byte[] prevLFH = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "LFH"));
        try {
            byte[] lfh = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            setStaticField(zipArchiveInputStreamClazz, "LFH", lfh);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            PushbackInputStream in = ((PushbackInputStream) createInstance("java.io.PushbackInputStream"));
            byte[] buf = {(byte) 0};
            setField(in, "java.io.PushbackInputStream", "buf", buf);
            setField(in, "java.io.PushbackInputStream", "pos", 3);
            ZipArchiveInputStream in1 = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            setField(in, "java.io.FilterInputStream", "in", in1);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
            Object buf1 = createInstance("java.nio.HeapByteBufferR");
            setField(buf1, "java.nio.ByteBuffer", "hb", lfh);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf1);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for byte[4]]
                java.base/java.lang.System.arraycopy(Native Method)
                java.base/java.io.PushbackInputStream.unread(PushbackInputStream.java:232)
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.pushback(ZipArchiveInputStream.java:889)
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(ZipArchiveInputStream.java:858) */
            Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
            Class intType = int.class;
            Method bufferContainsSignatureMethod = zipArchiveInputStreamClazz.getDeclaredMethod("bufferContainsSignature", byteArrayOutputStreamType, intType, intType, intType);
            bufferContainsSignatureMethod.setAccessible(true);
            java.lang.Object[] bufferContainsSignatureMethodArguments = new java.lang.Object[4];
            bufferContainsSignatureMethodArguments[0] = ((Object) null);
            bufferContainsSignatureMethodArguments[1] = -3;
            bufferContainsSignatureMethodArguments[2] = 5;
            bufferContainsSignatureMethodArguments[3] = -1;
            try {
                bufferContainsSignatureMethod.invoke(zipArchiveInputStream, bufferContainsSignatureMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveInputStream.class, "LFH", prevLFH);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#bufferContainsSignature(java.io.ByteArrayOutputStream,int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; !done && i < lastRead - 4; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: buf.array()[i] == LFH[0] && buf.array()[i + 1] == LFH[1]
 *  */
    @Test
    public void testBufferContainsSignature_ThrowNullPointerException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(ZipArchiveInputStream.java:841) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
        Class intType = int.class;
        Method bufferContainsSignatureMethod = zipArchiveInputStreamClazz.getDeclaredMethod("bufferContainsSignature", byteArrayOutputStreamType, intType, intType, intType);
        bufferContainsSignatureMethod.setAccessible(true);
        java.lang.Object[] bufferContainsSignatureMethodArguments = new java.lang.Object[4];
        bufferContainsSignatureMethodArguments[0] = ((Object) null);
        bufferContainsSignatureMethodArguments[1] = -255;
        bufferContainsSignatureMethodArguments[2] = 5;
        bufferContainsSignatureMethodArguments[3] = -255;
        try {
            bufferContainsSignatureMethod.invoke(zipArchiveInputStream, bufferContainsSignatureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#bufferContainsSignature(java.io.ByteArrayOutputStream,int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; !done && i < lastRead - 4; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pushback(buf.array(), offset + lastRead - readTooMuch, readTooMuch);
 *  */
    @Test
    public void testBufferContainsSignature_ThrowNullPointerException_1() throws Throwable  {
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        byte[] prevLFH = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "LFH"));
        try {
            byte[] lfh = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            setStaticField(zipArchiveInputStreamClazz, "LFH", lfh);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            Object buf = createInstance("java.nio.DirectByteBufferR");
            byte[] hb = {
                (byte) 80, (byte) 75, (byte) 3, (byte) 4, (byte) -127, (byte) -127, (byte) -127, (byte) -127,
                (byte) -127, (byte) -127
            };
            setField(buf, "java.nio.ByteBuffer", "hb", hb);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.pushback(ZipArchiveInputStream.java:889)
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(ZipArchiveInputStream.java:858) */
            Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
            Class intType = int.class;
            Method bufferContainsSignatureMethod = zipArchiveInputStreamClazz.getDeclaredMethod("bufferContainsSignature", byteArrayOutputStreamType, intType, intType, intType);
            bufferContainsSignatureMethod.setAccessible(true);
            java.lang.Object[] bufferContainsSignatureMethodArguments = new java.lang.Object[4];
            bufferContainsSignatureMethodArguments[0] = ((Object) null);
            bufferContainsSignatureMethodArguments[1] = -255;
            bufferContainsSignatureMethodArguments[2] = 5;
            bufferContainsSignatureMethodArguments[3] = -255;
            try {
                bufferContainsSignatureMethod.invoke(zipArchiveInputStream, bufferContainsSignatureMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveInputStream.class, "LFH", prevLFH);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method bufferContainsSignature(java.io.ByteArrayOutputStream, int, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#bufferContainsSignature(java.io.ByteArrayOutputStream,int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; !done && i < lastRead - 4; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: pushback(buf.array(), offset + lastRead - readTooMuch, readTooMuch);
 *  */
    @Test(expected = IOException.class)
    public void testBufferContainsSignature_ThrowIOException() throws Throwable  {
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        byte[] prevLFH = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "LFH"));
        try {
            byte[] lfh = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            setStaticField(zipArchiveInputStreamClazz, "LFH", lfh);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            PushbackInputStream in = ((PushbackInputStream) createInstance("java.io.PushbackInputStream"));
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
            Object buf = createInstance("java.nio.DirectByteBufferR");
            byte[] hb = {
                (byte) 80, (byte) 75, (byte) 3, (byte) 4, (byte) -127, (byte) -127, (byte) -127, (byte) -127,
                (byte) -127
            };
            setField(buf, "java.nio.ByteBuffer", "hb", hb);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
            
            Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
            Class intType = int.class;
            Method bufferContainsSignatureMethod = zipArchiveInputStreamClazz.getDeclaredMethod("bufferContainsSignature", byteArrayOutputStreamType, intType, intType, intType);
            bufferContainsSignatureMethod.setAccessible(true);
            java.lang.Object[] bufferContainsSignatureMethodArguments = new java.lang.Object[4];
            bufferContainsSignatureMethodArguments[0] = ((Object) null);
            bufferContainsSignatureMethodArguments[1] = -255;
            bufferContainsSignatureMethodArguments[2] = 5;
            bufferContainsSignatureMethodArguments[3] = -255;
            try {
                bufferContainsSignatureMethod.invoke(zipArchiveInputStream, bufferContainsSignatureMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveInputStream.class, "LFH", prevLFH);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method bufferContainsSignature(java.io.ByteArrayOutputStream, int, int, int)
    
    @Test
    public void testBufferContainsSignature1() throws Throwable  {
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        byte[] prevLFH = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "LFH"));
        try {
            byte[] lfh = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            setStaticField(zipArchiveInputStreamClazz, "LFH", lfh);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            Object buf = createInstance("java.nio.HeapByteBuffer");
            byte[] hb = new byte[11];
            hb[0] = java.lang.Byte.MIN_VALUE;
            hb[1] = java.lang.Byte.MIN_VALUE;
            hb[2] = (byte) 80;
            hb[3] = (byte) 1;
            hb[4] = (byte) 1;
            hb[5] = (byte) 1;
            hb[6] = (byte) 1;
            hb[7] = (byte) 1;
            hb[8] = (byte) 1;
            hb[9] = (byte) 1;
            hb[10] = (byte) 1;
            setField(buf, "java.nio.ByteBuffer", "hb", hb);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
            DerOutputStream derOutputStream = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(ZipArchiveInputStream.java:841) */
            Class derOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
            Class intType = int.class;
            Method bufferContainsSignatureMethod = zipArchiveInputStreamClazz.getDeclaredMethod("bufferContainsSignature", derOutputStreamType, intType, intType, intType);
            bufferContainsSignatureMethod.setAccessible(true);
            java.lang.Object[] bufferContainsSignatureMethodArguments = new java.lang.Object[4];
            bufferContainsSignatureMethodArguments[0] = derOutputStream;
            bufferContainsSignatureMethodArguments[1] = 0;
            bufferContainsSignatureMethodArguments[2] = -2147483645;
            bufferContainsSignatureMethodArguments[3] = 0;
            try {
                bufferContainsSignatureMethod.invoke(zipArchiveInputStream, bufferContainsSignatureMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveInputStream.class, "LFH", prevLFH);
        }
    }
    
    @Test
    public void testBufferContainsSignature2() throws Throwable  {
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        byte[] prevLFH = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "LFH"));
        try {
            byte[] lfh = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            setStaticField(zipArchiveInputStreamClazz, "LFH", lfh);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            Object buf = createInstance("java.nio.HeapByteBuffer");
            byte[] hb = {
                (byte) 80, (byte) 80, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
                (byte) 1
            };
            setField(buf, "java.nio.ByteBuffer", "hb", hb);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(ZipArchiveInputStream.java:841) */
            Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
            Class intType = int.class;
            Method bufferContainsSignatureMethod = zipArchiveInputStreamClazz.getDeclaredMethod("bufferContainsSignature", byteArrayOutputStreamType, intType, intType, intType);
            bufferContainsSignatureMethod.setAccessible(true);
            java.lang.Object[] bufferContainsSignatureMethodArguments = new java.lang.Object[4];
            bufferContainsSignatureMethodArguments[0] = ((Object) null);
            bufferContainsSignatureMethodArguments[1] = 0;
            bufferContainsSignatureMethodArguments[2] = -2147483647;
            bufferContainsSignatureMethodArguments[3] = 0;
            try {
                bufferContainsSignatureMethod.invoke(zipArchiveInputStream, bufferContainsSignatureMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveInputStream.class, "LFH", prevLFH);
        }
    }
    
    @Test
    public void testBufferContainsSignature3() throws Throwable  {
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        byte[] prevLFH = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "LFH"));
        try {
            byte[] lfh = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            setStaticField(zipArchiveInputStreamClazz, "LFH", lfh);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            Object buf = createInstance("java.nio.HeapByteBuffer");
            byte[] hb = {
                java.lang.Byte.MIN_VALUE, (byte) 80, (byte) 75, (byte) 3, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
                (byte) 1
            };
            setField(buf, "java.nio.ByteBuffer", "hb", hb);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(ZipArchiveInputStream.java:841) */
            Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
            Class intType = int.class;
            Method bufferContainsSignatureMethod = zipArchiveInputStreamClazz.getDeclaredMethod("bufferContainsSignature", byteArrayOutputStreamType, intType, intType, intType);
            bufferContainsSignatureMethod.setAccessible(true);
            java.lang.Object[] bufferContainsSignatureMethodArguments = new java.lang.Object[4];
            bufferContainsSignatureMethodArguments[0] = ((Object) null);
            bufferContainsSignatureMethodArguments[1] = 0;
            bufferContainsSignatureMethodArguments[2] = -2147483647;
            bufferContainsSignatureMethodArguments[3] = 0;
            try {
                bufferContainsSignatureMethod.invoke(zipArchiveInputStream, bufferContainsSignatureMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveInputStream.class, "LFH", prevLFH);
        }
    }
    
    @Test
    public void testBufferContainsSignature4() throws Throwable  {
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        byte[] prevLFH = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "LFH"));
        byte[] prevCFH = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "CFH"));
        try {
            byte[] lfh = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            setStaticField(zipArchiveInputStreamClazz, "LFH", lfh);
            byte[] cfh = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            setStaticField(zipArchiveInputStreamClazz, "CFH", cfh);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            Object buf = createInstance("java.nio.DirectByteBuffer");
            byte[] hb = new byte[11];
            hb[0] = java.lang.Byte.MIN_VALUE;
            hb[1] = (byte) 80;
            hb[2] = (byte) 75;
            hb[3] = (byte) 1;
            hb[4] = (byte) 1;
            hb[5] = (byte) 1;
            hb[6] = (byte) 1;
            hb[7] = (byte) 1;
            hb[8] = (byte) 1;
            hb[9] = (byte) 1;
            hb[10] = (byte) 1;
            setField(buf, "java.nio.ByteBuffer", "hb", hb);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(ZipArchiveInputStream.java:841) */
            Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
            Class intType = int.class;
            Method bufferContainsSignatureMethod = zipArchiveInputStreamClazz.getDeclaredMethod("bufferContainsSignature", byteArrayOutputStreamType, intType, intType, intType);
            bufferContainsSignatureMethod.setAccessible(true);
            java.lang.Object[] bufferContainsSignatureMethodArguments = new java.lang.Object[4];
            bufferContainsSignatureMethodArguments[0] = ((Object) null);
            bufferContainsSignatureMethodArguments[1] = 0;
            bufferContainsSignatureMethodArguments[2] = -2147483647;
            bufferContainsSignatureMethodArguments[3] = 0;
            try {
                bufferContainsSignatureMethod.invoke(zipArchiveInputStream, bufferContainsSignatureMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveInputStream.class, "LFH", prevLFH);
            setStaticField(ZipArchiveInputStream.class, "CFH", prevCFH);
        }
    }
    
    @Test
    public void testBufferContainsSignature5() throws Throwable  {
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        byte[] prevDD = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "DD"));
        byte[] prevLFH = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "LFH"));
        byte[] prevCFH = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "CFH"));
        try {
            byte[] dd = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            setStaticField(zipArchiveInputStreamClazz, "DD", dd);
            byte[] lfh = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            setStaticField(zipArchiveInputStreamClazz, "LFH", lfh);
            byte[] cfh = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            setStaticField(zipArchiveInputStreamClazz, "CFH", cfh);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            Object buf = createInstance("java.nio.DirectByteBuffer");
            byte[] hb = {(byte) 80, (byte) 75, (byte) 7, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1};
            setField(buf, "java.nio.ByteBuffer", "hb", hb);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature] produces [java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8]
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(ZipArchiveInputStream.java:841) */
            Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
            Class intType = int.class;
            Method bufferContainsSignatureMethod = zipArchiveInputStreamClazz.getDeclaredMethod("bufferContainsSignature", byteArrayOutputStreamType, intType, intType, intType);
            bufferContainsSignatureMethod.setAccessible(true);
            java.lang.Object[] bufferContainsSignatureMethodArguments = new java.lang.Object[4];
            bufferContainsSignatureMethodArguments[0] = ((Object) null);
            bufferContainsSignatureMethodArguments[1] = 0;
            bufferContainsSignatureMethodArguments[2] = -2147483647;
            bufferContainsSignatureMethodArguments[3] = 0;
            try {
                bufferContainsSignatureMethod.invoke(zipArchiveInputStream, bufferContainsSignatureMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveInputStream.class, "DD", prevDD);
            setStaticField(ZipArchiveInputStream.class, "LFH", prevLFH);
            setStaticField(ZipArchiveInputStream.class, "CFH", prevCFH);
        }
    }
    
    @Test
    public void testBufferContainsSignature6() throws Throwable  {
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        byte[] prevDD = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "DD"));
        byte[] prevLFH = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "LFH"));
        byte[] prevCFH = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "CFH"));
        try {
            byte[] dd = {(byte) 80, (byte) 75, (byte) 7, (byte) 8};
            setStaticField(zipArchiveInputStreamClazz, "DD", dd);
            byte[] lfh = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            setStaticField(zipArchiveInputStreamClazz, "LFH", lfh);
            byte[] cfh = {(byte) 80, (byte) 75, (byte) 1, (byte) 2};
            setStaticField(zipArchiveInputStreamClazz, "CFH", cfh);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            Object buf = createInstance("java.nio.HeapByteBuffer");
            byte[] hb = new byte[11];
            hb[0] = (byte) 80;
            hb[1] = (byte) 75;
            hb[2] = (byte) 3;
            hb[3] = (byte) 1;
            hb[4] = (byte) 1;
            hb[5] = (byte) 1;
            hb[6] = (byte) 1;
            hb[7] = (byte) 1;
            hb[8] = (byte) 1;
            hb[9] = (byte) 1;
            hb[10] = (byte) 1;
            setField(buf, "java.nio.ByteBuffer", "hb", hb);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(ZipArchiveInputStream.java:841) */
            Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
            Class intType = int.class;
            Method bufferContainsSignatureMethod = zipArchiveInputStreamClazz.getDeclaredMethod("bufferContainsSignature", byteArrayOutputStreamType, intType, intType, intType);
            bufferContainsSignatureMethod.setAccessible(true);
            java.lang.Object[] bufferContainsSignatureMethodArguments = new java.lang.Object[4];
            bufferContainsSignatureMethodArguments[0] = ((Object) null);
            bufferContainsSignatureMethodArguments[1] = 0;
            bufferContainsSignatureMethodArguments[2] = -2147483647;
            bufferContainsSignatureMethodArguments[3] = 0;
            try {
                bufferContainsSignatureMethod.invoke(zipArchiveInputStream, bufferContainsSignatureMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveInputStream.class, "DD", prevDD);
            setStaticField(ZipArchiveInputStream.class, "LFH", prevLFH);
            setStaticField(ZipArchiveInputStream.class, "CFH", prevCFH);
        }
    }
    
    @Test
    public void testBufferContainsSignature7() throws Throwable  {
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        byte[] prevLFH = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "LFH"));
        try {
            byte[] lfh = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            setStaticField(zipArchiveInputStreamClazz, "LFH", lfh);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            Object buf = createInstance("java.nio.HeapByteBuffer");
            byte[] hb = new byte[13];
            hb[0] = java.lang.Byte.MIN_VALUE;
            hb[1] = (byte) 80;
            hb[2] = (byte) 75;
            hb[3] = (byte) 3;
            hb[4] = (byte) 4;
            hb[5] = (byte) 1;
            hb[6] = (byte) 1;
            hb[7] = (byte) 1;
            hb[8] = (byte) 1;
            hb[9] = (byte) 1;
            hb[10] = (byte) 1;
            hb[11] = (byte) 1;
            hb[12] = (byte) 1;
            setField(buf, "java.nio.ByteBuffer", "hb", hb);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.pushback(ZipArchiveInputStream.java:889)
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(ZipArchiveInputStream.java:858) */
            Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
            Class intType = int.class;
            Method bufferContainsSignatureMethod = zipArchiveInputStreamClazz.getDeclaredMethod("bufferContainsSignature", byteArrayOutputStreamType, intType, intType, intType);
            bufferContainsSignatureMethod.setAccessible(true);
            java.lang.Object[] bufferContainsSignatureMethodArguments = new java.lang.Object[4];
            bufferContainsSignatureMethodArguments[0] = ((Object) null);
            bufferContainsSignatureMethodArguments[1] = 0;
            bufferContainsSignatureMethodArguments[2] = -2147483647;
            bufferContainsSignatureMethodArguments[3] = 0;
            try {
                bufferContainsSignatureMethod.invoke(zipArchiveInputStream, bufferContainsSignatureMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveInputStream.class, "LFH", prevLFH);
        }
    }
    
    @Test
    public void testBufferContainsSignature8() throws Throwable  {
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        byte[] prevLFH = ((byte[]) getStaticFieldValue(zipArchiveInputStreamClazz, "LFH"));
        try {
            byte[] lfh = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            setStaticField(zipArchiveInputStreamClazz, "LFH", lfh);
            ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            PushbackInputStream in = ((PushbackInputStream) createInstance("java.io.PushbackInputStream"));
            ZipArchiveInputStream in1 = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
            setField(in, "java.io.FilterInputStream", "in", in1);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
            Object buf = createInstance("java.nio.DirectByteBufferR");
            byte[] hb = {
                (byte) 80, (byte) 75, (byte) 3, (byte) 4, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
                (byte) 1, (byte) 1
            };
            setField(buf, "java.nio.ByteBuffer", "hb", hb);
            setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
            DerOutputStream derOutputStream = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature] produces [java.lang.NullPointerException]
                java.base/java.lang.System.arraycopy(Native Method)
                java.base/java.io.PushbackInputStream.unread(PushbackInputStream.java:232)
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.pushback(ZipArchiveInputStream.java:889)
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(ZipArchiveInputStream.java:858) */
            Class derOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
            Class intType = int.class;
            Method bufferContainsSignatureMethod = zipArchiveInputStreamClazz.getDeclaredMethod("bufferContainsSignature", derOutputStreamType, intType, intType, intType);
            bufferContainsSignatureMethod.setAccessible(true);
            java.lang.Object[] bufferContainsSignatureMethodArguments = new java.lang.Object[4];
            bufferContainsSignatureMethodArguments[0] = derOutputStream;
            bufferContainsSignatureMethodArguments[1] = -2146287328;
            bufferContainsSignatureMethodArguments[2] = Integer.MIN_VALUE;
            bufferContainsSignatureMethodArguments[3] = Integer.MAX_VALUE;
            try {
                bufferContainsSignatureMethod.invoke(zipArchiveInputStream, bufferContainsSignatureMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveInputStream.class, "LFH", prevLFH);
        }
    }
    ///endregion
    
    ///region Errors report for bufferContainsSignature
    
    public void testBufferContainsSignature_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Concrete execution failed
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.currentEntryHasOutstandingBytes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method currentEntryHasOutstandingBytes()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#currentEntryHasOutstandingBytes()}
 * @utbot.returnsFrom {@code return current.bytesReadFromStream <= current.entry.getCompressedSize() && !current.hasDataDescriptor;}
 *  */
    @Test
    public void testCurrentEntryHasOutstandingBytes_CurrentBytesReadFromStreamGreaterThanCurrentEntryGetCompressedSizeAndNotCurrentHasDataDescriptor() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        setField(entry, "java.util.zip.ZipEntry", "csize", java.lang.Long.MIN_VALUE);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", -255L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method currentEntryHasOutstandingBytesMethod = zipArchiveInputStreamClazz.getDeclaredMethod("currentEntryHasOutstandingBytes");
        currentEntryHasOutstandingBytesMethod.setAccessible(true);
        java.lang.Object[] currentEntryHasOutstandingBytesMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) currentEntryHasOutstandingBytesMethod.invoke(zipArchiveInputStream, currentEntryHasOutstandingBytesMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#currentEntryHasOutstandingBytes()}
 * @utbot.executesCondition {@code (!current.hasDataDescriptor): False}
 * @utbot.returnsFrom {@code return current.bytesReadFromStream <= current.entry.getCompressedSize() && !current.hasDataDescriptor;}
 *  */
    @Test
    public void testCurrentEntryHasOutstandingBytes_CurrentHasDataDescriptor() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        setField(entry, "java.util.zip.ZipEntry", "csize", -205L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "hasDataDescriptor", true);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", -205L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method currentEntryHasOutstandingBytesMethod = zipArchiveInputStreamClazz.getDeclaredMethod("currentEntryHasOutstandingBytes");
        currentEntryHasOutstandingBytesMethod.setAccessible(true);
        java.lang.Object[] currentEntryHasOutstandingBytesMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) currentEntryHasOutstandingBytesMethod.invoke(zipArchiveInputStream, currentEntryHasOutstandingBytesMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#currentEntryHasOutstandingBytes()}
 * @utbot.executesCondition {@code (!current.hasDataDescriptor): True}
 * @utbot.returnsFrom {@code return current.bytesReadFromStream <= current.entry.getCompressedSize() && !current.hasDataDescriptor;}
 *  */
    @Test
    public void testCurrentEntryHasOutstandingBytes_NotCurrentHasDataDescriptor() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        setField(entry, "java.util.zip.ZipEntry", "csize", -119L);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "entry", entry);
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", -119L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method currentEntryHasOutstandingBytesMethod = zipArchiveInputStreamClazz.getDeclaredMethod("currentEntryHasOutstandingBytes");
        currentEntryHasOutstandingBytesMethod.setAccessible(true);
        java.lang.Object[] currentEntryHasOutstandingBytesMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) currentEntryHasOutstandingBytesMethod.invoke(zipArchiveInputStream, currentEntryHasOutstandingBytesMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method currentEntryHasOutstandingBytes()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#currentEntryHasOutstandingBytes()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry#access$700(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry#access$100(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return current.bytesReadFromStream <= current.entry.getCompressedSize() && !current.hasDataDescriptor;
 *  */
    @Test
    public void testCurrentEntryHasOutstandingBytes_ThrowNullPointerException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object current = createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry");
        setField(current, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry", "bytesReadFromStream", -255L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.currentEntryHasOutstandingBytes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.currentEntryHasOutstandingBytes(ZipArchiveInputStream.java:661) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method currentEntryHasOutstandingBytesMethod = zipArchiveInputStreamClazz.getDeclaredMethod("currentEntryHasOutstandingBytes");
        currentEntryHasOutstandingBytesMethod.setAccessible(true);
        java.lang.Object[] currentEntryHasOutstandingBytesMethodArguments = new java.lang.Object[0];
        try {
            currentEntryHasOutstandingBytesMethod.invoke(zipArchiveInputStream, currentEntryHasOutstandingBytesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields976546637926600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields976546637926600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass976546637932600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields976546637926600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass976546637932600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields976546641004300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields976546641004300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass976546641005600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields976546641004300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass976546641005600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields976546641223800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields976546641223800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass976546641224500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields976546641223800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass976546641224500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields976546641478200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields976546641478200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass976546641479600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields976546641478200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass976546641479600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


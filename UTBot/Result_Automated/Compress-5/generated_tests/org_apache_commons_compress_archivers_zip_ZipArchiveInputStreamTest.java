package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import java.util.zip.InflaterInputStream;
import java.lang.reflect.Method;
import java.util.jar.JarInputStream;
import java.util.jar.JarEntry;
import sun.security.util.ManifestEntryVerifier;
import java.util.ArrayList;
import sun.net.www.http.PosterOutputStream;
import java.io.ByteArrayOutputStream;
import java.util.Properties;
import java.util.LinkedHashMap;
import java.security.cert.Certificate;
import java.security.CodeSigner;
import java.io.InputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.Hashtable;
import java.util.zip.Inflater;
import java.io.FileInputStream;
import java.util.zip.CRC32;
import sun.security.provider.Sun;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.io.EOFException;
import java.lang.reflect.InvocationTargetException;
import java.io.PushbackInputStream;
import java.io.FilterInputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import java.util.zip.CheckedInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method matches([B, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (length < ZipArchiveOutputStream.LFH_SIG.length): False}
    /// invoke:
    ///     org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#checksig(byte[],byte[]) once
    /// return from: {@code return checksig(signature, ZipArchiveOutputStream.LFH_SIG) || checksig(signature, ZipArchiveOutputStream.EOCD_SIG);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#matches(byte[],int)}
 * @utbot.returnsFrom {@code return checksig(signature, ZipArchiveOutputStream.LFH_SIG) || checksig(signature, ZipArchiveOutputStream.EOCD_SIG);}
 *  */
    @Test
    public void testMatches_ReturnChecksigOrChecksig_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
 * @utbot.returnsFrom {@code return checksig(signature, ZipArchiveOutputStream.LFH_SIG) || checksig(signature, ZipArchiveOutputStream.EOCD_SIG);}
 *  */
    @Test
    public void testMatches_ReturnChecksigOrChecksig() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        byte[] prevLFH_SIG = ZipArchiveOutputStream.LFH_SIG;
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            byte[] lfhSig = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            setStaticField(zipArchiveOutputStreamClazz, "LFH_SIG", lfhSig);
            byte[] byteArray = {(byte) -127, (byte) -127};
            
            boolean actual = ZipArchiveInputStream.matches(byteArray, 4);
            
            assertFalse(actual);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
            setStaticField(ZipArchiveOutputStream.class, "LFH_SIG", prevLFH_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#matches(byte[],int)}
 * @utbot.returnsFrom {@code return checksig(signature, ZipArchiveOutputStream.LFH_SIG) || checksig(signature, ZipArchiveOutputStream.EOCD_SIG);}
 *  */
    @Test
    public void testMatches_ReturnChecksigOrChecksig_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        byte[] prevLFH_SIG = ZipArchiveOutputStream.LFH_SIG;
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            byte[] lfhSig = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            setStaticField(zipArchiveOutputStreamClazz, "LFH_SIG", lfhSig);
            byte[] byteArray = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            
            boolean actual = ZipArchiveInputStream.matches(byteArray, 4);
            
            assertTrue(actual);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
            setStaticField(ZipArchiveOutputStream.class, "LFH_SIG", prevLFH_SIG);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matches([B, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#matches(byte[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return checksig(signature, ZipArchiveOutputStream.LFH_SIG) || checksig(signature, ZipArchiveOutputStream.EOCD_SIG);
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
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(ZipArchiveInputStream.java:287)
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(ZipArchiveInputStream.java:281) */
            ZipArchiveInputStream.matches(byteArray, 4);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "LFH_SIG", prevLFH_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#matches(byte[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return checksig(signature, ZipArchiveOutputStream.LFH_SIG) || checksig(signature, ZipArchiveOutputStream.EOCD_SIG);
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
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(ZipArchiveInputStream.java:287)
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(ZipArchiveInputStream.java:281) */
            ZipArchiveInputStream.matches(byteArray, 4);
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "LFH_SIG", prevLFH_SIG);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#matches(byte[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return checksig(signature, ZipArchiveOutputStream.LFH_SIG) || checksig(signature, ZipArchiveOutputStream.EOCD_SIG);
 *  */
    @Test
    public void testMatches_ThrowNullPointerException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevLFH_SIG = ZipArchiveOutputStream.LFH_SIG;
        try {
            byte[] lfhSig = {(byte) 80, (byte) 75, (byte) 3, (byte) 4};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "LFH_SIG", lfhSig);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(ZipArchiveInputStream.java:287)
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(ZipArchiveInputStream.java:281) */
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
 *  */
    @Test
    public void testFill() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] buf = {};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", -255);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method fillMethod = zipArchiveInputStreamClazz.getDeclaredMethod("fill");
        fillMethod.setAccessible(true);
        java.lang.Object[] fillMethodArguments = new java.lang.Object[0];
        fillMethod.invoke(zipArchiveInputStream, fillMethodArguments);
        
        int finalZipArchiveInputStreamLengthOfLastRead = ((Integer) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead"));
        
        assertEquals(0, finalZipArchiveInputStreamLengthOfLastRead);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#fill()}
 *  */
    @Test
    public void testFill_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] buf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method fillMethod = zipArchiveInputStreamClazz.getDeclaredMethod("fill");
        fillMethod.setAccessible(true);
        java.lang.Object[] fillMethodArguments = new java.lang.Object[0];
        fillMethod.invoke(zipArchiveInputStream, fillMethodArguments);
        
        int finalZipArchiveInputStreamLengthOfLastRead = ((Integer) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead"));
        
        assertEquals(-1, finalZipArchiveInputStreamLengthOfLastRead);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#fill()}
 *  */
    @Test
    public void testFill_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] buf = {};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method fillMethod = zipArchiveInputStreamClazz.getDeclaredMethod("fill");
        fillMethod.setAccessible(true);
        java.lang.Object[] fillMethodArguments = new java.lang.Object[0];
        fillMethod.invoke(zipArchiveInputStream, fillMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#fill()}
 *  */
    @Test
    public void testFill_3() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] buf = {};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method fillMethod = zipArchiveInputStreamClazz.getDeclaredMethod("fill");
        fillMethod.setAccessible(true);
        java.lang.Object[] fillMethodArguments = new java.lang.Object[0];
        fillMethod.invoke(zipArchiveInputStream, fillMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#fill()}
 *  */
    @Test
    public void testFill_4() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] buf = {};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method fillMethod = zipArchiveInputStreamClazz.getDeclaredMethod("fill");
        fillMethod.setAccessible(true);
        java.lang.Object[] fillMethodArguments = new java.lang.Object[0];
        fillMethod.invoke(zipArchiveInputStream, fillMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#fill()}
 *  */
    @Test
    public void testFill_5() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        PosterOutputStream baos = ((PosterOutputStream) createInstance("sun.net.www.http.PosterOutputStream"));
        setField(baos, "sun.net.www.http.PosterOutputStream", "closed", true);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] buf = {};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method fillMethod = zipArchiveInputStreamClazz.getDeclaredMethod("fill");
        fillMethod.setAccessible(true);
        java.lang.Object[] fillMethodArguments = new java.lang.Object[0];
        fillMethod.invoke(zipArchiveInputStream, fillMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#fill()}
 *  */
    @Test
    public void testFill_6() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        ByteArrayOutputStream baos = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {};
        setField(baos, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] buf1 = {};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf1);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method fillMethod = zipArchiveInputStreamClazz.getDeclaredMethod("fill");
        fillMethod.setAccessible(true);
        java.lang.Object[] fillMethodArguments = new java.lang.Object[0];
        fillMethod.invoke(zipArchiveInputStream, fillMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#fill()}
 *  */
    @Test
    public void testFill_7() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] buf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method fillMethod = zipArchiveInputStreamClazz.getDeclaredMethod("fill");
        fillMethod.setAccessible(true);
        java.lang.Object[] fillMethodArguments = new java.lang.Object[0];
        fillMethod.invoke(zipArchiveInputStream, fillMethodArguments);
        
        int finalZipArchiveInputStreamLengthOfLastRead = ((Integer) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead"));
        
        assertEquals(-1, finalZipArchiveInputStreamLengthOfLastRead);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#fill()}
 *  */
    @Test
    public void testFill_8() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
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
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] buf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method fillMethod = zipArchiveInputStreamClazz.getDeclaredMethod("fill");
        fillMethod.setAccessible(true);
        java.lang.Object[] fillMethodArguments = new java.lang.Object[0];
        fillMethod.invoke(zipArchiveInputStream, fillMethodArguments);
        
        int finalZipArchiveInputStreamLengthOfLastRead = ((Integer) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead"));
        
        assertEquals(-1, finalZipArchiveInputStreamLengthOfLastRead);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#fill()}
 *  */
    @Test
    public void testFill_9() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
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
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        java.security.cert.Certificate[] certs = {null};
        setField(entry, "java.util.jar.JarEntry", "certs", certs);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        java.security.CodeSigner[] signers = {};
        setField(mev, "sun.security.util.ManifestEntryVerifier", "signers", signers);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] buf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        InputStream zipArchiveInputStreamIn = ((InputStream) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in"));
        ManifestEntryVerifier zipArchiveInputStreamInInMev = ((ManifestEntryVerifier) getFieldValue(zipArchiveInputStreamIn, "java.util.jar.JarInputStream", "mev"));
        JarEntry zipArchiveInputStreamInInMevInMevEntry = ((JarEntry) getFieldValue(zipArchiveInputStreamInInMev, "sun.security.util.ManifestEntryVerifier", "entry"));
        java.security.cert.Certificate[] initialZipArchiveInputStreamInMevEntryCerts = ((java.security.cert.Certificate[]) getFieldValue(zipArchiveInputStreamInInMevInMevEntry, "java.util.jar.JarEntry", "certs"));
        InputStream zipArchiveInputStreamIn1 = ((InputStream) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in"));
        ManifestEntryVerifier zipArchiveInputStreamIn1InMev = ((ManifestEntryVerifier) getFieldValue(zipArchiveInputStreamIn1, "java.util.jar.JarInputStream", "mev"));
        JarEntry zipArchiveInputStreamIn1InMevInMevEntry = ((JarEntry) getFieldValue(zipArchiveInputStreamIn1InMev, "sun.security.util.ManifestEntryVerifier", "entry"));
        java.security.CodeSigner[] initialZipArchiveInputStreamInMevEntrySigners = ((java.security.CodeSigner[]) getFieldValue(zipArchiveInputStreamIn1InMevInMevEntry, "java.util.jar.JarEntry", "signers"));
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Method fillMethod = zipArchiveInputStreamClazz.getDeclaredMethod("fill");
        fillMethod.setAccessible(true);
        java.lang.Object[] fillMethodArguments = new java.lang.Object[0];
        fillMethod.invoke(zipArchiveInputStream, fillMethodArguments);
        
        InputStream zipArchiveInputStreamIn2 = ((InputStream) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in"));
        ManifestEntryVerifier zipArchiveInputStreamIn2InMev = ((ManifestEntryVerifier) getFieldValue(zipArchiveInputStreamIn2, "java.util.jar.JarInputStream", "mev"));
        JarEntry zipArchiveInputStreamIn2InMevInMevEntry = ((JarEntry) getFieldValue(zipArchiveInputStreamIn2InMev, "sun.security.util.ManifestEntryVerifier", "entry"));
        java.security.cert.Certificate[] finalZipArchiveInputStreamInMevEntryCerts = ((java.security.cert.Certificate[]) getFieldValue(zipArchiveInputStreamIn2InMevInMevEntry, "java.util.jar.JarEntry", "certs"));
        InputStream zipArchiveInputStreamIn3 = ((InputStream) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in"));
        ManifestEntryVerifier zipArchiveInputStreamIn3InMev = ((ManifestEntryVerifier) getFieldValue(zipArchiveInputStreamIn3, "java.util.jar.JarInputStream", "mev"));
        JarEntry zipArchiveInputStreamIn3InMevInMevEntry = ((JarEntry) getFieldValue(zipArchiveInputStreamIn3InMev, "sun.security.util.ManifestEntryVerifier", "entry"));
        java.security.CodeSigner[] finalZipArchiveInputStreamInMevEntrySigners = ((java.security.CodeSigner[]) getFieldValue(zipArchiveInputStreamIn3InMevInMevEntry, "java.util.jar.JarEntry", "signers"));
        int finalZipArchiveInputStreamLengthOfLastRead = ((Integer) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead"));
        
        assertFalse(initialZipArchiveInputStreamInMevEntryCerts == finalZipArchiveInputStreamInMevEntryCerts);
        
        assertFalse(initialZipArchiveInputStreamInMevEntrySigners == finalZipArchiveInputStreamInMevEntrySigners);
        
        assertEquals(-1, finalZipArchiveInputStreamLengthOfLastRead);
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
 * @utbot.throwsException {@link java.io.IOException} when: (lengthOfLastRead = in.read(buf)) > 0
 *  */
    @Test(expected = IOException.class)
    public void testFill_ThrowIOException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] buf = {(byte) -127};
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
 * @utbot.executesCondition {@code (lengthOfLastRead): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testFill_ThrowIOException_3() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object in = createInstance("java.lang.Process$PipeInputStream");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] buf = {(byte) -127};
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
 * @utbot.throwsException {@link java.util.zip.ZipException} when: (lengthOfLastRead = in.read(buf)) > 0
 *  */
    @Test(expected = ZipException.class)
    public void testFill_ThrowZipException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] buf = {(byte) -127};
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
 * @utbot.throwsException {@link java.io.IOException} when: (lengthOfLastRead = in.read(buf)) > 0
 *  */
    @Test(expected = IOException.class)
    public void testFill_ThrowIOException_2() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 1L);
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] buf = {(byte) -127};
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
 * @utbot.throwsException {@link java.util.zip.ZipException} when: (lengthOfLastRead = in.read(buf)) > 0
 *  */
    @Test(expected = ZipException.class)
    public void testFill_ThrowZipException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 1L);
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in1, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in1, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in1, "java.util.jar.JarInputStream", "mev", mev);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] buf = {(byte) -127, (byte) -127};
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method fill()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#fill()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testFill_ThrowIndexOutOfBoundsException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        PosterOutputStream baos = ((PosterOutputStream) createInstance("sun.net.www.http.PosterOutputStream"));
        byte[] buf = {};
        setField(baos, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(baos, "java.io.ByteArrayOutputStream", "count", -1);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
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
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} 
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testFill_ThrowOutOfMemoryError() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        ByteArrayOutputStream baos = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[33];
        setField(baos, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(baos, "java.io.ByteArrayOutputStream", "count", -2147483647);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] buf1 = {};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf1);
        
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
 * @utbot.throwsException {@link java.lang.SecurityException} when: (lengthOfLastRead = in.read(buf)) > 0
 *  */
    @Test(expected = SecurityException.class)
    public void testFill_ThrowSecurityException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
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
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] buf = {(byte) -127};
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
 * @utbot.invokes {@link java.io.InputStream#read(byte[])}
 * @utbot.throwsException {@link java.lang.ArithmeticException} 
 *  */
    @Test
    public void testFill_ThrowArithmeticException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
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
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] buf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.fill] produces [java.lang.ArithmeticException: / by zero] */
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
 * @utbot.invokes {@link java.io.InputStream#read(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (lengthOfLastRead = in.read(buf)) > 0
 *  */
    @Test
    public void testFill_ThrowNullPointerException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.fill] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.fill(ZipArchiveInputStream.java:332) */
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
        // 4 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
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
 * @utbot.executesCondition {@code (inf.finished()): False}
 *  */
    @Test
    public void testRead_NotInfFinished() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "finished", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        
        int actual = zipArchiveInputStream.read(null, -255, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (inf.finished()): True}
 * @utbot.executesCondition {@code (current == null): False}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): True}
 * @utbot.executesCondition {@code (readBytesOfEntry >= csize): True}
 *  */
    @Test
    public void testRead_ReadBytesOfEntryGreaterOrEqualCsize() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(4294967073L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", -223);
        byte[] byteArray = {};
        
        int actual = zipArchiveInputStream.read(byteArray, 0, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (inf.finished()): True}
 * @utbot.executesCondition {@code (current == null): True}
 *  */
    @Test
    public void testRead_CurrentEqualsNull() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        
        int actual = zipArchiveInputStream.read(null, -255, -255);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (inf.finished()): True}
 * @utbot.executesCondition {@code (current == null): False}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): True}
 * @utbot.executesCondition {@code (readBytesOfEntry >= csize): False}
 * @utbot.executesCondition {@code (offsetInBuffer >= lengthOfLastRead): True}
 * @utbot.executesCondition {@code (lengthOfLastRead): True}
 * @utbot.invokes {@link java.io.InputStream#read(byte[])}
 *  */
    @Test
    public void testRead_LengthOfLastRead() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        FileInputStream in = ((FileInputStream) createInstance("java.io.FileInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(64L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", 63);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", -255);
        byte[] byteArray = {};
        
        int actual = zipArchiveInputStream.read(byteArray, 0, 0);
        
        assertEquals(-1, actual);
        
        int finalZipArchiveInputStreamOffsetInBuffer = ((Integer) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer"));
        int finalZipArchiveInputStreamLengthOfLastRead = ((Integer) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead"));
        
        assertEquals(0, finalZipArchiveInputStreamOffsetInBuffer);
        
        assertEquals(-1, finalZipArchiveInputStreamLengthOfLastRead);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (inf.finished()): True}
 * @utbot.executesCondition {@code (current == null): False}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): True}
 * @utbot.executesCondition {@code (readBytesOfEntry >= csize): False}
 * @utbot.executesCondition {@code (offsetInBuffer >= lengthOfLastRead): False}
 * @utbot.executesCondition {@code (length > lengthOfLastRead): False}
 * @utbot.executesCondition {@code ((csize - readBytesOfEntry) < toRead): True}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.invokes {@link java.util.zip.CRC32#update(byte[],int,int)}
 * @utbot.returnsFrom {@code return toRead;}
 *  */
    @Test
    public void testRead_CsizeMinusReadBytesOfEntryLessThanToRead() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(crc, "java.util.zip.CRC32", "crc", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "crc", crc);
        byte[] buf = {(byte) 0, (byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(1L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", 1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", 1073741824);
        byte[] byteArray = new byte[32];
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
        
        int actual = zipArchiveInputStream.read(byteArray, 2, 15);
        
        assertEquals(1, actual);
        
        CRC32 zipArchiveInputStreamCrc = ((CRC32) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "crc"));
        int finalZipArchiveInputStreamCrcCrc = ((Integer) getFieldValue(zipArchiveInputStreamCrc, "java.util.zip.CRC32", "crc"));
        int finalZipArchiveInputStreamReadBytesOfEntry = ((Integer) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry"));
        int finalZipArchiveInputStreamOffsetInBuffer = ((Integer) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer"));
        
        byte finalByteArray2 = byteArray[2];
        
        assertEquals(0, finalZipArchiveInputStreamCrcCrc);
        
        assertEquals(1, finalZipArchiveInputStreamReadBytesOfEntry);
        
        assertEquals(2, finalZipArchiveInputStreamOffsetInBuffer);
        
        assertEquals((byte) 0, finalByteArray2);
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
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (closed): False}
 * @utbot.executesCondition {@code (inf.finished()): True}
 * @utbot.executesCondition {@code (current == null): False}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): True}
 * @utbot.executesCondition {@code (readBytesOfEntry >= csize): False}
 * @utbot.executesCondition {@code (offsetInBuffer >= lengthOfLastRead): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getSize()}
 * @utbot.invokes {@link java.io.InputStream#read(byte[])}
 * @utbot.throwsException {@link java.io.IOException} when: (lengthOfLastRead = in.read(buf)) == -1
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(128L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", 127);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", -255);
        byte[] byteArray = {};
        
        zipArchiveInputStream.read(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (closed): False}
 * @utbot.executesCondition {@code (inf.finished()): True}
 * @utbot.executesCondition {@code (current == null): False}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): False}
 * @utbot.executesCondition {@code (inf.needsInput()): True}
 * @utbot.throwsException {@link java.io.IOException} in: fill();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "inputPos", -255);
        setField(inf, "java.util.zip.Inflater", "inputLim", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setMethod(1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        byte[] byteArray = {};
        
        zipArchiveInputStream.read(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (closed): False}
 * @utbot.executesCondition {@code (inf.finished()): True}
 * @utbot.executesCondition {@code (current == null): False}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): False}
 * @utbot.executesCondition {@code (inf.needsInput()): True}
 * @utbot.throwsException {@link java.io.IOException} in: fill();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_3() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "inputPos", -255);
        setField(inf, "java.util.zip.Inflater", "inputLim", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setMethod(1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        byte[] byteArray = {};
        
        zipArchiveInputStream.read(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (closed): False}
 * @utbot.executesCondition {@code (inf.finished()): True}
 * @utbot.executesCondition {@code (current == null): False}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): False}
 * @utbot.executesCondition {@code (inf.needsInput()): True}
 * @utbot.throwsException {@link java.io.IOException} in: fill();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_4() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 1L);
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(inf, "java.util.zip.Inflater", "inputPos", -255);
        setField(inf, "java.util.zip.Inflater", "inputLim", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0, (byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setMethod(2);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        byte[] byteArray = {};
        
        zipArchiveInputStream.read(byteArray, 0, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: throw new ArrayIndexOutOfBoundsException();
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        zipArchiveInputStream.read(byteArray, 2, -1);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (start <= buffer.length): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: throw new ArrayIndexOutOfBoundsException();
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        byte[] byteArray = {};
        
        zipArchiveInputStream.read(byteArray, 1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: throw new ArrayIndexOutOfBoundsException();
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        byte[] byteArray = {};
        
        zipArchiveInputStream.read(byteArray, -1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: throw new ArrayIndexOutOfBoundsException();
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        zipArchiveInputStream.read(byteArray, 0, 3);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): True}
 * @utbot.executesCondition {@code (readBytesOfEntry >= csize): False}
 * @utbot.executesCondition {@code (offsetInBuffer >= lengthOfLastRead): False}
 * @utbot.executesCondition {@code (length > lengthOfLastRead): False}
 * @utbot.executesCondition {@code ((csize - readBytesOfEntry) < toRead): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: System.arraycopy(buf, offsetInBuffer, buffer, start, toRead);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(2147483526L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", -134);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", -1);
        byte[] byteArray = {};
        
        zipArchiveInputStream.read(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): True}
 * @utbot.executesCondition {@code (readBytesOfEntry >= csize): False}
 * @utbot.executesCondition {@code (offsetInBuffer >= lengthOfLastRead): False}
 * @utbot.executesCondition {@code (length > lengthOfLastRead): False}
 * @utbot.executesCondition {@code ((csize - readBytesOfEntry) < toRead): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: System.arraycopy(buf, offsetInBuffer, buffer, start, toRead);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(1073741962L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", 218);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", -1);
        byte[] byteArray = {};
        
        zipArchiveInputStream.read(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): True}
 * @utbot.executesCondition {@code (readBytesOfEntry >= csize): False}
 * @utbot.executesCondition {@code (offsetInBuffer >= lengthOfLastRead): False}
 * @utbot.executesCondition {@code (length > lengthOfLastRead): True}
 * @utbot.executesCondition {@code ((csize - readBytesOfEntry) < toRead): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: System.arraycopy(buf, offsetInBuffer, buffer, start, toRead);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(128L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", 127);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", -127);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", -126);
        byte[] byteArray = {};
        
        zipArchiveInputStream.read(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): True}
 * @utbot.executesCondition {@code (readBytesOfEntry >= csize): False}
 * @utbot.executesCondition {@code (offsetInBuffer >= lengthOfLastRead): False}
 * @utbot.executesCondition {@code (length > lengthOfLastRead): False}
 * @utbot.executesCondition {@code ((csize - readBytesOfEntry) < toRead): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: System.arraycopy(buf, offsetInBuffer, buffer, start, toRead);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_3() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(7L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", -2147483644);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", 1);
        byte[] byteArray = {};
        
        zipArchiveInputStream.read(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): True}
 * @utbot.executesCondition {@code (readBytesOfEntry >= csize): False}
 * @utbot.executesCondition {@code (offsetInBuffer >= lengthOfLastRead): True}
 * @utbot.executesCondition {@code (lengthOfLastRead): False}
 * @utbot.executesCondition {@code (length > lengthOfLastRead): False}
 * @utbot.executesCondition {@code ((csize - readBytesOfEntry) < toRead): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: System.arraycopy(buf, offsetInBuffer, buffer, start, toRead);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_4() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        FileInputStream in = ((FileInputStream) createInstance("java.io.FileInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(1L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "bytesReadFromStream", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", -255);
        byte[] byteArray = new byte[16];
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
        
        zipArchiveInputStream.read(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): True}
 * @utbot.executesCondition {@code (readBytesOfEntry >= csize): False}
 * @utbot.executesCondition {@code (offsetInBuffer >= lengthOfLastRead): True}
 * @utbot.executesCondition {@code (lengthOfLastRead): False}
 * @utbot.executesCondition {@code (length > lengthOfLastRead): False}
 * @utbot.executesCondition {@code ((csize - readBytesOfEntry) < toRead): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: System.arraycopy(buf, offsetInBuffer, buffer, start, toRead);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_5() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        FileInputStream in = ((FileInputStream) createInstance("java.io.FileInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(0L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", -1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "bytesReadFromStream", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", -255);
        byte[] byteArray = new byte[28];
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
        
        zipArchiveInputStream.read(byteArray, 3, 18);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): True}
 * @utbot.executesCondition {@code (readBytesOfEntry >= csize): False}
 * @utbot.executesCondition {@code (offsetInBuffer >= lengthOfLastRead): True}
 * @utbot.executesCondition {@code (lengthOfLastRead): False}
 * @utbot.executesCondition {@code (length > lengthOfLastRead): False}
 * @utbot.executesCondition {@code ((csize - readBytesOfEntry) < toRead): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: System.arraycopy(buf, offsetInBuffer, buffer, start, toRead);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_6() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(2147483616L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", -35);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", -255);
        byte[] byteArray = {};
        
        zipArchiveInputStream.read(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): True}
 * @utbot.executesCondition {@code (readBytesOfEntry >= csize): False}
 * @utbot.executesCondition {@code (offsetInBuffer >= lengthOfLastRead): True}
 * @utbot.executesCondition {@code (lengthOfLastRead): False}
 * @utbot.executesCondition {@code (length > lengthOfLastRead): True}
 * @utbot.executesCondition {@code ((csize - readBytesOfEntry) < toRead): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: System.arraycopy(buf, offsetInBuffer, buffer, start, toRead);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_7() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        FileInputStream in = ((FileInputStream) createInstance("java.io.FileInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(1073741824L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", 2);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "bytesReadFromStream", -248);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", -255);
        byte[] byteArray = {};
        
        zipArchiveInputStream.read(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): True}
 * @utbot.executesCondition {@code (readBytesOfEntry >= csize): False}
 * @utbot.executesCondition {@code (offsetInBuffer >= lengthOfLastRead): True}
 * @utbot.executesCondition {@code (lengthOfLastRead): False}
 * @utbot.executesCondition {@code (length > lengthOfLastRead): True}
 * @utbot.executesCondition {@code ((csize - readBytesOfEntry) < toRead): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: System.arraycopy(buf, offsetInBuffer, buffer, start, toRead);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_8() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        FileInputStream in = ((FileInputStream) createInstance("java.io.FileInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(0L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", -1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", -191);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "bytesReadFromStream", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", -191);
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
        
        zipArchiveInputStream.read(byteArray, 29, 8);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): False}
 * @utbot.executesCondition {@code (inf.needsInput()): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: fill();
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        FileInputStream in = ((FileInputStream) createInstance("java.io.FileInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object input = createInstance("java.nio.DirectByteBufferR");
        setField(input, "java.nio.Buffer", "position", 1416538730);
        setField(input, "java.nio.Buffer", "limit", 1416538730);
        Class inflaterClazz = Class.forName("java.util.zip.Inflater");
        Class inputType = Class.forName("java.nio.ByteBuffer");
        Method setInputMethod = inflaterClazz.getDeclaredMethod("setInput", inputType);
        setInputMethod.setAccessible(true);
        java.lang.Object[] setInputMethodArguments = new java.lang.Object[1];
        setInputMethodArguments[0] = input;
        setInputMethod.invoke(inf, setInputMethodArguments);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setMethod(67108864);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        byte[] byteArray = {};
        
        zipArchiveInputStream.read(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): False}
 * @utbot.executesCondition {@code (inf.needsInput()): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: fill();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_9() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(jv, "java.util.jar.JarVerifier", "parsingBlockOrSF", true);
        ByteArrayOutputStream baos = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {};
        setField(baos, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(baos, "java.io.ByteArrayOutputStream", "count", -1);
        setField(jv, "java.util.jar.JarVerifier", "baos", baos);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "inputPos", -255);
        setField(inf, "java.util.zip.Inflater", "inputLim", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setMethod(1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        byte[] byteArray = {};
        
        zipArchiveInputStream.read(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): False}
 * @utbot.executesCondition {@code (inf.needsInput()): True}
 * @utbot.throwsException {@link java.lang.SecurityException} in: fill();
 *  */
    @Test(expected = SecurityException.class)
    public void testRead_ThrowSecurityException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Sun sigFileSigners = ((Sun) createInstance("sun.security.provider.Sun"));
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object input = createInstance("java.nio.DirectByteBufferR");
        setField(input, "java.nio.Buffer", "position", 8768);
        setField(input, "java.nio.Buffer", "limit", 8768);
        Class inflaterClazz = Class.forName("java.util.zip.Inflater");
        Class inputType = Class.forName("java.nio.ByteBuffer");
        Method setInputMethod = inflaterClazz.getDeclaredMethod("setInput", inputType);
        setInputMethod.setAccessible(true);
        java.lang.Object[] setInputMethodArguments = new java.lang.Object[1];
        setInputMethodArguments[0] = input;
        setInputMethod.invoke(inf, setInputMethodArguments);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        JarArchiveEntry current = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        current.setMethod(64);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        byte[] byteArray = {};
        
        zipArchiveInputStream.read(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): True}
 * @utbot.executesCondition {@code (readBytesOfEntry >= csize): False}
 * @utbot.executesCondition {@code (offsetInBuffer >= lengthOfLastRead): False}
 * @utbot.executesCondition {@code (length > lengthOfLastRead): False}
 * @utbot.executesCondition {@code ((csize - readBytesOfEntry) < toRead): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(buf, offsetInBuffer, buffer, start, toRead);
 *  */
    @Test(expected = NullPointerException.class)
    public void testRead_ThrowNullPointerException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(2147483526L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", -134);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", -1);
        byte[] byteArray = {};
        
        zipArchiveInputStream.read(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): True}
 * @utbot.executesCondition {@code (readBytesOfEntry >= csize): False}
 * @utbot.executesCondition {@code (offsetInBuffer >= lengthOfLastRead): False}
 * @utbot.executesCondition {@code (length > lengthOfLastRead): False}
 * @utbot.executesCondition {@code ((csize - readBytesOfEntry) < toRead): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(buf, offsetInBuffer, buffer, start, toRead);
 *  */
    @Test(expected = NullPointerException.class)
    public void testRead_ThrowNullPointerException_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(294L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", 142);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", -1);
        byte[] byteArray = {};
        
        zipArchiveInputStream.read(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): True}
 * @utbot.executesCondition {@code (readBytesOfEntry >= csize): False}
 * @utbot.executesCondition {@code (offsetInBuffer >= lengthOfLastRead): False}
 * @utbot.executesCondition {@code (length > lengthOfLastRead): True}
 * @utbot.executesCondition {@code ((csize - readBytesOfEntry) < toRead): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(buf, offsetInBuffer, buffer, start, toRead);
 *  */
    @Test(expected = NullPointerException.class)
    public void testRead_ThrowNullPointerException_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(1L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", -2);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", -1);
        byte[] byteArray = {};
        
        zipArchiveInputStream.read(byteArray, 0, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.invokes {@link java.util.zip.Inflater#finished()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: inf.finished() || current == null
 *  */
    @Test
    public void testRead_ThrowNullPointerException_3() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.read] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.read(ZipArchiveInputStream.java:195) */
        zipArchiveInputStream.read(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (inf.finished()): True}
 * @utbot.executesCondition {@code (current == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: start <= buffer.length && length >= 0 && start >= 0 && buffer.length - start >= length
 *  */
    @Test
    public void testRead_ThrowNullPointerException_4() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.read] produces [java.lang.NullPointerException] */
        zipArchiveInputStream.read(null, -255, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (inf.finished()): True}
 * @utbot.executesCondition {@code (current == null): False}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): True}
 * @utbot.executesCondition {@code (readBytesOfEntry >= csize): False}
 * @utbot.executesCondition {@code (offsetInBuffer >= lengthOfLastRead): False}
 * @utbot.executesCondition {@code (length > lengthOfLastRead): False}
 * @utbot.executesCondition {@code ((csize - readBytesOfEntry) < toRead): True}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.invokes {@link java.util.zip.CRC32#update(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: crc.update(buffer, start, toRead);
 *  */
    @Test
    public void testRead_ThrowNullPointerException_5() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0, (byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(0L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", -1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", 1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", 130);
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
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.read] produces [java.lang.NullPointerException] */
        zipArchiveInputStream.read(byteArray, 0, 3);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (inf.finished()): True}
 * @utbot.executesCondition {@code (current == null): False}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): True}
 * @utbot.executesCondition {@code (readBytesOfEntry >= csize): False}
 * @utbot.executesCondition {@code (offsetInBuffer >= lengthOfLastRead): True}
 * @utbot.invokes {@link java.io.InputStream#read(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (lengthOfLastRead = in.read(buf)) == -1
 *  */
    @Test
    public void testRead_ThrowNullPointerException_6() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(128L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", 127);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", -255);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.read] produces [java.lang.NullPointerException] */
        zipArchiveInputStream.read(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (inf.finished()): True}
 * @utbot.executesCondition {@code (current == null): False}
 * @utbot.executesCondition {@code (start <= buffer.length): True}
 * @utbot.executesCondition {@code (length >= 0): True}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (buffer.length - start >= length): True}
 * @utbot.executesCondition {@code (current.getMethod() == ZipArchiveOutputStream.STORED): False}
 * @utbot.executesCondition {@code (inf.needsInput()): True}
 * @utbot.invokes {@link java.util.zip.Inflater#needsInput()}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#fill()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: fill();
 *  */
    @Test
    public void testRead_ThrowNullPointerException_7() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        Object input = createInstance("java.nio.DirectByteBufferR");
        setField(input, "java.nio.Buffer", "position", -2147482048);
        setField(input, "java.nio.Buffer", "limit", -2147482048);
        Class inflaterClazz = Class.forName("java.util.zip.Inflater");
        Class inputType = Class.forName("java.nio.ByteBuffer");
        Method setInputMethod = inflaterClazz.getDeclaredMethod("setInput", inputType);
        setInputMethod.setAccessible(true);
        java.lang.Object[] setInputMethodArguments = new java.lang.Object[1];
        setInputMethodArguments[0] = input;
        setInputMethod.invoke(inf, setInputMethodArguments);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setMethod(2097152);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.read] produces [java.lang.NullPointerException] */
        zipArchiveInputStream.read(byteArray, 0, 0);
    }
    ///endregion
    
    ///region Errors report for read
    
    public void testRead_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 42 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 8 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method close()
    
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
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#close()}
 * @utbot.executesCondition {@code (!closed): True}
 *  */
    @Test
    public void testClose_NotClosed() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        GZIPInputStream in = ((GZIPInputStream) createInstance("java.util.zip.GZIPInputStream"));
        setField(in, "java.util.zip.GZIPInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        zipArchiveInputStream.close();
        
        boolean finalZipArchiveInputStreamClosed = ((Boolean) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "closed"));
        
        assertTrue(finalZipArchiveInputStreamClosed);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#close()}
 * @utbot.executesCondition {@code (!closed): True}
 *  */
    @Test
    public void testClose_NotClosed_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        GZIPInputStream in = ((GZIPInputStream) createInstance("java.util.zip.GZIPInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        zipArchiveInputStream.close();
        
        InputStream zipArchiveInputStreamIn = ((InputStream) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in"));
        boolean finalZipArchiveInputStreamInEos = ((Boolean) getFieldValue(zipArchiveInputStreamIn, "java.util.zip.GZIPInputStream", "eos"));
        InputStream zipArchiveInputStreamIn1 = ((InputStream) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in"));
        boolean finalZipArchiveInputStreamInClosed = ((Boolean) getFieldValue(zipArchiveInputStreamIn1, "java.util.zip.GZIPInputStream", "closed"));
        boolean finalZipArchiveInputStreamClosed = ((Boolean) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "closed"));
        
        assertTrue(finalZipArchiveInputStreamInEos);
        
        assertTrue(finalZipArchiveInputStreamInClosed);
        
        assertTrue(finalZipArchiveInputStreamClosed);
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
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#close()}
 *  */
    @Test
    public void testClose() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        ZipInputStream in = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        zipArchiveInputStream.close();
        
        boolean finalZipArchiveInputStreamClosed = ((Boolean) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "closed"));
        
        assertTrue(finalZipArchiveInputStreamClosed);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        ZipInputStream in = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        zipArchiveInputStream.close();
        
        InputStream zipArchiveInputStreamIn = ((InputStream) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in"));
        boolean finalZipArchiveInputStreamInClosed = ((Boolean) getFieldValue(zipArchiveInputStreamIn, "java.util.zip.ZipInputStream", "closed"));
        boolean finalZipArchiveInputStreamClosed = ((Boolean) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "closed"));
        
        assertTrue(finalZipArchiveInputStreamInClosed);
        
        assertTrue(finalZipArchiveInputStreamClosed);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        ZipInputStream in = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        ZipInputStream in1 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        zipArchiveInputStream.close();
        
        InputStream zipArchiveInputStreamIn = ((InputStream) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in"));
        boolean finalZipArchiveInputStreamInClosed = ((Boolean) getFieldValue(zipArchiveInputStreamIn, "java.util.zip.ZipInputStream", "closed"));
        InputStream zipArchiveInputStreamIn1 = ((InputStream) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in"));
        boolean finalZipArchiveInputStreamInClosed1 = ((Boolean) getFieldValue(zipArchiveInputStreamIn1, "java.util.zip.InflaterInputStream", "closed"));
        InputStream zipArchiveInputStreamIn2 = ((InputStream) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in"));
        InputStream zipArchiveInputStreamIn2InIn = ((InputStream) getFieldValue(zipArchiveInputStreamIn2, "java.io.FilterInputStream", "in"));
        boolean finalZipArchiveInputStreamInInClosed = ((Boolean) getFieldValue(zipArchiveInputStreamIn2InIn, "java.util.zip.ZipInputStream", "closed"));
        boolean finalZipArchiveInputStreamClosed = ((Boolean) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "closed"));
        
        assertTrue(finalZipArchiveInputStreamInClosed);
        
        assertTrue(finalZipArchiveInputStreamInClosed1);
        
        assertTrue(finalZipArchiveInputStreamInInClosed);
        
        assertTrue(finalZipArchiveInputStreamClosed);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_3() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        ZipInputStream in = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        GZIPInputStream in1 = ((GZIPInputStream) createInstance("java.util.zip.GZIPInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        zipArchiveInputStream.close();
        
        InputStream zipArchiveInputStreamIn = ((InputStream) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in"));
        boolean finalZipArchiveInputStreamInClosed = ((Boolean) getFieldValue(zipArchiveInputStreamIn, "java.util.zip.ZipInputStream", "closed"));
        InputStream zipArchiveInputStreamIn1 = ((InputStream) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in"));
        boolean finalZipArchiveInputStreamInClosed1 = ((Boolean) getFieldValue(zipArchiveInputStreamIn1, "java.util.zip.InflaterInputStream", "closed"));
        InputStream zipArchiveInputStreamIn2 = ((InputStream) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in"));
        InputStream zipArchiveInputStreamIn2InIn = ((InputStream) getFieldValue(zipArchiveInputStreamIn2, "java.io.FilterInputStream", "in"));
        boolean finalZipArchiveInputStreamInInEos = ((Boolean) getFieldValue(zipArchiveInputStreamIn2InIn, "java.util.zip.GZIPInputStream", "eos"));
        InputStream zipArchiveInputStreamIn3 = ((InputStream) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in"));
        InputStream zipArchiveInputStreamIn3InIn = ((InputStream) getFieldValue(zipArchiveInputStreamIn3, "java.io.FilterInputStream", "in"));
        boolean finalZipArchiveInputStreamInInClosed = ((Boolean) getFieldValue(zipArchiveInputStreamIn3InIn, "java.util.zip.GZIPInputStream", "closed"));
        boolean finalZipArchiveInputStreamClosed = ((Boolean) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "closed"));
        
        assertTrue(finalZipArchiveInputStreamInClosed);
        
        assertTrue(finalZipArchiveInputStreamInClosed1);
        
        assertTrue(finalZipArchiveInputStreamInInEos);
        
        assertTrue(finalZipArchiveInputStreamInInClosed);
        
        assertTrue(finalZipArchiveInputStreamClosed);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#close()}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.invokes {@link java.io.InputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: in.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.close(ZipArchiveInputStream.java:251) */
        zipArchiveInputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#close()}
 * @utbot.executesCondition {@code (!closed): True}
 * @utbot.invokes {@link java.io.InputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testClose_ThrowNullPointerException_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        ZipInputStream in = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        Object cleanable = createInstance("java.net.SocketCleanable");
        setField(zsRef, "java.util.zip.Inflater$InflaterZStreamRef", "cleanable", cleanable);
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(in, "java.util.zip.InflaterInputStream", "inf", inf);
        setField(in, "java.util.zip.InflaterInputStream", "usesDefaultInflater", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        zipArchiveInputStream.close();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method close()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#close()}
     */
    @Test
    public void testClose1() throws IOException  {
        byte[] byteArray = {(byte) 0, java.lang.Byte.MIN_VALUE, (byte) -1};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        ZipArchiveInputStream zipArchiveInputStream = new ZipArchiveInputStream(byteArrayInputStream, "XZ", false);
        
        zipArchiveInputStream.close();
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skip
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method skip(long)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
 *  */
    @Test
    public void testSkip_SkippedEqualsValue() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        long actual = zipArchiveInputStream.skip(0L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
 * @utbot.iterates iterate the loop {@code while(skipped != value)} once
 *  */
    @Test
    public void testSkip_BLengthLessOrEqualRem() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "finished", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        
        long actual = zipArchiveInputStream.skip(288230376151711745L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
 * @utbot.iterates iterate the loop {@code while(skipped != value)} once
 *  */
    @Test
    public void testSkip_BLengthGreaterThanRem() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(0L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        long actual = zipArchiveInputStream.skip(1L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
 * @utbot.iterates iterate the loop {@code while(skipped != value)} once
 *  */
    @Test
    public void testSkip_BLengthLessOrEqualRem_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        
        long actual = zipArchiveInputStream.skip(288230376151711745L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
 * @utbot.iterates iterate the loop {@code while(skipped != value)} once
 *  */
    @Test
    public void testSkip_BLengthGreaterThanRem_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        CRC32 crc = ((CRC32) createInstance("java.util.zip.CRC32"));
        setField(crc, "java.util.zip.CRC32", "crc", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "crc", crc);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(1073741824L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", 1073741823);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", 1);
        
        long actual = zipArchiveInputStream.skip(1L);
        
        assertEquals(1L, actual);
        
        CRC32 zipArchiveInputStreamCrc = ((CRC32) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "crc"));
        int finalZipArchiveInputStreamCrcCrc = ((Integer) getFieldValue(zipArchiveInputStreamCrc, "java.util.zip.CRC32", "crc"));
        int finalZipArchiveInputStreamReadBytesOfEntry = ((Integer) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry"));
        int finalZipArchiveInputStreamOffsetInBuffer = ((Integer) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer"));
        
        assertEquals(0, finalZipArchiveInputStreamCrcCrc);
        
        assertEquals(1073741824, finalZipArchiveInputStreamReadBytesOfEntry);
        
        assertEquals(1, finalZipArchiveInputStreamOffsetInBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
 * @utbot.iterates iterate the loop {@code while(skipped != value)} once
 *  */
    @Test
    public void testSkip_BLengthGreaterThanRem_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(1L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", -254);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", -254);
        
        long actual = zipArchiveInputStream.skip(64L);
        
        assertEquals(0L, actual);
        
        int finalZipArchiveInputStreamOffsetInBuffer = ((Integer) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer"));
        int finalZipArchiveInputStreamLengthOfLastRead = ((Integer) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead"));
        
        assertEquals(0, finalZipArchiveInputStreamOffsetInBuffer);
        
        assertEquals(-1, finalZipArchiveInputStreamLengthOfLastRead);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
 * @utbot.iterates iterate the loop {@code while(skipped != value)} once
 *  */
    @Test
    public void testSkip_BLengthGreaterThanRem_3() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        java.security.CodeSigner[] signers = {null};
        setField(entry, "java.util.jar.JarEntry", "signers", signers);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(1L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", -254);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", -254);
        
        long actual = zipArchiveInputStream.skip(1L);
        
        assertEquals(0L, actual);
        
        int finalZipArchiveInputStreamOffsetInBuffer = ((Integer) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer"));
        int finalZipArchiveInputStreamLengthOfLastRead = ((Integer) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead"));
        
        assertEquals(0, finalZipArchiveInputStreamOffsetInBuffer);
        
        assertEquals(-1, finalZipArchiveInputStreamLengthOfLastRead);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
 * @utbot.iterates iterate the loop {@code while(skipped != value)} once
 *  */
    @Test
    public void testSkip_BLengthGreaterThanRem_4() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 0L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(1L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", -254);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", -254);
        
        long actual = zipArchiveInputStream.skip(8L);
        
        assertEquals(0L, actual);
        
        InputStream zipArchiveInputStreamIn = ((InputStream) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in"));
        ZipEntry finalZipArchiveInputStreamInEntry = ((ZipEntry) getFieldValue(zipArchiveInputStreamIn, "java.util.zip.ZipInputStream", "entry"));
        InputStream zipArchiveInputStreamIn1 = ((InputStream) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in"));
        boolean finalZipArchiveInputStreamInEntryEOF = ((Boolean) getFieldValue(zipArchiveInputStreamIn1, "java.util.zip.ZipInputStream", "entryEOF"));
        int finalZipArchiveInputStreamOffsetInBuffer = ((Integer) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer"));
        int finalZipArchiveInputStreamLengthOfLastRead = ((Integer) getFieldValue(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead"));
        
        assertNull(finalZipArchiveInputStreamInEntry);
        
        assertTrue(finalZipArchiveInputStreamInEntryEOF);
        
        assertEquals(0, finalZipArchiveInputStreamOffsetInBuffer);
        
        assertEquals(-1, finalZipArchiveInputStreamLengthOfLastRead);
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
        
        zipArchiveInputStream.skip(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
 * @utbot.executesCondition {@code (value >= 0): True}
 * @utbot.iterates iterate the loop {@code while(skipped != value)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: int x = read(b, 0, (int) (b.length > rem ? rem : b.length));
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSkip_ThrowIndexOutOfBoundsException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(4L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", -4);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", Integer.MIN_VALUE);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", 1073741826);
        
        zipArchiveInputStream.skip(10L);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
 * @utbot.executesCondition {@code (value >= 0): True}
 * @utbot.iterates iterate the loop {@code while(skipped != value)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: int x = read(b, 0, (int) (b.length > rem ? rem : b.length));
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSkip_ThrowIndexOutOfBoundsException_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        JarArchiveEntry current = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        current.setSize(1006632956L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", 939524092);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", -256);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", 256);
        
        zipArchiveInputStream.skip(1L);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
 * @utbot.executesCondition {@code (value >= 0): True}
 * @utbot.iterates iterate the loop {@code while(skipped != value)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: int x = read(b, 0, (int) (b.length > rem ? rem : b.length));
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSkip_ThrowIndexOutOfBoundsException_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        JarArchiveEntry current = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        current.setSize(2147483585L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", -120);
        
        zipArchiveInputStream.skip(4611686018427387906L);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
 * @utbot.executesCondition {@code (value >= 0): True}
 * @utbot.iterates iterate the loop {@code while(skipped != value)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int x = read(b, 0, (int) (b.length > rem ? rem : b.length));
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testSkip_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        FileInputStream in = ((FileInputStream) createInstance("java.io.FileInputStream"));
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
        byte[] buf = {};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setMethod(1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        zipArchiveInputStream.skip(2L);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
 * @utbot.executesCondition {@code (value >= 0): True}
 * @utbot.iterates iterate the loop {@code while(skipped != value)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int x = read(b, 0, (int) (b.length > rem ? rem : b.length));
 *  */
    @Test(expected = NullPointerException.class)
    public void testSkip_ThrowNullPointerException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(1073741824L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", 1073741823);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", 123);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", 124);
        
        zipArchiveInputStream.skip(125L);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method skip(long)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
 * @utbot.iterates iterate the loop {@code while(skipped != value)} once
 * @utbot.throwsException {@link java.io.IOException} in: int x = read(b, 0, (int) (b.length > rem ? rem : b.length));
 *  */
    @Test(expected = IOException.class)
    public void testSkip_ThrowIOException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "closed", true);
        
        zipArchiveInputStream.skip(1L);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
 * @utbot.iterates iterate the loop {@code while(skipped != value)} once
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testSkip_ThrowIOException_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(128L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", 127);
        
        zipArchiveInputStream.skip(1024L);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
 * @utbot.iterates iterate the loop {@code while(skipped != value)} once
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testSkip_ThrowIOException_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
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
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setMethod(1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        zipArchiveInputStream.skip(36028797018963969L);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
 * @utbot.iterates iterate the loop {@code while(skipped != value)} once
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testSkip_ThrowZipException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setMethod(1);
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(1L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", -254);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", -254);
        
        zipArchiveInputStream.skip(16L);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method skip(long)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
 * @utbot.executesCondition {@code (value >= 0): True}
 * @utbot.iterates iterate the loop {@code while(skipped != value)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int x = read(b, 0, (int) (b.length > rem ? rem : b.length));
 *  */
    @Test
    public void testSkip_ThrowNullPointerException_1() throws Exception  {
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
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setMethod(1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skip] produces [java.lang.NullPointerException] */
        zipArchiveInputStream.skip(256L);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method skip(long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#skip(long)}
     */
    @Test
    public void testSkipReturnsZero() throws IOException  {
        byte[] byteArray = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, java.lang.Byte.MAX_VALUE};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        ZipArchiveInputStream zipArchiveInputStream = new ZipArchiveInputStream(byteArrayInputStream);
        
        long actual = zipArchiveInputStream.skip(128L);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region Errors report for skip
    
    public void testSkip_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 25 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 7 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFully
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readFully([B)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFully(byte[])}
 *  */
    @Test
    public void testReadFully_CountEqualsBLength() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readFully([B)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFully(byte[])}
 * @utbot.throwsException {@link java.lang.ArithmeticException} 
 *  */
    @Test
    public void testReadFully_ThrowArithmeticException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Hashtable verifiedSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(verifiedSigners, "java.util.Hashtable", "table", table);
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
        String name = "";
        setField(mev, "sun.security.util.ManifestEntryVerifier", "name", name);
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFully] produces [java.lang.ArithmeticException: / by zero] */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: count += x = in.read(b, count, b.length - count);
 *  */
    @Test
    public void testReadFully_ThrowClassCastException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties sigFileSigners = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        Object object = createInstance("java.lang.Object");
        map.put(null, object);
        setField(sigFileSigners, "java.util.Properties", "map", map);
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
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
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFully] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.security.CodeSigner[]] */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(count != b.length)
 *  */
    @Test
    public void testReadFully_ThrowNullPointerException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFully] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFully(ZipArchiveInputStream.java:339) */
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArrayType = Class.forName("[B");
        Method readFullyMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readFully", byteArrayType);
        readFullyMethod.setAccessible(true);
        java.lang.Object[] readFullyMethodArguments = new java.lang.Object[1];
        readFullyMethodArguments[0] = ((Object) null);
        try {
            readFullyMethod.invoke(zipArchiveInputStream, readFullyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFully(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: count += x = in.read(b, count, b.length - count);
 *  */
    @Test
    public void testReadFully_ThrowNullPointerException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFully] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFully(ZipArchiveInputStream.java:340) */
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
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readFully([B)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFully(byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: count += x = in.read(b, count, b.length - count);
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
 * @utbot.executesCondition {@code (x == -1): True}
 * @utbot.throwsException {@link java.io.EOFException} when: x == -1
 *  */
    @Test(expected = EOFException.class)
    public void testReadFully_ThrowEOFException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
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
 * @utbot.throwsException {@link java.util.zip.ZipException} in: count += x = in.read(b, count, b.length - count);
 *  */
    @Test(expected = ZipException.class)
    public void testReadFully_ThrowZipException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
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
 * @utbot.throwsException {@link java.io.IOException} in: count += x = in.read(b, count, b.length - count);
 *  */
    @Test(expected = IOException.class)
    public void testReadFully_ThrowIOException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 1L);
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
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
 * @utbot.executesCondition {@code (x == -1): True}
 * @utbot.throwsException {@link java.io.EOFException} when: x == -1
 *  */
    @Test(expected = EOFException.class)
    public void testReadFully_ThrowEOFException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        java.security.CodeSigner[] signers = {null};
        setField(entry, "java.util.jar.JarEntry", "signers", signers);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
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
 * @utbot.executesCondition {@code (x == -1): True}
 * @utbot.throwsException {@link java.io.EOFException} when: x == -1
 *  */
    @Test(expected = EOFException.class)
    public void testReadFully_ThrowEOFException_2() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
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
 * @utbot.throwsException {@link java.util.zip.ZipException} in: count += x = in.read(b, count, b.length - count);
 *  */
    @Test(expected = ZipException.class)
    public void testReadFully_ThrowZipException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 2L);
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in1, "java.util.jar.JarInputStream", "first", entry);
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
 * @utbot.executesCondition {@code (x == -1): True}
 * @utbot.throwsException {@link java.io.EOFException} when: x == -1
 *  */
    @Test(expected = EOFException.class)
    public void testReadFully_ThrowEOFException_3() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Hashtable verifiedSigners = ((Hashtable) createInstance("java.util.Hashtable"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        LinkedHashMap signersToAlgs = new LinkedHashMap();
        setField(jv, "java.util.jar.JarVerifier", "signersToAlgs", signersToAlgs);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "skip", true);
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
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
 * @utbot.executesCondition {@code (x == -1): True}
 * @utbot.throwsException {@link java.io.EOFException} when: x == -1
 *  */
    @Test(expected = EOFException.class)
    public void testReadFully_ThrowEOFException_4() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Hashtable verifiedSigners = ((Hashtable) createInstance("java.util.Hashtable"));
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
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        java.security.cert.Certificate[] certs = {null};
        setField(entry, "java.util.jar.JarEntry", "certs", certs);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        java.security.CodeSigner[] signers = {};
        setField(mev, "sun.security.util.ManifestEntryVerifier", "signers", signers);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readFully([B)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFully(byte[])}
 * @utbot.invokes {@link java.io.InputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.SecurityException} in: count += x = in.read(b, count, b.length - count);
 *  */
    @Test(expected = SecurityException.class)
    public void testReadFully_ThrowSecurityException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Properties sigFileSigners = ((Properties) createInstance("java.util.Properties"));
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
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
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method readFully([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFully(byte[])}
     */
    @Test
    public void testReadFullyWithNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, IOException  {
        byte[] byteArray = {(byte) 0, (byte) 0, (byte) 0};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        ZipArchiveInputStream zipArchiveInputStream = new ZipArchiveInputStream(byteArrayInputStream);
        byte[] byteArray1 = {(byte) 0, java.lang.Byte.MIN_VALUE, (byte) 1};
        
        Class zipArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class byteArray1Type = Class.forName("[B");
        Method readFullyMethod = zipArchiveInputStreamClazz.getDeclaredMethod("readFully", byteArray1Type);
        readFullyMethod.setAccessible(true);
        java.lang.Object[] readFullyMethodArguments = new java.lang.Object[1];
        readFullyMethodArguments[0] = ((Object) byteArray1);
        readFullyMethod.invoke(zipArchiveInputStream, readFullyMethodArguments);
        
        byte finalByteArray11 = byteArray1[1];
        byte finalByteArray12 = byteArray1[2];
        
        assertEquals((byte) 0, finalByteArray11);
        
        assertEquals((byte) 0, finalByteArray12);
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
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFully(byte[])
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFully(byte[])
 * @utbot.caughtException {@code EOFException e}
 *  */
    @Test
    public void testGetNextZipEntry_CatchEOFException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        ZipArchiveEntry actual = zipArchiveInputStream.getNextZipEntry();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNextZipEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.executesCondition {@code (current != null): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: closeEntry();
 *  */
    @Test
    public void testGetNextZipEntry_ThrowClassCastException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        GZIPInputStream in = ((GZIPInputStream) createInstance("java.util.zip.GZIPInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "finished", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "bytesReadFromStream", -1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry] produces [java.lang.ClassCastException: The object with type java.io.InputStream can not be casted to java.io.PushbackInputStream] */
        zipArchiveInputStream.getNextZipEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.executesCondition {@code (current != null): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: closeEntry();
 *  */
    @Test
    public void testGetNextZipEntry_ThrowClassCastException_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        GZIPInputStream in = ((GZIPInputStream) createInstance("java.util.zip.GZIPInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(4294967295L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", -1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry] produces [java.lang.ClassCastException: The object with type java.io.InputStream can not be casted to java.io.PushbackInputStream] */
        zipArchiveInputStream.getNextZipEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.executesCondition {@code (current != null): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: closeEntry();
 *  */
    @Test
    public void testGetNextZipEntry_ThrowClassCastException_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object in = createInstance("java.lang.Process$PipeInputStream");
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(2L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", 1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "bytesReadFromStream", -2);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", -255);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry] produces [java.lang.ClassCastException: The object with type java.io.InputStream can not be casted to java.io.PushbackInputStream] */
        zipArchiveInputStream.getNextZipEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.executesCondition {@code (current != null): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: closeEntry();
 *  */
    @Test
    public void testGetNextZipEntry_ThrowClassCastException_3() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(96L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", 95);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "bytesReadFromStream", -96);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", -255);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry] produces [java.lang.ClassCastException: The object with type java.io.InputStream can not be casted to java.io.PushbackInputStream] */
        zipArchiveInputStream.getNextZipEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.executesCondition {@code (current != null): False}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFully(byte[])
 * @utbot.throwsException {@link java.lang.NullPointerException} in: readFully(lfh);
 *  */
    @Test
    public void testGetNextZipEntry_ThrowNullPointerException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFully(ZipArchiveInputStream.java:340)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry(ZipArchiveInputStream.java:116) */
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
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(inf, "java.util.zip.Inflater", "finished", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "bytesReadFromStream", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "hasDataDescriptor", true);
        
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
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(inf, "java.util.zip.Inflater", "finished", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "bytesReadFromStream", -1);
        
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
    public void testGetNextZipEntry_ThrowNullPointerException_3() throws Exception  {
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
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setMethod(1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry] produces [java.lang.NullPointerException] */
        zipArchiveInputStream.getNextZipEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method getNextZipEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.executesCondition {@code (current != null): False}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFully(byte[])
 * @utbot.throwsException {@link java.io.IOException} in: readFully(lfh);
 *  */
    @Test(expected = IOException.class)
    public void testGetNextZipEntry_ThrowIOException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        zipArchiveInputStream.getNextZipEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.executesCondition {@code (current != null): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testGetNextZipEntry_ThrowIOException_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(32L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", 31);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", -255);
        
        zipArchiveInputStream.getNextZipEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.executesCondition {@code (current != null): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testGetNextZipEntry_ThrowIOException_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "inputPos", -255);
        setField(inf, "java.util.zip.Inflater", "inputLim", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        JarArchiveEntry current = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        current.setMethod(1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        zipArchiveInputStream.getNextZipEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.executesCondition {@code (current != null): True}
 * @utbot.throwsException {@link java.io.IOException} in: closeEntry();
 *  */
    @Test(expected = IOException.class)
    public void testGetNextZipEntry_ThrowIOException_3() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        PushbackInputStream in = ((PushbackInputStream) createInstance("java.io.PushbackInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "finished", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "bytesReadFromStream", -1);
        
        zipArchiveInputStream.getNextZipEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getNextZipEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: closeEntry();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNextZipEntry_ThrowIndexOutOfBoundsException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(2147483393L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", -256);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", 3);
        
        zipArchiveInputStream.getNextZipEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: closeEntry();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNextZipEntry_ThrowIndexOutOfBoundsException_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0, (byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(1073741824L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", 509);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", 2147481603);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", 2147481606);
        
        zipArchiveInputStream.getNextZipEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: closeEntry();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNextZipEntry_ThrowIndexOutOfBoundsException_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        FileInputStream in = ((FileInputStream) createInstance("java.io.FileInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        JarArchiveEntry current = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        current.setSize(1647321759L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", -1001369250);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", 1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", 1);
        
        zipArchiveInputStream.getNextZipEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: closeEntry();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNextZipEntry_ThrowIndexOutOfBoundsException_3() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        PushbackInputStream in = ((PushbackInputStream) createInstance("java.io.PushbackInputStream"));
        byte[] buf = {(byte) 0};
        setField(in, "java.io.PushbackInputStream", "buf", buf);
        setField(in, "java.io.PushbackInputStream", "pos", Integer.MIN_VALUE);
        FilterInputStream in1 = ((FilterInputStream) createInstance("java.util.zip.GZIPInputStream$1"));
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "finished", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf1 = {(byte) 0, (byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf1);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", 2147483646);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "bytesReadFromStream", -2);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", Integer.MAX_VALUE);
        
        zipArchiveInputStream.getNextZipEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: closeEntry();
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetNextZipEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        FileInputStream in = ((FileInputStream) createInstance("java.io.FileInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "inputPos", -255);
        setField(inf, "java.util.zip.Inflater", "inputLim", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setMethod(1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        
        zipArchiveInputStream.getNextZipEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: closeEntry();
 *  */
    @Test(expected = NullPointerException.class)
    public void testGetNextZipEntry_ThrowNullPointerException_4() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(11L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", 10);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", 31);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", 32);
        
        zipArchiveInputStream.getNextZipEntry();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getNextZipEntry()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextZipEntry()}
     */
    @Test
    public void testGetNextZipEntry() throws IOException  {
        byte[] byteArray = {(byte) 1, (byte) 22, (byte) 6};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        ZipArchiveInputStream zipArchiveInputStream = new ZipArchiveInputStream(byteArrayInputStream, "XZ", false);
        
        ZipArchiveEntry actual = zipArchiveInputStream.getNextZipEntry();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getNextZipEntry
    
    public void testGetNextZipEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 23 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 9 occurrences of:
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
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "hitCentralDirectory", true);
        
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
    public void testGetNextEntry_ReturnGetNextZipEntry_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        ZipArchiveEntry actual = ((ZipArchiveEntry) zipArchiveInputStream.getNextEntry());
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextEntry()}
 * @utbot.returnsFrom {@code return getNextZipEntry();}
 *  */
    @Test
    public void testGetNextEntry_ReturnGetNextZipEntry_3() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        ZipArchiveEntry actual = ((ZipArchiveEntry) zipArchiveInputStream.getNextEntry());
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNextEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getNextZipEntry();
 *  */
    @Test
    public void testGetNextEntry_ThrowClassCastException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        GZIPInputStream in = ((GZIPInputStream) createInstance("java.util.zip.GZIPInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "finished", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "bytesReadFromStream", -1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry] produces [java.lang.ClassCastException: The object with type java.io.InputStream can not be casted to java.io.PushbackInputStream] */
        zipArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getNextZipEntry();
 *  */
    @Test
    public void testGetNextEntry_ThrowClassCastException_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        GZIPInputStream in = ((GZIPInputStream) createInstance("java.util.zip.GZIPInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(4294967295L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", -1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry] produces [java.lang.ClassCastException: The object with type java.io.InputStream can not be casted to java.io.PushbackInputStream] */
        zipArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getNextZipEntry();
 *  */
    @Test
    public void testGetNextEntry_ThrowClassCastException_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        java.security.CodeSigner[] signers = {null};
        setField(entry, "java.util.jar.JarEntry", "signers", signers);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        JarArchiveEntry current = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        current.setSize(96L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", 95);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "bytesReadFromStream", -96);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", -255);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry] produces [java.lang.ClassCastException: The object with type java.io.InputStream can not be casted to java.io.PushbackInputStream] */
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
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFully(ZipArchiveInputStream.java:340)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry(ZipArchiveInputStream.java:116)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry(ZipArchiveInputStream.java:188) */
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
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(inf, "java.util.zip.Inflater", "finished", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "bytesReadFromStream", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "hasDataDescriptor", true);
        
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
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(inf, "java.util.zip.Inflater", "finished", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "bytesReadFromStream", -1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException] */
        zipArchiveInputStream.getNextEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getNextEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return getNextZipEntry();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNextEntry_ThrowIndexOutOfBoundsException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(1073741907L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", -2147483490);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", 1073741825);
        
        zipArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return getNextZipEntry();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNextEntry_ThrowIndexOutOfBoundsException_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(2147483393L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", -256);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", 3);
        
        zipArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return getNextZipEntry();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNextEntry_ThrowIndexOutOfBoundsException_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        PushbackInputStream in = ((PushbackInputStream) createInstance("java.io.PushbackInputStream"));
        byte[] buf = {(byte) 0};
        setField(in, "java.io.PushbackInputStream", "buf", buf);
        setField(in, "java.io.PushbackInputStream", "pos", 1619137793);
        CheckedInputStream in1 = ((CheckedInputStream) createInstance("java.util.zip.CheckedInputStream"));
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "finished", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", 1476250506);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "bytesReadFromStream", 130);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", -1476250376);
        
        zipArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getNextZipEntry();
 *  */
    @Test(expected = NullPointerException.class)
    public void testGetNextEntry_ThrowNullPointerException_3() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(1073741824L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", 509);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", 1073741825);
        
        zipArchiveInputStream.getNextEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method getNextEntry()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.io.IOException} in: return getNextZipEntry();
 *  */
    @Test(expected = IOException.class)
    public void testGetNextEntry_ThrowIOException() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        zipArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.io.IOException} in: return getNextZipEntry();
 *  */
    @Test(expected = IOException.class)
    public void testGetNextEntry_ThrowIOException_1() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        
        zipArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextEntry()}
 * @utbot.throwsException {@link java.io.IOException} in: return getNextZipEntry();
 *  */
    @Test(expected = IOException.class)
    public void testGetNextEntry_ThrowIOException_2() throws Exception  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        PushbackInputStream in = ((PushbackInputStream) createInstance("java.io.PushbackInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "finished", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "bytesReadFromStream", -1);
        
        zipArchiveInputStream.getNextEntry();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getNextEntry()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#getNextEntry()}
     */
    @Test
    public void testGetNextEntry() throws IOException  {
        byte[] byteArray = {(byte) -1, java.lang.Byte.MIN_VALUE, java.lang.Byte.MAX_VALUE};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        ZipArchiveInputStream zipArchiveInputStream = new ZipArchiveInputStream(byteArrayInputStream, "XZ", false);
        
        ArchiveEntry actual = zipArchiveInputStream.getNextEntry();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getNextEntry
    
    public void testGetNextEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 21 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 13 occurrences of:
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
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(ZipArchiveInputStream.java:287) */
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
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(ZipArchiveInputStream.java:287) */
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
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(ZipArchiveInputStream.java:286) */
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
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method checksig([B, [B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#checksig(byte[],byte[])}
     */
    @Test
    public void testChecksigReturnsFalseWithNonEmptyPrimitiveArrays() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {java.lang.Byte.MAX_VALUE, java.lang.Byte.MIN_VALUE};
        byte[] byteArray1 = {java.lang.Byte.MAX_VALUE, (byte) 1, (byte) -1, (byte) -1, (byte) -1};
        
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
 * @utbot.executesCondition {@code (diff): False}
 * @utbot.executesCondition {@code (hasDataDescriptor): True}
 * @utbot.throwsException {@link java.io.IOException} in: readFully(new byte[4 * WORD]);
 *  */
    @Test(expected = IOException.class)
    public void testCloseEntry_ThrowIOException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "finished", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "bytesReadFromStream", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "hasDataDescriptor", true);
        
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
 * @utbot.throwsException {@link java.io.IOException} in: skip(Long.MAX_VALUE);
 *  */
    @Test(expected = IOException.class)
    public void testCloseEntry_ThrowIOException_2() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) -127};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        JarArchiveEntry current = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        current.setSize(2L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", 1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", 1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", 1);
        
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
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testCloseEntry_ThrowIOException_3() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object in = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object input = createInstance("java.nio.DirectByteBufferR");
        setField(input, "java.nio.Buffer", "position", -1817640);
        setField(input, "java.nio.Buffer", "limit", -1817640);
        Class inflaterClazz = Class.forName("java.util.zip.Inflater");
        Class inputType = Class.forName("java.nio.ByteBuffer");
        Method setInputMethod = inflaterClazz.getDeclaredMethod("setInput", inputType);
        setInputMethod.setAccessible(true);
        java.lang.Object[] setInputMethodArguments = new java.lang.Object[1];
        setInputMethodArguments[0] = input;
        setInputMethod.invoke(inf, setInputMethodArguments);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        JarArchiveEntry current = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        current.setMethod(1);
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
 * @utbot.executesCondition {@code (diff): True}
 * @utbot.invokes {@link java.io.PushbackInputStream#unread(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: ((PushbackInputStream) in).unread(buf, lengthOfLastRead - diff, diff);
 *  */
    @Test(expected = IOException.class)
    public void testCloseEntry_ThrowIOException_4() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        PushbackInputStream in = ((PushbackInputStream) createInstance("java.io.PushbackInputStream"));
        setField(in, "java.io.PushbackInputStream", "pos", -2);
        ZipArchiveInputStream in1 = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "finished", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        JarArchiveEntry current = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "bytesReadFromStream", -1);
        
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
 * @utbot.executesCondition {@code (diff): False}
 * @utbot.executesCondition {@code (hasDataDescriptor): True}
 * @utbot.throwsException {@link java.io.EOFException} in: readFully(new byte[4 * WORD]);
 *  */
    @Test(expected = EOFException.class)
    public void testCloseEntry_ThrowEOFException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "finished", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "bytesReadFromStream", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "hasDataDescriptor", true);
        
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
 * @utbot.executesCondition {@code (diff): False}
 * @utbot.executesCondition {@code (hasDataDescriptor): True}
 * @utbot.throwsException {@link java.io.EOFException} in: readFully(new byte[4 * WORD]);
 *  */
    @Test(expected = EOFException.class)
    public void testCloseEntry_ThrowEOFException_1() throws Throwable  {
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
        setField(inf, "java.util.zip.Inflater", "finished", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "bytesReadFromStream", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "hasDataDescriptor", true);
        
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
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testCloseEntry_ThrowZipException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        entry.setMethod(1);
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "inputPos", -255);
        setField(inf, "java.util.zip.Inflater", "inputLim", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setMethod(8);
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
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: skip(Long.MAX_VALUE);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testCloseEntry_ThrowIndexOutOfBoundsException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(1073741824L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", 509);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", -1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", 1073742846);
        
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
 * @utbot.executesCondition {@code (diff): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getMethod()}
 * @utbot.invokes {@link java.io.PushbackInputStream#unread(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: ((PushbackInputStream) in).unread(buf, lengthOfLastRead - diff, diff);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testCloseEntry_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        PushbackInputStream in = ((PushbackInputStream) createInstance("java.io.PushbackInputStream"));
        byte[] buf = {(byte) 0};
        setField(in, "java.io.PushbackInputStream", "buf", buf);
        setField(in, "java.io.PushbackInputStream", "pos", -2147483647);
        ZipArchiveInputStream in1 = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "finished", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        JarArchiveEntry current = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", Integer.MAX_VALUE);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", Integer.MIN_VALUE);
        
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: skip(Long.MAX_VALUE);
 *  */
    @Test(expected = NullPointerException.class)
    public void testCloseEntry_ThrowNullPointerException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(19L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", 18);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", 31);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", 32);
        
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: skip(Long.MAX_VALUE);
 *  */
    @Test(expected = NullPointerException.class)
    public void testCloseEntry_ThrowNullPointerException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(1L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "offsetInBuffer", 200);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "lengthOfLastRead", 268);
        
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
 * @utbot.executesCondition {@code (diff): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ((PushbackInputStream) in).unread(buf, lengthOfLastRead - diff, diff);
 *  */
    @Test
    public void testCloseEntry_ThrowClassCastException() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        ZipInputStream in = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inf, "java.util.zip.Inflater", "finished", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "bytesReadFromStream", -1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.closeEntry] produces [java.lang.ClassCastException: The object with type java.io.InputStream can not be casted to java.io.PushbackInputStream] */
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
 * @utbot.executesCondition {@code (diff): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ((PushbackInputStream) in).unread(buf, lengthOfLastRead - diff, diff);
 *  */
    @Test
    public void testCloseEntry_ThrowClassCastException_1() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        ZipInputStream in = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "in", in);
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setSize(4294967295L);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", -1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.closeEntry] produces [java.lang.ClassCastException: The object with type java.io.InputStream can not be casted to java.io.PushbackInputStream] */
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
 * @utbot.executesCondition {@code (diff): False}
 * @utbot.executesCondition {@code (hasDataDescriptor): True}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveInputStream#readFully(byte[])
 * @utbot.throwsException {@link java.lang.NullPointerException} in: readFully(new byte[4 * WORD]);
 *  */
    @Test
    public void testCloseEntry_ThrowNullPointerException_2() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(inf, "java.util.zip.Inflater", "finished", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "readBytesOfEntry", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "bytesReadFromStream", -255);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "hasDataDescriptor", true);
        
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
 * @utbot.executesCondition {@code (diff): True}
 * @utbot.invokes {@link java.io.PushbackInputStream#unread(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ((PushbackInputStream) in).unread(buf, lengthOfLastRead - diff, diff);
 *  */
    @Test
    public void testCloseEntry_ThrowNullPointerException_3() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(inf, "java.util.zip.Inflater", "finished", true);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        byte[] buf = {(byte) 0};
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "buf", buf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "current", current);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "bytesReadFromStream", -1);
        
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: skip(Long.MAX_VALUE);
 *  */
    @Test
    public void testCloseEntry_ThrowNullPointerException_4() throws Throwable  {
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        Object input = createInstance("java.nio.DirectByteBufferR");
        setField(input, "java.nio.Buffer", "position", -299786748);
        setField(input, "java.nio.Buffer", "limit", -299786748);
        Class inflaterClazz = Class.forName("java.util.zip.Inflater");
        Class inputType = Class.forName("java.nio.ByteBuffer");
        Method setInputMethod = inflaterClazz.getDeclaredMethod("setInput", inputType);
        setInputMethod.setAccessible(true);
        java.lang.Object[] setInputMethodArguments = new java.lang.Object[1];
        setInputMethodArguments[0] = input;
        setInputMethod.invoke(inf, setInputMethodArguments);
        setField(zipArchiveInputStream, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "inf", inf);
        ZipArchiveEntry current = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        current.setMethod(1);
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
        // 26 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 8 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
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
        
            java.lang.reflect.Method methodForGetDeclaredFields969193928820000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields969193928820000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass969193928828100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields969193928820000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass969193928828100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
                java.lang.reflect.Method methodForGetDeclaredFields969193930613400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields969193930613400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass969193930617800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields969193930613400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass969193930617800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields969193930760400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields969193930760400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass969193930810500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields969193930760400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass969193930810500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


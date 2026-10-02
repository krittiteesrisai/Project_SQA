package org.apache.commons.compress.utils;

import org.junit.Test;
import java.util.jar.JarInputStream;
import java.io.InputStream;
import java.util.zip.InflaterInputStream;
import java.io.IOException;
import java.util.zip.Inflater;
import java.lang.reflect.Constructor;
import java.security.CodeSigner;
import sun.security.util.ManifestEntryVerifier;
import sun.security.provider.Sun;
import java.util.LinkedHashMap;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.jar.JarEntry;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipException;
import java.util.Hashtable;
import java.util.Properties;
import java.util.HashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_compress_utils_BitInputStreamTest {
    ///region Test suites for executable org.apache.commons.compress.utils.BitInputStream.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method close()
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#close()}
 *  */
    @Test
    public void testClose() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "closed", true);
        BitInputStream bitInputStream = new BitInputStream(jarInputStream, null);
        
        bitInputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#close()}
 *  */
    @Test
    public void testClose_1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "closed", true);
        BitInputStream bitInputStream = new BitInputStream(jarInputStream, null);
        
        bitInputStream.close();
        
        InputStream bitInputStreamIn = ((InputStream) getFieldValue(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in"));
        boolean finalBitInputStreamInClosed = ((Boolean) getFieldValue(bitInputStreamIn, "java.util.zip.ZipInputStream", "closed"));
        
        assertTrue(finalBitInputStreamInClosed);
    }
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#close()}
 *  */
    @Test
    public void testClose_2() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(jarInputStream, "java.io.FilterInputStream", "in", in);
        BitInputStream bitInputStream = new BitInputStream(jarInputStream, null);
        
        bitInputStream.close();
        
        InputStream bitInputStreamIn = ((InputStream) getFieldValue(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in"));
        boolean finalBitInputStreamInClosed = ((Boolean) getFieldValue(bitInputStreamIn, "java.util.zip.ZipInputStream", "closed"));
        InputStream bitInputStreamIn1 = ((InputStream) getFieldValue(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in"));
        boolean finalBitInputStreamInClosed1 = ((Boolean) getFieldValue(bitInputStreamIn1, "java.util.zip.InflaterInputStream", "closed"));
        
        assertTrue(finalBitInputStreamInClosed);
        
        assertTrue(finalBitInputStreamInClosed1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method close()
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#close()}
 *  */
    @Test
    public void testClose_3() throws Exception  {
        InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(inflaterInputStream, "java.util.zip.InflaterInputStream", "closed", true);
        BitInputStream bitInputStream = new BitInputStream(inflaterInputStream, null);
        
        bitInputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#close()}
 *  */
    @Test
    public void testClose_4() throws Exception  {
        InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(inflaterInputStream, "java.io.FilterInputStream", "in", in);
        BitInputStream bitInputStream = new BitInputStream(inflaterInputStream, null);
        
        bitInputStream.close();
        
        InputStream bitInputStreamIn = ((InputStream) getFieldValue(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in"));
        boolean finalBitInputStreamInClosed = ((Boolean) getFieldValue(bitInputStreamIn, "java.util.zip.InflaterInputStream", "closed"));
        
        assertTrue(finalBitInputStreamInClosed);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#close()}
 * @utbot.invokes {@link java.io.InputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: in.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException() throws IOException  {
        BitInputStream bitInputStream = new BitInputStream(null, null);
        
        /* This test fails because method [org.apache.commons.compress.utils.BitInputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.BitInputStream.close(BitInputStream.java:59) */
        bitInputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#close()}
 * @utbot.invokes {@link java.io.InputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testClose_ThrowNullPointerException_1() throws Exception  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        Object cleanable = createInstance("java.io.FileCleanable");
        Object next = createInstance("jdk.internal.ref.CleanerImpl$CleanerCleanable");
        setField(cleanable, "jdk.internal.ref.PhantomCleanable", "next", next);
        setField(zsRef, "java.util.zip.Inflater$InflaterZStreamRef", "cleanable", cleanable);
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "inf", inf);
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "usesDefaultInflater", true);
        BitInputStream bitInputStream = new BitInputStream(jarInputStream, null);
        
        bitInputStream.close();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method close()
    
    @Test
    public void testClose1() throws Exception  {
        Object pipeInputStream = createInstance("java.lang.Process$PipeInputStream");
        Class bitInputStreamClazz = Class.forName("org.apache.commons.compress.utils.BitInputStream");
        Class pipeInputStreamType = Class.forName("java.io.InputStream");
        Class byteOrderType = Class.forName("java.nio.ByteOrder");
        Constructor bitInputStreamConstructor = bitInputStreamClazz.getDeclaredConstructor(pipeInputStreamType, byteOrderType);
        bitInputStreamConstructor.setAccessible(true);
        java.lang.Object[] bitInputStreamConstructorArguments = new java.lang.Object[2];
        bitInputStreamConstructorArguments[0] = pipeInputStream;
        bitInputStreamConstructorArguments[1] = ((Object) null);
        BitInputStream bitInputStream = ((BitInputStream) bitInputStreamConstructor.newInstance(bitInputStreamConstructorArguments));
        
        /* This test fails because method [org.apache.commons.compress.utils.BitInputStream.close] produces [java.lang.NullPointerException]
            java.base/java.io.FileInputStream.close(FileInputStream.java:443)
            org.apache.commons.compress.utils.BitInputStream.close(BitInputStream.java:59) */
        bitInputStream.close();
    }
    ///endregion
    
    ///region Errors report for close
    
    public void testClose_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 62 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 12 occurrences of:
        /* Unable to make field private static final java.util.concurrent.atomic.AtomicInteger sun.net.ResourceManager.numSockets accessible:
        module java.base does not "opens sun.net" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.utils.BitInputStream.clearBitCache
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clearBitCache()
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#clearBitCache()}
 *  */
    @Test
    public void testClearBitCache() throws Exception  {
        BitInputStream bitInputStream = ((BitInputStream) createInstance("org.apache.commons.compress.utils.BitInputStream"));
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "bitsCached", -255L);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "bitsCachedSize", -255);
        
        bitInputStream.clearBitCache();
        
        long finalBitInputStreamBitsCached = ((Long) getFieldValue(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "bitsCached"));
        int finalBitInputStreamBitsCachedSize = ((Integer) getFieldValue(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "bitsCachedSize"));
        
        assertEquals(0L, finalBitInputStreamBitsCached);
        
        assertEquals(0, finalBitInputStreamBitsCachedSize);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.utils.BitInputStream.readBits
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readBits(int)
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#readBits(int)}
 * @utbot.iterates iterate the loop {@code while(bitsCachedSize < count)} once
 *  */
    @Test
    public void testReadBits_IterateWhileLoop() throws Exception  {
        BitInputStream bitInputStream = ((BitInputStream) createInstance("org.apache.commons.compress.utils.BitInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in", in);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "bitsCachedSize", 31);
        
        long actual = bitInputStream.readBits(32);
        
        assertEquals(-1L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#readBits(int)}
 * @utbot.iterates iterate the loop {@code while(bitsCachedSize < count)} once
 *  */
    @Test
    public void testReadBits_IterateWhileLoop_1() throws Exception  {
        BitInputStream bitInputStream = ((BitInputStream) createInstance("org.apache.commons.compress.utils.BitInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        java.security.CodeSigner[] signers = {null};
        setField(first, "java.util.jar.JarEntry", "signers", signers);
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in", in);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "bitsCachedSize", 31);
        
        long actual = bitInputStream.readBits(32);
        
        assertEquals(-1L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#readBits(int)}
 * @utbot.iterates iterate the loop {@code while(bitsCachedSize < count)} once
 *  */
    @Test
    public void testReadBits_IterateWhileLoop_2() throws Exception  {
        BitInputStream bitInputStream = ((BitInputStream) createInstance("org.apache.commons.compress.utils.BitInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        byte[] singleByteBuf = {(byte) 0};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in", in);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "bitsCachedSize", 31);
        
        long actual = bitInputStream.readBits(32);
        
        assertEquals(-1L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#readBits(int)}
 * @utbot.iterates iterate the loop {@code while(bitsCachedSize < count)} once
 *  */
    @Test
    public void testReadBits_IterateWhileLoop_3() throws Exception  {
        BitInputStream bitInputStream = ((BitInputStream) createInstance("org.apache.commons.compress.utils.BitInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
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
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in", in);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "bitsCachedSize", 31);
        
        long actual = bitInputStream.readBits(32);
        
        assertEquals(-1L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#readBits(int)}
 * @utbot.iterates iterate the loop {@code while(bitsCachedSize < count)} once
 *  */
    @Test
    public void testReadBits_IterateWhileLoop_4() throws Exception  {
        BitInputStream bitInputStream = ((BitInputStream) createInstance("org.apache.commons.compress.utils.BitInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        java.security.cert.Certificate[] certs = {null};
        setField(first, "java.util.jar.JarEntry", "certs", certs);
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Sun verifiedSigners = ((Sun) createInstance("sun.security.provider.Sun"));
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
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in", in);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "bitsCachedSize", 31);
        
        InputStream bitInputStreamIn = ((InputStream) getFieldValue(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in"));
        JarEntry bitInputStreamInInFirst = ((JarEntry) getFieldValue(bitInputStreamIn, "java.util.jar.JarInputStream", "first"));
        java.security.cert.Certificate[] initialBitInputStreamInFirstCerts = ((java.security.cert.Certificate[]) getFieldValue(bitInputStreamInInFirst, "java.util.jar.JarEntry", "certs"));
        InputStream bitInputStreamIn1 = ((InputStream) getFieldValue(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in"));
        JarEntry bitInputStreamIn1InFirst = ((JarEntry) getFieldValue(bitInputStreamIn1, "java.util.jar.JarInputStream", "first"));
        java.security.CodeSigner[] initialBitInputStreamInFirstSigners = ((java.security.CodeSigner[]) getFieldValue(bitInputStreamIn1InFirst, "java.util.jar.JarEntry", "signers"));
        
        long actual = bitInputStream.readBits(32);
        
        assertEquals(-1L, actual);
        
        InputStream bitInputStreamIn2 = ((InputStream) getFieldValue(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in"));
        JarEntry bitInputStreamIn2InFirst = ((JarEntry) getFieldValue(bitInputStreamIn2, "java.util.jar.JarInputStream", "first"));
        java.security.cert.Certificate[] finalBitInputStreamInFirstCerts = ((java.security.cert.Certificate[]) getFieldValue(bitInputStreamIn2InFirst, "java.util.jar.JarEntry", "certs"));
        InputStream bitInputStreamIn3 = ((InputStream) getFieldValue(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in"));
        JarEntry bitInputStreamIn3InFirst = ((JarEntry) getFieldValue(bitInputStreamIn3, "java.util.jar.JarInputStream", "first"));
        java.security.CodeSigner[] finalBitInputStreamInFirstSigners = ((java.security.CodeSigner[]) getFieldValue(bitInputStreamIn3InFirst, "java.util.jar.JarEntry", "signers"));
        
        assertFalse(initialBitInputStreamInFirstCerts == finalBitInputStreamInFirstCerts);
        
        assertFalse(initialBitInputStreamInFirstSigners == finalBitInputStreamInFirstSigners);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readBits(int)
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#readBits(int)}
 * @utbot.executesCondition {@code (count < 0): False}
 * @utbot.executesCondition {@code (count > MAXIMUM_CACHE_SIZE): False}
 * @utbot.iterates iterate the loop {@code while(bitsCachedSize < count)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final long nextByte = in.read();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadBits_ThrowIndexOutOfBoundsException() throws Exception  {
        BitInputStream bitInputStream = ((BitInputStream) createInstance("org.apache.commons.compress.utils.BitInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        byte[] singleByteBuf = {};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in", in);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "bitsCachedSize", 31);
        
        bitInputStream.readBits(32);
    }
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#readBits(int)}
 * @utbot.executesCondition {@code (count < 0): False}
 * @utbot.executesCondition {@code (count > MAXIMUM_CACHE_SIZE): False}
 * @utbot.iterates iterate the loop {@code while(bitsCachedSize < count)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final long nextByte = in.read();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadBits_ThrowIndexOutOfBoundsException_1() throws Exception  {
        BitInputStream bitInputStream = ((BitInputStream) createInstance("org.apache.commons.compress.utils.BitInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        byte[] singleByteBuf = {};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in", in);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "bitsCachedSize", 31);
        
        bitInputStream.readBits(32);
    }
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#readBits(int)}
 * @utbot.executesCondition {@code (count < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: count < 0 || count > MAXIMUM_CACHE_SIZE
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReadBits_ThrowIllegalArgumentException() throws IOException  {
        BitInputStream bitInputStream = new BitInputStream(null, null);
        
        bitInputStream.readBits(-1);
    }
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#readBits(int)}
 * @utbot.executesCondition {@code (count < 0): False}
 * @utbot.executesCondition {@code (count > MAXIMUM_CACHE_SIZE): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: count < 0 || count > MAXIMUM_CACHE_SIZE
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReadBits_ThrowIllegalArgumentException_1() throws IOException  {
        BitInputStream bitInputStream = new BitInputStream(null, null);
        
        bitInputStream.readBits(65);
    }
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#readBits(int)}
 * @utbot.executesCondition {@code (count < 0): False}
 * @utbot.executesCondition {@code (count > MAXIMUM_CACHE_SIZE): False}
 * @utbot.iterates iterate the loop {@code while(bitsCachedSize < count)} once
 * @utbot.throwsException {@link java.lang.SecurityException} in: final long nextByte = in.read();
 *  */
    @Test(expected = SecurityException.class)
    public void testReadBits_ThrowSecurityException() throws Exception  {
        BitInputStream bitInputStream = ((BitInputStream) createInstance("org.apache.commons.compress.utils.BitInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Sun sigFileSigners = ((Sun) createInstance("sun.security.provider.Sun"));
        setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        ArrayList digests = new ArrayList();
        setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        byte[] singleByteBuf = {(byte) 0};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in", in);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "bitsCachedSize", 31);
        
        bitInputStream.readBits(32);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readBits(int)
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#readBits(int)}
 * @utbot.iterates iterate the loop {@code while(bitsCachedSize < count)} once
 * @utbot.throwsException {@link java.io.IOException} in: final long nextByte = in.read();
 *  */
    @Test(expected = IOException.class)
    public void testReadBits_ThrowIOException() throws Exception  {
        BitInputStream bitInputStream = ((BitInputStream) createInstance("org.apache.commons.compress.utils.BitInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in", in);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "bitsCachedSize", 31);
        
        bitInputStream.readBits(32);
    }
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#readBits(int)}
 * @utbot.iterates iterate the loop {@code while(bitsCachedSize < count)} once
 * @utbot.throwsException {@link java.io.IOException} in: final long nextByte = in.read();
 *  */
    @Test(expected = IOException.class)
    public void testReadBits_ThrowIOException_1() throws Exception  {
        BitInputStream bitInputStream = ((BitInputStream) createInstance("org.apache.commons.compress.utils.BitInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in", in);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "bitsCachedSize", 31);
        
        bitInputStream.readBits(32);
    }
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#readBits(int)}
 * @utbot.iterates iterate the loop {@code while(bitsCachedSize < count)} once
 * @utbot.throwsException {@link java.io.IOException} in: final long nextByte = in.read();
 *  */
    @Test(expected = IOException.class)
    public void testReadBits_ThrowIOException_2() throws Exception  {
        BitInputStream bitInputStream = ((BitInputStream) createInstance("org.apache.commons.compress.utils.BitInputStream"));
        CheckedInputStream in = ((CheckedInputStream) createInstance("java.util.zip.CheckedInputStream"));
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in", in);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "bitsCachedSize", 31);
        
        bitInputStream.readBits(32);
    }
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#readBits(int)}
 * @utbot.iterates iterate the loop {@code while(bitsCachedSize < count)} once
 * @utbot.throwsException {@link java.io.IOException} in: final long nextByte = in.read();
 *  */
    @Test(expected = IOException.class)
    public void testReadBits_ThrowIOException_3() throws Exception  {
        BitInputStream bitInputStream = ((BitInputStream) createInstance("org.apache.commons.compress.utils.BitInputStream"));
        CheckedInputStream in = ((CheckedInputStream) createInstance("java.util.zip.CheckedInputStream"));
        CheckedInputStream in1 = ((CheckedInputStream) createInstance("java.util.zip.CheckedInputStream"));
        InflaterInputStream in2 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in2, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in1, "java.io.FilterInputStream", "in", in2);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in", in);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "bitsCachedSize", 31);
        
        bitInputStream.readBits(32);
    }
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#readBits(int)}
 * @utbot.iterates iterate the loop {@code while(bitsCachedSize < count)} once
 * @utbot.throwsException {@link java.io.IOException} in: final long nextByte = in.read();
 *  */
    @Test(expected = IOException.class)
    public void testReadBits_ThrowIOException_4() throws Exception  {
        BitInputStream bitInputStream = ((BitInputStream) createInstance("org.apache.commons.compress.utils.BitInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 1L);
        byte[] singleByteBuf = {(byte) 0};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        Object in1 = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in", in);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "bitsCachedSize", 31);
        
        bitInputStream.readBits(32);
    }
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#readBits(int)}
 * @utbot.iterates iterate the loop {@code while(bitsCachedSize < count)} once
 * @utbot.throwsException {@link java.util.zip.ZipException} in: final long nextByte = in.read();
 *  */
    @Test(expected = ZipException.class)
    public void testReadBits_ThrowZipException() throws Exception  {
        BitInputStream bitInputStream = ((BitInputStream) createInstance("org.apache.commons.compress.utils.BitInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
        setField(in, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.util.zip.ZipInputStream", "remaining", 1L);
        byte[] singleByteBuf = {(byte) 0};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in1, "java.util.jar.JarInputStream", "first", first);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in", in);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "bitsCachedSize", 31);
        
        bitInputStream.readBits(32);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readBits(int)
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#readBits(int)}
 * @utbot.iterates iterate the loop {@code while(bitsCachedSize < count)} once
 * @utbot.throwsException {@link java.lang.ArithmeticException} 
 *  */
    @Test
    public void testReadBits_ThrowArithmeticException() throws Exception  {
        BitInputStream bitInputStream = ((BitInputStream) createInstance("org.apache.commons.compress.utils.BitInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Sun verifiedSigners = ((Sun) createInstance("sun.security.provider.Sun"));
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
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in", in);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "bitsCachedSize", 31);
        
        /* This test fails because method [org.apache.commons.compress.utils.BitInputStream.readBits] produces [java.lang.ArithmeticException: / by zero] */
        bitInputStream.readBits(32);
    }
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#readBits(int)}
 * @utbot.iterates iterate the loop {@code while(bitsCachedSize < count)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testReadBits_ThrowClassCastException() throws Exception  {
        BitInputStream bitInputStream = ((BitInputStream) createInstance("org.apache.commons.compress.utils.BitInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Sun verifiedSigners = ((Sun) createInstance("sun.security.provider.Sun"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        Properties sigFileSigners = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        Object object = createInstance("java.lang.Object");
        map.put(null, object);
        setField(sigFileSigners, "java.util.Properties", "map", map);
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
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        byte[] singleByteBuf = {(byte) 0};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in", in);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "bitsCachedSize", 31);
        
        /* This test fails because method [org.apache.commons.compress.utils.BitInputStream.readBits] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.security.CodeSigner[]] */
        bitInputStream.readBits(32);
    }
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#readBits(int)}
 * @utbot.iterates iterate the loop {@code while(bitsCachedSize < count)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testReadBits_ThrowClassCastException_1() throws Exception  {
        BitInputStream bitInputStream = ((BitInputStream) createInstance("org.apache.commons.compress.utils.BitInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        Sun verifiedSigners = ((Sun) createInstance("sun.security.provider.Sun"));
        setField(jv, "java.util.jar.JarVerifier", "verifiedSigners", verifiedSigners);
        Properties sigFileSigners = ((Properties) createInstance("java.util.Properties"));
        HashMap map = new HashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        map.put(integer, object);
        map.put(null, object);
        setField(sigFileSigners, "java.util.Properties", "map", map);
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
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        byte[] singleByteBuf = {(byte) 0};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "in", in);
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "bitsCachedSize", 31);
        
        /* This test fails because method [org.apache.commons.compress.utils.BitInputStream.readBits] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.security.CodeSigner[]] */
        bitInputStream.readBits(32);
    }
    
    /**
    @utbot.classUnderTest {@link BitInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.BitInputStream#readBits(int)}
 * @utbot.iterates iterate the loop {@code while(bitsCachedSize < count)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final long nextByte = in.read();
 *  */
    @Test
    public void testReadBits_ThrowNullPointerException() throws Exception  {
        BitInputStream bitInputStream = ((BitInputStream) createInstance("org.apache.commons.compress.utils.BitInputStream"));
        setField(bitInputStream, "org.apache.commons.compress.utils.BitInputStream", "bitsCachedSize", 31);
        
        /* This test fails because method [org.apache.commons.compress.utils.BitInputStream.readBits] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.BitInputStream.readBits(BitInputStream.java:86) */
        bitInputStream.readBits(32);
    }
    ///endregion
    
    ///region Errors report for readBits
    
    public void testReadBits_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 7 occurrences of:
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
        
                java.lang.reflect.Method methodForGetDeclaredFields976366231685600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields976366231685600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass976366231693800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields976366231685600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass976366231693800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields976366232439300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields976366232439300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass976366232443000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields976366232439300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass976366232443000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


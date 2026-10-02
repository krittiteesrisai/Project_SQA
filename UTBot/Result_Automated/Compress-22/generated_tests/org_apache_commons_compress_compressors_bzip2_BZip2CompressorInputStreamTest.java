package org.apache.commons.compress.compressors.bzip2;

import org.junit.Test;
import java.util.jar.JarInputStream;
import java.lang.reflect.Method;
import sun.security.util.ManifestEntryVerifier;
import java.util.jar.JarEntry;
import java.security.CodeSigner;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.zip.InflaterInputStream;
import java.io.IOException;
import java.util.zip.CheckedInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import java.io.DataInputStream;
import java.util.zip.Inflater;
import jdk.internal.ref.CleanerImpl.PhantomCleanableRef;
import jdk.internal.ref.CleanerImpl;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_compress_compressors_bzip2_BZip2CompressorInputStreamTest {
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matches([B, int)
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 3): False}
 * @utbot.executesCondition {@code (signature[0] != 'B'): True}
 *  */
    @Test
    public void testMatches_0OfSignatureNotEqualsB() {
        byte[] byteArray = {(byte) -127};
        
        boolean actual = BZip2CompressorInputStream.matches(byteArray, 3);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 3): False}
 * @utbot.executesCondition {@code (signature[0] != 'B'): False}
 * @utbot.executesCondition {@code (signature[1] != 'Z'): True}
 *  */
    @Test
    public void testMatches_1OfSignatureNotEqualsZ() {
        byte[] byteArray = {(byte) 66, (byte) -127};
        
        boolean actual = BZip2CompressorInputStream.matches(byteArray, 3);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 3): False}
 * @utbot.executesCondition {@code (signature[0] != 'B'): False}
 * @utbot.executesCondition {@code (signature[1] != 'Z'): False}
 * @utbot.executesCondition {@code (signature[2] != 'h'): True}
 *  */
    @Test
    public void testMatches_2OfSignatureNotEqualsH() {
        byte[] byteArray = new byte[11];
        byteArray[0] = (byte) 66;
        byteArray[1] = (byte) 90;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        
        boolean actual = BZip2CompressorInputStream.matches(byteArray, 3);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 3): False}
 * @utbot.executesCondition {@code (signature[0] != 'B'): False}
 * @utbot.executesCondition {@code (signature[1] != 'Z'): False}
 * @utbot.executesCondition {@code (signature[2] != 'h'): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testMatches_2OfSignatureEqualsH() {
        byte[] byteArray = new byte[11];
        byteArray[0] = (byte) 66;
        byteArray[1] = (byte) 90;
        byteArray[2] = (byte) 104;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        
        boolean actual = BZip2CompressorInputStream.matches(byteArray, 3);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 3): True}
 *  */
    @Test
    public void testMatches_LengthLessThan3() {
        boolean actual = BZip2CompressorInputStream.matches(null, 2);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matches([B, int)
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#matches(byte[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: signature[0] != 'B'
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(BZip2CompressorInputStream.java:1033) */
        BZip2CompressorInputStream.matches(byteArray, 3);
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (signature[0] != 'B'): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: signature[1] != 'Z'
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException_1() {
        byte[] byteArray = {(byte) 66};
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(BZip2CompressorInputStream.java:1037) */
        BZip2CompressorInputStream.matches(byteArray, 3);
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (signature[0] != 'B'): False}
 * @utbot.executesCondition {@code (signature[1] != 'Z'): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: signature[2] != 'h'
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException_2() {
        byte[] byteArray = {(byte) 66, (byte) 90};
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(BZip2CompressorInputStream.java:1041) */
        BZip2CompressorInputStream.matches(byteArray, 3);
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#matches(byte[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: signature[0] != 'B'
 *  */
    @Test
    public void testMatches_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(BZip2CompressorInputStream.java:1033) */
        BZip2CompressorInputStream.matches(null, 3);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.init
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method init(boolean)
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#init(boolean)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testInit_ReturnFalse() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class booleanType = boolean.class;
        Method initMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("init", booleanType);
        initMethod.setAccessible(true);
        java.lang.Object[] initMethodArguments = new java.lang.Object[1];
        initMethodArguments[0] = false;
        boolean actual = ((Boolean) initMethod.invoke(bZip2CompressorInputStream, initMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#init(boolean)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testInit_ReturnFalse_1() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
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
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class booleanType = boolean.class;
        Method initMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("init", booleanType);
        initMethod.setAccessible(true);
        java.lang.Object[] initMethodArguments = new java.lang.Object[1];
        initMethodArguments[0] = false;
        boolean actual = ((Boolean) initMethod.invoke(bZip2CompressorInputStream, initMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#init(boolean)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testInit_ReturnFalse_2() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        byte[] singleByteBuf = {(byte) 0};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class booleanType = boolean.class;
        Method initMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("init", booleanType);
        initMethod.setAccessible(true);
        java.lang.Object[] initMethodArguments = new java.lang.Object[1];
        initMethodArguments[0] = false;
        boolean actual = ((Boolean) initMethod.invoke(bZip2CompressorInputStream, initMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#init(boolean)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testInit_ReturnFalse_3() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
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
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class booleanType = boolean.class;
        Method initMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("init", booleanType);
        initMethod.setAccessible(true);
        java.lang.Object[] initMethodArguments = new java.lang.Object[1];
        initMethodArguments[0] = false;
        boolean actual = ((Boolean) initMethod.invoke(bZip2CompressorInputStream, initMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method init(boolean)
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#init(boolean)}
 * @utbot.executesCondition {@code (null == in): False}
 * @utbot.throwsException {@link java.io.IOException} in: int magic0 = this.in.read();
 *  */
    @Test(expected = IOException.class)
    public void testInit_ThrowIOException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class booleanType = boolean.class;
        Method initMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("init", booleanType);
        initMethod.setAccessible(true);
        java.lang.Object[] initMethodArguments = new java.lang.Object[1];
        initMethodArguments[0] = false;
        try {
            initMethod.invoke(bZip2CompressorInputStream, initMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#init(boolean)}
 * @utbot.executesCondition {@code (null == in): False}
 * @utbot.throwsException {@link java.io.IOException} in: int magic0 = this.in.read();
 *  */
    @Test(expected = IOException.class)
    public void testInit_ThrowIOException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class booleanType = boolean.class;
        Method initMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("init", booleanType);
        initMethod.setAccessible(true);
        java.lang.Object[] initMethodArguments = new java.lang.Object[1];
        initMethodArguments[0] = false;
        try {
            initMethod.invoke(bZip2CompressorInputStream, initMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#init(boolean)}
 * @utbot.executesCondition {@code (null == in): True}
 * @utbot.throwsException {@link java.io.IOException} when: null == in
 *  */
    @Test(expected = IOException.class)
    public void testInit_ThrowIOException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class booleanType = boolean.class;
        Method initMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("init", booleanType);
        initMethod.setAccessible(true);
        java.lang.Object[] initMethodArguments = new java.lang.Object[1];
        initMethodArguments[0] = false;
        try {
            initMethod.invoke(bZip2CompressorInputStream, initMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#init(boolean)}
 * @utbot.executesCondition {@code (null == in): False}
 * @utbot.throwsException {@link java.io.IOException} in: int magic0 = this.in.read();
 *  */
    @Test(expected = IOException.class)
    public void testInit_ThrowIOException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        CheckedInputStream in = ((CheckedInputStream) createInstance("java.util.zip.CheckedInputStream"));
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class booleanType = boolean.class;
        Method initMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("init", booleanType);
        initMethod.setAccessible(true);
        java.lang.Object[] initMethodArguments = new java.lang.Object[1];
        initMethodArguments[0] = false;
        try {
            initMethod.invoke(bZip2CompressorInputStream, initMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#init(boolean)}
 * @utbot.executesCondition {@code (null == in): False}
 * @utbot.throwsException {@link java.io.IOException} in: int magic0 = this.in.read();
 *  */
    @Test(expected = IOException.class)
    public void testInit_ThrowIOException_4() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        CheckedInputStream in = ((CheckedInputStream) createInstance("java.util.zip.CheckedInputStream"));
        CheckedInputStream in1 = ((CheckedInputStream) createInstance("java.util.zip.CheckedInputStream"));
        InflaterInputStream in2 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in2, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in1, "java.io.FilterInputStream", "in", in2);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class booleanType = boolean.class;
        Method initMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("init", booleanType);
        initMethod.setAccessible(true);
        java.lang.Object[] initMethodArguments = new java.lang.Object[1];
        initMethodArguments[0] = false;
        try {
            initMethod.invoke(bZip2CompressorInputStream, initMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method init(boolean)
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#init(boolean)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: int magic0 = this.in.read();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testInit_ThrowIndexOutOfBoundsException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        byte[] singleByteBuf = {};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class booleanType = boolean.class;
        Method initMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("init", booleanType);
        initMethod.setAccessible(true);
        java.lang.Object[] initMethodArguments = new java.lang.Object[1];
        initMethodArguments[0] = false;
        try {
            initMethod.invoke(bZip2CompressorInputStream, initMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#init(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int magic0 = this.in.read();
 *  */
    @Test(expected = NullPointerException.class)
    public void testInit_ThrowNullPointerException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class booleanType = boolean.class;
        Method initMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("init", booleanType);
        initMethod.setAccessible(true);
        java.lang.Object[] initMethodArguments = new java.lang.Object[1];
        initMethodArguments[0] = false;
        try {
            initMethod.invoke(bZip2CompressorInputStream, initMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for init
    
    public void testInit_errors()
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
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method read()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read()}
 * @utbot.executesCondition {@code (this.in != null): False}
 * @utbot.throwsException {@link java.io.IOException} when: this.in != null
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        
        bZip2CompressorInputStream.read();
    }
    ///endregion
    
    ///region Errors report for read
    
    public void testRead_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (offs < 0): False}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (offs + len > dest.length): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: offs + len > dest.length
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_2() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        byte[] byteArray = {(byte) -127};
        
        bZip2CompressorInputStream.read(byteArray, 1073750016, 2);
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (offs < 0): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: offs < 0
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        
        bZip2CompressorInputStream.read(null, -1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (offs < 0): False}
 * @utbot.executesCondition {@code (len < 0): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: len < 0
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_1() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        
        bZip2CompressorInputStream.read(null, 0, -1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (offs < 0): False}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (offs + len > dest.length): False}
 * @utbot.executesCondition {@code (this.in == null): True}
 * @utbot.throwsException {@link java.io.IOException} when: this.in == null
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException1() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        byte[] byteArray = {};
        
        bZip2CompressorInputStream.read(byteArray, 0, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (offs < 0): False}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: offs + len > dest.length
 *  */
    @Test
    public void testRead_ThrowNullPointerException() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read(BZip2CompressorInputStream.java:163) */
        bZip2CompressorInputStream.read(null, 0, 0);
    }
    ///endregion
    
    ///region Errors report for read
    
    public void testRead_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method close()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#close()}
 * @utbot.executesCondition {@code (inShadow != null): False}
 *  */
    @Test
    public void testClose_InShadowEqualsNull() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        
        bZip2CompressorInputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method close()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (inShadow != null): True}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#close()}
 * @utbot.executesCondition {@code (inShadow != System.in): False}
 *  */
    @Test
    public void testClose_InShadowEqualsSystemIn() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        BufferedInputStream in = ((BufferedInputStream) createInstance("java.io.BufferedInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        bZip2CompressorInputStream.close();
        
        InputStream finalBZip2CompressorInputStreamIn = ((InputStream) getFieldValue(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in"));
        
        assertNull(finalBZip2CompressorInputStreamIn);
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#close()}
 * @utbot.executesCondition {@code (inShadow != System.in): True}
 *  */
    @Test
    public void testClose_InShadowNotEqualsSystemIn() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        ZipInputStream in = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        bZip2CompressorInputStream.close();
        
        InputStream finalBZip2CompressorInputStreamIn = ((InputStream) getFieldValue(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in"));
        
        assertNull(finalBZip2CompressorInputStreamIn);
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#close()}
 * @utbot.executesCondition {@code (inShadow != System.in): True}
 *  */
    @Test
    public void testClose_InShadowNotEqualsSystemIn_1() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        ZipInputStream in = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in1, "java.util.zip.ZipInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        bZip2CompressorInputStream.close();
        
        InputStream finalBZip2CompressorInputStreamIn = ((InputStream) getFieldValue(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in"));
        
        assertNull(finalBZip2CompressorInputStreamIn);
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#close()}
 * @utbot.executesCondition {@code (inShadow != System.in): True}
 *  */
    @Test
    public void testClose_InShadowNotEqualsSystemIn_2() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in1, "java.util.zip.ZipInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        bZip2CompressorInputStream.close();
        
        InputStream finalBZip2CompressorInputStreamIn = ((InputStream) getFieldValue(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in"));
        
        assertNull(finalBZip2CompressorInputStreamIn);
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#close()}
 * @utbot.executesCondition {@code (inShadow != System.in): True}
 *  */
    @Test
    public void testClose_InShadowNotEqualsSystemIn_3() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        ZipInputStream in = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        bZip2CompressorInputStream.close();
        
        InputStream finalBZip2CompressorInputStreamIn = ((InputStream) getFieldValue(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in"));
        
        assertNull(finalBZip2CompressorInputStreamIn);
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#close()}
 * @utbot.executesCondition {@code (inShadow != System.in): True}
 *  */
    @Test
    public void testClose_InShadowNotEqualsSystemIn_4() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        DataInputStream in = ((DataInputStream) createInstance("java.io.DataInputStream"));
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in1, "java.util.zip.ZipInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        bZip2CompressorInputStream.close();
        
        InputStream finalBZip2CompressorInputStreamIn = ((InputStream) getFieldValue(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in"));
        
        assertNull(finalBZip2CompressorInputStreamIn);
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#close()}
 * @utbot.executesCondition {@code (inShadow != System.in): True}
 *  */
    @Test
    public void testClose_InShadowNotEqualsSystemIn_5() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        DataInputStream in = ((DataInputStream) createInstance("java.io.DataInputStream"));
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        JarInputStream in2 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in2, "java.util.zip.ZipInputStream", "closed", true);
        setField(in1, "java.io.FilterInputStream", "in", in2);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        bZip2CompressorInputStream.close();
        
        InputStream finalBZip2CompressorInputStreamIn = ((InputStream) getFieldValue(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in"));
        
        assertNull(finalBZip2CompressorInputStreamIn);
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#close()}
 * @utbot.executesCondition {@code (inShadow != System.in): True}
 *  */
    @Test
    public void testClose_InShadowNotEqualsSystemIn_6() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        DataInputStream in1 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        JarInputStream in2 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in2, "java.util.zip.ZipInputStream", "closed", true);
        setField(in1, "java.io.FilterInputStream", "in", in2);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        bZip2CompressorInputStream.close();
        
        InputStream finalBZip2CompressorInputStreamIn = ((InputStream) getFieldValue(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in"));
        
        assertNull(finalBZip2CompressorInputStreamIn);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#close()}
 * @utbot.executesCondition {@code (inShadow != null): True}
 * @utbot.executesCondition {@code (inShadow != System.in): True}
 * @utbot.invokes {@link java.io.InputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testClose_ThrowNullPointerException() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        CleanerImpl.PhantomCleanableRef cleanable = ((CleanerImpl.PhantomCleanableRef) createInstance("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        setField(zsRef, "java.util.zip.Inflater$InflaterZStreamRef", "cleanable", cleanable);
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(in, "java.util.zip.InflaterInputStream", "inf", inf);
        setField(in, "java.util.zip.InflaterInputStream", "usesDefaultInflater", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        bZip2CompressorInputStream.close();
    }
    ///endregion
    
    ///region Errors report for close
    
    public void testClose_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field private static final java.util.concurrent.atomic.AtomicInteger sun.net.ResourceManager.numSockets accessible:
        module java.base does not "opens sun.net" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method read0()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.activatesSwitch {@code switch(currentState) case: EOF}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testRead0_ReturnNegative1() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        int actual = ((Integer) read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method read0()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.activatesSwitch {@code switch(currentState) case: default}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: switch(currentState) case: default
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRead0_ThrowIllegalStateException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -247);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.activatesSwitch {@code switch(currentState) case: NO_RAND_PART_A_STATE}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: switch(currentState) case: NO_RAND_PART_A_STATE
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRead0_ThrowIllegalStateException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 5);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.activatesSwitch {@code switch(currentState) case: START_BLOCK_STATE}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: switch(currentState) case: START_BLOCK_STATE
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRead0_ThrowIllegalStateException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 1);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.activatesSwitch {@code switch(currentState) case: RAND_PART_A_STATE}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: switch(currentState) case: RAND_PART_A_STATE
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRead0_ThrowIllegalStateException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 2);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read0()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setupRandPartB();
 *  */
    @Test
    public void testRead0_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1073741824);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:889)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setupNoRandPartB();
 *  */
    @Test
    public void testRead0_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 6);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", Integer.MIN_VALUE);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:930)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:222) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setupNoRandPartB();
 *  */
    @Test
    public void testRead0_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 6);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1073741824);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:867)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:935)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:222) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setupNoRandPartB();
 *  */
    @Test
    public void testRead0_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 6);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -63);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -194);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", -256);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:867)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:928)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:222) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setupRandPartB();
 *  */
    @Test
    public void testRead0_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", Integer.MIN_VALUE);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:841)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:907)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setupRandPartC();
 *  */
    @Test
    public void testRead0_ThrowArrayIndexOutOfBoundsException_7() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", Integer.MIN_VALUE);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 4);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", Integer.MAX_VALUE);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1073741824);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0000');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:841)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:921)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:215) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setupRandPartB();
 *  */
    @Test
    public void testRead0_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0000');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) 0, (byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:890)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setupNoRandPartB();
 *  */
    @Test
    public void testRead0_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 6);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0000');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {-255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) 0, (byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:931)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:222) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setupRandPartB();
 *  */
    @Test
    public void testRead0_ThrowArrayIndexOutOfBoundsException_8() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", 536885247);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", 1073743872);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) 0, (byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:842)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:887)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setupNoRandPartC();
 *  */
    @Test
    public void testRead0_ThrowArrayIndexOutOfBoundsException_9() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", Integer.MIN_VALUE);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 7);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", Integer.MAX_VALUE);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) 0, (byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:869)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC(BZip2CompressorInputStream.java:950)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:226) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setupNoRandPartB();
 *  */
    @Test
    public void testRead0_ThrowNullPointerException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 6);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:930)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:222) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setupNoRandPartB();
 *  */
    @Test
    public void testRead0_ThrowNullPointerException_5() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 6);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:867)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:935)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:222) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setupNoRandPartC();
 *  */
    @Test
    public void testRead0_ThrowNullPointerException_7() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 7);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 63);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '@');
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC(BZip2CompressorInputStream.java:943)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:226) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setupRandPartB();
 *  */
    @Test
    public void testRead0_ThrowNullPointerException_8() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 3);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:889)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setupRandPartB();
 *  */
    @Test
    public void testRead0_ThrowNullPointerException_9() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 2);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:841)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:907)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setupRandPartC();
 *  */
    @Test
    public void testRead0_ThrowNullPointerException_11() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 4);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0000');
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:914)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:215) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setupRandPartB();
 *  */
    @Test
    public void testRead0_ThrowNullPointerException_12() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -1);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock(BZip2CompressorInputStream.java:327)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:858)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:887)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setupNoRandPartC();
 *  */
    @Test
    public void testRead0_ThrowNullPointerException_13() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", Integer.MIN_VALUE);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 7);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", Integer.MAX_VALUE);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:867)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC(BZip2CompressorInputStream.java:950)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:226) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setupNoRandPartB();
 *  */
    @Test
    public void testRead0_ThrowNullPointerException_16() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 6);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -1);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock(BZip2CompressorInputStream.java:327)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:877)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:935)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:222) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setupRandPartB();
 *  */
    @Test
    public void testRead0_ThrowNullPointerException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 3);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:889)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setupNoRandPartB();
 *  */
    @Test
    public void testRead0_ThrowNullPointerException_4() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 6);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:930)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:222) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setupRandPartB();
 *  */
    @Test
    public void testRead0_ThrowNullPointerException_14() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", 155189247);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -155189248);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:841)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:887)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setupNoRandPartC();
 *  */
    @Test
    public void testRead0_ThrowNullPointerException_15() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", Integer.MIN_VALUE);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 7);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", Integer.MAX_VALUE);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:867)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC(BZip2CompressorInputStream.java:950)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:226) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setupRandPartB();
 *  */
    @Test
    public void testRead0_ThrowNullPointerException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0000');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:890)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setupNoRandPartB();
 *  */
    @Test
    public void testRead0_ThrowNullPointerException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 6);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0000');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:931)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:222) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setupNoRandPartB();
 *  */
    @Test
    public void testRead0_ThrowNullPointerException_6() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 6);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -127);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -130);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:869)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:928)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:222) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#read0()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setupRandPartB();
 *  */
    @Test
    public void testRead0_ThrowNullPointerException_10() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 2);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:842)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:907)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method read0()
    
    @Test
    public void testRead01() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 4);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 1073741824);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_rNToGo", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0001');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        int actual = ((Integer) read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments));
        
        assertEquals(0, actual);
        
        int finalBZip2CompressorInputStreamCurrentState = ((Integer) getFieldValue(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState"));
        int finalBZip2CompressorInputStreamSu_i2 = ((Integer) getFieldValue(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2"));
        int finalBZip2CompressorInputStreamSu_rNToGo = ((Integer) getFieldValue(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_rNToGo"));
        
        assertEquals(3, finalBZip2CompressorInputStreamCurrentState);
        
        assertEquals(0, finalBZip2CompressorInputStreamSu_i2);
        
        assertEquals(0, finalBZip2CompressorInputStreamSu_rNToGo);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method read0()
    
    @Test(expected = IOException.class)
    public void testRead02() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 1073741824);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 6);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", 8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 1);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IOException.class)
    public void testRead03() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 1073741824);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", 8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 1);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IOException.class)
    public void testRead04() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -2147483647);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 1);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IOException.class)
    public void testRead05() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 6);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 1073741825);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 2147483646);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0000');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IOException.class)
    public void testRead06() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 1073741825);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 2147483646);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_rNToGo", 2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0000');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {
            (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
            (byte) 1
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IOException.class)
    public void testRead07() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 1073741823);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 2147483646);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_rNToGo", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0000');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method read0()
    
    @Test
    public void testRead08() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", 4096);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -2147483647);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1073741824);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 9]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:841)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:887)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead09() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -2147483647);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -2147483647);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 32);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = new byte[33];
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:842)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:907)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead010() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 6);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -2147483647);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 1);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(BZip2CompressorInputStream.java:381)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte(BZip2CompressorInputStream.java:419)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock(BZip2CompressorInputStream.java:276)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:878)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:935)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:222) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead011() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -2147483647);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 1);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(BZip2CompressorInputStream.java:381)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte(BZip2CompressorInputStream.java:419)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock(BZip2CompressorInputStream.java:276)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:859)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:907)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead012() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 7);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 2147483646);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 1073741824);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0001');
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(BZip2CompressorInputStream.java:381)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte(BZip2CompressorInputStream.java:419)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock(BZip2CompressorInputStream.java:276)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:878)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC(BZip2CompressorInputStream.java:950)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:226) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead013() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 4);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 2147483646);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 1073741824);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0001');
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(BZip2CompressorInputStream.java:381)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte(BZip2CompressorInputStream.java:419)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock(BZip2CompressorInputStream.java:276)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:859)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:921)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:215) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead014() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -2147483647);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 1);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock(BZip2CompressorInputStream.java:327)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:858)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:907)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead015() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 7);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0000');
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock(BZip2CompressorInputStream.java:327)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:877)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC(BZip2CompressorInputStream.java:950)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:226) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead016() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 4);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0000');
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock(BZip2CompressorInputStream.java:327)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:858)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:921)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:215) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead017() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", 1);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:841)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:887)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead018() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 6);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 1);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock(BZip2CompressorInputStream.java:327)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:877)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:928)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:222) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead019() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 1073741825);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_rNToGo", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0000');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:855)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:921)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:904)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead020() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 1073741825);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_rNToGo", 2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0000');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {
            (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
            (byte) 1
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:855)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:921)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:904)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead021() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 6);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 1);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(BZip2CompressorInputStream.java:381)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte(BZip2CompressorInputStream.java:419)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock(BZip2CompressorInputStream.java:276)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:878)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:928)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:222) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead022() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 1073741825);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 2147483646);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_rNToGo", 2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0000');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(BZip2CompressorInputStream.java:381)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte(BZip2CompressorInputStream.java:419)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock(BZip2CompressorInputStream.java:276)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:859)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:921)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:904)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead023() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 6);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 1073741825);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 2147483646);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0000');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(BZip2CompressorInputStream.java:381)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte(BZip2CompressorInputStream.java:419)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock(BZip2CompressorInputStream.java:276)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:878)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC(BZip2CompressorInputStream.java:950)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:933)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:222) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead024() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", 4096);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -2147483647);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:842)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:887)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead025() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 1073741825);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_rNToGo", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0000');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {
            (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
            (byte) 1
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:914)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:904)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead026() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 1073741825);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_rNToGo", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0000');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock(BZip2CompressorInputStream.java:327)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:858)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:921)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:904)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead027() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 6);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 1073741825);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0000');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {
            (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
            (byte) 1
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC(BZip2CompressorInputStream.java:943)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:933)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:222) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead028() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 6);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 1073741825);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0000');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock(BZip2CompressorInputStream.java:327)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:877)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC(BZip2CompressorInputStream.java:950)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:933)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:222) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead029() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 6);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 1073741825);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0000');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:873)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC(BZip2CompressorInputStream.java:950)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:933)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:222) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead030() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 6);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -2147483647);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -2147483647);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:873)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:935)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:222) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead031() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 6);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", 4096);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -2147483647);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:873)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:928)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:222) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead032() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -2147483647);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -2147483647);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_rNToGo", 2);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:855)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:907)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead033() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -2147483647);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -2147483647);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_rNToGo", 1);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:855)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:907)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead034() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 4);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 1073741824);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_rNToGo", 2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0001');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:855)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:921)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:215) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead035() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 4);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 1073741824);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_rNToGo", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0001');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:855)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:921)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:215) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead036() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", 4096);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -2147483647);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_rNToGo", 2);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:855)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:887)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead037() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", 4096);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -2147483647);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_rNToGo", 1);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:855)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:887)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:211) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRead038() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 7);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 1073741824);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '\u0001');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:873)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC(BZip2CompressorInputStream.java:950)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0(BZip2CompressorInputStream.java:226) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method read0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("read0");
        read0Method.setAccessible(true);
        java.lang.Object[] read0MethodArguments = new java.lang.Object[0];
        try {
            read0Method.invoke(bZip2CompressorInputStream, read0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for read0
    
    public void testRead0_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.complete
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method complete()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#complete()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.storedCombinedCRC = bsGetInt();
 *  */
    @Test
    public void testComplete_ThrowNullPointerException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.complete] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(BZip2CompressorInputStream.java:381)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetInt(BZip2CompressorInputStream.java:423)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.complete(BZip2CompressorInputStream.java:346) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method completeMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("complete");
        completeMethod.setAccessible(true);
        java.lang.Object[] completeMethodArguments = new java.lang.Object[0];
        try {
            completeMethod.invoke(bZip2CompressorInputStream, completeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#complete()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.storedCombinedCRC = bsGetInt();
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 9);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.complete] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(BZip2CompressorInputStream.java:381)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetInt(BZip2CompressorInputStream.java:423)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.complete(BZip2CompressorInputStream.java:346) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method completeMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("complete");
        completeMethod.setAccessible(true);
        java.lang.Object[] completeMethodArguments = new java.lang.Object[0];
        try {
            completeMethod.invoke(bZip2CompressorInputStream, completeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method complete()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#complete()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testComplete_ThrowIOException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method completeMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("complete");
        completeMethod.setAccessible(true);
        java.lang.Object[] completeMethodArguments = new java.lang.Object[0];
        try {
            completeMethod.invoke(bZip2CompressorInputStream, completeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#complete()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testComplete_ThrowIOException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method completeMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("complete");
        completeMethod.setAccessible(true);
        java.lang.Object[] completeMethodArguments = new java.lang.Object[0];
        try {
            completeMethod.invoke(bZip2CompressorInputStream, completeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method complete()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#complete()}
 * @utbot.invokes org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetInt()
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testComplete_ThrowNullPointerException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method completeMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("complete");
        completeMethod.setAccessible(true);
        java.lang.Object[] completeMethodArguments = new java.lang.Object[0];
        try {
            completeMethod.invoke(bZip2CompressorInputStream, completeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method complete()
    
    @Test
    public void testComplete1() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 1073741824);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method completeMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("complete");
        completeMethod.setAccessible(true);
        java.lang.Object[] completeMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) completeMethod.invoke(bZip2CompressorInputStream, completeMethodArguments));
        
        assertTrue(actual);
        
        int finalBZip2CompressorInputStreamBsLive = ((Integer) getFieldValue(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive"));
        
        assertEquals(1073741792, finalBZip2CompressorInputStreamBsLive);
    }
    ///endregion
    
    ///region Errors report for complete
    
    public void testComplete_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAndMoveToFrontDecode0(int)
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode0(int)}
 * @utbot.invokes org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsR(int)
 * @utbot.returnsFrom {@code return dataShadow.perm[zt][zvec - dataShadow.base[zt][zn]];}
 *  */
    @Test
    public void testGetAndMoveToFrontDecode0_ZvecLessOrEqualZnOfLimit_zt() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 1);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] selector = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "selector", selector);
        int[][] limit = new int[1][];
        int[] intArray = {0, 0};
        limit[0] = intArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "base", limit);
        int[][] perm = new int[1][];
        int[] intArray1 = {1};
        perm[0] = intArray1;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "perm", perm);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "minLens", intArray1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method getAndMoveToFrontDecode0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode0", intType);
        getAndMoveToFrontDecode0Method.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecode0MethodArguments = new java.lang.Object[1];
        getAndMoveToFrontDecode0MethodArguments[0] = 0;
        int actual = ((Integer) getAndMoveToFrontDecode0Method.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecode0MethodArguments));
        
        assertEquals(1, actual);
        
        int finalBZip2CompressorInputStreamBsLive = ((Integer) getFieldValue(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive"));
        
        assertEquals(0, finalBZip2CompressorInputStreamBsLive);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAndMoveToFrontDecode0(int)
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode0(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int zt = dataShadow.selector[groupNo] & 0xff;
 *  */
    @Test
    public void testGetAndMoveToFrontDecode0_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] selector = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "selector", selector);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(BZip2CompressorInputStream.java:771) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method getAndMoveToFrontDecode0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode0", intType);
        getAndMoveToFrontDecode0Method.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecode0MethodArguments = new java.lang.Object[1];
        getAndMoveToFrontDecode0MethodArguments[0] = 129;
        try {
            getAndMoveToFrontDecode0Method.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecode0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode0(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int[] limit_zt = dataShadow.limit[zt];
 *  */
    @Test
    public void testGetAndMoveToFrontDecode0_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] selector = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "selector", selector);
        int[][] limit = {
            null,
            null
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(BZip2CompressorInputStream.java:772) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method getAndMoveToFrontDecode0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode0", intType);
        getAndMoveToFrontDecode0Method.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecode0MethodArguments = new java.lang.Object[1];
        getAndMoveToFrontDecode0MethodArguments[0] = 1;
        try {
            getAndMoveToFrontDecode0Method.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecode0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode0(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int zn = dataShadow.minLens[zt];
 *  */
    @Test
    public void testGetAndMoveToFrontDecode0_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] selector = {(byte) 1};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "selector", selector);
        int[][] limit = {
            null,
            null
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        int[] minLens = {-255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "minLens", minLens);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(BZip2CompressorInputStream.java:773) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method getAndMoveToFrontDecode0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode0", intType);
        getAndMoveToFrontDecode0Method.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecode0MethodArguments = new java.lang.Object[1];
        getAndMoveToFrontDecode0MethodArguments[0] = 0;
        try {
            getAndMoveToFrontDecode0Method.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecode0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode0(int)}
 * @utbot.iterates iterate the loop {@code while(zvec > limit_zt[zn])} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(zvec > limit_zt[zn])
 *  */
    @Test
    public void testGetAndMoveToFrontDecode0_ThrowArrayIndexOutOfBoundsException_7() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", 253);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 1);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] selector = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "selector", selector);
        int[][] limit = new int[1][];
        int[] intArray = {-1};
        limit[0] = intArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        int[] minLens = {0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "minLens", minLens);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(BZip2CompressorInputStream.java:778) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method getAndMoveToFrontDecode0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode0", intType);
        getAndMoveToFrontDecode0Method.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecode0MethodArguments = new java.lang.Object[1];
        getAndMoveToFrontDecode0MethodArguments[0] = 0;
        try {
            getAndMoveToFrontDecode0Method.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecode0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode0(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return dataShadow.perm[zt][zvec - dataShadow.base[zt][zn]];
 *  */
    @Test
    public void testGetAndMoveToFrontDecode0_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 1);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] selector = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "selector", selector);
        int[][] limit = new int[2][];
        int[] intArray = {0, 0};
        limit[0] = intArray;
        limit[1] = ((int[]) null);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        int[][] perm = {};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "perm", perm);
        int[] minLens = {1};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "minLens", minLens);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(BZip2CompressorInputStream.java:798) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method getAndMoveToFrontDecode0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode0", intType);
        getAndMoveToFrontDecode0Method.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecode0MethodArguments = new java.lang.Object[1];
        getAndMoveToFrontDecode0MethodArguments[0] = 0;
        try {
            getAndMoveToFrontDecode0Method.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecode0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode0(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return dataShadow.perm[zt][zvec - dataShadow.base[zt][zn]];
 *  */
    @Test
    public void testGetAndMoveToFrontDecode0_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 1);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] selector = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "selector", selector);
        int[][] limit = new int[2][];
        int[] intArray = {0, 0};
        limit[0] = intArray;
        limit[1] = ((int[]) null);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        int[][] base = {};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "base", base);
        int[][] perm = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "perm", perm);
        int[] minLens = {1};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "minLens", minLens);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(BZip2CompressorInputStream.java:798) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method getAndMoveToFrontDecode0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode0", intType);
        getAndMoveToFrontDecode0Method.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecode0MethodArguments = new java.lang.Object[1];
        getAndMoveToFrontDecode0MethodArguments[0] = 0;
        try {
            getAndMoveToFrontDecode0Method.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecode0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode0(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return dataShadow.perm[zt][zvec - dataShadow.base[zt][zn]];
 *  */
    @Test
    public void testGetAndMoveToFrontDecode0_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 1);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] selector = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "selector", selector);
        int[][] limit = new int[1][];
        int[] intArray = {0, 0};
        limit[0] = intArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        int[][] base = new int[1][];
        int[] intArray1 = {1};
        base[0] = intArray1;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "base", base);
        int[][] perm = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "perm", perm);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "minLens", intArray1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(BZip2CompressorInputStream.java:798) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method getAndMoveToFrontDecode0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode0", intType);
        getAndMoveToFrontDecode0Method.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecode0MethodArguments = new java.lang.Object[1];
        getAndMoveToFrontDecode0MethodArguments[0] = 0;
        try {
            getAndMoveToFrontDecode0Method.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecode0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode0(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return dataShadow.perm[zt][zvec - dataShadow.base[zt][zn]];
 *  */
    @Test
    public void testGetAndMoveToFrontDecode0_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 1);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] selector = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "selector", selector);
        int[][] limit = new int[1][];
        int[] intArray = {0, 0};
        limit[0] = intArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        int[][] base = new int[1][];
        int[] intArray1 = {0, 4};
        base[0] = intArray1;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "base", base);
        int[][] perm = new int[1][];
        int[] intArray2 = {1};
        perm[0] = intArray2;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "perm", perm);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "minLens", intArray2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0] produces [java.lang.ArrayIndexOutOfBoundsException: Index -4 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(BZip2CompressorInputStream.java:798) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method getAndMoveToFrontDecode0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode0", intType);
        getAndMoveToFrontDecode0Method.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecode0MethodArguments = new java.lang.Object[1];
        getAndMoveToFrontDecode0MethodArguments[0] = 0;
        try {
            getAndMoveToFrontDecode0Method.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecode0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode0(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int zt = dataShadow.selector[groupNo] & 0xff;
 *  */
    @Test
    public void testGetAndMoveToFrontDecode0_ThrowNullPointerException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(BZip2CompressorInputStream.java:771) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method getAndMoveToFrontDecode0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode0", intType);
        getAndMoveToFrontDecode0Method.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecode0MethodArguments = new java.lang.Object[1];
        getAndMoveToFrontDecode0MethodArguments[0] = -255;
        try {
            getAndMoveToFrontDecode0Method.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecode0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode0(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int zt = dataShadow.selector[groupNo] & 0xff;
 *  */
    @Test
    public void testGetAndMoveToFrontDecode0_ThrowNullPointerException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(BZip2CompressorInputStream.java:771) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method getAndMoveToFrontDecode0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode0", intType);
        getAndMoveToFrontDecode0Method.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecode0MethodArguments = new java.lang.Object[1];
        getAndMoveToFrontDecode0MethodArguments[0] = -255;
        try {
            getAndMoveToFrontDecode0Method.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecode0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode0(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int[] limit_zt = dataShadow.limit[zt];
 *  */
    @Test
    public void testGetAndMoveToFrontDecode0_ThrowNullPointerException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] selector = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "selector", selector);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(BZip2CompressorInputStream.java:772) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method getAndMoveToFrontDecode0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode0", intType);
        getAndMoveToFrontDecode0Method.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecode0MethodArguments = new java.lang.Object[1];
        getAndMoveToFrontDecode0MethodArguments[0] = 1;
        try {
            getAndMoveToFrontDecode0Method.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecode0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode0(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(zvec > limit_zt[zn])
 *  */
    @Test
    public void testGetAndMoveToFrontDecode0_ThrowNullPointerException_4() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", -255);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] selector = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "selector", selector);
        int[][] limit = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        int[] minLens = {-255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "minLens", minLens);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(BZip2CompressorInputStream.java:778) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method getAndMoveToFrontDecode0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode0", intType);
        getAndMoveToFrontDecode0Method.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecode0MethodArguments = new java.lang.Object[1];
        getAndMoveToFrontDecode0MethodArguments[0] = 0;
        try {
            getAndMoveToFrontDecode0Method.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecode0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode0(int)}
 * @utbot.iterates iterate the loop {@code while(zvec > limit_zt[zn])} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int thech = inShadow.read();
 *  */
    @Test
    public void testGetAndMoveToFrontDecode0_ThrowNullPointerException_5() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", 255);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] selector = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "selector", selector);
        int[][] limit = new int[1][];
        int[] intArray = {-1};
        limit[0] = intArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        int[] minLens = {0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "minLens", minLens);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(BZip2CompressorInputStream.java:781) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method getAndMoveToFrontDecode0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode0", intType);
        getAndMoveToFrontDecode0Method.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecode0MethodArguments = new java.lang.Object[1];
        getAndMoveToFrontDecode0MethodArguments[0] = 0;
        try {
            getAndMoveToFrontDecode0Method.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecode0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode0(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int zvec = bsR(zn);
 *  */
    @Test
    public void testGetAndMoveToFrontDecode0_ThrowNullPointerException_10() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 31);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] selector = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "selector", selector);
        int[][] limit = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        int[] minLens = {32};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "minLens", minLens);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(BZip2CompressorInputStream.java:381)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(BZip2CompressorInputStream.java:774) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method getAndMoveToFrontDecode0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode0", intType);
        getAndMoveToFrontDecode0Method.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecode0MethodArguments = new java.lang.Object[1];
        getAndMoveToFrontDecode0MethodArguments[0] = 0;
        try {
            getAndMoveToFrontDecode0Method.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecode0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode0(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int zn = dataShadow.minLens[zt];
 *  */
    @Test
    public void testGetAndMoveToFrontDecode0_ThrowNullPointerException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] selector = {(byte) 1};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "selector", selector);
        int[][] limit = {
            null,
            null
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(BZip2CompressorInputStream.java:773) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method getAndMoveToFrontDecode0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode0", intType);
        getAndMoveToFrontDecode0Method.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecode0MethodArguments = new java.lang.Object[1];
        getAndMoveToFrontDecode0MethodArguments[0] = 0;
        try {
            getAndMoveToFrontDecode0Method.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecode0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode0(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return dataShadow.perm[zt][zvec - dataShadow.base[zt][zn]];
 *  */
    @Test
    public void testGetAndMoveToFrontDecode0_ThrowNullPointerException_8() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 1);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] selector = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "selector", selector);
        int[][] limit = new int[1][];
        int[] intArray = {0, 0};
        limit[0] = intArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        int[][] base = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "base", base);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "perm", base);
        int[] minLens = {1};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "minLens", minLens);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(BZip2CompressorInputStream.java:798) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method getAndMoveToFrontDecode0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode0", intType);
        getAndMoveToFrontDecode0Method.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecode0MethodArguments = new java.lang.Object[1];
        getAndMoveToFrontDecode0MethodArguments[0] = 0;
        try {
            getAndMoveToFrontDecode0Method.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecode0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode0(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return dataShadow.perm[zt][zvec - dataShadow.base[zt][zn]];
 *  */
    @Test
    public void testGetAndMoveToFrontDecode0_ThrowNullPointerException_9() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 1);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] selector = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "selector", selector);
        int[][] limit = new int[1][];
        int[] intArray = {0, 0};
        limit[0] = intArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "base", limit);
        int[][] perm = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "perm", perm);
        int[] minLens = {1};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "minLens", minLens);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(BZip2CompressorInputStream.java:798) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method getAndMoveToFrontDecode0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode0", intType);
        getAndMoveToFrontDecode0Method.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecode0MethodArguments = new java.lang.Object[1];
        getAndMoveToFrontDecode0MethodArguments[0] = 0;
        try {
            getAndMoveToFrontDecode0Method.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecode0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode0(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return dataShadow.perm[zt][zvec - dataShadow.base[zt][zn]];
 *  */
    @Test
    public void testGetAndMoveToFrontDecode0_ThrowNullPointerException_7() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -251);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] selector = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "selector", selector);
        int[][] limit = new int[1][];
        int[] intArray = {0};
        limit[0] = intArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "minLens", intArray);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(BZip2CompressorInputStream.java:798) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method getAndMoveToFrontDecode0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode0", intType);
        getAndMoveToFrontDecode0Method.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecode0MethodArguments = new java.lang.Object[1];
        getAndMoveToFrontDecode0MethodArguments[0] = 0;
        try {
            getAndMoveToFrontDecode0Method.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecode0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode0(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return dataShadow.perm[zt][zvec - dataShadow.base[zt][zn]];
 *  */
    @Test
    public void testGetAndMoveToFrontDecode0_ThrowNullPointerException_6() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 1);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] selector = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "selector", selector);
        int[][] limit = new int[1][];
        int[] intArray = {0, 0};
        limit[0] = intArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        int[][] perm = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "perm", perm);
        int[] minLens = {1};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "minLens", minLens);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(BZip2CompressorInputStream.java:798) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method getAndMoveToFrontDecode0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode0", intType);
        getAndMoveToFrontDecode0Method.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecode0MethodArguments = new java.lang.Object[1];
        getAndMoveToFrontDecode0MethodArguments[0] = 0;
        try {
            getAndMoveToFrontDecode0Method.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecode0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method getAndMoveToFrontDecode0(int)
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode0(int)}
 * @utbot.invokes org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsR(int)
 * @utbot.iterates iterate the loop {@code while(zvec > limit_zt[zn])} once
 * @utbot.throwsException {@link java.io.IOException} in: final int thech = inShadow.read();
 *  */
    @Test(expected = IOException.class)
    public void testGetAndMoveToFrontDecode0_ThrowIOException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -1);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] selector = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "selector", selector);
        int[][] limit = new int[1][];
        int[] intArray = {-1};
        limit[0] = intArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        int[] minLens = {0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "minLens", minLens);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method getAndMoveToFrontDecode0Method = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode0", intType);
        getAndMoveToFrontDecode0Method.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecode0MethodArguments = new java.lang.Object[1];
        getAndMoveToFrontDecode0MethodArguments[0] = 0;
        try {
            getAndMoveToFrontDecode0Method.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecode0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getAndMoveToFrontDecode0
    
    public void testGetAndMoveToFrontDecode0_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createHuffmanDecodingTables(int, int)
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 *  */
    @Test
    public void testCreateHuffmanDecodingTables() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = -255;
        createHuffmanDecodingTablesMethodArguments[1] = 0;
        createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createHuffmanDecodingTables(int, int)
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 * @utbot.iterates iterate the loop {@code for(int t = 0; t < nGroups; t++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: hbCreateDecodeTables(limit[t], base[t], perm[t], len[t], minLen, maxLen, alphaSize);
 *  */
    @Test
    public void testCreateHuffmanDecodingTables_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[][] limit = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "base", limit);
        int[][] perm = {};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "perm", perm);
        char[][] temp_charArray2d = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:573) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 0;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 * @utbot.iterates iterate the loop {@code for(int t = 0; t < nGroups; t++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: hbCreateDecodeTables(limit[t], base[t], perm[t], len[t], minLen, maxLen, alphaSize);
 *  */
    @Test
    public void testCreateHuffmanDecodingTables_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[][] limit = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        int[][] base = new int[1][];
        int[] intArray = {};
        base[0] = intArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "base", base);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "perm", limit);
        char[][] temp_charArray2d = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 0]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:441)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:573) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 0;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 * @utbot.iterates iterate the loop {@code for(int t = 0; t < nGroups; t++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: hbCreateDecodeTables(limit[t], base[t], perm[t], len[t], minLen, maxLen, alphaSize);
 *  */
    @Test
    public void testCreateHuffmanDecodingTables_ThrowArrayIndexOutOfBoundsException_9() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[][] limit = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "base", limit);
        int[][] perm = new int[1][];
        int[] intArray = {};
        perm[0] = intArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "perm", perm);
        char[][] temp_charArray2d = new char[1][];
        char[] charArray = {'\u0000'};
        temp_charArray2d[0] = charArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:435)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:573) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 1;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 * @utbot.iterates iterate the loop {@code for(int t = 0; t < nGroups; t++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: hbCreateDecodeTables(limit[t], base[t], perm[t], len[t], minLen, maxLen, alphaSize);
 *  */
    @Test
    public void testCreateHuffmanDecodingTables_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[][] limit = new int[1][];
        int[] intArray = {};
        limit[0] = intArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        int[][] base = new int[1][];
        int[] intArray1 = new int[31];
        base[0] = intArray1;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "base", base);
        int[][] perm = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "perm", perm);
        char[][] temp_charArray2d = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 0]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:442)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:573) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 0;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 * @utbot.iterates iterate the loop {@code for(int t = 0; t < nGroups; t++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: hbCreateDecodeTables(limit[t], base[t], perm[t], len[t], minLen, maxLen, alphaSize);
 *  */
    @Test
    public void testCreateHuffmanDecodingTables_ThrowArrayIndexOutOfBoundsException_10() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[][] limit = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        int[][] base = new int[1][];
        int[] intArray = {};
        base[0] = intArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "base", base);
        int[][] perm = new int[1][];
        int[] intArray1 = {0};
        perm[0] = intArray1;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "perm", perm);
        char[][] temp_charArray2d = new char[1][];
        char[] charArray = {'\u0000'};
        temp_charArray2d[0] = charArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 0]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:441)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:573) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 1;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 * @utbot.iterates iterate the loop {@code for(int t = 0; t < nGroups; t++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: hbCreateDecodeTables(limit[t], base[t], perm[t], len[t], minLen, maxLen, alphaSize);
 *  */
    @Test
    public void testCreateHuffmanDecodingTables_ThrowArrayIndexOutOfBoundsException_11() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[][] limit = new int[1][];
        int[] intArray = {};
        limit[0] = intArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        int[][] base = new int[1][];
        int[] intArray1 = new int[31];
        base[0] = intArray1;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "base", base);
        int[][] perm = new int[1][];
        int[] intArray2 = {0};
        perm[0] = intArray2;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "perm", perm);
        char[][] temp_charArray2d = new char[1][];
        char[] charArray = {'\u0000'};
        temp_charArray2d[0] = charArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 0]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:442)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:573) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 1;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 * @utbot.iterates iterate the loop {@code for(int t = 0; t < nGroups; t++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: hbCreateDecodeTables(limit[t], base[t], perm[t], len[t], minLen, maxLen, alphaSize);
 *  */
    @Test
    public void testCreateHuffmanDecodingTables_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[][] limit = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        int[][] base = {};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "base", base);
        char[][] temp_charArray2d = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:573) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 0;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 * @utbot.iterates iterate the loop {@code for(int t = 0; t < nGroups; t++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: hbCreateDecodeTables(limit[t], base[t], perm[t], len[t], minLen, maxLen, alphaSize);
 *  */
    @Test
    public void testCreateHuffmanDecodingTables_ThrowArrayIndexOutOfBoundsException_7() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[][] limit = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        int[][] base = {};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "base", base);
        char[][] temp_charArray2d = new char[1][];
        char[] charArray = {'\u0000'};
        temp_charArray2d[0] = charArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:573) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 1;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 * @utbot.iterates iterate the loop {@code for(int t = 0; t < nGroups; t++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: hbCreateDecodeTables(limit[t], base[t], perm[t], len[t], minLen, maxLen, alphaSize);
 *  */
    @Test
    public void testCreateHuffmanDecodingTables_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[][] limit = {};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        char[][] temp_charArray2d = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:573) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 0;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 * @utbot.iterates iterate the loop {@code for(int t = 0; t < nGroups; t++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: hbCreateDecodeTables(limit[t], base[t], perm[t], len[t], minLen, maxLen, alphaSize);
 *  */
    @Test
    public void testCreateHuffmanDecodingTables_ThrowArrayIndexOutOfBoundsException_8() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[][] limit = {};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        char[][] temp_charArray2d = new char[1][];
        char[] charArray = {'\u0001'};
        temp_charArray2d[0] = charArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:573) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 1;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 * @utbot.iterates iterate the loop {@code for(int t = 0; t < nGroups; t++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final char[] len_t = len[t];
 *  */
    @Test
    public void testCreateHuffmanDecodingTables_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        char[][] temp_charArray2d = {};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:563) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = -255;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 * @utbot.iterates iterate the loop {@code for(int t = 0; t < nGroups; t++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final char lent = len_t[i];
 *  */
    @Test
    public void testCreateHuffmanDecodingTables_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        char[][] temp_charArray2d = new char[1][];
        char[] charArray = {};
        temp_charArray2d[0] = charArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:565) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 1;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final char[][] len = dataShadow.temp_charArray2d;
 *  */
    @Test
    public void testCreateHuffmanDecodingTables_ThrowNullPointerException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:554) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = -255;
        createHuffmanDecodingTablesMethodArguments[1] = -255;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 * @utbot.iterates iterate the loop {@code for(int t = 0; t < nGroups; t++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: hbCreateDecodeTables(limit[t], base[t], perm[t], len[t], minLen, maxLen, alphaSize);
 *  */
    @Test
    public void testCreateHuffmanDecodingTables_ThrowNullPointerException_6() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[][] limit = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "base", limit);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "perm", limit);
        char[][] temp_charArray2d = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:441)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:573) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 0;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 * @utbot.iterates iterate the loop {@code for(int t = 0; t < nGroups; t++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: hbCreateDecodeTables(limit[t], base[t], perm[t], len[t], minLen, maxLen, alphaSize);
 *  */
    @Test
    public void testCreateHuffmanDecodingTables_ThrowNullPointerException_9() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[][] limit = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "base", limit);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "perm", limit);
        char[][] temp_charArray2d = new char[1][];
        char[] charArray = {'\u0000'};
        temp_charArray2d[0] = charArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:435)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:573) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 1;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 * @utbot.iterates iterate the loop {@code for(int t = 0; t < nGroups; t++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: hbCreateDecodeTables(limit[t], base[t], perm[t], len[t], minLen, maxLen, alphaSize);
 *  */
    @Test
    public void testCreateHuffmanDecodingTables_ThrowNullPointerException_5() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[][] limit = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        int[][] base = new int[1][];
        int[] intArray = new int[31];
        base[0] = intArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "base", base);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "perm", limit);
        char[][] temp_charArray2d = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:442)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:573) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 0;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 * @utbot.iterates iterate the loop {@code for(int t = 0; t < nGroups; t++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: hbCreateDecodeTables(limit[t], base[t], perm[t], len[t], minLen, maxLen, alphaSize);
 *  */
    @Test
    public void testCreateHuffmanDecodingTables_ThrowNullPointerException_10() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[][] limit = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "base", limit);
        int[][] perm = new int[1][];
        int[] intArray = {0};
        perm[0] = intArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "perm", perm);
        char[][] temp_charArray2d = new char[1][];
        char[] charArray = {'\u0000'};
        temp_charArray2d[0] = charArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:441)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:573) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 1;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 * @utbot.iterates iterate the loop {@code for(int t = 0; t < nGroups; t++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: hbCreateDecodeTables(limit[t], base[t], perm[t], len[t], minLen, maxLen, alphaSize);
 *  */
    @Test
    public void testCreateHuffmanDecodingTables_ThrowNullPointerException_4() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[][] limit = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "base", limit);
        char[][] temp_charArray2d = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:573) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 0;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 * @utbot.iterates iterate the loop {@code for(int t = 0; t < nGroups; t++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: hbCreateDecodeTables(limit[t], base[t], perm[t], len[t], minLen, maxLen, alphaSize);
 *  */
    @Test
    public void testCreateHuffmanDecodingTables_ThrowNullPointerException_11() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[][] limit = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        int[][] base = new int[1][];
        int[] intArray = new int[31];
        base[0] = intArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "base", base);
        int[][] perm = new int[1][];
        int[] intArray1 = {0};
        perm[0] = intArray1;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "perm", perm);
        char[][] temp_charArray2d = new char[1][];
        char[] charArray = {'\u0000'};
        temp_charArray2d[0] = charArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:442)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:573) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 1;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 * @utbot.iterates iterate the loop {@code for(int t = 0; t < nGroups; t++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: hbCreateDecodeTables(limit[t], base[t], perm[t], len[t], minLen, maxLen, alphaSize);
 *  */
    @Test
    public void testCreateHuffmanDecodingTables_ThrowNullPointerException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[][] limit = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        char[][] temp_charArray2d = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:573) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 0;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 * @utbot.iterates iterate the loop {@code for(int t = 0; t < nGroups; t++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: hbCreateDecodeTables(limit[t], base[t], perm[t], len[t], minLen, maxLen, alphaSize);
 *  */
    @Test
    public void testCreateHuffmanDecodingTables_ThrowNullPointerException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        char[][] temp_charArray2d = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:573) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 0;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 * @utbot.iterates iterate the loop {@code for(int t = 0; t < nGroups; t++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final char lent = len_t[i];
 *  */
    @Test
    public void testCreateHuffmanDecodingTables_ThrowNullPointerException_7() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        char[][] temp_charArray2d = {null};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:565) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 1;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 * @utbot.iterates iterate the loop {@code for(int t = 0; t < nGroups; t++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: hbCreateDecodeTables(limit[t], base[t], perm[t], len[t], minLen, maxLen, alphaSize);
 *  */
    @Test
    public void testCreateHuffmanDecodingTables_ThrowNullPointerException_8() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        char[][] temp_charArray2d = new char[1][];
        char[] charArray = {'\u8000'};
        temp_charArray2d[0] = charArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:573) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 1;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#createHuffmanDecodingTables(int,int)}
 * @utbot.iterates iterate the loop {@code for(int t = 0; t < nGroups; t++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final char[] len_t = len[t];
 *  */
    @Test
    public void testCreateHuffmanDecodingTables_ThrowNullPointerException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:563) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = -255;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createHuffmanDecodingTables(int, int)
    
    @Test
    public void testCreateHuffmanDecodingTables1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[][] limit = {
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "base", limit);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "perm", limit);
        char[][] temp_charArray2d = new char[9][];
        char[] charArray = new char[11];
        charArray[0] = '\u8001';
        charArray[1] = '\uC000';
        charArray[2] = '\u8000';
        charArray[3] = '\u8000';
        charArray[4] = '\u8000';
        charArray[5] = '\u8000';
        charArray[6] = '\u8000';
        charArray[7] = '\u8000';
        charArray[8] = '\u8000';
        charArray[9] = '\u8000';
        charArray[10] = '\u8000';
        temp_charArray2d[0] = charArray;
        temp_charArray2d[1] = charArray;
        temp_charArray2d[2] = charArray;
        temp_charArray2d[3] = charArray;
        temp_charArray2d[4] = charArray;
        temp_charArray2d[5] = charArray;
        temp_charArray2d[6] = charArray;
        temp_charArray2d[7] = charArray;
        temp_charArray2d[8] = charArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:435)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:573) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 3;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateHuffmanDecodingTables2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[][] limit = {
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "base", limit);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "perm", limit);
        char[][] temp_charArray2d = new char[9][];
        char[] charArray = new char[11];
        charArray[0] = '\u8001';
        charArray[1] = '\u8000';
        charArray[2] = '\u8000';
        charArray[3] = '\u8000';
        charArray[4] = '\u8000';
        charArray[5] = '\u8000';
        charArray[6] = '\u8000';
        charArray[7] = '\u8000';
        charArray[8] = '\u8000';
        charArray[9] = '\u8000';
        charArray[10] = '\u8000';
        temp_charArray2d[0] = charArray;
        temp_charArray2d[1] = charArray;
        temp_charArray2d[2] = charArray;
        temp_charArray2d[3] = charArray;
        temp_charArray2d[4] = charArray;
        temp_charArray2d[5] = charArray;
        temp_charArray2d[6] = charArray;
        temp_charArray2d[7] = charArray;
        temp_charArray2d[8] = charArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.NullPointerException] */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 2;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateHuffmanDecodingTables3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[][] limit = {
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        };
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "base", limit);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "perm", limit);
        char[][] temp_charArray2d = new char[9][];
        char[] charArray = new char[11];
        charArray[0] = '\u8001';
        charArray[1] = '\u8001';
        charArray[2] = '\uC000';
        charArray[3] = '\u8001';
        charArray[4] = '\u8001';
        charArray[5] = '\u8001';
        charArray[6] = '\u8001';
        charArray[7] = '\u8001';
        charArray[8] = '\u8001';
        charArray[9] = '\u8001';
        charArray[10] = '\u8001';
        temp_charArray2d[0] = charArray;
        temp_charArray2d[1] = charArray;
        temp_charArray2d[2] = charArray;
        temp_charArray2d[3] = charArray;
        temp_charArray2d[4] = charArray;
        temp_charArray2d[5] = charArray;
        temp_charArray2d[6] = charArray;
        temp_charArray2d[7] = charArray;
        temp_charArray2d[8] = charArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.NullPointerException] */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 3;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateHuffmanDecodingTables4() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[][] limit = new int[9][];
        int[] intArray = new int[31];
        limit[0] = intArray;
        limit[1] = intArray;
        limit[2] = intArray;
        limit[3] = intArray;
        limit[4] = intArray;
        limit[5] = intArray;
        limit[6] = intArray;
        limit[7] = intArray;
        limit[8] = intArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "limit", limit);
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "base", limit);
        int[][] perm = new int[9][];
        int[] intArray1 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        perm[0] = intArray1;
        perm[1] = intArray1;
        perm[2] = intArray1;
        perm[3] = intArray1;
        perm[4] = intArray1;
        perm[5] = intArray1;
        perm[6] = intArray1;
        perm[7] = intArray1;
        perm[8] = intArray1;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "perm", perm);
        char[][] temp_charArray2d = new char[9][];
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        temp_charArray2d[0] = charArray;
        temp_charArray2d[1] = charArray;
        temp_charArray2d[2] = charArray;
        temp_charArray2d[3] = charArray;
        temp_charArray2d[4] = charArray;
        temp_charArray2d[5] = charArray;
        temp_charArray2d[6] = charArray;
        temp_charArray2d[7] = charArray;
        temp_charArray2d[8] = charArray;
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "temp_charArray2d", temp_charArray2d);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(BZip2CompressorInputStream.java:575) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method createHuffmanDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("createHuffmanDecodingTables", intType, intType);
        createHuffmanDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] createHuffmanDecodingTablesMethodArguments = new java.lang.Object[2];
        createHuffmanDecodingTablesMethodArguments[0] = 1;
        createHuffmanDecodingTablesMethodArguments[1] = 1;
        try {
            createHuffmanDecodingTablesMethod.invoke(bZip2CompressorInputStream, createHuffmanDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAndMoveToFrontDecode()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.origPtr = bsR(24);
 *  */
    @Test
    public void testGetAndMoveToFrontDecode_ThrowNullPointerException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 23);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(BZip2CompressorInputStream.java:381)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode(BZip2CompressorInputStream.java:580) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method getAndMoveToFrontDecodeMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode");
        getAndMoveToFrontDecodeMethod.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecodeMethodArguments = new java.lang.Object[0];
        try {
            getAndMoveToFrontDecodeMethod.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: recvDecodingTables();
 *  */
    @Test
    public void testGetAndMoveToFrontDecode_ThrowNullPointerException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "origPtr", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 24);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.recvDecodingTables(BZip2CompressorInputStream.java:469)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode(BZip2CompressorInputStream.java:581) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method getAndMoveToFrontDecodeMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode");
        getAndMoveToFrontDecodeMethod.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecodeMethodArguments = new java.lang.Object[0];
        try {
            getAndMoveToFrontDecodeMethod.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: recvDecodingTables();
 *  */
    @Test
    public void testGetAndMoveToFrontDecode_ThrowNullPointerException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "origPtr", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 24);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetBit(BZip2CompressorInputStream.java:403)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.recvDecodingTables(BZip2CompressorInputStream.java:478)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode(BZip2CompressorInputStream.java:581) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method getAndMoveToFrontDecodeMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode");
        getAndMoveToFrontDecodeMethod.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecodeMethodArguments = new java.lang.Object[0];
        try {
            getAndMoveToFrontDecodeMethod.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method getAndMoveToFrontDecode()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode()}
 * @utbot.throwsException {@link java.io.IOException} in: this.origPtr = bsR(24);
 *  */
    @Test(expected = IOException.class)
    public void testGetAndMoveToFrontDecode_ThrowIOException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 23);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method getAndMoveToFrontDecodeMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode");
        getAndMoveToFrontDecodeMethod.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecodeMethodArguments = new java.lang.Object[0];
        try {
            getAndMoveToFrontDecodeMethod.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode()}
 * @utbot.throwsException {@link java.io.IOException} in: this.origPtr = bsR(24);
 *  */
    @Test(expected = IOException.class)
    public void testGetAndMoveToFrontDecode_ThrowIOException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 23);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method getAndMoveToFrontDecodeMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode");
        getAndMoveToFrontDecodeMethod.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecodeMethodArguments = new java.lang.Object[0];
        try {
            getAndMoveToFrontDecodeMethod.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode()}
 * @utbot.invokes org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#recvDecodingTables()
 * @utbot.throwsException {@link java.io.IOException} in: recvDecodingTables();
 *  */
    @Test(expected = IOException.class)
    public void testGetAndMoveToFrontDecode_ThrowIOException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "origPtr", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 24);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method getAndMoveToFrontDecodeMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode");
        getAndMoveToFrontDecodeMethod.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecodeMethodArguments = new java.lang.Object[0];
        try {
            getAndMoveToFrontDecodeMethod.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getAndMoveToFrontDecode()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#getAndMoveToFrontDecode()}
 * @utbot.invokes org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsR(int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.origPtr = bsR(24);
 *  */
    @Test(expected = NullPointerException.class)
    public void testGetAndMoveToFrontDecode_ThrowNullPointerException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 23);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method getAndMoveToFrontDecodeMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode");
        getAndMoveToFrontDecodeMethod.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecodeMethodArguments = new java.lang.Object[0];
        try {
            getAndMoveToFrontDecodeMethod.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getAndMoveToFrontDecode()
    
    @Test
    public void testGetAndMoveToFrontDecode1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", 256);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 1073741826);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.recvDecodingTables(BZip2CompressorInputStream.java:484)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode(BZip2CompressorInputStream.java:581) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method getAndMoveToFrontDecodeMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode");
        getAndMoveToFrontDecodeMethod.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecodeMethodArguments = new java.lang.Object[0];
        try {
            getAndMoveToFrontDecodeMethod.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetAndMoveToFrontDecode2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 25);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetBit(BZip2CompressorInputStream.java:403)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.recvDecodingTables(BZip2CompressorInputStream.java:478)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode(BZip2CompressorInputStream.java:581) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method getAndMoveToFrontDecodeMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("getAndMoveToFrontDecode");
        getAndMoveToFrontDecodeMethod.setAccessible(true);
        java.lang.Object[] getAndMoveToFrontDecodeMethodArguments = new java.lang.Object[0];
        try {
            getAndMoveToFrontDecodeMethod.invoke(bZip2CompressorInputStream, getAndMoveToFrontDecodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getAndMoveToFrontDecode
    
    public void testGetAndMoveToFrontDecode_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hbCreateDecodeTables([I, [I, [I, [C, int, int, int)
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#hbCreateDecodeTables(int[],int[],int[],char[],int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = minLen, pp = 0; i <= maxLen; i++)} once
 * @utbot.iterates iterate the loop {@code for(int i = MAX_CODE_LEN; --i > 0; )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: base[i] = 0;
 *  */
    @Test
    public void testHbCreateDecodeTables_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        int[] intArray = {};
        int[] intArray1 = {-255};
        char[] charArray = {'~'};
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 0]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:441) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intArrayType = Class.forName("[I");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method hbCreateDecodeTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("hbCreateDecodeTables", intArrayType, intArrayType, intArrayType, charArrayType, intType, intType, intType);
        hbCreateDecodeTablesMethod.setAccessible(true);
        java.lang.Object[] hbCreateDecodeTablesMethodArguments = new java.lang.Object[7];
        hbCreateDecodeTablesMethodArguments[0] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[1] = ((Object) intArray);
        hbCreateDecodeTablesMethodArguments[2] = ((Object) intArray1);
        hbCreateDecodeTablesMethodArguments[3] = ((Object) charArray);
        hbCreateDecodeTablesMethodArguments[4] = 126;
        hbCreateDecodeTablesMethodArguments[5] = 126;
        hbCreateDecodeTablesMethodArguments[6] = 1;
        try {
            hbCreateDecodeTablesMethod.invoke(null, hbCreateDecodeTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#hbCreateDecodeTables(int[],int[],int[],char[],int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = minLen, pp = 0; i <= maxLen; i++)} once
 * @utbot.iterates iterate the loop {@code for(int i = MAX_CODE_LEN; --i > 0; )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: base[i] = 0;
 *  */
    @Test
    public void testHbCreateDecodeTables_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        int[] intArray = {};
        char[] charArray = {'!'};
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 0]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:441) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intArrayType = Class.forName("[I");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method hbCreateDecodeTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("hbCreateDecodeTables", intArrayType, intArrayType, intArrayType, charArrayType, intType, intType, intType);
        hbCreateDecodeTablesMethod.setAccessible(true);
        java.lang.Object[] hbCreateDecodeTablesMethodArguments = new java.lang.Object[7];
        hbCreateDecodeTablesMethodArguments[0] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[1] = ((Object) intArray);
        hbCreateDecodeTablesMethodArguments[2] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[3] = ((Object) charArray);
        hbCreateDecodeTablesMethodArguments[4] = -34;
        hbCreateDecodeTablesMethodArguments[5] = -34;
        hbCreateDecodeTablesMethodArguments[6] = 1;
        try {
            hbCreateDecodeTablesMethod.invoke(null, hbCreateDecodeTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#hbCreateDecodeTables(int[],int[],int[],char[],int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = minLen, pp = 0; i <= maxLen; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: perm[pp++] = j;
 *  */
    @Test
    public void testHbCreateDecodeTables_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        int[] intArray = {};
        char[] charArray = {'!'};
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:435) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intArrayType = Class.forName("[I");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method hbCreateDecodeTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("hbCreateDecodeTables", intArrayType, intArrayType, intArrayType, charArrayType, intType, intType, intType);
        hbCreateDecodeTablesMethod.setAccessible(true);
        java.lang.Object[] hbCreateDecodeTablesMethodArguments = new java.lang.Object[7];
        hbCreateDecodeTablesMethodArguments[0] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[1] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[2] = ((Object) intArray);
        hbCreateDecodeTablesMethodArguments[3] = ((Object) charArray);
        hbCreateDecodeTablesMethodArguments[4] = 33;
        hbCreateDecodeTablesMethodArguments[5] = 33;
        hbCreateDecodeTablesMethodArguments[6] = 1;
        try {
            hbCreateDecodeTablesMethod.invoke(null, hbCreateDecodeTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#hbCreateDecodeTables(int[],int[],int[],char[],int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = MAX_CODE_LEN; --i > 0; )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: limit[i] = 0;
 *  */
    @Test
    public void testHbCreateDecodeTables_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        int[] intArray = {};
        int[] intArray1 = new int[31];
        intArray1[0] = -255;
        intArray1[1] = -255;
        intArray1[2] = -255;
        intArray1[3] = -255;
        intArray1[4] = -255;
        intArray1[5] = -255;
        intArray1[6] = -255;
        intArray1[7] = -255;
        intArray1[8] = -255;
        intArray1[9] = -255;
        intArray1[10] = -255;
        intArray1[11] = -255;
        intArray1[12] = -255;
        intArray1[13] = -255;
        intArray1[14] = -255;
        intArray1[15] = 1;
        intArray1[16] = -255;
        intArray1[17] = -255;
        intArray1[18] = -255;
        intArray1[19] = -255;
        intArray1[20] = -255;
        intArray1[21] = -255;
        intArray1[22] = -255;
        intArray1[23] = -255;
        intArray1[24] = -255;
        intArray1[25] = -255;
        intArray1[26] = -255;
        intArray1[27] = -255;
        intArray1[28] = -255;
        intArray1[29] = -255;
        intArray1[30] = -255;
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 0]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:442) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intArrayType = Class.forName("[I");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method hbCreateDecodeTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("hbCreateDecodeTables", intArrayType, intArrayType, intArrayType, charArrayType, intType, intType, intType);
        hbCreateDecodeTablesMethod.setAccessible(true);
        java.lang.Object[] hbCreateDecodeTablesMethodArguments = new java.lang.Object[7];
        hbCreateDecodeTablesMethodArguments[0] = ((Object) intArray);
        hbCreateDecodeTablesMethodArguments[1] = ((Object) intArray1);
        hbCreateDecodeTablesMethodArguments[2] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[3] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[4] = -1;
        hbCreateDecodeTablesMethodArguments[5] = -2;
        hbCreateDecodeTablesMethodArguments[6] = -255;
        try {
            hbCreateDecodeTablesMethod.invoke(null, hbCreateDecodeTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#hbCreateDecodeTables(int[],int[],int[],char[],int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = minLen, pp = 0; i <= maxLen; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: length[j] == i
 *  */
    @Test
    public void testHbCreateDecodeTables_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        char[] charArray = {};
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:434) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intArrayType = Class.forName("[I");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method hbCreateDecodeTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("hbCreateDecodeTables", intArrayType, intArrayType, intArrayType, charArrayType, intType, intType, intType);
        hbCreateDecodeTablesMethod.setAccessible(true);
        java.lang.Object[] hbCreateDecodeTablesMethodArguments = new java.lang.Object[7];
        hbCreateDecodeTablesMethodArguments[0] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[1] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[2] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[3] = ((Object) charArray);
        hbCreateDecodeTablesMethodArguments[4] = -255;
        hbCreateDecodeTablesMethodArguments[5] = -255;
        hbCreateDecodeTablesMethodArguments[6] = 1;
        try {
            hbCreateDecodeTablesMethod.invoke(null, hbCreateDecodeTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#hbCreateDecodeTables(int[],int[],int[],char[],int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = MAX_CODE_LEN; --i > 0; )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: base[i] = 0;
 *  */
    @Test
    public void testHbCreateDecodeTables_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        int[] intArray = {-255, -255};
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 2]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:441) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intArrayType = Class.forName("[I");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method hbCreateDecodeTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("hbCreateDecodeTables", intArrayType, intArrayType, intArrayType, charArrayType, intType, intType, intType);
        hbCreateDecodeTablesMethod.setAccessible(true);
        java.lang.Object[] hbCreateDecodeTablesMethodArguments = new java.lang.Object[7];
        hbCreateDecodeTablesMethodArguments[0] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[1] = ((Object) intArray);
        hbCreateDecodeTablesMethodArguments[2] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[3] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[4] = -253;
        hbCreateDecodeTablesMethodArguments[5] = -254;
        hbCreateDecodeTablesMethodArguments[6] = 0;
        try {
            hbCreateDecodeTablesMethod.invoke(null, hbCreateDecodeTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#hbCreateDecodeTables(int[],int[],int[],char[],int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = minLen, pp = 0; i <= maxLen; i++)} once
 * @utbot.iterates iterate the loop {@code for(int i = MAX_CODE_LEN; --i > 0; )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: base[i] = 0;
 *  */
    @Test
    public void testHbCreateDecodeTables_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        int[] intArray = {};
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 0]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:441) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intArrayType = Class.forName("[I");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method hbCreateDecodeTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("hbCreateDecodeTables", intArrayType, intArrayType, intArrayType, charArrayType, intType, intType, intType);
        hbCreateDecodeTablesMethod.setAccessible(true);
        java.lang.Object[] hbCreateDecodeTablesMethodArguments = new java.lang.Object[7];
        hbCreateDecodeTablesMethodArguments[0] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[1] = ((Object) intArray);
        hbCreateDecodeTablesMethodArguments[2] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[3] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[4] = -2;
        hbCreateDecodeTablesMethodArguments[5] = -2;
        hbCreateDecodeTablesMethodArguments[6] = 0;
        try {
            hbCreateDecodeTablesMethod.invoke(null, hbCreateDecodeTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#hbCreateDecodeTables(int[],int[],int[],char[],int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = minLen, pp = 0; i <= maxLen; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: perm[pp++] = j;
 *  */
    @Test
    public void testHbCreateDecodeTables_ThrowNullPointerException_2() throws Throwable  {
        char[] charArray = {' '};
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:435) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intArrayType = Class.forName("[I");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method hbCreateDecodeTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("hbCreateDecodeTables", intArrayType, intArrayType, intArrayType, charArrayType, intType, intType, intType);
        hbCreateDecodeTablesMethod.setAccessible(true);
        java.lang.Object[] hbCreateDecodeTablesMethodArguments = new java.lang.Object[7];
        hbCreateDecodeTablesMethodArguments[0] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[1] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[2] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[3] = ((Object) charArray);
        hbCreateDecodeTablesMethodArguments[4] = 32;
        hbCreateDecodeTablesMethodArguments[5] = 32;
        hbCreateDecodeTablesMethodArguments[6] = 1;
        try {
            hbCreateDecodeTablesMethod.invoke(null, hbCreateDecodeTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#hbCreateDecodeTables(int[],int[],int[],char[],int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = MAX_CODE_LEN; --i > 0; )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: limit[i] = 0;
 *  */
    @Test
    public void testHbCreateDecodeTables_ThrowNullPointerException_3() throws Throwable  {
        int[] intArray = new int[31];
        intArray[0] = -255;
        intArray[1] = -255;
        intArray[2] = -255;
        intArray[3] = -255;
        intArray[4] = -255;
        intArray[5] = -255;
        intArray[6] = -255;
        intArray[7] = -255;
        intArray[8] = -255;
        intArray[9] = -255;
        intArray[10] = -255;
        intArray[11] = -255;
        intArray[12] = -255;
        intArray[13] = -255;
        intArray[14] = -255;
        intArray[15] = -255;
        intArray[16] = -255;
        intArray[17] = -255;
        intArray[18] = -255;
        intArray[19] = -255;
        intArray[20] = -255;
        intArray[21] = -255;
        intArray[22] = -255;
        intArray[23] = 1;
        intArray[24] = -255;
        intArray[25] = -255;
        intArray[26] = -255;
        intArray[27] = -255;
        intArray[28] = -255;
        intArray[29] = -255;
        intArray[30] = -255;
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:442) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intArrayType = Class.forName("[I");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method hbCreateDecodeTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("hbCreateDecodeTables", intArrayType, intArrayType, intArrayType, charArrayType, intType, intType, intType);
        hbCreateDecodeTablesMethod.setAccessible(true);
        java.lang.Object[] hbCreateDecodeTablesMethodArguments = new java.lang.Object[7];
        hbCreateDecodeTablesMethodArguments[0] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[1] = ((Object) intArray);
        hbCreateDecodeTablesMethodArguments[2] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[3] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[4] = -1;
        hbCreateDecodeTablesMethodArguments[5] = -2;
        hbCreateDecodeTablesMethodArguments[6] = -255;
        try {
            hbCreateDecodeTablesMethod.invoke(null, hbCreateDecodeTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#hbCreateDecodeTables(int[],int[],int[],char[],int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = minLen, pp = 0; i <= maxLen; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: length[j] == i
 *  */
    @Test
    public void testHbCreateDecodeTables_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:434) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intArrayType = Class.forName("[I");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method hbCreateDecodeTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("hbCreateDecodeTables", intArrayType, intArrayType, intArrayType, charArrayType, intType, intType, intType);
        hbCreateDecodeTablesMethod.setAccessible(true);
        java.lang.Object[] hbCreateDecodeTablesMethodArguments = new java.lang.Object[7];
        hbCreateDecodeTablesMethodArguments[0] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[1] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[2] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[3] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[4] = 1;
        hbCreateDecodeTablesMethodArguments[5] = 1;
        hbCreateDecodeTablesMethodArguments[6] = 1;
        try {
            hbCreateDecodeTablesMethod.invoke(null, hbCreateDecodeTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#hbCreateDecodeTables(int[],int[],int[],char[],int,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = MAX_CODE_LEN; --i > 0; )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: base[i] = 0;
 *  */
    @Test
    public void testHbCreateDecodeTables_ThrowNullPointerException_1() throws Throwable  {
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:441) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intArrayType = Class.forName("[I");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method hbCreateDecodeTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("hbCreateDecodeTables", intArrayType, intArrayType, intArrayType, charArrayType, intType, intType, intType);
        hbCreateDecodeTablesMethod.setAccessible(true);
        java.lang.Object[] hbCreateDecodeTablesMethodArguments = new java.lang.Object[7];
        hbCreateDecodeTablesMethodArguments[0] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[1] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[2] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[3] = ((Object) null);
        hbCreateDecodeTablesMethodArguments[4] = -1;
        hbCreateDecodeTablesMethodArguments[5] = -2;
        hbCreateDecodeTablesMethodArguments[6] = -255;
        try {
            hbCreateDecodeTablesMethod.invoke(null, hbCreateDecodeTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method hbCreateDecodeTables([I, [I, [I, [C, int, int, int)
    
    @Test
    public void testHbCreateDecodeTablesByFuzzer() throws Throwable  {
        int[] intArray = {1, -1, -1};
        int[] intArray1 = {1, 0, Integer.MAX_VALUE, 22};
        int[] intArray2 = {Integer.MAX_VALUE, -1};
        char[] charArray = {'\u0001', '', '\u0000', ''};
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:434) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intArrayType = Class.forName("[I");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method hbCreateDecodeTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("hbCreateDecodeTables", intArrayType, intArrayType, intArrayType, charArrayType, intType, intType, intType);
        hbCreateDecodeTablesMethod.setAccessible(true);
        java.lang.Object[] hbCreateDecodeTablesMethodArguments = new java.lang.Object[7];
        hbCreateDecodeTablesMethodArguments[0] = ((Object) intArray);
        hbCreateDecodeTablesMethodArguments[1] = ((Object) intArray1);
        hbCreateDecodeTablesMethodArguments[2] = ((Object) intArray2);
        hbCreateDecodeTablesMethodArguments[3] = ((Object) charArray);
        hbCreateDecodeTablesMethodArguments[4] = Integer.MIN_VALUE;
        hbCreateDecodeTablesMethodArguments[5] = 23;
        hbCreateDecodeTablesMethodArguments[6] = Integer.MAX_VALUE;
        try {
            hbCreateDecodeTablesMethod.invoke(null, hbCreateDecodeTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hbCreateDecodeTables([I, [I, [I, [C, int, int, int)
    
    @Test
    public void testHbCreateDecodeTables1() throws Throwable  {
        int[] intArray = new int[31];
        int[] intArray1 = new int[31];
        int[] intArray2 = new int[11];
        char[] charArray = {
            '\u0000', '\uFFFE', '\uFFFE', '\uFFFE', '\uFFFE', '\uFFFE', '\uFFFE', '\uFFFE',
            '\uFFFE'
        };
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 65535 out of bounds for length 31]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:446) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intArrayType = Class.forName("[I");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method hbCreateDecodeTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("hbCreateDecodeTables", intArrayType, intArrayType, intArrayType, charArrayType, intType, intType, intType);
        hbCreateDecodeTablesMethod.setAccessible(true);
        java.lang.Object[] hbCreateDecodeTablesMethodArguments = new java.lang.Object[7];
        hbCreateDecodeTablesMethodArguments[0] = ((Object) intArray);
        hbCreateDecodeTablesMethodArguments[1] = ((Object) intArray1);
        hbCreateDecodeTablesMethodArguments[2] = ((Object) intArray2);
        hbCreateDecodeTablesMethodArguments[3] = ((Object) charArray);
        hbCreateDecodeTablesMethodArguments[4] = 65534;
        hbCreateDecodeTablesMethodArguments[5] = 65534;
        hbCreateDecodeTablesMethodArguments[6] = 4;
        try {
            hbCreateDecodeTablesMethod.invoke(null, hbCreateDecodeTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHbCreateDecodeTables2() throws Throwable  {
        int[] intArray = new int[31];
        int[] intArray1 = new int[31];
        int[] intArray2 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2 out of bounds for length 31]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:454) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intArrayType = Class.forName("[I");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method hbCreateDecodeTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("hbCreateDecodeTables", intArrayType, intArrayType, intArrayType, charArrayType, intType, intType, intType);
        hbCreateDecodeTablesMethod.setAccessible(true);
        java.lang.Object[] hbCreateDecodeTablesMethodArguments = new java.lang.Object[7];
        hbCreateDecodeTablesMethodArguments[0] = ((Object) intArray);
        hbCreateDecodeTablesMethodArguments[1] = ((Object) intArray1);
        hbCreateDecodeTablesMethodArguments[2] = ((Object) intArray2);
        hbCreateDecodeTablesMethodArguments[3] = ((Object) charArray);
        hbCreateDecodeTablesMethodArguments[4] = -2;
        hbCreateDecodeTablesMethodArguments[5] = -2;
        hbCreateDecodeTablesMethodArguments[6] = 4;
        try {
            hbCreateDecodeTablesMethod.invoke(null, hbCreateDecodeTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHbCreateDecodeTables3() throws Throwable  {
        int[] intArray = new int[31];
        int[] intArray1 = new int[31];
        int[] intArray2 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        char[] charArray = new char[11];
        charArray[1] = '\uFFFE';
        charArray[2] = '\uFFFE';
        charArray[3] = '\uFFFE';
        charArray[4] = '\uFFFE';
        charArray[5] = '\uFFFE';
        charArray[6] = '\uFFFE';
        charArray[7] = '\uFFFE';
        charArray[8] = '\uFFFE';
        charArray[9] = '\uFFFE';
        charArray[10] = '\uFFFE';
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables] produces [java.lang.ArrayIndexOutOfBoundsException] */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intArrayType = Class.forName("[I");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method hbCreateDecodeTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("hbCreateDecodeTables", intArrayType, intArrayType, intArrayType, charArrayType, intType, intType, intType);
        hbCreateDecodeTablesMethod.setAccessible(true);
        java.lang.Object[] hbCreateDecodeTablesMethodArguments = new java.lang.Object[7];
        hbCreateDecodeTablesMethodArguments[0] = ((Object) intArray);
        hbCreateDecodeTablesMethodArguments[1] = ((Object) intArray1);
        hbCreateDecodeTablesMethodArguments[2] = ((Object) intArray2);
        hbCreateDecodeTablesMethodArguments[3] = ((Object) charArray);
        hbCreateDecodeTablesMethodArguments[4] = 65534;
        hbCreateDecodeTablesMethodArguments[5] = 65534;
        hbCreateDecodeTablesMethodArguments[6] = 3;
        try {
            hbCreateDecodeTablesMethod.invoke(null, hbCreateDecodeTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHbCreateDecodeTables4() throws Throwable  {
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        int[] intArray1 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables] produces [java.lang.ArrayIndexOutOfBoundsException] */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intArrayType = Class.forName("[I");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method hbCreateDecodeTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("hbCreateDecodeTables", intArrayType, intArrayType, intArrayType, charArrayType, intType, intType, intType);
        hbCreateDecodeTablesMethod.setAccessible(true);
        java.lang.Object[] hbCreateDecodeTablesMethodArguments = new java.lang.Object[7];
        hbCreateDecodeTablesMethodArguments[0] = ((Object) intArray);
        hbCreateDecodeTablesMethodArguments[1] = ((Object) intArray1);
        hbCreateDecodeTablesMethodArguments[2] = ((Object) intArray1);
        hbCreateDecodeTablesMethodArguments[3] = ((Object) charArray);
        hbCreateDecodeTablesMethodArguments[4] = -3;
        hbCreateDecodeTablesMethodArguments[5] = 0;
        hbCreateDecodeTablesMethodArguments[6] = 1;
        try {
            hbCreateDecodeTablesMethod.invoke(null, hbCreateDecodeTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHbCreateDecodeTables5() throws Throwable  {
        int[] intArray = new int[31];
        int[] intArray1 = new int[31];
        int[] intArray2 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        char[] charArray = new char[13];
        charArray[0] = '\uFFFE';
        charArray[2] = '\uFFFE';
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 65535 out of bounds for length 31]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:446) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intArrayType = Class.forName("[I");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method hbCreateDecodeTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("hbCreateDecodeTables", intArrayType, intArrayType, intArrayType, charArrayType, intType, intType, intType);
        hbCreateDecodeTablesMethod.setAccessible(true);
        java.lang.Object[] hbCreateDecodeTablesMethodArguments = new java.lang.Object[7];
        hbCreateDecodeTablesMethodArguments[0] = ((Object) intArray);
        hbCreateDecodeTablesMethodArguments[1] = ((Object) intArray1);
        hbCreateDecodeTablesMethodArguments[2] = ((Object) intArray2);
        hbCreateDecodeTablesMethodArguments[3] = ((Object) charArray);
        hbCreateDecodeTablesMethodArguments[4] = 65534;
        hbCreateDecodeTablesMethodArguments[5] = 65534;
        hbCreateDecodeTablesMethodArguments[6] = 5;
        try {
            hbCreateDecodeTablesMethod.invoke(null, hbCreateDecodeTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHbCreateDecodeTables6() throws Throwable  {
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        int[] intArray1 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        int[] intArray2 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        char[] charArray = {
            '\u0000', '\u0001', '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables] produces [java.lang.ArrayIndexOutOfBoundsException] */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intArrayType = Class.forName("[I");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method hbCreateDecodeTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("hbCreateDecodeTables", intArrayType, intArrayType, intArrayType, charArrayType, intType, intType, intType);
        hbCreateDecodeTablesMethod.setAccessible(true);
        java.lang.Object[] hbCreateDecodeTablesMethodArguments = new java.lang.Object[7];
        hbCreateDecodeTablesMethodArguments[0] = ((Object) intArray);
        hbCreateDecodeTablesMethodArguments[1] = ((Object) intArray1);
        hbCreateDecodeTablesMethodArguments[2] = ((Object) intArray2);
        hbCreateDecodeTablesMethodArguments[3] = ((Object) charArray);
        hbCreateDecodeTablesMethodArguments[4] = 0;
        hbCreateDecodeTablesMethodArguments[5] = 0;
        hbCreateDecodeTablesMethodArguments[6] = 5;
        try {
            hbCreateDecodeTablesMethod.invoke(null, hbCreateDecodeTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHbCreateDecodeTables7() throws Throwable  {
        int[] intArray = new int[31];
        int[] intArray1 = new int[31];
        int[] intArray2 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        char[] charArray = {
            '\uFFFE', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables] produces [java.lang.ArrayIndexOutOfBoundsException] */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intArrayType = Class.forName("[I");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method hbCreateDecodeTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("hbCreateDecodeTables", intArrayType, intArrayType, intArrayType, charArrayType, intType, intType, intType);
        hbCreateDecodeTablesMethod.setAccessible(true);
        java.lang.Object[] hbCreateDecodeTablesMethodArguments = new java.lang.Object[7];
        hbCreateDecodeTablesMethodArguments[0] = ((Object) intArray);
        hbCreateDecodeTablesMethodArguments[1] = ((Object) intArray1);
        hbCreateDecodeTablesMethodArguments[2] = ((Object) intArray2);
        hbCreateDecodeTablesMethodArguments[3] = ((Object) charArray);
        hbCreateDecodeTablesMethodArguments[4] = 65534;
        hbCreateDecodeTablesMethodArguments[5] = 65534;
        hbCreateDecodeTablesMethodArguments[6] = 2;
        try {
            hbCreateDecodeTablesMethod.invoke(null, hbCreateDecodeTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHbCreateDecodeTables8() throws Throwable  {
        int[] intArray = new int[31];
        int[] intArray1 = new int[31];
        int[] intArray2 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables] produces [java.lang.ArrayIndexOutOfBoundsException: Index -9 out of bounds for length 31]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(BZip2CompressorInputStream.java:454) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intArrayType = Class.forName("[I");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method hbCreateDecodeTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("hbCreateDecodeTables", intArrayType, intArrayType, intArrayType, charArrayType, intType, intType, intType);
        hbCreateDecodeTablesMethod.setAccessible(true);
        java.lang.Object[] hbCreateDecodeTablesMethodArguments = new java.lang.Object[7];
        hbCreateDecodeTablesMethodArguments[0] = ((Object) intArray);
        hbCreateDecodeTablesMethodArguments[1] = ((Object) intArray1);
        hbCreateDecodeTablesMethodArguments[2] = ((Object) intArray2);
        hbCreateDecodeTablesMethodArguments[3] = ((Object) charArray);
        hbCreateDecodeTablesMethodArguments[4] = -9;
        hbCreateDecodeTablesMethodArguments[5] = -6;
        hbCreateDecodeTablesMethodArguments[6] = -2147483647;
        try {
            hbCreateDecodeTablesMethod.invoke(null, hbCreateDecodeTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method hbCreateDecodeTables([I, [I, [I, [C, int, int, int)
    
    @Test(timeout = 1000L)
    public void testHbCreateDecodeTables9() throws Throwable  {
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        int[] intArray1 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intArrayType = Class.forName("[I");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method hbCreateDecodeTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("hbCreateDecodeTables", intArrayType, intArrayType, intArrayType, charArrayType, intType, intType, intType);
        hbCreateDecodeTablesMethod.setAccessible(true);
        java.lang.Object[] hbCreateDecodeTablesMethodArguments = new java.lang.Object[7];
        hbCreateDecodeTablesMethodArguments[0] = ((Object) intArray);
        hbCreateDecodeTablesMethodArguments[1] = ((Object) intArray1);
        hbCreateDecodeTablesMethodArguments[2] = ((Object) intArray1);
        hbCreateDecodeTablesMethodArguments[3] = ((Object) charArray);
        hbCreateDecodeTablesMethodArguments[4] = -2147483647;
        hbCreateDecodeTablesMethodArguments[5] = 0;
        hbCreateDecodeTablesMethodArguments[6] = 1;
        try {
            hbCreateDecodeTablesMethod.invoke(null, hbCreateDecodeTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testHbCreateDecodeTables10() throws Throwable  {
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        int[] intArray1 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intArrayType = Class.forName("[I");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method hbCreateDecodeTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("hbCreateDecodeTables", intArrayType, intArrayType, intArrayType, charArrayType, intType, intType, intType);
        hbCreateDecodeTablesMethod.setAccessible(true);
        java.lang.Object[] hbCreateDecodeTablesMethodArguments = new java.lang.Object[7];
        hbCreateDecodeTablesMethodArguments[0] = ((Object) intArray);
        hbCreateDecodeTablesMethodArguments[1] = ((Object) intArray1);
        hbCreateDecodeTablesMethodArguments[2] = ((Object) intArray1);
        hbCreateDecodeTablesMethodArguments[3] = ((Object) charArray);
        hbCreateDecodeTablesMethodArguments[4] = -2147483647;
        hbCreateDecodeTablesMethodArguments[5] = 0;
        hbCreateDecodeTablesMethodArguments[6] = 2;
        try {
            hbCreateDecodeTablesMethod.invoke(null, hbCreateDecodeTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method bsGetUByte()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetUByte()}
 * @utbot.invokes org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsR(int)
 * @utbot.returnsFrom {@code return (char) bsR(8);}
 *  */
    @Test
    public void testBsGetUByte_BZip2CompressorInputStreamBsR() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 8);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetUByteMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetUByte");
        bsGetUByteMethod.setAccessible(true);
        java.lang.Object[] bsGetUByteMethodArguments = new java.lang.Object[0];
        char actual = ((Character) bsGetUByteMethod.invoke(bZip2CompressorInputStream, bsGetUByteMethodArguments));
        
        assertEquals('\u0001', actual);
        
        int finalBZip2CompressorInputStreamBsLive = ((Integer) getFieldValue(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive"));
        
        assertEquals(0, finalBZip2CompressorInputStreamBsLive);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method bsGetUByte()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetUByte()}
 * @utbot.invokes org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsR(int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (char) bsR(8);
 *  */
    @Test
    public void testBsGetUByte_ThrowNullPointerException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(BZip2CompressorInputStream.java:381)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte(BZip2CompressorInputStream.java:419) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetUByteMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetUByte");
        bsGetUByteMethod.setAccessible(true);
        java.lang.Object[] bsGetUByteMethodArguments = new java.lang.Object[0];
        try {
            bsGetUByteMethod.invoke(bZip2CompressorInputStream, bsGetUByteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method bsGetUByte()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetUByte()}
 * @utbot.throwsException {@link java.io.IOException} in: return (char) bsR(8);
 *  */
    @Test(expected = IOException.class)
    public void testBsGetUByte_ThrowIOException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetUByteMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetUByte");
        bsGetUByteMethod.setAccessible(true);
        java.lang.Object[] bsGetUByteMethodArguments = new java.lang.Object[0];
        try {
            bsGetUByteMethod.invoke(bZip2CompressorInputStream, bsGetUByteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetUByte()}
 * @utbot.throwsException {@link java.io.IOException} in: return (char) bsR(8);
 *  */
    @Test(expected = IOException.class)
    public void testBsGetUByte_ThrowIOException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetUByteMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetUByte");
        bsGetUByteMethod.setAccessible(true);
        java.lang.Object[] bsGetUByteMethodArguments = new java.lang.Object[0];
        try {
            bsGetUByteMethod.invoke(bZip2CompressorInputStream, bsGetUByteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetUByte()}
 * @utbot.throwsException {@link java.io.IOException} in: return (char) bsR(8);
 *  */
    @Test(expected = IOException.class)
    public void testBsGetUByte_ThrowIOException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        CheckedInputStream in = ((CheckedInputStream) createInstance("java.util.zip.CheckedInputStream"));
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetUByteMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetUByte");
        bsGetUByteMethod.setAccessible(true);
        java.lang.Object[] bsGetUByteMethodArguments = new java.lang.Object[0];
        try {
            bsGetUByteMethod.invoke(bZip2CompressorInputStream, bsGetUByteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetUByte()}
 * @utbot.throwsException {@link java.io.IOException} in: return (char) bsR(8);
 *  */
    @Test(expected = IOException.class)
    public void testBsGetUByte_ThrowIOException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetUByteMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetUByte");
        bsGetUByteMethod.setAccessible(true);
        java.lang.Object[] bsGetUByteMethodArguments = new java.lang.Object[0];
        try {
            bsGetUByteMethod.invoke(bZip2CompressorInputStream, bsGetUByteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetUByte()}
 * @utbot.throwsException {@link java.io.IOException} in: return (char) bsR(8);
 *  */
    @Test(expected = IOException.class)
    public void testBsGetUByte_ThrowIOException_4() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetUByteMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetUByte");
        bsGetUByteMethod.setAccessible(true);
        java.lang.Object[] bsGetUByteMethodArguments = new java.lang.Object[0];
        try {
            bsGetUByteMethod.invoke(bZip2CompressorInputStream, bsGetUByteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method bsGetUByte()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetUByte()}
 * @utbot.invokes org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsR(int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (char) bsR(8);
 *  */
    @Test(expected = NullPointerException.class)
    public void testBsGetUByte_ThrowNullPointerException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetUByteMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetUByte");
        bsGetUByteMethod.setAccessible(true);
        java.lang.Object[] bsGetUByteMethodArguments = new java.lang.Object[0];
        try {
            bsGetUByteMethod.invoke(bZip2CompressorInputStream, bsGetUByteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for bsGetUByte
    
    public void testBsGetUByte_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetBit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method bsGetBit()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetBit()}
 * @utbot.returnsFrom {@code return ((bsBuffShadow >> (bsLiveShadow - 1)) & 1) != 0;}
 *  */
    @Test
    public void testBsGetBit_BsBuffShadowRightShiftBsLiveShadowMinus1BitwiseAnd1EqualsZero() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 1);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetBitMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetBit");
        bsGetBitMethod.setAccessible(true);
        java.lang.Object[] bsGetBitMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) bsGetBitMethod.invoke(bZip2CompressorInputStream, bsGetBitMethodArguments));
        
        assertFalse(actual);
        
        int finalBZip2CompressorInputStreamBsLive = ((Integer) getFieldValue(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive"));
        
        assertEquals(0, finalBZip2CompressorInputStreamBsLive);
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetBit()}
 * @utbot.returnsFrom {@code return ((bsBuffShadow >> (bsLiveShadow - 1)) & 1) != 0;}
 *  */
    @Test
    public void testBsGetBit_BsBuffShadowRightShiftBsLiveShadowMinus1BitwiseAnd1NotEqualsZero() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 1);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetBitMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetBit");
        bsGetBitMethod.setAccessible(true);
        java.lang.Object[] bsGetBitMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) bsGetBitMethod.invoke(bZip2CompressorInputStream, bsGetBitMethodArguments));
        
        assertTrue(actual);
        
        int finalBZip2CompressorInputStreamBsLive = ((Integer) getFieldValue(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive"));
        
        assertEquals(0, finalBZip2CompressorInputStreamBsLive);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method bsGetBit()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetBit()}
 * @utbot.executesCondition {@code (bsLiveShadow < 1): True}
 * @utbot.invokes {@link java.io.InputStream#read()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int thech = this.in.read();
 *  */
    @Test
    public void testBsGetBit_ThrowNullPointerException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetBit] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetBit(BZip2CompressorInputStream.java:403) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetBitMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetBit");
        bsGetBitMethod.setAccessible(true);
        java.lang.Object[] bsGetBitMethodArguments = new java.lang.Object[0];
        try {
            bsGetBitMethod.invoke(bZip2CompressorInputStream, bsGetBitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method bsGetBit()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetBit()}
 * @utbot.throwsException {@link java.io.IOException} in: int thech = this.in.read();
 *  */
    @Test(expected = IOException.class)
    public void testBsGetBit_ThrowIOException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetBitMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetBit");
        bsGetBitMethod.setAccessible(true);
        java.lang.Object[] bsGetBitMethodArguments = new java.lang.Object[0];
        try {
            bsGetBitMethod.invoke(bZip2CompressorInputStream, bsGetBitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetBit()}
 * @utbot.throwsException {@link java.io.IOException} in: int thech = this.in.read();
 *  */
    @Test(expected = IOException.class)
    public void testBsGetBit_ThrowIOException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetBitMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetBit");
        bsGetBitMethod.setAccessible(true);
        java.lang.Object[] bsGetBitMethodArguments = new java.lang.Object[0];
        try {
            bsGetBitMethod.invoke(bZip2CompressorInputStream, bsGetBitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetBit()}
 * @utbot.throwsException {@link java.io.IOException} in: int thech = this.in.read();
 *  */
    @Test(expected = IOException.class)
    public void testBsGetBit_ThrowIOException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        CheckedInputStream in = ((CheckedInputStream) createInstance("java.util.zip.CheckedInputStream"));
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetBitMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetBit");
        bsGetBitMethod.setAccessible(true);
        java.lang.Object[] bsGetBitMethodArguments = new java.lang.Object[0];
        try {
            bsGetBitMethod.invoke(bZip2CompressorInputStream, bsGetBitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetBit()}
 * @utbot.throwsException {@link java.io.IOException} when: thech < 0
 *  */
    @Test(expected = IOException.class)
    public void testBsGetBit_ThrowIOException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetBitMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetBit");
        bsGetBitMethod.setAccessible(true);
        java.lang.Object[] bsGetBitMethodArguments = new java.lang.Object[0];
        try {
            bsGetBitMethod.invoke(bZip2CompressorInputStream, bsGetBitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetBit()}
 * @utbot.throwsException {@link java.io.IOException} when: thech < 0
 *  */
    @Test(expected = IOException.class)
    public void testBsGetBit_ThrowIOException_4() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        java.security.CodeSigner[] signers = {null};
        setField(entry, "java.util.jar.JarEntry", "signers", signers);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetBitMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetBit");
        bsGetBitMethod.setAccessible(true);
        java.lang.Object[] bsGetBitMethodArguments = new java.lang.Object[0];
        try {
            bsGetBitMethod.invoke(bZip2CompressorInputStream, bsGetBitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetBit()}
 * @utbot.throwsException {@link java.io.IOException} when: thech < 0
 *  */
    @Test(expected = IOException.class)
    public void testBsGetBit_ThrowIOException_5() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        byte[] singleByteBuf = {(byte) 0};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetBitMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetBit");
        bsGetBitMethod.setAccessible(true);
        java.lang.Object[] bsGetBitMethodArguments = new java.lang.Object[0];
        try {
            bsGetBitMethod.invoke(bZip2CompressorInputStream, bsGetBitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method bsGetBit()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetBit()}
 * @utbot.executesCondition {@code (bsLiveShadow < 1): True}
 * @utbot.invokes {@link java.io.InputStream#read()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int thech = this.in.read();
 *  */
    @Test(expected = NullPointerException.class)
    public void testBsGetBit_ThrowNullPointerException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetBitMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetBit");
        bsGetBitMethod.setAccessible(true);
        java.lang.Object[] bsGetBitMethodArguments = new java.lang.Object[0];
        try {
            bsGetBitMethod.invoke(bZip2CompressorInputStream, bsGetBitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for bsGetBit
    
    public void testBsGetBit_errors()
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
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetInt
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method bsGetInt()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetInt()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (((((bsR(8) << 8) | bsR(8)) << 8) | bsR(8)) << 8) | bsR(8);
 *  */
    @Test
    public void testBsGetInt_ThrowNullPointerException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetInt] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(BZip2CompressorInputStream.java:381)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetInt(BZip2CompressorInputStream.java:423) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetIntMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetInt");
        bsGetIntMethod.setAccessible(true);
        java.lang.Object[] bsGetIntMethodArguments = new java.lang.Object[0];
        try {
            bsGetIntMethod.invoke(bZip2CompressorInputStream, bsGetIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetInt()}
 * @utbot.invokes org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsR(int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (((((bsR(8) << 8) | bsR(8)) << 8) | bsR(8)) << 8) | bsR(8);
 *  */
    @Test
    public void testBsGetInt_ThrowNullPointerException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 9);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetInt] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(BZip2CompressorInputStream.java:381)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetInt(BZip2CompressorInputStream.java:423) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetIntMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetInt");
        bsGetIntMethod.setAccessible(true);
        java.lang.Object[] bsGetIntMethodArguments = new java.lang.Object[0];
        try {
            bsGetIntMethod.invoke(bZip2CompressorInputStream, bsGetIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method bsGetInt()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetInt()}
 * @utbot.throwsException {@link java.io.IOException} in: return (((((bsR(8) << 8) | bsR(8)) << 8) | bsR(8)) << 8) | bsR(8);
 *  */
    @Test(expected = IOException.class)
    public void testBsGetInt_ThrowIOException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetIntMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetInt");
        bsGetIntMethod.setAccessible(true);
        java.lang.Object[] bsGetIntMethodArguments = new java.lang.Object[0];
        try {
            bsGetIntMethod.invoke(bZip2CompressorInputStream, bsGetIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetInt()}
 * @utbot.invokes org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsR(int)
 * @utbot.throwsException {@link java.io.IOException} in: return (((((bsR(8) << 8) | bsR(8)) << 8) | bsR(8)) << 8) | bsR(8);
 *  */
    @Test(expected = IOException.class)
    public void testBsGetInt_ThrowIOException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 9);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetIntMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetInt");
        bsGetIntMethod.setAccessible(true);
        java.lang.Object[] bsGetIntMethodArguments = new java.lang.Object[0];
        try {
            bsGetIntMethod.invoke(bZip2CompressorInputStream, bsGetIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetInt()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testBsGetInt_ThrowIOException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        CheckedInputStream in = ((CheckedInputStream) createInstance("java.util.zip.CheckedInputStream"));
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetIntMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetInt");
        bsGetIntMethod.setAccessible(true);
        java.lang.Object[] bsGetIntMethodArguments = new java.lang.Object[0];
        try {
            bsGetIntMethod.invoke(bZip2CompressorInputStream, bsGetIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetInt()}
 * @utbot.throwsException {@link java.io.IOException} in: return (((((bsR(8) << 8) | bsR(8)) << 8) | bsR(8)) << 8) | bsR(8);
 *  */
    @Test(expected = IOException.class)
    public void testBsGetInt_ThrowIOException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        CheckedInputStream in = ((CheckedInputStream) createInstance("java.util.zip.CheckedInputStream"));
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in1, "java.util.jar.JarInputStream", "first", first);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetIntMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetInt");
        bsGetIntMethod.setAccessible(true);
        java.lang.Object[] bsGetIntMethodArguments = new java.lang.Object[0];
        try {
            bsGetIntMethod.invoke(bZip2CompressorInputStream, bsGetIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method bsGetInt()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetInt()}
 * @utbot.invokes org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsR(int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (((((bsR(8) << 8) | bsR(8)) << 8) | bsR(8)) << 8) | bsR(8);
 *  */
    @Test(expected = NullPointerException.class)
    public void testBsGetInt_ThrowNullPointerException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method bsGetIntMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsGetInt");
        bsGetIntMethod.setAccessible(true);
        java.lang.Object[] bsGetIntMethodArguments = new java.lang.Object[0];
        try {
            bsGetIntMethod.invoke(bZip2CompressorInputStream, bsGetIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for bsGetInt
    
    public void testBsGetInt_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method bsR(int)
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsR(int)}
 * @utbot.executesCondition {@code (bsLiveShadow < n): False}
 * @utbot.returnsFrom {@code return (bsBuffShadow >> (bsLiveShadow - n)) & ((1 << n) - 1);}
 *  */
    @Test
    public void testBsR_BsLiveShadowGreaterOrEqualN() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", -255);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method bsRMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsR", intType);
        bsRMethod.setAccessible(true);
        java.lang.Object[] bsRMethodArguments = new java.lang.Object[1];
        bsRMethodArguments[0] = -255;
        int actual = ((Integer) bsRMethod.invoke(bZip2CompressorInputStream, bsRMethodArguments));
        
        assertEquals(1, actual);
        
        int finalBZip2CompressorInputStreamBsLive = ((Integer) getFieldValue(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive"));
        
        assertEquals(0, finalBZip2CompressorInputStreamBsLive);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method bsR(int)
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsR(int)}
 * @utbot.executesCondition {@code (bsLiveShadow < n): True}
 * @utbot.invokes {@link java.io.InputStream#read()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int thech = inShadow.read();
 *  */
    @Test
    public void testBsR_ThrowNullPointerException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 255);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(BZip2CompressorInputStream.java:381) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method bsRMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsR", intType);
        bsRMethod.setAccessible(true);
        java.lang.Object[] bsRMethodArguments = new java.lang.Object[1];
        bsRMethodArguments[0] = 256;
        try {
            bsRMethod.invoke(bZip2CompressorInputStream, bsRMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method bsR(int)
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsR(int)}
 * @utbot.throwsException {@link java.io.IOException} in: int thech = inShadow.read();
 *  */
    @Test(expected = IOException.class)
    public void testBsR_ThrowIOException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 255);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method bsRMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsR", intType);
        bsRMethod.setAccessible(true);
        java.lang.Object[] bsRMethodArguments = new java.lang.Object[1];
        bsRMethodArguments[0] = 256;
        try {
            bsRMethod.invoke(bZip2CompressorInputStream, bsRMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsR(int)}
 * @utbot.throwsException {@link java.io.IOException} in: int thech = inShadow.read();
 *  */
    @Test(expected = IOException.class)
    public void testBsR_ThrowIOException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 255);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method bsRMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsR", intType);
        bsRMethod.setAccessible(true);
        java.lang.Object[] bsRMethodArguments = new java.lang.Object[1];
        bsRMethodArguments[0] = 256;
        try {
            bsRMethod.invoke(bZip2CompressorInputStream, bsRMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsR(int)}
 * @utbot.throwsException {@link java.io.IOException} in: int thech = inShadow.read();
 *  */
    @Test(expected = IOException.class)
    public void testBsR_ThrowIOException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 255);
        CheckedInputStream in = ((CheckedInputStream) createInstance("java.util.zip.CheckedInputStream"));
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method bsRMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsR", intType);
        bsRMethod.setAccessible(true);
        java.lang.Object[] bsRMethodArguments = new java.lang.Object[1];
        bsRMethodArguments[0] = 256;
        try {
            bsRMethod.invoke(bZip2CompressorInputStream, bsRMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsR(int)}
 * @utbot.throwsException {@link java.io.IOException} when: thech < 0
 *  */
    @Test(expected = IOException.class)
    public void testBsR_ThrowIOException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 255);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method bsRMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsR", intType);
        bsRMethod.setAccessible(true);
        java.lang.Object[] bsRMethodArguments = new java.lang.Object[1];
        bsRMethodArguments[0] = 256;
        try {
            bsRMethod.invoke(bZip2CompressorInputStream, bsRMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsR(int)}
 * @utbot.throwsException {@link java.io.IOException} when: thech < 0
 *  */
    @Test(expected = IOException.class)
    public void testBsR_ThrowIOException_4() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 255);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        java.security.CodeSigner[] signers = {null};
        setField(entry, "java.util.jar.JarEntry", "signers", signers);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method bsRMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsR", intType);
        bsRMethod.setAccessible(true);
        java.lang.Object[] bsRMethodArguments = new java.lang.Object[1];
        bsRMethodArguments[0] = 256;
        try {
            bsRMethod.invoke(bZip2CompressorInputStream, bsRMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsR(int)}
 * @utbot.throwsException {@link java.io.IOException} when: thech < 0
 *  */
    @Test(expected = IOException.class)
    public void testBsR_ThrowIOException_5() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 255);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        byte[] singleByteBuf = {(byte) 0};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method bsRMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsR", intType);
        bsRMethod.setAccessible(true);
        java.lang.Object[] bsRMethodArguments = new java.lang.Object[1];
        bsRMethodArguments[0] = 256;
        try {
            bsRMethod.invoke(bZip2CompressorInputStream, bsRMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsR(int)}
 * @utbot.throwsException {@link java.io.IOException} when: thech < 0
 *  */
    @Test(expected = IOException.class)
    public void testBsR_ThrowIOException_6() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 255);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
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
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method bsRMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsR", intType);
        bsRMethod.setAccessible(true);
        java.lang.Object[] bsRMethodArguments = new java.lang.Object[1];
        bsRMethodArguments[0] = 256;
        try {
            bsRMethod.invoke(bZip2CompressorInputStream, bsRMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method bsR(int)
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsR(int)}
 * @utbot.executesCondition {@code (bsLiveShadow < n): True}
 * @utbot.invokes {@link java.io.InputStream#read()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int thech = inShadow.read();
 *  */
    @Test(expected = NullPointerException.class)
    public void testBsR_ThrowNullPointerException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 255);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class intType = int.class;
        Method bsRMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("bsR", intType);
        bsRMethod.setAccessible(true);
        java.lang.Object[] bsRMethodArguments = new java.lang.Object[1];
        bsRMethodArguments[0] = 256;
        try {
            bsRMethod.invoke(bZip2CompressorInputStream, bsRMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for bsR
    
    public void testBsR_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method initBlock()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#initBlock()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: magic0 = bsGetUByte();
 *  */
    @Test
    public void testInitBlock_ThrowNullPointerException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(BZip2CompressorInputStream.java:381)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte(BZip2CompressorInputStream.java:419)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock(BZip2CompressorInputStream.java:276) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method initBlockMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("initBlock");
        initBlockMethod.setAccessible(true);
        java.lang.Object[] initBlockMethodArguments = new java.lang.Object[0];
        try {
            initBlockMethod.invoke(bZip2CompressorInputStream, initBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#initBlock()}
 * @utbot.invokes org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetUByte()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: magic1 = bsGetUByte();
 *  */
    @Test
    public void testInitBlock_ThrowNullPointerException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 9);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(BZip2CompressorInputStream.java:381)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte(BZip2CompressorInputStream.java:419)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock(BZip2CompressorInputStream.java:277) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method initBlockMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("initBlock");
        initBlockMethod.setAccessible(true);
        java.lang.Object[] initBlockMethodArguments = new java.lang.Object[0];
        try {
            initBlockMethod.invoke(bZip2CompressorInputStream, initBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method initBlock()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#initBlock()}
 * @utbot.invokes org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetUByte()
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testInitBlock_ThrowNullPointerException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method initBlockMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("initBlock");
        initBlockMethod.setAccessible(true);
        java.lang.Object[] initBlockMethodArguments = new java.lang.Object[0];
        try {
            initBlockMethod.invoke(bZip2CompressorInputStream, initBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method initBlock()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#initBlock()}
 * @utbot.invokes org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#bsGetUByte()
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testInitBlock_ThrowIOException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        CheckedInputStream in = ((CheckedInputStream) createInstance("java.util.zip.CheckedInputStream"));
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method initBlockMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("initBlock");
        initBlockMethod.setAccessible(true);
        java.lang.Object[] initBlockMethodArguments = new java.lang.Object[0];
        try {
            initBlockMethod.invoke(bZip2CompressorInputStream, initBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for initBlock
    
    public void testInitBlock_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.makeMaps
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method makeMaps()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#makeMaps()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < 256; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: seqToUnseq[nInUseShadow++] = (byte) i;
 *  */
    @Test
    public void testMakeMaps_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        boolean[] inUse = {true};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "inUse", inUse);
        byte[] seqToUnseq = {};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "seqToUnseq", seqToUnseq);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.makeMaps] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.makeMaps(BZip2CompressorInputStream.java:191) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method makeMapsMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("makeMaps");
        makeMapsMethod.setAccessible(true);
        java.lang.Object[] makeMapsMethodArguments = new java.lang.Object[0];
        try {
            makeMapsMethod.invoke(bZip2CompressorInputStream, makeMapsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#makeMaps()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < 256; i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: inUse[i]
 *  */
    @Test
    public void testMakeMaps_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        boolean[] inUse = {true};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "inUse", inUse);
        byte[] seqToUnseq = {(byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "seqToUnseq", seqToUnseq);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.makeMaps] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.makeMaps(BZip2CompressorInputStream.java:190) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method makeMapsMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("makeMaps");
        makeMapsMethod.setAccessible(true);
        java.lang.Object[] makeMapsMethodArguments = new java.lang.Object[0];
        try {
            makeMapsMethod.invoke(bZip2CompressorInputStream, makeMapsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#makeMaps()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < 256; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: inUse[i]
 *  */
    @Test
    public void testMakeMaps_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        boolean[] inUse = {};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "inUse", inUse);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.makeMaps] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.makeMaps(BZip2CompressorInputStream.java:190) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method makeMapsMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("makeMaps");
        makeMapsMethod.setAccessible(true);
        java.lang.Object[] makeMapsMethodArguments = new java.lang.Object[0];
        try {
            makeMapsMethod.invoke(bZip2CompressorInputStream, makeMapsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#makeMaps()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean[] inUse = this.data.inUse;
 *  */
    @Test
    public void testMakeMaps_ThrowNullPointerException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.makeMaps] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.makeMaps(BZip2CompressorInputStream.java:184) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method makeMapsMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("makeMaps");
        makeMapsMethod.setAccessible(true);
        java.lang.Object[] makeMapsMethodArguments = new java.lang.Object[0];
        try {
            makeMapsMethod.invoke(bZip2CompressorInputStream, makeMapsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#makeMaps()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < 256; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: seqToUnseq[nInUseShadow++] = (byte) i;
 *  */
    @Test
    public void testMakeMaps_ThrowNullPointerException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        boolean[] inUse = {true};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "inUse", inUse);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.makeMaps] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.makeMaps(BZip2CompressorInputStream.java:191) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method makeMapsMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("makeMaps");
        makeMapsMethod.setAccessible(true);
        java.lang.Object[] makeMapsMethodArguments = new java.lang.Object[0];
        try {
            makeMapsMethod.invoke(bZip2CompressorInputStream, makeMapsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#makeMaps()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < 256; i++)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: seqToUnseq[nInUseShadow++] = (byte) i;
 *  */
    @Test
    public void testMakeMaps_ThrowNullPointerException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        boolean[] inUse = {false, true};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "inUse", inUse);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.makeMaps] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.makeMaps(BZip2CompressorInputStream.java:191) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method makeMapsMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("makeMaps");
        makeMapsMethod.setAccessible(true);
        java.lang.Object[] makeMapsMethodArguments = new java.lang.Object[0];
        try {
            makeMapsMethod.invoke(bZip2CompressorInputStream, makeMapsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#makeMaps()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < 256; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: inUse[i]
 *  */
    @Test
    public void testMakeMaps_ThrowNullPointerException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.makeMaps] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.makeMaps(BZip2CompressorInputStream.java:190) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method makeMapsMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("makeMaps");
        makeMapsMethod.setAccessible(true);
        java.lang.Object[] makeMapsMethodArguments = new java.lang.Object[0];
        try {
            makeMapsMethod.invoke(bZip2CompressorInputStream, makeMapsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method endBlock()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#endBlock()}
 * @utbot.executesCondition {@code (this.storedBlockCRC != this.computedBlockCRC): False}
 * @utbot.invokes {@link org.apache.commons.compress.compressors.bzip2.CRC#getFinalCRC()}
 *  */
    @Test
    public void testEndBlock_ThisStoredBlockCRCEqualsThisComputedBlockCRC() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(crc, "org.apache.commons.compress.compressors.bzip2.CRC", "globalCrc", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedCombinedCRC", -255);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method endBlockMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("endBlock");
        endBlockMethod.setAccessible(true);
        java.lang.Object[] endBlockMethodArguments = new java.lang.Object[0];
        endBlockMethod.invoke(bZip2CompressorInputStream, endBlockMethodArguments);
        
        int finalBZip2CompressorInputStreamComputedBlockCRC = ((Integer) getFieldValue(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC"));
        int finalBZip2CompressorInputStreamComputedCombinedCRC = ((Integer) getFieldValue(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedCombinedCRC"));
        
        assertEquals(-2, finalBZip2CompressorInputStreamComputedBlockCRC);
        
        assertEquals(509, finalBZip2CompressorInputStreamComputedCombinedCRC);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method endBlock()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#endBlock()}
 * @utbot.invokes {@link org.apache.commons.compress.compressors.bzip2.CRC#getFinalCRC()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.computedBlockCRC = this.crc.getFinalCRC();
 *  */
    @Test
    public void testEndBlock_ThrowNullPointerException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock(BZip2CompressorInputStream.java:327) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method endBlockMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("endBlock");
        endBlockMethod.setAccessible(true);
        java.lang.Object[] endBlockMethodArguments = new java.lang.Object[0];
        try {
            endBlockMethod.invoke(bZip2CompressorInputStream, endBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method endBlock()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#endBlock()}
 * @utbot.executesCondition {@code (this.storedBlockCRC != this.computedBlockCRC): True}
 * @utbot.invokes {@link org.apache.commons.compress.compressors.bzip2.CRC#getFinalCRC()}
 * @utbot.throwsException {@link java.io.IOException} when: this.storedBlockCRC != this.computedBlockCRC
 *  */
    @Test(expected = IOException.class)
    public void testEndBlock_ThrowIOException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(crc, "org.apache.commons.compress.compressors.bzip2.CRC", "globalCrc", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method endBlockMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("endBlock");
        endBlockMethod.setAccessible(true);
        java.lang.Object[] endBlockMethodArguments = new java.lang.Object[0];
        try {
            endBlockMethod.invoke(bZip2CompressorInputStream, endBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.recvDecodingTables
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recvDecodingTables()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#recvDecodingTables()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean[] inUse = dataShadow.inUse;
 *  */
    @Test
    public void testRecvDecodingTables_ThrowNullPointerException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.recvDecodingTables] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.recvDecodingTables(BZip2CompressorInputStream.java:469) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method recvDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("recvDecodingTables");
        recvDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] recvDecodingTablesMethodArguments = new java.lang.Object[0];
        try {
            recvDecodingTablesMethod.invoke(bZip2CompressorInputStream, recvDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#recvDecodingTables()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < 16; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: bsGetBit()
 *  */
    @Test
    public void testRecvDecodingTables_ThrowNullPointerException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.recvDecodingTables] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetBit(BZip2CompressorInputStream.java:403)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.recvDecodingTables(BZip2CompressorInputStream.java:478) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method recvDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("recvDecodingTables");
        recvDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] recvDecodingTablesMethodArguments = new java.lang.Object[0];
        try {
            recvDecodingTablesMethod.invoke(bZip2CompressorInputStream, recvDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#recvDecodingTables()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < 16; i++)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} when: bsGetBit()
 *  */
    @Test
    public void testRecvDecodingTables_ThrowNullPointerException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 1);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.recvDecodingTables] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetBit(BZip2CompressorInputStream.java:403)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.recvDecodingTables(BZip2CompressorInputStream.java:478) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method recvDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("recvDecodingTables");
        recvDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] recvDecodingTablesMethodArguments = new java.lang.Object[0];
        try {
            recvDecodingTablesMethod.invoke(bZip2CompressorInputStream, recvDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method recvDecodingTables()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#recvDecodingTables()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < 16; i++)} once
 * @utbot.throwsException {@link java.io.IOException} when: bsGetBit()
 *  */
    @Test(expected = IOException.class)
    public void testRecvDecodingTables_ThrowIOException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method recvDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("recvDecodingTables");
        recvDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] recvDecodingTablesMethodArguments = new java.lang.Object[0];
        try {
            recvDecodingTablesMethod.invoke(bZip2CompressorInputStream, recvDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#recvDecodingTables()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < 16; i++)} once
 * @utbot.throwsException {@link java.io.IOException} when: bsGetBit()
 *  */
    @Test(expected = IOException.class)
    public void testRecvDecodingTables_ThrowIOException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method recvDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("recvDecodingTables");
        recvDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] recvDecodingTablesMethodArguments = new java.lang.Object[0];
        try {
            recvDecodingTablesMethod.invoke(bZip2CompressorInputStream, recvDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#recvDecodingTables()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < 16; i++)} twice
 * @utbot.throwsException {@link java.io.IOException} when: bsGetBit()
 *  */
    @Test(expected = IOException.class)
    public void testRecvDecodingTables_ThrowIOException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 1);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method recvDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("recvDecodingTables");
        recvDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] recvDecodingTablesMethodArguments = new java.lang.Object[0];
        try {
            recvDecodingTablesMethod.invoke(bZip2CompressorInputStream, recvDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#recvDecodingTables()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < 16; i++)} once
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testRecvDecodingTables_ThrowIOException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        CheckedInputStream in = ((CheckedInputStream) createInstance("java.util.zip.CheckedInputStream"));
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method recvDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("recvDecodingTables");
        recvDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] recvDecodingTablesMethodArguments = new java.lang.Object[0];
        try {
            recvDecodingTablesMethod.invoke(bZip2CompressorInputStream, recvDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#recvDecodingTables()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < 16; i++)} twice
 * @utbot.throwsException {@link java.io.IOException} when: bsGetBit()
 *  */
    @Test(expected = IOException.class)
    public void testRecvDecodingTables_ThrowIOException_4() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 1);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        boolean[] inUse = {false};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "inUse", inUse);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method recvDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("recvDecodingTables");
        recvDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] recvDecodingTablesMethodArguments = new java.lang.Object[0];
        try {
            recvDecodingTablesMethod.invoke(bZip2CompressorInputStream, recvDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#recvDecodingTables()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < 16; i++)} twice
 * @utbot.throwsException {@link java.io.IOException} when: bsGetBit()
 *  */
    @Test(expected = IOException.class)
    public void testRecvDecodingTables_ThrowIOException_5() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 1);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method recvDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("recvDecodingTables");
        recvDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] recvDecodingTablesMethodArguments = new java.lang.Object[0];
        try {
            recvDecodingTablesMethod.invoke(bZip2CompressorInputStream, recvDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method recvDecodingTables()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#recvDecodingTables()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < 16; i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: bsGetBit()
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRecvDecodingTables_ThrowIndexOutOfBoundsException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        byte[] singleByteBuf = {};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method recvDecodingTablesMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("recvDecodingTables");
        recvDecodingTablesMethod.setAccessible(true);
        java.lang.Object[] recvDecodingTablesMethodArguments = new java.lang.Object[0];
        try {
            recvDecodingTablesMethod.invoke(bZip2CompressorInputStream, recvDecodingTablesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for recvDecodingTables
    
    public void testRecvDecodingTables_errors()
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
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setupBlock()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupBlock()}
 * @utbot.executesCondition {@code (currentState == EOF): True}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testSetupBlock_CurrentStateEqualsEOF() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupBlockMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupBlock");
        setupBlockMethod.setAccessible(true);
        java.lang.Object[] setupBlockMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) setupBlockMethod.invoke(bZip2CompressorInputStream, setupBlockMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupBlock()}
 * @utbot.executesCondition {@code (currentState == EOF): False}
 * @utbot.executesCondition {@code (this.data == null): True}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testSetupBlock_ThisDataEqualsNull() throws Exception  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupBlockMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupBlock");
        setupBlockMethod.setAccessible(true);
        java.lang.Object[] setupBlockMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) setupBlockMethod.invoke(bZip2CompressorInputStream, setupBlockMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setupBlock()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupBlock()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final int[] tt = this.data.initTT(this.last + 1);
 *  */
    @Test
    public void testSetupBlock_ThrowNegativeArraySizeException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] cftab = {-255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "cftab", cftab);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock] produces [java.lang.NegativeArraySizeException: -2]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data.initTT(BZip2CompressorInputStream.java:1008)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock(BZip2CompressorInputStream.java:807) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupBlockMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupBlock");
        setupBlockMethod.setAccessible(true);
        java.lang.Object[] setupBlockMethodArguments = new java.lang.Object[0];
        try {
            setupBlockMethod.invoke(bZip2CompressorInputStream, setupBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupBlock()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: cftab[0] = 0;
 *  */
    @Test
    public void testSetupBlock_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] cftab = {};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "cftab", cftab);
        int[] tt = {-255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock(BZip2CompressorInputStream.java:809) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupBlockMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupBlock");
        setupBlockMethod.setAccessible(true);
        java.lang.Object[] setupBlockMethodArguments = new java.lang.Object[0];
        try {
            setupBlockMethod.invoke(bZip2CompressorInputStream, setupBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupBlock()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(this.data.unzftab, 0, cftab, 1, 256);
 *  */
    @Test
    public void testSetupBlock_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] unzftab = {-255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "unzftab", unzftab);
        int[] cftab = {-255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "cftab", cftab);
        int[] tt = {-255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 256 out of bounds for int[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock(BZip2CompressorInputStream.java:810) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupBlockMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupBlock");
        setupBlockMethod.setAccessible(true);
        java.lang.Object[] setupBlockMethodArguments = new java.lang.Object[0];
        try {
            setupBlockMethod.invoke(bZip2CompressorInputStream, setupBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupBlock()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cftab[0] = 0;
 *  */
    @Test
    public void testSetupBlock_ThrowNullPointerException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {-255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock(BZip2CompressorInputStream.java:809) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupBlockMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupBlock");
        setupBlockMethod.setAccessible(true);
        java.lang.Object[] setupBlockMethodArguments = new java.lang.Object[0];
        try {
            setupBlockMethod.invoke(bZip2CompressorInputStream, setupBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupBlock()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cftab[0] = 0;
 *  */
    @Test
    public void testSetupBlock_ThrowNullPointerException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock(BZip2CompressorInputStream.java:809) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupBlockMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupBlock");
        setupBlockMethod.setAccessible(true);
        java.lang.Object[] setupBlockMethodArguments = new java.lang.Object[0];
        try {
            setupBlockMethod.invoke(bZip2CompressorInputStream, setupBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupBlock()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cftab[0] = 0;
 *  */
    @Test
    public void testSetupBlock_ThrowNullPointerException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock(BZip2CompressorInputStream.java:809) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupBlockMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupBlock");
        setupBlockMethod.setAccessible(true);
        java.lang.Object[] setupBlockMethodArguments = new java.lang.Object[0];
        try {
            setupBlockMethod.invoke(bZip2CompressorInputStream, setupBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupBlock()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(this.data.unzftab, 0, cftab, 1, 256);
 *  */
    @Test
    public void testSetupBlock_ThrowNullPointerException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] cftab = {-255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "cftab", cftab);
        int[] tt = {};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock(BZip2CompressorInputStream.java:810) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupBlockMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupBlock");
        setupBlockMethod.setAccessible(true);
        java.lang.Object[] setupBlockMethodArguments = new java.lang.Object[0];
        try {
            setupBlockMethod.invoke(bZip2CompressorInputStream, setupBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupBlock()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(this.data.unzftab, 0, cftab, 1, 256);
 *  */
    @Test
    public void testSetupBlock_ThrowNullPointerException_5() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] cftab = {-255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "cftab", cftab);
        int[] tt = {-255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock(BZip2CompressorInputStream.java:810) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupBlockMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupBlock");
        setupBlockMethod.setAccessible(true);
        java.lang.Object[] setupBlockMethodArguments = new java.lang.Object[0];
        try {
            setupBlockMethod.invoke(bZip2CompressorInputStream, setupBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupBlock()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(this.data.unzftab, 0, cftab, 1, 256);
 *  */
    @Test
    public void testSetupBlock_ThrowNullPointerException_4() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 1);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] cftab = {-255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "cftab", cftab);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock(BZip2CompressorInputStream.java:810) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupBlockMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupBlock");
        setupBlockMethod.setAccessible(true);
        java.lang.Object[] setupBlockMethodArguments = new java.lang.Object[0];
        try {
            setupBlockMethod.invoke(bZip2CompressorInputStream, setupBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setupRandPartB()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): False}
 * @utbot.executesCondition {@code (++this.su_count >= 4): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: this.su_z = (char) (this.data.ll8[this.su_tPos] & 0xff);
 *  */
    @Test
    public void testSetupRandPartB_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", -256);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:889) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartB");
        setupRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartBMethod.invoke(bZip2CompressorInputStream, setupRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return setupRandPartA();
 *  */
    @Test
    public void testSetupRandPartB_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", 256);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -179);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -78);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 256);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", Integer.MIN_VALUE);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:841)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:887) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartB");
        setupRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartBMethod.invoke(bZip2CompressorInputStream, setupRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): False}
 * @utbot.executesCondition {@code (++this.su_count >= 4): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: this.su_tPos = this.data.tt[this.su_tPos];
 *  */
    @Test
    public void testSetupRandPartB_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", ' ');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:890) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartB");
        setupRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartBMethod.invoke(bZip2CompressorInputStream, setupRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): False}
 * @utbot.executesCondition {@code (++this.su_count >= 4): True}
 * @utbot.executesCondition {@code (this.su_rNToGo == 0): False}
 * @utbot.executesCondition {@code (this.su_rNToGo == 1): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return setupRandPartC();
 *  */
    @Test
    public void testSetupRandPartB_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", Integer.MIN_VALUE);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", Integer.MAX_VALUE);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_rNToGo", 2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", ' ');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {3, Integer.MIN_VALUE};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) -127, (byte) 1};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 2]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:841)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:921)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:904) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartB");
        setupRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartBMethod.invoke(bZip2CompressorInputStream, setupRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return setupRandPartA();
 *  */
    @Test
    public void testSetupRandPartB_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {-255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) 0, (byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:842)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:887) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartB");
        setupRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartBMethod.invoke(bZip2CompressorInputStream, setupRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): False}
 * @utbot.executesCondition {@code (++this.su_count >= 4): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.su_z = (char) (this.data.ll8[this.su_tPos] & 0xff);
 *  */
    @Test
    public void testSetupRandPartB_ThrowNullPointerException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:889) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartB");
        setupRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartBMethod.invoke(bZip2CompressorInputStream, setupRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setupRandPartA();
 *  */
    @Test
    public void testSetupRandPartB_ThrowNullPointerException_5() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -255);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:841)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:887) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartB");
        setupRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartBMethod.invoke(bZip2CompressorInputStream, setupRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): False}
 * @utbot.executesCondition {@code (++this.su_count >= 4): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setupRandPartA();
 *  */
    @Test
    public void testSetupRandPartB_ThrowNullPointerException_9() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -1);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock(BZip2CompressorInputStream.java:327)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:858)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:907) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartB");
        setupRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartBMethod.invoke(bZip2CompressorInputStream, setupRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): False}
 * @utbot.executesCondition {@code (++this.su_count >= 4): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.su_z = (char) (this.data.ll8[this.su_tPos] & 0xff);
 *  */
    @Test
    public void testSetupRandPartB_ThrowNullPointerException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", -255);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:889) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartB");
        setupRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartBMethod.invoke(bZip2CompressorInputStream, setupRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setupRandPartA();
 *  */
    @Test
    public void testSetupRandPartB_ThrowNullPointerException_4() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -255);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:841)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:887) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartB");
        setupRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartBMethod.invoke(bZip2CompressorInputStream, setupRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): False}
 * @utbot.executesCondition {@code (++this.su_count >= 4): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSetupRandPartB_ThrowNullPointerException_10() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -1);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(BZip2CompressorInputStream.java:381)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte(BZip2CompressorInputStream.java:419)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock(BZip2CompressorInputStream.java:276)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:859)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:907) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartB");
        setupRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartBMethod.invoke(bZip2CompressorInputStream, setupRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): False}
 * @utbot.executesCondition {@code (++this.su_count >= 4): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.su_tPos = this.data.tt[this.su_tPos];
 *  */
    @Test
    public void testSetupRandPartB_ThrowNullPointerException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", ' ');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:890) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartB");
        setupRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartBMethod.invoke(bZip2CompressorInputStream, setupRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): False}
 * @utbot.executesCondition {@code (++this.su_count >= 4): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setupRandPartA();
 *  */
    @Test
    public void testSetupRandPartB_ThrowNullPointerException_6() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:842)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:907) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartB");
        setupRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartBMethod.invoke(bZip2CompressorInputStream, setupRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): False}
 * @utbot.executesCondition {@code (++this.su_count >= 4): True}
 * @utbot.executesCondition {@code (this.su_rNToGo == 0): False}
 * @utbot.executesCondition {@code (this.su_rNToGo == 1): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setupRandPartC();
 *  */
    @Test
    public void testSetupRandPartB_ThrowNullPointerException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_rNToGo", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", ' ');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {0, 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) -127, (byte) 1};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:914)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:904) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartB");
        setupRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartBMethod.invoke(bZip2CompressorInputStream, setupRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setupRandPartA();
 *  */
    @Test
    public void testSetupRandPartB_ThrowNullPointerException_7() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -256);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -256);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_rNToGo", 2);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {-255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:855)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:887) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartB");
        setupRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartBMethod.invoke(bZip2CompressorInputStream, setupRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setupRandPartA();
 *  */
    @Test
    public void testSetupRandPartB_ThrowNullPointerException_8() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_rNToGo", -255);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {-255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:855)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB(BZip2CompressorInputStream.java:887) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartB");
        setupRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartBMethod.invoke(bZip2CompressorInputStream, setupRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method setupRandPartB()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartB()}
 * @utbot.throwsException {@link java.io.IOException} in: return setupRandPartA();
 *  */
    @Test(expected = IOException.class)
    public void testSetupRandPartB_ThrowIOException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -2);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(crc, "org.apache.commons.compress.compressors.bzip2.CRC", "globalCrc", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -1);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartB");
        setupRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartBMethod.invoke(bZip2CompressorInputStream, setupRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartB()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testSetupRandPartB_ThrowIOException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(crc, "org.apache.commons.compress.compressors.bzip2.CRC", "globalCrc", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -1);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartB");
        setupRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartBMethod.invoke(bZip2CompressorInputStream, setupRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setupNoRandPartB()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): False}
 * @utbot.executesCondition {@code (++this.su_count >= 4): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: this.su_z = (char) (this.data.ll8[this.su_tPos] & 0xff);
 *  */
    @Test
    public void testSetupNoRandPartB_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 129);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:930) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartB");
        setupNoRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartBMethod.invoke(bZip2CompressorInputStream, setupNoRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return setupNoRandPartA();
 *  */
    @Test
    public void testSetupNoRandPartB_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", Integer.MIN_VALUE);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:867)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:928) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartB");
        setupNoRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartBMethod.invoke(bZip2CompressorInputStream, setupNoRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): False}
 * @utbot.executesCondition {@code (++this.su_count >= 4): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: this.su_tPos = this.data.tt[this.su_tPos];
 *  */
    @Test
    public void testSetupNoRandPartB_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", ' ');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {-255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:931) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartB");
        setupNoRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartBMethod.invoke(bZip2CompressorInputStream, setupNoRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): False}
 * @utbot.executesCondition {@code (++this.su_count >= 4): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return setupNoRandPartC();
 *  */
    @Test
    public void testSetupNoRandPartB_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", Integer.MIN_VALUE);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", Integer.MAX_VALUE);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", ' ');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {256};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB] produces [java.lang.ArrayIndexOutOfBoundsException: Index 256 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:867)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC(BZip2CompressorInputStream.java:950)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:933) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartB");
        setupNoRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartBMethod.invoke(bZip2CompressorInputStream, setupNoRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): False}
 * @utbot.executesCondition {@code (++this.su_count >= 4): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return setupNoRandPartA();
 *  */
    @Test
    public void testSetupNoRandPartB_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", 8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -256);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -256);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) 0, (byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:869)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:935) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartB");
        setupNoRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartBMethod.invoke(bZip2CompressorInputStream, setupNoRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): False}
 * @utbot.executesCondition {@code (++this.su_count >= 4): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.su_z = (char) (this.data.ll8[this.su_tPos] & 0xff);
 *  */
    @Test
    public void testSetupNoRandPartB_ThrowNullPointerException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:930) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartB");
        setupNoRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartBMethod.invoke(bZip2CompressorInputStream, setupNoRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setupNoRandPartA();
 *  */
    @Test
    public void testSetupNoRandPartB_ThrowNullPointerException_4() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -251);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -255);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:867)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:928) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartB");
        setupNoRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartBMethod.invoke(bZip2CompressorInputStream, setupNoRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): False}
 * @utbot.executesCondition {@code (++this.su_count >= 4): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setupNoRandPartA();
 *  */
    @Test
    public void testSetupNoRandPartB_ThrowNullPointerException_8() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -1);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock(BZip2CompressorInputStream.java:327)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:877)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:935) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartB");
        setupNoRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartBMethod.invoke(bZip2CompressorInputStream, setupNoRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): False}
 * @utbot.executesCondition {@code (++this.su_count >= 4): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.su_z = (char) (this.data.ll8[this.su_tPos] & 0xff);
 *  */
    @Test
    public void testSetupNoRandPartB_ThrowNullPointerException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", -255);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:930) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartB");
        setupNoRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartBMethod.invoke(bZip2CompressorInputStream, setupNoRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): False}
 * @utbot.executesCondition {@code (++this.su_count >= 4): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setupNoRandPartA();
 *  */
    @Test
    public void testSetupNoRandPartB_ThrowNullPointerException_5() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:867)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:935) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartB");
        setupNoRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartBMethod.invoke(bZip2CompressorInputStream, setupNoRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): False}
 * @utbot.executesCondition {@code (++this.su_count >= 4): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSetupNoRandPartB_ThrowNullPointerException_9() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -1);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(BZip2CompressorInputStream.java:381)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte(BZip2CompressorInputStream.java:419)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock(BZip2CompressorInputStream.java:276)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:878)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:935) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartB");
        setupNoRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartBMethod.invoke(bZip2CompressorInputStream, setupNoRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): False}
 * @utbot.executesCondition {@code (++this.su_count >= 4): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.su_tPos = this.data.tt[this.su_tPos];
 *  */
    @Test
    public void testSetupNoRandPartB_ThrowNullPointerException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", ' ');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:931) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartB");
        setupNoRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartBMethod.invoke(bZip2CompressorInputStream, setupNoRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setupNoRandPartA();
 *  */
    @Test
    public void testSetupNoRandPartB_ThrowNullPointerException_7() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -255);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:869)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:928) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartB");
        setupNoRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartBMethod.invoke(bZip2CompressorInputStream, setupNoRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): False}
 * @utbot.executesCondition {@code (++this.su_count >= 4): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setupNoRandPartC();
 *  */
    @Test
    public void testSetupNoRandPartB_ThrowNullPointerException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 3);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", ' ');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {1, -255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) -127, (byte) 1};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC(BZip2CompressorInputStream.java:943)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:933) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartB");
        setupNoRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartBMethod.invoke(bZip2CompressorInputStream, setupNoRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartB()}
 * @utbot.executesCondition {@code (this.su_ch2 != this.su_chPrev): False}
 * @utbot.executesCondition {@code (++this.su_count >= 4): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setupNoRandPartA();
 *  */
    @Test
    public void testSetupNoRandPartB_ThrowNullPointerException_6() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) 0};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:873)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB(BZip2CompressorInputStream.java:935) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartB");
        setupNoRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartBMethod.invoke(bZip2CompressorInputStream, setupNoRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method setupNoRandPartB()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartB()}
 * @utbot.throwsException {@link java.io.IOException} in: return setupNoRandPartA();
 *  */
    @Test(expected = IOException.class)
    public void testSetupNoRandPartB_ThrowIOException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -2);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -1);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartB");
        setupNoRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartBMethod.invoke(bZip2CompressorInputStream, setupNoRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartB()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testSetupNoRandPartB_ThrowIOException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -1);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartBMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartB");
        setupNoRandPartBMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartBMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartBMethod.invoke(bZip2CompressorInputStream, setupNoRandPartBMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for setupNoRandPartB
    
    public void testSetupNoRandPartB_errors()
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
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setupNoRandPartC()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartC()}
 * @utbot.executesCondition {@code (this.su_j2 < this.su_z): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return setupNoRandPartA();
 *  */
    @Test
    public void testSetupNoRandPartC_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", 256);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", -256);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:867)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC(BZip2CompressorInputStream.java:950) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartC");
        setupNoRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartCMethod.invoke(bZip2CompressorInputStream, setupNoRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartC()}
 * @utbot.executesCondition {@code (this.su_j2 < this.su_z): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return setupNoRandPartA();
 *  */
    @Test
    public void testSetupNoRandPartC_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", 256);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 40);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '(');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {-255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:869)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC(BZip2CompressorInputStream.java:950) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartC");
        setupNoRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartCMethod.invoke(bZip2CompressorInputStream, setupNoRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartC()}
 * @utbot.executesCondition {@code (this.su_j2 < this.su_z): True}
 * @utbot.invokes {@link org.apache.commons.compress.compressors.bzip2.CRC#updateCRC(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.crc.updateCRC(su_ch2Shadow);
 *  */
    @Test
    public void testSetupNoRandPartC_ThrowNullPointerException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 63);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '@');
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC(BZip2CompressorInputStream.java:943) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartC");
        setupNoRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartCMethod.invoke(bZip2CompressorInputStream, setupNoRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartC()}
 * @utbot.executesCondition {@code (this.su_j2 < this.su_z): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setupNoRandPartA();
 *  */
    @Test
    public void testSetupNoRandPartC_ThrowNullPointerException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", 256);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:867)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC(BZip2CompressorInputStream.java:950) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartC");
        setupNoRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartCMethod.invoke(bZip2CompressorInputStream, setupNoRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartC()}
 * @utbot.executesCondition {@code (this.su_j2 < this.su_z): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setupNoRandPartA();
 *  */
    @Test
    public void testSetupNoRandPartC_ThrowNullPointerException_5() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock(BZip2CompressorInputStream.java:327)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:877)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC(BZip2CompressorInputStream.java:950) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartC");
        setupNoRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartCMethod.invoke(bZip2CompressorInputStream, setupNoRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartC()}
 * @utbot.executesCondition {@code (this.su_j2 < this.su_z): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setupNoRandPartA();
 *  */
    @Test
    public void testSetupNoRandPartC_ThrowNullPointerException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", 256);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:867)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC(BZip2CompressorInputStream.java:950) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartC");
        setupNoRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartCMethod.invoke(bZip2CompressorInputStream, setupNoRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartC()}
 * @utbot.executesCondition {@code (this.su_j2 < this.su_z): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSetupNoRandPartC_ThrowNullPointerException_6() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(BZip2CompressorInputStream.java:381)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte(BZip2CompressorInputStream.java:419)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock(BZip2CompressorInputStream.java:276)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:878)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC(BZip2CompressorInputStream.java:950) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartC");
        setupNoRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartCMethod.invoke(bZip2CompressorInputStream, setupNoRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartC()}
 * @utbot.executesCondition {@code (this.su_j2 < this.su_z): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setupNoRandPartA();
 *  */
    @Test
    public void testSetupNoRandPartC_ThrowNullPointerException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", 256);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:869)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC(BZip2CompressorInputStream.java:950) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartC");
        setupNoRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartCMethod.invoke(bZip2CompressorInputStream, setupNoRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartC()}
 * @utbot.executesCondition {@code (this.su_j2 < this.su_z): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setupNoRandPartA();
 *  */
    @Test
    public void testSetupNoRandPartC_ThrowNullPointerException_4() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", 256);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {-255, -255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:873)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC(BZip2CompressorInputStream.java:950) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartC");
        setupNoRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartCMethod.invoke(bZip2CompressorInputStream, setupNoRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method setupNoRandPartC()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartC()}
 * @utbot.throwsException {@link java.io.IOException} in: return setupNoRandPartA();
 *  */
    @Test(expected = IOException.class)
    public void testSetupNoRandPartC_ThrowIOException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -254);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartC");
        setupNoRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartCMethod.invoke(bZip2CompressorInputStream, setupNoRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartC()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testSetupNoRandPartC_ThrowIOException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartC");
        setupNoRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartCMethod.invoke(bZip2CompressorInputStream, setupNoRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartC()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testSetupNoRandPartC_ThrowIOException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        CheckedInputStream in = ((CheckedInputStream) createInstance("java.util.zip.CheckedInputStream"));
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartC");
        setupNoRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartCMethod.invoke(bZip2CompressorInputStream, setupNoRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setupNoRandPartC()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartC()}
 * @utbot.executesCondition {@code (this.su_j2 < this.su_z): False}
 * @utbot.invokes org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartA()
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetupNoRandPartC_ThrowIndexOutOfBoundsException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        byte[] singleByteBuf = {};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartC");
        setupNoRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartCMethod.invoke(bZip2CompressorInputStream, setupNoRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for setupNoRandPartC
    
    public void testSetupNoRandPartC_errors()
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
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setupNoRandPartA()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartA()}
 * @utbot.executesCondition {@code (this.su_i2 <= this.last): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int su_ch2Shadow = this.data.ll8[this.su_tPos] & 0xff;
 *  */
    @Test
    public void testSetupNoRandPartA_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 129);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:867) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartA");
        setupNoRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartAMethod.invoke(bZip2CompressorInputStream, setupNoRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartA()}
 * @utbot.executesCondition {@code (this.su_i2 <= this.last): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: this.su_tPos = this.data.tt[this.su_tPos];
 *  */
    @Test
    public void testSetupNoRandPartA_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {-255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:869) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartA");
        setupNoRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartAMethod.invoke(bZip2CompressorInputStream, setupNoRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartA()}
 * @utbot.executesCondition {@code (this.su_i2 <= this.last): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int su_ch2Shadow = this.data.ll8[this.su_tPos] & 0xff;
 *  */
    @Test
    public void testSetupNoRandPartA_ThrowNullPointerException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -255);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:867) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartA");
        setupNoRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartAMethod.invoke(bZip2CompressorInputStream, setupNoRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartA()}
 * @utbot.executesCondition {@code (this.su_i2 <= this.last): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: endBlock();
 *  */
    @Test
    public void testSetupNoRandPartA_ThrowNullPointerException_4() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -1);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock(BZip2CompressorInputStream.java:327)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:877) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartA");
        setupNoRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartAMethod.invoke(bZip2CompressorInputStream, setupNoRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartA()}
 * @utbot.executesCondition {@code (this.su_i2 <= this.last): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int su_ch2Shadow = this.data.ll8[this.su_tPos] & 0xff;
 *  */
    @Test
    public void testSetupNoRandPartA_ThrowNullPointerException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", -255);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:867) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartA");
        setupNoRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartAMethod.invoke(bZip2CompressorInputStream, setupNoRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartA()}
 * @utbot.executesCondition {@code (this.su_i2 <= this.last): False}
 * @utbot.invokes org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#initBlock()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: initBlock();
 *  */
    @Test
    public void testSetupNoRandPartA_ThrowNullPointerException_5() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 9);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(crc, "org.apache.commons.compress.compressors.bzip2.CRC", "globalCrc", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -1);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(BZip2CompressorInputStream.java:381)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte(BZip2CompressorInputStream.java:419)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock(BZip2CompressorInputStream.java:277)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:878) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartA");
        setupNoRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartAMethod.invoke(bZip2CompressorInputStream, setupNoRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartA()}
 * @utbot.executesCondition {@code (this.su_i2 <= this.last): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.su_tPos = this.data.tt[this.su_tPos];
 *  */
    @Test
    public void testSetupNoRandPartA_ThrowNullPointerException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:869) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartA");
        setupNoRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartAMethod.invoke(bZip2CompressorInputStream, setupNoRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartA()}
 * @utbot.executesCondition {@code (this.su_i2 <= this.last): True}
 * @utbot.invokes {@link org.apache.commons.compress.compressors.bzip2.CRC#updateCRC(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.crc.updateCRC(su_ch2Shadow);
 *  */
    @Test
    public void testSetupNoRandPartA_ThrowNullPointerException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -252);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -252);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {-255, -255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA(BZip2CompressorInputStream.java:873) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartA");
        setupNoRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartAMethod.invoke(bZip2CompressorInputStream, setupNoRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method setupNoRandPartA()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartA()}
 * @utbot.throwsException {@link java.io.IOException} in: endBlock();
 *  */
    @Test(expected = IOException.class)
    public void testSetupNoRandPartA_ThrowIOException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -2);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(crc, "org.apache.commons.compress.compressors.bzip2.CRC", "globalCrc", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -1);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartA");
        setupNoRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartAMethod.invoke(bZip2CompressorInputStream, setupNoRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartA()}
 * @utbot.throwsException {@link java.io.IOException} in: initBlock();
 *  */
    @Test(expected = IOException.class)
    public void testSetupNoRandPartA_ThrowIOException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(crc, "org.apache.commons.compress.compressors.bzip2.CRC", "globalCrc", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -1);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartA");
        setupNoRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartAMethod.invoke(bZip2CompressorInputStream, setupNoRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartA()}
 * @utbot.throwsException {@link java.io.IOException} in: initBlock();
 *  */
    @Test(expected = IOException.class)
    public void testSetupNoRandPartA_ThrowIOException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(crc, "org.apache.commons.compress.compressors.bzip2.CRC", "globalCrc", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -1);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartA");
        setupNoRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartAMethod.invoke(bZip2CompressorInputStream, setupNoRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setupNoRandPartA()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupNoRandPartA()}
 * @utbot.executesCondition {@code (this.su_i2 <= this.last): False}
 * @utbot.invokes org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#endBlock()
 * @utbot.invokes org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#initBlock()
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: initBlock();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetupNoRandPartA_ThrowIndexOutOfBoundsException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(crc, "org.apache.commons.compress.compressors.bzip2.CRC", "globalCrc", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        byte[] singleByteBuf = {};
        setField(in, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -1);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupNoRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupNoRandPartA");
        setupNoRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupNoRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupNoRandPartAMethod.invoke(bZip2CompressorInputStream, setupNoRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for setupNoRandPartA
    
    public void testSetupNoRandPartA_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setupRandPartA()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartA()}
 * @utbot.executesCondition {@code (this.su_i2 <= this.last): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int su_ch2Shadow = this.data.ll8[this.su_tPos] & 0xff;
 *  */
    @Test
    public void testSetupRandPartA_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", -256);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:841) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartA");
        setupRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartAMethod.invoke(bZip2CompressorInputStream, setupRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartA()}
 * @utbot.executesCondition {@code (this.su_i2 <= this.last): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: this.su_tPos = this.data.tt[this.su_tPos];
 *  */
    @Test
    public void testSetupRandPartA_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {-255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:842) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartA");
        setupRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartAMethod.invoke(bZip2CompressorInputStream, setupRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartA()}
 * @utbot.executesCondition {@code (this.su_i2 <= this.last): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int su_ch2Shadow = this.data.ll8[this.su_tPos] & 0xff;
 *  */
    @Test
    public void testSetupRandPartA_ThrowNullPointerException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -255);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:841) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartA");
        setupRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartAMethod.invoke(bZip2CompressorInputStream, setupRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartA()}
 * @utbot.executesCondition {@code (this.su_i2 <= this.last): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: endBlock();
 *  */
    @Test
    public void testSetupRandPartA_ThrowNullPointerException_5() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -1);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock(BZip2CompressorInputStream.java:327)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:858) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartA");
        setupRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartAMethod.invoke(bZip2CompressorInputStream, setupRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartA()}
 * @utbot.executesCondition {@code (this.su_i2 <= this.last): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int su_ch2Shadow = this.data.ll8[this.su_tPos] & 0xff;
 *  */
    @Test
    public void testSetupRandPartA_ThrowNullPointerException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", -255);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:841) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartA");
        setupRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartAMethod.invoke(bZip2CompressorInputStream, setupRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartA()}
 * @utbot.executesCondition {@code (this.su_i2 <= this.last): False}
 * @utbot.invokes org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#initBlock()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: initBlock();
 *  */
    @Test
    public void testSetupRandPartA_ThrowNullPointerException_6() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(crc, "org.apache.commons.compress.compressors.bzip2.CRC", "globalCrc", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -1);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(BZip2CompressorInputStream.java:381)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte(BZip2CompressorInputStream.java:419)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock(BZip2CompressorInputStream.java:276)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:859) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartA");
        setupRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartAMethod.invoke(bZip2CompressorInputStream, setupRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartA()}
 * @utbot.executesCondition {@code (this.su_i2 <= this.last): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.su_tPos = this.data.tt[this.su_tPos];
 *  */
    @Test
    public void testSetupRandPartA_ThrowNullPointerException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:842) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartA");
        setupRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartAMethod.invoke(bZip2CompressorInputStream, setupRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartA()}
 * @utbot.executesCondition {@code (this.su_i2 <= this.last): True}
 * @utbot.executesCondition {@code (this.su_rNToGo == 0): False}
 * @utbot.executesCondition {@code ((this.su_rNToGo == 1)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.crc.updateCRC(su_ch2Shadow);
 *  */
    @Test
    public void testSetupRandPartA_ThrowNullPointerException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_rNToGo", 2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {-255, -255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:855) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartA");
        setupRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartAMethod.invoke(bZip2CompressorInputStream, setupRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartA()}
 * @utbot.executesCondition {@code (this.su_i2 <= this.last): True}
 * @utbot.executesCondition {@code (this.su_rNToGo == 0): False}
 * @utbot.executesCondition {@code ((this.su_rNToGo == 1)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.crc.updateCRC(su_ch2Shadow);
 *  */
    @Test
    public void testSetupRandPartA_ThrowNullPointerException_4() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_rNToGo", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {-255, -255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:855) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartA");
        setupRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartAMethod.invoke(bZip2CompressorInputStream, setupRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method setupRandPartA()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartA()}
 * @utbot.throwsException {@link java.io.IOException} in: endBlock();
 *  */
    @Test(expected = IOException.class)
    public void testSetupRandPartA_ThrowIOException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -2);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(crc, "org.apache.commons.compress.compressors.bzip2.CRC", "globalCrc", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -1);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartA");
        setupRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartAMethod.invoke(bZip2CompressorInputStream, setupRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartA()}
 * @utbot.throwsException {@link java.io.IOException} in: initBlock();
 *  */
    @Test(expected = IOException.class)
    public void testSetupRandPartA_ThrowIOException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(crc, "org.apache.commons.compress.compressors.bzip2.CRC", "globalCrc", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -1);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartA");
        setupRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartAMethod.invoke(bZip2CompressorInputStream, setupRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartA()}
 * @utbot.throwsException {@link java.io.IOException} in: initBlock();
 *  */
    @Test(expected = IOException.class)
    public void testSetupRandPartA_ThrowIOException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(crc, "org.apache.commons.compress.compressors.bzip2.CRC", "globalCrc", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -1);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartA");
        setupRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartAMethod.invoke(bZip2CompressorInputStream, setupRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setupRandPartA()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartA()}
 * @utbot.executesCondition {@code (this.su_i2 <= this.last): False}
 * @utbot.invokes org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#endBlock()
 * @utbot.invokes org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#initBlock()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: initBlock();
 *  */
    @Test(expected = NullPointerException.class)
    public void testSetupRandPartA_ThrowNullPointerException_7() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(crc, "org.apache.commons.compress.compressors.bzip2.CRC", "globalCrc", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -1);
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartAMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartA");
        setupRandPartAMethod.setAccessible(true);
        java.lang.Object[] setupRandPartAMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartAMethod.invoke(bZip2CompressorInputStream, setupRandPartAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for setupRandPartA
    
    public void testSetupRandPartA_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setupRandPartC()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartC()}
 * @utbot.executesCondition {@code (this.su_j2 < this.su_z): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return setupRandPartA();
 *  */
    @Test
    public void testSetupRandPartC_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", 256);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 129);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:841)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:921) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartC");
        setupRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartCMethod.invoke(bZip2CompressorInputStream, setupRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartC()}
 * @utbot.executesCondition {@code (this.su_j2 < this.su_z): True}
 * @utbot.invokes {@link org.apache.commons.compress.compressors.bzip2.CRC#updateCRC(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: this.crc.updateCRC(this.su_ch2);
 *  */
    @Test
    public void testSetupRandPartC_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        Class cRCClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.CRC");
        int[] prevCrc32Table = ((int[]) getStaticFieldValue(cRCClazz, "crc32Table"));
        try {
            int[] crc32Table = new int[40];
            crc32Table[1] = 79764919;
            crc32Table[2] = 159529838;
            crc32Table[3] = 222504665;
            crc32Table[4] = 319059676;
            crc32Table[5] = 398814059;
            crc32Table[6] = 445009330;
            crc32Table[7] = 507990021;
            crc32Table[8] = 638119352;
            crc32Table[9] = 583659535;
            crc32Table[10] = 797628118;
            crc32Table[11] = 726387553;
            crc32Table[12] = 890018660;
            crc32Table[13] = 835552979;
            crc32Table[14] = 1015980042;
            crc32Table[15] = 944750013;
            crc32Table[16] = 1276238704;
            crc32Table[17] = 1221641927;
            crc32Table[18] = 1167319070;
            crc32Table[19] = 1095957929;
            crc32Table[20] = 1595256236;
            crc32Table[21] = 1540665371;
            crc32Table[22] = 1452775106;
            crc32Table[23] = 1381403509;
            crc32Table[24] = 1780037320;
            crc32Table[25] = 1859660671;
            crc32Table[26] = 1671105958;
            crc32Table[27] = 1733955601;
            crc32Table[28] = 2031960084;
            crc32Table[29] = 2111593891;
            crc32Table[30] = 1889500026;
            crc32Table[31] = 1952343757;
            crc32Table[32] = -1742489888;
            crc32Table[33] = -1662866601;
            crc32Table[34] = -1851683442;
            crc32Table[35] = -1788833735;
            crc32Table[36] = -1960329156;
            crc32Table[37] = -1880695413;
            crc32Table[38] = -2103051438;
            crc32Table[39] = -2040207643;
            setStaticField(cRCClazz, "crc32Table", crc32Table);
            BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
            CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
            setField(crc, "org.apache.commons.compress.compressors.bzip2.CRC", "globalCrc", -255);
            setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
            setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
            setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", 256);
            setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 63);
            setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '@');
            
            /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 40]
                org.apache.commons.compress.compressors.bzip2.CRC.updateCRC(CRC.java:119)
                org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:914) */
            Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
            Method setupRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartC");
            setupRandPartCMethod.setAccessible(true);
            java.lang.Object[] setupRandPartCMethodArguments = new java.lang.Object[0];
            try {
                setupRandPartCMethod.invoke(bZip2CompressorInputStream, setupRandPartCMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(CRC.class, "crc32Table", prevCrc32Table);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartC()}
 * @utbot.executesCondition {@code (this.su_j2 < this.su_z): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return setupRandPartA();
 *  */
    @Test
    public void testSetupRandPartC_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {-255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:842)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:921) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartC");
        setupRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartCMethod.invoke(bZip2CompressorInputStream, setupRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartC()}
 * @utbot.executesCondition {@code (this.su_j2 < this.su_z): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.crc.updateCRC(this.su_ch2);
 *  */
    @Test
    public void testSetupRandPartC_ThrowNullPointerException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentChar", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_ch2", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 63);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '@');
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:914) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartC");
        setupRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartCMethod.invoke(bZip2CompressorInputStream, setupRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartC()}
 * @utbot.executesCondition {@code (this.su_j2 < this.su_z): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setupRandPartA();
 *  */
    @Test
    public void testSetupRandPartC_ThrowNullPointerException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", 256);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:841)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:921) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartC");
        setupRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartCMethod.invoke(bZip2CompressorInputStream, setupRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartC()}
 * @utbot.executesCondition {@code (this.su_j2 < this.su_z): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setupRandPartA();
 *  */
    @Test
    public void testSetupRandPartC_ThrowNullPointerException_6() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock(BZip2CompressorInputStream.java:327)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:858)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:921) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartC");
        setupRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartCMethod.invoke(bZip2CompressorInputStream, setupRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartC()}
 * @utbot.executesCondition {@code (this.su_j2 < this.su_z): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setupRandPartA();
 *  */
    @Test
    public void testSetupRandPartC_ThrowNullPointerException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", 256);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:841)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:921) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartC");
        setupRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartCMethod.invoke(bZip2CompressorInputStream, setupRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartC()}
 * @utbot.executesCondition {@code (this.su_j2 < this.su_z): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSetupRandPartC_ThrowNullPointerException_7() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(BZip2CompressorInputStream.java:381)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte(BZip2CompressorInputStream.java:419)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock(BZip2CompressorInputStream.java:276)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:859)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:921) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartC");
        setupRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartCMethod.invoke(bZip2CompressorInputStream, setupRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartC()}
 * @utbot.executesCondition {@code (this.su_j2 < this.su_z): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSetupRandPartC_ThrowNullPointerException_8() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 9);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(BZip2CompressorInputStream.java:381)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte(BZip2CompressorInputStream.java:419)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock(BZip2CompressorInputStream.java:277)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:859)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:921) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartC");
        setupRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartCMethod.invoke(bZip2CompressorInputStream, setupRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartC()}
 * @utbot.executesCondition {@code (this.su_j2 < this.su_z): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setupRandPartA();
 *  */
    @Test
    public void testSetupRandPartC_ThrowNullPointerException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", 256);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        byte[] ll8 = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:842)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:921) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartC");
        setupRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartCMethod.invoke(bZip2CompressorInputStream, setupRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartC()}
 * @utbot.executesCondition {@code (this.su_j2 < this.su_z): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setupRandPartA();
 *  */
    @Test
    public void testSetupRandPartC_ThrowNullPointerException_4() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", 256);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_rNToGo", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {-255, -255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:855)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:921) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartC");
        setupRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartCMethod.invoke(bZip2CompressorInputStream, setupRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartC()}
 * @utbot.executesCondition {@code (this.su_j2 < this.su_z): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setupRandPartA();
 *  */
    @Test
    public void testSetupRandPartC_ThrowNullPointerException_5() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", 256);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_chPrev", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", 255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_rNToGo", 2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_tPos", 1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        Object data = createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data");
        int[] tt = {-255, -255};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "tt", tt);
        byte[] ll8 = {(byte) -127, (byte) -127};
        setField(data, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data", "ll8", ll8);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "data", data);
        
        /* This test fails because method [org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC] produces [java.lang.NullPointerException]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA(BZip2CompressorInputStream.java:855)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC(BZip2CompressorInputStream.java:921) */
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartC");
        setupRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartCMethod.invoke(bZip2CompressorInputStream, setupRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method setupRandPartC()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartC()}
 * @utbot.throwsException {@link java.io.IOException} in: return setupRandPartA();
 *  */
    @Test(expected = IOException.class)
    public void testSetupRandPartC_ThrowIOException() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -254);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -2);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartC");
        setupRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartCMethod.invoke(bZip2CompressorInputStream, setupRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartC()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testSetupRandPartC_ThrowIOException_1() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartC");
        setupRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartCMethod.invoke(bZip2CompressorInputStream, setupRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartC()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testSetupRandPartC_ThrowIOException_2() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartC");
        setupRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartCMethod.invoke(bZip2CompressorInputStream, setupRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartC()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testSetupRandPartC_ThrowIOException_3() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        CheckedInputStream in = ((CheckedInputStream) createInstance("java.util.zip.CheckedInputStream"));
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartC");
        setupRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartCMethod.invoke(bZip2CompressorInputStream, setupRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setupRandPartC()
    
    /**
    @utbot.classUnderTest {@link BZip2CompressorInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartC()}
 * @utbot.executesCondition {@code (this.su_j2 < this.su_z): False}
 * @utbot.invokes org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream#setupRandPartA()
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testSetupRandPartC_ThrowNullPointerException_9() throws Throwable  {
        BZip2CompressorInputStream bZip2CompressorInputStream = ((BZip2CompressorInputStream) createInstance("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "last", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsBuff", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "bsLive", 7);
        CRC crc = ((CRC) createInstance("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "crc", crc);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "in", in);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "currentState", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "storedBlockCRC", -1);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedBlockCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "computedCombinedCRC", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_count", -255);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_i2", -254);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_j2", 33);
        setField(bZip2CompressorInputStream, "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "su_z", '!');
        
        Class bZip2CompressorInputStreamClazz = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Method setupRandPartCMethod = bZip2CompressorInputStreamClazz.getDeclaredMethod("setupRandPartC");
        setupRandPartCMethod.setAccessible(true);
        java.lang.Object[] setupRandPartCMethodArguments = new java.lang.Object[0];
        try {
            setupRandPartCMethod.invoke(bZip2CompressorInputStream, setupRandPartCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for setupRandPartC
    
    public void testSetupRandPartC_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
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
        
                java.lang.reflect.Method methodForGetDeclaredFields971953103734600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields971953103734600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass971953103740200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields971953103734600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass971953103740200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields971953104072200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields971953104072200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass971953104073900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields971953104072200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass971953104073900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields971953104437000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields971953104437000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass971953104438600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields971953104437000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass971953104438600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields971953104949500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields971953104949500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass971953104950900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields971953104949500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass971953104950900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}


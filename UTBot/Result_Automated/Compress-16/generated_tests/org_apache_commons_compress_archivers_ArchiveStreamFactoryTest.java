package org.apache.commons.compress.archivers;

import org.junit.Test;
import java.lang.reflect.Method;
import org.junit.Ignore;
import org.tukaani.xz.LZMA2InputStream;
import java.io.ByteArrayInputStream;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import sun.net.www.http.HttpCaptureInputStream;
import java.io.DataInputStream;
import java.util.zip.CheckedInputStream;
import org.apache.commons.compress.utils.CountingInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class org_apache_commons_compress_archivers_ArchiveStreamFactoryTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveOutputStream
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createArchiveOutputStream(java.lang.String, java.io.OutputStream)
    
    /**
    @utbot.classUnderTest {@link ArchiveStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ArchiveStreamFactory#createArchiveOutputStream(java.lang.String,java.io.OutputStream)}
 * @utbot.executesCondition {@code (archiverName == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: archiverName == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStream_ThrowIllegalArgumentException() throws ArchiveException  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        
        archiveStreamFactory.createArchiveOutputStream(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ArchiveStreamFactory#createArchiveOutputStream(java.lang.String,java.io.OutputStream)}
 * @utbot.executesCondition {@code (archiverName == null): False}
 * @utbot.executesCondition {@code (out == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: out == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStream_ThrowIllegalArgumentException_1() throws ArchiveException  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        String string = "";
        
        archiveStreamFactory.createArchiveOutputStream(string, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method createArchiveOutputStream(java.lang.String, java.io.OutputStream)
    
    @Test(expected = ArchiveException.class)
    public void testCreateArchiveOutputStream1() throws Throwable  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        String string = "A\u0000";
        Object blockOutputStream = createInstance("org.tukaani.xz.BlockOutputStream");
        
        Class archiveStreamFactoryClazz = Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory");
        Class stringType = Class.forName("java.lang.String");
        Class blockOutputStreamType = Class.forName("java.io.OutputStream");
        Method createArchiveOutputStreamMethod = archiveStreamFactoryClazz.getDeclaredMethod("createArchiveOutputStream", stringType, blockOutputStreamType);
        createArchiveOutputStreamMethod.setAccessible(true);
        java.lang.Object[] createArchiveOutputStreamMethodArguments = new java.lang.Object[2];
        createArchiveOutputStreamMethodArguments[0] = string;
        createArchiveOutputStreamMethodArguments[1] = blockOutputStream;
        try {
            createArchiveOutputStreamMethod.invoke(archiveStreamFactory, createArchiveOutputStreamMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SECURITY for method createArchiveOutputStream(java.lang.String, java.io.OutputStream)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testCreateArchiveOutputStream2() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        String string = "Tar";
        Object blockOutputStream = createInstance("org.tukaani.xz.BlockOutputStream");
        
        /* This test fails because method [org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveOutputStream] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "file.encoding" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:916)
            org.apache.commons.compress.archivers.zip.ZipEncodingHelper.isUTF8(ZipEncodingHelper.java:246)
            org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(ZipEncodingHelper.java:215)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.<init>(TarArchiveOutputStream.java:148)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.<init>(TarArchiveOutputStream.java:134)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.<init>(TarArchiveOutputStream.java:93)
            org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveOutputStream(ArchiveStreamFactory.java:176) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testCreateArchiveOutputStream3() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        String string = "TaR";
        Object blockOutputStream = createInstance("org.tukaani.xz.BlockOutputStream");
        
        /* This test fails because method [org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveOutputStream] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "file.encoding" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:916)
            org.apache.commons.compress.archivers.zip.ZipEncodingHelper.isUTF8(ZipEncodingHelper.java:246)
            org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(ZipEncodingHelper.java:215)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.<init>(TarArchiveOutputStream.java:148)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.<init>(TarArchiveOutputStream.java:134)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.<init>(TarArchiveOutputStream.java:93)
            org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveOutputStream(ArchiveStreamFactory.java:176) */
    }
    ///endregion
    
    ///region Errors report for createArchiveOutputStream
    
    public void testCreateArchiveOutputStream_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createArchiveInputStream(java.lang.String, java.io.InputStream)
    
    /**
    @utbot.classUnderTest {@link ArchiveStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ArchiveStreamFactory#createArchiveInputStream(java.lang.String,java.io.InputStream)}
 * @utbot.executesCondition {@code (archiverName == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: archiverName == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStream_ThrowIllegalArgumentException() throws ArchiveException  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        
        archiveStreamFactory.createArchiveInputStream(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ArchiveStreamFactory#createArchiveInputStream(java.lang.String,java.io.InputStream)}
 * @utbot.executesCondition {@code (archiverName == null): False}
 * @utbot.executesCondition {@code (in == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: in == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStream_ThrowIllegalArgumentException_1() throws ArchiveException  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        String string = "";
        
        archiveStreamFactory.createArchiveInputStream(string, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method createArchiveInputStream(java.lang.String, java.io.InputStream)
    
    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStream1() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        String string = "\u0000\u0000";
        LZMA2InputStream lZMA2InputStream = ((LZMA2InputStream) createInstance("org.tukaani.xz.LZMA2InputStream"));
        
        archiveStreamFactory.createArchiveInputStream(string, lZMA2InputStream);
    }
    ///endregion
    
    ///region OTHER: SECURITY for method createArchiveInputStream(java.lang.String, java.io.InputStream)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testCreateArchiveInputStream2() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        String string = "Tar";
        LZMA2InputStream lZMA2InputStream = ((LZMA2InputStream) createInstance("org.tukaani.xz.LZMA2InputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "file.encoding" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:916)
            org.apache.commons.compress.archivers.zip.ZipEncodingHelper.isUTF8(ZipEncodingHelper.java:246)
            org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(ZipEncodingHelper.java:215)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.<init>(TarArchiveInputStream.java:121)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.<init>(TarArchiveInputStream.java:105)
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream.<init>(TarArchiveInputStream.java:64)
            org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream(ArchiveStreamFactory.java:135) */
    }
    ///endregion
    
    ///region Errors report for createArchiveInputStream
    
    public void testCreateArchiveInputStream_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createArchiveInputStream(java.io.InputStream)
    
    /**
    @utbot.classUnderTest {@link ArchiveStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ArchiveStreamFactory#createArchiveInputStream(java.io.InputStream)}
 * @utbot.executesCondition {@code (in == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: in == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStream_ThrowIllegalArgumentException1() throws ArchiveException  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        
        archiveStreamFactory.createArchiveInputStream(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createArchiveInputStream(java.io.InputStream)
    
    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStream3() throws Throwable  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        Object extObjectInputStream = createInstance("javax.crypto.extObjectInputStream");
        
        Class archiveStreamFactoryClazz = Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory");
        Class extObjectInputStreamType = Class.forName("java.io.InputStream");
        Method createArchiveInputStreamMethod = archiveStreamFactoryClazz.getDeclaredMethod("createArchiveInputStream", extObjectInputStreamType);
        createArchiveInputStreamMethod.setAccessible(true);
        java.lang.Object[] createArchiveInputStreamMethodArguments = new java.lang.Object[1];
        createArchiveInputStreamMethodArguments[0] = extObjectInputStream;
        try {
            createArchiveInputStreamMethod.invoke(archiveStreamFactory, createArchiveInputStreamMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method createArchiveInputStream(java.io.InputStream)
    
    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStream4() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        ByteArrayInputStream byteArrayInputStream = ((ByteArrayInputStream) createInstance("java.io.ByteArrayInputStream"));
        
        archiveStreamFactory.createArchiveInputStream(byteArrayInputStream);
    }
    
    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStream5() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        BufferedInputStream bufferedInputStream = ((BufferedInputStream) createInstance("java.io.BufferedInputStream"));
        
        archiveStreamFactory.createArchiveInputStream(bufferedInputStream);
    }
    
    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStream6() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        FilterInputStream filterInputStream = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        ByteArrayInputStream in = ((ByteArrayInputStream) createInstance("java.io.ByteArrayInputStream"));
        setField(filterInputStream, "java.io.FilterInputStream", "in", in);
        
        archiveStreamFactory.createArchiveInputStream(filterInputStream);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createArchiveInputStream(java.io.InputStream)
    
    @Test(expected = StackOverflowError.class)
    public void testCreateArchiveInputStream7() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        FilterInputStream filterInputStream = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        setField(in, "java.io.FilterInputStream", "in", in);
        setField(filterInputStream, "java.io.FilterInputStream", "in", in);
        
        archiveStreamFactory.createArchiveInputStream(filterInputStream);
    }
    
    @Test
    public void testCreateArchiveInputStream8() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        FilterInputStream filterInputStream = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in = ((FilterInputStream) createInstance("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream$1"));
        Object in1 = createInstance("org.tukaani.xz.CountingInputStream");
        Object in2 = createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream");
        FilterInputStream in3 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        Object in4 = createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream");
        FilterInputStream in5 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        Object in6 = createInstance("sun.net.www.protocol.jar.JarURLConnection$JarURLInputStream");
        FilterInputStream in7 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        Object in8 = createInstance("java.util.jar.Manifest$FastInputStream");
        HttpCaptureInputStream in9 = ((HttpCaptureInputStream) createInstance("sun.net.www.http.HttpCaptureInputStream"));
        FilterInputStream in10 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        Object in11 = createInstance("sun.net.www.protocol.jar.JarURLConnection$JarURLInputStream");
        DataInputStream in12 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        FilterInputStream in13 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        Object in14 = createInstance("sun.security.provider.FileInputStreamPool$UnclosableInputStream");
        CheckedInputStream in15 = ((CheckedInputStream) createInstance("java.util.zip.CheckedInputStream"));
        FilterInputStream in16 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        CountingInputStream in17 = ((CountingInputStream) createInstance("org.apache.commons.compress.utils.CountingInputStream"));
        FilterInputStream in18 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in19 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in20 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        DataInputStream in21 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        DataInputStream in22 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        DataInputStream in23 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        DataInputStream in24 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        DataInputStream in25 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        DataInputStream in26 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        DataInputStream in27 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        FilterInputStream in28 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        DataInputStream in29 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        DataInputStream in30 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        DataInputStream in31 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        DataInputStream in32 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        FilterInputStream in33 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        DataInputStream in34 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        DataInputStream in35 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        BufferedInputStream in36 = ((BufferedInputStream) createInstance("java.io.BufferedInputStream"));
        setField(in35, "java.io.FilterInputStream", "in", in36);
        setField(in34, "java.io.FilterInputStream", "in", in35);
        setField(in33, "java.io.FilterInputStream", "in", in34);
        setField(in32, "java.io.FilterInputStream", "in", in33);
        setField(in31, "java.io.FilterInputStream", "in", in32);
        setField(in30, "java.io.FilterInputStream", "in", in31);
        setField(in29, "java.io.FilterInputStream", "in", in30);
        setField(in28, "java.io.FilterInputStream", "in", in29);
        setField(in27, "java.io.FilterInputStream", "in", in28);
        setField(in26, "java.io.FilterInputStream", "in", in27);
        setField(in25, "java.io.FilterInputStream", "in", in26);
        setField(in24, "java.io.FilterInputStream", "in", in25);
        setField(in23, "java.io.FilterInputStream", "in", in24);
        setField(in22, "java.io.FilterInputStream", "in", in23);
        setField(in21, "java.io.FilterInputStream", "in", in22);
        setField(in20, "java.io.FilterInputStream", "in", in21);
        setField(in19, "java.io.FilterInputStream", "in", in20);
        setField(in18, "java.io.FilterInputStream", "in", in19);
        setField(in17, "java.io.FilterInputStream", "in", in18);
        setField(in16, "java.io.FilterInputStream", "in", in17);
        setField(in15, "java.io.FilterInputStream", "in", in16);
        setField(in14, "java.io.FilterInputStream", "in", in15);
        setField(in13, "java.io.FilterInputStream", "in", in14);
        setField(in12, "java.io.FilterInputStream", "in", in13);
        setField(in11, "java.io.FilterInputStream", "in", in12);
        setField(in10, "java.io.FilterInputStream", "in", in11);
        setField(in9, "java.io.FilterInputStream", "in", in10);
        setField(in8, "java.io.FilterInputStream", "in", in9);
        setField(in7, "java.io.FilterInputStream", "in", in8);
        setField(in6, "java.io.FilterInputStream", "in", in7);
        setField(in5, "java.io.FilterInputStream", "in", in6);
        setField(in4, "java.io.FilterInputStream", "in", in5);
        setField(in3, "java.io.FilterInputStream", "in", in4);
        setField(in2, "java.io.FilterInputStream", "in", in3);
        setField(in1, "java.io.FilterInputStream", "in", in2);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(filterInputStream, "java.io.FilterInputStream", "in", in);
        
        /* This test fails because method [org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.compress.archivers.dump.TapeInputStream.read(TapeInputStream.java:116)
            org.tukaani.xz.CountingInputStream.read(Unknown Source)
            java.base/java.io.FilterInputStream.read(FilterInputStream.java:132)
            java.base/java.io.FilterInputStream.read(FilterInputStream.java:132)
            java.base/java.io.FilterInputStream.read(FilterInputStream.java:106)
            org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream(ArchiveStreamFactory.java:210) */
        archiveStreamFactory.createArchiveInputStream(filterInputStream);
    }
    
    @Test
    public void testCreateArchiveInputStream9() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        FilterInputStream filterInputStream = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        DataInputStream in1 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        FilterInputStream in2 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        Object in3 = createInstance("sun.security.provider.FileInputStreamPool$UnclosableInputStream");
        DataInputStream in4 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        DataInputStream in5 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        FilterInputStream in6 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        Object in7 = createInstance("java.util.jar.Manifest$FastInputStream");
        FilterInputStream in8 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in9 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in10 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in11 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in12 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in13 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in14 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in15 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in16 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        ByteArrayInputStream in17 = ((ByteArrayInputStream) createInstance("java.io.ByteArrayInputStream"));
        setField(in16, "java.io.FilterInputStream", "in", in17);
        setField(in15, "java.io.FilterInputStream", "in", in16);
        setField(in14, "java.io.FilterInputStream", "in", in15);
        setField(in13, "java.io.FilterInputStream", "in", in14);
        setField(in12, "java.io.FilterInputStream", "in", in13);
        setField(in11, "java.io.FilterInputStream", "in", in12);
        setField(in10, "java.io.FilterInputStream", "in", in11);
        setField(in9, "java.io.FilterInputStream", "in", in10);
        setField(in8, "java.io.FilterInputStream", "in", in9);
        setField(in7, "java.io.FilterInputStream", "in", in8);
        setField(in6, "java.io.FilterInputStream", "in", in7);
        setField(in5, "java.io.FilterInputStream", "in", in6);
        setField(in4, "java.io.FilterInputStream", "in", in5);
        setField(in3, "java.io.FilterInputStream", "in", in4);
        setField(in2, "java.io.FilterInputStream", "in", in3);
        setField(in1, "java.io.FilterInputStream", "in", in2);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(filterInputStream, "java.io.FilterInputStream", "in", in);
        
        /* This test fails because method [org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream] produces [java.lang.NullPointerException]
            java.base/java.util.jar.Manifest$FastInputStream.read(Manifest.java:436)
            java.base/java.io.FilterInputStream.read(FilterInputStream.java:132)
            java.base/java.io.DataInputStream.read(DataInputStream.java:151)
            java.base/java.io.DataInputStream.read(DataInputStream.java:151)
            java.base/java.io.FilterInputStream.read(FilterInputStream.java:132)
            java.base/java.io.FilterInputStream.read(FilterInputStream.java:132)
            java.base/java.io.DataInputStream.read(DataInputStream.java:151)
            java.base/java.io.FilterInputStream.read(FilterInputStream.java:132)
            java.base/java.io.FilterInputStream.read(FilterInputStream.java:132)
            java.base/java.io.FilterInputStream.read(FilterInputStream.java:106)
            org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream(ArchiveStreamFactory.java:210) */
        archiveStreamFactory.createArchiveInputStream(filterInputStream);
    }
    ///endregion
    
    ///region Errors report for createArchiveInputStream
    
    public void testCreateArchiveInputStream_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 101 occurrences of:
        // Concrete execution failed
        
        // 3 occurrences of:
        // Default concrete execution failed
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields970816134510600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields970816134510600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass970816134515800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields970816134510600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass970816134515800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}


package org.apache.commons.compress.compressors;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import java.util.zip.DeflaterOutputStream;
import java.io.ObjectOutputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveInputStream;
import java.util.jar.JarInputStream;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;

public final class org_apache_commons_compress_compressors_CompressorStreamFactoryTest {
    ///region Test suites for executable org.apache.commons.compress.compressors.CompressorStreamFactory.setDecompressConcatenated
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDecompressConcatenated(boolean)
    
    /**
    @utbot.classUnderTest {@link CompressorStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.CompressorStreamFactory#setDecompressConcatenated(boolean)}
 * @utbot.executesCondition {@code (this.decompressUntilEOF != null): False}
 *  */
    @Test
    public void testSetDecompressConcatenated_ThisDecompressUntilEOFEqualsNull() throws Exception  {
        CompressorStreamFactory compressorStreamFactory = ((CompressorStreamFactory) createInstance("org.apache.commons.compress.compressors.CompressorStreamFactory"));
        
        compressorStreamFactory.setDecompressConcatenated(false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDecompressConcatenated(boolean)
    
    /**
    @utbot.classUnderTest {@link CompressorStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.CompressorStreamFactory#setDecompressConcatenated(boolean)}
 * @utbot.executesCondition {@code (this.decompressUntilEOF != null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: this.decompressUntilEOF != null
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSetDecompressConcatenated_ThrowIllegalStateException() throws Exception  {
        CompressorStreamFactory compressorStreamFactory = ((CompressorStreamFactory) createInstance("org.apache.commons.compress.compressors.CompressorStreamFactory"));
        Boolean decompressUntilEOF = false;
        setField(compressorStreamFactory, "org.apache.commons.compress.compressors.CompressorStreamFactory", "decompressUntilEOF", decompressUntilEOF);
        
        compressorStreamFactory.setDecompressConcatenated(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorOutputStream
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createCompressorOutputStream(java.lang.String, java.io.OutputStream)
    
    /**
    @utbot.classUnderTest {@link CompressorStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.CompressorStreamFactory#createCompressorOutputStream(java.lang.String,java.io.OutputStream)}
 * @utbot.executesCondition {@code (name == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: name == null || out == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorOutputStream_ThrowIllegalArgumentException() throws CompressorException  {
        CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
        
        compressorStreamFactory.createCompressorOutputStream(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CompressorStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.CompressorStreamFactory#createCompressorOutputStream(java.lang.String,java.io.OutputStream)}
 * @utbot.executesCondition {@code (name == null): False}
 * @utbot.executesCondition {@code (out == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: name == null || out == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorOutputStream_ThrowIllegalArgumentException_1() throws CompressorException  {
        CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
        String string = "";
        
        compressorStreamFactory.createCompressorOutputStream(string, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method createCompressorOutputStream(java.lang.String, java.io.OutputStream)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.compressors.CompressorStreamFactory}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.CompressorStreamFactory#createCompressorOutputStream(java.lang.String,java.io.OutputStream)}
     */
    @Test
    public void testCreateCompressorOutputStreamWithNonEmptyString() throws Exception  {
        CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory(false);
        compressorStreamFactory.setDecompressConcatenated(false);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        
        DeflateCompressorOutputStream actual = ((DeflateCompressorOutputStream) compressorStreamFactory.createCompressorOutputStream("deflate", byteArrayOutputStream));
        
        DeflateCompressorOutputStream expected = ((DeflateCompressorOutputStream) createInstance("org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream"));
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        setField(expected, "org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream", "out", out);
        
        DeflaterOutputStream expectedOut = ((DeflaterOutputStream) getFieldValue(expected, "org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream", "out"));
        DeflaterOutputStream actualOut = ((DeflaterOutputStream) getFieldValue(actual, "org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream", "out"));
        
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method createCompressorOutputStream(java.lang.String, java.io.OutputStream)
    
    @Test(expected = CompressorException.class)
    public void testCreateCompressorOutputStream1() throws Exception  {
        CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
        String string = "bziP\u0000";
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        
        compressorStreamFactory.createCompressorOutputStream(string, objectOutputStream);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createCompressorOutputStream(java.lang.String, java.io.OutputStream)
    
    @Test
    public void testCreateCompressorOutputStream2() throws Exception  {
        CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
        String string = "XZ";
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorOutputStream] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.tukaani.xz.XZOutputStream.encodeStreamHeader(Unknown Source)
            org.tukaani.xz.XZOutputStream.<init>(Unknown Source)
            org.tukaani.xz.XZOutputStream.<init>(Unknown Source)
            org.tukaani.xz.XZOutputStream.<init>(Unknown Source)
            org.apache.commons.compress.compressors.xz.XZCompressorOutputStream.<init>(XZCompressorOutputStream.java:41)
            org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorOutputStream(CompressorStreamFactory.java:352) */
        compressorStreamFactory.createCompressorOutputStream(string, objectOutputStream);
    }
    
    @Test
    public void testCreateCompressorOutputStream3() throws Exception  {
        CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
        String string = "Xz";
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorOutputStream] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.tukaani.xz.XZOutputStream.encodeStreamHeader(Unknown Source)
            org.tukaani.xz.XZOutputStream.<init>(Unknown Source)
            org.tukaani.xz.XZOutputStream.<init>(Unknown Source)
            org.tukaani.xz.XZOutputStream.<init>(Unknown Source)
            org.apache.commons.compress.compressors.xz.XZCompressorOutputStream.<init>(XZCompressorOutputStream.java:41)
            org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorOutputStream(CompressorStreamFactory.java:352) */
        compressorStreamFactory.createCompressorOutputStream(string, objectOutputStream);
    }
    
    @Test
    public void testCreateCompressorOutputStream4() throws Exception  {
        CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
        String string = "BZIp2";
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorOutputStream] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:688)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsW(BZip2CompressorOutputStream.java:691)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsPutUByte(BZip2CompressorOutputStream.java:701)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.init(BZip2CompressorOutputStream.java:521)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.<init>(BZip2CompressorOutputStream.java:390)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.<init>(BZip2CompressorOutputStream.java:356)
            org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorOutputStream(CompressorStreamFactory.java:348) */
        compressorStreamFactory.createCompressorOutputStream(string, objectOutputStream);
    }
    ///endregion
    
    ///region Errors report for createCompressorOutputStream
    
    public void testCreateCompressorOutputStream_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createCompressorInputStream(java.lang.String, java.io.InputStream)
    
    /**
    @utbot.classUnderTest {@link CompressorStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.CompressorStreamFactory#createCompressorInputStream(java.lang.String,java.io.InputStream)}
 * @utbot.executesCondition {@code (name == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: name == null || in == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorInputStream_ThrowIllegalArgumentException() throws CompressorException  {
        CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
        
        compressorStreamFactory.createCompressorInputStream(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CompressorStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.CompressorStreamFactory#createCompressorInputStream(java.lang.String,java.io.InputStream)}
 * @utbot.executesCondition {@code (name == null): False}
 * @utbot.executesCondition {@code (in == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: name == null || in == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorInputStream_ThrowIllegalArgumentException_1() throws CompressorException  {
        CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
        String string = "";
        
        compressorStreamFactory.createCompressorInputStream(string, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method createCompressorInputStream(java.lang.String, java.io.InputStream)
    
    @Test(expected = CompressorException.class)
    public void testCreateCompressorInputStream1() throws CompressorException  {
        CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
        String string = "bZip ";
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(null);
        
        compressorStreamFactory.createCompressorInputStream(string, arArchiveInputStream);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createCompressorInputStream(java.lang.String, java.io.InputStream)
    
    @Test
    public void testCreateCompressorInputStream2() throws CompressorException  {
        CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
        String string = "xZ";
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(null);
        
        /* This test fails because method [org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read(ArArchiveInputStream.java:254)
            java.base/java.io.DataInputStream.readFully(DataInputStream.java:201)
            java.base/java.io.DataInputStream.readFully(DataInputStream.java:172)
            org.tukaani.xz.SingleXZInputStream.initialize(Unknown Source)
            org.tukaani.xz.SingleXZInputStream.<init>(Unknown Source)
            org.apache.commons.compress.compressors.xz.XZCompressorInputStream.<init>(XZCompressorInputStream.java:98)
            org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(CompressorStreamFactory.java:288) */
        compressorStreamFactory.createCompressorInputStream(string, arArchiveInputStream);
    }
    
    @Test
    public void testCreateCompressorInputStream3() throws CompressorException  {
        CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
        compressorStreamFactory.setDecompressConcatenated(true);
        String string = "XZ";
        ArArchiveInputStream arArchiveInputStream = new ArArchiveInputStream(null);
        
        /* This test fails because method [org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read(ArArchiveInputStream.java:254)
            java.base/java.io.DataInputStream.readFully(DataInputStream.java:201)
            java.base/java.io.DataInputStream.readFully(DataInputStream.java:172)
            org.tukaani.xz.SingleXZInputStream.initialize(Unknown Source)
            org.tukaani.xz.SingleXZInputStream.<init>(Unknown Source)
            org.tukaani.xz.XZInputStream.<init>(Unknown Source)
            org.tukaani.xz.XZInputStream.<init>(Unknown Source)
            org.apache.commons.compress.compressors.xz.XZCompressorInputStream.<init>(XZCompressorInputStream.java:96)
            org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(CompressorStreamFactory.java:288) */
        compressorStreamFactory.createCompressorInputStream(string, arArchiveInputStream);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createCompressorInputStream(java.io.InputStream)
    
    /**
    @utbot.classUnderTest {@link CompressorStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.CompressorStreamFactory#createCompressorInputStream(java.io.InputStream)}
 * @utbot.executesCondition {@code (in == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: in == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorInputStream_ThrowIllegalArgumentException1() throws CompressorException  {
        CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
        
        compressorStreamFactory.createCompressorInputStream(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createCompressorInputStream(java.io.InputStream)
    
    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorInputStream4() throws Exception  {
        CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        DataInputStream dataInputStream = new DataInputStream(jarInputStream);
        DataInputStream dataInputStream1 = new DataInputStream(dataInputStream);
        DataInputStream dataInputStream2 = new DataInputStream(dataInputStream1);
        DataInputStream dataInputStream3 = new DataInputStream(dataInputStream2);
        DataInputStream dataInputStream4 = new DataInputStream(dataInputStream3);
        DataInputStream dataInputStream5 = new DataInputStream(dataInputStream4);
        DataInputStream dataInputStream6 = new DataInputStream(dataInputStream5);
        DataInputStream dataInputStream7 = new DataInputStream(dataInputStream6);
        DataInputStream dataInputStream8 = new DataInputStream(dataInputStream7);
        DataInputStream dataInputStream9 = new DataInputStream(dataInputStream8);
        DataInputStream dataInputStream10 = new DataInputStream(dataInputStream9);
        DataInputStream dataInputStream11 = new DataInputStream(dataInputStream10);
        DataInputStream dataInputStream12 = new DataInputStream(dataInputStream11);
        DataInputStream dataInputStream13 = new DataInputStream(dataInputStream12);
        DataInputStream dataInputStream14 = new DataInputStream(dataInputStream13);
        DataInputStream dataInputStream15 = new DataInputStream(dataInputStream14);
        DataInputStream dataInputStream16 = new DataInputStream(dataInputStream15);
        DataInputStream dataInputStream17 = new DataInputStream(dataInputStream16);
        DataInputStream dataInputStream18 = new DataInputStream(dataInputStream17);
        
        compressorStreamFactory.createCompressorInputStream(dataInputStream18);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method createCompressorInputStream(java.io.InputStream)
    
    @Test(expected = CompressorException.class)
    public void testCreateCompressorInputStream5() throws Exception  {
        CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
        ByteArrayInputStream byteArrayInputStream = ((ByteArrayInputStream) createInstance("java.io.ByteArrayInputStream"));
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        DataInputStream dataInputStream1 = new DataInputStream(dataInputStream);
        DataInputStream dataInputStream2 = new DataInputStream(dataInputStream1);
        DataInputStream dataInputStream3 = new DataInputStream(dataInputStream2);
        DataInputStream dataInputStream4 = new DataInputStream(dataInputStream3);
        DataInputStream dataInputStream5 = new DataInputStream(dataInputStream4);
        DataInputStream dataInputStream6 = new DataInputStream(dataInputStream5);
        DataInputStream dataInputStream7 = new DataInputStream(dataInputStream6);
        DataInputStream dataInputStream8 = new DataInputStream(dataInputStream7);
        DataInputStream dataInputStream9 = new DataInputStream(dataInputStream8);
        DataInputStream dataInputStream10 = new DataInputStream(dataInputStream9);
        
        compressorStreamFactory.createCompressorInputStream(dataInputStream10);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createCompressorInputStream(java.io.InputStream)
    
    @Test(expected = StackOverflowError.class)
    public void testCreateCompressorInputStream6() throws Exception  {
        CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
        DataInputStream dataInputStream = ((DataInputStream) createInstance("java.io.DataInputStream"));
        setField(dataInputStream, "java.io.FilterInputStream", "in", dataInputStream);
        DataInputStream dataInputStream1 = new DataInputStream(dataInputStream);
        DataInputStream dataInputStream2 = new DataInputStream(dataInputStream1);
        
        compressorStreamFactory.createCompressorInputStream(dataInputStream2);
    }
    ///endregion
    
    ///region Errors report for createCompressorInputStream
    
    public void testCreateCompressorInputStream_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.compressors.CompressorStreamFactory.getDecompressConcatenated
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDecompressConcatenated()
    
    /**
    @utbot.classUnderTest {@link CompressorStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.compressors.CompressorStreamFactory#getDecompressConcatenated()}
 * @utbot.returnsFrom {@code return decompressConcatenated;}
 *  */
    @Test
    public void testGetDecompressConcatenated_ReturnDecompressConcatenated() {
        CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
        compressorStreamFactory.setDecompressConcatenated(false);
        
        boolean actual = compressorStreamFactory.getDecompressConcatenated();
        
        assertFalse(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields974963781192600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields974963781192600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass974963781199600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields974963781192600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass974963781199600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields974963781669000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields974963781669000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass974963781673100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields974963781669000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass974963781673100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


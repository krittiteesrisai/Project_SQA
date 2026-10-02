package org.apache.commons.compress.archivers;

import org.junit.Test;
import java.io.ObjectOutputStream;
import org.junit.Ignore;
import java.util.zip.InflaterInputStream;
import java.util.jar.JarInputStream;
import java.util.zip.CheckedInputStream;
import java.util.jar.JarEntry;
import java.security.CodeSigner;
import sun.security.util.ManifestEntryVerifier;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;

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
    public void testCreateArchiveOutputStream1() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        String string = "[\u0000\u0000";
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        
        archiveStreamFactory.createArchiveOutputStream(string, objectOutputStream);
    }
    ///endregion
    
    ///region OTHER: SECURITY for method createArchiveOutputStream(java.lang.String, java.io.OutputStream)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testCreateArchiveOutputStream2() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
        String string = "taR";
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveOutputStream] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "file.encoding" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:916)
            org.apache.commons.compress.archivers.zip.ZipEncodingHelper.isUTF8(ZipEncodingHelper.java:246)
            org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(ZipEncodingHelper.java:213)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.<init>(TarArchiveOutputStream.java:155)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.<init>(TarArchiveOutputStream.java:141)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.<init>(TarArchiveOutputStream.java:100)
            org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveOutputStream(ArchiveStreamFactory.java:293) */
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
    
    /**
    @utbot.classUnderTest {@link ArchiveStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ArchiveStreamFactory#createArchiveInputStream(java.lang.String,java.io.InputStream)}
 * @utbot.executesCondition {@code (archiverName == null): False}
 * @utbot.executesCondition {@code (in == null): False}
 * @utbot.executesCondition {@code (entryEncoding != null): True}
 * @utbot.invokes {@link java.lang.String#equalsIgnoreCase(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#equalsIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testCreateArchiveInputStream_ThrowIndexOutOfBoundsException() throws Exception  {
        String string = "";
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory(string);
        archiveStreamFactory.setEntryEncoding(string);
        String string1 = "Arj";
        InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        byte[] singleByteBuf = {};
        setField(inflaterInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        
        archiveStreamFactory.createArchiveInputStream(string1, inflaterInputStream);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method createArchiveInputStream(java.lang.String, java.io.InputStream)
    
    /**
    @utbot.classUnderTest {@link ArchiveStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ArchiveStreamFactory#createArchiveInputStream(java.lang.String,java.io.InputStream)}
 * @utbot.executesCondition {@code (entryEncoding != null): True}
 * @utbot.throwsException {@link org.apache.commons.compress.archivers.ArchiveException} in: return new ArjArchiveInputStream(in, entryEncoding);
 *  */
    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStream_ThrowArchiveException() throws Exception  {
        String string = "";
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory(string);
        archiveStreamFactory.setEntryEncoding(string);
        String string1 = "Arj";
        InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(inflaterInputStream, "java.util.zip.InflaterInputStream", "closed", true);
        
        archiveStreamFactory.createArchiveInputStream(string1, inflaterInputStream);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ArchiveStreamFactory#createArchiveInputStream(java.lang.String,java.io.InputStream)}
 * @utbot.executesCondition {@code (entryEncoding != null): False}
 * @utbot.throwsException {@link org.apache.commons.compress.archivers.ArchiveException} 
 *  */
    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStream_ThrowArchiveException_1() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory(null);
        archiveStreamFactory.setEntryEncoding(null);
        String string = "Arj";
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "closed", true);
        
        archiveStreamFactory.createArchiveInputStream(string, jarInputStream);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ArchiveStreamFactory#createArchiveInputStream(java.lang.String,java.io.InputStream)}
 * @utbot.executesCondition {@code (entryEncoding != null): True}
 * @utbot.throwsException {@link org.apache.commons.compress.archivers.ArchiveException} in: return new ArjArchiveInputStream(in, entryEncoding);
 *  */
    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStream_ThrowArchiveException_2() throws Exception  {
        String string = "\u0000\u0000\u0000";
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory(string);
        archiveStreamFactory.setEntryEncoding(string);
        String string1 = "ArJ";
        InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(inflaterInputStream, "java.util.zip.InflaterInputStream", "closed", true);
        CheckedInputStream checkedInputStream = new CheckedInputStream(inflaterInputStream, null);
        
        archiveStreamFactory.createArchiveInputStream(string1, checkedInputStream);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ArchiveStreamFactory#createArchiveInputStream(java.lang.String,java.io.InputStream)}
 * @utbot.executesCondition {@code (entryEncoding != null): False}
 * @utbot.throwsException {@link org.apache.commons.compress.archivers.ArchiveException} 
 *  */
    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStream_ThrowArchiveException_3() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory(null);
        archiveStreamFactory.setEntryEncoding(null);
        String string = "Arj";
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
        
        archiveStreamFactory.createArchiveInputStream(string, jarInputStream);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ArchiveStreamFactory#createArchiveInputStream(java.lang.String,java.io.InputStream)}
 * @utbot.executesCondition {@code (entryEncoding != null): False}
 * @utbot.throwsException {@link org.apache.commons.compress.archivers.ArchiveException} 
 *  */
    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStream_ThrowArchiveException_4() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory(null);
        archiveStreamFactory.setEntryEncoding(null);
        String string = "Arj";
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
        
        archiveStreamFactory.createArchiveInputStream(string, jarInputStream);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ArchiveStreamFactory#createArchiveInputStream(java.lang.String,java.io.InputStream)}
 * @utbot.executesCondition {@code (entryEncoding != null): False}
 * @utbot.throwsException {@link org.apache.commons.compress.archivers.ArchiveException} 
 *  */
    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStream_ThrowArchiveException_5() throws Exception  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory(null);
        archiveStreamFactory.setEntryEncoding(null);
        String string = "Arj";
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarArchiveEntry entry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
        setField(jarInputStream, "java.util.zip.ZipInputStream", "remaining", 0L);
        byte[] singleByteBuf = {(byte) 0};
        setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        
        archiveStreamFactory.createArchiveInputStream(string, jarInputStream);
    }
    ///endregion
    
    ///region Errors report for createArchiveInputStream
    
    public void testCreateArchiveInputStream_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 10 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
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
    
    ///region FUZZER: CHECKED EXCEPTIONS for method createArchiveInputStream(java.io.InputStream)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.ArchiveStreamFactory}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ArchiveStreamFactory#createArchiveInputStream(java.io.InputStream)}
     */
    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStreamThrowsAE() throws ArchiveException  {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory("No Archiver found for the stream signature");
        archiveStreamFactory.setEntryEncoding("C\n\t\r");
        byte[] byteArray = {(byte) 0, java.lang.Byte.MIN_VALUE, java.lang.Byte.MAX_VALUE, java.lang.Byte.MAX_VALUE, (byte) 1};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        
        archiveStreamFactory.createArchiveInputStream(byteArrayInputStream);
    }
    ///endregion
    
    ///region Errors report for createArchiveInputStream
    
    public void testCreateArchiveInputStream_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.ArchiveStreamFactory.getEntryEncoding
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEntryEncoding()
    
    /**
    @utbot.classUnderTest {@link ArchiveStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ArchiveStreamFactory#getEntryEncoding()}
 * @utbot.returnsFrom {@code return entryEncoding;}
 *  */
    @Test
    public void testGetEntryEncoding_ReturnEntryEncoding() {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory(null);
        archiveStreamFactory.setEntryEncoding(null);
        
        String actual = archiveStreamFactory.getEntryEncoding();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.ArchiveStreamFactory.setEntryEncoding
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setEntryEncoding(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ArchiveStreamFactory}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ArchiveStreamFactory#setEntryEncoding(java.lang.String)}
 * @utbot.executesCondition {@code (encoding != null): True}
 *  */
    @Test
    public void testSetEntryEncoding_EncodingNotEqualsNull() {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory(null);
        
        archiveStreamFactory.setEntryEncoding(null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setEntryEncoding(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.ArchiveStreamFactory}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.ArchiveStreamFactory#setEntryEncoding(java.lang.String)}
     */
    @Test(expected = IllegalStateException.class)
    public void testSetEntryEncodingThrowsISEWithNonEmptyString() {
        ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory("abc");
        archiveStreamFactory.setEntryEncoding("10");
        
        archiveStreamFactory.setEntryEncoding("10");
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
        
                java.lang.reflect.Method methodForGetDeclaredFields973299898533200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields973299898533200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass973299898539600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields973299898533200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass973299898539600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


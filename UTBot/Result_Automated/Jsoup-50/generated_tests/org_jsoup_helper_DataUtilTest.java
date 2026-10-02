package org.jsoup.helper;

import org.junit.Test;
import java.io.File;
import java.io.IOException;
import org.mockito.MockedConstruction.Context;
import org.mockito.MockedConstruction;
import java.util.Random;
import org.junit.Ignore;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mockConstruction;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_jsoup_helper_DataUtilTest {
    ///region Test suites for executable org.jsoup.helper.DataUtil.load
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method load(java.io.File, java.lang.String, java.lang.String)
    
    @Test(expected = NullPointerException.class)
    public void testLoad1() throws IOException  {
        DataUtil.load(((File) null), ((String) null), ((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.DataUtil.readToByteBuffer
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readToByteBuffer(java.io.InputStream, int)
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#readToByteBuffer(java.io.InputStream,int)}
 * @utbot.executesCondition {@code (Validate.isTrue(maxSize >= 0, "maxSize must be 0 (unlimited) or larger");): False}
 * @utbot.invokes {@link org.jsoup.helper.Validate#isTrue(boolean,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.isTrue(maxSize >= 0, "maxSize must be 0 (unlimited) or larger");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBuffer_ThrowIllegalArgumentException() throws IOException  {
        DataUtil.readToByteBuffer(null, -1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.DataUtil.parseByteData
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseByteData(java.nio.ByteBuffer, java.lang.String, java.lang.String, org.jsoup.parser.Parser)
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#parseByteData(java.nio.ByteBuffer,java.lang.String,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.executesCondition {@code (charsetName == null): False}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(charsetName, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseByteData_ThrowIllegalArgumentException() {
        String string = "";
        
        DataUtil.parseByteData(null, string, null, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method parseByteData(java.nio.ByteBuffer, java.lang.String, java.lang.String, org.jsoup.parser.Parser)
    
    @Test
    public void testParseByteDataByFuzzer() {
        /* This test fails because method [org.jsoup.helper.DataUtil.parseByteData] produces [java.nio.charset.UnsupportedCharsetException: UTF-8_]
            java.base/java.nio.charset.Charset.forName(Charset.java:528)
            org.jsoup.helper.DataUtil.parseByteData(DataUtil.java:124) */
        DataUtil.parseByteData(null, "UTF-8_", "10", null);
    }
    ///endregion
    
    ///region Errors report for parseByteData
    
    public void testParseByteData_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.DataUtil.mimeBoundary
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method mimeBoundary()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.helper.DataUtil}
     * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#mimeBoundary()}
     */
    @Test
    public void testMimeBoundary() {
        MockedConstruction mockedConstruction = null;
        try {
            mockedConstruction = mockConstruction(Random.class, (Random randomMock, Context context) -> (when(randomMock.nextInt(anyInt()))).thenReturn(6, 41, 61, 38, 49, 33, 9, 23, 5, 61, 53, 51, 40, 2, 37, 55, 50, 52, 16, 34, 46, 42, 28, 0, 8, 31, 12, 56, 36, 23, 39, 27));
            
            String actual = DataUtil.mimeBoundary();
            
            String expected = "5DXALv8l4XPNC1zRMOewIEq-7taSylBp";
            
            assertEquals(expected, actual);
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region Errors report for mimeBoundary
    
    public void testMimeBoundary_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.DataUtil.emptyByteBuffer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method emptyByteBuffer()
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#emptyByteBuffer()}
 * @utbot.invokes {@link java.nio.ByteBuffer#allocate(int)}
 * @utbot.returnsFrom {@code return ByteBuffer.allocate(0);}
 *  */
    @Test
    public void testEmptyByteBuffer_ByteBufferAllocate() throws Exception  {
        Object actual = DataUtil.emptyByteBuffer();
        
        Object expected = createInstance("java.nio.HeapByteBuffer");
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.DataUtil.readFileToByteBuffer
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readFileToByteBuffer(java.io.File)
    
    @Test(expected = NullPointerException.class)
    public void testReadFileToByteBuffer1() throws IOException  {
        DataUtil.readFileToByteBuffer(null);
    }
    ///endregion
    
    ///region OTHER: SECURITY for method readFileToByteBuffer(java.io.File)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReadFileToByteBuffer2() throws Exception  {
        File file = ((File) createInstance("java.io.File"));
        String path = "";
        setField(file, "java.io.File", "path", path);
        
        /* This test fails because method [org.jsoup.helper.DataUtil.readFileToByteBuffer] produces [java.security.AccessControlException: access denied ("java.io.FilePermission" "" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.RandomAccessFile.<init>(RandomAccessFile.java:245)
            java.base/java.io.RandomAccessFile.<init>(RandomAccessFile.java:213)
            org.jsoup.helper.DataUtil.readFileToByteBuffer(DataUtil.java:177) */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.DataUtil.getCharsetFromContentType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCharsetFromContentType(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#getCharsetFromContentType(java.lang.String)}
 * @utbot.executesCondition {@code (contentType == null): True}
 *  */
    @Test
    public void testGetCharsetFromContentType_ContentTypeEqualsNull() {
        String actual = DataUtil.getCharsetFromContentType(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getCharsetFromContentType(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.helper.DataUtil}
     * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#getCharsetFromContentType(java.lang.String)}
     */
    @Test
    public void testGetCharsetFromContentTypeWithNonEmptyString() {
        String actual = DataUtil.getCharsetFromContentType("XZb");
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getCharsetFromContentType
    
    public void testGetCharsetFromContentType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1000889536815000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1000889536815000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1000889536821600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1000889536815000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1000889536821600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


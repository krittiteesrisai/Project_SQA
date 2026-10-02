package org.jsoup.helper;

import org.junit.Test;
import java.io.File;
import java.io.IOException;
import org.mockito.MockedConstruction.Context;
import org.mockito.MockedConstruction;
import java.util.Random;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.junit.Ignore;
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
            mockedConstruction = mockConstruction(Random.class, (Random randomMock, Context context) -> (when(randomMock.nextInt(anyInt()))).thenReturn(27, 26, 18, 30, 29, 39, 34, 30, 14, 57, 28, 42, 23, 40, 46, 19, 62, 23, 55, 15, 20, 62, 21, 40, 27, 12, 3, 34, 29, 56, 29, 54));
            
            String actual = DataUtil.mimeBoundary();
            
            String expected = "pogsrBwscTqElCIhYlRdiYjCpa2wrSrQ";
            
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
    
    ///region Test suites for executable org.jsoup.helper.DataUtil.validateCharset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method validateCharset(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#validateCharset(java.lang.String)}
 * @utbot.executesCondition {@code (cs == null): True}
 *  */
    @Test
    public void testValidateCharset_CsEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class stringType = Class.forName("java.lang.String");
        Method validateCharsetMethod = dataUtilClazz.getDeclaredMethod("validateCharset", stringType);
        validateCharsetMethod.setAccessible(true);
        java.lang.Object[] validateCharsetMethodArguments = new java.lang.Object[1];
        validateCharsetMethodArguments[0] = ((Object) null);
        String actual = ((String) validateCharsetMethod.invoke(null, validateCharsetMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#validateCharset(java.lang.String)}
 * @utbot.executesCondition {@code (cs == null): False}
 * @utbot.executesCondition {@code (cs.length() == 0): True}
 * @utbot.invokes {@link java.lang.String#length()}
 *  */
    @Test
    public void testValidateCharset_CsLengthEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class stringType = Class.forName("java.lang.String");
        Method validateCharsetMethod = dataUtilClazz.getDeclaredMethod("validateCharset", stringType);
        validateCharsetMethod.setAccessible(true);
        java.lang.Object[] validateCharsetMethodArguments = new java.lang.Object[1];
        validateCharsetMethodArguments[0] = string;
        String actual = ((String) validateCharsetMethod.invoke(null, validateCharsetMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method validateCharset(java.lang.String)
    
    @Test
    public void testValidateCharset1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\u0001\u0001\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001\u0001";
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class stringType = Class.forName("java.lang.String");
        Method validateCharsetMethod = dataUtilClazz.getDeclaredMethod("validateCharset", stringType);
        validateCharsetMethod.setAccessible(true);
        java.lang.Object[] validateCharsetMethodArguments = new java.lang.Object[1];
        validateCharsetMethodArguments[0] = string;
        String actual = ((String) validateCharsetMethod.invoke(null, validateCharsetMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.DataUtil.detectCharsetFromBom
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method detectCharsetFromBom(java.nio.ByteBuffer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer,java.lang.String)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): False}
 * @utbot.executesCondition {@code (bom[0] == 0x00): True}
 * @utbot.executesCondition {@code (bom[1] == 0x00): True}
 * @utbot.executesCondition {@code (bom[2] == (byte) 0xFE): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFE): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xEF): False}
 * @utbot.returnsFrom {@code return charsetName;}
 *  */
    @Test
    public void testDetectCharsetFromBom_2OfBomNotEquals0xFE() throws Exception  {
        Object heapByteBufferR = createInstance("java.nio.HeapByteBufferR");
        setField(heapByteBufferR, "java.nio.Buffer", "position", -1879441406);
        setField(heapByteBufferR, "java.nio.Buffer", "limit", -1879441406);
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferRType, stringType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[2];
        detectCharsetFromBomMethodArguments[0] = heapByteBufferR;
        detectCharsetFromBomMethodArguments[1] = ((Object) null);
        String actual = ((String) detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments));
        
        assertNull(actual);
        
        int finalHeapByteBufferRMark = ((Integer) getFieldValue(heapByteBufferR, "java.nio.Buffer", "mark"));
        
        assertEquals(-1879441406, finalHeapByteBufferRMark);
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer,java.lang.String)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.executesCondition {@code (bom[0] == 0x00): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFE): True}
 * @utbot.executesCondition {@code (bom[1] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xEF): False}
 * @utbot.returnsFrom {@code return charsetName;}
 *  */
    @Test
    public void testDetectCharsetFromBom_1OfBomNotEquals0xFF() throws Exception  {
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = new byte[33];
        hb[0] = (byte) -2;
        setField(heapByteBuffer, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBuffer, "java.nio.ByteBuffer", "offset", 4);
        setField(heapByteBuffer, "java.nio.Buffer", "position", -4);
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType, stringType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[2];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        detectCharsetFromBomMethodArguments[1] = ((Object) null);
        String actual = ((String) detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments));
        
        assertNull(actual);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        int finalHeapByteBufferPosition = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "position"));
        
        assertEquals(-1, finalHeapByteBufferMark);
        
        assertEquals(0, finalHeapByteBufferPosition);
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer,java.lang.String)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.executesCondition {@code (bom[0] == 0x00): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFE): True}
 * @utbot.executesCondition {@code (bom[1] == (byte) 0xFF): True}
 * @utbot.returnsFrom {@code return charsetName;}
 *  */
    @Test
    public void testDetectCharsetFromBom_1OfBomEquals0xFF() throws Exception  {
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = new byte[32];
        hb[0] = (byte) -2;
        hb[1] = (byte) -1;
        setField(heapByteBuffer, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBuffer, "java.nio.ByteBuffer", "offset", 4);
        setField(heapByteBuffer, "java.nio.Buffer", "position", -4);
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType, stringType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[2];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        detectCharsetFromBomMethodArguments[1] = ((Object) null);
        String actual = ((String) detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments));
        
        String expected = "UTF-16";
        
        assertEquals(expected, actual);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        int finalHeapByteBufferPosition = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "position"));
        
        assertEquals(-1, finalHeapByteBufferMark);
        
        assertEquals(0, finalHeapByteBufferPosition);
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer,java.lang.String)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.executesCondition {@code (bom[0] == 0x00): True}
 * @utbot.executesCondition {@code (bom[1] == 0x00): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFE): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xEF): False}
 * @utbot.returnsFrom {@code return charsetName;}
 *  */
    @Test
    public void testDetectCharsetFromBom_1OfBomNotEqualsZero() throws Exception  {
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = new byte[33];
        hb[1] = (byte) 1;
        setField(heapByteBuffer, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBuffer, "java.nio.ByteBuffer", "offset", 4);
        setField(heapByteBuffer, "java.nio.Buffer", "position", -4);
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType, stringType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[2];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        detectCharsetFromBomMethodArguments[1] = ((Object) null);
        String actual = ((String) detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments));
        
        assertNull(actual);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        int finalHeapByteBufferPosition = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "position"));
        
        assertEquals(-1, finalHeapByteBufferMark);
        
        assertEquals(0, finalHeapByteBufferPosition);
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer,java.lang.String)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.executesCondition {@code (bom[0] == 0x00): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): True}
 * @utbot.executesCondition {@code (bom[1] == (byte) 0xFE): True}
 * @utbot.executesCondition {@code (bom[2] == 0x00): True}
 * @utbot.executesCondition {@code (bom[3] == 0x00): True}
 * @utbot.returnsFrom {@code return charsetName;}
 *  */
    @Test
    public void testDetectCharsetFromBom_3OfBomEqualsZero() throws Exception  {
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = new byte[33];
        hb[0] = (byte) -1;
        hb[1] = (byte) -2;
        setField(heapByteBuffer, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBuffer, "java.nio.ByteBuffer", "offset", 4);
        setField(heapByteBuffer, "java.nio.Buffer", "position", -4);
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType, stringType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[2];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        detectCharsetFromBomMethodArguments[1] = ((Object) null);
        String actual = ((String) detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments));
        
        String expected = "UTF-32";
        
        assertEquals(expected, actual);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        int finalHeapByteBufferPosition = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "position"));
        
        assertEquals(-1, finalHeapByteBufferMark);
        
        assertEquals(0, finalHeapByteBufferPosition);
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer,java.lang.String)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.executesCondition {@code (bom[0] == 0x00): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): True}
 * @utbot.executesCondition {@code (bom[1] == (byte) 0xFE): True}
 * @utbot.executesCondition {@code (bom[2] == 0x00): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFE): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): True}
 * @utbot.executesCondition {@code (bom[1] == (byte) 0xFE): True}
 * @utbot.returnsFrom {@code return charsetName;}
 *  */
    @Test
    public void testDetectCharsetFromBom_2OfBomNotEqualsZero() throws Exception  {
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = new byte[33];
        hb[0] = (byte) -1;
        hb[1] = (byte) -2;
        hb[2] = (byte) 1;
        hb[3] = (byte) 1;
        hb[4] = (byte) 1;
        hb[5] = (byte) 1;
        hb[6] = (byte) 1;
        hb[7] = (byte) 1;
        hb[8] = (byte) 1;
        hb[9] = (byte) 1;
        hb[10] = (byte) 1;
        hb[11] = (byte) 1;
        hb[12] = (byte) 1;
        hb[13] = (byte) 1;
        hb[14] = (byte) 1;
        hb[15] = (byte) 1;
        hb[16] = (byte) 1;
        hb[17] = (byte) 1;
        hb[18] = (byte) 1;
        hb[19] = (byte) 1;
        hb[20] = (byte) 1;
        hb[21] = (byte) 1;
        hb[22] = (byte) 1;
        hb[23] = (byte) 1;
        hb[24] = (byte) 1;
        hb[25] = (byte) 1;
        hb[26] = (byte) 1;
        hb[27] = (byte) 1;
        hb[28] = (byte) 1;
        hb[29] = (byte) 1;
        hb[30] = (byte) 1;
        hb[31] = (byte) 1;
        hb[32] = (byte) 1;
        setField(heapByteBuffer, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBuffer, "java.nio.ByteBuffer", "offset", 4);
        setField(heapByteBuffer, "java.nio.Buffer", "position", -4);
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType, stringType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[2];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        detectCharsetFromBomMethodArguments[1] = ((Object) null);
        String actual = ((String) detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments));
        
        String expected = "UTF-16";
        
        assertEquals(expected, actual);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        int finalHeapByteBufferPosition = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "position"));
        
        assertEquals(-1, finalHeapByteBufferMark);
        
        assertEquals(0, finalHeapByteBufferPosition);
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer,java.lang.String)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.executesCondition {@code (bom[0] == 0x00): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): True}
 * @utbot.executesCondition {@code (bom[1] == (byte) 0xFE): True}
 * @utbot.executesCondition {@code (bom[2] == 0x00): True}
 * @utbot.executesCondition {@code (bom[3] == 0x00): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFE): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): True}
 * @utbot.executesCondition {@code (bom[1] == (byte) 0xFE): True}
 * @utbot.returnsFrom {@code return charsetName;}
 *  */
    @Test
    public void testDetectCharsetFromBom_3OfBomNotEqualsZero() throws Exception  {
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = new byte[33];
        hb[0] = (byte) -1;
        hb[1] = (byte) -2;
        hb[3] = (byte) 1;
        hb[4] = (byte) 1;
        hb[5] = (byte) 1;
        hb[6] = (byte) 1;
        hb[7] = (byte) 1;
        hb[8] = (byte) 1;
        hb[9] = (byte) 1;
        hb[10] = (byte) 1;
        hb[11] = (byte) 1;
        hb[12] = (byte) 1;
        hb[13] = (byte) 1;
        hb[14] = (byte) 1;
        hb[15] = (byte) 1;
        hb[16] = (byte) 1;
        hb[17] = (byte) 1;
        hb[18] = (byte) 1;
        hb[19] = (byte) 1;
        hb[20] = (byte) 1;
        hb[21] = (byte) 1;
        hb[22] = (byte) 1;
        hb[23] = (byte) 1;
        hb[24] = (byte) 1;
        hb[25] = (byte) 1;
        hb[26] = (byte) 1;
        hb[27] = (byte) 1;
        hb[28] = (byte) 1;
        hb[29] = (byte) 1;
        hb[30] = (byte) 1;
        hb[31] = (byte) 1;
        hb[32] = (byte) 1;
        setField(heapByteBuffer, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBuffer, "java.nio.ByteBuffer", "offset", 4);
        setField(heapByteBuffer, "java.nio.Buffer", "position", -4);
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType, stringType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[2];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        detectCharsetFromBomMethodArguments[1] = ((Object) null);
        String actual = ((String) detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments));
        
        String expected = "UTF-16";
        
        assertEquals(expected, actual);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        int finalHeapByteBufferPosition = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "position"));
        
        assertEquals(-1, finalHeapByteBufferMark);
        
        assertEquals(0, finalHeapByteBufferPosition);
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer,java.lang.String)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.executesCondition {@code (bom[0] == 0x00): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): True}
 * @utbot.executesCondition {@code (bom[1] == (byte) 0xFE): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFE): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): True}
 * @utbot.executesCondition {@code (bom[1] == (byte) 0xFE): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xEF): False}
 * @utbot.returnsFrom {@code return charsetName;}
 *  */
    @Test
    public void testDetectCharsetFromBom_1OfBomNotEquals0xFE() throws Exception  {
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = new byte[33];
        hb[0] = (byte) -1;
        setField(heapByteBuffer, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBuffer, "java.nio.ByteBuffer", "offset", 4);
        setField(heapByteBuffer, "java.nio.Buffer", "position", -4);
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType, stringType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[2];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        detectCharsetFromBomMethodArguments[1] = ((Object) null);
        String actual = ((String) detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments));
        
        assertNull(actual);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        int finalHeapByteBufferPosition = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "position"));
        
        assertEquals(-1, finalHeapByteBufferMark);
        
        assertEquals(0, finalHeapByteBufferPosition);
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer,java.lang.String)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.executesCondition {@code (bom[0] == 0x00): True}
 * @utbot.executesCondition {@code (bom[1] == 0x00): True}
 * @utbot.executesCondition {@code (bom[2] == (byte) 0xFE): True}
 * @utbot.executesCondition {@code (bom[3] == (byte) 0xFF): True}
 * @utbot.returnsFrom {@code return charsetName;}
 *  */
    @Test
    public void testDetectCharsetFromBom_3OfBomEquals0xFF() throws Exception  {
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = new byte[32];
        hb[2] = (byte) -2;
        hb[3] = (byte) -1;
        setField(heapByteBuffer, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBuffer, "java.nio.ByteBuffer", "offset", 4);
        setField(heapByteBuffer, "java.nio.Buffer", "position", -4);
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType, stringType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[2];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        detectCharsetFromBomMethodArguments[1] = ((Object) null);
        String actual = ((String) detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments));
        
        String expected = "UTF-32";
        
        assertEquals(expected, actual);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        int finalHeapByteBufferPosition = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "position"));
        
        assertEquals(-1, finalHeapByteBufferMark);
        
        assertEquals(0, finalHeapByteBufferPosition);
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer,java.lang.String)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.executesCondition {@code (bom[0] == 0x00): True}
 * @utbot.executesCondition {@code (bom[1] == 0x00): True}
 * @utbot.executesCondition {@code (bom[2] == (byte) 0xFE): True}
 * @utbot.executesCondition {@code (bom[3] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFE): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xEF): False}
 * @utbot.returnsFrom {@code return charsetName;}
 *  */
    @Test
    public void testDetectCharsetFromBom_3OfBomNotEquals0xFF() throws Exception  {
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = new byte[33];
        hb[2] = (byte) -2;
        setField(heapByteBuffer, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBuffer, "java.nio.ByteBuffer", "offset", 4);
        setField(heapByteBuffer, "java.nio.Buffer", "position", -4);
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType, stringType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[2];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        detectCharsetFromBomMethodArguments[1] = ((Object) null);
        String actual = ((String) detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments));
        
        assertNull(actual);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        int finalHeapByteBufferPosition = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "position"));
        
        assertEquals(-1, finalHeapByteBufferMark);
        
        assertEquals(0, finalHeapByteBufferPosition);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method detectCharsetFromBom(java.nio.ByteBuffer, java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (byteData.remaining() >= bom.length): True}
    /// invoke:
    ///     {@link java.nio.ByteBuffer#get(byte[])} once,
    ///     {@link java.nio.ByteBuffer#rewind()} once
    /// execute conditions:
    ///     {@code (bom[0] == 0x00): False},
    ///     {@code (bom[0] == (byte) 0xFF): False},
    ///     {@code (bom[0] == (byte) 0xFE): False},
    ///     {@code (bom[0] == (byte) 0xFF): False},
    ///     {@code (bom[0] == (byte) 0xEF): True}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer,java.lang.String)}
 * @utbot.executesCondition {@code (bom[1] == (byte) 0xBB): True}
 * @utbot.executesCondition {@code (bom[2] == (byte) 0xBF): False}
 * @utbot.returnsFrom {@code return charsetName;}
 *  */
    @Test
    public void testDetectCharsetFromBom_2OfBomNotEquals0xBF() throws Exception  {
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = new byte[33];
        hb[0] = (byte) -17;
        hb[1] = (byte) -69;
        setField(heapByteBuffer, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBuffer, "java.nio.ByteBuffer", "offset", 4);
        setField(heapByteBuffer, "java.nio.Buffer", "position", -4);
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType, stringType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[2];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        detectCharsetFromBomMethodArguments[1] = ((Object) null);
        String actual = ((String) detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments));
        
        assertNull(actual);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        int finalHeapByteBufferPosition = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "position"));
        
        assertEquals(-1, finalHeapByteBufferMark);
        
        assertEquals(0, finalHeapByteBufferPosition);
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer,java.lang.String)}
 * @utbot.executesCondition {@code (bom[1] == (byte) 0xBB): False}
 * @utbot.returnsFrom {@code return charsetName;}
 *  */
    @Test
    public void testDetectCharsetFromBom_1OfBomNotEquals0xBB() throws Exception  {
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = new byte[33];
        hb[0] = (byte) -17;
        setField(heapByteBuffer, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBuffer, "java.nio.ByteBuffer", "offset", 4);
        setField(heapByteBuffer, "java.nio.Buffer", "position", -4);
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType, stringType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[2];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        detectCharsetFromBomMethodArguments[1] = ((Object) null);
        String actual = ((String) detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments));
        
        assertNull(actual);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        int finalHeapByteBufferPosition = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "position"));
        
        assertEquals(-1, finalHeapByteBufferMark);
        
        assertEquals(0, finalHeapByteBufferPosition);
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer,java.lang.String)}
 * @utbot.executesCondition {@code (bom[1] == (byte) 0xBB): True}
 * @utbot.executesCondition {@code (bom[2] == (byte) 0xBF): True}
 * @utbot.invokes {@link java.nio.ByteBuffer#position(int)}
 * @utbot.returnsFrom {@code return charsetName;}
 *  */
    @Test
    public void testDetectCharsetFromBom_2OfBomEquals0xBF() throws Exception  {
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = new byte[33];
        hb[0] = (byte) -17;
        hb[1] = (byte) -69;
        hb[2] = (byte) -65;
        setField(heapByteBuffer, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBuffer, "java.nio.ByteBuffer", "offset", -2);
        setField(heapByteBuffer, "java.nio.Buffer", "position", 2);
        setField(heapByteBuffer, "java.nio.Buffer", "limit", 1073741825);
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType, stringType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[2];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        detectCharsetFromBomMethodArguments[1] = ((Object) null);
        String actual = ((String) detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments));
        
        String expected = "UTF-8";
        
        assertEquals(expected, actual);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        int finalHeapByteBufferPosition = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "position"));
        
        assertEquals(-1, finalHeapByteBufferMark);
        
        assertEquals(3, finalHeapByteBufferPosition);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method detectCharsetFromBom(java.nio.ByteBuffer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer,java.lang.String)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: byteData.get(bom);
 *  */
    @Test
    public void testDetectCharsetFromBom_ThrowIndexOutOfBoundsException() throws Throwable  {
        Object directByteBufferR = createInstance("java.nio.DirectByteBufferR");
        setField(directByteBufferR, "java.nio.Buffer", "position", -1);
        setField(directByteBufferR, "java.nio.Buffer", "limit", 1073741826);
        
        /* This test fails because method [org.jsoup.helper.DataUtil.detectCharsetFromBom] produces [java.lang.IndexOutOfBoundsException]
            java.base/java.nio.Buffer.checkIndex(Buffer.java:743)
            java.base/java.nio.DirectByteBuffer.get(DirectByteBuffer.java:332)
            java.base/java.nio.ByteBuffer.getArray(ByteBuffer.java:941)
            java.base/java.nio.ByteBuffer.get(ByteBuffer.java:800)
            java.base/java.nio.ByteBuffer.get(ByteBuffer.java:826)
            org.jsoup.helper.DataUtil.detectCharsetFromBom(DataUtil.java:245) */
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class directByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", directByteBufferRType, stringType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[2];
        detectCharsetFromBomMethodArguments[0] = directByteBufferR;
        detectCharsetFromBomMethodArguments[1] = ((Object) null);
        try {
            detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer,java.lang.String)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: byteData.get(bom);
 *  */
    @Test
    public void testDetectCharsetFromBom_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) 0};
        setField(heapByteBuffer, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBuffer, "java.nio.ByteBuffer", "offset", 2);
        setField(heapByteBuffer, "java.nio.Buffer", "position", 2147483644);
        setField(heapByteBuffer, "java.nio.Buffer", "limit", -805306372);
        
        /* This test fails because method [org.jsoup.helper.DataUtil.detectCharsetFromBom] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2147483650 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.nio.HeapByteBuffer.get(HeapByteBuffer.java:184)
            java.base/java.nio.ByteBuffer.get(ByteBuffer.java:826)
            org.jsoup.helper.DataUtil.detectCharsetFromBom(DataUtil.java:245) */
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType, stringType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[2];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        detectCharsetFromBomMethodArguments[1] = ((Object) null);
        try {
            detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer,java.lang.String)}
 * @utbot.invokes {@link java.nio.ByteBuffer#mark()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byteData.mark();
 *  */
    @Test
    public void testDetectCharsetFromBom_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.helper.DataUtil.detectCharsetFromBom] produces [java.lang.NullPointerException]
            org.jsoup.helper.DataUtil.detectCharsetFromBom(DataUtil.java:242) */
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class byteBufferType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", byteBufferType, stringType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[2];
        detectCharsetFromBomMethodArguments[0] = ((Object) null);
        detectCharsetFromBomMethodArguments[1] = ((Object) null);
        try {
            detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer,java.lang.String)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byteData.get(bom);
 *  */
    @Test
    public void testDetectCharsetFromBom_ThrowNullPointerException_1() throws Throwable  {
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        setField(heapByteBuffer, "java.nio.Buffer", "position", -3);
        setField(heapByteBuffer, "java.nio.Buffer", "limit", 1073741824);
        
        /* This test fails because method [org.jsoup.helper.DataUtil.detectCharsetFromBom] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.nio.HeapByteBuffer.get(HeapByteBuffer.java:184)
            java.base/java.nio.ByteBuffer.get(ByteBuffer.java:826)
            org.jsoup.helper.DataUtil.detectCharsetFromBom(DataUtil.java:245) */
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType, stringType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[2];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        detectCharsetFromBomMethodArguments[1] = ((Object) null);
        try {
            detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
            org.jsoup.helper.DataUtil.readFileToByteBuffer(DataUtil.java:185) */
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
    
    ///region Test suites for executable org.jsoup.helper.DataUtil.parseByteData
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseByteData(java.nio.ByteBuffer, java.lang.String, java.lang.String, org.jsoup.parser.Parser)
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#parseByteData(java.nio.ByteBuffer,java.lang.String,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testParseByteData_ThrowIndexOutOfBoundsException() throws Throwable  {
        Object directByteBufferR = createInstance("java.nio.DirectByteBufferR");
        setField(directByteBufferR, "java.nio.Buffer", "position", 2147483644);
        setField(directByteBufferR, "java.nio.Buffer", "limit", Integer.MIN_VALUE);
        
        /* This test fails because method [org.jsoup.helper.DataUtil.parseByteData] produces [java.lang.IndexOutOfBoundsException]
            java.base/java.nio.Buffer.checkIndex(Buffer.java:743)
            java.base/java.nio.DirectByteBuffer.get(DirectByteBuffer.java:332)
            java.base/java.nio.ByteBuffer.getArray(ByteBuffer.java:941)
            java.base/java.nio.ByteBuffer.get(ByteBuffer.java:800)
            java.base/java.nio.ByteBuffer.get(ByteBuffer.java:826)
            org.jsoup.helper.DataUtil.detectCharsetFromBom(DataUtil.java:245)
            org.jsoup.helper.DataUtil.parseByteData(DataUtil.java:99) */
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class directByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Class parserType = Class.forName("org.jsoup.parser.Parser");
        Method parseByteDataMethod = dataUtilClazz.getDeclaredMethod("parseByteData", directByteBufferRType, stringType, stringType, parserType);
        parseByteDataMethod.setAccessible(true);
        java.lang.Object[] parseByteDataMethodArguments = new java.lang.Object[4];
        parseByteDataMethodArguments[0] = directByteBufferR;
        parseByteDataMethodArguments[1] = ((Object) null);
        parseByteDataMethodArguments[2] = ((Object) null);
        parseByteDataMethodArguments[3] = ((Object) null);
        try {
            parseByteDataMethod.invoke(null, parseByteDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#parseByteData(java.nio.ByteBuffer,java.lang.String,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testParseByteData_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        Object heapByteBufferR = createInstance("java.nio.HeapByteBufferR");
        byte[] hb = {};
        setField(heapByteBufferR, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBufferR, "java.nio.ByteBuffer", "offset", Integer.MIN_VALUE);
        setField(heapByteBufferR, "java.nio.Buffer", "position", Integer.MAX_VALUE);
        setField(heapByteBufferR, "java.nio.Buffer", "limit", -1073741822);
        
        /* This test fails because method [org.jsoup.helper.DataUtil.parseByteData] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.nio.HeapByteBuffer.get(HeapByteBuffer.java:184)
            java.base/java.nio.ByteBuffer.get(ByteBuffer.java:826)
            org.jsoup.helper.DataUtil.detectCharsetFromBom(DataUtil.java:245)
            org.jsoup.helper.DataUtil.parseByteData(DataUtil.java:99) */
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Class parserType = Class.forName("org.jsoup.parser.Parser");
        Method parseByteDataMethod = dataUtilClazz.getDeclaredMethod("parseByteData", heapByteBufferRType, stringType, stringType, parserType);
        parseByteDataMethod.setAccessible(true);
        java.lang.Object[] parseByteDataMethodArguments = new java.lang.Object[4];
        parseByteDataMethodArguments[0] = heapByteBufferR;
        parseByteDataMethodArguments[1] = ((Object) null);
        parseByteDataMethodArguments[2] = ((Object) null);
        parseByteDataMethodArguments[3] = ((Object) null);
        try {
            parseByteDataMethod.invoke(null, parseByteDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#parseByteData(java.nio.ByteBuffer,java.lang.String,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test
    public void testParseByteData_ThrowIllegalArgumentException() throws Throwable  {
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = new byte[35];
        setField(heapByteBuffer, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBuffer, "java.nio.ByteBuffer", "offset", 5);
        setField(heapByteBuffer, "java.nio.Buffer", "position", -5);
        setField(heapByteBuffer, "java.nio.Buffer", "limit", -1);
        
        /* This test fails because method [org.jsoup.helper.DataUtil.parseByteData] produces [java.lang.IllegalArgumentException: newPosition < 0: (-1 < 0)]
            java.base/java.nio.Buffer.createPositionException(Buffer.java:341)
            java.base/java.nio.Buffer.position(Buffer.java:316)
            java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1516)
            java.base/java.nio.HeapByteBuffer.get(HeapByteBuffer.java:185)
            java.base/java.nio.ByteBuffer.get(ByteBuffer.java:826)
            org.jsoup.helper.DataUtil.detectCharsetFromBom(DataUtil.java:245)
            org.jsoup.helper.DataUtil.parseByteData(DataUtil.java:99) */
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Class parserType = Class.forName("org.jsoup.parser.Parser");
        Method parseByteDataMethod = dataUtilClazz.getDeclaredMethod("parseByteData", heapByteBufferType, stringType, stringType, parserType);
        parseByteDataMethod.setAccessible(true);
        java.lang.Object[] parseByteDataMethodArguments = new java.lang.Object[4];
        parseByteDataMethodArguments[0] = heapByteBuffer;
        parseByteDataMethodArguments[1] = ((Object) null);
        parseByteDataMethodArguments[2] = ((Object) null);
        parseByteDataMethodArguments[3] = ((Object) null);
        try {
            parseByteDataMethod.invoke(null, parseByteDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#parseByteData(java.nio.ByteBuffer,java.lang.String,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: charsetName = detectCharsetFromBom(byteData, charsetName);
 *  */
    @Test
    public void testParseByteData_ThrowNullPointerException() {
        /* This test fails because method [org.jsoup.helper.DataUtil.parseByteData] produces [java.lang.NullPointerException]
            org.jsoup.helper.DataUtil.detectCharsetFromBom(DataUtil.java:242)
            org.jsoup.helper.DataUtil.parseByteData(DataUtil.java:99) */
        DataUtil.parseByteData(null, null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseByteData(java.nio.ByteBuffer, java.lang.String, java.lang.String, org.jsoup.parser.Parser)
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#parseByteData(java.nio.ByteBuffer,java.lang.String,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(charsetName, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseByteData_ThrowIllegalArgumentException_1() throws Throwable  {
        Object heapByteBufferR = createInstance("java.nio.HeapByteBufferR");
        setField(heapByteBufferR, "java.nio.Buffer", "position", -1610612736);
        setField(heapByteBufferR, "java.nio.Buffer", "limit", -1610612736);
        String string = "";
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Class parserType = Class.forName("org.jsoup.parser.Parser");
        Method parseByteDataMethod = dataUtilClazz.getDeclaredMethod("parseByteData", heapByteBufferRType, stringType, stringType, parserType);
        parseByteDataMethod.setAccessible(true);
        java.lang.Object[] parseByteDataMethodArguments = new java.lang.Object[4];
        parseByteDataMethodArguments[0] = heapByteBufferR;
        parseByteDataMethodArguments[1] = string;
        parseByteDataMethodArguments[2] = ((Object) null);
        parseByteDataMethodArguments[3] = ((Object) null);
        try {
            parseByteDataMethod.invoke(null, parseByteDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#parseByteData(java.nio.ByteBuffer,java.lang.String,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(charsetName, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseByteData_ThrowIllegalArgumentException_2() throws Throwable  {
        Object heapByteBufferR = createInstance("java.nio.HeapByteBufferR");
        byte[] hb = new byte[40];
        hb[0] = (byte) -2;
        setField(heapByteBufferR, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBufferR, "java.nio.ByteBuffer", "offset", 4);
        setField(heapByteBufferR, "java.nio.Buffer", "position", -4);
        String string = "";
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Class parserType = Class.forName("org.jsoup.parser.Parser");
        Method parseByteDataMethod = dataUtilClazz.getDeclaredMethod("parseByteData", heapByteBufferRType, stringType, stringType, parserType);
        parseByteDataMethod.setAccessible(true);
        java.lang.Object[] parseByteDataMethodArguments = new java.lang.Object[4];
        parseByteDataMethodArguments[0] = heapByteBufferR;
        parseByteDataMethodArguments[1] = string;
        parseByteDataMethodArguments[2] = ((Object) null);
        parseByteDataMethodArguments[3] = ((Object) null);
        try {
            parseByteDataMethod.invoke(null, parseByteDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#parseByteData(java.nio.ByteBuffer,java.lang.String,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(charsetName, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseByteData_ThrowIllegalArgumentException_3() throws Throwable  {
        Object heapByteBufferR = createInstance("java.nio.HeapByteBufferR");
        byte[] hb = new byte[40];
        hb[0] = (byte) -17;
        hb[1] = (byte) -69;
        setField(heapByteBufferR, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBufferR, "java.nio.ByteBuffer", "offset", 4);
        setField(heapByteBufferR, "java.nio.Buffer", "position", -4);
        String string = "";
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Class parserType = Class.forName("org.jsoup.parser.Parser");
        Method parseByteDataMethod = dataUtilClazz.getDeclaredMethod("parseByteData", heapByteBufferRType, stringType, stringType, parserType);
        parseByteDataMethod.setAccessible(true);
        java.lang.Object[] parseByteDataMethodArguments = new java.lang.Object[4];
        parseByteDataMethodArguments[0] = heapByteBufferR;
        parseByteDataMethodArguments[1] = string;
        parseByteDataMethodArguments[2] = ((Object) null);
        parseByteDataMethodArguments[3] = ((Object) null);
        try {
            parseByteDataMethod.invoke(null, parseByteDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#parseByteData(java.nio.ByteBuffer,java.lang.String,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(charsetName, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseByteData_ThrowIllegalArgumentException_4() throws Throwable  {
        Object heapByteBufferR = createInstance("java.nio.HeapByteBufferR");
        byte[] hb = new byte[40];
        hb[0] = (byte) 1;
        hb[1] = (byte) -1;
        hb[2] = (byte) -1;
        hb[3] = (byte) -1;
        hb[4] = (byte) -1;
        hb[5] = (byte) -1;
        hb[6] = (byte) -1;
        hb[7] = (byte) -1;
        hb[8] = (byte) -1;
        hb[9] = (byte) -1;
        hb[10] = (byte) -1;
        hb[11] = (byte) -1;
        hb[12] = (byte) -1;
        hb[13] = (byte) -1;
        hb[14] = (byte) -1;
        hb[15] = (byte) -1;
        hb[16] = (byte) -1;
        hb[17] = (byte) -1;
        hb[18] = (byte) -1;
        hb[19] = (byte) -1;
        hb[20] = (byte) -1;
        hb[21] = (byte) -1;
        hb[22] = (byte) -1;
        hb[23] = (byte) -1;
        hb[24] = (byte) -1;
        hb[25] = (byte) -1;
        hb[26] = (byte) -1;
        hb[27] = (byte) -1;
        hb[28] = (byte) -1;
        hb[29] = (byte) -1;
        hb[30] = (byte) -1;
        hb[31] = (byte) -1;
        hb[32] = (byte) -1;
        hb[33] = (byte) -1;
        hb[34] = (byte) -1;
        hb[35] = (byte) -1;
        hb[36] = (byte) -1;
        hb[37] = (byte) -1;
        hb[38] = (byte) -1;
        hb[39] = (byte) -1;
        setField(heapByteBufferR, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBufferR, "java.nio.ByteBuffer", "offset", 4);
        setField(heapByteBufferR, "java.nio.Buffer", "position", -4);
        String string = "";
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Class parserType = Class.forName("org.jsoup.parser.Parser");
        Method parseByteDataMethod = dataUtilClazz.getDeclaredMethod("parseByteData", heapByteBufferRType, stringType, stringType, parserType);
        parseByteDataMethod.setAccessible(true);
        java.lang.Object[] parseByteDataMethodArguments = new java.lang.Object[4];
        parseByteDataMethodArguments[0] = heapByteBufferR;
        parseByteDataMethodArguments[1] = string;
        parseByteDataMethodArguments[2] = ((Object) null);
        parseByteDataMethodArguments[3] = ((Object) null);
        try {
            parseByteDataMethod.invoke(null, parseByteDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#parseByteData(java.nio.ByteBuffer,java.lang.String,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(charsetName, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseByteData_ThrowIllegalArgumentException_5() throws Throwable  {
        Object heapByteBufferR = createInstance("java.nio.HeapByteBufferR");
        byte[] hb = new byte[40];
        hb[0] = (byte) -17;
        setField(heapByteBufferR, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBufferR, "java.nio.ByteBuffer", "offset", 4);
        setField(heapByteBufferR, "java.nio.Buffer", "position", -4);
        String string = "";
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Class parserType = Class.forName("org.jsoup.parser.Parser");
        Method parseByteDataMethod = dataUtilClazz.getDeclaredMethod("parseByteData", heapByteBufferRType, stringType, stringType, parserType);
        parseByteDataMethod.setAccessible(true);
        java.lang.Object[] parseByteDataMethodArguments = new java.lang.Object[4];
        parseByteDataMethodArguments[0] = heapByteBufferR;
        parseByteDataMethodArguments[1] = string;
        parseByteDataMethodArguments[2] = ((Object) null);
        parseByteDataMethodArguments[3] = ((Object) null);
        try {
            parseByteDataMethod.invoke(null, parseByteDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#parseByteData(java.nio.ByteBuffer,java.lang.String,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(charsetName, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseByteData_ThrowIllegalArgumentException_6() throws Throwable  {
        Object heapByteBufferR = createInstance("java.nio.HeapByteBufferR");
        byte[] hb = new byte[40];
        hb[0] = (byte) -1;
        setField(heapByteBufferR, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBufferR, "java.nio.ByteBuffer", "offset", 4);
        setField(heapByteBufferR, "java.nio.Buffer", "position", -4);
        String string = "";
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Class parserType = Class.forName("org.jsoup.parser.Parser");
        Method parseByteDataMethod = dataUtilClazz.getDeclaredMethod("parseByteData", heapByteBufferRType, stringType, stringType, parserType);
        parseByteDataMethod.setAccessible(true);
        java.lang.Object[] parseByteDataMethodArguments = new java.lang.Object[4];
        parseByteDataMethodArguments[0] = heapByteBufferR;
        parseByteDataMethodArguments[1] = string;
        parseByteDataMethodArguments[2] = ((Object) null);
        parseByteDataMethodArguments[3] = ((Object) null);
        try {
            parseByteDataMethod.invoke(null, parseByteDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#parseByteData(java.nio.ByteBuffer,java.lang.String,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(charsetName, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseByteData_ThrowIllegalArgumentException_7() throws Throwable  {
        Object heapByteBufferR = createInstance("java.nio.HeapByteBufferR");
        byte[] hb = new byte[40];
        hb[1] = (byte) 1;
        setField(heapByteBufferR, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBufferR, "java.nio.ByteBuffer", "offset", 4);
        setField(heapByteBufferR, "java.nio.Buffer", "position", -4);
        String string = "";
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Class parserType = Class.forName("org.jsoup.parser.Parser");
        Method parseByteDataMethod = dataUtilClazz.getDeclaredMethod("parseByteData", heapByteBufferRType, stringType, stringType, parserType);
        parseByteDataMethod.setAccessible(true);
        java.lang.Object[] parseByteDataMethodArguments = new java.lang.Object[4];
        parseByteDataMethodArguments[0] = heapByteBufferR;
        parseByteDataMethodArguments[1] = string;
        parseByteDataMethodArguments[2] = ((Object) null);
        parseByteDataMethodArguments[3] = ((Object) null);
        try {
            parseByteDataMethod.invoke(null, parseByteDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#parseByteData(java.nio.ByteBuffer,java.lang.String,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(charsetName, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseByteData_ThrowIllegalArgumentException_8() throws Throwable  {
        Object heapByteBufferR = createInstance("java.nio.HeapByteBufferR");
        byte[] hb = new byte[40];
        hb[2] = (byte) -2;
        setField(heapByteBufferR, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBufferR, "java.nio.ByteBuffer", "offset", 4);
        setField(heapByteBufferR, "java.nio.Buffer", "position", -4);
        String string = "";
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Class parserType = Class.forName("org.jsoup.parser.Parser");
        Method parseByteDataMethod = dataUtilClazz.getDeclaredMethod("parseByteData", heapByteBufferRType, stringType, stringType, parserType);
        parseByteDataMethod.setAccessible(true);
        java.lang.Object[] parseByteDataMethodArguments = new java.lang.Object[4];
        parseByteDataMethodArguments[0] = heapByteBufferR;
        parseByteDataMethodArguments[1] = string;
        parseByteDataMethodArguments[2] = ((Object) null);
        parseByteDataMethodArguments[3] = ((Object) null);
        try {
            parseByteDataMethod.invoke(null, parseByteDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseByteData(java.nio.ByteBuffer, java.lang.String, java.lang.String, org.jsoup.parser.Parser)
    
    @Test
    public void testParseByteData1() throws Throwable  {
        Object heapByteBufferR = createInstance("java.nio.HeapByteBufferR");
        setField(heapByteBufferR, "java.nio.Buffer", "position", -3);
        setField(heapByteBufferR, "java.nio.Buffer", "limit", 1073741824);
        
        /* This test fails because method [org.jsoup.helper.DataUtil.parseByteData] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.nio.HeapByteBuffer.get(HeapByteBuffer.java:184)
            java.base/java.nio.ByteBuffer.get(ByteBuffer.java:826)
            org.jsoup.helper.DataUtil.detectCharsetFromBom(DataUtil.java:245)
            org.jsoup.helper.DataUtil.parseByteData(DataUtil.java:99) */
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Class stringType = Class.forName("java.lang.String");
        Class parserType = Class.forName("org.jsoup.parser.Parser");
        Method parseByteDataMethod = dataUtilClazz.getDeclaredMethod("parseByteData", heapByteBufferRType, stringType, stringType, parserType);
        parseByteDataMethod.setAccessible(true);
        java.lang.Object[] parseByteDataMethodArguments = new java.lang.Object[4];
        parseByteDataMethodArguments[0] = heapByteBufferR;
        parseByteDataMethodArguments[1] = ((Object) null);
        parseByteDataMethodArguments[2] = ((Object) null);
        parseByteDataMethodArguments[3] = ((Object) null);
        try {
            parseByteDataMethod.invoke(null, parseByteDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for parseByteData
    
    public void testParseByteData_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 52 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1001129500935500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1001129500935500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1001129500943800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1001129500935500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1001129500943800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1001129501987000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1001129501987000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1001129501990500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1001129501987000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1001129501990500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


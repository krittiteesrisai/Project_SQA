package org.jsoup.helper;

import org.junit.Test;
import java.io.File;
import java.io.IOException;
import org.jsoup.parser.ParseSettings;
import java.util.Map;
import java.util.LinkedHashMap;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.jsoup.internal.ConstrainableInputStream;
import org.mockito.MockedConstruction.Context;
import org.mockito.MockedConstruction;
import java.util.Random;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mockConstruction;

public final class org_jsoup_helper_DataUtilTest {
    ///region Test suites for executable org.jsoup.helper.DataUtil.load
    
    ///region OTHER: ERROR SUITE for method load(java.io.File, java.lang.String, java.lang.String)
    
    @Test
    public void testLoad1() throws IOException  {
        /* This test fails because method [org.jsoup.helper.DataUtil.load] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.FileInputStream.<init>(FileInputStream.java:146)
            org.jsoup.helper.DataUtil.load(DataUtil.java:53) */
        DataUtil.load(((File) null), ((String) null), ((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.DataUtil.load
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method load(java.io.InputStream, java.lang.String, java.lang.String, org.jsoup.parser.Parser)
    
    @Test(expected = IllegalArgumentException.class)
    public void testLoad2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, IOException  {
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            
            DataUtil.load(null, null, null, null);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
            setStaticField(org.jsoup.parser.Tag.class, "tags", prevTags);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.DataUtil.load
    
    ///region FUZZER: TIMEOUTS for method load(java.io.InputStream, java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.helper.DataUtil}
     * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#load(java.io.InputStream,java.lang.String,java.lang.String)}
     */
    @Test(timeout = 1000L)
    public void testLoadWithBlankStrings() throws IOException  {
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        DataUtil.load(((InputStream) null), "\n\u001C\t\r", "\n\t\r");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.DataUtil.detectCharsetFromBom
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method detectCharsetFromBom(java.nio.ByteBuffer)
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): False}
 * @utbot.executesCondition {@code (bom[0] == 0x00): True}
 * @utbot.executesCondition {@code (bom[1] == 0x00): True}
 * @utbot.executesCondition {@code (bom[2] == (byte) 0xFE): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFE): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xEF): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testDetectCharsetFromBom_2OfBomNotEquals0xFE() throws Exception  {
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        setField(heapByteBuffer, "java.nio.Buffer", "position", -3);
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[1];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        Object actual = detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments);
        
        assertNull(actual);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        
        assertEquals(-3, finalHeapByteBufferMark);
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.executesCondition {@code (bom[0] == 0x00): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFE): True}
 * @utbot.executesCondition {@code (bom[1] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xEF): False}
 * @utbot.returnsFrom {@code return null;}
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
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[1];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        Object actual = detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments);
        
        assertNull(actual);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        int finalHeapByteBufferPosition = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "position"));
        
        assertEquals(-1, finalHeapByteBufferMark);
        
        assertEquals(0, finalHeapByteBufferPosition);
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.executesCondition {@code (bom[0] == 0x00): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): True}
 * @utbot.executesCondition {@code (bom[1] == (byte) 0xFE): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFE): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): True}
 * @utbot.executesCondition {@code (bom[1] == (byte) 0xFE): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xEF): False}
 * @utbot.returnsFrom {@code return null;}
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
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[1];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        Object actual = detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments);
        
        assertNull(actual);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        int finalHeapByteBufferPosition = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "position"));
        
        assertEquals(-1, finalHeapByteBufferMark);
        
        assertEquals(0, finalHeapByteBufferPosition);
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.executesCondition {@code (bom[0] == 0x00): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFE): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xEF): True}
 * @utbot.executesCondition {@code (bom[1] == (byte) 0xBB): False}
 * @utbot.returnsFrom {@code return null;}
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
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[1];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        Object actual = detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments);
        
        assertNull(actual);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        int finalHeapByteBufferPosition = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "position"));
        
        assertEquals(-1, finalHeapByteBufferMark);
        
        assertEquals(0, finalHeapByteBufferPosition);
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.executesCondition {@code (bom[0] == 0x00): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFE): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xEF): True}
 * @utbot.executesCondition {@code (bom[1] == (byte) 0xBB): True}
 * @utbot.executesCondition {@code (bom[2] == (byte) 0xBF): False}
 * @utbot.returnsFrom {@code return null;}
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
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[1];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        Object actual = detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments);
        
        assertNull(actual);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        int finalHeapByteBufferPosition = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "position"));
        
        assertEquals(-1, finalHeapByteBufferMark);
        
        assertEquals(0, finalHeapByteBufferPosition);
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.executesCondition {@code (bom[0] == 0x00): True}
 * @utbot.executesCondition {@code (bom[1] == 0x00): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFE): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xEF): False}
 * @utbot.returnsFrom {@code return null;}
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
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[1];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        Object actual = detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments);
        
        assertNull(actual);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        int finalHeapByteBufferPosition = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "position"));
        
        assertEquals(-1, finalHeapByteBufferMark);
        
        assertEquals(0, finalHeapByteBufferPosition);
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.executesCondition {@code (bom[0] == 0x00): True}
 * @utbot.executesCondition {@code (bom[1] == 0x00): True}
 * @utbot.executesCondition {@code (bom[2] == (byte) 0xFE): True}
 * @utbot.executesCondition {@code (bom[3] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFE): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xEF): False}
 * @utbot.returnsFrom {@code return null;}
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
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[1];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        Object actual = detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments);
        
        assertNull(actual);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        int finalHeapByteBufferPosition = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "position"));
        
        assertEquals(-1, finalHeapByteBufferMark);
        
        assertEquals(0, finalHeapByteBufferPosition);
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.executesCondition {@code (bom[0] == 0x00): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFE): True}
 * @utbot.executesCondition {@code (bom[1] == (byte) 0xFF): True}
 * @utbot.returnsFrom {@code return new BomCharset("UTF-16", false);}
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
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[1];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        Object actual = detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments);
        
        Object expected = createInstance("org.jsoup.helper.DataUtil$BomCharset");
        String charset = "UTF-16";
        setField(expected, "org.jsoup.helper.DataUtil$BomCharset", "charset", charset);
        
        String expectedCharset = ((String) getFieldValue(expected, "org.jsoup.helper.DataUtil$BomCharset", "charset"));
        String actualCharset = ((String) getFieldValue(actual, "org.jsoup.helper.DataUtil$BomCharset", "charset"));
        assertEquals(expectedCharset, actualCharset);
        
        boolean actualOffset = ((Boolean) getFieldValue(actual, "org.jsoup.helper.DataUtil$BomCharset", "offset"));
        assertFalse(actualOffset);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        int finalHeapByteBufferPosition = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "position"));
        
        assertEquals(-1, finalHeapByteBufferMark);
        
        assertEquals(0, finalHeapByteBufferPosition);
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.executesCondition {@code (bom[0] == 0x00): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFE): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xEF): True}
 * @utbot.executesCondition {@code (bom[1] == (byte) 0xBB): True}
 * @utbot.executesCondition {@code (bom[2] == (byte) 0xBF): True}
 * @utbot.returnsFrom {@code return new BomCharset("UTF-8", true);}
 *  */
    @Test
    public void testDetectCharsetFromBom_2OfBomEquals0xBF() throws Exception  {
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = new byte[32];
        hb[0] = (byte) -17;
        hb[1] = (byte) -69;
        hb[2] = (byte) -65;
        setField(heapByteBuffer, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBuffer, "java.nio.ByteBuffer", "offset", 4);
        setField(heapByteBuffer, "java.nio.Buffer", "position", -4);
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[1];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        Object actual = detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments);
        
        Object expected = createInstance("org.jsoup.helper.DataUtil$BomCharset");
        String charset = "UTF-8";
        setField(expected, "org.jsoup.helper.DataUtil$BomCharset", "charset", charset);
        setField(expected, "org.jsoup.helper.DataUtil$BomCharset", "offset", true);
        
        String expectedCharset = ((String) getFieldValue(expected, "org.jsoup.helper.DataUtil$BomCharset", "charset"));
        String actualCharset = ((String) getFieldValue(actual, "org.jsoup.helper.DataUtil$BomCharset", "charset"));
        assertEquals(expectedCharset, actualCharset);
        
        boolean actualOffset = ((Boolean) getFieldValue(actual, "org.jsoup.helper.DataUtil$BomCharset", "offset"));
        assertTrue(actualOffset);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        int finalHeapByteBufferPosition = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "position"));
        
        assertEquals(-1, finalHeapByteBufferMark);
        
        assertEquals(0, finalHeapByteBufferPosition);
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.executesCondition {@code (bom[0] == 0x00): True}
 * @utbot.executesCondition {@code (bom[1] == 0x00): True}
 * @utbot.executesCondition {@code (bom[2] == (byte) 0xFE): True}
 * @utbot.executesCondition {@code (bom[3] == (byte) 0xFF): True}
 * @utbot.returnsFrom {@code return new BomCharset("UTF-32", false);}
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
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[1];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        Object actual = detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments);
        
        Object expected = createInstance("org.jsoup.helper.DataUtil$BomCharset");
        String charset = "UTF-32";
        setField(expected, "org.jsoup.helper.DataUtil$BomCharset", "charset", charset);
        
        String expectedCharset = ((String) getFieldValue(expected, "org.jsoup.helper.DataUtil$BomCharset", "charset"));
        String actualCharset = ((String) getFieldValue(actual, "org.jsoup.helper.DataUtil$BomCharset", "charset"));
        assertEquals(expectedCharset, actualCharset);
        
        boolean actualOffset = ((Boolean) getFieldValue(actual, "org.jsoup.helper.DataUtil$BomCharset", "offset"));
        assertFalse(actualOffset);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        int finalHeapByteBufferPosition = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "position"));
        
        assertEquals(-1, finalHeapByteBufferMark);
        
        assertEquals(0, finalHeapByteBufferPosition);
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.executesCondition {@code (bom[0] == 0x00): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): True}
 * @utbot.executesCondition {@code (bom[1] == (byte) 0xFE): True}
 * @utbot.executesCondition {@code (bom[2] == 0x00): True}
 * @utbot.executesCondition {@code (bom[3] == 0x00): True}
 * @utbot.returnsFrom {@code return new BomCharset("UTF-32", false);}
 *  */
    @Test
    public void testDetectCharsetFromBom_3OfBomEqualsZero() throws Exception  {
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = new byte[32];
        hb[0] = (byte) -1;
        hb[1] = (byte) -2;
        setField(heapByteBuffer, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBuffer, "java.nio.ByteBuffer", "offset", 4);
        setField(heapByteBuffer, "java.nio.Buffer", "position", -4);
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[1];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        Object actual = detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments);
        
        Object expected = createInstance("org.jsoup.helper.DataUtil$BomCharset");
        String charset = "UTF-32";
        setField(expected, "org.jsoup.helper.DataUtil$BomCharset", "charset", charset);
        
        String expectedCharset = ((String) getFieldValue(expected, "org.jsoup.helper.DataUtil$BomCharset", "charset"));
        String actualCharset = ((String) getFieldValue(actual, "org.jsoup.helper.DataUtil$BomCharset", "charset"));
        assertEquals(expectedCharset, actualCharset);
        
        boolean actualOffset = ((Boolean) getFieldValue(actual, "org.jsoup.helper.DataUtil$BomCharset", "offset"));
        assertFalse(actualOffset);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        int finalHeapByteBufferPosition = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "position"));
        
        assertEquals(-1, finalHeapByteBufferMark);
        
        assertEquals(0, finalHeapByteBufferPosition);
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.executesCondition {@code (bom[0] == 0x00): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): True}
 * @utbot.executesCondition {@code (bom[1] == (byte) 0xFE): True}
 * @utbot.executesCondition {@code (bom[2] == 0x00): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFE): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): True}
 * @utbot.executesCondition {@code (bom[1] == (byte) 0xFE): True}
 * @utbot.returnsFrom {@code return new BomCharset("UTF-16", false);}
 *  */
    @Test
    public void testDetectCharsetFromBom_2OfBomNotEqualsZero() throws Exception  {
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = new byte[32];
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
        setField(heapByteBuffer, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBuffer, "java.nio.ByteBuffer", "offset", 4);
        setField(heapByteBuffer, "java.nio.Buffer", "position", -4);
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[1];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        Object actual = detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments);
        
        Object expected = createInstance("org.jsoup.helper.DataUtil$BomCharset");
        String charset = "UTF-16";
        setField(expected, "org.jsoup.helper.DataUtil$BomCharset", "charset", charset);
        
        String expectedCharset = ((String) getFieldValue(expected, "org.jsoup.helper.DataUtil$BomCharset", "charset"));
        String actualCharset = ((String) getFieldValue(actual, "org.jsoup.helper.DataUtil$BomCharset", "charset"));
        assertEquals(expectedCharset, actualCharset);
        
        boolean actualOffset = ((Boolean) getFieldValue(actual, "org.jsoup.helper.DataUtil$BomCharset", "offset"));
        assertFalse(actualOffset);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        int finalHeapByteBufferPosition = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "position"));
        
        assertEquals(-1, finalHeapByteBufferMark);
        
        assertEquals(0, finalHeapByteBufferPosition);
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.executesCondition {@code (bom[0] == 0x00): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): True}
 * @utbot.executesCondition {@code (bom[1] == (byte) 0xFE): True}
 * @utbot.executesCondition {@code (bom[2] == 0x00): True}
 * @utbot.executesCondition {@code (bom[3] == 0x00): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFE): False}
 * @utbot.executesCondition {@code (bom[0] == (byte) 0xFF): True}
 * @utbot.executesCondition {@code (bom[1] == (byte) 0xFE): True}
 * @utbot.returnsFrom {@code return new BomCharset("UTF-16", false);}
 *  */
    @Test
    public void testDetectCharsetFromBom_3OfBomNotEqualsZero() throws Exception  {
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {
            (byte) -1, (byte) -2, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
            (byte) 1
        };
        setField(heapByteBuffer, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBuffer, "java.nio.ByteBuffer", "offset", 4);
        setField(heapByteBuffer, "java.nio.Buffer", "position", -4);
        
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[1];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        Object actual = detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments);
        
        Object expected = createInstance("org.jsoup.helper.DataUtil$BomCharset");
        String charset = "UTF-16";
        setField(expected, "org.jsoup.helper.DataUtil$BomCharset", "charset", charset);
        
        String expectedCharset = ((String) getFieldValue(expected, "org.jsoup.helper.DataUtil$BomCharset", "charset"));
        String actualCharset = ((String) getFieldValue(actual, "org.jsoup.helper.DataUtil$BomCharset", "charset"));
        assertEquals(expectedCharset, actualCharset);
        
        boolean actualOffset = ((Boolean) getFieldValue(actual, "org.jsoup.helper.DataUtil$BomCharset", "offset"));
        assertFalse(actualOffset);
        
        int finalHeapByteBufferMark = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "mark"));
        int finalHeapByteBufferPosition = ((Integer) getFieldValue(heapByteBuffer, "java.nio.Buffer", "position"));
        
        assertEquals(-1, finalHeapByteBufferMark);
        
        assertEquals(0, finalHeapByteBufferPosition);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method detectCharsetFromBom(java.nio.ByteBuffer)
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer)}
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
            org.jsoup.helper.DataUtil.detectCharsetFromBom(DataUtil.java:242) */
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class directByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", directByteBufferRType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[1];
        detectCharsetFromBomMethodArguments[0] = directByteBufferR;
        try {
            detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer)}
 * @utbot.executesCondition {@code (byteData.remaining() >= bom.length): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: byteData.get(bom);
 *  */
    @Test
    public void testDetectCharsetFromBom_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) 0};
        setField(heapByteBuffer, "java.nio.ByteBuffer", "hb", hb);
        setField(heapByteBuffer, "java.nio.ByteBuffer", "offset", Integer.MIN_VALUE);
        setField(heapByteBuffer, "java.nio.Buffer", "position", Integer.MAX_VALUE);
        setField(heapByteBuffer, "java.nio.Buffer", "limit", -1073741822);
        
        /* This test fails because method [org.jsoup.helper.DataUtil.detectCharsetFromBom] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.nio.HeapByteBuffer.get(HeapByteBuffer.java:184)
            java.base/java.nio.ByteBuffer.get(ByteBuffer.java:826)
            org.jsoup.helper.DataUtil.detectCharsetFromBom(DataUtil.java:242) */
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", heapByteBufferType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[1];
        detectCharsetFromBomMethodArguments[0] = heapByteBuffer;
        try {
            detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#detectCharsetFromBom(java.nio.ByteBuffer)}
 * @utbot.invokes {@link java.nio.Buffer#mark()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.mark();
 *  */
    @Test
    public void testDetectCharsetFromBom_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.helper.DataUtil.detectCharsetFromBom] produces [java.lang.NullPointerException]
            org.jsoup.helper.DataUtil.detectCharsetFromBom(DataUtil.java:239) */
        Class dataUtilClazz = Class.forName("org.jsoup.helper.DataUtil");
        Class byteBufferType = Class.forName("java.nio.ByteBuffer");
        Method detectCharsetFromBomMethod = dataUtilClazz.getDeclaredMethod("detectCharsetFromBom", byteBufferType);
        detectCharsetFromBomMethod.setAccessible(true);
        java.lang.Object[] detectCharsetFromBomMethodArguments = new java.lang.Object[1];
        detectCharsetFromBomMethodArguments[0] = ((Object) null);
        try {
            detectCharsetFromBomMethod.invoke(null, detectCharsetFromBomMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
    
    ///region Test suites for executable org.jsoup.helper.DataUtil.readToByteBuffer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readToByteBuffer(java.io.InputStream, int)
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#readToByteBuffer(java.io.InputStream,int)}
 * @utbot.returnsFrom {@code return input.readToByteBuffer(maxSize);}
 *  */
    @Test
    public void testReadToByteBuffer_ReturnInputReadToByteBuffer() throws Exception  {
        ConstrainableInputStream constrainableInputStream = ((ConstrainableInputStream) createInstance("org.jsoup.internal.ConstrainableInputStream"));
        setField(constrainableInputStream, "org.jsoup.internal.ConstrainableInputStream", "capped", true);
        
        Object actual = DataUtil.readToByteBuffer(constrainableInputStream, 1);
        
        Object expected = createInstance("java.nio.HeapByteBuffer");
        
    }
    
    /**
    @utbot.classUnderTest {@link DataUtil}
 * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#readToByteBuffer(java.io.InputStream,int)}
 * @utbot.returnsFrom {@code return input.readToByteBuffer(maxSize);}
 *  */
    @Test
    public void testReadToByteBuffer_ReturnInputReadToByteBuffer_1() throws Exception  {
        ConstrainableInputStream constrainableInputStream = ((ConstrainableInputStream) createInstance("org.jsoup.internal.ConstrainableInputStream"));
        setField(constrainableInputStream, "org.jsoup.internal.ConstrainableInputStream", "interrupted", true);
        
        Object actual = DataUtil.readToByteBuffer(constrainableInputStream, 1);
        
        Object expected = createInstance("java.nio.HeapByteBuffer");
        
    }
    ///endregion
    
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
    
    ///region Errors report for readToByteBuffer
    
    public void testReadToByteBuffer_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // No such field boolean interrupted found in org.utbot.engine.overrides.threads.UtThread
        
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
            mockedConstruction = mockConstruction(Random.class, (Random randomMock, Context context) -> (when(randomMock.nextInt(anyInt()))).thenReturn(62, 58, 2, 32, 62, 12, 37, 62, 58, 15, 41, 25, 31, 30, 10, 55, 56, 27, 46, 19, 62, 18, 53, 36, 15, 38, 38, 0, 26, 50, 6, 1));
            
            String actual = DataUtil.mimeBoundary();
            
            String expected = "YU1uYazYUdDnts9RSpIhYgPydAA-oM5_";
            
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
    
    ///region Util methods
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1007481363682500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1007481363682500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1007481363690700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1007481363682500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1007481363690700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1007481367004300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1007481367004300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1007481367010000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1007481367004300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1007481367010000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1007481368004100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1007481368004100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1007481368007400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1007481368004100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1007481368007400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1007481368273200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1007481368273200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1007481368277500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1007481368273200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1007481368277500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


package org.jsoup.helper;

import org.junit.Test;
import java.io.File;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.parser.Parser;
import java.io.InputStream;

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
    
    ///region Test suites for executable org.jsoup.helper.DataUtil.load
    
    ///region FUZZER: ERROR SUITE for method load(java.io.InputStream, java.lang.String, java.lang.String, org.jsoup.parser.Parser)
    
    @Test
    public void testLoadByFuzzer() throws IOException  {
        byte[] byteArray = {java.lang.Byte.MIN_VALUE, java.lang.Byte.MAX_VALUE, (byte) -1, (byte) 0, (byte) -1};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        
        /* This test fails because method [org.jsoup.helper.DataUtil.load] produces [java.nio.charset.IllegalCharsetNameException:     
        ]
            java.base/java.nio.charset.Charset.checkName(Charset.java:305)
            java.base/java.nio.charset.Charset.lookup2(Charset.java:481)
            java.base/java.nio.charset.Charset.lookup(Charset.java:461)
            java.base/java.nio.charset.Charset.forName(Charset.java:525)
            org.jsoup.helper.DataUtil.parseByteData(DataUtil.java:92)
            org.jsoup.helper.DataUtil.load(DataUtil.java:68) */
        DataUtil.load(byteArrayInputStream, "\t\r", "", null);
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method load(java.io.InputStream, java.lang.String, java.lang.String, org.jsoup.parser.Parser)
    
    @Test(timeout = 1000L)
    public void testLoadByFuzzer1() throws IOException  {
        byte[] byteArray = {};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray, Integer.MIN_VALUE, Integer.MIN_VALUE);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Parser parser = new Parser(xmlTreeBuilder);
        XmlTreeBuilder xmlTreeBuilder1 = new XmlTreeBuilder();
        parser.setTreeBuilder(xmlTreeBuilder1);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        DataUtil.load(objectInputStream, null, null, parser);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.DataUtil.load
    
    ///region FUZZER: ERROR SUITE for method load(java.io.InputStream, java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.helper.DataUtil}
     * @utbot.methodUnderTest {@link org.jsoup.helper.DataUtil#load(java.io.InputStream,java.lang.String,java.lang.String)}
     */
    @Test
    public void testLoadThrowsNPEWithNonEmptyStrings() throws IOException  {
        /* This test fails because method [org.jsoup.helper.DataUtil.load] produces [java.lang.NullPointerException]
            org.jsoup.helper.DataUtil.readToByteBuffer(DataUtil.java:110)
            org.jsoup.helper.DataUtil.load(DataUtil.java:53) */
        DataUtil.load(((InputStream) null), "-3", "#$\\\"'");
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
        String actual = DataUtil.getCharsetFromContentType("\u0014\n\t\r");
        
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
        /* This test fails because method [org.jsoup.helper.DataUtil.parseByteData] produces [java.nio.charset.IllegalCharsetNameException: charset]
            java.base/java.nio.charset.Charset.checkName(Charset.java:305)
            java.base/java.nio.charset.Charset.lookup2(Charset.java:481)
            java.base/java.nio.charset.Charset.lookup(Charset.java:461)
            java.base/java.nio.charset.Charset.forName(Charset.java:525)
            org.jsoup.helper.DataUtil.parseByteData(DataUtil.java:92) */
        DataUtil.parseByteData(null, "charse\u0095t", "10", null);
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
}


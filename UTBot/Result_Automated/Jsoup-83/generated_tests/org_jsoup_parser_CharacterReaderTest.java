package org.jsoup.parser;

import org.junit.Test;
import java.io.BufferedReader;
import java.io.StringReader;
import java.io.InputStreamReader;
import sun.nio.cs.StreamDecoder;
import org.jsoup.UncheckedIOException;
import java.lang.reflect.Method;
import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;

public final class org_jsoup_parser_CharacterReaderTest {
    ///region Test suites for executable org.jsoup.parser.CharacterReader.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#toString()}
 * @utbot.returnsFrom {@code return new String(charBuf, bufPos, bufLength - bufPos);}
 *  */
    @Test
    public void testToString_Return() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        
        String actual = characterReader.toString();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#toString()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return new String(charBuf, bufPos, bufLength - bufPos);
 *  */
    @Test
    public void testToString_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.toString] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.toString(CharacterReader.java:422) */
        characterReader.toString();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new String(charBuf, bufPos, bufLength - bufPos);
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.toString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.toString(CharacterReader.java:422) */
        characterReader.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmpty()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#isEmpty()}
 * @utbot.returnsFrom {@code return bufPos >= bufLength;}
 *  */
    @Test
    public void testIsEmpty_BufPosLessThanBufLength() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        boolean actual = characterReader.isEmpty();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#isEmpty()}
 * @utbot.returnsFrom {@code return bufPos >= bufLength;}
 *  */
    @Test
    public void testIsEmpty_BufPosGreaterOrEqualBufLength() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        boolean actual = characterReader.isEmpty();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEmpty()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#isEmpty()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: bufferUp();
 *  */
    @Test
    public void testIsEmpty_ThrowIllegalArgumentException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.isEmpty] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80) */
        characterReader.isEmpty();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testIsEmpty_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.isEmpty] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80) */
        characterReader.isEmpty();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testIsEmpty_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        StringReader reader = ((StringReader) createInstance("java.io.StringReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.isEmpty] produces [java.lang.NullPointerException]
            java.base/java.io.StringReader.skip(StringReader.java:132)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80) */
        characterReader.isEmpty();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isEmpty()
    
    @Test
    public void testIsEmpty1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = new char[33];
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", -2147483647);
        setField(reader, "java.io.BufferedReader", "nextChar", -2147483646);
        setField(reader, "java.io.BufferedReader", "markedChar", Integer.MAX_VALUE);
        setField(reader, "java.io.BufferedReader", "readAheadLimit", 6);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -2147483132);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 512);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.isEmpty] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80) */
        characterReader.isEmpty();
    }
    ///endregion
    
    ///region Errors report for isEmpty
    
    public void testIsEmpty_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 15 occurrences of:
        // Concrete execution failed
        
        // 6 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.matches
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matches(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(java.lang.String)}
 * @utbot.executesCondition {@code (scanLength > bufLength - bufPos): True}
 *  */
    @Test
    public void testMatches_ScanLengthGreaterThanBufLengthMinusBufPos() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        String string = " ";
        
        boolean actual = characterReader.matches(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(java.lang.String)}
 * @utbot.executesCondition {@code (scanLength > bufLength - bufPos): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testMatches_ScanLengthLessOrEqualBufLengthMinusBufPos() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -249);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -248);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -249);
        String string = "";
        
        boolean actual = characterReader.matches(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(java.lang.String)}
 * @utbot.executesCondition {@code (scanLength > bufLength - bufPos): False}
 * @utbot.iterates iterate the loop {@code for(int offset = 0; offset < scanLength; offset++)} once
 *  */
    @Test
    public void testMatches_SeqCharAtNotEqualsBufPosoffsetOfCharBuf() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'\u0000'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        String string = "!";
        
        boolean actual = characterReader.matches(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(java.lang.String)}
 * @utbot.executesCondition {@code (scanLength > bufLength - bufPos): False}
 * @utbot.iterates iterate the loop {@code for(int offset = 0; offset < scanLength; offset++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testMatches_SeqCharAtEqualsBufPosoffsetOfCharBuf() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'@'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        String string = "@";
        
        boolean actual = characterReader.matches(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matches(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(java.lang.String)}
 * @utbot.executesCondition {@code (scanLength > bufLength - bufPos): False}
 * @utbot.iterates iterate the loop {@code for(int offset = 0; offset < scanLength; offset++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: seq.charAt(offset) != charBuf[bufPos + offset]
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'\u0000'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -256);
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:342) */
        characterReader.matches(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int scanLength = seq.length();
 *  */
    @Test
    public void testMatches_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:337) */
        characterReader.matches(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testMatches_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:336) */
        characterReader.matches(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(java.lang.String)}
 * @utbot.executesCondition {@code (scanLength > bufLength - bufPos): False}
 * @utbot.iterates iterate the loop {@code for(int offset = 0; offset < scanLength; offset++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: seq.charAt(offset) != charBuf[bufPos + offset]
 *  */
    @Test
    public void testMatches_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -251);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -251);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -252);
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:342) */
        characterReader.matches(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method matches(java.lang.String)
    
    @Test
    public void testMatches1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(reader, "java.io.BufferedReader", "in", reader);
        char[] cb = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", -2147483647);
        setField(reader, "java.io.BufferedReader", "nextChar", -1610612736);
        setField(reader, "java.io.BufferedReader", "markedChar", Integer.MIN_VALUE);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -1073741821);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 1073741824);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:336) */
        characterReader.matches(null);
    }
    
    @Test
    public void testMatches2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        StringReader reader = ((StringReader) createInstance("java.io.StringReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -2147483647);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.NullPointerException]
            java.base/java.io.StringReader.skip(StringReader.java:132)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:336) */
        characterReader.matches(null);
    }
    ///endregion
    
    ///region Errors report for matches
    
    public void testMatches_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 5 occurrences of:
        // Concrete execution failed
        
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.matches
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matches(char)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(char)}
 * @utbot.returnsFrom {@code return !isEmpty() && charBuf[bufPos] == c;}
 *  */
    @Test
    public void testMatches_ReturnNotIsEmptyAndBufPosOfCharBufNotEqualsC() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        boolean actual = characterReader.matches(' ');
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(char)}
 * @utbot.returnsFrom {@code return !isEmpty() && charBuf[bufPos] == c;}
 *  */
    @Test
    public void testMatches_NotIsEmptyAndBufPosOfCharBufNotEqualsC() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 1);
        
        boolean actual = characterReader.matches('!');
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(char)}
 * @utbot.returnsFrom {@code return !isEmpty() && charBuf[bufPos] == c;}
 *  */
    @Test
    public void testMatches_NotIsEmptyAndBufPosOfCharBufEqualsC() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        boolean actual = characterReader.matches(' ');
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matches(char)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(char)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return !isEmpty() && charBuf[bufPos] == c;
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:331) */
        characterReader.matches(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return !isEmpty() && charBuf[bufPos] == c;
 *  */
    @Test
    public void testMatches_ThrowIllegalArgumentException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -246);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -246);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:331) */
        characterReader.matches(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !isEmpty() && charBuf[bufPos] == c;
 *  */
    @Test
    public void testMatches_ThrowNullPointerException1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:331) */
        characterReader.matches(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !isEmpty() && charBuf[bufPos] == c;
 *  */
    @Test
    public void testMatches_ThrowNullPointerException_11() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:331) */
        characterReader.matches(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !isEmpty() && charBuf[bufPos] == c;
 *  */
    @Test
    public void testMatches_ThrowNullPointerException_21() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:331) */
        characterReader.matches(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !isEmpty() && charBuf[bufPos] == c;
 *  */
    @Test
    public void testMatches_ThrowNullPointerException_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        StringReader reader = ((StringReader) createInstance("java.io.StringReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.NullPointerException]
            java.base/java.io.StringReader.skip(StringReader.java:132)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:331) */
        characterReader.matches(' ');
    }
    ///endregion
    
    ///region Errors report for matches
    
    public void testMatches_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Default concrete execution failed
        
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.current
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method current()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#current()}
 * @utbot.returnsFrom {@code return isEmptyNoBufferUp() ? EOF : charBuf[bufPos];}
 *  */
    @Test
    public void testCurrent_ReturnIsEmptyNoBufferUp_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        char actual = characterReader.current();
        
        assertEquals('\uFFFF', actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#current()}
 * @utbot.returnsFrom {@code return isEmptyNoBufferUp() ? EOF : charBuf[bufPos];}
 *  */
    @Test
    public void testCurrent_ReturnIsEmptyNoBufferUp() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        char actual = characterReader.current();
        
        assertEquals(' ', actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method current()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#current()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: bufferUp();
 *  */
    @Test
    public void testCurrent_ThrowIllegalArgumentException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.current] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:93) */
        characterReader.current();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#current()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: charBuf[bufPos]
 *  */
    @Test
    public void testCurrent_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.current] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:94) */
        characterReader.current();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#current()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testCurrent_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.current] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:93) */
        characterReader.current();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#current()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: charBuf[bufPos]
 *  */
    @Test
    public void testCurrent_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.current] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:94) */
        characterReader.current();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#current()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testCurrent_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.current] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:93) */
        characterReader.current();
    }
    ///endregion
    
    ///region Errors report for current
    
    public void testCurrent_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.pos
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method pos()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#pos()}
 * @utbot.returnsFrom {@code return readerPos + bufPos;}
 *  */
    @Test
    public void testPos_ReturnReaderPosPlusBufPos() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "readerPos", 1);
        
        int actual = characterReader.pos();
        
        assertEquals(-254, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.mark
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mark()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#mark()}
 *  */
    @Test
    public void testMark() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufMark", -255);
        
        characterReader.mark();
        
        int finalCharacterReaderBufMark = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "bufMark"));
        
        assertEquals(1, finalCharacterReaderBufMark);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.advance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method advance()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#advance()}
 *  */
    @Test
    public void testAdvance() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        characterReader.advance();
        
        int finalCharacterReaderBufPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        
        assertEquals(-254, finalCharacterReaderBufPos);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consume
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consume()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consume()}
 * @utbot.returnsFrom {@code return val;}
 *  */
    @Test
    public void testConsume_ReturnVal_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        char actual = characterReader.consume();
        
        assertEquals('\uFFFF', actual);
        
        int finalCharacterReaderBufPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        
        assertEquals(0, finalCharacterReaderBufPos);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consume()}
 * @utbot.returnsFrom {@code return val;}
 *  */
    @Test
    public void testConsume_ReturnVal() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        char actual = characterReader.consume();
        
        assertEquals(' ', actual);
        
        int finalCharacterReaderBufPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        
        assertEquals(1, finalCharacterReaderBufPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consume()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consume()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: bufferUp();
 *  */
    @Test
    public void testConsume_ThrowIllegalArgumentException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consume] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consume(CharacterReader.java:98) */
        characterReader.consume();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consume()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: charBuf[bufPos]
 *  */
    @Test
    public void testConsume_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consume] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consume(CharacterReader.java:99) */
        characterReader.consume();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consume()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testConsume_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consume] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consume(CharacterReader.java:98) */
        characterReader.consume();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consume()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: charBuf[bufPos]
 *  */
    @Test
    public void testConsume_ThrowNullPointerException_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consume] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consume(CharacterReader.java:99) */
        characterReader.consume();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consume()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testConsume_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consume] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consume(CharacterReader.java:98) */
        characterReader.consume();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consume()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testConsume_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        StringReader reader = ((StringReader) createInstance("java.io.StringReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consume] produces [java.lang.NullPointerException]
            java.base/java.io.StringReader.skip(StringReader.java:132)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consume(CharacterReader.java:98) */
        characterReader.consume();
    }
    ///endregion
    
    ///region Errors report for consume
    
    public void testConsume_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.matchesAny
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesAny([C)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAny(char[])}
 * @utbot.iterates iterate the loop {@code for(char seek: seq)} once
 *  */
    @Test
    public void testMatchesAny_SeekEqualsC() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        char[] charArray = {' '};
        
        boolean actual = characterReader.matchesAny(charArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAny(char[])}
 * @utbot.iterates iterate the loop {@code for(char seek: seq)} once
 *  */
    @Test
    public void testMatchesAny_SeekNotEqualsC() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        char[] charArray = {'A'};
        
        boolean actual = characterReader.matchesAny(charArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAny(char[])}
 *  */
    @Test
    public void testMatchesAny_ReturnFalse() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        boolean actual = characterReader.matchesAny(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesAny([C)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAny(char[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: isEmpty()
 *  */
    @Test
    public void testMatchesAny_ThrowIllegalArgumentException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -254);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -254);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesAny] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.CharacterReader.matchesAny(CharacterReader.java:363) */
        characterReader.matchesAny(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAny(char[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = charBuf[bufPos];
 *  */
    @Test
    public void testMatchesAny_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesAny] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.matchesAny(CharacterReader.java:367) */
        characterReader.matchesAny(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAny(char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(char seek: seq)
 *  */
    @Test
    public void testMatchesAny_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesAny] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matchesAny(CharacterReader.java:368) */
        characterReader.matchesAny(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAny(char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isEmpty()
 *  */
    @Test
    public void testMatchesAny_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesAny] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.CharacterReader.matchesAny(CharacterReader.java:363) */
        characterReader.matchesAny(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAny(char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = charBuf[bufPos];
 *  */
    @Test
    public void testMatchesAny_ThrowNullPointerException_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesAny] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matchesAny(CharacterReader.java:367) */
        characterReader.matchesAny(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAny(char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testMatchesAny_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesAny] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.CharacterReader.matchesAny(CharacterReader.java:363) */
        characterReader.matchesAny(null);
    }
    ///endregion
    
    ///region Errors report for matchesAny
    
    public void testMatchesAny_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeHexSequence
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeHexSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} once
 * @utbot.returnsFrom {@code return cacheString(charBuf, stringCache, start, bufPos - start);}
 *  */
    @Test
    public void testConsumeHexSequence_CGreaterThanF() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'g'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        String actual = characterReader.consumeHexSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} once
 * @utbot.returnsFrom {@code return cacheString(charBuf, stringCache, start, bufPos - start);}
 *  */
    @Test
    public void testConsumeHexSequence_CLessThanA() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'@'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        String actual = characterReader.consumeHexSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} once
 * @utbot.returnsFrom {@code return cacheString(charBuf, stringCache, start, bufPos - start);}
 *  */
    @Test
    public void testConsumeHexSequence_CLessThan0() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'/'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        String actual = characterReader.consumeHexSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} once
 * @utbot.returnsFrom {@code return cacheString(charBuf, stringCache, start, bufPos - start);}
 *  */
    @Test
    public void testConsumeHexSequence_BufPosGreaterOrEqualBufLength() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        String actual = characterReader.consumeHexSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeHexSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = charBuf[bufPos];
 *  */
    @Test
    public void testConsumeHexSequence_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'\u0000', '\u0000'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:308) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: bufferUp();
 *  */
    @Test
    public void testConsumeHexSequence_ThrowIllegalArgumentException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:305) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = charBuf[bufPos];
 *  */
    @Test
    public void testConsumeHexSequence_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'c'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:308) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = charBuf[bufPos];
 *  */
    @Test
    public void testConsumeHexSequence_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'C'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:308) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return cacheString(charBuf, stringCache, start, bufPos - start);
 *  */
    @Test
    public void testConsumeHexSequence_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'3'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 51 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:448)
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:314) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = charBuf[bufPos];
 *  */
    @Test
    public void testConsumeHexSequence_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:308) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testConsumeHexSequence_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:305) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cacheString(charBuf, stringCache, start, bufPos - start);
 *  */
    @Test
    public void testConsumeHexSequence_ThrowNullPointerException_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'2'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:447)
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:314) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testConsumeHexSequence_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:305) */
        characterReader.consumeHexSequence();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method consumeHexSequence()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.CharacterReader}
     * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
     */
    @Test
    public void testConsumeHexSequence() {
        CharacterReader characterReader = new CharacterReader("ab");
        
        String actual = characterReader.consumeHexSequence();
        
        String expected = "ab";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for consumeHexSequence
    
    public void testConsumeHexSequence_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.rewindToMark
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method rewindToMark()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#rewindToMark()}
 *  */
    @Test
    public void testRewindToMark() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufMark", 1);
        
        characterReader.rewindToMark();
        
        int finalCharacterReaderBufPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        
        assertEquals(1, finalCharacterReaderBufPos);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.nextIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextIndexOf(java.lang.CharSequence)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testNextIndexOf_ReturnNegative1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        String string = " ";
        
        int actual = characterReader.nextIndexOf(string);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.iterates iterate the loop {@code for(int offset = bufPos; offset < bufLength; offset++)} once
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testNextIndexOf_PrefixIncrementOffsetGreaterOrEqualBufLengthAndStartCharEqualsOffsetOfCharBuf() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        String string = "_";
        
        int actual = characterReader.nextIndexOf(string);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.iterates iterate the loop {@code for(int offset = bufPos; offset < bufLength; offset++)} once
 *  */
    @Test
    public void testNextIndexOf_IEqualsLast() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        String string = " ";
        
        int actual = characterReader.nextIndexOf(string);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextIndexOf(java.lang.CharSequence)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: char startChar = seq.charAt(0);
 *  */
    @Test
    public void testNextIndexOf_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        String string = "";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.nextIndexOf] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:147) */
        characterReader.nextIndexOf(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.iterates iterate the loop {@code for(int offset = bufPos; offset < bufLength; offset++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: startChar != charBuf[offset]
 *  */
    @Test
    public void testNextIndexOf_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.nextIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:150) */
        characterReader.nextIndexOf(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.iterates iterate the loop {@code for(int offset = bufPos; offset < bufLength; offset++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(++offset < bufLength && startChar != charBuf[offset])
 *  */
    @Test
    public void testNextIndexOf_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        String string = "_";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.nextIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:151) */
        characterReader.nextIndexOf(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.iterates iterate the loop {@code for(int offset = bufPos; offset < bufLength; offset++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(++offset < bufLength && startChar != charBuf[offset])
 *  */
    @Test
    public void testNextIndexOf_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        String string = "_";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.nextIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:151) */
        characterReader.nextIndexOf(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char startChar = seq.charAt(0);
 *  */
    @Test
    public void testNextIndexOf_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.nextIndexOf] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:147) */
        characterReader.nextIndexOf(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testNextIndexOf_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.nextIndexOf] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:145) */
        characterReader.nextIndexOf(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.iterates iterate the loop {@code for(int offset = bufPos; offset < bufLength; offset++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: startChar != charBuf[offset]
 *  */
    @Test
    public void testNextIndexOf_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.nextIndexOf] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:150) */
        characterReader.nextIndexOf(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nextIndexOf(java.lang.CharSequence)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.invokes org.jsoup.parser.CharacterReader#bufferUp()
 * @utbot.throwsException {@link org.jsoup.UncheckedIOException} in: bufferUp();
 *  */
    @Test(expected = UncheckedIOException.class)
    public void testNextIndexOf_ThrowUncheckedIOException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", -1879048104);
        setField(reader, "java.io.BufferedReader", "nextChar", -1879048104);
        setField(reader, "java.io.BufferedReader", "markedChar", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 1);
        
        characterReader.nextIndexOf(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method nextIndexOf(java.lang.CharSequence)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.CharacterReader}
     * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
     */
    @Test
    public void testNextIndexOfWithNonEmptyString() {
        CharacterReader characterReader = new CharacterReader("abc");
        
        int actual = characterReader.nextIndexOf("\n\t\r?");
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region Errors report for nextIndexOf
    
    public void testNextIndexOf_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.nextIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextIndexOf(char)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(char)}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testNextIndexOf_ReturnNegative11() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        int actual = characterReader.nextIndexOf(' ');
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(char)}
 * @utbot.iterates iterate the loop {@code for(int i = bufPos; i < bufLength; i++)} once
 *  */
    @Test
    public void testNextIndexOf_CEqualsIOfCharBuf() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        int actual = characterReader.nextIndexOf(' ');
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(char)}
 * @utbot.iterates iterate the loop {@code for(int i = bufPos; i < bufLength; i++)} once
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testNextIndexOf_CNotEqualsIOfCharBuf() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        int actual = characterReader.nextIndexOf('_');
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextIndexOf(char)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(char)}
 * @utbot.iterates iterate the loop {@code for(int i = bufPos; i < bufLength; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: c == charBuf[i]
 *  */
    @Test
    public void testNextIndexOf_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.nextIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:132) */
        characterReader.nextIndexOf(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: bufferUp();
 *  */
    @Test
    public void testNextIndexOf_ThrowIllegalArgumentException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -246);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -246);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.nextIndexOf] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:130) */
        characterReader.nextIndexOf(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(char)}
 * @utbot.iterates iterate the loop {@code for(int i = bufPos; i < bufLength; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: c == charBuf[i]
 *  */
    @Test
    public void testNextIndexOf_ThrowNullPointerException1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.nextIndexOf] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:132) */
        characterReader.nextIndexOf(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testNextIndexOf_ThrowNullPointerException_11() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.nextIndexOf] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:130) */
        characterReader.nextIndexOf(' ');
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nextIndexOf(char)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(char)}
 * @utbot.invokes org.jsoup.parser.CharacterReader#bufferUp()
 * @utbot.throwsException {@link org.jsoup.UncheckedIOException} in: bufferUp();
 *  */
    @Test(expected = UncheckedIOException.class)
    public void testNextIndexOf_ThrowUncheckedIOException1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 1613762568);
        setField(reader, "java.io.BufferedReader", "nextChar", 1613762568);
        setField(reader, "java.io.BufferedReader", "markedChar", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 1);
        
        characterReader.nextIndexOf(' ');
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method nextIndexOf(char)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.CharacterReader}
     * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(char)}
     */
    @Test
    public void testNextIndexOf() {
        CharacterReader characterReader = new CharacterReader("abc");
        
        int actual = characterReader.nextIndexOf('~');
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region Errors report for nextIndexOf
    
    public void testNextIndexOf_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.matchesLetter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesLetter()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesLetter()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMatchesLetter_ReturnFalse() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        boolean actual = characterReader.matchesLetter();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesLetter()}
 * @utbot.returnsFrom {@code return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);}
 *  */
    @Test
    public void testMatchesLetter_CLessThanAAndCLessOrEqualZOrCLessThanAAndCLessOrEqualZOrCharacterIsLetter() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' ', 'a'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 1);
        
        boolean actual = characterReader.matchesLetter();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesLetter()}
 * @utbot.returnsFrom {@code return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);}
 *  */
    @Test
    public void testMatchesLetter_CLessThanAAndCLessOrEqualZOrCLessThanAAndCLessOrEqualZOrCharacterIsLetter_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'A'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        boolean actual = characterReader.matchesLetter();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesLetter()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesLetter()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = charBuf[bufPos];
 *  */
    @Test
    public void testMatchesLetter_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesLetter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:383) */
        characterReader.matchesLetter();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesLetter()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: isEmpty()
 *  */
    @Test
    public void testMatchesLetter_ThrowIllegalArgumentException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesLetter] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:381) */
        characterReader.matchesLetter();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesLetter()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = charBuf[bufPos];
 *  */
    @Test
    public void testMatchesLetter_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesLetter] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:383) */
        characterReader.matchesLetter();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesLetter()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isEmpty()
 *  */
    @Test
    public void testMatchesLetter_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesLetter] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:381) */
        characterReader.matchesLetter();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesLetter()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testMatchesLetter_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesLetter] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:381) */
        characterReader.matchesLetter();
    }
    ///endregion
    
    ///region Errors report for matchesLetter
    
    public void testMatchesLetter_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.isEmptyNoBufferUp
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmptyNoBufferUp()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#isEmptyNoBufferUp()}
 * @utbot.returnsFrom {@code return bufPos >= bufLength;}
 *  */
    @Test
    public void testIsEmptyNoBufferUp_BufPosLessThanBufLength() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Method isEmptyNoBufferUpMethod = characterReaderClazz.getDeclaredMethod("isEmptyNoBufferUp");
        isEmptyNoBufferUpMethod.setAccessible(true);
        java.lang.Object[] isEmptyNoBufferUpMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) isEmptyNoBufferUpMethod.invoke(characterReader, isEmptyNoBufferUpMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#isEmptyNoBufferUp()}
 * @utbot.returnsFrom {@code return bufPos >= bufLength;}
 *  */
    @Test
    public void testIsEmptyNoBufferUp_BufPosGreaterOrEqualBufLength() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Method isEmptyNoBufferUpMethod = characterReaderClazz.getDeclaredMethod("isEmptyNoBufferUp");
        isEmptyNoBufferUpMethod.setAccessible(true);
        java.lang.Object[] isEmptyNoBufferUpMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) isEmptyNoBufferUpMethod.invoke(characterReader, isEmptyNoBufferUpMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeToAnySorted
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeToAnySorted([C)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAnySorted(char[])}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.returnsFrom {@code return bufPos > start ? cacheString(charBuf, stringCache, start, bufPos - start) : "";}
 *  */
    @Test
    public void testConsumeToAnySorted_BufPosLessThanRemaining() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        char[] charArray = {' '};
        
        String actual = characterReader.consumeToAnySorted(charArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAnySorted(char[])}
 * @utbot.returnsFrom {@code return bufPos > start ? cacheString(charBuf, stringCache, start, bufPos - start) : "";}
 *  */
    @Test
    public void testConsumeToAnySorted_BufPosGreaterOrEqualRemaining() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        String actual = characterReader.consumeToAnySorted(null);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeToAnySorted([C)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAnySorted(char[])}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: Arrays.binarySearch(chars, val[bufPos]) >= 0
 *  */
    @Test
    public void testConsumeToAnySorted_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        char[] charArray = {' '};
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAnySorted] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeToAnySorted(CharacterReader.java:219) */
        characterReader.consumeToAnySorted(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAnySorted(char[])}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: Arrays.binarySearch(chars, val[bufPos]) >= 0
 *  */
    @Test
    public void testConsumeToAnySorted_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAnySorted] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeToAnySorted(CharacterReader.java:219) */
        characterReader.consumeToAnySorted(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAnySorted(char[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: bufferUp();
 *  */
    @Test
    public void testConsumeToAnySorted_ThrowIllegalArgumentException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -254);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -254);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAnySorted] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeToAnySorted(CharacterReader.java:213) */
        characterReader.consumeToAnySorted(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAnySorted(char[])}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: Arrays.binarySearch(chars, val[bufPos]) >= 0
 *  */
    @Test
    public void testConsumeToAnySorted_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAnySorted] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeToAnySorted(CharacterReader.java:219) */
        characterReader.consumeToAnySorted(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAnySorted(char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testConsumeToAnySorted_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAnySorted] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeToAnySorted(CharacterReader.java:213) */
        characterReader.consumeToAnySorted(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAnySorted(char[])}
 * @utbot.executesCondition {@code (bufPos > start): True}
 * @utbot.invokes org.jsoup.parser.CharacterReader#cacheString(char[],java.lang.String[],int,int)
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cacheString(charBuf, stringCache, start, bufPos - start)
 *  */
    @Test
    public void testConsumeToAnySorted_ThrowNullPointerException_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'p'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        char[] charArray = {'o'};
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAnySorted] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:447)
            org.jsoup.parser.CharacterReader.consumeToAnySorted(CharacterReader.java:224) */
        characterReader.consumeToAnySorted(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAnySorted(char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testConsumeToAnySorted_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 1);
        setField(reader, "java.io.BufferedReader", "nextChar", 1);
        setField(reader, "java.io.BufferedReader", "readAheadLimit", 1);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 26);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 26);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAnySorted] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.read(BufferedReader.java:280)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.skip(BufferedReader.java:411)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeToAnySorted(CharacterReader.java:213) */
        characterReader.consumeToAnySorted(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method consumeToAnySorted([C)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.CharacterReader}
     * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAnySorted(char[])}
     */
    @Test
    public void testConsumeToAnySortedWithNonEmptyPrimitiveArray() {
        CharacterReader characterReader = new CharacterReader("abc");
        char[] charArray = {'\u0001', '\u0001', '\u0001'};
        
        String actual = characterReader.consumeToAnySorted(charArray);
        
        String expected = "abc";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for consumeToAnySorted
    
    public void testConsumeToAnySorted_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.matchesAnySorted
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesAnySorted([C)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAnySorted(char[])}
 * @utbot.invokes {@link java.util.Arrays#binarySearch(char[],char)}
 * @utbot.returnsFrom {@code return !isEmpty() && Arrays.binarySearch(seq, charBuf[bufPos]) >= 0;}
 *  */
    @Test
    public void testMatchesAnySorted_ArraysBinarySearch() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        char[] charArray = {};
        
        boolean actual = characterReader.matchesAnySorted(charArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAnySorted(char[])}
 * @utbot.returnsFrom {@code return !isEmpty() && Arrays.binarySearch(seq, charBuf[bufPos]) >= 0;}
 *  */
    @Test
    public void testMatchesAnySorted_ReturnNotIsEmptyAndArraysBinarySearchLessThanZero() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        boolean actual = characterReader.matchesAnySorted(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesAnySorted([C)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAnySorted(char[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return !isEmpty() && Arrays.binarySearch(seq, charBuf[bufPos]) >= 0;
 *  */
    @Test
    public void testMatchesAnySorted_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesAnySorted] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.matchesAnySorted(CharacterReader.java:377) */
        characterReader.matchesAnySorted(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAnySorted(char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testMatchesAnySorted_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesAnySorted] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.matchesAnySorted(CharacterReader.java:376) */
        characterReader.matchesAnySorted(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAnySorted(char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !isEmpty() && Arrays.binarySearch(seq, charBuf[bufPos]) >= 0;
 *  */
    @Test
    public void testMatchesAnySorted_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesAnySorted] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matchesAnySorted(CharacterReader.java:377) */
        characterReader.matchesAnySorted(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method matchesAnySorted([C)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAnySorted(char[])}
 * @utbot.invokes org.jsoup.parser.CharacterReader#bufferUp()
 * @utbot.throwsException {@link org.jsoup.UncheckedIOException} in: bufferUp();
 *  */
    @Test(expected = UncheckedIOException.class)
    public void testMatchesAnySorted_ThrowUncheckedIOException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 268435538);
        setField(reader, "java.io.BufferedReader", "nextChar", 268435538);
        setField(reader, "java.io.BufferedReader", "markedChar", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 2);
        
        characterReader.matchesAnySorted(null);
    }
    ///endregion
    
    ///region Errors report for matchesAnySorted
    
    public void testMatchesAnySorted_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeTagName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method consumeTagName()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.executesCondition {@code (bufPos > start): True}
 * @utbot.invokes org.jsoup.parser.CharacterReader#bufferUp()
 * @utbot.invokes org.jsoup.parser.CharacterReader#cacheString(char[],java.lang.String[],int,int)
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.returnsFrom {@code return bufPos > start ? cacheString(charBuf, stringCache, start, bufPos - start) : "";}
 *  */
    @Test
    public void testConsumeTagName_BufPosGreaterThanStart() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeTagName();
        
        String expected = "!";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderBufPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        
        assertEquals(1, finalCharacterReaderBufPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method consumeTagName()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     org.jsoup.parser.CharacterReader#bufferUp() once
    /// execute conditions:
    ///     {@code (bufPos > start): False}
    /// return from: {@code return bufPos > start ? cacheString(charBuf, stringCache, start, bufPos - start) : "";}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.returnsFrom {@code return bufPos > start ? cacheString(charBuf, stringCache, start, bufPos - start) : "";}
 *  */
    @Test
    public void testConsumeTagName_CEqualsChar() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        String actual = characterReader.consumeTagName();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.returnsFrom {@code return bufPos > start ? cacheString(charBuf, stringCache, start, bufPos - start) : "";}
 *  */
    @Test
    public void testConsumeTagName_CEqualsChar_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {
            '\f', '\u0000', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        String actual = characterReader.consumeTagName();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.returnsFrom {@code return bufPos > start ? cacheString(charBuf, stringCache, start, bufPos - start) : "";}
 *  */
    @Test
    public void testConsumeTagName_CEqualsChar_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'/'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        String actual = characterReader.consumeTagName();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.returnsFrom {@code return bufPos > start ? cacheString(charBuf, stringCache, start, bufPos - start) : "";}
 *  */
    @Test
    public void testConsumeTagName_CEqualsTokeniserStateNullChar() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {
            '\u0000', '\u0000', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        String actual = characterReader.consumeTagName();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.returnsFrom {@code return bufPos > start ? cacheString(charBuf, stringCache, start, bufPos - start) : "";}
 *  */
    @Test
    public void testConsumeTagName_CEqualsChar_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'>'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        String actual = characterReader.consumeTagName();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.returnsFrom {@code return bufPos > start ? cacheString(charBuf, stringCache, start, bufPos - start) : "";}
 *  */
    @Test
    public void testConsumeTagName_CEqualsChar_4() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {
            '\r', '\u0000', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        String actual = characterReader.consumeTagName();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.returnsFrom {@code return bufPos > start ? cacheString(charBuf, stringCache, start, bufPos - start) : "";}
 *  */
    @Test
    public void testConsumeTagName_CEqualsChar_5() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {
            '\n', '\u0000', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        String actual = characterReader.consumeTagName();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.returnsFrom {@code return bufPos > start ? cacheString(charBuf, stringCache, start, bufPos - start) : "";}
 *  */
    @Test
    public void testConsumeTagName_CEqualsChar_6() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {
            '\t', '\u0000', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        String actual = characterReader.consumeTagName();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.returnsFrom {@code return bufPos > start ? cacheString(charBuf, stringCache, start, bufPos - start) : "";}
 *  */
    @Test
    public void testConsumeTagName_BufPosGreaterOrEqualRemaining() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        String actual = characterReader.consumeTagName();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeTagName()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final char c = val[bufPos];
 *  */
    @Test
    public void testConsumeTagName_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTagName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.consumeTagName(CharacterReader.java:253) */
        characterReader.consumeTagName();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: bufferUp();
 *  */
    @Test
    public void testConsumeTagName_ThrowIllegalArgumentException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTagName] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeTagName(CharacterReader.java:247) */
        characterReader.consumeTagName();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final char c = val[bufPos];
 *  */
    @Test
    public void testConsumeTagName_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTagName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeTagName(CharacterReader.java:253) */
        characterReader.consumeTagName();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.executesCondition {@code (bufPos > start): True}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: cacheString(charBuf, stringCache, start, bufPos - start)
 *  */
    @Test
    public void testConsumeTagName_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTagName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 33 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:448)
            org.jsoup.parser.CharacterReader.consumeTagName(CharacterReader.java:259) */
        characterReader.consumeTagName();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final char c = val[bufPos];
 *  */
    @Test
    public void testConsumeTagName_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTagName] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeTagName(CharacterReader.java:253) */
        characterReader.consumeTagName();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testConsumeTagName_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTagName] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeTagName(CharacterReader.java:247) */
        characterReader.consumeTagName();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.executesCondition {@code (bufPos > start): True}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cacheString(charBuf, stringCache, start, bufPos - start)
 *  */
    @Test
    public void testConsumeTagName_ThrowNullPointerException_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTagName] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:447)
            org.jsoup.parser.CharacterReader.consumeTagName(CharacterReader.java:259) */
        characterReader.consumeTagName();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testConsumeTagName_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTagName] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeTagName(CharacterReader.java:247) */
        characterReader.consumeTagName();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method consumeTagName()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.invokes org.jsoup.parser.CharacterReader#bufferUp()
 * @utbot.throwsException {@link org.jsoup.UncheckedIOException} in: bufferUp();
 *  */
    @Test(expected = UncheckedIOException.class)
    public void testConsumeTagName_ThrowUncheckedIOException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 21634272);
        setField(reader, "java.io.BufferedReader", "nextChar", 21634272);
        setField(reader, "java.io.BufferedReader", "markedChar", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 6);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 6);
        
        characterReader.consumeTagName();
    }
    ///endregion
    
    ///region Errors report for consumeTagName
    
    public void testConsumeTagName_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.matchConsume
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchConsume(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchConsume(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testMatchConsume_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchConsume] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.matchConsume(CharacterReader.java:395) */
        characterReader.matchConsume(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchConsume(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testMatchConsume_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchConsume] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.matchConsume(CharacterReader.java:395) */
        characterReader.matchConsume(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method matchConsume(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchConsume(java.lang.String)}
 * @utbot.invokes org.jsoup.parser.CharacterReader#bufferUp()
 * @utbot.throwsException {@link org.jsoup.UncheckedIOException} in: bufferUp();
 *  */
    @Test(expected = UncheckedIOException.class)
    public void testMatchConsume_ThrowUncheckedIOException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 788);
        setField(reader, "java.io.BufferedReader", "nextChar", 788);
        setField(reader, "java.io.BufferedReader", "markedChar", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 64);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 64);
        
        characterReader.matchConsume(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method matchConsume(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.CharacterReader}
     * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchConsume(java.lang.String)}
     */
    @Test
    public void testMatchConsumeReturnsFalseWithNonEmptyString() {
        CharacterReader characterReader = new CharacterReader("abc");
        
        boolean actual = characterReader.matchConsume("-\uFFF43");
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region Errors report for matchConsume
    
    public void testMatchConsume_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 13 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeToEnd
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeToEnd()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.returnsFrom {@code return data;}
 *  */
    @Test
    public void testConsumeToEnd_ReturnData() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeToEnd();
        
        String expected = " ";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderBufPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        
        assertEquals(1, finalCharacterReaderBufPos);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.returnsFrom {@code return data;}
 *  */
    @Test
    public void testConsumeToEnd_ReturnData_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        java.lang.String[] stringCache = new java.lang.String[10];
        String string = "";
        stringCache[0] = string;
        String string1 = "";
        stringCache[1] = string1;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeToEnd();
        
        String expected = "!";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderBufPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache, 2));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache1, 3));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache2, 4));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache3, 5));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache4, 6));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache5, 7));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache6, 8));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache7, 9));
        
        assertEquals(1, finalCharacterReaderBufPos);
        
        assertNull(finalCharacterReaderStringCache2);
        
        assertNull(finalCharacterReaderStringCache3);
        
        assertNull(finalCharacterReaderStringCache4);
        
        assertNull(finalCharacterReaderStringCache5);
        
        assertNull(finalCharacterReaderStringCache6);
        
        assertNull(finalCharacterReaderStringCache7);
        
        assertNull(finalCharacterReaderStringCache8);
        
        assertNull(finalCharacterReaderStringCache9);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.returnsFrom {@code return data;}
 *  */
    @Test
    public void testConsumeToEnd_ReturnData_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        String actual = characterReader.consumeToEnd();
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderBufPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        
        assertEquals(-255, finalCharacterReaderBufPos);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.returnsFrom {@code return data;}
 *  */
    @Test
    public void testConsumeToEnd_ReturnData_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = new char[40];
        charBuf[0] = ' ';
        charBuf[1] = ' ';
        charBuf[2] = ' ';
        charBuf[3] = ' ';
        charBuf[4] = ' ';
        charBuf[5] = ' ';
        charBuf[6] = ' ';
        charBuf[7] = ' ';
        charBuf[8] = ' ';
        charBuf[9] = ' ';
        charBuf[10] = ' ';
        charBuf[11] = ' ';
        charBuf[12] = ' ';
        charBuf[13] = ' ';
        charBuf[14] = ' ';
        charBuf[15] = ' ';
        charBuf[16] = ' ';
        charBuf[17] = ' ';
        charBuf[18] = ' ';
        charBuf[19] = ' ';
        charBuf[20] = ' ';
        charBuf[21] = ' ';
        charBuf[22] = ' ';
        charBuf[23] = ' ';
        charBuf[24] = ' ';
        charBuf[25] = ' ';
        charBuf[26] = ' ';
        charBuf[27] = ' ';
        charBuf[28] = ' ';
        charBuf[29] = ' ';
        charBuf[30] = ' ';
        charBuf[31] = ' ';
        charBuf[32] = ' ';
        charBuf[33] = ' ';
        charBuf[34] = ' ';
        charBuf[35] = ' ';
        charBuf[36] = ' ';
        charBuf[37] = ' ';
        charBuf[38] = ' ';
        charBuf[39] = ' ';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 40);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 4);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 3);
        
        String actual = characterReader.consumeToEnd();
        
        String expected = "                                     ";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderBufPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        
        assertEquals(40, finalCharacterReaderBufPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeToEnd()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: bufferUp();
 *  */
    @Test
    public void testConsumeToEnd_ThrowIllegalArgumentException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToEnd] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:263) */
        characterReader.consumeToEnd();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: String data = cacheString(charBuf, stringCache, bufPos, bufLength - bufPos);
 *  */
    @Test
    public void testConsumeToEnd_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToEnd] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:448)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:264) */
        characterReader.consumeToEnd();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: String data = cacheString(charBuf, stringCache, bufPos, bufLength - bufPos);
 *  */
    @Test
    public void testConsumeToEnd_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -5);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -6);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToEnd] produces [java.lang.ArrayIndexOutOfBoundsException: Index -6 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:443)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:264) */
        characterReader.consumeToEnd();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testConsumeToEnd_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToEnd] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:263) */
        characterReader.consumeToEnd();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String data = cacheString(charBuf, stringCache, bufPos, bufLength - bufPos);
 *  */
    @Test
    public void testConsumeToEnd_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToEnd] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:447)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:264) */
        characterReader.consumeToEnd();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String data = cacheString(charBuf, stringCache, bufPos, bufLength - bufPos);
 *  */
    @Test
    public void testConsumeToEnd_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -2);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToEnd] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:443)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:264) */
        characterReader.consumeToEnd();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String data = cacheString(charBuf, stringCache, bufPos, bufLength - bufPos);
 *  */
    @Test
    public void testConsumeToEnd_ThrowNullPointerException_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 12);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToEnd] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:435)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:264) */
        characterReader.consumeToEnd();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method consumeToEnd()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.CharacterReader}
     * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
     */
    @Test
    public void testConsumeToEnd() {
        CharacterReader characterReader = new CharacterReader("ab");
        
        String actual = characterReader.consumeToEnd();
        
        String expected = "ab";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for consumeToEnd
    
    public void testConsumeToEnd_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
        // 2 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.matchesDigit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method matchesDigit()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link org.jsoup.parser.CharacterReader#isEmpty()} twice
    /// return from: {@code return (c >= '0' && c <= '9');}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesDigit()}
 * @utbot.returnsFrom {@code return (c >= '0' && c <= '9');}
 *  */
    @Test
    public void testMatchesDigit_CLessThan0AndCGreaterThan9() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {':'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        boolean actual = characterReader.matchesDigit();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesDigit()}
 * @utbot.returnsFrom {@code return (c >= '0' && c <= '9');}
 *  */
    @Test
    public void testMatchesDigit_CLessThan0AndCGreaterThan9_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' ', '/'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 1);
        
        boolean actual = characterReader.matchesDigit();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesDigit()}
 * @utbot.returnsFrom {@code return (c >= '0' && c <= '9');}
 *  */
    @Test
    public void testMatchesDigit_CGreaterOrEqual0AndCLessOrEqual9() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'0'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        boolean actual = characterReader.matchesDigit();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method matchesDigit()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesDigit()}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#isEmpty()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMatchesDigit_CharacterReaderIsEmpty() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        boolean actual = characterReader.matchesDigit();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesDigit()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesDigit()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = charBuf[bufPos];
 *  */
    @Test
    public void testMatchesDigit_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesDigit] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.matchesDigit(CharacterReader.java:390) */
        characterReader.matchesDigit();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesDigit()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: isEmpty()
 *  */
    @Test
    public void testMatchesDigit_ThrowIllegalArgumentException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesDigit] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.CharacterReader.matchesDigit(CharacterReader.java:388) */
        characterReader.matchesDigit();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesDigit()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = charBuf[bufPos];
 *  */
    @Test
    public void testMatchesDigit_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesDigit] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matchesDigit(CharacterReader.java:390) */
        characterReader.matchesDigit();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesDigit()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isEmpty()
 *  */
    @Test
    public void testMatchesDigit_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesDigit] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.CharacterReader.matchesDigit(CharacterReader.java:388) */
        characterReader.matchesDigit();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesDigit()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isEmpty()
 *  */
    @Test
    public void testMatchesDigit_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesDigit] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.CharacterReader.matchesDigit(CharacterReader.java:388) */
        characterReader.matchesDigit();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method matchesDigit()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesDigit()}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#isEmpty()}
 * @utbot.throwsException {@link org.jsoup.UncheckedIOException} when: isEmpty()
 *  */
    @Test(expected = UncheckedIOException.class)
    public void testMatchesDigit_ThrowUncheckedIOException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 3);
        setField(reader, "java.io.BufferedReader", "nextChar", 3);
        setField(reader, "java.io.BufferedReader", "readAheadLimit", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 2);
        
        characterReader.matchesDigit();
    }
    ///endregion
    
    ///region Errors report for matchesDigit
    
    public void testMatchesDigit_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.containsIgnoreCase
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method containsIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#containsIgnoreCase(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#toLowerCase(java.util.Locale)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String loScan = seq.toLowerCase(Locale.ENGLISH);
 *  */
    @Test
    public void testContainsIgnoreCase_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.containsIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.containsIgnoreCase(CharacterReader.java:415) */
        characterReader.containsIgnoreCase(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method containsIgnoreCase(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.CharacterReader}
     * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#containsIgnoreCase(java.lang.String)}
     */
    @Test
    public void testContainsIgnoreCaseReturnsFalseWithNonEmptyString() {
        CharacterReader characterReader = new CharacterReader("abc");
        
        boolean actual = characterReader.containsIgnoreCase("-\uFFF43");
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method containsIgnoreCase(java.lang.String)
    
    @Test
    public void testContainsIgnoreCase1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String string = "";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.containsIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:145)
            org.jsoup.parser.CharacterReader.containsIgnoreCase(CharacterReader.java:417) */
        characterReader.containsIgnoreCase(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeToAny
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeToAny([C)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.executesCondition {@code (bufPos > start): False}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.returnsFrom {@code return bufPos > start ? cacheString(charBuf, stringCache, start, bufPos - start) : "";}
 *  */
    @Test
    public void testConsumeToAny_BufPosLessOrEqualStart() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        char[] charArray = {'_', ' '};
        
        String actual = characterReader.consumeToAny(charArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.executesCondition {@code (bufPos > start): False}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.returnsFrom {@code return bufPos > start ? cacheString(charBuf, stringCache, start, bufPos - start) : "";}
 *  */
    @Test
    public void testConsumeToAny_BufPosLessOrEqualStart_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        char[] charArray = {' '};
        
        String actual = characterReader.consumeToAny(charArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.executesCondition {@code (OUTER: while (bufPos < remaining) {
 *     for (char c : chars) {
 *         if (val[bufPos] == c)
 *             break OUTER;
 *     }
 *     bufPos++;
 * }): False}
 * @utbot.executesCondition {@code (bufPos > start): True}
 * @utbot.invokes org.jsoup.parser.CharacterReader#cacheString(char[],java.lang.String[],int,int)
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.returnsFrom {@code return bufPos > start ? cacheString(charBuf, stringCache, start, bufPos - start) : "";}
 *  */
    @Test
    public void testConsumeToAny_BufPosGreaterThanStart() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        char[] charArray = {'_'};
        
        String actual = characterReader.consumeToAny(charArray);
        
        String expected = " ";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderBufPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        
        assertEquals(1, finalCharacterReaderBufPos);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.executesCondition {@code (OUTER: while (bufPos < remaining) {
 *     for (char c : chars) {
 *         if (val[bufPos] == c)
 *             break OUTER;
 *     }
 *     bufPos++;
 * }): False}
 * @utbot.executesCondition {@code (bufPos > start): False}
 * @utbot.returnsFrom {@code return bufPos > start ? cacheString(charBuf, stringCache, start, bufPos - start) : "";}
 *  */
    @Test
    public void testConsumeToAny_BufPosLessOrEqualStart_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        String actual = characterReader.consumeToAny(null);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeToAny([C)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: val[bufPos] == c
 *  */
    @Test
    public void testConsumeToAny_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        char[] charArray = {' '};
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAny] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:203) */
        characterReader.consumeToAny(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.executesCondition {@code (OUTER: while (bufPos < remaining) {
 *     for (char c : chars) {
 *         if (val[bufPos] == c)
 *             break OUTER;
 *     }
 *     bufPos++;
 * }): False}
 * @utbot.executesCondition {@code (bufPos > start): True}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: cacheString(charBuf, stringCache, start, bufPos - start)
 *  */
    @Test
    public void testConsumeToAny_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        char[] charArray = {'_'};
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAny] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:448)
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:209) */
        characterReader.consumeToAny(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: bufferUp();
 *  */
    @Test
    public void testConsumeToAny_ThrowIllegalArgumentException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -254);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -254);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAny] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:196) */
        characterReader.consumeToAny(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(char c: chars)
 *  */
    @Test
    public void testConsumeToAny_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAny] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:202) */
        characterReader.consumeToAny(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: val[bufPos] == c
 *  */
    @Test
    public void testConsumeToAny_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        char[] charArray = {' '};
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAny] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:203) */
        characterReader.consumeToAny(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.executesCondition {@code (OUTER: while (bufPos < remaining) {
 *     for (char c : chars) {
 *         if (val[bufPos] == c)
 *             break OUTER;
 *     }
 *     bufPos++;
 * }): False}
 * @utbot.executesCondition {@code (bufPos > start): True}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cacheString(charBuf, stringCache, start, bufPos - start)
 *  */
    @Test
    public void testConsumeToAny_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        char[] charArray = {'_'};
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAny] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:447)
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:209) */
        characterReader.consumeToAny(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testConsumeToAny_ThrowNullPointerException_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAny] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:196) */
        characterReader.consumeToAny(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testConsumeToAny_ThrowNullPointerException_4() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAny] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:196) */
        characterReader.consumeToAny(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testConsumeToAny_ThrowNullPointerException_5() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        StringReader reader = ((StringReader) createInstance("java.io.StringReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAny] produces [java.lang.NullPointerException]
            java.base/java.io.StringReader.skip(StringReader.java:132)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:196) */
        characterReader.consumeToAny(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method consumeToAny([C)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.invokes org.jsoup.parser.CharacterReader#bufferUp()
 * @utbot.throwsException {@link org.jsoup.UncheckedIOException} in: bufferUp();
 *  */
    @Test(expected = UncheckedIOException.class)
    public void testConsumeToAny_ThrowUncheckedIOException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 134217924);
        setField(reader, "java.io.BufferedReader", "nextChar", 134217924);
        setField(reader, "java.io.BufferedReader", "markedChar", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 2);
        
        characterReader.consumeToAny(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method consumeToAny([C)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.CharacterReader}
     * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
     */
    @Test
    public void testConsumeToAnyWithNonEmptyPrimitiveArray() {
        CharacterReader characterReader = new CharacterReader("abc");
        char[] charArray = {'?', '?', '?'};
        
        String actual = characterReader.consumeToAny(charArray);
        
        String expected = "abc";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for consumeToAny
    
    public void testConsumeToAny_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeTo(char)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#nextIndexOf(char)}
 * @utbot.invokes org.jsoup.parser.CharacterReader#cacheString(char[],java.lang.String[],int,int)
 * @utbot.returnsFrom {@code return consumed;}
 *  */
    @Test
    public void testConsumeTo_CharacterReaderCacheString() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        String actual = characterReader.consumeTo(' ');
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeTo(char)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int offset = nextIndexOf(c);
 *  */
    @Test
    public void testConsumeTo_ThrowIllegalArgumentException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -246);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -246);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:130)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:169) */
        characterReader.consumeTo(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int offset = nextIndexOf(c);
 *  */
    @Test
    public void testConsumeTo_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:132)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:169) */
        characterReader.consumeTo(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int offset = nextIndexOf(c);
 *  */
    @Test
    public void testConsumeTo_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:132)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:169) */
        characterReader.consumeTo('_');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return consumeToEnd();
 *  */
    @Test
    public void testConsumeTo_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'\u0000'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -2147483646);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 2147483639);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 2147483638);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483638 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:443)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:264)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:175) */
        characterReader.consumeTo(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int offset = nextIndexOf(c);
 *  */
    @Test
    public void testConsumeTo_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:130)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:169) */
        characterReader.consumeTo(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.invokes org.jsoup.parser.CharacterReader#cacheString(char[],java.lang.String[],int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String consumed = cacheString(charBuf, stringCache, bufPos, offset);
 *  */
    @Test
    public void testConsumeTo_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'!', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:447)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:171) */
        characterReader.consumeTo(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return consumeToEnd();
 *  */
    @Test
    public void testConsumeTo_ThrowNullPointerException_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", Integer.MIN_VALUE);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 2147483644);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 2147483636);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:443)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:264)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:175) */
        characterReader.consumeTo(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int offset = nextIndexOf(c);
 *  */
    @Test
    public void testConsumeTo_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:130)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:169) */
        characterReader.consumeTo(' ');
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method consumeTo(char)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#nextIndexOf(char)}
 * @utbot.throwsException {@link org.jsoup.UncheckedIOException} in: int offset = nextIndexOf(c);
 *  */
    @Test(expected = UncheckedIOException.class)
    public void testConsumeTo_ThrowUncheckedIOException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        Object lock = createInstance("java.lang.Object");
        setField(sd, "java.io.Reader", "lock", lock);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "markedChar", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 8);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 8);
        
        characterReader.consumeTo(' ');
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method consumeTo(char)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.CharacterReader}
     * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
     */
    @Test
    public void testConsumeTo() {
        CharacterReader characterReader = new CharacterReader("abc");
        
        String actual = characterReader.consumeTo('\uFFFD');
        
        String expected = "abc";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for consumeTo
    
    public void testConsumeTo_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeTo(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.invokes org.jsoup.parser.CharacterReader#cacheString(char[],java.lang.String[],int,int)
 * @utbot.returnsFrom {@code return consumed;}
 *  */
    @Test
    public void testConsumeTo_CharacterReaderCacheString1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        String string = " ";
        
        String actual = characterReader.consumeTo(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.returnsFrom {@code return consumeToEnd();}
 *  */
    @Test
    public void testConsumeTo_CharacterReaderConsumeToEnd() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        String string = " ";
        
        String actual = characterReader.consumeTo(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeTo(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: int offset = nextIndexOf(seq);
 *  */
    @Test
    public void testConsumeTo_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        String string = "";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:147)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:180) */
        characterReader.consumeTo(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int offset = nextIndexOf(seq);
 *  */
    @Test
    public void testConsumeTo_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        String string = "_";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:151)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:180) */
        characterReader.consumeTo(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int offset = nextIndexOf(seq);
 *  */
    @Test
    public void testConsumeTo_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' ', ' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 41);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 2);
        String string = "                                        ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:150)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:180) */
        characterReader.consumeTo(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int offset = nextIndexOf(seq);
 *  */
    @Test
    public void testConsumeTo_ThrowIllegalArgumentException1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:145)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:180) */
        characterReader.consumeTo(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return consumeToEnd();
 *  */
    @Test
    public void testConsumeTo_ThrowNullPointerException_11() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", Integer.MIN_VALUE);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 2147483644);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 2147483641);
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:443)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:264)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:186) */
        characterReader.consumeTo(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testConsumeTo_ThrowNullPointerException1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        StringReader reader = ((StringReader) createInstance("java.io.StringReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.NullPointerException]
            java.base/java.io.StringReader.skip(StringReader.java:132)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:145)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:180) */
        characterReader.consumeTo(((String) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method consumeTo(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.CharacterReader}
     * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
     */
    @Test
    public void testConsumeToWithNonEmptyString() {
        CharacterReader characterReader = new CharacterReader("abc");
        
        String actual = characterReader.consumeTo("-\uFFF43");
        
        String expected = "abc";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for consumeTo
    
    public void testConsumeTo_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.bufferUp
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method bufferUp()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#bufferUp()}
 * @utbot.executesCondition {@code (bufPos < bufSplitPoint): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testBufferUp_BufPosLessThanBufSplitPoint() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Method bufferUpMethod = characterReaderClazz.getDeclaredMethod("bufferUp");
        bufferUpMethod.setAccessible(true);
        java.lang.Object[] bufferUpMethodArguments = new java.lang.Object[0];
        bufferUpMethod.invoke(characterReader, bufferUpMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method bufferUp()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#bufferUp()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: reader.skip(bufPos);
 *  */
    @Test
    public void testBufferUp_ThrowIllegalArgumentException() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -207);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -207);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.bufferUp] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51) */
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Method bufferUpMethod = characterReaderClazz.getDeclaredMethod("bufferUp");
        bufferUpMethod.setAccessible(true);
        java.lang.Object[] bufferUpMethodArguments = new java.lang.Object[0];
        try {
            bufferUpMethod.invoke(characterReader, bufferUpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#bufferUp()}
 * @utbot.invokes {@link java.io.Reader#skip(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reader.skip(bufPos);
 *  */
    @Test
    public void testBufferUp_ThrowNullPointerException() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -207);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -207);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.bufferUp] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51) */
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Method bufferUpMethod = characterReaderClazz.getDeclaredMethod("bufferUp");
        bufferUpMethod.setAccessible(true);
        java.lang.Object[] bufferUpMethodArguments = new java.lang.Object[0];
        try {
            bufferUpMethod.invoke(characterReader, bufferUpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#bufferUp()}
 * @utbot.caughtException {@code IOException e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in:  catch (IOException e) {
 *     throw new UncheckedIOException(e);
 * }
 *  */
    @Test
    public void testBufferUp_ThrowNullPointerException_1() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.bufferUp] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51) */
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Method bufferUpMethod = characterReaderClazz.getDeclaredMethod("bufferUp");
        bufferUpMethod.setAccessible(true);
        java.lang.Object[] bufferUpMethodArguments = new java.lang.Object[0];
        try {
            bufferUpMethod.invoke(characterReader, bufferUpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method bufferUp()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#bufferUp()}
 * @utbot.executesCondition {@code (bufPos < bufSplitPoint): False}
 * @utbot.invokes {@link java.io.Reader#skip(long)}
 * @utbot.throwsException {@link org.jsoup.UncheckedIOException} in:  catch (IOException e) {
 *     throw new UncheckedIOException(e);
 * }
 *  */
    @Test(expected = UncheckedIOException.class)
    public void testBufferUp_ThrowUncheckedIOException() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "markedChar", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 16);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 16);
        
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Method bufferUpMethod = characterReaderClazz.getDeclaredMethod("bufferUp");
        bufferUpMethod.setAccessible(true);
        java.lang.Object[] bufferUpMethodArguments = new java.lang.Object[0];
        try {
            bufferUpMethod.invoke(characterReader, bufferUpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for bufferUp
    
    public void testBufferUp_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        // Concrete execution failed
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.unconsume
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unconsume()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#unconsume()}
 *  */
    @Test
    public void testUnconsume() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        characterReader.unconsume();
        
        int finalCharacterReaderBufPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        
        assertEquals(-256, finalCharacterReaderBufPos);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method consumeData()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeData()}
 * @utbot.executesCondition {@code (bufPos > start): True}
 * @utbot.invokes org.jsoup.parser.CharacterReader#bufferUp()
 * @utbot.invokes org.jsoup.parser.CharacterReader#cacheString(char[],java.lang.String[],int,int)
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.returnsFrom {@code return bufPos > start ? cacheString(charBuf, stringCache, start, bufPos - start) : "";}
 *  */
    @Test
    public void testConsumeData_BufPosGreaterThanStart() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeData();
        
        String expected = " ";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderBufPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        
        assertEquals(1, finalCharacterReaderBufPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method consumeData()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     org.jsoup.parser.CharacterReader#bufferUp() twice
    /// execute conditions:
    ///     {@code (bufPos > start): False}
    /// return from: {@code return bufPos > start ? cacheString(charBuf, stringCache, start, bufPos - start) : "";}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeData()}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.returnsFrom {@code return bufPos > start ? cacheString(charBuf, stringCache, start, bufPos - start) : "";}
 *  */
    @Test
    public void testConsumeData_CEqualsChar() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'&'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        String actual = characterReader.consumeData();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeData()}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.returnsFrom {@code return bufPos > start ? cacheString(charBuf, stringCache, start, bufPos - start) : "";}
 *  */
    @Test
    public void testConsumeData_CEqualsChar_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'<'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        String actual = characterReader.consumeData();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeData()}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.returnsFrom {@code return bufPos > start ? cacheString(charBuf, stringCache, start, bufPos - start) : "";}
 *  */
    @Test
    public void testConsumeData_CEqualsTokeniserStateNullChar() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {
            '\u0000', '\u0000', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        String actual = characterReader.consumeData();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeData()}
 * @utbot.returnsFrom {@code return bufPos > start ? cacheString(charBuf, stringCache, start, bufPos - start) : "";}
 *  */
    @Test
    public void testConsumeData_BufPosGreaterOrEqualRemaining() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        String actual = characterReader.consumeData();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeData()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeData()}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final char c = val[bufPos];
 *  */
    @Test
    public void testConsumeData_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.consumeData(CharacterReader.java:235) */
        characterReader.consumeData();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeData()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: bufferUp();
 *  */
    @Test
    public void testConsumeData_ThrowIllegalArgumentException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeData] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeData(CharacterReader.java:229) */
        characterReader.consumeData();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeData()}
 * @utbot.executesCondition {@code (bufPos > start): True}
 * @utbot.invokes org.jsoup.parser.CharacterReader#cacheString(char[],java.lang.String[],int,int)
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: cacheString(charBuf, stringCache, start, bufPos - start)
 *  */
    @Test
    public void testConsumeData_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:448)
            org.jsoup.parser.CharacterReader.consumeData(CharacterReader.java:241) */
        characterReader.consumeData();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeData()}
 * @utbot.iterates iterate the loop {@code while(bufPos < remaining)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final char c = val[bufPos];
 *  */
    @Test
    public void testConsumeData_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeData] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeData(CharacterReader.java:235) */
        characterReader.consumeData();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testConsumeData_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeData] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeData(CharacterReader.java:229) */
        characterReader.consumeData();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testConsumeData_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeData] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeData(CharacterReader.java:229) */
        characterReader.consumeData();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method consumeData()
    
    @Test
    public void testConsumeData1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = new char[40];
        charBuf[36] = '\'';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 37);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 37);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 36);
        java.lang.String[] stringCache = new java.lang.String[39];
        String string = "\u0000";
        stringCache[38] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeData();
        
        String expected = "'";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderBufPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache1 = ((String) get(characterReaderStringCache1, 1));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache2, 2));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache3, 3));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache4, 4));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache5, 5));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache6, 6));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache7, 7));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache8, 8));
        java.lang.String[] characterReaderStringCache9 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache9, 9));
        java.lang.String[] characterReaderStringCache10 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache10 = ((String) get(characterReaderStringCache10, 10));
        java.lang.String[] characterReaderStringCache11 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache11 = ((String) get(characterReaderStringCache11, 11));
        java.lang.String[] characterReaderStringCache12 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache12 = ((String) get(characterReaderStringCache12, 12));
        java.lang.String[] characterReaderStringCache13 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache13 = ((String) get(characterReaderStringCache13, 13));
        java.lang.String[] characterReaderStringCache14 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache14 = ((String) get(characterReaderStringCache14, 14));
        java.lang.String[] characterReaderStringCache15 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache15 = ((String) get(characterReaderStringCache15, 15));
        java.lang.String[] characterReaderStringCache16 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache16 = ((String) get(characterReaderStringCache16, 16));
        java.lang.String[] characterReaderStringCache17 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache17 = ((String) get(characterReaderStringCache17, 17));
        java.lang.String[] characterReaderStringCache18 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache18 = ((String) get(characterReaderStringCache18, 18));
        java.lang.String[] characterReaderStringCache19 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache19 = ((String) get(characterReaderStringCache19, 19));
        java.lang.String[] characterReaderStringCache20 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache20 = ((String) get(characterReaderStringCache20, 20));
        java.lang.String[] characterReaderStringCache21 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache21 = ((String) get(characterReaderStringCache21, 21));
        java.lang.String[] characterReaderStringCache22 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache22 = ((String) get(characterReaderStringCache22, 22));
        java.lang.String[] characterReaderStringCache23 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache23 = ((String) get(characterReaderStringCache23, 23));
        java.lang.String[] characterReaderStringCache24 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache24 = ((String) get(characterReaderStringCache24, 24));
        java.lang.String[] characterReaderStringCache25 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache25 = ((String) get(characterReaderStringCache25, 25));
        java.lang.String[] characterReaderStringCache26 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache26 = ((String) get(characterReaderStringCache26, 26));
        java.lang.String[] characterReaderStringCache27 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache27 = ((String) get(characterReaderStringCache27, 27));
        java.lang.String[] characterReaderStringCache28 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache28 = ((String) get(characterReaderStringCache28, 28));
        java.lang.String[] characterReaderStringCache29 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache29 = ((String) get(characterReaderStringCache29, 29));
        java.lang.String[] characterReaderStringCache30 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache30 = ((String) get(characterReaderStringCache30, 30));
        java.lang.String[] characterReaderStringCache31 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache31 = ((String) get(characterReaderStringCache31, 31));
        java.lang.String[] characterReaderStringCache32 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache32 = ((String) get(characterReaderStringCache32, 32));
        java.lang.String[] characterReaderStringCache33 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache33 = ((String) get(characterReaderStringCache33, 33));
        java.lang.String[] characterReaderStringCache34 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache34 = ((String) get(characterReaderStringCache34, 34));
        java.lang.String[] characterReaderStringCache35 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache35 = ((String) get(characterReaderStringCache35, 35));
        java.lang.String[] characterReaderStringCache36 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache36 = ((String) get(characterReaderStringCache36, 36));
        java.lang.String[] characterReaderStringCache37 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache37 = ((String) get(characterReaderStringCache37, 37));
        
        assertEquals(37, finalCharacterReaderBufPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
        assertNull(finalCharacterReaderStringCache1);
        
        assertNull(finalCharacterReaderStringCache2);
        
        assertNull(finalCharacterReaderStringCache3);
        
        assertNull(finalCharacterReaderStringCache4);
        
        assertNull(finalCharacterReaderStringCache5);
        
        assertNull(finalCharacterReaderStringCache6);
        
        assertNull(finalCharacterReaderStringCache7);
        
        assertNull(finalCharacterReaderStringCache8);
        
        assertNull(finalCharacterReaderStringCache9);
        
        assertNull(finalCharacterReaderStringCache10);
        
        assertNull(finalCharacterReaderStringCache11);
        
        assertNull(finalCharacterReaderStringCache12);
        
        assertNull(finalCharacterReaderStringCache13);
        
        assertNull(finalCharacterReaderStringCache14);
        
        assertNull(finalCharacterReaderStringCache15);
        
        assertNull(finalCharacterReaderStringCache16);
        
        assertNull(finalCharacterReaderStringCache17);
        
        assertNull(finalCharacterReaderStringCache18);
        
        assertNull(finalCharacterReaderStringCache19);
        
        assertNull(finalCharacterReaderStringCache20);
        
        assertNull(finalCharacterReaderStringCache21);
        
        assertNull(finalCharacterReaderStringCache22);
        
        assertNull(finalCharacterReaderStringCache23);
        
        assertNull(finalCharacterReaderStringCache24);
        
        assertNull(finalCharacterReaderStringCache25);
        
        assertNull(finalCharacterReaderStringCache26);
        
        assertNull(finalCharacterReaderStringCache27);
        
        assertNull(finalCharacterReaderStringCache28);
        
        assertNull(finalCharacterReaderStringCache29);
        
        assertNull(finalCharacterReaderStringCache30);
        
        assertNull(finalCharacterReaderStringCache31);
        
        assertNull(finalCharacterReaderStringCache32);
        
        assertNull(finalCharacterReaderStringCache33);
        
        assertNull(finalCharacterReaderStringCache34);
        
        assertNull(finalCharacterReaderStringCache35);
        
        assertNull(finalCharacterReaderStringCache36);
        
        assertNull(finalCharacterReaderStringCache37);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method consumeData()
    
    @Test
    public void testConsumeData2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {
            '\u0000', '\u4000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeData] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:447)
            org.jsoup.parser.CharacterReader.consumeData(CharacterReader.java:241) */
        characterReader.consumeData();
    }
    
    @Test
    public void testConsumeData3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = new char[39];
        charBuf[37] = '\u0001';
        charBuf[38] = '&';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 39);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 38);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 37);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeData] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:447)
            org.jsoup.parser.CharacterReader.consumeData(CharacterReader.java:241) */
        characterReader.consumeData();
    }
    
    @Test
    public void testConsumeData4() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        StringReader reader = ((StringReader) createInstance("java.io.StringReader"));
        String str = "";
        setField(reader, "java.io.StringReader", "str", str);
        setField(reader, "java.io.StringReader", "length", 1085973049);
        setField(reader, "java.io.StringReader", "next", -1061514826);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -2147483646);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeData] produces [java.lang.NullPointerException]
            java.base/java.io.StringReader.skip(StringReader.java:132)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeData(CharacterReader.java:229) */
        characterReader.consumeData();
    }
    ///endregion
    
    ///region Errors report for consumeData
    
    public void testConsumeData_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Concrete execution failed
        
        // 4 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.matchesIgnoreCase
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (scanLength > bufLength - bufPos): True}
 *  */
    @Test
    public void testMatchesIgnoreCase_ScanLengthGreaterThanBufLengthMinusBufPos() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        String string = " ";
        
        boolean actual = characterReader.matchesIgnoreCase(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (scanLength > bufLength - bufPos): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testMatchesIgnoreCase_ReturnTrue() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -249);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -248);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -249);
        String string = "";
        
        boolean actual = characterReader.matchesIgnoreCase(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (scanLength > bufLength - bufPos): False}
 * @utbot.iterates iterate the loop {@code for(int offset = 0; offset < scanLength; offset++)} once
 *  */
    @Test
    public void testMatchesIgnoreCase_CharacterToUpperCase() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'`'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        String string = "";
        
        boolean actual = characterReader.matchesIgnoreCase(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (scanLength > bufLength - bufPos): False}
 * @utbot.iterates iterate the loop {@code for(int offset = 0; offset < scanLength; offset++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char upTarget = Character.toUpperCase(charBuf[bufPos + offset]);
 *  */
    @Test
    public void testMatchesIgnoreCase_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'\u0000', '\u0000'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 4);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 4);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 3);
        String string = "{";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesIgnoreCase] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.matchesIgnoreCase(CharacterReader.java:355) */
        characterReader.matchesIgnoreCase(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int scanLength = seq.length();
 *  */
    @Test
    public void testMatchesIgnoreCase_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matchesIgnoreCase(CharacterReader.java:349) */
        characterReader.matchesIgnoreCase(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testMatchesIgnoreCase_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.matchesIgnoreCase(CharacterReader.java:348) */
        characterReader.matchesIgnoreCase(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (scanLength > bufLength - bufPos): False}
 * @utbot.iterates iterate the loop {@code for(int offset = 0; offset < scanLength; offset++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char upTarget = Character.toUpperCase(charBuf[bufPos + offset]);
 *  */
    @Test
    public void testMatchesIgnoreCase_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -251);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -251);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -252);
        String string = "{";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matchesIgnoreCase(CharacterReader.java:355) */
        characterReader.matchesIgnoreCase(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method matchesIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesIgnoreCase(java.lang.String)}
 * @utbot.invokes org.jsoup.parser.CharacterReader#bufferUp()
 * @utbot.throwsException {@link org.jsoup.UncheckedIOException} in: bufferUp();
 *  */
    @Test(expected = UncheckedIOException.class)
    public void testMatchesIgnoreCase_ThrowUncheckedIOException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 1);
        setField(reader, "java.io.BufferedReader", "nextChar", 1);
        setField(reader, "java.io.BufferedReader", "readAheadLimit", 1);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 128);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 128);
        
        characterReader.matchesIgnoreCase(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method matchesIgnoreCase(java.lang.String)
    
    @Test
    public void testMatchesIgnoreCase1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1073741842);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 10);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 8);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesIgnoreCase] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.jsoup.parser.CharacterReader.matchesIgnoreCase(CharacterReader.java:355) */
        characterReader.matchesIgnoreCase(string);
    }
    
    @Test
    public void testMatchesIgnoreCase2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        StringReader reader = ((StringReader) createInstance("java.io.StringReader"));
        String str = "";
        setField(reader, "java.io.StringReader", "str", str);
        setField(reader, "java.io.StringReader", "next", Integer.MIN_VALUE);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -2147483647);
        String string = "";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesIgnoreCase] produces [java.lang.NullPointerException]
            java.base/java.io.StringReader.skip(StringReader.java:132)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.matchesIgnoreCase(CharacterReader.java:348) */
        characterReader.matchesIgnoreCase(string);
    }
    
    @Test
    public void testMatchesIgnoreCase3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -2147483647);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesIgnoreCase] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.matchesIgnoreCase(CharacterReader.java:348) */
        characterReader.matchesIgnoreCase(null);
    }
    ///endregion
    
    ///region Errors report for matchesIgnoreCase
    
    public void testMatchesIgnoreCase_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Concrete execution failed
        
        // 5 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.cacheString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method cacheString([C, [Ljava.lang.String;, int, int)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(char[],java.lang.String[],int,int)}
 * @utbot.executesCondition {@code (count > maxStringCacheLen): False}
 * @utbot.executesCondition {@code (count < 1): False}
 * @utbot.executesCondition {@code (cached == null): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; i++)} once
 * @utbot.returnsFrom {@code return cached;}
 *  */
    @Test
    public void testCacheString_CachedEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        char[] charArray = {' '};
        java.lang.String[] stringArray = {null};
        
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class charArrayType = Class.forName("[C");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", charArrayType, stringArrayType, intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[4];
        cacheStringMethodArguments[0] = ((Object) charArray);
        cacheStringMethodArguments[1] = ((Object) stringArray);
        cacheStringMethodArguments[2] = 0;
        cacheStringMethodArguments[3] = 1;
        String actual = ((String) cacheStringMethod.invoke(null, cacheStringMethodArguments));
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(char[],java.lang.String[],int,int)}
 * @utbot.executesCondition {@code (count > maxStringCacheLen): False}
 * @utbot.executesCondition {@code (count < 1): False}
 * @utbot.executesCondition {@code (cached == null): False}
 * @utbot.executesCondition {@code (rangeEquals(charBuf, start, count, cached)): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; i++)} once
 * @utbot.returnsFrom {@code return cached;}
 *  */
    @Test
    public void testCacheString_RangeEquals() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        char[] charArray = {' ', '!'};
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "!";
        stringArray[1] = string;
        
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class charArrayType = Class.forName("[C");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", charArrayType, stringArrayType, intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[4];
        cacheStringMethodArguments[0] = ((Object) charArray);
        cacheStringMethodArguments[1] = ((Object) stringArray);
        cacheStringMethodArguments[2] = 1;
        cacheStringMethodArguments[3] = 1;
        String actual = ((String) cacheStringMethod.invoke(null, cacheStringMethodArguments));
        
        assertEquals(string, actual);
        
        String finalStringArray0 = stringArray[0];
        String finalStringArray2 = stringArray[2];
        String finalStringArray3 = stringArray[3];
        String finalStringArray4 = stringArray[4];
        String finalStringArray5 = stringArray[5];
        String finalStringArray6 = stringArray[6];
        String finalStringArray7 = stringArray[7];
        String finalStringArray8 = stringArray[8];
        String finalStringArray9 = stringArray[9];
        
        assertNull(finalStringArray0);
        
        assertNull(finalStringArray2);
        
        assertNull(finalStringArray3);
        
        assertNull(finalStringArray4);
        
        assertNull(finalStringArray5);
        
        assertNull(finalStringArray6);
        
        assertNull(finalStringArray7);
        
        assertNull(finalStringArray8);
        
        assertNull(finalStringArray9);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(char[],java.lang.String[],int,int)}
 * @utbot.executesCondition {@code (count > maxStringCacheLen): False}
 * @utbot.executesCondition {@code (count < 1): False}
 * @utbot.executesCondition {@code (cached == null): False}
 * @utbot.executesCondition {@code (rangeEquals(charBuf, start, count, cached)): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; i++)} once
 * @utbot.returnsFrom {@code return cached;}
 *  */
    @Test
    public void testCacheString_NotRangeEquals() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        char[] charArray = {'!'};
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "";
        stringArray[1] = string;
        
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class charArrayType = Class.forName("[C");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", charArrayType, stringArrayType, intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[4];
        cacheStringMethodArguments[0] = ((Object) charArray);
        cacheStringMethodArguments[1] = ((Object) stringArray);
        cacheStringMethodArguments[2] = 0;
        cacheStringMethodArguments[3] = 1;
        String actual = ((String) cacheStringMethod.invoke(null, cacheStringMethodArguments));
        
        String expected = "!";
        
        assertEquals(expected, actual);
        
        String finalStringArray0 = stringArray[0];
        String finalStringArray2 = stringArray[2];
        String finalStringArray3 = stringArray[3];
        String finalStringArray4 = stringArray[4];
        String finalStringArray5 = stringArray[5];
        String finalStringArray6 = stringArray[6];
        String finalStringArray7 = stringArray[7];
        String finalStringArray8 = stringArray[8];
        String finalStringArray9 = stringArray[9];
        
        assertNull(finalStringArray0);
        
        assertNull(finalStringArray2);
        
        assertNull(finalStringArray3);
        
        assertNull(finalStringArray4);
        
        assertNull(finalStringArray5);
        
        assertNull(finalStringArray6);
        
        assertNull(finalStringArray7);
        
        assertNull(finalStringArray8);
        
        assertNull(finalStringArray9);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(char[],java.lang.String[],int,int)}
 * @utbot.executesCondition {@code (count > maxStringCacheLen): False}
 * @utbot.executesCondition {@code (count < 1): False}
 * @utbot.executesCondition {@code (cached == null): False}
 * @utbot.executesCondition {@code (rangeEquals(charBuf, start, count, cached)): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; i++)} once
 * @utbot.returnsFrom {@code return cached;}
 *  */
    @Test
    public void testCacheString_NotRangeEquals_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        char[] charArray = {'!'};
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "\uFFDE";
        stringArray[1] = string;
        
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class charArrayType = Class.forName("[C");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", charArrayType, stringArrayType, intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[4];
        cacheStringMethodArguments[0] = ((Object) charArray);
        cacheStringMethodArguments[1] = ((Object) stringArray);
        cacheStringMethodArguments[2] = 0;
        cacheStringMethodArguments[3] = 1;
        String actual = ((String) cacheStringMethod.invoke(null, cacheStringMethodArguments));
        
        String expected = "!";
        
        assertEquals(expected, actual);
        
        String finalStringArray0 = stringArray[0];
        String finalStringArray2 = stringArray[2];
        String finalStringArray3 = stringArray[3];
        String finalStringArray4 = stringArray[4];
        String finalStringArray5 = stringArray[5];
        String finalStringArray6 = stringArray[6];
        String finalStringArray7 = stringArray[7];
        String finalStringArray8 = stringArray[8];
        String finalStringArray9 = stringArray[9];
        
        assertNull(finalStringArray0);
        
        assertNull(finalStringArray2);
        
        assertNull(finalStringArray3);
        
        assertNull(finalStringArray4);
        
        assertNull(finalStringArray5);
        
        assertNull(finalStringArray6);
        
        assertNull(finalStringArray7);
        
        assertNull(finalStringArray8);
        
        assertNull(finalStringArray9);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(char[],java.lang.String[],int,int)}
 * @utbot.executesCondition {@code (count > maxStringCacheLen): True}
 * @utbot.returnsFrom {@code return new String(charBuf, start, count);}
 *  */
    @Test
    public void testCacheString_CountGreaterThanMaxStringCacheLen() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        char[] charArray = new char[33];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        charArray[13] = ' ';
        charArray[14] = ' ';
        charArray[15] = ' ';
        charArray[16] = ' ';
        charArray[17] = ' ';
        charArray[18] = ' ';
        charArray[19] = ' ';
        charArray[20] = ' ';
        charArray[21] = ' ';
        charArray[22] = ' ';
        charArray[23] = ' ';
        charArray[24] = ' ';
        charArray[25] = ' ';
        charArray[26] = ' ';
        charArray[27] = ' ';
        charArray[28] = ' ';
        charArray[29] = ' ';
        charArray[30] = ' ';
        charArray[31] = ' ';
        charArray[32] = ' ';
        
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class charArrayType = Class.forName("[C");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", charArrayType, stringArrayType, intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[4];
        cacheStringMethodArguments[0] = ((Object) charArray);
        cacheStringMethodArguments[1] = ((Object) null);
        cacheStringMethodArguments[2] = 4;
        cacheStringMethodArguments[3] = 22;
        String actual = ((String) cacheStringMethod.invoke(null, cacheStringMethodArguments));
        
        String expected = "                      ";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(char[],java.lang.String[],int,int)}
 * @utbot.executesCondition {@code (count > maxStringCacheLen): False}
 * @utbot.executesCondition {@code (count < 1): True}
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testCacheString_CountLessThan1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class charArrayType = Class.forName("[C");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", charArrayType, stringArrayType, intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[4];
        cacheStringMethodArguments[0] = ((Object) null);
        cacheStringMethodArguments[1] = ((Object) null);
        cacheStringMethodArguments[2] = -255;
        cacheStringMethodArguments[3] = 0;
        String actual = ((String) cacheStringMethod.invoke(null, cacheStringMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method cacheString([C, [Ljava.lang.String;, int, int)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(char[],java.lang.String[],int,int)}
 * @utbot.executesCondition {@code (count > maxStringCacheLen): False}
 * @utbot.executesCondition {@code (count < 1): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: String cached = stringCache[index];
 *  */
    @Test
    public void testCacheString_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        char[] charArray = {' ', 'X'};
        java.lang.String[] stringArray = {};
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.cacheString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 88 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:448) */
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class charArrayType = Class.forName("[C");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", charArrayType, stringArrayType, intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[4];
        cacheStringMethodArguments[0] = ((Object) charArray);
        cacheStringMethodArguments[1] = ((Object) stringArray);
        cacheStringMethodArguments[2] = 1;
        cacheStringMethodArguments[3] = 1;
        try {
            cacheStringMethod.invoke(null, cacheStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(char[],java.lang.String[],int,int)}
 * @utbot.executesCondition {@code (count > maxStringCacheLen): False}
 * @utbot.executesCondition {@code (count < 1): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: hash = 31 * hash + charBuf[offset++];
 *  */
    @Test
    public void testCacheString_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        char[] charArray = {' '};
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.cacheString] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:443) */
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class charArrayType = Class.forName("[C");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", charArrayType, stringArrayType, intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[4];
        cacheStringMethodArguments[0] = ((Object) charArray);
        cacheStringMethodArguments[1] = ((Object) null);
        cacheStringMethodArguments[2] = -256;
        cacheStringMethodArguments[3] = 8;
        try {
            cacheStringMethod.invoke(null, cacheStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(char[],java.lang.String[],int,int)}
 * @utbot.executesCondition {@code (count > maxStringCacheLen): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return new String(charBuf, start, count);
 *  */
    @Test
    public void testCacheString_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        char[] charArray = new char[32];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        charArray[13] = ' ';
        charArray[14] = ' ';
        charArray[15] = ' ';
        charArray[16] = ' ';
        charArray[17] = ' ';
        charArray[18] = ' ';
        charArray[19] = ' ';
        charArray[20] = ' ';
        charArray[21] = ' ';
        charArray[22] = ' ';
        charArray[23] = ' ';
        charArray[24] = ' ';
        charArray[25] = ' ';
        charArray[26] = ' ';
        charArray[27] = ' ';
        charArray[28] = ' ';
        charArray[29] = ' ';
        charArray[30] = ' ';
        charArray[31] = ' ';
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.cacheString] produces [java.lang.StringIndexOutOfBoundsException: offset 3, count 30, length 32]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:435) */
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class charArrayType = Class.forName("[C");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", charArrayType, stringArrayType, intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[4];
        cacheStringMethodArguments[0] = ((Object) charArray);
        cacheStringMethodArguments[1] = ((Object) null);
        cacheStringMethodArguments[2] = 3;
        cacheStringMethodArguments[3] = 30;
        try {
            cacheStringMethod.invoke(null, cacheStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(char[],java.lang.String[],int,int)}
 * @utbot.executesCondition {@code (count > maxStringCacheLen): False}
 * @utbot.executesCondition {@code (count < 1): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int index = hash & stringCache.length - 1;
 *  */
    @Test
    public void testCacheString_ThrowNullPointerException_2() throws Throwable  {
        char[] charArray = {' ', ' '};
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.cacheString] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:447) */
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class charArrayType = Class.forName("[C");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", charArrayType, stringArrayType, intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[4];
        cacheStringMethodArguments[0] = ((Object) charArray);
        cacheStringMethodArguments[1] = ((Object) null);
        cacheStringMethodArguments[2] = 1;
        cacheStringMethodArguments[3] = 1;
        try {
            cacheStringMethod.invoke(null, cacheStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(char[],java.lang.String[],int,int)}
 * @utbot.executesCondition {@code (count > maxStringCacheLen): False}
 * @utbot.executesCondition {@code (count < 1): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: hash = 31 * hash + charBuf[offset++];
 *  */
    @Test
    public void testCacheString_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.parser.CharacterReader.cacheString] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:443) */
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class charArrayType = Class.forName("[C");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", charArrayType, stringArrayType, intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[4];
        cacheStringMethodArguments[0] = ((Object) null);
        cacheStringMethodArguments[1] = ((Object) null);
        cacheStringMethodArguments[2] = -255;
        cacheStringMethodArguments[3] = 8;
        try {
            cacheStringMethod.invoke(null, cacheStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(char[],java.lang.String[],int,int)}
 * @utbot.executesCondition {@code (count > maxStringCacheLen): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new String(charBuf, start, count);
 *  */
    @Test
    public void testCacheString_ThrowNullPointerException_1() throws Throwable  {
        /* This test fails because method [org.jsoup.parser.CharacterReader.cacheString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:435) */
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class charArrayType = Class.forName("[C");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", charArrayType, stringArrayType, intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[4];
        cacheStringMethodArguments[0] = ((Object) null);
        cacheStringMethodArguments[1] = ((Object) null);
        cacheStringMethodArguments[2] = -1;
        cacheStringMethodArguments[3] = 13;
        try {
            cacheStringMethod.invoke(null, cacheStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.rangeEquals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method rangeEquals([C, int, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#rangeEquals(char[],int,int,java.lang.String)}
 * @utbot.executesCondition {@code (count == cached.length()): True}
 * @utbot.executesCondition {@code (charBuf[i++] != cached.charAt(j++)): True}
 *  */
    @Test
    public void testRangeEquals_IOfCharBufNotEqualsCachedCharAt() {
        char[] charArray = {'@'};
        String string = " ";
        
        boolean actual = CharacterReader.rangeEquals(charArray, 0, 1, string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#rangeEquals(char[],int,int,java.lang.String)}
 * @utbot.executesCondition {@code (count == cached.length()): True}
 * @utbot.executesCondition {@code (charBuf[i++] != cached.charAt(j++)): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRangeEquals_IOfCharBufEqualsCachedCharAt() {
        char[] charArray = {' ', ' '};
        String string = " ";
        
        boolean actual = CharacterReader.rangeEquals(charArray, 1, 1, string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#rangeEquals(char[],int,int,java.lang.String)}
 * @utbot.executesCondition {@code (count == cached.length()): False}
 *  */
    @Test
    public void testRangeEquals_CountNotEqualsCachedLength() {
        String string = " ";
        
        boolean actual = CharacterReader.rangeEquals(null, -255, -255, string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#rangeEquals(char[],int,int,java.lang.String)}
 * @utbot.executesCondition {@code (count == cached.length()): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRangeEquals_PostfixDecrementCountEqualsZero() {
        String string = "";
        
        boolean actual = CharacterReader.rangeEquals(null, -255, 0, string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method rangeEquals([C, int, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#rangeEquals(char[],int,int,java.lang.String)}
 * @utbot.executesCondition {@code (count == cached.length()): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: charBuf[i++] != cached.charAt(j++)
 *  */
    @Test
    public void testRangeEquals_ThrowArrayIndexOutOfBoundsException() {
        char[] charArray = {' '};
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.rangeEquals] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.rangeEquals(CharacterReader.java:472) */
        CharacterReader.rangeEquals(charArray, -256, 1, string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#rangeEquals(char[],int,int,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: count == cached.length()
 *  */
    @Test
    public void testRangeEquals_ThrowNullPointerException() {
        /* This test fails because method [org.jsoup.parser.CharacterReader.rangeEquals] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.rangeEquals(CharacterReader.java:468) */
        CharacterReader.rangeEquals(null, -255, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#rangeEquals(char[],int,int,java.lang.String)}
 * @utbot.executesCondition {@code (count == cached.length()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: charBuf[i++] != cached.charAt(j++)
 *  */
    @Test
    public void testRangeEquals_ThrowNullPointerException_1() {
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.rangeEquals] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.rangeEquals(CharacterReader.java:472) */
        CharacterReader.rangeEquals(null, -255, 1, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.rangeEquals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method rangeEquals(int, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#rangeEquals(int,int,java.lang.String)}
 * @utbot.returnsFrom {@code return rangeEquals(charBuf, start, count, cached);}
 *  */
    @Test
    public void testRangeEquals_ReturnRangeEquals_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        String string = "_";
        
        boolean actual = characterReader.rangeEquals(1, 1, string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#rangeEquals(int,int,java.lang.String)}
 * @utbot.returnsFrom {@code return rangeEquals(charBuf, start, count, cached);}
 *  */
    @Test
    public void testRangeEquals_ReturnRangeEquals_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        String string = " ";
        
        boolean actual = characterReader.rangeEquals(1, 1, string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#rangeEquals(int,int,java.lang.String)}
 * @utbot.returnsFrom {@code return rangeEquals(charBuf, start, count, cached);}
 *  */
    @Test
    public void testRangeEquals_ReturnRangeEquals() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String string = "  ";
        
        boolean actual = characterReader.rangeEquals(-255, -3, string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#rangeEquals(int,int,java.lang.String)}
 * @utbot.returnsFrom {@code return rangeEquals(charBuf, start, count, cached);}
 *  */
    @Test
    public void testRangeEquals_ReturnRangeEquals_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String string = "";
        
        boolean actual = characterReader.rangeEquals(-255, 0, string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method rangeEquals(int, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#rangeEquals(int,int,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#rangeEquals(char[],int,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return rangeEquals(charBuf, start, count, cached);
 *  */
    @Test
    public void testRangeEquals_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.rangeEquals] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.rangeEquals(CharacterReader.java:472)
            org.jsoup.parser.CharacterReader.rangeEquals(CharacterReader.java:482) */
        characterReader.rangeEquals(129, 1, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeLetterSequence
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeLetterSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.invokes org.jsoup.parser.CharacterReader#bufferUp()
 * @utbot.invokes org.jsoup.parser.CharacterReader#cacheString(char[],java.lang.String[],int,int)
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} once
 * @utbot.returnsFrom {@code return cacheString(charBuf, stringCache, start, bufPos - start);}
 *  */
    @Test
    public void testConsumeLetterSequence_BufPosGreaterOrEqualBufLength() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        String actual = characterReader.consumeLetterSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeLetterSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = charBuf[bufPos];
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'\u0000', '\u0000'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:273) */
        characterReader.consumeLetterSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: bufferUp();
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowIllegalArgumentException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:270) */
        characterReader.consumeLetterSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.invokes org.jsoup.parser.CharacterReader#cacheString(char[],java.lang.String[],int,int)
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return cacheString(charBuf, stringCache, start, bufPos - start);
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'M'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 77 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:448)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:280) */
        characterReader.consumeLetterSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = charBuf[bufPos];
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:273) */
        characterReader.consumeLetterSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:270) */
        characterReader.consumeLetterSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:270) */
        characterReader.consumeLetterSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowNullPointerException_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        StringReader reader = ((StringReader) createInstance("java.io.StringReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.NullPointerException]
            java.base/java.io.StringReader.skip(StringReader.java:132)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:270) */
        characterReader.consumeLetterSequence();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method consumeLetterSequence()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.CharacterReader}
     * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
     */
    @Test
    public void testConsumeLetterSequence() {
        CharacterReader characterReader = new CharacterReader("ab");
        
        String actual = characterReader.consumeLetterSequence();
        
        String expected = "ab";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method consumeLetterSequence()
    
    @Test
    public void testConsumeLetterSequence1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = new char[33];
        charBuf[1] = 'o';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 1);
        java.lang.String[] stringCache = new java.lang.String[39];
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeLetterSequence();
        
        String expected = "o";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderBufPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache1 = ((String) get(characterReaderStringCache1, 1));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache2, 2));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache3, 3));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache4, 4));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache5, 5));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache6, 6));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache7, 7));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache8, 8));
        java.lang.String[] characterReaderStringCache9 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache9, 9));
        java.lang.String[] characterReaderStringCache10 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache10 = ((String) get(characterReaderStringCache10, 10));
        java.lang.String[] characterReaderStringCache11 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache11 = ((String) get(characterReaderStringCache11, 11));
        java.lang.String[] characterReaderStringCache12 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache12 = ((String) get(characterReaderStringCache12, 12));
        java.lang.String[] characterReaderStringCache13 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache13 = ((String) get(characterReaderStringCache13, 13));
        java.lang.String[] characterReaderStringCache14 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache14 = ((String) get(characterReaderStringCache14, 14));
        java.lang.String[] characterReaderStringCache15 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache15 = ((String) get(characterReaderStringCache15, 15));
        java.lang.String[] characterReaderStringCache16 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache16 = ((String) get(characterReaderStringCache16, 16));
        java.lang.String[] characterReaderStringCache17 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache17 = ((String) get(characterReaderStringCache17, 17));
        java.lang.String[] characterReaderStringCache18 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache18 = ((String) get(characterReaderStringCache18, 18));
        java.lang.String[] characterReaderStringCache19 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache19 = ((String) get(characterReaderStringCache19, 19));
        java.lang.String[] characterReaderStringCache20 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache20 = ((String) get(characterReaderStringCache20, 20));
        java.lang.String[] characterReaderStringCache21 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache21 = ((String) get(characterReaderStringCache21, 21));
        java.lang.String[] characterReaderStringCache22 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache22 = ((String) get(characterReaderStringCache22, 22));
        java.lang.String[] characterReaderStringCache23 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache23 = ((String) get(characterReaderStringCache23, 23));
        java.lang.String[] characterReaderStringCache24 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache24 = ((String) get(characterReaderStringCache24, 24));
        java.lang.String[] characterReaderStringCache25 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache25 = ((String) get(characterReaderStringCache25, 25));
        java.lang.String[] characterReaderStringCache26 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache26 = ((String) get(characterReaderStringCache26, 26));
        java.lang.String[] characterReaderStringCache27 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache27 = ((String) get(characterReaderStringCache27, 27));
        java.lang.String[] characterReaderStringCache28 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache28 = ((String) get(characterReaderStringCache28, 28));
        java.lang.String[] characterReaderStringCache29 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache29 = ((String) get(characterReaderStringCache29, 29));
        java.lang.String[] characterReaderStringCache30 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache30 = ((String) get(characterReaderStringCache30, 30));
        java.lang.String[] characterReaderStringCache31 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache31 = ((String) get(characterReaderStringCache31, 31));
        java.lang.String[] characterReaderStringCache32 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache32 = ((String) get(characterReaderStringCache32, 32));
        java.lang.String[] characterReaderStringCache33 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache33 = ((String) get(characterReaderStringCache33, 33));
        java.lang.String[] characterReaderStringCache34 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache34 = ((String) get(characterReaderStringCache34, 34));
        java.lang.String[] characterReaderStringCache35 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache35 = ((String) get(characterReaderStringCache35, 35));
        java.lang.String[] characterReaderStringCache36 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache36 = ((String) get(characterReaderStringCache36, 36));
        java.lang.String[] characterReaderStringCache37 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache37 = ((String) get(characterReaderStringCache37, 37));
        
        assertEquals(2, finalCharacterReaderBufPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
        assertNull(finalCharacterReaderStringCache1);
        
        assertNull(finalCharacterReaderStringCache2);
        
        assertNull(finalCharacterReaderStringCache3);
        
        assertNull(finalCharacterReaderStringCache4);
        
        assertNull(finalCharacterReaderStringCache5);
        
        assertNull(finalCharacterReaderStringCache6);
        
        assertNull(finalCharacterReaderStringCache7);
        
        assertNull(finalCharacterReaderStringCache8);
        
        assertNull(finalCharacterReaderStringCache9);
        
        assertNull(finalCharacterReaderStringCache10);
        
        assertNull(finalCharacterReaderStringCache11);
        
        assertNull(finalCharacterReaderStringCache12);
        
        assertNull(finalCharacterReaderStringCache13);
        
        assertNull(finalCharacterReaderStringCache14);
        
        assertNull(finalCharacterReaderStringCache15);
        
        assertNull(finalCharacterReaderStringCache16);
        
        assertNull(finalCharacterReaderStringCache17);
        
        assertNull(finalCharacterReaderStringCache18);
        
        assertNull(finalCharacterReaderStringCache19);
        
        assertNull(finalCharacterReaderStringCache20);
        
        assertNull(finalCharacterReaderStringCache21);
        
        assertNull(finalCharacterReaderStringCache22);
        
        assertNull(finalCharacterReaderStringCache23);
        
        assertNull(finalCharacterReaderStringCache24);
        
        assertNull(finalCharacterReaderStringCache25);
        
        assertNull(finalCharacterReaderStringCache26);
        
        assertNull(finalCharacterReaderStringCache27);
        
        assertNull(finalCharacterReaderStringCache28);
        
        assertNull(finalCharacterReaderStringCache29);
        
        assertNull(finalCharacterReaderStringCache30);
        
        assertNull(finalCharacterReaderStringCache31);
        
        assertNull(finalCharacterReaderStringCache32);
        
        assertNull(finalCharacterReaderStringCache33);
        
        assertNull(finalCharacterReaderStringCache34);
        
        assertNull(finalCharacterReaderStringCache35);
        
        assertNull(finalCharacterReaderStringCache36);
        
        assertNull(finalCharacterReaderStringCache37);
    }
    
    @Test
    public void testConsumeLetterSequence2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = new char[11];
        charBuf[2] = 'o';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 2);
        java.lang.String[] stringCache = new java.lang.String[39];
        String string = "";
        stringCache[38] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeLetterSequence();
        
        String expected = "o";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderBufPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache1 = ((String) get(characterReaderStringCache1, 1));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache2, 2));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache3, 3));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache4, 4));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache5, 5));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache6, 6));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache7, 7));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache8, 8));
        java.lang.String[] characterReaderStringCache9 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache9, 9));
        java.lang.String[] characterReaderStringCache10 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache10 = ((String) get(characterReaderStringCache10, 10));
        java.lang.String[] characterReaderStringCache11 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache11 = ((String) get(characterReaderStringCache11, 11));
        java.lang.String[] characterReaderStringCache12 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache12 = ((String) get(characterReaderStringCache12, 12));
        java.lang.String[] characterReaderStringCache13 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache13 = ((String) get(characterReaderStringCache13, 13));
        java.lang.String[] characterReaderStringCache14 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache14 = ((String) get(characterReaderStringCache14, 14));
        java.lang.String[] characterReaderStringCache15 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache15 = ((String) get(characterReaderStringCache15, 15));
        java.lang.String[] characterReaderStringCache16 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache16 = ((String) get(characterReaderStringCache16, 16));
        java.lang.String[] characterReaderStringCache17 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache17 = ((String) get(characterReaderStringCache17, 17));
        java.lang.String[] characterReaderStringCache18 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache18 = ((String) get(characterReaderStringCache18, 18));
        java.lang.String[] characterReaderStringCache19 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache19 = ((String) get(characterReaderStringCache19, 19));
        java.lang.String[] characterReaderStringCache20 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache20 = ((String) get(characterReaderStringCache20, 20));
        java.lang.String[] characterReaderStringCache21 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache21 = ((String) get(characterReaderStringCache21, 21));
        java.lang.String[] characterReaderStringCache22 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache22 = ((String) get(characterReaderStringCache22, 22));
        java.lang.String[] characterReaderStringCache23 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache23 = ((String) get(characterReaderStringCache23, 23));
        java.lang.String[] characterReaderStringCache24 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache24 = ((String) get(characterReaderStringCache24, 24));
        java.lang.String[] characterReaderStringCache25 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache25 = ((String) get(characterReaderStringCache25, 25));
        java.lang.String[] characterReaderStringCache26 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache26 = ((String) get(characterReaderStringCache26, 26));
        java.lang.String[] characterReaderStringCache27 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache27 = ((String) get(characterReaderStringCache27, 27));
        java.lang.String[] characterReaderStringCache28 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache28 = ((String) get(characterReaderStringCache28, 28));
        java.lang.String[] characterReaderStringCache29 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache29 = ((String) get(characterReaderStringCache29, 29));
        java.lang.String[] characterReaderStringCache30 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache30 = ((String) get(characterReaderStringCache30, 30));
        java.lang.String[] characterReaderStringCache31 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache31 = ((String) get(characterReaderStringCache31, 31));
        java.lang.String[] characterReaderStringCache32 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache32 = ((String) get(characterReaderStringCache32, 32));
        java.lang.String[] characterReaderStringCache33 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache33 = ((String) get(characterReaderStringCache33, 33));
        java.lang.String[] characterReaderStringCache34 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache34 = ((String) get(characterReaderStringCache34, 34));
        java.lang.String[] characterReaderStringCache35 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache35 = ((String) get(characterReaderStringCache35, 35));
        java.lang.String[] characterReaderStringCache36 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache36 = ((String) get(characterReaderStringCache36, 36));
        java.lang.String[] characterReaderStringCache37 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache37 = ((String) get(characterReaderStringCache37, 37));
        
        assertEquals(3, finalCharacterReaderBufPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
        assertNull(finalCharacterReaderStringCache1);
        
        assertNull(finalCharacterReaderStringCache2);
        
        assertNull(finalCharacterReaderStringCache3);
        
        assertNull(finalCharacterReaderStringCache4);
        
        assertNull(finalCharacterReaderStringCache5);
        
        assertNull(finalCharacterReaderStringCache6);
        
        assertNull(finalCharacterReaderStringCache7);
        
        assertNull(finalCharacterReaderStringCache8);
        
        assertNull(finalCharacterReaderStringCache9);
        
        assertNull(finalCharacterReaderStringCache10);
        
        assertNull(finalCharacterReaderStringCache11);
        
        assertNull(finalCharacterReaderStringCache12);
        
        assertNull(finalCharacterReaderStringCache13);
        
        assertNull(finalCharacterReaderStringCache14);
        
        assertNull(finalCharacterReaderStringCache15);
        
        assertNull(finalCharacterReaderStringCache16);
        
        assertNull(finalCharacterReaderStringCache17);
        
        assertNull(finalCharacterReaderStringCache18);
        
        assertNull(finalCharacterReaderStringCache19);
        
        assertNull(finalCharacterReaderStringCache20);
        
        assertNull(finalCharacterReaderStringCache21);
        
        assertNull(finalCharacterReaderStringCache22);
        
        assertNull(finalCharacterReaderStringCache23);
        
        assertNull(finalCharacterReaderStringCache24);
        
        assertNull(finalCharacterReaderStringCache25);
        
        assertNull(finalCharacterReaderStringCache26);
        
        assertNull(finalCharacterReaderStringCache27);
        
        assertNull(finalCharacterReaderStringCache28);
        
        assertNull(finalCharacterReaderStringCache29);
        
        assertNull(finalCharacterReaderStringCache30);
        
        assertNull(finalCharacterReaderStringCache31);
        
        assertNull(finalCharacterReaderStringCache32);
        
        assertNull(finalCharacterReaderStringCache33);
        
        assertNull(finalCharacterReaderStringCache34);
        
        assertNull(finalCharacterReaderStringCache35);
        
        assertNull(finalCharacterReaderStringCache36);
        
        assertNull(finalCharacterReaderStringCache37);
    }
    
    @Test
    public void testConsumeLetterSequence3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = new char[11];
        charBuf[2] = 'Z';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 2);
        java.lang.String[] stringCache = new java.lang.String[27];
        String string = "";
        stringCache[26] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeLetterSequence();
        
        String expected = "Z";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderBufPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache1 = ((String) get(characterReaderStringCache1, 1));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache2, 2));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache3, 3));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache4, 4));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache5, 5));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache6, 6));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache7, 7));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache8, 8));
        java.lang.String[] characterReaderStringCache9 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache9, 9));
        java.lang.String[] characterReaderStringCache10 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache10 = ((String) get(characterReaderStringCache10, 10));
        java.lang.String[] characterReaderStringCache11 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache11 = ((String) get(characterReaderStringCache11, 11));
        java.lang.String[] characterReaderStringCache12 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache12 = ((String) get(characterReaderStringCache12, 12));
        java.lang.String[] characterReaderStringCache13 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache13 = ((String) get(characterReaderStringCache13, 13));
        java.lang.String[] characterReaderStringCache14 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache14 = ((String) get(characterReaderStringCache14, 14));
        java.lang.String[] characterReaderStringCache15 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache15 = ((String) get(characterReaderStringCache15, 15));
        java.lang.String[] characterReaderStringCache16 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache16 = ((String) get(characterReaderStringCache16, 16));
        java.lang.String[] characterReaderStringCache17 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache17 = ((String) get(characterReaderStringCache17, 17));
        java.lang.String[] characterReaderStringCache18 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache18 = ((String) get(characterReaderStringCache18, 18));
        java.lang.String[] characterReaderStringCache19 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache19 = ((String) get(characterReaderStringCache19, 19));
        java.lang.String[] characterReaderStringCache20 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache20 = ((String) get(characterReaderStringCache20, 20));
        java.lang.String[] characterReaderStringCache21 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache21 = ((String) get(characterReaderStringCache21, 21));
        java.lang.String[] characterReaderStringCache22 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache22 = ((String) get(characterReaderStringCache22, 22));
        java.lang.String[] characterReaderStringCache23 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache23 = ((String) get(characterReaderStringCache23, 23));
        java.lang.String[] characterReaderStringCache24 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache24 = ((String) get(characterReaderStringCache24, 24));
        java.lang.String[] characterReaderStringCache25 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache25 = ((String) get(characterReaderStringCache25, 25));
        
        assertEquals(3, finalCharacterReaderBufPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
        assertNull(finalCharacterReaderStringCache1);
        
        assertNull(finalCharacterReaderStringCache2);
        
        assertNull(finalCharacterReaderStringCache3);
        
        assertNull(finalCharacterReaderStringCache4);
        
        assertNull(finalCharacterReaderStringCache5);
        
        assertNull(finalCharacterReaderStringCache6);
        
        assertNull(finalCharacterReaderStringCache7);
        
        assertNull(finalCharacterReaderStringCache8);
        
        assertNull(finalCharacterReaderStringCache9);
        
        assertNull(finalCharacterReaderStringCache10);
        
        assertNull(finalCharacterReaderStringCache11);
        
        assertNull(finalCharacterReaderStringCache12);
        
        assertNull(finalCharacterReaderStringCache13);
        
        assertNull(finalCharacterReaderStringCache14);
        
        assertNull(finalCharacterReaderStringCache15);
        
        assertNull(finalCharacterReaderStringCache16);
        
        assertNull(finalCharacterReaderStringCache17);
        
        assertNull(finalCharacterReaderStringCache18);
        
        assertNull(finalCharacterReaderStringCache19);
        
        assertNull(finalCharacterReaderStringCache20);
        
        assertNull(finalCharacterReaderStringCache21);
        
        assertNull(finalCharacterReaderStringCache22);
        
        assertNull(finalCharacterReaderStringCache23);
        
        assertNull(finalCharacterReaderStringCache24);
        
        assertNull(finalCharacterReaderStringCache25);
    }
    
    @Test
    public void testConsumeLetterSequence4() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = new char[33];
        charBuf[1] = 'Z';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 1);
        java.lang.String[] stringCache = new java.lang.String[27];
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeLetterSequence();
        
        String expected = "Z";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderBufPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache1 = ((String) get(characterReaderStringCache1, 1));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache2, 2));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache3, 3));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache4, 4));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache5, 5));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache6, 6));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache7, 7));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache8, 8));
        java.lang.String[] characterReaderStringCache9 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache9, 9));
        java.lang.String[] characterReaderStringCache10 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache10 = ((String) get(characterReaderStringCache10, 10));
        java.lang.String[] characterReaderStringCache11 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache11 = ((String) get(characterReaderStringCache11, 11));
        java.lang.String[] characterReaderStringCache12 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache12 = ((String) get(characterReaderStringCache12, 12));
        java.lang.String[] characterReaderStringCache13 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache13 = ((String) get(characterReaderStringCache13, 13));
        java.lang.String[] characterReaderStringCache14 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache14 = ((String) get(characterReaderStringCache14, 14));
        java.lang.String[] characterReaderStringCache15 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache15 = ((String) get(characterReaderStringCache15, 15));
        java.lang.String[] characterReaderStringCache16 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache16 = ((String) get(characterReaderStringCache16, 16));
        java.lang.String[] characterReaderStringCache17 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache17 = ((String) get(characterReaderStringCache17, 17));
        java.lang.String[] characterReaderStringCache18 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache18 = ((String) get(characterReaderStringCache18, 18));
        java.lang.String[] characterReaderStringCache19 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache19 = ((String) get(characterReaderStringCache19, 19));
        java.lang.String[] characterReaderStringCache20 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache20 = ((String) get(characterReaderStringCache20, 20));
        java.lang.String[] characterReaderStringCache21 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache21 = ((String) get(characterReaderStringCache21, 21));
        java.lang.String[] characterReaderStringCache22 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache22 = ((String) get(characterReaderStringCache22, 22));
        java.lang.String[] characterReaderStringCache23 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache23 = ((String) get(characterReaderStringCache23, 23));
        java.lang.String[] characterReaderStringCache24 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache24 = ((String) get(characterReaderStringCache24, 24));
        java.lang.String[] characterReaderStringCache25 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache25 = ((String) get(characterReaderStringCache25, 25));
        
        assertEquals(2, finalCharacterReaderBufPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
        assertNull(finalCharacterReaderStringCache1);
        
        assertNull(finalCharacterReaderStringCache2);
        
        assertNull(finalCharacterReaderStringCache3);
        
        assertNull(finalCharacterReaderStringCache4);
        
        assertNull(finalCharacterReaderStringCache5);
        
        assertNull(finalCharacterReaderStringCache6);
        
        assertNull(finalCharacterReaderStringCache7);
        
        assertNull(finalCharacterReaderStringCache8);
        
        assertNull(finalCharacterReaderStringCache9);
        
        assertNull(finalCharacterReaderStringCache10);
        
        assertNull(finalCharacterReaderStringCache11);
        
        assertNull(finalCharacterReaderStringCache12);
        
        assertNull(finalCharacterReaderStringCache13);
        
        assertNull(finalCharacterReaderStringCache14);
        
        assertNull(finalCharacterReaderStringCache15);
        
        assertNull(finalCharacterReaderStringCache16);
        
        assertNull(finalCharacterReaderStringCache17);
        
        assertNull(finalCharacterReaderStringCache18);
        
        assertNull(finalCharacterReaderStringCache19);
        
        assertNull(finalCharacterReaderStringCache20);
        
        assertNull(finalCharacterReaderStringCache21);
        
        assertNull(finalCharacterReaderStringCache22);
        
        assertNull(finalCharacterReaderStringCache23);
        
        assertNull(finalCharacterReaderStringCache24);
        
        assertNull(finalCharacterReaderStringCache25);
    }
    
    @Test
    public void testConsumeLetterSequence5() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = new char[11];
        charBuf[2] = 'Z';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 2);
        java.lang.String[] stringCache = new java.lang.String[27];
        String string = "\u0000";
        stringCache[26] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeLetterSequence();
        
        String expected = "Z";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderBufPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache1 = ((String) get(characterReaderStringCache1, 1));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache2, 2));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache3, 3));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache4, 4));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache5, 5));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache6, 6));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache7, 7));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache8, 8));
        java.lang.String[] characterReaderStringCache9 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache9, 9));
        java.lang.String[] characterReaderStringCache10 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache10 = ((String) get(characterReaderStringCache10, 10));
        java.lang.String[] characterReaderStringCache11 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache11 = ((String) get(characterReaderStringCache11, 11));
        java.lang.String[] characterReaderStringCache12 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache12 = ((String) get(characterReaderStringCache12, 12));
        java.lang.String[] characterReaderStringCache13 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache13 = ((String) get(characterReaderStringCache13, 13));
        java.lang.String[] characterReaderStringCache14 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache14 = ((String) get(characterReaderStringCache14, 14));
        java.lang.String[] characterReaderStringCache15 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache15 = ((String) get(characterReaderStringCache15, 15));
        java.lang.String[] characterReaderStringCache16 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache16 = ((String) get(characterReaderStringCache16, 16));
        java.lang.String[] characterReaderStringCache17 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache17 = ((String) get(characterReaderStringCache17, 17));
        java.lang.String[] characterReaderStringCache18 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache18 = ((String) get(characterReaderStringCache18, 18));
        java.lang.String[] characterReaderStringCache19 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache19 = ((String) get(characterReaderStringCache19, 19));
        java.lang.String[] characterReaderStringCache20 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache20 = ((String) get(characterReaderStringCache20, 20));
        java.lang.String[] characterReaderStringCache21 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache21 = ((String) get(characterReaderStringCache21, 21));
        java.lang.String[] characterReaderStringCache22 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache22 = ((String) get(characterReaderStringCache22, 22));
        java.lang.String[] characterReaderStringCache23 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache23 = ((String) get(characterReaderStringCache23, 23));
        java.lang.String[] characterReaderStringCache24 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache24 = ((String) get(characterReaderStringCache24, 24));
        java.lang.String[] characterReaderStringCache25 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache25 = ((String) get(characterReaderStringCache25, 25));
        
        assertEquals(3, finalCharacterReaderBufPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
        assertNull(finalCharacterReaderStringCache1);
        
        assertNull(finalCharacterReaderStringCache2);
        
        assertNull(finalCharacterReaderStringCache3);
        
        assertNull(finalCharacterReaderStringCache4);
        
        assertNull(finalCharacterReaderStringCache5);
        
        assertNull(finalCharacterReaderStringCache6);
        
        assertNull(finalCharacterReaderStringCache7);
        
        assertNull(finalCharacterReaderStringCache8);
        
        assertNull(finalCharacterReaderStringCache9);
        
        assertNull(finalCharacterReaderStringCache10);
        
        assertNull(finalCharacterReaderStringCache11);
        
        assertNull(finalCharacterReaderStringCache12);
        
        assertNull(finalCharacterReaderStringCache13);
        
        assertNull(finalCharacterReaderStringCache14);
        
        assertNull(finalCharacterReaderStringCache15);
        
        assertNull(finalCharacterReaderStringCache16);
        
        assertNull(finalCharacterReaderStringCache17);
        
        assertNull(finalCharacterReaderStringCache18);
        
        assertNull(finalCharacterReaderStringCache19);
        
        assertNull(finalCharacterReaderStringCache20);
        
        assertNull(finalCharacterReaderStringCache21);
        
        assertNull(finalCharacterReaderStringCache22);
        
        assertNull(finalCharacterReaderStringCache23);
        
        assertNull(finalCharacterReaderStringCache24);
        
        assertNull(finalCharacterReaderStringCache25);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method consumeLetterSequence()
    
    @Test
    public void testConsumeLetterSequence6() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {
            '\u0000', 'k', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:447)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:280) */
        characterReader.consumeLetterSequence();
    }
    ///endregion
    
    ///region Errors report for consumeLetterSequence
    
    public void testConsumeLetterSequence_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 15 occurrences of:
        // Concrete execution failed
        
        // 2 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeDigitSequence
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeDigitSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} once
 * @utbot.returnsFrom {@code return cacheString(charBuf, stringCache, start, bufPos - start);}
 *  */
    @Test
    public void testConsumeDigitSequence_CGreaterThan9() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {':'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        String actual = characterReader.consumeDigitSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} once
 * @utbot.returnsFrom {@code return cacheString(charBuf, stringCache, start, bufPos - start);}
 *  */
    @Test
    public void testConsumeDigitSequence_CLessThan0() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'/'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        String actual = characterReader.consumeDigitSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} once
 * @utbot.returnsFrom {@code return cacheString(charBuf, stringCache, start, bufPos - start);}
 *  */
    @Test
    public void testConsumeDigitSequence_BufPosGreaterOrEqualBufLength() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        String actual = characterReader.consumeDigitSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeDigitSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = charBuf[bufPos];
 *  */
    @Test
    public void testConsumeDigitSequence_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'\u0000', '\u0000'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeDigitSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:321) */
        characterReader.consumeDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: bufferUp();
 *  */
    @Test
    public void testConsumeDigitSequence_ThrowIllegalArgumentException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeDigitSequence] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:318) */
        characterReader.consumeDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.invokes org.jsoup.parser.CharacterReader#cacheString(char[],java.lang.String[],int,int)
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return cacheString(charBuf, stringCache, start, bufPos - start);
 *  */
    @Test
    public void testConsumeDigitSequence_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'3'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeDigitSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 51 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:448)
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:327) */
        characterReader.consumeDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = charBuf[bufPos];
 *  */
    @Test
    public void testConsumeDigitSequence_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeDigitSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:321) */
        characterReader.consumeDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testConsumeDigitSequence_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeDigitSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:318) */
        characterReader.consumeDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testConsumeDigitSequence_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeDigitSequence] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:318) */
        characterReader.consumeDigitSequence();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method consumeDigitSequence()
    
    @Test
    public void testConsumeDigitSequence1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {
            '\u0000', '2', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeDigitSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:447)
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:327) */
        characterReader.consumeDigitSequence();
    }
    
    @Test
    public void testConsumeDigitSequence2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        StringReader reader = ((StringReader) createInstance("java.io.StringReader"));
        String str = "";
        setField(reader, "java.io.StringReader", "str", str);
        setField(reader, "java.io.StringReader", "length", 1);
        setField(reader, "java.io.StringReader", "next", -2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -2147483647);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -2147483646);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeDigitSequence] produces [java.lang.NullPointerException]
            java.base/java.io.StringReader.skip(StringReader.java:132)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:318) */
        characterReader.consumeDigitSequence();
    }
    ///endregion
    
    ///region Errors report for consumeDigitSequence
    
    public void testConsumeDigitSequence_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 13 occurrences of:
        // Concrete execution failed
        
        // 4 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchConsumeIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchConsumeIgnoreCase(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#matchesIgnoreCase(java.lang.String)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMatchConsumeIgnoreCase_CharacterReaderMatchesIgnoreCase() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -251);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -251);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -252);
        String string = "  ";
        
        boolean actual = characterReader.matchConsumeIgnoreCase(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchConsumeIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchConsumeIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: matchesIgnoreCase(seq)
 *  */
    @Test
    public void testMatchConsumeIgnoreCase_ThrowIllegalArgumentException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.matchesIgnoreCase(CharacterReader.java:348)
            org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase(CharacterReader.java:405) */
        characterReader.matchConsumeIgnoreCase(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchConsumeIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: matchesIgnoreCase(seq)
 *  */
    @Test
    public void testMatchConsumeIgnoreCase_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'\u0000'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 1);
        String string = "`";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.matchesIgnoreCase(CharacterReader.java:355)
            org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase(CharacterReader.java:405) */
        characterReader.matchConsumeIgnoreCase(string);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method matchConsumeIgnoreCase(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.CharacterReader}
     * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchConsumeIgnoreCase(java.lang.String)}
     */
    @Test
    public void testMatchConsumeIgnoreCaseReturnsFalseWithNonEmptyString() {
        CharacterReader characterReader = new CharacterReader("abc");
        
        boolean actual = characterReader.matchConsumeIgnoreCase("-\uFFF43");
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method matchConsumeIgnoreCase(java.lang.String)
    
    @Test
    public void testMatchConsumeIgnoreCase1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        String string = "";
        
        boolean actual = characterReader.matchConsumeIgnoreCase(string);
        
        assertTrue(actual);
    }
    
    @Test
    public void testMatchConsumeIgnoreCase2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1073741826);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        String string = "\u0000\u0000\u0000";
        
        boolean actual = characterReader.matchConsumeIgnoreCase(string);
        
        assertTrue(actual);
        
        int finalCharacterReaderBufPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        
        assertEquals(3, finalCharacterReaderBufPos);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method matchConsumeIgnoreCase(java.lang.String)
    
    @Test(expected = StackOverflowError.class)
    public void testMatchConsumeIgnoreCase3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(reader, "java.io.BufferedReader", "in", reader);
        char[] cb = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 1073741826);
        setField(reader, "java.io.BufferedReader", "nextChar", 5);
        setField(reader, "java.io.BufferedReader", "readAheadLimit", 3);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 35790849);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 1377968128);
        
        characterReader.matchConsumeIgnoreCase(null);
    }
    
    @Test
    public void testMatchConsumeIgnoreCase4() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1073741823);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1073741826);
        String string = "\u8000\u0000\u0000";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matchesIgnoreCase(CharacterReader.java:355)
            org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase(CharacterReader.java:405) */
        characterReader.matchConsumeIgnoreCase(string);
    }
    
    @Test
    public void testMatchConsumeIgnoreCase5() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(reader, "java.io.BufferedReader", "in", reader);
        char[] cb = new char[32];
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", -2147483638);
        setField(reader, "java.io.BufferedReader", "nextChar", 9);
        setField(reader, "java.io.BufferedReader", "markedChar", 9);
        setField(reader, "java.io.BufferedReader", "readAheadLimit", 33);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -2147483645);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 1);
        String string = "";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.matchesIgnoreCase(CharacterReader.java:348)
            org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase(CharacterReader.java:405) */
        characterReader.matchConsumeIgnoreCase(string);
    }
    
    @Test
    public void testMatchConsumeIgnoreCase6() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        StringReader reader = ((StringReader) createInstance("java.io.StringReader"));
        String str = "";
        setField(reader, "java.io.StringReader", "str", str);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -2147483647);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase] produces [java.lang.NullPointerException]
            java.base/java.io.StringReader.skip(StringReader.java:132)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.matchesIgnoreCase(CharacterReader.java:348)
            org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase(CharacterReader.java:405) */
        characterReader.matchConsumeIgnoreCase(null);
    }
    ///endregion
    
    ///region Errors report for matchConsumeIgnoreCase
    
    public void testMatchConsumeIgnoreCase_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Concrete execution failed
        
        // 3 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeLetterThenDigitSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} 3 times
 * @utbot.returnsFrom {@code return cacheString(charBuf, stringCache, start, bufPos - start);}
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_CLessOrEqualZ() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'a'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeLetterThenDigitSequence();
        
        String expected = "a";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderBufPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        
        assertEquals(1, finalCharacterReaderBufPos);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} twice
 * @utbot.returnsFrom {@code return cacheString(charBuf, stringCache, start, bufPos - start);}
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_IterateWhileLoop() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        String actual = characterReader.consumeLetterThenDigitSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeLetterThenDigitSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = charBuf[bufPos];
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:287) */
        characterReader.consumeLetterThenDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: bufferUp();
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_ThrowIllegalArgumentException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:284) */
        characterReader.consumeLetterThenDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = charBuf[bufPos];
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'a'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:287) */
        characterReader.consumeLetterThenDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.invokes org.jsoup.parser.CharacterReader#cacheString(char[],java.lang.String[],int,int)
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} 3 times
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return cacheString(charBuf, stringCache, start, bufPos - start);
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'a'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 97 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:448)
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:301) */
        characterReader.consumeLetterThenDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(bufPos < bufLength)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = charBuf[bufPos];
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:287) */
        characterReader.consumeLetterThenDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:284) */
        characterReader.consumeLetterThenDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bufferUp();
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:284) */
        characterReader.consumeLetterThenDigitSequence();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method consumeLetterThenDigitSequence()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.CharacterReader}
     * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
     */
    @Test
    public void testConsumeLetterThenDigitSequence() {
        CharacterReader characterReader = new CharacterReader("ab");
        
        String actual = characterReader.consumeLetterThenDigitSequence();
        
        String expected = "ab";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method consumeLetterThenDigitSequence()
    
    @Test
    public void testConsumeLetterThenDigitSequence1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = new char[11];
        charBuf[2] = 'o';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 2);
        java.lang.String[] stringCache = new java.lang.String[39];
        String string = "";
        stringCache[38] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeLetterThenDigitSequence();
        
        String expected = "o";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderBufPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache1 = ((String) get(characterReaderStringCache1, 1));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache2, 2));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache3, 3));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache4, 4));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache5, 5));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache6, 6));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache7, 7));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache8, 8));
        java.lang.String[] characterReaderStringCache9 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache9, 9));
        java.lang.String[] characterReaderStringCache10 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache10 = ((String) get(characterReaderStringCache10, 10));
        java.lang.String[] characterReaderStringCache11 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache11 = ((String) get(characterReaderStringCache11, 11));
        java.lang.String[] characterReaderStringCache12 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache12 = ((String) get(characterReaderStringCache12, 12));
        java.lang.String[] characterReaderStringCache13 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache13 = ((String) get(characterReaderStringCache13, 13));
        java.lang.String[] characterReaderStringCache14 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache14 = ((String) get(characterReaderStringCache14, 14));
        java.lang.String[] characterReaderStringCache15 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache15 = ((String) get(characterReaderStringCache15, 15));
        java.lang.String[] characterReaderStringCache16 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache16 = ((String) get(characterReaderStringCache16, 16));
        java.lang.String[] characterReaderStringCache17 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache17 = ((String) get(characterReaderStringCache17, 17));
        java.lang.String[] characterReaderStringCache18 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache18 = ((String) get(characterReaderStringCache18, 18));
        java.lang.String[] characterReaderStringCache19 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache19 = ((String) get(characterReaderStringCache19, 19));
        java.lang.String[] characterReaderStringCache20 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache20 = ((String) get(characterReaderStringCache20, 20));
        java.lang.String[] characterReaderStringCache21 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache21 = ((String) get(characterReaderStringCache21, 21));
        java.lang.String[] characterReaderStringCache22 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache22 = ((String) get(characterReaderStringCache22, 22));
        java.lang.String[] characterReaderStringCache23 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache23 = ((String) get(characterReaderStringCache23, 23));
        java.lang.String[] characterReaderStringCache24 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache24 = ((String) get(characterReaderStringCache24, 24));
        java.lang.String[] characterReaderStringCache25 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache25 = ((String) get(characterReaderStringCache25, 25));
        java.lang.String[] characterReaderStringCache26 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache26 = ((String) get(characterReaderStringCache26, 26));
        java.lang.String[] characterReaderStringCache27 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache27 = ((String) get(characterReaderStringCache27, 27));
        java.lang.String[] characterReaderStringCache28 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache28 = ((String) get(characterReaderStringCache28, 28));
        java.lang.String[] characterReaderStringCache29 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache29 = ((String) get(characterReaderStringCache29, 29));
        java.lang.String[] characterReaderStringCache30 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache30 = ((String) get(characterReaderStringCache30, 30));
        java.lang.String[] characterReaderStringCache31 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache31 = ((String) get(characterReaderStringCache31, 31));
        java.lang.String[] characterReaderStringCache32 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache32 = ((String) get(characterReaderStringCache32, 32));
        java.lang.String[] characterReaderStringCache33 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache33 = ((String) get(characterReaderStringCache33, 33));
        java.lang.String[] characterReaderStringCache34 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache34 = ((String) get(characterReaderStringCache34, 34));
        java.lang.String[] characterReaderStringCache35 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache35 = ((String) get(characterReaderStringCache35, 35));
        java.lang.String[] characterReaderStringCache36 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache36 = ((String) get(characterReaderStringCache36, 36));
        java.lang.String[] characterReaderStringCache37 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache37 = ((String) get(characterReaderStringCache37, 37));
        
        assertEquals(3, finalCharacterReaderBufPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
        assertNull(finalCharacterReaderStringCache1);
        
        assertNull(finalCharacterReaderStringCache2);
        
        assertNull(finalCharacterReaderStringCache3);
        
        assertNull(finalCharacterReaderStringCache4);
        
        assertNull(finalCharacterReaderStringCache5);
        
        assertNull(finalCharacterReaderStringCache6);
        
        assertNull(finalCharacterReaderStringCache7);
        
        assertNull(finalCharacterReaderStringCache8);
        
        assertNull(finalCharacterReaderStringCache9);
        
        assertNull(finalCharacterReaderStringCache10);
        
        assertNull(finalCharacterReaderStringCache11);
        
        assertNull(finalCharacterReaderStringCache12);
        
        assertNull(finalCharacterReaderStringCache13);
        
        assertNull(finalCharacterReaderStringCache14);
        
        assertNull(finalCharacterReaderStringCache15);
        
        assertNull(finalCharacterReaderStringCache16);
        
        assertNull(finalCharacterReaderStringCache17);
        
        assertNull(finalCharacterReaderStringCache18);
        
        assertNull(finalCharacterReaderStringCache19);
        
        assertNull(finalCharacterReaderStringCache20);
        
        assertNull(finalCharacterReaderStringCache21);
        
        assertNull(finalCharacterReaderStringCache22);
        
        assertNull(finalCharacterReaderStringCache23);
        
        assertNull(finalCharacterReaderStringCache24);
        
        assertNull(finalCharacterReaderStringCache25);
        
        assertNull(finalCharacterReaderStringCache26);
        
        assertNull(finalCharacterReaderStringCache27);
        
        assertNull(finalCharacterReaderStringCache28);
        
        assertNull(finalCharacterReaderStringCache29);
        
        assertNull(finalCharacterReaderStringCache30);
        
        assertNull(finalCharacterReaderStringCache31);
        
        assertNull(finalCharacterReaderStringCache32);
        
        assertNull(finalCharacterReaderStringCache33);
        
        assertNull(finalCharacterReaderStringCache34);
        
        assertNull(finalCharacterReaderStringCache35);
        
        assertNull(finalCharacterReaderStringCache36);
        
        assertNull(finalCharacterReaderStringCache37);
    }
    
    @Test
    public void testConsumeLetterThenDigitSequence2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {
            'Z', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        java.lang.String[] stringCache = new java.lang.String[27];
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeLetterThenDigitSequence();
        
        String expected = "Z";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderBufPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache1 = ((String) get(characterReaderStringCache1, 1));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache2, 2));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache3, 3));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache4, 4));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache5, 5));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache6, 6));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache7, 7));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache8, 8));
        java.lang.String[] characterReaderStringCache9 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache9, 9));
        java.lang.String[] characterReaderStringCache10 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache10 = ((String) get(characterReaderStringCache10, 10));
        java.lang.String[] characterReaderStringCache11 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache11 = ((String) get(characterReaderStringCache11, 11));
        java.lang.String[] characterReaderStringCache12 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache12 = ((String) get(characterReaderStringCache12, 12));
        java.lang.String[] characterReaderStringCache13 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache13 = ((String) get(characterReaderStringCache13, 13));
        java.lang.String[] characterReaderStringCache14 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache14 = ((String) get(characterReaderStringCache14, 14));
        java.lang.String[] characterReaderStringCache15 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache15 = ((String) get(characterReaderStringCache15, 15));
        java.lang.String[] characterReaderStringCache16 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache16 = ((String) get(characterReaderStringCache16, 16));
        java.lang.String[] characterReaderStringCache17 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache17 = ((String) get(characterReaderStringCache17, 17));
        java.lang.String[] characterReaderStringCache18 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache18 = ((String) get(characterReaderStringCache18, 18));
        java.lang.String[] characterReaderStringCache19 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache19 = ((String) get(characterReaderStringCache19, 19));
        java.lang.String[] characterReaderStringCache20 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache20 = ((String) get(characterReaderStringCache20, 20));
        java.lang.String[] characterReaderStringCache21 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache21 = ((String) get(characterReaderStringCache21, 21));
        java.lang.String[] characterReaderStringCache22 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache22 = ((String) get(characterReaderStringCache22, 22));
        java.lang.String[] characterReaderStringCache23 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache23 = ((String) get(characterReaderStringCache23, 23));
        java.lang.String[] characterReaderStringCache24 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache24 = ((String) get(characterReaderStringCache24, 24));
        java.lang.String[] characterReaderStringCache25 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache25 = ((String) get(characterReaderStringCache25, 25));
        
        assertEquals(1, finalCharacterReaderBufPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
        assertNull(finalCharacterReaderStringCache1);
        
        assertNull(finalCharacterReaderStringCache2);
        
        assertNull(finalCharacterReaderStringCache3);
        
        assertNull(finalCharacterReaderStringCache4);
        
        assertNull(finalCharacterReaderStringCache5);
        
        assertNull(finalCharacterReaderStringCache6);
        
        assertNull(finalCharacterReaderStringCache7);
        
        assertNull(finalCharacterReaderStringCache8);
        
        assertNull(finalCharacterReaderStringCache9);
        
        assertNull(finalCharacterReaderStringCache10);
        
        assertNull(finalCharacterReaderStringCache11);
        
        assertNull(finalCharacterReaderStringCache12);
        
        assertNull(finalCharacterReaderStringCache13);
        
        assertNull(finalCharacterReaderStringCache14);
        
        assertNull(finalCharacterReaderStringCache15);
        
        assertNull(finalCharacterReaderStringCache16);
        
        assertNull(finalCharacterReaderStringCache17);
        
        assertNull(finalCharacterReaderStringCache18);
        
        assertNull(finalCharacterReaderStringCache19);
        
        assertNull(finalCharacterReaderStringCache20);
        
        assertNull(finalCharacterReaderStringCache21);
        
        assertNull(finalCharacterReaderStringCache22);
        
        assertNull(finalCharacterReaderStringCache23);
        
        assertNull(finalCharacterReaderStringCache24);
        
        assertNull(finalCharacterReaderStringCache25);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method consumeLetterThenDigitSequence()
    
    @Test
    public void testConsumeLetterThenDigitSequence3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {
            '\u0000', 'K', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:447)
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:301) */
        characterReader.consumeLetterThenDigitSequence();
    }
    
    @Test
    public void testConsumeLetterThenDigitSequence4() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        StringReader reader = ((StringReader) createInstance("java.io.StringReader"));
        String str = "";
        setField(reader, "java.io.StringReader", "str", str);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -2147483647);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.NullPointerException]
            java.base/java.io.StringReader.skip(StringReader.java:132)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:284) */
        characterReader.consumeLetterThenDigitSequence();
    }
    ///endregion
    
    ///region Errors report for consumeLetterThenDigitSequence
    
    public void testConsumeLetterThenDigitSequence_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        // Concrete execution failed
        
        // 3 occurrences of:
        // Default concrete execution failed
        
        // 2 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1007666251675200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1007666251675200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1007666251679900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1007666251675200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1007666251679900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1007666251982300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1007666251982300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1007666251983300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1007666251982300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1007666251983300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


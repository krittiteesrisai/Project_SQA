package org.apache.commons.csv;

import org.junit.Test;
import java.lang.reflect.Method;
import java.io.InputStreamReader;
import sun.nio.cs.StreamDecoder;
import java.io.DataInputStream;
import java.util.zip.ZipInputStream;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;

public final class org_apache_commons_csv_LexerTest {
    ///region Test suites for executable org.apache.commons.csv.Lexer.isWhitespace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isWhitespace(int)
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#isWhitespace(int)}
 * @utbot.returnsFrom {@code return c != format.getDelimiter() && Character.isWhitespace((char) c);}
 *  */
    @Test
    public void testIsWhitespace_CEqualsFormatGetDelimiterAndCharacterIsWhitespace() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", '!');
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "format", format);
        
        boolean actual = cSVLexer.isWhitespace(33);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#isWhitespace(int)}
 * @utbot.returnsFrom {@code return c != format.getDelimiter() && Character.isWhitespace((char) c);}
 *  */
    @Test
    public void testIsWhitespace_CNotEqualsFormatGetDelimiterAndCharacterIsWhitespace() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", 'r');
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "format", format);
        
        boolean actual = cSVLexer.isWhitespace(13);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#isWhitespace(int)}
 * @utbot.returnsFrom {@code return c != format.getDelimiter() && Character.isWhitespace((char) c);}
 *  */
    @Test
    public void testIsWhitespace_CEqualsFormatGetDelimiterAndCharacterIsWhitespace_1() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "format", format);
        
        boolean actual = cSVLexer.isWhitespace(-33);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isWhitespace(int)
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#isWhitespace(int)}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#getDelimiter()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return c != format.getDelimiter() && Character.isWhitespace((char) c);
 *  */
    @Test
    public void testIsWhitespace_ThrowNullPointerException() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        
        /* This test fails because method [org.apache.commons.csv.Lexer.isWhitespace] produces [java.lang.NullPointerException]
            org.apache.commons.csv.Lexer.isWhitespace(Lexer.java:146) */
        cSVLexer.isWhitespace(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.Lexer.getLineNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLineNumber()
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#getLineNumber()}
 * @utbot.invokes {@link org.apache.commons.csv.ExtendedBufferedReader#getLineNumber()}
 * @utbot.returnsFrom {@code return in.getLineNumber();}
 *  */
    @Test
    public void testGetLineNumber_ExtendedBufferedReaderGetLineNumber() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(in, "org.apache.commons.csv.ExtendedBufferedReader", "lineCounter", -255L);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        long actual = cSVLexer.getLineNumber();
        
        assertEquals(-255L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLineNumber()
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#getLineNumber()}
 * @utbot.invokes {@link org.apache.commons.csv.ExtendedBufferedReader#getLineNumber()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return in.getLineNumber();
 *  */
    @Test
    public void testGetLineNumber_ThrowNullPointerException() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        
        /* This test fails because method [org.apache.commons.csv.Lexer.getLineNumber] produces [java.lang.NullPointerException]
            org.apache.commons.csv.Lexer.getLineNumber(Lexer.java:73) */
        cSVLexer.getLineNumber();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.Lexer.isDelimiter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDelimiter(int)
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#isDelimiter(int)}
 * @utbot.returnsFrom {@code return c == delimiter;}
 *  */
    @Test
    public void testIsDelimiter_CNotEqualsDelimiter() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "delimiter", ' ');
        
        boolean actual = cSVLexer.isDelimiter(-255);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#isDelimiter(int)}
 * @utbot.returnsFrom {@code return c == delimiter;}
 *  */
    @Test
    public void testIsDelimiter_CEqualsDelimiter() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "delimiter", '!');
        
        boolean actual = cSVLexer.isDelimiter(33);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.Lexer.trimTrailingSpaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method trimTrailingSpaces(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#trimTrailingSpaces(java.lang.StringBuilder)}
 * @utbot.executesCondition {@code (length != buffer.length()): False}
 *  */
    @Test
    public void testTrimTrailingSpaces_LengthEqualsBufferLength() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        StringBuilder stringBuilder = new StringBuilder("");
        
        cSVLexer.trimTrailingSpaces(stringBuilder);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#trimTrailingSpaces(java.lang.StringBuilder)}
 * @utbot.executesCondition {@code (length != buffer.length()): False}
 * @utbot.iterates iterate the loop {@code while(length > 0 && Character.isWhitespace(buffer.charAt(length - 1)))} once
 *  */
    @Test
    public void testTrimTrailingSpaces_LengthLessOrEqualZeroAndCharacterIsWhitespace() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        StringBuilder stringBuilder = new StringBuilder("A");
        
        cSVLexer.trimTrailingSpaces(stringBuilder);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#trimTrailingSpaces(java.lang.StringBuilder)}
 * @utbot.executesCondition {@code (length != buffer.length()): True}
 * @utbot.invokes {@link java.lang.StringBuilder#setLength(int)}
 * @utbot.iterates iterate the loop {@code while(length > 0 && Character.isWhitespace(buffer.charAt(length - 1)))} once
 *  */
    @Test
    public void testTrimTrailingSpaces_LengthNotEqualsBufferLength() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        StringBuilder stringBuilder = new StringBuilder("\f");
        
        cSVLexer.trimTrailingSpaces(stringBuilder);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method trimTrailingSpaces(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#trimTrailingSpaces(java.lang.StringBuilder)}
 * @utbot.invokes {@link java.lang.StringBuilder#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int length = buffer.length();
 *  */
    @Test
    public void testTrimTrailingSpaces_ThrowNullPointerException() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        
        /* This test fails because method [org.apache.commons.csv.Lexer.trimTrailingSpaces] produces [java.lang.NullPointerException]
            org.apache.commons.csv.Lexer.trimTrailingSpaces(Lexer.java:117) */
        cSVLexer.trimTrailingSpaces(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.Lexer.isCommentStart
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCommentStart(int)
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#isCommentStart(int)}
 * @utbot.returnsFrom {@code return c == commmentStart;}
 *  */
    @Test
    public void testIsCommentStart_CNotEqualsCommmentStart() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "commmentStart", ' ');
        
        boolean actual = cSVLexer.isCommentStart(-255);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#isCommentStart(int)}
 * @utbot.returnsFrom {@code return c == commmentStart;}
 *  */
    @Test
    public void testIsCommentStart_CEqualsCommmentStart() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "commmentStart", '!');
        
        boolean actual = cSVLexer.isCommentStart(33);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.Lexer.isEndOfFile
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEndOfFile(int)
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#isEndOfFile(int)}
 * @utbot.returnsFrom {@code return c == END_OF_STREAM;}
 *  */
    @Test
    public void testIsEndOfFile_CNotEqualsEND_OF_STREAM() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        
        boolean actual = cSVLexer.isEndOfFile(-255);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#isEndOfFile(int)}
 * @utbot.returnsFrom {@code return c == END_OF_STREAM;}
 *  */
    @Test
    public void testIsEndOfFile_CEqualsEND_OF_STREAM() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        
        boolean actual = cSVLexer.isEndOfFile(-1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.Lexer.isQuoteChar
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isQuoteChar(int)
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#isQuoteChar(int)}
 * @utbot.returnsFrom {@code return c == quoteChar;}
 *  */
    @Test
    public void testIsQuoteChar_CNotEqualsQuoteChar() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "quoteChar", ' ');
        
        boolean actual = cSVLexer.isQuoteChar(-255);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#isQuoteChar(int)}
 * @utbot.returnsFrom {@code return c == quoteChar;}
 *  */
    @Test
    public void testIsQuoteChar_CEqualsQuoteChar() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "quoteChar", '!');
        
        boolean actual = cSVLexer.isQuoteChar(33);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.Lexer.mapNullToDisabled
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapNullToDisabled(java.lang.Character)
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#mapNullToDisabled(java.lang.Character)}
 * @utbot.executesCondition {@code (c == null): True}
 * @utbot.returnsFrom {@code return c == null ? DISABLED : c.charValue();}
 *  */
    @Test
    public void testMapNullToDisabled_CEqualsNull() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        
        Class lexerClazz = Class.forName("org.apache.commons.csv.Lexer");
        Class characterType = Class.forName("java.lang.Character");
        Method mapNullToDisabledMethod = lexerClazz.getDeclaredMethod("mapNullToDisabled", characterType);
        mapNullToDisabledMethod.setAccessible(true);
        java.lang.Object[] mapNullToDisabledMethodArguments = new java.lang.Object[1];
        mapNullToDisabledMethodArguments[0] = ((Object) null);
        char actual = ((Character) mapNullToDisabledMethod.invoke(cSVLexer, mapNullToDisabledMethodArguments));
        
        assertEquals('\uFFFE', actual);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#mapNullToDisabled(java.lang.Character)}
 * @utbot.executesCondition {@code (c == null): False}
 * @utbot.invokes {@link java.lang.Character#charValue()}
 * @utbot.returnsFrom {@code return c == null ? DISABLED : c.charValue();}
 *  */
    @Test
    public void testMapNullToDisabled_CNotEqualsNull() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        Character character = ' ';
        
        Class lexerClazz = Class.forName("org.apache.commons.csv.Lexer");
        Class characterType = Class.forName("java.lang.Character");
        Method mapNullToDisabledMethod = lexerClazz.getDeclaredMethod("mapNullToDisabled", characterType);
        mapNullToDisabledMethod.setAccessible(true);
        java.lang.Object[] mapNullToDisabledMethodArguments = new java.lang.Object[1];
        mapNullToDisabledMethodArguments[0] = character;
        char actual = ((Character) mapNullToDisabledMethod.invoke(cSVLexer, mapNullToDisabledMethodArguments));
        
        assertEquals(' ', actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.Lexer.isEscape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEscape(int)
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#isEscape(int)}
 * @utbot.returnsFrom {@code return c == escape;}
 *  */
    @Test
    public void testIsEscape_CNotEqualsEscape() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "escape", ' ');
        
        boolean actual = cSVLexer.isEscape(-255);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#isEscape(int)}
 * @utbot.returnsFrom {@code return c == escape;}
 *  */
    @Test
    public void testIsEscape_CEqualsEscape() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "escape", '!');
        
        boolean actual = cSVLexer.isEscape(33);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.Lexer.readEndOfLine
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readEndOfLine(int)
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEndOfLine(int)}
 * @utbot.executesCondition {@code (c == CR): False}
 * @utbot.returnsFrom {@code return c == LF || c == CR;}
 *  */
    @Test
    public void testReadEndOfLine_CEqualsLFOrCEqualsCR() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        
        boolean actual = cSVLexer.readEndOfLine(10);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEndOfLine(int)}
 * @utbot.executesCondition {@code (c == CR): False}
 * @utbot.returnsFrom {@code return c == LF || c == CR;}
 *  */
    @Test
    public void testReadEndOfLine_CNotEqualsLFOrCNotEqualsCR() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        
        boolean actual = cSVLexer.readEndOfLine(-255);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEndOfLine(int)}
 * @utbot.executesCondition {@code (c == CR): True}
 * @utbot.invokes {@link org.apache.commons.csv.ExtendedBufferedReader#lookAhead()}
 * @utbot.returnsFrom {@code return c == LF || c == CR;}
 *  */
    @Test
    public void testReadEndOfLine_CEqualsLFOrCEqualsCR_1() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        InputStreamReader in1 = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\u0000');
        Object bb = createInstance("java.nio.DirectByteBufferR");
        setField(bb, "java.nio.Buffer", "position", 572662274);
        setField(bb, "java.nio.Buffer", "limit", 572662274);
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        DataInputStream in2 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        ZipInputStream in3 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in3, "java.util.zip.ZipInputStream", "entryEOF", true);
        setField(in2, "java.io.FilterInputStream", "in", in3);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in2);
        setField(in1, "java.io.InputStreamReader", "sd", sd);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000', '\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", 1);
        setField(in, "java.io.BufferedReader", "nextChar", 1);
        setField(in, "java.io.BufferedReader", "markedChar", -255);
        setField(in, "java.io.BufferedReader", "readAheadLimit", -255);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        boolean actual = cSVLexer.readEndOfLine(13);
        
        assertTrue(actual);
        
        ExtendedBufferedReader extendedBufferedReader = cSVLexer.in;
        Reader extendedBufferedReaderInIn = ((Reader) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "in"));
        StreamDecoder extendedBufferedReaderInInInInSd = ((StreamDecoder) getFieldValue(extendedBufferedReaderInIn, "java.io.InputStreamReader", "sd"));
        boolean finalCSVLexerInInSdHaveLeftoverChar = ((Boolean) getFieldValue(extendedBufferedReaderInInInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        ExtendedBufferedReader extendedBufferedReader1 = cSVLexer.in;
        int finalCSVLexerInNextChar = ((Integer) getFieldValue(extendedBufferedReader1, "java.io.BufferedReader", "nextChar"));
        ExtendedBufferedReader extendedBufferedReader2 = cSVLexer.in;
        int finalCSVLexerInMarkedChar = ((Integer) getFieldValue(extendedBufferedReader2, "java.io.BufferedReader", "markedChar"));
        ExtendedBufferedReader extendedBufferedReader3 = cSVLexer.in;
        int finalCSVLexerInReadAheadLimit = ((Integer) getFieldValue(extendedBufferedReader3, "java.io.BufferedReader", "readAheadLimit"));
        
        assertFalse(finalCSVLexerInInSdHaveLeftoverChar);
        
        assertEquals(0, finalCSVLexerInNextChar);
        
        assertEquals(0, finalCSVLexerInMarkedChar);
        
        assertEquals(1, finalCSVLexerInReadAheadLimit);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readEndOfLine(int)
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEndOfLine(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: c == CR && in.lookAhead() == LF
 *  */
    @Test
    public void testReadEndOfLine_ThrowNullPointerException() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        
        /* This test fails because method [org.apache.commons.csv.Lexer.readEndOfLine] produces [java.lang.NullPointerException]
            org.apache.commons.csv.Lexer.readEndOfLine(Lexer.java:133) */
        cSVLexer.readEndOfLine(13);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEndOfLine(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: c == CR && in.lookAhead() == LF
 *  */
    @Test
    public void testReadEndOfLine_ThrowNullPointerException_1() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        /* This test fails because method [org.apache.commons.csv.Lexer.readEndOfLine] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.mark(BufferedReader.java:494)
            org.apache.commons.csv.ExtendedBufferedReader.lookAhead(ExtendedBufferedReader.java:138)
            org.apache.commons.csv.Lexer.readEndOfLine(Lexer.java:133) */
        cSVLexer.readEndOfLine(13);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEndOfLine(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testReadEndOfLine_ThrowNullPointerException_2() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        Reader in2 = ((Reader) createInstance("java.io.Reader$1"));
        setField(in1, "java.io.BufferedReader", "in", in2);
        char[] cb = {'\u0000'};
        setField(in1, "java.io.BufferedReader", "cb", cb);
        setField(in1, "java.io.BufferedReader", "nextChar", -1);
        setField(in1, "java.io.BufferedReader", "skipLF", true);
        setField(in, "java.io.BufferedReader", "in", in1);
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", -1);
        setField(in, "java.io.BufferedReader", "nextChar", -1);
        setField(in, "java.io.BufferedReader", "markedChar", -255);
        setField(in, "java.io.BufferedReader", "readAheadLimit", -255);
        Object lock = createInstance("java.lang.Object");
        setField(in, "java.io.Reader", "lock", lock);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        /* This test fails because method [org.apache.commons.csv.Lexer.readEndOfLine] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.read(BufferedReader.java:280)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.read(BufferedReader.java:183)
            org.apache.commons.csv.ExtendedBufferedReader.lookAhead(ExtendedBufferedReader.java:139)
            org.apache.commons.csv.Lexer.readEndOfLine(Lexer.java:133) */
        cSVLexer.readEndOfLine(13);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readEndOfLine(int)
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEndOfLine(int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadEndOfLine_ThrowIOException() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        InputStreamReader in1 = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in1, "java.io.InputStreamReader", "sd", sd);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "markedChar", -255);
        setField(in, "java.io.BufferedReader", "readAheadLimit", -255);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        cSVLexer.readEndOfLine(13);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEndOfLine(int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadEndOfLine_ThrowIOException_1() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        InputStreamReader in1 = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\u0000');
        Object bb = createInstance("java.nio.DirectByteBufferR");
        setField(bb, "java.nio.Buffer", "position", 572662274);
        setField(bb, "java.nio.Buffer", "limit", 572662274);
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        ZipInputStream in2 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in2, "java.util.zip.ZipInputStream", "closed", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in2);
        setField(in1, "java.io.InputStreamReader", "sd", sd);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000', '\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", -1);
        setField(in, "java.io.BufferedReader", "nextChar", -1);
        setField(in, "java.io.BufferedReader", "markedChar", -255);
        setField(in, "java.io.BufferedReader", "readAheadLimit", -255);
        setField(in, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(in, "java.io.Reader", "lock", lock);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        cSVLexer.readEndOfLine(13);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEndOfLine(int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadEndOfLine_ThrowIOException_2() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        FileReader in2 = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in2, "java.io.InputStreamReader", "sd", sd);
        setField(in1, "java.io.BufferedReader", "in", in2);
        char[] cb = {'\u0000'};
        setField(in1, "java.io.BufferedReader", "cb", cb);
        setField(in1, "java.io.BufferedReader", "nChars", 10518530);
        setField(in1, "java.io.BufferedReader", "nextChar", 10518530);
        setField(in1, "java.io.BufferedReader", "markedChar", -1);
        Object lock = createInstance("java.lang.Object");
        setField(in1, "java.io.Reader", "lock", lock);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb1 = {'\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb1);
        setField(in, "java.io.BufferedReader", "nChars", -1);
        setField(in, "java.io.BufferedReader", "nextChar", -1);
        setField(in, "java.io.BufferedReader", "markedChar", -255);
        setField(in, "java.io.BufferedReader", "readAheadLimit", -255);
        Object lock1 = createInstance("java.lang.Object");
        setField(in, "java.io.Reader", "lock", lock1);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        cSVLexer.readEndOfLine(13);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEndOfLine(int)}
 * @utbot.throwsException {@link java.io.IOException} when: c == CR && in.lookAhead() == LF
 *  */
    @Test(expected = IOException.class)
    public void testReadEndOfLine_ThrowIOException_3() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in1 = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\u0000');
        Object bb = createInstance("java.nio.DirectByteBufferR");
        setField(bb, "java.nio.Buffer", "position", 572662274);
        setField(bb, "java.nio.Buffer", "limit", 572662274);
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        ZipInputStream in2 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in2, "java.util.zip.ZipInputStream", "entryEOF", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in2);
        setField(in1, "java.io.InputStreamReader", "sd", sd);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000', '\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", -1);
        setField(in, "java.io.BufferedReader", "nextChar", -1);
        setField(in, "java.io.BufferedReader", "markedChar", -255);
        setField(in, "java.io.BufferedReader", "readAheadLimit", -255);
        setField(in, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(in, "java.io.Reader", "lock", lock);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        cSVLexer.readEndOfLine(13);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEndOfLine(int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadEndOfLine_ThrowIOException_4() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        InputStreamReader in1 = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\u0000');
        Object bb = createInstance("java.nio.DirectByteBufferR");
        setField(bb, "java.nio.Buffer", "position", 572662274);
        setField(bb, "java.nio.Buffer", "limit", 572662274);
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        DataInputStream in2 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        ZipInputStream in3 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in3, "java.util.zip.ZipInputStream", "closed", true);
        setField(in2, "java.io.FilterInputStream", "in", in3);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in2);
        setField(in1, "java.io.InputStreamReader", "sd", sd);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000', '\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", -1);
        setField(in, "java.io.BufferedReader", "nextChar", -1);
        setField(in, "java.io.BufferedReader", "markedChar", -255);
        setField(in, "java.io.BufferedReader", "readAheadLimit", -255);
        setField(in, "java.io.BufferedReader", "skipLF", true);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        cSVLexer.readEndOfLine(13);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEndOfLine(int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadEndOfLine_ThrowIOException_5() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        FileReader in2 = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in2, "java.io.InputStreamReader", "sd", sd);
        setField(in1, "java.io.BufferedReader", "in", in2);
        char[] cb = {'\n', '\u0000'};
        setField(in1, "java.io.BufferedReader", "cb", cb);
        setField(in1, "java.io.BufferedReader", "nChars", 2);
        setField(in1, "java.io.BufferedReader", "skipLF", true);
        setField(in, "java.io.BufferedReader", "in", in1);
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", -1);
        setField(in, "java.io.BufferedReader", "nextChar", -1);
        setField(in, "java.io.BufferedReader", "markedChar", -255);
        setField(in, "java.io.BufferedReader", "readAheadLimit", -255);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        cSVLexer.readEndOfLine(13);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEndOfLine(int)}
 * @utbot.throwsException {@link java.io.IOException} when: c == CR && in.lookAhead() == LF
 *  */
    @Test(expected = IOException.class)
    public void testReadEndOfLine_ThrowIOException_6() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        InputStreamReader in1 = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\u0000');
        Object bb = createInstance("java.nio.DirectByteBufferR");
        setField(bb, "java.nio.Buffer", "position", 572662274);
        setField(bb, "java.nio.Buffer", "limit", 572662274);
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        DataInputStream in2 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        DataInputStream in3 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        ZipInputStream in4 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in4, "java.util.zip.ZipInputStream", "entryEOF", true);
        setField(in3, "java.io.FilterInputStream", "in", in4);
        setField(in2, "java.io.FilterInputStream", "in", in3);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in2);
        setField(in1, "java.io.InputStreamReader", "sd", sd);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000', '\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", -1);
        setField(in, "java.io.BufferedReader", "nextChar", -1);
        setField(in, "java.io.BufferedReader", "markedChar", -255);
        setField(in, "java.io.BufferedReader", "readAheadLimit", -255);
        Object lock = createInstance("java.lang.Object");
        setField(in, "java.io.Reader", "lock", lock);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        cSVLexer.readEndOfLine(13);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method readEndOfLine(int)
    
    @Test
    public void testReadEndOfLine1() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        Reader in2 = ((Reader) createInstance("java.io.Reader$1"));
        setField(in1, "java.io.BufferedReader", "in", in2);
        char[] cb = {'\u0000'};
        setField(in1, "java.io.BufferedReader", "cb", cb);
        setField(in1, "java.io.BufferedReader", "nextChar", -1);
        Object lock = createInstance("java.lang.Object");
        setField(in1, "java.io.Reader", "lock", lock);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb1 = {};
        setField(in, "java.io.BufferedReader", "cb", cb1);
        setField(in, "java.io.BufferedReader", "markedChar", -255);
        setField(in, "java.io.BufferedReader", "readAheadLimit", -255);
        setField(in, "java.io.Reader", "lock", lock);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        /* This test fails because method [org.apache.commons.csv.Lexer.readEndOfLine] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for char[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.BufferedReader.read1(BufferedReader.java:227)
            java.base/java.io.BufferedReader.read(BufferedReader.java:287)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.read(BufferedReader.java:183)
            org.apache.commons.csv.ExtendedBufferedReader.lookAhead(ExtendedBufferedReader.java:139)
            org.apache.commons.csv.Lexer.readEndOfLine(Lexer.java:133) */
        cSVLexer.readEndOfLine(13);
    }
    ///endregion
    
    ///region Errors report for readEndOfLine
    
    public void testReadEndOfLine_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 46 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 24 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.Lexer.readEscape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readEscape()
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEscape()}
 * @utbot.activatesSwitch {@code switch(c) case: 't'}
 * @utbot.returnsFrom {@code return TAB;}
 *  */
    @Test
    public void testReadEscape_ReturnTAB() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        InputStreamReader in1 = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", 't');
        setField(in1, "java.io.InputStreamReader", "sd", sd);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", 3);
        setField(in, "java.io.BufferedReader", "nextChar", 3);
        setField(in, "java.io.BufferedReader", "readAheadLimit", 3);
        setField(in, "java.io.BufferedReader", "skipLF", true);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        int actual = cSVLexer.readEscape();
        
        assertEquals(9, actual);
        
        ExtendedBufferedReader extendedBufferedReader = cSVLexer.in;
        int finalCSVLexerInLastChar = ((Integer) getFieldValue(extendedBufferedReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        ExtendedBufferedReader extendedBufferedReader1 = cSVLexer.in;
        Reader extendedBufferedReader1InIn = ((Reader) getFieldValue(extendedBufferedReader1, "java.io.BufferedReader", "in"));
        StreamDecoder extendedBufferedReader1InInInInSd = ((StreamDecoder) getFieldValue(extendedBufferedReader1InIn, "java.io.InputStreamReader", "sd"));
        boolean finalCSVLexerInInSdHaveLeftoverChar = ((Boolean) getFieldValue(extendedBufferedReader1InInInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        ExtendedBufferedReader extendedBufferedReader2 = cSVLexer.in;
        char[] extendedBufferedReader2InCb = ((char[]) getFieldValue(extendedBufferedReader2, "java.io.BufferedReader", "cb"));
        char finalCSVLexerInCb0 = ((Character) get(extendedBufferedReader2InCb, 0));
        ExtendedBufferedReader extendedBufferedReader3 = cSVLexer.in;
        int finalCSVLexerInNChars = ((Integer) getFieldValue(extendedBufferedReader3, "java.io.BufferedReader", "nChars"));
        ExtendedBufferedReader extendedBufferedReader4 = cSVLexer.in;
        int finalCSVLexerInNextChar = ((Integer) getFieldValue(extendedBufferedReader4, "java.io.BufferedReader", "nextChar"));
        ExtendedBufferedReader extendedBufferedReader5 = cSVLexer.in;
        int finalCSVLexerInMarkedChar = ((Integer) getFieldValue(extendedBufferedReader5, "java.io.BufferedReader", "markedChar"));
        ExtendedBufferedReader extendedBufferedReader6 = cSVLexer.in;
        int finalCSVLexerInReadAheadLimit = ((Integer) getFieldValue(extendedBufferedReader6, "java.io.BufferedReader", "readAheadLimit"));
        ExtendedBufferedReader extendedBufferedReader7 = cSVLexer.in;
        boolean finalCSVLexerInSkipLF = ((Boolean) getFieldValue(extendedBufferedReader7, "java.io.BufferedReader", "skipLF"));
        
        assertEquals(116, finalCSVLexerInLastChar);
        
        assertFalse(finalCSVLexerInInSdHaveLeftoverChar);
        
        assertEquals('t', finalCSVLexerInCb0);
        
        assertEquals(1, finalCSVLexerInNChars);
        
        assertEquals(1, finalCSVLexerInNextChar);
        
        assertEquals(-2, finalCSVLexerInMarkedChar);
        
        assertEquals(0, finalCSVLexerInReadAheadLimit);
        
        assertFalse(finalCSVLexerInSkipLF);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEscape()}
 *  */
    @Test
    public void testReadEscape() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in1 = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", 'n');
        Object bb = createInstance("java.nio.HeapByteBufferR");
        setField(bb, "java.nio.Buffer", "position", 20971520);
        setField(bb, "java.nio.Buffer", "limit", 20971520);
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        ZipInputStream in2 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in2, "java.util.zip.ZipInputStream", "closed", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in2);
        setField(in1, "java.io.InputStreamReader", "sd", sd);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000', '\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", -254);
        setField(in, "java.io.BufferedReader", "nextChar", -254);
        setField(in, "java.io.BufferedReader", "readAheadLimit", -254);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        int actual = cSVLexer.readEscape();
        
        assertEquals(10, actual);
        
        ExtendedBufferedReader extendedBufferedReader = cSVLexer.in;
        int finalCSVLexerInLastChar = ((Integer) getFieldValue(extendedBufferedReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        ExtendedBufferedReader extendedBufferedReader1 = cSVLexer.in;
        Reader extendedBufferedReader1InIn = ((Reader) getFieldValue(extendedBufferedReader1, "java.io.BufferedReader", "in"));
        StreamDecoder extendedBufferedReader1InInInInSd = ((StreamDecoder) getFieldValue(extendedBufferedReader1InIn, "java.io.InputStreamReader", "sd"));
        boolean finalCSVLexerInInSdHaveLeftoverChar = ((Boolean) getFieldValue(extendedBufferedReader1InInInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        ExtendedBufferedReader extendedBufferedReader2 = cSVLexer.in;
        char[] extendedBufferedReader2InCb = ((char[]) getFieldValue(extendedBufferedReader2, "java.io.BufferedReader", "cb"));
        char finalCSVLexerInCb0 = ((Character) get(extendedBufferedReader2InCb, 0));
        ExtendedBufferedReader extendedBufferedReader3 = cSVLexer.in;
        int finalCSVLexerInNChars = ((Integer) getFieldValue(extendedBufferedReader3, "java.io.BufferedReader", "nChars"));
        ExtendedBufferedReader extendedBufferedReader4 = cSVLexer.in;
        int finalCSVLexerInNextChar = ((Integer) getFieldValue(extendedBufferedReader4, "java.io.BufferedReader", "nextChar"));
        ExtendedBufferedReader extendedBufferedReader5 = cSVLexer.in;
        int finalCSVLexerInMarkedChar = ((Integer) getFieldValue(extendedBufferedReader5, "java.io.BufferedReader", "markedChar"));
        ExtendedBufferedReader extendedBufferedReader6 = cSVLexer.in;
        int finalCSVLexerInReadAheadLimit = ((Integer) getFieldValue(extendedBufferedReader6, "java.io.BufferedReader", "readAheadLimit"));
        
        assertEquals(110, finalCSVLexerInLastChar);
        
        assertFalse(finalCSVLexerInInSdHaveLeftoverChar);
        
        assertEquals('n', finalCSVLexerInCb0);
        
        assertEquals(1, finalCSVLexerInNChars);
        
        assertEquals(1, finalCSVLexerInNextChar);
        
        assertEquals(-2, finalCSVLexerInMarkedChar);
        
        assertEquals(0, finalCSVLexerInReadAheadLimit);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEscape()}
 *  */
    @Test
    public void testReadEscape_1() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in1 = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", 'r');
        Object bb = createInstance("java.nio.HeapByteBufferR");
        setField(bb, "java.nio.Buffer", "position", -536764397);
        setField(bb, "java.nio.Buffer", "limit", -536764397);
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        DataInputStream in2 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        ZipInputStream in3 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in3, "java.util.zip.ZipInputStream", "closed", true);
        setField(in2, "java.io.FilterInputStream", "in", in3);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in2);
        setField(in1, "java.io.InputStreamReader", "sd", sd);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000', '\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", 128);
        setField(in, "java.io.BufferedReader", "nextChar", 128);
        setField(in, "java.io.BufferedReader", "readAheadLimit", 128);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        int actual = cSVLexer.readEscape();
        
        assertEquals(13, actual);
        
        ExtendedBufferedReader extendedBufferedReader = cSVLexer.in;
        int finalCSVLexerInLastChar = ((Integer) getFieldValue(extendedBufferedReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        ExtendedBufferedReader extendedBufferedReader1 = cSVLexer.in;
        Reader extendedBufferedReader1InIn = ((Reader) getFieldValue(extendedBufferedReader1, "java.io.BufferedReader", "in"));
        StreamDecoder extendedBufferedReader1InInInInSd = ((StreamDecoder) getFieldValue(extendedBufferedReader1InIn, "java.io.InputStreamReader", "sd"));
        boolean finalCSVLexerInInSdHaveLeftoverChar = ((Boolean) getFieldValue(extendedBufferedReader1InInInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        ExtendedBufferedReader extendedBufferedReader2 = cSVLexer.in;
        char[] extendedBufferedReader2InCb = ((char[]) getFieldValue(extendedBufferedReader2, "java.io.BufferedReader", "cb"));
        char finalCSVLexerInCb0 = ((Character) get(extendedBufferedReader2InCb, 0));
        ExtendedBufferedReader extendedBufferedReader3 = cSVLexer.in;
        int finalCSVLexerInNChars = ((Integer) getFieldValue(extendedBufferedReader3, "java.io.BufferedReader", "nChars"));
        ExtendedBufferedReader extendedBufferedReader4 = cSVLexer.in;
        int finalCSVLexerInNextChar = ((Integer) getFieldValue(extendedBufferedReader4, "java.io.BufferedReader", "nextChar"));
        ExtendedBufferedReader extendedBufferedReader5 = cSVLexer.in;
        int finalCSVLexerInMarkedChar = ((Integer) getFieldValue(extendedBufferedReader5, "java.io.BufferedReader", "markedChar"));
        ExtendedBufferedReader extendedBufferedReader6 = cSVLexer.in;
        int finalCSVLexerInReadAheadLimit = ((Integer) getFieldValue(extendedBufferedReader6, "java.io.BufferedReader", "readAheadLimit"));
        
        assertEquals(114, finalCSVLexerInLastChar);
        
        assertFalse(finalCSVLexerInInSdHaveLeftoverChar);
        
        assertEquals('r', finalCSVLexerInCb0);
        
        assertEquals(1, finalCSVLexerInNChars);
        
        assertEquals(1, finalCSVLexerInNextChar);
        
        assertEquals(-2, finalCSVLexerInMarkedChar);
        
        assertEquals(0, finalCSVLexerInReadAheadLimit);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEscape()}
 * @utbot.activatesSwitch {@code switch(c) case: 'r'}
 * @utbot.returnsFrom {@code return CR;}
 *  */
    @Test
    public void testReadEscape_SwitchCCaser() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in2 = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", 'r');
        setField(in2, "java.io.InputStreamReader", "sd", sd);
        setField(in1, "java.io.BufferedReader", "in", in2);
        char[] cb = {'\u0000'};
        setField(in1, "java.io.BufferedReader", "cb", cb);
        setField(in1, "java.io.BufferedReader", "nChars", -2143242047);
        setField(in1, "java.io.BufferedReader", "nextChar", -2143242047);
        setField(in1, "java.io.BufferedReader", "markedChar", -1);
        setField(in, "java.io.BufferedReader", "in", in1);
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", 3);
        setField(in, "java.io.BufferedReader", "nextChar", 3);
        setField(in, "java.io.BufferedReader", "readAheadLimit", 3);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        int actual = cSVLexer.readEscape();
        
        assertEquals(13, actual);
        
        ExtendedBufferedReader extendedBufferedReader = cSVLexer.in;
        int finalCSVLexerInLastChar = ((Integer) getFieldValue(extendedBufferedReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        ExtendedBufferedReader extendedBufferedReader1 = cSVLexer.in;
        Reader extendedBufferedReader1InIn = ((Reader) getFieldValue(extendedBufferedReader1, "java.io.BufferedReader", "in"));
        Reader extendedBufferedReader1InInInInIn = ((Reader) getFieldValue(extendedBufferedReader1InIn, "java.io.BufferedReader", "in"));
        StreamDecoder extendedBufferedReader1InInInInInInInInSd = ((StreamDecoder) getFieldValue(extendedBufferedReader1InInInInIn, "java.io.InputStreamReader", "sd"));
        boolean finalCSVLexerInInInSdHaveLeftoverChar = ((Boolean) getFieldValue(extendedBufferedReader1InInInInInInInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        ExtendedBufferedReader extendedBufferedReader2 = cSVLexer.in;
        Reader extendedBufferedReader2InIn = ((Reader) getFieldValue(extendedBufferedReader2, "java.io.BufferedReader", "in"));
        char[] extendedBufferedReader2InInInInCb = ((char[]) getFieldValue(extendedBufferedReader2InIn, "java.io.BufferedReader", "cb"));
        char finalCSVLexerInInCb0 = ((Character) get(extendedBufferedReader2InInInInCb, 0));
        ExtendedBufferedReader extendedBufferedReader3 = cSVLexer.in;
        char[] extendedBufferedReader3InCb = ((char[]) getFieldValue(extendedBufferedReader3, "java.io.BufferedReader", "cb"));
        char finalCSVLexerInCb0 = ((Character) get(extendedBufferedReader3InCb, 0));
        ExtendedBufferedReader extendedBufferedReader4 = cSVLexer.in;
        int finalCSVLexerInNChars = ((Integer) getFieldValue(extendedBufferedReader4, "java.io.BufferedReader", "nChars"));
        ExtendedBufferedReader extendedBufferedReader5 = cSVLexer.in;
        int finalCSVLexerInNextChar = ((Integer) getFieldValue(extendedBufferedReader5, "java.io.BufferedReader", "nextChar"));
        ExtendedBufferedReader extendedBufferedReader6 = cSVLexer.in;
        int finalCSVLexerInMarkedChar = ((Integer) getFieldValue(extendedBufferedReader6, "java.io.BufferedReader", "markedChar"));
        ExtendedBufferedReader extendedBufferedReader7 = cSVLexer.in;
        int finalCSVLexerInReadAheadLimit = ((Integer) getFieldValue(extendedBufferedReader7, "java.io.BufferedReader", "readAheadLimit"));
        
        assertEquals(114, finalCSVLexerInLastChar);
        
        assertFalse(finalCSVLexerInInInSdHaveLeftoverChar);
        
        assertEquals('r', finalCSVLexerInInCb0);
        
        assertEquals('r', finalCSVLexerInCb0);
        
        assertEquals(1, finalCSVLexerInNChars);
        
        assertEquals(1, finalCSVLexerInNextChar);
        
        assertEquals(-2, finalCSVLexerInMarkedChar);
        
        assertEquals(0, finalCSVLexerInReadAheadLimit);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEscape()}
 *  */
    @Test
    public void testReadEscape_ReturnC() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(in, "org.apache.commons.csv.ExtendedBufferedReader", "lineCounter", 0L);
        BufferedReader in1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in2 = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\u0000');
        setField(in2, "java.io.InputStreamReader", "sd", sd);
        setField(in1, "java.io.BufferedReader", "in", in2);
        char[] cb = {'\r'};
        setField(in1, "java.io.BufferedReader", "cb", cb);
        setField(in1, "java.io.BufferedReader", "nChars", 1);
        setField(in1, "java.io.BufferedReader", "markedChar", -1);
        setField(in1, "java.io.BufferedReader", "skipLF", true);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb1 = {'\u0000', '\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb1);
        setField(in, "java.io.BufferedReader", "nChars", -253);
        setField(in, "java.io.BufferedReader", "nextChar", -253);
        setField(in, "java.io.BufferedReader", "readAheadLimit", -253);
        Object lock = createInstance("java.lang.Object");
        setField(in, "java.io.Reader", "lock", lock);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        int actual = cSVLexer.readEscape();
        
        assertEquals(13, actual);
        
        ExtendedBufferedReader extendedBufferedReader = cSVLexer.in;
        int finalCSVLexerInLastChar = ((Integer) getFieldValue(extendedBufferedReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        ExtendedBufferedReader extendedBufferedReader1 = cSVLexer.in;
        long finalCSVLexerInLineCounter = ((Long) getFieldValue(extendedBufferedReader1, "org.apache.commons.csv.ExtendedBufferedReader", "lineCounter"));
        ExtendedBufferedReader extendedBufferedReader2 = cSVLexer.in;
        Reader extendedBufferedReader2InIn = ((Reader) getFieldValue(extendedBufferedReader2, "java.io.BufferedReader", "in"));
        Reader extendedBufferedReader2InInInInIn = ((Reader) getFieldValue(extendedBufferedReader2InIn, "java.io.BufferedReader", "in"));
        StreamDecoder extendedBufferedReader2InInInInInInInInSd = ((StreamDecoder) getFieldValue(extendedBufferedReader2InInInInIn, "java.io.InputStreamReader", "sd"));
        boolean finalCSVLexerInInInSdHaveLeftoverChar = ((Boolean) getFieldValue(extendedBufferedReader2InInInInInInInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        ExtendedBufferedReader extendedBufferedReader3 = cSVLexer.in;
        Reader extendedBufferedReader3InIn = ((Reader) getFieldValue(extendedBufferedReader3, "java.io.BufferedReader", "in"));
        int finalCSVLexerInInNextChar = ((Integer) getFieldValue(extendedBufferedReader3InIn, "java.io.BufferedReader", "nextChar"));
        ExtendedBufferedReader extendedBufferedReader4 = cSVLexer.in;
        Reader extendedBufferedReader4InIn = ((Reader) getFieldValue(extendedBufferedReader4, "java.io.BufferedReader", "in"));
        boolean finalCSVLexerInInSkipLF = ((Boolean) getFieldValue(extendedBufferedReader4InIn, "java.io.BufferedReader", "skipLF"));
        ExtendedBufferedReader extendedBufferedReader5 = cSVLexer.in;
        char[] extendedBufferedReader5InCb = ((char[]) getFieldValue(extendedBufferedReader5, "java.io.BufferedReader", "cb"));
        char finalCSVLexerInCb0 = ((Character) get(extendedBufferedReader5InCb, 0));
        ExtendedBufferedReader extendedBufferedReader6 = cSVLexer.in;
        int finalCSVLexerInNChars = ((Integer) getFieldValue(extendedBufferedReader6, "java.io.BufferedReader", "nChars"));
        ExtendedBufferedReader extendedBufferedReader7 = cSVLexer.in;
        int finalCSVLexerInNextChar = ((Integer) getFieldValue(extendedBufferedReader7, "java.io.BufferedReader", "nextChar"));
        ExtendedBufferedReader extendedBufferedReader8 = cSVLexer.in;
        int finalCSVLexerInMarkedChar = ((Integer) getFieldValue(extendedBufferedReader8, "java.io.BufferedReader", "markedChar"));
        ExtendedBufferedReader extendedBufferedReader9 = cSVLexer.in;
        int finalCSVLexerInReadAheadLimit = ((Integer) getFieldValue(extendedBufferedReader9, "java.io.BufferedReader", "readAheadLimit"));
        
        assertEquals(13, finalCSVLexerInLastChar);
        
        assertEquals(1L, finalCSVLexerInLineCounter);
        
        assertFalse(finalCSVLexerInInInSdHaveLeftoverChar);
        
        assertEquals(1, finalCSVLexerInInNextChar);
        
        assertFalse(finalCSVLexerInInSkipLF);
        
        assertEquals('\r', finalCSVLexerInCb0);
        
        assertEquals(2, finalCSVLexerInNChars);
        
        assertEquals(1, finalCSVLexerInNextChar);
        
        assertEquals(-2, finalCSVLexerInMarkedChar);
        
        assertEquals(0, finalCSVLexerInReadAheadLimit);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEscape()}
 * @utbot.activatesSwitch {@code switch(c) case: 'n'}
 * @utbot.returnsFrom {@code return LF;}
 *  */
    @Test
    public void testReadEscape_SwitchCCasen() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in1 = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", 'n');
        Object bb = createInstance("java.nio.HeapByteBufferR");
        setField(bb, "java.nio.Buffer", "position", -536764397);
        setField(bb, "java.nio.Buffer", "limit", -536764397);
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        ZipInputStream in2 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in2, "java.util.zip.ZipInputStream", "entryEOF", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in2);
        setField(in1, "java.io.InputStreamReader", "sd", sd);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000', '\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", -255);
        setField(in, "java.io.BufferedReader", "nextChar", -255);
        setField(in, "java.io.BufferedReader", "markedChar", -1);
        setField(in, "java.io.BufferedReader", "skipLF", true);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        int actual = cSVLexer.readEscape();
        
        assertEquals(10, actual);
        
        ExtendedBufferedReader extendedBufferedReader = cSVLexer.in;
        int finalCSVLexerInLastChar = ((Integer) getFieldValue(extendedBufferedReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        ExtendedBufferedReader extendedBufferedReader1 = cSVLexer.in;
        Reader extendedBufferedReader1InIn = ((Reader) getFieldValue(extendedBufferedReader1, "java.io.BufferedReader", "in"));
        StreamDecoder extendedBufferedReader1InInInInSd = ((StreamDecoder) getFieldValue(extendedBufferedReader1InIn, "java.io.InputStreamReader", "sd"));
        boolean finalCSVLexerInInSdHaveLeftoverChar = ((Boolean) getFieldValue(extendedBufferedReader1InInInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        ExtendedBufferedReader extendedBufferedReader2 = cSVLexer.in;
        char[] extendedBufferedReader2InCb = ((char[]) getFieldValue(extendedBufferedReader2, "java.io.BufferedReader", "cb"));
        char finalCSVLexerInCb0 = ((Character) get(extendedBufferedReader2InCb, 0));
        ExtendedBufferedReader extendedBufferedReader3 = cSVLexer.in;
        int finalCSVLexerInNChars = ((Integer) getFieldValue(extendedBufferedReader3, "java.io.BufferedReader", "nChars"));
        ExtendedBufferedReader extendedBufferedReader4 = cSVLexer.in;
        int finalCSVLexerInNextChar = ((Integer) getFieldValue(extendedBufferedReader4, "java.io.BufferedReader", "nextChar"));
        ExtendedBufferedReader extendedBufferedReader5 = cSVLexer.in;
        boolean finalCSVLexerInSkipLF = ((Boolean) getFieldValue(extendedBufferedReader5, "java.io.BufferedReader", "skipLF"));
        
        assertEquals(110, finalCSVLexerInLastChar);
        
        assertFalse(finalCSVLexerInInSdHaveLeftoverChar);
        
        assertEquals('n', finalCSVLexerInCb0);
        
        assertEquals(1, finalCSVLexerInNChars);
        
        assertEquals(1, finalCSVLexerInNextChar);
        
        assertFalse(finalCSVLexerInSkipLF);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEscape()}
 * @utbot.activatesSwitch {@code switch(c) case: 'f'}
 * @utbot.returnsFrom {@code return FF;}
 *  */
    @Test
    public void testReadEscape_ReturnFF() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in1 = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", 'f');
        Object bb = createInstance("java.nio.HeapByteBufferR");
        setField(bb, "java.nio.Buffer", "position", -536764397);
        setField(bb, "java.nio.Buffer", "limit", -536764397);
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        setField(in1, "java.io.InputStreamReader", "sd", sd);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000', '\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", 24);
        setField(in, "java.io.BufferedReader", "nextChar", 24);
        setField(in, "java.io.BufferedReader", "readAheadLimit", 24);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        int actual = cSVLexer.readEscape();
        
        assertEquals(12, actual);
        
        ExtendedBufferedReader extendedBufferedReader = cSVLexer.in;
        int finalCSVLexerInLastChar = ((Integer) getFieldValue(extendedBufferedReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        ExtendedBufferedReader extendedBufferedReader1 = cSVLexer.in;
        Reader extendedBufferedReader1InIn = ((Reader) getFieldValue(extendedBufferedReader1, "java.io.BufferedReader", "in"));
        StreamDecoder extendedBufferedReader1InInInInSd = ((StreamDecoder) getFieldValue(extendedBufferedReader1InIn, "java.io.InputStreamReader", "sd"));
        boolean finalCSVLexerInInSdHaveLeftoverChar = ((Boolean) getFieldValue(extendedBufferedReader1InInInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        ExtendedBufferedReader extendedBufferedReader2 = cSVLexer.in;
        char[] extendedBufferedReader2InCb = ((char[]) getFieldValue(extendedBufferedReader2, "java.io.BufferedReader", "cb"));
        char finalCSVLexerInCb0 = ((Character) get(extendedBufferedReader2InCb, 0));
        ExtendedBufferedReader extendedBufferedReader3 = cSVLexer.in;
        int finalCSVLexerInNChars = ((Integer) getFieldValue(extendedBufferedReader3, "java.io.BufferedReader", "nChars"));
        ExtendedBufferedReader extendedBufferedReader4 = cSVLexer.in;
        int finalCSVLexerInNextChar = ((Integer) getFieldValue(extendedBufferedReader4, "java.io.BufferedReader", "nextChar"));
        ExtendedBufferedReader extendedBufferedReader5 = cSVLexer.in;
        int finalCSVLexerInMarkedChar = ((Integer) getFieldValue(extendedBufferedReader5, "java.io.BufferedReader", "markedChar"));
        ExtendedBufferedReader extendedBufferedReader6 = cSVLexer.in;
        int finalCSVLexerInReadAheadLimit = ((Integer) getFieldValue(extendedBufferedReader6, "java.io.BufferedReader", "readAheadLimit"));
        
        assertEquals(102, finalCSVLexerInLastChar);
        
        assertFalse(finalCSVLexerInInSdHaveLeftoverChar);
        
        assertEquals('f', finalCSVLexerInCb0);
        
        assertEquals(1, finalCSVLexerInNChars);
        
        assertEquals(1, finalCSVLexerInNextChar);
        
        assertEquals(-2, finalCSVLexerInMarkedChar);
        
        assertEquals(0, finalCSVLexerInReadAheadLimit);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEscape()}
 * @utbot.activatesSwitch {@code switch(c) case: default}
 *  */
    @Test
    public void testReadEscape_SwitchCCasedefault() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(in, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", 13);
        FileReader in1 = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\n');
        Object bb = createInstance("java.nio.DirectByteBufferR");
        setField(bb, "java.nio.Buffer", "position", -536764398);
        setField(bb, "java.nio.Buffer", "limit", -536764398);
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        DataInputStream in2 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        ZipInputStream in3 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in3, "java.util.zip.ZipInputStream", "entryEOF", true);
        setField(in2, "java.io.FilterInputStream", "in", in3);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in2);
        setField(in1, "java.io.InputStreamReader", "sd", sd);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000', '\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", 1);
        setField(in, "java.io.BufferedReader", "nextChar", 1);
        setField(in, "java.io.BufferedReader", "readAheadLimit", 34);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        ExtendedBufferedReader extendedBufferedReader = cSVLexer.in;
        char[] initialCSVLexerInCb = ((char[]) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "cb"));
        
        int actual = cSVLexer.readEscape();
        
        assertEquals(10, actual);
        
        ExtendedBufferedReader extendedBufferedReader1 = cSVLexer.in;
        int finalCSVLexerInLastChar = ((Integer) getFieldValue(extendedBufferedReader1, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        ExtendedBufferedReader extendedBufferedReader2 = cSVLexer.in;
        Reader extendedBufferedReader2InIn = ((Reader) getFieldValue(extendedBufferedReader2, "java.io.BufferedReader", "in"));
        StreamDecoder extendedBufferedReader2InInInInSd = ((StreamDecoder) getFieldValue(extendedBufferedReader2InIn, "java.io.InputStreamReader", "sd"));
        boolean finalCSVLexerInInSdHaveLeftoverChar = ((Boolean) getFieldValue(extendedBufferedReader2InInInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        ExtendedBufferedReader extendedBufferedReader3 = cSVLexer.in;
        char[] finalCSVLexerInCb = ((char[]) getFieldValue(extendedBufferedReader3, "java.io.BufferedReader", "cb"));
        ExtendedBufferedReader extendedBufferedReader4 = cSVLexer.in;
        int finalCSVLexerInNChars = ((Integer) getFieldValue(extendedBufferedReader4, "java.io.BufferedReader", "nChars"));
        ExtendedBufferedReader extendedBufferedReader5 = cSVLexer.in;
        int finalCSVLexerInNextChar = ((Integer) getFieldValue(extendedBufferedReader5, "java.io.BufferedReader", "nextChar"));
        
        assertFalse(initialCSVLexerInCb == finalCSVLexerInCb);
        
        assertEquals(10, finalCSVLexerInLastChar);
        
        assertFalse(finalCSVLexerInInSdHaveLeftoverChar);
        
        assertEquals(2, finalCSVLexerInNChars);
        
        assertEquals(2, finalCSVLexerInNextChar);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEscape()}
 *  */
    @Test
    public void testReadEscape_ReturnC_1() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(in, "org.apache.commons.csv.ExtendedBufferedReader", "lineCounter", 0L);
        FileReader in1 = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\r');
        Object bb = createInstance("java.nio.DirectByteBufferR");
        setField(bb, "java.nio.Buffer", "position", -536764398);
        setField(bb, "java.nio.Buffer", "limit", -536764398);
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        DataInputStream in2 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        DataInputStream in3 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        ZipInputStream in4 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in4, "java.util.zip.ZipInputStream", "entryEOF", true);
        setField(in3, "java.io.FilterInputStream", "in", in4);
        setField(in2, "java.io.FilterInputStream", "in", in3);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in2);
        setField(in1, "java.io.InputStreamReader", "sd", sd);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000', '\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", 1);
        setField(in, "java.io.BufferedReader", "nextChar", 1);
        setField(in, "java.io.BufferedReader", "readAheadLimit", 34);
        setField(in, "java.io.BufferedReader", "skipLF", true);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        ExtendedBufferedReader extendedBufferedReader = cSVLexer.in;
        char[] initialCSVLexerInCb = ((char[]) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "cb"));
        
        int actual = cSVLexer.readEscape();
        
        assertEquals(13, actual);
        
        ExtendedBufferedReader extendedBufferedReader1 = cSVLexer.in;
        int finalCSVLexerInLastChar = ((Integer) getFieldValue(extendedBufferedReader1, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        ExtendedBufferedReader extendedBufferedReader2 = cSVLexer.in;
        long finalCSVLexerInLineCounter = ((Long) getFieldValue(extendedBufferedReader2, "org.apache.commons.csv.ExtendedBufferedReader", "lineCounter"));
        ExtendedBufferedReader extendedBufferedReader3 = cSVLexer.in;
        Reader extendedBufferedReader3InIn = ((Reader) getFieldValue(extendedBufferedReader3, "java.io.BufferedReader", "in"));
        StreamDecoder extendedBufferedReader3InInInInSd = ((StreamDecoder) getFieldValue(extendedBufferedReader3InIn, "java.io.InputStreamReader", "sd"));
        boolean finalCSVLexerInInSdHaveLeftoverChar = ((Boolean) getFieldValue(extendedBufferedReader3InInInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        ExtendedBufferedReader extendedBufferedReader4 = cSVLexer.in;
        char[] finalCSVLexerInCb = ((char[]) getFieldValue(extendedBufferedReader4, "java.io.BufferedReader", "cb"));
        ExtendedBufferedReader extendedBufferedReader5 = cSVLexer.in;
        int finalCSVLexerInNChars = ((Integer) getFieldValue(extendedBufferedReader5, "java.io.BufferedReader", "nChars"));
        ExtendedBufferedReader extendedBufferedReader6 = cSVLexer.in;
        int finalCSVLexerInNextChar = ((Integer) getFieldValue(extendedBufferedReader6, "java.io.BufferedReader", "nextChar"));
        ExtendedBufferedReader extendedBufferedReader7 = cSVLexer.in;
        boolean finalCSVLexerInSkipLF = ((Boolean) getFieldValue(extendedBufferedReader7, "java.io.BufferedReader", "skipLF"));
        
        assertFalse(initialCSVLexerInCb == finalCSVLexerInCb);
        
        assertEquals(13, finalCSVLexerInLastChar);
        
        assertEquals(1L, finalCSVLexerInLineCounter);
        
        assertFalse(finalCSVLexerInInSdHaveLeftoverChar);
        
        assertEquals(2, finalCSVLexerInNChars);
        
        assertEquals(2, finalCSVLexerInNextChar);
        
        assertFalse(finalCSVLexerInSkipLF);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEscape()}
 * @utbot.activatesSwitch {@code switch(c) case: default}
 *  */
    @Test
    public void testReadEscape_SwitchCCasedefault_1() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in2 = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        Object bb = createInstance("java.nio.HeapByteBufferR");
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        setField(in2, "java.io.InputStreamReader", "sd", sd);
        setField(in1, "java.io.BufferedReader", "in", in2);
        char[] cb = {'\t'};
        setField(in1, "java.io.BufferedReader", "cb", cb);
        setField(in1, "java.io.BufferedReader", "nChars", 1);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb1 = {'\u0000', '\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb1);
        setField(in, "java.io.BufferedReader", "nChars", 10);
        setField(in, "java.io.BufferedReader", "nextChar", 10);
        setField(in, "java.io.BufferedReader", "readAheadLimit", 10);
        setField(in, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(in, "java.io.Reader", "lock", lock);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        int actual = cSVLexer.readEscape();
        
        assertEquals(9, actual);
        
        ExtendedBufferedReader extendedBufferedReader = cSVLexer.in;
        int finalCSVLexerInLastChar = ((Integer) getFieldValue(extendedBufferedReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        ExtendedBufferedReader extendedBufferedReader1 = cSVLexer.in;
        Reader extendedBufferedReader1InIn = ((Reader) getFieldValue(extendedBufferedReader1, "java.io.BufferedReader", "in"));
        int finalCSVLexerInInNextChar = ((Integer) getFieldValue(extendedBufferedReader1InIn, "java.io.BufferedReader", "nextChar"));
        ExtendedBufferedReader extendedBufferedReader2 = cSVLexer.in;
        char[] extendedBufferedReader2InCb = ((char[]) getFieldValue(extendedBufferedReader2, "java.io.BufferedReader", "cb"));
        char finalCSVLexerInCb0 = ((Character) get(extendedBufferedReader2InCb, 0));
        ExtendedBufferedReader extendedBufferedReader3 = cSVLexer.in;
        int finalCSVLexerInNChars = ((Integer) getFieldValue(extendedBufferedReader3, "java.io.BufferedReader", "nChars"));
        ExtendedBufferedReader extendedBufferedReader4 = cSVLexer.in;
        int finalCSVLexerInNextChar = ((Integer) getFieldValue(extendedBufferedReader4, "java.io.BufferedReader", "nextChar"));
        ExtendedBufferedReader extendedBufferedReader5 = cSVLexer.in;
        int finalCSVLexerInMarkedChar = ((Integer) getFieldValue(extendedBufferedReader5, "java.io.BufferedReader", "markedChar"));
        ExtendedBufferedReader extendedBufferedReader6 = cSVLexer.in;
        int finalCSVLexerInReadAheadLimit = ((Integer) getFieldValue(extendedBufferedReader6, "java.io.BufferedReader", "readAheadLimit"));
        ExtendedBufferedReader extendedBufferedReader7 = cSVLexer.in;
        boolean finalCSVLexerInSkipLF = ((Boolean) getFieldValue(extendedBufferedReader7, "java.io.BufferedReader", "skipLF"));
        
        assertEquals(9, finalCSVLexerInLastChar);
        
        assertEquals(1, finalCSVLexerInInNextChar);
        
        assertEquals('\t', finalCSVLexerInCb0);
        
        assertEquals(1, finalCSVLexerInNChars);
        
        assertEquals(1, finalCSVLexerInNextChar);
        
        assertEquals(-2, finalCSVLexerInMarkedChar);
        
        assertEquals(0, finalCSVLexerInReadAheadLimit);
        
        assertFalse(finalCSVLexerInSkipLF);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readEscape()
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEscape()}
 * @utbot.invokes {@link org.apache.commons.csv.ExtendedBufferedReader#read()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int c = in.read();
 *  */
    @Test
    public void testReadEscape_ThrowNullPointerException() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        
        /* This test fails because method [org.apache.commons.csv.Lexer.readEscape] produces [java.lang.NullPointerException]
            org.apache.commons.csv.Lexer.readEscape(Lexer.java:89) */
        cSVLexer.readEscape();
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEscape()}
 * @utbot.activatesSwitch {@code switch(c) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return c;
 *  */
    @Test
    public void testReadEscape_ThrowNullPointerException_1() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        StringReader in1 = ((StringReader) createInstance("java.io.StringReader"));
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", 1);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        /* This test fails because method [org.apache.commons.csv.Lexer.readEscape] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.read(BufferedReader.java:179)
            org.apache.commons.csv.ExtendedBufferedReader.read(ExtendedBufferedReader.java:54)
            org.apache.commons.csv.Lexer.readEscape(Lexer.java:89) */
        cSVLexer.readEscape();
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEscape()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int c = in.read();
 *  */
    @Test
    public void testReadEscape_ThrowNullPointerException_2() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        Reader in2 = ((Reader) createInstance("java.io.Reader$1"));
        setField(in1, "java.io.BufferedReader", "in", in2);
        char[] cb = {'\u0000'};
        setField(in1, "java.io.BufferedReader", "cb", cb);
        setField(in1, "java.io.BufferedReader", "nextChar", -1);
        setField(in1, "java.io.BufferedReader", "skipLF", true);
        setField(in, "java.io.BufferedReader", "in", in1);
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", -254);
        setField(in, "java.io.BufferedReader", "nextChar", -254);
        setField(in, "java.io.BufferedReader", "readAheadLimit", -254);
        Object lock = createInstance("java.lang.Object");
        setField(in, "java.io.Reader", "lock", lock);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        /* This test fails because method [org.apache.commons.csv.Lexer.readEscape] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.read(BufferedReader.java:280)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.read(BufferedReader.java:183)
            org.apache.commons.csv.ExtendedBufferedReader.read(ExtendedBufferedReader.java:54)
            org.apache.commons.csv.Lexer.readEscape(Lexer.java:89) */
        cSVLexer.readEscape();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readEscape()
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEscape()}
 * @utbot.throwsException {@link java.io.IOException} in: final int c = in.read();
 *  */
    @Test(expected = IOException.class)
    public void testReadEscape_ThrowIOException() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in1 = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in1, "java.io.InputStreamReader", "sd", sd);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", -255);
        setField(in, "java.io.BufferedReader", "nextChar", -255);
        setField(in, "java.io.BufferedReader", "markedChar", -1);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        cSVLexer.readEscape();
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEscape()}
 * @utbot.throwsException {@link java.io.IOException} in: final int c = in.read();
 *  */
    @Test(expected = IOException.class)
    public void testReadEscape_ThrowIOException_1() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in2 = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in2, "java.io.InputStreamReader", "sd", sd);
        setField(in1, "java.io.BufferedReader", "in", in2);
        char[] cb = {'\u0000'};
        setField(in1, "java.io.BufferedReader", "cb", cb);
        setField(in1, "java.io.BufferedReader", "nChars", -2000682944);
        setField(in1, "java.io.BufferedReader", "nextChar", -2000682944);
        setField(in1, "java.io.BufferedReader", "markedChar", -1);
        setField(in, "java.io.BufferedReader", "in", in1);
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", -191);
        setField(in, "java.io.BufferedReader", "nextChar", -191);
        setField(in, "java.io.BufferedReader", "readAheadLimit", -191);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        cSVLexer.readEscape();
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEscape()}
 * @utbot.throwsException {@link java.io.IOException} in: final int c = in.read();
 *  */
    @Test(expected = IOException.class)
    public void testReadEscape_ThrowIOException_2() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in2 = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in2, "java.io.InputStreamReader", "sd", sd);
        setField(in1, "java.io.BufferedReader", "in", in2);
        char[] cb = {'\u0000', '\u0000'};
        setField(in1, "java.io.BufferedReader", "cb", cb);
        setField(in1, "java.io.BufferedReader", "nChars", 2);
        setField(in1, "java.io.BufferedReader", "nextChar", 1);
        setField(in1, "java.io.BufferedReader", "skipLF", true);
        setField(in, "java.io.BufferedReader", "in", in1);
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", -253);
        setField(in, "java.io.BufferedReader", "nextChar", -253);
        setField(in, "java.io.BufferedReader", "readAheadLimit", -253);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        cSVLexer.readEscape();
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEscape()}
 * @utbot.throwsException {@link java.io.IOException} in: final int c = in.read();
 *  */
    @Test(expected = IOException.class)
    public void testReadEscape_ThrowIOException_3() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        BufferedReader in2 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in3 = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in3, "java.io.InputStreamReader", "sd", sd);
        setField(in2, "java.io.BufferedReader", "in", in3);
        setField(in2, "java.io.BufferedReader", "nChars", 2);
        setField(in2, "java.io.BufferedReader", "nextChar", 2);
        setField(in1, "java.io.BufferedReader", "in", in2);
        char[] cb = {'\n', '\u0000'};
        setField(in1, "java.io.BufferedReader", "cb", cb);
        setField(in1, "java.io.BufferedReader", "nChars", 2);
        setField(in1, "java.io.BufferedReader", "skipLF", true);
        setField(in, "java.io.BufferedReader", "in", in1);
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", -255);
        setField(in, "java.io.BufferedReader", "nextChar", -255);
        setField(in, "java.io.BufferedReader", "readAheadLimit", -255);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        cSVLexer.readEscape();
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#readEscape()}
 * @utbot.throwsException {@link java.io.IOException} in: final int c = in.read();
 *  */
    @Test(expected = IOException.class)
    public void testReadEscape_ThrowIOException_4() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        ExtendedBufferedReader in = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        BufferedReader in2 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in3 = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in3, "java.io.InputStreamReader", "sd", sd);
        setField(in2, "java.io.BufferedReader", "in", in3);
        setField(in2, "java.io.BufferedReader", "skipLF", true);
        setField(in1, "java.io.BufferedReader", "in", in2);
        char[] cb = {'\u0000', '\u0000'};
        setField(in1, "java.io.BufferedReader", "cb", cb);
        setField(in1, "java.io.BufferedReader", "nChars", 2);
        setField(in1, "java.io.BufferedReader", "nextChar", 1);
        setField(in1, "java.io.BufferedReader", "skipLF", true);
        setField(in, "java.io.BufferedReader", "in", in1);
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", -255);
        setField(in, "java.io.BufferedReader", "nextChar", -255);
        setField(in, "java.io.BufferedReader", "readAheadLimit", -255);
        setField(cSVLexer, "org.apache.commons.csv.Lexer", "in", in);
        
        cSVLexer.readEscape();
    }
    ///endregion
    
    ///region Errors report for readEscape
    
    public void testReadEscape_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 85 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.Lexer.isStartOfLine
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isStartOfLine(int)
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#isStartOfLine(int)}
 * @utbot.returnsFrom {@code return c == LF || c == CR || c == UNDEFINED;}
 *  */
    @Test
    public void testIsStartOfLine_CEqualsLFOrCEqualsCROrCEqualsUNDEFINED() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        
        boolean actual = cSVLexer.isStartOfLine(10);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#isStartOfLine(int)}
 * @utbot.returnsFrom {@code return c == LF || c == CR || c == UNDEFINED;}
 *  */
    @Test
    public void testIsStartOfLine_CNotEqualsLFOrCNotEqualsCROrCNotEqualsUNDEFINED() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        
        boolean actual = cSVLexer.isStartOfLine(-255);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#isStartOfLine(int)}
 * @utbot.returnsFrom {@code return c == LF || c == CR || c == UNDEFINED;}
 *  */
    @Test
    public void testIsStartOfLine_CEqualsLFOrCEqualsCROrCEqualsUNDEFINED_1() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        
        boolean actual = cSVLexer.isStartOfLine(13);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Lexer}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.Lexer#isStartOfLine(int)}
 * @utbot.returnsFrom {@code return c == LF || c == CR || c == UNDEFINED;}
 *  */
    @Test
    public void testIsStartOfLine_CEqualsLFOrCEqualsCROrCEqualsUNDEFINED_2() throws Exception  {
        CSVLexer cSVLexer = ((CSVLexer) createInstance("org.apache.commons.csv.CSVLexer"));
        
        boolean actual = cSVLexer.isStartOfLine(-2);
        
        assertTrue(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields964202222286700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields964202222286700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass964202222295700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields964202222286700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass964202222295700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields964202223783300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields964202223783300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass964202223788600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields964202223783300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass964202223788600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


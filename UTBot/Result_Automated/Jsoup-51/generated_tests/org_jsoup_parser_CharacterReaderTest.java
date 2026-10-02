package org.jsoup.parser;

import org.junit.Test;
import java.lang.reflect.Method;
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
 * @utbot.returnsFrom {@code return new String(input, pos, length - pos);}
 *  */
    @Test
    public void testToString_Return() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        
        String actual = characterReader.toString();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#toString()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return new String(input, pos, length - pos);
 *  */
    @Test
    public void testToString_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.toString] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.toString(CharacterReader.java:337) */
        characterReader.toString();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new String(input, pos, length - pos);
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.toString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.toString(CharacterReader.java:337) */
        characterReader.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmpty()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#isEmpty()}
 * @utbot.returnsFrom {@code return pos >= length;}
 *  */
    @Test
    public void testIsEmpty_PosLessThanLength() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        boolean actual = characterReader.isEmpty();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#isEmpty()}
 * @utbot.returnsFrom {@code return pos >= length;}
 *  */
    @Test
    public void testIsEmpty_PosGreaterOrEqualLength() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        boolean actual = characterReader.isEmpty();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.matches
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matches(char)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(char)}
 * @utbot.returnsFrom {@code return !isEmpty() && input[pos] == c;}
 *  */
    @Test
    public void testMatches_NotIsEmptyAndPosOfInputNotEqualsC_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        boolean actual = characterReader.matches(' ');
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(char)}
 * @utbot.returnsFrom {@code return !isEmpty() && input[pos] == c;}
 *  */
    @Test
    public void testMatches_NotIsEmptyAndPosOfInputNotEqualsC() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1);
        
        boolean actual = characterReader.matches('0');
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(char)}
 * @utbot.returnsFrom {@code return !isEmpty() && input[pos] == c;}
 *  */
    @Test
    public void testMatches_NotIsEmptyAndPosOfInputEqualsC() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        boolean actual = characterReader.matches(' ');
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matches(char)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(char)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return !isEmpty() && input[pos] == c;
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:251) */
        characterReader.matches(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !isEmpty() && input[pos] == c;
 *  */
    @Test
    public void testMatches_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:251) */
        characterReader.matches(' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.matches
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matches(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(java.lang.String)}
 * @utbot.executesCondition {@code (scanLength > length - pos): True}
 *  */
    @Test
    public void testMatches_ScanLengthGreaterThanLengthMinusPos() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String string = " ";
        
        boolean actual = characterReader.matches(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(java.lang.String)}
 * @utbot.executesCondition {@code (scanLength > length - pos): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testMatches_ScanLengthLessOrEqualLengthMinusPos() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -38);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -38);
        String string = "";
        
        boolean actual = characterReader.matches(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(java.lang.String)}
 * @utbot.executesCondition {@code (scanLength > length - pos): False}
 * @utbot.iterates iterate the loop {@code for(int offset = 0; offset < scanLength; offset++)} once
 *  */
    @Test
    public void testMatches_SeqCharAtNotEqualsPosoffsetOfInput() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        String string = "!";
        
        boolean actual = characterReader.matches(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(java.lang.String)}
 * @utbot.executesCondition {@code (scanLength > length - pos): False}
 * @utbot.iterates iterate the loop {@code for(int offset = 0; offset < scanLength; offset++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testMatches_SeqCharAtEqualsPosoffsetOfInput() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        String string = " ";
        
        boolean actual = characterReader.matches(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matches(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(java.lang.String)}
 * @utbot.executesCondition {@code (scanLength > length - pos): False}
 * @utbot.iterates iterate the loop {@code for(int offset = 0; offset < scanLength; offset++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: seq.charAt(offset) != input[pos + offset]
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -256);
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:261) */
        characterReader.matches(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int scanLength = seq.length();
 *  */
    @Test
    public void testMatches_ThrowNullPointerException1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:256) */
        characterReader.matches(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(java.lang.String)}
 * @utbot.executesCondition {@code (scanLength > length - pos): False}
 * @utbot.iterates iterate the loop {@code for(int offset = 0; offset < scanLength; offset++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: seq.charAt(offset) != input[pos + offset]
 *  */
    @Test
    public void testMatches_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -127);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -128);
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:261) */
        characterReader.matches(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.current
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method current()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#current()}
 * @utbot.executesCondition {@code (pos >= length): True}
 * @utbot.returnsFrom {@code return pos >= length ? EOF : input[pos];}
 *  */
    @Test
    public void testCurrent_PosGreaterOrEqualLength() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        char actual = characterReader.current();
        
        assertEquals('\uFFFF', actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#current()}
 * @utbot.executesCondition {@code (pos >= length): False}
 * @utbot.returnsFrom {@code return pos >= length ? EOF : input[pos];}
 *  */
    @Test
    public void testCurrent_PosLessThanLength() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        char actual = characterReader.current();
        
        assertEquals(' ', actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method current()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#current()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: input[pos]
 *  */
    @Test
    public void testCurrent_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.current] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:36) */
        characterReader.current();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#current()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: input[pos]
 *  */
    @Test
    public void testCurrent_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.current] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:36) */
        characterReader.current();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.pos
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method pos()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#pos()}
 * @utbot.returnsFrom {@code return pos;}
 *  */
    @Test
    public void testPos_ReturnPos() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        int actual = characterReader.pos();
        
        assertEquals(-255, actual);
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
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "mark", -255);
        
        characterReader.mark();
        
        int finalCharacterReaderMark = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "mark"));
        
        assertEquals(1, finalCharacterReaderMark);
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
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        characterReader.advance();
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(-254, finalCharacterReaderPos);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consume
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consume()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consume()}
 * @utbot.executesCondition {@code (pos >= length): True}
 * @utbot.returnsFrom {@code return val;}
 *  */
    @Test
    public void testConsume_PosGreaterOrEqualLength() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        char actual = characterReader.consume();
        
        assertEquals('\uFFFF', actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(-254, finalCharacterReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consume()}
 * @utbot.executesCondition {@code (pos >= length): False}
 * @utbot.returnsFrom {@code return val;}
 *  */
    @Test
    public void testConsume_PosLessThanLength() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        char actual = characterReader.consume();
        
        assertEquals(' ', actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(1, finalCharacterReaderPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consume()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consume()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: input[pos]
 *  */
    @Test
    public void testConsume_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consume] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.consume(CharacterReader.java:40) */
        characterReader.consume();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consume()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: input[pos]
 *  */
    @Test
    public void testConsume_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consume] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consume(CharacterReader.java:40) */
        characterReader.consume();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeLetterSequence
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeLetterSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.returnsFrom {@code return cacheString(start, pos - start);}
 *  */
    @Test
    public void testConsumeLetterSequence_CLessOrEqualZ() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'c'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[10];
        String string = "\uFF9C";
        stringCache[1] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeLetterSequence();
        
        String expected = "c";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache1, 2));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache2, 3));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache3, 4));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache4, 5));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache5, 6));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache6, 7));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache7, 8));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache8, 9));
        
        assertEquals(1, finalCharacterReaderPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
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
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.returnsFrom {@code return cacheString(start, pos - start);}
 *  */
    @Test
    public void testConsumeLetterSequence_CLessOrEqualZ_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'c'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[10];
        String string = "c";
        stringCache[1] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeLetterSequence();
        
        assertEquals(string, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache1, 2));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache2, 3));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache3, 4));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache4, 5));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache5, 6));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache6, 7));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache7, 8));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache8, 9));
        
        assertEquals(1, finalCharacterReaderPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
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
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.returnsFrom {@code return cacheString(start, pos - start);}
 *  */
    @Test
    public void testConsumeLetterSequence_CGreaterThanZ() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[40];
        input[0] = ' ';
        input[1] = ' ';
        input[2] = ' ';
        input[3] = ' ';
        input[4] = ' ';
        input[5] = ' ';
        input[6] = ' ';
        input[7] = ' ';
        input[8] = ' ';
        input[9] = ' ';
        input[10] = ' ';
        input[11] = ' ';
        input[12] = ' ';
        input[13] = ' ';
        input[14] = ' ';
        input[15] = '{';
        input[16] = ' ';
        input[17] = ' ';
        input[18] = ' ';
        input[19] = ' ';
        input[20] = ' ';
        input[21] = ' ';
        input[22] = ' ';
        input[23] = ' ';
        input[24] = ' ';
        input[25] = ' ';
        input[26] = ' ';
        input[27] = ' ';
        input[28] = ' ';
        input[29] = ' ';
        input[30] = ' ';
        input[31] = ' ';
        input[32] = ' ';
        input[33] = ' ';
        input[34] = ' ';
        input[35] = ' ';
        input[36] = ' ';
        input[37] = ' ';
        input[38] = ' ';
        input[39] = ' ';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 16);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 15);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeLetterSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.returnsFrom {@code return cacheString(start, pos - start);}
 *  */
    @Test
    public void testConsumeLetterSequence_CLessThanA() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[38];
        input[0] = ' ';
        input[1] = ' ';
        input[2] = ' ';
        input[3] = ' ';
        input[4] = ' ';
        input[5] = ' ';
        input[6] = ' ';
        input[7] = ' ';
        input[8] = ' ';
        input[9] = ' ';
        input[10] = ' ';
        input[11] = ' ';
        input[12] = ' ';
        input[13] = ' ';
        input[14] = ' ';
        input[15] = '`';
        input[16] = ' ';
        input[17] = ' ';
        input[18] = ' ';
        input[19] = ' ';
        input[20] = ' ';
        input[21] = ' ';
        input[22] = ' ';
        input[23] = ' ';
        input[24] = ' ';
        input[25] = ' ';
        input[26] = ' ';
        input[27] = ' ';
        input[28] = ' ';
        input[29] = ' ';
        input[30] = ' ';
        input[31] = ' ';
        input[32] = ' ';
        input[33] = ' ';
        input[34] = ' ';
        input[35] = ' ';
        input[36] = ' ';
        input[37] = ' ';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 16);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 15);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "\u0000";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeLetterSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.returnsFrom {@code return cacheString(start, pos - start);}
 *  */
    @Test
    public void testConsumeLetterSequence_PosGreaterOrEqualLength() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeLetterSequence();
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeLetterSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = input[pos];
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:196) */
        characterReader.consumeLetterSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = input[pos];
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'a'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:196) */
        characterReader.consumeLetterSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'{'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:364)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:203) */
        characterReader.consumeLetterSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[14];
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 15);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 15);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "\u0000";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.StringIndexOutOfBoundsException: offset 15, count 0, length 14]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:373)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:203) */
        characterReader.consumeLetterSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = input[pos];
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:196) */
        characterReader.consumeLetterSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'@'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:203) */
        characterReader.consumeLetterSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'`'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:203) */
        characterReader.consumeLetterSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowNullPointerException_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'a'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:203) */
        characterReader.consumeLetterSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowNullPointerException_5() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:367)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:203) */
        characterReader.consumeLetterSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowNullPointerException_6() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'A'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:203) */
        characterReader.consumeLetterSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowNullPointerException_4() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -254);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -254);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:203) */
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
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.CharacterReader}
     * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
     */
    @Test
    public void testConsumeLetterSequence1() {
        CharacterReader characterReader = new CharacterReader("a");
        
        String actual = characterReader.consumeLetterSequence();
        
        String expected = "a";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchConsumeIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchConsumeIgnoreCase(java.lang.String)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMatchConsumeIgnoreCase_ReturnFalse_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -127);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -128);
        String string = "  ";
        
        boolean actual = characterReader.matchConsumeIgnoreCase(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchConsumeIgnoreCase(java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testMatchConsumeIgnoreCase_ReturnTrue() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -127);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -127);
        String string = "";
        
        boolean actual = characterReader.matchConsumeIgnoreCase(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchConsumeIgnoreCase(java.lang.String)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMatchConsumeIgnoreCase_ReturnFalse() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'\u0000', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1);
        String string = "_";
        
        boolean actual = characterReader.matchConsumeIgnoreCase(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchConsumeIgnoreCase(java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testMatchConsumeIgnoreCase_ReturnTrue_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'`'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        String string = "`";
        
        boolean actual = characterReader.matchConsumeIgnoreCase(string);
        
        assertTrue(actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(1, finalCharacterReaderPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchConsumeIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchConsumeIgnoreCase(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#matchesIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: matchesIgnoreCase(seq)
 *  */
    @Test
    public void testMatchConsumeIgnoreCase_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        String string = "{";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.matchesIgnoreCase(CharacterReader.java:273)
            org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase(CharacterReader.java:320) */
        characterReader.matchConsumeIgnoreCase(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeLetterThenDigitSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.returnsFrom {@code return cacheString(start, pos - start);}
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_NotIsEmpty() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeLetterThenDigitSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.returnsFrom {@code return cacheString(start, pos - start);}
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_CGreaterThan9() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {':'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeLetterThenDigitSequence();
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.returnsFrom {@code return cacheString(start, pos - start);}
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_CLessThan0() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[38];
        input[0] = ' ';
        input[1] = ' ';
        input[2] = ' ';
        input[3] = ' ';
        input[4] = ' ';
        input[5] = ' ';
        input[6] = ' ';
        input[7] = ' ';
        input[8] = ' ';
        input[9] = ' ';
        input[10] = ' ';
        input[11] = ' ';
        input[12] = ' ';
        input[13] = ' ';
        input[14] = ' ';
        input[15] = ' ';
        input[16] = ' ';
        input[17] = ' ';
        input[18] = ' ';
        input[19] = ' ';
        input[20] = ' ';
        input[21] = ' ';
        input[22] = ' ';
        input[23] = ' ';
        input[24] = ' ';
        input[25] = ' ';
        input[26] = ' ';
        input[27] = ' ';
        input[28] = ' ';
        input[29] = ' ';
        input[30] = ' ';
        input[31] = ' ';
        input[32] = ' ';
        input[33] = ' ';
        input[34] = ' ';
        input[35] = ' ';
        input[36] = ' ';
        input[37] = ' ';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 16);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 15);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "\u0000";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeLetterThenDigitSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.returnsFrom {@code return cacheString(start, pos - start);}
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_NotIsEmpty_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'C'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[2];
        String string = "";
        stringCache[0] = string;
        String string1 = "\uFFBC";
        stringCache[1] = string1;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeLetterThenDigitSequence();
        
        String expected = "C";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(1, finalCharacterReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.returnsFrom {@code return cacheString(start, pos - start);}
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_NotIsEmpty_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'C'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[2];
        String string = "";
        stringCache[0] = string;
        String string1 = "C";
        stringCache[1] = string1;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeLetterThenDigitSequence();
        
        assertEquals(string1, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(1, finalCharacterReaderPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeLetterThenDigitSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = input[pos];
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:209) */
        characterReader.consumeLetterThenDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = input[pos];
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'a'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:209) */
        characterReader.consumeLetterThenDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = input[pos];
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'A'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:209) */
        characterReader.consumeLetterThenDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'9'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 57 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:364)
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:223) */
        characterReader.consumeLetterThenDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[14];
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 15);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 15);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.StringIndexOutOfBoundsException: offset 15, count 0, length 14]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:367)
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:223) */
        characterReader.consumeLetterThenDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:364)
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:223) */
        characterReader.consumeLetterThenDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = input[pos];
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:209) */
        characterReader.consumeLetterThenDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:223) */
        characterReader.consumeLetterThenDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_ThrowNullPointerException_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:367)
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:223) */
        characterReader.consumeLetterThenDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_ThrowNullPointerException_4() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'`'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:223) */
        characterReader.consumeLetterThenDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_ThrowNullPointerException_5() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'{'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:223) */
        characterReader.consumeLetterThenDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_ThrowNullPointerException_6() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'A'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:223) */
        characterReader.consumeLetterThenDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -254);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -254);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:223) */
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
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeDigitSequence
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeDigitSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.returnsFrom {@code return cacheString(start, pos - start);}
 *  */
    @Test
    public void testConsumeDigitSequence_CLessThan0() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[40];
        input[0] = ' ';
        input[1] = ' ';
        input[2] = ' ';
        input[3] = ' ';
        input[4] = ' ';
        input[5] = ' ';
        input[6] = ' ';
        input[7] = ' ';
        input[8] = ' ';
        input[9] = ' ';
        input[10] = ' ';
        input[11] = ' ';
        input[12] = ' ';
        input[13] = ' ';
        input[14] = ' ';
        input[15] = '/';
        input[16] = ' ';
        input[17] = ' ';
        input[18] = ' ';
        input[19] = ' ';
        input[20] = ' ';
        input[21] = ' ';
        input[22] = ' ';
        input[23] = ' ';
        input[24] = ' ';
        input[25] = ' ';
        input[26] = ' ';
        input[27] = ' ';
        input[28] = ' ';
        input[29] = ' ';
        input[30] = ' ';
        input[31] = ' ';
        input[32] = ' ';
        input[33] = ' ';
        input[34] = ' ';
        input[35] = ' ';
        input[36] = ' ';
        input[37] = ' ';
        input[38] = ' ';
        input[39] = ' ';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 16);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 15);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeDigitSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.returnsFrom {@code return cacheString(start, pos - start);}
 *  */
    @Test
    public void testConsumeDigitSequence_PosGreaterOrEqualLength_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "\u0000";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeDigitSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.returnsFrom {@code return cacheString(start, pos - start);}
 *  */
    @Test
    public void testConsumeDigitSequence_CLessOrEqual9() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'3'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[10];
        String string = "\uFFCC";
        stringCache[1] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeDigitSequence();
        
        String expected = "3";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache1, 2));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache2, 3));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache3, 4));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache4, 5));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache5, 6));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache6, 7));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache7, 8));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache8, 9));
        
        assertEquals(1, finalCharacterReaderPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
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
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.returnsFrom {@code return cacheString(start, pos - start);}
 *  */
    @Test
    public void testConsumeDigitSequence_CLessOrEqual9_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'3'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[10];
        String string = "3";
        stringCache[1] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeDigitSequence();
        
        assertEquals(string, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache1, 2));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache2, 3));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache3, 4));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache4, 5));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache5, 6));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache6, 7));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache7, 8));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache8, 9));
        
        assertEquals(1, finalCharacterReaderPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
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
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.returnsFrom {@code return cacheString(start, pos - start);}
 *  */
    @Test
    public void testConsumeDigitSequence_PosGreaterOrEqualLength() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeDigitSequence();
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeDigitSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = input[pos];
 *  */
    @Test
    public void testConsumeDigitSequence_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeDigitSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:241) */
        characterReader.consumeDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeDigitSequence_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {':'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeDigitSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:364)
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:247) */
        characterReader.consumeDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeDigitSequence_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'/'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeDigitSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:364)
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:247) */
        characterReader.consumeDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeDigitSequence_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[14];
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 15);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 15);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "\u0000";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeDigitSequence] produces [java.lang.StringIndexOutOfBoundsException: offset 15, count 0, length 14]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:373)
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:247) */
        characterReader.consumeDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeDigitSequence_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'0'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeDigitSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 48 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:364)
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:247) */
        characterReader.consumeDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeDigitSequence_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeDigitSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:364)
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:247) */
        characterReader.consumeDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = input[pos];
 *  */
    @Test
    public void testConsumeDigitSequence_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeDigitSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:241) */
        characterReader.consumeDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeDigitSequence_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeDigitSequence] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:367)
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:247) */
        characterReader.consumeDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeDigitSequence_ThrowNullPointerException_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "\u0000";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeDigitSequence] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:373)
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:247) */
        characterReader.consumeDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeDigitSequence_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -254);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -254);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeDigitSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:247) */
        characterReader.consumeDigitSequence();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method consumeDigitSequence()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.CharacterReader}
     * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
     */
    @Test
    public void testConsumeDigitSequence() {
        CharacterReader characterReader = new CharacterReader("ab");
        
        String actual = characterReader.consumeDigitSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
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
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        characterReader.unconsume();
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(-256, finalCharacterReaderPos);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeAsString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeAsString()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeAsString()}
 * @utbot.returnsFrom {@code return new String(input, pos++, 1);}
 *  */
    @Test
    public void testConsumeAsString_Return() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        
        String actual = characterReader.consumeAsString();
        
        String expected = " ";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(1, finalCharacterReaderPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeAsString()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeAsString()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return new String(input, pos++, 1);
 *  */
    @Test
    public void testConsumeAsString_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeAsString] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.consumeAsString(CharacterReader.java:62) */
        characterReader.consumeAsString();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeAsString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new String(input, pos++, 1);
 *  */
    @Test
    public void testConsumeAsString_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeAsString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.consumeAsString(CharacterReader.java:62) */
        characterReader.consumeAsString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeTo(char)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.returnsFrom {@code return consumeToEnd();}
 *  */
    @Test
    public void testConsumeTo_ReturnConsumeToEnd_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "\u0000";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeTo(' ');
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.returnsFrom {@code return consumeToEnd();}
 *  */
    @Test
    public void testConsumeTo_ReturnConsumeToEnd_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeTo(' ');
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.returnsFrom {@code return consumed;}
 *  */
    @Test
    public void testConsumeTo_ReturnConsumed() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[40];
        input[0] = ' ';
        input[1] = ' ';
        input[2] = ' ';
        input[3] = ' ';
        input[4] = ' ';
        input[5] = ' ';
        input[6] = ' ';
        input[7] = ' ';
        input[8] = ' ';
        input[9] = ' ';
        input[10] = ' ';
        input[11] = ' ';
        input[12] = ' ';
        input[13] = ' ';
        input[14] = ' ';
        input[15] = ' ';
        input[16] = ' ';
        input[17] = ' ';
        input[18] = ' ';
        input[19] = ' ';
        input[20] = ' ';
        input[21] = ' ';
        input[22] = ' ';
        input[23] = ' ';
        input[24] = ' ';
        input[25] = ' ';
        input[26] = ' ';
        input[27] = ' ';
        input[28] = ' ';
        input[29] = ' ';
        input[30] = ' ';
        input[31] = ' ';
        input[32] = ' ';
        input[33] = ' ';
        input[34] = ' ';
        input[35] = ' ';
        input[36] = ' ';
        input[37] = ' ';
        input[38] = ' ';
        input[39] = ' ';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 16);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 15);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeTo(' ');
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.returnsFrom {@code return consumed;}
 *  */
    @Test
    public void testConsumeTo_ReturnConsumed_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'!', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 2);
        java.lang.String[] stringCache = new java.lang.String[10];
        String string = "";
        stringCache[0] = string;
        String string1 = "!";
        stringCache[1] = string1;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeTo(' ');
        
        assertEquals(string1, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
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
        
        assertEquals(1, finalCharacterReaderPos);
        
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
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.returnsFrom {@code return consumed;}
 *  */
    @Test
    public void testConsumeTo_ReturnConsumed_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[12];
        input[0] = ' ';
        input[1] = ' ';
        input[2] = ' ';
        input[3] = ' ';
        input[4] = '!';
        input[5] = ' ';
        input[6] = ' ';
        input[7] = ' ';
        input[8] = ' ';
        input[9] = ' ';
        input[10] = ' ';
        input[11] = ' ';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 6);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 4);
        java.lang.String[] stringCache = new java.lang.String[18];
        String string = "4";
        stringCache[1] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeTo(' ');
        
        String expected = "!";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache1, 2));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache2, 3));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache3, 4));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache4, 5));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache5, 6));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache6, 7));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache7, 8));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache8, 9));
        java.lang.String[] characterReaderStringCache9 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache10 = ((String) get(characterReaderStringCache9, 10));
        java.lang.String[] characterReaderStringCache10 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache11 = ((String) get(characterReaderStringCache10, 11));
        java.lang.String[] characterReaderStringCache11 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache12 = ((String) get(characterReaderStringCache11, 12));
        java.lang.String[] characterReaderStringCache12 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache13 = ((String) get(characterReaderStringCache12, 13));
        java.lang.String[] characterReaderStringCache13 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache14 = ((String) get(characterReaderStringCache13, 14));
        java.lang.String[] characterReaderStringCache14 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache15 = ((String) get(characterReaderStringCache14, 15));
        java.lang.String[] characterReaderStringCache15 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache16 = ((String) get(characterReaderStringCache15, 16));
        java.lang.String[] characterReaderStringCache16 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache17 = ((String) get(characterReaderStringCache16, 17));
        
        assertEquals(5, finalCharacterReaderPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
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
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.returnsFrom {@code return consumeToEnd();}
 *  */
    @Test
    public void testConsumeTo_ReturnConsumeToEnd() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeTo(' ');
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeTo(char)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int offset = nextIndexOf(c);
 *  */
    @Test
    public void testConsumeTo_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:73)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:104) */
        characterReader.consumeTo(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return consumeToEnd();
 *  */
    @Test
    public void testConsumeTo_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[14];
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 15);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 15);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.StringIndexOutOfBoundsException: offset 15, count 0, length 14]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:367)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:110) */
        characterReader.consumeTo(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return consumeToEnd();
 *  */
    @Test
    public void testConsumeTo_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[14];
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 15);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 15);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "\u0000";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.StringIndexOutOfBoundsException: offset 15, count 0, length 14]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:373)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:110) */
        characterReader.consumeTo(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: String consumed = cacheString(pos, offset);
 *  */
    @Test
    public void testConsumeTo_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:364)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:106) */
        characterReader.consumeTo(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return consumeToEnd();
 *  */
    @Test
    public void testConsumeTo_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'\u0000', '\u0000'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -2147483647);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 2147483640);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483640 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:359)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:110) */
        characterReader.consumeTo(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return consumeToEnd();
 *  */
    @Test
    public void testConsumeTo_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -35);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -35);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:364)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:110) */
        characterReader.consumeTo(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return consumeToEnd();
 *  */
    @Test
    public void testConsumeTo_ThrowStringIndexOutOfBoundsException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 2147483394);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.StringIndexOutOfBoundsException: offset 2147483394, count 2147483647, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:353)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:110) */
        characterReader.consumeTo(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return consumeToEnd();
 *  */
    @Test
    public void testConsumeTo_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 176);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 186);
        java.lang.String[] stringCache = {null, null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:367)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:110) */
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
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "\u0000";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:373)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:110) */
        characterReader.consumeTo(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String consumed = cacheString(pos, offset);
 *  */
    @Test
    public void testConsumeTo_ThrowNullPointerException_4() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'!', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:106) */
        characterReader.consumeTo(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return consumeToEnd();
 *  */
    @Test
    public void testConsumeTo_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -2147483646);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 2147483640);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:359)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:110) */
        characterReader.consumeTo('@');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return consumeToEnd();
 *  */
    @Test
    public void testConsumeTo_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -35);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -35);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:110) */
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
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeTo(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.returnsFrom {@code return consumeToEnd();}
 *  */
    @Test
    public void testConsumeTo_ReturnConsumeToEnd1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        String string = " ";
        
        String actual = characterReader.consumeTo(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.returnsFrom {@code return consumeToEnd();}
 *  */
    @Test
    public void testConsumeTo_ReturnConsumeToEnd_11() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = " ";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeTo(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.returnsFrom {@code return consumed;}
 *  */
    @Test
    public void testConsumeTo_ReturnConsumed1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        String string = " ";
        
        String actual = characterReader.consumeTo(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.returnsFrom {@code return consumeToEnd();}
 *  */
    @Test
    public void testConsumeTo_ReturnConsumeToEnd_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', '!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1);
        java.lang.String[] stringCache = new java.lang.String[10];
        String string = "^";
        stringCache[1] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeTo(string);
        
        String expected = "!";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache1, 2));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache2, 3));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache3, 4));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache4, 5));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache5, 6));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache6, 7));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache7, 8));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache8, 9));
        
        assertEquals(2, finalCharacterReaderPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
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
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.returnsFrom {@code return consumed;}
 *  */
    @Test
    public void testConsumeTo_ReturnConsumed_11() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[15];
        input[0] = ' ';
        input[1] = ' ';
        input[2] = ' ';
        input[3] = ' ';
        input[4] = ' ';
        input[5] = ' ';
        input[6] = '!';
        input[7] = ' ';
        input[8] = ' ';
        input[9] = ' ';
        input[10] = ' ';
        input[11] = ' ';
        input[12] = ' ';
        input[13] = ' ';
        input[14] = ' ';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 9);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 6);
        java.lang.String[] stringCache = new java.lang.String[10];
        String string = "!";
        stringCache[1] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        String string1 = "  ";
        
        String actual = characterReader.consumeTo(string1);
        
        assertEquals(string, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache1, 2));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache2, 3));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache3, 4));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache4, 5));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache5, 6));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache6, 7));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache7, 8));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache8, 9));
        
        assertEquals(7, finalCharacterReaderPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
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
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.returnsFrom {@code return consumeToEnd();}
 *  */
    @Test
    public void testConsumeTo_ReturnConsumeToEnd_21() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        String string1 = " ";
        
        String actual = characterReader.consumeTo(string1);
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeTo(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: int offset = nextIndexOf(seq);
 *  */
    @Test
    public void testConsumeTo_ThrowStringIndexOutOfBoundsException_11() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String string = "";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:87)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:115) */
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
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:90)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:115) */
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
        char[] input = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        String string = "_";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:91)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:115) */
        characterReader.consumeTo(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int offset = nextIndexOf(seq);
 *  */
    @Test
    public void testConsumeTo_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'!', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        String string = "  ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:95)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:115) */
        characterReader.consumeTo(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int offset = nextIndexOf(seq);
 *  */
    @Test
    public void testConsumeTo_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', ' ', ' ', '!', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 6);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 2);
        String string = "!_";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:91)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:115) */
        characterReader.consumeTo(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int offset = nextIndexOf(seq);
 *  */
    @Test
    public void testConsumeTo_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[28];
        input[0] = ' ';
        input[1] = ' ';
        input[2] = ' ';
        input[3] = ' ';
        input[4] = ' ';
        input[5] = ' ';
        input[6] = ' ';
        input[7] = ' ';
        input[8] = ' ';
        input[9] = ' ';
        input[10] = ' ';
        input[11] = ' ';
        input[12] = ' ';
        input[13] = ' ';
        input[14] = ' ';
        input[15] = ' ';
        input[16] = ' ';
        input[17] = ' ';
        input[18] = ' ';
        input[19] = ' ';
        input[20] = ' ';
        input[21] = ' ';
        input[22] = ' ';
        input[23] = ' ';
        input[24] = ' ';
        input[25] = ' ';
        input[26] = '!';
        input[27] = ' ';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 30);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 26);
        String string = "!    ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 28 out of bounds for length 28]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:91)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:115) */
        characterReader.consumeTo(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: String consumed = cacheString(pos, offset);
 *  */
    @Test
    public void testConsumeTo_ThrowArrayIndexOutOfBoundsException_31() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[15];
        input[0] = ' ';
        input[1] = ' ';
        input[2] = '!';
        input[3] = ' ';
        input[4] = ' ';
        input[5] = ' ';
        input[6] = ' ';
        input[7] = ' ';
        input[8] = ' ';
        input[9] = ' ';
        input[10] = ' ';
        input[11] = ' ';
        input[12] = ' ';
        input[13] = ' ';
        input[14] = ' ';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 5);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 2);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        String string = "  ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 33 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:364)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:117) */
        characterReader.consumeTo(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return consumeToEnd();
 *  */
    @Test
    public void testConsumeTo_ThrowStringIndexOutOfBoundsException1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[14];
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 15);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 15);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = " ";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.StringIndexOutOfBoundsException: offset 15, count 0, length 14]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:373)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:121) */
        characterReader.consumeTo(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return consumeToEnd();
 *  */
    @Test
    public void testConsumeTo_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -2147483647);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 2147483646);
        String string = "  ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483646 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:359)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:121) */
        characterReader.consumeTo(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return consumeToEnd();
 *  */
    @Test
    public void testConsumeTo_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -47);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -47);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:364)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:121) */
        characterReader.consumeTo(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return consumeToEnd();
 *  */
    @Test
    public void testConsumeTo_ThrowStringIndexOutOfBoundsException_21() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'\u0000', '\u0000'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -203);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 2147483642);
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.StringIndexOutOfBoundsException: offset 2147483642, count 2147483451, length 2]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:353)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:121) */
        characterReader.consumeTo(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return consumeToEnd();
 *  */
    @Test
    public void testConsumeTo_ThrowNullPointerException1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1);
        String string = "_";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:121) */
        characterReader.consumeTo(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return consumeToEnd();
 *  */
    @Test
    public void testConsumeTo_ThrowNullPointerException_11() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", Integer.MIN_VALUE);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 2147483641);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        String string = "  ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:359)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:121) */
        characterReader.consumeTo(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return consumeToEnd();
 *  */
    @Test
    public void testConsumeTo_ThrowNullPointerException_21() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 384651776);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1002353086);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:367)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:121) */
        characterReader.consumeTo(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return consumeToEnd();
 *  */
    @Test
    public void testConsumeTo_ThrowNullPointerException_41() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 459617280);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1610350526);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "  ";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:373)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:121) */
        characterReader.consumeTo(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String consumed = cacheString(pos, offset);
 *  */
    @Test
    public void testConsumeTo_ThrowNullPointerException_5() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:117) */
        characterReader.consumeTo(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return consumeToEnd();
 *  */
    @Test
    public void testConsumeTo_ThrowNullPointerException_31() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -6);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -6);
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:121) */
        characterReader.consumeTo(string);
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
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "mark", 1);
        
        characterReader.rewindToMark();
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(1, finalCharacterReaderPos);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.matchesIgnoreCase
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (scanLength > length - pos): True}
 *  */
    @Test
    public void testMatchesIgnoreCase_ScanLengthGreaterThanLengthMinusPos() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String string = " ";
        
        boolean actual = characterReader.matchesIgnoreCase(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (scanLength > length - pos): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testMatchesIgnoreCase_ScanLengthLessOrEqualLengthMinusPos() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -38);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -38);
        String string = "";
        
        boolean actual = characterReader.matchesIgnoreCase(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (scanLength > length - pos): False}
 * @utbot.iterates iterate the loop {@code for(int offset = 0; offset < scanLength; offset++)} once
 *  */
    @Test
    public void testMatchesIgnoreCase_UpScanNotEqualsUpTarget() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', '`'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1);
        String string = "";
        
        boolean actual = characterReader.matchesIgnoreCase(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (scanLength > length - pos): False}
 * @utbot.iterates iterate the loop {@code for(int offset = 0; offset < scanLength; offset++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testMatchesIgnoreCase_UpScanEqualsUpTarget() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'P'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        String string = "p";
        
        boolean actual = characterReader.matchesIgnoreCase(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (scanLength > length - pos): False}
 * @utbot.iterates iterate the loop {@code for(int offset = 0; offset < scanLength; offset++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char upTarget = Character.toUpperCase(input[pos + offset]);
 *  */
    @Test
    public void testMatchesIgnoreCase_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -256);
        String string = "{";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesIgnoreCase] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.matchesIgnoreCase(CharacterReader.java:273) */
        characterReader.matchesIgnoreCase(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesIgnoreCase(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int scanLength = seq.length();
 *  */
    @Test
    public void testMatchesIgnoreCase_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matchesIgnoreCase(CharacterReader.java:267) */
        characterReader.matchesIgnoreCase(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (scanLength > length - pos): False}
 * @utbot.iterates iterate the loop {@code for(int offset = 0; offset < scanLength; offset++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char upTarget = Character.toUpperCase(input[pos + offset]);
 *  */
    @Test
    public void testMatchesIgnoreCase_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -127);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -128);
        String string = "{";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matchesIgnoreCase(CharacterReader.java:273) */
        characterReader.matchesIgnoreCase(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeTagName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method consumeTagName()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (c == '\t'): False},
    ///     {@code (c == '\n'): False},
    ///     {@code (c == '\r'): False},
    ///     {@code (c == '\f'): False},
    ///     {@code (c == ' '): False},
    ///     {@code (c == '/'): False},
    ///     {@code (c == '>'): False},
    ///     {@code (c == TokeniserState.nullChar): False},
    ///     {@code (pos > start): True}
    /// invoke:
    ///     org.jsoup.parser.CharacterReader#cacheString(int,int) once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeTagName_PosGreaterOrEqualRemaining() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeTagName();
        
        String expected = "!";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(1, finalCharacterReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeTagName_PosGreaterOrEqualRemaining_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[10];
        String string = "";
        stringCache[1] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeTagName();
        
        String expected = "!";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache1, 2));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache2, 3));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache3, 4));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache4, 5));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache5, 6));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache6, 7));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache7, 8));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache8, 9));
        
        assertEquals(1, finalCharacterReaderPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
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
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} twice
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeTagName_CEqualsChar() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {
            '!', '\n', ' ', '@', ' ', '@', ' ', ' ',
            ' ', ' '
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        java.lang.String[] stringCache = new java.lang.String[10];
        String string = "!";
        stringCache[1] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeTagName();
        
        assertEquals(string, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache1, 2));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache2, 3));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache3, 4));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache4, 5));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache5, 6));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache6, 7));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache7, 8));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache8, 9));
        
        assertEquals(1, finalCharacterReaderPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
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
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeTagName_PosGreaterOrEqualRemaining_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[10];
        String string = "\uFFDE";
        stringCache[1] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeTagName();
        
        String expected = "!";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache1, 2));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache2, 3));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache3, 4));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache4, 5));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache5, 6));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache6, 7));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache7, 8));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache8, 9));
        
        assertEquals(1, finalCharacterReaderPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
        assertNull(finalCharacterReaderStringCache2);
        
        assertNull(finalCharacterReaderStringCache3);
        
        assertNull(finalCharacterReaderStringCache4);
        
        assertNull(finalCharacterReaderStringCache5);
        
        assertNull(finalCharacterReaderStringCache6);
        
        assertNull(finalCharacterReaderStringCache7);
        
        assertNull(finalCharacterReaderStringCache8);
        
        assertNull(finalCharacterReaderStringCache9);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method consumeTagName()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (pos > start): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeTagName_CEqualsChar_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {
            '\f', '\u0000', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeTagName();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeTagName_CEqualsChar_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeTagName();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeTagName_CEqualsChar_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'>'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeTagName();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeTagName_CEqualsTokeniserStateNullChar() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {
            '\u0000', '\u0000', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeTagName();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeTagName_CEqualsChar_4() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'/'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeTagName();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeTagName_CEqualsChar_5() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {
            '\n', '\u0000', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeTagName();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeTagName_CEqualsChar_6() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {
            '\t', '\u0000', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeTagName();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeTagName_CEqualsChar_7() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {
            '\r', '\u0000', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeTagName();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeTagName_PosGreaterOrEqualRemaining_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        String actual = characterReader.consumeTagName();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeTagName()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final char c = val[pos];
 *  */
    @Test
    public void testConsumeTagName_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTagName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.consumeTagName(CharacterReader.java:178) */
        characterReader.consumeTagName();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final char c = val[pos];
 *  */
    @Test
    public void testConsumeTagName_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTagName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeTagName(CharacterReader.java:178) */
        characterReader.consumeTagName();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.executesCondition {@code (pos > start): True}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: cacheString(start, pos - start)
 *  */
    @Test
    public void testConsumeTagName_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTagName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 33 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:364)
            org.jsoup.parser.CharacterReader.consumeTagName(CharacterReader.java:184) */
        characterReader.consumeTagName();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final char c = val[pos];
 *  */
    @Test
    public void testConsumeTagName_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTagName] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeTagName(CharacterReader.java:178) */
        characterReader.consumeTagName();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTagName()}
 * @utbot.executesCondition {@code (pos > start): True}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cacheString(start, pos - start)
 *  */
    @Test
    public void testConsumeTagName_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[13];
        input[0] = '!';
        input[1] = '\t';
        input[2] = ' ';
        input[3] = ' ';
        input[4] = ' ';
        input[5] = ' ';
        input[6] = ' ';
        input[7] = ' ';
        input[8] = ' ';
        input[9] = ' ';
        input[10] = ' ';
        input[11] = ' ';
        input[12] = ' ';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 7);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTagName] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeTagName(CharacterReader.java:184) */
        characterReader.consumeTagName();
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
    public void testConsumeToEnd_ReturnData_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeToEnd();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.returnsFrom {@code return data;}
 *  */
    @Test
    public void testConsumeToEnd_ReturnData_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "\u0000";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeToEnd();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.returnsFrom {@code return data;}
 *  */
    @Test
    public void testConsumeToEnd_ReturnData_4() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[10];
        String string = "";
        stringCache[0] = string;
        String string1 = "\uFFDE";
        stringCache[1] = string1;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeToEnd();
        
        String expected = "!";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
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
        
        assertEquals(1, finalCharacterReaderPos);
        
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
    public void testConsumeToEnd_ReturnData_5() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'@', '!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1);
        java.lang.String[] stringCache = new java.lang.String[10];
        String string = "";
        stringCache[0] = string;
        String string1 = "!";
        stringCache[1] = string1;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeToEnd();
        
        assertEquals(string1, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
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
        
        assertEquals(2, finalCharacterReaderPos);
        
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
    public void testConsumeToEnd_ReturnData() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[40];
        input[0] = ' ';
        input[1] = ' ';
        input[2] = ' ';
        input[3] = ' ';
        input[4] = ' ';
        input[5] = ' ';
        input[6] = ' ';
        input[7] = ' ';
        input[8] = ' ';
        input[9] = ' ';
        input[10] = ' ';
        input[11] = ' ';
        input[12] = ' ';
        input[13] = ' ';
        input[14] = ' ';
        input[15] = ' ';
        input[16] = ' ';
        input[17] = ' ';
        input[18] = ' ';
        input[19] = ' ';
        input[20] = ' ';
        input[21] = ' ';
        input[22] = ' ';
        input[23] = ' ';
        input[24] = ' ';
        input[25] = ' ';
        input[26] = ' ';
        input[27] = ' ';
        input[28] = ' ';
        input[29] = ' ';
        input[30] = ' ';
        input[31] = ' ';
        input[32] = ' ';
        input[33] = ' ';
        input[34] = ' ';
        input[35] = ' ';
        input[36] = ' ';
        input[37] = ' ';
        input[38] = ' ';
        input[39] = ' ';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 40);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 3);
        
        String actual = characterReader.consumeToEnd();
        
        String expected = "                                     ";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(40, finalCharacterReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.returnsFrom {@code return data;}
 *  */
    @Test
    public void testConsumeToEnd_ReturnData_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeToEnd();
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeToEnd()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String data = cacheString(pos, length - pos);
 *  */
    @Test
    public void testConsumeToEnd_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[14];
        input[0] = ' ';
        input[1] = ' ';
        input[2] = ' ';
        input[3] = ' ';
        input[4] = ' ';
        input[5] = ' ';
        input[6] = ' ';
        input[7] = ' ';
        input[8] = ' ';
        input[9] = ' ';
        input[10] = ' ';
        input[11] = ' ';
        input[12] = ' ';
        input[13] = ' ';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 15);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 15);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToEnd] produces [java.lang.StringIndexOutOfBoundsException: offset 15, count 0, length 14]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:367)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188) */
        characterReader.consumeToEnd();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: String data = cacheString(pos, length - pos);
 *  */
    @Test
    public void testConsumeToEnd_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -249);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -256);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToEnd] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:359)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188) */
        characterReader.consumeToEnd();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: String data = cacheString(pos, length - pos);
 *  */
    @Test
    public void testConsumeToEnd_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -2);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToEnd] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:364)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188) */
        characterReader.consumeToEnd();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String data = cacheString(pos, length - pos);
 *  */
    @Test
    public void testConsumeToEnd_ThrowNullPointerException_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToEnd] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188) */
        characterReader.consumeToEnd();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String data = cacheString(pos, length - pos);
 *  */
    @Test
    public void testConsumeToEnd_ThrowNullPointerException_4() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -5);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToEnd] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:373)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188) */
        characterReader.consumeToEnd();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String data = cacheString(pos, length - pos);
 *  */
    @Test
    public void testConsumeToEnd_ThrowNullPointerException_5() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 96);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 110);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToEnd] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:367)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188) */
        characterReader.consumeToEnd();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String data = cacheString(pos, length - pos);
 *  */
    @Test
    public void testConsumeToEnd_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -123);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -130);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToEnd] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:359)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188) */
        characterReader.consumeToEnd();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String data = cacheString(pos, length - pos);
 *  */
    @Test
    public void testConsumeToEnd_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 12);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToEnd] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:353)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188) */
        characterReader.consumeToEnd();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String data = cacheString(pos, length - pos);
 *  */
    @Test
    public void testConsumeToEnd_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -2);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToEnd] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:188) */
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
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.CharacterReader}
     * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
     */
    @Test
    public void testConsumeToEnd1() {
        CharacterReader characterReader = new CharacterReader("a");
        
        String actual = characterReader.consumeToEnd();
        
        String expected = "a";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.matchesAny
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesAny([C)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAny(char[])}
 * @utbot.executesCondition {@code (isEmpty()): False}
 * @utbot.iterates iterate the loop {@code for(char seek: seq)} once
 *  */
    @Test
    public void testMatchesAny_SeekNotEqualsC() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        char[] charArray = {'!'};
        
        boolean actual = characterReader.matchesAny(charArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAny(char[])}
 * @utbot.executesCondition {@code (isEmpty()): True}
 *  */
    @Test
    public void testMatchesAny_IsEmpty() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        boolean actual = characterReader.matchesAny(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAny(char[])}
 * @utbot.executesCondition {@code (isEmpty()): False}
 *  */
    @Test
    public void testMatchesAny_NotIsEmpty() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        char[] charArray = {};
        
        boolean actual = characterReader.matchesAny(charArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAny(char[])}
 * @utbot.executesCondition {@code (isEmpty()): False}
 * @utbot.iterates iterate the loop {@code for(char seek: seq)} once
 *  */
    @Test
    public void testMatchesAny_SeekEqualsC() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        char[] charArray = {' '};
        
        boolean actual = characterReader.matchesAny(charArray);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesAny([C)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAny(char[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = input[pos];
 *  */
    @Test
    public void testMatchesAny_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesAny] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.matchesAny(CharacterReader.java:284) */
        characterReader.matchesAny(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAny(char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(char seek: seq)
 *  */
    @Test
    public void testMatchesAny_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesAny] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matchesAny(CharacterReader.java:285) */
        characterReader.matchesAny(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAny(char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = input[pos];
 *  */
    @Test
    public void testMatchesAny_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesAny] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matchesAny(CharacterReader.java:284) */
        characterReader.matchesAny(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.matchesDigit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method matchesDigit()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link org.jsoup.parser.CharacterReader#isEmpty()} once
    /// execute conditions:
    ///     {@code (isEmpty()): False}
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
        char[] input = {':'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
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
        char[] input = {'0'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        boolean actual = characterReader.matchesDigit();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesDigit()}
 * @utbot.returnsFrom {@code return (c >= '0' && c <= '9');}
 *  */
    @Test
    public void testMatchesDigit_CLessThan0AndCGreaterThan9_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'/'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        boolean actual = characterReader.matchesDigit();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method matchesDigit()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesDigit()}
 * @utbot.executesCondition {@code (isEmpty()): True}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#isEmpty()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMatchesDigit_IsEmpty() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        boolean actual = characterReader.matchesDigit();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesDigit()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesDigit()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = input[pos];
 *  */
    @Test
    public void testMatchesDigit_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesDigit] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.matchesDigit(CharacterReader.java:306) */
        characterReader.matchesDigit();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesDigit()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = input[pos];
 *  */
    @Test
    public void testMatchesDigit_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesDigit] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matchesDigit(CharacterReader.java:306) */
        characterReader.matchesDigit();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.matchConsume
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchConsume(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchConsume(java.lang.String)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMatchConsume_ReturnFalse_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -127);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -128);
        String string = "  ";
        
        boolean actual = characterReader.matchConsume(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchConsume(java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testMatchConsume_ReturnTrue() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -127);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -127);
        String string = "";
        
        boolean actual = characterReader.matchConsume(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchConsume(java.lang.String)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMatchConsume_ReturnFalse() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1);
        String string = "_";
        
        boolean actual = characterReader.matchConsume(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchConsume(java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testMatchConsume_ReturnTrue_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        String string = " ";
        
        boolean actual = characterReader.matchConsume(string);
        
        assertTrue(actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(1, finalCharacterReaderPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchConsume(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchConsume(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#matches(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: matches(seq)
 *  */
    @Test
    public void testMatchConsume_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchConsume] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:261)
            org.jsoup.parser.CharacterReader.matchConsume(CharacterReader.java:311) */
        characterReader.matchConsume(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method consumeData()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (c == '&'): False},
    ///     {@code (c == '<'): False},
    ///     {@code (c == TokeniserState.nullChar): False},
    ///     {@code (pos > start): True}
    /// invoke:
    ///     org.jsoup.parser.CharacterReader#cacheString(int,int) twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeData()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeData_IterateWhileLoop() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeData();
        
        String expected = " ";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(1, finalCharacterReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeData()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeData_IterateWhileLoop_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[10];
        String string = "";
        stringCache[1] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeData();
        
        String expected = "!";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache1, 2));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache2, 3));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache3, 4));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache4, 5));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache5, 6));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache6, 7));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache7, 8));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache8, 9));
        
        assertEquals(1, finalCharacterReaderPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
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
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeData()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeData_IterateWhileLoop_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[10];
        String string = "!";
        stringCache[1] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeData();
        
        assertEquals(string, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache1, 2));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache2, 3));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache3, 4));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache4, 5));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache5, 6));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache6, 7));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache7, 8));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache8, 9));
        
        assertEquals(1, finalCharacterReaderPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
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
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeData()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeData_IterateWhileLoop_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[10];
        String string = "\uFFC6";
        stringCache[1] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeData();
        
        String expected = "!";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache1, 2));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache2, 3));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache3, 4));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache4, 5));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache5, 6));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache6, 7));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache7, 8));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache8, 9));
        
        assertEquals(1, finalCharacterReaderPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
        assertNull(finalCharacterReaderStringCache2);
        
        assertNull(finalCharacterReaderStringCache3);
        
        assertNull(finalCharacterReaderStringCache4);
        
        assertNull(finalCharacterReaderStringCache5);
        
        assertNull(finalCharacterReaderStringCache6);
        
        assertNull(finalCharacterReaderStringCache7);
        
        assertNull(finalCharacterReaderStringCache8);
        
        assertNull(finalCharacterReaderStringCache9);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method consumeData()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (pos > start): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeData()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeData_CEqualsChar() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'<'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeData();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeData()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeData_CEqualsChar_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'&'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeData();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeData()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeData_CEqualsTokeniserStateNullChar() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {
            '\u0000', '\u0000', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeData();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeData()}
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeData_PosGreaterOrEqualRemaining() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        String actual = characterReader.consumeData();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeData()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeData()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final char c = val[pos];
 *  */
    @Test
    public void testConsumeData_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.consumeData(CharacterReader.java:162) */
        characterReader.consumeData();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeData()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final char c = val[pos];
 *  */
    @Test
    public void testConsumeData_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeData(CharacterReader.java:162) */
        characterReader.consumeData();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeData()}
 * @utbot.executesCondition {@code (pos > start): True}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: cacheString(start, pos - start)
 *  */
    @Test
    public void testConsumeData_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:364)
            org.jsoup.parser.CharacterReader.consumeData(CharacterReader.java:168) */
        characterReader.consumeData();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeData()}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final char c = val[pos];
 *  */
    @Test
    public void testConsumeData_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeData] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeData(CharacterReader.java:162) */
        characterReader.consumeData();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeData()}
 * @utbot.executesCondition {@code (pos > start): True}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cacheString(start, pos - start)
 *  */
    @Test
    public void testConsumeData_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeData] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeData(CharacterReader.java:168) */
        characterReader.consumeData();
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
            org.jsoup.parser.CharacterReader.containsIgnoreCase(CharacterReader.java:330) */
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
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.CharacterReader}
     * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#containsIgnoreCase(java.lang.String)}
     */
    @Test
    public void testContainsIgnoreCaseReturnsFalseWithNonEmptyString1() {
        CharacterReader characterReader = new CharacterReader("");
        
        boolean actual = characterReader.containsIgnoreCase("#$\\\"'?");
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method containsIgnoreCase(java.lang.String)
    
    @Test
    public void testContainsIgnoreCase1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String string = "";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.containsIgnoreCase] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:87)
            org.jsoup.parser.CharacterReader.containsIgnoreCase(CharacterReader.java:332) */
        characterReader.containsIgnoreCase(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeToAny
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeToAny([C)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.executesCondition {@code (pos > start): False}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeToAny_PosLessOrEqualStart() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        char[] charArray = {'_', ' '};
        
        String actual = characterReader.consumeToAny(charArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.executesCondition {@code (pos > start): False}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeToAny_PosLessOrEqualStart_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        char[] charArray = {' '};
        
        String actual = characterReader.consumeToAny(charArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.executesCondition {@code (OUTER: while (pos < remaining) {
 *     for (char c : chars) {
 *         if (val[pos] == c)
 *             break OUTER;
 *     }
 *     pos++;
 * }): False}
 * @utbot.executesCondition {@code (pos > start): True}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeToAny_PosGreaterThanStart() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        char[] charArray = {};
        
        String actual = characterReader.consumeToAny(charArray);
        
        String expected = " ";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(1, finalCharacterReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.executesCondition {@code (OUTER: while (pos < remaining) {
 *     for (char c : chars) {
 *         if (val[pos] == c)
 *             break OUTER;
 *     }
 *     pos++;
 * }): False}
 * @utbot.executesCondition {@code (pos > start): True}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeToAny_PosGreaterThanStart_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[10];
        String string = "\uFFDE";
        stringCache[1] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        char[] charArray = {};
        
        String actual = characterReader.consumeToAny(charArray);
        
        String expected = "!";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache1, 2));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache2, 3));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache3, 4));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache4, 5));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache5, 6));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache6, 7));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache7, 8));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache8, 9));
        
        assertEquals(1, finalCharacterReaderPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
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
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.executesCondition {@code (OUTER: while (pos < remaining) {
 *     for (char c : chars) {
 *         if (val[pos] == c)
 *             break OUTER;
 *     }
 *     pos++;
 * }): False}
 * @utbot.executesCondition {@code (pos > start): True}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeToAny_PosGreaterThanStart_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[10];
        String string = "\u0000\u0000";
        stringCache[1] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        char[] charArray = {'^'};
        
        String actual = characterReader.consumeToAny(charArray);
        
        String expected = "!";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache1, 2));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache2, 3));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache3, 4));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache4, 5));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache5, 6));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache6, 7));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache7, 8));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache8, 9));
        
        assertEquals(1, finalCharacterReaderPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
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
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.executesCondition {@code (OUTER: while (pos < remaining) {
 *     for (char c : chars) {
 *         if (val[pos] == c)
 *             break OUTER;
 *     }
 *     pos++;
 * }): False}
 * @utbot.executesCondition {@code (pos > start): True}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeToAny_PosGreaterThanStart_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[10];
        String string = "!";
        stringCache[1] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        char[] charArray = {'^'};
        
        String actual = characterReader.consumeToAny(charArray);
        
        assertEquals(string, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache1, 2));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache2, 3));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache3, 4));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache4, 5));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache5, 6));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache6, 7));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache7, 8));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache8, 9));
        
        assertEquals(1, finalCharacterReaderPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
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
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.executesCondition {@code (OUTER: while (pos < remaining) {
 *     for (char c : chars) {
 *         if (val[pos] == c)
 *             break OUTER;
 *     }
 *     pos++;
 * }): False}
 * @utbot.executesCondition {@code (pos > start): False}
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeToAny_PosLessOrEqualStart_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        String actual = characterReader.consumeToAny(null);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeToAny([C)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: val[pos] == c
 *  */
    @Test
    public void testConsumeToAny_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        char[] charArray = {' '};
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAny] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:132) */
        characterReader.consumeToAny(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.executesCondition {@code (OUTER: while (pos < remaining) {
 *     for (char c : chars) {
 *         if (val[pos] == c)
 *             break OUTER;
 *     }
 *     pos++;
 * }): False}
 * @utbot.executesCondition {@code (pos > start): True}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: cacheString(start, pos - start)
 *  */
    @Test
    public void testConsumeToAny_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        char[] charArray = {'_'};
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAny] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:364)
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:138) */
        characterReader.consumeToAny(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.executesCondition {@code (OUTER: while (pos < remaining) {
 *     for (char c : chars) {
 *         if (val[pos] == c)
 *             break OUTER;
 *     }
 *     pos++;
 * }): False}
 * @utbot.executesCondition {@code (pos > start): True}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: cacheString(start, pos - start)
 *  */
    @Test
    public void testConsumeToAny_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        char[] charArray = {};
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAny] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:359)
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:138) */
        characterReader.consumeToAny(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: val[pos] == c
 *  */
    @Test
    public void testConsumeToAny_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        char[] charArray = {' '};
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAny] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:132) */
        characterReader.consumeToAny(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(char c: chars)
 *  */
    @Test
    public void testConsumeToAny_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAny] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:131) */
        characterReader.consumeToAny(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.executesCondition {@code (OUTER: while (pos < remaining) {
 *     for (char c : chars) {
 *         if (val[pos] == c)
 *             break OUTER;
 *     }
 *     pos++;
 * }): False}
 * @utbot.executesCondition {@code (pos > start): True}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cacheString(start, pos - start)
 *  */
    @Test
    public void testConsumeToAny_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        char[] charArray = {};
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAny] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:138) */
        characterReader.consumeToAny(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.executesCondition {@code (OUTER: while (pos < remaining) {
 *     for (char c : chars) {
 *         if (val[pos] == c)
 *             break OUTER;
 *     }
 *     pos++;
 * }): False}
 * @utbot.executesCondition {@code (pos > start): True}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cacheString(start, pos - start)
 *  */
    @Test
    public void testConsumeToAny_ThrowNullPointerException_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        char[] charArray = {};
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAny] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:359)
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:138) */
        characterReader.consumeToAny(charArray);
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
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeToAnySorted
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeToAnySorted([C)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAnySorted(char[])}
 * @utbot.executesCondition {@code (pos > start): False}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeToAnySorted_PosLessOrEqualStart_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        char[] charArray = {' '};
        
        String actual = characterReader.consumeToAnySorted(charArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAnySorted(char[])}
 * @utbot.executesCondition {@code (pos > start): True}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeToAnySorted_PosGreaterThanStart() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        char[] charArray = {};
        
        String actual = characterReader.consumeToAnySorted(charArray);
        
        String expected = " ";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(1, finalCharacterReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAnySorted(char[])}
 * @utbot.executesCondition {@code (pos > start): True}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeToAnySorted_PosGreaterThanStart_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[10];
        String string = "";
        stringCache[1] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        char[] charArray = {};
        
        String actual = characterReader.consumeToAnySorted(charArray);
        
        String expected = "!";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache1, 2));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache2, 3));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache3, 4));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache4, 5));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache5, 6));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache6, 7));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache7, 8));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache8, 9));
        
        assertEquals(1, finalCharacterReaderPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
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
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAnySorted(char[])}
 * @utbot.executesCondition {@code (pos > start): True}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeToAnySorted_PosGreaterThanStart_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[10];
        String string = "\uFFDE";
        stringCache[1] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        char[] charArray = {};
        
        String actual = characterReader.consumeToAnySorted(charArray);
        
        String expected = "!";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache1, 2));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache2, 3));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache3, 4));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache4, 5));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache5, 6));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache6, 7));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache7, 8));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache8, 9));
        
        assertEquals(1, finalCharacterReaderPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
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
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAnySorted(char[])}
 * @utbot.executesCondition {@code (pos > start): True}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeToAnySorted_PosGreaterThanStart_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[10];
        String string = "!";
        stringCache[1] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        char[] charArray = {};
        
        String actual = characterReader.consumeToAnySorted(charArray);
        
        assertEquals(string, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache1, 2));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache2, 3));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache3, 4));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache4, 5));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache5, 6));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache6, 7));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache7, 8));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache8, 9));
        
        assertEquals(1, finalCharacterReaderPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
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
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAnySorted(char[])}
 * @utbot.executesCondition {@code (pos > start): False}
 * @utbot.returnsFrom {@code return pos > start ? cacheString(start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeToAnySorted_PosLessOrEqualStart() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        String actual = characterReader.consumeToAnySorted(null);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeToAnySorted([C)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAnySorted(char[])}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: Arrays.binarySearch(chars, val[pos]) >= 0
 *  */
    @Test
    public void testConsumeToAnySorted_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        char[] charArray = {};
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAnySorted] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeToAnySorted(CharacterReader.java:147) */
        characterReader.consumeToAnySorted(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAnySorted(char[])}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: Arrays.binarySearch(chars, val[pos]) >= 0
 *  */
    @Test
    public void testConsumeToAnySorted_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAnySorted] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeToAnySorted(CharacterReader.java:147) */
        characterReader.consumeToAnySorted(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAnySorted(char[])}
 * @utbot.executesCondition {@code (pos > start): True}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: cacheString(start, pos - start)
 *  */
    @Test
    public void testConsumeToAnySorted_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        char[] charArray = {};
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAnySorted] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:364)
            org.jsoup.parser.CharacterReader.consumeToAnySorted(CharacterReader.java:152) */
        characterReader.consumeToAnySorted(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAnySorted(char[])}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: Arrays.binarySearch(chars, val[pos]) >= 0
 *  */
    @Test
    public void testConsumeToAnySorted_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAnySorted] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeToAnySorted(CharacterReader.java:147) */
        characterReader.consumeToAnySorted(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAnySorted(char[])}
 * @utbot.executesCondition {@code (pos > start): True}
 * @utbot.iterates iterate the loop {@code while(pos < remaining)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cacheString(start, pos - start)
 *  */
    @Test
    public void testConsumeToAnySorted_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        char[] charArray = {};
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAnySorted] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeToAnySorted(CharacterReader.java:152) */
        characterReader.consumeToAnySorted(charArray);
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
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.nextIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextIndexOf(char)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(char)}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testNextIndexOf_ReturnNegative1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        int actual = characterReader.nextIndexOf(' ');
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(char)}
 * @utbot.iterates iterate the loop {@code for(int i = pos; i < length; i++)} once
 *  */
    @Test
    public void testNextIndexOf_CEqualsIOfInput() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        int actual = characterReader.nextIndexOf(' ');
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(char)}
 * @utbot.iterates iterate the loop {@code for(int i = pos; i < length; i++)} once
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testNextIndexOf_CNotEqualsIOfInput() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        int actual = characterReader.nextIndexOf('_');
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextIndexOf(char)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(char)}
 * @utbot.iterates iterate the loop {@code for(int i = pos; i < length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: c == input[i]
 *  */
    @Test
    public void testNextIndexOf_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.nextIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:73) */
        characterReader.nextIndexOf(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(char)}
 * @utbot.iterates iterate the loop {@code for(int i = pos; i < length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: c == input[i]
 *  */
    @Test
    public void testNextIndexOf_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.nextIndexOf] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:73) */
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
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.nextIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextIndexOf(java.lang.CharSequence)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testNextIndexOf_ReturnNegative11() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        String string = " ";
        
        int actual = characterReader.nextIndexOf(string);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.iterates iterate the loop {@code for(int offset = pos; offset < length; offset++)} once
 *  */
    @Test
    public void testNextIndexOf_IEqualsLast() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 129);
        String string = "  ";
        
        int actual = characterReader.nextIndexOf(string);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.iterates iterate the loop {@code for(int offset = pos; offset < length; offset++)} once
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testNextIndexOf_LastGreaterThanLength() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        String string = "  ";
        
        int actual = characterReader.nextIndexOf(string);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.iterates iterate the loop {@code for(int offset = pos; offset < length; offset++)} once
 *  */
    @Test
    public void testNextIndexOf_PrefixIncrementOffsetGreaterOrEqualLengthAndStartCharEqualsOffsetOfInput() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'!', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 2);
        String string = " ";
        
        int actual = characterReader.nextIndexOf(string);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.iterates iterate the loop {@code for(int offset = pos; offset < length; offset++)} once
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testNextIndexOf_PrefixIncrementOffsetGreaterOrEqualLengthAndStartCharEqualsOffsetOfInput_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1);
        String string = "_";
        
        int actual = characterReader.nextIndexOf(string);
        
        assertEquals(-1, actual);
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
        String string = "";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.nextIndexOf] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:87) */
        characterReader.nextIndexOf(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.iterates iterate the loop {@code for(int offset = pos; offset < length; offset++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: startChar != input[offset]
 *  */
    @Test
    public void testNextIndexOf_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.nextIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:90) */
        characterReader.nextIndexOf(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.iterates iterate the loop {@code for(int offset = pos; offset < length; offset++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(++offset < length && startChar != input[offset])
 *  */
    @Test
    public void testNextIndexOf_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        String string = "_";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.nextIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:91) */
        characterReader.nextIndexOf(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.iterates iterate the loop {@code for(int offset = pos; offset < length; offset++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(++offset < length && startChar != input[offset])
 *  */
    @Test
    public void testNextIndexOf_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        String string = "_";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.nextIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:91) */
        characterReader.nextIndexOf(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.iterates iterate the loop {@code for(int offset = pos; offset < length; offset++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(int j = 1; i < last && seq.charAt(j) == input[i]; i++, j++)
 *  */
    @Test
    public void testNextIndexOf_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
            ' ', ' '
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1073741824);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 9);
        String string = "  ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.nextIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:95) */
        characterReader.nextIndexOf(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.iterates iterate the loop {@code for(int offset = pos; offset < length; offset++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(++offset < length && startChar != input[offset])
 *  */
    @Test
    public void testNextIndexOf_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[28];
        input[0] = ' ';
        input[1] = ' ';
        input[2] = ' ';
        input[3] = ' ';
        input[4] = ' ';
        input[5] = ' ';
        input[6] = ' ';
        input[7] = ' ';
        input[8] = ' ';
        input[9] = ' ';
        input[10] = ' ';
        input[11] = ' ';
        input[12] = ' ';
        input[13] = ' ';
        input[14] = ' ';
        input[15] = ' ';
        input[16] = ' ';
        input[17] = ' ';
        input[18] = ' ';
        input[19] = ' ';
        input[20] = ' ';
        input[21] = ' ';
        input[22] = ' ';
        input[23] = ' ';
        input[24] = ' ';
        input[25] = ' ';
        input[26] = '!';
        input[27] = ' ';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 31);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 26);
        String string = "!_";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.nextIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 28 out of bounds for length 28]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:91) */
        characterReader.nextIndexOf(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.invokes {@link java.lang.CharSequence#charAt(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char startChar = seq.charAt(0);
 *  */
    @Test
    public void testNextIndexOf_ThrowNullPointerException1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.nextIndexOf] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:87) */
        characterReader.nextIndexOf(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.iterates iterate the loop {@code for(int offset = pos; offset < length; offset++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: startChar != input[offset]
 *  */
    @Test
    public void testNextIndexOf_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.nextIndexOf] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:90) */
        characterReader.nextIndexOf(string);
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
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.matchesAnySorted
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesAnySorted([C)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAnySorted(char[])}
 * @utbot.returnsFrom {@code return !isEmpty() && Arrays.binarySearch(seq, input[pos]) >= 0;}
 *  */
    @Test
    public void testMatchesAnySorted_NotIsEmptyAndArraysBinarySearchLessThanZero() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        char[] charArray = {};
        
        boolean actual = characterReader.matchesAnySorted(charArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAnySorted(char[])}
 * @utbot.returnsFrom {@code return !isEmpty() && Arrays.binarySearch(seq, input[pos]) >= 0;}
 *  */
    @Test
    public void testMatchesAnySorted_NotIsEmptyAndArraysBinarySearchLessThanZero_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        boolean actual = characterReader.matchesAnySorted(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAnySorted(char[])}
 * @utbot.returnsFrom {@code return !isEmpty() && Arrays.binarySearch(seq, input[pos]) >= 0;}
 *  */
    @Test
    public void testMatchesAnySorted_NotIsEmptyAndArraysBinarySearchGreaterOrEqualZero() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        char[] charArray = {' '};
        
        boolean actual = characterReader.matchesAnySorted(charArray);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesAnySorted([C)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAnySorted(char[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return !isEmpty() && Arrays.binarySearch(seq, input[pos]) >= 0;
 *  */
    @Test
    public void testMatchesAnySorted_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesAnySorted] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.matchesAnySorted(CharacterReader.java:293) */
        characterReader.matchesAnySorted(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAnySorted(char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !isEmpty() && Arrays.binarySearch(seq, input[pos]) >= 0;
 *  */
    @Test
    public void testMatchesAnySorted_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesAnySorted] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matchesAnySorted(CharacterReader.java:293) */
        characterReader.matchesAnySorted(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.cacheString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method cacheString(int, int)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(int,int)}
 * @utbot.executesCondition {@code (count > maxCacheLen): False}
 * @utbot.executesCondition {@code (cached == null): True}
 * @utbot.returnsFrom {@code return cached;}
 *  */
    @Test
    public void testCacheString_CachedEqualsNull() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[2];
        cacheStringMethodArguments[0] = 0;
        cacheStringMethodArguments[1] = 0;
        String actual = ((String) cacheStringMethod.invoke(characterReader, cacheStringMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(int,int)}
 * @utbot.executesCondition {@code (count > maxCacheLen): False}
 * @utbot.executesCondition {@code (cached == null): False}
 * @utbot.executesCondition {@code (rangeEquals(start, count, cached)): False}
 * @utbot.returnsFrom {@code return cached;}
 *  */
    @Test
    public void testCacheString_NotRangeEquals() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "\u0000";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[2];
        cacheStringMethodArguments[0] = 0;
        cacheStringMethodArguments[1] = 0;
        String actual = ((String) cacheStringMethod.invoke(characterReader, cacheStringMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(int,int)}
 * @utbot.executesCondition {@code (count > maxCacheLen): False}
 * @utbot.executesCondition {@code (cached == null): False}
 * @utbot.executesCondition {@code (rangeEquals(start, count, cached)): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; i++)} once
 * @utbot.returnsFrom {@code return cached;}
 *  */
    @Test
    public void testCacheString_RangeEquals_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        java.lang.String[] stringCache = new java.lang.String[10];
        String string = "!";
        stringCache[1] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[2];
        cacheStringMethodArguments[0] = 0;
        cacheStringMethodArguments[1] = 1;
        String actual = ((String) cacheStringMethod.invoke(characterReader, cacheStringMethodArguments));
        
        assertEquals(string, actual);
        
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache1, 2));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache2, 3));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache3, 4));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache4, 5));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache5, 6));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache6, 7));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache7, 8));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache8, 9));
        
        assertNull(finalCharacterReaderStringCache0);
        
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
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(int,int)}
 * @utbot.executesCondition {@code (count > maxCacheLen): False}
 * @utbot.executesCondition {@code (cached == null): False}
 * @utbot.executesCondition {@code (rangeEquals(start, count, cached)): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; i++)} once
 * @utbot.returnsFrom {@code return cached;}
 *  */
    @Test
    public void testCacheString_NotRangeEquals_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'!'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        java.lang.String[] stringCache = new java.lang.String[10];
        String string = "\uFFDE";
        stringCache[1] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[2];
        cacheStringMethodArguments[0] = 0;
        cacheStringMethodArguments[1] = 1;
        String actual = ((String) cacheStringMethod.invoke(characterReader, cacheStringMethodArguments));
        
        String expected = "!";
        
        assertEquals(expected, actual);
        
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        java.lang.String[] characterReaderStringCache1 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache2 = ((String) get(characterReaderStringCache1, 2));
        java.lang.String[] characterReaderStringCache2 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache3 = ((String) get(characterReaderStringCache2, 3));
        java.lang.String[] characterReaderStringCache3 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache4 = ((String) get(characterReaderStringCache3, 4));
        java.lang.String[] characterReaderStringCache4 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache5 = ((String) get(characterReaderStringCache4, 5));
        java.lang.String[] characterReaderStringCache5 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache6 = ((String) get(characterReaderStringCache5, 6));
        java.lang.String[] characterReaderStringCache6 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache7 = ((String) get(characterReaderStringCache6, 7));
        java.lang.String[] characterReaderStringCache7 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache8 = ((String) get(characterReaderStringCache7, 8));
        java.lang.String[] characterReaderStringCache8 = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache9 = ((String) get(characterReaderStringCache8, 9));
        
        assertNull(finalCharacterReaderStringCache0);
        
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
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(int,int)}
 * @utbot.executesCondition {@code (count > maxCacheLen): True}
 * @utbot.returnsFrom {@code return new String(val, start, count);}
 *  */
    @Test
    public void testCacheString_CountGreaterThanMaxCacheLen() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[26];
        input[0] = ' ';
        input[1] = ' ';
        input[2] = ' ';
        input[3] = ' ';
        input[4] = ' ';
        input[5] = ' ';
        input[6] = ' ';
        input[7] = ' ';
        input[8] = ' ';
        input[9] = ' ';
        input[10] = ' ';
        input[11] = ' ';
        input[12] = ' ';
        input[13] = ' ';
        input[14] = ' ';
        input[15] = ' ';
        input[16] = ' ';
        input[17] = ' ';
        input[18] = ' ';
        input[19] = ' ';
        input[20] = ' ';
        input[21] = ' ';
        input[22] = ' ';
        input[23] = ' ';
        input[24] = ' ';
        input[25] = ' ';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[2];
        cacheStringMethodArguments[0] = 5;
        cacheStringMethodArguments[1] = 15;
        String actual = ((String) cacheStringMethod.invoke(characterReader, cacheStringMethodArguments));
        
        String expected = "               ";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(int,int)}
 * @utbot.executesCondition {@code (count > maxCacheLen): False}
 * @utbot.executesCondition {@code (cached == null): False}
 * @utbot.executesCondition {@code (rangeEquals(start, count, cached)): True}
 * @utbot.returnsFrom {@code return cached;}
 *  */
    @Test
    public void testCacheString_RangeEquals() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[2];
        cacheStringMethodArguments[0] = -255;
        cacheStringMethodArguments[1] = 0;
        String actual = ((String) cacheStringMethod.invoke(characterReader, cacheStringMethodArguments));
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method cacheString(int, int)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(int,int)}
 * @utbot.executesCondition {@code (count > maxCacheLen): False}
 * @utbot.executesCondition {@code (cached == null): False}
 * @utbot.executesCondition {@code (rangeEquals(start, count, cached)): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: cached = new String(val, start, count);
 *  */
    @Test
    public void testCacheString_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[14];
        input[0] = ' ';
        input[1] = ' ';
        input[2] = ' ';
        input[3] = ' ';
        input[4] = ' ';
        input[5] = ' ';
        input[6] = ' ';
        input[7] = ' ';
        input[8] = ' ';
        input[9] = ' ';
        input[10] = ' ';
        input[11] = ' ';
        input[12] = ' ';
        input[13] = ' ';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "\u0000";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.cacheString] produces [java.lang.StringIndexOutOfBoundsException: offset 15, count 0, length 14]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:373) */
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[2];
        cacheStringMethodArguments[0] = 15;
        cacheStringMethodArguments[1] = 0;
        try {
            cacheStringMethod.invoke(characterReader, cacheStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(int,int)}
 * @utbot.executesCondition {@code (count > maxCacheLen): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: hash = 31 * hash + val[offset++];
 *  */
    @Test
    public void testCacheString_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.cacheString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 65 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:359) */
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[2];
        cacheStringMethodArguments[0] = 65;
        cacheStringMethodArguments[1] = 5;
        try {
            cacheStringMethod.invoke(characterReader, cacheStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(int,int)}
 * @utbot.executesCondition {@code (count > maxCacheLen): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: String cached = cache[index];
 *  */
    @Test
    public void testCacheString_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.cacheString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:364) */
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[2];
        cacheStringMethodArguments[0] = -255;
        cacheStringMethodArguments[1] = 0;
        try {
            cacheStringMethod.invoke(characterReader, cacheStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(int,int)}
 * @utbot.executesCondition {@code (count > maxCacheLen): False}
 * @utbot.executesCondition {@code (cached == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cached = new String(val, start, count);
 *  */
    @Test
    public void testCacheString_ThrowNullPointerException() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.cacheString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:367) */
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[2];
        cacheStringMethodArguments[0] = -1;
        cacheStringMethodArguments[1] = 0;
        try {
            cacheStringMethod.invoke(characterReader, cacheStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(int,int)}
 * @utbot.executesCondition {@code (count > maxCacheLen): False}
 * @utbot.executesCondition {@code (cached == null): False}
 * @utbot.executesCondition {@code (rangeEquals(start, count, cached)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cached = new String(val, start, count);
 *  */
    @Test
    public void testCacheString_ThrowNullPointerException_1() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "\u0000\u0000";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.cacheString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:373) */
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[2];
        cacheStringMethodArguments[0] = -1;
        cacheStringMethodArguments[1] = 0;
        try {
            cacheStringMethod.invoke(characterReader, cacheStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(int,int)}
 * @utbot.executesCondition {@code (count > maxCacheLen): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int index = hash & cache.length - 1;
 *  */
    @Test
    public void testCacheString_ThrowNullPointerException_5() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.cacheString] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363) */
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[2];
        cacheStringMethodArguments[0] = 1;
        cacheStringMethodArguments[1] = 1;
        try {
            cacheStringMethod.invoke(characterReader, cacheStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(int,int)}
 * @utbot.executesCondition {@code (count > maxCacheLen): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int index = hash & cache.length - 1;
 *  */
    @Test
    public void testCacheString_ThrowNullPointerException_2() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.cacheString] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363) */
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[2];
        cacheStringMethodArguments[0] = -255;
        cacheStringMethodArguments[1] = 0;
        try {
            cacheStringMethod.invoke(characterReader, cacheStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(int,int)}
 * @utbot.executesCondition {@code (count > maxCacheLen): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: hash = 31 * hash + val[offset++];
 *  */
    @Test
    public void testCacheString_ThrowNullPointerException_3() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.cacheString] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:359) */
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[2];
        cacheStringMethodArguments[0] = -255;
        cacheStringMethodArguments[1] = 5;
        try {
            cacheStringMethod.invoke(characterReader, cacheStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(int,int)}
 * @utbot.executesCondition {@code (count > maxCacheLen): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new String(val, start, count);
 *  */
    @Test
    public void testCacheString_ThrowNullPointerException_4() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.cacheString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:353) */
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[2];
        cacheStringMethodArguments[0] = -1;
        cacheStringMethodArguments[1] = 13;
        try {
            cacheStringMethod.invoke(characterReader, cacheStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method cacheString(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.CharacterReader}
     * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#cacheString(int,int)}
     */
    @Test
    public void testCacheStringThrowsSIOOBEWithCornerCase() throws Throwable  {
        CharacterReader characterReader = new CharacterReader("abc");
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.cacheString] produces [java.lang.StringIndexOutOfBoundsException: offset -65, count 0, length 3]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:367) */
        Class characterReaderClazz = Class.forName("org.jsoup.parser.CharacterReader");
        Class intType = int.class;
        Method cacheStringMethod = characterReaderClazz.getDeclaredMethod("cacheString", intType, intType);
        cacheStringMethod.setAccessible(true);
        java.lang.Object[] cacheStringMethodArguments = new java.lang.Object[2];
        cacheStringMethodArguments[0] = -65;
        cacheStringMethodArguments[1] = 0;
        try {
            cacheStringMethod.invoke(characterReader, cacheStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.matchesLetter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method matchesLetter()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (isEmpty()): False}
    /// return from: {@code return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesLetter()}
 * @utbot.returnsFrom {@code return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');}
 *  */
    @Test
    public void testMatchesLetter_CGreaterOrEqualAAndCLessOrEqualZOrCGreaterOrEqualAAndCLessOrEqualZ() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'a'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        boolean actual = characterReader.matchesLetter();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesLetter()}
 * @utbot.returnsFrom {@code return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');}
 *  */
    @Test
    public void testMatchesLetter_CLessThanAAndCGreaterThanZOrCLessThanAAndCGreaterThanZ() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'{'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        boolean actual = characterReader.matchesLetter();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesLetter()}
 * @utbot.returnsFrom {@code return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');}
 *  */
    @Test
    public void testMatchesLetter_CLessThanAAndCLessOrEqualZOrCLessThanAAndCLessOrEqualZ() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'A'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        boolean actual = characterReader.matchesLetter();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method matchesLetter()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesLetter()}
 * @utbot.executesCondition {@code (isEmpty()): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMatchesLetter_IsEmpty() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        boolean actual = characterReader.matchesLetter();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesLetter()}
 * @utbot.executesCondition {@code (isEmpty()): False}
 * @utbot.returnsFrom {@code return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');}
 *  */
    @Test
    public void testMatchesLetter_CLessThanAAndCGreaterThanZOrCLessThanAAndCGreaterThanZ_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'@'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        boolean actual = characterReader.matchesLetter();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesLetter()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesLetter()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = input[pos];
 *  */
    @Test
    public void testMatchesLetter_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesLetter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:299) */
        characterReader.matchesLetter();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesLetter()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = input[pos];
 *  */
    @Test
    public void testMatchesLetter_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesLetter] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:299) */
        characterReader.matchesLetter();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.rangeEquals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method rangeEquals(int, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#rangeEquals(int,int,java.lang.String)}
 * @utbot.executesCondition {@code (count == cached.length()): False}
 *  */
    @Test
    public void testRangeEquals_CountNotEqualsCachedLength() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String string = "  ";
        
        boolean actual = characterReader.rangeEquals(-252, 1, string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#rangeEquals(int,int,java.lang.String)}
 * @utbot.executesCondition {@code (count == cached.length()): True}
 * @utbot.executesCondition {@code (one[i++] != cached.charAt(j++)): True}
 *  */
    @Test
    public void testRangeEquals_IOfOneNotEqualsCachedCharAt() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        String string = "!";
        
        boolean actual = characterReader.rangeEquals(0, 1, string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#rangeEquals(int,int,java.lang.String)}
 * @utbot.executesCondition {@code (count == cached.length()): True}
 * @utbot.executesCondition {@code (one[i++] != cached.charAt(j++)): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRangeEquals_IOfOneEqualsCachedCharAt() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        String string = " ";
        
        boolean actual = characterReader.rangeEquals(1, 1, string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#rangeEquals(int,int,java.lang.String)}
 * @utbot.executesCondition {@code (count == cached.length()): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRangeEquals_PostfixDecrementCountEqualsZero() throws Exception  {
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
 * @utbot.executesCondition {@code (count == cached.length()): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: one[i++] != cached.charAt(j++)
 *  */
    @Test
    public void testRangeEquals_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.rangeEquals] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.rangeEquals(CharacterReader.java:389) */
        characterReader.rangeEquals(-256, 1, string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#rangeEquals(int,int,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: count == cached.length()
 *  */
    @Test
    public void testRangeEquals_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.rangeEquals] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.rangeEquals(CharacterReader.java:384) */
        characterReader.rangeEquals(-255, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#rangeEquals(int,int,java.lang.String)}
 * @utbot.executesCondition {@code (count == cached.length()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: one[i++] != cached.charAt(j++)
 *  */
    @Test
    public void testRangeEquals_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.rangeEquals] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.rangeEquals(CharacterReader.java:389) */
        characterReader.rangeEquals(-255, 1, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeHexSequence
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeHexSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.returnsFrom {@code return cacheString(start, pos - start);}
 *  */
    @Test
    public void testConsumeHexSequence_CGreaterThanF() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'g'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeHexSequence();
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.returnsFrom {@code return cacheString(start, pos - start);}
 *  */
    @Test
    public void testConsumeHexSequence_CLessOrEqualF() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'a'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[2];
        String string = "a";
        stringCache[1] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeHexSequence();
        
        assertEquals(string, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        
        assertEquals(1, finalCharacterReaderPos);
        
        assertNull(finalCharacterReaderStringCache0);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.returnsFrom {@code return cacheString(start, pos - start);}
 *  */
    @Test
    public void testConsumeHexSequence_CLessOrEqualF_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'a'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[2];
        String string = "\uFF9E";
        stringCache[1] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeHexSequence();
        
        String expected = "a";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache0 = ((String) get(characterReaderStringCache, 0));
        
        assertEquals(1, finalCharacterReaderPos);
        
        assertNull(finalCharacterReaderStringCache0);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.returnsFrom {@code return cacheString(start, pos - start);}
 *  */
    @Test
    public void testConsumeHexSequence_CLessThanA() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[40];
        input[0] = ' ';
        input[1] = ' ';
        input[2] = ' ';
        input[3] = ' ';
        input[4] = ' ';
        input[5] = ' ';
        input[6] = ' ';
        input[7] = ' ';
        input[8] = ' ';
        input[9] = ' ';
        input[10] = ' ';
        input[11] = ' ';
        input[12] = ' ';
        input[13] = ' ';
        input[14] = ' ';
        input[15] = '/';
        input[16] = ' ';
        input[17] = ' ';
        input[18] = ' ';
        input[19] = ' ';
        input[20] = ' ';
        input[21] = ' ';
        input[22] = ' ';
        input[23] = ' ';
        input[24] = ' ';
        input[25] = ' ';
        input[26] = ' ';
        input[27] = ' ';
        input[28] = ' ';
        input[29] = ' ';
        input[30] = ' ';
        input[31] = ' ';
        input[32] = ' ';
        input[33] = ' ';
        input[34] = ' ';
        input[35] = ' ';
        input[36] = ' ';
        input[37] = ' ';
        input[38] = ' ';
        input[39] = ' ';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 16);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 15);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeHexSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.returnsFrom {@code return cacheString(start, pos - start);}
 *  */
    @Test
    public void testConsumeHexSequence_PosGreaterOrEqualLength() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "\u0000";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        String actual = characterReader.consumeHexSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeHexSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = input[pos];
 *  */
    @Test
    public void testConsumeHexSequence_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:229) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = input[pos];
 *  */
    @Test
    public void testConsumeHexSequence_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'0'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:229) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeHexSequence_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'@'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:364)
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:235) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeHexSequence_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[14];
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 15);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 15);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.StringIndexOutOfBoundsException: offset 15, count 0, length 14]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:367)
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:235) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeHexSequence_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[14];
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 15);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 15);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "\u0000";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.StringIndexOutOfBoundsException: offset 15, count 0, length 14]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:373)
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:235) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeHexSequence_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:364)
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:235) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = input[pos];
 *  */
    @Test
    public void testConsumeHexSequence_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:229) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeHexSequence_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'g'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:235) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeHexSequence_ThrowNullPointerException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'A'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:235) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeHexSequence_ThrowNullPointerException_3() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'a'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:235) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeHexSequence_ThrowNullPointerException_4() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'/'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:235) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cacheString(start, pos - start);
 *  */
    @Test
    public void testConsumeHexSequence_ThrowNullPointerException_5() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "\u0000";
        stringCache[0] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:373)
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:235) */
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1000969311761500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1000969311761500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1000969311766100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1000969311761500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1000969311766100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1000969312905800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1000969312905800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1000969312908500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1000969312905800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1000969312908500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


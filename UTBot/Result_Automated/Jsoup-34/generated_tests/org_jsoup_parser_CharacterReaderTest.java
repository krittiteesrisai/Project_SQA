package org.jsoup.parser;

import org.junit.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
            org.jsoup.parser.CharacterReader.toString(CharacterReader.java:282) */
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
            org.jsoup.parser.CharacterReader.toString(CharacterReader.java:282) */
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
    public void testMatches_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -256);
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:210) */
        characterReader.matches(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int scanLength = seq.length();
 *  */
    @Test
    public void testMatches_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:205) */
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
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:210) */
        characterReader.matches(string);
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
    public void testMatches_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:200) */
        characterReader.matches(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !isEmpty() && input[pos] == c;
 *  */
    @Test
    public void testMatches_ThrowNullPointerException1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:200) */
        characterReader.matches(' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.current
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method current()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#current()}
 * @utbot.executesCondition {@code (isEmpty()): True}
 * @utbot.returnsFrom {@code return isEmpty() ? EOF : input[pos];}
 *  */
    @Test
    public void testCurrent_IsEmpty() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        char actual = characterReader.current();
        
        assertEquals('\uFFFF', actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#current()}
 * @utbot.executesCondition {@code (isEmpty()): False}
 * @utbot.returnsFrom {@code return isEmpty() ? EOF : input[pos];}
 *  */
    @Test
    public void testCurrent_NotIsEmpty() throws Exception  {
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
        char[] input = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.current] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:33) */
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
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:33) */
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
 * @utbot.executesCondition {@code (isEmpty()): True}
 * @utbot.returnsFrom {@code return val;}
 *  */
    @Test
    public void testConsume_IsEmpty() throws Exception  {
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
 * @utbot.executesCondition {@code (isEmpty()): False}
 * @utbot.returnsFrom {@code return val;}
 *  */
    @Test
    public void testConsume_NotIsEmpty() throws Exception  {
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
            org.jsoup.parser.CharacterReader.consume(CharacterReader.java:37) */
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
            org.jsoup.parser.CharacterReader.consume(CharacterReader.java:37) */
        characterReader.consume();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeHexSequence
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeHexSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.returnsFrom {@code return new String(input, start, pos - start);}
 *  */
    @Test
    public void testConsumeHexSequence_CGreaterThanF() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {
            'p', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeHexSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.returnsFrom {@code return new String(input, start, pos - start);}
 *  */
    @Test
    public void testConsumeHexSequence_CLessThanA() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[17];
        input[0] = '@';
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
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeHexSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.returnsFrom {@code return new String(input, start, pos - start);}
 *  */
    @Test
    public void testConsumeHexSequence_CLessThan0() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'/'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
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
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:178) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return new String(input, start, pos - start);
 *  */
    @Test
    public void testConsumeHexSequence_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 11);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 11);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.StringIndexOutOfBoundsException: offset 11, count 0, length 10]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:184) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = input[pos];
 *  */
    @Test
    public void testConsumeHexSequence_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'0'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:178) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = input[pos];
 *  */
    @Test
    public void testConsumeHexSequence_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'a'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:178) */
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
        char[] input = {'A'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:178) */
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
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:178) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new String(input, start, pos - start);
 *  */
    @Test
    public void testConsumeHexSequence_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:184) */
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
            org.jsoup.parser.CharacterReader.matchesAny(CharacterReader.java:233) */
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
            org.jsoup.parser.CharacterReader.matchesAny(CharacterReader.java:234) */
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
            org.jsoup.parser.CharacterReader.matchesAny(CharacterReader.java:233) */
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
            org.jsoup.parser.CharacterReader.matchesDigit(CharacterReader.java:251) */
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
            org.jsoup.parser.CharacterReader.matchesDigit(CharacterReader.java:251) */
        characterReader.matchesDigit();
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
            org.jsoup.parser.CharacterReader.matchesIgnoreCase(CharacterReader.java:222) */
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
            org.jsoup.parser.CharacterReader.matchesIgnoreCase(CharacterReader.java:216) */
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
            org.jsoup.parser.CharacterReader.matchesIgnoreCase(CharacterReader.java:222) */
        characterReader.matchesIgnoreCase(string);
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
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:244) */
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
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:244) */
        characterReader.matchesLetter();
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
            org.jsoup.parser.CharacterReader.containsIgnoreCase(CharacterReader.java:275) */
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
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:84)
            org.jsoup.parser.CharacterReader.containsIgnoreCase(CharacterReader.java:277) */
        characterReader.containsIgnoreCase(string);
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
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        
        String actual = characterReader.consumeToEnd();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeToEnd()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String data = new String(input, pos, length - pos);
 *  */
    @Test
    public void testConsumeToEnd_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToEnd] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:137) */
        characterReader.consumeToEnd();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String data = new String(input, pos, length - pos);
 *  */
    @Test
    public void testConsumeToEnd_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToEnd] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:137) */
        characterReader.consumeToEnd();
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
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:210)
            org.jsoup.parser.CharacterReader.matchConsume(CharacterReader.java:256) */
        characterReader.matchConsume(string);
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
            org.jsoup.parser.CharacterReader.consumeAsString(CharacterReader.java:59) */
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
            org.jsoup.parser.CharacterReader.consumeAsString(CharacterReader.java:59) */
        characterReader.consumeAsString();
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
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:70) */
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
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:70) */
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
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        String string = " ";
        
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
    public void testNextIndexOf_PrefixIncrementOffsetGreaterOrEqualLengthAndStartCharEqualsOffsetOfInput() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1);
        String string = "_";
        
        int actual = characterReader.nextIndexOf(string);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.iterates iterate the loop {@code for(int offset = pos; offset < length; offset++)} once
 *  */
    @Test
    public void testNextIndexOf_PrefixIncrementOffsetGreaterOrEqualLengthAndStartCharEqualsOffsetOfInput_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'!', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        String string = " ";
        
        int actual = characterReader.nextIndexOf(string);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#nextIndexOf(java.lang.CharSequence)}
 * @utbot.iterates iterate the loop {@code for(int offset = pos; offset < length; offset++)} once
 *  */
    @Test
    public void testNextIndexOf_IEqualsLast_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
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
    public void testNextIndexOf_INotEqualsLast() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        String string = " _";
        
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
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:84) */
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
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:87) */
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
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:88) */
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
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:88) */
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
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        String string = "  ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.nextIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:92) */
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
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:84) */
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
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:87) */
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
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeTo(char)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.returnsFrom {@code return consumed;}
 *  */
    @Test
    public void testConsumeTo_ReturnConsumed() throws Exception  {
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
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 8);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 7);
        
        String actual = characterReader.consumeTo(' ');
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.returnsFrom {@code return consumeToEnd();}
 *  */
    @Test
    public void testConsumeTo_CharacterReaderConsumeToEnd() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        
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
        char[] input = new char[12];
        input[0] = '^';
        input[1] = '!';
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
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        
        String actual = characterReader.consumeTo('!');
        
        String expected = "^";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(1, finalCharacterReaderPos);
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
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:70)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:101) */
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
        char[] input = new char[12];
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 2147483458);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.StringIndexOutOfBoundsException: offset 2147483458, count 2147483582, length 12]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:137)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:107) */
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
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:137)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:107) */
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
    public void testConsumeTo_ReturnConsumeToEnd() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[32];
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
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 32);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 30);
        String string = "_";
        
        String actual = characterReader.consumeTo(string);
        
        String expected = "  ";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(32, finalCharacterReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.returnsFrom {@code return consumeToEnd();}
 *  */
    @Test
    public void testConsumeTo_ReturnConsumeToEnd_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        String string = " ";
        
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
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 8);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 7);
        String string = " ";
        
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
    public void testConsumeTo_ReturnConsumed_11() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[12];
        input[0] = '^';
        input[1] = '!';
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
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 2);
        String string = "!";
        
        String actual = characterReader.consumeTo(string);
        
        String expected = "^";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(1, finalCharacterReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.returnsFrom {@code return consumed;}
 *  */
    @Test
    public void testConsumeTo_ReturnConsumed_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', ' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        String string = "  ";
        
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
    public void testConsumeTo_ReturnConsumeToEnd_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[33];
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
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 32);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 31);
        String string = " _";
        
        String actual = characterReader.consumeTo(string);
        
        String expected = " ";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(32, finalCharacterReaderPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeTo(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: int offset = nextIndexOf(seq);
 *  */
    @Test
    public void testConsumeTo_ThrowStringIndexOutOfBoundsException1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String string = "";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:84)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:112) */
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
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:87)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:112) */
        characterReader.consumeTo(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int offset = nextIndexOf(seq);
 *  */
    @Test
    public void testConsumeTo_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        String string = "_";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:88)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:112) */
        characterReader.consumeTo(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int offset = nextIndexOf(seq);
 *  */
    @Test
    public void testConsumeTo_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        String string = "  ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:92)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:112) */
        characterReader.consumeTo(string);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return consumeToEnd();
 *  */
    @Test
    public void testConsumeTo_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1);
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.StringIndexOutOfBoundsException: offset 1, count 0, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:137)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:118) */
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
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -1);
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:137)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:118) */
        characterReader.consumeTo(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeToAny
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeToAny([C)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.executesCondition {@code (pos > start): False}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.returnsFrom {@code return pos > start ? new String(input, start, pos - start) : "";}
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
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.returnsFrom {@code return pos > start ? new String(input, start, pos - start) : "";}
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
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.executesCondition {@code (pos > start): False}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.returnsFrom {@code return pos > start ? new String(input, start, pos - start) : "";}
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
 * @utbot.executesCondition {@code (pos > start): True}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.returnsFrom {@code return pos > start ? new String(input, start, pos - start) : "";}
 *  */
    @Test
    public void testConsumeToAny_PosGreaterThanStart() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        char[] charArray = {'('};
        
        String actual = characterReader.consumeToAny(charArray);
        
        String expected = " ";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(1, finalCharacterReaderPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeToAny([C)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: input[pos] == chars[i]
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
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:127) */
        characterReader.consumeToAny(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < chars.length; i++)
 *  */
    @Test
    public void testConsumeToAny_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAny] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:126) */
        characterReader.consumeToAny(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: input[pos] == chars[i]
 *  */
    @Test
    public void testConsumeToAny_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        char[] charArray = {' '};
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAny] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:127) */
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
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeDigitSequence
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeDigitSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.returnsFrom {@code return new String(input, start, pos - start);}
 *  */
    @Test
    public void testConsumeDigitSequence_CGreaterThan9() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {':'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeDigitSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.returnsFrom {@code return new String(input, start, pos - start);}
 *  */
    @Test
    public void testConsumeDigitSequence_CLessThan0() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'/'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeDigitSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.returnsFrom {@code return new String(input, start, pos - start);}
 *  */
    @Test
    public void testConsumeDigitSequence_CLessOrEqual9() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'0'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeDigitSequence();
        
        String expected = "0";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(1, finalCharacterReaderPos);
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
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:190) */
        characterReader.consumeDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return new String(input, start, pos - start);
 *  */
    @Test
    public void testConsumeDigitSequence_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 11);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 11);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeDigitSequence] produces [java.lang.StringIndexOutOfBoundsException: offset 11, count 0, length 10]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:196) */
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
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:190) */
        characterReader.consumeDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new String(input, start, pos - start);
 *  */
    @Test
    public void testConsumeDigitSequence_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeDigitSequence] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:196) */
        characterReader.consumeDigitSequence();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeLetterSequence
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method consumeLetterSequence()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return new String(input, start, pos - start);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.returnsFrom {@code return new String(input, start, pos - start);}
 *  */
    @Test
    public void testConsumeLetterSequence_CGreaterThanZ() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'{'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeLetterSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.returnsFrom {@code return new String(input, start, pos - start);}
 *  */
    @Test
    public void testConsumeLetterSequence_CLessThanA() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'@'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeLetterSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.returnsFrom {@code return new String(input, start, pos - start);}
 *  */
    @Test
    public void testConsumeLetterSequence_CLessThanA_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[17];
        input[0] = '`';
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
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeLetterSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method consumeLetterSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.returnsFrom {@code return new String(input, start, pos - start);}
 *  */
    @Test
    public void testConsumeLetterSequence_CLessOrEqualZ() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'A'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeLetterSequence();
        
        String expected = "A";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(1, finalCharacterReaderPos);
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
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:145) */
        characterReader.consumeLetterSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = input[pos];
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'a'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:145) */
        characterReader.consumeLetterSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return new String(input, start, pos - start);
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 11);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 11);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.StringIndexOutOfBoundsException: offset 11, count 0, length 10]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:152) */
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
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:145) */
        characterReader.consumeLetterSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new String(input, start, pos - start);
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:152) */
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
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeLetterThenDigitSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.returnsFrom {@code return new String(input, start, pos - start);}
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_CGreaterThan9() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'{'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeLetterThenDigitSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.returnsFrom {@code return new String(input, start, pos - start);}
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_CLessThan0() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[17];
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
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeLetterThenDigitSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.returnsFrom {@code return new String(input, start, pos - start);}
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_CLessOrEqual9() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'9'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeLetterThenDigitSequence();
        
        String expected = "9";
        
        assertEquals(expected, actual);
        
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
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:158) */
        characterReader.consumeLetterThenDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return new String(input, start, pos - start);
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 11);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 11);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.StringIndexOutOfBoundsException: offset 11, count 0, length 10]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:172) */
        characterReader.consumeLetterThenDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = input[pos];
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'A'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:158) */
        characterReader.consumeLetterThenDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = input[pos];
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'a'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:158) */
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
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:158) */
        characterReader.consumeLetterThenDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterThenDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(pos < length)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new String(input, start, pos - start);
 *  */
    @Test
    public void testConsumeLetterThenDigitSequence_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:172) */
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
            org.jsoup.parser.CharacterReader.matchesIgnoreCase(CharacterReader.java:222)
            org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase(CharacterReader.java:265) */
        characterReader.matchConsumeIgnoreCase(string);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields997940101014900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields997940101014900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass997940101021200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields997940101014900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass997940101021200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields997940101934900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields997940101934900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass997940101938200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields997940101934900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass997940101938200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


package org.jsoup.parser;

import org.junit.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class org_jsoup_parser_CharacterReaderTest {
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeHexSequence
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method consumeHexSequence()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link java.lang.String#charAt(int)} once
    /// execute conditions:
    ///     {@code (c >= '0'): True}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} once
 * @utbot.returnsFrom {@code return input.substring(start, pos);}
 *  */
    @Test
    public void testConsumeHexSequence_CLessOrEqualF() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "c";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeHexSequence();
        
        assertEquals(input, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(1, finalCharacterReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} once
 * @utbot.returnsFrom {@code return input.substring(start, pos);}
 *  */
    @Test
    public void testConsumeHexSequence_CLessOrEqualF_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "C";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeHexSequence();
        
        assertEquals(input, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(1, finalCharacterReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} once
 * @utbot.returnsFrom {@code return input.substring(start, pos);}
 *  */
    @Test
    public void testConsumeHexSequence_CLessOrEqual9() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "2";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeHexSequence();
        
        assertEquals(input, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(1, finalCharacterReaderPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method consumeHexSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} once
 * @utbot.returnsFrom {@code return input.substring(start, pos);}
 *  */
    @Test
    public void testConsumeHexSequence_CLessThanA() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "\u0000\u0000\u0000\u0000@\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 5);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 4);
        
        String actual = characterReader.consumeHexSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} once
 * @utbot.returnsFrom {@code return input.substring(start, pos);}
 *  */
    @Test
    public void testConsumeHexSequence_CGreaterThanF() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "g";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeHexSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.returnsFrom {@code return input.substring(start, pos);}
 *  */
    @Test
    public void testConsumeHexSequence_NotIsEmpty() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        
        String actual = characterReader.consumeHexSequence();
        
        assertEquals(input, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} once
 * @utbot.returnsFrom {@code return input.substring(start, pos);}
 *  */
    @Test
    public void testConsumeHexSequence_CLessThan0() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "\u0000\u0000\u0000\u0000/\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 5);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 4);
        
        String actual = characterReader.consumeHexSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeHexSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return input.substring(start, pos);
 *  */
    @Test
    public void testConsumeHexSequence_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = " ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end -1, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:126) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: char c = input.charAt(pos);
 *  */
    @Test
    public void testConsumeHexSequence_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "\u0000\u0000";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:120) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return input.substring(start, pos);
 *  */
    @Test
    public void testConsumeHexSequence_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:126) */
        characterReader.consumeHexSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeHexSequence()}
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = input.charAt(pos);
 *  */
    @Test
    public void testConsumeHexSequence_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeHexSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeHexSequence(CharacterReader.java:120) */
        characterReader.consumeHexSequence();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.matchesLetter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method matchesLetter()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link org.jsoup.parser.CharacterReader#isEmpty()} once
    /// execute conditions:
    ///     {@code (isEmpty()): False}
    /// invoke:
    ///     {@link java.lang.String#charAt(int)} once
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
        String input = "a";
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
        String input = "`";
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
    public void testMatchesLetter_CLessThanAAndCGreaterThanZOrCLessThanAAndCGreaterThanZ_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "{";
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
        String input = "A";
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
    public void testMatchesLetter_CLessThanAAndCGreaterThanZOrCLessThanAAndCGreaterThanZ_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "@";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        boolean actual = characterReader.matchesLetter();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method matchesLetter()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesLetter()}
 * @utbot.executesCondition {@code (isEmpty()): True}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#isEmpty()}
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesLetter()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesLetter()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: char c = input.charAt(pos);
 *  */
    @Test
    public void testMatchesLetter_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "  ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesLetter] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:169) */
        characterReader.matchesLetter();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesLetter()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = input.charAt(pos);
 *  */
    @Test
    public void testMatchesLetter_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesLetter] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:169) */
        characterReader.matchesLetter();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.matchesIgnoreCase
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesIgnoreCase(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#regionMatches(boolean,int,java.lang.String,int,int)}
 * @utbot.returnsFrom {@code return input.regionMatches(true, pos, seq, 0, seq.length());}
 *  */
    @Test
    public void testMatchesIgnoreCase_StringRegionMatches() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        boolean actual = characterReader.matchesIgnoreCase(input);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesIgnoreCase(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return input.regionMatches(true, pos, seq, 0, seq.length());
 *  */
    @Test
    public void testMatchesIgnoreCase_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matchesIgnoreCase(CharacterReader.java:151) */
        characterReader.matchesIgnoreCase(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesIgnoreCase(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return input.regionMatches(true, pos, seq, 0, seq.length());
 *  */
    @Test
    public void testMatchesIgnoreCase_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        String string = " ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matchesIgnoreCase(CharacterReader.java:151) */
        characterReader.matchesIgnoreCase(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.matchesAny
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesAny([C)
    
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
 * @utbot.iterates iterate the loop {@code for(char seek: seq)} once
 *  */
    @Test
    public void testMatchesAny_SeekNotEqualsC() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = " ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        char[] charArray = {'A'};
        
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
        String input = " ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        char[] charArray = {' '};
        
        boolean actual = characterReader.matchesAny(charArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAny(char[])}
 * @utbot.executesCondition {@code (isEmpty()): False}
 *  */
    @Test
    public void testMatchesAny_NotIsEmpty() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = " ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        char[] charArray = {};
        
        boolean actual = characterReader.matchesAny(charArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesAny([C)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAny(char[])}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: char c = input.charAt(pos);
 *  */
    @Test
    public void testMatchesAny_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "  ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesAny] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.CharacterReader.matchesAny(CharacterReader.java:158) */
        characterReader.matchesAny(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesAny(char[])}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = input.charAt(pos);
 *  */
    @Test
    public void testMatchesAny_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesAny] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matchesAny(CharacterReader.java:158) */
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
        String input = "  ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesAny] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matchesAny(CharacterReader.java:159) */
        characterReader.matchesAny(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeToEnd
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeToEnd()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return data;}
 *  */
    @Test
    public void testConsumeToEnd_StringLength() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "                                ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1);
        
        String actual = characterReader.consumeToEnd();
        
        String expected = "                              ";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(32, finalCharacterReaderPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeToEnd()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String data = input.substring(pos, input.length() - 1);
 *  */
    @Test
    public void testConsumeToEnd_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToEnd] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -1, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:99) */
        characterReader.consumeToEnd();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String data = input.substring(pos, input.length() - 1);
 *  */
    @Test
    public void testConsumeToEnd_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToEnd] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:99) */
        characterReader.consumeToEnd();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.containsIgnoreCase
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method containsIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#containsIgnoreCase(java.lang.String)}
 * @utbot.returnsFrom {@code return (input.indexOf(loScan, pos) > -1) || (input.indexOf(hiScan, pos) > -1);}
 *  */
    @Test
    public void testContainsIgnoreCase_ReturnInputIndexOfLessOrEqualNegative1OrInputIndexOfLessOrEqualNegative1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        String string = "@";
        
        boolean actual = characterReader.containsIgnoreCase(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#containsIgnoreCase(java.lang.String)}
 * @utbot.returnsFrom {@code return (input.indexOf(loScan, pos) > -1) || (input.indexOf(hiScan, pos) > -1);}
 *  */
    @Test
    public void testContainsIgnoreCase_ReturnInputIndexOfLessOrEqualNegative1OrInputIndexOfLessOrEqualNegative1_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        String string = "";
        
        boolean actual = characterReader.containsIgnoreCase(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method containsIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#containsIgnoreCase(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#toLowerCase()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String loScan = seq.toLowerCase();
 *  */
    @Test
    public void testContainsIgnoreCase_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.containsIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.containsIgnoreCase(CharacterReader.java:200) */
        characterReader.containsIgnoreCase(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method containsIgnoreCase(java.lang.String)
    
    @Test
    public void testContainsIgnoreCase1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "\u0000K";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        
        boolean actual = characterReader.containsIgnoreCase(input);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method containsIgnoreCase(java.lang.String)
    
    @Test
    public void testContainsIgnoreCase2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String string = "K@KK ";
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.containsIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.containsIgnoreCase(CharacterReader.java:202) */
        characterReader.containsIgnoreCase(string);
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
    /// invoke:
    ///     {@link java.lang.String#charAt(int)} once
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
        String input = ":";
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
        String input = "0";
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
        String input = "/";
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
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: char c = input.charAt(pos);
 *  */
    @Test
    public void testMatchesDigit_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "  ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesDigit] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.CharacterReader.matchesDigit(CharacterReader.java:176) */
        characterReader.matchesDigit();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchesDigit()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = input.charAt(pos);
 *  */
    @Test
    public void testMatchesDigit_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchesDigit] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matchesDigit(CharacterReader.java:176) */
        characterReader.matchesDigit();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.matchConsume
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchConsume(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchConsume(java.lang.String)}
 * @utbot.executesCondition {@code (matches(seq)): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMatchConsume_NotMatches() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = " ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        boolean actual = characterReader.matchConsume(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchConsume(java.lang.String)}
 * @utbot.executesCondition {@code (matches(seq)): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testMatchConsume_Matches() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        
        boolean actual = characterReader.matchConsume(input);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method matchConsume(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.CharacterReader}
     * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchConsume(java.lang.String)}
     */
    @Test
    public void testMatchConsumeThrowsNPE() {
        CharacterReader characterReader = new CharacterReader("XZ");
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchConsume] produces [java.lang.NullPointerException]
            java.base/java.lang.String.startsWith(String.java:2261)
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:147)
            org.jsoup.parser.CharacterReader.matchConsume(CharacterReader.java:181) */
        characterReader.matchConsume(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeToAny
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeToAny([C)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.executesCondition {@code (OUTER: while (!isEmpty()) {
 *     char c = input.charAt(pos);
 *     for (char seek : seq) {
 *         if (seek == c)
 *             break OUTER;
 *     }
 *     pos++;
 * }): False}
 * @utbot.executesCondition {@code (pos > start): False}
 * @utbot.returnsFrom {@code return pos > start ? input.substring(start, pos) : "";}
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
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} once
 * @utbot.returnsFrom {@code return pos > start ? input.substring(start, pos) : "";}
 *  */
    @Test
    public void testConsumeToAny_PosLessOrEqualStart() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = " ";
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
 * @utbot.executesCondition {@code (OUTER: while (!isEmpty()) {
 *     char c = input.charAt(pos);
 *     for (char seek : seq) {
 *         if (seek == c)
 *             break OUTER;
 *     }
 *     pos++;
 * }): False}
 * @utbot.executesCondition {@code (pos > start): True}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} once
 * @utbot.returnsFrom {@code return pos > start ? input.substring(start, pos) : "";}
 *  */
    @Test
    public void testConsumeToAny_PosGreaterThanStart() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = " ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        char[] charArray = {'_'};
        
        String actual = characterReader.consumeToAny(charArray);
        
        assertEquals(input, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(1, finalCharacterReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.executesCondition {@code (pos > start): False}
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} once
 * @utbot.returnsFrom {@code return pos > start ? input.substring(start, pos) : "";}
 *  */
    @Test
    public void testConsumeToAny_PosLessOrEqualStart_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = " ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        char[] charArray = {' '};
        
        String actual = characterReader.consumeToAny(charArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeToAny([C)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: char c = input.charAt(pos);
 *  */
    @Test
    public void testConsumeToAny_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "  ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAny] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:87) */
        characterReader.consumeToAny(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = input.charAt(pos);
 *  */
    @Test
    public void testConsumeToAny_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAny] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:87) */
        characterReader.consumeToAny(null);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(char seek: seq)
 *  */
    @Test
    public void testConsumeToAny_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = " ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeToAny] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:88) */
        characterReader.consumeToAny(null);
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
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeAsString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeAsString()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeAsString()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.returnsFrom {@code return input.substring(pos, pos++);}
 *  */
    @Test
    public void testConsumeAsString_StringSubstring() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        
        String actual = characterReader.consumeAsString();
        
        assertEquals(input, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(1, finalCharacterReaderPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeAsString()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeAsString()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return input.substring(pos, pos++);
 *  */
    @Test
    public void testConsumeAsString_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = " ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeAsString] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end -1, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.CharacterReader.consumeAsString(CharacterReader.java:58) */
        characterReader.consumeAsString();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeAsString()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return input.substring(pos, pos++);
 *  */
    @Test
    public void testConsumeAsString_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeAsString] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeAsString(CharacterReader.java:58) */
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
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeTo(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.executesCondition {@code (offset != -1): False}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.returnsFrom {@code return consumeToEnd();}
 *  */
    @Test
    public void testConsumeTo_OffsetEqualsNegative1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "  ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1);
        
        String actual = characterReader.consumeTo(input);
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(2, finalCharacterReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.executesCondition {@code (offset != -1): True}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return consumed;}
 *  */
    @Test
    public void testConsumeTo_OffsetNotEqualsNegative1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        
        String actual = characterReader.consumeTo(input);
        
        assertEquals(input, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeTo(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.executesCondition {@code (offset != -1): False}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return consumeToEnd();
 *  */
    @Test
    public void testConsumeTo_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = " ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 254);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.StringIndexOutOfBoundsException: begin 254, end 0, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:99)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:79) */
        characterReader.consumeTo(input);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.executesCondition {@code (offset != -1): True}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String consumed = input.substring(pos, offset);
 *  */
    @Test
    public void testConsumeTo_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.StringIndexOutOfBoundsException: begin 1, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:75) */
        characterReader.consumeTo(input);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int offset = input.indexOf(seq, pos);
 *  */
    @Test
    public void testConsumeTo_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:73) */
        characterReader.consumeTo(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeTo(char)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.executesCondition {@code (offset != -1): False}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.returnsFrom {@code return consumeToEnd();}
 *  */
    @Test
    public void testConsumeTo_OffsetEqualsNegative11() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "                                 `";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 32);
        
        String actual = characterReader.consumeTo('\u801F');
        
        String expected = " ";
        
        assertEquals(expected, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(34, finalCharacterReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.executesCondition {@code (offset != -1): True}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return consumed;}
 *  */
    @Test
    public void testConsumeTo_OffsetNotEqualsNegative11() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = " ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        
        String actual = characterReader.consumeTo(' ');
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeTo(char)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.executesCondition {@code (offset != -1): True}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String consumed = input.substring(pos, offset);
 *  */
    @Test
    public void testConsumeTo_ThrowStringIndexOutOfBoundsException1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = " ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end 0, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:64) */
        characterReader.consumeTo(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.executesCondition {@code (offset != -1): False}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#consumeToEnd()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return consumeToEnd();
 *  */
    @Test
    public void testConsumeTo_ThrowStringIndexOutOfBoundsException_11() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "`";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end 0, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:99)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:68) */
        characterReader.consumeTo('\u801F');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeTo(char)}
 * @utbot.invokes {@link java.lang.String#indexOf(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int offset = input.indexOf(c, pos);
 *  */
    @Test
    public void testConsumeTo_ThrowNullPointerException1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeTo] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:62) */
        characterReader.consumeTo(' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#toString()}
 * @utbot.invokes {@link java.lang.String#substring(int)}
 * @utbot.returnsFrom {@code return input.substring(pos);}
 *  */
    @Test
    public void testToString_StringSubstring() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        
        String actual = characterReader.toString();
        
        assertEquals(input, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#toString()}
 * @utbot.invokes {@link java.lang.String#substring(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return input.substring(pos);
 *  */
    @Test
    public void testToString_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = " ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.toString] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end 1, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            org.jsoup.parser.CharacterReader.toString(CharacterReader.java:207) */
        characterReader.toString();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#toString()}
 * @utbot.invokes {@link java.lang.String#substring(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return input.substring(pos);
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.toString] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.toString(CharacterReader.java:207) */
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
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String,int)}
 * @utbot.returnsFrom {@code return input.startsWith(seq, pos);}
 *  */
    @Test
    public void testMatches_StringStartsWith() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = " ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        boolean actual = characterReader.matches(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matches(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return input.startsWith(seq, pos);
 *  */
    @Test
    public void testMatches_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:147) */
        characterReader.matches(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method matches(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.CharacterReader}
     * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(java.lang.String)}
     */
    @Test
    public void testMatchesThrowsNPE() {
        CharacterReader characterReader = new CharacterReader("XZ");
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.NullPointerException]
            java.base/java.lang.String.startsWith(String.java:2261)
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:147) */
        characterReader.matches(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.matches
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matches(char)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(char)}
 * @utbot.returnsFrom {@code return !isEmpty() && input.charAt(pos) == c;}
 *  */
    @Test
    public void testMatches_NotIsEmptyAndInputCharAtNotEqualsC_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        boolean actual = characterReader.matches(' ');
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(char)}
 * @utbot.returnsFrom {@code return !isEmpty() && input.charAt(pos) == c;}
 *  */
    @Test
    public void testMatches_NotIsEmptyAndInputCharAtNotEqualsC() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = " ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        boolean actual = characterReader.matches('0');
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(char)}
 * @utbot.returnsFrom {@code return !isEmpty() && input.charAt(pos) == c;}
 *  */
    @Test
    public void testMatches_NotIsEmptyAndInputCharAtEqualsC() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = " ";
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
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return !isEmpty() && input.charAt(pos) == c;
 *  */
    @Test
    public void testMatches_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "  ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:142) */
        characterReader.matches(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matches(char)}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !isEmpty() && input.charAt(pos) == c;
 *  */
    @Test
    public void testMatches_ThrowNullPointerException1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matches] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matches(CharacterReader.java:142) */
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
 * @utbot.returnsFrom {@code return isEmpty() ? EOF : input.charAt(pos);}
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
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.returnsFrom {@code return isEmpty() ? EOF : input.charAt(pos);}
 *  */
    @Test
    public void testCurrent_NotIsEmpty() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = " ";
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
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: input.charAt(pos)
 *  */
    @Test
    public void testCurrent_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "  ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.current] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:32) */
        characterReader.current();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#current()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: input.charAt(pos)
 *  */
    @Test
    public void testCurrent_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.current] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:32) */
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
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.returnsFrom {@code return val;}
 *  */
    @Test
    public void testConsume_NotIsEmpty() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = " ";
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
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: input.charAt(pos)
 *  */
    @Test
    public void testConsume_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "  ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consume] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.CharacterReader.consume(CharacterReader.java:36) */
        characterReader.consume();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consume()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: input.charAt(pos)
 *  */
    @Test
    public void testConsume_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consume] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consume(CharacterReader.java:36) */
        characterReader.consume();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeLetterSequence
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method consumeLetterSequence()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link org.jsoup.parser.CharacterReader#isEmpty()} once,
    ///     {@link java.lang.String#charAt(int)} once,
    ///     {@link java.lang.String#substring(int,int)} once
    /// return from: {@code return input.substring(start, pos);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} once
 * @utbot.returnsFrom {@code return input.substring(start, pos);}
 *  */
    @Test
    public void testConsumeLetterSequence_CLessThanA() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "\u0000`\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1);
        
        String actual = characterReader.consumeLetterSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} once
 * @utbot.returnsFrom {@code return input.substring(start, pos);}
 *  */
    @Test
    public void testConsumeLetterSequence_CGreaterThanZ() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "{";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeLetterSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} once
 * @utbot.returnsFrom {@code return input.substring(start, pos);}
 *  */
    @Test
    public void testConsumeLetterSequence_CLessThanA_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "\u0000\u0000\u0000\u0000@\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 5);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 4);
        
        String actual = characterReader.consumeLetterSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method consumeLetterSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.returnsFrom {@code return input.substring(start, pos);}
 *  */
    @Test
    public void testConsumeLetterSequence_NotIsEmpty() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        
        String actual = characterReader.consumeLetterSequence();
        
        assertEquals(input, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeLetterSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return input.substring(start, pos);
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = " ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end -1, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:114) */
        characterReader.consumeLetterSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: char c = input.charAt(pos);
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "\u0000\u0000";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:107) */
        characterReader.consumeLetterSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} twice
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: char c = input.charAt(pos);
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowStringIndexOutOfBoundsException_2() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "k";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:107) */
        characterReader.consumeLetterSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return input.substring(start, pos);
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:114) */
        characterReader.consumeLetterSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeLetterSequence()}
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = input.charAt(pos);
 *  */
    @Test
    public void testConsumeLetterSequence_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeLetterSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:107) */
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
        CharacterReader characterReader = new CharacterReader("Ma");
        
        String actual = characterReader.consumeLetterSequence();
        
        String expected = "Ma";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.consumeDigitSequence
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeDigitSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} once
 * @utbot.returnsFrom {@code return input.substring(start, pos);}
 *  */
    @Test
    public void testConsumeDigitSequence_CGreaterThan9() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "\u0000\u0000\u0000\u0000:\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 5);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 4);
        
        String actual = characterReader.consumeDigitSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.returnsFrom {@code return input.substring(start, pos);}
 *  */
    @Test
    public void testConsumeDigitSequence_NotIsEmpty() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        
        String actual = characterReader.consumeDigitSequence();
        
        assertEquals(input, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} once
 * @utbot.returnsFrom {@code return input.substring(start, pos);}
 *  */
    @Test
    public void testConsumeDigitSequence_CLessOrEqual9() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "2";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeDigitSequence();
        
        assertEquals(input, actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(1, finalCharacterReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} once
 * @utbot.returnsFrom {@code return input.substring(start, pos);}
 *  */
    @Test
    public void testConsumeDigitSequence_CLessThan0() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "/";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        String actual = characterReader.consumeDigitSequence();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeDigitSequence()
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return input.substring(start, pos);
 *  */
    @Test
    public void testConsumeDigitSequence_ThrowStringIndexOutOfBoundsException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = " ";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -1);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeDigitSequence] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end -1, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:138) */
        characterReader.consumeDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: char c = input.charAt(pos);
 *  */
    @Test
    public void testConsumeDigitSequence_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "\u0000\u0000";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeDigitSequence] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:132) */
        characterReader.consumeDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return input.substring(start, pos);
 *  */
    @Test
    public void testConsumeDigitSequence_ThrowNullPointerException() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeDigitSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:138) */
        characterReader.consumeDigitSequence();
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#consumeDigitSequence()}
 * @utbot.iterates iterate the loop {@code while(!isEmpty())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = input.charAt(pos);
 *  */
    @Test
    public void testConsumeDigitSequence_ThrowNullPointerException_1() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 255);
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.consumeDigitSequence] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.consumeDigitSequence(CharacterReader.java:132) */
        characterReader.consumeDigitSequence();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchConsumeIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchConsumeIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (matchesIgnoreCase(seq)): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMatchConsumeIgnoreCase_NotMatchesIgnoreCase() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1);
        
        boolean actual = characterReader.matchConsumeIgnoreCase(input);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharacterReader}
 * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchConsumeIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (matchesIgnoreCase(seq)): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testMatchConsumeIgnoreCase_MatchesIgnoreCase() throws Exception  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "[";
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        
        boolean actual = characterReader.matchConsumeIgnoreCase(input);
        
        assertTrue(actual);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(1, finalCharacterReaderPos);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method matchConsumeIgnoreCase(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.CharacterReader}
     * @utbot.methodUnderTest {@link org.jsoup.parser.CharacterReader#matchConsumeIgnoreCase(java.lang.String)}
     */
    @Test
    public void testMatchConsumeIgnoreCaseThrowsNPE() {
        CharacterReader characterReader = new CharacterReader("XZ");
        
        /* This test fails because method [org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matchesIgnoreCase(CharacterReader.java:151)
            org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase(CharacterReader.java:190) */
        characterReader.matchConsumeIgnoreCase(null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields994907560804200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields994907560804200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass994907560810700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields994907560804200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass994907560810700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields994907562195800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields994907562195800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass994907562197500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields994907562195800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass994907562197500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

